require 'digest/sha1'

module BioInterchange::Phylogenetics

# A GFF3 feature set, which encapsules information of a single GFF3 file.
class TreeSet < BioInterchange::Model

  # Create a new instance of a Generic Feature Format Version 3 (GFF3) feature set. A feature
  # set can contain multiple GFF3 features.
  def initialize
    # Features are stored as the keys of a hash map to increase performance:
    @set = {}
  end

  # Returns the contents of the feature set -- excluding pragma meta-data.
  def contents
    @set.keys
  end

  # Returns an URI for this particular feature set, which is a SHA1 hash over the pragma's concatenated properties.
  def uri
    "biointerchange://phylogenetics/treeset/self/#{Digest::SHA1.hexdigest(Time.now.to_s)}"
  end

  # Adds a feature to the feature set.
  #
  # +tree+:: feature instance that is added to the contents of this feature set
  def add(tree)
    @set[tree] = true
  end


  # Removes all features from the set, but keeps the pragmas. This enables
  # batched processing, since the URI for the set is only determined by the
  # pragma statement contents.
  def prune
    @set.clear
  end

end

end
