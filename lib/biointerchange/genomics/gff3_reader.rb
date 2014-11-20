require 'stringio'

module BioInterchange::Genomics

class GFF3Reader < BioInterchange::Reader

  # Register reader:
  BioInterchange::Registry.register_reader(
    'biointerchange.gff3',
    GFF3Reader,
    [ 'name', 'name_uri', 'date', 'batch_size' ],
    true,
    'Generic Feature Format Version 3 (GFF3) reader',
    [
      [ 'date <date>', 'date when the GFF3 file was created (optional)' ],
      [ 'name <name>', 'name of the GFF3 file creator (optional)' ],
      [ 'name_id <id>', 'email address of the GFF3 file creator (optional)' ]
    ]
  )

  # Creates a new instance of a Generic Feature Format Version 3 (GFF3) reader.
  #
  # The reader supports batch processing.
  #
  # +name+:: Optional name of the person who generated the GFF3 file.
  # +name_uri+:: Optional e-mail address of the person who generated the GFF3 file.
  # +date+:: Optional date of when the GFF3 file was produced.
  # +batch_size+:: Optional integer that determines that number of features that
  # should be processed in one go.
  def initialize(name = nil, name_uri = nil, date = nil, batch_size = nil)
    @name = name
    @name_uri = name_uri
    @date = date
    @batch_size = batch_size
    @linenumber = 0
  end 

  # Reads a GFF3 file from the input stream and returns an associated model.
  #
  # If this method is called when +postponed?+ returns true, then the reading will
  # continue from where it has been interrupted beforehand.
  #
  # +inputstream+:: an instance of class IO or String that holds the contents of a GFF3 file
  def deserialize(inputstream)
    if inputstream.kind_of?(IO)
      create_model(inputstream)
    elsif inputstream.kind_of?(String) then
      create_model(StringIO.new(inputstream))
    else
      raise BioInterchange::Exceptions::ImplementationReaderError, 'The provided input stream needs to be either of type IO or String.'
    end
  end

  # Returns true if the reading of the input was postponed due to a full batch.
  def postponed?
    @postponed
  end

protected

  def create_feature_set
    BioInterchange::Genomics::GFF3FeatureSet.new()
  end

  def create_model(gff3)
    if @postponed then
      @postponed = false
      @feature_set.prune
    else
      @feature_set = create_feature_set
    end
    feature_no = 0

    # Note: there is a `while true` statement at the end of this block!
    fasta_block = false
    fasta_id = nil
    fasta_comment = nil
    fasta_sequence = nil
    @comments = [] # TODO Add comments to feature objects; add 'before' in serialization.
    begin
      line = gff3.readline
      line.chomp!
      @linenumber += 1

      if line.start_with?('#') and not line.start_with?('##') then
        add_comment(@feature_set, line[1..-1].strip)
        next
      end

      if line.start_with?('##FASTA') then
        fasta_block = true
        next
      end

      if fasta_block then
        if line.start_with?('>') and line.length > 1 then
          @feature_set.add(BioInterchange::Genomics::GFF3FeatureSequence.new(fasta_id, fasta_sequence, fasta_comment)) if fasta_id and not fasta_sequence.empty?()
          fasta_id = line[1..-1].strip
          fasta_id, fasta_comment = fasta_id.split(' ', 2)
          fasta_sequence = ''
        else
          fasta_sequence << line.strip
        end
        next
      end

      unless line.start_with?('##') then
        begin
          add_feature(@feature_set, line)
        rescue ArgumentError => e
          # Potentially a string encoding issue (input not UTF-8). Try ISO-8859-1 and retry:
          add_feature(@feature_set, line.force_encoding('ISO-8859-1'))
        end
        feature_no += 1

        if @batch_size and feature_no >= @batch_size then
          @postponed = true
          break
        end
      else
        add_pragma(@feature_set, line)
      end
    rescue EOFError
      # Expected. Do nothing, since just the end of the file/input has been reached.
      @feature_set.add(BioInterchange::Genomics::GFF3FeatureSequence.new(fasta_id, fasta_sequence, fasta_comment)) if fasta_id and not fasta_sequence.empty?()
      break
    end while true

    @feature_set
  end

  def add_feature(feature_set, line)
    line.chomp!
    seqid, source, type, start_coordinate, end_coordinate, score, strand, phase, attributes = line.split("\t")

    # The type might be a SO/SOFA term or SO/SOFA accession:
    begin
      if type.match(/^SO:\d{7}$/) then
        type = RDF::URI.new("http://www.sequenceontology.org/miso/current_release/term/#{feature.type}")
      else
        type = BioInterchange::SO.send(BioInterchange.make_safe_label(type))
      end
    rescue NoMethodError
      raise BioInterchange::Exceptions::InputFormatError, "Line #{@linenumber}. Type of feature is set to an unknown SO/SOFA term: \"#{type}\""
    end

    # String to numeric value conversions:
    start_coordinate = start_coordinate.to_i
    end_coordinate = end_coordinate.to_i
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

    attributes = split_attributes(attributes)

    feature_set.add(BioInterchange::Genomics::GFF3Feature.new(seqid, source, type, start_coordinate, end_coordinate, score, strand, phase, attributes))
  end

  def add_comment(feature_set, comment)
    @comments << comment
  end

  def add_pragma(feature_set, line)
    line.chomp!
    name, value = line[2..-1].split(/\s/, 2)
    value.strip!
    
    # Interpret pragmas depending on their definition (sorted alphabetically):
    if name == 'feature-ontology' then
      ontologies = feature_set.pragma(name)
      ontologies = { name => [] } unless ontologies
      ontologies[name] << value
      feature_set.set_pragma(name, ontologies)
    elsif name == 'genome-build' then
      builds = feature_set.pragma(name)
      builds = { name => {} } unless builds
      source, build_name = value.split(/\s+/, 2)
      build_name.sub!(/\s.*$/, '') # Remove possible comments
      builds[name][source] = build_name
      feature_set.set_pragma(name, builds)
    elsif name == 'gff-version' then
      feature_set.set_pragma(name, { name => value.to_f })
    elsif name == 'sequence-region' then
      regions = feature_set.pragma(name)
      regions = { name => {} } unless regions
      seqid, start_coordinate, end_coordinate = value.split(/\s+/, 3)
      regions[name][seqid] = BioInterchange::Genomics::GFF3Landmark.new(seqid, start_coordinate.to_i, end_coordinate.to_i)
      feature_set.set_pragma(name, regions)
    elsif name == 'species' then
      feature_set.set_pragma(name, { name => value })
    else
      # Unhandled pragma. Just save the value in its string form.
      feature_set.set_pragma(name, { name => value })
    end
  end

  # Takes a GFF3/GVF attribute string (column 9) and decompose it into key/value pairs, where
  # values are representing a list for the (possibly) comma separated GFF3/GVF attribute values.
  #
  # +attribute_string+:: key/value string (column 9) as seen in a GFF3/GVF file
  def split_attributes(attribute_string)
    puts attribute_string
    attributes = {}
    hashes = attribute_string.split(';').map { |assignment|
      match = assignment.match(/([^=]+)=(.+)/) ;
      { match[1].strip => match[2].split(',').map { |value| URI.decode(value.strip) } }
    }
    hashes.map { |hash|
      hash.each_pair { |tag,list|
        attributes[tag] = list
      }
    }
    attributes
  end

end

end

