import biointerchange
from biointerchange import *
from rdflib.namespace import Namespace

def print_resource(resource):
    print "    " + resource
    print "        Ontology class:             " + str(GFF3O.is_class(resource))
    print "        Ontology object property:   " + str(GFF3O.is_object_property(resource))
    print "        Ontology datatype property: " + str(GFF3O.is_datatype_property(resource))

# Get the URI of an ontology term by label:
print "'seqid' property:"
print_resource(GFF3O.seqid())

# Ambiguous labels will return an array of URIs:
# "start" can refer to a sub-property of "feature_properties" or "target_properties"
print "'start' properties:"
for start_synonym in GFF3O.start():
    print_resource(start_synonym)

# "feature_properties" can be either a datatype or object property
print "'feature_properties' properties:"
for feature_properties_synonym in GFF3O.feature_properties():
    print_resource(feature_properties_synonym)

# Use build-in method "is_datatype_property" to resolve ambiguity:
# (Note: there is exactly one item in the result set, so the selection of the first item is acceptable.)
feature_properties = filter(lambda uri: GFF3O.is_datatype_property(uri), GFF3O.feature_properties())
print "'feature_properties' properties, which are a datatype property:"
for feature_property in feature_properties:
    print_resource(feature_property)

# Use build-in method "with_parent" to pick properties based on their context:
print "'start' property with parent datatype property 'feature_properties':"
for feature_property in GFF3O.with_parent(GFF3O.start(), feature_properties[0]):
    print_resource(feature_property)

