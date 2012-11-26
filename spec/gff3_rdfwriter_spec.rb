
require 'rubygems'
require 'rspec'

load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/gff3.rb'
load 'lib/biointerchange/sofa.rb'
load 'lib/biointerchange/reader.rb'
load 'lib/biointerchange/writer.rb'
load 'lib/biointerchange/genomics/gff3_rdf_ntriples.rb'
load 'lib/biointerchange/genomics/gff3_feature_set.rb'
load 'lib/biointerchange/genomics/gff3_feature.rb'

describe BioInterchange::Genomics::RDFWriter do
  describe 'serialization of GFF3 models' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::Genomics::RDFWriter.new(ostream).serialize(BioInterchange::Genomics::GFF3FeatureSet.new())
      ostream.close
      istream.read.lines.count.should eq(1)
    end

    it 'model with three features' do
      istream, ostream = IO.pipe
      set = BioInterchange::Genomics::GFF3FeatureSet.new()
      feature = BioInterchange::Genomics::GFF3Feature.new(
          'GRCh37.1',
          'NCBI',
          BioInterchange::SOFA.CDS,
          32890598,
          32890664,
          0.1,
          BioInterchange::Genomics::GFF3Feature::POSITIVE,
          nil,
          { 'ID' => [ 'BRCA2' ], 'annotation' => [ 'manual' ] }
        )
      set.add(feature)
      feature = BioInterchange::Genomics::GFF3Feature.new(
          'GRCh37.1',
          'NCBI',
          BioInterchange::SOFA.modified_base,
          32890599,
          32890599,
          0.8,
          BioInterchange::Genomics::GFF3Feature::POSITIVE,
          nil,
          { 'ID' => [ 'aModifiedBase' ], 'Parent' => [ 'BRCA2' ] }
        )
      set.add(feature)
      feature = BioInterchange::Genomics::GFF3Feature.new(
          'GRCh37.1',
          'NCBI',
          BioInterchange::SOFA.modified_base,
          32890599,
          32890599,
          0.8,
          BioInterchange::Genomics::GFF3Feature::POSITIVE,
          nil,
          { 'Parent' => [ 'BRCA2', 'aModifiedBase' ] }
        )
      set.add(feature)
      BioInterchange::Genomics::RDFWriter.new(ostream).serialize(set)
      ostream.close
      istream.read.lines.count.should be == 43
    end
  end
end

