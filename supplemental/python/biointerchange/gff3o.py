import rdflib

from rdflib import Namespace


class GFF3O:

    @classmethod
    def seqid(cls):
        """Establishes the landmark (cls, e.g. a chromosome) on which a feature is located.
        (GFF3_0004)
        """
        return _namespace_GFF3O('GFF3_0004')

    @classmethod
    def strand(cls):
        """Either:
            Strand of the feature.
            (cls, GFF3_0010)
        Or:
            Strand of a target -- if applicable.
            (GFF3_0045)
        """
        return [ _namespace_GFF3O('GFF3_0010'), _namespace_GFF3O('GFF3_0045') ]

    @classmethod
    def attributes(cls):
        """Tag name/value pair attributes of a feature that are not covered by object-/data-properties of the ontology. Tags that are represented as object-/data-properties are: ID, Name, Alias, Parent, Target, Gap, Derives_from, Dbxref, Ontology_term, Ontology_term, or Is_circular
        (cls, GFF3_0012)
        """
        return _namespace_GFF3O('GFF3_0012')

    @classmethod
    def parent(cls):
        """Link out to the parent feature.
        (cls, GFF3_0014)
        """
        return _namespace_GFF3O('GFF3_0014')

    @classmethod
    def contains(cls):
        """Relationship that describes which features belong to a feature set.
        (cls, GFF3_0015)
        """
        return _namespace_GFF3O('GFF3_0015')

    @classmethod
    def region(cls):
        """Either:
            FALDO "Region" instance replacement for a feature's start, stop, strand properties.
            (cls, GFF3_0021)
        Or:
            FALDO "Region" instance replacement for a target's start, stop, strand  properties.
            (GFF3_0050)
        """
        return [ _namespace_GFF3O('GFF3_0021'), _namespace_GFF3O('GFF3_0050') ]

    @classmethod
    def species(cls):
        """NCBI Taxonomy Ontology "NCBITaxon_1" (cls, or sub-classes) instance that denotes the species for a feature set.
        (GFF3_0023)
        """
        return _namespace_GFF3O('GFF3_0023')

    @classmethod
    def set_properties(cls):
        """Either:
            Properties that are directly associated with Set class instances.
            (cls, GFF3_0025)
        Or:
            Properties that are directly associated with Set class instances.
            (GFF3_0027)
        """
        return [ _namespace_GFF3O('GFF3_0025'), _namespace_GFF3O('GFF3_0027') ]

    @classmethod
    def feature_properties(cls):
        """Either:
            Properties that are directly associated with Feature class instances.
            (cls, GFF3_0026)
        Or:
            Properties that are directly associated with Feature class instances.
            (GFF3_0028)
        """
        return [ _namespace_GFF3O('GFF3_0026'), _namespace_GFF3O('GFF3_0028') ]

    @classmethod
    def target(cls):
        """Identifies the target that the features aligns to.
        (cls, GFF3_0039)
        """
        return _namespace_GFF3O('GFF3_0039')

    @classmethod
    def target_properties(cls):
        """Either:
            Properties that are directly associated with Target class instances.
            (cls, GFF3_0044)
        Or:
            Properties that are directly associated with Target class instances.
            (GFF3_0040)
        """
        return [ _namespace_GFF3O('GFF3_0044'), _namespace_GFF3O('GFF3_0040') ]

    @classmethod
    def derives_from(cls):
        """Describes a temporal relationship between two features, where the object denotes the subjects origin.
        (cls, GFF3_0047)
        """
        return _namespace_GFF3O('GFF3_0047')

    @classmethod
    def feature_ontology(cls):
        """Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
        (cls, GFF3_0056)
        """
        return _namespace_GFF3O('GFF3_0056')

    @classmethod
    def source(cls):
        """A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
        (cls, GFF3_0005)
        """
        return _namespace_GFF3O('GFF3_0005')

    @classmethod
    def type(cls):
        """Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (cls, SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
        (GFF3_0006)
        """
        return _namespace_GFF3O('GFF3_0006')

    @classmethod
    def start(cls):
        """Either:
            Start coordinate of the feature on the seqid landmark.
            (cls, GFF3_0007)
        Or:
            Start coordinate of the target.
            (GFF3_0042)
        Or:
            Genomic start coordinate of the landmark.
            (GFF3_0054)
        """
        return [ _namespace_GFF3O('GFF3_0007'), _namespace_GFF3O('GFF3_0042'), _namespace_GFF3O('GFF3_0054') ]

    @classmethod
    def end(cls):
        """Either:
            End coordinate of the feature on the seqid landmark.
            (cls, GFF3_0008)
        Or:
            End coordinate of the target.
            (GFF3_0043)
        Or:
            Genomic end coordinate of the landmark.
            (GFF3_0055)
        """
        return [ _namespace_GFF3O('GFF3_0008'), _namespace_GFF3O('GFF3_0043'), _namespace_GFF3O('GFF3_0055') ]

    @classmethod
    def score(cls):
        """Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
        (cls, GFF3_0009)
        """
        return _namespace_GFF3O('GFF3_0009')

    @classmethod
    def phase(cls):
        """Phase for "CDS" features. It indicates where the feature begins with reference to the reading frame. For forward strand features, phase is counted from the start field, whilst for reverse strand features, phase is counted from the end field.
        (cls, GFF3_0011)
        """
        return _namespace_GFF3O('GFF3_0011')

    @classmethod
    def tag(cls):
        """Tag name of a feature attribute.
        (cls, GFF3_0013)
        """
        return _namespace_GFF3O('GFF3_0013')

    @classmethod
    def version(cls):
        """Version of the GFF3 specification that defines the feature set contents.
        (cls, GFF3_0022)
        """
        return _namespace_GFF3O('GFF3_0022')

    @classmethod
    def build(cls):
        """Name of a genome assembly build that denotes the provenance of features in a feature set. For example, 'NCBI 36' or 'FlyBase r4.1'.
        (cls, GFF3_0024)
        """
        return _namespace_GFF3O('GFF3_0024')

    @classmethod
    def attribute_properties(cls):
        """Properties that are directly associated with Attribute class instances.
        (cls, GFF3_0029)
        """
        return _namespace_GFF3O('GFF3_0029')

    @classmethod
    def dbxref(cls):
        """A database cross-reference to associate a sequence alteration to its representation in another database.
        (cls, GFF3_0034)
        """
        return _namespace_GFF3O('GFF3_0034')

    @classmethod
    def ontology_term(cls):
        """A cross-reference to an ontology term that is associated with a feature.
        (cls, GFF3_0035)
        """
        return _namespace_GFF3O('GFF3_0035')

    @classmethod
    def name(cls):
        """Name of a feature, which can be used for display purposes. The name is not a unique property among features.
        (cls, GFF3_0036)
        """
        return _namespace_GFF3O('GFF3_0036')

    @classmethod
    def alias(cls):
        """An alternative name for a feature. This can be another descriptive name of a feature, such as a locus name or accession number.
        (cls, GFF3_0037)
        """
        return _namespace_GFF3O('GFF3_0037')

    @classmethod
    def target_id(cls):
        """ID or accession of the target alignment.
        (cls, GFF3_0041)
        """
        return _namespace_GFF3O('GFF3_0041')

    @classmethod
    def gap(cls):
        """Gap describing the feature/target alignment if the sequences are not collinear. The formal description of this property has been lost due to a dead link in the GFF3 specification.
        (cls, GFF3_0046)
        """
        return _namespace_GFF3O('GFF3_0046')

    @classmethod
    def note(cls):
        """A free text note.
        (cls, GFF3_0048)
        """
        return _namespace_GFF3O('GFF3_0048')

    @classmethod
    def is_circular(cls):
        """Describes whether a feature is circular or not.
        (cls, GFF3_0049)
        """
        return _namespace_GFF3O('GFF3_0049')

    @classmethod
    def landmark_properties(cls):
        """Properties that are directly associated with Landmark class instances.
        (cls, GFF3_0052)
        """
        return _namespace_GFF3O('GFF3_0052')

    @classmethod
    def id(cls):
        """ID that uniquely establishes the Landmark's identity within a Set.
        (cls, GFF3_0053)
        """
        return _namespace_GFF3O('GFF3_0053')

    @classmethod
    def sequence(cls):
        """Either:
            Sequence associated with this feature, if it has been specified using a FASTA string.
            (cls, GFF3_0057)
        Or:
            Sequence associated with this feature, if it has been specified using a FASTA string.
            (GFF3_0058)
        """
        return [ _namespace_GFF3O('GFF3_0057'), _namespace_GFF3O('GFF3_0058') ]

    @classmethod
    def Set(cls):
        """Set of genomic sequence features, whose identifiers are unique within the set.
        (cls, GFF3_0001)
        """
        return _namespace_GFF3O('GFF3_0001')

    @classmethod
    def Feature(cls):
        """A genomic sequence feature.
        (cls, GFF3_0002)
        """
        return _namespace_GFF3O('GFF3_0002')

    @classmethod
    def Attribute(cls):
        """Describes additional feature attributes besides ID, Name, Alias, Parent, Target, Gap, Derives_from, Dbxref, Ontology_term, Ontology_term, or Is_circular.
        (cls, GFF3_0003)
        """
        return _namespace_GFF3O('GFF3_0003')

    @classmethod
    def Strand(cls):
        """Class describing a genomic strand. Instances of the class (cls, individuals) are used to denote forward-/reverse-strands, etc.
        (GFF3_0016)
        """
        return _namespace_GFF3O('GFF3_0016')

    @classmethod
    def Target(cls):
        """Indicates a feature's "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
        (cls, GFF3_0038)
        """
        return _namespace_GFF3O('GFF3_0038')

    @classmethod
    def Landmark(cls):
        """A landmark that establishes the coordinate system for features.
        (cls, GFF3_0051)
        """
        return _namespace_GFF3O('GFF3_0051')

    @classmethod
    def Positive(cls):
        """Location on the positive (cls, forward) strand.
        (GFF3_0017)
        """
        return _namespace_GFF3O('GFF3_0017')

    @classmethod
    def Negative(cls):
        """Location on the negative (cls, reverse) strand.
        (GFF3_0018)
        """
        return _namespace_GFF3O('GFF3_0018')

    @classmethod
    def UnknownStrand(cls):
        """Strand was not determined, which leaves it open whether the location is on the positive (cls, forward) or negative (reverse) strand.
        (GFF3_0019)
        """
        return _namespace_GFF3O('GFF3_0019')

    @classmethod
    def NotStranded(cls):
        """Strand is not applicable.
        (cls, GFF3_0020)
        """
        return _namespace_GFF3O('GFF3_0020')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == _namespace_GFF3O('GFF3_0004'):
            return True
        if uri == _namespace_GFF3O('GFF3_0010'):
            return True
        if uri == _namespace_GFF3O('GFF3_0012'):
            return True
        if uri == _namespace_GFF3O('GFF3_0014'):
            return True
        if uri == _namespace_GFF3O('GFF3_0015'):
            return True
        if uri == _namespace_GFF3O('GFF3_0021'):
            return True
        if uri == _namespace_GFF3O('GFF3_0023'):
            return True
        if uri == _namespace_GFF3O('GFF3_0025'):
            return True
        if uri == _namespace_GFF3O('GFF3_0026'):
            return True
        if uri == _namespace_GFF3O('GFF3_0039'):
            return True
        if uri == _namespace_GFF3O('GFF3_0044'):
            return True
        if uri == _namespace_GFF3O('GFF3_0045'):
            return True
        if uri == _namespace_GFF3O('GFF3_0047'):
            return True
        if uri == _namespace_GFF3O('GFF3_0050'):
            return True
        if uri == _namespace_GFF3O('GFF3_0056'):
            return True
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        if uri == _namespace_GFF3O('GFF3_0005'):
            return True
        if uri == _namespace_GFF3O('GFF3_0006'):
            return True
        if uri == _namespace_GFF3O('GFF3_0007'):
            return True
        if uri == _namespace_GFF3O('GFF3_0008'):
            return True
        if uri == _namespace_GFF3O('GFF3_0009'):
            return True
        if uri == _namespace_GFF3O('GFF3_0011'):
            return True
        if uri == _namespace_GFF3O('GFF3_0013'):
            return True
        if uri == _namespace_GFF3O('GFF3_0022'):
            return True
        if uri == _namespace_GFF3O('GFF3_0024'):
            return True
        if uri == _namespace_GFF3O('GFF3_0027'):
            return True
        if uri == _namespace_GFF3O('GFF3_0028'):
            return True
        if uri == _namespace_GFF3O('GFF3_0029'):
            return True
        if uri == _namespace_GFF3O('GFF3_0034'):
            return True
        if uri == _namespace_GFF3O('GFF3_0035'):
            return True
        if uri == _namespace_GFF3O('GFF3_0036'):
            return True
        if uri == _namespace_GFF3O('GFF3_0037'):
            return True
        if uri == _namespace_GFF3O('GFF3_0040'):
            return True
        if uri == _namespace_GFF3O('GFF3_0041'):
            return True
        if uri == _namespace_GFF3O('GFF3_0042'):
            return True
        if uri == _namespace_GFF3O('GFF3_0043'):
            return True
        if uri == _namespace_GFF3O('GFF3_0046'):
            return True
        if uri == _namespace_GFF3O('GFF3_0048'):
            return True
        if uri == _namespace_GFF3O('GFF3_0049'):
            return True
        if uri == _namespace_GFF3O('GFF3_0052'):
            return True
        if uri == _namespace_GFF3O('GFF3_0053'):
            return True
        if uri == _namespace_GFF3O('GFF3_0054'):
            return True
        if uri == _namespace_GFF3O('GFF3_0055'):
            return True
        if uri == _namespace_GFF3O('GFF3_0057'):
            return True
        if uri == _namespace_GFF3O('GFF3_0058'):
            return True
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == _namespace_GFF3O('GFF3_0001'):
            return True
        if uri == _namespace_GFF3O('GFF3_0002'):
            return True
        if uri == _namespace_GFF3O('GFF3_0003'):
            return True
        if uri == _namespace_GFF3O('GFF3_0016'):
            return True
        if uri == _namespace_GFF3O('GFF3_0038'):
            return True
        if uri == _namespace_GFF3O('GFF3_0051'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
        if uri == _namespace_GFF3O('GFF3_0017'):
            return True
        if uri == _namespace_GFF3O('GFF3_0018'):
            return True
        if uri == _namespace_GFF3O('GFF3_0019'):
            return True
        if uri == _namespace_GFF3O('GFF3_0020'):
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

__namespace_GFF3O = Namespace('http://www.biointerchange.org/gff3o#')

def _namespace_GFF3O(accession):
    return __namespace_GFF3O[accession]

    __parent_properties = { _namespace_GFF3O('GFF3_0004') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0010') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0012') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0014') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0015') : _namespace_GFF3O('GFF3_0025') , _namespace_GFF3O('GFF3_0021') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0023') : _namespace_GFF3O('GFF3_0025') , _namespace_GFF3O('GFF3_0039') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0045') : _namespace_GFF3O('GFF3_0044') , _namespace_GFF3O('GFF3_0047') : _namespace_GFF3O('GFF3_0026') , _namespace_GFF3O('GFF3_0050') : _namespace_GFF3O('GFF3_0044') , _namespace_GFF3O('GFF3_0056') : _namespace_GFF3O('GFF3_0025') , _namespace_GFF3O('GFF3_0005') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0006') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0007') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0008') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0009') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0011') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0013') : _namespace_GFF3O('GFF3_0029') , _namespace_GFF3O('GFF3_0022') : _namespace_GFF3O('GFF3_0027') , _namespace_GFF3O('GFF3_0024') : _namespace_GFF3O('GFF3_0027') , _namespace_GFF3O('GFF3_0034') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0035') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0036') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0037') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0041') : _namespace_GFF3O('GFF3_0040') , _namespace_GFF3O('GFF3_0042') : _namespace_GFF3O('GFF3_0040') , _namespace_GFF3O('GFF3_0043') : _namespace_GFF3O('GFF3_0040') , _namespace_GFF3O('GFF3_0046') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0048') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0049') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0053') : _namespace_GFF3O('GFF3_0052') , _namespace_GFF3O('GFF3_0054') : _namespace_GFF3O('GFF3_0052') , _namespace_GFF3O('GFF3_0055') : _namespace_GFF3O('GFF3_0052') , _namespace_GFF3O('GFF3_0057') : _namespace_GFF3O('GFF3_0028') , _namespace_GFF3O('GFF3_0058') : _namespace_GFF3O('GFF3_0052') }


