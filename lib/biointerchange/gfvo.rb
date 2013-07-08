require 'rdf'
module BioInterchange

class GFVO

  # Further information about the associated attribute(s).
  # (http://www.biointerchange.org/gfvo#attributeMethod)
  def self.attribute_method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#attributeMethod')
  end

  # Tag name/value pair attributes of a feature.
  # (http://www.biointerchange.org/gfvo#attributes)
  def self.attributes
    return RDF::URI.new('http://www.biointerchange.org/gfvo#attributes')
  end

  # Potential source or destination of zero-length sequence alterations.
  # (http://www.biointerchange.org/gfvo#breakpoint)
  def self.breakpoint
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpoint')
  end

  # FALDO "Region" instance replacement for a breakpoint's start, stop, strand properties.
  # (http://www.biointerchange.org/gfvo#breakpointLocus)
  def self.breakpoint_locus
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointLocus')
  end

  # Properties that are directly associated with Breakpoint class instances.
  # (http://www.biointerchange.org/gfvo#breakpointObjectProperty)
  def self.breakpoint_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointObjectProperty')
  end

  # Link to the landmark that establishes the coordinate system for the breakpoint.
  # (http://www.biointerchange.org/gfvo#breakpointSeqid)
  def self.breakpoint_seqid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointSeqid')
  end

  # Denotes abstract chromosome representations for capturing variants that appear on the same chromosome of a polyploid organism.
  # (http://www.biointerchange.org/gfvo#chromosome)
  def self.chromosome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#chromosome')
  end

  # Relationship that describes which features belong to a feature set.
  # (http://www.biointerchange.org/gfvo#contains)
  def self.contains
    return RDF::URI.new('http://www.biointerchange.org/gfvo#contains')
  end

  # Data source origin of the feature.
  # (http://www.biointerchange.org/gfvo#dataSource)
  def self.data_source
    return RDF::URI.new('http://www.biointerchange.org/gfvo#dataSource')
  end

  # Datatype of this data source.
  # (http://www.biointerchange.org/gfvo#dataType)
  def self.data_type
    return RDF::URI.new('http://www.biointerchange.org/gfvo#dataType')
  end

  # Properties that are directly associated with DataSource class instances.
  # (http://www.biointerchange.org/gfvo#datasourceObjectProperty)
  def self.datasource_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#datasourceObjectProperty')
  end

  # An effect of a particular feature variant.
  # (http://www.biointerchange.org/gfvo#effect)
  def self.effect
    return RDF::URI.new('http://www.biointerchange.org/gfvo#effect')
  end

  # Properties that are directly associated with Effect class instances.
  # (http://www.biointerchange.org/gfvo#effectObjectProperty)
  def self.effect_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty')
  end

  # A coordinate range for ambiguous start coordinates.
  # (http://www.biointerchange.org/gfvo#endRange)
  def self.end_range
    return RDF::URI.new('http://www.biointerchange.org/gfvo#endRange')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty)
  def self.feature_annotation_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty')
  end

  # A database cross-reference to associate a sequence alteration to its representation in another database.
  # (http://www.biointerchange.org/gfvo#featureDbxref)
  def self.featureDbxref
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureDbxref')
  end

  # Properties that are directly associated with Feature class instances.
  # (http://www.biointerchange.org/gfvo#featureObjectProperty)
  def self.feature_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty')
  end

  # Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
  # (http://www.biointerchange.org/gfvo#featureOntology)
  def self.feature_ontology
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureOntology')
  end

  # A term that is describing the sequence feature that is being affected.
  # (http://www.biointerchange.org/gfvo#featureType)
  def self.feature_type
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureType')
  end

  # Denotes the source of genomic data (on a cell-type level).
  # (http://www.biointerchange.org/gfvo#genomicSource)
  def self.genomic_source
    return RDF::URI.new('http://www.biointerchange.org/gfvo#genomicSource')
  end

  # Determines the genotype as observed in an individual.
  # (http://www.biointerchange.org/gfvo#genotype)
  def self.genotype
    return RDF::URI.new('http://www.biointerchange.org/gfvo#genotype')
  end

  # Links to information about an individual.
  # (http://www.biointerchange.org/gfvo#individual)
  def self.individual
    return RDF::URI.new('http://www.biointerchange.org/gfvo#individual')
  end

  # FALDO "Region" instance replacement for a feature's start, stop, strand properties.
  # (http://www.biointerchange.org/gfvo#locus)
  def self.locus
    return RDF::URI.new('http://www.biointerchange.org/gfvo#locus')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#locusAnnotationObjectProperty)
  def self.locus_annotation_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationObjectProperty')
  end

  # A cross-reference to an ontology term that is associated with a feature.
  # (http://www.biointerchange.org/gfvo#ontologyTerm)
  def self.ontology_term
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ontologyTerm')
  end

  # Link out to the parent feature.
  # (http://www.biointerchange.org/gfvo#parent)
  def self.parent
    return RDF::URI.new('http://www.biointerchange.org/gfvo#parent')
  end

  # Further information about an individual's phenotype. Applies only to single individual sets.
  # (http://www.biointerchange.org/gfvo#phenotypeDescription)
  def self.phenotype_description
    return RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescription')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#phenotypeDescriptionObjectProperty)
  def self.phenotype_description_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescriptionObjectProperty')
  end

  # Types of reads produced by the platform.
  # (http://www.biointerchange.org/gfvo#readType)
  def self.read_type
    return RDF::URI.new('http://www.biointerchange.org/gfvo#readType')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#recordObjectProperty)
  def self.record_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#recordObjectProperty')
  end

  # Used scoring method.
  # (http://www.biointerchange.org/gfvo#scoreMethod)
  def self.score_method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#scoreMethod')
  end

  # Establishes the landmark (e.g. a chromosome) on which a feature is located.
  # (http://www.biointerchange.org/gfvo#seqid)
  def self.seqid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#seqid')
  end

  # Effect of a sequence alteration on a sequence feature.
  # (http://www.biointerchange.org/gfvo#sequenceVariant)
  def self.sequence_variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceVariant')
  end

  # Properties that are directly associated with SequencedIndividual class instances.
  # (http://www.biointerchange.org/gfvo#sequencedIndividualObjectProperty)
  def self.sequenced_individual_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualObjectProperty')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#setAnnotationObjectProperty)
  def self.set_annotation_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#setAnnotationObjectProperty')
  end

  # Properties that are directly associated with Set class instances.
  # (http://www.biointerchange.org/gfvo#setObjectProperty)
  def self.set_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty')
  end

  # Denotes the sex of the sequenced individual for single-individual sets.
  # (http://www.biointerchange.org/gfvo#sex)
  def self.sex
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sex')
  end

  # Further information about the algorithm/methodologies used.
  # (http://www.biointerchange.org/gfvo#sourceMethod)
  def self.source_method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sourceMethod')
  end

  # NCBI Taxonomy Ontology "NCBITaxon_1" (or sub-classes) instance that denotes the species for a feature set.
  # (http://www.biointerchange.org/gfvo#species)
  def self.species
    return RDF::URI.new('http://www.biointerchange.org/gfvo#species')
  end

  # A coordinate range for ambiguous start coordinates.
  # (http://www.biointerchange.org/gfvo#startRange)
  def self.start_range
    return RDF::URI.new('http://www.biointerchange.org/gfvo#startRange')
  end

  # Strand of the feature.
  # (http://www.biointerchange.org/gfvo#strand)
  def self.strand
    return RDF::URI.new('http://www.biointerchange.org/gfvo#strand')
  end

  # Tag name/value pair attributes that are not captured by the GVF specification.
  # (http://www.biointerchange.org/gfvo#structuredAttributes)
  def self.structured_attributes
    return RDF::URI.new('http://www.biointerchange.org/gfvo#structuredAttributes')
  end

  # Identifies the target that the features aligns to.
  # (http://www.biointerchange.org/gfvo#target)
  def self.target
    return RDF::URI.new('http://www.biointerchange.org/gfvo#target')
  end

  # Further information about the associated attribute(s).
  # (http://www.biointerchange.org/gfvo#targetAttributeMethod)
  def self.target_attribute_method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetAttributeMethod')
  end

  # FALDO "Region" instance replacement for a target's start, stop, strand  properties.
  # (http://www.biointerchange.org/gfvo#targetLocus)
  def self.target_locus
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetLocus')
  end

  # Properties that are directly associated with Target class instances.
  # (http://www.biointerchange.org/gfvo#targetProperty)
  def self.target_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetProperty')
  end

  # A database cross-reference to associate a structured pragma to a representation in another database.
  # (http://www.biointerchange.org/gfvo#technicalAnnotationDbxref)
  def self.technical_annotation_dbxref
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technicalAnnotationDbxref')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty)
  def self.technological_annotation_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty')
  end

  # Technology platform that was used to derive the feature.
  # (http://www.biointerchange.org/gfvo#technologyPlatform)
  def self.technology_platform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatform')
  end

  # Properties that are directly associated with TechnologyPlatform class instances.
  # (http://www.biointerchange.org/gfvo#technologyPlatformProperty)
  def self.technology_platform_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformProperty')
  end

  # Specific information about the variant(s) of a feature.
  # (http://www.biointerchange.org/gfvo#variant)
  def self.variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variant')
  end

  # Properties that are directly associated with Variant class instances.
  # (http://www.biointerchange.org/gfvo#variantObjectProperty)
  def self.variant_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variantObjectProperty')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#variationAnnotationObjectProperty)
  def self.variation_annotation_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationObjectProperty')
  end

  # Zygosity of a variant.
  # (http://www.biointerchange.org/gfvo#zygosity)
  def self.zygosity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#zygosity')
  end

  # Sequence context (positive strand) of a feature on the 3' end.
  # (http://www.biointerchange.org/gfvo#3primeContext)
  def self.a_context
    return RDF::URI.new('http://www.biointerchange.org/gfvo#3primeContext')
  end

  # Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (e.g. dbSNP, OMIM) which should use the dbxref property.
  # (http://www.biointerchange.org/gfvo#alias)
  def self.alias
    return RDF::URI.new('http://www.biointerchange.org/gfvo#alias')
  end

  # Undocumented in GVF specification.
  # (http://www.biointerchange.org/gfvo#averageCoverage)
  def self.average_coverage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#averageCoverage')
  end

  # Properties that are directly associated with Breakpoint class instances.
  # (http://www.biointerchange.org/gfvo#breakpointDatatypeProperty)
  def self.breakpoint_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointDatatypeProperty')
  end

  # End coordinate of the feature on the seqid landmark.
  # (http://www.biointerchange.org/gfvo#breakpointEnd)
  def self.breakpoint_end
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointEnd')
  end

  # Start coordinate of the feature on the seqid landmark.
  # (http://www.biointerchange.org/gfvo#breakpointStart)
  def self.breakpoint_start
    return RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointStart')
  end

  # Name of a genome assembly build that denotes the provenance of features in a feature set. For example, 'NCBI 36' or 'FlyBase r4.1'.
  # (http://www.biointerchange.org/gfvo#build)
  def self.build
    return RDF::URI.new('http://www.biointerchange.org/gfvo#build')
  end

  # A free text note. Should be replaced with "http://www.w3.org/2000/01/rdf-schema#comment".
  # (http://www.biointerchange.org/gfvo#comment)
  def self.comment
    return RDF::URI.new('http://www.biointerchange.org/gfvo#comment')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#customAnnotationDatatypeProperty)
  def self.custom_annotation_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#customAnnotationDatatypeProperty')
  end

  # Properties that are directly associated with Effect class instances.
  # (http://www.biointerchange.org/gfvo#effectDatatypeProperty)
  def self.effect_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#effectDatatypeProperty')
  end

  # Features that are affected by this sequence alteration effect. This can be an external feature identifier, such as an Ensembl gene/transcript identifier.
  # (http://www.biointerchange.org/gfvo#feature)
  def self.feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#feature')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty)
  def self.feature_annotation_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty')
  end

  # Properties that are directly associated with Feature class instances.
  # (http://www.biointerchange.org/gfvo#featureDatatypeProperty)
  def self.feature_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty')
  end

  # End coordinate of the feature on the seqid landmark.
  # (http://www.biointerchange.org/gfvo#featureEnd)
  def self.feature_end
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureEnd')
  end

  # Sequence associated with this feature, if it has been specified using a FASTA string.
  # (http://www.biointerchange.org/gfvo#featureSequence)
  def self.feature_sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureSequence')
  end

  # Start coordinate of the feature on the seqid landmark.
  # (http://www.biointerchange.org/gfvo#featureStart)
  def self.feature_start
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureStart')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#fileDatatypeProperty)
  def self.file_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty')
  end

  # Creation date of the file that this set stems from.
  # (http://www.biointerchange.org/gfvo#fileDate)
  def self.file_date
    return RDF::URI.new('http://www.biointerchange.org/gfvo#fileDate')
  end

  # Version of the GVF file that this set stems from.
  # (http://www.biointerchange.org/gfvo#fileVersion)
  def self.file_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#fileVersion')
  end

  # Version of the GFF specification that defines the feature set contents apart from GVF related definitions.
  # (http://www.biointerchange.org/gfvo#gffVersion)
  def self.gff_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#gffVersion')
  end

  # Version of the GTF specification that defines the feature set contents.
  # (http://www.biointerchange.org/gfvo#gtfVersion)
  def self.gtf_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#gtfVersion')
  end

  # Version of the GVF specification that defines the feature set contents.
  # (http://www.biointerchange.org/gfvo#gvfVersion)
  def self.gvf_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#gvfVersion')
  end

  # A unique identifier for the feature within the feature set.
  # (http://www.biointerchange.org/gfvo#id)
  def self.id
    return RDF::URI.new('http://www.biointerchange.org/gfvo#id')
  end

  # Describes whether a feature is circular or not.
  # (http://www.biointerchange.org/gfvo#isCircular)
  def self.is_circular
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isCircular')
  end

  # Indicates whether this particular is phased. Used to encode ##phased-genotypes statements.
  # (http://www.biointerchange.org/gfvo#isPhased)
  def self.is_phased
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isPhased')
  end

  # Unclear from GVF specification.
  # (http://www.biointerchange.org/gfvo#isPhasedVariant)
  def self.is_phased_variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isPhasedVariant')
  end

  # Properties that are directly associated with Landmark class instances.
  # (http://www.biointerchange.org/gfvo#landmarkDatatypeProperty)
  def self.landmark_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty')
  end

  # Genomic end coordinate of the landmark.
  # (http://www.biointerchange.org/gfvo#landmarkEnd)
  def self.landmark_end
    return RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkEnd')
  end

  # ID that uniquely establishes the Landmark's identity within a Set.
  # (http://www.biointerchange.org/gfvo#landmarkId)
  def self.landmark_id
    return RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkId')
  end

  # Sequence associated with this feature, if it has been specified using a FASTA string.
  # (http://www.biointerchange.org/gfvo#landmarkSequence)
  def self.landmark_sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkSequence')
  end

  # Genomic start coordinate of the landmark.
  # (http://www.biointerchange.org/gfvo#landmarkStart)
  def self.landmark_start
    return RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkStart')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty)
  def self.locus_annotation_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty')
  end

  # Name of a feature, which can be used for display purposes. The name is not a unique property among features.
  # (http://www.biointerchange.org/gfvo#name)
  def self.name
    return RDF::URI.new('http://www.biointerchange.org/gfvo#name')
  end

  # A free text note. Should be replaced with "http://www.w3.org/2000/01/rdf-schema#comment".
  # (http://www.biointerchange.org/gfvo#note)
  def self.note
    return RDF::URI.new('http://www.biointerchange.org/gfvo#note')
  end

  # Phase of the feature, if it is a CDS. Called "frame" in GTF.
  # (http://www.biointerchange.org/gfvo#phase)
  def self.phase
    return RDF::URI.new('http://www.biointerchange.org/gfvo#phase')
  end

  # Type of technology used to gather the variant data. Unrestricted range due to open specification.
  # (http://www.biointerchange.org/gfvo#platformClass)
  def self.platform_class
    return RDF::URI.new('http://www.biointerchange.org/gfvo#platformClass')
  end

  # Sequencer or other machine used to collect the variant data. Unrestricted range due to open specification.
  # (http://www.biointerchange.org/gfvo#platformName)
  def self.platform_name
    return RDF::URI.new('http://www.biointerchange.org/gfvo#platformName')
  end

  # Properties that are directly associated with Range class instances.
  # (http://www.biointerchange.org/gfvo#rangeDatatypeProperty)
  def self.range_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#rangeDatatypeProperty')
  end

  # A coordinate that defines the end of an ambiguous coordinate range.
  # (http://www.biointerchange.org/gfvo#rangeEnd)
  def self.range_end
    return RDF::URI.new('http://www.biointerchange.org/gfvo#rangeEnd')
  end

  # A coordinate that defines the start of an ambiguous coordinate range.
  # (http://www.biointerchange.org/gfvo#rangeStart)
  def self.range_start
    return RDF::URI.new('http://www.biointerchange.org/gfvo#rangeStart')
  end

  # Undocumented in GVF specification.
  # (http://www.biointerchange.org/gfvo#readLength)
  def self.read_length
    return RDF::URI.new('http://www.biointerchange.org/gfvo#readLength')
  end

  # Undocumented in GVF specification.
  # (http://www.biointerchange.org/gfvo#readPairSpan)
  def self.read_pair_span
    return RDF::URI.new('http://www.biointerchange.org/gfvo#readPairSpan')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#recordDatatypeProperty)
  def self.record_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#recordDatatypeProperty')
  end

  # Amino acid in the reference genome that overlaps with a variant's genome coordinates.
  # (http://www.biointerchange.org/gfvo#referenceAminoAcid)
  def self.reference_amino_acid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#referenceAminoAcid')
  end

  # Describes the codon from the reference sequence whose coordinates overlap with this variant.
  # (http://www.biointerchange.org/gfvo#referenceCodon)
  def self.reference_codon
    return RDF::URI.new('http://www.biointerchange.org/gfvo#referenceCodon')
  end

  # Sequence from the reference genome.
  # (http://www.biointerchange.org/gfvo#referenceSequence)
  def self.reference_sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#referenceSequence')
  end

  # Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
  # (http://www.biointerchange.org/gfvo#score)
  def self.score
    return RDF::URI.new('http://www.biointerchange.org/gfvo#score')
  end

  # Properties that are directly associated with SequencedIndividual class instances.
  # (http://www.biointerchange.org/gfvo#sequencedIndividualDatatypeProperty)
  def self.sequenced_individual_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualDatatypeProperty')
  end

  # Properties that are directly associated with Set class instances.
  # (http://www.biointerchange.org/gfvo#setDatatypeProperty)
  def self.set_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty')
  end

  # A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
  # (http://www.biointerchange.org/gfvo#source)
  def self.source
    return RDF::URI.new('http://www.biointerchange.org/gfvo#source')
  end

  # Tag name of a feature attribute.
  # (http://www.biointerchange.org/gfvo#tag)
  def self.tag
    return RDF::URI.new('http://www.biointerchange.org/gfvo#tag')
  end

  # Properties that are directly associated with Target class instances.
  # (http://www.biointerchange.org/gfvo#targetDatatypeProperty)
  def self.target_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetDatatypeProperty')
  end

  # End coordinate of the target.
  # (http://www.biointerchange.org/gfvo#targetEnd)
  def self.target_end
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetEnd')
  end

  # ID or accession of the target alignment.
  # (http://www.biointerchange.org/gfvo#targetId)
  def self.target_id
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetId')
  end

  # Start coordinate of the target.
  # (http://www.biointerchange.org/gfvo#targetStart)
  def self.target_start
    return RDF::URI.new('http://www.biointerchange.org/gfvo#targetStart')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#technologicalAnnotationDatatypeProperty)
  def self.technological_annotation_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationDatatypeProperty')
  end

  # Properties that are directly associated with TechnologyPlatform class instances.
  # (http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty)
  def self.technology_platform_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty')
  end

  # Total number of reads.
  # (http://www.biointerchange.org/gfvo#totalReads)
  def self.total_reads
    return RDF::URI.new('http://www.biointerchange.org/gfvo#totalReads')
  end

  # Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
  # (http://www.biointerchange.org/gfvo#type)
  def self.type
    return RDF::URI.new('http://www.biointerchange.org/gfvo#type')
  end

  # Amino acid that overlaps with the variant.
  # (http://www.biointerchange.org/gfvo#variantAminoAcid)
  def self.variant_amino_acid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variantAminoAcid')
  end

  # Describes the codon that overlaps this variant.
  # (http://www.biointerchange.org/gfvo#variantCodon)
  def self.variant_codon
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variantCodon')
  end

  # Frequency of a variant in a population.
  # (http://www.biointerchange.org/gfvo#variantFrequency)
  def self.variant_frequency
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variantFrequency')
  end

  # Number of reads that are supporting this variant.
  # (http://www.biointerchange.org/gfvo#variantReads)
  def self.variant_reads
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variantReads')
  end

  # All sequence variations at a locus -- including the reference sequence when appropriate (for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
  # (http://www.biointerchange.org/gfvo#variantSequence)
  def self.variant_sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variantSequence')
  end

  # Properties that are directly associated with Variant class instances.
  # (http://www.biointerchange.org/gfvo#variant_datatype_property)
  def self.variant_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#variationAnnotationDatatypeProperty)
  def self.variation_annotation_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationDatatypeProperty')
  end

  # Version of the VCF specification that defines the feature set contents.
  # (http://www.biointerchange.org/gfvo#vcfVersion)
  def self.vcf_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#vcfVersion')
  end

  # Representation of attribute tag/value pairs that are not covered by specific classes such as Effect or Variant.
  # (http://www.biointerchange.org/gfvo#Attribute)
  def self.Attribute
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute')
  end

  # Describes the source or destination of a zero-length sequence alteration.
  # (http://www.biointerchange.org/gfvo#Breakpoint)
  def self.Breakpoint
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint')
  end

  # An abstract representation of a chromosome to represent ploidy.
  # (http://www.biointerchange.org/gfvo#Chromosome)
  def self.Chromosome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#CustomAnnotation)
  def self.CustomAnnotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#CustomAnnotation')
  end

  # Provides information about the source of the data. For example, it can link out to actual sequences associated with the Feature individuals in a Set.
  # (http://www.biointerchange.org/gfvo#DataSource)
  def self.DataSource
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource')
  end

  # Determines the datatype of a variant sequence.
  # (http://www.biointerchange.org/gfvo#DataType)
  def self.DataType
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DataType')
  end

  # Describing the effect of a feature variant.
  # (http://www.biointerchange.org/gfvo#Effect)
  def self.Effect
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Effect')
  end

  # A finite and complete set of values.
  # (http://www.biointerchange.org/gfvo#Enumeration)
  def self.Enumeration
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Enumeration')
  end

  # A genomic sequence feature.
  # (http://www.biointerchange.org/gfvo#Feature)
  def self.Feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Feature')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#FeatureAnnotation)
  def self.FeatureAnnotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#File)
  def self.File
    return RDF::URI.new('http://www.biointerchange.org/gfvo#File')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#GenomicEnumeration)
  def self.GenomicEnumeration
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicEnumeration')
  end

  # An enumerated class for determining the genomic source (cell type) of sequenced data.
  # (http://www.biointerchange.org/gfvo#GenomicSource)
  def self.GenomicSource
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicSource')
  end

  # A landmark that establishes the coordinate system for features.
  # (http://www.biointerchange.org/gfvo#Landmark)
  def self.Landmark
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#LocusAnnotation)
  def self.LocusAnnotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation')
  end

  # Information about the used scoring algorithm or method.
  # (http://www.biointerchange.org/gfvo#Method)
  def self.Method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Method')
  end

  # Additional information about an individual's phenotype.
  # (http://www.biointerchange.org/gfvo#PhenotypeDescription)
  def self.PhenotypeDescription
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PhenotypeDescription')
  end

  # Describe ambiguity in either start or end coordinates.
  # (http://www.biointerchange.org/gfvo#Range)
  def self.Range
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Range')
  end

  # Type of reads obtained for a given technology platform.
  # (http://www.biointerchange.org/gfvo#ReadType)
  def self.ReadType
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ReadType')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#Record)
  def self.Record
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Record')
  end

  # Aggregated sequencing information for a particular individual.
  # (http://www.biointerchange.org/gfvo#SequencedIndividual)
  def self.SequencedIndividual
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#SequencedIndividualEnumeration)
  def self.SequencedIndividualEnumeration
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividualEnumeration')
  end

  # Set of genomic sequence features, whose identifiers are unique within the set.
  # (http://www.biointerchange.org/gfvo#Set)
  def self.Set
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Set')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#SetAnnotation)
  def self.SetAnnotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SetAnnotation')
  end

  # For single individual sets, the Sex class' OWL-individuals can be used to specify the sex of the sequenced (real-life) individuals.
  # (http://www.biointerchange.org/gfvo#Sex)
  def self.Sex
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Sex')
  end

  # Class describing a genomic strand. Instances of the class (individuals) are used to denote forward-/reverse-strands, etc.
  # (http://www.biointerchange.org/gfvo#Strand)
  def self.Strand
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Strand')
  end

  # Representation of attribute tag/value pairs that are specific to particular structured attributes, but which are not covered by the GVF specification.
  # (http://www.biointerchange.org/gfvo#StructuredAttribute)
  def self.StructuredAttribute
    return RDF::URI.new('http://www.biointerchange.org/gfvo#StructuredAttribute')
  end

  # Indicates a feature's "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
  # (http://www.biointerchange.org/gfvo#Target)
  def self.Target
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Target')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#TechnologicalAnnotation)
  def self.TechnologicalAnnotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalAnnotation')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#TechnologicalEnumeration)
  def self.TechnologicalEnumeration
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalEnumeration')
  end

  # Details about the sequencing/microarray technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#TechnologyPlatform)
  def self.TechnologyPlatform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform')
  end

  # Describing specific alterations of a feature.
  # (http://www.biointerchange.org/gfvo#Variant)
  def self.Variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Variant')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#VariationAnnotation)
  def self.VariationAnnotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#VariationAnnotation')
  end

  # Denotes the zygosity of alleles.
  # (http://www.biointerchange.org/gfvo#Zygosity)
  def self.Zygosity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity')
  end

  # Denotes an array-comparative genomic hybridization.
  # (http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization)
  def self.ArrayComparativeGenomicHybridization
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization')
  end

  # Denotes a DNA microarray probe.
  # (http://www.biointerchange.org/gfvo#DNAMicroarray)
  def self.DNAMicroarray
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray')
  end

  # Denotes a DNA sequence.
  # (http://www.biointerchange.org/gfvo#DNASequence)
  def self.DNASequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence')
  end

  # Denotes that a Set contains features of a female.
  # (http://www.biointerchange.org/gfvo#Female)
  def self.Female
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Female')
  end

  # Denotes reads that are fragments.
  # (http://www.biointerchange.org/gfvo#Fragment)
  def self.Fragment
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Fragment')
  end

  # Denotes that a set contains features of germline cells.
  # (http://www.biointerchange.org/gfvo#Germline)
  def self.Germline
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Germline')
  end

  # Denotes hemizygous alleles.
  # (http://www.biointerchange.org/gfvo#Hemizygous)
  def self.Hemizygous
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Hemizygous')
  end

  # Denotes heterozygous alleles.
  # (http://www.biointerchange.org/gfvo#Heterozygous)
  def self.Heterozygous
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Heterozygous')
  end

  # Denotes homozygous alleles.
  # (http://www.biointerchange.org/gfvo#Homozygous)
  def self.Homozygous
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Homozygous')
  end

  # Denotes that a Set contains features of a male.
  # (http://www.biointerchange.org/gfvo#Male)
  def self.Male
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Male')
  end

  # Location on the negative (reverse) strand.
  # (http://www.biointerchange.org/gfvo#Negative)
  def self.Negative
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Negative')
  end

  # Strand is not applicable.
  # (http://www.biointerchange.org/gfvo#NotStranded)
  def self.NotStranded
    return RDF::URI.new('http://www.biointerchange.org/gfvo#NotStranded')
  end

  # Denotes reads that are pairs.
  # (http://www.biointerchange.org/gfvo#Pair)
  def self.Pair
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Pair')
  end

  # Location on the positive (forward) strand.
  # (http://www.biointerchange.org/gfvo#Positive)
  def self.Positive
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Positive')
  end

  # Denotes that a set contains features of prenatal cells.
  # (http://www.biointerchange.org/gfvo#Prenatal)
  def self.Prenatal
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Prenatal')
  end

  # Denotes an RNA sequence.
  # (http://www.biointerchange.org/gfvo#RNASequence)
  def self.RNASequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequence')
  end

  # Denotes that a set contains features of somatic cells.
  # (http://www.biointerchange.org/gfvo#Somatic)
  def self.Somatic
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Somatic')
  end

  # Strand was not determined, which leaves it open whether the location is on the positive (forward) or negative (reverse) strand.
  # (http://www.biointerchange.org/gfvo#UnknownStrand)
  def self.UnknownStrand
    return RDF::URI.new('http://www.biointerchange.org/gfvo#UnknownStrand')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#attributeMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#attributes') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpoint') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointLocus') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointSeqid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#chromosome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#contains') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#dataSource') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#dataType') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#datasourceObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#effect') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#endRange') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureDbxref') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureOntology') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureType') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#genomicSource') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#genotype') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#individual') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#locus') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ontologyTerm') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#parent') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescription') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescriptionObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#readType') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#recordObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#scoreMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#seqid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#setAnnotationObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sex') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sourceMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#species') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#startRange') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#strand') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#structuredAttributes') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#target') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetAttributeMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetLocus') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technicalAnnotationDbxref') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variantObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#zygosity') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#3primeContext') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#5primeContext') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#alias') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#averageCoverage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointEnd') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointStart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#build') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#comment') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#customAnnotationDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#effectDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#feature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureEnd') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureStart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#fileDate') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#fileVersion') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#gffVersion') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#gtfVersion') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#gvfVersion') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#id') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isCircular') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isPhased') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isPhasedVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkEnd') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkId') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkStart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#name') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#note') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#phase') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#platformClass') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#platformName') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#rangeDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#rangeEnd') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#rangeStart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#readLength') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#readPairSpan') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#recordDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#referenceAminoAcid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#referenceCodon') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#referenceSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#score') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#source') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#tag') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetEnd') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetId') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#targetStart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#totalReads') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#type') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variantAminoAcid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variantCodon') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variantFrequency') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variantReads') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variantSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#vcfVersion') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a class.
  #
  # +uri+:: URI that is tested for being a class
  def self.is_class?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#CustomAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DataType') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Effect') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Enumeration') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#File') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicEnumeration') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicSource') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Method') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PhenotypeDescription') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Range') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ReadType') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Record') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividualEnumeration') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Set') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SetAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Strand') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#StructuredAttribute') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Target') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalEnumeration') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Variant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#VariationAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a named individual.
  #
  # +uri+:: URI that is tested for being a named individual
  def self.is_named_individual?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Female') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Fragment') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Germline') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Hemizygous') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Heterozygous') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Homozygous') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Male') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Negative') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#NotStranded') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Pair') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Positive') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Prenatal') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Somatic') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#UnknownStrand') then
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
  @@parent_properties = { RDF::URI.new('http://www.biointerchange.org/gfvo#attributeMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#attributes') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpoint') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointLocus') => RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointSeqid') => RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#chromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#contains') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#dataSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#dataType') => RDF::URI.new('http://www.biointerchange.org/gfvo#datasourceObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#datasourceObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#effect') => RDF::URI.new('http://www.biointerchange.org/gfvo#variantObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#endRange') => RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#recordObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureDbxref') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#recordObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureOntology') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureType') => RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#genomicSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#genotype') => RDF::URI.new('http://www.biointerchange.org/gfvo#variantObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#individual') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#locus') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#ontologyTerm') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#parent') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescription') => RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescriptionObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescriptionObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#setAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#readType') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#scoreMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#seqid') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#setAnnotationObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sex') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sourceMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#species') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#startRange') => RDF::URI.new('http://www.biointerchange.org/gfvo#effectObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#strand') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#structuredAttributes') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#target') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetAttributeMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#targetProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetLocus') => RDF::URI.new('http://www.biointerchange.org/gfvo#targetProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technicalAnnotationDbxref') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#variant') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#variantObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationObjectProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#zygosity') => RDF::URI.new('http://www.biointerchange.org/gfvo#variantObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#3primeContext') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#5primeContext') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#alias') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#averageCoverage') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointEnd') => RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointStart') => RDF::URI.new('http://www.biointerchange.org/gfvo#breakpointDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#build') => RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#comment') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#customAnnotationDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#effectDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#feature') => RDF::URI.new('http://www.biointerchange.org/gfvo#effectDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#recordDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#recordDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureEnd') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureStart') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#fileDate') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#fileVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#gffVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#gtfVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#gvfVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#id') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#isCircular') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#isPhased') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#isPhasedVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') , RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkEnd') => RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkId') => RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkStart') => RDF::URI.new('http://www.biointerchange.org/gfvo#landmarkDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#name') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#note') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#phase') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#platformClass') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#platformName') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#rangeDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#rangeEnd') => RDF::URI.new('http://www.biointerchange.org/gfvo#rangeDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#rangeStart') => RDF::URI.new('http://www.biointerchange.org/gfvo#rangeDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#readLength') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#readPairSpan') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#referenceAminoAcid') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#referenceCodon') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#referenceSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#score') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') => RDF::URI.new('http://www.w3.org/2002/07/owl#topDataProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#source') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#tag') => RDF::URI.new('http://www.biointerchange.org/gfvo#customAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#locusAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetEnd') => RDF::URI.new('http://www.biointerchange.org/gfvo#targetDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetId') => RDF::URI.new('http://www.biointerchange.org/gfvo#targetDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetStart') => RDF::URI.new('http://www.biointerchange.org/gfvo#targetDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatformDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#technologicalAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#totalReads') => RDF::URI.new('http://www.biointerchange.org/gfvo#sequencedIndividualDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#type') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#variantAminoAcid') => RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') , RDF::URI.new('http://www.biointerchange.org/gfvo#variantCodon') => RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') , RDF::URI.new('http://www.biointerchange.org/gfvo#variantFrequency') => RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') , RDF::URI.new('http://www.biointerchange.org/gfvo#variantReads') => RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') , RDF::URI.new('http://www.biointerchange.org/gfvo#variantSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') , RDF::URI.new('http://www.biointerchange.org/gfvo#variant_datatype_property') => RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#variationAnnotationDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureAnnotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#vcfVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') => RDF::URI.new('http://www.biointerchange.org/gfvo#CustomAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint') => RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#CustomAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#DataType') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalEnumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#Effect') => RDF::URI.new('http://www.biointerchange.org/gfvo#VariationAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#Record') , RDF::URI.new('http://www.biointerchange.org/gfvo#File') => RDF::URI.new('http://www.biointerchange.org/gfvo#Set') , RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicEnumeration') => RDF::URI.new('http://www.biointerchange.org/gfvo#Enumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicEnumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark') => RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Method') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#PhenotypeDescription') => RDF::URI.new('http://www.biointerchange.org/gfvo#SetAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Range') => RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#ReadType') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalEnumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') => RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividualEnumeration') => RDF::URI.new('http://www.biointerchange.org/gfvo#Enumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#SetAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#Record') , RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividualEnumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#Strand') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicEnumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#StructuredAttribute') => RDF::URI.new('http://www.biointerchange.org/gfvo#CustomAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Target') => RDF::URI.new('http://www.biointerchange.org/gfvo#LocusAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalEnumeration') => RDF::URI.new('http://www.biointerchange.org/gfvo#Enumeration') , RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologicalAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Variant') => RDF::URI.new('http://www.biointerchange.org/gfvo#VariationAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#VariationAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#FeatureAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicEnumeration') }

end

end
