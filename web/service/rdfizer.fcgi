#!/usr/bin/ruby

require 'rubygems'
require 'net/http'
require 'uri'
require 'cgi'
require 'fcgi'

# So, these requires are also in the GFF3 writer. Figure out why "load"
# appears to ignore those and I have to explicitly re-state them here.
require 'rdf'
require 'rdf/ntriples'

# This will be obsolete once BioInterchange has been turned into a gem:
load '../../lib/biointerchange/core.rb'
load '../../lib/biointerchange/cdao.rb'
load '../../lib/biointerchange/faldo.rb'
load '../../lib/biointerchange/gff3o.rb'
load '../../lib/biointerchange/gvf1o.rb'
load '../../lib/biointerchange/sio.rb'
load '../../lib/biointerchange/so.rb'
load '../../lib/biointerchange/sofa.rb'
load '../../lib/biointerchange/reader.rb'
load '../../lib/biointerchange/model.rb'
load '../../lib/biointerchange/writer.rb'
load '../../lib/biointerchange/textmining/text_mining_reader.rb'
load '../../lib/biointerchange/textmining/pubannos_json_reader.rb'
load '../../lib/biointerchange/textmining/pdfx_xml_reader.rb'
load '../../lib/biointerchange/textmining/text_mining_rdf_ntriples.rb'
load '../../lib/biointerchange/textmining/content.rb'
load '../../lib/biointerchange/textmining/document.rb'
load '../../lib/biointerchange/textmining/process.rb'
load '../../lib/biointerchange/genomics/gff3_feature.rb'
load '../../lib/biointerchange/genomics/gff3_feature_set.rb'
load '../../lib/biointerchange/genomics/gff3_pragmas.rb'
load '../../lib/biointerchange/genomics/gff3_reader.rb'
load '../../lib/biointerchange/genomics/gvf_feature.rb'
load '../../lib/biointerchange/genomics/gvf_feature_set.rb'
load '../../lib/biointerchange/genomics/gvf_pragmas.rb'
load '../../lib/biointerchange/genomics/gvf_reader.rb'
load '../../lib/biointerchange/genomics/gff3_rdf_ntriples.rb'

#input_formats = {}
#input_formats['dbcls.catanns.json'] = [ BioInterchange::TextMining::PubAnnosJSONReader, 'name', 'name_id', 'date', [ Proc.new { |*args| BioInterchange::TextMining::TMReader::determine_process(*args) }, 'name_id' ], 'version' ]
#input_formats['uk.ac.man.pdfx'] = [ BioInterchange::TextMining::PDFxXMLReader, 'name', 'name_id', 'date', [ Proc.new { |*args| BioInterchange::TextMining::TMReader::determine_process(*args) }, 'name_id' ], 'version' ]
#input_formats['biointerchange.gff3'] = [ BioInterchange::Genomics::GFF3Reader, 'name', 'name_uri', 'date' ]
#input_formats['biointerchange.gvf'] = [ BioInterchange::Genomics::GVFReader, 'name', 'name_uri', 'date' ]

#output_formats = {}
#output_formats['rdf.bh12.sio'] = BioInterchange::TextMining::RDFWriter
#output_formats['rdf.biointerchange.gff3'] = BioInterchange::Genomics::RDFWriter
#output_formats['rdf.biointerchange.gvf'] = BioInterchange::Genomics::RDFWriter

FCGI.each { |fcgi|
  request = fcgi.in.read

  fcgi.out.print("Content-Type: text/plain\r\n")
  fcgi.out.print("\r\n")

  begin
    request = JSON.parse(request)
    parameters = request['parameters']
    parameters = JSON.parse(URI.decode(parameters)) if parameters.kind_of?(String)
    data = URI.decode(request['data'])

    raise ArgumentError, 'An input format must be given in the meta-data using the key "input".' unless parameters['input']
    raise ArgumentError, "Unknown input format \"#{parameters['input']}\"." unless input_formats[parameters['input']]
    raise ArgumentError, 'An output format must be given in the meta-data using the key "output".' unless parameters['output']
    raise ArgumentError, "Unknown output format \"#{parameters['output']}\"." unless output_formats[parameters['output']]

    reader_class, *args = Registry.reader(parameters['input'])
    reader = reader_class.new(*BioInterchange::get_parameters(parameters, args))
    istream, ostream = IO.pipe
    ostream.print(data)
    ostream.close
    model = reader.deserialize(istream)
    istream, ostream = IO.pipe
    Registry.writer(parameters['output']).new(ostream).serialize(model)
    ostream.close
    fcgi.out.print(istream.read)
  rescue => e
    fcgi.out.print("#{e.backtrace}\n")
  end
  fcgi.finish
}

