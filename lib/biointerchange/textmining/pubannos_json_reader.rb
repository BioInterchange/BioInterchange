module BioInterchange::TextMining

require 'rubygems'
require 'json'

class PubannosJsonReader < BioInterchange::TextMining::TMReader

  def deserialize(inputstream)
    if inputstream.kind_of?(IO) then
      pubannos(inputstream.read)
    elsif inputstream.kind_of?(String) then
      pubannos(inputstream)
    else
      #else raise exception
      super(inputstream)
    end
  end

private 

  # Specific method for parsing of *Pubannotations* json format
  def pubannos(data)
    
    result = JSON.parse(data)
    
    if result.has_key? 'Error'
      raise BioInterchange::Exceptions::InputFormatError, 'Error parsing the JSON input file: #{result["Error"]}'
    end
    
   
    text = result['text']
    #doc_uri = "http://pubannotation.dbcls.jp/pmdocs/" + result['pmid'].to_s
    doc_uri = result['docurl']
    
    doc = Document.new(doc_uri)
    docContent = Content.new(0, text.length, Content::DOCUMENT, @process)
    docContent.setContext(doc)
    doc.add(docContent)
    
    #so our document requires content of type document or abstract
    #should it hold the content string?
    
    if result['catanns']
      result['catanns'].each do |annot| 
        start_offset = annot['span']['begin']
        end_offset = annot['span']['end']
        length = end_offset - start_offset
        #created_time = annot['created_at']
        #updated_time = annot['updated_at']
        category = annot['category']
        #annset_id = annot['annset_id']
        #doc_id = annot['doc_id']
        #id = annot['id']
        
        entity = text.slice(start_offset..end_offset)
      
        #phrase = type for NE
        con = Content.new(start_offset, length, Content::PHRASE, @process)
        con.setContext(doc)
        doc.add(con)
        
        #set process.date = updated_time?
      end
    end
    
    if result['insanns']
      result['insanns'].each do |annot|

      end
    end
    
    if result['relanns']
      result['relanns'].each do |annot|

      end
    end
    
    if result['modanns']
      result['modanns'].each do |annot|

      end 
    end
    
    doc
  end
  

end

end
