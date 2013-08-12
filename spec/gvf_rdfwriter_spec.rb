
require 'rubygems'
require 'rspec'

# Turn off verbose reporting here, since class definitions may be loaded multiple
# times here. That reports that constants have been already been initialized, which
# is true, but they are only "re-initialized" with the very same values.
v, $VERBOSE = $VERBOSE, nil
load 'lib/biointerchange/core.rb'
load 'lib/biointerchange/gfvo.rb'
load 'lib/biointerchange/sofa.rb'
load 'lib/biointerchange/reader.rb'
load 'lib/biointerchange/model.rb'
load 'lib/biointerchange/writer.rb'
load 'lib/biointerchange/genomics/gvf_feature_set.rb'
load 'lib/biointerchange/genomics/gvf_feature.rb'
# The GVF implementation extends the GFF3 implementation, so load those classes too:
load 'lib/biointerchange/genomics/gff3_rdf_ntriples.rb'
load 'lib/biointerchange/genomics/gff3_feature_set.rb'
load 'lib/biointerchange/genomics/gff3_feature.rb'
$VERBOSE = v

describe BioInterchange::Genomics::RDFWriter do
  describe 'serialization of GVF models' do
    it 'empty document' do
      istream, ostream = IO.pipe
      BioInterchange::Genomics::RDFWriter.new(ostream).serialize(BioInterchange::Genomics::GVFFeatureSet.new())
      ostream.close
      istream.read.lines.count.should eq(1)
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
        subject, predicate, object = line.chomp.split(/\s/, 3)
        object.sub!(/\s+\.$/, '')
        feature_no += 1 if predicate == "<#{RDF.type}>" and object == "<#{BioInterchange::GFVO.Feature}>"
      }
      lines.count.should be == 55
      feature_no.should be == 3
    end
  end
end

