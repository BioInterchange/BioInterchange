require 'rdf'
module BioInterchange

class GFVO

  # An alignment is a sequence alignment between a "Feature" class instance and a "Target" class instance. The alignment is a list of one or more "Alignment Operation" instances that capture alignment matches, gaps and frameshifts (see "The Gap Attribute", http://sequenceontology.org/resources/gff3.html).
  # (http://www.biointerchange.org/gfvo#alignment)
  def self.alignment
    return RDF::URI.new('http://www.biointerchange.org/gfvo#alignment')
  end

  # Annotation object properties associated with instances of the class hierarchy with root class "Annotation". For properties related to the core genomic data class "Feature", see "feature datatype property" or "feature object property".
  # (http://www.biointerchange.org/gfvo#annotationObjectProperty)
  def self.annotation_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty')
  end

  # Further information about the "Method" that is related to an attribute.
  # (http://www.biointerchange.org/gfvo#attributeMethod)
  def self.attribute_method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#attributeMethod')
  end

  # Tag name/value pair attributes of a feature.
  # (http://www.biointerchange.org/gfvo#attributes)
  def self.attributes
    return RDF::URI.new('http://www.biointerchange.org/gfvo#attributes')
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

  # A database cross-reference to associate a feature or its structured pragma metadata in GVF to a representation in another database.
  # (http://www.biointerchange.org/gfvo#dbxref)
  def self.dbxref
    return RDF::URI.new('http://www.biointerchange.org/gfvo#dbxref')
  end

  # An effect of a particular feature variant.
  # (http://www.biointerchange.org/gfvo#effect)
  def self.effect
    return RDF::URI.new('http://www.biointerchange.org/gfvo#effect')
  end

  # Properties that are directly associated with "Feature" class instances. For properties related to "Reference", "Variant", or other genomic annotation classes, see "feature annotation datatype property" or "feature annotation object property".
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

  # Denotes the source of genomic data (on a cell-type level). Valid object assignments are individuals of the "Genomic Source" enumeration class.
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

  # The locus determines the genomic position of an genomic object. The FALDO "Region" class can denote genomic feature's start, stop, and strand properties, it can express fuzzy genomic ranges if exact genomic coordinates are unknown. For "Landmark" class instances, the locus provides the start and end coordinates of the landmark.
  # (http://www.biointerchange.org/gfvo#locus)
  def self.locus
    return RDF::URI.new('http://www.biointerchange.org/gfvo#locus')
  end

  # A cross-reference to an ontology term that is associated with a feature. For instances of the "Variant" class, the associated ontology term must be a Variant Ontology term (VariO; http://purl.obolibrary.org/obo/VariO_0001 or subclasses thereof).
  # (http://www.biointerchange.org/gfvo#ontologyTerm)
  def self.ontology_term
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ontologyTerm')
  end

  # Link out to a parent feature.
  # (http://www.biointerchange.org/gfvo#parent)
  def self.parent
    return RDF::URI.new('http://www.biointerchange.org/gfvo#parent')
  end

  # Further information about an individual's phenotype. Applies only to single individual sets.
  # (http://www.biointerchange.org/gfvo#phenotypeDescription)
  def self.phenotype_description
    return RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescription')
  end

  # Used scoring method, which is described in more detail by a "Method" class instance.
  # (http://www.biointerchange.org/gfvo#scoreMethod)
  def self.score_method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#scoreMethod')
  end

  # Establishes the landmark on which the feature or breakpoint is located. A landmark is typically a chromosome, scaffold or contig, but can be any other genomic object (DNA, RNA, protein) in principle.
  # (http://www.biointerchange.org/gfvo#seqid)
  def self.seqid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#seqid')
  end

  # Referene to a "Sequence Annotation" that describes either the sequence identified by a feature, or if particular sub-classes of "Sequence Annotation" are used, it describes a reference sequence, variant or anchestral allele (see "Reference", "Variant", "Ancestral Allele").
  # (http://www.biointerchange.org/gfvo#sequenceAnnotation)
  def self.sequence_annotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceAnnotation')
  end

  # Effect of a sequence alteration on a sequence feature.
  # (http://www.biointerchange.org/gfvo#sequenceVariant)
  def self.sequence_variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceVariant')
  end

  # A property that is directly associated with the "Set" class. Immediate sub-properties of this property are independent to specific specifications such as GFF3, GTF, GVF or VCF. Not all sub-properties can be preserved when carrying out operations between multiple "Set" class instances. For example, the "sex" property applies to single individual sets and can only be kept in a set union between multiple "Set" class instances if all involved instances agree on this property. For genomic feature and variant related properties, see "record object property" and "record datatype property".
  # (http://www.biointerchange.org/gfvo#setObjectProperty)
  def self.set_object_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty')
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

  # Technology platform that was used to derive the feature.
  # (http://www.biointerchange.org/gfvo#technologyPlatform)
  def self.technology_platform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatform')
  end

  # Type of the feature, which is a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
  # (http://www.biointerchange.org/gfvo#type)
  def self.type
    return RDF::URI.new('http://www.biointerchange.org/gfvo#type')
  end

  # Sequence context of a feature on the positive strand (forward strand) on the 3' end. A valid sequence context is denoted by a string of one or more concatenated letters A, C, G, or T.
  # (http://www.biointerchange.org/gfvo#3primeContext)
  def self.a_context
    return RDF::URI.new('http://www.biointerchange.org/gfvo#3primeContext')
  end

  # Secondary name of a feature besides the primary feature ID. The secondary name can be a HGVS/ISCN nomenclature name, but not a cross-reference to a database (e.g. dbSNP, OMIM). Cross-references should be made using the "dbxref" property.
  # (http://www.biointerchange.org/gfvo#alias)
  def self.alias
    return RDF::URI.new('http://www.biointerchange.org/gfvo#alias')
  end

  # Amino acid in the reference genome that overlaps with a variant's genome coordinates.
  # (http://www.biointerchange.org/gfvo#aminoAcid)
  def self.amino_acid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#aminoAcid')
  end

  # Annotation datatype properties associated with instances of the class hierarchy with root class "Annotation". For properties related to the core genomic data class "Feature", see "feature datatype property" or "feature object property".
  # (http://www.biointerchange.org/gfvo#annotationDatatypeProperty)
  def self.annotation_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty')
  end

  # Undocumented in GVF specification. Even though the property's semantics are undocumented, it is still included in the ontology in order to reflect the data values that might be encoded in GVF files.
  # (http://www.biointerchange.org/gfvo#averageCoverage)
  def self.average_coverage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#averageCoverage')
  end

  # Name of a genome assembly build that denotes the provenance of genomic features and variants in a "Set". For example, 'GRCh37', 'NCBI 36', 'FlyBase r4.1', or 'hg19'. If possible, the patch level of the assembly build should be included, such as 'GRCh37.p7'.
  # (http://www.biointerchange.org/gfvo#build)
  def self.build
    return RDF::URI.new('http://www.biointerchange.org/gfvo#build')
  end

  # Describes the codon from the reference sequence whose coordinates overlap with this variant. A valid codon description is a string of three -- or multiples thereof -- concatenated letters A, C, G, or T.
  # (http://www.biointerchange.org/gfvo#codon)
  def self.codon
    return RDF::URI.new('http://www.biointerchange.org/gfvo#codon')
  end

  # Comments should be made using "http://www.w3.org/2000/01/rdf-schema#comment".This datatype property only exists to redirect the focus to RDF Schema for commenting, since it might be expected that comments are modeled similar to other datatype properties involving "Data Source", "Method", "Phenotype Description" or "Technology Platform".
  # (http://www.biointerchange.org/gfvo#comment)
  def self.comment
    return RDF::URI.new('http://www.biointerchange.org/gfvo#comment')
  end

  # Features that are affected by this sequence alteration effect. This can be an external feature identifier, such as an Ensembl gene/transcript identifier.
  # (http://www.biointerchange.org/gfvo#feature)
  def self.feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#feature')
  end

  # Property that is directly associated with a "Feature" class instance. For properties related to "Reference", "Variant", or other genomic annotation classes, see "feature annotation datatype property" or "feature annotation object property".
  # (http://www.biointerchange.org/gfvo#featureDatatypeProperty)
  def self.feature_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty')
  end

  # Datatype properties related to "File" class instances. Subclasses of this property are used for denoting data that is specific to files only and which is only preserved as a means to encode for all data items defined by the GFF3, GTF, GVF and VCF specifications. These properties cannot be carried over into the result of set operations (s.a. union) between "File"/"Set" class instances. Keeping these properties in the result set between set operations may result in wrong annotations or contradictions (e.g., mutliple assignment of different versions or dates).
  # (http://www.biointerchange.org/gfvo#fileDatatypeProperty)
  def self.file_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty')
  end

  # Creation date of the data file whose genomic data is captured by the associated "File" instance.
  # (http://www.biointerchange.org/gfvo#fileDate)
  def self.file_date
    return RDF::URI.new('http://www.biointerchange.org/gfvo#fileDate')
  end

  # Proprietary version of the file or its contents whose genomic data is associated with a "File" instance.
  # (http://www.biointerchange.org/gfvo#fileVersion)
  def self.file_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#fileVersion')
  end

  # Frequency of a variant in a population. The population is determined by the "Set" in which the "Variant" resides.
  # (http://www.biointerchange.org/gfvo#frequency)
  def self.frequency
    return RDF::URI.new('http://www.biointerchange.org/gfvo#frequency')
  end

  # Version of the GFF3 specification that defines the contents captured by the "File" class instance. The version number should be greater or equal than 3.0, but less than 4.0. For GFF2/GTF version number assignment, see the "gtf version" datatype property.
  # (http://www.biointerchange.org/gfvo#gffVersion)
  def self.gff_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#gffVersion')
  end

  # Version of the GTF specification that defines the contents captured by the "File" class instance. The version number should be greater or equal than 2.0, but less than 3.0. This number derives from the fact that GTF files are equivalent to GFF2 files. GTF/GFF2 files are incompatible with the GFF3 specification. For GFF3 version number assignment, see the "gff version" datatype property.
  # (http://www.biointerchange.org/gfvo#gtfVersion)
  def self.gtf_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#gtfVersion')
  end

  # Version of the GVF specification that defines the contents captured by the "File" class instance. The version number should be greater or equal than 1.0, but less than 2.0. GVF files usually make a statement about their underlying GFF3 specification that they rely on too, which should be encoded using the "gff version" datatype property.
  # (http://www.biointerchange.org/gfvo#gvfVersion)
  def self.gvf_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#gvfVersion')
  end

  # A unique identifier for the feature within the feature set (a "Set"/"File" class instance). The unique identifier is important when dealing with GFF3, GTF, GVF or VCF files as a stand in object that makes the aggregation and separation of genomic feature and variant information possible. In RDF, the URI of subject should be used primarily, provided that its URI can be considered stable.
  # (http://www.biointerchange.org/gfvo#id)
  def self.id
    return RDF::URI.new('http://www.biointerchange.org/gfvo#id')
  end

  # Truth value describing whether the feature is circular or not. This can be used to describe, for example, circular DNA as being found in bacteria or viruses. It can also be applied to mitochondrial DNA or plastid DNA, where applicable.
  # (http://www.biointerchange.org/gfvo#isCircular)
  def self.is_circular
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isCircular')
  end

  # Indicates whether this particular feature is phased. Used to encode "##phased-genotypes" statements in GFF3, but can be appropriated freely. It is also a property of GVF variants, even though the GVF specification is unclear on its exact usage details.
  # (http://www.biointerchange.org/gfvo#isPhased)
  def self.is_phased
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isPhased')
  end

  # Name of a feature, which can be used for display purposes. The name is not a unique property among features in a "Set".
  # (http://www.biointerchange.org/gfvo#name)
  def self.name
    return RDF::URI.new('http://www.biointerchange.org/gfvo#name')
  end

  # Free text notes should be made using "http://www.w3.org/2000/01/rdf-schema#comment".This datatype property only exists to redirect the focus to RDF Schema for annotating features with notes, since it might be expected that a note is similarly modeled to other datatype properties of the "Feature" class.
  # (http://www.biointerchange.org/gfvo#note)
  def self.note
    return RDF::URI.new('http://www.biointerchange.org/gfvo#note')
  end

  # Phase of the feature, if it is a CDS. Called "frame" in GTF. A feature's phase can be either 0, 1, or 2.
  # (http://www.biointerchange.org/gfvo#phase)
  def self.phase
    return RDF::URI.new('http://www.biointerchange.org/gfvo#phase')
  end

  # A phred-scaled quality score for the reference seuence; -10log_10 prob(no variant). A phred-scaled quality score for a variant sequence; -10log_10 prob(variant call is wrong). High scores indicate high confidence calls. This is a property associated with VCF data. E-values and P-values of features should be expressed using the "score" datatype property.
  # (http://www.biointerchange.org/gfvo#phredScore)
  def self.phred_score
    return RDF::URI.new('http://www.biointerchange.org/gfvo#phredScore')
  end

  # Type of technology used to gather the variant data. The GVF specification's list of available classes is naturally incomplete. The range of this property is therefore unrestricted due to its open specification.
  # (http://www.biointerchange.org/gfvo#platformClass)
  def self.platform_class
    return RDF::URI.new('http://www.biointerchange.org/gfvo#platformClass')
  end

  # Sequencer or other machine used to collect the variant data. The GVF specification's list of available platforms is naturally incomplete. The range of this property is therefore unrestricted due to its open specification.
  # (http://www.biointerchange.org/gfvo#platformName)
  def self.platform_name
    return RDF::URI.new('http://www.biointerchange.org/gfvo#platformName')
  end

  # Undocumented in GVF specification. Even though the property's semantics are undocumented, it is still included in the ontology in order to reflect the data values that might be encoded in GVF files.
  # (http://www.biointerchange.org/gfvo#readIPairSpan)
  def self.read_pair_span
    return RDF::URI.new('http://www.biointerchange.org/gfvo#readIPairSpan')
  end

  # Undocumented in GVF specification. Even though the property's semantics are undocumented, it is still included in the ontology in order to reflect the data values that might be encoded in GVF files.
  # (http://www.biointerchange.org/gfvo#readLength)
  def self.read_length
    return RDF::URI.new('http://www.biointerchange.org/gfvo#readLength')
  end

  # Number of reads that are supporting a variant. Valid values are integers greater or equal than zero.
  # (http://www.biointerchange.org/gfvo#reads)
  def self.reads
    return RDF::URI.new('http://www.biointerchange.org/gfvo#reads')
  end

  # Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features. Phred scores that are associated with reference- or variant-sequences should be encoded using the "phred score" datatype property.
  # (http://www.biointerchange.org/gfvo#score)
  def self.score
    return RDF::URI.new('http://www.biointerchange.org/gfvo#score')
  end

  # All sequence variations at a locus -- including the reference sequence when appropriate (for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
  # (http://www.biointerchange.org/gfvo#sequence)
  def self.sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#sequence')
  end

  # A property that is directly associated with the "Set" class. Immediate sub-properties of this property are independent to specific specifications such as GFF3, GTF, GVF or VCF. Not all sub-properties can be preserved when carrying out operations between multiple "Set" class instances. For example, the "build" property can only be kept in a set union between multiple "Set" class instances if all involved instances agree on this property. For genomic feature and variant related properties, see "record object property" and "record datatype property".
  # (http://www.biointerchange.org/gfvo#setDatatypeProperty)
  def self.set_datatype_property
    return RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty')
  end

  # A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
  # (http://www.biointerchange.org/gfvo#source)
  def self.source
    return RDF::URI.new('http://www.biointerchange.org/gfvo#source')
  end

  # A span denotes the number of continuous nucleotides or amino acids an "Alignment Operation" is annotating. A span can be of length zero or greater.
  # (http://www.biointerchange.org/gfvo#span)
  def self.span
    return RDF::URI.new('http://www.biointerchange.org/gfvo#span')
  end

  # Tag name of a feature attribute. "Attribute" and "Structured Attribute" instances are key/value(s) pairs, The key in that assignment is referred to as the "tag". Custom annotations, i.e. attributes that are not defined by the file format specifications, should use lowercase tags. Future extensions of the specifications might introduce new attributes though, which can be encoded using custom annotations by RDFization tools. The tag should therefore not be treated as strictly lowercase when dealing with custom annotations.
  # (http://www.biointerchange.org/gfvo#tag)
  def self.tag
    return RDF::URI.new('http://www.biointerchange.org/gfvo#tag')
  end

  # Total number of reads for a "Sequenced Individual". When merging "Set"/"File" class instances, it should be noted whether the total number of reads needs to be updated based on the identity of sequenced individuals in the involved sets.
  # (http://www.biointerchange.org/gfvo#totalReads)
  def self.total_reads
    return RDF::URI.new('http://www.biointerchange.org/gfvo#totalReads')
  end

  # Version of the VCF specification that defines the contents captured by the "File" class instance. The version number should be greater or equal than 4.0, but less than 5.0.
  # (http://www.biointerchange.org/gfvo#vcfVersion)
  def self.vcf_version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#vcfVersion')
  end

  # An alignment operation captures the type of alignment (see "Alignment" enumeration class) and alignment length between a reference sequence and target sequence. This relationship is typically expressed between a "Feature" class instance and a "Target" class instance. Note that an "Alignment Operation" is a list, where the order of the alignment operations is of significance.
  # (http://www.biointerchange.org/gfvo#AlignmentOperation)
  def self.Alignment_Operation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation')
  end

  # Denotes an ancestral allele of a feature. Reference sequences and genomic variants are expressed by the "Reference" and "Variant" classes respectively.
  # (http://www.biointerchange.org/gfvo#AncestralAllele)
  def self.Ancestral_Allele
    return RDF::URI.new('http://www.biointerchange.org/gfvo#AncestralAllele')
  end

  # A feature annotation is a class whose instances are used as composites in conjunction with "Feature" class instances. The "Feature Annotation" class is typically not used as type annotation. It rather denotes that its subclasses are to be used for extending genomic features with additional information.
  # (http://www.biointerchange.org/gfvo#Annotation)
  def self.Annotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation')
  end

  # A "Data Source" based on array-comparative genomic hybridization.
  # (http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization)
  def self.Array_Comparative_Genomic_Hybridization
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization')
  end

  # An attribute represents a tag/value pair that is not covered by either GFF3, GTF, GVF or VCF specification. For example, lowercase tags in GFF3 are permitted to allow data providers to provide additional information about a genomic feature, variant, or its meta-data. Tag/value pair attributes that are within the aforementioned specifications are expressed using classes such as "Variant", "Breakpoint" or "Technology Platform". Attributes whose value is a composite type are expressed by the specialization "Structured Attribute",
  # (http://www.biointerchange.org/gfvo#Attribute)
  def self.Attribute
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute')
  end

  # A breakpoint describes the source or destination of a zero-length sequence alteration. These alterations are typically insertions, deletions or translocations according to the GVF specification (see "Breakpoint_detail" in http://sequenceontology.org/resources/gvf.html).
  # (http://www.biointerchange.org/gfvo#Breakpoint)
  def self.Breakpoint
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint')
  end

  # A chromosome is an abstract representation of an unnamed chromosome to represent ploidy within a data set. A "Chromosome" instance is used for for denoting the locus of phased genotypes. For placing genomic features ("Feature" class instances) on a chromosome, contig, scaffold, etc., please see the "Landmark" class.
  # (http://www.biointerchange.org/gfvo#Chromosome)
  def self.Chromosome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome')
  end

  # A "Data Source" based on DNA microarray probes.
  # (http://www.biointerchange.org/gfvo#DNAMicroarray)
  def self.DNA_Microarray
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray')
  end

  # A "Data Source" based on DNA sequences.
  # (http://www.biointerchange.org/gfvo#DNASequence)
  def self.DNA_Sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence')
  end

  # Provides information about the source of the data. For example, it can link out to actual sequences associated with "Feature" individuals in a "Set".
  # (http://www.biointerchange.org/gfvo#DataSource)
  def self.Data_Source
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource')
  end

  # Describing the effect of a feature "Variant" class instance.
  # (http://www.biointerchange.org/gfvo#Effect)
  def self.Effect
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Effect')
  end

  # The feature class captures information about genomic sequence features. A genomic feature can be a large object, such as a chromosome or contig, down to single base-pair reference or variant alleles. A feature class instance is a composite of further information that is encoded using "Attribute", "Reference", "Variation" and other sub-classes of "Feature Annotation".
  # (http://www.biointerchange.org/gfvo#Feature)
  def self.Feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Feature')
  end

  # A file represents the contents of a GFF3, GTF, GVF or VCF file. It can capture genomic meta-data that is specific to any of these file formats. The result of unions, intersections or other operations between "File" class instances should be capture with the generic "Set" class, which is format independent.
  # (http://www.biointerchange.org/gfvo#File)
  def self.File
    return RDF::URI.new('http://www.biointerchange.org/gfvo#File')
  end

  # Denotes a frameshift forward in the reference sequence. The reference sequence is denoted by a "Landmark" whilst the aligned target sequence is an instance of the "Target" class.
  # (http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift)
  def self.Forward_Reference_Sequence_Frameshift
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift')
  end

  # Details about the fragment-read sequencing technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#FragmentReadPlatform)
  def self.Fragment_Read_Platform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#FragmentReadPlatform')
  end

  # The germline feature class captures information about genomic sequence features arising from germline cells.
  # (http://www.biointerchange.org/gfvo#GermlineFeature)
  def self.Germline_Feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GermlineFeature')
  end

  # A sequence alteration with hemizygous alleles.
  # (http://www.biointerchange.org/gfvo#HemizygousVariant)
  def self.Hemizygous_Variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#HemizygousVariant')
  end

  # A sequence alteration with heterozygous alleles.
  # (http://www.biointerchange.org/gfvo#HeterozygousVariant)
  def self.Heterozygous_Variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#HeterozygousVariant')
  end

  # A sequence alteration with homozygous alleles.
  # (http://www.biointerchange.org/gfvo#HomozygousVariant)
  def self.Homozygous_Variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#HomozygousVariant')
  end

  # A landmark establishes a coordinate system for features. Landmarks can be chromosomes, contigs, scaffolds or other constructs that can harbor "Feature" class instances. For expressing ploidy within a data set, please refer to the "Chromosome" class.
  # (http://www.biointerchange.org/gfvo#Landmark)
  def self.Landmark
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark')
  end

  # Denotes a match between the reference sequence and target sequence. The reference sequence is denoted by a "Landmark" whilst the aligned target sequence is an instance of the "Target" class.
  # (http://www.biointerchange.org/gfvo#Match)
  def self.Match
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Match')
  end

  # A chromosome is an abstract representation of an unnamed chromosome to represent ploidy within a data set. A "Paternal Chromosome" instance is used for denoting the locus of phased genotypes on a chromosome inherited from the mother. For placing genomic features ("Feature" class instances) on a chromosome, contig, scaffold, etc., please see the "Landmark" class.
  # (http://www.biointerchange.org/gfvo#MaternalChromosome)
  def self.Maternal_Chromosome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#MaternalChromosome')
  end

  # Information about the used scoring algorithm or method.
  # (http://www.biointerchange.org/gfvo#Method)
  def self.Method
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Method')
  end

  # Details about the paired-read sequencing technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#PairedReadPlatform)
  def self.Paired_Read_Platform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PairedReadPlatform')
  end

  # A chromosome is an abstract representation of an unnamed chromosome to represent ploidy within a data set. A "Paternal Chromosome" instance is used for denoting the locus of phased genotypes on a chromosome inherited from the father. For placing genomic features ("Feature" class instances) on a chromosome, contig, scaffold, etc., please see the "Landmark" class.
  # (http://www.biointerchange.org/gfvo#PaternalChromosome)
  def self.Paternal_Chromosome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PaternalChromosome')
  end

  # A phenotype description represents additional information about a sequenced individual's phenotype. A sequenced individual is represented by instances of the "Sequenced Individual" or its decendants (e.g., "Sequenced Female").
  # (http://www.biointerchange.org/gfvo#PhenotypeDescription)
  def self.Phenotype_Description
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PhenotypeDescription')
  end

  # A prenatal feature is purportedly associated with prenatal cells; the GVF specification declares this feature type under the prama directive "##genomic-source", but does not describe its semantics and the referenced Logical Observation Identifiers Names and Codes (LOINC, http://loinc.org), do not define the meaning or intended usage of the term "prenatal" either.
  # (http://www.biointerchange.org/gfvo#PrenatalFeature)
  def self.Prenatal_Feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PrenatalFeature')
  end

  # A "Data Source" based on RNA sequences.
  # (http://www.biointerchange.org/gfvo#RNASequence)
  def self.RNA_Sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequence')
  end

  # Denotes the reference sequence of a feature. The reference sequence is of importance when dealing with genomic variation data, which is expressed by the "Variant" class.
  # (http://www.biointerchange.org/gfvo#Reference)
  def self.Reference
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Reference')
  end

  # Denotes a gap in the reference sequence for an alignment. The reference sequence is denoted by a "Landmark" whilst the aligned target sequence is an instance of the "Target" class.
  # (http://www.biointerchange.org/gfvo#ReferenceSequenceGap)
  def self.Reference_Sequence_Gap
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequenceGap')
  end

  # Denotes a frameshift backwards (reverse) in the reference sequence. The reference sequence is denoted by a "Landmark" whilst the aligned target sequence is an instance of the "Target" class.
  # (http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift)
  def self.Reverse_Reference_Sequence_Frameshift
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift')
  end

  # A sequence annotation provides information on sequences associated with a "Feature" class instance or its descendants (s.a. "Germline Feature" or "Somatic Feature"). Specialized sub-classes are provided to denote reference sequences represented by "Reference" class instances, variants represented by "Variant" class instances, and "Ancestral Allele" class instances.
  # (http://www.biointerchange.org/gfvo#SequenceAnnotation)
  def self.Sequence_Annotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation')
  end

  # Aggregated sequencing information for a particular female individual. A female is defined as an individual producing ova.
  # (http://www.biointerchange.org/gfvo#SequencedFemale)
  def self.Sequenced_Female
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedFemale')
  end

  # Aggregated sequencing information for a particular individual that contains both male and female gemetes.
  # (http://www.biointerchange.org/gfvo#SequencedHermaphrodite)
  def self.Sequenced_Hermaphrodite
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedHermaphrodite')
  end

  # Aggregated sequencing information for a particular individual. Unless a sub-type of this class is used as instance type, s.a. "Sequenced Female", the sex of the individual is considered to be undetermined.
  # (http://www.biointerchange.org/gfvo#SequencedIndividual)
  def self.Sequenced_Individual
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual')
  end

  # Aggregated sequencing information for a particular male individual. A male is defined as an individual producing spermatozoa.
  # (http://www.biointerchange.org/gfvo#SequencedMale)
  def self.Sequenced_Male
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedMale')
  end

  # A set is a container for genomic sequence features and related information that is independent of data provenance. A set may contain information about any genomic features including -- but not limited to -- contents of GFF3, GTF, GVF and VCF files. The latter are better represented by "File" class instances, whereas the result of unions or intersections between different "File" class instances should be captured within this format-independent "Set" class.
  # (http://www.biointerchange.org/gfvo#Set)
  def self.Set
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Set')
  end

  # The somatic feature class captures information about genomic sequence features arising from somatic cells.
  # (http://www.biointerchange.org/gfvo#SomaticFeature)
  def self.Somatic_Feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SomaticFeature')
  end

  # A structured attribute denotes a tag/value pair where the value is a composite, but which is not defined in the GVF specification. The GVF specification does not explicitly permit user-defined structured attributes (see "Structured Pragmas" in http://sequenceontology.org/resources/gvf.html), but it is conceivable that an RDFization tool might support this use case. For some loosly defined structured data in GVF, the "Structured Attribute" class is used as well to capture the non-exhaustive list of possible data assignments of the GVF specification.
  # (http://www.biointerchange.org/gfvo#StructuredAttribute)
  def self.Structured_Attribute
    return RDF::URI.new('http://www.biointerchange.org/gfvo#StructuredAttribute')
  end

  # A target expresses the relationship between a "Feature" instance and an alignment. In GFF3, the alignment can be a nucleotide-to-nucleotide or protein-to-nucleotide (see "The Gap Attribute", http://sequenceontology.org/resources/gff3.html), but this restriction is not enforced here. Note that the object property "alignment" links out to a list of "Alignment Operation" class instances, where only the first operation in that list is referenced via the "alignment" property. The remainder of operations can be accessed by stepping through the list.
  # (http://www.biointerchange.org/gfvo#Target)
  def self.Target
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Target')
  end

  # Denotes a gap in the target sequence for an alignment. The reference sequence is denoted by a "Landmark" whilst the aligned target sequence is an instance of the "Target" class.
  # (http://www.biointerchange.org/gfvo#TargetSequenceGap)
  def self.Target_Sequence_Gap
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TargetSequenceGap')
  end

  # Details about the sequencing/microarray technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#TechnologyPlatform)
  def self.Technology_Platform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform')
  end

  # Describing specific sequence alterations of a genomic feature. A variant is related to "Reference" class instances, which denote the sequence that serves as a basis for sequence alteration comparisons.
  # (http://www.biointerchange.org/gfvo#Variant)
  def self.Variant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Variant')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#alignment') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#attributeMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#attributes') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#dbxref') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#effect') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ontologyTerm') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#parent') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescription') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#scoreMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#seqid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sourceMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#species') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#type') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#aminoAcid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#averageCoverage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#build') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#codon') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#comment') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#feature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#frequency') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#name') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#note') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#phase') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#phredScore') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#platformClass') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#platformName') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#readIPairSpan') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#readLength') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#reads') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#score') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#sequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#source') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#span') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#tag') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#totalReads') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#AncestralAllele') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Effect') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#File') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#FragmentReadPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GermlineFeature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#HemizygousVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#HeterozygousVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#HomozygousVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Match') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#MaternalChromosome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Method') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PairedReadPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PaternalChromosome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PhenotypeDescription') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PrenatalFeature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Reference') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequenceGap') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedFemale') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedHermaphrodite') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedMale') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Set') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SomaticFeature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#StructuredAttribute') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Target') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TargetSequenceGap') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Variant') then
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
  @@parent_properties = { RDF::URI.new('http://www.biointerchange.org/gfvo#alignment') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') => RDF::URI.new('http://www.w3.org/2002/07/owl#topObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#attributeMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#attributes') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#chromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#contains') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#dataSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#dbxref') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#effect') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') => RDF::URI.new('http://www.w3.org/2002/07/owl#topObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureOntology') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureType') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#genomicSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#genotype') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#individual') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#locus') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#ontologyTerm') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#parent') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#phenotypeDescription') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#scoreMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#seqid') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sequenceVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sourceMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#species') => RDF::URI.new('http://www.biointerchange.org/gfvo#setObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#structuredAttributes') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#target') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#targetAttributeMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#technologyPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#type') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureObjectProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#3primeContext') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#5primeContext') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#alias') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#aminoAcid') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') => RDF::URI.new('http://www.w3.org/2002/07/owl#topDataProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#averageCoverage') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#build') => RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#codon') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#comment') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#feature') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') => RDF::URI.new('http://www.w3.org/2002/07/owl#topDataProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') => RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#fileDate') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#fileVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#frequency') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#gffVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#gtfVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#gvfVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#id') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#isCircular') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#isPhased') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#name') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#note') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#phase') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#phredScore') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#platformClass') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#platformName') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#readIPairSpan') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#readLength') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#reads') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#score') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#sequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#setDatatypeProperty') => RDF::URI.new('http://www.w3.org/2002/07/owl#topDataProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#source') => RDF::URI.new('http://www.biointerchange.org/gfvo#featureDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#span') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#tag') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#totalReads') => RDF::URI.new('http://www.biointerchange.org/gfvo#annotationDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#vcfVersion') => RDF::URI.new('http://www.biointerchange.org/gfvo#fileDatatypeProperty') , RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') => RDF::URI.new('http://www.w3.org/1999/02/22-rdf-syntax-ns#List') , RDF::URI.new('http://www.biointerchange.org/gfvo#AncestralAllele') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization') => RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') , RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray') => RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') , RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') , RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Effect') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#File') => RDF::URI.new('http://www.biointerchange.org/gfvo#Set') , RDF::URI.new('http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift') => RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#FragmentReadPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform') , RDF::URI.new('http://www.biointerchange.org/gfvo#GermlineFeature') => RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') , RDF::URI.new('http://www.biointerchange.org/gfvo#HemizygousVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#Variant') , RDF::URI.new('http://www.biointerchange.org/gfvo#HeterozygousVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#Variant') , RDF::URI.new('http://www.biointerchange.org/gfvo#HomozygousVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#Variant') , RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Match') => RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#MaternalChromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') , RDF::URI.new('http://www.biointerchange.org/gfvo#Method') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#PairedReadPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform') , RDF::URI.new('http://www.biointerchange.org/gfvo#PaternalChromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') , RDF::URI.new('http://www.biointerchange.org/gfvo#PhenotypeDescription') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#PrenatalFeature') => RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') , RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#DataSource') , RDF::URI.new('http://www.biointerchange.org/gfvo#Reference') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequenceGap') => RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift') => RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedFemale') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedHermaphrodite') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedMale') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') , RDF::URI.new('http://www.biointerchange.org/gfvo#SomaticFeature') => RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') , RDF::URI.new('http://www.biointerchange.org/gfvo#StructuredAttribute') => RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#TargetSequenceGap') => RDF::URI.new('http://www.biointerchange.org/gfvo#AlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#TechnologyPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#Annotation') }

end

end
