
require 'rubygems'
require 'rspec'
require 'tempfile'

require 'biointerchange'

describe BioInterchange::TextMining::RDFWriter do
  describe 'serialization of text-mining documents' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::TextMining::RDFWriter.new(ostream).serialize(BioInterchange::TextMining::Document.new('http://example.org'))
      ostream.close
      istream.read.lines.count.should eq(8)
    end

    it 'document with two entities' do
      istream, ostream = IO.pipe
      document = BioInterchange::TextMining::Document.new('http://example.org')
      content = BioInterchange::TextMining::Content.new(
          3,
          11,
          BioInterchange::TextMining::Content::PHRASE,
          BioInterchange::TextMining::Process.new(
            'Peter Smith',
            'peter.smith@some.example.address.org',
            BioInterchange::TextMining::Process::MANUAL
          )
        )
      content.setContext(document)
      document.add(content)
      content = BioInterchange::TextMining::Content.new(
          42,
          9,
          BioInterchange::TextMining::Content::PHRASE,
          BioInterchange::TextMining::Process.new(
            'GENIA',
            'http://www.nactem.ac.uk/GENIA/tagger',
            BioInterchange::TextMining::Process::SOFTWARE,
            {},
            '2012-09-28'
          )
        )
      content.setContext(document)
      document.add(content)
      BioInterchange::TextMining::RDFWriter.new(ostream).serialize(document)
      ostream.close
      istream.read.lines.count.should be > 1
    end

    it 'full advanced json document' do
      ofile = Tempfile.new('full_advanced_json_document.ttl')
      reader = BioInterchange::TextMining::PubAnnosJSONReader.new("Test", "http://test.com", "2012-12-09", BioInterchange::TextMining::Process::UNSPECIFIED, "0.0")
        
      model = reader.deserialize(File.new('examples/pubannotation.2626671.json'))
      
      BioInterchange::TextMining::RDFWriter.new(File.new(ofile, 'w')).serialize(model)
      ofile.close
      IO.readlines(ofile.path).count.should be > 100
      ofile.unlink
    end
  end
end

