module BioInterchange::TextMining

require 'rexml/document'

class XmlReader

  # Create a new instance of a JSON reader.
  #
  # +xmltype+:: Format of XML file for parse (currently no support)
  # +name+:: Name of the process which generated this data
  # +name_uri+:: URI of the resource that generated this data
  # +date+:: Optional date of data creation
  # +processtype+:: Type of process that created this content
  # +version+:: Optional version number of resource that created this data (nil if manually curated, for example).
  def initialize(xmltype, name, name_uri, date = nil, processtype = Process::UNSPECIFIED, version = nil)
    @xmltype = xmltype
    
    metadata = {}
    metadata[Process::VERSION] = version
    
    @process = Process.new(name, name_uri, date, processtype, metadata)
    
  end
  
  # Reads input stream and returns associated +BioInterchange::TextMining::Document+ model
  #
  # +inputstream+:: Input IO stream to deserialize 
  def deserialize(inputstream)
  
    raise ArgumentError, 'InputStream not of type IO, cannot read.' unless inputstream.kind_of?(IO)
  
    @data = inputstream.read
    
    if @xmltype.match(/^test$/)
      test
    end
  end



private


  def test
  
    xml = REXML::Document.new(data)

    document.each_child
    parent.each_child (get tags only from that parent)  

  
  end


end

end