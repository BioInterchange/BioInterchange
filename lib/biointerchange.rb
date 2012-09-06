module BioInterchange

  # Text mining readers
  require 'biointerchange/readers/json'
  #require 'biointerchange/readers/xml'

	# Text mining converters
	require 'biointerchange/tm/document.rb'
	require 'biointerchange/tm/content.rb'
	require 'biointerchange/tm/process.rb'
	
	# Text mining writers
	require 'biointerchange/writers/writer.rb'
	
	require 'getopt/long'
	include Getopt
	
	opt = Getopt::Long.getopts(
	  ["--name", REQUIRED], #name of resourcce/tool/person
	  ["--name_id", REQUIRED], #uri of resource/tool/person
	  ["--date", REQUIRED], #date of processing/annotation
	  ["--version", REQUIRED], #version number of resource
	  ["--file", "-f", REQUIRED], #file to read, will read from STDIN if not supplied
	  ["--out", "-o", REQUIRED] #output file, will out to STDOUT if not supplied
	)
	
	include BioInterchange::TextMining
	include BioInterchange::IO
	
	raise ArgumentError, 'Require --name and -name_id options to specify source of annotations (e.g., a manual annotators name, or software tool name) and their associated URI (e.g., email address, or webaddress).' unless opt['name'] and opt['name_id']

	
	opt['date'] = nil unless opt['date']
	opt['version'] = nil unless opt['version']
	
	raise ArgumentError, 'Require --file or -f switch to specify file to process into RDF.' unless opt['file']
	
	
	#generate model from file (deserialise)
	reader = nil
	
	if opt['file'].match(/\.json$/)
	  reader = JsonReader.new("pubannos", opt['name'], opt['name_id'], opt['date'], Process::UNSPECIFIED, opt['version'])
	elsif opt["file"].match(/\.xml$/)
	  puts 'xml unimplemented'
	else
	  raise ArgumentError, 'Unable to guess file type, please use .json or .xml file extensions.'
	end
	

  model = nil
  if opt["file"]
    model = reader.deserialize(File.new(opt["file"],'r'))
  else
    model = reader.deserialize(STDIN)
  end

  #generate rdf from model (serialise)
  writer = nil
  if opt["out"]
    writer = RDFWriter.new(File.new(opt["out"],'w'))
  else
    writer = RDFWriter.new(STDOUT)
  end
  
  writer.serialize(model)
	


end

