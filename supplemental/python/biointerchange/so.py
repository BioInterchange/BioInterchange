import rdflib

from rdflib import Namespace

module BioInterchange

class SO:

    @classmethod
    def adjacent_to(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_adjacent_to)
        """
        return _namespace_SO('SEQUENCE_adjacent_to')

    @classmethod
    def complete_evidence_for_feature(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_complete_evidence_for_feature)
        """
        return _namespace_SO('SEQUENCE_complete_evidence_for_feature')

    @classmethod
    def contained_by(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_contained_by)
        """
        return _namespace_SO('SEQUENCE_contained_by')

    @classmethod
    def contains(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_contains)
        """
        return _namespace_SO('SEQUENCE_contains')

    @classmethod
    def derives_from(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_derives_from)
        """
        return _namespace_SO('SEQUENCE_derives_from')

    @classmethod
    def evidence_for_feature(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_evidence_for_feature)
        """
        return _namespace_SO('SEQUENCE_evidence_for_feature')

    @classmethod
    def guided_by(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_guided_by)
        """
        return _namespace_SO('SEQUENCE_guided_by')

    @classmethod
    def has_integral_part(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_has_integral_part)
        """
        return _namespace_SO('SEQUENCE_has_integral_part')

    @classmethod
    def has_origin(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_has_origin)
        """
        return _namespace_SO('SEQUENCE_has_origin')

    @classmethod
    def has_part(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_has_part)
        """
        return _namespace_SO('SEQUENCE_has_part')

    @classmethod
    def has_quality(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_has_quality)
        """
        return _namespace_SO('SEQUENCE_has_quality')

    @classmethod
    def homologous_to(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_homologous_to)
        """
        return _namespace_SO('SEQUENCE_homologous_to')

    @classmethod
    def integral_part_of(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_integral_part_of)
        """
        return _namespace_SO('SEQUENCE_integral_part_of')

    @classmethod
    def member_of(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_member_of)
        """
        return _namespace_SO('SEQUENCE_member_of')

    @classmethod
    def non_functional_homolog_of(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_non_functional_homolog_of)
        """
        return _namespace_SO('SEQUENCE_non_functional_homolog_of')

    @classmethod
    def orthologous_to(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_orthologous_to)
        """
        return _namespace_SO('SEQUENCE_orthologous_to')

    @classmethod
    def overlaps(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_overlaps)
        """
        return _namespace_SO('SEQUENCE_overlaps')

    @classmethod
    def paralogous_to(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_paralogous_to)
        """
        return _namespace_SO('SEQUENCE_paralogous_to')

    @classmethod
    def part_of(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_part_of)
        """
        return _namespace_SO('SEQUENCE_part_of')

    @classmethod
    def partial_evidence_for_feature(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_partial_evidence_for_feature)
        """
        return _namespace_SO('SEQUENCE_partial_evidence_for_feature')

    @classmethod
    def similar_to(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_similar_to)
        """
        return _namespace_SO('SEQUENCE_similar_to')

    @classmethod
    def transcribed_from(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_transcribed_from)
        """
        return _namespace_SO('SEQUENCE_transcribed_from')

    @classmethod
    def transcribed_to(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_transcribed_to)
        """
        return _namespace_SO('SEQUENCE_transcribed_to')

    @classmethod
    def variant_of(cls):
        """-- No comment or description provided. --
        (cls, SEQUENCE_variant_of)
        """
        return _namespace_SO('SEQUENCE_variant_of')

    @classmethod
    def Sequence_Ontology(cls):
        """-- No comment or description provided. --
        (cls, SO_0000000)
        """
        return _namespace_SO('SO_0000000')

    @classmethod
    def region(cls):
        """A sequence_feature with an extent greater than zero. A nucleotide region is composed of bases and a polypeptide region is composed of amino acids. (cls, SO:ke)
        (SO_0000001)
        """
        return _namespace_SO('SO_0000001')

    @classmethod
    def sequence_secondary_structure(cls):
        """A folded sequence. (cls, SO:ke)
        (SO_0000002)
        """
        return _namespace_SO('SO_0000002')

    @classmethod
    def G_quartet(cls):
        """G-quartets are unusual nucleic acid structures consisting of a planar arrangement where each guanine is hydrogen bonded by hoogsteen pairing to another guanine in the quartet. (cls, http://www.ncbi.nlm.nih.gov/pubmed/7919797?dopt=Abstract)
        (SO_0000003)
        """
        return _namespace_SO('SO_0000003')

    @classmethod
    def interior_coding_exon(cls):
        """-- No comment or description provided. --
        (cls, SO_0000004)
        """
        return _namespace_SO('SO_0000004')

    @classmethod
    def satellite_DNA(cls):
        """The many tandem repeats (cls, identical or related) of a short basic repeating unit; many have a base composition or other property different from the genome average that allows them to be separated from the bulk (main band) genomic DNA. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000005)
        """
        return _namespace_SO('SO_0000005')

    @classmethod
    def PCR_product(cls):
        """A region amplified by a PCR reaction. (cls, SO:ke)
        (SO_0000006)
        """
        return _namespace_SO('SO_0000006')

    @classmethod
    def read_pair(cls):
        """One of a pair of sequencing reads in which the two members of the pair are related by originating at either end of a clone insert. (cls, SO:ls)
        (SO_0000007)
        """
        return _namespace_SO('SO_0000007')

    @classmethod
    def gene_sensu_your_favorite_organism(cls):
        """-- No comment or description provided. --
        (cls, SO_0000008)
        """
        return _namespace_SO('SO_0000008')

    @classmethod
    def gene_class(cls):
        """-- No comment or description provided. --
        (cls, SO_0000009)
        """
        return _namespace_SO('SO_0000009')

    @classmethod
    def protein_coding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000010)
        """
        return _namespace_SO('SO_0000010')

    @classmethod
    def non_protein_coding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000011)
        """
        return _namespace_SO('SO_0000011')

    @classmethod
    def scRNA_primary_transcript(cls):
        """The primary transcript of any one of several small cytoplasmic RNA molecules present in the cytoplasm and sometimes nucleus of a eukaryote. (cls, http://www.ebi.ac.uk/embl/WebFeat/align/scRNA_s.html)
        (SO_0000012)
        """
        return _namespace_SO('SO_0000012')

    @classmethod
    def scRNA(cls):
        """A small non coding RNA sequence, present in the cytoplasm. (cls, SO:ke)
        (SO_0000013)
        """
        return _namespace_SO('SO_0000013')

    @classmethod
    def INR_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters required for the correct positioning of the polymerase for the start of transcription. Overlaps the TSS. The mammalian consensus sequence is YYAN(cls, T|A)YY; the Drosophila consensus sequence is TCA(G|T)t(T|C). In each the A is at position +1 with respect to the TSS. Functionally similar to the TATA box element. (PMID:12651739, PMID:16858867)
        (SO_0000014)
        """
        return _namespace_SO('SO_0000014')

    @classmethod
    def DPE_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters; Positioned from +28 to +32 with respect to the TSS (cls, +1). Experimental results suggest that the DPE acts in conjunction with the INR_motif to provide a binding site for TFIID in the absence of a TATA box to mediate transcription of TATA-less promoters. Consensus sequence (A|G)G(A|T)(C|T)(G|A|C). (PMID:12651739:12537576, PMID:16858867)
        (SO_0000015)
        """
        return _namespace_SO('SO_0000015')

    @classmethod
    def BREu_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, located immediately upstream of some TATA box elements at -37 to -32 with respect to the TSS (cls, +1). Consensus sequence is (G|C)(G|C)(G|A)CGCC. Binds TFIIB. (PMID:12651739, PMID:16858867)
        (SO_0000016)
        """
        return _namespace_SO('SO_0000016')

    @classmethod
    def PSE_motif(cls):
        """A sequence element characteristic of the promoters of snRNA genes transcribed by RNA polymerase II or by RNA polymerase III. Located between -45 and -60 relative to the TSS. The human PSE_motif consensus sequence is TCACCNTNA(cls, C|G)TNAAAAG(T|G). (PMID:12651739)
        (SO_0000017)
        """
        return _namespace_SO('SO_0000017')

    @classmethod
    def linkage_group(cls):
        """A group of loci that can be grouped in a linear order representing the different degrees of linkage among the genes concerned. (cls, ISBN:038752046)
        (SO_0000018)
        """
        return _namespace_SO('SO_0000018')

    @classmethod
    def RNA_internal_loop(cls):
        """A region of double stranded RNA where the bases do not conform to WC base pairing. The loop is closed on both sides by canonical base pairing. If the interruption to base pairing occurs on one strand only, it is known as a bulge. (cls, SO:ke)
        (SO_0000020)
        """
        return _namespace_SO('SO_0000020')

    @classmethod
    def asymmetric_RNA_internal_loop(cls):
        """An internal RNA loop where one of the strands includes more bases than the corresponding region on the other strand. (cls, SO:ke)
        (SO_0000021)
        """
        return _namespace_SO('SO_0000021')

    @classmethod
    def A_minor_RNA_motif(cls):
        """A region forming a motif, composed of adenines, where the minor groove edges are inserted into the minor groove of another helix. (cls, SO:ke)
        (SO_0000022)
        """
        return _namespace_SO('SO_0000022')

    @classmethod
    def K_turn_RNA_motif(cls):
        """The kink turn (cls, K-turn) is an RNA structural motif that creates a sharp (~120 degree) bend between two continuous helices. (SO:ke)
        (SO_0000023)
        """
        return _namespace_SO('SO_0000023')

    @classmethod
    def sarcin_like_RNA_motif(cls):
        """A loop in ribosomal RNA containing the sites of attack for ricin and sarcin. (cls, http://www.ncbi.nlm.nih.gov/pubmed/7897662)
        (SO_0000024)
        """
        return _namespace_SO('SO_0000024')

    @classmethod
    def symmetric_RNA_internal_loop(cls):
        """An internal RNA loop where the extent of the loop on both stands is the same size. (cls, SO:ke)
        (SO_0000025)
        """
        return _namespace_SO('SO_0000025')

    @classmethod
    def RNA_junction_loop(cls):
        """-- No comment or description provided. --
        (cls, SO_0000026)
        """
        return _namespace_SO('SO_0000026')

    @classmethod
    def RNA_hook_turn(cls):
        """-- No comment or description provided. --
        (cls, SO_0000027)
        """
        return _namespace_SO('SO_0000027')

    @classmethod
    def base_pair(cls):
        """-- No comment or description provided. --
        (cls, SO_0000028)
        """
        return _namespace_SO('SO_0000028')

    @classmethod
    def WC_base_pair(cls):
        """The canonical base pair, where two bases interact via WC edges, with glycosidic bonds oriented cis relative to the axis of orientation. (cls, PMID:12177293)
        (SO_0000029)
        """
        return _namespace_SO('SO_0000029')

    @classmethod
    def sugar_edge_base_pair(cls):
        """A type of non-canonical base-pairing. (cls, PMID:12177293)
        (SO_0000030)
        """
        return _namespace_SO('SO_0000030')

    @classmethod
    def aptamer(cls):
        """DNA or RNA molecules that have been selected from random pools based on their ability to bind other molecules. (cls, http://aptamer.icmb.utexas.edu)
        (SO_0000031)
        """
        return _namespace_SO('SO_0000031')

    @classmethod
    def DNA_aptamer(cls):
        """DNA molecules that have been selected from random pools based on their ability to bind other molecules. (cls, http:aptamer.icmb.utexas.edu)
        (SO_0000032)
        """
        return _namespace_SO('SO_0000032')

    @classmethod
    def RNA_aptamer(cls):
        """RNA molecules that have been selected from random pools based on their ability to bind other molecules. (cls, http://aptamer.icmb.utexas.edu)
        (SO_0000033)
        """
        return _namespace_SO('SO_0000033')

    @classmethod
    def morpholino_oligo(cls):
        """Morpholino oligos are synthesized from four different Morpholino subunits, each of which contains one of the four genetic bases (cls, A, C, G, T) linked to a 6-membered morpholine ring. Eighteen to 25 subunits of these four subunit types are joined in a specific order by non-ionic phosphorodiamidate intersubunit linkages to give a Morpholino. (http://www.gene-tools.com/)
        (SO_0000034)
        """
        return _namespace_SO('SO_0000034')

    @classmethod
    def riboswitch(cls):
        """A riboswitch is a part of an mRNA that can act as a direct sensor of small molecules to control their own expression. A riboswitch is a cis element in the 5' end of an mRNA, that acts as a direct sensor of metabolites. (cls, PMID:2820954)
        (SO_0000035)
        """
        return _namespace_SO('SO_0000035')

    @classmethod
    def matrix_attachment_site(cls):
        """A DNA region that is required for the binding of chromatin to the nuclear matrix. (cls, SO:ma)
        (SO_0000036)
        """
        return _namespace_SO('SO_0000036')

    @classmethod
    def locus_control_region(cls):
        """A DNA region that includes DNAse hypersensitive sites located 5' to a gene that confers the high-level, position-independent, and copy number-dependent expression to that gene. (cls, SO:ma)
        (SO_0000037)
        """
        return _namespace_SO('SO_0000037')

    @classmethod
    def match_set(cls):
        """A collection of match parts. (cls, SO:ke)
        (SO_0000038)
        """
        return _namespace_SO('SO_0000038')

    @classmethod
    def match_part(cls):
        """A part of a match, for example an hsp from blast is a match_part. (cls, SO:ke)
        (SO_0000039)
        """
        return _namespace_SO('SO_0000039')

    @classmethod
    def genomic_clone(cls):
        """A clone of a DNA region of a genome. (cls, SO:ma)
        (SO_0000040)
        """
        return _namespace_SO('SO_0000040')

    @classmethod
    def sequence_operation(cls):
        """An operation that can be applied to a sequence, that results in a change. (cls, SO:ke)
        (SO_0000041)
        """
        return _namespace_SO('SO_0000041')

    @classmethod
    def pseudogene_attribute(cls):
        """An attribute of a pseudogene (cls, SO:0000336). (SO:ma)
        (SO_0000042)
        """
        return _namespace_SO('SO_0000042')

    @classmethod
    def processed_pseudogene(cls):
        """A pseudogene where by an mRNA was retrotransposed. The mRNA sequence is transcribed back into the genome, lacking introns and promoters, but often including a polyA tail. (cls, SO:xp)
        (SO_0000043)
        """
        return _namespace_SO('SO_0000043')

    @classmethod
    def pseudogene_by_unequal_crossing_over(cls):
        """A pseudogene caused by unequal crossing over at recombination. (cls, SO:ke)
        (SO_0000044)
        """
        return _namespace_SO('SO_0000044')

    @classmethod
    def delete(cls):
        """To remove a subsection of sequence. (cls, SO:ke)
        (SO_0000045)
        """
        return _namespace_SO('SO_0000045')

    @classmethod
    def insert(cls):
        """To insert a subsection of sequence. (cls, SO:ke)
        (SO_0000046)
        """
        return _namespace_SO('SO_0000046')

    @classmethod
    def invert(cls):
        """To invert a subsection of sequence. (cls, SO:ke)
        (SO_0000047)
        """
        return _namespace_SO('SO_0000047')

    @classmethod
    def substitute(cls):
        """To substitute a subsection of sequence for another. (cls, SO:ke)
        (SO_0000048)
        """
        return _namespace_SO('SO_0000048')

    @classmethod
    def translocate(cls):
        """To translocate a subsection of sequence. (cls, SO:ke)
        (SO_0000049)
        """
        return _namespace_SO('SO_0000049')

    @classmethod
    def gene_part(cls):
        """A part of a gene, that has no other route in the ontology back to region. This concept is necessary for logical inference as these parts must have the properties of region. It also allows us to associate all the parts of genes with a gene. (cls, SO:ke)
        (SO_0000050)
        """
        return _namespace_SO('SO_0000050')

    @classmethod
    def probe(cls):
        """A DNA sequence used experimentally to detect the presence or absence of a complementary nucleic acid. (cls, SO:ma)
        (SO_0000051)
        """
        return _namespace_SO('SO_0000051')

    @classmethod
    def assortment_derived_deficiency(cls):
        """Either:
            -- No comment or description provided. --
            (cls, SO_0000052)
        Or:
            A multi-chromosome deficiency aberration generated by reassortment of other aberration components. (FB:gm)
            (SO_0000802)
        """
        return [ _namespace_SO('SO_0000052'), _namespace_SO('SO_0000802') ]

    @classmethod
    def sequence_variant_affecting_regulatory_region(cls):
        """A sequence_variant_effect which changes the regulatory region of a gene. (cls, SO:ke)
        (SO_0000053)
        """
        return _namespace_SO('SO_0000053')

    @classmethod
    def aneuploid(cls):
        """A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number. (cls, SO:ke)
        (SO_0000054)
        """
        return _namespace_SO('SO_0000054')

    @classmethod
    def hyperploid(cls):
        """A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number as extra chromosomes are present. (cls, SO:ke)
        (SO_0000055)
        """
        return _namespace_SO('SO_0000055')

    @classmethod
    def hypoploid(cls):
        """A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number as some chromosomes are missing. (cls, SO:ke)
        (SO_0000056)
        """
        return _namespace_SO('SO_0000056')

    @classmethod
    def operator(cls):
        """A regulatory element of an operon to which activators or repressors bind thereby effecting translation of genes in that operon. (cls, SO:ma)
        (SO_0000057)
        """
        return _namespace_SO('SO_0000057')

    @classmethod
    def assortment_derived_aneuploid(cls):
        """Either:
            -- No comment or description provided. --
            (cls, SO_0000058)
        Or:
            A multi-chromosome aberration generated by reassortment of other aberration components; presumed to have a deficiency or a duplication. (FB:gm)
            (SO_0000803)
        """
        return [ _namespace_SO('SO_0000058'), _namespace_SO('SO_0000803') ]

    @classmethod
    def nuclease_binding_site(cls):
        """A binding site that, of a nucleotide molecule, that interacts selectively and non-covalently with polypeptide residues of a nuclease. (cls, SO:cb)
        (SO_0000059)
        """
        return _namespace_SO('SO_0000059')

    @classmethod
    def compound_chromosome_arm(cls):
        """-- No comment or description provided. --
        (cls, SO_0000060)
        """
        return _namespace_SO('SO_0000060')

    @classmethod
    def restriction_enzyme_binding_site(cls):
        """A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues of a restriction enzyme. (cls, SO:cb)
        (SO_0000061)
        """
        return _namespace_SO('SO_0000061')

    @classmethod
    def deficient_intrachromosomal_transposition(cls):
        """An intrachromosomal transposition whereby a translocation in which one of the four broken ends loses a segment before re-joining. (cls, FB:reference_manual)
        (SO_0000062)
        """
        return _namespace_SO('SO_0000062')

    @classmethod
    def deficient_interchromosomal_transposition(cls):
        """An interchromosomal transposition whereby a translocation in which one of the four broken ends loses a segment before re-joining. (cls, SO:ke)
        (SO_0000063)
        """
        return _namespace_SO('SO_0000063')

    @classmethod
    def gene_by_transcript_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000064)
        """
        return _namespace_SO('SO_0000064')

    @classmethod
    def free_chromosome_arm(cls):
        """A chromosome structure variation whereby an arm exists as an individual chromosome element. (cls, SO:ke)
        (SO_0000065)
        """
        return _namespace_SO('SO_0000065')

    @classmethod
    def gene_by_polyadenylation_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000066)
        """
        return _namespace_SO('SO_0000066')

    @classmethod
    def gene_to_gene_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000067)
        """
        return _namespace_SO('SO_0000067')

    @classmethod
    def overlapping(cls):
        """An attribute describing a gene that has a sequence that overlaps the sequence of another gene. (cls, SO:ke)
        (SO_0000068)
        """
        return _namespace_SO('SO_0000068')

    @classmethod
    def inside_intron(cls):
        """An attribute to describe a gene when it is located within the intron of another gene. (cls, SO:ke)
        (SO_0000069)
        """
        return _namespace_SO('SO_0000069')

    @classmethod
    def inside_intron_antiparallel(cls):
        """An attribute to describe a gene when it is located within the intron of another gene and on the opposite strand. (cls, SO:ke)
        (SO_0000070)
        """
        return _namespace_SO('SO_0000070')

    @classmethod
    def inside_intron_parallel(cls):
        """An attribute to describe a gene when it is located within the intron of another gene and on the same strand. (cls, SO:ke)
        (SO_0000071)
        """
        return _namespace_SO('SO_0000071')

    @classmethod
    def end_overlapping_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0000072)
        """
        return _namespace_SO('SO_0000072')

    @classmethod
    def five_prime_three_prime_overlap(cls):
        """An attribute to describe a gene when the five prime region overlaps with another gene's 3' region. (cls, SO:ke)
        (SO_0000073)
        """
        return _namespace_SO('SO_0000073')

    @classmethod
    def five_prime_five_prime_overlap(cls):
        """An attribute to describe a gene when the five prime region overlaps with another gene's five prime region. (cls, SO:ke)
        (SO_0000074)
        """
        return _namespace_SO('SO_0000074')

    @classmethod
    def three_prime_three_prime_overlap(cls):
        """An attribute to describe a gene when the 3' region overlaps with another gene's 3' region. (cls, SO:ke)
        (SO_0000075)
        """
        return _namespace_SO('SO_0000075')

    @classmethod
    def three_prime_five_prime_overlap(cls):
        """An attribute to describe a gene when the 3' region overlaps with another gene's 5' region. (cls, SO:ke)
        (SO_0000076)
        """
        return _namespace_SO('SO_0000076')

    @classmethod
    def antisense(cls):
        """A region sequence that is complementary to a sequence of messenger RNA. (cls, SO:ke)
        (SO_0000077)
        """
        return _namespace_SO('SO_0000077')

    @classmethod
    def polycistronic_transcript(cls):
        """A transcript that is polycistronic. (cls, SO:xp)
        (SO_0000078)
        """
        return _namespace_SO('SO_0000078')

    @classmethod
    def dicistronic_transcript(cls):
        """A transcript that is dicistronic. (cls, SO:ke)
        (SO_0000079)
        """
        return _namespace_SO('SO_0000079')

    @classmethod
    def operon_member(cls):
        """-- No comment or description provided. --
        (cls, SO_0000080)
        """
        return _namespace_SO('SO_0000080')

    @classmethod
    def gene_array_member(cls):
        """-- No comment or description provided. --
        (cls, SO_0000081)
        """
        return _namespace_SO('SO_0000081')

    @classmethod
    def processed_transcript_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000082)
        """
        return _namespace_SO('SO_0000082')

    @classmethod
    def macronuclear_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000083)
        """
        return _namespace_SO('SO_0000083')

    @classmethod
    def micronuclear_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000084)
        """
        return _namespace_SO('SO_0000084')

    @classmethod
    def gene_by_genome_location(cls):
        """-- No comment or description provided. --
        (cls, SO_0000085)
        """
        return _namespace_SO('SO_0000085')

    @classmethod
    def gene_by_organelle_of_genome(cls):
        """-- No comment or description provided. --
        (cls, SO_0000086)
        """
        return _namespace_SO('SO_0000086')

    @classmethod
    def nuclear_gene(cls):
        """A gene from nuclear sequence. (cls, SO:xp)
        (SO_0000087)
        """
        return _namespace_SO('SO_0000087')

    @classmethod
    def mt_gene(cls):
        """A gene located in mitochondrial sequence. (cls, SO:xp)
        (SO_0000088)
        """
        return _namespace_SO('SO_0000088')

    @classmethod
    def kinetoplast_gene(cls):
        """A gene located in kinetoplast sequence. (cls, SO:xp)
        (SO_0000089)
        """
        return _namespace_SO('SO_0000089')

    @classmethod
    def plastid_gene(cls):
        """A gene from plastid sequence. (cls, SO:xp)
        (SO_0000090)
        """
        return _namespace_SO('SO_0000090')

    @classmethod
    def apicoplast_gene(cls):
        """A gene from apicoplast sequence. (cls, SO:xp)
        (SO_0000091)
        """
        return _namespace_SO('SO_0000091')

    @classmethod
    def ct_gene(cls):
        """A gene from chloroplast sequence. (cls, SO:xp)
        (SO_0000092)
        """
        return _namespace_SO('SO_0000092')

    @classmethod
    def chromoplast_gene(cls):
        """A gene from chromoplast_sequence. (cls, SO:xp)
        (SO_0000093)
        """
        return _namespace_SO('SO_0000093')

    @classmethod
    def cyanelle_gene(cls):
        """A gene from cyanelle sequence. (cls, SO:xp)
        (SO_0000094)
        """
        return _namespace_SO('SO_0000094')

    @classmethod
    def leucoplast_gene(cls):
        """A plastid gene from leucoplast sequence. (cls, SO:xp)
        (SO_0000095)
        """
        return _namespace_SO('SO_0000095')

    @classmethod
    def proplastid_gene(cls):
        """A gene from proplastid sequence. (cls, SO:ke)
        (SO_0000096)
        """
        return _namespace_SO('SO_0000096')

    @classmethod
    def nucleomorph_gene(cls):
        """A gene from nucleomorph sequence. (cls, SO:xp)
        (SO_0000097)
        """
        return _namespace_SO('SO_0000097')

    @classmethod
    def plasmid_gene(cls):
        """A gene from plasmid sequence. (cls, SO:xp)
        (SO_0000098)
        """
        return _namespace_SO('SO_0000098')

    @classmethod
    def proviral_gene(cls):
        """A gene from proviral sequence. (cls, SO:xp)
        (SO_0000099)
        """
        return _namespace_SO('SO_0000099')

    @classmethod
    def endogenous_retroviral_gene(cls):
        """A proviral gene with origin endogenous retrovirus. (cls, SO:xp)
        (SO_0000100)
        """
        return _namespace_SO('SO_0000100')

    @classmethod
    def transposable_element(cls):
        """A transposon or insertion sequence. An element that can insert in a variety of DNA sequences. (cls, http://www.sci.sdsu.edu/~smaloy/Glossary/T.html)
        (SO_0000101)
        """
        return _namespace_SO('SO_0000101')

    @classmethod
    def expressed_sequence_match(cls):
        """A match to an EST or cDNA sequence. (cls, SO:ke)
        (SO_0000102)
        """
        return _namespace_SO('SO_0000102')

    @classmethod
    def clone_insert_end(cls):
        """The end of the clone insert. (cls, SO:ke)
        (SO_0000103)
        """
        return _namespace_SO('SO_0000103')

    @classmethod
    def polypeptide(cls):
        """A sequence of amino acids linked by peptide bonds which may lack appreciable tertiary structure and may not be liable to irreversible denaturation. (cls, SO:ma)
        (SO_0000104)
        """
        return _namespace_SO('SO_0000104')

    @classmethod
    def chromosome_arm(cls):
        """A region of the chromosome between the centromere and the telomere. Human chromosomes have two arms, the p arm (cls, short) and the q arm (long) which are separated from each other by the centromere. (http://www.medterms.com/script/main/art.asp?articlekey=5152)
        (SO_0000105)
        """
        return _namespace_SO('SO_0000105')

    @classmethod
    def non_capped_primary_transcript(cls):
        """-- No comment or description provided. --
        (cls, SO_0000106)
        """
        return _namespace_SO('SO_0000106')

    @classmethod
    def sequencing_primer(cls):
        """-- No comment or description provided. --
        (cls, SO_0000107)
        """
        return _namespace_SO('SO_0000107')

    @classmethod
    def mRNA_with_frameshift(cls):
        """An mRNA with a frameshift. (cls, SO:xp)
        (SO_0000108)
        """
        return _namespace_SO('SO_0000108')

    @classmethod
    def sequence_variant_obs(cls):
        """A sequence_variant is a non exact copy of a sequence_feature or genome exhibiting one or more sequence_alteration. (cls, SO:ke)
        (SO_0000109)
        """
        return _namespace_SO('SO_0000109')

    @classmethod
    def sequence_feature(cls):
        """An extent of biological sequence. (cls, SO:ke)
        (SO_0000110)
        """
        return _namespace_SO('SO_0000110')

    @classmethod
    def transposable_element_gene(cls):
        """A gene encoded within a transposable element. For example gag, int, env and pol are the transposable element genes of the TY element in yeast. (cls, SO:ke)
        (SO_0000111)
        """
        return _namespace_SO('SO_0000111')

    @classmethod
    def primer(cls):
        """An oligo to which new deoxyribonucleotides can be added by DNA polymerase. (cls, SO:ke)
        (SO_0000112)
        """
        return _namespace_SO('SO_0000112')

    @classmethod
    def proviral_region(cls):
        """A viral sequence which has integrated into a host genome. (cls, SO:ke)
        (SO_0000113)
        """
        return _namespace_SO('SO_0000113')

    @classmethod
    def methylated_cytosine(cls):
        """A methylated deoxy-cytosine. (cls, SO:ke)
        (SO_0000114)
        """
        return _namespace_SO('SO_0000114')

    @classmethod
    def transcript_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000115)
        """
        return _namespace_SO('SO_0000115')

    @classmethod
    def edited(cls):
        """An attribute describing a sequence that is modified by editing. (cls, SO:ke)
        (SO_0000116)
        """
        return _namespace_SO('SO_0000116')

    @classmethod
    def transcript_with_readthrough_stop_codon(cls):
        """-- No comment or description provided. --
        (cls, SO_0000117)
        """
        return _namespace_SO('SO_0000117')

    @classmethod
    def transcript_with_translational_frameshift(cls):
        """A transcript with a translational frameshift. (cls, SO:xp)
        (SO_0000118)
        """
        return _namespace_SO('SO_0000118')

    @classmethod
    def regulated(cls):
        """An attribute to describe a sequence that is regulated. (cls, SO:ke)
        (SO_0000119)
        """
        return _namespace_SO('SO_0000119')

    @classmethod
    def protein_coding_primary_transcript(cls):
        """A primary transcript that, at least in part, encodes one or more proteins. (cls, SO:ke)
        (SO_0000120)
        """
        return _namespace_SO('SO_0000120')

    @classmethod
    def forward_primer(cls):
        """A single stranded oligo used for polymerase chain reaction. (cls, http://mged.sourceforge.net/ontologies/MGEDontology.php)
        (SO_0000121)
        """
        return _namespace_SO('SO_0000121')

    @classmethod
    def RNA_sequence_secondary_structure(cls):
        """A folded RNA sequence. (cls, SO:ke)
        (SO_0000122)
        """
        return _namespace_SO('SO_0000122')

    @classmethod
    def transcriptionally_regulated(cls):
        """An attribute describing a gene that is regulated at transcription. (cls, SO:ma)
        (SO_0000123)
        """
        return _namespace_SO('SO_0000123')

    @classmethod
    def transcriptionally_constitutive(cls):
        """Expressed in relatively constant amounts without regard to cellular environmental conditions such as the concentration of a particular substrate. (cls, SO:ke)
        (SO_0000124)
        """
        return _namespace_SO('SO_0000124')

    @classmethod
    def transcriptionally_induced(cls):
        """An inducer molecule is required for transcription to occur. (cls, SO:ke)
        (SO_0000125)
        """
        return _namespace_SO('SO_0000125')

    @classmethod
    def transcriptionally_repressed(cls):
        """A repressor molecule is required for transcription to stop. (cls, SO:ke)
        (SO_0000126)
        """
        return _namespace_SO('SO_0000126')

    @classmethod
    def silenced_gene(cls):
        """A gene that is silenced. (cls, SO:xp)
        (SO_0000127)
        """
        return _namespace_SO('SO_0000127')

    @classmethod
    def gene_silenced_by_DNA_modification(cls):
        """A gene that is silenced by DNA modification. (cls, SO:xp)
        (SO_0000128)
        """
        return _namespace_SO('SO_0000128')

    @classmethod
    def gene_silenced_by_DNA_methylation(cls):
        """A gene that is silenced by DNA methylation. (cls, SO:xp)
        (SO_0000129)
        """
        return _namespace_SO('SO_0000129')

    @classmethod
    def post_translationally_regulated(cls):
        """An attribute describing a gene that is regulated after it has been translated. (cls, SO:ke)
        (SO_0000130)
        """
        return _namespace_SO('SO_0000130')

    @classmethod
    def translationally_regulated(cls):
        """An attribute describing a gene that is regulated as it is translated. (cls, SO:ke)
        (SO_0000131)
        """
        return _namespace_SO('SO_0000131')

    @classmethod
    def reverse_primer(cls):
        """A single stranded oligo used for polymerase chain reaction. (cls, http://mged.sourceforge.net/ontologies/MGEDontology.php)
        (SO_0000132)
        """
        return _namespace_SO('SO_0000132')

    @classmethod
    def epigenetically_modified(cls):
        """This attribute describes a gene where heritable changes other than those in the DNA sequence occur. These changes include: modification to the DNA (cls, such as DNA methylation, the covalent modification of cytosine), and post-translational modification of histones. (SO:ke)
        (SO_0000133)
        """
        return _namespace_SO('SO_0000133')

    @classmethod
    def genomically_imprinted(cls):
        """Imprinted genes are epigenetically modified genes that are expressed monoallelically according to their parent of origin. (cls, SO:ke)
        (SO_0000134)
        """
        return _namespace_SO('SO_0000134')

    @classmethod
    def maternally_imprinted(cls):
        """The maternal copy of the gene is modified, rendering it transcriptionally silent. (cls, SO:ke)
        (SO_0000135)
        """
        return _namespace_SO('SO_0000135')

    @classmethod
    def paternally_imprinted(cls):
        """The paternal copy of the gene is modified, rendering it transcriptionally silent. (cls, SO:ke)
        (SO_0000136)
        """
        return _namespace_SO('SO_0000136')

    @classmethod
    def allelically_excluded(cls):
        """Allelic exclusion is a process occurring in diploid organisms, where a gene is inactivated and not expressed in that cell. (cls, SO:ke)
        (SO_0000137)
        """
        return _namespace_SO('SO_0000137')

    @classmethod
    def gene_rearranged_at_DNA_level(cls):
        """An epigenetically modified gene, rearranged at the DNA level. (cls, SO:xp)
        (SO_0000138)
        """
        return _namespace_SO('SO_0000138')

    @classmethod
    def ribosome_entry_site(cls):
        """Region in mRNA where ribosome assembles. (cls, SO:ke)
        (SO_0000139)
        """
        return _namespace_SO('SO_0000139')

    @classmethod
    def attenuator(cls):
        """A sequence segment located within the five prime end of an mRNA that causes premature termination of translation. (cls, SO:as)
        (SO_0000140)
        """
        return _namespace_SO('SO_0000140')

    @classmethod
    def terminator(cls):
        """The sequence of DNA located either at the end of the transcript that causes RNA polymerase to terminate transcription. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000141)
        """
        return _namespace_SO('SO_0000141')

    @classmethod
    def DNA_sequence_secondary_structure(cls):
        """A folded DNA sequence. (cls, SO:ke)
        (SO_0000142)
        """
        return _namespace_SO('SO_0000142')

    @classmethod
    def assembly_component(cls):
        """A region of known length which may be used to manufacture a longer region. (cls, SO:ke)
        (SO_0000143)
        """
        return _namespace_SO('SO_0000143')

    @classmethod
    def primary_transcript_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000144)
        """
        return _namespace_SO('SO_0000144')

    @classmethod
    def recoded_codon(cls):
        """A codon that has been redefined at translation. The redefinition may be as a result of translational bypass, translational frameshifting or stop codon readthrough. (cls, SO:xp)
        (SO_0000145)
        """
        return _namespace_SO('SO_0000145')

    @classmethod
    def capped(cls):
        """An attribute describing when a sequence, usually an mRNA is capped by the addition of a modified guanine nucleotide at the 5' end. (cls, SO:ke)
        (SO_0000146)
        """
        return _namespace_SO('SO_0000146')

    @classmethod
    def exon(cls):
        """A region of the transcript sequence within a gene which is not removed from the primary RNA transcript by RNA splicing. (cls, SO:ke)
        (SO_0000147)
        """
        return _namespace_SO('SO_0000147')

    @classmethod
    def supercontig(cls):
        """One or more contigs that have been ordered and oriented using end-read information. Contains gaps that are filled with N's. (cls, SO:ls)
        (SO_0000148)
        """
        return _namespace_SO('SO_0000148')

    @classmethod
    def contig(cls):
        """A contiguous sequence derived from sequence assembly. Has no gaps, but may contain N's from unavailable bases. (cls, SO:ls)
        (SO_0000149)
        """
        return _namespace_SO('SO_0000149')

    @classmethod
    def read(cls):
        """A sequence obtained from a single sequencing experiment. Typically a read is produced when a base calling program interprets information from a chromatogram trace file produced from a sequencing machine. (cls, SO:rd)
        (SO_0000150)
        """
        return _namespace_SO('SO_0000150')

    @classmethod
    def clone(cls):
        """A piece of DNA that has been inserted in a vector so that it can be propagated in a host bacterium or some other organism. (cls, SO:ke)
        (SO_0000151)
        """
        return _namespace_SO('SO_0000151')

    @classmethod
    def YAC(cls):
        """Yeast Artificial Chromosome, a vector constructed from the telomeric, centromeric, and replication origin sequences needed for replication in yeast cells. (cls, SO:ma)
        (SO_0000152)
        """
        return _namespace_SO('SO_0000152')

    @classmethod
    def BAC(cls):
        """Bacterial Artificial Chromosome, a cloning vector that can be propagated as mini-chromosomes in a bacterial host. (cls, SO:ma)
        (SO_0000153)
        """
        return _namespace_SO('SO_0000153')

    @classmethod
    def PAC(cls):
        """The P1-derived artificial chromosome are DNA constructs that are derived from the DNA of P1 bacteriophage. They can carry large amounts (cls, about 100-300 kilobases) of other sequences for a variety of bioengineering purposes. It is one type of vector used to clone DNA fragments (100- to 300-kb insert size; average, 150 kb) in Escherichia coli cells. (http://en.wikipedia.org/wiki/P1-derived_artificial_chromosome)
        (SO_0000154)
        """
        return _namespace_SO('SO_0000154')

    @classmethod
    def plasmid(cls):
        """A self replicating, using the hosts cellular machinery, often circular nucleic acid molecule that is distinct from a chromosome in the organism. (cls, SO:ma)
        (SO_0000155)
        """
        return _namespace_SO('SO_0000155')

    @classmethod
    def cosmid(cls):
        """A cloning vector that is a hybrid of lambda phages and a plasmid that can be propagated as a plasmid or packaged as a phage,since they retain the lambda cos sites. (cls, SO:ma)
        (SO_0000156)
        """
        return _namespace_SO('SO_0000156')

    @classmethod
    def phagemid(cls):
        """A plasmid which carries within its sequence a bacteriophage replication origin. When the host bacterium is infected with \"helper\" phage, a phagemid is replicated along with the phage DNA and packaged into phage capsids. (cls, SO:ma)
        (SO_0000157)
        """
        return _namespace_SO('SO_0000157')

    @classmethod
    def fosmid(cls):
        """A cloning vector that utilizes the E. coli F factor. (cls, SO:ma)
        (SO_0000158)
        """
        return _namespace_SO('SO_0000158')

    @classmethod
    def deletion(cls):
        """The point at which one or more contiguous nucleotides were excised. (cls, SO:ke)
        (SO_0000159)
        """
        return _namespace_SO('SO_0000159')

    @classmethod
    def lambda_clone(cls):
        """A linear clone derived from lambda bacteriophage. The genes involved in the lysogenic pathway are removed from the from the viral DNA. Up to 25 kb of foreign DNA can then be inserted into the lambda genome. (cls, ISBN:0-1767-2380-8)
        (SO_0000160)
        """
        return _namespace_SO('SO_0000160')

    @classmethod
    def methylated_adenine(cls):
        """A modified  base in which adenine has been methylated. (cls, SO:ke)
        (SO_0000161)
        """
        return _namespace_SO('SO_0000161')

    @classmethod
    def splice_site(cls):
        """Consensus region of primary transcript bordering junction of splicing. A region that overlaps exactly 2 base and adjacent_to splice_junction. (cls, SO:cjm, SO:ke)
        (SO_0000162)
        """
        return _namespace_SO('SO_0000162')

    @classmethod
    def five_prime_cis_splice_site(cls):
        """Intronic 2 bp region bordering the exon, at the 5' edge of the intron. A splice_site that is downstream_adjacent_to exon and starts intron. (cls, http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
        (SO_0000163)
        """
        return _namespace_SO('SO_0000163')

    @classmethod
    def three_prime_cis_splice_site(cls):
        """Intronic 2 bp region bordering the exon, at the 3' edge of the intron. A splice_site that is upstream_adjacent_to exon and finishes intron. (cls, http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
        (SO_0000164)
        """
        return _namespace_SO('SO_0000164')

    @classmethod
    def enhancer(cls):
        """A cis-acting sequence that increases the utilization of (cls, some) eukaryotic promoters, and can function in either orientation and in any location (upstream or downstream) relative to the promoter. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000165)
        """
        return _namespace_SO('SO_0000165')

    @classmethod
    def enhancer_bound_by_factor(cls):
        """An enhancer bound by a factor. (cls, SO:xp)
        (SO_0000166)
        """
        return _namespace_SO('SO_0000166')

    @classmethod
    def promoter(cls):
        """A regulatory_region composed of the TSS(cls, s) and binding sites for TF_complexes of the basal transcription machinery. (SO:regcreative)
        (SO_0000167)
        """
        return _namespace_SO('SO_0000167')

    @classmethod
    def restriction_enzyme_cut_site(cls):
        """A specific nucleotide sequence of DNA at or near which a particular restriction enzyme cuts the DNA. (cls, SO:ma)
        (SO_0000168)
        """
        return _namespace_SO('SO_0000168')

    @classmethod
    def RNApol_I_promoter(cls):
        """A DNA sequence in eukaryotic DNA to which RNA polymerase I binds, to begin transcription. (cls, SO:ke)
        (SO_0000169)
        """
        return _namespace_SO('SO_0000169')

    @classmethod
    def RNApol_II_promoter(cls):
        """A DNA sequence in eukaryotic DNA to which RNA polymerase II binds, to begin transcription. (cls, SO:ke)
        (SO_0000170)
        """
        return _namespace_SO('SO_0000170')

    @classmethod
    def RNApol_III_promoter(cls):
        """A DNA sequence in eukaryotic DNA to which RNA polymerase III binds, to begin transcription. (cls, SO:ke)
        (SO_0000171)
        """
        return _namespace_SO('SO_0000171')

    @classmethod
    def CAAT_signal(cls):
        """Part of a conserved sequence located about 75-bp upstream of the start point of eukaryotic transcription units which may be involved in RNA polymerase binding; consensus=GG(cls, C|T)CAATCT. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000172)
        """
        return _namespace_SO('SO_0000172')

    @classmethod
    def GC_rich_promoter_region(cls):
        """A conserved GC-rich region located upstream of the start point of eukaryotic transcription units which may occur in multiple copies or in either orientation; consensus=GGGCGG. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000173)
        """
        return _namespace_SO('SO_0000173')

    @classmethod
    def TATA_box(cls):
        """A conserved AT-rich septamer found about 25-bp before the start point of many eukaryotic RNA polymerase II transcript units; may be involved in positioning the enzyme for correct initiation; consensus=TATA(cls, A|T)A(A|T). (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, PMID:16858867)
        (SO_0000174)
        """
        return _namespace_SO('SO_0000174')

    @classmethod
    def minus_10_signal(cls):
        """A conserved region about 10-bp upstream of the start point of bacterial transcription units which may be involved in binding RNA polymerase; consensus=TAtAaT. This region is associated with sigma factor 70. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000175)
        """
        return _namespace_SO('SO_0000175')

    @classmethod
    def minus_35_signal(cls):
        """A conserved hexamer about 35-bp upstream of the start point of bacterial transcription units; consensus=TTGACa or TGTTGACA. This region is associated with sigma factor 70. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000176)
        """
        return _namespace_SO('SO_0000176')

    @classmethod
    def cross_genome_match(cls):
        """A nucleotide match against a sequence from another organism. (cls, SO:ma)
        (SO_0000177)
        """
        return _namespace_SO('SO_0000177')

    @classmethod
    def operon(cls):
        """A group of contiguous genes transcribed as a single (cls, polycistronic) mRNA from a single regulatory region. (SO:ma)
        (SO_0000178)
        """
        return _namespace_SO('SO_0000178')

    @classmethod
    def clone_insert_start(cls):
        """Either:
            The start of the clone insert. (cls, SO:ke)
            (SO_0000179)
        Or:
            -- No comment or description provided. --
            (SO_0000767)
        """
        return [ _namespace_SO('SO_0000179'), _namespace_SO('SO_0000767') ]

    @classmethod
    def retrotransposon(cls):
        """A transposable element that is incorporated into a chromosome by a mechanism that requires reverse transcriptase. (cls, http://www.dddmag.com/Glossary.aspx#r)
        (SO_0000180)
        """
        return _namespace_SO('SO_0000180')

    @classmethod
    def translated_nucleotide_match(cls):
        """A match against a translated sequence. (cls, SO:ke)
        (SO_0000181)
        """
        return _namespace_SO('SO_0000181')

    @classmethod
    def DNA_transposon(cls):
        """A transposon where the mechanism of transposition is via a DNA intermediate. (cls, SO:ke)
        (SO_0000182)
        """
        return _namespace_SO('SO_0000182')

    @classmethod
    def non_transcribed_region(cls):
        """A region of the gene which is not transcribed. (cls, SO:ke)
        (SO_0000183)
        """
        return _namespace_SO('SO_0000183')

    @classmethod
    def U2_intron(cls):
        """A major type of spliceosomal intron spliced by the U2 spliceosome, that includes U1, U2, U4/U6 and U5 snRNAs. (cls, PMID:9428511)
        (SO_0000184)
        """
        return _namespace_SO('SO_0000184')

    @classmethod
    def primary_transcript(cls):
        """A transcript that in its initial state requires modification to be functional. (cls, SO:ma)
        (SO_0000185)
        """
        return _namespace_SO('SO_0000185')

    @classmethod
    def LTR_retrotransposon(cls):
        """A retrotransposon flanked by long terminal repeat sequences. (cls, SO:ke)
        (SO_0000186)
        """
        return _namespace_SO('SO_0000186')

    @classmethod
    def repeat_family(cls):
        """A group of characterized repeat sequences. (cls, SO:ke)
        (SO_0000187)
        """
        return _namespace_SO('SO_0000187')

    @classmethod
    def intron(cls):
        """A region of a primary transcript that is transcribed, but removed from within the transcript by splicing together the sequences (cls, exons) on either side of it. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000188)
        """
        return _namespace_SO('SO_0000188')

    @classmethod
    def non_LTR_retrotransposon(cls):
        """A retrotransposon without long terminal repeat sequences. (cls, SO:ke)
        (SO_0000189)
        """
        return _namespace_SO('SO_0000189')

    @classmethod
    def five_prime_intron(cls):
        """-- No comment or description provided. --
        (cls, SO_0000190)
        """
        return _namespace_SO('SO_0000190')

    @classmethod
    def interior_intron(cls):
        """-- No comment or description provided. --
        (cls, SO_0000191)
        """
        return _namespace_SO('SO_0000191')

    @classmethod
    def three_prime_intron(cls):
        """-- No comment or description provided. --
        (cls, SO_0000192)
        """
        return _namespace_SO('SO_0000192')

    @classmethod
    def RFLP_fragment(cls):
        """A DNA fragment used as a reagent to detect the polymorphic genomic loci by hybridizing against the genomic DNA digested with a given restriction enzyme. (cls, GOC:pj)
        (SO_0000193)
        """
        return _namespace_SO('SO_0000193')

    @classmethod
    def LINE_element(cls):
        """A dispersed repeat family with many copies, each from 1 to 6 kb long. New elements are generated by retroposition of a transcribed copy. Typically the LINE contains 2 ORF's one of which is reverse transcriptase, and 3'and 5' direct repeats. (cls, http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html)
        (SO_0000194)
        """
        return _namespace_SO('SO_0000194')

    @classmethod
    def coding_exon(cls):
        """An exon whereby at least one base is part of a codon (cls, here, 'codon' is inclusive of the stop_codon). (SO:ke)
        (SO_0000195)
        """
        return _namespace_SO('SO_0000195')

    @classmethod
    def five_prime_coding_exon_coding_region(cls):
        """The sequence of the five_prime_coding_exon that codes for protein. (cls, SO:cjm)
        (SO_0000196)
        """
        return _namespace_SO('SO_0000196')

    @classmethod
    def three_prime_coding_exon_coding_region(cls):
        """The sequence of the three_prime_coding_exon that codes for protein. (cls, SO:cjm)
        (SO_0000197)
        """
        return _namespace_SO('SO_0000197')

    @classmethod
    def noncoding_exon(cls):
        """An exon that does not contain any codons. (cls, SO:ke)
        (SO_0000198)
        """
        return _namespace_SO('SO_0000198')

    @classmethod
    def translocation(cls):
        """A region of nucleotide sequence that has translocated to a new position. (cls, SO:ke)
        (SO_0000199)
        """
        return _namespace_SO('SO_0000199')

    @classmethod
    def five_prime_coding_exon(cls):
        """The 5' most coding exon. (cls, SO:ke)
        (SO_0000200)
        """
        return _namespace_SO('SO_0000200')

    @classmethod
    def interior_exon(cls):
        """An exon that is bounded by 5' and 3' splice sites. (cls, PMID:10373547)
        (SO_0000201)
        """
        return _namespace_SO('SO_0000201')

    @classmethod
    def three_prime_coding_exon(cls):
        """The coding exon that is most 3-prime on a given transcript. (cls, SO:ma)
        (SO_0000202)
        """
        return _namespace_SO('SO_0000202')

    @classmethod
    def UTR(cls):
        """Messenger RNA sequences that are untranslated and lie five prime or three prime to sequences which are translated. (cls, SO:ke)
        (SO_0000203)
        """
        return _namespace_SO('SO_0000203')

    @classmethod
    def five_prime_UTR(cls):
        """A region at the 5' end of a mature transcript (cls, preceding the initiation codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000204)
        """
        return _namespace_SO('SO_0000204')

    @classmethod
    def three_prime_UTR(cls):
        """A region at the 3' end of a mature transcript (cls, following the stop codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000205)
        """
        return _namespace_SO('SO_0000205')

    @classmethod
    def SINE_element(cls):
        """A repetitive element, a few hundred base pairs long, that is dispersed throughout the genome. A common human SINE is the Alu element. (cls, SO:ke)
        (SO_0000206)
        """
        return _namespace_SO('SO_0000206')

    @classmethod
    def simple_sequence_length_variation(cls):
        """-- No comment or description provided. --
        (cls, SO_0000207)
        """
        return _namespace_SO('SO_0000207')

    @classmethod
    def terminal_inverted_repeat_element(cls):
        """A DNA transposable element defined as having termini with perfect, or nearly perfect short inverted repeats, generally 10 - 40 nucleotides long. (cls, http://www.genetics.org/cgi/reprint/156/4/1983.pdf)
        (SO_0000208)
        """
        return _namespace_SO('SO_0000208')

    @classmethod
    def rRNA_primary_transcript(cls):
        """A primary transcript encoding a ribosomal RNA. (cls, SO:ke)
        (SO_0000209)
        """
        return _namespace_SO('SO_0000209')

    @classmethod
    def tRNA_primary_transcript(cls):
        """A primary transcript encoding a transfer RNA (cls, SO:0000253). (SO:ke)
        (SO_0000210)
        """
        return _namespace_SO('SO_0000210')

    @classmethod
    def alanine_tRNA_primary_transcript(cls):
        """A primary transcript encoding alanyl tRNA. (cls, SO:ke)
        (SO_0000211)
        """
        return _namespace_SO('SO_0000211')

    @classmethod
    def arginine_tRNA_primary_transcript(cls):
        """A primary transcript encoding arginyl tRNA (cls, SO:0000255). (SO:ke)
        (SO_0000212)
        """
        return _namespace_SO('SO_0000212')

    @classmethod
    def asparagine_tRNA_primary_transcript(cls):
        """A primary transcript encoding asparaginyl tRNA (cls, SO:0000256). (SO:ke)
        (SO_0000213)
        """
        return _namespace_SO('SO_0000213')

    @classmethod
    def aspartic_acid_tRNA_primary_transcript(cls):
        """A primary transcript encoding aspartyl tRNA (cls, SO:0000257). (SO:ke)
        (SO_0000214)
        """
        return _namespace_SO('SO_0000214')

    @classmethod
    def cysteine_tRNA_primary_transcript(cls):
        """A primary transcript encoding cysteinyl tRNA (cls, SO:0000258). (SO:ke)
        (SO_0000215)
        """
        return _namespace_SO('SO_0000215')

    @classmethod
    def glutamic_acid_tRNA_primary_transcript(cls):
        """A primary transcript encoding glutaminyl tRNA (cls, SO:0000260). (SO:ke)
        (SO_0000216)
        """
        return _namespace_SO('SO_0000216')

    @classmethod
    def glutamine_tRNA_primary_transcript(cls):
        """A primary transcript encoding glutamyl tRNA (cls, SO:0000260). (SO:ke)
        (SO_0000217)
        """
        return _namespace_SO('SO_0000217')

    @classmethod
    def glycine_tRNA_primary_transcript(cls):
        """A primary transcript encoding glycyl tRNA (cls, SO:0000263). (SO:ke)
        (SO_0000218)
        """
        return _namespace_SO('SO_0000218')

    @classmethod
    def histidine_tRNA_primary_transcript(cls):
        """A primary transcript encoding histidyl tRNA (cls, SO:0000262). (SO:ke)
        (SO_0000219)
        """
        return _namespace_SO('SO_0000219')

    @classmethod
    def isoleucine_tRNA_primary_transcript(cls):
        """A primary transcript encoding isoleucyl tRNA (cls, SO:0000263). (SO:ke)
        (SO_0000220)
        """
        return _namespace_SO('SO_0000220')

    @classmethod
    def leucine_tRNA_primary_transcript(cls):
        """A primary transcript encoding leucyl tRNA (cls, SO:0000264). (SO:ke)
        (SO_0000221)
        """
        return _namespace_SO('SO_0000221')

    @classmethod
    def lysine_tRNA_primary_transcript(cls):
        """A primary transcript encoding lysyl tRNA (cls, SO:0000265). (SO:ke)
        (SO_0000222)
        """
        return _namespace_SO('SO_0000222')

    @classmethod
    def methionine_tRNA_primary_transcript(cls):
        """A primary transcript encoding methionyl tRNA (cls, SO:0000266). (SO:ke)
        (SO_0000223)
        """
        return _namespace_SO('SO_0000223')

    @classmethod
    def phenylalanine_tRNA_primary_transcript(cls):
        """A primary transcript encoding phenylalanyl tRNA (cls, SO:0000267). (SO:ke)
        (SO_0000224)
        """
        return _namespace_SO('SO_0000224')

    @classmethod
    def proline_tRNA_primary_transcript(cls):
        """A primary transcript encoding prolyl tRNA (cls, SO:0000268). (SO:ke)
        (SO_0000225)
        """
        return _namespace_SO('SO_0000225')

    @classmethod
    def serine_tRNA_primary_transcript(cls):
        """A primary transcript encoding seryl tRNA (cls, SO:000269). (SO:ke)
        (SO_0000226)
        """
        return _namespace_SO('SO_0000226')

    @classmethod
    def threonine_tRNA_primary_transcript(cls):
        """A primary transcript encoding threonyl tRNA (cls, SO:000270). (SO:ke)
        (SO_0000227)
        """
        return _namespace_SO('SO_0000227')

    @classmethod
    def tryptophan_tRNA_primary_transcript(cls):
        """A primary transcript encoding tryptophanyl tRNA (cls, SO:000271). (SO:ke)
        (SO_0000228)
        """
        return _namespace_SO('SO_0000228')

    @classmethod
    def tyrosine_tRNA_primary_transcript(cls):
        """A primary transcript encoding tyrosyl tRNA (cls, SO:000272). (SO:ke)
        (SO_0000229)
        """
        return _namespace_SO('SO_0000229')

    @classmethod
    def valine_tRNA_primary_transcript(cls):
        """A primary transcript encoding valyl tRNA (cls, SO:000273). (SO:ke)
        (SO_0000230)
        """
        return _namespace_SO('SO_0000230')

    @classmethod
    def snRNA_primary_transcript(cls):
        """A primary transcript encoding a small nuclear RNA (cls, SO:0000274). (SO:ke)
        (SO_0000231)
        """
        return _namespace_SO('SO_0000231')

    @classmethod
    def snoRNA_primary_transcript(cls):
        """A primary transcript encoding a small nucleolar mRNA (cls, SO:0000275). (SO:ke)
        (SO_0000232)
        """
        return _namespace_SO('SO_0000232')

    @classmethod
    def mature_transcript(cls):
        """A transcript which has undergone the necessary modifications, if any, for its function. In eukaryotes this includes, for example, processing of introns, cleavage, base modification, and modifications to the 5' and/or the 3' ends, other than addition of bases. In bacteria functional mRNAs are usually not modified. (cls, SO:ke)
        (SO_0000233)
        """
        return _namespace_SO('SO_0000233')

    @classmethod
    def mRNA(cls):
        """Messenger RNA is the intermediate molecule between DNA and protein. It includes UTR and coding sequences. It does not contain introns. (cls, SO:ma)
        (SO_0000234)
        """
        return _namespace_SO('SO_0000234')

    @classmethod
    def TF_binding_site(cls):
        """A region of a nucleotide molecule that binds a Transcription Factor or Transcription Factor complex [GO:0005667]. (cls, SO:ke)
        (SO_0000235)
        """
        return _namespace_SO('SO_0000235')

    @classmethod
    def ORF(cls):
        """The in-frame interval between the stop codons of a reading frame which when read as sequential triplets, has the potential of encoding a sequential string of amino acids. TER(cls, NNN)nTER. (SGD:rb, SO:ma)
        (SO_0000236)
        """
        return _namespace_SO('SO_0000236')

    @classmethod
    def transcript_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000237)
        """
        return _namespace_SO('SO_0000237')

    @classmethod
    def foldback_element(cls):
        """A transposable element with extensive secondary structure, characterized by large modular imperfect long inverted repeats. (cls, http://www.genetics.org/cgi/reprint/156/4/1983.pdf)
        (SO_0000238)
        """
        return _namespace_SO('SO_0000238')

    @classmethod
    def flanking_region(cls):
        """The sequences extending on either side of a specific region. (cls, SO:ke)
        (SO_0000239)
        """
        return _namespace_SO('SO_0000239')

    @classmethod
    def chromosome_variation(cls):
        """-- No comment or description provided. --
        (cls, SO_0000240)
        """
        return _namespace_SO('SO_0000240')

    @classmethod
    def internal_UTR(cls):
        """A UTR bordered by the terminal and initial codons of two CDSs in a polycistronic transcript. Every UTR is either 5', 3' or internal. (cls, SO:cjm)
        (SO_0000241)
        """
        return _namespace_SO('SO_0000241')

    @classmethod
    def untranslated_region_polycistronic_mRNA(cls):
        """The untranslated sequence separating the 'cistrons' of multicistronic mRNA. (cls, SO:ke)
        (SO_0000242)
        """
        return _namespace_SO('SO_0000242')

    @classmethod
    def internal_ribosome_entry_site(cls):
        """Sequence element that recruits a ribosomal subunit to internal mRNA for translation initiation. (cls, SO:ke)
        (SO_0000243)
        """
        return _namespace_SO('SO_0000243')

    @classmethod
    def four_cutter_restriction_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000244)
        """
        return _namespace_SO('SO_0000244')

    @classmethod
    def mRNA_by_polyadenylation_status(cls):
        """-- No comment or description provided. --
        (cls, SO_0000245)
        """
        return _namespace_SO('SO_0000245')

    @classmethod
    def polyadenylated(cls):
        """A attribute describing the addition of a poly A tail to the 3' end of a mRNA molecule. (cls, SO:ke)
        (SO_0000246)
        """
        return _namespace_SO('SO_0000246')

    @classmethod
    def mRNA_not_polyadenylated(cls):
        """-- No comment or description provided. --
        (cls, SO_0000247)
        """
        return _namespace_SO('SO_0000247')

    @classmethod
    def sequence_length_variation(cls):
        """-- No comment or description provided. --
        (cls, SO_0000248)
        """
        return _namespace_SO('SO_0000248')

    @classmethod
    def six_cutter_restriction_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000249)
        """
        return _namespace_SO('SO_0000249')

    @classmethod
    def modified_RNA_base_feature(cls):
        """A post_transcriptionally modified base. (cls, SO:ke)
        (SO_0000250)
        """
        return _namespace_SO('SO_0000250')

    @classmethod
    def eight_cutter_restriction_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000251)
        """
        return _namespace_SO('SO_0000251')

    @classmethod
    def rRNA(cls):
        """RNA that comprises part of a ribosome, and that can provide both structural scaffolding and catalytic activity. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, ISBN:0198506732)
        (SO_0000252)
        """
        return _namespace_SO('SO_0000252')

    @classmethod
    def tRNA(cls):
        """Transfer RNA (cls, tRNA) molecules are approximately 80 nucleotides in length. Their secondary structure includes four short double-helical elements and three loops (D, anti-codon, and T loops). Further hydrogen bonds mediate the characteristic L-shaped molecular structure. Transfer RNAs have two regions of fundamental functional importance: the anti-codon, which is responsible for specific mRNA codon recognition, and the 3' end, to which the tRNA's corresponding amino acid is attached (by aminoacyl-tRNA synthetases). Transfer RNAs cope with the degeneracy of the genetic code in two manners: having more than one tRNA (with a specific anti-codon) for a particular amino acid; and 'wobble' base-pairing, i.e. permitting non-standard base-pairing at the 3rd anti-codon position. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00005, ISBN:0198506732)
        (SO_0000253)
        """
        return _namespace_SO('SO_0000253')

    @classmethod
    def alanyl_tRNA(cls):
        """A tRNA sequence that has an alanine anticodon, and a 3' alanine binding region. (cls, SO:ke)
        (SO_0000254)
        """
        return _namespace_SO('SO_0000254')

    @classmethod
    def rRNA_small_subunit_primary_transcript(cls):
        """A primary transcript encoding a small ribosomal subunit RNA. (cls, SO:ke)
        (SO_0000255)
        """
        return _namespace_SO('SO_0000255')

    @classmethod
    def asparaginyl_tRNA(cls):
        """A tRNA sequence that has an asparagine anticodon, and a 3' asparagine binding region. (cls, SO:ke)
        (SO_0000256)
        """
        return _namespace_SO('SO_0000256')

    @classmethod
    def aspartyl_tRNA(cls):
        """A tRNA sequence that has an aspartic acid anticodon, and a 3' aspartic acid binding region. (cls, SO:ke)
        (SO_0000257)
        """
        return _namespace_SO('SO_0000257')

    @classmethod
    def cysteinyl_tRNA(cls):
        """A tRNA sequence that has a cysteine anticodon, and a 3' cysteine binding region. (cls, SO:ke)
        (SO_0000258)
        """
        return _namespace_SO('SO_0000258')

    @classmethod
    def glutaminyl_tRNA(cls):
        """A tRNA sequence that has a glutamine anticodon, and a 3' glutamine binding region. (cls, SO:ke)
        (SO_0000259)
        """
        return _namespace_SO('SO_0000259')

    @classmethod
    def glutamyl_tRNA(cls):
        """A tRNA sequence that has a glutamic acid anticodon, and a 3' glutamic acid binding region. (cls, SO:ke)
        (SO_0000260)
        """
        return _namespace_SO('SO_0000260')

    @classmethod
    def glycyl_tRNA(cls):
        """A tRNA sequence that has a glycine anticodon, and a 3' glycine binding region. (cls, SO:ke)
        (SO_0000261)
        """
        return _namespace_SO('SO_0000261')

    @classmethod
    def histidyl_tRNA(cls):
        """A tRNA sequence that has a histidine anticodon, and a 3' histidine binding region. (cls, SO:ke)
        (SO_0000262)
        """
        return _namespace_SO('SO_0000262')

    @classmethod
    def isoleucyl_tRNA(cls):
        """A tRNA sequence that has an isoleucine anticodon, and a 3' isoleucine binding region. (cls, SO:ke)
        (SO_0000263)
        """
        return _namespace_SO('SO_0000263')

    @classmethod
    def leucyl_tRNA(cls):
        """A tRNA sequence that has a leucine anticodon, and a 3' leucine binding region. (cls, SO:ke)
        (SO_0000264)
        """
        return _namespace_SO('SO_0000264')

    @classmethod
    def lysyl_tRNA(cls):
        """A tRNA sequence that has a lysine anticodon, and a 3' lysine binding region. (cls, SO:ke)
        (SO_0000265)
        """
        return _namespace_SO('SO_0000265')

    @classmethod
    def methionyl_tRNA(cls):
        """A tRNA sequence that has a methionine anticodon, and a 3' methionine binding region. (cls, SO:ke)
        (SO_0000266)
        """
        return _namespace_SO('SO_0000266')

    @classmethod
    def phenylalanyl_tRNA(cls):
        """A tRNA sequence that has a phenylalanine anticodon, and a 3' phenylalanine binding region. (cls, SO:ke)
        (SO_0000267)
        """
        return _namespace_SO('SO_0000267')

    @classmethod
    def prolyl_tRNA(cls):
        """A tRNA sequence that has a proline anticodon, and a 3' proline binding region. (cls, SO:ke)
        (SO_0000268)
        """
        return _namespace_SO('SO_0000268')

    @classmethod
    def seryl_tRNA(cls):
        """A tRNA sequence that has a serine anticodon, and a 3' serine binding region. (cls, SO:ke)
        (SO_0000269)
        """
        return _namespace_SO('SO_0000269')

    @classmethod
    def threonyl_tRNA(cls):
        """A tRNA sequence that has a threonine anticodon, and a 3' threonine binding region. (cls, SO:ke)
        (SO_0000270)
        """
        return _namespace_SO('SO_0000270')

    @classmethod
    def tryptophanyl_tRNA(cls):
        """A tRNA sequence that has a tryptophan anticodon, and a 3' tryptophan binding region. (cls, SO:ke)
        (SO_0000271)
        """
        return _namespace_SO('SO_0000271')

    @classmethod
    def tyrosyl_tRNA(cls):
        """A tRNA sequence that has a tyrosine anticodon, and a 3' tyrosine binding region. (cls, SO:ke)
        (SO_0000272)
        """
        return _namespace_SO('SO_0000272')

    @classmethod
    def valyl_tRNA(cls):
        """A tRNA sequence that has a valine anticodon, and a 3' valine binding region. (cls, SO:ke)
        (SO_0000273)
        """
        return _namespace_SO('SO_0000273')

    @classmethod
    def snRNA(cls):
        """A small nuclear RNA molecule involved in pre-mRNA splicing and processing. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, PMID:11733745, WB:ems)
        (SO_0000274)
        """
        return _namespace_SO('SO_0000274')

    @classmethod
    def snoRNA(cls):
        """A snoRNA (cls, small nucleolar RNA) is any one of a class of small RNAs that are associated with the eukaryotic nucleus as components of small nucleolar ribonucleoproteins. They participate in the processing or modifications of many RNAs, mostly ribosomal RNAs (rRNAs) though snoRNAs are also known to target other classes of RNA, including spliceosomal RNAs, tRNAs, and mRNAs via a stretch of sequence that is complementary to a sequence in the targeted RNA. (GOC:kgc)
        (SO_0000275)
        """
        return _namespace_SO('SO_0000275')

    @classmethod
    def miRNA(cls):
        """Small, ~22-nt, RNA molecule that is the endogenous transcript of a miRNA gene. Micro RNAs are produced from precursor molecules (cls, SO:0000647) that can form local hairpin structures, which ordinarily are processed (via the Dicer pathway) such that a single miRNA molecule accumulates from one arm of a hairpin precursor molecule. Micro RNAs may trigger the cleavage of their target molecules or act as translational repressors. (PMID:12592000)
        (SO_0000276)
        """
        return _namespace_SO('SO_0000276')

    @classmethod
    def bound_by_factor(cls):
        """An attribute describing a sequence that is bound by another molecule. (cls, SO:ke)
        (SO_0000277)
        """
        return _namespace_SO('SO_0000277')

    @classmethod
    def transcript_bound_by_nucleic_acid(cls):
        """A transcript that is bound by a nucleic acid. (cls, SO:xp)
        (SO_0000278)
        """
        return _namespace_SO('SO_0000278')

    @classmethod
    def transcript_bound_by_protein(cls):
        """A transcript that is bound by a protein. (cls, SO:xp)
        (SO_0000279)
        """
        return _namespace_SO('SO_0000279')

    @classmethod
    def engineered_gene(cls):
        """A gene that is engineered. (cls, SO:xp)
        (SO_0000280)
        """
        return _namespace_SO('SO_0000280')

    @classmethod
    def engineered_foreign_gene(cls):
        """A gene that is engineered and foreign. (cls, SO:xp)
        (SO_0000281)
        """
        return _namespace_SO('SO_0000281')

    @classmethod
    def mRNA_with_minus_1_frameshift(cls):
        """An mRNA with a minus 1 frameshift. (cls, SO:xp)
        (SO_0000282)
        """
        return _namespace_SO('SO_0000282')

    @classmethod
    def engineered_foreign_transposable_element_gene(cls):
        """A transposable_element that is engineered and foreign. (cls, SO:xp)
        (SO_0000283)
        """
        return _namespace_SO('SO_0000283')

    @classmethod
    def type_I_enzyme_restriction_site(cls):
        """The recognition site is bipartite and interrupted. (cls, http://www.promega.com)
        (SO_0000284)
        """
        return _namespace_SO('SO_0000284')

    @classmethod
    def foreign_gene(cls):
        """A gene that is foreign. (cls, SO:xp)
        (SO_0000285)
        """
        return _namespace_SO('SO_0000285')

    @classmethod
    def long_terminal_repeat(cls):
        """A sequence directly repeated at both ends of a defined sequence, of the sort typically found in retroviruses. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000286)
        """
        return _namespace_SO('SO_0000286')

    @classmethod
    def fusion_gene(cls):
        """A gene that is a fusion. (cls, SO:xp)
        (SO_0000287)
        """
        return _namespace_SO('SO_0000287')

    @classmethod
    def engineered_fusion_gene(cls):
        """A fusion gene that is engineered. (cls, SO:xp)
        (SO_0000288)
        """
        return _namespace_SO('SO_0000288')

    @classmethod
    def microsatellite(cls):
        """A repeat_region containing repeat_units (cls, 2 to 4 bp) that is repeated multiple times in tandem. (http://www.informatics.jax.org/silver/glossary.shtml)
        (SO_0000289)
        """
        return _namespace_SO('SO_0000289')

    @classmethod
    def dinucleotide_repeat_microsatellite_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000290)
        """
        return _namespace_SO('SO_0000290')

    @classmethod
    def trinucleotide_repeat_microsatellite_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000291)
        """
        return _namespace_SO('SO_0000291')

    @classmethod
    def repetitive_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0000292)
        """
        return _namespace_SO('SO_0000292')

    @classmethod
    def engineered_foreign_repetitive_element(cls):
        """A repetitive element that is engineered and foreign. (cls, SO:xp)
        (SO_0000293)
        """
        return _namespace_SO('SO_0000293')

    @classmethod
    def inverted_repeat(cls):
        """The sequence is complementarily repeated on the opposite strand. It is a palindrome, and it may, or may not be hyphenated. Examples: GCTGATCAGC, or GCTGA-----TCAGC. (cls, SO:ke)
        (SO_0000294)
        """
        return _namespace_SO('SO_0000294')

    @classmethod
    def U12_intron(cls):
        """A type of spliceosomal intron spliced by the U12 spliceosome, that includes U11, U12, U4atac/U6atac and U5 snRNAs. (cls, PMID:9428511)
        (SO_0000295)
        """
        return _namespace_SO('SO_0000295')

    @classmethod
    def origin_of_replication(cls):
        """The origin of replication; starting site for duplication of a nucleic acid molecule to give two identical copies. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000296)
        """
        return _namespace_SO('SO_0000296')

    @classmethod
    def D_loop(cls):
        """Displacement loop; a region within mitochondrial DNA in which a short stretch of RNA is paired with one strand of DNA, displacing the original partner DNA strand in this region; also used to describe the displacement of a region of one strand of duplex DNA by a single stranded invader in the reaction catalyzed by RecA protein. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000297)
        """
        return _namespace_SO('SO_0000297')

    @classmethod
    def recombination_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000298)
        """
        return _namespace_SO('SO_0000298')

    @classmethod
    def specific_recombination_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000299)
        """
        return _namespace_SO('SO_0000299')

    @classmethod
    def recombination_feature_of_rearranged_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0000300)
        """
        return _namespace_SO('SO_0000300')

    @classmethod
    def vertebrate_immune_system_gene_recombination_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000301)
        """
        return _namespace_SO('SO_0000301')

    @classmethod
    def J_gene_recombination_feature(cls):
        """Recombination signal including J-heptamer, J-spacer and J-nonamer in 5' of J-region of a J-gene or J-sequence. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000302)
        """
        return _namespace_SO('SO_0000302')

    @classmethod
    def clip(cls):
        """Part of the primary transcript that is clipped off during processing. (cls, SO:ke)
        (SO_0000303)
        """
        return _namespace_SO('SO_0000303')

    @classmethod
    def type_II_enzyme_restriction_site(cls):
        """The recognition site is either palindromic, partially palindromic or an interrupted palindrome. Cleavage occurs within the recognition site. (cls, http://www.promega.com)
        (SO_0000304)
        """
        return _namespace_SO('SO_0000304')

    @classmethod
    def modified_DNA_base(cls):
        """A modified nucleotide, i.e. a nucleotide other than A, T, C. G. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000305)
        """
        return _namespace_SO('SO_0000305')

    @classmethod
    def methylated_DNA_base_feature(cls):
        """A nucleotide modified by methylation. (cls, SO:ke)
        (SO_0000306)
        """
        return _namespace_SO('SO_0000306')

    @classmethod
    def CpG_island(cls):
        """Regions of a few hundred to a few thousand bases in vertebrate genomes that are relatively GC and CpG rich; they are typically unmethylated and often found near the 5' ends of genes. (cls, SO:rd)
        (SO_0000307)
        """
        return _namespace_SO('SO_0000307')

    @classmethod
    def sequence_feature_locating_method(cls):
        """-- No comment or description provided. --
        (cls, SO_0000308)
        """
        return _namespace_SO('SO_0000308')

    @classmethod
    def computed_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000309)
        """
        return _namespace_SO('SO_0000309')

    @classmethod
    def predicted_ab_initio_computation(cls):
        """-- No comment or description provided. --
        (cls, SO_0000310)
        """
        return _namespace_SO('SO_0000310')

    @classmethod
    def computed_feature_by_similarity(cls):
        """. (cls, SO:ma)
        (SO_0000311)
        """
        return _namespace_SO('SO_0000311')

    @classmethod
    def experimentally_determined(cls):
        """Attribute to describe a feature that has been experimentally verified. (cls, SO:ke)
        (SO_0000312)
        """
        return _namespace_SO('SO_0000312')

    @classmethod
    def stem_loop(cls):
        """A double-helical region of nucleic acid formed by base-pairing between adjacent (cls, inverted) complementary sequences. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000313)
        """
        return _namespace_SO('SO_0000313')

    @classmethod
    def direct_repeat(cls):
        """A repeat where the same sequence is repeated in the same direction. Example: GCTGA-----GCTGA. (cls, SO:ke)
        (SO_0000314)
        """
        return _namespace_SO('SO_0000314')

    @classmethod
    def TSS(cls):
        """The first base where RNA polymerase begins to synthesize the RNA transcript. (cls, SO:ke)
        (SO_0000315)
        """
        return _namespace_SO('SO_0000315')

    @classmethod
    def CDS(cls):
        """A contiguous sequence which begins with, and includes, a start codon and ends with, and includes, a stop codon. (cls, SO:ma)
        (SO_0000316)
        """
        return _namespace_SO('SO_0000316')

    @classmethod
    def cDNA_clone(cls):
        """Complementary DNA; A piece of DNA copied from an mRNA and spliced into a vector for propagation in a suitable host. (cls, http://seqcore.brcf.med.umich.edu/doc/educ/dnapr/mbglossary/mbgloss.html)
        (SO_0000317)
        """
        return _namespace_SO('SO_0000317')

    @classmethod
    def start_codon(cls):
        """First codon to be translated by a ribosome. (cls, SO:ke)
        (SO_0000318)
        """
        return _namespace_SO('SO_0000318')

    @classmethod
    def stop_codon(cls):
        """In mRNA, a set of three nucleotides that indicates the end of information for protein synthesis. (cls, SO:ke)
        (SO_0000319)
        """
        return _namespace_SO('SO_0000319')

    @classmethod
    def intronic_splice_enhancer(cls):
        """Sequences within the intron that modulate splice site selection for some introns. (cls, SO:ke)
        (SO_0000320)
        """
        return _namespace_SO('SO_0000320')

    @classmethod
    def mRNA_with_plus_1_frameshift(cls):
        """An mRNA with a plus 1 frameshift. (cls, SO:ke)
        (SO_0000321)
        """
        return _namespace_SO('SO_0000321')

    @classmethod
    def nuclease_hypersensitive_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000322)
        """
        return _namespace_SO('SO_0000322')

    @classmethod
    def coding_start(cls):
        """The first base to be translated into protein. (cls, SO:ke)
        (SO_0000323)
        """
        return _namespace_SO('SO_0000323')

    @classmethod
    def tag(cls):
        """A nucleotide sequence that may be used to identify a larger sequence. (cls, SO:ke)
        (SO_0000324)
        """
        return _namespace_SO('SO_0000324')

    @classmethod
    def rRNA_large_subunit_primary_transcript(cls):
        """A primary transcript encoding a large ribosomal subunit RNA. (cls, SO:ke)
        (SO_0000325)
        """
        return _namespace_SO('SO_0000325')

    @classmethod
    def SAGE_tag(cls):
        """A short diagnostic sequence tag, serial analysis of gene expression (cls, SAGE), that allows the quantitative and simultaneous analysis of a large number of transcripts. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=7570003&dopt=Abstract)
        (SO_0000326)
        """
        return _namespace_SO('SO_0000326')

    @classmethod
    def coding_end(cls):
        """The last base to be translated into protein. It does not include the stop codon. (cls, SO:ke)
        (SO_0000327)
        """
        return _namespace_SO('SO_0000327')

    @classmethod
    def microarray_oligo(cls):
        """-- No comment or description provided. --
        (cls, SO_0000328)
        """
        return _namespace_SO('SO_0000328')

    @classmethod
    def mRNA_with_plus_2_frameshift(cls):
        """An mRNA with a plus 2 frameshift. (cls, SO:xp)
        (SO_0000329)
        """
        return _namespace_SO('SO_0000329')

    @classmethod
    def conserved_region(cls):
        """Region of sequence similarity by descent from a common ancestor. (cls, SO:ke)
        (SO_0000330)
        """
        return _namespace_SO('SO_0000330')

    @classmethod
    def STS(cls):
        """Short (cls, typically a few hundred base pairs) DNA sequence that has a single occurrence in a genome and whose location and base sequence are known. (http://www.biospace.com)
        (SO_0000331)
        """
        return _namespace_SO('SO_0000331')

    @classmethod
    def coding_conserved_region(cls):
        """Coding region of sequence similarity by descent from a common ancestor. (cls, SO:ke)
        (SO_0000332)
        """
        return _namespace_SO('SO_0000332')

    @classmethod
    def exon_junction(cls):
        """The boundary between two exons in a processed transcript. (cls, SO:ke)
        (SO_0000333)
        """
        return _namespace_SO('SO_0000333')

    @classmethod
    def nc_conserved_region(cls):
        """Non-coding region of sequence similarity by descent from a common ancestor. (cls, SO:ke)
        (SO_0000334)
        """
        return _namespace_SO('SO_0000334')

    @classmethod
    def mRNA_with_minus_2_frameshift(cls):
        """A mRNA with a minus 2 frameshift. (cls, SO:ke)
        (SO_0000335)
        """
        return _namespace_SO('SO_0000335')

    @classmethod
    def pseudogene(cls):
        """A sequence that closely resembles a known functional gene, at another locus within a genome, that is non-functional as a consequence of (cls, usually several) mutations that prevent either its transcription or translation (or both). In general, pseudogenes result from either reverse transcription of a transcript of their \"normal\" paralog (SO:0000043) (in which case the pseudogene typically lacks introns and includes a poly(A) tail) or from recombination (SO:0000044) (in which case the pseudogene is typically a tandem duplication of its \"normal\" paralog). (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html)
        (SO_0000336)
        """
        return _namespace_SO('SO_0000336')

    @classmethod
    def RNAi_reagent(cls):
        """A double stranded RNA duplex, at least 20bp long, used experimentally to inhibit gene function by RNA interference. (cls, SO:rd)
        (SO_0000337)
        """
        return _namespace_SO('SO_0000337')

    @classmethod
    def MITE(cls):
        """A highly repetitive and short (cls, 100-500 base pair) transposable element with terminal inverted repeats (TIR) and target site duplication (TSD). MITEs do not encode proteins. (http://www.pnas.org/cgi/content/full/97/18/10083)
        (SO_0000338)
        """
        return _namespace_SO('SO_0000338')

    @classmethod
    def recombination_hotspot(cls):
        """A region in a genome which promotes recombination. (cls, SO:rd)
        (SO_0000339)
        """
        return _namespace_SO('SO_0000339')

    @classmethod
    def chromosome(cls):
        """Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication. (cls, SO:ma)
        (SO_0000340)
        """
        return _namespace_SO('SO_0000340')

    @classmethod
    def chromosome_band(cls):
        """A cytologically distinguishable feature of a chromosome, often made visible by staining, and usually alternating light and dark. (cls, SO:ma)
        (SO_0000341)
        """
        return _namespace_SO('SO_0000341')

    @classmethod
    def site_specific_recombination_target_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000342)
        """
        return _namespace_SO('SO_0000342')

    @classmethod
    def match(cls):
        """A region of sequence, aligned to another sequence with some statistical significance, using an algorithm such as BLAST or SIM4. (cls, SO:ke)
        (SO_0000343)
        """
        return _namespace_SO('SO_0000343')

    @classmethod
    def splice_enhancer(cls):
        """Region of a transcript that regulates splicing. (cls, SO:ke)
        (SO_0000344)
        """
        return _namespace_SO('SO_0000344')

    @classmethod
    def EST(cls):
        """A tag produced from a single sequencing read from a cDNA clone or PCR product; typically a few hundred base pairs long. (cls, SO:ke)
        (SO_0000345)
        """
        return _namespace_SO('SO_0000345')

    @classmethod
    def loxP_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000346)
        """
        return _namespace_SO('SO_0000346')

    @classmethod
    def nucleotide_match(cls):
        """A match against a nucleotide sequence. (cls, SO:ke)
        (SO_0000347)
        """
        return _namespace_SO('SO_0000347')

    @classmethod
    def nucleic_acid(cls):
        """An attribute describing a sequence consisting of nucleobases bound to repeating units. The forms found in nature are deoxyribonucleic acid (cls, DNA), where the repeating units are 2-deoxy-D-ribose rings connected to a phosphate backbone, and ribonucleic acid (RNA), where the repeating units are D-ribose rings connected to a phosphate backbone. (CHEBI:33696, RSC:cb)
        (SO_0000348)
        """
        return _namespace_SO('SO_0000348')

    @classmethod
    def protein_match(cls):
        """A match against a protein sequence. (cls, SO:ke)
        (SO_0000349)
        """
        return _namespace_SO('SO_0000349')

    @classmethod
    def FRT_site(cls):
        """An inversion site found on the Saccharomyces cerevisiae 2 micron plasmid. (cls, SO:ma)
        (SO_0000350)
        """
        return _namespace_SO('SO_0000350')

    @classmethod
    def synthetic_sequence(cls):
        """An attribute to decide a sequence of nucleotides, nucleotide analogs, or amino acids that has been designed by an experimenter and which may, or may not, correspond with any natural sequence. (cls, SO:ma)
        (SO_0000351)
        """
        return _namespace_SO('SO_0000351')

    @classmethod
    def DNA(cls):
        """An attribute describing a sequence consisting of nucleobases bound to a repeating unit made of a 2-deoxy-D-ribose ring connected to a phosphate backbone. (cls, RSC:cb)
        (SO_0000352)
        """
        return _namespace_SO('SO_0000352')

    @classmethod
    def sequence_assembly(cls):
        """A sequence of nucleotides that has been algorithmically derived from an alignment of two or more different sequences. (cls, SO:ma)
        (SO_0000353)
        """
        return _namespace_SO('SO_0000353')

    @classmethod
    def group_1_intron_homing_endonuclease_target_region(cls):
        """A region of intronic nucleotide sequence targeted by a nuclease enzyme. (cls, SO:ke)
        (SO_0000354)
        """
        return _namespace_SO('SO_0000354')

    @classmethod
    def haplotype_block(cls):
        """A region of the genome which is co-inherited as the result of the lack of historic recombination within it. (cls, SO:ma)
        (SO_0000355)
        """
        return _namespace_SO('SO_0000355')

    @classmethod
    def RNA(cls):
        """An attribute describing a sequence consisting of nucleobases bound to a repeating unit made of a D-ribose ring connected to a phosphate backbone. (cls, RSC:cb)
        (SO_0000356)
        """
        return _namespace_SO('SO_0000356')

    @classmethod
    def flanked(cls):
        """An attribute describing a region that is bounded either side by a particular kind of region. (cls, SO:ke)
        (SO_0000357)
        """
        return _namespace_SO('SO_0000357')

    @classmethod
    def floxed(cls):
        """An attribute describing sequence that is flanked by Lox-P sites. (cls, SO:ke)
        (SO_0000359)
        """
        return _namespace_SO('SO_0000359')

    @classmethod
    def codon(cls):
        """A set of (cls, usually) three nucleotide bases in a DNA or RNA sequence, which together code for a unique amino acid or the termination of translation and are contained within the CDS. (http://www.everythingbio.com/glos/definition.php?word=codon, SO:ke)
        (SO_0000360)
        """
        return _namespace_SO('SO_0000360')

    @classmethod
    def FRT_flanked(cls):
        """An attribute to describe sequence that is flanked by the FLP recombinase recognition site, FRT. (cls, SO:ke)
        (SO_0000361)
        """
        return _namespace_SO('SO_0000361')

    @classmethod
    def invalidated_by_chimeric_cDNA(cls):
        """A cDNA clone constructed from more than one mRNA. Usually an experimental artifact. (cls, SO:ma)
        (SO_0000362)
        """
        return _namespace_SO('SO_0000362')

    @classmethod
    def floxed_gene(cls):
        """A transgene that is floxed. (cls, SO:xp)
        (SO_0000363)
        """
        return _namespace_SO('SO_0000363')

    @classmethod
    def transposable_element_flanking_region(cls):
        """The region of sequence surrounding a transposable element. (cls, SO:ke)
        (SO_0000364)
        """
        return _namespace_SO('SO_0000364')

    @classmethod
    def integron(cls):
        """A region encoding an integrase which acts at a site adjacent to it (cls, attI_site) to insert DNA which must include but is not limited to an attC_site. (SO:as)
        (SO_0000365)
        """
        return _namespace_SO('SO_0000365')

    @classmethod
    def insertion_site(cls):
        """The junction where an insertion occurred. (cls, SO:ke)
        (SO_0000366)
        """
        return _namespace_SO('SO_0000366')

    @classmethod
    def attI_site(cls):
        """A region within an integron, adjacent to an integrase, at which site specific recombination involving an attC_site takes place. (cls, SO:as)
        (SO_0000367)
        """
        return _namespace_SO('SO_0000367')

    @classmethod
    def transposable_element_insertion_site(cls):
        """The junction in a genome where a transposable_element has inserted. (cls, SO:ke)
        (SO_0000368)
        """
        return _namespace_SO('SO_0000368')

    @classmethod
    def integrase_coding_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000369)
        """
        return _namespace_SO('SO_0000369')

    @classmethod
    def small_regulatory_ncRNA(cls):
        """A non-coding RNA, usually with a specific secondary structure, that acts to regulate gene expression. (cls, SO:ma)
        (SO_0000370)
        """
        return _namespace_SO('SO_0000370')

    @classmethod
    def conjugative_transposon(cls):
        """A transposon that encodes function required for conjugation. (cls, http://www.sci.sdsu.edu/~smaloy/Glossary/C.html)
        (SO_0000371)
        """
        return _namespace_SO('SO_0000371')

    @classmethod
    def enzymatic_RNA(cls):
        """An RNA sequence that has catalytic activity with or without an associated ribonucleoprotein. (cls, RSC:cb)
        (SO_0000372)
        """
        return _namespace_SO('SO_0000372')

    @classmethod
    def recombinationally_inverted_gene(cls):
        """A recombinationally rearranged gene by inversion. (cls, SO:xp)
        (SO_0000373)
        """
        return _namespace_SO('SO_0000373')

    @classmethod
    def ribozyme(cls):
        """An RNA with catalytic activity. (cls, SO:ma)
        (SO_0000374)
        """
        return _namespace_SO('SO_0000374')

    @classmethod
    def rRNA_5_8S(cls):
        """5_8S ribosomal RNA (cls, 5. 8S rRNA) is a component of the large subunit of the eukaryotic ribosome. It is transcribed by RNA polymerase I as part of the 45S precursor that also contains 18S and 28S rRNA. Functionally, it is thought that 5.8S rRNA may be involved in ribosome translocation. It is also known to form covalent linkage to the p53 tumour suppressor protein. 5_8S rRNA is also found in archaea. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00002)
        (SO_0000375)
        """
        return _namespace_SO('SO_0000375')

    @classmethod
    def RNA_6S(cls):
        """A small (cls, 184-nt in E. coli) RNA that forms a hairpin type structure. 6S RNA associates with RNA polymerase in a highly specific manner. 6S RNA represses expression from a sigma70-dependent promoter during stationary phase. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00013)
        (SO_0000376)
        """
        return _namespace_SO('SO_0000376')

    @classmethod
    def CsrB_RsmB_RNA(cls):
        """An enterobacterial RNA that binds the CsrA protein. The CsrB RNAs contain a conserved motif CAGGXXG that is found in up to 18 copies and has been suggested to bind CsrA. The Csr regulatory system has a strong negative regulatory effect on glycogen biosynthesis, glyconeogenesis and glycogen catabolism and a positive regulatory effect on glycolysis. In other bacteria such as Erwinia caratovara the RsmA protein has been shown to regulate the production of virulence determinants, such extracellular enzymes. RsmA binds to RsmB regulatory RNA which is also a member of this family. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00018)
        (SO_0000377)
        """
        return _namespace_SO('SO_0000377')

    @classmethod
    def DsrA_RNA(cls):
        """DsrA RNA regulates both transcription, by overcoming transcriptional silencing by the nucleoid-associated H-NS protein, and translation, by promoting efficient translation of the stress sigma factor, RpoS. These two activities of DsrA can be separated by mutation: the first of three stem-loops of the 85 nucleotide RNA is necessary for RpoS translation but not for anti-H-NS action, while the second stem-loop is essential for antisilencing and less critical for RpoS translation. The third stem-loop, which behaves as a transcription terminator, can be substituted by the trp transcription terminator without loss of either DsrA function. The sequence of the first stem-loop of DsrA is complementary with the upstream leader portion of RpoS messenger RNA, suggesting that pairing of DsrA with the RpoS message might be important for translational regulation. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00014)
        (SO_0000378)
        """
        return _namespace_SO('SO_0000378')

    @classmethod
    def GcvB_RNA(cls):
        """A small untranslated RNA involved in expression of the dipeptide and oligopeptide transport systems in Escherichia coli. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00022)
        (SO_0000379)
        """
        return _namespace_SO('SO_0000379')

    @classmethod
    def hammerhead_ribozyme(cls):
        """A small catalytic RNA motif that catalyzes self-cleavage reaction. Its name comes from its secondary structure which resembles a carpenter's hammer. The hammerhead ribozyme is involved in the replication of some viroid and some satellite RNAs. (cls, PMID:2436805)
        (SO_0000380)
        """
        return _namespace_SO('SO_0000380')

    @classmethod
    def group_IIA_intron(cls):
        """-- No comment or description provided. --
        (cls, SO_0000381)
        """
        return _namespace_SO('SO_0000381')

    @classmethod
    def group_IIB_intron(cls):
        """-- No comment or description provided. --
        (cls, SO_0000382)
        """
        return _namespace_SO('SO_0000382')

    @classmethod
    def MicF_RNA(cls):
        """A non-translated 93 nt antisense RNA that binds its target ompF mRNA and regulates ompF expression by inhibiting translation and inducing degradation of the message. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00033)
        (SO_0000383)
        """
        return _namespace_SO('SO_0000383')

    @classmethod
    def OxyS_RNA(cls):
        """A small untranslated RNA which is induced in response to oxidative stress in Escherichia coli. Acts as a global regulator to activate or repress the expression of as many as 40 genes, including the fhlA-encoded transcriptional activator and the rpoS-encoded sigma(cls, s) subunit of RNA polymerase. OxyS is bound by the Hfq protein, that increases the OxyS RNA interaction with its target messages. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00035)
        (SO_0000384)
        """
        return _namespace_SO('SO_0000384')

    @classmethod
    def RNase_MRP_RNA(cls):
        """The RNA molecule essential for the catalytic activity of RNase MRP, an enzymatically active ribonucleoprotein with two distinct roles in eukaryotes. In mitochondria it plays a direct role in the initiation of mitochondrial DNA replication. In the nucleus it is involved in precursor rRNA processing, where it cleaves the internal transcribed spacer 1 between 18S and 5.8S rRNAs. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00030)
        (SO_0000385)
        """
        return _namespace_SO('SO_0000385')

    @classmethod
    def RNase_P_RNA(cls):
        """The RNA component of Ribonuclease P (cls, RNase P), a ubiquitous endoribonuclease, found in archaea, bacteria and eukarya as well as chloroplasts and mitochondria. Its best characterized activity is the generation of mature 5 prime ends of tRNAs by cleaving the 5 prime leader elements of precursor-tRNAs. Cellular RNase Ps are ribonucleoproteins. RNA from bacterial RNase Ps retains its catalytic activity in the absence of the protein subunit, i.e. it is a ribozyme. Isolated eukaryotic and archaeal RNase P RNA has not been shown to retain its catalytic function, but is still essential for the catalytic activity of the holoenzyme. Although the archaeal and eukaryotic holoenzymes have a much greater protein content than the bacterial ones, the RNA cores from all the three lineages are homologous. Helices corresponding to P1, P2, P3, P4, and P10/11 are common to all cellular RNase P RNAs. Yet, there is considerable sequence variation, particularly among the eukaryotic RNAs. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00010)
        (SO_0000386)
        """
        return _namespace_SO('SO_0000386')

    @classmethod
    def RprA_RNA(cls):
        """Translational regulation of the stationary phase sigma factor RpoS is mediated by the formation of a double-stranded RNA stem-loop structure in the upstream region of the rpoS messenger RNA, occluding the translation initiation site. Clones carrying rprA (cls, RpoS regulator RNA) increased the translation of RpoS. The rprA gene encodes a 106 nucleotide regulatory RNA. As with DsrA Rfam:RF00014, RprA is predicted to form three stem-loops. Thus, at least two small RNAs, DsrA and RprA, participate in the positive regulation of RpoS translation. Unlike DsrA, RprA does not have an extensive region of complementarity to the RpoS leader, leaving its mechanism of action unclear. RprA is non-essential. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00034)
        (SO_0000387)
        """
        return _namespace_SO('SO_0000387')

    @classmethod
    def RRE_RNA(cls):
        """The Rev response element (cls, RRE) is encoded within the HIV-env gene. Rev is an essential regulatory protein of HIV that binds an internal loop of the RRE leading, encouraging further Rev-RRE binding. This RNP complex is critical for mRNA export and hence for expression of the HIV structural proteins. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00036)
        (SO_0000388)
        """
        return _namespace_SO('SO_0000388')

    @classmethod
    def spot_42_RNA(cls):
        """A 109-nucleotide RNA of E. coli that seems to have a regulatory role on the galactose operon. Changes in Spot 42 levels are implicated in affecting DNA polymerase I levels. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00021)
        (SO_0000389)
        """
        return _namespace_SO('SO_0000389')

    @classmethod
    def telomerase_RNA(cls):
        """The RNA component of telomerase, a reverse transcriptase that synthesizes telomeric DNA. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00025)
        (SO_0000390)
        """
        return _namespace_SO('SO_0000390')

    @classmethod
    def U1_snRNA(cls):
        """U1 is a small nuclear RNA (cls, snRNA) component of the spliceosome (involved in pre-mRNA splicing). Its 5' end forms complementary base pairs with the 5' splice junction, thus defining the 5' donor site of an intron. There are significant differences in sequence and secondary structure between metazoan and yeast U1 snRNAs, the latter being much longer (568 nucleotides as compared to 164 nucleotides in human). Nevertheless, secondary structure predictions suggest that all U1 snRNAs share a 'common core' consisting of helices I, II, the proximal region of III, and IV. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00003)
        (SO_0000391)
        """
        return _namespace_SO('SO_0000391')

    @classmethod
    def U2_snRNA(cls):
        """U2 is a small nuclear RNA (cls, snRNA) component of the spliceosome (involved in pre-mRNA splicing). Complementary binding between U2 snRNA (in an area lying towards the 5' end but 3' to hairpin I) and the branchpoint sequence (BPS) of the intron results in the bulging out of an unpaired adenine, on the BPS, which initiates a nucleophilic attack at the intronic 5' splice site, thus starting the first of two transesterification reactions that mediate splicing. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00004)
        (SO_0000392)
        """
        return _namespace_SO('SO_0000392')

    @classmethod
    def U4_snRNA(cls):
        """U4 small nuclear RNA (cls, U4 snRNA) is a component of the major U2-dependent spliceosome. It forms a duplex with U6, and with each splicing round, it is displaced from U6 (and the spliceosome) in an ATP-dependent manner, allowing U6 to refold and create the active site for splicing catalysis. A recycling process involving protein Prp24 re-anneals U4 and U6. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
        (SO_0000393)
        """
        return _namespace_SO('SO_0000393')

    @classmethod
    def U4atac_snRNA(cls):
        """An snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U6atac_snRNA (cls, SO:0000397). (PMID:=12409455)
        (SO_0000394)
        """
        return _namespace_SO('SO_0000394')

    @classmethod
    def U5_snRNA(cls):
        """U5 RNA is a component of both types of known spliceosome. The precise function of this molecule is unknown, though it is known that the 5' loop is required for splice site selection and p220 binding, and that both the 3' stem-loop and the Sm site are important for Sm protein binding and cap methylation. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00020)
        (SO_0000395)
        """
        return _namespace_SO('SO_0000395')

    @classmethod
    def U6_snRNA(cls):
        """U6 snRNA is a component of the spliceosome which is involved in splicing pre-mRNA. The putative secondary structure consensus base pairing is confined to a short 5' stem loop, but U6 snRNA is thought to form extensive base-pair interactions with U4 snRNA. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
        (SO_0000396)
        """
        return _namespace_SO('SO_0000396')

    @classmethod
    def U6atac_snRNA(cls):
        """U6atac_snRNA is an snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U4atac_snRNA (cls, SO:0000394). (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=retrieve&db=pubmed&list_uids=12409455&dopt=Abstract)
        (SO_0000397)
        """
        return _namespace_SO('SO_0000397')

    @classmethod
    def U11_snRNA(cls):
        """U11 snRNA plays a role in splicing of the minor U12-dependent class of eukaryotic nuclear introns, similar to U1 snRNA in the major class spliceosome it base pairs to the conserved 5' splice site sequence. (cls, PMID:9622129)
        (SO_0000398)
        """
        return _namespace_SO('SO_0000398')

    @classmethod
    def U12_snRNA(cls):
        """The U12 small nuclear (cls, snRNA), together with U4atac/U6atac, U5, and U11 snRNAs and associated proteins, forms a spliceosome that cleaves a divergent class of low-abundance pre-mRNA introns. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00007)
        (SO_0000399)
        """
        return _namespace_SO('SO_0000399')

    @classmethod
    def sequence_attribute(cls):
        """An attribute describes a quality of sequence. (cls, SO:ke)
        (SO_0000400)
        """
        return _namespace_SO('SO_0000400')

    @classmethod
    def gene_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000401)
        """
        return _namespace_SO('SO_0000401')

    @classmethod
    def enhancer_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000402)
        """
        return _namespace_SO('SO_0000402')

    @classmethod
    def U14_snoRNA(cls):
        """U14 small nucleolar RNA (cls, U14 snoRNA) is required for early cleavages of eukaryotic precursor rRNAs. In yeasts, this molecule possess a stem-loop region (known as the Y-domain) which is essential for function. A similar structure, but with a different consensus sequence, is found in plants, but is absent in vertebrates. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00016, PMID:2551119)
        (SO_0000403)
        """
        return _namespace_SO('SO_0000403')

    @classmethod
    def vault_RNA(cls):
        """A family of RNAs are found as part of the enigmatic vault ribonucleoprotein complex. The complex consists of a major vault protein (cls, MVP), two minor vault proteins (VPARP and TEP1), and several small untranslated RNA molecules. It has been suggested that the vault complex is involved in drug resistance. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00006)
        (SO_0000404)
        """
        return _namespace_SO('SO_0000404')

    @classmethod
    def Y_RNA(cls):
        """Y RNAs are components of the Ro ribonucleoprotein particle (cls, Ro RNP), in association with Ro60 and La proteins. The Y RNAs and Ro60 and La proteins are well conserved, but the function of the Ro RNP is not known. In humans the RNA component can be one of four small RNAs: hY1, hY3, hY4 and hY5. These small RNAs are predicted to fold into a conserved secondary structure containing three stem structures. The largest of the four, hY1, contains an additional hairpin. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00019)
        (SO_0000405)
        """
        return _namespace_SO('SO_0000405')

    @classmethod
    def twintron(cls):
        """An intron within an intron. Twintrons are group II or III introns, into which another group II or III intron has been transposed. (cls, PMID:1899376, PMID:7823908)
        (SO_0000406)
        """
        return _namespace_SO('SO_0000406')

    @classmethod
    def rRNA_18S(cls):
        """A large polynucleotide in eukaryotes, which functions as the small subunit of the ribosome. (cls, SO:ke)
        (SO_0000407)
        """
        return _namespace_SO('SO_0000407')

    @classmethod
    def site(cls):
        """The interbase position where something (cls, eg an aberration) occurred. (SO:ke)
        (SO_0000408)
        """
        return _namespace_SO('SO_0000408')

    @classmethod
    def binding_site(cls):
        """A biological_region of sequence that, in the molecule, interacts selectively and non-covalently with other molecules. A region on the surface of a molecule that may interact with another molecule. When applied to polypeptides: Amino acids involved in binding or interactions. It can also apply to an amino acid bond which is represented by the positions of the two flanking amino acids. (cls, EBIBS:GAR, SO:ke)
        (SO_0000409)
        """
        return _namespace_SO('SO_0000409')

    @classmethod
    def protein_binding_site(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with polypeptide molecules. (cls, SO:ke)
        (SO_0000410)
        """
        return _namespace_SO('SO_0000410')

    @classmethod
    def rescue_region(cls):
        """A region that rescues. (cls, SO:xp)
        (SO_0000411)
        """
        return _namespace_SO('SO_0000411')

    @classmethod
    def restriction_fragment(cls):
        """A region of polynucleotide sequence produced by digestion with a restriction endonuclease. (cls, SO:ke)
        (SO_0000412)
        """
        return _namespace_SO('SO_0000412')

    @classmethod
    def sequence_difference(cls):
        """A region where the sequence differs from that of a specified sequence. (cls, SO:ke)
        (SO_0000413)
        """
        return _namespace_SO('SO_0000413')

    @classmethod
    def invalidated_by_genomic_contamination(cls):
        """An attribute to describe a feature that is invalidated due to genomic contamination. (cls, SO:ke)
        (SO_0000414)
        """
        return _namespace_SO('SO_0000414')

    @classmethod
    def invalidated_by_genomic_polyA_primed_cDNA(cls):
        """An attribute to describe a feature that is invalidated due to polyA priming. (cls, SO:ke)
        (SO_0000415)
        """
        return _namespace_SO('SO_0000415')

    @classmethod
    def invalidated_by_partial_processing(cls):
        """An attribute to describe a feature that is invalidated due to partial processing. (cls, SO:ke)
        (SO_0000416)
        """
        return _namespace_SO('SO_0000416')

    @classmethod
    def polypeptide_domain(cls):
        """A structurally or functionally defined protein region. In proteins with multiple domains, the combination of the domains determines the function of the protein. A region which has been shown to recur throughout evolution. (cls, EBIBS:GAR)
        (SO_0000417)
        """
        return _namespace_SO('SO_0000417')

    @classmethod
    def signal_peptide(cls):
        """The signal_peptide is a short region of the peptide located at the N-terminus that directs the protein to be secreted or part of membrane components. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000418)
        """
        return _namespace_SO('SO_0000418')

    @classmethod
    def mature_protein_region(cls):
        """The polypeptide sequence that remains when the cleaved peptide regions have been cleaved from the immature peptide. (cls, EBIBS:GAR, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, SO:cb)
        (SO_0000419)
        """
        return _namespace_SO('SO_0000419')

    @classmethod
    def five_prime_terminal_inverted_repeat(cls):
        """-- No comment or description provided. --
        (cls, SO_0000420)
        """
        return _namespace_SO('SO_0000420')

    @classmethod
    def three_prime_terminal_inverted_repeat(cls):
        """-- No comment or description provided. --
        (cls, SO_0000421)
        """
        return _namespace_SO('SO_0000421')

    @classmethod
    def U5_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000422)
        """
        return _namespace_SO('SO_0000422')

    @classmethod
    def R_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000423)
        """
        return _namespace_SO('SO_0000423')

    @classmethod
    def U3_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000424)
        """
        return _namespace_SO('SO_0000424')

    @classmethod
    def five_prime_LTR(cls):
        """-- No comment or description provided. --
        (cls, SO_0000425)
        """
        return _namespace_SO('SO_0000425')

    @classmethod
    def three_prime_LTR(cls):
        """-- No comment or description provided. --
        (cls, SO_0000426)
        """
        return _namespace_SO('SO_0000426')

    @classmethod
    def R_five_prime_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000427)
        """
        return _namespace_SO('SO_0000427')

    @classmethod
    def U5_five_prime_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000428)
        """
        return _namespace_SO('SO_0000428')

    @classmethod
    def U3_five_prime_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000429)
        """
        return _namespace_SO('SO_0000429')

    @classmethod
    def R_three_prime_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000430)
        """
        return _namespace_SO('SO_0000430')

    @classmethod
    def U3_three_prime_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000431)
        """
        return _namespace_SO('SO_0000431')

    @classmethod
    def U5_three_prime_LTR_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000432)
        """
        return _namespace_SO('SO_0000432')

    @classmethod
    def non_LTR_retrotransposon_polymeric_tract(cls):
        """A polymeric tract, such as poly(cls, dA), within a non_LTR_retrotransposon. (SO:ke)
        (SO_0000433)
        """
        return _namespace_SO('SO_0000433')

    @classmethod
    def target_site_duplication(cls):
        """A sequence of the target DNA that is duplicated when a transposable element or phage inserts; usually found at each end the insertion. (cls, http://www.koko.gov.my/CocoaBioTech/Glossaryt.html)
        (SO_0000434)
        """
        return _namespace_SO('SO_0000434')

    @classmethod
    def RR_tract(cls):
        """A polypurine tract within an LTR_retrotransposon. (cls, SO:ke)
        (SO_0000435)
        """
        return _namespace_SO('SO_0000435')

    @classmethod
    def ARS(cls):
        """A sequence that can autonomously replicate, as a plasmid, when transformed into a bacterial host. (cls, SO:ma)
        (SO_0000436)
        """
        return _namespace_SO('SO_0000436')

    @classmethod
    def assortment_derived_duplication(cls):
        """Either:
            -- No comment or description provided. --
            (cls, SO_0000437)
        Or:
            A multi-chromosome duplication aberration generated by reassortment of other aberration components. (FB:gm)
            (SO_0000800)
        """
        return [ _namespace_SO('SO_0000437'), _namespace_SO('SO_0000800') ]

    @classmethod
    def gene_not_polyadenylated(cls):
        """-- No comment or description provided. --
        (cls, SO_0000438)
        """
        return _namespace_SO('SO_0000438')

    @classmethod
    def inverted_ring_chromosome(cls):
        """-- No comment or description provided. --
        (cls, SO_0000439)
        """
        return _namespace_SO('SO_0000439')

    @classmethod
    def vector_replicon(cls):
        """A replicon that has been modified to act as a vector for foreign sequence. (cls, SO:ma)
        (SO_0000440)
        """
        return _namespace_SO('SO_0000440')

    @classmethod
    def ss_oligo(cls):
        """A single stranded oligonucleotide. (cls, SO:ke)
        (SO_0000441)
        """
        return _namespace_SO('SO_0000441')

    @classmethod
    def ds_oligo(cls):
        """A double stranded oligonucleotide. (cls, SO:ke)
        (SO_0000442)
        """
        return _namespace_SO('SO_0000442')

    @classmethod
    def polymer_attribute(cls):
        """An attribute to describe the kind of biological sequence. (cls, SO:ke)
        (SO_0000443)
        """
        return _namespace_SO('SO_0000443')

    @classmethod
    def three_prime_noncoding_exon(cls):
        """Non-coding exon in the 3' UTR. (cls, SO:ke)
        (SO_0000444)
        """
        return _namespace_SO('SO_0000444')

    @classmethod
    def five_prime_noncoding_exon(cls):
        """Non-coding exon in the 5' UTR. (cls, SO:ke)
        (SO_0000445)
        """
        return _namespace_SO('SO_0000445')

    @classmethod
    def UTR_intron(cls):
        """Intron located in the untranslated region. (cls, SO:ke)
        (SO_0000446)
        """
        return _namespace_SO('SO_0000446')

    @classmethod
    def five_prime_UTR_intron(cls):
        """An intron located in the 5' UTR. (cls, SO:ke)
        (SO_0000447)
        """
        return _namespace_SO('SO_0000447')

    @classmethod
    def three_prime_UTR_intron(cls):
        """An intron located in the 3' UTR. (cls, SO:ke)
        (SO_0000448)
        """
        return _namespace_SO('SO_0000448')

    @classmethod
    def random_sequence(cls):
        """A sequence of nucleotides or amino acids which, by design, has a \"random\" order of components, given a predetermined input frequency of these components. (cls, SO:ma)
        (SO_0000449)
        """
        return _namespace_SO('SO_0000449')

    @classmethod
    def interband(cls):
        """A light region between two darkly staining bands in a polytene chromosome. (cls, SO:ma)
        (SO_0000450)
        """
        return _namespace_SO('SO_0000450')

    @classmethod
    def gene_with_polyadenylated_mRNA(cls):
        """A gene that encodes a polyadenylated mRNA. (cls, SO:xp)
        (SO_0000451)
        """
        return _namespace_SO('SO_0000451')

    @classmethod
    def transgene_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000452)
        """
        return _namespace_SO('SO_0000452')

    @classmethod
    def chromosomal_transposition(cls):
        """A chromosome structure variant whereby a region of a chromosome has been transferred to another position. Among interchromosomal rearrangements, the term transposition is reserved for that class in which the telomeres of the chromosomes involved are coupled (cls, that is to say, form the two ends of a single DNA molecule) as in wild-type. (FB:reference_manual, SO:ke)
        (SO_0000453)
        """
        return _namespace_SO('SO_0000453')

    @classmethod
    def rasiRNA(cls):
        """A 17-28-nt, small interfering RNA derived from transcripts of repetitive elements. (cls, http://www.developmentalcell.com/content/article/abstract?uid=PIIS1534580703002284)
        (SO_0000454)
        """
        return _namespace_SO('SO_0000454')

    @classmethod
    def gene_with_mRNA_with_frameshift(cls):
        """A gene that encodes an mRNA with a frameshift. (cls, SO:xp)
        (SO_0000455)
        """
        return _namespace_SO('SO_0000455')

    @classmethod
    def recombinationally_rearranged_gene(cls):
        """A gene that is recombinationally rearranged. (cls, SO:ke)
        (SO_0000456)
        """
        return _namespace_SO('SO_0000456')

    @classmethod
    def interchromosomal_duplication(cls):
        """A chromosome duplication involving an insertion from another chromosome. (cls, SO:ke)
        (SO_0000457)
        """
        return _namespace_SO('SO_0000457')

    @classmethod
    def D_gene_segment(cls):
        """Germline genomic DNA including D-region with 5' UTR and 3' UTR, also designated as D-segment. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000458)
        """
        return _namespace_SO('SO_0000458')

    @classmethod
    def gene_with_trans_spliced_transcript(cls):
        """A gene with a transcript that is trans-spliced. (cls, SO:xp)
        (SO_0000459)
        """
        return _namespace_SO('SO_0000459')

    @classmethod
    def vertebrate_immunoglobulin_T_cell_receptor_segment(cls):
        """-- No comment or description provided. --
        (cls, SO_0000460)
        """
        return _namespace_SO('SO_0000460')

    @classmethod
    def inversion_derived_bipartite_deficiency(cls):
        """A chromosomal deletion whereby a chromosome generated by recombination between two inversions; has a deficiency at each end of the inversion. (cls, FB:km)
        (SO_0000461)
        """
        return _namespace_SO('SO_0000461')

    @classmethod
    def pseudogenic_region(cls):
        """A non-functional descendent of a functional entity. (cls, SO:cjm)
        (SO_0000462)
        """
        return _namespace_SO('SO_0000462')

    @classmethod
    def encodes_alternately_spliced_transcripts(cls):
        """A gene that encodes more than one transcript. (cls, SO:ke)
        (SO_0000463)
        """
        return _namespace_SO('SO_0000463')

    @classmethod
    def decayed_exon(cls):
        """A non-functional descendant of an exon. (cls, SO:ke)
        (SO_0000464)
        """
        return _namespace_SO('SO_0000464')

    @classmethod
    def inversion_derived_deficiency_plus_duplication(cls):
        """A chromosome deletion whereby a chromosome is generated by recombination between two inversions; there is a deficiency at one end of the inversion and a duplication at the other end of the inversion. (cls, FB:km)
        (SO_0000465)
        """
        return _namespace_SO('SO_0000465')

    @classmethod
    def V_gene_segment(cls):
        """Germline genomic DNA including L-part1, V-intron and V-exon, with the 5' UTR and 3' UTR. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000466)
        """
        return _namespace_SO('SO_0000466')

    @classmethod
    def post_translationally_regulated_by_protein_stability(cls):
        """An attribute describing a gene sequence where the resulting protein is regulated by the stability of the resulting protein. (cls, SO:ke)
        (SO_0000467)
        """
        return _namespace_SO('SO_0000467')

    @classmethod
    def golden_path_fragment(cls):
        """One of the pieces of sequence that make up a golden path. (cls, SO:rd)
        (SO_0000468)
        """
        return _namespace_SO('SO_0000468')

    @classmethod
    def post_translationally_regulated_by_protein_modification(cls):
        """An attribute describing a gene sequence where the resulting protein is modified to regulate it. (cls, SO:ke)
        (SO_0000469)
        """
        return _namespace_SO('SO_0000469')

    @classmethod
    def J_gene_segment(cls):
        """Germline genomic DNA of an immunoglobulin/T-cell receptor gene including J-region with 5' UTR (cls, SO:0000204) and 3' UTR (SO:0000205), also designated as J-segment. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000470)
        """
        return _namespace_SO('SO_0000470')

    @classmethod
    def autoregulated(cls):
        """The gene product is involved in its own transcriptional regulation. (cls, SO:ke)
        (SO_0000471)
        """
        return _namespace_SO('SO_0000471')

    @classmethod
    def tiling_path(cls):
        """A set of regions which overlap with minimal polymorphism to form a linear sequence. (cls, SO:cjm)
        (SO_0000472)
        """
        return _namespace_SO('SO_0000472')

    @classmethod
    def negatively_autoregulated(cls):
        """The gene product is involved in its own transcriptional regulation where it decreases transcription. (cls, SO:ke)
        (SO_0000473)
        """
        return _namespace_SO('SO_0000473')

    @classmethod
    def tiling_path_fragment(cls):
        """A piece of sequence that makes up a tiling_path (cls, SO:0000472). (SO:ke)
        (SO_0000474)
        """
        return _namespace_SO('SO_0000474')

    @classmethod
    def positively_autoregulated(cls):
        """The gene product is involved in its own transcriptional regulation, where it increases transcription. (cls, SO:ke)
        (SO_0000475)
        """
        return _namespace_SO('SO_0000475')

    @classmethod
    def contig_read(cls):
        """A DNA sequencer read which is part of a contig. (cls, SO:ke)
        (SO_0000476)
        """
        return _namespace_SO('SO_0000476')

    @classmethod
    def polycistronic_gene(cls):
        """A gene that is polycistronic. (cls, SO:ke)
        (SO_0000477)
        """
        return _namespace_SO('SO_0000477')

    @classmethod
    def C_gene_segment(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene including C-region (cls, and introns if present) with 5' UTR (SO:0000204) and 3' UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000478)
        """
        return _namespace_SO('SO_0000478')

    @classmethod
    def trans_spliced_transcript(cls):
        """A transcript that is trans-spliced. (cls, SO:xp)
        (SO_0000479)
        """
        return _namespace_SO('SO_0000479')

    @classmethod
    def tiling_path_clone(cls):
        """A clone which is part of a tiling path. A tiling path is a set of sequencing substrates, typically clones, which have been selected in order to efficiently cover a region of the genome in preparation for sequencing and assembly. (cls, SO:ke)
        (SO_0000480)
        """
        return _namespace_SO('SO_0000480')

    @classmethod
    def terminal_inverted_repeat(cls):
        """An inverted repeat (cls, SO:0000294) occurring at the termini of a DNA transposon. (SO:ke)
        (SO_0000481)
        """
        return _namespace_SO('SO_0000481')

    @classmethod
    def vertebrate_immunoglobulin_T_cell_receptor_gene_cluster(cls):
        """-- No comment or description provided. --
        (cls, SO_0000482)
        """
        return _namespace_SO('SO_0000482')

    @classmethod
    def nc_primary_transcript(cls):
        """A primary transcript that is never translated into a protein. (cls, SO:ke)
        (SO_0000483)
        """
        return _namespace_SO('SO_0000483')

    @classmethod
    def three_prime_coding_exon_noncoding_region(cls):
        """The sequence of the 3' exon that is not coding. (cls, SO:ke)
        (SO_0000484)
        """
        return _namespace_SO('SO_0000484')

    @classmethod
    def DJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one DJ-gene, and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000485)
        """
        return _namespace_SO('SO_0000485')

    @classmethod
    def five_prime_coding_exon_noncoding_region(cls):
        """The sequence of the 5' exon preceding the start codon. (cls, SO:ke)
        (SO_0000486)
        """
        return _namespace_SO('SO_0000486')

    @classmethod
    def VDJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VDJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000487)
        """
        return _namespace_SO('SO_0000487')

    @classmethod
    def VDJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VDJ-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000488)
        """
        return _namespace_SO('SO_0000488')

    @classmethod
    def VJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000489)
        """
        return _namespace_SO('SO_0000489')

    @classmethod
    def VJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000490)
        """
        return _namespace_SO('SO_0000490')

    @classmethod
    def VJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VJ-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000491)
        """
        return _namespace_SO('SO_0000491')

    @classmethod
    def D_gene_recombination_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000492)
        """
        return _namespace_SO('SO_0000492')

    @classmethod
    def three_prime_D_heptamer(cls):
        """7 nucleotide recombination site like CACAGTG, part of a 3' D-recombination signal sequence of an immunoglobulin/T-cell receptor gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000493)
        """
        return _namespace_SO('SO_0000493')

    @classmethod
    def three_prime_D_nonamer(cls):
        """A 9 nucleotide recombination site (cls, e.g. ACAAAAACC), part of a 3' D-recombination signal sequence of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000494)
        """
        return _namespace_SO('SO_0000494')

    @classmethod
    def three_prime_D_spacer(cls):
        """A 12 or 23 nucleotide spacer between the 3'D-HEPTAMER and 3'D-NONAMER of a 3'D-RS. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000495)
        """
        return _namespace_SO('SO_0000495')

    @classmethod
    def five_prime_D_heptamer(cls):
        """7 nucleotide recombination site (cls, e.g. CACTGTG), part of a 5' D-recombination signal sequence (SO:0000556) of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000496)
        """
        return _namespace_SO('SO_0000496')

    @classmethod
    def five_prime_D_nonamer(cls):
        """9 nucleotide recombination site (cls, e.g. GGTTTTTGT), part of a five_prime_D-recombination signal sequence (SO:0000556) of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000497)
        """
        return _namespace_SO('SO_0000497')

    @classmethod
    def five_prime_D_spacer(cls):
        """12 or 23 nucleotide spacer between the 5' D-heptamer (cls, SO:0000496) and 5' D-nonamer (SO:0000497) of a 5' D-recombination signal sequence (SO:0000556) of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000498)
        """
        return _namespace_SO('SO_0000498')

    @classmethod
    def virtual_sequence(cls):
        """A continuous piece of sequence similar to the 'virtual contig' concept of the Ensembl database. (cls, SO:ke)
        (SO_0000499)
        """
        return _namespace_SO('SO_0000499')

    @classmethod
    def Hoogsteen_base_pair(cls):
        """A type of non-canonical base-pairing. This is less energetically favourable than watson crick base pairing. Hoogsteen GC base pairs only have two hydrogen bonds. (cls, PMID:12177293)
        (SO_0000500)
        """
        return _namespace_SO('SO_0000500')

    @classmethod
    def reverse_Hoogsteen_base_pair(cls):
        """A type of non-canonical base-pairing. (cls, SO:ke)
        (SO_0000501)
        """
        return _namespace_SO('SO_0000501')

    @classmethod
    def transcribed_region(cls):
        """A region of sequence that is transcribed. This region may cover the transcript of a gene, it may emcompas the sequence covered by all of the transcripts of a alternately spliced gene, or it may cover the region transcribed by a polycistronic transcript. A gene may have 1 or more transcribed regions and a transcribed_region may belong to one or more genes. (cls, SO:ke)
        (SO_0000502)
        """
        return _namespace_SO('SO_0000502')

    @classmethod
    def alternately_spliced_gene_encodeing_one_transcript(cls):
        """-- No comment or description provided. --
        (cls, SO_0000503)
        """
        return _namespace_SO('SO_0000503')

    @classmethod
    def D_DJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene, one DJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000504)
        """
        return _namespace_SO('SO_0000504')

    @classmethod
    def D_DJ_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene and one DJ-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000505)
        """
        return _namespace_SO('SO_0000505')

    @classmethod
    def D_DJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene, one DJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000506)
        """
        return _namespace_SO('SO_0000506')

    @classmethod
    def pseudogenic_exon(cls):
        """A non functional descendant of an exon, part of a pseudogene. (cls, SO:ke)
        (SO_0000507)
        """
        return _namespace_SO('SO_0000507')

    @classmethod
    def D_DJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one D-gene, one DJ-gene, and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000508)
        """
        return _namespace_SO('SO_0000508')

    @classmethod
    def D_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one D-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000509)
        """
        return _namespace_SO('SO_0000509')

    @classmethod
    def VD_gene_segment(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in partially rearranged genomic DNA including L-part1, V-intron and V-D-exon, with the 5' UTR (cls, SO:0000204) and 3' UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000510)
        """
        return _namespace_SO('SO_0000510')

    @classmethod
    def J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000511)
        """
        return _namespace_SO('SO_0000511')

    @classmethod
    def inversion_derived_deficiency_plus_aneuploid(cls):
        """A chromosomal deletion whereby a chromosome generated by recombination between two inversions; has a deficiency at one end and presumed to have a deficiency or duplication at the other end of the inversion. (cls, FB:km)
        (SO_0000512)
        """
        return _namespace_SO('SO_0000512')

    @classmethod
    def J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including more than one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000513)
        """
        return _namespace_SO('SO_0000513')

    @classmethod
    def J_nonamer(cls):
        """9 nucleotide recombination site (cls, e.g. GGTTTTTGT), part of a J-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000514)
        """
        return _namespace_SO('SO_0000514')

    @classmethod
    def J_heptamer(cls):
        """7 nucleotide recombination site (cls, e.g. CACAGTG), part of a J-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000515)
        """
        return _namespace_SO('SO_0000515')

    @classmethod
    def pseudogenic_transcript(cls):
        """A non functional descendant of a transcript, part of a pseudogene. (cls, SO:ke)
        (SO_0000516)
        """
        return _namespace_SO('SO_0000516')

    @classmethod
    def J_spacer(cls):
        """12 or 23 nucleotide spacer between the J-nonamer and the J-heptamer of a J-gene recombination feature of an immunoglobulin/T-cell receptor gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000517)
        """
        return _namespace_SO('SO_0000517')

    @classmethod
    def V_DJ_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene and one DJ-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000518)
        """
        return _namespace_SO('SO_0000518')

    @classmethod
    def V_DJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one DJ-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000519)
        """
        return _namespace_SO('SO_0000519')

    @classmethod
    def V_VDJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VDJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000520)
        """
        return _namespace_SO('SO_0000520')

    @classmethod
    def V_VDJ_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene and one VDJ-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000521)
        """
        return _namespace_SO('SO_0000521')

    @classmethod
    def V_VDJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VDJ-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000522)
        """
        return _namespace_SO('SO_0000522')

    @classmethod
    def V_VJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000523)
        """
        return _namespace_SO('SO_0000523')

    @classmethod
    def V_VJ_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene and one VJ-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000524)
        """
        return _namespace_SO('SO_0000524')

    @classmethod
    def V_VJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VJ-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000525)
        """
        return _namespace_SO('SO_0000525')

    @classmethod
    def V_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including more than one V-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000526)
        """
        return _namespace_SO('SO_0000526')

    @classmethod
    def V_D_DJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000527)
        """
        return _namespace_SO('SO_0000527')

    @classmethod
    def V_D_DJ_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000528)
        """
        return _namespace_SO('SO_0000528')

    @classmethod
    def V_D_DJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000529)
        """
        return _namespace_SO('SO_0000529')

    @classmethod
    def V_D_DJ_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one D-gene, one DJ-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000530)
        """
        return _namespace_SO('SO_0000530')

    @classmethod
    def V_D_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene, one D-gene and one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000531)
        """
        return _namespace_SO('SO_0000531')

    @classmethod
    def V_D_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene, one D-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000532)
        """
        return _namespace_SO('SO_0000532')

    @classmethod
    def V_heptamer(cls):
        """7 nucleotide recombination site (cls, e.g. CACAGTG), part of V-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000533)
        """
        return _namespace_SO('SO_0000533')

    @classmethod
    def V_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000534)
        """
        return _namespace_SO('SO_0000534')

    @classmethod
    def V_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one V-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000535)
        """
        return _namespace_SO('SO_0000535')

    @classmethod
    def V_nonamer(cls):
        """9 nucleotide recombination site (cls, e.g. ACAAAAACC), part of V-gene recombination feature of an immunoglobulin/T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000536)
        """
        return _namespace_SO('SO_0000536')

    @classmethod
    def V_spacer(cls):
        """12 or 23 nucleotide spacer between the V-heptamer and the V-nonamer of a V-gene recombination feature of an immunoglobulin/T-cell receptor gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000537)
        """
        return _namespace_SO('SO_0000537')

    @classmethod
    def V_gene_recombination_feature(cls):
        """Recombination signal including V-heptamer, V-spacer and V-nonamer in 3' of V-region of a V-gene or V-sequence of an immunoglobulin/T-cell receptor gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000538)
        """
        return _namespace_SO('SO_0000538')

    @classmethod
    def DJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one DJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000539)
        """
        return _namespace_SO('SO_0000539')

    @classmethod
    def DJ_J_C_cluster(cls):
        """Genomic DNA in rearranged configuration including at least one D-J-GENE, one J-GENE and one C-GENE. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000540)
        """
        return _namespace_SO('SO_0000540')

    @classmethod
    def VDJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one VDJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000541)
        """
        return _namespace_SO('SO_0000541')

    @classmethod
    def V_DJ_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one DJ-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000542)
        """
        return _namespace_SO('SO_0000542')

    @classmethod
    def alternately_spliced_gene_encoding_greater_than_one_transcript(cls):
        """-- No comment or description provided. --
        (cls, SO_0000543)
        """
        return _namespace_SO('SO_0000543')

    @classmethod
    def helitron(cls):
        """A rolling circle transposon. Autonomous helitrons encode a 5'-to-3' DNA helicase and nuclease/ligase similar to those encoded by known rolling-circle replicons. (cls, http://www.pnas.org/cgi/content/full/100/11/6569)
        (SO_0000544)
        """
        return _namespace_SO('SO_0000544')

    @classmethod
    def recoding_pseudoknot(cls):
        """The pseudoknots involved in recoding are unique in that, as they play their role as a structure, they are immediately unfolded and their now linear sequence serves as a template for decoding. (cls, http://www.pubmedcentral.nih.gov/articlerender.fcgi?artid=33937)
        (SO_0000545)
        """
        return _namespace_SO('SO_0000545')

    @classmethod
    def designed_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000546)
        """
        return _namespace_SO('SO_0000546')

    @classmethod
    def inversion_derived_bipartite_duplication(cls):
        """A chromosome generated by recombination between two inversions; there is a duplication at each end of the inversion. (cls, FB:km)
        (SO_0000547)
        """
        return _namespace_SO('SO_0000547')

    @classmethod
    def gene_with_edited_transcript(cls):
        """A gene that encodes a transcript that is edited. (cls, SO:xp)
        (SO_0000548)
        """
        return _namespace_SO('SO_0000548')

    @classmethod
    def inversion_derived_duplication_plus_aneuploid(cls):
        """A chromosome generated by recombination between two inversions; has a duplication at one end and presumed to have a deficiency or duplication at the other end of the inversion. (cls, FB:km)
        (SO_0000549)
        """
        return _namespace_SO('SO_0000549')

    @classmethod
    def aneuploid_chromosome(cls):
        """A chromosome structural variation whereby either a chromosome exists in addition to the normal chromosome complement or is lacking. (cls, SO:ke)
        (SO_0000550)
        """
        return _namespace_SO('SO_0000550')

    @classmethod
    def polyA_signal_sequence(cls):
        """The recognition sequence necessary for endonuclease cleavage of an RNA transcript that is followed by polyadenylation; consensus=AATAAA. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000551)
        """
        return _namespace_SO('SO_0000551')

    @classmethod
    def Shine_Dalgarno_sequence(cls):
        """A region in the 5' UTR that pairs with the 16S rRNA during formation of the preinitiation complex. (cls, SO:jh)
        (SO_0000552)
        """
        return _namespace_SO('SO_0000552')

    @classmethod
    def polyA_site(cls):
        """The site on an RNA transcript to which will be added adenine residues by post-transcriptional polyadenylation. The boundary between the UTR and the polyA sequence. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000553)
        """
        return _namespace_SO('SO_0000553')

    @classmethod
    def assortment_derived_deficiency_plus_duplication(cls):
        """Either:
            -- No comment or description provided. --
            (cls, SO_0000554)
        Or:
            A multi-chromosome aberration generated by reassortment of other aberration components; presumed to have a deficiency and a duplication. (FB:gm)
            (SO_0000801)
        """
        return [ _namespace_SO('SO_0000554'), _namespace_SO('SO_0000801') ]

    @classmethod
    def five_prime_clip(cls):
        """5' most region of a precursor transcript that is clipped off during processing. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000555)
        """
        return _namespace_SO('SO_0000555')

    @classmethod
    def five_prime_D_recombination_signal_sequence(cls):
        """Recombination signal of an immunoglobulin/T-cell receptor gene, including the 5' D-nonamer (cls, SO:0000497), 5' D-spacer (SO:0000498), and 5' D-heptamer (SO:0000396) in 5' of the D-region of a D-gene, or in 5' of the D-region of DJ-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000556)
        """
        return _namespace_SO('SO_0000556')

    @classmethod
    def three_prime_clip(cls):
        """3'-most region of a precursor transcript that is clipped off during processing. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000557)
        """
        return _namespace_SO('SO_0000557')

    @classmethod
    def C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene including more than one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000558)
        """
        return _namespace_SO('SO_0000558')

    @classmethod
    def D_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including more than one D-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000559)
        """
        return _namespace_SO('SO_0000559')

    @classmethod
    def D_J_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in germline configuration including at least one D-gene and one J-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000560)
        """
        return _namespace_SO('SO_0000560')

    @classmethod
    def heptamer_of_recombination_feature_of_vertebrate_immune_system_gene(cls):
        """Seven nucleotide recombination site (cls, e.g. CACAGTG), part of V-gene, D-gene or J-gene recombination feature of an immunoglobulin or T-cell receptor gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000561)
        """
        return _namespace_SO('SO_0000561')

    @classmethod
    def nonamer_of_recombination_feature_of_vertebrate_immune_system_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0000562)
        """
        return _namespace_SO('SO_0000562')

    @classmethod
    def vertebrate_immune_system_gene_recombination_spacer(cls):
        """-- No comment or description provided. --
        (cls, SO_0000563)
        """
        return _namespace_SO('SO_0000563')

    @classmethod
    def V_DJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one DJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000564)
        """
        return _namespace_SO('SO_0000564')

    @classmethod
    def V_VDJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VDJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000565)
        """
        return _namespace_SO('SO_0000565')

    @classmethod
    def V_VJ_J_C_cluster(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in rearranged configuration including at least one V-gene, one VJ-gene, one J-gene and one C-gene. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000566)
        """
        return _namespace_SO('SO_0000566')

    @classmethod
    def inversion_derived_aneuploid_chromosome(cls):
        """A chromosome may be generated by recombination between two inversions; presumed to have a deficiency or duplication at each end of the inversion. (cls, FB:km)
        (SO_0000567)
        """
        return _namespace_SO('SO_0000567')

    @classmethod
    def bidirectional_promoter(cls):
        """-- No comment or description provided. --
        (cls, SO_0000568)
        """
        return _namespace_SO('SO_0000568')

    @classmethod
    def retrotransposed(cls):
        """An attribute of a feature that occurred as the product of a reverse transcriptase mediated event. (cls, SO:ke)
        (SO_0000569)
        """
        return _namespace_SO('SO_0000569')

    @classmethod
    def three_prime_D_recombination_signal_sequence(cls):
        """Recombination signal of an immunoglobulin/T-cell receptor gene, including the 3' D-heptamer (cls, SO:0000493), 3' D-spacer, and 3' D-nonamer (SO:0000494) in 3' of the D-region of a D-gene. (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000570)
        """
        return _namespace_SO('SO_0000570')

    @classmethod
    def miRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000571)
        """
        return _namespace_SO('SO_0000571')

    @classmethod
    def DJ_gene_segment(cls):
        """Genomic DNA of immunoglobulin/T-cell receptor gene in partially rearranged genomic DNA including D-J-region with 5' UTR and 3' UTR, also designated as D-J-segment. (cls, http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000572)
        """
        return _namespace_SO('SO_0000572')

    @classmethod
    def rRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000573)
        """
        return _namespace_SO('SO_0000573')

    @classmethod
    def VDJ_gene_segment(cls):
        """Rearranged genomic DNA of immunoglobulin/T-cell receptor gene including L-part1, V-intron and V-D-J-exon, with the 5'UTR (cls, SO:0000204) and 3'UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000574)
        """
        return _namespace_SO('SO_0000574')

    @classmethod
    def scRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000575)
        """
        return _namespace_SO('SO_0000575')

    @classmethod
    def VJ_gene_segment(cls):
        """Rearranged genomic DNA of immunoglobulin/T-cell receptor gene including L-part1, V-intron and V-J-exon, with the 5'UTR (cls, SO:0000204) and 3'UTR (SO:0000205). (http://www.imgt.org/cgi-bin/IMGTlect.jv?query=7#)
        (SO_0000576)
        """
        return _namespace_SO('SO_0000576')

    @classmethod
    def centromere(cls):
        """A region of chromosome where the spindle fibers attach during mitosis and meiosis. (cls, SO:ke)
        (SO_0000577)
        """
        return _namespace_SO('SO_0000577')

    @classmethod
    def snoRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000578)
        """
        return _namespace_SO('SO_0000578')

    @classmethod
    def edited_transcript_feature(cls):
        """A locatable feature on a transcript that is edited. (cls, SO:ma)
        (SO_0000579)
        """
        return _namespace_SO('SO_0000579')

    @classmethod
    def methylation_guide_snoRNA_primary_transcript(cls):
        """A primary transcript encoding a methylation guide small nucleolar RNA. (cls, SO:ke)
        (SO_0000580)
        """
        return _namespace_SO('SO_0000580')

    @classmethod
    def cap(cls):
        """A structure consisting of a 7-methylguanosine in 5'-5' triphosphate linkage with the first nucleotide of an mRNA. It is added post-transcriptionally, and is not encoded in the DNA. (cls, http://seqcore.brcf.med.umich.edu/doc/educ/dnapr/mbglossary/mbgloss.html)
        (SO_0000581)
        """
        return _namespace_SO('SO_0000581')

    @classmethod
    def rRNA_cleavage_snoRNA_primary_transcript(cls):
        """A primary transcript encoding an rRNA cleavage snoRNA. (cls, SO:ke)
        (SO_0000582)
        """
        return _namespace_SO('SO_0000582')

    @classmethod
    def pre_edited_region(cls):
        """The region of a transcript that will be edited. (cls, http://dna.kdna.ucla.edu/rna/index.aspx)
        (SO_0000583)
        """
        return _namespace_SO('SO_0000583')

    @classmethod
    def tmRNA(cls):
        """A tmRNA liberates a mRNA from a stalled ribosome. To accomplish this part of the tmRNA is used as a reading frame that ends in a translation stop signal. The broken mRNA is replaced in the ribosome by the tmRNA and translation of the tmRNA leads to addition of a proteolysis tag to the incomplete protein enabling recognition by a protease. Recently a number of permuted tmRNAs genes have been found encoded in two parts. TmRNAs have been identified in eubacteria and some chloroplasts but are absent from archeal and Eukaryote nuclear genomes. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00023)
        (SO_0000584)
        """
        return _namespace_SO('SO_0000584')

    @classmethod
    def C_D_box_snoRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000585)
        """
        return _namespace_SO('SO_0000585')

    @classmethod
    def tmRNA_primary_transcript(cls):
        """A primary transcript encoding a tmRNA (cls, SO:0000584). (SO:ke)
        (SO_0000586)
        """
        return _namespace_SO('SO_0000586')

    @classmethod
    def group_I_intron(cls):
        """Group I catalytic introns are large self-splicing ribozymes. They catalyze their own excision from mRNA, tRNA and rRNA precursors in a wide range of organisms. The core secondary structure consists of 9 paired regions (cls, P1-P9). These fold to essentially two domains, the P4-P6 domain (formed from the stacking of P5, P4, P6 and P6a helices) and the P3-P9 domain (formed from the P8, P3, P7 and P9 helices). Group I catalytic introns often have long ORFs inserted in loop regions. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00028)
        (SO_0000587)
        """
        return _namespace_SO('SO_0000587')

    @classmethod
    def autocatalytically_spliced_intron(cls):
        """A self spliced intron. (cls, SO:ke)
        (SO_0000588)
        """
        return _namespace_SO('SO_0000588')

    @classmethod
    def SRP_RNA_primary_transcript(cls):
        """A primary transcript encoding a signal recognition particle RNA. (cls, SO:ke)
        (SO_0000589)
        """
        return _namespace_SO('SO_0000589')

    @classmethod
    def SRP_RNA(cls):
        """The signal recognition particle (cls, SRP) is a universally conserved ribonucleoprotein. It is involved in the co-translational targeting of proteins to membranes. The eukaryotic SRP consists of a 300-nucleotide 7S RNA and six proteins: SRPs 72, 68, 54, 19, 14, and 9. Archaeal SRP consists of a 7S RNA and homologues of the eukaryotic SRP19 and SRP54 proteins. In most eubacteria, the SRP consists of a 4.5S RNA and the Ffh protein (a homologue of the eukaryotic SRP54 protein). Eukaryotic and archaeal 7S RNAs have very similar secondary structures, with eight helical elements. These fold into the Alu and S domains, separated by a long linker region. Eubacterial SRP is generally a simpler structure, with the M domain of Ffh bound to a region of the 4.5S RNA that corresponds to helix 8 of the eukaryotic and archaeal SRP S domain. Some Gram-positive bacteria (e.g. Bacillus subtilis), however, have a larger SRP RNA that also has an Alu domain. The Alu domain is thought to mediate the peptide chain elongation retardation function of the SRP. The universally conserved helix which interacts with the SRP54/Ffh M domain mediates signal sequence recognition. In eukaryotes and archaea, the SRP19-helix 6 complex is thought to be involved in SRP assembly and stabilizes helix 8 for SRP54 binding. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00017)
        (SO_0000590)
        """
        return _namespace_SO('SO_0000590')

    @classmethod
    def pseudoknot(cls):
        """A tertiary structure in RNA where nucleotides in a loop form base pairs with a region of RNA downstream of the loop. (cls, RSC:cb)
        (SO_0000591)
        """
        return _namespace_SO('SO_0000591')

    @classmethod
    def H_pseudoknot(cls):
        """A pseudoknot which contains two stems and at least two loops. (cls, http://www.ncbi.nlm.nih.gov:80/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=10334330&dopt=Abstract)
        (SO_0000592)
        """
        return _namespace_SO('SO_0000592')

    @classmethod
    def C_D_box_snoRNA(cls):
        """Most box C/D snoRNAs also contain long (cls, >10 nt) sequences complementary to rRNA. Boxes C and D, as well as boxes C' and D', are usually located in close proximity, and form a structure known as the box C/D motif. This motif is important for snoRNA stability, processing, nucleolar targeting and function. A small number of box C/D snoRNAs are involved in rRNA processing; most, however, are known or predicted to serve as guide RNAs in ribose methylation of rRNA. Targeting involves direct base pairing of the snoRNA at the rRNA site to be modified and selection of a rRNA nucleotide a fixed distance from box D or D'. (http://www.bio.umass.edu/biochem/rna-sequence/Yeast_snoRNA_Database/snoRNA_DataBase.html)
        (SO_0000593)
        """
        return _namespace_SO('SO_0000593')

    @classmethod
    def H_ACA_box_snoRNA(cls):
        """Members of the box H/ACA family contain an ACA triplet, exactly 3 nt upstream from the 3' end and an H-box in a hinge region that links two structurally similar functional domains of the molecule. Both boxes are important for snoRNA biosynthesis and function. A few box H/ACA snoRNAs are involved in rRNA processing; most others are known or predicted to participate in selection of uridine nucleosides in rRNA to be converted to pseudouridines. Site selection is mediated by direct base pairing of the snoRNA with rRNA through one or both targeting domains. (cls, http://www.bio.umass.edu/biochem/rna-sequence/Yeast_snoRNA_Database/snoRNA_DataBase.html)
        (SO_0000594)
        """
        return _namespace_SO('SO_0000594')

    @classmethod
    def C_D_box_snoRNA_primary_transcript(cls):
        """A primary transcript encoding a small nucleolar RNA of the box C/D family. (cls, SO:ke)
        (SO_0000595)
        """
        return _namespace_SO('SO_0000595')

    @classmethod
    def H_ACA_box_snoRNA_primary_transcript(cls):
        """A primary transcript encoding a small nucleolar RNA of the box H/ACA family. (cls, SO:ke)
        (SO_0000596)
        """
        return _namespace_SO('SO_0000596')

    @classmethod
    def transcript_edited_by_U_insertion_deletion(cls):
        """The insertion and deletion of uridine (cls, U) residues, usually within coding regions of mRNA transcripts of cryptogenes in the mitochondrial genome of kinetoplastid protozoa. (http://www.rna.ucla.edu/index.html)
        (SO_0000597)
        """
        return _namespace_SO('SO_0000597')

    @classmethod
    def edited_by_C_insertion_and_dinucleotide_insertion(cls):
        """-- No comment or description provided. --
        (cls, SO_0000598)
        """
        return _namespace_SO('SO_0000598')

    @classmethod
    def edited_by_C_to_U_substitution(cls):
        """-- No comment or description provided. --
        (cls, SO_0000599)
        """
        return _namespace_SO('SO_0000599')

    @classmethod
    def edited_by_A_to_I_substitution(cls):
        """-- No comment or description provided. --
        (cls, SO_0000600)
        """
        return _namespace_SO('SO_0000600')

    @classmethod
    def edited_by_G_addition(cls):
        """-- No comment or description provided. --
        (cls, SO_0000601)
        """
        return _namespace_SO('SO_0000601')

    @classmethod
    def guide_RNA(cls):
        """A short 3'-uridylated RNA that can form a duplex (cls, except for its post-transcriptionally added oligo_U tail (SO:0000609)) with a stretch of mature edited mRNA. (http://www.rna.ucla.edu/index.html)
        (SO_0000602)
        """
        return _namespace_SO('SO_0000602')

    @classmethod
    def group_II_intron(cls):
        """Group II introns are found in rRNA, tRNA and mRNA of organelles in fungi, plants and protists, and also in mRNA in bacteria. They are large self-splicing ribozymes and have 6 structural domains (cls, usually designated dI to dVI). A subset of group II introns also encode essential splicing proteins in intronic ORFs. The length of these introns can therefore be up to 3kb. Splicing occurs in almost identical fashion to nuclear pre-mRNA splicing with two transesterification steps. The 2' hydroxyl of a bulged adenosine in domain VI attacks the 5' splice site, followed by nucleophilic attack on the 3' splice site by the 3' OH of the upstream exon. Protein machinery is required for splicing in vivo, and long range intron-intron and intron-exon interactions are important for splice site positioning. Group II introns are further sub-classified into groups IIA and IIB which differ in splice site consensus, distance of bulged A from 3' splice site, some tertiary interactions, and intronic ORF phylogeny. (http://www.sanger.ac.uk/Software/Rfam/browse/index.shtml)
        (SO_0000603)
        """
        return _namespace_SO('SO_0000603')

    @classmethod
    def editing_block(cls):
        """Edited mRNA sequence mediated by a single guide RNA (cls, SO:0000602). (http://dna.kdna.ucla.edu/rna/index.aspx)
        (SO_0000604)
        """
        return _namespace_SO('SO_0000604')

    @classmethod
    def intergenic_region(cls):
        """A region containing or overlapping no genes that is bounded on either side by a gene, or bounded by a gene and the end of the chromosome. (cls, SO:cjm)
        (SO_0000605)
        """
        return _namespace_SO('SO_0000605')

    @classmethod
    def editing_domain(cls):
        """Edited mRNA sequence mediated by two or more overlapping guide RNAs (cls, SO:0000602). (http://dna.kdna.ucla.edu/rna/index.aspx)
        (SO_0000606)
        """
        return _namespace_SO('SO_0000606')

    @classmethod
    def unedited_region(cls):
        """The region of an edited transcript that will not be edited. (cls, http://dna.kdna.ucla.edu/rna/index.aspx)
        (SO_0000607)
        """
        return _namespace_SO('SO_0000607')

    @classmethod
    def H_ACA_box_snoRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000608)
        """
        return _namespace_SO('SO_0000608')

    @classmethod
    def oligo_U_tail(cls):
        """The string of non-encoded U's at the 3' end of a guide RNA (cls, SO:0000602). (http://www.rna.ucla.edu/)
        (SO_0000609)
        """
        return _namespace_SO('SO_0000609')

    @classmethod
    def polyA_sequence(cls):
        """Sequence of about 100 nucleotides of A added to the 3' end of most eukaryotic mRNAs. (cls, SO:ke)
        (SO_0000610)
        """
        return _namespace_SO('SO_0000610')

    @classmethod
    def branch_site(cls):
        """A pyrimidine rich sequence near the 3' end of an intron to which the 5'end becomes covalently bound during nuclear splicing. The resulting structure resembles a lariat. (cls, SO:ke)
        (SO_0000611)
        """
        return _namespace_SO('SO_0000611')

    @classmethod
    def polypyrimidine_tract(cls):
        """The polypyrimidine tract is one of the cis-acting sequence elements directing intron removal in pre-mRNA splicing. (cls, http://nar.oupjournals.org/cgi/content/full/25/4/888)
        (SO_0000612)
        """
        return _namespace_SO('SO_0000612')

    @classmethod
    def bacterial_RNApol_promoter(cls):
        """A DNA sequence to which bacterial RNA polymerase binds, to begin transcription. (cls, SO:ke)
        (SO_0000613)
        """
        return _namespace_SO('SO_0000613')

    @classmethod
    def bacterial_terminator(cls):
        """A terminator signal for bacterial transcription. (cls, SO:ke)
        (SO_0000614)
        """
        return _namespace_SO('SO_0000614')

    @classmethod
    def terminator_of_type_2_RNApol_III_promoter(cls):
        """A terminator signal for RNA polymerase III transcription. (cls, SO:ke)
        (SO_0000615)
        """
        return _namespace_SO('SO_0000615')

    @classmethod
    def transcription_end_site(cls):
        """The base where transcription ends. (cls, SO:ke)
        (SO_0000616)
        """
        return _namespace_SO('SO_0000616')

    @classmethod
    def RNApol_III_promoter_type_1(cls):
        """-- No comment or description provided. --
        (cls, SO_0000617)
        """
        return _namespace_SO('SO_0000617')

    @classmethod
    def RNApol_III_promoter_type_2(cls):
        """-- No comment or description provided. --
        (cls, SO_0000618)
        """
        return _namespace_SO('SO_0000618')

    @classmethod
    def A_box(cls):
        """A variably distant linear promoter region recognized by TFIIIC, with consensus sequence TGGCnnAGTGG. (cls, SO:ke)
        (SO_0000619)
        """
        return _namespace_SO('SO_0000619')

    @classmethod
    def B_box(cls):
        """A variably distant linear promoter region recognized by TFIIIC, with consensus sequence AGGTTCCAnnCC. (cls, SO:ke)
        (SO_0000620)
        """
        return _namespace_SO('SO_0000620')

    @classmethod
    def RNApol_III_promoter_type_3(cls):
        """-- No comment or description provided. --
        (cls, SO_0000621)
        """
        return _namespace_SO('SO_0000621')

    @classmethod
    def C_box(cls):
        """An RNA polymerase III type 1 promoter with consensus sequence CAnnCCn. (cls, SO:ke)
        (SO_0000622)
        """
        return _namespace_SO('SO_0000622')

    @classmethod
    def snRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000623)
        """
        return _namespace_SO('SO_0000623')

    @classmethod
    def telomere(cls):
        """A specific structure at the end of a linear chromosome, required for the integrity and maintenance of the end. (cls, SO:ma)
        (SO_0000624)
        """
        return _namespace_SO('SO_0000624')

    @classmethod
    def silencer(cls):
        """A regulatory region which upon binding of transcription factors, suppress the transcription of the gene or genes they control. (cls, SO:ke)
        (SO_0000625)
        """
        return _namespace_SO('SO_0000625')

    @classmethod
    def chromosomal_regulatory_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0000626)
        """
        return _namespace_SO('SO_0000626')

    @classmethod
    def insulator(cls):
        """A transcriptional cis regulatory region that when located between a CM and a gene's promoter prevents the CRM from modulating that genes expression. (cls, SO:regcreative)
        (SO_0000627)
        """
        return _namespace_SO('SO_0000627')

    @classmethod
    def chromosomal_structural_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0000628)
        """
        return _namespace_SO('SO_0000628')

    @classmethod
    def five_prime_open_reading_frame(cls):
        """-- No comment or description provided. --
        (cls, SO_0000629)
        """
        return _namespace_SO('SO_0000629')

    @classmethod
    def upstream_AUG_codon(cls):
        """A start codon upstream of the ORF. (cls, SO:ke)
        (SO_0000630)
        """
        return _namespace_SO('SO_0000630')

    @classmethod
    def polycistronic_primary_transcript(cls):
        """A primary transcript encoding for more than one gene product. (cls, SO:ke)
        (SO_0000631)
        """
        return _namespace_SO('SO_0000631')

    @classmethod
    def monocistronic_primary_transcript(cls):
        """A primary transcript encoding for one gene product. (cls, SO:ke)
        (SO_0000632)
        """
        return _namespace_SO('SO_0000632')

    @classmethod
    def monocistronic_mRNA(cls):
        """An mRNA with either a single protein product, or for which the regions encoding all its protein products overlap. (cls, SO:rd)
        (SO_0000633)
        """
        return _namespace_SO('SO_0000633')

    @classmethod
    def polycistronic_mRNA(cls):
        """An mRNA that encodes multiple proteins from at least two non-overlapping regions. (cls, SO:rd)
        (SO_0000634)
        """
        return _namespace_SO('SO_0000634')

    @classmethod
    def mini_exon_donor_RNA(cls):
        """A primary transcript that donates the spliced leader to other mRNA. (cls, SO:ke)
        (SO_0000635)
        """
        return _namespace_SO('SO_0000635')

    @classmethod
    def spliced_leader_RNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000636)
        """
        return _namespace_SO('SO_0000636')

    @classmethod
    def engineered_plasmid(cls):
        """A plasmid that is engineered. (cls, SO:xp)
        (SO_0000637)
        """
        return _namespace_SO('SO_0000637')

    @classmethod
    def transcribed_spacer_region(cls):
        """Part of an rRNA transcription unit that is transcribed but discarded during maturation, not giving rise to any part of rRNA. (cls, http://oregonstate.edu/instruction/bb492/general/glossary.html)
        (SO_0000638)
        """
        return _namespace_SO('SO_0000638')

    @classmethod
    def internal_transcribed_spacer_region(cls):
        """Non-coding regions of DNA sequence that separate genes coding for the 28S, 5.8S, and 18S ribosomal RNAs. (cls, SO:ke)
        (SO_0000639)
        """
        return _namespace_SO('SO_0000639')

    @classmethod
    def external_transcribed_spacer_region(cls):
        """Non-coding regions of DNA that precede the sequence that codes for the ribosomal RNA. (cls, SO:ke)
        (SO_0000640)
        """
        return _namespace_SO('SO_0000640')

    @classmethod
    def tetranucleotide_repeat_microsatellite_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000641)
        """
        return _namespace_SO('SO_0000641')

    @classmethod
    def SRP_RNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000642)
        """
        return _namespace_SO('SO_0000642')

    @classmethod
    def minisatellite(cls):
        """A repeat region containing tandemly repeated sequences having a unit length of 10 to 40 bp. (cls, http://www.informatics.jax.org/silver/glossary.shtml)
        (SO_0000643)
        """
        return _namespace_SO('SO_0000643')

    @classmethod
    def antisense_RNA(cls):
        """Antisense RNA is RNA that is transcribed from the coding, rather than the template, strand of DNA. It is therefore complementary to mRNA. (cls, SO:ke)
        (SO_0000644)
        """
        return _namespace_SO('SO_0000644')

    @classmethod
    def antisense_primary_transcript(cls):
        """The reverse complement of the primary transcript. (cls, SO:ke)
        (SO_0000645)
        """
        return _namespace_SO('SO_0000645')

    @classmethod
    def siRNA(cls):
        """A small RNA molecule that is the product of a longer exogenous or endogenous dsRNA, which is either a bimolecular duplex or very long hairpin, processed (cls, via the Dicer pathway) such that numerous siRNAs accumulate from both strands of the dsRNA. SRNAs trigger the cleavage of their target molecules. (PMID:12592000)
        (SO_0000646)
        """
        return _namespace_SO('SO_0000646')

    @classmethod
    def miRNA_primary_transcript(cls):
        """A primary transcript encoding a micro RNA. (cls, SO:ke)
        (SO_0000647)
        """
        return _namespace_SO('SO_0000647')

    @classmethod
    def stRNA_primary_transcript(cls):
        """A primary transcript encoding a small temporal mRNA (cls, SO:0000649). (SO:ke)
        (SO_0000648)
        """
        return _namespace_SO('SO_0000648')

    @classmethod
    def stRNA(cls):
        """Non-coding RNAs of about 21 nucleotides in length that regulate temporal development; first discovered in C. elegans. (cls, PMID:11081512)
        (SO_0000649)
        """
        return _namespace_SO('SO_0000649')

    @classmethod
    def small_subunit_rRNA(cls):
        """Ribosomal RNA transcript that structures the small subunit of the ribosome. (cls, SO:ke)
        (SO_0000650)
        """
        return _namespace_SO('SO_0000650')

    @classmethod
    def large_subunit_rRNA(cls):
        """Ribosomal RNA transcript that structures the large subunit of the ribosome. (cls, SO:ke)
        (SO_0000651)
        """
        return _namespace_SO('SO_0000651')

    @classmethod
    def rRNA_5S(cls):
        """5S ribosomal RNA (cls, 5S rRNA) is a component of the large ribosomal subunit in both prokaryotes and eukaryotes. In eukaryotes, it is synthesised by RNA polymerase III (the other eukaryotic rRNAs are cleaved from a 45S precursor synthesised by RNA polymerase I). In Xenopus oocytes, it has been shown that fingers 4-7 of the nine-zinc finger transcription factor TFIIIA can bind to the central region of 5S RNA. Thus, in addition to positively regulating 5S rRNA transcription, TFIIIA also stabilizes 5S rRNA until it is required for transcription. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00001)
        (SO_0000652)
        """
        return _namespace_SO('SO_0000652')

    @classmethod
    def rRNA_28S(cls):
        """A component of the large ribosomal subunit. (cls, SO:ke)
        (SO_0000653)
        """
        return _namespace_SO('SO_0000653')

    @classmethod
    def maxicircle_gene(cls):
        """A mitochondrial gene located in a maxicircle. (cls, SO:xp)
        (SO_0000654)
        """
        return _namespace_SO('SO_0000654')

    @classmethod
    def ncRNA(cls):
        """An RNA transcript that does not encode for a protein rather the RNA molecule is the gene product. (cls, SO:ke)
        (SO_0000655)
        """
        return _namespace_SO('SO_0000655')

    @classmethod
    def stRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000656)
        """
        return _namespace_SO('SO_0000656')

    @classmethod
    def repeat_region(cls):
        """A region of sequence containing one or more repeat units. (cls, SO:ke)
        (SO_0000657)
        """
        return _namespace_SO('SO_0000657')

    @classmethod
    def dispersed_repeat(cls):
        """A repeat that is located at dispersed sites in the genome. (cls, SO:ke)
        (SO_0000658)
        """
        return _namespace_SO('SO_0000658')

    @classmethod
    def tmRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000659)
        """
        return _namespace_SO('SO_0000659')

    @classmethod
    def DNA_invertase_target_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000660)
        """
        return _namespace_SO('SO_0000660')

    @classmethod
    def intron_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000661)
        """
        return _namespace_SO('SO_0000661')

    @classmethod
    def spliceosomal_intron(cls):
        """An intron which is spliced by the spliceosome. (cls, SO:ke)
        (SO_0000662)
        """
        return _namespace_SO('SO_0000662')

    @classmethod
    def tRNA_encoding(cls):
        """-- No comment or description provided. --
        (cls, SO_0000663)
        """
        return _namespace_SO('SO_0000663')

    @classmethod
    def introgressed_chromosome_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000664)
        """
        return _namespace_SO('SO_0000664')

    @classmethod
    def monocistronic_transcript(cls):
        """A transcript that is monocistronic. (cls, SO:xp)
        (SO_0000665)
        """
        return _namespace_SO('SO_0000665')

    @classmethod
    def mobile_intron(cls):
        """An intron (cls, mitochondrial, chloroplast, nuclear or prokaryotic) that encodes a double strand sequence specific endonuclease allowing for mobility. (SO:ke)
        (SO_0000666)
        """
        return _namespace_SO('SO_0000666')

    @classmethod
    def insertion(cls):
        """The sequence of one or more nucleotides added between two adjacent nucleotides in the sequence. (cls, SO:ke)
        (SO_0000667)
        """
        return _namespace_SO('SO_0000667')

    @classmethod
    def EST_match(cls):
        """A match against an EST sequence. (cls, SO:ke)
        (SO_0000668)
        """
        return _namespace_SO('SO_0000668')

    @classmethod
    def sequence_rearrangement_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000669)
        """
        return _namespace_SO('SO_0000669')

    @classmethod
    def chromosome_breakage_sequence(cls):
        """A sequence within the micronuclear DNA of ciliates at which chromosome breakage and telomere addition occurs during nuclear differentiation. (cls, SO:ma)
        (SO_0000670)
        """
        return _namespace_SO('SO_0000670')

    @classmethod
    def internal_eliminated_sequence(cls):
        """A sequence eliminated from the genome of ciliates during nuclear differentiation. (cls, SO:ma)
        (SO_0000671)
        """
        return _namespace_SO('SO_0000671')

    @classmethod
    def macronucleus_destined_segment(cls):
        """A sequence that is conserved, although rearranged relative to the micronucleus, in the macronucleus of a ciliate genome. (cls, SO:ma)
        (SO_0000672)
        """
        return _namespace_SO('SO_0000672')

    @classmethod
    def transcript(cls):
        """An RNA synthesized on a DNA or RNA template by an RNA polymerase. (cls, SO:ma)
        (SO_0000673)
        """
        return _namespace_SO('SO_0000673')

    @classmethod
    def non_canonical_splice_site(cls):
        """A splice site where the donor and acceptor sites differ from the canonical form. (cls, SO:ke)
        (SO_0000674)
        """
        return _namespace_SO('SO_0000674')

    @classmethod
    def canonical_splice_site(cls):
        """The major class of splice site with dinucleotides GT and AG for donor and acceptor sites, respectively. (cls, SO:ke)
        (SO_0000675)
        """
        return _namespace_SO('SO_0000675')

    @classmethod
    def canonical_three_prime_splice_site(cls):
        """The canonical 3' splice site has the sequence \"AG\". (cls, SO:ke)
        (SO_0000676)
        """
        return _namespace_SO('SO_0000676')

    @classmethod
    def canonical_five_prime_splice_site(cls):
        """The canonical 5' splice site has the sequence \"GT\". (cls, SO:ke)
        (SO_0000677)
        """
        return _namespace_SO('SO_0000677')

    @classmethod
    def non_canonical_three_prime_splice_site(cls):
        """A 3' splice site that does not have the sequence \"AG\". (cls, SO:ke)
        (SO_0000678)
        """
        return _namespace_SO('SO_0000678')

    @classmethod
    def non_canonical_five_prime_splice_site(cls):
        """A 5' splice site which does not have the sequence \"GT\". (cls, SO:ke)
        (SO_0000679)
        """
        return _namespace_SO('SO_0000679')

    @classmethod
    def non_canonical_start_codon(cls):
        """A start codon that is not the usual AUG sequence. (cls, SO:ke)
        (SO_0000680)
        """
        return _namespace_SO('SO_0000680')

    @classmethod
    def aberrant_processed_transcript(cls):
        """A transcript that has been processed \"incorrectly\", for example by the failure of splicing of one or more exons. (cls, SO:ke)
        (SO_0000681)
        """
        return _namespace_SO('SO_0000681')

    @classmethod
    def splicing_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000682)
        """
        return _namespace_SO('SO_0000682')

    @classmethod
    def exonic_splice_enhancer(cls):
        """Exonic splicing enhancers (cls, ESEs) facilitate exon definition by assisting in the recruitment of splicing factors to the adjacent intron. (http://www.ncbi.nlm.nih.gov:80/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=12403462&dopt=Abstract)
        (SO_0000683)
        """
        return _namespace_SO('SO_0000683')

    @classmethod
    def nuclease_sensitive_site(cls):
        """A region of nucleotide sequence targeted by a nuclease enzyme. (cls, SO:ma)
        (SO_0000684)
        """
        return _namespace_SO('SO_0000684')

    @classmethod
    def DNAseI_hypersensitive_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000685)
        """
        return _namespace_SO('SO_0000685')

    @classmethod
    def translocation_element(cls):
        """A chromosomal translocation whereby the chromosomes carrying non-homologous centromeres may be recovered independently. These chromosomes are described as translocation elements. This occurs for some translocations, particularly but not exclusively, reciprocal translocations. (cls, SO:ma)
        (SO_0000686)
        """
        return _namespace_SO('SO_0000686')

    @classmethod
    def deletion_junction(cls):
        """The space between two bases in a sequence which marks the position where a deletion has occurred. (cls, SO:ke)
        (SO_0000687)
        """
        return _namespace_SO('SO_0000687')

    @classmethod
    def golden_path(cls):
        """A set of subregions selected from sequence contigs which when concatenated form a nonredundant linear sequence. (cls, SO:ls)
        (SO_0000688)
        """
        return _namespace_SO('SO_0000688')

    @classmethod
    def cDNA_match(cls):
        """A match against cDNA sequence. (cls, SO:ke)
        (SO_0000689)
        """
        return _namespace_SO('SO_0000689')

    @classmethod
    def gene_with_polycistronic_transcript(cls):
        """A gene that encodes a polycistronic transcript. (cls, SO:xp)
        (SO_0000690)
        """
        return _namespace_SO('SO_0000690')

    @classmethod
    def cleaved_initiator_methionine(cls):
        """The initiator methionine that has been cleaved from a mature polypeptide sequence. (cls, EBIBS:GAR)
        (SO_0000691)
        """
        return _namespace_SO('SO_0000691')

    @classmethod
    def gene_with_dicistronic_transcript(cls):
        """A gene that encodes a dicistronic transcript. (cls, SO:xp)
        (SO_0000692)
        """
        return _namespace_SO('SO_0000692')

    @classmethod
    def gene_with_recoded_mRNA(cls):
        """A gene that encodes an mRNA that is recoded. (cls, SO:xp)
        (SO_0000693)
        """
        return _namespace_SO('SO_0000693')

    @classmethod
    def SNP(cls):
        """SNPs are single base pair positions in genomic DNA at which different sequence alternatives exist in normal individuals in some population(cls, s), wherein the least frequent variant has an abundance of 1% or greater. (SO:cb)
        (SO_0000694)
        """
        return _namespace_SO('SO_0000694')

    @classmethod
    def reagent(cls):
        """A sequence used in experiment. (cls, SO:ke)
        (SO_0000695)
        """
        return _namespace_SO('SO_0000695')

    @classmethod
    def oligo(cls):
        """A short oligonucleotide sequence, of length on the order of 10's of bases; either single or double stranded. (cls, SO:ma)
        (SO_0000696)
        """
        return _namespace_SO('SO_0000696')

    @classmethod
    def gene_with_stop_codon_read_through(cls):
        """A gene that encodes a transcript with stop codon readthrough. (cls, SO:xp)
        (SO_0000697)
        """
        return _namespace_SO('SO_0000697')

    @classmethod
    def gene_with_stop_codon_redefined_as_pyrrolysine(cls):
        """A gene encoding an mRNA that has the stop codon redefined as pyrrolysine. (cls, SO:xp)
        (SO_0000698)
        """
        return _namespace_SO('SO_0000698')

    @classmethod
    def junction(cls):
        """A sequence_feature with an extent of zero. (cls, SO:ke)
        (SO_0000699)
        """
        return _namespace_SO('SO_0000699')

    @classmethod
    def remark(cls):
        """A comment about the sequence. (cls, SO:ke)
        (SO_0000700)
        """
        return _namespace_SO('SO_0000700')

    @classmethod
    def possible_base_call_error(cls):
        """A region of sequence where the validity of the base calling is questionable. (cls, SO:ke)
        (SO_0000701)
        """
        return _namespace_SO('SO_0000701')

    @classmethod
    def possible_assembly_error(cls):
        """A region of sequence where there may have been an error in the assembly. (cls, SO:ke)
        (SO_0000702)
        """
        return _namespace_SO('SO_0000702')

    @classmethod
    def experimental_result_region(cls):
        """A region of sequence implicated in an experimental result. (cls, SO:ke)
        (SO_0000703)
        """
        return _namespace_SO('SO_0000703')

    @classmethod
    def gene(cls):
        """A region (cls, or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions. (SO:immuno_workshop)
        (SO_0000704)
        """
        return _namespace_SO('SO_0000704')

    @classmethod
    def tandem_repeat(cls):
        """Two or more adjcent copies of a region (cls, of length greater than 1). (SO:ke)
        (SO_0000705)
        """
        return _namespace_SO('SO_0000705')

    @classmethod
    def trans_splice_acceptor_site(cls):
        """The 3' splice site of the acceptor primary transcript. (cls, SO:ke)
        (SO_0000706)
        """
        return _namespace_SO('SO_0000706')

    @classmethod
    def trans_splice_donor_site(cls):
        """The 5' five prime splice site region of the donor RNA. (cls, SO:ke)
        (SO_0000707)
        """
        return _namespace_SO('SO_0000707')

    @classmethod
    def SL1_acceptor_site(cls):
        """A trans_splicing_acceptor_site which appends the 22nt SL1 RNA leader sequence to the 5' end of most mRNAs. (cls, SO:nlw)
        (SO_0000708)
        """
        return _namespace_SO('SO_0000708')

    @classmethod
    def SL2_acceptor_site(cls):
        """A trans_splicing_acceptor_site which appends the 22nt SL2 RNA leader sequence to the 5' end of mRNAs. SL2 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0000709)
        """
        return _namespace_SO('SO_0000709')

    @classmethod
    def gene_with_stop_codon_redefined_as_selenocysteine(cls):
        """A gene encoding an mRNA that has the stop codon redefined as selenocysteine. (cls, SO:xp)
        (SO_0000710)
        """
        return _namespace_SO('SO_0000710')

    @classmethod
    def gene_with_mRNA_recoded_by_translational_bypass(cls):
        """A gene with mRNA recoded by translational bypass. (cls, SO:xp)
        (SO_0000711)
        """
        return _namespace_SO('SO_0000711')

    @classmethod
    def gene_with_transcript_with_translational_frameshift(cls):
        """A gene encoding a transcript that has a translational frameshift. (cls, SO:xp)
        (SO_0000712)
        """
        return _namespace_SO('SO_0000712')

    @classmethod
    def DNA_motif(cls):
        """A motif that is active in the DNA form of the sequence. (cls, SO:ke)
        (SO_0000713)
        """
        return _namespace_SO('SO_0000713')

    @classmethod
    def nucleotide_motif(cls):
        """A region of nucleotide sequence corresponding to a known motif. (cls, SO:ke)
        (SO_0000714)
        """
        return _namespace_SO('SO_0000714')

    @classmethod
    def RNA_motif(cls):
        """A motif that is active in RNA sequence. (cls, SO:ke)
        (SO_0000715)
        """
        return _namespace_SO('SO_0000715')

    @classmethod
    def dicistronic_mRNA(cls):
        """An mRNA that has the quality dicistronic. (cls, SO:ke)
        (SO_0000716)
        """
        return _namespace_SO('SO_0000716')

    @classmethod
    def reading_frame(cls):
        """A nucleic acid sequence that when read as sequential triplets, has the potential of encoding a sequential string of amino acids. It need not contain the start or stop codon. (cls, SGD:rb)
        (SO_0000717)
        """
        return _namespace_SO('SO_0000717')

    @classmethod
    def blocked_reading_frame(cls):
        """A reading_frame that is interrupted by one or more stop codons; usually identified through intergenomic sequence comparisons. (cls, SGD:rb)
        (SO_0000718)
        """
        return _namespace_SO('SO_0000718')

    @classmethod
    def ultracontig(cls):
        """An ordered and oriented set of scaffolds based on somewhat weaker sets of inferential evidence such as one set of mate pair reads together with supporting evidence from ESTs or location of markers from SNP or microsatellite maps, or cytogenetic localization of contained markers. (cls, FB:WG)
        (SO_0000719)
        """
        return _namespace_SO('SO_0000719')

    @classmethod
    def foreign_transposable_element(cls):
        """A transposable element that is foreign. (cls, SO:ke)
        (SO_0000720)
        """
        return _namespace_SO('SO_0000720')

    @classmethod
    def gene_with_dicistronic_primary_transcript(cls):
        """A gene that encodes a dicistronic primary transcript. (cls, SO:xp)
        (SO_0000721)
        """
        return _namespace_SO('SO_0000721')

    @classmethod
    def gene_with_dicistronic_mRNA(cls):
        """A gene that encodes a polycistronic mRNA. (cls, SO:xp)
        (SO_0000722)
        """
        return _namespace_SO('SO_0000722')

    @classmethod
    def iDNA(cls):
        """Genomic sequence removed from the genome, as a normal event, by a process of recombination. (cls, SO:ma)
        (SO_0000723)
        """
        return _namespace_SO('SO_0000723')

    @classmethod
    def oriT(cls):
        """A region of a DNA molecule where transfer is initiated during the process of conjugation or mobilization. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000724)
        """
        return _namespace_SO('SO_0000724')

    @classmethod
    def transit_peptide(cls):
        """The transit_peptide is a short region at the N-terminus of the peptide that directs the protein to an organelle (cls, chloroplast, mitochondrion, microbody or cyanelle). (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0000725)
        """
        return _namespace_SO('SO_0000725')

    @classmethod
    def repeat_unit(cls):
        """The simplest repeated component of a repeat region. A single repeat. (cls, SO:ke)
        (SO_0000726)
        """
        return _namespace_SO('SO_0000726')

    @classmethod
    def CRM(cls):
        """A regulatory_region where more than 1 TF_binding_site together are regulatorily active. (cls, SO:SG)
        (SO_0000727)
        """
        return _namespace_SO('SO_0000727')

    @classmethod
    def intein(cls):
        """A region of a peptide that is able to excise itself and rejoin the remaining portions with a peptide bond. (cls, SO:ke)
        (SO_0000728)
        """
        return _namespace_SO('SO_0000728')

    @classmethod
    def intein_containing(cls):
        """An attribute of protein-coding genes where the initial protein product contains an intein. (cls, SO:ke)
        (SO_0000729)
        """
        return _namespace_SO('SO_0000729')

    @classmethod
    def gap(cls):
        """A gap in the sequence of known length. The unknown bases are filled in with N's. (cls, SO:ke)
        (SO_0000730)
        """
        return _namespace_SO('SO_0000730')

    @classmethod
    def fragmentary(cls):
        """An attribute to describe a feature that is incomplete. (cls, SO:ke)
        (SO_0000731)
        """
        return _namespace_SO('SO_0000731')

    @classmethod
    def predicted(cls):
        """An attribute describing an unverified region. (cls, SO:ke)
        (SO_0000732)
        """
        return _namespace_SO('SO_0000732')

    @classmethod
    def feature_attribute(cls):
        """An attribute describing a located_sequence_feature. (cls, SO:ke)
        (SO_0000733)
        """
        return _namespace_SO('SO_0000733')

    @classmethod
    def exemplar_mRNA(cls):
        """An exemplar is a representative cDNA sequence for each gene. The exemplar approach is a method that usually involves some initial clustering into gene groups and the subsequent selection of a representative from each gene group. (cls, http://mged.sourceforge.net/ontologies/MGEDontology.php)
        (SO_0000734)
        """
        return _namespace_SO('SO_0000734')

    @classmethod
    def sequence_location(cls):
        """-- No comment or description provided. --
        (cls, SO_0000735)
        """
        return _namespace_SO('SO_0000735')

    @classmethod
    def organelle_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000736)
        """
        return _namespace_SO('SO_0000736')

    @classmethod
    def mitochondrial_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000737)
        """
        return _namespace_SO('SO_0000737')

    @classmethod
    def nuclear_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000738)
        """
        return _namespace_SO('SO_0000738')

    @classmethod
    def nucleomorphic_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000739)
        """
        return _namespace_SO('SO_0000739')

    @classmethod
    def plastid_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000740)
        """
        return _namespace_SO('SO_0000740')

    @classmethod
    def kinetoplast(cls):
        """A kinetoplast is an interlocked network of thousands of minicircles and tens of maxi circles, located near the base of the flagellum of some protozoan species. (cls, PMID:8395055)
        (SO_0000741)
        """
        return _namespace_SO('SO_0000741')

    @classmethod
    def maxicircle(cls):
        """A maxicircle is a replicon, part of a kinetoplast, that contains open reading frames and replicates via a rolling circle method. (cls, PMID:8395055)
        (SO_0000742)
        """
        return _namespace_SO('SO_0000742')

    @classmethod
    def apicoplast_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000743)
        """
        return _namespace_SO('SO_0000743')

    @classmethod
    def chromoplast_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000744)
        """
        return _namespace_SO('SO_0000744')

    @classmethod
    def chloroplast_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000745)
        """
        return _namespace_SO('SO_0000745')

    @classmethod
    def cyanelle_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000746)
        """
        return _namespace_SO('SO_0000746')

    @classmethod
    def leucoplast_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000747)
        """
        return _namespace_SO('SO_0000747')

    @classmethod
    def proplastid_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000748)
        """
        return _namespace_SO('SO_0000748')

    @classmethod
    def plasmid_location(cls):
        """-- No comment or description provided. --
        (cls, SO_0000749)
        """
        return _namespace_SO('SO_0000749')

    @classmethod
    def amplification_origin(cls):
        """An origin_of_replication that is used for the amplification of a chromosomal nucleic acid sequence. (cls, SO:ma)
        (SO_0000750)
        """
        return _namespace_SO('SO_0000750')

    @classmethod
    def proviral_location(cls):
        """-- No comment or description provided. --
        (cls, SO_0000751)
        """
        return _namespace_SO('SO_0000751')

    @classmethod
    def gene_group_regulatory_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000752)
        """
        return _namespace_SO('SO_0000752')

    @classmethod
    def clone_insert(cls):
        """The region of sequence that has been inserted and is being propagated by the clone. (cls, SO:ke)
        (SO_0000753)
        """
        return _namespace_SO('SO_0000753')

    @classmethod
    def lambda_vector(cls):
        """The lambda bacteriophage is the vector for the linear lambda clone. The genes involved in the lysogenic pathway are removed from the from the viral DNA. Up to 25 kb of foreign DNA can then be inserted into the lambda genome. (cls, ISBN:0-1767-2380-8)
        (SO_0000754)
        """
        return _namespace_SO('SO_0000754')

    @classmethod
    def plasmid_vector(cls):
        """-- No comment or description provided. --
        (cls, SO_0000755)
        """
        return _namespace_SO('SO_0000755')

    @classmethod
    def cDNA(cls):
        """DNA synthesized by reverse transcriptase using RNA as a template. (cls, SO:ma)
        (SO_0000756)
        """
        return _namespace_SO('SO_0000756')

    @classmethod
    def single_stranded_cDNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000757)
        """
        return _namespace_SO('SO_0000757')

    @classmethod
    def double_stranded_cDNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000758)
        """
        return _namespace_SO('SO_0000758')

    @classmethod
    def plasmid_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000759)
        """
        return _namespace_SO('SO_0000759')

    @classmethod
    def YAC_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000760)
        """
        return _namespace_SO('SO_0000760')

    @classmethod
    def phagemid_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000761)
        """
        return _namespace_SO('SO_0000761')

    @classmethod
    def PAC_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000762)
        """
        return _namespace_SO('SO_0000762')

    @classmethod
    def fosmid_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000763)
        """
        return _namespace_SO('SO_0000763')

    @classmethod
    def BAC_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000764)
        """
        return _namespace_SO('SO_0000764')

    @classmethod
    def cosmid_clone(cls):
        """-- No comment or description provided. --
        (cls, SO_0000765)
        """
        return _namespace_SO('SO_0000765')

    @classmethod
    def pyrrolysyl_tRNA(cls):
        """A tRNA sequence that has a pyrrolysine anticodon, and a 3' pyrrolysine binding region. (cls, SO:ke)
        (SO_0000766)
        """
        return _namespace_SO('SO_0000766')

    @classmethod
    def episome(cls):
        """A plasmid that may integrate with a chromosome. (cls, SO:ma)
        (SO_0000768)
        """
        return _namespace_SO('SO_0000768')

    @classmethod
    def tmRNA_coding_piece(cls):
        """The region of a two-piece tmRNA that bears the reading frame encoding the proteolysis tag. The tmRNA gene undergoes circular permutation in some groups of bacteria. Processing of the transcripts from such a gene leaves the mature tmRNA in two pieces, base-paired together. (cls, doi:10.1093/nar/gkh795, Indiana:kw, issn:1362-4962)
        (SO_0000769)
        """
        return _namespace_SO('SO_0000769')

    @classmethod
    def tmRNA_acceptor_piece(cls):
        """The acceptor region of a two-piece tmRNA that when mature is charged at its 3' end with alanine. The tmRNA gene undergoes circular permutation in some groups of bacteria; processing of the transcripts from such a gene leaves the mature tmRNA in two pieces, base-paired together. (cls, doi:10.1093/nar/gkh795, Indiana:kw)
        (SO_0000770)
        """
        return _namespace_SO('SO_0000770')

    @classmethod
    def QTL(cls):
        """A quantitative trait locus (cls, QTL) is a polymorphic locus which contains alleles that differentially affect the expression of a continuously distributed phenotypic trait. Usually it is a marker described by statistical association to quantitative variation in the particular phenotypic trait that is thought to be controlled by the cumulative action of alleles at multiple loci. (http://rgd.mcw.edu/tu/qtls/)
        (SO_0000771)
        """
        return _namespace_SO('SO_0000771')

    @classmethod
    def genomic_island(cls):
        """A genomic island is an integrated mobile genetic element, characterized by size (cls, over 10 Kb). It that has features that suggest a foreign origin. These can include nucleotide distribution (oligonucleotides signature, CG content etc.) that differs from the bulk of the chromosome and/or genes suggesting DNA mobility. (Phigo:at, SO:ke)
        (SO_0000772)
        """
        return _namespace_SO('SO_0000772')

    @classmethod
    def pathogenic_island(cls):
        """Mobile genetic elements that contribute to rapid changes in virulence potential. They are present on the genomes of pathogenic strains but absent from the genomes of non pathogenic members of the same or related species. (cls, SO:ke)
        (SO_0000773)
        """
        return _namespace_SO('SO_0000773')

    @classmethod
    def metabolic_island(cls):
        """A transmissible element containing genes involved in metabolism, analogous to the pathogenicity islands of gram negative bacteria. (cls, SO:ke)
        (SO_0000774)
        """
        return _namespace_SO('SO_0000774')

    @classmethod
    def adaptive_island(cls):
        """An adaptive island is a genomic island that provides an adaptive advantage to the host. (cls, SO:ke)
        (SO_0000775)
        """
        return _namespace_SO('SO_0000775')

    @classmethod
    def symbiosis_island(cls):
        """A transmissible element containing genes involved in symbiosis, analogous to the pathogenicity islands of gram negative bacteria. (cls, SO:ke)
        (SO_0000776)
        """
        return _namespace_SO('SO_0000776')

    @classmethod
    def pseudogenic_rRNA(cls):
        """A non functional descendent of an rRNA. (cls, SO:ke)
        (SO_0000777)
        """
        return _namespace_SO('SO_0000777')

    @classmethod
    def pseudogenic_tRNA(cls):
        """A non functional descendent of a tRNA. (cls, SO:ke)
        (SO_0000778)
        """
        return _namespace_SO('SO_0000778')

    @classmethod
    def engineered_episome(cls):
        """An episome that is engineered. (cls, SO:xp)
        (SO_0000779)
        """
        return _namespace_SO('SO_0000779')

    @classmethod
    def transposable_element_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000780)
        """
        return _namespace_SO('SO_0000780')

    @classmethod
    def transgenic(cls):
        """Attribute describing sequence that has been integrated with foreign sequence. (cls, SO:ke)
        (SO_0000781)
        """
        return _namespace_SO('SO_0000781')

    @classmethod
    def natural(cls):
        """An attribute describing a feature that occurs in nature. (cls, SO:ke)
        (SO_0000782)
        """
        return _namespace_SO('SO_0000782')

    @classmethod
    def engineered(cls):
        """An attribute to describe a region that was modified in vitro. (cls, SO:ke)
        (SO_0000783)
        """
        return _namespace_SO('SO_0000783')

    @classmethod
    def foreign(cls):
        """An attribute to describe a region from another species. (cls, SO:ke)
        (SO_0000784)
        """
        return _namespace_SO('SO_0000784')

    @classmethod
    def cloned_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000785)
        """
        return _namespace_SO('SO_0000785')

    @classmethod
    def reagent_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000786)
        """
        return _namespace_SO('SO_0000786')

    @classmethod
    def clone_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000787)
        """
        return _namespace_SO('SO_0000787')

    @classmethod
    def cloned(cls):
        """-- No comment or description provided. --
        (cls, SO_0000788)
        """
        return _namespace_SO('SO_0000788')

    @classmethod
    def validated(cls):
        """An attribute to describe a feature that has been proven. (cls, SO:ke)
        (SO_0000789)
        """
        return _namespace_SO('SO_0000789')

    @classmethod
    def invalidated(cls):
        """An attribute describing a feature that is invalidated. (cls, SO:ke)
        (SO_0000790)
        """
        return _namespace_SO('SO_0000790')

    @classmethod
    def cloned_genomic(cls):
        """-- No comment or description provided. --
        (cls, SO_0000791)
        """
        return _namespace_SO('SO_0000791')

    @classmethod
    def cloned_cDNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000792)
        """
        return _namespace_SO('SO_0000792')

    @classmethod
    def engineered_DNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000793)
        """
        return _namespace_SO('SO_0000793')

    @classmethod
    def engineered_rescue_region(cls):
        """A rescue region that is engineered. (cls, SO:xp)
        (SO_0000794)
        """
        return _namespace_SO('SO_0000794')

    @classmethod
    def rescue_mini_gene(cls):
        """A mini_gene that rescues. (cls, SO:xp)
        (SO_0000795)
        """
        return _namespace_SO('SO_0000795')

    @classmethod
    def transgenic_transposable_element(cls):
        """TE that has been modified in vitro, including insertion of DNA derived from a source other than the originating TE. (cls, FB:mc)
        (SO_0000796)
        """
        return _namespace_SO('SO_0000796')

    @classmethod
    def natural_transposable_element(cls):
        """TE that exists (cls, or existed) in nature. (FB:mc)
        (SO_0000797)
        """
        return _namespace_SO('SO_0000797')

    @classmethod
    def engineered_transposable_element(cls):
        """TE that has been modified by manipulations in vitro. (cls, FB:mc)
        (SO_0000798)
        """
        return _namespace_SO('SO_0000798')

    @classmethod
    def engineered_foreign_transposable_element(cls):
        """A transposable_element that is engineered and foreign. (cls, FB:mc)
        (SO_0000799)
        """
        return _namespace_SO('SO_0000799')

    @classmethod
    def engineered_region(cls):
        """A region that is engineered. (cls, SO:xp)
        (SO_0000804)
        """
        return _namespace_SO('SO_0000804')

    @classmethod
    def engineered_foreign_region(cls):
        """A region that is engineered and foreign. (cls, SO:xp)
        (SO_0000805)
        """
        return _namespace_SO('SO_0000805')

    @classmethod
    def fusion(cls):
        """-- No comment or description provided. --
        (cls, SO_0000806)
        """
        return _namespace_SO('SO_0000806')

    @classmethod
    def engineered_tag(cls):
        """A tag that is engineered. (cls, SO:xp)
        (SO_0000807)
        """
        return _namespace_SO('SO_0000807')

    @classmethod
    def validated_cDNA_clone(cls):
        """A cDNA clone that has been validated. (cls, SO:xp)
        (SO_0000808)
        """
        return _namespace_SO('SO_0000808')

    @classmethod
    def invalidated_cDNA_clone(cls):
        """A cDNA clone that is invalid. (cls, SO:xp)
        (SO_0000809)
        """
        return _namespace_SO('SO_0000809')

    @classmethod
    def chimeric_cDNA_clone(cls):
        """A cDNA clone invalidated because it is chimeric. (cls, SO:xp)
        (SO_0000810)
        """
        return _namespace_SO('SO_0000810')

    @classmethod
    def genomically_contaminated_cDNA_clone(cls):
        """A cDNA clone invalidated by genomic contamination. (cls, SO:xp)
        (SO_0000811)
        """
        return _namespace_SO('SO_0000811')

    @classmethod
    def polyA_primed_cDNA_clone(cls):
        """A cDNA clone invalidated by polyA priming. (cls, SO:xp)
        (SO_0000812)
        """
        return _namespace_SO('SO_0000812')

    @classmethod
    def partially_processed_cDNA_clone(cls):
        """A cDNA invalidated clone by partial processing. (cls, SO:xp)
        (SO_0000813)
        """
        return _namespace_SO('SO_0000813')

    @classmethod
    def rescue(cls):
        """An attribute describing a region's ability, when introduced to a mutant organism, to re-establish (cls, rescue) a phenotype. (SO:ke)
        (SO_0000814)
        """
        return _namespace_SO('SO_0000814')

    @classmethod
    def mini_gene(cls):
        """By definition, minigenes are short open-reading frames (cls, ORF), usually encoding approximately 9 to 20 amino acids, which are expressed in vivo (as distinct from being synthesized as peptide or protein ex vivo and subsequently injected). The in vivo synthesis confers a distinct advantage: the expressed sequences can enter both antigen presentation pathways, MHC I (inducing CD8+ T- cells, which are usually cytotoxic T-lymphocytes (CTL)) and MHC II (inducing CD4+ T-cells, usually 'T-helpers' (Th)); and can encounter B-cells, inducing antibody responses. Three main vector approaches have been used to deliver minigenes: viral vectors, bacterial vectors and plasmid DNA. (PMID:15992143)
        (SO_0000815)
        """
        return _namespace_SO('SO_0000815')

    @classmethod
    def rescue_gene(cls):
        """A gene that rescues. (cls, SO:xp)
        (SO_0000816)
        """
        return _namespace_SO('SO_0000816')

    @classmethod
    def wild_type(cls):
        """An attribute describing sequence with the genotype found in nature and/or standard laboratory stock. (cls, SO:ke)
        (SO_0000817)
        """
        return _namespace_SO('SO_0000817')

    @classmethod
    def wild_type_rescue_gene(cls):
        """A gene that rescues. (cls, SO:xp)
        (SO_0000818)
        """
        return _namespace_SO('SO_0000818')

    @classmethod
    def mitochondrial_chromosome(cls):
        """A chromosome originating in a mitochondria. (cls, SO:xp)
        (SO_0000819)
        """
        return _namespace_SO('SO_0000819')

    @classmethod
    def chloroplast_chromosome(cls):
        """A chromosome originating in a chloroplast. (cls, SO:xp)
        (SO_0000820)
        """
        return _namespace_SO('SO_0000820')

    @classmethod
    def chromoplast_chromosome(cls):
        """A chromosome originating in a chromoplast. (cls, SO:xp)
        (SO_0000821)
        """
        return _namespace_SO('SO_0000821')

    @classmethod
    def cyanelle_chromosome(cls):
        """A chromosome originating in a cyanelle. (cls, SO:xp)
        (SO_0000822)
        """
        return _namespace_SO('SO_0000822')

    @classmethod
    def leucoplast_chromosome(cls):
        """A chromosome with origin in a leucoplast. (cls, SO:xp)
        (SO_0000823)
        """
        return _namespace_SO('SO_0000823')

    @classmethod
    def macronuclear_chromosome(cls):
        """A chromosome originating in a macronucleus. (cls, SO:xp)
        (SO_0000824)
        """
        return _namespace_SO('SO_0000824')

    @classmethod
    def micronuclear_chromosome(cls):
        """A chromosome originating in a micronucleus. (cls, SO:xp)
        (SO_0000825)
        """
        return _namespace_SO('SO_0000825')

    @classmethod
    def nuclear_chromosome(cls):
        """A chromosome originating in a nucleus. (cls, SO:xp)
        (SO_0000828)
        """
        return _namespace_SO('SO_0000828')

    @classmethod
    def nucleomorphic_chromosome(cls):
        """A chromosome originating in a nucleomorph. (cls, SO:xp)
        (SO_0000829)
        """
        return _namespace_SO('SO_0000829')

    @classmethod
    def chromosome_part(cls):
        """A region of a chromosome. (cls, SO:ke)
        (SO_0000830)
        """
        return _namespace_SO('SO_0000830')

    @classmethod
    def gene_member_region(cls):
        """A region of a gene. (cls, SO:ke)
        (SO_0000831)
        """
        return _namespace_SO('SO_0000831')

    @classmethod
    def promoter_region(cls):
        """A region of sequence which is part of a promoter. (cls, SO:ke)
        (SO_0000832)
        """
        return _namespace_SO('SO_0000832')

    @classmethod
    def transcript_region(cls):
        """A region of a transcript. (cls, SO:ke)
        (SO_0000833)
        """
        return _namespace_SO('SO_0000833')

    @classmethod
    def mature_transcript_region(cls):
        """A region of a mature transcript. (cls, SO:ke)
        (SO_0000834)
        """
        return _namespace_SO('SO_0000834')

    @classmethod
    def primary_transcript_region(cls):
        """A part of a primary transcript. (cls, SO:ke)
        (SO_0000835)
        """
        return _namespace_SO('SO_0000835')

    @classmethod
    def mRNA_region(cls):
        """A region of an mRNA. (cls, SO:cb)
        (SO_0000836)
        """
        return _namespace_SO('SO_0000836')

    @classmethod
    def UTR_region(cls):
        """A region of UTR. (cls, SO:ke)
        (SO_0000837)
        """
        return _namespace_SO('SO_0000837')

    @classmethod
    def rRNA_primary_transcript_region(cls):
        """A region of an rRNA primary transcript. (cls, SO:ke)
        (SO_0000838)
        """
        return _namespace_SO('SO_0000838')

    @classmethod
    def polypeptide_region(cls):
        """Biological sequence region that can be assigned to a specific subsequence of a polypeptide. (cls, SO:GAR, SO:ke)
        (SO_0000839)
        """
        return _namespace_SO('SO_0000839')

    @classmethod
    def repeat_component(cls):
        """A region of a repeated sequence. (cls, SO:ke)
        (SO_0000840)
        """
        return _namespace_SO('SO_0000840')

    @classmethod
    def spliceosomal_intron_region(cls):
        """A region within an intron. (cls, SO:ke)
        (SO_0000841)
        """
        return _namespace_SO('SO_0000841')

    @classmethod
    def gene_component_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000842)
        """
        return _namespace_SO('SO_0000842')

    @classmethod
    def bacterial_RNApol_promoter_region(cls):
        """A region which is part of a bacterial RNA polymerase promoter. (cls, SO:ke)
        (SO_0000843)
        """
        return _namespace_SO('SO_0000843')

    @classmethod
    def RNApol_II_promoter_region(cls):
        """A region of sequence which is a promoter for RNA polymerase II. (cls, SO:ke)
        (SO_0000844)
        """
        return _namespace_SO('SO_0000844')

    @classmethod
    def RNApol_III_promoter_type_1_region(cls):
        """A region of sequence which is a promoter for RNA polymerase III type 1. (cls, SO:ke)
        (SO_0000845)
        """
        return _namespace_SO('SO_0000845')

    @classmethod
    def RNApol_III_promoter_type_2_region(cls):
        """A region of sequence which is a promoter for RNA polymerase III type 2. (cls, SO:ke)
        (SO_0000846)
        """
        return _namespace_SO('SO_0000846')

    @classmethod
    def tmRNA_region(cls):
        """A region of a tmRNA. (cls, SO:cb)
        (SO_0000847)
        """
        return _namespace_SO('SO_0000847')

    @classmethod
    def LTR_component(cls):
        """-- No comment or description provided. --
        (cls, SO_0000848)
        """
        return _namespace_SO('SO_0000848')

    @classmethod
    def three_prime_LTR_component(cls):
        """-- No comment or description provided. --
        (cls, SO_0000849)
        """
        return _namespace_SO('SO_0000849')

    @classmethod
    def five_prime_LTR_component(cls):
        """-- No comment or description provided. --
        (cls, SO_0000850)
        """
        return _namespace_SO('SO_0000850')

    @classmethod
    def CDS_region(cls):
        """A region of a CDS. (cls, SO:cb)
        (SO_0000851)
        """
        return _namespace_SO('SO_0000851')

    @classmethod
    def exon_region(cls):
        """A region of an exon. (cls, RSC:cb)
        (SO_0000852)
        """
        return _namespace_SO('SO_0000852')

    @classmethod
    def homologous_region(cls):
        """A region that is homologous to another region. (cls, SO:ke)
        (SO_0000853)
        """
        return _namespace_SO('SO_0000853')

    @classmethod
    def paralogous_region(cls):
        """A homologous_region that is paralogous to another region. (cls, SO:ke)
        (SO_0000854)
        """
        return _namespace_SO('SO_0000854')

    @classmethod
    def orthologous_region(cls):
        """A homologous_region that is orthologous to another region. (cls, SO:ke)
        (SO_0000855)
        """
        return _namespace_SO('SO_0000855')

    @classmethod
    def conserved(cls):
        """-- No comment or description provided. --
        (cls, SO_0000856)
        """
        return _namespace_SO('SO_0000856')

    @classmethod
    def homologous(cls):
        """Similarity due to common ancestry. (cls, SO:ke)
        (SO_0000857)
        """
        return _namespace_SO('SO_0000857')

    @classmethod
    def orthologous(cls):
        """An attribute describing a kind of homology where divergence occured after a speciation event. (cls, SO:ke)
        (SO_0000858)
        """
        return _namespace_SO('SO_0000858')

    @classmethod
    def paralogous(cls):
        """An attribute describing a kind of homology where divergence occurred after a duplication event. (cls, SO:ke)
        (SO_0000859)
        """
        return _namespace_SO('SO_0000859')

    @classmethod
    def syntenic(cls):
        """Attribute describing sequence regions occurring in same order on chromosome of different species. (cls, SO:ke)
        (SO_0000860)
        """
        return _namespace_SO('SO_0000860')

    @classmethod
    def capped_primary_transcript(cls):
        """A primary transcript that is capped. (cls, SO:xp)
        (SO_0000861)
        """
        return _namespace_SO('SO_0000861')

    @classmethod
    def capped_mRNA(cls):
        """An mRNA that is capped. (cls, SO:xp)
        (SO_0000862)
        """
        return _namespace_SO('SO_0000862')

    @classmethod
    def mRNA_attribute(cls):
        """An attribute describing an mRNA feature. (cls, SO:ke)
        (SO_0000863)
        """
        return _namespace_SO('SO_0000863')

    @classmethod
    def exemplar(cls):
        """An attribute describing a sequence is representative of a class of similar sequences. (cls, SO:ke)
        (SO_0000864)
        """
        return _namespace_SO('SO_0000864')

    @classmethod
    def frameshift(cls):
        """An attribute describing a sequence that contains a mutation involving the deletion or insertion of one or more bases, where this number is not divisible by 3. (cls, SO:ke)
        (SO_0000865)
        """
        return _namespace_SO('SO_0000865')

    @classmethod
    def minus_1_frameshift(cls):
        """A frameshift caused by deleting one base. (cls, SO:ke)
        (SO_0000866)
        """
        return _namespace_SO('SO_0000866')

    @classmethod
    def minus_2_frameshift(cls):
        """A frameshift caused by deleting two bases. (cls, SO:ke)
        (SO_0000867)
        """
        return _namespace_SO('SO_0000867')

    @classmethod
    def plus_1_frameshift(cls):
        """A frameshift caused by inserting one base. (cls, SO:ke)
        (SO_0000868)
        """
        return _namespace_SO('SO_0000868')

    @classmethod
    def plus_2_framshift(cls):
        """A frameshift caused by inserting two bases. (cls, SO:ke)
        (SO_0000869)
        """
        return _namespace_SO('SO_0000869')

    @classmethod
    def trans_spliced(cls):
        """An attribute describing transcript sequence that is created by splicing exons from diferent genes. (cls, SO:ke)
        (SO_0000870)
        """
        return _namespace_SO('SO_0000870')

    @classmethod
    def polyadenylated_mRNA(cls):
        """An mRNA that is polyadenylated. (cls, SO:xp)
        (SO_0000871)
        """
        return _namespace_SO('SO_0000871')

    @classmethod
    def trans_spliced_mRNA(cls):
        """An mRNA that is trans-spliced. (cls, SO:xp)
        (SO_0000872)
        """
        return _namespace_SO('SO_0000872')

    @classmethod
    def edited_transcript(cls):
        """A transcript that is edited. (cls, SO:ke)
        (SO_0000873)
        """
        return _namespace_SO('SO_0000873')

    @classmethod
    def edited_transcript_by_A_to_I_substitution(cls):
        """A transcript that has been edited by A to I substitution. (cls, SO:ke)
        (SO_0000874)
        """
        return _namespace_SO('SO_0000874')

    @classmethod
    def bound_by_protein(cls):
        """An attribute describing a sequence that is bound by a protein. (cls, SO:ke)
        (SO_0000875)
        """
        return _namespace_SO('SO_0000875')

    @classmethod
    def bound_by_nucleic_acid(cls):
        """An attribute describing a sequence that is bound by a nucleic acid. (cls, SO:ke)
        (SO_0000876)
        """
        return _namespace_SO('SO_0000876')

    @classmethod
    def alternatively_spliced(cls):
        """An attribute describing a situation where a gene may encode for more than 1 transcript. (cls, SO:ke)
        (SO_0000877)
        """
        return _namespace_SO('SO_0000877')

    @classmethod
    def monocistronic(cls):
        """An attribute describing a sequence that contains the code for one gene product. (cls, SO:ke)
        (SO_0000878)
        """
        return _namespace_SO('SO_0000878')

    @classmethod
    def dicistronic(cls):
        """An attribute describing a sequence that contains the code for two gene products. (cls, SO:ke)
        (SO_0000879)
        """
        return _namespace_SO('SO_0000879')

    @classmethod
    def polycistronic(cls):
        """An attribute describing a sequence that contains the code for more than one gene product. (cls, SO:ke)
        (SO_0000880)
        """
        return _namespace_SO('SO_0000880')

    @classmethod
    def recoded(cls):
        """An attribute describing an mRNA sequence that has been reprogrammed at translation, causing localized alterations. (cls, SO:ke)
        (SO_0000881)
        """
        return _namespace_SO('SO_0000881')

    @classmethod
    def codon_redefined(cls):
        """An attribute describing the alteration of codon meaning. (cls, SO:ke)
        (SO_0000882)
        """
        return _namespace_SO('SO_0000882')

    @classmethod
    def stop_codon_read_through(cls):
        """A stop codon redefined to be a new amino acid. (cls, SO:ke)
        (SO_0000883)
        """
        return _namespace_SO('SO_0000883')

    @classmethod
    def stop_codon_redefined_as_pyrrolysine(cls):
        """A stop codon redefined to be the new amino acid, pyrrolysine. (cls, SO:ke)
        (SO_0000884)
        """
        return _namespace_SO('SO_0000884')

    @classmethod
    def stop_codon_redefined_as_selenocysteine(cls):
        """A stop codon redefined to be the new amino acid, selenocysteine. (cls, SO:ke)
        (SO_0000885)
        """
        return _namespace_SO('SO_0000885')

    @classmethod
    def recoded_by_translational_bypass(cls):
        """Recoded mRNA where a block of nucleotides is not translated. (cls, SO:ke)
        (SO_0000886)
        """
        return _namespace_SO('SO_0000886')

    @classmethod
    def translationally_frameshifted(cls):
        """Recoding by frameshifting a particular site. (cls, SO:ke)
        (SO_0000887)
        """
        return _namespace_SO('SO_0000887')

    @classmethod
    def maternally_imprinted_gene(cls):
        """A gene that is maternally_imprinted. (cls, SO:xp)
        (SO_0000888)
        """
        return _namespace_SO('SO_0000888')

    @classmethod
    def paternally_imprinted_gene(cls):
        """A gene that is paternally imprinted. (cls, SO:xp)
        (SO_0000889)
        """
        return _namespace_SO('SO_0000889')

    @classmethod
    def post_translationally_regulated_gene(cls):
        """A gene that is post translationally regulated. (cls, SO:xp)
        (SO_0000890)
        """
        return _namespace_SO('SO_0000890')

    @classmethod
    def negatively_autoregulated_gene(cls):
        """A gene that is negatively autoreguated. (cls, SO:xp)
        (SO_0000891)
        """
        return _namespace_SO('SO_0000891')

    @classmethod
    def positively_autoregulated_gene(cls):
        """A gene that is positively autoregulated. (cls, SO:xp)
        (SO_0000892)
        """
        return _namespace_SO('SO_0000892')

    @classmethod
    def silenced(cls):
        """An attribute describing an epigenetic process where a gene is inactivated at transcriptional or translational level. (cls, SO:ke)
        (SO_0000893)
        """
        return _namespace_SO('SO_0000893')

    @classmethod
    def silenced_by_DNA_modification(cls):
        """An attribute describing an epigenetic process where a gene is inactivated by DNA modifications, resulting in repression of transcription. (cls, SO:ke)
        (SO_0000894)
        """
        return _namespace_SO('SO_0000894')

    @classmethod
    def silenced_by_DNA_methylation(cls):
        """An attribute describing an epigenetic process where a gene is inactivated by DNA methylation, resulting in repression of transcription. (cls, SO:ke)
        (SO_0000895)
        """
        return _namespace_SO('SO_0000895')

    @classmethod
    def translationally_regulated_gene(cls):
        """A gene that is translationally regulated. (cls, SO:xp)
        (SO_0000896)
        """
        return _namespace_SO('SO_0000896')

    @classmethod
    def allelically_excluded_gene(cls):
        """A gene that is allelically_excluded. (cls, SO:xp)
        (SO_0000897)
        """
        return _namespace_SO('SO_0000897')

    @classmethod
    def epigenetically_modified_gene(cls):
        """A gene that is epigenetically modified. (cls, SO:ke)
        (SO_0000898)
        """
        return _namespace_SO('SO_0000898')

    @classmethod
    def nuclear_mitochondrial(cls):
        """An attribute describing a nuclear pseudogene of a mitochndrial gene. (cls, SO:ke)
        (SO_0000899)
        """
        return _namespace_SO('SO_0000899')

    @classmethod
    def processed(cls):
        """An attribute describing a pseudogene where by an mRNA was retrotransposed. The mRNA sequence is transcribed back into the genome, lacking introns and promotors, but often including a polyA tail. (cls, SO:ke)
        (SO_0000900)
        """
        return _namespace_SO('SO_0000900')

    @classmethod
    def unequally_crossed_over(cls):
        """An attribute describing a pseudogene that was created by tandem duplication and unequal crossing over during recombination. (cls, SO:ke)
        (SO_0000901)
        """
        return _namespace_SO('SO_0000901')

    @classmethod
    def transgene(cls):
        """A transgene is a gene that has been transferred naturally or by any of a number of genetic engineering techniques from one organism to another. (cls, SO:xp)
        (SO_0000902)
        """
        return _namespace_SO('SO_0000902')

    @classmethod
    def endogenous_retroviral_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_0000903)
        """
        return _namespace_SO('SO_0000903')

    @classmethod
    def rearranged_at_DNA_level(cls):
        """An attribute to describe the sequence of a feature, where the DNA is rearranged. (cls, SO:ke)
        (SO_0000904)
        """
        return _namespace_SO('SO_0000904')

    @classmethod
    def status(cls):
        """An attribute describing the status of a feature, based on the available evidence. (cls, SO:ke)
        (SO_0000905)
        """
        return _namespace_SO('SO_0000905')

    @classmethod
    def independently_known(cls):
        """Attribute to describe a feature that is independently known - not predicted. (cls, SO:ke)
        (SO_0000906)
        """
        return _namespace_SO('SO_0000906')

    @classmethod
    def supported_by_sequence_similarity(cls):
        """An attribute to describe a feature that has been predicted using sequence similarity techniques. (cls, SO:ke)
        (SO_0000907)
        """
        return _namespace_SO('SO_0000907')

    @classmethod
    def supported_by_domain_match(cls):
        """An attribute to describe a feature that has been predicted using sequence similarity of a known domain. (cls, SO:ke)
        (SO_0000908)
        """
        return _namespace_SO('SO_0000908')

    @classmethod
    def supported_by_EST_or_cDNA(cls):
        """An attribute to describe a feature that has been predicted using sequence similarity to EST or cDNA data. (cls, SO:ke)
        (SO_0000909)
        """
        return _namespace_SO('SO_0000909')

    @classmethod
    def orphan(cls):
        """-- No comment or description provided. --
        (cls, SO_0000910)
        """
        return _namespace_SO('SO_0000910')

    @classmethod
    def predicted_by_ab_initio_computation(cls):
        """An attribute describing a feature that is predicted by a computer program that did not rely on sequence similarity. (cls, SO:ke)
        (SO_0000911)
        """
        return _namespace_SO('SO_0000911')

    @classmethod
    def asx_turn(cls):
        """A motif of three consecutive residues and one H-bond in which: residue(cls, i) is Aspartate or Asparagine (Asx), the side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2). (http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0000912)
        """
        return _namespace_SO('SO_0000912')

    @classmethod
    def cloned_cDNA_insert(cls):
        """A clone insert made from cDNA. (cls, SO:xp)
        (SO_0000913)
        """
        return _namespace_SO('SO_0000913')

    @classmethod
    def cloned_genomic_insert(cls):
        """A clone insert made from genomic DNA. (cls, SO:xp)
        (SO_0000914)
        """
        return _namespace_SO('SO_0000914')

    @classmethod
    def engineered_insert(cls):
        """A clone insert that is engineered. (cls, SO:xp)
        (SO_0000915)
        """
        return _namespace_SO('SO_0000915')

    @classmethod
    def edit_operation(cls):
        """-- No comment or description provided. --
        (cls, SO_0000916)
        """
        return _namespace_SO('SO_0000916')

    @classmethod
    def insert_U(cls):
        """An edit to insert a U. (cls, SO:ke)
        (SO_0000917)
        """
        return _namespace_SO('SO_0000917')

    @classmethod
    def delete_U(cls):
        """An edit to delete a uridine. (cls, SO:ke)
        (SO_0000918)
        """
        return _namespace_SO('SO_0000918')

    @classmethod
    def substitute_A_to_I(cls):
        """An edit to substitute an I for an A. (cls, SO:ke)
        (SO_0000919)
        """
        return _namespace_SO('SO_0000919')

    @classmethod
    def insert_C(cls):
        """An edit to insert a cytidine. (cls, SO:ke)
        (SO_0000920)
        """
        return _namespace_SO('SO_0000920')

    @classmethod
    def insert_dinucleotide(cls):
        """An edit to insert a dinucleotide. (cls, SO:ke)
        (SO_0000921)
        """
        return _namespace_SO('SO_0000921')

    @classmethod
    def substitute_C_to_U(cls):
        """An edit to substitute an U for a C. (cls, SO:ke)
        (SO_0000922)
        """
        return _namespace_SO('SO_0000922')

    @classmethod
    def insert_G(cls):
        """An edit to insert a G. (cls, SO:ke)
        (SO_0000923)
        """
        return _namespace_SO('SO_0000923')

    @classmethod
    def insert_GC(cls):
        """An edit to insert a GC dinucleotide. (cls, SO:ke)
        (SO_0000924)
        """
        return _namespace_SO('SO_0000924')

    @classmethod
    def insert_GU(cls):
        """An edit to insert a GU dinucleotide. (cls, SO:ke)
        (SO_0000925)
        """
        return _namespace_SO('SO_0000925')

    @classmethod
    def insert_CU(cls):
        """An edit to insert a CU dinucleotide. (cls, SO:ke)
        (SO_0000926)
        """
        return _namespace_SO('SO_0000926')

    @classmethod
    def insert_AU(cls):
        """An edit to insert a AU dinucleotide. (cls, SO:ke)
        (SO_0000927)
        """
        return _namespace_SO('SO_0000927')

    @classmethod
    def insert_AA(cls):
        """An edit to insert a AA dinucleotide. (cls, SO:ke)
        (SO_0000928)
        """
        return _namespace_SO('SO_0000928')

    @classmethod
    def edited_mRNA(cls):
        """An mRNA that is edited. (cls, SO:xp)
        (SO_0000929)
        """
        return _namespace_SO('SO_0000929')

    @classmethod
    def guide_RNA_region(cls):
        """A region of guide RNA. (cls, SO:ma)
        (SO_0000930)
        """
        return _namespace_SO('SO_0000930')

    @classmethod
    def anchor_region(cls):
        """A region of a guide_RNA that base-pairs to a target mRNA. (cls, SO:jk)
        (SO_0000931)
        """
        return _namespace_SO('SO_0000931')

    @classmethod
    def pre_edited_mRNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000932)
        """
        return _namespace_SO('SO_0000932')

    @classmethod
    def intermediate(cls):
        """An attribute to describe a feature between stages of processing. (cls, SO:ke)
        (SO_0000933)
        """
        return _namespace_SO('SO_0000933')

    @classmethod
    def miRNA_target_site(cls):
        """A miRNA target site is a binding site where the molecule is a micro RNA. (cls, FB:cds)
        (SO_0000934)
        """
        return _namespace_SO('SO_0000934')

    @classmethod
    def edited_CDS(cls):
        """A CDS that is edited. (cls, SO:xp)
        (SO_0000935)
        """
        return _namespace_SO('SO_0000935')

    @classmethod
    def vertebrate_immunoglobulin_T_cell_receptor_rearranged_segment(cls):
        """-- No comment or description provided. --
        (cls, SO_0000936)
        """
        return _namespace_SO('SO_0000936')

    @classmethod
    def vertebrate_immune_system_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000937)
        """
        return _namespace_SO('SO_0000937')

    @classmethod
    def vertebrate_immunoglobulin_T_cell_receptor_rearranged_gene_cluster(cls):
        """-- No comment or description provided. --
        (cls, SO_0000938)
        """
        return _namespace_SO('SO_0000938')

    @classmethod
    def vertebrate_immune_system_gene_recombination_signal_feature(cls):
        """-- No comment or description provided. --
        (cls, SO_0000939)
        """
        return _namespace_SO('SO_0000939')

    @classmethod
    def recombinationally_rearranged(cls):
        """-- No comment or description provided. --
        (cls, SO_0000940)
        """
        return _namespace_SO('SO_0000940')

    @classmethod
    def recombinationally_rearranged_vertebrate_immune_system_gene(cls):
        """A recombinationally rearranged gene of the vertebrate immune system. (cls, SO:xp)
        (SO_0000941)
        """
        return _namespace_SO('SO_0000941')

    @classmethod
    def attP_site(cls):
        """An integration/excision site of a phage chromosome at which a recombinase acts to insert the phage DNA at a cognate integration/excision site on a bacterial chromosome. (cls, SO:as)
        (SO_0000942)
        """
        return _namespace_SO('SO_0000942')

    @classmethod
    def attB_site(cls):
        """An integration/excision site of a bacterial chromosome at which a recombinase acts to insert foreign DNA containing a cognate integration/excision site. (cls, SO:as)
        (SO_0000943)
        """
        return _namespace_SO('SO_0000943')

    @classmethod
    def attL_site(cls):
        """A region that results from recombination between attP_site and attB_site, composed of the 5' portion of attB_site and the 3' portion of attP_site. (cls, SO:as)
        (SO_0000944)
        """
        return _namespace_SO('SO_0000944')

    @classmethod
    def attR_site(cls):
        """A region that results from recombination between attP_site and attB_site, composed of the 5' portion of attP_site and the 3' portion of attB_site. (cls, SO:as)
        (SO_0000945)
        """
        return _namespace_SO('SO_0000945')

    @classmethod
    def integration_excision_site(cls):
        """A region specifically recognised by a recombinase, which inserts or removes another region marked by a distinct cognate integration/excision site. (cls, SO:as)
        (SO_0000946)
        """
        return _namespace_SO('SO_0000946')

    @classmethod
    def resolution_site(cls):
        """A region specifically recognised by a recombinase, which separates a physically contiguous circle of DNA into two physically separate circles. (cls, SO:as)
        (SO_0000947)
        """
        return _namespace_SO('SO_0000947')

    @classmethod
    def inversion_site(cls):
        """A region specifically recognised by a recombinase, which inverts the region flanked by a pair of sites. (cls, SO:ma)
        (SO_0000948)
        """
        return _namespace_SO('SO_0000948')

    @classmethod
    def dif_site(cls):
        """A site at which replicated bacterial circular chromosomes are decatenated by site specific resolvase. (cls, SO:as)
        (SO_0000949)
        """
        return _namespace_SO('SO_0000949')

    @classmethod
    def attC_site(cls):
        """An attC site is a sequence required for the integration of a DNA of an integron. (cls, SO:as)
        (SO_0000950)
        """
        return _namespace_SO('SO_0000950')

    @classmethod
    def eukaryotic_terminator(cls):
        """-- No comment or description provided. --
        (cls, SO_0000951)
        """
        return _namespace_SO('SO_0000951')

    @classmethod
    def oriV(cls):
        """An origin of vegetative replication in plasmids and phages. (cls, SO:as)
        (SO_0000952)
        """
        return _namespace_SO('SO_0000952')

    @classmethod
    def oriC(cls):
        """An origin of bacterial chromosome replication. (cls, SO:as)
        (SO_0000953)
        """
        return _namespace_SO('SO_0000953')

    @classmethod
    def DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, DNA molecule. (cls, SO:ma)
        (SO_0000954)
        """
        return _namespace_SO('SO_0000954')

    @classmethod
    def double_stranded_DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, double-stranded DNA molecule. (cls, SO:ma)
        (SO_0000955)
        """
        return _namespace_SO('SO_0000955')

    @classmethod
    def single_stranded_DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, single-stranded DNA molecule. (cls, SO:ma)
        (SO_0000956)
        """
        return _namespace_SO('SO_0000956')

    @classmethod
    def linear_double_stranded_DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, double-stranded, linear DNA molecule. (cls, SO:ma)
        (SO_0000957)
        """
        return _namespace_SO('SO_0000957')

    @classmethod
    def circular_double_stranded_DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, double-stranded, circular DNA molecule. (cls, SO:ma)
        (SO_0000958)
        """
        return _namespace_SO('SO_0000958')

    @classmethod
    def linear_single_stranded_DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, single-stranded, linear DNA molecule. (cls, SO:ma)
        (SO_0000959)
        """
        return _namespace_SO('SO_0000959')

    @classmethod
    def circular_single_stranded_DNA_chromosome(cls):
        """Structural unit composed of a self-replicating, single-stranded, circular DNA molecule. (cls, SO:ma)
        (SO_0000960)
        """
        return _namespace_SO('SO_0000960')

    @classmethod
    def RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, RNA molecule. (cls, SO:ma)
        (SO_0000961)
        """
        return _namespace_SO('SO_0000961')

    @classmethod
    def single_stranded_RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, single-stranded RNA molecule. (cls, SO:ma)
        (SO_0000962)
        """
        return _namespace_SO('SO_0000962')

    @classmethod
    def linear_single_stranded_RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, single-stranded, linear RNA molecule. (cls, SO:ma)
        (SO_0000963)
        """
        return _namespace_SO('SO_0000963')

    @classmethod
    def linear_double_stranded_RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, double-stranded, linear RNA molecule. (cls, SO:ma)
        (SO_0000964)
        """
        return _namespace_SO('SO_0000964')

    @classmethod
    def double_stranded_RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, double-stranded RNA molecule. (cls, SO:ma)
        (SO_0000965)
        """
        return _namespace_SO('SO_0000965')

    @classmethod
    def circular_single_stranded_RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, single-stranded, circular DNA molecule. (cls, SO:ma)
        (SO_0000966)
        """
        return _namespace_SO('SO_0000966')

    @classmethod
    def circular_double_stranded_RNA_chromosome(cls):
        """Structural unit composed of a self-replicating, double-stranded, circular RNA molecule. (cls, SO:ma)
        (SO_0000967)
        """
        return _namespace_SO('SO_0000967')

    @classmethod
    def sequence_replication_mode(cls):
        """-- No comment or description provided. --
        (cls, SO_0000968)
        """
        return _namespace_SO('SO_0000968')

    @classmethod
    def rolling_circle(cls):
        """-- No comment or description provided. --
        (cls, SO_0000969)
        """
        return _namespace_SO('SO_0000969')

    @classmethod
    def theta_replication(cls):
        """-- No comment or description provided. --
        (cls, SO_0000970)
        """
        return _namespace_SO('SO_0000970')

    @classmethod
    def DNA_replication_mode(cls):
        """-- No comment or description provided. --
        (cls, SO_0000971)
        """
        return _namespace_SO('SO_0000971')

    @classmethod
    def RNA_replication_mode(cls):
        """-- No comment or description provided. --
        (cls, SO_0000972)
        """
        return _namespace_SO('SO_0000972')

    @classmethod
    def insertion_sequence(cls):
        """A terminal_inverted_repeat_element that is bacterial and only encodes the functions required for its transposition between these inverted repeats. (cls, SO:as)
        (SO_0000973)
        """
        return _namespace_SO('SO_0000973')

    @classmethod
    def minicircle_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0000975)
        """
        return _namespace_SO('SO_0000975')

    @classmethod
    def cryptic(cls):
        """A feature_attribute describing a feature that is not manifest under normal conditions. (cls, SO:ke)
        (SO_0000976)
        """
        return _namespace_SO('SO_0000976')

    @classmethod
    def anchor_binding_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0000977)
        """
        return _namespace_SO('SO_0000977')

    @classmethod
    def template_region(cls):
        """A region of a guide_RNA that specifies the insertions and deletions of bases in the editing of a target mRNA. (cls, SO:jk)
        (SO_0000978)
        """
        return _namespace_SO('SO_0000978')

    @classmethod
    def gRNA_encoding(cls):
        """A non-protein_coding gene that encodes a guide_RNA. (cls, SO:ma)
        (SO_0000979)
        """
        return _namespace_SO('SO_0000979')

    @classmethod
    def minicircle(cls):
        """A minicircle is a replicon, part of a kinetoplast, that encodes for guide RNAs. (cls, PMID:8395055)
        (SO_0000980)
        """
        return _namespace_SO('SO_0000980')

    @classmethod
    def rho_dependent_bacterial_terminator(cls):
        """-- No comment or description provided. --
        (cls, SO_0000981)
        """
        return _namespace_SO('SO_0000981')

    @classmethod
    def rho_independent_bacterial_terminator(cls):
        """-- No comment or description provided. --
        (cls, SO_0000982)
        """
        return _namespace_SO('SO_0000982')

    @classmethod
    def strand_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000983)
        """
        return _namespace_SO('SO_0000983')

    @classmethod
    def single(cls):
        """-- No comment or description provided. --
        (cls, SO_0000984)
        """
        return _namespace_SO('SO_0000984')

    @classmethod
    def double(cls):
        """-- No comment or description provided. --
        (cls, SO_0000985)
        """
        return _namespace_SO('SO_0000985')

    @classmethod
    def topology_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0000986)
        """
        return _namespace_SO('SO_0000986')

    @classmethod
    def linear(cls):
        """A quality of a nucleotide polymer that has a 3'-terminal residue and a 5'-terminal residue. (cls, SO:cb)
        (SO_0000987)
        """
        return _namespace_SO('SO_0000987')

    @classmethod
    def circular(cls):
        """A quality of a nucleotide polymer that has no terminal nucleotide residues. (cls, SO:cb)
        (SO_0000988)
        """
        return _namespace_SO('SO_0000988')

    @classmethod
    def class_II_RNA(cls):
        """Small non-coding RNA (cls, 59-60 nt long) containing 5' and 3' ends that are predicted to come together to form a stem structure. Identified in the social amoeba Dictyostelium discoideum and localized in the cytoplasm. (PMID:15333696)
        (SO_0000989)
        """
        return _namespace_SO('SO_0000989')

    @classmethod
    def class_I_RNA(cls):
        """Small non-coding RNA (cls, 55-65 nt long) containing highly conserved 5' and 3' ends (16 and 8 nt, respectively) that are predicted to come together to form a stem structure. Identified in the social amoeba Dictyostelium discoideum and localized in the cytoplasm. (PMID:15333696)
        (SO_0000990)
        """
        return _namespace_SO('SO_0000990')

    @classmethod
    def genomic_DNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000991)
        """
        return _namespace_SO('SO_0000991')

    @classmethod
    def BAC_cloned_genomic_insert(cls):
        """-- No comment or description provided. --
        (cls, SO_0000992)
        """
        return _namespace_SO('SO_0000992')

    @classmethod
    def consensus(cls):
        """-- No comment or description provided. --
        (cls, SO_0000993)
        """
        return _namespace_SO('SO_0000993')

    @classmethod
    def consensus_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0000994)
        """
        return _namespace_SO('SO_0000994')

    @classmethod
    def consensus_mRNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0000995)
        """
        return _namespace_SO('SO_0000995')

    @classmethod
    def predicted_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0000996)
        """
        return _namespace_SO('SO_0000996')

    @classmethod
    def gene_fragment(cls):
        """-- No comment or description provided. --
        (cls, SO_0000997)
        """
        return _namespace_SO('SO_0000997')

    @classmethod
    def recursive_splice_site(cls):
        """A recursive splice site is a splice site which subdivides a large intron. Recursive splicing is a mechanism that splices large introns by sub dividing the intron at non exonic elements and alternate exons. (cls, http://www.genetics.org/cgi/content/full/170/2/661)
        (SO_0000998)
        """
        return _namespace_SO('SO_0000998')

    @classmethod
    def BAC_end(cls):
        """A region of sequence from the end of a BAC clone that may provide a highly specific marker. (cls, SO:ke)
        (SO_0000999)
        """
        return _namespace_SO('SO_0000999')

    @classmethod
    def rRNA_16S(cls):
        """A large polynucleotide in Bacteria and Archaea, which functions as the small subunit of the ribosome. (cls, SO:ke)
        (SO_0001000)
        """
        return _namespace_SO('SO_0001000')

    @classmethod
    def rRNA_23S(cls):
        """A large polynucleotide in Bacteria and Archaea, which functions as the large subunit of the ribosome. (cls, SO:ke)
        (SO_0001001)
        """
        return _namespace_SO('SO_0001001')

    @classmethod
    def rRNA_25S(cls):
        """A large polynucleotide which functions as part of the large subunit of the ribosome in some eukaryotes. (cls, RSC:cb)
        (SO_0001002)
        """
        return _namespace_SO('SO_0001002')

    @classmethod
    def solo_LTR(cls):
        """A recombination product between the 2 LTR of the same element. (cls, SO:ke)
        (SO_0001003)
        """
        return _namespace_SO('SO_0001003')

    @classmethod
    def low_complexity(cls):
        """-- No comment or description provided. --
        (cls, SO_0001004)
        """
        return _namespace_SO('SO_0001004')

    @classmethod
    def low_complexity_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0001005)
        """
        return _namespace_SO('SO_0001005')

    @classmethod
    def prophage(cls):
        """A phage genome after it has established in the host genome in a latent/immune state either as a plasmid or as an integrated \"island\". (cls, GOC:jl)
        (SO_0001006)
        """
        return _namespace_SO('SO_0001006')

    @classmethod
    def cryptic_prophage(cls):
        """A remnant of an integrated prophage in the host genome or an \"island\" in the host genome that includes phage like-genes. (cls, GOC:jl)
        (SO_0001007)
        """
        return _namespace_SO('SO_0001007')

    @classmethod
    def tetraloop(cls):
        """A base-paired stem with loop of 4 non-hydrogen bonded nucleotides. (cls, SO:ke)
        (SO_0001008)
        """
        return _namespace_SO('SO_0001008')

    @classmethod
    def DNA_constraint_sequence(cls):
        """A double-stranded DNA used to control macromolecular structure and function. (cls, http:/www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=search&db=pubmed&term=SILVERMAN+SK[au\]&dispmax=50)
        (SO_0001009)
        """
        return _namespace_SO('SO_0001009')

    @classmethod
    def i_motif(cls):
        """A cytosine rich domain whereby strands associate both inter- and intramolecularly at moderately acidic pH. (cls, PMID:9753739)
        (SO_0001010)
        """
        return _namespace_SO('SO_0001010')

    @classmethod
    def PNA_oligo(cls):
        """Peptide nucleic acid, is a chemical not known to occur naturally but is artificially synthesized and used in some biological research and medical treatments. The PNA backbone is composed of repeating N-(cls, 2-aminoethyl)-glycine units linked by peptide bonds. The purine and pyrimidine bases are linked to the backbone by methylene carbonyl bonds. (SO:ke)
        (SO_0001011)
        """
        return _namespace_SO('SO_0001011')

    @classmethod
    def DNAzyme(cls):
        """A DNA sequence with catalytic activity. (cls, SO:cb)
        (SO_0001012)
        """
        return _namespace_SO('SO_0001012')

    @classmethod
    def MNP(cls):
        """A multiple nucleotide polymorphism with alleles of common length > 1, for example AAA/TTT. (cls, http://www.ncbi.nlm.nih.gov/SNP/snp_ref.cgi?rs=rs2067431)
        (SO_0001013)
        """
        return _namespace_SO('SO_0001013')

    @classmethod
    def intron_domain(cls):
        """-- No comment or description provided. --
        (cls, SO_0001014)
        """
        return _namespace_SO('SO_0001014')

    @classmethod
    def wobble_base_pair(cls):
        """A type of non-canonical base pairing, most commonly between G and U, which is important for the secondary structure of RNAs. It has similar thermodynamic stability to the Watson-Crick pairing. Wobble base pairs only have two hydrogen bonds. Other wobble base pair possibilities are I-A, I-U and I-C. (cls, PMID:11256617)
        (SO_0001015)
        """
        return _namespace_SO('SO_0001015')

    @classmethod
    def internal_guide_sequence(cls):
        """A purine-rich sequence in the group I introns which determines the locations of the splice sites in group I intron splicing and has catalytic activity. (cls, SO:cb)
        (SO_0001016)
        """
        return _namespace_SO('SO_0001016')

    @classmethod
    def silent_mutation(cls):
        """A sequence variant that does not affect protein function. Silent mutations may occur in genic (cls,  CDS, UTR, intron etc) and intergenic regions. Silent mutations may have affects on processes such as splicing and regulation. (SO:ke)
        (SO_0001017)
        """
        return _namespace_SO('SO_0001017')

    @classmethod
    def epitope(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with antibodies, B cells or T cells. (cls, http://en.wikipedia.org/wiki/Epitope, SO:cb)
        (SO_0001018)
        """
        return _namespace_SO('SO_0001018')

    @classmethod
    def copy_number_variation(cls):
        """A variation that increases or decreases the copy number of a given region. (cls, SO:ke)
        (SO_0001019)
        """
        return _namespace_SO('SO_0001019')

    @classmethod
    def sequence_variant_affecting_copy_number(cls):
        """-- No comment or description provided. --
        (cls, SO_0001020)
        """
        return _namespace_SO('SO_0001020')

    @classmethod
    def chromosome_breakpoint(cls):
        """-- No comment or description provided. --
        (cls, SO_0001021)
        """
        return _namespace_SO('SO_0001021')

    @classmethod
    def inversion_breakpoint(cls):
        """The point within a chromosome where an inversion begins or ends. (cls, SO:cb)
        (SO_0001022)
        """
        return _namespace_SO('SO_0001022')

    @classmethod
    def allele(cls):
        """An allele is one of a set of coexisting sequence variants of a gene. (cls, SO:immuno_workshop)
        (SO_0001023)
        """
        return _namespace_SO('SO_0001023')

    @classmethod
    def haplotype(cls):
        """A haplotype is one of a set of coexisting sequence variants of a haplotype block. (cls, SO:immuno_workshop)
        (SO_0001024)
        """
        return _namespace_SO('SO_0001024')

    @classmethod
    def polymorphic_sequence_variant(cls):
        """A sequence variant that is segregating in one or more natural populations of a species. (cls, SO:immuno_workshop)
        (SO_0001025)
        """
        return _namespace_SO('SO_0001025')

    @classmethod
    def genome(cls):
        """A genome is the sum of genetic material within a cell or virion. (cls, SO:immuno_workshop)
        (SO_0001026)
        """
        return _namespace_SO('SO_0001026')

    @classmethod
    def genotype(cls):
        """A genotype is a variant genome, complete or incomplete. (cls, SO:immuno_workshop)
        (SO_0001027)
        """
        return _namespace_SO('SO_0001027')

    @classmethod
    def diplotype(cls):
        """A diplotype is a pair of haplotypes from a given individual. It is a genotype where the phase is known. (cls, SO:immuno_workshop)
        (SO_0001028)
        """
        return _namespace_SO('SO_0001028')

    @classmethod
    def direction_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0001029)
        """
        return _namespace_SO('SO_0001029')

    @classmethod
    def forward(cls):
        """Forward is an attribute of the feature, where the feature is in the 5' to 3' direction. (cls, SO:ke)
        (SO_0001030)
        """
        return _namespace_SO('SO_0001030')

    @classmethod
    def reverse(cls):
        """Reverse is an attribute of the feature, where the feature is in the 3' to 5' direction. Again could be applied to primer. (cls, SO:ke)
        (SO_0001031)
        """
        return _namespace_SO('SO_0001031')

    @classmethod
    def mitochondrial_DNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0001032)
        """
        return _namespace_SO('SO_0001032')

    @classmethod
    def chloroplast_DNA(cls):
        """-- No comment or description provided. --
        (cls, SO_0001033)
        """
        return _namespace_SO('SO_0001033')

    @classmethod
    def mirtron(cls):
        """A de-branched intron which mimics the structure of pre-miRNA and enters the miRNA processing pathway without Drosha mediated cleavage. (cls, PMID:17589500, SO:ma)
        (SO_0001034)
        """
        return _namespace_SO('SO_0001034')

    @classmethod
    def piRNA(cls):
        """A small non coding RNA, part of a silencing system that prevents the spreading of selfish genetic elements. (cls, SO:ke)
        (SO_0001035)
        """
        return _namespace_SO('SO_0001035')

    @classmethod
    def arginyl_tRNA(cls):
        """A tRNA sequence that has an arginine anticodon, and a 3' arginine binding region. (cls, SO:ke)
        (SO_0001036)
        """
        return _namespace_SO('SO_0001036')

    @classmethod
    def mobile_genetic_element(cls):
        """A nucleotide region with either intra-genome or intracellular moblity, of varying length, which often carry the information necessary for transfer and recombination with the host genome. (cls, PMID:14681355)
        (SO_0001037)
        """
        return _namespace_SO('SO_0001037')

    @classmethod
    def extrachromosomal_mobile_genetic_element(cls):
        """An MGE that is not integrated into the host chromosome. (cls, SO:ke)
        (SO_0001038)
        """
        return _namespace_SO('SO_0001038')

    @classmethod
    def integrated_mobile_genetic_element(cls):
        """An MGE that is integrated into the host chromosome. (cls, SO:ke)
        (SO_0001039)
        """
        return _namespace_SO('SO_0001039')

    @classmethod
    def integrated_plasmid(cls):
        """A plasmid sequence that is integrated within the host chromosome. (cls, SO:ke)
        (SO_0001040)
        """
        return _namespace_SO('SO_0001040')

    @classmethod
    def viral_sequence(cls):
        """The region of nucleotide sequence of a virus, a submicroscopic particle that replicates by infecting a host cell. (cls, SO:ke)
        (SO_0001041)
        """
        return _namespace_SO('SO_0001041')

    @classmethod
    def phage_sequence(cls):
        """The nucleotide sequence of a virus that infects bacteria. (cls, SO:ke)
        (SO_0001042)
        """
        return _namespace_SO('SO_0001042')

    @classmethod
    def attCtn_site(cls):
        """An attachment site located on a conjugative transposon and used for site-specific integration of a conjugative transposon. (cls, Phigo:at)
        (SO_0001043)
        """
        return _namespace_SO('SO_0001043')

    @classmethod
    def nuclear_mt_pseudogene(cls):
        """A nuclear pseudogene of either coding or non-coding mitochondria derived sequence. (cls, SO:xp)
        (SO_0001044)
        """
        return _namespace_SO('SO_0001044')

    @classmethod
    def cointegrated_plasmid(cls):
        """A MGE region consisting of two fused plasmids resulting from a replicative transposition event. (cls, phigo:at)
        (SO_0001045)
        """
        return _namespace_SO('SO_0001045')

    @classmethod
    def IRLinv_site(cls):
        """Component of the inversion site located at the left of a region susceptible to site-specific inversion. (cls, Phigo:at)
        (SO_0001046)
        """
        return _namespace_SO('SO_0001046')

    @classmethod
    def IRRinv_site(cls):
        """Component of the inversion site located at the right of a region susceptible to site-specific inversion. (cls, Phigo:at)
        (SO_0001047)
        """
        return _namespace_SO('SO_0001047')

    @classmethod
    def inversion_site_part(cls):
        """A region located within an inversion site. (cls, SO:ke)
        (SO_0001048)
        """
        return _namespace_SO('SO_0001048')

    @classmethod
    def defective_conjugative_transposon(cls):
        """An island that contains genes for integration/excision and the gene and site for the initiation of intercellular transfer by conjugation. It can be complemented for transfer by a conjugative transposon. (cls, Phigo:ariane)
        (SO_0001049)
        """
        return _namespace_SO('SO_0001049')

    @classmethod
    def repeat_fragment(cls):
        """A portion of a repeat, interrupted by the insertion of another element. (cls, SO:ke)
        (SO_0001050)
        """
        return _namespace_SO('SO_0001050')

    @classmethod
    def nested_region(cls):
        """-- No comment or description provided. --
        (cls, SO_0001051)
        """
        return _namespace_SO('SO_0001051')

    @classmethod
    def nested_repeat(cls):
        """Either:
            -- No comment or description provided. --
            (cls, SO_0001052)
        Or:
            A repeat that is disrupted by the insertion of another element. (SO:ke)
            (SO_0001649)
        """
        return [ _namespace_SO('SO_0001052'), _namespace_SO('SO_0001649') ]

    @classmethod
    def nested_transposon(cls):
        """Either:
            -- No comment or description provided. --
            (cls, SO_0001053)
        Or:
            A transposon that is disrupted by the insertion of another element. (SO:ke)
            (SO_0001648)
        """
        return [ _namespace_SO('SO_0001053'), _namespace_SO('SO_0001648') ]

    @classmethod
    def transposon_fragment(cls):
        """A portion of a transposon, interrupted by the insertion of another element. (cls, SO:ke)
        (SO_0001054)
        """
        return _namespace_SO('SO_0001054')

    @classmethod
    def transcriptional_cis_regulatory_region(cls):
        """A regulatory_region that modulates the transcription of a gene or genes. (cls, SO:regcreative)
        (SO_0001055)
        """
        return _namespace_SO('SO_0001055')

    @classmethod
    def splicing_regulatory_region(cls):
        """A regulatory_region that modulates splicing. (cls, SO:ke)
        (SO_0001056)
        """
        return _namespace_SO('SO_0001056')

    @classmethod
    def enhanceosome(cls):
        """-- No comment or description provided. --
        (cls, SO_0001057)
        """
        return _namespace_SO('SO_0001057')

    @classmethod
    def promoter_targeting_sequence(cls):
        """A transcriptional_cis_regulatory_region that restricts the activity of a CRM to a single promoter and which functions only when both itself and an insulator are located between the CRM and the promoter. (cls, SO:regcreative)
        (SO_0001058)
        """
        return _namespace_SO('SO_0001058')

    @classmethod
    def sequence_alteration(cls):
        """A sequence_alteration is a sequence_feature whose extent is the deviation from another sequence. (cls, SO:ke)
        (SO_0001059)
        """
        return _namespace_SO('SO_0001059')

    @classmethod
    def sequence_variant(cls):
        """A sequence_variant is a non exact copy of a sequence_feature or genome exhibiting one or more sequence_alteration. (cls, SO:ke)
        (SO_0001060)
        """
        return _namespace_SO('SO_0001060')

    @classmethod
    def propeptide_cleavage_site(cls):
        """The propeptide_cleavage_site is the arginine/lysine boundary on a propeptide where cleavage occurs. (cls, EBIBS:GAR)
        (SO_0001061)
        """
        return _namespace_SO('SO_0001061')

    @classmethod
    def propeptide(cls):
        """Part of a peptide chain which is cleaved off during the formation of the mature protein. (cls, EBIBS:GAR)
        (SO_0001062)
        """
        return _namespace_SO('SO_0001062')

    @classmethod
    def immature_peptide_region(cls):
        """An immature_peptide_region is the extent of the peptide after it has been translated and before any processing occurs. (cls, EBIBS:GAR)
        (SO_0001063)
        """
        return _namespace_SO('SO_0001063')

    @classmethod
    def active_peptide(cls):
        """Active peptides are proteins which are biologically active, released from a precursor molecule. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001064)
        """
        return _namespace_SO('SO_0001064')

    @classmethod
    def compositionally_biased_region_of_peptide(cls):
        """Polypeptide region that is rich in a particular amino acid or homopolymeric and greater than three residues in length. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001066)
        """
        return _namespace_SO('SO_0001066')

    @classmethod
    def polypeptide_motif(cls):
        """A sequence motif is a short (cls, up to 20 amino acids) region of biological interest. Such motifs, although they are too short to constitute functional domains, share sequence similarities and are conserved in different proteins. They display a common function (protein-binding, subcellular location etc.). (EBIBS:GAR, UniProt:curation_manual)
        (SO_0001067)
        """
        return _namespace_SO('SO_0001067')

    @classmethod
    def polypeptide_repeat(cls):
        """A polypeptide_repeat is a single copy of an internal sequence repetition. (cls, EBIBS:GAR)
        (SO_0001068)
        """
        return _namespace_SO('SO_0001068')

    @classmethod
    def polypeptide_structural_region(cls):
        """Region of polypeptide with a given structural property. (cls, EBIBS:GAR, SO:cb)
        (SO_0001070)
        """
        return _namespace_SO('SO_0001070')

    @classmethod
    def membrane_structure(cls):
        """Arrangement of the polypeptide with respect to the lipid bilayer. (cls, EBIBS:GAR)
        (SO_0001071)
        """
        return _namespace_SO('SO_0001071')

    @classmethod
    def extramembrane_polypeptide_region(cls):
        """Polypeptide region that is localized outside of a lipid bilayer. (cls, EBIBS:GAR, SO:cb)
        (SO_0001072)
        """
        return _namespace_SO('SO_0001072')

    @classmethod
    def cytoplasmic_polypeptide_region(cls):
        """Polypeptide region that is localized inside the cytoplasm. (cls, EBIBS:GAR, SO:cb)
        (SO_0001073)
        """
        return _namespace_SO('SO_0001073')

    @classmethod
    def non_cytoplasmic_polypeptide_region(cls):
        """Polypeptide region that is localized outside of a lipid bilayer and outside of the cytoplasm. (cls, EBIBS:GAR, SO:cb)
        (SO_0001074)
        """
        return _namespace_SO('SO_0001074')

    @classmethod
    def intramembrane_polypeptide_region(cls):
        """Polypeptide region present in the lipid bilayer. (cls, EBIBS:GAR)
        (SO_0001075)
        """
        return _namespace_SO('SO_0001075')

    @classmethod
    def membrane_peptide_loop(cls):
        """Polypeptide region localized within the lipid bilayer where both ends traverse the same membrane. (cls, EBIBS:GAR, SO:cb)
        (SO_0001076)
        """
        return _namespace_SO('SO_0001076')

    @classmethod
    def transmembrane_polypeptide_region(cls):
        """Polypeptide region traversing the lipid bilayer. (cls, EBIBS:GAR, UniProt:curator_manual)
        (SO_0001077)
        """
        return _namespace_SO('SO_0001077')

    @classmethod
    def polypeptide_secondary_structure(cls):
        """A region of peptide with secondary structure has hydrogen bonding along the peptide chain that causes a defined conformation of the chain. (cls, EBIBS:GAR)
        (SO_0001078)
        """
        return _namespace_SO('SO_0001078')

    @classmethod
    def polypeptide_structural_motif(cls):
        """Motif is a three-dimensional structural element within the chain, which appears also in a variety of other molecules. Unlike a domain, a motif does not need to form a stable globular unit. (cls, EBIBS:GAR)
        (SO_0001079)
        """
        return _namespace_SO('SO_0001079')

    @classmethod
    def coiled_coil(cls):
        """A coiled coil is a structural motif in proteins, in which alpha-helices are coiled together like the strands of a rope. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001080)
        """
        return _namespace_SO('SO_0001080')

    @classmethod
    def helix_turn_helix(cls):
        """A motif comprising two helices separated by a turn. (cls, EBIBS:GAR)
        (SO_0001081)
        """
        return _namespace_SO('SO_0001081')

    @classmethod
    def polypeptide_sequencing_information(cls):
        """Incompatibility in the sequence due to some experimental problem. (cls, EBIBS:GAR)
        (SO_0001082)
        """
        return _namespace_SO('SO_0001082')

    @classmethod
    def non_adjacent_residues(cls):
        """Indicates that two consecutive residues in a fragment sequence are not consecutive in the full-length protein and that there are a number of unsequenced residues between them. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001083)
        """
        return _namespace_SO('SO_0001083')

    @classmethod
    def non_terminal_residue(cls):
        """The residue at an extremity of the sequence is not the terminal residue. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001084)
        """
        return _namespace_SO('SO_0001084')

    @classmethod
    def sequence_conflict(cls):
        """Different sources report differing sequences. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001085)
        """
        return _namespace_SO('SO_0001085')

    @classmethod
    def sequence_uncertainty(cls):
        """Describes the positions in a sequence where the authors are unsure about the sequence assignment. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001086)
        """
        return _namespace_SO('SO_0001086')

    @classmethod
    def cross_link(cls):
        """Posttranslationally formed amino acid bonds. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001087)
        """
        return _namespace_SO('SO_0001087')

    @classmethod
    def disulfide_bond(cls):
        """The covalent bond between sulfur atoms that binds two peptide chains or different parts of one peptide chain and is a structural determinant in many protein molecules. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001088)
        """
        return _namespace_SO('SO_0001088')

    @classmethod
    def post_translationally_modified_region(cls):
        """A region where a transformation occurs in a protein after it has been synthesized. This which may regulate, stabilize, crosslink or introduce new chemical functionalities in the protein. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001089)
        """
        return _namespace_SO('SO_0001089')

    @classmethod
    def covalent_binding_site(cls):
        """Binding involving a covalent bond. (cls, EBIBS:GAR)
        (SO_0001090)
        """
        return _namespace_SO('SO_0001090')

    @classmethod
    def non_covalent_binding_site(cls):
        """Binding site for any chemical group (cls, co-enzyme, prosthetic group, etc.). (EBIBS:GAR)
        (SO_0001091)
        """
        return _namespace_SO('SO_0001091')

    @classmethod
    def polypeptide_metal_contact(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with metal ions. (cls, EBIBS:GAR, SO:cb, UniProt:curation_manual)
        (SO_0001092)
        """
        return _namespace_SO('SO_0001092')

    @classmethod
    def protein_protein_contact(cls):
        """A binding site that, in the protein molecule, interacts selectively and non-covalently with polypeptide residues. (cls, EBIBS:GAR, UniProt:Curation_manual)
        (SO_0001093)
        """
        return _namespace_SO('SO_0001093')

    @classmethod
    def polypeptide_calcium_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with calcium ions. (cls, EBIBS:GAR)
        (SO_0001094)
        """
        return _namespace_SO('SO_0001094')

    @classmethod
    def polypeptide_cobalt_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with cobalt ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001095)
        """
        return _namespace_SO('SO_0001095')

    @classmethod
    def polypeptide_copper_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with copper ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001096)
        """
        return _namespace_SO('SO_0001096')

    @classmethod
    def polypeptide_iron_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with iron ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001097)
        """
        return _namespace_SO('SO_0001097')

    @classmethod
    def polypeptide_magnesium_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with magnesium ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001098)
        """
        return _namespace_SO('SO_0001098')

    @classmethod
    def polypeptide_manganese_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with manganese ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001099)
        """
        return _namespace_SO('SO_0001099')

    @classmethod
    def polypeptide_molybdenum_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with molybdenum ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001100)
        """
        return _namespace_SO('SO_0001100')

    @classmethod
    def polypeptide_nickel_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with nickel ions. (cls, EBIBS:GAR)
        (SO_0001101)
        """
        return _namespace_SO('SO_0001101')

    @classmethod
    def polypeptide_tungsten_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with tungsten ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001102)
        """
        return _namespace_SO('SO_0001102')

    @classmethod
    def polypeptide_zinc_ion_contact_site(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with zinc ions. (cls, EBIBS:GAR, SO:cb)
        (SO_0001103)
        """
        return _namespace_SO('SO_0001103')

    @classmethod
    def catalytic_residue(cls):
        """Amino acid involved in the activity of an enzyme. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001104)
        """
        return _namespace_SO('SO_0001104')

    @classmethod
    def polypeptide_ligand_contact(cls):
        """Residues which interact with a ligand. (cls, EBIBS:GAR)
        (SO_0001105)
        """
        return _namespace_SO('SO_0001105')

    @classmethod
    def asx_motif(cls):
        """A motif of five consecutive residues and two H-bonds in which: Residue(cls, i) is Aspartate or Asparagine (Asx), side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2) or (i+3), main-chain CO of residue(i) is H-bonded to the main-chain NH of residue(i+3) or (i+4). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001106)
        """
        return _namespace_SO('SO_0001106')

    @classmethod
    def beta_bulge(cls):
        """A motif of three residues within a beta-sheet in which the main chains of two consecutive residues are H-bonded to that of the third, and in which the dihedral angles are as follows: Residue(cls, i): -140 degrees < phi(l) -20 degrees , -90 degrees < psi(l) < 40 degrees. Residue (i+1): -180 degrees < phi < -25 degrees or +120 degrees < phi < +180 degrees, +40 degrees < psi < +180 degrees or -180 degrees < psi < -120 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001107)
        """
        return _namespace_SO('SO_0001107')

    @classmethod
    def beta_bulge_loop(cls):
        """A motif of three residues within a beta-sheet consisting of two H-bonds. Beta bulge loops often occur at the loop ends of beta-hairpins. (cls, EBIBS:GAR, Http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001108)
        """
        return _namespace_SO('SO_0001108')

    @classmethod
    def beta_bulge_loop_five(cls):
        """A motif of three residues within a beta-sheet consisting of two H-bonds in which: the main-chain NH of residue(cls, i) is H-bonded to the main-chain CO of residue(i+4), the main-chain CO of residue i is H-bonded to the main-chain NH of residue(i+3), these loops have an RL nest at residues i+2 and i+3. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001109)
        """
        return _namespace_SO('SO_0001109')

    @classmethod
    def beta_bulge_loop_six(cls):
        """A motif of three residues within a beta-sheet consisting of two H-bonds in which: the main-chain NH of residue(cls, i) is H-bonded to the main-chain CO of residue(i+5), the main-chain CO of residue i is H-bonded to the main-chain NH of residue(i+4), these loops have an RL nest at residues i+3 and i+4. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001110)
        """
        return _namespace_SO('SO_0001110')

    @classmethod
    def beta_strand(cls):
        """A beta strand describes a single length of polypeptide chain that forms part of a beta sheet. A single continuous stretch of amino acids adopting an extended conformation of hydrogen bonds between the N-O and the C=O of another part of the peptide. This forms a secondary protein structure in which two or more extended polypeptide regions are hydrogen-bonded to one another in a planar array. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001111)
        """
        return _namespace_SO('SO_0001111')

    @classmethod
    def antiparallel_beta_strand(cls):
        """A peptide region which hydrogen bonded to another region of peptide running in the oposite direction (cls, one running N-terminal to C-terminal and one running C-terminal to N-terminal). Hydrogen bonding occurs between every other C=O from one strand to every other N-H on the adjacent strand. In this case, if two atoms C-alpha (i) and C-alpha (j) are adjacent in two hydrogen-bonded beta strands, then they form two mutual backbone hydrogen bonds to each other's flanking peptide groups; this is known as a close pair of hydrogen bonds. The peptide backbone dihedral angles (phi, psi) are about (-140 degrees, 135 degrees) in antiparallel sheets. (EBIBS:GAR, UniProt:curation_manual)
        (SO_0001112)
        """
        return _namespace_SO('SO_0001112')

    @classmethod
    def parallel_beta_strand(cls):
        """A peptide region which hydrogen bonded to another region of peptide running in the oposite direction (cls, both running N-terminal to C-terminal). This orientation is slightly less stable because it introduces nonplanarity in the inter-strand hydrogen bonding pattern. Hydrogen bonding occurs between every other C=O from one strand to every other N-H on the adjacent strand. In this case, if two atoms C-alpha (i)and C-alpha (j) are adjacent in two hydrogen-bonded beta strands, then they do not hydrogen bond to each other; rather, one residue forms hydrogen bonds to the residues that flank the other (but not vice versa). For example, residue i may form hydrogen bonds to residues j - 1 and j + 1; this is known as a wide pair of hydrogen bonds. By contrast, residue j may hydrogen-bond to different residues altogether, or to none at all. The dihedral angles (phi, psi) are about (-120 degrees, 115 degrees) in parallel sheets. (EBIBS:GAR, UniProt:curation_manual)
        (SO_0001113)
        """
        return _namespace_SO('SO_0001113')

    @classmethod
    def peptide_helix(cls):
        """A helix is a secondary_structure conformation where the peptide backbone forms a coil. (cls, EBIBS:GAR)
        (SO_0001114)
        """
        return _namespace_SO('SO_0001114')

    @classmethod
    def left_handed_peptide_helix(cls):
        """A left handed helix is a region of peptide where the coiled conformation turns in an anticlockwise, left handed screw. (cls, EBIBS:GAR)
        (SO_0001115)
        """
        return _namespace_SO('SO_0001115')

    @classmethod
    def right_handed_peptide_helix(cls):
        """A right handed helix is a region of peptide where the coiled conformation turns in a clockwise, right handed screw. (cls, EBIBS:GAR)
        (SO_0001116)
        """
        return _namespace_SO('SO_0001116')

    @classmethod
    def alpha_helix(cls):
        """The helix has 3.6 residues per turn which corersponds to a translation of 1.5 angstroms (cls, = 0.15 nm) along the helical axis. Every backbone N-H group donates a hydrogen bond to the backbone C=O group of the amino acid four residues earlier. (EBIBS:GAR)
        (SO_0001117)
        """
        return _namespace_SO('SO_0001117')

    @classmethod
    def pi_helix(cls):
        """The pi helix has 4.1 residues per turn and a translation of 1.15  (cls, =0.115 nm) along the helical axis. The N-H group of an amino acid forms a hydrogen bond with the C=O group of the amino acid five residues earlier. (EBIBS:GAR)
        (SO_0001118)
        """
        return _namespace_SO('SO_0001118')

    @classmethod
    def three_ten_helix(cls):
        """The 3-10 helix has 3 residues per turn with a translation of 2.0 angstroms (cls, =0.2 nm) along the helical axis. The N-H group of an amino acid forms a hydrogen bond with the C=O group of the amino acid three residues earlier. (EBIBS:GAR)
        (SO_0001119)
        """
        return _namespace_SO('SO_0001119')

    @classmethod
    def polypeptide_nest_motif(cls):
        """A motif of two consecutive residues with dihedral angles. Nest should not have Proline as any residue. Nests frequently occur as parts of other motifs such as Schellman loops. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001120)
        """
        return _namespace_SO('SO_0001120')

    @classmethod
    def polypeptide_nest_left_right_motif(cls):
        """A motif of two consecutive residues with dihedral angles: Residue(cls, i): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001121)
        """
        return _namespace_SO('SO_0001121')

    @classmethod
    def polypeptide_nest_right_left_motif(cls):
        """A motif of two consecutive residues with dihedral angles: Residue(cls, i): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. Residue(i+1): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001122)
        """
        return _namespace_SO('SO_0001122')

    @classmethod
    def schellmann_loop(cls):
        """A motif of six or seven consecutive residues that contains two H-bonds. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001123)
        """
        return _namespace_SO('SO_0001123')

    @classmethod
    def schellmann_loop_seven(cls):
        """Wild type: A motif of seven consecutive residues that contains two H-bonds in which: the main-chain CO of residue(cls, i) is H-bonded to the main-chain NH of residue(i+6), the main-chain CO of residue(i+1) is H-bonded to the main-chain NH of residue(i+5). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001124)
        """
        return _namespace_SO('SO_0001124')

    @classmethod
    def schellmann_loop_six(cls):
        """Common Type: A motif of six consecutive residues that contains two H-bonds in which: the main-chain CO of residue(cls, i) is H-bonded to the main-chain NH of residue(i+5) the main-chain CO of residue(i+1) is H-bonded to the main-chain NH of residue(i+4). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001125)
        """
        return _namespace_SO('SO_0001125')

    @classmethod
    def serine_threonine_motif(cls):
        """A motif of five consecutive residues and two hydrogen bonds in which: residue(cls, i) is Serine (S) or Threonine (T), the side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2) or (i+3) , the main-chain CO group of residue(i) is H-bonded to the main-chain NH of residue(i+3) or (i+4). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001126)
        """
        return _namespace_SO('SO_0001126')

    @classmethod
    def serine_threonine_staple_motif(cls):
        """A motif of four or five consecutive residues and one H-bond in which: residue(cls, i) is Serine (S) or Threonine (T), the side-chain OH of residue(i) is H-bonded to the main-chain CO of residue(i3) or (i4), Phi angles of residues(i1), (i2) and (i3) are negative. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001127)
        """
        return _namespace_SO('SO_0001127')

    @classmethod
    def polypeptide_turn_motif(cls):
        """A reversal in the direction of the backbone of a protein that is stabilized by hydrogen bond between backbone NH and CO groups, involving no more than 4 amino acid residues. (cls, EBIBS:GAR, uniprot:feature_type)
        (SO_0001128)
        """
        return _namespace_SO('SO_0001128')

    @classmethod
    def asx_turn_left_handed_type_one(cls):
        """Left handed type I (cls, dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, -90 degrees < psi +120 degrees < +40 degrees. Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001129)
        """
        return _namespace_SO('SO_0001129')

    @classmethod
    def asx_turn_left_handed_type_two(cls):
        """Left handed type II (cls, dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, +80 degrees < psi +120 degrees < +180 degrees. Residue(i+1): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001130)
        """
        return _namespace_SO('SO_0001130')

    @classmethod
    def asx_turn_right_handed_type_two(cls):
        """Right handed type II (cls, dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, +80 degrees < psi +120 degrees < +180 degrees. Residue(i+1): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001131)
        """
        return _namespace_SO('SO_0001131')

    @classmethod
    def asx_turn_right_handed_type_one(cls):
        """Right handed type I (cls, dihedral angles):- Residue(i): -140 degrees < chi (1) -120 degrees < -20 degrees, -90 degrees < psi +120 degrees < +40 degrees. Residue(i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001132)
        """
        return _namespace_SO('SO_0001132')

    @classmethod
    def beta_turn(cls):
        """A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles of the second and third residues, which are the basis for sub-categorization. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001133)
        """
        return _namespace_SO('SO_0001133')

    @classmethod
    def beta_turn_left_handed_type_one(cls):
        """Left handed type I:A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles:- Residue(cls, i+1): -140 degrees > phi > -20 degrees, -90 degrees > psi > +40 degrees. Residue(i+2): -140 degrees > phi > -20 degrees, -90 degrees > psi > +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001134)
        """
        return _namespace_SO('SO_0001134')

    @classmethod
    def beta_turn_left_handed_type_two(cls):
        """Left handed type II: A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles: Residue(cls, i+1): -140 degrees > phi > -20 degrees, +80 degrees > psi > +180 degrees. Residue(i+2): +20 degrees > phi > +140 degrees, -40 degrees > psi > +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001135)
        """
        return _namespace_SO('SO_0001135')

    @classmethod
    def beta_turn_right_handed_type_one(cls):
        """Right handed type I:A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles: Residue(cls, i+1): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. Residue(i+2): -140 degrees < phi < -20 degrees, -90 degrees < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001136)
        """
        return _namespace_SO('SO_0001136')

    @classmethod
    def beta_turn_right_handed_type_two(cls):
        """Right handed type II:A motif of four consecutive residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth. It is characterized by the dihedral angles: Residue(cls, i+1): -140 degrees < phi < -20 degrees, +80 degrees < psi < +180 degrees. Residue(i+2): +20 degrees < phi < +140 degrees, -40 degrees < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001137)
        """
        return _namespace_SO('SO_0001137')

    @classmethod
    def gamma_turn(cls):
        """Gamma turns, defined for 3 residues i,(cls,  i+1),( i+2) if a hydrogen bond exists between residues i and i+2 and the phi and psi angles of residue i+1 fall within 40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001138)
        """
        return _namespace_SO('SO_0001138')

    @classmethod
    def gamma_turn_classic(cls):
        """Gamma turns, defined for 3 residues i, i+1, i+2 if a hydrogen bond exists between residues i and i+2 and the phi and psi angles of residue i+1 fall within 40 degrees: phi(cls, i+1)=75.0 - psi(i+1)=-64.0. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001139)
        """
        return _namespace_SO('SO_0001139')

    @classmethod
    def gamma_turn_inverse(cls):
        """Gamma turns, defined for 3 residues i, i+1, i+2 if a hydrogen bond exists between residues i and i+2 and the phi and psi angles of residue i+1 fall within 40 degrees: phi(cls, i+1)=-79.0 - psi(i+1)=69.0. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001140)
        """
        return _namespace_SO('SO_0001140')

    @classmethod
    def serine_threonine_turn(cls):
        """A motif of three consecutive residues and one H-bond in which: residue(cls, i) is Serine (S) or Threonine (T), the side-chain O of residue(i) is H-bonded to the main-chain NH of residue(i+2). (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001141)
        """
        return _namespace_SO('SO_0001141')

    @classmethod
    def st_turn_left_handed_type_one(cls):
        """The peptide twists in an anticlockwise, left handed manner. The dihedral angles for this turn are: Residue(cls, i): -140 degrees < chi(1) -120 degrees < -20 degrees, -90 degrees psi +120 degrees < +40 degrees, residue(i+1): -140 degrees < phi < -20 degrees, -90 < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001142)
        """
        return _namespace_SO('SO_0001142')

    @classmethod
    def st_turn_left_handed_type_two(cls):
        """The peptide twists in an anticlockwise, left handed manner. The dihedral angles for this turn are: Residue(cls, i): -140 degrees < chi(1) -120 degrees < -20 degrees, +80 degrees psi +120 degrees < +180 degrees, residue(i+1): +20 degrees < phi < +140 degrees, -40 < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001143)
        """
        return _namespace_SO('SO_0001143')

    @classmethod
    def st_turn_right_handed_type_one(cls):
        """The peptide twists in an clockwise, right handed manner. The dihedral angles for this turn are: Residue(cls, i): -140 degrees < chi(1) -120 degrees < -20 degrees, -90 degrees psi +120 degrees < +40 degrees, residue(i+1): -140 degrees < phi < -20 degrees, -90 < psi < +40 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001144)
        """
        return _namespace_SO('SO_0001144')

    @classmethod
    def st_turn_right_handed_type_two(cls):
        """The peptide twists in an clockwise, right handed manner. The dihedral angles for this turn are: Residue(cls, i): -140 degrees < chi(1) -120 degrees < -20 degrees, +80 degrees psi +120 degrees < +180 degrees, residue(i+1): +20 degrees < phi < +140 degrees, -40 < psi < +90 degrees. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0001145)
        """
        return _namespace_SO('SO_0001145')

    @classmethod
    def polypeptide_variation_site(cls):
        """A site of sequence variation (cls, alteration). Alternative sequence due to naturally occuring events such as polymorphisms and altermatve splicing or experimental methods such as site directed mutagenesis. (EBIBS:GAR, SO:ke)
        (SO_0001146)
        """
        return _namespace_SO('SO_0001146')

    @classmethod
    def natural_variant_site(cls):
        """Describes the natural sequence variants due to polymorphisms, disease-associated mutations, RNA editing and variations between strains, isolates or cultivars. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001147)
        """
        return _namespace_SO('SO_0001147')

    @classmethod
    def mutated_variant_site(cls):
        """Site which has been experimentally altered. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001148)
        """
        return _namespace_SO('SO_0001148')

    @classmethod
    def alternate_sequence_site(cls):
        """Description of sequence variants produced by alternative splicing, alternative promoter usage, alternative initiation and ribosomal frameshifting. (cls, EBIBS:GAR, UniProt:curation_manual)
        (SO_0001149)
        """
        return _namespace_SO('SO_0001149')

    @classmethod
    def beta_turn_type_six(cls):
        """A motif of four consecutive peptide resides of type VIa or type VIb and where the i+2 residue is cis-proline. (cls, SO:cb)
        (SO_0001150)
        """
        return _namespace_SO('SO_0001150')

    @classmethod
    def beta_turn_type_six_a(cls):
        """A motif of four consecutive peptide residues, of which the i+2 residue is proline, and that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth and is characterized by the dihedral angles: Residue(cls, i+1): phi ~ -60 degrees, psi ~ 120 degrees. Residue(i+2): phi ~ -90 degrees, psi ~ 0 degrees. (PMID:2371257, SO:cb)
        (SO_0001151)
        """
        return _namespace_SO('SO_0001151')

    @classmethod
    def beta_turn_type_six_a_one(cls):
        """-- No comment or description provided. --
        (cls, SO_0001152)
        """
        return _namespace_SO('SO_0001152')

    @classmethod
    def beta_turn_type_six_a_two(cls):
        """-- No comment or description provided. --
        (cls, SO_0001153)
        """
        return _namespace_SO('SO_0001153')

    @classmethod
    def beta_turn_type_six_b(cls):
        """A motif of four consecutive peptide residues, of which the i+2 residue is proline, and that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth and is characterized by the dihedral angles: Residue(cls, i+1): phi ~ -120 degrees, psi ~ 120 degrees. Residue(i+2): phi ~ -60 degrees, psi ~ 0 degrees. (PMID:2371257, SO:cb)
        (SO_0001154)
        """
        return _namespace_SO('SO_0001154')

    @classmethod
    def beta_turn_type_eight(cls):
        """A motif of four consecutive peptide residues that may contain one H-bond, which, if present, is between the main-chain CO of the first residue and the main-chain NH of the fourth and is characterized by the dihedral angles: Residue(cls, i+1): phi ~ -60 degrees, psi ~ -30 degrees. Residue(i+2): phi ~ -120 degrees, psi ~ 120 degrees. (PMID:2371257, SO:cb)
        (SO_0001155)
        """
        return _namespace_SO('SO_0001155')

    @classmethod
    def DRE_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, usually located between -10 and -60 relative to the TSS. Consensus sequence is WATCGATW. (cls, PMID:12537576)
        (SO_0001156)
        """
        return _namespace_SO('SO_0001156')

    @classmethod
    def DMv4_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, located immediately upstream of some TATA box elements with respect to the TSS (cls, +1). Consensus sequence is YGGTCACACTR. Marked spatial preference within core promoter; tend to occur near the TSS, although not as tightly as INR (SO:0000014). (PMID:16827941:12537576)
        (SO_0001157)
        """
        return _namespace_SO('SO_0001157')

    @classmethod
    def E_box_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, usually located between -60 and +1 relative to the TSS. Consensus sequence is AWCAGCTGWT. Tends to co-occur with DMv2 (cls, SO:0001161). Tends to not occur with DPE motif (SO:0000015). (PMID:12537576:16827941)
        (SO_0001158)
        """
        return _namespace_SO('SO_0001158')

    @classmethod
    def DMv5_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, usually located between -50 and -10 relative to the TSS. Consensus sequence is KTYRGTATWTTT. Tends to co-occur with DMv4 (cls, SO:0001157) . Tends to not occur with DPE motif (SO:0000015) or MTE (SO:0001162). (PMID:12537576:16827941)
        (SO_0001159)
        """
        return _namespace_SO('SO_0001159')

    @classmethod
    def DMv3_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, usually located between -30 and +15 relative to the TSS. Consensus sequence is KNNCAKCNCTRNY. Tends to co-occur with DMv2 (cls, SO:0001161). Tends to not occur with DPE motif (SO:0000015) or MTE (0001162). (PMID:12537576:16827941)
        (SO_0001160)
        """
        return _namespace_SO('SO_0001160')

    @classmethod
    def DMv2_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, usually located between -60 and -45 relative to the TSS. Consensus sequence is MKSYGGCARCGSYSS. Tends to co-occur with DMv3 (cls, SO:0001160). Tends to not occur with DPE motif (SO:0000015) or MTE (SO:0001162). (PMID:12537576:16827941)
        (SO_0001161)
        """
        return _namespace_SO('SO_0001161')

    @classmethod
    def MTE(cls):
        """A sequence element characteristic of some RNA polymerase II promoters, usually located between +20 and +30 relative to the TSS. Consensus sequence is CSARCSSAACGS. Tends to co-occur with INR motif (cls, SO:0000014). Tends to not occur with DPE motif (SO:0000015) or DMv5 (SO:0001159). (PMID:12537576:15231738, PMID:16858867)
        (SO_0001162)
        """
        return _namespace_SO('SO_0001162')

    @classmethod
    def INR1_motif(cls):
        """A promoter motif with consensus sequence TCATTCG. (cls, PMID:16827941)
        (SO_0001163)
        """
        return _namespace_SO('SO_0001163')

    @classmethod
    def DPE1_motif(cls):
        """A promoter motif with consensus sequence CGGACGT. (cls, PMID:16827941)
        (SO_0001164)
        """
        return _namespace_SO('SO_0001164')

    @classmethod
    def DMv1_motif(cls):
        """A promoter motif with consensus sequence CARCCCT. (cls, PMID:16827941)
        (SO_0001165)
        """
        return _namespace_SO('SO_0001165')

    @classmethod
    def GAGA_motif(cls):
        """A non directional promoter motif with consensus sequence GAGAGCG. (cls, PMID:16827941)
        (SO_0001166)
        """
        return _namespace_SO('SO_0001166')

    @classmethod
    def NDM2_motif(cls):
        """A non directional promoter motif with consensus CGMYGYCR. (cls, PMID:16827941)
        (SO_0001167)
        """
        return _namespace_SO('SO_0001167')

    @classmethod
    def NDM3_motif(cls):
        """A non directional promoter motif with consensus sequence GAAAGCT. (cls, PMID:16827941)
        (SO_0001168)
        """
        return _namespace_SO('SO_0001168')

    @classmethod
    def ds_RNA_viral_sequence(cls):
        """A ds_RNA_viral_sequence is a viral_sequence that is the sequence of a virus that exists as double stranded RNA. (cls, SO:ke)
        (SO_0001169)
        """
        return _namespace_SO('SO_0001169')

    @classmethod
    def polinton(cls):
        """A kind of DNA transposon that populates the genomes of protists, fungi, and animals, characterized by a unique set of proteins necessary for their transposition, including a protein-primed DNA polymerase B, retroviral integrase, cysteine protease, and ATPase. Polintons are characterized by 6-bp target site duplications, terminal-inverted repeats that are several hundred nucleotides long, and 5'-AG and TC-3' termini. Polintons exist as autonomous and nonautonomous elements. (cls, PMID:16537396)
        (SO_0001170)
        """
        return _namespace_SO('SO_0001170')

    @classmethod
    def rRNA_21S(cls):
        """A component of the large ribosomal subunit in mitochondrial rRNA. (cls, RSC:cb)
        (SO_0001171)
        """
        return _namespace_SO('SO_0001171')

    @classmethod
    def tRNA_region(cls):
        """A region of a tRNA. (cls, RSC:cb)
        (SO_0001172)
        """
        return _namespace_SO('SO_0001172')

    @classmethod
    def anticodon_loop(cls):
        """A sequence of seven nucleotide bases in tRNA which contains the anticodon. It has the sequence 5'-pyrimidine-purine-anticodon-modified purine-any base-3. (cls, ISBN:0716719207)
        (SO_0001173)
        """
        return _namespace_SO('SO_0001173')

    @classmethod
    def anticodon(cls):
        """A sequence of three nucleotide bases in tRNA which recognizes a codon in mRNA. (cls, RSC:cb)
        (SO_0001174)
        """
        return _namespace_SO('SO_0001174')

    @classmethod
    def CCA_tail(cls):
        """Base sequence at the 3' end of a tRNA. The 3'-hydroxyl group on the terminal adenosine is the attachment point for the amino acid. (cls, ISBN:0716719207)
        (SO_0001175)
        """
        return _namespace_SO('SO_0001175')

    @classmethod
    def DHU_loop(cls):
        """Non-base-paired sequence of nucleotide bases in tRNA. It contains several dihydrouracil residues. (cls, ISBN:071671920)
        (SO_0001176)
        """
        return _namespace_SO('SO_0001176')

    @classmethod
    def T_loop(cls):
        """Non-base-paired sequence of three nucleotide bases in tRNA. It has sequence T-Psi-C. (cls, ISBN:0716719207)
        (SO_0001177)
        """
        return _namespace_SO('SO_0001177')

    @classmethod
    def pyrrolysine_tRNA_primary_transcript(cls):
        """A primary transcript encoding pyrrolysyl tRNA (cls, SO:0000766). (RSC:cb)
        (SO_0001178)
        """
        return _namespace_SO('SO_0001178')

    @classmethod
    def U3_snoRNA(cls):
        """U3 snoRNA is a member of the box C/D class of small nucleolar RNAs. The U3 snoRNA secondary structure is characterised by a small 5' domain (cls, with boxes A and A'), and a larger 3' domain (with boxes B, C, C', and D), the two domains being linked by a single-stranded hinge. Boxes B and C form the B/C motif, which appears to be exclusive to U3 snoRNAs, and boxes C' and D form the C'/D motif. The latter is functionally similar to the C/D motifs found in other snoRNAs. The 5' domain and the hinge region act as a pre-rRNA-binding domain. The 3' domain has conserved protein-binding sites. Both the box B/C and box C'/D motifs are sufficient for nuclear retention of U3 snoRNA. The box C'/D motif is also necessary for nucleolar localization, stability and hypermethylation of U3 snoRNA. Both box B/C and C'/D motifs are involved in specific protein interactions and are necessary for the rRNA processing functions of U3 snoRNA. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00012)
        (SO_0001179)
        """
        return _namespace_SO('SO_0001179')

    @classmethod
    def AU_rich_element(cls):
        """A cis-acting element found in the 3' UTR of some mRNA which is rich in AUUUA pentamers. Messenger RNAs bearing multiple AU-rich elements are often unstable. (cls, PMID:7892223)
        (SO_0001180)
        """
        return _namespace_SO('SO_0001180')

    @classmethod
    def Bruno_response_element(cls):
        """A cis-acting element found in the 3' UTR of some mRNA which is bound by the Drosophila Bruno protein and its homologs. (cls, PMID:10893231)
        (SO_0001181)
        """
        return _namespace_SO('SO_0001181')

    @classmethod
    def iron_responsive_element(cls):
        """A regulatory sequence found in the 5' and 3' UTRs of many mRNAs which encode iron-binding proteins. It has a hairpin structure and is recognized by trans-acting proteins known as iron-regulatory proteins. (cls, PMID:3198610, PMID:8710843)
        (SO_0001182)
        """
        return _namespace_SO('SO_0001182')

    @classmethod
    def morpholino_backbone(cls):
        """An attribute describing a sequence composed of nucleobases bound to a morpholino backbone. A morpholino backbone consists of morpholine (cls, CHEBI:34856) rings connected by phosphorodiamidate linkages. (RSC:cb)
        (SO_0001183)
        """
        return _namespace_SO('SO_0001183')

    @classmethod
    def PNA(cls):
        """An attribute describing a sequence composed of peptide nucleic acid (cls, CHEBI:48021), a chemical consisting of nucleobases bound to a backbone composed of repeating N-(2-aminoethyl)-glycine units linked by peptide bonds. The purine and pyrimidine bases are linked to the backbone by methylene carbonyl bonds. (RSC:cb)
        (SO_0001184)
        """
        return _namespace_SO('SO_0001184')

    @classmethod
    def enzymatic(cls):
        """An attribute describing the sequence of a transcript that has catalytic activity with or without an associated ribonucleoprotein. (cls, RSC:cb)
        (SO_0001185)
        """
        return _namespace_SO('SO_0001185')

    @classmethod
    def ribozymic(cls):
        """An attribute describing the sequence of a transcript that has catalytic activity even without an associated ribonucleoprotein. (cls, RSC:cb)
        (SO_0001186)
        """
        return _namespace_SO('SO_0001186')

    @classmethod
    def pseudouridylation_guide_snoRNA(cls):
        """A snoRNA that specifies the site of pseudouridylation in an RNA molecule by base pairing with a short sequence around the target residue. (cls, GOC:mah, PMID:12457565)
        (SO_0001187)
        """
        return _namespace_SO('SO_0001187')

    @classmethod
    def LNA(cls):
        """An attribute describing a sequence consisting of nucleobases attached to a repeating unit made of 'locked' deoxyribose rings connected to a phosphate backbone. The deoxyribose unit's conformation is 'locked' by a 2'-C,4'-C-oxymethylene link. (cls, CHEBI:48010)
        (SO_0001188)
        """
        return _namespace_SO('SO_0001188')

    @classmethod
    def LNA_oligo(cls):
        """An oligo composed of LNA residues. (cls, RSC:cb)
        (SO_0001189)
        """
        return _namespace_SO('SO_0001189')

    @classmethod
    def TNA(cls):
        """An attribute describing a sequence consisting of nucleobases attached to a repeating unit made of threose rings connected to a phosphate backbone. (cls, CHEBI:48019)
        (SO_0001190)
        """
        return _namespace_SO('SO_0001190')

    @classmethod
    def TNA_oligo(cls):
        """An oligo composed of TNA residues. (cls, RSC:cb)
        (SO_0001191)
        """
        return _namespace_SO('SO_0001191')

    @classmethod
    def GNA(cls):
        """An attribute describing a sequence consisting of nucleobases attached to a repeating unit made of an acyclic three-carbon propylene glycol connected to a phosphate backbone. It has two enantiomeric forms, (cls, R)-GNA and (S)-GNA. (CHEBI:48015)
        (SO_0001192)
        """
        return _namespace_SO('SO_0001192')

    @classmethod
    def GNA_oligo(cls):
        """An oligo composed of GNA residues. (cls, RSC:cb)
        (SO_0001193)
        """
        return _namespace_SO('SO_0001193')

    @classmethod
    def R_GNA(cls):
        """An attribute describing a GNA sequence in the (cls, R)-GNA enantiomer. (CHEBI:48016)
        (SO_0001194)
        """
        return _namespace_SO('SO_0001194')

    @classmethod
    def R_GNA_oligo(cls):
        """An oligo composed of (cls, R)-GNA residues. (RSC:cb)
        (SO_0001195)
        """
        return _namespace_SO('SO_0001195')

    @classmethod
    def S_GNA(cls):
        """An attribute describing a GNA sequence in the (cls, S)-GNA enantiomer. (CHEBI:48017)
        (SO_0001196)
        """
        return _namespace_SO('SO_0001196')

    @classmethod
    def S_GNA_oligo(cls):
        """An oligo composed of (cls, S)-GNA residues. (RSC:cb)
        (SO_0001197)
        """
        return _namespace_SO('SO_0001197')

    @classmethod
    def ds_DNA_viral_sequence(cls):
        """A ds_DNA_viral_sequence is a viral_sequence that is the sequence of a virus that exists as double stranded DNA. (cls, SO:ke)
        (SO_0001198)
        """
        return _namespace_SO('SO_0001198')

    @classmethod
    def ss_RNA_viral_sequence(cls):
        """A ss_RNA_viral_sequence is a viral_sequence that is the sequence of a virus that exists as single stranded RNA. (cls, SO:ke)
        (SO_0001199)
        """
        return _namespace_SO('SO_0001199')

    @classmethod
    def negative_sense_ssRNA_viral_sequence(cls):
        """A negative_sense_RNA_viral_sequence is a ss_RNA_viral_sequence that is the sequence of a single stranded RNA virus that is complementary to mRNA and must be converted to positive sense RNA by RNA polymerase before translation. (cls, SO:ke)
        (SO_0001200)
        """
        return _namespace_SO('SO_0001200')

    @classmethod
    def positive_sense_ssRNA_viral_sequence(cls):
        """A positive_sense_RNA_viral_sequence is a ss_RNA_viral_sequence that is the sequence of a single stranded RNA virus that can be immediately translated by the host. (cls, SO:ke)
        (SO_0001201)
        """
        return _namespace_SO('SO_0001201')

    @classmethod
    def ambisense_ssRNA_viral_sequence(cls):
        """A ambisense_RNA_virus is a ss_RNA_viral_sequence that is the sequence of a single stranded RNA virus with both messenger and anti messenger polarity. (cls, SO:ke)
        (SO_0001202)
        """
        return _namespace_SO('SO_0001202')

    @classmethod
    def RNA_polymerase_promoter(cls):
        """A region (cls, DNA) to which RNA polymerase binds, to begin transcription. (xenbase:jb)
        (SO_0001203)
        """
        return _namespace_SO('SO_0001203')

    @classmethod
    def Phage_RNA_Polymerase_Promoter(cls):
        """A region (cls, DNA) to which Bacteriophage RNA polymerase binds, to begin transcription. (xenbase:jb)
        (SO_0001204)
        """
        return _namespace_SO('SO_0001204')

    @classmethod
    def SP6_RNA_Polymerase_Promoter(cls):
        """A region (cls, DNA) to which the SP6 RNA polymerase binds, to begin transcription. (xenbase:jb)
        (SO_0001205)
        """
        return _namespace_SO('SO_0001205')

    @classmethod
    def T3_RNA_Polymerase_Promoter(cls):
        """A DNA sequence to which the T3 RNA polymerase binds, to begin transcription. (cls, xenbase:jb)
        (SO_0001206)
        """
        return _namespace_SO('SO_0001206')

    @classmethod
    def T7_RNA_Polymerase_Promoter(cls):
        """A region (cls, DNA) to which the T7 RNA polymerase binds, to begin transcription. (xenbase:jb)
        (SO_0001207)
        """
        return _namespace_SO('SO_0001207')

    @classmethod
    def five_prime_EST(cls):
        """An EST read from the 5' end of a transcript that usually codes for a protein. These regions tend to be conserved across species and do not change much within a gene family. (cls, http://www.ncbi.nlm.nih.gov/About/primer/est.html)
        (SO_0001208)
        """
        return _namespace_SO('SO_0001208')

    @classmethod
    def three_prime_EST(cls):
        """An EST read from the 3' end of a transcript. They are more likely to fall within non-coding, or untranslated regions(cls, UTRs). (http://www.ncbi.nlm.nih.gov/About/primer/est.html)
        (SO_0001209)
        """
        return _namespace_SO('SO_0001209')

    @classmethod
    def translational_frameshift(cls):
        """The region of mRNA (cls, not divisible by 3 bases) that is skipped during the process of translational frameshifting (GO:0006452), causing the reading frame to be different. (SO:ke)
        (SO_0001210)
        """
        return _namespace_SO('SO_0001210')

    @classmethod
    def plus_1_translational_frameshift(cls):
        """The region of mRNA 1 base long that is skipped during the process of translational frameshifting (cls, GO:0006452), causing the reading frame to be different. (SO:ke)
        (SO_0001211)
        """
        return _namespace_SO('SO_0001211')

    @classmethod
    def plus_2_translational_frameshift(cls):
        """The region of mRNA 2 bases long that is skipped during the process of translational frameshifting (cls, GO:0006452), causing the reading frame to be different. (SO:ke)
        (SO_0001212)
        """
        return _namespace_SO('SO_0001212')

    @classmethod
    def group_III_intron(cls):
        """Group III introns are introns found in the mRNA of the plastids of euglenoid protists. They are spliced by a two step transesterification with bulged adenosine as initiating nucleophile. (cls, PMID:11377794)
        (SO_0001213)
        """
        return _namespace_SO('SO_0001213')

    @classmethod
    def noncoding_region_of_exon(cls):
        """The maximal intersection of exon and UTR. (cls, SO:ke)
        (SO_0001214)
        """
        return _namespace_SO('SO_0001214')

    @classmethod
    def coding_region_of_exon(cls):
        """The region of an exon that encodes for protein sequence. (cls, SO:ke)
        (SO_0001215)
        """
        return _namespace_SO('SO_0001215')

    @classmethod
    def endonuclease_spliced_intron(cls):
        """An intron that spliced via endonucleolytic cleavage and ligation rather than transesterification. (cls, SO:ke)
        (SO_0001216)
        """
        return _namespace_SO('SO_0001216')

    @classmethod
    def protein_coding_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001217)
        """
        return _namespace_SO('SO_0001217')

    @classmethod
    def transgenic_insertion(cls):
        """An insertion that derives from another organism, via the use of recombinant DNA technology. (cls, SO:bm)
        (SO_0001218)
        """
        return _namespace_SO('SO_0001218')

    @classmethod
    def retrogene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001219)
        """
        return _namespace_SO('SO_0001219')

    @classmethod
    def silenced_by_RNA_interference(cls):
        """An attribute describing an epigenetic process where a gene is inactivated by RNA interference. (cls, RSC:cb)
        (SO_0001220)
        """
        return _namespace_SO('SO_0001220')

    @classmethod
    def silenced_by_histone_modification(cls):
        """An attribute describing an epigenetic process where a gene is inactivated by histone modification. (cls, RSC:cb)
        (SO_0001221)
        """
        return _namespace_SO('SO_0001221')

    @classmethod
    def silenced_by_histone_methylation(cls):
        """An attribute describing an epigenetic process where a gene is inactivated by histone methylation. (cls, RSC:cb)
        (SO_0001222)
        """
        return _namespace_SO('SO_0001222')

    @classmethod
    def silenced_by_histone_deacetylation(cls):
        """An attribute describing an epigenetic process where a gene is inactivated by histone deacetylation. (cls, RSC:cb)
        (SO_0001223)
        """
        return _namespace_SO('SO_0001223')

    @classmethod
    def gene_silenced_by_RNA_interference(cls):
        """A gene that is silenced by RNA interference. (cls, SO:xp)
        (SO_0001224)
        """
        return _namespace_SO('SO_0001224')

    @classmethod
    def gene_silenced_by_histone_modification(cls):
        """A gene that is silenced by histone modification. (cls, SO:xp)
        (SO_0001225)
        """
        return _namespace_SO('SO_0001225')

    @classmethod
    def gene_silenced_by_histone_methylation(cls):
        """A gene that is silenced by histone methylation. (cls, SO:xp)
        (SO_0001226)
        """
        return _namespace_SO('SO_0001226')

    @classmethod
    def gene_silenced_by_histone_deacetylation(cls):
        """A gene that is silenced by histone deacetylation. (cls, SO:xp)
        (SO_0001227)
        """
        return _namespace_SO('SO_0001227')

    @classmethod
    def dihydrouridine(cls):
        """A modified RNA base in which the 5,6-dihydrouracil is bound to the ribose ring. (cls, RSC:cb)
        (SO_0001228)
        """
        return _namespace_SO('SO_0001228')

    @classmethod
    def pseudouridine(cls):
        """A modified RNA base in which the 5- position of the uracil is bound to the ribose ring instead of the 4- position. (cls, RSC:cb)
        (SO_0001229)
        """
        return _namespace_SO('SO_0001229')

    @classmethod
    def inosine(cls):
        """A modified RNA base in which hypoxanthine is bound to the ribose ring. (cls, http://library.med.utah.edu/RNAmods/, RSC:cb)
        (SO_0001230)
        """
        return _namespace_SO('SO_0001230')

    @classmethod
    def seven_methylguanine(cls):
        """A modified RNA base in which guanine is methylated at the 7- position. (cls, RSC:cb)
        (SO_0001231)
        """
        return _namespace_SO('SO_0001231')

    @classmethod
    def ribothymidine(cls):
        """A modified RNA base in which thymine is bound to the ribose ring. (cls, RSC:cb)
        (SO_0001232)
        """
        return _namespace_SO('SO_0001232')

    @classmethod
    def methylinosine(cls):
        """A modified RNA base in which methylhypoxanthine is bound to the ribose ring. (cls, RSC:cb)
        (SO_0001233)
        """
        return _namespace_SO('SO_0001233')

    @classmethod
    def mobile(cls):
        """An attribute describing a feature that has either intra-genome or intracellular mobility. (cls, RSC:cb)
        (SO_0001234)
        """
        return _namespace_SO('SO_0001234')

    @classmethod
    def replicon(cls):
        """A region containing at least one unique origin of replication and a unique termination site. (cls, ISBN:0716719207)
        (SO_0001235)
        """
        return _namespace_SO('SO_0001235')

    @classmethod
    def base(cls):
        """A base is a sequence feature that corresponds to a single unit of a nucleotide polymer. (cls, SO:ke)
        (SO_0001236)
        """
        return _namespace_SO('SO_0001236')

    @classmethod
    def amino_acid(cls):
        """A sequence feature that corresponds to a single amino acid residue in a polypeptide. (cls, RSC:cb)
        (SO_0001237)
        """
        return _namespace_SO('SO_0001237')

    @classmethod
    def major_TSS(cls):
        """-- No comment or description provided. --
        (cls, SO_0001238)
        """
        return _namespace_SO('SO_0001238')

    @classmethod
    def minor_TSS(cls):
        """-- No comment or description provided. --
        (cls, SO_0001239)
        """
        return _namespace_SO('SO_0001239')

    @classmethod
    def TSS_region(cls):
        """The region of a gene from the 5' most TSS to the 3' TSS. (cls, BBOP:nw)
        (SO_0001240)
        """
        return _namespace_SO('SO_0001240')

    @classmethod
    def encodes_alternate_transcription_start_sites(cls):
        """-- No comment or description provided. --
        (cls, SO_0001241)
        """
        return _namespace_SO('SO_0001241')

    @classmethod
    def miRNA_primary_transcript_region(cls):
        """A part of an miRNA primary_transcript. (cls, SO:ke)
        (SO_0001243)
        """
        return _namespace_SO('SO_0001243')

    @classmethod
    def pre_miRNA(cls):
        """The 60-70 nucleotide region remain after Drosha processing of the primary transcript, that folds back upon itself to form a hairpin sructure. (cls, SO:ke)
        (SO_0001244)
        """
        return _namespace_SO('SO_0001244')

    @classmethod
    def miRNA_stem(cls):
        """The stem of the hairpin loop formed by folding of the pre-miRNA. (cls, SO:ke)
        (SO_0001245)
        """
        return _namespace_SO('SO_0001245')

    @classmethod
    def miRNA_loop(cls):
        """The loop of the hairpin loop formed by folding of the pre-miRNA. (cls, SO:ke)
        (SO_0001246)
        """
        return _namespace_SO('SO_0001246')

    @classmethod
    def synthetic_oligo(cls):
        """An oligo composed of synthetic nucleotides. (cls, SO:ke)
        (SO_0001247)
        """
        return _namespace_SO('SO_0001247')

    @classmethod
    def assembly(cls):
        """A region of the genome of known length that is composed by ordering and aligning two or more different regions. (cls, SO:ke)
        (SO_0001248)
        """
        return _namespace_SO('SO_0001248')

    @classmethod
    def fragment_assembly(cls):
        """A fragment assembly is a genome assembly that orders overlapping fragments of the genome based on landmark sequences. The base pair distance between the landmarks is known allowing additivity of lengths. (cls, SO:ke)
        (SO_0001249)
        """
        return _namespace_SO('SO_0001249')

    @classmethod
    def fingerprint_map(cls):
        """A fingerprint_map is a physical map composed of restriction fragments. (cls, SO:ke)
        (SO_0001250)
        """
        return _namespace_SO('SO_0001250')

    @classmethod
    def STS_map(cls):
        """An STS map is a physical map organized by the unique STS landmarks. (cls, SO:ke)
        (SO_0001251)
        """
        return _namespace_SO('SO_0001251')

    @classmethod
    def RH_map(cls):
        """A radiation hybrid map is a physical map. (cls, SO:ke)
        (SO_0001252)
        """
        return _namespace_SO('SO_0001252')

    @classmethod
    def sonicate_fragment(cls):
        """A DNA fragment generated by sonication. Sonication is a technique used to sheer DNA into smaller fragments. (cls, SO:ke)
        (SO_0001253)
        """
        return _namespace_SO('SO_0001253')

    @classmethod
    def polyploid(cls):
        """A kind of chromosome variation where the chromosome complement is an exact multiple of the haploid number and is greater than the diploid number. (cls, SO:ke)
        (SO_0001254)
        """
        return _namespace_SO('SO_0001254')

    @classmethod
    def autopolyploid(cls):
        """A polyploid where the multiple chromosome set was derived from the same organism. (cls, SO:ke)
        (SO_0001255)
        """
        return _namespace_SO('SO_0001255')

    @classmethod
    def allopolyploid(cls):
        """A polyploid where the multiple chromosome set was derived from a different organism. (cls, SO:ke)
        (SO_0001256)
        """
        return _namespace_SO('SO_0001256')

    @classmethod
    def homing_endonuclease_binding_site(cls):
        """The binding site (cls, recognition site) of a homing endonuclease. The binding site is typically large. (SO:ke)
        (SO_0001257)
        """
        return _namespace_SO('SO_0001257')

    @classmethod
    def octamer_motif(cls):
        """A sequence element characteristic of some RNA polymerase II promoters with sequence ATTGCAT that binds Pou-domain transcription factors. (cls, GOC:dh, PMID:3095662)
        (SO_0001258)
        """
        return _namespace_SO('SO_0001258')

    @classmethod
    def apicoplast_chromosome(cls):
        """A chromosome originating in an apicoplast. (cls, SO:xp)
        (SO_0001259)
        """
        return _namespace_SO('SO_0001259')

    @classmethod
    def sequence_collection(cls):
        """A collection of discontinuous sequences. (cls, SO:ke)
        (SO_0001260)
        """
        return _namespace_SO('SO_0001260')

    @classmethod
    def overlapping_feature_set(cls):
        """A continuous region of sequence composed of the overlapping of multiple sequence_features, which ultimately provides evidence for another sequence_feature. (cls, SO:ke)
        (SO_0001261)
        """
        return _namespace_SO('SO_0001261')

    @classmethod
    def overlapping_EST_set(cls):
        """A continous experimental result region extending the length of multiple overlapping EST's. (cls, SO:ke)
        (SO_0001262)
        """
        return _namespace_SO('SO_0001262')

    @classmethod
    def ncRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001263)
        """
        return _namespace_SO('SO_0001263')

    @classmethod
    def gRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001264)
        """
        return _namespace_SO('SO_0001264')

    @classmethod
    def miRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001265)
        """
        return _namespace_SO('SO_0001265')

    @classmethod
    def scRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001266)
        """
        return _namespace_SO('SO_0001266')

    @classmethod
    def snoRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001267)
        """
        return _namespace_SO('SO_0001267')

    @classmethod
    def snRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001268)
        """
        return _namespace_SO('SO_0001268')

    @classmethod
    def SRP_RNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001269)
        """
        return _namespace_SO('SO_0001269')

    @classmethod
    def stRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001270)
        """
        return _namespace_SO('SO_0001270')

    @classmethod
    def tmRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001271)
        """
        return _namespace_SO('SO_0001271')

    @classmethod
    def tRNA_gene(cls):
        """-- No comment or description provided. --
        (cls, SO_0001272)
        """
        return _namespace_SO('SO_0001272')

    @classmethod
    def modified_adenosine(cls):
        """A modified adenine is an adenine base feature that has been altered. (cls, SO:ke)
        (SO_0001273)
        """
        return _namespace_SO('SO_0001273')

    @classmethod
    def modified_inosine(cls):
        """A modified inosine is an inosine base feature that has been altered. (cls, SO:ke)
        (SO_0001274)
        """
        return _namespace_SO('SO_0001274')

    @classmethod
    def modified_cytidine(cls):
        """A modified cytidine is a cytidine base feature which has been altered. (cls, SO:ke)
        (SO_0001275)
        """
        return _namespace_SO('SO_0001275')

    @classmethod
    def modified_guanosine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001276)
        """
        return _namespace_SO('SO_0001276')

    @classmethod
    def modified_uridine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001277)
        """
        return _namespace_SO('SO_0001277')

    @classmethod
    def one_methylinosine(cls):
        """1-methylinosine is a modified insosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001278)
        """
        return _namespace_SO('SO_0001278')

    @classmethod
    def one_two_prime_O_dimethylinosine(cls):
        """1,2'-O-dimethylinosine is a modified inosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001279)
        """
        return _namespace_SO('SO_0001279')

    @classmethod
    def two_prime_O_methylinosine(cls):
        """2'-O-methylinosine is a modified inosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001280)
        """
        return _namespace_SO('SO_0001280')

    @classmethod
    def three_methylcytidine(cls):
        """3-methylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001281)
        """
        return _namespace_SO('SO_0001281')

    @classmethod
    def five_methylcytidine(cls):
        """5-methylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001282)
        """
        return _namespace_SO('SO_0001282')

    @classmethod
    def two_prime_O_methylcytidine(cls):
        """2'-O-methylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001283)
        """
        return _namespace_SO('SO_0001283')

    @classmethod
    def two_thiocytidine(cls):
        """2-thiocytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001284)
        """
        return _namespace_SO('SO_0001284')

    @classmethod
    def N4_acetylcytidine(cls):
        """N4-acetylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001285)
        """
        return _namespace_SO('SO_0001285')

    @classmethod
    def five_formylcytidine(cls):
        """5-formylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001286)
        """
        return _namespace_SO('SO_0001286')

    @classmethod
    def five_two_prime_O_dimethylcytidine(cls):
        """5,2'-O-dimethylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001287)
        """
        return _namespace_SO('SO_0001287')

    @classmethod
    def N4_acetyl_2_prime_O_methylcytidine(cls):
        """N4-acetyl-2'-O-methylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001288)
        """
        return _namespace_SO('SO_0001288')

    @classmethod
    def lysidine(cls):
        """Lysidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001289)
        """
        return _namespace_SO('SO_0001289')

    @classmethod
    def N4_methylcytidine(cls):
        """N4-methylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001290)
        """
        return _namespace_SO('SO_0001290')

    @classmethod
    def N4_2_prime_O_dimethylcytidine(cls):
        """N4,2'-O-dimethylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001291)
        """
        return _namespace_SO('SO_0001291')

    @classmethod
    def five_hydroxymethylcytidine(cls):
        """5-hydroxymethylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001292)
        """
        return _namespace_SO('SO_0001292')

    @classmethod
    def five_formyl_two_prime_O_methylcytidine(cls):
        """5-formyl-2'-O-methylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001293)
        """
        return _namespace_SO('SO_0001293')

    @classmethod
    def N4_N4_2_prime_O_trimethylcytidine(cls):
        """N4_N4_2_prime_O_trimethylcytidine is a modified cytidine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001294)
        """
        return _namespace_SO('SO_0001294')

    @classmethod
    def one_methyladenosine(cls):
        """1_methyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001295)
        """
        return _namespace_SO('SO_0001295')

    @classmethod
    def two_methyladenosine(cls):
        """2_methyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001296)
        """
        return _namespace_SO('SO_0001296')

    @classmethod
    def N6_methyladenosine(cls):
        """N6_methyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001297)
        """
        return _namespace_SO('SO_0001297')

    @classmethod
    def two_prime_O_methyladenosine(cls):
        """2prime_O_methyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001298)
        """
        return _namespace_SO('SO_0001298')

    @classmethod
    def two_methylthio_N6_methyladenosine(cls):
        """2_methylthio_N6_methyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001299)
        """
        return _namespace_SO('SO_0001299')

    @classmethod
    def N6_isopentenyladenosine(cls):
        """N6_isopentenyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001300)
        """
        return _namespace_SO('SO_0001300')

    @classmethod
    def two_methylthio_N6_isopentenyladenosine(cls):
        """2_methylthio_N6_isopentenyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001301)
        """
        return _namespace_SO('SO_0001301')

    @classmethod
    def N6_cis_hydroxyisopentenyl_adenosine(cls):
        """N6_cis_hydroxyisopentenyl_adenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001302)
        """
        return _namespace_SO('SO_0001302')

    @classmethod
    def two_methylthio_N6_cis_hydroxyisopentenyl_adenosine(cls):
        """2_methylthio_N6_cis_hydroxyisopentenyl_adenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001303)
        """
        return _namespace_SO('SO_0001303')

    @classmethod
    def N6_glycinylcarbamoyladenosine(cls):
        """N6_glycinylcarbamoyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001304)
        """
        return _namespace_SO('SO_0001304')

    @classmethod
    def N6_threonylcarbamoyladenosine(cls):
        """N6_threonylcarbamoyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001305)
        """
        return _namespace_SO('SO_0001305')

    @classmethod
    def two_methylthio_N6_threonyl_carbamoyladenosine(cls):
        """2_methylthio_N6_threonyl_carbamoyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001306)
        """
        return _namespace_SO('SO_0001306')

    @classmethod
    def N6_methyl_N6_threonylcarbamoyladenosine(cls):
        """N6_methyl_N6_threonylcarbamoyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001307)
        """
        return _namespace_SO('SO_0001307')

    @classmethod
    def N6_hydroxynorvalylcarbamoyladenosine(cls):
        """N6_hydroxynorvalylcarbamoyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001308)
        """
        return _namespace_SO('SO_0001308')

    @classmethod
    def two_methylthio_N6_hydroxynorvalyl_carbamoyladenosine(cls):
        """2_methylthio_N6_hydroxynorvalyl_carbamoyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001309)
        """
        return _namespace_SO('SO_0001309')

    @classmethod
    def two_prime_O_ribosyladenosine_phosphate(cls):
        """2prime_O_ribosyladenosine_phosphate is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001310)
        """
        return _namespace_SO('SO_0001310')

    @classmethod
    def N6_N6_dimethyladenosine(cls):
        """N6_N6_dimethyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001311)
        """
        return _namespace_SO('SO_0001311')

    @classmethod
    def N6_2_prime_O_dimethyladenosine(cls):
        """N6_2prime_O_dimethyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001312)
        """
        return _namespace_SO('SO_0001312')

    @classmethod
    def N6_N6_2_prime_O_trimethyladenosine(cls):
        """N6_N6_2prime_O_trimethyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001313)
        """
        return _namespace_SO('SO_0001313')

    @classmethod
    def one_two_prime_O_dimethyladenosine(cls):
        """1,2'-O-dimethyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001314)
        """
        return _namespace_SO('SO_0001314')

    @classmethod
    def N6_acetyladenosine(cls):
        """N6_acetyladenosine is a modified adenosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001315)
        """
        return _namespace_SO('SO_0001315')

    @classmethod
    def seven_deazaguanosine(cls):
        """7-deazaguanosine is a moddified guanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001316)
        """
        return _namespace_SO('SO_0001316')

    @classmethod
    def queuosine(cls):
        """Queuosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001317)
        """
        return _namespace_SO('SO_0001317')

    @classmethod
    def epoxyqueuosine(cls):
        """Epoxyqueuosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001318)
        """
        return _namespace_SO('SO_0001318')

    @classmethod
    def galactosyl_queuosine(cls):
        """Galactosyl_queuosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001319)
        """
        return _namespace_SO('SO_0001319')

    @classmethod
    def mannosyl_queuosine(cls):
        """Mannosyl_queuosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001320)
        """
        return _namespace_SO('SO_0001320')

    @classmethod
    def seven_cyano_seven_deazaguanosine(cls):
        """7_cyano_7_deazaguanosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001321)
        """
        return _namespace_SO('SO_0001321')

    @classmethod
    def seven_aminomethyl_seven_deazaguanosine(cls):
        """7_aminomethyl_7_deazaguanosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001322)
        """
        return _namespace_SO('SO_0001322')

    @classmethod
    def archaeosine(cls):
        """Archaeosine is a modified 7-deazoguanosine. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001323)
        """
        return _namespace_SO('SO_0001323')

    @classmethod
    def one_methylguanosine(cls):
        """1_methylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001324)
        """
        return _namespace_SO('SO_0001324')

    @classmethod
    def N2_methylguanosine(cls):
        """N2_methylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001325)
        """
        return _namespace_SO('SO_0001325')

    @classmethod
    def seven_methylguanosine(cls):
        """7_methylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001326)
        """
        return _namespace_SO('SO_0001326')

    @classmethod
    def two_prime_O_methylguanosine(cls):
        """2prime_O_methylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001327)
        """
        return _namespace_SO('SO_0001327')

    @classmethod
    def N2_N2_dimethylguanosine(cls):
        """N2_N2_dimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001328)
        """
        return _namespace_SO('SO_0001328')

    @classmethod
    def N2_2_prime_O_dimethylguanosine(cls):
        """N2_2prime_O_dimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001329)
        """
        return _namespace_SO('SO_0001329')

    @classmethod
    def N2_N2_2_prime_O_trimethylguanosine(cls):
        """N2_N2_2prime_O_trimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001330)
        """
        return _namespace_SO('SO_0001330')

    @classmethod
    def two_prime_O_ribosylguanosine_phosphate(cls):
        """2prime_O_ribosylguanosine_phosphate is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001331)
        """
        return _namespace_SO('SO_0001331')

    @classmethod
    def wybutosine(cls):
        """Wybutosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001332)
        """
        return _namespace_SO('SO_0001332')

    @classmethod
    def peroxywybutosine(cls):
        """Peroxywybutosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001333)
        """
        return _namespace_SO('SO_0001333')

    @classmethod
    def hydroxywybutosine(cls):
        """Hydroxywybutosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001334)
        """
        return _namespace_SO('SO_0001334')

    @classmethod
    def undermodified_hydroxywybutosine(cls):
        """Undermodified_hydroxywybutosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001335)
        """
        return _namespace_SO('SO_0001335')

    @classmethod
    def wyosine(cls):
        """Wyosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001336)
        """
        return _namespace_SO('SO_0001336')

    @classmethod
    def methylwyosine(cls):
        """Methylwyosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001337)
        """
        return _namespace_SO('SO_0001337')

    @classmethod
    def N2_7_dimethylguanosine(cls):
        """N2_7_dimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001338)
        """
        return _namespace_SO('SO_0001338')

    @classmethod
    def N2_N2_7_trimethylguanosine(cls):
        """N2_N2_7_trimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001339)
        """
        return _namespace_SO('SO_0001339')

    @classmethod
    def one_two_prime_O_dimethylguanosine(cls):
        """1_2prime_O_dimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001340)
        """
        return _namespace_SO('SO_0001340')

    @classmethod
    def four_demethylwyosine(cls):
        """4_demethylwyosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001341)
        """
        return _namespace_SO('SO_0001341')

    @classmethod
    def isowyosine(cls):
        """Isowyosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001342)
        """
        return _namespace_SO('SO_0001342')

    @classmethod
    def N2_7_2prirme_O_trimethylguanosine(cls):
        """N2_7_2prirme_O_trimethylguanosine is a modified guanosine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001343)
        """
        return _namespace_SO('SO_0001343')

    @classmethod
    def five_methyluridine(cls):
        """5_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001344)
        """
        return _namespace_SO('SO_0001344')

    @classmethod
    def two_prime_O_methyluridine(cls):
        """2prime_O_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001345)
        """
        return _namespace_SO('SO_0001345')

    @classmethod
    def five_two_prime_O_dimethyluridine(cls):
        """5_2_prime_O_dimethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001346)
        """
        return _namespace_SO('SO_0001346')

    @classmethod
    def one_methylpseudouridine(cls):
        """1_methylpseudouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001347)
        """
        return _namespace_SO('SO_0001347')

    @classmethod
    def two_prime_O_methylpseudouridine(cls):
        """2prime_O_methylpseudouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001348)
        """
        return _namespace_SO('SO_0001348')

    @classmethod
    def two_thiouridine(cls):
        """2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001349)
        """
        return _namespace_SO('SO_0001349')

    @classmethod
    def four_thiouridine(cls):
        """4_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001350)
        """
        return _namespace_SO('SO_0001350')

    @classmethod
    def five_methyl_2_thiouridine(cls):
        """5_methyl_2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001351)
        """
        return _namespace_SO('SO_0001351')

    @classmethod
    def two_thio_two_prime_O_methyluridine(cls):
        """2_thio_2prime_O_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001352)
        """
        return _namespace_SO('SO_0001352')

    @classmethod
    def three_three_amino_three_carboxypropyl_uridine(cls):
        """3_3_amino_3_carboxypropyl_uridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001353)
        """
        return _namespace_SO('SO_0001353')

    @classmethod
    def five_hydroxyuridine(cls):
        """5_hydroxyuridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001354)
        """
        return _namespace_SO('SO_0001354')

    @classmethod
    def five_methoxyuridine(cls):
        """5_methoxyuridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001355)
        """
        return _namespace_SO('SO_0001355')

    @classmethod
    def uridine_five_oxyacetic_acid(cls):
        """Uridine_5_oxyacetic_acid is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001356)
        """
        return _namespace_SO('SO_0001356')

    @classmethod
    def uridine_five_oxyacetic_acid_methyl_ester(cls):
        """Uridine_5_oxyacetic_acid_methyl_ester is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001357)
        """
        return _namespace_SO('SO_0001357')

    @classmethod
    def five_carboxyhydroxymethyl_uridine(cls):
        """5_carboxyhydroxymethyl_uridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001358)
        """
        return _namespace_SO('SO_0001358')

    @classmethod
    def five_carboxyhydroxymethyl_uridine_methyl_ester(cls):
        """5_carboxyhydroxymethyl_uridine_methyl_ester is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001359)
        """
        return _namespace_SO('SO_0001359')

    @classmethod
    def five_methoxycarbonylmethyluridine(cls):
        """Five_methoxycarbonylmethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001360)
        """
        return _namespace_SO('SO_0001360')

    @classmethod
    def five_methoxycarbonylmethyl_two_prime_O_methyluridine(cls):
        """Five_methoxycarbonylmethyl_2_prime_O_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001361)
        """
        return _namespace_SO('SO_0001361')

    @classmethod
    def five_methoxycarbonylmethyl_two_thiouridine(cls):
        """5_methoxycarbonylmethyl_2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001362)
        """
        return _namespace_SO('SO_0001362')

    @classmethod
    def five_aminomethyl_two_thiouridine(cls):
        """5_aminomethyl_2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001363)
        """
        return _namespace_SO('SO_0001363')

    @classmethod
    def five_methylaminomethyluridine(cls):
        """5_methylaminomethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001364)
        """
        return _namespace_SO('SO_0001364')

    @classmethod
    def five_methylaminomethyl_two_thiouridine(cls):
        """5_methylaminomethyl_2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001365)
        """
        return _namespace_SO('SO_0001365')

    @classmethod
    def five_methylaminomethyl_two_selenouridine(cls):
        """5_methylaminomethyl_2_selenouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001366)
        """
        return _namespace_SO('SO_0001366')

    @classmethod
    def five_carbamoylmethyluridine(cls):
        """5_carbamoylmethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001367)
        """
        return _namespace_SO('SO_0001367')

    @classmethod
    def five_carbamoylmethyl_two_prime_O_methyluridine(cls):
        """5_carbamoylmethyl_2_prime_O_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001368)
        """
        return _namespace_SO('SO_0001368')

    @classmethod
    def five_carboxymethylaminomethyluridine(cls):
        """5_carboxymethylaminomethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001369)
        """
        return _namespace_SO('SO_0001369')

    @classmethod
    def five_carboxymethylaminomethyl_two_prime_O_methyluridine(cls):
        """5_carboxymethylaminomethyl_2_prime_O_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001370)
        """
        return _namespace_SO('SO_0001370')

    @classmethod
    def five_carboxymethylaminomethyl_two_thiouridine(cls):
        """5_carboxymethylaminomethyl_2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001371)
        """
        return _namespace_SO('SO_0001371')

    @classmethod
    def three_methyluridine(cls):
        """3_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001372)
        """
        return _namespace_SO('SO_0001372')

    @classmethod
    def one_methyl_three_three_amino_three_carboxypropyl_pseudouridine(cls):
        """1_methyl_3_3_amino_3_carboxypropyl_pseudouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001373)
        """
        return _namespace_SO('SO_0001373')

    @classmethod
    def five_carboxymethyluridine(cls):
        """5_carboxymethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001374)
        """
        return _namespace_SO('SO_0001374')

    @classmethod
    def three_two_prime_O_dimethyluridine(cls):
        """3_2prime_O_dimethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001375)
        """
        return _namespace_SO('SO_0001375')

    @classmethod
    def five_methyldihydrouridine(cls):
        """5_methyldihydrouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001376)
        """
        return _namespace_SO('SO_0001376')

    @classmethod
    def three_methylpseudouridine(cls):
        """3_methylpseudouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001377)
        """
        return _namespace_SO('SO_0001377')

    @classmethod
    def five_taurinomethyluridine(cls):
        """5_taurinomethyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001378)
        """
        return _namespace_SO('SO_0001378')

    @classmethod
    def five_taurinomethyl_two_thiouridine(cls):
        """5_taurinomethyl_2_thiouridineis a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001379)
        """
        return _namespace_SO('SO_0001379')

    @classmethod
    def five_isopentenylaminomethyl_uridine(cls):
        """5_isopentenylaminomethyl_uridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001380)
        """
        return _namespace_SO('SO_0001380')

    @classmethod
    def five_isopentenylaminomethyl_two_thiouridine(cls):
        """5_isopentenylaminomethyl_2_thiouridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001381)
        """
        return _namespace_SO('SO_0001381')

    @classmethod
    def five_isopentenylaminomethyl_two_prime_O_methyluridine(cls):
        """5_isopentenylaminomethyl_2prime_O_methyluridine is a modified uridine base feature. (cls, http://library.med.utah.edu/RNAmods/)
        (SO_0001382)
        """
        return _namespace_SO('SO_0001382')

    @classmethod
    def histone_binding_site(cls):
        """A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues of a histone. (cls, SO:ke)
        (SO_0001383)
        """
        return _namespace_SO('SO_0001383')

    @classmethod
    def CDS_fragment(cls):
        """-- No comment or description provided. --
        (cls, SO_0001384)
        """
        return _namespace_SO('SO_0001384')

    @classmethod
    def modified_amino_acid_feature(cls):
        """A post translationally modified amino acid feature. (cls, SO:ke)
        (SO_0001385)
        """
        return _namespace_SO('SO_0001385')

    @classmethod
    def modified_glycine(cls):
        """A post translationally modified glycine amino acid feature. (cls, SO:ke)
        (SO_0001386)
        """
        return _namespace_SO('SO_0001386')

    @classmethod
    def modified_L_alanine(cls):
        """A post translationally modified alanine amino acid feature. (cls, SO:ke)
        (SO_0001387)
        """
        return _namespace_SO('SO_0001387')

    @classmethod
    def modified_L_asparagine(cls):
        """A post translationally modified asparagine amino acid feature. (cls, SO:ke)
        (SO_0001388)
        """
        return _namespace_SO('SO_0001388')

    @classmethod
    def modified_L_aspartic_acid(cls):
        """A post translationally modified aspartic acid amino acid feature. (cls, SO:ke)
        (SO_0001389)
        """
        return _namespace_SO('SO_0001389')

    @classmethod
    def modified_L_cysteine(cls):
        """A post translationally modified cysteine amino acid feature. (cls, SO:ke)
        (SO_0001390)
        """
        return _namespace_SO('SO_0001390')

    @classmethod
    def modified_L_glutamic_acid(cls):
        """-- No comment or description provided. --
        (cls, SO_0001391)
        """
        return _namespace_SO('SO_0001391')

    @classmethod
    def modified_L_threonine(cls):
        """A post translationally modified threonine amino acid feature. (cls, SO:ke)
        (SO_0001392)
        """
        return _namespace_SO('SO_0001392')

    @classmethod
    def modified_L_tryptophan(cls):
        """A post translationally modified tryptophan amino acid feature. (cls, SO:ke)
        (SO_0001393)
        """
        return _namespace_SO('SO_0001393')

    @classmethod
    def modified_L_glutamine(cls):
        """A post translationally modified glutamine amino acid feature. (cls, SO:ke)
        (SO_0001394)
        """
        return _namespace_SO('SO_0001394')

    @classmethod
    def modified_L_methionine(cls):
        """A post translationally modified methionine amino acid feature. (cls, SO:ke)
        (SO_0001395)
        """
        return _namespace_SO('SO_0001395')

    @classmethod
    def modified_L_isoleucine(cls):
        """A post translationally modified isoleucine amino acid feature. (cls, SO:ke)
        (SO_0001396)
        """
        return _namespace_SO('SO_0001396')

    @classmethod
    def modified_L_phenylalanine(cls):
        """A post translationally modified phenylalanine amino acid feature. (cls, SO:ke)
        (SO_0001397)
        """
        return _namespace_SO('SO_0001397')

    @classmethod
    def modified_L_histidine(cls):
        """A post translationally modified histidie amino acid feature. (cls, SO:ke)
        (SO_0001398)
        """
        return _namespace_SO('SO_0001398')

    @classmethod
    def modified_L_serine(cls):
        """A post translationally modified serine amino acid feature. (cls, SO:ke)
        (SO_0001399)
        """
        return _namespace_SO('SO_0001399')

    @classmethod
    def modified_L_lysine(cls):
        """A post translationally modified lysine amino acid feature. (cls, SO:ke)
        (SO_0001400)
        """
        return _namespace_SO('SO_0001400')

    @classmethod
    def modified_L_leucine(cls):
        """A post translationally modified leucine amino acid feature. (cls, SO:ke)
        (SO_0001401)
        """
        return _namespace_SO('SO_0001401')

    @classmethod
    def modified_L_selenocysteine(cls):
        """A post translationally modified selenocysteine amino acid feature. (cls, SO:ke)
        (SO_0001402)
        """
        return _namespace_SO('SO_0001402')

    @classmethod
    def modified_L_valine(cls):
        """A post translationally modified valine amino acid feature. (cls, SO:ke)
        (SO_0001403)
        """
        return _namespace_SO('SO_0001403')

    @classmethod
    def modified_L_proline(cls):
        """A post translationally modified proline amino acid feature. (cls, SO:ke)
        (SO_0001404)
        """
        return _namespace_SO('SO_0001404')

    @classmethod
    def modified_L_tyrosine(cls):
        """A post translationally modified tyrosine amino acid feature. (cls, SO:ke)
        (SO_0001405)
        """
        return _namespace_SO('SO_0001405')

    @classmethod
    def modified_L_arginine(cls):
        """A post translationally modified arginine amino acid feature. (cls, SO:ke)
        (SO_0001406)
        """
        return _namespace_SO('SO_0001406')

    @classmethod
    def peptidyl(cls):
        """An attribute describing the nature of a proteinaceous polymer, where by the amino acid units are joined by peptide bonds. (cls, SO:ke)
        (SO_0001407)
        """
        return _namespace_SO('SO_0001407')

    @classmethod
    def cleaved_for_gpi_anchor_region(cls):
        """The C-terminal residues of a polypeptide which are exchanged for a GPI-anchor. (cls, EBI:rh)
        (SO_0001408)
        """
        return _namespace_SO('SO_0001408')

    @classmethod
    def biomaterial_region(cls):
        """A region which is intended for use in an experiment. (cls, SO:cb)
        (SO_0001409)
        """
        return _namespace_SO('SO_0001409')

    @classmethod
    def experimental_feature(cls):
        """A region which is the result of some arbitrary experimental procedure. The procedure may be carried out with biological material or inside a computer. (cls, SO:cb)
        (SO_0001410)
        """
        return _namespace_SO('SO_0001410')

    @classmethod
    def biological_region(cls):
        """A region defined by its disposition to be involved in a biological process. (cls, SO:cb)
        (SO_0001411)
        """
        return _namespace_SO('SO_0001411')

    @classmethod
    def topologically_defined_region(cls):
        """A region that is defined according to its relations with other regions within the same sequence. (cls, SO:cb)
        (SO_0001412)
        """
        return _namespace_SO('SO_0001412')

    @classmethod
    def translocation_breakpoint(cls):
        """The point within a chromosome where a translocation begins or ends. (cls, SO:cb)
        (SO_0001413)
        """
        return _namespace_SO('SO_0001413')

    @classmethod
    def insertion_breakpoint(cls):
        """The point within a chromosome where a insertion begins or ends. (cls, SO:cb)
        (SO_0001414)
        """
        return _namespace_SO('SO_0001414')

    @classmethod
    def deletion_breakpoint(cls):
        """The point within a chromosome where a deletion begins or ends. (cls, SO:cb)
        (SO_0001415)
        """
        return _namespace_SO('SO_0001415')

    @classmethod
    def five_prime_flanking_region(cls):
        """A flanking region located five prime of a specific region. (cls, SO:chado)
        (SO_0001416)
        """
        return _namespace_SO('SO_0001416')

    @classmethod
    def three_prime_flanking_region(cls):
        """A flanking region located three prime of a specific region. (cls, SO:chado)
        (SO_0001417)
        """
        return _namespace_SO('SO_0001417')

    @classmethod
    def transcribed_fragment(cls):
        """An experimental region, defined by a tiling array experiment to be transcribed at some level. (cls, SO:ke)
        (SO_0001418)
        """
        return _namespace_SO('SO_0001418')

    @classmethod
    def cis_splice_site(cls):
        """Intronic 2 bp region bordering exon. A splice_site that adjacent_to exon and overlaps intron. (cls, SO:cjm, SO:ke)
        (SO_0001419)
        """
        return _namespace_SO('SO_0001419')

    @classmethod
    def trans_splice_site(cls):
        """Primary transcript region bordering trans-splice junction. (cls, SO:ke)
        (SO_0001420)
        """
        return _namespace_SO('SO_0001420')

    @classmethod
    def splice_junction(cls):
        """The boundary between an intron and an exon. (cls, SO:ke)
        (SO_0001421)
        """
        return _namespace_SO('SO_0001421')

    @classmethod
    def conformational_switch(cls):
        """A region of a polypeptide, involved in the transition from one conformational state to another. (cls, SO:ke)
        (SO_0001422)
        """
        return _namespace_SO('SO_0001422')

    @classmethod
    def dye_terminator_read(cls):
        """A read produced by the dye terminator method of sequencing. (cls, SO:ke)
        (SO_0001423)
        """
        return _namespace_SO('SO_0001423')

    @classmethod
    def pyrosequenced_read(cls):
        """A read produced by pyrosequencing technology. (cls, SO:ke)
        (SO_0001424)
        """
        return _namespace_SO('SO_0001424')

    @classmethod
    def ligation_based_read(cls):
        """A read produced by ligation based sequencing technologies. (cls, SO:ke)
        (SO_0001425)
        """
        return _namespace_SO('SO_0001425')

    @classmethod
    def polymerase_synthesis_read(cls):
        """A read produced by the polymerase based sequence by synthesis method. (cls, SO:ke)
        (SO_0001426)
        """
        return _namespace_SO('SO_0001426')

    @classmethod
    def cis_regulatory_frameshift_element(cls):
        """A structural region in an RNA molecule which promotes ribosomal frameshifting of cis coding sequence. (cls, RFAM:jd)
        (SO_0001427)
        """
        return _namespace_SO('SO_0001427')

    @classmethod
    def expressed_sequence_assembly(cls):
        """A sequence assembly derived from expressed sequences. (cls, SO:ke)
        (SO_0001428)
        """
        return _namespace_SO('SO_0001428')

    @classmethod
    def DNA_binding_site(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with DNA. (cls, SO:ke)
        (SO_0001429)
        """
        return _namespace_SO('SO_0001429')

    @classmethod
    def cryptic_gene(cls):
        """A gene that is not transcribed under normal conditions and is not critical to normal cellular functioning. (cls, SO:ke)
        (SO_0001431)
        """
        return _namespace_SO('SO_0001431')

    @classmethod
    def sequence_variant_affecting_polyadenylation(cls):
        """-- No comment or description provided. --
        (cls, SO_0001432)
        """
        return _namespace_SO('SO_0001432')

    @classmethod
    def three_prime_RACE_clone(cls):
        """A three prime RACE (cls, Rapid Amplification of cDNA Ends) clone is a cDNA clone copied from the 3' end of an mRNA (using a poly-dT primer to capture the polyA tail and a gene-specific or randomly primed 5' primer), and spliced into a vector for propagation in a suitable host. (modENCODE:nlw)
        (SO_0001433)
        """
        return _namespace_SO('SO_0001433')

    @classmethod
    def cassette_pseudogene(cls):
        """A cassette pseudogene is a kind of gene in an inactive form which may recombine at a telomeric locus to form a functional copy. (cls, SO:ke)
        (SO_0001434)
        """
        return _namespace_SO('SO_0001434')

    @classmethod
    def alanine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001435)
        """
        return _namespace_SO('SO_0001435')

    @classmethod
    def valine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001436)
        """
        return _namespace_SO('SO_0001436')

    @classmethod
    def leucine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001437)
        """
        return _namespace_SO('SO_0001437')

    @classmethod
    def isoleucine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001438)
        """
        return _namespace_SO('SO_0001438')

    @classmethod
    def proline(cls):
        """-- No comment or description provided. --
        (cls, SO_0001439)
        """
        return _namespace_SO('SO_0001439')

    @classmethod
    def tryptophan(cls):
        """-- No comment or description provided. --
        (cls, SO_0001440)
        """
        return _namespace_SO('SO_0001440')

    @classmethod
    def phenylalanine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001441)
        """
        return _namespace_SO('SO_0001441')

    @classmethod
    def methionine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001442)
        """
        return _namespace_SO('SO_0001442')

    @classmethod
    def glycine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001443)
        """
        return _namespace_SO('SO_0001443')

    @classmethod
    def serine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001444)
        """
        return _namespace_SO('SO_0001444')

    @classmethod
    def threonine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001445)
        """
        return _namespace_SO('SO_0001445')

    @classmethod
    def tyrosine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001446)
        """
        return _namespace_SO('SO_0001446')

    @classmethod
    def cysteine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001447)
        """
        return _namespace_SO('SO_0001447')

    @classmethod
    def glutamine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001448)
        """
        return _namespace_SO('SO_0001448')

    @classmethod
    def asparagine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001449)
        """
        return _namespace_SO('SO_0001449')

    @classmethod
    def lysine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001450)
        """
        return _namespace_SO('SO_0001450')

    @classmethod
    def arginine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001451)
        """
        return _namespace_SO('SO_0001451')

    @classmethod
    def histidine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001452)
        """
        return _namespace_SO('SO_0001452')

    @classmethod
    def aspartic_acid(cls):
        """-- No comment or description provided. --
        (cls, SO_0001453)
        """
        return _namespace_SO('SO_0001453')

    @classmethod
    def glutamic_acid(cls):
        """-- No comment or description provided. --
        (cls, SO_0001454)
        """
        return _namespace_SO('SO_0001454')

    @classmethod
    def selenocysteine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001455)
        """
        return _namespace_SO('SO_0001455')

    @classmethod
    def pyrrolysine(cls):
        """-- No comment or description provided. --
        (cls, SO_0001456)
        """
        return _namespace_SO('SO_0001456')

    @classmethod
    def transcribed_cluster(cls):
        """A region defined by a set of transcribed sequences from the same gene or expressed pseudogene. (cls, SO:ke)
        (SO_0001457)
        """
        return _namespace_SO('SO_0001457')

    @classmethod
    def unigene_cluster(cls):
        """A kind of transcribed_cluster defined by a set of transcribed sequences from the a unique gene. (cls, SO:ke)
        (SO_0001458)
        """
        return _namespace_SO('SO_0001458')

    @classmethod
    def CRISPR(cls):
        """Clustered Palindromic Repeats interspersed with bacteriophage derived spacer sequences. (cls, RFAM:jd)
        (SO_0001459)
        """
        return _namespace_SO('SO_0001459')

    @classmethod
    def insulator_binding_site(cls):
        """A binding site that, in an insulator region of a nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (cls, SO:ke)
        (SO_0001460)
        """
        return _namespace_SO('SO_0001460')

    @classmethod
    def enhancer_binding_site(cls):
        """A binding site that, in the enhancer region of a nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (cls, SO:ke)
        (SO_0001461)
        """
        return _namespace_SO('SO_0001461')

    @classmethod
    def contig_collection(cls):
        """A collection of contigs. (cls, SO:ke)
        (SO_0001462)
        """
        return _namespace_SO('SO_0001462')

    @classmethod
    def lincRNA(cls):
        """A multiexonic non-coding RNA transcribed by RNA polymerase II. (cls, PMID:19182780, SO:ke)
        (SO_0001463)
        """
        return _namespace_SO('SO_0001463')

    @classmethod
    def UST(cls):
        """An EST spanning part or all of the untranslated regions of a protein-coding transcript. (cls, SO:nlw)
        (SO_0001464)
        """
        return _namespace_SO('SO_0001464')

    @classmethod
    def three_prime_UST(cls):
        """A UST located in the 3'UTR of a protein-coding transcript. (cls, SO:nlw)
        (SO_0001465)
        """
        return _namespace_SO('SO_0001465')

    @classmethod
    def five_prime_UST(cls):
        """An UST located in the 5'UTR of a protein-coding transcript. (cls, SO:nlw)
        (SO_0001466)
        """
        return _namespace_SO('SO_0001466')

    @classmethod
    def RST(cls):
        """A tag produced from a single sequencing read from a RACE product; typically a few hundred base pairs long. (cls, SO:nlw)
        (SO_0001467)
        """
        return _namespace_SO('SO_0001467')

    @classmethod
    def three_prime_RST(cls):
        """A tag produced from a single sequencing read from a 3'-RACE product; typically a few hundred base pairs long. (cls, SO:nlw)
        (SO_0001468)
        """
        return _namespace_SO('SO_0001468')

    @classmethod
    def five_prime_RST(cls):
        """A tag produced from a single sequencing read from a 5'-RACE product; typically a few hundred base pairs long. (cls, SO:nlw)
        (SO_0001469)
        """
        return _namespace_SO('SO_0001469')

    @classmethod
    def UST_match(cls):
        """A match against an UST sequence. (cls, SO:nlw)
        (SO_0001470)
        """
        return _namespace_SO('SO_0001470')

    @classmethod
    def RST_match(cls):
        """A match against an RST sequence. (cls, SO:nlw)
        (SO_0001471)
        """
        return _namespace_SO('SO_0001471')

    @classmethod
    def primer_match(cls):
        """A nucleotide match to a primer sequence. (cls, SO:nlw)
        (SO_0001472)
        """
        return _namespace_SO('SO_0001472')

    @classmethod
    def miRNA_antiguide(cls):
        """A region of the pri miRNA that basepairs with the guide to form the hairpin. (cls, SO:ke)
        (SO_0001473)
        """
        return _namespace_SO('SO_0001473')

    @classmethod
    def trans_splice_junction(cls):
        """The boundary between the spliced leader and the first exon of the mRNA. (cls, SO:ke)
        (SO_0001474)
        """
        return _namespace_SO('SO_0001474')

    @classmethod
    def outron(cls):
        """A region of a primary transcript, that is removed via trans splicing. (cls, PMID:16401417, SO:ke)
        (SO_0001475)
        """
        return _namespace_SO('SO_0001475')

    @classmethod
    def natural_plasmid(cls):
        """A plasmid that occurs naturally. (cls, SO:xp)
        (SO_0001476)
        """
        return _namespace_SO('SO_0001476')

    @classmethod
    def gene_trap_construct(cls):
        """A gene trap construct is a type of engineered plasmid which is designed to integrate into a genome and produce a fusion transcript between exons of the gene into which it inserts and a reporter element in the construct. Gene traps contain a splice acceptor, do not contain promoter elements for the reporter, and are mutagenic. Gene traps may be bicistronic with the second cassette containing a promoter driving an a selectable marker. (cls, ZFIN:dh)
        (SO_0001477)
        """
        return _namespace_SO('SO_0001477')

    @classmethod
    def promoter_trap_construct(cls):
        """A promoter trap construct is a type of engineered plasmid which is designed to integrate into a genome and express a reporter when inserted in close proximity to a promoter element. Promoter traps typically do not contain promoter elements and are mutagenic. (cls, ZFIN:dh)
        (SO_0001478)
        """
        return _namespace_SO('SO_0001478')

    @classmethod
    def enhancer_trap_construct(cls):
        """An enhancer trap construct is a type of engineered plasmid which is designed to integrate into a genome and express a reporter when the expression from a basic minimal promoter is enhanced by genomic enhancer elements. Enhancer traps contain promoter elements and are not usually mutagenic. (cls, ZFIN:dh)
        (SO_0001479)
        """
        return _namespace_SO('SO_0001479')

    @classmethod
    def PAC_end(cls):
        """A region of sequence from the end of a PAC clone that may provide a highly specific marker. (cls, ZFIN:mh)
        (SO_0001480)
        """
        return _namespace_SO('SO_0001480')

    @classmethod
    def RAPD(cls):
        """RAPD is a 'PCR product' where a sequence variant is identified through the use of PCR with random primers. (cls, ZFIN:mh)
        (SO_0001481)
        """
        return _namespace_SO('SO_0001481')

    @classmethod
    def shadow_enhancer(cls):
        """-- No comment or description provided. --
        (cls, SO_0001482)
        """
        return _namespace_SO('SO_0001482')

    @classmethod
    def SNV(cls):
        """SNVs are single nucleotide positions in genomic DNA at which different sequence alternatives exist. (cls, SO:bm)
        (SO_0001483)
        """
        return _namespace_SO('SO_0001483')

    @classmethod
    def X_element_combinatorial_repeat(cls):
        """An X element combinatorial repeat is a repeat region located between the X element and the telomere or adjacent Y' element. (cls, http://www.yeastgenome.org/help/glossary.html)
        (SO_0001484)
        """
        return _namespace_SO('SO_0001484')

    @classmethod
    def Y_prime_element(cls):
        """A Y' element is a repeat region (cls, SO:0000657) located adjacent to telomeric repeats or X element combinatorial repeats, either as a single copy or tandem repeat of two to four copies. (http:http://www.yeastgenome.org/help/glossary.html)
        (SO_0001485)
        """
        return _namespace_SO('SO_0001485')

    @classmethod
    def standard_draft(cls):
        """The status of a whole genome sequence, where the data is minimally filtered or un-filtered, from any number of sequencing platforms, and is assembled into contigs. Genome sequence of this quality may harbour regions of poor quality and can be relatively incomplete. (cls, DOI:10.1126)
        (SO_0001486)
        """
        return _namespace_SO('SO_0001486')

    @classmethod
    def high_quality_draft(cls):
        """The status of a whole genome sequence, where overall coverage represents at least 90 percent of the genome. (cls, DOI:10.1126)
        (SO_0001487)
        """
        return _namespace_SO('SO_0001487')

    @classmethod
    def improved_high_quality_draft(cls):
        """The status of a whole genome sequence, where additional work has been performed, using either manual or automated methods, such as gap resolution. (cls, DOI:10.1126)
        (SO_0001488)
        """
        return _namespace_SO('SO_0001488')

    @classmethod
    def annotation_directed_improved_draft(cls):
        """The status of a whole genome sequence,where annotation, and verification of coding regions has occurred. (cls, DOI:10.1126)
        (SO_0001489)
        """
        return _namespace_SO('SO_0001489')

    @classmethod
    def noncontiguous_finished(cls):
        """The status of a whole genome sequence, where the assembly is high quality, closure approaches have been successful for most gaps, misassemblies and low quality regions. (cls, DOI:10.1126)
        (SO_0001490)
        """
        return _namespace_SO('SO_0001490')

    @classmethod
    def finished_genome(cls):
        """The status of a whole genome sequence, with less than 1 error per 100,000 base pairs. (cls, DOI:10.1126)
        (SO_0001491)
        """
        return _namespace_SO('SO_0001491')

    @classmethod
    def intronic_regulatory_region(cls):
        """A regulatory region that is part of an intron. (cls, SO:ke)
        (SO_0001492)
        """
        return _namespace_SO('SO_0001492')

    @classmethod
    def centromere_DNA_Element_I(cls):
        """A centromere DNA Element I (cls, CDEI) is a conserved region, part of the centromere, consisting of a consensus region composed of 8-11bp which enables binding by the centromere binding factor 1(Cbf1p). (PMID:11222754)
        (SO_0001493)
        """
        return _namespace_SO('SO_0001493')

    @classmethod
    def centromere_DNA_Element_II(cls):
        """A centromere DNA Element II (cls, CDEII) is part a conserved region of the centromere, consisting of a consensus region that is AT-rich and ~ 75-100 bp in length. (PMID:11222754)
        (SO_0001494)
        """
        return _namespace_SO('SO_0001494')

    @classmethod
    def centromere_DNA_Element_III(cls):
        """A centromere DNA Element I (cls, CDEI) is a conserved region, part of the centromere, consisting of a consensus region that consists of a 25-bp which enables binding by the centromere DNA binding factor 3 (CBF3) complex. (PMID:11222754)
        (SO_0001495)
        """
        return _namespace_SO('SO_0001495')

    @classmethod
    def telomeric_repeat(cls):
        """The telomeric repeat is a repeat region, part of the chromosome, which in yeast, is a G-rich terminal sequence of the form (cls, TG(1-3))n or more precisely ((TG)(1-6)TG(2-3))n. (PMID:8720065)
        (SO_0001496)
        """
        return _namespace_SO('SO_0001496')

    @classmethod
    def X_element(cls):
        """The X element is a conserved region, of the telomere, of ~475 bp that contains an ARS sequence and in most cases an Abf1p binding site. (cls, http://www.yeastgenome.org/help/glossary.html#xelemcoresequence)
        (SO_0001497)
        """
        return _namespace_SO('SO_0001497')

    @classmethod
    def YAC_end(cls):
        """A region of sequence from the end of a YAC clone that may provide a highly specific marker. (cls, SO:ke)
        (SO_0001498)
        """
        return _namespace_SO('SO_0001498')

    @classmethod
    def whole_genome_sequence_status(cls):
        """The status of whole genome sequence. (cls, DOI:10.1126)
        (SO_0001499)
        """
        return _namespace_SO('SO_0001499')

    @classmethod
    def heritable_phenotypic_marker(cls):
        """A biological_region characterized as a single heritable trait in a phenotype screen. The heritable phenotype may be mapped to a chromosome but generally has not been characterized to a specific gene locus. (cls, JAX:hdene)
        (SO_0001500)
        """
        return _namespace_SO('SO_0001500')

    @classmethod
    def peptide_collection(cls):
        """A collection of peptide sequences. (cls, BBOP:nlw)
        (SO_0001501)
        """
        return _namespace_SO('SO_0001501')

    @classmethod
    def high_identity_region(cls):
        """An experimental feature with high sequence identity to another sequence. (cls, SO:ke)
        (SO_0001502)
        """
        return _namespace_SO('SO_0001502')

    @classmethod
    def processed_transcript(cls):
        """A transcript for which no open reading frame has been identified and for which no other function has been determined. (cls, MGI:hdeen)
        (SO_0001503)
        """
        return _namespace_SO('SO_0001503')

    @classmethod
    def assortment_derived_variation(cls):
        """A chromosome variation derived from an event during meiosis. (cls, SO:ke)
        (SO_0001504)
        """
        return _namespace_SO('SO_0001504')

    @classmethod
    def reference_genome(cls):
        """A collection of sequences (cls, often chromosomes) taken as the standard for a given organism and genome assembly. (SO:ke)
        (SO_0001505)
        """
        return _namespace_SO('SO_0001505')

    @classmethod
    def variant_genome(cls):
        """A collection of sequences (cls, often chromosomes) of an individual. (SO:ke)
        (SO_0001506)
        """
        return _namespace_SO('SO_0001506')

    @classmethod
    def variant_collection(cls):
        """A collection of one or more sequences of an individual. (cls, SO:ke)
        (SO_0001507)
        """
        return _namespace_SO('SO_0001507')

    @classmethod
    def alteration_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0001508)
        """
        return _namespace_SO('SO_0001508')

    @classmethod
    def chromosomal_variation_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0001509)
        """
        return _namespace_SO('SO_0001509')

    @classmethod
    def intrachromosomal(cls):
        """-- No comment or description provided. --
        (cls, SO_0001510)
        """
        return _namespace_SO('SO_0001510')

    @classmethod
    def interchromosomal(cls):
        """-- No comment or description provided. --
        (cls, SO_0001511)
        """
        return _namespace_SO('SO_0001511')

    @classmethod
    def insertion_attribute(cls):
        """A quality of a chromosomal insertion,. (cls, SO:ke)
        (SO_0001512)
        """
        return _namespace_SO('SO_0001512')

    @classmethod
    def tandem(cls):
        """-- No comment or description provided. --
        (cls, SO_0001513)
        """
        return _namespace_SO('SO_0001513')

    @classmethod
    def direct(cls):
        """A quality of an insertion where the insert is not in a cytologically inverted orientation. (cls, SO:ke)
        (SO_0001514)
        """
        return _namespace_SO('SO_0001514')

    @classmethod
    def inverted(cls):
        """A quality of an insertion where the insert is in a cytologically inverted orientation. (cls, SO:ke)
        (SO_0001515)
        """
        return _namespace_SO('SO_0001515')

    @classmethod
    def free(cls):
        """The quality of a duplication where the new region exists independently of the original. (cls, SO:ke)
        (SO_0001516)
        """
        return _namespace_SO('SO_0001516')

    @classmethod
    def inversion_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0001517)
        """
        return _namespace_SO('SO_0001517')

    @classmethod
    def pericentric(cls):
        """-- No comment or description provided. --
        (cls, SO_0001518)
        """
        return _namespace_SO('SO_0001518')

    @classmethod
    def paracentric(cls):
        """-- No comment or description provided. --
        (cls, SO_0001519)
        """
        return _namespace_SO('SO_0001519')

    @classmethod
    def translocaton_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0001520)
        """
        return _namespace_SO('SO_0001520')

    @classmethod
    def reciprocal(cls):
        """-- No comment or description provided. --
        (cls, SO_0001521)
        """
        return _namespace_SO('SO_0001521')

    @classmethod
    def insertional(cls):
        """-- No comment or description provided. --
        (cls, SO_0001522)
        """
        return _namespace_SO('SO_0001522')

    @classmethod
    def duplication_attribute(cls):
        """-- No comment or description provided. --
        (cls, SO_0001523)
        """
        return _namespace_SO('SO_0001523')

    @classmethod
    def chromosomally_aberrant_genome(cls):
        """-- No comment or description provided. --
        (cls, SO_0001524)
        """
        return _namespace_SO('SO_0001524')

    @classmethod
    def assembly_error_correction(cls):
        """A region of sequence where the final nucleotide assignment differs from the original assembly due to an improvement that replaces a mistake. (cls, SO:ke)
        (SO_0001525)
        """
        return _namespace_SO('SO_0001525')

    @classmethod
    def base_call_error_correction(cls):
        """A region of sequence where the final nucleotide assignment is different from that given by the base caller due to an improvement that replaces a mistake. (cls, SO:ke)
        (SO_0001526)
        """
        return _namespace_SO('SO_0001526')

    @classmethod
    def peptide_localization_signal(cls):
        """A region of peptide sequence used to target the polypeptide molecule to a specific organelle. (cls, SO:ke)
        (SO_0001527)
        """
        return _namespace_SO('SO_0001527')

    @classmethod
    def nuclear_localization_signal(cls):
        """A polypeptide region that targets a polypeptide to the nucleus. (cls, SO:ke)
        (SO_0001528)
        """
        return _namespace_SO('SO_0001528')

    @classmethod
    def endosomal_localization_signal(cls):
        """A polypeptide region that targets a polypeptide to the endosome. (cls, SO:ke)
        (SO_0001529)
        """
        return _namespace_SO('SO_0001529')

    @classmethod
    def lysosomal_localization_signal(cls):
        """A polypeptide region that targets a polypeptide to the lysosome. (cls, SO:ke)
        (SO_0001530)
        """
        return _namespace_SO('SO_0001530')

    @classmethod
    def nuclear_export_signal(cls):
        """A polypeptide region that targets a polypeptide to he cytoplasm. (cls, SO:ke)
        (SO_0001531)
        """
        return _namespace_SO('SO_0001531')

    @classmethod
    def recombination_signal_sequence(cls):
        """A region recognized by a recombinase. (cls, SO:ke)
        (SO_0001532)
        """
        return _namespace_SO('SO_0001532')

    @classmethod
    def cryptic_splice_site(cls):
        """A splice site that is in part of the transcript not normally spliced. They occur via mutation or transcriptional error. (cls, SO:ke)
        (SO_0001533)
        """
        return _namespace_SO('SO_0001533')

    @classmethod
    def nuclear_rim_localization_signal(cls):
        """A polypeptide region that targets a polypeptide to the nuclear rim. (cls, SO:ke)
        (SO_0001534)
        """
        return _namespace_SO('SO_0001534')

    @classmethod
    def p_element(cls):
        """A P_element is a DNA transposon responsible for hybrid dysgenesis. (cls, SO:ke)
        (SO_0001535)
        """
        return _namespace_SO('SO_0001535')

    @classmethod
    def functional_variant(cls):
        """A sequence variant in which the function of a gene product is altered with respect to a reference. (cls, SO:ke)
        (SO_0001536)
        """
        return _namespace_SO('SO_0001536')

    @classmethod
    def structural_variant(cls):
        """A sequence variant that changes one or more sequence features. (cls, SO:ke)
        (SO_0001537)
        """
        return _namespace_SO('SO_0001537')

    @classmethod
    def transcript_function_variant(cls):
        """A sequence variant which alters the functioning of a transcript with respect to a reference sequence. (cls, SO:ke)
        (SO_0001538)
        """
        return _namespace_SO('SO_0001538')

    @classmethod
    def translational_product_function_variant(cls):
        """A sequence variant that affects the functioning of a translational product with respect to a reference sequence. (cls, SO:ke)
        (SO_0001539)
        """
        return _namespace_SO('SO_0001539')

    @classmethod
    def level_of_transcript_variant(cls):
        """A sequence variant which alters the level of a transcript. (cls, SO:ke)
        (SO_0001540)
        """
        return _namespace_SO('SO_0001540')

    @classmethod
    def decreased_transcript_level_variant(cls):
        """A sequence variant that increases the level of mature, spliced and processed RNA with respect to a reference sequence. (cls, SO:ke)
        (SO_0001541)
        """
        return _namespace_SO('SO_0001541')

    @classmethod
    def increased_transcript_level_variant(cls):
        """A sequence variant that increases the level of mature, spliced and processed RNA with respect to a reference sequence. (cls, SO:ke)
        (SO_0001542)
        """
        return _namespace_SO('SO_0001542')

    @classmethod
    def transcript_processing_variant(cls):
        """A sequence variant that affects the post transcriptional processing of a transcript with respect to a reference sequence. (cls, SO:ke)
        (SO_0001543)
        """
        return _namespace_SO('SO_0001543')

    @classmethod
    def editing_variant(cls):
        """A transcript processing variant whereby the process of editing is disrupted with respect to the reference. (cls, SO:ke)
        (SO_0001544)
        """
        return _namespace_SO('SO_0001544')

    @classmethod
    def polyadenylation_variant(cls):
        """A sequence variant that changes polyadenylation with respect to a reference sequence. (cls, SO:ke)
        (SO_0001545)
        """
        return _namespace_SO('SO_0001545')

    @classmethod
    def transcript_stability_variant(cls):
        """A variant that changes the stability of a transcript with respect to a reference sequence. (cls, SO:ke)
        (SO_0001546)
        """
        return _namespace_SO('SO_0001546')

    @classmethod
    def decreased_transcript_stability_variant(cls):
        """A sequence variant that decreases transcript stability with respect to a reference sequence. (cls, SO:ke)
        (SO_0001547)
        """
        return _namespace_SO('SO_0001547')

    @classmethod
    def increased_transcript_stability_variant(cls):
        """A sequence variant that increases transcript stability with respect to a reference sequence. (cls, SO:ke)
        (SO_0001548)
        """
        return _namespace_SO('SO_0001548')

    @classmethod
    def transcription_variant(cls):
        """A variant that changes alters the transcription of a transcript with respect to a reference sequence. (cls, SO:ke)
        (SO_0001549)
        """
        return _namespace_SO('SO_0001549')

    @classmethod
    def rate_of_transcription_variant(cls):
        """A sequence variant that changes the rate of transcription with respect to a reference sequence. (cls, SO:ke)
        (SO_0001550)
        """
        return _namespace_SO('SO_0001550')

    @classmethod
    def increased_transcription_rate_variant(cls):
        """A sequence variant that increases the rate of transcription with respect to a reference sequence. (cls, SO:ke)
        (SO_0001551)
        """
        return _namespace_SO('SO_0001551')

    @classmethod
    def decreased_transcription_rate_variant(cls):
        """A sequence variant that decreases the rate of transcription with respect to a reference sequence. (cls, SO:ke)
        (SO_0001552)
        """
        return _namespace_SO('SO_0001552')

    @classmethod
    def translational_product_level_variant(cls):
        """A functional variant that changes the translational product level with respect to a reference sequence. (cls, SO:ke)
        (SO_0001553)
        """
        return _namespace_SO('SO_0001553')

    @classmethod
    def polypeptide_function_variant(cls):
        """A sequence variant which changes polypeptide functioning with respect to a reference sequence. (cls, SO:ke)
        (SO_0001554)
        """
        return _namespace_SO('SO_0001554')

    @classmethod
    def decreased_translational_product_level(cls):
        """A sequence variant which decreases the translational product level with respect to a reference sequence. (cls, SO:ke)
        (SO_0001555)
        """
        return _namespace_SO('SO_0001555')

    @classmethod
    def increased_translational_product_level(cls):
        """A sequence variant which increases the translational product level with respect to a reference sequence. (cls, SO:ke)
        (SO_0001556)
        """
        return _namespace_SO('SO_0001556')

    @classmethod
    def polypeptide_gain_of_function_variant(cls):
        """A sequence variant which causes gain of polypeptide function with respect to a reference sequence. (cls, SO:ke)
        (SO_0001557)
        """
        return _namespace_SO('SO_0001557')

    @classmethod
    def polypeptide_localization_variant(cls):
        """A sequence variant which changes the localization of a polypeptide with respect to a reference sequence. (cls, SO:ke)
        (SO_0001558)
        """
        return _namespace_SO('SO_0001558')

    @classmethod
    def polypeptide_loss_of_function_variant(cls):
        """A sequence variant that causes the loss of a polypeptide function with respect to a reference sequence. (cls, SO:ke)
        (SO_0001559)
        """
        return _namespace_SO('SO_0001559')

    @classmethod
    def inactive_ligand_binding_site(cls):
        """A sequence variant that causes the inactivation of a ligand binding site with respect to a reference sequence. (cls, SO:ke)
        (SO_0001560)
        """
        return _namespace_SO('SO_0001560')

    @classmethod
    def polypeptide_partial_loss_of_function(cls):
        """A sequence variant that causes some but not all loss of polypeptide function with respect to a reference sequence. (cls, SO:ke)
        (SO_0001561)
        """
        return _namespace_SO('SO_0001561')

    @classmethod
    def polypeptide_post_translational_processing_variant(cls):
        """A sequence variant that causes a change in post translational processing of the peptide with respect to a reference sequence. (cls, SO:ke)
        (SO_0001562)
        """
        return _namespace_SO('SO_0001562')

    @classmethod
    def copy_number_change(cls):
        """A sequence variant where copies of a feature (cls, CNV) are either increased or decreased. (SO:ke)
        (SO_0001563)
        """
        return _namespace_SO('SO_0001563')

    @classmethod
    def gene_variant(cls):
        """A sequence variant where the structure of the gene is changed. (cls, SO:ke)
        (SO_0001564)
        """
        return _namespace_SO('SO_0001564')

    @classmethod
    def gene_fusion(cls):
        """A sequence variant whereby a two genes have become joined. (cls, SO:ke)
        (SO_0001565)
        """
        return _namespace_SO('SO_0001565')

    @classmethod
    def regulatory_region_variant(cls):
        """A sequence variant located within a regulatory region. (cls, SO:ke)
        (SO_0001566)
        """
        return _namespace_SO('SO_0001566')

    @classmethod
    def stop_retained_variant(cls):
        """A sequence variant where at least one base in the terminator codon is changed, but the terminator remains. (cls, SO:ke)
        (SO_0001567)
        """
        return _namespace_SO('SO_0001567')

    @classmethod
    def splicing_variant(cls):
        """A sequence variant that changes the process of splicing. (cls, SO:ke)
        (SO_0001568)
        """
        return _namespace_SO('SO_0001568')

    @classmethod
    def cryptic_splice_site_variant(cls):
        """A sequence variant causing a new (cls, functional) splice site. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_0001569)
        """
        return _namespace_SO('SO_0001569')

    @classmethod
    def cryptic_splice_acceptor(cls):
        """A sequence variant whereby a new splice site is created due to the activation of a new acceptor. (cls, SO:ke)
        (SO_0001570)
        """
        return _namespace_SO('SO_0001570')

    @classmethod
    def cryptic_splice_donor(cls):
        """A sequence variant whereby a new splice site is created due to the activation of a new donor. (cls, SO:ke)
        (SO_0001571)
        """
        return _namespace_SO('SO_0001571')

    @classmethod
    def exon_loss(cls):
        """A sequence variant whereby an exon is lost from the transcript. (cls, SO:ke)
        (SO_0001572)
        """
        return _namespace_SO('SO_0001572')

    @classmethod
    def intron_gain(cls):
        """A sequence variant whereby an intron is gained by the processed transcript; usually a result of an alteration of the donor or acceptor. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_0001573)
        """
        return _namespace_SO('SO_0001573')

    @classmethod
    def splice_acceptor_variant(cls):
        """A splice variant that changes the 2 base region at the 3' end of an intron. (cls, SO:ke)
        (SO_0001574)
        """
        return _namespace_SO('SO_0001574')

    @classmethod
    def splice_donor_variant(cls):
        """A splice variant that changes the2 base region at the 5' end of an intron. (cls, SO:ke)
        (SO_0001575)
        """
        return _namespace_SO('SO_0001575')

    @classmethod
    def transcript_variant(cls):
        """A sequence variant that changes the structure of the transcript. (cls, SO:ke)
        (SO_0001576)
        """
        return _namespace_SO('SO_0001576')

    @classmethod
    def complex_transcript_variant(cls):
        """A transcript variant with a complex INDEL- Insertion or deletion that spans an exon/intron border or a coding sequence/UTR border. (cls, http://ensembl.org/info/docs/variation/index.html)
        (SO_0001577)
        """
        return _namespace_SO('SO_0001577')

    @classmethod
    def stop_lost(cls):
        """A sequence variant where at least one base of the terminator codon (cls, stop) is changed, resulting in an elongated transcript. (SO:ke)
        (SO_0001578)
        """
        return _namespace_SO('SO_0001578')

    @classmethod
    def transcript_sequence_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001579)
        """
        return _namespace_SO('SO_0001579')

    @classmethod
    def coding_sequence_variant(cls):
        """A sequence variant that changes the coding sequence. (cls, SO:ke)
        (SO_0001580)
        """
        return _namespace_SO('SO_0001580')

    @classmethod
    def initiator_codon_variant(cls):
        """A codon variant that changes at least one base of the first codon of a transcript. (cls, SO:ke)
        (SO_0001582)
        """
        return _namespace_SO('SO_0001582')

    @classmethod
    def missense_variant(cls):
        """A sequence variant, that changes one or more bases, resulting in a different amino acid sequence but where the length is preserved. (cls, EBI:fc, EBI:gr, SO:ke)
        (SO_0001583)
        """
        return _namespace_SO('SO_0001583')

    @classmethod
    def conservative_missense_variant(cls):
        """A sequence variant whereby at least one base of a codon is changed resulting in a codon that encodes for a different but similar amino acid. These variants may or may not be deleterious. (cls, SO:ke)
        (SO_0001585)
        """
        return _namespace_SO('SO_0001585')

    @classmethod
    def non_conservative_missense_variant(cls):
        """A sequence variant whereby at least one base of a codon is changed resulting in a codon that encodes for an amino acid with different biochemical properties. (cls, SO:ke)
        (SO_0001586)
        """
        return _namespace_SO('SO_0001586')

    @classmethod
    def stop_gained(cls):
        """A sequence variant whereby at least one base of a codon is changed, resulting in a premature stop codon, leading to a shortened transcript. (cls, SO:ke)
        (SO_0001587)
        """
        return _namespace_SO('SO_0001587')

    @classmethod
    def frameshift_variant(cls):
        """A sequence variant which causes a disruption of the translational reading frame, because the number of nucleotides inserted or deleted is not a multiple of three. (cls, SO:ke)
        (SO_0001589)
        """
        return _namespace_SO('SO_0001589')

    @classmethod
    def terminator_codon_variant(cls):
        """A sequence variant whereby at least one of the bases in the terminator codon is changed. (cls, SO:ke)
        (SO_0001590)
        """
        return _namespace_SO('SO_0001590')

    @classmethod
    def frame_restoring_variant(cls):
        """A sequence variant that reverts the sequence of a previous frameshift mutation back to the initial frame. (cls, SO:ke)
        (SO_0001591)
        """
        return _namespace_SO('SO_0001591')

    @classmethod
    def minus_1_frameshift_variant(cls):
        """A sequence variant which causes a disruption of the translational reading frame, by shifting one base ahead. (cls, http://arjournals.annualreviews.org/doi/pdf/10.1146/annurev.ge.08.120174.001535)
        (SO_0001592)
        """
        return _namespace_SO('SO_0001592')

    @classmethod
    def minus_2_frameshift_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001593)
        """
        return _namespace_SO('SO_0001593')

    @classmethod
    def plus_1_frameshift_variant(cls):
        """A sequence variant which causes a disruption of the translational reading frame, by shifting one base backward. (cls, http://arjournals.annualreviews.org/doi/pdf/10.1146/annurev.ge.08.120174.001535)
        (SO_0001594)
        """
        return _namespace_SO('SO_0001594')

    @classmethod
    def plus_2_frameshift_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001595)
        """
        return _namespace_SO('SO_0001595')

    @classmethod
    def transcript_secondary_structure_variant(cls):
        """A sequence variant within a transcript that changes the secondary structure of the RNA product. (cls, SO:ke)
        (SO_0001596)
        """
        return _namespace_SO('SO_0001596')

    @classmethod
    def compensatory_transcript_secondary_structure_variant(cls):
        """A secondary structure variant that compensate for the change made by a previous variant. (cls, SO:ke)
        (SO_0001597)
        """
        return _namespace_SO('SO_0001597')

    @classmethod
    def translational_product_structure_variant(cls):
        """A sequence variant within the transcript that changes the structure of the translational product. (cls, SO:ke)
        (SO_0001598)
        """
        return _namespace_SO('SO_0001598')

    @classmethod
    def a_D_polypeptide_structure_variant(cls):
        """A sequence variant that changes the resulting polypeptide structure. (cls, SO:ke)
        (SO_0001599)
        """
        return _namespace_SO('SO_0001599')

    @classmethod
    def complex_3D_structural_variant(cls):
        """A sequence variant that changes the resulting polypeptide structure. (cls, SO:ke)
        (SO_0001600)
        """
        return _namespace_SO('SO_0001600')

    @classmethod
    def conformational_change_variant(cls):
        """A sequence variant in the CDS region that causes a conformational change in the resulting polypeptide sequence. (cls, SO:ke)
        (SO_0001601)
        """
        return _namespace_SO('SO_0001601')

    @classmethod
    def complex_change_of_translational_product_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001602)
        """
        return _namespace_SO('SO_0001602')

    @classmethod
    def polypeptide_sequence_variant(cls):
        """A sequence variant with in the CDS that causes a change in the resulting polypeptide sequence. (cls, SO:ke)
        (SO_0001603)
        """
        return _namespace_SO('SO_0001603')

    @classmethod
    def amino_acid_deletion(cls):
        """A sequence variant within a CDS resulting in the loss of an amino acid from the resulting polypeptide. (cls, SO:ke)
        (SO_0001604)
        """
        return _namespace_SO('SO_0001604')

    @classmethod
    def amino_acid_insertion(cls):
        """A sequence variant within a CDS resulting in the gain of an amino acid to the resulting polypeptide. (cls, SO:ke)
        (SO_0001605)
        """
        return _namespace_SO('SO_0001605')

    @classmethod
    def amino_acid_substitution(cls):
        """A sequence variant of a codon resulting in the substitution of one amino acid for another in the resulting polypeptide. (cls, SO:ke)
        (SO_0001606)
        """
        return _namespace_SO('SO_0001606')

    @classmethod
    def conservative_amino_acid_substitution(cls):
        """A sequence variant of a codon causing the substitution of a similar amino acid for another in the resulting polypeptide. (cls, SO:ke)
        (SO_0001607)
        """
        return _namespace_SO('SO_0001607')

    @classmethod
    def non_conservative_amino_acid_substitution(cls):
        """A sequence variant of a codon causing the substitution of a non conservative amino acid for another in the resulting polypeptide. (cls, SO:ke)
        (SO_0001608)
        """
        return _namespace_SO('SO_0001608')

    @classmethod
    def elongated_polypeptide(cls):
        """A sequence variant with in the CDS that causes elongation of the resulting polypeptide sequence. (cls, SO:ke)
        (SO_0001609)
        """
        return _namespace_SO('SO_0001609')

    @classmethod
    def elongated_polypeptide_C_terminal(cls):
        """A sequence variant with in the CDS that causes elongation of the resulting polypeptide sequence at the C terminus. (cls, SO:ke)
        (SO_0001610)
        """
        return _namespace_SO('SO_0001610')

    @classmethod
    def elongated_polypeptide_N_terminal(cls):
        """A sequence variant with in the CDS that causes elongation of the resulting polypeptide sequence at the N terminus. (cls, SO:ke)
        (SO_0001611)
        """
        return _namespace_SO('SO_0001611')

    @classmethod
    def elongated_in_frame_polypeptide_C_terminal(cls):
        """A sequence variant with in the CDS that causes in frame elongation of the resulting polypeptide sequence at the C terminus. (cls, SO:ke)
        (SO_0001612)
        """
        return _namespace_SO('SO_0001612')

    @classmethod
    def elongated_out_of_frame_polypeptide_C_terminal(cls):
        """A sequence variant with in the CDS that causes out of frame elongation of the resulting polypeptide sequence at the C terminus. (cls, SO:ke)
        (SO_0001613)
        """
        return _namespace_SO('SO_0001613')

    @classmethod
    def elongated_in_frame_polypeptide_N_terminal_elongation(cls):
        """A sequence variant with in the CDS that causes in frame elongation of the resulting polypeptide sequence at the N terminus. (cls, SO:ke)
        (SO_0001614)
        """
        return _namespace_SO('SO_0001614')

    @classmethod
    def elongated_out_of_frame_polypeptide_N_terminal(cls):
        """A sequence variant with in the CDS that causes out of frame elongation of the resulting polypeptide sequence at the N terminus. (cls, SO:ke)
        (SO_0001615)
        """
        return _namespace_SO('SO_0001615')

    @classmethod
    def polypeptide_fusion(cls):
        """A sequence variant that causes a fusion of two polypeptide sequences. (cls, SO:ke)
        (SO_0001616)
        """
        return _namespace_SO('SO_0001616')

    @classmethod
    def polypeptide_truncation(cls):
        """A sequence variant of the CD that causes a truncation of the resulting polypeptide. (cls, SO:ke)
        (SO_0001617)
        """
        return _namespace_SO('SO_0001617')

    @classmethod
    def inactive_catalytic_site(cls):
        """A sequence variant that causes the inactivation of a catalytic site with respect to a reference sequence. (cls, SO:ke)
        (SO_0001618)
        """
        return _namespace_SO('SO_0001618')

    @classmethod
    def nc_transcript_variant(cls):
        """A transcript variant of a non coding RNA gene. (cls, SO:ke)
        (SO_0001619)
        """
        return _namespace_SO('SO_0001619')

    @classmethod
    def mature_miRNA_variant(cls):
        """A transcript variant located with the sequence of the mature miRNA. (cls, SO:ke)
        (SO_0001620)
        """
        return _namespace_SO('SO_0001620')

    @classmethod
    def NMD_transcript_variant(cls):
        """A variant in a transcript that is the target of NMD. (cls, SO:ke)
        (SO_0001621)
        """
        return _namespace_SO('SO_0001621')

    @classmethod
    def UTR_variant(cls):
        """A transcript variant that is located within the UTR. (cls, SO:ke)
        (SO_0001622)
        """
        return _namespace_SO('SO_0001622')

    @classmethod
    def a_prime_UTR_variant(cls):
        """A UTR variant of the 5' UTR. (cls, SO:ke)
        (SO_0001623)
        """
        return _namespace_SO('SO_0001623')

    @classmethod
    def incomplete_terminal_codon_variant(cls):
        """A sequence variant where at least one base of the final codon of an incompletely annotated transcript is changed. (cls, SO:ke)
        (SO_0001626)
        """
        return _namespace_SO('SO_0001626')

    @classmethod
    def intron_variant(cls):
        """A transcript variant occurring within an intron. (cls, SO:ke)
        (SO_0001627)
        """
        return _namespace_SO('SO_0001627')

    @classmethod
    def intergenic_variant(cls):
        """A sequence variant located in the intergenic region, between genes. (cls, SO:ke)
        (SO_0001628)
        """
        return _namespace_SO('SO_0001628')

    @classmethod
    def splice_site_variant(cls):
        """A sequence variant that changes the first two or last two bases of an intron, or the 5th base from the start of the intron in the orientation of the transcript. (cls, http://ensembl.org/info/docs/variation/index.html)
        (SO_0001629)
        """
        return _namespace_SO('SO_0001629')

    @classmethod
    def splice_region_variant(cls):
        """A sequence variant in which a change has occurred within the region of the splice site, either within 1-3 bases of the exon or 3-8 bases of the intron. (cls, http://ensembl.org/info/docs/variation/index.html)
        (SO_0001630)
        """
        return _namespace_SO('SO_0001630')

    @classmethod
    def upstream_gene_variant(cls):
        """A sequence variant located 5' of a gene. (cls, SO:ke)
        (SO_0001631)
        """
        return _namespace_SO('SO_0001631')

    @classmethod
    def downstream_gene_variant(cls):
        """A sequence variant located 3' of a gene. (cls, SO:ke)
        (SO_0001632)
        """
        return _namespace_SO('SO_0001632')

    @classmethod
    def a_KB_downstream_variant(cls):
        """A sequence variant located within 5 KB of the end of a gene. (cls, SO:ke)
        (SO_0001633)
        """
        return _namespace_SO('SO_0001633')

    @classmethod
    def a_B_downstream_variant(cls):
        """A sequence variant located within a half KB of the end of a gene. (cls, SO:ke)
        (SO_0001634)
        """
        return _namespace_SO('SO_0001634')

    @classmethod
    def a_KB_upstream_variant(cls):
        """A sequence variant located within 5KB 5' of a gene. (cls, SO:ke)
        (SO_0001635)
        """
        return _namespace_SO('SO_0001635')

    @classmethod
    def rRNA_gene(cls):
        """A gene that encodes for ribosomal RNA. (cls, SO:ke)
        (SO_0001637)
        """
        return _namespace_SO('SO_0001637')

    @classmethod
    def piRNA_gene(cls):
        """A gene that encodes for an piwi associated RNA. (cls, SO:ke)
        (SO_0001638)
        """
        return _namespace_SO('SO_0001638')

    @classmethod
    def RNase_P_RNA_gene(cls):
        """A gene that encodes an RNase P RNA. (cls, SO:ke)
        (SO_0001639)
        """
        return _namespace_SO('SO_0001639')

    @classmethod
    def RNase_MRP_RNA_gene(cls):
        """A gene that encodes a RNase_MRP_RNA. (cls, SO:ke)
        (SO_0001640)
        """
        return _namespace_SO('SO_0001640')

    @classmethod
    def lincRNA_gene(cls):
        """A gene that encodes large intervening non-coding RNA. (cls, SO:ke)
        (SO_0001641)
        """
        return _namespace_SO('SO_0001641')

    @classmethod
    def mathematically_defined_repeat(cls):
        """A mathematically defined repeat (cls, MDR) is a experimental feature that is determined by querying overlapping oligomers of length k against a database of shotgun sequence data and identifying regions in the query sequence that exceed a statistically determined threshold of repetitiveness. (SO:jestill)
        (SO_0001642)
        """
        return _namespace_SO('SO_0001642')

    @classmethod
    def telomerase_RNA_gene(cls):
        """A telomerase RNA gene is a non coding RNA gene the RNA product of which is a component of telomerase. (cls, SO:ke)
        (SO_0001643)
        """
        return _namespace_SO('SO_0001643')

    @classmethod
    def targeting_vector(cls):
        """An engineered vector that is able to take part in homologous recombination in a host with the intent of introducing site specific genomic modifications. (cls, MGD:tm, PMID:10354467)
        (SO_0001644)
        """
        return _namespace_SO('SO_0001644')

    @classmethod
    def genetic_marker(cls):
        """A measurable sequence feature that varies within a population. (cls, SO:db)
        (SO_0001645)
        """
        return _namespace_SO('SO_0001645')

    @classmethod
    def DArT_marker(cls):
        """A genetic marker, discovered using Diversity Arrays Technology (cls, DArT) technology. (SO:ke)
        (SO_0001646)
        """
        return _namespace_SO('SO_0001646')

    @classmethod
    def kozak_sequence(cls):
        """A kind of ribosome entry site, specific to Eukaryotic organisms that overlaps part of both 5' UTR and CDS sequence. (cls, SO:ke)
        (SO_0001647)
        """
        return _namespace_SO('SO_0001647')

    @classmethod
    def inframe_variant(cls):
        """A sequence variant which does not cause a disruption of the translational reading frame. (cls, SO:ke)
        (SO_0001650)
        """
        return _namespace_SO('SO_0001650')

    @classmethod
    def retinoic_acid_responsive_element(cls):
        """A transcription factor binding site of variable direct repeats of the sequence PuGGTCA spaced by five nucleotides (cls, DR5) found in the promoters of retinoic acid-responsive genes, to which retinoic acid receptors bind. (PMID:11327309, PMID:19917671)
        (SO_0001653)
        """
        return _namespace_SO('SO_0001653')

    @classmethod
    def nucleotide_to_protein_binding_site(cls):
        """A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (cls, SO:ke)
        (SO_0001654)
        """
        return _namespace_SO('SO_0001654')

    @classmethod
    def nucleotide_binding_site(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with nucleotide residues. (cls, SO:cb)
        (SO_0001655)
        """
        return _namespace_SO('SO_0001655')

    @classmethod
    def metal_binding_site(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with metal ions. (cls, SO:cb)
        (SO_0001656)
        """
        return _namespace_SO('SO_0001656')

    @classmethod
    def ligand_binding_site(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with a small molecule such as a drug, or hormone. (cls, SO:ke)
        (SO_0001657)
        """
        return _namespace_SO('SO_0001657')

    @classmethod
    def nested_tandem_repeat(cls):
        """An NTR is a nested repeat of two distinct tandem motifs interspersed with each other. (cls, SO:AF)
        (SO_0001658)
        """
        return _namespace_SO('SO_0001658')

    @classmethod
    def promoter_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0001659)
        """
        return _namespace_SO('SO_0001659')

    @classmethod
    def core_promoter_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0001660)
        """
        return _namespace_SO('SO_0001660')

    @classmethod
    def RNA_polymerase_II_TATA_box(cls):
        """A TATA box core promoter of a gene transcribed by RNA polymerase II. (cls, PMID:16858867)
        (SO_0001661)
        """
        return _namespace_SO('SO_0001661')

    @classmethod
    def RNA_polymerase_III_TATA_box(cls):
        """A TATA box core promoter of a gene transcribed by RNA polymerase III. (cls, SO:ke)
        (SO_0001662)
        """
        return _namespace_SO('SO_0001662')

    @classmethod
    def BREd_motif(cls):
        """A core TRNA polymerase II promoter element with consensus (cls, G/A)T(T/G/A)(T/A)(G/T)(T/G)(T/G). (PMID:16858867)
        (SO_0001663)
        """
        return _namespace_SO('SO_0001663')

    @classmethod
    def DCE(cls):
        """A discontinuous core element of RNA polymerase II transcribed genes, situated downstream of the TSS. It is composed of three sub elements: SI, SII and SIII. (cls, PMID:16858867)
        (SO_0001664)
        """
        return _namespace_SO('SO_0001664')

    @classmethod
    def DCE_SI(cls):
        """A sub element of the DCE core promoter element, with consensus sequence CTTC. (cls, PMID:16858867, SO:ke)
        (SO_0001665)
        """
        return _namespace_SO('SO_0001665')

    @classmethod
    def DCE_SII(cls):
        """A sub element of the DCE core promoter element with consensus sequence CTGT. (cls, PMID:16858867, SO:ke)
        (SO_0001666)
        """
        return _namespace_SO('SO_0001666')

    @classmethod
    def DCE_SIII(cls):
        """A sub element of the DCE core promoter element with consensus sequence AGC. (cls, PMID:16858867, SO:ke)
        (SO_0001667)
        """
        return _namespace_SO('SO_0001667')

    @classmethod
    def proximal_promoter_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0001668)
        """
        return _namespace_SO('SO_0001668')

    @classmethod
    def RNApol_II_core_promoter(cls):
        """The minimal portion of the promoter required to properly initiate transcription in RNA polymerase II transcribed genes. (cls, PMID:16858867)
        (SO_0001669)
        """
        return _namespace_SO('SO_0001669')

    @classmethod
    def distal_promoter_element(cls):
        """-- No comment or description provided. --
        (cls, SO_0001670)
        """
        return _namespace_SO('SO_0001670')

    @classmethod
    def bacterial_RNApol_promoter_sigma_70(cls):
        """-- No comment or description provided. --
        (cls, SO_0001671)
        """
        return _namespace_SO('SO_0001671')

    @classmethod
    def bacterial_RNApol_promoter_sigma54(cls):
        """-- No comment or description provided. --
        (cls, SO_0001672)
        """
        return _namespace_SO('SO_0001672')

    @classmethod
    def minus_12_signal(cls):
        """A conserved region about 12-bp upstream of the start point of bacterial transcription units, involved with sigma factor 54. (cls, PMID:18331472)
        (SO_0001673)
        """
        return _namespace_SO('SO_0001673')

    @classmethod
    def minus_24_signal(cls):
        """A conserved region about 12-bp upstream of the start point of bacterial transcription units, involved with sigma factor 54. (cls, PMID:18331472)
        (SO_0001674)
        """
        return _namespace_SO('SO_0001674')

    @classmethod
    def A_box_type_1(cls):
        """An A box within an RNA polymerase III type 1 promoter. (cls, SO:ke)
        (SO_0001675)
        """
        return _namespace_SO('SO_0001675')

    @classmethod
    def A_box_type_2(cls):
        """An A box within an RNA polymerase III type 2 promoter. (cls, SO:ke)
        (SO_0001676)
        """
        return _namespace_SO('SO_0001676')

    @classmethod
    def intermediate_element(cls):
        """A core promoter region of RNA polymerase III type 1 promoters. (cls, PMID:12381659)
        (SO_0001677)
        """
        return _namespace_SO('SO_0001677')

    @classmethod
    def regulatory_promoter_element(cls):
        """A promoter element that is not part of the core promoter, but provides the promoter with a specific regulatory region. (cls, PMID:12381659)
        (SO_0001678)
        """
        return _namespace_SO('SO_0001678')

    @classmethod
    def transcription_regulatory_region(cls):
        """A regulatory region that is involved in the control of the process of transcription. (cls, SO:ke)
        (SO_0001679)
        """
        return _namespace_SO('SO_0001679')

    @classmethod
    def translation_regulatory_region(cls):
        """A regulatory region that is involved in the control of the process of translation. (cls, SO:ke)
        (SO_0001680)
        """
        return _namespace_SO('SO_0001680')

    @classmethod
    def recombination_regulatory_region(cls):
        """A regulatory region that is involved in the control of the process of recombination. (cls, SO:ke)
        (SO_0001681)
        """
        return _namespace_SO('SO_0001681')

    @classmethod
    def replication_regulatory_region(cls):
        """A regulatory region that is involved in the control of the process of nucleotide replication. (cls, SO:ke)
        (SO_0001682)
        """
        return _namespace_SO('SO_0001682')

    @classmethod
    def sequence_motif(cls):
        """A sequence motif is a nucleotide or amino-acid sequence pattern that may have biological significance. (cls, http://en.wikipedia.org/wiki/Sequence_motif)
        (SO_0001683)
        """
        return _namespace_SO('SO_0001683')

    @classmethod
    def experimental_feature_attribute(cls):
        """An attribute of an experimentally derived feature. (cls, SO:ke)
        (SO_0001684)
        """
        return _namespace_SO('SO_0001684')

    @classmethod
    def score(cls):
        """The score of an experimentally derived feature such as a p-value. (cls, SO:ke)
        (SO_0001685)
        """
        return _namespace_SO('SO_0001685')

    @classmethod
    def quality_value(cls):
        """An experimental feature attribute that defines the quality of the feature in a quantitative way, such as a phred quality score. (cls, SO:ke)
        (SO_0001686)
        """
        return _namespace_SO('SO_0001686')

    @classmethod
    def restriction_enzyme_recognition_site(cls):
        """The nucleotide region (cls, usually a palindrome) that is recognized by a restriction enzyme. This may or may not be equal to the restriction enzyme binding site. (SO:ke)
        (SO_0001687)
        """
        return _namespace_SO('SO_0001687')

    @classmethod
    def restriction_enzyme_cleavage_junction(cls):
        """The boundary at which a restriction enzyme breaks the nucleotide sequence. (cls, SO:ke)
        (SO_0001688)
        """
        return _namespace_SO('SO_0001688')

    @classmethod
    def five_prime_restriction_enzyme_junction(cls):
        """The restriction enzyme cleavage junction on the 5' strand of the nucleotide sequence. (cls, SO:ke)
        (SO_0001689)
        """
        return _namespace_SO('SO_0001689')

    @classmethod
    def three_prime_restriction_enzyme_junction(cls):
        """-- No comment or description provided. --
        (cls, SO_0001690)
        """
        return _namespace_SO('SO_0001690')

    @classmethod
    def blunt_end_restriction_enzyme_cleavage_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0001691)
        """
        return _namespace_SO('SO_0001691')

    @classmethod
    def sticky_end_restriction_enzyme_cleavage_site(cls):
        """-- No comment or description provided. --
        (cls, SO_0001692)
        """
        return _namespace_SO('SO_0001692')

    @classmethod
    def blunt_end_restriction_enzyme_cleavage_junction(cls):
        """A restriction enzyme cleavage site where both strands are cut at the same position. (cls, SO:ke)
        (SO_0001693)
        """
        return _namespace_SO('SO_0001693')

    @classmethod
    def single_strand_restriction_enzyme_cleavage_site(cls):
        """A restriction enzyme cleavage site whereby only one strand is cut. (cls, SO:ke)
        (SO_0001694)
        """
        return _namespace_SO('SO_0001694')

    @classmethod
    def restriction_enzyme_single_strand_overhang(cls):
        """A terminal region of DNA sequence where the end of the region is not blunt ended. (cls, SO:ke)
        (SO_0001695)
        """
        return _namespace_SO('SO_0001695')

    @classmethod
    def experimentally_defined_binding_region(cls):
        """A region that has been implicated in binding although the exact coordinates of binding may be unknown. (cls, SO:ke)
        (SO_0001696)
        """
        return _namespace_SO('SO_0001696')

    @classmethod
    def ChIP_seq_region(cls):
        """A region of sequence identified by CHiP seq technology to contain a protein binding site. (cls, SO:ke)
        (SO_0001697)
        """
        return _namespace_SO('SO_0001697')

    @classmethod
    def ASPE_primer(cls):
        """\"A primer containing an SNV at the 3' end for accurate genotyping. (cls, http://www.ncbi.nlm.nih.gov/pubmed/11252801)
        (SO_0001698)
        """
        return _namespace_SO('SO_0001698')

    @classmethod
    def dCAPS_primer(cls):
        """A primer with one or more mis-matches to the DNA template corresponding to a position within a restriction enzyme recognition site. (cls, http://www.ncbi.nlm.nih.gov/pubmed/9628033)
        (SO_0001699)
        """
        return _namespace_SO('SO_0001699')

    @classmethod
    def histone_modification(cls):
        """Histone modification is a post translationally modified region whereby residues of the histone protein are modified by methylation, acetylation, phosphorylation, ubiquitination, sumoylation, citrullination, or ADP-ribosylation. (cls, http:en.wikipedia.org/wiki/Histone)
        (SO_0001700)
        """
        return _namespace_SO('SO_0001700')

    @classmethod
    def histone_methylation_site(cls):
        """A histone modification site where the modification is the methylation of the residue. (cls, SO:ke)
        (SO_0001701)
        """
        return _namespace_SO('SO_0001701')

    @classmethod
    def histone_acetylation_site(cls):
        """A histone modification where the modification is the acylation of the residue. (cls, SO:ke)
        (SO_0001702)
        """
        return _namespace_SO('SO_0001702')

    @classmethod
    def H3K9_acetylation_site(cls):
        """A kind of histone modification site, whereby the 9th residue (cls, a lysine), from the start of the H3 histone protein is acylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001703)
        """
        return _namespace_SO('SO_0001703')

    @classmethod
    def H3K14_acetylation_site(cls):
        """A kind of histone modification site, whereby the 14th residue (cls, a lysine), from the start of the H3 histone protein is acylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001704)
        """
        return _namespace_SO('SO_0001704')

    @classmethod
    def H3K4_monomethylation_site(cls):
        """A kind of histone modification, whereby the 4th residue (cls, a lysine), from the start of the H3 protein is mono-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001705)
        """
        return _namespace_SO('SO_0001705')

    @classmethod
    def H3K4_trimethylation(cls):
        """A kind of histone modification site, whereby the 4th residue (cls, a lysine), from the start of the H3 protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001706)
        """
        return _namespace_SO('SO_0001706')

    @classmethod
    def H3K9_trimethylation_site(cls):
        """A kind of histone modification site, whereby the 9th residue (cls, a lysine), from the start of the H3 histone protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001707)
        """
        return _namespace_SO('SO_0001707')

    @classmethod
    def H3K27_monomethylation_site(cls):
        """A kind of histone modification site, whereby the 27th residue (cls, a lysine), from the start of the H3 histone protein is mono-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001708)
        """
        return _namespace_SO('SO_0001708')

    @classmethod
    def H3K27_trimethylation_site(cls):
        """A kind of histone modification site, whereby the 27th residue (cls, a lysine), from the start of the H3 histone protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001709)
        """
        return _namespace_SO('SO_0001709')

    @classmethod
    def H3K79_monomethylation_site(cls):
        """A kind of histone modification site, whereby the 79th residue (cls, a lysine), from the start of the H3 histone protein is mono- methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001710)
        """
        return _namespace_SO('SO_0001710')

    @classmethod
    def H3K79_dimethylation_site(cls):
        """A kind of histone modification site, whereby the 79th residue (cls, a lysine), from the start of the H3 histone protein is di-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001711)
        """
        return _namespace_SO('SO_0001711')

    @classmethod
    def H3K79_trimethylation_site(cls):
        """A kind of histone modification site, whereby the 79th residue (cls, a lysine), from the start of the H3 histone protein is tri-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001712)
        """
        return _namespace_SO('SO_0001712')

    @classmethod
    def H4K20_monomethylation_site(cls):
        """A kind of histone modification site, whereby the 20th residue (cls, a lysine), from the start of the H34histone protein is mono-methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001713)
        """
        return _namespace_SO('SO_0001713')

    @classmethod
    def H2BK5_monomethylation_site(cls):
        """A kind of histone modification site, whereby the 5th residue (cls, a lysine), from the start of the H2B protein is methylated. (http://en.wikipedia.org/wiki/Histone)
        (SO_0001714)
        """
        return _namespace_SO('SO_0001714')

    @classmethod
    def ISRE(cls):
        """An ISRE is a transcriptional cis regulatory region, containing the consensus region: YAGTTTC(cls, A/T)YTTTYCC, responsible for increased transcription via interferon binding. (http://genesdev.cshlp.org/content/2/4/383.abstrac)
        (SO_0001715)
        """
        return _namespace_SO('SO_0001715')

    @classmethod
    def histone_ubiqitination_site(cls):
        """A histone modification site where ubiquitin may be added. (cls, SO:ke)
        (SO_0001716)
        """
        return _namespace_SO('SO_0001716')

    @classmethod
    def H2B_ubiquitination_site(cls):
        """A histone modification site on H2B where ubiquitin may be added. (cls, SO:ke)
        (SO_0001717)
        """
        return _namespace_SO('SO_0001717')

    @classmethod
    def H3K18_acetylation_site(cls):
        """A kind of histone modification site, whereby the 14th residue (cls, a lysine), from the start of the H3 histone protein is acylated. (SO:ke)
        (SO_0001718)
        """
        return _namespace_SO('SO_0001718')

    @classmethod
    def H3K23_acylation_site(cls):
        """A kind of histone modification, whereby the 23rd residue (cls, a lysine), from the start of the H3 histone protein is acylated. (SO:ke)
        (SO_0001719)
        """
        return _namespace_SO('SO_0001719')

    @classmethod
    def epigenetically_modified_region(cls):
        """A biological region implicated in inherited changes caused by mechanisms other than changes in the underlying DNA sequence. (cls, http://en.wikipedia.org/wiki/Epigenetics, SO:ke)
        (SO_0001720)
        """
        return _namespace_SO('SO_0001720')

    @classmethod
    def H3K27_acylation_site(cls):
        """A kind of histone modification site, whereby the 27th residue (cls, a lysine), from the start of the H3 histone protein is acylated. (SO:ke)
        (SO_0001721)
        """
        return _namespace_SO('SO_0001721')

    @classmethod
    def H3K36_monomethylation_site(cls):
        """A kind of histone modification site, whereby the 36th residue (cls, a lysine), from the start of the H3 histone protein is mono-methylated. (SO:ke)
        (SO_0001722)
        """
        return _namespace_SO('SO_0001722')

    @classmethod
    def H3K36_dimethylation_site(cls):
        """A kind of histone modification site, whereby the 36th residue (cls, a lysine), from the start of the H3 histone protein is dimethylated. (SO:ke)
        (SO_0001723)
        """
        return _namespace_SO('SO_0001723')

    @classmethod
    def H3K36_trimethylation_site(cls):
        """A kind of histone modification site, whereby the 36th residue (cls, a lysine), from the start of the H3 histone protein is tri-methylated. (SO:ke)
        (SO_0001724)
        """
        return _namespace_SO('SO_0001724')

    @classmethod
    def H3K4_dimethylation_site(cls):
        """A kind of histone modification site, whereby the 4th residue (cls, a lysine), from the start of the H3 histone protein is di-methylated. (SO:ke)
        (SO_0001725)
        """
        return _namespace_SO('SO_0001725')

    @classmethod
    def H3K27_dimethylation_site(cls):
        """A kind of histone modification site, whereby the 27th residue (cls, a lysine), from the start of the H3 histone protein is di-methylated. (SO:ke)
        (SO_0001726)
        """
        return _namespace_SO('SO_0001726')

    @classmethod
    def H3K9_monomethylation_site(cls):
        """A kind of histone modification site, whereby the 9th residue (cls, a lysine), from the start of the H3 histone protein is mono-methylated. (SO:ke)
        (SO_0001727)
        """
        return _namespace_SO('SO_0001727')

    @classmethod
    def H3K9_dimethylation_site(cls):
        """A kind of histone modification site, whereby the 9th residue (cls, a lysine), from the start of the H3 histone protein may be dimethylated. (SO:ke)
        (SO_0001728)
        """
        return _namespace_SO('SO_0001728')

    @classmethod
    def H4K16_acylation_site(cls):
        """A kind of histone modification site, whereby the 16th residue (cls, a lysine), from the start of the H4 histone protein is acylated. (SO:ke)
        (SO_0001729)
        """
        return _namespace_SO('SO_0001729')

    @classmethod
    def H4K5_acylation_site(cls):
        """A kind of histone modification site, whereby the 5th residue (cls, a lysine), from the start of the H4 histone protein is acylated. (SO:ke)
        (SO_0001730)
        """
        return _namespace_SO('SO_0001730')

    @classmethod
    def H4K8_acylation_site(cls):
        """A kind of histone modification site, whereby the 8th residue (cls, a lysine), from the start of the H4 histone protein is acylated. (SO:KE)
        (SO_0001731)
        """
        return _namespace_SO('SO_0001731')

    @classmethod
    def H3K27_methylation_site(cls):
        """A kind of histone modification site, whereby the 27th residue (cls, a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
        (SO_0001732)
        """
        return _namespace_SO('SO_0001732')

    @classmethod
    def H3K36_methylation_site(cls):
        """A kind of histone modification site, whereby the 36th residue (cls, a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
        (SO_0001733)
        """
        return _namespace_SO('SO_0001733')

    @classmethod
    def H3K4_methylation_site(cls):
        """A kind of histone modification, whereby the 4th residue (cls, a lysine), from the start of the H3 protein is methylated. (SO:ke)
        (SO_0001734)
        """
        return _namespace_SO('SO_0001734')

    @classmethod
    def H3K79_methylation_site(cls):
        """A kind of histone modification site, whereby the 79th residue (cls, a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
        (SO_0001735)
        """
        return _namespace_SO('SO_0001735')

    @classmethod
    def H3K9_methylation_site(cls):
        """A kind of histone modification site, whereby the 9th residue (cls, a lysine), from the start of the H3 histone protein is methylated. (SO:ke)
        (SO_0001736)
        """
        return _namespace_SO('SO_0001736')

    @classmethod
    def histone_acylation_region(cls):
        """A histone modification, whereby the histone protein is acylated at multiple sites in a region. (cls, SO:ke)
        (SO_0001737)
        """
        return _namespace_SO('SO_0001737')

    @classmethod
    def H4K_acylation_region(cls):
        """A region of the H4 histone whereby multiple lysines are acylated. (cls, SO:ke)
        (SO_0001738)
        """
        return _namespace_SO('SO_0001738')

    @classmethod
    def gene_with_non_canonical_start_codon(cls):
        """A gene with a start codon other than AUG. (cls, SO:xp)
        (SO_0001739)
        """
        return _namespace_SO('SO_0001739')

    @classmethod
    def gene_with_start_codon_CUG(cls):
        """A gene with a translational start codon of CUG. (cls, SO:mc)
        (SO_0001740)
        """
        return _namespace_SO('SO_0001740')

    @classmethod
    def pseudogenic_gene_segment(cls):
        """A gene segment which when incorporated by somatic recombination in the final gene transcript results in a nonfunctional product. (cls, SO:hd)
        (SO_0001741)
        """
        return _namespace_SO('SO_0001741')

    @classmethod
    def copy_number_gain(cls):
        """A sequence alteration whereby the copy number of a given regions is greater than the reference sequence. (cls, SO:ke)
        (SO_0001742)
        """
        return _namespace_SO('SO_0001742')

    @classmethod
    def copy_number_loss(cls):
        """A sequence alteration whereby the copy number of a given region is less than the reference sequence. (cls, SO:ke)
        (SO_0001743)
        """
        return _namespace_SO('SO_0001743')

    @classmethod
    def UPD(cls):
        """Uniparental disomy is a sequence_alteration where a diploid individual receives two copies for all or part of a chromosome from one parent and no copies of the same chromosome or region from the other parent. (cls, SO:BM)
        (SO_0001744)
        """
        return _namespace_SO('SO_0001744')

    @classmethod
    def maternal_uniparental_disomy(cls):
        """Uniparental disomy is a sequence_alteration where a diploid individual receives two copies for all or part of a chromosome from the mother and no copies of the same chromosome or region from the father. (cls, SO:bm)
        (SO_0001745)
        """
        return _namespace_SO('SO_0001745')

    @classmethod
    def paternal_uniparental_disomy(cls):
        """Uniparental disomy is a sequence_alteration where a diploid individual receives two copies for all or part of a chromosome from the father and no copies of the same chromosome or region from the mother. (cls, SO:bm)
        (SO_0001746)
        """
        return _namespace_SO('SO_0001746')

    @classmethod
    def open_chromatin_region(cls):
        """A DNA sequence that in the normal state of the chromosome corresponds to an unfolded, un-complexed stretch of double-stranded DNA. (cls, SO:cb)
        (SO_0001747)
        """
        return _namespace_SO('SO_0001747')

    @classmethod
    def SL3_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL3 RNA leader sequence to the 5' end of an mRNA. SL3 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001748)
        """
        return _namespace_SO('SO_0001748')

    @classmethod
    def SL4_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL4 RNA leader sequence to the 5' end of an mRNA. SL4 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001749)
        """
        return _namespace_SO('SO_0001749')

    @classmethod
    def SL5_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL5 RNA leader sequence to the 5' end of an mRNA. SL5 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001750)
        """
        return _namespace_SO('SO_0001750')

    @classmethod
    def SL6_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL6 RNA leader sequence to the 5' end of an mRNA. SL6 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001751)
        """
        return _namespace_SO('SO_0001751')

    @classmethod
    def SL7_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL7 RNA leader sequence to the 5' end of an mRNA. SL7 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001752)
        """
        return _namespace_SO('SO_0001752')

    @classmethod
    def SL8_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL8 RNA leader sequence to the 5' end of an mRNA. SL8 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001753)
        """
        return _namespace_SO('SO_0001753')

    @classmethod
    def SL9_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL9 RNA leader sequence to the 5' end of an mRNA. SL9 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001754)
        """
        return _namespace_SO('SO_0001754')

    @classmethod
    def SL10_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL10 RNA leader sequence to the 5' end of an mRNA. SL10 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001755)
        """
        return _namespace_SO('SO_0001755')

    @classmethod
    def SL11_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL11 RNA leader sequence to the 5' end of an mRNA. SL11 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001756)
        """
        return _namespace_SO('SO_0001756')

    @classmethod
    def SL12_acceptor_site(cls):
        """A SL2_acceptor_site which appends the SL12 RNA leader sequence to the 5' end of an mRNA. SL12 acceptor sites occur in genes in internal segments of polycistronic transcripts. (cls, SO:nlw)
        (SO_0001757)
        """
        return _namespace_SO('SO_0001757')

    @classmethod
    def duplicated_pseudogene(cls):
        """A pseudogene that arose via gene duplication. Generally duplicated pseudogenes have the same structure as the original gene, including intron-exon structure and some regulatory sequence. (cls, http://en.wikipedia.org/wiki/Pseudogene)
        (SO_0001758)
        """
        return _namespace_SO('SO_0001758')

    @classmethod
    def unitary_pseudogene(cls):
        """A pseudogene, deactivated from original state by mutation, fixed in a population. (cls, http://en.wikipedia.org/wiki/Pseudogene, SO:ke)
        (SO_0001759)
        """
        return _namespace_SO('SO_0001759')

    @classmethod
    def non_processed_pseudogene(cls):
        """A pseudogene that arose from a means other than retrotransposition. (cls, SO:ke)
        (SO_0001760)
        """
        return _namespace_SO('SO_0001760')

    @classmethod
    def variant_quality(cls):
        """A dependent entity that inheres in a bearer, a sequence variant. (cls, PMID:17597783, SO:ke)
        (SO_0001761)
        """
        return _namespace_SO('SO_0001761')

    @classmethod
    def variant_origin(cls):
        """A quality inhering in a variant by virtue of its origin. (cls, PMID:17597783, SO:ke)
        (SO_0001762)
        """
        return _namespace_SO('SO_0001762')

    @classmethod
    def variant_frequency(cls):
        """A physical quality which inheres to the variant by virtue of the number instances of the variant within a population. (cls, PMID:17597783, SO:ke)
        (SO_0001763)
        """
        return _namespace_SO('SO_0001763')

    @classmethod
    def unique_variant(cls):
        """A physical quality which inheres to the variant by virtue of the number instances of the variant within a population. (cls, SO:ke)
        (SO_0001764)
        """
        return _namespace_SO('SO_0001764')

    @classmethod
    def rare_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001765)
        """
        return _namespace_SO('SO_0001765')

    @classmethod
    def polymorphic_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001766)
        """
        return _namespace_SO('SO_0001766')

    @classmethod
    def common_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001767)
        """
        return _namespace_SO('SO_0001767')

    @classmethod
    def fixed_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001768)
        """
        return _namespace_SO('SO_0001768')

    @classmethod
    def variant_phenotype(cls):
        """A quality inhering in a variant by virtue of its phenotype. (cls, PMID:17597783, SO:ke)
        (SO_0001769)
        """
        return _namespace_SO('SO_0001769')

    @classmethod
    def benign_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001770)
        """
        return _namespace_SO('SO_0001770')

    @classmethod
    def disease_associated_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001771)
        """
        return _namespace_SO('SO_0001771')

    @classmethod
    def disease_causing_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001772)
        """
        return _namespace_SO('SO_0001772')

    @classmethod
    def lethal_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001773)
        """
        return _namespace_SO('SO_0001773')

    @classmethod
    def quantitative_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001774)
        """
        return _namespace_SO('SO_0001774')

    @classmethod
    def maternal_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001775)
        """
        return _namespace_SO('SO_0001775')

    @classmethod
    def paternal_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001776)
        """
        return _namespace_SO('SO_0001776')

    @classmethod
    def somatic_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001777)
        """
        return _namespace_SO('SO_0001777')

    @classmethod
    def germline_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001778)
        """
        return _namespace_SO('SO_0001778')

    @classmethod
    def pedigree_specific_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001779)
        """
        return _namespace_SO('SO_0001779')

    @classmethod
    def population_specific_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001780)
        """
        return _namespace_SO('SO_0001780')

    @classmethod
    def de_novo_variant(cls):
        """-- No comment or description provided. --
        (cls, SO_0001781)
        """
        return _namespace_SO('SO_0001781')

    @classmethod
    def TF_binding_site_variant(cls):
        """A sequence variant located within a transcription factor binding site. (cls, EBI:fc)
        (SO_0001782)
        """
        return _namespace_SO('SO_0001782')

    @classmethod
    def complex_structural_alteration(cls):
        """A structural sequence alteration or rearrangement encompassing one or more genome fragments. (cls, NCBI:th, SO:ke)
        (SO_0001784)
        """
        return _namespace_SO('SO_0001784')

    @classmethod
    def structural_alteration(cls):
        """-- No comment or description provided. --
        (cls, SO_0001785)
        """
        return _namespace_SO('SO_0001785')

    @classmethod
    def loss_of_heterozygosity(cls):
        """A functional variant whereby the sequence alteration causes a loss of function of one allele of a gene. (cls, SO:ke)
        (SO_0001786)
        """
        return _namespace_SO('SO_0001786')

    @classmethod
    def splice_donor_5th_base_variant(cls):
        """A sequence variant that causes a change at the 5th base pair after the start of the intron in the orientation of the transcript. (cls, EBI:gr)
        (SO_0001787)
        """
        return _namespace_SO('SO_0001787')

    @classmethod
    def U_box(cls):
        """An U-box is a conserved T-rich region upstream of a retroviral polypurine tract that is involved in PPT primer creation during reverse transcription. (cls, PMID:10556309, PMID:11577982, PMID:9649446)
        (SO_0001788)
        """
        return _namespace_SO('SO_0001788')

    @classmethod
    def mating_type_region(cls):
        """A specialized region in the genomes of some yeast and fungi, the genes of which regulate mating type. (cls, SO:ke)
        (SO_0001789)
        """
        return _namespace_SO('SO_0001789')

    @classmethod
    def paired_end_fragment(cls):
        """An assembly region that has been sequenced from both ends resulting in a read_pair (cls, mate_pair). (SO:ke)
        (SO_0001790)
        """
        return _namespace_SO('SO_0001790')

    @classmethod
    def exon_variant(cls):
        """A sequence variant that changes exon sequence. (cls, SO:ke)
        (SO_0001791)
        """
        return _namespace_SO('SO_0001791')

    @classmethod
    def non_coding_exon_variant(cls):
        """A sequence variant that changes non-coding exon sequence. (cls, SO:ke)
        (SO_0001792)
        """
        return _namespace_SO('SO_0001792')

    @classmethod
    def clone_end(cls):
        """A read from an end of the clone sequence. (cls, SO:ke)
        (SO_0001793)
        """
        return _namespace_SO('SO_0001793')

    @classmethod
    def point_centromere(cls):
        """A point centromere is a relatively small centromere (cls, about 125 bp DNA) in discrete sequence, found in some yeast including S. cerevisiae. (PMID:7502067, SO:vw)
        (SO_0001794)
        """
        return _namespace_SO('SO_0001794')

    @classmethod
    def regional_centromere(cls):
        """A regional centromere is a large modular centromere found in fission yeast and higher eukaryotes. It consist of a central core region flanked by inverted inner and outer repeat regions. (cls, PMID:7502067, SO:vw)
        (SO_0001795)
        """
        return _namespace_SO('SO_0001795')

    @classmethod
    def regional_centromere_central_core(cls):
        """A conserved region within the central region of a modular centromere, where the kinetochore is formed. (cls, SO:vw)
        (SO_0001796)
        """
        return _namespace_SO('SO_0001796')

    @classmethod
    def centromeric_repeat(cls):
        """A repeat region found within the modular centromere. (cls, SO:ke)
        (SO_0001797)
        """
        return _namespace_SO('SO_0001797')

    @classmethod
    def regional_centromere_inner_repeat_region(cls):
        """The inner inverted repeat region of a modular centromere and part of the entral core surrounding a non-conserved central region. This region is adjacent to the central core, on each chromosome arm. (cls, SO:vw)
        (SO_0001798)
        """
        return _namespace_SO('SO_0001798')

    @classmethod
    def regional_centromere_outer_repeat_region(cls):
        """The heterochromatic outer repeat region of a modular centromere. These repeats exist in tandem arrays on both chromosome arms. (cls, SO:vw)
        (SO_0001799)
        """
        return _namespace_SO('SO_0001799')

    @classmethod
    def tasiRNA(cls):
        """The sequence of a 21 nucleotide double stranded, polyadenylated non coding RNA, transcribed from the TAS gene. (cls, PMID:16145017)
        (SO_0001800)
        """
        return _namespace_SO('SO_0001800')

    @classmethod
    def tasiRNA_primary_transcript(cls):
        """A primary transcript encoding a tasiRNA. (cls, PMID:16145017)
        (SO_0001801)
        """
        return _namespace_SO('SO_0001801')

    @classmethod
    def increased_polyadenylation_variant(cls):
        """A transcript processing variant whereby polyadenylation of the encoded transcript is increased with respect to the reference. (cls, SO:ke)
        (SO_0001802)
        """
        return _namespace_SO('SO_0001802')

    @classmethod
    def decreased_polyadenylation_variant(cls):
        """A transcript processing variant whereby polyadenylation of the encoded transcript is decreased with respect to the reference. (cls, SO:ke)
        (SO_0001803)
        """
        return _namespace_SO('SO_0001803')

    @classmethod
    def DDB_box(cls):
        """A conserved polypeptide motif that mediates protein-protein interaction and defines adaptor proteins for DDB1/cullin 4 ubiquitin ligases. (cls, PMID:18794354, PMID:19818632)
        (SO_0001804)
        """
        return _namespace_SO('SO_0001804')

    @classmethod
    def destruction_box(cls):
        """A conserved polypeptide motif that can be recognized by both Fizzy/Cdc20- and FZR/Cdh1-activated anaphase-promoting complex/cyclosome (cls, APC/C) and targets a protein for ubiquitination and subsequent degradation by the APC/C. The consensus sequence is RXXLXXXXN. (PMID:12208841, PMID:1842691)
        (SO_0001805)
        """
        return _namespace_SO('SO_0001805')

    @classmethod
    def ER_retention_signal(cls):
        """A C-terminal tetrapeptide motif that mediates retention of a protein in (cls, or retrieval to) the endoplasmic reticulum. In mammals the sequence is KDEL, and in fungi HDEL or DDEL. (doi:10.1093/jxb/50.331.157, PMID:2077689)
        (SO_0001806)
        """
        return _namespace_SO('SO_0001806')

    @classmethod
    def KEN_box(cls):
        """A conserved polypeptide motif that can be recognized by FZR/Cdh1-activated anaphase-promoting complex/cyclosome (cls, APC/C) and targets a protein for ubiquitination and subsequent degradation by the APC/C. The consensus sequence is KENXXXN. (PMID:10733526, PMID:1220884, PMID:18426916)
        (SO_0001807)
        """
        return _namespace_SO('SO_0001807')

    @classmethod
    def mitochondrial_targeting_signal(cls):
        """A polypeptide region that targets a polypeptide to the mitochondrion. (cls, PomBase:mah)
        (SO_0001808)
        """
        return _namespace_SO('SO_0001808')

    @classmethod
    def signal_anchor(cls):
        """A signal sequence that is not cleaved from the polypeptide. Anchors a Type II membrane protein to the membrane. (cls, http://www.cbs.dtu.dk/services/SignalP/background/biobackground.php)
        (SO_0001809)
        """
        return _namespace_SO('SO_0001809')

    @classmethod
    def PIP_box(cls):
        """A polypeptide region that mediates binding to PCNA. The consensus sequence is QXX(cls, hh)XX(aa), where (h) denotes residues with moderately hydrophobic side chains and (a) denotes residues with highly hydrophobic aromatic side chains. (PMID:9631646)
        (SO_0001810)
        """
        return _namespace_SO('SO_0001810')

    @classmethod
    def phosphorylation_site(cls):
        """A post-translationally modified region in which residues of the protein are modified by phosphorylation. (cls, PomBase:mah)
        (SO_0001811)
        """
        return _namespace_SO('SO_0001811')

    @classmethod
    def transmembrane_helix(cls):
        """A region that traverses the lipid bilayer and adopts a helical secondary structure. (cls, PomBase:mah)
        (SO_0001812)
        """
        return _namespace_SO('SO_0001812')

    @classmethod
    def vacuolar_sorting_signal(cls):
        """A polypeptide region that targets a polypeptide to the vacuole. (cls, PomBase:mah)
        (SO_0001813)
        """
        return _namespace_SO('SO_0001813')

    @classmethod
    def coding_variant_quality(cls):
        """-- No comment or description provided. --
        (cls, SO_0001814)
        """
        return _namespace_SO('SO_0001814')

    @classmethod
    def synonymous(cls):
        """-- No comment or description provided. --
        (cls, SO_0001815)
        """
        return _namespace_SO('SO_0001815')

    @classmethod
    def non_synonymous(cls):
        """-- No comment or description provided. --
        (cls, SO_0001816)
        """
        return _namespace_SO('SO_0001816')

    @classmethod
    def inframe(cls):
        """An attribute describing a sequence that contains a mutation involving the deletion or insertion of one or more bases, where this number is divisible by 3. (cls, SO:ke)
        (SO_0001817)
        """
        return _namespace_SO('SO_0001817')

    @classmethod
    def protein_altering_variant(cls):
        """A sequence_variant which is predicted to change the protein encoded in the coding sequence. (cls, EBI:gr)
        (SO_0001818)
        """
        return _namespace_SO('SO_0001818')

    @classmethod
    def synonymous_variant(cls):
        """A sequence variant where there is no resulting change to the encoded amino acid. (cls, SO:ke)
        (SO_0001819)
        """
        return _namespace_SO('SO_0001819')

    @classmethod
    def inframe_indel(cls):
        """A coding sequence variant where the change does not alter the frame of the transcript. (cls, SO:ke)
        (SO_0001820)
        """
        return _namespace_SO('SO_0001820')

    @classmethod
    def inframe_insertion(cls):
        """An inframe non synonymous variant that inserts bases into in the coding sequence. (cls, EBI:gr)
        (SO_0001821)
        """
        return _namespace_SO('SO_0001821')

    @classmethod
    def inframe_deletion(cls):
        """An inframe non synonymous variant that deletes bases from the coding sequence. (cls, EBI:gr)
        (SO_0001822)
        """
        return _namespace_SO('SO_0001822')

    @classmethod
    def conservative_inframe_insertion(cls):
        """An inframe increase in cds length that inserts one or more codons into the coding sequence between existing codons. (cls, EBI:gr)
        (SO_0001823)
        """
        return _namespace_SO('SO_0001823')

    @classmethod
    def disruptive_inframe_insertion(cls):
        """An inframe_increase_in_cds_length that inserts one or more codons into the coding sequence within an existing codon. (cls, EBI:gr)
        (SO_0001824)
        """
        return _namespace_SO('SO_0001824')

    @classmethod
    def conservative_inframe_deletion(cls):
        """An inframe decrease in cds length that deletes one or more entire codons from the coding sequence but does not change any remaining codons. (cls, EBI:gr)
        (SO_0001825)
        """
        return _namespace_SO('SO_0001825')

    @classmethod
    def disruptive_inframe_deletion(cls):
        """An inframe decrease in cds length that deletes bases from the coding sequence starting within an existing codon. (cls, EBI:gr)
        (SO_0001826)
        """
        return _namespace_SO('SO_0001826')

    @classmethod
    def mRNA_read(cls):
        """A sequencer read of an mRNA substrate. (cls, SO:ke)
        (SO_0001827)
        """
        return _namespace_SO('SO_0001827')

    @classmethod
    def genomic_DNA_read(cls):
        """A sequencer read of a genomic DNA substrate. (cls, SO:ke)
        (SO_0001828)
        """
        return _namespace_SO('SO_0001828')

    @classmethod
    def mRNA_contig(cls):
        """A contig composed of mRNA_reads. (cls, SO:ke)
        (SO_0001829)
        """
        return _namespace_SO('SO_0001829')

    @classmethod
    def AFLP_fragment(cls):
        """A PCR product obtained by applying the AFLP technique, based on a restriction enzyme digestion of genomic DNA and an amplification of the resulting fragments. (cls, GMOD:ea)
        (SO_0001830)
        """
        return _namespace_SO('SO_0001830')

    @classmethod
    def protein_hmm_match(cls):
        """A match to a protein HMM such as pfam. (cls, SO:ke)
        (SO_0001831)
        """
        return _namespace_SO('SO_0001831')

    @classmethod
    def immunoglobulin_region(cls):
        """A region of immunoglobulin sequence, either constant or variable. (cls, SO:ke)
        (SO_0001832)
        """
        return _namespace_SO('SO_0001832')

    @classmethod
    def V_region(cls):
        """The variable region of an immunoglobulin polypeptide sequence. (cls, SO:ke)
        (SO_0001833)
        """
        return _namespace_SO('SO_0001833')

    @classmethod
    def C_region(cls):
        """The constant region of an immunoglobulin polypeptide sequence. (cls, SO:ke)
        (SO_0001834)
        """
        return _namespace_SO('SO_0001834')

    @classmethod
    def N_region(cls):
        """Extra nucleotides inserted between rearranged immunoglobulin segments. (cls, SO:ke)
        (SO_0001835)
        """
        return _namespace_SO('SO_0001835')

    @classmethod
    def S_region(cls):
        """The switch region of immunoglobulin heavy chains; it is involved in the rearrangement of heavy chain DNA leading to the expression of a different immunoglobulin classes from the same B-cell. (cls, SO:ke)
        (SO_0001836)
        """
        return _namespace_SO('SO_0001836')

    @classmethod
    def mobile_element_insertion(cls):
        """A kind of insertion where the inserted sequence is a mobile element. (cls, EBI:dvga)
        (SO_0001837)
        """
        return _namespace_SO('SO_0001837')

    @classmethod
    def novel_sequence_insertion(cls):
        """An insertion the sequence of which cannot be mapped to the reference genome. (cls, NCBI:th)
        (SO_0001838)
        """
        return _namespace_SO('SO_0001838')

    @classmethod
    def CSL_response_element(cls):
        """A promoter element with consensus sequence GTGRGAA, bound by CSL (cls, CBF1/RBP-JK/Suppressor of Hairless/LAG-1) transcription factors. (PMID:19101542)
        (SO_0001839)
        """
        return _namespace_SO('SO_0001839')

    @classmethod
    def GATA_box(cls):
        """A GATA transcription factor element containing the consensus sequence WGATAR (cls, in which W indicates A/T and R indicates A/G). (PMID:8321208)
        (SO_0001840)
        """
        return _namespace_SO('SO_0001840')

    @classmethod
    def polymorphic_pseudogene(cls):
        """Pseudogene owing to a SNP/DIP but in other individuals/haplotypes/strains the gene is translated. (cls, JAX:hd)
        (SO_0001841)
        """
        return _namespace_SO('SO_0001841')

    @classmethod
    def AP_1_binding_site(cls):
        """A promoter element with consensus sequence TGACTCA, bound by AP-1 and related transcription factors. (cls, PMID:1899230, PMID:3034432, PMID:3125983)
        (SO_0001842)
        """
        return _namespace_SO('SO_0001842')

    @classmethod
    def CRE(cls):
        """A promoter element with consensus sequence TGACGTCA; bound by the ATF/CREB family of transcription factors. (cls, PMID:11483355, PMID:11483993)
        (SO_0001843)
        """
        return _namespace_SO('SO_0001843')

    @classmethod
    def CuRE(cls):
        """A promoter element bound by copper ion-sensing transcription factors such as S. cerevisiae Mac1p or S. pombe Cuf1; the consensus sequence is HTHNNGCTGD (cls, more specifically TTTGCKCR in budding yeast). (PMID:10593913, PMID:9188496, PMID:9211922)
        (SO_0001844)
        """
        return _namespace_SO('SO_0001844')

    @classmethod
    def DRE(cls):
        """A promoter element with consensus sequence CGWGGWNGMM, bound by transcription factors related to RecA and found in promoters of genes expressed following several types of DNA damage or inhibition of DNA synthesis. (cls, PMID:11073995, PMID:8668127)
        (SO_0001845)
        """
        return _namespace_SO('SO_0001845')

    @classmethod
    def FLEX_element(cls):
        """A promoter element that has consensus sequence GTAAACAAACAAAM and contains a heptameric core GTAAACA, bound by transcription factors with a forkhead DNA-binding domain. (cls, PMID:10747048, PMID:14871934)
        (SO_0001846)
        """
        return _namespace_SO('SO_0001846')

    @classmethod
    def forkhead_motif(cls):
        """A promoter element with consensus sequence TTTRTTTACA, bound by transcription factors with a forkhead DNA-binding domain. (cls, PMID:15195092)
        (SO_0001847)
        """
        return _namespace_SO('SO_0001847')

    @classmethod
    def homol_D_box(cls):
        """A core promoter element that has the consensus sequence CAGTCACA (cls, or its inverted form TGTGACTG), and plays the role of a TATA box in promoters that do not contain a canonical TATA sequence. (PMID:7501449, PMID:8458332)
        (SO_0001848)
        """
        return _namespace_SO('SO_0001848')

    @classmethod
    def homol_E_box(cls):
        """A core promoter element that has the consensus sequence ACCCTACCCT (cls, or its inverted form AGGGTAGGGT), and is found near the homol D box in some promoters that use a homol D box instead of a canonical TATA sequence. (PMID:7501449)
        (SO_0001849)
        """
        return _namespace_SO('SO_0001849')

    @classmethod
    def HSE(cls):
        """A promoter element that consists of at least three copies of the pentanucleotide NGAAN, bound by the heat shock transcription factor HSF. (cls, PMID:17347150, PMID:8689565)
        (SO_0001850)
        """
        return _namespace_SO('SO_0001850')

    @classmethod
    def iron_repressed_GATA_element(cls):
        """A GATA promoter element with consensus sequence WGATAA, found in promoters of genes repressed in the presence of iron. (cls, PMID:11956219, PMID:17211681)
        (SO_0001851)
        """
        return _namespace_SO('SO_0001851')

    @classmethod
    def mating_type_M_box(cls):
        """A promoter element with consensus sequence ACAAT, found in promoters of mating type M-specific genes in fission yeast and bound by the transcription factor Mat1-Mc. (cls, PMID:9233811)
        (SO_0001852)
        """
        return _namespace_SO('SO_0001852')

    @classmethod
    def androgen_response_element(cls):
        """A non-palindromic sequence found in the promoters of genes whose expression is regulated in response to androgen. (cls, PMID:21796522)
        (SO_0001853)
        """
        return _namespace_SO('SO_0001853')

    @classmethod
    def smFISH_probe(cls):
        """A smFISH is a probe that binds RNA in a single molecule in situ hybridization experiment. (cls, PMID:18806792)
        (SO_0001854)
        """
        return _namespace_SO('SO_0001854')

    @classmethod
    def MCB(cls):
        """A promoter element with consensus sequence ACGCGT, bound by the transcription factor complex MBF (cls, MCB-binding factor) and found in promoters of genes expressed during the G1/S transition of the cell cycle. (PMID:16285853)
        (SO_0001855)
        """
        return _namespace_SO('SO_0001855')

    @classmethod
    def CCAAT_motif(cls):
        """A promoter element with consensus sequence CCAAT, bound by a protein complex that represses transcription in response to low iron levels. (cls, PMID:16963626)
        (SO_0001856)
        """
        return _namespace_SO('SO_0001856')

    @classmethod
    def Ace2_UAS(cls):
        """A promoter element with consensus sequence CCAGCC, bound by the fungal transcription factor Ace2. (cls, PMID:16678171)
        (SO_0001857)
        """
        return _namespace_SO('SO_0001857')

    @classmethod
    def TR_box(cls):
        """A promoter element with consensus sequence TTCTTTGTTY, bound an HMG-box transcription factor such as S. pombe Ste11, and found in promoters of genes up-regulated early in meiosis. (cls, PMID:1657709)
        (SO_0001858)
        """
        return _namespace_SO('SO_0001858')

    @classmethod
    def STREP_motif(cls):
        """A promoter element with consensus sequence CCCCTC, bound by the PKA-responsive zinc finger transcription factor Rst2. (cls, PMID:11739717)
        (SO_0001859)
        """
        return _namespace_SO('SO_0001859')

    @classmethod
    def rDNA_intergenic_spacer_element(cls):
        """A DNA motif that contains a core consensus sequence AGGTAAGGGTAATGCAC, is found in the intergenic regions of rDNA repeats, and is bound by an RNA polymerase I transcription termination factor (cls, e.g. S. pombe Reb1). (PMID:9016645)
        (SO_0001860)
        """
        return _namespace_SO('SO_0001860')

    @classmethod
    def sterol_regulatory_element(cls):
        """A 10-bp promoter element bound by sterol regulatory element binding proteins (cls, SREBPs), found in promoters of genes involved in sterol metabolism. Many variants of the sequence ATCACCCCAC function as SREs. (GO:mah, PMID:11111080, PMID:16537923)
        (SO_0001861)
        """
        return _namespace_SO('SO_0001861')

    @classmethod
    def GT_dinucleotide_repeat(cls):
        """A dinucleotide repeat region composed of GT repeating elements. (cls, SO:ke)
        (SO_0001862)
        """
        return _namespace_SO('SO_0001862')

    @classmethod
    def GTT_trinucleotide_repeat(cls):
        """A trinucleotide repeat region composed of GTT repeating elements. (cls, SO:ke)
        (SO_0001863)
        """
        return _namespace_SO('SO_0001863')

    @classmethod
    def Sap1_recognition_motif(cls):
        """A DNA motif to which the S. pombe Sap1 protein binds. The consensus sequence is 5'-TARGCAGNTNYAACGMG-3'; it is found at the mating type locus, where it is important for mating type switching, and at replication fork barriers in rDNA repeats. (cls, PMID:16166653, PMID:7651412)
        (SO_0001864)
        """
        return _namespace_SO('SO_0001864')

    @classmethod
    def CDRE_motif(cls):
        """An RNA polymerase II promoter element found in the promoters of genes regulated by calcineurin. The consensus sequence is GNGGCKCA. (cls, PMID:16928959)
        (SO_0001865)
        """
        return _namespace_SO('SO_0001865')

    @classmethod
    def BAC_read_contig(cls):
        """A contig of BAC reads. (cls, GMOD:ea)
        (SO_0001866)
        """
        return _namespace_SO('SO_0001866')

    @classmethod
    def candidate_gene(cls):
        """A gene suspected of being involved in the expression of a trait. (cls, GMOD:ea)
        (SO_0001867)
        """
        return _namespace_SO('SO_0001867')

    @classmethod
    def positional_candidate_gene(cls):
        """A candidate gene whose association with a trait is based on the gene's location on a chromosome. (cls, GMOD:ea)
        (SO_0001868)
        """
        return _namespace_SO('SO_0001868')

    @classmethod
    def functional_candidate_gene(cls):
        """A candidate gene whose function has something in common biologically with the trait under investigation. (cls, GMOD:ea)
        (SO_0001869)
        """
        return _namespace_SO('SO_0001869')

    @classmethod
    def enhancerRNA(cls):
        """A short ncRNA that is transcribed from an enhancer. May have a regulatory function. (cls, doi:10.1038/465173a, SO:cjm)
        (SO_0001870)
        """
        return _namespace_SO('SO_0001870')

    @classmethod
    def PCB(cls):
        """A promoter element with consensus sequence GNAACR, bound by the transcription factor complex PBF (cls, PCB-binding factor) and found in promoters of genes expressed during the M/G1 transition of the cell cycle. (GO:mah, PMID:12411492)
        (SO_0001871)
        """
        return _namespace_SO('SO_0001871')

    @classmethod
    def rearrangement_breakpoint(cls):
        """A region of a chromosome, where the chromosome has undergone a large structural rearrangement that altered the genome organization. There is no longer synteny to the reference genome. (cls, NCBI:th, PMID:18564416)
        (SO_0001872)
        """
        return _namespace_SO('SO_0001872')

    @classmethod
    def interchromosomal_breakpoint(cls):
        """A rearrangement breakpoint between two different chromosomes. (cls, NCBI:th)
        (SO_0001873)
        """
        return _namespace_SO('SO_0001873')

    @classmethod
    def intrachromosomal_breakpoint(cls):
        """A rearrangement breakpoint within the same chromosome. (cls, NCBI:th)
        (SO_0001874)
        """
        return _namespace_SO('SO_0001874')

    @classmethod
    def unassigned_supercontig(cls):
        """A supercontig that is not been assigned to any ultracontig during a genome assembly project. (cls, GMOD:ea)
        (SO_0001875)
        """
        return _namespace_SO('SO_0001875')

    @classmethod
    def partial_genomic_sequence_assembly(cls):
        """A partial DNA sequence assembly of a chromosome or full genome, which contains gaps that are filled with N's. (cls, GMOD:ea)
        (SO_0001876)
        """
        return _namespace_SO('SO_0001876')

    @classmethod
    def lnc_RNA(cls):
        """A non-coding RNA over 200nucleotides in length. (cls, HGNC:mw)
        (SO_0001877)
        """
        return _namespace_SO('SO_0001877')

    @classmethod
    def feature_variant(cls):
        """A sequence variant that falls entirely or partially within a genomic feature. (cls, EBI:fc, SO:ke)
        (SO_0001878)
        """
        return _namespace_SO('SO_0001878')

    @classmethod
    def feature_ablation(cls):
        """A sequence variant, caused by an alteration of the genomic sequence, where the deletion, is greater than the extent of the underlying genomic features. (cls, SO:ke)
        (SO_0001879)
        """
        return _namespace_SO('SO_0001879')

    @classmethod
    def feature_amplification(cls):
        """A sequence variant, caused by an alteration of the genomic sequence, where the structural change, an amplification of sequence, is greater than the extent of the underlying genomic features. (cls, SO:ke)
        (SO_0001880)
        """
        return _namespace_SO('SO_0001880')

    @classmethod
    def feature_translocation(cls):
        """A sequence variant, caused by an alteration of the genomic sequence, where the structural change, a translocation, is greater than the extent of the underlying genomic features. (cls, SO:ke)
        (SO_0001881)
        """
        return _namespace_SO('SO_0001881')

    @classmethod
    def feature_fusion(cls):
        """A sequence variant, caused by an alteration of the genomic sequence, where a deletion fuses genomic features. (cls, SO:ke)
        (SO_0001882)
        """
        return _namespace_SO('SO_0001882')

    @classmethod
    def transcript_translocation(cls):
        """A feature translocation where the region contains a transcript. (cls, SO:ke)
        (SO_0001883)
        """
        return _namespace_SO('SO_0001883')

    @classmethod
    def regulatory_region_translocation(cls):
        """A feature translocation where the region contains a regulatory region. (cls, SO:ke)
        (SO_0001884)
        """
        return _namespace_SO('SO_0001884')

    @classmethod
    def TFBS_translocation(cls):
        """A feature translocation where the region contains a transcription factor binding site. (cls, SO:ke)
        (SO_0001885)
        """
        return _namespace_SO('SO_0001885')

    @classmethod
    def transcript_fusion(cls):
        """A feature fusion where the deletion brings together transcript regions. (cls, SO:ke)
        (SO_0001886)
        """
        return _namespace_SO('SO_0001886')

    @classmethod
    def regulatory_region_fusion(cls):
        """A feature fusion where the deletion brings together regulatory regions. (cls, SO:ke)
        (SO_0001887)
        """
        return _namespace_SO('SO_0001887')

    @classmethod
    def TFBS_fusion(cls):
        """A fusion where the deletion brings together transcription factor binding sites. (cls, SO:ke)
        (SO_0001888)
        """
        return _namespace_SO('SO_0001888')

    @classmethod
    def transcript_amplification(cls):
        """A feature amplification of a region containing a transcript. (cls, SO:ke)
        (SO_0001889)
        """
        return _namespace_SO('SO_0001889')

    @classmethod
    def transcript_regulatory_region_fusion(cls):
        """A feature fusion where the deletion brings together a regulatory region and a transcript region. (cls, SO:ke)
        (SO_0001890)
        """
        return _namespace_SO('SO_0001890')

    @classmethod
    def regulatory_region_amplification(cls):
        """A feature amplification of a region containing a regulatory region. (cls, SO:ke)
        (SO_0001891)
        """
        return _namespace_SO('SO_0001891')

    @classmethod
    def TFBS_amplification(cls):
        """A feature amplification of a region containing a transcription factor binding site. (cls, SO:ke)
        (SO_0001892)
        """
        return _namespace_SO('SO_0001892')

    @classmethod
    def transcript_ablation(cls):
        """A feature ablation whereby the deleted region includes a transcript feature. (cls, SO:ke)
        (SO_0001893)
        """
        return _namespace_SO('SO_0001893')

    @classmethod
    def regulatory_region_ablation(cls):
        """A feature ablation whereby the deleted region includes a regulatory region. (cls, SO:ke)
        (SO_0001894)
        """
        return _namespace_SO('SO_0001894')

    @classmethod
    def TFBS_ablation(cls):
        """A feature ablation whereby the deleted region includes a transcription factor binding site. (cls, SO:ke)
        (SO_0001895)
        """
        return _namespace_SO('SO_0001895')

    @classmethod
    def transposable_element_CDS(cls):
        """A CDS that is part of a transposable element. (cls, SO:ke)
        (SO_0001896)
        """
        return _namespace_SO('SO_0001896')

    @classmethod
    def transposable_element_pseudogene(cls):
        """A pseudogene contained within a transposable element. (cls, SO:ke)
        (SO_0001897)
        """
        return _namespace_SO('SO_0001897')

    @classmethod
    def dg_repeat(cls):
        """A repeat region which is part of the regional centromere outer repeat region. (cls, PMID:16407326, SO:vw)
        (SO_0001898)
        """
        return _namespace_SO('SO_0001898')

    @classmethod
    def dh_repeat(cls):
        """A repeat region which is part of the regional centromere outer repeat region. (cls, PMID:16407326, SO:vw)
        (SO_0001899)
        """
        return _namespace_SO('SO_0001899')

    @classmethod
    def m26_site(cls):
        """A promoter element that contains a core sequence TGACGT, bound by a protein complex that regulates transcription of genes encoding PKA pathway components. (cls, PMID:15448137)
        (SO_0001900)
        """
        return _namespace_SO('SO_0001900')

    @classmethod
    def AACCCT_box(cls):
        """A conserved 17-bp sequence (cls, 5'-ATCA(C/A)AACCCTAACCCT-3') commonly present upstream of the start site of histone transcription units functioning as a transcription factor binding site. (PMID:17452352, PMID:4092687)
        (SO_0001901)
        """
        return _namespace_SO('SO_0001901')

    @classmethod
    def splice_region(cls):
        """A region surrounding a cis_splice site, either within 1-3 bases of the exon or 3-8 bases of the intron. (cls, SO:bm)
        (SO_0001902)
        """
        return _namespace_SO('SO_0001902')

    @classmethod
    def intronic_lncRNA(cls):
        """A lnc_RNA totally contained within an intron. (cls, PMID:19071207, SO:ke)
        (SO_0001903)
        """
        return _namespace_SO('SO_0001903')

    @classmethod
    def antisense_lncRNA(cls):
        """Non-coding RNA transcribed from the opposite DNA strand compared with other transcripts and overlap in part with sense RNA. (cls, PMID:19638999)
        (SO_0001904)
        """
        return _namespace_SO('SO_0001904')

    @classmethod
    def regional_centromere_outer_repeat_transcript(cls):
        """A transcript that is transcribed from the outer repeat region of a regional centromere. (cls, PomBase:mah)
        (SO_0001905)
        """
        return _namespace_SO('SO_0001905')

    @classmethod
    def feature_truncation(cls):
        """A sequence variant that causes the reduction of a genomic feature, with regard to the reference sequence. (cls, SO:ke)
        (SO_0001906)
        """
        return _namespace_SO('SO_0001906')

    @classmethod
    def feature_elongation(cls):
        """A sequence variant that causes the extension of a genomic feature, with regard to the reference sequence. (cls, SO:ke)
        (SO_0001907)
        """
        return _namespace_SO('SO_0001907')

    @classmethod
    def internal_feature_elongation(cls):
        """A sequence variant that causes the extension of a genomic feature from within the feature rather than from the terminus of the feature, with regard to the reference sequence. (cls, SO:ke)
        (SO_0001908)
        """
        return _namespace_SO('SO_0001908')

    @classmethod
    def frameshift_elongation(cls):
        """A frameshift variant that causes the translational reading frame to be extended relative to the reference feature. (cls, SO:ke)
        (SO_0001909)
        """
        return _namespace_SO('SO_0001909')

    @classmethod
    def frameshift_truncation(cls):
        """A frameshift variant that causes the translational reading frame to be shortened relative to the reference feature. (cls, SO:ke)
        (SO_0001910)
        """
        return _namespace_SO('SO_0001910')

    @classmethod
    def copy_number_increase(cls):
        """A sequence variant where copies of a feature are increased relative to the reference. (cls, SO:ke)
        (SO_0001911)
        """
        return _namespace_SO('SO_0001911')

    @classmethod
    def copy_number_decrease(cls):
        """A sequence variant where copies of a feature are decreased relative to the reference. (cls, SO:ke)
        (SO_0001912)
        """
        return _namespace_SO('SO_0001912')

    @classmethod
    def bacterial_RNApol_promoter_sigma_ecf(cls):
        """A bacterial promoter with sigma ecf factor binding dependency. This is a type of bacterial promoters that requires a sigma ECF factor to bind to identified -10 and -35 sequence regions in order to mediate binding of the RNA polymerase to the promoter region as part of transcription initiation. (cls, Invitrogen:kc)
        (SO_0001913)
        """
        return _namespace_SO('SO_0001913')

    @classmethod
    def rDNA_replication_fork_barrier(cls):
        """A DNA motif that is found in eukaryotic rDNA repeats, and is a site of replication fork pausing. (cls, PMID:14645529)
        (SO_0001914)
        """
        return _namespace_SO('SO_0001914')

    @classmethod
    def transcription_start_cluster(cls):
        """A region defined by a cluster of experimentally determined transcription starting sites. (cls, PMID:19624849, PMID:21372179, SO:andrewgibson)
        (SO_0001915)
        """
        return _namespace_SO('SO_0001915')

    @classmethod
    def CAGE_tag(cls):
        """A CAGE tag is a sequence tag hat corresponds to 5' ends of mRNA at cap sites, produced by cap analysis gene expression and used to identify transcriptional start sites. (cls, SO:andrewgibson)
        (SO_0001916)
        """
        return _namespace_SO('SO_0001916')

    @classmethod
    def CAGE_cluster(cls):
        """A kind of transcription_initiation_cluster defined by the clustering of CAGE tags on a sequence region. (cls, PMID:16645617, SO:andrewgibson)
        (SO_0001917)
        """
        return _namespace_SO('SO_0001917')

    @classmethod
    def a_methylcytosine(cls):
        """A cytosine methylated at the 5 carbon. (cls, SO:rtapella)
        (SO_0001918)
        """
        return _namespace_SO('SO_0001918')

    @classmethod
    def N4_methylcytosine(cls):
        """A cytosine methylated at the 4 nitrogen. (cls, SO:rtapella)
        (SO_0001919)
        """
        return _namespace_SO('SO_0001919')

    @classmethod
    def N6_methyladenine(cls):
        """An adenine methylated at the 6 nitrogen. (cls, SO:rtapella)
        (SO_0001920)
        """
        return _namespace_SO('SO_0001920')

    @classmethod
    def mitochondrial_contig(cls):
        """A contig of mitochondria derived sequences. (cls, GMOD:ea)
        (SO_0001921)
        """
        return _namespace_SO('SO_0001921')

    @classmethod
    def mitochondrial_supercontig(cls):
        """A scaffold composed of mitochondrial contigs. (cls, GMOD:ea)
        (SO_0001922)
        """
        return _namespace_SO('SO_0001922')

    @classmethod
    def TERRA(cls):
        """A non-coding RNA transcript, derived from the transcription of the telomere. These  transcripts contain G rich telomeric RNA repeats and RNA tracts corresponding to adjacent subtelomeric sequences. They are 100-9000 bases long. (cls, PMID:22139915)
        (SO_0001923)
        """
        return _namespace_SO('SO_0001923')

    @classmethod
    def ARRET(cls):
        """A non coding RNA transcript, complementary to subtelomeric tract of TERRA transcript but devoid of the repeats. (cls, PMID:2139915)
        (SO_0001924)
        """
        return _namespace_SO('SO_0001924')

    @classmethod
    def ARIA(cls):
        """A non-coding RNA transcript, derived from the transcription of the telomere. These  transcripts consist of C rich repeats. (cls, PMID:22139915)
        (SO_0001925)
        """
        return _namespace_SO('SO_0001925')

    @classmethod
    def anti_ARRET(cls):
        """A non-coding RNA transcript, derived from the transcription of the telomere. These  transcripts are antisense of ARRET transcripts. (cls, PMID:22139915)
        (SO_0001926)
        """
        return _namespace_SO('SO_0001926')

    @classmethod
    def telomeric_transcript(cls):
        """A non-coding transcript derived from thetranscript of the telomere. (cls, PMID:22139915)
        (SO_0001927)
        """
        return _namespace_SO('SO_0001927')

    @classmethod
    def distal_duplication(cls):
        """A duplication of the distal region of a chromosome. (cls, SO:bm)
        (SO_0001928)
        """
        return _namespace_SO('SO_0001928')

    @classmethod
    def mitochondrial_DNA_read(cls):
        """A sequencer read of a mitochondrial DNA sample. (cls, GMOD:ea)
        (SO_0001929)
        """
        return _namespace_SO('SO_0001929')

    @classmethod
    def chloroplast_DNA_read(cls):
        """A sequencer read of a chloroplast DNA sample. (cls, GMOD:ea)
        (SO_0001930)
        """
        return _namespace_SO('SO_0001930')

    @classmethod
    def regulatory_region(cls):
        """A region of sequence that is involved in the control of a biological process. (cls, SO:ke)
        (SO_0005836)
        """
        return _namespace_SO('SO_0005836')

    @classmethod
    def U14_snoRNA_primary_transcript(cls):
        """The primary transcript of an evolutionarily conserved eukaryotic low molecular weight RNA capable of intermolecular hybridization with both homologous and heterologous 18S rRNA. (cls, PMID:2251119)
        (SO_0005837)
        """
        return _namespace_SO('SO_0005837')

    @classmethod
    def methylation_guide_snoRNA(cls):
        """A snoRNA that specifies the site of 2'-O-ribose methylation in an RNA molecule by base pairing with a short sequence around the target residue. (cls, GOC:mah, PMID:12457565)
        (SO_0005841)
        """
        return _namespace_SO('SO_0005841')

    @classmethod
    def rRNA_cleavage_RNA(cls):
        """An ncRNA that is part of a ribonucleoprotein that cleaves the primary pre-rRNA transcript in the process of producing mature rRNA molecules. (cls, GOC:kgc)
        (SO_0005843)
        """
        return _namespace_SO('SO_0005843')

    @classmethod
    def exon_of_single_exon_gene(cls):
        """An exon that is the only exon in a gene. (cls, RSC:cb)
        (SO_0005845)
        """
        return _namespace_SO('SO_0005845')

    @classmethod
    def cassette_array_member(cls):
        """-- No comment or description provided. --
        (cls, SO_0005847)
        """
        return _namespace_SO('SO_0005847')

    @classmethod
    def gene_cassette_member(cls):
        """-- No comment or description provided. --
        (cls, SO_0005848)
        """
        return _namespace_SO('SO_0005848')

    @classmethod
    def gene_subarray_member(cls):
        """-- No comment or description provided. --
        (cls, SO_0005849)
        """
        return _namespace_SO('SO_0005849')

    @classmethod
    def primer_binding_site(cls):
        """Non-covalent primer binding site for initiation of replication, transcription, or reverse transcription. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (SO_0005850)
        """
        return _namespace_SO('SO_0005850')

    @classmethod
    def gene_array(cls):
        """An array includes two or more genes, or two or more gene subarrays, contiguously arranged where the individual genes, or subarrays, are either identical in sequence, or essentially so. (cls, SO:ma)
        (SO_0005851)
        """
        return _namespace_SO('SO_0005851')

    @classmethod
    def gene_subarray(cls):
        """A subarray is, by defintition, a member of a gene array (cls, SO:0005851); the members of a subarray may differ substantially in sequence, but are closely related in function. (SO:ma)
        (SO_0005852)
        """
        return _namespace_SO('SO_0005852')

    @classmethod
    def gene_cassette(cls):
        """A gene that can be substituted for a related gene at a different site in the genome. (cls, SGD:se)
        (SO_0005853)
        """
        return _namespace_SO('SO_0005853')

    @classmethod
    def gene_cassette_array(cls):
        """An array of non-functional genes whose members, when captured by recombination form functional genes. (cls, SO:ma)
        (SO_0005854)
        """
        return _namespace_SO('SO_0005854')

    @classmethod
    def gene_group(cls):
        """A collection of related genes. (cls, SO:ma)
        (SO_0005855)
        """
        return _namespace_SO('SO_0005855')

    @classmethod
    def selenocysteine_tRNA_primary_transcript(cls):
        """A primary transcript encoding seryl tRNA (cls, SO:000269). (SO:ke)
        (SO_0005856)
        """
        return _namespace_SO('SO_0005856')

    @classmethod
    def selenocysteinyl_tRNA(cls):
        """A tRNA sequence that has a selenocysteine anticodon, and a 3' selenocysteine binding region. (cls, SO:ke)
        (SO_0005857)
        """
        return _namespace_SO('SO_0005857')

    @classmethod
    def syntenic_region(cls):
        """A region in which two or more pairs of homologous markers occur on the same chromosome in two or more species. (cls, http://www.informatics.jax.org/silverbook/glossary.shtml)
        (SO_0005858)
        """
        return _namespace_SO('SO_0005858')

    @classmethod
    def biochemical_region_of_peptide(cls):
        """A region of a peptide that is involved in a biochemical function. (cls, EBIBS:GAR)
        (SO_0100001)
        """
        return _namespace_SO('SO_0100001')

    @classmethod
    def molecular_contact_region(cls):
        """A region that is involved a contact with another molecule. (cls, EBIBS:GAR)
        (SO_0100002)
        """
        return _namespace_SO('SO_0100002')

    @classmethod
    def intrinsically_unstructured_polypeptide_region(cls):
        """A region of polypeptide chain with high conformational flexibility. (cls, EBIBS:GAR)
        (SO_0100003)
        """
        return _namespace_SO('SO_0100003')

    @classmethod
    def catmat_left_handed_three(cls):
        """A motif of 3 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i: psi -10 bounds -50 to 30, res i+1: phi -75 bounds -100 to -50, res i+1: psi 140 bounds 110 to 170. An extra restriction of the length of the O to O distance would be useful, that it be less than 5 Angstrom. More precisely these two oxygens are the main chain carbonyl oxygen atoms of residues i-1 and i+1. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0100004)
        """
        return _namespace_SO('SO_0100004')

    @classmethod
    def catmat_left_handed_four(cls):
        """A motif of 4 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i psi -10 bounds -50 to 30, res i+1: phi -90 bounds -120 to -60, res i+1: psi -10 bounds -50 to 30, res i+2: phi -75 bounds -100 to -50, res i+2: psi 140 bounds 110 to 170.  The extra restriction of the length of the O to O distance is similar, that it be less than 5 Angstrom. In this case these two Oxygen atoms are the main chain carbonyl oxygen atoms of residues i-1 and i+2. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0100005)
        """
        return _namespace_SO('SO_0100005')

    @classmethod
    def catmat_right_handed_three(cls):
        """A motif of 3 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i: psi -10 bounds -50 to 30, res i+1: phi -75 bounds -100 to -50, res i+1: psi 140 bounds 110 to 170. An extra restriction of the length of the O to O distance would be useful, that it be less than 5 Angstrom. More precisely these two oxygens are the main chain carbonyl oxygen atoms of residues i-1 and i+1. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0100006)
        """
        return _namespace_SO('SO_0100006')

    @classmethod
    def catmat_right_handed_four(cls):
        """A motif of 4 consecutive residues with dihedral angles as follows: res i: phi -90 bounds -120 to -60, res i: psi -10 bounds -50 to 30, res i+1: phi -90 bounds -120 to -60, res i+1: psi -10 bounds -50 to 30, res i+2: phi -75 bounds -100 to -50, res i+2: psi 140 bounds 110 to 170. The extra restriction of the length of the O to O distance is similar, that it be less than 5 Angstrom. In this case these two Oxygen atoms are the main chain carbonyl oxygen atoms of residues i-1 and i+2. (cls, EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0100007)
        """
        return _namespace_SO('SO_0100007')

    @classmethod
    def alpha_beta_motif(cls):
        """A motif of five consecutive residues and two H-bonds in which: H-bond between CO of residue(cls, i) and NH of residue(i+4), H-bond between CO of residue(i) and NH of residue(i+3),Phi angles of residues(i+1), (i+2) and (i+3) are negative. (EBIBS:GAR, http://www.ebi.ac.uk/msd-srv/msdmotif/)
        (SO_0100008)
        """
        return _namespace_SO('SO_0100008')

    @classmethod
    def lipoprotein_signal_peptide(cls):
        """A peptide that acts as a signal for both membrane translocation and lipid attachment in prokaryotes. (cls, EBIBS:GAR)
        (SO_0100009)
        """
        return _namespace_SO('SO_0100009')

    @classmethod
    def no_output(cls):
        """An experimental region wherean analysis has been run and not produced any annotation. (cls, EBIBS:GAR)
        (SO_0100010)
        """
        return _namespace_SO('SO_0100010')

    @classmethod
    def cleaved_peptide_region(cls):
        """The cleaved_peptide_regon is the a region of peptide sequence that is cleaved during maturation. (cls, EBIBS:GAR)
        (SO_0100011)
        """
        return _namespace_SO('SO_0100011')

    @classmethod
    def peptide_coil(cls):
        """Irregular, unstructured regions of a protein's backbone, as distinct from the regular region (cls, namely alpha helix and beta strand - characterised by specific patterns of main-chain hydrogen bonds). (EBIBS:GAR)
        (SO_0100012)
        """
        return _namespace_SO('SO_0100012')

    @classmethod
    def hydrophobic_region_of_peptide(cls):
        """Hydrophobic regions are regions with a low affinity for water. (cls, EBIBS:GAR)
        (SO_0100013)
        """
        return _namespace_SO('SO_0100013')

    @classmethod
    def n_terminal_region(cls):
        """The amino-terminal positively-charged region of a signal peptide (cls, approx 1-5 aa). (EBIBS:GAR)
        (SO_0100014)
        """
        return _namespace_SO('SO_0100014')

    @classmethod
    def c_terminal_region(cls):
        """The more polar, carboxy-terminal region of the signal peptide (cls, approx 3-7 aa). (EBIBS:GAR)
        (SO_0100015)
        """
        return _namespace_SO('SO_0100015')

    @classmethod
    def central_hydrophobic_region_of_signal_peptide(cls):
        """The central, hydrophobic region of the signal peptide (cls, approx 7-15 aa). (EBIBS:GAR)
        (SO_0100016)
        """
        return _namespace_SO('SO_0100016')

    @classmethod
    def polypeptide_conserved_motif(cls):
        """A conserved motif is a short (cls, up to 20 amino acids) region of biological interest that is conserved in different proteins. They may or may not have functional or structural significance within the proteins in which they are found. (EBIBS:GAR)
        (SO_0100017)
        """
        return _namespace_SO('SO_0100017')

    @classmethod
    def polypeptide_binding_motif(cls):
        """A polypeptide binding motif is a short (cls, up to 20 amino acids) polypeptide region of biological interest that contains one or more amino acids experimentally shown to bind to a ligand. (EBIBS:GAR)
        (SO_0100018)
        """
        return _namespace_SO('SO_0100018')

    @classmethod
    def polypeptide_catalytic_motif(cls):
        """A polypeptide catalytic motif is a short (cls, up to 20 amino acids) polypeptide region that contains one or more active site residues. (EBIBS:GAR)
        (SO_0100019)
        """
        return _namespace_SO('SO_0100019')

    @classmethod
    def polypeptide_DNA_contact(cls):
        """A binding site that, in the polypeptide molecule, interacts selectively and non-covalently with DNA. (cls, EBIBS:GAR, SO:ke)
        (SO_0100020)
        """
        return _namespace_SO('SO_0100020')

    @classmethod
    def polypeptide_conserved_region(cls):
        """A subsection of sequence with biological interest that is conserved in different proteins. They may or may not have functional or structural significance within the proteins in which they are found. (cls, EBIBS:GAR)
        (SO_0100021)
        """
        return _namespace_SO('SO_0100021')

    @classmethod
    def substitution(cls):
        """A sequence alteration where the length of the change in the variant is the same as that of the reference. (cls, SO:ke)
        (SO_1000002)
        """
        return _namespace_SO('SO_1000002')

    @classmethod
    def complex_substitution(cls):
        """When no simple or well defined DNA mutation event describes the observed DNA change, the keyword \"complex\" should be used. Usually there are multiple equally plausible explanations for the change. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000005)
        """
        return _namespace_SO('SO_1000005')

    @classmethod
    def point_mutation(cls):
        """A single nucleotide change which has occurred at the same position of a corresponding nucleotide in a reference sequence. (cls, SO:immuno_workshop)
        (SO_1000008)
        """
        return _namespace_SO('SO_1000008')

    @classmethod
    def transition(cls):
        """Change of a pyrimidine nucleotide, C or T, into an other pyrimidine nucleotide, or change of a purine nucleotide, A or G, into an other purine nucleotide. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000009)
        """
        return _namespace_SO('SO_1000009')

    @classmethod
    def pyrimidine_transition(cls):
        """A substitution of a pyrimidine, C or T, for another pyrimidine. (cls, SO:ke)
        (SO_1000010)
        """
        return _namespace_SO('SO_1000010')

    @classmethod
    def C_to_T_transition(cls):
        """A transition of a cytidine to a thymine. (cls, SO:ke)
        (SO_1000011)
        """
        return _namespace_SO('SO_1000011')

    @classmethod
    def C_to_T_transition_at_pCpG_site(cls):
        """The transition of cytidine to thymine occurring at a pCpG site as a consequence of the spontaneous deamination of 5'-methylcytidine. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000012)
        """
        return _namespace_SO('SO_1000012')

    @classmethod
    def T_to_C_transition(cls):
        """-- No comment or description provided. --
        (cls, SO_1000013)
        """
        return _namespace_SO('SO_1000013')

    @classmethod
    def purine_transition(cls):
        """A substitution of a purine, A or G, for another purine. (cls, SO:ke)
        (SO_1000014)
        """
        return _namespace_SO('SO_1000014')

    @classmethod
    def A_to_G_transition(cls):
        """A transition of an adenine to a guanine. (cls, SO:ke)
        (SO_1000015)
        """
        return _namespace_SO('SO_1000015')

    @classmethod
    def G_to_A_transition(cls):
        """A transition of a guanine to an adenine. (cls, SO:ke)
        (SO_1000016)
        """
        return _namespace_SO('SO_1000016')

    @classmethod
    def transversion(cls):
        """Change of a pyrimidine nucleotide, C or T, into a purine nucleotide, A or G, or vice versa. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000017)
        """
        return _namespace_SO('SO_1000017')

    @classmethod
    def pyrimidine_to_purine_transversion(cls):
        """Change of a pyrimidine nucleotide, C or T, into a purine nucleotide, A or G. (cls, SO:ke)
        (SO_1000018)
        """
        return _namespace_SO('SO_1000018')

    @classmethod
    def C_to_A_transversion(cls):
        """A transversion from cytidine to adenine. (cls, SO:ke)
        (SO_1000019)
        """
        return _namespace_SO('SO_1000019')

    @classmethod
    def C_to_G_transversion(cls):
        """-- No comment or description provided. --
        (cls, SO_1000020)
        """
        return _namespace_SO('SO_1000020')

    @classmethod
    def T_to_A_transversion(cls):
        """A transversion from T to A. (cls, SO:ke)
        (SO_1000021)
        """
        return _namespace_SO('SO_1000021')

    @classmethod
    def T_to_G_transversion(cls):
        """A transversion from T to G. (cls, SO:ke)
        (SO_1000022)
        """
        return _namespace_SO('SO_1000022')

    @classmethod
    def purine_to_pyrimidine_transversion(cls):
        """Change of a purine nucleotide, A or G , into a pyrimidine nucleotide C or T. (cls, SO:ke)
        (SO_1000023)
        """
        return _namespace_SO('SO_1000023')

    @classmethod
    def A_to_C_transversion(cls):
        """A transversion from adenine to cytidine. (cls, SO:ke)
        (SO_1000024)
        """
        return _namespace_SO('SO_1000024')

    @classmethod
    def A_to_T_transversion(cls):
        """A transversion from adenine to thymine. (cls, SO:ke)
        (SO_1000025)
        """
        return _namespace_SO('SO_1000025')

    @classmethod
    def G_to_C_transversion(cls):
        """A transversion from guanine to cytidine. (cls, SO:ke)
        (SO_1000026)
        """
        return _namespace_SO('SO_1000026')

    @classmethod
    def G_to_T_transversion(cls):
        """A transversion from guanine to thymine. (cls, SO:ke)
        (SO_1000027)
        """
        return _namespace_SO('SO_1000027')

    @classmethod
    def intrachromosomal_mutation(cls):
        """A chromosomal structure variation within a single chromosome. (cls, SO:ke)
        (SO_1000028)
        """
        return _namespace_SO('SO_1000028')

    @classmethod
    def chromosomal_deletion(cls):
        """An incomplete chromosome. (cls, SO:ke)
        (SO_1000029)
        """
        return _namespace_SO('SO_1000029')

    @classmethod
    def chromosomal_inversion(cls):
        """An interchromosomal mutation where a region of the chromosome is inverted with respect to wild type. (cls, SO:ke)
        (SO_1000030)
        """
        return _namespace_SO('SO_1000030')

    @classmethod
    def interchromosomal_mutation(cls):
        """A chromosomal structure variation whereby more than one chromosome is involved. (cls, SO:ke)
        (SO_1000031)
        """
        return _namespace_SO('SO_1000031')

    @classmethod
    def indel(cls):
        """A sequence alteration which included an insertion and a deletion, affecting 2 or more bases. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html, http:http://www.hgvs.org/mutnomen/recs-DNA.html#indel)
        (SO_1000032)
        """
        return _namespace_SO('SO_1000032')

    @classmethod
    def duplication(cls):
        """One or more nucleotides are added between two adjacent nucleotides in the sequence; the inserted sequence derives from, or is identical in sequence to, nucleotides adjacent to insertion point. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000035)
        """
        return _namespace_SO('SO_1000035')

    @classmethod
    def inversion(cls):
        """A continuous nucleotide sequence is inverted in the same position. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000036)
        """
        return _namespace_SO('SO_1000036')

    @classmethod
    def chromosomal_duplication(cls):
        """An extra chromosome. (cls, SO:ke)
        (SO_1000037)
        """
        return _namespace_SO('SO_1000037')

    @classmethod
    def intrachromosomal_duplication(cls):
        """A duplication that occurred within a chromosome. (cls, SO:ke)
        (SO_1000038)
        """
        return _namespace_SO('SO_1000038')

    @classmethod
    def direct_tandem_duplication(cls):
        """A tandem duplication where the individual regions are in the same orientation. (cls, SO:ke)
        (SO_1000039)
        """
        return _namespace_SO('SO_1000039')

    @classmethod
    def inverted_tandem_duplication(cls):
        """A tandem duplication where the individual regions are not in the same orientation. (cls, SO:ke)
        (SO_1000040)
        """
        return _namespace_SO('SO_1000040')

    @classmethod
    def intrachromosomal_transposition(cls):
        """A chromosome structure variation whereby a transposition occurred within a chromosome. (cls, SO:ke)
        (SO_1000041)
        """
        return _namespace_SO('SO_1000041')

    @classmethod
    def compound_chromosome(cls):
        """A chromosome structure variant where a monocentric element is caused by the fusion of two chromosome arms. (cls, SO:ke)
        (SO_1000042)
        """
        return _namespace_SO('SO_1000042')

    @classmethod
    def Robertsonian_fusion(cls):
        """A non reciprocal translocation whereby the participating chromosomes break at their centromeres and the long arms fuse to form a single chromosome with a single centromere. (cls, http://en.wikipedia.org/wiki/Robertsonian_translocation)
        (SO_1000043)
        """
        return _namespace_SO('SO_1000043')

    @classmethod
    def chromosomal_translocation(cls):
        """An interchromosomal mutation. Rearrangements that alter the pairing of telomeres are classified as translocations. (cls, FB:reference_manual)
        (SO_1000044)
        """
        return _namespace_SO('SO_1000044')

    @classmethod
    def ring_chromosome(cls):
        """A ring chromosome is a chromosome whose arms have fused together to form a ring, often with the loss of the ends of the chromosome. (cls, http://en.wikipedia.org/wiki/Ring_chromosome)
        (SO_1000045)
        """
        return _namespace_SO('SO_1000045')

    @classmethod
    def pericentric_inversion(cls):
        """A chromosomal inversion that includes the centromere. (cls, FB:reference_manual)
        (SO_1000046)
        """
        return _namespace_SO('SO_1000046')

    @classmethod
    def paracentric_inversion(cls):
        """A chromosomal inversion that does not include the centromere. (cls, FB:reference_manual)
        (SO_1000047)
        """
        return _namespace_SO('SO_1000047')

    @classmethod
    def reciprocal_chromosomal_translocation(cls):
        """A chromosomal translocation with two breaks; two chromosome segments have simply been exchanged. (cls, FB:reference_manual)
        (SO_1000048)
        """
        return _namespace_SO('SO_1000048')

    @classmethod
    def sequence_variation_affecting_transcript(cls):
        """Any change in mature, spliced and processed, RNA that results from a change in the corresponding DNA sequence. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000049)
        """
        return _namespace_SO('SO_1000049')

    @classmethod
    def sequence_variant_causing_no_change_in_transcript(cls):
        """No effect on the state of the RNA. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000050)
        """
        return _namespace_SO('SO_1000050')

    @classmethod
    def sequence_variation_affecting_coding_sequence(cls):
        """Any of the amino acid coding triplets of a gene are affected by the DNA mutation. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000054)
        """
        return _namespace_SO('SO_1000054')

    @classmethod
    def sequence_variant_causing_initiator_codon_change_in_transcript(cls):
        """The DNA mutation changes, usually destroys, the first coding triplet of a gene. Usually prevents translation although another initiator codon may be used. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000055)
        """
        return _namespace_SO('SO_1000055')

    @classmethod
    def sequence_variant_causing_amino_acid_coding_codon_change_in_transcript(cls):
        """The DNA mutation affects the amino acid coding sequence of a gene; this region includes both the initiator and terminator codons. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000056)
        """
        return _namespace_SO('SO_1000056')

    @classmethod
    def sequence_variant_causing_synonymous_codon_change_in_transcript(cls):
        """The changed codon has the same translation product as the original codon. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000057)
        """
        return _namespace_SO('SO_1000057')

    @classmethod
    def sequence_variant_causing_non_synonymous_codon_change_in_transcript(cls):
        """A DNA point mutation that causes a substitution of an amino acid by an other. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000058)
        """
        return _namespace_SO('SO_1000058')

    @classmethod
    def sequence_variant_causing_missense_codon_change_in_transcript(cls):
        """The nucleotide change in the codon leads to a new codon coding for a new amino acid. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000059)
        """
        return _namespace_SO('SO_1000059')

    @classmethod
    def sequence_variant_causing_conservative_missense_codon_change_in_transcript(cls):
        """The amino acid change following from the codon change does not change the gross properties (cls, size, charge, hydrophobicity) of the amino acid at that position. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000060)
        """
        return _namespace_SO('SO_1000060')

    @classmethod
    def sequence_variant_causing_nonconservative_missense_codon_change_in_transcript(cls):
        """The amino acid change following from the codon change changes the gross properties (cls, size, charge, hydrophobicity) of the amino acid in that position. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000061)
        """
        return _namespace_SO('SO_1000061')

    @classmethod
    def sequence_variant_causing_nonsense_codon_change_in_transcript(cls):
        """The nucleotide change in the codon triplet creates a terminator codon. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000062)
        """
        return _namespace_SO('SO_1000062')

    @classmethod
    def sequence_variant_causing_terminator_codon_change_in_transcript(cls):
        """The nucleotide change in the codon triplet changes the stop codon, causing an elongated transcript sequence. (cls, SO:ke)
        (SO_1000063)
        """
        return _namespace_SO('SO_1000063')

    @classmethod
    def sequence_variation_affecting_reading_frame(cls):
        """An umbrella term for terms describing an effect of a sequence variation on the frame of translation. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000064)
        """
        return _namespace_SO('SO_1000064')

    @classmethod
    def frameshift_sequence_variation(cls):
        """A mutation causing a disruption of the translational reading frame, because the number of nucleotides inserted or deleted is not a multiple of three. (cls, SO:ke)
        (SO_1000065)
        """
        return _namespace_SO('SO_1000065')

    @classmethod
    def sequence_variant_causing_plus_1_frameshift_mutation(cls):
        """A mutation causing a disruption of the translational reading frame, due to the insertion of a nucleotide. (cls, SO:ke)
        (SO_1000066)
        """
        return _namespace_SO('SO_1000066')

    @classmethod
    def sequence_variant_causing_minus_1_frameshift(cls):
        """A mutation causing a disruption of the translational reading frame, due to the deletion of a nucleotide. (cls, SO:ke)
        (SO_1000067)
        """
        return _namespace_SO('SO_1000067')

    @classmethod
    def sequence_variant_causing_plus_2_frameshift(cls):
        """A mutation causing a disruption of the translational reading frame, due to the insertion of two nucleotides. (cls, SO:ke)
        (SO_1000068)
        """
        return _namespace_SO('SO_1000068')

    @classmethod
    def sequence_variant_causing_minus_2_frameshift(cls):
        """A mutation causing a disruption of the translational reading frame, due to the deletion of two nucleotides. (cls, SO:ke)
        (SO_1000069)
        """
        return _namespace_SO('SO_1000069')

    @classmethod
    def sequence_variant_affecting_transcript_processing(cls):
        """Sequence variant affects the way in which the primary transcriptional product is processed to form the mature transcript. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000070)
        """
        return _namespace_SO('SO_1000070')

    @classmethod
    def sequence_variant_affecting_splicing(cls):
        """A sequence_variant_effect where the way in which the primary transcriptional product is processed to form the mature transcript, specifically by the removal (cls, splicing) of intron sequences is changed. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000071)
        """
        return _namespace_SO('SO_1000071')

    @classmethod
    def sequence_variant_affecting_splice_donor(cls):
        """A sequence_variant_effect that changes the splice donor sequence. (cls, SO:ke)
        (SO_1000072)
        """
        return _namespace_SO('SO_1000072')

    @classmethod
    def sequence_variant_affecting_splice_acceptor(cls):
        """A sequence_variant_effect that changes the splice acceptor sequence. (cls, SO:ke)
        (SO_1000073)
        """
        return _namespace_SO('SO_1000073')

    @classmethod
    def sequence_variant_causing_cryptic_splice_activation(cls):
        """A sequence variant causing a new (cls, functional) splice site. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000074)
        """
        return _namespace_SO('SO_1000074')

    @classmethod
    def sequence_variant_affecting_editing(cls):
        """Sequence variant affects the editing of the transcript. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000075)
        """
        return _namespace_SO('SO_1000075')

    @classmethod
    def sequence_variant_affecting_transcription(cls):
        """Mutation affects the process of transcription, its initiation, progression or termination. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000076)
        """
        return _namespace_SO('SO_1000076')

    @classmethod
    def sequence_variant_decreasing_rate_of_transcription(cls):
        """A sequence variation that decreases the rate a which transcription of the sequence occurs. (cls, SO:ke)
        (SO_1000078)
        """
        return _namespace_SO('SO_1000078')

    @classmethod
    def sequence_variation_affecting_transcript_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_1000079)
        """
        return _namespace_SO('SO_1000079')

    @classmethod
    def sequence_variant_increasing_rate_of_transcription(cls):
        """-- No comment or description provided. --
        (cls, SO_1000080)
        """
        return _namespace_SO('SO_1000080')

    @classmethod
    def sequence_variant_affecting_rate_of_transcription(cls):
        """A mutation that alters the rate a which transcription of the sequence occurs. (cls, SO:ke)
        (SO_1000081)
        """
        return _namespace_SO('SO_1000081')

    @classmethod
    def sequence_variant_affecting_transcript_stability(cls):
        """Sequence variant affects the stability of the transcript. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000082)
        """
        return _namespace_SO('SO_1000082')

    @classmethod
    def sequence_variant_increasing_transcript_stability(cls):
        """Sequence variant increases the stability (cls, half-life) of the transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000083)
        """
        return _namespace_SO('SO_1000083')

    @classmethod
    def sequence_variant_decreasing_transcript_stability(cls):
        """Sequence variant decreases the stability (cls, half-life) of the transcript. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000084)
        """
        return _namespace_SO('SO_1000084')

    @classmethod
    def sequence_variation_affecting_level_of_transcript(cls):
        """A sequence variation that causes a change in the level of mature, spliced and processed RNA, resulting from a change in the corresponding DNA sequence. (cls, SO:ke)
        (SO_1000085)
        """
        return _namespace_SO('SO_1000085')

    @classmethod
    def sequence_variation_decreasing_level_of_transcript(cls):
        """A sequence variation that causes a decrease in the level of mature, spliced and processed RNA, resulting from a change in the corresponding DNA sequence. (cls, SO:ke)
        (SO_1000086)
        """
        return _namespace_SO('SO_1000086')

    @classmethod
    def sequence_variation_increasing_level_of_transcript(cls):
        """A sequence_variation that causes an increase in the level of mature, spliced and processed RNA, resulting from a change in the corresponding DNA sequence. (cls, SO:ke)
        (SO_1000087)
        """
        return _namespace_SO('SO_1000087')

    @classmethod
    def sequence_variant_affecting_translational_product(cls):
        """A sequence variant causing a change in primary translation product of a transcript. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000088)
        """
        return _namespace_SO('SO_1000088')

    @classmethod
    def sequence_variant_causing_no_change_of_translational_product(cls):
        """The sequence variant at RNA level does not lead to any change in polypeptide. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000089)
        """
        return _namespace_SO('SO_1000089')

    @classmethod
    def sequence_variant_causing_complex_change_of_translational_product(cls):
        """Any sequence variant effect that is known at nucleotide level but cannot be explained by using other key terms. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000092)
        """
        return _namespace_SO('SO_1000092')

    @classmethod
    def sequence_variant_causing_amino_acid_substitution(cls):
        """The replacement of a single amino acid by another. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000093)
        """
        return _namespace_SO('SO_1000093')

    @classmethod
    def sequence_variant_causing_conservative_amino_acid_substitution(cls):
        """-- No comment or description provided. --
        (cls, SO_1000094)
        """
        return _namespace_SO('SO_1000094')

    @classmethod
    def sequence_variant_causing_nonconservative_amino_acid_substitution(cls):
        """-- No comment or description provided. --
        (cls, SO_1000095)
        """
        return _namespace_SO('SO_1000095')

    @classmethod
    def sequence_variant_causing_amino_acid_insertion(cls):
        """The insertion of one or more amino acids from the polypeptide, without affecting the surrounding sequence. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000096)
        """
        return _namespace_SO('SO_1000096')

    @classmethod
    def sequence_variant_causing_amino_acid_deletion(cls):
        """The deletion of one or more amino acids from the polypeptide, without affecting the surrounding sequence. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000097)
        """
        return _namespace_SO('SO_1000097')

    @classmethod
    def sequence_variant_causing_polypeptide_truncation(cls):
        """The translational product is truncated at its C-terminus, usually a result of a nonsense codon change in transcript (cls, SO:1000062). (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000098)
        """
        return _namespace_SO('SO_1000098')

    @classmethod
    def sequence_variant_causing_polypeptide_elongation(cls):
        """The extension of the translational product at either (cls, or both) the N-terminus and/or the C-terminus. (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000099)
        """
        return _namespace_SO('SO_1000099')

    @classmethod
    def mutation_causing_polypeptide_N_terminal_elongation(cls):
        """. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000100)
        """
        return _namespace_SO('SO_1000100')

    @classmethod
    def mutation_causing_polypeptide_C_terminal_elongation(cls):
        """. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000101)
        """
        return _namespace_SO('SO_1000101')

    @classmethod
    def sequence_variant_affecting_level_of_translational_product(cls):
        """-- No comment or description provided. --
        (cls, SO_1000102)
        """
        return _namespace_SO('SO_1000102')

    @classmethod
    def sequence_variant_decreasing_level_of_translation_product(cls):
        """-- No comment or description provided. --
        (cls, SO_1000103)
        """
        return _namespace_SO('SO_1000103')

    @classmethod
    def sequence_variant_increasing_level_of_translation_product(cls):
        """-- No comment or description provided. --
        (cls, SO_1000104)
        """
        return _namespace_SO('SO_1000104')

    @classmethod
    def sequence_variant_affecting_polypeptide_amino_acid_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_1000105)
        """
        return _namespace_SO('SO_1000105')

    @classmethod
    def mutation_causing_inframe_polypeptide_N_terminal_elongation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000106)
        """
        return _namespace_SO('SO_1000106')

    @classmethod
    def mutation_causing_out_of_frame_polypeptide_N_terminal_elongation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000107)
        """
        return _namespace_SO('SO_1000107')

    @classmethod
    def mutaton_causing_inframe_polypeptide_C_terminal_elongation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000108)
        """
        return _namespace_SO('SO_1000108')

    @classmethod
    def mutation_causing_out_of_frame_polypeptide_C_terminal_elongation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000109)
        """
        return _namespace_SO('SO_1000109')

    @classmethod
    def frame_restoring_sequence_variant(cls):
        """A mutation that reverts the sequence of a previous frameshift mutation back to the initial frame. (cls, SO:ke)
        (SO_1000110)
        """
        return _namespace_SO('SO_1000110')

    @classmethod
    def sequence_variant_affecting_3D_structure_of_polypeptide(cls):
        """A mutation that changes the amino acid sequence of the peptide in such a way that it changes the 3D structure of the molecule. (cls, SO:ke)
        (SO_1000111)
        """
        return _namespace_SO('SO_1000111')

    @classmethod
    def sequence_variant_causing_no_3D_structural_change(cls):
        """-- No comment or description provided. --
        (cls, SO_1000112)
        """
        return _namespace_SO('SO_1000112')

    @classmethod
    def sequence_variant_causing_complex_3D_structural_change(cls):
        """-- No comment or description provided. --
        (cls, SO_1000115)
        """
        return _namespace_SO('SO_1000115')

    @classmethod
    def sequence_variant_causing_conformational_change(cls):
        """-- No comment or description provided. --
        (cls, SO_1000116)
        """
        return _namespace_SO('SO_1000116')

    @classmethod
    def sequence_variant_affecting_polypeptide_function(cls):
        """-- No comment or description provided. --
        (cls, SO_1000117)
        """
        return _namespace_SO('SO_1000117')

    @classmethod
    def sequence_variant_causing_loss_of_function_of_polypeptide(cls):
        """-- No comment or description provided. --
        (cls, SO_1000118)
        """
        return _namespace_SO('SO_1000118')

    @classmethod
    def sequence_variant_causing_inactive_ligand_binding_site(cls):
        """-- No comment or description provided. --
        (cls, SO_1000119)
        """
        return _namespace_SO('SO_1000119')

    @classmethod
    def sequence_variant_causing_inactive_catalytic_site(cls):
        """-- No comment or description provided. --
        (cls, SO_1000120)
        """
        return _namespace_SO('SO_1000120')

    @classmethod
    def sequence_variant_causing_polypeptide_localization_change(cls):
        """-- No comment or description provided. --
        (cls, SO_1000121)
        """
        return _namespace_SO('SO_1000121')

    @classmethod
    def sequence_variant_causing_polypeptide_post_translational_processing_change(cls):
        """-- No comment or description provided. --
        (cls, SO_1000122)
        """
        return _namespace_SO('SO_1000122')

    @classmethod
    def polypeptide_post_translational_processing_affected(cls):
        """-- No comment or description provided. --
        (cls, SO_1000123)
        """
        return _namespace_SO('SO_1000123')

    @classmethod
    def sequence_variant_causing_partial_loss_of_function_of_polypeptide(cls):
        """-- No comment or description provided. --
        (cls, SO_1000124)
        """
        return _namespace_SO('SO_1000124')

    @classmethod
    def sequence_variant_causing_gain_of_function_of_polypeptide(cls):
        """-- No comment or description provided. --
        (cls, SO_1000125)
        """
        return _namespace_SO('SO_1000125')

    @classmethod
    def sequence_variant_affecting_transcript_secondary_structure(cls):
        """A sequence variant that affects the secondary structure (cls, folding) of the RNA transcript molecule. (SO:ke)
        (SO_1000126)
        """
        return _namespace_SO('SO_1000126')

    @classmethod
    def sequence_variant_causing_compensatory_transcript_secondary_structure_mutation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000127)
        """
        return _namespace_SO('SO_1000127')

    @classmethod
    def sequence_variant_effect(cls):
        """The effect of a change in nucleotide sequence. (cls, SO:ke)
        (SO_1000132)
        """
        return _namespace_SO('SO_1000132')

    @classmethod
    def sequence_variant_causing_polypeptide_fusion(cls):
        """-- No comment or description provided. --
        (cls, SO_1000134)
        """
        return _namespace_SO('SO_1000134')

    @classmethod
    def autosynaptic_chromosome(cls):
        """An autosynaptic chromosome is the aneuploid product of recombination between a pericentric inversion and a cytologically wild-type chromosome. (cls, PMID:6804304)
        (SO_1000136)
        """
        return _namespace_SO('SO_1000136')

    @classmethod
    def homo_compound_chromosome(cls):
        """A compound chromosome whereby two copies of the same chromosomal arm attached to a common centromere. The chromosome is diploid for the arm involved. (cls, SO:ke)
        (SO_1000138)
        """
        return _namespace_SO('SO_1000138')

    @classmethod
    def hetero_compound_chromosome(cls):
        """A compound chromosome whereby two arms from different chromosomes are connected through the centromere of one of them. (cls, FB:reference_manual, SO:ke)
        (SO_1000140)
        """
        return _namespace_SO('SO_1000140')

    @classmethod
    def chromosome_fission(cls):
        """A chromosome that occurred by the division of a larger chromosome. (cls, SO:ke)
        (SO_1000141)
        """
        return _namespace_SO('SO_1000141')

    @classmethod
    def dexstrosynaptic_chromosome(cls):
        """An autosynaptic chromosome carrying the two right (cls, D = dextro) telomeres. (FB:manual)
        (SO_1000142)
        """
        return _namespace_SO('SO_1000142')

    @classmethod
    def laevosynaptic_chromosome(cls):
        """LS is an autosynaptic chromosome carrying the two left (cls, L = levo) telomeres. (FB:manual)
        (SO_1000143)
        """
        return _namespace_SO('SO_1000143')

    @classmethod
    def free_duplication(cls):
        """A chromosome structure variation whereby the duplicated sequences are carried as a free centric element. (cls, FB:reference_manual)
        (SO_1000144)
        """
        return _namespace_SO('SO_1000144')

    @classmethod
    def free_ring_duplication(cls):
        """A ring chromosome which is a copy of another chromosome. (cls, SO:ke)
        (SO_1000145)
        """
        return _namespace_SO('SO_1000145')

    @classmethod
    def complex_chromosomal_mutation(cls):
        """A chromosome structure variant with 4 or more breakpoints. (cls, FB:reference_manual, SO:ke)
        (SO_1000146)
        """
        return _namespace_SO('SO_1000146')

    @classmethod
    def deficient_translocation(cls):
        """A chromosomal deletion whereby a translocation occurs in which one of the four broken ends loses a segment before re-joining. (cls, FB:reference_manual)
        (SO_1000147)
        """
        return _namespace_SO('SO_1000147')

    @classmethod
    def inversion_cum_translocation(cls):
        """A chromosomal translocation whereby the first two breaks are in the same chromosome, and the region between them is rejoined in inverted order to the other side of the first break, such that both sides of break one are present on the same chromosome. The remaining free ends are joined as a translocation with those resulting from the third break. (cls, FB:reference_manual)
        (SO_1000148)
        """
        return _namespace_SO('SO_1000148')

    @classmethod
    def bipartite_duplication(cls):
        """An interchromosomal mutation whereby the (cls, large) region between the first two breaks listed is lost, and the two flanking segments (one of them centric) are joined as a translocation to the free ends resulting from the third break. (FB:reference_manual)
        (SO_1000149)
        """
        return _namespace_SO('SO_1000149')

    @classmethod
    def cyclic_translocation(cls):
        """A chromosomal translocation whereby three breaks occurred in three different chromosomes. The centric segment resulting from the first break listed is joined to the acentric segment resulting from the second, rather than the third. (cls, FB:reference_manual)
        (SO_1000150)
        """
        return _namespace_SO('SO_1000150')

    @classmethod
    def bipartite_inversion(cls):
        """A chromosomal inversion caused by three breaks in the same chromosome; both central segments are inverted in place (cls, i.e., they are not transposed). (FB:reference_manual)
        (SO_1000151)
        """
        return _namespace_SO('SO_1000151')

    @classmethod
    def uninverted_insertional_duplication(cls):
        """An insertional duplication where a copy of the segment between the first two breaks listed is inserted at the third break; the insertion is in cytologically the same orientation as its flanking segments. (cls, FB:reference_manual)
        (SO_1000152)
        """
        return _namespace_SO('SO_1000152')

    @classmethod
    def inverted_insertional_duplication(cls):
        """An insertional duplication where a copy of the segment between the first two breaks listed is inserted at the third break; the insertion is in cytologically inverted orientation with respect to its flanking segments. (cls, FB:reference_manual)
        (SO_1000153)
        """
        return _namespace_SO('SO_1000153')

    @classmethod
    def insertional_duplication(cls):
        """A chromosome duplication involving the insertion of a duplicated region (cls, as opposed to a free duplication). (SO:ke)
        (SO_1000154)
        """
        return _namespace_SO('SO_1000154')

    @classmethod
    def interchromosomal_transposition(cls):
        """A chromosome structure variation whereby a transposition occurred between chromosomes. (cls, SO:ke)
        (SO_1000155)
        """
        return _namespace_SO('SO_1000155')

    @classmethod
    def inverted_interchromosomal_transposition(cls):
        """An interchromosomal transposition whereby a copy of the segment between the first two breaks listed is inserted at the third break; the insertion is in cytologically inverted orientation with respect to its flanking segment. (cls, FB:reference_manual)
        (SO_1000156)
        """
        return _namespace_SO('SO_1000156')

    @classmethod
    def uninverted_interchromosomal_transposition(cls):
        """An interchromosomal transition where the segment between the first two breaks listed is removed and inserted at the third break; the insertion is in cytologically the same orientation as its flanking segments. (cls, FB:reference_manual)
        (SO_1000157)
        """
        return _namespace_SO('SO_1000157')

    @classmethod
    def inverted_intrachromosomal_transposition(cls):
        """An intrachromosomal transposition whereby the segment between the first two breaks listed is removed and inserted at the third break; the insertion is in cytologically inverted orientation with respect to its flanking segments. (cls, FB:reference_manual)
        (SO_1000158)
        """
        return _namespace_SO('SO_1000158')

    @classmethod
    def uninverted_intrachromosomal_transposition(cls):
        """An intrachromosomal transposition whereby the segment between the first two breaks listed is removed and inserted at the third break; the insertion is in cytologically the same orientation as its flanking segments. (cls, FB:reference_manual)
        (SO_1000159)
        """
        return _namespace_SO('SO_1000159')

    @classmethod
    def unoriented_insertional_duplication(cls):
        """An insertional duplication where a copy of the segment between the first two breaks listed is inserted at the third break; the orientation of the insertion with respect to its flanking segments is not recorded. (cls, FB:reference_manual)
        (SO_1000160)
        """
        return _namespace_SO('SO_1000160')

    @classmethod
    def unoriented_interchromosomal_transposition(cls):
        """An interchromosomal transposition whereby a copy of the segment between the first two breaks listed is inserted at the third break; the orientation of the insertion with respect to its flanking segments is not recorded. (cls, FB:reference_manual)
        (SO_1000161)
        """
        return _namespace_SO('SO_1000161')

    @classmethod
    def unoriented_intrachromosomal_transposition(cls):
        """An intrachromosomal transposition whereby the segment between the first two breaks listed is removed and inserted at the third break; the orientation of the insertion with respect to its flanking segments is not recorded. (cls, FB:reference_manual)
        (SO_1000162)
        """
        return _namespace_SO('SO_1000162')

    @classmethod
    def uncharacterised_chromosomal_mutation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000170)
        """
        return _namespace_SO('SO_1000170')

    @classmethod
    def deficient_inversion(cls):
        """A chromosomal deletion whereby three breaks occur in the same chromosome; one central region is lost, and the other is inverted. (cls, FB:reference_manual, SO:ke)
        (SO_1000171)
        """
        return _namespace_SO('SO_1000171')

    @classmethod
    def tandem_duplication(cls):
        """A duplication consisting of 2 identical adjacent regions. (cls, SO:ke)
        (SO_1000173)
        """
        return _namespace_SO('SO_1000173')

    @classmethod
    def partially_characterised_chromosomal_mutation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000175)
        """
        return _namespace_SO('SO_1000175')

    @classmethod
    def sequence_variant_affecting_gene_structure(cls):
        """A sequence_variant_effect that changes the gene structure. (cls, SO:ke)
        (SO_1000180)
        """
        return _namespace_SO('SO_1000180')

    @classmethod
    def sequence_variant_causing_gene_fusion(cls):
        """A sequence_variant_effect that changes the gene structure by causing a fusion to another gene. (cls, SO:ke)
        (SO_1000181)
        """
        return _namespace_SO('SO_1000181')

    @classmethod
    def chromosome_number_variation(cls):
        """A kind of chromosome variation where the chromosome complement is not an exact multiple of the haploid number. (cls, SO:ke)
        (SO_1000182)
        """
        return _namespace_SO('SO_1000182')

    @classmethod
    def chromosome_structure_variation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000183)
        """
        return _namespace_SO('SO_1000183')

    @classmethod
    def sequence_variant_causes_exon_loss(cls):
        """A sequence variant affecting splicing and causes an exon loss. (cls, SO:ke)
        (SO_1000184)
        """
        return _namespace_SO('SO_1000184')

    @classmethod
    def sequence_variant_causes_intron_gain(cls):
        """A sequence variant effect, causing an intron to be gained by the processed transcript; usually a result of a donor acceptor mutation (cls, SO:1000072). (EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (SO_1000185)
        """
        return _namespace_SO('SO_1000185')

    @classmethod
    def sequence_variant_causing_cryptic_splice_donor_activation(cls):
        """-- No comment or description provided. --
        (cls, SO_1000186)
        """
        return _namespace_SO('SO_1000186')

    @classmethod
    def sequence_variant_causing_cryptic_splice_acceptor_activation(cls):
        """-- No comment or description provided. --
        (cls, SO_1001186)
        """
        return _namespace_SO('SO_1001186')

    @classmethod
    def alternatively_spliced_transcript(cls):
        """A transcript that is alternatively spliced. (cls, SO:xp)
        (SO_1001187)
        """
        return _namespace_SO('SO_1001187')

    @classmethod
    def encodes_1_polypeptide(cls):
        """A gene that is alternately spliced, but encodes only one polypeptide. (cls, SO:ke)
        (SO_1001188)
        """
        return _namespace_SO('SO_1001188')

    @classmethod
    def encodes_greater_than_1_polypeptide(cls):
        """A gene that is alternately spliced, and encodes more than one polypeptide. (cls, SO:ke)
        (SO_1001189)
        """
        return _namespace_SO('SO_1001189')

    @classmethod
    def encodes_different_polypeptides_different_stop(cls):
        """A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences, but use different stop codons. (cls, SO:ke)
        (SO_1001190)
        """
        return _namespace_SO('SO_1001190')

    @classmethod
    def encodes_overlapping_peptides_different_start(cls):
        """A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences, but use different start codons. (cls, SO:ke)
        (SO_1001191)
        """
        return _namespace_SO('SO_1001191')

    @classmethod
    def encodes_disjoint_polypeptides(cls):
        """A gene that is alternately spliced, and encodes more than one polypeptide, that do not have overlapping peptide sequences. (cls, SO:ke)
        (SO_1001192)
        """
        return _namespace_SO('SO_1001192')

    @classmethod
    def encodes_overlapping_polypeptides_different_start_and_stop(cls):
        """A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences, but use different start and stop codons. (cls, SO:ke)
        (SO_1001193)
        """
        return _namespace_SO('SO_1001193')

    @classmethod
    def alternatively_spliced_gene_encoding_greater_than_1_polypeptide_coding_regions_overlapping(cls):
        """-- No comment or description provided. --
        (cls, SO_1001194)
        """
        return _namespace_SO('SO_1001194')

    @classmethod
    def encodes_overlapping_peptides(cls):
        """A gene that is alternately spliced, and encodes more than one polypeptide, that have overlapping peptide sequences. (cls, SO:ke)
        (SO_1001195)
        """
        return _namespace_SO('SO_1001195')

    @classmethod
    def cryptogene(cls):
        """A maxicircle gene so extensively edited that it cannot be matched to its edited mRNA sequence. (cls, SO:ma)
        (SO_1001196)
        """
        return _namespace_SO('SO_1001196')

    @classmethod
    def dicistronic_primary_transcript(cls):
        """A primary transcript that has the quality dicistronic. (cls, SO:xp)
        (SO_1001197)
        """
        return _namespace_SO('SO_1001197')

    @classmethod
    def member_of_regulon(cls):
        """-- No comment or description provided. --
        (cls, SO_1001217)
        """
        return _namespace_SO('SO_1001217')

    @classmethod
    def alternatively_spliced_transcript_encoding_greater_than_1_polypeptide_different_start_codon_different_stop_codon_coding_regions_non_overlapping(cls):
        """-- No comment or description provided. --
        (cls, SO_1001244)
        """
        return _namespace_SO('SO_1001244')

    @classmethod
    def CDS_independently_known(cls):
        """A CDS with the evidence status of being independently known. (cls, SO:xp)
        (SO_1001246)
        """
        return _namespace_SO('SO_1001246')

    @classmethod
    def orphan_CDS(cls):
        """A CDS whose predicted amino acid sequence is unsupported by any experimental evidence or by any match with any other known sequence. (cls, SO:ma)
        (SO_1001247)
        """
        return _namespace_SO('SO_1001247')

    @classmethod
    def CDS_supported_by_domain_match_data(cls):
        """A CDS that is supported by domain similarity. (cls, SO:xp)
        (SO_1001249)
        """
        return _namespace_SO('SO_1001249')

    @classmethod
    def CDS_supported_by_sequence_similarity_data(cls):
        """A CDS that is supported by sequence similarity data. (cls, SO:xp)
        (SO_1001251)
        """
        return _namespace_SO('SO_1001251')

    @classmethod
    def CDS_predicted(cls):
        """A CDS that is predicted. (cls, SO:ke)
        (SO_1001254)
        """
        return _namespace_SO('SO_1001254')

    @classmethod
    def status_of_coding_sequence(cls):
        """-- No comment or description provided. --
        (cls, SO_1001255)
        """
        return _namespace_SO('SO_1001255')

    @classmethod
    def CDS_supported_by_EST_or_cDNA_data(cls):
        """A CDS that is supported by similarity to EST or cDNA data. (cls, SO:xp)
        (SO_1001259)
        """
        return _namespace_SO('SO_1001259')

    @classmethod
    def internal_Shine_Dalgarno_sequence(cls):
        """A Shine-Dalgarno sequence that stimulates recoding through interactions with the anti-Shine-Dalgarno in the RNA of small ribosomal subunits of translating ribosomes. The signal is only operative in Bacteria. (cls, PMID:12519954, SO:ke)
        (SO_1001260)
        """
        return _namespace_SO('SO_1001260')

    @classmethod
    def recoded_mRNA(cls):
        """The sequence of a mature mRNA transcript, modified before translation or during translation, usually by special cis-acting signals. (cls, http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=8811194&dopt=Abstract)
        (SO_1001261)
        """
        return _namespace_SO('SO_1001261')

    @classmethod
    def minus_1_translationally_frameshifted(cls):
        """An attribute describing a translational frameshift of -1. (cls, SO:ke)
        (SO_1001262)
        """
        return _namespace_SO('SO_1001262')

    @classmethod
    def plus_1_translationally_frameshifted(cls):
        """An attribute describing a translational frameshift of +1. (cls, SO:ke)
        (SO_1001263)
        """
        return _namespace_SO('SO_1001263')

    @classmethod
    def mRNA_recoded_by_translational_bypass(cls):
        """A recoded_mRNA where translation was suspended at a particular codon and resumed at a particular non-overlapping downstream codon. (cls, http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=8811194&dopt=Abstract)
        (SO_1001264)
        """
        return _namespace_SO('SO_1001264')

    @classmethod
    def mRNA_recoded_by_codon_redefinition(cls):
        """A recoded_mRNA that was modified by an alteration of codon meaning. (cls, SO:ma)
        (SO_1001265)
        """
        return _namespace_SO('SO_1001265')

    @classmethod
    def stop_codon_redefinition_as_selenocysteine(cls):
        """-- No comment or description provided. --
        (cls, SO_1001266)
        """
        return _namespace_SO('SO_1001266')

    @classmethod
    def stop_codon_readthrough(cls):
        """-- No comment or description provided. --
        (cls, SO_1001267)
        """
        return _namespace_SO('SO_1001267')

    @classmethod
    def recoding_stimulatory_region(cls):
        """A site in an mRNA sequence that stimulates the recoding of a region in the same mRNA. (cls, http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=12519954&dopt=Abstract)
        (SO_1001268)
        """
        return _namespace_SO('SO_1001268')

    @classmethod
    def four_bp_start_codon(cls):
        """A non-canonical start codon with 4 base pairs. (cls, SO:ke)
        (SO_1001269)
        """
        return _namespace_SO('SO_1001269')

    @classmethod
    def stop_codon_redefinition_as_pyrrolysine(cls):
        """-- No comment or description provided. --
        (cls, SO_1001270)
        """
        return _namespace_SO('SO_1001270')

    @classmethod
    def archaeal_intron(cls):
        """An intron characteristic of Archaeal tRNA and rRNA genes, where intron transcript generates a bulge-helix-bulge motif that is recognised by a splicing endoribonuclease. (cls, PMID:9301331, SO:ma)
        (SO_1001271)
        """
        return _namespace_SO('SO_1001271')

    @classmethod
    def tRNA_intron(cls):
        """An intron found in tRNA that is spliced via endonucleolytic cleavage and ligation rather than transesterification. (cls, SO:ke)
        (SO_1001272)
        """
        return _namespace_SO('SO_1001272')

    @classmethod
    def CTG_start_codon(cls):
        """A non-canonical start codon of sequence CTG. (cls, SO:ke)
        (SO_1001273)
        """
        return _namespace_SO('SO_1001273')

    @classmethod
    def SECIS_element(cls):
        """The incorporation of selenocysteine into a protein sequence is directed by an in-frame UGA codon (cls, usually a stop codon) within the coding region of the mRNA. Selenoprotein mRNAs contain a conserved secondary structure in the 3' UTR that is required for the distinction of UGA stop from UGA selenocysteine. The selenocysteine insertion sequence (SECIS) is around 60 nt in length and adopts a hairpin structure which is sufficiently well-defined and conserved to act as a computational screen for selenoprotein genes. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00031)
        (SO_1001274)
        """
        return _namespace_SO('SO_1001274')

    @classmethod
    def retron(cls):
        """Sequence coding for a short, single-stranded, DNA sequence via a retrotransposed RNA intermediate; characteristic of some microbial genomes. (cls, SO:ma)
        (SO_1001275)
        """
        return _namespace_SO('SO_1001275')

    @classmethod
    def three_prime_recoding_site(cls):
        """The recoding stimulatory signal located downstream of the recoding site. (cls, SO:ke)
        (SO_1001277)
        """
        return _namespace_SO('SO_1001277')

    @classmethod
    def three_prime_stem_loop_structure(cls):
        """A recoding stimulatory region, the stem-loop secondary structural element is downstream of the redefined region. (cls, PMID:12519954, SO:ke)
        (SO_1001279)
        """
        return _namespace_SO('SO_1001279')

    @classmethod
    def five_prime_recoding_site(cls):
        """The recoding stimulatory signal located upstream of the recoding site. (cls, SO:ke)
        (SO_1001280)
        """
        return _namespace_SO('SO_1001280')

    @classmethod
    def flanking_three_prime_quadruplet_recoding_signal(cls):
        """Four base pair sequence immediately downstream of the redefined region. The redefined region is a frameshift site. The quadruplet is 2 overlapping codons. (cls, PMID:12519954, SO:ke)
        (SO_1001281)
        """
        return _namespace_SO('SO_1001281')

    @classmethod
    def UAG_stop_codon_signal(cls):
        """A stop codon signal for a UAG stop codon redefinition. (cls, SO:ke)
        (SO_1001282)
        """
        return _namespace_SO('SO_1001282')

    @classmethod
    def UAA_stop_codon_signal(cls):
        """A stop codon signal for a UAA stop codon redefinition. (cls, SO:ke)
        (SO_1001283)
        """
        return _namespace_SO('SO_1001283')

    @classmethod
    def regulon(cls):
        """A group of genes, whether linked as a cluster or not, that respond to a common regulatory signal. (cls, ISBN:0198506732)
        (SO_1001284)
        """
        return _namespace_SO('SO_1001284')

    @classmethod
    def UGA_stop_codon_signal(cls):
        """A stop codon signal for a UGA stop codon redefinition. (cls, SO:ke)
        (SO_1001285)
        """
        return _namespace_SO('SO_1001285')

    @classmethod
    def three_prime_repeat_recoding_signal(cls):
        """A recoding stimulatory signal, downstream sequence important for recoding that contains repetitive elements. (cls, PMID:12519954, SO:ke)
        (SO_1001286)
        """
        return _namespace_SO('SO_1001286')

    @classmethod
    def distant_three_prime_recoding_signal(cls):
        """A recoding signal that is found many hundreds of nucleotides 3' of a redefined stop codon. (cls, http://www.ncbi.nlm.nih.gov:80/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=8709208&dopt=Abstract)
        (SO_1001287)
        """
        return _namespace_SO('SO_1001287')

    @classmethod
    def stop_codon_signal(cls):
        """A recoding stimulatory signal that is a stop codon and has effect on efficiency of recoding. (cls, PMID:12519954, SO:ke)
        (SO_1001288)
        """
        return _namespace_SO('SO_1001288')

    @classmethod
    def databank_entry(cls):
        """The sequence referred to by an entry in a databank such as Genbank or SwissProt. (cls, SO:ke)
        (SO_2000061)
        """
        return _namespace_SO('SO_2000061')

    @classmethod
    def gene_segment(cls):
        """A gene component region which acts as a recombinational unit of a gene whose functional form is generated through somatic recombination. (cls, GOC:add)
        (SO_3000000)
        """
        return _namespace_SO('SO_3000000')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == _namespace_SO('SEQUENCE_adjacent_to'):
            return True
        if uri == _namespace_SO('SEQUENCE_complete_evidence_for_feature'):
            return True
        if uri == _namespace_SO('SEQUENCE_contained_by'):
            return True
        if uri == _namespace_SO('SEQUENCE_contains'):
            return True
        if uri == _namespace_SO('SEQUENCE_derives_from'):
            return True
        if uri == _namespace_SO('SEQUENCE_evidence_for_feature'):
            return True
        if uri == _namespace_SO('SEQUENCE_guided_by'):
            return True
        if uri == _namespace_SO('SEQUENCE_has_integral_part'):
            return True
        if uri == _namespace_SO('SEQUENCE_has_origin'):
            return True
        if uri == _namespace_SO('SEQUENCE_has_part'):
            return True
        if uri == _namespace_SO('SEQUENCE_has_quality'):
            return True
        if uri == _namespace_SO('SEQUENCE_homologous_to'):
            return True
        if uri == _namespace_SO('SEQUENCE_integral_part_of'):
            return True
        if uri == _namespace_SO('SEQUENCE_member_of'):
            return True
        if uri == _namespace_SO('SEQUENCE_non_functional_homolog_of'):
            return True
        if uri == _namespace_SO('SEQUENCE_orthologous_to'):
            return True
        if uri == _namespace_SO('SEQUENCE_overlaps'):
            return True
        if uri == _namespace_SO('SEQUENCE_paralogous_to'):
            return True
        if uri == _namespace_SO('SEQUENCE_part_of'):
            return True
        if uri == _namespace_SO('SEQUENCE_partial_evidence_for_feature'):
            return True
        if uri == _namespace_SO('SEQUENCE_similar_to'):
            return True
        if uri == _namespace_SO('SEQUENCE_transcribed_from'):
            return True
        if uri == _namespace_SO('SEQUENCE_transcribed_to'):
            return True
        if uri == _namespace_SO('SEQUENCE_variant_of'):
            return True
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == _namespace_SO('SO_0000000'):
            return True
        if uri == _namespace_SO('SO_0000001'):
            return True
        if uri == _namespace_SO('SO_0000002'):
            return True
        if uri == _namespace_SO('SO_0000003'):
            return True
        if uri == _namespace_SO('SO_0000004'):
            return True
        if uri == _namespace_SO('SO_0000005'):
            return True
        if uri == _namespace_SO('SO_0000006'):
            return True
        if uri == _namespace_SO('SO_0000007'):
            return True
        if uri == _namespace_SO('SO_0000008'):
            return True
        if uri == _namespace_SO('SO_0000009'):
            return True
        if uri == _namespace_SO('SO_0000010'):
            return True
        if uri == _namespace_SO('SO_0000011'):
            return True
        if uri == _namespace_SO('SO_0000012'):
            return True
        if uri == _namespace_SO('SO_0000013'):
            return True
        if uri == _namespace_SO('SO_0000014'):
            return True
        if uri == _namespace_SO('SO_0000015'):
            return True
        if uri == _namespace_SO('SO_0000016'):
            return True
        if uri == _namespace_SO('SO_0000017'):
            return True
        if uri == _namespace_SO('SO_0000018'):
            return True
        if uri == _namespace_SO('SO_0000020'):
            return True
        if uri == _namespace_SO('SO_0000021'):
            return True
        if uri == _namespace_SO('SO_0000022'):
            return True
        if uri == _namespace_SO('SO_0000023'):
            return True
        if uri == _namespace_SO('SO_0000024'):
            return True
        if uri == _namespace_SO('SO_0000025'):
            return True
        if uri == _namespace_SO('SO_0000026'):
            return True
        if uri == _namespace_SO('SO_0000027'):
            return True
        if uri == _namespace_SO('SO_0000028'):
            return True
        if uri == _namespace_SO('SO_0000029'):
            return True
        if uri == _namespace_SO('SO_0000030'):
            return True
        if uri == _namespace_SO('SO_0000031'):
            return True
        if uri == _namespace_SO('SO_0000032'):
            return True
        if uri == _namespace_SO('SO_0000033'):
            return True
        if uri == _namespace_SO('SO_0000034'):
            return True
        if uri == _namespace_SO('SO_0000035'):
            return True
        if uri == _namespace_SO('SO_0000036'):
            return True
        if uri == _namespace_SO('SO_0000037'):
            return True
        if uri == _namespace_SO('SO_0000038'):
            return True
        if uri == _namespace_SO('SO_0000039'):
            return True
        if uri == _namespace_SO('SO_0000040'):
            return True
        if uri == _namespace_SO('SO_0000041'):
            return True
        if uri == _namespace_SO('SO_0000042'):
            return True
        if uri == _namespace_SO('SO_0000043'):
            return True
        if uri == _namespace_SO('SO_0000044'):
            return True
        if uri == _namespace_SO('SO_0000045'):
            return True
        if uri == _namespace_SO('SO_0000046'):
            return True
        if uri == _namespace_SO('SO_0000047'):
            return True
        if uri == _namespace_SO('SO_0000048'):
            return True
        if uri == _namespace_SO('SO_0000049'):
            return True
        if uri == _namespace_SO('SO_0000050'):
            return True
        if uri == _namespace_SO('SO_0000051'):
            return True
        if uri == _namespace_SO('SO_0000052'):
            return True
        if uri == _namespace_SO('SO_0000053'):
            return True
        if uri == _namespace_SO('SO_0000054'):
            return True
        if uri == _namespace_SO('SO_0000055'):
            return True
        if uri == _namespace_SO('SO_0000056'):
            return True
        if uri == _namespace_SO('SO_0000057'):
            return True
        if uri == _namespace_SO('SO_0000058'):
            return True
        if uri == _namespace_SO('SO_0000059'):
            return True
        if uri == _namespace_SO('SO_0000060'):
            return True
        if uri == _namespace_SO('SO_0000061'):
            return True
        if uri == _namespace_SO('SO_0000062'):
            return True
        if uri == _namespace_SO('SO_0000063'):
            return True
        if uri == _namespace_SO('SO_0000064'):
            return True
        if uri == _namespace_SO('SO_0000065'):
            return True
        if uri == _namespace_SO('SO_0000066'):
            return True
        if uri == _namespace_SO('SO_0000067'):
            return True
        if uri == _namespace_SO('SO_0000068'):
            return True
        if uri == _namespace_SO('SO_0000069'):
            return True
        if uri == _namespace_SO('SO_0000070'):
            return True
        if uri == _namespace_SO('SO_0000071'):
            return True
        if uri == _namespace_SO('SO_0000072'):
            return True
        if uri == _namespace_SO('SO_0000073'):
            return True
        if uri == _namespace_SO('SO_0000074'):
            return True
        if uri == _namespace_SO('SO_0000075'):
            return True
        if uri == _namespace_SO('SO_0000076'):
            return True
        if uri == _namespace_SO('SO_0000077'):
            return True
        if uri == _namespace_SO('SO_0000078'):
            return True
        if uri == _namespace_SO('SO_0000079'):
            return True
        if uri == _namespace_SO('SO_0000080'):
            return True
        if uri == _namespace_SO('SO_0000081'):
            return True
        if uri == _namespace_SO('SO_0000082'):
            return True
        if uri == _namespace_SO('SO_0000083'):
            return True
        if uri == _namespace_SO('SO_0000084'):
            return True
        if uri == _namespace_SO('SO_0000085'):
            return True
        if uri == _namespace_SO('SO_0000086'):
            return True
        if uri == _namespace_SO('SO_0000087'):
            return True
        if uri == _namespace_SO('SO_0000088'):
            return True
        if uri == _namespace_SO('SO_0000089'):
            return True
        if uri == _namespace_SO('SO_0000090'):
            return True
        if uri == _namespace_SO('SO_0000091'):
            return True
        if uri == _namespace_SO('SO_0000092'):
            return True
        if uri == _namespace_SO('SO_0000093'):
            return True
        if uri == _namespace_SO('SO_0000094'):
            return True
        if uri == _namespace_SO('SO_0000095'):
            return True
        if uri == _namespace_SO('SO_0000096'):
            return True
        if uri == _namespace_SO('SO_0000097'):
            return True
        if uri == _namespace_SO('SO_0000098'):
            return True
        if uri == _namespace_SO('SO_0000099'):
            return True
        if uri == _namespace_SO('SO_0000100'):
            return True
        if uri == _namespace_SO('SO_0000101'):
            return True
        if uri == _namespace_SO('SO_0000102'):
            return True
        if uri == _namespace_SO('SO_0000103'):
            return True
        if uri == _namespace_SO('SO_0000104'):
            return True
        if uri == _namespace_SO('SO_0000105'):
            return True
        if uri == _namespace_SO('SO_0000106'):
            return True
        if uri == _namespace_SO('SO_0000107'):
            return True
        if uri == _namespace_SO('SO_0000108'):
            return True
        if uri == _namespace_SO('SO_0000109'):
            return True
        if uri == _namespace_SO('SO_0000110'):
            return True
        if uri == _namespace_SO('SO_0000111'):
            return True
        if uri == _namespace_SO('SO_0000112'):
            return True
        if uri == _namespace_SO('SO_0000113'):
            return True
        if uri == _namespace_SO('SO_0000114'):
            return True
        if uri == _namespace_SO('SO_0000115'):
            return True
        if uri == _namespace_SO('SO_0000116'):
            return True
        if uri == _namespace_SO('SO_0000117'):
            return True
        if uri == _namespace_SO('SO_0000118'):
            return True
        if uri == _namespace_SO('SO_0000119'):
            return True
        if uri == _namespace_SO('SO_0000120'):
            return True
        if uri == _namespace_SO('SO_0000121'):
            return True
        if uri == _namespace_SO('SO_0000122'):
            return True
        if uri == _namespace_SO('SO_0000123'):
            return True
        if uri == _namespace_SO('SO_0000124'):
            return True
        if uri == _namespace_SO('SO_0000125'):
            return True
        if uri == _namespace_SO('SO_0000126'):
            return True
        if uri == _namespace_SO('SO_0000127'):
            return True
        if uri == _namespace_SO('SO_0000128'):
            return True
        if uri == _namespace_SO('SO_0000129'):
            return True
        if uri == _namespace_SO('SO_0000130'):
            return True
        if uri == _namespace_SO('SO_0000131'):
            return True
        if uri == _namespace_SO('SO_0000132'):
            return True
        if uri == _namespace_SO('SO_0000133'):
            return True
        if uri == _namespace_SO('SO_0000134'):
            return True
        if uri == _namespace_SO('SO_0000135'):
            return True
        if uri == _namespace_SO('SO_0000136'):
            return True
        if uri == _namespace_SO('SO_0000137'):
            return True
        if uri == _namespace_SO('SO_0000138'):
            return True
        if uri == _namespace_SO('SO_0000139'):
            return True
        if uri == _namespace_SO('SO_0000140'):
            return True
        if uri == _namespace_SO('SO_0000141'):
            return True
        if uri == _namespace_SO('SO_0000142'):
            return True
        if uri == _namespace_SO('SO_0000143'):
            return True
        if uri == _namespace_SO('SO_0000144'):
            return True
        if uri == _namespace_SO('SO_0000145'):
            return True
        if uri == _namespace_SO('SO_0000146'):
            return True
        if uri == _namespace_SO('SO_0000147'):
            return True
        if uri == _namespace_SO('SO_0000148'):
            return True
        if uri == _namespace_SO('SO_0000149'):
            return True
        if uri == _namespace_SO('SO_0000150'):
            return True
        if uri == _namespace_SO('SO_0000151'):
            return True
        if uri == _namespace_SO('SO_0000152'):
            return True
        if uri == _namespace_SO('SO_0000153'):
            return True
        if uri == _namespace_SO('SO_0000154'):
            return True
        if uri == _namespace_SO('SO_0000155'):
            return True
        if uri == _namespace_SO('SO_0000156'):
            return True
        if uri == _namespace_SO('SO_0000157'):
            return True
        if uri == _namespace_SO('SO_0000158'):
            return True
        if uri == _namespace_SO('SO_0000159'):
            return True
        if uri == _namespace_SO('SO_0000160'):
            return True
        if uri == _namespace_SO('SO_0000161'):
            return True
        if uri == _namespace_SO('SO_0000162'):
            return True
        if uri == _namespace_SO('SO_0000163'):
            return True
        if uri == _namespace_SO('SO_0000164'):
            return True
        if uri == _namespace_SO('SO_0000165'):
            return True
        if uri == _namespace_SO('SO_0000166'):
            return True
        if uri == _namespace_SO('SO_0000167'):
            return True
        if uri == _namespace_SO('SO_0000168'):
            return True
        if uri == _namespace_SO('SO_0000169'):
            return True
        if uri == _namespace_SO('SO_0000170'):
            return True
        if uri == _namespace_SO('SO_0000171'):
            return True
        if uri == _namespace_SO('SO_0000172'):
            return True
        if uri == _namespace_SO('SO_0000173'):
            return True
        if uri == _namespace_SO('SO_0000174'):
            return True
        if uri == _namespace_SO('SO_0000175'):
            return True
        if uri == _namespace_SO('SO_0000176'):
            return True
        if uri == _namespace_SO('SO_0000177'):
            return True
        if uri == _namespace_SO('SO_0000178'):
            return True
        if uri == _namespace_SO('SO_0000179'):
            return True
        if uri == _namespace_SO('SO_0000180'):
            return True
        if uri == _namespace_SO('SO_0000181'):
            return True
        if uri == _namespace_SO('SO_0000182'):
            return True
        if uri == _namespace_SO('SO_0000183'):
            return True
        if uri == _namespace_SO('SO_0000184'):
            return True
        if uri == _namespace_SO('SO_0000185'):
            return True
        if uri == _namespace_SO('SO_0000186'):
            return True
        if uri == _namespace_SO('SO_0000187'):
            return True
        if uri == _namespace_SO('SO_0000188'):
            return True
        if uri == _namespace_SO('SO_0000189'):
            return True
        if uri == _namespace_SO('SO_0000190'):
            return True
        if uri == _namespace_SO('SO_0000191'):
            return True
        if uri == _namespace_SO('SO_0000192'):
            return True
        if uri == _namespace_SO('SO_0000193'):
            return True
        if uri == _namespace_SO('SO_0000194'):
            return True
        if uri == _namespace_SO('SO_0000195'):
            return True
        if uri == _namespace_SO('SO_0000196'):
            return True
        if uri == _namespace_SO('SO_0000197'):
            return True
        if uri == _namespace_SO('SO_0000198'):
            return True
        if uri == _namespace_SO('SO_0000199'):
            return True
        if uri == _namespace_SO('SO_0000200'):
            return True
        if uri == _namespace_SO('SO_0000201'):
            return True
        if uri == _namespace_SO('SO_0000202'):
            return True
        if uri == _namespace_SO('SO_0000203'):
            return True
        if uri == _namespace_SO('SO_0000204'):
            return True
        if uri == _namespace_SO('SO_0000205'):
            return True
        if uri == _namespace_SO('SO_0000206'):
            return True
        if uri == _namespace_SO('SO_0000207'):
            return True
        if uri == _namespace_SO('SO_0000208'):
            return True
        if uri == _namespace_SO('SO_0000209'):
            return True
        if uri == _namespace_SO('SO_0000210'):
            return True
        if uri == _namespace_SO('SO_0000211'):
            return True
        if uri == _namespace_SO('SO_0000212'):
            return True
        if uri == _namespace_SO('SO_0000213'):
            return True
        if uri == _namespace_SO('SO_0000214'):
            return True
        if uri == _namespace_SO('SO_0000215'):
            return True
        if uri == _namespace_SO('SO_0000216'):
            return True
        if uri == _namespace_SO('SO_0000217'):
            return True
        if uri == _namespace_SO('SO_0000218'):
            return True
        if uri == _namespace_SO('SO_0000219'):
            return True
        if uri == _namespace_SO('SO_0000220'):
            return True
        if uri == _namespace_SO('SO_0000221'):
            return True
        if uri == _namespace_SO('SO_0000222'):
            return True
        if uri == _namespace_SO('SO_0000223'):
            return True
        if uri == _namespace_SO('SO_0000224'):
            return True
        if uri == _namespace_SO('SO_0000225'):
            return True
        if uri == _namespace_SO('SO_0000226'):
            return True
        if uri == _namespace_SO('SO_0000227'):
            return True
        if uri == _namespace_SO('SO_0000228'):
            return True
        if uri == _namespace_SO('SO_0000229'):
            return True
        if uri == _namespace_SO('SO_0000230'):
            return True
        if uri == _namespace_SO('SO_0000231'):
            return True
        if uri == _namespace_SO('SO_0000232'):
            return True
        if uri == _namespace_SO('SO_0000233'):
            return True
        if uri == _namespace_SO('SO_0000234'):
            return True
        if uri == _namespace_SO('SO_0000235'):
            return True
        if uri == _namespace_SO('SO_0000236'):
            return True
        if uri == _namespace_SO('SO_0000237'):
            return True
        if uri == _namespace_SO('SO_0000238'):
            return True
        if uri == _namespace_SO('SO_0000239'):
            return True
        if uri == _namespace_SO('SO_0000240'):
            return True
        if uri == _namespace_SO('SO_0000241'):
            return True
        if uri == _namespace_SO('SO_0000242'):
            return True
        if uri == _namespace_SO('SO_0000243'):
            return True
        if uri == _namespace_SO('SO_0000244'):
            return True
        if uri == _namespace_SO('SO_0000245'):
            return True
        if uri == _namespace_SO('SO_0000246'):
            return True
        if uri == _namespace_SO('SO_0000247'):
            return True
        if uri == _namespace_SO('SO_0000248'):
            return True
        if uri == _namespace_SO('SO_0000249'):
            return True
        if uri == _namespace_SO('SO_0000250'):
            return True
        if uri == _namespace_SO('SO_0000251'):
            return True
        if uri == _namespace_SO('SO_0000252'):
            return True
        if uri == _namespace_SO('SO_0000253'):
            return True
        if uri == _namespace_SO('SO_0000254'):
            return True
        if uri == _namespace_SO('SO_0000255'):
            return True
        if uri == _namespace_SO('SO_0000256'):
            return True
        if uri == _namespace_SO('SO_0000257'):
            return True
        if uri == _namespace_SO('SO_0000258'):
            return True
        if uri == _namespace_SO('SO_0000259'):
            return True
        if uri == _namespace_SO('SO_0000260'):
            return True
        if uri == _namespace_SO('SO_0000261'):
            return True
        if uri == _namespace_SO('SO_0000262'):
            return True
        if uri == _namespace_SO('SO_0000263'):
            return True
        if uri == _namespace_SO('SO_0000264'):
            return True
        if uri == _namespace_SO('SO_0000265'):
            return True
        if uri == _namespace_SO('SO_0000266'):
            return True
        if uri == _namespace_SO('SO_0000267'):
            return True
        if uri == _namespace_SO('SO_0000268'):
            return True
        if uri == _namespace_SO('SO_0000269'):
            return True
        if uri == _namespace_SO('SO_0000270'):
            return True
        if uri == _namespace_SO('SO_0000271'):
            return True
        if uri == _namespace_SO('SO_0000272'):
            return True
        if uri == _namespace_SO('SO_0000273'):
            return True
        if uri == _namespace_SO('SO_0000274'):
            return True
        if uri == _namespace_SO('SO_0000275'):
            return True
        if uri == _namespace_SO('SO_0000276'):
            return True
        if uri == _namespace_SO('SO_0000277'):
            return True
        if uri == _namespace_SO('SO_0000278'):
            return True
        if uri == _namespace_SO('SO_0000279'):
            return True
        if uri == _namespace_SO('SO_0000280'):
            return True
        if uri == _namespace_SO('SO_0000281'):
            return True
        if uri == _namespace_SO('SO_0000282'):
            return True
        if uri == _namespace_SO('SO_0000283'):
            return True
        if uri == _namespace_SO('SO_0000284'):
            return True
        if uri == _namespace_SO('SO_0000285'):
            return True
        if uri == _namespace_SO('SO_0000286'):
            return True
        if uri == _namespace_SO('SO_0000287'):
            return True
        if uri == _namespace_SO('SO_0000288'):
            return True
        if uri == _namespace_SO('SO_0000289'):
            return True
        if uri == _namespace_SO('SO_0000290'):
            return True
        if uri == _namespace_SO('SO_0000291'):
            return True
        if uri == _namespace_SO('SO_0000292'):
            return True
        if uri == _namespace_SO('SO_0000293'):
            return True
        if uri == _namespace_SO('SO_0000294'):
            return True
        if uri == _namespace_SO('SO_0000295'):
            return True
        if uri == _namespace_SO('SO_0000296'):
            return True
        if uri == _namespace_SO('SO_0000297'):
            return True
        if uri == _namespace_SO('SO_0000298'):
            return True
        if uri == _namespace_SO('SO_0000299'):
            return True
        if uri == _namespace_SO('SO_0000300'):
            return True
        if uri == _namespace_SO('SO_0000301'):
            return True
        if uri == _namespace_SO('SO_0000302'):
            return True
        if uri == _namespace_SO('SO_0000303'):
            return True
        if uri == _namespace_SO('SO_0000304'):
            return True
        if uri == _namespace_SO('SO_0000305'):
            return True
        if uri == _namespace_SO('SO_0000306'):
            return True
        if uri == _namespace_SO('SO_0000307'):
            return True
        if uri == _namespace_SO('SO_0000308'):
            return True
        if uri == _namespace_SO('SO_0000309'):
            return True
        if uri == _namespace_SO('SO_0000310'):
            return True
        if uri == _namespace_SO('SO_0000311'):
            return True
        if uri == _namespace_SO('SO_0000312'):
            return True
        if uri == _namespace_SO('SO_0000313'):
            return True
        if uri == _namespace_SO('SO_0000314'):
            return True
        if uri == _namespace_SO('SO_0000315'):
            return True
        if uri == _namespace_SO('SO_0000316'):
            return True
        if uri == _namespace_SO('SO_0000317'):
            return True
        if uri == _namespace_SO('SO_0000318'):
            return True
        if uri == _namespace_SO('SO_0000319'):
            return True
        if uri == _namespace_SO('SO_0000320'):
            return True
        if uri == _namespace_SO('SO_0000321'):
            return True
        if uri == _namespace_SO('SO_0000322'):
            return True
        if uri == _namespace_SO('SO_0000323'):
            return True
        if uri == _namespace_SO('SO_0000324'):
            return True
        if uri == _namespace_SO('SO_0000325'):
            return True
        if uri == _namespace_SO('SO_0000326'):
            return True
        if uri == _namespace_SO('SO_0000327'):
            return True
        if uri == _namespace_SO('SO_0000328'):
            return True
        if uri == _namespace_SO('SO_0000329'):
            return True
        if uri == _namespace_SO('SO_0000330'):
            return True
        if uri == _namespace_SO('SO_0000331'):
            return True
        if uri == _namespace_SO('SO_0000332'):
            return True
        if uri == _namespace_SO('SO_0000333'):
            return True
        if uri == _namespace_SO('SO_0000334'):
            return True
        if uri == _namespace_SO('SO_0000335'):
            return True
        if uri == _namespace_SO('SO_0000336'):
            return True
        if uri == _namespace_SO('SO_0000337'):
            return True
        if uri == _namespace_SO('SO_0000338'):
            return True
        if uri == _namespace_SO('SO_0000339'):
            return True
        if uri == _namespace_SO('SO_0000340'):
            return True
        if uri == _namespace_SO('SO_0000341'):
            return True
        if uri == _namespace_SO('SO_0000342'):
            return True
        if uri == _namespace_SO('SO_0000343'):
            return True
        if uri == _namespace_SO('SO_0000344'):
            return True
        if uri == _namespace_SO('SO_0000345'):
            return True
        if uri == _namespace_SO('SO_0000346'):
            return True
        if uri == _namespace_SO('SO_0000347'):
            return True
        if uri == _namespace_SO('SO_0000348'):
            return True
        if uri == _namespace_SO('SO_0000349'):
            return True
        if uri == _namespace_SO('SO_0000350'):
            return True
        if uri == _namespace_SO('SO_0000351'):
            return True
        if uri == _namespace_SO('SO_0000352'):
            return True
        if uri == _namespace_SO('SO_0000353'):
            return True
        if uri == _namespace_SO('SO_0000354'):
            return True
        if uri == _namespace_SO('SO_0000355'):
            return True
        if uri == _namespace_SO('SO_0000356'):
            return True
        if uri == _namespace_SO('SO_0000357'):
            return True
        if uri == _namespace_SO('SO_0000359'):
            return True
        if uri == _namespace_SO('SO_0000360'):
            return True
        if uri == _namespace_SO('SO_0000361'):
            return True
        if uri == _namespace_SO('SO_0000362'):
            return True
        if uri == _namespace_SO('SO_0000363'):
            return True
        if uri == _namespace_SO('SO_0000364'):
            return True
        if uri == _namespace_SO('SO_0000365'):
            return True
        if uri == _namespace_SO('SO_0000366'):
            return True
        if uri == _namespace_SO('SO_0000367'):
            return True
        if uri == _namespace_SO('SO_0000368'):
            return True
        if uri == _namespace_SO('SO_0000369'):
            return True
        if uri == _namespace_SO('SO_0000370'):
            return True
        if uri == _namespace_SO('SO_0000371'):
            return True
        if uri == _namespace_SO('SO_0000372'):
            return True
        if uri == _namespace_SO('SO_0000373'):
            return True
        if uri == _namespace_SO('SO_0000374'):
            return True
        if uri == _namespace_SO('SO_0000375'):
            return True
        if uri == _namespace_SO('SO_0000376'):
            return True
        if uri == _namespace_SO('SO_0000377'):
            return True
        if uri == _namespace_SO('SO_0000378'):
            return True
        if uri == _namespace_SO('SO_0000379'):
            return True
        if uri == _namespace_SO('SO_0000380'):
            return True
        if uri == _namespace_SO('SO_0000381'):
            return True
        if uri == _namespace_SO('SO_0000382'):
            return True
        if uri == _namespace_SO('SO_0000383'):
            return True
        if uri == _namespace_SO('SO_0000384'):
            return True
        if uri == _namespace_SO('SO_0000385'):
            return True
        if uri == _namespace_SO('SO_0000386'):
            return True
        if uri == _namespace_SO('SO_0000387'):
            return True
        if uri == _namespace_SO('SO_0000388'):
            return True
        if uri == _namespace_SO('SO_0000389'):
            return True
        if uri == _namespace_SO('SO_0000390'):
            return True
        if uri == _namespace_SO('SO_0000391'):
            return True
        if uri == _namespace_SO('SO_0000392'):
            return True
        if uri == _namespace_SO('SO_0000393'):
            return True
        if uri == _namespace_SO('SO_0000394'):
            return True
        if uri == _namespace_SO('SO_0000395'):
            return True
        if uri == _namespace_SO('SO_0000396'):
            return True
        if uri == _namespace_SO('SO_0000397'):
            return True
        if uri == _namespace_SO('SO_0000398'):
            return True
        if uri == _namespace_SO('SO_0000399'):
            return True
        if uri == _namespace_SO('SO_0000400'):
            return True
        if uri == _namespace_SO('SO_0000401'):
            return True
        if uri == _namespace_SO('SO_0000402'):
            return True
        if uri == _namespace_SO('SO_0000403'):
            return True
        if uri == _namespace_SO('SO_0000404'):
            return True
        if uri == _namespace_SO('SO_0000405'):
            return True
        if uri == _namespace_SO('SO_0000406'):
            return True
        if uri == _namespace_SO('SO_0000407'):
            return True
        if uri == _namespace_SO('SO_0000408'):
            return True
        if uri == _namespace_SO('SO_0000409'):
            return True
        if uri == _namespace_SO('SO_0000410'):
            return True
        if uri == _namespace_SO('SO_0000411'):
            return True
        if uri == _namespace_SO('SO_0000412'):
            return True
        if uri == _namespace_SO('SO_0000413'):
            return True
        if uri == _namespace_SO('SO_0000414'):
            return True
        if uri == _namespace_SO('SO_0000415'):
            return True
        if uri == _namespace_SO('SO_0000416'):
            return True
        if uri == _namespace_SO('SO_0000417'):
            return True
        if uri == _namespace_SO('SO_0000418'):
            return True
        if uri == _namespace_SO('SO_0000419'):
            return True
        if uri == _namespace_SO('SO_0000420'):
            return True
        if uri == _namespace_SO('SO_0000421'):
            return True
        if uri == _namespace_SO('SO_0000422'):
            return True
        if uri == _namespace_SO('SO_0000423'):
            return True
        if uri == _namespace_SO('SO_0000424'):
            return True
        if uri == _namespace_SO('SO_0000425'):
            return True
        if uri == _namespace_SO('SO_0000426'):
            return True
        if uri == _namespace_SO('SO_0000427'):
            return True
        if uri == _namespace_SO('SO_0000428'):
            return True
        if uri == _namespace_SO('SO_0000429'):
            return True
        if uri == _namespace_SO('SO_0000430'):
            return True
        if uri == _namespace_SO('SO_0000431'):
            return True
        if uri == _namespace_SO('SO_0000432'):
            return True
        if uri == _namespace_SO('SO_0000433'):
            return True
        if uri == _namespace_SO('SO_0000434'):
            return True
        if uri == _namespace_SO('SO_0000435'):
            return True
        if uri == _namespace_SO('SO_0000436'):
            return True
        if uri == _namespace_SO('SO_0000437'):
            return True
        if uri == _namespace_SO('SO_0000438'):
            return True
        if uri == _namespace_SO('SO_0000439'):
            return True
        if uri == _namespace_SO('SO_0000440'):
            return True
        if uri == _namespace_SO('SO_0000441'):
            return True
        if uri == _namespace_SO('SO_0000442'):
            return True
        if uri == _namespace_SO('SO_0000443'):
            return True
        if uri == _namespace_SO('SO_0000444'):
            return True
        if uri == _namespace_SO('SO_0000445'):
            return True
        if uri == _namespace_SO('SO_0000446'):
            return True
        if uri == _namespace_SO('SO_0000447'):
            return True
        if uri == _namespace_SO('SO_0000448'):
            return True
        if uri == _namespace_SO('SO_0000449'):
            return True
        if uri == _namespace_SO('SO_0000450'):
            return True
        if uri == _namespace_SO('SO_0000451'):
            return True
        if uri == _namespace_SO('SO_0000452'):
            return True
        if uri == _namespace_SO('SO_0000453'):
            return True
        if uri == _namespace_SO('SO_0000454'):
            return True
        if uri == _namespace_SO('SO_0000455'):
            return True
        if uri == _namespace_SO('SO_0000456'):
            return True
        if uri == _namespace_SO('SO_0000457'):
            return True
        if uri == _namespace_SO('SO_0000458'):
            return True
        if uri == _namespace_SO('SO_0000459'):
            return True
        if uri == _namespace_SO('SO_0000460'):
            return True
        if uri == _namespace_SO('SO_0000461'):
            return True
        if uri == _namespace_SO('SO_0000462'):
            return True
        if uri == _namespace_SO('SO_0000463'):
            return True
        if uri == _namespace_SO('SO_0000464'):
            return True
        if uri == _namespace_SO('SO_0000465'):
            return True
        if uri == _namespace_SO('SO_0000466'):
            return True
        if uri == _namespace_SO('SO_0000467'):
            return True
        if uri == _namespace_SO('SO_0000468'):
            return True
        if uri == _namespace_SO('SO_0000469'):
            return True
        if uri == _namespace_SO('SO_0000470'):
            return True
        if uri == _namespace_SO('SO_0000471'):
            return True
        if uri == _namespace_SO('SO_0000472'):
            return True
        if uri == _namespace_SO('SO_0000473'):
            return True
        if uri == _namespace_SO('SO_0000474'):
            return True
        if uri == _namespace_SO('SO_0000475'):
            return True
        if uri == _namespace_SO('SO_0000476'):
            return True
        if uri == _namespace_SO('SO_0000477'):
            return True
        if uri == _namespace_SO('SO_0000478'):
            return True
        if uri == _namespace_SO('SO_0000479'):
            return True
        if uri == _namespace_SO('SO_0000480'):
            return True
        if uri == _namespace_SO('SO_0000481'):
            return True
        if uri == _namespace_SO('SO_0000482'):
            return True
        if uri == _namespace_SO('SO_0000483'):
            return True
        if uri == _namespace_SO('SO_0000484'):
            return True
        if uri == _namespace_SO('SO_0000485'):
            return True
        if uri == _namespace_SO('SO_0000486'):
            return True
        if uri == _namespace_SO('SO_0000487'):
            return True
        if uri == _namespace_SO('SO_0000488'):
            return True
        if uri == _namespace_SO('SO_0000489'):
            return True
        if uri == _namespace_SO('SO_0000490'):
            return True
        if uri == _namespace_SO('SO_0000491'):
            return True
        if uri == _namespace_SO('SO_0000492'):
            return True
        if uri == _namespace_SO('SO_0000493'):
            return True
        if uri == _namespace_SO('SO_0000494'):
            return True
        if uri == _namespace_SO('SO_0000495'):
            return True
        if uri == _namespace_SO('SO_0000496'):
            return True
        if uri == _namespace_SO('SO_0000497'):
            return True
        if uri == _namespace_SO('SO_0000498'):
            return True
        if uri == _namespace_SO('SO_0000499'):
            return True
        if uri == _namespace_SO('SO_0000500'):
            return True
        if uri == _namespace_SO('SO_0000501'):
            return True
        if uri == _namespace_SO('SO_0000502'):
            return True
        if uri == _namespace_SO('SO_0000503'):
            return True
        if uri == _namespace_SO('SO_0000504'):
            return True
        if uri == _namespace_SO('SO_0000505'):
            return True
        if uri == _namespace_SO('SO_0000506'):
            return True
        if uri == _namespace_SO('SO_0000507'):
            return True
        if uri == _namespace_SO('SO_0000508'):
            return True
        if uri == _namespace_SO('SO_0000509'):
            return True
        if uri == _namespace_SO('SO_0000510'):
            return True
        if uri == _namespace_SO('SO_0000511'):
            return True
        if uri == _namespace_SO('SO_0000512'):
            return True
        if uri == _namespace_SO('SO_0000513'):
            return True
        if uri == _namespace_SO('SO_0000514'):
            return True
        if uri == _namespace_SO('SO_0000515'):
            return True
        if uri == _namespace_SO('SO_0000516'):
            return True
        if uri == _namespace_SO('SO_0000517'):
            return True
        if uri == _namespace_SO('SO_0000518'):
            return True
        if uri == _namespace_SO('SO_0000519'):
            return True
        if uri == _namespace_SO('SO_0000520'):
            return True
        if uri == _namespace_SO('SO_0000521'):
            return True
        if uri == _namespace_SO('SO_0000522'):
            return True
        if uri == _namespace_SO('SO_0000523'):
            return True
        if uri == _namespace_SO('SO_0000524'):
            return True
        if uri == _namespace_SO('SO_0000525'):
            return True
        if uri == _namespace_SO('SO_0000526'):
            return True
        if uri == _namespace_SO('SO_0000527'):
            return True
        if uri == _namespace_SO('SO_0000528'):
            return True
        if uri == _namespace_SO('SO_0000529'):
            return True
        if uri == _namespace_SO('SO_0000530'):
            return True
        if uri == _namespace_SO('SO_0000531'):
            return True
        if uri == _namespace_SO('SO_0000532'):
            return True
        if uri == _namespace_SO('SO_0000533'):
            return True
        if uri == _namespace_SO('SO_0000534'):
            return True
        if uri == _namespace_SO('SO_0000535'):
            return True
        if uri == _namespace_SO('SO_0000536'):
            return True
        if uri == _namespace_SO('SO_0000537'):
            return True
        if uri == _namespace_SO('SO_0000538'):
            return True
        if uri == _namespace_SO('SO_0000539'):
            return True
        if uri == _namespace_SO('SO_0000540'):
            return True
        if uri == _namespace_SO('SO_0000541'):
            return True
        if uri == _namespace_SO('SO_0000542'):
            return True
        if uri == _namespace_SO('SO_0000543'):
            return True
        if uri == _namespace_SO('SO_0000544'):
            return True
        if uri == _namespace_SO('SO_0000545'):
            return True
        if uri == _namespace_SO('SO_0000546'):
            return True
        if uri == _namespace_SO('SO_0000547'):
            return True
        if uri == _namespace_SO('SO_0000548'):
            return True
        if uri == _namespace_SO('SO_0000549'):
            return True
        if uri == _namespace_SO('SO_0000550'):
            return True
        if uri == _namespace_SO('SO_0000551'):
            return True
        if uri == _namespace_SO('SO_0000552'):
            return True
        if uri == _namespace_SO('SO_0000553'):
            return True
        if uri == _namespace_SO('SO_0000554'):
            return True
        if uri == _namespace_SO('SO_0000555'):
            return True
        if uri == _namespace_SO('SO_0000556'):
            return True
        if uri == _namespace_SO('SO_0000557'):
            return True
        if uri == _namespace_SO('SO_0000558'):
            return True
        if uri == _namespace_SO('SO_0000559'):
            return True
        if uri == _namespace_SO('SO_0000560'):
            return True
        if uri == _namespace_SO('SO_0000561'):
            return True
        if uri == _namespace_SO('SO_0000562'):
            return True
        if uri == _namespace_SO('SO_0000563'):
            return True
        if uri == _namespace_SO('SO_0000564'):
            return True
        if uri == _namespace_SO('SO_0000565'):
            return True
        if uri == _namespace_SO('SO_0000566'):
            return True
        if uri == _namespace_SO('SO_0000567'):
            return True
        if uri == _namespace_SO('SO_0000568'):
            return True
        if uri == _namespace_SO('SO_0000569'):
            return True
        if uri == _namespace_SO('SO_0000570'):
            return True
        if uri == _namespace_SO('SO_0000571'):
            return True
        if uri == _namespace_SO('SO_0000572'):
            return True
        if uri == _namespace_SO('SO_0000573'):
            return True
        if uri == _namespace_SO('SO_0000574'):
            return True
        if uri == _namespace_SO('SO_0000575'):
            return True
        if uri == _namespace_SO('SO_0000576'):
            return True
        if uri == _namespace_SO('SO_0000577'):
            return True
        if uri == _namespace_SO('SO_0000578'):
            return True
        if uri == _namespace_SO('SO_0000579'):
            return True
        if uri == _namespace_SO('SO_0000580'):
            return True
        if uri == _namespace_SO('SO_0000581'):
            return True
        if uri == _namespace_SO('SO_0000582'):
            return True
        if uri == _namespace_SO('SO_0000583'):
            return True
        if uri == _namespace_SO('SO_0000584'):
            return True
        if uri == _namespace_SO('SO_0000585'):
            return True
        if uri == _namespace_SO('SO_0000586'):
            return True
        if uri == _namespace_SO('SO_0000587'):
            return True
        if uri == _namespace_SO('SO_0000588'):
            return True
        if uri == _namespace_SO('SO_0000589'):
            return True
        if uri == _namespace_SO('SO_0000590'):
            return True
        if uri == _namespace_SO('SO_0000591'):
            return True
        if uri == _namespace_SO('SO_0000592'):
            return True
        if uri == _namespace_SO('SO_0000593'):
            return True
        if uri == _namespace_SO('SO_0000594'):
            return True
        if uri == _namespace_SO('SO_0000595'):
            return True
        if uri == _namespace_SO('SO_0000596'):
            return True
        if uri == _namespace_SO('SO_0000597'):
            return True
        if uri == _namespace_SO('SO_0000598'):
            return True
        if uri == _namespace_SO('SO_0000599'):
            return True
        if uri == _namespace_SO('SO_0000600'):
            return True
        if uri == _namespace_SO('SO_0000601'):
            return True
        if uri == _namespace_SO('SO_0000602'):
            return True
        if uri == _namespace_SO('SO_0000603'):
            return True
        if uri == _namespace_SO('SO_0000604'):
            return True
        if uri == _namespace_SO('SO_0000605'):
            return True
        if uri == _namespace_SO('SO_0000606'):
            return True
        if uri == _namespace_SO('SO_0000607'):
            return True
        if uri == _namespace_SO('SO_0000608'):
            return True
        if uri == _namespace_SO('SO_0000609'):
            return True
        if uri == _namespace_SO('SO_0000610'):
            return True
        if uri == _namespace_SO('SO_0000611'):
            return True
        if uri == _namespace_SO('SO_0000612'):
            return True
        if uri == _namespace_SO('SO_0000613'):
            return True
        if uri == _namespace_SO('SO_0000614'):
            return True
        if uri == _namespace_SO('SO_0000615'):
            return True
        if uri == _namespace_SO('SO_0000616'):
            return True
        if uri == _namespace_SO('SO_0000617'):
            return True
        if uri == _namespace_SO('SO_0000618'):
            return True
        if uri == _namespace_SO('SO_0000619'):
            return True
        if uri == _namespace_SO('SO_0000620'):
            return True
        if uri == _namespace_SO('SO_0000621'):
            return True
        if uri == _namespace_SO('SO_0000622'):
            return True
        if uri == _namespace_SO('SO_0000623'):
            return True
        if uri == _namespace_SO('SO_0000624'):
            return True
        if uri == _namespace_SO('SO_0000625'):
            return True
        if uri == _namespace_SO('SO_0000626'):
            return True
        if uri == _namespace_SO('SO_0000627'):
            return True
        if uri == _namespace_SO('SO_0000628'):
            return True
        if uri == _namespace_SO('SO_0000629'):
            return True
        if uri == _namespace_SO('SO_0000630'):
            return True
        if uri == _namespace_SO('SO_0000631'):
            return True
        if uri == _namespace_SO('SO_0000632'):
            return True
        if uri == _namespace_SO('SO_0000633'):
            return True
        if uri == _namespace_SO('SO_0000634'):
            return True
        if uri == _namespace_SO('SO_0000635'):
            return True
        if uri == _namespace_SO('SO_0000636'):
            return True
        if uri == _namespace_SO('SO_0000637'):
            return True
        if uri == _namespace_SO('SO_0000638'):
            return True
        if uri == _namespace_SO('SO_0000639'):
            return True
        if uri == _namespace_SO('SO_0000640'):
            return True
        if uri == _namespace_SO('SO_0000641'):
            return True
        if uri == _namespace_SO('SO_0000642'):
            return True
        if uri == _namespace_SO('SO_0000643'):
            return True
        if uri == _namespace_SO('SO_0000644'):
            return True
        if uri == _namespace_SO('SO_0000645'):
            return True
        if uri == _namespace_SO('SO_0000646'):
            return True
        if uri == _namespace_SO('SO_0000647'):
            return True
        if uri == _namespace_SO('SO_0000648'):
            return True
        if uri == _namespace_SO('SO_0000649'):
            return True
        if uri == _namespace_SO('SO_0000650'):
            return True
        if uri == _namespace_SO('SO_0000651'):
            return True
        if uri == _namespace_SO('SO_0000652'):
            return True
        if uri == _namespace_SO('SO_0000653'):
            return True
        if uri == _namespace_SO('SO_0000654'):
            return True
        if uri == _namespace_SO('SO_0000655'):
            return True
        if uri == _namespace_SO('SO_0000656'):
            return True
        if uri == _namespace_SO('SO_0000657'):
            return True
        if uri == _namespace_SO('SO_0000658'):
            return True
        if uri == _namespace_SO('SO_0000659'):
            return True
        if uri == _namespace_SO('SO_0000660'):
            return True
        if uri == _namespace_SO('SO_0000661'):
            return True
        if uri == _namespace_SO('SO_0000662'):
            return True
        if uri == _namespace_SO('SO_0000663'):
            return True
        if uri == _namespace_SO('SO_0000664'):
            return True
        if uri == _namespace_SO('SO_0000665'):
            return True
        if uri == _namespace_SO('SO_0000666'):
            return True
        if uri == _namespace_SO('SO_0000667'):
            return True
        if uri == _namespace_SO('SO_0000668'):
            return True
        if uri == _namespace_SO('SO_0000669'):
            return True
        if uri == _namespace_SO('SO_0000670'):
            return True
        if uri == _namespace_SO('SO_0000671'):
            return True
        if uri == _namespace_SO('SO_0000672'):
            return True
        if uri == _namespace_SO('SO_0000673'):
            return True
        if uri == _namespace_SO('SO_0000674'):
            return True
        if uri == _namespace_SO('SO_0000675'):
            return True
        if uri == _namespace_SO('SO_0000676'):
            return True
        if uri == _namespace_SO('SO_0000677'):
            return True
        if uri == _namespace_SO('SO_0000678'):
            return True
        if uri == _namespace_SO('SO_0000679'):
            return True
        if uri == _namespace_SO('SO_0000680'):
            return True
        if uri == _namespace_SO('SO_0000681'):
            return True
        if uri == _namespace_SO('SO_0000682'):
            return True
        if uri == _namespace_SO('SO_0000683'):
            return True
        if uri == _namespace_SO('SO_0000684'):
            return True
        if uri == _namespace_SO('SO_0000685'):
            return True
        if uri == _namespace_SO('SO_0000686'):
            return True
        if uri == _namespace_SO('SO_0000687'):
            return True
        if uri == _namespace_SO('SO_0000688'):
            return True
        if uri == _namespace_SO('SO_0000689'):
            return True
        if uri == _namespace_SO('SO_0000690'):
            return True
        if uri == _namespace_SO('SO_0000691'):
            return True
        if uri == _namespace_SO('SO_0000692'):
            return True
        if uri == _namespace_SO('SO_0000693'):
            return True
        if uri == _namespace_SO('SO_0000694'):
            return True
        if uri == _namespace_SO('SO_0000695'):
            return True
        if uri == _namespace_SO('SO_0000696'):
            return True
        if uri == _namespace_SO('SO_0000697'):
            return True
        if uri == _namespace_SO('SO_0000698'):
            return True
        if uri == _namespace_SO('SO_0000699'):
            return True
        if uri == _namespace_SO('SO_0000700'):
            return True
        if uri == _namespace_SO('SO_0000701'):
            return True
        if uri == _namespace_SO('SO_0000702'):
            return True
        if uri == _namespace_SO('SO_0000703'):
            return True
        if uri == _namespace_SO('SO_0000704'):
            return True
        if uri == _namespace_SO('SO_0000705'):
            return True
        if uri == _namespace_SO('SO_0000706'):
            return True
        if uri == _namespace_SO('SO_0000707'):
            return True
        if uri == _namespace_SO('SO_0000708'):
            return True
        if uri == _namespace_SO('SO_0000709'):
            return True
        if uri == _namespace_SO('SO_0000710'):
            return True
        if uri == _namespace_SO('SO_0000711'):
            return True
        if uri == _namespace_SO('SO_0000712'):
            return True
        if uri == _namespace_SO('SO_0000713'):
            return True
        if uri == _namespace_SO('SO_0000714'):
            return True
        if uri == _namespace_SO('SO_0000715'):
            return True
        if uri == _namespace_SO('SO_0000716'):
            return True
        if uri == _namespace_SO('SO_0000717'):
            return True
        if uri == _namespace_SO('SO_0000718'):
            return True
        if uri == _namespace_SO('SO_0000719'):
            return True
        if uri == _namespace_SO('SO_0000720'):
            return True
        if uri == _namespace_SO('SO_0000721'):
            return True
        if uri == _namespace_SO('SO_0000722'):
            return True
        if uri == _namespace_SO('SO_0000723'):
            return True
        if uri == _namespace_SO('SO_0000724'):
            return True
        if uri == _namespace_SO('SO_0000725'):
            return True
        if uri == _namespace_SO('SO_0000726'):
            return True
        if uri == _namespace_SO('SO_0000727'):
            return True
        if uri == _namespace_SO('SO_0000728'):
            return True
        if uri == _namespace_SO('SO_0000729'):
            return True
        if uri == _namespace_SO('SO_0000730'):
            return True
        if uri == _namespace_SO('SO_0000731'):
            return True
        if uri == _namespace_SO('SO_0000732'):
            return True
        if uri == _namespace_SO('SO_0000733'):
            return True
        if uri == _namespace_SO('SO_0000734'):
            return True
        if uri == _namespace_SO('SO_0000735'):
            return True
        if uri == _namespace_SO('SO_0000736'):
            return True
        if uri == _namespace_SO('SO_0000737'):
            return True
        if uri == _namespace_SO('SO_0000738'):
            return True
        if uri == _namespace_SO('SO_0000739'):
            return True
        if uri == _namespace_SO('SO_0000740'):
            return True
        if uri == _namespace_SO('SO_0000741'):
            return True
        if uri == _namespace_SO('SO_0000742'):
            return True
        if uri == _namespace_SO('SO_0000743'):
            return True
        if uri == _namespace_SO('SO_0000744'):
            return True
        if uri == _namespace_SO('SO_0000745'):
            return True
        if uri == _namespace_SO('SO_0000746'):
            return True
        if uri == _namespace_SO('SO_0000747'):
            return True
        if uri == _namespace_SO('SO_0000748'):
            return True
        if uri == _namespace_SO('SO_0000749'):
            return True
        if uri == _namespace_SO('SO_0000750'):
            return True
        if uri == _namespace_SO('SO_0000751'):
            return True
        if uri == _namespace_SO('SO_0000752'):
            return True
        if uri == _namespace_SO('SO_0000753'):
            return True
        if uri == _namespace_SO('SO_0000754'):
            return True
        if uri == _namespace_SO('SO_0000755'):
            return True
        if uri == _namespace_SO('SO_0000756'):
            return True
        if uri == _namespace_SO('SO_0000757'):
            return True
        if uri == _namespace_SO('SO_0000758'):
            return True
        if uri == _namespace_SO('SO_0000759'):
            return True
        if uri == _namespace_SO('SO_0000760'):
            return True
        if uri == _namespace_SO('SO_0000761'):
            return True
        if uri == _namespace_SO('SO_0000762'):
            return True
        if uri == _namespace_SO('SO_0000763'):
            return True
        if uri == _namespace_SO('SO_0000764'):
            return True
        if uri == _namespace_SO('SO_0000765'):
            return True
        if uri == _namespace_SO('SO_0000766'):
            return True
        if uri == _namespace_SO('SO_0000767'):
            return True
        if uri == _namespace_SO('SO_0000768'):
            return True
        if uri == _namespace_SO('SO_0000769'):
            return True
        if uri == _namespace_SO('SO_0000770'):
            return True
        if uri == _namespace_SO('SO_0000771'):
            return True
        if uri == _namespace_SO('SO_0000772'):
            return True
        if uri == _namespace_SO('SO_0000773'):
            return True
        if uri == _namespace_SO('SO_0000774'):
            return True
        if uri == _namespace_SO('SO_0000775'):
            return True
        if uri == _namespace_SO('SO_0000776'):
            return True
        if uri == _namespace_SO('SO_0000777'):
            return True
        if uri == _namespace_SO('SO_0000778'):
            return True
        if uri == _namespace_SO('SO_0000779'):
            return True
        if uri == _namespace_SO('SO_0000780'):
            return True
        if uri == _namespace_SO('SO_0000781'):
            return True
        if uri == _namespace_SO('SO_0000782'):
            return True
        if uri == _namespace_SO('SO_0000783'):
            return True
        if uri == _namespace_SO('SO_0000784'):
            return True
        if uri == _namespace_SO('SO_0000785'):
            return True
        if uri == _namespace_SO('SO_0000786'):
            return True
        if uri == _namespace_SO('SO_0000787'):
            return True
        if uri == _namespace_SO('SO_0000788'):
            return True
        if uri == _namespace_SO('SO_0000789'):
            return True
        if uri == _namespace_SO('SO_0000790'):
            return True
        if uri == _namespace_SO('SO_0000791'):
            return True
        if uri == _namespace_SO('SO_0000792'):
            return True
        if uri == _namespace_SO('SO_0000793'):
            return True
        if uri == _namespace_SO('SO_0000794'):
            return True
        if uri == _namespace_SO('SO_0000795'):
            return True
        if uri == _namespace_SO('SO_0000796'):
            return True
        if uri == _namespace_SO('SO_0000797'):
            return True
        if uri == _namespace_SO('SO_0000798'):
            return True
        if uri == _namespace_SO('SO_0000799'):
            return True
        if uri == _namespace_SO('SO_0000800'):
            return True
        if uri == _namespace_SO('SO_0000801'):
            return True
        if uri == _namespace_SO('SO_0000802'):
            return True
        if uri == _namespace_SO('SO_0000803'):
            return True
        if uri == _namespace_SO('SO_0000804'):
            return True
        if uri == _namespace_SO('SO_0000805'):
            return True
        if uri == _namespace_SO('SO_0000806'):
            return True
        if uri == _namespace_SO('SO_0000807'):
            return True
        if uri == _namespace_SO('SO_0000808'):
            return True
        if uri == _namespace_SO('SO_0000809'):
            return True
        if uri == _namespace_SO('SO_0000810'):
            return True
        if uri == _namespace_SO('SO_0000811'):
            return True
        if uri == _namespace_SO('SO_0000812'):
            return True
        if uri == _namespace_SO('SO_0000813'):
            return True
        if uri == _namespace_SO('SO_0000814'):
            return True
        if uri == _namespace_SO('SO_0000815'):
            return True
        if uri == _namespace_SO('SO_0000816'):
            return True
        if uri == _namespace_SO('SO_0000817'):
            return True
        if uri == _namespace_SO('SO_0000818'):
            return True
        if uri == _namespace_SO('SO_0000819'):
            return True
        if uri == _namespace_SO('SO_0000820'):
            return True
        if uri == _namespace_SO('SO_0000821'):
            return True
        if uri == _namespace_SO('SO_0000822'):
            return True
        if uri == _namespace_SO('SO_0000823'):
            return True
        if uri == _namespace_SO('SO_0000824'):
            return True
        if uri == _namespace_SO('SO_0000825'):
            return True
        if uri == _namespace_SO('SO_0000828'):
            return True
        if uri == _namespace_SO('SO_0000829'):
            return True
        if uri == _namespace_SO('SO_0000830'):
            return True
        if uri == _namespace_SO('SO_0000831'):
            return True
        if uri == _namespace_SO('SO_0000832'):
            return True
        if uri == _namespace_SO('SO_0000833'):
            return True
        if uri == _namespace_SO('SO_0000834'):
            return True
        if uri == _namespace_SO('SO_0000835'):
            return True
        if uri == _namespace_SO('SO_0000836'):
            return True
        if uri == _namespace_SO('SO_0000837'):
            return True
        if uri == _namespace_SO('SO_0000838'):
            return True
        if uri == _namespace_SO('SO_0000839'):
            return True
        if uri == _namespace_SO('SO_0000840'):
            return True
        if uri == _namespace_SO('SO_0000841'):
            return True
        if uri == _namespace_SO('SO_0000842'):
            return True
        if uri == _namespace_SO('SO_0000843'):
            return True
        if uri == _namespace_SO('SO_0000844'):
            return True
        if uri == _namespace_SO('SO_0000845'):
            return True
        if uri == _namespace_SO('SO_0000846'):
            return True
        if uri == _namespace_SO('SO_0000847'):
            return True
        if uri == _namespace_SO('SO_0000848'):
            return True
        if uri == _namespace_SO('SO_0000849'):
            return True
        if uri == _namespace_SO('SO_0000850'):
            return True
        if uri == _namespace_SO('SO_0000851'):
            return True
        if uri == _namespace_SO('SO_0000852'):
            return True
        if uri == _namespace_SO('SO_0000853'):
            return True
        if uri == _namespace_SO('SO_0000854'):
            return True
        if uri == _namespace_SO('SO_0000855'):
            return True
        if uri == _namespace_SO('SO_0000856'):
            return True
        if uri == _namespace_SO('SO_0000857'):
            return True
        if uri == _namespace_SO('SO_0000858'):
            return True
        if uri == _namespace_SO('SO_0000859'):
            return True
        if uri == _namespace_SO('SO_0000860'):
            return True
        if uri == _namespace_SO('SO_0000861'):
            return True
        if uri == _namespace_SO('SO_0000862'):
            return True
        if uri == _namespace_SO('SO_0000863'):
            return True
        if uri == _namespace_SO('SO_0000864'):
            return True
        if uri == _namespace_SO('SO_0000865'):
            return True
        if uri == _namespace_SO('SO_0000866'):
            return True
        if uri == _namespace_SO('SO_0000867'):
            return True
        if uri == _namespace_SO('SO_0000868'):
            return True
        if uri == _namespace_SO('SO_0000869'):
            return True
        if uri == _namespace_SO('SO_0000870'):
            return True
        if uri == _namespace_SO('SO_0000871'):
            return True
        if uri == _namespace_SO('SO_0000872'):
            return True
        if uri == _namespace_SO('SO_0000873'):
            return True
        if uri == _namespace_SO('SO_0000874'):
            return True
        if uri == _namespace_SO('SO_0000875'):
            return True
        if uri == _namespace_SO('SO_0000876'):
            return True
        if uri == _namespace_SO('SO_0000877'):
            return True
        if uri == _namespace_SO('SO_0000878'):
            return True
        if uri == _namespace_SO('SO_0000879'):
            return True
        if uri == _namespace_SO('SO_0000880'):
            return True
        if uri == _namespace_SO('SO_0000881'):
            return True
        if uri == _namespace_SO('SO_0000882'):
            return True
        if uri == _namespace_SO('SO_0000883'):
            return True
        if uri == _namespace_SO('SO_0000884'):
            return True
        if uri == _namespace_SO('SO_0000885'):
            return True
        if uri == _namespace_SO('SO_0000886'):
            return True
        if uri == _namespace_SO('SO_0000887'):
            return True
        if uri == _namespace_SO('SO_0000888'):
            return True
        if uri == _namespace_SO('SO_0000889'):
            return True
        if uri == _namespace_SO('SO_0000890'):
            return True
        if uri == _namespace_SO('SO_0000891'):
            return True
        if uri == _namespace_SO('SO_0000892'):
            return True
        if uri == _namespace_SO('SO_0000893'):
            return True
        if uri == _namespace_SO('SO_0000894'):
            return True
        if uri == _namespace_SO('SO_0000895'):
            return True
        if uri == _namespace_SO('SO_0000896'):
            return True
        if uri == _namespace_SO('SO_0000897'):
            return True
        if uri == _namespace_SO('SO_0000898'):
            return True
        if uri == _namespace_SO('SO_0000899'):
            return True
        if uri == _namespace_SO('SO_0000900'):
            return True
        if uri == _namespace_SO('SO_0000901'):
            return True
        if uri == _namespace_SO('SO_0000902'):
            return True
        if uri == _namespace_SO('SO_0000903'):
            return True
        if uri == _namespace_SO('SO_0000904'):
            return True
        if uri == _namespace_SO('SO_0000905'):
            return True
        if uri == _namespace_SO('SO_0000906'):
            return True
        if uri == _namespace_SO('SO_0000907'):
            return True
        if uri == _namespace_SO('SO_0000908'):
            return True
        if uri == _namespace_SO('SO_0000909'):
            return True
        if uri == _namespace_SO('SO_0000910'):
            return True
        if uri == _namespace_SO('SO_0000911'):
            return True
        if uri == _namespace_SO('SO_0000912'):
            return True
        if uri == _namespace_SO('SO_0000913'):
            return True
        if uri == _namespace_SO('SO_0000914'):
            return True
        if uri == _namespace_SO('SO_0000915'):
            return True
        if uri == _namespace_SO('SO_0000916'):
            return True
        if uri == _namespace_SO('SO_0000917'):
            return True
        if uri == _namespace_SO('SO_0000918'):
            return True
        if uri == _namespace_SO('SO_0000919'):
            return True
        if uri == _namespace_SO('SO_0000920'):
            return True
        if uri == _namespace_SO('SO_0000921'):
            return True
        if uri == _namespace_SO('SO_0000922'):
            return True
        if uri == _namespace_SO('SO_0000923'):
            return True
        if uri == _namespace_SO('SO_0000924'):
            return True
        if uri == _namespace_SO('SO_0000925'):
            return True
        if uri == _namespace_SO('SO_0000926'):
            return True
        if uri == _namespace_SO('SO_0000927'):
            return True
        if uri == _namespace_SO('SO_0000928'):
            return True
        if uri == _namespace_SO('SO_0000929'):
            return True
        if uri == _namespace_SO('SO_0000930'):
            return True
        if uri == _namespace_SO('SO_0000931'):
            return True
        if uri == _namespace_SO('SO_0000932'):
            return True
        if uri == _namespace_SO('SO_0000933'):
            return True
        if uri == _namespace_SO('SO_0000934'):
            return True
        if uri == _namespace_SO('SO_0000935'):
            return True
        if uri == _namespace_SO('SO_0000936'):
            return True
        if uri == _namespace_SO('SO_0000937'):
            return True
        if uri == _namespace_SO('SO_0000938'):
            return True
        if uri == _namespace_SO('SO_0000939'):
            return True
        if uri == _namespace_SO('SO_0000940'):
            return True
        if uri == _namespace_SO('SO_0000941'):
            return True
        if uri == _namespace_SO('SO_0000942'):
            return True
        if uri == _namespace_SO('SO_0000943'):
            return True
        if uri == _namespace_SO('SO_0000944'):
            return True
        if uri == _namespace_SO('SO_0000945'):
            return True
        if uri == _namespace_SO('SO_0000946'):
            return True
        if uri == _namespace_SO('SO_0000947'):
            return True
        if uri == _namespace_SO('SO_0000948'):
            return True
        if uri == _namespace_SO('SO_0000949'):
            return True
        if uri == _namespace_SO('SO_0000950'):
            return True
        if uri == _namespace_SO('SO_0000951'):
            return True
        if uri == _namespace_SO('SO_0000952'):
            return True
        if uri == _namespace_SO('SO_0000953'):
            return True
        if uri == _namespace_SO('SO_0000954'):
            return True
        if uri == _namespace_SO('SO_0000955'):
            return True
        if uri == _namespace_SO('SO_0000956'):
            return True
        if uri == _namespace_SO('SO_0000957'):
            return True
        if uri == _namespace_SO('SO_0000958'):
            return True
        if uri == _namespace_SO('SO_0000959'):
            return True
        if uri == _namespace_SO('SO_0000960'):
            return True
        if uri == _namespace_SO('SO_0000961'):
            return True
        if uri == _namespace_SO('SO_0000962'):
            return True
        if uri == _namespace_SO('SO_0000963'):
            return True
        if uri == _namespace_SO('SO_0000964'):
            return True
        if uri == _namespace_SO('SO_0000965'):
            return True
        if uri == _namespace_SO('SO_0000966'):
            return True
        if uri == _namespace_SO('SO_0000967'):
            return True
        if uri == _namespace_SO('SO_0000968'):
            return True
        if uri == _namespace_SO('SO_0000969'):
            return True
        if uri == _namespace_SO('SO_0000970'):
            return True
        if uri == _namespace_SO('SO_0000971'):
            return True
        if uri == _namespace_SO('SO_0000972'):
            return True
        if uri == _namespace_SO('SO_0000973'):
            return True
        if uri == _namespace_SO('SO_0000975'):
            return True
        if uri == _namespace_SO('SO_0000976'):
            return True
        if uri == _namespace_SO('SO_0000977'):
            return True
        if uri == _namespace_SO('SO_0000978'):
            return True
        if uri == _namespace_SO('SO_0000979'):
            return True
        if uri == _namespace_SO('SO_0000980'):
            return True
        if uri == _namespace_SO('SO_0000981'):
            return True
        if uri == _namespace_SO('SO_0000982'):
            return True
        if uri == _namespace_SO('SO_0000983'):
            return True
        if uri == _namespace_SO('SO_0000984'):
            return True
        if uri == _namespace_SO('SO_0000985'):
            return True
        if uri == _namespace_SO('SO_0000986'):
            return True
        if uri == _namespace_SO('SO_0000987'):
            return True
        if uri == _namespace_SO('SO_0000988'):
            return True
        if uri == _namespace_SO('SO_0000989'):
            return True
        if uri == _namespace_SO('SO_0000990'):
            return True
        if uri == _namespace_SO('SO_0000991'):
            return True
        if uri == _namespace_SO('SO_0000992'):
            return True
        if uri == _namespace_SO('SO_0000993'):
            return True
        if uri == _namespace_SO('SO_0000994'):
            return True
        if uri == _namespace_SO('SO_0000995'):
            return True
        if uri == _namespace_SO('SO_0000996'):
            return True
        if uri == _namespace_SO('SO_0000997'):
            return True
        if uri == _namespace_SO('SO_0000998'):
            return True
        if uri == _namespace_SO('SO_0000999'):
            return True
        if uri == _namespace_SO('SO_0001000'):
            return True
        if uri == _namespace_SO('SO_0001001'):
            return True
        if uri == _namespace_SO('SO_0001002'):
            return True
        if uri == _namespace_SO('SO_0001003'):
            return True
        if uri == _namespace_SO('SO_0001004'):
            return True
        if uri == _namespace_SO('SO_0001005'):
            return True
        if uri == _namespace_SO('SO_0001006'):
            return True
        if uri == _namespace_SO('SO_0001007'):
            return True
        if uri == _namespace_SO('SO_0001008'):
            return True
        if uri == _namespace_SO('SO_0001009'):
            return True
        if uri == _namespace_SO('SO_0001010'):
            return True
        if uri == _namespace_SO('SO_0001011'):
            return True
        if uri == _namespace_SO('SO_0001012'):
            return True
        if uri == _namespace_SO('SO_0001013'):
            return True
        if uri == _namespace_SO('SO_0001014'):
            return True
        if uri == _namespace_SO('SO_0001015'):
            return True
        if uri == _namespace_SO('SO_0001016'):
            return True
        if uri == _namespace_SO('SO_0001017'):
            return True
        if uri == _namespace_SO('SO_0001018'):
            return True
        if uri == _namespace_SO('SO_0001019'):
            return True
        if uri == _namespace_SO('SO_0001020'):
            return True
        if uri == _namespace_SO('SO_0001021'):
            return True
        if uri == _namespace_SO('SO_0001022'):
            return True
        if uri == _namespace_SO('SO_0001023'):
            return True
        if uri == _namespace_SO('SO_0001024'):
            return True
        if uri == _namespace_SO('SO_0001025'):
            return True
        if uri == _namespace_SO('SO_0001026'):
            return True
        if uri == _namespace_SO('SO_0001027'):
            return True
        if uri == _namespace_SO('SO_0001028'):
            return True
        if uri == _namespace_SO('SO_0001029'):
            return True
        if uri == _namespace_SO('SO_0001030'):
            return True
        if uri == _namespace_SO('SO_0001031'):
            return True
        if uri == _namespace_SO('SO_0001032'):
            return True
        if uri == _namespace_SO('SO_0001033'):
            return True
        if uri == _namespace_SO('SO_0001034'):
            return True
        if uri == _namespace_SO('SO_0001035'):
            return True
        if uri == _namespace_SO('SO_0001036'):
            return True
        if uri == _namespace_SO('SO_0001037'):
            return True
        if uri == _namespace_SO('SO_0001038'):
            return True
        if uri == _namespace_SO('SO_0001039'):
            return True
        if uri == _namespace_SO('SO_0001040'):
            return True
        if uri == _namespace_SO('SO_0001041'):
            return True
        if uri == _namespace_SO('SO_0001042'):
            return True
        if uri == _namespace_SO('SO_0001043'):
            return True
        if uri == _namespace_SO('SO_0001044'):
            return True
        if uri == _namespace_SO('SO_0001045'):
            return True
        if uri == _namespace_SO('SO_0001046'):
            return True
        if uri == _namespace_SO('SO_0001047'):
            return True
        if uri == _namespace_SO('SO_0001048'):
            return True
        if uri == _namespace_SO('SO_0001049'):
            return True
        if uri == _namespace_SO('SO_0001050'):
            return True
        if uri == _namespace_SO('SO_0001051'):
            return True
        if uri == _namespace_SO('SO_0001052'):
            return True
        if uri == _namespace_SO('SO_0001053'):
            return True
        if uri == _namespace_SO('SO_0001054'):
            return True
        if uri == _namespace_SO('SO_0001055'):
            return True
        if uri == _namespace_SO('SO_0001056'):
            return True
        if uri == _namespace_SO('SO_0001057'):
            return True
        if uri == _namespace_SO('SO_0001058'):
            return True
        if uri == _namespace_SO('SO_0001059'):
            return True
        if uri == _namespace_SO('SO_0001060'):
            return True
        if uri == _namespace_SO('SO_0001061'):
            return True
        if uri == _namespace_SO('SO_0001062'):
            return True
        if uri == _namespace_SO('SO_0001063'):
            return True
        if uri == _namespace_SO('SO_0001064'):
            return True
        if uri == _namespace_SO('SO_0001066'):
            return True
        if uri == _namespace_SO('SO_0001067'):
            return True
        if uri == _namespace_SO('SO_0001068'):
            return True
        if uri == _namespace_SO('SO_0001070'):
            return True
        if uri == _namespace_SO('SO_0001071'):
            return True
        if uri == _namespace_SO('SO_0001072'):
            return True
        if uri == _namespace_SO('SO_0001073'):
            return True
        if uri == _namespace_SO('SO_0001074'):
            return True
        if uri == _namespace_SO('SO_0001075'):
            return True
        if uri == _namespace_SO('SO_0001076'):
            return True
        if uri == _namespace_SO('SO_0001077'):
            return True
        if uri == _namespace_SO('SO_0001078'):
            return True
        if uri == _namespace_SO('SO_0001079'):
            return True
        if uri == _namespace_SO('SO_0001080'):
            return True
        if uri == _namespace_SO('SO_0001081'):
            return True
        if uri == _namespace_SO('SO_0001082'):
            return True
        if uri == _namespace_SO('SO_0001083'):
            return True
        if uri == _namespace_SO('SO_0001084'):
            return True
        if uri == _namespace_SO('SO_0001085'):
            return True
        if uri == _namespace_SO('SO_0001086'):
            return True
        if uri == _namespace_SO('SO_0001087'):
            return True
        if uri == _namespace_SO('SO_0001088'):
            return True
        if uri == _namespace_SO('SO_0001089'):
            return True
        if uri == _namespace_SO('SO_0001090'):
            return True
        if uri == _namespace_SO('SO_0001091'):
            return True
        if uri == _namespace_SO('SO_0001092'):
            return True
        if uri == _namespace_SO('SO_0001093'):
            return True
        if uri == _namespace_SO('SO_0001094'):
            return True
        if uri == _namespace_SO('SO_0001095'):
            return True
        if uri == _namespace_SO('SO_0001096'):
            return True
        if uri == _namespace_SO('SO_0001097'):
            return True
        if uri == _namespace_SO('SO_0001098'):
            return True
        if uri == _namespace_SO('SO_0001099'):
            return True
        if uri == _namespace_SO('SO_0001100'):
            return True
        if uri == _namespace_SO('SO_0001101'):
            return True
        if uri == _namespace_SO('SO_0001102'):
            return True
        if uri == _namespace_SO('SO_0001103'):
            return True
        if uri == _namespace_SO('SO_0001104'):
            return True
        if uri == _namespace_SO('SO_0001105'):
            return True
        if uri == _namespace_SO('SO_0001106'):
            return True
        if uri == _namespace_SO('SO_0001107'):
            return True
        if uri == _namespace_SO('SO_0001108'):
            return True
        if uri == _namespace_SO('SO_0001109'):
            return True
        if uri == _namespace_SO('SO_0001110'):
            return True
        if uri == _namespace_SO('SO_0001111'):
            return True
        if uri == _namespace_SO('SO_0001112'):
            return True
        if uri == _namespace_SO('SO_0001113'):
            return True
        if uri == _namespace_SO('SO_0001114'):
            return True
        if uri == _namespace_SO('SO_0001115'):
            return True
        if uri == _namespace_SO('SO_0001116'):
            return True
        if uri == _namespace_SO('SO_0001117'):
            return True
        if uri == _namespace_SO('SO_0001118'):
            return True
        if uri == _namespace_SO('SO_0001119'):
            return True
        if uri == _namespace_SO('SO_0001120'):
            return True
        if uri == _namespace_SO('SO_0001121'):
            return True
        if uri == _namespace_SO('SO_0001122'):
            return True
        if uri == _namespace_SO('SO_0001123'):
            return True
        if uri == _namespace_SO('SO_0001124'):
            return True
        if uri == _namespace_SO('SO_0001125'):
            return True
        if uri == _namespace_SO('SO_0001126'):
            return True
        if uri == _namespace_SO('SO_0001127'):
            return True
        if uri == _namespace_SO('SO_0001128'):
            return True
        if uri == _namespace_SO('SO_0001129'):
            return True
        if uri == _namespace_SO('SO_0001130'):
            return True
        if uri == _namespace_SO('SO_0001131'):
            return True
        if uri == _namespace_SO('SO_0001132'):
            return True
        if uri == _namespace_SO('SO_0001133'):
            return True
        if uri == _namespace_SO('SO_0001134'):
            return True
        if uri == _namespace_SO('SO_0001135'):
            return True
        if uri == _namespace_SO('SO_0001136'):
            return True
        if uri == _namespace_SO('SO_0001137'):
            return True
        if uri == _namespace_SO('SO_0001138'):
            return True
        if uri == _namespace_SO('SO_0001139'):
            return True
        if uri == _namespace_SO('SO_0001140'):
            return True
        if uri == _namespace_SO('SO_0001141'):
            return True
        if uri == _namespace_SO('SO_0001142'):
            return True
        if uri == _namespace_SO('SO_0001143'):
            return True
        if uri == _namespace_SO('SO_0001144'):
            return True
        if uri == _namespace_SO('SO_0001145'):
            return True
        if uri == _namespace_SO('SO_0001146'):
            return True
        if uri == _namespace_SO('SO_0001147'):
            return True
        if uri == _namespace_SO('SO_0001148'):
            return True
        if uri == _namespace_SO('SO_0001149'):
            return True
        if uri == _namespace_SO('SO_0001150'):
            return True
        if uri == _namespace_SO('SO_0001151'):
            return True
        if uri == _namespace_SO('SO_0001152'):
            return True
        if uri == _namespace_SO('SO_0001153'):
            return True
        if uri == _namespace_SO('SO_0001154'):
            return True
        if uri == _namespace_SO('SO_0001155'):
            return True
        if uri == _namespace_SO('SO_0001156'):
            return True
        if uri == _namespace_SO('SO_0001157'):
            return True
        if uri == _namespace_SO('SO_0001158'):
            return True
        if uri == _namespace_SO('SO_0001159'):
            return True
        if uri == _namespace_SO('SO_0001160'):
            return True
        if uri == _namespace_SO('SO_0001161'):
            return True
        if uri == _namespace_SO('SO_0001162'):
            return True
        if uri == _namespace_SO('SO_0001163'):
            return True
        if uri == _namespace_SO('SO_0001164'):
            return True
        if uri == _namespace_SO('SO_0001165'):
            return True
        if uri == _namespace_SO('SO_0001166'):
            return True
        if uri == _namespace_SO('SO_0001167'):
            return True
        if uri == _namespace_SO('SO_0001168'):
            return True
        if uri == _namespace_SO('SO_0001169'):
            return True
        if uri == _namespace_SO('SO_0001170'):
            return True
        if uri == _namespace_SO('SO_0001171'):
            return True
        if uri == _namespace_SO('SO_0001172'):
            return True
        if uri == _namespace_SO('SO_0001173'):
            return True
        if uri == _namespace_SO('SO_0001174'):
            return True
        if uri == _namespace_SO('SO_0001175'):
            return True
        if uri == _namespace_SO('SO_0001176'):
            return True
        if uri == _namespace_SO('SO_0001177'):
            return True
        if uri == _namespace_SO('SO_0001178'):
            return True
        if uri == _namespace_SO('SO_0001179'):
            return True
        if uri == _namespace_SO('SO_0001180'):
            return True
        if uri == _namespace_SO('SO_0001181'):
            return True
        if uri == _namespace_SO('SO_0001182'):
            return True
        if uri == _namespace_SO('SO_0001183'):
            return True
        if uri == _namespace_SO('SO_0001184'):
            return True
        if uri == _namespace_SO('SO_0001185'):
            return True
        if uri == _namespace_SO('SO_0001186'):
            return True
        if uri == _namespace_SO('SO_0001187'):
            return True
        if uri == _namespace_SO('SO_0001188'):
            return True
        if uri == _namespace_SO('SO_0001189'):
            return True
        if uri == _namespace_SO('SO_0001190'):
            return True
        if uri == _namespace_SO('SO_0001191'):
            return True
        if uri == _namespace_SO('SO_0001192'):
            return True
        if uri == _namespace_SO('SO_0001193'):
            return True
        if uri == _namespace_SO('SO_0001194'):
            return True
        if uri == _namespace_SO('SO_0001195'):
            return True
        if uri == _namespace_SO('SO_0001196'):
            return True
        if uri == _namespace_SO('SO_0001197'):
            return True
        if uri == _namespace_SO('SO_0001198'):
            return True
        if uri == _namespace_SO('SO_0001199'):
            return True
        if uri == _namespace_SO('SO_0001200'):
            return True
        if uri == _namespace_SO('SO_0001201'):
            return True
        if uri == _namespace_SO('SO_0001202'):
            return True
        if uri == _namespace_SO('SO_0001203'):
            return True
        if uri == _namespace_SO('SO_0001204'):
            return True
        if uri == _namespace_SO('SO_0001205'):
            return True
        if uri == _namespace_SO('SO_0001206'):
            return True
        if uri == _namespace_SO('SO_0001207'):
            return True
        if uri == _namespace_SO('SO_0001208'):
            return True
        if uri == _namespace_SO('SO_0001209'):
            return True
        if uri == _namespace_SO('SO_0001210'):
            return True
        if uri == _namespace_SO('SO_0001211'):
            return True
        if uri == _namespace_SO('SO_0001212'):
            return True
        if uri == _namespace_SO('SO_0001213'):
            return True
        if uri == _namespace_SO('SO_0001214'):
            return True
        if uri == _namespace_SO('SO_0001215'):
            return True
        if uri == _namespace_SO('SO_0001216'):
            return True
        if uri == _namespace_SO('SO_0001217'):
            return True
        if uri == _namespace_SO('SO_0001218'):
            return True
        if uri == _namespace_SO('SO_0001219'):
            return True
        if uri == _namespace_SO('SO_0001220'):
            return True
        if uri == _namespace_SO('SO_0001221'):
            return True
        if uri == _namespace_SO('SO_0001222'):
            return True
        if uri == _namespace_SO('SO_0001223'):
            return True
        if uri == _namespace_SO('SO_0001224'):
            return True
        if uri == _namespace_SO('SO_0001225'):
            return True
        if uri == _namespace_SO('SO_0001226'):
            return True
        if uri == _namespace_SO('SO_0001227'):
            return True
        if uri == _namespace_SO('SO_0001228'):
            return True
        if uri == _namespace_SO('SO_0001229'):
            return True
        if uri == _namespace_SO('SO_0001230'):
            return True
        if uri == _namespace_SO('SO_0001231'):
            return True
        if uri == _namespace_SO('SO_0001232'):
            return True
        if uri == _namespace_SO('SO_0001233'):
            return True
        if uri == _namespace_SO('SO_0001234'):
            return True
        if uri == _namespace_SO('SO_0001235'):
            return True
        if uri == _namespace_SO('SO_0001236'):
            return True
        if uri == _namespace_SO('SO_0001237'):
            return True
        if uri == _namespace_SO('SO_0001238'):
            return True
        if uri == _namespace_SO('SO_0001239'):
            return True
        if uri == _namespace_SO('SO_0001240'):
            return True
        if uri == _namespace_SO('SO_0001241'):
            return True
        if uri == _namespace_SO('SO_0001243'):
            return True
        if uri == _namespace_SO('SO_0001244'):
            return True
        if uri == _namespace_SO('SO_0001245'):
            return True
        if uri == _namespace_SO('SO_0001246'):
            return True
        if uri == _namespace_SO('SO_0001247'):
            return True
        if uri == _namespace_SO('SO_0001248'):
            return True
        if uri == _namespace_SO('SO_0001249'):
            return True
        if uri == _namespace_SO('SO_0001250'):
            return True
        if uri == _namespace_SO('SO_0001251'):
            return True
        if uri == _namespace_SO('SO_0001252'):
            return True
        if uri == _namespace_SO('SO_0001253'):
            return True
        if uri == _namespace_SO('SO_0001254'):
            return True
        if uri == _namespace_SO('SO_0001255'):
            return True
        if uri == _namespace_SO('SO_0001256'):
            return True
        if uri == _namespace_SO('SO_0001257'):
            return True
        if uri == _namespace_SO('SO_0001258'):
            return True
        if uri == _namespace_SO('SO_0001259'):
            return True
        if uri == _namespace_SO('SO_0001260'):
            return True
        if uri == _namespace_SO('SO_0001261'):
            return True
        if uri == _namespace_SO('SO_0001262'):
            return True
        if uri == _namespace_SO('SO_0001263'):
            return True
        if uri == _namespace_SO('SO_0001264'):
            return True
        if uri == _namespace_SO('SO_0001265'):
            return True
        if uri == _namespace_SO('SO_0001266'):
            return True
        if uri == _namespace_SO('SO_0001267'):
            return True
        if uri == _namespace_SO('SO_0001268'):
            return True
        if uri == _namespace_SO('SO_0001269'):
            return True
        if uri == _namespace_SO('SO_0001270'):
            return True
        if uri == _namespace_SO('SO_0001271'):
            return True
        if uri == _namespace_SO('SO_0001272'):
            return True
        if uri == _namespace_SO('SO_0001273'):
            return True
        if uri == _namespace_SO('SO_0001274'):
            return True
        if uri == _namespace_SO('SO_0001275'):
            return True
        if uri == _namespace_SO('SO_0001276'):
            return True
        if uri == _namespace_SO('SO_0001277'):
            return True
        if uri == _namespace_SO('SO_0001278'):
            return True
        if uri == _namespace_SO('SO_0001279'):
            return True
        if uri == _namespace_SO('SO_0001280'):
            return True
        if uri == _namespace_SO('SO_0001281'):
            return True
        if uri == _namespace_SO('SO_0001282'):
            return True
        if uri == _namespace_SO('SO_0001283'):
            return True
        if uri == _namespace_SO('SO_0001284'):
            return True
        if uri == _namespace_SO('SO_0001285'):
            return True
        if uri == _namespace_SO('SO_0001286'):
            return True
        if uri == _namespace_SO('SO_0001287'):
            return True
        if uri == _namespace_SO('SO_0001288'):
            return True
        if uri == _namespace_SO('SO_0001289'):
            return True
        if uri == _namespace_SO('SO_0001290'):
            return True
        if uri == _namespace_SO('SO_0001291'):
            return True
        if uri == _namespace_SO('SO_0001292'):
            return True
        if uri == _namespace_SO('SO_0001293'):
            return True
        if uri == _namespace_SO('SO_0001294'):
            return True
        if uri == _namespace_SO('SO_0001295'):
            return True
        if uri == _namespace_SO('SO_0001296'):
            return True
        if uri == _namespace_SO('SO_0001297'):
            return True
        if uri == _namespace_SO('SO_0001298'):
            return True
        if uri == _namespace_SO('SO_0001299'):
            return True
        if uri == _namespace_SO('SO_0001300'):
            return True
        if uri == _namespace_SO('SO_0001301'):
            return True
        if uri == _namespace_SO('SO_0001302'):
            return True
        if uri == _namespace_SO('SO_0001303'):
            return True
        if uri == _namespace_SO('SO_0001304'):
            return True
        if uri == _namespace_SO('SO_0001305'):
            return True
        if uri == _namespace_SO('SO_0001306'):
            return True
        if uri == _namespace_SO('SO_0001307'):
            return True
        if uri == _namespace_SO('SO_0001308'):
            return True
        if uri == _namespace_SO('SO_0001309'):
            return True
        if uri == _namespace_SO('SO_0001310'):
            return True
        if uri == _namespace_SO('SO_0001311'):
            return True
        if uri == _namespace_SO('SO_0001312'):
            return True
        if uri == _namespace_SO('SO_0001313'):
            return True
        if uri == _namespace_SO('SO_0001314'):
            return True
        if uri == _namespace_SO('SO_0001315'):
            return True
        if uri == _namespace_SO('SO_0001316'):
            return True
        if uri == _namespace_SO('SO_0001317'):
            return True
        if uri == _namespace_SO('SO_0001318'):
            return True
        if uri == _namespace_SO('SO_0001319'):
            return True
        if uri == _namespace_SO('SO_0001320'):
            return True
        if uri == _namespace_SO('SO_0001321'):
            return True
        if uri == _namespace_SO('SO_0001322'):
            return True
        if uri == _namespace_SO('SO_0001323'):
            return True
        if uri == _namespace_SO('SO_0001324'):
            return True
        if uri == _namespace_SO('SO_0001325'):
            return True
        if uri == _namespace_SO('SO_0001326'):
            return True
        if uri == _namespace_SO('SO_0001327'):
            return True
        if uri == _namespace_SO('SO_0001328'):
            return True
        if uri == _namespace_SO('SO_0001329'):
            return True
        if uri == _namespace_SO('SO_0001330'):
            return True
        if uri == _namespace_SO('SO_0001331'):
            return True
        if uri == _namespace_SO('SO_0001332'):
            return True
        if uri == _namespace_SO('SO_0001333'):
            return True
        if uri == _namespace_SO('SO_0001334'):
            return True
        if uri == _namespace_SO('SO_0001335'):
            return True
        if uri == _namespace_SO('SO_0001336'):
            return True
        if uri == _namespace_SO('SO_0001337'):
            return True
        if uri == _namespace_SO('SO_0001338'):
            return True
        if uri == _namespace_SO('SO_0001339'):
            return True
        if uri == _namespace_SO('SO_0001340'):
            return True
        if uri == _namespace_SO('SO_0001341'):
            return True
        if uri == _namespace_SO('SO_0001342'):
            return True
        if uri == _namespace_SO('SO_0001343'):
            return True
        if uri == _namespace_SO('SO_0001344'):
            return True
        if uri == _namespace_SO('SO_0001345'):
            return True
        if uri == _namespace_SO('SO_0001346'):
            return True
        if uri == _namespace_SO('SO_0001347'):
            return True
        if uri == _namespace_SO('SO_0001348'):
            return True
        if uri == _namespace_SO('SO_0001349'):
            return True
        if uri == _namespace_SO('SO_0001350'):
            return True
        if uri == _namespace_SO('SO_0001351'):
            return True
        if uri == _namespace_SO('SO_0001352'):
            return True
        if uri == _namespace_SO('SO_0001353'):
            return True
        if uri == _namespace_SO('SO_0001354'):
            return True
        if uri == _namespace_SO('SO_0001355'):
            return True
        if uri == _namespace_SO('SO_0001356'):
            return True
        if uri == _namespace_SO('SO_0001357'):
            return True
        if uri == _namespace_SO('SO_0001358'):
            return True
        if uri == _namespace_SO('SO_0001359'):
            return True
        if uri == _namespace_SO('SO_0001360'):
            return True
        if uri == _namespace_SO('SO_0001361'):
            return True
        if uri == _namespace_SO('SO_0001362'):
            return True
        if uri == _namespace_SO('SO_0001363'):
            return True
        if uri == _namespace_SO('SO_0001364'):
            return True
        if uri == _namespace_SO('SO_0001365'):
            return True
        if uri == _namespace_SO('SO_0001366'):
            return True
        if uri == _namespace_SO('SO_0001367'):
            return True
        if uri == _namespace_SO('SO_0001368'):
            return True
        if uri == _namespace_SO('SO_0001369'):
            return True
        if uri == _namespace_SO('SO_0001370'):
            return True
        if uri == _namespace_SO('SO_0001371'):
            return True
        if uri == _namespace_SO('SO_0001372'):
            return True
        if uri == _namespace_SO('SO_0001373'):
            return True
        if uri == _namespace_SO('SO_0001374'):
            return True
        if uri == _namespace_SO('SO_0001375'):
            return True
        if uri == _namespace_SO('SO_0001376'):
            return True
        if uri == _namespace_SO('SO_0001377'):
            return True
        if uri == _namespace_SO('SO_0001378'):
            return True
        if uri == _namespace_SO('SO_0001379'):
            return True
        if uri == _namespace_SO('SO_0001380'):
            return True
        if uri == _namespace_SO('SO_0001381'):
            return True
        if uri == _namespace_SO('SO_0001382'):
            return True
        if uri == _namespace_SO('SO_0001383'):
            return True
        if uri == _namespace_SO('SO_0001384'):
            return True
        if uri == _namespace_SO('SO_0001385'):
            return True
        if uri == _namespace_SO('SO_0001386'):
            return True
        if uri == _namespace_SO('SO_0001387'):
            return True
        if uri == _namespace_SO('SO_0001388'):
            return True
        if uri == _namespace_SO('SO_0001389'):
            return True
        if uri == _namespace_SO('SO_0001390'):
            return True
        if uri == _namespace_SO('SO_0001391'):
            return True
        if uri == _namespace_SO('SO_0001392'):
            return True
        if uri == _namespace_SO('SO_0001393'):
            return True
        if uri == _namespace_SO('SO_0001394'):
            return True
        if uri == _namespace_SO('SO_0001395'):
            return True
        if uri == _namespace_SO('SO_0001396'):
            return True
        if uri == _namespace_SO('SO_0001397'):
            return True
        if uri == _namespace_SO('SO_0001398'):
            return True
        if uri == _namespace_SO('SO_0001399'):
            return True
        if uri == _namespace_SO('SO_0001400'):
            return True
        if uri == _namespace_SO('SO_0001401'):
            return True
        if uri == _namespace_SO('SO_0001402'):
            return True
        if uri == _namespace_SO('SO_0001403'):
            return True
        if uri == _namespace_SO('SO_0001404'):
            return True
        if uri == _namespace_SO('SO_0001405'):
            return True
        if uri == _namespace_SO('SO_0001406'):
            return True
        if uri == _namespace_SO('SO_0001407'):
            return True
        if uri == _namespace_SO('SO_0001408'):
            return True
        if uri == _namespace_SO('SO_0001409'):
            return True
        if uri == _namespace_SO('SO_0001410'):
            return True
        if uri == _namespace_SO('SO_0001411'):
            return True
        if uri == _namespace_SO('SO_0001412'):
            return True
        if uri == _namespace_SO('SO_0001413'):
            return True
        if uri == _namespace_SO('SO_0001414'):
            return True
        if uri == _namespace_SO('SO_0001415'):
            return True
        if uri == _namespace_SO('SO_0001416'):
            return True
        if uri == _namespace_SO('SO_0001417'):
            return True
        if uri == _namespace_SO('SO_0001418'):
            return True
        if uri == _namespace_SO('SO_0001419'):
            return True
        if uri == _namespace_SO('SO_0001420'):
            return True
        if uri == _namespace_SO('SO_0001421'):
            return True
        if uri == _namespace_SO('SO_0001422'):
            return True
        if uri == _namespace_SO('SO_0001423'):
            return True
        if uri == _namespace_SO('SO_0001424'):
            return True
        if uri == _namespace_SO('SO_0001425'):
            return True
        if uri == _namespace_SO('SO_0001426'):
            return True
        if uri == _namespace_SO('SO_0001427'):
            return True
        if uri == _namespace_SO('SO_0001428'):
            return True
        if uri == _namespace_SO('SO_0001429'):
            return True
        if uri == _namespace_SO('SO_0001431'):
            return True
        if uri == _namespace_SO('SO_0001432'):
            return True
        if uri == _namespace_SO('SO_0001433'):
            return True
        if uri == _namespace_SO('SO_0001434'):
            return True
        if uri == _namespace_SO('SO_0001435'):
            return True
        if uri == _namespace_SO('SO_0001436'):
            return True
        if uri == _namespace_SO('SO_0001437'):
            return True
        if uri == _namespace_SO('SO_0001438'):
            return True
        if uri == _namespace_SO('SO_0001439'):
            return True
        if uri == _namespace_SO('SO_0001440'):
            return True
        if uri == _namespace_SO('SO_0001441'):
            return True
        if uri == _namespace_SO('SO_0001442'):
            return True
        if uri == _namespace_SO('SO_0001443'):
            return True
        if uri == _namespace_SO('SO_0001444'):
            return True
        if uri == _namespace_SO('SO_0001445'):
            return True
        if uri == _namespace_SO('SO_0001446'):
            return True
        if uri == _namespace_SO('SO_0001447'):
            return True
        if uri == _namespace_SO('SO_0001448'):
            return True
        if uri == _namespace_SO('SO_0001449'):
            return True
        if uri == _namespace_SO('SO_0001450'):
            return True
        if uri == _namespace_SO('SO_0001451'):
            return True
        if uri == _namespace_SO('SO_0001452'):
            return True
        if uri == _namespace_SO('SO_0001453'):
            return True
        if uri == _namespace_SO('SO_0001454'):
            return True
        if uri == _namespace_SO('SO_0001455'):
            return True
        if uri == _namespace_SO('SO_0001456'):
            return True
        if uri == _namespace_SO('SO_0001457'):
            return True
        if uri == _namespace_SO('SO_0001458'):
            return True
        if uri == _namespace_SO('SO_0001459'):
            return True
        if uri == _namespace_SO('SO_0001460'):
            return True
        if uri == _namespace_SO('SO_0001461'):
            return True
        if uri == _namespace_SO('SO_0001462'):
            return True
        if uri == _namespace_SO('SO_0001463'):
            return True
        if uri == _namespace_SO('SO_0001464'):
            return True
        if uri == _namespace_SO('SO_0001465'):
            return True
        if uri == _namespace_SO('SO_0001466'):
            return True
        if uri == _namespace_SO('SO_0001467'):
            return True
        if uri == _namespace_SO('SO_0001468'):
            return True
        if uri == _namespace_SO('SO_0001469'):
            return True
        if uri == _namespace_SO('SO_0001470'):
            return True
        if uri == _namespace_SO('SO_0001471'):
            return True
        if uri == _namespace_SO('SO_0001472'):
            return True
        if uri == _namespace_SO('SO_0001473'):
            return True
        if uri == _namespace_SO('SO_0001474'):
            return True
        if uri == _namespace_SO('SO_0001475'):
            return True
        if uri == _namespace_SO('SO_0001476'):
            return True
        if uri == _namespace_SO('SO_0001477'):
            return True
        if uri == _namespace_SO('SO_0001478'):
            return True
        if uri == _namespace_SO('SO_0001479'):
            return True
        if uri == _namespace_SO('SO_0001480'):
            return True
        if uri == _namespace_SO('SO_0001481'):
            return True
        if uri == _namespace_SO('SO_0001482'):
            return True
        if uri == _namespace_SO('SO_0001483'):
            return True
        if uri == _namespace_SO('SO_0001484'):
            return True
        if uri == _namespace_SO('SO_0001485'):
            return True
        if uri == _namespace_SO('SO_0001486'):
            return True
        if uri == _namespace_SO('SO_0001487'):
            return True
        if uri == _namespace_SO('SO_0001488'):
            return True
        if uri == _namespace_SO('SO_0001489'):
            return True
        if uri == _namespace_SO('SO_0001490'):
            return True
        if uri == _namespace_SO('SO_0001491'):
            return True
        if uri == _namespace_SO('SO_0001492'):
            return True
        if uri == _namespace_SO('SO_0001493'):
            return True
        if uri == _namespace_SO('SO_0001494'):
            return True
        if uri == _namespace_SO('SO_0001495'):
            return True
        if uri == _namespace_SO('SO_0001496'):
            return True
        if uri == _namespace_SO('SO_0001497'):
            return True
        if uri == _namespace_SO('SO_0001498'):
            return True
        if uri == _namespace_SO('SO_0001499'):
            return True
        if uri == _namespace_SO('SO_0001500'):
            return True
        if uri == _namespace_SO('SO_0001501'):
            return True
        if uri == _namespace_SO('SO_0001502'):
            return True
        if uri == _namespace_SO('SO_0001503'):
            return True
        if uri == _namespace_SO('SO_0001504'):
            return True
        if uri == _namespace_SO('SO_0001505'):
            return True
        if uri == _namespace_SO('SO_0001506'):
            return True
        if uri == _namespace_SO('SO_0001507'):
            return True
        if uri == _namespace_SO('SO_0001508'):
            return True
        if uri == _namespace_SO('SO_0001509'):
            return True
        if uri == _namespace_SO('SO_0001510'):
            return True
        if uri == _namespace_SO('SO_0001511'):
            return True
        if uri == _namespace_SO('SO_0001512'):
            return True
        if uri == _namespace_SO('SO_0001513'):
            return True
        if uri == _namespace_SO('SO_0001514'):
            return True
        if uri == _namespace_SO('SO_0001515'):
            return True
        if uri == _namespace_SO('SO_0001516'):
            return True
        if uri == _namespace_SO('SO_0001517'):
            return True
        if uri == _namespace_SO('SO_0001518'):
            return True
        if uri == _namespace_SO('SO_0001519'):
            return True
        if uri == _namespace_SO('SO_0001520'):
            return True
        if uri == _namespace_SO('SO_0001521'):
            return True
        if uri == _namespace_SO('SO_0001522'):
            return True
        if uri == _namespace_SO('SO_0001523'):
            return True
        if uri == _namespace_SO('SO_0001524'):
            return True
        if uri == _namespace_SO('SO_0001525'):
            return True
        if uri == _namespace_SO('SO_0001526'):
            return True
        if uri == _namespace_SO('SO_0001527'):
            return True
        if uri == _namespace_SO('SO_0001528'):
            return True
        if uri == _namespace_SO('SO_0001529'):
            return True
        if uri == _namespace_SO('SO_0001530'):
            return True
        if uri == _namespace_SO('SO_0001531'):
            return True
        if uri == _namespace_SO('SO_0001532'):
            return True
        if uri == _namespace_SO('SO_0001533'):
            return True
        if uri == _namespace_SO('SO_0001534'):
            return True
        if uri == _namespace_SO('SO_0001535'):
            return True
        if uri == _namespace_SO('SO_0001536'):
            return True
        if uri == _namespace_SO('SO_0001537'):
            return True
        if uri == _namespace_SO('SO_0001538'):
            return True
        if uri == _namespace_SO('SO_0001539'):
            return True
        if uri == _namespace_SO('SO_0001540'):
            return True
        if uri == _namespace_SO('SO_0001541'):
            return True
        if uri == _namespace_SO('SO_0001542'):
            return True
        if uri == _namespace_SO('SO_0001543'):
            return True
        if uri == _namespace_SO('SO_0001544'):
            return True
        if uri == _namespace_SO('SO_0001545'):
            return True
        if uri == _namespace_SO('SO_0001546'):
            return True
        if uri == _namespace_SO('SO_0001547'):
            return True
        if uri == _namespace_SO('SO_0001548'):
            return True
        if uri == _namespace_SO('SO_0001549'):
            return True
        if uri == _namespace_SO('SO_0001550'):
            return True
        if uri == _namespace_SO('SO_0001551'):
            return True
        if uri == _namespace_SO('SO_0001552'):
            return True
        if uri == _namespace_SO('SO_0001553'):
            return True
        if uri == _namespace_SO('SO_0001554'):
            return True
        if uri == _namespace_SO('SO_0001555'):
            return True
        if uri == _namespace_SO('SO_0001556'):
            return True
        if uri == _namespace_SO('SO_0001557'):
            return True
        if uri == _namespace_SO('SO_0001558'):
            return True
        if uri == _namespace_SO('SO_0001559'):
            return True
        if uri == _namespace_SO('SO_0001560'):
            return True
        if uri == _namespace_SO('SO_0001561'):
            return True
        if uri == _namespace_SO('SO_0001562'):
            return True
        if uri == _namespace_SO('SO_0001563'):
            return True
        if uri == _namespace_SO('SO_0001564'):
            return True
        if uri == _namespace_SO('SO_0001565'):
            return True
        if uri == _namespace_SO('SO_0001566'):
            return True
        if uri == _namespace_SO('SO_0001567'):
            return True
        if uri == _namespace_SO('SO_0001568'):
            return True
        if uri == _namespace_SO('SO_0001569'):
            return True
        if uri == _namespace_SO('SO_0001570'):
            return True
        if uri == _namespace_SO('SO_0001571'):
            return True
        if uri == _namespace_SO('SO_0001572'):
            return True
        if uri == _namespace_SO('SO_0001573'):
            return True
        if uri == _namespace_SO('SO_0001574'):
            return True
        if uri == _namespace_SO('SO_0001575'):
            return True
        if uri == _namespace_SO('SO_0001576'):
            return True
        if uri == _namespace_SO('SO_0001577'):
            return True
        if uri == _namespace_SO('SO_0001578'):
            return True
        if uri == _namespace_SO('SO_0001579'):
            return True
        if uri == _namespace_SO('SO_0001580'):
            return True
        if uri == _namespace_SO('SO_0001582'):
            return True
        if uri == _namespace_SO('SO_0001583'):
            return True
        if uri == _namespace_SO('SO_0001585'):
            return True
        if uri == _namespace_SO('SO_0001586'):
            return True
        if uri == _namespace_SO('SO_0001587'):
            return True
        if uri == _namespace_SO('SO_0001589'):
            return True
        if uri == _namespace_SO('SO_0001590'):
            return True
        if uri == _namespace_SO('SO_0001591'):
            return True
        if uri == _namespace_SO('SO_0001592'):
            return True
        if uri == _namespace_SO('SO_0001593'):
            return True
        if uri == _namespace_SO('SO_0001594'):
            return True
        if uri == _namespace_SO('SO_0001595'):
            return True
        if uri == _namespace_SO('SO_0001596'):
            return True
        if uri == _namespace_SO('SO_0001597'):
            return True
        if uri == _namespace_SO('SO_0001598'):
            return True
        if uri == _namespace_SO('SO_0001599'):
            return True
        if uri == _namespace_SO('SO_0001600'):
            return True
        if uri == _namespace_SO('SO_0001601'):
            return True
        if uri == _namespace_SO('SO_0001602'):
            return True
        if uri == _namespace_SO('SO_0001603'):
            return True
        if uri == _namespace_SO('SO_0001604'):
            return True
        if uri == _namespace_SO('SO_0001605'):
            return True
        if uri == _namespace_SO('SO_0001606'):
            return True
        if uri == _namespace_SO('SO_0001607'):
            return True
        if uri == _namespace_SO('SO_0001608'):
            return True
        if uri == _namespace_SO('SO_0001609'):
            return True
        if uri == _namespace_SO('SO_0001610'):
            return True
        if uri == _namespace_SO('SO_0001611'):
            return True
        if uri == _namespace_SO('SO_0001612'):
            return True
        if uri == _namespace_SO('SO_0001613'):
            return True
        if uri == _namespace_SO('SO_0001614'):
            return True
        if uri == _namespace_SO('SO_0001615'):
            return True
        if uri == _namespace_SO('SO_0001616'):
            return True
        if uri == _namespace_SO('SO_0001617'):
            return True
        if uri == _namespace_SO('SO_0001618'):
            return True
        if uri == _namespace_SO('SO_0001619'):
            return True
        if uri == _namespace_SO('SO_0001620'):
            return True
        if uri == _namespace_SO('SO_0001621'):
            return True
        if uri == _namespace_SO('SO_0001622'):
            return True
        if uri == _namespace_SO('SO_0001623'):
            return True
        if uri == _namespace_SO('SO_0001624'):
            return True
        if uri == _namespace_SO('SO_0001626'):
            return True
        if uri == _namespace_SO('SO_0001627'):
            return True
        if uri == _namespace_SO('SO_0001628'):
            return True
        if uri == _namespace_SO('SO_0001629'):
            return True
        if uri == _namespace_SO('SO_0001630'):
            return True
        if uri == _namespace_SO('SO_0001631'):
            return True
        if uri == _namespace_SO('SO_0001632'):
            return True
        if uri == _namespace_SO('SO_0001633'):
            return True
        if uri == _namespace_SO('SO_0001634'):
            return True
        if uri == _namespace_SO('SO_0001635'):
            return True
        if uri == _namespace_SO('SO_0001636'):
            return True
        if uri == _namespace_SO('SO_0001637'):
            return True
        if uri == _namespace_SO('SO_0001638'):
            return True
        if uri == _namespace_SO('SO_0001639'):
            return True
        if uri == _namespace_SO('SO_0001640'):
            return True
        if uri == _namespace_SO('SO_0001641'):
            return True
        if uri == _namespace_SO('SO_0001642'):
            return True
        if uri == _namespace_SO('SO_0001643'):
            return True
        if uri == _namespace_SO('SO_0001644'):
            return True
        if uri == _namespace_SO('SO_0001645'):
            return True
        if uri == _namespace_SO('SO_0001646'):
            return True
        if uri == _namespace_SO('SO_0001647'):
            return True
        if uri == _namespace_SO('SO_0001648'):
            return True
        if uri == _namespace_SO('SO_0001649'):
            return True
        if uri == _namespace_SO('SO_0001650'):
            return True
        if uri == _namespace_SO('SO_0001653'):
            return True
        if uri == _namespace_SO('SO_0001654'):
            return True
        if uri == _namespace_SO('SO_0001655'):
            return True
        if uri == _namespace_SO('SO_0001656'):
            return True
        if uri == _namespace_SO('SO_0001657'):
            return True
        if uri == _namespace_SO('SO_0001658'):
            return True
        if uri == _namespace_SO('SO_0001659'):
            return True
        if uri == _namespace_SO('SO_0001660'):
            return True
        if uri == _namespace_SO('SO_0001661'):
            return True
        if uri == _namespace_SO('SO_0001662'):
            return True
        if uri == _namespace_SO('SO_0001663'):
            return True
        if uri == _namespace_SO('SO_0001664'):
            return True
        if uri == _namespace_SO('SO_0001665'):
            return True
        if uri == _namespace_SO('SO_0001666'):
            return True
        if uri == _namespace_SO('SO_0001667'):
            return True
        if uri == _namespace_SO('SO_0001668'):
            return True
        if uri == _namespace_SO('SO_0001669'):
            return True
        if uri == _namespace_SO('SO_0001670'):
            return True
        if uri == _namespace_SO('SO_0001671'):
            return True
        if uri == _namespace_SO('SO_0001672'):
            return True
        if uri == _namespace_SO('SO_0001673'):
            return True
        if uri == _namespace_SO('SO_0001674'):
            return True
        if uri == _namespace_SO('SO_0001675'):
            return True
        if uri == _namespace_SO('SO_0001676'):
            return True
        if uri == _namespace_SO('SO_0001677'):
            return True
        if uri == _namespace_SO('SO_0001678'):
            return True
        if uri == _namespace_SO('SO_0001679'):
            return True
        if uri == _namespace_SO('SO_0001680'):
            return True
        if uri == _namespace_SO('SO_0001681'):
            return True
        if uri == _namespace_SO('SO_0001682'):
            return True
        if uri == _namespace_SO('SO_0001683'):
            return True
        if uri == _namespace_SO('SO_0001684'):
            return True
        if uri == _namespace_SO('SO_0001685'):
            return True
        if uri == _namespace_SO('SO_0001686'):
            return True
        if uri == _namespace_SO('SO_0001687'):
            return True
        if uri == _namespace_SO('SO_0001688'):
            return True
        if uri == _namespace_SO('SO_0001689'):
            return True
        if uri == _namespace_SO('SO_0001690'):
            return True
        if uri == _namespace_SO('SO_0001691'):
            return True
        if uri == _namespace_SO('SO_0001692'):
            return True
        if uri == _namespace_SO('SO_0001693'):
            return True
        if uri == _namespace_SO('SO_0001694'):
            return True
        if uri == _namespace_SO('SO_0001695'):
            return True
        if uri == _namespace_SO('SO_0001696'):
            return True
        if uri == _namespace_SO('SO_0001697'):
            return True
        if uri == _namespace_SO('SO_0001698'):
            return True
        if uri == _namespace_SO('SO_0001699'):
            return True
        if uri == _namespace_SO('SO_0001700'):
            return True
        if uri == _namespace_SO('SO_0001701'):
            return True
        if uri == _namespace_SO('SO_0001702'):
            return True
        if uri == _namespace_SO('SO_0001703'):
            return True
        if uri == _namespace_SO('SO_0001704'):
            return True
        if uri == _namespace_SO('SO_0001705'):
            return True
        if uri == _namespace_SO('SO_0001706'):
            return True
        if uri == _namespace_SO('SO_0001707'):
            return True
        if uri == _namespace_SO('SO_0001708'):
            return True
        if uri == _namespace_SO('SO_0001709'):
            return True
        if uri == _namespace_SO('SO_0001710'):
            return True
        if uri == _namespace_SO('SO_0001711'):
            return True
        if uri == _namespace_SO('SO_0001712'):
            return True
        if uri == _namespace_SO('SO_0001713'):
            return True
        if uri == _namespace_SO('SO_0001714'):
            return True
        if uri == _namespace_SO('SO_0001715'):
            return True
        if uri == _namespace_SO('SO_0001716'):
            return True
        if uri == _namespace_SO('SO_0001717'):
            return True
        if uri == _namespace_SO('SO_0001718'):
            return True
        if uri == _namespace_SO('SO_0001719'):
            return True
        if uri == _namespace_SO('SO_0001720'):
            return True
        if uri == _namespace_SO('SO_0001721'):
            return True
        if uri == _namespace_SO('SO_0001722'):
            return True
        if uri == _namespace_SO('SO_0001723'):
            return True
        if uri == _namespace_SO('SO_0001724'):
            return True
        if uri == _namespace_SO('SO_0001725'):
            return True
        if uri == _namespace_SO('SO_0001726'):
            return True
        if uri == _namespace_SO('SO_0001727'):
            return True
        if uri == _namespace_SO('SO_0001728'):
            return True
        if uri == _namespace_SO('SO_0001729'):
            return True
        if uri == _namespace_SO('SO_0001730'):
            return True
        if uri == _namespace_SO('SO_0001731'):
            return True
        if uri == _namespace_SO('SO_0001732'):
            return True
        if uri == _namespace_SO('SO_0001733'):
            return True
        if uri == _namespace_SO('SO_0001734'):
            return True
        if uri == _namespace_SO('SO_0001735'):
            return True
        if uri == _namespace_SO('SO_0001736'):
            return True
        if uri == _namespace_SO('SO_0001737'):
            return True
        if uri == _namespace_SO('SO_0001738'):
            return True
        if uri == _namespace_SO('SO_0001739'):
            return True
        if uri == _namespace_SO('SO_0001740'):
            return True
        if uri == _namespace_SO('SO_0001741'):
            return True
        if uri == _namespace_SO('SO_0001742'):
            return True
        if uri == _namespace_SO('SO_0001743'):
            return True
        if uri == _namespace_SO('SO_0001744'):
            return True
        if uri == _namespace_SO('SO_0001745'):
            return True
        if uri == _namespace_SO('SO_0001746'):
            return True
        if uri == _namespace_SO('SO_0001747'):
            return True
        if uri == _namespace_SO('SO_0001748'):
            return True
        if uri == _namespace_SO('SO_0001749'):
            return True
        if uri == _namespace_SO('SO_0001750'):
            return True
        if uri == _namespace_SO('SO_0001751'):
            return True
        if uri == _namespace_SO('SO_0001752'):
            return True
        if uri == _namespace_SO('SO_0001753'):
            return True
        if uri == _namespace_SO('SO_0001754'):
            return True
        if uri == _namespace_SO('SO_0001755'):
            return True
        if uri == _namespace_SO('SO_0001756'):
            return True
        if uri == _namespace_SO('SO_0001757'):
            return True
        if uri == _namespace_SO('SO_0001758'):
            return True
        if uri == _namespace_SO('SO_0001759'):
            return True
        if uri == _namespace_SO('SO_0001760'):
            return True
        if uri == _namespace_SO('SO_0001761'):
            return True
        if uri == _namespace_SO('SO_0001762'):
            return True
        if uri == _namespace_SO('SO_0001763'):
            return True
        if uri == _namespace_SO('SO_0001764'):
            return True
        if uri == _namespace_SO('SO_0001765'):
            return True
        if uri == _namespace_SO('SO_0001766'):
            return True
        if uri == _namespace_SO('SO_0001767'):
            return True
        if uri == _namespace_SO('SO_0001768'):
            return True
        if uri == _namespace_SO('SO_0001769'):
            return True
        if uri == _namespace_SO('SO_0001770'):
            return True
        if uri == _namespace_SO('SO_0001771'):
            return True
        if uri == _namespace_SO('SO_0001772'):
            return True
        if uri == _namespace_SO('SO_0001773'):
            return True
        if uri == _namespace_SO('SO_0001774'):
            return True
        if uri == _namespace_SO('SO_0001775'):
            return True
        if uri == _namespace_SO('SO_0001776'):
            return True
        if uri == _namespace_SO('SO_0001777'):
            return True
        if uri == _namespace_SO('SO_0001778'):
            return True
        if uri == _namespace_SO('SO_0001779'):
            return True
        if uri == _namespace_SO('SO_0001780'):
            return True
        if uri == _namespace_SO('SO_0001781'):
            return True
        if uri == _namespace_SO('SO_0001782'):
            return True
        if uri == _namespace_SO('SO_0001784'):
            return True
        if uri == _namespace_SO('SO_0001785'):
            return True
        if uri == _namespace_SO('SO_0001786'):
            return True
        if uri == _namespace_SO('SO_0001787'):
            return True
        if uri == _namespace_SO('SO_0001788'):
            return True
        if uri == _namespace_SO('SO_0001789'):
            return True
        if uri == _namespace_SO('SO_0001790'):
            return True
        if uri == _namespace_SO('SO_0001791'):
            return True
        if uri == _namespace_SO('SO_0001792'):
            return True
        if uri == _namespace_SO('SO_0001793'):
            return True
        if uri == _namespace_SO('SO_0001794'):
            return True
        if uri == _namespace_SO('SO_0001795'):
            return True
        if uri == _namespace_SO('SO_0001796'):
            return True
        if uri == _namespace_SO('SO_0001797'):
            return True
        if uri == _namespace_SO('SO_0001798'):
            return True
        if uri == _namespace_SO('SO_0001799'):
            return True
        if uri == _namespace_SO('SO_0001800'):
            return True
        if uri == _namespace_SO('SO_0001801'):
            return True
        if uri == _namespace_SO('SO_0001802'):
            return True
        if uri == _namespace_SO('SO_0001803'):
            return True
        if uri == _namespace_SO('SO_0001804'):
            return True
        if uri == _namespace_SO('SO_0001805'):
            return True
        if uri == _namespace_SO('SO_0001806'):
            return True
        if uri == _namespace_SO('SO_0001807'):
            return True
        if uri == _namespace_SO('SO_0001808'):
            return True
        if uri == _namespace_SO('SO_0001809'):
            return True
        if uri == _namespace_SO('SO_0001810'):
            return True
        if uri == _namespace_SO('SO_0001811'):
            return True
        if uri == _namespace_SO('SO_0001812'):
            return True
        if uri == _namespace_SO('SO_0001813'):
            return True
        if uri == _namespace_SO('SO_0001814'):
            return True
        if uri == _namespace_SO('SO_0001815'):
            return True
        if uri == _namespace_SO('SO_0001816'):
            return True
        if uri == _namespace_SO('SO_0001817'):
            return True
        if uri == _namespace_SO('SO_0001818'):
            return True
        if uri == _namespace_SO('SO_0001819'):
            return True
        if uri == _namespace_SO('SO_0001820'):
            return True
        if uri == _namespace_SO('SO_0001821'):
            return True
        if uri == _namespace_SO('SO_0001822'):
            return True
        if uri == _namespace_SO('SO_0001823'):
            return True
        if uri == _namespace_SO('SO_0001824'):
            return True
        if uri == _namespace_SO('SO_0001825'):
            return True
        if uri == _namespace_SO('SO_0001826'):
            return True
        if uri == _namespace_SO('SO_0001827'):
            return True
        if uri == _namespace_SO('SO_0001828'):
            return True
        if uri == _namespace_SO('SO_0001829'):
            return True
        if uri == _namespace_SO('SO_0001830'):
            return True
        if uri == _namespace_SO('SO_0001831'):
            return True
        if uri == _namespace_SO('SO_0001832'):
            return True
        if uri == _namespace_SO('SO_0001833'):
            return True
        if uri == _namespace_SO('SO_0001834'):
            return True
        if uri == _namespace_SO('SO_0001835'):
            return True
        if uri == _namespace_SO('SO_0001836'):
            return True
        if uri == _namespace_SO('SO_0001837'):
            return True
        if uri == _namespace_SO('SO_0001838'):
            return True
        if uri == _namespace_SO('SO_0001839'):
            return True
        if uri == _namespace_SO('SO_0001840'):
            return True
        if uri == _namespace_SO('SO_0001841'):
            return True
        if uri == _namespace_SO('SO_0001842'):
            return True
        if uri == _namespace_SO('SO_0001843'):
            return True
        if uri == _namespace_SO('SO_0001844'):
            return True
        if uri == _namespace_SO('SO_0001845'):
            return True
        if uri == _namespace_SO('SO_0001846'):
            return True
        if uri == _namespace_SO('SO_0001847'):
            return True
        if uri == _namespace_SO('SO_0001848'):
            return True
        if uri == _namespace_SO('SO_0001849'):
            return True
        if uri == _namespace_SO('SO_0001850'):
            return True
        if uri == _namespace_SO('SO_0001851'):
            return True
        if uri == _namespace_SO('SO_0001852'):
            return True
        if uri == _namespace_SO('SO_0001853'):
            return True
        if uri == _namespace_SO('SO_0001854'):
            return True
        if uri == _namespace_SO('SO_0001855'):
            return True
        if uri == _namespace_SO('SO_0001856'):
            return True
        if uri == _namespace_SO('SO_0001857'):
            return True
        if uri == _namespace_SO('SO_0001858'):
            return True
        if uri == _namespace_SO('SO_0001859'):
            return True
        if uri == _namespace_SO('SO_0001860'):
            return True
        if uri == _namespace_SO('SO_0001861'):
            return True
        if uri == _namespace_SO('SO_0001862'):
            return True
        if uri == _namespace_SO('SO_0001863'):
            return True
        if uri == _namespace_SO('SO_0001864'):
            return True
        if uri == _namespace_SO('SO_0001865'):
            return True
        if uri == _namespace_SO('SO_0001866'):
            return True
        if uri == _namespace_SO('SO_0001867'):
            return True
        if uri == _namespace_SO('SO_0001868'):
            return True
        if uri == _namespace_SO('SO_0001869'):
            return True
        if uri == _namespace_SO('SO_0001870'):
            return True
        if uri == _namespace_SO('SO_0001871'):
            return True
        if uri == _namespace_SO('SO_0001872'):
            return True
        if uri == _namespace_SO('SO_0001873'):
            return True
        if uri == _namespace_SO('SO_0001874'):
            return True
        if uri == _namespace_SO('SO_0001875'):
            return True
        if uri == _namespace_SO('SO_0001876'):
            return True
        if uri == _namespace_SO('SO_0001877'):
            return True
        if uri == _namespace_SO('SO_0001878'):
            return True
        if uri == _namespace_SO('SO_0001879'):
            return True
        if uri == _namespace_SO('SO_0001880'):
            return True
        if uri == _namespace_SO('SO_0001881'):
            return True
        if uri == _namespace_SO('SO_0001882'):
            return True
        if uri == _namespace_SO('SO_0001883'):
            return True
        if uri == _namespace_SO('SO_0001884'):
            return True
        if uri == _namespace_SO('SO_0001885'):
            return True
        if uri == _namespace_SO('SO_0001886'):
            return True
        if uri == _namespace_SO('SO_0001887'):
            return True
        if uri == _namespace_SO('SO_0001888'):
            return True
        if uri == _namespace_SO('SO_0001889'):
            return True
        if uri == _namespace_SO('SO_0001890'):
            return True
        if uri == _namespace_SO('SO_0001891'):
            return True
        if uri == _namespace_SO('SO_0001892'):
            return True
        if uri == _namespace_SO('SO_0001893'):
            return True
        if uri == _namespace_SO('SO_0001894'):
            return True
        if uri == _namespace_SO('SO_0001895'):
            return True
        if uri == _namespace_SO('SO_0001896'):
            return True
        if uri == _namespace_SO('SO_0001897'):
            return True
        if uri == _namespace_SO('SO_0001898'):
            return True
        if uri == _namespace_SO('SO_0001899'):
            return True
        if uri == _namespace_SO('SO_0001900'):
            return True
        if uri == _namespace_SO('SO_0001901'):
            return True
        if uri == _namespace_SO('SO_0001902'):
            return True
        if uri == _namespace_SO('SO_0001903'):
            return True
        if uri == _namespace_SO('SO_0001904'):
            return True
        if uri == _namespace_SO('SO_0001905'):
            return True
        if uri == _namespace_SO('SO_0001906'):
            return True
        if uri == _namespace_SO('SO_0001907'):
            return True
        if uri == _namespace_SO('SO_0001908'):
            return True
        if uri == _namespace_SO('SO_0001909'):
            return True
        if uri == _namespace_SO('SO_0001910'):
            return True
        if uri == _namespace_SO('SO_0001911'):
            return True
        if uri == _namespace_SO('SO_0001912'):
            return True
        if uri == _namespace_SO('SO_0001913'):
            return True
        if uri == _namespace_SO('SO_0001914'):
            return True
        if uri == _namespace_SO('SO_0001915'):
            return True
        if uri == _namespace_SO('SO_0001916'):
            return True
        if uri == _namespace_SO('SO_0001917'):
            return True
        if uri == _namespace_SO('SO_0001918'):
            return True
        if uri == _namespace_SO('SO_0001919'):
            return True
        if uri == _namespace_SO('SO_0001920'):
            return True
        if uri == _namespace_SO('SO_0001921'):
            return True
        if uri == _namespace_SO('SO_0001922'):
            return True
        if uri == _namespace_SO('SO_0001923'):
            return True
        if uri == _namespace_SO('SO_0001924'):
            return True
        if uri == _namespace_SO('SO_0001925'):
            return True
        if uri == _namespace_SO('SO_0001926'):
            return True
        if uri == _namespace_SO('SO_0001927'):
            return True
        if uri == _namespace_SO('SO_0001928'):
            return True
        if uri == _namespace_SO('SO_0001929'):
            return True
        if uri == _namespace_SO('SO_0001930'):
            return True
        if uri == _namespace_SO('SO_0005836'):
            return True
        if uri == _namespace_SO('SO_0005837'):
            return True
        if uri == _namespace_SO('SO_0005841'):
            return True
        if uri == _namespace_SO('SO_0005843'):
            return True
        if uri == _namespace_SO('SO_0005845'):
            return True
        if uri == _namespace_SO('SO_0005847'):
            return True
        if uri == _namespace_SO('SO_0005848'):
            return True
        if uri == _namespace_SO('SO_0005849'):
            return True
        if uri == _namespace_SO('SO_0005850'):
            return True
        if uri == _namespace_SO('SO_0005851'):
            return True
        if uri == _namespace_SO('SO_0005852'):
            return True
        if uri == _namespace_SO('SO_0005853'):
            return True
        if uri == _namespace_SO('SO_0005854'):
            return True
        if uri == _namespace_SO('SO_0005855'):
            return True
        if uri == _namespace_SO('SO_0005856'):
            return True
        if uri == _namespace_SO('SO_0005857'):
            return True
        if uri == _namespace_SO('SO_0005858'):
            return True
        if uri == _namespace_SO('SO_0100001'):
            return True
        if uri == _namespace_SO('SO_0100002'):
            return True
        if uri == _namespace_SO('SO_0100003'):
            return True
        if uri == _namespace_SO('SO_0100004'):
            return True
        if uri == _namespace_SO('SO_0100005'):
            return True
        if uri == _namespace_SO('SO_0100006'):
            return True
        if uri == _namespace_SO('SO_0100007'):
            return True
        if uri == _namespace_SO('SO_0100008'):
            return True
        if uri == _namespace_SO('SO_0100009'):
            return True
        if uri == _namespace_SO('SO_0100010'):
            return True
        if uri == _namespace_SO('SO_0100011'):
            return True
        if uri == _namespace_SO('SO_0100012'):
            return True
        if uri == _namespace_SO('SO_0100013'):
            return True
        if uri == _namespace_SO('SO_0100014'):
            return True
        if uri == _namespace_SO('SO_0100015'):
            return True
        if uri == _namespace_SO('SO_0100016'):
            return True
        if uri == _namespace_SO('SO_0100017'):
            return True
        if uri == _namespace_SO('SO_0100018'):
            return True
        if uri == _namespace_SO('SO_0100019'):
            return True
        if uri == _namespace_SO('SO_0100020'):
            return True
        if uri == _namespace_SO('SO_0100021'):
            return True
        if uri == _namespace_SO('SO_1000002'):
            return True
        if uri == _namespace_SO('SO_1000005'):
            return True
        if uri == _namespace_SO('SO_1000008'):
            return True
        if uri == _namespace_SO('SO_1000009'):
            return True
        if uri == _namespace_SO('SO_1000010'):
            return True
        if uri == _namespace_SO('SO_1000011'):
            return True
        if uri == _namespace_SO('SO_1000012'):
            return True
        if uri == _namespace_SO('SO_1000013'):
            return True
        if uri == _namespace_SO('SO_1000014'):
            return True
        if uri == _namespace_SO('SO_1000015'):
            return True
        if uri == _namespace_SO('SO_1000016'):
            return True
        if uri == _namespace_SO('SO_1000017'):
            return True
        if uri == _namespace_SO('SO_1000018'):
            return True
        if uri == _namespace_SO('SO_1000019'):
            return True
        if uri == _namespace_SO('SO_1000020'):
            return True
        if uri == _namespace_SO('SO_1000021'):
            return True
        if uri == _namespace_SO('SO_1000022'):
            return True
        if uri == _namespace_SO('SO_1000023'):
            return True
        if uri == _namespace_SO('SO_1000024'):
            return True
        if uri == _namespace_SO('SO_1000025'):
            return True
        if uri == _namespace_SO('SO_1000026'):
            return True
        if uri == _namespace_SO('SO_1000027'):
            return True
        if uri == _namespace_SO('SO_1000028'):
            return True
        if uri == _namespace_SO('SO_1000029'):
            return True
        if uri == _namespace_SO('SO_1000030'):
            return True
        if uri == _namespace_SO('SO_1000031'):
            return True
        if uri == _namespace_SO('SO_1000032'):
            return True
        if uri == _namespace_SO('SO_1000035'):
            return True
        if uri == _namespace_SO('SO_1000036'):
            return True
        if uri == _namespace_SO('SO_1000037'):
            return True
        if uri == _namespace_SO('SO_1000038'):
            return True
        if uri == _namespace_SO('SO_1000039'):
            return True
        if uri == _namespace_SO('SO_1000040'):
            return True
        if uri == _namespace_SO('SO_1000041'):
            return True
        if uri == _namespace_SO('SO_1000042'):
            return True
        if uri == _namespace_SO('SO_1000043'):
            return True
        if uri == _namespace_SO('SO_1000044'):
            return True
        if uri == _namespace_SO('SO_1000045'):
            return True
        if uri == _namespace_SO('SO_1000046'):
            return True
        if uri == _namespace_SO('SO_1000047'):
            return True
        if uri == _namespace_SO('SO_1000048'):
            return True
        if uri == _namespace_SO('SO_1000049'):
            return True
        if uri == _namespace_SO('SO_1000050'):
            return True
        if uri == _namespace_SO('SO_1000054'):
            return True
        if uri == _namespace_SO('SO_1000055'):
            return True
        if uri == _namespace_SO('SO_1000056'):
            return True
        if uri == _namespace_SO('SO_1000057'):
            return True
        if uri == _namespace_SO('SO_1000058'):
            return True
        if uri == _namespace_SO('SO_1000059'):
            return True
        if uri == _namespace_SO('SO_1000060'):
            return True
        if uri == _namespace_SO('SO_1000061'):
            return True
        if uri == _namespace_SO('SO_1000062'):
            return True
        if uri == _namespace_SO('SO_1000063'):
            return True
        if uri == _namespace_SO('SO_1000064'):
            return True
        if uri == _namespace_SO('SO_1000065'):
            return True
        if uri == _namespace_SO('SO_1000066'):
            return True
        if uri == _namespace_SO('SO_1000067'):
            return True
        if uri == _namespace_SO('SO_1000068'):
            return True
        if uri == _namespace_SO('SO_1000069'):
            return True
        if uri == _namespace_SO('SO_1000070'):
            return True
        if uri == _namespace_SO('SO_1000071'):
            return True
        if uri == _namespace_SO('SO_1000072'):
            return True
        if uri == _namespace_SO('SO_1000073'):
            return True
        if uri == _namespace_SO('SO_1000074'):
            return True
        if uri == _namespace_SO('SO_1000075'):
            return True
        if uri == _namespace_SO('SO_1000076'):
            return True
        if uri == _namespace_SO('SO_1000078'):
            return True
        if uri == _namespace_SO('SO_1000079'):
            return True
        if uri == _namespace_SO('SO_1000080'):
            return True
        if uri == _namespace_SO('SO_1000081'):
            return True
        if uri == _namespace_SO('SO_1000082'):
            return True
        if uri == _namespace_SO('SO_1000083'):
            return True
        if uri == _namespace_SO('SO_1000084'):
            return True
        if uri == _namespace_SO('SO_1000085'):
            return True
        if uri == _namespace_SO('SO_1000086'):
            return True
        if uri == _namespace_SO('SO_1000087'):
            return True
        if uri == _namespace_SO('SO_1000088'):
            return True
        if uri == _namespace_SO('SO_1000089'):
            return True
        if uri == _namespace_SO('SO_1000092'):
            return True
        if uri == _namespace_SO('SO_1000093'):
            return True
        if uri == _namespace_SO('SO_1000094'):
            return True
        if uri == _namespace_SO('SO_1000095'):
            return True
        if uri == _namespace_SO('SO_1000096'):
            return True
        if uri == _namespace_SO('SO_1000097'):
            return True
        if uri == _namespace_SO('SO_1000098'):
            return True
        if uri == _namespace_SO('SO_1000099'):
            return True
        if uri == _namespace_SO('SO_1000100'):
            return True
        if uri == _namespace_SO('SO_1000101'):
            return True
        if uri == _namespace_SO('SO_1000102'):
            return True
        if uri == _namespace_SO('SO_1000103'):
            return True
        if uri == _namespace_SO('SO_1000104'):
            return True
        if uri == _namespace_SO('SO_1000105'):
            return True
        if uri == _namespace_SO('SO_1000106'):
            return True
        if uri == _namespace_SO('SO_1000107'):
            return True
        if uri == _namespace_SO('SO_1000108'):
            return True
        if uri == _namespace_SO('SO_1000109'):
            return True
        if uri == _namespace_SO('SO_1000110'):
            return True
        if uri == _namespace_SO('SO_1000111'):
            return True
        if uri == _namespace_SO('SO_1000112'):
            return True
        if uri == _namespace_SO('SO_1000115'):
            return True
        if uri == _namespace_SO('SO_1000116'):
            return True
        if uri == _namespace_SO('SO_1000117'):
            return True
        if uri == _namespace_SO('SO_1000118'):
            return True
        if uri == _namespace_SO('SO_1000119'):
            return True
        if uri == _namespace_SO('SO_1000120'):
            return True
        if uri == _namespace_SO('SO_1000121'):
            return True
        if uri == _namespace_SO('SO_1000122'):
            return True
        if uri == _namespace_SO('SO_1000123'):
            return True
        if uri == _namespace_SO('SO_1000124'):
            return True
        if uri == _namespace_SO('SO_1000125'):
            return True
        if uri == _namespace_SO('SO_1000126'):
            return True
        if uri == _namespace_SO('SO_1000127'):
            return True
        if uri == _namespace_SO('SO_1000132'):
            return True
        if uri == _namespace_SO('SO_1000134'):
            return True
        if uri == _namespace_SO('SO_1000136'):
            return True
        if uri == _namespace_SO('SO_1000138'):
            return True
        if uri == _namespace_SO('SO_1000140'):
            return True
        if uri == _namespace_SO('SO_1000141'):
            return True
        if uri == _namespace_SO('SO_1000142'):
            return True
        if uri == _namespace_SO('SO_1000143'):
            return True
        if uri == _namespace_SO('SO_1000144'):
            return True
        if uri == _namespace_SO('SO_1000145'):
            return True
        if uri == _namespace_SO('SO_1000146'):
            return True
        if uri == _namespace_SO('SO_1000147'):
            return True
        if uri == _namespace_SO('SO_1000148'):
            return True
        if uri == _namespace_SO('SO_1000149'):
            return True
        if uri == _namespace_SO('SO_1000150'):
            return True
        if uri == _namespace_SO('SO_1000151'):
            return True
        if uri == _namespace_SO('SO_1000152'):
            return True
        if uri == _namespace_SO('SO_1000153'):
            return True
        if uri == _namespace_SO('SO_1000154'):
            return True
        if uri == _namespace_SO('SO_1000155'):
            return True
        if uri == _namespace_SO('SO_1000156'):
            return True
        if uri == _namespace_SO('SO_1000157'):
            return True
        if uri == _namespace_SO('SO_1000158'):
            return True
        if uri == _namespace_SO('SO_1000159'):
            return True
        if uri == _namespace_SO('SO_1000160'):
            return True
        if uri == _namespace_SO('SO_1000161'):
            return True
        if uri == _namespace_SO('SO_1000162'):
            return True
        if uri == _namespace_SO('SO_1000170'):
            return True
        if uri == _namespace_SO('SO_1000171'):
            return True
        if uri == _namespace_SO('SO_1000173'):
            return True
        if uri == _namespace_SO('SO_1000175'):
            return True
        if uri == _namespace_SO('SO_1000180'):
            return True
        if uri == _namespace_SO('SO_1000181'):
            return True
        if uri == _namespace_SO('SO_1000182'):
            return True
        if uri == _namespace_SO('SO_1000183'):
            return True
        if uri == _namespace_SO('SO_1000184'):
            return True
        if uri == _namespace_SO('SO_1000185'):
            return True
        if uri == _namespace_SO('SO_1000186'):
            return True
        if uri == _namespace_SO('SO_1001186'):
            return True
        if uri == _namespace_SO('SO_1001187'):
            return True
        if uri == _namespace_SO('SO_1001188'):
            return True
        if uri == _namespace_SO('SO_1001189'):
            return True
        if uri == _namespace_SO('SO_1001190'):
            return True
        if uri == _namespace_SO('SO_1001191'):
            return True
        if uri == _namespace_SO('SO_1001192'):
            return True
        if uri == _namespace_SO('SO_1001193'):
            return True
        if uri == _namespace_SO('SO_1001194'):
            return True
        if uri == _namespace_SO('SO_1001195'):
            return True
        if uri == _namespace_SO('SO_1001196'):
            return True
        if uri == _namespace_SO('SO_1001197'):
            return True
        if uri == _namespace_SO('SO_1001217'):
            return True
        if uri == _namespace_SO('SO_1001244'):
            return True
        if uri == _namespace_SO('SO_1001246'):
            return True
        if uri == _namespace_SO('SO_1001247'):
            return True
        if uri == _namespace_SO('SO_1001249'):
            return True
        if uri == _namespace_SO('SO_1001251'):
            return True
        if uri == _namespace_SO('SO_1001254'):
            return True
        if uri == _namespace_SO('SO_1001255'):
            return True
        if uri == _namespace_SO('SO_1001259'):
            return True
        if uri == _namespace_SO('SO_1001260'):
            return True
        if uri == _namespace_SO('SO_1001261'):
            return True
        if uri == _namespace_SO('SO_1001262'):
            return True
        if uri == _namespace_SO('SO_1001263'):
            return True
        if uri == _namespace_SO('SO_1001264'):
            return True
        if uri == _namespace_SO('SO_1001265'):
            return True
        if uri == _namespace_SO('SO_1001266'):
            return True
        if uri == _namespace_SO('SO_1001267'):
            return True
        if uri == _namespace_SO('SO_1001268'):
            return True
        if uri == _namespace_SO('SO_1001269'):
            return True
        if uri == _namespace_SO('SO_1001270'):
            return True
        if uri == _namespace_SO('SO_1001271'):
            return True
        if uri == _namespace_SO('SO_1001272'):
            return True
        if uri == _namespace_SO('SO_1001273'):
            return True
        if uri == _namespace_SO('SO_1001274'):
            return True
        if uri == _namespace_SO('SO_1001275'):
            return True
        if uri == _namespace_SO('SO_1001277'):
            return True
        if uri == _namespace_SO('SO_1001279'):
            return True
        if uri == _namespace_SO('SO_1001280'):
            return True
        if uri == _namespace_SO('SO_1001281'):
            return True
        if uri == _namespace_SO('SO_1001282'):
            return True
        if uri == _namespace_SO('SO_1001283'):
            return True
        if uri == _namespace_SO('SO_1001284'):
            return True
        if uri == _namespace_SO('SO_1001285'):
            return True
        if uri == _namespace_SO('SO_1001286'):
            return True
        if uri == _namespace_SO('SO_1001287'):
            return True
        if uri == _namespace_SO('SO_1001288'):
            return True
        if uri == _namespace_SO('SO_2000061'):
            return True
        if uri == _namespace_SO('SO_3000000'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
        return False

    @classmethod
    def with_parent(cls, uris, parent):
        """Returns only those URIs that fall under a designated parent URI.
        
        uris -- Set of URIs that are tested whether they have the given parent URI.
        parent -- Parent URI.
        """
        return filter(lambda uri: cls.has_parent(uri, parent), uris)

    @classmethod
    def has_parent(cls, uri, parent):
        """Recursively tries to determine the parent for a given URI.
        
        uri -- URI that is tested for whether it has the given parent URI.
        parent -- Parent URI.
        """
        if cls.__parent_properties.has_key(uri):
            if cls.__parent_properties[uri] == parent:
                return True
            return cls.has_parent(cls.__parent_properties[uri], parent)
        return False

__namespace_SO = Namespace('http://purl.obolibrary.org/obo/')

def _namespace_SO(accession):
    return __namespace_SO[accession]

    __parent_properties = { _namespace_SO('SEQUENCE_complete_evidence_for_feature') : _namespace_SO('SEQUENCE_evidence_for_feature') , _namespace_SO('SEQUENCE_has_integral_part') : _namespace_SO('SEQUENCE_has_part') , _namespace_SO('SEQUENCE_homologous_to') : _namespace_SO('SEQUENCE_similar_to') , _namespace_SO('SEQUENCE_integral_part_of') : _namespace_SO('SEQUENCE_part_of') , _namespace_SO('SEQUENCE_member_of') : _namespace_SO('SEQUENCE_part_of') , _namespace_SO('SEQUENCE_non_functional_homolog_of') : _namespace_SO('SEQUENCE_homologous_to') , _namespace_SO('SEQUENCE_orthologous_to') : _namespace_SO('SEQUENCE_homologous_to') , _namespace_SO('SEQUENCE_paralogous_to') : _namespace_SO('SEQUENCE_homologous_to') , _namespace_SO('SEQUENCE_partial_evidence_for_feature') : _namespace_SO('SEQUENCE_evidence_for_feature') , _namespace_SO('SO_0000001') : _namespace_SO('SO_0000110') , _namespace_SO('SO_0000002') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000003') : _namespace_SO('SO_0000002') , _namespace_SO('SO_0000004') : _namespace_SO('SO_0000195') , _namespace_SO('SO_0000005') : _namespace_SO('SO_0000705') , _namespace_SO('SO_0000006') : _namespace_SO('SO_0000695') , _namespace_SO('SO_0000010') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000011') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000012') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000018') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000020') : _namespace_SO('SO_0000715') , _namespace_SO('SO_0000021') : _namespace_SO('SO_0000020') , _namespace_SO('SO_0000022') : _namespace_SO('SO_0000715') , _namespace_SO('SO_0000023') : _namespace_SO('SO_0000021') , _namespace_SO('SO_0000024') : _namespace_SO('SO_0000021') , _namespace_SO('SO_0000025') : _namespace_SO('SO_0000020') , _namespace_SO('SO_0000026') : _namespace_SO('SO_0000715') , _namespace_SO('SO_0000027') : _namespace_SO('SO_0000026') , _namespace_SO('SO_0000028') : _namespace_SO('SO_0000002') , _namespace_SO('SO_0000029') : _namespace_SO('SO_0000028') , _namespace_SO('SO_0000030') : _namespace_SO('SO_0000028') , _namespace_SO('SO_0000031') : _namespace_SO('SO_0000696') , _namespace_SO('SO_0000032') : _namespace_SO('SO_0000031') , _namespace_SO('SO_0000033') : _namespace_SO('SO_0000031') , _namespace_SO('SO_0000036') : _namespace_SO('SO_0000626') , _namespace_SO('SO_0000037') : _namespace_SO('SO_0000727') , _namespace_SO('SO_0000043') : _namespace_SO('SO_0000336') , _namespace_SO('SO_0000044') : _namespace_SO('SO_0001760') , _namespace_SO('SO_0000051') : _namespace_SO('SO_0000696') , _namespace_SO('SO_0000054') : _namespace_SO('SO_1000182') , _namespace_SO('SO_0000055') : _namespace_SO('SO_0000054') , _namespace_SO('SO_0000056') : _namespace_SO('SO_0000054') , _namespace_SO('SO_0000057') : _namespace_SO('SO_0000752') , _namespace_SO('SO_0000059') : _namespace_SO('SO_0001654') , _namespace_SO('SO_0000060') : _namespace_SO('SO_1000042') , _namespace_SO('SO_0000061') : _namespace_SO('SO_0000059') , _namespace_SO('SO_0000063') : _namespace_SO('SO_1000155') , _namespace_SO('SO_0000065') : _namespace_SO('SO_1000183') , _namespace_SO('SO_0000067') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000068') : _namespace_SO('SO_0000067') , _namespace_SO('SO_0000069') : _namespace_SO('SO_0000068') , _namespace_SO('SO_0000070') : _namespace_SO('SO_0000069') , _namespace_SO('SO_0000071') : _namespace_SO('SO_0000069') , _namespace_SO('SO_0000073') : _namespace_SO('SO_0000068') , _namespace_SO('SO_0000074') : _namespace_SO('SO_0000068') , _namespace_SO('SO_0000075') : _namespace_SO('SO_0000068') , _namespace_SO('SO_0000076') : _namespace_SO('SO_0000068') , _namespace_SO('SO_0000077') : _namespace_SO('SO_0000068') , _namespace_SO('SO_0000080') : _namespace_SO('SO_0000081') , _namespace_SO('SO_0000081') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000083') : _namespace_SO('SO_0000736') , _namespace_SO('SO_0000084') : _namespace_SO('SO_0000736') , _namespace_SO('SO_0000101') : _namespace_SO('SO_0001039') , _namespace_SO('SO_0000102') : _namespace_SO('SO_0000347') , _namespace_SO('SO_0000105') : _namespace_SO('SO_0000830') , _namespace_SO('SO_0000107') : _namespace_SO('SO_0000112') , _namespace_SO('SO_0000112') : _namespace_SO('SO_0000441') , _namespace_SO('SO_0000113') : _namespace_SO('SO_0001039') , _namespace_SO('SO_0000114') : _namespace_SO('SO_0000306') , _namespace_SO('SO_0000116') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000119') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000120') : _namespace_SO('SO_0000185') , _namespace_SO('SO_0000122') : _namespace_SO('SO_0000002') , _namespace_SO('SO_0000123') : _namespace_SO('SO_0000119') , _namespace_SO('SO_0000124') : _namespace_SO('SO_0000123') , _namespace_SO('SO_0000125') : _namespace_SO('SO_0000123') , _namespace_SO('SO_0000126') : _namespace_SO('SO_0000123') , _namespace_SO('SO_0000130') : _namespace_SO('SO_0000119') , _namespace_SO('SO_0000131') : _namespace_SO('SO_0000119') , _namespace_SO('SO_0000133') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000134') : _namespace_SO('SO_0000133') , _namespace_SO('SO_0000135') : _namespace_SO('SO_0000134') , _namespace_SO('SO_0000136') : _namespace_SO('SO_0000134') , _namespace_SO('SO_0000137') : _namespace_SO('SO_0000133') , _namespace_SO('SO_0000142') : _namespace_SO('SO_0000002') , _namespace_SO('SO_0000143') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0000145') : _namespace_SO('SO_0000360') , _namespace_SO('SO_0000146') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000147') : _namespace_SO('SO_0000833') , _namespace_SO('SO_0000151') : _namespace_SO('SO_0000695') , _namespace_SO('SO_0000152') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000153') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000154') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000155') : _namespace_SO('SO_0001235') , _namespace_SO('SO_0000156') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000157') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000158') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000159') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000161') : _namespace_SO('SO_0000306') , _namespace_SO('SO_0000162') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0000163') : _namespace_SO('SO_0001419') , _namespace_SO('SO_0000164') : _namespace_SO('SO_0001419') , _namespace_SO('SO_0000165') : _namespace_SO('SO_0000727') , _namespace_SO('SO_0000167') : _namespace_SO('SO_0001055') , _namespace_SO('SO_0000169') : _namespace_SO('SO_0001203') , _namespace_SO('SO_0000170') : _namespace_SO('SO_0001203') , _namespace_SO('SO_0000171') : _namespace_SO('SO_0001203') , _namespace_SO('SO_0000174') : _namespace_SO('SO_0001660') , _namespace_SO('SO_0000177') : _namespace_SO('SO_0000347') , _namespace_SO('SO_0000178') : _namespace_SO('SO_0005855') , _namespace_SO('SO_0000180') : _namespace_SO('SO_0000101') , _namespace_SO('SO_0000181') : _namespace_SO('SO_0000347') , _namespace_SO('SO_0000182') : _namespace_SO('SO_0000101') , _namespace_SO('SO_0000183') : _namespace_SO('SO_0000842') , _namespace_SO('SO_0000184') : _namespace_SO('SO_0000662') , _namespace_SO('SO_0000185') : _namespace_SO('SO_0000673') , _namespace_SO('SO_0000186') : _namespace_SO('SO_0000180') , _namespace_SO('SO_0000188') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0000189') : _namespace_SO('SO_0000180') , _namespace_SO('SO_0000190') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0000191') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0000192') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0000193') : _namespace_SO('SO_0000412') , _namespace_SO('SO_0000194') : _namespace_SO('SO_0000189') , _namespace_SO('SO_0000195') : _namespace_SO('SO_0000147') , _namespace_SO('SO_0000198') : _namespace_SO('SO_0000147') , _namespace_SO('SO_0000199') : _namespace_SO('SO_0001059') , _namespace_SO('SO_0000200') : _namespace_SO('SO_0000195') , _namespace_SO('SO_0000201') : _namespace_SO('SO_0000147') , _namespace_SO('SO_0000202') : _namespace_SO('SO_0000195') , _namespace_SO('SO_0000203') : _namespace_SO('SO_0000836') , _namespace_SO('SO_0000204') : _namespace_SO('SO_0000203') , _namespace_SO('SO_0000205') : _namespace_SO('SO_0000203') , _namespace_SO('SO_0000206') : _namespace_SO('SO_0000189') , _namespace_SO('SO_0000207') : _namespace_SO('SO_0000248') , _namespace_SO('SO_0000208') : _namespace_SO('SO_0000182') , _namespace_SO('SO_0000209') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000210') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000211') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000212') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000213') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000214') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000215') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000216') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000217') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000218') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000219') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000220') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000221') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000222') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000223') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000224') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000225') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000226') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000227') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000228') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000229') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000230') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0000231') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000232') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000234') : _namespace_SO('SO_0000233') , _namespace_SO('SO_0000235') : _namespace_SO('SO_0001679') , _namespace_SO('SO_0000236') : _namespace_SO('SO_0000717') , _namespace_SO('SO_0000237') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000238') : _namespace_SO('SO_0000182') , _namespace_SO('SO_0000239') : _namespace_SO('SO_0001412') , _namespace_SO('SO_0000241') : _namespace_SO('SO_0000203') , _namespace_SO('SO_0000242') : _namespace_SO('SO_0000203') , _namespace_SO('SO_0000243') : _namespace_SO('SO_0000139') , _namespace_SO('SO_0000246') : _namespace_SO('SO_0000863') , _namespace_SO('SO_0000248') : _namespace_SO('SO_1000002') , _namespace_SO('SO_0000250') : _namespace_SO('SO_0001236') , _namespace_SO('SO_0000255') : _namespace_SO('SO_0000209') , _namespace_SO('SO_0000277') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000289') : _namespace_SO('SO_0000005') , _namespace_SO('SO_0000290') : _namespace_SO('SO_0000289') , _namespace_SO('SO_0000291') : _namespace_SO('SO_0000289') , _namespace_SO('SO_0000294') : _namespace_SO('SO_0000657') , _namespace_SO('SO_0000295') : _namespace_SO('SO_0000662') , _namespace_SO('SO_0000297') : _namespace_SO('SO_0000296') , _namespace_SO('SO_0000298') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000299') : _namespace_SO('SO_0000669') , _namespace_SO('SO_0000300') : _namespace_SO('SO_0000299') , _namespace_SO('SO_0000301') : _namespace_SO('SO_0000300') , _namespace_SO('SO_0000302') : _namespace_SO('SO_0000939') , _namespace_SO('SO_0000303') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0000305') : _namespace_SO('SO_0001720') , _namespace_SO('SO_0000306') : _namespace_SO('SO_0000305') , _namespace_SO('SO_0000307') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000312') : _namespace_SO('SO_0000789') , _namespace_SO('SO_0000313') : _namespace_SO('SO_0000122') , _namespace_SO('SO_0000314') : _namespace_SO('SO_0000657') , _namespace_SO('SO_0000315') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0000316') : _namespace_SO('SO_0000836') , _namespace_SO('SO_0000318') : _namespace_SO('SO_0000360') , _namespace_SO('SO_0000319') : _namespace_SO('SO_0000360') , _namespace_SO('SO_0000320') : _namespace_SO('SO_0000841') , _namespace_SO('SO_0000322') : _namespace_SO('SO_0000684') , _namespace_SO('SO_0000323') : _namespace_SO('SO_0000851') , _namespace_SO('SO_0000324') : _namespace_SO('SO_0000696') , _namespace_SO('SO_0000325') : _namespace_SO('SO_0000209') , _namespace_SO('SO_0000326') : _namespace_SO('SO_0000324') , _namespace_SO('SO_0000327') : _namespace_SO('SO_0000851') , _namespace_SO('SO_0000328') : _namespace_SO('SO_0000051') , _namespace_SO('SO_0000330') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0000331') : _namespace_SO('SO_0000324') , _namespace_SO('SO_0000332') : _namespace_SO('SO_0000330') , _namespace_SO('SO_0000334') : _namespace_SO('SO_0000330') , _namespace_SO('SO_0000337') : _namespace_SO('SO_0000442') , _namespace_SO('SO_0000338') : _namespace_SO('SO_0000208') , _namespace_SO('SO_0000339') : _namespace_SO('SO_0000298') , _namespace_SO('SO_0000340') : _namespace_SO('SO_0001235') , _namespace_SO('SO_0000341') : _namespace_SO('SO_0000830') , _namespace_SO('SO_0000342') : _namespace_SO('SO_0000299') , _namespace_SO('SO_0000343') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0000344') : _namespace_SO('SO_0001056') , _namespace_SO('SO_0000346') : _namespace_SO('SO_0000947') , _namespace_SO('SO_0000347') : _namespace_SO('SO_0000343') , _namespace_SO('SO_0000348') : _namespace_SO('SO_0000443') , _namespace_SO('SO_0000349') : _namespace_SO('SO_0000343') , _namespace_SO('SO_0000350') : _namespace_SO('SO_0000948') , _namespace_SO('SO_0000351') : _namespace_SO('SO_0000443') , _namespace_SO('SO_0000352') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0000353') : _namespace_SO('SO_0001248') , _namespace_SO('SO_0000354') : _namespace_SO('SO_0000684') , _namespace_SO('SO_0000355') : _namespace_SO('SO_0000298') , _namespace_SO('SO_0000356') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0000357') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000359') : _namespace_SO('SO_0000357') , _namespace_SO('SO_0000360') : _namespace_SO('SO_0000851') , _namespace_SO('SO_0000361') : _namespace_SO('SO_0000357') , _namespace_SO('SO_0000362') : _namespace_SO('SO_0000790') , _namespace_SO('SO_0000364') : _namespace_SO('SO_0000239') , _namespace_SO('SO_0000365') : _namespace_SO('SO_0001039') , _namespace_SO('SO_0000366') : _namespace_SO('SO_0000699') , _namespace_SO('SO_0000368') : _namespace_SO('SO_0000366') , _namespace_SO('SO_0000370') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000371') : _namespace_SO('SO_0000182') , _namespace_SO('SO_0000375') : _namespace_SO('SO_0000651') , _namespace_SO('SO_0000376') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000377') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000378') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000379') : _namespace_SO('SO_0000378') , _namespace_SO('SO_0000381') : _namespace_SO('SO_0000603') , _namespace_SO('SO_0000382') : _namespace_SO('SO_0000603') , _namespace_SO('SO_0000383') : _namespace_SO('SO_0000644') , _namespace_SO('SO_0000384') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000385') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000386') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000387') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000388') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000389') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000390') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000391') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000392') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000393') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000394') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000395') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000396') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000397') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000398') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000399') : _namespace_SO('SO_0000274') , _namespace_SO('SO_0000401') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000404') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000405') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000406') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0000407') : _namespace_SO('SO_0000650') , _namespace_SO('SO_0000409') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000410') : _namespace_SO('SO_0000409') , _namespace_SO('SO_0000412') : _namespace_SO('SO_0000143') , _namespace_SO('SO_0000413') : _namespace_SO('SO_0000700') , _namespace_SO('SO_0000414') : _namespace_SO('SO_0000790') , _namespace_SO('SO_0000415') : _namespace_SO('SO_0000790') , _namespace_SO('SO_0000416') : _namespace_SO('SO_0000790') , _namespace_SO('SO_0000417') : _namespace_SO('SO_0100021') , _namespace_SO('SO_0000420') : _namespace_SO('SO_0000481') , _namespace_SO('SO_0000421') : _namespace_SO('SO_0000481') , _namespace_SO('SO_0000422') : _namespace_SO('SO_0000848') , _namespace_SO('SO_0000423') : _namespace_SO('SO_0000848') , _namespace_SO('SO_0000424') : _namespace_SO('SO_0000848') , _namespace_SO('SO_0000425') : _namespace_SO('SO_0000286') , _namespace_SO('SO_0000426') : _namespace_SO('SO_0000286') , _namespace_SO('SO_0000427') : _namespace_SO('SO_0000850') , _namespace_SO('SO_0000428') : _namespace_SO('SO_0000850') , _namespace_SO('SO_0000429') : _namespace_SO('SO_0000850') , _namespace_SO('SO_0000430') : _namespace_SO('SO_0000849') , _namespace_SO('SO_0000431') : _namespace_SO('SO_0000849') , _namespace_SO('SO_0000432') : _namespace_SO('SO_0000849') , _namespace_SO('SO_0000436') : _namespace_SO('SO_0000296') , _namespace_SO('SO_0000439') : _namespace_SO('SO_1000045') , _namespace_SO('SO_0000441') : _namespace_SO('SO_0000696') , _namespace_SO('SO_0000442') : _namespace_SO('SO_0000696') , _namespace_SO('SO_0000443') : _namespace_SO('SO_0000400') , _namespace_SO('SO_0000444') : _namespace_SO('SO_0000198') , _namespace_SO('SO_0000445') : _namespace_SO('SO_0000198') , _namespace_SO('SO_0000446') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0000447') : _namespace_SO('SO_0000446') , _namespace_SO('SO_0000448') : _namespace_SO('SO_0000446') , _namespace_SO('SO_0000449') : _namespace_SO('SO_0000351') , _namespace_SO('SO_0000450') : _namespace_SO('SO_0000830') , _namespace_SO('SO_0000453') : _namespace_SO('SO_1000183') , _namespace_SO('SO_0000454') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000457') : _namespace_SO('SO_1000037') , _namespace_SO('SO_0000458') : _namespace_SO('SO_0000460') , _namespace_SO('SO_0000460') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0000461') : _namespace_SO('SO_1000029') , _namespace_SO('SO_0000462') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000463') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0000465') : _namespace_SO('SO_1000038') , _namespace_SO('SO_0000466') : _namespace_SO('SO_0000460') , _namespace_SO('SO_0000467') : _namespace_SO('SO_0000130') , _namespace_SO('SO_0000469') : _namespace_SO('SO_0000130') , _namespace_SO('SO_0000470') : _namespace_SO('SO_0000460') , _namespace_SO('SO_0000471') : _namespace_SO('SO_0000123') , _namespace_SO('SO_0000472') : _namespace_SO('SO_0000353') , _namespace_SO('SO_0000473') : _namespace_SO('SO_0000471') , _namespace_SO('SO_0000475') : _namespace_SO('SO_0000471') , _namespace_SO('SO_0000476') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0000478') : _namespace_SO('SO_0000460') , _namespace_SO('SO_0000480') : _namespace_SO('SO_0000474') , _namespace_SO('SO_0000482') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0000483') : _namespace_SO('SO_0000185') , _namespace_SO('SO_0000492') : _namespace_SO('SO_0000939') , _namespace_SO('SO_0000499') : _namespace_SO('SO_0000353') , _namespace_SO('SO_0000500') : _namespace_SO('SO_0000028') , _namespace_SO('SO_0000501') : _namespace_SO('SO_0000028') , _namespace_SO('SO_0000510') : _namespace_SO('SO_0000936') , _namespace_SO('SO_0000512') : _namespace_SO('SO_1000029') , _namespace_SO('SO_0000538') : _namespace_SO('SO_0000939') , _namespace_SO('SO_0000544') : _namespace_SO('SO_0000182') , _namespace_SO('SO_0000546') : _namespace_SO('SO_0000351') , _namespace_SO('SO_0000547') : _namespace_SO('SO_1000038') , _namespace_SO('SO_0000549') : _namespace_SO('SO_1000038') , _namespace_SO('SO_0000550') : _namespace_SO('SO_1000183') , _namespace_SO('SO_0000551') : _namespace_SO('SO_0001679') , _namespace_SO('SO_0000552') : _namespace_SO('SO_0000139') , _namespace_SO('SO_0000555') : _namespace_SO('SO_0000303') , _namespace_SO('SO_0000556') : _namespace_SO('SO_0000492') , _namespace_SO('SO_0000557') : _namespace_SO('SO_0000303') , _namespace_SO('SO_0000561') : _namespace_SO('SO_0000939') , _namespace_SO('SO_0000562') : _namespace_SO('SO_0000939') , _namespace_SO('SO_0000563') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0000567') : _namespace_SO('SO_0000550') , _namespace_SO('SO_0000568') : _namespace_SO('SO_0000167') , _namespace_SO('SO_0000569') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000570') : _namespace_SO('SO_0000492') , _namespace_SO('SO_0000571') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000572') : _namespace_SO('SO_0000936') , _namespace_SO('SO_0000573') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000574') : _namespace_SO('SO_0000936') , _namespace_SO('SO_0000575') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000576') : _namespace_SO('SO_0000936') , _namespace_SO('SO_0000577') : _namespace_SO('SO_0000628') , _namespace_SO('SO_0000578') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000579') : _namespace_SO('SO_0000833') , _namespace_SO('SO_0000580') : _namespace_SO('SO_0000232') , _namespace_SO('SO_0000581') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000582') : _namespace_SO('SO_0000232') , _namespace_SO('SO_0000583') : _namespace_SO('SO_0000579') , _namespace_SO('SO_0000584') : _namespace_SO('SO_0000370') , _namespace_SO('SO_0000585') : _namespace_SO('SO_0000578') , _namespace_SO('SO_0000586') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000587') : _namespace_SO('SO_0000588') , _namespace_SO('SO_0000589') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000591') : _namespace_SO('SO_0000002') , _namespace_SO('SO_0000592') : _namespace_SO('SO_0000591') , _namespace_SO('SO_0000595') : _namespace_SO('SO_0000232') , _namespace_SO('SO_0000596') : _namespace_SO('SO_0000232') , _namespace_SO('SO_0000602') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000603') : _namespace_SO('SO_0000588') , _namespace_SO('SO_0000604') : _namespace_SO('SO_0000579') , _namespace_SO('SO_0000605') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000606') : _namespace_SO('SO_0000579') , _namespace_SO('SO_0000607') : _namespace_SO('SO_0000579') , _namespace_SO('SO_0000608') : _namespace_SO('SO_0000578') , _namespace_SO('SO_0000611') : _namespace_SO('SO_0000841') , _namespace_SO('SO_0000612') : _namespace_SO('SO_0000841') , _namespace_SO('SO_0000613') : _namespace_SO('SO_0001203') , _namespace_SO('SO_0000614') : _namespace_SO('SO_0000752') , _namespace_SO('SO_0000615') : _namespace_SO('SO_0000951') , _namespace_SO('SO_0000616') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0000617') : _namespace_SO('SO_0000171') , _namespace_SO('SO_0000618') : _namespace_SO('SO_0000171') , _namespace_SO('SO_0000619') : _namespace_SO('SO_0001660') , _namespace_SO('SO_0000621') : _namespace_SO('SO_0000171') , _namespace_SO('SO_0000623') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000624') : _namespace_SO('SO_0000628') , _namespace_SO('SO_0000625') : _namespace_SO('SO_0000727') , _namespace_SO('SO_0000626') : _namespace_SO('SO_0000830') , _namespace_SO('SO_0000627') : _namespace_SO('SO_0001055') , _namespace_SO('SO_0000628') : _namespace_SO('SO_0000830') , _namespace_SO('SO_0000635') : _namespace_SO('SO_0000185') , _namespace_SO('SO_0000638') : _namespace_SO('SO_0000838') , _namespace_SO('SO_0000639') : _namespace_SO('SO_0000638') , _namespace_SO('SO_0000640') : _namespace_SO('SO_0000638') , _namespace_SO('SO_0000641') : _namespace_SO('SO_0000289') , _namespace_SO('SO_0000642') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000643') : _namespace_SO('SO_0000005') , _namespace_SO('SO_0000645') : _namespace_SO('SO_0000185') , _namespace_SO('SO_0000646') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000647') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0000648') : _namespace_SO('SO_0000647') , _namespace_SO('SO_0000649') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000652') : _namespace_SO('SO_0000651') , _namespace_SO('SO_0000653') : _namespace_SO('SO_0000651') , _namespace_SO('SO_0000655') : _namespace_SO('SO_0000233') , _namespace_SO('SO_0000656') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000658') : _namespace_SO('SO_0000657') , _namespace_SO('SO_0000659') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000662') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0000663') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000664') : _namespace_SO('SO_0000830') , _namespace_SO('SO_0000667') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000668') : _namespace_SO('SO_0000102') , _namespace_SO('SO_0000669') : _namespace_SO('SO_0000298') , _namespace_SO('SO_0000670') : _namespace_SO('SO_0000669') , _namespace_SO('SO_0000671') : _namespace_SO('SO_0000669') , _namespace_SO('SO_0000672') : _namespace_SO('SO_0000669') , _namespace_SO('SO_0000673') : _namespace_SO('SO_0000831') , _namespace_SO('SO_0000676') : _namespace_SO('SO_0000164') , _namespace_SO('SO_0000677') : _namespace_SO('SO_0000163') , _namespace_SO('SO_0000678') : _namespace_SO('SO_0000164') , _namespace_SO('SO_0000679') : _namespace_SO('SO_0000163') , _namespace_SO('SO_0000680') : _namespace_SO('SO_0000318') , _namespace_SO('SO_0000681') : _namespace_SO('SO_0000673') , _namespace_SO('SO_0000683') : _namespace_SO('SO_0000344') , _namespace_SO('SO_0000684') : _namespace_SO('SO_0000059') , _namespace_SO('SO_0000685') : _namespace_SO('SO_0000322') , _namespace_SO('SO_0000686') : _namespace_SO('SO_1000044') , _namespace_SO('SO_0000687') : _namespace_SO('SO_0000699') , _namespace_SO('SO_0000688') : _namespace_SO('SO_0000353') , _namespace_SO('SO_0000689') : _namespace_SO('SO_0000102') , _namespace_SO('SO_0000691') : _namespace_SO('SO_0100011') , _namespace_SO('SO_0000694') : _namespace_SO('SO_0001483') , _namespace_SO('SO_0000695') : _namespace_SO('SO_0001409') , _namespace_SO('SO_0000696') : _namespace_SO('SO_0000695') , _namespace_SO('SO_0000699') : _namespace_SO('SO_0000110') , _namespace_SO('SO_0000700') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0000701') : _namespace_SO('SO_0000413') , _namespace_SO('SO_0000702') : _namespace_SO('SO_0000413') , _namespace_SO('SO_0000703') : _namespace_SO('SO_0000700') , _namespace_SO('SO_0000705') : _namespace_SO('SO_0000657') , _namespace_SO('SO_0000706') : _namespace_SO('SO_0001420') , _namespace_SO('SO_0000707') : _namespace_SO('SO_0001420') , _namespace_SO('SO_0000708') : _namespace_SO('SO_0000706') , _namespace_SO('SO_0000709') : _namespace_SO('SO_0000706') , _namespace_SO('SO_0000713') : _namespace_SO('SO_0000714') , _namespace_SO('SO_0000714') : _namespace_SO('SO_0001683') , _namespace_SO('SO_0000715') : _namespace_SO('SO_0000714') , _namespace_SO('SO_0000717') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0000718') : _namespace_SO('SO_0000717') , _namespace_SO('SO_0000719') : _namespace_SO('SO_0001876') , _namespace_SO('SO_0000723') : _namespace_SO('SO_0000298') , _namespace_SO('SO_0000724') : _namespace_SO('SO_0000296') , _namespace_SO('SO_0000725') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0000726') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000728') : _namespace_SO('SO_0100011') , _namespace_SO('SO_0000729') : _namespace_SO('SO_0000010') , _namespace_SO('SO_0000731') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0000732') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0000733') : _namespace_SO('SO_0000400') , _namespace_SO('SO_0000735') : _namespace_SO('SO_0000400') , _namespace_SO('SO_0000736') : _namespace_SO('SO_0000735') , _namespace_SO('SO_0000737') : _namespace_SO('SO_0000736') , _namespace_SO('SO_0000738') : _namespace_SO('SO_0000736') , _namespace_SO('SO_0000739') : _namespace_SO('SO_0000736') , _namespace_SO('SO_0000740') : _namespace_SO('SO_0000736') , _namespace_SO('SO_0000742') : _namespace_SO('SO_0001235') , _namespace_SO('SO_0000743') : _namespace_SO('SO_0000740') , _namespace_SO('SO_0000744') : _namespace_SO('SO_0000740') , _namespace_SO('SO_0000745') : _namespace_SO('SO_0000740') , _namespace_SO('SO_0000746') : _namespace_SO('SO_0000740') , _namespace_SO('SO_0000747') : _namespace_SO('SO_0000740') , _namespace_SO('SO_0000748') : _namespace_SO('SO_0000740') , _namespace_SO('SO_0000749') : _namespace_SO('SO_0000735') , _namespace_SO('SO_0000750') : _namespace_SO('SO_0000296') , _namespace_SO('SO_0000751') : _namespace_SO('SO_0000735') , _namespace_SO('SO_0000754') : _namespace_SO('SO_0000440') , _namespace_SO('SO_0000756') : _namespace_SO('SO_0000352') , _namespace_SO('SO_0000757') : _namespace_SO('SO_0000756') , _namespace_SO('SO_0000758') : _namespace_SO('SO_0000756') , _namespace_SO('SO_0000768') : _namespace_SO('SO_0000155') , _namespace_SO('SO_0000769') : _namespace_SO('SO_0000847') , _namespace_SO('SO_0000770') : _namespace_SO('SO_0000847') , _namespace_SO('SO_0000771') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0000772') : _namespace_SO('SO_0001039') , _namespace_SO('SO_0000773') : _namespace_SO('SO_0000772') , _namespace_SO('SO_0000774') : _namespace_SO('SO_0000772') , _namespace_SO('SO_0000775') : _namespace_SO('SO_0000772') , _namespace_SO('SO_0000776') : _namespace_SO('SO_0000772') , _namespace_SO('SO_0000777') : _namespace_SO('SO_0000462') , _namespace_SO('SO_0000778') : _namespace_SO('SO_0000462') , _namespace_SO('SO_0000781') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000782') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000783') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000784') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000789') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0000790') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0000800') : _namespace_SO('SO_0001504') , _namespace_SO('SO_0000801') : _namespace_SO('SO_0001504') , _namespace_SO('SO_0000802') : _namespace_SO('SO_0001504') , _namespace_SO('SO_0000803') : _namespace_SO('SO_0001504') , _namespace_SO('SO_0000806') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000814') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000815') : _namespace_SO('SO_0000236') , _namespace_SO('SO_0000817') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000834') : _namespace_SO('SO_0000833') , _namespace_SO('SO_0000837') : _namespace_SO('SO_0000836') , _namespace_SO('SO_0000840') : _namespace_SO('SO_0001412') , _namespace_SO('SO_0000856') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000857') : _namespace_SO('SO_0000856') , _namespace_SO('SO_0000858') : _namespace_SO('SO_0000857') , _namespace_SO('SO_0000859') : _namespace_SO('SO_0000857') , _namespace_SO('SO_0000860') : _namespace_SO('SO_0000856') , _namespace_SO('SO_0000863') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000864') : _namespace_SO('SO_0000863') , _namespace_SO('SO_0000865') : _namespace_SO('SO_0000863') , _namespace_SO('SO_0000866') : _namespace_SO('SO_0000865') , _namespace_SO('SO_0000867') : _namespace_SO('SO_0000865') , _namespace_SO('SO_0000868') : _namespace_SO('SO_0000865') , _namespace_SO('SO_0000869') : _namespace_SO('SO_0000865') , _namespace_SO('SO_0000870') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000874') : _namespace_SO('SO_0000873') , _namespace_SO('SO_0000875') : _namespace_SO('SO_0000277') , _namespace_SO('SO_0000876') : _namespace_SO('SO_0000277') , _namespace_SO('SO_0000877') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000878') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000879') : _namespace_SO('SO_0000880') , _namespace_SO('SO_0000880') : _namespace_SO('SO_0000237') , _namespace_SO('SO_0000881') : _namespace_SO('SO_0000863') , _namespace_SO('SO_0000882') : _namespace_SO('SO_0000881') , _namespace_SO('SO_0000883') : _namespace_SO('SO_0000145') , _namespace_SO('SO_0000884') : _namespace_SO('SO_0000883') , _namespace_SO('SO_0000885') : _namespace_SO('SO_0000883') , _namespace_SO('SO_0000886') : _namespace_SO('SO_0000881') , _namespace_SO('SO_0000887') : _namespace_SO('SO_0000881') , _namespace_SO('SO_0000893') : _namespace_SO('SO_0000126') , _namespace_SO('SO_0000894') : _namespace_SO('SO_0000893') , _namespace_SO('SO_0000895') : _namespace_SO('SO_0000894') , _namespace_SO('SO_0000903') : _namespace_SO('SO_0000751') , _namespace_SO('SO_0000904') : _namespace_SO('SO_0000133') , _namespace_SO('SO_0000905') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000906') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0000907') : _namespace_SO('SO_0000732') , _namespace_SO('SO_0000908') : _namespace_SO('SO_0000907') , _namespace_SO('SO_0000909') : _namespace_SO('SO_0000907') , _namespace_SO('SO_0000910') : _namespace_SO('SO_0000732') , _namespace_SO('SO_0000911') : _namespace_SO('SO_0000732') , _namespace_SO('SO_0000912') : _namespace_SO('SO_0001128') , _namespace_SO('SO_0000931') : _namespace_SO('SO_0000930') , _namespace_SO('SO_0000932') : _namespace_SO('SO_0000120') , _namespace_SO('SO_0000933') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000934') : _namespace_SO('SO_0001655') , _namespace_SO('SO_0000936') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0000938') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0000939') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0000940') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000941') : _namespace_SO('SO_0000456') , _namespace_SO('SO_0000943') : _namespace_SO('SO_0000946') , _namespace_SO('SO_0000944') : _namespace_SO('SO_0000946') , _namespace_SO('SO_0000945') : _namespace_SO('SO_0000946') , _namespace_SO('SO_0000946') : _namespace_SO('SO_0000342') , _namespace_SO('SO_0000947') : _namespace_SO('SO_0000342') , _namespace_SO('SO_0000948') : _namespace_SO('SO_0000342') , _namespace_SO('SO_0000949') : _namespace_SO('SO_0000947') , _namespace_SO('SO_0000951') : _namespace_SO('SO_0000141') , _namespace_SO('SO_0000952') : _namespace_SO('SO_0000296') , _namespace_SO('SO_0000953') : _namespace_SO('SO_0000296') , _namespace_SO('SO_0000973') : _namespace_SO('SO_0000208') , _namespace_SO('SO_0000976') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000977') : _namespace_SO('SO_0000833') , _namespace_SO('SO_0000978') : _namespace_SO('SO_0000930') , _namespace_SO('SO_0000979') : _namespace_SO('SO_0000011') , _namespace_SO('SO_0000980') : _namespace_SO('SO_0001235') , _namespace_SO('SO_0000981') : _namespace_SO('SO_0000614') , _namespace_SO('SO_0000982') : _namespace_SO('SO_0000614') , _namespace_SO('SO_0000983') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0000984') : _namespace_SO('SO_0000983') , _namespace_SO('SO_0000985') : _namespace_SO('SO_0000983') , _namespace_SO('SO_0000986') : _namespace_SO('SO_0000443') , _namespace_SO('SO_0000987') : _namespace_SO('SO_0000986') , _namespace_SO('SO_0000988') : _namespace_SO('SO_0000986') , _namespace_SO('SO_0000989') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000990') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0000991') : _namespace_SO('SO_0000352') , _namespace_SO('SO_0000993') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0000998') : _namespace_SO('SO_0001419') , _namespace_SO('SO_0001000') : _namespace_SO('SO_0000650') , _namespace_SO('SO_0001001') : _namespace_SO('SO_0000651') , _namespace_SO('SO_0001002') : _namespace_SO('SO_0000651') , _namespace_SO('SO_0001003') : _namespace_SO('SO_0000286') , _namespace_SO('SO_0001004') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0001006') : _namespace_SO('SO_0000113') , _namespace_SO('SO_0001007') : _namespace_SO('SO_0000772') , _namespace_SO('SO_0001008') : _namespace_SO('SO_0000313') , _namespace_SO('SO_0001009') : _namespace_SO('SO_0000442') , _namespace_SO('SO_0001010') : _namespace_SO('SO_0000142') , _namespace_SO('SO_0001013') : _namespace_SO('SO_1000002') , _namespace_SO('SO_0001015') : _namespace_SO('SO_0000028') , _namespace_SO('SO_0001017') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001018') : _namespace_SO('SO_0000409') , _namespace_SO('SO_0001019') : _namespace_SO('SO_0001059') , _namespace_SO('SO_0001022') : _namespace_SO('SO_0001021') , _namespace_SO('SO_0001025') : _namespace_SO('SO_0001023') , _namespace_SO('SO_0001028') : _namespace_SO('SO_0001507') , _namespace_SO('SO_0001029') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0001030') : _namespace_SO('SO_0001029') , _namespace_SO('SO_0001031') : _namespace_SO('SO_0001029') , _namespace_SO('SO_0001034') : _namespace_SO('SO_0001014') , _namespace_SO('SO_0001035') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0001038') : _namespace_SO('SO_0001037') , _namespace_SO('SO_0001039') : _namespace_SO('SO_0001037') , _namespace_SO('SO_0001041') : _namespace_SO('SO_0001235') , _namespace_SO('SO_0001042') : _namespace_SO('SO_0001041') , _namespace_SO('SO_0001044') : _namespace_SO('SO_0001760') , _namespace_SO('SO_0001045') : _namespace_SO('SO_0001039') , _namespace_SO('SO_0001048') : _namespace_SO('SO_0000342') , _namespace_SO('SO_0001049') : _namespace_SO('SO_0000772') , _namespace_SO('SO_0001055') : _namespace_SO('SO_0001679') , _namespace_SO('SO_0001056') : _namespace_SO('SO_0001679') , _namespace_SO('SO_0001058') : _namespace_SO('SO_0001055') , _namespace_SO('SO_0001059') : _namespace_SO('SO_0000110') , _namespace_SO('SO_0001062') : _namespace_SO('SO_0100011') , _namespace_SO('SO_0001063') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0001064') : _namespace_SO('SO_0000419') , _namespace_SO('SO_0001066') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0001067') : _namespace_SO('SO_0100021') , _namespace_SO('SO_0001068') : _namespace_SO('SO_0100021') , _namespace_SO('SO_0001070') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0001071') : _namespace_SO('SO_0001070') , _namespace_SO('SO_0001073') : _namespace_SO('SO_0001072') , _namespace_SO('SO_0001074') : _namespace_SO('SO_0001072') , _namespace_SO('SO_0001076') : _namespace_SO('SO_0001075') , _namespace_SO('SO_0001077') : _namespace_SO('SO_0001075') , _namespace_SO('SO_0001078') : _namespace_SO('SO_0001070') , _namespace_SO('SO_0001079') : _namespace_SO('SO_0001070') , _namespace_SO('SO_0001080') : _namespace_SO('SO_0001079') , _namespace_SO('SO_0001082') : _namespace_SO('SO_0000700') , _namespace_SO('SO_0001083') : _namespace_SO('SO_0001082') , _namespace_SO('SO_0001084') : _namespace_SO('SO_0001082') , _namespace_SO('SO_0001085') : _namespace_SO('SO_0001082') , _namespace_SO('SO_0001086') : _namespace_SO('SO_0001082') , _namespace_SO('SO_0001089') : _namespace_SO('SO_0100001') , _namespace_SO('SO_0001092') : _namespace_SO('SO_0100002') , _namespace_SO('SO_0001093') : _namespace_SO('SO_0100002') , _namespace_SO('SO_0001094') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001095') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001096') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001097') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001098') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001099') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001100') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001101') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001102') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001103') : _namespace_SO('SO_0001092') , _namespace_SO('SO_0001105') : _namespace_SO('SO_0100002') , _namespace_SO('SO_0001106') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001107') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001108') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001109') : _namespace_SO('SO_0001108') , _namespace_SO('SO_0001110') : _namespace_SO('SO_0001108') , _namespace_SO('SO_0001111') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001112') : _namespace_SO('SO_0001111') , _namespace_SO('SO_0001113') : _namespace_SO('SO_0001111') , _namespace_SO('SO_0001114') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001115') : _namespace_SO('SO_0001114') , _namespace_SO('SO_0001116') : _namespace_SO('SO_0001114') , _namespace_SO('SO_0001117') : _namespace_SO('SO_0001116') , _namespace_SO('SO_0001118') : _namespace_SO('SO_0001116') , _namespace_SO('SO_0001119') : _namespace_SO('SO_0001116') , _namespace_SO('SO_0001120') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001121') : _namespace_SO('SO_0001120') , _namespace_SO('SO_0001122') : _namespace_SO('SO_0001120') , _namespace_SO('SO_0001123') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001124') : _namespace_SO('SO_0001123') , _namespace_SO('SO_0001125') : _namespace_SO('SO_0001123') , _namespace_SO('SO_0001126') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001127') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001128') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0001129') : _namespace_SO('SO_0000912') , _namespace_SO('SO_0001130') : _namespace_SO('SO_0000912') , _namespace_SO('SO_0001131') : _namespace_SO('SO_0000912') , _namespace_SO('SO_0001132') : _namespace_SO('SO_0000912') , _namespace_SO('SO_0001133') : _namespace_SO('SO_0001128') , _namespace_SO('SO_0001134') : _namespace_SO('SO_0001133') , _namespace_SO('SO_0001135') : _namespace_SO('SO_0001133') , _namespace_SO('SO_0001136') : _namespace_SO('SO_0001133') , _namespace_SO('SO_0001137') : _namespace_SO('SO_0001133') , _namespace_SO('SO_0001138') : _namespace_SO('SO_0001128') , _namespace_SO('SO_0001139') : _namespace_SO('SO_0001138') , _namespace_SO('SO_0001140') : _namespace_SO('SO_0001138') , _namespace_SO('SO_0001141') : _namespace_SO('SO_0001128') , _namespace_SO('SO_0001142') : _namespace_SO('SO_0001141') , _namespace_SO('SO_0001143') : _namespace_SO('SO_0001141') , _namespace_SO('SO_0001144') : _namespace_SO('SO_0001141') , _namespace_SO('SO_0001145') : _namespace_SO('SO_0001141') , _namespace_SO('SO_0001146') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0001147') : _namespace_SO('SO_0001146') , _namespace_SO('SO_0001148') : _namespace_SO('SO_0001146') , _namespace_SO('SO_0001149') : _namespace_SO('SO_0001146') , _namespace_SO('SO_0001150') : _namespace_SO('SO_0001133') , _namespace_SO('SO_0001151') : _namespace_SO('SO_0001150') , _namespace_SO('SO_0001152') : _namespace_SO('SO_0001151') , _namespace_SO('SO_0001153') : _namespace_SO('SO_0001151') , _namespace_SO('SO_0001154') : _namespace_SO('SO_0001150') , _namespace_SO('SO_0001155') : _namespace_SO('SO_0001133') , _namespace_SO('SO_0001157') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001169') : _namespace_SO('SO_0001041') , _namespace_SO('SO_0001170') : _namespace_SO('SO_0000208') , _namespace_SO('SO_0001171') : _namespace_SO('SO_0000651') , _namespace_SO('SO_0001173') : _namespace_SO('SO_0001172') , _namespace_SO('SO_0001175') : _namespace_SO('SO_0001172') , _namespace_SO('SO_0001176') : _namespace_SO('SO_0001172') , _namespace_SO('SO_0001177') : _namespace_SO('SO_0001172') , _namespace_SO('SO_0001178') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0001179') : _namespace_SO('SO_0000593') , _namespace_SO('SO_0001183') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0001184') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0001185') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0001186') : _namespace_SO('SO_0001185') , _namespace_SO('SO_0001187') : _namespace_SO('SO_0000594') , _namespace_SO('SO_0001188') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0001190') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0001192') : _namespace_SO('SO_0000348') , _namespace_SO('SO_0001194') : _namespace_SO('SO_0001192') , _namespace_SO('SO_0001196') : _namespace_SO('SO_0001192') , _namespace_SO('SO_0001198') : _namespace_SO('SO_0001041') , _namespace_SO('SO_0001199') : _namespace_SO('SO_0001041') , _namespace_SO('SO_0001200') : _namespace_SO('SO_0001199') , _namespace_SO('SO_0001201') : _namespace_SO('SO_0001199') , _namespace_SO('SO_0001202') : _namespace_SO('SO_0001199') , _namespace_SO('SO_0001203') : _namespace_SO('SO_0000167') , _namespace_SO('SO_0001204') : _namespace_SO('SO_0001203') , _namespace_SO('SO_0001205') : _namespace_SO('SO_0001204') , _namespace_SO('SO_0001206') : _namespace_SO('SO_0001204') , _namespace_SO('SO_0001207') : _namespace_SO('SO_0001204') , _namespace_SO('SO_0001208') : _namespace_SO('SO_0000345') , _namespace_SO('SO_0001209') : _namespace_SO('SO_0000345') , _namespace_SO('SO_0001210') : _namespace_SO('SO_0000836') , _namespace_SO('SO_0001211') : _namespace_SO('SO_0001210') , _namespace_SO('SO_0001212') : _namespace_SO('SO_0001210') , _namespace_SO('SO_0001213') : _namespace_SO('SO_0000588') , _namespace_SO('SO_0001214') : _namespace_SO('SO_0000852') , _namespace_SO('SO_0001215') : _namespace_SO('SO_0000852') , _namespace_SO('SO_0001216') : _namespace_SO('SO_0000188') , _namespace_SO('SO_0001220') : _namespace_SO('SO_0000893') , _namespace_SO('SO_0001221') : _namespace_SO('SO_0000893') , _namespace_SO('SO_0001222') : _namespace_SO('SO_0001221') , _namespace_SO('SO_0001223') : _namespace_SO('SO_0001221') , _namespace_SO('SO_0001228') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001229') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001230') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001231') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001232') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001233') : _namespace_SO('SO_0001274') , _namespace_SO('SO_0001234') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0001235') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0001236') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0001238') : _namespace_SO('SO_0000315') , _namespace_SO('SO_0001239') : _namespace_SO('SO_0000315') , _namespace_SO('SO_0001241') : _namespace_SO('SO_0000401') , _namespace_SO('SO_0001243') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0001247') : _namespace_SO('SO_0000696') , _namespace_SO('SO_0001248') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0001249') : _namespace_SO('SO_0001248') , _namespace_SO('SO_0001253') : _namespace_SO('SO_0000143') , _namespace_SO('SO_0001254') : _namespace_SO('SO_1000182') , _namespace_SO('SO_0001255') : _namespace_SO('SO_0001254') , _namespace_SO('SO_0001256') : _namespace_SO('SO_0001254') , _namespace_SO('SO_0001257') : _namespace_SO('SO_0000059') , _namespace_SO('SO_0001261') : _namespace_SO('SO_0000703') , _namespace_SO('SO_0001263') : _namespace_SO('SO_0000704') , _namespace_SO('SO_0001273') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001274') : _namespace_SO('SO_0001230') , _namespace_SO('SO_0001275') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001276') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001277') : _namespace_SO('SO_0000250') , _namespace_SO('SO_0001278') : _namespace_SO('SO_0001274') , _namespace_SO('SO_0001279') : _namespace_SO('SO_0001274') , _namespace_SO('SO_0001280') : _namespace_SO('SO_0001274') , _namespace_SO('SO_0001281') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001282') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001283') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001284') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001285') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001286') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001287') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001288') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001289') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001290') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001291') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001292') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001293') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001294') : _namespace_SO('SO_0001275') , _namespace_SO('SO_0001295') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001296') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001297') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001298') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001299') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001300') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001301') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001302') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001303') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001304') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001305') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001306') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001307') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001308') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001309') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001310') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001311') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001312') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001313') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001314') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001315') : _namespace_SO('SO_0001273') , _namespace_SO('SO_0001316') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001317') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001318') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001319') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001320') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001321') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001322') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001323') : _namespace_SO('SO_0001316') , _namespace_SO('SO_0001324') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001325') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001326') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001327') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001328') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001329') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001330') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001331') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001332') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001333') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001334') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001335') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001336') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001337') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001338') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001339') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001340') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001341') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001342') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001343') : _namespace_SO('SO_0001276') , _namespace_SO('SO_0001344') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001345') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001346') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001347') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001348') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001349') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001350') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001351') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001352') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001353') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001354') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001355') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001356') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001357') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001358') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001359') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001360') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001361') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001362') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001363') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001364') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001365') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001366') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001367') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001368') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001369') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001370') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001371') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001372') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001373') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001374') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001375') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001376') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001377') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001378') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001379') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001380') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001381') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001382') : _namespace_SO('SO_0001277') , _namespace_SO('SO_0001383') : _namespace_SO('SO_0001654') , _namespace_SO('SO_0001385') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001386') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001387') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001388') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001389') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001390') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001391') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001392') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001393') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001394') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001395') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001396') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001397') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001398') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001399') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001400') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001401') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001402') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001403') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001404') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001405') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001406') : _namespace_SO('SO_0001385') , _namespace_SO('SO_0001407') : _namespace_SO('SO_0000443') , _namespace_SO('SO_0001408') : _namespace_SO('SO_0100011') , _namespace_SO('SO_0001409') : _namespace_SO('SO_0000001') , _namespace_SO('SO_0001410') : _namespace_SO('SO_0000001') , _namespace_SO('SO_0001411') : _namespace_SO('SO_0000001') , _namespace_SO('SO_0001412') : _namespace_SO('SO_0000001') , _namespace_SO('SO_0001413') : _namespace_SO('SO_0001021') , _namespace_SO('SO_0001414') : _namespace_SO('SO_0001021') , _namespace_SO('SO_0001415') : _namespace_SO('SO_0001021') , _namespace_SO('SO_0001416') : _namespace_SO('SO_0000239') , _namespace_SO('SO_0001417') : _namespace_SO('SO_0000239') , _namespace_SO('SO_0001418') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0001419') : _namespace_SO('SO_0000162') , _namespace_SO('SO_0001420') : _namespace_SO('SO_0000162') , _namespace_SO('SO_0001421') : _namespace_SO('SO_0000699') , _namespace_SO('SO_0001422') : _namespace_SO('SO_0100001') , _namespace_SO('SO_0001423') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0001424') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0001425') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0001426') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0001427') : _namespace_SO('SO_0001679') , _namespace_SO('SO_0001428') : _namespace_SO('SO_0000353') , _namespace_SO('SO_0001429') : _namespace_SO('SO_0001655') , _namespace_SO('SO_0001433') : _namespace_SO('SO_0000317') , _namespace_SO('SO_0001434') : _namespace_SO('SO_0001760') , _namespace_SO('SO_0001435') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001436') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001437') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001438') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001439') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001440') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001441') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001442') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001443') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001444') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001445') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001446') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001447') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001448') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001449') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001450') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001451') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001452') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001453') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001454') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001455') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001456') : _namespace_SO('SO_0001237') , _namespace_SO('SO_0001458') : _namespace_SO('SO_0001457') , _namespace_SO('SO_0001459') : _namespace_SO('SO_0000314') , _namespace_SO('SO_0001463') : _namespace_SO('SO_0001877') , _namespace_SO('SO_0001464') : _namespace_SO('SO_0000345') , _namespace_SO('SO_0001465') : _namespace_SO('SO_0001464') , _namespace_SO('SO_0001466') : _namespace_SO('SO_0001464') , _namespace_SO('SO_0001467') : _namespace_SO('SO_0000345') , _namespace_SO('SO_0001468') : _namespace_SO('SO_0001467') , _namespace_SO('SO_0001469') : _namespace_SO('SO_0001467') , _namespace_SO('SO_0001470') : _namespace_SO('SO_0000102') , _namespace_SO('SO_0001471') : _namespace_SO('SO_0000102') , _namespace_SO('SO_0001472') : _namespace_SO('SO_0000347') , _namespace_SO('SO_0001473') : _namespace_SO('SO_0001243') , _namespace_SO('SO_0001474') : _namespace_SO('SO_0000699') , _namespace_SO('SO_0001475') : _namespace_SO('SO_0000835') , _namespace_SO('SO_0001477') : _namespace_SO('SO_0000637') , _namespace_SO('SO_0001478') : _namespace_SO('SO_0000637') , _namespace_SO('SO_0001479') : _namespace_SO('SO_0000637') , _namespace_SO('SO_0001481') : _namespace_SO('SO_0000006') , _namespace_SO('SO_0001482') : _namespace_SO('SO_0000165') , _namespace_SO('SO_0001483') : _namespace_SO('SO_1000002') , _namespace_SO('SO_0001486') : _namespace_SO('SO_0001499') , _namespace_SO('SO_0001487') : _namespace_SO('SO_0001499') , _namespace_SO('SO_0001488') : _namespace_SO('SO_0001499') , _namespace_SO('SO_0001489') : _namespace_SO('SO_0001499') , _namespace_SO('SO_0001490') : _namespace_SO('SO_0001499') , _namespace_SO('SO_0001491') : _namespace_SO('SO_0001499') , _namespace_SO('SO_0001499') : _namespace_SO('SO_0000905') , _namespace_SO('SO_0001500') : _namespace_SO('SO_0001645') , _namespace_SO('SO_0001502') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0001503') : _namespace_SO('SO_0000673') , _namespace_SO('SO_0001504') : _namespace_SO('SO_0000240') , _namespace_SO('SO_0001505') : _namespace_SO('SO_0001026') , _namespace_SO('SO_0001506') : _namespace_SO('SO_0001026') , _namespace_SO('SO_0001508') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0001509') : _namespace_SO('SO_0001508') , _namespace_SO('SO_0001510') : _namespace_SO('SO_0001509') , _namespace_SO('SO_0001511') : _namespace_SO('SO_0001509') , _namespace_SO('SO_0001512') : _namespace_SO('SO_0001508') , _namespace_SO('SO_0001513') : _namespace_SO('SO_0001512') , _namespace_SO('SO_0001514') : _namespace_SO('SO_0001512') , _namespace_SO('SO_0001515') : _namespace_SO('SO_0001512') , _namespace_SO('SO_0001516') : _namespace_SO('SO_0001523') , _namespace_SO('SO_0001517') : _namespace_SO('SO_0001508') , _namespace_SO('SO_0001518') : _namespace_SO('SO_0001517') , _namespace_SO('SO_0001519') : _namespace_SO('SO_0001517') , _namespace_SO('SO_0001520') : _namespace_SO('SO_0001508') , _namespace_SO('SO_0001521') : _namespace_SO('SO_0001520') , _namespace_SO('SO_0001522') : _namespace_SO('SO_0001520') , _namespace_SO('SO_0001523') : _namespace_SO('SO_0001508') , _namespace_SO('SO_0001524') : _namespace_SO('SO_0001506') , _namespace_SO('SO_0001525') : _namespace_SO('SO_0000413') , _namespace_SO('SO_0001526') : _namespace_SO('SO_0000413') , _namespace_SO('SO_0001527') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0001528') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001529') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001530') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001531') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001532') : _namespace_SO('SO_0000299') , _namespace_SO('SO_0001533') : _namespace_SO('SO_0000162') , _namespace_SO('SO_0001534') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001535') : _namespace_SO('SO_0000182') , _namespace_SO('SO_0001536') : _namespace_SO('SO_0001060') , _namespace_SO('SO_0001537') : _namespace_SO('SO_0001060') , _namespace_SO('SO_0001538') : _namespace_SO('SO_0001536') , _namespace_SO('SO_0001539') : _namespace_SO('SO_0001536') , _namespace_SO('SO_0001540') : _namespace_SO('SO_0001538') , _namespace_SO('SO_0001541') : _namespace_SO('SO_0001540') , _namespace_SO('SO_0001542') : _namespace_SO('SO_0001540') , _namespace_SO('SO_0001543') : _namespace_SO('SO_0001538') , _namespace_SO('SO_0001544') : _namespace_SO('SO_0001543') , _namespace_SO('SO_0001545') : _namespace_SO('SO_0001543') , _namespace_SO('SO_0001546') : _namespace_SO('SO_0001538') , _namespace_SO('SO_0001547') : _namespace_SO('SO_0001546') , _namespace_SO('SO_0001548') : _namespace_SO('SO_0001546') , _namespace_SO('SO_0001549') : _namespace_SO('SO_0001538') , _namespace_SO('SO_0001550') : _namespace_SO('SO_0001549') , _namespace_SO('SO_0001551') : _namespace_SO('SO_0001550') , _namespace_SO('SO_0001552') : _namespace_SO('SO_0001550') , _namespace_SO('SO_0001553') : _namespace_SO('SO_0001539') , _namespace_SO('SO_0001554') : _namespace_SO('SO_0001539') , _namespace_SO('SO_0001555') : _namespace_SO('SO_0001553') , _namespace_SO('SO_0001556') : _namespace_SO('SO_0001553') , _namespace_SO('SO_0001557') : _namespace_SO('SO_0001554') , _namespace_SO('SO_0001558') : _namespace_SO('SO_0001554') , _namespace_SO('SO_0001559') : _namespace_SO('SO_0001554') , _namespace_SO('SO_0001560') : _namespace_SO('SO_0001559') , _namespace_SO('SO_0001561') : _namespace_SO('SO_0001559') , _namespace_SO('SO_0001562') : _namespace_SO('SO_0001554') , _namespace_SO('SO_0001563') : _namespace_SO('SO_0001537') , _namespace_SO('SO_0001564') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001565') : _namespace_SO('SO_0001564') , _namespace_SO('SO_0001566') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001567') : _namespace_SO('SO_0001819') , _namespace_SO('SO_0001568') : _namespace_SO('SO_0001564') , _namespace_SO('SO_0001569') : _namespace_SO('SO_0001568') , _namespace_SO('SO_0001570') : _namespace_SO('SO_0001569') , _namespace_SO('SO_0001571') : _namespace_SO('SO_0001569') , _namespace_SO('SO_0001572') : _namespace_SO('SO_0001568') , _namespace_SO('SO_0001573') : _namespace_SO('SO_0001568') , _namespace_SO('SO_0001574') : _namespace_SO('SO_0001629') , _namespace_SO('SO_0001575') : _namespace_SO('SO_0001629') , _namespace_SO('SO_0001576') : _namespace_SO('SO_0001564') , _namespace_SO('SO_0001577') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001578') : _namespace_SO('SO_0001907') , _namespace_SO('SO_0001580') : _namespace_SO('SO_0001791') , _namespace_SO('SO_0001582') : _namespace_SO('SO_0001650') , _namespace_SO('SO_0001583') : _namespace_SO('SO_0001650') , _namespace_SO('SO_0001585') : _namespace_SO('SO_0001583') , _namespace_SO('SO_0001586') : _namespace_SO('SO_0001583') , _namespace_SO('SO_0001587') : _namespace_SO('SO_0001906') , _namespace_SO('SO_0001589') : _namespace_SO('SO_0001818') , _namespace_SO('SO_0001590') : _namespace_SO('SO_0001580') , _namespace_SO('SO_0001591') : _namespace_SO('SO_0001589') , _namespace_SO('SO_0001592') : _namespace_SO('SO_0001589') , _namespace_SO('SO_0001593') : _namespace_SO('SO_0001589') , _namespace_SO('SO_0001594') : _namespace_SO('SO_0001589') , _namespace_SO('SO_0001595') : _namespace_SO('SO_0001589') , _namespace_SO('SO_0001596') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001597') : _namespace_SO('SO_0001596') , _namespace_SO('SO_0001598') : _namespace_SO('SO_0001564') , _namespace_SO('SO_0001599') : _namespace_SO('SO_0001598') , _namespace_SO('SO_0001600') : _namespace_SO('SO_0001599') , _namespace_SO('SO_0001601') : _namespace_SO('SO_0001599') , _namespace_SO('SO_0001602') : _namespace_SO('SO_0001598') , _namespace_SO('SO_0001603') : _namespace_SO('SO_0001598') , _namespace_SO('SO_0001604') : _namespace_SO('SO_0001603') , _namespace_SO('SO_0001605') : _namespace_SO('SO_0001603') , _namespace_SO('SO_0001606') : _namespace_SO('SO_0001603') , _namespace_SO('SO_0001607') : _namespace_SO('SO_0001606') , _namespace_SO('SO_0001608') : _namespace_SO('SO_0001606') , _namespace_SO('SO_0001609') : _namespace_SO('SO_0001603') , _namespace_SO('SO_0001610') : _namespace_SO('SO_0001609') , _namespace_SO('SO_0001611') : _namespace_SO('SO_0001609') , _namespace_SO('SO_0001612') : _namespace_SO('SO_0001610') , _namespace_SO('SO_0001613') : _namespace_SO('SO_0001610') , _namespace_SO('SO_0001614') : _namespace_SO('SO_0001611') , _namespace_SO('SO_0001615') : _namespace_SO('SO_0001611') , _namespace_SO('SO_0001616') : _namespace_SO('SO_0001603') , _namespace_SO('SO_0001617') : _namespace_SO('SO_0001603') , _namespace_SO('SO_0001618') : _namespace_SO('SO_0001560') , _namespace_SO('SO_0001619') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001620') : _namespace_SO('SO_0001619') , _namespace_SO('SO_0001621') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001622') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001623') : _namespace_SO('SO_0001622') , _namespace_SO('SO_0001624') : _namespace_SO('SO_0001622') , _namespace_SO('SO_0001626') : _namespace_SO('SO_0001650') , _namespace_SO('SO_0001627') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001628') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001629') : _namespace_SO('SO_0001627') , _namespace_SO('SO_0001630') : _namespace_SO('SO_0001568') , _namespace_SO('SO_0001631') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001632') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001633') : _namespace_SO('SO_0001632') , _namespace_SO('SO_0001634') : _namespace_SO('SO_0001633') , _namespace_SO('SO_0001635') : _namespace_SO('SO_0001631') , _namespace_SO('SO_0001636') : _namespace_SO('SO_0001635') , _namespace_SO('SO_0001637') : _namespace_SO('SO_0001263') , _namespace_SO('SO_0001638') : _namespace_SO('SO_0001263') , _namespace_SO('SO_0001639') : _namespace_SO('SO_0001263') , _namespace_SO('SO_0001640') : _namespace_SO('SO_0001263') , _namespace_SO('SO_0001641') : _namespace_SO('SO_0001263') , _namespace_SO('SO_0001642') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0001643') : _namespace_SO('SO_0001263') , _namespace_SO('SO_0001645') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0001646') : _namespace_SO('SO_0001645') , _namespace_SO('SO_0001647') : _namespace_SO('SO_0000139') , _namespace_SO('SO_0001648') : _namespace_SO('SO_0000101') , _namespace_SO('SO_0001649') : _namespace_SO('SO_0000657') , _namespace_SO('SO_0001650') : _namespace_SO('SO_0001818') , _namespace_SO('SO_0001654') : _namespace_SO('SO_0000410') , _namespace_SO('SO_0001655') : _namespace_SO('SO_0000409') , _namespace_SO('SO_0001656') : _namespace_SO('SO_0000409') , _namespace_SO('SO_0001657') : _namespace_SO('SO_0000409') , _namespace_SO('SO_0001658') : _namespace_SO('SO_0001649') , _namespace_SO('SO_0001660') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001668') : _namespace_SO('SO_0001678') , _namespace_SO('SO_0001669') : _namespace_SO('SO_0000170') , _namespace_SO('SO_0001670') : _namespace_SO('SO_0001678') , _namespace_SO('SO_0001671') : _namespace_SO('SO_0000613') , _namespace_SO('SO_0001672') : _namespace_SO('SO_0000613') , _namespace_SO('SO_0001678') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001679') : _namespace_SO('SO_0005836') , _namespace_SO('SO_0001680') : _namespace_SO('SO_0005836') , _namespace_SO('SO_0001681') : _namespace_SO('SO_0005836') , _namespace_SO('SO_0001682') : _namespace_SO('SO_0005836') , _namespace_SO('SO_0001683') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0001684') : _namespace_SO('SO_0000733') , _namespace_SO('SO_0001685') : _namespace_SO('SO_0001684') , _namespace_SO('SO_0001686') : _namespace_SO('SO_0001684') , _namespace_SO('SO_0001687') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0001688') : _namespace_SO('SO_0000699') , _namespace_SO('SO_0001691') : _namespace_SO('SO_0001687') , _namespace_SO('SO_0001692') : _namespace_SO('SO_0001687') , _namespace_SO('SO_0001694') : _namespace_SO('SO_0001688') , _namespace_SO('SO_0001696') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0001698') : _namespace_SO('SO_0000112') , _namespace_SO('SO_0001699') : _namespace_SO('SO_0000112') , _namespace_SO('SO_0001701') : _namespace_SO('SO_0001700') , _namespace_SO('SO_0001702') : _namespace_SO('SO_0001700') , _namespace_SO('SO_0001703') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001704') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001705') : _namespace_SO('SO_0001734') , _namespace_SO('SO_0001706') : _namespace_SO('SO_0001734') , _namespace_SO('SO_0001707') : _namespace_SO('SO_0001736') , _namespace_SO('SO_0001708') : _namespace_SO('SO_0001732') , _namespace_SO('SO_0001709') : _namespace_SO('SO_0001732') , _namespace_SO('SO_0001710') : _namespace_SO('SO_0001735') , _namespace_SO('SO_0001711') : _namespace_SO('SO_0001735') , _namespace_SO('SO_0001712') : _namespace_SO('SO_0001735') , _namespace_SO('SO_0001713') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001714') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001715') : _namespace_SO('SO_0001055') , _namespace_SO('SO_0001716') : _namespace_SO('SO_0001700') , _namespace_SO('SO_0001717') : _namespace_SO('SO_0001716') , _namespace_SO('SO_0001718') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001719') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001721') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001722') : _namespace_SO('SO_0001733') , _namespace_SO('SO_0001723') : _namespace_SO('SO_0001733') , _namespace_SO('SO_0001724') : _namespace_SO('SO_0001733') , _namespace_SO('SO_0001725') : _namespace_SO('SO_0001734') , _namespace_SO('SO_0001726') : _namespace_SO('SO_0001732') , _namespace_SO('SO_0001727') : _namespace_SO('SO_0001736') , _namespace_SO('SO_0001728') : _namespace_SO('SO_0001736') , _namespace_SO('SO_0001729') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001730') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001731') : _namespace_SO('SO_0001702') , _namespace_SO('SO_0001732') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001733') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001734') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001735') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001736') : _namespace_SO('SO_0001701') , _namespace_SO('SO_0001737') : _namespace_SO('SO_0001700') , _namespace_SO('SO_0001738') : _namespace_SO('SO_0001737') , _namespace_SO('SO_0001740') : _namespace_SO('SO_0001739') , _namespace_SO('SO_0001741') : _namespace_SO('SO_3000000') , _namespace_SO('SO_0001742') : _namespace_SO('SO_0001019') , _namespace_SO('SO_0001743') : _namespace_SO('SO_0001019') , _namespace_SO('SO_0001744') : _namespace_SO('SO_0001059') , _namespace_SO('SO_0001745') : _namespace_SO('SO_0001744') , _namespace_SO('SO_0001746') : _namespace_SO('SO_0001744') , _namespace_SO('SO_0001747') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0001748') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001749') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001750') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001751') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001752') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001753') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001754') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001755') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001756') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001757') : _namespace_SO('SO_0000709') , _namespace_SO('SO_0001758') : _namespace_SO('SO_0001760') , _namespace_SO('SO_0001759') : _namespace_SO('SO_0001760') , _namespace_SO('SO_0001760') : _namespace_SO('SO_0000336') , _namespace_SO('SO_0001761') : _namespace_SO('SO_0000400') , _namespace_SO('SO_0001762') : _namespace_SO('SO_0001761') , _namespace_SO('SO_0001763') : _namespace_SO('SO_0001761') , _namespace_SO('SO_0001764') : _namespace_SO('SO_0001763') , _namespace_SO('SO_0001765') : _namespace_SO('SO_0001763') , _namespace_SO('SO_0001766') : _namespace_SO('SO_0001763') , _namespace_SO('SO_0001767') : _namespace_SO('SO_0001763') , _namespace_SO('SO_0001768') : _namespace_SO('SO_0001763') , _namespace_SO('SO_0001769') : _namespace_SO('SO_0001761') , _namespace_SO('SO_0001770') : _namespace_SO('SO_0001769') , _namespace_SO('SO_0001771') : _namespace_SO('SO_0001769') , _namespace_SO('SO_0001772') : _namespace_SO('SO_0001769') , _namespace_SO('SO_0001773') : _namespace_SO('SO_0001769') , _namespace_SO('SO_0001774') : _namespace_SO('SO_0001769') , _namespace_SO('SO_0001775') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001776') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001777') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001778') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001779') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001780') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001781') : _namespace_SO('SO_0001762') , _namespace_SO('SO_0001782') : _namespace_SO('SO_0001566') , _namespace_SO('SO_0001784') : _namespace_SO('SO_0001785') , _namespace_SO('SO_0001785') : _namespace_SO('SO_0001059') , _namespace_SO('SO_0001786') : _namespace_SO('SO_0001536') , _namespace_SO('SO_0001787') : _namespace_SO('SO_0001629') , _namespace_SO('SO_0001789') : _namespace_SO('SO_0005855') , _namespace_SO('SO_0001790') : _namespace_SO('SO_0000143') , _namespace_SO('SO_0001791') : _namespace_SO('SO_0001576') , _namespace_SO('SO_0001792') : _namespace_SO('SO_0001791') , _namespace_SO('SO_0001794') : _namespace_SO('SO_0000577') , _namespace_SO('SO_0001795') : _namespace_SO('SO_0000577') , _namespace_SO('SO_0001797') : _namespace_SO('SO_0000657') , _namespace_SO('SO_0001801') : _namespace_SO('SO_0000483') , _namespace_SO('SO_0001802') : _namespace_SO('SO_0001545') , _namespace_SO('SO_0001803') : _namespace_SO('SO_0001545') , _namespace_SO('SO_0001804') : _namespace_SO('SO_0001093') , _namespace_SO('SO_0001805') : _namespace_SO('SO_0100017') , _namespace_SO('SO_0001806') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001807') : _namespace_SO('SO_0100017') , _namespace_SO('SO_0001808') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001809') : _namespace_SO('SO_0000418') , _namespace_SO('SO_0001810') : _namespace_SO('SO_0001093') , _namespace_SO('SO_0001811') : _namespace_SO('SO_0001089') , _namespace_SO('SO_0001813') : _namespace_SO('SO_0001527') , _namespace_SO('SO_0001814') : _namespace_SO('SO_0001761') , _namespace_SO('SO_0001815') : _namespace_SO('SO_0001814') , _namespace_SO('SO_0001816') : _namespace_SO('SO_0001814') , _namespace_SO('SO_0001817') : _namespace_SO('SO_0000863') , _namespace_SO('SO_0001818') : _namespace_SO('SO_0001580') , _namespace_SO('SO_0001819') : _namespace_SO('SO_0001580') , _namespace_SO('SO_0001820') : _namespace_SO('SO_0001650') , _namespace_SO('SO_0001821') : _namespace_SO('SO_0001908') , _namespace_SO('SO_0001822') : _namespace_SO('SO_0001906') , _namespace_SO('SO_0001823') : _namespace_SO('SO_0001821') , _namespace_SO('SO_0001824') : _namespace_SO('SO_0001821') , _namespace_SO('SO_0001825') : _namespace_SO('SO_0001822') , _namespace_SO('SO_0001826') : _namespace_SO('SO_0001822') , _namespace_SO('SO_0001827') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0001828') : _namespace_SO('SO_0000150') , _namespace_SO('SO_0001829') : _namespace_SO('SO_0000149') , _namespace_SO('SO_0001830') : _namespace_SO('SO_0000006') , _namespace_SO('SO_0001831') : _namespace_SO('SO_0000349') , _namespace_SO('SO_0001832') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0001833') : _namespace_SO('SO_0001832') , _namespace_SO('SO_0001834') : _namespace_SO('SO_0001832') , _namespace_SO('SO_0001835') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0001836') : _namespace_SO('SO_0000301') , _namespace_SO('SO_0001838') : _namespace_SO('SO_0000667') , _namespace_SO('SO_0001839') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001840') : _namespace_SO('SO_0001660') , _namespace_SO('SO_0001841') : _namespace_SO('SO_0000336') , _namespace_SO('SO_0001842') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001843') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001844') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001845') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001846') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001847') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001848') : _namespace_SO('SO_0001660') , _namespace_SO('SO_0001849') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001850') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001851') : _namespace_SO('SO_0001840') , _namespace_SO('SO_0001852') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001853') : _namespace_SO('SO_0000713') , _namespace_SO('SO_0001854') : _namespace_SO('SO_0000051') , _namespace_SO('SO_0001855') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001856') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001857') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001858') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001859') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001860') : _namespace_SO('SO_0000713') , _namespace_SO('SO_0001861') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001862') : _namespace_SO('SO_0000290') , _namespace_SO('SO_0001863') : _namespace_SO('SO_0000291') , _namespace_SO('SO_0001864') : _namespace_SO('SO_0000713') , _namespace_SO('SO_0001865') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001867') : _namespace_SO('SO_0000704') , _namespace_SO('SO_0001868') : _namespace_SO('SO_0001867') , _namespace_SO('SO_0001869') : _namespace_SO('SO_0001867') , _namespace_SO('SO_0001871') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001872') : _namespace_SO('SO_0001785') , _namespace_SO('SO_0001873') : _namespace_SO('SO_0001872') , _namespace_SO('SO_0001874') : _namespace_SO('SO_0001872') , _namespace_SO('SO_0001875') : _namespace_SO('SO_0000148') , _namespace_SO('SO_0001876') : _namespace_SO('SO_0000353') , _namespace_SO('SO_0001877') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0001878') : _namespace_SO('SO_0001537') , _namespace_SO('SO_0001879') : _namespace_SO('SO_0001537') , _namespace_SO('SO_0001880') : _namespace_SO('SO_0001537') , _namespace_SO('SO_0001881') : _namespace_SO('SO_0001537') , _namespace_SO('SO_0001882') : _namespace_SO('SO_0001537') , _namespace_SO('SO_0001883') : _namespace_SO('SO_0001881') , _namespace_SO('SO_0001884') : _namespace_SO('SO_0001881') , _namespace_SO('SO_0001885') : _namespace_SO('SO_0001884') , _namespace_SO('SO_0001886') : _namespace_SO('SO_0001882') , _namespace_SO('SO_0001887') : _namespace_SO('SO_0001882') , _namespace_SO('SO_0001888') : _namespace_SO('SO_0001887') , _namespace_SO('SO_0001889') : _namespace_SO('SO_0001880') , _namespace_SO('SO_0001890') : _namespace_SO('SO_0001882') , _namespace_SO('SO_0001891') : _namespace_SO('SO_0001880') , _namespace_SO('SO_0001892') : _namespace_SO('SO_0001891') , _namespace_SO('SO_0001893') : _namespace_SO('SO_0001879') , _namespace_SO('SO_0001894') : _namespace_SO('SO_0001879') , _namespace_SO('SO_0001895') : _namespace_SO('SO_0001894') , _namespace_SO('SO_0001900') : _namespace_SO('SO_0001659') , _namespace_SO('SO_0001901') : _namespace_SO('SO_0001660') , _namespace_SO('SO_0001903') : _namespace_SO('SO_0001877') , _namespace_SO('SO_0001904') : _namespace_SO('SO_0001877') , _namespace_SO('SO_0001906') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001907') : _namespace_SO('SO_0001878') , _namespace_SO('SO_0001908') : _namespace_SO('SO_0001907') , _namespace_SO('SO_0001909') : _namespace_SO('SO_0001908') , _namespace_SO('SO_0001910') : _namespace_SO('SO_0001906') , _namespace_SO('SO_0001911') : _namespace_SO('SO_0001563') , _namespace_SO('SO_0001912') : _namespace_SO('SO_0001563') , _namespace_SO('SO_0001913') : _namespace_SO('SO_0000613') , _namespace_SO('SO_0001914') : _namespace_SO('SO_0000713') , _namespace_SO('SO_0001915') : _namespace_SO('SO_0001410') , _namespace_SO('SO_0001916') : _namespace_SO('SO_0000324') , _namespace_SO('SO_0001917') : _namespace_SO('SO_0001915') , _namespace_SO('SO_0001918') : _namespace_SO('SO_0000114') , _namespace_SO('SO_0001919') : _namespace_SO('SO_0000114') , _namespace_SO('SO_0001920') : _namespace_SO('SO_0000161') , _namespace_SO('SO_0001922') : _namespace_SO('SO_0000148') , _namespace_SO('SO_0001923') : _namespace_SO('SO_0001927') , _namespace_SO('SO_0001924') : _namespace_SO('SO_0001927') , _namespace_SO('SO_0001925') : _namespace_SO('SO_0001927') , _namespace_SO('SO_0001926') : _namespace_SO('SO_0001927') , _namespace_SO('SO_0001927') : _namespace_SO('SO_0000655') , _namespace_SO('SO_0001928') : _namespace_SO('SO_1000035') , _namespace_SO('SO_0005836') : _namespace_SO('SO_0000831') , _namespace_SO('SO_0005837') : _namespace_SO('SO_0000232') , _namespace_SO('SO_0005845') : _namespace_SO('SO_0000147') , _namespace_SO('SO_0005847') : _namespace_SO('SO_0005848') , _namespace_SO('SO_0005848') : _namespace_SO('SO_0000081') , _namespace_SO('SO_0005849') : _namespace_SO('SO_0000081') , _namespace_SO('SO_0005851') : _namespace_SO('SO_0005855') , _namespace_SO('SO_0005852') : _namespace_SO('SO_0005855') , _namespace_SO('SO_0005853') : _namespace_SO('SO_0000704') , _namespace_SO('SO_0005855') : _namespace_SO('SO_0001411') , _namespace_SO('SO_0005856') : _namespace_SO('SO_0000210') , _namespace_SO('SO_0100001') : _namespace_SO('SO_0001067') , _namespace_SO('SO_0100002') : _namespace_SO('SO_0100001') , _namespace_SO('SO_0100003') : _namespace_SO('SO_0001070') , _namespace_SO('SO_0100004') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0100005') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0100006') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0100007') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0100008') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0100009') : _namespace_SO('SO_0100011') , _namespace_SO('SO_0100010') : _namespace_SO('SO_0000703') , _namespace_SO('SO_0100012') : _namespace_SO('SO_0001078') , _namespace_SO('SO_0100013') : _namespace_SO('SO_0000839') , _namespace_SO('SO_0100017') : _namespace_SO('SO_0001067') , _namespace_SO('SO_0100018') : _namespace_SO('SO_0100001') , _namespace_SO('SO_0100019') : _namespace_SO('SO_0100001') , _namespace_SO('SO_0100020') : _namespace_SO('SO_0100002') , _namespace_SO('SO_0100021') : _namespace_SO('SO_0000839') , _namespace_SO('SO_1000002') : _namespace_SO('SO_0001411') , _namespace_SO('SO_1000005') : _namespace_SO('SO_1000002') , _namespace_SO('SO_1000008') : _namespace_SO('SO_0001483') , _namespace_SO('SO_1000009') : _namespace_SO('SO_0001483') , _namespace_SO('SO_1000010') : _namespace_SO('SO_1000009') , _namespace_SO('SO_1000011') : _namespace_SO('SO_1000010') , _namespace_SO('SO_1000012') : _namespace_SO('SO_1000011') , _namespace_SO('SO_1000013') : _namespace_SO('SO_1000010') , _namespace_SO('SO_1000014') : _namespace_SO('SO_1000009') , _namespace_SO('SO_1000015') : _namespace_SO('SO_1000014') , _namespace_SO('SO_1000016') : _namespace_SO('SO_1000014') , _namespace_SO('SO_1000017') : _namespace_SO('SO_0001483') , _namespace_SO('SO_1000018') : _namespace_SO('SO_1000017') , _namespace_SO('SO_1000019') : _namespace_SO('SO_1000018') , _namespace_SO('SO_1000020') : _namespace_SO('SO_1000018') , _namespace_SO('SO_1000021') : _namespace_SO('SO_1000018') , _namespace_SO('SO_1000022') : _namespace_SO('SO_1000018') , _namespace_SO('SO_1000023') : _namespace_SO('SO_1000017') , _namespace_SO('SO_1000024') : _namespace_SO('SO_1000023') , _namespace_SO('SO_1000025') : _namespace_SO('SO_1000023') , _namespace_SO('SO_1000026') : _namespace_SO('SO_1000023') , _namespace_SO('SO_1000027') : _namespace_SO('SO_1000023') , _namespace_SO('SO_1000032') : _namespace_SO('SO_0001059') , _namespace_SO('SO_1000035') : _namespace_SO('SO_0000667') , _namespace_SO('SO_1000036') : _namespace_SO('SO_0001411') , _namespace_SO('SO_1000037') : _namespace_SO('SO_1000183') , _namespace_SO('SO_1000039') : _namespace_SO('SO_1000173') , _namespace_SO('SO_1000040') : _namespace_SO('SO_1000173') , _namespace_SO('SO_1000042') : _namespace_SO('SO_1000183') , _namespace_SO('SO_1000043') : _namespace_SO('SO_1000044') , _namespace_SO('SO_1000048') : _namespace_SO('SO_1000044') , _namespace_SO('SO_1000136') : _namespace_SO('SO_1000183') , _namespace_SO('SO_1000138') : _namespace_SO('SO_1000042') , _namespace_SO('SO_1000140') : _namespace_SO('SO_1000042') , _namespace_SO('SO_1000141') : _namespace_SO('SO_1000028') , _namespace_SO('SO_1000142') : _namespace_SO('SO_1000136') , _namespace_SO('SO_1000143') : _namespace_SO('SO_1000136') , _namespace_SO('SO_1000144') : _namespace_SO('SO_1000037') , _namespace_SO('SO_1000146') : _namespace_SO('SO_1000183') , _namespace_SO('SO_1000149') : _namespace_SO('SO_1000038') , _namespace_SO('SO_1000150') : _namespace_SO('SO_1000044') , _namespace_SO('SO_1000151') : _namespace_SO('SO_1000030') , _namespace_SO('SO_1000152') : _namespace_SO('SO_1000154') , _namespace_SO('SO_1000153') : _namespace_SO('SO_1000154') , _namespace_SO('SO_1000154') : _namespace_SO('SO_1000037') , _namespace_SO('SO_1000155') : _namespace_SO('SO_1000031') , _namespace_SO('SO_1000156') : _namespace_SO('SO_1000155') , _namespace_SO('SO_1000157') : _namespace_SO('SO_1000155') , _namespace_SO('SO_1000160') : _namespace_SO('SO_1000154') , _namespace_SO('SO_1000161') : _namespace_SO('SO_1000155') , _namespace_SO('SO_1000162') : _namespace_SO('SO_1000041') , _namespace_SO('SO_1000170') : _namespace_SO('SO_1000183') , _namespace_SO('SO_1000173') : _namespace_SO('SO_1000035') , _namespace_SO('SO_1000175') : _namespace_SO('SO_1000170') , _namespace_SO('SO_1000182') : _namespace_SO('SO_0000240') , _namespace_SO('SO_1000183') : _namespace_SO('SO_0000240') , _namespace_SO('SO_1001188') : _namespace_SO('SO_0000463') , _namespace_SO('SO_1001189') : _namespace_SO('SO_0000463') , _namespace_SO('SO_1001190') : _namespace_SO('SO_1001195') , _namespace_SO('SO_1001191') : _namespace_SO('SO_1001195') , _namespace_SO('SO_1001192') : _namespace_SO('SO_1001189') , _namespace_SO('SO_1001193') : _namespace_SO('SO_1001195') , _namespace_SO('SO_1001195') : _namespace_SO('SO_1001189') , _namespace_SO('SO_1001217') : _namespace_SO('SO_0000081') , _namespace_SO('SO_1001260') : _namespace_SO('SO_1001268') , _namespace_SO('SO_1001262') : _namespace_SO('SO_0000887') , _namespace_SO('SO_1001263') : _namespace_SO('SO_0000887') , _namespace_SO('SO_1001268') : _namespace_SO('SO_0000836') , _namespace_SO('SO_1001269') : _namespace_SO('SO_0000680') , _namespace_SO('SO_1001271') : _namespace_SO('SO_0001216') , _namespace_SO('SO_1001272') : _namespace_SO('SO_0001216') , _namespace_SO('SO_1001273') : _namespace_SO('SO_0000680') , _namespace_SO('SO_1001274') : _namespace_SO('SO_1001268') , _namespace_SO('SO_1001275') : _namespace_SO('SO_0001411') , _namespace_SO('SO_1001277') : _namespace_SO('SO_1001268') , _namespace_SO('SO_1001279') : _namespace_SO('SO_1001277') , _namespace_SO('SO_1001280') : _namespace_SO('SO_1001268') , _namespace_SO('SO_1001281') : _namespace_SO('SO_1001277') , _namespace_SO('SO_1001282') : _namespace_SO('SO_1001288') , _namespace_SO('SO_1001283') : _namespace_SO('SO_1001288') , _namespace_SO('SO_1001284') : _namespace_SO('SO_0005855') , _namespace_SO('SO_1001285') : _namespace_SO('SO_1001288') , _namespace_SO('SO_1001286') : _namespace_SO('SO_1001277') , _namespace_SO('SO_1001287') : _namespace_SO('SO_1001277') , _namespace_SO('SO_1001288') : _namespace_SO('SO_1001268') , _namespace_SO('SO_2000061') : _namespace_SO('SO_0000695') , _namespace_SO('SO_3000000') : _namespace_SO('SO_0000842') }


