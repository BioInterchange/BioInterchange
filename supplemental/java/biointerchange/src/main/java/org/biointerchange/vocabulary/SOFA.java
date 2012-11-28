package org.biointerchange.vocabulary;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

public class SOFA {

  public static Resource adjacent_to() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:adjacent_to");
  }

  public static Resource complete_evidence_for_feature() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:complete_evidence_for_feature");
  }

  public static Resource contained_by() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:contained_by");
  }

  public static Resource contains() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:contains");
  }

  public static Resource derives_from() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:derives_from");
  }

  public static Resource evidence_for_feature() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:evidence_for_feature");
  }

  public static Resource has_integral_part() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:has_integral_part");
  }

  public static Resource has_part() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:has_part");
  }

  public static Resource homologous_to() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:homologous_to");
  }

  public static Resource integral_part_of() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:integral_part_of");
  }

  public static Resource member_of() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:member_of");
  }

  public static Resource non_functional_homolog_of() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:non_functional_homolog_of");
  }

  public static Resource orthologous_to() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:orthologous_to");
  }

  public static Resource paralogous_to() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:paralogous_to");
  }

  public static Resource part_of() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:part_of");
  }

  public static Resource partial_evidence_for_feature() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:partial_evidence_for_feature");
  }

  public static Resource similar_to() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:similar_to");
  }

  public static Resource Sequence_Ontology() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000000");
  }

  /**
   * A sequence_feature with an extent greater than zero. A nucleotide region is composed of bases and a polypeptide region is composed of amino acids. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000001)
   */
  public static Resource region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000001");
  }

  public static Resource interior_coding_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000004");
  }

  /**
   * The many tandem repeats (identical or related) of a short basic repeating unit; many have a base composition or other property different from the genome average that allows them to be separated from the bulk (main band) genomic DNA. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000005)
   */
  public static Resource satellite_DNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000005");
  }

  /**
   * A region amplified by a PCR reaction. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000006)
   */
  public static Resource PCR_product() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000006");
  }

  /**
   * One of a pair of sequencing reads in which the two members of the pair are related by originating at either end of a clone insert. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000007)
   */
  public static Resource read_pair() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000007");
  }

  /**
   * A small non coding RNA sequence, present in the cytoplasm. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000013)
   */
  public static Resource scRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000013");
  }

  /**
   * A collection of match parts. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000038)
   */
  public static Resource match_set() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000038");
  }

  /**
   * A part of a match, for example an hsp from blast is a match_part. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000039)
   */
  public static Resource match_part() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000039");
  }

  /**
   * A part of a gene, that has no other route in the ontology back to region. This concept is necessary for logical inference as these parts must have the properties of region. It also allows us to associate all the parts of genes with a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000050)
   */
  public static Resource gene_part() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000050");
  }

  /**
   * A regulatory element of an operon to which activators or repressors bind thereby effecting translation of genes in that operon. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000057)
   */
  public static Resource operator() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000057");
  }

  /**
   * A binding site that, of a nucleotide molecule, that interacts selectively and non-covalently with polypeptide residues of a nuclease. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000059)
   */
  public static Resource nuclease_binding_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000059");
  }

  /**
   * A transposon or insertion sequence. An element that can insert in a variety of DNA sequences. (http://www.sci.sdsu.edu/~smaloy/Glossary/T.html)
   * (http://purl.obolibrary.org/obo/SO_0000101)
   */
  public static Resource transposable_element() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000101");
  }

  /**
   * A match to an EST or cDNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000102)
   */
  public static Resource expressed_sequence_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000102");
  }

  /**
   * The end of the clone insert. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000103)
   */
  public static Resource clone_insert_end() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000103");
  }

  /**
   * A sequence of amino acids linked by peptide bonds which may lack appreciable tertiary structure and may not be liable to irreversible denaturation. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000104)
   */
  public static Resource polypeptide() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000104");
  }

  /**
   * A sequence_variant is a non exact copy of a sequence_feature or genome exhibiting one or more sequence_alteration. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000109)
   */
  public static Resource sequence_variant_obs() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000109");
  }

  /**
   * An extent of biological sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000110)
   */
  public static Resource sequence_feature() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000110");
  }

  /**
   * An oligo to which new deoxyribonucleotides can be added by DNA polymerase. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000112)
   */
  public static Resource primer() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000112");
  }

  /**
   * A viral sequence which has integrated into a host genome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000113)
   */
  public static Resource proviral_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000113");
  }

  /**
   * A methylated deoxy-cytosine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000114)
   */
  public static Resource methylated_C() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000114");
  }

  /**
   * A primary transcript that, at least in part, encodes one or more proteins. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000120)
   */
  public static Resource protein_coding_primary_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000120");
  }

  /**
   * Region in mRNA where ribosome assembles. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000139)
   */
  public static Resource ribosome_entry_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000139");
  }

  /**
   * A sequence segment located within the five prime end of an mRNA that causes premature termination of translation. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000140)
   */
  public static Resource attenuator() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000140");
  }

  /**
   * The sequence of DNA located either at the end of the transcript that causes RNA polymerase to terminate transcription. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000141)
   */
  public static Resource terminator() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000141");
  }

  /**
   * A region of known length which may be used to manufacture a longer region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000143)
   */
  public static Resource assembly_component() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000143");
  }

  /**
   * A region of the transcript sequence within a gene which is not removed from the primary RNA transcript by RNA splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000147)
   */
  public static Resource exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000147");
  }

  /**
   * One or more contigs that have been ordered and oriented using end-read information. Contains gaps that are filled with N"s. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000148)
   */
  public static Resource supercontig() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000148");
  }

  /**
   * A contiguous sequence derived from sequence assembly. Has no gaps, but may contain N"s from unavailable bases. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000149)
   */
  public static Resource contig() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000149");
  }

  /**
   * A sequence obtained from a single sequencing experiment. Typically a read is produced when a base calling program interprets information from a chromatogram trace file produced from a sequencing machine. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000150)
   */
  public static Resource read() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000150");
  }

  /**
   * A piece of DNA that has been inserted in a vector so that it can be propagated in a host bacterium or some other organism. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000151)
   */
  public static Resource _clone_() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000151");
  }

  /**
   * The point at which one or more contiguous nucleotides were excised. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000159)
   */
  public static Resource deletion() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000159");
  }

  /**
   * A modified RNA base in which adenine has been methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000161)
   */
  public static Resource methylated_A() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000161");
  }

  /**
   * Consensus region of primary transcript bordering junction of splicing. A region that overlaps exactly 2 base and adjacent_to splice_junction. (SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000162)
   */
  public static Resource splice_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000162");
  }

  /**
   * Intronic 2 bp region bordering the exon, at the 5" edge of the intron. A splice_site that is downstream_adjacent_to exon and starts intron. (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000163)
   */
  public static Resource five_prime_cis_splice_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000163");
  }

  /**
   * Intronic 2 bp region bordering the exon, at the 3" edge of the intron. A splice_site that is upstream_adjacent_to exon and finishes intron. (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000164)
   */
  public static Resource three_prime_cis_splice_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000164");
  }

  /**
   * A cis-acting sequence that increases the utilization of (some) eukaryotic promoters, and can function in either orientation and in any location (upstream or downstream) relative to the promoter. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000165)
   */
  public static Resource enhancer() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000165");
  }

  /**
   * A regulatory_region composed of the TSS(s) and binding sites for TF_complexes of the basal transcription machinery. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0000167)
   */
  public static Resource promoter() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000167");
  }

  /**
   * A nucleotide match against a sequence from another organism. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000177)
   */
  public static Resource cross_genome_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000177");
  }

  /**
   * A group of contiguous genes transcribed as a single (polycistronic) mRNA from a single regulatory region. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000178)
   */
  public static Resource operon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000178");
  }

  /**
   * The start of the clone insert. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000179)
   */
  public static Resource clone_insert_start() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000179");
  }

  /**
   * A match against a translated sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000181)
   */
  public static Resource translated_nucleotide_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000181");
  }

  /**
   * A region of the gene which is not transcribed. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000183)
   */
  public static Resource non_transcribed_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000183");
  }

  /**
   * A transcript that in its initial state requires modification to be functional. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000185)
   */
  public static Resource primary_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000185");
  }

  /**
   * A group of characterized repeat sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000187)
   */
  public static Resource repeat_family() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000187");
  }

  /**
   * A region of a primary transcript that is transcribed, but removed from within the transcript by splicing together the sequences (exons) on either side of it. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000188)
   */
  public static Resource intron() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000188");
  }

  /**
   * A DNA fragment used as a reagent to detect the polymorphic genomic loci by hybridizing against the genomic DNA digested with a given restriction enzyme. (GOC:pj)
   * (http://purl.obolibrary.org/obo/SO_0000193)
   */
  public static Resource RFLP_fragment() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000193");
  }

  /**
   * An exon whereby at least one base is part of a codon (here, "codon" is inclusive of the stop_codon). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000195)
   */
  public static Resource coding_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000195");
  }

  /**
   * The sequence of the five_prime_coding_exon that codes for protein. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000196)
   */
  public static Resource five_prime_coding_exon_coding_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000196");
  }

  /**
   * The sequence of the three_prime_coding_exon that codes for protein. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000197)
   */
  public static Resource three_prime_coding_exon_coding_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000197");
  }

  /**
   * An exon that does not contain any codons. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000198)
   */
  public static Resource noncoding_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000198");
  }

  /**
   * The 5" most coding exon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000200)
   */
  public static Resource five_prime_coding_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000200");
  }

  /**
   * Messenger RNA sequences that are untranslated and lie five prime or three prime to sequences which are translated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000203)
   */
  public static Resource UTR() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000203");
  }

  /**
   * A region at the 5" end of a mature transcript (preceding the initiation codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000204)
   */
  public static Resource five_prime_UTR() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000204");
  }

  /**
   * A region at the 3" end of a mature transcript (following the stop codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000205)
   */
  public static Resource three_prime_UTR() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000205");
  }

  /**
   * A primary transcript encoding a ribosomal RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000209)
   */
  public static Resource rRNA_primary_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000209");
  }

  /**
   * A transcript which has undergone the necessary modifications, if any, for its function. In eukaryotes this includes, for example, processing of introns, cleavage, base modification, and modifications to the 5" and/or the 3" ends, other than addition of bases. In bacteria functional mRNAs are usually not modified. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000233)
   */
  public static Resource mature_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000233");
  }

  /**
   * Messenger RNA is the intermediate molecule between DNA and protein. It includes UTR and coding sequences. It does not contain introns. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000234)
   */
  public static Resource mRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000234");
  }

  /**
   * A region of a nucleotide molecule that binds a Transcription Factor or Transcription Factor complex [GO:0005667]. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000235)
   */
  public static Resource TF_binding_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000235");
  }

  /**
   * The in-frame interval between the stop codons of a reading frame which when read as sequential triplets, has the potential of encoding a sequential string of amino acids. TER(NNN)nTER. (SGD:rb, SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000236)
   */
  public static Resource ORF() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000236");
  }

  /**
   * The sequences extending on either side of a specific region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000239)
   */
  public static Resource flanking_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000239");
  }

  /**
   * RNA that comprises part of a ribosome, and that can provide both structural scaffolding and catalytic activity. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, ISBN:0198506732)
   * (http://purl.obolibrary.org/obo/SO_0000252)
   */
  public static Resource rRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000252");
  }

  /**
   * Transfer RNA (tRNA) molecules are approximately 80 nucleotides in length. Their secondary structure includes four short double-helical elements and three loops (D, anti-codon, and T loops). Further hydrogen bonds mediate the characteristic L-shaped molecular structure. Transfer RNAs have two regions of fundamental functional importance: the anti-codon, which is responsible for specific mRNA codon recognition, and the 3" end, to which the tRNA"s corresponding amino acid is attached (by aminoacyl-tRNA synthetases). Transfer RNAs cope with the degeneracy of the genetic code in two manners: having more than one tRNA (with a specific anti-codon) for a particular amino acid; and "wobble" base-pairing, i.e. permitting non-standard base-pairing at the 3rd anti-codon position. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00005, ISBN:0198506732)
   * (http://purl.obolibrary.org/obo/SO_0000253)
   */
  public static Resource tRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000253");
  }

  /**
   * A small nuclear RNA molecule involved in pre-mRNA splicing and processing. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, PMID:11733745, WB:ems)
   * (http://purl.obolibrary.org/obo/SO_0000274)
   */
  public static Resource snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000274");
  }

  /**
   * A snoRNA (small nucleolar RNA) is any one of a class of small RNAs that are associated with the eukaryotic nucleus as components of small nucleolar ribonucleoproteins. They participate in the processing or modifications of many RNAs, mostly ribosomal RNAs (rRNAs) though snoRNAs are also known to target other classes of RNA, including spliceosomal RNAs, tRNAs, and mRNAs via a stretch of sequence that is complementary to a sequence in the targeted RNA. (GOC:kgc)
   * (http://purl.obolibrary.org/obo/SO_0000275)
   */
  public static Resource snoRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000275");
  }

  /**
   * Small, ~22-nt, RNA molecule that is the endogenous transcript of a miRNA gene. Micro RNAs are produced from precursor molecules (SO:0000647) that can form local hairpin structures, which ordinarily are processed (via the Dicer pathway) such that a single miRNA molecule accumulates from one arm of a hairpin precursor molecule. Micro RNAs may trigger the cleavage of their target molecules or act as translational repressors. (PMID:12592000)
   * (http://purl.obolibrary.org/obo/SO_0000276)
   */
  public static Resource miRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000276");
  }

  /**
   * A repeat_region containing repeat_units (2 to 4 bp) that is repeated multiple times in tandem. (http://www.informatics.jax.org/silver/glossary.shtml)
   * (http://purl.obolibrary.org/obo/SO_0000289)
   */
  public static Resource microsatellite() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000289");
  }

  /**
   * The sequence is complementarily repeated on the opposite strand. It is a palindrome, and it may, or may not be hyphenated. Examples: GCTGATCAGC, or GCTGA-----TCAGC. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000294)
   */
  public static Resource inverted_repeat() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000294");
  }

  /**
   * The origin of replication; starting site for duplication of a nucleic acid molecule to give two identical copies. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000296)
   */
  public static Resource origin_of_replication() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000296");
  }

  /**
   * Part of the primary transcript that is clipped off during processing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000303)
   */
  public static Resource clip() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000303");
  }

  /**
   * A modified nucleotide, i.e. a nucleotide other than A, T, C. G. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000305)
   */
  public static Resource modified_base() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000305");
  }

  /**
   * A nucleotide modified by methylation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000306)
   */
  public static Resource methylated_base_feature() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000306");
  }

  /**
   * Regions of a few hundred to a few thousand bases in vertebrate genomes that are relatively GC and CpG rich; they are typically unmethylated and often found near the 5" ends of genes. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000307)
   */
  public static Resource CpG_island() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000307");
  }

  /**
   * A repeat where the same sequence is repeated in the same direction. Example: GCTGA-----GCTGA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000314)
   */
  public static Resource direct_repeat() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000314");
  }

  /**
   * The first base where RNA polymerase begins to synthesize the RNA transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000315)
   */
  public static Resource TSS() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000315");
  }

  /**
   * A contiguous sequence which begins with, and includes, a start codon and ends with, and includes, a stop codon. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000316)
   */
  public static Resource CDS() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000316");
  }

  /**
   * First codon to be translated by a ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000318)
   */
  public static Resource start_codon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000318");
  }

  /**
   * In mRNA, a set of three nucleotides that indicates the end of information for protein synthesis. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000319)
   */
  public static Resource stop_codon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000319");
  }

  /**
   * A nucleotide sequence that may be used to identify a larger sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000324)
   */
  public static Resource tag() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000324");
  }

  /**
   * A primary transcript encoding a large ribosomal subunit RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000325)
   */
  public static Resource rRNA_large_subunit_primary_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000325");
  }

  /**
   * A short diagnostic sequence tag, serial analysis of gene expression (SAGE), that allows the quantitative and simultaneous analysis of a large number of transcripts. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=7570003&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000326)
   */
  public static Resource SAGE_tag() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000326");
  }

  /**
   * Region of sequence similarity by descent from a common ancestor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000330)
   */
  public static Resource conserved_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000330");
  }

  /**
   * Short (typically a few hundred base pairs) DNA sequence that has a single occurrence in a genome and whose location and base sequence are known. (http://www.biospace.com)
   * (http://purl.obolibrary.org/obo/SO_0000331)
   */
  public static Resource STS() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000331");
  }

  /**
   * Coding region of sequence similarity by descent from a common ancestor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000332)
   */
  public static Resource coding_conserved_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000332");
  }

  /**
   * The boundary between two exons in a processed transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000333)
   */
  public static Resource exon_junction() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000333");
  }

  /**
   * Non-coding region of sequence similarity by descent from a common ancestor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000334)
   */
  public static Resource nc_conserved_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000334");
  }

  /**
   * A sequence that closely resembles a known functional gene, at another locus within a genome, that is non-functional as a consequence of (usually several) mutations that prevent either its transcription or translation (or both). In general, pseudogenes result from either reverse transcription of a transcript of their \"normal\" paralog (SO:0000043) (in which case the pseudogene typically lacks introns and includes a poly(A) tail) or from recombination (SO:0000044) (in which case the pseudogene is typically a tandem duplication of its \"normal\" paralog). (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html)
   * (http://purl.obolibrary.org/obo/SO_0000336)
   */
  public static Resource pseudogene() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000336");
  }

  /**
   * A double stranded RNA duplex, at least 20bp long, used experimentally to inhibit gene function by RNA interference. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000337)
   */
  public static Resource RNAi_reagent() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000337");
  }

  /**
   * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000340)
   */
  public static Resource chromosome() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000340");
  }

  /**
   * A cytologically distinguishable feature of a chromosome, often made visible by staining, and usually alternating light and dark. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000341)
   */
  public static Resource chromosome_band() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000341");
  }

  /**
   * A region of sequence, aligned to another sequence with some statistical significance, using an algorithm such as BLAST or SIM4. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000343)
   */
  public static Resource match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000343");
  }

  /**
   * Region of a transcript that regulates splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000344)
   */
  public static Resource splice_enhancer() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000344");
  }

  /**
   * A tag produced from a single sequencing read from a cDNA clone or PCR product; typically a few hundred base pairs long. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000345)
   */
  public static Resource EST() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000345");
  }

  /**
   * A match against a nucleotide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000347)
   */
  public static Resource nucleotide_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000347");
  }

  /**
   * A match against a protein sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000349)
   */
  public static Resource protein_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000349");
  }

  /**
   * A sequence of nucleotides that has been algorithmically derived from an alignment of two or more different sequences. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000353)
   */
  public static Resource sequence_assembly() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000353");
  }

  /**
   * A set of (usually) three nucleotide bases in a DNA or RNA sequence, which together code for a unique amino acid or the termination of translation and are contained within the CDS. (http://www.everythingbio.com/glos/definition.php?word=codon, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000360)
   */
  public static Resource codon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000360");
  }

  /**
   * The junction where an insertion occurred. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000366)
   */
  public static Resource insertion_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000366");
  }

  /**
   * The junction in a genome where a transposable_element has inserted. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000368)
   */
  public static Resource transposable_element_insertion_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000368");
  }

  /**
   * A non-coding RNA, usually with a specific secondary structure, that acts to regulate gene expression. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000370)
   */
  public static Resource small_regulatory_ncRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000370");
  }

  /**
   * An RNA sequence that has catalytic activity with or without an associated ribonucleoprotein. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000372)
   */
  public static Resource enzymatic_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000372");
  }

  /**
   * An RNA with catalytic activity. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000374)
   */
  public static Resource ribozyme() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000374");
  }

  /**
   * 5_8S ribosomal RNA (5. 8S rRNA) is a component of the large subunit of the eukaryotic ribosome. It is transcribed by RNA polymerase I as part of the 45S precursor that also contains 18S and 28S rRNA. Functionally, it is thought that 5.8S rRNA may be involved in ribosome translocation. It is also known to form covalent linkage to the p53 tumour suppressor protein. 5_8S rRNA is also found in archaea. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00002)
   * (http://purl.obolibrary.org/obo/SO_0000375)
   */
  public static Resource rRNA_5_8S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000375");
  }

  /**
   * A small catalytic RNA motif that catalyzes self-cleavage reaction. Its name comes from its secondary structure which resembles a carpenter"s hammer. The hammerhead ribozyme is involved in the replication of some viroid and some satellite RNAs. (PMID:2436805)
   * (http://purl.obolibrary.org/obo/SO_0000380)
   */
  public static Resource hammerhead_ribozyme() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000380");
  }

  /**
   * The RNA molecule essential for the catalytic activity of RNase MRP, an enzymatically active ribonucleoprotein with two distinct roles in eukaryotes. In mitochondria it plays a direct role in the initiation of mitochondrial DNA replication. In the nucleus it is involved in precursor rRNA processing, where it cleaves the internal transcribed spacer 1 between 18S and 5.8S rRNAs. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00030)
   * (http://purl.obolibrary.org/obo/SO_0000385)
   */
  public static Resource RNase_MRP_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000385");
  }

  /**
   * The RNA component of Ribonuclease P (RNase P), a ubiquitous endoribonuclease, found in archaea, bacteria and eukarya as well as chloroplasts and mitochondria. Its best characterized activity is the generation of mature 5 prime ends of tRNAs by cleaving the 5 prime leader elements of precursor-tRNAs. Cellular RNase Ps are ribonucleoproteins. RNA from bacterial RNase Ps retains its catalytic activity in the absence of the protein subunit, i.e. it is a ribozyme. Isolated eukaryotic and archaeal RNase P RNA has not been shown to retain its catalytic function, but is still essential for the catalytic activity of the holoenzyme. Although the archaeal and eukaryotic holoenzymes have a much greater protein content than the bacterial ones, the RNA cores from all the three lineages are homologous. Helices corresponding to P1, P2, P3, P4, and P10/11 are common to all cellular RNase P RNAs. Yet, there is considerable sequence variation, particularly among the eukaryotic RNAs. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00010)
   * (http://purl.obolibrary.org/obo/SO_0000386)
   */
  public static Resource RNase_P_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000386");
  }

  /**
   * The RNA component of telomerase, a reverse transcriptase that synthesizes telomeric DNA. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00025)
   * (http://purl.obolibrary.org/obo/SO_0000390)
   */
  public static Resource telomerase_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000390");
  }

  /**
   * U1 is a small nuclear RNA (snRNA) component of the spliceosome (involved in pre-mRNA splicing). Its 5" end forms complementary base pairs with the 5" splice junction, thus defining the 5" donor site of an intron. There are significant differences in sequence and secondary structure between metazoan and yeast U1 snRNAs, the latter being much longer (568 nucleotides as compared to 164 nucleotides in human). Nevertheless, secondary structure predictions suggest that all U1 snRNAs share a "common core" consisting of helices I, II, the proximal region of III, and IV. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00003)
   * (http://purl.obolibrary.org/obo/SO_0000391)
   */
  public static Resource U1_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000391");
  }

  /**
   * U2 is a small nuclear RNA (snRNA) component of the spliceosome (involved in pre-mRNA splicing). Complementary binding between U2 snRNA (in an area lying towards the 5" end but 3" to hairpin I) and the branchpoint sequence (BPS) of the intron results in the bulging out of an unpaired adenine, on the BPS, which initiates a nucleophilic attack at the intronic 5" splice site, thus starting the first of two transesterification reactions that mediate splicing. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00004)
   * (http://purl.obolibrary.org/obo/SO_0000392)
   */
  public static Resource U2_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000392");
  }

  /**
   * U4 small nuclear RNA (U4 snRNA) is a component of the major U2-dependent spliceosome. It forms a duplex with U6, and with each splicing round, it is displaced from U6 (and the spliceosome) in an ATP-dependent manner, allowing U6 to refold and create the active site for splicing catalysis. A recycling process involving protein Prp24 re-anneals U4 and U6. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
   * (http://purl.obolibrary.org/obo/SO_0000393)
   */
  public static Resource U4_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000393");
  }

  /**
   * An snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U6atac_snRNA (SO:0000397). (PMID:=12409455)
   * (http://purl.obolibrary.org/obo/SO_0000394)
   */
  public static Resource U4atac_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000394");
  }

  /**
   * U5 RNA is a component of both types of known spliceosome. The precise function of this molecule is unknown, though it is known that the 5" loop is required for splice site selection and p220 binding, and that both the 3" stem-loop and the Sm site are important for Sm protein binding and cap methylation. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00020)
   * (http://purl.obolibrary.org/obo/SO_0000395)
   */
  public static Resource U5_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000395");
  }

  /**
   * U6 snRNA is a component of the spliceosome which is involved in splicing pre-mRNA. The putative secondary structure consensus base pairing is confined to a short 5" stem loop, but U6 snRNA is thought to form extensive base-pair interactions with U4 snRNA. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
   * (http://purl.obolibrary.org/obo/SO_0000396)
   */
  public static Resource U6_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000396");
  }

  /**
   * U6atac_snRNA is an snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U4atac_snRNA (SO:0000394). (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=retrieve&db=pubmed&list_uids=12409455&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000397)
   */
  public static Resource U6atac_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000397");
  }

  /**
   * U11 snRNA plays a role in splicing of the minor U12-dependent class of eukaryotic nuclear introns, similar to U1 snRNA in the major class spliceosome it base pairs to the conserved 5" splice site sequence. (PMID:9622129)
   * (http://purl.obolibrary.org/obo/SO_0000398)
   */
  public static Resource U11_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000398");
  }

  /**
   * The U12 small nuclear (snRNA), together with U4atac/U6atac, U5, and U11 snRNAs and associated proteins, forms a spliceosome that cleaves a divergent class of low-abundance pre-mRNA introns. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00007)
   * (http://purl.obolibrary.org/obo/SO_0000399)
   */
  public static Resource U12_snRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000399");
  }

  /**
   * U14 small nucleolar RNA (U14 snoRNA) is required for early cleavages of eukaryotic precursor rRNAs. In yeasts, this molecule possess a stem-loop region (known as the Y-domain) which is essential for function. A similar structure, but with a different consensus sequence, is found in plants, but is absent in vertebrates. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00016, PMID:2551119)
   * (http://purl.obolibrary.org/obo/SO_0000403)
   */
  public static Resource U14_snoRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000403");
  }

  /**
   * A family of RNAs are found as part of the enigmatic vault ribonucleoprotein complex. The complex consists of a major vault protein (MVP), two minor vault proteins (VPARP and TEP1), and several small untranslated RNA molecules. It has been suggested that the vault complex is involved in drug resistance. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00006)
   * (http://purl.obolibrary.org/obo/SO_0000404)
   */
  public static Resource vault_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000404");
  }

  /**
   * Y RNAs are components of the Ro ribonucleoprotein particle (Ro RNP), in association with Ro60 and La proteins. The Y RNAs and Ro60 and La proteins are well conserved, but the function of the Ro RNP is not known. In humans the RNA component can be one of four small RNAs: hY1, hY3, hY4 and hY5. These small RNAs are predicted to fold into a conserved secondary structure containing three stem structures. The largest of the four, hY1, contains an additional hairpin. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00019)
   * (http://purl.obolibrary.org/obo/SO_0000405)
   */
  public static Resource Y_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000405");
  }

  /**
   * A large polynucleotide in eukaryotes, which functions as the small subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000407)
   */
  public static Resource rRNA_18S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000407");
  }

  /**
   * A biological_region of sequence that, in the molecule, interacts selectively and non-covalently with other molecules. A region on the surface of a molecule that may interact with another molecule. When applied to polypeptides: Amino acids involved in binding or interactions. It can also apply to an amino acid bond which is represented by the positions of the two flanking amino acids. (EBIBS:GAR, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000409)
   */
  public static Resource binding_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000409");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with polypeptide molecules. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000410)
   */
  public static Resource protein_binding_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000410");
  }

  /**
   * A region of polynucleotide sequence produced by digestion with a restriction endonuclease. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000412)
   */
  public static Resource restriction_fragment() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000412");
  }

  /**
   * A region where the sequence differs from that of a specified sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000413)
   */
  public static Resource sequence_difference() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000413");
  }

  /**
   * The signal_peptide is a short region of the peptide located at the N-terminus that directs the protein to be secreted or part of membrane components. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000418)
   */
  public static Resource signal_peptide() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000418");
  }

  /**
   * The polypeptide sequence that remains when the cleaved peptide regions have been cleaved from the immature peptide. (EBIBS:GAR, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000419)
   */
  public static Resource mature_protein_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000419");
  }

  /**
   * A sequence that can autonomously replicate, as a plasmid, when transformed into a bacterial host. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000436)
   */
  public static Resource ARS() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000436");
  }

  /**
   * A single stranded oligonucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000441)
   */
  public static Resource ss_oligo() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000441");
  }

  /**
   * A double stranded oligonucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000442)
   */
  public static Resource ds_oligo() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000442");
  }

  /**
   * A 17-28-nt, small interfering RNA derived from transcripts of repetitive elements. (http://www.developmentalcell.com/content/article/abstract?uid=PIIS1534580703002284)
   * (http://purl.obolibrary.org/obo/SO_0000454)
   */
  public static Resource rasiRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000454");
  }

  /**
   * A non-functional descendent of a functional entity. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000462)
   */
  public static Resource pseudogenic_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000462");
  }

  /**
   * A non-functional descendant of an exon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000464)
   */
  public static Resource decayed_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000464");
  }

  /**
   * One of the pieces of sequence that make up a golden path. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000468)
   */
  public static Resource golden_path_fragment() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000468");
  }

  /**
   * A set of regions which overlap with minimal polymorphism to form a linear sequence. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000472)
   */
  public static Resource tiling_path() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000472");
  }

  /**
   * A piece of sequence that makes up a tiling_path (SO:0000472). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000474)
   */
  public static Resource tiling_path_fragment() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000474");
  }

  /**
   * A primary transcript that is never translated into a protein. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000483)
   */
  public static Resource nc_primary_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000483");
  }

  /**
   * The sequence of the 3" exon that is not coding. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000484)
   */
  public static Resource three_prime_coding_exon_noncoding_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000484");
  }

  /**
   * The sequence of the 5" exon preceding the start codon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000486)
   */
  public static Resource five_prime_coding_exon_noncoding_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000486");
  }

  /**
   * A continuous piece of sequence similar to the "virtual contig" concept of the Ensembl database. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000499)
   */
  public static Resource virtual_sequence() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000499");
  }

  /**
   * A region of sequence that is transcribed. This region may cover the transcript of a gene, it may emcompas the sequence covered by all of the transcripts of a alternately spliced gene, or it may cover the region transcribed by a polycistronic transcript. A gene may have 1 or more transcribed regions and a transcribed_region may belong to one or more genes. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000502)
   */
  public static Resource transcribed_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000502");
  }

  /**
   * The recognition sequence necessary for endonuclease cleavage of an RNA transcript that is followed by polyadenylation; consensus=AATAAA. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000551)
   */
  public static Resource polyA_signal_sequence() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000551");
  }

  /**
   * The site on an RNA transcript to which will be added adenine residues by post-transcriptional polyadenylation. The boundary between the UTR and the polyA sequence. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000553)
   */
  public static Resource polyA_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000553");
  }

  /**
   * A region of chromosome where the spindle fibers attach during mitosis and meiosis. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000577)
   */
  public static Resource centromere() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000577");
  }

  /**
   * A structure consisting of a 7-methylguanosine in 5"-5" triphosphate linkage with the first nucleotide of an mRNA. It is added post-transcriptionally, and is not encoded in the DNA. (http://seqcore.brcf.med.umich.edu/doc/educ/dnapr/mbglossary/mbgloss.html)
   * (http://purl.obolibrary.org/obo/SO_0000581)
   */
  public static Resource cap() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000581");
  }

  /**
   * Group I catalytic introns are large self-splicing ribozymes. They catalyze their own excision from mRNA, tRNA and rRNA precursors in a wide range of organisms. The core secondary structure consists of 9 paired regions (P1-P9). These fold to essentially two domains, the P4-P6 domain (formed from the stacking of P5, P4, P6 and P6a helices) and the P3-P9 domain (formed from the P8, P3, P7 and P9 helices). Group I catalytic introns often have long ORFs inserted in loop regions. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00028)
   * (http://purl.obolibrary.org/obo/SO_0000587)
   */
  public static Resource group_I_intron() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000587");
  }

  /**
   * A self spliced intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000588)
   */
  public static Resource autocatalytically_spliced_intron() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000588");
  }

  /**
   * The signal recognition particle (SRP) is a universally conserved ribonucleoprotein. It is involved in the co-translational targeting of proteins to membranes. The eukaryotic SRP consists of a 300-nucleotide 7S RNA and six proteins: SRPs 72, 68, 54, 19, 14, and 9. Archaeal SRP consists of a 7S RNA and homologues of the eukaryotic SRP19 and SRP54 proteins. In most eubacteria, the SRP consists of a 4.5S RNA and the Ffh protein (a homologue of the eukaryotic SRP54 protein). Eukaryotic and archaeal 7S RNAs have very similar secondary structures, with eight helical elements. These fold into the Alu and S domains, separated by a long linker region. Eubacterial SRP is generally a simpler structure, with the M domain of Ffh bound to a region of the 4.5S RNA that corresponds to helix 8 of the eukaryotic and archaeal SRP S domain. Some Gram-positive bacteria (e.g. Bacillus subtilis), however, have a larger SRP RNA that also has an Alu domain. The Alu domain is thought to mediate the peptide chain elongation retardation function of the SRP. The universally conserved helix which interacts with the SRP54/Ffh M domain mediates signal sequence recognition. In eukaryotes and archaea, the SRP19-helix 6 complex is thought to be involved in SRP assembly and stabilizes helix 8 for SRP54 binding. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00017)
   * (http://purl.obolibrary.org/obo/SO_0000590)
   */
  public static Resource SRP_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000590");
  }

  /**
   * Most box C/D snoRNAs also contain long (>10 nt) sequences complementary to rRNA. Boxes C and D, as well as boxes C" and D", are usually located in close proximity, and form a structure known as the box C/D motif. This motif is important for snoRNA stability, processing, nucleolar targeting and function. A small number of box C/D snoRNAs are involved in rRNA processing; most, however, are known or predicted to serve as guide RNAs in ribose methylation of rRNA. Targeting involves direct base pairing of the snoRNA at the rRNA site to be modified and selection of a rRNA nucleotide a fixed distance from box D or D". (http://www.bio.umass.edu/biochem/rna-sequence/Yeast_snoRNA_Database/snoRNA_DataBase.html)
   * (http://purl.obolibrary.org/obo/SO_0000593)
   */
  public static Resource C_D_box_snoRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000593");
  }

  /**
   * A short 3"-uridylated RNA that can form a duplex (except for its post-transcriptionally added oligo_U tail (SO:0000609)) with a stretch of mature edited mRNA. (http://www.rna.ucla.edu/index.html)
   * (http://purl.obolibrary.org/obo/SO_0000602)
   */
  public static Resource guide_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000602");
  }

  /**
   * Group II introns are found in rRNA, tRNA and mRNA of organelles in fungi, plants and protists, and also in mRNA in bacteria. They are large self-splicing ribozymes and have 6 structural domains (usually designated dI to dVI). A subset of group II introns also encode essential splicing proteins in intronic ORFs. The length of these introns can therefore be up to 3kb. Splicing occurs in almost identical fashion to nuclear pre-mRNA splicing with two transesterification steps. The 2" hydroxyl of a bulged adenosine in domain VI attacks the 5" splice site, followed by nucleophilic attack on the 3" splice site by the 3" OH of the upstream exon. Protein machinery is required for splicing in vivo, and long range intron-intron and intron-exon interactions are important for splice site positioning. Group II introns are further sub-classified into groups IIA and IIB which differ in splice site consensus, distance of bulged A from 3" splice site, some tertiary interactions, and intronic ORF phylogeny. (http://www.sanger.ac.uk/Software/Rfam/browse/index.shtml)
   * (http://purl.obolibrary.org/obo/SO_0000603)
   */
  public static Resource group_II_intron() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000603");
  }

  /**
   * A region containing or overlapping no genes that is bounded on either side by a gene, or bounded by a gene and the end of the chromosome. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000605)
   */
  public static Resource intergenic_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000605");
  }

  /**
   * Sequence of about 100 nucleotides of A added to the 3" end of most eukaryotic mRNAs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000610)
   */
  public static Resource polyA_sequence() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000610");
  }

  /**
   * A pyrimidine rich sequence near the 3" end of an intron to which the 5"end becomes covalently bound during nuclear splicing. The resulting structure resembles a lariat. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000611)
   */
  public static Resource branch_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000611");
  }

  /**
   * The polypyrimidine tract is one of the cis-acting sequence elements directing intron removal in pre-mRNA splicing. (http://nar.oupjournals.org/cgi/content/full/25/4/888)
   * (http://purl.obolibrary.org/obo/SO_0000612)
   */
  public static Resource polypyrimidine_tract() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000612");
  }

  /**
   * The base where transcription ends. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000616)
   */
  public static Resource transcription_end_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000616");
  }

  /**
   * A specific structure at the end of a linear chromosome, required for the integrity and maintenance of the end. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000624)
   */
  public static Resource telomere() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000624");
  }

  /**
   * A regulatory region which upon binding of transcription factors, suppress the transcription of the gene or genes they control. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000625)
   */
  public static Resource silencer() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000625");
  }

  /**
   * A transcriptional cis regulatory region that when located between a CM and a gene"s promoter prevents the CRM from modulating that genes expression. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0000627)
   */
  public static Resource insulator() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000627");
  }

  public static Resource chromosomal_structural_element() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000628");
  }

  /**
   * A repeat region containing tandemly repeated sequences having a unit length of 10 to 40 bp. (http://www.informatics.jax.org/silver/glossary.shtml)
   * (http://purl.obolibrary.org/obo/SO_0000643)
   */
  public static Resource minisatellite() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000643");
  }

  /**
   * Antisense RNA is RNA that is transcribed from the coding, rather than the template, strand of DNA. It is therefore complementary to mRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000644)
   */
  public static Resource antisense_RNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000644");
  }

  /**
   * The reverse complement of the primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000645)
   */
  public static Resource antisense_primary_transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000645");
  }

  /**
   * A small RNA molecule that is the product of a longer exogenous or endogenous dsRNA, which is either a bimolecular duplex or very long hairpin, processed (via the Dicer pathway) such that numerous siRNAs accumulate from both strands of the dsRNA. SRNAs trigger the cleavage of their target molecules. (PMID:12592000)
   * (http://purl.obolibrary.org/obo/SO_0000646)
   */
  public static Resource siRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000646");
  }

  /**
   * Non-coding RNAs of about 21 nucleotides in length that regulate temporal development; first discovered in C. elegans. (PMID:11081512)
   * (http://purl.obolibrary.org/obo/SO_0000649)
   */
  public static Resource stRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000649");
  }

  /**
   * Ribosomal RNA transcript that structures the small subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000650)
   */
  public static Resource small_subunit_rRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000650");
  }

  /**
   * Ribosomal RNA transcript that structures the large subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000651)
   */
  public static Resource large_subunit_rRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000651");
  }

  /**
   * 5S ribosomal RNA (5S rRNA) is a component of the large ribosomal subunit in both prokaryotes and eukaryotes. In eukaryotes, it is synthesised by RNA polymerase III (the other eukaryotic rRNAs are cleaved from a 45S precursor synthesised by RNA polymerase I). In Xenopus oocytes, it has been shown that fingers 4-7 of the nine-zinc finger transcription factor TFIIIA can bind to the central region of 5S RNA. Thus, in addition to positively regulating 5S rRNA transcription, TFIIIA also stabilizes 5S rRNA until it is required for transcription. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00001)
   * (http://purl.obolibrary.org/obo/SO_0000652)
   */
  public static Resource rRNA_5S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000652");
  }

  /**
   * A component of the large ribosomal subunit. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000653)
   */
  public static Resource rRNA_28S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000653");
  }

  /**
   * An RNA transcript that does not encode for a protein rather the RNA molecule is the gene product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000655)
   */
  public static Resource ncRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000655");
  }

  /**
   * A region of sequence containing one or more repeat units. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000657)
   */
  public static Resource repeat_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000657");
  }

  /**
   * A repeat that is located at dispersed sites in the genome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000658)
   */
  public static Resource dispersed_repeat() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000658");
  }

  /**
   * An intron which is spliced by the spliceosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000662)
   */
  public static Resource spliceosomal_intron() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000662");
  }

  /**
   * The sequence of one or more nucleotides added between two adjacent nucleotides in the sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000667)
   */
  public static Resource insertion() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000667");
  }

  /**
   * A match against an EST sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000668)
   */
  public static Resource EST_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000668");
  }

  /**
   * An RNA synthesized on a DNA or RNA template by an RNA polymerase. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000673)
   */
  public static Resource transcript() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000673");
  }

  /**
   * A region of nucleotide sequence targeted by a nuclease enzyme. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000684)
   */
  public static Resource nuclease_sensitive_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000684");
  }

  /**
   * The space between two bases in a sequence which marks the position where a deletion has occurred. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000687)
   */
  public static Resource deletion_junction() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000687");
  }

  /**
   * A set of subregions selected from sequence contigs which when concatenated form a nonredundant linear sequence. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000688)
   */
  public static Resource golden_path() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000688");
  }

  /**
   * A match against cDNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000689)
   */
  public static Resource cDNA_match() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000689");
  }

  /**
   * SNPs are single base pair positions in genomic DNA at which different sequence alternatives exist in normal individuals in some population(s), wherein the least frequent variant has an abundance of 1% or greater. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000694)
   */
  public static Resource SNP() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000694");
  }

  /**
   * A sequence used in experiment. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000695)
   */
  public static Resource reagent() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000695");
  }

  /**
   * A short oligonucleotide sequence, of length on the order of 10"s of bases; either single or double stranded. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000696)
   */
  public static Resource oligo() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000696");
  }

  /**
   * A sequence_feature with an extent of zero. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000699)
   */
  public static Resource junction() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000699");
  }

  /**
   * A comment about the sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000700)
   */
  public static Resource remark() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000700");
  }

  /**
   * A region of sequence where the validity of the base calling is questionable. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000701)
   */
  public static Resource possible_base_call_error() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000701");
  }

  /**
   * A region of sequence where there may have been an error in the assembly. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000702)
   */
  public static Resource possible_assembly_error() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000702");
  }

  /**
   * A region of sequence implicated in an experimental result. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000703)
   */
  public static Resource experimental_result_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000703");
  }

  /**
   * A region (or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0000704)
   */
  public static Resource gene() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000704");
  }

  /**
   * Two or more adjcent copies of a region (of length greater than 1). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000705)
   */
  public static Resource tandem_repeat() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000705");
  }

  /**
   * The 3" splice site of the acceptor primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000706)
   */
  public static Resource trans_splice_acceptor_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000706");
  }

  /**
   * A region of nucleotide sequence corresponding to a known motif. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000714)
   */
  public static Resource nucleotide_motif() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000714");
  }

  /**
   * A motif that is active in RNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000715)
   */
  public static Resource RNA_motif() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000715");
  }

  /**
   * A nucleic acid sequence that when read as sequential triplets, has the potential of encoding a sequential string of amino acids. It need not contain the start or stop codon. (SGD:rb)
   * (http://purl.obolibrary.org/obo/SO_0000717)
   */
  public static Resource reading_frame() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000717");
  }

  /**
   * An ordered and oriented set of scaffolds based on somewhat weaker sets of inferential evidence such as one set of mate pair reads together with supporting evidence from ESTs or location of markers from SNP or microsatellite maps, or cytogenetic localization of contained markers. (FB:WG)
   * (http://purl.obolibrary.org/obo/SO_0000719)
   */
  public static Resource ultracontig() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000719");
  }

  /**
   * A region of a DNA molecule where transfer is initiated during the process of conjugation or mobilization. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000724)
   */
  public static Resource oriT() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000724");
  }

  /**
   * The transit_peptide is a short region at the N-terminus of the peptide that directs the protein to an organelle (chloroplast, mitochondrion, microbody or cyanelle). (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000725)
   */
  public static Resource transit_peptide() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000725");
  }

  /**
   * A regulatory_region where more than 1 TF_binding_site together are regulatorily active. (SO:SG)
   * (http://purl.obolibrary.org/obo/SO_0000727)
   */
  public static Resource CRM() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000727");
  }

  /**
   * A gap in the sequence of known length. The unknown bases are filled in with N"s. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000730)
   */
  public static Resource gap() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000730");
  }

  public static Resource gene_group_regulatory_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000752");
  }

  /**
   * The region of sequence that has been inserted and is being propagated by the clone. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000753)
   */
  public static Resource clone_insert() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000753");
  }

  /**
   * A non functional descendent of an rRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000777)
   */
  public static Resource pseudogenic_rRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000777");
  }

  /**
   * A non functional descendent of a tRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000778)
   */
  public static Resource pseudogenic_tRNA() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000778");
  }

  /**
   * A region of a chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000830)
   */
  public static Resource chromosome_part() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000830");
  }

  /**
   * A region of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000831)
   */
  public static Resource gene_member_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000831");
  }

  /**
   * A region of a transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000833)
   */
  public static Resource transcript_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000833");
  }

  /**
   * A region of a mature transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000834)
   */
  public static Resource mature_transcript_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000834");
  }

  /**
   * A part of a primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000835)
   */
  public static Resource primary_transcript_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000835");
  }

  /**
   * A region of an mRNA. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000836)
   */
  public static Resource mRNA_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000836");
  }

  /**
   * A region of UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000837)
   */
  public static Resource UTR_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000837");
  }

  /**
   * Biological sequence region that can be assigned to a specific subsequence of a polypeptide. (SO:GAR, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000839)
   */
  public static Resource polypeptide_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000839");
  }

  /**
   * A region within an intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000841)
   */
  public static Resource spliceosomal_intron_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000841");
  }

  public static Resource gene_component_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000842");
  }

  /**
   * A region of a CDS. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000851)
   */
  public static Resource CDS_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000851");
  }

  /**
   * A region of an exon. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000852)
   */
  public static Resource exon_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000852");
  }

  /**
   * A large polynucleotide in Bacteria and Archaea, which functions as the small subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001000)
   */
  public static Resource rRNA_16S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001000");
  }

  /**
   * A large polynucleotide in Bacteria and Archaea, which functions as the large subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001001)
   */
  public static Resource rRNA_23S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001001");
  }

  /**
   * A large polynucleotide which functions as part of the large subunit of the ribosome in some eukaryotes. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001002)
   */
  public static Resource rRNA_25S() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001002");
  }

  /**
   * A variation that increases or decreases the copy number of a given region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001019)
   */
  public static Resource copy_number_variation() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001019");
  }

  /**
   * A nucleotide region with either intra-genome or intracellular moblity, of varying length, which often carry the information necessary for transfer and recombination with the host genome. (PMID:14681355)
   * (http://purl.obolibrary.org/obo/SO_0001037)
   */
  public static Resource mobile_genetic_element() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001037");
  }

  /**
   * An MGE that is integrated into the host chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001039)
   */
  public static Resource integrated_mobile_genetic_element() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001039");
  }

  /**
   * A regulatory_region that modulates the transcription of a gene or genes. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0001055)
   */
  public static Resource transcriptional_cis_regulatory_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001055");
  }

  /**
   * A regulatory_region that modulates splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001056)
   */
  public static Resource splicing_regulatory_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001056");
  }

  /**
   * A sequence_alteration is a sequence_feature whose extent is the deviation from another sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001059)
   */
  public static Resource sequence_alteration() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001059");
  }

  /**
   * An immature_peptide_region is the extent of the peptide after it has been translated and before any processing occurs. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001063)
   */
  public static Resource immature_peptide_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001063");
  }

  /**
   * The maximal intersection of exon and UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001214)
   */
  public static Resource noncoding_region_of_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001214");
  }

  /**
   * The region of an exon that encodes for protein sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001215)
   */
  public static Resource coding_region_of_exon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001215");
  }

  /**
   * A region containing at least one unique origin of replication and a unique termination site. (ISBN:0716719207)
   * (http://purl.obolibrary.org/obo/SO_0001235)
   */
  public static Resource replicon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001235");
  }

  /**
   * A base is a sequence feature that corresponds to a single unit of a nucleotide polymer. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001236)
   */
  public static Resource base() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001236");
  }

  /**
   * A region of the genome of known length that is composed by ordering and aligning two or more different regions. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001248)
   */
  public static Resource assembly() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001248");
  }

  /**
   * A region which is intended for use in an experiment. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001409)
   */
  public static Resource biomaterial_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001409");
  }

  /**
   * A region which is the result of some arbitrary experimental procedure. The procedure may be carried out with biological material or inside a computer. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001410)
   */
  public static Resource experimental_feature() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001410");
  }

  /**
   * A region defined by its disposition to be involved in a biological process. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001411)
   */
  public static Resource biological_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001411");
  }

  /**
   * A region that is defined according to its relations with other regions within the same sequence. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001412)
   */
  public static Resource topologically_defined_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001412");
  }

  /**
   * Intronic 2 bp region bordering exon. A splice_site that adjacent_to exon and overlaps intron. (SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001419)
   */
  public static Resource cis_splice_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001419");
  }

  /**
   * Primary transcript region bordering trans-splice junction. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001420)
   */
  public static Resource trans_splice_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001420");
  }

  /**
   * SNVs are single nucleotide positions in genomic DNA at which different sequence alternatives exist. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001483)
   */
  public static Resource SNV() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001483");
  }

  /**
   * A region of peptide sequence used to target the polypeptide molecule to a specific organelle. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001527)
   */
  public static Resource peptide_localization_signal() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001527");
  }

  /**
   * A kind of ribosome entry site, specific to Eukaryotic organisms that overlaps part of both 5" UTR and CDS sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001647)
   */
  public static Resource kozak_sequence() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001647");
  }

  /**
   * A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001654)
   */
  public static Resource nucleotide_to_protein_binding_site() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001654");
  }

  /**
   * A regulatory region that is involved in the control of the process of transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001679)
   */
  public static Resource transcription_regulatory_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001679");
  }

  /**
   * A sequence motif is a nucleotide or amino-acid sequence pattern that may have biological significance. (http://en.wikipedia.org/wiki/Sequence_motif)
   * (http://purl.obolibrary.org/obo/SO_0001683)
   */
  public static Resource sequence_motif() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001683");
  }

  /**
   * A biological region implicated in inherited changes caused by mechanisms other than changes in the underlying DNA sequence. (http://en.wikipedia.org/wiki/Epigenetics, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001720)
   */
  public static Resource epigenetically_modified_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001720");
  }

  /**
   * An assembly region that has been sequenced from both ends resulting in a read_pair (mate_pair). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001790)
   */
  public static Resource paired_end_fragment() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001790");
  }

  /**
   * A region of sequence that is involved in the control of a biological process. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0005836)
   */
  public static Resource regulatory_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0005836");
  }

  /**
   * A collection of related genes. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0005855)
   */
  public static Resource gene_group() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0005855");
  }

  /**
   * The cleaved_peptide_regon is the a region of peptide sequence that is cleaved during maturation. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100011)
   */
  public static Resource cleaved_peptide_region() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0100011");
  }

  /**
   * A sequence alteration where the length of the change in the variant is the same as that of the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000002)
   */
  public static Resource substitution() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000002");
  }

  /**
   * When no simple or well defined DNA mutation event describes the observed DNA change, the keyword \"complex\" should be used. Usually there are multiple equally plausible explanations for the change. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000005)
   */
  public static Resource complex_substitution() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000005");
  }

  /**
   * A single nucleotide change which has occurred at the same position of a corresponding nucleotide in a reference sequence. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_1000008)
   */
  public static Resource point_mutation() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000008");
  }

  /**
   * A continuous nucleotide sequence is inverted in the same position. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000036)
   */
  public static Resource inversion() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000036");
  }

  /**
   * A group of genes, whether linked as a cluster or not, that respond to a common regulatory signal. (ISBN:0198506732)
   * (http://purl.obolibrary.org/obo/SO_1001284)
   */
  public static Resource regulon() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1001284");
  }

  /**
   * The sequence referred to by an entry in a databank such as Genbank or SwissProt. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_2000061)
   */
  public static Resource databank_entry() {
    return _namespace_SOFA("http://purl.obolibrary.org/obo/SO_2000061");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:adjacent_to")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:complete_evidence_for_feature")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:contained_by")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:contains")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:derives_from")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:evidence_for_feature")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:has_integral_part")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:has_part")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:homologous_to")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:integral_part_of")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:member_of")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:non_functional_homolog_of")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:orthologous_to")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:paralogous_to")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:part_of")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:partial_evidence_for_feature")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:similar_to")) {
      return true;
    }
    return false;
  }

  /**
   * Determines whether the given URI is a datatype property.
   * 
   * @param uri URI that is tested for being a datatype property
   */
  public static boolean isDatatypeProperty(Resource uri) {
    return false;
  }

  /**
   * Determines whether the given URI is a class.
   * 
   * @param uri URI that is tested for being a class
   */
  public static boolean isClass(Resource uri) {
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000000")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000001")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000004")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000005")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000006")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000007")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000013")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000038")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000039")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000050")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000057")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000059")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000101")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000102")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000103")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000104")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000109")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000110")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000112")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000113")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000114")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000120")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000139")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000140")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000141")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000143")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000147")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000148")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000149")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000150")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000151")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000159")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000161")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000162")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000163")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000164")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000165")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000167")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000177")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000178")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000179")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000181")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000183")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000185")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000187")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000188")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000193")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000195")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000196")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000197")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000198")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000200")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000203")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000204")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000205")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000209")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000233")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000234")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000235")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000236")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000239")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000252")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000253")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000274")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000275")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000276")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000289")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000294")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000296")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000303")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000305")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000306")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000307")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000314")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000315")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000316")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000318")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000319")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000324")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000325")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000326")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000330")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000331")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000332")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000333")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000334")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000336")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000337")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000340")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000341")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000343")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000344")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000345")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000347")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000349")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000353")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000360")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000366")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000368")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000370")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000372")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000374")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000375")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000380")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000385")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000386")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000390")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000391")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000392")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000393")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000394")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000395")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000396")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000397")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000398")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000399")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000403")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000404")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000405")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000407")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000409")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000410")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000412")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000413")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000418")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000419")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000436")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000441")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000442")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000454")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000462")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000464")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000468")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000472")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000474")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000483")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000484")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000486")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000499")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000502")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000551")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000553")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000577")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000581")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000587")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000588")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000590")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000593")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000602")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000603")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000605")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000610")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000611")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000612")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000616")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000624")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000625")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000627")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000628")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000643")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000644")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000645")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000646")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000649")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000650")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000651")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000652")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000653")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000655")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000657")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000658")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000662")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000667")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000668")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000673")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000684")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000687")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000688")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000689")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000694")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000695")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000696")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000699")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000700")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000701")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000702")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000703")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000704")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000705")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000706")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000714")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000715")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000717")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000719")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000724")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000725")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000727")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000730")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000752")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000753")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000777")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000778")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000830")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000831")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000833")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000834")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000835")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000836")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000837")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000839")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000841")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000842")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000851")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0000852")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001000")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001001")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001002")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001019")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001037")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001039")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001055")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001056")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001059")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001063")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001214")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001215")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001235")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001236")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001248")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001409")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001410")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001411")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001412")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001419")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001420")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001483")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001527")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001647")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001654")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001679")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001683")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001720")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0001790")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0005836")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0005855")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_0100011")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000002")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000005")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000008")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1000036")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_1001284")) {
      return true;
    }
    if (uri == _namespace_SOFA("http://purl.obolibrary.org/obo/SO_2000061")) {
      return true;
    }
    return false;
  }

  /**
   * Determines whether the given URI is a named individual.
   * 
   * @param uri URI that is tested for being a named individual
   */
  public static boolean isNamedIndividual(Resource uri) {
    return false;
  }

  /**
   * Returns only those URIs that fall under a designated parent URI.
   * 
   * @param uris Set of URIs that are tested whether they have the given parent URI.
   * @param parent Parent URI.
   */
  public static Set<Resource> withParent(Set<Resource> uris, final Resource parent) {
    return new HashSet<Resource>(CollectionUtils.select(uris, new Predicate() { public boolean evaluate(Object uri) { return hasParent((Resource)uri, parent); } }));
  }

  /**
   * Recursively tries to determine the parent for a given URI.
   * 
   * @param uri URI that is tested for whether it has the given parent URI.
   * @param parent Parent URI.
   */
  public static boolean hasParent(Resource uri, Resource parent) {
    if (__parent_properties.containsKey(uri)) {
      if (__parent_properties.get(uri) == parent) {
        return true;
      }
      return hasParent((Resource)__parent_properties.get(uri), parent);
    }
    return false;
  }

  private static Resource _namespace_SOFA(String accession) {
    if (isClass(ResourceFactory.createResource("http://purl.obolibrary.org/obo/" + accession))) {
      return ResourceFactory.createResource("http://purl.obolibrary.org/obo/" + accession);
    } else {
      return ResourceFactory.createProperty("http://purl.obolibrary.org/obo/" + accession);
    }
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();


    return map;
  }


}
