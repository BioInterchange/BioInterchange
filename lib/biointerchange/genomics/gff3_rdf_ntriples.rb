require 'rdf'
require 'rdf/ntriples'
require 'date'

module BioInterchange::Genomics

# Serializes GFF3, GVF and VCF models.
#
# Inputs:
# - biointerchange.gff3
# - biointerchange.gvf
# - biointerchange.vcf
#
# Outputs:
# - rdf.biointerchange.gfvo
class RDFWriter < BioInterchange::Writer

  # Register writers:
  BioInterchange::Registry.register_writer(
    'rdf.biointerchange.gfvo',
    BioInterchange::Genomics::RDFWriter,
    [ 'biointerchange.gff3', 'biointerchange.gvf', 'biointerchange.vcf' ],
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

    # Set up "matchers" that can be used to match a number of attributes of a feature, and then,
    # link out to an entity that says something about that combination of attributes. Used for
    # GVF #data-source, etc., pragmas and VCF filters.
    @matchers = []

    # Create a URI prefix that applies to the set, all features in the set, and all the features' annotations.
    # Then register the prefix with the writer to have a concise Turtle output.
    set_uri = set_uri[0..-2] if set_uri and set_uri.end_with?('/')
    set_uri = RDF::URI.new(model.uri) unless set_uri
    set_base(set_uri + '/')

    add_prefix('http://biohackathon.org/resource/faldo#', 'faldo')
    add_prefix('http://www.biointerchange.org/gfvo#', 'gfvo')
    add_prefix('http://semanticscience.org/resource/', 'sio')

    create_triple(set_uri, RDF.type, @base.File)
    model.pragmas.each { |pragma_name|
      serialize_pragma(set_uri, pragma_name, model.pragma(pragma_name))
    }
    model.contents.each { |feature|
      if feature.instance_of?(BioInterchange::Genomics::GFF3FeatureSequence) then
        serialize_feature_sequence(set_uri, feature)
      else
        serialize_feature(set_uri, feature)
      end
    }
    close
  end

  # Serializes pragmas for a given feature set URI.
  #
  # +set_uri+:: the feature set URI to which the pragmas belong to
  # +name+:: name of the pragma statement
  # +pragma+:: an object representing a pragma statement
  def serialize_pragma(set_uri, name, pragma)
    if pragma.kind_of?(Hash) then
      if (pragma.has_key?('attribute-method') or pragma.has_key?('data-source') or pragma.has_key?('score-method') or pragma.has_key?('source-method') or pragma.has_key?('technology-platform')) then
        serialize_structured_attribute(set_uri, pragma)
      elsif pragma.has_key?('gff-version') then
        create_triple(set_uri.to_s, @base.has_identifier, RDF::URI.new("#{set_uri}/version"))
        create_triple("#{set_uri}/version", RDF.type, @base.Version)
        create_triple("#{set_uri}/version", @base.has_value, "gff-version #{pragma['gff-version']}")
      elsif pragma.has_key?('gvf-version') then
        create_triple("#{set_uri}/version", RDF.type, @base.Version)
        create_triple("#{set_uri}/version", @base.has_value, "gvf-version #{pragma['gvf-version']}")
      elsif pragma.has_key?('fileformat') then
        create_triple("#{set_uri}/version", RDF.type, @base.Version)
        create_triple("#{set_uri}/version", @base.has_value, "fileformat #{pragma['fileformat']}")
      elsif pragma.has_key?('sequence-region') then
        pragma['sequence-region'].keys.each { |seqid|
          serialize_landmark(set_uri, pragma['sequence-region'][seqid])
        }
      elsif pragma.has_key?('species') then
        create_triple(set_uri, @base.is_about, RDF::URI.new(pragma['species']))
      # VCF section:
      # ...TODO
      # Everything else:
      else
      end
    elsif pragma.kind_of?(Array) then
      # VCF section:
      if name == 'FILTER' then
        pragma.each { |assignment|
          pragma_uri = serialize_vcf_pragma(set_uri, "filter/#{assignment['ID']}", @base.VariantCalling, { 'ID' => @base.Identifier }, assignment)
          create_triple(set_uri, @base.is_participant_in, pragma_uri)
        }
      else
        # TODO
      end
    else
      # TODO
    end
  end

  # Goes through "matchers" and links the feature if its attributes are present
  # and equal to a "matcher's" data.
  #
  # (TODO: Update description of this method, because it is absolutely unclear
  #  what it actually does right now. Sorry.)
  #
  # +feature+:: the feature that provides attributes for matching
  # +feature_uri+:: URI of the feature that is linked out to, if the feature's attributes match
  def match_feature(feature, feature_uri)
    @matchers.each { |match_constraints|
      constraints, linkout = match_constraints

      # No constraints means that *everything* matches.
      matches = true
      constraints.each_pair { |key, value|
        if key == 'Seqid' then
          matches = false unless value.include?(feature.sequence_id)
        elsif key == 'Source' then
          matches = false unless value.include?(feature.source)
        elsif key == 'Type' then
          matches = false unless value.include?(feature.type)
        else
          if feature.attributes.has_key?(key) then
            attributes_have_a_match = false
            feature.attributes[key].each { |attribute_value|
              attributes_have_a_match = true if value.include?(attribute_value)
            }
            matches = false unless attributes_have_a_match
          else
            matches = false
          end
        end
      }

      # If there is a match, then add linkout.
      create_triple(feature_uri, @base.has_source, RDF::URI.new(linkout))
    }
  end

  # Serializes a +GFF3Feature+ object for a given feature set URI.
  #
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature+:: a +GFF3Feature+ instance
  def serialize_feature(set_uri, feature)
    # TODO Make sure there is only one value in the 'ID' list.
    # TODO Ponder about whether it would be possible to get the same URI for two distinct features (bad thing).
    source = ''
    source = "#{feature.source}," if feature.source
    type = ''
    type = "#{feature.type.to_s.sub(/^[^:]+:\/\//, '')}," if feature.type
    phase = ",#{feature.phase}" if feature.phase
    if feature.attributes.has_key?('ID') or feature.attributes.has_key?(' id') then
      feature_id = 'ID'
      feature_id = ' id' if feature.attributes.has_key?(' id')
      feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.attributes[feature_id][0]}")
    else
      feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.sequence_id},#{source}#{type}#{feature.start_coordinate},#{feature.end_coordinate},#{feature.strand}#{phase}")
    end

    create_triple(set_uri, @base.has_member, feature_uri)
    create_triple(feature_uri, RDF.type, @base.Feature)
    create_triple(feature_uri, RDF.type, feature.type) if feature.type
    match_feature(feature, feature_uri)
    serialize_landmark(set_uri, GFF3Landmark.new(feature.sequence_id)) unless @landmarks.has_key?(feature.sequence_id)
    create_triple(feature_uri, @base.is_located_on, RDF::URI.new(@landmarks[feature.sequence_id]))
    create_triple(feature_uri, @base.is_created_by, RDF::URI.new("#{feature_uri}/source"))
    create_triple("#{feature_uri}/source", RDF.type, @base.ExperimentalMethod)
    create_triple("#{feature_uri}/source", @base.has_value, feature.source) if feature.source
    if feature.phase then
      create_triple(feature_uri, @base.has_quality, RDF::URI.new("#{feature_uri}/phase"))
      create_triple("#{feature_uri}/phase", RDF.type, @base.CodingFrameOffset)
      create_triple("#{feature_uri}/phase", @base.has_value, feature.phase)
    end

    create_triple(feature_uri, @base.has_part, RDF::URI.new("#{feature_uri}/locus"))
    create_triple("#{feature_uri}/locus", RDF.type, @base.Locus)
    create_triple("#{feature_uri}/locus", @base.has_attribute, RDF::URI.new("#{feature_uri}/locus/region"))
    serialize_coordinate(set_uri, "#{feature_uri}/locus", feature)
    serialize_attributes(set_uri, feature_uri, feature.attributes) unless feature.attributes.keys.empty?
  end

  # Serialize a feature's coordinates using FALDO.
  #
  # +set_uri+:: URI of the feature set that the feature belongs to
  # +feature_uri+:: URI prefix of the feature
  # +feature+:: object representation of the feature, which contains the locus that is described by this method
  def serialize_coordinate(set_uri, feature_uri, feature)
    region_uri = RDF::URI.new("#{feature_uri.to_s}/region")
    start_position_uri = RDF::URI.new("#{feature_uri.to_s}/region/start")
    end_position_uri = RDF::URI.new("#{feature_uri.to_s}/region/end")
    #feature_object_properties = @base.feature_properties.select { |uri| @base.is_object_property?(uri) }[0]
    ##graph.insert(BioInterchange::Statement.new(feature_uri, @base.with_parent([ @base.region ].flatten, feature_object_properties), region_uri))
    create_triple(feature_uri, @base.is_located_on, region_uri)
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
    if feature.score then
      create_triple(feature_uri, @base.has_attribute, RDF::URI.new("#{feature_uri}/score"))
      if @format == :gvf or @format == :vcf then
        create_triple("#{feature_uri}/score", RDF.type, @base.PhredScore)
      else
        create_triple("#{feature_uri}/score", RDF.type, @base.Score)
      end
      create_triple("#{feature_uri}/score", @base.has_value, feature.score)
    end
  end

  # Constructs a landmark URI based on set URI and the landmark's ID.
  #
  # +set_uri+:: the set URI to which the landmark belongs to
  # +id+:: ID of the landmark
  def landmark_uri(set_uri, id)
    "#{set_uri.to_s}/landmark/#{id}"
  end

  # Serializes a genomic feature landmark ("seqid").
  #
  # +set_uri+:: the feature set URI to which the landmark belongs to
  # +landmark+:: encapsuled landmark data
  def serialize_landmark(set_uri, landmark)
    return if @landmarks.has_key?(landmark.seqid)
    landmark_uri = landmark_uri(set_uri, landmark.seqid)
    region_uri = RDF::URI.new("#{landmark_uri.to_s}/region")
    @landmarks[landmark.seqid] = landmark_uri
    create_triple(landmark_uri, RDF.type, @base.Landmark)
    create_triple(landmark_uri, @base.has_identifier, RDF::URI.new("#{landmark_uri}/id"))
    create_triple("#{landmark_uri}/id", @base.has_value, landmark.seqid)
    create_triple(landmark_uri, @base.has_attribute, region_uri)
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
        list.each_index { |index|
          create_triple(feature_uri, @base.has_attribute, RDF::URI.new("#{feature_uri}/alias/#{index}"))
          create_triple("#{feature_uri}/alias/#{index}", RDF.type, @base.Alias)
          create_triple("#{feature_uri}/alias/#{index}", @base.has_value, list[index])
        }
      elsif tag == 'Dbxref' then
        list.each { |value|
          begin
            # Try to link the external database reference to a well-established URI:
            serialize_dbxref(feature_uri, value)
          rescue NoMethodError
            # Not clear where to link to? Preserve the Dbxref as a Literal:
            @dbxref = 0 if @dbxref == nil
            literal_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/dbxref/#{@dbxref}")
            @dbxref += 1
            create_triple(feature_uri, @base.references, literal_uri)
            create_triple(literal_uri, RDF.type, @base.ExternalReference)
            create_triple(literal_uri, @base.has_value, value)
          end
        }
      elsif tag == 'Derives_from' then
        list.each { |value|
          create_triple(feature_uri, @base.is_temporarily_part_of, RDF::URI.new("#{set_uri.to_s}/feature/#{value}"))
        }
      elsif tag == 'Gap' then
        # Handled by 'Target', because 'Gap' requires 'Target' to be present.
      elsif tag == 'ID' then
        list.each { |value|
          create_triple(feature_uri, @base.has_identifier, RDF::URI.new("#{feature_uri}/id"))
          create_triple("#{feature_uri}/id", RDF.type, @base.Identifier)
          create_triple("#{feature_uri}/id", @base.has_value, value)
        }
      elsif tag == 'Is_circular' then
        value = list.join(',')
        if value == 'true' then
          create_triple(feature_uri, @base.has_quality, @base.CircularHelix) if value == 'true'
        elsif value == 'false' then
          create_triple(feature_uri, @base.is_circular, @base.WatsonCrickHelix) if value == 'false'
        else
          create_triple(feature_uri, BioInterchange::RDFS.comment, "Is_circular non-truth value: #{value}")
        end
      elsif tag == 'Name' then
        list.each { |value|
          create_triple(feature_uri, @base.has_attribute, RDF::URI.new("#{feature_uri}/name"))
          create_triple("#{feature_uri}/name", RDF.type, @base.Name)
          create_triple("#{feature_uri}/name", @base.has_value, value)
        }
      elsif tag == 'Note' then
        list.each_index { |index|
          create_triple(feature_uri, @base.has_annotation, RDF::URI.new("#{feature_uri}/note/#{index}"))
          create_triple("#{feature_uri}/note/#{index}", RDF.type, @base.Note)
          create_triple("#{feature_uri}/note/#{index}", @base.has_value, list[index])
        }
      elsif tag == 'Ontology_term' then
        list.each { |value|
          # TODO Sanitize values that are either not in GO xrf_abbs or need conversion to match
          #      match their associated Ruby method.
          namespace, accession = value.split(/:/, 2)
          create_triple(feature_uri, @base.references, "#{BioInterchange::GOXRef.send(namespace).to_s}#{accession}")
        }
      elsif tag == 'Parent' then
        list.each { |parent_id|
          create_triple(feature_uri, @base.has_source, RDF::URI.new("#{set_uri.to_s}/feature/#{parent_id}"))
        }
      elsif tag == 'Reference_seq' then
        list.each { |value|
          reference_uri = RDF::URI.new("#{feature_uri.to_s}/reference/#{value}")
          create_triple(feature_uri, @base.has_attribute, reference_uri)
          create_triple(reference_uri, RDF.type, @base.ReferenceSequence)
          create_triple(reference_uri, @base.has_value, value)
        }
      elsif tag == 'Target' then
        # GFF3 spec is unclear on this point, but I assume that a target ID
        # is referencing a feature ID within the same file.
        target_id, start_coordinate, end_coordinate, strand = list.join(',').split(/\s+/, 4)
        target_uri = RDF::URI.new("#{feature_uri.to_s}/target/#{target_id}")
        create_triple(target_uri, RDF.type, @base.SequenceAlignment)
        create_triple(target_uri, @base.has_source, feature_uri)
        create_triple(target_uri, @base.has_input, target_id)
        region_uri = RDF::URI.new("#{target_uri.to_s}/region")
        start_position_uri = RDF::URI.new("#{region_uri.to_s}/start")
        end_position_uri = RDF::URI.new("#{region_uri.to_s}/end")
        create_triple(target_uri, @base.has_attribute, region_uri)
        create_triple(region_uri, RDF.type, BioInterchange::FALDO.Region)
        create_triple(region_uri, BioInterchange::FALDO.begin, start_position_uri)
        create_triple(region_uri, BioInterchange::FALDO.end, end_position_uri)
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

        # Describe a possible alignment with gaps between the feature and target:
        if attributes.has_key?('Gap') then
          attributes['Gap'].each_index { |gap_no|
            cigar_line = attributes['Gap'][gap_no].split(/\s+/)
            cigar_line.each_index { |alignment_no|
              alignment_uri = RDF::URI.new("#{feature_uri.to_s}/alignment/#{gap_no}/#{alignment_no}")
              if alignment_no == 0 then
                create_triple(target_uri, @base.has_first_part, alignment_uri)
              else
                create_triple(target_uri, @base.has_ordered_part, alignment_uri)
              end
              if alignment_no == cigar_line.length then
                create_triple(target_uri, @base.has_last_part, alignment_uri)
              end
              operation = cigar_line[alignment_no].gsub(/[^MIDFR]/, '')
              operation = nil unless operation.length == 1
              span = cigar_line[alignment_no].gsub(/[^0-9]/, '')
              span = nil unless span.length > 0
              if operation == 'M' then
                create_triple(alignment_uri, RDF.type, @base.Match)
              elsif operation == 'I' then
                create_triple(alignment_uri, RDF.type, @base.ReferenceSequenceGap)
              elsif operation == 'D' then
                create_triple(alignment_uri, RDF.type, @base.TargetSequenceGap)
              elsif operation == 'F' then
                create_triple(alignment_uri, RDF.type, @base.ForwardReferenceSequenceFrameshift)
              elsif operation == 'R' then
                create_triple(alignment_uri, RDF.type, @base.ReverseReferenceSequenceFrameshift)
              else
                # Fallback: operation is outside of the specification
                create_triple(alignment_uri, RDF.type, @base.SequenceAlignmentOperation)
                create_triple(alignment_uri, BioInterchange::RDFS.comment, "Alignment operation: #{operation}") if operation and not operation.empty?
              end
              if alignment_no + 1 < cigar_line.length then
                create_triple(alignment_uri, @base.is_before, RDF::URI.new("#{feature_uri.to_s}/alignment/#{gap_no}/#{alignment_no + 1}"))
              end
              if span then
                create_triple(alignment_uri, @base.has_attribute, RDF::URI.new("#{alignment_uri}/span"))
                create_triple("#{alignment_uri}/span", RDF.type, @base.Span)
                create_triple("#{alignment_uri}/span", @base.has_value, span.to_i)
              end
            }
          }
        end
      elsif tag == 'Variant_effect' then
        serialize_variant_effects(set_uri, feature_uri, list)
      elsif tag == 'Variant_seq' then
        serialize_variant_seqs(set_uri, feature_uri, list)
      # VCF related attributes:
      elsif tag == ' alternative_alleles' then
        # TODO
      elsif tag == ' filters' then
        # Example: "Qual;MinAB;MinDP"
      elsif tag == ' samples' then
        list.each_index { |sample|
          list[sample].each_pair { |key, values|
            serialize_vcf_sample(feature_uri, sample, key, values, attributes)
          }
        }
      # Everything else:
      elsif list == true then
        # Attribute is a flag. Tag itself carries meaning and has no value associated with it.
        attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}")
        create_triple(feature_uri, @base.has_attribute, attribute_uri)
        create_triple(attribute_uri, RDF.type, @base.InformationContentEntity)
        create_triple(attribute_uri, @base.has_attribute, RDF::URI.new("#{attribute_uri}/tag/#{tag}"))
        create_triple(RDF::URI.new("#{attribute_uri}/tag/#{tag}"), RDF.type, @base.Label)
        create_triple(RDF::URI.new("#{attribute_uri}/tag/#{tag}"), @base.has_value, tag)
      else
        # TODO Report unknown upper case letters here? That would be a spec. validation...
        #      Well, or it would show that this implementation is incomplete. Could be either.
        list.each_index { |index|
          value = list[index]
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}") if list.size == 1
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}-#{index + 1}") unless list.size == 1
          create_triple(feature_uri, @base.has_attribute, attribute_uri)
          create_triple(attribute_uri, RDF.type, @base.InformationContentEntity)
          # TODO Figure out why the following line was there. Seems wrong. 
          #create_triple(attribute_uri, @base.has_attribute, RDF::URI.new("#{attribute_uri}/tag/#{tag}"))
          create_triple(attribute_uri, @base.has_value, value)
          create_triple(RDF::URI.new("#{attribute_uri}/tag/#{tag}"), RDF.type, @base.Label)
          create_triple(RDF::URI.new("#{attribute_uri}/tag/#{tag}"), @base.has_value, tag)
        }
      end
    }
  end

  # Serializes VCF sample data (VCF columns 9 and above).
  #
  # See also genotype serialization of non-VCF data in `serialize_variant_seqs`.
  #
  # +feature_uri+:: URI of the feature that the sample data relates to
  # +sample+:: number of the sample that is being addressed (sample column number)
  # +key+:: key of the described sample values
  # +values+:: values of the sample (possible composite type, e.g. comma separated list)
  # +attribtues+:: a map of tag/value pairs associated with the feature
  def serialize_vcf_sample(feature_uri, sample, key, values, attributes)
    if key == 'DP' then
      # Depth across samples. An integer.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index].to_i, index, values.size > 1, @base.Number_ofReads, RDF::XSD.integer)
      }
    elsif key == 'GT' then
      # Genotype
      list_uri = RDF::URI.new("#{feature_uri}/attribute/#{key}")
      serialize_attribute_with_label(feature_uri, list_uri, @base.Genotype, key)
      phased = values.index('/') == nil
      if phased then
        create_triple(list_uri, @base.has_attribute, "#{list_uri}/phase")
        create_triple("#{list_uri}/phase", RDF.type, @base.GameticPhase)
      end
      value_uris = []
      values = values.split(/\/|\|/)
      # Only say something about zygosity if we deal with single bases and a diploid genome!
      if values.length == 2 and values.map { |sequence| sequence.length }.uniq[0] == 1 then
        if values.uniq.length == 1 then
          create_triple(list_uri, @base.has_quality, @base.Homozygous)
        else
          create_triple(list_uri, @base.has_quality, @base.Heterozygous)
        end
      end
      values.each_index { |index|
        sequence = vcf_allele(values[index].to_i, attributes)
        sequence_type = @base.SequenceVariant
        sequence_type = @base.ReferenceSequence if values[index].to_i == 0
        value_uris << value_uri = serialize_vcf_sample_attribute(feature_uri, sample, key, true, sequence, index, values.size > 1, sequence_type)
      }
      serialize_list_array(list_uri, value_uris)
    elsif key == 'FT' then
      # Filter: passed does nothing; applied filter uses isRefutedBy.
      # TODO How to code using GFVO?
      values = values.split(';')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'GL' then
      # Genotype likelihoods.
      list_uri = "#{feature_uri}/attribute/#{key}"
      serialize_attribute_with_label(feature_uri, list_uri, @base.Score, key)
      values = values.split(',')
      value_uris = []
      values.each_index { |index|
        value_uris << serialize_vcf_sample_attribute(feature_uri, sample, key, false, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
      serialize_list_array(list_uri, value_uris)
    elsif key == 'GLE' then
      # Genotype likelihoods of heterogenous ploidy.
      # Example: 0:-75.22,1:-223.42,0/0:-323.03,1/0:-99.29,1/1:-802.53
      values = values.split(',')
      values.each_index { |index|
        genotype, likelihood = values[index].split(':')
        genotype = genotype.split('/').map { |allele| vcf_allele(allele.to_i, attributes) }
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, genotype, index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'PL' then
      # Phred scaled genotype likelihoods.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'GP' then
      # Phred scaled genotype posterior probabilities.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'GQ' then
      # Conditional genotype quality.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'HQ' then
      # Haplotype qualities -- presumably Phred scaled.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'PS' then
      # Phase set. It's complicated. See the VCF specification for details.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'PQ' then
      # Phasing quality in Phred scale.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'EC' then
      # Expected alternate allele counts.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    elsif key == 'MQ' then
      # RMS mapping quality. An integer.
      values = values.split(',')
      values.each_index { |index|
        serialize_vcf_sample_attribute(feature_uri, sample, key, true, values[index], index, values.size > 1, @base.InformationContentEntity)
      }
    else
      # Unknown keys. Should that be possible at all?
      serialize_vcf_sample_attribute(feature_uri, sample, key, true, values, 0, false, @base.InformationContentEntity)
    end
  end

  # Returns the allele based on VCF's genotype indexing specification.
  # Reference allele is index zero, alternatives alleles are designated by one or above.
  #
  # +genotype_index+:: VCF genotype index
  # +attributes+:: feature attribute hash that contains reference/alternative allele bases
  def vcf_allele(genotype_index, attributes)
    if genotype_index == 0 then
      genotype = attributes[' reference_bases'][0]
    else
      genotype = attributes[' alternative_alleles'][genotype_index - 1]
    end
  end

  # Serializes an ordered list; the list's URIs are given as an array.
  #
  # +list_uri+:: URI of the list object (ordered list items will be part of this instance via "has_first_part", "has_ordered_part, "has_last_part")
  # +uris+:: URIs of the list to be serialized
  def serialize_list_array(list_uri, uris)
    uris.each_index { |index|
      next_uri = nil
      next_uri = uris[index + 1] if index + 1 < uris.length
      serialize_list(uris, index, uris[index], next_uri, list_uri)
    }
  end

  # Create an ordered list of things; this method serializes one item only and
  # repeated calls to this method create the list.
  #
  # +values+:: array of the things that appear in the ordered list
  # +index+:: index of the thing that is serialized by this method call
  # +value_uri+:: URI that represents the current value that is being linked to
  # +next_value_uri+:: URI of the next serialized value (ignored, if last index)
  # +list_uri+:: URI of the list that contains the items
  def serialize_list(values, index, value_uri, next_value_uri, list_uri)
    if index == 0 then
      create_triple(list_uri, @base.has_first_part, value_uri)
    elsif index + 1 == values.length then
      create_triple(list_uri, @base.has_last_part, value_uri)
    else
      create_triple(list_uri, @base.has_ordered_part, value_uri)
    end
    if index + 1 < values.length then
      create_triple(value_uri, @base.is_before, next_value_uri)
    end
  end

  # Serializes basic information for an object (a feature's attribtue) with label.
  #
  # Links the object to a feature, sets the objects type, assigns it a label.
  #
  # +feature_uri+:: URI of the feature that has the object as an attribute
  # +object_uri+:: URI that represents the object
  # +object_type+:: type of the object
  # +label+:: label text to use
  def serialize_attribute_with_label(feature_uri, object_uri, object_type, label)
    create_triple(feature_uri, @base.has_attribute, object_uri)
    create_triple(object_uri, RDF.type, object_type)
    label_uri = RDF::URI.new("#{object_uri}/label")
    create_triple(object_uri, @base.has_attribute, label_uri)
    create_triple(label_uri, RDF.type, @base.Label)
    create_triple(label_uri, @base.has_value, label)
  end

  # Serializes VCF meta-data (pragma equivalent) key/value pairs. Used by serialize_pragma.
  #
  # Returns URI of the serialized meta-data.
  #
  # +set_uri+:: URI of the set that the meta-data belongs to
  # +uri_suffix+:: suffix that is appended to set_uri, which uniquely defines the meta-data (within the set_uri)
  # +meta_type+:: type of the meta-data
  # +key_type_mappings+:: mappings of keys to known types, everything else is considered an Object
  # +attributes+:: key/value pairs that are the actual meta-data being described
  def serialize_vcf_pragma(set_uri, uri_suffix, meta_type, key_type_mappings, attributes)
    pragma_uri = RDF::URI.new("#{set_uri}/#{uri_suffix}")
    create_triple(pragma_uri, RDF.type, meta_type)
    attributes.each_pair { |key, value|
      attribute_uri = RDF::URI.new("#{pragma_uri}/#{key}")
      create_triple(pragma_uri, @base.has_attribute, attribute_uri)
      if key_type_mappings.has_key?(key) then
        create_triple(attribute_uri, RDF.type, key_type_mappings[key])
        # TODO Check if type is integer/double here, then convert value accordingly.
      else
        create_triple(attribute_uri, RDF.type, @base.Object)
      end
      create_triple(attribute_uri, @base.has_value, value)
    }
    pragma_uri
  end

  # Serializes a VCF sample attribute/value pair. Used by serialize_vcf_sample.
  #
  # Returns URI of the serialized attribute/value pair.
  #
  # +base_uri+:: URI of the "thing" that the sample data relates to
  # +sample+:: number of the sample that is being addressed (sample column number)
  # +key+:: key of the described sample values
  # +has_label+:: if true, then serialize label (value taken from key)
  # +value+:: value that is associated with the key/sample
  # +index+:: index of the value (in case value is part of an array of size > 1)
  # +multivalue+:: true if this value is taken from an array of values of size > 1
  # +attribute_type+:: type of the attribute entity that represents the value
  # +value_type+:: type of the actual value
  def serialize_vcf_sample_attribute(base_uri, sample, key, has_label, value, index, multivalue, attribute_type, value_type = nil)
    value_uri = RDF::URI.new("#{base_uri.to_s}/sample/#{sample}/#{key}") unless multivalue
    value_uri = RDF::URI.new("#{base_uri.to_s}/sample/#{sample}/#{key}-#{index + 1}") if multivalue
    create_triple(base_uri, @base.has_attribute, value_uri)
    create_triple(value_uri, RDF.type, attribute_type)
    create_triple(value_uri, @base.has_value, value, value_type)
    if has_label then
      label_uri = RDF::URI.new("#{value_uri}/label")
      create_triple(value_uri, @base.has_attribute, label_uri)
      create_triple(label_uri, RDF.type, @base.Label)
      create_triple(label_uri, @base.has_value, key)
    end
    value_uri
  end

  # Serializes a structured attribute (given as a pragma statement), which later
  # can be referred to from feature instances.
  #
  # +set_uri+:: the feature set URI to which the structured attribute belongs to
  # +pragma+:: a map that encapsulates the structured attribute data
  def serialize_structured_attribute(set_uri, pragma)
    # TODO Triple from set_uri to attribute_uri missing; should be isParticipantIn
    attribute_uri = RDF::URI.new("#{set_uri.to_s}/structured_attribute/#{pragma.object_id}")
    attributes = nil
    class_type = nil
    if pragma.has_key?('attribute-method') then
      attributes = pragma['attribute-method'][0]
      class_type = @base.ExperimentalMethod
    elsif pragma.has_key?('data-source') then
      attributes = pragma['data-source'][0]
      class_type = @base.GenomicAscertainingMethod
    elsif pragma.has_key?('score-method') then
      attributes = pragma['score-method'][0]
      class_type = @base.ExperimentalMethod
    elsif pragma.has_key?('source-method') then
      attributes = pragma['source-method'][0]
      class_type = @base.ExperimentalMethod
    elsif pragma.has_key?('technology-platform') then
      attributes = pragma['technology-platform'][0]
      class_type = @base.SequencingTechnologyPlatform
    else
      # TODO Error.
    end
    if class_type == @base.GenomicAscertainingMethod and attributes.has_key?('Data_type') then
      attributes['Data_type'] = attributes['Data_type'][0] # TODO Make sure array is of length 1.
      if attributes['Data_type'] == 'Array_CGH' then
        class_type = @base.ArrayComparativeGenomicHybridization
      elsif attributes['Data_type'] == 'DNA_microarray' then
        class_type = @base.DNAMicroarray
      elsif attributes['Data_type'] == 'DNA_sequence' then
        class_type = @base.DNASequencing
      elsif attributes['Data_type'] == 'RNA_sequence' then
        class_type = @base.RNASequencing
      else
        # TODO Error.
      end
    elsif class_type == @base.SequencingTechnologyPlatform then
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
    if class_type == @base.SequencingTechnologyPlatform or
       class_type == @base.FragmentReadPlatform or
       class_type == @base.PairedEndReadPlatform then
      if attributes.has_key?('Average_coverage') then
        coverage_uri = RDF::URI.new("#{attribute_uri}/averagecoverage")
        create_triple(attribute_uri, @base.has_attribute, coverage_uri)
        create_triple(coverage_uri, RDF.type, @base.AverageCoverage)
        create_triple(coverage_uri, @base.has_value, attributes['Average_coverage'][0].to_i)
      end
      if attributes.has_key?('Platform_class') then
        create_triple(attribute_uri, @base.has_attribute, RDF::URI.new("#{attribute_uri}/platformclass"))
        #create_triple(attribute_uri, @base.platformClass, attributes['Platform_class'][0])
      end
      if attributes.has_key?('Platform_name') then
        #create_triple(attribute_uri, @base.platformName, attributes['Platform_name'][0])
      end
      if attributes.has_key?('Read_length') then
        #create_triple(attribute_uri, @base.readLength, attributes['Read_length'][0].to_i)
      end
      if attributes.has_key?('Read_pair_span') then
        #create_triple(attribute_uri, @base.readPairSpan, attributes['Read_pair_span'][0].to_i)
      end
    end
    attributes.keys.each { |tag|
      if tag.match(/^[a-z]/) then
        tag.strip!
        custom_attribute_uri = RDF::URI.new("#{attribute_uri.to_s}/attribute/#{tag}")
        create_triple(attribute_uri, @base.has_attribute, custom_attribute_uri)
        create_triple(custom_attribute_uri, RDF.type, @base.InformationContentEntity)
        create_triple(custom_attribute_uri, @base.has_attribute, RDF::URI.new("#{attribute_uri.to_s}/attribute/#{tag}/name"))
        attributes[tag].each { |value|
          create_triple(custom_attribute_uri, @base.has_value, value)
        }
        create_triple(RDF::URI.new("#{attribute_uri.to_s}/attribute/#{tag}/name"), RDF.type, @base.Name)
        create_triple(RDF::URI.new("#{attribute_uri.to_s}/attribute/#{tag}/name"), @base.has_value, tag)
      else
        # TODO
        match_constraints = {}
        attributes[tag].each { |value|
          if tag == 'Seqid' or tag == 'Type' or tag == 'Source' then
            match_constraints[tag] = value.split(',')
          else
            # Not a recognized match. Might be a Dbxref or Comment.
          end
        }
        unless match_constraints.keys.empty? then
          @matches 
        end
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
      # TODO
      #serialize_variant_triple(feature_uri, RDF::URI.new("#{feature_uri.to_s}/variant/#{variant_index}"), @base.effect, effect_uri)
      # Type is a SO sequence_variant or descendent:
      create_triple(effect_uri, RDF.type, BioInterchange::SO.send(BioInterchange.make_safe_label(sequence_variant)))
      # The feature type should be already apparent from the targeted feature. Do no sanity
      # check here (if they match) and just skip over it.
      # create_triple(effect_uri, @base.feature_type, BioInterchange::SO.send(BioInterchange.make_safe_label(feature_type)))
      feature_ids.each { |feature_id|
        create_triple(feature_id, @base.is_affected_by, effect_uri)
      }
    }
  end

  # Serializes a list of variant sequences.
  #
  # See also VCF genotype serialization ('GT' attribute) in `serialize_vcf_sample`.
  #
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +list+:: list of variant values
  def serialize_variant_seqs(set_uri, feature_uri, list)
    variant_uri = nil

    list.each_index { |index|
      value = list[index]
      variant_uri = RDF::URI.new("#{feature_uri.to_s}/variant/#{index}")
      sequence_uri = RDF::URI.new("#{variant_uri}/sequence")
      serialize_variant_triple(feature_uri, variant_uri, @base.has_attribute, sequence_uri)
      create_triple(sequence_uri, @base.has_value, value)
    }

    if list[0].match(/a-zA-Z/) and list[1].match(/a-zA-Z/) then
      if list[0] == list[1] then
        create_triple(variant_uri, @base.has_quality, @base.Homozygous)
      else
        create_triple(variant_uri, @base.has_quality, @base.Heterozygous)
      end
    end

    return @base.SequenceVariant
  end

  # Adds a variant to the graph; tracks the variant's URI that RDF.type is only written out once.
  #
  # +feature_uri+:: the feature URI to the feature that is annotated with variant data
  # +variant_uri+:: URI that identifies the feature in question ("subject", if you like)
  # +predicate+:: predicate that describes the data being serialized
  # +object+:: data to be serialized
  def serialize_variant_triple(feature_uri, variant_uri, predicate, object)
    unless @variants.has_key?(variant_uri.to_s) then
      create_triple(feature_uri, @base.is_affected_by, variant_uri)
      create_triple(variant_uri, RDF.type, @base.VariantCalling)
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
    create_triple(feature_uri, @base.has_attribute, annotation_uri)
    create_triple(annotation_uri, RDF.type, @base.Sequence)
    create_triple(annotation_uri, BioInterchange::RDFS.comment, feature_sequence.comment) if feature_sequence.comment
    create_triple(annotation_uri, @base.has_value, feature_sequence.sequence)
  end

  # Serializes an external database reference.
  #
  # +feature_uri+:: URI of the feature that the external database references is referring to
  # +dbxref_composite+:: composite term of the external database reference (e.g. ""dbSNP_127:rs123456)
  def serialize_dbxref(feature_uri, dbxref_composite)
    abbreviation, accession = dbxref_composite.split(':', 2)
    dbxref_uri = RDF::URI.new("#{feature_uri.to_s}/dbxref/#{BioInterchange.make_safe_label(abbreviation)}")
    create_triple(feature_uri, @base.references, dbxref_uri)

    create_triple(dbxref_uri, RDF.type, @base.ExternalReference)
    create_triple(dbxref_uri, @base.refers_to, BioInterchange::LifeScienceRegistry.send(dbxref_composite.split('_', 2)[0].downcase).sub('$id', accession))
    if dbxref_composite.match(/^.+_.+:.+$/) then
      # Entry with version information.
      version_uri = RDF::URI.new("#{dbxref_uri}/version")
      create_triple(dbxref_uri, @base.has_identifier, version_uri)
      create_triple(version_uri, @base.has_value, abbreviation[6..-1])
    end

    #if dbxref_composite.match(/^dbSNP(_\d+)?:rs\d+$/) then
    #  # linkout = "http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=#{dbxref_composite.split(/:/)[1].sub(/^rs/, '')}"
    #elsif dbxref_composite.match(/^COSMIC(_\d+)?:COSM\d+$/) then
    #  linkout = "http://cancer.sanger.ac.uk/cosmic/mutation/overview?id=#{accession.sub(/^COSM/, '')}"
    #else
    #  BioInterchange::GOXRef.send(BioInterchange.make_safe_label(abbreviation)).to_s + accession
    #end
  end 

end

end

