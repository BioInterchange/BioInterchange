module BioInterchange

class Registry

  def self.register_reader(uid, service)
    @@readers[uid] = service
  end

  def self.register_writer(uid, service)
    @@writers[uid] = service
  end

  def self.readers
    @@readers
  end

  def self.writers
    @@writers
   end

private

  @@readers = {}
  @@writers = {}

end

end

