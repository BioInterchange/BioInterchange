require 'digest/sha1'

module BioInterchange::Phylogenetics

# A phylogenetic tree set that can contain multiple phylogenetic trees.
class TreeSet < BioInterchange::Model

  # Create a new instance of a tree set. A tree set can contain multiple phylogenetic trees.
  def initialize
    # Trees are stored as the keys of a hash map to increase performance:
    @set = {}
  end

  # Returns the contents of the tree set.
  def contents
    @set.keys
  end

  # If a date was provided, then this method returns its value.
  def date
    @date
  end

  # Sets a date that is associated with the trees in this model (e.g., annotation date, creation date, etc.).
  #
  # +date+:: an instance of Date that is associated with all trees in the model
  def set_date(date)
    @date = date
  end

  # Returns an URI for this particular tree set, which is a not necessarily globally unique SHA1 hash.
  def uri
    "biointerchange://phylogenetics/treeset/self/#{Digest::SHA1.hexdigest(Time.now.to_s)}"
  end

  # Add a tree to the tree set.
  #
  # +tree+:: BioRuby tree instance that is added to the contents of this tree set
  def add(tree)
    @set[tree] = true
  end

  # Removes all features from the set, but keeps additional data (e.g., the date).
  def prune
    @set.clear
  end

end

end
