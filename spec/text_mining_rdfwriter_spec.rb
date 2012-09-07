
require 'rspec'

load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/reader.rb'
load 'lib/biointerchange/writer.rb'
load 'lib/biointerchange/writers/text_mining_rdf_ntriples.rb'
load 'lib/biointerchange/tm/document.rb'
load 'lib/biointerchange/tm/content.rb'
load 'lib/biointerchange/tm/process.rb'

describe BioInterchange::TextMining::RDFWriter do
  describe 'serialization of text-mining documents' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::TextMining::RDFWriter.new(ostream).serialize(BioInterchange::TextMining::Document.new('http://example.org'))
      ostream.close
      istream.read.lines.count.should eq(1)
    end

    it 'document with a single entity' do
      istream, ostream = IO.pipe
      document = BioInterchange::TextMining::Document.new('http://example.org')
      content = BioInterchange::TextMining::Content.new(
          12,
          3,
          BioInterchange::TextMining::Content::PHRASE,
          BioInterchange::TextMining::Process.new(
            'Peter Smith',
            'peter.smith@some.example.address.org',
            BioInterchange::TextMining::Process::MANUAL
          )
        )
      content.setContext(document)
      document.add(content)
      BioInterchange::TextMining::RDFWriter.new(ostream).serialize(document)
      ostream.close
      # TODO Actual unit test.
    end
  end
end

