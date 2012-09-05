module BioInterchange

class Document

  # Creates a blank document representation.
  #
  # +uri+:: source of the document
  def initialize(uri)
    @uri = uri

    # Will hold content:
    @content = []
  end

  # Returns the URI of the document.
  def uri
    @uri
  end

  # Adds content to the document.
  #
  # +content+:: content of type +BioInterchange::Content+ that should be added to the document
  def add(content)
    raise ArgumentError, 'Content has to be of kind BioInterchange::Content' unless content.kind_of?(BioInterchange::Content)
    @content << content
  end

  # Returns the document contents as an array.
  def contents
    @content.clone.freeze
  end

end

end

