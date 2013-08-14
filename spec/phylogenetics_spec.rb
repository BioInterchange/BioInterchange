
require 'rubygems'
require 'rspec'
require 'bio'

# Turn off verbose reporting here, since class definitions may be loaded multiple
# times here. That reports that constants have been already been initialized, which
# is true, but they are only "re-initialized" with the very same values.
v, $VERBOSE = $VERBOSE, nil
load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/cdao.rb'
load 'lib/biointerchange/reader.rb'
load 'lib/biointerchange/model.rb'
load 'lib/biointerchange/writer.rb'
load 'lib/biointerchange/phylogenetics/newick_reader.rb'
load 'lib/biointerchange/phylogenetics/tree_set.rb'
load 'lib/biointerchange/phylogenetics/cdao_rdf_ntriples.rb'
$VERBOSE = v

describe BioInterchange::Phylogenetics::NewickReader do
  describe 'deserialization of Newick trees' do
    it 'empty document' do
      tree_file = Bio::FlatFile.open(Bio::Newick, StringIO.new(''))
      trees = 0
      tree_file.each_entry { |tree| trees += 1 }
      trees.should eq(0)
    end

    it 'single Newick tree' do
      tree_file = Bio::FlatFile.open(Bio::Newick, StringIO.new('(,,(,));'))
      trees = 0
      tree_file.each_entry { |newick_tree|
        trees += 1
        newick_tree.tree.edges.length.should eq(5)
        newick_tree.tree.nodes.length.should eq(6)
      }
      trees.should eq(1)
    end

    it 'three Newick trees' do
      tree_file = Bio::FlatFile.open(Bio::Newick, StringIO.new("(,,(,));\n(A,B,(C,D));\n(A,B,(C,D)E)F;"))
      trees = 0
      tree_file.each_entry { |newick_tree|
        trees += 1
        newick_tree.tree.edges.length.should eq(5)
        newick_tree.tree.nodes.length.should eq(6)
      }
      trees.should eq(3)
    end

    it 'model consistency' do
      model = BioInterchange::Phylogenetics::NewickReader.new().deserialize('(A,B,(C,D,E)F)G;')
      model.should be_an_instance_of BioInterchange::Phylogenetics::TreeSet
      model.contents.length.should eq(1)
      model.contents.first.edges.length.should eq(6)
      model.contents.first.nodes.length.should eq(7)
    end
  end
end

describe BioInterchange::Phylogenetics::CDAORDFWriter do
  describe 'serialization of tree models' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::Phylogenetics::CDAORDFWriter.new(ostream).serialize(BioInterchange::Phylogenetics::TreeSet.new())
      ostream.close
      istream.read.lines.count.should eq(0)
    end

    it 'single Newick tree' do
      istream, ostream = IO.pipe
      model = BioInterchange::Phylogenetics::NewickReader.new().deserialize('(A,B,(C,D,E)F)G;')
      BioInterchange::Phylogenetics::CDAORDFWriter.new(ostream).serialize(model)
      ostream.close
      istream.read.lines.count.should eq(103)
    end
  end
end

