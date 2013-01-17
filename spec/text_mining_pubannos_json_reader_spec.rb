
require 'rubygems'
require 'rspec'

# Turn off verbose reporting here, since class definitions may be loaded multiple
# times here. That reports that constants have been already been initialized, which
# is true, but they are only "re-initialized" with the very same values.
v, $VERBOSE = $VERBOSE, nil
load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/reader.rb'
load 'lib/biointerchange/textmining/text_mining_reader.rb'
load 'lib/biointerchange/textmining/pubannos_json_reader.rb'
load 'lib/biointerchange/textmining/document.rb'
load 'lib/biointerchange/textmining/content.rb'
load 'lib/biointerchange/textmining/content_connection.rb'
load 'lib/biointerchange/textmining/process.rb'
$VERBOSE = v

describe BioInterchange::TextMining::PubannosJsonReader do
  describe 'deserialization of pubannos json text-mining documents' do
  
    describe 'IO check' do
      before :all do 
        @reader = BioInterchange::TextMining::PubannosJsonReader.new("Test", "http://test.com", "00-00-0000", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
      end
      it 'reader is not postponed upon instantiation' do
        @reader.postponed?.should eql false
      end
      it 'read json from string' do
        model = @reader.deserialize('{"docurl":"http://example.org/test","text":""}')
      
        model.should be_an_instance_of BioInterchange::TextMining::Document
      end
      it 'read json from file' do
        model = @reader.deserialize(File.new('examples/pubannotation.10096561.json'))
      
        model.should be_an_instance_of BioInterchange::TextMining::Document
      end 

	  it 'read old json from file' do
        model = @reader.deserialize(File.new('examples/pubannotation.10096561.json.old'))
      
        model.should be_an_instance_of BioInterchange::TextMining::Document
      end 
    end

    describe 'old json generated model checks' do
      before :all do
        reader = BioInterchange::TextMining::PubannosJsonReader.new("TestOld", "http://test.com", "00-00-0000", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
        
        @model = reader.deserialize('{ "name": "Peter Smith", "name_id": "<peter.smith@example.json>", "date": "2012-08-12", "version": "3", "docurl":"http://example.org/example_json", "text":"Some document text. With two annotations of type protein.\n", "catanns":[{"annset_id":1,"begin":0,"category":"Protein","doc_id":9,"end":10,"id":139},{"annset_id":1,"begin":20,"category":"Protein","doc_id":9,"end":42,"id":138}]}')

      end

      it 'model is of type document' do
        @model.should be_an_instance_of BioInterchange::TextMining::Document
      end
      
      it 'document uri (job id read)' do
        @model.uri.should eql "http://example.org/example_json"
      end
      
      it 'document has content' do
        @model.contents.size.should eql 3
      end
      
      it 'document document' do
        @model.contents[0].type.should eql BioInterchange::TextMining::Content::DOCUMENT and @model.contents[0].offset.should eql 0 and @model.contents[0].length.should eql 58
      end
      
      it 'document phrase' do
        @model.contents[1].type.should eql BioInterchange::TextMining::Content::PHRASE and @model.contents[1].offset.should eql 0 and @model.contents[1].length.should eql 10 and
        
        @model.contents[2].type.should eql BioInterchange::TextMining::Content::PHRASE and @model.contents[2].offset.should eql 20 and @model.contents[2].length.should eql 22
      end
    end
  
    describe 'basic generated model checks' do
  
      before :all do
        reader = BioInterchange::TextMining::PubannosJsonReader.new("Test", "http://test.com", "00-00-0000", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
        
        @model = reader.deserialize('{ "name": "Peter Smith", "name_id": "<peter.smith@example.json>", "date": "2012-12-08", "version": "3", "docurl":"http://example.org/example_json", "text":"Some document text. With two annotations of type protein.\n", 	"catanns":[{"id":"T1","span":{"begin":0,"end":10},"category":"NP"},{"id":"T2","span":{"begin":20,"end":42},"category":"NP"}]}')
      end
      
      it 'model is of type document' do
        @model.should be_an_instance_of BioInterchange::TextMining::Document
      end
      
      it 'document uri (job id read)' do
        @model.uri.should eql "http://example.org/example_json"
      end
      
      it 'document has content' do
        @model.contents.size.should eql 3
      end
      
      it 'document document' do 
        @model.contents[0].type.should eql BioInterchange::TextMining::Content::DOCUMENT and @model.contents[0].offset.should eql 0 and @model.contents[0].length.should eql 58
      end
      
      it 'document phrase' do
        @model.contents[1].type.should eql BioInterchange::TextMining::Content::PHRASE and @model.contents[1].offset.should eql 0 and @model.contents[1].length.should eql 10 and
        @model.contents[2].type.should eql BioInterchange::TextMining::Content::PHRASE and @model.contents[2].offset.should eql 20 and @model.contents[2].length.should eql 22
      end
    end
	
    describe 'advanced generated model checks' do
  
      before :all do
        reader = BioInterchange::TextMining::PubannosJsonReader.new("Test", "http://test.com", "00-00-0000", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
        
        @model = reader.deserialize(File.new('examples/pubannotation.2626671.json'))
      end
      
      it 'model is of type document' do
        @model.should be_an_instance_of BioInterchange::TextMining::Document
      end
      
      it 'document uri (job id read)' do
        @model.uri.should eql "http://www.ncbi.nlm.nih.gov/pubmed/2626671"
      end
      
      it 'document has content' do
        @model.contents.size.should eql 91
      end

      it 'document document' do 
		#range as exact length seems to depend on encoding used...
        @model.contents[0].type.should eql BioInterchange::TextMining::Content::DOCUMENT and @model.contents[0].offset.should eql 0 and ( @model.contents[0].length.should > 2350 or @model.contents[0].length.should < 2360 )
      end
      
      it 'document content types and interconnections' do
        doc = 1
        sub = 39
        eq = 62
        th = 64
        spec = 87
        neg = 89
        @model.contents[doc].type.should eql BioInterchange::TextMining::Content::PHRASE and @model.contents[doc].offset.should eql 9 and @model.contents[doc].length.should eql 10 and
        @model.contents[sub].type.should eql BioInterchange::TextMining::ContentConnection::SUBCLASS and @model.contents[sub].content1.should eql nil and @model.contents[sub].content2.offset.should eql 9 and
        @model.contents[eq].type.should eql BioInterchange::TextMining::ContentConnection::EQUIVALENCE and @model.contents[eq].content1.offset.should eql 396 and @model.contents[eq].content2.offset.should eql 386 and
        @model.contents[th].type.should eql BioInterchange::TextMining::ContentConnection::THEME and @model.contents[th].content1.offset.should eql 32 and @model.contents[th].content2.content2.offset.should eql 9 and
        @model.contents[spec].type.should eql BioInterchange::TextMining::ContentConnection::SPECULATION and @model.contents[spec].content1.content2.offset.should eql 9 and @model.contents[spec].content2.should eql nil and
        @model.contents[neg].type.should eql BioInterchange::TextMining::ContentConnection::NEGATION and @model.contents[neg].content1.content2.offset.should eql 426 and @model.contents[neg].content2.should eql nil
      end
    end

  end
  
end

