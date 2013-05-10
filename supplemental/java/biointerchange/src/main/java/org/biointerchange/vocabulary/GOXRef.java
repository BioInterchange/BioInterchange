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


public class GOXRef {

  /**
   * Returns the link-out URI for objects of "Arabidopsis Genome Initiative".
   */
  public static Resource AGI_LocusCode() {
    return ResourceFactory.createResource("http://arabidopsis.org/servlets/TairObject?type=locus&name=");
  }

  /**
   * Returns the link-out URI for objects of "PlasmoDB Plasmodium Genome Resource".
   */
  public static Resource ApiDB_PlasmoDB() {
    return ResourceFactory.createResource("http://www.plasmodb.org/gene/");
  }

  /**
   * Returns the link-out URI for objects of "AraCyc metabolic pathway database for Arabidopsis thaliana".
   */
  public static Resource AraCyc() {
    return ResourceFactory.createResource("http://www.arabidopsis.org:1555/ARA/NEW-IMAGE?type=NIL&object=");
  }

  /**
   * Returns the link-out URI for objects of "A Systematic Annotation Package for Community Analysis of Genomes".
   */
  public static Resource ASAP() {
    return ResourceFactory.createResource("https://asap.ahabs.wisc.edu/annotation/php/feature_info.php?FeatureID=");
  }

  /**
   * Returns the link-out URI for objects of "Aspergillus Genome Database".
   */
  public static Resource AspGD() {
    return ResourceFactory.createResource("http://www.aspergillusgenome.org/cgi-bin/locus.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Aspergillus Genome Database".
   */
  public static Resource AspGD_LOCUS() {
    return ResourceFactory.createResource("http://www.aspergillusgenome.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Aspergillus Genome Database".
   */
  public static Resource AspGD_REF() {
    return ResourceFactory.createResource("http://www.aspergillusgenome.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Basic Formal Ontology".
   */
  public static Resource BFO() {
    return ResourceFactory.createResource("http://purl.obolibrary.org/obo/BFO_");
  }

  /**
   * Returns the link-out URI for objects of "BioCyc collection of metabolic pathway databases".
   */
  public static Resource BioCyc() {
    return ResourceFactory.createResource("http://biocyc.org/META/NEW-IMAGE?type=PATHWAY&object=");
  }

  /**
   * Returns the link-out URI for objects of "BioModels Database".
   */
  public static Resource BIOMD() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/compneur-srv/biomodels-main/publ-model.do?mid=");
  }

  /**
   * Returns the link-out URI for objects of "BRENDA, The Comprehensive Enzyme Information System".
   */
  public static Resource BRENDA() {
    return ResourceFactory.createResource("http://www.brenda-enzymes.info/php/result_flat.php4?ecno=");
  }

  /**
   * Returns the link-out URI for objects of "Magnaporthe grisea Database".
   */
  public static Resource Broad_MGG() {
    return ResourceFactory.createResource("http://www.broad.mit.edu/annotation/genome/magnaporthe_grisea/GeneLocus.html?sp=S");
  }

  /**
   * Returns the link-out URI for objects of "Catalog of Fishes genus database".
   */
  public static Resource CASGEN() {
    return ResourceFactory.createResource("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Genus&id=");
  }

  /**
   * Returns the link-out URI for objects of "Catalog of Fishes publications database".
   */
  public static Resource CASREF() {
    return ResourceFactory.createResource("http://research.calacademy.org/research/ichthyology/catalog/getref.asp?id=");
  }

  /**
   * Returns the link-out URI for objects of "Catalog of Fishes species database".
   */
  public static Resource CASSPC() {
    return ResourceFactory.createResource("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Species&id=1979");
  }

  /**
   * Returns the link-out URI for objects of "Conserved Domain Database at NCBI".
   */
  public static Resource CDD() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=");
  }

  /**
   * Returns the link-out URI for objects of "Candida Genome Database".
   */
  public static Resource CGD() {
    return ResourceFactory.createResource("http://www.candidagenome.org/cgi-bin/locus.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Candida Genome Database".
   */
  public static Resource CGD_LOCUS() {
    return ResourceFactory.createResource("http://www.candidagenome.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Candida Genome Database".
   */
  public static Resource CGD_REF() {
    return ResourceFactory.createResource("http://www.candidagenome.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Chemical Entities of Biological Interest".
   */
  public static Resource CHEBI() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:");
  }

  /**
   * Returns the link-out URI for objects of "Cell Type Ontology".
   */
  public static Resource CL() {
    return ResourceFactory.createResource("http://purl.obolibrary.org/obo/CL_");
  }

  /**
   * Returns the link-out URI for objects of "NCBI COG cluster".
   */
  public static Resource COG_Cluster() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/COG/new/release/cow.cgi?cog=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI COG function".
   */
  public static Resource COG_Function() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/COG/grace/shokog.cgi?fun=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI COG pathway".
   */
  public static Resource COG_Pathway() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/COG/new/release/coglist.cgi?pathw=");
  }

  /**
   * Returns the link-out URI for objects of "CORUM - the Comprehensive Resource of Mammalian protein complexes".
   */
  public static Resource CORUM() {
    return ResourceFactory.createResource("http://mips.gsf.de/genre/proj/corum/complexdetails.html?id=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI dbSNP".
   */
  public static Resource dbSNP() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=");
  }

  /**
   * Returns the link-out URI for objects of "DNA Databank of Japan".
   */
  public static Resource DDBJ() {
    return ResourceFactory.createResource("http://arsa.ddbj.nig.ac.jp/arsa/ddbjSplSearch?KeyWord=");
  }

  /**
   * Returns the link-out URI for objects of "dictyBase".
   */
  public static Resource dictyBase() {
    return ResourceFactory.createResource("http://dictybase.org/gene/");
  }

  /**
   * Returns the link-out URI for objects of "dictyBase".
   */
  public static Resource dictyBase_gene_name() {
    return ResourceFactory.createResource("http://dictybase.org/gene/");
  }

  /**
   * Returns the link-out URI for objects of "dictyBase literature references".
   */
  public static Resource dictyBase_REF() {
    return ResourceFactory.createResource("http://dictybase.org/db/cgi-bin/dictyBase/reference/reference.pl?refNo=");
  }

  /**
   * Returns the link-out URI for objects of "Digital Object Identifier".
   */
  public static Resource DOI() {
    return ResourceFactory.createResource("http://dx.doi.org/DOI:");
  }

  /**
   * Returns the link-out URI for objects of "Enzyme Commission".
   */
  public static Resource EC() {
    return ResourceFactory.createResource("http://www.expasy.org/enzyme/");
  }

  /**
   * Returns the link-out URI for objects of "EchoBASE post-genomic database for Escherichia coli".
   */
  public static Resource EchoBASE() {
    return ResourceFactory.createResource("http://www.biolws1.york.ac.uk/echobase/Gene.cfm?recordID=");
  }

  /**
   * Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
   */
  public static Resource ECK() {
    return ResourceFactory.createResource("http://www.ecogene.org/geneInfo.php?eck_id=");
  }

  /**
   * Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
   */
  public static Resource EcoCyc() {
    return ResourceFactory.createResource("http://biocyc.org/ECOLI/NEW-IMAGE?type=PATHWAY&object=");
  }

  /**
   * Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
   */
  public static Resource EcoCyc_REF() {
    return ResourceFactory.createResource("http://biocyc.org/ECOLI/reference.html?type=CITATION-FRAME&object=");
  }

  /**
   * Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
   */
  public static Resource ECOGENE() {
    return ResourceFactory.createResource("http://www.ecogene.org/geneInfo.php?eg_id=");
  }

  /**
   * Returns the link-out URI for objects of "EMBL Nucleotide Sequence Database".
   */
  public static Resource EMBL() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/cgi-bin/emblfetch?style=html&Submit=Go&id=");
  }

  /**
   * Returns the link-out URI for objects of "European Nucleotide Archive".
   */
  public static Resource ENA() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/ena/data/view/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL() {
    return ResourceFactory.createResource("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL_GeneID() {
    return ResourceFactory.createResource("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL_ProteinID() {
    return ResourceFactory.createResource("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
   */
  public static Resource ENSEMBL_TranscriptID() {
    return ResourceFactory.createResource("http://www.ensembl.org/id/");
  }

  /**
   * Returns the link-out URI for objects of "Swiss Institute of Bioinformatics enzyme database".
   */
  public static Resource ENZYME() {
    return ResourceFactory.createResource("http://www.expasy.ch/cgi-bin/nicezyme.pl?");
  }

  /**
   * Returns the link-out URI for objects of "Drosophila gross anatomy".
   */
  public static Resource FBbt() {
    return ResourceFactory.createResource("http://flybase.org/cgi-bin/fbcvq.html?query=FBbt:");
  }

  /**
   * Returns the link-out URI for objects of "Human Genome Database".
   */
  public static Resource GDB() {
    return ResourceFactory.createResource("http://www.gdb.org/gdb-bin/genera/accno?accessionNum=GDB:");
  }

  /**
   * Returns the link-out URI for objects of "GenBank".
   */
  public static Resource GenBank() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=nucleotide&val=");
  }

  /**
   * Returns the link-out URI for objects of "Domain Architecture Classification".
   */
  public static Resource Gene3D() {
    return ResourceFactory.createResource("http://gene3d.biochem.ucl.ac.uk/superfamily/?accession=");
  }

  /**
   * Returns the link-out URI for objects of "Glossina morsitans GeneDB".
   */
  public static Resource GeneDB_Gmorsitans() {
    return ResourceFactory.createResource("http://www.genedb.org/genedb/Search?organism=glossina&name=");
  }

  /**
   * Returns the link-out URI for objects of "Leishmania major GeneDB".
   */
  public static Resource GeneDB_Lmajor() {
    return ResourceFactory.createResource("http://www.genedb.org/genedb/Search?organism=leish&name=");
  }

  /**
   * Returns the link-out URI for objects of "Plasmodium falciparum GeneDB".
   */
  public static Resource GeneDB_Pfalciparum() {
    return ResourceFactory.createResource("http://www.genedb.org/genedb/Search?organism=malaria&name=");
  }

  /**
   * Returns the link-out URI for objects of "Schizosaccharomyces pombe GeneDB".
   */
  public static Resource GeneDB_Spombe() {
    return ResourceFactory.createResource("http://old.genedb.org/genedb/Search?organism=pombe&name=");
  }

  /**
   * Returns the link-out URI for objects of "Trypanosoma brucei GeneDB".
   */
  public static Resource GeneDB_Tbrucei() {
    return ResourceFactory.createResource("http://www.genedb.org/genedb/Search?organism=tryp&name=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI Gene Expression Omnibus".
   */
  public static Resource GEO() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/sites/GDSbrowser?acc=");
  }

  /**
   * Returns the link-out URI for objects of "Gene Ontology Database".
   */
  public static Resource GO() {
    return ResourceFactory.createResource("http://amigo.geneontology.org/cgi-bin/amigo/term-details.cgi?term=GO:");
  }

  /**
   * Returns the link-out URI for objects of "Gene Ontology Database references".
   */
  public static Resource GO_REF() {
    return ResourceFactory.createResource("http://www.geneontology.org/cgi-bin/references.cgi#GO_REF:");
  }

  /**
   * Returns the link-out URI for objects of "Gene Ontology Normal Usage Tracking System (GONUTS)".
   */
  public static Resource GONUTS() {
    return ResourceFactory.createResource("http://gowiki.tamu.edu/wiki/index.php/");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR() {
    return ResourceFactory.createResource("http://www.gramene.org/db/searches/browser?search_type=All&RGN=on&query=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_GENE() {
    return ResourceFactory.createResource("http://www.gramene.org/db/genes/search_gene?acc=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_PROTEIN() {
    return ResourceFactory.createResource("http://www.gramene.org/db/protein/protein_search?acc=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_QTL() {
    return ResourceFactory.createResource("http://www.gramene.org/db/qtl/qtl_display?qtl_accession_id=");
  }

  /**
   * Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
   */
  public static Resource GR_REF() {
    return ResourceFactory.createResource("http://www.gramene.org/db/literature/pub_search?ref_id=");
  }

  /**
   * Returns the link-out URI for objects of "H-invitational Database".
   */
  public static Resource H_invDB_cDNA() {
    return ResourceFactory.createResource("http://www.h-invitational.jp/hinv/spsoup/transcript_view?acc_id=");
  }

  /**
   * Returns the link-out URI for objects of "H-invitational Database".
   */
  public static Resource H_invDB_locus() {
    return ResourceFactory.createResource("http://www.h-invitational.jp/hinv/spsoup/locus_view?hix_id=");
  }

  /**
   * Returns the link-out URI for objects of "High-quality Automated and Manual Annotation of microbial Proteomes".
   */
  public static Resource HAMAP() {
    return ResourceFactory.createResource("http://us.expasy.org/unirules/");
  }

  /**
   * Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
   */
  public static Resource HGNC() {
    return ResourceFactory.createResource("http://www.genenames.org/data/hgnc_data.php?hgnc_id=HGNC:");
  }

  /**
   * Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
   */
  public static Resource HGNC_gene() {
    return ResourceFactory.createResource("http://www.genenames.org/data/hgnc_data.php?app_sym=");
  }

  /**
   * Returns the link-out URI for objects of "Human Protein Atlas tissue profile information".
   */
  public static Resource HPA() {
    return ResourceFactory.createResource("http://www.proteinatlas.org/tissue_profile.php?antibody_id=");
  }

  /**
   * Returns the link-out URI for objects of "Human Protein Atlas antibody information".
   */
  public static Resource HPA_antibody() {
    return ResourceFactory.createResource("http://www.proteinatlas.org/antibody_info.php?antibody_id=");
  }

  /**
   * Returns the link-out URI for objects of "Integrated Microbial Genomes; JGI web site for genome annotation".
   */
  public static Resource IMG() {
    return ResourceFactory.createResource("http://img.jgi.doe.gov/cgi-bin/pub/main.cgi?section=GeneDetail&page=geneDetail&gene_oid=");
  }

  /**
   * Returns the link-out URI for objects of "IntAct protein interaction database".
   */
  public static Resource IntAct() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/intact/search/do/search?searchString=");
  }

  /**
   * Returns the link-out URI for objects of "InterPro database of protein domains and motifs".
   */
  public static Resource InterPro() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/interpro/IEntry?ac=");
  }

  /**
   * Returns the link-out URI for objects of "International Standard Book Number".
   */
  public static Resource ISBN() {
    return ResourceFactory.createResource("http://my.linkbaton.com/get?lbCC=q&nC=q&genre=book&item=");
  }

  /**
   * Returns the link-out URI for objects of "International Union of Pharmacology".
   */
  public static Resource IUPHAR_GPCR() {
    return ResourceFactory.createResource("http://www.iuphar-db.org/DATABASE/FamilyMenuForward?familyId=");
  }

  /**
   * Returns the link-out URI for objects of "International Union of Pharmacology".
   */
  public static Resource IUPHAR_RECEPTOR() {
    return ResourceFactory.createResource("http://www.iuphar-db.org/DATABASE/ObjectDisplayForward?objectId=");
  }

  /**
   * Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
   */
  public static Resource JCVI_CMR() {
    return ResourceFactory.createResource("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenePage.cgi?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
   */
  public static Resource JCVI_EGAD() {
    return ResourceFactory.createResource("http://cmr.jcvi.org/cgi-bin/CMR/EgadSearch.cgi?search_string=");
  }

  /**
   * Returns the link-out URI for objects of "Genome Properties database at the J. Craig Venter Institute".
   */
  public static Resource JCVI_GenProp() {
    return ResourceFactory.createResource("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenomePropDefinition.cgi?prop_acc=");
  }

  /**
   * Returns the link-out URI for objects of "Medicago truncatula genome database at the J. Craig Venter Institute ".
   */
  public static Resource JCVI_Medtr() {
    return ResourceFactory.createResource("http://medicago.jcvi.org/cgi-bin/medicago/search/shared/ORF_infopage.cgi?orf=");
  }

  /**
   * Returns the link-out URI for objects of "TIGRFAMs HMM collection at the J. Craig Venter Institute".
   */
  public static Resource JCVI_TIGRFAMS() {
    return ResourceFactory.createResource("http://search.jcvi.org/search?p&q=");
  }

  /**
   * Returns the link-out URI for objects of "Digital archive of scholarly articles".
   */
  public static Resource JSTOR() {
    return ResourceFactory.createResource("http://www.jstor.org/stable/");
  }

  /**
   * Returns the link-out URI for objects of "KEGG Enzyme Database".
   */
  public static Resource KEGG_ENZYME() {
    return ResourceFactory.createResource("http://www.genome.jp/dbget-bin/www_bget?ec:");
  }

  /**
   * Returns the link-out URI for objects of "KEGG LIGAND Database".
   */
  public static Resource KEGG_LIGAND() {
    return ResourceFactory.createResource("http://www.genome.jp/dbget-bin/www_bget?cpd:");
  }

  /**
   * Returns the link-out URI for objects of "KEGG Pathways Database".
   */
  public static Resource KEGG_PATHWAY() {
    return ResourceFactory.createResource("http://www.genome.jp/dbget-bin/www_bget?path:");
  }

  /**
   * Returns the link-out URI for objects of "KEGG Reaction Database".
   */
  public static Resource KEGG_REACTION() {
    return ResourceFactory.createResource("http://www.genome.jp/dbget-bin/www_bget?rn:");
  }

  /**
   * Returns the link-out URI for objects of "LifeDB".
   */
  public static Resource LIFEdb() {
    return ResourceFactory.createResource("http://www.dkfz.de/LIFEdb/LIFEdb.aspx?ID=");
  }

  /**
   * Returns the link-out URI for objects of "Adult Mouse Anatomical Dictionary".
   */
  public static Resource MA() {
    return ResourceFactory.createResource("http://www.informatics.jax.org/searches/AMA.cgi?id=MA:");
  }

  /**
   * Returns the link-out URI for objects of "MaizeGDB".
   */
  public static Resource MaizeGDB() {
    return ResourceFactory.createResource("http://www.maizegdb.org/cgi-bin/id_search.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "MaizeGDB".
   */
  public static Resource MaizeGDB_Locus() {
    return ResourceFactory.createResource("http://www.maizegdb.org/cgi-bin/displaylocusresults.cgi?term=");
  }

  /**
   * Returns the link-out URI for objects of "MEROPS peptidase database".
   */
  public static Resource MEROPS() {
    return ResourceFactory.createResource("http://merops.sanger.ac.uk/cgi-bin/pepsum?mid=");
  }

  /**
   * Returns the link-out URI for objects of "MEROPS peptidase database".
   */
  public static Resource MEROPS_fam() {
    return ResourceFactory.createResource("http://merops.sanger.ac.uk/cgi-bin/famsum?family=");
  }

  /**
   * Returns the link-out URI for objects of "Medical Subject Headings".
   */
  public static Resource MeSH() {
    return ResourceFactory.createResource("http://www.nlm.nih.gov/cgi/mesh/2005/MB_cgi?mode=&term=");
  }

  /**
   * Returns the link-out URI for objects of "Metabolic Encyclopedia of metabolic and other pathways".
   */
  public static Resource MetaCyc() {
    return ResourceFactory.createResource("http://biocyc.org/META/NEW-IMAGE?type=NIL&object=");
  }

  /**
   * Returns the link-out URI for objects of "Mouse Genome Informatics".
   */
  public static Resource MGI() {
    return ResourceFactory.createResource("http://www.informatics.jax.org/accession/");
  }

  /**
   * Returns the link-out URI for objects of "MIPS Functional Catalogue".
   */
  public static Resource MIPS_funcat() {
    return ResourceFactory.createResource("http://mips.gsf.de/cgi-bin/proj/funcatDB/search_advanced.pl?action=2&wert=");
  }

  /**
   * Returns the link-out URI for objects of "MGED Ontology".
   */
  public static Resource MO() {
    return ResourceFactory.createResource("http://mged.sourceforge.net/ontologies/MGEDontology.php#");
  }

  /**
   * Returns the link-out URI for objects of "ModBase comprehensive Database of Comparative Protein Structure Models".
   */
  public static Resource ModBase() {
    return ResourceFactory.createResource("http://salilab.org/modbase/searchbyid?databaseID=");
  }

  /**
   * Returns the link-out URI for objects of "Nottingham Arabidopsis Stock Centre Seeds Database".
   */
  public static Resource NASC_code() {
    return ResourceFactory.createResource("http://seeds.nottingham.ac.uk/NASC/stockatidb.lasso?code=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI Gene".
   */
  public static Resource NCBI_Gene() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI databases".
   */
  public static Resource NCBI_gi() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI GenPept".
   */
  public static Resource NCBI_GP() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=protein&val=");
  }

  /**
   * Returns the link-out URI for objects of "Neuroscience Information Framework standard ontology, subcellular hierarchy".
   */
  public static Resource NIF_Subcellular() {
    return ResourceFactory.createResource("http://www.neurolex.org/wiki/");
  }

  /**
   * Returns the link-out URI for objects of "National Microbial Pathogen Data Resource".
   */
  public static Resource NMPDR() {
    return ResourceFactory.createResource("http://www.nmpdr.org/linkin.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "Mendelian Inheritance in Man".
   */
  public static Resource OMIM() {
    return ResourceFactory.createResource("http://omim.org/entry/");
  }

  /**
   * Returns the link-out URI for objects of "Genome Annotation Tool (Agrobacterium tumefaciens C58); PAMGO Interest Group".
   */
  public static Resource PAMGO_GAT() {
    return ResourceFactory.createResource("http://agro.vbi.vt.edu/public/servlet/GeneEdit?&Search=Search&level=2&genename=");
  }

  /**
   * Returns the link-out URI for objects of "Magnaporthe grisea database".
   */
  public static Resource PAMGO_MGG() {
    return ResourceFactory.createResource("http://scotland.fgl.ncsu.edu/cgi-bin/adHocQuery.cgi?adHocQuery_dbName=smeng_goannotation&Action=Data&QueryName=Functional+Categorization+of+MGG+GO+Annotation&P_KeyWord=");
  }

  /**
   * Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
   */
  public static Resource PAMGO_VMD() {
    return ResourceFactory.createResource("http://vmd.vbi.vt.edu/cgi-bin/browse/go_detail.cgi?gene_id=");
  }

  /**
   * Returns the link-out URI for objects of "Protein ANalysis THrough Evolutionary Relationships".
   */
  public static Resource PANTHER() {
    return ResourceFactory.createResource("http://pantree.org/node/annotationNode.jsp?id=");
  }

  /**
   * Returns the link-out URI for objects of "PathoSystems Resource Integration Center".
   */
  public static Resource PATRIC() {
    return ResourceFactory.createResource("http://patric.vbi.vt.edu/gene/overview.php?fid=");
  }

  /**
   * Returns the link-out URI for objects of "Protein Data Bank".
   */
  public static Resource PDB() {
    return ResourceFactory.createResource("http://www.rcsb.org/pdb/cgi/explore.cgi?pdbId=");
  }

  /**
   * Returns the link-out URI for objects of "Pfam database of protein families".
   */
  public static Resource Pfam() {
    return ResourceFactory.createResource("http://www.sanger.ac.uk/cgi-bin/Pfam/getacc?");
  }

  /**
   * Returns the link-out URI for objects of "Pharmacogenetics and Pharmacogenomics Knowledge Base".
   */
  public static Resource PharmGKB() {
    return ResourceFactory.createResource("http://www.pharmgkb.org/do/serve?objId=");
  }

  /**
   * Returns the link-out URI for objects of "Protein Information Resource".
   */
  public static Resource PIR() {
    return ResourceFactory.createResource("http://pir.georgetown.edu/cgi-bin/pirwww/nbrfget?uid=");
  }

  /**
   * Returns the link-out URI for objects of "PIR Superfamily Classification System".
   */
  public static Resource PIRSF() {
    return ResourceFactory.createResource("http://pir.georgetown.edu/cgi-bin/ipcSF?id=");
  }

  /**
   * Returns the link-out URI for objects of "Pubmed Central".
   */
  public static Resource PMCID() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/sites/entrez?db=pmc&cmd=search&term=");
  }

  /**
   * Returns the link-out URI for objects of "PubMed".
   */
  public static Resource PMID() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/pubmed/");
  }

  /**
   * Returns the link-out URI for objects of "Plant Ontology Consortium Database".
   */
  public static Resource PO() {
    return ResourceFactory.createResource("http://www.plantontology.org/amigo/go.cgi?action=query&view=query&search_constraint=terms&query=PO:");
  }

  /**
   * Returns the link-out URI for objects of "Plant Ontology custom references".
   */
  public static Resource PO_REF() {
    return ResourceFactory.createResource("http://wiki.plantontology.org:8080/index.php/PO_REF:");
  }

  /**
   * Returns the link-out URI for objects of "PomBase".
   */
  public static Resource PomBase() {
    return ResourceFactory.createResource("http://www.pombase.org/spombe/result/");
  }

  /**
   * Returns the link-out URI for objects of "Protein Ontology".
   */
  public static Resource PR() {
    return ResourceFactory.createResource("http://www.proconsortium.org/cgi-bin/pro/entry_pro?id=PR:");
  }

  /**
   * Returns the link-out URI for objects of "PRINTS compendium of protein fingerprints".
   */
  public static Resource PRINTS() {
    return ResourceFactory.createResource("http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/sprint/searchprintss.cgi?display_opts=Prints&category=None&queryform=false&regexpr=off&prints_accn=");
  }

  /**
   * Returns the link-out URI for objects of "ProDom protein domain families".
   */
  public static Resource ProDom() {
    return ResourceFactory.createResource("http://prodom.prabi.fr/prodom/current/cgi-bin/request.pl?question=DBEN&query=");
  }

  /**
   * Returns the link-out URI for objects of "Prosite database of protein families and domains".
   */
  public static Resource Prosite() {
    return ResourceFactory.createResource("http://www.expasy.ch/cgi-bin/prosite-search-ac?");
  }

  /**
   * Returns the link-out URI for objects of "Pseudomonas Genome Project".
   */
  public static Resource PseudoCAP() {
    return ResourceFactory.createResource("http://v2.pseudomonas.com/getAnnotation.do?locusID=");
  }

  /**
   * Returns the link-out URI for objects of "Proteomics Standards Initiative protein modification ontology".
   */
  public static Resource PSI_MOD() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/ontology-lookup/?termId=MOD:");
  }

  /**
   * Returns the link-out URI for objects of "NCBI PubChem database of bioassay records".
   */
  public static Resource PubChem_BioAssay() {
    return ResourceFactory.createResource("http://pubchem.ncbi.nlm.nih.gov/assay/assay.cgi?aid=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI PubChem database of chemical structures".
   */
  public static Resource PubChem_Compound() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI PubChem database of chemical substances".
   */
  public static Resource PubChem_Substance() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pcsubstance&term=");
  }

  /**
   * Returns the link-out URI for objects of "Reactome - a curated knowledgebase of biological pathways".
   */
  public static Resource Reactome() {
    return ResourceFactory.createResource("http://www.reactome.org/cgi-bin/eventbrowser_st_id?ST_ID=");
  }

  /**
   * Returns the link-out URI for objects of "RefSeq".
   */
  public static Resource RefSeq() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "RefSeq (Nucleic Acid)".
   */
  public static Resource RefSeq_NA() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "RefSeq (Protein)".
   */
  public static Resource RefSeq_Prot() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=");
  }

  /**
   * Returns the link-out URI for objects of "Rfam database of RNA families".
   */
  public static Resource Rfam() {
    return ResourceFactory.createResource("http://rfam.sanger.ac.uk/family/");
  }

  /**
   * Returns the link-out URI for objects of "Rat Genome Database".
   */
  public static Resource RGD() {
    return ResourceFactory.createResource("http://rgd.mcw.edu/generalSearch/RgdSearch.jsp?quickSearch=1&searchKeyword=");
  }

  /**
   * Returns the link-out URI for objects of "Rhea, the Annotated Reactions Database".
   */
  public static Resource RHEA() {
    return ResourceFactory.createResource("http://www.ebi.ac.uk/rhea/reaction.xhtml?id=");
  }

  /**
   * Returns the link-out URI for objects of "RNA Modification Database".
   */
  public static Resource RNAmods() {
    return ResourceFactory.createResource("http://s59.cas.albany.edu/RNAmods/cgi-bin/rnashow.cgi?");
  }

  /**
   * Returns the link-out URI for objects of "OBO Relation Ontology Ontology".
   */
  public static Resource RO() {
    return ResourceFactory.createResource("http://purl.obolibrary.org/obo/RO_");
  }

  /**
   * Returns the link-out URI for objects of "SABIO Reaction Kinetics".
   */
  public static Resource SABIO_RK() {
    return ResourceFactory.createResource("http://sabio.villa-bosch.de/reacdetails.jsp?reactid=");
  }

  /**
   * Returns the link-out URI for objects of "The SEED;".
   */
  public static Resource SEED() {
    return ResourceFactory.createResource("http://www.theseed.org/linkin.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "Saccharomyces Genome Database".
   */
  public static Resource SGD() {
    return ResourceFactory.createResource("http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Saccharomyces Genome Database".
   */
  public static Resource SGD_LOCUS() {
    return ResourceFactory.createResource("http://db.yeastgenome.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Saccharomyces Genome Database".
   */
  public static Resource SGD_REF() {
    return ResourceFactory.createResource("http://db.yeastgenome.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "Sol Genomics Network".
   */
  public static Resource SGN() {
    return ResourceFactory.createResource("http://www.sgn.cornell.edu/phenome/locus_display.pl?locus_id=");
  }

  /**
   * Returns the link-out URI for objects of "Sol Genomics Network".
   */
  public static Resource SGN_ref() {
    return ResourceFactory.createResource("http://www.sgn.cornell.edu/chado/publication.pl?pub_id=");
  }

  /**
   * Returns the link-out URI for objects of "Simple Modular Architecture Research Tool".
   */
  public static Resource SMART() {
    return ResourceFactory.createResource("http://smart.embl-heidelberg.de/smart/do_annotation.pl?BLAST=DUMMY&DOMAIN=");
  }

  /**
   * Returns the link-out URI for objects of "Sequence Ontology".
   */
  public static Resource SO() {
    return ResourceFactory.createResource("http://song.sourceforge.net/SOterm_tables.html#SO:");
  }

  /**
   * Returns the link-out URI for objects of "SUPERFAMILY protein annotation database".
   */
  public static Resource SUPERFAMILY() {
    return ResourceFactory.createResource("http://supfam.cs.bris.ac.uk/SUPERFAMILY/cgi-bin/scop.cgi?ipid=SSF");
  }

  /**
   * Returns the link-out URI for objects of "UniProtKB/Swiss-Prot".
   */
  public static Resource Swiss_Prot() {
    return ResourceFactory.createResource("http://www.uniprot.org/uniprot/");
  }

  /**
   * Returns the link-out URI for objects of "The Arabidopsis Information Resource".
   */
  public static Resource TAIR() {
    return ResourceFactory.createResource("http://arabidopsis.org/servlets/TairObject?accession=");
  }

  /**
   * Returns the link-out URI for objects of "NCBI Taxonomy".
   */
  public static Resource taxon() {
    return ResourceFactory.createResource("http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=");
  }

  /**
   * Returns the link-out URI for objects of "Transport Protein Database".
   */
  public static Resource TC() {
    return ResourceFactory.createResource("http://www.tcdb.org/tcdb/index.php?tc=");
  }

  /**
   * Returns the link-out URI for objects of "Tetrahymena Genome Database".
   */
  public static Resource TGD_LOCUS() {
    return ResourceFactory.createResource("http://db.ciliate.org/cgi-bin/locus.pl?locus=");
  }

  /**
   * Returns the link-out URI for objects of "Tetrahymena Genome Database".
   */
  public static Resource TGD_REF() {
    return ResourceFactory.createResource("http://db.ciliate.org/cgi-bin/reference/reference.pl?dbid=");
  }

  /**
   * Returns the link-out URI for objects of "UniProtKB-TrEMBL protein sequence database".
   */
  public static Resource TrEMBL() {
    return ResourceFactory.createResource("http://www.uniprot.org/uniprot/");
  }

  /**
   * Returns the link-out URI for objects of "Uber-anatomy ontology".
   */
  public static Resource UBERON() {
    return ResourceFactory.createResource("http://purl.obolibrary.org/obo/UBERON_");
  }

  /**
   * Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
   */
  public static Resource UM_BBD_enzymeID() {
    return ResourceFactory.createResource("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=ep&enzymeID=");
  }

  /**
   * Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
   */
  public static Resource UM_BBD_reactionID() {
    return ResourceFactory.createResource("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=r&reacID=");
  }

  /**
   * Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
   */
  public static Resource UM_BBD_ruleID() {
    return ResourceFactory.createResource("http://umbbd.msi.umn.edu/servlets/rule.jsp?rule=");
  }

  /**
   * Returns the link-out URI for objects of "UniMod".
   */
  public static Resource UniMod() {
    return ResourceFactory.createResource("http://www.unimod.org/modifications_view.php?editid1=");
  }

  /**
   * Returns the link-out URI for objects of "UniProt Archive".
   */
  public static Resource UniParc() {
    return ResourceFactory.createResource("http://www.uniprot.org/uniparc/");
  }

  /**
   * Returns the link-out URI for objects of "UniPathway".
   */
  public static Resource UniPathway() {
    return ResourceFactory.createResource("http://www.grenoble.prabi.fr/obiwarehouse/unipathway/upa?upid=");
  }

  /**
   * Returns the link-out URI for objects of "Universal Protein Knowledgebase".
   */
  public static Resource UniProtKB() {
    return ResourceFactory.createResource("http://www.uniprot.org/uniprot/");
  }

  /**
   * Returns the link-out URI for objects of "UniProt Knowledgebase keywords".
   */
  public static Resource UniProtKB_KW() {
    return ResourceFactory.createResource("http://www.uniprot.org/keywords/");
  }

  /**
   * Returns the link-out URI for objects of "UniProt Knowledgebase Subcellular Location vocabulary".
   */
  public static Resource UniProtKB_SubCell() {
    return ResourceFactory.createResource("http://www.uniprot.org/locations/");
  }

  /**
   * Returns the link-out URI for objects of "Viral Bioinformatics Resource Center".
   */
  public static Resource VBRC() {
    return ResourceFactory.createResource("http://vbrc.org/query.asp?web_id=VBRC:");
  }

  /**
   * Returns the link-out URI for objects of "Vertebrate Genome Annotation database".
   */
  public static Resource VEGA() {
    return ResourceFactory.createResource("http://vega.sanger.ac.uk/perl/searchview?species=all&idx=All&q=");
  }

  /**
   * Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
   */
  public static Resource VMD() {
    return ResourceFactory.createResource("http://vmd.vbi.vt.edu/cgi-bin/browse/browserDetail_new.cgi?gene_id=");
  }

  /**
   * Returns the link-out URI for objects of "WormBase database of nematode biology".
   */
  public static Resource WB() {
    return ResourceFactory.createResource("http://www.wormbase.org/db/gene/gene?name=");
  }

  /**
   * Returns the link-out URI for objects of "WormBase database of nematode biology".
   */
  public static Resource WB_REF() {
    return ResourceFactory.createResource("http://www.wormbase.org/db/misc/paper?name=");
  }

  /**
   * Returns the link-out URI for objects of "Wikipedia".
   */
  public static Resource Wikipedia() {
    return ResourceFactory.createResource("http://en.wikipedia.org/wiki/");
  }

  /**
   * Returns the link-out URI for objects of "Wormpep database of proteins of C. elegans".
   */
  public static Resource WP() {
    return ResourceFactory.createResource("http://www.wormbase.org/db/get?class=Protein;name=WP:");
  }

  /**
   * Returns the link-out URI for objects of "Zebrafish Information Network".
   */
  public static Resource ZFIN() {
    return ResourceFactory.createResource("http://zfin.org/cgi-bin/ZFIN_jump?record=");
  }

}

