
require 'rubygems'
require 'rspec'

require 'biointerchange'

describe BioInterchange::Genomics::GFF3Reader do
  describe 'reading GFF3 data' do

    describe 'reading GFF3 into a model' do
      before :all do
        @test_gff3 = """##gff-version 3
##sequence-region chr1 1001 400200
##species http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=9606
# A comment line.
chr1	Test Center	gene	2030	3100	.	+	.	ID=Gene1;Name=firstgene
chr1	.	gene	5010	10029	.	-	.	ID=Gene2;Name=secondgene
chr1	.	exon	5090	6000	.	-	.	ID=Exon2.1;Parent=Gene2

"""
        # Initialize with the most basic form of a GFF3 reader, i.e.
        # no name, name_uri, date, etc., information is provided.
        @reader = BioInterchange::Genomics::GFF3Reader.new()
      end
      it 'creates correct GFF3 model instance' do
        model = @reader.deserialize(@test_gff3)

        model.should be_an_instance_of BioInterchange::Genomics::GFF3FeatureSet
      end
      it 'creates a model with the right number of genomic features' do
        model = @reader.deserialize(@test_gff3)

        model.contents.length.should eql 3
      end
      it 'creates a model with the right number of pragma statements' do
        model = @reader.deserialize(@test_gff3)

        model.pragmas.length.should eql 3
      end
    end
  end
end

