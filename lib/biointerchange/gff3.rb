module BioInterchange

class GFF3

    def self.strand
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0010')
    end

    def self.attributes
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0012')
    end

    def self.parent
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0014')
    end

    def self.contains
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0015')
    end

    def self.seqid
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0004')
    end

    def self.source
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0005')
    end

    def self.type
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0006')
    end

    def self.start
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0007')
    end

    def self.end
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0008')
    end

    def self.score
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0009')
    end

    def self.phase
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0011')
    end

    def self.tag
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0013')
    end

    def self.Set
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0001')
    end

    def self.Feature
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0002')
    end

    def self.Attribute
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0003')
    end

    def self.Strand
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0016')
    end

    def self.Positive
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0017')
    end

    def self.Negative
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0018')
    end

    def self.UnknownStrand
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0019')
    end

    def self.NotStranded
      RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0020')
    end

    # Determines whether the given URI is an object property.
    #
    # +uri+:: URI that is tested for being an object property
    def self.is_object_property?(uri)
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0010')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0012')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0014')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0015')
      false
    end

    # Determines whether the given URI is a datatype property.
    #
    # +uri+:: URI that is tested for being a datatype property
    def self.is_datatype_property?(uri)
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0004')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0005')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0006')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0007')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0008')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0009')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0011')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0013')
      false
    end

    # Determines whether the given URI is a class.
    #
    # +uri+:: URI that is tested for being a class
    def self.is_class?(uri)
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0001')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0002')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0003')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0016')
      false
    end

    # Determines whether the given URI is a named individual.
    #
    # +uri+:: URI that is tested for being a named individual
    def self.is_named_individual?(uri)
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0017')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0018')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0019')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#GFF3_0020')
      false
    end

end

end
