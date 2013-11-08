
require 'rubygems'
require 'rspec'

require 'biointerchange'

describe BioInterchange::Exceptions do
  describe 'error and exception creation tests' do
    it 'raising of InputFormatError' do
      expect { raise BioInterchange::Exceptions::InputFormatError }.to raise_error(BioInterchange::Exceptions::BioInterchangeError)
    end
    
    it 'raising of ImplementationReaderError' do
      expect { raise BioInterchange::Exceptions::ImplementationReaderError }.to raise_error(BioInterchange::Exceptions::ImplementationError)
    end
    
    it 'raising of ImplementationModelError' do
      expect { raise BioInterchange::Exceptions::ImplementationModelError }.to raise_error(BioInterchange::Exceptions::ImplementationError)
    end
    
    it 'raising of ImplementationWriterError' do
      expect { raise BioInterchange::Exceptions::ImplementationWriterError }.to raise_error(BioInterchange::Exceptions::ImplementationError)
    end
    
  end
end

