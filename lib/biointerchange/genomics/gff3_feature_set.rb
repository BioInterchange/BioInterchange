require 'digest/sha1'

module BioInterchange::Genomics

# A GFF3 feature set, which encapsules information of a single GFF3 file.
class GFF3FeatureSet

  # Create a new instance of a Generic Feature Format Version 3 (GFF3) feature set. A feature
  # set can contain multiple GFF3 features.
  def initialize
    # Features are stored as the keys of a hash map to increase performance:
    @set = {}
    # Pragmas, i.e. feature meta-information, are stored as named mappings. Many
    # pragmas are simple key/value assignments, but others permit multiple values
    # whose ordering does matter. In that case, an array is used to store the
    # various values.
    @pragmas = {}
  end

  # Returns the contents of the feature set -- excluding pragma meta-data.
  def contents
    @set.keys
  end

  # Returns information stored for a named pragma, or nil if there is no information
  # stored for it.
  #
  # +name+:: a string representing the name of the pragma whose value we are interested in
  def pragma(name)
    return nil unless name
    # TODO Should throw exception if name is not a string.
    return nil unless name.kind_of?(String)
    @pragmas[name]
  end

  # Returns the names of all the pragmas for which some information has been recorded.
  def pragmas
    @pragmas.keys
  end

  # Returns an URI for this particular feature set, which is a SHA1 hash over the pragma's concatenated properties.
  def uri
    clob = ''
    pragmas.each { |pragma_name|
      clob << "#{pragma_name}\t#{pragma(pragma_name).to_s}\n"
    }
    "biointerchange://gff3/featureset/self/#{Digest::SHA1.hexdigest(clob)}"
  end

  # Adds a feature to the feature set.
  #
  # +feature+:: feature instance that is added to the contents of this feature set
  def add(feature)
    @set[feature] = true
  end

   # Sets the value for named pragma meta-data.
   #
   # +name+:: a string representing the unique name of the pragma
   # +value+:: on object representing the value of the pragma assignment
   def set_pragma(name, value)
     # TODO Should throw exception if name is not a string.
     @pragmas[name] = value
   end
end

end
