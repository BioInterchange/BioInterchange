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
      
      puts "xml.text:"
      #xml.elements.each("//*") do |e|
      #  puts e.text
      #end
      
      
      recurse_elements(xml.elements)
      
      
      #can do xml.root.delete_all(xpath) if needed to drop random pdf containers from main text and from main offset calculations.
  
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
  
  
  def recurse_elements(elements)
    elements.each do |e|
      puts e.texts
      recurse_elements(e.elements)
    end
  end
  
  
  def recurse_doc(doc)
    doc.elements.each do |element|
			print "[", element.name.to_s, "]"
			element.each_recursive do |childElement|
				print "[", childElement.name.to_s, "]"
				puts childElement.texts
			end
		end
	end


end

end