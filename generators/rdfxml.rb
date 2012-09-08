#!/usr/bin/ruby

require 'rdf/rdfxml'

if ARGV.length != 2 then
  puts 'Usage: rdfxml.rb ontology.xml OntologyName'
  puts ''
  puts 'Reads the given ontology in RDF/XML format and produces a Ruby wrapper'
  puts 'for convient URI access to it.'
  exit 1
end

reader = RDF::RDFXML::Reader.open(ARGV[0])

model = {}

reader.each_statement { |statement|
  model[statement.subject] = {} unless model.has_key?(statement.subject)
  model[statement.subject][statement.predicate] = statement.object
}

object_properties = {}
datatype_properties = {}
classes = {}

puts "class #{ARGV[1]}"
puts ''

model.keys.each { |key|
  entry = model[key]
  type = entry[RDF.type]

  # TODO Check whether label present

  if type then
    if type == RDF::OWL.ObjectProperty or type == RDF::OWL.DatatypeProperty or type == RDF::OWL.Class then
      label = entry[RDF::RDFS.label].to_s
      generated_label = label.gsub(/[ '-.<>]/, '_').gsub(/\([^\)]*?\)/, '').sub(/^(\d+)/, "a_#{$1}").gsub(/^_+|_+$/, '').gsub(/_+/, '_')
      next if generated_label.empty?
      uri = key.to_s
      puts "    def #{generated_label}"
      puts "      RDF::URI.new('#{uri}')"
      puts '    end'
      puts ''
      object_properties[uri] = true if type == RDF::OWL.ObjectProperty
      datatype_properties[uri] = true if type == RDF::OWL.DatatypeProperty
      classes[uri] = true if type == RDF::OWL.Class
    end
  end
}

puts '    def is_object_property?(uri)'
object_properties.keys.each { |uri| puts "      return true if uri == RDF::URI.new('#{uri}')" }
puts '      false'
puts '    end'
puts ''

puts '    def is_datatype_property?(uri)'
datatype_properties.keys.each { |uri| puts "      return true if uri == RDF::URI.new('#{uri}')" }
puts '      false'
puts '    end'
puts ''

puts '    def is_class?(uri)'
classes.keys.each { |uri| puts "      return true if uri == RDF::URI.new('#{uri}')" }
puts '      false'
puts '    end'
puts ''

puts 'end'
puts ''
puts 'end'

