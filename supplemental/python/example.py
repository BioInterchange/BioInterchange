import biointerchange
from biointerchange import *

# Get the URI of an ontology term by label:
GFF3O.seqid()

# Ambiguous labels will return an array of URIs:
# "start" can refer to a sub-property of "feature_properties" or "target_properties"
GFF3O.start()
# "feature_properties" can be either a datatype or object property
GFF3O.feature_properties()

# Use build-in method "is_datatype_property" to resolve ambiguity:
# (Note: there is exactly one item in the result set, so the selection of the first item is acceptable.)
feature_properties = filter(lambda uri: GFF3O.is_datatype_property(uri), GFF3O.feature_properties())[0]

# Use build-in method "with_parent" to pick properties based on their context:
GFF3O.with_parent(GFF3O.start(), feature_properties)

