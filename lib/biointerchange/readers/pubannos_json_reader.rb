module BioInterchange::TextMining

require 'rubygems'
require 'json'

class PubannosJsonReader < BioInterchange::IO::Reader

  def deserialize(inputstream)
  
    super(inputstream)
    
    pubannos
    
  end
  



private 

  # Specific method for parsing of *Pubannotations* json format
  def pubannos
    
    result = JSON.parse(@data)
    
    if result.has_key? 'Error'
      raise "Error getting and parsing JSON file"
    end
    
    
    text = result['text']
    doc_uri = "http://pubannotation.dbcls.jp/pmdocs/" + result['pmid'].to_s
    
    doc = Document.new(doc_uri)
    docContent = Content.new(0, text.length, Content::DOCUMENT, @process)
    docContent.setContext(doc)
    doc.add(docContent)
    
    #so our document requires content of type document or abstract
    #should it hold the content string?
    
    result['catanns'].each do |annot| 
      start_offset = annot['begin']
      end_offset = annot['end']
      length = end_offset - start_offset
      created_time = annot['created_at']
      updated_time = annot['updated_at']
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
    
    doc
  end
  

end

end
