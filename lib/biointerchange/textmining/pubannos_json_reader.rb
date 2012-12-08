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

    #hash to remember annotation in case they are needed for building upon based on ids later
    contents = {}

    if result['catanns']
      result['catanns'].each do |annot| 
        start_offset = 0
        end_offset = 0
        if annot['span']
          start_offset = annot['span']['begin']
          end_offset = annot['span']['end']
        elsif annot['begin'] and annot['end']
          start_offset = annot['begin']
          end_offset = annot['end']
        end
        length = end_offset - start_offset

        category = annot['category']
        id = annot['id']
        
        entity = text.slice(start_offset..end_offset)
      
        #phrase = type for NE
        con = Content.new(start_offset, length, Content::PHRASE, @process)
        con.setContext(doc)
        doc.add(con)

        contents[id] = con 
        
        #set process.date = updated_time?
      end
    end
    
    if result['insanns']
      result['insanns'].each do |annot|
        
        #unsure what to do about this (con1), 'E1' is the ID of something not created yet.
        #it is perhaps a case of making a new content, but with what params...?
        #need to conform what this is refering to with JDK
        con1 = nil  
        con2 = contents[annot['object']]
        
        #get annotation type
        type = ContentConnection::UNSPECIFIED
        case annot['type']
        when 'subClassOf'
          type = ContentConnection::SUBCLASS
        end
        connection = ContentConnection.new(con1, con2, type, @process)
        connection.setContext(doc)
        doc.add(connection)

        contents[annot['id']] = connection

      end
    end
    
    if result['relanns']
      result['relanns'].each do |annot|
        con1 = contents[annot['subject']]  
        con2 = contents[annot['object']]
        
        #get annotation type
        type = ContentConnection::UNSPECIFIED
        case annot['type']
        when 'equivalentTo'
          type = ContentConnection::EQUIVALENCE
        when 'themeOf'
          type = ContentConnection::THEME
        end
        connection = ContentConnection.new(con1, con2, type, @process)
        connection.setContext(doc)
        doc.add(connection)

        contents[annot['id']] = connection

      end
    end
    
    if result['modanns']
      result['modanns'].each do |annot|
        
        #in this case, it is a modification of an already existing content object (speculation/negation).  
        con = contents[annot['object']]
        
        #get annotation type
        type = ContentConnection::UNSPECIFIED
        case annot['type']
        when 'Speculation'
          type = ContentConnection::SPECULATION
        when 'Negation'
          type = ContentConnection::NEGATION
        end
        connection = ContentConnection.new(con, nil, type, @process)
        connection.setContext(doc)
        doc.add(connection)

        contents[annot['id']] = connection

      end
    end
    
    doc
  end
  

end

end
