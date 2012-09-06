require 'rdf'
require 'rdf/ntriples'

module BioInterchange::IO

class RDFWriter

  # Creates a new instance of a RDFWriter that will use the provided output stream to serialize RDF.
  #
  # +ostream+:: instance of an IO class or derivative that is used for RDF serialization
  def initialize(ostream)
    raise ArgumentError, 'The output stream is not an instance of IO or its subclasses.' unless ostream.kind_of?(IO)
    @ostream = ostream
  end

  # Serializes a model as RDF.
  #
  # +model+:: a generic representation of input data
  def serialize(model)
    if model.instance_of?(BioInterchange::TextMining::Document) then
      serialize_document(model)
    else
      raise ArgumentError, 'The povided model cannot be serialized at the moment. ' +
                           'Supported classes are BioInterchange::TextMining::Document (and that\'s it for now).'
    end
  end

private

  # Serializes RDF for a textual document representation using the Semanticsciene Integrated Ontology
  # (http://code.google.com/p/semanticscience/wiki/SIO).
  #
  # +model+:: an instance of +BioInterchange::TextMining::Document+
  def serialize_document(model)
    graph = RDF::Graph.new
    document_uri = RDF::URI.new(model.uri)
    graph.insert(RDF::Statement.new(document_uri, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_000148')))
    model.contents.each { |content|
      graph.insert(serialize_content(graph, document_uri, content))
    }
    RDF::NTriples::Writer.dump(graph, @ostream)
  end

  # 
  #
  #
  def serialize_content(graph, document_uri, content)
    graph.insert(RDF::Statement.new(document_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000068'), RDF::URI.new(content.uri)))
  end

end

end

