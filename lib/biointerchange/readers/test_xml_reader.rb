module BioInterchange::TextMining

require 'rexml/document'

class TestXmlReader < BioInterchange::TextMining::TMReader
  
  # Reads input stream and returns associated +BioInterchange::TextMining::Document+ model
  #
  # +inputstream+:: Input IO stream to deserialize 
  def deserialize(inputstream)
  
    super(inputstream)
    
    test
    
  end



private


  def test
  
    xml = REXML::Document.new(data)

    document.each_child
    parent.each_child(get tags only from that parent)  

  
  end


end

end