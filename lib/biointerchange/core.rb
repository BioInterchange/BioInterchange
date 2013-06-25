# BioInterchange converts non-RDF data formats into RDF.
#
# Convert TSV, XML, GFF3, GVF and other files into RDF triples using
# BioInterchange's command-line tool, its web-services or make use
# of it as a gem in your own Ruby implementation.
module BioInterchange

  ### Global behaviour settings, which can be altered programmatically or via the CLI:

  # If true, then RDF::Graph's "insert" function will be overwritten so that it
  # immediately outputs N-Triples. This reduces memory requirements (since no RDF
  # graph is kept in memory) and performance (since no looping through an RDF graph
  # is necessary).
  @@skip_rdf_graph = true
  def self.skip_rdf_graph
    @@skip_rdf_graph
  end

  # Custom Exceptions and Errors
  require 'biointerchange/exceptions'

  # Ontologies (besides the ones from the 'rdf' gem)
  require 'biointerchange/cdao'
  require 'biointerchange/faldo'
  require 'biointerchange/gff3o'
  require 'biointerchange/goxref'
  require 'biointerchange/gvf1o'
  require 'biointerchange/sio'
  require 'biointerchange/so'
  require 'biointerchange/sofa'

  # Registry for reader/writer management:
  require 'biointerchange/registry'

  # Reader/writer interfaces
  require 'biointerchange/reader'
  require 'biointerchange/model'
  require 'biointerchange/writer'

  #
  # TEXT MINING
  #

  # Text mining readers
  require 'biointerchange/textmining/text_mining_reader'
  require 'biointerchange/textmining/pubannos_json_reader'
  require 'biointerchange/textmining/pdfx_xml_reader'

  # Text mining model
  require 'biointerchange/textmining/document'
  require 'biointerchange/textmining/content'
  require 'biointerchange/textmining/content_connection'
  require 'biointerchange/textmining/process'
  
  # Text mining writers
  require 'biointerchange/textmining/text_mining_rdf_ntriples'
  
  #
  # GENOMICS
  #

  ### GFF3 ###

  # Reader
  require 'biointerchange/genomics/gff3_reader'

  # Feature base model
  require 'biointerchange/genomics/gff3_pragmas'
  require 'biointerchange/genomics/gff3_feature_set'
  require 'biointerchange/genomics/gff3_feature'

  # Writer
  require 'biointerchange/genomics/gff3_rdf_ntriples'
  
  ### GVF ###

  # Reader
  require 'biointerchange/genomics/gvf_reader'

  # Feature base model
  require 'biointerchange/genomics/gvf_pragmas'
  require 'biointerchange/genomics/gvf_feature_set'
  require 'biointerchange/genomics/gvf_feature'

  # Writer
  # ...same GFF3 writer

  #
  # PHYLOGENETICS
  #

  # Reader
  require 'biointerchange/phylogenetics/newick_reader'

  # Model
  require 'biointerchange/phylogenetics/tree_set'

  # Writer
  require 'biointerchange/phylogenetics/cdao_rdf_ntriples'

  #
  # ACTUAL COMMAND LINE IMPLEMENTATION
  #

  # Option parsing 
  require 'getopt/long'

  def self.cli
    begin
      opts = [
        ["--help", "-h", Getopt::BOOLEAN],
        ["--debug", "-d", Getopt::BOOLEAN],                     # set debug mode => print stack traces
        ["--no_rdf_graph_optimization", "-n", Getopt::BOOLEAN], # set self.skip_rdf_graph to false
        ["--batchsize", "-b", Getopt::OPTIONAL],                # batchsize for readers/writers that support +postpone?+
        ["--input", "-i", Getopt::REQUIRED],                    # input file format
        ["--rdf", "-r", Getopt::REQUIRED],                      # output file format
        ["--file", "-f", Getopt::OPTIONAL],                     # file to read, will read from STDIN if not supplied
        ["--out", "-o", Getopt::OPTIONAL],                      # output file, will out to STDOUT if not supplied
        ["--version", "-v", Getopt::BOOLEAN]                    # output the version number of the gem and exit
      ]
      reader_writer_pairs = Registry.reader_writer_pairs
      reader_writer_pairs.each_index { |reader_writer_pair_index|
        reader_id, writer_id = reader_writer_pairs[reader_writer_pair_index]
        Registry.options_help(reader_id).each { |option_description|
          option, description = option_description
          opts |= [ [ "--annotate_#{option.sub(/\s.*$/, '')}", Getopt::OPTIONAL ] ]
        }
      }
      puts "#{opts}"
      opt = Getopt::Long.getopts(*opts)
      
      if opt['help'] or not (opt['input'] and opt['rdf'] or opt['version']) then
        puts "Usage: ruby #{$0} -i <format> -r <format> [options]"
        puts ''
        puts 'Supported input formats (--input <format>/-i <format>):'
        Registry.reader_descriptions.each_pair { |reader_id, description|
          puts "  #{reader_id}#{' ' * (34 - reader_id.length)} : #{description}"
        }
        puts ''
        puts 'Supported output formats (--rdf <format>/-r <format>)'
        Registry.writer_descriptions.each_pair { |writer_id, description|
          puts "  #{writer_id}#{' ' * (34 - writer_id.length)} : #{description}"
        }
        puts ''
        puts 'I/O options:'
        puts '  -b <size>/--batchsize <size>       : process input in batches of the given size'
        puts '                                      (if supported, see below for valid input/rdf pairs)'
        puts '  -f <file>/--file <file>            : file to read; STDIN used if not supplied'
        puts '  -o <file>/--out <file>             : output file; STDOUT used if not supplied'
        puts ''
        puts 'Other options:'
        puts '  -v / --version                     : print the Gem\'s version number and exit'
        puts '  -d / --debug                       : turn on debugging output (for stacktraces)'
        puts '  -h  --help                         : this message'
        puts ''
        puts 'Input-/RDF-format specific options:'
        reader_writer_pairs.each_index { |reader_writer_pair_index|
          reader_id, writer_id = reader_writer_pairs[reader_writer_pair_index]
          puts "  Input format  : #{reader_id}"
          puts "  Output format : #{writer_id}"
          Registry.options_help(reader_id).each { |option_description|
            option, description = option_description
            puts "    --annotate_#{option}#{' ' * (21 - option.length)} : #{description}"
          }
          puts '' if reader_writer_pair_index + 1 < reader_writer_pairs.length
        }
      
        exit 1
      end
      
      # Print version number and exit:
      if opt['version'] then
        puts "BioInterchange #{Gem.loaded_specs["biointerchange"].version}"
        exit
      end

      # Turn off optimization, if requested. This will generate an RDF graph in memory and
      # at least double memory requirements and runtime.
      @@skip_rdf_graph = false if opt['no_rdf_graph_optimization']

      # Check if the input/rdf options are supported:
      unsupported_combination unless Registry.is_supported?(opt['input'], opt['rdf'])
      
      if opt['batchsize'] then
        batching_not_supported unless Registry.is_supporting_batch_processing?(opt['input'], opt['rdf'])
        wrong_type('batchsize', 'a positive integer') unless opt['batchsize'].match(/^[1-9][0-9]*$/)
      end

      # Create a parameter map that can be passed along to Reader implementations:
      map = {
        'input'  => opt['input'],
        'output' => opt['output']
      }
      map['batchsize'] = opt['batchsize'].to_i if opt['batchsize']
      opt.each_key { |key|
        map[key.sub(/^annotate_/, '')] = opt[key] if key.start_with?('annotate_')
      }

      # Generate model from file (deserialization).
      reader_class, *args = Registry.reader(opt['input'])
      reader = reader_class.new(*BioInterchange::get_parameters(map, args))
    
      input_source = nil
      if opt['file'] then
        input_source = File.new(opt['file'], 'r')
      else
        input_source = STDIN
      end
    
      output_source = nil
      if opt['out'] then
        output_source = File.new(opt['out'], 'w')
      else
        output_source = STDOUT
      end

      # Generate rdf from model (serialization).
      writer = Registry.writer(opt['rdf']).new(output_source)
      
      begin
        model = reader.deserialize(input_source)
        writer.serialize(model)
      end while reader.postponed?

    rescue ArgumentError => e
      $stderr.puts e.message
      $stderr.puts e.backtrace if opt['debug']
      exit 1
    rescue Getopt::Long::Error => e
      $stderr.puts e.message
      #$stderr.puts e.backtrace if opt['debug']
      exit 1
    rescue BioInterchange::Exceptions::InputFormatError => e
      $stderr.puts e.message
      $stderr.puts e.backtrace if opt['debug']
      exit 2
    end
  end

  #
  # Helper functions
  #

  # Returns the values of several named parameters.
  #
  # +map+:: a map of named parameters and their values
  # +parameters+:: the names of the parameter values we are interested in
  def self.get_parameters(map, parameters)
    parameters.map { |parameter|
      if parameter.instance_of? Array then
        parameter[0].call(*BioInterchange::get_parameters(map, parameter[1..-1]))
      else
        map[parameter]
      end
    }
  end

  # Returns a "safe" version of a label that can be used as a Ruby method name.
  #
  # +label+:: string that should be converted into a "safe" string that can be used as a Ruby method name
  def self.make_safe_label(label)
    label.gsub(/[ '-.<>\/]/, '_').gsub(/\([^\)]*?\)/, '').sub(/^(\d+)/, "a_#{$1}").gsub(/^_+|_+$/, '').gsub(/_+/, '_')
  end

private

  def self.batching_not_supported
    raise ArgumentError, 'Batching is not supported for this input/output format combination.'
  end

  def self.unsupported_combination
    raise ArgumentError, 'This input/output format combination is not supported.'
  end

  def self.wrong_type(parameter, expected_type)
    raise ArgumentError, "The parameter '#{parameter}' needs to be #{expected_type}."
  end

end

# Overwrite RDF::Graph implementation, in case we do not want to keep
# the complete graph in memory. If the implementing writer does not
# set an output stream via +fast_ostream+, then fall back to the original
# implementation.
module RDF

class Graph
  # DO NOT keep old insert implementation due to infinite recursion caused by module loading dependencies!
  # alias_method :graph_building_insert, :insert

  # Set an output stream for writing in +insert+.
  #
  # +ostream+:: Output stream that is populated by +insert+, if optimization can be carried out.
  def fast_ostream(ostream)
    @ostream = ostream
  end

  # Alternative implementation to +insert+, which can immediately output N-Triples instead
  # of building an in-memory graph first.
  #
  # +statement+:: RDF statement that should be serialized.
  def insert(statement)
    if BioInterchange::skip_rdf_graph and @ostream then
      @ostream.puts(statement.to_ntriples)
    else
      insert_statement(statement)
    end
  end

end

end

