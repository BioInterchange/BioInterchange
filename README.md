BioInterchange
==============

---

**BioInterchange has been superseded by [BioInterchange 2](https://www.codamono.com/biointerchange/)!**

---

#### Legacy Documentation

BioInterchange is a tool for generating interchangable RDF data from non-RDF data sources.

Supported input file formats (see examples directory):

* [GFF3](http://www.sequenceontology.org/resources/gff3.html)
* [GVF](http://www.sequenceontology.org/resources/gvf.html)
* [Newick](http://evolution.genetics.washington.edu/phylip/newicktree.html)
* [Pubannos JSON](http://pubannotation.dbcls.jp/)
* [PDFx XML](http://pdfx.cs.man.ac.uk/)

Supported RDF output formats:

* [RDF N-Triples](http://www.w3.org/TR/rdf-testcases/#ntriples)

Ontologies used in the RDF output:

* [Comparative Data Analysis Ontology](http://sourceforge.net/apps/mediawiki/cdao/index.php?title=Main_Page) (CDAO)
* [Friend of a Friend](http://xmlns.com/foaf/spec) (FOAF)
* [Genomic Feature and Variation Ontology](http://www.biointerchange.org/ontologies.html) (GFVO)
* [Semanticscience Integrated Ontology](http://code.google.com/p/semanticscience/wiki/SIO) (SIO)
* [Sequence Ontology](http://www.sequenceontology.org/index.html) (SO)
* [Sequence Ontology Feature Annotation](http://www.sequenceontology.org/index.html) (SOFA)

*Note:* GFVO replaces the [Generic Feature Format Version 3 Ontology](http://www.biointerchange.org/ontologies.html) (GFF3O) and [Genome Variation Format Version 1 Ontology](http://www.biointerchange.org/ontologies.html) (GVF1O).

#### Contributing

If you like to contribute, you are more than welcome. For implementation ideas, please have a look [here](https://github.com/BioInterchange/BioInterchange/issues).

Usage
-----

Four interfaces to BioInterchange are available:

1.  command-line tool-suite
2.  API (Ruby gem, Python egg)
3.  RESTful web-service
4.  interactive web-site

### Command-Line Tool-Suite

BioInterchange's command-line tool `biointerchange` can be installed as a command line tools as follows:

    gem install biointerchange

#### Usage

Examples:

    biointerchange --input biointerchange.gvf --rdf rdf.biointerchange.gfvo --file examples/estd176_Banerjee_et_al_2011.2012-11-29.NCBI36.gvf
    biointerchange --input dbcls.catanns.json --rdf rdf.bh12.sio --file examples/pubannotation.10096561.json --annotate_name 'Peter Smith' --annotate_name_id 'peter.smith@example.com'
    biointerchange --input uk.ac.man.pdfx --rdf rdf.bh12.sio --file examples/gb-2007-8-3-R40.xml --annotate_name 'Peter Smith' --annotate_name_id 'peter.smith@example.com'
    biointerchange --input phylotastic.newick --rdf rdf.phylotastic.newick --file examples/tree2.new --annotate_date '1 June 2006'

Input formats:

*  `biointerchange.gff3`
*  `biointerchange.gvf`
*  `dbcls.catanns.json`
*  `phylotastic.newick`
*  `uk.ac.man.pdfx`

Output formats:

*  `rdf.biointerchange.gfvo`
*  `rdf.bh12.sio`
*  `rdf.phylotastic.newick`

#### Using a Triple Store

RDF data produced by BioInterchange can be directly loaded into a triple store. The following gives an example about loading and querying RDF data using [Sesame](http://www.openrdf.org); the commands are entered via Sesame's `bin/console.sh`:

    > create memory.
    Please specify values for the following variables:
    Repository ID [memory]: testrepo
    Repository title [Memory store]: Test Repository
    Persist (true|false) [true]: false
    Sync delay [0]: 
    Repository created
    > open testrepo.
    testrepo> load <path-to-your-rdf-data> .
    testrepo> sparql select * where { ?s ?p ?o } .

To list all `seqid` entries from a GVF-file conversion in the store, the following SPARQL query can be used:

    testrepo> sparql select * where { ?s <http://www.biointerchange.org/gvf1o#GVF1_0004> ?o } .

#### Example Data Provenance

The following list provides information on the origin of the example-data files in the `examples` directory:

*  `bininda_emonds_mammals.new`: Newick formatted Bininda-Emonds mammals tree (see [The delayed rise of present-day mammals](http://www.ncbi.nlm.nih.gov/pubmed/17392779)). Downloaded from [https://github.com/bendmorris/rdf-treestore/blob/master/trees/bininda_emonds_mammals.new](https://github.com/bendmorris/rdf-treestore/blob/master/trees/bininda_emonds_mammals.new)
*  `BovineGenomeChrX.gff3.gz`: Gzipped GFF3 file describing a Bos taurus chromosome X. Downloaded from [http://bovinegenome.org/?q=download_chromosome_gff3](http://bovinegenome.org/?q=download_chromosome_gff3)
*  `chromosome_BF.gff`: GFF3 file of floating contigs from the Baylor Sequencing Centre. Downloaded from [http://dictybase.org/Downloads](http://dictybase.org/Downloads)
*  `estd176_Banerjee_et_al_2011.2012-11-29.NCBI36.gvf`: GVF file of EBI's [DGVa](http://www.ebi.ac.uk/dgva/database-genomic-variants-archive). Downloaded from [ftp://ftp.ebi.ac.uk/pub/databases/dgva/estd176_Banerjee_et_al_2011/gvf/estd176_Banerjee_et_al_2011.2012-11-29.NCBI36.gvf](ftp://ftp.ebi.ac.uk/pub/databases/dgva/estd176_Banerjee_et_al_2011/gvf/estd176_Banerjee_et_al_2011.2012-11-29.NCBI36.gvf)
*  `Felis_catus.gvf.gz`: Gzipped GVF file of F. catus genomic variations provided by the Ensembl project. Downloaded from [ftp://ftp.ensembl.org/pub/release-71/variation/gvf/felis_catus/Felis_catus.gvf.gz](ftp://ftp.ensembl.org/pub/release-71/variation/gvf/felis_catus/Felis_catus.gvf.gz)
*  `Felis_catus_incl_consequences.vcf.gz`: Gzipped VCF file of F. catus genomic variations provided by the Ensembl project. Downloaded from [ftp://ftp.ensembl.org/pub/current_variation/vcf/felis_catus/Felis_catus_incl_consequences.vcf.gz](ftp://ftp.ensembl.org/pub/current_variation/vcf/felis_catus/Felis_catus_incl_consequences.vcf.gz)
*  `gb-2007-8-3-R40.xml`: Generated by [PDFx](http://pdfx.cs.man.ac.uk) from open-access source PDF [Sense-antisense pairs in mammals: functional and evolutionary considerations](http://genomebiology.com/content/pdf/gb-2007-8-3-r40.pdf)
*  `Saccharomyces_cerevisiae_incl_consequences.gvf.gz`: Gzipped GVF files of S. cerevisiae genomic variations provided by the Ensembl project. Downloaded from [ftp://ftp.ensembl.org/pub/release-71/variation/gvf/saccharomyces_cerevisiae/Saccharomyces_cerevisiae_incl_consequences.gvf.gz](ftp://ftp.ensembl.org/pub/release-71/variation/gvf/saccharomyces_cerevisiae/Saccharomyces_cerevisiae_incl_consequences.gvf.gz)

#### Additional Example Data

The following lists data that has been used in testing BioInterchange's implementation, but was not included in the GitHub repository due to their size:

*  `mgp.v4.indels.dbSNP.vcf.gz`: Gzipped VCF file of M. musculus indels by the Sanger Institute. Downloaded from [ftp://ftp-mouse.sanger.ac.uk/REL-1410-SNPs_Indels/mgp.v4.indels.dbSNP.vcf.gz](ftp://ftp-mouse.sanger.ac.uk/REL-1410-SNPs_Indels/mgp.v4.indels.dbSNP.vcf.gz)

### Application Programming Interface

#### Ruby

BioInterchange is available as Ruby gem that can be installed as follows:

    sudo gem install biointerchange

The API provides vocabulary wrappers to ontologies that are used within the BioInterchange framework as well as access to RDFization implementations. 

##### Using Vocabulary Wrappers

Ruby classes are provided for the ontologies that is used for serializing RDF. Each ontology is represented by its own Ruby class. The classes provide access to the ontology terms and additional methods for resolving OWL classes, datatype properties and object properties.

Usage example (see also [vocabulary.rb](https://github.com/BioInterchange/BioInterchange/blob/master/examples/vocabulary.rb)):

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

With the BioInterchange gem installed, the example can be executed on the command line via:

    git clone git://github.com/BioInterchange/BioInterchange.git
    cd BioInterchange
    git checkout v1.0.0
    ruby examples/vocabulary.rb

##### RDFization Framework

Usage example (see also [rdfization.rb](https://github.com/BioInterchange/BioInterchange/blob/master/examples/rdfization.rb)):

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

##### Implementing New Readers, Models and Writers

New readers, models and writers are best adopted from or build upon the existing implementations. The phylogenetic trinity of Newick file format reader, [BioRuby](http://bioruby.org) based tree model, and [CDAO](http://sourceforge.net/apps/mediawiki/cdao/index.php?title=Main_Page) RDF writer is used here as a guidline due to its simplicity.

###### Reader: Creating an Object Model

The quintessential Newick tree reader is depicted below. Its class is placed in a Ruby module that encapsulates all phylogenetic related source code. The `NewickReader` class inherits from the BioInterchange framework class `Reader` that provides method stubs which need to be overwritten. Using the central registry `BioInterchange::Registry`, the reader informs the framework of its: unique identifier (`phylotastic.newick`), Ruby class (`NewickReader`), command line parameters that it accepts (`date`, which becomes `--annotate_date`), whether the reader can operate without reading the complete input all at once (`true`), a descriptive name of the reader (`Newick Tree [...]`), and an array with descriptions for each parameter stated above.

Deserialization of Newick trees is done using the `deserialize` method, which must take both strings and input streams as valid arguments. If this contraint is not satisfied, then an `ImplementationReaderError` is thrown that is caught by the framework and handled appropriately.

Finally, the `postponed?` method keeps track of deferred input processing. If the batch size was reached and the model was passed on for serialization to a writer, then this method will have to return `true`.

    require 'bio'
    require 'date'
    
    module BioInterchange::Phylogenetics
    
    class NewickReader < BioInterchange::Reader
    
      # Register reader:
      BioInterchange::Registry.register_reader(
        'phylotastic.newick',
        NewickReader,
        [ 'date' ],
        true,
        'Newick Tree File Format reader',
        [
          [ 'date <date>', 'date when the Newick file was created (optional)' ]
        ]
      )
    
      # Creates a new instance of a Newick file format reader.
      #
      # The reader supports batch processing.
      #
      # +date+:: Optional date of when the Newick file was produced, annotated, etc.
      # +batch_size+:: Optional integer that determines that number of features that
      # should be processed in one go.
      def initialize(date = nil, batch_size = nil)
        @date = date
        @batch_size = batch_size
      end
    
      # Reads a Newick file from the input stream and returns an associated model.
      #
      # If this method is called when +postponed?+ returns true, then the reading will
      # continue from where it has been interrupted beforehand.
      #
      # +inputstream+:: an instance of class IO or String that holds the contents of a Newick file
      def deserialize(inputstream)
        if inputstream.kind_of?(IO)
          create_model(inputstream)
        elsif inputstream.kind_of?(String) then
          create_model(StringIO.new(inputstream))
        else
          raise BioInterchange::Exceptions::ImplementationReaderError, 'The provided input stream needs to be either of type IO or String.'
        end
      end
    
      # Returns true if the reading of the input was postponed due to a full batch.
      def postponed?
        @postponed
      end
    
    protected
    
    # ...concrete implementation omitted.

###### Tree Model

A model is created by a reader and it is subsequently consumed by a writer. The phylogenetic tree model inherits `BioInterchange::Model` which defines the `prune` method. If batch operation is in place, i.e. the input is not completely read into memory, then the `prune` method will be called to instruct the model to drop all information that has not to be kept in memory anymore. In a sense, this can be seen as a form of garbage collection, where data that has been serialized is purged from memory.

    module BioInterchange::Phylogenetics
    
    # A phylogenetic tree set that can contain multiple phylogenetic trees.
    class TreeSet < BioInterchange::Model
    
      # Create a new instance of a tree set. A tree set can contain multiple phylogenetic trees.
      def initialize
        # Trees are stored as the keys of a hash map to increase performance:
        @set = {}
      end
    
      # ...omitted internal data structure handling.
    
      # Removes all features from the set, but keeps additional data (e.g., the date).
      def prune
        @set.clear
      end
    
    end
    
    end

###### Writer: From Object Model to RDF

The writer takes an object model and serializes it via the `BioInterchange::Writer` derived `serialize` method. A writer uses `BioInterchange::Registry` to make itself known to the BioInterchange framework, where it signs up using the following arguments: a unique identifier (`rdf.phylotastic.newick`), its implementing class (`CDAORDFWriter`), a list of readers that it is compatible with (`phylotastic.newick`), whether the writer supports batch processing where only parts of the input need to be kept in memory (`true`), and a descriptive name for the writer.

    require 'rdf'
    require 'rdf/ntriples'
    
    module BioInterchange::Phylogenetics
    
    # Serialized phylogenetic tree models based on BioRuby's phylogenetic tree implementation.
    class CDAORDFWriter < BioInterchange::Writer
    
      # Register writers:
      BioInterchange::Registry.register_writer(
        'rdf.phylotastic.newick',
        CDAORDFWriter,
        [ 'phylotastic.newick' ],
        true,
        'Comparative Data Analysis Ontology (CDAO) based RDFization'
      )
    
      # Creates a new instance of a CDAORDFWriter that will use the provided output stream to serialize RDF.
      #
      # +ostream+:: instance of an IO class or derivative that is used for RDF serialization
      def initialize(ostream)
        @ostream = ostream
      end
    
      # Serialize a model as RDF.
      #
      # +model+:: a generic representation of input data that is an instance of BioInterchange::Phylogenetics::TreeSet
      # +uri_prefix+:: optional URI prefix that should be used in the RDFization of individuals/class instances
      def serialize(model, uri_prefix = nil)
        model.contents.each { |tree|
          serialize_model(model, tree, uri_prefix)
        }
      end
    
    protected
    
    # ...omitted actual serialization implementation.

#### Python

Currently, there are only wrappers to the vocabularies of the ontologies that are used by
BioInterchange available.

To install the BioInterchange egg, run:

    sudo easy_install rdflib
    sudo easy_install http://www.biointerchange.org/eggs/biointerchange-1.0.0-py2.7.egg

Usage examples:

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

The example can be executed on the command line via:

    git clone git://github.com/BioInterchange/BioInterchange.git
    cd BioInterchange
    git checkout v1.0.0
    cd supplemental/python
    python example.py

#### Java

Only vocabulary wrapper classes are provided for the Java API. In order to make use of the RDF generation features in BioInterchange, either use the Ruby implementation or connect Java to BioInterchange's web-services.

To use the BioInterchange artifact, set-up add the following to your Maven POM file:

    <repositories>
      <repository>
        <id>biointerchange</id>
        <name>BioInterchange</name>
        <url>http://www.biointerchange.org/artifacts</url>
      </repository>
    </repositories>
     
    <dependencies>
      <dependency>
        <groupId>org.biointerchange</groupId>
        <artifactId>vocabularies</artifactId>
        <version>1.0.0</version>
      </dependency>
    </dependencies>

Usage examples of accessing GFF3O's vocabulary:

    package org.biointerchange;
    
    import com.hp.hpl.jena.rdf.model.*;
    import com.hp.hpl.jena.vocabulary.*;
    import org.apache.commons.collections.CollectionUtils;
    import org.apache.commons.collections.Predicate;
    
    import java.util.Set;
    
    import org.biointerchange.vocabulary.*;
    
    /**
     * Demo on how to make use of BioInterchange's vocabulary classes.
     *
     * @author Joachim Baran
     */
    public class App 
    {
        public static void main(String[] args) {
            Resource seqid = GFF3O.seqid();
            System.out.println("'seqid' property:");
            printResource(seqid);
            
            System.out.println("'start' properties:");
            Set<Resource> start = GFF3O.start();
            for (Resource startSynonym : start)
                printResource(startSynonym);
            
            System.out.println("'feature_properties' properties:");
            Set<Resource> featureProperties = GFF3O.feature_properties();
            for (Resource featurePropertiesSynonym : featureProperties)
                printResource(featurePropertiesSynonym);
            
            System.out.println("'feature_properties' properties, which are a datatype property:");
            CollectionUtils.filter(featureProperties, new Predicate() {
                public boolean evaluate(Object o) {
                    return GFF3O.isDatatypeProperty((Resource)o);
                }
            });
            for (Resource featurePropertiesSynonym : featureProperties)
                printResource(featurePropertiesSynonym);
            
            System.out.println("'start' property with parent datatype property 'feature_properties':");
            Set<Resource> startUnderDatatypeFeatureProperties = GFF3O.withParent(start, featureProperties.iterator().next());
            for (Resource startSynonym : startUnderDatatypeFeatureProperties)
                printResource(startSynonym);
        }
        
        private static void printResource(Resource resource) {
            System.out.println("    " + resource.toString());
            System.out.println("        Namespace:                            " + resource.getNameSpace());
            System.out.println("        Local name:                           " + resource.getLocalName());
            System.out.println("        Jena Property (rather than Resource): " + (resource instanceof Property));
            System.out.println("        Ontology class:                       " + GFF3O.isClass(resource));
            System.out.println("        Ontology object property:             " + GFF3O.isObjectProperty(resource));
            System.out.println("        Ontology datatype property:           " + GFF3O.isDatatypeProperty(resource));
        }
    }

Another example that uses SIO instead of GFF3O is provided as [AppSIO.java](https://github.com/BioInterchange/BioInterchange/blob/master/supplemental/java/biointerchange/src/main/java/org/biointerchange/AppSIO.java).

The examples can be executed through Maven:

    cd supplemental/java/biointerchange
    mvn exec:java -Dexec.mainClass="org.biointerchange.App"
    mvn exec:java -Dexec.mainClass="org.biointerchange.AppSIO"

### RESTful Web-Service

A RESTful web-service is available via the URI: [http://www.biointerchange.org/service/rdfizer.biocgi](http://www.biointerchange.org/service/rdfizer.biocgi)

RDFization parameters and data are send as a single HTTP POST requests containing a JSON object. The JSON object has to be formatted as follows:

    {
      "parameters" : {
        "input" : "INPUT_FORMAT",
        "output": "OUTPUT_METHOD"
      },
      "data" : "URL_ENCODED_DATA"
    }

*  `INPUT_FORMAT`: determines the input data type; available input formats are
   *  `biointerchange.gff3`: [Generic Feature Format Version 3](http://www.sequenceontology.org/resources/gff3.html)
   *  `biointerchange.gvf`: [Genome Variation Format](http://www.sequenceontology.org/resources/gvf.html)
   *  `dbcls.catanns.json`: [PubAnnotation categorical annotations](http://pubannotation.dbcls.jp) JSON
   *  `phylotastic.newick`: [Newick](http://evolution.genetics.washington.edu/phylip/newicktree.html)
   *  `uk.ac.man.pdfx`: [PDFx](http://pdfx.cs.man.ac.uk) XML
*  `OUTPUT_METHOD`: determines the RDFization method that should be used, output will always be RDF N-Triples; available output formats are
   *  `rdf.biointerchange.gfvo`: RDFization of `biointerchange.gff3` or `biointerchange.gvf`
   *  `rdf.bh12.sio`: RDFization of `dbcls.catanns.json` or `uk.ac.man.pdfx`
   *  `rdf.phylotastic.newick`: RDFization of `phylotastic.newick`
*  `URL_ENCODED_DATA`: data for RDFization as [URL encoded](http://en.wikipedia.org/wiki/Percent-encoding) string

#### Example

A query example is part of BioInterchange's source repository. The file [webservice_example.json](https://raw.github.com/BioInterchange/BioInterchange/master/examples/webservice_example.json) contains the following query:

    {
        "parameters" : {
          "input" : "biointerchange.gff3",
          "output": "rdf.biointerchange.gff3"
        },
        "data" : "ChrX.38%09bovine_complete_cds_gmap_perfect%09gene%0915870%0916254%09.%09+%09.%09ID%3DBC109609_ChrX.38%0AChrX.38%09bovine_complete_cds_gmap_perfect%09mRNA%0915870%0916254%09.%09+%09.%09ID%3Dbovine_complete_cds_gmap_perfect_BC109609_ChrX.38%3BParent%3DBC109609_ChrX.38%0AChrX.38%09bovine_complete_cds_gmap_perfect%09CDS%0915870%0916254%09.%09+%090%09Parent%3Dbovine_complete_cds_gmap_perfect_BC109609_ChrX.38%0AChrX.38%09bovine_complete_cds_gmap_perfect%09exon%0915870%0916254%09.%09+%090%09Parent%3Dbovine_complete_cds_gmap_perfect_BC109609_ChrX.38%0A"
    }

The query can be run using the popular [cURL](http://en.wikipedia.org/wiki/CURL) tool:

    curl -d '@webservice_example.json' http://www.biointerchange.org/service/rdfizer.biocgi

### Interactive Web-Site

BioInterchange has an [interactive web-interface](http://www.biointerchange.org/webservices.html) for RDFizing small amounts of data. Each input format and RDF serialization method pair comes with an example, which can be used as a guidance or test bed for learning how to use BioInterchange.

#### Usage Instructions

1.  select a data input format (for example, GFF3)
2.  select a RDF serialization method/output format (for example, "RDF using GFF3O ontology")
3.  paste RDF serialization method parameters and data in the text fields (or, click "Paste Input-Specific Example")
4.  click "Generate RDF" and the RDFized data will appear below

Build Notes
-----------

This section is only relevant if you are building newer versions of BioInterchange yourself. If you are using the Ruby gem, web-service or interactive web-site, then you can safely skip the steps explained here.

Note that the following set-up only works with Ruby 1.9.2p290 or newer.

### Prerequisites

Software requirements:

* Ruby 1.9.2p290 or newer
* Bundler gem 1.1.5 or newer
* Rake gem 0.8.7 or newer

With Ruby installed, the following commands install the additional packages:

    sudo gem install bundler
    sudo gem install rake
    bundle

The last step, `bundle`, will install gem dependencies of BioInterchange automatically.

### Building Vocabulary Classes

Building a new version of the Ruby vocabulary classes for CDAO, FALDO, GFF3O, GVF1O, SIO, SOFA (requires that the OBO files are saves as RDF/XML using [Protege](http://protege.stanford.edu); Apache [Jena](http://jena.apache.org)'s `rdfcat` tool is required to reformat RDF Turtle as RDF/XML):

    sudo gem install rdf
    sudo gem install rdf-rdfxml
    echo -e "require 'rdf'\nmodule BioInterchange\n" > lib/biointerchange/cdao.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-cdao> CDAO >> lib/biointerchange/cdao.rb
    echo -e "\nend" >> lib/biointerchange/cdao.rb
    echo -e "require 'rdf'\nmodule BioInterchange\n" > lib/biointerchange/faldo.rb
    rdfcat -ttl <path-to-turtle-version-of-faldo> > faldo.xml.tmp
    ruby generators/rdfxml.rb faldo.xml.tmp FALDO >> lib/biointerchange/faldo.rb
    rm -f faldo.xml.tmp
    echo -e "\nend" >> lib/biointerchange/faldo.rb
    echo -e "require 'rdf'\nmodule BioInterchange\n" > lib/biointerchange/gfvo.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gfvo> GFVO >> lib/biointerchange/gfvo.rb
    echo -e "\nend" >> lib/biointerchange/gfvo.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/sio.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sio> SIO >> lib/biointerchange/sio.rb
    echo -e "\nend" >> lib/biointerchange/sio.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/so.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-so> SO >> lib/biointerchange/so.rb
    echo -e "\nend" >> lib/biointerchange/so.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/sofa.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sofa> SOFA >> lib/biointerchange/sofa.rb
    echo -e "\nend" >> lib/biointerchange/sofa.rb

A Geno Ontology external reference (GOxref) vocabulary can be created by directly downloading the latest version of `GO.xrf_abbs`:

    echo -e "module BioInterchange\n" > lib/biointerchange/goxref.rb
    curl ftp://ftp.geneontology.org/pub/go/doc/GO.xrf_abbs | ruby generators/GOxrefify.rb
    echo -e "\nend" >> lib/biointerchange/goxref.rb

Building an external reference vocabulary based on Life Science Registry external database abbreviations (based on download of the
Life Science registry spreadsheet as TSV file):

    echo -e "module BioInterchange\n" > lib/biointerchange/life_science_registry.rb
    cut -f 1,25 <path-to-registry-tsv-file> | grep -E 'https?://.*\$id' | ruby generators/tsv2rubyclass.rb LifeScienceRegistry >> lib/biointerchange/life_science_registry.rb
    echo -e "\nend" >> lib/biointerchange/life_science_registry.rb

#### Python Vocabulary Classes

The source-code generation can be skipped, if none of the ontologies that are used by BioInterchange have been changed. Otherwise, the existing Python vocabulary class wrappers can be generated as follows:

    ruby generators/make_supplement_releases.rb

Generate the BioInterchange Python vocabulary egg:

    cd supplemental/python
    python setup.py bdist_egg

##### Required Python Library

The vocabulary wrapper makes used of RDFLib, which does not install automatically with the egg.

*  (RDFLib)[https://github.com/RDFLib/rdflib]

#### Java Vocabulary Classes

The source-code generation can be skipped, if none of the ontologies that are used by BioInterchange have been changed. Otherwise, the existing Java vocabulary class wrappers can be generated as follows:

    ruby generators/make_supplement_releases.rb

Generate the BioInterchange Java vocabulary artifact:

    cd supplemental/java/biointerchange
    mvn package

##### Required Java Packages

The following Java packages will automatically install alongside BioInterchange's Maven artifact:

* (Jena Core)[http://mvnrepository.com/artifact/org.apache.jena/jena-core]
* (Apache Commons Collections)[http://mvnrepository.com/artifact/org.apache.directory.studio/org.apache.commons.collections]
* (SLF4J)[http://mvnrepository.com/artifact/org.slf4j/slf4j-api]
* (Xerces)[http://mvnrepository.com/artifact/xerces/xerces]
* (JUnit)[http://mvnrepository.com/artifact/junit/junit]

### Gem Bundling/Installing

Mac OS X prerequisites and `bundle install` difference:

    sudo port install libxml2 libxslt
    sudo ARCHFLAGS=-Wno-error=unused-command-line-argument-hard-error-in-future bundle install

Actual gem bundling:

    bundle exec rake gemspec
    bundle exec gem build biointerchange.gemspec
    sudo bundle exec gem install biointerchange-`cat VERSION`.gem

If you encounter problems with gem dependencies, then you can try to explictly use Ruby 1.9:

    bundle exec gem1.9 build biointerchange.gemspec
    sudo bundle exec gem1.9 install biointerchange-`cat VERSION`.gem

Alternative build script, `make.sh`, which installs the gem without RDocs and ri pages (quicker when testing):

    ./make.sh

### Unit Testing

BioInterchange uses unit testing using [RSpec](http://rspec.info), where the unit tests are located in the `spec` directory.

Using bundler, a quick check can be carried out using:

    bundle update
    bundle exec rake spec

A more verbose is produced by calling `rspec` directly:

    rspec -c -f d

### Generating RDocs

    bundle exec rake rdoc

### Deploying on Rubygems

_Note:_ Only BioInterchange package maintainers can deploy the 'biointerchange' gem on Rubygems.

    bundle exec rake version:bump:(major | minor | patch)
    bundle exec rake gemspec
    bundle exec gem build biointerchange.gemspec
    bundle exec gem push biointerchange-VERSION.gem

### Troubleshooting

#### GCC: No such file or directory

On Mac OS X, you might see this error:

    make: /usr/bin/gcc-4.2: No such file or directory
    make: *** [generator.o] Error 1

This can be solved by executing:

    sudo ln -s /usr/bin/llvm-gcc-4.2 /usr/bin/gcc-4.2

Contributors
------------

In alphabetical order of the last name:

* [Joachim Baran](http://joachimbaran.wordpress.com)
* [Kevin B. Cohen](http://compbio.ucdenver.edu/Hunter_lab/Cohen/index.shtml)
* [Geraint Duck](http://www.cs.man.ac.uk/~duckg)
* [Michel Dumontier](http://dumontierlab.com)
* [Begum Durgahee](http://utah.academia.edu/BDurgahee)
* [Jin-Dong Kim](http://www.bioontology.org/Jin-Dong_Kim)

Cite
----

If you use this software, please cite

* BioInterchange: An Open Source Framework for Transforming Heterogeneous Data Formats Into RDF (_in preparation_)

and one of the following Biogem publications

* [BioRuby: bioinformatics software for the Ruby programming language](http://dx.doi.org/10.1093/bioinformatics/btq475)
* [Biogem: an effective tool-based approach for scaling up open source software development in bioinformatics](http://dx.doi.org/10.1093/bioinformatics/bts080)

Biogems.info
------------

This Biogem is published at [#biointerchange](http://biogems.info/index.html) and hosted on its primary site [www.biointerchange.org](http://www.biointerchange.org).

The BioRuby community is on IRC server: irc.freenode.org, channel: #bioruby.

License/Copyright
-----------------

See [LICENSE](https://raw.github.com/BioInterchange/BioInterchange/master/LICENSE.txt) file.


