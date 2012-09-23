module BioInterchange::Exceptions

# Top level Error class for all framework errors.
class BioInterchangeError < StandardError
end

# Error class for issues regarding input file formats. 
# This error class is caught at the hightest level and
# only the error message is returned to the end user
# (not the backtrace). This helps keep the framework
# more user friendly. Note that this means meaningful
# error messages are strongly encourged. 
class InputFormatError < BioInterchangeError
end

# Top class error for errors raised only during 
# framework implementation and extension. Once
# such an implementation/extension is completed,
# these errors should no longer be possible.
# Examples include a method reciving something it 
# can't handle. The framework does not resuce these
# errors leaving the backtraces for help in debug.
class ImplementationError < BioInterchangeError
end

# Implementation errors originating from readers.
class ImplementationReaderError < ImplementationError
end

# Implementation errors originating from models.
class ImplementationModelError < ImplementationError
end

# Implementation errors originating from writers.
class ImplementationWriterError < ImplementationError
end

end
