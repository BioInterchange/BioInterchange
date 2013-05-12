module BioInterchange

# A registry of Reader and Writer subclasses that also keeps track which
# Reader/Writer combinations can be used together. The registry makes it
# possible to implement readers and writers without the need to modify
# other BioInterchange framework code.
class Registry

  def self.register_reader(reader_id, reader_class, parameters, supports_batch_processing, descriptive_name, options_help)
    @@readers[reader_id] = [ reader_class ] + parameters
    @@reader_batch_processors[reader_id] = true if supports_batch_processing
    @@reader_descriptions[reader_id] = descriptive_name
    @@reader_help_texts[reader_id] = options_help
  end

  def self.register_writer(writer_id, writer_class, compatible_reader_ids, supports_batch_processing, descriptive_name)
    @@writers[writer_id] = writer_class
    @@writer_batch_processors[writer_id] = true if supports_batch_processing
    @@writer_descriptions[writer_id] = descriptive_name
    compatible_reader_ids.each { |reader_id|
      @@compatible_reader_writer_pairs["#{reader_id} #{writer_id}"] = true
    }
  end

  def self.is_supported?(reader_id, writer_id)
    @@compatible_reader_writer_pairs["#{reader_id} #{writer_id}"] == true
  end

  def self.is_supporting_batch_processing?(reader_id, writer_id)
    @@reader_batch_processors[reader_id] and @@writer_batch_processors[writer_id]
  end

  def self.reader(reader_id)
    @@readers[reader_id]
  end

  def self.writer(writer_id)
    @@writers[writer_id]
  end

  def self.reader_descriptions
    @@reader_descriptions.clone.freeze
  end

  def self.writer_descriptions
    @@writer_descriptions.clone.freeze
  end

  def self.options_help(reader_id)
    @@reader_help_texts[reader_id].clone.freeze
  end

  def self.reader_writer_pairs
    @@compatible_reader_writer_pairs.keys.sort.map { |reader_writer_pair| reader_writer_pair.split(/ /, 2) }.freeze
  end

private

  @@readers = {}
  @@writers = {}
  @@reader_batch_processors = {}
  @@writer_batch_processors = {}
  @@reader_descriptions = {}
  @@writer_descriptions = {}
  @@reader_help_texts = {}
  @@compatible_reader_writer_pairs = {}

end

end

