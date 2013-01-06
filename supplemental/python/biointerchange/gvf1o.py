import rdflib

from rdflib import Namespace

__namespace_GVF1O = Namespace('http://www.biointerchange.org/gvf1o#')

def _namespace_GVF1O(accession):
    return __namespace_GVF1O[accession]

class GVF1O:

    @classmethod
    def strand(cls):
        """Either:
            Strand of the feature.
            (cls, GVF1_0010)
        Or:
            Strand of the breakpoint.
            (GVF1_0083)
        Or:
            Strand of a target -- if applicable.
            (GVF1_0091)
        """
        return [ _namespace_GVF1O('GVF1_0010'), _namespace_GVF1O('GVF1_0083'), _namespace_GVF1O('GVF1_0091') ]

    @classmethod
    def attributes(cls):
        """Tag name/value pair attributes of a feature.
        (cls, GVF1_0012)
        """
        return _namespace_GVF1O('GVF1_0012')

    @classmethod
    def parent(cls):
        """Link out to the parent feature.
        (cls, GVF1_0014)
        """
        return _namespace_GVF1O('GVF1_0014')

    @classmethod
    def contains(cls):
        """Relationship that describes which features belong to a feature set.
        (cls, GVF1_0015)
        """
        return _namespace_GVF1O('GVF1_0015')

    @classmethod
    def region(cls):
        """Either:
            FALDO "Region" instance replacement for a feature's start, stop, strand properties.
            (cls, GVF1_0021)
        Or:
            FALDO "Region" instance replacement for a breakpoint's start, stop, strand properties.
            (GVF1_0079)
        Or:
            FALDO "Region" instance replacement for a target's start, stop, strand  properties.
            (GVF1_0090)
        """
        return [ _namespace_GVF1O('GVF1_0021'), _namespace_GVF1O('GVF1_0079'), _namespace_GVF1O('GVF1_0090') ]

    @classmethod
    def species(cls):
        """NCBI Taxonomy Ontology "NCBITaxon_1" (cls, or sub-classes) instance that denotes the species for a feature set.
        (GVF1_0023)
        """
        return _namespace_GVF1O('GVF1_0023')

    @classmethod
    def variant(cls):
        """Specific information about the variant(cls, s) of a feature.
        (GVF1_0034)
        """
        return _namespace_GVF1O('GVF1_0034')

    @classmethod
    def individual(cls):
        """Links to information about an individual.
        (cls, GVF1_0036)
        """
        return _namespace_GVF1O('GVF1_0036')

    @classmethod
    def zygosity(cls):
        """Zygosity of a variant.
        (cls, GVF1_0038)
        """
        return _namespace_GVF1O('GVF1_0038')

    @classmethod
    def effect(cls):
        """An effect of a particular feature variant.
        (cls, GVF1_0041)
        """
        return _namespace_GVF1O('GVF1_0041')

    @classmethod
    def sequence_variant(cls):
        """Effect of a sequence alteration on a sequence feature.
        (cls, GVF1_0042)
        """
        return _namespace_GVF1O('GVF1_0042')

    @classmethod
    def feature_type(cls):
        """A term that is describing the sequence feature that is being affected.
        (cls, GVF1_0043)
        """
        return _namespace_GVF1O('GVF1_0043')

    @classmethod
    def feature_id(cls):
        """Features that are affected by this sequence alteration effect.
        (cls, GVF1_0044)
        """
        return _namespace_GVF1O('GVF1_0044')

    @classmethod
    def start_range(cls):
        """A coordinate range for ambiguous start coordinates.
        (cls, GVF1_0046)
        """
        return _namespace_GVF1O('GVF1_0046')

    @classmethod
    def end_range(cls):
        """A coordinate range for ambiguous start coordinates.
        (cls, GVF1_0047)
        """
        return _namespace_GVF1O('GVF1_0047')

    @classmethod
    def chromosome(cls):
        """Denotes abstract chromosome representations for capturing variants that appear on the same chromosome of a polyploid organism.
        (cls, GVF1_0051)
        """
        return _namespace_GVF1O('GVF1_0051')

    @classmethod
    def genotype(cls):
        """Determines the genotype as observed in an individual.
        (cls, GVF1_0053)
        """
        return _namespace_GVF1O('GVF1_0053')

    @classmethod
    def feature_properties(cls):
        """Either:
            Properties that are directly associated with Feature class instances.
            (cls, GVF1_0066)
        Or:
            Properties that are directly associated with Feature class instances.
            (GVF1_0059)
        """
        return [ _namespace_GVF1O('GVF1_0066'), _namespace_GVF1O('GVF1_0059') ]

    @classmethod
    def sequencedindividual_properties(cls):
        """Either:
            Properties that are directly associated with SequencedIndividual class instances.
            (cls, GVF1_0067)
        Or:
            Properties that are directly associated with SequencedIndividual class instances.
            (GVF1_0065)
        """
        return [ _namespace_GVF1O('GVF1_0067'), _namespace_GVF1O('GVF1_0065') ]

    @classmethod
    def set_properties(cls):
        """Either:
            Properties that are directly associated with Set class instances.
            (cls, GVF1_0068)
        Or:
            Properties that are directly associated with Set class instances.
            (GVF1_0063)
        """
        return [ _namespace_GVF1O('GVF1_0068'), _namespace_GVF1O('GVF1_0063') ]

    @classmethod
    def variant_properties(cls):
        """Either:
            Properties that are directly associated with Variant class instances.
            (cls, GVF1_0069)
        Or:
            Properties that are directly associated with Variant class instances.
            (GVF1_0060)
        """
        return [ _namespace_GVF1O('GVF1_0069'), _namespace_GVF1O('GVF1_0060') ]

    @classmethod
    def effect_properties(cls):
        """Properties that are directly associated with Effect class instances.
        (cls, GVF1_0070)
        """
        return _namespace_GVF1O('GVF1_0070')

    @classmethod
    def breakpoint_properties(cls):
        """Either:
            Properties that are directly associated with Breakpoint class instances.
            (cls, GVF1_0075)
        Or:
            Properties that are directly associated with Breakpoint class instances.
            (GVF1_0071)
        """
        return [ _namespace_GVF1O('GVF1_0075'), _namespace_GVF1O('GVF1_0071') ]

    @classmethod
    def dbxref(cls):
        """A database cross-reference to associate a sequence alteration to its  representation in another database.
        (cls, GVF1_0078)
        """
        return _namespace_GVF1O('GVF1_0078')

    @classmethod
    def breakpoint(cls):
        """Potential source or destination of zero-length sequence alterations.
        (cls, GVF1_0080)
        """
        return _namespace_GVF1O('GVF1_0080')

    @classmethod
    def target_properties(cls):
        """Either:
            Properties that are directly associated with Target class instances.
            (cls, GVF1_0089)
        Or:
            Properties that are directly associated with Target class instances.
            (GVF1_0092)
        """
        return [ _namespace_GVF1O('GVF1_0089'), _namespace_GVF1O('GVF1_0092') ]

    @classmethod
    def seqid(cls):
        """Either:
            ID of the landmark that establishes the coordinate system for a feature.
            (cls, GVF1_0004)
        Or:
            ID of the landmark that establishes the coordinate system for a breakpoint.
            (GVF1_0072)
        """
        return [ _namespace_GVF1O('GVF1_0004'), _namespace_GVF1O('GVF1_0072') ]

    @classmethod
    def source(cls):
        """A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
        (cls, GVF1_0005)
        """
        return _namespace_GVF1O('GVF1_0005')

    @classmethod
    def type(cls):
        """Type of the feature, which is either a term from the "lite" version of the Sequence Ontology (cls, SOFA), a term from the full Sequence Ontology (SO) that is a child of sequence_feature (SO:0000110), or a SOFA or SO accession number.
        (GVF1_0006)
        """
        return _namespace_GVF1O('GVF1_0006')

    @classmethod
    def start(cls):
        """Either:
            Start coordinate of the feature on the seqid landmark.
            (cls, GVF1_0007)
        Or:
            A coordinate that defines the start of an ambiguous coordinate range.
            (GVF1_0048)
        Or:
            Start coordinate of the feature on the seqid landmark.
            (GVF1_0073)
        Or:
            Start coordinate of the target.
            (GVF1_0094)
        """
        return [ _namespace_GVF1O('GVF1_0007'), _namespace_GVF1O('GVF1_0048'), _namespace_GVF1O('GVF1_0073'), _namespace_GVF1O('GVF1_0094') ]

    @classmethod
    def end(cls):
        """Either:
            End coordinate of the feature on the seqid landmark.
            (cls, GVF1_0008)
        Or:
            A coordinate that defines the end of an ambiguous coordinate range.
            (GVF1_0049)
        Or:
            End coordinate of the feature on the seqid landmark.
            (GVF1_0074)
        Or:
            End coordinate of the target.
            (GVF1_0095)
        """
        return [ _namespace_GVF1O('GVF1_0008'), _namespace_GVF1O('GVF1_0049'), _namespace_GVF1O('GVF1_0074'), _namespace_GVF1O('GVF1_0095') ]

    @classmethod
    def score(cls):
        """Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
        (cls, GVF1_0009)
        """
        return _namespace_GVF1O('GVF1_0009')

    @classmethod
    def tag(cls):
        """Tag name of a feature attribute.
        (cls, GVF1_0013)
        """
        return _namespace_GVF1O('GVF1_0013')

    @classmethod
    def gvf_version(cls):
        """Version of the GVF specification that defines the feature set contents.
        (cls, GVF1_0022)
        """
        return _namespace_GVF1O('GVF1_0022')

    @classmethod
    def build(cls):
        """Name of a genome assembly build that denotes the provenance of features in a feature set. For example, 'NCBI 36' or 'FlyBase r4.1'.
        (cls, GVF1_0024)
        """
        return _namespace_GVF1O('GVF1_0024')

    @classmethod
    def variant_seq(cls):
        """All sequence variations at a locus -- including the reference sequence when appropriate (cls, for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
        (GVF1_0025)
        """
        return _namespace_GVF1O('GVF1_0025')

    @classmethod
    def id(cls):
        """A unique identifier for the feature within the feature set.
        (cls, GVF1_0026)
        """
        return _namespace_GVF1O('GVF1_0026')

    @classmethod
    def alias(cls):
        """Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (cls, e.g. dbSNP, OMIM) which should use the dbxref property.
        (GVF1_0027)
        """
        return _namespace_GVF1O('GVF1_0027')

    @classmethod
    def name(cls):
        """Name of an external database. For example, "dbSNP" or "OMIM".
        (cls, GVF1_0029)
        """
        return _namespace_GVF1O('GVF1_0029')

    @classmethod
    def xref(cls):
        """External database identifier. For example, for dbSNP, this identifier could be "rs3131969".
        (cls, GVF1_0030)
        """
        return _namespace_GVF1O('GVF1_0030')

    @classmethod
    def reference_seq(cls):
        """Sequence from the reference genome.
        (cls, GVF1_0031)
        """
        return _namespace_GVF1O('GVF1_0031')

    @classmethod
    def variant_reads(cls):
        """Number of reads that are supporting this variant.
        (cls, GVF1_0032)
        """
        return _namespace_GVF1O('GVF1_0032')

    @classmethod
    def total_reads(cls):
        """Total number of reads.
        (cls, GVF1_0037)
        """
        return _namespace_GVF1O('GVF1_0037')

    @classmethod
    def variant_freq(cls):
        """Frequency of a variant in a population.
        (cls, GVF1_0039)
        """
        return _namespace_GVF1O('GVF1_0039')

    @classmethod
    def phased(cls):
        """Unclear from GVF specification.
        (cls, GVF1_0050)
        """
        return _namespace_GVF1O('GVF1_0050')

    @classmethod
    def variant_codon(cls):
        """Describes the codon that overlaps this variant.
        (cls, GVF1_0054)
        """
        return _namespace_GVF1O('GVF1_0054')

    @classmethod
    def reference_codon(cls):
        """Describes the codon from the reference sequence whose coordinates overlap with this variant.
        (cls, GVF1_0055)
        """
        return _namespace_GVF1O('GVF1_0055')

    @classmethod
    def variant_aa(cls):
        """Amino acid that overlaps with the variant.
        (cls, GVF1_0056)
        """
        return _namespace_GVF1O('GVF1_0056')

    @classmethod
    def reference_aa(cls):
        """Amino acid in the reference genome that overlaps with a variant's genome coordinates.
        (cls, GVF1_0057)
        """
        return _namespace_GVF1O('GVF1_0057')

    @classmethod
    def range_properties(cls):
        """Properties that are directly associated with Range class instances.
        (cls, GVF1_0061)
        """
        return _namespace_GVF1O('GVF1_0061')

    @classmethod
    def dbxref_properties(cls):
        """Properties that are directly associated with DBXRef class instances.
        (cls, GVF1_0062)
        """
        return _namespace_GVF1O('GVF1_0062')

    @classmethod
    def attribute_properties(cls):
        """Properties that are directly associated with Attribute class instances.
        (cls, GVF1_0064)
        """
        return _namespace_GVF1O('GVF1_0064')

    @classmethod
    def a_context(cls):
        """Sequence context (cls, positive strand) of a feature on the 5' end.
        (GVF1_0076)
        """
        return _namespace_GVF1O('GVF1_0076')

    @classmethod
    def gff_version(cls):
        """Version of the GFF specification that defines the feature set contents apart from GVF related definitions.
        (cls, GVF1_0081)
        """
        return _namespace_GVF1O('GVF1_0081')

    @classmethod
    def file_date(cls):
        """Creation date of the GVF file that this set stems from.
        (cls, GVF1_0082)
        """
        return _namespace_GVF1O('GVF1_0082')

    @classmethod
    def target_id(cls):
        """ID or accession of the target alignment.
        (cls, GVF1_0093)
        """
        return _namespace_GVF1O('GVF1_0093')

    @classmethod
    def Set(cls):
        """Set of genomic sequence features, whose identifiers are unique within the set.
        (cls, GVF1_0001)
        """
        return _namespace_GVF1O('GVF1_0001')

    @classmethod
    def Feature(cls):
        """A genomic sequence feature.
        (cls, GVF1_0002)
        """
        return _namespace_GVF1O('GVF1_0002')

    @classmethod
    def Attribute(cls):
        return _namespace_GVF1O('GVF1_0003')

    @classmethod
    def Strand(cls):
        """Class describing a genomic strand. Instances of the class (cls, individuals) are used to denote forward-/reverse-strands, etc.
        (GVF1_0016)
        """
        return _namespace_GVF1O('GVF1_0016')

    @classmethod
    def DBXRef(cls):
        """A class describing relationships between features and external databases.
        (cls, GVF1_0028)
        """
        return _namespace_GVF1O('GVF1_0028')

    @classmethod
    def Variant(cls):
        """Describing specific alterations of a feature.
        (cls, GVF1_0033)
        """
        return _namespace_GVF1O('GVF1_0033')

    @classmethod
    def SequencedIndividual(cls):
        """Aggregated sequencing information for a particular individual.
        (cls, GVF1_0035)
        """
        return _namespace_GVF1O('GVF1_0035')

    @classmethod
    def Effect(cls):
        """Describing the effect of a feature variant.
        (cls, GVF1_0040)
        """
        return _namespace_GVF1O('GVF1_0040')

    @classmethod
    def Range(cls):
        """Describe ambiguity in either start or end coordinates.
        (cls, GVF1_0045)
        """
        return _namespace_GVF1O('GVF1_0045')

    @classmethod
    def Chromosome(cls):
        """An abstract representation of a chromosome to represent ploidy.
        (cls, GVF1_0052)
        """
        return _namespace_GVF1O('GVF1_0052')

    @classmethod
    def Breakpoint(cls):
        """Describes the source or destination of a zero-length sequence alteration.
        (cls, GVF1_0058)
        """
        return _namespace_GVF1O('GVF1_0058')

    @classmethod
    def Zygosity(cls):
        """Denotes the zygosity of alleles.
        (cls, GVF1_0084)
        """
        return _namespace_GVF1O('GVF1_0084')

    @classmethod
    def Target(cls):
        """Indicates a feature's "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
        (cls, GVF1_0088)
        """
        return _namespace_GVF1O('GVF1_0088')

    @classmethod
    def Positive(cls):
        """Location on the positive (cls, forward) strand.
        (GVF1_0017)
        """
        return _namespace_GVF1O('GVF1_0017')

    @classmethod
    def Negative(cls):
        """Location on the negative (cls, reverse) strand.
        (GVF1_0018)
        """
        return _namespace_GVF1O('GVF1_0018')

    @classmethod
    def UnknownStrand(cls):
        """Strand was not determined, which leaves it open whether the location is on the positive (cls, forward) or negative (reverse) strand.
        (GVF1_0019)
        """
        return _namespace_GVF1O('GVF1_0019')

    @classmethod
    def NotStranded(cls):
        """Strand is not applicable.
        (cls, GVF1_0020)
        """
        return _namespace_GVF1O('GVF1_0020')

    @classmethod
    def Heterozygous(cls):
        """Denotes heterozygous alleles.
        (cls, GVF1_0085)
        """
        return _namespace_GVF1O('GVF1_0085')

    @classmethod
    def Homozygous(cls):
        """Denotes homozygous alleles.
        (cls, GVF1_0086)
        """
        return _namespace_GVF1O('GVF1_0086')

    @classmethod
    def Hemizygous(cls):
        """Denotes hemizygous alleles.
        (cls, GVF1_0087)
        """
        return _namespace_GVF1O('GVF1_0087')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == _namespace_GVF1O('GVF1_0010'):
            return True
        if uri == _namespace_GVF1O('GVF1_0012'):
            return True
        if uri == _namespace_GVF1O('GVF1_0014'):
            return True
        if uri == _namespace_GVF1O('GVF1_0015'):
            return True
        if uri == _namespace_GVF1O('GVF1_0021'):
            return True
        if uri == _namespace_GVF1O('GVF1_0023'):
            return True
        if uri == _namespace_GVF1O('GVF1_0034'):
            return True
        if uri == _namespace_GVF1O('GVF1_0036'):
            return True
        if uri == _namespace_GVF1O('GVF1_0038'):
            return True
        if uri == _namespace_GVF1O('GVF1_0041'):
            return True
        if uri == _namespace_GVF1O('GVF1_0042'):
            return True
        if uri == _namespace_GVF1O('GVF1_0043'):
            return True
        if uri == _namespace_GVF1O('GVF1_0044'):
            return True
        if uri == _namespace_GVF1O('GVF1_0046'):
            return True
        if uri == _namespace_GVF1O('GVF1_0047'):
            return True
        if uri == _namespace_GVF1O('GVF1_0051'):
            return True
        if uri == _namespace_GVF1O('GVF1_0053'):
            return True
        if uri == _namespace_GVF1O('GVF1_0066'):
            return True
        if uri == _namespace_GVF1O('GVF1_0067'):
            return True
        if uri == _namespace_GVF1O('GVF1_0068'):
            return True
        if uri == _namespace_GVF1O('GVF1_0069'):
            return True
        if uri == _namespace_GVF1O('GVF1_0070'):
            return True
        if uri == _namespace_GVF1O('GVF1_0075'):
            return True
        if uri == _namespace_GVF1O('GVF1_0078'):
            return True
        if uri == _namespace_GVF1O('GVF1_0079'):
            return True
        if uri == _namespace_GVF1O('GVF1_0080'):
            return True
        if uri == _namespace_GVF1O('GVF1_0083'):
            return True
        if uri == _namespace_GVF1O('GVF1_0089'):
            return True
        if uri == _namespace_GVF1O('GVF1_0090'):
            return True
        if uri == _namespace_GVF1O('GVF1_0091'):
            return True
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        if uri == _namespace_GVF1O('GVF1_0004'):
            return True
        if uri == _namespace_GVF1O('GVF1_0005'):
            return True
        if uri == _namespace_GVF1O('GVF1_0006'):
            return True
        if uri == _namespace_GVF1O('GVF1_0007'):
            return True
        if uri == _namespace_GVF1O('GVF1_0008'):
            return True
        if uri == _namespace_GVF1O('GVF1_0009'):
            return True
        if uri == _namespace_GVF1O('GVF1_0013'):
            return True
        if uri == _namespace_GVF1O('GVF1_0022'):
            return True
        if uri == _namespace_GVF1O('GVF1_0024'):
            return True
        if uri == _namespace_GVF1O('GVF1_0025'):
            return True
        if uri == _namespace_GVF1O('GVF1_0026'):
            return True
        if uri == _namespace_GVF1O('GVF1_0027'):
            return True
        if uri == _namespace_GVF1O('GVF1_0029'):
            return True
        if uri == _namespace_GVF1O('GVF1_0030'):
            return True
        if uri == _namespace_GVF1O('GVF1_0031'):
            return True
        if uri == _namespace_GVF1O('GVF1_0032'):
            return True
        if uri == _namespace_GVF1O('GVF1_0037'):
            return True
        if uri == _namespace_GVF1O('GVF1_0039'):
            return True
        if uri == _namespace_GVF1O('GVF1_0048'):
            return True
        if uri == _namespace_GVF1O('GVF1_0049'):
            return True
        if uri == _namespace_GVF1O('GVF1_0050'):
            return True
        if uri == _namespace_GVF1O('GVF1_0054'):
            return True
        if uri == _namespace_GVF1O('GVF1_0055'):
            return True
        if uri == _namespace_GVF1O('GVF1_0056'):
            return True
        if uri == _namespace_GVF1O('GVF1_0057'):
            return True
        if uri == _namespace_GVF1O('GVF1_0059'):
            return True
        if uri == _namespace_GVF1O('GVF1_0060'):
            return True
        if uri == _namespace_GVF1O('GVF1_0061'):
            return True
        if uri == _namespace_GVF1O('GVF1_0062'):
            return True
        if uri == _namespace_GVF1O('GVF1_0063'):
            return True
        if uri == _namespace_GVF1O('GVF1_0064'):
            return True
        if uri == _namespace_GVF1O('GVF1_0065'):
            return True
        if uri == _namespace_GVF1O('GVF1_0071'):
            return True
        if uri == _namespace_GVF1O('GVF1_0072'):
            return True
        if uri == _namespace_GVF1O('GVF1_0073'):
            return True
        if uri == _namespace_GVF1O('GVF1_0074'):
            return True
        if uri == _namespace_GVF1O('GVF1_0076'):
            return True
        if uri == _namespace_GVF1O('GVF1_0077'):
            return True
        if uri == _namespace_GVF1O('GVF1_0081'):
            return True
        if uri == _namespace_GVF1O('GVF1_0082'):
            return True
        if uri == _namespace_GVF1O('GVF1_0092'):
            return True
        if uri == _namespace_GVF1O('GVF1_0093'):
            return True
        if uri == _namespace_GVF1O('GVF1_0094'):
            return True
        if uri == _namespace_GVF1O('GVF1_0095'):
            return True
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == _namespace_GVF1O('GVF1_0001'):
            return True
        if uri == _namespace_GVF1O('GVF1_0002'):
            return True
        if uri == _namespace_GVF1O('GVF1_0003'):
            return True
        if uri == _namespace_GVF1O('GVF1_0016'):
            return True
        if uri == _namespace_GVF1O('GVF1_0028'):
            return True
        if uri == _namespace_GVF1O('GVF1_0033'):
            return True
        if uri == _namespace_GVF1O('GVF1_0035'):
            return True
        if uri == _namespace_GVF1O('GVF1_0040'):
            return True
        if uri == _namespace_GVF1O('GVF1_0045'):
            return True
        if uri == _namespace_GVF1O('GVF1_0052'):
            return True
        if uri == _namespace_GVF1O('GVF1_0058'):
            return True
        if uri == _namespace_GVF1O('GVF1_0084'):
            return True
        if uri == _namespace_GVF1O('GVF1_0088'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
        if uri == _namespace_GVF1O('GVF1_0017'):
            return True
        if uri == _namespace_GVF1O('GVF1_0018'):
            return True
        if uri == _namespace_GVF1O('GVF1_0019'):
            return True
        if uri == _namespace_GVF1O('GVF1_0020'):
            return True
        if uri == _namespace_GVF1O('GVF1_0085'):
            return True
        if uri == _namespace_GVF1O('GVF1_0086'):
            return True
        if uri == _namespace_GVF1O('GVF1_0087'):
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

    __parent_properties = { _namespace_GVF1O('GVF1_0010') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0012') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0014') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0015') : _namespace_GVF1O('GVF1_0068') , _namespace_GVF1O('GVF1_0021') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0023') : _namespace_GVF1O('GVF1_0068') , _namespace_GVF1O('GVF1_0034') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0036') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0038') : _namespace_GVF1O('GVF1_0069') , _namespace_GVF1O('GVF1_0041') : _namespace_GVF1O('GVF1_0069') , _namespace_GVF1O('GVF1_0042') : _namespace_GVF1O('GVF1_0070') , _namespace_GVF1O('GVF1_0043') : _namespace_GVF1O('GVF1_0070') , _namespace_GVF1O('GVF1_0044') : _namespace_GVF1O('GVF1_0070') , _namespace_GVF1O('GVF1_0046') : _namespace_GVF1O('GVF1_0070') , _namespace_GVF1O('GVF1_0047') : _namespace_GVF1O('GVF1_0070') , _namespace_GVF1O('GVF1_0051') : _namespace_GVF1O('GVF1_0067') , _namespace_GVF1O('GVF1_0053') : _namespace_GVF1O('GVF1_0069') , _namespace_GVF1O('GVF1_0078') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0079') : _namespace_GVF1O('GVF1_0075') , _namespace_GVF1O('GVF1_0080') : _namespace_GVF1O('GVF1_0066') , _namespace_GVF1O('GVF1_0083') : _namespace_GVF1O('GVF1_0075') , _namespace_GVF1O('GVF1_0090') : _namespace_GVF1O('GVF1_0089') , _namespace_GVF1O('GVF1_0091') : _namespace_GVF1O('GVF1_0089') , _namespace_GVF1O('GVF1_0004') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0005') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0006') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0007') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0008') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0009') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0013') : _namespace_GVF1O('GVF1_0064') , _namespace_GVF1O('GVF1_0022') : _namespace_GVF1O('GVF1_0063') , _namespace_GVF1O('GVF1_0024') : _namespace_GVF1O('GVF1_0063') , _namespace_GVF1O('GVF1_0025') : _namespace_GVF1O('GVF1_0060') , _namespace_GVF1O('GVF1_0026') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0027') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0029') : _namespace_GVF1O('GVF1_0062') , _namespace_GVF1O('GVF1_0030') : _namespace_GVF1O('GVF1_0062') , _namespace_GVF1O('GVF1_0031') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0032') : _namespace_GVF1O('GVF1_0060') , _namespace_GVF1O('GVF1_0037') : _namespace_GVF1O('GVF1_0065') , _namespace_GVF1O('GVF1_0039') : _namespace_GVF1O('GVF1_0060') , _namespace_GVF1O('GVF1_0048') : _namespace_GVF1O('GVF1_0061') , _namespace_GVF1O('GVF1_0049') : _namespace_GVF1O('GVF1_0061') , _namespace_GVF1O('GVF1_0050') : _namespace_GVF1O('GVF1_0060') , _namespace_GVF1O('GVF1_0054') : _namespace_GVF1O('GVF1_0060') , _namespace_GVF1O('GVF1_0055') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0056') : _namespace_GVF1O('GVF1_0060') , _namespace_GVF1O('GVF1_0057') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0072') : _namespace_GVF1O('GVF1_0071') , _namespace_GVF1O('GVF1_0073') : _namespace_GVF1O('GVF1_0071') , _namespace_GVF1O('GVF1_0074') : _namespace_GVF1O('GVF1_0071') , _namespace_GVF1O('GVF1_0076') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0077') : _namespace_GVF1O('GVF1_0059') , _namespace_GVF1O('GVF1_0081') : _namespace_GVF1O('GVF1_0063') , _namespace_GVF1O('GVF1_0082') : _namespace_GVF1O('GVF1_0063') , _namespace_GVF1O('GVF1_0093') : _namespace_GVF1O('GVF1_0092') , _namespace_GVF1O('GVF1_0094') : _namespace_GVF1O('GVF1_0092') , _namespace_GVF1O('GVF1_0095') : _namespace_GVF1O('GVF1_0092') , _namespace_GVF1O('GVF1_0088') : _namespace_GVF1O('http://www.w3.org/2002/07/owl#Thing') }

