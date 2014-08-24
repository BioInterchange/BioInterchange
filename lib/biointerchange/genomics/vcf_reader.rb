module BioInterchange::Genomics

require 'date'

class VCFReader < GFF3Reader

  # Register reader:
  BioInterchange::Registry.register_reader(
    'biointerchange.vcf',
    VCFReader,
    [ 'name', 'name_uri', 'date', 'batch_size' ],
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
    elsif name == 'contig' then
      feature_set.set_pragma(name, vcf_mapping(value))
    elsif name == 'fileDate' then
      feature_set.set_pragma(name, { name => Date.parse(value) })
    elsif name == 'fileformat' then
      feature_set.set_pragma(name, { name => value.sub(/^VCFv/, '').to_f })
    elsif name == 'FILTER' then
      feature_set.set_pragma(name, vcf_mapping(value))
    elsif name == 'FORMAT' then
      feature_set.set_pragma(name, vcf_mapping(value))
    elsif name == 'geneAnno' then
      #
    elsif name == 'ID' then
      #
    elsif name == 'INFO' then
      feature_set.set_pragma(name, vcf_mapping(value))
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
    elsif name == 'reference' then
      # 'reference' is not specified in VCF 4.1, but used in examples and real-world
      # VCF files nevertheless.
      # TODO What if reference already set?
      feature_set.set_pragma(name, value)
    else
      # Cannot be passed to super class, because GFF3 has inherently different pragma statements.
      feature_set.set_pragma(name, { name => value })
    end
  end

  # Adds a comment to the feature set; ignores the header line that preceds VCF features.
  # Comments are added on a line-by-line basis.
  #
  # +feature_set+:: VCF feature set to which the comment line is being added
  # +comment+:: comment line in the VCF file
  def add_comment(feature_set, comment)
    if comment.start_with?("CHROM\tPOS\tID\tREF\tALT") then
      columns = comment.split("\t")
      @samples = columns[9..-1]
      @samples = [] unless @samples
    else
      @comment << comment
    end
  end

  # Adds a VCF feature to a VCF feature set.
  #
  # +feature_set+:: feature set to which the feature should be added to
  # +line+:: line from the VCF that describes the feature
  def add_feature(feature_set, line)
    line.chomp!
    chrom, pos, id, ref, alt, qual, filter, info, format, samples = line.split("\t")

    # Split composite fields
    alt = alt.split(',')
    info = info.split(';')
    info = info.map { |key_value_pair| key, values = key_value_pair.split('=', 2) }
    info = Hash[info]
    info = info.each_pair { |key, value|
      if value then
        [ key, value.split(',') ]
      else
        [ key, true ]
      end
    }

    feature_set.add(BioInterchange::Genomics::VCFFeature.new(chrom, pos, id, ref, alt, qual, filter, info))
  end

private

  # Takes a VCF meta-information string and returns a key-value mapping.
  #
  # +value+:: value of a meta-information assignment in VCF (key/value mappings of the form "<ID=value,...>")
  def vcf_mapping(value)
    value = value[1..-2]

    mapping = {}
    identifier = ''
    assignment = ''
    state = :id
    value.each_char { |character|
      if state == :value then
        if character == '"' then
          state = :quoted
          next
        else
          state = :plain
        end
      end

      state = :separator if state == :plain and character == ','

      if state == :id then
        if character == '=' then
          state = :value
          assignment = ''
        else
          identifier << character
        end
      elsif state == :separator then
        if character == ',' then
          state = :id
          mapping[identifier] = assignment
          identifier = ''
        else
          # TODO Format error.
        end
      elsif state == :quoted then
        if character == '"' then
          state = :separator
          mapping[identifier] = assignment
          identifier = ''
        else
          assignment << character
        end
      elsif state == :plain then
        assignment << character
      else
        # TODO Whoops. Report error.
      end
    }

    mapping[identifier] = assignment unless identifier.empty?

    mapping
  end

end

end

