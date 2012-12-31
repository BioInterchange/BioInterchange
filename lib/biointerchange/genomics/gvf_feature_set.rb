
module BioInterchange::Genomics

# A GVF feature set, which encapsules information of a single GVF file.
class GVFFeatureSet < GFF3FeatureSet

  def uri
    super.sub(/^biointerchange:\/\/gff3\//, 'biointerchange://gvf/')
  end

end

end

