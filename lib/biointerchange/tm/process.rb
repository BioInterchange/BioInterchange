module BioInterchange::TextMining

class Process

  # Constants that describe process types.
  UNSPECIFIED = 0
  SOFTWARE    = 1
  WEBSERVICE  = 2
  MANUAL      = 3

  # Dictionary of viable metadata keys.
  VERSION     = 0

  # Creates a new process representation.
  #
  # +name+:: identification of the software/service/curator involved in the process, e.g. "ABNER" or "Peter Smith"
  # +uri+:: details about the processes origin, e.g. "http://pages.cs.wisc.edu/~bsettles/abner/" or "peter.smith@example.org"
  # +date+:: date-time when the process was carried out, which may be nil if the date-time is unknown
  # +type+:: classification of the described process
  # +metadata+:: a hash that holds additional information about the process via dictionary defined keywords, e.g. { Process::VERSION => '0.0.1alpha' }
  def initialize(name, uri, type = UNSPECIFIED, metadata = {}, date = nil)
    @name = name
    @uri = uri
    @date = date
    @type = type
    @metadata = metadata
  end

  # Returns the name of the process.
  def name
    @name
  end

  # Returns the URI that has further details about the process, which can also be the form of an email address
  # in cases where the process describes human driven annotation.
  def uri
    @uri
  end

  # Returns the date-time when this process was carried out, or nil otherwise if the information is not available.
  def date
    @date
  end

  # Returns the type of this process.
  def type
    @type
  end

  # Returns additional meta-data associated with this process.
  def metadata
    @metadata.clone.freeze
  end

end

end
