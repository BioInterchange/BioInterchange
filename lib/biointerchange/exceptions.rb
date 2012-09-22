module BioInterchange::Exceptions

class BioInterchangeError < StandardError
end

class FormatError < BioInterchangeError
end

class ReaderError < BioInterchangeError
end

class ModelError < BioInterchangeError
end

class WriterError < BioInterchangeError
end

end
