module BioInterchange::TextMining

class TMReader < BioInterchange::Reader

  # Create a new instance of a JSON reader. Sets @process to a new +BioInterchange::TextMining::Process+ object.
  #
  # +jsontype+:: Format of JSON file for parse (currently only support the json format from Pubannots annotation: pubannos)
  # +name+:: Name of the process which generated this data
  # +name_uri+:: URI of the resource that generated this data
  # +date+:: Optional date of data creation
  # +processtype+:: Type of process that created this content
  # +version+:: Optional version number of resource that created this data (nil if manually curated, for example).
  def initialize(name, name_uri, date = nil, processtype = BioInterchange::TextMining::Process::UNSPECIFIED, version = nil)
  
    metadata = {}
    metadata[BioInterchange::TextMining::Process::VERSION] = version
    @process = BioInterchange::TextMining::Process.new(name, name_uri, processtype, metadata, date)
    
  end
  
  
  # Reads input stream and returns associated model. Super call this method before before overriding to provide access to a @data string containing the inputstream text.
  #
  # +inputstream+:: Input IO stream to deserialize 
  def deserialize(inputstream)
    raise ArgumentError, 'InputStream not of type IO, cannot read.' unless inputstream.kind_of?(IO)
  
    @data = inputstream.read
  end
  
  
end

end
