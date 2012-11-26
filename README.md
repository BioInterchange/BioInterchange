BioInterchange
==============

[![Build Status](https://secure.travis-ci.org/BioInterchange/BioInterchange.png?branch=master)](https://travis-ci.org/BioInterchange/BioInterchange)

BioInterchange is a tool for generating interchangable RDF from non-RDF data sources.

Supported input file formats (see examples directory):

* [Pubannos JSON](http://pubannotation.dbcls.jp/)
* [PDFx XML](http://pdfx.cs.man.ac.uk/)

Supported RDF output formats:

* [RDF N-Triples](http://www.w3.org/TR/rdf-testcases/#ntriples)

Ontologies used in the RDF output:

* [Semanticscience Integrated Ontology](http://code.google.com/p/semanticscience/wiki/SIO) (SIO)

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

    biointerchange --input dbcls.catanns.json --rdf rdf.bh12.sio --file examples/pubannotation.json --name 'Peter Smith' --name_id 'peter.smith@example.com'
    biointerchange --input uk.ac.man.pdfx --rdf rdf.bh12.sio --file examples/gb-2007-8-3-R40.xml --name 'Peter Smith' --name_id 'peter.smith@example.com'

Input formats:

*  `biointerchange.gff3`
*  `dbcls.catanns.json`
*  `uk.ac.man.pdfx`

Output formats:

*  `rdf.biointerchange.gff3`
*  `rdf.bh12.sio`


### Application Programming Interface

#### Ruby

The Ruby gem is under active development, so the following may or may not work out of the box.

    gem install biointerchange

To use BioInterchange in your Ruby projects, include the following line in your code:

    require 'biointerchange'

#### Python

Currently, there are only wrappers to the vocabularies of the ontologies that are used by
BioInterchange available.

To install the BioInterchange egg, run:

    sudo easy_install rdflib
    sudo easy_install http://www.biointerchange.org/eggs/biointerchange-0.1.0-py2.7.egg

Usage examples:

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
    feature_properties = filter(lambda uri: GFF3O.is_datatype_property(uri), GFF3O.feature_properties())[0]
    
    # Use build-in method "with_parent" to pick properties based on their context:
    GFF3O.with_parent(GFF3O.start(), feature_properties)

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
          <version>0.1.0</version>
        </dependency>
      </dependencies>

### RESTful Web-Service

TODO

### Interactive Web-Site

TODO

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

Building a new version of the Ruby vocabulary classes for GFF3, SIO, SOFA (requires that the OBO files are saves as RDF/XML using [Protege](http://protege.stanford.edu)):

    sudo gem install rdf
    sudo gem install rdf-rdfxml
    echo -e "module BioInterchange\n" > lib/biointerchange/gff3o.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gff3o> GFF3O >> lib/biointerchange/gff3o.rb
    echo -e "\nend" >> lib/biointerchange/gff3.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/sio.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sio> SIO >> lib/biointerchange/sio.rb
    echo -e "\nend" >> lib/biointerchange/sio.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/sofa.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sofa> SOFA >> lib/biointerchange/sofa.rb
    echo -e "\nend" >> lib/biointerchange/sofa.rb

#### Python Vocabulary Classes

The source-code generation can be skipped, if none of the ontologies that are used by BioInterchange have been changed. Otherwise, the existing Python vocabulary class wrappers can be generated as follows:

    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gff3o> GFF3O | ruby generators/pythonify.rb > supplemental/python/biointerchange/gff3o.py
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gvf1o> GVF1O | ruby generators/pythonify.rb > supplemental/python/biointerchange/gvf1o.py
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sio> SIO | ruby generators/pythonify.rb > supplemental/python/biointerchange/sio.py

Generate the BioInterchange Python vocabulary egg:

    cd supplemental/python
    python setup.py bdist_egg

##### Required Python Library

The vocabulary wrapper makes used of RDFLib, which does not install automatically with the egg.

*  (RDFLib)[https://github.com/RDFLib/rdflib]

#### Java Vocabulary Classes

The source-code generation can be skipped, if none of the ontologies that are used by BioInterchange have been changed. Otherwise, the existing Java vocabulary class wrappers can be generated as follows:

    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gff3o> GFF3O | ruby generators/javaify.rb > supplemental/java/biointerchange/src/main/java/org/biointerchange/vocabulary/GFF3O.java
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gvf1o> GVF1O | ruby generators/javaify.rb > supplemental/java/biointerchange/src/main/java/org/biointerchange/vocabulary/GVF1O.java
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sio> SIO | ruby generators/javaify.rb > supplemental/java/biointerchange/src/main/java/org/biointerchange/vocabulary/SIO.java

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

    sudo bundle exec rake install

If you encounter problems with gem dependencies, then you can try to explictly use Ruby 1.9:

    sudo bundle exec rake1.9 install

### Unit Testing

BioInterchange uses unit testing using [RSpec](http://rspec.info), where the unit tests are located in the `spec` directory.

Using bundler, a quick check can be carried out using:

    bundle exec rake spec

A more verbose is produced by calling `rspec` directly:

    rspec -c -f d

### Generating RDocs

    bundle exec rake rdoc

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

