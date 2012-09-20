module BioInterchange::TextMining

require 'rexml/document'
require 'rexml/streamlistener'

class PdfxXmlReader < BioInterchange::TextMining::TMReader
  
  # Reads input stream and returns associated +BioInterchange::TextMining::Document+ model
  #
  # Presently I assume a single document per xml file,
  # and that <section> tags cannot nest. I also assume
  # that a Content::DOCUMENT type is everything between 
  # the <article> tags. 
  #
  # +inputstream+:: Input IO stream to deserialize 
  def deserialize(inputstream)
  
    #super(inputstream)
    
    raise ArgumentError, 'InputStream not of type IO, cannot read.' unless inputstream.kind_of?(IO) or inputstream.kind_of?(String)
    
    @input = inputstream
    
    pdfx
    
  end



private

  def pdfx
    list = MyListener.new
    REXML::Document.parse_stream(@input, list)
    return list.document
  end
    

	
	
	class MyListener
	
	  include REXML::StreamListener
    
    def initialize
      @map = {}
      
      #sections can nest, so "stack" them
      @map['sec_s'] = []
      @map['sec_l'] = []
    end
    
    
    def tag_start(name, attr)
      #puts "tag_start: #{name}"
      if name =~ /^job$/
        raise 'Document XML has multiple <job> tags, cannot parse multiple documents within a single file.' if @map['id_done']
        @map['id'] = true
      elsif name =~ /^article-title$/
        raise 'Document XML has multiple <article-title> tags defined, cannot parse multiple documents within a single file.' if @map['title_done']
        @map['title'] = true
        @map['title_s'] = @map['art_l']
        @map['title_l'] = 0
      elsif name =~ /^abstract$/
        raise 'Document XML has multiple <abstract> tags defined, cannot parse multiple documents within a single file.' if @map['abs_done']
        @map['abs'] = true
        @map['abs_s'] = @map['art_l']
        @map['abs_l'] = 0
      elsif name =~ /^body$/
        raise 'Document XML has multiple <body> tags defined, cannot parse multiple documents within a single file.' if @map['body_done']
        @map['body'] = true
        @map['body_s'] = @map['art_l']
        @map['body_l'] = 0
      elsif name =~ /^article$/
        raise 'Document XML has multiple <article> tags defined, cannot parse multiple documents within a single file.' if @map['art_done']
        @map['art'] = true
        @map['art_s'] = 0
        @map['art_l'] = 0
      elsif name =~ /^section$/
        raise 'Error with section stack, stacks not equal in size' unless  @map['sec_s'].size == @map['sec_l'].size
        @map['sec_s'].push @map['art_l']
        @map['sec_l'].push 0
      end
    end
  
  
    def text(data)
      
      if @map['art']
        @map['art_l'] += data.length
      end
      
      if @map['id']
        @doc = BioInterchange::TextMining::Document.new("http://pdfx.cs.man.ac.uk/" + data)
      elsif @map['title']
        @map['title_l'] += data.length
      elsif @map['abs']
        @map['abs_l'] += data.length
      end
      if @map['body']
        @map['body_l'] += data.length
      end
      if @map['sec_l'].size != 0
        #add length to *all* current sections
        @map['sec_l'].size.times do |i|
          @map['sec_l'][i] += data.length
        end
      end
      
    end
    
    #TODO add deal with <author> type tags
    
    def tag_end(name)
      #puts "tag_end: #{name}"
      if name =~ /^job$/
        @map['id'] = false
        @map['id_done'] = true
      elsif name =~ /^article-title$/
        @map['title'] = false
        dc = BioInterchange::TextMining::Content.new(@map['title_s'], @map['title_l'], BioInterchange::TextMining::Content::TITLE, @process)
        dc.setContext(@doc)
        @doc.add(dc)
        @map['title_done'] = true
      elsif name =~ /^abstract$/
        @map['abs'] = false
        dc = BioInterchange::TextMining::Content.new(@map['abs_s'], @map['abs_l'], BioInterchange::TextMining::Content::ABSTRACT, @process)
        dc.setContext(@doc)
        @doc.add(dc)
        @map['abs_done'] = true
      elsif name =~ /^body$/
        @map['body'] = false
        dc = BioInterchange::TextMining::Content.new(@map['body_s'], @map['body_l'], BioInterchange::TextMining::Content::SECTION, @process)
        dc.setContext(@doc)
        @doc.add(dc)
        @map['body_done'] = true
      elsif name =~ /^article$/
        @map['art'] = false
        dc = BioInterchange::TextMining::Content.new(@map['art_s'], @map['art_l'], BioInterchange::TextMining::Content::DOCUMENT, @process)
        dc.setContext(@doc)
        @doc.add(dc)
        @map['art_done'] = true
      elsif name =~ /^section$/
        raise 'Error with section stack, stacks not equal in size' unless  @map['sec_s'].size == @map['sec_l'].size
        dc = BioInterchange::TextMining::Content.new(@map['sec_s'].pop, @map['sec_l'].pop, BioInterchange::TextMining::Content::SECTION, @process)
        dc.setContext(@doc)
        @doc.add(dc)
      end
    end
    
    def document
      @doc
    end
    
  end
  


end

end
