
require 'rspec'

load 'lib/biointerchange/rdf/writer.rb'
load 'lib/biointerchange/tm/document.rb'
load 'lib/biointerchange/tm/content.rb'
load 'lib/biointerchange/tm/process.rb'

describe BioInterchange::RDFWriter do
  describe 'serialization of text-mining documents' do
    it 'empty document' do
      BioInterchange::RDFWriter.new(IO.new(STDOUT.fileno)).serialize(BioInterchange::Document.new('http://example.org'))
    end
  end
end

