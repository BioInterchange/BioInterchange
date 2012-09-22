module BioInterchange::TextMining

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
  # +content+:: content of type +BioInterchange::TextMining::Content+ that should be added to the document
  def add(content)
    raise BioInterchange::Exceptions::ModelError, 'Content has to be of kind BioInterchange::TextMining::Content' unless content.kind_of?(BioInterchange::TextMining::Content)
    @content << content
  end

  # Returns the document contents as an array.
  def contents
    @content.clone.freeze
  end

end

end

