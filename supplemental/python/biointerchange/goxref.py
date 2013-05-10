import rdflib

from rdflib import Namespace


class GOXRef:

    @classmethod
    def AGI_LocusCode(cls):
        """Returns the link-out URI for objects of "Arabidopsis Genome Initiative".
        """
        RDF::URI.new("http://arabidopsis.org/servlets/TairObject?type=locus&name=")

    @classmethod
    def ApiDB_PlasmoDB(cls):
        """Returns the link-out URI for objects of "PlasmoDB Plasmodium Genome Resource".
        """
        RDF::URI.new("http://www.plasmodb.org/gene/")

    @classmethod
    def AraCyc(cls):
        """Returns the link-out URI for objects of "AraCyc metabolic pathway database for Arabidopsis thaliana".
        """
        RDF::URI.new("http://www.arabidopsis.org:1555/ARA/NEW-IMAGE?type=NIL&object=")

    @classmethod
    def ASAP(cls):
        """Returns the link-out URI for objects of "A Systematic Annotation Package for Community Analysis of Genomes".
        """
        RDF::URI.new("https://asap.ahabs.wisc.edu/annotation/php/feature_info.php?FeatureID=")

    @classmethod
    def AspGD(cls):
        """Returns the link-out URI for objects of "Aspergillus Genome Database".
        """
        RDF::URI.new("http://www.aspergillusgenome.org/cgi-bin/locus.pl?dbid=")

    @classmethod
    def AspGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Aspergillus Genome Database".
        """
        RDF::URI.new("http://www.aspergillusgenome.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def AspGD_REF(cls):
        """Returns the link-out URI for objects of "Aspergillus Genome Database".
        """
        RDF::URI.new("http://www.aspergillusgenome.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def BFO(cls):
        """Returns the link-out URI for objects of "Basic Formal Ontology".
        """
        RDF::URI.new("http://purl.obolibrary.org/obo/BFO_")

    @classmethod
    def BioCyc(cls):
        """Returns the link-out URI for objects of "BioCyc collection of metabolic pathway databases".
        """
        RDF::URI.new("http://biocyc.org/META/NEW-IMAGE?type=PATHWAY&object=")

    @classmethod
    def BIOMD(cls):
        """Returns the link-out URI for objects of "BioModels Database".
        """
        RDF::URI.new("http://www.ebi.ac.uk/compneur-srv/biomodels-main/publ-model.do?mid=")

    @classmethod
    def BRENDA(cls):
        """Returns the link-out URI for objects of "BRENDA, The Comprehensive Enzyme Information System".
        """
        RDF::URI.new("http://www.brenda-enzymes.info/php/result_flat.php4?ecno=")

    @classmethod
    def Broad_MGG(cls):
        """Returns the link-out URI for objects of "Magnaporthe grisea Database".
        """
        RDF::URI.new("http://www.broad.mit.edu/annotation/genome/magnaporthe_grisea/GeneLocus.html?sp=S")

    @classmethod
    def CASGEN(cls):
        """Returns the link-out URI for objects of "Catalog of Fishes genus database".
        """
        RDF::URI.new("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Genus&id=")

    @classmethod
    def CASREF(cls):
        """Returns the link-out URI for objects of "Catalog of Fishes publications database".
        """
        RDF::URI.new("http://research.calacademy.org/research/ichthyology/catalog/getref.asp?id=")

    @classmethod
    def CASSPC(cls):
        """Returns the link-out URI for objects of "Catalog of Fishes species database".
        """
        RDF::URI.new("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Species&id=1979")

    @classmethod
    def CDD(cls):
        """Returns the link-out URI for objects of "Conserved Domain Database at NCBI".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=")

    @classmethod
    def CGD(cls):
        """Returns the link-out URI for objects of "Candida Genome Database".
        """
        RDF::URI.new("http://www.candidagenome.org/cgi-bin/locus.pl?dbid=")

    @classmethod
    def CGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Candida Genome Database".
        """
        RDF::URI.new("http://www.candidagenome.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def CGD_REF(cls):
        """Returns the link-out URI for objects of "Candida Genome Database".
        """
        RDF::URI.new("http://www.candidagenome.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def CHEBI(cls):
        """Returns the link-out URI for objects of "Chemical Entities of Biological Interest".
        """
        RDF::URI.new("http://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:")

    @classmethod
    def CL(cls):
        """Returns the link-out URI for objects of "Cell Type Ontology".
        """
        RDF::URI.new("http://purl.obolibrary.org/obo/CL_")

    @classmethod
    def COG_Cluster(cls):
        """Returns the link-out URI for objects of "NCBI COG cluster".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/COG/new/release/cow.cgi?cog=")

    @classmethod
    def COG_Function(cls):
        """Returns the link-out URI for objects of "NCBI COG function".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/COG/grace/shokog.cgi?fun=")

    @classmethod
    def COG_Pathway(cls):
        """Returns the link-out URI for objects of "NCBI COG pathway".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/COG/new/release/coglist.cgi?pathw=")

    @classmethod
    def CORUM(cls):
        """Returns the link-out URI for objects of "CORUM - the Comprehensive Resource of Mammalian protein complexes".
        """
        RDF::URI.new("http://mips.gsf.de/genre/proj/corum/complexdetails.html?id=")

    @classmethod
    def dbSNP(cls):
        """Returns the link-out URI for objects of "NCBI dbSNP".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=")

    @classmethod
    def DDBJ(cls):
        """Returns the link-out URI for objects of "DNA Databank of Japan".
        """
        RDF::URI.new("http://arsa.ddbj.nig.ac.jp/arsa/ddbjSplSearch?KeyWord=")

    @classmethod
    def dictyBase(cls):
        """Returns the link-out URI for objects of "dictyBase".
        """
        RDF::URI.new("http://dictybase.org/gene/")

    @classmethod
    def dictyBase_gene_name(cls):
        """Returns the link-out URI for objects of "dictyBase".
        """
        RDF::URI.new("http://dictybase.org/gene/")

    @classmethod
    def dictyBase_REF(cls):
        """Returns the link-out URI for objects of "dictyBase literature references".
        """
        RDF::URI.new("http://dictybase.org/db/cgi-bin/dictyBase/reference/reference.pl?refNo=")

    @classmethod
    def DOI(cls):
        """Returns the link-out URI for objects of "Digital Object Identifier".
        """
        RDF::URI.new("http://dx.doi.org/DOI:")

    @classmethod
    def EC(cls):
        """Returns the link-out URI for objects of "Enzyme Commission".
        """
        RDF::URI.new("http://www.expasy.org/enzyme/")

    @classmethod
    def EchoBASE(cls):
        """Returns the link-out URI for objects of "EchoBASE post-genomic database for Escherichia coli".
        """
        RDF::URI.new("http://www.biolws1.york.ac.uk/echobase/Gene.cfm?recordID=")

    @classmethod
    def ECK(cls):
        """Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
        """
        RDF::URI.new("http://www.ecogene.org/geneInfo.php?eck_id=")

    @classmethod
    def EcoCyc(cls):
        """Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
        """
        RDF::URI.new("http://biocyc.org/ECOLI/NEW-IMAGE?type=PATHWAY&object=")

    @classmethod
    def EcoCyc_REF(cls):
        """Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
        """
        RDF::URI.new("http://biocyc.org/ECOLI/reference.html?type=CITATION-FRAME&object=")

    @classmethod
    def ECOGENE(cls):
        """Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
        """
        RDF::URI.new("http://www.ecogene.org/geneInfo.php?eg_id=")

    @classmethod
    def EMBL(cls):
        """Returns the link-out URI for objects of "EMBL Nucleotide Sequence Database".
        """
        RDF::URI.new("http://www.ebi.ac.uk/cgi-bin/emblfetch?style=html&Submit=Go&id=")

    @classmethod
    def ENA(cls):
        """Returns the link-out URI for objects of "European Nucleotide Archive".
        """
        RDF::URI.new("http://www.ebi.ac.uk/ena/data/view/")

    @classmethod
    def ENSEMBL(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        RDF::URI.new("http://www.ensembl.org/id/")

    @classmethod
    def ENSEMBL_GeneID(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        RDF::URI.new("http://www.ensembl.org/id/")

    @classmethod
    def ENSEMBL_ProteinID(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        RDF::URI.new("http://www.ensembl.org/id/")

    @classmethod
    def ENSEMBL_TranscriptID(cls):
        """Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
        """
        RDF::URI.new("http://www.ensembl.org/id/")

    @classmethod
    def ENZYME(cls):
        """Returns the link-out URI for objects of "Swiss Institute of Bioinformatics enzyme database".
        """
        RDF::URI.new("http://www.expasy.ch/cgi-bin/nicezyme.pl?")

    @classmethod
    def FBbt(cls):
        """Returns the link-out URI for objects of "Drosophila gross anatomy".
        """
        RDF::URI.new("http://flybase.org/cgi-bin/fbcvq.html?query=FBbt:")

    @classmethod
    def GDB(cls):
        """Returns the link-out URI for objects of "Human Genome Database".
        """
        RDF::URI.new("http://www.gdb.org/gdb-bin/genera/accno?accessionNum=GDB:")

    @classmethod
    def GenBank(cls):
        """Returns the link-out URI for objects of "GenBank".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=nucleotide&val=")

    @classmethod
    def Gene3D(cls):
        """Returns the link-out URI for objects of "Domain Architecture Classification".
        """
        RDF::URI.new("http://gene3d.biochem.ucl.ac.uk/superfamily/?accession=")

    @classmethod
    def GeneDB_Gmorsitans(cls):
        """Returns the link-out URI for objects of "Glossina morsitans GeneDB".
        """
        RDF::URI.new("http://www.genedb.org/genedb/Search?organism=glossina&name=")

    @classmethod
    def GeneDB_Lmajor(cls):
        """Returns the link-out URI for objects of "Leishmania major GeneDB".
        """
        RDF::URI.new("http://www.genedb.org/genedb/Search?organism=leish&name=")

    @classmethod
    def GeneDB_Pfalciparum(cls):
        """Returns the link-out URI for objects of "Plasmodium falciparum GeneDB".
        """
        RDF::URI.new("http://www.genedb.org/genedb/Search?organism=malaria&name=")

    @classmethod
    def GeneDB_Spombe(cls):
        """Returns the link-out URI for objects of "Schizosaccharomyces pombe GeneDB".
        """
        RDF::URI.new("http://old.genedb.org/genedb/Search?organism=pombe&name=")

    @classmethod
    def GeneDB_Tbrucei(cls):
        """Returns the link-out URI for objects of "Trypanosoma brucei GeneDB".
        """
        RDF::URI.new("http://www.genedb.org/genedb/Search?organism=tryp&name=")

    @classmethod
    def GEO(cls):
        """Returns the link-out URI for objects of "NCBI Gene Expression Omnibus".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/sites/GDSbrowser?acc=")

    @classmethod
    def GO(cls):
        """Returns the link-out URI for objects of "Gene Ontology Database".
        """
        RDF::URI.new("http://amigo.geneontology.org/cgi-bin/amigo/term-details.cgi?term=GO:")

    @classmethod
    def GO_REF(cls):
        """Returns the link-out URI for objects of "Gene Ontology Database references".
        """
        RDF::URI.new("http://www.geneontology.org/cgi-bin/references.cgi#GO_REF:")

    @classmethod
    def GONUTS(cls):
        """Returns the link-out URI for objects of "Gene Ontology Normal Usage Tracking System (cls, GONUTS)".
        """
        RDF::URI.new("http://gowiki.tamu.edu/wiki/index.php/")

    @classmethod
    def GR(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        RDF::URI.new("http://www.gramene.org/db/searches/browser?search_type=All&RGN=on&query=")

    @classmethod
    def GR_GENE(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        RDF::URI.new("http://www.gramene.org/db/genes/search_gene?acc=")

    @classmethod
    def GR_PROTEIN(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        RDF::URI.new("http://www.gramene.org/db/protein/protein_search?acc=")

    @classmethod
    def GR_QTL(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        RDF::URI.new("http://www.gramene.org/db/qtl/qtl_display?qtl_accession_id=")

    @classmethod
    def GR_REF(cls):
        """Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
        """
        RDF::URI.new("http://www.gramene.org/db/literature/pub_search?ref_id=")

    @classmethod
    def H_invDB_cDNA(cls):
        """Returns the link-out URI for objects of "H-invitational Database".
        """
        RDF::URI.new("http://www.h-invitational.jp/hinv/spsoup/transcript_view?acc_id=")

    @classmethod
    def H_invDB_locus(cls):
        """Returns the link-out URI for objects of "H-invitational Database".
        """
        RDF::URI.new("http://www.h-invitational.jp/hinv/spsoup/locus_view?hix_id=")

    @classmethod
    def HAMAP(cls):
        """Returns the link-out URI for objects of "High-quality Automated and Manual Annotation of microbial Proteomes".
        """
        RDF::URI.new("http://us.expasy.org/unirules/")

    @classmethod
    def HGNC(cls):
        """Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
        """
        RDF::URI.new("http://www.genenames.org/data/hgnc_data.php?hgnc_id=HGNC:")

    @classmethod
    def HGNC_gene(cls):
        """Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
        """
        RDF::URI.new("http://www.genenames.org/data/hgnc_data.php?app_sym=")

    @classmethod
    def HPA(cls):
        """Returns the link-out URI for objects of "Human Protein Atlas tissue profile information".
        """
        RDF::URI.new("http://www.proteinatlas.org/tissue_profile.php?antibody_id=")

    @classmethod
    def HPA_antibody(cls):
        """Returns the link-out URI for objects of "Human Protein Atlas antibody information".
        """
        RDF::URI.new("http://www.proteinatlas.org/antibody_info.php?antibody_id=")

    @classmethod
    def IMG(cls):
        """Returns the link-out URI for objects of "Integrated Microbial Genomes; JGI web site for genome annotation".
        """
        RDF::URI.new("http://img.jgi.doe.gov/cgi-bin/pub/main.cgi?section=GeneDetail&page=geneDetail&gene_oid=")

    @classmethod
    def IntAct(cls):
        """Returns the link-out URI for objects of "IntAct protein interaction database".
        """
        RDF::URI.new("http://www.ebi.ac.uk/intact/search/do/search?searchString=")

    @classmethod
    def InterPro(cls):
        """Returns the link-out URI for objects of "InterPro database of protein domains and motifs".
        """
        RDF::URI.new("http://www.ebi.ac.uk/interpro/IEntry?ac=")

    @classmethod
    def ISBN(cls):
        """Returns the link-out URI for objects of "International Standard Book Number".
        """
        RDF::URI.new("http://my.linkbaton.com/get?lbCC=q&nC=q&genre=book&item=")

    @classmethod
    def IUPHAR_GPCR(cls):
        """Returns the link-out URI for objects of "International Union of Pharmacology".
        """
        RDF::URI.new("http://www.iuphar-db.org/DATABASE/FamilyMenuForward?familyId=")

    @classmethod
    def IUPHAR_RECEPTOR(cls):
        """Returns the link-out URI for objects of "International Union of Pharmacology".
        """
        RDF::URI.new("http://www.iuphar-db.org/DATABASE/ObjectDisplayForward?objectId=")

    @classmethod
    def JCVI_CMR(cls):
        """Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
        """
        RDF::URI.new("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenePage.cgi?locus=")

    @classmethod
    def JCVI_EGAD(cls):
        """Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
        """
        RDF::URI.new("http://cmr.jcvi.org/cgi-bin/CMR/EgadSearch.cgi?search_string=")

    @classmethod
    def JCVI_GenProp(cls):
        """Returns the link-out URI for objects of "Genome Properties database at the J. Craig Venter Institute".
        """
        RDF::URI.new("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenomePropDefinition.cgi?prop_acc=")

    @classmethod
    def JCVI_Medtr(cls):
        """Returns the link-out URI for objects of "Medicago truncatula genome database at the J. Craig Venter Institute ".
        """
        RDF::URI.new("http://medicago.jcvi.org/cgi-bin/medicago/search/shared/ORF_infopage.cgi?orf=")

    @classmethod
    def JCVI_TIGRFAMS(cls):
        """Returns the link-out URI for objects of "TIGRFAMs HMM collection at the J. Craig Venter Institute".
        """
        RDF::URI.new("http://search.jcvi.org/search?p&q=")

    @classmethod
    def JSTOR(cls):
        """Returns the link-out URI for objects of "Digital archive of scholarly articles".
        """
        RDF::URI.new("http://www.jstor.org/stable/")

    @classmethod
    def KEGG_ENZYME(cls):
        """Returns the link-out URI for objects of "KEGG Enzyme Database".
        """
        RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?ec:")

    @classmethod
    def KEGG_LIGAND(cls):
        """Returns the link-out URI for objects of "KEGG LIGAND Database".
        """
        RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?cpd:")

    @classmethod
    def KEGG_PATHWAY(cls):
        """Returns the link-out URI for objects of "KEGG Pathways Database".
        """
        RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?path:")

    @classmethod
    def KEGG_REACTION(cls):
        """Returns the link-out URI for objects of "KEGG Reaction Database".
        """
        RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?rn:")

    @classmethod
    def LIFEdb(cls):
        """Returns the link-out URI for objects of "LifeDB".
        """
        RDF::URI.new("http://www.dkfz.de/LIFEdb/LIFEdb.aspx?ID=")

    @classmethod
    def MA(cls):
        """Returns the link-out URI for objects of "Adult Mouse Anatomical Dictionary".
        """
        RDF::URI.new("http://www.informatics.jax.org/searches/AMA.cgi?id=MA:")

    @classmethod
    def MaizeGDB(cls):
        """Returns the link-out URI for objects of "MaizeGDB".
        """
        RDF::URI.new("http://www.maizegdb.org/cgi-bin/id_search.cgi?id=")

    @classmethod
    def MaizeGDB_Locus(cls):
        """Returns the link-out URI for objects of "MaizeGDB".
        """
        RDF::URI.new("http://www.maizegdb.org/cgi-bin/displaylocusresults.cgi?term=")

    @classmethod
    def MEROPS(cls):
        """Returns the link-out URI for objects of "MEROPS peptidase database".
        """
        RDF::URI.new("http://merops.sanger.ac.uk/cgi-bin/pepsum?mid=")

    @classmethod
    def MEROPS_fam(cls):
        """Returns the link-out URI for objects of "MEROPS peptidase database".
        """
        RDF::URI.new("http://merops.sanger.ac.uk/cgi-bin/famsum?family=")

    @classmethod
    def MeSH(cls):
        """Returns the link-out URI for objects of "Medical Subject Headings".
        """
        RDF::URI.new("http://www.nlm.nih.gov/cgi/mesh/2005/MB_cgi?mode=&term=")

    @classmethod
    def MetaCyc(cls):
        """Returns the link-out URI for objects of "Metabolic Encyclopedia of metabolic and other pathways".
        """
        RDF::URI.new("http://biocyc.org/META/NEW-IMAGE?type=NIL&object=")

    @classmethod
    def MGI(cls):
        """Returns the link-out URI for objects of "Mouse Genome Informatics".
        """
        RDF::URI.new("http://www.informatics.jax.org/accession/")

    @classmethod
    def MIPS_funcat(cls):
        """Returns the link-out URI for objects of "MIPS Functional Catalogue".
        """
        RDF::URI.new("http://mips.gsf.de/cgi-bin/proj/funcatDB/search_advanced.pl?action=2&wert=")

    @classmethod
    def MO(cls):
        """Returns the link-out URI for objects of "MGED Ontology".
        """
        RDF::URI.new("http://mged.sourceforge.net/ontologies/MGEDontology.php#")

    @classmethod
    def ModBase(cls):
        """Returns the link-out URI for objects of "ModBase comprehensive Database of Comparative Protein Structure Models".
        """
        RDF::URI.new("http://salilab.org/modbase/searchbyid?databaseID=")

    @classmethod
    def NASC_code(cls):
        """Returns the link-out URI for objects of "Nottingham Arabidopsis Stock Centre Seeds Database".
        """
        RDF::URI.new("http://seeds.nottingham.ac.uk/NASC/stockatidb.lasso?code=")

    @classmethod
    def NCBI_Gene(cls):
        """Returns the link-out URI for objects of "NCBI Gene".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids=")

    @classmethod
    def NCBI_gi(cls):
        """Returns the link-out URI for objects of "NCBI databases".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def NCBI_GP(cls):
        """Returns the link-out URI for objects of "NCBI GenPept".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=protein&val=")

    @classmethod
    def NIF_Subcellular(cls):
        """Returns the link-out URI for objects of "Neuroscience Information Framework standard ontology, subcellular hierarchy".
        """
        RDF::URI.new("http://www.neurolex.org/wiki/")

    @classmethod
    def NMPDR(cls):
        """Returns the link-out URI for objects of "National Microbial Pathogen Data Resource".
        """
        RDF::URI.new("http://www.nmpdr.org/linkin.cgi?id=")

    @classmethod
    def OMIM(cls):
        """Returns the link-out URI for objects of "Mendelian Inheritance in Man".
        """
        RDF::URI.new("http://omim.org/entry/")

    @classmethod
    def PAMGO_GAT(cls):
        """Returns the link-out URI for objects of "Genome Annotation Tool (cls, Agrobacterium tumefaciens C58); PAMGO Interest Group".
        """
        RDF::URI.new("http://agro.vbi.vt.edu/public/servlet/GeneEdit?&Search=Search&level=2&genename=")

    @classmethod
    def PAMGO_MGG(cls):
        """Returns the link-out URI for objects of "Magnaporthe grisea database".
        """
        RDF::URI.new("http://scotland.fgl.ncsu.edu/cgi-bin/adHocQuery.cgi?adHocQuery_dbName=smeng_goannotation&Action=Data&QueryName=Functional+Categorization+of+MGG+GO+Annotation&P_KeyWord=")

    @classmethod
    def PAMGO_VMD(cls):
        """Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
        """
        RDF::URI.new("http://vmd.vbi.vt.edu/cgi-bin/browse/go_detail.cgi?gene_id=")

    @classmethod
    def PANTHER(cls):
        """Returns the link-out URI for objects of "Protein ANalysis THrough Evolutionary Relationships".
        """
        RDF::URI.new("http://pantree.org/node/annotationNode.jsp?id=")

    @classmethod
    def PATRIC(cls):
        """Returns the link-out URI for objects of "PathoSystems Resource Integration Center".
        """
        RDF::URI.new("http://patric.vbi.vt.edu/gene/overview.php?fid=")

    @classmethod
    def PDB(cls):
        """Returns the link-out URI for objects of "Protein Data Bank".
        """
        RDF::URI.new("http://www.rcsb.org/pdb/cgi/explore.cgi?pdbId=")

    @classmethod
    def Pfam(cls):
        """Returns the link-out URI for objects of "Pfam database of protein families".
        """
        RDF::URI.new("http://www.sanger.ac.uk/cgi-bin/Pfam/getacc?")

    @classmethod
    def PharmGKB(cls):
        """Returns the link-out URI for objects of "Pharmacogenetics and Pharmacogenomics Knowledge Base".
        """
        RDF::URI.new("http://www.pharmgkb.org/do/serve?objId=")

    @classmethod
    def PIR(cls):
        """Returns the link-out URI for objects of "Protein Information Resource".
        """
        RDF::URI.new("http://pir.georgetown.edu/cgi-bin/pirwww/nbrfget?uid=")

    @classmethod
    def PIRSF(cls):
        """Returns the link-out URI for objects of "PIR Superfamily Classification System".
        """
        RDF::URI.new("http://pir.georgetown.edu/cgi-bin/ipcSF?id=")

    @classmethod
    def PMCID(cls):
        """Returns the link-out URI for objects of "Pubmed Central".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/sites/entrez?db=pmc&cmd=search&term=")

    @classmethod
    def PMID(cls):
        """Returns the link-out URI for objects of "PubMed".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/pubmed/")

    @classmethod
    def PO(cls):
        """Returns the link-out URI for objects of "Plant Ontology Consortium Database".
        """
        RDF::URI.new("http://www.plantontology.org/amigo/go.cgi?action=query&view=query&search_constraint=terms&query=PO:")

    @classmethod
    def PO_REF(cls):
        """Returns the link-out URI for objects of "Plant Ontology custom references".
        """
        RDF::URI.new("http://wiki.plantontology.org:8080/index.php/PO_REF:")

    @classmethod
    def PomBase(cls):
        """Returns the link-out URI for objects of "PomBase".
        """
        RDF::URI.new("http://www.pombase.org/spombe/result/")

    @classmethod
    def PR(cls):
        """Returns the link-out URI for objects of "Protein Ontology".
        """
        RDF::URI.new("http://www.proconsortium.org/cgi-bin/pro/entry_pro?id=PR:")

    @classmethod
    def PRINTS(cls):
        """Returns the link-out URI for objects of "PRINTS compendium of protein fingerprints".
        """
        RDF::URI.new("http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/sprint/searchprintss.cgi?display_opts=Prints&category=None&queryform=False&regexpr=off&prints_accn=")

    @classmethod
    def ProDom(cls):
        """Returns the link-out URI for objects of "ProDom protein domain families".
        """
        RDF::URI.new("http://prodom.prabi.fr/prodom/current/cgi-bin/request.pl?question=DBEN&query=")

    @classmethod
    def Prosite(cls):
        """Returns the link-out URI for objects of "Prosite database of protein families and domains".
        """
        RDF::URI.new("http://www.expasy.ch/cgi-bin/prosite-search-ac?")

    @classmethod
    def PseudoCAP(cls):
        """Returns the link-out URI for objects of "Pseudomonas Genome Project".
        """
        RDF::URI.new("http://v2.pseudomonas.com/getAnnotation.do?locusID=")

    @classmethod
    def PSI_MOD(cls):
        """Returns the link-out URI for objects of "Proteomics Standards Initiative protein modification ontology".
        """
        RDF::URI.new("http://www.ebi.ac.uk/ontology-lookup/?termId=MOD:")

    @classmethod
    def PubChem_BioAssay(cls):
        """Returns the link-out URI for objects of "NCBI PubChem database of bioassay records".
        """
        RDF::URI.new("http://pubchem.ncbi.nlm.nih.gov/assay/assay.cgi?aid=")

    @classmethod
    def PubChem_Compound(cls):
        """Returns the link-out URI for objects of "NCBI PubChem database of chemical structures".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=")

    @classmethod
    def PubChem_Substance(cls):
        """Returns the link-out URI for objects of "NCBI PubChem database of chemical substances".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pcsubstance&term=")

    @classmethod
    def Reactome(cls):
        """Returns the link-out URI for objects of "Reactome - a curated knowledgebase of biological pathways".
        """
        RDF::URI.new("http://www.reactome.org/cgi-bin/eventbrowser_st_id?ST_ID=")

    @classmethod
    def RefSeq(cls):
        """Returns the link-out URI for objects of "RefSeq".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def RefSeq_NA(cls):
        """Returns the link-out URI for objects of "RefSeq (cls, Nucleic Acid)".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def RefSeq_Prot(cls):
        """Returns the link-out URI for objects of "RefSeq (cls, Protein)".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")

    @classmethod
    def Rfam(cls):
        """Returns the link-out URI for objects of "Rfam database of RNA families".
        """
        RDF::URI.new("http://rfam.sanger.ac.uk/family/")

    @classmethod
    def RGD(cls):
        """Returns the link-out URI for objects of "Rat Genome Database".
        """
        RDF::URI.new("http://rgd.mcw.edu/generalSearch/RgdSearch.jsp?quickSearch=1&searchKeyword=")

    @classmethod
    def RHEA(cls):
        """Returns the link-out URI for objects of "Rhea, the Annotated Reactions Database".
        """
        RDF::URI.new("http://www.ebi.ac.uk/rhea/reaction.xhtml?id=")

    @classmethod
    def RNAmods(cls):
        """Returns the link-out URI for objects of "RNA Modification Database".
        """
        RDF::URI.new("http://s59.cas.albany.edu/RNAmods/cgi-bin/rnashow.cgi?")

    @classmethod
    def RO(cls):
        """Returns the link-out URI for objects of "OBO Relation Ontology Ontology".
        """
        RDF::URI.new("http://purl.obolibrary.org/obo/RO_")

    @classmethod
    def SABIO_RK(cls):
        """Returns the link-out URI for objects of "SABIO Reaction Kinetics".
        """
        RDF::URI.new("http://sabio.villa-bosch.de/reacdetails.jsp?reactid=")

    @classmethod
    def SEED(cls):
        """Returns the link-out URI for objects of "The SEED;".
        """
        RDF::URI.new("http://www.theseed.org/linkin.cgi?id=")

    @classmethod
    def SGD(cls):
        """Returns the link-out URI for objects of "Saccharomyces Genome Database".
        """
        RDF::URI.new("http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=")

    @classmethod
    def SGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Saccharomyces Genome Database".
        """
        RDF::URI.new("http://db.yeastgenome.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def SGD_REF(cls):
        """Returns the link-out URI for objects of "Saccharomyces Genome Database".
        """
        RDF::URI.new("http://db.yeastgenome.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def SGN(cls):
        """Returns the link-out URI for objects of "Sol Genomics Network".
        """
        RDF::URI.new("http://www.sgn.cornell.edu/phenome/locus_display.pl?locus_id=")

    @classmethod
    def SGN_ref(cls):
        """Returns the link-out URI for objects of "Sol Genomics Network".
        """
        RDF::URI.new("http://www.sgn.cornell.edu/chado/publication.pl?pub_id=")

    @classmethod
    def SMART(cls):
        """Returns the link-out URI for objects of "Simple Modular Architecture Research Tool".
        """
        RDF::URI.new("http://smart.embl-heidelberg.de/smart/do_annotation.pl?BLAST=DUMMY&DOMAIN=")

    @classmethod
    def SO(cls):
        """Returns the link-out URI for objects of "Sequence Ontology".
        """
        RDF::URI.new("http://song.sourceforge.net/SOterm_tables.html#SO:")

    @classmethod
    def SUPERFAMILY(cls):
        """Returns the link-out URI for objects of "SUPERFAMILY protein annotation database".
        """
        RDF::URI.new("http://supfam.cs.bris.ac.uk/SUPERFAMILY/cgi-bin/scop.cgi?ipid=SSF")

    @classmethod
    def Swiss_Prot(cls):
        """Returns the link-out URI for objects of "UniProtKB/Swiss-Prot".
        """
        RDF::URI.new("http://www.uniprot.org/uniprot/")

    @classmethod
    def TAIR(cls):
        """Returns the link-out URI for objects of "The Arabidopsis Information Resource".
        """
        RDF::URI.new("http://arabidopsis.org/servlets/TairObject?accession=")

    @classmethod
    def taxon(cls):
        """Returns the link-out URI for objects of "NCBI Taxonomy".
        """
        RDF::URI.new("http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=")

    @classmethod
    def TC(cls):
        """Returns the link-out URI for objects of "Transport Protein Database".
        """
        RDF::URI.new("http://www.tcdb.org/tcdb/index.php?tc=")

    @classmethod
    def TGD_LOCUS(cls):
        """Returns the link-out URI for objects of "Tetrahymena Genome Database".
        """
        RDF::URI.new("http://db.ciliate.org/cgi-bin/locus.pl?locus=")

    @classmethod
    def TGD_REF(cls):
        """Returns the link-out URI for objects of "Tetrahymena Genome Database".
        """
        RDF::URI.new("http://db.ciliate.org/cgi-bin/reference/reference.pl?dbid=")

    @classmethod
    def TrEMBL(cls):
        """Returns the link-out URI for objects of "UniProtKB-TrEMBL protein sequence database".
        """
        RDF::URI.new("http://www.uniprot.org/uniprot/")

    @classmethod
    def UBERON(cls):
        """Returns the link-out URI for objects of "Uber-anatomy ontology".
        """
        RDF::URI.new("http://purl.obolibrary.org/obo/UBERON_")

    @classmethod
    def UM_BBD_enzymeID(cls):
        """Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
        """
        RDF::URI.new("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=ep&enzymeID=")

    @classmethod
    def UM_BBD_reactionID(cls):
        """Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
        """
        RDF::URI.new("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=r&reacID=")

    @classmethod
    def UM_BBD_ruleID(cls):
        """Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
        """
        RDF::URI.new("http://umbbd.msi.umn.edu/servlets/rule.jsp?rule=")

    @classmethod
    def UniMod(cls):
        """Returns the link-out URI for objects of "UniMod".
        """
        RDF::URI.new("http://www.unimod.org/modifications_view.php?editid1=")

    @classmethod
    def UniParc(cls):
        """Returns the link-out URI for objects of "UniProt Archive".
        """
        RDF::URI.new("http://www.uniprot.org/uniparc/")

    @classmethod
    def UniPathway(cls):
        """Returns the link-out URI for objects of "UniPathway".
        """
        RDF::URI.new("http://www.grenoble.prabi.fr/obiwarehouse/unipathway/upa?upid=")

    @classmethod
    def UniProtKB(cls):
        """Returns the link-out URI for objects of "Universal Protein Knowledgebase".
        """
        RDF::URI.new("http://www.uniprot.org/uniprot/")

    @classmethod
    def UniProtKB_KW(cls):
        """Returns the link-out URI for objects of "UniProt Knowledgebase keywords".
        """
        RDF::URI.new("http://www.uniprot.org/keywords/")

    @classmethod
    def UniProtKB_SubCell(cls):
        """Returns the link-out URI for objects of "UniProt Knowledgebase Subcellular Location vocabulary".
        """
        RDF::URI.new("http://www.uniprot.org/locations/")

    @classmethod
    def VBRC(cls):
        """Returns the link-out URI for objects of "Viral Bioinformatics Resource Center".
        """
        RDF::URI.new("http://vbrc.org/query.asp?web_id=VBRC:")

    @classmethod
    def VEGA(cls):
        """Returns the link-out URI for objects of "Vertebrate Genome Annotation database".
        """
        RDF::URI.new("http://vega.sanger.ac.uk/perl/searchview?species=all&idx=All&q=")

    @classmethod
    def VMD(cls):
        """Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
        """
        RDF::URI.new("http://vmd.vbi.vt.edu/cgi-bin/browse/browserDetail_new.cgi?gene_id=")

    @classmethod
    def WB(cls):
        """Returns the link-out URI for objects of "WormBase database of nematode biology".
        """
        RDF::URI.new("http://www.wormbase.org/db/gene/gene?name=")

    @classmethod
    def WB_REF(cls):
        """Returns the link-out URI for objects of "WormBase database of nematode biology".
        """
        RDF::URI.new("http://www.wormbase.org/db/misc/paper?name=")

    @classmethod
    def Wikipedia(cls):
        """Returns the link-out URI for objects of "Wikipedia".
        """
        RDF::URI.new("http://en.wikipedia.org/wiki/")

    @classmethod
    def WP(cls):
        """Returns the link-out URI for objects of "Wormpep database of proteins of C. elegans".
        """
        RDF::URI.new("http://www.wormbase.org/db/get?class=Protein;name=WP:")

    @classmethod
    def ZFIN(cls):
        """Returns the link-out URI for objects of "Zebrafish Information Network".
        """
        RDF::URI.new("http://zfin.org/cgi-bin/ZFIN_jump?record=")


