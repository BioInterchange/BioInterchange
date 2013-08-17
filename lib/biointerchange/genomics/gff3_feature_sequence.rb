module BioInterchange::Genomics

# Represents a sequence of a genomic feature of a GFF3 file.
class GFF3Feature

  # Creates a new feature sequence representation. A feature sequence is described by two or more
  # lines in a GFF3 file that are succeeding a '##FASTA' pragma statement.
  #
  # +feature_id+:: ID of the feature whose sequence is stored
  # +sequence+:: sequence of the feature
  def initialize(feature_id, sequence)
    @feature_id = feature_id
    @sequence = sequence
  end

  # Returns the ID of the feature whose sequence is represented by the object.
  def feature_id
    @feature_id
  end

  # Returns the sequence of the feature.
  def sequence
    @sequence
  end
end

end

