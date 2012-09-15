function generateRDF() {
  if ($('#inputformat').val() == 'dbcls.catanns.json') {
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
      contentType: 'biointerchange/dbcls.catanns.json',
      dataType: 'text'
    });
  }
}

function pasteExample() {
  if ($('#inputformat').val() == 'dbcls.catanns.json') {
    $('#metainput').val(
      "{\n" +
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
  } else {
    $('#metainput').val('');
    $('#maininput').val('');
  }
}
