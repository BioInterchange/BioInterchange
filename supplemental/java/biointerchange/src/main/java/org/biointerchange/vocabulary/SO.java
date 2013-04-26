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

module BioInterchange;

public class SO {

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_adjacent_to)
   */
  public static Resource adjacent_to() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_adjacent_to");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_complete_evidence_for_feature)
   */
  public static Resource complete_evidence_for_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_complete_evidence_for_feature");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_contained_by)
   */
  public static Resource contained_by() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_contained_by");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_contains)
   */
  public static Resource contains() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_contains");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_derives_from)
   */
  public static Resource derives_from() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_derives_from");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_evidence_for_feature)
   */
  public static Resource evidence_for_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_evidence_for_feature");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_guided_by)
   */
  public static Resource guided_by() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_guided_by");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_has_integral_part)
   */
  public static Resource has_integral_part() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_integral_part");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_has_origin)
   */
  public static Resource has_origin() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_origin");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_has_part)
   */
  public static Resource has_part() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_part");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_has_quality)
   */
  public static Resource has_quality() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_quality");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_homologous_to)
   */
  public static Resource homologous_to() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_homologous_to");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_integral_part_of)
   */
  public static Resource integral_part_of() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_integral_part_of");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_member_of)
   */
  public static Resource member_of() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_member_of");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_non_functional_homolog_of)
   */
  public static Resource non_functional_homolog_of() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_non_functional_homolog_of");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_orthologous_to)
   */
  public static Resource orthologous_to() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_orthologous_to");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_overlaps)
   */
  public static Resource overlaps() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_overlaps");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_paralogous_to)
   */
  public static Resource paralogous_to() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_paralogous_to");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_part_of)
   */
  public static Resource part_of() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_part_of");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_partial_evidence_for_feature)
   */
  public static Resource partial_evidence_for_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_partial_evidence_for_feature");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_similar_to)
   */
  public static Resource similar_to() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_similar_to");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_transcribed_from)
   */
  public static Resource transcribed_from() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_transcribed_from");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_transcribed_to)
   */
  public static Resource transcribed_to() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_transcribed_to");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SEQUENCE_variant_of)
   */
  public static Resource variant_of() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_variant_of");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000000)
   */
  public static Resource Sequence_Ontology() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000000");
  }

  /**
   * A sequence_feature with an extent greater than zero. A nucleotide region is composed of bases and a polypeptide region is composed of amino acids. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000001)
   */
  public static Resource region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000001");
  }

  /**
   * A folded sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000002)
   */
  public static Resource sequence_secondary_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000002");
  }

  /**
   * G-quartets are unusual nucleic acid structures consisting of a planar arrangement where each guanine is hydrogen bonded by hoogsteen pairing to another guanine in the quartet. (http://www.ncbi.nlm.nih.gov/pubmed/7919797?dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000003)
   */
  public static Resource G_quartet() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000003");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000004)
   */
  public static Resource interior_coding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000004");
  }

  /**
   * The many tandem repeats (identical or related) of a short basic repeating unit; many have a base composition or other property different from the genome average that allows them to be separated from the bulk (main band) genomic DNA. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000005)
   */
  public static Resource satellite_DNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000005");
  }

  /**
   * A region amplified by a PCR reaction. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000006)
   */
  public static Resource PCR_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000006");
  }

  /**
   * One of a pair of sequencing reads in which the two members of the pair are related by originating at either end of a clone insert. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000007)
   */
  public static Resource read_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000007");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000008)
   */
  public static Resource gene_sensu_your_favorite_organism() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000008");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000009)
   */
  public static Resource gene_class() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000009");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000010)
   */
  public static Resource protein_coding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000010");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000011)
   */
  public static Resource non_protein_coding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000011");
  }

  /**
   * The primary transcript of any one of several small cytoplasmic RNA molecules present in the cytoplasm and sometimes nucleus of a eukaryote. (http://www.ebi.ac.uk/embl/WebFeat/align/scRNA_s.html)
   * (http://purl.obolibrary.org/obo/SO_0000012)
   */
  public static Resource scRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000012");
  }

  /**
   * A small non coding RNA sequence, present in the cytoplasm. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000013)
   */
  public static Resource scRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000013");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters required for the correct positioning of the polymerase for the start of transcription. Overlaps the TSS. The mammalian consensus sequence is YYAN(T|A)YY; the Drosophila consensus sequence is TCA(G|T)t(T|C). In each the A is at position +1 with respect to the TSS. Functionally similar to the TATA box element. (PMID:12651739, PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0000014)
   */
  public static Resource INR_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000014");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters; Positioned from +28 to +32 with respect to the TSS (+1). Experimental results suggest that the DPE acts in conjunction with the INR_motif to provide a binding site for TFIID in the absence of a TATA box to mediate transcription of TATA-less promoters. Consensus sequence (A|G)G(A|T)(C|T)(G|A|C). (PMID:12651739:12537576, PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0000015)
   */
  public static Resource DPE_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000015");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, located immediately upstream of some TATA box elements at -37 to -32 with respect to the TSS (+1). Consensus sequence is (G|C)(G|C)(G|A)CGCC. Binds TFIIB. (PMID:12651739, PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0000016)
   */
  public static Resource BREu_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000016");
  }

  /**
   * A sequence element characteristic of the promoters of snRNA genes transcribed by RNA polymerase II or by RNA polymerase III. Located between -45 and -60 relative to the TSS. The human PSE_motif consensus sequence is TCACCNTNA(C|G)TNAAAAG(T|G). (PMID:12651739)
   * (http://purl.obolibrary.org/obo/SO_0000017)
   */
  public static Resource PSE_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000017");
  }

  /**
   * A group of loci that can be grouped in a linear order representing the different degrees of linkage among the genes concerned. (ISBN:038752046)
   * (http://purl.obolibrary.org/obo/SO_0000018)
   */
  public static Resource linkage_group() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000018");
  }

  /**
   * A region of double stranded RNA where the bases do not conform to WC base pairing. The loop is closed on both sides by canonical base pairing. If the interruption to base pairing occurs on one strand only, it is known as a bulge. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000020)
   */
  public static Resource RNA_internal_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000020");
  }

  /**
   * An internal RNA loop where one of the strands includes more bases than the corresponding region on the other strand. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000021)
   */
  public static Resource asymmetric_RNA_internal_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000021");
  }

  /**
   * A region forming a motif, composed of adenines, where the minor groove edges are inserted into the minor groove of another helix. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000022)
   */
  public static Resource A_minor_RNA_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000022");
  }

  /**
   * The kink turn (K-turn) is an RNA structural motif that creates a sharp (~120 degree) bend between two continuous helices. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000023)
   */
  public static Resource K_turn_RNA_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000023");
  }

  /**
   * A loop in ribosomal RNA containing the sites of attack for ricin and sarcin. (http://www.ncbi.nlm.nih.gov/pubmed/7897662)
   * (http://purl.obolibrary.org/obo/SO_0000024)
   */
  public static Resource sarcin_like_RNA_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000024");
  }

  /**
   * An internal RNA loop where the extent of the loop on both stands is the same size. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000025)
   */
  public static Resource symmetric_RNA_internal_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000025");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000026)
   */
  public static Resource RNA_junction_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000026");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000027)
   */
  public static Resource RNA_hook_turn() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000027");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000028)
   */
  public static Resource base_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000028");
  }

  /**
   * The canonical base pair, where two bases interact via WC edges, with glycosidic bonds oriented cis relative to the axis of orientation. (PMID:12177293)
   * (http://purl.obolibrary.org/obo/SO_0000029)
   */
  public static Resource WC_base_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000029");
  }

  /**
   * A type of non-canonical base-pairing. (PMID:12177293)
   * (http://purl.obolibrary.org/obo/SO_0000030)
   */
  public static Resource sugar_edge_base_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000030");
  }

  /**
   * DNA or RNA molecules that have been selected from random pools based on their ability to bind other molecules. (http://aptamer.icmb.utexas.edu)
   * (http://purl.obolibrary.org/obo/SO_0000031)
   */
  public static Resource aptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000031");
  }

  /**
   * DNA molecules that have been selected from random pools based on their ability to bind other molecules. (http:aptamer.icmb.utexas.edu)
   * (http://purl.obolibrary.org/obo/SO_0000032)
   */
  public static Resource DNA_aptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000032");
  }

  /**
   * RNA molecules that have been selected from random pools based on their ability to bind other molecules. (http://aptamer.icmb.utexas.edu)
   * (http://purl.obolibrary.org/obo/SO_0000033)
   */
  public static Resource RNA_aptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000033");
  }

  /**
   * Morpholino oligos are synthesized from four different Morpholino subunits, each of which contains one of the four genetic bases (A, C, G, T) linked to a 6-membered morpholine ring. Eighteen to 25 subunits of these four subunit types are joined in a specific order by non-ionic phosphorodiamidate intersubunit linkages to give a Morpholino. (http://www.gene-tools.com/)
   * (http://purl.obolibrary.org/obo/SO_0000034)
   */
  public static Resource morpholino_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000034");
  }

  /**
   * A riboswitch is a part of an mRNA that can act as a direct sensor of small molecules to control their own expression. A riboswitch is a cis element in the 5" end of an mRNA, that acts as a direct sensor of metabolites. (PMID:2820954)
   * (http://purl.obolibrary.org/obo/SO_0000035)
   */
  public static Resource riboswitch() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000035");
  }

  /**
   * A DNA region that is required for the binding of chromatin to the nuclear matrix. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000036)
   */
  public static Resource matrix_attachment_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000036");
  }

  /**
   * A DNA region that includes DNAse hypersensitive sites located 5" to a gene that confers the high-level, position-independent, and copy number-dependent expression to that gene. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000037)
   */
  public static Resource locus_control_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000037");
  }

  /**
   * A collection of match parts. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000038)
   */
  public static Resource match_set() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000038");
  }

  /**
   * A part of a match, for example an hsp from blast is a match_part. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000039)
   */
  public static Resource match_part() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000039");
  }

  /**
   * A clone of a DNA region of a genome. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000040)
   */
  public static Resource genomic_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000040");
  }

  /**
   * An operation that can be applied to a sequence, that results in a change. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000041)
   */
  public static Resource sequence_operation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000041");
  }

  /**
   * An attribute of a pseudogene (SO:0000336). (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000042)
   */
  public static Resource pseudogene_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000042");
  }

  /**
   * A pseudogene where by an mRNA was retrotransposed. The mRNA sequence is transcribed back into the genome, lacking introns and promoters, but often including a polyA tail. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000043)
   */
  public static Resource processed_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000043");
  }

  /**
   * A pseudogene caused by unequal crossing over at recombination. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000044)
   */
  public static Resource pseudogene_by_unequal_crossing_over() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000044");
  }

  /**
   * To remove a subsection of sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000045)
   */
  public static Resource delete() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000045");
  }

  /**
   * To insert a subsection of sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000046)
   */
  public static Resource insert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000046");
  }

  /**
   * To invert a subsection of sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000047)
   */
  public static Resource invert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000047");
  }

  /**
   * To substitute a subsection of sequence for another. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000048)
   */
  public static Resource substitute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000048");
  }

  /**
   * To translocate a subsection of sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000049)
   */
  public static Resource translocate() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000049");
  }

  /**
   * A part of a gene, that has no other route in the ontology back to region. This concept is necessary for logical inference as these parts must have the properties of region. It also allows us to associate all the parts of genes with a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000050)
   */
  public static Resource gene_part() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000050");
  }

  /**
   * A DNA sequence used experimentally to detect the presence or absence of a complementary nucleic acid. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000051)
   */
  public static Resource probe() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000051");
  }

  /**
   * Either:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0000052)
   * Or:
   *   A multi-chromosome deficiency aberration generated by reassortment of other aberration components. (FB:gm)
   *   (http://purl.obolibrary.org/obo/SO_0000802)
   */
  public static Set<Resource> assortment_derived_deficiency() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0000052"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0000802") }));
  }

  /**
   * A sequence_variant_effect which changes the regulatory region of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000053)
   */
  public static Resource sequence_variant_affecting_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000053");
  }

  /**
   * A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000054)
   */
  public static Resource aneuploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000054");
  }

  /**
   * A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number as extra chromosomes are present. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000055)
   */
  public static Resource hyperploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000055");
  }

  /**
   * A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number as some chromosomes are missing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000056)
   */
  public static Resource hypoploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000056");
  }

  /**
   * A regulatory element of an operon to which activators or repressors bind thereby effecting translation of genes in that operon. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000057)
   */
  public static Resource operator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000057");
  }

  /**
   * Either:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0000058)
   * Or:
   *   A multi-chromosome aberration generated by reassortment of other aberration components; presumed to have a deficiency or a duplication. (FB:gm)
   *   (http://purl.obolibrary.org/obo/SO_0000803)
   */
  public static Set<Resource> assortment_derived_aneuploid() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0000058"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0000803") }));
  }

  /**
   * A binding site that, of a nucleotide molecule, that interacts selectively and non-covalently with polypeptide residues of a nuclease. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000059)
   */
  public static Resource nuclease_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000059");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000060)
   */
  public static Resource compound_chromosome_arm() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000060");
  }

  /**
   * A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues of a restriction enzyme. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000061)
   */
  public static Resource restriction_enzyme_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000061");
  }

  /**
   * An intrachromosomal transposition whereby a translocation in which one of the four broken ends loses a segment before re-joining. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_0000062)
   */
  public static Resource deficient_intrachromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000062");
  }

  /**
   * An interchromosomal transposition whereby a translocation in which one of the four broken ends loses a segment before re-joining. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000063)
   */
  public static Resource deficient_interchromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000063");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000064)
   */
  public static Resource gene_by_transcript_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000064");
  }

  /**
   * A chromosome structure variation whereby an arm exists as an individual chromosome element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000065)
   */
  public static Resource free_chromosome_arm() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000065");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000066)
   */
  public static Resource gene_by_polyadenylation_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000066");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000067)
   */
  public static Resource gene_to_gene_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000067");
  }

  /**
   * An attribute describing a gene that has a sequence that overlaps the sequence of another gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000068)
   */
  public static Resource overlapping() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000068");
  }

  /**
   * An attribute to describe a gene when it is located within the intron of another gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000069)
   */
  public static Resource inside_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000069");
  }

  /**
   * An attribute to describe a gene when it is located within the intron of another gene and on the opposite strand. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000070)
   */
  public static Resource inside_intron_antiparallel() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000070");
  }

  /**
   * An attribute to describe a gene when it is located within the intron of another gene and on the same strand. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000071)
   */
  public static Resource inside_intron_parallel() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000071");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000072)
   */
  public static Resource end_overlapping_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000072");
  }

  /**
   * An attribute to describe a gene when the five prime region overlaps with another gene"s 3" region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000073)
   */
  public static Resource five_prime_three_prime_overlap() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000073");
  }

  /**
   * An attribute to describe a gene when the five prime region overlaps with another gene"s five prime region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000074)
   */
  public static Resource five_prime_five_prime_overlap() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000074");
  }

  /**
   * An attribute to describe a gene when the 3" region overlaps with another gene"s 3" region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000075)
   */
  public static Resource three_prime_three_prime_overlap() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000075");
  }

  /**
   * An attribute to describe a gene when the 3" region overlaps with another gene"s 5" region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000076)
   */
  public static Resource three_prime_five_prime_overlap() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000076");
  }

  /**
   * A region sequence that is complementary to a sequence of messenger RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000077)
   */
  public static Resource antisense() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000077");
  }

  /**
   * A transcript that is polycistronic. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000078)
   */
  public static Resource polycistronic_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000078");
  }

  /**
   * A transcript that is dicistronic. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000079)
   */
  public static Resource dicistronic_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000079");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000080)
   */
  public static Resource operon_member() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000080");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000081)
   */
  public static Resource gene_array_member() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000081");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000082)
   */
  public static Resource processed_transcript_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000082");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000083)
   */
  public static Resource macronuclear_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000083");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000084)
   */
  public static Resource micronuclear_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000084");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000085)
   */
  public static Resource gene_by_genome_location() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000085");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000086)
   */
  public static Resource gene_by_organelle_of_genome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000086");
  }

  /**
   * A gene from nuclear sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000087)
   */
  public static Resource nuclear_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000087");
  }

  /**
   * A gene located in mitochondrial sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000088)
   */
  public static Resource mt_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000088");
  }

  /**
   * A gene located in kinetoplast sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000089)
   */
  public static Resource kinetoplast_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000089");
  }

  /**
   * A gene from plastid sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000090)
   */
  public static Resource plastid_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000090");
  }

  /**
   * A gene from apicoplast sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000091)
   */
  public static Resource apicoplast_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000091");
  }

  /**
   * A gene from chloroplast sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000092)
   */
  public static Resource ct_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000092");
  }

  /**
   * A gene from chromoplast_sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000093)
   */
  public static Resource chromoplast_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000093");
  }

  /**
   * A gene from cyanelle sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000094)
   */
  public static Resource cyanelle_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000094");
  }

  /**
   * A plastid gene from leucoplast sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000095)
   */
  public static Resource leucoplast_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000095");
  }

  /**
   * A gene from proplastid sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000096)
   */
  public static Resource proplastid_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000096");
  }

  /**
   * A gene from nucleomorph sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000097)
   */
  public static Resource nucleomorph_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000097");
  }

  /**
   * A gene from plasmid sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000098)
   */
  public static Resource plasmid_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000098");
  }

  /**
   * A gene from proviral sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000099)
   */
  public static Resource proviral_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000099");
  }

  /**
   * A proviral gene with origin endogenous retrovirus. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000100)
   */
  public static Resource endogenous_retroviral_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000100");
  }

  /**
   * A transposon or insertion sequence. An element that can insert in a variety of DNA sequences. (http://www.sci.sdsu.edu/~smaloy/Glossary/T.html)
   * (http://purl.obolibrary.org/obo/SO_0000101)
   */
  public static Resource transposable_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000101");
  }

  /**
   * A match to an EST or cDNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000102)
   */
  public static Resource expressed_sequence_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000102");
  }

  /**
   * The end of the clone insert. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000103)
   */
  public static Resource clone_insert_end() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000103");
  }

  /**
   * A sequence of amino acids linked by peptide bonds which may lack appreciable tertiary structure and may not be liable to irreversible denaturation. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000104)
   */
  public static Resource polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000104");
  }

  /**
   * A region of the chromosome between the centromere and the telomere. Human chromosomes have two arms, the p arm (short) and the q arm (long) which are separated from each other by the centromere. (http://www.medterms.com/script/main/art.asp?articlekey=5152)
   * (http://purl.obolibrary.org/obo/SO_0000105)
   */
  public static Resource chromosome_arm() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000105");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000106)
   */
  public static Resource non_capped_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000106");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000107)
   */
  public static Resource sequencing_primer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000107");
  }

  /**
   * An mRNA with a frameshift. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000108)
   */
  public static Resource mRNA_with_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000108");
  }

  /**
   * A sequence_variant is a non exact copy of a sequence_feature or genome exhibiting one or more sequence_alteration. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000109)
   */
  public static Resource sequence_variant_obs() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000109");
  }

  /**
   * An extent of biological sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000110)
   */
  public static Resource sequence_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000110");
  }

  /**
   * A gene encoded within a transposable element. For example gag, int, env and pol are the transposable element genes of the TY element in yeast. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000111)
   */
  public static Resource transposable_element_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000111");
  }

  /**
   * An oligo to which new deoxyribonucleotides can be added by DNA polymerase. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000112)
   */
  public static Resource primer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000112");
  }

  /**
   * A viral sequence which has integrated into a host genome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000113)
   */
  public static Resource proviral_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000113");
  }

  /**
   * A methylated deoxy-cytosine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000114)
   */
  public static Resource methylated_cytosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000114");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000115)
   */
  public static Resource transcript_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000115");
  }

  /**
   * An attribute describing a sequence that is modified by editing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000116)
   */
  public static Resource edited() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000116");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000117)
   */
  public static Resource transcript_with_readthrough_stop_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000117");
  }

  /**
   * A transcript with a translational frameshift. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000118)
   */
  public static Resource transcript_with_translational_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000118");
  }

  /**
   * An attribute to describe a sequence that is regulated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000119)
   */
  public static Resource regulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000119");
  }

  /**
   * A primary transcript that, at least in part, encodes one or more proteins. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000120)
   */
  public static Resource protein_coding_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000120");
  }

  /**
   * A single stranded oligo used for polymerase chain reaction. (http://mged.sourceforge.net/ontologies/MGEDontology.php)
   * (http://purl.obolibrary.org/obo/SO_0000121)
   */
  public static Resource forward_primer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000121");
  }

  /**
   * A folded RNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000122)
   */
  public static Resource RNA_sequence_secondary_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000122");
  }

  /**
   * An attribute describing a gene that is regulated at transcription. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000123)
   */
  public static Resource transcriptionally_regulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000123");
  }

  /**
   * Expressed in relatively constant amounts without regard to cellular environmental conditions such as the concentration of a particular substrate. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000124)
   */
  public static Resource transcriptionally_constitutive() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000124");
  }

  /**
   * An inducer molecule is required for transcription to occur. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000125)
   */
  public static Resource transcriptionally_induced() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000125");
  }

  /**
   * A repressor molecule is required for transcription to stop. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000126)
   */
  public static Resource transcriptionally_repressed() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000126");
  }

  /**
   * A gene that is silenced. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000127)
   */
  public static Resource silenced_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000127");
  }

  /**
   * A gene that is silenced by DNA modification. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000128)
   */
  public static Resource gene_silenced_by_DNA_modification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000128");
  }

  /**
   * A gene that is silenced by DNA methylation. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000129)
   */
  public static Resource gene_silenced_by_DNA_methylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000129");
  }

  /**
   * An attribute describing a gene that is regulated after it has been translated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000130)
   */
  public static Resource post_translationally_regulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000130");
  }

  /**
   * An attribute describing a gene that is regulated as it is translated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000131)
   */
  public static Resource translationally_regulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000131");
  }

  /**
   * A single stranded oligo used for polymerase chain reaction. (http://mged.sourceforge.net/ontologies/MGEDontology.php)
   * (http://purl.obolibrary.org/obo/SO_0000132)
   */
  public static Resource reverse_primer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000132");
  }

  /**
   * This attribute describes a gene where heritable changes other than those in the DNA sequence occur. These changes include: modification to the DNA (such as DNA methylation, the covalent modification of cytosine), and post-translational modification of histones. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000133)
   */
  public static Resource epigenetically_modified() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000133");
  }

  /**
   * Imprinted genes are epigenetically modified genes that are expressed monoallelically according to their parent of origin. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000134)
   */
  public static Resource genomically_imprinted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000134");
  }

  /**
   * The maternal copy of the gene is modified, rendering it transcriptionally silent. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000135)
   */
  public static Resource maternally_imprinted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000135");
  }

  /**
   * The paternal copy of the gene is modified, rendering it transcriptionally silent. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000136)
   */
  public static Resource paternally_imprinted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000136");
  }

  /**
   * Allelic exclusion is a process occurring in diploid organisms, where a gene is inactivated and not expressed in that cell. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000137)
   */
  public static Resource allelically_excluded() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000137");
  }

  /**
   * An epigenetically modified gene, rearranged at the DNA level. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000138)
   */
  public static Resource gene_rearranged_at_DNA_level() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000138");
  }

  /**
   * Region in mRNA where ribosome assembles. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000139)
   */
  public static Resource ribosome_entry_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000139");
  }

  /**
   * A sequence segment located within the five prime end of an mRNA that causes premature termination of translation. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000140)
   */
  public static Resource attenuator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000140");
  }

  /**
   * The sequence of DNA located either at the end of the transcript that causes RNA polymerase to terminate transcription. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000141)
   */
  public static Resource terminator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000141");
  }

  /**
   * A folded DNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000142)
   */
  public static Resource DNA_sequence_secondary_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000142");
  }

  /**
   * A region of known length which may be used to manufacture a longer region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000143)
   */
  public static Resource assembly_component() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000143");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000144)
   */
  public static Resource primary_transcript_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000144");
  }

  /**
   * A codon that has been redefined at translation. The redefinition may be as a result of translational bypass, translational frameshifting or stop codon readthrough. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000145)
   */
  public static Resource recoded_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000145");
  }

  /**
   * An attribute describing when a sequence, usually an mRNA is capped by the addition of a modified guanine nucleotide at the 5" end. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000146)
   */
  public static Resource capped() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000146");
  }

  /**
   * A region of the transcript sequence within a gene which is not removed from the primary RNA transcript by RNA splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000147)
   */
  public static Resource exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000147");
  }

  /**
   * One or more contigs that have been ordered and oriented using end-read information. Contains gaps that are filled with N"s. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000148)
   */
  public static Resource supercontig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000148");
  }

  /**
   * A contiguous sequence derived from sequence assembly. Has no gaps, but may contain N"s from unavailable bases. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000149)
   */
  public static Resource contig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000149");
  }

  /**
   * A sequence obtained from a single sequencing experiment. Typically a read is produced when a base calling program interprets information from a chromatogram trace file produced from a sequencing machine. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000150)
   */
  public static Resource read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000150");
  }

  /**
   * A piece of DNA that has been inserted in a vector so that it can be propagated in a host bacterium or some other organism. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000151)
   */
  public static Resource _clone_() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000151");
  }

  /**
   * Yeast Artificial Chromosome, a vector constructed from the telomeric, centromeric, and replication origin sequences needed for replication in yeast cells. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000152)
   */
  public static Resource YAC() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000152");
  }

  /**
   * Bacterial Artificial Chromosome, a cloning vector that can be propagated as mini-chromosomes in a bacterial host. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000153)
   */
  public static Resource BAC() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000153");
  }

  /**
   * The P1-derived artificial chromosome are DNA constructs that are derived from the DNA of P1 bacteriophage. They can carry large amounts (about 100-300 kilobases) of other sequences for a variety of bioengineering purposes. It is one type of vector used to clone DNA fragments (100- to 300-kb insert size; average, 150 kb) in Escherichia coli cells. (http://en.wikipedia.org/wiki/P1-derived_artificial_chromosome)
   * (http://purl.obolibrary.org/obo/SO_0000154)
   */
  public static Resource PAC() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000154");
  }

  /**
   * A self replicating, using the hosts cellular machinery, often circular nucleic acid molecule that is distinct from a chromosome in the organism. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000155)
   */
  public static Resource plasmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000155");
  }

  /**
   * A cloning vector that is a hybrid of lambda phages and a plasmid that can be propagated as a plasmid or packaged as a phage,since they retain the lambda cos sites. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000156)
   */
  public static Resource cosmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000156");
  }

  /**
   * A plasmid which carries within its sequence a bacteriophage replication origin. When the host bacterium is infected with \"helper\" phage, a phagemid is replicated along with the phage DNA and packaged into phage capsids. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000157)
   */
  public static Resource phagemid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000157");
  }

  /**
   * A cloning vector that utilizes the E. coli F factor. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000158)
   */
  public static Resource fosmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000158");
  }

  /**
   * The point at which one or more contiguous nucleotides were excised. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000159)
   */
  public static Resource deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000159");
  }

  /**
   * A linear clone derived from lambda bacteriophage. The genes involved in the lysogenic pathway are removed from the from the viral DNA. Up to 25 kb of foreign DNA can then be inserted into the lambda genome. (ISBN:0-1767-2380-8)
   * (http://purl.obolibrary.org/obo/SO_0000160)
   */
  public static Resource lambda_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000160");
  }

  /**
   * A modified  base in which adenine has been methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000161)
   */
  public static Resource methylated_adenine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000161");
  }

  /**
   * Consensus region of primary transcript bordering junction of splicing. A region that overlaps exactly 2 base and adjacent_to splice_junction. (SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000162)
   */
  public static Resource splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000162");
  }

  /**
   * Intronic 2 bp region bordering the exon, at the 5" edge of the intron. A splice_site that is downstream_adjacent_to exon and starts intron. (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000163)
   */
  public static Resource five_prime_cis_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000163");
  }

  /**
   * Intronic 2 bp region bordering the exon, at the 3" edge of the intron. A splice_site that is upstream_adjacent_to exon and finishes intron. (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000164)
   */
  public static Resource three_prime_cis_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000164");
  }

  /**
   * A cis-acting sequence that increases the utilization of (some) eukaryotic promoters, and can function in either orientation and in any location (upstream or downstream) relative to the promoter. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000165)
   */
  public static Resource enhancer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000165");
  }

  /**
   * An enhancer bound by a factor. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000166)
   */
  public static Resource enhancer_bound_by_factor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000166");
  }

  /**
   * A regulatory_region composed of the TSS(s) and binding sites for TF_complexes of the basal transcription machinery. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0000167)
   */
  public static Resource promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000167");
  }

  /**
   * A specific nucleotide sequence of DNA at or near which a particular restriction enzyme cuts the DNA. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000168)
   */
  public static Resource restriction_enzyme_cut_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000168");
  }

  /**
   * A DNA sequence in eukaryotic DNA to which RNA polymerase I binds, to begin transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000169)
   */
  public static Resource RNApol_I_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000169");
  }

  /**
   * A DNA sequence in eukaryotic DNA to which RNA polymerase II binds, to begin transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000170)
   */
  public static Resource RNApol_II_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000170");
  }

  /**
   * A DNA sequence in eukaryotic DNA to which RNA polymerase III binds, to begin transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000171)
   */
  public static Resource RNApol_III_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000171");
  }

  /**
   * Part of a conserved sequence located about 75-bp upstream of the start point of eukaryotic transcription units which may be involved in RNA polymerase binding; consensus=GG(C|T)CAATCT. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000172)
   */
  public static Resource CAAT_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000172");
  }

  /**
   * A conserved GC-rich region located upstream of the start point of eukaryotic transcription units which may occur in multiple copies or in either orientation; consensus=GGGCGG. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000173)
   */
  public static Resource GC_rich_promoter_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000173");
  }

  /**
   * A conserved AT-rich septamer found about 25-bp before the start point of many eukaryotic RNA polymerase II transcript units; may be involved in positioning the enzyme for correct initiation; consensus=TATA(A|T)A(A|T). (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0000174)
   */
  public static Resource TATA_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000174");
  }

  /**
   * A conserved region about 10-bp upstream of the start point of bacterial transcription units which may be involved in binding RNA polymerase; consensus=TAtAaT. This region is associated with sigma factor 70. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000175)
   */
  public static Resource minus_10_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000175");
  }

  /**
   * A conserved hexamer about 35-bp upstream of the start point of bacterial transcription units; consensus=TTGACa or TGTTGACA. This region is associated with sigma factor 70. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000176)
   */
  public static Resource minus_35_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000176");
  }

  /**
   * A nucleotide match against a sequence from another organism. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000177)
   */
  public static Resource cross_genome_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000177");
  }

  /**
   * A group of contiguous genes transcribed as a single (polycistronic) mRNA from a single regulatory region. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000178)
   */
  public static Resource operon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000178");
  }

  /**
   * Either:
   *   The start of the clone insert. (SO:ke)
   *   (http://purl.obolibrary.org/obo/SO_0000179)
   * Or:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0000767)
   */
  public static Set<Resource> clone_insert_start() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0000179"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0000767") }));
  }

  /**
   * A transposable element that is incorporated into a chromosome by a mechanism that requires reverse transcriptase. (http://www.dddmag.com/Glossary.aspx#r)
   * (http://purl.obolibrary.org/obo/SO_0000180)
   */
  public static Resource retrotransposon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000180");
  }

  /**
   * A match against a translated sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000181)
   */
  public static Resource translated_nucleotide_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000181");
  }

  /**
   * A transposon where the mechanism of transposition is via a DNA intermediate. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000182)
   */
  public static Resource DNA_transposon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000182");
  }

  /**
   * A region of the gene which is not transcribed. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000183)
   */
  public static Resource non_transcribed_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000183");
  }

  /**
   * A major type of spliceosomal intron spliced by the U2 spliceosome, that includes U1, U2, U4/U6 and U5 snRNAs. (PMID:9428511)
   * (http://purl.obolibrary.org/obo/SO_0000184)
   */
  public static Resource U2_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000184");
  }

  /**
   * A transcript that in its initial state requires modification to be functional. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000185)
   */
  public static Resource primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000185");
  }

  /**
   * A retrotransposon flanked by long terminal repeat sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000186)
   */
  public static Resource LTR_retrotransposon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000186");
  }

  /**
   * A group of characterized repeat sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000187)
   */
  public static Resource repeat_family() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000187");
  }

  /**
   * A region of a primary transcript that is transcribed, but removed from within the transcript by splicing together the sequences (exons) on either side of it. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000188)
   */
  public static Resource intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000188");
  }

  /**
   * A retrotransposon without long terminal repeat sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000189)
   */
  public static Resource non_LTR_retrotransposon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000189");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000190)
   */
  public static Resource five_prime_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000190");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000191)
   */
  public static Resource interior_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000191");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000192)
   */
  public static Resource three_prime_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000192");
  }

  /**
   * A DNA fragment used as a reagent to detect the polymorphic genomic loci by hybridizing against the genomic DNA digested with a given restriction enzyme. (GOC:pj)
   * (http://purl.obolibrary.org/obo/SO_0000193)
   */
  public static Resource RFLP_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000193");
  }

  /**
   * A dispersed repeat family with many copies, each from 1 to 6 kb long. New elements are generated by retroposition of a transcribed copy. Typically the LINE contains 2 ORF"s one of which is reverse transcriptase, and 3"and 5" direct repeats. (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html)
   * (http://purl.obolibrary.org/obo/SO_0000194)
   */
  public static Resource LINE_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000194");
  }

  /**
   * An exon whereby at least one base is part of a codon (here, "codon" is inclusive of the stop_codon). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000195)
   */
  public static Resource coding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000195");
  }

  /**
   * The sequence of the five_prime_coding_exon that codes for protein. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000196)
   */
  public static Resource five_prime_coding_exon_coding_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000196");
  }

  /**
   * The sequence of the three_prime_coding_exon that codes for protein. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000197)
   */
  public static Resource three_prime_coding_exon_coding_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000197");
  }

  /**
   * An exon that does not contain any codons. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000198)
   */
  public static Resource noncoding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000198");
  }

  /**
   * A region of nucleotide sequence that has translocated to a new position. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000199)
   */
  public static Resource translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000199");
  }

  /**
   * The 5" most coding exon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000200)
   */
  public static Resource five_prime_coding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000200");
  }

  /**
   * An exon that is bounded by 5" and 3" splice sites. (PMID:10373547)
   * (http://purl.obolibrary.org/obo/SO_0000201)
   */
  public static Resource interior_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000201");
  }

  /**
   * The coding exon that is most 3-prime on a given transcript. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000202)
   */
  public static Resource three_prime_coding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000202");
  }

  /**
   * Messenger RNA sequences that are untranslated and lie five prime or three prime to sequences which are translated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000203)
   */
  public static Resource UTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000203");
  }

  /**
   * A region at the 5" end of a mature transcript (preceding the initiation codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000204)
   */
  public static Resource five_prime_UTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000204");
  }

  /**
   * A region at the 3" end of a mature transcript (following the stop codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000205)
   */
  public static Resource three_prime_UTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000205");
  }

  /**
   * A repetitive element, a few hundred base pairs long, that is dispersed throughout the genome. A common human SINE is the Alu element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000206)
   */
  public static Resource SINE_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000206");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000207)
   */
  public static Resource simple_sequence_length_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000207");
  }

  /**
   * A DNA transposable element defined as having termini with perfect, or nearly perfect short inverted repeats, generally 10 - 40 nucleotides long. (http://www.genetics.org/cgi/reprint/156/4/1983.pdf)
   * (http://purl.obolibrary.org/obo/SO_0000208)
   */
  public static Resource terminal_inverted_repeat_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000208");
  }

  /**
   * A primary transcript encoding a ribosomal RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000209)
   */
  public static Resource rRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000209");
  }

  /**
   * A primary transcript encoding a transfer RNA (SO:0000253). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000210)
   */
  public static Resource tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000210");
  }

  /**
   * A primary transcript encoding alanyl tRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000211)
   */
  public static Resource alanine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000211");
  }

  /**
   * A primary transcript encoding arginyl tRNA (SO:0000255). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000212)
   */
  public static Resource arginine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000212");
  }

  /**
   * A primary transcript encoding asparaginyl tRNA (SO:0000256). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000213)
   */
  public static Resource asparagine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000213");
  }

  /**
   * A primary transcript encoding aspartyl tRNA (SO:0000257). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000214)
   */
  public static Resource aspartic_acid_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000214");
  }

  /**
   * A primary transcript encoding cysteinyl tRNA (SO:0000258). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000215)
   */
  public static Resource cysteine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000215");
  }

  /**
   * A primary transcript encoding glutaminyl tRNA (SO:0000260). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000216)
   */
  public static Resource glutamic_acid_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000216");
  }

  /**
   * A primary transcript encoding glutamyl tRNA (SO:0000260). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000217)
   */
  public static Resource glutamine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000217");
  }

  /**
   * A primary transcript encoding glycyl tRNA (SO:0000263). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000218)
   */
  public static Resource glycine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000218");
  }

  /**
   * A primary transcript encoding histidyl tRNA (SO:0000262). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000219)
   */
  public static Resource histidine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000219");
  }

  /**
   * A primary transcript encoding isoleucyl tRNA (SO:0000263). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000220)
   */
  public static Resource isoleucine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000220");
  }

  /**
   * A primary transcript encoding leucyl tRNA (SO:0000264). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000221)
   */
  public static Resource leucine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000221");
  }

  /**
   * A primary transcript encoding lysyl tRNA (SO:0000265). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000222)
   */
  public static Resource lysine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000222");
  }

  /**
   * A primary transcript encoding methionyl tRNA (SO:0000266). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000223)
   */
  public static Resource methionine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000223");
  }

  /**
   * A primary transcript encoding phenylalanyl tRNA (SO:0000267). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000224)
   */
  public static Resource phenylalanine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000224");
  }

  /**
   * A primary transcript encoding prolyl tRNA (SO:0000268). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000225)
   */
  public static Resource proline_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000225");
  }

  /**
   * A primary transcript encoding seryl tRNA (SO:000269). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000226)
   */
  public static Resource serine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000226");
  }

  /**
   * A primary transcript encoding threonyl tRNA (SO:000270). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000227)
   */
  public static Resource threonine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000227");
  }

  /**
   * A primary transcript encoding tryptophanyl tRNA (SO:000271). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000228)
   */
  public static Resource tryptophan_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000228");
  }

  /**
   * A primary transcript encoding tyrosyl tRNA (SO:000272). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000229)
   */
  public static Resource tyrosine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000229");
  }

  /**
   * A primary transcript encoding valyl tRNA (SO:000273). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000230)
   */
  public static Resource valine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000230");
  }

  /**
   * A primary transcript encoding a small nuclear RNA (SO:0000274). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000231)
   */
  public static Resource snRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000231");
  }

  /**
   * A primary transcript encoding a small nucleolar mRNA (SO:0000275). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000232)
   */
  public static Resource snoRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000232");
  }

  /**
   * A transcript which has undergone the necessary modifications, if any, for its function. In eukaryotes this includes, for example, processing of introns, cleavage, base modification, and modifications to the 5" and/or the 3" ends, other than addition of bases. In bacteria functional mRNAs are usually not modified. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000233)
   */
  public static Resource mature_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000233");
  }

  /**
   * Messenger RNA is the intermediate molecule between DNA and protein. It includes UTR and coding sequences. It does not contain introns. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000234)
   */
  public static Resource mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000234");
  }

  /**
   * A region of a nucleotide molecule that binds a Transcription Factor or Transcription Factor complex [GO:0005667]. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000235)
   */
  public static Resource TF_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000235");
  }

  /**
   * The in-frame interval between the stop codons of a reading frame which when read as sequential triplets, has the potential of encoding a sequential string of amino acids. TER(NNN)nTER. (SGD:rb, SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000236)
   */
  public static Resource ORF() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000236");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000237)
   */
  public static Resource transcript_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000237");
  }

  /**
   * A transposable element with extensive secondary structure, characterized by large modular imperfect long inverted repeats. (http://www.genetics.org/cgi/reprint/156/4/1983.pdf)
   * (http://purl.obolibrary.org/obo/SO_0000238)
   */
  public static Resource foldback_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000238");
  }

  /**
   * The sequences extending on either side of a specific region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000239)
   */
  public static Resource flanking_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000239");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000240)
   */
  public static Resource chromosome_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000240");
  }

  /**
   * A UTR bordered by the terminal and initial codons of two CDSs in a polycistronic transcript. Every UTR is either 5", 3" or internal. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000241)
   */
  public static Resource internal_UTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000241");
  }

  /**
   * The untranslated sequence separating the "cistrons" of multicistronic mRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000242)
   */
  public static Resource untranslated_region_polycistronic_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000242");
  }

  /**
   * Sequence element that recruits a ribosomal subunit to internal mRNA for translation initiation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000243)
   */
  public static Resource internal_ribosome_entry_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000243");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000244)
   */
  public static Resource four_cutter_restriction_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000244");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000245)
   */
  public static Resource mRNA_by_polyadenylation_status() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000245");
  }

  /**
   * A attribute describing the addition of a poly A tail to the 3" end of a mRNA molecule. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000246)
   */
  public static Resource polyadenylated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000246");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000247)
   */
  public static Resource mRNA_not_polyadenylated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000247");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000248)
   */
  public static Resource sequence_length_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000248");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000249)
   */
  public static Resource six_cutter_restriction_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000249");
  }

  /**
   * A post_transcriptionally modified base. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000250)
   */
  public static Resource modified_RNA_base_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000250");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000251)
   */
  public static Resource eight_cutter_restriction_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000251");
  }

  /**
   * RNA that comprises part of a ribosome, and that can provide both structural scaffolding and catalytic activity. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, ISBN:0198506732)
   * (http://purl.obolibrary.org/obo/SO_0000252)
   */
  public static Resource rRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000252");
  }

  /**
   * Transfer RNA (tRNA) molecules are approximately 80 nucleotides in length. Their secondary structure includes four short double-helical elements and three loops (D, anti-codon, and T loops). Further hydrogen bonds mediate the characteristic L-shaped molecular structure. Transfer RNAs have two regions of fundamental functional importance: the anti-codon, which is responsible for specific mRNA codon recognition, and the 3" end, to which the tRNA"s corresponding amino acid is attached (by aminoacyl-tRNA synthetases). Transfer RNAs cope with the degeneracy of the genetic code in two manners: having more than one tRNA (with a specific anti-codon) for a particular amino acid; and "wobble" base-pairing, i.e. permitting non-standard base-pairing at the 3rd anti-codon position. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00005, ISBN:0198506732)
   * (http://purl.obolibrary.org/obo/SO_0000253)
   */
  public static Resource tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000253");
  }

  /**
   * A tRNA sequence that has an alanine anticodon, and a 3" alanine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000254)
   */
  public static Resource alanyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000254");
  }

  /**
   * A primary transcript encoding a small ribosomal subunit RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000255)
   */
  public static Resource rRNA_small_subunit_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000255");
  }

  /**
   * A tRNA sequence that has an asparagine anticodon, and a 3" asparagine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000256)
   */
  public static Resource asparaginyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000256");
  }

  /**
   * A tRNA sequence that has an aspartic acid anticodon, and a 3" aspartic acid binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000257)
   */
  public static Resource aspartyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000257");
  }

  /**
   * A tRNA sequence that has a cysteine anticodon, and a 3" cysteine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000258)
   */
  public static Resource cysteinyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000258");
  }

  /**
   * A tRNA sequence that has a glutamine anticodon, and a 3" glutamine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000259)
   */
  public static Resource glutaminyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000259");
  }

  /**
   * A tRNA sequence that has a glutamic acid anticodon, and a 3" glutamic acid binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000260)
   */
  public static Resource glutamyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000260");
  }

  /**
   * A tRNA sequence that has a glycine anticodon, and a 3" glycine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000261)
   */
  public static Resource glycyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000261");
  }

  /**
   * A tRNA sequence that has a histidine anticodon, and a 3" histidine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000262)
   */
  public static Resource histidyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000262");
  }

  /**
   * A tRNA sequence that has an isoleucine anticodon, and a 3" isoleucine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000263)
   */
  public static Resource isoleucyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000263");
  }

  /**
   * A tRNA sequence that has a leucine anticodon, and a 3" leucine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000264)
   */
  public static Resource leucyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000264");
  }

  /**
   * A tRNA sequence that has a lysine anticodon, and a 3" lysine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000265)
   */
  public static Resource lysyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000265");
  }

  /**
   * A tRNA sequence that has a methionine anticodon, and a 3" methionine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000266)
   */
  public static Resource methionyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000266");
  }

  /**
   * A tRNA sequence that has a phenylalanine anticodon, and a 3" phenylalanine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000267)
   */
  public static Resource phenylalanyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000267");
  }

  /**
   * A tRNA sequence that has a proline anticodon, and a 3" proline binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000268)
   */
  public static Resource prolyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000268");
  }

  /**
   * A tRNA sequence that has a serine anticodon, and a 3" serine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000269)
   */
  public static Resource seryl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000269");
  }

  /**
   * A tRNA sequence that has a threonine anticodon, and a 3" threonine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000270)
   */
  public static Resource threonyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000270");
  }

  /**
   * A tRNA sequence that has a tryptophan anticodon, and a 3" tryptophan binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000271)
   */
  public static Resource tryptophanyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000271");
  }

  /**
   * A tRNA sequence that has a tyrosine anticodon, and a 3" tyrosine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000272)
   */
  public static Resource tyrosyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000272");
  }

  /**
   * A tRNA sequence that has a valine anticodon, and a 3" valine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000273)
   */
  public static Resource valyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000273");
  }

  /**
   * A small nuclear RNA molecule involved in pre-mRNA splicing and processing. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, PMID:11733745, WB:ems)
   * (http://purl.obolibrary.org/obo/SO_0000274)
   */
  public static Resource snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000274");
  }

  /**
   * A snoRNA (small nucleolar RNA) is any one of a class of small RNAs that are associated with the eukaryotic nucleus as components of small nucleolar ribonucleoproteins. They participate in the processing or modifications of many RNAs, mostly ribosomal RNAs (rRNAs) though snoRNAs are also known to target other classes of RNA, including spliceosomal RNAs, tRNAs, and mRNAs via a stretch of sequence that is complementary to a sequence in the targeted RNA. (GOC:kgc)
   * (http://purl.obolibrary.org/obo/SO_0000275)
   */
  public static Resource snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000275");
  }

  /**
   * Small, ~22-nt, RNA molecule that is the endogenous transcript of a miRNA gene. Micro RNAs are produced from precursor molecules (SO:0000647) that can form local hairpin structures, which ordinarily are processed (via the Dicer pathway) such that a single miRNA molecule accumulates from one arm of a hairpin precursor molecule. Micro RNAs may trigger the cleavage of their target molecules or act as translational repressors. (PMID:12592000)
   * (http://purl.obolibrary.org/obo/SO_0000276)
   */
  public static Resource miRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000276");
  }

  /**
   * An attribute describing a sequence that is bound by another molecule. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000277)
   */
  public static Resource bound_by_factor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000277");
  }

  /**
   * A transcript that is bound by a nucleic acid. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000278)
   */
  public static Resource transcript_bound_by_nucleic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000278");
  }

  /**
   * A transcript that is bound by a protein. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000279)
   */
  public static Resource transcript_bound_by_protein() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000279");
  }

  /**
   * A gene that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000280)
   */
  public static Resource engineered_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000280");
  }

  /**
   * A gene that is engineered and foreign. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000281)
   */
  public static Resource engineered_foreign_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000281");
  }

  /**
   * An mRNA with a minus 1 frameshift. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000282)
   */
  public static Resource mRNA_with_minus_1_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000282");
  }

  /**
   * A transposable_element that is engineered and foreign. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000283)
   */
  public static Resource engineered_foreign_transposable_element_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000283");
  }

  /**
   * The recognition site is bipartite and interrupted. (http://www.promega.com)
   * (http://purl.obolibrary.org/obo/SO_0000284)
   */
  public static Resource type_I_enzyme_restriction_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000284");
  }

  /**
   * A gene that is foreign. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000285)
   */
  public static Resource foreign_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000285");
  }

  /**
   * A sequence directly repeated at both ends of a defined sequence, of the sort typically found in retroviruses. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000286)
   */
  public static Resource long_terminal_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000286");
  }

  /**
   * A gene that is a fusion. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000287)
   */
  public static Resource fusion_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000287");
  }

  /**
   * A fusion gene that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000288)
   */
  public static Resource engineered_fusion_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000288");
  }

  /**
   * A repeat_region containing repeat_units (2 to 4 bp) that is repeated multiple times in tandem. (http://www.informatics.jax.org/silver/glossary.shtml)
   * (http://purl.obolibrary.org/obo/SO_0000289)
   */
  public static Resource microsatellite() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000289");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000290)
   */
  public static Resource dinucleotide_repeat_microsatellite_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000290");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000291)
   */
  public static Resource trinucleotide_repeat_microsatellite_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000291");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000292)
   */
  public static Resource repetitive_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000292");
  }

  /**
   * A repetitive element that is engineered and foreign. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000293)
   */
  public static Resource engineered_foreign_repetitive_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000293");
  }

  /**
   * The sequence is complementarily repeated on the opposite strand. It is a palindrome, and it may, or may not be hyphenated. Examples: GCTGATCAGC, or GCTGA-----TCAGC. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000294)
   */
  public static Resource inverted_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000294");
  }

  /**
   * A type of spliceosomal intron spliced by the U12 spliceosome, that includes U11, U12, U4atac/U6atac and U5 snRNAs. (PMID:9428511)
   * (http://purl.obolibrary.org/obo/SO_0000295)
   */
  public static Resource U12_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000295");
  }

  /**
   * The origin of replication; starting site for duplication of a nucleic acid molecule to give two identical copies. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000296)
   */
  public static Resource origin_of_replication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000296");
  }

  /**
   * Displacement loop; a region within mitochondrial DNA in which a short stretch of RNA is paired with one strand of DNA, displacing the original partner DNA strand in this region; also used to describe the displacement of a region of one strand of duplex DNA by a single stranded invader in the reaction catalyzed by RecA protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000297)
   */
  public static Resource D_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000297");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000298)
   */
  public static Resource recombination_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000298");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000299)
   */
  public static Resource specific_recombination_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000299");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000300)
   */
  public static Resource recombination_feature_of_rearranged_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000300");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000301)
   */
  public static Resource vertebrate_immune_system_gene_recombination_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000301");
  }

  /**
   * Recombination signal including J-heptamer, J-spacer and J-nonamer in 5" of J-region of a J-gene or J-sequence. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000302)
   */
  public static Resource J_gene_recombination_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000302");
  }

  /**
   * Part of the primary transcript that is clipped off during processing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000303)
   */
  public static Resource clip() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000303");
  }

  /**
   * The recognition site is either palindromic, partially palindromic or an interrupted palindrome. Cleavage occurs within the recognition site. (http://www.promega.com)
   * (http://purl.obolibrary.org/obo/SO_0000304)
   */
  public static Resource type_II_enzyme_restriction_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000304");
  }

  /**
   * A modified nucleotide, i.e. a nucleotide other than A, T, C. G. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000305)
   */
  public static Resource modified_DNA_base() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000305");
  }

  /**
   * A nucleotide modified by methylation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000306)
   */
  public static Resource methylated_DNA_base_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000306");
  }

  /**
   * Regions of a few hundred to a few thousand bases in vertebrate genomes that are relatively GC and CpG rich; they are typically unmethylated and often found near the 5" ends of genes. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000307)
   */
  public static Resource CpG_island() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000307");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000308)
   */
  public static Resource sequence_feature_locating_method() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000308");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000309)
   */
  public static Resource computed_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000309");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000310)
   */
  public static Resource predicted_ab_initio_computation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000310");
  }

  /**
   * . (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000311)
   */
  public static Resource computed_feature_by_similarity() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000311");
  }

  /**
   * Attribute to describe a feature that has been experimentally verified. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000312)
   */
  public static Resource experimentally_determined() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000312");
  }

  /**
   * A double-helical region of nucleic acid formed by base-pairing between adjacent (inverted) complementary sequences. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000313)
   */
  public static Resource stem_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000313");
  }

  /**
   * A repeat where the same sequence is repeated in the same direction. Example: GCTGA-----GCTGA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000314)
   */
  public static Resource direct_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000314");
  }

  /**
   * The first base where RNA polymerase begins to synthesize the RNA transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000315)
   */
  public static Resource TSS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000315");
  }

  /**
   * A contiguous sequence which begins with, and includes, a start codon and ends with, and includes, a stop codon. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000316)
   */
  public static Resource CDS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000316");
  }

  /**
   * Complementary DNA; A piece of DNA copied from an mRNA and spliced into a vector for propagation in a suitable host. (http://seqcore.brcf.med.umich.edu/doc/educ/dnapr/mbglossary/mbgloss.html)
   * (http://purl.obolibrary.org/obo/SO_0000317)
   */
  public static Resource cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000317");
  }

  /**
   * First codon to be translated by a ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000318)
   */
  public static Resource start_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000318");
  }

  /**
   * In mRNA, a set of three nucleotides that indicates the end of information for protein synthesis. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000319)
   */
  public static Resource stop_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000319");
  }

  /**
   * Sequences within the intron that modulate splice site selection for some introns. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000320)
   */
  public static Resource intronic_splice_enhancer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000320");
  }

  /**
   * An mRNA with a plus 1 frameshift. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000321)
   */
  public static Resource mRNA_with_plus_1_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000321");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000322)
   */
  public static Resource nuclease_hypersensitive_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000322");
  }

  /**
   * The first base to be translated into protein. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000323)
   */
  public static Resource coding_start() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000323");
  }

  /**
   * A nucleotide sequence that may be used to identify a larger sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000324)
   */
  public static Resource tag() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000324");
  }

  /**
   * A primary transcript encoding a large ribosomal subunit RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000325)
   */
  public static Resource rRNA_large_subunit_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000325");
  }

  /**
   * A short diagnostic sequence tag, serial analysis of gene expression (SAGE), that allows the quantitative and simultaneous analysis of a large number of transcripts. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=7570003&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000326)
   */
  public static Resource SAGE_tag() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000326");
  }

  /**
   * The last base to be translated into protein. It does not include the stop codon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000327)
   */
  public static Resource coding_end() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000327");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000328)
   */
  public static Resource microarray_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000328");
  }

  /**
   * An mRNA with a plus 2 frameshift. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000329)
   */
  public static Resource mRNA_with_plus_2_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000329");
  }

  /**
   * Region of sequence similarity by descent from a common ancestor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000330)
   */
  public static Resource conserved_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000330");
  }

  /**
   * Short (typically a few hundred base pairs) DNA sequence that has a single occurrence in a genome and whose location and base sequence are known. (http://www.biospace.com)
   * (http://purl.obolibrary.org/obo/SO_0000331)
   */
  public static Resource STS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000331");
  }

  /**
   * Coding region of sequence similarity by descent from a common ancestor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000332)
   */
  public static Resource coding_conserved_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000332");
  }

  /**
   * The boundary between two exons in a processed transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000333)
   */
  public static Resource exon_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000333");
  }

  /**
   * Non-coding region of sequence similarity by descent from a common ancestor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000334)
   */
  public static Resource nc_conserved_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000334");
  }

  /**
   * A mRNA with a minus 2 frameshift. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000335)
   */
  public static Resource mRNA_with_minus_2_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000335");
  }

  /**
   * A sequence that closely resembles a known functional gene, at another locus within a genome, that is non-functional as a consequence of (usually several) mutations that prevent either its transcription or translation (or both). In general, pseudogenes result from either reverse transcription of a transcript of their \"normal\" paralog (SO:0000043) (in which case the pseudogene typically lacks introns and includes a poly(A) tail) or from recombination (SO:0000044) (in which case the pseudogene is typically a tandem duplication of its \"normal\" paralog). (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html)
   * (http://purl.obolibrary.org/obo/SO_0000336)
   */
  public static Resource pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000336");
  }

  /**
   * A double stranded RNA duplex, at least 20bp long, used experimentally to inhibit gene function by RNA interference. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000337)
   */
  public static Resource RNAi_reagent() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000337");
  }

  /**
   * A highly repetitive and short (100-500 base pair) transposable element with terminal inverted repeats (TIR) and target site duplication (TSD). MITEs do not encode proteins. (http://www.pnas.org/cgi/content/full/97/18/10083)
   * (http://purl.obolibrary.org/obo/SO_0000338)
   */
  public static Resource MITE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000338");
  }

  /**
   * A region in a genome which promotes recombination. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000339)
   */
  public static Resource recombination_hotspot() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000339");
  }

  /**
   * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000340)
   */
  public static Resource chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000340");
  }

  /**
   * A cytologically distinguishable feature of a chromosome, often made visible by staining, and usually alternating light and dark. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000341)
   */
  public static Resource chromosome_band() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000341");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000342)
   */
  public static Resource site_specific_recombination_target_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000342");
  }

  /**
   * A region of sequence, aligned to another sequence with some statistical significance, using an algorithm such as BLAST or SIM4. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000343)
   */
  public static Resource match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000343");
  }

  /**
   * Region of a transcript that regulates splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000344)
   */
  public static Resource splice_enhancer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000344");
  }

  /**
   * A tag produced from a single sequencing read from a cDNA clone or PCR product; typically a few hundred base pairs long. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000345)
   */
  public static Resource EST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000345");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000346)
   */
  public static Resource loxP_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000346");
  }

  /**
   * A match against a nucleotide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000347)
   */
  public static Resource nucleotide_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000347");
  }

  /**
   * An attribute describing a sequence consisting of nucleobases bound to repeating units. The forms found in nature are deoxyribonucleic acid (DNA), where the repeating units are 2-deoxy-D-ribose rings connected to a phosphate backbone, and ribonucleic acid (RNA), where the repeating units are D-ribose rings connected to a phosphate backbone. (CHEBI:33696, RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000348)
   */
  public static Resource nucleic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000348");
  }

  /**
   * A match against a protein sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000349)
   */
  public static Resource protein_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000349");
  }

  /**
   * An inversion site found on the Saccharomyces cerevisiae 2 micron plasmid. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000350)
   */
  public static Resource FRT_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000350");
  }

  /**
   * An attribute to decide a sequence of nucleotides, nucleotide analogs, or amino acids that has been designed by an experimenter and which may, or may not, correspond with any natural sequence. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000351)
   */
  public static Resource synthetic_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000351");
  }

  /**
   * An attribute describing a sequence consisting of nucleobases bound to a repeating unit made of a 2-deoxy-D-ribose ring connected to a phosphate backbone. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000352)
   */
  public static Resource DNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000352");
  }

  /**
   * A sequence of nucleotides that has been algorithmically derived from an alignment of two or more different sequences. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000353)
   */
  public static Resource sequence_assembly() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000353");
  }

  /**
   * A region of intronic nucleotide sequence targeted by a nuclease enzyme. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000354)
   */
  public static Resource group_1_intron_homing_endonuclease_target_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000354");
  }

  /**
   * A region of the genome which is co-inherited as the result of the lack of historic recombination within it. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000355)
   */
  public static Resource haplotype_block() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000355");
  }

  /**
   * An attribute describing a sequence consisting of nucleobases bound to a repeating unit made of a D-ribose ring connected to a phosphate backbone. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000356)
   */
  public static Resource RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000356");
  }

  /**
   * An attribute describing a region that is bounded either side by a particular kind of region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000357)
   */
  public static Resource flanked() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000357");
  }

  /**
   * An attribute describing sequence that is flanked by Lox-P sites. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000359)
   */
  public static Resource floxed() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000359");
  }

  /**
   * A set of (usually) three nucleotide bases in a DNA or RNA sequence, which together code for a unique amino acid or the termination of translation and are contained within the CDS. (http://www.everythingbio.com/glos/definition.php?word=codon, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000360)
   */
  public static Resource codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000360");
  }

  /**
   * An attribute to describe sequence that is flanked by the FLP recombinase recognition site, FRT. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000361)
   */
  public static Resource FRT_flanked() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000361");
  }

  /**
   * A cDNA clone constructed from more than one mRNA. Usually an experimental artifact. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000362)
   */
  public static Resource invalidated_by_chimeric_cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000362");
  }

  /**
   * A transgene that is floxed. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000363)
   */
  public static Resource floxed_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000363");
  }

  /**
   * The region of sequence surrounding a transposable element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000364)
   */
  public static Resource transposable_element_flanking_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000364");
  }

  /**
   * A region encoding an integrase which acts at a site adjacent to it (attI_site) to insert DNA which must include but is not limited to an attC_site. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000365)
   */
  public static Resource integron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000365");
  }

  /**
   * The junction where an insertion occurred. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000366)
   */
  public static Resource insertion_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000366");
  }

  /**
   * A region within an integron, adjacent to an integrase, at which site specific recombination involving an attC_site takes place. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000367)
   */
  public static Resource attI_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000367");
  }

  /**
   * The junction in a genome where a transposable_element has inserted. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000368)
   */
  public static Resource transposable_element_insertion_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000368");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000369)
   */
  public static Resource integrase_coding_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000369");
  }

  /**
   * A non-coding RNA, usually with a specific secondary structure, that acts to regulate gene expression. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000370)
   */
  public static Resource small_regulatory_ncRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000370");
  }

  /**
   * A transposon that encodes function required for conjugation. (http://www.sci.sdsu.edu/~smaloy/Glossary/C.html)
   * (http://purl.obolibrary.org/obo/SO_0000371)
   */
  public static Resource conjugative_transposon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000371");
  }

  /**
   * An RNA sequence that has catalytic activity with or without an associated ribonucleoprotein. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000372)
   */
  public static Resource enzymatic_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000372");
  }

  /**
   * A recombinationally rearranged gene by inversion. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000373)
   */
  public static Resource recombinationally_inverted_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000373");
  }

  /**
   * An RNA with catalytic activity. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000374)
   */
  public static Resource ribozyme() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000374");
  }

  /**
   * 5_8S ribosomal RNA (5. 8S rRNA) is a component of the large subunit of the eukaryotic ribosome. It is transcribed by RNA polymerase I as part of the 45S precursor that also contains 18S and 28S rRNA. Functionally, it is thought that 5.8S rRNA may be involved in ribosome translocation. It is also known to form covalent linkage to the p53 tumour suppressor protein. 5_8S rRNA is also found in archaea. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00002)
   * (http://purl.obolibrary.org/obo/SO_0000375)
   */
  public static Resource rRNA_5_8S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000375");
  }

  /**
   * A small (184-nt in E. coli) RNA that forms a hairpin type structure. 6S RNA associates with RNA polymerase in a highly specific manner. 6S RNA represses expression from a sigma70-dependent promoter during stationary phase. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00013)
   * (http://purl.obolibrary.org/obo/SO_0000376)
   */
  public static Resource RNA_6S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000376");
  }

  /**
   * An enterobacterial RNA that binds the CsrA protein. The CsrB RNAs contain a conserved motif CAGGXXG that is found in up to 18 copies and has been suggested to bind CsrA. The Csr regulatory system has a strong negative regulatory effect on glycogen biosynthesis, glyconeogenesis and glycogen catabolism and a positive regulatory effect on glycolysis. In other bacteria such as Erwinia caratovara the RsmA protein has been shown to regulate the production of virulence determinants, such extracellular enzymes. RsmA binds to RsmB regulatory RNA which is also a member of this family. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00018)
   * (http://purl.obolibrary.org/obo/SO_0000377)
   */
  public static Resource CsrB_RsmB_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000377");
  }

  /**
   * DsrA RNA regulates both transcription, by overcoming transcriptional silencing by the nucleoid-associated H-NS protein, and translation, by promoting efficient translation of the stress sigma factor, RpoS. These two activities of DsrA can be separated by mutation: the first of three stem-loops of the 85 nucleotide RNA is necessary for RpoS translation but not for anti-H-NS action, while the second stem-loop is essential for antisilencing and less critical for RpoS translation. The third stem-loop, which behaves as a transcription terminator, can be substituted by the trp transcription terminator without loss of either DsrA function. The sequence of the first stem-loop of DsrA is complementary with the upstream leader portion of RpoS messenger RNA, suggesting that pairing of DsrA with the RpoS message might be important for translational regulation. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00014)
   * (http://purl.obolibrary.org/obo/SO_0000378)
   */
  public static Resource DsrA_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000378");
  }

  /**
   * A small untranslated RNA involved in expression of the dipeptide and oligopeptide transport systems in Escherichia coli. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00022)
   * (http://purl.obolibrary.org/obo/SO_0000379)
   */
  public static Resource GcvB_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000379");
  }

  /**
   * A small catalytic RNA motif that catalyzes self-cleavage reaction. Its name comes from its secondary structure which resembles a carpenter"s hammer. The hammerhead ribozyme is involved in the replication of some viroid and some satellite RNAs. (PMID:2436805)
   * (http://purl.obolibrary.org/obo/SO_0000380)
   */
  public static Resource hammerhead_ribozyme() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000380");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000381)
   */
  public static Resource group_IIA_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000381");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000382)
   */
  public static Resource group_IIB_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000382");
  }

  /**
   * A non-translated 93 nt antisense RNA that binds its target ompF mRNA and regulates ompF expression by inhibiting translation and inducing degradation of the message. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00033)
   * (http://purl.obolibrary.org/obo/SO_0000383)
   */
  public static Resource MicF_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000383");
  }

  /**
   * A small untranslated RNA which is induced in response to oxidative stress in Escherichia coli. Acts as a global regulator to activate or repress the expression of as many as 40 genes, including the fhlA-encoded transcriptional activator and the rpoS-encoded sigma(s) subunit of RNA polymerase. OxyS is bound by the Hfq protein, that increases the OxyS RNA interaction with its target messages. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00035)
   * (http://purl.obolibrary.org/obo/SO_0000384)
   */
  public static Resource OxyS_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000384");
  }

  /**
   * The RNA molecule essential for the catalytic activity of RNase MRP, an enzymatically active ribonucleoprotein with two distinct roles in eukaryotes. In mitochondria it plays a direct role in the initiation of mitochondrial DNA replication. In the nucleus it is involved in precursor rRNA processing, where it cleaves the internal transcribed spacer 1 between 18S and 5.8S rRNAs. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00030)
   * (http://purl.obolibrary.org/obo/SO_0000385)
   */
  public static Resource RNase_MRP_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000385");
  }

  /**
   * The RNA component of Ribonuclease P (RNase P), a ubiquitous endoribonuclease, found in archaea, bacteria and eukarya as well as chloroplasts and mitochondria. Its best characterized activity is the generation of mature 5 prime ends of tRNAs by cleaving the 5 prime leader elements of precursor-tRNAs. Cellular RNase Ps are ribonucleoproteins. RNA from bacterial RNase Ps retains its catalytic activity in the absence of the protein subunit, i.e. it is a ribozyme. Isolated eukaryotic and archaeal RNase P RNA has not been shown to retain its catalytic function, but is still essential for the catalytic activity of the holoenzyme. Although the archaeal and eukaryotic holoenzymes have a much greater protein content than the bacterial ones, the RNA cores from all the three lineages are homologous. Helices corresponding to P1, P2, P3, P4, and P10/11 are common to all cellular RNase P RNAs. Yet, there is considerable sequence variation, particularly among the eukaryotic RNAs. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00010)
   * (http://purl.obolibrary.org/obo/SO_0000386)
   */
  public static Resource RNase_P_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000386");
  }

  /**
   * Translational regulation of the stationary phase sigma factor RpoS is mediated by the formation of a double-stranded RNA stem-loop structure in the upstream region of the rpoS messenger RNA, occluding the translation initiation site. Clones carrying rprA (RpoS regulator RNA) increased the translation of RpoS. The rprA gene encodes a 106 nucleotide regulatory RNA. As with DsrA Rfam:RF00014, RprA is predicted to form three stem-loops. Thus, at least two small RNAs, DsrA and RprA, participate in the positive regulation of RpoS translation. Unlike DsrA, RprA does not have an extensive region of complementarity to the RpoS leader, leaving its mechanism of action unclear. RprA is non-essential. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00034)
   * (http://purl.obolibrary.org/obo/SO_0000387)
   */
  public static Resource RprA_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000387");
  }

  /**
   * The Rev response element (RRE) is encoded within the HIV-env gene. Rev is an essential regulatory protein of HIV that binds an internal loop of the RRE leading, encouraging further Rev-RRE binding. This RNP complex is critical for mRNA export and hence for expression of the HIV structural proteins. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00036)
   * (http://purl.obolibrary.org/obo/SO_0000388)
   */
  public static Resource RRE_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000388");
  }

  /**
   * A 109-nucleotide RNA of E. coli that seems to have a regulatory role on the galactose operon. Changes in Spot 42 levels are implicated in affecting DNA polymerase I levels. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00021)
   * (http://purl.obolibrary.org/obo/SO_0000389)
   */
  public static Resource spot_42_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000389");
  }

  /**
   * The RNA component of telomerase, a reverse transcriptase that synthesizes telomeric DNA. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00025)
   * (http://purl.obolibrary.org/obo/SO_0000390)
   */
  public static Resource telomerase_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000390");
  }

  /**
   * U1 is a small nuclear RNA (snRNA) component of the spliceosome (involved in pre-mRNA splicing). Its 5" end forms complementary base pairs with the 5" splice junction, thus defining the 5" donor site of an intron. There are significant differences in sequence and secondary structure between metazoan and yeast U1 snRNAs, the latter being much longer (568 nucleotides as compared to 164 nucleotides in human). Nevertheless, secondary structure predictions suggest that all U1 snRNAs share a "common core" consisting of helices I, II, the proximal region of III, and IV. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00003)
   * (http://purl.obolibrary.org/obo/SO_0000391)
   */
  public static Resource U1_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000391");
  }

  /**
   * U2 is a small nuclear RNA (snRNA) component of the spliceosome (involved in pre-mRNA splicing). Complementary binding between U2 snRNA (in an area lying towards the 5" end but 3" to hairpin I) and the branchpoint sequence (BPS) of the intron results in the bulging out of an unpaired adenine, on the BPS, which initiates a nucleophilic attack at the intronic 5" splice site, thus starting the first of two transesterification reactions that mediate splicing. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00004)
   * (http://purl.obolibrary.org/obo/SO_0000392)
   */
  public static Resource U2_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000392");
  }

  /**
   * U4 small nuclear RNA (U4 snRNA) is a component of the major U2-dependent spliceosome. It forms a duplex with U6, and with each splicing round, it is displaced from U6 (and the spliceosome) in an ATP-dependent manner, allowing U6 to refold and create the active site for splicing catalysis. A recycling process involving protein Prp24 re-anneals U4 and U6. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
   * (http://purl.obolibrary.org/obo/SO_0000393)
   */
  public static Resource U4_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000393");
  }

  /**
   * An snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U6atac_snRNA (SO:0000397). (PMID:=12409455)
   * (http://purl.obolibrary.org/obo/SO_0000394)
   */
  public static Resource U4atac_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000394");
  }

  /**
   * U5 RNA is a component of both types of known spliceosome. The precise function of this molecule is unknown, though it is known that the 5" loop is required for splice site selection and p220 binding, and that both the 3" stem-loop and the Sm site are important for Sm protein binding and cap methylation. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00020)
   * (http://purl.obolibrary.org/obo/SO_0000395)
   */
  public static Resource U5_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000395");
  }

  /**
   * U6 snRNA is a component of the spliceosome which is involved in splicing pre-mRNA. The putative secondary structure consensus base pairing is confined to a short 5" stem loop, but U6 snRNA is thought to form extensive base-pair interactions with U4 snRNA. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
   * (http://purl.obolibrary.org/obo/SO_0000396)
   */
  public static Resource U6_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000396");
  }

  /**
   * U6atac_snRNA is an snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U4atac_snRNA (SO:0000394). (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=retrieve&db=pubmed&list_uids=12409455&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000397)
   */
  public static Resource U6atac_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000397");
  }

  /**
   * U11 snRNA plays a role in splicing of the minor U12-dependent class of eukaryotic nuclear introns, similar to U1 snRNA in the major class spliceosome it base pairs to the conserved 5" splice site sequence. (PMID:9622129)
   * (http://purl.obolibrary.org/obo/SO_0000398)
   */
  public static Resource U11_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000398");
  }

  /**
   * The U12 small nuclear (snRNA), together with U4atac/U6atac, U5, and U11 snRNAs and associated proteins, forms a spliceosome that cleaves a divergent class of low-abundance pre-mRNA introns. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00007)
   * (http://purl.obolibrary.org/obo/SO_0000399)
   */
  public static Resource U12_snRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000399");
  }

  /**
   * An attribute describes a quality of sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000400)
   */
  public static Resource sequence_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000400");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000401)
   */
  public static Resource gene_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000401");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000402)
   */
  public static Resource enhancer_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000402");
  }

  /**
   * U14 small nucleolar RNA (U14 snoRNA) is required for early cleavages of eukaryotic precursor rRNAs. In yeasts, this molecule possess a stem-loop region (known as the Y-domain) which is essential for function. A similar structure, but with a different consensus sequence, is found in plants, but is absent in vertebrates. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00016, PMID:2551119)
   * (http://purl.obolibrary.org/obo/SO_0000403)
   */
  public static Resource U14_snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000403");
  }

  /**
   * A family of RNAs are found as part of the enigmatic vault ribonucleoprotein complex. The complex consists of a major vault protein (MVP), two minor vault proteins (VPARP and TEP1), and several small untranslated RNA molecules. It has been suggested that the vault complex is involved in drug resistance. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00006)
   * (http://purl.obolibrary.org/obo/SO_0000404)
   */
  public static Resource vault_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000404");
  }

  /**
   * Y RNAs are components of the Ro ribonucleoprotein particle (Ro RNP), in association with Ro60 and La proteins. The Y RNAs and Ro60 and La proteins are well conserved, but the function of the Ro RNP is not known. In humans the RNA component can be one of four small RNAs: hY1, hY3, hY4 and hY5. These small RNAs are predicted to fold into a conserved secondary structure containing three stem structures. The largest of the four, hY1, contains an additional hairpin. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00019)
   * (http://purl.obolibrary.org/obo/SO_0000405)
   */
  public static Resource Y_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000405");
  }

  /**
   * An intron within an intron. Twintrons are group II or III introns, into which another group II or III intron has been transposed. (PMID:1899376, PMID:7823908)
   * (http://purl.obolibrary.org/obo/SO_0000406)
   */
  public static Resource twintron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000406");
  }

  /**
   * A large polynucleotide in eukaryotes, which functions as the small subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000407)
   */
  public static Resource rRNA_18S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000407");
  }

  /**
   * The interbase position where something (eg an aberration) occurred. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000408)
   */
  public static Resource site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000408");
  }

  /**
   * A biological_region of sequence that, in the molecule, interacts selectively and non-covalently with other molecules. A region on the surface of a molecule that may interact with another molecule. When applied to polypeptides: Amino acids involved in binding or interactions. It can also apply to an amino acid bond which is represented by the positions of the two flanking amino acids. (EBIBS:GAR, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000409)
   */
  public static Resource binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000409");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with polypeptide molecules. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000410)
   */
  public static Resource protein_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000410");
  }

  /**
   * A region that rescues. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000411)
   */
  public static Resource rescue_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000411");
  }

  /**
   * A region of polynucleotide sequence produced by digestion with a restriction endonuclease. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000412)
   */
  public static Resource restriction_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000412");
  }

  /**
   * A region where the sequence differs from that of a specified sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000413)
   */
  public static Resource sequence_difference() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000413");
  }

  /**
   * An attribute to describe a feature that is invalidated due to genomic contamination. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000414)
   */
  public static Resource invalidated_by_genomic_contamination() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000414");
  }

  /**
   * An attribute to describe a feature that is invalidated due to polyA priming. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000415)
   */
  public static Resource invalidated_by_genomic_polyA_primed_cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000415");
  }

  /**
   * An attribute to describe a feature that is invalidated due to partial processing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000416)
   */
  public static Resource invalidated_by_partial_processing() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000416");
  }

  /**
   * A structurally or functionally defined protein region. In proteins with multiple domains, the combination of the domains determines the function of the protein. A region which has been shown to recur throughout evolution. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0000417)
   */
  public static Resource polypeptide_domain() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000417");
  }

  /**
   * The signal_peptide is a short region of the peptide located at the N-terminus that directs the protein to be secreted or part of membrane components. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000418)
   */
  public static Resource signal_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000418");
  }

  /**
   * The polypeptide sequence that remains when the cleaved peptide regions have been cleaved from the immature peptide. (EBIBS:GAR, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000419)
   */
  public static Resource mature_protein_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000419");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000420)
   */
  public static Resource five_prime_terminal_inverted_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000420");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000421)
   */
  public static Resource three_prime_terminal_inverted_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000421");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000422)
   */
  public static Resource U5_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000422");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000423)
   */
  public static Resource R_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000423");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000424)
   */
  public static Resource U3_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000424");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000425)
   */
  public static Resource five_prime_LTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000425");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000426)
   */
  public static Resource three_prime_LTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000426");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000427)
   */
  public static Resource R_five_prime_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000427");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000428)
   */
  public static Resource U5_five_prime_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000428");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000429)
   */
  public static Resource U3_five_prime_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000429");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000430)
   */
  public static Resource R_three_prime_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000430");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000431)
   */
  public static Resource U3_three_prime_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000431");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000432)
   */
  public static Resource U5_three_prime_LTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000432");
  }

  /**
   * A polymeric tract, such as poly(dA), within a non_LTR_retrotransposon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000433)
   */
  public static Resource non_LTR_retrotransposon_polymeric_tract() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000433");
  }

  /**
   * A sequence of the target DNA that is duplicated when a transposable element or phage inserts; usually found at each end the insertion. (http://www.koko.gov.my/CocoaBioTech/Glossaryt.html)
   * (http://purl.obolibrary.org/obo/SO_0000434)
   */
  public static Resource target_site_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000434");
  }

  /**
   * A polypurine tract within an LTR_retrotransposon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000435)
   */
  public static Resource RR_tract() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000435");
  }

  /**
   * A sequence that can autonomously replicate, as a plasmid, when transformed into a bacterial host. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000436)
   */
  public static Resource ARS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000436");
  }

  /**
   * Either:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0000437)
   * Or:
   *   A multi-chromosome duplication aberration generated by reassortment of other aberration components. (FB:gm)
   *   (http://purl.obolibrary.org/obo/SO_0000800)
   */
  public static Set<Resource> assortment_derived_duplication() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0000437"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0000800") }));
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000438)
   */
  public static Resource gene_not_polyadenylated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000438");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000439)
   */
  public static Resource inverted_ring_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000439");
  }

  /**
   * A replicon that has been modified to act as a vector for foreign sequence. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000440)
   */
  public static Resource vector_replicon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000440");
  }

  /**
   * A single stranded oligonucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000441)
   */
  public static Resource ss_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000441");
  }

  /**
   * A double stranded oligonucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000442)
   */
  public static Resource ds_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000442");
  }

  /**
   * An attribute to describe the kind of biological sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000443)
   */
  public static Resource polymer_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000443");
  }

  /**
   * Non-coding exon in the 3" UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000444)
   */
  public static Resource three_prime_noncoding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000444");
  }

  /**
   * Non-coding exon in the 5" UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000445)
   */
  public static Resource five_prime_noncoding_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000445");
  }

  /**
   * Intron located in the untranslated region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000446)
   */
  public static Resource UTR_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000446");
  }

  /**
   * An intron located in the 5" UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000447)
   */
  public static Resource five_prime_UTR_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000447");
  }

  /**
   * An intron located in the 3" UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000448)
   */
  public static Resource three_prime_UTR_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000448");
  }

  /**
   * A sequence of nucleotides or amino acids which, by design, has a \"random\" order of components, given a predetermined input frequency of these components. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000449)
   */
  public static Resource random_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000449");
  }

  /**
   * A light region between two darkly staining bands in a polytene chromosome. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000450)
   */
  public static Resource interband() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000450");
  }

  /**
   * A gene that encodes a polyadenylated mRNA. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000451)
   */
  public static Resource gene_with_polyadenylated_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000451");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000452)
   */
  public static Resource transgene_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000452");
  }

  /**
   * A chromosome structure variant whereby a region of a chromosome has been transferred to another position. Among interchromosomal rearrangements, the term transposition is reserved for that class in which the telomeres of the chromosomes involved are coupled (that is to say, form the two ends of a single DNA molecule) as in wild-type. (FB:reference_manual, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000453)
   */
  public static Resource chromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000453");
  }

  /**
   * A 17-28-nt, small interfering RNA derived from transcripts of repetitive elements. (http://www.developmentalcell.com/content/article/abstract?uid=PIIS1534580703002284)
   * (http://purl.obolibrary.org/obo/SO_0000454)
   */
  public static Resource rasiRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000454");
  }

  /**
   * A gene that encodes an mRNA with a frameshift. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000455)
   */
  public static Resource gene_with_mRNA_with_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000455");
  }

  /**
   * A gene that is recombinationally rearranged. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000456)
   */
  public static Resource recombinationally_rearranged_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000456");
  }

  /**
   * A chromosome duplication involving an insertion from another chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000457)
   */
  public static Resource interchromosomal_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000457");
  }

  /**
   * Germline genomic DNA including D-region with 5" UTR and 3" UTR, also designated as D-segment. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000458)
   */
  public static Resource D_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000458");
  }

  /**
   * A gene with a transcript that is trans-spliced. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000459)
   */
  public static Resource gene_with_trans_spliced_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000459");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000460)
   */
  public static Resource vertebrate_immunoglobulin_T_cell_receptor_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000460");
  }

  /**
   * A chromosomal deletion whereby a chromosome generated by recombination between two inversions; has a deficiency at each end of the inversion. (FB:km)
   * (http://purl.obolibrary.org/obo/SO_0000461)
   */
  public static Resource inversion_derived_bipartite_deficiency() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000461");
  }

  /**
   * A non-functional descendent of a functional entity. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000462)
   */
  public static Resource pseudogenic_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000462");
  }

  /**
   * A gene that encodes more than one transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000463)
   */
  public static Resource encodes_alternately_spliced_transcripts() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000463");
  }

  /**
   * A non-functional descendant of an exon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000464)
   */
  public static Resource decayed_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000464");
  }

  /**
   * A chromosome deletion whereby a chromosome is generated by recombination between two inversions; there is a deficiency at one end of the inversion and a duplication at the other end of the inversion. (FB:km)
   * (http://purl.obolibrary.org/obo/SO_0000465)
   */
  public static Resource inversion_derived_deficiency_plus_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000465");
  }

  /**
   * Germline genomic DNA including L-part1, V-intron and V-exon, with the 5" UTR and 3" UTR. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000466)
   */
  public static Resource V_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000466");
  }

  /**
   * An attribute describing a gene sequence where the resulting protein is regulated by the stability of the resulting protein. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000467)
   */
  public static Resource post_translationally_regulated_by_protein_stability() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000467");
  }

  /**
   * One of the pieces of sequence that make up a golden path. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000468)
   */
  public static Resource golden_path_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000468");
  }

  /**
   * An attribute describing a gene sequence where the resulting protein is modified to regulate it. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000469)
   */
  public static Resource post_translationally_regulated_by_protein_modification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000469");
  }

  /**
   * Germline genomic DNA of an immunoglobulin/T-cell receptor gene including J-region with 5" UTR (SO:0000204) and 3" UTR (SO:0000205), also designated as J-segment. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000470)
   */
  public static Resource J_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000470");
  }

  /**
   * The gene product is involved in its own transcriptional regulation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000471)
   */
  public static Resource autoregulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000471");
  }

  /**
   * A set of regions which overlap with minimal polymorphism to form a linear sequence. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000472)
   */
  public static Resource tiling_path() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000472");
  }

  /**
   * The gene product is involved in its own transcriptional regulation where it decreases transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000473)
   */
  public static Resource negatively_autoregulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000473");
  }

  /**
   * A piece of sequence that makes up a tiling_path (SO:0000472). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000474)
   */
  public static Resource tiling_path_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000474");
  }

  /**
   * The gene product is involved in its own transcriptional regulation, where it increases transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000475)
   */
  public static Resource positively_autoregulated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000475");
  }

  /**
   * A DNA sequencer read which is part of a contig. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000476)
   */
  public static Resource contig_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000476");
  }

  /**
   * A gene that is polycistronic. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000477)
   */
  public static Resource polycistronic_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000477");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene including C-region (and introns if present) with 5" UTR (SO:0000204) and 3" UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000478)
   */
  public static Resource C_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000478");
  }

  /**
   * A transcript that is trans-spliced. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000479)
   */
  public static Resource trans_spliced_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000479");
  }

  /**
   * A clone which is part of a tiling path. A tiling path is a set of sequencing substrates, typically clones, which have been selected in order to efficiently cover a region of the genome in preparation for sequencing and assembly. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000480)
   */
  public static Resource tiling_path_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000480");
  }

  /**
   * An inverted repeat (SO:0000294) occurring at the termini of a DNA transposon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000481)
   */
  public static Resource terminal_inverted_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000481");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000482)
   */
  public static Resource vertebrate_immunoglobulin_T_cell_receptor_gene_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000482");
  }

  /**
   * A primary transcript that is never translated into a protein. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000483)
   */
  public static Resource nc_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000483");
  }

  /**
   * The sequence of the 3" exon that is not coding. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000484)
   */
  public static Resource three_prime_coding_exon_noncoding_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000484");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one DJ-gene, and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000485)
   */
  public static Resource DJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000485");
  }

  /**
   * The sequence of the 5" exon preceding the start codon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000486)
   */
  public static Resource five_prime_coding_exon_noncoding_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000486");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VDJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000487)
   */
  public static Resource VDJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000487");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VDJ-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000488)
   */
  public static Resource VDJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000488");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000489)
   */
  public static Resource VJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000489");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000490)
   */
  public static Resource VJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000490");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VJ-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000491)
   */
  public static Resource VJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000491");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000492)
   */
  public static Resource D_gene_recombination_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000492");
  }

  /**
   * 7 nucleotide recombination site like CACAGTG, part of a 3" D-recombination signal sequence of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000493)
   */
  public static Resource three_prime_D_heptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000493");
  }

  /**
   * A 9 nucleotide recombination site (e.g. ACAAAAACC), part of a 3" D-recombination signal sequence of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000494)
   */
  public static Resource three_prime_D_nonamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000494");
  }

  /**
   * A 12 or 23 nucleotide spacer between the 3"D-HEPTAMER and 3"D-NONAMER of a 3"D-RS. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000495)
   */
  public static Resource three_prime_D_spacer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000495");
  }

  /**
   * 7 nucleotide recombination site (e.g. CACTGTG), part of a 5" D-recombination signal sequence (SO:0000556) of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000496)
   */
  public static Resource five_prime_D_heptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000496");
  }

  /**
   * 9 nucleotide recombination site (e.g. GGTTTTTGT), part of a five_prime_D-recombination signal sequence (SO:0000556) of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000497)
   */
  public static Resource five_prime_D_nonamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000497");
  }

  /**
   * 12 or 23 nucleotide spacer between the 5" D-heptamer (SO:0000496) and 5" D-nonamer (SO:0000497) of a 5" D-recombination signal sequence (SO:0000556) of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000498)
   */
  public static Resource five_prime_D_spacer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000498");
  }

  /**
   * A continuous piece of sequence similar to the "virtual contig" concept of the Ensembl database. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000499)
   */
  public static Resource virtual_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000499");
  }

  /**
   * A type of non-canonical base-pairing. This is less energetically favourable than watson crick base pairing. Hoogsteen GC base pairs only have two hydrogen bonds. (PMID:12177293)
   * (http://purl.obolibrary.org/obo/SO_0000500)
   */
  public static Resource Hoogsteen_base_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000500");
  }

  /**
   * A type of non-canonical base-pairing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000501)
   */
  public static Resource reverse_Hoogsteen_base_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000501");
  }

  /**
   * A region of sequence that is transcribed. This region may cover the transcript of a gene, it may emcompas the sequence covered by all of the transcripts of a alternately spliced gene, or it may cover the region transcribed by a polycistronic transcript. A gene may have 1 or more transcribed regions and a transcribed_region may belong to one or more genes. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000502)
   */
  public static Resource transcribed_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000502");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000503)
   */
  public static Resource alternately_spliced_gene_encodeing_one_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000503");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene, one DJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000504)
   */
  public static Resource D_DJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000504");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene and one DJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000505)
   */
  public static Resource D_DJ_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000505");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene, one DJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000506)
   */
  public static Resource D_DJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000506");
  }

  /**
   * A non functional descendant of an exon, part of a pseudogene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000507)
   */
  public static Resource pseudogenic_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000507");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene, one DJ-gene, and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000508)
   */
  public static Resource D_DJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000508");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one D-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000509)
   */
  public static Resource D_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000509");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in partially rearranged genomic DNA including L-part1, V-intron and V-D-exon, with the 5" UTR (SO:0000204) and 3" UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000510)
   */
  public static Resource VD_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000510");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000511)
   */
  public static Resource J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000511");
  }

  /**
   * A chromosomal deletion whereby a chromosome generated by recombination between two inversions; has a deficiency at one end and presumed to have a deficiency or duplication at the other end of the inversion. (FB:km)
   * (http://purl.obolibrary.org/obo/SO_0000512)
   */
  public static Resource inversion_derived_deficiency_plus_aneuploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000512");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including more than one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000513)
   */
  public static Resource J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000513");
  }

  /**
   * 9 nucleotide recombination site (e.g. GGTTTTTGT), part of a J-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000514)
   */
  public static Resource J_nonamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000514");
  }

  /**
   * 7 nucleotide recombination site (e.g. CACAGTG), part of a J-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000515)
   */
  public static Resource J_heptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000515");
  }

  /**
   * A non functional descendant of a transcript, part of a pseudogene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000516)
   */
  public static Resource pseudogenic_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000516");
  }

  /**
   * 12 or 23 nucleotide spacer between the J-nonamer and the J-heptamer of a J-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000517)
   */
  public static Resource J_spacer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000517");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene and one DJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000518)
   */
  public static Resource V_DJ_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000518");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one DJ-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000519)
   */
  public static Resource V_DJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000519");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VDJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000520)
   */
  public static Resource V_VDJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000520");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene and one VDJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000521)
   */
  public static Resource V_VDJ_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000521");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VDJ-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000522)
   */
  public static Resource V_VDJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000522");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000523)
   */
  public static Resource V_VJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000523");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene and one VJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000524)
   */
  public static Resource V_VJ_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000524");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VJ-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000525)
   */
  public static Resource V_VJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000525");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including more than one V-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000526)
   */
  public static Resource V_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000526");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000527)
   */
  public static Resource V_D_DJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000527");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000528)
   */
  public static Resource V_D_DJ_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000528");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000529)
   */
  public static Resource V_D_DJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000529");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000530)
   */
  public static Resource V_D_DJ_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000530");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene, one D-gene and one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000531)
   */
  public static Resource V_D_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000531");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene, one D-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000532)
   */
  public static Resource V_D_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000532");
  }

  /**
   * 7 nucleotide recombination site (e.g. CACAGTG), part of V-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000533)
   */
  public static Resource V_heptamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000533");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000534)
   */
  public static Resource V_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000534");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000535)
   */
  public static Resource V_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000535");
  }

  /**
   * 9 nucleotide recombination site (e.g. ACAAAAACC), part of V-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000536)
   */
  public static Resource V_nonamer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000536");
  }

  /**
   * 12 or 23 nucleotide spacer between the V-heptamer and the V-nonamer of a V-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000537)
   */
  public static Resource V_spacer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000537");
  }

  /**
   * Recombination signal including V-heptamer, V-spacer and V-nonamer in 3" of V-region of a V-gene or V-sequence of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000538)
   */
  public static Resource V_gene_recombination_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000538");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one DJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000539)
   */
  public static Resource DJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000539");
  }

  /**
   * Genomic DNA in rearranged configuration including at least one D-J-GENE, one J-GENE and one C-GENE. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000540)
   */
  public static Resource DJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000540");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VDJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000541)
   */
  public static Resource VDJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000541");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one DJ-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000542)
   */
  public static Resource V_DJ_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000542");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000543)
   */
  public static Resource alternately_spliced_gene_encoding_greater_than_one_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000543");
  }

  /**
   * A rolling circle transposon. Autonomous helitrons encode a 5"-to-3" DNA helicase and nuclease/ligase similar to those encoded by known rolling-circle replicons. (http://www.pnas.org/cgi/content/full/100/11/6569)
   * (http://purl.obolibrary.org/obo/SO_0000544)
   */
  public static Resource helitron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000544");
  }

  /**
   * The pseudoknots involved in recoding are unique in that, as they play their role as a structure, they are immediately unfolded and their now linear sequence serves as a template for decoding. (http://www.pubmedcentral.nih.gov/articlerender.fcgi?artid=33937)
   * (http://purl.obolibrary.org/obo/SO_0000545)
   */
  public static Resource recoding_pseudoknot() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000545");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000546)
   */
  public static Resource designed_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000546");
  }

  /**
   * A chromosome generated by recombination between two inversions; there is a duplication at each end of the inversion. (FB:km)
   * (http://purl.obolibrary.org/obo/SO_0000547)
   */
  public static Resource inversion_derived_bipartite_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000547");
  }

  /**
   * A gene that encodes a transcript that is edited. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000548)
   */
  public static Resource gene_with_edited_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000548");
  }

  /**
   * A chromosome generated by recombination between two inversions; has a duplication at one end and presumed to have a deficiency or duplication at the other end of the inversion. (FB:km)
   * (http://purl.obolibrary.org/obo/SO_0000549)
   */
  public static Resource inversion_derived_duplication_plus_aneuploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000549");
  }

  /**
   * A chromosome structural variation whereby either a chromosome exists in addition to the normal chromosome complement or is lacking. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000550)
   */
  public static Resource aneuploid_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000550");
  }

  /**
   * The recognition sequence necessary for endonuclease cleavage of an RNA transcript that is followed by polyadenylation; consensus=AATAAA. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000551)
   */
  public static Resource polyA_signal_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000551");
  }

  /**
   * A region in the 5" UTR that pairs with the 16S rRNA during formation of the preinitiation complex. (SO:jh)
   * (http://purl.obolibrary.org/obo/SO_0000552)
   */
  public static Resource Shine_Dalgarno_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000552");
  }

  /**
   * The site on an RNA transcript to which will be added adenine residues by post-transcriptional polyadenylation. The boundary between the UTR and the polyA sequence. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000553)
   */
  public static Resource polyA_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000553");
  }

  /**
   * Either:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0000554)
   * Or:
   *   A multi-chromosome aberration generated by reassortment of other aberration components; presumed to have a deficiency and a duplication. (FB:gm)
   *   (http://purl.obolibrary.org/obo/SO_0000801)
   */
  public static Set<Resource> assortment_derived_deficiency_plus_duplication() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0000554"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0000801") }));
  }

  /**
   * 5" most region of a precursor transcript that is clipped off during processing. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000555)
   */
  public static Resource five_prime_clip() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000555");
  }

  /**
   * Recombination signal of an immunoglobulin/T-cell receptor gene, including the 5" D-nonamer (SO:0000497), 5" D-spacer (SO:0000498), and 5" D-heptamer (SO:0000396) in 5" of the D-region of a D-gene, or in 5" of the D-region of DJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000556)
   */
  public static Resource five_prime_D_recombination_signal_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000556");
  }

  /**
   * 3"-most region of a precursor transcript that is clipped off during processing. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000557)
   */
  public static Resource three_prime_clip() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000557");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene including more than one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000558)
   */
  public static Resource C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000558");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including more than one D-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000559)
   */
  public static Resource D_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000559");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one D-gene and one J-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000560)
   */
  public static Resource D_J_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000560");
  }

  /**
   * Seven nucleotide recombination site (e.g. CACAGTG), part of V-gene, D-gene or J-gene recombination feature of an immunoglobulin or T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000561)
   */
  public static Resource heptamer_of_recombination_feature_of_vertebrate_immune_system_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000561");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000562)
   */
  public static Resource nonamer_of_recombination_feature_of_vertebrate_immune_system_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000562");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000563)
   */
  public static Resource vertebrate_immune_system_gene_recombination_spacer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000563");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one DJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000564)
   */
  public static Resource V_DJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000564");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VDJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000565)
   */
  public static Resource V_VDJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000565");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VJ-gene, one J-gene and one C-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000566)
   */
  public static Resource V_VJ_J_C_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000566");
  }

  /**
   * A chromosome may be generated by recombination between two inversions; presumed to have a deficiency or duplication at each end of the inversion. (FB:km)
   * (http://purl.obolibrary.org/obo/SO_0000567)
   */
  public static Resource inversion_derived_aneuploid_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000567");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000568)
   */
  public static Resource bidirectional_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000568");
  }

  /**
   * An attribute of a feature that occurred as the product of a reverse transcriptase mediated event. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000569)
   */
  public static Resource retrotransposed() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000569");
  }

  /**
   * Recombination signal of an immunoglobulin/T-cell receptor gene, including the 3" D-heptamer (SO:0000493), 3" D-spacer, and 3" D-nonamer (SO:0000494) in 3" of the D-region of a D-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000570)
   */
  public static Resource three_prime_D_recombination_signal_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000570");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000571)
   */
  public static Resource miRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000571");
  }

  /**
   * Genomic DNA of immunoglobulin/T-cell receptor gene in partially rearranged genomic DNA including D-J-region with 5" UTR and 3" UTR, also designated as D-J-segment. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000572)
   */
  public static Resource DJ_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000572");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000573)
   */
  public static Resource rRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000573");
  }

  /**
   * Rearranged genomic DNA of immunoglobulin/T-cell receptor gene including L-part1, V-intron and V-D-J-exon, with the 5"UTR (SO:0000204) and 3"UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000574)
   */
  public static Resource VDJ_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000574");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000575)
   */
  public static Resource scRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000575");
  }

  /**
   * Rearranged genomic DNA of immunoglobulin/T-cell receptor gene including L-part1, V-intron and V-J-exon, with the 5"UTR (SO:0000204) and 3"UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
   * (http://purl.obolibrary.org/obo/SO_0000576)
   */
  public static Resource VJ_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000576");
  }

  /**
   * A region of chromosome where the spindle fibers attach during mitosis and meiosis. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000577)
   */
  public static Resource centromere() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000577");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000578)
   */
  public static Resource snoRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000578");
  }

  /**
   * A locatable feature on a transcript that is edited. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000579)
   */
  public static Resource edited_transcript_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000579");
  }

  /**
   * A primary transcript encoding a methylation guide small nucleolar RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000580)
   */
  public static Resource methylation_guide_snoRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000580");
  }

  /**
   * A structure consisting of a 7-methylguanosine in 5"-5" triphosphate linkage with the first nucleotide of an mRNA. It is added post-transcriptionally, and is not encoded in the DNA. (http://seqcore.brcf.med.umich.edu/doc/educ/dnapr/mbglossary/mbgloss.html)
   * (http://purl.obolibrary.org/obo/SO_0000581)
   */
  public static Resource cap() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000581");
  }

  /**
   * A primary transcript encoding an rRNA cleavage snoRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000582)
   */
  public static Resource rRNA_cleavage_snoRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000582");
  }

  /**
   * The region of a transcript that will be edited. (http://dna.kdna.ucla.edu/rna/index.aspx)
   * (http://purl.obolibrary.org/obo/SO_0000583)
   */
  public static Resource pre_edited_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000583");
  }

  /**
   * A tmRNA liberates a mRNA from a stalled ribosome. To accomplish this part of the tmRNA is used as a reading frame that ends in a translation stop signal. The broken mRNA is replaced in the ribosome by the tmRNA and translation of the tmRNA leads to addition of a proteolysis tag to the incomplete protein enabling recognition by a protease. Recently a number of permuted tmRNAs genes have been found encoded in two parts. TmRNAs have been identified in eubacteria and some chloroplasts but are absent from archeal and Eukaryote nuclear genomes. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00023)
   * (http://purl.obolibrary.org/obo/SO_0000584)
   */
  public static Resource tmRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000584");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000585)
   */
  public static Resource C_D_box_snoRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000585");
  }

  /**
   * A primary transcript encoding a tmRNA (SO:0000584). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000586)
   */
  public static Resource tmRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000586");
  }

  /**
   * Group I catalytic introns are large self-splicing ribozymes. They catalyze their own excision from mRNA, tRNA and rRNA precursors in a wide range of organisms. The core secondary structure consists of 9 paired regions (P1-P9). These fold to essentially two domains, the P4-P6 domain (formed from the stacking of P5, P4, P6 and P6a helices) and the P3-P9 domain (formed from the P8, P3, P7 and P9 helices). Group I catalytic introns often have long ORFs inserted in loop regions. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00028)
   * (http://purl.obolibrary.org/obo/SO_0000587)
   */
  public static Resource group_I_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000587");
  }

  /**
   * A self spliced intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000588)
   */
  public static Resource autocatalytically_spliced_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000588");
  }

  /**
   * A primary transcript encoding a signal recognition particle RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000589)
   */
  public static Resource SRP_RNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000589");
  }

  /**
   * The signal recognition particle (SRP) is a universally conserved ribonucleoprotein. It is involved in the co-translational targeting of proteins to membranes. The eukaryotic SRP consists of a 300-nucleotide 7S RNA and six proteins: SRPs 72, 68, 54, 19, 14, and 9. Archaeal SRP consists of a 7S RNA and homologues of the eukaryotic SRP19 and SRP54 proteins. In most eubacteria, the SRP consists of a 4.5S RNA and the Ffh protein (a homologue of the eukaryotic SRP54 protein). Eukaryotic and archaeal 7S RNAs have very similar secondary structures, with eight helical elements. These fold into the Alu and S domains, separated by a long linker region. Eubacterial SRP is generally a simpler structure, with the M domain of Ffh bound to a region of the 4.5S RNA that corresponds to helix 8 of the eukaryotic and archaeal SRP S domain. Some Gram-positive bacteria (e.g. Bacillus subtilis), however, have a larger SRP RNA that also has an Alu domain. The Alu domain is thought to mediate the peptide chain elongation retardation function of the SRP. The universally conserved helix which interacts with the SRP54/Ffh M domain mediates signal sequence recognition. In eukaryotes and archaea, the SRP19-helix 6 complex is thought to be involved in SRP assembly and stabilizes helix 8 for SRP54 binding. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00017)
   * (http://purl.obolibrary.org/obo/SO_0000590)
   */
  public static Resource SRP_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000590");
  }

  /**
   * A tertiary structure in RNA where nucleotides in a loop form base pairs with a region of RNA downstream of the loop. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000591)
   */
  public static Resource pseudoknot() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000591");
  }

  /**
   * A pseudoknot which contains two stems and at least two loops. (http://www.ncbi.nlm.nih.gov:80/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=10334330&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000592)
   */
  public static Resource H_pseudoknot() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000592");
  }

  /**
   * Most box C/D snoRNAs also contain long (>10 nt) sequences complementary to rRNA. Boxes C and D, as well as boxes C" and D", are usually located in close proximity, and form a structure known as the box C/D motif. This motif is important for snoRNA stability, processing, nucleolar targeting and function. A small number of box C/D snoRNAs are involved in rRNA processing; most, however, are known or predicted to serve as guide RNAs in ribose methylation of rRNA. Targeting involves direct base pairing of the snoRNA at the rRNA site to be modified and selection of a rRNA nucleotide a fixed distance from box D or D". (http://www.bio.umass.edu/biochem/rna-sequence/Yeast_snoRNA_Database/snoRNA_DataBase.html)
   * (http://purl.obolibrary.org/obo/SO_0000593)
   */
  public static Resource C_D_box_snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000593");
  }

  /**
   * Members of the box H/ACA family contain an ACA triplet, exactly 3 nt upstream from the 3" end and an H-box in a hinge region that links two structurally similar functional domains of the molecule. Both boxes are important for snoRNA biosynthesis and function. A few box H/ACA snoRNAs are involved in rRNA processing; most others are known or predicted to participate in selection of uridine nucleosides in rRNA to be converted to pseudouridines. Site selection is mediated by direct base pairing of the snoRNA with rRNA through one or both targeting domains. (http://www.bio.umass.edu/biochem/rna-sequence/Yeast_snoRNA_Database/snoRNA_DataBase.html)
   * (http://purl.obolibrary.org/obo/SO_0000594)
   */
  public static Resource H_ACA_box_snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000594");
  }

  /**
   * A primary transcript encoding a small nucleolar RNA of the box C/D family. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000595)
   */
  public static Resource C_D_box_snoRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000595");
  }

  /**
   * A primary transcript encoding a small nucleolar RNA of the box H/ACA family. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000596)
   */
  public static Resource H_ACA_box_snoRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000596");
  }

  /**
   * The insertion and deletion of uridine (U) residues, usually within coding regions of mRNA transcripts of cryptogenes in the mitochondrial genome of kinetoplastid protozoa. (http://www.rna.ucla.edu/index.html)
   * (http://purl.obolibrary.org/obo/SO_0000597)
   */
  public static Resource transcript_edited_by_U_insertion_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000597");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000598)
   */
  public static Resource edited_by_C_insertion_and_dinucleotide_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000598");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000599)
   */
  public static Resource edited_by_C_to_U_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000599");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000600)
   */
  public static Resource edited_by_A_to_I_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000600");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000601)
   */
  public static Resource edited_by_G_addition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000601");
  }

  /**
   * A short 3"-uridylated RNA that can form a duplex (except for its post-transcriptionally added oligo_U tail (SO:0000609)) with a stretch of mature edited mRNA. (http://www.rna.ucla.edu/index.html)
   * (http://purl.obolibrary.org/obo/SO_0000602)
   */
  public static Resource guide_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000602");
  }

  /**
   * Group II introns are found in rRNA, tRNA and mRNA of organelles in fungi, plants and protists, and also in mRNA in bacteria. They are large self-splicing ribozymes and have 6 structural domains (usually designated dI to dVI). A subset of group II introns also encode essential splicing proteins in intronic ORFs. The length of these introns can therefore be up to 3kb. Splicing occurs in almost identical fashion to nuclear pre-mRNA splicing with two transesterification steps. The 2" hydroxyl of a bulged adenosine in domain VI attacks the 5" splice site, followed by nucleophilic attack on the 3" splice site by the 3" OH of the upstream exon. Protein machinery is required for splicing in vivo, and long range intron-intron and intron-exon interactions are important for splice site positioning. Group II introns are further sub-classified into groups IIA and IIB which differ in splice site consensus, distance of bulged A from 3" splice site, some tertiary interactions, and intronic ORF phylogeny. (http://www.sanger.ac.uk/Software/Rfam/browse/index.shtml)
   * (http://purl.obolibrary.org/obo/SO_0000603)
   */
  public static Resource group_II_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000603");
  }

  /**
   * Edited mRNA sequence mediated by a single guide RNA (SO:0000602). (http://dna.kdna.ucla.edu/rna/index.aspx)
   * (http://purl.obolibrary.org/obo/SO_0000604)
   */
  public static Resource editing_block() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000604");
  }

  /**
   * A region containing or overlapping no genes that is bounded on either side by a gene, or bounded by a gene and the end of the chromosome. (SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0000605)
   */
  public static Resource intergenic_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000605");
  }

  /**
   * Edited mRNA sequence mediated by two or more overlapping guide RNAs (SO:0000602). (http://dna.kdna.ucla.edu/rna/index.aspx)
   * (http://purl.obolibrary.org/obo/SO_0000606)
   */
  public static Resource editing_domain() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000606");
  }

  /**
   * The region of an edited transcript that will not be edited. (http://dna.kdna.ucla.edu/rna/index.aspx)
   * (http://purl.obolibrary.org/obo/SO_0000607)
   */
  public static Resource unedited_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000607");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000608)
   */
  public static Resource H_ACA_box_snoRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000608");
  }

  /**
   * The string of non-encoded U"s at the 3" end of a guide RNA (SO:0000602). (http://www.rna.ucla.edu/)
   * (http://purl.obolibrary.org/obo/SO_0000609)
   */
  public static Resource oligo_U_tail() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000609");
  }

  /**
   * Sequence of about 100 nucleotides of A added to the 3" end of most eukaryotic mRNAs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000610)
   */
  public static Resource polyA_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000610");
  }

  /**
   * A pyrimidine rich sequence near the 3" end of an intron to which the 5"end becomes covalently bound during nuclear splicing. The resulting structure resembles a lariat. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000611)
   */
  public static Resource branch_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000611");
  }

  /**
   * The polypyrimidine tract is one of the cis-acting sequence elements directing intron removal in pre-mRNA splicing. (http://nar.oupjournals.org/cgi/content/full/25/4/888)
   * (http://purl.obolibrary.org/obo/SO_0000612)
   */
  public static Resource polypyrimidine_tract() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000612");
  }

  /**
   * A DNA sequence to which bacterial RNA polymerase binds, to begin transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000613)
   */
  public static Resource bacterial_RNApol_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000613");
  }

  /**
   * A terminator signal for bacterial transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000614)
   */
  public static Resource bacterial_terminator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000614");
  }

  /**
   * A terminator signal for RNA polymerase III transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000615)
   */
  public static Resource terminator_of_type_2_RNApol_III_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000615");
  }

  /**
   * The base where transcription ends. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000616)
   */
  public static Resource transcription_end_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000616");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000617)
   */
  public static Resource RNApol_III_promoter_type_1() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000617");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000618)
   */
  public static Resource RNApol_III_promoter_type_2() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000618");
  }

  /**
   * A variably distant linear promoter region recognized by TFIIIC, with consensus sequence TGGCnnAGTGG. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000619)
   */
  public static Resource A_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000619");
  }

  /**
   * A variably distant linear promoter region recognized by TFIIIC, with consensus sequence AGGTTCCAnnCC. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000620)
   */
  public static Resource B_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000620");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000621)
   */
  public static Resource RNApol_III_promoter_type_3() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000621");
  }

  /**
   * An RNA polymerase III type 1 promoter with consensus sequence CAnnCCn. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000622)
   */
  public static Resource C_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000622");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000623)
   */
  public static Resource snRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000623");
  }

  /**
   * A specific structure at the end of a linear chromosome, required for the integrity and maintenance of the end. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000624)
   */
  public static Resource telomere() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000624");
  }

  /**
   * A regulatory region which upon binding of transcription factors, suppress the transcription of the gene or genes they control. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000625)
   */
  public static Resource silencer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000625");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000626)
   */
  public static Resource chromosomal_regulatory_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000626");
  }

  /**
   * A transcriptional cis regulatory region that when located between a CM and a gene"s promoter prevents the CRM from modulating that genes expression. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0000627)
   */
  public static Resource insulator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000627");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000628)
   */
  public static Resource chromosomal_structural_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000628");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000629)
   */
  public static Resource five_prime_open_reading_frame() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000629");
  }

  /**
   * A start codon upstream of the ORF. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000630)
   */
  public static Resource upstream_AUG_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000630");
  }

  /**
   * A primary transcript encoding for more than one gene product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000631)
   */
  public static Resource polycistronic_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000631");
  }

  /**
   * A primary transcript encoding for one gene product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000632)
   */
  public static Resource monocistronic_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000632");
  }

  /**
   * An mRNA with either a single protein product, or for which the regions encoding all its protein products overlap. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000633)
   */
  public static Resource monocistronic_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000633");
  }

  /**
   * An mRNA that encodes multiple proteins from at least two non-overlapping regions. (SO:rd)
   * (http://purl.obolibrary.org/obo/SO_0000634)
   */
  public static Resource polycistronic_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000634");
  }

  /**
   * A primary transcript that donates the spliced leader to other mRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000635)
   */
  public static Resource mini_exon_donor_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000635");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000636)
   */
  public static Resource spliced_leader_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000636");
  }

  /**
   * A plasmid that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000637)
   */
  public static Resource engineered_plasmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000637");
  }

  /**
   * Part of an rRNA transcription unit that is transcribed but discarded during maturation, not giving rise to any part of rRNA. (http://oregonstate.edu/instruction/bb492/general/glossary.html)
   * (http://purl.obolibrary.org/obo/SO_0000638)
   */
  public static Resource transcribed_spacer_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000638");
  }

  /**
   * Non-coding regions of DNA sequence that separate genes coding for the 28S, 5.8S, and 18S ribosomal RNAs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000639)
   */
  public static Resource internal_transcribed_spacer_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000639");
  }

  /**
   * Non-coding regions of DNA that precede the sequence that codes for the ribosomal RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000640)
   */
  public static Resource external_transcribed_spacer_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000640");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000641)
   */
  public static Resource tetranucleotide_repeat_microsatellite_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000641");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000642)
   */
  public static Resource SRP_RNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000642");
  }

  /**
   * A repeat region containing tandemly repeated sequences having a unit length of 10 to 40 bp. (http://www.informatics.jax.org/silver/glossary.shtml)
   * (http://purl.obolibrary.org/obo/SO_0000643)
   */
  public static Resource minisatellite() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000643");
  }

  /**
   * Antisense RNA is RNA that is transcribed from the coding, rather than the template, strand of DNA. It is therefore complementary to mRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000644)
   */
  public static Resource antisense_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000644");
  }

  /**
   * The reverse complement of the primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000645)
   */
  public static Resource antisense_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000645");
  }

  /**
   * A small RNA molecule that is the product of a longer exogenous or endogenous dsRNA, which is either a bimolecular duplex or very long hairpin, processed (via the Dicer pathway) such that numerous siRNAs accumulate from both strands of the dsRNA. SRNAs trigger the cleavage of their target molecules. (PMID:12592000)
   * (http://purl.obolibrary.org/obo/SO_0000646)
   */
  public static Resource siRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000646");
  }

  /**
   * A primary transcript encoding a micro RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000647)
   */
  public static Resource miRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000647");
  }

  /**
   * A primary transcript encoding a small temporal mRNA (SO:0000649). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000648)
   */
  public static Resource stRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000648");
  }

  /**
   * Non-coding RNAs of about 21 nucleotides in length that regulate temporal development; first discovered in C. elegans. (PMID:11081512)
   * (http://purl.obolibrary.org/obo/SO_0000649)
   */
  public static Resource stRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000649");
  }

  /**
   * Ribosomal RNA transcript that structures the small subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000650)
   */
  public static Resource small_subunit_rRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000650");
  }

  /**
   * Ribosomal RNA transcript that structures the large subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000651)
   */
  public static Resource large_subunit_rRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000651");
  }

  /**
   * 5S ribosomal RNA (5S rRNA) is a component of the large ribosomal subunit in both prokaryotes and eukaryotes. In eukaryotes, it is synthesised by RNA polymerase III (the other eukaryotic rRNAs are cleaved from a 45S precursor synthesised by RNA polymerase I). In Xenopus oocytes, it has been shown that fingers 4-7 of the nine-zinc finger transcription factor TFIIIA can bind to the central region of 5S RNA. Thus, in addition to positively regulating 5S rRNA transcription, TFIIIA also stabilizes 5S rRNA until it is required for transcription. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00001)
   * (http://purl.obolibrary.org/obo/SO_0000652)
   */
  public static Resource rRNA_5S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000652");
  }

  /**
   * A component of the large ribosomal subunit. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000653)
   */
  public static Resource rRNA_28S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000653");
  }

  /**
   * A mitochondrial gene located in a maxicircle. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000654)
   */
  public static Resource maxicircle_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000654");
  }

  /**
   * An RNA transcript that does not encode for a protein rather the RNA molecule is the gene product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000655)
   */
  public static Resource ncRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000655");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000656)
   */
  public static Resource stRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000656");
  }

  /**
   * A region of sequence containing one or more repeat units. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000657)
   */
  public static Resource repeat_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000657");
  }

  /**
   * A repeat that is located at dispersed sites in the genome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000658)
   */
  public static Resource dispersed_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000658");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000659)
   */
  public static Resource tmRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000659");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000660)
   */
  public static Resource DNA_invertase_target_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000660");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000661)
   */
  public static Resource intron_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000661");
  }

  /**
   * An intron which is spliced by the spliceosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000662)
   */
  public static Resource spliceosomal_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000662");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000663)
   */
  public static Resource tRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000663");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000664)
   */
  public static Resource introgressed_chromosome_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000664");
  }

  /**
   * A transcript that is monocistronic. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000665)
   */
  public static Resource monocistronic_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000665");
  }

  /**
   * An intron (mitochondrial, chloroplast, nuclear or prokaryotic) that encodes a double strand sequence specific endonuclease allowing for mobility. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000666)
   */
  public static Resource mobile_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000666");
  }

  /**
   * The sequence of one or more nucleotides added between two adjacent nucleotides in the sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000667)
   */
  public static Resource insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000667");
  }

  /**
   * A match against an EST sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000668)
   */
  public static Resource EST_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000668");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000669)
   */
  public static Resource sequence_rearrangement_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000669");
  }

  /**
   * A sequence within the micronuclear DNA of ciliates at which chromosome breakage and telomere addition occurs during nuclear differentiation. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000670)
   */
  public static Resource chromosome_breakage_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000670");
  }

  /**
   * A sequence eliminated from the genome of ciliates during nuclear differentiation. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000671)
   */
  public static Resource internal_eliminated_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000671");
  }

  /**
   * A sequence that is conserved, although rearranged relative to the micronucleus, in the macronucleus of a ciliate genome. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000672)
   */
  public static Resource macronucleus_destined_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000672");
  }

  /**
   * An RNA synthesized on a DNA or RNA template by an RNA polymerase. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000673)
   */
  public static Resource transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000673");
  }

  /**
   * A splice site where the donor and acceptor sites differ from the canonical form. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000674)
   */
  public static Resource non_canonical_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000674");
  }

  /**
   * The major class of splice site with dinucleotides GT and AG for donor and acceptor sites, respectively. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000675)
   */
  public static Resource canonical_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000675");
  }

  /**
   * The canonical 3" splice site has the sequence \"AG\". (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000676)
   */
  public static Resource canonical_three_prime_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000676");
  }

  /**
   * The canonical 5" splice site has the sequence \"GT\". (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000677)
   */
  public static Resource canonical_five_prime_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000677");
  }

  /**
   * A 3" splice site that does not have the sequence \"AG\". (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000678)
   */
  public static Resource non_canonical_three_prime_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000678");
  }

  /**
   * A 5" splice site which does not have the sequence \"GT\". (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000679)
   */
  public static Resource non_canonical_five_prime_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000679");
  }

  /**
   * A start codon that is not the usual AUG sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000680)
   */
  public static Resource non_canonical_start_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000680");
  }

  /**
   * A transcript that has been processed \"incorrectly\", for example by the failure of splicing of one or more exons. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000681)
   */
  public static Resource aberrant_processed_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000681");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000682)
   */
  public static Resource splicing_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000682");
  }

  /**
   * Exonic splicing enhancers (ESEs) facilitate exon definition by assisting in the recruitment of splicing factors to the adjacent intron. (http://www.ncbi.nlm.nih.gov:80/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=12403462&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_0000683)
   */
  public static Resource exonic_splice_enhancer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000683");
  }

  /**
   * A region of nucleotide sequence targeted by a nuclease enzyme. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000684)
   */
  public static Resource nuclease_sensitive_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000684");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000685)
   */
  public static Resource DNAseI_hypersensitive_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000685");
  }

  /**
   * A chromosomal translocation whereby the chromosomes carrying non-homologous centromeres may be recovered independently. These chromosomes are described as translocation elements. This occurs for some translocations, particularly but not exclusively, reciprocal translocations. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000686)
   */
  public static Resource translocation_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000686");
  }

  /**
   * The space between two bases in a sequence which marks the position where a deletion has occurred. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000687)
   */
  public static Resource deletion_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000687");
  }

  /**
   * A set of subregions selected from sequence contigs which when concatenated form a nonredundant linear sequence. (SO:ls)
   * (http://purl.obolibrary.org/obo/SO_0000688)
   */
  public static Resource golden_path() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000688");
  }

  /**
   * A match against cDNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000689)
   */
  public static Resource cDNA_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000689");
  }

  /**
   * A gene that encodes a polycistronic transcript. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000690)
   */
  public static Resource gene_with_polycistronic_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000690");
  }

  /**
   * The initiator methionine that has been cleaved from a mature polypeptide sequence. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0000691)
   */
  public static Resource cleaved_initiator_methionine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000691");
  }

  /**
   * A gene that encodes a dicistronic transcript. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000692)
   */
  public static Resource gene_with_dicistronic_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000692");
  }

  /**
   * A gene that encodes an mRNA that is recoded. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000693)
   */
  public static Resource gene_with_recoded_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000693");
  }

  /**
   * SNPs are single base pair positions in genomic DNA at which different sequence alternatives exist in normal individuals in some population(s), wherein the least frequent variant has an abundance of 1% or greater. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000694)
   */
  public static Resource SNP() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000694");
  }

  /**
   * A sequence used in experiment. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000695)
   */
  public static Resource reagent() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000695");
  }

  /**
   * A short oligonucleotide sequence, of length on the order of 10"s of bases; either single or double stranded. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000696)
   */
  public static Resource oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000696");
  }

  /**
   * A gene that encodes a transcript with stop codon readthrough. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000697)
   */
  public static Resource gene_with_stop_codon_read_through() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000697");
  }

  /**
   * A gene encoding an mRNA that has the stop codon redefined as pyrrolysine. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000698)
   */
  public static Resource gene_with_stop_codon_redefined_as_pyrrolysine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000698");
  }

  /**
   * A sequence_feature with an extent of zero. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000699)
   */
  public static Resource junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000699");
  }

  /**
   * A comment about the sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000700)
   */
  public static Resource remark() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000700");
  }

  /**
   * A region of sequence where the validity of the base calling is questionable. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000701)
   */
  public static Resource possible_base_call_error() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000701");
  }

  /**
   * A region of sequence where there may have been an error in the assembly. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000702)
   */
  public static Resource possible_assembly_error() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000702");
  }

  /**
   * A region of sequence implicated in an experimental result. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000703)
   */
  public static Resource experimental_result_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000703");
  }

  /**
   * A region (or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0000704)
   */
  public static Resource gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000704");
  }

  /**
   * Two or more adjcent copies of a region (of length greater than 1). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000705)
   */
  public static Resource tandem_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000705");
  }

  /**
   * The 3" splice site of the acceptor primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000706)
   */
  public static Resource trans_splice_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000706");
  }

  /**
   * The 5" five prime splice site region of the donor RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000707)
   */
  public static Resource trans_splice_donor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000707");
  }

  /**
   * A trans_splicing_acceptor_site which appends the 22nt SL1 RNA leader sequence to the 5" end of most mRNAs. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0000708)
   */
  public static Resource SL1_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000708");
  }

  /**
   * A trans_splicing_acceptor_site which appends the 22nt SL2 RNA leader sequence to the 5" end of mRNAs. SL2 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0000709)
   */
  public static Resource SL2_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000709");
  }

  /**
   * A gene encoding an mRNA that has the stop codon redefined as selenocysteine. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000710)
   */
  public static Resource gene_with_stop_codon_redefined_as_selenocysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000710");
  }

  /**
   * A gene with mRNA recoded by translational bypass. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000711)
   */
  public static Resource gene_with_mRNA_recoded_by_translational_bypass() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000711");
  }

  /**
   * A gene encoding a transcript that has a translational frameshift. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000712)
   */
  public static Resource gene_with_transcript_with_translational_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000712");
  }

  /**
   * A motif that is active in the DNA form of the sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000713)
   */
  public static Resource DNA_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000713");
  }

  /**
   * A region of nucleotide sequence corresponding to a known motif. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000714)
   */
  public static Resource nucleotide_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000714");
  }

  /**
   * A motif that is active in RNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000715)
   */
  public static Resource RNA_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000715");
  }

  /**
   * An mRNA that has the quality dicistronic. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000716)
   */
  public static Resource dicistronic_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000716");
  }

  /**
   * A nucleic acid sequence that when read as sequential triplets, has the potential of encoding a sequential string of amino acids. It need not contain the start or stop codon. (SGD:rb)
   * (http://purl.obolibrary.org/obo/SO_0000717)
   */
  public static Resource reading_frame() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000717");
  }

  /**
   * A reading_frame that is interrupted by one or more stop codons; usually identified through intergenomic sequence comparisons. (SGD:rb)
   * (http://purl.obolibrary.org/obo/SO_0000718)
   */
  public static Resource blocked_reading_frame() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000718");
  }

  /**
   * An ordered and oriented set of scaffolds based on somewhat weaker sets of inferential evidence such as one set of mate pair reads together with supporting evidence from ESTs or location of markers from SNP or microsatellite maps, or cytogenetic localization of contained markers. (FB:WG)
   * (http://purl.obolibrary.org/obo/SO_0000719)
   */
  public static Resource ultracontig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000719");
  }

  /**
   * A transposable element that is foreign. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000720)
   */
  public static Resource foreign_transposable_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000720");
  }

  /**
   * A gene that encodes a dicistronic primary transcript. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000721)
   */
  public static Resource gene_with_dicistronic_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000721");
  }

  /**
   * A gene that encodes a polycistronic mRNA. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000722)
   */
  public static Resource gene_with_dicistronic_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000722");
  }

  /**
   * Genomic sequence removed from the genome, as a normal event, by a process of recombination. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000723)
   */
  public static Resource iDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000723");
  }

  /**
   * A region of a DNA molecule where transfer is initiated during the process of conjugation or mobilization. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000724)
   */
  public static Resource oriT() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000724");
  }

  /**
   * The transit_peptide is a short region at the N-terminus of the peptide that directs the protein to an organelle (chloroplast, mitochondrion, microbody or cyanelle). (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0000725)
   */
  public static Resource transit_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000725");
  }

  /**
   * The simplest repeated component of a repeat region. A single repeat. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000726)
   */
  public static Resource repeat_unit() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000726");
  }

  /**
   * A regulatory_region where more than 1 TF_binding_site together are regulatorily active. (SO:SG)
   * (http://purl.obolibrary.org/obo/SO_0000727)
   */
  public static Resource CRM() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000727");
  }

  /**
   * A region of a peptide that is able to excise itself and rejoin the remaining portions with a peptide bond. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000728)
   */
  public static Resource intein() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000728");
  }

  /**
   * An attribute of protein-coding genes where the initial protein product contains an intein. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000729)
   */
  public static Resource intein_containing() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000729");
  }

  /**
   * A gap in the sequence of known length. The unknown bases are filled in with N"s. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000730)
   */
  public static Resource gap() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000730");
  }

  /**
   * An attribute to describe a feature that is incomplete. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000731)
   */
  public static Resource fragmentary() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000731");
  }

  /**
   * An attribute describing an unverified region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000732)
   */
  public static Resource predicted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000732");
  }

  /**
   * An attribute describing a located_sequence_feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000733)
   */
  public static Resource feature_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000733");
  }

  /**
   * An exemplar is a representative cDNA sequence for each gene. The exemplar approach is a method that usually involves some initial clustering into gene groups and the subsequent selection of a representative from each gene group. (http://mged.sourceforge.net/ontologies/MGEDontology.php)
   * (http://purl.obolibrary.org/obo/SO_0000734)
   */
  public static Resource exemplar_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000734");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000735)
   */
  public static Resource sequence_location() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000735");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000736)
   */
  public static Resource organelle_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000736");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000737)
   */
  public static Resource mitochondrial_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000737");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000738)
   */
  public static Resource nuclear_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000738");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000739)
   */
  public static Resource nucleomorphic_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000739");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000740)
   */
  public static Resource plastid_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000740");
  }

  /**
   * A kinetoplast is an interlocked network of thousands of minicircles and tens of maxi circles, located near the base of the flagellum of some protozoan species. (PMID:8395055)
   * (http://purl.obolibrary.org/obo/SO_0000741)
   */
  public static Resource kinetoplast() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000741");
  }

  /**
   * A maxicircle is a replicon, part of a kinetoplast, that contains open reading frames and replicates via a rolling circle method. (PMID:8395055)
   * (http://purl.obolibrary.org/obo/SO_0000742)
   */
  public static Resource maxicircle() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000742");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000743)
   */
  public static Resource apicoplast_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000743");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000744)
   */
  public static Resource chromoplast_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000744");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000745)
   */
  public static Resource chloroplast_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000745");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000746)
   */
  public static Resource cyanelle_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000746");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000747)
   */
  public static Resource leucoplast_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000747");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000748)
   */
  public static Resource proplastid_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000748");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000749)
   */
  public static Resource plasmid_location() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000749");
  }

  /**
   * An origin_of_replication that is used for the amplification of a chromosomal nucleic acid sequence. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000750)
   */
  public static Resource amplification_origin() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000750");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000751)
   */
  public static Resource proviral_location() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000751");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000752)
   */
  public static Resource gene_group_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000752");
  }

  /**
   * The region of sequence that has been inserted and is being propagated by the clone. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000753)
   */
  public static Resource clone_insert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000753");
  }

  /**
   * The lambda bacteriophage is the vector for the linear lambda clone. The genes involved in the lysogenic pathway are removed from the from the viral DNA. Up to 25 kb of foreign DNA can then be inserted into the lambda genome. (ISBN:0-1767-2380-8)
   * (http://purl.obolibrary.org/obo/SO_0000754)
   */
  public static Resource lambda_vector() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000754");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000755)
   */
  public static Resource plasmid_vector() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000755");
  }

  /**
   * DNA synthesized by reverse transcriptase using RNA as a template. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000756)
   */
  public static Resource cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000756");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000757)
   */
  public static Resource single_stranded_cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000757");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000758)
   */
  public static Resource double_stranded_cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000758");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000759)
   */
  public static Resource plasmid_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000759");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000760)
   */
  public static Resource YAC_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000760");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000761)
   */
  public static Resource phagemid_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000761");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000762)
   */
  public static Resource PAC_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000762");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000763)
   */
  public static Resource fosmid_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000763");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000764)
   */
  public static Resource BAC_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000764");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000765)
   */
  public static Resource cosmid_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000765");
  }

  /**
   * A tRNA sequence that has a pyrrolysine anticodon, and a 3" pyrrolysine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000766)
   */
  public static Resource pyrrolysyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000766");
  }

  /**
   * A plasmid that may integrate with a chromosome. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000768)
   */
  public static Resource episome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000768");
  }

  /**
   * The region of a two-piece tmRNA that bears the reading frame encoding the proteolysis tag. The tmRNA gene undergoes circular permutation in some groups of bacteria. Processing of the transcripts from such a gene leaves the mature tmRNA in two pieces, base-paired together. (doi:10.1093/nar/gkh795, Indiana:kw, issn:1362-4962)
   * (http://purl.obolibrary.org/obo/SO_0000769)
   */
  public static Resource tmRNA_coding_piece() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000769");
  }

  /**
   * The acceptor region of a two-piece tmRNA that when mature is charged at its 3" end with alanine. The tmRNA gene undergoes circular permutation in some groups of bacteria; processing of the transcripts from such a gene leaves the mature tmRNA in two pieces, base-paired together. (doi:10.1093/nar/gkh795, Indiana:kw)
   * (http://purl.obolibrary.org/obo/SO_0000770)
   */
  public static Resource tmRNA_acceptor_piece() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000770");
  }

  /**
   * A quantitative trait locus (QTL) is a polymorphic locus which contains alleles that differentially affect the expression of a continuously distributed phenotypic trait. Usually it is a marker described by statistical association to quantitative variation in the particular phenotypic trait that is thought to be controlled by the cumulative action of alleles at multiple loci. (http://rgd.mcw.edu/tu/qtls/)
   * (http://purl.obolibrary.org/obo/SO_0000771)
   */
  public static Resource QTL() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000771");
  }

  /**
   * A genomic island is an integrated mobile genetic element, characterized by size (over 10 Kb). It that has features that suggest a foreign origin. These can include nucleotide distribution (oligonucleotides signature, CG content etc.) that differs from the bulk of the chromosome and/or genes suggesting DNA mobility. (Phigo:at, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000772)
   */
  public static Resource genomic_island() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000772");
  }

  /**
   * Mobile genetic elements that contribute to rapid changes in virulence potential. They are present on the genomes of pathogenic strains but absent from the genomes of non pathogenic members of the same or related species. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000773)
   */
  public static Resource pathogenic_island() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000773");
  }

  /**
   * A transmissible element containing genes involved in metabolism, analogous to the pathogenicity islands of gram negative bacteria. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000774)
   */
  public static Resource metabolic_island() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000774");
  }

  /**
   * An adaptive island is a genomic island that provides an adaptive advantage to the host. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000775)
   */
  public static Resource adaptive_island() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000775");
  }

  /**
   * A transmissible element containing genes involved in symbiosis, analogous to the pathogenicity islands of gram negative bacteria. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000776)
   */
  public static Resource symbiosis_island() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000776");
  }

  /**
   * A non functional descendent of an rRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000777)
   */
  public static Resource pseudogenic_rRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000777");
  }

  /**
   * A non functional descendent of a tRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000778)
   */
  public static Resource pseudogenic_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000778");
  }

  /**
   * An episome that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000779)
   */
  public static Resource engineered_episome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000779");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000780)
   */
  public static Resource transposable_element_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000780");
  }

  /**
   * Attribute describing sequence that has been integrated with foreign sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000781)
   */
  public static Resource transgenic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000781");
  }

  /**
   * An attribute describing a feature that occurs in nature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000782)
   */
  public static Resource natural() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000782");
  }

  /**
   * An attribute to describe a region that was modified in vitro. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000783)
   */
  public static Resource engineered() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000783");
  }

  /**
   * An attribute to describe a region from another species. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000784)
   */
  public static Resource foreign() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000784");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000785)
   */
  public static Resource cloned_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000785");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000786)
   */
  public static Resource reagent_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000786");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000787)
   */
  public static Resource clone_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000787");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000788)
   */
  public static Resource cloned() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000788");
  }

  /**
   * An attribute to describe a feature that has been proven. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000789)
   */
  public static Resource validated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000789");
  }

  /**
   * An attribute describing a feature that is invalidated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000790)
   */
  public static Resource invalidated() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000790");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000791)
   */
  public static Resource cloned_genomic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000791");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000792)
   */
  public static Resource cloned_cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000792");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000793)
   */
  public static Resource engineered_DNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000793");
  }

  /**
   * A rescue region that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000794)
   */
  public static Resource engineered_rescue_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000794");
  }

  /**
   * A mini_gene that rescues. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000795)
   */
  public static Resource rescue_mini_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000795");
  }

  /**
   * TE that has been modified in vitro, including insertion of DNA derived from a source other than the originating TE. (FB:mc)
   * (http://purl.obolibrary.org/obo/SO_0000796)
   */
  public static Resource transgenic_transposable_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000796");
  }

  /**
   * TE that exists (or existed) in nature. (FB:mc)
   * (http://purl.obolibrary.org/obo/SO_0000797)
   */
  public static Resource natural_transposable_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000797");
  }

  /**
   * TE that has been modified by manipulations in vitro. (FB:mc)
   * (http://purl.obolibrary.org/obo/SO_0000798)
   */
  public static Resource engineered_transposable_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000798");
  }

  /**
   * A transposable_element that is engineered and foreign. (FB:mc)
   * (http://purl.obolibrary.org/obo/SO_0000799)
   */
  public static Resource engineered_foreign_transposable_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000799");
  }

  /**
   * A region that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000804)
   */
  public static Resource engineered_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000804");
  }

  /**
   * A region that is engineered and foreign. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000805)
   */
  public static Resource engineered_foreign_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000805");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000806)
   */
  public static Resource fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000806");
  }

  /**
   * A tag that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000807)
   */
  public static Resource engineered_tag() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000807");
  }

  /**
   * A cDNA clone that has been validated. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000808)
   */
  public static Resource validated_cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000808");
  }

  /**
   * A cDNA clone that is invalid. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000809)
   */
  public static Resource invalidated_cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000809");
  }

  /**
   * A cDNA clone invalidated because it is chimeric. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000810)
   */
  public static Resource chimeric_cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000810");
  }

  /**
   * A cDNA clone invalidated by genomic contamination. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000811)
   */
  public static Resource genomically_contaminated_cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000811");
  }

  /**
   * A cDNA clone invalidated by polyA priming. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000812)
   */
  public static Resource polyA_primed_cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000812");
  }

  /**
   * A cDNA invalidated clone by partial processing. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000813)
   */
  public static Resource partially_processed_cDNA_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000813");
  }

  /**
   * An attribute describing a region"s ability, when introduced to a mutant organism, to re-establish (rescue) a phenotype. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000814)
   */
  public static Resource rescue() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000814");
  }

  /**
   * By definition, minigenes are short open-reading frames (ORF), usually encoding approximately 9 to 20 amino acids, which are expressed in vivo (as distinct from being synthesized as peptide or protein ex vivo and subsequently injected). The in vivo synthesis confers a distinct advantage: the expressed sequences can enter both antigen presentation pathways, MHC I (inducing CD8+ T- cells, which are usually cytotoxic T-lymphocytes (CTL)) and MHC II (inducing CD4+ T-cells, usually "T-helpers" (Th)); and can encounter B-cells, inducing antibody responses. Three main vector approaches have been used to deliver minigenes: viral vectors, bacterial vectors and plasmid DNA. (PMID:15992143)
   * (http://purl.obolibrary.org/obo/SO_0000815)
   */
  public static Resource mini_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000815");
  }

  /**
   * A gene that rescues. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000816)
   */
  public static Resource rescue_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000816");
  }

  /**
   * An attribute describing sequence with the genotype found in nature and/or standard laboratory stock. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000817)
   */
  public static Resource wild_type() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000817");
  }

  /**
   * A gene that rescues. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000818)
   */
  public static Resource wild_type_rescue_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000818");
  }

  /**
   * A chromosome originating in a mitochondria. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000819)
   */
  public static Resource mitochondrial_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000819");
  }

  /**
   * A chromosome originating in a chloroplast. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000820)
   */
  public static Resource chloroplast_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000820");
  }

  /**
   * A chromosome originating in a chromoplast. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000821)
   */
  public static Resource chromoplast_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000821");
  }

  /**
   * A chromosome originating in a cyanelle. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000822)
   */
  public static Resource cyanelle_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000822");
  }

  /**
   * A chromosome with origin in a leucoplast. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000823)
   */
  public static Resource leucoplast_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000823");
  }

  /**
   * A chromosome originating in a macronucleus. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000824)
   */
  public static Resource macronuclear_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000824");
  }

  /**
   * A chromosome originating in a micronucleus. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000825)
   */
  public static Resource micronuclear_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000825");
  }

  /**
   * A chromosome originating in a nucleus. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000828)
   */
  public static Resource nuclear_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000828");
  }

  /**
   * A chromosome originating in a nucleomorph. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000829)
   */
  public static Resource nucleomorphic_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000829");
  }

  /**
   * A region of a chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000830)
   */
  public static Resource chromosome_part() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000830");
  }

  /**
   * A region of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000831)
   */
  public static Resource gene_member_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000831");
  }

  /**
   * A region of sequence which is part of a promoter. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000832)
   */
  public static Resource promoter_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000832");
  }

  /**
   * A region of a transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000833)
   */
  public static Resource transcript_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000833");
  }

  /**
   * A region of a mature transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000834)
   */
  public static Resource mature_transcript_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000834");
  }

  /**
   * A part of a primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000835)
   */
  public static Resource primary_transcript_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000835");
  }

  /**
   * A region of an mRNA. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000836)
   */
  public static Resource mRNA_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000836");
  }

  /**
   * A region of UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000837)
   */
  public static Resource UTR_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000837");
  }

  /**
   * A region of an rRNA primary transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000838)
   */
  public static Resource rRNA_primary_transcript_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000838");
  }

  /**
   * Biological sequence region that can be assigned to a specific subsequence of a polypeptide. (SO:GAR, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000839)
   */
  public static Resource polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000839");
  }

  /**
   * A region of a repeated sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000840)
   */
  public static Resource repeat_component() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000840");
  }

  /**
   * A region within an intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000841)
   */
  public static Resource spliceosomal_intron_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000841");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000842)
   */
  public static Resource gene_component_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000842");
  }

  /**
   * A region which is part of a bacterial RNA polymerase promoter. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000843)
   */
  public static Resource bacterial_RNApol_promoter_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000843");
  }

  /**
   * A region of sequence which is a promoter for RNA polymerase II. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000844)
   */
  public static Resource RNApol_II_promoter_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000844");
  }

  /**
   * A region of sequence which is a promoter for RNA polymerase III type 1. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000845)
   */
  public static Resource RNApol_III_promoter_type_1_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000845");
  }

  /**
   * A region of sequence which is a promoter for RNA polymerase III type 2. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000846)
   */
  public static Resource RNApol_III_promoter_type_2_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000846");
  }

  /**
   * A region of a tmRNA. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000847)
   */
  public static Resource tmRNA_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000847");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000848)
   */
  public static Resource LTR_component() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000848");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000849)
   */
  public static Resource three_prime_LTR_component() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000849");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000850)
   */
  public static Resource five_prime_LTR_component() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000850");
  }

  /**
   * A region of a CDS. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000851)
   */
  public static Resource CDS_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000851");
  }

  /**
   * A region of an exon. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0000852)
   */
  public static Resource exon_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000852");
  }

  /**
   * A region that is homologous to another region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000853)
   */
  public static Resource homologous_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000853");
  }

  /**
   * A homologous_region that is paralogous to another region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000854)
   */
  public static Resource paralogous_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000854");
  }

  /**
   * A homologous_region that is orthologous to another region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000855)
   */
  public static Resource orthologous_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000855");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000856)
   */
  public static Resource conserved() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000856");
  }

  /**
   * Similarity due to common ancestry. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000857)
   */
  public static Resource homologous() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000857");
  }

  /**
   * An attribute describing a kind of homology where divergence occured after a speciation event. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000858)
   */
  public static Resource orthologous() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000858");
  }

  /**
   * An attribute describing a kind of homology where divergence occurred after a duplication event. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000859)
   */
  public static Resource paralogous() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000859");
  }

  /**
   * Attribute describing sequence regions occurring in same order on chromosome of different species. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000860)
   */
  public static Resource syntenic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000860");
  }

  /**
   * A primary transcript that is capped. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000861)
   */
  public static Resource capped_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000861");
  }

  /**
   * An mRNA that is capped. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000862)
   */
  public static Resource capped_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000862");
  }

  /**
   * An attribute describing an mRNA feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000863)
   */
  public static Resource mRNA_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000863");
  }

  /**
   * An attribute describing a sequence is representative of a class of similar sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000864)
   */
  public static Resource exemplar() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000864");
  }

  /**
   * An attribute describing a sequence that contains a mutation involving the deletion or insertion of one or more bases, where this number is not divisible by 3. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000865)
   */
  public static Resource frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000865");
  }

  /**
   * A frameshift caused by deleting one base. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000866)
   */
  public static Resource minus_1_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000866");
  }

  /**
   * A frameshift caused by deleting two bases. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000867)
   */
  public static Resource minus_2_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000867");
  }

  /**
   * A frameshift caused by inserting one base. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000868)
   */
  public static Resource plus_1_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000868");
  }

  /**
   * A frameshift caused by inserting two bases. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000869)
   */
  public static Resource plus_2_framshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000869");
  }

  /**
   * An attribute describing transcript sequence that is created by splicing exons from diferent genes. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000870)
   */
  public static Resource trans_spliced() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000870");
  }

  /**
   * An mRNA that is polyadenylated. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000871)
   */
  public static Resource polyadenylated_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000871");
  }

  /**
   * An mRNA that is trans-spliced. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000872)
   */
  public static Resource trans_spliced_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000872");
  }

  /**
   * A transcript that is edited. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000873)
   */
  public static Resource edited_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000873");
  }

  /**
   * A transcript that has been edited by A to I substitution. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000874)
   */
  public static Resource edited_transcript_by_A_to_I_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000874");
  }

  /**
   * An attribute describing a sequence that is bound by a protein. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000875)
   */
  public static Resource bound_by_protein() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000875");
  }

  /**
   * An attribute describing a sequence that is bound by a nucleic acid. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000876)
   */
  public static Resource bound_by_nucleic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000876");
  }

  /**
   * An attribute describing a situation where a gene may encode for more than 1 transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000877)
   */
  public static Resource alternatively_spliced() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000877");
  }

  /**
   * An attribute describing a sequence that contains the code for one gene product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000878)
   */
  public static Resource monocistronic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000878");
  }

  /**
   * An attribute describing a sequence that contains the code for two gene products. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000879)
   */
  public static Resource dicistronic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000879");
  }

  /**
   * An attribute describing a sequence that contains the code for more than one gene product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000880)
   */
  public static Resource polycistronic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000880");
  }

  /**
   * An attribute describing an mRNA sequence that has been reprogrammed at translation, causing localized alterations. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000881)
   */
  public static Resource recoded() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000881");
  }

  /**
   * An attribute describing the alteration of codon meaning. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000882)
   */
  public static Resource codon_redefined() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000882");
  }

  /**
   * A stop codon redefined to be a new amino acid. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000883)
   */
  public static Resource stop_codon_read_through() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000883");
  }

  /**
   * A stop codon redefined to be the new amino acid, pyrrolysine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000884)
   */
  public static Resource stop_codon_redefined_as_pyrrolysine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000884");
  }

  /**
   * A stop codon redefined to be the new amino acid, selenocysteine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000885)
   */
  public static Resource stop_codon_redefined_as_selenocysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000885");
  }

  /**
   * Recoded mRNA where a block of nucleotides is not translated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000886)
   */
  public static Resource recoded_by_translational_bypass() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000886");
  }

  /**
   * Recoding by frameshifting a particular site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000887)
   */
  public static Resource translationally_frameshifted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000887");
  }

  /**
   * A gene that is maternally_imprinted. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000888)
   */
  public static Resource maternally_imprinted_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000888");
  }

  /**
   * A gene that is paternally imprinted. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000889)
   */
  public static Resource paternally_imprinted_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000889");
  }

  /**
   * A gene that is post translationally regulated. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000890)
   */
  public static Resource post_translationally_regulated_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000890");
  }

  /**
   * A gene that is negatively autoreguated. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000891)
   */
  public static Resource negatively_autoregulated_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000891");
  }

  /**
   * A gene that is positively autoregulated. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000892)
   */
  public static Resource positively_autoregulated_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000892");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated at transcriptional or translational level. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000893)
   */
  public static Resource silenced() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000893");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated by DNA modifications, resulting in repression of transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000894)
   */
  public static Resource silenced_by_DNA_modification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000894");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated by DNA methylation, resulting in repression of transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000895)
   */
  public static Resource silenced_by_DNA_methylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000895");
  }

  /**
   * A gene that is translationally regulated. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000896)
   */
  public static Resource translationally_regulated_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000896");
  }

  /**
   * A gene that is allelically_excluded. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000897)
   */
  public static Resource allelically_excluded_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000897");
  }

  /**
   * A gene that is epigenetically modified. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000898)
   */
  public static Resource epigenetically_modified_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000898");
  }

  /**
   * An attribute describing a nuclear pseudogene of a mitochndrial gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000899)
   */
  public static Resource nuclear_mitochondrial() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000899");
  }

  /**
   * An attribute describing a pseudogene where by an mRNA was retrotransposed. The mRNA sequence is transcribed back into the genome, lacking introns and promotors, but often including a polyA tail. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000900)
   */
  public static Resource processed() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000900");
  }

  /**
   * An attribute describing a pseudogene that was created by tandem duplication and unequal crossing over during recombination. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000901)
   */
  public static Resource unequally_crossed_over() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000901");
  }

  /**
   * A transgene is a gene that has been transferred naturally or by any of a number of genetic engineering techniques from one organism to another. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000902)
   */
  public static Resource transgene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000902");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000903)
   */
  public static Resource endogenous_retroviral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000903");
  }

  /**
   * An attribute to describe the sequence of a feature, where the DNA is rearranged. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000904)
   */
  public static Resource rearranged_at_DNA_level() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000904");
  }

  /**
   * An attribute describing the status of a feature, based on the available evidence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000905)
   */
  public static Resource status() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000905");
  }

  /**
   * Attribute to describe a feature that is independently known - not predicted. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000906)
   */
  public static Resource independently_known() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000906");
  }

  /**
   * An attribute to describe a feature that has been predicted using sequence similarity techniques. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000907)
   */
  public static Resource supported_by_sequence_similarity() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000907");
  }

  /**
   * An attribute to describe a feature that has been predicted using sequence similarity of a known domain. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000908)
   */
  public static Resource supported_by_domain_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000908");
  }

  /**
   * An attribute to describe a feature that has been predicted using sequence similarity to EST or cDNA data. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000909)
   */
  public static Resource supported_by_EST_or_cDNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000909");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000910)
   */
  public static Resource orphan() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000910");
  }

  /**
   * An attribute describing a feature that is predicted by a computer program that did not rely on sequence similarity. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000911)
   */
  public static Resource predicted_by_ab_initio_computation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000911");
  }

  /**
   * A motif of three consecutive residues and one H-bond in which: residue(i) is Aspartate or Asparagine (Asx), the side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2). (http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0000912)
   */
  public static Resource asx_turn() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000912");
  }

  /**
   * A clone insert made from cDNA. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000913)
   */
  public static Resource cloned_cDNA_insert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000913");
  }

  /**
   * A clone insert made from genomic DNA. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000914)
   */
  public static Resource cloned_genomic_insert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000914");
  }

  /**
   * A clone insert that is engineered. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000915)
   */
  public static Resource engineered_insert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000915");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000916)
   */
  public static Resource edit_operation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000916");
  }

  /**
   * An edit to insert a U. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000917)
   */
  public static Resource insert_U() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000917");
  }

  /**
   * An edit to delete a uridine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000918)
   */
  public static Resource delete_U() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000918");
  }

  /**
   * An edit to substitute an I for an A. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000919)
   */
  public static Resource substitute_A_to_I() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000919");
  }

  /**
   * An edit to insert a cytidine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000920)
   */
  public static Resource insert_C() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000920");
  }

  /**
   * An edit to insert a dinucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000921)
   */
  public static Resource insert_dinucleotide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000921");
  }

  /**
   * An edit to substitute an U for a C. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000922)
   */
  public static Resource substitute_C_to_U() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000922");
  }

  /**
   * An edit to insert a G. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000923)
   */
  public static Resource insert_G() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000923");
  }

  /**
   * An edit to insert a GC dinucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000924)
   */
  public static Resource insert_GC() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000924");
  }

  /**
   * An edit to insert a GU dinucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000925)
   */
  public static Resource insert_GU() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000925");
  }

  /**
   * An edit to insert a CU dinucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000926)
   */
  public static Resource insert_CU() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000926");
  }

  /**
   * An edit to insert a AU dinucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000927)
   */
  public static Resource insert_AU() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000927");
  }

  /**
   * An edit to insert a AA dinucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000928)
   */
  public static Resource insert_AA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000928");
  }

  /**
   * An mRNA that is edited. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000929)
   */
  public static Resource edited_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000929");
  }

  /**
   * A region of guide RNA. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000930)
   */
  public static Resource guide_RNA_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000930");
  }

  /**
   * A region of a guide_RNA that base-pairs to a target mRNA. (SO:jk)
   * (http://purl.obolibrary.org/obo/SO_0000931)
   */
  public static Resource anchor_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000931");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000932)
   */
  public static Resource pre_edited_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000932");
  }

  /**
   * An attribute to describe a feature between stages of processing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000933)
   */
  public static Resource intermediate() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000933");
  }

  /**
   * A miRNA target site is a binding site where the molecule is a micro RNA. (FB:cds)
   * (http://purl.obolibrary.org/obo/SO_0000934)
   */
  public static Resource miRNA_target_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000934");
  }

  /**
   * A CDS that is edited. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000935)
   */
  public static Resource edited_CDS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000935");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000936)
   */
  public static Resource vertebrate_immunoglobulin_T_cell_receptor_rearranged_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000936");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000937)
   */
  public static Resource vertebrate_immune_system_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000937");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000938)
   */
  public static Resource vertebrate_immunoglobulin_T_cell_receptor_rearranged_gene_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000938");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000939)
   */
  public static Resource vertebrate_immune_system_gene_recombination_signal_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000939");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000940)
   */
  public static Resource recombinationally_rearranged() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000940");
  }

  /**
   * A recombinationally rearranged gene of the vertebrate immune system. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0000941)
   */
  public static Resource recombinationally_rearranged_vertebrate_immune_system_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000941");
  }

  /**
   * An integration/excision site of a phage chromosome at which a recombinase acts to insert the phage DNA at a cognate integration/excision site on a bacterial chromosome. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000942)
   */
  public static Resource attP_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000942");
  }

  /**
   * An integration/excision site of a bacterial chromosome at which a recombinase acts to insert foreign DNA containing a cognate integration/excision site. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000943)
   */
  public static Resource attB_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000943");
  }

  /**
   * A region that results from recombination between attP_site and attB_site, composed of the 5" portion of attB_site and the 3" portion of attP_site. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000944)
   */
  public static Resource attL_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000944");
  }

  /**
   * A region that results from recombination between attP_site and attB_site, composed of the 5" portion of attP_site and the 3" portion of attB_site. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000945)
   */
  public static Resource attR_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000945");
  }

  /**
   * A region specifically recognised by a recombinase, which inserts or removes another region marked by a distinct cognate integration/excision site. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000946)
   */
  public static Resource integration_excision_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000946");
  }

  /**
   * A region specifically recognised by a recombinase, which separates a physically contiguous circle of DNA into two physically separate circles. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000947)
   */
  public static Resource resolution_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000947");
  }

  /**
   * A region specifically recognised by a recombinase, which inverts the region flanked by a pair of sites. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000948)
   */
  public static Resource inversion_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000948");
  }

  /**
   * A site at which replicated bacterial circular chromosomes are decatenated by site specific resolvase. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000949)
   */
  public static Resource dif_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000949");
  }

  /**
   * An attC site is a sequence required for the integration of a DNA of an integron. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000950)
   */
  public static Resource attC_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000950");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000951)
   */
  public static Resource eukaryotic_terminator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000951");
  }

  /**
   * An origin of vegetative replication in plasmids and phages. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000952)
   */
  public static Resource oriV() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000952");
  }

  /**
   * An origin of bacterial chromosome replication. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000953)
   */
  public static Resource oriC() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000953");
  }

  /**
   * Structural unit composed of a self-replicating, DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000954)
   */
  public static Resource DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000954");
  }

  /**
   * Structural unit composed of a self-replicating, double-stranded DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000955)
   */
  public static Resource double_stranded_DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000955");
  }

  /**
   * Structural unit composed of a self-replicating, single-stranded DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000956)
   */
  public static Resource single_stranded_DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000956");
  }

  /**
   * Structural unit composed of a self-replicating, double-stranded, linear DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000957)
   */
  public static Resource linear_double_stranded_DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000957");
  }

  /**
   * Structural unit composed of a self-replicating, double-stranded, circular DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000958)
   */
  public static Resource circular_double_stranded_DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000958");
  }

  /**
   * Structural unit composed of a self-replicating, single-stranded, linear DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000959)
   */
  public static Resource linear_single_stranded_DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000959");
  }

  /**
   * Structural unit composed of a self-replicating, single-stranded, circular DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000960)
   */
  public static Resource circular_single_stranded_DNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000960");
  }

  /**
   * Structural unit composed of a self-replicating, RNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000961)
   */
  public static Resource RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000961");
  }

  /**
   * Structural unit composed of a self-replicating, single-stranded RNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000962)
   */
  public static Resource single_stranded_RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000962");
  }

  /**
   * Structural unit composed of a self-replicating, single-stranded, linear RNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000963)
   */
  public static Resource linear_single_stranded_RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000963");
  }

  /**
   * Structural unit composed of a self-replicating, double-stranded, linear RNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000964)
   */
  public static Resource linear_double_stranded_RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000964");
  }

  /**
   * Structural unit composed of a self-replicating, double-stranded RNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000965)
   */
  public static Resource double_stranded_RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000965");
  }

  /**
   * Structural unit composed of a self-replicating, single-stranded, circular DNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000966)
   */
  public static Resource circular_single_stranded_RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000966");
  }

  /**
   * Structural unit composed of a self-replicating, double-stranded, circular RNA molecule. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000967)
   */
  public static Resource circular_double_stranded_RNA_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000967");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000968)
   */
  public static Resource sequence_replication_mode() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000968");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000969)
   */
  public static Resource rolling_circle() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000969");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000970)
   */
  public static Resource theta_replication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000970");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000971)
   */
  public static Resource DNA_replication_mode() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000971");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000972)
   */
  public static Resource RNA_replication_mode() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000972");
  }

  /**
   * A terminal_inverted_repeat_element that is bacterial and only encodes the functions required for its transposition between these inverted repeats. (SO:as)
   * (http://purl.obolibrary.org/obo/SO_0000973)
   */
  public static Resource insertion_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000973");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000975)
   */
  public static Resource minicircle_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000975");
  }

  /**
   * A feature_attribute describing a feature that is not manifest under normal conditions. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000976)
   */
  public static Resource cryptic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000976");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000977)
   */
  public static Resource anchor_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000977");
  }

  /**
   * A region of a guide_RNA that specifies the insertions and deletions of bases in the editing of a target mRNA. (SO:jk)
   * (http://purl.obolibrary.org/obo/SO_0000978)
   */
  public static Resource template_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000978");
  }

  /**
   * A non-protein_coding gene that encodes a guide_RNA. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0000979)
   */
  public static Resource gRNA_encoding() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000979");
  }

  /**
   * A minicircle is a replicon, part of a kinetoplast, that encodes for guide RNAs. (PMID:8395055)
   * (http://purl.obolibrary.org/obo/SO_0000980)
   */
  public static Resource minicircle() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000980");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000981)
   */
  public static Resource rho_dependent_bacterial_terminator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000981");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000982)
   */
  public static Resource rho_independent_bacterial_terminator() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000982");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000983)
   */
  public static Resource strand_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000983");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000984)
   */
  public static Resource single() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000984");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000985)
   */
  public static Resource _double_() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000985");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000986)
   */
  public static Resource topology_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000986");
  }

  /**
   * A quality of a nucleotide polymer that has a 3"-terminal residue and a 5"-terminal residue. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000987)
   */
  public static Resource linear() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000987");
  }

  /**
   * A quality of a nucleotide polymer that has no terminal nucleotide residues. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0000988)
   */
  public static Resource circular() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000988");
  }

  /**
   * Small non-coding RNA (59-60 nt long) containing 5" and 3" ends that are predicted to come together to form a stem structure. Identified in the social amoeba Dictyostelium discoideum and localized in the cytoplasm. (PMID:15333696)
   * (http://purl.obolibrary.org/obo/SO_0000989)
   */
  public static Resource class_II_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000989");
  }

  /**
   * Small non-coding RNA (55-65 nt long) containing highly conserved 5" and 3" ends (16 and 8 nt, respectively) that are predicted to come together to form a stem structure. Identified in the social amoeba Dictyostelium discoideum and localized in the cytoplasm. (PMID:15333696)
   * (http://purl.obolibrary.org/obo/SO_0000990)
   */
  public static Resource class_I_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000990");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000991)
   */
  public static Resource genomic_DNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000991");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000992)
   */
  public static Resource BAC_cloned_genomic_insert() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000992");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000993)
   */
  public static Resource consensus() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000993");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000994)
   */
  public static Resource consensus_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000994");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000995)
   */
  public static Resource consensus_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000995");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000996)
   */
  public static Resource predicted_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000996");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0000997)
   */
  public static Resource gene_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000997");
  }

  /**
   * A recursive splice site is a splice site which subdivides a large intron. Recursive splicing is a mechanism that splices large introns by sub dividing the intron at non exonic elements and alternate exons. (http://www.genetics.org/cgi/content/full/170/2/661)
   * (http://purl.obolibrary.org/obo/SO_0000998)
   */
  public static Resource recursive_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000998");
  }

  /**
   * A region of sequence from the end of a BAC clone that may provide a highly specific marker. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0000999)
   */
  public static Resource BAC_end() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0000999");
  }

  /**
   * A large polynucleotide in Bacteria and Archaea, which functions as the small subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001000)
   */
  public static Resource rRNA_16S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001000");
  }

  /**
   * A large polynucleotide in Bacteria and Archaea, which functions as the large subunit of the ribosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001001)
   */
  public static Resource rRNA_23S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001001");
  }

  /**
   * A large polynucleotide which functions as part of the large subunit of the ribosome in some eukaryotes. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001002)
   */
  public static Resource rRNA_25S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001002");
  }

  /**
   * A recombination product between the 2 LTR of the same element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001003)
   */
  public static Resource solo_LTR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001003");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001004)
   */
  public static Resource low_complexity() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001004");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001005)
   */
  public static Resource low_complexity_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001005");
  }

  /**
   * A phage genome after it has established in the host genome in a latent/immune state either as a plasmid or as an integrated \"island\". (GOC:jl)
   * (http://purl.obolibrary.org/obo/SO_0001006)
   */
  public static Resource prophage() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001006");
  }

  /**
   * A remnant of an integrated prophage in the host genome or an \"island\" in the host genome that includes phage like-genes. (GOC:jl)
   * (http://purl.obolibrary.org/obo/SO_0001007)
   */
  public static Resource cryptic_prophage() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001007");
  }

  /**
   * A base-paired stem with loop of 4 non-hydrogen bonded nucleotides. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001008)
   */
  public static Resource tetraloop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001008");
  }

  /**
   * A double-stranded DNA used to control macromolecular structure and function. (http:/www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=search&db=pubmed&term=SILVERMAN+SK[au\]&dispmax=50)
   * (http://purl.obolibrary.org/obo/SO_0001009)
   */
  public static Resource DNA_constraint_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001009");
  }

  /**
   * A cytosine rich domain whereby strands associate both inter- and intramolecularly at moderately acidic pH. (PMID:9753739)
   * (http://purl.obolibrary.org/obo/SO_0001010)
   */
  public static Resource i_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001010");
  }

  /**
   * Peptide nucleic acid, is a chemical not known to occur naturally but is artificially synthesized and used in some biological research and medical treatments. The PNA backbone is composed of repeating N-(2-aminoethyl)-glycine units linked by peptide bonds. The purine and pyrimidine bases are linked to the backbone by methylene carbonyl bonds. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001011)
   */
  public static Resource PNA_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001011");
  }

  /**
   * A DNA sequence with catalytic activity. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001012)
   */
  public static Resource DNAzyme() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001012");
  }

  /**
   * A multiple nucleotide polymorphism with alleles of common length > 1, for example AAA/TTT. (http://www.ncbi.nlm.nih.gov/SNP/snp_ref.cgi?rs=rs2067431)
   * (http://purl.obolibrary.org/obo/SO_0001013)
   */
  public static Resource MNP() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001013");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001014)
   */
  public static Resource intron_domain() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001014");
  }

  /**
   * A type of non-canonical base pairing, most commonly between G and U, which is important for the secondary structure of RNAs. It has similar thermodynamic stability to the Watson-Crick pairing. Wobble base pairs only have two hydrogen bonds. Other wobble base pair possibilities are I-A, I-U and I-C. (PMID:11256617)
   * (http://purl.obolibrary.org/obo/SO_0001015)
   */
  public static Resource wobble_base_pair() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001015");
  }

  /**
   * A purine-rich sequence in the group I introns which determines the locations of the splice sites in group I intron splicing and has catalytic activity. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001016)
   */
  public static Resource internal_guide_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001016");
  }

  /**
   * A sequence variant that does not affect protein function. Silent mutations may occur in genic ( CDS, UTR, intron etc) and intergenic regions. Silent mutations may have affects on processes such as splicing and regulation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001017)
   */
  public static Resource silent_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001017");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with antibodies, B cells or T cells. (http://en.wikipedia.org/wiki/Epitope, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001018)
   */
  public static Resource epitope() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001018");
  }

  /**
   * A variation that increases or decreases the copy number of a given region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001019)
   */
  public static Resource copy_number_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001019");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001020)
   */
  public static Resource sequence_variant_affecting_copy_number() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001020");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001021)
   */
  public static Resource chromosome_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001021");
  }

  /**
   * The point within a chromosome where an inversion begins or ends. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001022)
   */
  public static Resource inversion_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001022");
  }

  /**
   * An allele is one of a set of coexisting sequence variants of a gene. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0001023)
   */
  public static Resource allele() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001023");
  }

  /**
   * A haplotype is one of a set of coexisting sequence variants of a haplotype block. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0001024)
   */
  public static Resource haplotype() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001024");
  }

  /**
   * A sequence variant that is segregating in one or more natural populations of a species. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0001025)
   */
  public static Resource polymorphic_sequence_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001025");
  }

  /**
   * A genome is the sum of genetic material within a cell or virion. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0001026)
   */
  public static Resource genome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001026");
  }

  /**
   * A genotype is a variant genome, complete or incomplete. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0001027)
   */
  public static Resource genotype() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001027");
  }

  /**
   * A diplotype is a pair of haplotypes from a given individual. It is a genotype where the phase is known. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_0001028)
   */
  public static Resource diplotype() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001028");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001029)
   */
  public static Resource direction_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001029");
  }

  /**
   * Forward is an attribute of the feature, where the feature is in the 5" to 3" direction. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001030)
   */
  public static Resource forward() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001030");
  }

  /**
   * Reverse is an attribute of the feature, where the feature is in the 3" to 5" direction. Again could be applied to primer. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001031)
   */
  public static Resource reverse() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001031");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001032)
   */
  public static Resource mitochondrial_DNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001032");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001033)
   */
  public static Resource chloroplast_DNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001033");
  }

  /**
   * A de-branched intron which mimics the structure of pre-miRNA and enters the miRNA processing pathway without Drosha mediated cleavage. (PMID:17589500, SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0001034)
   */
  public static Resource mirtron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001034");
  }

  /**
   * A small non coding RNA, part of a silencing system that prevents the spreading of selfish genetic elements. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001035)
   */
  public static Resource piRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001035");
  }

  /**
   * A tRNA sequence that has an arginine anticodon, and a 3" arginine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001036)
   */
  public static Resource arginyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001036");
  }

  /**
   * A nucleotide region with either intra-genome or intracellular moblity, of varying length, which often carry the information necessary for transfer and recombination with the host genome. (PMID:14681355)
   * (http://purl.obolibrary.org/obo/SO_0001037)
   */
  public static Resource mobile_genetic_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001037");
  }

  /**
   * An MGE that is not integrated into the host chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001038)
   */
  public static Resource extrachromosomal_mobile_genetic_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001038");
  }

  /**
   * An MGE that is integrated into the host chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001039)
   */
  public static Resource integrated_mobile_genetic_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001039");
  }

  /**
   * A plasmid sequence that is integrated within the host chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001040)
   */
  public static Resource integrated_plasmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001040");
  }

  /**
   * The region of nucleotide sequence of a virus, a submicroscopic particle that replicates by infecting a host cell. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001041)
   */
  public static Resource viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001041");
  }

  /**
   * The nucleotide sequence of a virus that infects bacteria. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001042)
   */
  public static Resource phage_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001042");
  }

  /**
   * An attachment site located on a conjugative transposon and used for site-specific integration of a conjugative transposon. (Phigo:at)
   * (http://purl.obolibrary.org/obo/SO_0001043)
   */
  public static Resource attCtn_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001043");
  }

  /**
   * A nuclear pseudogene of either coding or non-coding mitochondria derived sequence. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001044)
   */
  public static Resource nuclear_mt_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001044");
  }

  /**
   * A MGE region consisting of two fused plasmids resulting from a replicative transposition event. (phigo:at)
   * (http://purl.obolibrary.org/obo/SO_0001045)
   */
  public static Resource cointegrated_plasmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001045");
  }

  /**
   * Component of the inversion site located at the left of a region susceptible to site-specific inversion. (Phigo:at)
   * (http://purl.obolibrary.org/obo/SO_0001046)
   */
  public static Resource IRLinv_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001046");
  }

  /**
   * Component of the inversion site located at the right of a region susceptible to site-specific inversion. (Phigo:at)
   * (http://purl.obolibrary.org/obo/SO_0001047)
   */
  public static Resource IRRinv_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001047");
  }

  /**
   * A region located within an inversion site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001048)
   */
  public static Resource inversion_site_part() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001048");
  }

  /**
   * An island that contains genes for integration/excision and the gene and site for the initiation of intercellular transfer by conjugation. It can be complemented for transfer by a conjugative transposon. (Phigo:ariane)
   * (http://purl.obolibrary.org/obo/SO_0001049)
   */
  public static Resource defective_conjugative_transposon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001049");
  }

  /**
   * A portion of a repeat, interrupted by the insertion of another element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001050)
   */
  public static Resource repeat_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001050");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001051)
   */
  public static Resource nested_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001051");
  }

  /**
   * Either:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0001052)
   * Or:
   *   A repeat that is disrupted by the insertion of another element. (SO:ke)
   *   (http://purl.obolibrary.org/obo/SO_0001649)
   */
  public static Set<Resource> nested_repeat() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0001052"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0001649") }));
  }

  /**
   * Either:
   *   -- No comment or description provided. --
   *   (http://purl.obolibrary.org/obo/SO_0001053)
   * Or:
   *   A transposon that is disrupted by the insertion of another element. (SO:ke)
   *   (http://purl.obolibrary.org/obo/SO_0001648)
   */
  public static Set<Resource> nested_transposon() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SO("http://purl.obolibrary.org/obo/SO_0001053"), _namespace_SO("http://purl.obolibrary.org/obo/SO_0001648") }));
  }

  /**
   * A portion of a transposon, interrupted by the insertion of another element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001054)
   */
  public static Resource transposon_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001054");
  }

  /**
   * A regulatory_region that modulates the transcription of a gene or genes. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0001055)
   */
  public static Resource transcriptional_cis_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001055");
  }

  /**
   * A regulatory_region that modulates splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001056)
   */
  public static Resource splicing_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001056");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001057)
   */
  public static Resource enhanceosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001057");
  }

  /**
   * A transcriptional_cis_regulatory_region that restricts the activity of a CRM to a single promoter and which functions only when both itself and an insulator are located between the CRM and the promoter. (SO:regcreative)
   * (http://purl.obolibrary.org/obo/SO_0001058)
   */
  public static Resource promoter_targeting_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001058");
  }

  /**
   * A sequence_alteration is a sequence_feature whose extent is the deviation from another sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001059)
   */
  public static Resource sequence_alteration() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001059");
  }

  /**
   * A sequence_variant is a non exact copy of a sequence_feature or genome exhibiting one or more sequence_alteration. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001060)
   */
  public static Resource sequence_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001060");
  }

  /**
   * The propeptide_cleavage_site is the arginine/lysine boundary on a propeptide where cleavage occurs. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001061)
   */
  public static Resource propeptide_cleavage_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001061");
  }

  /**
   * Part of a peptide chain which is cleaved off during the formation of the mature protein. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001062)
   */
  public static Resource propeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001062");
  }

  /**
   * An immature_peptide_region is the extent of the peptide after it has been translated and before any processing occurs. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001063)
   */
  public static Resource immature_peptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001063");
  }

  /**
   * Active peptides are proteins which are biologically active, released from a precursor molecule. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001064)
   */
  public static Resource active_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001064");
  }

  /**
   * Polypeptide region that is rich in a particular amino acid or homopolymeric and greater than three residues in length. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001066)
   */
  public static Resource compositionally_biased_region_of_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001066");
  }

  /**
   * A sequence motif is a short (up to 20 amino acids) region of biological interest. Such motifs, although they are too short to constitute functional domains, share sequence similarities and are conserved in different proteins. They display a common function (protein-binding, subcellular location etc.). (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001067)
   */
  public static Resource polypeptide_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001067");
  }

  /**
   * A polypeptide_repeat is a single copy of an internal sequence repetition. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001068)
   */
  public static Resource polypeptide_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001068");
  }

  /**
   * Region of polypeptide with a given structural property. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001070)
   */
  public static Resource polypeptide_structural_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001070");
  }

  /**
   * Arrangement of the polypeptide with respect to the lipid bilayer. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001071)
   */
  public static Resource membrane_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001071");
  }

  /**
   * Polypeptide region that is localized outside of a lipid bilayer. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001072)
   */
  public static Resource extramembrane_polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001072");
  }

  /**
   * Polypeptide region that is localized inside the cytoplasm. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001073)
   */
  public static Resource cytoplasmic_polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001073");
  }

  /**
   * Polypeptide region that is localized outside of a lipid bilayer and outside of the cytoplasm. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001074)
   */
  public static Resource non_cytoplasmic_polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001074");
  }

  /**
   * Polypeptide region present in the lipid bilayer. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001075)
   */
  public static Resource intramembrane_polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001075");
  }

  /**
   * Polypeptide region localized within the lipid bilayer where both ends traverse the same membrane. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001076)
   */
  public static Resource membrane_peptide_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001076");
  }

  /**
   * Polypeptide region traversing the lipid bilayer. (EBIBS:GAR, UniProt:curator_manual)
   * (http://purl.obolibrary.org/obo/SO_0001077)
   */
  public static Resource transmembrane_polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001077");
  }

  /**
   * A region of peptide with secondary structure has hydrogen bonding along the peptide chain that causes a defined conformation of the chain. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001078)
   */
  public static Resource polypeptide_secondary_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001078");
  }

  /**
   * Motif is a three-dimensional structural element within the chain, which appears also in a variety of other molecules. Unlike a domain, a motif does not need to form a stable globular unit. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001079)
   */
  public static Resource polypeptide_structural_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001079");
  }

  /**
   * A coiled coil is a structural motif in proteins, in which alpha-helices are coiled together like the strands of a rope. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001080)
   */
  public static Resource coiled_coil() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001080");
  }

  /**
   * A motif comprising two helices separated by a turn. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001081)
   */
  public static Resource helix_turn_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001081");
  }

  /**
   * Incompatibility in the sequence due to some experimental problem. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001082)
   */
  public static Resource polypeptide_sequencing_information() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001082");
  }

  /**
   * Indicates that two consecutive residues in a fragment sequence are not consecutive in the full-length protein and that there are a number of unsequenced residues between them. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001083)
   */
  public static Resource non_adjacent_residues() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001083");
  }

  /**
   * The residue at an extremity of the sequence is not the terminal residue. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001084)
   */
  public static Resource non_terminal_residue() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001084");
  }

  /**
   * Different sources report differing sequences. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001085)
   */
  public static Resource sequence_conflict() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001085");
  }

  /**
   * Describes the positions in a sequence where the authors are unsure about the sequence assignment. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001086)
   */
  public static Resource sequence_uncertainty() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001086");
  }

  /**
   * Posttranslationally formed amino acid bonds. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001087)
   */
  public static Resource cross_link() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001087");
  }

  /**
   * The covalent bond between sulfur atoms that binds two peptide chains or different parts of one peptide chain and is a structural determinant in many protein molecules. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001088)
   */
  public static Resource disulfide_bond() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001088");
  }

  /**
   * A region where a transformation occurs in a protein after it has been synthesized. This which may regulate, stabilize, crosslink or introduce new chemical functionalities in the protein. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001089)
   */
  public static Resource post_translationally_modified_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001089");
  }

  /**
   * Binding involving a covalent bond. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001090)
   */
  public static Resource covalent_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001090");
  }

  /**
   * Binding site for any chemical group (co-enzyme, prosthetic group, etc.). (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001091)
   */
  public static Resource non_covalent_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001091");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with metal ions. (EBIBS:GAR, SO:cb, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001092)
   */
  public static Resource polypeptide_metal_contact() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001092");
  }

  /**
   * A binding site that, in the protein molecule, interacts selectively and non-covalently with polypeptide residues. (EBIBS:GAR, UniProt:Curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001093)
   */
  public static Resource protein_protein_contact() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001093");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with calcium ions. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001094)
   */
  public static Resource polypeptide_calcium_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001094");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with cobalt ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001095)
   */
  public static Resource polypeptide_cobalt_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001095");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with copper ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001096)
   */
  public static Resource polypeptide_copper_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001096");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with iron ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001097)
   */
  public static Resource polypeptide_iron_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001097");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with magnesium ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001098)
   */
  public static Resource polypeptide_magnesium_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001098");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with manganese ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001099)
   */
  public static Resource polypeptide_manganese_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001099");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with molybdenum ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001100)
   */
  public static Resource polypeptide_molybdenum_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001100");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with nickel ions. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001101)
   */
  public static Resource polypeptide_nickel_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001101");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with tungsten ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001102)
   */
  public static Resource polypeptide_tungsten_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001102");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with zinc ions. (EBIBS:GAR, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001103)
   */
  public static Resource polypeptide_zinc_ion_contact_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001103");
  }

  /**
   * Amino acid involved in the activity of an enzyme. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001104)
   */
  public static Resource catalytic_residue() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001104");
  }

  /**
   * Residues which interact with a ligand. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001105)
   */
  public static Resource polypeptide_ligand_contact() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001105");
  }

  /**
   * A motif of five consecutive residues and two H-bonds in which: Residue(i) is Aspartate or Asparagine (Asx), side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2) or (i+3), main-chain CO of residue(i) is H-bonded to the main-chain NH of residue(i+3) or (i+4). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001106)
   */
  public static Resource asx_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001106");
  }

  /**
   * A motif of three residues within a beta-sheet in which the main chains of two consecutive residues are H-bonded to that of the third, and in which the dihedral angles are as follows: Residue(i): -140 degrees < phi(l) -20 degrees , -90 degrees < psi(l) < 40 degrees. Residue (i+1): -180 degrees < phi < -25 degrees or +120 degrees < phi < +180 degrees, +40 degrees < psi < +180 degrees or -180 degrees < psi < -120 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001107)
   */
  public static Resource beta_bulge() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001107");
  }

  /**
   * A motif of three residues within a beta-sheet consisting of two H-bonds. Beta bulge loops often occur at the loop ends of beta-hairpins. (EBIBS:GAR, Http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001108)
   */
  public static Resource beta_bulge_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001108");
  }

  /**
   * A motif of three residues within a beta-sheet consisting of two H-bonds in which: the main-chain NH of residue(i) is H-bonded to the main-chain CO of residue(i+4), the main-chain CO of residue i is H-bonded to the main-chain NH of residue(i+3), these loops have an RL nest at residues i+2 and i+3. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001109)
   */
  public static Resource beta_bulge_loop_five() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001109");
  }

  /**
   * A motif of three residues within a beta-sheet consisting of two H-bonds in which: the main-chain NH of residue(i) is H-bonded to the main-chain CO of residue(i+5), the main-chain CO of residue i is H-bonded to the main-chain NH of residue(i+4), these loops have an RL nest at residues i+3 and i+4. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001110)
   */
  public static Resource beta_bulge_loop_six() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001110");
  }

  /**
   * A beta strand describes a single length of polypeptide chain that forms part of a beta sheet. A single continuous stretch of amino acids adopting an extended conformation of hydrogen bonds between the N-O and the C=O of another part of the peptide. This forms a secondary protein structure in which two or more extended polypeptide regions are hydrogen-bonded to one another in a planar array. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001111)
   */
  public static Resource beta_strand() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001111");
  }

  /**
   * A peptide region which hydrogen bonded to another region of peptide running in the oposite direction (one running N-terminal to C-terminal and one running C-terminal to N-terminal). Hydrogen bonding occurs between every other C=O from one strand to every other N-H on the adjacent strand. In this case, if two atoms C-alpha (i) and C-alpha (j) are adjacent in two hydrogen-bonded beta strands, then they form two mutual backbone hydrogen bonds to each other"s flanking peptide groups; this is known as a close pair of hydrogen bonds. The peptide backbone dihedral angles (phi, psi) are about (-140 degrees, 135 degrees) in antiparallel sheets. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001112)
   */
  public static Resource antiparallel_beta_strand() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001112");
  }

  /**
   * A peptide region which hydrogen bonded to another region of peptide running in the oposite direction (both running N-terminal to C-terminal). This orientation is slightly less stable because it introduces nonplanarity in the inter-strand hydrogen bonding pattern. Hydrogen bonding occurs between every other C=O from one strand to every other N-H on the adjacent strand. In this case, if two atoms C-alpha (i)and C-alpha (j) are adjacent in two hydrogen-bonded beta strands, then they do not hydrogen bond to each other; rather, one residue forms hydrogen bonds to the residues that flank the other (but not vice versa). For example, residue i may form hydrogen bonds to residues j - 1 and j + 1; this is known as a wide pair of hydrogen bonds. By contrast, residue j may hydrogen-bond to different residues altogether, or to none at all. The dihedral angles (phi, psi) are about (-120 degrees, 115 degrees) in parallel sheets. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001113)
   */
  public static Resource parallel_beta_strand() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001113");
  }

  /**
   * A helix is a secondary_structure conformation where the peptide backbone forms a coil. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001114)
   */
  public static Resource peptide_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001114");
  }

  /**
   * A left handed helix is a region of peptide where the coiled conformation turns in an anticlockwise, left handed screw. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001115)
   */
  public static Resource left_handed_peptide_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001115");
  }

  /**
   * A right handed helix is a region of peptide where the coiled conformation turns in a clockwise, right handed screw. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001116)
   */
  public static Resource right_handed_peptide_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001116");
  }

  /**
   * The helix has 3.6 residues per turn which corersponds to a translation of 1.5 angstroms (= 0.15 nm) along the helical axis. Every backbone N-H group donates a hydrogen bond to the backbone C=O group of the amino acid four residues earlier. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001117)
   */
  public static Resource alpha_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001117");
  }

  /**
   * The pi helix has 4.1 residues per turn and a translation of 1.15  (=0.115 nm) along the helical axis. The N-H group of an amino acid forms a hydrogen bond with the C=O group of the amino acid five residues earlier. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001118)
   */
  public static Resource pi_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001118");
  }

  /**
   * The 3-10 helix has 3 residues per turn with a translation of 2.0 angstroms (=0.2 nm) along the helical axis. The N-H group of an amino acid forms a hydrogen bond with the C=O group of the amino acid three residues earlier. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0001119)
   */
  public static Resource three_ten_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001119");
  }

  /**
   * A motif of two consecutive residues with dihedral angles. Nest should not have Proline as any residue. Nests frequently occur as parts of other motifs such as Schellman loops. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001120)
   */
  public static Resource polypeptide_nest_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001120");
  }

  /**
   * A motif of two consecutive residues with dihedral angles: Residue(i): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001121)
   */
  public static Resource polypeptide_nest_left_right_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001121");
  }

  /**
   * A motif of two consecutive residues with dihedral angles: Residue(i): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. Residue(i+1): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001122)
   */
  public static Resource polypeptide_nest_right_left_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001122");
  }

  /**
   * A motif of six or seven consecutive residues that contains two H-bonds. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001123)
   */
  public static Resource schellmann_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001123");
  }

  /**
   * Wild type: A motif of seven consecutive residues that contains two H-bonds in which: the main-chain CO of residue(i) is H-bonded to the main-chain NH of residue(i+6), the main-chain CO of residue(i+1) is H-bonded to the main-chain NH of residue(i+5). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001124)
   */
  public static Resource schellmann_loop_seven() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001124");
  }

  /**
   * Common Type: A motif of six consecutive residues that contains two H-bonds in which: the main-chain CO of residue(i) is H-bonded to the main-chain NH of residue(i+5) the main-chain CO of residue(i+1) is H-bonded to the main-chain NH of residue(i+4). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001125)
   */
  public static Resource schellmann_loop_six() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001125");
  }

  /**
   * A motif of five consecutive residues and two hydrogen bonds in which: residue(i) is Serine (S) or Threonine (T), the side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2) or (i+3) , the main-chain CO group of residue(i) is H-bonded to the main-chain NH of residue(i+3) or (i+4). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001126)
   */
  public static Resource serine_threonine_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001126");
  }

  /**
   * A motif of four or five consecutive residues and one H-bond in which: residue(i) is Serine (S) or Threonine (T), the side-chain OH of residue(i) is H-bonded to the main-chain CO of residue(i3) or (i4), Phi angles of residues(i1), (i2) and (i3) are negative. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001127)
   */
  public static Resource serine_threonine_staple_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001127");
  }

  /**
   * A reversal in the direction of the backbone of a protein that is stabilized by hydrogen bond between backbone NH and CO groups, involving no more than 4 amino acid residues. (EBIBS:GAR, uniprot:feature_type)
   * (http://purl.obolibrary.org/obo/SO_0001128)
   */
  public static Resource polypeptide_turn_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001128");
  }

  /**
   * Left handed type I (dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, -90 degrees < psi +120 degrees < +40 degrees. Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001129)
   */
  public static Resource asx_turn_left_handed_type_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001129");
  }

  /**
   * Left handed type II (dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, +80 degrees < psi +120 degrees < +180 degrees. Residue(i+1): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001130)
   */
  public static Resource asx_turn_left_handed_type_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001130");
  }

  /**
   * Right handed type II (dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, +80 degrees < psi +120 degrees < +180 degrees. Residue(i+1): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001131)
   */
  public static Resource asx_turn_right_handed_type_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001131");
  }

  /**
   * Right handed type I (dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, -90 degrees < psi +120 degrees < +40 degrees. Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001132)
   */
  public static Resource asx_turn_right_handed_type_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001132");
  }

  /**
   * A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles of the second and third residues, which are the basis for sub-categorization. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001133)
   */
  public static Resource beta_turn() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001133");
  }

  /**
   * Left handed type I:A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles:- Residue(i+1): -140 degrees > phi > -20 degrees, -90 degrees > psi > +40 degrees. Residue(i+2): -140 degrees > phi > -20 degrees, -90 degrees > psi > +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001134)
   */
  public static Resource beta_turn_left_handed_type_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001134");
  }

  /**
   * Left handed type II: A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles: Residue(i+1): -140 degrees > phi > -20 degrees, +80 degrees > psi > +180 degrees. Residue(i+2): +20 degrees > phi > +140 degrees, -40 degrees > psi > +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001135)
   */
  public static Resource beta_turn_left_handed_type_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001135");
  }

  /**
   * Right handed type I:A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles: Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. Residue(i+2): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001136)
   */
  public static Resource beta_turn_right_handed_type_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001136");
  }

  /**
   * Right handed type II:A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles: Residue(i+1): -140 degrees < phi < -20 degrees, +80 degrees < psi < +180 degrees. Residue(i+2): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001137)
   */
  public static Resource beta_turn_right_handed_type_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001137");
  }

  /**
   * Gamma turns, defined for 3 residues i,( i+1),( i+2) if a hydrogen bond exists between residues i and i+2 and the phi and psi angles of residue i+1 fall within 40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001138)
   */
  public static Resource gamma_turn() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001138");
  }

  /**
   * Gamma turns, defined for 3 residues i, i+1, i+2 if a hydrogen bond exists between residues i and i+2 and the phi and psi angles of residue i+1 fall within 40 degrees: phi(i+1)=75.0 - psi(i+1)=-64.0. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001139)
   */
  public static Resource gamma_turn_classic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001139");
  }

  /**
   * Gamma turns, defined for 3 residues i, i+1, i+2 if a hydrogen bond exists between residues i and i+2 and the phi and psi angles of residue i+1 fall within 40 degrees: phi(i+1)=-79.0 - psi(i+1)=69.0. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001140)
   */
  public static Resource gamma_turn_inverse() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001140");
  }

  /**
   * A motif of three consecutive residues and one H-bond in which: residue(i) is Serine (S) or Threonine (T), the side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001141)
   */
  public static Resource serine_threonine_turn() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001141");
  }

  /**
   * The peptide twists in an anticlockwise, left handed manner. The dihedral angles for this turn are: Residue(i): -140 degrees < chi(1) -120 degrees < -20 degrees, -90 degrees psi +120 degrees < +40 degrees, residue(i+1): -140 degrees < phi < -20 degrees, -90 < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001142)
   */
  public static Resource st_turn_left_handed_type_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001142");
  }

  /**
   * The peptide twists in an anticlockwise, left handed manner. The dihedral angles for this turn are: Residue(i): -140 degrees < chi(1) -120 degrees < -20 degrees, +80 degrees psi +120 degrees < +180 degrees, residue(i+1): +20 degrees < phi < +140 degrees, -40 < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001143)
   */
  public static Resource st_turn_left_handed_type_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001143");
  }

  /**
   * The peptide twists in an clockwise, right handed manner. The dihedral angles for this turn are: Residue(i): -140 degrees < chi(1) -120 degrees < -20 degrees, -90 degrees psi +120 degrees < +40 degrees, residue(i+1): -140 degrees < phi < -20 degrees, -90 < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001144)
   */
  public static Resource st_turn_right_handed_type_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001144");
  }

  /**
   * The peptide twists in an clockwise, right handed manner. The dihedral angles for this turn are: Residue(i): -140 degrees < chi(1) -120 degrees < -20 degrees, +80 degrees psi +120 degrees < +180 degrees, residue(i+1): +20 degrees < phi < +140 degrees, -40 < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0001145)
   */
  public static Resource st_turn_right_handed_type_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001145");
  }

  /**
   * A site of sequence variation (alteration). Alternative sequence due to naturally occuring events such as polymorphisms and altermatve splicing or experimental methods such as site directed mutagenesis. (EBIBS:GAR, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001146)
   */
  public static Resource polypeptide_variation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001146");
  }

  /**
   * Describes the natural sequence variants due to polymorphisms, disease-associated mutations, RNA editing and variations between strains, isolates or cultivars. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001147)
   */
  public static Resource natural_variant_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001147");
  }

  /**
   * Site which has been experimentally altered. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001148)
   */
  public static Resource mutated_variant_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001148");
  }

  /**
   * Description of sequence variants produced by alternative splicing, alternative promoter usage, alternative initiation and ribosomal frameshifting. (EBIBS:GAR, UniProt:curation_manual)
   * (http://purl.obolibrary.org/obo/SO_0001149)
   */
  public static Resource alternate_sequence_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001149");
  }

  /**
   * A motif of four consecutive peptide resides of type VIa or type VIb and where the i+2 residue is cis-proline. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001150)
   */
  public static Resource beta_turn_type_six() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001150");
  }

  /**
   * A motif of four consecutive peptide residues, of which the i+2 residue is proline, and that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth and is characterized by the dihedral angles: Residue(i+1): phi ~ -60 degrees, psi ~ 120 degrees. Residue(i+2): phi ~ -90 degrees, psi ~ 0 degrees. (PMID:2371257, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001151)
   */
  public static Resource beta_turn_type_six_a() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001151");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001152)
   */
  public static Resource beta_turn_type_six_a_one() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001152");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001153)
   */
  public static Resource beta_turn_type_six_a_two() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001153");
  }

  /**
   * A motif of four consecutive peptide residues, of which the i+2 residue is proline, and that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth and is characterized by the dihedral angles: Residue(i+1): phi ~ -120 degrees, psi ~ 120 degrees. Residue(i+2): phi ~ -60 degrees, psi ~ 0 degrees. (PMID:2371257, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001154)
   */
  public static Resource beta_turn_type_six_b() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001154");
  }

  /**
   * A motif of four consecutive peptide residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth and is characterized by the dihedral angles: Residue(i+1): phi ~ -60 degrees, psi ~ -30 degrees. Residue(i+2): phi ~ -120 degrees, psi ~ 120 degrees. (PMID:2371257, SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001155)
   */
  public static Resource beta_turn_type_eight() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001155");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, usually located between -10 and -60 relative to the TSS. Consensus sequence is WATCGATW. (PMID:12537576)
   * (http://purl.obolibrary.org/obo/SO_0001156)
   */
  public static Resource DRE_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001156");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, located immediately upstream of some TATA box elements with respect to the TSS (+1). Consensus sequence is YGGTCACACTR. Marked spatial preference within core promoter; tend to occur near the TSS, although not as tightly as INR (SO:0000014). (PMID:16827941:12537576)
   * (http://purl.obolibrary.org/obo/SO_0001157)
   */
  public static Resource DMv4_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001157");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, usually located between -60 and +1 relative to the TSS. Consensus sequence is AWCAGCTGWT. Tends to co-occur with DMv2 (SO:0001161). Tends to not occur with DPE motif (SO:0000015). (PMID:12537576:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001158)
   */
  public static Resource E_box_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001158");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, usually located between -50 and -10 relative to the TSS. Consensus sequence is KTYRGTATWTTT. Tends to co-occur with DMv4 (SO:0001157) . Tends to not occur with DPE motif (SO:0000015) or MTE (SO:0001162). (PMID:12537576:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001159)
   */
  public static Resource DMv5_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001159");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, usually located between -30 and +15 relative to the TSS. Consensus sequence is KNNCAKCNCTRNY. Tends to co-occur with DMv2 (SO:0001161). Tends to not occur with DPE motif (SO:0000015) or MTE (0001162). (PMID:12537576:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001160)
   */
  public static Resource DMv3_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001160");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, usually located between -60 and -45 relative to the TSS. Consensus sequence is MKSYGGCARCGSYSS. Tends to co-occur with DMv3 (SO:0001160). Tends to not occur with DPE motif (SO:0000015) or MTE (SO:0001162). (PMID:12537576:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001161)
   */
  public static Resource DMv2_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001161");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters, usually located between +20 and +30 relative to the TSS. Consensus sequence is CSARCSSAACGS. Tends to co-occur with INR motif (SO:0000014). Tends to not occur with DPE motif (SO:0000015) or DMv5 (SO:0001159). (PMID:12537576:15231738, PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0001162)
   */
  public static Resource MTE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001162");
  }

  /**
   * A promoter motif with consensus sequence TCATTCG. (PMID:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001163)
   */
  public static Resource INR1_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001163");
  }

  /**
   * A promoter motif with consensus sequence CGGACGT. (PMID:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001164)
   */
  public static Resource DPE1_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001164");
  }

  /**
   * A promoter motif with consensus sequence CARCCCT. (PMID:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001165)
   */
  public static Resource DMv1_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001165");
  }

  /**
   * A non directional promoter motif with consensus sequence GAGAGCG. (PMID:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001166)
   */
  public static Resource GAGA_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001166");
  }

  /**
   * A non directional promoter motif with consensus CGMYGYCR. (PMID:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001167)
   */
  public static Resource NDM2_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001167");
  }

  /**
   * A non directional promoter motif with consensus sequence GAAAGCT. (PMID:16827941)
   * (http://purl.obolibrary.org/obo/SO_0001168)
   */
  public static Resource NDM3_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001168");
  }

  /**
   * A ds_RNA_viral_sequence is a viral_sequence that is the sequence of a virus that exists as double stranded RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001169)
   */
  public static Resource ds_RNA_viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001169");
  }

  /**
   * A kind of DNA transposon that populates the genomes of protists, fungi, and animals, characterized by a unique set of proteins necessary for their transposition, including a protein-primed DNA polymerase B, retroviral integrase, cysteine protease, and ATPase. Polintons are characterized by 6-bp target site duplications, terminal-inverted repeats that are several hundred nucleotides long, and 5"-AG and TC-3" termini. Polintons exist as autonomous and nonautonomous elements. (PMID:16537396)
   * (http://purl.obolibrary.org/obo/SO_0001170)
   */
  public static Resource polinton() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001170");
  }

  /**
   * A component of the large ribosomal subunit in mitochondrial rRNA. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001171)
   */
  public static Resource rRNA_21S() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001171");
  }

  /**
   * A region of a tRNA. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001172)
   */
  public static Resource tRNA_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001172");
  }

  /**
   * A sequence of seven nucleotide bases in tRNA which contains the anticodon. It has the sequence 5"-pyrimidine-purine-anticodon-modified purine-any base-3. (ISBN:0716719207)
   * (http://purl.obolibrary.org/obo/SO_0001173)
   */
  public static Resource anticodon_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001173");
  }

  /**
   * A sequence of three nucleotide bases in tRNA which recognizes a codon in mRNA. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001174)
   */
  public static Resource anticodon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001174");
  }

  /**
   * Base sequence at the 3" end of a tRNA. The 3"-hydroxyl group on the terminal adenosine is the attachment point for the amino acid. (ISBN:0716719207)
   * (http://purl.obolibrary.org/obo/SO_0001175)
   */
  public static Resource CCA_tail() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001175");
  }

  /**
   * Non-base-paired sequence of nucleotide bases in tRNA. It contains several dihydrouracil residues. (ISBN:071671920)
   * (http://purl.obolibrary.org/obo/SO_0001176)
   */
  public static Resource DHU_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001176");
  }

  /**
   * Non-base-paired sequence of three nucleotide bases in tRNA. It has sequence T-Psi-C. (ISBN:0716719207)
   * (http://purl.obolibrary.org/obo/SO_0001177)
   */
  public static Resource T_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001177");
  }

  /**
   * A primary transcript encoding pyrrolysyl tRNA (SO:0000766). (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001178)
   */
  public static Resource pyrrolysine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001178");
  }

  /**
   * U3 snoRNA is a member of the box C/D class of small nucleolar RNAs. The U3 snoRNA secondary structure is characterised by a small 5" domain (with boxes A and A"), and a larger 3" domain (with boxes B, C, C", and D), the two domains being linked by a single-stranded hinge. Boxes B and C form the B/C motif, which appears to be exclusive to U3 snoRNAs, and boxes C" and D form the C"/D motif. The latter is functionally similar to the C/D motifs found in other snoRNAs. The 5" domain and the hinge region act as a pre-rRNA-binding domain. The 3" domain has conserved protein-binding sites. Both the box B/C and box C"/D motifs are sufficient for nuclear retention of U3 snoRNA. The box C"/D motif is also necessary for nucleolar localization, stability and hypermethylation of U3 snoRNA. Both box B/C and C"/D motifs are involved in specific protein interactions and are necessary for the rRNA processing functions of U3 snoRNA. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00012)
   * (http://purl.obolibrary.org/obo/SO_0001179)
   */
  public static Resource U3_snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001179");
  }

  /**
   * A cis-acting element found in the 3" UTR of some mRNA which is rich in AUUUA pentamers. Messenger RNAs bearing multiple AU-rich elements are often unstable. (PMID:7892223)
   * (http://purl.obolibrary.org/obo/SO_0001180)
   */
  public static Resource AU_rich_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001180");
  }

  /**
   * A cis-acting element found in the 3" UTR of some mRNA which is bound by the Drosophila Bruno protein and its homologs. (PMID:10893231)
   * (http://purl.obolibrary.org/obo/SO_0001181)
   */
  public static Resource Bruno_response_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001181");
  }

  /**
   * A regulatory sequence found in the 5" and 3" UTRs of many mRNAs which encode iron-binding proteins. It has a hairpin structure and is recognized by trans-acting proteins known as iron-regulatory proteins. (PMID:3198610, PMID:8710843)
   * (http://purl.obolibrary.org/obo/SO_0001182)
   */
  public static Resource iron_responsive_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001182");
  }

  /**
   * An attribute describing a sequence composed of nucleobases bound to a morpholino backbone. A morpholino backbone consists of morpholine (CHEBI:34856) rings connected by phosphorodiamidate linkages. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001183)
   */
  public static Resource morpholino_backbone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001183");
  }

  /**
   * An attribute describing a sequence composed of peptide nucleic acid (CHEBI:48021), a chemical consisting of nucleobases bound to a backbone composed of repeating N-(2-aminoethyl)-glycine units linked by peptide bonds. The purine and pyrimidine bases are linked to the backbone by methylene carbonyl bonds. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001184)
   */
  public static Resource PNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001184");
  }

  /**
   * An attribute describing the sequence of a transcript that has catalytic activity with or without an associated ribonucleoprotein. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001185)
   */
  public static Resource enzymatic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001185");
  }

  /**
   * An attribute describing the sequence of a transcript that has catalytic activity even without an associated ribonucleoprotein. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001186)
   */
  public static Resource ribozymic() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001186");
  }

  /**
   * A snoRNA that specifies the site of pseudouridylation in an RNA molecule by base pairing with a short sequence around the target residue. (GOC:mah, PMID:12457565)
   * (http://purl.obolibrary.org/obo/SO_0001187)
   */
  public static Resource pseudouridylation_guide_snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001187");
  }

  /**
   * An attribute describing a sequence consisting of nucleobases attached to a repeating unit made of "locked" deoxyribose rings connected to a phosphate backbone. The deoxyribose unit"s conformation is "locked" by a 2"-C,4"-C-oxymethylene link. (CHEBI:48010)
   * (http://purl.obolibrary.org/obo/SO_0001188)
   */
  public static Resource LNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001188");
  }

  /**
   * An oligo composed of LNA residues. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001189)
   */
  public static Resource LNA_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001189");
  }

  /**
   * An attribute describing a sequence consisting of nucleobases attached to a repeating unit made of threose rings connected to a phosphate backbone. (CHEBI:48019)
   * (http://purl.obolibrary.org/obo/SO_0001190)
   */
  public static Resource TNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001190");
  }

  /**
   * An oligo composed of TNA residues. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001191)
   */
  public static Resource TNA_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001191");
  }

  /**
   * An attribute describing a sequence consisting of nucleobases attached to a repeating unit made of an acyclic three-carbon propylene glycol connected to a phosphate backbone. It has two enantiomeric forms, (R)-GNA and (S)-GNA. (CHEBI:48015)
   * (http://purl.obolibrary.org/obo/SO_0001192)
   */
  public static Resource GNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001192");
  }

  /**
   * An oligo composed of GNA residues. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001193)
   */
  public static Resource GNA_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001193");
  }

  /**
   * An attribute describing a GNA sequence in the (R)-GNA enantiomer. (CHEBI:48016)
   * (http://purl.obolibrary.org/obo/SO_0001194)
   */
  public static Resource R_GNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001194");
  }

  /**
   * An oligo composed of (R)-GNA residues. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001195)
   */
  public static Resource R_GNA_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001195");
  }

  /**
   * An attribute describing a GNA sequence in the (S)-GNA enantiomer. (CHEBI:48017)
   * (http://purl.obolibrary.org/obo/SO_0001196)
   */
  public static Resource S_GNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001196");
  }

  /**
   * An oligo composed of (S)-GNA residues. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001197)
   */
  public static Resource S_GNA_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001197");
  }

  /**
   * A ds_DNA_viral_sequence is a viral_sequence that is the sequence of a virus that exists as double stranded DNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001198)
   */
  public static Resource ds_DNA_viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001198");
  }

  /**
   * A ss_RNA_viral_sequence is a viral_sequence that is the sequence of a virus that exists as single stranded RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001199)
   */
  public static Resource ss_RNA_viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001199");
  }

  /**
   * A negative_sense_RNA_viral_sequence is a ss_RNA_viral_sequence that is the sequence of a single stranded RNA virus that is complementary to mRNA and must be converted to positive sense RNA by RNA polymerase before translation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001200)
   */
  public static Resource negative_sense_ssRNA_viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001200");
  }

  /**
   * A positive_sense_RNA_viral_sequence is a ss_RNA_viral_sequence that is the sequence of a single stranded RNA virus that can be immediately translated by the host. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001201)
   */
  public static Resource positive_sense_ssRNA_viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001201");
  }

  /**
   * A ambisense_RNA_virus is a ss_RNA_viral_sequence that is the sequence of a single stranded RNA virus with both messenger and anti messenger polarity. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001202)
   */
  public static Resource ambisense_ssRNA_viral_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001202");
  }

  /**
   * A region (DNA) to which RNA polymerase binds, to begin transcription. (xenbase:jb)
   * (http://purl.obolibrary.org/obo/SO_0001203)
   */
  public static Resource RNA_polymerase_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001203");
  }

  /**
   * A region (DNA) to which Bacteriophage RNA polymerase binds, to begin transcription. (xenbase:jb)
   * (http://purl.obolibrary.org/obo/SO_0001204)
   */
  public static Resource Phage_RNA_Polymerase_Promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001204");
  }

  /**
   * A region (DNA) to which the SP6 RNA polymerase binds, to begin transcription. (xenbase:jb)
   * (http://purl.obolibrary.org/obo/SO_0001205)
   */
  public static Resource SP6_RNA_Polymerase_Promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001205");
  }

  /**
   * A DNA sequence to which the T3 RNA polymerase binds, to begin transcription. (xenbase:jb)
   * (http://purl.obolibrary.org/obo/SO_0001206)
   */
  public static Resource T3_RNA_Polymerase_Promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001206");
  }

  /**
   * A region (DNA) to which the T7 RNA polymerase binds, to begin transcription. (xenbase:jb)
   * (http://purl.obolibrary.org/obo/SO_0001207)
   */
  public static Resource T7_RNA_Polymerase_Promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001207");
  }

  /**
   * An EST read from the 5" end of a transcript that usually codes for a protein. These regions tend to be conserved across species and do not change much within a gene family. (http://www.ncbi.nlm.nih.gov/About/primer/est.html)
   * (http://purl.obolibrary.org/obo/SO_0001208)
   */
  public static Resource five_prime_EST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001208");
  }

  /**
   * An EST read from the 3" end of a transcript. They are more likely to fall within non-coding, or untranslated regions(UTRs). (http://www.ncbi.nlm.nih.gov/About/primer/est.html)
   * (http://purl.obolibrary.org/obo/SO_0001209)
   */
  public static Resource three_prime_EST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001209");
  }

  /**
   * The region of mRNA (not divisible by 3 bases) that is skipped during the process of translational frameshifting (GO:0006452), causing the reading frame to be different. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001210)
   */
  public static Resource translational_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001210");
  }

  /**
   * The region of mRNA 1 base long that is skipped during the process of translational frameshifting (GO:0006452), causing the reading frame to be different. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001211)
   */
  public static Resource plus_1_translational_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001211");
  }

  /**
   * The region of mRNA 2 bases long that is skipped during the process of translational frameshifting (GO:0006452), causing the reading frame to be different. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001212)
   */
  public static Resource plus_2_translational_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001212");
  }

  /**
   * Group III introns are introns found in the mRNA of the plastids of euglenoid protists. They are spliced by a two step transesterification with bulged adenosine as initiating nucleophile. (PMID:11377794)
   * (http://purl.obolibrary.org/obo/SO_0001213)
   */
  public static Resource group_III_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001213");
  }

  /**
   * The maximal intersection of exon and UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001214)
   */
  public static Resource noncoding_region_of_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001214");
  }

  /**
   * The region of an exon that encodes for protein sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001215)
   */
  public static Resource coding_region_of_exon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001215");
  }

  /**
   * An intron that spliced via endonucleolytic cleavage and ligation rather than transesterification. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001216)
   */
  public static Resource endonuclease_spliced_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001216");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001217)
   */
  public static Resource protein_coding_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001217");
  }

  /**
   * An insertion that derives from another organism, via the use of recombinant DNA technology. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001218)
   */
  public static Resource transgenic_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001218");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001219)
   */
  public static Resource retrogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001219");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated by RNA interference. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001220)
   */
  public static Resource silenced_by_RNA_interference() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001220");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated by histone modification. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001221)
   */
  public static Resource silenced_by_histone_modification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001221");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated by histone methylation. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001222)
   */
  public static Resource silenced_by_histone_methylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001222");
  }

  /**
   * An attribute describing an epigenetic process where a gene is inactivated by histone deacetylation. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001223)
   */
  public static Resource silenced_by_histone_deacetylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001223");
  }

  /**
   * A gene that is silenced by RNA interference. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001224)
   */
  public static Resource gene_silenced_by_RNA_interference() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001224");
  }

  /**
   * A gene that is silenced by histone modification. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001225)
   */
  public static Resource gene_silenced_by_histone_modification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001225");
  }

  /**
   * A gene that is silenced by histone methylation. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001226)
   */
  public static Resource gene_silenced_by_histone_methylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001226");
  }

  /**
   * A gene that is silenced by histone deacetylation. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001227)
   */
  public static Resource gene_silenced_by_histone_deacetylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001227");
  }

  /**
   * A modified RNA base in which the 5,6-dihydrouracil is bound to the ribose ring. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001228)
   */
  public static Resource dihydrouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001228");
  }

  /**
   * A modified RNA base in which the 5- position of the uracil is bound to the ribose ring instead of the 4- position. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001229)
   */
  public static Resource pseudouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001229");
  }

  /**
   * A modified RNA base in which hypoxanthine is bound to the ribose ring. (http://library.med.utah.edu/RNAmods/, RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001230)
   */
  public static Resource inosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001230");
  }

  /**
   * A modified RNA base in which guanine is methylated at the 7- position. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001231)
   */
  public static Resource seven_methylguanine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001231");
  }

  /**
   * A modified RNA base in which thymine is bound to the ribose ring. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001232)
   */
  public static Resource ribothymidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001232");
  }

  /**
   * A modified RNA base in which methylhypoxanthine is bound to the ribose ring. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001233)
   */
  public static Resource methylinosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001233");
  }

  /**
   * An attribute describing a feature that has either intra-genome or intracellular mobility. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001234)
   */
  public static Resource mobile() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001234");
  }

  /**
   * A region containing at least one unique origin of replication and a unique termination site. (ISBN:0716719207)
   * (http://purl.obolibrary.org/obo/SO_0001235)
   */
  public static Resource replicon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001235");
  }

  /**
   * A base is a sequence feature that corresponds to a single unit of a nucleotide polymer. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001236)
   */
  public static Resource base() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001236");
  }

  /**
   * A sequence feature that corresponds to a single amino acid residue in a polypeptide. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0001237)
   */
  public static Resource amino_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001237");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001238)
   */
  public static Resource major_TSS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001238");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001239)
   */
  public static Resource minor_TSS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001239");
  }

  /**
   * The region of a gene from the 5" most TSS to the 3" TSS. (BBOP:nw)
   * (http://purl.obolibrary.org/obo/SO_0001240)
   */
  public static Resource TSS_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001240");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001241)
   */
  public static Resource encodes_alternate_transcription_start_sites() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001241");
  }

  /**
   * A part of an miRNA primary_transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001243)
   */
  public static Resource miRNA_primary_transcript_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001243");
  }

  /**
   * The 60-70 nucleotide region remain after Drosha processing of the primary transcript, that folds back upon itself to form a hairpin sructure. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001244)
   */
  public static Resource pre_miRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001244");
  }

  /**
   * The stem of the hairpin loop formed by folding of the pre-miRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001245)
   */
  public static Resource miRNA_stem() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001245");
  }

  /**
   * The loop of the hairpin loop formed by folding of the pre-miRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001246)
   */
  public static Resource miRNA_loop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001246");
  }

  /**
   * An oligo composed of synthetic nucleotides. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001247)
   */
  public static Resource synthetic_oligo() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001247");
  }

  /**
   * A region of the genome of known length that is composed by ordering and aligning two or more different regions. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001248)
   */
  public static Resource assembly() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001248");
  }

  /**
   * A fragment assembly is a genome assembly that orders overlapping fragments of the genome based on landmark sequences. The base pair distance between the landmarks is known allowing additivity of lengths. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001249)
   */
  public static Resource fragment_assembly() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001249");
  }

  /**
   * A fingerprint_map is a physical map composed of restriction fragments. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001250)
   */
  public static Resource fingerprint_map() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001250");
  }

  /**
   * An STS map is a physical map organized by the unique STS landmarks. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001251)
   */
  public static Resource STS_map() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001251");
  }

  /**
   * A radiation hybrid map is a physical map. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001252)
   */
  public static Resource RH_map() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001252");
  }

  /**
   * A DNA fragment generated by sonication. Sonication is a technique used to sheer DNA into smaller fragments. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001253)
   */
  public static Resource sonicate_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001253");
  }

  /**
   * A kind of chromosome variation where the chromosome complement is an exact multiple of the haploid number and is greater than the diploid number. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001254)
   */
  public static Resource polyploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001254");
  }

  /**
   * A polyploid where the multiple chromosome set was derived from the same organism. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001255)
   */
  public static Resource autopolyploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001255");
  }

  /**
   * A polyploid where the multiple chromosome set was derived from a different organism. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001256)
   */
  public static Resource allopolyploid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001256");
  }

  /**
   * The binding site (recognition site) of a homing endonuclease. The binding site is typically large. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001257)
   */
  public static Resource homing_endonuclease_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001257");
  }

  /**
   * A sequence element characteristic of some RNA polymerase II promoters with sequence ATTGCAT that binds Pou-domain transcription factors. (GOC:dh, PMID:3095662)
   * (http://purl.obolibrary.org/obo/SO_0001258)
   */
  public static Resource octamer_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001258");
  }

  /**
   * A chromosome originating in an apicoplast. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001259)
   */
  public static Resource apicoplast_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001259");
  }

  /**
   * A collection of discontinuous sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001260)
   */
  public static Resource sequence_collection() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001260");
  }

  /**
   * A continuous region of sequence composed of the overlapping of multiple sequence_features, which ultimately provides evidence for another sequence_feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001261)
   */
  public static Resource overlapping_feature_set() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001261");
  }

  /**
   * A continous experimental result region extending the length of multiple overlapping EST"s. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001262)
   */
  public static Resource overlapping_EST_set() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001262");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001263)
   */
  public static Resource ncRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001263");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001264)
   */
  public static Resource gRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001264");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001265)
   */
  public static Resource miRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001265");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001266)
   */
  public static Resource scRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001266");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001267)
   */
  public static Resource snoRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001267");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001268)
   */
  public static Resource snRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001268");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001269)
   */
  public static Resource SRP_RNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001269");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001270)
   */
  public static Resource stRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001270");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001271)
   */
  public static Resource tmRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001271");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001272)
   */
  public static Resource tRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001272");
  }

  /**
   * A modified adenine is an adenine base feature that has been altered. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001273)
   */
  public static Resource modified_adenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001273");
  }

  /**
   * A modified inosine is an inosine base feature that has been altered. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001274)
   */
  public static Resource modified_inosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001274");
  }

  /**
   * A modified cytidine is a cytidine base feature which has been altered. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001275)
   */
  public static Resource modified_cytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001275");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001276)
   */
  public static Resource modified_guanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001276");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001277)
   */
  public static Resource modified_uridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001277");
  }

  /**
   * 1-methylinosine is a modified insosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001278)
   */
  public static Resource one_methylinosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001278");
  }

  /**
   * 1,2"-O-dimethylinosine is a modified inosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001279)
   */
  public static Resource one_two_prime_O_dimethylinosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001279");
  }

  /**
   * 2"-O-methylinosine is a modified inosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001280)
   */
  public static Resource two_prime_O_methylinosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001280");
  }

  /**
   * 3-methylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001281)
   */
  public static Resource three_methylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001281");
  }

  /**
   * 5-methylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001282)
   */
  public static Resource five_methylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001282");
  }

  /**
   * 2"-O-methylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001283)
   */
  public static Resource two_prime_O_methylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001283");
  }

  /**
   * 2-thiocytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001284)
   */
  public static Resource two_thiocytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001284");
  }

  /**
   * N4-acetylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001285)
   */
  public static Resource N4_acetylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001285");
  }

  /**
   * 5-formylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001286)
   */
  public static Resource five_formylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001286");
  }

  /**
   * 5,2"-O-dimethylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001287)
   */
  public static Resource five_two_prime_O_dimethylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001287");
  }

  /**
   * N4-acetyl-2"-O-methylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001288)
   */
  public static Resource N4_acetyl_2_prime_O_methylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001288");
  }

  /**
   * Lysidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001289)
   */
  public static Resource lysidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001289");
  }

  /**
   * N4-methylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001290)
   */
  public static Resource N4_methylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001290");
  }

  /**
   * N4,2"-O-dimethylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001291)
   */
  public static Resource N4_2_prime_O_dimethylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001291");
  }

  /**
   * 5-hydroxymethylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001292)
   */
  public static Resource five_hydroxymethylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001292");
  }

  /**
   * 5-formyl-2"-O-methylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001293)
   */
  public static Resource five_formyl_two_prime_O_methylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001293");
  }

  /**
   * N4_N4_2_prime_O_trimethylcytidine is a modified cytidine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001294)
   */
  public static Resource N4_N4_2_prime_O_trimethylcytidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001294");
  }

  /**
   * 1_methyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001295)
   */
  public static Resource one_methyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001295");
  }

  /**
   * 2_methyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001296)
   */
  public static Resource two_methyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001296");
  }

  /**
   * N6_methyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001297)
   */
  public static Resource N6_methyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001297");
  }

  /**
   * 2prime_O_methyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001298)
   */
  public static Resource two_prime_O_methyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001298");
  }

  /**
   * 2_methylthio_N6_methyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001299)
   */
  public static Resource two_methylthio_N6_methyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001299");
  }

  /**
   * N6_isopentenyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001300)
   */
  public static Resource N6_isopentenyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001300");
  }

  /**
   * 2_methylthio_N6_isopentenyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001301)
   */
  public static Resource two_methylthio_N6_isopentenyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001301");
  }

  /**
   * N6_cis_hydroxyisopentenyl_adenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001302)
   */
  public static Resource N6_cis_hydroxyisopentenyl_adenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001302");
  }

  /**
   * 2_methylthio_N6_cis_hydroxyisopentenyl_adenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001303)
   */
  public static Resource two_methylthio_N6_cis_hydroxyisopentenyl_adenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001303");
  }

  /**
   * N6_glycinylcarbamoyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001304)
   */
  public static Resource N6_glycinylcarbamoyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001304");
  }

  /**
   * N6_threonylcarbamoyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001305)
   */
  public static Resource N6_threonylcarbamoyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001305");
  }

  /**
   * 2_methylthio_N6_threonyl_carbamoyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001306)
   */
  public static Resource two_methylthio_N6_threonyl_carbamoyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001306");
  }

  /**
   * N6_methyl_N6_threonylcarbamoyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001307)
   */
  public static Resource N6_methyl_N6_threonylcarbamoyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001307");
  }

  /**
   * N6_hydroxynorvalylcarbamoyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001308)
   */
  public static Resource N6_hydroxynorvalylcarbamoyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001308");
  }

  /**
   * 2_methylthio_N6_hydroxynorvalyl_carbamoyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001309)
   */
  public static Resource two_methylthio_N6_hydroxynorvalyl_carbamoyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001309");
  }

  /**
   * 2prime_O_ribosyladenosine_phosphate is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001310)
   */
  public static Resource two_prime_O_ribosyladenosine_phosphate() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001310");
  }

  /**
   * N6_N6_dimethyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001311)
   */
  public static Resource N6_N6_dimethyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001311");
  }

  /**
   * N6_2prime_O_dimethyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001312)
   */
  public static Resource N6_2_prime_O_dimethyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001312");
  }

  /**
   * N6_N6_2prime_O_trimethyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001313)
   */
  public static Resource N6_N6_2_prime_O_trimethyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001313");
  }

  /**
   * 1,2"-O-dimethyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001314)
   */
  public static Resource one_two_prime_O_dimethyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001314");
  }

  /**
   * N6_acetyladenosine is a modified adenosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001315)
   */
  public static Resource N6_acetyladenosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001315");
  }

  /**
   * 7-deazaguanosine is a moddified guanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001316)
   */
  public static Resource seven_deazaguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001316");
  }

  /**
   * Queuosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001317)
   */
  public static Resource queuosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001317");
  }

  /**
   * Epoxyqueuosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001318)
   */
  public static Resource epoxyqueuosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001318");
  }

  /**
   * Galactosyl_queuosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001319)
   */
  public static Resource galactosyl_queuosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001319");
  }

  /**
   * Mannosyl_queuosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001320)
   */
  public static Resource mannosyl_queuosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001320");
  }

  /**
   * 7_cyano_7_deazaguanosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001321)
   */
  public static Resource seven_cyano_seven_deazaguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001321");
  }

  /**
   * 7_aminomethyl_7_deazaguanosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001322)
   */
  public static Resource seven_aminomethyl_seven_deazaguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001322");
  }

  /**
   * Archaeosine is a modified 7-deazoguanosine. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001323)
   */
  public static Resource archaeosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001323");
  }

  /**
   * 1_methylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001324)
   */
  public static Resource one_methylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001324");
  }

  /**
   * N2_methylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001325)
   */
  public static Resource N2_methylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001325");
  }

  /**
   * 7_methylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001326)
   */
  public static Resource seven_methylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001326");
  }

  /**
   * 2prime_O_methylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001327)
   */
  public static Resource two_prime_O_methylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001327");
  }

  /**
   * N2_N2_dimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001328)
   */
  public static Resource N2_N2_dimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001328");
  }

  /**
   * N2_2prime_O_dimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001329)
   */
  public static Resource N2_2_prime_O_dimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001329");
  }

  /**
   * N2_N2_2prime_O_trimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001330)
   */
  public static Resource N2_N2_2_prime_O_trimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001330");
  }

  /**
   * 2prime_O_ribosylguanosine_phosphate is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001331)
   */
  public static Resource two_prime_O_ribosylguanosine_phosphate() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001331");
  }

  /**
   * Wybutosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001332)
   */
  public static Resource wybutosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001332");
  }

  /**
   * Peroxywybutosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001333)
   */
  public static Resource peroxywybutosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001333");
  }

  /**
   * Hydroxywybutosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001334)
   */
  public static Resource hydroxywybutosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001334");
  }

  /**
   * Undermodified_hydroxywybutosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001335)
   */
  public static Resource undermodified_hydroxywybutosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001335");
  }

  /**
   * Wyosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001336)
   */
  public static Resource wyosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001336");
  }

  /**
   * Methylwyosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001337)
   */
  public static Resource methylwyosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001337");
  }

  /**
   * N2_7_dimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001338)
   */
  public static Resource N2_7_dimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001338");
  }

  /**
   * N2_N2_7_trimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001339)
   */
  public static Resource N2_N2_7_trimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001339");
  }

  /**
   * 1_2prime_O_dimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001340)
   */
  public static Resource one_two_prime_O_dimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001340");
  }

  /**
   * 4_demethylwyosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001341)
   */
  public static Resource four_demethylwyosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001341");
  }

  /**
   * Isowyosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001342)
   */
  public static Resource isowyosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001342");
  }

  /**
   * N2_7_2prirme_O_trimethylguanosine is a modified guanosine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001343)
   */
  public static Resource N2_7_2prirme_O_trimethylguanosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001343");
  }

  /**
   * 5_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001344)
   */
  public static Resource five_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001344");
  }

  /**
   * 2prime_O_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001345)
   */
  public static Resource two_prime_O_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001345");
  }

  /**
   * 5_2_prime_O_dimethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001346)
   */
  public static Resource five_two_prime_O_dimethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001346");
  }

  /**
   * 1_methylpseudouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001347)
   */
  public static Resource one_methylpseudouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001347");
  }

  /**
   * 2prime_O_methylpseudouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001348)
   */
  public static Resource two_prime_O_methylpseudouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001348");
  }

  /**
   * 2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001349)
   */
  public static Resource two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001349");
  }

  /**
   * 4_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001350)
   */
  public static Resource four_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001350");
  }

  /**
   * 5_methyl_2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001351)
   */
  public static Resource five_methyl_2_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001351");
  }

  /**
   * 2_thio_2prime_O_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001352)
   */
  public static Resource two_thio_two_prime_O_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001352");
  }

  /**
   * 3_3_amino_3_carboxypropyl_uridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001353)
   */
  public static Resource three_three_amino_three_carboxypropyl_uridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001353");
  }

  /**
   * 5_hydroxyuridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001354)
   */
  public static Resource five_hydroxyuridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001354");
  }

  /**
   * 5_methoxyuridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001355)
   */
  public static Resource five_methoxyuridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001355");
  }

  /**
   * Uridine_5_oxyacetic_acid is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001356)
   */
  public static Resource uridine_five_oxyacetic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001356");
  }

  /**
   * Uridine_5_oxyacetic_acid_methyl_ester is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001357)
   */
  public static Resource uridine_five_oxyacetic_acid_methyl_ester() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001357");
  }

  /**
   * 5_carboxyhydroxymethyl_uridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001358)
   */
  public static Resource five_carboxyhydroxymethyl_uridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001358");
  }

  /**
   * 5_carboxyhydroxymethyl_uridine_methyl_ester is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001359)
   */
  public static Resource five_carboxyhydroxymethyl_uridine_methyl_ester() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001359");
  }

  /**
   * Five_methoxycarbonylmethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001360)
   */
  public static Resource five_methoxycarbonylmethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001360");
  }

  /**
   * Five_methoxycarbonylmethyl_2_prime_O_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001361)
   */
  public static Resource five_methoxycarbonylmethyl_two_prime_O_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001361");
  }

  /**
   * 5_methoxycarbonylmethyl_2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001362)
   */
  public static Resource five_methoxycarbonylmethyl_two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001362");
  }

  /**
   * 5_aminomethyl_2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001363)
   */
  public static Resource five_aminomethyl_two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001363");
  }

  /**
   * 5_methylaminomethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001364)
   */
  public static Resource five_methylaminomethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001364");
  }

  /**
   * 5_methylaminomethyl_2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001365)
   */
  public static Resource five_methylaminomethyl_two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001365");
  }

  /**
   * 5_methylaminomethyl_2_selenouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001366)
   */
  public static Resource five_methylaminomethyl_two_selenouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001366");
  }

  /**
   * 5_carbamoylmethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001367)
   */
  public static Resource five_carbamoylmethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001367");
  }

  /**
   * 5_carbamoylmethyl_2_prime_O_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001368)
   */
  public static Resource five_carbamoylmethyl_two_prime_O_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001368");
  }

  /**
   * 5_carboxymethylaminomethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001369)
   */
  public static Resource five_carboxymethylaminomethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001369");
  }

  /**
   * 5_carboxymethylaminomethyl_2_prime_O_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001370)
   */
  public static Resource five_carboxymethylaminomethyl_two_prime_O_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001370");
  }

  /**
   * 5_carboxymethylaminomethyl_2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001371)
   */
  public static Resource five_carboxymethylaminomethyl_two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001371");
  }

  /**
   * 3_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001372)
   */
  public static Resource three_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001372");
  }

  /**
   * 1_methyl_3_3_amino_3_carboxypropyl_pseudouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001373)
   */
  public static Resource one_methyl_three_three_amino_three_carboxypropyl_pseudouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001373");
  }

  /**
   * 5_carboxymethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001374)
   */
  public static Resource five_carboxymethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001374");
  }

  /**
   * 3_2prime_O_dimethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001375)
   */
  public static Resource three_two_prime_O_dimethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001375");
  }

  /**
   * 5_methyldihydrouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001376)
   */
  public static Resource five_methyldihydrouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001376");
  }

  /**
   * 3_methylpseudouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001377)
   */
  public static Resource three_methylpseudouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001377");
  }

  /**
   * 5_taurinomethyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001378)
   */
  public static Resource five_taurinomethyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001378");
  }

  /**
   * 5_taurinomethyl_2_thiouridineis a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001379)
   */
  public static Resource five_taurinomethyl_two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001379");
  }

  /**
   * 5_isopentenylaminomethyl_uridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001380)
   */
  public static Resource five_isopentenylaminomethyl_uridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001380");
  }

  /**
   * 5_isopentenylaminomethyl_2_thiouridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001381)
   */
  public static Resource five_isopentenylaminomethyl_two_thiouridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001381");
  }

  /**
   * 5_isopentenylaminomethyl_2prime_O_methyluridine is a modified uridine base feature. (http://library.med.utah.edu/RNAmods/)
   * (http://purl.obolibrary.org/obo/SO_0001382)
   */
  public static Resource five_isopentenylaminomethyl_two_prime_O_methyluridine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001382");
  }

  /**
   * A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues of a histone. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001383)
   */
  public static Resource histone_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001383");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001384)
   */
  public static Resource CDS_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001384");
  }

  /**
   * A post translationally modified amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001385)
   */
  public static Resource modified_amino_acid_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001385");
  }

  /**
   * A post translationally modified glycine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001386)
   */
  public static Resource modified_glycine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001386");
  }

  /**
   * A post translationally modified alanine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001387)
   */
  public static Resource modified_L_alanine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001387");
  }

  /**
   * A post translationally modified asparagine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001388)
   */
  public static Resource modified_L_asparagine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001388");
  }

  /**
   * A post translationally modified aspartic acid amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001389)
   */
  public static Resource modified_L_aspartic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001389");
  }

  /**
   * A post translationally modified cysteine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001390)
   */
  public static Resource modified_L_cysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001390");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001391)
   */
  public static Resource modified_L_glutamic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001391");
  }

  /**
   * A post translationally modified threonine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001392)
   */
  public static Resource modified_L_threonine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001392");
  }

  /**
   * A post translationally modified tryptophan amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001393)
   */
  public static Resource modified_L_tryptophan() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001393");
  }

  /**
   * A post translationally modified glutamine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001394)
   */
  public static Resource modified_L_glutamine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001394");
  }

  /**
   * A post translationally modified methionine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001395)
   */
  public static Resource modified_L_methionine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001395");
  }

  /**
   * A post translationally modified isoleucine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001396)
   */
  public static Resource modified_L_isoleucine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001396");
  }

  /**
   * A post translationally modified phenylalanine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001397)
   */
  public static Resource modified_L_phenylalanine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001397");
  }

  /**
   * A post translationally modified histidie amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001398)
   */
  public static Resource modified_L_histidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001398");
  }

  /**
   * A post translationally modified serine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001399)
   */
  public static Resource modified_L_serine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001399");
  }

  /**
   * A post translationally modified lysine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001400)
   */
  public static Resource modified_L_lysine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001400");
  }

  /**
   * A post translationally modified leucine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001401)
   */
  public static Resource modified_L_leucine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001401");
  }

  /**
   * A post translationally modified selenocysteine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001402)
   */
  public static Resource modified_L_selenocysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001402");
  }

  /**
   * A post translationally modified valine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001403)
   */
  public static Resource modified_L_valine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001403");
  }

  /**
   * A post translationally modified proline amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001404)
   */
  public static Resource modified_L_proline() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001404");
  }

  /**
   * A post translationally modified tyrosine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001405)
   */
  public static Resource modified_L_tyrosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001405");
  }

  /**
   * A post translationally modified arginine amino acid feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001406)
   */
  public static Resource modified_L_arginine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001406");
  }

  /**
   * An attribute describing the nature of a proteinaceous polymer, where by the amino acid units are joined by peptide bonds. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001407)
   */
  public static Resource peptidyl() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001407");
  }

  /**
   * The C-terminal residues of a polypeptide which are exchanged for a GPI-anchor. (EBI:rh)
   * (http://purl.obolibrary.org/obo/SO_0001408)
   */
  public static Resource cleaved_for_gpi_anchor_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001408");
  }

  /**
   * A region which is intended for use in an experiment. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001409)
   */
  public static Resource biomaterial_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001409");
  }

  /**
   * A region which is the result of some arbitrary experimental procedure. The procedure may be carried out with biological material or inside a computer. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001410)
   */
  public static Resource experimental_feature() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001410");
  }

  /**
   * A region defined by its disposition to be involved in a biological process. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001411)
   */
  public static Resource biological_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001411");
  }

  /**
   * A region that is defined according to its relations with other regions within the same sequence. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001412)
   */
  public static Resource topologically_defined_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001412");
  }

  /**
   * The point within a chromosome where a translocation begins or ends. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001413)
   */
  public static Resource translocation_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001413");
  }

  /**
   * The point within a chromosome where a insertion begins or ends. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001414)
   */
  public static Resource insertion_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001414");
  }

  /**
   * The point within a chromosome where a deletion begins or ends. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001415)
   */
  public static Resource deletion_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001415");
  }

  /**
   * A flanking region located five prime of a specific region. (SO:chado)
   * (http://purl.obolibrary.org/obo/SO_0001416)
   */
  public static Resource five_prime_flanking_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001416");
  }

  /**
   * A flanking region located three prime of a specific region. (SO:chado)
   * (http://purl.obolibrary.org/obo/SO_0001417)
   */
  public static Resource three_prime_flanking_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001417");
  }

  /**
   * An experimental region, defined by a tiling array experiment to be transcribed at some level. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001418)
   */
  public static Resource transcribed_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001418");
  }

  /**
   * Intronic 2 bp region bordering exon. A splice_site that adjacent_to exon and overlaps intron. (SO:cjm, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001419)
   */
  public static Resource cis_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001419");
  }

  /**
   * Primary transcript region bordering trans-splice junction. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001420)
   */
  public static Resource trans_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001420");
  }

  /**
   * The boundary between an intron and an exon. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001421)
   */
  public static Resource splice_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001421");
  }

  /**
   * A region of a polypeptide, involved in the transition from one conformational state to another. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001422)
   */
  public static Resource conformational_switch() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001422");
  }

  /**
   * A read produced by the dye terminator method of sequencing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001423)
   */
  public static Resource dye_terminator_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001423");
  }

  /**
   * A read produced by pyrosequencing technology. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001424)
   */
  public static Resource pyrosequenced_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001424");
  }

  /**
   * A read produced by ligation based sequencing technologies. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001425)
   */
  public static Resource ligation_based_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001425");
  }

  /**
   * A read produced by the polymerase based sequence by synthesis method. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001426)
   */
  public static Resource polymerase_synthesis_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001426");
  }

  /**
   * A structural region in an RNA molecule which promotes ribosomal frameshifting of cis coding sequence. (RFAM:jd)
   * (http://purl.obolibrary.org/obo/SO_0001427)
   */
  public static Resource cis_regulatory_frameshift_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001427");
  }

  /**
   * A sequence assembly derived from expressed sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001428)
   */
  public static Resource expressed_sequence_assembly() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001428");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with DNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001429)
   */
  public static Resource DNA_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001429");
  }

  /**
   * A gene that is not transcribed under normal conditions and is not critical to normal cellular functioning. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001431)
   */
  public static Resource cryptic_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001431");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001432)
   */
  public static Resource sequence_variant_affecting_polyadenylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001432");
  }

  /**
   * A three prime RACE (Rapid Amplification of cDNA Ends) clone is a cDNA clone copied from the 3" end of an mRNA (using a poly-dT primer to capture the polyA tail and a gene-specific or randomly primed 5" primer), and spliced into a vector for propagation in a suitable host. (modENCODE:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001433)
   */
  public static Resource three_prime_RACE_clone() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001433");
  }

  /**
   * A cassette pseudogene is a kind of gene in an inactive form which may recombine at a telomeric locus to form a functional copy. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001434)
   */
  public static Resource cassette_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001434");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001435)
   */
  public static Resource alanine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001435");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001436)
   */
  public static Resource valine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001436");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001437)
   */
  public static Resource leucine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001437");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001438)
   */
  public static Resource isoleucine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001438");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001439)
   */
  public static Resource proline() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001439");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001440)
   */
  public static Resource tryptophan() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001440");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001441)
   */
  public static Resource phenylalanine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001441");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001442)
   */
  public static Resource methionine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001442");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001443)
   */
  public static Resource glycine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001443");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001444)
   */
  public static Resource serine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001444");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001445)
   */
  public static Resource threonine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001445");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001446)
   */
  public static Resource tyrosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001446");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001447)
   */
  public static Resource cysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001447");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001448)
   */
  public static Resource glutamine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001448");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001449)
   */
  public static Resource asparagine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001449");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001450)
   */
  public static Resource lysine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001450");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001451)
   */
  public static Resource arginine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001451");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001452)
   */
  public static Resource histidine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001452");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001453)
   */
  public static Resource aspartic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001453");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001454)
   */
  public static Resource glutamic_acid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001454");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001455)
   */
  public static Resource selenocysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001455");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001456)
   */
  public static Resource pyrrolysine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001456");
  }

  /**
   * A region defined by a set of transcribed sequences from the same gene or expressed pseudogene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001457)
   */
  public static Resource transcribed_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001457");
  }

  /**
   * A kind of transcribed_cluster defined by a set of transcribed sequences from the a unique gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001458)
   */
  public static Resource unigene_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001458");
  }

  /**
   * Clustered Palindromic Repeats interspersed with bacteriophage derived spacer sequences. (RFAM:jd)
   * (http://purl.obolibrary.org/obo/SO_0001459)
   */
  public static Resource CRISPR() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001459");
  }

  /**
   * A binding site that, in an insulator region of a nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001460)
   */
  public static Resource insulator_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001460");
  }

  /**
   * A binding site that, in the enhancer region of a nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001461)
   */
  public static Resource enhancer_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001461");
  }

  /**
   * A collection of contigs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001462)
   */
  public static Resource contig_collection() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001462");
  }

  /**
   * A multiexonic non-coding RNA transcribed by RNA polymerase II. (PMID:19182780, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001463)
   */
  public static Resource lincRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001463");
  }

  /**
   * An EST spanning part or all of the untranslated regions of a protein-coding transcript. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001464)
   */
  public static Resource UST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001464");
  }

  /**
   * A UST located in the 3"UTR of a protein-coding transcript. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001465)
   */
  public static Resource three_prime_UST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001465");
  }

  /**
   * An UST located in the 5"UTR of a protein-coding transcript. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001466)
   */
  public static Resource five_prime_UST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001466");
  }

  /**
   * A tag produced from a single sequencing read from a RACE product; typically a few hundred base pairs long. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001467)
   */
  public static Resource RST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001467");
  }

  /**
   * A tag produced from a single sequencing read from a 3"-RACE product; typically a few hundred base pairs long. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001468)
   */
  public static Resource three_prime_RST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001468");
  }

  /**
   * A tag produced from a single sequencing read from a 5"-RACE product; typically a few hundred base pairs long. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001469)
   */
  public static Resource five_prime_RST() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001469");
  }

  /**
   * A match against an UST sequence. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001470)
   */
  public static Resource UST_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001470");
  }

  /**
   * A match against an RST sequence. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001471)
   */
  public static Resource RST_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001471");
  }

  /**
   * A nucleotide match to a primer sequence. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001472)
   */
  public static Resource primer_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001472");
  }

  /**
   * A region of the pri miRNA that basepairs with the guide to form the hairpin. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001473)
   */
  public static Resource miRNA_antiguide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001473");
  }

  /**
   * The boundary between the spliced leader and the first exon of the mRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001474)
   */
  public static Resource trans_splice_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001474");
  }

  /**
   * A region of a primary transcript, that is removed via trans splicing. (PMID:16401417, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001475)
   */
  public static Resource outron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001475");
  }

  /**
   * A plasmid that occurs naturally. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001476)
   */
  public static Resource natural_plasmid() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001476");
  }

  /**
   * A gene trap construct is a type of engineered plasmid which is designed to integrate into a genome and produce a fusion transcript between exons of the gene into which it inserts and a reporter element in the construct. Gene traps contain a splice acceptor, do not contain promoter elements for the reporter, and are mutagenic. Gene traps may be bicistronic with the second cassette containing a promoter driving an a selectable marker. (ZFIN:dh)
   * (http://purl.obolibrary.org/obo/SO_0001477)
   */
  public static Resource gene_trap_construct() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001477");
  }

  /**
   * A promoter trap construct is a type of engineered plasmid which is designed to integrate into a genome and express a reporter when inserted in close proximity to a promoter element. Promoter traps typically do not contain promoter elements and are mutagenic. (ZFIN:dh)
   * (http://purl.obolibrary.org/obo/SO_0001478)
   */
  public static Resource promoter_trap_construct() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001478");
  }

  /**
   * An enhancer trap construct is a type of engineered plasmid which is designed to integrate into a genome and express a reporter when the expression from a basic minimal promoter is enhanced by genomic enhancer elements. Enhancer traps contain promoter elements and are not usually mutagenic. (ZFIN:dh)
   * (http://purl.obolibrary.org/obo/SO_0001479)
   */
  public static Resource enhancer_trap_construct() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001479");
  }

  /**
   * A region of sequence from the end of a PAC clone that may provide a highly specific marker. (ZFIN:mh)
   * (http://purl.obolibrary.org/obo/SO_0001480)
   */
  public static Resource PAC_end() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001480");
  }

  /**
   * RAPD is a "PCR product" where a sequence variant is identified through the use of PCR with random primers. (ZFIN:mh)
   * (http://purl.obolibrary.org/obo/SO_0001481)
   */
  public static Resource RAPD() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001481");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001482)
   */
  public static Resource shadow_enhancer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001482");
  }

  /**
   * SNVs are single nucleotide positions in genomic DNA at which different sequence alternatives exist. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001483)
   */
  public static Resource SNV() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001483");
  }

  /**
   * An X element combinatorial repeat is a repeat region located between the X element and the telomere or adjacent Y" element. (http://www.yeastgenome.org/help/glossary.html)
   * (http://purl.obolibrary.org/obo/SO_0001484)
   */
  public static Resource X_element_combinatorial_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001484");
  }

  /**
   * A Y" element is a repeat region (SO:0000657) located adjacent to telomeric repeats or X element combinatorial repeats, either as a single copy or tandem repeat of two to four copies. (http:http://www.yeastgenome.org/help/glossary.html)
   * (http://purl.obolibrary.org/obo/SO_0001485)
   */
  public static Resource Y_prime_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001485");
  }

  /**
   * The status of a whole genome sequence, where the data is minimally filtered or un-filtered, from any number of sequencing platforms, and is assembled into contigs. Genome sequence of this quality may harbour regions of poor quality and can be relatively incomplete. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001486)
   */
  public static Resource standard_draft() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001486");
  }

  /**
   * The status of a whole genome sequence, where overall coverage represents at least 90 percent of the genome. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001487)
   */
  public static Resource high_quality_draft() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001487");
  }

  /**
   * The status of a whole genome sequence, where additional work has been performed, using either manual or automated methods, such as gap resolution. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001488)
   */
  public static Resource improved_high_quality_draft() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001488");
  }

  /**
   * The status of a whole genome sequence,where annotation, and verification of coding regions has occurred. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001489)
   */
  public static Resource annotation_directed_improved_draft() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001489");
  }

  /**
   * The status of a whole genome sequence, where the assembly is high quality, closure approaches have been successful for most gaps, misassemblies and low quality regions. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001490)
   */
  public static Resource noncontiguous_finished() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001490");
  }

  /**
   * The status of a whole genome sequence, with less than 1 error per 100,000 base pairs. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001491)
   */
  public static Resource finished_genome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001491");
  }

  /**
   * A regulatory region that is part of an intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001492)
   */
  public static Resource intronic_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001492");
  }

  /**
   * A centromere DNA Element I (CDEI) is a conserved region, part of the centromere, consisting of a consensus region composed of 8-11bp which enables binding by the centromere binding factor 1(Cbf1p). (PMID:11222754)
   * (http://purl.obolibrary.org/obo/SO_0001493)
   */
  public static Resource centromere_DNA_Element_I() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001493");
  }

  /**
   * A centromere DNA Element II (CDEII) is part a conserved region of the centromere, consisting of a consensus region that is AT-rich and ~ 75-100 bp in length. (PMID:11222754)
   * (http://purl.obolibrary.org/obo/SO_0001494)
   */
  public static Resource centromere_DNA_Element_II() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001494");
  }

  /**
   * A centromere DNA Element I (CDEI) is a conserved region, part of the centromere, consisting of a consensus region that consists of a 25-bp which enables binding by the centromere DNA binding factor 3 (CBF3) complex. (PMID:11222754)
   * (http://purl.obolibrary.org/obo/SO_0001495)
   */
  public static Resource centromere_DNA_Element_III() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001495");
  }

  /**
   * The telomeric repeat is a repeat region, part of the chromosome, which in yeast, is a G-rich terminal sequence of the form (TG(1-3))n or more precisely ((TG)(1-6)TG(2-3))n. (PMID:8720065)
   * (http://purl.obolibrary.org/obo/SO_0001496)
   */
  public static Resource telomeric_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001496");
  }

  /**
   * The X element is a conserved region, of the telomere, of ~475 bp that contains an ARS sequence and in most cases an Abf1p binding site. (http://www.yeastgenome.org/help/glossary.html#xelemcoresequence)
   * (http://purl.obolibrary.org/obo/SO_0001497)
   */
  public static Resource X_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001497");
  }

  /**
   * A region of sequence from the end of a YAC clone that may provide a highly specific marker. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001498)
   */
  public static Resource YAC_end() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001498");
  }

  /**
   * The status of whole genome sequence. (DOI:10.1126)
   * (http://purl.obolibrary.org/obo/SO_0001499)
   */
  public static Resource whole_genome_sequence_status() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001499");
  }

  /**
   * A biological_region characterized as a single heritable trait in a phenotype screen. The heritable phenotype may be mapped to a chromosome but generally has not been characterized to a specific gene locus. (JAX:hdene)
   * (http://purl.obolibrary.org/obo/SO_0001500)
   */
  public static Resource heritable_phenotypic_marker() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001500");
  }

  /**
   * A collection of peptide sequences. (BBOP:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001501)
   */
  public static Resource peptide_collection() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001501");
  }

  /**
   * An experimental feature with high sequence identity to another sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001502)
   */
  public static Resource high_identity_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001502");
  }

  /**
   * A transcript for which no open reading frame has been identified and for which no other function has been determined. (MGI:hdeen)
   * (http://purl.obolibrary.org/obo/SO_0001503)
   */
  public static Resource processed_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001503");
  }

  /**
   * A chromosome variation derived from an event during meiosis. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001504)
   */
  public static Resource assortment_derived_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001504");
  }

  /**
   * A collection of sequences (often chromosomes) taken as the standard for a given organism and genome assembly. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001505)
   */
  public static Resource reference_genome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001505");
  }

  /**
   * A collection of sequences (often chromosomes) of an individual. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001506)
   */
  public static Resource variant_genome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001506");
  }

  /**
   * A collection of one or more sequences of an individual. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001507)
   */
  public static Resource variant_collection() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001507");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001508)
   */
  public static Resource alteration_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001508");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001509)
   */
  public static Resource chromosomal_variation_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001509");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001510)
   */
  public static Resource intrachromosomal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001510");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001511)
   */
  public static Resource interchromosomal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001511");
  }

  /**
   * A quality of a chromosomal insertion,. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001512)
   */
  public static Resource insertion_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001512");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001513)
   */
  public static Resource tandem() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001513");
  }

  /**
   * A quality of an insertion where the insert is not in a cytologically inverted orientation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001514)
   */
  public static Resource direct() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001514");
  }

  /**
   * A quality of an insertion where the insert is in a cytologically inverted orientation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001515)
   */
  public static Resource inverted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001515");
  }

  /**
   * The quality of a duplication where the new region exists independently of the original. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001516)
   */
  public static Resource free() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001516");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001517)
   */
  public static Resource inversion_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001517");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001518)
   */
  public static Resource pericentric() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001518");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001519)
   */
  public static Resource paracentric() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001519");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001520)
   */
  public static Resource translocaton_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001520");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001521)
   */
  public static Resource reciprocal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001521");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001522)
   */
  public static Resource insertional() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001522");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001523)
   */
  public static Resource duplication_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001523");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001524)
   */
  public static Resource chromosomally_aberrant_genome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001524");
  }

  /**
   * A region of sequence where the final nucleotide assignment differs from the original assembly due to an improvement that replaces a mistake. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001525)
   */
  public static Resource assembly_error_correction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001525");
  }

  /**
   * A region of sequence where the final nucleotide assignment is different from that given by the base caller due to an improvement that replaces a mistake. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001526)
   */
  public static Resource base_call_error_correction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001526");
  }

  /**
   * A region of peptide sequence used to target the polypeptide molecule to a specific organelle. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001527)
   */
  public static Resource peptide_localization_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001527");
  }

  /**
   * A polypeptide region that targets a polypeptide to the nucleus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001528)
   */
  public static Resource nuclear_localization_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001528");
  }

  /**
   * A polypeptide region that targets a polypeptide to the endosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001529)
   */
  public static Resource endosomal_localization_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001529");
  }

  /**
   * A polypeptide region that targets a polypeptide to the lysosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001530)
   */
  public static Resource lysosomal_localization_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001530");
  }

  /**
   * A polypeptide region that targets a polypeptide to he cytoplasm. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001531)
   */
  public static Resource nuclear_export_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001531");
  }

  /**
   * A region recognized by a recombinase. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001532)
   */
  public static Resource recombination_signal_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001532");
  }

  /**
   * A splice site that is in part of the transcript not normally spliced. They occur via mutation or transcriptional error. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001533)
   */
  public static Resource cryptic_splice_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001533");
  }

  /**
   * A polypeptide region that targets a polypeptide to the nuclear rim. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001534)
   */
  public static Resource nuclear_rim_localization_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001534");
  }

  /**
   * A P_element is a DNA transposon responsible for hybrid dysgenesis. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001535)
   */
  public static Resource p_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001535");
  }

  /**
   * A sequence variant in which the function of a gene product is altered with respect to a reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001536)
   */
  public static Resource functional_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001536");
  }

  /**
   * A sequence variant that changes one or more sequence features. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001537)
   */
  public static Resource structural_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001537");
  }

  /**
   * A sequence variant which alters the functioning of a transcript with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001538)
   */
  public static Resource transcript_function_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001538");
  }

  /**
   * A sequence variant that affects the functioning of a translational product with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001539)
   */
  public static Resource translational_product_function_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001539");
  }

  /**
   * A sequence variant which alters the level of a transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001540)
   */
  public static Resource level_of_transcript_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001540");
  }

  /**
   * A sequence variant that increases the level of mature, spliced and processed RNA with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001541)
   */
  public static Resource decreased_transcript_level_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001541");
  }

  /**
   * A sequence variant that increases the level of mature, spliced and processed RNA with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001542)
   */
  public static Resource increased_transcript_level_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001542");
  }

  /**
   * A sequence variant that affects the post transcriptional processing of a transcript with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001543)
   */
  public static Resource transcript_processing_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001543");
  }

  /**
   * A transcript processing variant whereby the process of editing is disrupted with respect to the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001544)
   */
  public static Resource editing_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001544");
  }

  /**
   * A sequence variant that changes polyadenylation with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001545)
   */
  public static Resource polyadenylation_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001545");
  }

  /**
   * A variant that changes the stability of a transcript with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001546)
   */
  public static Resource transcript_stability_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001546");
  }

  /**
   * A sequence variant that decreases transcript stability with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001547)
   */
  public static Resource decreased_transcript_stability_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001547");
  }

  /**
   * A sequence variant that increases transcript stability with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001548)
   */
  public static Resource increased_transcript_stability_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001548");
  }

  /**
   * A variant that changes alters the transcription of a transcript with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001549)
   */
  public static Resource transcription_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001549");
  }

  /**
   * A sequence variant that changes the rate of transcription with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001550)
   */
  public static Resource rate_of_transcription_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001550");
  }

  /**
   * A sequence variant that increases the rate of transcription with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001551)
   */
  public static Resource increased_transcription_rate_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001551");
  }

  /**
   * A sequence variant that decreases the rate of transcription with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001552)
   */
  public static Resource decreased_transcription_rate_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001552");
  }

  /**
   * A functional variant that changes the translational product level with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001553)
   */
  public static Resource translational_product_level_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001553");
  }

  /**
   * A sequence variant which changes polypeptide functioning with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001554)
   */
  public static Resource polypeptide_function_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001554");
  }

  /**
   * A sequence variant which decreases the translational product level with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001555)
   */
  public static Resource decreased_translational_product_level() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001555");
  }

  /**
   * A sequence variant which increases the translational product level with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001556)
   */
  public static Resource increased_translational_product_level() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001556");
  }

  /**
   * A sequence variant which causes gain of polypeptide function with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001557)
   */
  public static Resource polypeptide_gain_of_function_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001557");
  }

  /**
   * A sequence variant which changes the localization of a polypeptide with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001558)
   */
  public static Resource polypeptide_localization_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001558");
  }

  /**
   * A sequence variant that causes the loss of a polypeptide function with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001559)
   */
  public static Resource polypeptide_loss_of_function_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001559");
  }

  /**
   * A sequence variant that causes the inactivation of a ligand binding site with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001560)
   */
  public static Resource inactive_ligand_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001560");
  }

  /**
   * A sequence variant that causes some but not all loss of polypeptide function with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001561)
   */
  public static Resource polypeptide_partial_loss_of_function() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001561");
  }

  /**
   * A sequence variant that causes a change in post translational processing of the peptide with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001562)
   */
  public static Resource polypeptide_post_translational_processing_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001562");
  }

  /**
   * A sequence variant where copies of a feature (CNV) are either increased or decreased. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001563)
   */
  public static Resource copy_number_change() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001563");
  }

  /**
   * A sequence variant where the structure of the gene is changed. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001564)
   */
  public static Resource gene_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001564");
  }

  /**
   * A sequence variant whereby a two genes have become joined. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001565)
   */
  public static Resource gene_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001565");
  }

  /**
   * A sequence variant located within a regulatory region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001566)
   */
  public static Resource regulatory_region_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001566");
  }

  /**
   * A sequence variant where at least one base in the terminator codon is changed, but the terminator remains. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001567)
   */
  public static Resource stop_retained_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001567");
  }

  /**
   * A sequence variant that changes the process of splicing. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001568)
   */
  public static Resource splicing_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001568");
  }

  /**
   * A sequence variant causing a new (functional) splice site. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_0001569)
   */
  public static Resource cryptic_splice_site_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001569");
  }

  /**
   * A sequence variant whereby a new splice site is created due to the activation of a new acceptor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001570)
   */
  public static Resource cryptic_splice_acceptor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001570");
  }

  /**
   * A sequence variant whereby a new splice site is created due to the activation of a new donor. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001571)
   */
  public static Resource cryptic_splice_donor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001571");
  }

  /**
   * A sequence variant whereby an exon is lost from the transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001572)
   */
  public static Resource exon_loss() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001572");
  }

  /**
   * A sequence variant whereby an intron is gained by the processed transcript; usually a result of an alteration of the donor or acceptor. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_0001573)
   */
  public static Resource intron_gain() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001573");
  }

  /**
   * A splice variant that changes the 2 base region at the 3" end of an intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001574)
   */
  public static Resource splice_acceptor_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001574");
  }

  /**
   * A splice variant that changes the2 base region at the 5" end of an intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001575)
   */
  public static Resource splice_donor_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001575");
  }

  /**
   * A sequence variant that changes the structure of the transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001576)
   */
  public static Resource transcript_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001576");
  }

  /**
   * A transcript variant with a complex INDEL- Insertion or deletion that spans an exon/intron border or a coding sequence/UTR border. (http://ensembl.org/info/docs/variation/index.html)
   * (http://purl.obolibrary.org/obo/SO_0001577)
   */
  public static Resource complex_transcript_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001577");
  }

  /**
   * A sequence variant where at least one base of the terminator codon (stop) is changed, resulting in an elongated transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001578)
   */
  public static Resource stop_lost() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001578");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001579)
   */
  public static Resource transcript_sequence_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001579");
  }

  /**
   * A sequence variant that changes the coding sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001580)
   */
  public static Resource coding_sequence_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001580");
  }

  /**
   * A codon variant that changes at least one base of the first codon of a transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001582)
   */
  public static Resource initiator_codon_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001582");
  }

  /**
   * A sequence variant, that changes one or more bases, resulting in a different amino acid sequence but where the length is preserved. (EBI:fc, EBI:gr, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001583)
   */
  public static Resource missense_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001583");
  }

  /**
   * A sequence variant whereby at least one base of a codon is changed resulting in a codon that encodes for a different but similar amino acid. These variants may or may not be deleterious. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001585)
   */
  public static Resource conservative_missense_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001585");
  }

  /**
   * A sequence variant whereby at least one base of a codon is changed resulting in a codon that encodes for an amino acid with different biochemical properties. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001586)
   */
  public static Resource non_conservative_missense_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001586");
  }

  /**
   * A sequence variant whereby at least one base of a codon is changed, resulting in a premature stop codon, leading to a shortened transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001587)
   */
  public static Resource stop_gained() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001587");
  }

  /**
   * A sequence variant which causes a disruption of the translational reading frame, because the number of nucleotides inserted or deleted is not a multiple of three. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001589)
   */
  public static Resource frameshift_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001589");
  }

  /**
   * A sequence variant whereby at least one of the bases in the terminator codon is changed. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001590)
   */
  public static Resource terminator_codon_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001590");
  }

  /**
   * A sequence variant that reverts the sequence of a previous frameshift mutation back to the initial frame. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001591)
   */
  public static Resource frame_restoring_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001591");
  }

  /**
   * A sequence variant which causes a disruption of the translational reading frame, by shifting one base ahead. (http://arjournals.annualreviews.org/doi/pdf/10.1146/annurev.ge.08.120174.001535)
   * (http://purl.obolibrary.org/obo/SO_0001592)
   */
  public static Resource minus_1_frameshift_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001592");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001593)
   */
  public static Resource minus_2_frameshift_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001593");
  }

  /**
   * A sequence variant which causes a disruption of the translational reading frame, by shifting one base backward. (http://arjournals.annualreviews.org/doi/pdf/10.1146/annurev.ge.08.120174.001535)
   * (http://purl.obolibrary.org/obo/SO_0001594)
   */
  public static Resource plus_1_frameshift_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001594");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001595)
   */
  public static Resource plus_2_frameshift_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001595");
  }

  /**
   * A sequence variant within a transcript that changes the secondary structure of the RNA product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001596)
   */
  public static Resource transcript_secondary_structure_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001596");
  }

  /**
   * A secondary structure variant that compensate for the change made by a previous variant. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001597)
   */
  public static Resource compensatory_transcript_secondary_structure_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001597");
  }

  /**
   * A sequence variant within the transcript that changes the structure of the translational product. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001598)
   */
  public static Resource translational_product_structure_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001598");
  }

  /**
   * A sequence variant that changes the resulting polypeptide structure. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001599)
   */
  public static Resource a_D_polypeptide_structure_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001599");
  }

  /**
   * A sequence variant that changes the resulting polypeptide structure. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001600)
   */
  public static Resource complex_3D_structural_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001600");
  }

  /**
   * A sequence variant in the CDS region that causes a conformational change in the resulting polypeptide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001601)
   */
  public static Resource conformational_change_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001601");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001602)
   */
  public static Resource complex_change_of_translational_product_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001602");
  }

  /**
   * A sequence variant with in the CDS that causes a change in the resulting polypeptide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001603)
   */
  public static Resource polypeptide_sequence_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001603");
  }

  /**
   * A sequence variant within a CDS resulting in the loss of an amino acid from the resulting polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001604)
   */
  public static Resource amino_acid_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001604");
  }

  /**
   * A sequence variant within a CDS resulting in the gain of an amino acid to the resulting polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001605)
   */
  public static Resource amino_acid_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001605");
  }

  /**
   * A sequence variant of a codon resulting in the substitution of one amino acid for another in the resulting polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001606)
   */
  public static Resource amino_acid_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001606");
  }

  /**
   * A sequence variant of a codon causing the substitution of a similar amino acid for another in the resulting polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001607)
   */
  public static Resource conservative_amino_acid_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001607");
  }

  /**
   * A sequence variant of a codon causing the substitution of a non conservative amino acid for another in the resulting polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001608)
   */
  public static Resource non_conservative_amino_acid_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001608");
  }

  /**
   * A sequence variant with in the CDS that causes elongation of the resulting polypeptide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001609)
   */
  public static Resource elongated_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001609");
  }

  /**
   * A sequence variant with in the CDS that causes elongation of the resulting polypeptide sequence at the C terminus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001610)
   */
  public static Resource elongated_polypeptide_C_terminal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001610");
  }

  /**
   * A sequence variant with in the CDS that causes elongation of the resulting polypeptide sequence at the N terminus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001611)
   */
  public static Resource elongated_polypeptide_N_terminal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001611");
  }

  /**
   * A sequence variant with in the CDS that causes in frame elongation of the resulting polypeptide sequence at the C terminus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001612)
   */
  public static Resource elongated_in_frame_polypeptide_C_terminal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001612");
  }

  /**
   * A sequence variant with in the CDS that causes out of frame elongation of the resulting polypeptide sequence at the C terminus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001613)
   */
  public static Resource elongated_out_of_frame_polypeptide_C_terminal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001613");
  }

  /**
   * A sequence variant with in the CDS that causes in frame elongation of the resulting polypeptide sequence at the N terminus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001614)
   */
  public static Resource elongated_in_frame_polypeptide_N_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001614");
  }

  /**
   * A sequence variant with in the CDS that causes out of frame elongation of the resulting polypeptide sequence at the N terminus. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001615)
   */
  public static Resource elongated_out_of_frame_polypeptide_N_terminal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001615");
  }

  /**
   * A sequence variant that causes a fusion of two polypeptide sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001616)
   */
  public static Resource polypeptide_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001616");
  }

  /**
   * A sequence variant of the CD that causes a truncation of the resulting polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001617)
   */
  public static Resource polypeptide_truncation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001617");
  }

  /**
   * A sequence variant that causes the inactivation of a catalytic site with respect to a reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001618)
   */
  public static Resource inactive_catalytic_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001618");
  }

  /**
   * A transcript variant of a non coding RNA gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001619)
   */
  public static Resource nc_transcript_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001619");
  }

  /**
   * A transcript variant located with the sequence of the mature miRNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001620)
   */
  public static Resource mature_miRNA_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001620");
  }

  /**
   * A variant in a transcript that is the target of NMD. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001621)
   */
  public static Resource NMD_transcript_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001621");
  }

  /**
   * A transcript variant that is located within the UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001622)
   */
  public static Resource UTR_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001622");
  }

  /**
   * A UTR variant of the 5" UTR. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001623)
   */
  public static Resource a_prime_UTR_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001623");
  }

  /**
   * A sequence variant where at least one base of the final codon of an incompletely annotated transcript is changed. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001626)
   */
  public static Resource incomplete_terminal_codon_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001626");
  }

  /**
   * A transcript variant occurring within an intron. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001627)
   */
  public static Resource intron_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001627");
  }

  /**
   * A sequence variant located in the intergenic region, between genes. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001628)
   */
  public static Resource intergenic_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001628");
  }

  /**
   * A sequence variant that changes the first two or last two bases of an intron, or the 5th base from the start of the intron in the orientation of the transcript. (http://ensembl.org/info/docs/variation/index.html)
   * (http://purl.obolibrary.org/obo/SO_0001629)
   */
  public static Resource splice_site_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001629");
  }

  /**
   * A sequence variant in which a change has occurred within the region of the splice site, either within 1-3 bases of the exon or 3-8 bases of the intron. (http://ensembl.org/info/docs/variation/index.html)
   * (http://purl.obolibrary.org/obo/SO_0001630)
   */
  public static Resource splice_region_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001630");
  }

  /**
   * A sequence variant located 5" of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001631)
   */
  public static Resource upstream_gene_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001631");
  }

  /**
   * A sequence variant located 3" of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001632)
   */
  public static Resource downstream_gene_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001632");
  }

  /**
   * A sequence variant located within 5 KB of the end of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001633)
   */
  public static Resource a_KB_downstream_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001633");
  }

  /**
   * A sequence variant located within a half KB of the end of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001634)
   */
  public static Resource a_B_downstream_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001634");
  }

  /**
   * A sequence variant located within 5KB 5" of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001635)
   */
  public static Resource a_KB_upstream_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001635");
  }

  /**
   * A gene that encodes for ribosomal RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001637)
   */
  public static Resource rRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001637");
  }

  /**
   * A gene that encodes for an piwi associated RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001638)
   */
  public static Resource piRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001638");
  }

  /**
   * A gene that encodes an RNase P RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001639)
   */
  public static Resource RNase_P_RNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001639");
  }

  /**
   * A gene that encodes a RNase_MRP_RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001640)
   */
  public static Resource RNase_MRP_RNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001640");
  }

  /**
   * A gene that encodes large intervening non-coding RNA. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001641)
   */
  public static Resource lincRNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001641");
  }

  /**
   * A mathematically defined repeat (MDR) is a experimental feature that is determined by querying overlapping oligomers of length k against a database of shotgun sequence data and identifying regions in the query sequence that exceed a statistically determined threshold of repetitiveness. (SO:jestill)
   * (http://purl.obolibrary.org/obo/SO_0001642)
   */
  public static Resource mathematically_defined_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001642");
  }

  /**
   * A telomerase RNA gene is a non coding RNA gene the RNA product of which is a component of telomerase. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001643)
   */
  public static Resource telomerase_RNA_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001643");
  }

  /**
   * An engineered vector that is able to take part in homologous recombination in a host with the intent of introducing site specific genomic modifications. (MGD:tm, PMID:10354467)
   * (http://purl.obolibrary.org/obo/SO_0001644)
   */
  public static Resource targeting_vector() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001644");
  }

  /**
   * A measurable sequence feature that varies within a population. (SO:db)
   * (http://purl.obolibrary.org/obo/SO_0001645)
   */
  public static Resource genetic_marker() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001645");
  }

  /**
   * A genetic marker, discovered using Diversity Arrays Technology (DArT) technology. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001646)
   */
  public static Resource DArT_marker() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001646");
  }

  /**
   * A kind of ribosome entry site, specific to Eukaryotic organisms that overlaps part of both 5" UTR and CDS sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001647)
   */
  public static Resource kozak_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001647");
  }

  /**
   * A sequence variant which does not cause a disruption of the translational reading frame. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001650)
   */
  public static Resource inframe_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001650");
  }

  /**
   * A transcription factor binding site of variable direct repeats of the sequence PuGGTCA spaced by five nucleotides (DR5) found in the promoters of retinoic acid-responsive genes, to which retinoic acid receptors bind. (PMID:11327309, PMID:19917671)
   * (http://purl.obolibrary.org/obo/SO_0001653)
   */
  public static Resource retinoic_acid_responsive_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001653");
  }

  /**
   * A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001654)
   */
  public static Resource nucleotide_to_protein_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001654");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with nucleotide residues. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001655)
   */
  public static Resource nucleotide_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001655");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with metal ions. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001656)
   */
  public static Resource metal_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001656");
  }

  /**
   * A binding site that, in the molecule, interacts selectively and non-covalently with a small molecule such as a drug, or hormone. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001657)
   */
  public static Resource ligand_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001657");
  }

  /**
   * An NTR is a nested repeat of two distinct tandem motifs interspersed with each other. (SO:AF)
   * (http://purl.obolibrary.org/obo/SO_0001658)
   */
  public static Resource nested_tandem_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001658");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001659)
   */
  public static Resource promoter_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001659");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001660)
   */
  public static Resource core_promoter_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001660");
  }

  /**
   * A TATA box core promoter of a gene transcribed by RNA polymerase II. (PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0001661)
   */
  public static Resource RNA_polymerase_II_TATA_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001661");
  }

  /**
   * A TATA box core promoter of a gene transcribed by RNA polymerase III. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001662)
   */
  public static Resource RNA_polymerase_III_TATA_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001662");
  }

  /**
   * A core TRNA polymerase II promoter element with consensus (G/A)T(T/G/A)(T/A)(G/T)(T/G)(T/G). (PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0001663)
   */
  public static Resource BREd_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001663");
  }

  /**
   * A discontinuous core element of RNA polymerase II transcribed genes, situated downstream of the TSS. It is composed of three sub elements: SI, SII and SIII. (PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0001664)
   */
  public static Resource DCE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001664");
  }

  /**
   * A sub element of the DCE core promoter element, with consensus sequence CTTC. (PMID:16858867, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001665)
   */
  public static Resource DCE_SI() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001665");
  }

  /**
   * A sub element of the DCE core promoter element with consensus sequence CTGT. (PMID:16858867, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001666)
   */
  public static Resource DCE_SII() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001666");
  }

  /**
   * A sub element of the DCE core promoter element with consensus sequence AGC. (PMID:16858867, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001667)
   */
  public static Resource DCE_SIII() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001667");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001668)
   */
  public static Resource proximal_promoter_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001668");
  }

  /**
   * The minimal portion of the promoter required to properly initiate transcription in RNA polymerase II transcribed genes. (PMID:16858867)
   * (http://purl.obolibrary.org/obo/SO_0001669)
   */
  public static Resource RNApol_II_core_promoter() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001669");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001670)
   */
  public static Resource distal_promoter_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001670");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001671)
   */
  public static Resource bacterial_RNApol_promoter_sigma_70() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001671");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001672)
   */
  public static Resource bacterial_RNApol_promoter_sigma54() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001672");
  }

  /**
   * A conserved region about 12-bp upstream of the start point of bacterial transcription units, involved with sigma factor 54. (PMID:18331472)
   * (http://purl.obolibrary.org/obo/SO_0001673)
   */
  public static Resource minus_12_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001673");
  }

  /**
   * A conserved region about 12-bp upstream of the start point of bacterial transcription units, involved with sigma factor 54. (PMID:18331472)
   * (http://purl.obolibrary.org/obo/SO_0001674)
   */
  public static Resource minus_24_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001674");
  }

  /**
   * An A box within an RNA polymerase III type 1 promoter. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001675)
   */
  public static Resource A_box_type_1() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001675");
  }

  /**
   * An A box within an RNA polymerase III type 2 promoter. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001676)
   */
  public static Resource A_box_type_2() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001676");
  }

  /**
   * A core promoter region of RNA polymerase III type 1 promoters. (PMID:12381659)
   * (http://purl.obolibrary.org/obo/SO_0001677)
   */
  public static Resource intermediate_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001677");
  }

  /**
   * A promoter element that is not part of the core promoter, but provides the promoter with a specific regulatory region. (PMID:12381659)
   * (http://purl.obolibrary.org/obo/SO_0001678)
   */
  public static Resource regulatory_promoter_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001678");
  }

  /**
   * A regulatory region that is involved in the control of the process of transcription. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001679)
   */
  public static Resource transcription_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001679");
  }

  /**
   * A regulatory region that is involved in the control of the process of translation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001680)
   */
  public static Resource translation_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001680");
  }

  /**
   * A regulatory region that is involved in the control of the process of recombination. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001681)
   */
  public static Resource recombination_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001681");
  }

  /**
   * A regulatory region that is involved in the control of the process of nucleotide replication. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001682)
   */
  public static Resource replication_regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001682");
  }

  /**
   * A sequence motif is a nucleotide or amino-acid sequence pattern that may have biological significance. (http://en.wikipedia.org/wiki/Sequence_motif)
   * (http://purl.obolibrary.org/obo/SO_0001683)
   */
  public static Resource sequence_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001683");
  }

  /**
   * An attribute of an experimentally derived feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001684)
   */
  public static Resource experimental_feature_attribute() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001684");
  }

  /**
   * The score of an experimentally derived feature such as a p-value. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001685)
   */
  public static Resource score() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001685");
  }

  /**
   * An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001686)
   */
  public static Resource quality_value() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001686");
  }

  /**
   * The nucleotide region (usually a palindrome) that is recognized by a restriction enzyme. This may or may not be equal to the restriction enzyme binding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001687)
   */
  public static Resource restriction_enzyme_recognition_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001687");
  }

  /**
   * The boundary at which a restriction enzyme breaks the nucleotide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001688)
   */
  public static Resource restriction_enzyme_cleavage_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001688");
  }

  /**
   * The restriction enzyme cleavage junction on the 5" strand of the nucleotide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001689)
   */
  public static Resource five_prime_restriction_enzyme_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001689");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001690)
   */
  public static Resource three_prime_restriction_enzyme_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001690");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001691)
   */
  public static Resource blunt_end_restriction_enzyme_cleavage_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001691");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001692)
   */
  public static Resource sticky_end_restriction_enzyme_cleavage_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001692");
  }

  /**
   * A restriction enzyme cleavage site where both strands are cut at the same position. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001693)
   */
  public static Resource blunt_end_restriction_enzyme_cleavage_junction() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001693");
  }

  /**
   * A restriction enzyme cleavage site whereby only one strand is cut. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001694)
   */
  public static Resource single_strand_restriction_enzyme_cleavage_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001694");
  }

  /**
   * A terminal region of DNA sequence where the end of the region is not blunt ended. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001695)
   */
  public static Resource restriction_enzyme_single_strand_overhang() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001695");
  }

  /**
   * A region that has been implicated in binding although the exact coordinates of binding may be unknown. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001696)
   */
  public static Resource experimentally_defined_binding_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001696");
  }

  /**
   * A region of sequence identified by CHiP seq technology to contain a protein binding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001697)
   */
  public static Resource ChIP_seq_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001697");
  }

  /**
   * \"A primer containing an SNV at the 3" end for accurate genotyping. (http://www.ncbi.nlm.nih.gov/pubmed/11252801)
   * (http://purl.obolibrary.org/obo/SO_0001698)
   */
  public static Resource ASPE_primer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001698");
  }

  /**
   * A primer with one or more mis-matches to the DNA template corresponding to a position within a restriction enzyme recognition site. (http://www.ncbi.nlm.nih.gov/pubmed/9628033)
   * (http://purl.obolibrary.org/obo/SO_0001699)
   */
  public static Resource dCAPS_primer() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001699");
  }

  /**
   * Histone modification is a post translationally modified region whereby residues of the histone protein are modified by methylation, acetylation, phosphorylation, ubiquitination, sumoylation, citrullination, or ADP-ribosylation. (http:en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001700)
   */
  public static Resource histone_modification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001700");
  }

  /**
   * A histone modification site where the modification is the methylation of the residue. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001701)
   */
  public static Resource histone_methylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001701");
  }

  /**
   * A histone modification where the modification is the acylation of the residue. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001702)
   */
  public static Resource histone_acetylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001702");
  }

  /**
   * A kind of histone modification site, whereby the 9th residue (a lysine), from the start of the H3 histone protein is acylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001703)
   */
  public static Resource H3K9_acetylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001703");
  }

  /**
   * A kind of histone modification site, whereby the 14th residue (a lysine), from the start of the H3 histone protein is acylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001704)
   */
  public static Resource H3K14_acetylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001704");
  }

  /**
   * A kind of histone modification, whereby the 4th residue (a lysine), from the start of the H3 protein is mono-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001705)
   */
  public static Resource H3K4_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001705");
  }

  /**
   * A kind of histone modification site, whereby the 4th residue (a lysine), from the start of the H3 protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001706)
   */
  public static Resource H3K4_trimethylation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001706");
  }

  /**
   * A kind of histone modification site, whereby the 9th residue (a lysine), from the start of the H3 histone protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001707)
   */
  public static Resource H3K9_trimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001707");
  }

  /**
   * A kind of histone modification site, whereby the 27th residue (a lysine), from the start of the H3 histone protein is mono-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001708)
   */
  public static Resource H3K27_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001708");
  }

  /**
   * A kind of histone modification site, whereby the 27th residue (a lysine), from the start of the H3 histone protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001709)
   */
  public static Resource H3K27_trimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001709");
  }

  /**
   * A kind of histone modification site, whereby the 79th residue (a lysine), from the start of the H3 histone protein is mono- methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001710)
   */
  public static Resource H3K79_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001710");
  }

  /**
   * A kind of histone modification site, whereby the 79th residue (a lysine), from the start of the H3 histone protein is di-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001711)
   */
  public static Resource H3K79_dimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001711");
  }

  /**
   * A kind of histone modification site, whereby the 79th residue (a lysine), from the start of the H3 histone protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001712)
   */
  public static Resource H3K79_trimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001712");
  }

  /**
   * A kind of histone modification site, whereby the 20th residue (a lysine), from the start of the H34histone protein is mono-methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001713)
   */
  public static Resource H4K20_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001713");
  }

  /**
   * A kind of histone modification site, whereby the 5th residue (a lysine), from the start of the H2B protein is methylated. (http://en.wikipedia.org/wiki/Histone)
   * (http://purl.obolibrary.org/obo/SO_0001714)
   */
  public static Resource H2BK5_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001714");
  }

  /**
   * An ISRE is a transcriptional cis regulatory region, containing the consensus region: YAGTTTC(A/T)YTTTYCC, responsible for increased transcription via interferon binding. (http://genesdev.cshlp.org/content/2/4/383.abstrac)
   * (http://purl.obolibrary.org/obo/SO_0001715)
   */
  public static Resource ISRE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001715");
  }

  /**
   * A histone modification site where ubiquitin may be added. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001716)
   */
  public static Resource histone_ubiqitination_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001716");
  }

  /**
   * A histone modification site on H2B where ubiquitin may be added. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001717)
   */
  public static Resource H2B_ubiquitination_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001717");
  }

  /**
   * A kind of histone modification site, whereby the 14th residue (a lysine), from the start of the H3 histone protein is acylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001718)
   */
  public static Resource H3K18_acetylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001718");
  }

  /**
   * A kind of histone modification, whereby the 23rd residue (a lysine), from the start of the H3 histone protein is acylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001719)
   */
  public static Resource H3K23_acylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001719");
  }

  /**
   * A biological region implicated in inherited changes caused by mechanisms other than changes in the underlying DNA sequence. (http://en.wikipedia.org/wiki/Epigenetics, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001720)
   */
  public static Resource epigenetically_modified_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001720");
  }

  /**
   * A kind of histone modification site, whereby the 27th residue (a lysine), from the start of the H3 histone protein is acylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001721)
   */
  public static Resource H3K27_acylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001721");
  }

  /**
   * A kind of histone modification site, whereby the 36th residue (a lysine), from the start of the H3 histone protein is mono-methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001722)
   */
  public static Resource H3K36_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001722");
  }

  /**
   * A kind of histone modification site, whereby the 36th residue (a lysine), from the start of the H3 histone protein is dimethylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001723)
   */
  public static Resource H3K36_dimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001723");
  }

  /**
   * A kind of histone modification site, whereby the 36th residue (a lysine), from the start of the H3 histone protein is tri-methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001724)
   */
  public static Resource H3K36_trimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001724");
  }

  /**
   * A kind of histone modification site, whereby the 4th residue (a lysine), from the start of the H3 histone protein is di-methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001725)
   */
  public static Resource H3K4_dimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001725");
  }

  /**
   * A kind of histone modification site, whereby the 27th residue (a lysine), from the start of the H3 histone protein is di-methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001726)
   */
  public static Resource H3K27_dimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001726");
  }

  /**
   * A kind of histone modification site, whereby the 9th residue (a lysine), from the start of the H3 histone protein is mono-methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001727)
   */
  public static Resource H3K9_monomethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001727");
  }

  /**
   * A kind of histone modification site, whereby the 9th residue (a lysine), from the start of the H3 histone protein may be dimethylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001728)
   */
  public static Resource H3K9_dimethylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001728");
  }

  /**
   * A kind of histone modification site, whereby the 16th residue (a lysine), from the start of the H4 histone protein is acylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001729)
   */
  public static Resource H4K16_acylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001729");
  }

  /**
   * A kind of histone modification site, whereby the 5th residue (a lysine), from the start of the H4 histone protein is acylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001730)
   */
  public static Resource H4K5_acylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001730");
  }

  /**
   * A kind of histone modification site, whereby the 8th residue (a lysine), from the start of the H4 histone protein is acylated. (SO:KE)
   * (http://purl.obolibrary.org/obo/SO_0001731)
   */
  public static Resource H4K8_acylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001731");
  }

  /**
   * A kind of histone modification site, whereby the 27th residue (a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001732)
   */
  public static Resource H3K27_methylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001732");
  }

  /**
   * A kind of histone modification site, whereby the 36th residue (a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001733)
   */
  public static Resource H3K36_methylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001733");
  }

  /**
   * A kind of histone modification, whereby the 4th residue (a lysine), from the start of the H3 protein is methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001734)
   */
  public static Resource H3K4_methylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001734");
  }

  /**
   * A kind of histone modification site, whereby the 79th residue (a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001735)
   */
  public static Resource H3K79_methylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001735");
  }

  /**
   * A kind of histone modification site, whereby the 9th residue (a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001736)
   */
  public static Resource H3K9_methylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001736");
  }

  /**
   * A histone modification, whereby the histone protein is acylated at multiple sites in a region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001737)
   */
  public static Resource histone_acylation_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001737");
  }

  /**
   * A region of the H4 histone whereby multiple lysines are acylated. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001738)
   */
  public static Resource H4K_acylation_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001738");
  }

  /**
   * A gene with a start codon other than AUG. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_0001739)
   */
  public static Resource gene_with_non_canonical_start_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001739");
  }

  /**
   * A gene with a translational start codon of CUG. (SO:mc)
   * (http://purl.obolibrary.org/obo/SO_0001740)
   */
  public static Resource gene_with_start_codon_CUG() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001740");
  }

  /**
   * A gene segment which when incorporated by somatic recombination in the final gene transcript results in a nonfunctional product. (SO:hd)
   * (http://purl.obolibrary.org/obo/SO_0001741)
   */
  public static Resource pseudogenic_gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001741");
  }

  /**
   * A sequence alteration whereby the copy number of a given regions is greater than the reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001742)
   */
  public static Resource copy_number_gain() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001742");
  }

  /**
   * A sequence alteration whereby the copy number of a given region is less than the reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001743)
   */
  public static Resource copy_number_loss() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001743");
  }

  /**
   * Uniparental disomy is a sequence_alteration where a diploid individual receives two copies for all or part of a chromosome from one parent and no copies of the same chromosome or region from the other parent. (SO:BM)
   * (http://purl.obolibrary.org/obo/SO_0001744)
   */
  public static Resource UPD() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001744");
  }

  /**
   * Uniparental disomy is a sequence_alteration where a diploid individual receives two copies for all or part of a chromosome from the mother and no copies of the same chromosome or region from the father. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001745)
   */
  public static Resource maternal_uniparental_disomy() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001745");
  }

  /**
   * Uniparental disomy is a sequence_alteration where a diploid individual receives two copies for all or part of a chromosome from the father and no copies of the same chromosome or region from the mother. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001746)
   */
  public static Resource paternal_uniparental_disomy() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001746");
  }

  /**
   * A DNA sequence that in the normal state of the chromosome corresponds to an unfolded, un-complexed stretch of double-stranded DNA. (SO:cb)
   * (http://purl.obolibrary.org/obo/SO_0001747)
   */
  public static Resource open_chromatin_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001747");
  }

  /**
   * A SL2_acceptor_site which appends the SL3 RNA leader sequence to the 5" end of an mRNA. SL3 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001748)
   */
  public static Resource SL3_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001748");
  }

  /**
   * A SL2_acceptor_site which appends the SL4 RNA leader sequence to the 5" end of an mRNA. SL4 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001749)
   */
  public static Resource SL4_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001749");
  }

  /**
   * A SL2_acceptor_site which appends the SL5 RNA leader sequence to the 5" end of an mRNA. SL5 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001750)
   */
  public static Resource SL5_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001750");
  }

  /**
   * A SL2_acceptor_site which appends the SL6 RNA leader sequence to the 5" end of an mRNA. SL6 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001751)
   */
  public static Resource SL6_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001751");
  }

  /**
   * A SL2_acceptor_site which appends the SL7 RNA leader sequence to the 5" end of an mRNA. SL7 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001752)
   */
  public static Resource SL7_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001752");
  }

  /**
   * A SL2_acceptor_site which appends the SL8 RNA leader sequence to the 5" end of an mRNA. SL8 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001753)
   */
  public static Resource SL8_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001753");
  }

  /**
   * A SL2_acceptor_site which appends the SL9 RNA leader sequence to the 5" end of an mRNA. SL9 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001754)
   */
  public static Resource SL9_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001754");
  }

  /**
   * A SL2_acceptor_site which appends the SL10 RNA leader sequence to the 5" end of an mRNA. SL10 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001755)
   */
  public static Resource SL10_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001755");
  }

  /**
   * A SL2_acceptor_site which appends the SL11 RNA leader sequence to the 5" end of an mRNA. SL11 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001756)
   */
  public static Resource SL11_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001756");
  }

  /**
   * A SL2_acceptor_site which appends the SL12 RNA leader sequence to the 5" end of an mRNA. SL12 acceptor sites occur in genes in internal segments of polycistronic transcripts. (SO:nlw)
   * (http://purl.obolibrary.org/obo/SO_0001757)
   */
  public static Resource SL12_acceptor_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001757");
  }

  /**
   * A pseudogene that arose via gene duplication. Generally duplicated pseudogenes have the same structure as the original gene, including intron-exon structure and some regulatory sequence. (http://en.wikipedia.org/wiki/Pseudogene)
   * (http://purl.obolibrary.org/obo/SO_0001758)
   */
  public static Resource duplicated_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001758");
  }

  /**
   * A pseudogene, deactivated from original state by mutation, fixed in a population. (http://en.wikipedia.org/wiki/Pseudogene, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001759)
   */
  public static Resource unitary_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001759");
  }

  /**
   * A pseudogene that arose from a means other than retrotransposition. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001760)
   */
  public static Resource non_processed_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001760");
  }

  /**
   * A dependent entity that inheres in a bearer, a sequence variant. (PMID:17597783, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001761)
   */
  public static Resource variant_quality() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001761");
  }

  /**
   * A quality inhering in a variant by virtue of its origin. (PMID:17597783, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001762)
   */
  public static Resource variant_origin() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001762");
  }

  /**
   * A physical quality which inheres to the variant by virtue of the number instances of the variant within a population. (PMID:17597783, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001763)
   */
  public static Resource variant_frequency() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001763");
  }

  /**
   * A physical quality which inheres to the variant by virtue of the number instances of the variant within a population. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001764)
   */
  public static Resource unique_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001764");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001765)
   */
  public static Resource rare_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001765");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001766)
   */
  public static Resource polymorphic_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001766");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001767)
   */
  public static Resource common_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001767");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001768)
   */
  public static Resource fixed_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001768");
  }

  /**
   * A quality inhering in a variant by virtue of its phenotype. (PMID:17597783, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001769)
   */
  public static Resource variant_phenotype() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001769");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001770)
   */
  public static Resource benign_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001770");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001771)
   */
  public static Resource disease_associated_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001771");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001772)
   */
  public static Resource disease_causing_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001772");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001773)
   */
  public static Resource lethal_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001773");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001774)
   */
  public static Resource quantitative_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001774");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001775)
   */
  public static Resource maternal_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001775");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001776)
   */
  public static Resource paternal_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001776");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001777)
   */
  public static Resource somatic_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001777");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001778)
   */
  public static Resource germline_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001778");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001779)
   */
  public static Resource pedigree_specific_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001779");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001780)
   */
  public static Resource population_specific_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001780");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001781)
   */
  public static Resource de_novo_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001781");
  }

  /**
   * A sequence variant located within a transcription factor binding site. (EBI:fc)
   * (http://purl.obolibrary.org/obo/SO_0001782)
   */
  public static Resource TF_binding_site_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001782");
  }

  /**
   * A structural sequence alteration or rearrangement encompassing one or more genome fragments. (NCBI:th, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001784)
   */
  public static Resource complex_structural_alteration() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001784");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001785)
   */
  public static Resource structural_alteration() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001785");
  }

  /**
   * A functional variant whereby the sequence alteration causes a loss of function of one allele of a gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001786)
   */
  public static Resource loss_of_heterozygosity() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001786");
  }

  /**
   * A sequence variant that causes a change at the 5th base pair after the start of the intron in the orientation of the transcript. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001787)
   */
  public static Resource splice_donor_5th_base_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001787");
  }

  /**
   * An U-box is a conserved T-rich region upstream of a retroviral polypurine tract that is involved in PPT primer creation during reverse transcription. (PMID:10556309, PMID:11577982, PMID:9649446)
   * (http://purl.obolibrary.org/obo/SO_0001788)
   */
  public static Resource U_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001788");
  }

  /**
   * A specialized region in the genomes of some yeast and fungi, the genes of which regulate mating type. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001789)
   */
  public static Resource mating_type_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001789");
  }

  /**
   * An assembly region that has been sequenced from both ends resulting in a read_pair (mate_pair). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001790)
   */
  public static Resource paired_end_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001790");
  }

  /**
   * A sequence variant that changes exon sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001791)
   */
  public static Resource exon_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001791");
  }

  /**
   * A sequence variant that changes non-coding exon sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001792)
   */
  public static Resource non_coding_exon_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001792");
  }

  /**
   * A read from an end of the clone sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001793)
   */
  public static Resource clone_end() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001793");
  }

  /**
   * A point centromere is a relatively small centromere (about 125 bp DNA) in discrete sequence, found in some yeast including S. cerevisiae. (PMID:7502067, SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001794)
   */
  public static Resource point_centromere() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001794");
  }

  /**
   * A regional centromere is a large modular centromere found in fission yeast and higher eukaryotes. It consist of a central core region flanked by inverted inner and outer repeat regions. (PMID:7502067, SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001795)
   */
  public static Resource regional_centromere() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001795");
  }

  /**
   * A conserved region within the central region of a modular centromere, where the kinetochore is formed. (SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001796)
   */
  public static Resource regional_centromere_central_core() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001796");
  }

  /**
   * A repeat region found within the modular centromere. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001797)
   */
  public static Resource centromeric_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001797");
  }

  /**
   * The inner inverted repeat region of a modular centromere and part of the entral core surrounding a non-conserved central region. This region is adjacent to the central core, on each chromosome arm. (SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001798)
   */
  public static Resource regional_centromere_inner_repeat_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001798");
  }

  /**
   * The heterochromatic outer repeat region of a modular centromere. These repeats exist in tandem arrays on both chromosome arms. (SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001799)
   */
  public static Resource regional_centromere_outer_repeat_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001799");
  }

  /**
   * The sequence of a 21 nucleotide double stranded, polyadenylated non coding RNA, transcribed from the TAS gene. (PMID:16145017)
   * (http://purl.obolibrary.org/obo/SO_0001800)
   */
  public static Resource tasiRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001800");
  }

  /**
   * A primary transcript encoding a tasiRNA. (PMID:16145017)
   * (http://purl.obolibrary.org/obo/SO_0001801)
   */
  public static Resource tasiRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001801");
  }

  /**
   * A transcript processing variant whereby polyadenylation of the encoded transcript is increased with respect to the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001802)
   */
  public static Resource increased_polyadenylation_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001802");
  }

  /**
   * A transcript processing variant whereby polyadenylation of the encoded transcript is decreased with respect to the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001803)
   */
  public static Resource decreased_polyadenylation_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001803");
  }

  /**
   * A conserved polypeptide motif that mediates protein-protein interaction and defines adaptor proteins for DDB1/cullin 4 ubiquitin ligases. (PMID:18794354, PMID:19818632)
   * (http://purl.obolibrary.org/obo/SO_0001804)
   */
  public static Resource DDB_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001804");
  }

  /**
   * A conserved polypeptide motif that can be recognized by both Fizzy/Cdc20- and FZR/Cdh1-activated anaphase-promoting complex/cyclosome (APC/C) and targets a protein for ubiquitination and subsequent degradation by the APC/C. The consensus sequence is RXXLXXXXN. (PMID:12208841, PMID:1842691)
   * (http://purl.obolibrary.org/obo/SO_0001805)
   */
  public static Resource destruction_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001805");
  }

  /**
   * A C-terminal tetrapeptide motif that mediates retention of a protein in (or retrieval to) the endoplasmic reticulum. In mammals the sequence is KDEL, and in fungi HDEL or DDEL. (doi:10.1093/jxb/50.331.157, PMID:2077689)
   * (http://purl.obolibrary.org/obo/SO_0001806)
   */
  public static Resource ER_retention_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001806");
  }

  /**
   * A conserved polypeptide motif that can be recognized by FZR/Cdh1-activated anaphase-promoting complex/cyclosome (APC/C) and targets a protein for ubiquitination and subsequent degradation by the APC/C. The consensus sequence is KENXXXN. (PMID:10733526, PMID:1220884, PMID:18426916)
   * (http://purl.obolibrary.org/obo/SO_0001807)
   */
  public static Resource KEN_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001807");
  }

  /**
   * A polypeptide region that targets a polypeptide to the mitochondrion. (PomBase:mah)
   * (http://purl.obolibrary.org/obo/SO_0001808)
   */
  public static Resource mitochondrial_targeting_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001808");
  }

  /**
   * A signal sequence that is not cleaved from the polypeptide. Anchors a Type II membrane protein to the membrane. (http://www.cbs.dtu.dk/services/SignalP/background/biobackground.php)
   * (http://purl.obolibrary.org/obo/SO_0001809)
   */
  public static Resource signal_anchor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001809");
  }

  /**
   * A polypeptide region that mediates binding to PCNA. The consensus sequence is QXX(hh)XX(aa), where (h) denotes residues with moderately hydrophobic side chains and (a) denotes residues with highly hydrophobic aromatic side chains. (PMID:9631646)
   * (http://purl.obolibrary.org/obo/SO_0001810)
   */
  public static Resource PIP_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001810");
  }

  /**
   * A post-translationally modified region in which residues of the protein are modified by phosphorylation. (PomBase:mah)
   * (http://purl.obolibrary.org/obo/SO_0001811)
   */
  public static Resource phosphorylation_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001811");
  }

  /**
   * A region that traverses the lipid bilayer and adopts a helical secondary structure. (PomBase:mah)
   * (http://purl.obolibrary.org/obo/SO_0001812)
   */
  public static Resource transmembrane_helix() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001812");
  }

  /**
   * A polypeptide region that targets a polypeptide to the vacuole. (PomBase:mah)
   * (http://purl.obolibrary.org/obo/SO_0001813)
   */
  public static Resource vacuolar_sorting_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001813");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001814)
   */
  public static Resource coding_variant_quality() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001814");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001815)
   */
  public static Resource synonymous() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001815");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0001816)
   */
  public static Resource non_synonymous() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001816");
  }

  /**
   * An attribute describing a sequence that contains a mutation involving the deletion or insertion of one or more bases, where this number is divisible by 3. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001817)
   */
  public static Resource inframe() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001817");
  }

  /**
   * A sequence_variant which is predicted to change the protein encoded in the coding sequence. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001818)
   */
  public static Resource protein_altering_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001818");
  }

  /**
   * A sequence variant where there is no resulting change to the encoded amino acid. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001819)
   */
  public static Resource synonymous_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001819");
  }

  /**
   * A coding sequence variant where the change does not alter the frame of the transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001820)
   */
  public static Resource inframe_indel() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001820");
  }

  /**
   * An inframe non synonymous variant that inserts bases into in the coding sequence. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001821)
   */
  public static Resource inframe_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001821");
  }

  /**
   * An inframe non synonymous variant that deletes bases from the coding sequence. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001822)
   */
  public static Resource inframe_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001822");
  }

  /**
   * An inframe increase in cds length that inserts one or more codons into the coding sequence between existing codons. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001823)
   */
  public static Resource conservative_inframe_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001823");
  }

  /**
   * An inframe_increase_in_cds_length that inserts one or more codons into the coding sequence within an existing codon. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001824)
   */
  public static Resource disruptive_inframe_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001824");
  }

  /**
   * An inframe decrease in cds length that deletes one or more entire codons from the coding sequence but does not change any remaining codons. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001825)
   */
  public static Resource conservative_inframe_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001825");
  }

  /**
   * An inframe decrease in cds length that deletes bases from the coding sequence starting within an existing codon. (EBI:gr)
   * (http://purl.obolibrary.org/obo/SO_0001826)
   */
  public static Resource disruptive_inframe_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001826");
  }

  /**
   * A sequencer read of an mRNA substrate. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001827)
   */
  public static Resource mRNA_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001827");
  }

  /**
   * A sequencer read of a genomic DNA substrate. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001828)
   */
  public static Resource genomic_DNA_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001828");
  }

  /**
   * A contig composed of mRNA_reads. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001829)
   */
  public static Resource mRNA_contig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001829");
  }

  /**
   * A PCR product obtained by applying the AFLP technique, based on a restriction enzyme digestion of genomic DNA and an amplification of the resulting fragments. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001830)
   */
  public static Resource AFLP_fragment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001830");
  }

  /**
   * A match to a protein HMM such as pfam. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001831)
   */
  public static Resource protein_hmm_match() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001831");
  }

  /**
   * A region of immunoglobulin sequence, either constant or variable. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001832)
   */
  public static Resource immunoglobulin_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001832");
  }

  /**
   * The variable region of an immunoglobulin polypeptide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001833)
   */
  public static Resource V_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001833");
  }

  /**
   * The constant region of an immunoglobulin polypeptide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001834)
   */
  public static Resource C_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001834");
  }

  /**
   * Extra nucleotides inserted between rearranged immunoglobulin segments. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001835)
   */
  public static Resource N_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001835");
  }

  /**
   * The switch region of immunoglobulin heavy chains; it is involved in the rearrangement of heavy chain DNA leading to the expression of a different immunoglobulin classes from the same B-cell. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001836)
   */
  public static Resource S_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001836");
  }

  /**
   * A kind of insertion where the inserted sequence is a mobile element. (EBI:dvga)
   * (http://purl.obolibrary.org/obo/SO_0001837)
   */
  public static Resource mobile_element_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001837");
  }

  /**
   * An insertion the sequence of which cannot be mapped to the reference genome. (NCBI:th)
   * (http://purl.obolibrary.org/obo/SO_0001838)
   */
  public static Resource novel_sequence_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001838");
  }

  /**
   * A promoter element with consensus sequence GTGRGAA, bound by CSL (CBF1/RBP-JK/Suppressor of Hairless/LAG-1) transcription factors. (PMID:19101542)
   * (http://purl.obolibrary.org/obo/SO_0001839)
   */
  public static Resource CSL_response_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001839");
  }

  /**
   * A GATA transcription factor element containing the consensus sequence WGATAR (in which W indicates A/T and R indicates A/G). (PMID:8321208)
   * (http://purl.obolibrary.org/obo/SO_0001840)
   */
  public static Resource GATA_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001840");
  }

  /**
   * Pseudogene owing to a SNP/DIP but in other individuals/haplotypes/strains the gene is translated. (JAX:hd)
   * (http://purl.obolibrary.org/obo/SO_0001841)
   */
  public static Resource polymorphic_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001841");
  }

  /**
   * A promoter element with consensus sequence TGACTCA, bound by AP-1 and related transcription factors. (PMID:1899230, PMID:3034432, PMID:3125983)
   * (http://purl.obolibrary.org/obo/SO_0001842)
   */
  public static Resource AP_1_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001842");
  }

  /**
   * A promoter element with consensus sequence TGACGTCA; bound by the ATF/CREB family of transcription factors. (PMID:11483355, PMID:11483993)
   * (http://purl.obolibrary.org/obo/SO_0001843)
   */
  public static Resource CRE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001843");
  }

  /**
   * A promoter element bound by copper ion-sensing transcription factors such as S. cerevisiae Mac1p or S. pombe Cuf1; the consensus sequence is HTHNNGCTGD (more specifically TTTGCKCR in budding yeast). (PMID:10593913, PMID:9188496, PMID:9211922)
   * (http://purl.obolibrary.org/obo/SO_0001844)
   */
  public static Resource CuRE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001844");
  }

  /**
   * A promoter element with consensus sequence CGWGGWNGMM, bound by transcription factors related to RecA and found in promoters of genes expressed following several types of DNA damage or inhibition of DNA synthesis. (PMID:11073995, PMID:8668127)
   * (http://purl.obolibrary.org/obo/SO_0001845)
   */
  public static Resource DRE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001845");
  }

  /**
   * A promoter element that has consensus sequence GTAAACAAACAAAM and contains a heptameric core GTAAACA, bound by transcription factors with a forkhead DNA-binding domain. (PMID:10747048, PMID:14871934)
   * (http://purl.obolibrary.org/obo/SO_0001846)
   */
  public static Resource FLEX_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001846");
  }

  /**
   * A promoter element with consensus sequence TTTRTTTACA, bound by transcription factors with a forkhead DNA-binding domain. (PMID:15195092)
   * (http://purl.obolibrary.org/obo/SO_0001847)
   */
  public static Resource forkhead_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001847");
  }

  /**
   * A core promoter element that has the consensus sequence CAGTCACA (or its inverted form TGTGACTG), and plays the role of a TATA box in promoters that do not contain a canonical TATA sequence. (PMID:7501449, PMID:8458332)
   * (http://purl.obolibrary.org/obo/SO_0001848)
   */
  public static Resource homol_D_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001848");
  }

  /**
   * A core promoter element that has the consensus sequence ACCCTACCCT (or its inverted form AGGGTAGGGT), and is found near the homol D box in some promoters that use a homol D box instead of a canonical TATA sequence. (PMID:7501449)
   * (http://purl.obolibrary.org/obo/SO_0001849)
   */
  public static Resource homol_E_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001849");
  }

  /**
   * A promoter element that consists of at least three copies of the pentanucleotide NGAAN, bound by the heat shock transcription factor HSF. (PMID:17347150, PMID:8689565)
   * (http://purl.obolibrary.org/obo/SO_0001850)
   */
  public static Resource HSE() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001850");
  }

  /**
   * A GATA promoter element with consensus sequence WGATAA, found in promoters of genes repressed in the presence of iron. (PMID:11956219, PMID:17211681)
   * (http://purl.obolibrary.org/obo/SO_0001851)
   */
  public static Resource iron_repressed_GATA_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001851");
  }

  /**
   * A promoter element with consensus sequence ACAAT, found in promoters of mating type M-specific genes in fission yeast and bound by the transcription factor Mat1-Mc. (PMID:9233811)
   * (http://purl.obolibrary.org/obo/SO_0001852)
   */
  public static Resource mating_type_M_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001852");
  }

  /**
   * A non-palindromic sequence found in the promoters of genes whose expression is regulated in response to androgen. (PMID:21796522)
   * (http://purl.obolibrary.org/obo/SO_0001853)
   */
  public static Resource androgen_response_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001853");
  }

  /**
   * A smFISH is a probe that binds RNA in a single molecule in situ hybridization experiment. (PMID:18806792)
   * (http://purl.obolibrary.org/obo/SO_0001854)
   */
  public static Resource smFISH_probe() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001854");
  }

  /**
   * A promoter element with consensus sequence ACGCGT, bound by the transcription factor complex MBF (MCB-binding factor) and found in promoters of genes expressed during the G1/S transition of the cell cycle. (PMID:16285853)
   * (http://purl.obolibrary.org/obo/SO_0001855)
   */
  public static Resource MCB() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001855");
  }

  /**
   * A promoter element with consensus sequence CCAAT, bound by a protein complex that represses transcription in response to low iron levels. (PMID:16963626)
   * (http://purl.obolibrary.org/obo/SO_0001856)
   */
  public static Resource CCAAT_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001856");
  }

  /**
   * A promoter element with consensus sequence CCAGCC, bound by the fungal transcription factor Ace2. (PMID:16678171)
   * (http://purl.obolibrary.org/obo/SO_0001857)
   */
  public static Resource Ace2_UAS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001857");
  }

  /**
   * A promoter element with consensus sequence TTCTTTGTTY, bound an HMG-box transcription factor such as S. pombe Ste11, and found in promoters of genes up-regulated early in meiosis. (PMID:1657709)
   * (http://purl.obolibrary.org/obo/SO_0001858)
   */
  public static Resource TR_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001858");
  }

  /**
   * A promoter element with consensus sequence CCCCTC, bound by the PKA-responsive zinc finger transcription factor Rst2. (PMID:11739717)
   * (http://purl.obolibrary.org/obo/SO_0001859)
   */
  public static Resource STREP_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001859");
  }

  /**
   * A DNA motif that contains a core consensus sequence AGGTAAGGGTAATGCAC, is found in the intergenic regions of rDNA repeats, and is bound by an RNA polymerase I transcription termination factor (e.g. S. pombe Reb1). (PMID:9016645)
   * (http://purl.obolibrary.org/obo/SO_0001860)
   */
  public static Resource rDNA_intergenic_spacer_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001860");
  }

  /**
   * A 10-bp promoter element bound by sterol regulatory element binding proteins (SREBPs), found in promoters of genes involved in sterol metabolism. Many variants of the sequence ATCACCCCAC function as SREs. (GO:mah, PMID:11111080, PMID:16537923)
   * (http://purl.obolibrary.org/obo/SO_0001861)
   */
  public static Resource sterol_regulatory_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001861");
  }

  /**
   * A dinucleotide repeat region composed of GT repeating elements. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001862)
   */
  public static Resource GT_dinucleotide_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001862");
  }

  /**
   * A trinucleotide repeat region composed of GTT repeating elements. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001863)
   */
  public static Resource GTT_trinucleotide_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001863");
  }

  /**
   * A DNA motif to which the S. pombe Sap1 protein binds. The consensus sequence is 5"-TARGCAGNTNYAACGMG-3"; it is found at the mating type locus, where it is important for mating type switching, and at replication fork barriers in rDNA repeats. (PMID:16166653, PMID:7651412)
   * (http://purl.obolibrary.org/obo/SO_0001864)
   */
  public static Resource Sap1_recognition_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001864");
  }

  /**
   * An RNA polymerase II promoter element found in the promoters of genes regulated by calcineurin. The consensus sequence is GNGGCKCA. (PMID:16928959)
   * (http://purl.obolibrary.org/obo/SO_0001865)
   */
  public static Resource CDRE_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001865");
  }

  /**
   * A contig of BAC reads. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001866)
   */
  public static Resource BAC_read_contig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001866");
  }

  /**
   * A gene suspected of being involved in the expression of a trait. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001867)
   */
  public static Resource candidate_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001867");
  }

  /**
   * A candidate gene whose association with a trait is based on the gene"s location on a chromosome. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001868)
   */
  public static Resource positional_candidate_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001868");
  }

  /**
   * A candidate gene whose function has something in common biologically with the trait under investigation. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001869)
   */
  public static Resource functional_candidate_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001869");
  }

  /**
   * A short ncRNA that is transcribed from an enhancer. May have a regulatory function. (doi:10.1038/465173a, SO:cjm)
   * (http://purl.obolibrary.org/obo/SO_0001870)
   */
  public static Resource enhancerRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001870");
  }

  /**
   * A promoter element with consensus sequence GNAACR, bound by the transcription factor complex PBF (PCB-binding factor) and found in promoters of genes expressed during the M/G1 transition of the cell cycle. (GO:mah, PMID:12411492)
   * (http://purl.obolibrary.org/obo/SO_0001871)
   */
  public static Resource PCB() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001871");
  }

  /**
   * A region of a chromosome, where the chromosome has undergone a large structural rearrangement that altered the genome organization. There is no longer synteny to the reference genome. (NCBI:th, PMID:18564416)
   * (http://purl.obolibrary.org/obo/SO_0001872)
   */
  public static Resource rearrangement_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001872");
  }

  /**
   * A rearrangement breakpoint between two different chromosomes. (NCBI:th)
   * (http://purl.obolibrary.org/obo/SO_0001873)
   */
  public static Resource interchromosomal_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001873");
  }

  /**
   * A rearrangement breakpoint within the same chromosome. (NCBI:th)
   * (http://purl.obolibrary.org/obo/SO_0001874)
   */
  public static Resource intrachromosomal_breakpoint() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001874");
  }

  /**
   * A supercontig that is not been assigned to any ultracontig during a genome assembly project. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001875)
   */
  public static Resource unassigned_supercontig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001875");
  }

  /**
   * A partial DNA sequence assembly of a chromosome or full genome, which contains gaps that are filled with N"s. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001876)
   */
  public static Resource partial_genomic_sequence_assembly() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001876");
  }

  /**
   * A non-coding RNA over 200nucleotides in length. (HGNC:mw)
   * (http://purl.obolibrary.org/obo/SO_0001877)
   */
  public static Resource lnc_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001877");
  }

  /**
   * A sequence variant that falls entirely or partially within a genomic feature. (EBI:fc, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001878)
   */
  public static Resource feature_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001878");
  }

  /**
   * A sequence variant, caused by an alteration of the genomic sequence, where the deletion, is greater than the extent of the underlying genomic features. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001879)
   */
  public static Resource feature_ablation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001879");
  }

  /**
   * A sequence variant, caused by an alteration of the genomic sequence, where the structural change, an amplification of sequence, is greater than the extent of the underlying genomic features. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001880)
   */
  public static Resource feature_amplification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001880");
  }

  /**
   * A sequence variant, caused by an alteration of the genomic sequence, where the structural change, a translocation, is greater than the extent of the underlying genomic features. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001881)
   */
  public static Resource feature_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001881");
  }

  /**
   * A sequence variant, caused by an alteration of the genomic sequence, where a deletion fuses genomic features. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001882)
   */
  public static Resource feature_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001882");
  }

  /**
   * A feature translocation where the region contains a transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001883)
   */
  public static Resource transcript_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001883");
  }

  /**
   * A feature translocation where the region contains a regulatory region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001884)
   */
  public static Resource regulatory_region_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001884");
  }

  /**
   * A feature translocation where the region contains a transcription factor binding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001885)
   */
  public static Resource TFBS_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001885");
  }

  /**
   * A feature fusion where the deletion brings together transcript regions. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001886)
   */
  public static Resource transcript_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001886");
  }

  /**
   * A feature fusion where the deletion brings together regulatory regions. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001887)
   */
  public static Resource regulatory_region_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001887");
  }

  /**
   * A fusion where the deletion brings together transcription factor binding sites. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001888)
   */
  public static Resource TFBS_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001888");
  }

  /**
   * A feature amplification of a region containing a transcript. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001889)
   */
  public static Resource transcript_amplification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001889");
  }

  /**
   * A feature fusion where the deletion brings together a regulatory region and a transcript region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001890)
   */
  public static Resource transcript_regulatory_region_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001890");
  }

  /**
   * A feature amplification of a region containing a regulatory region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001891)
   */
  public static Resource regulatory_region_amplification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001891");
  }

  /**
   * A feature amplification of a region containing a transcription factor binding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001892)
   */
  public static Resource TFBS_amplification() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001892");
  }

  /**
   * A feature ablation whereby the deleted region includes a transcript feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001893)
   */
  public static Resource transcript_ablation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001893");
  }

  /**
   * A feature ablation whereby the deleted region includes a regulatory region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001894)
   */
  public static Resource regulatory_region_ablation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001894");
  }

  /**
   * A feature ablation whereby the deleted region includes a transcription factor binding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001895)
   */
  public static Resource TFBS_ablation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001895");
  }

  /**
   * A CDS that is part of a transposable element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001896)
   */
  public static Resource transposable_element_CDS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001896");
  }

  /**
   * A pseudogene contained within a transposable element. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001897)
   */
  public static Resource transposable_element_pseudogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001897");
  }

  /**
   * A repeat region which is part of the regional centromere outer repeat region. (PMID:16407326, SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001898)
   */
  public static Resource dg_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001898");
  }

  /**
   * A repeat region which is part of the regional centromere outer repeat region. (PMID:16407326, SO:vw)
   * (http://purl.obolibrary.org/obo/SO_0001899)
   */
  public static Resource dh_repeat() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001899");
  }

  /**
   * A promoter element that contains a core sequence TGACGT, bound by a protein complex that regulates transcription of genes encoding PKA pathway components. (PMID:15448137)
   * (http://purl.obolibrary.org/obo/SO_0001900)
   */
  public static Resource m26_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001900");
  }

  /**
   * A conserved 17-bp sequence (5"-ATCA(C/A)AACCCTAACCCT-3") commonly present upstream of the start site of histone transcription units functioning as a transcription factor binding site. (PMID:17452352, PMID:4092687)
   * (http://purl.obolibrary.org/obo/SO_0001901)
   */
  public static Resource AACCCT_box() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001901");
  }

  /**
   * A region surrounding a cis_splice site, either within 1-3 bases of the exon or 3-8 bases of the intron. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001902)
   */
  public static Resource splice_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001902");
  }

  /**
   * A lnc_RNA totally contained within an intron. (PMID:19071207, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001903)
   */
  public static Resource intronic_lncRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001903");
  }

  /**
   * Non-coding RNA transcribed from the opposite DNA strand compared with other transcripts and overlap in part with sense RNA. (PMID:19638999)
   * (http://purl.obolibrary.org/obo/SO_0001904)
   */
  public static Resource antisense_lncRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001904");
  }

  /**
   * A transcript that is transcribed from the outer repeat region of a regional centromere. (PomBase:mah)
   * (http://purl.obolibrary.org/obo/SO_0001905)
   */
  public static Resource regional_centromere_outer_repeat_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001905");
  }

  /**
   * A sequence variant that causes the reduction of a genomic feature, with regard to the reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001906)
   */
  public static Resource feature_truncation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001906");
  }

  /**
   * A sequence variant that causes the extension of a genomic feature, with regard to the reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001907)
   */
  public static Resource feature_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001907");
  }

  /**
   * A sequence variant that causes the extension of a genomic feature from within the feature rather than from the terminus of the feature, with regard to the reference sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001908)
   */
  public static Resource internal_feature_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001908");
  }

  /**
   * A frameshift variant that causes the translational reading frame to be extended relative to the reference feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001909)
   */
  public static Resource frameshift_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001909");
  }

  /**
   * A frameshift variant that causes the translational reading frame to be shortened relative to the reference feature. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001910)
   */
  public static Resource frameshift_truncation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001910");
  }

  /**
   * A sequence variant where copies of a feature are increased relative to the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001911)
   */
  public static Resource copy_number_increase() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001911");
  }

  /**
   * A sequence variant where copies of a feature are decreased relative to the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0001912)
   */
  public static Resource copy_number_decrease() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001912");
  }

  /**
   * A bacterial promoter with sigma ecf factor binding dependency. This is a type of bacterial promoters that requires a sigma ECF factor to bind to identified -10 and -35 sequence regions in order to mediate binding of the RNA polymerase to the promoter region as part of transcription initiation. (Invitrogen:kc)
   * (http://purl.obolibrary.org/obo/SO_0001913)
   */
  public static Resource bacterial_RNApol_promoter_sigma_ecf() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001913");
  }

  /**
   * A DNA motif that is found in eukaryotic rDNA repeats, and is a site of replication fork pausing. (PMID:14645529)
   * (http://purl.obolibrary.org/obo/SO_0001914)
   */
  public static Resource rDNA_replication_fork_barrier() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001914");
  }

  /**
   * A region defined by a cluster of experimentally determined transcription starting sites. (PMID:19624849, PMID:21372179, SO:andrewgibson)
   * (http://purl.obolibrary.org/obo/SO_0001915)
   */
  public static Resource transcription_start_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001915");
  }

  /**
   * A CAGE tag is a sequence tag hat corresponds to 5" ends of mRNA at cap sites, produced by cap analysis gene expression and used to identify transcriptional start sites. (SO:andrewgibson)
   * (http://purl.obolibrary.org/obo/SO_0001916)
   */
  public static Resource CAGE_tag() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001916");
  }

  /**
   * A kind of transcription_initiation_cluster defined by the clustering of CAGE tags on a sequence region. (PMID:16645617, SO:andrewgibson)
   * (http://purl.obolibrary.org/obo/SO_0001917)
   */
  public static Resource CAGE_cluster() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001917");
  }

  /**
   * A cytosine methylated at the 5 carbon. (SO:rtapella)
   * (http://purl.obolibrary.org/obo/SO_0001918)
   */
  public static Resource a_methylcytosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001918");
  }

  /**
   * A cytosine methylated at the 4 nitrogen. (SO:rtapella)
   * (http://purl.obolibrary.org/obo/SO_0001919)
   */
  public static Resource N4_methylcytosine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001919");
  }

  /**
   * An adenine methylated at the 6 nitrogen. (SO:rtapella)
   * (http://purl.obolibrary.org/obo/SO_0001920)
   */
  public static Resource N6_methyladenine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001920");
  }

  /**
   * A contig of mitochondria derived sequences. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001921)
   */
  public static Resource mitochondrial_contig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001921");
  }

  /**
   * A scaffold composed of mitochondrial contigs. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001922)
   */
  public static Resource mitochondrial_supercontig() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001922");
  }

  /**
   * A non-coding RNA transcript, derived from the transcription of the telomere. These  transcripts contain G rich telomeric RNA repeats and RNA tracts corresponding to adjacent subtelomeric sequences. They are 100-9000 bases long. (PMID:22139915)
   * (http://purl.obolibrary.org/obo/SO_0001923)
   */
  public static Resource TERRA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001923");
  }

  /**
   * A non coding RNA transcript, complementary to subtelomeric tract of TERRA transcript but devoid of the repeats. (PMID:2139915)
   * (http://purl.obolibrary.org/obo/SO_0001924)
   */
  public static Resource ARRET() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001924");
  }

  /**
   * A non-coding RNA transcript, derived from the transcription of the telomere. These  transcripts consist of C rich repeats. (PMID:22139915)
   * (http://purl.obolibrary.org/obo/SO_0001925)
   */
  public static Resource ARIA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001925");
  }

  /**
   * A non-coding RNA transcript, derived from the transcription of the telomere. These  transcripts are antisense of ARRET transcripts. (PMID:22139915)
   * (http://purl.obolibrary.org/obo/SO_0001926)
   */
  public static Resource anti_ARRET() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001926");
  }

  /**
   * A non-coding transcript derived from thetranscript of the telomere. (PMID:22139915)
   * (http://purl.obolibrary.org/obo/SO_0001927)
   */
  public static Resource telomeric_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001927");
  }

  /**
   * A duplication of the distal region of a chromosome. (SO:bm)
   * (http://purl.obolibrary.org/obo/SO_0001928)
   */
  public static Resource distal_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001928");
  }

  /**
   * A sequencer read of a mitochondrial DNA sample. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001929)
   */
  public static Resource mitochondrial_DNA_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001929");
  }

  /**
   * A sequencer read of a chloroplast DNA sample. (GMOD:ea)
   * (http://purl.obolibrary.org/obo/SO_0001930)
   */
  public static Resource chloroplast_DNA_read() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0001930");
  }

  /**
   * A region of sequence that is involved in the control of a biological process. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0005836)
   */
  public static Resource regulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005836");
  }

  /**
   * The primary transcript of an evolutionarily conserved eukaryotic low molecular weight RNA capable of intermolecular hybridization with both homologous and heterologous 18S rRNA. (PMID:2251119)
   * (http://purl.obolibrary.org/obo/SO_0005837)
   */
  public static Resource U14_snoRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005837");
  }

  /**
   * A snoRNA that specifies the site of 2"-O-ribose methylation in an RNA molecule by base pairing with a short sequence around the target residue. (GOC:mah, PMID:12457565)
   * (http://purl.obolibrary.org/obo/SO_0005841)
   */
  public static Resource methylation_guide_snoRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005841");
  }

  /**
   * An ncRNA that is part of a ribonucleoprotein that cleaves the primary pre-rRNA transcript in the process of producing mature rRNA molecules. (GOC:kgc)
   * (http://purl.obolibrary.org/obo/SO_0005843)
   */
  public static Resource rRNA_cleavage_RNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005843");
  }

  /**
   * An exon that is the only exon in a gene. (RSC:cb)
   * (http://purl.obolibrary.org/obo/SO_0005845)
   */
  public static Resource exon_of_single_exon_gene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005845");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0005847)
   */
  public static Resource cassette_array_member() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005847");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0005848)
   */
  public static Resource gene_cassette_member() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005848");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_0005849)
   */
  public static Resource gene_subarray_member() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005849");
  }

  /**
   * Non-covalent primer binding site for initiation of replication, transcription, or reverse transcription. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
   * (http://purl.obolibrary.org/obo/SO_0005850)
   */
  public static Resource primer_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005850");
  }

  /**
   * An array includes two or more genes, or two or more gene subarrays, contiguously arranged where the individual genes, or subarrays, are either identical in sequence, or essentially so. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0005851)
   */
  public static Resource gene_array() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005851");
  }

  /**
   * A subarray is, by defintition, a member of a gene array (SO:0005851); the members of a subarray may differ substantially in sequence, but are closely related in function. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0005852)
   */
  public static Resource gene_subarray() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005852");
  }

  /**
   * A gene that can be substituted for a related gene at a different site in the genome. (SGD:se)
   * (http://purl.obolibrary.org/obo/SO_0005853)
   */
  public static Resource gene_cassette() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005853");
  }

  /**
   * An array of non-functional genes whose members, when captured by recombination form functional genes. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0005854)
   */
  public static Resource gene_cassette_array() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005854");
  }

  /**
   * A collection of related genes. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_0005855)
   */
  public static Resource gene_group() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005855");
  }

  /**
   * A primary transcript encoding seryl tRNA (SO:000269). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0005856)
   */
  public static Resource selenocysteine_tRNA_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005856");
  }

  /**
   * A tRNA sequence that has a selenocysteine anticodon, and a 3" selenocysteine binding region. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0005857)
   */
  public static Resource selenocysteinyl_tRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005857");
  }

  /**
   * A region in which two or more pairs of homologous markers occur on the same chromosome in two or more species. (http://www.informatics.jax.org/silverbook/glossary.shtml)
   * (http://purl.obolibrary.org/obo/SO_0005858)
   */
  public static Resource syntenic_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0005858");
  }

  /**
   * A region of a peptide that is involved in a biochemical function. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100001)
   */
  public static Resource biochemical_region_of_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100001");
  }

  /**
   * A region that is involved a contact with another molecule. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100002)
   */
  public static Resource molecular_contact_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100002");
  }

  /**
   * A region of polypeptide chain with high conformational flexibility. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100003)
   */
  public static Resource intrinsically_unstructured_polypeptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100003");
  }

  /**
   * A motif of 3 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i: psi -10 bounds -50 to 30, res i+1: phi -75 bounds -100 to -50, res i+1: psi 140 bounds 110 to 170. An extra restriction of the length of the O to O distance would be useful, that it be less than 5 Angstrom. More precisely these two oxygens are the main chain carbonyl oxygen atoms of residues i-1 and i+1. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0100004)
   */
  public static Resource catmat_left_handed_three() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100004");
  }

  /**
   * A motif of 4 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i psi -10 bounds -50 to 30, res i+1: phi -90 bounds -120 to -60, res i+1: psi -10 bounds -50 to 30, res i+2: phi -75 bounds -100 to -50, res i+2: psi 140 bounds 110 to 170.  The extra restriction of the length of the O to O distance is similar, that it be less than 5 Angstrom. In this case these two Oxygen atoms are the main chain carbonyl oxygen atoms of residues i-1 and i+2. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0100005)
   */
  public static Resource catmat_left_handed_four() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100005");
  }

  /**
   * A motif of 3 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i: psi -10 bounds -50 to 30, res i+1: phi -75 bounds -100 to -50, res i+1: psi 140 bounds 110 to 170. An extra restriction of the length of the O to O distance would be useful, that it be less than 5 Angstrom. More precisely these two oxygens are the main chain carbonyl oxygen atoms of residues i-1 and i+1. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0100006)
   */
  public static Resource catmat_right_handed_three() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100006");
  }

  /**
   * A motif of 4 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i: psi -10 bounds -50 to 30, res i+1: phi -90 bounds -120 to -60, res i+1: psi -10 bounds -50 to 30, res i+2: phi -75 bounds -100 to -50, res i+2: psi 140 bounds 110 to 170. The extra restriction of the length of the O to O distance is similar, that it be less than 5 Angstrom. In this case these two Oxygen atoms are the main chain carbonyl oxygen atoms of residues i-1 and i+2. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0100007)
   */
  public static Resource catmat_right_handed_four() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100007");
  }

  /**
   * A motif of five consecutive residues and two H-bonds in which: H-bond between CO of residue(i) and NH of residue(i+4), H-bond between CO of residue(i) and NH of residue(i+3),Phi angles of residues(i+1), (i+2) and (i+3) are negative. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
   * (http://purl.obolibrary.org/obo/SO_0100008)
   */
  public static Resource alpha_beta_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100008");
  }

  /**
   * A peptide that acts as a signal for both membrane translocation and lipid attachment in prokaryotes. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100009)
   */
  public static Resource lipoprotein_signal_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100009");
  }

  /**
   * An experimental region wherean analysis has been run and not produced any annotation. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100010)
   */
  public static Resource no_output() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100010");
  }

  /**
   * The cleaved_peptide_regon is the a region of peptide sequence that is cleaved during maturation. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100011)
   */
  public static Resource cleaved_peptide_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100011");
  }

  /**
   * Irregular, unstructured regions of a protein"s backbone, as distinct from the regular region (namely alpha helix and beta strand - characterised by specific patterns of main-chain hydrogen bonds). (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100012)
   */
  public static Resource peptide_coil() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100012");
  }

  /**
   * Hydrophobic regions are regions with a low affinity for water. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100013)
   */
  public static Resource hydrophobic_region_of_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100013");
  }

  /**
   * The amino-terminal positively-charged region of a signal peptide (approx 1-5 aa). (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100014)
   */
  public static Resource n_terminal_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100014");
  }

  /**
   * The more polar, carboxy-terminal region of the signal peptide (approx 3-7 aa). (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100015)
   */
  public static Resource c_terminal_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100015");
  }

  /**
   * The central, hydrophobic region of the signal peptide (approx 7-15 aa). (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100016)
   */
  public static Resource central_hydrophobic_region_of_signal_peptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100016");
  }

  /**
   * A conserved motif is a short (up to 20 amino acids) region of biological interest that is conserved in different proteins. They may or may not have functional or structural significance within the proteins in which they are found. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100017)
   */
  public static Resource polypeptide_conserved_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100017");
  }

  /**
   * A polypeptide binding motif is a short (up to 20 amino acids) polypeptide region of biological interest that contains one or more amino acids experimentally shown to bind to a ligand. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100018)
   */
  public static Resource polypeptide_binding_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100018");
  }

  /**
   * A polypeptide catalytic motif is a short (up to 20 amino acids) polypeptide region that contains one or more active site residues. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100019)
   */
  public static Resource polypeptide_catalytic_motif() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100019");
  }

  /**
   * A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with DNA. (EBIBS:GAR, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_0100020)
   */
  public static Resource polypeptide_DNA_contact() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100020");
  }

  /**
   * A subsection of sequence with biological interest that is conserved in different proteins. They may or may not have functional or structural significance within the proteins in which they are found. (EBIBS:GAR)
   * (http://purl.obolibrary.org/obo/SO_0100021)
   */
  public static Resource polypeptide_conserved_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_0100021");
  }

  /**
   * A sequence alteration where the length of the change in the variant is the same as that of the reference. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000002)
   */
  public static Resource substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000002");
  }

  /**
   * When no simple or well defined DNA mutation event describes the observed DNA change, the keyword \"complex\" should be used. Usually there are multiple equally plausible explanations for the change. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000005)
   */
  public static Resource complex_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000005");
  }

  /**
   * A single nucleotide change which has occurred at the same position of a corresponding nucleotide in a reference sequence. (SO:immuno_workshop)
   * (http://purl.obolibrary.org/obo/SO_1000008)
   */
  public static Resource point_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000008");
  }

  /**
   * Change of a pyrimidine nucleotide, C or T, into an other pyrimidine nucleotide, or change of a purine nucleotide, A or G, into an other purine nucleotide. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000009)
   */
  public static Resource transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000009");
  }

  /**
   * A substitution of a pyrimidine, C or T, for another pyrimidine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000010)
   */
  public static Resource pyrimidine_transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000010");
  }

  /**
   * A transition of a cytidine to a thymine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000011)
   */
  public static Resource C_to_T_transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000011");
  }

  /**
   * The transition of cytidine to thymine occurring at a pCpG site as a consequence of the spontaneous deamination of 5"-methylcytidine. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000012)
   */
  public static Resource C_to_T_transition_at_pCpG_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000012");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000013)
   */
  public static Resource T_to_C_transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000013");
  }

  /**
   * A substitution of a purine, A or G, for another purine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000014)
   */
  public static Resource purine_transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000014");
  }

  /**
   * A transition of an adenine to a guanine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000015)
   */
  public static Resource A_to_G_transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000015");
  }

  /**
   * A transition of a guanine to an adenine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000016)
   */
  public static Resource G_to_A_transition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000016");
  }

  /**
   * Change of a pyrimidine nucleotide, C or T, into a purine nucleotide, A or G, or vice versa. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000017)
   */
  public static Resource transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000017");
  }

  /**
   * Change of a pyrimidine nucleotide, C or T, into a purine nucleotide, A or G. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000018)
   */
  public static Resource pyrimidine_to_purine_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000018");
  }

  /**
   * A transversion from cytidine to adenine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000019)
   */
  public static Resource C_to_A_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000019");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000020)
   */
  public static Resource C_to_G_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000020");
  }

  /**
   * A transversion from T to A. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000021)
   */
  public static Resource T_to_A_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000021");
  }

  /**
   * A transversion from T to G. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000022)
   */
  public static Resource T_to_G_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000022");
  }

  /**
   * Change of a purine nucleotide, A or G , into a pyrimidine nucleotide C or T. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000023)
   */
  public static Resource purine_to_pyrimidine_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000023");
  }

  /**
   * A transversion from adenine to cytidine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000024)
   */
  public static Resource A_to_C_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000024");
  }

  /**
   * A transversion from adenine to thymine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000025)
   */
  public static Resource A_to_T_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000025");
  }

  /**
   * A transversion from guanine to cytidine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000026)
   */
  public static Resource G_to_C_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000026");
  }

  /**
   * A transversion from guanine to thymine. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000027)
   */
  public static Resource G_to_T_transversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000027");
  }

  /**
   * A chromosomal structure variation within a single chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000028)
   */
  public static Resource intrachromosomal_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000028");
  }

  /**
   * An incomplete chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000029)
   */
  public static Resource chromosomal_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000029");
  }

  /**
   * An interchromosomal mutation where a region of the chromosome is inverted with respect to wild type. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000030)
   */
  public static Resource chromosomal_inversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000030");
  }

  /**
   * A chromosomal structure variation whereby more than one chromosome is involved. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000031)
   */
  public static Resource interchromosomal_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000031");
  }

  /**
   * A sequence alteration which included an insertion and a deletion, affecting 2 or more bases. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html, http:http://www.hgvs.org/mutnomen/recs-DNA.html#indel)
   * (http://purl.obolibrary.org/obo/SO_1000032)
   */
  public static Resource indel() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000032");
  }

  /**
   * One or more nucleotides are added between two adjacent nucleotides in the sequence; the inserted sequence derives from, or is identical in sequence to, nucleotides adjacent to insertion point. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000035)
   */
  public static Resource duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000035");
  }

  /**
   * A continuous nucleotide sequence is inverted in the same position. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000036)
   */
  public static Resource inversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000036");
  }

  /**
   * An extra chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000037)
   */
  public static Resource chromosomal_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000037");
  }

  /**
   * A duplication that occurred within a chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000038)
   */
  public static Resource intrachromosomal_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000038");
  }

  /**
   * A tandem duplication where the individual regions are in the same orientation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000039)
   */
  public static Resource direct_tandem_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000039");
  }

  /**
   * A tandem duplication where the individual regions are not in the same orientation. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000040)
   */
  public static Resource inverted_tandem_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000040");
  }

  /**
   * A chromosome structure variation whereby a transposition occurred within a chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000041)
   */
  public static Resource intrachromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000041");
  }

  /**
   * A chromosome structure variant where a monocentric element is caused by the fusion of two chromosome arms. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000042)
   */
  public static Resource compound_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000042");
  }

  /**
   * A non reciprocal translocation whereby the participating chromosomes break at their centromeres and the long arms fuse to form a single chromosome with a single centromere. (http://en.wikipedia.org/wiki/Robertsonian_translocation)
   * (http://purl.obolibrary.org/obo/SO_1000043)
   */
  public static Resource Robertsonian_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000043");
  }

  /**
   * An interchromosomal mutation. Rearrangements that alter the pairing of telomeres are classified as translocations. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000044)
   */
  public static Resource chromosomal_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000044");
  }

  /**
   * A ring chromosome is a chromosome whose arms have fused together to form a ring, often with the loss of the ends of the chromosome. (http://en.wikipedia.org/wiki/Ring_chromosome)
   * (http://purl.obolibrary.org/obo/SO_1000045)
   */
  public static Resource ring_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000045");
  }

  /**
   * A chromosomal inversion that includes the centromere. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000046)
   */
  public static Resource pericentric_inversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000046");
  }

  /**
   * A chromosomal inversion that does not include the centromere. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000047)
   */
  public static Resource paracentric_inversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000047");
  }

  /**
   * A chromosomal translocation with two breaks; two chromosome segments have simply been exchanged. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000048)
   */
  public static Resource reciprocal_chromosomal_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000048");
  }

  /**
   * Any change in mature, spliced and processed, RNA that results from a change in the corresponding DNA sequence. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000049)
   */
  public static Resource sequence_variation_affecting_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000049");
  }

  /**
   * No effect on the state of the RNA. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000050)
   */
  public static Resource sequence_variant_causing_no_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000050");
  }

  /**
   * Any of the amino acid coding triplets of a gene are affected by the DNA mutation. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000054)
   */
  public static Resource sequence_variation_affecting_coding_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000054");
  }

  /**
   * The DNA mutation changes, usually destroys, the first coding triplet of a gene. Usually prevents translation although another initiator codon may be used. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000055)
   */
  public static Resource sequence_variant_causing_initiator_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000055");
  }

  /**
   * The DNA mutation affects the amino acid coding sequence of a gene; this region includes both the initiator and terminator codons. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000056)
   */
  public static Resource sequence_variant_causing_amino_acid_coding_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000056");
  }

  /**
   * The changed codon has the same translation product as the original codon. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000057)
   */
  public static Resource sequence_variant_causing_synonymous_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000057");
  }

  /**
   * A DNA point mutation that causes a substitution of an amino acid by an other. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000058)
   */
  public static Resource sequence_variant_causing_non_synonymous_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000058");
  }

  /**
   * The nucleotide change in the codon leads to a new codon coding for a new amino acid. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000059)
   */
  public static Resource sequence_variant_causing_missense_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000059");
  }

  /**
   * The amino acid change following from the codon change does not change the gross properties (size, charge, hydrophobicity) of the amino acid at that position. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000060)
   */
  public static Resource sequence_variant_causing_conservative_missense_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000060");
  }

  /**
   * The amino acid change following from the codon change changes the gross properties (size, charge, hydrophobicity) of the amino acid in that position. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000061)
   */
  public static Resource sequence_variant_causing_nonconservative_missense_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000061");
  }

  /**
   * The nucleotide change in the codon triplet creates a terminator codon. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000062)
   */
  public static Resource sequence_variant_causing_nonsense_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000062");
  }

  /**
   * The nucleotide change in the codon triplet changes the stop codon, causing an elongated transcript sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000063)
   */
  public static Resource sequence_variant_causing_terminator_codon_change_in_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000063");
  }

  /**
   * An umbrella term for terms describing an effect of a sequence variation on the frame of translation. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000064)
   */
  public static Resource sequence_variation_affecting_reading_frame() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000064");
  }

  /**
   * A mutation causing a disruption of the translational reading frame, because the number of nucleotides inserted or deleted is not a multiple of three. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000065)
   */
  public static Resource frameshift_sequence_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000065");
  }

  /**
   * A mutation causing a disruption of the translational reading frame, due to the insertion of a nucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000066)
   */
  public static Resource sequence_variant_causing_plus_1_frameshift_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000066");
  }

  /**
   * A mutation causing a disruption of the translational reading frame, due to the deletion of a nucleotide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000067)
   */
  public static Resource sequence_variant_causing_minus_1_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000067");
  }

  /**
   * A mutation causing a disruption of the translational reading frame, due to the insertion of two nucleotides. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000068)
   */
  public static Resource sequence_variant_causing_plus_2_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000068");
  }

  /**
   * A mutation causing a disruption of the translational reading frame, due to the deletion of two nucleotides. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000069)
   */
  public static Resource sequence_variant_causing_minus_2_frameshift() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000069");
  }

  /**
   * Sequence variant affects the way in which the primary transcriptional product is processed to form the mature transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000070)
   */
  public static Resource sequence_variant_affecting_transcript_processing() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000070");
  }

  /**
   * A sequence_variant_effect where the way in which the primary transcriptional product is processed to form the mature transcript, specifically by the removal (splicing) of intron sequences is changed. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000071)
   */
  public static Resource sequence_variant_affecting_splicing() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000071");
  }

  /**
   * A sequence_variant_effect that changes the splice donor sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000072)
   */
  public static Resource sequence_variant_affecting_splice_donor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000072");
  }

  /**
   * A sequence_variant_effect that changes the splice acceptor sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000073)
   */
  public static Resource sequence_variant_affecting_splice_acceptor() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000073");
  }

  /**
   * A sequence variant causing a new (functional) splice site. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000074)
   */
  public static Resource sequence_variant_causing_cryptic_splice_activation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000074");
  }

  /**
   * Sequence variant affects the editing of the transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000075)
   */
  public static Resource sequence_variant_affecting_editing() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000075");
  }

  /**
   * Mutation affects the process of transcription, its initiation, progression or termination. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000076)
   */
  public static Resource sequence_variant_affecting_transcription() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000076");
  }

  /**
   * A sequence variation that decreases the rate a which transcription of the sequence occurs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000078)
   */
  public static Resource sequence_variant_decreasing_rate_of_transcription() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000078");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000079)
   */
  public static Resource sequence_variation_affecting_transcript_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000079");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000080)
   */
  public static Resource sequence_variant_increasing_rate_of_transcription() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000080");
  }

  /**
   * A mutation that alters the rate a which transcription of the sequence occurs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000081)
   */
  public static Resource sequence_variant_affecting_rate_of_transcription() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000081");
  }

  /**
   * Sequence variant affects the stability of the transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000082)
   */
  public static Resource sequence_variant_affecting_transcript_stability() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000082");
  }

  /**
   * Sequence variant increases the stability (half-life) of the transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000083)
   */
  public static Resource sequence_variant_increasing_transcript_stability() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000083");
  }

  /**
   * Sequence variant decreases the stability (half-life) of the transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000084)
   */
  public static Resource sequence_variant_decreasing_transcript_stability() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000084");
  }

  /**
   * A sequence variation that causes a change in the level of mature, spliced and processed RNA, resulting from a change in the corresponding DNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000085)
   */
  public static Resource sequence_variation_affecting_level_of_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000085");
  }

  /**
   * A sequence variation that causes a decrease in the level of mature, spliced and processed RNA, resulting from a change in the corresponding DNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000086)
   */
  public static Resource sequence_variation_decreasing_level_of_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000086");
  }

  /**
   * A sequence_variation that causes an increase in the level of mature, spliced and processed RNA, resulting from a change in the corresponding DNA sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000087)
   */
  public static Resource sequence_variation_increasing_level_of_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000087");
  }

  /**
   * A sequence variant causing a change in primary translation product of a transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000088)
   */
  public static Resource sequence_variant_affecting_translational_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000088");
  }

  /**
   * The sequence variant at RNA level does not lead to any change in polypeptide. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000089)
   */
  public static Resource sequence_variant_causing_no_change_of_translational_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000089");
  }

  /**
   * Any sequence variant effect that is known at nucleotide level but cannot be explained by using other key terms. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000092)
   */
  public static Resource sequence_variant_causing_complex_change_of_translational_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000092");
  }

  /**
   * The replacement of a single amino acid by another. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000093)
   */
  public static Resource sequence_variant_causing_amino_acid_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000093");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000094)
   */
  public static Resource sequence_variant_causing_conservative_amino_acid_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000094");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000095)
   */
  public static Resource sequence_variant_causing_nonconservative_amino_acid_substitution() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000095");
  }

  /**
   * The insertion of one or more amino acids from the polypeptide, without affecting the surrounding sequence. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000096)
   */
  public static Resource sequence_variant_causing_amino_acid_insertion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000096");
  }

  /**
   * The deletion of one or more amino acids from the polypeptide, without affecting the surrounding sequence. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000097)
   */
  public static Resource sequence_variant_causing_amino_acid_deletion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000097");
  }

  /**
   * The translational product is truncated at its C-terminus, usually a result of a nonsense codon change in transcript (SO:1000062). (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000098)
   */
  public static Resource sequence_variant_causing_polypeptide_truncation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000098");
  }

  /**
   * The extension of the translational product at either (or both) the N-terminus and/or the C-terminus. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000099)
   */
  public static Resource sequence_variant_causing_polypeptide_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000099");
  }

  /**
   * . (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000100)
   */
  public static Resource mutation_causing_polypeptide_N_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000100");
  }

  /**
   * . (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000101)
   */
  public static Resource mutation_causing_polypeptide_C_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000101");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000102)
   */
  public static Resource sequence_variant_affecting_level_of_translational_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000102");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000103)
   */
  public static Resource sequence_variant_decreasing_level_of_translation_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000103");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000104)
   */
  public static Resource sequence_variant_increasing_level_of_translation_product() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000104");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000105)
   */
  public static Resource sequence_variant_affecting_polypeptide_amino_acid_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000105");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000106)
   */
  public static Resource mutation_causing_inframe_polypeptide_N_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000106");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000107)
   */
  public static Resource mutation_causing_out_of_frame_polypeptide_N_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000107");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000108)
   */
  public static Resource mutaton_causing_inframe_polypeptide_C_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000108");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000109)
   */
  public static Resource mutation_causing_out_of_frame_polypeptide_C_terminal_elongation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000109");
  }

  /**
   * A mutation that reverts the sequence of a previous frameshift mutation back to the initial frame. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000110)
   */
  public static Resource frame_restoring_sequence_variant() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000110");
  }

  /**
   * A mutation that changes the amino acid sequence of the peptide in such a way that it changes the 3D structure of the molecule. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000111)
   */
  public static Resource sequence_variant_affecting_3D_structure_of_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000111");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000112)
   */
  public static Resource sequence_variant_causing_no_3D_structural_change() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000112");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000115)
   */
  public static Resource sequence_variant_causing_complex_3D_structural_change() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000115");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000116)
   */
  public static Resource sequence_variant_causing_conformational_change() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000116");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000117)
   */
  public static Resource sequence_variant_affecting_polypeptide_function() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000117");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000118)
   */
  public static Resource sequence_variant_causing_loss_of_function_of_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000118");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000119)
   */
  public static Resource sequence_variant_causing_inactive_ligand_binding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000119");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000120)
   */
  public static Resource sequence_variant_causing_inactive_catalytic_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000120");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000121)
   */
  public static Resource sequence_variant_causing_polypeptide_localization_change() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000121");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000122)
   */
  public static Resource sequence_variant_causing_polypeptide_post_translational_processing_change() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000122");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000123)
   */
  public static Resource polypeptide_post_translational_processing_affected() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000123");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000124)
   */
  public static Resource sequence_variant_causing_partial_loss_of_function_of_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000124");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000125)
   */
  public static Resource sequence_variant_causing_gain_of_function_of_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000125");
  }

  /**
   * A sequence variant that affects the secondary structure (folding) of the RNA transcript molecule. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000126)
   */
  public static Resource sequence_variant_affecting_transcript_secondary_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000126");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000127)
   */
  public static Resource sequence_variant_causing_compensatory_transcript_secondary_structure_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000127");
  }

  /**
   * The effect of a change in nucleotide sequence. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000132)
   */
  public static Resource sequence_variant_effect() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000132");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000134)
   */
  public static Resource sequence_variant_causing_polypeptide_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000134");
  }

  /**
   * An autosynaptic chromosome is the aneuploid product of recombination between a pericentric inversion and a cytologically wild-type chromosome. (PMID:6804304)
   * (http://purl.obolibrary.org/obo/SO_1000136)
   */
  public static Resource autosynaptic_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000136");
  }

  /**
   * A compound chromosome whereby two copies of the same chromosomal arm attached to a common centromere. The chromosome is diploid for the arm involved. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000138)
   */
  public static Resource homo_compound_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000138");
  }

  /**
   * A compound chromosome whereby two arms from different chromosomes are connected through the centromere of one of them. (FB:reference_manual, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000140)
   */
  public static Resource hetero_compound_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000140");
  }

  /**
   * A chromosome that occurred by the division of a larger chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000141)
   */
  public static Resource chromosome_fission() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000141");
  }

  /**
   * An autosynaptic chromosome carrying the two right (D = dextro) telomeres. (FB:manual)
   * (http://purl.obolibrary.org/obo/SO_1000142)
   */
  public static Resource dexstrosynaptic_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000142");
  }

  /**
   * LS is an autosynaptic chromosome carrying the two left (L = levo) telomeres. (FB:manual)
   * (http://purl.obolibrary.org/obo/SO_1000143)
   */
  public static Resource laevosynaptic_chromosome() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000143");
  }

  /**
   * A chromosome structure variation whereby the duplicated sequences are carried as a free centric element. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000144)
   */
  public static Resource free_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000144");
  }

  /**
   * A ring chromosome which is a copy of another chromosome. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000145)
   */
  public static Resource free_ring_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000145");
  }

  /**
   * A chromosome structure variant with 4 or more breakpoints. (FB:reference_manual, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000146)
   */
  public static Resource complex_chromosomal_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000146");
  }

  /**
   * A chromosomal deletion whereby a translocation occurs in which one of the four broken ends loses a segment before re-joining. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000147)
   */
  public static Resource deficient_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000147");
  }

  /**
   * A chromosomal translocation whereby the first two breaks are in the same chromosome, and the region between them is rejoined in inverted order to the other side of the first break, such that both sides of break one are present on the same chromosome. The remaining free ends are joined as a translocation with those resulting from the third break. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000148)
   */
  public static Resource inversion_cum_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000148");
  }

  /**
   * An interchromosomal mutation whereby the (large) region between the first two breaks listed is lost, and the two flanking segments (one of them centric) are joined as a translocation to the free ends resulting from the third break. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000149)
   */
  public static Resource bipartite_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000149");
  }

  /**
   * A chromosomal translocation whereby three breaks occurred in three different chromosomes. The centric segment resulting from the first break listed is joined to the acentric segment resulting from the second, rather than the third. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000150)
   */
  public static Resource cyclic_translocation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000150");
  }

  /**
   * A chromosomal inversion caused by three breaks in the same chromosome; both central segments are inverted in place (i.e., they are not transposed). (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000151)
   */
  public static Resource bipartite_inversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000151");
  }

  /**
   * An insertional duplication where a copy of the segment between the first two breaks listed is inserted at the third break; the insertion is in cytologically the same orientation as its flanking segments. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000152)
   */
  public static Resource uninverted_insertional_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000152");
  }

  /**
   * An insertional duplication where a copy of the segment between the first two breaks listed is inserted at the third break; the insertion is in cytologically inverted orientation with respect to its flanking segments. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000153)
   */
  public static Resource inverted_insertional_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000153");
  }

  /**
   * A chromosome duplication involving the insertion of a duplicated region (as opposed to a free duplication). (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000154)
   */
  public static Resource insertional_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000154");
  }

  /**
   * A chromosome structure variation whereby a transposition occurred between chromosomes. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000155)
   */
  public static Resource interchromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000155");
  }

  /**
   * An interchromosomal transposition whereby a copy of the segment between the first two breaks listed is inserted at the third break; the insertion is in cytologically inverted orientation with respect to its flanking segment. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000156)
   */
  public static Resource inverted_interchromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000156");
  }

  /**
   * An interchromosomal transition where the segment between the first two breaks listed is removed and inserted at the third break; the insertion is in cytologically the same orientation as its flanking segments. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000157)
   */
  public static Resource uninverted_interchromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000157");
  }

  /**
   * An intrachromosomal transposition whereby the segment between the first two breaks listed is removed and inserted at the third break; the insertion is in cytologically inverted orientation with respect to its flanking segments. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000158)
   */
  public static Resource inverted_intrachromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000158");
  }

  /**
   * An intrachromosomal transposition whereby the segment between the first two breaks listed is removed and inserted at the third break; the insertion is in cytologically the same orientation as its flanking segments. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000159)
   */
  public static Resource uninverted_intrachromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000159");
  }

  /**
   * An insertional duplication where a copy of the segment between the first two breaks listed is inserted at the third break; the orientation of the insertion with respect to its flanking segments is not recorded. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000160)
   */
  public static Resource unoriented_insertional_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000160");
  }

  /**
   * An interchromosomal transposition whereby a copy of the segment between the first two breaks listed is inserted at the third break; the orientation of the insertion with respect to its flanking segments is not recorded. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000161)
   */
  public static Resource unoriented_interchromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000161");
  }

  /**
   * An intrachromosomal transposition whereby the segment between the first two breaks listed is removed and inserted at the third break; the orientation of the insertion with respect to its flanking segments is not recorded. (FB:reference_manual)
   * (http://purl.obolibrary.org/obo/SO_1000162)
   */
  public static Resource unoriented_intrachromosomal_transposition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000162");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000170)
   */
  public static Resource uncharacterised_chromosomal_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000170");
  }

  /**
   * A chromosomal deletion whereby three breaks occur in the same chromosome; one central region is lost, and the other is inverted. (FB:reference_manual, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000171)
   */
  public static Resource deficient_inversion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000171");
  }

  /**
   * A duplication consisting of 2 identical adjacent regions. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000173)
   */
  public static Resource tandem_duplication() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000173");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000175)
   */
  public static Resource partially_characterised_chromosomal_mutation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000175");
  }

  /**
   * A sequence_variant_effect that changes the gene structure. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000180)
   */
  public static Resource sequence_variant_affecting_gene_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000180");
  }

  /**
   * A sequence_variant_effect that changes the gene structure by causing a fusion to another gene. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000181)
   */
  public static Resource sequence_variant_causing_gene_fusion() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000181");
  }

  /**
   * A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000182)
   */
  public static Resource chromosome_number_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000182");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000183)
   */
  public static Resource chromosome_structure_variation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000183");
  }

  /**
   * A sequence variant affecting splicing and causes an exon loss. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1000184)
   */
  public static Resource sequence_variant_causes_exon_loss() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000184");
  }

  /**
   * A sequence variant effect, causing an intron to be gained by the processed transcript; usually a result of a donor acceptor mutation (SO:1000072). (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
   * (http://purl.obolibrary.org/obo/SO_1000185)
   */
  public static Resource sequence_variant_causes_intron_gain() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000185");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1000186)
   */
  public static Resource sequence_variant_causing_cryptic_splice_donor_activation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1000186");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001186)
   */
  public static Resource sequence_variant_causing_cryptic_splice_acceptor_activation() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001186");
  }

  /**
   * A transcript that is alternatively spliced. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_1001187)
   */
  public static Resource alternatively_spliced_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001187");
  }

  /**
   * A gene that is alternately spliced, but encodes only one polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001188)
   */
  public static Resource encodes_1_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001188");
  }

  /**
   * A gene that is alternately spliced, and encodes more than one polypeptide. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001189)
   */
  public static Resource encodes_greater_than_1_polypeptide() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001189");
  }

  /**
   * A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences, but use different stop codons. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001190)
   */
  public static Resource encodes_different_polypeptides_different_stop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001190");
  }

  /**
   * A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences, but use different start codons. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001191)
   */
  public static Resource encodes_overlapping_peptides_different_start() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001191");
  }

  /**
   * A gene that is alternately spliced, and encodes more than one polypeptide, that do not have overlapping peptide sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001192)
   */
  public static Resource encodes_disjoint_polypeptides() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001192");
  }

  /**
   * A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences, but use different start and stop codons. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001193)
   */
  public static Resource encodes_overlapping_polypeptides_different_start_and_stop() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001193");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001194)
   */
  public static Resource alternatively_spliced_gene_encoding_greater_than_1_polypeptide_coding_regions_overlapping() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001194");
  }

  /**
   * A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001195)
   */
  public static Resource encodes_overlapping_peptides() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001195");
  }

  /**
   * A maxicircle gene so extensively edited that it cannot be matched to its edited mRNA sequence. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_1001196)
   */
  public static Resource cryptogene() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001196");
  }

  /**
   * A primary transcript that has the quality dicistronic. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_1001197)
   */
  public static Resource dicistronic_primary_transcript() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001197");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001217)
   */
  public static Resource member_of_regulon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001217");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001244)
   */
  public static Resource alternatively_spliced_transcript_encoding_greater_than_1_polypeptide_different_start_codon_different_stop_codon_coding_regions_non_overlapping() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001244");
  }

  /**
   * A CDS with the evidence status of being independently known. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_1001246)
   */
  public static Resource CDS_independently_known() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001246");
  }

  /**
   * A CDS whose predicted amino acid sequence is unsupported by any experimental evidence or by any match with any other known sequence. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_1001247)
   */
  public static Resource orphan_CDS() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001247");
  }

  /**
   * A CDS that is supported by domain similarity. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_1001249)
   */
  public static Resource CDS_supported_by_domain_match_data() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001249");
  }

  /**
   * A CDS that is supported by sequence similarity data. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_1001251)
   */
  public static Resource CDS_supported_by_sequence_similarity_data() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001251");
  }

  /**
   * A CDS that is predicted. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001254)
   */
  public static Resource CDS_predicted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001254");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001255)
   */
  public static Resource status_of_coding_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001255");
  }

  /**
   * A CDS that is supported by similarity to EST or cDNA data. (SO:xp)
   * (http://purl.obolibrary.org/obo/SO_1001259)
   */
  public static Resource CDS_supported_by_EST_or_cDNA_data() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001259");
  }

  /**
   * A Shine-Dalgarno sequence that stimulates recoding through interactions with the anti-Shine-Dalgarno in the RNA of small ribosomal subunits of translating ribosomes. The signal is only operative in Bacteria. (PMID:12519954, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001260)
   */
  public static Resource internal_Shine_Dalgarno_sequence() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001260");
  }

  /**
   * The sequence of a mature mRNA transcript, modified before translation or during translation, usually by special cis-acting signals. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=8811194&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_1001261)
   */
  public static Resource recoded_mRNA() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001261");
  }

  /**
   * An attribute describing a translational frameshift of -1. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001262)
   */
  public static Resource minus_1_translationally_frameshifted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001262");
  }

  /**
   * An attribute describing a translational frameshift of +1. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001263)
   */
  public static Resource plus_1_translationally_frameshifted() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001263");
  }

  /**
   * A recoded_mRNA where translation was suspended at a particular codon and resumed at a particular non-overlapping downstream codon. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=8811194&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_1001264)
   */
  public static Resource mRNA_recoded_by_translational_bypass() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001264");
  }

  /**
   * A recoded_mRNA that was modified by an alteration of codon meaning. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_1001265)
   */
  public static Resource mRNA_recoded_by_codon_redefinition() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001265");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001266)
   */
  public static Resource stop_codon_redefinition_as_selenocysteine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001266");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001267)
   */
  public static Resource stop_codon_readthrough() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001267");
  }

  /**
   * A site in an mRNA sequence that stimulates the recoding of a region in the same mRNA. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=12519954&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_1001268)
   */
  public static Resource recoding_stimulatory_region() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001268");
  }

  /**
   * A non-canonical start codon with 4 base pairs. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001269)
   */
  public static Resource four_bp_start_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001269");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/SO_1001270)
   */
  public static Resource stop_codon_redefinition_as_pyrrolysine() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001270");
  }

  /**
   * An intron characteristic of Archaeal tRNA and rRNA genes, where intron transcript generates a bulge-helix-bulge motif that is recognised by a splicing endoribonuclease. (PMID:9301331, SO:ma)
   * (http://purl.obolibrary.org/obo/SO_1001271)
   */
  public static Resource archaeal_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001271");
  }

  /**
   * An intron found in tRNA that is spliced via endonucleolytic cleavage and ligation rather than transesterification. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001272)
   */
  public static Resource tRNA_intron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001272");
  }

  /**
   * A non-canonical start codon of sequence CTG. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001273)
   */
  public static Resource CTG_start_codon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001273");
  }

  /**
   * The incorporation of selenocysteine into a protein sequence is directed by an in-frame UGA codon (usually a stop codon) within the coding region of the mRNA. Selenoprotein mRNAs contain a conserved secondary structure in the 3" UTR that is required for the distinction of UGA stop from UGA selenocysteine. The selenocysteine insertion sequence (SECIS) is around 60 nt in length and adopts a hairpin structure which is sufficiently well-defined and conserved to act as a computational screen for selenoprotein genes. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00031)
   * (http://purl.obolibrary.org/obo/SO_1001274)
   */
  public static Resource SECIS_element() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001274");
  }

  /**
   * Sequence coding for a short, single-stranded, DNA sequence via a retrotransposed RNA intermediate; characteristic of some microbial genomes. (SO:ma)
   * (http://purl.obolibrary.org/obo/SO_1001275)
   */
  public static Resource retron() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001275");
  }

  /**
   * The recoding stimulatory signal located downstream of the recoding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001277)
   */
  public static Resource three_prime_recoding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001277");
  }

  /**
   * A recoding stimulatory region, the stem-loop secondary structural element is downstream of the redefined region. (PMID:12519954, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001279)
   */
  public static Resource three_prime_stem_loop_structure() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001279");
  }

  /**
   * The recoding stimulatory signal located upstream of the recoding site. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001280)
   */
  public static Resource five_prime_recoding_site() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001280");
  }

  /**
   * Four base pair sequence immediately downstream of the redefined region. The redefined region is a frameshift site. The quadruplet is 2 overlapping codons. (PMID:12519954, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001281)
   */
  public static Resource flanking_three_prime_quadruplet_recoding_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001281");
  }

  /**
   * A stop codon signal for a UAG stop codon redefinition. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001282)
   */
  public static Resource UAG_stop_codon_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001282");
  }

  /**
   * A stop codon signal for a UAA stop codon redefinition. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001283)
   */
  public static Resource UAA_stop_codon_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001283");
  }

  /**
   * A group of genes, whether linked as a cluster or not, that respond to a common regulatory signal. (ISBN:0198506732)
   * (http://purl.obolibrary.org/obo/SO_1001284)
   */
  public static Resource regulon() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001284");
  }

  /**
   * A stop codon signal for a UGA stop codon redefinition. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001285)
   */
  public static Resource UGA_stop_codon_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001285");
  }

  /**
   * A recoding stimulatory signal, downstream sequence important for recoding that contains repetitive elements. (PMID:12519954, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001286)
   */
  public static Resource three_prime_repeat_recoding_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001286");
  }

  /**
   * A recoding signal that is found many hundreds of nucleotides 3" of a redefined stop codon. (http://www.ncbi.nlm.nih.gov:80/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=8709208&dopt=Abstract)
   * (http://purl.obolibrary.org/obo/SO_1001287)
   */
  public static Resource distant_three_prime_recoding_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001287");
  }

  /**
   * A recoding stimulatory signal that is a stop codon and has effect on efficiency of recoding. (PMID:12519954, SO:ke)
   * (http://purl.obolibrary.org/obo/SO_1001288)
   */
  public static Resource stop_codon_signal() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_1001288");
  }

  /**
   * The sequence referred to by an entry in a databank such as Genbank or SwissProt. (SO:ke)
   * (http://purl.obolibrary.org/obo/SO_2000061)
   */
  public static Resource databank_entry() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_2000061");
  }

  /**
   * A gene component region which acts as a recombinational unit of a gene whose functional form is generated through somatic recombination. (GOC:add)
   * (http://purl.obolibrary.org/obo/SO_3000000)
   */
  public static Resource gene_segment() {
    return _namespace_SO("http://purl.obolibrary.org/obo/SO_3000000");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_adjacent_to")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_complete_evidence_for_feature")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_contained_by")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_contains")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_derives_from")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_evidence_for_feature")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_guided_by")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_integral_part")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_origin")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_part")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_has_quality")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_homologous_to")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_integral_part_of")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_member_of")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_non_functional_homolog_of")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_orthologous_to")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_overlaps")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_paralogous_to")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_part_of")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_partial_evidence_for_feature")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_similar_to")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_transcribed_from")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_transcribed_to")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SEQUENCE_variant_of")) {
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
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000000")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000001")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000002")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000003")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000004")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000005")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000006")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000007")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000008")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000009")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000010")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000011")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000012")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000013")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000014")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000015")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000016")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000017")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000018")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000020")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000021")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000022")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000023")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000024")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000025")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000026")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000027")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000028")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000029")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000030")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000031")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000032")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000033")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000034")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000035")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000036")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000037")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000038")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000039")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000040")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000041")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000042")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000043")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000044")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000045")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000046")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000047")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000048")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000049")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000050")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000051")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000052")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000053")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000054")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000055")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000056")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000057")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000058")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000059")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000060")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000061")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000062")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000063")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000064")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000065")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000066")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000067")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000068")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000069")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000070")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000071")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000072")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000073")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000074")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000075")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000076")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000077")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000078")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000079")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000080")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000081")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000082")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000083")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000084")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000085")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000086")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000087")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000088")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000089")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000090")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000091")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000092")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000093")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000094")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000095")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000096")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000097")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000098")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000099")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000100")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000101")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000102")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000103")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000104")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000105")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000106")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000107")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000108")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000109")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000110")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000111")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000112")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000113")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000114")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000115")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000116")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000117")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000118")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000119")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000120")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000121")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000122")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000123")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000124")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000125")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000126")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000127")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000128")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000129")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000130")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000131")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000132")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000133")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000134")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000135")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000136")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000137")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000138")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000139")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000140")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000141")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000142")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000143")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000144")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000145")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000146")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000147")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000148")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000149")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000150")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000151")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000152")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000153")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000154")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000155")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000156")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000157")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000158")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000159")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000160")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000161")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000162")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000163")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000164")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000165")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000166")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000167")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000168")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000169")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000170")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000171")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000172")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000173")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000174")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000175")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000176")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000177")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000178")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000179")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000180")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000181")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000182")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000183")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000184")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000185")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000186")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000187")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000188")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000189")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000190")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000191")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000192")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000193")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000194")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000195")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000196")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000197")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000198")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000199")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000200")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000201")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000202")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000203")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000204")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000205")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000206")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000207")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000208")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000209")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000210")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000211")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000212")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000213")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000214")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000215")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000216")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000217")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000218")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000219")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000220")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000221")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000222")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000223")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000224")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000225")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000226")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000227")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000228")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000229")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000230")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000231")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000232")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000233")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000234")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000235")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000236")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000237")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000238")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000239")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000240")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000241")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000242")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000243")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000244")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000245")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000246")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000247")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000248")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000249")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000250")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000251")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000252")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000253")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000254")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000255")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000256")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000257")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000258")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000259")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000260")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000261")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000262")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000263")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000264")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000265")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000266")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000267")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000268")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000269")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000270")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000271")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000272")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000273")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000274")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000275")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000276")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000277")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000278")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000279")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000280")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000281")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000282")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000283")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000284")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000285")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000286")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000287")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000288")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000289")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000290")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000291")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000292")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000293")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000294")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000295")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000296")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000297")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000298")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000299")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000300")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000301")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000302")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000303")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000304")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000305")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000306")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000307")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000308")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000309")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000310")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000311")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000312")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000313")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000314")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000315")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000316")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000317")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000318")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000319")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000320")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000321")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000322")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000323")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000324")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000325")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000326")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000327")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000328")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000329")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000330")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000331")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000332")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000333")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000334")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000335")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000336")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000337")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000338")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000339")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000340")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000341")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000342")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000343")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000344")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000345")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000346")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000347")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000348")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000349")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000350")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000351")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000352")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000353")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000354")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000355")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000356")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000357")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000359")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000360")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000361")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000362")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000363")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000364")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000365")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000366")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000367")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000368")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000369")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000370")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000371")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000372")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000373")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000374")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000375")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000376")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000377")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000378")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000379")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000380")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000381")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000382")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000383")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000384")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000385")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000386")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000387")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000388")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000389")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000390")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000391")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000392")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000393")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000394")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000395")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000396")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000397")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000398")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000399")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000400")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000401")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000402")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000403")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000404")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000405")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000406")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000407")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000408")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000409")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000410")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000411")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000412")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000413")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000414")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000415")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000416")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000417")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000418")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000419")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000420")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000421")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000422")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000423")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000424")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000425")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000426")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000427")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000428")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000429")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000430")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000431")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000432")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000433")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000434")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000435")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000436")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000437")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000438")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000439")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000440")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000441")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000442")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000443")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000444")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000445")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000446")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000447")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000448")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000449")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000450")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000451")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000452")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000453")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000454")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000455")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000456")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000457")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000458")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000459")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000460")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000461")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000462")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000463")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000464")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000465")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000466")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000467")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000468")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000469")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000470")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000471")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000472")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000473")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000474")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000475")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000476")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000477")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000478")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000479")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000480")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000481")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000482")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000483")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000484")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000485")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000486")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000487")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000488")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000489")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000490")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000491")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000492")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000493")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000494")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000495")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000496")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000497")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000498")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000499")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000500")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000501")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000502")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000503")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000504")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000505")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000506")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000507")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000508")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000509")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000510")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000511")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000512")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000513")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000514")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000515")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000516")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000517")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000518")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000519")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000520")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000521")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000522")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000523")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000524")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000525")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000526")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000527")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000528")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000529")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000530")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000531")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000532")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000533")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000534")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000535")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000536")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000537")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000538")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000539")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000540")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000541")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000542")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000543")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000544")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000545")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000546")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000547")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000548")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000549")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000550")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000551")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000552")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000553")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000554")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000555")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000556")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000557")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000558")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000559")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000560")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000561")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000562")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000563")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000564")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000565")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000566")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000567")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000568")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000569")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000570")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000571")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000572")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000573")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000574")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000575")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000576")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000577")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000578")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000579")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000580")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000581")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000582")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000583")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000584")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000585")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000586")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000587")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000588")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000589")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000590")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000591")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000592")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000593")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000594")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000595")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000596")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000597")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000598")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000599")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000600")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000601")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000602")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000603")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000604")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000605")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000606")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000607")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000608")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000609")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000610")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000611")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000612")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000613")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000614")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000615")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000616")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000617")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000618")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000619")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000620")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000621")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000622")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000623")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000624")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000625")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000626")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000627")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000628")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000629")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000630")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000631")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000632")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000633")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000634")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000635")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000636")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000637")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000638")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000639")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000640")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000641")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000642")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000643")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000644")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000645")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000646")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000647")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000648")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000649")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000650")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000651")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000652")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000653")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000654")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000655")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000656")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000657")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000658")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000659")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000660")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000661")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000662")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000663")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000664")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000665")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000666")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000667")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000668")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000669")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000670")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000671")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000672")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000673")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000674")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000675")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000676")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000677")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000678")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000679")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000680")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000681")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000682")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000683")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000684")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000685")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000686")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000687")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000688")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000689")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000690")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000691")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000692")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000693")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000694")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000695")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000696")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000697")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000698")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000699")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000700")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000701")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000702")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000703")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000704")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000705")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000706")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000707")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000708")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000709")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000710")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000711")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000712")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000713")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000714")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000715")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000716")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000717")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000718")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000719")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000720")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000721")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000722")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000723")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000724")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000725")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000726")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000727")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000728")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000729")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000730")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000731")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000732")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000733")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000734")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000735")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000736")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000737")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000738")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000739")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000740")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000741")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000742")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000743")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000744")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000745")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000746")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000747")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000748")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000749")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000750")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000751")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000752")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000753")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000754")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000755")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000756")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000757")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000758")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000759")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000760")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000761")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000762")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000763")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000764")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000765")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000766")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000767")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000768")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000769")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000770")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000771")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000772")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000773")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000774")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000775")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000776")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000777")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000778")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000779")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000780")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000781")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000782")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000783")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000784")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000785")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000786")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000787")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000788")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000789")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000790")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000791")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000792")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000793")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000794")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000795")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000796")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000797")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000798")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000799")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000800")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000801")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000802")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000803")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000804")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000805")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000806")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000807")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000808")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000809")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000810")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000811")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000812")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000813")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000814")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000815")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000816")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000817")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000818")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000819")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000820")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000821")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000822")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000823")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000824")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000825")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000828")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000829")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000830")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000831")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000832")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000833")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000834")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000835")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000836")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000837")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000838")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000839")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000840")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000841")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000842")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000843")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000844")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000845")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000846")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000847")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000848")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000849")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000850")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000851")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000852")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000853")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000854")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000855")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000856")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000857")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000858")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000859")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000860")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000861")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000862")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000863")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000864")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000865")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000866")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000867")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000868")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000869")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000870")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000871")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000872")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000873")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000874")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000875")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000876")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000877")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000878")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000879")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000880")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000881")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000882")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000883")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000884")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000885")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000886")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000887")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000888")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000889")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000890")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000891")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000892")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000893")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000894")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000895")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000896")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000897")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000898")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000899")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000900")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000901")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000902")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000903")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000904")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000905")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000906")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000907")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000908")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000909")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000910")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000911")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000912")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000913")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000914")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000915")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000916")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000917")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000918")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000919")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000920")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000921")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000922")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000923")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000924")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000925")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000926")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000927")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000928")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000929")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000930")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000931")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000932")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000933")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000934")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000935")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000936")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000937")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000938")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000939")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000940")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000941")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000942")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000943")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000944")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000945")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000946")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000947")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000948")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000949")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000950")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000951")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000952")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000953")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000954")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000955")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000956")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000957")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000958")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000959")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000960")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000961")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000962")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000963")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000964")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000965")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000966")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000967")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000968")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000969")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000970")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000971")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000972")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000973")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000975")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000976")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000977")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000978")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000979")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000980")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000981")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000982")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000983")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000984")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000985")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000986")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000987")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000988")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000989")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000990")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000991")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000992")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000993")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000994")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000995")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000996")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000997")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000998")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0000999")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001000")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001001")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001002")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001003")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001004")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001005")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001006")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001007")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001008")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001009")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001010")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001011")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001012")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001013")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001014")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001015")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001016")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001017")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001018")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001019")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001020")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001021")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001022")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001023")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001024")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001025")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001026")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001027")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001028")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001029")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001030")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001031")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001032")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001033")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001034")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001035")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001036")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001037")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001038")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001039")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001040")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001041")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001042")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001043")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001044")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001045")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001046")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001047")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001048")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001049")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001050")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001051")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001052")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001053")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001054")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001055")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001056")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001057")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001058")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001059")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001060")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001061")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001062")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001063")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001064")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001066")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001067")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001068")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001070")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001071")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001072")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001073")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001074")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001075")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001076")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001077")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001078")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001079")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001080")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001081")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001082")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001083")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001084")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001085")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001086")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001087")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001088")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001089")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001090")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001091")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001092")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001093")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001094")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001095")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001096")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001097")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001098")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001099")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001100")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001101")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001102")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001103")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001104")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001105")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001106")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001107")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001108")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001109")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001110")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001111")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001112")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001113")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001114")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001115")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001116")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001117")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001118")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001119")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001120")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001121")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001122")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001123")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001124")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001125")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001126")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001127")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001128")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001129")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001130")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001131")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001132")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001133")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001134")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001135")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001136")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001137")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001138")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001139")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001140")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001141")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001142")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001143")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001144")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001145")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001146")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001147")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001148")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001149")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001150")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001151")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001152")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001153")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001154")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001155")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001156")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001157")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001158")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001159")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001160")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001161")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001162")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001163")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001164")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001165")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001166")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001167")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001168")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001169")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001170")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001171")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001172")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001173")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001174")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001175")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001176")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001177")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001178")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001179")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001180")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001181")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001182")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001183")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001184")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001185")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001186")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001187")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001188")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001189")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001190")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001191")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001192")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001193")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001194")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001195")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001196")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001197")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001198")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001199")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001200")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001201")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001202")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001203")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001204")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001205")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001206")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001207")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001208")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001209")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001210")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001211")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001212")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001213")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001214")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001215")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001216")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001217")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001218")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001219")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001220")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001221")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001222")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001223")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001224")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001225")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001226")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001227")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001228")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001229")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001230")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001231")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001232")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001233")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001234")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001235")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001236")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001237")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001238")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001239")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001240")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001241")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001243")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001244")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001245")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001246")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001247")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001248")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001249")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001250")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001251")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001252")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001253")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001254")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001255")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001256")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001257")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001258")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001259")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001260")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001261")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001262")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001263")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001264")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001265")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001266")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001267")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001268")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001269")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001270")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001271")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001272")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001273")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001274")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001275")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001276")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001277")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001278")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001279")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001280")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001281")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001282")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001283")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001284")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001285")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001286")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001287")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001288")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001289")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001290")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001291")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001292")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001293")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001294")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001295")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001296")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001297")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001298")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001299")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001300")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001301")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001302")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001303")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001304")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001305")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001306")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001307")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001308")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001309")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001310")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001311")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001312")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001313")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001314")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001315")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001316")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001317")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001318")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001319")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001320")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001321")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001322")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001323")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001324")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001325")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001326")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001327")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001328")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001329")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001330")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001331")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001332")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001333")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001334")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001335")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001336")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001337")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001338")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001339")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001340")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001341")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001342")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001343")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001344")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001345")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001346")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001347")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001348")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001349")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001350")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001351")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001352")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001353")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001354")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001355")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001356")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001357")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001358")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001359")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001360")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001361")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001362")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001363")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001364")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001365")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001366")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001367")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001368")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001369")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001370")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001371")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001372")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001373")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001374")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001375")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001376")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001377")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001378")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001379")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001380")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001381")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001382")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001383")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001384")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001385")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001386")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001387")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001388")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001389")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001390")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001391")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001392")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001393")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001394")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001395")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001396")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001397")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001398")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001399")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001400")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001401")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001402")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001403")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001404")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001405")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001406")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001407")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001408")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001409")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001410")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001411")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001412")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001413")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001414")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001415")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001416")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001417")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001418")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001419")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001420")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001421")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001422")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001423")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001424")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001425")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001426")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001427")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001428")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001429")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001431")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001432")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001433")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001434")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001435")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001436")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001437")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001438")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001439")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001440")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001441")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001442")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001443")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001444")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001445")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001446")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001447")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001448")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001449")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001450")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001451")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001452")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001453")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001454")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001455")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001456")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001457")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001458")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001459")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001460")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001461")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001462")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001463")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001464")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001465")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001466")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001467")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001468")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001469")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001470")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001471")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001472")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001473")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001474")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001475")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001476")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001477")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001478")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001479")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001480")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001481")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001482")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001483")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001484")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001485")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001486")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001487")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001488")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001489")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001490")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001491")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001492")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001493")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001494")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001495")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001496")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001497")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001498")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001499")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001500")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001501")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001502")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001503")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001504")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001505")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001506")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001507")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001508")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001509")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001510")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001511")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001512")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001513")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001514")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001515")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001516")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001517")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001518")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001519")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001520")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001521")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001522")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001523")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001524")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001525")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001526")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001527")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001528")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001529")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001530")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001531")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001532")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001533")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001534")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001535")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001536")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001537")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001538")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001539")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001540")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001541")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001542")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001543")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001544")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001545")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001546")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001547")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001548")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001549")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001550")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001551")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001552")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001553")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001554")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001555")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001556")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001557")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001558")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001559")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001560")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001561")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001562")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001563")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001564")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001565")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001566")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001567")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001568")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001569")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001570")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001571")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001572")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001573")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001574")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001575")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001576")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001577")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001578")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001579")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001580")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001582")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001583")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001585")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001586")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001587")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001589")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001590")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001591")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001592")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001593")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001594")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001595")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001596")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001597")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001598")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001599")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001600")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001601")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001602")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001603")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001604")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001605")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001606")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001607")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001608")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001609")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001610")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001611")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001612")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001613")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001614")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001615")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001616")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001617")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001618")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001619")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001620")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001621")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001622")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001623")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001624")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001626")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001627")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001628")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001629")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001630")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001631")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001632")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001633")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001634")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001635")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001636")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001637")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001638")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001639")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001640")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001641")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001642")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001643")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001644")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001645")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001646")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001647")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001648")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001649")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001650")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001653")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001654")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001655")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001656")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001657")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001658")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001659")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001660")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001661")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001662")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001663")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001664")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001665")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001666")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001667")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001668")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001669")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001670")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001671")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001672")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001673")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001674")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001675")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001676")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001677")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001678")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001679")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001680")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001681")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001682")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001683")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001684")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001685")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001686")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001687")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001688")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001689")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001690")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001691")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001692")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001693")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001694")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001695")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001696")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001697")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001698")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001699")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001700")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001701")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001702")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001703")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001704")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001705")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001706")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001707")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001708")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001709")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001710")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001711")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001712")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001713")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001714")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001715")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001716")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001717")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001718")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001719")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001720")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001721")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001722")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001723")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001724")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001725")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001726")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001727")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001728")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001729")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001730")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001731")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001732")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001733")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001734")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001735")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001736")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001737")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001738")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001739")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001740")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001741")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001742")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001743")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001744")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001745")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001746")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001747")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001748")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001749")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001750")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001751")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001752")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001753")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001754")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001755")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001756")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001757")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001758")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001759")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001760")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001761")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001762")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001763")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001764")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001765")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001766")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001767")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001768")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001769")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001770")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001771")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001772")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001773")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001774")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001775")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001776")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001777")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001778")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001779")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001780")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001781")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001782")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001784")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001785")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001786")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001787")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001788")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001789")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001790")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001791")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001792")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001793")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001794")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001795")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001796")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001797")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001798")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001799")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001800")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001801")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001802")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001803")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001804")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001805")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001806")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001807")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001808")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001809")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001810")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001811")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001812")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001813")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001814")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001815")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001816")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001817")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001818")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001819")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001820")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001821")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001822")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001823")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001824")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001825")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001826")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001827")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001828")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001829")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001830")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001831")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001832")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001833")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001834")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001835")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001836")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001837")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001838")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001839")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001840")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001841")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001842")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001843")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001844")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001845")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001846")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001847")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001848")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001849")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001850")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001851")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001852")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001853")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001854")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001855")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001856")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001857")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001858")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001859")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001860")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001861")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001862")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001863")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001864")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001865")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001866")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001867")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001868")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001869")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001870")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001871")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001872")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001873")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001874")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001875")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001876")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001877")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001878")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001879")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001880")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001881")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001882")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001883")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001884")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001885")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001886")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001887")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001888")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001889")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001890")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001891")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001892")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001893")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001894")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001895")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001896")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001897")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001898")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001899")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001900")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001901")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001902")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001903")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001904")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001905")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001906")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001907")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001908")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001909")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001910")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001911")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001912")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001913")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001914")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001915")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001916")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001917")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001918")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001919")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001920")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001921")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001922")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001923")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001924")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001925")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001926")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001927")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001928")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001929")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0001930")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005836")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005837")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005841")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005843")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005845")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005847")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005848")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005849")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005850")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005851")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005852")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005853")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005854")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005855")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005856")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005857")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0005858")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100001")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100002")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100003")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100004")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100005")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100006")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100007")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100008")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100009")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100010")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100011")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100012")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100013")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100014")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100015")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100016")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100017")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100018")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100019")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100020")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_0100021")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000002")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000005")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000008")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000009")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000010")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000011")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000012")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000013")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000014")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000015")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000016")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000017")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000018")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000019")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000020")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000021")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000022")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000023")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000024")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000025")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000026")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000027")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000028")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000029")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000030")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000031")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000032")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000035")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000036")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000037")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000038")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000039")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000040")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000041")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000042")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000043")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000044")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000045")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000046")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000047")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000048")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000049")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000050")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000054")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000055")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000056")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000057")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000058")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000059")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000060")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000061")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000062")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000063")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000064")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000065")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000066")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000067")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000068")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000069")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000070")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000071")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000072")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000073")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000074")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000075")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000076")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000078")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000079")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000080")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000081")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000082")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000083")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000084")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000085")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000086")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000087")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000088")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000089")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000092")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000093")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000094")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000095")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000096")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000097")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000098")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000099")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000100")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000101")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000102")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000103")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000104")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000105")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000106")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000107")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000108")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000109")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000110")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000111")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000112")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000115")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000116")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000117")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000118")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000119")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000120")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000121")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000122")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000123")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000124")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000125")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000126")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000127")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000132")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000134")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000136")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000138")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000140")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000141")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000142")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000143")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000144")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000145")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000146")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000147")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000148")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000149")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000150")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000151")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000152")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000153")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000154")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000155")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000156")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000157")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000158")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000159")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000160")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000161")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000162")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000170")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000171")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000173")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000175")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000180")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000181")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000182")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000183")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000184")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000185")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1000186")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001186")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001187")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001188")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001189")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001190")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001191")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001192")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001193")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001194")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001195")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001196")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001197")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001217")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001244")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001246")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001247")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001249")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001251")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001254")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001255")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001259")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001260")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001261")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001262")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001263")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001264")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001265")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001266")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001267")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001268")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001269")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001270")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001271")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001272")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001273")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001274")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001275")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001277")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001279")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001280")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001281")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001282")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001283")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001284")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001285")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001286")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001287")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_1001288")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_2000061")) {
      return true;
    }
    if (uri == _namespace_SO("http://purl.obolibrary.org/obo/SO_3000000")) {
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

  private static Resource _namespace_SO(String accession) {
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

}
