module BioInterchange

# Instances of this class represent an object model that is populated by a Reader
# and serialized by a Writer. The model does not have to be read completely into
# memory (see GFF3/GVF implementation as an example).
class Model

  # Create a new instance of an object model. Your concrete object model make take some extra
  # parameters for configuring/parametrizing the model's behaviour.
  def initialize
  end
  
  # For readers that support batch processing, pruning removes all data from the model that
  # has been serialized already. This prevents memory issues when the input data is very large.
  def prune
    raise BioInterchange::Exceptions::ImplementationModelError, 'Pruning is not implemented by this model'
  end

end

end
