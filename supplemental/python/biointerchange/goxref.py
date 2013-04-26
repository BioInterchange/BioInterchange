import rdflib

from rdflib import Namespace

module BioInterchange

class GOXRef:

    @classmethod
    def AGI_LocusCode(cls):
        """Returns the link-out URI for objects of "Arabidopsis Genome Initiative".
        """
        _namespace_GOXRef("http://arabidopsis.org/servlets/TairObject?type=locus&name=")

    @classmethod
    def ApiDB_PlasmoDB(cls):
        """Returns the link-out URI for objects of "PlasmoDB Plasmodium Genome Resource".
        """
        _namespace_GOXRef("http://www.plasmodb.org/gene/")

    @classmethod
    def AraCyc(cls):
        """Returns the link-out URI for objects of "AraCyc metabolic pathway database for Arabidopsis thaliana".
        """
        _namespace_GOXRef("http://www.arabidopsis.org:1555/ARA/NEW-IMAGE?type=NIL&object=")

    @classmethod
    def ASAP(cls):
        """Returns the link-out URI for objects of "A Systematic Annotation Package for Community Analysis of Genomes".
        """
        _namespace_GOXRef("https://asap.ahabs.wisc.edu/annotation/php/feature_info.php?FeatureID=")

    @classmethod
    def AspGD(cls):
        """Returns the link-out URI for objects of "Aspergillus Genome Database".
        """
        _namespace_GOXRef("http://www.aspergillusgenome.org/cgi-bin/locus.pl?dbid=")

    @classmethod
    def AspGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Aspergillus Genome Database".
        """
        _namespace_GOXRef("http://www.aspergillusgenome.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def AspGD_REF(cls):
        """Returns the link-out URI for objects of "Aspergillus Genome Database".
        """
        _namespace_GOXRef("http://www.aspergillusgenome.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def BFO(cls):
        """Returns the link-out URI for objects of "Basic Formal Ontology".
        """
        _namespace_GOXRef("http://purl.obolibrary.org/obo/BFO_")

    @classmethod
    def BioCyc(cls):
        """Returns the link-out URI for objects of "BioCyc collection of metabolic pathway databases".
        """
        _namespace_GOXRef("http://biocyc.org/META/NEW-IMAGE?type=PATHWAY&object=")

    @classmethod
    def BIOMD(cls):
        """Returns the link-out URI for objects of "BioModels Database".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/compneur-srv/biomodels-main/publ-model.do?mid=")

    @classmethod
    def BRENDA(cls):
        """Returns the link-out URI for objects of "BRENDA, The Comprehensive Enzyme Information System".
        """
        _namespace_GOXRef("http://www.brenda-enzymes.info/php/result_flat.php4?ecno=")

    @classmethod
    def Broad_MGG(cls):
        """Returns the link-out URI for objects of "Magnaporthe grisea Database".
        """
        _namespace_GOXRef("http://www.broad.mit.edu/annotation/genome/magnaporthe_grisea/GeneLocus.html?sp=S")

    @classmethod
    def CASGEN(cls):
        """Returns the link-out URI for objects of "Catalog of Fishes genus database".
        """
        _namespace_GOXRef("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Genus&id=")

    @classmethod
    def CASREF(cls):
        """Returns the link-out URI for objects of "Catalog of Fishes publications database".
        """
        _namespace_GOXRef("http://research.calacademy.org/research/ichthyology/catalog/getref.asp?id=")

    @classmethod
    def CASSPC(cls):
        """Returns the link-out URI for objects of "Catalog of Fishes species database".
        """
        _namespace_GOXRef("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Species&id=1979")

    @classmethod
    def CDD(cls):
        """Returns the link-out URI for objects of "Conserved Domain Database at NCBI".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=")

    @classmethod
    def CGD(cls):
        """Returns the link-out URI for objects of "Candida Genome Database".
        """
        _namespace_GOXRef("http://www.candidagenome.org/cgi-bin/locus.pl?dbid=")

    @classmethod
    def CGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Candida Genome Database".
        """
        _namespace_GOXRef("http://www.candidagenome.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def CGD_REF(cls):
        """Returns the link-out URI for objects of "Candida Genome Database".
        """
        _namespace_GOXRef("http://www.candidagenome.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def CHEBI(cls):
        """Returns the link-out URI for objects of "Chemical Entities of Biological Interest".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:")

    @classmethod
    def CL(cls):
        """Returns the link-out URI for objects of "Cell Type Ontology".
        """
        _namespace_GOXRef("http://purl.obolibrary.org/obo/CL_")

    @classmethod
    def COG_Cluster(cls):
        """Returns the link-out URI for objects of "NCBI COG cluster".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/COG/new/release/cow.cgi?cog=")

    @classmethod
    def COG_Function(cls):
        """Returns the link-out URI for objects of "NCBI COG function".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/COG/grace/shokog.cgi?fun=")

    @classmethod
    def COG_Pathway(cls):
        """Returns the link-out URI for objects of "NCBI COG pathway".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/COG/new/release/coglist.cgi?pathw=")

    @classmethod
    def CORUM(cls):
        """Returns the link-out URI for objects of "CORUM - the Comprehensive Resource of Mammalian protein complexes".
        """
        _namespace_GOXRef("http://mips.gsf.de/genre/proj/corum/complexdetails.html?id=")

    @classmethod
    def dbSNP(cls):
        """Returns the link-out URI for objects of "NCBI dbSNP".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=")

    @classmethod
    def DDBJ(cls):
        """Returns the link-out URI for objects of "DNA Databank of Japan".
        """
        _namespace_GOXRef("http://arsa.ddbj.nig.ac.jp/arsa/ddbjSplSearch?KeyWord=")

    @classmethod
    def dictyBase(cls):
        """Returns the link-out URI for objects of "dictyBase".
        """
        _namespace_GOXRef("http://dictybase.org/gene/")

    @classmethod
    def dictyBase_gene_name(cls):
        """Returns the link-out URI for objects of "dictyBase".
        """
        _namespace_GOXRef("http://dictybase.org/gene/")

    @classmethod
    def dictyBase_REF(cls):
        """Returns the link-out URI for objects of "dictyBase literature references".
        """
        _namespace_GOXRef("http://dictybase.org/db/cgi-bin/dictyBase/reference/reference.pl?refNo=")

    @classmethod
    def DOI(cls):
        """Returns the link-out URI for objects of "Digital Object Identifier".
        """
        _namespace_GOXRef("http://dx.doi.org/DOI:")

    @classmethod
    def EC(cls):
        """Returns the link-out URI for objects of "Enzyme Commission".
        """
        _namespace_GOXRef("http://www.expasy.org/enzyme/")

    @classmethod
    def EchoBASE(cls):
        """Returns the link-out URI for objects of "EchoBASE post-genomic database for Escherichia coli".
        """
        _namespace_GOXRef("http://www.biolws1.york.ac.uk/echobase/Gene.cfm?recordID=")

    @classmethod
    def ECK(cls):
        """Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
        """
        _namespace_GOXRef("http://www.ecogene.org/geneInfo.php?eck_id=")

    @classmethod
    def EcoCyc(cls):
        """Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
        """
        _namespace_GOXRef("http://biocyc.org/ECOLI/NEW-IMAGE?type=PATHWAY&object=")

    @classmethod
    def EcoCyc_REF(cls):
        """Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
        """
        _namespace_GOXRef("http://biocyc.org/ECOLI/reference.html?type=CITATION-FRAME&object=")

    @classmethod
    def ECOGENE(cls):
        """Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
        """
        _namespace_GOXRef("http://www.ecogene.org/geneInfo.php?eg_id=")

    @classmethod
    def EMBL(cls):
        """Returns the link-out URI for objects of "EMBL Nucleotide Sequence Database".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/cgi-bin/emblfetch?style=html&Submit=Go&id=")

    @classmethod
    def ENA(cls):
        """Returns the link-out URI for objects of "European Nucleotide Archive".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/ena/data/view/")

    @classmethod
    def ENSEMBL(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        _namespace_GOXRef("http://www.ensembl.org/id/")

    @classmethod
    def ENSEMBL_GeneID(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        _namespace_GOXRef("http://www.ensembl.org/id/")

    @classmethod
    def ENSEMBL_ProteinID(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        _namespace_GOXRef("http://www.ensembl.org/id/")

    @classmethod
    def ENSEMBL_TranscriptID(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        _namespace_GOXRef("http://www.ensembl.org/id/")

    @classmethod
    def ENZYME(cls):
        """Returns the link-out URI for objects of "Swiss Institute of Bioinformatics enzyme database".
        """
        _namespace_GOXRef("http://www.expasy.ch/cgi-bin/nicezyme.pl?")

    @classmethod
    def FBbt(cls):
        """Returns the link-out URI for objects of "Drosophila gross anatomy".
        """
        _namespace_GOXRef("http://flybase.org/cgi-bin/fbcvq.html?query=FBbt:")

    @classmethod
    def GDB(cls):
        """Returns the link-out URI for objects of "Human Genome Database".
        """
        _namespace_GOXRef("http://www.gdb.org/gdb-bin/genera/accno?accessionNum=GDB:")

    @classmethod
    def GenBank(cls):
        """Returns the link-out URI for objects of "GenBank".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=nucleotide&val=")

    @classmethod
    def Gene3D(cls):
        """Returns the link-out URI for objects of "Domain Architecture Classification".
        """
        _namespace_GOXRef("http://gene3d.biochem.ucl.ac.uk/superfamily/?accession=")

    @classmethod
    def GeneDB_Gmorsitans(cls):
        """Returns the link-out URI for objects of "Glossina morsitans GeneDB".
        """
        _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=glossina&name=")

    @classmethod
    def GeneDB_Lmajor(cls):
        """Returns the link-out URI for objects of "Leishmania major GeneDB".
        """
        _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=leish&name=")

    @classmethod
    def GeneDB_Pfalciparum(cls):
        """Returns the link-out URI for objects of "Plasmodium falciparum GeneDB".
        """
        _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=malaria&name=")

    @classmethod
    def GeneDB_Spombe(cls):
        """Returns the link-out URI for objects of "Schizosaccharomyces pombe GeneDB".
        """
        _namespace_GOXRef("http://old.genedb.org/genedb/Search?organism=pombe&name=")

    @classmethod
    def GeneDB_Tbrucei(cls):
        """Returns the link-out URI for objects of "Trypanosoma brucei GeneDB".
        """
        _namespace_GOXRef("http://www.genedb.org/genedb/Search?organism=tryp&name=")

    @classmethod
    def GEO(cls):
        """Returns the link-out URI for objects of "NCBI Gene Expression Omnibus".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/sites/GDSbrowser?acc=")

    @classmethod
    def GO(cls):
        """Returns the link-out URI for objects of "Gene Ontology Database".
        """
        _namespace_GOXRef("http://amigo.geneontology.org/cgi-bin/amigo/term-details.cgi?term=GO:")

    @classmethod
    def GO_REF(cls):
        """Returns the link-out URI for objects of "Gene Ontology Database references".
        """
        _namespace_GOXRef("http://www.geneontology.org/cgi-bin/references.cgi#GO_REF:")

    @classmethod
    def GONUTS(cls):
        """Returns the link-out URI for objects of "Gene Ontology Normal Usage Tracking System (cls, GONUTS)".
        """
        _namespace_GOXRef("http://gowiki.tamu.edu/wiki/index.php/")

    @classmethod
    def GR(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        _namespace_GOXRef("http://www.gramene.org/db/searches/browser?search_type=All&RGN=on&query=")

    @classmethod
    def GR_GENE(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        _namespace_GOXRef("http://www.gramene.org/db/genes/search_gene?acc=")

    @classmethod
    def GR_PROTEIN(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        _namespace_GOXRef("http://www.gramene.org/db/protein/protein_search?acc=")

    @classmethod
    def GR_QTL(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        _namespace_GOXRef("http://www.gramene.org/db/qtl/qtl_display?qtl_accession_id=")

    @classmethod
    def GR_REF(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        _namespace_GOXRef("http://www.gramene.org/db/literature/pub_search?ref_id=")

    @classmethod
    def H_invDB_cDNA(cls):
        """Returns the link-out URI for objects of "H-invitational Database".
        """
        _namespace_GOXRef("http://www.h-invitational.jp/hinv/spsoup/transcript_view?acc_id=")

    @classmethod
    def H_invDB_locus(cls):
        """Returns the link-out URI for objects of "H-invitational Database".
        """
        _namespace_GOXRef("http://www.h-invitational.jp/hinv/spsoup/locus_view?hix_id=")

    @classmethod
    def HAMAP(cls):
        """Returns the link-out URI for objects of "High-quality Automated and Manual Annotation of microbial Proteomes".
        """
        _namespace_GOXRef("http://us.expasy.org/unirules/")

    @classmethod
    def HGNC(cls):
        """Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
        """
        _namespace_GOXRef("http://www.genenames.org/data/hgnc_data.php?hgnc_id=HGNC:")

    @classmethod
    def HGNC_gene(cls):
        """Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
        """
        _namespace_GOXRef("http://www.genenames.org/data/hgnc_data.php?app_sym=")

    @classmethod
    def HPA(cls):
        """Returns the link-out URI for objects of "Human Protein Atlas tissue profile information".
        """
        _namespace_GOXRef("http://www.proteinatlas.org/tissue_profile.php?antibody_id=")

    @classmethod
    def HPA_antibody(cls):
        """Returns the link-out URI for objects of "Human Protein Atlas antibody information".
        """
        _namespace_GOXRef("http://www.proteinatlas.org/antibody_info.php?antibody_id=")

    @classmethod
    def IMG(cls):
        """Returns the link-out URI for objects of "Integrated Microbial Genomes; JGI web site for genome annotation".
        """
        _namespace_GOXRef("http://img.jgi.doe.gov/cgi-bin/pub/main.cgi?section=GeneDetail&page=geneDetail&gene_oid=")

    @classmethod
    def IntAct(cls):
        """Returns the link-out URI for objects of "IntAct protein interaction database".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/intact/search/do/search?searchString=")

    @classmethod
    def InterPro(cls):
        """Returns the link-out URI for objects of "InterPro database of protein domains and motifs".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/interpro/IEntry?ac=")

    @classmethod
    def ISBN(cls):
        """Returns the link-out URI for objects of "International Standard Book Number".
        """
        _namespace_GOXRef("http://my.linkbaton.com/get?lbCC=q&nC=q&genre=book&item=")

    @classmethod
    def IUPHAR_GPCR(cls):
        """Returns the link-out URI for objects of "International Union of Pharmacology".
        """
        _namespace_GOXRef("http://www.iuphar-db.org/DATABASE/FamilyMenuForward?familyId=")

    @classmethod
    def IUPHAR_RECEPTOR(cls):
        """Returns the link-out URI for objects of "International Union of Pharmacology".
        """
        _namespace_GOXRef("http://www.iuphar-db.org/DATABASE/ObjectDisplayForward?objectId=")

    @classmethod
    def JCVI_CMR(cls):
        """Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
        """
        _namespace_GOXRef("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenePage.cgi?locus=")

    @classmethod
    def JCVI_EGAD(cls):
        """Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
        """
        _namespace_GOXRef("http://cmr.jcvi.org/cgi-bin/CMR/EgadSearch.cgi?search_string=")

    @classmethod
    def JCVI_GenProp(cls):
        """Returns the link-out URI for objects of "Genome Properties database at the J. Craig Venter Institute".
        """
        _namespace_GOXRef("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenomePropDefinition.cgi?prop_acc=")

    @classmethod
    def JCVI_Medtr(cls):
        """Returns the link-out URI for objects of "Medicago truncatula genome database at the J. Craig Venter Institute ".
        """
        _namespace_GOXRef("http://medicago.jcvi.org/cgi-bin/medicago/search/shared/ORF_infopage.cgi?orf=")

    @classmethod
    def JCVI_TIGRFAMS(cls):
        """Returns the link-out URI for objects of "TIGRFAMs HMM collection at the J. Craig Venter Institute".
        """
        _namespace_GOXRef("http://search.jcvi.org/search?p&q=")

    @classmethod
    def JSTOR(cls):
        """Returns the link-out URI for objects of "Digital archive of scholarly articles".
        """
        _namespace_GOXRef("http://www.jstor.org/stable/")

    @classmethod
    def KEGG_ENZYME(cls):
        """Returns the link-out URI for objects of "KEGG Enzyme Database".
        """
        _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?ec:")

    @classmethod
    def KEGG_LIGAND(cls):
        """Returns the link-out URI for objects of "KEGG LIGAND Database".
        """
        _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?cpd:")

    @classmethod
    def KEGG_PATHWAY(cls):
        """Returns the link-out URI for objects of "KEGG Pathways Database".
        """
        _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?path:")

    @classmethod
    def KEGG_REACTION(cls):
        """Returns the link-out URI for objects of "KEGG Reaction Database".
        """
        _namespace_GOXRef("http://www.genome.jp/dbget-bin/www_bget?rn:")

    @classmethod
    def LIFEdb(cls):
        """Returns the link-out URI for objects of "LifeDB".
        """
        _namespace_GOXRef("http://www.dkfz.de/LIFEdb/LIFEdb.aspx?ID=")

    @classmethod
    def MA(cls):
        """Returns the link-out URI for objects of "Adult Mouse Anatomical Dictionary".
        """
        _namespace_GOXRef("http://www.informatics.jax.org/searches/AMA.cgi?id=MA:")

    @classmethod
    def MaizeGDB(cls):
        """Returns the link-out URI for objects of "MaizeGDB".
        """
        _namespace_GOXRef("http://www.maizegdb.org/cgi-bin/id_search.cgi?id=")

    @classmethod
    def MaizeGDB_Locus(cls):
        """Returns the link-out URI for objects of "MaizeGDB".
        """
        _namespace_GOXRef("http://www.maizegdb.org/cgi-bin/displaylocusresults.cgi?term=")

    @classmethod
    def MEROPS(cls):
        """Returns the link-out URI for objects of "MEROPS peptidase database".
        """
        _namespace_GOXRef("http://merops.sanger.ac.uk/cgi-bin/pepsum?mid=")

    @classmethod
    def MEROPS_fam(cls):
        """Returns the link-out URI for objects of "MEROPS peptidase database".
        """
        _namespace_GOXRef("http://merops.sanger.ac.uk/cgi-bin/famsum?family=")

    @classmethod
    def MeSH(cls):
        """Returns the link-out URI for objects of "Medical Subject Headings".
        """
        _namespace_GOXRef("http://www.nlm.nih.gov/cgi/mesh/2005/MB_cgi?mode=&term=")

    @classmethod
    def MetaCyc(cls):
        """Returns the link-out URI for objects of "Metabolic Encyclopedia of metabolic and other pathways".
        """
        _namespace_GOXRef("http://biocyc.org/META/NEW-IMAGE?type=NIL&object=")

    @classmethod
    def MGI(cls):
        """Returns the link-out URI for objects of "Mouse Genome Informatics".
        """
        _namespace_GOXRef("http://www.informatics.jax.org/accession/")

    @classmethod
    def MIPS_funcat(cls):
        """Returns the link-out URI for objects of "MIPS Functional Catalogue".
        """
        _namespace_GOXRef("http://mips.gsf.de/cgi-bin/proj/funcatDB/search_advanced.pl?action=2&wert=")

    @classmethod
    def MO(cls):
        """Returns the link-out URI for objects of "MGED Ontology".
        """
        _namespace_GOXRef("http://mged.sourceforge.net/ontologies/MGEDontology.php#")

    @classmethod
    def ModBase(cls):
        """Returns the link-out URI for objects of "ModBase comprehensive Database of Comparative Protein Structure Models".
        """
        _namespace_GOXRef("http://salilab.org/modbase/searchbyid?databaseID=")

    @classmethod
    def NASC_code(cls):
        """Returns the link-out URI for objects of "Nottingham Arabidopsis Stock Centre Seeds Database".
        """
        _namespace_GOXRef("http://seeds.nottingham.ac.uk/NASC/stockatidb.lasso?code=")

    @classmethod
    def NCBI_Gene(cls):
        """Returns the link-out URI for objects of "NCBI Gene".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids=")

    @classmethod
    def NCBI_gi(cls):
        """Returns the link-out URI for objects of "NCBI databases".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def NCBI_GP(cls):
        """Returns the link-out URI for objects of "NCBI GenPept".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=protein&val=")

    @classmethod
    def NIF_Subcellular(cls):
        """Returns the link-out URI for objects of "Neuroscience Information Framework standard ontology, subcellular hierarchy".
        """
        _namespace_GOXRef("http://www.neurolex.org/wiki/")

    @classmethod
    def NMPDR(cls):
        """Returns the link-out URI for objects of "National Microbial Pathogen Data Resource".
        """
        _namespace_GOXRef("http://www.nmpdr.org/linkin.cgi?id=")

    @classmethod
    def OMIM(cls):
        """Returns the link-out URI for objects of "Mendelian Inheritance in Man".
        """
        _namespace_GOXRef("http://omim.org/entry/")

    @classmethod
    def PAMGO_GAT(cls):
        """Returns the link-out URI for objects of "Genome Annotation Tool (cls, Agrobacterium tumefaciens C58); PAMGO Interest Group".
        """
        _namespace_GOXRef("http://agro.vbi.vt.edu/public/servlet/GeneEdit?&Search=Search&level=2&genename=")

    @classmethod
    def PAMGO_MGG(cls):
        """Returns the link-out URI for objects of "Magnaporthe grisea database".
        """
        _namespace_GOXRef("http://scotland.fgl.ncsu.edu/cgi-bin/adHocQuery.cgi?adHocQuery_dbName=smeng_goannotation&Action=Data&QueryName=Functional+Categorization+of+MGG+GO+Annotation&P_KeyWord=")

    @classmethod
    def PAMGO_VMD(cls):
        """Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
        """
        _namespace_GOXRef("http://vmd.vbi.vt.edu/cgi-bin/browse/go_detail.cgi?gene_id=")

    @classmethod
    def PANTHER(cls):
        """Returns the link-out URI for objects of "Protein ANalysis THrough Evolutionary Relationships".
        """
        _namespace_GOXRef("http://pantree.org/node/annotationNode.jsp?id=")

    @classmethod
    def PATRIC(cls):
        """Returns the link-out URI for objects of "PathoSystems Resource Integration Center".
        """
        _namespace_GOXRef("http://patric.vbi.vt.edu/gene/overview.php?fid=")

    @classmethod
    def PDB(cls):
        """Returns the link-out URI for objects of "Protein Data Bank".
        """
        _namespace_GOXRef("http://www.rcsb.org/pdb/cgi/explore.cgi?pdbId=")

    @classmethod
    def Pfam(cls):
        """Returns the link-out URI for objects of "Pfam database of protein families".
        """
        _namespace_GOXRef("http://www.sanger.ac.uk/cgi-bin/Pfam/getacc?")

    @classmethod
    def PharmGKB(cls):
        """Returns the link-out URI for objects of "Pharmacogenetics and Pharmacogenomics Knowledge Base".
        """
        _namespace_GOXRef("http://www.pharmgkb.org/do/serve?objId=")

    @classmethod
    def PIR(cls):
        """Returns the link-out URI for objects of "Protein Information Resource".
        """
        _namespace_GOXRef("http://pir.georgetown.edu/cgi-bin/pirwww/nbrfget?uid=")

    @classmethod
    def PIRSF(cls):
        """Returns the link-out URI for objects of "PIR Superfamily Classification System".
        """
        _namespace_GOXRef("http://pir.georgetown.edu/cgi-bin/ipcSF?id=")

    @classmethod
    def PMCID(cls):
        """Returns the link-out URI for objects of "Pubmed Central".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/sites/entrez?db=pmc&cmd=search&term=")

    @classmethod
    def PMID(cls):
        """Returns the link-out URI for objects of "PubMed".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/pubmed/")

    @classmethod
    def PO(cls):
        """Returns the link-out URI for objects of "Plant Ontology Consortium Database".
        """
        _namespace_GOXRef("http://www.plantontology.org/amigo/go.cgi?action=query&view=query&search_constraint=terms&query=PO:")

    @classmethod
    def PO_REF(cls):
        """Returns the link-out URI for objects of "Plant Ontology custom references".
        """
        _namespace_GOXRef("http://wiki.plantontology.org:8080/index.php/PO_REF:")

    @classmethod
    def PomBase(cls):
        """Returns the link-out URI for objects of "PomBase".
        """
        _namespace_GOXRef("http://www.pombase.org/spombe/result/")

    @classmethod
    def PR(cls):
        """Returns the link-out URI for objects of "Protein Ontology".
        """
        _namespace_GOXRef("http://www.proconsortium.org/cgi-bin/pro/entry_pro?id=PR:")

    @classmethod
    def PRINTS(cls):
        """Returns the link-out URI for objects of "PRINTS compendium of protein fingerprints".
        """
        _namespace_GOXRef("http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/sprint/searchprintss.cgi?display_opts=Prints&category=None&queryform=False&regexpr=off&prints_accn=")

    @classmethod
    def ProDom(cls):
        """Returns the link-out URI for objects of "ProDom protein domain families".
        """
        _namespace_GOXRef("http://prodom.prabi.fr/prodom/current/cgi-bin/request.pl?question=DBEN&query=")

    @classmethod
    def Prosite(cls):
        """Returns the link-out URI for objects of "Prosite database of protein families and domains".
        """
        _namespace_GOXRef("http://www.expasy.ch/cgi-bin/prosite-search-ac?")

    @classmethod
    def PseudoCAP(cls):
        """Returns the link-out URI for objects of "Pseudomonas Genome Project".
        """
        _namespace_GOXRef("http://v2.pseudomonas.com/getAnnotation.do?locusID=")

    @classmethod
    def PSI_MOD(cls):
        """Returns the link-out URI for objects of "Proteomics Standards Initiative protein modification ontology".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/ontology-lookup/?termId=MOD:")

    @classmethod
    def PubChem_BioAssay(cls):
        """Returns the link-out URI for objects of "NCBI PubChem database of bioassay records".
        """
        _namespace_GOXRef("http://pubchem.ncbi.nlm.nih.gov/assay/assay.cgi?aid=")

    @classmethod
    def PubChem_Compound(cls):
        """Returns the link-out URI for objects of "NCBI PubChem database of chemical structures".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=")

    @classmethod
    def PubChem_Substance(cls):
        """Returns the link-out URI for objects of "NCBI PubChem database of chemical substances".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pcsubstance&term=")

    @classmethod
    def Reactome(cls):
        """Returns the link-out URI for objects of "Reactome - a curated knowledgebase of biological pathways".
        """
        _namespace_GOXRef("http://www.reactome.org/cgi-bin/eventbrowser_st_id?ST_ID=")

    @classmethod
    def RefSeq(cls):
        """Returns the link-out URI for objects of "RefSeq".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def RefSeq_NA(cls):
        """Returns the link-out URI for objects of "RefSeq (cls, Nucleic Acid)".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def RefSeq_Prot(cls):
        """Returns the link-out URI for objects of "RefSeq (cls, Protein)".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def Rfam(cls):
        """Returns the link-out URI for objects of "Rfam database of RNA families".
        """
        _namespace_GOXRef("http://rfam.sanger.ac.uk/family/")

    @classmethod
    def RGD(cls):
        """Returns the link-out URI for objects of "Rat Genome Database".
        """
        _namespace_GOXRef("http://rgd.mcw.edu/generalSearch/RgdSearch.jsp?quickSearch=1&searchKeyword=")

    @classmethod
    def RHEA(cls):
        """Returns the link-out URI for objects of "Rhea, the Annotated Reactions Database".
        """
        _namespace_GOXRef("http://www.ebi.ac.uk/rhea/reaction.xhtml?id=")

    @classmethod
    def RNAmods(cls):
        """Returns the link-out URI for objects of "RNA Modification Database".
        """
        _namespace_GOXRef("http://s59.cas.albany.edu/RNAmods/cgi-bin/rnashow.cgi?")

    @classmethod
    def RO(cls):
        """Returns the link-out URI for objects of "OBO Relation Ontology Ontology".
        """
        _namespace_GOXRef("http://purl.obolibrary.org/obo/RO_")

    @classmethod
    def SABIO_RK(cls):
        """Returns the link-out URI for objects of "SABIO Reaction Kinetics".
        """
        _namespace_GOXRef("http://sabio.villa-bosch.de/reacdetails.jsp?reactid=")

    @classmethod
    def SEED(cls):
        """Returns the link-out URI for objects of "The SEED;".
        """
        _namespace_GOXRef("http://www.theseed.org/linkin.cgi?id=")

    @classmethod
    def SGD(cls):
        """Returns the link-out URI for objects of "Saccharomyces Genome Database".
        """
        _namespace_GOXRef("http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=")

    @classmethod
    def SGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Saccharomyces Genome Database".
        """
        _namespace_GOXRef("http://db.yeastgenome.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def SGD_REF(cls):
        """Returns the link-out URI for objects of "Saccharomyces Genome Database".
        """
        _namespace_GOXRef("http://db.yeastgenome.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def SGN(cls):
        """Returns the link-out URI for objects of "Sol Genomics Network".
        """
        _namespace_GOXRef("http://www.sgn.cornell.edu/phenome/locus_display.pl?locus_id=")

    @classmethod
    def SGN_ref(cls):
        """Returns the link-out URI for objects of "Sol Genomics Network".
        """
        _namespace_GOXRef("http://www.sgn.cornell.edu/chado/publication.pl?pub_id=")

    @classmethod
    def SMART(cls):
        """Returns the link-out URI for objects of "Simple Modular Architecture Research Tool".
        """
        _namespace_GOXRef("http://smart.embl-heidelberg.de/smart/do_annotation.pl?BLAST=DUMMY&DOMAIN=")

    @classmethod
    def SO(cls):
        """Returns the link-out URI for objects of "Sequence Ontology".
        """
        _namespace_GOXRef("http://song.sourceforge.net/SOterm_tables.html#SO:")

    @classmethod
    def SUPERFAMILY(cls):
        """Returns the link-out URI for objects of "SUPERFAMILY protein annotation database".
        """
        _namespace_GOXRef("http://supfam.cs.bris.ac.uk/SUPERFAMILY/cgi-bin/scop.cgi?ipid=SSF")

    @classmethod
    def Swiss_Prot(cls):
        """Returns the link-out URI for objects of "UniProtKB/Swiss-Prot".
        """
        _namespace_GOXRef("http://www.uniprot.org/uniprot/")

    @classmethod
    def TAIR(cls):
        """Returns the link-out URI for objects of "The Arabidopsis Information Resource".
        """
        _namespace_GOXRef("http://arabidopsis.org/servlets/TairObject?accession=")

    @classmethod
    def taxon(cls):
        """Returns the link-out URI for objects of "NCBI Taxonomy".
        """
        _namespace_GOXRef("http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=")

    @classmethod
    def TC(cls):
        """Returns the link-out URI for objects of "Transport Protein Database".
        """
        _namespace_GOXRef("http://www.tcdb.org/tcdb/index.php?tc=")

    @classmethod
    def TGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Tetrahymena Genome Database".
        """
        _namespace_GOXRef("http://db.ciliate.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def TGD_REF(cls):
        """Returns the link-out URI for objects of "Tetrahymena Genome Database".
        """
        _namespace_GOXRef("http://db.ciliate.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def TrEMBL(cls):
        """Returns the link-out URI for objects of "UniProtKB-TrEMBL protein sequence database".
        """
        _namespace_GOXRef("http://www.uniprot.org/uniprot/")

    @classmethod
    def UBERON(cls):
        """Returns the link-out URI for objects of "Uber-anatomy ontology".
        """
        _namespace_GOXRef("http://purl.obolibrary.org/obo/UBERON_")

    @classmethod
    def UM_BBD_enzymeID(cls):
        """Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
        """
        _namespace_GOXRef("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=ep&enzymeID=")

    @classmethod
    def UM_BBD_reactionID(cls):
        """Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
        """
        _namespace_GOXRef("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=r&reacID=")

    @classmethod
    def UM_BBD_ruleID(cls):
        """Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
        """
        _namespace_GOXRef("http://umbbd.msi.umn.edu/servlets/rule.jsp?rule=")

    @classmethod
    def UniMod(cls):
        """Returns the link-out URI for objects of "UniMod".
        """
        _namespace_GOXRef("http://www.unimod.org/modifications_view.php?editid1=")

    @classmethod
    def UniParc(cls):
        """Returns the link-out URI for objects of "UniProt Archive".
        """
        _namespace_GOXRef("http://www.uniprot.org/uniparc/")

    @classmethod
    def UniPathway(cls):
        """Returns the link-out URI for objects of "UniPathway".
        """
        _namespace_GOXRef("http://www.grenoble.prabi.fr/obiwarehouse/unipathway/upa?upid=")

    @classmethod
    def UniProtKB(cls):
        """Returns the link-out URI for objects of "Universal Protein Knowledgebase".
        """
        _namespace_GOXRef("http://www.uniprot.org/uniprot/")

    @classmethod
    def UniProtKB_KW(cls):
        """Returns the link-out URI for objects of "UniProt Knowledgebase keywords".
        """
        _namespace_GOXRef("http://www.uniprot.org/keywords/")

    @classmethod
    def UniProtKB_SubCell(cls):
        """Returns the link-out URI for objects of "UniProt Knowledgebase Subcellular Location vocabulary".
        """
        _namespace_GOXRef("http://www.uniprot.org/locations/")

    @classmethod
    def VBRC(cls):
        """Returns the link-out URI for objects of "Viral Bioinformatics Resource Center".
        """
        _namespace_GOXRef("http://vbrc.org/query.asp?web_id=VBRC:")

    @classmethod
    def VEGA(cls):
        """Returns the link-out URI for objects of "Vertebrate Genome Annotation database".
        """
        _namespace_GOXRef("http://vega.sanger.ac.uk/perl/searchview?species=all&idx=All&q=")

    @classmethod
    def VMD(cls):
        """Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
        """
        _namespace_GOXRef("http://vmd.vbi.vt.edu/cgi-bin/browse/browserDetail_new.cgi?gene_id=")

    @classmethod
    def WB(cls):
        """Returns the link-out URI for objects of "WormBase database of nematode biology".
        """
        _namespace_GOXRef("http://www.wormbase.org/db/gene/gene?name=")

    @classmethod
    def WB_REF(cls):
        """Returns the link-out URI for objects of "WormBase database of nematode biology".
        """
        _namespace_GOXRef("http://www.wormbase.org/db/misc/paper?name=")

    @classmethod
    def Wikipedia(cls):
        """Returns the link-out URI for objects of "Wikipedia".
        """
        _namespace_GOXRef("http://en.wikipedia.org/wiki/")

    @classmethod
    def WP(cls):
        """Returns the link-out URI for objects of "Wormpep database of proteins of C. elegans".
        """
        _namespace_GOXRef("http://www.wormbase.org/db/get?class=Protein;name=WP:")

    @classmethod
    def ZFIN(cls):
        """Returns the link-out URI for objects of "Zebrafish Information Network".
        """
        _namespace_GOXRef("http://zfin.org/cgi-bin/ZFIN_jump?record=")


