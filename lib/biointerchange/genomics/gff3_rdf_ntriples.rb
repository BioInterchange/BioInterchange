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
# - rdf.biointerchange.gff3
# - rdf.biointerchange.gvf
class RDFWriter

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
      @base = BioInterchange::GFF3O
      serialize_model(model)
    elsif model.instance_of?(BioInterchange::Genomics::GVFFeatureSet) then
      @base = BioInterchange::GVF1O
      serialize_model(model)
    else
      raise BioInterchange::Exceptions::ImplementationWriterError, 'The provided model cannot be serialized. ' +
                           'This writer supports serialization for BioInterchange::Genomics::GFF3FeatureSet and '
                           'BioInterchange::Genomics::GVFFeatureSet.'
    end
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
    set_uri = RDF::URI.new(model.uri)
    graph.insert(RDF::Statement.new(set_uri, RDF.type, @base.Set))
    model.pragmas.each { |pragma_name|
      serialize_pragma(graph, set_uri, model.pragma(pragma_name))
    }
    model.contents.each { |feature|
      serialize_feature(graph, set_uri, feature)
    }
    RDF::NTriples::Writer.dump(graph, @ostream)
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
      if (pragma.has_key?('attribute-method') or pragma.has_key?('data-source') or pragma.has_key?('score-method') or pragma.has_key?('source-method') or pragma.has_key?('technology-platform')) and @base == BioInterchange::GVF1O then
        serialize_structured_attribute(graph, set_uri, pragma)
      elsif pragma.has_key?('gff-version') and @base == BioInterchange::GFF3O then
        graph.insert(RDF::Statement.new(set_uri, @base.version, RDF::Literal.new(pragma['gff-version'], :datatype => RDF::XSD.float )))
      elsif pragma.has_key?('gff-version') and @base == BioInterchange::GVF1O then
        graph.insert(RDF::Statement.new(set_uri, @base.gff_version, RDF::Literal.new(pragma['gff-version'], :datatype => RDF::XSD.float )))
      elsif pragma.has_key?('gvf-version') and @base == BioInterchange::GVF1O then
        graph.insert(RDF::Statement.new(set_uri, @base.gvf_version, RDF::Literal.new(pragma['gvf-version'], :datatype => RDF::XSD.float )))
      elsif pragma.has_key?('sequence-region') then
        pragma['sequence-region'].keys.each { |seqid|
          serialize_landmark(graph, set_uri, pragma['sequence-region'][seqid])
        }
      elsif pragma.has_key?('species') then
        graph.insert(RDF::Statement.new(set_uri, @base.species, RDF::URI.new(pragma['species'])))
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
    feature_datatype_properties = @base.feature_properties.select { |uri| @base.is_datatype_property?(uri) }[0]
    feature_object_properties = @base.feature_properties.select { |uri| @base.is_object_property?(uri) }[0]
    graph.insert(RDF::Statement.new(set_uri, @base.contains, feature_uri))
    graph.insert(RDF::Statement.new(feature_uri, RDF.type, @base.Feature))
    serialize_landmark(graph, set_uri, GFF3Landmark.new(feature.sequence_id)) unless @landmarks.has_key?(feature.sequence_id)
    graph.insert(RDF::Statement.new(feature_uri, @base.with_parent([ @base.seqid ].flatten, feature_object_properties)[0], @landmarks[feature.sequence_id]))
    graph.insert(RDF::Statement.new(feature_uri, @base.source, RDF::Literal.new(feature.source)))
    graph.insert(RDF::Statement.new(feature_uri, @base.type, feature.type))
    graph.insert(RDF::Statement.new(feature_uri, @base.with_parent(@base.start, feature_datatype_properties)[0], RDF::Literal.new(feature.start_coordinate)))
    graph.insert(RDF::Statement.new(feature_uri, @base.with_parent(@base.end, feature_datatype_properties)[0], RDF::Literal.new(feature.end_coordinate)))
    graph.insert(RDF::Statement.new(feature_uri, @base.score, RDF::Literal.new(feature.score))) if feature.score
    strand_uri = @base.with_parent(@base.strand, feature_object_properties)[0]
    case feature.strand
    when BioInterchange::Genomics::GFF3Feature::NOT_STRANDED
      graph.insert(RDF::Statement.new(feature_uri, strand_uri, @base.NotStranded))
    when BioInterchange::Genomics::GFF3Feature::UNKNOWN
      graph.insert(RDF::Statement.new(feature_uri, strand_uri, @base.UnknownStrand))
    when BioInterchange::Genomics::GFF3Feature::POSITIVE
      graph.insert(RDF::Statement.new(feature_uri, strand_uri, @base.Positive))
    when BioInterchange::Genomics::GFF3Feature::NEGATIVE
      graph.insert(RDF::Statement.new(feature_uri, strand_uri, @base.Negative))
    else
      raise BioInterchange::Exceptions::InputFormatError, 'Strand of feature is set to an unknown constant.'
    end
    graph.insert(RDF::Statement.new(feature_uri, @base.phase, RDF::Literal.new(feature.phase))) if feature.phase

    serialize_attributes(graph, set_uri, feature_uri, feature.attributes) unless feature.attributes.keys.empty?
  end

  # Serializes a genomic feature landmark ("seqid").
  #
  # +graph+:: RDF graph to which the landmark is added
  # +set_uri+:: the feature set URI to which the landmark belongs to
  # +landmark+:: encapsuled landmark data
  def serialize_landmark(graph, set_uri, landmark)
    return if @landmarks.has_key?(landmark.seqid)
    landmark_uri = RDF::URI.new("#{set_uri.to_s}/landmark/#{landmark.seqid}")
    @landmarks[landmark.seqid] = landmark_uri
    graph.insert(RDF::Statement.new(landmark_uri, @base.with_parent([ @base.id ].flatten, @base.landmark_properties)[0], RDF::Literal.new(landmark.seqid)))
    graph.insert(RDF::Statement.new(landmark_uri, @base.with_parent([ @base.start ].flatten, @base.landmark_properties)[0], RDF::Literal.new(landmark.start_coordinate))) if landmark.start_coordinate
    graph.insert(RDF::Statement.new(landmark_uri, @base.with_parent([ @base.end ].flatten, @base.landmark_properties)[0], RDF::Literal.new(landmark.end_coordinate))) if landmark.end_coordinate
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
          graph.insert(RDF::Statement.new(feature_uri, @base.alias, RDF::Literal.new(value)))
        }
      elsif tag == 'Dbxref' then
        feature_properties = @base.feature_properties.select { |uri| @base.is_object_property?(uri) }[0]
        list.each { |value|
          begin
            if value.match(/^dbSNP(_\d+)?:rs\d+$/) then
              graph.insert(RDF::Statement.new(feature_uri, @base.with_parent([ @base.dbxref ].flatten, feature_properties)[0], RDF::URI.new("http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=#{value.split(/:/)[1].sub(/^rs/, '')}")))
            elsif value.match(/^COSMIC(_\d+)?:COSM\d+$/) then
              graph.insert(RDF::Statement.new(feature_uri, @base.with_parent([ @base.dbxref ].flatten, feature_properties)[0], RDF::URI.new("http://cancer.sanger.ac.uk/cosmic/mutation/overview?id=#{value.split(/:/)[1].sub(/^COSM/, '')}")))
            else
              abbreviation, id = value.split(':', 2)
              graph.insert(RDF::Statement.new(feature_uri, @base.with_parent([ @base.dbxref ].flatten, feature_properties)[0], RDF::URI.new(BioInterchange::GOXRef.send(BioInterchange.make_safe_label(abbreviation)).to_s + id)))
            end
          rescue NoMethodError
            raise BioInterchange::Exceptions::InputFormatError, 'Attribute Dbxref link-out is not resolvable, i.e. the name cannot be turned into an URL.'
          end
        }
      elsif tag == 'Derives_from' and @base == BioInterchange::GFF3O then
        list.each { |value|
          graph.insert(RDF::Statement.new(feature_uri, @base.derives_from, RDF::URI.new("#{set_uri.to_s}/feature/#{value}")))
        }
      elsif tag == 'Gap' and @base == BioInterchange::GFF3O then
        graph.insert(RDF::Statement.new(feature_uri, @base.gap, RDF::Literal.new(list.join(','))))
      elsif tag == 'ID' then
        # Do nothing. The feature ID is the URI of the feature. It is not relevant as information anymore.
      elsif tag == 'Is_circular' and @base == BioInterchange::GFF3O then
        value = list.join(',')
        graph.insert(RDF::Statement.new(feature_uri, @base.is_circular, true)) if value == 'true'
        graph.insert(RDF::Statement.new(feature_uri, @base.is_circular, false)) if value == 'false'
        # TODO Report invalid value.
      elsif tag == 'Name' and @base == BioInterchange::GFF3O then
        graph.insert(RDF::Statement.new(feature_uri, @base.name, RDF::Literal.new(list.join(','))))
      elsif tag == 'Note' and @base == BioInterchange::GFF3O then
        list.each { |value|
          graph.insert(RDF::Statement.new(feature_uri, @base.note, RDF::Literal.new(value)))
        }
      elsif tag == 'Ontology_term' and @base == BioInterchange::GFF3O then
        list.each { |value|
          # TODO Sanitize values that are either not in GO xrf_abbs or need conversion to match
          #      match their associated Ruby method.
          namespace, accession = value.split(/:/, 2)
          graph.insert(RDF::Statement.new(feature_uri, @base.ontology_term, RDF::URI.new("#{BioInterchange::GOXRef.send(namespace).to_s}#{accession}")))
        }
      elsif tag == 'Parent' then
        list.each { |parent_id|
          graph.insert(RDF::Statement.new(feature_uri, @base.parent, RDF::URI.new("#{set_uri.to_s}/feature/#{parent_id}")))
        }
      elsif tag == 'Reference_seq' then
        list.each { |value|
          graph.insert(RDF::Statement.new(feature_uri, @base.reference_seq, RDF::Literal.new(value)))
        }
      elsif tag == 'Target' then
        target_id, start_coordinate, end_coordinate, strand = list.join(',').split(/\s+/, 4)
        target_datatype_properties = @base.target_properties.select { |uri| @base.is_datatype_property?(uri) }[0]
        target_object_properties = @base.target_properties.select { |uri| @base.is_object_property?(uri) }[0]
        target_uri = RDF::URI.new("#{feature_uri.to_s}/target/#{target_id}")
        graph.insert(RDF::Statement.new(target_uri, RDF.type, @base.Target))
        graph.insert(RDF::Statement.new(target_uri, @base.target_id, RDF::Literal.new(target_id)))
        graph.insert(RDF::Statement.new(target_uri, @base.with_parent([ @base.start ].flatten, target_datatype_properties)[0], RDF::Literal.new(start_coordinate.to_i)))
        graph.insert(RDF::Statement.new(target_uri, @base.with_parent([ @base.end ].flatten, target_datatype_properties)[0], RDF::Literal.new(end_coordinate.to_i)))
        graph.insert(RDF::Statement.new(target_uri, @base.with_parent([ @base.end ].flatten, target_object_properties)[0], @base.Positive)) if strand and strand == '+'
        graph.insert(RDF::Statement.new(target_uri, @base.with_parent([ @base.end ].flatten, target_object_properties)[0], @base.Negative)) if strand and strand == '-'
        graph.insert(RDF::Statement.new(feature_uri, @base.target, target_uri))
      elsif tag == 'Variant_seq' and @base == BioInterchange::GVF1O then
        serialize_variant_seqs(graph, set_uri, feature_uri, list)
      else
        # TODO Report unknown upper case letters here? That would be a spec. validation...
        #      Well, or it would show that this implementation is incomplete. Could be either.
        attribute_properties = @base.attribute_properties
        attribute_properties = attribute_properties.select { |uri| @base.is_datatype_property?(uri) }[0] if attribute_properties.kind_of?(Array)
        feature_properties = @base.feature_properties.select { |uri| @base.is_object_property?(uri) }[0]
        list.each_index { |index|
          value = list[index]
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}") if list.size == 1
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}-#{index + 1}") unless list.size == 1
          graph.insert(RDF::Statement.new(feature_uri, @base.with_parent([ @base.attributes ].flatten, feature_properties)[0], attribute_uri))
          graph.insert(RDF::Statement.new(attribute_uri, RDF.type, @base.Attribute))
          graph.insert(RDF::Statement.new(attribute_uri, @base.with_parent([ @base.tag ].flatten, attribute_properties)[0], RDF::Literal.new("#{tag}")))
          graph.insert(RDF::Statement.new(attribute_uri, RDF.value, RDF::Literal.new(value)))
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
    graph.insert(RDF::Statement.new(attribute_uri, RDF.type, class_type))
    if class_type == @base.DataSource and attributes.has_key?('Data_type') then
      data_type_individual = nil
      attributes['Data_type'] = attributes['Data_type'][0] # TODO Make sure array is of length 1.
      if attributes['Data_type'] == 'Array_CGH' then
        data_type_individual = @base.ArrayComparativeGenomicHybridization
      elsif attributes['Data_type'] == 'DNA_microarray' then
        data_type_individual = @base.DNAMicroarray
      elsif attributes['Data_type'] == 'DNA_sequence' then
        data_type_individual = @base.DNASequence
      elsif attributes['Data_type'] == 'RNA_sequence' then
        data_type_individual = @base.RNASequence
      else
        # TODO Error.
      end
      graph.insert(RDF::Statement.new(attribute_uri, @base.data_type, data_type_individual))
    elsif class_type == @base.TechnologyPlatform then
      if attributes.has_key?('Average_coverage') then
        graph.insert(RDF::Statement.new(attribute_uri, @base.average_coverage, RDF::Literal.new(attributes['Average_coverage'][0].to_i)))
      end
      if attributes.has_key?('Platform_class') then
        graph.insert(RDF::Statement.new(attribute_uri, @base.platform_class, RDF::Literal.new(attributes['Platform_class'][0])))
      end
      if attributes.has_key?('Platform_name') then
        graph.insert(RDF::Statement.new(attribute_uri, @base.platform_name, RDF::Literal.new(attributes['Platform_name'][0])))
      end
      if attributes.has_key?('Read_length') then
        graph.insert(RDF::Statement.new(attribute_uri, @base.read_length, RDF::Literal.new(attributes['Read_length'][0].to_i)))
      end
      if attributes.has_key?('Read_pair_span') then
        graph.insert(RDF::Statement.new(attribute_uri, @base.read_pair_span, RDF::Literal.new(attributes['Read_pair_span'][0].to_i)))
      end
      if attributes.has_key?('Read_type') then
        read_type_individual = nil
        attributes['Read_type'] = attributes['Read_type'][0] # TODO Make sure array is of length 1.
        if attributes['Read_type'] == 'fragment' then
          read_type_individual = @base.Fragment
        elsif attributes['Read_type'] == 'pair' then
          read_type_individual = @base.Pair
        else
          # TODO Error.
        end
        graph.insert(RDF::Statement.new(attribute_uri, @base.read_type, read_type_individual))
      end
    end
    structuredpragma_properties = @base.structuredpragma_properties.select { |uri| @base.is_object_property?(uri) }[0]
    attributes.keys.each { |tag|
      if tag.match(/^[a-z]/) then
        custom_attribute_uri = RDF::URI.new("#{attribute_uri.to_s}/attribute/#{tag}")
        graph.insert(RDF::Statement.new(custom_attribute_uri, RDF.type, @base.StructuredAttribute))
        graph.insert(RDF::Statement.new(custom_attribute_uri, @base.with_parent([ @base.tag ].flatten, @base.structuredattribute_properties)[0], tag))
        graph.insert(RDF::Statement.new(custom_attribute_uri, RDF.value, RDF::Literal.new(attributes[tag].join(','))))
        graph.insert(RDF::Statement.new(attribute_uri, @base.with_parent([ @base.attributes ].flatten, structuredpragma_properties)[0], custom_attribute_uri))
      end
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
      graph.insert(RDF::Statement.new(variant_uri, RDF.type, @base.Variant)) unless @variants.has_key?(variant_uri.to_s)
      @variants[variant_uri.to_s] = true
      graph.insert(RDF::Statement.new(variant_uri, @base.variant_seq, RDF::Literal.new(value)))
    }
  end
end

end

