module BioInterchange::IO

class Writer

  # Creates a new instance of a writer that will use the provided output stream to serialize object model instances.
  #
  # +ostream+:: instance of IO or derivative class
  def initialize(ostream)
    raise ArgumentError, 'The output stream is not an instance of IO or its subclasses.' unless ostream.kind_of?(IO)
    @ostream = ostream
  end

  # Serializes an object model instance.
  #
  # +model+:: an object model instance
  def serialize(model)
    raise 'You must implement this method, which takes an object model and serializes it into the previously provided output stream.'
  end

end

end

