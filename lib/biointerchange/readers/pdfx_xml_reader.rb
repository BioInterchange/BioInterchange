module BioInterchange::TextMining

require 'rexml/document'

class PdfxXmlReader < BioInterchange::TextMining::TMReader
  
  # Reads input stream and returns associated +BioInterchange::TextMining::Document+ model
  #
  # +inputstream+:: Input IO stream to deserialize 
  def deserialize(inputstream)
  
    super(inputstream)
    
    pdfx
    
  end



private

  #may need to be part of a block if multiple <job> tags
  def pdfx
  
    xml = REXML::Document.new(@data)

    xml.elements.each("/pdfx/meta/job") do |id|
      doc_uri = "http://pdfx.cs.man.ac.uk/" + id.text
  
      doc = Document.new(doc_uri)
      docContent = Content.new(0, 0, Content::DOCUMENT, @process)
      docContent.setContext(doc)
      doc.add(docContent)
      
      #xml.root.text
  
      start_offset = 0
      length = 0
  
      xml.elements.each("//article_title") do |c|
        con = Content.new(start_offset, length, Content::TITLE, @process)
        con.setContext(doc)
        doc.add(con)
      end  
      
      xml.elements.each("//abstract") do |c|
        con = Content.new(start_offset, length, Content::ABSTRACT, @process)
        con.setContext(doc)
        doc.add(con)
      end  
      
      xml.elements.each("//body") do |c|
        con = Content.new(start_offset, length, Content::SECTION, @process)
        con.setContext(doc)
        doc.add(con)
      end  
    
    return doc
    end
      
  end


end

end