
require 'uri'

module BioInterchange

# A simplified URI representation that replaces RDF::URI. The latter
# is riddled with broken gem dependencies and was de-facto non-functioning
# (August 2014).
class SURI

  # Create a new URI instances based on a string representation. The URI in string form
  # should not be surrounded in angle brackets ('<' and '>') and should not be escaped yet.
  #
  # +uri+:: string representation of an URI, e.g. "http://example.org/test"
  def initialize(uri)
    @uri = "<#{URI.escape(uri)}>"
  end

  # Returns a concatenation of the URI and the given string. The URI instance is not
  # modified by this operation.
  #
  # +suffix+:: a string that is appended to the URI
  def +(suffix)
    @uri + suffix
  end

  # Returns the URI as a string; the uri is embedded in angle brackets ('<' and '>').
  def to_s
    @uri
  end

end

end
