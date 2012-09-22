module BioInterchange

class GFF3

    def self.attributes
      RDF::URI.new('http://www.sequenceontology.org/gff3#attributes')
    end

    def self.contains
      RDF::URI.new('http://www.sequenceontology.org/gff3#contains')
    end

    def self.end
      RDF::URI.new('http://www.sequenceontology.org/gff3#end')
    end

    def self.parent
      RDF::URI.new('http://www.sequenceontology.org/gff3#parent')
    end

    def self.phase
      RDF::URI.new('http://www.sequenceontology.org/gff3#phase')
    end

    def self.score
      RDF::URI.new('http://www.sequenceontology.org/gff3#score')
    end

    def self.seqid
      RDF::URI.new('http://www.sequenceontology.org/gff3#seqid')
    end

    def self.source
      RDF::URI.new('http://www.sequenceontology.org/gff3#source')
    end

    def self.start
      RDF::URI.new('http://www.sequenceontology.org/gff3#start')
    end

    def self.strand
      RDF::URI.new('http://www.sequenceontology.org/gff3#strand')
    end

    def self.tag
      RDF::URI.new('http://www.sequenceontology.org/gff3#tag')
    end

    def self.type
      RDF::URI.new('http://www.sequenceontology.org/gff3#type')
    end

    def self.Attribute
      RDF::URI.new('http://www.sequenceontology.org/gff3#Attribute')
    end

    def self.Feature
      RDF::URI.new('http://www.sequenceontology.org/gff3#Feature')
    end

    def self.Set
      RDF::URI.new('http://www.sequenceontology.org/gff3#Set')
    end

    # Determines whether the given URI is an object property.
    #
    # +uri+:: URI that is tested for being an object property
    def self.is_object_property?(uri)
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#attributes')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#contains')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#end')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#parent')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#phase')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#score')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#seqid')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#source')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#start')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#strand')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#tag')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#type')
      false
    end

    # Determines whether the given URI is a datatype property.
    #
    # +uri+:: URI that is tested for being a datatype property
    def self.is_datatype_property?(uri)
      false
    end

    # Determines whether the given URI is a class.
    #
    # +uri+:: URI that is tested for being a class
    def self.is_class?(uri)
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#Attribute')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#Feature')
      return true if uri == RDF::URI.new('http://www.sequenceontology.org/gff3#Set')
      false
    end

end


end
