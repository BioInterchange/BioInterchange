require 'bio'
require 'date'

module BioInterchange::Phylogenetics

class NewickReader < BioInterchange::Reader

  # Register reader:
  BioInterchange::Registry.register_reader(
    'phylotastic.newick',
    NewickReader,
    [ 'date' ],
    true,
    'Newick Tree File Format reader',
    [
      [ 'date <date>', 'date when the Newick file was created (optional)' ]
    ]
  )

  # Creates a new instance of a Newick file format reader.
  #
  # The reader supports batch processing.
  #
  # +date+:: Optional date of when the Newick file was produced, annotated, etc.
  # +batch_size+:: Optional integer that determines that number of features that
  # should be processed in one go.
  def initialize(date = nil, batch_size = nil)
    @date = date
    @batch_size = batch_size
  end

  # Reads a Newick file from the input stream and returns an associated model.
  #
  # If this method is called when +postponed?+ returns true, then the reading will
  # continue from where it has been interrupted beforehand.
  #
  # +inputstream+:: an instance of class IO or String that holds the contents of a Newick file
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
      @trees.set_date(Date.parse(@date)) if @date
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

