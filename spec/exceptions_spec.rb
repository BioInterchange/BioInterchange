
require 'rspec'

load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/exceptions.rb'

describe BioInterchange::Exceptions do
  describe 'error and exception creation tests' do
    it 'format error' do
      expect { raise BioInterchange::Exceptions::FormatError }.to raise_error(BioInterchange::Exceptions::BioInterchangeError)
    end
    
    it 'reader error' do
      expect { raise BioInterchange::Exceptions::ReaderError }.to raise_error(BioInterchange::Exceptions::BioInterchangeError)
    end
    
    it 'model error' do
      expect { raise BioInterchange::Exceptions::ModelError }.to raise_error(BioInterchange::Exceptions::BioInterchangeError)
    end
    
    it 'writer error' do
      expect { raise BioInterchange::Exceptions::WriterError }.to raise_error(BioInterchange::Exceptions::BioInterchangeError)
    end
    
  end
end

