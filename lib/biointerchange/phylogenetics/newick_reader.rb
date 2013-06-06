require 'bio'

module BioInterchange::Phylogenetics

class NewickReader < BioInterchange::Reader

  # Register reader:
  BioInterchange::Registry.register_reader(
    'phylotastic.newick',
    NewickReader,
    [ 'name', 'name_uri', 'date' ],
    true,
    'Newick Tree File Format reader',
    [
      [ 'date <date>', 'date when the Newick file was created (optional)' ],
      [ 'name <name>', 'name of the Newick file creator (optional)' ],
      [ 'name_id <id>', 'email address of the Newick file creator (optional)' ]
    ]
  )

  def initialize(name = nil, name_uri = nil, date = nil, batch_size = nil)
    @name = name
    @name_uri = name_uri
    @date = date
    @batch_size = batch_size
  end

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

  def create_model(newick)
    if @postponed then
      @postponed = false
      @trees.prune
    else
      @trees = BioInterchange::Phylogenetics::TreeSet.new()
    end

    tree_io = Bio::FlatFile.open(Bio::Newick, newick)
    while newick_tree = tree_io.next_entry
      newick_tree.options[:bootstrap_style] = :disabled
      @trees.add(newick_tree.tree)

      if @batch_size and feature_no >= @batch_size then
        @postponed = true
        break
      end
    end

    @trees
  end

end

end

