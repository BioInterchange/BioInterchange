module BioInterchange::Readers

# A reader takes information from an input stream and creates an object model.
#
# For example, the input stream might hold text-mining data in JSON format. This JSON
# data is deserialized by the reader and turned into an object model representation,
# i.e. an instance of a Ruby class that describes the JSON data.
class Reader

  # Create a new instance of a JSON reader. Ideally you want to provide your own initialization
  # method in derived classes that takes some extra parameters for configuring/parametrizing the
  # data deserialization with +deserialize+.
  def initialize
  end
  
  # Reads data from the provided input stream and returns an input specific object model instance.
  #
  # +istream+:: input IO stream to deserialize 
  def deserialize(istream)
    raise 'You must implement this method, which reads data from an input stream and returns an object model instance.'
  end

end

end
