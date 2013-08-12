require 'rdf'
module BioInterchange

class FALDO

  # Used to describe a location that consists out of a number of Regions but where the order is not known. e.g. the odly named order keyword in a INSDC fle.
  # (http://biohackathon.org/resource/faldo#BagOfRegions)
  def self.BagOfRegions
    return RDF::URI.new('http://biohackathon.org/resource/faldo#BagOfRegions')
  end

  # Sometimes a location of a feature is defined by a collection of regions e.g. INSDC join and order. One should always try to model the semantics more accuratly these are fallback options to encode legacy data.
  # (http://biohackathon.org/resource/faldo#CollectionOfRegions)
  def self.CollectionOfRegions
    return RDF::URI.new('http://biohackathon.org/resource/faldo#CollectionOfRegions')
  end

  # The position is on the forward (positive, 5' to 3') strand. Shown as a '+' in GFF3 and GTF.
  # (http://biohackathon.org/resource/faldo#ForwardStrandPosition)
  def self.Positive_strand
    return RDF::URI.new('http://biohackathon.org/resource/faldo#ForwardStrandPosition')
  end

  # Part of the coordinate system denoting on which strand the feature can be found. If you do not yet know which stand the feature is on, you should tag the position with just this class. If you know more you should use one of the subclasses. This means a region descibred with a '.' in GFF3. A GFF3 unstranded position does not have this type in FALDO -- those are just a 'position'.
  # (http://biohackathon.org/resource/faldo#StrandedPosition)
  def self.Stranded_position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition')
  end

  # The 'both strands position' means that the region spans both strands instead of one. In GFF3 displayed as 0. This does not mean that the position is one or the other strand, but that is best described as being on both.
  # (http://biohackathon.org/resource/faldo#BothStrandsPosition)
  def self.Both_strands
    return RDF::URI.new('http://biohackathon.org/resource/faldo#BothStrandsPosition')
  end

  # The position is on the reverse (complement, 3' to 5') strand of the sequence. Shown as '-' in GTF and GFF3.
  # (http://biohackathon.org/resource/faldo#ReverseStrandPosition)
  def self.Negative_strand
    return RDF::URI.new('http://biohackathon.org/resource/faldo#ReverseStrandPosition')
  end

  # This denotes that a feature is in between two other positions that are both known exactly and next to each other. An example is a restriction enzyme cutting site. The cut is after one nucleotide position and before another nucleotide position (hence, in between).
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

  # This used to indicate that the feature is found before the exact position. Use to indicate, for example, a cleavage site. The cleavage happens between two amino acids before one and after the other.
  # (http://biohackathon.org/resource/faldo#before)
  def self.before
    return RDF::URI.new('http://biohackathon.org/resource/faldo#before')
  end

  # This predicate is used when you want to describe a non-inclusive range. Only used in the in between position to say it is after a nucleotide, but before the next one.
  # (http://biohackathon.org/resource/faldo#after)
  def self.after
    return RDF::URI.new('http://biohackathon.org/resource/faldo#after')
  end

  # The position must be one of the more detailed positions listed by the location predicate.
  # (http://biohackathon.org/resource/faldo#OneOfPosition)
  def self.One_of_positions
    return RDF::URI.new('http://biohackathon.org/resource/faldo#OneOfPosition')
  end

  # Use when you have an idea of the range in which you can find the position, but you cannot be sure about the exact position.
  # (http://biohackathon.org/resource/faldo#InRangePosition)
  def self.Indeterminate_position_within_a_range
    return RDF::URI.new('http://biohackathon.org/resource/faldo#InRangePosition')
  end

  # Use this class to indicate that you lack exact position data.
  # (http://biohackathon.org/resource/faldo#FuzzyPosition)
  def self.Fuzzy_position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition')
  end

  # The inclusive begin position of a position. Also known as start.
  # (http://biohackathon.org/resource/faldo#begin)
  def self.begin
    return RDF::URI.new('http://biohackathon.org/resource/faldo#begin')
  end

  # The inclusive end of the position.
  # (http://biohackathon.org/resource/faldo#end)
  def self.end
    return RDF::URI.new('http://biohackathon.org/resource/faldo#end')
  end

  # A region describes a length of sequence -- with a start position and end position -- that represents a feature on a Sequence. i.e. a gene
  # (http://biohackathon.org/resource/faldo#Region)
  def self.Region
    return RDF::URI.new('http://biohackathon.org/resource/faldo#Region')
  end

  # A position on the first amino acid or nucleotide of a sequence has the value 1, i.e. Python style array indexing as opposed to Java/C indexes.
  # (http://biohackathon.org/resource/faldo#position)
  def self.position
    return RDF::URI.new('http://biohackathon.org/resource/faldo#position')
  end

  # The reference is the resource that determines where the position value offsets into. For example, it points to a contig or a genome assembly.
  # (http://biohackathon.org/resource/faldo#reference)
  def self.reference
    return RDF::URI.new('http://biohackathon.org/resource/faldo#reference')
  end

  # As an ordered list of regions (but the list might not be complete)
  # (http://biohackathon.org/resource/faldo#ListOfRegions)
  def self.ListOfRegions
    return RDF::URI.new('http://biohackathon.org/resource/faldo#ListOfRegions')
  end

  # This is the link between the concept whose location you are annotating the and its range or position. For example, when annotating the region that describes an exon, the exon would be the subject and the region would be the object of the triple or: 'active site' 'location' [is] 'position 3'.
  # (http://biohackathon.org/resource/faldo#location)
  def self.location
    return RDF::URI.new('http://biohackathon.org/resource/faldo#location')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#before') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#after') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#begin') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#end') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#reference') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#location') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#position') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a class.
  #
  # +uri+:: URI that is tested for being a class
  def self.is_class?(uri)
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#BagOfRegions') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#CollectionOfRegions') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#ForwardStrandPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#BothStrandsPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#ReverseStrandPosition') then
      return true
    end
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
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#Region') then
      return true
    end
    if uri == RDF::URI.new('http://biohackathon.org/resource/faldo#ListOfRegions') then
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
  @@parent_properties = { RDF::URI.new('http://biohackathon.org/resource/faldo#BagOfRegions') => RDF::URI.new('http://biohackathon.org/resource/faldo#CollectionOfRegions') , RDF::URI.new('http://biohackathon.org/resource/faldo#ForwardStrandPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#Position') , RDF::URI.new('http://biohackathon.org/resource/faldo#BothStrandsPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#ReverseStrandPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#StrandedPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#OneOfPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition') , RDF::URI.new('http://biohackathon.org/resource/faldo#FuzzyPosition') => RDF::URI.new('http://biohackathon.org/resource/faldo#Position') , RDF::URI.new('http://biohackathon.org/resource/faldo#ListOfRegions') => RDF::URI.new('http://biohackathon.org/resource/faldo#CollectionOfRegions') }

end

end
