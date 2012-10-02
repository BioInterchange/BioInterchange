require 'rdf'
require 'rdf/ntriples'
require 'date'

module BioInterchange::Genomics

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
  # +model+:: a generic representation of input data that is derived from BioInterchange::Genomics::FeatureSet
  def serialize(model)
    if model.instance_of?(BioInterchange::Genomics::FeatureSet) then
      serialize_model(model)
    else
      raise BioInterchange::Exceptions::ImplementationWriterError, 'The provided model cannot be serialized. ' +
                           'This writer supports serialization for BioInterchange::Genomics::FeatureSet.'
    end
  end

private

  # Serializes RDF for a feature set representation.
  #
  # +model+:: an instance of +BioInterchange::Genomics::FeatureSet+
  def serialize_model(model)
    graph = RDF::Graph.new
    set_uri = RDF::URI.new(model.uri)
    graph.insert(RDF::Statement.new(set_uri, RDF.type, BioInterchange::GFF3.Set))
    model.contents.each { |feature|
      serialize_feature(graph, set_uri, feature)
    }
    RDF::NTriples::Writer.dump(graph, @ostream)
  end

  # Serializes a +Feature+ object for a given feature set URI.
  #
  # +graph+:: RDF graph to which the feature is added
  # +set_uri+:: the feature set URI to which the feature belongs to
  # +feature+:: a +Feature+ instance
  def serialize_feature(graph, set_uri, feature)
    # TODO Make sure there is only one value in the 'ID' list.
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.sequence_id},#{feature.source},#{feature.type},#{feature.start_coordinate},#{feature.end_coordinate},#{feature.strand},#{feature.phase}") unless feature.attributes.has_key?('ID')
    feature_uri = RDF::URI.new("#{set_uri.to_s}/feature/#{feature.attributes['ID'][0]}") if feature.attributes.has_key?('ID')
    graph.insert(RDF::Statement.new(set_uri, BioInterchange::GFF3.contains, feature_uri))
    graph.insert(RDF::Statement.new(feature_uri, RDF.type, BioInterchange::GFF3.Feature))
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.seqid, RDF::Literal.new(feature.sequence_id)))
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.source, RDF::Literal.new(feature.source)))
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.type, RDF::Literal.new(feature.type)))
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.start, RDF::Literal.new(feature.start_coordinate)))
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.end, RDF::Literal.new(feature.end_coordinate)))
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.score, RDF::Literal.new(feature.score))) if feature.score
    case feature.strand
    when BioInterchange::Genomics::Feature::NOT_STRANDED
      graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.strand, BioInterchange::GFF3.NotStranded))
    when BioInterchange::Genomics::Feature::UNKNOWN
      graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.strand, BioInterchange::GFF3.UnknownStrand))
    when BioInterchange::Genomics::Feature::POSITIVE
      graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.strand, BioInterchange::GFF3.Positive))
    when BioInterchange::Genomics::Feature::NEGATIVE
      graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.strand, BioInterchange::GFF3.Negative))
    else
      raise ArgumentException, 'Strand of feature is set to an unknown constant.'
    end
    graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.phase, RDF::Literal.new(feature.phase))) if feature.phase

    serialize_attributes(graph, set_uri, feature_uri, feature.attributes) unless feature.attributes.keys.empty?
  end

  # Serializes the attributes of a feature.
  #
  # +graph+:: RDF graph to which the feature is added
  # +set_uri+:: URI of the set these attributes belong to (implicit due to feature)
  # +feature_uri+:: the feature URI to which the attributes belong to
  # +attribtues+:: a map of tag/value pairs
  def serialize_attributes(graph, set_uri, feature_uri, attributes)
    attributes.each_pair { |tag, list|
      if tag == 'Parent' then
        list.each { |parent_id|
          graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.parent, RDF::URI.new("#{set_uri.to_s}/feature/#{parent_id}")))
        }
      else
        list.each_index { |index|
          value = list[index]
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}") if list.size == 1
          attribute_uri = RDF::URI.new("#{feature_uri.to_s}/attribute/#{tag}-#{index + 1}") unless list.size == 1
          graph.insert(RDF::Statement.new(feature_uri, BioInterchange::GFF3.attributes, attribute_uri))
          graph.insert(RDF::Statement.new(attribute_uri, RDF.type, BioInterchange::GFF3.Attribute))
          graph.insert(RDF::Statement.new(attribute_uri, BioInterchange::GFF3.tag, RDF::Literal.new("#{tag}")))
          graph.insert(RDF::Statement.new(attribute_uri, RDF.value, RDF::Literal.new(value)))
        }
      end
    }
  end

end

end

