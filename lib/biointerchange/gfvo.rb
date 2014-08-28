require 'rdf'
module BioInterchange

class GFVO

  # Links to an entity for which supportive information is being provided.
  # (http://www.biointerchange.org/gfvo#describes)
  def self.describes
    return RDF::URI.new('http://www.biointerchange.org/gfvo#describes')
  end

  # Links to additional annotations about an entity.
  # (http://www.biointerchange.org/gfvo#hasAnnotation)
  def self.has_annotation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasAnnotation')
  end

  # Links out to aggregate information for an entity.
  # (http://www.biointerchange.org/gfvo#hasAttribute)
  def self.has_attribute
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute')
  end

  # References an entity or resource that provides supporting/refuting evidence.
  # (http://www.biointerchange.org/gfvo#hasEvidence)
  def self.has_evidence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasEvidence')
  end

  # Denotes the first entity of an ordered part relationship.
  # (http://www.biointerchange.org/gfvo#hasFirstPart)
  def self.has_first_part
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasFirstPart')
  end

  # Links out to an identifier.
  # (http://www.biointerchange.org/gfvo#hasIdentifier)
  def self.has_identifier
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasIdentifier')
  end

  # Links out to an entity that is the input of a "Process" subclass.
  # (http://www.biointerchange.org/gfvo#hasInput)
  def self.has_input
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasInput')
  end

  # Denotes the last entity of an ordered part relationship.
  # (http://www.biointerchange.org/gfvo#hasLastPart)
  def self.has_last_part
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasLastPart')
  end

  # Denotes membership for "Collection", "Catalog" and "File" instances.
  # (http://www.biointerchange.org/gfvo#hasMember)
  def self.has_member
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasMember')
  end

  # Denotes a compositional relationship to other entities, where the ordering of the composition of entities carries meaning.
  # (http://www.biointerchange.org/gfvo#hasOrderedPart)
  def self.has_ordered_part
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasOrderedPart')
  end

  # Links out to an entity that is the output of a "Process" subclass.
  # (http://www.biointerchange.org/gfvo#hasOutput)
  def self.has_output
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasOutput')
  end

  # Denotes a compositional relationship to other entities.
  # (http://www.biointerchange.org/gfvo#hasPart)
  def self.has_part
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasPart')
  end

  # Denotes the participation of other entities in processes.
  # (http://www.biointerchange.org/gfvo#hasParticipant)
  def self.has_participant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasParticipant')
  end

  # Links out to an entity that provides qualitative information.
  # (http://www.biointerchange.org/gfvo#hasQuality)
  def self.has_quality
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasQuality')
  end

  # Denotes information origin.
  # (http://www.biointerchange.org/gfvo#hasSource)
  def self.has_source
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasSource')
  end

  # References an entity about which information is provided for.
  # (http://www.biointerchange.org/gfvo#isAbout)
  def self.is_about
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isAbout')
  end

  # Denotes that an entity is affected by another entity.
  # (http://www.biointerchange.org/gfvo#isAffectedBy)
  def self.is_affected_by
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isAffectedBy')
  end

  # Denotes the trailing occurrence or succession of the subject in regards to the object.
  # (http://www.biointerchange.org/gfvo#isAfter)
  def self.is_after
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isAfter')
  end

  # Denotes that an entity is an attribute of the entity that this property links out to.
  # (http://www.biointerchange.org/gfvo#isAttributeOf)
  def self.is_attribute_of
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isAttributeOf')
  end

  # Denotes the leading occurrence or precedence of the subject in regards to the object.
  # (http://www.biointerchange.org/gfvo#isBefore)
  def self.is_before
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isBefore')
  end

  # Denotes the process or method that created an entity.
  # (http://www.biointerchange.org/gfvo#isCreatedBy)
  def self.is_created_by
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isCreatedBy')
  end

  # Provides a description of the subject via reference to an object that provides further information on the subject.
  # (http://www.biointerchange.org/gfvo#isDescribedBy)
  def self.is_described_by
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isDescribedBy')
  end

  # Denotes the location of genomic feature on a landmark.
  # (http://www.biointerchange.org/gfvo#isLocatedOn)
  def self.is_located_on
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isLocatedOn')
  end

  # Denotes that an entity is an intrinsic component of an encapsulating entity.
  # (http://www.biointerchange.org/gfvo#isPartOf)
  def self.is_part_of
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isPartOf')
  end

  # Denotes participation with another entity.
  # (http://www.biointerchange.org/gfvo#isParticipantIn)
  def self.is_participant_in
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isParticipantIn')
  end

  # References an entity or resource that provides refuting evidence.
  # (http://www.biointerchange.org/gfvo#isRefutedBy)
  def self.is_refuted_by
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isRefutedBy')
  end

  # Denotes that an entity is the source of the entity that this property links out to.
  # (http://www.biointerchange.org/gfvo#isSourceOf)
  def self.is_source_of
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isSourceOf')
  end

  # Denotes spatio-temporal relations to other entities.
  # (http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo)
  def self.is_spatiotemporally_related_to
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo')
  end

  # References an entity or resource that provides supporting evidence.
  # (http://www.biointerchange.org/gfvo#isSupportedBy)
  def self.is_supported_by
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isSupportedBy')
  end

  # Denotes a temporarily constraint "isPartOf" relationship. The temporal restriction expresses that the relationship is not universally true.
  # 
  # This property can be used to express "Derives_from" relations in GFF3.
  # (http://www.biointerchange.org/gfvo#isTemporarilyPartOf)
  def self.is_temporarily_part_of
    return RDF::URI.new('http://www.biointerchange.org/gfvo#isTemporarilyPartOf')
  end

  # References another entity or resource.
  # (http://www.biointerchange.org/gfvo#references)
  def self.references
    return RDF::URI.new('http://www.biointerchange.org/gfvo#references')
  end

  # References an entity, where additional information is provided to augment the reference.
  # (http://www.biointerchange.org/gfvo#refersTo)
  def self.refers_to
    return RDF::URI.new('http://www.biointerchange.org/gfvo#refersTo')
  end

  # Representation of any literal that is associated with a GFVO class instance. Domain restrictions might apply. For example, "Codon Sequence" entities restrict "has value" to be a non-empty string consisting of A, C, G, or T letters, and whose length is a multiple of 3.
  # (http://www.biointerchange.org/gfvo#hasValue)
  def self.has_value
    return RDF::URI.new('http://www.biointerchange.org/gfvo#hasValue')
  end

  # An alias is an alternative name whose use is mostly non-primary.
  # (http://www.biointerchange.org/gfvo#Alias)
  def self.Alias
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Alias')
  end

  # Proportion of a particular gene allele in a gene pool.
  # (http://www.biointerchange.org/gfvo#AlleleFrequency)
  def self.AlleleFrequency
    return RDF::URI.new('http://www.biointerchange.org/gfvo#AlleleFrequency')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#AminoAcid)
  def self.AminoAcid
    return RDF::URI.new('http://www.biointerchange.org/gfvo#AminoAcid')
  end

  # Denotes an ancestral allele of a feature. May be used to denote the 'ancestral allele' of VCF formatted files.
  # (http://www.biointerchange.org/gfvo#AncestralSequence)
  def self.AncestralSequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#AncestralSequence')
  end

  # Feature provenance is based on array-comparative genomic hybridization.
  # (http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization)
  def self.ArrayComparativeGenomicHybridization
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization')
  end

  # An attribute denotes characteristics of an entity. At this stage, "Quality" is the only direct subclass of "Attribute", whose subclasses denote qualitative properties such as sex ("Female", "Male", "Mermaphrodite"), zygosity ("Hemizygous", "Heterozygous", "Homozygous"), etc.
  # 
  # The object property "hasQuality" (or subproperties thereof) should be utilized to express qualities of entities. The "hasAttribute" object property should be used to denote relationships to "Object" or "Process" instances, unless there is a better object property suitable to represent the relationship between the involved entities..
  # (http://www.biointerchange.org/gfvo#Attribute)
  def self.Attribute
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute')
  end

  # Average coverage depth for a genomic locus (a region or single base pair), i.e. the average number of reads representing a given nucleotide in the reconstructed sequence.
  # (http://www.biointerchange.org/gfvo#AverageCoverage)
  def self.AverageCoverage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#AverageCoverage')
  end

  # A biological entity an entity that contains genomic material or utilizes genomic material during its existance. Genomic material itself is represented as sub-classes of Chemical Entity.
  # (http://www.biointerchange.org/gfvo#BiologicalEntity)
  def self.BiologicalEntity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#BiologicalEntity')
  end

  # Information about features and variants is based on biopolymer sequencing.
  # (http://www.biointerchange.org/gfvo#BiopolymerSequencing)
  def self.BiopolymerSequencing
    return RDF::URI.new('http://www.biointerchange.org/gfvo#BiopolymerSequencing')
  end

  # A breakpoint describes the source or destination of a zero-length sequence alteration. These alterations are typically insertions, deletions or translocations according to the GVF specification (see "Breakpoint_detail" in http://sequenceontology.org/resources/gvf.html).
  # (http://www.biointerchange.org/gfvo#Breakpoint)
  def self.Breakpoint
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint')
  end

  # A catalog is a specialization of a "Collection", where all its contents are of the same type.
  # (http://www.biointerchange.org/gfvo#Catalog)
  def self.Catalog
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Catalog')
  end

  # A cell is a biological unit that in itself forms a living organism or is part of a larger organism that is composed of many other cells.
  # (http://www.biointerchange.org/gfvo#Cell)
  def self.Cell
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Cell')
  end

  # A chemical entity is an entity related to chemistry. This class is typically not instantiated, but instead, its subclasses "Amino Acid", "Chromosome", "Peptide Sequence", etc., are used to represent specific chemical entities.
  # (http://www.biointerchange.org/gfvo#ChemicalEntity)
  def self.ChemicalEntity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ChemicalEntity')
  end

  # A chromosome is an abstract representation of an unnamed chromosome to represent ploidy within a data set. A "Chromosome" instance is used for for denoting the locus of phased genotypes. For placing genomic features ("Feature" class instances) on a chromosome, contig, scaffold, etc., please see the "Landmark" class.
  # (http://www.biointerchange.org/gfvo#Chromosome)
  def self.Chromosome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome')
  end

  # A circular helix structure.
  # 
  # Can be used to indicate a true "Is_circular" attribute in GFF3 and GVF.
  # (http://www.biointerchange.org/gfvo#CircularHelix)
  def self.CircularHelix
    return RDF::URI.new('http://www.biointerchange.org/gfvo#CircularHelix')
  end

  # Coding frame offset of the feature, if it is a coding sequence or feature that contributes to transcription and translation. It is referred to as "frame" in GTF, but called "phase" in GFF3 and GVF. A feature's coding frame offset can be either 0, 1, or 2.
  # (http://www.biointerchange.org/gfvo#CodingFrameOffset)
  def self.CodingFrameOffset
    return RDF::URI.new('http://www.biointerchange.org/gfvo#CodingFrameOffset')
  end

  # A codon sequence is a nucleotide sequence underlying a potential amino acid sequence. Codon sequences are three bases of length or multiples thereof.
  # (http://www.biointerchange.org/gfvo#CodonSequence)
  def self.CodonSequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#CodonSequence')
  end

  # A collection is a container for genomic data. A collection may contain information about genomic data including -- but not limited to -- contents of GFF3, GTF, GVF and VCF files. The latter are better represented by "File" class instances, whereas the result of unions or intersections between different "File" class instances should be captured within this format-independent "Collection" class. When importing data whose provenance is not a GFF3, GTF, GVF or VCF file, instances of "Collection" should be utilized too, or the more restrictive "Catalog" class should be used.
  # (http://www.biointerchange.org/gfvo#Collection)
  def self.Collection
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Collection')
  end

  # A comment is a remark about a piece of information, an observation or statement. In the context of GFF3, GVF, etc., genomic feature and variation descriptions, "isAfter" and "isBefore" relationships should be used to indicate where a comment is situated between pragma or feature statements of GFF3, GTF, GVF or VCF files.
  # (http://www.biointerchange.org/gfvo#Comment)
  def self.Comment
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Comment')
  end

  # A contig is a contiguous DNA sequence that has been assembled from shorter overlapping DNA segments.
  # (http://www.biointerchange.org/gfvo#Contig)
  def self.Contig
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Contig')
  end

  # Number of nucleic acid sequence reads for a particular genomic locus (a region or single base pair).
  # (http://www.biointerchange.org/gfvo#Coverage)
  def self.Coverage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Coverage')
  end

  # Feature information is based on DNA microarray probes.
  # (http://www.biointerchange.org/gfvo#DNAMicroarray)
  def self.DNAMicroarray
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray')
  end

  # -- No comment or description provided. --
  # (http://www.biointerchange.org/gfvo#DNASequence)
  def self.DNASequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence')
  end

  # Information about features and variants is based on DNA sequencing.
  # (http://www.biointerchange.org/gfvo#DNASequencing)
  def self.DNASequencing
    return RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequencing')
  end

  # An experimental method is a procedure that yields an experimental outcome (result). Experimental methods can be in vivo, in vitro or in silico procedures that are well described and can be referenced.
  # (http://www.biointerchange.org/gfvo#ExperimentalMethod)
  def self.ExperimentalMethod
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ExperimentalMethod')
  end

  # A cross-reference to associate an entity to a representation in another database.
  # (http://www.biointerchange.org/gfvo#ExternalReference)
  def self.ExternalReference
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ExternalReference')
  end

  # The feature class captures information about genomic sequence features and variations. A genomic feature can be a large object, such as a chromosome or contig, down to single base-pair reference or variant alleles.
  # (http://www.biointerchange.org/gfvo#Feature)
  def self.Feature
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Feature')
  end

  # Denoting sex of a female individual. A female is defined as an individual producing ova.
  # (http://www.biointerchange.org/gfvo#Female)
  def self.Female
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Female')
  end

  # A file represents the contents of a GFF3, GTF, GVF or VCF file. It can capture genomic meta-data that is specific to any of these file formats. The result of unions, intersections or other operations between "File" class instances should be capture with the generic "Collection" class, which is format independent, or the more restrictive "Catalog" class should be used.
  # (http://www.biointerchange.org/gfvo#File)
  def self.File
    return RDF::URI.new('http://www.biointerchange.org/gfvo#File')
  end

  # Denotes a frameshift forward in the reference sequence.
  # (http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift)
  def self.ForwardReferenceSequenceFrameshift
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift')
  end

  # Details about the fragment-read (single-end read) sequencing technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#FragmentReadPlatform)
  def self.FragmentReadPlatform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#FragmentReadPlatform')
  end

  # A functional specification of bioinformatics data, i.e. the specification of genomic material that potentially has biological function.
  # (http://www.biointerchange.org/gfvo#FunctionalSpecification)
  def self.FunctionalSpecification
    return RDF::URI.new('http://www.biointerchange.org/gfvo#FunctionalSpecification')
  end

  # Denotes the presence of information that required capturing the gametic phase. For diploid organisms, that means that information is available about which chromosome of a chromosome pair contributed data.
  # (http://www.biointerchange.org/gfvo#GameticPhase)
  def self.GameticPhase
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GameticPhase')
  end

  # Representation of a genome. Genomic features that constitute the genome may be linked via one or more "Collection", "Catalog", "Contig", "Scaffold" or "File" instances.
  # (http://www.biointerchange.org/gfvo#Genome)
  def self.Genome
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Genome')
  end

  # A genome analysis denotes the type of procedure that was carried out to derive information from a genome assembly.
  # (http://www.biointerchange.org/gfvo#GenomeAnalysis)
  def self.GenomeAnalysis
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GenomeAnalysis')
  end

  # Provides information about the source of the data.
  # (http://www.biointerchange.org/gfvo#GenomicAscertainingMethod)
  def self.GenomicAscertainingMethod
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod')
  end

  # The genotype is the genetic information captured in a particular genome. It can also refer to one or more populations, if statistical distributions are provided that assign genetic codes to groups of individuals.
  # (http://www.biointerchange.org/gfvo#Genotype)
  def self.Genotype
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Genotype')
  end

  # The germline feature class captures information about genomic sequence features arising from germline cells.
  # (http://www.biointerchange.org/gfvo#GermlineCell)
  def self.GermlineCell
    return RDF::URI.new('http://www.biointerchange.org/gfvo#GermlineCell')
  end

  # Helix structure denotes the physical shape of biopolymers.
  # (http://www.biointerchange.org/gfvo#HelixStructure)
  def self.HelixStructure
    return RDF::URI.new('http://www.biointerchange.org/gfvo#HelixStructure')
  end

  # A sequence alteration with hemizygous alleles.
  # (http://www.biointerchange.org/gfvo#Hemizygous)
  def self.Hemizygous
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Hemizygous')
  end

  # Heritage denotes the passing of traits from parents or ancestors. Passed traits may not be visible as a phenotype, but instead, might only manifest as genetic inheritance.
  # (http://www.biointerchange.org/gfvo#Heritage)
  def self.Heritage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Heritage')
  end

  # Denoting sex of an individual that contains both male and female gametes.
  # (http://www.biointerchange.org/gfvo#Hermaphrodite)
  def self.Hermaphrodite
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Hermaphrodite')
  end

  # A sequence alteration with heterozygous alleles.
  # (http://www.biointerchange.org/gfvo#Heterozygous)
  def self.Heterozygous
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Heterozygous')
  end

  # A sequence alteration with homozygous alleles.
  # (http://www.biointerchange.org/gfvo#Homozygous)
  def self.Homozygous
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Homozygous')
  end

  # An identifier labels an entity with a single term that is interpreted as an accession. An accession labels entities that are part of a collection of similar type.
  # (http://www.biointerchange.org/gfvo#Identifier)
  def self.Identifier
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Identifier')
  end

  # An information content entity requires background information or specific domain knowledge to be interpreted correctly.
  # (http://www.biointerchange.org/gfvo#InformationContentEntity)
  def self.InformationContentEntity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity')
  end

  # Describing interaction between features, such as the effect of a feature variant on another feature.
  # (http://www.biointerchange.org/gfvo#Interaction)
  def self.Interaction
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Interaction')
  end

  # A label is a term or short list of terms that name an entity for the purpose of lexicographically distinguishing the entity from entities of similar type.
  # (http://www.biointerchange.org/gfvo#Label)
  def self.Label
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Label')
  end

  # A landmark establishes a coordinate system for features. Landmarks can be chromosomes, contigs, scaffolds or other constructs that can harbor "Feature" class instances. For expressing ploidy within a data set, please refer to the "Chromosome" class.
  # (http://www.biointerchange.org/gfvo#Landmark)
  def self.Landmark
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark')
  end

  # A locus refers to a position (possibly multi-dimensional) within a genome or proteome.
  # (http://www.biointerchange.org/gfvo#Locus)
  def self.Locus
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Locus')
  end

  # Denoting sex of a male individual. A male is defined as an individual producing spermatozoa.
  # (http://www.biointerchange.org/gfvo#Male)
  def self.Male
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Male')
  end

  # Denotes a match between the reference sequence and target sequence.
  # (http://www.biointerchange.org/gfvo#Match)
  def self.Match
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Match')
  end

  # A material entity represents a physical object. In the context of genomic features and variations, material entities are cells, organisms, sequences, chromosomes, etc.
  # (http://www.biointerchange.org/gfvo#MaterialEntity)
  def self.MaterialEntity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#MaterialEntity')
  end

  # Maternal heritage is the passing of traits from a female to her ancestors.
  # (http://www.biointerchange.org/gfvo#MaternalHeritage)
  def self.MaternalHeritage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#MaternalHeritage')
  end

  # Insertion or deletion of a mobile element. The exact modification is determined by a type of the Variation Ontology.
  # (http://www.biointerchange.org/gfvo#MobileElementSequenceVariant)
  def self.MobileElementSequenceVariant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#MobileElementSequenceVariant')
  end

  # A name assigns an entity a non-formal term (or multiples thereof) that can provide information about the entities identity.
  # (http://www.biointerchange.org/gfvo#Name)
  def self.Name
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Name')
  end

  # A note is a short textual description.
  # (http://www.biointerchange.org/gfvo#Note)
  def self.Note
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Note')
  end

  # Number of reads supporting a particular feature or variant.
  # (http://www.biointerchange.org/gfvo#NumberOfReads)
  def self.Number_ofReads
    return RDF::URI.new('http://www.biointerchange.org/gfvo#NumberOfReads')
  end

  # An object is a concrete entity that realizes a concept and encapsulates data associated with said concept. Objects are typically representing tangible entities, such as "Chromosome", "DNA Sequence", but also objects such as "Identifier", "Average Coverage" or other computational or mathematical entities.
  # (http://www.biointerchange.org/gfvo#Object)
  def self.Object
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Object')
  end

  # Details about the paired-end read sequencing technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#PairedEndReadPlatform)
  def self.PairedEndReadPlatform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PairedEndReadPlatform')
  end

  # Paternal heritage is the passing of traits from a male to his ancestors.
  # (http://www.biointerchange.org/gfvo#PaternalHeritage)
  def self.PaternalHeritage
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PaternalHeritage')
  end

  # A peptide sequence is an ordered sequence of amino acid residues, but which may not necessarily be a protein sequence. For encoding sequences of proteins, the subclass "Protein Sequence" should be used.
  # (http://www.biointerchange.org/gfvo#PeptideSequence)
  def self.PeptideSequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PeptideSequence')
  end

  # A phenotype description represents additional information about a sequenced individual's phenotype. A sequenced individual is represented by instances of the "Sequenced Individual" class.
  # (http://www.biointerchange.org/gfvo#Phenotype)
  def self.Phenotype
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Phenotype')
  end

  # The Phred score can be used to assign quality scores to base calls of DNA sequences.
  # (http://www.biointerchange.org/gfvo#PhredScore)
  def self.PhredScore
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PhredScore')
  end

  # A prenatal feature is purportedly associated with prenatal cells; the GVF specification declares this feature type under the prama directive "##genomic-source", but does not describe its semantics and the referenced Logical Observation Identifiers Names and Codes (LOINC, http://loinc.org), do not define the meaning or intended usage of the term "prenatal" either.
  # (http://www.biointerchange.org/gfvo#PrenatalCell)
  def self.PrenatalCell
    return RDF::URI.new('http://www.biointerchange.org/gfvo#PrenatalCell')
  end

  # A process denotes a temporally dependent entity. It can be thought of as a function, where input data is transformed by an algorithm to produce certain output data.
  # (http://www.biointerchange.org/gfvo#Process)
  def self.Process
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Process')
  end

  # A protein sequence is a peptide sequence which represents the primary structure of a protein.
  # (http://www.biointerchange.org/gfvo#ProteinSequence)
  def self.ProteinSequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ProteinSequence')
  end

  # Quality is a specific attribute that is strongly associated with an entity, but whose values are varying and disjunct. Qualities are finite enumerations, such as sex ("Female", "Male", "Hermaphrodite"), heritage ("Maternal", "Paternal"), but they also make use of the "hasValue" datatype property such as "Coding Frame Offset" (either "0", "1" or "2").
  # (http://www.biointerchange.org/gfvo#Quality)
  def self.Quality
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Quality')
  end

  # A property of a phenomenon, body, or substance, where the property has a magnitude that can be expressed by means of a number and a reference. This class is typically not directly instantiated, but instead, its subclasses "Allele Frequency", "Average Coverage", etc. are used.
  # (http://www.biointerchange.org/gfvo#Quantity)
  def self.Quantity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Quantity')
  end

  # Information about features and variants is based on RNA sequencing.
  # (http://www.biointerchange.org/gfvo#RNASequencing)
  def self.RNASequencing
    return RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequencing')
  end

  # Denotes the reference sequence of a feature. The reference sequence is of importance when dealing with genomic variation data, which is expressed by the "Variant" class.
  # (http://www.biointerchange.org/gfvo#ReferenceSequence)
  def self.ReferenceSequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequence')
  end

  # Denotes a gap in the reference sequence for an alignment.
  # (http://www.biointerchange.org/gfvo#ReferenceSequenceGap)
  def self.ReferenceSequenceGap
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequenceGap')
  end

  # Denotes a frameshift backwards (reverse) in the reference sequence.
  # (http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift)
  def self.ReverseReferenceSequenceFrameshift
    return RDF::URI.new('http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift')
  end

  # A sample is a limited quantity of a chemical entity of some sort, which is typically used (destructively/non-desctructively) in a scientific analysis or test.
  # (http://www.biointerchange.org/gfvo#Sample)
  def self.Sample
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Sample')
  end

  # A scaffold is the aggregation of multiple contigs to form a larger continuous sequencing region.
  # (http://www.biointerchange.org/gfvo#Scaffold)
  def self.Scaffold
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Scaffold')
  end

  # A measure that permits the ranking of entities.
  # (http://www.biointerchange.org/gfvo#Score)
  def self.Score
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Score')
  end

  # A sequence provides information about any biopolymer sequences. Specialized subclasses are provided to denote specialized instances of sequences, such as "Codon Sequence", "Reference Sequence", "Protein Sequence", etc.
  # (http://www.biointerchange.org/gfvo#Sequence)
  def self.Sequence
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Sequence')
  end

  # A sequence alignment denotes the congruence of two sequences.
  # In GFF3, a sequence alignment can be a nucleotide-to-nucleotide or protein-to-nucleotide alignment (see "The Gap Attribute", http://sequenceontology.org/resources/gff3.html). "Alignment Operation" class instances denote the actual steps that the constitute the sequence alignment.
  # (http://www.biointerchange.org/gfvo#SequenceAlignment)
  def self.SequenceAlignment
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignment')
  end

  # A sequence alignment operation captures the type of alignment (see "Sequence Alignment") between a reference sequence and target sequence. Note that an "Alignment Operation" is situated in a linked list, where the order of the alignment operations is of significance.
  # (http://www.biointerchange.org/gfvo#SequenceAlignmentOperation)
  def self.SequenceAlignmentOperation
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation')
  end

  # Describing specific sequence alterations of a genomic feature. A variant is related to "Reference" class instances, which denote the sequence that serves as a basis for sequence alteration comparisons.
  # (http://www.biointerchange.org/gfvo#SequenceVariant)
  def self.SequenceVariant
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceVariant')
  end

  # Aggregated sequencing information for a particular individual.
  # (http://www.biointerchange.org/gfvo#SequencedIndividual)
  def self.SequencedIndividual
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual')
  end

  # Details about the sequencing/microarray technology used to gather the data in a set.
  # (http://www.biointerchange.org/gfvo#SequencingTechnologyPlatform)
  def self.SequencingTechnologyPlatform
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SequencingTechnologyPlatform')
  end

  # Biological sex of an individual.
  # (http://www.biointerchange.org/gfvo#Sex)
  def self.Sex
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Sex')
  end

  # The somatic feature class captures information about genomic sequence features arising from somatic cells.
  # (http://www.biointerchange.org/gfvo#SomaticCell)
  def self.SomaticCell
    return RDF::URI.new('http://www.biointerchange.org/gfvo#SomaticCell')
  end

  # A span is an attribute denoting the number of nucleotides or peptides that an entity covers. This is directly used in conjunction with "Sequence Alignment Operation" subclasses, e.g. to express the number of nucleotides a sequence alignment match ranges over.
  # (http://www.biointerchange.org/gfvo#Span)
  def self.Span
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Span')
  end

  # Denotes a gap in the target sequence for an alignment.
  # (http://www.biointerchange.org/gfvo#TargetSequenceGap)
  def self.TargetSequenceGap
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TargetSequenceGap')
  end

  # Total number of reads covering a feature or variant.
  # (http://www.biointerchange.org/gfvo#TotalNumberOfReads)
  def self.TotalNumber_ofReads
    return RDF::URI.new('http://www.biointerchange.org/gfvo#TotalNumberOfReads')
  end

  # Denotes the technique of calling genomic feature variants in a genome assembly.
  # (http://www.biointerchange.org/gfvo#VariantCalling)
  def self.VariantCalling
    return RDF::URI.new('http://www.biointerchange.org/gfvo#VariantCalling')
  end

  # A version names a release of a software, dataset, or other resource. A versioned resource is not necessarily public.
  # (http://www.biointerchange.org/gfvo#Version)
  def self.Version
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Version')
  end

  # Helical structure as first proposed by Watson and Crick.
  # 
  # Can be used to indicate a false "Is_circular" attribute in GFF3 and GVF.
  # (http://www.biointerchange.org/gfvo#WatsonCrickHelix)
  def self.WatsonCrickHelix
    return RDF::URI.new('http://www.biointerchange.org/gfvo#WatsonCrickHelix')
  end

  # Zygosity denotes the similarities of a specific allele in the genome of an organism.
  # (http://www.biointerchange.org/gfvo#Zygosity)
  def self.Zygosity
    return RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#describes') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasAnnotation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasEvidence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasFirstPart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasIdentifier') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasInput') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasLastPart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasMember') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasOrderedPart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasOutput') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasPart') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasParticipant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasQuality') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasSource') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isAbout') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isAffectedBy') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isAfter') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isAttributeOf') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isBefore') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isCreatedBy') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isDescribedBy') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isLocatedOn') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isPartOf') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isParticipantIn') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isRefutedBy') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isSourceOf') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isSupportedBy') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#isTemporarilyPartOf') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#references') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#refersTo') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#hasValue') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a class.
  #
  # +uri+:: URI that is tested for being a class
  def self.is_class?(uri)
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Alias') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#AlleleFrequency') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#AminoAcid') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#AncestralSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#AverageCoverage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#BiologicalEntity') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#BiopolymerSequencing') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Catalog') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Cell') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ChemicalEntity') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#CircularHelix') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#CodingFrameOffset') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#CodonSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Collection') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Comment') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Contig') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Coverage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequencing') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ExperimentalMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ExternalReference') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Female') then
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
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#FunctionalSpecification') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GameticPhase') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Genome') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GenomeAnalysis') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Genotype') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#GermlineCell') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#HelixStructure') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Hemizygous') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Heritage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Hermaphrodite') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Heterozygous') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Homozygous') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Identifier') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Interaction') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Label') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Locus') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Male') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Match') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#MaterialEntity') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#MaternalHeritage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#MobileElementSequenceVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Name') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Note') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#NumberOfReads') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Object') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PairedEndReadPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PaternalHeritage') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PeptideSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Phenotype') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PhredScore') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#PrenatalCell') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Process') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ProteinSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Quantity') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequencing') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequenceGap') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Sample') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Scaffold') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Score') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Sequence') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignment') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceVariant') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SequencingTechnologyPlatform') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#SomaticCell') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Span') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TargetSequenceGap') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#TotalNumberOfReads') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#VariantCalling') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#Version') then
      return true
    end
    if uri == RDF::URI.new('http://www.biointerchange.org/gfvo#WatsonCrickHelix') then
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
  @@parent_properties = { RDF::URI.new('http://www.biointerchange.org/gfvo#hasAnnotation') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasEvidence') => RDF::URI.new('http://www.biointerchange.org/gfvo#references') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasFirstPart') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasOrderedPart') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasIdentifier') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasInput') => RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasLastPart') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasOrderedPart') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasMember') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasOrderedPart') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasPart') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasOutput') => RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasPart') => RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasParticipant') => RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasQuality') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#hasSource') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasAttribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#isAbout') => RDF::URI.new('http://www.biointerchange.org/gfvo#describes') , RDF::URI.new('http://www.biointerchange.org/gfvo#isAffectedBy') => RDF::URI.new('http://www.biointerchange.org/gfvo#isParticipantIn') , RDF::URI.new('http://www.biointerchange.org/gfvo#isLocatedOn') => RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#isPartOf') => RDF::URI.new('http://www.biointerchange.org/gfvo#isLocatedOn') , RDF::URI.new('http://www.biointerchange.org/gfvo#isParticipantIn') => RDF::URI.new('http://www.biointerchange.org/gfvo#isSpatiotemporallyRelatedTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#isRefutedBy') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasEvidence') , RDF::URI.new('http://www.biointerchange.org/gfvo#isSourceOf') => RDF::URI.new('http://www.biointerchange.org/gfvo#isAttributeOf') , RDF::URI.new('http://www.biointerchange.org/gfvo#isSupportedBy') => RDF::URI.new('http://www.biointerchange.org/gfvo#hasEvidence') , RDF::URI.new('http://www.biointerchange.org/gfvo#isTemporarilyPartOf') => RDF::URI.new('http://www.biointerchange.org/gfvo#isPartOf') , RDF::URI.new('http://www.biointerchange.org/gfvo#references') => RDF::URI.new('http://www.biointerchange.org/gfvo#refersTo') , RDF::URI.new('http://www.biointerchange.org/gfvo#Alias') => RDF::URI.new('http://www.biointerchange.org/gfvo#Name') , RDF::URI.new('http://www.biointerchange.org/gfvo#AncestralSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequence') , RDF::URI.new('http://www.biointerchange.org/gfvo#ArrayComparativeGenomicHybridization') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod') , RDF::URI.new('http://www.biointerchange.org/gfvo#AverageCoverage') => RDF::URI.new('http://www.biointerchange.org/gfvo#Coverage') , RDF::URI.new('http://www.biointerchange.org/gfvo#BiologicalEntity') => RDF::URI.new('http://www.biointerchange.org/gfvo#MaterialEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#BiopolymerSequencing') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod') , RDF::URI.new('http://www.biointerchange.org/gfvo#Breakpoint') => RDF::URI.new('http://www.biointerchange.org/gfvo#Locus') , RDF::URI.new('http://www.biointerchange.org/gfvo#Catalog') => RDF::URI.new('http://www.biointerchange.org/gfvo#Collection') , RDF::URI.new('http://www.biointerchange.org/gfvo#Cell') => RDF::URI.new('http://www.biointerchange.org/gfvo#BiologicalEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#ChemicalEntity') => RDF::URI.new('http://www.biointerchange.org/gfvo#MaterialEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Chromosome') => RDF::URI.new('http://www.biointerchange.org/gfvo#ChemicalEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#CircularHelix') => RDF::URI.new('http://www.biointerchange.org/gfvo#HelixStructure') , RDF::URI.new('http://www.biointerchange.org/gfvo#Collection') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Comment') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Contig') => RDF::URI.new('http://www.biointerchange.org/gfvo#Catalog') , RDF::URI.new('http://www.biointerchange.org/gfvo#DNAMicroarray') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod') , RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequencing') => RDF::URI.new('http://www.biointerchange.org/gfvo#BiopolymerSequencing') , RDF::URI.new('http://www.biointerchange.org/gfvo#ExperimentalMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#Process') , RDF::URI.new('http://www.biointerchange.org/gfvo#ExternalReference') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Feature') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Female') => RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') , RDF::URI.new('http://www.biointerchange.org/gfvo#File') => RDF::URI.new('http://www.biointerchange.org/gfvo#Collection') , RDF::URI.new('http://www.biointerchange.org/gfvo#ForwardReferenceSequenceFrameshift') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#FragmentReadPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequencingTechnologyPlatform') , RDF::URI.new('http://www.biointerchange.org/gfvo#FunctionalSpecification') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#GameticPhase') => RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') , RDF::URI.new('http://www.biointerchange.org/gfvo#Genome') => RDF::URI.new('http://www.biointerchange.org/gfvo#MaterialEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#GenomeAnalysis') => RDF::URI.new('http://www.biointerchange.org/gfvo#ExperimentalMethod') , RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod') => RDF::URI.new('http://www.biointerchange.org/gfvo#ExperimentalMethod') , RDF::URI.new('http://www.biointerchange.org/gfvo#Genotype') => RDF::URI.new('http://www.biointerchange.org/gfvo#FunctionalSpecification') , RDF::URI.new('http://www.biointerchange.org/gfvo#GermlineCell') => RDF::URI.new('http://www.biointerchange.org/gfvo#Cell') , RDF::URI.new('http://www.biointerchange.org/gfvo#HelixStructure') => RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') , RDF::URI.new('http://www.biointerchange.org/gfvo#Hemizygous') => RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Heritage') => RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') , RDF::URI.new('http://www.biointerchange.org/gfvo#Hermaphrodite') => RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') , RDF::URI.new('http://www.biointerchange.org/gfvo#Heterozygous') => RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Homozygous') => RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Identifier') => RDF::URI.new('http://www.biointerchange.org/gfvo#Label') , RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') => RDF::URI.new('http://www.biointerchange.org/gfvo#Object') , RDF::URI.new('http://www.biointerchange.org/gfvo#Interaction') => RDF::URI.new('http://www.biointerchange.org/gfvo#Process') , RDF::URI.new('http://www.biointerchange.org/gfvo#Label') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Landmark') => RDF::URI.new('http://www.biointerchange.org/gfvo#Identifier') , RDF::URI.new('http://www.biointerchange.org/gfvo#Locus') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Male') => RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') , RDF::URI.new('http://www.biointerchange.org/gfvo#Match') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#MaterialEntity') => RDF::URI.new('http://www.biointerchange.org/gfvo#Object') , RDF::URI.new('http://www.biointerchange.org/gfvo#MaternalHeritage') => RDF::URI.new('http://www.biointerchange.org/gfvo#Heritage') , RDF::URI.new('http://www.biointerchange.org/gfvo#MobileElementSequenceVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceVariant') , RDF::URI.new('http://www.biointerchange.org/gfvo#Name') => RDF::URI.new('http://www.biointerchange.org/gfvo#Label') , RDF::URI.new('http://www.biointerchange.org/gfvo#Note') => RDF::URI.new('http://www.biointerchange.org/gfvo#InformationContentEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#PairedEndReadPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequencingTechnologyPlatform') , RDF::URI.new('http://www.biointerchange.org/gfvo#PaternalHeritage') => RDF::URI.new('http://www.biointerchange.org/gfvo#Heritage') , RDF::URI.new('http://www.biointerchange.org/gfvo#Phenotype') => RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') , RDF::URI.new('http://www.biointerchange.org/gfvo#PrenatalCell') => RDF::URI.new('http://www.biointerchange.org/gfvo#Cell') , RDF::URI.new('http://www.biointerchange.org/gfvo#ProteinSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#PeptideSequence') , RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') => RDF::URI.new('http://www.biointerchange.org/gfvo#Attribute') , RDF::URI.new('http://www.biointerchange.org/gfvo#Quantity') => RDF::URI.new('http://www.biointerchange.org/gfvo#Object') , RDF::URI.new('http://www.biointerchange.org/gfvo#RNASequencing') => RDF::URI.new('http://www.biointerchange.org/gfvo#BiopolymerSequencing') , RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequence') => RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence') , RDF::URI.new('http://www.biointerchange.org/gfvo#ReferenceSequenceGap') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#ReverseReferenceSequenceFrameshift') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#Sample') => RDF::URI.new('http://www.biointerchange.org/gfvo#ChemicalEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#Scaffold') => RDF::URI.new('http://www.biointerchange.org/gfvo#Catalog') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceVariant') => RDF::URI.new('http://www.biointerchange.org/gfvo#DNASequence') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencedIndividual') => RDF::URI.new('http://www.biointerchange.org/gfvo#BiologicalEntity') , RDF::URI.new('http://www.biointerchange.org/gfvo#SequencingTechnologyPlatform') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomicAscertainingMethod') , RDF::URI.new('http://www.biointerchange.org/gfvo#Sex') => RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') , RDF::URI.new('http://www.biointerchange.org/gfvo#SomaticCell') => RDF::URI.new('http://www.biointerchange.org/gfvo#Cell') , RDF::URI.new('http://www.biointerchange.org/gfvo#TargetSequenceGap') => RDF::URI.new('http://www.biointerchange.org/gfvo#SequenceAlignmentOperation') , RDF::URI.new('http://www.biointerchange.org/gfvo#TotalNumberOfReads') => RDF::URI.new('http://www.biointerchange.org/gfvo#NumberOfReads') , RDF::URI.new('http://www.biointerchange.org/gfvo#VariantCalling') => RDF::URI.new('http://www.biointerchange.org/gfvo#GenomeAnalysis') , RDF::URI.new('http://www.biointerchange.org/gfvo#Version') => RDF::URI.new('http://www.biointerchange.org/gfvo#Identifier') , RDF::URI.new('http://www.biointerchange.org/gfvo#WatsonCrickHelix') => RDF::URI.new('http://www.biointerchange.org/gfvo#HelixStructure') , RDF::URI.new('http://www.biointerchange.org/gfvo#Zygosity') => RDF::URI.new('http://www.biointerchange.org/gfvo#Quality') }

end

end
