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

  # Creates a new instance of a RDFWriter that will use the provided output stream to serialize RDF.
  #
  # +ostream+:: instance of an IO class or derivative that is used for RDF serialization
  def initialize(ostream)
    raise BioInterchange::Exceptions::ImplementationWriterError, 'The output stream is not an instance of IO or its subclasses.' unless ostream.kind_of?(IO)
    @ostream = ostream
  end

  # Serialize a model as RDF.
  #
  # +model+:: a generic representation of input data that is derived from BioInterchange::Genomics::GFF3FeatureSet
  def serialize(model)
    if model.instance_of?(BioInterchange::Genomics::GFF3FeatureSet) then
      @format = :gff3
    elsif model.instance_of?(BioInterchange::Genomics::GVFFeatureSet) then
      @format = :gvf
    else
      raise BioInterchange::Exceptions::ImplementationWriterError, 'The provided model cannot be serialized. ' +
                           'This writer supports serialization for BioInterchange::Genomics::GFF3FeatureSet and '
                           'BioInterchange::Genomics::GVFFeatureSet.'
    end
    @base = BioInterchange::GFVO
    serialize_model(model)
  end

protected

  # Serializes RDF for a feature set representation.
  #
  # +model+:: an instance of +BioInterchange::Genomics::GFF3FeatureSet+
  def serialize_model(model)
    # We record landmarks, because they can either be written when their "##sequence-region"
    # pragma statement appears, or otherwise, when the first feature with said landmark is
    # being serialized.
    @landmarks = {}

    # Record written variants in order to avoid writing out RDF.type multiple times.
    @variants = {}

    graph = RDF::Graph.new
    graph.fast_ostream(@ostream) if BioInterchange::skip_rdf_graph

    # Create a URI prefix that applies to the set, all features in the set, and all the features' annotations.
    # Then register the prefix with the writer to have a concise Turtle output.
    set_uri = RDF::URI.new(model.uri)
    set_base(set_uri + '/')

    create_triple(set_uri, RDF.type, @base.Set)
    model.pragmas.each { |pragma_name|
      serialize_pragma(graph, set_uri, model.pragma(pragma_name))
    }
    model.contents.each { |feature|
      serialize_feature(graph, set_uri, feature)
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
  # +graph+:: RDF graph to which the pragmas are added
  # +set_uri+:: the feature set URI to which the pragmas belong to
  # +pragma+:: an object representing a pragma statement
  def serialize_pragma(graph, set_uri, pragma)
    if pragma.kind_of?(Hash) then
      if (pragma.has_key?('attribute-method') or pragma.has_key?('data-source') or pragma.has_key?('score-method') or pragma.has_key?('source-method') or pragma.has_key?('technology-platform')) then
        serialize_structured_attribute(graph, set_uri, pragma)
      elsif pragma.has_key?('gff-version') then
        create_triple(set_uri, @base.gff_version, pragma['gff-version'], RDF::XSD.float)
      elsif pragma.has_key?('gvf-version') then
        create_triple(set_uri, @base.gvf_version, pragma['gvf-version'], RDF::XSD.float)
      elsif pragma.has_key?('sequence-region') then
        pragma['sequence-region'].keys.each { |seqid|
          serialize_landmark(graph, set_uri, pragma['sequence-region'][seqid])
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
  # +graph+:: RDF graph to which the feature is added
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature+:: a +GFF3Feature+ instance
  def serialize_feature(graph, set_uri, feature)
    # TODO Make sure there is only one value in the 'ID' list.
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.sequence_id},#{feature.source},#{feature.type.to_s.sub(/^[^:]+:\/\//, '')},#{feature.start_coordinate},#{feature.end_coordinate},#{feature.strand},#{feature.phase}") unless feature.attributes.has_key?('ID')
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.attributes['ID'][0]}") if feature.attributes.has_key?('ID')
    create_triple(set_uri, @base.contains, feature_uri)
    create_triple(feature_uri, RDF.type, @base.Feature)
    serialize_landmark(graph, set_uri, GFF3Landmark.new(feature.sequence_id)) unless @landmarks.has_key?(feature.sequence_id)
    create_triple(feature_uri, @base.seqid, @landmarks[feature.sequence_id])
    create_triple(feature_uri, @base.source, feature.source)
    create_triple(feature_uri, @base.type, feature.type)
    create_triple(feature_uri, @base.phase, feature.phase) if feature.phase

    serialize_coordinate(graph, set_uri, feature_uri, feature)
    serialize_attributes(graph, set_uri, feature_uri, feature.attributes) unless feature.attributes.keys.empty?
  end

  def serialize_coordinate(graph, set_uri, feature_uri, feature)
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
  # +graph+:: RDF graph to which the landmark is added
  # +set_uri+:: the feature set URI to which the landmark belongs to
  # +landmark+:: encapsuled landmark data
  def serialize_landmark(graph, set_uri, landmark)
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
  # +graph+:: RDF graph to which the feature is added
  # +set_uri+:: URI of the set these attributes belong to (implicit due to feature)
  # +feature_uri+:: the feature URI to which the attributes belong to
  # +attribtues+:: a map of tag/value pairs
  def serialize_attributes(graph, set_uri, feature_uri, attributes)
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
            raise BioInterchange::Exceptions::InputFormatError, 'Attribute Dbxref link-out is not resolvable, i.e. the name cannot be turned into an URL.'
          end
        }
      elsif tag == 'Derives_from' then
        list.each { |value|
          create_triple(feature_uri, @base.derivesFrom, RDF::URI.new("#{set_uri.to_s}/feature/#{value}"))
        }
      elsif tag == 'Gap' then
        # TODO
        # graph.insert(RDF::Statement.new(feature_uri, @base.gap, RDF::Literal.new(list.join(','))))
        # create_triple(feature_uri, @base.gap, ...)
      elsif tag == 'ID' then
        list.each { |value|
          create_triple(feature_uri, @base.id, value)
        }
      elsif tag == 'Is_circular' then
        value = list.join(',')
        create_triple(feature_uri, @base.isCircular, true) if value == 'true'
        create_triple(feature_uri, @base.isCircular, false) if value == 'false'
        # TODO Report invalid value.
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
        target_datatype_properties = @base.target_properties.select { |uri| @base.is_datatype_property?(uri) }[0]
        target_object_properties = @base.target_properties.select { |uri| @base.is_object_property?(uri) }[0]
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
        elsif strand == '-' then
          create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Negative_strand)
          create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Negative_strand)
        else
          create_triple(start_position_uri, RDF.type, BioInterchange::FALDO.Position)
          create_triple(end_position_uri, RDF.type, BioInterchange::FALDO.Position)
        end
        create_triple(start_position_uri, BioInterchange::FALDO.start, start_coordinate)
        create_triple(end_position_uri, BioInterchange::FALDO.end, end_coordinate)
      elsif tag == 'Variant_effect' then
        serialize_variant_effects(graph, set_uri, feature_uri, list)
      elsif tag == 'Variant_seq' then
        serialize_variant_seqs(graph, set_uri, feature_uri, list)
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
  # +graph+:: RDF graph to which the structured attribute is added
  # +set_uri+:: the feature set URI to which the structured attribute belongs to
  # +pragma+:: a map that encapsulates the structured attribute data
  def serialize_structured_attribute(graph, set_uri, pragma)
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
  # +graph+:: RDF graph to which the structured attribute is added
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +list+:: list of variant values
  def serialize_variant_effects(graph, set_uri, feature_uri, list)
    list.each_index { |index|
      effect = list[index]
      sequence_variant, variant_index, feature_type, feature_ids = effect.split(' ', 4)
      feature_ids = feature_ids.split(' ')
      effect_uri = RDF::URI.new("#{feature_uri.to_s}/variant/#{variant_index}/effect/#{index}")
      serialize_variant_triple(graph, feature_uri, RDF::URI.new("#{feature_uri.to_s}/variant/#{variant_index}"), @base.effect, effect_uri)
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
  # +graph+:: RDF graph to which the structured attribute is added
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +list+:: list of variant values
  def serialize_variant_seqs(graph, set_uri, feature_uri, list)
    list.each_index { |index|
      value = list[index]
      variant_uri = RDF::URI.new("#{feature_uri.to_s}/variant/#{index}")
      serialize_variant_triple(graph, feature_uri, variant_uri, @base.sequence, RDF::Literal.new(value))
    }
  end

  # Adds a variant to the graph; tracks the variant's URI that RDF.type is only written out once.
  #
  # +graph+:: RDF graph to which the variant is added
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +variant_uri+:: URI that identifies the feature in question ("subject", if you like)
  # +predicate+:: predicate that describes the data being serialized
  # +object+:: data to be serialized
  def serialize_variant_triple(graph, feature_uri, variant_uri, predicate, object)
    unless @variants.has_key?(variant_uri.to_s) then
      create_triple(feature_uri, @base.sequence_annotation, variant_uri)
      create_triple(variant_uri, RDF.type, @base.Variant)
    end
    @variants[variant_uri.to_s] = true
    create_triple(variant_uri, predicate, object)
  end
end

end

