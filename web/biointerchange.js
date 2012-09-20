function generateRDF() {
  if ($('#inputformat').val() == 'dbcls.catanns.json' || $('#inputformat').val() == 'uk.ac.man.pdfx') {
    request = '{ "parameters" : "' + escape($('#metainput').val()) + '", "data" : "' + escape($('#maininput').val()) + '" }'
    $.ajax({
      type: 'POST',
      url: 'service/rdfizer.fcgi',
      data: request,
      success: function(data) {
        if ($('#output')[0].innerHTML.substring(0, 7) == '<i>RDF ')
          $('#output').empty();
        $('#output').append(data.replace(/</g, '&lt;').replace(/>/g, '&gt;'));
      },
      contentType: 'biointerchange/json',
      dataType: 'text'
    });
  }
}

function pasteExample() {
  if ($('#inputformat').val() == 'dbcls.catanns.json') {
    $('#metainput').val(
      "{\n" +
      "  \"input\" : \"dbcls.catanns.json\",\n" +
      "  \"output\" : \"rdf.bh12.sio\",\n" +
      "  \"name\" : \"Peter Smith\",\n" +
      "  \"name_id\" : \"peter.smith@some.example.domain\",\n" +
      "  \"date\" : \"2012-07-19\"\n" +
      "}\n"
    );
    $('#maininput').val(
      "{\n" +
      "  \"docurl\" : \"http://www.ncbi.nlm.nih.gov/pubmed/10096561\",\n" +
      "  \"text\" : \"Stimulation of CD40 on immunogenic human malignant melanomas augments their cytotoxic T lymphocyte-mediated lysis and induces apoptosis.\",\n" +
      "  \"catanns\" : [\n" +
      "    {\n" +
      "      \"annset_id\" : 1,\n" +
      "      \"begin\" : 15,\n" +
      "      \"category\" : \"Protein\",\n" +
      "      \"created_at\" : \"2012-07-18T06:11:50Z\",\n" +
      "      \"doc_id\" : 9,\n" +
      "      \"end\" : 19,\n" +
      "      \"id\" : 110,\n" +
      "      \"updated_at\" : \"2012-07-18T06:11:50Z\"\n" +
      "    }\n" +
      "  ]\n" +
      "}\n"
    );
  } else if ($('#inputformat').val() == 'uk.ac.man.pdfx') {
    $('#metainput').val(
      "{\n" +
      "  \"input\" : \"uk.ac.man.pdfx\",\n" +
      "  \"output\" : \"rdf.bh12.sio\",\n" +
      "  \"name\" : \"Peter Smith\",\n" +
      "  \"name_id\" : \"peter.smith@some.example.domain\",\n" +
      "  \"date\" : \"2012-07-19\"\n" +
      "}\n"
    );
    $('#maininput').val(
      "<?xml version='1.0' encoding='UTF-8'?>\n" +
      "<pdfx xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://pdfx.cs.man.ac.uk/static/article-schema.xsd\">\n" +
      "  <meta>\n" +
      "    <job>b85333761ae8955f8abcb6a067628f50faf58fc247d92e8aaa604991e28ccfe1</job>\n" +
      "  </meta>\n" +
      "  <article>\n" +
      "    <front class=\"DoCO:FrontMatter\">\n" +
      "      <region class=\"unknown\" id=\"1\">Volume et Galante 2007 Research al. 8, Issue 3, Article R40</region>\n" +
      "      <title-group>\n" +
      "        <article-title class=\"DoCO:Title\" id=\"2\">Sense-antisense pairs in mammals: functional and evolutionary</article-title>\n" +
      "      </title-group>\n" +
      "      <abstract class=\"DoCO:Abstract\" id=\"20\">Background: A significant number of genes in mammalian genomes are being found to have natural antisense transcripts (NATs). These sense-antisense (S-AS) pairs are believed to be involved in several cellular phenomena. Results: Here, we generated a catalog of S-AS pairs occurring in the human and mouse genomes by analyzing different sources of expressed sequences available in the public domain plus 122 massively parallel signature sequencing (MPSS) libraries from a variety of human and mouse tissues. Using this dataset of almost 20,000 S-AS pairs in both genomes we investigated, in a computational and experimental way, several putative roles that have been assigned to NATs, including gene expression regulation. Furthermore, these global analyses allowed us to better dissect and propose new roles for NATs. Surprisingly, we found that a significant fraction of NATs are artifacts produced by genomic priming during cDNA library construction. Conclusion: We propose an evolutionary and functional model in which alternative polyadenylation and retroposition account for the origin of a significant number of functional S-AS pairs in mammalian genomes.</abstract>\n" +
      "    </front>\n" +
      "    <body class=\"DoCO:BodyMatter\">\n" +
      "      <section class=\"deo:Results\">\n" +
      "        <h1 class=\"DoCO:SectionTitle\" id=\"34\" page=\"2\" column=\"2\">Results and discussion</h1>\n" +
      "        <region class=\"DoCO:TextChunk\" id=\"151\" page=\"2\" column=\"2\">Overall distribution of S-AS pairs in human and mouse genomes To identify transcripts that derive from opposite strands of the same locus, we used a modified version of an in-house knowledgebase previously described for humans [26-28]. This knowledgebase contains more than 6 million expressed sequences mapped onto the human genome sequence and clustered in approximately 111,000 groups. [...]</region>\n" +
      "      </section>\n" +
      "    </body>\n" +
      "  </article>\n" +
      "</pdfx>\n"
    );
  } else {
    $('#metainput').val('');
    $('#maininput').val('');
  }
}
