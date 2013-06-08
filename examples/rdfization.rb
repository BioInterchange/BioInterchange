#!/usr/bin/ruby

require 'rubygems'
require 'biointerchange'

include BioInterchange::Phylogenetics

# Create a reader that reads phylogenetic trees in Newick format:
reader = NewickReader.new()

# Create a model from a single example tree:
# (Note: the `deserialize` method also takes streams as parameter -- not just strings.)
model = reader.deserialize('((B:0.2,(C:0.3,D:0.4)E:0.5)F:0.1)A;')

# Serialize the model as RDF N-Triples to STDOUT:
CDAORDFWriter.new(STDOUT).serialize(model)

