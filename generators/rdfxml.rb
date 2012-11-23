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
  if statement.predicate == RDF.type then
    type = statement.object
    model[statement.subject][statement.predicate] = statement.object if type == RDF::OWL.ObjectProperty or type == RDF::OWL.DatatypeProperty or type == RDF::OWL.Class or type == RDF::OWL.NamedIndividual
  else
    model[statement.subject][statement.predicate] = statement.object
  end
}

object_properties = {}
datatype_properties = {}
classes = {}
named_individuals = {}

puts "class #{ARGV[1]}"
puts ''

parent_properties = {}
uri_to_labels = {}
combined_uris = {}
generated_labels = {}
comments = {}
model.keys.each { |key|
  entry = model[key]
  type = entry[RDF.type]

  # TODO Check whether label present

  next unless type

  label = entry[RDF::RDFS.label].to_s
  generated_label = label.gsub(/[ '-.<>]/, '_').gsub(/\([^\)]*?\)/, '').sub(/^(\d+)/, "a_#{$1}").gsub(/^_+|_+$/, '').gsub(/_+/, '_')
  next if generated_label.empty?
  uri = key.to_s

  uri_to_labels[uri] = label

  parent_properties[uri] = entry[RDF::RDFS.subPropertyOf] if entry[RDF::RDFS.subPropertyOf]

  set = comments[label]
  set = [] unless set
  comment = nil
  # Try to gather some comment for RDoc. The comment identification depends on the ontology used:
  if entry[RDF::DC.description] then
    comment = [ uri, "  # #{entry[RDF::DC.description].to_s.gsub(/\n|\r\n/, "\n  # ")}\n" ]
  elsif entry[OBO_DEF] then
    comment = [ uri, "  # #{entry[OBO_DEF].to_s.sub(/^"(.*)" \[(.*)\]$/, '\1 (\2)').gsub(/\n|\r\n/, "\n  # ")}\n" ]
  elsif entry[RDF::RDFS.comment] then
    comment = [ uri, "  # #{entry[RDF::RDFS.comment].to_s.gsub(/\n|\r\n/, "\n  # ")}\n" ]
  end
  comments[label] = set | [ comment ] if comment

  set = combined_uris[label]
  set = [] unless set
  combined_uris[label] = set | [ uri ]
  generated_labels[label] = generated_label

  object_properties[uri] = true if type == RDF::OWL.ObjectProperty
  datatype_properties[uri] = true if type == RDF::OWL.DatatypeProperty
  classes[uri] = true if type == RDF::OWL.Class
  named_individuals[uri] = true if type == RDF::OWL.NamedIndividual
}

model.keys.each { |key|
  entry = model[key]
  type = entry[RDF.type]

  label = entry[RDF::RDFS.label].to_s

  next unless type and combined_uris.has_key?(label)

  generated_label = generated_labels[label]
  uris = combined_uris[label]

  if comments[label] then
    if comments[label].length == 1 then
      comment = "#{comments[label][0][1]}  # (#{comments[label][0][0]})\n"
    else
      comment = ''
      introduction = true
      comments[label].each { |linked_comment|
        if introduction then
          introduction = false
          comment << "  # Either:\n"
        else
          comment << "  # Or:\n"
        end
        comment << "#{linked_comment[1].sub(/# /, '#   ')}  #   (#{linked_comment[0]})\n"
      }
    end
    puts comment
  end
  puts "  def self.#{generated_label}"
  if combined_uris[label].length == 1 then
    puts "    return RDF::URI.new('#{combined_uris[label][0]}')"
  else
    puts "    return [ #{combined_uris[label].map { |uri| "RDF::URI.new('#{uri}')" }.join(', ')} ]"
  end
  puts '  end'
  puts ''
}

puts '  # Determines whether the given URI is an object property.'
puts '  #'
puts '  # +uri+:: URI that is tested for being an object property'
puts '  def self.is_object_property?(uri)'
object_properties.keys.each { |uri| puts "    if uri == RDF::URI.new('#{uri}') then\n      return true\n    end" }
puts '    return false'
puts '  end'
puts ''

puts '  # Determines whether the given URI is a datatype property.'
puts '  #'
puts '  # +uri+:: URI that is tested for being a datatype property'
puts '  def self.is_datatype_property?(uri)'
datatype_properties.keys.each { |uri| puts "    if uri == RDF::URI.new('#{uri}') then\n      return true\n    end" }
puts '    return false'
puts '  end'
puts ''

puts '  # Determines whether the given URI is a class.'
puts '  #'
puts '  # +uri+:: URI that is tested for being a class'
puts '  def self.is_class?(uri)'
classes.keys.each { |uri| puts "    if uri == RDF::URI.new('#{uri}') then\n      return true\n    end" }
puts '    return false'
puts '  end'
puts ''

puts '  # Determines whether the given URI is a named individual.'
puts '  #'
puts '  # +uri+:: URI that is tested for being a named individual'
puts '  def self.is_named_individual?(uri)'
named_individuals.keys.each { |uri| puts "    if uri == RDF::URI.new('#{uri}') then\n      return true\n    end" }
puts '    return false'
puts '  end'
puts ''

puts '  # Returns only those URIs that fall under a designated parent URI.'
puts '  #'
puts '  # +uris+:: Set of URIs that are tested whether they have the given parent URI.'
puts '  # +parent+:: Parent URI.'
puts '  def self.with_parent(uris, parent)'
puts '    return uris.select { |uri| has_parent?(uri, parent) }'
puts '  end'
puts ''

puts '  # Recursively tries to determine the parent for a given URI.'
puts '  #'
puts '  # +uri+:: URI that is tested for whether it has the given parent URI.'
puts '  # +parent+:: Parent URI.'
puts '  def self.has_parent?(uri, parent)'
puts '    if @@parent_properties.has_key?(uri) then'
puts '      if @@parent_properties[uri] == parent then'
puts '        return true'
puts '      return has_parent?(@@parent_properties[uri], parent)'
puts '    end'
puts '    return false'
puts '  end'
puts ''

puts 'private'
puts "  @@parent_properties = {#{ parent_properties.keys.map { |uri| " RDF::URI.new('#{uri}') => RDF::URI.new('#{parent_properties[uri]}')" }.join(' ,') } }"
puts ''

puts 'end'

