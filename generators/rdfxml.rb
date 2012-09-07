#!/usr/bin/ruby

require 'rdf/rdfxml'

if ARGV.length != 2 then
  puts 'Usage: rdfxml.rb ontology.xml OntologyName'
  puts ''
  puts 'Reads the given ontology in RDF/XML format and produces a Ruby wrapper'
  puts 'for convient URI access to it.'
end

reader = RDF::RDFXML::Reader.open(ARGV[0])

model = {}

reader.each_statement { |statement|
  model[statement.subject] = {} unless model.has_key?(statement.subject)
  model[statement.subject][statement.predicate] = statement.object
}

puts "class #{ARGV[1]}"
puts ''

model.keys.each { |key|
  entry = model[key]
  type = entry[RDF.type]

  # TODO Check whether label present

  if type then
    if type == RDF::OWL.ObjectProperty or type == RDF::OWL.DatatypeProperty or type == RDF::OWL.Class then
      label = entry[RDF::RDFS.label].to_s
      next if label.empty?
      puts "    def #{label.gsub(' ', '_')}"
      puts "      \"#{key.to_s}\""
      puts '    end'
    end
  end
}

puts 'end'

