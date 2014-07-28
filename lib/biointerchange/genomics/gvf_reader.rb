module BioInterchange::Genomics

class GVFReader < GFF3Reader

  # Register reader:
  BioInterchange::Registry.register_reader(
    'biointerchange.gvf',
    GVFReader,
    [ 'name', 'name_uri', 'date', 'batch_size' ],
    true,
    'Genome Variation Format Version 1 (GVF) reader',
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
    BioInterchange::Genomics::GVFFeatureSet.new()
  end

  def add_pragma(feature_set, line)
    line.chomp!
    name, value = line[2..-1].split(/\s/, 2)
    value.strip!

    # Interpret pragmas, and if not known, delegate to GFF3Reader (in alphabetical order):
    if name == 'attribute-method' or name == 'data-source' or name == 'score-method' or name == 'source-method' or name == 'technology-platform' then
      attributes = split_attributes(value)
      structured_attributes = feature_set.pragma(name)
      structured_attributes = { name => [] } unless structured_attributes
      structured_attributes[name] << attributes
      feature_set.set_pragma(name, structured_attributes)
    elsif name == 'gvf-version' then
      feature_set.set_pragma(name, { name => value.to_f })
    else
      super(feature_set, line)
    end
  end

end

end

