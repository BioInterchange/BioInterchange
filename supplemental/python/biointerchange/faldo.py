import rdflib

from rdflib import Namespace


class FALDO:

    @classmethod
    def In_between_positions(cls):
        """This denotes that a feature is in between two other positions that are both known exactly and next to eaxh other. An example is an restriction enzyme cutting site. The cut is after one nucleotide and before the next i.e. in between
        (cls, http://biohackathon.org/resource/faldo#InBetweenPosition)
        """
        return cls._namespace_FALDO('InBetweenPosition')

    @classmethod
    def Position(cls):
        """Superclass to group the general concept of a position on a sequence. The sequence is designated via the reference predicate.
        (cls, http://biohackathon.org/resource/faldo#Position)
        """
        return cls._namespace_FALDO('Position')

    @classmethod
    def Exact_position(cls):
        """Use when you exactly know the position.
        (cls, http://biohackathon.org/resource/faldo#ExactPosition)
        """
        return cls._namespace_FALDO('ExactPosition')

    @classmethod
    def One_of_positions(cls):
        """The position must be one of the more detailed Positions listed by the location predicate.
        (cls, http://biohackathon.org/resource/faldo#OneOfPosition)
        """
        return cls._namespace_FALDO('OneOfPosition')

    @classmethod
    def Indeterminate_position_within_a_range(cls):
        """Use when you have an idea of the range in which you can find the position but can not be sure.
        (cls, http://biohackathon.org/resource/faldo#InRangePosition)
        """
        return cls._namespace_FALDO('InRangePosition')

    @classmethod
    def Stranded_position(cls):
        """Part of the coordinate system is on which strand the feature can be found. If you do not yet know which stand the feature is on you should tag the position with just this class. If you know more you should use one of the subclasses. This means a region descibred with a '.' in GFF3. An GFF3 Unstranded position does not have this type in FALDO those are just a Position.
        (cls, http://biohackathon.org/resource/faldo#StrandedPosition)
        """
        return cls._namespace_FALDO('StrandedPosition')

    @classmethod
    def Fuzzy_position(cls):
        """Use this class to indicate that you lack exact position data.
        (cls, http://biohackathon.org/resource/faldo#FuzzyPosition)
        """
        return cls._namespace_FALDO('FuzzyPosition')

    @classmethod
    def Positive_strand(cls):
        """The position is on the forward (cls, positive) strand. Shown as a '+' in GFF3 and GTF
        (http://biohackathon.org/resource/faldo#ForwardStrandPosition)
        """
        return cls._namespace_FALDO('ForwardStrandPosition')

    @classmethod
    def Both_strands(cls):
        """The both strands position mean that the region spans both strands instead of one. In GGF3 displayed as 0. This does not mean that the position is one or the other strand but is best described as being on both.
        (cls, http://biohackathon.org/resource/faldo#BothStrandsPosition)
        """
        return cls._namespace_FALDO('BothStrandsPosition')

    @classmethod
    def Negative_strand(cls):
        """The position is on the reverse (cls, complement) strand of the sequence. Shown as '-' in GTF and GFF3
        (http://biohackathon.org/resource/faldo#ReverseStrandPosition)
        """
        return cls._namespace_FALDO('ReverseStrandPosition')

    @classmethod
    def Region(cls):
        """A region describes an length of sequence with a start and end position that represents a feature on a Sequence. i.e. a gene
        (cls, http://biohackathon.org/resource/faldo#Region)
        """
        return cls._namespace_FALDO('Region')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == cls._namespace_FALDO('InBetweenPosition'):
            return True
        if uri == cls._namespace_FALDO('Position'):
            return True
        if uri == cls._namespace_FALDO('ExactPosition'):
            return True
        if uri == cls._namespace_FALDO('OneOfPosition'):
            return True
        if uri == cls._namespace_FALDO('InRangePosition'):
            return True
        if uri == cls._namespace_FALDO('StrandedPosition'):
            return True
        if uri == cls._namespace_FALDO('FuzzyPosition'):
            return True
        if uri == cls._namespace_FALDO('ForwardStrandPosition'):
            return True
        if uri == cls._namespace_FALDO('BothStrandsPosition'):
            return True
        if uri == cls._namespace_FALDO('ReverseStrandPosition'):
            return True
        if uri == cls._namespace_FALDO('Region'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
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
    def _namespace_FALDO(cls, accession):
        return Namespace('http://biohackathon.org/resource/faldo#')[accession]

    __parent_properties = { Namespace('http://biohackathon.org/resource/faldo#OneOfPosition') : Namespace('http://biohackathon.org/resource/faldo#FuzzyPosition') , Namespace('http://biohackathon.org/resource/faldo#StrandedPosition') : Namespace('http://biohackathon.org/resource/faldo#Position') , Namespace('http://biohackathon.org/resource/faldo#FuzzyPosition') : Namespace('http://biohackathon.org/resource/faldo#Position') , Namespace('http://biohackathon.org/resource/faldo#ForwardStrandPosition') : Namespace('http://biohackathon.org/resource/faldo#StrandedPosition') , Namespace('http://biohackathon.org/resource/faldo#BothStrandsPosition') : Namespace('http://biohackathon.org/resource/faldo#StrandedPosition') , Namespace('http://biohackathon.org/resource/faldo#ReverseStrandPosition') : Namespace('http://biohackathon.org/resource/faldo#StrandedPosition') }


