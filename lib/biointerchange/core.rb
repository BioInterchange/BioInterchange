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
  require 'biointerchange/gff3o'
  require 'biointerchange/goxref'
  require 'biointerchange/gvf1o'
  require 'biointerchange/sio'
  require 'biointerchange/so'
  require 'biointerchange/sofa'

  # Reader/writer interfaces
  require 'biointerchange/reader'
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
  # ACTUAL COMMAND LINE IMPLEMENTATION
  #

  # Option parsing 
  require 'getopt/long'

  def self.cli
    begin
      opt = Getopt::Long.getopts(
        ["--help", "-h", Getopt::BOOLEAN],
        ["--debug", "-d", Getopt::BOOLEAN],                     # set debug mode => print stack traces
        ["--no_rdf_graph_optimization", "-n", Getopt::BOOLEAN], # set self.skip_rdf_graph to false
        ["--batchsize", "-b", Getopt::OPTIONAL],                # batchsize for readers/writers that support +postpone?+
        ["--input", "-i", Getopt::REQUIRED],                    # input file format
        ["--rdf", "-r", Getopt::REQUIRED],                      # output file format
        ["--annotate_name", Getopt::OPTIONAL],                  # name of resourcce/tool/person
        ["--annotate_name_id", Getopt::OPTIONAL],               # uri of resource/tool/person
        ["--annotate_date", Getopt::OPTIONAL],                  # date of processing/annotation
        ["--annotate_version", Getopt::OPTIONAL],               # version number of resource
        ["--file", "-f", Getopt::OPTIONAL],                     # file to read, will read from STDIN if not supplied
        ["--out", "-o", Getopt::OPTIONAL],                      # output file, will out to STDOUT if not supplied
        ["--version", "-v", Getopt::BOOLEAN]                    # output the version number of the gem and exit
      )
      
      if opt['help'] or not (opt['input'] and opt['rdf'] or opt['version']) then
        puts "Usage: ruby #{$0} -i <format> -r <format> [options]"
        puts ''
        puts 'Supported input formats (--input <format>/-i <format>):'
        puts '  biointerchange.gff3                : GFF3'
        puts '  biointerchange.gvf                 : GVF'
        puts '  dbcls.catanns.json                 : PubAnnotation JSON'
        puts '  uk.ac.man.pdfx                     : PDFx XML'
        puts ''
        puts 'Supported output formats (--rdf <format>/-r <format>)'
        puts '  rdf.biointerchange.gff3            : RDF N-Triples for the following input'
        puts '    biointerchange.gff3'
        puts '  rdf.biointerchange.gvf             : RDF N-Triples for the following input'
        puts '    biointerchange.gff3'
        puts '    biointerchange.gvf'
        puts '  rdf.bh12.sio                       : RDF N-Triples for the following inputs'
        puts '    dbcls.catanns.json'
        puts '    uk.ac.man.pdfx'
        puts ''
        puts 'I/O options:'
        puts '  -f <file>/--file <file>            : file to read; STDIN used if not supplied'
        puts '  -o <file>/--out <file>             : output file; STDOUT used if not supplied'
        puts ''
        puts 'Input-/RDF-format specific options:'
        puts '  Input: dbcls.catanns.json, uk.ac.man.pdfx'
        puts '  Output: rdf.bh12.sio'
        puts '  Options:'
        puts '    --annotate_date <date>           : date of processing/annotation (optional)'
        puts '    --annotate_version <version>     : version number of resource (optional)'
        puts '    --annotate_name <name>           : name of resource/tool/person (required)'
        puts '    --annotate_name_id <id>          : URI of resource/tool/person (required)'
        puts ''
        puts 'Input-/RDF-format specific options:'
        puts '  Input: biointerchange.gff3 or biointerchange.gvf'
        puts '  Output: rdf.biointerchange.gff3 or rdf.biointerchange.gvf'
        puts '  Options:'
        puts '    -b <size>/--batchsize <size>     : process features in batches of the given size (optional)'
        puts '    -t <date>/--date <date>          : date when the GFF3/GVF file was created (optional)'
        puts '    --name <name>                    : name of the GFF3/GVF file creator (optional)'
        puts '    --name_id <id>                   : email address of the GFF3/GVF file creator (optional)'
        puts ''
        puts 'Other options:'
        puts '  -v / --version                     : print the Gem\'s version number and exit'
        puts '  -d / --debug                       : turn on debugging output (for stacktraces)'
        puts '  -h  --help                         : this message'
      
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
      if opt['input'] == 'dbcls.catanns.json' or opt['input'] == 'uk.ac.man.pdfx' then
        if opt['rdf'] == 'rdf.bh12.sio' then
          raise ArgumentError, 'Require --name and --name_id options to specify source of annotations (e.g., a manual annotators name, or software tool name) and their associated URI (e.g., email address, or webaddress).' unless opt['name'] and opt['name_id']
        else
          unsupported_combination
        end
      elsif opt['input'] == 'biointerchange.gff3' then
        if opt['rdf'] == 'rdf.biointerchange.gff3' then
          # Okay. No further arguments required.
        else
          unsupported_combination
        end
      elsif opt['input'] == 'biointerchange.gvf' then
        if opt['rdf'] == 'rdf.biointerchange.gff3' or opt['rdf'] == 'rdf.biointerchange.gvf' then
          # Okay. No further arguments required.
        else
          unsupported_combination
        end
      else
        unsupported_combination
      end
      
      wrong_type('batchsize', 'a positive integer') if opt['batchsize'] and not opt['batchsize'].match(/^[1-9][0-9]*$/)

      opt['batchsize'] = opt['batchsize'].to_i if opt['batchsize']

      # Generate model from file (deserialization).
      # Note: if-clauses are lexicographically ordered. 
      reader = nil
      if opt['input'] == 'biointerchange.gff3' then
        reader = BioInterchange::Genomics::GFF3Reader.new(opt['annotate_name'], opt['annotate_name_id'], opt['annotate_date'], opt['batchsize'])
      elsif opt['input'] == 'biointerchange.gvf' then
        reader = BioInterchange::Genomics::GVFReader.new(opt['annotate_name'], opt['annotate_name_id'], opt['annotate_date'], opt['batchsize'])
      elsif opt['input'] == 'dbcls.catanns.json' then
        reader = BioInterchange::TextMining::PubannosJsonReader.new(opt['annotate_name'], opt['annotate_name_id'], opt['annotate_date'], BioInterchange::TextMining::Process::UNSPECIFIED, opt['version'])
      elsif opt['input'] == 'uk.ac.man.pdfx' then
        reader = BioInterchange::TextMining::PdfxXmlReader.new(opt['annotate_name'], opt['annotate_name_id'], opt['annotate_date'], BioInterchange::TextMining::Process::UNSPECIFIED, opt['annotate_version'])
      end
    
      if opt["file"]
        input_source = File.new(opt["file"],'r')
      else
        input_source = STDIN
      end
    
      # Generate rdf from model (serialization).
      # Note: if-clauses are lexicographically ordered. 
      writer = nil
      if opt['rdf'] == 'rdf.bh12.sio' then
        writer = BioInterchange::TextMining::RDFWriter.new(File.new(opt['out'], 'w')) if opt['out']
        writer = BioInterchange::TextMining::RDFWriter.new(STDOUT) unless opt['out']
      end
      if opt['rdf'] == 'rdf.biointerchange.gff3' or opt['rdf'] == 'rdf.biointerchange.gvf' then
        writer = BioInterchange::Genomics::RDFWriter.new(File.new(opt['out'], 'w')) if opt['out']
        writer = BioInterchange::Genomics::RDFWriter.new(STDOUT) unless opt['out']
      end
      
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

