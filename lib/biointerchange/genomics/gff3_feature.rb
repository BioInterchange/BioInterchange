module BioInterchange::Genomics

class GFF3Feature

  # Constants determining the strand of the feature.
  NOT_STRANDED = 0
  UNKNOWN      = 1
  POSITIVE     = 2
  NEGATIVE     = 3

  # Creates a new feature representation. A feature is described on one line of the GFF3 file.
  #
  # +sequence_id+:: an identifier that determines the coordinate system for the feature
  # +source+:: a text description of the origin of this feature description
  # +type+:: either a SOFA accession, SOFA term, or textual description (the former are URIs, the latter is a string)
  # +start_coordinate+:: an integer denoting the start coordinate of the feature
  # +end_coordinate+:: an integer denoting the end coordinate of the feature, which is equal or larger than the start coordinate
  # +score+:: a floating point score
  # +strand+:: a constant determining whether the feature is NOT_STRANDED, the strand is UNKNOWN, or the feature is on the POSITIVE or NEGATIVE strand
  # +phase+:: an integer determining the phase of the feature, if the feature has a phase
  # +attributes+:: a map of additional attributes associated with the feature
  def initialize(sequence_id, source, type, start_coordinate, end_coordinate, score = nil, strand = NOT_STRANDED, phase = nil, attributes = {})
    @sequence_id = sequence_id
    @source = source
    @type = type
    @start_coordinate = start_coordinate
    @end_coordinate = end_coordinate
    @score = score
    @strand = strand
    @phase = phase
    @attributes = attributes
  end

  # Returns the sequence ID that determines the coordinate system for the feature.
  def sequence_id
    @sequence_id
  end

  # Returns a textual description that determines the origin of this feature.
  def source
    @source
  end

  # Returns the feature type, which can either be a SOFA URI or a textual description otherwise.
  def type
    @type
  end

  # Returns the start coordinate of the feature. The start coordinate is equal or smaller than the end coordinate.
  def start_coordinate
    @start_coordinate
  end

  # Returns the end coordinate of the feature. The end coordinate is equal or larger than the start coordinate.
  def end_coordinate
    @end_coordinate
  end

  # Returns the score of the feature. The score is a floating point number, which ideally is an E-value or P-value.
  def score
    @score
  end

  # Returns the strand the feature is located on.
  def strand
    @strand
  end
  
  # Returns the phase, if existing, for this feature.
  def phase
    @phase
  end

  # Returns a map of additional attributes for this feature.
  def attributes
    @attributes.freeze
  end

end

end

