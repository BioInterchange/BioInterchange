#!/usr/bin/ruby

require 'rubygems'
require 'biointerchange'

include BioInterchange

def print_resource(resource)
  puts "    #{resource}"
  puts "        Ontology class:             #{GFF3O.is_class?(resource)}"
  puts "        Ontology object property:   #{GFF3O.is_object_property?(resource)}"
  puts "        Ontology datatype property: #{GFF3O.is_datatype_property?(resource)}"
end

# Get the URI of an ontology term by label:
puts "'seqid' property:"
print_resource(GFF3O.seqid())

# Ambiguous labels will return an array of URIs:
# "start" can refer to a sub-property of "feature_properties" or "target_properties"
puts "'start' properties:"
GFF3O.start().each { |start_synonym|
  print_resource(start_synonym)
}
# "feature_properties" can be either a datatype or object property
puts "'feature_properties' properties:"
GFF3O.feature_properties().each { |feature_properties_synonym|
  print_resource(feature_properties_synonym)
}

# Use build-in method "is_datatype_property" to resolve ambiguity:
# (Note: there is exactly one item in the result set, so the selection of the first item is acceptable.)
feature_properties = GFF3O.feature_properties().select { |uri| GFF3O.is_datatype_property?(uri) }
puts "'feature_properties' properties, which are a datatype property:"
feature_properties.each { |feature_property|
  print_resource(feature_property)
}

# Use build-in method "with_parent" to pick properties based on their context:
puts "'start' property with parent datatype property 'feature_properties':"
GFF3O.with_parent(GFF3O.start(), feature_properties[0]).each { |feature_property|
  print_resource(feature_property)
}

