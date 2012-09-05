
require 'rspec'

load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/rdf/writer.rb'
load 'lib/biointerchange/tm/document.rb'
load 'lib/biointerchange/tm/content.rb'
load 'lib/biointerchange/tm/process.rb'

describe BioInterchange::IO::RDFWriter do
  describe 'serialization of text-mining documents' do
    it 'empty document' do
      BioInterchange::IO::RDFWriter.new(IO.new(STDOUT.fileno)).serialize(BioInterchange::TextMining::Document.new('http://example.org'))
    end
  end
end

