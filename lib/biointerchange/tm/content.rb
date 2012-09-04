module BioInterchange

class Content

  # Constants that describe content types.
  UNSPECIFIED =  0
  DOCUMENT    =  1
  PAGE        =  2
  TITLE       =  3
  AUTHOR      =  4
  ABSTRACT    =  5
  SECTION     =  6
  PARAGRAPH   =  7
  SENTENCE    =  8
  PHRASE      =  9
  WORD        = 10
  CHARACTER   = 11

  # Creates a new document content representation at a specific location of the document.
  #
  # +offset+:: zero-based offset of the represented content within the document (absolute location within the document)
  # +length+:: length of the represented content, where a length of zero denotes a boundary between two characters
  # +type+:: classifaction of the content
  def initialize(offset, length, type)
    @offset = offset
    @length = length
    @type = type
  end

end

end

