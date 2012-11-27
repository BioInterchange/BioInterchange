
require 'rubygems'
require 'rspec'

# Turn off verbose reporting here, since class definitions may be loaded multiple
# times here. That reports that constants have been already been initialized, which
# is true, but they are only "re-initialized" with the very same values.
v, $VERBOSE = $VERBOSE, nil
load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/sio.rb'
load 'lib/biointerchange/reader.rb'
load 'lib/biointerchange/writer.rb'
load 'lib/biointerchange/textmining/text_mining_rdf_ntriples.rb'
load 'lib/biointerchange/textmining/document.rb'
load 'lib/biointerchange/textmining/content.rb'
load 'lib/biointerchange/textmining/process.rb'
$VERBOSE = v

describe BioInterchange::TextMining::RDFWriter do
  describe 'serialization of text-mining documents' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::TextMining::RDFWriter.new(ostream).serialize(BioInterchange::TextMining::Document.new('http://example.org'))
      ostream.close
      istream.read.lines.count.should eq(1)
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
  end
end

