module BioInterchange

class GOXRef

  # Returns the link-out URI for objects of "Arabidopsis Genome Initiative".
  def self.AGI_LocusCode
    RDF::URI.new("http://arabidopsis.org/servlets/TairObject?type=locus&name=")
  end

  # Returns the link-out URI for objects of "PlasmoDB Plasmodium Genome Resource".
  def self.ApiDB_PlasmoDB
    RDF::URI.new("http://www.plasmodb.org/gene/")
  end

  # Returns the link-out URI for objects of "AraCyc metabolic pathway database for Arabidopsis thaliana".
  def self.AraCyc
    RDF::URI.new("http://www.arabidopsis.org:1555/ARA/NEW-IMAGE?type=NIL&object=")
  end

  # Returns the link-out URI for objects of "A Systematic Annotation Package for Community Analysis of Genomes".
  def self.ASAP
    RDF::URI.new("https://asap.ahabs.wisc.edu/annotation/php/feature_info.php?FeatureID=")
  end

  # Returns the link-out URI for objects of "Aspergillus Genome Database".
  def self.AspGD
    RDF::URI.new("http://www.aspergillusgenome.org/cgi-bin/locus.pl?dbid=")
  end

  # Returns the link-out URI for objects of "Aspergillus Genome Database".
  def self.AspGD_LOCUS
    RDF::URI.new("http://www.aspergillusgenome.org/cgi-bin/locus.pl?locus=")
  end

  # Returns the link-out URI for objects of "Aspergillus Genome Database".
  def self.AspGD_REF
    RDF::URI.new("http://www.aspergillusgenome.org/cgi-bin/reference/reference.pl?dbid=")
  end

  # Returns the link-out URI for objects of "Basic Formal Ontology".
  def self.BFO
    RDF::URI.new("http://purl.obolibrary.org/obo/BFO_")
  end

  # Returns the link-out URI for objects of "BioCyc collection of metabolic pathway databases".
  def self.BioCyc
    RDF::URI.new("http://biocyc.org/META/NEW-IMAGE?type=PATHWAY&object=")
  end

  # Returns the link-out URI for objects of "BioModels Database".
  def self.BIOMD
    RDF::URI.new("http://www.ebi.ac.uk/compneur-srv/biomodels-main/publ-model.do?mid=")
  end

  # Returns the link-out URI for objects of "BRENDA, The Comprehensive Enzyme Information System".
  def self.BRENDA
    RDF::URI.new("http://www.brenda-enzymes.info/php/result_flat.php4?ecno=")
  end

  # Returns the link-out URI for objects of "Magnaporthe grisea Database".
  def self.Broad_MGG
    RDF::URI.new("http://www.broad.mit.edu/annotation/genome/magnaporthe_grisea/GeneLocus.html?sp=S")
  end

  # Returns the link-out URI for objects of "Catalog of Fishes genus database".
  def self.CASGEN
    RDF::URI.new("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Genus&id=")
  end

  # Returns the link-out URI for objects of "Catalog of Fishes publications database".
  def self.CASREF
    RDF::URI.new("http://research.calacademy.org/research/ichthyology/catalog/getref.asp?id=")
  end

  # Returns the link-out URI for objects of "Catalog of Fishes species database".
  def self.CASSPC
    RDF::URI.new("http://research.calacademy.org/research/ichthyology/catalog/getname.asp?rank=Species&id=1979")
  end

  # Returns the link-out URI for objects of "Conserved Domain Database at NCBI".
  def self.CDD
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=")
  end

  # Returns the link-out URI for objects of "Candida Genome Database".
  def self.CGD
    RDF::URI.new("http://www.candidagenome.org/cgi-bin/locus.pl?dbid=")
  end

  # Returns the link-out URI for objects of "Candida Genome Database".
  def self.CGD_LOCUS
    RDF::URI.new("http://www.candidagenome.org/cgi-bin/locus.pl?locus=")
  end

  # Returns the link-out URI for objects of "Candida Genome Database".
  def self.CGD_REF
    RDF::URI.new("http://www.candidagenome.org/cgi-bin/reference/reference.pl?dbid=")
  end

  # Returns the link-out URI for objects of "Chemical Entities of Biological Interest".
  def self.CHEBI
    RDF::URI.new("http://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:")
  end

  # Returns the link-out URI for objects of "Cell Type Ontology".
  def self.CL
    RDF::URI.new("http://purl.obolibrary.org/obo/CL_")
  end

  # Returns the link-out URI for objects of "NCBI COG cluster".
  def self.COG_Cluster
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/COG/new/release/cow.cgi?cog=")
  end

  # Returns the link-out URI for objects of "NCBI COG function".
  def self.COG_Function
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/COG/grace/shokog.cgi?fun=")
  end

  # Returns the link-out URI for objects of "NCBI COG pathway".
  def self.COG_Pathway
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/COG/new/release/coglist.cgi?pathw=")
  end

  # Returns the link-out URI for objects of "CORUM - the Comprehensive Resource of Mammalian protein complexes".
  def self.CORUM
    RDF::URI.new("http://mips.gsf.de/genre/proj/corum/complexdetails.html?id=")
  end

  # Returns the link-out URI for objects of "NCBI dbSNP".
  def self.dbSNP
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=")
  end

  # Returns the link-out URI for objects of "DNA Databank of Japan".
  def self.DDBJ
    RDF::URI.new("http://arsa.ddbj.nig.ac.jp/arsa/ddbjSplSearch?KeyWord=")
  end

  # Returns the link-out URI for objects of "dictyBase".
  def self.dictyBase
    RDF::URI.new("http://dictybase.org/gene/")
  end

  # Returns the link-out URI for objects of "dictyBase".
  def self.dictyBase_gene_name
    RDF::URI.new("http://dictybase.org/gene/")
  end

  # Returns the link-out URI for objects of "dictyBase literature references".
  def self.dictyBase_REF
    RDF::URI.new("http://dictybase.org/db/cgi-bin/dictyBase/reference/reference.pl?refNo=")
  end

  # Returns the link-out URI for objects of "Digital Object Identifier".
  def self.DOI
    RDF::URI.new("http://dx.doi.org/DOI:")
  end

  # Returns the link-out URI for objects of "Enzyme Commission".
  def self.EC
    RDF::URI.new("http://www.expasy.org/enzyme/")
  end

  # Returns the link-out URI for objects of "EchoBASE post-genomic database for Escherichia coli".
  def self.EchoBASE
    RDF::URI.new("http://www.biolws1.york.ac.uk/echobase/Gene.cfm?recordID=")
  end

  # Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
  def self.ECK
    RDF::URI.new("http://www.ecogene.org/geneInfo.php?eck_id=")
  end

  # Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
  def self.EcoCyc
    RDF::URI.new("http://biocyc.org/ECOLI/NEW-IMAGE?type=PATHWAY&object=")
  end

  # Returns the link-out URI for objects of "Encyclopedia of E. coli metabolism".
  def self.EcoCyc_REF
    RDF::URI.new("http://biocyc.org/ECOLI/reference.html?type=CITATION-FRAME&object=")
  end

  # Returns the link-out URI for objects of "EcoGene Database of Escherichia coli Sequence and Function".
  def self.ECOGENE
    RDF::URI.new("http://www.ecogene.org/geneInfo.php?eg_id=")
  end

  # Returns the link-out URI for objects of "EMBL Nucleotide Sequence Database".
  def self.EMBL
    RDF::URI.new("http://www.ebi.ac.uk/cgi-bin/emblfetch?style=html&Submit=Go&id=")
  end

  # Returns the link-out URI for objects of "European Nucleotide Archive".
  def self.ENA
    RDF::URI.new("http://www.ebi.ac.uk/ena/data/view/")
  end

  # Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
  def self.ENSEMBL
    RDF::URI.new("http://www.ensembl.org/id/")
  end

  # Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
  def self.ENSEMBL_GeneID
    RDF::URI.new("http://www.ensembl.org/id/")
  end

  # Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
  def self.ENSEMBL_ProteinID
    RDF::URI.new("http://www.ensembl.org/id/")
  end

  # Returns the link-out URI for objects of "Ensembl database of automatically annotated genomic data".
  def self.ENSEMBL_TranscriptID
    RDF::URI.new("http://www.ensembl.org/id/")
  end

  # Returns the link-out URI for objects of "Swiss Institute of Bioinformatics enzyme database".
  def self.ENZYME
    RDF::URI.new("http://www.expasy.ch/cgi-bin/nicezyme.pl?")
  end

  # Returns the link-out URI for objects of "Drosophila gross anatomy".
  def self.FBbt
    RDF::URI.new("http://flybase.org/cgi-bin/fbcvq.html?query=FBbt:")
  end

  # Returns the link-out URI for objects of "Human Genome Database".
  def self.GDB
    RDF::URI.new("http://www.gdb.org/gdb-bin/genera/accno?accessionNum=GDB:")
  end

  # Returns the link-out URI for objects of "GenBank".
  def self.GenBank
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=nucleotide&val=")
  end

  # Returns the link-out URI for objects of "Domain Architecture Classification".
  def self.Gene3D
    RDF::URI.new("http://gene3d.biochem.ucl.ac.uk/superfamily/?accession=")
  end

  # Returns the link-out URI for objects of "Glossina morsitans GeneDB".
  def self.GeneDB_Gmorsitans
    RDF::URI.new("http://www.genedb.org/genedb/Search?organism=glossina&name=")
  end

  # Returns the link-out URI for objects of "Leishmania major GeneDB".
  def self.GeneDB_Lmajor
    RDF::URI.new("http://www.genedb.org/genedb/Search?organism=leish&name=")
  end

  # Returns the link-out URI for objects of "Plasmodium falciparum GeneDB".
  def self.GeneDB_Pfalciparum
    RDF::URI.new("http://www.genedb.org/genedb/Search?organism=malaria&name=")
  end

  # Returns the link-out URI for objects of "Schizosaccharomyces pombe GeneDB".
  def self.GeneDB_Spombe
    RDF::URI.new("http://old.genedb.org/genedb/Search?organism=pombe&name=")
  end

  # Returns the link-out URI for objects of "Trypanosoma brucei GeneDB".
  def self.GeneDB_Tbrucei
    RDF::URI.new("http://www.genedb.org/genedb/Search?organism=tryp&name=")
  end

  # Returns the link-out URI for objects of "NCBI Gene Expression Omnibus".
  def self.GEO
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/sites/GDSbrowser?acc=")
  end

  # Returns the link-out URI for objects of "Gene Ontology Database".
  def self.GO
    RDF::URI.new("http://amigo.geneontology.org/cgi-bin/amigo/term-details.cgi?term=GO:")
  end

  # Returns the link-out URI for objects of "Gene Ontology Database references".
  def self.GO_REF
    RDF::URI.new("http://www.geneontology.org/cgi-bin/references.cgi#GO_REF:")
  end

  # Returns the link-out URI for objects of "Gene Ontology Normal Usage Tracking System (GONUTS)".
  def self.GONUTS
    RDF::URI.new("http://gowiki.tamu.edu/wiki/index.php/")
  end

  # Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
  def self.GR
    RDF::URI.new("http://www.gramene.org/db/searches/browser?search_type=All&RGN=on&query=")
  end

  # Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
  def self.GR_GENE
    RDF::URI.new("http://www.gramene.org/db/genes/search_gene?acc=")
  end

  # Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
  def self.GR_PROTEIN
    RDF::URI.new("http://www.gramene.org/db/protein/protein_search?acc=")
  end

  # Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
  def self.GR_QTL
    RDF::URI.new("http://www.gramene.org/db/qtl/qtl_display?qtl_accession_id=")
  end

  # Returns the link-out URI for objects of "Gramene: A Comparative Mapping Resource for Grains".
  def self.GR_REF
    RDF::URI.new("http://www.gramene.org/db/literature/pub_search?ref_id=")
  end

  # Returns the link-out URI for objects of "H-invitational Database".
  def self.H_invDB_cDNA
    RDF::URI.new("http://www.h-invitational.jp/hinv/spsoup/transcript_view?acc_id=")
  end

  # Returns the link-out URI for objects of "H-invitational Database".
  def self.H_invDB_locus
    RDF::URI.new("http://www.h-invitational.jp/hinv/spsoup/locus_view?hix_id=")
  end

  # Returns the link-out URI for objects of "High-quality Automated and Manual Annotation of microbial Proteomes".
  def self.HAMAP
    RDF::URI.new("http://us.expasy.org/unirules/")
  end

  # Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
  def self.HGNC
    RDF::URI.new("http://www.genenames.org/data/hgnc_data.php?hgnc_id=HGNC:")
  end

  # Returns the link-out URI for objects of "HUGO Gene Nomenclature Committee".
  def self.HGNC_gene
    RDF::URI.new("http://www.genenames.org/data/hgnc_data.php?app_sym=")
  end

  # Returns the link-out URI for objects of "Human Protein Atlas tissue profile information".
  def self.HPA
    RDF::URI.new("http://www.proteinatlas.org/tissue_profile.php?antibody_id=")
  end

  # Returns the link-out URI for objects of "Human Protein Atlas antibody information".
  def self.HPA_antibody
    RDF::URI.new("http://www.proteinatlas.org/antibody_info.php?antibody_id=")
  end

  # Returns the link-out URI for objects of "Integrated Microbial Genomes; JGI web site for genome annotation".
  def self.IMG
    RDF::URI.new("http://img.jgi.doe.gov/cgi-bin/pub/main.cgi?section=GeneDetail&page=geneDetail&gene_oid=")
  end

  # Returns the link-out URI for objects of "IntAct protein interaction database".
  def self.IntAct
    RDF::URI.new("http://www.ebi.ac.uk/intact/search/do/search?searchString=")
  end

  # Returns the link-out URI for objects of "InterPro database of protein domains and motifs".
  def self.InterPro
    RDF::URI.new("http://www.ebi.ac.uk/interpro/IEntry?ac=")
  end

  # Returns the link-out URI for objects of "International Standard Book Number".
  def self.ISBN
    RDF::URI.new("http://my.linkbaton.com/get?lbCC=q&nC=q&genre=book&item=")
  end

  # Returns the link-out URI for objects of "International Union of Pharmacology".
  def self.IUPHAR_GPCR
    RDF::URI.new("http://www.iuphar-db.org/DATABASE/FamilyMenuForward?familyId=")
  end

  # Returns the link-out URI for objects of "International Union of Pharmacology".
  def self.IUPHAR_RECEPTOR
    RDF::URI.new("http://www.iuphar-db.org/DATABASE/ObjectDisplayForward?objectId=")
  end

  # Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
  def self.JCVI_CMR
    RDF::URI.new("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenePage.cgi?locus=")
  end

  # Returns the link-out URI for objects of "Comprehensive Microbial Resource at the J. Craig Venter Institute".
  def self.JCVI_EGAD
    RDF::URI.new("http://cmr.jcvi.org/cgi-bin/CMR/EgadSearch.cgi?search_string=")
  end

  # Returns the link-out URI for objects of "Genome Properties database at the J. Craig Venter Institute".
  def self.JCVI_GenProp
    RDF::URI.new("http://cmr.jcvi.org/cgi-bin/CMR/shared/GenomePropDefinition.cgi?prop_acc=")
  end

  # Returns the link-out URI for objects of "Medicago truncatula genome database at the J. Craig Venter Institute ".
  def self.JCVI_Medtr
    RDF::URI.new("http://medicago.jcvi.org/cgi-bin/medicago/search/shared/ORF_infopage.cgi?orf=")
  end

  # Returns the link-out URI for objects of "TIGRFAMs HMM collection at the J. Craig Venter Institute".
  def self.JCVI_TIGRFAMS
    RDF::URI.new("http://search.jcvi.org/search?p&q=")
  end

  # Returns the link-out URI for objects of "Digital archive of scholarly articles".
  def self.JSTOR
    RDF::URI.new("http://www.jstor.org/stable/")
  end

  # Returns the link-out URI for objects of "KEGG Enzyme Database".
  def self.KEGG_ENZYME
    RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?ec:")
  end

  # Returns the link-out URI for objects of "KEGG LIGAND Database".
  def self.KEGG_LIGAND
    RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?cpd:")
  end

  # Returns the link-out URI for objects of "KEGG Pathways Database".
  def self.KEGG_PATHWAY
    RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?path:")
  end

  # Returns the link-out URI for objects of "KEGG Reaction Database".
  def self.KEGG_REACTION
    RDF::URI.new("http://www.genome.jp/dbget-bin/www_bget?rn:")
  end

  # Returns the link-out URI for objects of "LifeDB".
  def self.LIFEdb
    RDF::URI.new("http://www.dkfz.de/LIFEdb/LIFEdb.aspx?ID=")
  end

  # Returns the link-out URI for objects of "Adult Mouse Anatomical Dictionary".
  def self.MA
    RDF::URI.new("http://www.informatics.jax.org/searches/AMA.cgi?id=MA:")
  end

  # Returns the link-out URI for objects of "MaizeGDB".
  def self.MaizeGDB
    RDF::URI.new("http://www.maizegdb.org/cgi-bin/id_search.cgi?id=")
  end

  # Returns the link-out URI for objects of "MaizeGDB".
  def self.MaizeGDB_Locus
    RDF::URI.new("http://www.maizegdb.org/cgi-bin/displaylocusresults.cgi?term=")
  end

  # Returns the link-out URI for objects of "MEROPS peptidase database".
  def self.MEROPS
    RDF::URI.new("http://merops.sanger.ac.uk/cgi-bin/pepsum?mid=")
  end

  # Returns the link-out URI for objects of "MEROPS peptidase database".
  def self.MEROPS_fam
    RDF::URI.new("http://merops.sanger.ac.uk/cgi-bin/famsum?family=")
  end

  # Returns the link-out URI for objects of "Medical Subject Headings".
  def self.MeSH
    RDF::URI.new("http://www.nlm.nih.gov/cgi/mesh/2005/MB_cgi?mode=&term=")
  end

  # Returns the link-out URI for objects of "Metabolic Encyclopedia of metabolic and other pathways".
  def self.MetaCyc
    RDF::URI.new("http://biocyc.org/META/NEW-IMAGE?type=NIL&object=")
  end

  # Returns the link-out URI for objects of "Mouse Genome Informatics".
  def self.MGI
    RDF::URI.new("http://www.informatics.jax.org/accession/")
  end

  # Returns the link-out URI for objects of "MIPS Functional Catalogue".
  def self.MIPS_funcat
    RDF::URI.new("http://mips.gsf.de/cgi-bin/proj/funcatDB/search_advanced.pl?action=2&wert=")
  end

  # Returns the link-out URI for objects of "MGED Ontology".
  def self.MO
    RDF::URI.new("http://mged.sourceforge.net/ontologies/MGEDontology.php#")
  end

  # Returns the link-out URI for objects of "ModBase comprehensive Database of Comparative Protein Structure Models".
  def self.ModBase
    RDF::URI.new("http://salilab.org/modbase/searchbyid?databaseID=")
  end

  # Returns the link-out URI for objects of "Nottingham Arabidopsis Stock Centre Seeds Database".
  def self.NASC_code
    RDF::URI.new("http://seeds.nottingham.ac.uk/NASC/stockatidb.lasso?code=")
  end

  # Returns the link-out URI for objects of "NCBI Gene".
  def self.NCBI_Gene
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=Retrieve&db=gene&list_uids=")
  end

  # Returns the link-out URI for objects of "NCBI databases".
  def self.NCBI_gi
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")
  end

  # Returns the link-out URI for objects of "NCBI GenPept".
  def self.NCBI_GP
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?db=protein&val=")
  end

  # Returns the link-out URI for objects of "Neuroscience Information Framework standard ontology, subcellular hierarchy".
  def self.NIF_Subcellular
    RDF::URI.new("http://www.neurolex.org/wiki/")
  end

  # Returns the link-out URI for objects of "National Microbial Pathogen Data Resource".
  def self.NMPDR
    RDF::URI.new("http://www.nmpdr.org/linkin.cgi?id=")
  end

  # Returns the link-out URI for objects of "Mendelian Inheritance in Man".
  def self.OMIM
    RDF::URI.new("http://omim.org/entry/")
  end

  # Returns the link-out URI for objects of "Genome Annotation Tool (Agrobacterium tumefaciens C58); PAMGO Interest Group".
  def self.PAMGO_GAT
    RDF::URI.new("http://agro.vbi.vt.edu/public/servlet/GeneEdit?&Search=Search&level=2&genename=")
  end

  # Returns the link-out URI for objects of "Magnaporthe grisea database".
  def self.PAMGO_MGG
    RDF::URI.new("http://scotland.fgl.ncsu.edu/cgi-bin/adHocQuery.cgi?adHocQuery_dbName=smeng_goannotation&Action=Data&QueryName=Functional+Categorization+of+MGG+GO+Annotation&P_KeyWord=")
  end

  # Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
  def self.PAMGO_VMD
    RDF::URI.new("http://vmd.vbi.vt.edu/cgi-bin/browse/go_detail.cgi?gene_id=")
  end

  # Returns the link-out URI for objects of "Protein ANalysis THrough Evolutionary Relationships".
  def self.PANTHER
    RDF::URI.new("http://pantree.org/node/annotationNode.jsp?id=")
  end

  # Returns the link-out URI for objects of "PathoSystems Resource Integration Center".
  def self.PATRIC
    RDF::URI.new("http://patric.vbi.vt.edu/gene/overview.php?fid=")
  end

  # Returns the link-out URI for objects of "Protein Data Bank".
  def self.PDB
    RDF::URI.new("http://www.rcsb.org/pdb/cgi/explore.cgi?pdbId=")
  end

  # Returns the link-out URI for objects of "Pfam database of protein families".
  def self.Pfam
    RDF::URI.new("http://www.sanger.ac.uk/cgi-bin/Pfam/getacc?")
  end

  # Returns the link-out URI for objects of "Pharmacogenetics and Pharmacogenomics Knowledge Base".
  def self.PharmGKB
    RDF::URI.new("http://www.pharmgkb.org/do/serve?objId=")
  end

  # Returns the link-out URI for objects of "Protein Information Resource".
  def self.PIR
    RDF::URI.new("http://pir.georgetown.edu/cgi-bin/pirwww/nbrfget?uid=")
  end

  # Returns the link-out URI for objects of "PIR Superfamily Classification System".
  def self.PIRSF
    RDF::URI.new("http://pir.georgetown.edu/cgi-bin/ipcSF?id=")
  end

  # Returns the link-out URI for objects of "Pubmed Central".
  def self.PMCID
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/sites/entrez?db=pmc&cmd=search&term=")
  end

  # Returns the link-out URI for objects of "PubMed".
  def self.PMID
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/pubmed/")
  end

  # Returns the link-out URI for objects of "Plant Ontology Consortium Database".
  def self.PO
    RDF::URI.new("http://www.plantontology.org/amigo/go.cgi?action=query&view=query&search_constraint=terms&query=PO:")
  end

  # Returns the link-out URI for objects of "Plant Ontology custom references".
  def self.PO_REF
    RDF::URI.new("http://wiki.plantontology.org:8080/index.php/PO_REF:")
  end

  # Returns the link-out URI for objects of "PomBase".
  def self.PomBase
    RDF::URI.new("http://www.pombase.org/spombe/result/")
  end

  # Returns the link-out URI for objects of "Protein Ontology".
  def self.PR
    RDF::URI.new("http://www.proconsortium.org/cgi-bin/pro/entry_pro?id=PR:")
  end

  # Returns the link-out URI for objects of "PRINTS compendium of protein fingerprints".
  def self.PRINTS
    RDF::URI.new("http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/sprint/searchprintss.cgi?display_opts=Prints&category=None&queryform=false&regexpr=off&prints_accn=")
  end

  # Returns the link-out URI for objects of "ProDom protein domain families".
  def self.ProDom
    RDF::URI.new("http://prodom.prabi.fr/prodom/current/cgi-bin/request.pl?question=DBEN&query=")
  end

  # Returns the link-out URI for objects of "Prosite database of protein families and domains".
  def self.Prosite
    RDF::URI.new("http://www.expasy.ch/cgi-bin/prosite-search-ac?")
  end

  # Returns the link-out URI for objects of "Pseudomonas Genome Project".
  def self.PseudoCAP
    RDF::URI.new("http://v2.pseudomonas.com/getAnnotation.do?locusID=")
  end

  # Returns the link-out URI for objects of "Proteomics Standards Initiative protein modification ontology".
  def self.PSI_MOD
    RDF::URI.new("http://www.ebi.ac.uk/ontology-lookup/?termId=MOD:")
  end

  # Returns the link-out URI for objects of "NCBI PubChem database of bioassay records".
  def self.PubChem_BioAssay
    RDF::URI.new("http://pubchem.ncbi.nlm.nih.gov/assay/assay.cgi?aid=")
  end

  # Returns the link-out URI for objects of "NCBI PubChem database of chemical structures".
  def self.PubChem_Compound
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pccompound&term=")
  end

  # Returns the link-out URI for objects of "NCBI PubChem database of chemical substances".
  def self.PubChem_Substance
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/query.fcgi?CMD=search&DB=pcsubstance&term=")
  end

  # Returns the link-out URI for objects of "Reactome - a curated knowledgebase of biological pathways".
  def self.Reactome
    RDF::URI.new("http://www.reactome.org/cgi-bin/eventbrowser_st_id?ST_ID=")
  end

  # Returns the link-out URI for objects of "RefSeq".
  def self.RefSeq
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")
  end

  # Returns the link-out URI for objects of "RefSeq (Nucleic Acid)".
  def self.RefSeq_NA
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")
  end

  # Returns the link-out URI for objects of "RefSeq (Protein)".
  def self.RefSeq_Prot
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=")
  end

  # Returns the link-out URI for objects of "Rfam database of RNA families".
  def self.Rfam
    RDF::URI.new("http://rfam.sanger.ac.uk/family/")
  end

  # Returns the link-out URI for objects of "Rat Genome Database".
  def self.RGD
    RDF::URI.new("http://rgd.mcw.edu/generalSearch/RgdSearch.jsp?quickSearch=1&searchKeyword=")
  end

  # Returns the link-out URI for objects of "Rhea, the Annotated Reactions Database".
  def self.RHEA
    RDF::URI.new("http://www.ebi.ac.uk/rhea/reaction.xhtml?id=")
  end

  # Returns the link-out URI for objects of "RNA Modification Database".
  def self.RNAmods
    RDF::URI.new("http://s59.cas.albany.edu/RNAmods/cgi-bin/rnashow.cgi?")
  end

  # Returns the link-out URI for objects of "OBO Relation Ontology Ontology".
  def self.RO
    RDF::URI.new("http://purl.obolibrary.org/obo/RO_")
  end

  # Returns the link-out URI for objects of "SABIO Reaction Kinetics".
  def self.SABIO_RK
    RDF::URI.new("http://sabio.villa-bosch.de/reacdetails.jsp?reactid=")
  end

  # Returns the link-out URI for objects of "The SEED;".
  def self.SEED
    RDF::URI.new("http://www.theseed.org/linkin.cgi?id=")
  end

  # Returns the link-out URI for objects of "Saccharomyces Genome Database".
  def self.SGD
    RDF::URI.new("http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=")
  end

  # Returns the link-out URI for objects of "Saccharomyces Genome Database".
  def self.SGD_LOCUS
    RDF::URI.new("http://db.yeastgenome.org/cgi-bin/locus.pl?locus=")
  end

  # Returns the link-out URI for objects of "Saccharomyces Genome Database".
  def self.SGD_REF
    RDF::URI.new("http://db.yeastgenome.org/cgi-bin/reference/reference.pl?dbid=")
  end

  # Returns the link-out URI for objects of "Sol Genomics Network".
  def self.SGN
    RDF::URI.new("http://www.sgn.cornell.edu/phenome/locus_display.pl?locus_id=")
  end

  # Returns the link-out URI for objects of "Sol Genomics Network".
  def self.SGN_ref
    RDF::URI.new("http://www.sgn.cornell.edu/chado/publication.pl?pub_id=")
  end

  # Returns the link-out URI for objects of "Simple Modular Architecture Research Tool".
  def self.SMART
    RDF::URI.new("http://smart.embl-heidelberg.de/smart/do_annotation.pl?BLAST=DUMMY&DOMAIN=")
  end

  # Returns the link-out URI for objects of "Sequence Ontology".
  def self.SO
    RDF::URI.new("http://song.sourceforge.net/SOterm_tables.html#SO:")
  end

  # Returns the link-out URI for objects of "SUPERFAMILY protein annotation database".
  def self.SUPERFAMILY
    RDF::URI.new("http://supfam.cs.bris.ac.uk/SUPERFAMILY/cgi-bin/scop.cgi?ipid=SSF")
  end

  # Returns the link-out URI for objects of "UniProtKB/Swiss-Prot".
  def self.Swiss_Prot
    RDF::URI.new("http://www.uniprot.org/uniprot/")
  end

  # Returns the link-out URI for objects of "The Arabidopsis Information Resource".
  def self.TAIR
    RDF::URI.new("http://arabidopsis.org/servlets/TairObject?accession=")
  end

  # Returns the link-out URI for objects of "NCBI Taxonomy".
  def self.taxon
    RDF::URI.new("http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=")
  end

  # Returns the link-out URI for objects of "Transport Protein Database".
  def self.TC
    RDF::URI.new("http://www.tcdb.org/tcdb/index.php?tc=")
  end

  # Returns the link-out URI for objects of "Tetrahymena Genome Database".
  def self.TGD_LOCUS
    RDF::URI.new("http://db.ciliate.org/cgi-bin/locus.pl?locus=")
  end

  # Returns the link-out URI for objects of "Tetrahymena Genome Database".
  def self.TGD_REF
    RDF::URI.new("http://db.ciliate.org/cgi-bin/reference/reference.pl?dbid=")
  end

  # Returns the link-out URI for objects of "UniProtKB-TrEMBL protein sequence database".
  def self.TrEMBL
    RDF::URI.new("http://www.uniprot.org/uniprot/")
  end

  # Returns the link-out URI for objects of "Uber-anatomy ontology".
  def self.UBERON
    RDF::URI.new("http://purl.obolibrary.org/obo/UBERON_")
  end

  # Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
  def self.UM_BBD_enzymeID
    RDF::URI.new("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=ep&enzymeID=")
  end

  # Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
  def self.UM_BBD_reactionID
    RDF::URI.new("http://umbbd.msi.umn.edu/servlets/pageservlet?ptype=r&reacID=")
  end

  # Returns the link-out URI for objects of "University of Minnesota Biocatalysis/Biodegradation Database".
  def self.UM_BBD_ruleID
    RDF::URI.new("http://umbbd.msi.umn.edu/servlets/rule.jsp?rule=")
  end

  # Returns the link-out URI for objects of "UniMod".
  def self.UniMod
    RDF::URI.new("http://www.unimod.org/modifications_view.php?editid1=")
  end

  # Returns the link-out URI for objects of "UniProt Archive".
  def self.UniParc
    RDF::URI.new("http://www.uniprot.org/uniparc/")
  end

  # Returns the link-out URI for objects of "UniPathway".
  def self.UniPathway
    RDF::URI.new("http://www.grenoble.prabi.fr/obiwarehouse/unipathway/upa?upid=")
  end

  # Returns the link-out URI for objects of "Universal Protein Knowledgebase".
  def self.UniProtKB
    RDF::URI.new("http://www.uniprot.org/uniprot/")
  end

  # Returns the link-out URI for objects of "UniProt Knowledgebase keywords".
  def self.UniProtKB_KW
    RDF::URI.new("http://www.uniprot.org/keywords/")
  end

  # Returns the link-out URI for objects of "UniProt Knowledgebase Subcellular Location vocabulary".
  def self.UniProtKB_SubCell
    RDF::URI.new("http://www.uniprot.org/locations/")
  end

  # Returns the link-out URI for objects of "Viral Bioinformatics Resource Center".
  def self.VBRC
    RDF::URI.new("http://vbrc.org/query.asp?web_id=VBRC:")
  end

  # Returns the link-out URI for objects of "Vertebrate Genome Annotation database".
  def self.VEGA
    RDF::URI.new("http://vega.sanger.ac.uk/perl/searchview?species=all&idx=All&q=")
  end

  # Returns the link-out URI for objects of "Virginia Bioinformatics Institute Microbial Database".
  def self.VMD
    RDF::URI.new("http://vmd.vbi.vt.edu/cgi-bin/browse/browserDetail_new.cgi?gene_id=")
  end

  # Returns the link-out URI for objects of "WormBase database of nematode biology".
  def self.WB
    RDF::URI.new("http://www.wormbase.org/db/gene/gene?name=")
  end

  # Returns the link-out URI for objects of "WormBase database of nematode biology".
  def self.WB_REF
    RDF::URI.new("http://www.wormbase.org/db/misc/paper?name=")
  end

  # Returns the link-out URI for objects of "Wikipedia".
  def self.Wikipedia
    RDF::URI.new("http://en.wikipedia.org/wiki/")
  end

  # Returns the link-out URI for objects of "Wormpep database of proteins of C. elegans".
  def self.WP
    RDF::URI.new("http://www.wormbase.org/db/get?class=Protein;name=WP:")
  end

  # Returns the link-out URI for objects of "Zebrafish Information Network".
  def self.ZFIN
    RDF::URI.new("http://zfin.org/cgi-bin/ZFIN_jump?record=")
  end

end

end
