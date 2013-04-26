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

public class GOXRef {

  /**
   * Returns the link-out URI for objects of "Arabidopsis Genome Initiative".
   */
  public static Resource AGI_LocusCode() {
    _namespace_GOXRef("http://arabidopsis.org/servlets/TairObject?type=locus&name=");
  }

  /**
   * Returns the link-out URI for objects of "PlasmoDB Plasmodium Genome Resource".
   */
  public static Resource ApiDB_PlasmoDB() {
    _namespace_GOXRef("http://www.plasmodb.org/gene/");
  }

  /**
   * Returns the link-out URI for objects of "AraCyc metabolic pathway database for Arabidopsis thaliana".
   */
  public static Resource AraCyc() {
    _namespace_GOXRef("http://www.arabidopsis.org:1555/ARA/NEW-IMAGE?type=NIL&object=");
  }

  /**
   * Returns the link-out URI for objects of "A Systematic Annotation Package for Community Analysis of Genomes".
   */
  public static Resource ASAP() {
    _namespace_GOXRef("https://asap.ahabs.wisc.edu/annotation/php/feature_info.php?FeatureID=");
  }

  /**
   * Returns the link-out URI for objects of "Aspergillus Genome Database".
   */
  public static Resource AspGD() {
    _namespace_GOXRef("http://www.aspergillusgenome.org/cgi-bin/locus.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Aspergillus Genome Database".
   */
  public static Resource AspGD_LOCUS() {
    _namespace_GOXRef("http://www.aspergillusgenome.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Aspergillus Genome Database".
   */
  public static Resource AspGD_REF() {
    _namespace_GOXRef("http://www.aspergillusgenome.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Basic Formal Ontology".
   */
  public static Resource BFO() {
    _namespace_GOXRef("http://purl.obolibrary.org/obo/BFO_");
  }

  /**
   * Returns the link-out URI for objects of "BioCyc collection of metabolic pathway databases".
   */
  public static Resource BioCyc() {
    _namespace_GOXRef("http://biocyc.org/META/NEW-IMAGE?type=PATHWAY&object=");
  }

  /**
   * Returns the link-out URI for objects of "BioModels Database".
   */
  public static Resource BIOMD() {
    _namespace_GOXRef("http://www.ebi.ac.uk/compneur-srv/biomodels-main/publ-model.do?mid=");
  }

  /**
   * Returns the link-out URI for objects of "BRENDA, The Comprehensive Enzyme Information System".
   */
  public static Resource BRENDA() {
    _namespace_GOXRef("http://www.brenda-enzymes.info/php/result_flat.php4?ecno=");
  }

  /**
   * Returns the link-out URI for objects of "Magnaporthe grisea Database".
   */
  public static Resource Broad_MGG() {
    _namespace_GOXRef("http://www.broad.mit.edu/annotation/genome/magnaporthe_grisea/GeneLocus.html?sp=S");
  }

  /**
   * Returns the link-out URI for objects of "Catalog of Fishes genus database".
   */
  public static Resource CASGEN() {
    _namespace_GOXRef("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Genus&id=");
  }

  /**
   * Returns the link-out URI for objects of "Catalog of Fishes publications database".
   */
  public static Resource CASREF() {
    _namespace_GOXRef("http://research.calacademy.org/research/ichthyology/catalog/getref.asp?id=");
  }

  /**
   * Returns the link-out URI for objects of "Catalog of Fishes species database".
   */
  public static Resource CASSPC() {
    _namespace_GOXRef("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Species&id=1979");
  }

  /**
   * Returns the link-out URI for objects of "Conserved Domain Database at NCBI".
   */
  public static Resource CDD() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=");
  }

  /**
   * Returns the link-out URI for objects of "Candida Genome Database".
   */
  public static Resource CGD() {
    _namespace_GOXRef("http://www.candidagenome.org/cgi-bin/locus.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Candida Genome Database".
   */
  public static Resource CGD_LOCUS() {
    _namespace_GOXRef("http://www.candidagenome.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Candida Genome Database".
   */
  public static Resource CGD_REF() {
    _namespace_GOXRef("http://www.candidagenome.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Chemical Entities of Biological Interest".
   */
  public static Resource CHEBI() {
    _namespace_GOXRef("http://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:");
  }

  /**
   * Returns the link-out URI for objects of "Cell Type Ontology".
   */
  public static Resource CL() {
    _namespace_GOXRef("http://purl.obolibrary.org/obo/CL_");
  }

  /**
   * Returns the link-out URI for objects of "NCBI COG cluster".
   */
  public static Resource COG_Cluster() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/COG/new/release/cow.cgi?cog=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI COG function".
   */
  public static Resource COG_Function() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/COG/grace/shokog.cgi?fun=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI COG pathway".
   */
  public static Resource COG_Pathway() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/COG/new/release/coglist.cgi?pathw=");
  }

  /**
   * Returns the link-out URI for objects of "CORUM - the Comprehensive Resource of Mammalian protein complexes".
   */
  public static Resource CORUM() {
    _namespace_GOXRef("http://mips.gsf.de/genre/proj/corum/complexdetails.html?id=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI dbSNP".
   */
  public static Resource dbSNP() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=");
  }

  /**
   * Returns the link-out URI for objects of "DNA Databank of Japan".
   */
  public static Resource DDBJ() {
    _namespace_GOXRef("http://arsa.ddbj.nig.ac.jp/arsa/ddbjSplSearch?KeyWord=");
  }

  /**
   * Returns the link-out URI for objects of "dictyBase".
   */
  public static Resource dictyBase() {
    _namespace_GOXRef("http://dictybase.org/gene/");
  }

  /**
   * Returns the link-out URI for objects of "dictyBase".
   */
  public static Resource dictyBase_gene_name() {
    _namespace_GOXRef("http://dictybase.org/gene/");
  }

  /**
   * Returns the link-out URI for objects of "dictyBase literature references".
   */
  public static Resource dictyBase_REF() {
    _namespace_GOXRef("http://dictybase.org/db/cgi-bin/dictyBase/reference/reference.pl?refNo=");
  }

  /**
   * Returns the link-out URI for objects of "Digital Object Identifier".
   */
  public static Resource DOI() {
    _namespace_GOXRef("http://dx.doi.org/DOI:");
  }

  /**
   * Returns the link-out URI for objects of "Enzyme Commission".
   */
  public static Resource EC() {
    _namespace_GOXRef("http://www.expasy.org/enzyme/");
  }

  /**
   * Returns the link-out URI for objects of "EchoBASE post-genomic database for Escherichia coli".
   */
  public static Resource EchoBASE() {
    _namespace_GOXRef("http://www.biolws1.york.ac.uk/echobase/Gene.cfm?recordID=");
  }

  /**
   * Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
   */
  public static Resource ECK() {
    _namespace_GOXRef("http://www.ecogene.org/geneInfo.php?eck_id=");
  }

  /**
   * Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
   */
  public static Resource EcoCyc() {
    _namespace_GOXRef("http://biocyc.org/ECOLI/NEW-IMAGE?type=PATHWAY&object=");
  }

  /**
   * Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
   */
  public static Resource EcoCyc_REF() {
    _namespace_GOXRef("http://biocyc.org/ECOLI/reference.html?type=CITATION-FRAME&object=");
  }

  /**
   * Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
   */
  public static Resource ECOGENE() {
    _namespace_GOXRef("http://www.ecogene.org/geneInfo.php?eg_id=");
  }

  /**
   * Returns the link-out URI for objects of "EMBL Nucleotide Sequence Database".
   */
  public static Resource EMBL() {
    _namespace_GOXRef("http://www.ebi.ac.uk/cgi-bin/emblfetch?style=html&Submit=Go&id=");
  }

  /**
   * Returns the link-out URI for objects of "European Nucleotide Archive".
   */
  public static Resource ENA() {
    _namespace_GOXRef("http://www.ebi.ac.uk/ena/data/view/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL() {
    _namespace_GOXRef("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL_GeneID() {
    _namespace_GOXRef("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL_ProteinID() {
    _namespace_GOXRef("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL_TranscriptID() {
    _namespace_GOXRef("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Swiss Institute of Bioinformatics enzyme database".
   */
  public static Resource ENZYME() {
    _namespace_GOXRef("http://www.expasy.ch/cgi-bin/nicezyme.pl?");
  }

  /**
   * Returns the link-out URI for objects of "Drosophila gross anatomy".
   */
  public static Resource FBbt() {
    _namespace_GOXRef("http://flybase.org/cgi-bin/fbcvq.html?query=FBbt:");
  }

  /**
   * Returns the link-out URI for objects of "Human Genome Database".
   */
  public static Resource GDB() {
    _namespace_GOXRef("http://www.gdb.org/gdb-bin/genera/accno?accessionNum=GDB:");
  }

  /**
   * Returns the link-out URI for objects of "GenBank".
   */
  public static Resource GenBank() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=nucleotide&val=");
  }

  /**
   * Returns the link-out URI for objects of "Domain Architecture Classification".
   */
  public static Resource Gene3D() {
    _namespace_GOXRef("http://gene3d.biochem.ucl.ac.uk/superfamily/?accession=");
  }

  /**
   * Returns the link-out URI for objects of "Glossina morsitans GeneDB".
   */
  public static Resource GeneDB_Gmorsitans() {
    _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=glossina&name=");
  }

  /**
   * Returns the link-out URI for objects of "Leishmania major GeneDB".
   */
  public static Resource GeneDB_Lmajor() {
    _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=leish&name=");
  }

  /**
   * Returns the link-out URI for objects of "Plasmodium falciparum GeneDB".
   */
  public static Resource GeneDB_Pfalciparum() {
    _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=malaria&name=");
  }

  /**
   * Returns the link-out URI for objects of "Schizosaccharomyces pombe GeneDB".
   */
  public static Resource GeneDB_Spombe() {
    _namespace_GOXRef("http://old.genedb.org/genedb/Search?organism=pombe&name=");
  }

  /**
   * Returns the link-out URI for objects of "Trypanosoma brucei GeneDB".
   */
  public static Resource GeneDB_Tbrucei() {
    _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=tryp&name=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI Gene Expression Omnibus".
   */
  public static Resource GEO() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/sites/GDSbrowser?acc=");
  }

  /**
   * Returns the link-out URI for objects of "Gene Ontology Database".
   */
  public static Resource GO() {
    _namespace_GOXRef("http://amigo.geneontology.org/cgi-bin/amigo/term-details.cgi?term=GO:");
  }

  /**
   * Returns the link-out URI for objects of "Gene Ontology Database references".
   */
  public static Resource GO_REF() {
    _namespace_GOXRef("http://www.geneontology.org/cgi-bin/references.cgi#GO_REF:");
  }

  /**
   * Returns the link-out URI for objects of "Gene Ontology Normal Usage Tracking System (GONUTS)".
   */
  public static Resource GONUTS() {
    _namespace_GOXRef("http://gowiki.tamu.edu/wiki/index.php/");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR() {
    _namespace_GOXRef("http://www.gramene.org/db/searches/browser?search_type=All&RGN=on&query=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_GENE() {
    _namespace_GOXRef("http://www.gramene.org/db/genes/search_gene?acc=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_PROTEIN() {
    _namespace_GOXRef("http://www.gramene.org/db/protein/protein_search?acc=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_QTL() {
    _namespace_GOXRef("http://www.gramene.org/db/qtl/qtl_display?qtl_accession_id=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_REF() {
    _namespace_GOXRef("http://www.gramene.org/db/literature/pub_search?ref_id=");
  }

  /**
   * Returns the link-out URI for objects of "H-invitational Database".
   */
  public static Resource H_invDB_cDNA() {
    _namespace_GOXRef("http://www.h-invitational.jp/hinv/spsoup/transcript_view?acc_id=");
  }

  /**
   * Returns the link-out URI for objects of "H-invitational Database".
   */
  public static Resource H_invDB_locus() {
    _namespace_GOXRef("http://www.h-invitational.jp/hinv/spsoup/locus_view?hix_id=");
  }

  /**
   * Returns the link-out URI for objects of "High-quality Automated and Manual Annotation of microbial Proteomes".
   */
  public static Resource HAMAP() {
    _namespace_GOXRef("http://us.expasy.org/unirules/");
  }

  /**
   * Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
   */
  public static Resource HGNC() {
    _namespace_GOXRef("http://www.genenames.org/data/hgnc_data.php?hgnc_id=HGNC:");
  }

  /**
   * Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
   */
  public static Resource HGNC_gene() {
    _namespace_GOXRef("http://www.genenames.org/data/hgnc_data.php?app_sym=");
  }

  /**
   * Returns the link-out URI for objects of "Human Protein Atlas tissue profile information".
   */
  public static Resource HPA() {
    _namespace_GOXRef("http://www.proteinatlas.org/tissue_profile.php?antibody_id=");
  }

  /**
   * Returns the link-out URI for objects of "Human Protein Atlas antibody information".
   */
  public static Resource HPA_antibody() {
    _namespace_GOXRef("http://www.proteinatlas.org/antibody_info.php?antibody_id=");
  }

  /**
   * Returns the link-out URI for objects of "Integrated Microbial Genomes; JGI web site for genome annotation".
   */
  public static Resource IMG() {
    _namespace_GOXRef("http://img.jgi.doe.gov/cgi-bin/pub/main.cgi?section=GeneDetail&page=geneDetail&gene_oid=");
  }

  /**
   * Returns the link-out URI for objects of "IntAct protein interaction database".
   */
  public static Resource IntAct() {
    _namespace_GOXRef("http://www.ebi.ac.uk/intact/search/do/search?searchString=");
  }

  /**
   * Returns the link-out URI for objects of "InterPro database of protein domains and motifs".
   */
  public static Resource InterPro() {
    _namespace_GOXRef("http://www.ebi.ac.uk/interpro/IEntry?ac=");
  }

  /**
   * Returns the link-out URI for objects of "International Standard Book Number".
   */
  public static Resource ISBN() {
    _namespace_GOXRef("http://my.linkbaton.com/get?lbCC=q&nC=q&genre=book&item=");
  }

  /**
   * Returns the link-out URI for objects of "International Union of Pharmacology".
   */
  public static Resource IUPHAR_GPCR() {
    _namespace_GOXRef("http://www.iuphar-db.org/DATABASE/FamilyMenuForward?familyId=");
  }

  /**
   * Returns the link-out URI for objects of "International Union of Pharmacology".
   */
  public static Resource IUPHAR_RECEPTOR() {
    _namespace_GOXRef("http://www.iuphar-db.org/DATABASE/ObjectDisplayForward?objectId=");
  }

  /**
   * Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
   */
  public static Resource JCVI_CMR() {
    _namespace_GOXRef("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenePage.cgi?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
   */
  public static Resource JCVI_EGAD() {
    _namespace_GOXRef("http://cmr.jcvi.org/cgi-bin/CMR/EgadSearch.cgi?search_string=");
  }

  /**
   * Returns the link-out URI for objects of "Genome Properties database at the J. Craig Venter Institute".
   */
  public static Resource JCVI_GenProp() {
    _namespace_GOXRef("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenomePropDefinition.cgi?prop_acc=");
  }

  /**
   * Returns the link-out URI for objects of "Medicago truncatula genome database at the J. Craig Venter Institute ".
   */
  public static Resource JCVI_Medtr() {
    _namespace_GOXRef("http://medicago.jcvi.org/cgi-bin/medicago/search/shared/ORF_infopage.cgi?orf=");
  }

  /**
   * Returns the link-out URI for objects of "TIGRFAMs HMM collection at the J. Craig Venter Institute".
   */
  public static Resource JCVI_TIGRFAMS() {
    _namespace_GOXRef("http://search.jcvi.org/search?p&q=");
  }

  /**
   * Returns the link-out URI for objects of "Digital archive of scholarly articles".
   */
  public static Resource JSTOR() {
    _namespace_GOXRef("http://www.jstor.org/stable/");
  }

  /**
   * Returns the link-out URI for objects of "KEGG Enzyme Database".
   */
  public static Resource KEGG_ENZYME() {
    _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?ec:");
  }

  /**
   * Returns the link-out URI for objects of "KEGG LIGAND Database".
   */
  public static Resource KEGG_LIGAND() {
    _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?cpd:");
  }

  /**
   * Returns the link-out URI for objects of "KEGG Pathways Database".
   */
  public static Resource KEGG_PATHWAY() {
    _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?path:");
  }

  /**
   * Returns the link-out URI for objects of "KEGG Reaction Database".
   */
  public static Resource KEGG_REACTION() {
    _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?rn:");
  }

  /**
   * Returns the link-out URI for objects of "LifeDB".
   */
  public static Resource LIFEdb() {
    _namespace_GOXRef("http://www.dkfz.de/LIFEdb/LIFEdb.aspx?ID=");
  }

  /**
   * Returns the link-out URI for objects of "Adult Mouse Anatomical Dictionary".
   */
  public static Resource MA() {
    _namespace_GOXRef("http://www.informatics.jax.org/searches/AMA.cgi?id=MA:");
  }

  /**
   * Returns the link-out URI for objects of "MaizeGDB".
   */
  public static Resource MaizeGDB() {
    _namespace_GOXRef("http://www.maizegdb.org/cgi-bin/id_search.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "MaizeGDB".
   */
  public static Resource MaizeGDB_Locus() {
    _namespace_GOXRef("http://www.maizegdb.org/cgi-bin/displaylocusresults.cgi?term=");
  }

  /**
   * Returns the link-out URI for objects of "MEROPS peptidase database".
   */
  public static Resource MEROPS() {
    _namespace_GOXRef("http://merops.sanger.ac.uk/cgi-bin/pepsum?mid=");
  }

  /**
   * Returns the link-out URI for objects of "MEROPS peptidase database".
   */
  public static Resource MEROPS_fam() {
    _namespace_GOXRef("http://merops.sanger.ac.uk/cgi-bin/famsum?family=");
  }

  /**
   * Returns the link-out URI for objects of "Medical Subject Headings".
   */
  public static Resource MeSH() {
    _namespace_GOXRef("http://www.nlm.nih.gov/cgi/mesh/2005/MB_cgi?mode=&term=");
  }

  /**
   * Returns the link-out URI for objects of "Metabolic Encyclopedia of metabolic and other pathways".
   */
  public static Resource MetaCyc() {
    _namespace_GOXRef("http://biocyc.org/META/NEW-IMAGE?type=NIL&object=");
  }

  /**
   * Returns the link-out URI for objects of "Mouse Genome Informatics".
   */
  public static Resource MGI() {
    _namespace_GOXRef("http://www.informatics.jax.org/accession/");
  }

  /**
   * Returns the link-out URI for objects of "MIPS Functional Catalogue".
   */
  public static Resource MIPS_funcat() {
    _namespace_GOXRef("http://mips.gsf.de/cgi-bin/proj/funcatDB/search_advanced.pl?action=2&wert=");
  }

  /**
   * Returns the link-out URI for objects of "MGED Ontology".
   */
  public static Resource MO() {
    _namespace_GOXRef("http://mged.sourceforge.net/ontologies/MGEDontology.php#");
  }

  /**
   * Returns the link-out URI for objects of "ModBase comprehensive Database of Comparative Protein Structure Models".
   */
  public static Resource ModBase() {
    _namespace_GOXRef("http://salilab.org/modbase/searchbyid?databaseID=");
  }

  /**
   * Returns the link-out URI for objects of "Nottingham Arabidopsis Stock Centre Seeds Database".
   */
  public static Resource NASC_code() {
    _namespace_GOXRef("http://seeds.nottingham.ac.uk/NASC/stockatidb.lasso?code=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI Gene".
   */
  public static Resource NCBI_Gene() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI databases".
   */
  public static Resource NCBI_gi() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI GenPept".
   */
  public static Resource NCBI_GP() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=protein&val=");
  }

  /**
   * Returns the link-out URI for objects of "Neuroscience Information Framework standard ontology, subcellular hierarchy".
   */
  public static Resource NIF_Subcellular() {
    _namespace_GOXRef("http://www.neurolex.org/wiki/");
  }

  /**
   * Returns the link-out URI for objects of "National Microbial Pathogen Data Resource".
   */
  public static Resource NMPDR() {
    _namespace_GOXRef("http://www.nmpdr.org/linkin.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "Mendelian Inheritance in Man".
   */
  public static Resource OMIM() {
    _namespace_GOXRef("http://omim.org/entry/");
  }

  /**
   * Returns the link-out URI for objects of "Genome Annotation Tool (Agrobacterium tumefaciens C58); PAMGO Interest Group".
   */
  public static Resource PAMGO_GAT() {
    _namespace_GOXRef("http://agro.vbi.vt.edu/public/servlet/GeneEdit?&Search=Search&level=2&genename=");
  }

  /**
   * Returns the link-out URI for objects of "Magnaporthe grisea database".
   */
  public static Resource PAMGO_MGG() {
    _namespace_GOXRef("http://scotland.fgl.ncsu.edu/cgi-bin/adHocQuery.cgi?adHocQuery_dbName=smeng_goannotation&Action=Data&QueryName=Functional+Categorization+of+MGG+GO+Annotation&P_KeyWord=");
  }

  /**
   * Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
   */
  public static Resource PAMGO_VMD() {
    _namespace_GOXRef("http://vmd.vbi.vt.edu/cgi-bin/browse/go_detail.cgi?gene_id=");
  }

  /**
   * Returns the link-out URI for objects of "Protein ANalysis THrough Evolutionary Relationships".
   */
  public static Resource PANTHER() {
    _namespace_GOXRef("http://pantree.org/node/annotationNode.jsp?id=");
  }

  /**
   * Returns the link-out URI for objects of "PathoSystems Resource Integration Center".
   */
  public static Resource PATRIC() {
    _namespace_GOXRef("http://patric.vbi.vt.edu/gene/overview.php?fid=");
  }

  /**
   * Returns the link-out URI for objects of "Protein Data Bank".
   */
  public static Resource PDB() {
    _namespace_GOXRef("http://www.rcsb.org/pdb/cgi/explore.cgi?pdbId=");
  }

  /**
   * Returns the link-out URI for objects of "Pfam database of protein families".
   */
  public static Resource Pfam() {
    _namespace_GOXRef("http://www.sanger.ac.uk/cgi-bin/Pfam/getacc?");
  }

  /**
   * Returns the link-out URI for objects of "Pharmacogenetics and Pharmacogenomics Knowledge Base".
   */
  public static Resource PharmGKB() {
    _namespace_GOXRef("http://www.pharmgkb.org/do/serve?objId=");
  }

  /**
   * Returns the link-out URI for objects of "Protein Information Resource".
   */
  public static Resource PIR() {
    _namespace_GOXRef("http://pir.georgetown.edu/cgi-bin/pirwww/nbrfget?uid=");
  }

  /**
   * Returns the link-out URI for objects of "PIR Superfamily Classification System".
   */
  public static Resource PIRSF() {
    _namespace_GOXRef("http://pir.georgetown.edu/cgi-bin/ipcSF?id=");
  }

  /**
   * Returns the link-out URI for objects of "Pubmed Central".
   */
  public static Resource PMCID() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/sites/entrez?db=pmc&cmd=search&term=");
  }

  /**
   * Returns the link-out URI for objects of "PubMed".
   */
  public static Resource PMID() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/pubmed/");
  }

  /**
   * Returns the link-out URI for objects of "Plant Ontology Consortium Database".
   */
  public static Resource PO() {
    _namespace_GOXRef("http://www.plantontology.org/amigo/go.cgi?action=query&view=query&search_constraint=terms&query=PO:");
  }

  /**
   * Returns the link-out URI for objects of "Plant Ontology custom references".
   */
  public static Resource PO_REF() {
    _namespace_GOXRef("http://wiki.plantontology.org:8080/index.php/PO_REF:");
  }

  /**
   * Returns the link-out URI for objects of "PomBase".
   */
  public static Resource PomBase() {
    _namespace_GOXRef("http://www.pombase.org/spombe/result/");
  }

  /**
   * Returns the link-out URI for objects of "Protein Ontology".
   */
  public static Resource PR() {
    _namespace_GOXRef("http://www.proconsortium.org/cgi-bin/pro/entry_pro?id=PR:");
  }

  /**
   * Returns the link-out URI for objects of "PRINTS compendium of protein fingerprints".
   */
  public static Resource PRINTS() {
    _namespace_GOXRef("http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/sprint/searchprintss.cgi?display_opts=Prints&category=None&queryform=false&regexpr=off&prints_accn=");
  }

  /**
   * Returns the link-out URI for objects of "ProDom protein domain families".
   */
  public static Resource ProDom() {
    _namespace_GOXRef("http://prodom.prabi.fr/prodom/current/cgi-bin/request.pl?question=DBEN&query=");
  }

  /**
   * Returns the link-out URI for objects of "Prosite database of protein families and domains".
   */
  public static Resource Prosite() {
    _namespace_GOXRef("http://www.expasy.ch/cgi-bin/prosite-search-ac?");
  }

  /**
   * Returns the link-out URI for objects of "Pseudomonas Genome Project".
   */
  public static Resource PseudoCAP() {
    _namespace_GOXRef("http://v2.pseudomonas.com/getAnnotation.do?locusID=");
  }

  /**
   * Returns the link-out URI for objects of "Proteomics Standards Initiative protein modification ontology".
   */
  public static Resource PSI_MOD() {
    _namespace_GOXRef("http://www.ebi.ac.uk/ontology-lookup/?termId=MOD:");
  }

  /**
   * Returns the link-out URI for objects of "NCBI PubChem database of bioassay records".
   */
  public static Resource PubChem_BioAssay() {
    _namespace_GOXRef("http://pubchem.ncbi.nlm.nih.gov/assay/assay.cgi?aid=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI PubChem database of chemical structures".
   */
  public static Resource PubChem_Compound() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI PubChem database of chemical substances".
   */
  public static Resource PubChem_Substance() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pcsubstance&term=");
  }

  /**
   * Returns the link-out URI for objects of "Reactome - a curated knowledgebase of biological pathways".
   */
  public static Resource Reactome() {
    _namespace_GOXRef("http://www.reactome.org/cgi-bin/eventbrowser_st_id?ST_ID=");
  }

  /**
   * Returns the link-out URI for objects of "RefSeq".
   */
  public static Resource RefSeq() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "RefSeq (Nucleic Acid)".
   */
  public static Resource RefSeq_NA() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "RefSeq (Protein)".
   */
  public static Resource RefSeq_Prot() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "Rfam database of RNA families".
   */
  public static Resource Rfam() {
    _namespace_GOXRef("http://rfam.sanger.ac.uk/family/");
  }

  /**
   * Returns the link-out URI for objects of "Rat Genome Database".
   */
  public static Resource RGD() {
    _namespace_GOXRef("http://rgd.mcw.edu/generalSearch/RgdSearch.jsp?quickSearch=1&searchKeyword=");
  }

  /**
   * Returns the link-out URI for objects of "Rhea, the Annotated Reactions Database".
   */
  public static Resource RHEA() {
    _namespace_GOXRef("http://www.ebi.ac.uk/rhea/reaction.xhtml?id=");
  }

  /**
   * Returns the link-out URI for objects of "RNA Modification Database".
   */
  public static Resource RNAmods() {
    _namespace_GOXRef("http://s59.cas.albany.edu/RNAmods/cgi-bin/rnashow.cgi?");
  }

  /**
   * Returns the link-out URI for objects of "OBO Relation Ontology Ontology".
   */
  public static Resource RO() {
    _namespace_GOXRef("http://purl.obolibrary.org/obo/RO_");
  }

  /**
   * Returns the link-out URI for objects of "SABIO Reaction Kinetics".
   */
  public static Resource SABIO_RK() {
    _namespace_GOXRef("http://sabio.villa-bosch.de/reacdetails.jsp?reactid=");
  }

  /**
   * Returns the link-out URI for objects of "The SEED;".
   */
  public static Resource SEED() {
    _namespace_GOXRef("http://www.theseed.org/linkin.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "Saccharomyces Genome Database".
   */
  public static Resource SGD() {
    _namespace_GOXRef("http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Saccharomyces Genome Database".
   */
  public static Resource SGD_LOCUS() {
    _namespace_GOXRef("http://db.yeastgenome.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Saccharomyces Genome Database".
   */
  public static Resource SGD_REF() {
    _namespace_GOXRef("http://db.yeastgenome.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Sol Genomics Network".
   */
  public static Resource SGN() {
    _namespace_GOXRef("http://www.sgn.cornell.edu/phenome/locus_display.pl?locus_id=");
  }

  /**
   * Returns the link-out URI for objects of "Sol Genomics Network".
   */
  public static Resource SGN_ref() {
    _namespace_GOXRef("http://www.sgn.cornell.edu/chado/publication.pl?pub_id=");
  }

  /**
   * Returns the link-out URI for objects of "Simple Modular Architecture Research Tool".
   */
  public static Resource SMART() {
    _namespace_GOXRef("http://smart.embl-heidelberg.de/smart/do_annotation.pl?BLAST=DUMMY&DOMAIN=");
  }

  /**
   * Returns the link-out URI for objects of "Sequence Ontology".
   */
  public static Resource SO() {
    _namespace_GOXRef("http://song.sourceforge.net/SOterm_tables.html#SO:");
  }

  /**
   * Returns the link-out URI for objects of "SUPERFAMILY protein annotation database".
   */
  public static Resource SUPERFAMILY() {
    _namespace_GOXRef("http://supfam.cs.bris.ac.uk/SUPERFAMILY/cgi-bin/scop.cgi?ipid=SSF");
  }

  /**
   * Returns the link-out URI for objects of "UniProtKB/Swiss-Prot".
   */
  public static Resource Swiss_Prot() {
    _namespace_GOXRef("http://www.uniprot.org/uniprot/");
  }

  /**
   * Returns the link-out URI for objects of "The Arabidopsis Information Resource".
   */
  public static Resource TAIR() {
    _namespace_GOXRef("http://arabidopsis.org/servlets/TairObject?accession=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI Taxonomy".
   */
  public static Resource taxon() {
    _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "Transport Protein Database".
   */
  public static Resource TC() {
    _namespace_GOXRef("http://www.tcdb.org/tcdb/index.php?tc=");
  }

  /**
   * Returns the link-out URI for objects of "Tetrahymena Genome Database".
   */
  public static Resource TGD_LOCUS() {
    _namespace_GOXRef("http://db.ciliate.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Tetrahymena Genome Database".
   */
  public static Resource TGD_REF() {
    _namespace_GOXRef("http://db.ciliate.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "UniProtKB-TrEMBL protein sequence database".
   */
  public static Resource TrEMBL() {
    _namespace_GOXRef("http://www.uniprot.org/uniprot/");
  }

  /**
   * Returns the link-out URI for objects of "Uber-anatomy ontology".
   */
  public static Resource UBERON() {
    _namespace_GOXRef("http://purl.obolibrary.org/obo/UBERON_");
  }

  /**
   * Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
   */
  public static Resource UM_BBD_enzymeID() {
    _namespace_GOXRef("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=ep&enzymeID=");
  }

  /**
   * Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
   */
  public static Resource UM_BBD_reactionID() {
    _namespace_GOXRef("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=r&reacID=");
  }

  /**
   * Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
   */
  public static Resource UM_BBD_ruleID() {
    _namespace_GOXRef("http://umbbd.msi.umn.edu/servlets/rule.jsp?rule=");
  }

  /**
   * Returns the link-out URI for objects of "UniMod".
   */
  public static Resource UniMod() {
    _namespace_GOXRef("http://www.unimod.org/modifications_view.php?editid1=");
  }

  /**
   * Returns the link-out URI for objects of "UniProt Archive".
   */
  public static Resource UniParc() {
    _namespace_GOXRef("http://www.uniprot.org/uniparc/");
  }

  /**
   * Returns the link-out URI for objects of "UniPathway".
   */
  public static Resource UniPathway() {
    _namespace_GOXRef("http://www.grenoble.prabi.fr/obiwarehouse/unipathway/upa?upid=");
  }

  /**
   * Returns the link-out URI for objects of "Universal Protein Knowledgebase".
   */
  public static Resource UniProtKB() {
    _namespace_GOXRef("http://www.uniprot.org/uniprot/");
  }

  /**
   * Returns the link-out URI for objects of "UniProt Knowledgebase keywords".
   */
  public static Resource UniProtKB_KW() {
    _namespace_GOXRef("http://www.uniprot.org/keywords/");
  }

  /**
   * Returns the link-out URI for objects of "UniProt Knowledgebase Subcellular Location vocabulary".
   */
  public static Resource UniProtKB_SubCell() {
    _namespace_GOXRef("http://www.uniprot.org/locations/");
  }

  /**
   * Returns the link-out URI for objects of "Viral Bioinformatics Resource Center".
   */
  public static Resource VBRC() {
    _namespace_GOXRef("http://vbrc.org/query.asp?web_id=VBRC:");
  }

  /**
   * Returns the link-out URI for objects of "Vertebrate Genome Annotation database".
   */
  public static Resource VEGA() {
    _namespace_GOXRef("http://vega.sanger.ac.uk/perl/searchview?species=all&idx=All&q=");
  }

  /**
   * Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
   */
  public static Resource VMD() {
    _namespace_GOXRef("http://vmd.vbi.vt.edu/cgi-bin/browse/browserDetail_new.cgi?gene_id=");
  }

  /**
   * Returns the link-out URI for objects of "WormBase database of nematode biology".
   */
  public static Resource WB() {
    _namespace_GOXRef("http://www.wormbase.org/db/gene/gene?name=");
  }

  /**
   * Returns the link-out URI for objects of "WormBase database of nematode biology".
   */
  public static Resource WB_REF() {
    _namespace_GOXRef("http://www.wormbase.org/db/misc/paper?name=");
  }

  /**
   * Returns the link-out URI for objects of "Wikipedia".
   */
  public static Resource Wikipedia() {
    _namespace_GOXRef("http://en.wikipedia.org/wiki/");
  }

  /**
   * Returns the link-out URI for objects of "Wormpep database of proteins of C. elegans".
   */
  public static Resource WP() {
    _namespace_GOXRef("http://www.wormbase.org/db/get?class=Protein;name=WP:");
  }

  /**
   * Returns the link-out URI for objects of "Zebrafish Information Network".
   */
  public static Resource ZFIN() {
    _namespace_GOXRef("http://zfin.org/cgi-bin/ZFIN_jump?record=");
  }

}

}
