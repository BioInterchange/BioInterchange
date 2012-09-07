require 'rdf'
require 'rdf/ntriples'

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
  # +model+:: a generic representation of input data
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
    #  RDF::URI.new("#{base_uri}/self/#{process.uri.sub(/^.*?:\/\//, '')}")
    when :start
      RDF::URI.new("#{base_uri}/start/#{process.uri.sub(/^.*?:\/\//, '')}")
    when :stop
      RDF::URI.new("#{base_uri}/stop/#{process.uri.sub(/^.*?:\/\//, '')}")
    #when :type
    #  RDF::URI.new("#{base_uri}/type/#{process.uri.sub(/^.*?:\/\//, '')}")
    else
      raise "There is no implementation for serializing a process as #{kind}."
    end
  end

  # Serializes RDF for a textual document representation using the Semanticsciene Integrated Ontology
  # (http://code.google.com/p/semanticscience/wiki/SIO).
  #
  # +model+:: an instance of +BioInterchange::TextMining::Document+
  def serialize_document(model)
    graph = RDF::Graph.new
    document_uri = RDF::URI.new(model.uri)
    graph.insert(RDF::Statement.new(document_uri, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_000148')))
    model.contents.each { |content|
      serialize_content(graph, document_uri, content)
    }
    RDF::NTriples::Writer.dump(graph, @ostream)
  end


  # Serializes a Content object for a given document uri  
  #
  #
  def serialize_content(graph, document_uri, content)
    content_uri = RDF::URI.new(content.uri)
    graph.insert(RDF::Statement.new(document_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000068'), content_uri))
    serialize_process(graph, document_uri, content_uri, content.process) if content.process
    
    sio_id = "000078"
    case content.type
    when Content::UNSPECIFIED
      sio_id = "000078"
    when Content::DOCUMENT
      sio_id = "000148"
    when Content::PAGE
      sio_id = "000111"
    when Content::TITLE
      sio_id = "000185"
    when Content::AUTHOR
      sio_id = "000191"
    when Content::ABSTRACT
      sio_id = "000188"
    when Content::SECTION
      sio_id = "000111"
    when Content::PARAGRAPH
      sio_id = "000110"
    when Content::SENTENCE
      sio_id = "000113"
    when Content::PHRASE
      sio_id = "000483"
    when Content::WORD
      sio_id = "000114"
    when Content::CHARACTER
      sio_id = "000108"
    end
    
    graph.insert(RDF::Statement.new(content_uri, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_#{sio_id}')))
    
    graph.insert(RDF::Statement.new(content_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000008'), serialize_content_start(graph, document_uri, content_uri, process_uri, content)))
    graph.insert(RDF::Statement.new(content_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000008'), serialize_content_stop(graph, document_uri, content_uri, process_uri, content)))
  
  end

  # Serializes a process object for a specific document uri
  #
  #
  def serialize_process(graph, document_uri, content_uri, process)
    process_uri = process_uri(process, :process)
    graph.insert(RDF::Statement.new(content_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000068'), process_uri))
    # If this is an email address, then create a FOAF representation, otherwise, do something else:
    if process.type == BioInterchange::TextMining::Process::MANUAL then
      graph.insert(RDF::Statement.new(process_uri, RDF.type, RDF::FOAF.Person))
      graph.insert(RDF::Statement.new(process_uri, RDF::FOAF.name, RDF::Literal.new(process.name)))
      graph.insert(RDF::Statement.new(process_uri, RDF::FOAF.name, RDF::URI.new(process.uri)))
    else
      graph.insert(RDF::Statement.new(process_uri, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_000006')))
      graph.insert(RDF::Statement.new(process_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000068'), serialize_process_name(graph, document_uri, content_uri, process_uri, process)))
      graph.insert(RDF::Statement.new(process_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000068'), serialize_process_uri(graph, document_uri, content_uri, process_uri, process)))
      graph.insert(RDF::Statement.new(process_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000068'), serialize_process_date(graph, document_uri, content_uri, process_uri, process)))
    end
  end

  #
  #
  #
  def serialize_process_name(graph, document_uri, content_uri, process_uri, process)
    kind_uri = process_uri(process, :name)
    graph.insert(RDF::Statement.new(kind_uri, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_000116')))
    graph.insert(RDF::Statement.new(kind_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000300'), RDF::Literal.new(process.name)))
  end

  #
  #
  #
  def serialize_process_uri(graph, document_uri, content_uri, process_uri, process)
    kind_uri = process_uri(process, :uri)
    graph.insert(RDF::Statement.new(kind_uri, RDF.type, RDF::URI.new('http://semanticscience.org/resource/SIO_000097')))
    graph.insert(RDF::Statement.new(kind_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000300'), RDF::URI.new(process.uri)))
  end

  #
  #
  #
  def serialize_process_date(graph, document_uri, content_uri, process_uri, process)
    if process.date 
      puts "Date: #{process.date}"
    end
    kind_uri = process_uri(process, :date)
    graph.insert(RDF::Statement.new(kind_uri, RDF::DC.date, RDF::Literal.new(Date.parse(process.date))))
  end

  #
  #
  #
  def serialize_content_start(graph, document_uri, content_uri, process_uri, content)
    kind_uri = content_uri(content, :start)
    graph.insert(RDF::Statement.new(kind_uri, RDF::type, RDF::URI.new('http://semanticscience.org/resource/SIO_000943')))
    graph.insert(RDF::Statment.new(kind_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000300'), RDF::Literal.new(content.offset)))
  end
  
  #
  #
  #
  def serialize_content_stop(graph, document_uri, content_uri, process_uri, content)
    kind_uri = content_uri(content, :stop)
    graph.insert(RDF::Statement.new(kind_uri, RDF::type, RDF::URI.new('http://semanticscience.org/resource/SIO_000953')))
    graph.insert(RDF::Statment.new(kind_uri, RDF::URI.new('http://semanticscience.org/resource/SIO_000300'), RDF::Literal.new((content.offset+content.length).to_s)))
  end

end

end

