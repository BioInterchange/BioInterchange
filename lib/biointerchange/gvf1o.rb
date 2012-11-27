module BioInterchange

class GVF1O

  # Strand of the feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0010)
  def self.strand
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0010')
  end

  # Tag name/value pair attributes of a feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0012)
  def self.attributes
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0012')
  end

  # Link out to the parent feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0014)
  def self.parent
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0014')
  end

  # Relationship that describes which features belong to a feature set.
  # (http://www.biointerchange.org/gvf1o#GVF1_0015)
  def self.contains
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0015')
  end

  # Either:
  #   FALDO "Region" instance replacement for a feature's start, stop, strand properties.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0021)
  # Or:
  #   FALDO "Region" instance replacement for a breakpoint's start, stop, strand properties.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0079)
  def self.region
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0021'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0079') ]
  end

  # NCBI Taxonomy Ontology "NCBITaxon_1" (or sub-classes) instance that denotes the species for a feature set.
  # (http://www.biointerchange.org/gvf1o#GVF1_0023)
  def self.species
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0023')
  end

  # Specific information about the variant(s) of a feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0034)
  def self.variant
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0034')
  end

  # Links to information about an individual.
  # (http://www.biointerchange.org/gvf1o#GVF1_0036)
  def self.individual
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0036')
  end

  # An effect of a particular feature variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0041)
  def self.effect
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0041')
  end

  # Effect of a sequence alteration on a sequence feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0042)
  def self.sequence_variant
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0042')
  end

  # A term that is describing the sequence feature that is being affected.
  # (http://www.biointerchange.org/gvf1o#GVF1_0043)
  def self.feature_type
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0043')
  end

  # Features that are affected by this sequence alteration effect.
  # (http://www.biointerchange.org/gvf1o#GVF1_0044)
  def self.feature_id
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0044')
  end

  # A coordinate range for ambiguous start coordinates.
  # (http://www.biointerchange.org/gvf1o#GVF1_0046)
  def self.start_range
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0046')
  end

  # A coordinate range for ambiguous start coordinates.
  # (http://www.biointerchange.org/gvf1o#GVF1_0047)
  def self.end_range
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0047')
  end

  # Denotes abstract chromosome representations for capturing variants that appear on the same chromosome of a polyploid organism.
  # (http://www.biointerchange.org/gvf1o#GVF1_0051)
  def self.chromosome
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0051')
  end

  # Determines the genotype as observed in an individual.
  # (http://www.biointerchange.org/gvf1o#GVF1_0053)
  def self.genotype
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0053')
  end

  # Either:
  #   Properties that are directly associated with Feature class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0066)
  # Or:
  #   Properties that are directly associated with Feature class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0059)
  def self.feature_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') ]
  end

  # Either:
  #   Properties that are directly associated with SequencedIndividual class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0067)
  # Or:
  #   Properties that are directly associated with SequencedIndividual class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0065)
  def self.sequencedindividual_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0067'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0065') ]
  end

  # Either:
  #   Properties that are directly associated with Set class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0068)
  # Or:
  #   Properties that are directly associated with Set class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0063)
  def self.set_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') ]
  end

  # Either:
  #   Properties that are directly associated with Variant class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0069)
  # Or:
  #   Properties that are directly associated with Variant class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0060)
  def self.variant_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') ]
  end

  # Properties that are directly associated with Effect class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0070)
  def self.effect_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070')
  end

  # Either:
  #   Properties that are directly associated with Breakpoint class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0075)
  # Or:
  #   Properties that are directly associated with Breakpoint class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0071)
  def self.breakpoint_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') ]
  end

  # A database cross-reference to associate a sequence alteration to its  representation in another database.
  # (http://www.biointerchange.org/gvf1o#GVF1_0078)
  def self.dbxref
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0078')
  end

  # Either:
  #   ID of the landmark that establishes the coordinate system for a feature.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0004)
  # Or:
  #   ID of the landmark that establishes the coordinate system for a breakpoint.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0072)
  def self.seqid
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0004'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0072') ]
  end

  # A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
  # (http://www.biointerchange.org/gvf1o#GVF1_0005)
  def self.source
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0005')
  end

  # Type of the feature, which is either a term from the "lite" version of the Sequence Ontology (SOFA), a term from the full Sequence Ontology (SO) that is a child of sequence_feature (SO:0000110), or a SOFA or SO accession number.
  # (http://www.biointerchange.org/gvf1o#GVF1_0006)
  def self.type
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0006')
  end

  # Either:
  #   Start coordinate of the feature on the seqid landmark.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0007)
  # Or:
  #   A coordinate that defines the start of an ambiguous coordinate range.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0048)
  # Or:
  #   Start coordinate of the feature on the seqid landmark.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0073)
  def self.start
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0007'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0048'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0073') ]
  end

  # Either:
  #   End coordinate of the feature on the seqid landmark.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0008)
  # Or:
  #   A coordinate that defines the end of an ambiguous coordinate range.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0049)
  # Or:
  #   End coordinate of the feature on the seqid landmark.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0074)
  def self.end
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0008'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0049'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0074') ]
  end

  # Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
  # (http://www.biointerchange.org/gvf1o#GVF1_0009)
  def self.score
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0009')
  end

  # Tag name of a feature attribute.
  # (http://www.biointerchange.org/gvf1o#GVF1_0013)
  def self.tag
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0013')
  end

  # Version of the GVF specification that defines the feature set contents.
  # (http://www.biointerchange.org/gvf1o#GVF1_0022)
  def self.version
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0022')
  end

  # Name of a genome assembly build that denotes the provenance of features in a feature set. For example, 'NCBI 36' or 'FlyBase r4.1'.
  # (http://www.biointerchange.org/gvf1o#GVF1_0024)
  def self.build
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0024')
  end

  # All sequence variations at a locus -- including the reference sequence when appropriate (for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
  # (http://www.biointerchange.org/gvf1o#GVF1_0025)
  def self.variant_seq
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0025')
  end

  # A unique identifier for the feature within the feature set.
  # (http://www.biointerchange.org/gvf1o#GVF1_0026)
  def self.id
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0026')
  end

  # Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (e.g. dbSNP, OMIM) which should use the dbxref property.
  # (http://www.biointerchange.org/gvf1o#GVF1_0027)
  def self.alias
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0027')
  end

  # Name of an external database. For example, "dbSNP" or "OMIM".
  # (http://www.biointerchange.org/gvf1o#GVF1_0029)
  def self.name
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0029')
  end

  # External database identifier. For example, for dbSNP, this identifier could be "rs3131969".
  # (http://www.biointerchange.org/gvf1o#GVF1_0030)
  def self.xref
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0030')
  end

  # Sequence from the reference genome.
  # (http://www.biointerchange.org/gvf1o#GVF1_0031)
  def self.reference_seq
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0031')
  end

  # Number of reads that are supporting this variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0032)
  def self.variant_reads
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0032')
  end

  # Total number of reads.
  # (http://www.biointerchange.org/gvf1o#GVF1_0037)
  def self.total_reads
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0037')
  end

  # Zygosity of a feature locus.
  # (http://www.biointerchange.org/gvf1o#GVF1_0038)
  def self.zygosity
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0038')
  end

  # Frequency of a variant in a population.
  # (http://www.biointerchange.org/gvf1o#GVF1_0039)
  def self.variant_freq
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0039')
  end

  # Unclear from GVF specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0050)
  def self.phased
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0050')
  end

  # Describes the codon that overlaps this variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0054)
  def self.variant_codon
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0054')
  end

  # Describes the codon from the reference sequence whose coordinates overlap with this variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0055)
  def self.reference_codon
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0055')
  end

  # Amino acid that overlaps with the variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0056)
  def self.variant_aa
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0056')
  end

  # Amino acid in the reference genome that overlaps with a variant's genome coordinates.
  # (http://www.biointerchange.org/gvf1o#GVF1_0057)
  def self.reference_aa
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0057')
  end

  # Properties that are directly associated with Range class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0061)
  def self.range_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0061')
  end

  # Properties that are directly associated with DBXRef class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0062)
  def self.dbxref_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0062')
  end

  # Properties that are directly associated with Attribute class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0064)
  def self.attribute_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0064')
  end

  # Sequence context (positive strand) of a feature on the 5' end.
  # (http://www.biointerchange.org/gvf1o#GVF1_0076)
  def self.a_context
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0076')
  end

  # Set of genomic sequence features, whose identifiers are unique within the set.
  # (http://www.biointerchange.org/gvf1o#GVF1_0001)
  def self.Set
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0001')
  end

  # A genomic sequence feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0002)
  def self.Feature
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0002')
  end

  def self.Attribute
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0003')
  end

  # Class describing a genomic strand. Instances of the class (individuals) are used to denote forward-/reverse-strands, etc.
  # (http://www.biointerchange.org/gvf1o#GVF1_0016)
  def self.Strand
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0016')
  end

  # A class describing relationships between features and external databases.
  # (http://www.biointerchange.org/gvf1o#GVF1_0028)
  def self.DBXRef
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0028')
  end

  # Describing specific alterations of a feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0033)
  def self.Variant
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0033')
  end

  # Aggregated sequencing information for a particular individual.
  # (http://www.biointerchange.org/gvf1o#GVF1_0035)
  def self.SequencedIndividual
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0035')
  end

  # Describing the effect of a feature variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0040)
  def self.Effect
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0040')
  end

  # Describe ambiguity in either start or end coordinates.
  # (http://www.biointerchange.org/gvf1o#GVF1_0045)
  def self.Range
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0045')
  end

  # An abstract representation of a chromosome to represent ploidy.
  # (http://www.biointerchange.org/gvf1o#GVF1_0052)
  def self.Chromosome
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0052')
  end

  # Describes the source or destination of a zero-length sequence alteration.
  # (http://www.biointerchange.org/gvf1o#GVF1_0058)
  def self.Breakpoint
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0058')
  end

  # Location on the positive (forward) strand.
  # (http://www.biointerchange.org/gvf1o#GVF1_0017)
  def self.Positive
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0017')
  end

  # Location on the negative (reverse) strand.
  # (http://www.biointerchange.org/gvf1o#GVF1_0018)
  def self.Negative
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0018')
  end

  # Strand was not determined, which leaves it open whether the location is on the positive (forward) or negative (reverse) strand.
  # (http://www.biointerchange.org/gvf1o#GVF1_0019)
  def self.UnknownStrand
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0019')
  end

  # Strand is not applicable.
  # (http://www.biointerchange.org/gvf1o#GVF1_0020)
  def self.NotStranded
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0020')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0010') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0012') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0014') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0015') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0021') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0023') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0034') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0036') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0041') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0042') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0043') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0044') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0046') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0047') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0051') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0053') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0067') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0078') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0079') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0004') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0005') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0006') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0007') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0008') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0009') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0013') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0022') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0024') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0025') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0026') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0027') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0029') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0030') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0031') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0032') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0037') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0038') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0039') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0048') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0049') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0050') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0054') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0055') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0056') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0057') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0061') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0062') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0064') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0065') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0072') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0073') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0074') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0076') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0077') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a class.
  #
  # +uri+:: URI that is tested for being a class
  def self.is_class?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0001') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0002') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0003') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0016') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0028') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0033') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0035') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0040') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0045') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0052') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0058') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a named individual.
  #
  # +uri+:: URI that is tested for being a named individual
  def self.is_named_individual?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0017') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0018') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0019') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0020') then
      return true
    end
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
  @@parent_properties = { RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0010') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0012') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0014') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0015') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0021') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0023') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0034') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0036') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0041') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0042') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0043') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0044') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0046') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0047') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0051') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0067') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0053') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0078') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0079') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0004') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0005') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0006') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0007') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0008') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0009') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0013') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0064') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0022') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0024') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0025') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0026') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0027') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0029') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0062') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0030') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0062') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0031') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0032') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0037') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0065') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0038') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0039') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0048') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0061') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0049') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0061') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0050') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0054') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0055') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0056') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0057') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0072') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0073') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0074') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0076') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0077') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') }

end

end
