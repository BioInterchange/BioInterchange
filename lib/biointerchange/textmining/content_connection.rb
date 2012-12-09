module BioInterchange::TextMining

class ContentConnection

  # Constants that describe content connection type.
  UNSPECIFIED =  0
  EQUIVALENCE =  1
  SUBCLASS    =  2
  THEME       =  3
  SPECULATION =  4
  NEGATION    =  5

  # Creates a new document content connection representation between specific document content.
  #
  # +content1+:: document content 1
  # +content2+:: document content 2
  # +type+:: classifaction of the connection between the two document content objects
  def initialize(content1, content2, type = UNSPECIFIED, process = nil)
    if content1.nil? and content2.nil?
      raise BioInterchange::Exceptions::ImplementationModelError, 'Content1 and Content2 can not both be nil'
    elsif ( (! content1.kind_of?(BioInterchange::TextMining::Content)) && (! content1.kind_of?(BioInterchange::TextMining::ContentConnection)) && (! content1.nil?) )
      raise BioInterchange::Exceptions::ImplementationModelError, 'Content1 has to be of kind BioInterchange::TextMining::Content or kind BioInterchange::TextMining::ContentConnection'  
    elsif ( (! content2.kind_of?(BioInterchange::TextMining::Content)) && (! content2.kind_of?(BioInterchange::TextMining::ContentConnection)) && (! content2.nil?) )
      raise BioInterchange::Exceptions::ImplementationModelError, 'Content2 has to be of kind BioInterchange::TextMining::Content or kind BioInterchange::TextMining::ContentConnection'  
    end
    @content1 = content1
    @content2 = content2
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
  def content1
    @content1
  end

  # Returns the length of the content, which is measured in characters.
  def content2
    @content2
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
    raise BioInterchange::Exceptions::ImplementationModelError, 'An URI can only be returned for content with a context (i.e., use setContext(context) first).' unless @context
    process = '-'
    c1 = '-'
    c2 = '-'
    process = "(#{@process.uri.sub(/^.*?:\/\//, '')})" if @process
    c1 = "#{@content1.uri.sub(/^.*?:\/\//, '')}" if @content1
    c2 = "#{@content2.uri.sub(/^.*?:\/\//, '')}" if @content2
    "biointerchange://textmining/content_connection/#{@context.uri.sub(/^.*?:\/\//, '')}/#{c1},#{c2},#{@type},#{process}"
  end

end

end

