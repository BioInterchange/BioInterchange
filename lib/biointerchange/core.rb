# BioInterchange converts non-RDF data formats into RDF.
#
# Convert TSV, XML, GFF3, GVF and other files into RDF triples using
# BioInterchange's command-line tool, its web-services or make use
# of it as a gem in your own Ruby implementation.
module BioInterchange

  ### Global behaviour settings, which can be altered programmatically or via the CLI:

  # If true, then RDF::Graph's & co will be used. Should only be applied for
  # performance comparisons between the "standard" Ruby gem implementation and
  # BioInterchange's optimized RDF handling.
  @@evaluation = false
  def self.evaluation
    @@evaluation
  end

  # BioInterchange can output RDF in two formats: Turtle (default) and N-Triples.
  # The two corresponding Ruby constants for these two output formats are:
  #   Turtle:    `:turtle`
  #   N-Triples: `:ntriples`
  @@format = :turtle
  def self.format
    @@format
  end

  # Default URI prefix that is used when RDFizing data:
  @@default_uri_prefix = ''

  # If input/rdf options permit batching, but no batchsize has been provided by
  # the user, then use this default batch size.
  @@default_batch_size = 100

  # Custom URI implementation; replaces broken RDF::URI
  require 'biointerchange/uri'

  # Custom Exceptions and Errors
  require 'biointerchange/exceptions'

  # Ontologies (besides the ones from the 'rdf' gem), vocabularies and
  # other mappings (e.g., database abbreviations to URIs):
  require 'biointerchange/life_science_registry'
  require 'biointerchange/cdao'
  require 'biointerchange/faldo'
  require 'biointerchange/gfvo'
  require 'biointerchange/goxref'
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

  # Helper class for dealing with genomic locations
  require 'biointerchange/genomics/locations'

  # Reader
  require 'biointerchange/genomics/gff3_reader'

  # Feature base model
  require 'biointerchange/genomics/gff3_pragmas'
  require 'biointerchange/genomics/gff3_feature_set'
  require 'biointerchange/genomics/gff3_feature'
  require 'biointerchange/genomics/gff3_feature_sequence.rb'

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

  ### VCF ###

  # Reader
  require 'biointerchange/genomics/vcf_reader'

  # Feature base model
  require 'biointerchange/genomics/vcf_feature_set'
  require 'biointerchange/genomics/vcf_feature'

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
        ["--batchsize", "-b", Getopt::OPTIONAL],                # batchsize for readers/writers that support +postpone?+
        ["--ntriples", "-n", Getopt::BOOLEAN],                  # produce N-Triples instead of Turtle
        ["--evaluation", "-z", Getopt::BOOLEAN],                # use RDF gem implementation for mem/speed comparison
        ["--uri", "-u", Getopt::OPTIONAL],                      # URI prefix to use when serializing RDF
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
        puts '  -f <file> / --file <file>          : file to read; STDIN used if not supplied'
        puts '  -o <file> / --out <file>           : output file; STDOUT used if not supplied'
        puts '  -n / --ntriples                    : output RDF N-Triples (instead of RDF Turtle)'
        puts '  -u <uri> / --uri <prefix>          : URI prefix to use'
        puts "                                       (default: #{@@default_uri_prefix})"
        puts '  -b <size>/--batchsize <size>       : process input in batches of the given size'
        puts '                                      (if supported, see below for valid input/rdf pairs;'
        puts "                                       if supported, but not set, default value is #{@@default_batch_size})"
        puts ''
        puts 'Other options:'
        puts '  -v / --version                     : print the Gem\'s version number and exit'
        puts '  -d / --debug                       : turn on debugging output (for stacktraces)'
        puts '  -z / --evaluation                  : use \'RDF\' gem implementation (slow & memory intensive,'
        puts '                                       only included for performance evaluation comparisons)'
        puts '  -h  --help                         : this message'
        puts ''
        puts 'Input-/output-format specific options:'
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
      @@evaluation = true if opt['evaluation']

      # Switch to N-Triples output:
      @@format = :ntriples if opt['ntriples']

      # Check if the input/rdf options are supported:
      unsupported_combination unless Registry.is_supported?(opt['input'], opt['rdf'])
      
      # If a batchsize is given, then use it. Otherwise, check if the input/rdf combination
      # supports batching and set a default batch value.
      if opt['batchsize'] then
        batching_not_supported unless Registry.is_supporting_batch_processing?(opt['input'], opt['rdf'])
        wrong_type('batchsize', 'a positive integer') unless opt['batchsize'].match(/^[1-9][0-9]*$/)
      elsif Registry.is_supporting_batch_processing?(opt['input'], opt['rdf']) then
        opt['batchsize'] = @@default_batch_size
      end

      # Create a parameter map that can be passed along to Reader implementations:
      map = {
        'input'  => opt['input'],
        'output' => opt['output']
      }
      map['batch_size'] = opt['batchsize'].to_i if opt['batchsize']
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
        writer.serialize(model, opt['uri'])
      end while reader.postponed?

    rescue Interrupt
      # The user hit Ctrl-C, which is okay and does not need error reporting.
      exit 0
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
    label.gsub(/[ '-.<>\/]/, '_').gsub(/\([^\)]*?\)/, '').sub(/^(\d+)/){ "a_#{$1}" }.gsub(/^_+|_+$/, '').gsub(/_+/, '_').gsub(/_([A-Z])+/x){ "#{$1}" }
  end

private

  def self.unsupported_combination
    raise ArgumentError, 'This input/output format combination is not supported.'
  end

  def self.wrong_type(parameter, expected_type)
    raise ArgumentError, "The parameter '#{parameter}' needs to be #{expected_type}."
  end

end

