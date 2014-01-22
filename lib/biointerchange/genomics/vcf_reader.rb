module BioInterchange::Genomics

class VCFReader < GFF3Reader

  # Register reader:
  BioInterchange::Registry.register_reader(
    'biointerchange.vcf',
    VCFReader,
    [ 'name', 'name_uri', 'date' ],
    true,
    'Variant Call Format (VCF) version 4.1 reader',
    [
      [ 'date <date>', 'date when the GVF file was created (optional)' ],
      [ 'name <name>', 'name of the GVF file creator (optional)' ],
      [ 'name_id <id>', 'email address of the GVF file creator (optional)' ]
    ]
  )

  # Creates a new instance of a Genome Variation Format (GVF) reader.
  #
  # +name+:: Optional name of the person who generated the GVF file.
  # +name_uri+:: Optional e-mail address of the person who generated the GVF file.
  # +date+:: Optional date of when the GVF file was produced.
  def initialize(name = nil, name_uri = nil, date = nil, batch_size = nil)
    # Remember: calling super without brackets passes all arguments of initialize!
    super
  end

protected

  def create_feature_set
    BioInterchange::Genomics::VCFFeatureSet.new()
  end

  def add_pragma(feature_set, line)
    line.chomp!
    puts line
    name, value = line[2..-1].split(/=/, 2)
    value.strip!

    # Interpret pragmas, and if not known, delegate to GFF3Reader (in alphabetical order):
    if name == 'assembly' then
      # attributes = split_attributes(value)
      # structured_attributes = feature_set.pragma(name)
      # structured_attributes = { name => [] } unless structured_attributes
      # structured_attributes[name] << attributes
      # feature_set.set_pragma(name, structured_attributes)
    elsif name == 'center' then
      #
    elsif name == 'Description' then
      #
    elsif name == 'fileDate' then
      #
    elsif name == 'fileformat' then
      feature_set.set_pragma(name, { name => value.sub(/^VCFv/, '').to_f })
    elsif name == 'FILTER' then
      #
    elsif name == 'FORMAT' then
      #
    elsif name == 'geneAnno' then
      #
    elsif name == 'ID' then
      #
    elsif name == 'INDIVIDUAL' then
      #
    elsif name == 'INFO' then
      #
    elsif name == 'Number' then
      #
    elsif name == 'PREDIGREE' then
      #
    elsif name == 'phasing' then
      #
    elsif name == 'reference' then
      #
    elsif name == 'SAMPLE' then
      #
    elsif name == 'tcgaversion' then
      #
    elsif name == 'Type' then
      #
    elsif name == 'vcfProcessLog' then
      #
    else
      # Cannot be passed to super class, because GFF3 has inherently different pragma statements.
      feature_set.set_pragma(name, { name => value })
    end
  end

  def add_feature(feature_set, line)
    line.chomp!
    chrom, pos, id, ref, alt, qual, filter, info, format, samples = line.split("\t")
  end

end

end

