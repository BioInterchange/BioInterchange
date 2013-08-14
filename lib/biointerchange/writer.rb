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
    @format = :ntriples
    subject_uri = subject
    subject_uri = subject_uri.to_s unless subject_uri.instance_of?(String)
    subject_uri = "<#{subject_uri}>"

    predicate_uri = predicate
    predicate_uri = predicate_uri.to_s unless predicate_uri.instance_of?(String)
    predicate_uri = "<#{predicate_uri}>"

    object_representation = nil
    if object.kind_of?(RDF::URI) then
      object_uri = object.to_s
      object_representation = "<#{object_uri}>"
    else
      if datatype then
        # TODO Append type.
        object_representation = "\"#{object.to_s}\"^^<#{datatype.to_s}>"
      else
        object_representation = "\"#{object.to_s}\""
      end
    end

    begin
      if @format == :turtle then
        serialize_turtle(subject_uri, predicate_uri, object_representation)
      else
        @ostream.puts("#{subject_uri} #{predicate_uri} #{object_representation}")
      end
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
      serialize_turtle()
    end
  end

  def set_base(uri_prefix)
    uri_prefix(nil)
    @prefixes["<#{uri_prefix}"] = '<'
  end

  #
  def add_prefix(uri_prefix, abbreviation_prefix)
    uri_prefix(nil)
    @prefixes["<#{uri_prefix}"] = "#{abbreviation_prefix}:"
  end

private

  #
  def uri_prefix(uri)
    #
    @prefixes = {
      '<http://biohackathon.org/resource/faldo#'     => 'faldo:',
      '<http://purl.obolibrary.org/obo/'             => 'obo:',
      '<http://purl.org/dc/terms/'                   => 'dc:',
      '<http://www.biointerchange.org/gfvo#'         => 'gfvo:',
      '<http://www.w3.org/1999/02/22-rdf-syntax-ns#' => 'rdf:',
      '<http://www.w3.org/2000/01/rdf-schema#'       => 'rdfs:',
      '<http://www.w3.org/2001/XMLSchema#'           => 'xsd:',
      '<http://www.w3.org/2002/07/owl#'              => 'owl:'
    } unless @prefixes

    return nil unless uri

    @prefixes.keys.each { |prefix|
      return prefix if uri.start_with?(prefix)
    }
    nil
  end

  # Returns a Turtle line for the previous triple that is serialized (not the current triple).
  def serialize_turtle(subject_uri = nil, predicate_uri = nil, object_representation = nil)
    unless @last_triple then
      @last_triple = [ subject_uri, predicate_uri, object_representation ]
      @last_triple_identical = [ false, false ]
      @prefixes.each_pair { |prefix_uri, prefix_abbreviation|
        @ostream.puts("@prefix #{prefix_abbreviation} #{prefix_uri}> .") unless prefix_abbreviation == '<'
      }
      @prefixes.each_pair { |prefix_uri, prefix_abbreviation|
        @ostream.puts("@base #{prefix_uri}> .") if prefix_abbreviation == '<'
      }
      return
    end
    last_uri = [ nil, nil, @last_triple[2] ]
    (0..1).each { |column|
      if @last_triple_identical[column] then
        last_uri[column] = '   '
      else
        last_uri[column] = @last_triple[column]
      end
    }
    @last_triple_identical[0] = @last_triple[0] == subject_uri
    @last_triple_identical[1] = @last_triple_identical[0] == true && @last_triple[1] == predicate_uri
    mark = '.'
    mark = ';' if @last_triple_identical[0] == true and @last_triple_identical[1] == false
    mark = ',' if @last_triple_identical[0] == true and @last_triple_identical[1] == true
    (0..2).each { |column|
      uri_prefix = uri_prefix(last_uri[column])
      if uri_prefix then
        abbrev = @prefixes[uri_prefix]
        if abbrev == '<'
          last_uri[column] = last_uri[column].sub(uri_prefix, @prefixes[uri_prefix])
        else
          last_uri[column] = last_uri[column].sub(uri_prefix, @prefixes[uri_prefix])[0..-2]
        end
      end
    }
    # In Turtle, 'rdf:type' can also be written as 'a':
    last_uri[1] = 'a' if last_uri[1] == 'rdf:type'
    @ostream.puts("#{last_uri[0]} #{last_uri[1]} #{last_uri[2]} #{mark}")
    @last_triple[0] = subject_uri
    @last_triple[1] = predicate_uri
    @last_triple[2] = object_representation
  end

end

end

