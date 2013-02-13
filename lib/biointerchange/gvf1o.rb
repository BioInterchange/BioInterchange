module BioInterchange

class GVF1O

  # Either:
  #   Establishes the landmark (e.g. a chromosome) on which a feature is located.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0004)
  # Or:
  #   Link to the landmark that establishes the coordinate system for the breakpoint.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0072)
  def self.seqid
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0004'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0072') ]
  end

  # Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
  # (http://www.biointerchange.org/gvf1o#GVF1_0006)
  def self.type
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0006')
  end

  # Either:
  #   Strand of the feature.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0010)
  # Or:
  #   Strand of the breakpoint.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0083)
  # Or:
  #   Strand of a target -- if applicable.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0091)
  def self.strand
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0010'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0083'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0091') ]
  end

  # Either:
  #   Tag name/value pair attributes of a feature.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0012)
  # Or:
  #   Tag name/value pair attributes that are not captured by the GVF specification.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0152)
  def self.attributes
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0012'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0152') ]
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
  # Or:
  #   FALDO "Region" instance replacement for a target's start, stop, strand  properties.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0090)
  def self.region
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0021'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0079'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0090') ]
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

  # Zygosity of a variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0038)
  def self.zygosity
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0038')
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
  def self.feature
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

  # Either:
  #   A database cross-reference to associate a sequence alteration to its representation in another database.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0078)
  # Or:
  #   A database cross-reference to associate a structured pragma to a representation in another database.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0104)
  def self.dbxref
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0078'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0104') ]
  end

  # Potential source or destination of zero-length sequence alterations.
  # (http://www.biointerchange.org/gvf1o#GVF1_0080)
  def self.breakpoint
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0080')
  end

  # Either:
  #   Properties that are directly associated with Target class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0089)
  # Or:
  #   Properties that are directly associated with Target class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0092)
  def self.target_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0089'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0092') ]
  end

  # A cross-reference to an ontology term that is associated with a feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0096)
  def self.ontology_term
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0096')
  end

  # Either:
  #   Properties that are directly associated with TechnologyPlatform class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0102)
  # Or:
  #   Properties that are directly associated with TechnologyPlatform class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0107)
  def self.technologyplatform_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0102'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') ]
  end

  # Properties that are directly associated with DataSource class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0103)
  def self.datasource_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0103')
  end

  # Either:
  #   Properties describing structured pragma properties.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0112)
  # Or:
  #   Properties describing structured pragma properties.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0113)
  def self.structuredpragma_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0112'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0113') ]
  end

  # Types of reads produced by the platform.
  # (http://www.biointerchange.org/gvf1o#GVF1_0119)
  def self.read_type
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0119')
  end

  # Datatype of this data source.
  # (http://www.biointerchange.org/gvf1o#GVF1_0120)
  def self.data_type
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0120')
  end

  # Technology platform that was used to derive the feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0121)
  def self.technology_platform
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0121')
  end

  # Data source origin of the feature.
  # (http://www.biointerchange.org/gvf1o#GVF1_0122)
  def self.data_source
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0122')
  end

  # Used scoring method.
  # (http://www.biointerchange.org/gvf1o#GVF1_0123)
  def self.score_method
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0123')
  end

  # Further information about the algorithm/methodologies used.
  # (http://www.biointerchange.org/gvf1o#GVF1_0124)
  def self.source_method
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0124')
  end

  # Further information about an individual's phenotype. Applies only to single individual sets.
  # (http://www.biointerchange.org/gvf1o#GVF1_0125)
  def self.phenotype_description
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0125')
  end

  # Either:
  #   Further information about the associated attribute(s).
  #   (http://www.biointerchange.org/gvf1o#GVF1_0126)
  # Or:
  #   Further information about the associated attribute(s).
  #   (http://www.biointerchange.org/gvf1o#GVF1_0127)
  # Or:
  #   Further information about the associated attribute(s).
  #   (http://www.biointerchange.org/gvf1o#GVF1_0129)
  # Or:
  #   Further information about the associated attribute(s).
  #   (http://www.biointerchange.org/gvf1o#GVF1_0130)
  # Or:
  #   Further information about the associated attribute(s).
  #   (http://www.biointerchange.org/gvf1o#GVF1_0131)
  def self.attribute_method
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0126'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0127'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0129'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0130'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0131') ]
  end

  # Either:
  #   Properties about Attribute instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0128)
  # Or:
  #   Properties that are directly associated with Attribute class instances.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0064)
  def self.attribute_properties
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0128'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0064') ]
  end

  # Denotes the sex of the sequenced individual for single-individual sets.
  # (http://www.biointerchange.org/gvf1o#GVF1_0147)
  def self.sex
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0147')
  end

  # Denotes the source of genomic data (on a cell-type level).
  # (http://www.biointerchange.org/gvf1o#GVF1_0148)
  def self.genomic_source
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0148')
  end

  # Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
  # (http://www.biointerchange.org/gvf1o#GVF1_0150)
  def self.feature_ontology
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0150')
  end

  # A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
  # (http://www.biointerchange.org/gvf1o#GVF1_0005)
  def self.source
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0005')
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
  # Or:
  #   Start coordinate of the target.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0094)
  # Or:
  #   Genomic start coordinate of the landmark.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0138)
  def self.start
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0007'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0048'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0073'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0094'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0138') ]
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
  # Or:
  #   End coordinate of the target.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0095)
  # Or:
  #   Genomic end coordinate of the landmark.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0139)
  def self.end
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0008'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0049'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0074'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0095'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0139') ]
  end

  # Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
  # (http://www.biointerchange.org/gvf1o#GVF1_0009)
  def self.score
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0009')
  end

  # Either:
  #   Tag name of a feature attribute.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0013)
  # Or:
  #   Tag name of an user defined structured attribute.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0154)
  def self.tag
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0013'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0154') ]
  end

  # Version of the GVF specification that defines the feature set contents.
  # (http://www.biointerchange.org/gvf1o#GVF1_0022)
  def self.gvf_version
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

  # Either:
  #   A unique identifier for the feature within the feature set.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0026)
  # Or:
  #   ID that uniquely establishes the Landmark's identity within a Set.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0137)
  def self.id
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0026'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0137') ]
  end

  # Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (e.g. dbSNP, OMIM) which should use the dbxref property.
  # (http://www.biointerchange.org/gvf1o#GVF1_0027)
  def self.alias
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0027')
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

  # Frequency of a variant in a population.
  # (http://www.biointerchange.org/gvf1o#GVF1_0039)
  def self.variant_freq
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0039')
  end

  # Either:
  #   Unclear from GVF specification.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0050)
  # Or:
  #   Indicates whether this particular is phased. Used to encode ##phased-genotypes statements.
  #   (http://www.biointerchange.org/gvf1o#GVF1_0101)
  def self.phased
    return [ RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0050'), RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0101') ]
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

  # Sequence context (positive strand) of a feature on the 5' end.
  # (http://www.biointerchange.org/gvf1o#GVF1_0076)
  def self.a_context
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0076')
  end

  # Version of the GFF specification that defines the feature set contents apart from GVF related definitions.
  # (http://www.biointerchange.org/gvf1o#GVF1_0081)
  def self.gff_version
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0081')
  end

  # Creation date of the GVF file that this set stems from.
  # (http://www.biointerchange.org/gvf1o#GVF1_0082)
  def self.file_date
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0082')
  end

  # ID or accession of the target alignment.
  # (http://www.biointerchange.org/gvf1o#GVF1_0093)
  def self.target_id
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0093')
  end

  # An arbitrary comment. Free text.
  # (http://www.biointerchange.org/gvf1o#GVF1_0105)
  def self.comment
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0105')
  end

  # Type of technology used to gather the variant data. Unrestricted range due to open specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0106)
  def self.platform_class
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0106')
  end

  # Sequencer or other machine used to collect the variant data. Unrestricted range due to open specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0108)
  def self.platform_name
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0108')
  end

  # Undocumented in GVF specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0132)
  def self.read_length
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0132')
  end

  # Undocumented in GVF specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0133)
  def self.read_pair_span
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0133')
  end

  # Undocumented in GVF specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0134)
  def self.average_coverage
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0134')
  end

  # Properties that are directly associated with Landmark class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0136)
  def self.landmark_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0136')
  end

  # Version of the GVF file that this set stems from.
  # (http://www.biointerchange.org/gvf1o#GVF1_0149)
  def self.file_version
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0149')
  end

  # Properties that are directly associated with StructuredAttribute class instances.
  # (http://www.biointerchange.org/gvf1o#GVF1_0153)
  def self.structuredattribute_properties
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0153')
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

  # Representation of attribute tag/value pairs that are not covered by specific classes such as Effect or Variant.
  # (http://www.biointerchange.org/gvf1o#GVF1_0003)
  def self.Attribute
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0003')
  end

  # Class describing a genomic strand. Instances of the class (individuals) are used to denote forward-/reverse-strands, etc.
  # (http://www.biointerchange.org/gvf1o#GVF1_0016)
  def self.Strand
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0016')
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

  # Denotes the zygosity of alleles.
  # (http://www.biointerchange.org/gvf1o#GVF1_0084)
  def self.Zygosity
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0084')
  end

  # Indicates a feature's "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
  # (http://www.biointerchange.org/gvf1o#GVF1_0088)
  def self.Target
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0088')
  end

  # Details about the sequencing/microarray technology used to gather the data in a set.
  # (http://www.biointerchange.org/gvf1o#GVF1_0097)
  def self.TechnologyPlatform
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0097')
  end

  # Provides information about the source of the data. For example, it can link out to actual sequences associated with the Feature individuals in a Set.
  # (http://www.biointerchange.org/gvf1o#GVF1_0098)
  def self.DataSource
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0098')
  end

  # Information about the used scoring algorithm or method.
  # (http://www.biointerchange.org/gvf1o#GVF1_0099)
  def self.Method
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0099')
  end

  # Additional information about an individual's phenotype.
  # (http://www.biointerchange.org/gvf1o#GVF1_0100)
  def self.PhenotypeDescription
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0100')
  end

  # Type of reads obtained for a given technology platform.
  # (http://www.biointerchange.org/gvf1o#GVF1_0109)
  def self.ReadType
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0109')
  end

  # Determines the datatype of a variant sequence.
  # (http://www.biointerchange.org/gvf1o#GVF1_0114)
  def self.DataType
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0114')
  end

  # A landmark that establishes the coordinate system for features.
  # (http://www.biointerchange.org/gvf1o#GVF1_0135)
  def self.Landmark
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0135')
  end

  # For single individual sets, the Sex class' OWL-individuals can be used to specify the sex of the sequenced (real-life) individuals.
  # (http://www.biointerchange.org/gvf1o#GVF1_0140)
  def self.Sex
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0140')
  end

  # An enumerated class for determining the genomic source (cell type) of sequenced data.
  # (http://www.biointerchange.org/gvf1o#GVF1_0141)
  def self.GenomicSource
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0141')
  end

  # Representation of attribute tag/value pairs that are specific to particular structured attributes, but which are not covered by the GVF specification.
  # (http://www.biointerchange.org/gvf1o#GVF1_0151)
  def self.StructuredAttribute
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0151')
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

  # Denotes heterozygous alleles.
  # (http://www.biointerchange.org/gvf1o#GVF1_0085)
  def self.Heterozygous
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0085')
  end

  # Denotes homozygous alleles.
  # (http://www.biointerchange.org/gvf1o#GVF1_0086)
  def self.Homozygous
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0086')
  end

  # Denotes hemizygous alleles.
  # (http://www.biointerchange.org/gvf1o#GVF1_0087)
  def self.Hemizygous
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0087')
  end

  # Denotes reads that are fragments.
  # (http://www.biointerchange.org/gvf1o#GVF1_0110)
  def self.Fragment
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0110')
  end

  # Denotes reads that are pairs.
  # (http://www.biointerchange.org/gvf1o#GVF1_0111)
  def self.Pair
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0111')
  end

  # Denotes a DNA sequence.
  # (http://www.biointerchange.org/gvf1o#GVF1_0115)
  def self.DNASequence
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0115')
  end

  # Denotes an RNA sequence.
  # (http://www.biointerchange.org/gvf1o#GVF1_0116)
  def self.RNASequence
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0116')
  end

  # Denotes a DNA microarray probe.
  # (http://www.biointerchange.org/gvf1o#GVF1_0117)
  def self.DNAMicroarray
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0117')
  end

  # Denotes an array-comparative genomic hybridization.
  # (http://www.biointerchange.org/gvf1o#GVF1_0118)
  def self.ArrayComparativeGenomicHybridization
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0118')
  end

  # Denotes that a Set contains features of a female.
  # (http://www.biointerchange.org/gvf1o#GVF1_0142)
  def self.Female
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0142')
  end

  # Denotes that a Set contains features of a male.
  # (http://www.biointerchange.org/gvf1o#GVF1_0143)
  def self.Male
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0143')
  end

  # Denotes that a set contains features of prenatal cells.
  # (http://www.biointerchange.org/gvf1o#GVF1_0144)
  def self.Prenatal
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0144')
  end

  # Denotes that a set contains features of germline cells.
  # (http://www.biointerchange.org/gvf1o#GVF1_0145)
  def self.Germline
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0145')
  end

  # Denotes that a set contains features of somatic cells.
  # (http://www.biointerchange.org/gvf1o#GVF1_0146)
  def self.Somatic
    return RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0146')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0004') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0006') then
      return true
    end
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0038') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0072') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0080') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0083') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0089') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0090') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0091') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0096') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0102') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0103') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0104') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0112') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0119') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0120') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0121') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0122') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0123') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0124') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0125') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0126') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0127') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0128') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0129') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0130') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0131') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0147') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0148') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0150') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0152') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0005') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0031') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0032') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0037') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0081') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0082') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0092') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0093') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0094') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0095') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0101') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0105') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0106') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0108') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0113') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0132') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0133') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0134') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0136') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0137') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0138') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0139') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0149') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0153') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0154') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0084') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0088') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0097') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0098') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0099') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0100') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0109') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0114') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0135') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0140') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0141') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0151') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0085') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0086') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0087') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0110') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0111') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0115') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0116') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0117') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0118') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0142') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0143') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0144') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0145') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0146') then
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
  @@parent_properties = { RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0004') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0006') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0010') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0012') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0014') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0015') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0021') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0023') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0034') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0036') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0038') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0041') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0042') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0043') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0044') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0046') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0047') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0051') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0067') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0053') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0072') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0078') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0079') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0080') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0083') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0090') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0089') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0091') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0089') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0096') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0102') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0112') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0103') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0112') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0104') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0112') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0119') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0102') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0120') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0103') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0121') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0122') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0123') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0124') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0066') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0125') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0126') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0070') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0127') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0075') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0129') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0128') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0130') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0089') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0131') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0069') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0147') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0148') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0150') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0068') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0152') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0112') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0005') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0007') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0008') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0009') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0013') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0064') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0022') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0024') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0025') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0026') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0027') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0031') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0032') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0037') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0065') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0039') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0048') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0061') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0049') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0061') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0050') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0054') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0055') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0056') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0060') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0057') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0073') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0074') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0071') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0076') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0077') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0081') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0082') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0093') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0092') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0094') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0092') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0095') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0092') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0101') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0059') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0105') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0113') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0106') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0113') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0108') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0132') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0133') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0134') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0107') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0137') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0136') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0138') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0136') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0139') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0136') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0149') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0063') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0154') => RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0153') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0088') => RDF::URI.new('http://www.w3.org/2002/07/owl#Thing') , RDF::URI.new('http://www.biointerchange.org/gvf1o#GVF1_0151') => RDF::URI.new('http://www.w3.org/2002/07/owl#Thing') }

end

end
