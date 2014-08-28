
require 'rubygems'
require 'rspec'

require 'biointerchange'

describe BioInterchange::Genomics::RDFWriter do
  describe 'serialization of GVF models' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::Genomics::RDFWriter.new(ostream).serialize(BioInterchange::Genomics::GVFFeatureSet.new())
      ostream.close
      istream.read.lines.count.should eq(10)
    end

    it 'model with three features' do
      istream, ostream = IO.pipe
      set = BioInterchange::Genomics::GVFFeatureSet.new()
      feature = BioInterchange::Genomics::GVFFeature.new(
          'GRCh37.1',
          'NCBI',
          BioInterchange::SOFA.CDS,
          32890598,
          32890664,
          0.1,
          BioInterchange::Genomics::GFF3Feature::POSITIVE,
          { 'ID' => [ 'BRCA2' ], 'annotation' => [ 'manual' ] }
        )
      set.add(feature)
      feature = BioInterchange::Genomics::GVFFeature.new(
          'GRCh37.1',
          'NCBI',
          BioInterchange::SOFA.modified_base,
          32890599,
          32890599,
          0.8,
          BioInterchange::Genomics::GFF3Feature::POSITIVE,
          { 'ID' => [ 'aModifiedBase' ], 'Parent' => [ 'BRCA2' ] }
        )
      set.add(feature)
      feature = BioInterchange::Genomics::GVFFeature.new(
          'GRCh37.1',
          'NCBI',
          BioInterchange::SOFA.modified_base,
          32890599,
          32890599,
          0.8,
          BioInterchange::Genomics::GFF3Feature::POSITIVE,
          { 'Parent' => [ 'BRCA2', 'aModifiedBase' ] }
        )
      set.add(feature)
      BioInterchange::Genomics::RDFWriter.new(ostream).serialize(set)
      ostream.close
      lines = istream.read.lines
      feature_no = 0
      lines.each { |line|
        feature_no += 1 if line.match(/\sa\s+gfvo:Feature\s+[.,;]$/)
      }
      lines.count.should be == 91
      feature_no.should be == 3
    end
  end
end

