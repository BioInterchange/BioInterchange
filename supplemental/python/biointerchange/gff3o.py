import rdflib

from rdflib import Namespace


class GFF3O:

    @classmethod
    def seqid(cls):
        """Establishes the landmark (cls, e.g. a chromosome) on which a feature is located.
        (http://www.biointerchange.org/gff3o#GFF3_0004)
        """
        return cls._namespace_GFF3O('GFF3_0004')

    @classmethod
    def strand(cls):
        """Either:
            Strand of the feature.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0010)
        Or:
            Strand of a target -- if applicable.
            (http://www.biointerchange.org/gff3o#GFF3_0045)
        """
        return [ cls._namespace_GFF3O('GFF3_0010'), cls._namespace_GFF3O('GFF3_0045') ]

    @classmethod
    def attributes(cls):
        """Tag name/value pair attributes of a feature that are not covered by object-/data-properties of the ontology. Tags that are represented as object-/data-properties are: ID, Name, Alias, Parent, Target, Gap, Derives_from, Dbxref, Ontology_term, Ontology_term, or Is_circular
        (cls, http://www.biointerchange.org/gff3o#GFF3_0012)
        """
        return cls._namespace_GFF3O('GFF3_0012')

    @classmethod
    def parent(cls):
        """Link out to the parent feature.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0014)
        """
        return cls._namespace_GFF3O('GFF3_0014')

    @classmethod
    def contains(cls):
        """Relationship that describes which features belong to a feature set.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0015)
        """
        return cls._namespace_GFF3O('GFF3_0015')

    @classmethod
    def region(cls):
        """Either:
            FALDO "Region" instance replacement for a feature's start, stop, strand properties.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0021)
        Or:
            FALDO "Region" instance replacement for a target's start, stop, strand  properties.
            (http://www.biointerchange.org/gff3o#GFF3_0050)
        """
        return [ cls._namespace_GFF3O('GFF3_0021'), cls._namespace_GFF3O('GFF3_0050') ]

    @classmethod
    def species(cls):
        """NCBI Taxonomy Ontology "NCBITaxon_1" (cls, or sub-classes) instance that denotes the species for a feature set.
        (http://www.biointerchange.org/gff3o#GFF3_0023)
        """
        return cls._namespace_GFF3O('GFF3_0023')

    @classmethod
    def set_properties(cls):
        """Either:
            Properties that are directly associated with Set class instances.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0025)
        Or:
            Properties that are directly associated with Set class instances.
            (http://www.biointerchange.org/gff3o#GFF3_0027)
        """
        return [ cls._namespace_GFF3O('GFF3_0025'), cls._namespace_GFF3O('GFF3_0027') ]

    @classmethod
    def feature_properties(cls):
        """Either:
            Properties that are directly associated with Feature class instances.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0026)
        Or:
            Properties that are directly associated with Feature class instances.
            (http://www.biointerchange.org/gff3o#GFF3_0028)
        """
        return [ cls._namespace_GFF3O('GFF3_0026'), cls._namespace_GFF3O('GFF3_0028') ]

    @classmethod
    def target(cls):
        """Identifies the target that the features aligns to.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0039)
        """
        return cls._namespace_GFF3O('GFF3_0039')

    @classmethod
    def target_properties(cls):
        """Either:
            Properties that are directly associated with Target class instances.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0044)
        Or:
            Properties that are directly associated with Target class instances.
            (http://www.biointerchange.org/gff3o#GFF3_0040)
        """
        return [ cls._namespace_GFF3O('GFF3_0044'), cls._namespace_GFF3O('GFF3_0040') ]

    @classmethod
    def derives_from(cls):
        """Describes a temporal relationship between two features, where the object denotes the subjects origin.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0047)
        """
        return cls._namespace_GFF3O('GFF3_0047')

    @classmethod
    def feature_ontology(cls):
        """Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0056)
        """
        return cls._namespace_GFF3O('GFF3_0056')

    @classmethod
    def source(cls):
        """A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0005)
        """
        return cls._namespace_GFF3O('GFF3_0005')

    @classmethod
    def type(cls):
        """Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (cls, SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
        (http://www.biointerchange.org/gff3o#GFF3_0006)
        """
        return cls._namespace_GFF3O('GFF3_0006')

    @classmethod
    def start(cls):
        """Either:
            Start coordinate of the feature on the seqid landmark.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0007)
        Or:
            Start coordinate of the target.
            (http://www.biointerchange.org/gff3o#GFF3_0042)
        Or:
            Genomic start coordinate of the landmark.
            (http://www.biointerchange.org/gff3o#GFF3_0054)
        """
        return [ cls._namespace_GFF3O('GFF3_0007'), cls._namespace_GFF3O('GFF3_0042'), cls._namespace_GFF3O('GFF3_0054') ]

    @classmethod
    def end(cls):
        """Either:
            End coordinate of the feature on the seqid landmark.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0008)
        Or:
            End coordinate of the target.
            (http://www.biointerchange.org/gff3o#GFF3_0043)
        Or:
            Genomic end coordinate of the landmark.
            (http://www.biointerchange.org/gff3o#GFF3_0055)
        """
        return [ cls._namespace_GFF3O('GFF3_0008'), cls._namespace_GFF3O('GFF3_0043'), cls._namespace_GFF3O('GFF3_0055') ]

    @classmethod
    def score(cls):
        """Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0009)
        """
        return cls._namespace_GFF3O('GFF3_0009')

    @classmethod
    def phase(cls):
        """Phase for "CDS" features. It indicates where the feature begins with reference to the reading frame. For forward strand features, phase is counted from the start field, whilst for reverse strand features, phase is counted from the end field.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0011)
        """
        return cls._namespace_GFF3O('GFF3_0011')

    @classmethod
    def tag(cls):
        """Tag name of a feature attribute.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0013)
        """
        return cls._namespace_GFF3O('GFF3_0013')

    @classmethod
    def version(cls):
        """Version of the GFF3 specification that defines the feature set contents.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0022)
        """
        return cls._namespace_GFF3O('GFF3_0022')

    @classmethod
    def build(cls):
        """Name of a genome assembly build that denotes the provenance of features in a feature set. For example, 'NCBI 36' or 'FlyBase r4.1'.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0024)
        """
        return cls._namespace_GFF3O('GFF3_0024')

    @classmethod
    def attribute_properties(cls):
        """Properties that are directly associated with Attribute class instances.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0029)
        """
        return cls._namespace_GFF3O('GFF3_0029')

    @classmethod
    def dbxref(cls):
        """A database cross-reference to associate a sequence alteration to its representation in another database.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0034)
        """
        return cls._namespace_GFF3O('GFF3_0034')

    @classmethod
    def ontology_term(cls):
        """A cross-reference to an ontology term that is associated with a feature.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0035)
        """
        return cls._namespace_GFF3O('GFF3_0035')

    @classmethod
    def name(cls):
        """Name of a feature, which can be used for display purposes. The name is not a unique property among features.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0036)
        """
        return cls._namespace_GFF3O('GFF3_0036')

    @classmethod
    def alias(cls):
        """An alternative name for a feature. This can be another descriptive name of a feature, such as a locus name or accession number.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0037)
        """
        return cls._namespace_GFF3O('GFF3_0037')

    @classmethod
    def target_id(cls):
        """ID or accession of the target alignment.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0041)
        """
        return cls._namespace_GFF3O('GFF3_0041')

    @classmethod
    def gap(cls):
        """Gap describing the feature/target alignment if the sequences are not collinear. The formal description of this property has been lost due to a dead link in the GFF3 specification.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0046)
        """
        return cls._namespace_GFF3O('GFF3_0046')

    @classmethod
    def note(cls):
        """A free text note.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0048)
        """
        return cls._namespace_GFF3O('GFF3_0048')

    @classmethod
    def is_circular(cls):
        """Describes whether a feature is circular or not.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0049)
        """
        return cls._namespace_GFF3O('GFF3_0049')

    @classmethod
    def landmark_properties(cls):
        """Properties that are directly associated with Landmark class instances.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0052)
        """
        return cls._namespace_GFF3O('GFF3_0052')

    @classmethod
    def id(cls):
        """ID that uniquely establishes the Landmark's identity within a Set.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0053)
        """
        return cls._namespace_GFF3O('GFF3_0053')

    @classmethod
    def sequence(cls):
        """Either:
            Sequence associated with this feature, if it has been specified using a FASTA string.
            (cls, http://www.biointerchange.org/gff3o#GFF3_0057)
        Or:
            Sequence associated with this feature, if it has been specified using a FASTA string.
            (http://www.biointerchange.org/gff3o#GFF3_0058)
        """
        return [ cls._namespace_GFF3O('GFF3_0057'), cls._namespace_GFF3O('GFF3_0058') ]

    @classmethod
    def Set(cls):
        """Set of genomic sequence features, whose identifiers are unique within the set.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0001)
        """
        return cls._namespace_GFF3O('GFF3_0001')

    @classmethod
    def Feature(cls):
        """A genomic sequence feature.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0002)
        """
        return cls._namespace_GFF3O('GFF3_0002')

    @classmethod
    def Attribute(cls):
        """Describes additional feature attributes besides ID, Name, Alias, Parent, Target, Gap, Derives_from, Dbxref, Ontology_term, Ontology_term, or Is_circular.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0003)
        """
        return cls._namespace_GFF3O('GFF3_0003')

    @classmethod
    def Strand(cls):
        """Class describing a genomic strand. Instances of the class (cls, individuals) are used to denote forward-/reverse-strands, etc.
        (http://www.biointerchange.org/gff3o#GFF3_0016)
        """
        return cls._namespace_GFF3O('GFF3_0016')

    @classmethod
    def Target(cls):
        """Indicates a feature's "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0038)
        """
        return cls._namespace_GFF3O('GFF3_0038')

    @classmethod
    def Landmark(cls):
        """A landmark that establishes the coordinate system for features.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0051)
        """
        return cls._namespace_GFF3O('GFF3_0051')

    @classmethod
    def Positive(cls):
        """Location on the positive (cls, forward) strand.
        (http://www.biointerchange.org/gff3o#GFF3_0017)
        """
        return cls._namespace_GFF3O('GFF3_0017')

    @classmethod
    def Negative(cls):
        """Location on the negative (cls, reverse) strand.
        (http://www.biointerchange.org/gff3o#GFF3_0018)
        """
        return cls._namespace_GFF3O('GFF3_0018')

    @classmethod
    def UnknownStrand(cls):
        """Strand was not determined, which leaves it open whether the location is on the positive (cls, forward) or negative (reverse) strand.
        (http://www.biointerchange.org/gff3o#GFF3_0019)
        """
        return cls._namespace_GFF3O('GFF3_0019')

    @classmethod
    def NotStranded(cls):
        """Strand is not applicable.
        (cls, http://www.biointerchange.org/gff3o#GFF3_0020)
        """
        return cls._namespace_GFF3O('GFF3_0020')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == cls._namespace_GFF3O('GFF3_0004'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0010'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0012'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0014'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0015'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0021'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0023'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0025'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0026'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0039'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0044'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0045'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0047'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0050'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0056'):
            return True
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        if uri == cls._namespace_GFF3O('GFF3_0005'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0006'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0007'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0008'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0009'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0011'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0013'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0022'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0024'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0027'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0028'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0029'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0034'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0035'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0036'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0037'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0040'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0041'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0042'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0043'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0046'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0048'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0049'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0052'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0053'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0054'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0055'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0057'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0058'):
            return True
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == cls._namespace_GFF3O('GFF3_0001'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0002'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0003'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0016'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0038'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0051'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
        if uri == cls._namespace_GFF3O('GFF3_0017'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0018'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0019'):
            return True
        if uri == cls._namespace_GFF3O('GFF3_0020'):
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
    def _namespace_GFF3O(cls, accession):
        return Namespace('http://www.biointerchange.org/gff3o#')[accession]

    __parent_properties = { Namespace('http://www.biointerchange.org/gff3o#GFF3_0004') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0010') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0012') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0014') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0015') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0025') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0021') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0023') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0025') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0039') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0045') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0044') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0047') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0026') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0050') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0044') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0056') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0025') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0005') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0006') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0007') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0008') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0009') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0011') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0013') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0029') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0022') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0027') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0024') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0027') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0034') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0035') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0036') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0037') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0041') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0040') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0042') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0040') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0043') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0040') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0046') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0048') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0049') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0053') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0052') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0054') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0052') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0055') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0052') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0057') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0028') , Namespace('http://www.biointerchange.org/gff3o#GFF3_0058') : Namespace('http://www.biointerchange.org/gff3o#GFF3_0052') }


