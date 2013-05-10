require 'rdf'
module BioInterchange

class FALDO

  # This denotes that a feature is in between two other positions that are both known exactly and next to eaxh other. An example is an restriction enzyme cutting site. The cut is after one nucleotide and before the next i.e. in between
  # (http://biohackathon.org/resource/faldo#InBetweenPosition)
  def self.In_between_positions
    return RDF::URI.new('http://biohackathon.org/resource/faldo#InBetweenPosition')
  end

  # Superclass to group the general concept of a position on a sequence. The sequence is designated via the reference predicate.
  # (http://biohackathon.org/resource/faldo#Position)
  def self.Position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#Position')
  end

  # Use when you exactly know the position.
  # (http://biohackathon.org/resource/faldo#ExactPosition)
  def self.Exact_position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#ExactPosition')
  end

  # The position must be one of the more detailed Positions listed by the location predicate.
  # (http://biohackathon.org/resource/faldo#OneOfPosition)
  def self.One_of_positions
    return RDF::URI.new('http://biohackathon.org/resource/faldo#OneOfPosition')
  end

  # Use when you have an idea of the range in which you can find the position but can not be sure.
  # (http://biohackathon.org/resource/faldo#InRangePosition)
  def self.Indeterminate_position_within_a_range
    return RDF::URI.new('http://biohackathon.org/resource/faldo#InRangePosition')
  end

  # Part of the coordinate system is on which strand the feature can be found. If you do not yet know which stand the feature is on you should tag the position with just this class. If you know more you should use one of the subclasses. This means a region descibred with a '.' in GFF3. An GFF3 Unstranded position does not have this type in FALDO those are just a Position.
  # (http://biohackathon.org/resource/faldo#StrandedPosition)
  def self.Stranded_position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition')
  end

  # Use this class to indicate that you lack exact position data.
  # (http://biohackathon.org/resource/faldo#FuzzyPosition)
  def self.Fuzzy_position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition')
  end

  # The position is on the forward (positive) strand. Shown as a '+' in GFF3 and GTF
  # (http://biohackathon.org/resource/faldo#ForwardStrandPosition)
  def self.Positive_strand
    return RDF::URI.new('http://biohackathon.org/resource/faldo#ForwardStrandPosition')
  end

  # The both strands position mean that the region spans both strands instead of one. In GGF3 displayed as 0. This does not mean that the position is one or the other strand but is best described as being on both.
  # (http://biohackathon.org/resource/faldo#BothStrandsPosition)
  def self.Both_strands
    return RDF::URI.new('http://biohackathon.org/resource/faldo#BothStrandsPosition')
  end

  # The position is on the reverse (complement) strand of the sequence. Shown as '-' in GTF and GFF3
  # (http://biohackathon.org/resource/faldo#ReverseStrandPosition)
  def self.Negative_strand
    return RDF::URI.new('http://biohackathon.org/resource/faldo#ReverseStrandPosition')
  end

  # A region describes an length of sequence with a start and end position that represents a feature on a Sequence. i.e. a gene
  # (http://biohackathon.org/resource/faldo#Region)
  def self.Region
    return RDF::URI.new('http://biohackathon.org/resource/faldo#Region')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    return false
  end

  # Determines whether the given URI is a class.
  #
  # +uri+:: URI that is tested for being a class
  def self.is_class?(uri)
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#InBetweenPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#Position') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#ExactPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#OneOfPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#InRangePosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#ForwardStrandPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#BothStrandsPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#ReverseStrandPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#Region') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a named individual.
  #
  # +uri+:: URI that is tested for being a named individual
  def self.is_named_individual?(uri)
    return false
  end

  # Returns only those URIs that fall under a designated parent URI.
  #
  # +uris+:: Set of URIs that are tested whether they have the given parent URI.
  # +parent+:: Parent URI.
  def self.with_parent(uris, parent)
    return uris.select { |uri| has_parent?(uri, parent) }
  end

  # Recursively tries to determine the parent for a given URI.
  #
  # +uri+:: URI that is tested for whether it has the given parent URI.
  # +parent+:: Parent URI.
  def self.has_parent?(uri, parent)
    if @@parent_properties.has_key?(uri) then
      if @@parent_properties[uri] == parent then
        return true
      end
      return has_parent?(@@parent_properties[uri], parent)
    end
    return false
  end

private
  @@parent_properties = { RDF::URI.new('http://biohackathon.org/resource/faldo#OneOfPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#Position') , RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#Position') , RDF::URI.new('http://biohackathon.org/resource/faldo#ForwardStrandPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#BothStrandsPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#ReverseStrandPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') }

end

end
