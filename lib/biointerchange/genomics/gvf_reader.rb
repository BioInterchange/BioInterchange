module BioInterchange::Genomics

class GVFReader < GFF3Reader

  # Creates a new instance of a Genome Variation Format (GVF) reader.
  #
  # +name+:: Optional name of the person who generated the GVF file.
  # +name_uri+:: Optional e-mail address of the person who generated the GVF file.
  # +date+:: Optional date of when the GVF file was produced.
  def initialize(name = nil, name_uri = nil, date = nil)
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

    # Interpret pragmas, and if not known, delegate to GFF3Reader:
    if name == 'gvf-version' then
      feature_set.set_pragma(name, { name => value.to_f })
    else
      super(feature_set, line)
    end
  end

end

end

