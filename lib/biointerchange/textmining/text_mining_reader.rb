module BioInterchange::TextMining

class TMReader < BioInterchange::Reader

  # Create a new instance of a text-mining data reader. Sets @process to a new +BioInterchange::TextMining::Process+ object.
  #
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
    raise BioInterchange::Exceptions::ImplementationReaderError, 'InputStream not of type IO, cannot read.' unless inputstream.kind_of?(IO)
  end

  # Returns true if the reading of the input was postponed due to a full batch.
  # The current implementation does not support batch processing though, which
  # means that this method always returns false.
  def postponed?
    false
  end
  
protected

  # Automatically tries to determine a suitable process from the given name ID, which is assumed
  # to be either an email address or web-site.
  #
  # +name_id+:: name ID that we want to represent by a suitable process
  def self.determine_process(name_id)
    process = BioInterchange::TextMining::Process::UNSPECIFIED
    process = BioInterchange::TextMining::Process::MANUAL if name_id.match(/[^@]+@[^@]+/)
    process = BioInterchange::TextMining::Process::SOFTWARE if name_id.match(/[a-zA-Z]+:\/\//)
    process
  end
  
end

end
