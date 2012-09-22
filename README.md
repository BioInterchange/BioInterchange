BioInterchange
==============

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
2.  Ruby API
3.  RESTful web-service
4.  interactive web-site

### Ruby gem

TODO

### RESTful Web-Service

TODO

### Interactive Web-Site

TODO

Build Notes
-----------

This section is only relevant if you are building newer versions of BioInterchange yourself. If you are using the Ruby gem, web-service or interactive web-site, then you can safely skip the steps explained here.

Note that the following set-up only works with Ruby 1.9.2p290 or newer.

Building a new version of the Ruby vocabulary classes for GFF3, SIO, SOFA (requires that the OBO files are saves as RDF/XML using [Protege](http://protege.stanford.edu)):

    sudo gem install rdf
    sudo gem install rdf-rdfxml
    echo -e "module BioInterchange\n" > lib/biointerchange/gff3.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-gff3> GFF3 >> lib/biointerchange/gff3.rb
    echo -e "\nend" >> lib/biointerchange/gff3.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/sio.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sio> SIO >> lib/biointerchange/sio.rb
    echo -e "\nend" >> lib/biointerchange/sio.rb
    echo -e "module BioInterchange\n" > lib/biointerchange/sofa.rb
    ruby generators/rdfxml.rb <path-to-rdf/xml-version-of-sofa> SOFA >> lib/biointerchange/sofa.rb
    echo -e "\nend" >> lib/biointerchange/sofa.rb

### Unit Testing

BioInterchange uses unit testing using [RSpec](http://rspec.info):

    rspec -c -f d

Contributors
------------

In alphabetical order of the last name:

* [Joachim Baran](http://joachimbaran.wordpress.com)
* [Kevin B. Cohen](http://compbio.ucdenver.edu/Hunter_lab/Cohen/index.shtml)
* [Geraint Duck](http://www.cs.man.ac.uk/~duckg)
* [Michel Dumontier](http://dumontierlab.com)

License
-------

See [LICENSE](https://raw.github.com/BioInterchange/BioInterchange/master/LICENSE) file.

