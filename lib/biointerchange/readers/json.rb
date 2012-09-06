module BioInterchange::TextMining

require 'rubygems'
require 'json'

class JsonReader

  def initialize(jsontype, name, name_uri, date = nil, processtype = Process::UNSPECIFIED, version = nil)
    @jsontype = jsontype
    @name = name
    @name_uri = name_uri
    @date = date
    @processtype = processtype
    
    @metadata = {}
    @metadata['version'] = version
  end
  
  def deserialize(inputstream)
  
    raise ArgumentError, 'InputStream not of type IO, cannot read.' unless inputstream.kind_of?(IO)
  
    @data = inputstream.read

    
    
    if @jsontype.match(/^pubannos$/)
      pubannos
    end
  end
  



private 

  def pubannos
    
    process = Process.new(@name, @name_uri, @date, @processtype, @metadata)
    
    
    result = JSON.parse(@data)
    
    if result.has_key? 'Error'
      raise "Error getting and parsing JSON file"
    end
    
    
    text = result['text']
    doc_uri = "http://pubannotation.dbcls.jp/pmdocs/" + result['pmid'].to_s
    
    doc = Document.new(doc_uri)
    docContent = Content.new(0, text.length, Content::DOCUMENT)
    
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
      con = Content.new(start_offset, length, Content::PHRASE)
      con.setContext(doc)
      doc.add(con)
      
      #set process.date = updated_time?
    
      #puts "'#{start_offset}' '#{end_offset}' '#{category}' '#{entity}' "
    
    end
    
    doc
  end
  

end

end
