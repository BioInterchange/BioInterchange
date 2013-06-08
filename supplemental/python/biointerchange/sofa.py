import rdflib

from rdflib import Namespace


class SOFA:

    @classmethod
    def adjacent_to(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:adjacent_to')

    @classmethod
    def complete_evidence_for_feature(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:complete_evidence_for_feature')

    @classmethod
    def contained_by(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:contained_by')

    @classmethod
    def contains(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:contains')

    @classmethod
    def derives_from(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:derives_from')

    @classmethod
    def evidence_for_feature(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:evidence_for_feature')

    @classmethod
    def has_integral_part(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:has_integral_part')

    @classmethod
    def has_part(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:has_part')

    @classmethod
    def homologous_to(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:homologous_to')

    @classmethod
    def integral_part_of(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:integral_part_of')

    @classmethod
    def member_of(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:member_of')

    @classmethod
    def non_functional_homolog_of(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:non_functional_homolog_of')

    @classmethod
    def orthologous_to(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:orthologous_to')

    @classmethod
    def paralogous_to(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:paralogous_to')

    @classmethod
    def part_of(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:part_of')

    @classmethod
    def partial_evidence_for_feature(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:partial_evidence_for_feature')

    @classmethod
    def similar_to(cls):
        return cls._namespace_SOFA('http_//purl.org/obo/owl:similar_to')

    @classmethod
    def Sequence_Ontology(cls):
        return cls._namespace_SOFA('SO_0000000')

    @classmethod
    def region(cls):
        """A sequence_feature with an extent greater than zero. A nucleotide region is composed of bases and a polypeptide region is composed of amino acids. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000001)
        """
        return cls._namespace_SOFA('SO_0000001')

    @classmethod
    def interior_coding_exon(cls):
        return cls._namespace_SOFA('SO_0000004')

    @classmethod
    def satellite_DNA(cls):
        """The many tandem repeats (cls, identical or related) of a short basic repeating unit; many have a base composition or other property different from the genome average that allows them to be separated from the bulk (main band) genomic DNA. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000005)
        """
        return cls._namespace_SOFA('SO_0000005')

    @classmethod
    def PCR_product(cls):
        """A region amplified by a PCR reaction. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000006)
        """
        return cls._namespace_SOFA('SO_0000006')

    @classmethod
    def read_pair(cls):
        """One of a pair of sequencing reads in which the two members of the pair are related by originating at either end of a clone insert. (cls, SO:ls)
        (http://purl.obolibrary.org/obo/SO_0000007)
        """
        return cls._namespace_SOFA('SO_0000007')

    @classmethod
    def scRNA(cls):
        """A small non coding RNA sequence, present in the cytoplasm. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000013)
        """
        return cls._namespace_SOFA('SO_0000013')

    @classmethod
    def match_set(cls):
        """A collection of match parts. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000038)
        """
        return cls._namespace_SOFA('SO_0000038')

    @classmethod
    def match_part(cls):
        """A part of a match, for example an hsp from blast is a match_part. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000039)
        """
        return cls._namespace_SOFA('SO_0000039')

    @classmethod
    def gene_part(cls):
        """A part of a gene, that has no other route in the ontology back to region. This concept is necessary for logical inference as these parts must have the properties of region. It also allows us to associate all the parts of genes with a gene. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000050)
        """
        return cls._namespace_SOFA('SO_0000050')

    @classmethod
    def operator(cls):
        """A regulatory element of an operon to which activators or repressors bind thereby effecting translation of genes in that operon. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000057)
        """
        return cls._namespace_SOFA('SO_0000057')

    @classmethod
    def nuclease_binding_site(cls):
        """A binding site that, of a nucleotide molecule, that interacts selectively and non-covalently with polypeptide residues of a nuclease. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0000059)
        """
        return cls._namespace_SOFA('SO_0000059')

    @classmethod
    def transposable_element(cls):
        """A transposon or insertion sequence. An element that can insert in a variety of DNA sequences. (cls, http://www.sci.sdsu.edu/~smaloy/Glossary/T.html)
        (http://purl.obolibrary.org/obo/SO_0000101)
        """
        return cls._namespace_SOFA('SO_0000101')

    @classmethod
    def expressed_sequence_match(cls):
        """A match to an EST or cDNA sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000102)
        """
        return cls._namespace_SOFA('SO_0000102')

    @classmethod
    def clone_insert_end(cls):
        """The end of the clone insert. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000103)
        """
        return cls._namespace_SOFA('SO_0000103')

    @classmethod
    def polypeptide(cls):
        """A sequence of amino acids linked by peptide bonds which may lack appreciable tertiary structure and may not be liable to irreversible denaturation. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000104)
        """
        return cls._namespace_SOFA('SO_0000104')

    @classmethod
    def sequence_variant_obs(cls):
        """A sequence_variant is a non exact copy of a sequence_feature or genome exhibiting one or more sequence_alteration. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000109)
        """
        return cls._namespace_SOFA('SO_0000109')

    @classmethod
    def sequence_feature(cls):
        """An extent of biological sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000110)
        """
        return cls._namespace_SOFA('SO_0000110')

    @classmethod
    def primer(cls):
        """An oligo to which new deoxyribonucleotides can be added by DNA polymerase. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000112)
        """
        return cls._namespace_SOFA('SO_0000112')

    @classmethod
    def proviral_region(cls):
        """A viral sequence which has integrated into a host genome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000113)
        """
        return cls._namespace_SOFA('SO_0000113')

    @classmethod
    def methylated_C(cls):
        """A methylated deoxy-cytosine. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000114)
        """
        return cls._namespace_SOFA('SO_0000114')

    @classmethod
    def protein_coding_primary_transcript(cls):
        """A primary transcript that, at least in part, encodes one or more proteins. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000120)
        """
        return cls._namespace_SOFA('SO_0000120')

    @classmethod
    def ribosome_entry_site(cls):
        """Region in mRNA where ribosome assembles. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000139)
        """
        return cls._namespace_SOFA('SO_0000139')

    @classmethod
    def attenuator(cls):
        """A sequence segment located within the five prime end of an mRNA that causes premature termination of translation. (cls, SO:as)
        (http://purl.obolibrary.org/obo/SO_0000140)
        """
        return cls._namespace_SOFA('SO_0000140')

    @classmethod
    def terminator(cls):
        """The sequence of DNA located either at the end of the transcript that causes RNA polymerase to terminate transcription. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000141)
        """
        return cls._namespace_SOFA('SO_0000141')

    @classmethod
    def assembly_component(cls):
        """A region of known length which may be used to manufacture a longer region. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000143)
        """
        return cls._namespace_SOFA('SO_0000143')

    @classmethod
    def exon(cls):
        """A region of the transcript sequence within a gene which is not removed from the primary RNA transcript by RNA splicing. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000147)
        """
        return cls._namespace_SOFA('SO_0000147')

    @classmethod
    def supercontig(cls):
        """One or more contigs that have been ordered and oriented using end-read information. Contains gaps that are filled with N's. (cls, SO:ls)
        (http://purl.obolibrary.org/obo/SO_0000148)
        """
        return cls._namespace_SOFA('SO_0000148')

    @classmethod
    def contig(cls):
        """A contiguous sequence derived from sequence assembly. Has no gaps, but may contain N's from unavailable bases. (cls, SO:ls)
        (http://purl.obolibrary.org/obo/SO_0000149)
        """
        return cls._namespace_SOFA('SO_0000149')

    @classmethod
    def read(cls):
        """A sequence obtained from a single sequencing experiment. Typically a read is produced when a base calling program interprets information from a chromatogram trace file produced from a sequencing machine. (cls, SO:rd)
        (http://purl.obolibrary.org/obo/SO_0000150)
        """
        return cls._namespace_SOFA('SO_0000150')

    @classmethod
    def _clone_(cls):
        """A piece of DNA that has been inserted in a vector so that it can be propagated in a host bacterium or some other organism. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000151)
        """
        return cls._namespace_SOFA('SO_0000151')

    @classmethod
    def deletion(cls):
        """The point at which one or more contiguous nucleotides were excised. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000159)
        """
        return cls._namespace_SOFA('SO_0000159')

    @classmethod
    def methylated_A(cls):
        """A modified RNA base in which adenine has been methylated. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000161)
        """
        return cls._namespace_SOFA('SO_0000161')

    @classmethod
    def splice_site(cls):
        """Consensus region of primary transcript bordering junction of splicing. A region that overlaps exactly 2 base and adjacent_to splice_junction. (cls, SO:cjm, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000162)
        """
        return cls._namespace_SOFA('SO_0000162')

    @classmethod
    def five_prime_cis_splice_site(cls):
        """Intronic 2 bp region bordering the exon, at the 5' edge of the intron. A splice_site that is downstream_adjacent_to exon and starts intron. (cls, http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000163)
        """
        return cls._namespace_SOFA('SO_0000163')

    @classmethod
    def three_prime_cis_splice_site(cls):
        """Intronic 2 bp region bordering the exon, at the 3' edge of the intron. A splice_site that is upstream_adjacent_to exon and finishes intron. (cls, http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html, SO:cjm, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000164)
        """
        return cls._namespace_SOFA('SO_0000164')

    @classmethod
    def enhancer(cls):
        """A cis-acting sequence that increases the utilization of (cls, some) eukaryotic promoters, and can function in either orientation and in any location (upstream or downstream) relative to the promoter. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000165)
        """
        return cls._namespace_SOFA('SO_0000165')

    @classmethod
    def promoter(cls):
        """A regulatory_region composed of the TSS(cls, s) and binding sites for TF_complexes of the basal transcription machinery. (SO:regcreative)
        (http://purl.obolibrary.org/obo/SO_0000167)
        """
        return cls._namespace_SOFA('SO_0000167')

    @classmethod
    def cross_genome_match(cls):
        """A nucleotide match against a sequence from another organism. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000177)
        """
        return cls._namespace_SOFA('SO_0000177')

    @classmethod
    def operon(cls):
        """A group of contiguous genes transcribed as a single (cls, polycistronic) mRNA from a single regulatory region. (SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000178)
        """
        return cls._namespace_SOFA('SO_0000178')

    @classmethod
    def clone_insert_start(cls):
        """The start of the clone insert. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000179)
        """
        return cls._namespace_SOFA('SO_0000179')

    @classmethod
    def translated_nucleotide_match(cls):
        """A match against a translated sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000181)
        """
        return cls._namespace_SOFA('SO_0000181')

    @classmethod
    def non_transcribed_region(cls):
        """A region of the gene which is not transcribed. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000183)
        """
        return cls._namespace_SOFA('SO_0000183')

    @classmethod
    def primary_transcript(cls):
        """A transcript that in its initial state requires modification to be functional. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000185)
        """
        return cls._namespace_SOFA('SO_0000185')

    @classmethod
    def repeat_family(cls):
        """A group of characterized repeat sequences. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000187)
        """
        return cls._namespace_SOFA('SO_0000187')

    @classmethod
    def intron(cls):
        """A region of a primary transcript that is transcribed, but removed from within the transcript by splicing together the sequences (cls, exons) on either side of it. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000188)
        """
        return cls._namespace_SOFA('SO_0000188')

    @classmethod
    def RFLP_fragment(cls):
        """A DNA fragment used as a reagent to detect the polymorphic genomic loci by hybridizing against the genomic DNA digested with a given restriction enzyme. (cls, GOC:pj)
        (http://purl.obolibrary.org/obo/SO_0000193)
        """
        return cls._namespace_SOFA('SO_0000193')

    @classmethod
    def coding_exon(cls):
        """An exon whereby at least one base is part of a codon (cls, here, 'codon' is inclusive of the stop_codon). (SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000195)
        """
        return cls._namespace_SOFA('SO_0000195')

    @classmethod
    def five_prime_coding_exon_coding_region(cls):
        """The sequence of the five_prime_coding_exon that codes for protein. (cls, SO:cjm)
        (http://purl.obolibrary.org/obo/SO_0000196)
        """
        return cls._namespace_SOFA('SO_0000196')

    @classmethod
    def three_prime_coding_exon_coding_region(cls):
        """The sequence of the three_prime_coding_exon that codes for protein. (cls, SO:cjm)
        (http://purl.obolibrary.org/obo/SO_0000197)
        """
        return cls._namespace_SOFA('SO_0000197')

    @classmethod
    def noncoding_exon(cls):
        """An exon that does not contain any codons. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000198)
        """
        return cls._namespace_SOFA('SO_0000198')

    @classmethod
    def five_prime_coding_exon(cls):
        """The 5' most coding exon. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000200)
        """
        return cls._namespace_SOFA('SO_0000200')

    @classmethod
    def UTR(cls):
        """Messenger RNA sequences that are untranslated and lie five prime or three prime to sequences which are translated. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000203)
        """
        return cls._namespace_SOFA('SO_0000203')

    @classmethod
    def five_prime_UTR(cls):
        """A region at the 5' end of a mature transcript (cls, preceding the initiation codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000204)
        """
        return cls._namespace_SOFA('SO_0000204')

    @classmethod
    def three_prime_UTR(cls):
        """A region at the 3' end of a mature transcript (cls, following the stop codon) that is not translated into a protein. (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000205)
        """
        return cls._namespace_SOFA('SO_0000205')

    @classmethod
    def rRNA_primary_transcript(cls):
        """A primary transcript encoding a ribosomal RNA. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000209)
        """
        return cls._namespace_SOFA('SO_0000209')

    @classmethod
    def mature_transcript(cls):
        """A transcript which has undergone the necessary modifications, if any, for its function. In eukaryotes this includes, for example, processing of introns, cleavage, base modification, and modifications to the 5' and/or the 3' ends, other than addition of bases. In bacteria functional mRNAs are usually not modified. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000233)
        """
        return cls._namespace_SOFA('SO_0000233')

    @classmethod
    def mRNA(cls):
        """Messenger RNA is the intermediate molecule between DNA and protein. It includes UTR and coding sequences. It does not contain introns. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000234)
        """
        return cls._namespace_SOFA('SO_0000234')

    @classmethod
    def TF_binding_site(cls):
        """A region of a nucleotide molecule that binds a Transcription Factor or Transcription Factor complex [GO:0005667]. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000235)
        """
        return cls._namespace_SOFA('SO_0000235')

    @classmethod
    def ORF(cls):
        """The in-frame interval between the stop codons of a reading frame which when read as sequential triplets, has the potential of encoding a sequential string of amino acids. TER(cls, NNN)nTER. (SGD:rb, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000236)
        """
        return cls._namespace_SOFA('SO_0000236')

    @classmethod
    def flanking_region(cls):
        """The sequences extending on either side of a specific region. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000239)
        """
        return cls._namespace_SOFA('SO_0000239')

    @classmethod
    def rRNA(cls):
        """RNA that comprises part of a ribosome, and that can provide both structural scaffolding and catalytic activity. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, ISBN:0198506732)
        (http://purl.obolibrary.org/obo/SO_0000252)
        """
        return cls._namespace_SOFA('SO_0000252')

    @classmethod
    def tRNA(cls):
        """Transfer RNA (cls, tRNA) molecules are approximately 80 nucleotides in length. Their secondary structure includes four short double-helical elements and three loops (D, anti-codon, and T loops). Further hydrogen bonds mediate the characteristic L-shaped molecular structure. Transfer RNAs have two regions of fundamental functional importance: the anti-codon, which is responsible for specific mRNA codon recognition, and the 3' end, to which the tRNA's corresponding amino acid is attached (by aminoacyl-tRNA synthetases). Transfer RNAs cope with the degeneracy of the genetic code in two manners: having more than one tRNA (with a specific anti-codon) for a particular amino acid; and 'wobble' base-pairing, i.e. permitting non-standard base-pairing at the 3rd anti-codon position. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00005, ISBN:0198506732)
        (http://purl.obolibrary.org/obo/SO_0000253)
        """
        return cls._namespace_SOFA('SO_0000253')

    @classmethod
    def snRNA(cls):
        """A small nuclear RNA molecule involved in pre-mRNA splicing and processing. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, PMID:11733745, WB:ems)
        (http://purl.obolibrary.org/obo/SO_0000274)
        """
        return cls._namespace_SOFA('SO_0000274')

    @classmethod
    def snoRNA(cls):
        """A snoRNA (cls, small nucleolar RNA) is any one of a class of small RNAs that are associated with the eukaryotic nucleus as components of small nucleolar ribonucleoproteins. They participate in the processing or modifications of many RNAs, mostly ribosomal RNAs (rRNAs) though snoRNAs are also known to target other classes of RNA, including spliceosomal RNAs, tRNAs, and mRNAs via a stretch of sequence that is complementary to a sequence in the targeted RNA. (GOC:kgc)
        (http://purl.obolibrary.org/obo/SO_0000275)
        """
        return cls._namespace_SOFA('SO_0000275')

    @classmethod
    def miRNA(cls):
        """Small, ~22-nt, RNA molecule that is the endogenous transcript of a miRNA gene. Micro RNAs are produced from precursor molecules (cls, SO:0000647) that can form local hairpin structures, which ordinarily are processed (via the Dicer pathway) such that a single miRNA molecule accumulates from one arm of a hairpin precursor molecule. Micro RNAs may trigger the cleavage of their target molecules or act as translational repressors. (PMID:12592000)
        (http://purl.obolibrary.org/obo/SO_0000276)
        """
        return cls._namespace_SOFA('SO_0000276')

    @classmethod
    def microsatellite(cls):
        """A repeat_region containing repeat_units (cls, 2 to 4 bp) that is repeated multiple times in tandem. (http://www.informatics.jax.org/silver/glossary.shtml)
        (http://purl.obolibrary.org/obo/SO_0000289)
        """
        return cls._namespace_SOFA('SO_0000289')

    @classmethod
    def inverted_repeat(cls):
        """The sequence is complementarily repeated on the opposite strand. It is a palindrome, and it may, or may not be hyphenated. Examples: GCTGATCAGC, or GCTGA-----TCAGC. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000294)
        """
        return cls._namespace_SOFA('SO_0000294')

    @classmethod
    def origin_of_replication(cls):
        """The origin of replication; starting site for duplication of a nucleic acid molecule to give two identical copies. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000296)
        """
        return cls._namespace_SOFA('SO_0000296')

    @classmethod
    def clip(cls):
        """Part of the primary transcript that is clipped off during processing. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000303)
        """
        return cls._namespace_SOFA('SO_0000303')

    @classmethod
    def modified_base(cls):
        """A modified nucleotide, i.e. a nucleotide other than A, T, C. G. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000305)
        """
        return cls._namespace_SOFA('SO_0000305')

    @classmethod
    def methylated_base_feature(cls):
        """A nucleotide modified by methylation. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000306)
        """
        return cls._namespace_SOFA('SO_0000306')

    @classmethod
    def CpG_island(cls):
        """Regions of a few hundred to a few thousand bases in vertebrate genomes that are relatively GC and CpG rich; they are typically unmethylated and often found near the 5' ends of genes. (cls, SO:rd)
        (http://purl.obolibrary.org/obo/SO_0000307)
        """
        return cls._namespace_SOFA('SO_0000307')

    @classmethod
    def direct_repeat(cls):
        """A repeat where the same sequence is repeated in the same direction. Example: GCTGA-----GCTGA. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000314)
        """
        return cls._namespace_SOFA('SO_0000314')

    @classmethod
    def TSS(cls):
        """The first base where RNA polymerase begins to synthesize the RNA transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000315)
        """
        return cls._namespace_SOFA('SO_0000315')

    @classmethod
    def CDS(cls):
        """A contiguous sequence which begins with, and includes, a start codon and ends with, and includes, a stop codon. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000316)
        """
        return cls._namespace_SOFA('SO_0000316')

    @classmethod
    def start_codon(cls):
        """First codon to be translated by a ribosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000318)
        """
        return cls._namespace_SOFA('SO_0000318')

    @classmethod
    def stop_codon(cls):
        """In mRNA, a set of three nucleotides that indicates the end of information for protein synthesis. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000319)
        """
        return cls._namespace_SOFA('SO_0000319')

    @classmethod
    def tag(cls):
        """A nucleotide sequence that may be used to identify a larger sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000324)
        """
        return cls._namespace_SOFA('SO_0000324')

    @classmethod
    def rRNA_large_subunit_primary_transcript(cls):
        """A primary transcript encoding a large ribosomal subunit RNA. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000325)
        """
        return cls._namespace_SOFA('SO_0000325')

    @classmethod
    def SAGE_tag(cls):
        """A short diagnostic sequence tag, serial analysis of gene expression (cls, SAGE), that allows the quantitative and simultaneous analysis of a large number of transcripts. (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=Retrieve&db=PubMed&list_uids=7570003&dopt=Abstract)
        (http://purl.obolibrary.org/obo/SO_0000326)
        """
        return cls._namespace_SOFA('SO_0000326')

    @classmethod
    def conserved_region(cls):
        """Region of sequence similarity by descent from a common ancestor. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000330)
        """
        return cls._namespace_SOFA('SO_0000330')

    @classmethod
    def STS(cls):
        """Short (cls, typically a few hundred base pairs) DNA sequence that has a single occurrence in a genome and whose location and base sequence are known. (http://www.biospace.com)
        (http://purl.obolibrary.org/obo/SO_0000331)
        """
        return cls._namespace_SOFA('SO_0000331')

    @classmethod
    def coding_conserved_region(cls):
        """Coding region of sequence similarity by descent from a common ancestor. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000332)
        """
        return cls._namespace_SOFA('SO_0000332')

    @classmethod
    def exon_junction(cls):
        """The boundary between two exons in a processed transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000333)
        """
        return cls._namespace_SOFA('SO_0000333')

    @classmethod
    def nc_conserved_region(cls):
        """Non-coding region of sequence similarity by descent from a common ancestor. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000334)
        """
        return cls._namespace_SOFA('SO_0000334')

    @classmethod
    def pseudogene(cls):
        """A sequence that closely resembles a known functional gene, at another locus within a genome, that is non-functional as a consequence of (cls, usually several) mutations that prevent either its transcription or translation (or both). In general, pseudogenes result from either reverse transcription of a transcript of their \"normal\" paralog (SO:0000043) (in which case the pseudogene typically lacks introns and includes a poly(A) tail) or from recombination (SO:0000044) (in which case the pseudogene is typically a tandem duplication of its \"normal\" paralog). (http://www.ucl.ac.uk/~ucbhjow/b241/glossary.html)
        (http://purl.obolibrary.org/obo/SO_0000336)
        """
        return cls._namespace_SOFA('SO_0000336')

    @classmethod
    def RNAi_reagent(cls):
        """A double stranded RNA duplex, at least 20bp long, used experimentally to inhibit gene function by RNA interference. (cls, SO:rd)
        (http://purl.obolibrary.org/obo/SO_0000337)
        """
        return cls._namespace_SOFA('SO_0000337')

    @classmethod
    def chromosome(cls):
        """Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000340)
        """
        return cls._namespace_SOFA('SO_0000340')

    @classmethod
    def chromosome_band(cls):
        """A cytologically distinguishable feature of a chromosome, often made visible by staining, and usually alternating light and dark. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000341)
        """
        return cls._namespace_SOFA('SO_0000341')

    @classmethod
    def match(cls):
        """A region of sequence, aligned to another sequence with some statistical significance, using an algorithm such as BLAST or SIM4. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000343)
        """
        return cls._namespace_SOFA('SO_0000343')

    @classmethod
    def splice_enhancer(cls):
        """Region of a transcript that regulates splicing. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000344)
        """
        return cls._namespace_SOFA('SO_0000344')

    @classmethod
    def EST(cls):
        """A tag produced from a single sequencing read from a cDNA clone or PCR product; typically a few hundred base pairs long. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000345)
        """
        return cls._namespace_SOFA('SO_0000345')

    @classmethod
    def nucleotide_match(cls):
        """A match against a nucleotide sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000347)
        """
        return cls._namespace_SOFA('SO_0000347')

    @classmethod
    def protein_match(cls):
        """A match against a protein sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000349)
        """
        return cls._namespace_SOFA('SO_0000349')

    @classmethod
    def sequence_assembly(cls):
        """A sequence of nucleotides that has been algorithmically derived from an alignment of two or more different sequences. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000353)
        """
        return cls._namespace_SOFA('SO_0000353')

    @classmethod
    def codon(cls):
        """A set of (cls, usually) three nucleotide bases in a DNA or RNA sequence, which together code for a unique amino acid or the termination of translation and are contained within the CDS. (http://www.everythingbio.com/glos/definition.php?word=codon, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000360)
        """
        return cls._namespace_SOFA('SO_0000360')

    @classmethod
    def insertion_site(cls):
        """The junction where an insertion occurred. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000366)
        """
        return cls._namespace_SOFA('SO_0000366')

    @classmethod
    def transposable_element_insertion_site(cls):
        """The junction in a genome where a transposable_element has inserted. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000368)
        """
        return cls._namespace_SOFA('SO_0000368')

    @classmethod
    def small_regulatory_ncRNA(cls):
        """A non-coding RNA, usually with a specific secondary structure, that acts to regulate gene expression. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000370)
        """
        return cls._namespace_SOFA('SO_0000370')

    @classmethod
    def enzymatic_RNA(cls):
        """An RNA sequence that has catalytic activity with or without an associated ribonucleoprotein. (cls, RSC:cb)
        (http://purl.obolibrary.org/obo/SO_0000372)
        """
        return cls._namespace_SOFA('SO_0000372')

    @classmethod
    def ribozyme(cls):
        """An RNA with catalytic activity. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000374)
        """
        return cls._namespace_SOFA('SO_0000374')

    @classmethod
    def rRNA_5_8S(cls):
        """5_8S ribosomal RNA (cls, 5. 8S rRNA) is a component of the large subunit of the eukaryotic ribosome. It is transcribed by RNA polymerase I as part of the 45S precursor that also contains 18S and 28S rRNA. Functionally, it is thought that 5.8S rRNA may be involved in ribosome translocation. It is also known to form covalent linkage to the p53 tumour suppressor protein. 5_8S rRNA is also found in archaea. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00002)
        (http://purl.obolibrary.org/obo/SO_0000375)
        """
        return cls._namespace_SOFA('SO_0000375')

    @classmethod
    def hammerhead_ribozyme(cls):
        """A small catalytic RNA motif that catalyzes self-cleavage reaction. Its name comes from its secondary structure which resembles a carpenter's hammer. The hammerhead ribozyme is involved in the replication of some viroid and some satellite RNAs. (cls, PMID:2436805)
        (http://purl.obolibrary.org/obo/SO_0000380)
        """
        return cls._namespace_SOFA('SO_0000380')

    @classmethod
    def RNase_MRP_RNA(cls):
        """The RNA molecule essential for the catalytic activity of RNase MRP, an enzymatically active ribonucleoprotein with two distinct roles in eukaryotes. In mitochondria it plays a direct role in the initiation of mitochondrial DNA replication. In the nucleus it is involved in precursor rRNA processing, where it cleaves the internal transcribed spacer 1 between 18S and 5.8S rRNAs. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00030)
        (http://purl.obolibrary.org/obo/SO_0000385)
        """
        return cls._namespace_SOFA('SO_0000385')

    @classmethod
    def RNase_P_RNA(cls):
        """The RNA component of Ribonuclease P (cls, RNase P), a ubiquitous endoribonuclease, found in archaea, bacteria and eukarya as well as chloroplasts and mitochondria. Its best characterized activity is the generation of mature 5 prime ends of tRNAs by cleaving the 5 prime leader elements of precursor-tRNAs. Cellular RNase Ps are ribonucleoproteins. RNA from bacterial RNase Ps retains its catalytic activity in the absence of the protein subunit, i.e. it is a ribozyme. Isolated eukaryotic and archaeal RNase P RNA has not been shown to retain its catalytic function, but is still essential for the catalytic activity of the holoenzyme. Although the archaeal and eukaryotic holoenzymes have a much greater protein content than the bacterial ones, the RNA cores from all the three lineages are homologous. Helices corresponding to P1, P2, P3, P4, and P10/11 are common to all cellular RNase P RNAs. Yet, there is considerable sequence variation, particularly among the eukaryotic RNAs. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00010)
        (http://purl.obolibrary.org/obo/SO_0000386)
        """
        return cls._namespace_SOFA('SO_0000386')

    @classmethod
    def telomerase_RNA(cls):
        """The RNA component of telomerase, a reverse transcriptase that synthesizes telomeric DNA. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00025)
        (http://purl.obolibrary.org/obo/SO_0000390)
        """
        return cls._namespace_SOFA('SO_0000390')

    @classmethod
    def U1_snRNA(cls):
        """U1 is a small nuclear RNA (cls, snRNA) component of the spliceosome (involved in pre-mRNA splicing). Its 5' end forms complementary base pairs with the 5' splice junction, thus defining the 5' donor site of an intron. There are significant differences in sequence and secondary structure between metazoan and yeast U1 snRNAs, the latter being much longer (568 nucleotides as compared to 164 nucleotides in human). Nevertheless, secondary structure predictions suggest that all U1 snRNAs share a 'common core' consisting of helices I, II, the proximal region of III, and IV. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00003)
        (http://purl.obolibrary.org/obo/SO_0000391)
        """
        return cls._namespace_SOFA('SO_0000391')

    @classmethod
    def U2_snRNA(cls):
        """U2 is a small nuclear RNA (cls, snRNA) component of the spliceosome (involved in pre-mRNA splicing). Complementary binding between U2 snRNA (in an area lying towards the 5' end but 3' to hairpin I) and the branchpoint sequence (BPS) of the intron results in the bulging out of an unpaired adenine, on the BPS, which initiates a nucleophilic attack at the intronic 5' splice site, thus starting the first of two transesterification reactions that mediate splicing. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00004)
        (http://purl.obolibrary.org/obo/SO_0000392)
        """
        return cls._namespace_SOFA('SO_0000392')

    @classmethod
    def U4_snRNA(cls):
        """U4 small nuclear RNA (cls, U4 snRNA) is a component of the major U2-dependent spliceosome. It forms a duplex with U6, and with each splicing round, it is displaced from U6 (and the spliceosome) in an ATP-dependent manner, allowing U6 to refold and create the active site for splicing catalysis. A recycling process involving protein Prp24 re-anneals U4 and U6. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
        (http://purl.obolibrary.org/obo/SO_0000393)
        """
        return cls._namespace_SOFA('SO_0000393')

    @classmethod
    def U4atac_snRNA(cls):
        """An snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U6atac_snRNA (cls, SO:0000397). (PMID:=12409455)
        (http://purl.obolibrary.org/obo/SO_0000394)
        """
        return cls._namespace_SOFA('SO_0000394')

    @classmethod
    def U5_snRNA(cls):
        """U5 RNA is a component of both types of known spliceosome. The precise function of this molecule is unknown, though it is known that the 5' loop is required for splice site selection and p220 binding, and that both the 3' stem-loop and the Sm site are important for Sm protein binding and cap methylation. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00020)
        (http://purl.obolibrary.org/obo/SO_0000395)
        """
        return cls._namespace_SOFA('SO_0000395')

    @classmethod
    def U6_snRNA(cls):
        """U6 snRNA is a component of the spliceosome which is involved in splicing pre-mRNA. The putative secondary structure consensus base pairing is confined to a short 5' stem loop, but U6 snRNA is thought to form extensive base-pair interactions with U4 snRNA. (cls, http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00015)
        (http://purl.obolibrary.org/obo/SO_0000396)
        """
        return cls._namespace_SOFA('SO_0000396')

    @classmethod
    def U6atac_snRNA(cls):
        """U6atac_snRNA is an snRNA required for the splicing of the minor U12-dependent class of eukaryotic nuclear introns. It forms a base paired complex with U4atac_snRNA (cls, SO:0000394). (http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?cmd=retrieve&db=pubmed&list_uids=12409455&dopt=Abstract)
        (http://purl.obolibrary.org/obo/SO_0000397)
        """
        return cls._namespace_SOFA('SO_0000397')

    @classmethod
    def U11_snRNA(cls):
        """U11 snRNA plays a role in splicing of the minor U12-dependent class of eukaryotic nuclear introns, similar to U1 snRNA in the major class spliceosome it base pairs to the conserved 5' splice site sequence. (cls, PMID:9622129)
        (http://purl.obolibrary.org/obo/SO_0000398)
        """
        return cls._namespace_SOFA('SO_0000398')

    @classmethod
    def U12_snRNA(cls):
        """The U12 small nuclear (cls, snRNA), together with U4atac/U6atac, U5, and U11 snRNAs and associated proteins, forms a spliceosome that cleaves a divergent class of low-abundance pre-mRNA introns. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00007)
        (http://purl.obolibrary.org/obo/SO_0000399)
        """
        return cls._namespace_SOFA('SO_0000399')

    @classmethod
    def U14_snoRNA(cls):
        """U14 small nucleolar RNA (cls, U14 snoRNA) is required for early cleavages of eukaryotic precursor rRNAs. In yeasts, this molecule possess a stem-loop region (known as the Y-domain) which is essential for function. A similar structure, but with a different consensus sequence, is found in plants, but is absent in vertebrates. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00016, PMID:2551119)
        (http://purl.obolibrary.org/obo/SO_0000403)
        """
        return cls._namespace_SOFA('SO_0000403')

    @classmethod
    def vault_RNA(cls):
        """A family of RNAs are found as part of the enigmatic vault ribonucleoprotein complex. The complex consists of a major vault protein (cls, MVP), two minor vault proteins (VPARP and TEP1), and several small untranslated RNA molecules. It has been suggested that the vault complex is involved in drug resistance. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00006)
        (http://purl.obolibrary.org/obo/SO_0000404)
        """
        return cls._namespace_SOFA('SO_0000404')

    @classmethod
    def Y_RNA(cls):
        """Y RNAs are components of the Ro ribonucleoprotein particle (cls, Ro RNP), in association with Ro60 and La proteins. The Y RNAs and Ro60 and La proteins are well conserved, but the function of the Ro RNP is not known. In humans the RNA component can be one of four small RNAs: hY1, hY3, hY4 and hY5. These small RNAs are predicted to fold into a conserved secondary structure containing three stem structures. The largest of the four, hY1, contains an additional hairpin. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00019)
        (http://purl.obolibrary.org/obo/SO_0000405)
        """
        return cls._namespace_SOFA('SO_0000405')

    @classmethod
    def rRNA_18S(cls):
        """A large polynucleotide in eukaryotes, which functions as the small subunit of the ribosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000407)
        """
        return cls._namespace_SOFA('SO_0000407')

    @classmethod
    def binding_site(cls):
        """A biological_region of sequence that, in the molecule, interacts selectively and non-covalently with other molecules. A region on the surface of a molecule that may interact with another molecule. When applied to polypeptides: Amino acids involved in binding or interactions. It can also apply to an amino acid bond which is represented by the positions of the two flanking amino acids. (cls, EBIBS:GAR, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000409)
        """
        return cls._namespace_SOFA('SO_0000409')

    @classmethod
    def protein_binding_site(cls):
        """A binding site that, in the molecule, interacts selectively and non-covalently with polypeptide molecules. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000410)
        """
        return cls._namespace_SOFA('SO_0000410')

    @classmethod
    def restriction_fragment(cls):
        """A region of polynucleotide sequence produced by digestion with a restriction endonuclease. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000412)
        """
        return cls._namespace_SOFA('SO_0000412')

    @classmethod
    def sequence_difference(cls):
        """A region where the sequence differs from that of a specified sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000413)
        """
        return cls._namespace_SOFA('SO_0000413')

    @classmethod
    def signal_peptide(cls):
        """The signal_peptide is a short region of the peptide located at the N-terminus that directs the protein to be secreted or part of membrane components. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000418)
        """
        return cls._namespace_SOFA('SO_0000418')

    @classmethod
    def mature_protein_region(cls):
        """The polypeptide sequence that remains when the cleaved peptide regions have been cleaved from the immature peptide. (cls, EBIBS:GAR, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0000419)
        """
        return cls._namespace_SOFA('SO_0000419')

    @classmethod
    def ARS(cls):
        """A sequence that can autonomously replicate, as a plasmid, when transformed into a bacterial host. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000436)
        """
        return cls._namespace_SOFA('SO_0000436')

    @classmethod
    def ss_oligo(cls):
        """A single stranded oligonucleotide. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000441)
        """
        return cls._namespace_SOFA('SO_0000441')

    @classmethod
    def ds_oligo(cls):
        """A double stranded oligonucleotide. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000442)
        """
        return cls._namespace_SOFA('SO_0000442')

    @classmethod
    def rasiRNA(cls):
        """A 17-28-nt, small interfering RNA derived from transcripts of repetitive elements. (cls, http://www.developmentalcell.com/content/article/abstract?uid=PIIS1534580703002284)
        (http://purl.obolibrary.org/obo/SO_0000454)
        """
        return cls._namespace_SOFA('SO_0000454')

    @classmethod
    def pseudogenic_region(cls):
        """A non-functional descendent of a functional entity. (cls, SO:cjm)
        (http://purl.obolibrary.org/obo/SO_0000462)
        """
        return cls._namespace_SOFA('SO_0000462')

    @classmethod
    def decayed_exon(cls):
        """A non-functional descendant of an exon. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000464)
        """
        return cls._namespace_SOFA('SO_0000464')

    @classmethod
    def golden_path_fragment(cls):
        """One of the pieces of sequence that make up a golden path. (cls, SO:rd)
        (http://purl.obolibrary.org/obo/SO_0000468)
        """
        return cls._namespace_SOFA('SO_0000468')

    @classmethod
    def tiling_path(cls):
        """A set of regions which overlap with minimal polymorphism to form a linear sequence. (cls, SO:cjm)
        (http://purl.obolibrary.org/obo/SO_0000472)
        """
        return cls._namespace_SOFA('SO_0000472')

    @classmethod
    def tiling_path_fragment(cls):
        """A piece of sequence that makes up a tiling_path (cls, SO:0000472). (SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000474)
        """
        return cls._namespace_SOFA('SO_0000474')

    @classmethod
    def nc_primary_transcript(cls):
        """A primary transcript that is never translated into a protein. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000483)
        """
        return cls._namespace_SOFA('SO_0000483')

    @classmethod
    def three_prime_coding_exon_noncoding_region(cls):
        """The sequence of the 3' exon that is not coding. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000484)
        """
        return cls._namespace_SOFA('SO_0000484')

    @classmethod
    def five_prime_coding_exon_noncoding_region(cls):
        """The sequence of the 5' exon preceding the start codon. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000486)
        """
        return cls._namespace_SOFA('SO_0000486')

    @classmethod
    def virtual_sequence(cls):
        """A continuous piece of sequence similar to the 'virtual contig' concept of the Ensembl database. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000499)
        """
        return cls._namespace_SOFA('SO_0000499')

    @classmethod
    def transcribed_region(cls):
        """A region of sequence that is transcribed. This region may cover the transcript of a gene, it may emcompas the sequence covered by all of the transcripts of a alternately spliced gene, or it may cover the region transcribed by a polycistronic transcript. A gene may have 1 or more transcribed regions and a transcribed_region may belong to one or more genes. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000502)
        """
        return cls._namespace_SOFA('SO_0000502')

    @classmethod
    def polyA_signal_sequence(cls):
        """The recognition sequence necessary for endonuclease cleavage of an RNA transcript that is followed by polyadenylation; consensus=AATAAA. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000551)
        """
        return cls._namespace_SOFA('SO_0000551')

    @classmethod
    def polyA_site(cls):
        """The site on an RNA transcript to which will be added adenine residues by post-transcriptional polyadenylation. The boundary between the UTR and the polyA sequence. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000553)
        """
        return cls._namespace_SOFA('SO_0000553')

    @classmethod
    def centromere(cls):
        """A region of chromosome where the spindle fibers attach during mitosis and meiosis. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000577)
        """
        return cls._namespace_SOFA('SO_0000577')

    @classmethod
    def cap(cls):
        """A structure consisting of a 7-methylguanosine in 5'-5' triphosphate linkage with the first nucleotide of an mRNA. It is added post-transcriptionally, and is not encoded in the DNA. (cls, http://seqcore.brcf.med.umich.edu/doc/educ/dnapr/mbglossary/mbgloss.html)
        (http://purl.obolibrary.org/obo/SO_0000581)
        """
        return cls._namespace_SOFA('SO_0000581')

    @classmethod
    def group_I_intron(cls):
        """Group I catalytic introns are large self-splicing ribozymes. They catalyze their own excision from mRNA, tRNA and rRNA precursors in a wide range of organisms. The core secondary structure consists of 9 paired regions (cls, P1-P9). These fold to essentially two domains, the P4-P6 domain (formed from the stacking of P5, P4, P6 and P6a helices) and the P3-P9 domain (formed from the P8, P3, P7 and P9 helices). Group I catalytic introns often have long ORFs inserted in loop regions. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00028)
        (http://purl.obolibrary.org/obo/SO_0000587)
        """
        return cls._namespace_SOFA('SO_0000587')

    @classmethod
    def autocatalytically_spliced_intron(cls):
        """A self spliced intron. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000588)
        """
        return cls._namespace_SOFA('SO_0000588')

    @classmethod
    def SRP_RNA(cls):
        """The signal recognition particle (cls, SRP) is a universally conserved ribonucleoprotein. It is involved in the co-translational targeting of proteins to membranes. The eukaryotic SRP consists of a 300-nucleotide 7S RNA and six proteins: SRPs 72, 68, 54, 19, 14, and 9. Archaeal SRP consists of a 7S RNA and homologues of the eukaryotic SRP19 and SRP54 proteins. In most eubacteria, the SRP consists of a 4.5S RNA and the Ffh protein (a homologue of the eukaryotic SRP54 protein). Eukaryotic and archaeal 7S RNAs have very similar secondary structures, with eight helical elements. These fold into the Alu and S domains, separated by a long linker region. Eubacterial SRP is generally a simpler structure, with the M domain of Ffh bound to a region of the 4.5S RNA that corresponds to helix 8 of the eukaryotic and archaeal SRP S domain. Some Gram-positive bacteria (e.g. Bacillus subtilis), however, have a larger SRP RNA that also has an Alu domain. The Alu domain is thought to mediate the peptide chain elongation retardation function of the SRP. The universally conserved helix which interacts with the SRP54/Ffh M domain mediates signal sequence recognition. In eukaryotes and archaea, the SRP19-helix 6 complex is thought to be involved in SRP assembly and stabilizes helix 8 for SRP54 binding. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00017)
        (http://purl.obolibrary.org/obo/SO_0000590)
        """
        return cls._namespace_SOFA('SO_0000590')

    @classmethod
    def C_D_box_snoRNA(cls):
        """Most box C/D snoRNAs also contain long (cls, >10 nt) sequences complementary to rRNA. Boxes C and D, as well as boxes C' and D', are usually located in close proximity, and form a structure known as the box C/D motif. This motif is important for snoRNA stability, processing, nucleolar targeting and function. A small number of box C/D snoRNAs are involved in rRNA processing; most, however, are known or predicted to serve as guide RNAs in ribose methylation of rRNA. Targeting involves direct base pairing of the snoRNA at the rRNA site to be modified and selection of a rRNA nucleotide a fixed distance from box D or D'. (http://www.bio.umass.edu/biochem/rna-sequence/Yeast_snoRNA_Database/snoRNA_DataBase.html)
        (http://purl.obolibrary.org/obo/SO_0000593)
        """
        return cls._namespace_SOFA('SO_0000593')

    @classmethod
    def guide_RNA(cls):
        """A short 3'-uridylated RNA that can form a duplex (cls, except for its post-transcriptionally added oligo_U tail (SO:0000609)) with a stretch of mature edited mRNA. (http://www.rna.ucla.edu/index.html)
        (http://purl.obolibrary.org/obo/SO_0000602)
        """
        return cls._namespace_SOFA('SO_0000602')

    @classmethod
    def group_II_intron(cls):
        """Group II introns are found in rRNA, tRNA and mRNA of organelles in fungi, plants and protists, and also in mRNA in bacteria. They are large self-splicing ribozymes and have 6 structural domains (cls, usually designated dI to dVI). A subset of group II introns also encode essential splicing proteins in intronic ORFs. The length of these introns can therefore be up to 3kb. Splicing occurs in almost identical fashion to nuclear pre-mRNA splicing with two transesterification steps. The 2' hydroxyl of a bulged adenosine in domain VI attacks the 5' splice site, followed by nucleophilic attack on the 3' splice site by the 3' OH of the upstream exon. Protein machinery is required for splicing in vivo, and long range intron-intron and intron-exon interactions are important for splice site positioning. Group II introns are further sub-classified into groups IIA and IIB which differ in splice site consensus, distance of bulged A from 3' splice site, some tertiary interactions, and intronic ORF phylogeny. (http://www.sanger.ac.uk/Software/Rfam/browse/index.shtml)
        (http://purl.obolibrary.org/obo/SO_0000603)
        """
        return cls._namespace_SOFA('SO_0000603')

    @classmethod
    def intergenic_region(cls):
        """A region containing or overlapping no genes that is bounded on either side by a gene, or bounded by a gene and the end of the chromosome. (cls, SO:cjm)
        (http://purl.obolibrary.org/obo/SO_0000605)
        """
        return cls._namespace_SOFA('SO_0000605')

    @classmethod
    def polyA_sequence(cls):
        """Sequence of about 100 nucleotides of A added to the 3' end of most eukaryotic mRNAs. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000610)
        """
        return cls._namespace_SOFA('SO_0000610')

    @classmethod
    def branch_site(cls):
        """A pyrimidine rich sequence near the 3' end of an intron to which the 5'end becomes covalently bound during nuclear splicing. The resulting structure resembles a lariat. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000611)
        """
        return cls._namespace_SOFA('SO_0000611')

    @classmethod
    def polypyrimidine_tract(cls):
        """The polypyrimidine tract is one of the cis-acting sequence elements directing intron removal in pre-mRNA splicing. (cls, http://nar.oupjournals.org/cgi/content/full/25/4/888)
        (http://purl.obolibrary.org/obo/SO_0000612)
        """
        return cls._namespace_SOFA('SO_0000612')

    @classmethod
    def transcription_end_site(cls):
        """The base where transcription ends. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000616)
        """
        return cls._namespace_SOFA('SO_0000616')

    @classmethod
    def telomere(cls):
        """A specific structure at the end of a linear chromosome, required for the integrity and maintenance of the end. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000624)
        """
        return cls._namespace_SOFA('SO_0000624')

    @classmethod
    def silencer(cls):
        """A regulatory region which upon binding of transcription factors, suppress the transcription of the gene or genes they control. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000625)
        """
        return cls._namespace_SOFA('SO_0000625')

    @classmethod
    def insulator(cls):
        """A transcriptional cis regulatory region that when located between a CM and a gene's promoter prevents the CRM from modulating that genes expression. (cls, SO:regcreative)
        (http://purl.obolibrary.org/obo/SO_0000627)
        """
        return cls._namespace_SOFA('SO_0000627')

    @classmethod
    def chromosomal_structural_element(cls):
        return cls._namespace_SOFA('SO_0000628')

    @classmethod
    def minisatellite(cls):
        """A repeat region containing tandemly repeated sequences having a unit length of 10 to 40 bp. (cls, http://www.informatics.jax.org/silver/glossary.shtml)
        (http://purl.obolibrary.org/obo/SO_0000643)
        """
        return cls._namespace_SOFA('SO_0000643')

    @classmethod
    def antisense_RNA(cls):
        """Antisense RNA is RNA that is transcribed from the coding, rather than the template, strand of DNA. It is therefore complementary to mRNA. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000644)
        """
        return cls._namespace_SOFA('SO_0000644')

    @classmethod
    def antisense_primary_transcript(cls):
        """The reverse complement of the primary transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000645)
        """
        return cls._namespace_SOFA('SO_0000645')

    @classmethod
    def siRNA(cls):
        """A small RNA molecule that is the product of a longer exogenous or endogenous dsRNA, which is either a bimolecular duplex or very long hairpin, processed (cls, via the Dicer pathway) such that numerous siRNAs accumulate from both strands of the dsRNA. SRNAs trigger the cleavage of their target molecules. (PMID:12592000)
        (http://purl.obolibrary.org/obo/SO_0000646)
        """
        return cls._namespace_SOFA('SO_0000646')

    @classmethod
    def stRNA(cls):
        """Non-coding RNAs of about 21 nucleotides in length that regulate temporal development; first discovered in C. elegans. (cls, PMID:11081512)
        (http://purl.obolibrary.org/obo/SO_0000649)
        """
        return cls._namespace_SOFA('SO_0000649')

    @classmethod
    def small_subunit_rRNA(cls):
        """Ribosomal RNA transcript that structures the small subunit of the ribosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000650)
        """
        return cls._namespace_SOFA('SO_0000650')

    @classmethod
    def large_subunit_rRNA(cls):
        """Ribosomal RNA transcript that structures the large subunit of the ribosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000651)
        """
        return cls._namespace_SOFA('SO_0000651')

    @classmethod
    def rRNA_5S(cls):
        """5S ribosomal RNA (cls, 5S rRNA) is a component of the large ribosomal subunit in both prokaryotes and eukaryotes. In eukaryotes, it is synthesised by RNA polymerase III (the other eukaryotic rRNAs are cleaved from a 45S precursor synthesised by RNA polymerase I). In Xenopus oocytes, it has been shown that fingers 4-7 of the nine-zinc finger transcription factor TFIIIA can bind to the central region of 5S RNA. Thus, in addition to positively regulating 5S rRNA transcription, TFIIIA also stabilizes 5S rRNA until it is required for transcription. (http://www.sanger.ac.uk/cgi-bin/Rfam/getacc?RF00001)
        (http://purl.obolibrary.org/obo/SO_0000652)
        """
        return cls._namespace_SOFA('SO_0000652')

    @classmethod
    def rRNA_28S(cls):
        """A component of the large ribosomal subunit. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000653)
        """
        return cls._namespace_SOFA('SO_0000653')

    @classmethod
    def ncRNA(cls):
        """An RNA transcript that does not encode for a protein rather the RNA molecule is the gene product. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000655)
        """
        return cls._namespace_SOFA('SO_0000655')

    @classmethod
    def repeat_region(cls):
        """A region of sequence containing one or more repeat units. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000657)
        """
        return cls._namespace_SOFA('SO_0000657')

    @classmethod
    def dispersed_repeat(cls):
        """A repeat that is located at dispersed sites in the genome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000658)
        """
        return cls._namespace_SOFA('SO_0000658')

    @classmethod
    def spliceosomal_intron(cls):
        """An intron which is spliced by the spliceosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000662)
        """
        return cls._namespace_SOFA('SO_0000662')

    @classmethod
    def insertion(cls):
        """The sequence of one or more nucleotides added between two adjacent nucleotides in the sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000667)
        """
        return cls._namespace_SOFA('SO_0000667')

    @classmethod
    def EST_match(cls):
        """A match against an EST sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000668)
        """
        return cls._namespace_SOFA('SO_0000668')

    @classmethod
    def transcript(cls):
        """An RNA synthesized on a DNA or RNA template by an RNA polymerase. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000673)
        """
        return cls._namespace_SOFA('SO_0000673')

    @classmethod
    def nuclease_sensitive_site(cls):
        """A region of nucleotide sequence targeted by a nuclease enzyme. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000684)
        """
        return cls._namespace_SOFA('SO_0000684')

    @classmethod
    def deletion_junction(cls):
        """The space between two bases in a sequence which marks the position where a deletion has occurred. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000687)
        """
        return cls._namespace_SOFA('SO_0000687')

    @classmethod
    def golden_path(cls):
        """A set of subregions selected from sequence contigs which when concatenated form a nonredundant linear sequence. (cls, SO:ls)
        (http://purl.obolibrary.org/obo/SO_0000688)
        """
        return cls._namespace_SOFA('SO_0000688')

    @classmethod
    def cDNA_match(cls):
        """A match against cDNA sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000689)
        """
        return cls._namespace_SOFA('SO_0000689')

    @classmethod
    def SNP(cls):
        """SNPs are single base pair positions in genomic DNA at which different sequence alternatives exist in normal individuals in some population(cls, s), wherein the least frequent variant has an abundance of 1% or greater. (SO:cb)
        (http://purl.obolibrary.org/obo/SO_0000694)
        """
        return cls._namespace_SOFA('SO_0000694')

    @classmethod
    def reagent(cls):
        """A sequence used in experiment. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000695)
        """
        return cls._namespace_SOFA('SO_0000695')

    @classmethod
    def oligo(cls):
        """A short oligonucleotide sequence, of length on the order of 10's of bases; either single or double stranded. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0000696)
        """
        return cls._namespace_SOFA('SO_0000696')

    @classmethod
    def junction(cls):
        """A sequence_feature with an extent of zero. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000699)
        """
        return cls._namespace_SOFA('SO_0000699')

    @classmethod
    def remark(cls):
        """A comment about the sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000700)
        """
        return cls._namespace_SOFA('SO_0000700')

    @classmethod
    def possible_base_call_error(cls):
        """A region of sequence where the validity of the base calling is questionable. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000701)
        """
        return cls._namespace_SOFA('SO_0000701')

    @classmethod
    def possible_assembly_error(cls):
        """A region of sequence where there may have been an error in the assembly. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000702)
        """
        return cls._namespace_SOFA('SO_0000702')

    @classmethod
    def experimental_result_region(cls):
        """A region of sequence implicated in an experimental result. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000703)
        """
        return cls._namespace_SOFA('SO_0000703')

    @classmethod
    def gene(cls):
        """A region (cls, or regions) that includes all of the sequence elements necessary to encode a functional transcript. A gene may include regulatory regions, transcribed regions and/or other functional sequence regions. (SO:immuno_workshop)
        (http://purl.obolibrary.org/obo/SO_0000704)
        """
        return cls._namespace_SOFA('SO_0000704')

    @classmethod
    def tandem_repeat(cls):
        """Two or more adjcent copies of a region (cls, of length greater than 1). (SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000705)
        """
        return cls._namespace_SOFA('SO_0000705')

    @classmethod
    def trans_splice_acceptor_site(cls):
        """The 3' splice site of the acceptor primary transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000706)
        """
        return cls._namespace_SOFA('SO_0000706')

    @classmethod
    def nucleotide_motif(cls):
        """A region of nucleotide sequence corresponding to a known motif. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000714)
        """
        return cls._namespace_SOFA('SO_0000714')

    @classmethod
    def RNA_motif(cls):
        """A motif that is active in RNA sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000715)
        """
        return cls._namespace_SOFA('SO_0000715')

    @classmethod
    def reading_frame(cls):
        """A nucleic acid sequence that when read as sequential triplets, has the potential of encoding a sequential string of amino acids. It need not contain the start or stop codon. (cls, SGD:rb)
        (http://purl.obolibrary.org/obo/SO_0000717)
        """
        return cls._namespace_SOFA('SO_0000717')

    @classmethod
    def ultracontig(cls):
        """An ordered and oriented set of scaffolds based on somewhat weaker sets of inferential evidence such as one set of mate pair reads together with supporting evidence from ESTs or location of markers from SNP or microsatellite maps, or cytogenetic localization of contained markers. (cls, FB:WG)
        (http://purl.obolibrary.org/obo/SO_0000719)
        """
        return cls._namespace_SOFA('SO_0000719')

    @classmethod
    def oriT(cls):
        """A region of a DNA molecule where transfer is initiated during the process of conjugation or mobilization. (cls, http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000724)
        """
        return cls._namespace_SOFA('SO_0000724')

    @classmethod
    def transit_peptide(cls):
        """The transit_peptide is a short region at the N-terminus of the peptide that directs the protein to an organelle (cls, chloroplast, mitochondrion, microbody or cyanelle). (http://www.ebi.ac.uk/embl/Documentation/FT_definitions/feature_table.html)
        (http://purl.obolibrary.org/obo/SO_0000725)
        """
        return cls._namespace_SOFA('SO_0000725')

    @classmethod
    def CRM(cls):
        """A regulatory_region where more than 1 TF_binding_site together are regulatorily active. (cls, SO:SG)
        (http://purl.obolibrary.org/obo/SO_0000727)
        """
        return cls._namespace_SOFA('SO_0000727')

    @classmethod
    def gap(cls):
        """A gap in the sequence of known length. The unknown bases are filled in with N's. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000730)
        """
        return cls._namespace_SOFA('SO_0000730')

    @classmethod
    def gene_group_regulatory_region(cls):
        return cls._namespace_SOFA('SO_0000752')

    @classmethod
    def clone_insert(cls):
        """The region of sequence that has been inserted and is being propagated by the clone. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000753)
        """
        return cls._namespace_SOFA('SO_0000753')

    @classmethod
    def pseudogenic_rRNA(cls):
        """A non functional descendent of an rRNA. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000777)
        """
        return cls._namespace_SOFA('SO_0000777')

    @classmethod
    def pseudogenic_tRNA(cls):
        """A non functional descendent of a tRNA. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000778)
        """
        return cls._namespace_SOFA('SO_0000778')

    @classmethod
    def chromosome_part(cls):
        """A region of a chromosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000830)
        """
        return cls._namespace_SOFA('SO_0000830')

    @classmethod
    def gene_member_region(cls):
        """A region of a gene. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000831)
        """
        return cls._namespace_SOFA('SO_0000831')

    @classmethod
    def transcript_region(cls):
        """A region of a transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000833)
        """
        return cls._namespace_SOFA('SO_0000833')

    @classmethod
    def mature_transcript_region(cls):
        """A region of a mature transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000834)
        """
        return cls._namespace_SOFA('SO_0000834')

    @classmethod
    def primary_transcript_region(cls):
        """A part of a primary transcript. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000835)
        """
        return cls._namespace_SOFA('SO_0000835')

    @classmethod
    def mRNA_region(cls):
        """A region of an mRNA. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0000836)
        """
        return cls._namespace_SOFA('SO_0000836')

    @classmethod
    def UTR_region(cls):
        """A region of UTR. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000837)
        """
        return cls._namespace_SOFA('SO_0000837')

    @classmethod
    def polypeptide_region(cls):
        """Biological sequence region that can be assigned to a specific subsequence of a polypeptide. (cls, SO:GAR, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000839)
        """
        return cls._namespace_SOFA('SO_0000839')

    @classmethod
    def spliceosomal_intron_region(cls):
        """A region within an intron. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0000841)
        """
        return cls._namespace_SOFA('SO_0000841')

    @classmethod
    def gene_component_region(cls):
        return cls._namespace_SOFA('SO_0000842')

    @classmethod
    def CDS_region(cls):
        """A region of a CDS. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0000851)
        """
        return cls._namespace_SOFA('SO_0000851')

    @classmethod
    def exon_region(cls):
        """A region of an exon. (cls, RSC:cb)
        (http://purl.obolibrary.org/obo/SO_0000852)
        """
        return cls._namespace_SOFA('SO_0000852')

    @classmethod
    def rRNA_16S(cls):
        """A large polynucleotide in Bacteria and Archaea, which functions as the small subunit of the ribosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001000)
        """
        return cls._namespace_SOFA('SO_0001000')

    @classmethod
    def rRNA_23S(cls):
        """A large polynucleotide in Bacteria and Archaea, which functions as the large subunit of the ribosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001001)
        """
        return cls._namespace_SOFA('SO_0001001')

    @classmethod
    def rRNA_25S(cls):
        """A large polynucleotide which functions as part of the large subunit of the ribosome in some eukaryotes. (cls, RSC:cb)
        (http://purl.obolibrary.org/obo/SO_0001002)
        """
        return cls._namespace_SOFA('SO_0001002')

    @classmethod
    def copy_number_variation(cls):
        """A variation that increases or decreases the copy number of a given region. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001019)
        """
        return cls._namespace_SOFA('SO_0001019')

    @classmethod
    def mobile_genetic_element(cls):
        """A nucleotide region with either intra-genome or intracellular moblity, of varying length, which often carry the information necessary for transfer and recombination with the host genome. (cls, PMID:14681355)
        (http://purl.obolibrary.org/obo/SO_0001037)
        """
        return cls._namespace_SOFA('SO_0001037')

    @classmethod
    def integrated_mobile_genetic_element(cls):
        """An MGE that is integrated into the host chromosome. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001039)
        """
        return cls._namespace_SOFA('SO_0001039')

    @classmethod
    def transcriptional_cis_regulatory_region(cls):
        """A regulatory_region that modulates the transcription of a gene or genes. (cls, SO:regcreative)
        (http://purl.obolibrary.org/obo/SO_0001055)
        """
        return cls._namespace_SOFA('SO_0001055')

    @classmethod
    def splicing_regulatory_region(cls):
        """A regulatory_region that modulates splicing. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001056)
        """
        return cls._namespace_SOFA('SO_0001056')

    @classmethod
    def sequence_alteration(cls):
        """A sequence_alteration is a sequence_feature whose extent is the deviation from another sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001059)
        """
        return cls._namespace_SOFA('SO_0001059')

    @classmethod
    def immature_peptide_region(cls):
        """An immature_peptide_region is the extent of the peptide after it has been translated and before any processing occurs. (cls, EBIBS:GAR)
        (http://purl.obolibrary.org/obo/SO_0001063)
        """
        return cls._namespace_SOFA('SO_0001063')

    @classmethod
    def noncoding_region_of_exon(cls):
        """The maximal intersection of exon and UTR. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001214)
        """
        return cls._namespace_SOFA('SO_0001214')

    @classmethod
    def coding_region_of_exon(cls):
        """The region of an exon that encodes for protein sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001215)
        """
        return cls._namespace_SOFA('SO_0001215')

    @classmethod
    def replicon(cls):
        """A region containing at least one unique origin of replication and a unique termination site. (cls, ISBN:0716719207)
        (http://purl.obolibrary.org/obo/SO_0001235)
        """
        return cls._namespace_SOFA('SO_0001235')

    @classmethod
    def base(cls):
        """A base is a sequence feature that corresponds to a single unit of a nucleotide polymer. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001236)
        """
        return cls._namespace_SOFA('SO_0001236')

    @classmethod
    def assembly(cls):
        """A region of the genome of known length that is composed by ordering and aligning two or more different regions. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001248)
        """
        return cls._namespace_SOFA('SO_0001248')

    @classmethod
    def biomaterial_region(cls):
        """A region which is intended for use in an experiment. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0001409)
        """
        return cls._namespace_SOFA('SO_0001409')

    @classmethod
    def experimental_feature(cls):
        """A region which is the result of some arbitrary experimental procedure. The procedure may be carried out with biological material or inside a computer. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0001410)
        """
        return cls._namespace_SOFA('SO_0001410')

    @classmethod
    def biological_region(cls):
        """A region defined by its disposition to be involved in a biological process. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0001411)
        """
        return cls._namespace_SOFA('SO_0001411')

    @classmethod
    def topologically_defined_region(cls):
        """A region that is defined according to its relations with other regions within the same sequence. (cls, SO:cb)
        (http://purl.obolibrary.org/obo/SO_0001412)
        """
        return cls._namespace_SOFA('SO_0001412')

    @classmethod
    def cis_splice_site(cls):
        """Intronic 2 bp region bordering exon. A splice_site that adjacent_to exon and overlaps intron. (cls, SO:cjm, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001419)
        """
        return cls._namespace_SOFA('SO_0001419')

    @classmethod
    def trans_splice_site(cls):
        """Primary transcript region bordering trans-splice junction. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001420)
        """
        return cls._namespace_SOFA('SO_0001420')

    @classmethod
    def SNV(cls):
        """SNVs are single nucleotide positions in genomic DNA at which different sequence alternatives exist. (cls, SO:bm)
        (http://purl.obolibrary.org/obo/SO_0001483)
        """
        return cls._namespace_SOFA('SO_0001483')

    @classmethod
    def peptide_localization_signal(cls):
        """A region of peptide sequence used to target the polypeptide molecule to a specific organelle. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001527)
        """
        return cls._namespace_SOFA('SO_0001527')

    @classmethod
    def kozak_sequence(cls):
        """A kind of ribosome entry site, specific to Eukaryotic organisms that overlaps part of both 5' UTR and CDS sequence. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001647)
        """
        return cls._namespace_SOFA('SO_0001647')

    @classmethod
    def nucleotide_to_protein_binding_site(cls):
        """A binding site that, in the nucleotide molecule, interacts selectively and non-covalently with polypeptide residues. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001654)
        """
        return cls._namespace_SOFA('SO_0001654')

    @classmethod
    def transcription_regulatory_region(cls):
        """A regulatory region that is involved in the control of the process of transcription. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001679)
        """
        return cls._namespace_SOFA('SO_0001679')

    @classmethod
    def sequence_motif(cls):
        """A sequence motif is a nucleotide or amino-acid sequence pattern that may have biological significance. (cls, http://en.wikipedia.org/wiki/Sequence_motif)
        (http://purl.obolibrary.org/obo/SO_0001683)
        """
        return cls._namespace_SOFA('SO_0001683')

    @classmethod
    def epigenetically_modified_region(cls):
        """A biological region implicated in inherited changes caused by mechanisms other than changes in the underlying DNA sequence. (cls, http://en.wikipedia.org/wiki/Epigenetics, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001720)
        """
        return cls._namespace_SOFA('SO_0001720')

    @classmethod
    def paired_end_fragment(cls):
        """An assembly region that has been sequenced from both ends resulting in a read_pair (cls, mate_pair). (SO:ke)
        (http://purl.obolibrary.org/obo/SO_0001790)
        """
        return cls._namespace_SOFA('SO_0001790')

    @classmethod
    def regulatory_region(cls):
        """A region of sequence that is involved in the control of a biological process. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_0005836)
        """
        return cls._namespace_SOFA('SO_0005836')

    @classmethod
    def gene_group(cls):
        """A collection of related genes. (cls, SO:ma)
        (http://purl.obolibrary.org/obo/SO_0005855)
        """
        return cls._namespace_SOFA('SO_0005855')

    @classmethod
    def cleaved_peptide_region(cls):
        """The cleaved_peptide_regon is the a region of peptide sequence that is cleaved during maturation. (cls, EBIBS:GAR)
        (http://purl.obolibrary.org/obo/SO_0100011)
        """
        return cls._namespace_SOFA('SO_0100011')

    @classmethod
    def substitution(cls):
        """A sequence alteration where the length of the change in the variant is the same as that of the reference. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_1000002)
        """
        return cls._namespace_SOFA('SO_1000002')

    @classmethod
    def complex_substitution(cls):
        """When no simple or well defined DNA mutation event describes the observed DNA change, the keyword \"complex\" should be used. Usually there are multiple equally plausible explanations for the change. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (http://purl.obolibrary.org/obo/SO_1000005)
        """
        return cls._namespace_SOFA('SO_1000005')

    @classmethod
    def point_mutation(cls):
        """A single nucleotide change which has occurred at the same position of a corresponding nucleotide in a reference sequence. (cls, SO:immuno_workshop)
        (http://purl.obolibrary.org/obo/SO_1000008)
        """
        return cls._namespace_SOFA('SO_1000008')

    @classmethod
    def inversion(cls):
        """A continuous nucleotide sequence is inverted in the same position. (cls, EBI:www.ebi.ac.uk/mutations/recommendations/mutevent.html)
        (http://purl.obolibrary.org/obo/SO_1000036)
        """
        return cls._namespace_SOFA('SO_1000036')

    @classmethod
    def regulon(cls):
        """A group of genes, whether linked as a cluster or not, that respond to a common regulatory signal. (cls, ISBN:0198506732)
        (http://purl.obolibrary.org/obo/SO_1001284)
        """
        return cls._namespace_SOFA('SO_1001284')

    @classmethod
    def databank_entry(cls):
        """The sequence referred to by an entry in a databank such as Genbank or SwissProt. (cls, SO:ke)
        (http://purl.obolibrary.org/obo/SO_2000061)
        """
        return cls._namespace_SOFA('SO_2000061')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:adjacent_to'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:complete_evidence_for_feature'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:contained_by'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:contains'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:derives_from'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:evidence_for_feature'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:has_integral_part'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:has_part'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:homologous_to'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:integral_part_of'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:member_of'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:non_functional_homolog_of'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:orthologous_to'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:paralogous_to'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:part_of'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:partial_evidence_for_feature'):
            return True
        if uri == cls._namespace_SOFA('http_//purl.org/obo/owl:similar_to'):
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
        if uri == cls._namespace_SOFA('SO_0000000'):
            return True
        if uri == cls._namespace_SOFA('SO_0000001'):
            return True
        if uri == cls._namespace_SOFA('SO_0000004'):
            return True
        if uri == cls._namespace_SOFA('SO_0000005'):
            return True
        if uri == cls._namespace_SOFA('SO_0000006'):
            return True
        if uri == cls._namespace_SOFA('SO_0000007'):
            return True
        if uri == cls._namespace_SOFA('SO_0000013'):
            return True
        if uri == cls._namespace_SOFA('SO_0000038'):
            return True
        if uri == cls._namespace_SOFA('SO_0000039'):
            return True
        if uri == cls._namespace_SOFA('SO_0000050'):
            return True
        if uri == cls._namespace_SOFA('SO_0000057'):
            return True
        if uri == cls._namespace_SOFA('SO_0000059'):
            return True
        if uri == cls._namespace_SOFA('SO_0000101'):
            return True
        if uri == cls._namespace_SOFA('SO_0000102'):
            return True
        if uri == cls._namespace_SOFA('SO_0000103'):
            return True
        if uri == cls._namespace_SOFA('SO_0000104'):
            return True
        if uri == cls._namespace_SOFA('SO_0000109'):
            return True
        if uri == cls._namespace_SOFA('SO_0000110'):
            return True
        if uri == cls._namespace_SOFA('SO_0000112'):
            return True
        if uri == cls._namespace_SOFA('SO_0000113'):
            return True
        if uri == cls._namespace_SOFA('SO_0000114'):
            return True
        if uri == cls._namespace_SOFA('SO_0000120'):
            return True
        if uri == cls._namespace_SOFA('SO_0000139'):
            return True
        if uri == cls._namespace_SOFA('SO_0000140'):
            return True
        if uri == cls._namespace_SOFA('SO_0000141'):
            return True
        if uri == cls._namespace_SOFA('SO_0000143'):
            return True
        if uri == cls._namespace_SOFA('SO_0000147'):
            return True
        if uri == cls._namespace_SOFA('SO_0000148'):
            return True
        if uri == cls._namespace_SOFA('SO_0000149'):
            return True
        if uri == cls._namespace_SOFA('SO_0000150'):
            return True
        if uri == cls._namespace_SOFA('SO_0000151'):
            return True
        if uri == cls._namespace_SOFA('SO_0000159'):
            return True
        if uri == cls._namespace_SOFA('SO_0000161'):
            return True
        if uri == cls._namespace_SOFA('SO_0000162'):
            return True
        if uri == cls._namespace_SOFA('SO_0000163'):
            return True
        if uri == cls._namespace_SOFA('SO_0000164'):
            return True
        if uri == cls._namespace_SOFA('SO_0000165'):
            return True
        if uri == cls._namespace_SOFA('SO_0000167'):
            return True
        if uri == cls._namespace_SOFA('SO_0000177'):
            return True
        if uri == cls._namespace_SOFA('SO_0000178'):
            return True
        if uri == cls._namespace_SOFA('SO_0000179'):
            return True
        if uri == cls._namespace_SOFA('SO_0000181'):
            return True
        if uri == cls._namespace_SOFA('SO_0000183'):
            return True
        if uri == cls._namespace_SOFA('SO_0000185'):
            return True
        if uri == cls._namespace_SOFA('SO_0000187'):
            return True
        if uri == cls._namespace_SOFA('SO_0000188'):
            return True
        if uri == cls._namespace_SOFA('SO_0000193'):
            return True
        if uri == cls._namespace_SOFA('SO_0000195'):
            return True
        if uri == cls._namespace_SOFA('SO_0000196'):
            return True
        if uri == cls._namespace_SOFA('SO_0000197'):
            return True
        if uri == cls._namespace_SOFA('SO_0000198'):
            return True
        if uri == cls._namespace_SOFA('SO_0000200'):
            return True
        if uri == cls._namespace_SOFA('SO_0000203'):
            return True
        if uri == cls._namespace_SOFA('SO_0000204'):
            return True
        if uri == cls._namespace_SOFA('SO_0000205'):
            return True
        if uri == cls._namespace_SOFA('SO_0000209'):
            return True
        if uri == cls._namespace_SOFA('SO_0000233'):
            return True
        if uri == cls._namespace_SOFA('SO_0000234'):
            return True
        if uri == cls._namespace_SOFA('SO_0000235'):
            return True
        if uri == cls._namespace_SOFA('SO_0000236'):
            return True
        if uri == cls._namespace_SOFA('SO_0000239'):
            return True
        if uri == cls._namespace_SOFA('SO_0000252'):
            return True
        if uri == cls._namespace_SOFA('SO_0000253'):
            return True
        if uri == cls._namespace_SOFA('SO_0000274'):
            return True
        if uri == cls._namespace_SOFA('SO_0000275'):
            return True
        if uri == cls._namespace_SOFA('SO_0000276'):
            return True
        if uri == cls._namespace_SOFA('SO_0000289'):
            return True
        if uri == cls._namespace_SOFA('SO_0000294'):
            return True
        if uri == cls._namespace_SOFA('SO_0000296'):
            return True
        if uri == cls._namespace_SOFA('SO_0000303'):
            return True
        if uri == cls._namespace_SOFA('SO_0000305'):
            return True
        if uri == cls._namespace_SOFA('SO_0000306'):
            return True
        if uri == cls._namespace_SOFA('SO_0000307'):
            return True
        if uri == cls._namespace_SOFA('SO_0000314'):
            return True
        if uri == cls._namespace_SOFA('SO_0000315'):
            return True
        if uri == cls._namespace_SOFA('SO_0000316'):
            return True
        if uri == cls._namespace_SOFA('SO_0000318'):
            return True
        if uri == cls._namespace_SOFA('SO_0000319'):
            return True
        if uri == cls._namespace_SOFA('SO_0000324'):
            return True
        if uri == cls._namespace_SOFA('SO_0000325'):
            return True
        if uri == cls._namespace_SOFA('SO_0000326'):
            return True
        if uri == cls._namespace_SOFA('SO_0000330'):
            return True
        if uri == cls._namespace_SOFA('SO_0000331'):
            return True
        if uri == cls._namespace_SOFA('SO_0000332'):
            return True
        if uri == cls._namespace_SOFA('SO_0000333'):
            return True
        if uri == cls._namespace_SOFA('SO_0000334'):
            return True
        if uri == cls._namespace_SOFA('SO_0000336'):
            return True
        if uri == cls._namespace_SOFA('SO_0000337'):
            return True
        if uri == cls._namespace_SOFA('SO_0000340'):
            return True
        if uri == cls._namespace_SOFA('SO_0000341'):
            return True
        if uri == cls._namespace_SOFA('SO_0000343'):
            return True
        if uri == cls._namespace_SOFA('SO_0000344'):
            return True
        if uri == cls._namespace_SOFA('SO_0000345'):
            return True
        if uri == cls._namespace_SOFA('SO_0000347'):
            return True
        if uri == cls._namespace_SOFA('SO_0000349'):
            return True
        if uri == cls._namespace_SOFA('SO_0000353'):
            return True
        if uri == cls._namespace_SOFA('SO_0000360'):
            return True
        if uri == cls._namespace_SOFA('SO_0000366'):
            return True
        if uri == cls._namespace_SOFA('SO_0000368'):
            return True
        if uri == cls._namespace_SOFA('SO_0000370'):
            return True
        if uri == cls._namespace_SOFA('SO_0000372'):
            return True
        if uri == cls._namespace_SOFA('SO_0000374'):
            return True
        if uri == cls._namespace_SOFA('SO_0000375'):
            return True
        if uri == cls._namespace_SOFA('SO_0000380'):
            return True
        if uri == cls._namespace_SOFA('SO_0000385'):
            return True
        if uri == cls._namespace_SOFA('SO_0000386'):
            return True
        if uri == cls._namespace_SOFA('SO_0000390'):
            return True
        if uri == cls._namespace_SOFA('SO_0000391'):
            return True
        if uri == cls._namespace_SOFA('SO_0000392'):
            return True
        if uri == cls._namespace_SOFA('SO_0000393'):
            return True
        if uri == cls._namespace_SOFA('SO_0000394'):
            return True
        if uri == cls._namespace_SOFA('SO_0000395'):
            return True
        if uri == cls._namespace_SOFA('SO_0000396'):
            return True
        if uri == cls._namespace_SOFA('SO_0000397'):
            return True
        if uri == cls._namespace_SOFA('SO_0000398'):
            return True
        if uri == cls._namespace_SOFA('SO_0000399'):
            return True
        if uri == cls._namespace_SOFA('SO_0000403'):
            return True
        if uri == cls._namespace_SOFA('SO_0000404'):
            return True
        if uri == cls._namespace_SOFA('SO_0000405'):
            return True
        if uri == cls._namespace_SOFA('SO_0000407'):
            return True
        if uri == cls._namespace_SOFA('SO_0000409'):
            return True
        if uri == cls._namespace_SOFA('SO_0000410'):
            return True
        if uri == cls._namespace_SOFA('SO_0000412'):
            return True
        if uri == cls._namespace_SOFA('SO_0000413'):
            return True
        if uri == cls._namespace_SOFA('SO_0000418'):
            return True
        if uri == cls._namespace_SOFA('SO_0000419'):
            return True
        if uri == cls._namespace_SOFA('SO_0000436'):
            return True
        if uri == cls._namespace_SOFA('SO_0000441'):
            return True
        if uri == cls._namespace_SOFA('SO_0000442'):
            return True
        if uri == cls._namespace_SOFA('SO_0000454'):
            return True
        if uri == cls._namespace_SOFA('SO_0000462'):
            return True
        if uri == cls._namespace_SOFA('SO_0000464'):
            return True
        if uri == cls._namespace_SOFA('SO_0000468'):
            return True
        if uri == cls._namespace_SOFA('SO_0000472'):
            return True
        if uri == cls._namespace_SOFA('SO_0000474'):
            return True
        if uri == cls._namespace_SOFA('SO_0000483'):
            return True
        if uri == cls._namespace_SOFA('SO_0000484'):
            return True
        if uri == cls._namespace_SOFA('SO_0000486'):
            return True
        if uri == cls._namespace_SOFA('SO_0000499'):
            return True
        if uri == cls._namespace_SOFA('SO_0000502'):
            return True
        if uri == cls._namespace_SOFA('SO_0000551'):
            return True
        if uri == cls._namespace_SOFA('SO_0000553'):
            return True
        if uri == cls._namespace_SOFA('SO_0000577'):
            return True
        if uri == cls._namespace_SOFA('SO_0000581'):
            return True
        if uri == cls._namespace_SOFA('SO_0000587'):
            return True
        if uri == cls._namespace_SOFA('SO_0000588'):
            return True
        if uri == cls._namespace_SOFA('SO_0000590'):
            return True
        if uri == cls._namespace_SOFA('SO_0000593'):
            return True
        if uri == cls._namespace_SOFA('SO_0000602'):
            return True
        if uri == cls._namespace_SOFA('SO_0000603'):
            return True
        if uri == cls._namespace_SOFA('SO_0000605'):
            return True
        if uri == cls._namespace_SOFA('SO_0000610'):
            return True
        if uri == cls._namespace_SOFA('SO_0000611'):
            return True
        if uri == cls._namespace_SOFA('SO_0000612'):
            return True
        if uri == cls._namespace_SOFA('SO_0000616'):
            return True
        if uri == cls._namespace_SOFA('SO_0000624'):
            return True
        if uri == cls._namespace_SOFA('SO_0000625'):
            return True
        if uri == cls._namespace_SOFA('SO_0000627'):
            return True
        if uri == cls._namespace_SOFA('SO_0000628'):
            return True
        if uri == cls._namespace_SOFA('SO_0000643'):
            return True
        if uri == cls._namespace_SOFA('SO_0000644'):
            return True
        if uri == cls._namespace_SOFA('SO_0000645'):
            return True
        if uri == cls._namespace_SOFA('SO_0000646'):
            return True
        if uri == cls._namespace_SOFA('SO_0000649'):
            return True
        if uri == cls._namespace_SOFA('SO_0000650'):
            return True
        if uri == cls._namespace_SOFA('SO_0000651'):
            return True
        if uri == cls._namespace_SOFA('SO_0000652'):
            return True
        if uri == cls._namespace_SOFA('SO_0000653'):
            return True
        if uri == cls._namespace_SOFA('SO_0000655'):
            return True
        if uri == cls._namespace_SOFA('SO_0000657'):
            return True
        if uri == cls._namespace_SOFA('SO_0000658'):
            return True
        if uri == cls._namespace_SOFA('SO_0000662'):
            return True
        if uri == cls._namespace_SOFA('SO_0000667'):
            return True
        if uri == cls._namespace_SOFA('SO_0000668'):
            return True
        if uri == cls._namespace_SOFA('SO_0000673'):
            return True
        if uri == cls._namespace_SOFA('SO_0000684'):
            return True
        if uri == cls._namespace_SOFA('SO_0000687'):
            return True
        if uri == cls._namespace_SOFA('SO_0000688'):
            return True
        if uri == cls._namespace_SOFA('SO_0000689'):
            return True
        if uri == cls._namespace_SOFA('SO_0000694'):
            return True
        if uri == cls._namespace_SOFA('SO_0000695'):
            return True
        if uri == cls._namespace_SOFA('SO_0000696'):
            return True
        if uri == cls._namespace_SOFA('SO_0000699'):
            return True
        if uri == cls._namespace_SOFA('SO_0000700'):
            return True
        if uri == cls._namespace_SOFA('SO_0000701'):
            return True
        if uri == cls._namespace_SOFA('SO_0000702'):
            return True
        if uri == cls._namespace_SOFA('SO_0000703'):
            return True
        if uri == cls._namespace_SOFA('SO_0000704'):
            return True
        if uri == cls._namespace_SOFA('SO_0000705'):
            return True
        if uri == cls._namespace_SOFA('SO_0000706'):
            return True
        if uri == cls._namespace_SOFA('SO_0000714'):
            return True
        if uri == cls._namespace_SOFA('SO_0000715'):
            return True
        if uri == cls._namespace_SOFA('SO_0000717'):
            return True
        if uri == cls._namespace_SOFA('SO_0000719'):
            return True
        if uri == cls._namespace_SOFA('SO_0000724'):
            return True
        if uri == cls._namespace_SOFA('SO_0000725'):
            return True
        if uri == cls._namespace_SOFA('SO_0000727'):
            return True
        if uri == cls._namespace_SOFA('SO_0000730'):
            return True
        if uri == cls._namespace_SOFA('SO_0000752'):
            return True
        if uri == cls._namespace_SOFA('SO_0000753'):
            return True
        if uri == cls._namespace_SOFA('SO_0000777'):
            return True
        if uri == cls._namespace_SOFA('SO_0000778'):
            return True
        if uri == cls._namespace_SOFA('SO_0000830'):
            return True
        if uri == cls._namespace_SOFA('SO_0000831'):
            return True
        if uri == cls._namespace_SOFA('SO_0000833'):
            return True
        if uri == cls._namespace_SOFA('SO_0000834'):
            return True
        if uri == cls._namespace_SOFA('SO_0000835'):
            return True
        if uri == cls._namespace_SOFA('SO_0000836'):
            return True
        if uri == cls._namespace_SOFA('SO_0000837'):
            return True
        if uri == cls._namespace_SOFA('SO_0000839'):
            return True
        if uri == cls._namespace_SOFA('SO_0000841'):
            return True
        if uri == cls._namespace_SOFA('SO_0000842'):
            return True
        if uri == cls._namespace_SOFA('SO_0000851'):
            return True
        if uri == cls._namespace_SOFA('SO_0000852'):
            return True
        if uri == cls._namespace_SOFA('SO_0001000'):
            return True
        if uri == cls._namespace_SOFA('SO_0001001'):
            return True
        if uri == cls._namespace_SOFA('SO_0001002'):
            return True
        if uri == cls._namespace_SOFA('SO_0001019'):
            return True
        if uri == cls._namespace_SOFA('SO_0001037'):
            return True
        if uri == cls._namespace_SOFA('SO_0001039'):
            return True
        if uri == cls._namespace_SOFA('SO_0001055'):
            return True
        if uri == cls._namespace_SOFA('SO_0001056'):
            return True
        if uri == cls._namespace_SOFA('SO_0001059'):
            return True
        if uri == cls._namespace_SOFA('SO_0001063'):
            return True
        if uri == cls._namespace_SOFA('SO_0001214'):
            return True
        if uri == cls._namespace_SOFA('SO_0001215'):
            return True
        if uri == cls._namespace_SOFA('SO_0001235'):
            return True
        if uri == cls._namespace_SOFA('SO_0001236'):
            return True
        if uri == cls._namespace_SOFA('SO_0001248'):
            return True
        if uri == cls._namespace_SOFA('SO_0001409'):
            return True
        if uri == cls._namespace_SOFA('SO_0001410'):
            return True
        if uri == cls._namespace_SOFA('SO_0001411'):
            return True
        if uri == cls._namespace_SOFA('SO_0001412'):
            return True
        if uri == cls._namespace_SOFA('SO_0001419'):
            return True
        if uri == cls._namespace_SOFA('SO_0001420'):
            return True
        if uri == cls._namespace_SOFA('SO_0001483'):
            return True
        if uri == cls._namespace_SOFA('SO_0001527'):
            return True
        if uri == cls._namespace_SOFA('SO_0001647'):
            return True
        if uri == cls._namespace_SOFA('SO_0001654'):
            return True
        if uri == cls._namespace_SOFA('SO_0001679'):
            return True
        if uri == cls._namespace_SOFA('SO_0001683'):
            return True
        if uri == cls._namespace_SOFA('SO_0001720'):
            return True
        if uri == cls._namespace_SOFA('SO_0001790'):
            return True
        if uri == cls._namespace_SOFA('SO_0005836'):
            return True
        if uri == cls._namespace_SOFA('SO_0005855'):
            return True
        if uri == cls._namespace_SOFA('SO_0100011'):
            return True
        if uri == cls._namespace_SOFA('SO_1000002'):
            return True
        if uri == cls._namespace_SOFA('SO_1000005'):
            return True
        if uri == cls._namespace_SOFA('SO_1000008'):
            return True
        if uri == cls._namespace_SOFA('SO_1000036'):
            return True
        if uri == cls._namespace_SOFA('SO_1001284'):
            return True
        if uri == cls._namespace_SOFA('SO_2000061'):
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

    @classmethod
    def _namespace_SOFA(cls, accession):
        return Namespace('http://purl.obolibrary.org/obo/')[accession]

    __parent_properties = { Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:complete_evidence_for_feature') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:evidence_for_feature') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:has_integral_part') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:has_part') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:homologous_to') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:similar_to') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:integral_part_of') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:part_of') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:member_of') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:part_of') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:non_functional_homolog_of') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:homologous_to') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:orthologous_to') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:homologous_to') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:paralogous_to') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:homologous_to') , Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:partial_evidence_for_feature') : Namespace('http://purl.obolibrary.org/obo/http_//purl.org/obo/owl:evidence_for_feature') , Namespace('http://purl.obolibrary.org/obo/SO_0000001') : Namespace('http://purl.obolibrary.org/obo/SO_0000110') , Namespace('http://purl.obolibrary.org/obo/SO_0000004') : Namespace('http://purl.obolibrary.org/obo/SO_0000195') , Namespace('http://purl.obolibrary.org/obo/SO_0000005') : Namespace('http://purl.obolibrary.org/obo/SO_0000705') , Namespace('http://purl.obolibrary.org/obo/SO_0000006') : Namespace('http://purl.obolibrary.org/obo/SO_0000695') , Namespace('http://purl.obolibrary.org/obo/SO_0000057') : Namespace('http://purl.obolibrary.org/obo/SO_0000752') , Namespace('http://purl.obolibrary.org/obo/SO_0000059') : Namespace('http://purl.obolibrary.org/obo/SO_0001654') , Namespace('http://purl.obolibrary.org/obo/SO_0000101') : Namespace('http://purl.obolibrary.org/obo/SO_0001039') , Namespace('http://purl.obolibrary.org/obo/SO_0000102') : Namespace('http://purl.obolibrary.org/obo/SO_0000347') , Namespace('http://purl.obolibrary.org/obo/SO_0000112') : Namespace('http://purl.obolibrary.org/obo/SO_0000441') , Namespace('http://purl.obolibrary.org/obo/SO_0000113') : Namespace('http://purl.obolibrary.org/obo/SO_0001039') , Namespace('http://purl.obolibrary.org/obo/SO_0000114') : Namespace('http://purl.obolibrary.org/obo/SO_0000306') , Namespace('http://purl.obolibrary.org/obo/SO_0000120') : Namespace('http://purl.obolibrary.org/obo/SO_0000185') , Namespace('http://purl.obolibrary.org/obo/SO_0000139') : Namespace('http://purl.obolibrary.org/obo/SO_0000836') , Namespace('http://purl.obolibrary.org/obo/SO_0000143') : Namespace('http://purl.obolibrary.org/obo/SO_0001410') , Namespace('http://purl.obolibrary.org/obo/SO_0000147') : Namespace('http://purl.obolibrary.org/obo/SO_0000833') , Namespace('http://purl.obolibrary.org/obo/SO_0000151') : Namespace('http://purl.obolibrary.org/obo/SO_0000695') , Namespace('http://purl.obolibrary.org/obo/SO_0000159') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000161') : Namespace('http://purl.obolibrary.org/obo/SO_0000306') , Namespace('http://purl.obolibrary.org/obo/SO_0000162') : Namespace('http://purl.obolibrary.org/obo/SO_0000835') , Namespace('http://purl.obolibrary.org/obo/SO_0000163') : Namespace('http://purl.obolibrary.org/obo/SO_0001419') , Namespace('http://purl.obolibrary.org/obo/SO_0000164') : Namespace('http://purl.obolibrary.org/obo/SO_0001419') , Namespace('http://purl.obolibrary.org/obo/SO_0000165') : Namespace('http://purl.obolibrary.org/obo/SO_0000727') , Namespace('http://purl.obolibrary.org/obo/SO_0000167') : Namespace('http://purl.obolibrary.org/obo/SO_0001055') , Namespace('http://purl.obolibrary.org/obo/SO_0000177') : Namespace('http://purl.obolibrary.org/obo/SO_0000347') , Namespace('http://purl.obolibrary.org/obo/SO_0000178') : Namespace('http://purl.obolibrary.org/obo/SO_0005855') , Namespace('http://purl.obolibrary.org/obo/SO_0000181') : Namespace('http://purl.obolibrary.org/obo/SO_0000347') , Namespace('http://purl.obolibrary.org/obo/SO_0000183') : Namespace('http://purl.obolibrary.org/obo/SO_0000842') , Namespace('http://purl.obolibrary.org/obo/SO_0000185') : Namespace('http://purl.obolibrary.org/obo/SO_0000673') , Namespace('http://purl.obolibrary.org/obo/SO_0000188') : Namespace('http://purl.obolibrary.org/obo/SO_0000835') , Namespace('http://purl.obolibrary.org/obo/SO_0000193') : Namespace('http://purl.obolibrary.org/obo/SO_0000412') , Namespace('http://purl.obolibrary.org/obo/SO_0000195') : Namespace('http://purl.obolibrary.org/obo/SO_0000147') , Namespace('http://purl.obolibrary.org/obo/SO_0000198') : Namespace('http://purl.obolibrary.org/obo/SO_0000147') , Namespace('http://purl.obolibrary.org/obo/SO_0000200') : Namespace('http://purl.obolibrary.org/obo/SO_0000195') , Namespace('http://purl.obolibrary.org/obo/SO_0000203') : Namespace('http://purl.obolibrary.org/obo/SO_0000836') , Namespace('http://purl.obolibrary.org/obo/SO_0000204') : Namespace('http://purl.obolibrary.org/obo/SO_0000203') , Namespace('http://purl.obolibrary.org/obo/SO_0000205') : Namespace('http://purl.obolibrary.org/obo/SO_0000203') , Namespace('http://purl.obolibrary.org/obo/SO_0000209') : Namespace('http://purl.obolibrary.org/obo/SO_0000483') , Namespace('http://purl.obolibrary.org/obo/SO_0000234') : Namespace('http://purl.obolibrary.org/obo/SO_0000233') , Namespace('http://purl.obolibrary.org/obo/SO_0000235') : Namespace('http://purl.obolibrary.org/obo/SO_0001679') , Namespace('http://purl.obolibrary.org/obo/SO_0000236') : Namespace('http://purl.obolibrary.org/obo/SO_0000717') , Namespace('http://purl.obolibrary.org/obo/SO_0000239') : Namespace('http://purl.obolibrary.org/obo/SO_0001412') , Namespace('http://purl.obolibrary.org/obo/SO_0000289') : Namespace('http://purl.obolibrary.org/obo/SO_0000005') , Namespace('http://purl.obolibrary.org/obo/SO_0000294') : Namespace('http://purl.obolibrary.org/obo/SO_0000657') , Namespace('http://purl.obolibrary.org/obo/SO_0000303') : Namespace('http://purl.obolibrary.org/obo/SO_0000835') , Namespace('http://purl.obolibrary.org/obo/SO_0000305') : Namespace('http://purl.obolibrary.org/obo/SO_0001720') , Namespace('http://purl.obolibrary.org/obo/SO_0000306') : Namespace('http://purl.obolibrary.org/obo/SO_0000305') , Namespace('http://purl.obolibrary.org/obo/SO_0000307') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000314') : Namespace('http://purl.obolibrary.org/obo/SO_0000657') , Namespace('http://purl.obolibrary.org/obo/SO_0000315') : Namespace('http://purl.obolibrary.org/obo/SO_0000835') , Namespace('http://purl.obolibrary.org/obo/SO_0000316') : Namespace('http://purl.obolibrary.org/obo/SO_0000836') , Namespace('http://purl.obolibrary.org/obo/SO_0000318') : Namespace('http://purl.obolibrary.org/obo/SO_0000360') , Namespace('http://purl.obolibrary.org/obo/SO_0000319') : Namespace('http://purl.obolibrary.org/obo/SO_0000360') , Namespace('http://purl.obolibrary.org/obo/SO_0000324') : Namespace('http://purl.obolibrary.org/obo/SO_0000696') , Namespace('http://purl.obolibrary.org/obo/SO_0000325') : Namespace('http://purl.obolibrary.org/obo/SO_0000209') , Namespace('http://purl.obolibrary.org/obo/SO_0000326') : Namespace('http://purl.obolibrary.org/obo/SO_0000324') , Namespace('http://purl.obolibrary.org/obo/SO_0000330') : Namespace('http://purl.obolibrary.org/obo/SO_0001410') , Namespace('http://purl.obolibrary.org/obo/SO_0000331') : Namespace('http://purl.obolibrary.org/obo/SO_0000324') , Namespace('http://purl.obolibrary.org/obo/SO_0000332') : Namespace('http://purl.obolibrary.org/obo/SO_0000330') , Namespace('http://purl.obolibrary.org/obo/SO_0000334') : Namespace('http://purl.obolibrary.org/obo/SO_0000330') , Namespace('http://purl.obolibrary.org/obo/SO_0000337') : Namespace('http://purl.obolibrary.org/obo/SO_0000442') , Namespace('http://purl.obolibrary.org/obo/SO_0000340') : Namespace('http://purl.obolibrary.org/obo/SO_0001235') , Namespace('http://purl.obolibrary.org/obo/SO_0000341') : Namespace('http://purl.obolibrary.org/obo/SO_0000830') , Namespace('http://purl.obolibrary.org/obo/SO_0000343') : Namespace('http://purl.obolibrary.org/obo/SO_0001410') , Namespace('http://purl.obolibrary.org/obo/SO_0000344') : Namespace('http://purl.obolibrary.org/obo/SO_0001056') , Namespace('http://purl.obolibrary.org/obo/SO_0000347') : Namespace('http://purl.obolibrary.org/obo/SO_0000343') , Namespace('http://purl.obolibrary.org/obo/SO_0000349') : Namespace('http://purl.obolibrary.org/obo/SO_0000343') , Namespace('http://purl.obolibrary.org/obo/SO_0000353') : Namespace('http://purl.obolibrary.org/obo/SO_0001248') , Namespace('http://purl.obolibrary.org/obo/SO_0000360') : Namespace('http://purl.obolibrary.org/obo/SO_0000851') , Namespace('http://purl.obolibrary.org/obo/SO_0000366') : Namespace('http://purl.obolibrary.org/obo/SO_0000699') , Namespace('http://purl.obolibrary.org/obo/SO_0000368') : Namespace('http://purl.obolibrary.org/obo/SO_0000366') , Namespace('http://purl.obolibrary.org/obo/SO_0000370') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000372') : Namespace('http://purl.obolibrary.org/obo/SO_0000673') , Namespace('http://purl.obolibrary.org/obo/SO_0000374') : Namespace('http://purl.obolibrary.org/obo/SO_0000372') , Namespace('http://purl.obolibrary.org/obo/SO_0000375') : Namespace('http://purl.obolibrary.org/obo/SO_0000651') , Namespace('http://purl.obolibrary.org/obo/SO_0000380') : Namespace('http://purl.obolibrary.org/obo/SO_0000715') , Namespace('http://purl.obolibrary.org/obo/SO_0000385') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000386') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000390') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000391') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000392') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000393') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000394') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000395') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000396') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000397') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000398') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000399') : Namespace('http://purl.obolibrary.org/obo/SO_0000274') , Namespace('http://purl.obolibrary.org/obo/SO_0000403') : Namespace('http://purl.obolibrary.org/obo/SO_0000593') , Namespace('http://purl.obolibrary.org/obo/SO_0000404') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000405') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000407') : Namespace('http://purl.obolibrary.org/obo/SO_0000650') , Namespace('http://purl.obolibrary.org/obo/SO_0000409') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000410') : Namespace('http://purl.obolibrary.org/obo/SO_0000409') , Namespace('http://purl.obolibrary.org/obo/SO_0000412') : Namespace('http://purl.obolibrary.org/obo/SO_0000143') , Namespace('http://purl.obolibrary.org/obo/SO_0000413') : Namespace('http://purl.obolibrary.org/obo/SO_0000700') , Namespace('http://purl.obolibrary.org/obo/SO_0000436') : Namespace('http://purl.obolibrary.org/obo/SO_0000296') , Namespace('http://purl.obolibrary.org/obo/SO_0000441') : Namespace('http://purl.obolibrary.org/obo/SO_0000696') , Namespace('http://purl.obolibrary.org/obo/SO_0000442') : Namespace('http://purl.obolibrary.org/obo/SO_0000696') , Namespace('http://purl.obolibrary.org/obo/SO_0000454') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000462') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000472') : Namespace('http://purl.obolibrary.org/obo/SO_0000353') , Namespace('http://purl.obolibrary.org/obo/SO_0000483') : Namespace('http://purl.obolibrary.org/obo/SO_0000185') , Namespace('http://purl.obolibrary.org/obo/SO_0000499') : Namespace('http://purl.obolibrary.org/obo/SO_0000353') , Namespace('http://purl.obolibrary.org/obo/SO_0000551') : Namespace('http://purl.obolibrary.org/obo/SO_0001679') , Namespace('http://purl.obolibrary.org/obo/SO_0000577') : Namespace('http://purl.obolibrary.org/obo/SO_0000628') , Namespace('http://purl.obolibrary.org/obo/SO_0000581') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000587') : Namespace('http://purl.obolibrary.org/obo/SO_0000588') , Namespace('http://purl.obolibrary.org/obo/SO_0000588') : Namespace('http://purl.obolibrary.org/obo/SO_0000188') , Namespace('http://purl.obolibrary.org/obo/SO_0000593') : Namespace('http://purl.obolibrary.org/obo/SO_0000275') , Namespace('http://purl.obolibrary.org/obo/SO_0000602') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000603') : Namespace('http://purl.obolibrary.org/obo/SO_0000588') , Namespace('http://purl.obolibrary.org/obo/SO_0000605') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000611') : Namespace('http://purl.obolibrary.org/obo/SO_0000841') , Namespace('http://purl.obolibrary.org/obo/SO_0000612') : Namespace('http://purl.obolibrary.org/obo/SO_0000841') , Namespace('http://purl.obolibrary.org/obo/SO_0000616') : Namespace('http://purl.obolibrary.org/obo/SO_0000835') , Namespace('http://purl.obolibrary.org/obo/SO_0000624') : Namespace('http://purl.obolibrary.org/obo/SO_0000628') , Namespace('http://purl.obolibrary.org/obo/SO_0000625') : Namespace('http://purl.obolibrary.org/obo/SO_0000727') , Namespace('http://purl.obolibrary.org/obo/SO_0000627') : Namespace('http://purl.obolibrary.org/obo/SO_0001055') , Namespace('http://purl.obolibrary.org/obo/SO_0000628') : Namespace('http://purl.obolibrary.org/obo/SO_0000830') , Namespace('http://purl.obolibrary.org/obo/SO_0000643') : Namespace('http://purl.obolibrary.org/obo/SO_0000005') , Namespace('http://purl.obolibrary.org/obo/SO_0000645') : Namespace('http://purl.obolibrary.org/obo/SO_0000185') , Namespace('http://purl.obolibrary.org/obo/SO_0000646') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000649') : Namespace('http://purl.obolibrary.org/obo/SO_0000655') , Namespace('http://purl.obolibrary.org/obo/SO_0000650') : Namespace('http://purl.obolibrary.org/obo/SO_0000252') , Namespace('http://purl.obolibrary.org/obo/SO_0000652') : Namespace('http://purl.obolibrary.org/obo/SO_0000651') , Namespace('http://purl.obolibrary.org/obo/SO_0000653') : Namespace('http://purl.obolibrary.org/obo/SO_0000651') , Namespace('http://purl.obolibrary.org/obo/SO_0000655') : Namespace('http://purl.obolibrary.org/obo/SO_0000233') , Namespace('http://purl.obolibrary.org/obo/SO_0000658') : Namespace('http://purl.obolibrary.org/obo/SO_0000657') , Namespace('http://purl.obolibrary.org/obo/SO_0000662') : Namespace('http://purl.obolibrary.org/obo/SO_0000188') , Namespace('http://purl.obolibrary.org/obo/SO_0000667') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0000668') : Namespace('http://purl.obolibrary.org/obo/SO_0000102') , Namespace('http://purl.obolibrary.org/obo/SO_0000673') : Namespace('http://purl.obolibrary.org/obo/SO_0000831') , Namespace('http://purl.obolibrary.org/obo/SO_0000684') : Namespace('http://purl.obolibrary.org/obo/SO_0000059') , Namespace('http://purl.obolibrary.org/obo/SO_0000687') : Namespace('http://purl.obolibrary.org/obo/SO_0000699') , Namespace('http://purl.obolibrary.org/obo/SO_0000688') : Namespace('http://purl.obolibrary.org/obo/SO_0000353') , Namespace('http://purl.obolibrary.org/obo/SO_0000689') : Namespace('http://purl.obolibrary.org/obo/SO_0000102') , Namespace('http://purl.obolibrary.org/obo/SO_0000694') : Namespace('http://purl.obolibrary.org/obo/SO_0001483') , Namespace('http://purl.obolibrary.org/obo/SO_0000695') : Namespace('http://purl.obolibrary.org/obo/SO_0001409') , Namespace('http://purl.obolibrary.org/obo/SO_0000696') : Namespace('http://purl.obolibrary.org/obo/SO_0000695') , Namespace('http://purl.obolibrary.org/obo/SO_0000699') : Namespace('http://purl.obolibrary.org/obo/SO_0000110') , Namespace('http://purl.obolibrary.org/obo/SO_0000700') : Namespace('http://purl.obolibrary.org/obo/SO_0001410') , Namespace('http://purl.obolibrary.org/obo/SO_0000701') : Namespace('http://purl.obolibrary.org/obo/SO_0000413') , Namespace('http://purl.obolibrary.org/obo/SO_0000702') : Namespace('http://purl.obolibrary.org/obo/SO_0000413') , Namespace('http://purl.obolibrary.org/obo/SO_0000703') : Namespace('http://purl.obolibrary.org/obo/SO_0000700') , Namespace('http://purl.obolibrary.org/obo/SO_0000705') : Namespace('http://purl.obolibrary.org/obo/SO_0000657') , Namespace('http://purl.obolibrary.org/obo/SO_0000706') : Namespace('http://purl.obolibrary.org/obo/SO_0001420') , Namespace('http://purl.obolibrary.org/obo/SO_0000714') : Namespace('http://purl.obolibrary.org/obo/SO_0001683') , Namespace('http://purl.obolibrary.org/obo/SO_0000715') : Namespace('http://purl.obolibrary.org/obo/SO_0000714') , Namespace('http://purl.obolibrary.org/obo/SO_0000717') : Namespace('http://purl.obolibrary.org/obo/SO_0001410') , Namespace('http://purl.obolibrary.org/obo/SO_0000719') : Namespace('http://purl.obolibrary.org/obo/SO_0000353') , Namespace('http://purl.obolibrary.org/obo/SO_0000724') : Namespace('http://purl.obolibrary.org/obo/SO_0000296') , Namespace('http://purl.obolibrary.org/obo/SO_0000725') : Namespace('http://purl.obolibrary.org/obo/SO_0001527') , Namespace('http://purl.obolibrary.org/obo/SO_0000777') : Namespace('http://purl.obolibrary.org/obo/SO_0000462') , Namespace('http://purl.obolibrary.org/obo/SO_0000778') : Namespace('http://purl.obolibrary.org/obo/SO_0000462') , Namespace('http://purl.obolibrary.org/obo/SO_0000834') : Namespace('http://purl.obolibrary.org/obo/SO_0000833') , Namespace('http://purl.obolibrary.org/obo/SO_0000837') : Namespace('http://purl.obolibrary.org/obo/SO_0000836') , Namespace('http://purl.obolibrary.org/obo/SO_0001000') : Namespace('http://purl.obolibrary.org/obo/SO_0000650') , Namespace('http://purl.obolibrary.org/obo/SO_0001001') : Namespace('http://purl.obolibrary.org/obo/SO_0000651') , Namespace('http://purl.obolibrary.org/obo/SO_0001002') : Namespace('http://purl.obolibrary.org/obo/SO_0000651') , Namespace('http://purl.obolibrary.org/obo/SO_0001019') : Namespace('http://purl.obolibrary.org/obo/SO_0001059') , Namespace('http://purl.obolibrary.org/obo/SO_0001037') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0001039') : Namespace('http://purl.obolibrary.org/obo/SO_0001037') , Namespace('http://purl.obolibrary.org/obo/SO_0001055') : Namespace('http://purl.obolibrary.org/obo/SO_0001679') , Namespace('http://purl.obolibrary.org/obo/SO_0001056') : Namespace('http://purl.obolibrary.org/obo/SO_0001679') , Namespace('http://purl.obolibrary.org/obo/SO_0001059') : Namespace('http://purl.obolibrary.org/obo/SO_0000110') , Namespace('http://purl.obolibrary.org/obo/SO_0001063') : Namespace('http://purl.obolibrary.org/obo/SO_0000839') , Namespace('http://purl.obolibrary.org/obo/SO_0001214') : Namespace('http://purl.obolibrary.org/obo/SO_0000852') , Namespace('http://purl.obolibrary.org/obo/SO_0001215') : Namespace('http://purl.obolibrary.org/obo/SO_0000852') , Namespace('http://purl.obolibrary.org/obo/SO_0001235') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0001236') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0001248') : Namespace('http://purl.obolibrary.org/obo/SO_0001410') , Namespace('http://purl.obolibrary.org/obo/SO_0001409') : Namespace('http://purl.obolibrary.org/obo/SO_0000001') , Namespace('http://purl.obolibrary.org/obo/SO_0001410') : Namespace('http://purl.obolibrary.org/obo/SO_0000001') , Namespace('http://purl.obolibrary.org/obo/SO_0001411') : Namespace('http://purl.obolibrary.org/obo/SO_0000001') , Namespace('http://purl.obolibrary.org/obo/SO_0001412') : Namespace('http://purl.obolibrary.org/obo/SO_0000001') , Namespace('http://purl.obolibrary.org/obo/SO_0001419') : Namespace('http://purl.obolibrary.org/obo/SO_0000162') , Namespace('http://purl.obolibrary.org/obo/SO_0001420') : Namespace('http://purl.obolibrary.org/obo/SO_0000162') , Namespace('http://purl.obolibrary.org/obo/SO_0001483') : Namespace('http://purl.obolibrary.org/obo/SO_1000002') , Namespace('http://purl.obolibrary.org/obo/SO_0001527') : Namespace('http://purl.obolibrary.org/obo/SO_0000839') , Namespace('http://purl.obolibrary.org/obo/SO_0001647') : Namespace('http://purl.obolibrary.org/obo/SO_0000139') , Namespace('http://purl.obolibrary.org/obo/SO_0001654') : Namespace('http://purl.obolibrary.org/obo/SO_0000410') , Namespace('http://purl.obolibrary.org/obo/SO_0001679') : Namespace('http://purl.obolibrary.org/obo/SO_0005836') , Namespace('http://purl.obolibrary.org/obo/SO_0001683') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0001720') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_0001790') : Namespace('http://purl.obolibrary.org/obo/SO_0000143') , Namespace('http://purl.obolibrary.org/obo/SO_0005836') : Namespace('http://purl.obolibrary.org/obo/SO_0000831') , Namespace('http://purl.obolibrary.org/obo/SO_0005855') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_1000002') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_1000005') : Namespace('http://purl.obolibrary.org/obo/SO_1000002') , Namespace('http://purl.obolibrary.org/obo/SO_1000008') : Namespace('http://purl.obolibrary.org/obo/SO_0001483') , Namespace('http://purl.obolibrary.org/obo/SO_1000036') : Namespace('http://purl.obolibrary.org/obo/SO_0001411') , Namespace('http://purl.obolibrary.org/obo/SO_1001284') : Namespace('http://purl.obolibrary.org/obo/SO_0005855') , Namespace('http://purl.obolibrary.org/obo/SO_2000061') : Namespace('http://purl.obolibrary.org/obo/SO_0000695') }


