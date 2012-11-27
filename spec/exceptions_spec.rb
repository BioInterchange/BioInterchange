
require 'rubygems'
require 'rspec'

# Turn off verbose reporting here, since class definitions may be loaded multiple
# times here. That reports that constants have been already been initialized, which
# is true, but they are only "re-initialized" with the very same values.
v, $VERBOSE = $VERBOSE, nil
load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/exceptions.rb'
$VERBOSE = v

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

