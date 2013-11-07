
module BioInterchange::Genomics

# A VCF feature set, which encapsules information of a single VCF file.
class VCFFeatureSet < GFF3FeatureSet

  def uri
    super.sub(/^biointerchange:\/\/gff3\//, 'biointerchange://vcf/')
  end

end

end

