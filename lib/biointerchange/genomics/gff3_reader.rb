module BioInterchange::Genomics

class GFF3Reader

  # Creates a new instance of a Generic Feature Format Version 3 (GFF3) reader.
  #
  # +name+:: Optional name of the person who generated the GFF3 file.
  # +name_uri+:: Optional e-mail address of the person who generated the GFF3 file.
  # +date+:: Optional date of when the GFF3 file was produced.
  def initialize(name = nil, name_uri = nil, date = nil)
    @name = name
    @name_uri = name_uri
    @date = date
  end 

  # Reads a GFF3 file from the input stream and returns an associated model.
  #
  # +inputstream+:: an instance of class IO or String that holds the contents of a GFF3 file
  def deserialize(inputstream)
    if inputstream.kind_of?(IO)
      create_model(inputstream.read)
    elsif inputstream.kind_of?(String) then
      create_model(inputstream)
    else
      raise BioInterchange::Exceptions::ImplementationReaderError, 'The provided input stream needs to be either of type IO or String.'
    end
  end

private

  def create_model(gff3)
    feature_set = BioInterchange::Genomics::GFF3FeatureSet.new()
    gff3.each_line { |line|
      next if line.start_with?('#')

      line.chomp!
      seqid, source, type, start_coordinate, end_coordinate, score, strand, phase, attributes = line.split("\t")

      # The type might be a SO/SOFA term, SO/SOFA accession, or other term (it stays a string then):
      if type.match(/SO:\d+/) then
        type = RDF::URI.new("http://purl.obolibrary.org/obo/#{type.sub(':', '_')}")
      elsif BioInterchange::SOFA.methods.include?(type.gsub(' ', '_').to_sym)
        type = BioInterchange::SOFA.send(type.gsub(' ', '_'))
      end

      # String to numeric value conversions:
      start_coordinate = start_coordinate.to_i
      stop_coordinate = stop_coordinate.to_i
      if score == '.' then
        score = nil
      else
        score = score.to_f
      end

      # Determine strandedness:
      if strand == '?' then
        strand = BioInterchange::Genomics::GFF3Feature::UNKNOWN
      elsif strand == '+' then
        strand = BioInterchange::Genomics::GFF3Feature::POSITIVE
      elsif strand == '-' then
        strand = BioInterchange::Genomics::GFF3Feature::NEGATIVE
      else
        strand = BioInterchange::Genomics::GFF3Feature::NOT_STRANDED
      end

      # Set phase, if it lies in the permissable range of values:
      if phase == '0' or phase == '1' or phase == '2' then
        phase = phase.to_i
      else
        phase = nil
      end

      temp = {}
      attributes.split(';').map { |assignment| match = assignment.match(/([^=]+)=(.+)/) ; { match[1].strip => match[2].split(',').map { |value| value.strip } } }.map { |hash| hash.each_pair { |tag,list| temp[tag] = list } }
      attributes = temp

      feature_set.add(BioInterchange::Genomics::GFF3Feature.new(seqid, source, type, start_coordinate, end_coordinate, score, strand, phase, attributes))
    }

    feature_set
  end

end

end

