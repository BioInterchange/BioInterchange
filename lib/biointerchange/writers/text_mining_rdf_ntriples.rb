require 'rdf'
require 'rdf/ntriples'
require 'date'

module BioInterchange::TextMining

class RDFWriter < BioInterchange::Writer

  # Creates a new instance of a RDFWriter that will use the provided output stream to serialize RDF.
  #
  # +ostream+:: instance of an IO class or derivative that is used for RDF serialization
  def initialize(ostream)
    raise ArgumentError, 'The output stream is not an instance of IO or its subclasses.' unless ostream.kind_of?(IO)
    @ostream = ostream
  end

  # Serializes a model as RDF.
  #
  # +model+:: a generic representation of input data that is derived from BioInterchange::TextMining::Document
  def serialize(model)
    if model.instance_of?(BioInterchange::TextMining::Document) then
      serialize_document(model)
    else
      raise ArgumentError, 'The provided model cannot be serialized at the moment. ' +
                           'Supported classes are BioInterchange::TextMining::Document (and that\'s it for now).'
    end
  end

private

  # Generates an URI for a given process and its contents.
  #
  # +process+:: process instance
  # +kind+:: kind of the URI that should be generated, for example, whether the URI should represent the name, date, etc.
  def process_uri(process, kind)
    base_uri = 'biointerchange://textmining/process'
    case kind
    when :process
      RDF::URI.new("#{base_uri}/self/#{process.uri.sub(/^.*?:\/\//, '')}")
    when :name
      RDF::URI.new("#{base_uri}/name/#{process.uri.sub(/^.*?:\/\//, '')}")
    when :uri
      RDF::URI.new("#{base_uri}/uri/#{process.uri.sub(/^.*?:\/\//, '')}")
    when :date
      RDF::URI.new("#{base_uri}/date/#{process.uri.sub(/^.*?:\/\//, '')}")
    else
      raise "There is no implementation for serializing a process as #{kind}."
    end
  end
  
  # Generates an URI for a given content and its contents.
  #
  # +content+:: content instance
  # +kind+:: kind of the URI that should be generated, for example, whether the URI should represent the name, date, etc.
  def content_uri(content, kind)
    base_uri = 'biointerchange://textmining/content'
    case kind
    #when :content
    #  RDF::URI.new("#{base_uri}/self/#{content.uri.sub(/^.*?:\/\//, '')}")
    when :start
      RDF::URI.new("#{base_uri}/start/#{content.uri.sub(/^.*?:\/\//, '')}")
    when :stop
      RDF::URI.new("#{base_uri}/stop/#{content.uri.sub(/^.*?:\/\//, '')}")
    #when :type
    #  RDF::URI.new("#{base_uri}/type/#{content.uri.sub(/^.*?:\/\//, '')}")
    else
      raise "There is no implementation for serializing a content as #{kind}."
    end
  end

  # Serializes RDF for a textual document representation using the Semanticsciene Integrated Ontology
  # (http://code.google.com/p/semanticscience/wiki/SIO).
  #
  # +model+:: an instance of +BioInterchange::TextMining::Document+
  def serialize_document(model)
    graph = RDF::Graph.new
    document_uri = RDF::URI.new(model.uri)
    graph.insert(RDF::Statement.new(document_uri, RDF.type, BioInterchange::SIO.document))
    model.contents.each { |content|
      serialize_content(graph, document_uri, content)
    }
    RDF::NTriples::Writer.dump(graph, @ostream)
  end


  # Serializes a Content object for a given document URI.
  #
  # +graph+:: RDF graph to which content is added
  # +document_uri+:: the document URI to which the added content belongs to
  # +content+:: an instance that describes the content
  def serialize_content(graph, document_uri, content)
    content_uri = RDF::URI.new(content.uri)
    graph.insert(RDF::Statement.new(document_uri, BioInterchange::SIO.has_attribute, content_uri))
    serialize_process(graph, document_uri, content_uri, content.process) if content.process
    
    sio_url = BioInterchange::SIO.language_entity
    case content.type
    when Content::UNSPECIFIED
      sio_url = BioInterchange::SIO.language_entity
    when Content::DOCUMENT
      sio_url = BioInterchange::SIO.document
    when Content::PAGE
      sio_url = BioInterchange::SIO.document_section
    when Content::TITLE
      sio_url = BioInterchange::SIO.title
    when Content::AUTHOR
      sio_url = BioInterchange::SIO.author_section
    when Content::ABSTRACT
      sio_url = BioInterchange::SIO.abstract_section
    when Content::SECTION
      sio_url = BioInterchange::SIO.document_section
    when Content::PARAGRAPH
      sio_url = BioInterchange::SIO.paragraph
    when Content::SENTENCE
      sio_url = BioInterchange::SIO.sentence
    when Content::PHRASE
      sio_url = BioInterchange::SIO.phrase
    when Content::WORD
      sio_url = BioInterchange::SIO.word
    when Content::CHARACTER
      sio_url = BioInterchange::SIO.character
    end
    
    graph.insert(RDF::Statement.new(content_uri, RDF.type, sio_url))
    
    graph.insert(RDF::Statement.new(content_uri, BioInterchange::SIO.has_attribute, serialize_content_start(graph, document_uri, content_uri, content)))
    graph.insert(RDF::Statement.new(content_uri, BioInterchange::SIO.has_attribute, serialize_content_stop(graph, document_uri, content_uri, content)))
  
  end

  # Serializes a process object for a specific document uri
  #
  #
  def serialize_process(graph, document_uri, content_uri, process)
    process_uri = process_uri(process, :process)
    graph.insert(RDF::Statement.new(content_uri, BioInterchange::SIO.is_direct_part_of, process_uri))
    # If this is an email address, then create a FOAF representation, otherwise, do something else:
    if process.type == BioInterchange::TextMining::Process::MANUAL then
      graph.insert(RDF::Statement.new(process_uri, RDF.type, RDF::FOAF.Person))
      graph.insert(RDF::Statement.new(process_uri, RDF::FOAF.name, RDF::Literal.new(process.name)))
      graph.insert(RDF::Statement.new(process_uri, RDF::FOAF.name, RDF::URI.new(process.uri)))
    else
      graph.insert(RDF::Statement.new(process_uri, RDF.type, BioInterchange::SIO.process))
      graph.insert(RDF::Statement.new(process_uri, BioInterchange::SIO.has_attribute, serialize_process_name(graph, document_uri, content_uri, process_uri, process)))
      graph.insert(RDF::Statement.new(process_uri, BioInterchange::SIO.has_attribute, serialize_process_uri(graph, document_uri, content_uri, process_uri, process)))
      graph.insert(RDF::Statement.new(process_uri, BioInterchange::SIO.has_attribute, serialize_process_date(graph, document_uri, content_uri, process_uri, process))) if process.date
    end
  end

  #
  #
  #
  def serialize_process_name(graph, document_uri, content_uri, process_uri, process)
    kind_uri = process_uri(process, :name)
    graph.insert(RDF::Statement.new(kind_uri, RDF.type, BioInterchange::SIO.name))
    graph.insert(RDF::Statement.new(kind_uri, BioInterchange::SIO.has_attribute, RDF::Literal.new(process.name)))
  end

  #
  #
  #
  def serialize_process_uri(graph, document_uri, content_uri, process_uri, process)
    kind_uri = process_uri(process, :uri)
    graph.insert(RDF::Statement.new(kind_uri, RDF.type, BioInterchange::SIO.software_entity))
    graph.insert(RDF::Statement.new(kind_uri, BioInterchange::SIO.has_attribute, RDF::URI.new(process.uri)))
  end

  #
  #
  #
  def serialize_process_date(graph, document_uri, content_uri, process_uri, process)
    kind_uri = process_uri(process, :date)
    graph.insert(RDF::Statement.new(kind_uri, RDF::DC.date, RDF::Literal.new(Date.parse(process.date))))
  end

  #
  #
  #
  def serialize_content_start(graph, document_uri, content_uri, content)
    kind_uri = content_uri(content, :start)
    graph.insert(RDF::Statement.new(kind_uri, RDF::type, BioInterchange::SIO.start_position))
    graph.insert(RDF::Statement.new(kind_uri, BioInterchange::SIO.has_attribute, RDF::Literal.new(content.offset)))
  end
  
  #
  #
  #
  def serialize_content_stop(graph, document_uri, content_uri, content)
    kind_uri = content_uri(content, :stop)
    graph.insert(RDF::Statement.new(kind_uri, RDF::type, BioInterchange::SIO.stop_position))
    graph.insert(RDF::Statement.new(kind_uri, BioInterchange::SIO.has_attribute, RDF::Literal.new((content.offset+content.length).to_s)))
  end

end

end

