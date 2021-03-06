module BioInterchange::TextMining

class Document < BioInterchange::Model

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
    if ( (! content.kind_of?(BioInterchange::TextMining::Content)) && (! content.kind_of?(BioInterchange::TextMining::ContentConnection)) )
      raise BioInterchange::Exceptions::ImplementationModelError, 'Content has to be of kind BioInterchange::TextMining::Content or kind BioInterchange::TextMining::ContentConnection' 
    end
    @content << content
  end

  # Returns the document contents as an array.
  def contents
    @content.clone.freeze
  end

end

end

