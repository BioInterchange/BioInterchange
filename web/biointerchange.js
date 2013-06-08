/* Generates RDF from provided data according to additionally given parameters.
 *
 * '#inputformat': select box that determines the type of input data that should be converted into RDF
 * '#metainput': a text field that contains parameters for the RDF conversion in JSON format
 * '#output': text field to which the RDF output is appended to
 */
function generateRDF() {
  if ($('#inputformat').val() == 'biointerchange.gff3' || $('#inputformat').val() == 'biointerchange.gvf' || $('#inputformat').val() == 'dbcls.catanns.json' || $('#inputformat').val() == 'phylotastic.newick' || $('#inputformat').val() == 'uk.ac.man.pdfx') {
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

/* Determines valid RDF output converters ("writers" or serializers) based on the chosen input data type/format.
 *
 * '#inputformat': select box that determines the input format type
 * '#outputformat': select box with all available output formats -- some of which might be disabled (based on selected input format)
 */
function selectDbclsCatannsJson() {
  var outputFormats = $('#outputformat')[0];
  for (var i = 0; i < outputFormats.length; i++)
    if ($('#inputformat').val() == 'biointerchange.gff3') {
      if (outputFormats[i].value == 'rdf.biointerchange.gff3') {
        outputFormats[i].selected = true;
        outputFormats[i].disabled = false;
      } else {
        outputFormats[i].selected = false;
        outputFormats[i].disabled = true;
      }
    } else if ($('#inputformat').val() == 'biointerchange.gvf') {
      if (outputFormats[i].value == 'rdf.biointerchange.gvf') {
        outputFormats[i].selected = true;
        outputFormats[i].disabled = false;
      } else {
        outputFormats[i].selected = false;
        outputFormats[i].disabled = true;
      }
    } else if ($('#inputformat').val() == 'dbcls.catanns.json') {
      if (outputFormats[i].value == 'rdf.bh12.sio') {
        outputFormats[i].selected = true;
        outputFormats[i].disabled = false;
      } else {
        outputFormats[i].selected = false;
        outputFormats[i].disabled = true;
      }
    } else if ($('#inputformat').val() == 'phylotastic.newick') {
      if (outputFormats[i].value == 'rdf.phylotastic.newick') {
        outputFormats[i].selected = true;
        outputFormats[i].disabled = false;
      } else {
        outputFormats[i].selected = false;
        outputFormats[i].disabled = true;
      }
    } else if ($('#inputformat').val() == 'uk.ac.man.pdfx') {
      if (outputFormats[i].value == 'rdf.bh12.sio') {
        outputFormats[i].selected = true;
        outputFormats[i].disabled = false;
      } else {
        outputFormats[i].selected = false;
        outputFormats[i].disabled = true;
      }
    } else {
     // Woopsie.
    }
}

/* Pastes an example into the web form.
 *
 * '#inputformat': a select box determining the input data format
 * '#metainput': text field that is being populated with example parameters in JSON format
 * '#maininput': text field that is being populated with a data example
 */
function pasteExample() {
  if ($('#inputformat').val() == 'biointerchange.gff3') {
    $('#metainput').val(
      "{\n" +
      "  \"input\" : \"biointerchange.gff3\",\n" +
      "  \"output\" : \"rdf.biointerchange.gff3\",\n" +
      "  \"name\" : \"Peter Smith\",\n" +
      "  \"name_id\" : \"peter.smith@some.example.domain\",\n" +
      "  \"date\" : \"2012-07-19\"\n" +
      "}\n"
    );
    $('#maininput').val(
      "##gff-version 3\n" +
      "##species http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=9913\n" +
      "##sequence-region ChrX.38 1 88516663\n" +
      "ChrX.38\tbovine_complete_cds_gmap_perfect\tgene\t15870\t16254\t.\t+\t.\tID=BC109609_ChrX.38\n" +
      "ChrX.38\tbovine_complete_cds_gmap_perfect\tmRNA\t15870\t16254\t.\t+\t.\tID=bovine_complete_cds_gmap_perfect_BC109609_ChrX.38;Parent=BC109609_ChrX.38\n" +
      "ChrX.38\tbovine_complete_cds_gmap_perfect\tCDS\t15870\t16254\t.\t+\t0\tParent=bovine_complete_cds_gmap_perfect_BC109609_ChrX.38\n" +
      "ChrX.38\tbovine_complete_cds_gmap_perfect\texon\t15870\t16254\t.\t+\t0\tParent=bovine_complete_cds_gmap_perfect_BC109609_ChrX.38\n"
    );
  } else if ($('#inputformat').val() == 'biointerchange.gvf') {
    $('#metainput').val(
      "{\n" +
      "  \"input\" : \"biointerchange.gvf\",\n" +
      "  \"output\" : \"rdf.biointerchange.gvf\",\n" +
      "  \"name\" : \"Peter Smith\",\n" +
      "  \"name_id\" : \"peter.smith@some.example.domain\",\n" +
      "  \"date\" : \"2012-07-19\"\n" +
      "}\n"
    );
    $('#maininput').val(
      "##gff-version 3\n" +
      "##gvf-version 1.06\n" +
      "##species http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=4932\n" +
      "##feature-ontology http://song.cvs.sourceforge.net/viewvc/song/ontology/so.obo?revision=1.283\n" +
      "##data-source Source=ensembl;version=71;url=http://e71.ensembl.org/Saccharomyces_cerevisiae\n" +
      "##sequence-region I 1 230218\n" +

      "##gff-version 3\n" +
      "##gvf-version 1.06\n" +
      "##species http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=9606\n" +
      "##file-date 2012-11-29\n" +
      "##genome-build NCBI NCBI36\n" +
      "Chr1	DGVa	copy_number_loss	4320920	4323975	.	.	.	ID=1;Name=essv2585519;variant_call_so_id=SO:0001743;parent=esv275066;Start_range=4320920,4321865;End_range=4323946,4323975;submitter_variant_id=IgH3.4SSV1;samples=Unknown;var_origin=Not tested;Variant_seq=.\n"
    );
  } else if ($('#inputformat').val() == 'dbcls.catanns.json') {
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
  } else if ($('#inputformat').val() == 'phylotastic.newick') {
    $('#metainput').val(
      "{\n" +
      "  \"input\" : \"phylotastic.newick\",\n" +
      "  \"output\" : \"rdf.phylotastic.newick\",\n" +
      "  \"date\" : \"2012-07-19\"\n" +
      "}\n"
    );
    $('#maininput').val(
      "((B:0.2,(C:0.3,D:0.4)E:0.5)F:0.1)A;\n"
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
