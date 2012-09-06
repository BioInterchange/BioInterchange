module BioInterchange::TextMining

require 'rubygems'
require 'json'

class JsonReader

  # Create a new instance of a JSON reader.
  #
  # +jsontype+:: Format of JSON file for parse (currently only support the json format from Pubannots annotation: pubannos)
  # +name+:: Name of the process which generated this data
  # +name_uri+:: URI of the resource that generated this data
  # +date+:: Optional date of data creation
  # +processtype+:: Type of process that created this content
  # +version+:: Optional version number of resource that created this data (nil if manually curated, for example).
  def initialize(jsontype, name, name_uri, date = nil, processtype = Process::UNSPECIFIED, version = nil)
    @jsontype = jsontype
    
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

    
    
    if @jsontype.match(/^pubannos$/)
      pubannos
    end
  end
  



private 

  # Specific method for parsing of *Pubannotations* json format
  # Might later see what I can abstract away into a outer class instead making a Pubannots parser a specific subclass of that instead
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
    
      #puts "'#{start_offset}' '#{end_offset}' '#{category}' '#{entity}' "
    
    end
    
    doc
  end
  

end

end
