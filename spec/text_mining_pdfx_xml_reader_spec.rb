
require 'rubygems'
require 'rspec'

describe BioInterchange::TextMining::PDFxXMLReader do
  describe 'deserialization of pdfx text-mining documents' do
  
    describe 'IO check' do
      before :all do 
        @reader = BioInterchange::TextMining::PDFxXMLReader.new("Test", "http://test.com", "00-00-0000", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
      end
      it 'reader is not postponed upon instantiation' do
        @reader.postponed?.should eql false
      end
      it 'read pdfx from string' do
        model = @reader.deserialize("<pdfx><job>text</job></pdfx>")
      
        model.should be_an_instance_of BioInterchange::TextMining::Document
      end
      it 'read pdfx from file' do
        model = @reader.deserialize(File.new('examples/gb-2007-8-3-R40.xml'))
      
        model.should be_an_instance_of BioInterchange::TextMining::Document
      end 
    end
  
    describe 'generated model check' do
  
      before :all do
        reader = BioInterchange::TextMining::PDFxXMLReader.new("Test", "http://test.com", "00-00-0000", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
        
        @model = reader.deserialize("<pdfx><job>rspec_test</job><article><article-title>TITLE</article-title><abstract>ABSTRACT</abstract><body>BODY TEXT<section>SECTION LEVEL 1<section>SECTION LEVEL 2.1</section><section>SECTION LEVEL 2.2</section>END SECTION LEVEL 1</section></body></article></pdfx>")
        
        #puts "Document Model: #{@model.uri}"
        #  @model.contents.each do |c|
        #  puts "\tContent: #{c.type}, #{c.offset}, #{c.length}"
        #end
      end
      
      it 'model is of type document' do
        @model.should be_an_instance_of BioInterchange::TextMining::Document
      end
      
      it 'document uri (job id read)' do
        @model.uri.should eql "http://pdfx.cs.man.ac.uk/rspec_test"
      end
      
      it 'document has content' do
        @model.contents.size.should eql 7
      end
      
      it 'document document' do 
        @model.contents[6].type.should eql BioInterchange::TextMining::Content::DOCUMENT and @model.contents[6].offset.should eql 0 and @model.contents[6].length.should eql 90
      end
      
      it 'document title' do
        @model.contents[0].type.should eql BioInterchange::TextMining::Content::TITLE and @model.contents[0].offset.should eql 0 and @model.contents[0].length.should eql 5
      end
      
      it 'document abstract' do
        @model.contents[1].type.should eql BioInterchange::TextMining::Content::ABSTRACT and @model.contents[1].offset.should eql 5 and @model.contents[1].length.should eql 8
      end
      
      it 'document body' do
        @model.contents[5].type.should eql BioInterchange::TextMining::Content::SECTION and @model.contents[5].offset.should eql 13 and @model.contents[5].length.should eql 77
      end
      
      it 'document sections' do
        @model.contents[2].type.should eql BioInterchange::TextMining::Content::SECTION and 
        @model.contents[2].offset.should eql 37 and 
        @model.contents[2].length.should eql 17 and 
        
        @model.contents[3].type.should eql BioInterchange::TextMining::Content::SECTION and 
        @model.contents[3].offset.should eql 54 and 
        @model.contents[3].length.should eql 17 and 
        
        @model.contents[4].type.should eql BioInterchange::TextMining::Content::SECTION and @model.contents[4].offset.should eql 22 and @model.contents[4].length.should eql 68
      end
  
    end
    
  end
  
end

