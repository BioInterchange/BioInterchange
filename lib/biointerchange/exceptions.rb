# BioInterchange Exception and Error handling.
#
# All BioInterchange errors come under two main categories:
# 1. InputFormatError
# 2. ImplementationError
#
# Each of these classes is handled differently within the BioInterchange framework.
#
# InputFormatErrors are those that could be raised at any time (during runtime), and
# that the user could then be exposed to. Examples include errors relating to missing
# files, or incorrect file formats. These Errors are rescued at the highest level in
# our program, and adjusted such that a user friendly error message is displayed without
# a stacktrace (backtrace). This helps to keep our system more user-friendly. However,
# this means that we strongly advise that when such an error is raised, that it comes
# with a user friendly error message, and is as specific as possible.
#
# ImplementationErrors are those that could only be thrown during program implementation
# and extension. For example, a method is passed something it is not expecting or cannot
# handle (e.g., a writer is passed an invalid model). These errors are not caught by the
# main program, instead left to execute in the normal fashion including stacktrace to
# enable program debugging by a developer.
#
# ImplementationErrors have three sub-categories. They are split into errors being raised
# from either the Reader (ImplementationReaderError), the Model (ImplementationModelError),
# or the Writer (ImplementationWriterError). Please use the ImplementationError sub-class
# consistent with where the error is being raised. This helps provide an easy way to see
# which stage in program execution an error has occurred.
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
