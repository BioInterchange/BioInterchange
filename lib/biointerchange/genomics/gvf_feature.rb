module BioInterchange::Genomics

# Represents a single genomic feature of a GVF file.
class GVFFeature < GFF3Feature

  # Creates a new feature representation. A feature is described on one line of the GVF file.
  #
  # +sequence_id+:: an identifier that determines the coordinate system for the feature
  # +source+:: a text description of the origin of this feature description
  # +type+:: either a SOFA accession, SOFA term, or textual description (the former are URIs, the latter is a string)
  # +start_coordinate+:: an integer denoting the start coordinate of the feature
  # +end_coordinate+:: an integer denoting the end coordinate of the feature, which is equal or larger than the start coordinate
  # +score+:: a floating point score
  # +strand+:: a constant determining whether the feature is NOT_STRANDED, the strand is UNKNOWN, or the feature is on the POSITIVE or NEGATIVE strand
  # +attributes+:: a map of additional attributes associated with the feature
  def initialize(sequence_id, source, type, start_coordinate, end_coordinate, score = nil, strand = NOT_STRANDED, attributes = {})
    # Fill in phase, which is always omitted in GVF features (after 'strand', before 'attributes'):
    super(sequence_id, source, type, start_coordinate, end_coordinate, score, strand, nil, attributes)
  end

end

end

