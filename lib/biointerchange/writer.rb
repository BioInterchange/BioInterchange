module BioInterchange

class Writer

  # Creates a new instance of a writer that will use the provided output stream to serialize object model instances.
  #
  # When you override this method, please make sure that the parameter `ostream` is assigned to the instance
  # variable `@ostream`. The instance variable `@ostream` will be used by the serialization helper-method
  # `create_triple`.
  #
  # +ostream+:: instance of IO or derivative class
  def initialize(ostream)
    raise BioInterchange::Exceptions::ImplementationWriterError, 'The output stream is not an instance of IO or its subclasses.' unless ostream.kind_of?(IO)
    @ostream = ostream
  end

  # Serializes an object model instance.
  #
  # +model+:: an object model instance
  def serialize(model)
    raise BioInterchange::Exceptions::ImplementationWriterError, 'You must implement this method, which takes an object model and serializes it into the output stream provided as constructor (\'initialize\') argument.'
  end

  # Creates a new triple and serializes it.
  #
  # +subject+::
  # +predicate+::
  # +object+::
  # +type+::
  def create_triple(subject, predicate, object, datatype = nil)
    @format = :ntriple
    subject_uri = subject
    subject_uri = subject_uri.to_s unless subject_uri.instance_of?(String)
    if @format == :turtle then
      subject_uri_prefix = uri_prefix(subject_uri)
      if subject_uri_prefix then
        subject_uri.sub!(subject_uri_prefix, @prefixes[subject_uri_prefix])
      else
        subject_uri = "<#{subject_uri}>"
      end
    else
      subject_uri = "<#{subject_uri}>"
    end

    predicate_uri = predicate
    predicate_uri = predicate_uri.to_s unless predicate_uri.instance_of?(String)
    if @format == :turtle then
      predicate_uri_prefix = uri_prefix(predicate_uri)
      if predicate_uri_prefix then
        predicate_uri.sub!(predicate_uri_prefix, @prefixes[predicate_uri_prefix])
      else
        predicate_uri = "<#{predicate_uri}>"
      end
      # In Turtle, 'rdf:type' can also be written as 'a':
      predicate_uri = 'a' if predicate_uri == 'rdf:type'
    else
      predicate_uri = "<#{predicate_uri}>"
    end

    object_representation = nil
    if object.kind_of?(RDF::URI) then
      object_uri = object.to_s
      if @format == :turtle then
        object_uri_prefix = uri_prefix(object_uri)
        if object_uri_prefix then
          object_representation = object_uri.sub(object_uri_prefix, @prefixes[object_uri_prefix])
        else
          object_representation = "<#{object_uri}>"
        end
      else
        object_representation = "<#{object_uri}>"
      end
    else
      if datatype then
        # TODO Append type.
        object_representation = "\"#{object.to_s}\"^^<#{datatype.to_s}>"
      else
        object_representation = "\"#{object.to_s}\""
      end
    end

    begin
      @ostream.puts("#{subject_uri} #{predicate_uri} #{object_representation} .")
    rescue Errno::EPIPE
      # Whenever an output pipe disappears, then the user may be happy with what he/she
      # has seen and hit Ctrl-C, or, piped the output through a UNIX command line tool
      # such as "head".
      exit 0
    end
  end

  # Finishes serializing triples.
  def close
    if @format == :turtle then
      # TODO
    end
  end

private

  #
  @prefixes = {
    'http://biohackathon.org/resource/faldo#'     => 'faldo:',
    'http://purl.obolibrary.org/obo/'             => 'obo:',
    'http://purl.org/dc/terms/'                   => 'dc:',
    'http://www.biointerchange.org/gfvo#'         => 'gfvo:',
    'http://www.w3.org/1999/02/22-rdf-syntax-ns#' => 'rdf:',
    'http://www.w3.org/2000/01/rdf-schema#'       => 'rdfs:',
    'http://www.w3.org/2001/XMLSchema#'           => 'xsd:',
    'http://www.w3.org/2002/07/owl#'              => 'owl:'
  }

  #
  def uri_prefix(uri)
    @prefixes.keys.each { |prefix|
      return prefix if uri.start_with?(prefix)
    }
    nil
  end

  # Returns a Turtle line for the previous triple that is serialized (not the current triple).
  def serialize_turtle
  end

end

end

