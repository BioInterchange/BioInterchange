module BioInterchange::Genomics

# Represents a single genomic feature of a VCF file.
class VCFFeature < GFF3Feature

  # Creates a new feature representation. A feature is described on one line of the VCF file.
  #
  # +chromosome+:: an identifier that determines the chromosome on which the feature resides
  # +position+:: the feature locus on the chromosome
  # +id+:: a unique identifier of the feature
  # +reference_bases+:: reference alleles of the feature
  # +alternative_alleles+:: alternative alleles of the feature (non-reference alleles)
  # +quality_score+:: phred-scaled quality score for the assertions concerning reference-/alternative-alleles
  # +filters+:: list of VCF filters that a feature has failed
  # +info+:: a map of additional attributes associated with the feature
  def initialize(chromosome, position, id, reference_bases, alternative_alleles, quality_score, filters, info = {})
    # Fill in phase, which is always omitted in GVF features (after 'strand', before 'attributes'):
    # Translations to somewhat fit the existing GFF3/GVF model (GFF3/GVF left, VCF right):
    #
    #   sequence_id -> chromosome
    #   source -> nil
    #   type -> nil
    #   start_coordinate -> position
    #   end_coordinate -> position
    #   score -> quality_score
    #   strand -> nil
    #   phase -> nil
    #   attributes -> info
    #
    # Parameters that do not map directly to super's parameters are placed in `info`
    # with a space as prefix. For example, `reference_bases` becomes the key
    # ` reference_bases` in `info`.
    info[' id'] = id
    info[' reference_bases'] = reference_bases
    info[' alternative_alleles'] = alternative_alleles
    info[' filters'] = filters

    super(chromosome, nil, nil, position, position, quality_score, nil, nil, info)
  end

end

end

