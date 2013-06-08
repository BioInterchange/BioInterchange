import rdflib

from rdflib import Namespace


class GVF1O:

    @classmethod
    def seqid(cls):
        """Either:
            Establishes the landmark (cls, e.g. a chromosome) on which a feature is located.
            (http://www.biointerchange.org/gvf1o#GVF1_0004)
        Or:
            Link to the landmark that establishes the coordinate system for the breakpoint.
            (http://www.biointerchange.org/gvf1o#GVF1_0072)
        """
        return [ cls._namespace_GVF1O('GVF1_0004'), cls._namespace_GVF1O('GVF1_0072') ]

    @classmethod
    def strand(cls):
        """Either:
            Strand of the feature.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0010)
        Or:
            Strand of the breakpoint.
            (http://www.biointerchange.org/gvf1o#GVF1_0083)
        Or:
            Strand of a target -- if applicable.
            (http://www.biointerchange.org/gvf1o#GVF1_0091)
        """
        return [ cls._namespace_GVF1O('GVF1_0010'), cls._namespace_GVF1O('GVF1_0083'), cls._namespace_GVF1O('GVF1_0091') ]

    @classmethod
    def attributes(cls):
        """Either:
            Tag name/value pair attributes of a feature.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0012)
        Or:
            Tag name/value pair attributes that are not captured by the GVF specification.
            (http://www.biointerchange.org/gvf1o#GVF1_0152)
        """
        return [ cls._namespace_GVF1O('GVF1_0012'), cls._namespace_GVF1O('GVF1_0152') ]

    @classmethod
    def parent(cls):
        """Link out to the parent feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0014)
        """
        return cls._namespace_GVF1O('GVF1_0014')

    @classmethod
    def contains(cls):
        """Relationship that describes which features belong to a feature set.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0015)
        """
        return cls._namespace_GVF1O('GVF1_0015')

    @classmethod
    def region(cls):
        """Either:
            FALDO "Region" instance replacement for a feature's start, stop, strand properties.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0021)
        Or:
            FALDO "Region" instance replacement for a breakpoint's start, stop, strand properties.
            (http://www.biointerchange.org/gvf1o#GVF1_0079)
        Or:
            FALDO "Region" instance replacement for a target's start, stop, strand  properties.
            (http://www.biointerchange.org/gvf1o#GVF1_0090)
        """
        return [ cls._namespace_GVF1O('GVF1_0021'), cls._namespace_GVF1O('GVF1_0079'), cls._namespace_GVF1O('GVF1_0090') ]

    @classmethod
    def species(cls):
        """NCBI Taxonomy Ontology "NCBITaxon_1" (cls, or sub-classes) instance that denotes the species for a feature set.
        (http://www.biointerchange.org/gvf1o#GVF1_0023)
        """
        return cls._namespace_GVF1O('GVF1_0023')

    @classmethod
    def variant(cls):
        """Specific information about the variant(cls, s) of a feature.
        (http://www.biointerchange.org/gvf1o#GVF1_0034)
        """
        return cls._namespace_GVF1O('GVF1_0034')

    @classmethod
    def individual(cls):
        """Links to information about an individual.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0036)
        """
        return cls._namespace_GVF1O('GVF1_0036')

    @classmethod
    def zygosity(cls):
        """Zygosity of a variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0038)
        """
        return cls._namespace_GVF1O('GVF1_0038')

    @classmethod
    def effect(cls):
        """An effect of a particular feature variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0041)
        """
        return cls._namespace_GVF1O('GVF1_0041')

    @classmethod
    def sequence_variant(cls):
        """Effect of a sequence alteration on a sequence feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0042)
        """
        return cls._namespace_GVF1O('GVF1_0042')

    @classmethod
    def feature_type(cls):
        """A term that is describing the sequence feature that is being affected.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0043)
        """
        return cls._namespace_GVF1O('GVF1_0043')

    @classmethod
    def start_range(cls):
        """A coordinate range for ambiguous start coordinates.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0046)
        """
        return cls._namespace_GVF1O('GVF1_0046')

    @classmethod
    def end_range(cls):
        """A coordinate range for ambiguous start coordinates.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0047)
        """
        return cls._namespace_GVF1O('GVF1_0047')

    @classmethod
    def chromosome(cls):
        """Denotes abstract chromosome representations for capturing variants that appear on the same chromosome of a polyploid organism.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0051)
        """
        return cls._namespace_GVF1O('GVF1_0051')

    @classmethod
    def genotype(cls):
        """Determines the genotype as observed in an individual.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0053)
        """
        return cls._namespace_GVF1O('GVF1_0053')

    @classmethod
    def feature_properties(cls):
        """Either:
            Properties that are directly associated with Feature class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0066)
        Or:
            Properties that are directly associated with Feature class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0059)
        """
        return [ cls._namespace_GVF1O('GVF1_0066'), cls._namespace_GVF1O('GVF1_0059') ]

    @classmethod
    def sequencedindividual_properties(cls):
        """Either:
            Properties that are directly associated with SequencedIndividual class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0067)
        Or:
            Properties that are directly associated with SequencedIndividual class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0065)
        """
        return [ cls._namespace_GVF1O('GVF1_0067'), cls._namespace_GVF1O('GVF1_0065') ]

    @classmethod
    def set_properties(cls):
        """Either:
            Properties that are directly associated with Set class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0068)
        Or:
            Properties that are directly associated with Set class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0063)
        """
        return [ cls._namespace_GVF1O('GVF1_0068'), cls._namespace_GVF1O('GVF1_0063') ]

    @classmethod
    def variant_properties(cls):
        """Either:
            Properties that are directly associated with Variant class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0069)
        Or:
            Properties that are directly associated with Variant class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0060)
        """
        return [ cls._namespace_GVF1O('GVF1_0069'), cls._namespace_GVF1O('GVF1_0060') ]

    @classmethod
    def effect_properties(cls):
        """Either:
            Properties that are directly associated with Effect class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0070)
        Or:
            Properties that are directly associated with Effect class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0158)
        """
        return [ cls._namespace_GVF1O('GVF1_0070'), cls._namespace_GVF1O('GVF1_0158') ]

    @classmethod
    def breakpoint_properties(cls):
        """Either:
            Properties that are directly associated with Breakpoint class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0075)
        Or:
            Properties that are directly associated with Breakpoint class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0071)
        """
        return [ cls._namespace_GVF1O('GVF1_0075'), cls._namespace_GVF1O('GVF1_0071') ]

    @classmethod
    def dbxref(cls):
        """Either:
            A database cross-reference to associate a sequence alteration to its representation in another database.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0078)
        Or:
            A database cross-reference to associate a structured pragma to a representation in another database.
            (http://www.biointerchange.org/gvf1o#GVF1_0104)
        """
        return [ cls._namespace_GVF1O('GVF1_0078'), cls._namespace_GVF1O('GVF1_0104') ]

    @classmethod
    def breakpoint(cls):
        """Potential source or destination of zero-length sequence alterations.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0080)
        """
        return cls._namespace_GVF1O('GVF1_0080')

    @classmethod
    def target_properties(cls):
        """Either:
            Properties that are directly associated with Target class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0089)
        Or:
            Properties that are directly associated with Target class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0092)
        """
        return [ cls._namespace_GVF1O('GVF1_0089'), cls._namespace_GVF1O('GVF1_0092') ]

    @classmethod
    def technologyplatform_properties(cls):
        """Either:
            Properties that are directly associated with TechnologyPlatform class instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0102)
        Or:
            Properties that are directly associated with TechnologyPlatform class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0107)
        """
        return [ cls._namespace_GVF1O('GVF1_0102'), cls._namespace_GVF1O('GVF1_0107') ]

    @classmethod
    def datasource_properties(cls):
        """Properties that are directly associated with DataSource class instances.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0103)
        """
        return cls._namespace_GVF1O('GVF1_0103')

    @classmethod
    def structuredpragma_properties(cls):
        """Either:
            Properties describing structured pragma properties.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0112)
        Or:
            Properties describing structured pragma properties.
            (http://www.biointerchange.org/gvf1o#GVF1_0113)
        """
        return [ cls._namespace_GVF1O('GVF1_0112'), cls._namespace_GVF1O('GVF1_0113') ]

    @classmethod
    def read_type(cls):
        """Types of reads produced by the platform.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0119)
        """
        return cls._namespace_GVF1O('GVF1_0119')

    @classmethod
    def data_type(cls):
        """Datatype of this data source.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0120)
        """
        return cls._namespace_GVF1O('GVF1_0120')

    @classmethod
    def technology_platform(cls):
        """Technology platform that was used to derive the feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0121)
        """
        return cls._namespace_GVF1O('GVF1_0121')

    @classmethod
    def data_source(cls):
        """Data source origin of the feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0122)
        """
        return cls._namespace_GVF1O('GVF1_0122')

    @classmethod
    def score_method(cls):
        """Used scoring method.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0123)
        """
        return cls._namespace_GVF1O('GVF1_0123')

    @classmethod
    def source_method(cls):
        """Further information about the algorithm/methodologies used.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0124)
        """
        return cls._namespace_GVF1O('GVF1_0124')

    @classmethod
    def phenotype_description(cls):
        """Further information about an individual's phenotype. Applies only to single individual sets.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0125)
        """
        return cls._namespace_GVF1O('GVF1_0125')

    @classmethod
    def attribute_method(cls):
        """Either:
            Further information about the associated attribute(cls, s).
            (http://www.biointerchange.org/gvf1o#GVF1_0126)
        Or:
            Further information about the associated attribute(s).
            (http://www.biointerchange.org/gvf1o#GVF1_0127)
        Or:
            Further information about the associated attribute(s).
            (http://www.biointerchange.org/gvf1o#GVF1_0129)
        Or:
            Further information about the associated attribute(s).
            (http://www.biointerchange.org/gvf1o#GVF1_0130)
        Or:
            Further information about the associated attribute(s).
            (http://www.biointerchange.org/gvf1o#GVF1_0131)
        """
        return [ cls._namespace_GVF1O('GVF1_0126'), cls._namespace_GVF1O('GVF1_0127'), cls._namespace_GVF1O('GVF1_0129'), cls._namespace_GVF1O('GVF1_0130'), cls._namespace_GVF1O('GVF1_0131') ]

    @classmethod
    def attribute_properties(cls):
        """Either:
            Properties about Attribute instances.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0128)
        Or:
            Properties that are directly associated with Attribute class instances.
            (http://www.biointerchange.org/gvf1o#GVF1_0064)
        """
        return [ cls._namespace_GVF1O('GVF1_0128'), cls._namespace_GVF1O('GVF1_0064') ]

    @classmethod
    def sex(cls):
        """Denotes the sex of the sequenced individual for single-individual sets.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0147)
        """
        return cls._namespace_GVF1O('GVF1_0147')

    @classmethod
    def genomic_source(cls):
        """Denotes the source of genomic data (cls, on a cell-type level).
        (http://www.biointerchange.org/gvf1o#GVF1_0148)
        """
        return cls._namespace_GVF1O('GVF1_0148')

    @classmethod
    def feature_ontology(cls):
        """Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0150)
        """
        return cls._namespace_GVF1O('GVF1_0150')

    @classmethod
    def target(cls):
        """Identifies the target that the features aligns to.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0155)
        """
        return cls._namespace_GVF1O('GVF1_0155')

    @classmethod
    def source(cls):
        """A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0005)
        """
        return cls._namespace_GVF1O('GVF1_0005')

    @classmethod
    def type(cls):
        """Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (cls, SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
        (http://www.biointerchange.org/gvf1o#GVF1_0006)
        """
        return cls._namespace_GVF1O('GVF1_0006')

    @classmethod
    def start(cls):
        """Either:
            Start coordinate of the feature on the seqid landmark.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0007)
        Or:
            A coordinate that defines the start of an ambiguous coordinate range.
            (http://www.biointerchange.org/gvf1o#GVF1_0048)
        Or:
            Start coordinate of the feature on the seqid landmark.
            (http://www.biointerchange.org/gvf1o#GVF1_0073)
        Or:
            Start coordinate of the target.
            (http://www.biointerchange.org/gvf1o#GVF1_0094)
        Or:
            Genomic start coordinate of the landmark.
            (http://www.biointerchange.org/gvf1o#GVF1_0138)
        """
        return [ cls._namespace_GVF1O('GVF1_0007'), cls._namespace_GVF1O('GVF1_0048'), cls._namespace_GVF1O('GVF1_0073'), cls._namespace_GVF1O('GVF1_0094'), cls._namespace_GVF1O('GVF1_0138') ]

    @classmethod
    def end(cls):
        """Either:
            End coordinate of the feature on the seqid landmark.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0008)
        Or:
            A coordinate that defines the end of an ambiguous coordinate range.
            (http://www.biointerchange.org/gvf1o#GVF1_0049)
        Or:
            End coordinate of the feature on the seqid landmark.
            (http://www.biointerchange.org/gvf1o#GVF1_0074)
        Or:
            End coordinate of the target.
            (http://www.biointerchange.org/gvf1o#GVF1_0095)
        Or:
            Genomic end coordinate of the landmark.
            (http://www.biointerchange.org/gvf1o#GVF1_0139)
        """
        return [ cls._namespace_GVF1O('GVF1_0008'), cls._namespace_GVF1O('GVF1_0049'), cls._namespace_GVF1O('GVF1_0074'), cls._namespace_GVF1O('GVF1_0095'), cls._namespace_GVF1O('GVF1_0139') ]

    @classmethod
    def score(cls):
        """Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0009)
        """
        return cls._namespace_GVF1O('GVF1_0009')

    @classmethod
    def tag(cls):
        """Either:
            Tag name of a feature attribute.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0013)
        Or:
            Tag name of an user defined structured attribute.
            (http://www.biointerchange.org/gvf1o#GVF1_0154)
        """
        return [ cls._namespace_GVF1O('GVF1_0013'), cls._namespace_GVF1O('GVF1_0154') ]

    @classmethod
    def gvf_version(cls):
        """Version of the GVF specification that defines the feature set contents.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0022)
        """
        return cls._namespace_GVF1O('GVF1_0022')

    @classmethod
    def build(cls):
        """Name of a genome assembly build that denotes the provenance of features in a feature set. For example, 'NCBI 36' or 'FlyBase r4.1'.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0024)
        """
        return cls._namespace_GVF1O('GVF1_0024')

    @classmethod
    def variant_seq(cls):
        """All sequence variations at a locus -- including the reference sequence when appropriate (cls, for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
        (http://www.biointerchange.org/gvf1o#GVF1_0025)
        """
        return cls._namespace_GVF1O('GVF1_0025')

    @classmethod
    def id(cls):
        """Either:
            A unique identifier for the feature within the feature set.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0026)
        Or:
            ID that uniquely establishes the Landmark's identity within a Set.
            (http://www.biointerchange.org/gvf1o#GVF1_0137)
        """
        return [ cls._namespace_GVF1O('GVF1_0026'), cls._namespace_GVF1O('GVF1_0137') ]

    @classmethod
    def alias(cls):
        """Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (cls, e.g. dbSNP, OMIM) which should use the dbxref property.
        (http://www.biointerchange.org/gvf1o#GVF1_0027)
        """
        return cls._namespace_GVF1O('GVF1_0027')

    @classmethod
    def reference_seq(cls):
        """Sequence from the reference genome.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0031)
        """
        return cls._namespace_GVF1O('GVF1_0031')

    @classmethod
    def variant_reads(cls):
        """Number of reads that are supporting this variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0032)
        """
        return cls._namespace_GVF1O('GVF1_0032')

    @classmethod
    def total_reads(cls):
        """Total number of reads.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0037)
        """
        return cls._namespace_GVF1O('GVF1_0037')

    @classmethod
    def variant_freq(cls):
        """Frequency of a variant in a population.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0039)
        """
        return cls._namespace_GVF1O('GVF1_0039')

    @classmethod
    def feature(cls):
        """Features that are affected by this sequence alteration effect. This can be an external feature identifier, such as an Ensembl gene/transcript identifier.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0044)
        """
        return cls._namespace_GVF1O('GVF1_0044')

    @classmethod
    def phased(cls):
        """Either:
            Unclear from GVF specification.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0050)
        Or:
            Indicates whether this particular is phased. Used to encode ##phased-genotypes statements.
            (http://www.biointerchange.org/gvf1o#GVF1_0101)
        """
        return [ cls._namespace_GVF1O('GVF1_0050'), cls._namespace_GVF1O('GVF1_0101') ]

    @classmethod
    def variant_codon(cls):
        """Describes the codon that overlaps this variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0054)
        """
        return cls._namespace_GVF1O('GVF1_0054')

    @classmethod
    def reference_codon(cls):
        """Describes the codon from the reference sequence whose coordinates overlap with this variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0055)
        """
        return cls._namespace_GVF1O('GVF1_0055')

    @classmethod
    def variant_aa(cls):
        """Amino acid that overlaps with the variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0056)
        """
        return cls._namespace_GVF1O('GVF1_0056')

    @classmethod
    def reference_aa(cls):
        """Amino acid in the reference genome that overlaps with a variant's genome coordinates.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0057)
        """
        return cls._namespace_GVF1O('GVF1_0057')

    @classmethod
    def range_properties(cls):
        """Properties that are directly associated with Range class instances.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0061)
        """
        return cls._namespace_GVF1O('GVF1_0061')

    @classmethod
    def a_context(cls):
        """Sequence context (cls, positive strand) of a feature on the 5' end.
        (http://www.biointerchange.org/gvf1o#GVF1_0076)
        """
        return cls._namespace_GVF1O('GVF1_0076')

    @classmethod
    def gff_version(cls):
        """Version of the GFF specification that defines the feature set contents apart from GVF related definitions.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0081)
        """
        return cls._namespace_GVF1O('GVF1_0081')

    @classmethod
    def file_date(cls):
        """Creation date of the GVF file that this set stems from.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0082)
        """
        return cls._namespace_GVF1O('GVF1_0082')

    @classmethod
    def target_id(cls):
        """ID or accession of the target alignment.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0093)
        """
        return cls._namespace_GVF1O('GVF1_0093')

    @classmethod
    def ontology_term(cls):
        """A cross-reference to an ontology term that is associated with a feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0096)
        """
        return cls._namespace_GVF1O('GVF1_0096')

    @classmethod
    def comment(cls):
        """An arbitrary comment. Free text.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0105)
        """
        return cls._namespace_GVF1O('GVF1_0105')

    @classmethod
    def platform_class(cls):
        """Type of technology used to gather the variant data. Unrestricted range due to open specification.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0106)
        """
        return cls._namespace_GVF1O('GVF1_0106')

    @classmethod
    def platform_name(cls):
        """Sequencer or other machine used to collect the variant data. Unrestricted range due to open specification.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0108)
        """
        return cls._namespace_GVF1O('GVF1_0108')

    @classmethod
    def read_length(cls):
        """Undocumented in GVF specification.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0132)
        """
        return cls._namespace_GVF1O('GVF1_0132')

    @classmethod
    def read_pair_span(cls):
        """Undocumented in GVF specification.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0133)
        """
        return cls._namespace_GVF1O('GVF1_0133')

    @classmethod
    def average_coverage(cls):
        """Undocumented in GVF specification.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0134)
        """
        return cls._namespace_GVF1O('GVF1_0134')

    @classmethod
    def landmark_properties(cls):
        """Properties that are directly associated with Landmark class instances.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0136)
        """
        return cls._namespace_GVF1O('GVF1_0136')

    @classmethod
    def file_version(cls):
        """Version of the GVF file that this set stems from.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0149)
        """
        return cls._namespace_GVF1O('GVF1_0149')

    @classmethod
    def structuredattribute_properties(cls):
        """Properties that are directly associated with StructuredAttribute class instances.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0153)
        """
        return cls._namespace_GVF1O('GVF1_0153')

    @classmethod
    def sequence(cls):
        """Either:
            Sequence associated with this feature, if it has been specified using a FASTA string.
            (cls, http://www.biointerchange.org/gvf1o#GVF1_0156)
        Or:
            Sequence associated with this feature, if it has been specified using a FASTA string.
            (http://www.biointerchange.org/gvf1o#GVF1_0157)
        """
        return [ cls._namespace_GVF1O('GVF1_0156'), cls._namespace_GVF1O('GVF1_0157') ]

    @classmethod
    def Set(cls):
        """Set of genomic sequence features, whose identifiers are unique within the set.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0001)
        """
        return cls._namespace_GVF1O('GVF1_0001')

    @classmethod
    def Feature(cls):
        """A genomic sequence feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0002)
        """
        return cls._namespace_GVF1O('GVF1_0002')

    @classmethod
    def Attribute(cls):
        """Representation of attribute tag/value pairs that are not covered by specific classes such as Effect or Variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0003)
        """
        return cls._namespace_GVF1O('GVF1_0003')

    @classmethod
    def Strand(cls):
        """Class describing a genomic strand. Instances of the class (cls, individuals) are used to denote forward-/reverse-strands, etc.
        (http://www.biointerchange.org/gvf1o#GVF1_0016)
        """
        return cls._namespace_GVF1O('GVF1_0016')

    @classmethod
    def Variant(cls):
        """Describing specific alterations of a feature.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0033)
        """
        return cls._namespace_GVF1O('GVF1_0033')

    @classmethod
    def SequencedIndividual(cls):
        """Aggregated sequencing information for a particular individual.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0035)
        """
        return cls._namespace_GVF1O('GVF1_0035')

    @classmethod
    def Effect(cls):
        """Describing the effect of a feature variant.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0040)
        """
        return cls._namespace_GVF1O('GVF1_0040')

    @classmethod
    def Range(cls):
        """Describe ambiguity in either start or end coordinates.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0045)
        """
        return cls._namespace_GVF1O('GVF1_0045')

    @classmethod
    def Chromosome(cls):
        """An abstract representation of a chromosome to represent ploidy.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0052)
        """
        return cls._namespace_GVF1O('GVF1_0052')

    @classmethod
    def Breakpoint(cls):
        """Describes the source or destination of a zero-length sequence alteration.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0058)
        """
        return cls._namespace_GVF1O('GVF1_0058')

    @classmethod
    def Zygosity(cls):
        """Denotes the zygosity of alleles.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0084)
        """
        return cls._namespace_GVF1O('GVF1_0084')

    @classmethod
    def Target(cls):
        """Indicates a feature's "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0088)
        """
        return cls._namespace_GVF1O('GVF1_0088')

    @classmethod
    def TechnologyPlatform(cls):
        """Details about the sequencing/microarray technology used to gather the data in a set.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0097)
        """
        return cls._namespace_GVF1O('GVF1_0097')

    @classmethod
    def DataSource(cls):
        """Provides information about the source of the data. For example, it can link out to actual sequences associated with the Feature individuals in a Set.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0098)
        """
        return cls._namespace_GVF1O('GVF1_0098')

    @classmethod
    def Method(cls):
        """Information about the used scoring algorithm or method.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0099)
        """
        return cls._namespace_GVF1O('GVF1_0099')

    @classmethod
    def PhenotypeDescription(cls):
        """Additional information about an individual's phenotype.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0100)
        """
        return cls._namespace_GVF1O('GVF1_0100')

    @classmethod
    def ReadType(cls):
        """Type of reads obtained for a given technology platform.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0109)
        """
        return cls._namespace_GVF1O('GVF1_0109')

    @classmethod
    def DataType(cls):
        """Determines the datatype of a variant sequence.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0114)
        """
        return cls._namespace_GVF1O('GVF1_0114')

    @classmethod
    def Landmark(cls):
        """A landmark that establishes the coordinate system for features.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0135)
        """
        return cls._namespace_GVF1O('GVF1_0135')

    @classmethod
    def Sex(cls):
        """For single individual sets, the Sex class' OWL-individuals can be used to specify the sex of the sequenced (cls, real-life) individuals.
        (http://www.biointerchange.org/gvf1o#GVF1_0140)
        """
        return cls._namespace_GVF1O('GVF1_0140')

    @classmethod
    def GenomicSource(cls):
        """An enumerated class for determining the genomic source (cls, cell type) of sequenced data.
        (http://www.biointerchange.org/gvf1o#GVF1_0141)
        """
        return cls._namespace_GVF1O('GVF1_0141')

    @classmethod
    def StructuredAttribute(cls):
        """Representation of attribute tag/value pairs that are specific to particular structured attributes, but which are not covered by the GVF specification.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0151)
        """
        return cls._namespace_GVF1O('GVF1_0151')

    @classmethod
    def Positive(cls):
        """Location on the positive (cls, forward) strand.
        (http://www.biointerchange.org/gvf1o#GVF1_0017)
        """
        return cls._namespace_GVF1O('GVF1_0017')

    @classmethod
    def Negative(cls):
        """Location on the negative (cls, reverse) strand.
        (http://www.biointerchange.org/gvf1o#GVF1_0018)
        """
        return cls._namespace_GVF1O('GVF1_0018')

    @classmethod
    def UnknownStrand(cls):
        """Strand was not determined, which leaves it open whether the location is on the positive (cls, forward) or negative (reverse) strand.
        (http://www.biointerchange.org/gvf1o#GVF1_0019)
        """
        return cls._namespace_GVF1O('GVF1_0019')

    @classmethod
    def NotStranded(cls):
        """Strand is not applicable.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0020)
        """
        return cls._namespace_GVF1O('GVF1_0020')

    @classmethod
    def Heterozygous(cls):
        """Denotes heterozygous alleles.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0085)
        """
        return cls._namespace_GVF1O('GVF1_0085')

    @classmethod
    def Homozygous(cls):
        """Denotes homozygous alleles.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0086)
        """
        return cls._namespace_GVF1O('GVF1_0086')

    @classmethod
    def Hemizygous(cls):
        """Denotes hemizygous alleles.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0087)
        """
        return cls._namespace_GVF1O('GVF1_0087')

    @classmethod
    def Fragment(cls):
        """Denotes reads that are fragments.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0110)
        """
        return cls._namespace_GVF1O('GVF1_0110')

    @classmethod
    def Pair(cls):
        """Denotes reads that are pairs.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0111)
        """
        return cls._namespace_GVF1O('GVF1_0111')

    @classmethod
    def DNASequence(cls):
        """Denotes a DNA sequence.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0115)
        """
        return cls._namespace_GVF1O('GVF1_0115')

    @classmethod
    def RNASequence(cls):
        """Denotes an RNA sequence.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0116)
        """
        return cls._namespace_GVF1O('GVF1_0116')

    @classmethod
    def DNAMicroarray(cls):
        """Denotes a DNA microarray probe.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0117)
        """
        return cls._namespace_GVF1O('GVF1_0117')

    @classmethod
    def ArrayComparativeGenomicHybridization(cls):
        """Denotes an array-comparative genomic hybridization.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0118)
        """
        return cls._namespace_GVF1O('GVF1_0118')

    @classmethod
    def Female(cls):
        """Denotes that a Set contains features of a female.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0142)
        """
        return cls._namespace_GVF1O('GVF1_0142')

    @classmethod
    def Male(cls):
        """Denotes that a Set contains features of a male.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0143)
        """
        return cls._namespace_GVF1O('GVF1_0143')

    @classmethod
    def Prenatal(cls):
        """Denotes that a set contains features of prenatal cells.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0144)
        """
        return cls._namespace_GVF1O('GVF1_0144')

    @classmethod
    def Germline(cls):
        """Denotes that a set contains features of germline cells.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0145)
        """
        return cls._namespace_GVF1O('GVF1_0145')

    @classmethod
    def Somatic(cls):
        """Denotes that a set contains features of somatic cells.
        (cls, http://www.biointerchange.org/gvf1o#GVF1_0146)
        """
        return cls._namespace_GVF1O('GVF1_0146')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == cls._namespace_GVF1O('GVF1_0004'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0010'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0012'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0014'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0015'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0021'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0023'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0034'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0036'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0038'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0041'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0042'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0043'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0046'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0047'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0051'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0053'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0066'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0067'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0068'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0069'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0070'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0072'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0075'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0078'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0079'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0080'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0083'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0089'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0090'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0091'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0102'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0103'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0104'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0112'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0119'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0120'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0121'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0122'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0123'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0124'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0125'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0126'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0127'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0128'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0129'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0130'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0131'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0147'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0148'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0150'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0152'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0155'):
            return True
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        if uri == cls._namespace_GVF1O('GVF1_0005'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0006'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0007'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0008'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0009'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0013'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0022'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0024'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0025'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0026'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0027'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0031'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0032'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0037'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0039'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0044'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0048'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0049'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0050'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0054'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0055'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0056'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0057'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0059'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0060'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0061'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0063'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0064'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0065'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0071'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0073'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0074'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0076'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0077'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0081'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0082'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0092'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0093'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0094'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0095'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0096'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0101'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0105'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0106'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0107'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0108'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0113'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0132'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0133'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0134'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0136'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0137'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0138'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0139'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0149'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0153'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0154'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0156'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0157'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0158'):
            return True
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == cls._namespace_GVF1O('GVF1_0001'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0002'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0003'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0016'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0033'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0035'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0040'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0045'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0052'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0058'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0084'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0088'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0097'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0098'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0099'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0100'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0109'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0114'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0135'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0140'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0141'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0151'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
        if uri == cls._namespace_GVF1O('GVF1_0017'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0018'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0019'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0020'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0085'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0086'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0087'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0110'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0111'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0115'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0116'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0117'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0118'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0142'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0143'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0144'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0145'):
            return True
        if uri == cls._namespace_GVF1O('GVF1_0146'):
            return True
        return False

    @classmethod
    def with_parent(cls, uris, parent):
        """Returns only those URIs that fall under a designated parent URI.
        
        uris -- Set of URIs that are tested whether they have the given parent URI.
        parent -- Parent URI.
        """
        return filter(lambda uri: cls.has_parent(uri, parent), uris)

    @classmethod
    def has_parent(cls, uri, parent):
        """Recursively tries to determine the parent for a given URI.
        
        uri -- URI that is tested for whether it has the given parent URI.
        parent -- Parent URI.
        """
        if cls.__parent_properties.has_key(uri):
            if cls.__parent_properties[uri] == parent:
                return True
            return cls.has_parent(cls.__parent_properties[uri], parent)
        return False

    @classmethod
    def _namespace_GVF1O(cls, accession):
        return Namespace('http://www.biointerchange.org/gvf1o#')[accession]

    __parent_properties = { Namespace('http://www.biointerchange.org/gvf1o#GVF1_0004') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0010') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0012') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0014') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0015') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0068') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0021') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0023') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0068') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0034') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0036') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0038') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0069') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0041') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0069') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0042') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0070') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0043') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0070') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0046') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0070') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0047') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0070') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0051') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0067') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0053') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0069') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0072') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0075') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0078') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0079') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0075') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0080') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0083') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0075') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0090') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0089') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0091') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0089') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0102') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0112') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0103') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0112') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0104') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0112') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0119') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0102') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0120') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0103') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0121') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0122') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0123') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0124') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0125') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0068') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0126') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0070') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0127') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0075') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0129') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0128') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0130') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0089') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0131') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0069') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0147') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0068') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0148') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0068') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0150') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0068') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0152') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0112') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0155') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0066') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0005') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0006') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0007') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0008') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0009') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0013') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0064') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0022') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0063') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0024') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0063') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0025') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0060') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0026') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0027') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0031') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0032') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0060') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0037') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0065') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0039') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0060') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0044') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0158') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0048') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0061') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0049') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0061') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0050') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0060') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0054') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0060') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0055') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0056') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0060') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0057') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0073') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0071') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0074') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0071') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0076') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0077') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0081') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0063') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0082') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0063') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0093') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0092') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0094') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0092') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0095') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0092') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0096') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0101') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0105') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0113') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0106') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0107') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0107') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0113') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0108') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0107') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0132') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0107') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0133') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0107') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0134') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0107') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0137') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0136') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0138') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0136') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0139') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0136') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0149') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0063') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0154') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0153') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0156') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0059') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0157') : Namespace('http://www.biointerchange.org/gvf1o#GVF1_0136') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0088') : Namespace('http://www.biointerchange.org/gvf1o#http://www.w3.org/2002/07/owl#Thing') , Namespace('http://www.biointerchange.org/gvf1o#GVF1_0151') : Namespace('http://www.biointerchange.org/gvf1o#http://www.w3.org/2002/07/owl#Thing') }


