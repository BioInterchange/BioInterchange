require 'digest/sha1'

module BioInterchange::Genomics

class GFF3FeatureSet

  # Create a new instance of a Generic Feature Format Version 3 (GFF3) feature set. A feature
  # set can contain multiple GFF3 features.
  def initialize
    # Features are stored as the keys of a hash map to increase performance:
    @set = {}
  end

  # Returns the contents of the feature set.
  def contents
    @set.keys
  end

  # Returns an URI for this particular feature set, which is a SHA1 hash over the content's concatenated properties.
  def uri
    clob = ''
    contents.each { |feature|
      clob << "#{feature.sequence_id}\t#{feature.source}\t#{feature.type}\t#{feature.start_coordinate}\t#{feature.end_coordinate}\t#{feature.score}\t#{feature.strand}\t#{feature.phase}\t#{feature.attributes.keys.map { |tag| "#{tag}=#{feature.attributes[tag]}" }.join(';')}\n"
    }
    "biointerchange://gff3/featureset/self/#{Digest::SHA1.hexdigest(clob)}"
  end

  # Adds a feature to the feature set.
  #
  # +feature+:: feature instance that is added to the contents of this feature set
  def add(feature)
    @set[feature] = true
  end

end

end
