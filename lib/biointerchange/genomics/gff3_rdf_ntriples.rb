require 'rdf'
require 'rdf/ntriples'
require 'date'

module BioInterchange::Genomics

# Serializes GFF3 and GVF models.
#
# Inputs:
# - biointerchange.gff3
# - biointerchange.gvf
#
# Outputs:
# - rdf.biointerchange.gfvo
class RDFWriter < BioInterchange::Writer

  # Register writers:
  BioInterchange::Registry.register_writer(
    'rdf.biointerchange.gfvo',
    BioInterchange::Genomics::RDFWriter,
    [ 'biointerchange.gff3' ],
    true,
    'Genomic Feature and Variation Ontology (GFVO) based RDFization'
  )
  BioInterchange::Registry.register_writer(
    'rdf.biointerchange.gfvo',
    BioInterchange::Genomics::RDFWriter,
    [ 'biointerchange.gvf' ],
    true,
    'Genomic Feature and Variation Ontology (GFVO) based RDFization'
  )
  BioInterchange::Registry.register_writer(
    'rdf.biointerchange.gfvo',
    BioInterchange::Genomics::RDFWriter,
    [ 'biointerchange.vcf' ],
    true,
    'Genomic Feature and Variation Ontology (GFVO) based RDFization'
  )

  # Creates a new instance of a RDFWriter that will use the provided output stream to serialize RDF.
  #
  # +ostream+:: instance of an IO class or derivative that is used for RDF serialization
  def initialize(ostream)
    super(ostream)
  end

  # Serialize a model as RDF.
  #
  # +model+:: a generic representation of input data that is derived from BioInterchange::Genomics::GFF3FeatureSet
  # +uri_prefix+:: optional URI prefix that replaces the default URI prefix for all set/feature/annotation URIs
  def serialize(model, uri_prefix = nil)
    if model.instance_of?(BioInterchange::Genomics::GFF3FeatureSet) then
      @format = :gff3
    elsif model.instance_of?(BioInterchange::Genomics::GVFFeatureSet) then
      @format = :gvf
    elsif model.instance_of?(BioInterchange::Genomics::VCFFeatureSet) then
      @format = :vcf
    else
      raise BioInterchange::Exceptions::ImplementationWriterError, 'The provided model cannot be serialized. ' +
                           'This writer supports serialization for BioInterchange::Genomics::GFF3FeatureSet, ' +
                           'BioInterchange::Genomics::GVFFeatureSet and BioInterchange::Genomics::VCFFeatureSet.'
    end
    @base = BioInterchange::GFVO
    serialize_model(model, uri_prefix)
  end

protected

  # Serializes RDF for a feature set representation.
  #
  # +model+:: an instance of +BioInterchange::Genomics::GFF3FeatureSet+
  # +set_uri+:: optional URI prefix that should be used for a set instance (and hence, all its dependents -- features, annotations, etc.)
  def serialize_model(model, set_uri)
    # We record landmarks, because they can either be written when their "##sequence-region"
    # pragma statement appears, or otherwise, when the first feature with said landmark is
    # being serialized.
    @landmarks = {}

    # Record written variants in order to avoid writing out RDF.type multiple times.
    @variants = {}

    # Create a URI prefix that applies to the set, all features in the set, and all the features' annotations.
    # Then register the prefix with the writer to have a concise Turtle output.
    set_uri = set_uri[0..-2] if set_uri and set_uri.end_with?('/')
    set_uri = RDF::URI.new(model.uri) unless set_uri
    set_base(set_uri + '/')

    add_prefix('http://biohackathon.org/resource/faldo#', 'faldo')
    add_prefix('http://www.biointerchange.org/gfvo#', 'gfvo')
    add_prefix('http://semanticscience.org/resource/', 'sio')

    create_triple(set_uri, RDF.type, @base.Set)
    model.pragmas.each { |pragma_name|
      serialize_pragma(set_uri, model.pragma(pragma_name))
    }
    model.contents.each { |feature|
      if feature.instance_of?(BioInterchange::Genomics::GFF3FeatureSequence) then
        serialize_feature_sequence(set_uri, feature)
      else
        serialize_feature(set_uri, feature)
      end
    }
    close
    #RDF::NTriples::Writer.dump(graph, @ostream)
    # TODO Figure out why the following is very slow. Use with 'rdf-raptor'.
    #      Having said that, Jena's rdfcat is very good for converting formats
    #      anyway, so perhaps it is not worth investigating the following.
    # RDF::RDFXML::Writer.dump(graph, @ostream)
  end

  # Serializes pragmas for a given feature set URI.
  #
  # +set_uri+:: the feature set URI to which the pragmas belong to
  # +pragma+:: an object representing a pragma statement
  def serialize_pragma(set_uri, pragma)
    if pragma.kind_of?(Hash) then
      if (pragma.has_key?('attribute-method') or pragma.has_key?('data-source') or pragma.has_key?('score-method') or pragma.has_key?('source-method') or pragma.has_key?('technology-platform')) then
        serialize_structured_attribute(set_uri, pragma)
      elsif pragma.has_key?('gff-version') then
        create_triple(set_uri, @base.gff_version, pragma['gff-version'], RDF::XSD.float)
      elsif pragma.has_key?('gvf-version') then
        create_triple(set_uri, @base.gvf_version, pragma['gvf-version'], RDF::XSD.float)
      elsif pragma.has_key?('fileformat') then
        create_triple(set_uri, @base.vcf_version, pragma['fileformat'], RDF::XSD.float)
      elsif pragma.has_key?('sequence-region') then
        pragma['sequence-region'].keys.each { |seqid|
          serialize_landmark(set_uri, pragma['sequence-region'][seqid])
        }
      elsif pragma.has_key?('species') then
        create_triple(set_uri, @base.species, RDF::URI.new(pragma['species']))
      end
    else
      # TODO
    end
  end

  # Serializes a +GFF3Feature+ object for a given feature set URI.
  #
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature+:: a +GFF3Feature+ instance
  def serialize_feature(set_uri, feature)
    # TODO Make sure there is only one value in the 'ID' list.
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.sequence_id},#{feature.source},#{feature.type.to_s.sub(/^[^:]+:\/\//, '')},#{feature.start_coordinate},#{feature.end_coordinate},#{feature.strand},#{feature.phase}") unless feature.attributes.has_key?('ID')
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.attributes['ID'][0]}") if feature.attributes.has_key?('ID')
    create_triple(set_uri, @base.contains, feature_uri)
    create_triple(feature_uri, RDF.type, @base.Feature)
    serialize_landmark(set_uri, GFF3Landmark.new(feature.sequence_id)) unless @landmarks.has_key?(feature.sequence_id)
    create_triple(feature_uri, @base.seqid, @landmarks[feature.sequence_id])
    create_triple(feature_uri, @base.source, feature.source)
    create_triple(feature_uri, @base.type, feature.type)
    create_triple(feature_uri, @base.phase, feature.phase) if feature.phase

    serialize_coordinate(set_uri, feature_uri, feature)
    serialize_attributes(set_uri, feature_uri, feature.attributes) unless feature.attributes.keys.empty?
  end

  def serialize_coordinate(set_uri, feature_uri, feature)
    region_uri = RDF::URI.new("#{feature_uri.to_s}/region")
    start_position_uri = RDF::URI.new("#{feature_uri.to_s}/region/start")
    end_position_uri = RDF::URI.new("#{feature_uri.to_s}/region/end")
    #feature_object_properties = @base.feature_properties.select { |uri| @base.is_object_property?(uri) }[0]
    ##graph.insert(RDF::Statement.new(feature_uri, @base.with_parent([ @base.region ].flatten, feature_object_properties), region_uri))
    create_triple(feature_uri, @base.locus, region_uri)
    create_triple(region_uri, RDF.type, BioInterchange::FALDO.Region)
    # BIN STUFF
    if false then
      bin_uri = RDF::URI.new("bin://#{feature.sequence_id}/#{BioInterchange::Genomics::Locations.reg2bin(feature.start_coordinate, feature.end_coordinate)}")
      create_triple(bin_uri, RDF::URI.new('bin://contains'), feature_uri)
    end
    create_triple(region_uri, BioInterchange::FALDO.begin, start_position_uri)
    create_triple(region_uri, BioInterchange::FALDO.end, end_position_uri)
    case feature.strand
    when BioInterchange::Genomics::GFF3Feature::NOT_STRANDED
      create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Position)
      create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Position)
    when BioInterchange::Genomics::GFF3Feature::UNKNOWN
      create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Position)
      create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Position)
    when BioInterchange::Genomics::GFF3Feature::POSITIVE
      create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Positive_strand)
      create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Positive_strand)
    when BioInterchange::Genomics::GFF3Feature::NEGATIVE
      create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Negative_strand)
      create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Negative_strand)
    else
      raise BioInterchange::Exceptions::InputFormatError, 'Strand of feature is set to an unknown constant.'
    end
    create_triple(start_position_uri, BioInterchange::FALDO.position, feature.start_coordinate)
    create_triple(end_position_uri, BioInterchange::FALDO.position, feature.end_coordinate)
    create_triple(feature_uri, @base.score, feature.score) if feature.score
  end

  # Serializes a genomic feature landmark ("seqid").
  #
  # +set_uri+:: the feature set URI to which the landmark belongs to
  # +landmark+:: encapsuled landmark data
  def serialize_landmark(set_uri, landmark)
    return if @landmarks.has_key?(landmark.seqid)
    landmark_uri = RDF::URI.new("#{set_uri.to_s}/landmark/#{landmark.seqid}")
    region_uri = RDF::URI.new("#{landmark_uri.to_s}/region")
    @landmarks[landmark.seqid] = landmark_uri
    create_triple(landmark_uri, RDF.type, @base.Landmark)
    create_triple(landmark_uri, @base.id, landmark.seqid)
    create_triple(landmark_uri, @base.locus, region_uri)
    if landmark.start_coordinate then
      start_position_uri = RDF::URI.new("#{landmark_uri.to_s}/region/start")
      create_triple(region_uri, BioInterchange::FALDO.begin, start_position_uri)
      create_triple(start_position_uri, BioInterchange::FALDO.position, landmark.start_coordinate)
    end
    if landmark.start_coordinate then
      end_position_uri = RDF::URI.new("#{landmark_uri.to_s}/region/end")
      create_triple(region_uri, BioInterchange::FALDO.end, end_position_uri)
      create_triple(end_position_uri, BioInterchange::FALDO.position, landmark.end_coordinate)
    end
  end

  # Serializes the attributes of a feature.
  #
  # +set_uri+:: URI of the set these attributes belong to (implicit due to feature)
  # +feature_uri+:: the feature URI to which the attributes belong to
  # +attribtues+:: a map of tag/value pairs
  def serialize_attributes(set_uri, feature_uri, attributes)
    attributes.each_pair { |tag, list|
      # Check for defined tags (in alphabetical order), if not matched, serialize as generic Attribute:
      if tag == 'Alias' then
        list.each { |value|
          create_triple(feature_uri, @base.alias, value)
        }
      elsif tag == 'Dbxref' then
        list.each { |value|
          begin
            linkout = nil
            # First: determine the Dbxref linkout URI as string
            if value.match(/^dbSNP(_\d+)?:rs\d+$/) then
              linkout = "http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=#{value.split(/:/)[1].sub(/^rs/, '')}"
            elsif value.match(/^COSMIC(_\d+)?:COSM\d+$/) then
              linkout = "http://cancer.sanger.ac.uk/cosmic/mutation/overview?id=#{value.split(/:/)[1].sub(/^COSM/, '')}"
            else
              abbreviation, id = value.split(':', 2)
              linkout = BioInterchange::GOXRef.send(BioInterchange.make_safe_label(abbreviation)).to_s + id
            end
            # Second, and finally: add a triple to the graph in the right representative format depending on the ontology used
            create_triple(feature_uri, @base.dbxref, linkout)
          rescue NoMethodError
            # Preserve the Dbxref as a Literal:
            @dbxref = 0 if @dbxref == nil
            literal_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/dbxref/#{@dbxref}")
            @dbxref += 1
            create_triple(feature_uri, @base.dbxref, literal_uri)
            create_triple(literal_uri, RDF.type, RDF::RDFS.Literal)
            create_triple(literal_uri, RDF.value, value)
          end
        }
      elsif tag == 'Derives_from' then
        list.each { |value|
          create_triple(feature_uri, @base.derivesFrom, RDF::URI.new("#{set_uri.to_s}/feature/#{value}"))
        }
      elsif tag == 'Gap' then
        # Handled by 'Target', because 'Gap' requires 'Target' to be present.
      elsif tag == 'ID' then
        list.each { |value|
          create_triple(feature_uri, @base.id, value)
        }
      elsif tag == 'Is_circular' then
        value = list.join(',')
        if value == 'true' then
          create_triple(feature_uri, @base.isCircular, true) if value == 'true'
        elsif value == 'false' then
          create_triple(feature_uri, @base.isCircular, false) if value == 'false'
        else
          create_triple(feature_uri, RDF::RDFS.comment, "Is_circular non-truth value: #{value}")
        end
      elsif tag == 'Name' then
        list.each { |value|
          create_triple(feature_uri, @base.name, value)
        }
      elsif tag == 'Note' then
        list.each { |value|
          create_triple(feature_uri, RDF::RDFS.comment, value)
        }
      elsif tag == 'Ontology_term' then
        list.each { |value|
          # TODO Sanitize values that are either not in GO xrf_abbs or need conversion to match
          #      match their associated Ruby method.
          namespace, accession = value.split(/:/, 2)
          create_triple(feature_uri, @base.ontology_term, "#{BioInterchange::GOXRef.send(namespace).to_s}#{accession}")
        }
      elsif tag == 'Parent' then
        list.each { |parent_id|
          create_triple(feature_uri, @base.parent, RDF::URI.new("#{set_uri.to_s}/feature/#{parent_id}"))
        }
      elsif tag == 'Reference_seq' then
        list.each { |value|
          reference_uri = RDF::URI.new("#{feature_uri.to_s}/reference/#{value}")
          create_triple(feature_uri, @base.sequence_annotation, reference_uri)
          create_triple(reference_uri, RDF.type, @base.Reference)
          create_triple(reference_uri, @base.sequence, value)
        }
      elsif tag == 'Target' then
        target_id, start_coordinate, end_coordinate, strand = list.join(',').split(/\s+/, 4)
        target_uri = RDF::URI.new("#{feature_uri.to_s}/target/#{target_id}")
        create_triple(feature_uri, @base.target, target_uri)
        create_triple(target_uri, RDF.type, @base.Target)
        create_triple(target_uri, @base.id, target_id)
        region_uri = RDF::URI.new("#{target_uri.to_s}/region")
        start_position_uri = RDF::URI.new("#{region_uri.to_s}/start")
        end_position_uri = RDF::URI.new("#{region_uri.to_s}/end")
        create_triple(target_uri, @base.locus, region_uri)
        create_triple(region_uri, @base.locus, start_position_uri)
        create_triple(region_uri, @base.locus, end_position_uri)
        if strand == '+' then
          create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Positive_strand)
          create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Positive_strand)
          create_triple(start_position_uri, BioInterchange::FALDO.position, start_coordinate)
          create_triple(end_position_uri, BioInterchange::FALDO.position, end_coordinate)
        elsif strand == '-' then
          create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Negative_strand)
          create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Negative_strand)
          # Reverse start/end coordinates on the negative strand; FALDO requirement:
          create_triple(start_position_uri, BioInterchange::FALDO.position, end_coordinate)
          create_triple(end_position_uri, BioInterchange::FALDO.position, start_coordinate)
        else
          create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Position)
          create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Position)
          create_triple(start_position_uri, BioInterchange::FALDO.position, start_coordinate)
          create_triple(end_position_uri, BioInterchange::FALDO.position, end_coordinate)
        end

        # Describe a possible alignment between the feature and target:
        if attributes.has_key?('Gap') then
          attributes['Gap'].each_index { |gap_no|
            cigar_line = attributes['Gap'][gap_no].split(/\s+/)
            cigar_line.each_index { |alignment_no|
              alignment_uri = RDF::URI.new("#{feature_uri.to_s}/alignment/#{gap_no}/#{alignment_no}")
              create_triple(feature_uri, @base.alignment, alignment_uri) if alignment_no == 0
              operation = cigar_line[alignment_no].gsub(/[^MIDFR]/, '')
              operation = nil unless operation.length == 1
              span = cigar_line[alignment_no].gsub(/[^0-9]/, '')
              span = nil unless span.length > 0
              if operation == 'M' then
                create_triple(alignment_uri, RDF.type, @base.Match)
              elsif operation == 'I' then
                create_triple(alignment_uri, RDF.type, @base.Reference_Sequence_Gap)
              elsif operation == 'D' then
                create_triple(alignment_uri, RDF.type, @base.Target_Sequence_Gap)
              elsif operation == 'F' then
                create_triple(alignment_uri, RDF.type, @base.Forward_Reference_Sequence_Frameshift)
              elsif operation == 'R' then
                create_triple(alignment_uri, RDF.type, @base.Reverse_Reference_Sequence_Frameshift)
              else
                # Fallback: operation is outside of the specification
                create_triple(alignment_uri, RDF.type, @base.Alignment_Operation)
                create_triple(alignment_uri, RDF::RDFS.comment, "Alignment operation: #{operation}") if operation and not operation.empty?
              end
              create_triple(alignment_uri, @base.span, span.to_i) if span
              create_triple(alignment_uri, RDF.first, alignment_uri)
              if alignment_no + 1 < cigar_line.length then
                create_triple(alignment_uri, RDF.rest, RDF::URI.new("#{feature_uri.to_s}/alignment/#{gap_no}/#{alignment_no + 1}"))
              else
                create_triple(alignment_uri, RDF.rest, RDF.nil)
              end
            }
          }
        end
      elsif tag == 'Variant_effect' then
        serialize_variant_effects(set_uri, feature_uri, list)
      elsif tag == 'Variant_seq' then
        serialize_variant_seqs(set_uri, feature_uri, list)
      else
        # TODO Report unknown upper case letters here? That would be a spec. validation...
        #      Well, or it would show that this implementation is incomplete. Could be either.
        list.each_index { |index|
          value = list[index]
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}") if list.size == 1
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}-#{index + 1}") unless list.size == 1
          create_triple(feature_uri, @base.attribute, attribute_uri)
          create_triple(attribute_uri, RDF.type, @base.Attribute)
          create_triple(attribute_uri, @base.tag, "#{tag}")
          create_triple(attribute_uri, RDF.value, value)
        }
      end
    }
  end

  # Serializes a structured attribute (given as a pragma statement), which later
  # can be referred to from feature instances.
  #
  # +set_uri+:: the feature set URI to which the structured attribute belongs to
  # +pragma+:: a map that encapsulates the structured attribute data
  def serialize_structured_attribute(set_uri, pragma)
    attribute_uri = RDF::URI.new("#{set_uri.to_s}/structured_attribute/#{pragma.object_id}")
    attributes = nil
    class_type = nil
    if pragma.has_key?('attribute-method') then
      attributes = pragma['attribute-method'][0]
      class_type = @base.Method
    elsif pragma.has_key?('data-source') then
      attributes = pragma['data-source'][0]
      class_type = @base.DataSource
    elsif pragma.has_key?('score-method') then
      attributes = pragma['score-method'][0]
      class_type = @base.Method
    elsif pragma.has_key?('source-method') then
      attributes = pragma['source-method'][0]
      class_type = @base.Method
    elsif pragma.has_key?('technology-platform') then
      attributes = pragma['technology-platform'][0]
      class_type = @base.TechnologyPlatform
    else
      # TODO Error.
    end
    if class_type == @base.DataSource and attributes.has_key?('Data_type') then
      attributes['Data_type'] = attributes['Data_type'][0] # TODO Make sure array is of length 1.
      if attributes['Data_type'] == 'Array_CGH' then
        class_type = @base.ArrayComparativeGenomicHybridization
      elsif attributes['Data_type'] == 'DNA_microarray' then
        class_type = @base.DNAMicroarray
      elsif attributes['Data_type'] == 'DNA_sequence' then
        class_type = @base.DNASequence
      elsif attributes['Data_type'] == 'RNA_sequence' then
        class_type = @base.RNASequence
      else
        # TODO Error.
      end
    elsif class_type == @base.TechnologyPlatform then
      if attributes.has_key?('Average_coverage') then
        create_triple(attribute_uri, @base.averageCoverage, attributes['Average_coverage'][0].to_i)
      end
      if attributes.has_key?('Platform_class') then
        create_triple(attribute_uri, @base.platformClass, attributes['Platform_class'][0])
      end
      if attributes.has_key?('Platform_name') then
        create_triple(attribute_uri, @base.platformName, attributes['Platform_name'][0])
      end
      if attributes.has_key?('Read_length') then
        create_triple(attribute_uri, @base.readLength, attributes['Read_length'][0].to_i)
      end
      if attributes.has_key?('Read_pair_span') then
        create_triple(attribute_uri, @base.readPairSpan, attributes['Read_pair_span'][0].to_i)
      end
      if attributes.has_key?('Read_type') then
        attributes['Read_type'] = attributes['Read_type'][0] # TODO Make sure array is of length 1.
        if attributes['Read_type'] == 'fragment' then
          class_type = @base.FragmentReadPlatform
        elsif attributes['Read_type'] == 'pair' then
          class_type = @base.PairedEndReadPlatform
        else
          # TODO Error.
        end
      end
    end
    create_triple(attribute_uri, RDF.type, class_type)
    attributes.keys.each { |tag|
      if tag.match(/^[a-z]/) then
        custom_attribute_uri = RDF::URI.new("#{attribute_uri.to_s}/attribute/#{tag}")
        create_triple(custom_attribute_uri, RDF.type, @base.StructuredAttribute)
        create_triple(custom_attribute_uri, @base.tag, tag)
        attributes[tag].each { |value|
          create_triple(custom_attribute_uri, RDF.value, value)
        }
        create_triple(attribute_uri, @base.attribute, custom_attribute_uri)
      else
        # TODO
      end
    }
  end

  # Serializes a list of variant effects.
  #
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +list+:: list of variant values
  def serialize_variant_effects(set_uri, feature_uri, list)
    list.each_index { |index|
      effect = list[index]
      sequence_variant, variant_index, feature_type, feature_ids = effect.split(' ', 4)
      feature_ids = feature_ids.split(' ')
      effect_uri = RDF::URI.new("#{feature_uri.to_s}/variant/#{variant_index}/effect/#{index}")
      serialize_variant_triple(feature_uri, RDF::URI.new("#{feature_uri.to_s}/variant/#{variant_index}"), @base.effect, effect_uri)
      create_triple(effect_uri, RDF.type, @base.Effect)
      create_triple(effect_uri, @base.sequenceVariant, BioInterchange::SO.send(BioInterchange.make_safe_label(sequence_variant)))
      create_triple(effect_uri, @base.featureType, BioInterchange::SO.send(BioInterchange.make_safe_label(feature_type)))
      feature_ids.each { |feature_id|
        create_triple(effect_uri, @base.feature, feature_id)
      }
    }
  end

  # Serializes a list of variant sequences.
  #
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +list+:: list of variant values
  def serialize_variant_seqs(set_uri, feature_uri, list)
    list.each_index { |index|
      value = list[index]
      variant_uri = RDF::URI.new("#{feature_uri.to_s}/variant/#{index}")
      serialize_variant_triple(feature_uri, variant_uri, @base.sequence, RDF::Literal.new(value))
    }

    # Return the variant type based on the present sequence(s):
    return @base.Variant if list.length != 2
    if list[0].match(/a-zA-Z/) and list[1].match(/a-zA-Z/) then
      return @base.HomozygousVariant if list[0] == list[1]
      return @base.HeterozygousVariant
    end
    return @base.Variant
  end

  # Adds a variant to the graph; tracks the variant's URI that RDF.type is only written out once.
  #
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +variant_uri+:: URI that identifies the feature in question ("subject", if you like)
  # +predicate+:: predicate that describes the data being serialized
  # +object+:: data to be serialized
  def serialize_variant_triple(feature_uri, variant_uri, predicate, object)
    unless @variants.has_key?(variant_uri.to_s) then
      create_triple(feature_uri, @base.sequence_annotation, variant_uri)
      create_triple(variant_uri, RDF.type, @base.Variant)
    end
    @variants[variant_uri.to_s] = true
    create_triple(variant_uri, predicate, object)
  end

  # Serializes a +GFF3FeatureSequence+ object that contains the sequence for a feature object.
  #
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature_sequence+:: a +GFF3FeatureSequence+ instance
  def serialize_feature_sequence(set_uri, feature_sequence)
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature_sequence.feature_id}")
    annotation_uri = RDF::URI.new("#{feature_uri.to_s}/sequence")
    create_triple(feature_uri, @base.sequence_annotation, annotation_uri)
    create_triple(annotation_uri, RDF.type, @base.Sequence_Annotation)
    create_triple(annotation_uri, RDF::RDFS.comment, feature_sequence.comment) if feature_sequence.comment
    create_triple(annotation_uri, @base.sequence, feature_sequence.sequence)
  end

end

end

