module BioInterchange::TextMining

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
  def initialize(offset, length, type = UNSPECIFIED, process = nil)
    @offset = offset
    @length = length
    @type = type
    @process = process
  end

  # Sets the context of this content.
  #
  # +context+:: a +BioInterchange::TextMining::Document+ or +BioInterchange::TextMining::Content+ instance in which this content is enclosed in
  def setContext(context)
    @context = context
  end

  # Returns the offset of the content as absolute position within the document.
  def offset
    @offset
  end

  # Returns the length of the content, which is measured in characters.
  def length
    @length
  end

  # Returns the type of the content, if known, or +BioInterchange::TextMining::Content::UNSPECIFIED otherwise.
  def type
    @type
  end

  # Returns the process associated with this content, if previously provided, or nil otherwise.
  def process
    @process
  end

  # Returns a URI that identifies this content.
  def uri
    raise BioInterchange::Exceptions::ModelError, 'An URI can only be returned for content with a context (i.e., use setContext(context) first).' unless @context
    process = '-'
    process = "(#{@process.uri.sub(/^.*?:\/\//, '')})" if @process
    "biointerchange://textmining/content/#{@context.uri.sub(/^.*?:\/\//, '')}/#{@offset},#{@length},#{@type},#{process}"
  end

end

end

