#!/usr/bin/ruby

require 'rdf/rdfxml'

if ARGV.length != 2 then
  puts 'Usage: rdfxml.rb ontology.xml OntologyName'
  puts ''
  puts 'Reads the given ontology in RDF/XML format and produces a Ruby wrapper'
  puts 'for convient URI access to it.'
  exit 1
end

# Will later be used for extracting comments from SOFA.
OBO_DEF = RDF::URI.new('http://purl.obolibrary.org/obo/def')

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

      # Try to print out some comment for RDoc. The comment identification depends on the ontology used:
      if entry[RDF::DC.description] then
        puts "    # #{entry[RDF::DC.description]}\n"
      elsif entry[OBO_DEF] then
        puts "    # #{entry[OBO_DEF].to_s.sub(/^"(.*)" \[(.*)\]$/, '\1 (\2)')}\n"
      end
      puts "    def self.#{generated_label}"
      puts "      RDF::URI.new('#{uri}')"
      puts '    end'
      puts ''
      object_properties[uri] = true if type == RDF::OWL.ObjectProperty
      datatype_properties[uri] = true if type == RDF::OWL.DatatypeProperty
      classes[uri] = true if type == RDF::OWL.Class
    end
  end
}

puts '    # Determines whether the given URI is an object property.'
puts '    #'
puts '    # +uri+:: URI that is tested for being an object property'
puts '    def self.is_object_property?(uri)'
object_properties.keys.each { |uri| puts "      return true if uri == RDF::URI.new('#{uri}')" }
puts '      false'
puts '    end'
puts ''

puts '    # Determines whether the given URI is a datatype property.'
puts '    #'
puts '    # +uri+:: URI that is tested for being a datatype property'
puts '    def self.is_datatype_property?(uri)'
datatype_properties.keys.each { |uri| puts "      return true if uri == RDF::URI.new('#{uri}')" }
puts '      false'
puts '    end'
puts ''

puts '    # Determines whether the given URI is a class.'
puts '    #'
puts '    # +uri+:: URI that is tested for being a class'
puts '    def self.is_class?(uri)'
classes.keys.each { |uri| puts "      return true if uri == RDF::URI.new('#{uri}')" }
puts '      false'
puts '    end'
puts ''

puts 'end'
puts ''

