require 'rdf'
require 'rdf/ntriples'

module BioInterchange

class RDFWriter

  # Creates a new instance of a RDFWriter that will use the provided output stream to serialize RDF.
  #
  # +ostream+:: instance of an IO class or derivative that is used for RDF serialization
  def initialize(ostream)
    @ostream = ostream
  end

  # Serializes a model as RDF.
  #
  # +model+:: a generic representation of input data
  def serialize(model)
    if model.instance_of?(BioInterchange::Document) then
      serialize_document(model)
    else
      raise 'The povided model cannot be serialized at the moment. ' +
            'Supported classes are BioInterchange::Document (and that\'s it for now).'
    end
  end

private

  # Serializes RDF for a textual document representation
  #
  # +model+:: an instance of +BioInterchange::Document+
  def serialize_document(model)
    graph = RDF::Graph.new
    document = RDF::URI.new(model.uri)
    graph.insert(RDF::Statement.new(document, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_000148')))
    RDF::NTriples::Writer.buffer { |writer|
      graph.each_statement { |statement|
        writer << statement
      }
      puts "> #{writer}"
    }
  end

end

end

