
require 'rspec'

load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/exceptions.rb'

describe BioInterchange::Exceptions do
  describe 'error and exception creation tests' do
    it 'format error' do
      expect { raise BioInterchange::Exceptions::InputFormatError }.to raise_error(BioInterchange::Exceptions::BioInterchangeError)
    end
    
    it 'reader error' do
      expect { raise BioInterchange::Exceptions::ImplementationReaderError }.to raise_error(BioInterchange::Exceptions::ImplementationError)
    end
    
    it 'model error' do
      expect { raise BioInterchange::Exceptions::ImplementationModelError }.to raise_error(BioInterchange::Exceptions::ImplementationError)
    end
    
    it 'writer error' do
      expect { raise BioInterchange::Exceptions::ImplementationWriterError }.to raise_error(BioInterchange::Exceptions::ImplementationError)
    end
    
  end
end

