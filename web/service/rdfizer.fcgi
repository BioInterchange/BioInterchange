#!/usr/bin/ruby

require 'rubygems'
require 'net/http'
require 'uri'
require 'cgi'
require 'fcgi'

# This will be obsolete once BioInterchange has been turned into a gem:
load '../../lib/biointerchange/core.rb'
load '../../lib/biointerchange/reader.rb'
load '../../lib/biointerchange/writer.rb'
load '../../lib/biointerchange/readers/text_mining_reader.rb'
load '../../lib/biointerchange/readers/pubannos_json_reader.rb'
load '../../lib/biointerchange/readers/pdfx_xml_reader.rb'
load '../../lib/biointerchange/writers/text_mining_rdf_ntriples.rb'
load '../../lib/biointerchange/tm/content.rb'
load '../../lib/biointerchange/tm/document.rb'
load '../../lib/biointerchange/tm/process.rb'

FCGI.each { |fcgi|
  request = fcgi.in.read

  fcgi.out.print("Content-Type: text/plain\r\n")
  fcgi.out.print("\r\n")

  begin
    opt = JSON.parse(request)
    reader = BioInterchange::TextMining::PubannosJsonReader.new(opt['name'], opt['name_id'], opt['date'], BioInterchange::TextMining::Process::UNSPECIFIED, opt['version'])
    istream, ostream = IO.pipe
    ostream.print(request)
    ostream.close
    model = reader.deserialize(istream)
    istream, ostream = IO.pipe
    BioInterchange::TextMining::RDFWriter.new(ostream).serialize(model)
    ostream.close
    fcgi.out.print(istream.read)
  rescue => e
    fcgi.out.print("#{e.backtrace}\n")
  end
  fcgi.finish
}

