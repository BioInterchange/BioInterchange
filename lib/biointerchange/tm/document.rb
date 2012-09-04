module BioInterchange

class Document

  # Creates a blank document representation.
  #
  # +uri+:: source of the document
  def initialize(uri)
    @uri = uri
  end

  # Returns the URI of the document.
  def uri
    @uri
  end

end

end

