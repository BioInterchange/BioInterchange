module BioInterchange

class LifeScienceRegistry

  def self.bind
    "http://www.bind.ca/Action?identifier=bindid&idsearch=$id"
  end

  def self.chebi
    "http://www.ebi.ac.uk/chebi/searchId.do?chebiId=$id"
  end

  def self.ensembl
    "http://www.ensembl.org/id/$id"
  end

  def self.ec
    "http://www.chem.qmul.ac.uk/iubmb/$id"
  end

  def self.uniprot
    "http://www.uniprot.org/uniprot/$id"
  end

  def self.taxonomy
    "http://www.ncbi.nlm.nih.gov/Taxonomy/Browser/wwwtax.cgi?id=$id"
  end

  def self.biomodels
    "http://www.ebi.ac.uk/biomodels-main/$id"
  end

  def self.miriam_collection
    "http://www.ebi.ac.uk/miriam/main/$id"
  end

  def self.icd
    "http://apps.who.int/classifications/icd10/browse/2010/en#/$id"
  end

  def self.intact
    "http://www.ebi.ac.uk/intact/pages/details/details.xhtml?interactionAc=$id"
  end

  def self.interpro
    "http://www.ebi.ac.uk/interpro/IEntry?ac=$id"
  end

  def self.kegg_pathway
    "http://www.genome.jp/dbget-bin/www_bget?map$id"
  end

  def self.kegg_compound
    "http://www.genome.jp/dbget-bin/www_bget?cpd:$id"
  end

  def self.kegg_reaction
    "http://www.genome.jp/dbget-bin/www_bget?rn:$id"
  end

  def self.medline
    "http://srs.ebi.ac.uk/srsbin/cgi-bin/wgetz?-view+MedlineFull+[medline-PMID:$id] "
  end

  def self.pubmed
    "http://www.ncbi.nlm.nih.gov/pubmed/$id"
  end

  def self.omim
    "http://www.ncbi.nlm.nih.gov/omim/$id"
  end

  def self.pirsf
    "http://pir.georgetown.edu/cgi-bin/ipcSF?id=$id"
  end

  def self.reactome
    "http://www.reactome.org/cgi-bin/eventbrowser_st_id?FROM_REACTOME=1&ST_ID=$id"
  end

  def self.doi
    "http://dx.doi.org/$id"
  end

  def self.pdb
    "http://www.rcsb.org/pdb/explore/explore.do?structureId=$id"
  end

  def self.go
    "http://amigo.geneontology.org/cgi-bin/amigo/term-details.cgi?term=GO:$id"
  end

  def self.sgd
    "http://db.yeastgenome.org/cgi-bin/locus.pl?dbid=$id"
  end

  def self.sbo
    "http://www.ebi.ac.uk/sbo/main/$id"
  end

  def self.kegg_drug
    "http://www.genome.jp/dbget-bin/www_bget?dr:$id"
  end

  def self.kegg_glycan
    "http://www.genome.jp/dbget-bin/www_bget?gl:$id"
  end

  def self.pfam
    "http://pfam.sanger.ac.uk/family?entry=$id"
  end

  def self.flybase
    "http://flybase.org/reports/$id.html"
  end

  def self.wormpep
    "http://www.wormbase.org/db/seq/protein?name=$id"
  end

  def self.prosite
    "http://www.expasy.org/cgi-bin/nicesite.pl?$id"
  end

  def self.pubchem_substance
    "http://www.ncbi.nlm.nih.gov/sites/entrez?cmd=search&db=pcsubstance&term=$id"
  end

  def self.pubchem_compound
    "http://pubchem.ncbi.nlm.nih.gov/summary/summary.cgi?db=pccompound&term=$id"
  end

  def self.arxiv
    "http://arxiv.org/abs/$id"
  end

  def self.arrayexpress
    "http://www.ebi.ac.uk/arrayexpress/experiments/$id"
  end

  def self.mgi
    "http://www.informatics.jax.org/searches/accession_report.cgi?id=mgi:$id"
  end

  def self.sabiork_reaction
    "http://sabiork.h-its.org/index2.jsp?reac=$id"
  end

  def self.tcdb
    "http://www.tcdb.org/search/result.php?tc=$id"
  end

  def self.uniparc
    "http://www.ebi.ac.uk/cgi-bin/dbfetch?db=uniparc&id=$id"
  end

  def self.mint
    "http://mint.bio.uniroma2.it/mint/search/interactor.do?queryType=protein&interactorAc=$id"
  end

  def self.ipi
    "http://www.ebi.ac.uk/cgi-bin/dbfetch?db=IPI&id=$id&format=default"
  end

  def self.dip
    "http://dip.doe-mbi.ucla.edu/dip/DIPview.cgi?ID=$id"
  end

  def self.signaling_gateway
    "http://www.signaling-gateway.org/molecule/query?afcsid=$id"
  end

  def self.resid
    "http://srs.ebi.ac.uk/srsbin/cgi-bin/wgetz?-id+6JSUg1NA6u4+-e+[RESID:'$id']"
  end

  def self.rgd
    "http://rgd.mcw.edu/tools/genes/genes_view.cgi?id=$id"
  end

  def self.tair_protein
    "http://arabidopsis.org/servlets/TairObject?accession=$id"
  end

  def self.tair_gene
    "http://arabidopsis.org/servlets/TairObject?accession=$id"
  end

  def self.tair_locus
    "http://arabidopsis.org/servlets/TairObject?type=locus&name=$id"
  end

  def self.hmdb
    "http://www.hmdb.ca/metabolites/$id"
  end

  def self.lipidmaps
    "http://www.lipidmaps.org/data/get_lm_lipids_dbgif.php?LM_ID=$id"
  end

  def self.peptideatlas
    "https://db.systemsbiology.net/sbeams/cgi/PeptideAtlas/GetProtein?atlas_build_id=242&protein_name=$id&action=QUERY"
  end

  def self.geo
    "http://www.ncbi.nlm.nih.gov/sites/GDSbrowser?acc=$id"
  end

  def self.eco
    "http://www.ebi.ac.uk/ontology-lookup/?termId=$id"
  end

  def self.sgd_pathways
    "http://pathway.yeastgenome.org/YEAST/new-image?type=PATHWAY&object=$id"
  end

  def self.biogrid
    "http://thebiogrid.org/$id"
  end

  def self.merops
    "http://merops.sanger.ac.uk/cgi-bin/pepsum?id=$id"
  end

  def self.panther
    "http://www.pantherdb.org/panther/family.do?clsAccession=$id"
  end

  def self.panther_family
    "http://www.pantherdb.org/panther/family.do?clsAccession=$id"
  end

  def self.sprint
    "http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/sprint/searchprintss.cgi?prints_accn=$id&display_opts=Prints&category=None&queryform=false&regexpr=off"
  end

  def self.ligandexpo
    "http://ligand-depot.rutgers.edu/pyapps/ldHandler.py?formid=cc-index-search&target=$id&operation=ccid"
  end

  def self.aclame
    "http://aclame.ulb.ac.be/perl/Aclame/Genomes/mge_view.cgi?view=info&id=$id"
  end

  def self.isbn
    "http://isbndb.com/search-all.html?kw=$id"
  end

  def self.pride
    "http://www.ebi.ac.uk/pride/experimentLink.do?experimentAccessionNumber=$id"
  end

  def self.matrixdb
    "http://matrixdb.ibcp.fr/cgi-bin/model/report/default?name=$id&class=Association"
  end

  def self.ncbigene
    "http://www.ncbi.nlm.nih.gov/gene/$id"
  end

  def self.kegg_gene
    "http://www.genome.jp/dbget-bin/www_bget?[?species]:$id"
  end

  def self.brenda
    "http://www.brenda-enzymes.org/php/result_flat.php4?ecno=$id"
  end

  def self.pubchem_bioassay
    "http://pubchem.ncbi.nlm.nih.gov/assay/assay.cgi?aid=$id"
  end

  def self.pathwaycommons
    "http://www.pathwaycommons.org/pc/record2.do?id=$id"
  end

  def self.hovergen
    "http://pbil.univ-lyon1.fr/cgi-bin/view-tree.pl?query=$id&db=HOVERGEN"
  end

  def self.mmmp
    "http://www.mmmp.org/MMMP/public/biomap/viewBiomap.mmmp?id=$id"
  end

  def self.wikipathways
    "http://www.wikipathways.org/index.php/Pathway:$id"
  end

  def self.macie
    "http://www.ebi.ac.uk/thornton-srv/databases/cgi-bin/MACiE/getPage.pl?id=$id"
  end

  def self.mirbase
    "http://www.mirbase.org/cgi-bin/mirna_entry.pl?acc=$id"
  end

  def self.zfin
    "http://zfin.org/cgi-bin/webdriver?MIval=aa-markerview.apg&OID=$id"
  end

  def self.hgnc_id
    "http://www.genenames.org/data/hgnc_data.php?hgnc_id=$id"
  end

  def self.so
    "http://www.sequenceontology.org/miso/current_release/term/$id"
  end

  def self.rhea
    "http://www.ebi.ac.uk/rhea//reaction.xhtml?id=$id"
  end

  def self.unipathway
    "http://www.grenoble.prabi.fr/obiwarehouse/unipathway/upa?upid=$id"
  end

  def self.chembl_compound
    "https://www.ebi.ac.uk/chembldb/index.php/compound/inspect/$id"
  end

  def self.chembl_target
    "https://www.ebi.ac.uk/chembldb/index.php/target/inspect/$id"
  end

  def self.sabiork_kinetic
    "http://sabiork.h-its.org/kineticLawEntry.jsp?kinlawid=$id"
  end

  def self.lgicdb
    "http://www.ebi.ac.uk/compneur-srv/LGICdb/HTML/$id.php"
  end

  def self.atc
    "http://www.whocc.no/atc_ddd_index/?code=$id"
  end

  def self.pharmgkb_pathways
    "http://www.pharmgkb.org/pathway/$id"
  end

  def self.pharmgkb_disease
    "http://www.pharmgkb.org/disease/$id"
  end

  def self.pharmgkb_drug
    "http://www.pharmgkb.org/drug/$id"
  end

  def self.ttd_drug
    "http://bidd.nus.edu.sg/group/cjttd/ZFTTDDRUG.asp?ID=$id"
  end

  def self.ttd_target
    "http://bidd.nus.edu.sg/group/cjttd/ZFTTDDetail.asp?ID=$id"
  end

  def self.neurondb
    "http://senselab.med.yale.edu/NeuronDB/NeuronProp.aspx?id=$id"
  end

  def self.neuromorpho
    "http://neuromorpho.org/neuroMorpho/neuron_info.jsp?neuron_name=$id"
  end

  def self.chemidplus
    "http://chem.sis.nlm.nih.gov/chemidplus/direct.jsp?regno=$id"
  end

  def self.biosystems
    "http://www.ncbi.nlm.nih.gov/biosystems/$id"
  end

  def self.ctd
    "http://ctd.mdibl.org/detail.go?type=chem&acc=$id"
  end

  def self.bionumbers
    "http://www.bionumbers.hms.harvard.edu/bionumber.aspx?s=y&id=$id&ver=1"
  end

  def self.drugbank
    "http://www.drugbank.ca/drugs/$id"
  end

  def self.t3db
    "http://www.t3db.org/toxins/$id"
  end

  def self.smpdb
    "http://pathman.smpdb.ca/pathways/$id/pathway"
  end

  def self.phosphosite_protein
    "http://www.phosphosite.org/proteinAction.do?id=$id"
  end

  def self.genedb
    "http://www.genedb.org/gene/$id"
  end

  def self.pato
    "http://www.ebi.ac.uk/ontology-lookup/?termId=$id"
  end

  def self.ccd
    "http://www.ebi.ac.uk/msd-srv/msdchem/cgi-bin/cgi.pl?FUNCTION=record&ENTITY=CHEM_COMP&PRIMARYKEY=$id&APPLICATION=1"
  end

  def self.glycomedb
    "http://www.glycome-db.org/database/showStructure.action?glycomeId=$id"
  end

  def self.lipidbank
    "http://lipidbank.jp/cgi-bin/detail.cgi?id=$id"
  end

  def self.kegg_orthology
    "http://www.genome.jp/dbget-bin/www_bget?ko:$id"
  end

  def self.prodom
    "http://prodom.prabi.fr/prodom/current/cgi-bin/request.pl?question=DBEN&query=$id"
  end

  def self.smart
    "http://smart.embl-heidelberg.de/smart/do_annotation.pl?DOMAIN=$id"
  end

  def self.cdd
    "http://www.ncbi.nlm.nih.gov/Structure/cdd/cddsrv.cgi?uid=$id"
  end

  def self.mmdb
    "http://www.ncbi.nlm.nih.gov/Structure/mmdb/mmdbsrv.cgi?uid=$id"
  end

  def self.imex
    "http://www.ebi.ac.uk/intact/imex/main.xhtml?query=$id"
  end

  def self.irefweb
    "http://wodaklab.org/iRefWeb/interaction/show/$id"
  end

  def self.mpi
    "http://www.jcvi.org/mpidb/interaction.php?pname=$id"
  end

  def self.phosphosite_residue
    "http://www.phosphosite.org/siteAction.do?id=$id"
  end

  def self.neurolex
    "http://www.neurolex.org/wiki/$id"
  end

  def self.nif_subcellular
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.obi
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.sabiork_ec
    "http://sabiork.h-its.org/index2.jsp?EC=$id"
  end

  def self.jws
    "http://jjj.mib.ac.uk/cgi-bin/processModelSelection.py?keytype=modelname&keyword=$id"
  end

  def self.modeldb
    "http://senselab.med.yale.edu/ModelDB/ShowModel.asp?model=$id"
  end

  def self.subtiwiki
    "http://www.subtiwiki.uni-goettingen.de/wiki/index.php/$id"
  end

  def self.pid
    "http://pid.nci.nih.gov/search/pathway_landing.shtml?what=graphic&jpg=on&pathway_id=$id"
  end

  def self.doqcs_model
    "http://doqcs.ncbs.res.in/template.php?&y=accessiondetails&an=$id"
  end

  def self.doqcs_pathway
    "http://doqcs.ncbs.res.in/template.php?&y=pathwaydetails&pn=$id"
  end

  def self.uo
    "http://www.ebi.ac.uk/ontology-lookup/?termId=$id"
  end

  def self.clinicaltrials
    "http://clinicaltrials.gov/ct2/show/$id"
  end

  def self.chemspider
    "http://www.chemspider.com/Chemical-Structure.$id.html"
  end

  def self.ncit
    "http://ncit.nci.nih.gov/ncitbrowser/ConceptReport.jsp?dictionary=NCI%20Thesaurus&code=$id"
  end

  def self.biocatalogue
    "http://www.biocatalogue.org/services/$id"
  end

  def self.pr
    "http://pir.georgetown.edu/cgi-bin/pro/entry_pro?id=$id"
  end

  def self.omia
    "http://omia.angis.org.au/retrieve.shtml?pid=$id"
  end

  def self.chembank
    "http://chembank.broadinstitute.org/chemistry/viewMolecule.htm?cbid=$id"
  end

  def self.csa
    "http://www.ebi.ac.uk/thornton-srv/databases/cgi-bin/CSA/CSA_Site_Wrapper.pl?pdb=$id"
  end

  def self.cgd
    "http://www.candidagenome.org/cgi-bin/locus.pl?dbid=$id"
  end

  def self.antweb
    "http://www.antweb.org/specimen.do?name=$id"
  end

  def self.pmc
    "http://www.ncbi.nlm.nih.gov/pmc/articles/$id/?tool=pmcentrez"
  end

  def self.amoebadb
    "http://amoebadb.org/amoeba/showRecord.do?name=GeneRecordClasses.GeneRecordClass&amp;source_id=$id"
  end

  def self.cryptodb
    "http://cryptodb.org/cryptodb/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id"
  end

  def self.plasmodb
    "http://plasmodb.org/plasmo/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id&project_id=PlasmoDB"
  end

  def self.giardiadb
    "http://giardiadb.org/giardiadb/showRecord.do?name=GeneRecordClasses.GeneRecordClass&primary_key=$id"
  end

  def self.microsporidia
    "http://microsporidiadb.org/micro/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id"
  end

  def self.toxoplasma
    "http://toxodb.org/toxo/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id"
  end

  def self.trichdb
    "http://trichdb.org/trichdb/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id"
  end

  def self.tritrypdb
    "http://tritrypdb.org/tritrypdb/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id"
  end

  def self.bdgp
    "http://flypush.imgen.bcm.tmc.edu/pscreen/details.php?line=$id"
  end

  def self.beetlebase
    "http://www.beetlebase.org/cgi-bin/gbrowse/BeetleBase3.gff3/?name=$id"
  end

  def self.bold
    "http://www.barcodinglife.com/views/taxbrowser.php?taxid=$id"
  end

  def self.dbest
    "http://www.ncbi.nlm.nih.gov/nucest/$id"
  end

  def self.dbprobe
    "http://www.ncbi.nlm.nih.gov/genome/probe/reports/probereport.cgi?uid=$id"
  end

  def self.dbsnp
    "http://www.ncbi.nlm.nih.gov/projects/SNP/snp_ref.cgi?rs=$id"
  end

  def self.ecogene
    "http://ecogene.org/geneInfo.php?eg_id=$id"
  end

  def self.gabi
    "http://gabi.rzpd.de/database/cgi-bin/GreenCards.pl.cgi?BioObjectId=$id&Mode=ShowBioObject"
  end

  def self.greengenes
    "http://greengenes.lbl.gov/cgi-bin/show_one_record_v2.pl?prokMSA_id=$id"
  end

  def self.grin_taxonomy
    "http://www.ars-grin.gov/cgi-bin/npgs/html/taxon.pl?$id"
  end

  def self.hinv_locus
    "http://h-invitational.jp/hinv/spsoup/locus_view?hix_id=$id"
  end

  def self.hinv_transcript
    "http://h-invitational.jp/hinv/spsoup/transcript_view?hit_id=$id"
  end

  def self.hinv_protein
    "http://h-invitational.jp/hinv/protein/protein_view.cgi?hip_id=$id"
  end

  def self.homd_seq
    "http://www.homd.org/modules.php?op=modload&name=GenomeList&file=index&link=detailinfo&seqid=$id"
  end

  def self.homd_taxon
    "http://www.homd.org/modules.php?op=modload&name=HOMD&file=index&oraltaxonid=$id&view=dynamic"
  end

  def self.ird_segment
    "http://www.fludb.org/brc/fluSegmentDetails.do?ncbiGenomicAccession=$id"
  end

  def self.isfinder
    "http://www-is.biotoul.fr/index.html?is_special_name=$id"
  end

  def self.jcm
    "http://www.jcm.riken.go.jp/cgi-bin/jcm/jcm_number?JCM=$id"
  end

  def self.img_taxon
    "http://img.jgi.doe.gov/cgi-bin/m/main.cgi?section=TaxonDetail&taxon_oid=$id"
  end

  def self.img_gene
    "http://img.jgi.doe.gov/cgi-bin/w/main.cgi?section=GeneDetail&gene_oid=$id"
  end

  def self.maizegdb
    "http://www.maizegdb.org/cgi-bin/displaylocusrecord.cgi?id=$id"
  end

  def self.mycobank
    "http://www.mycobank.org/MycoTaxo.aspx?Link=T&Rec=$id"
  end

  def self.nbrc
    "http://www.nbrc.nite.go.jp/NBRC2/NBRCCatalogueDetailServlet?ID=NBRC&CAT=$id"
  end

  def self.pseudomonas
    "http://www.pseudomonas.com/getAnnotation.do?locusID=$id"
  end

  def self.gramene_protein
    "http://www.gramene.org/db/ontology/search?id=$id"
  end

  def self.gramene_gene
    "http://www.gramene.org/db/genes/search_gene?acc=$id"
  end

  def self.gramene_taxonomy
    "http://www.gramene.org/db/ontology/search?id=$id"
  end

  def self.gramene_qtl
    "http://www.gramene.org/db/qtl/qtl_display?qtl_accession_id=$id"
  end

  def self.sgn
    "http://solgenomics.net/phenome/locus_display.pl?locus_id=$id"
  end

  def self.xenbase
    "http://www.xenbase.org/gene/showgene.do?method=display&geneId=$id"
  end

  def self.bioportal
    "http://bioportal.bioontology.org/ontologies/$id"
  end

  def self.miriam_resource
    "http://www.ebi.ac.uk/miriam/main/resources/$id"
  end

  def self.edam
    "http://www.ebi.ac.uk/ontology-lookup/?termId=$id"
  end

  def self.pmdb
    "http://mi.caspur.it/PMDB/user/search.php?idsearch=$id"
  end

  def self.a_2dbaseecoli
    "http://2dbase.techfak.uni-bielefeld.de/cgi-bin/2d/2d.cgi?ac=$id"
  end

  def self.agd
    "http://agd.vital-it.ch/Ashbya_gossypii/geneview?gene=$id"
  end

  def self.arachnoserver
    "http://www.arachnoserver.org/toxincard.html?id=$id"
  end

  def self.biocyc
    "http://biocyc.org/ECOLI/NEW-IMAGE?object=$id"
  end

  def self.cazy
    "http://www.cazy.org/$id.html"
  end

  def self.goa
    "http://www.ebi.ac.uk/QuickGO/GTerm?id=$id"
  end

  def self.paleodb
    "http://paleodb.geology.wisc.edu/cgi-bin/bridge.pl?a=basicTaxonInfo&taxon_no=$id"
  end

  def self.compulyeast
    "http://compluyeast2dpage.dacya.ucm.es/cgi-bin/2d/2d.cgi?ac=$id"
  end

  def self.disprot
    "http://www.disprot.org/protein.php?id=$id"
  end

  def self.echobase
    "http://www.york.ac.uk/res/thomas/Gene.cfm?recordID=$id"
  end

  def self.eggnog
    "http://eggnog.embl.de/version_3.0/cgi/search.py?search_term_0=$id"
  end

  def self.ensembl_bacteria
    "http://bacteria.ensembl.org/[?species_name]/Gene/Summary?g=$id"
  end

  def self.ensembl_protist
    "http://protists.ensembl.org/[?species_name]/Gene/Summary?g=$id"
  end

  def self.ensembl_metazoa
    "http://metazoa.ensembl.org/[?species_name]/Gene/Summary?g=$id"
  end

  def self.ensembl_plant
    "http://plants.ensembl.org/[?species_name]/Gene/Summary?g=$id"
  end

  def self.ensembl_fungi
    "http://fungi.ensembl.org/[?species_name]/Gene/Summary?g=$id"
  end

  def self.euhcvdb
    "http://euhcvdb.ibcp.fr/euHCVdb/do/displayHCVEntry?primaryAC=$id"
  end

  def self.genatlas
    "http://genatlas.medecine.univ-paris5.fr/fiche.php?symbol=$id"
  end

  def self.cath
    "http://www.cathdb.info/cathnode/$id"
  end

  def self.genefarm
    "http://urgi.versailles.inra.fr/Genefarm/Gene/display_gene.htpl?GENE_ID=$id"
  end

  def self.gpcrdb
    "http://www.gpcr.org/7tm/proteins/$id"
  end

  def self.hogenom
    "http://pbil.univ-lyon1.fr/cgi-bin/view-tree.pl?db=HOGENOM5&query=$id"
  end

  def self.genetree
    "http://www.ensembl.org/Multi/GeneTree/Image?db=core;gt=$id"
  end

  def self.myco_tuber
    "http://tuberculist.epfl.ch/quicksearch.php?gene+name=$id"
  end

  def self.myco_lepra
    "http://mycobrowser.epfl.ch/leprosysearch.php?gene+name=$id"
  end

  def self.myco_marinum
    "http://mycobrowser.epfl.ch/marinosearch.php?gene+name=$id"
  end

  def self.myco_smeg
    "http://mycobrowser.epfl.ch/smegmasearch.php?gene+name=$id"
  end

  def self.orphanet
    "http://www.orpha.net/consor/cgi-bin/OC_Exp.php?lng=EN&Expert=$id"
  end

  def self.orthodb
    "http://cegg.unige.ch/orthodb3/results?searchtext=$id"
  end

  def self.peroxibase
    "http://peroxibase.toulouse.inra.fr/listing.php?action=view&id=$id"
  end

  def self.pmap_substratedb
    "http://substrate.burnham.org/protein/annotation/$id/html"
  end

  def self.pmap_cutdb
    "http://www.proteolysis.org/proteases/m_summarypg/$id"
  end

  def self.protclustdb
    "http://www.ncbi.nlm.nih.gov/sites/entrez?Db=proteinclusters&Cmd=ShowDetailView&TermToSearch=$id"
  end

  def self.pmp
    "http://www.proteinmodelportal.org/query/uniprot/$id"
  end

  def self.protonet_proteincard
    "http://www.protonet.cs.huji.ac.il/requested/protein_card.php?protein_id=$id"
  end

  def self.protonet_cluster
    "http://www.protonet.cs.huji.ac.il/requested/cluster_card.php?cluster=$id"
  end

  def self.rebase
    "http://rebase.neb.com/rebase/enz/$id.html"
  end

  def self.swissmodel
    "http://swissmodel.expasy.org/repository/smr.php?sptr_ac=$id"
  end

  def self.vectorbase
    "http://www.vectorbase.org/[?species_name]/Gene/Summary?db=core;g=$id"
  end

  def self.do
    "http://disease-ontology.org/term/$id"
  end

  def self.mirbase_mature
    "http://www.mirbase.org/cgi-bin/mature.pl?mature_acc=$id"
  end

  def self.nextprot
    "http://www.nextprot.org/db/entry/$id"
  end

  def self.cas
    "http://commonchemistry.org/ChemicalDetail.aspx?ref=$id"
  end

  def self.kegg_genome
    "http://www.genome.jp/dbget-bin/www_bget?gn:$id"
  end

  def self.kegg_metagenome
    "http://www.genome.jp/kegg-bin/show_organism?org=$id"
  end

  def self.narcis
    "http://www.narcis.nl/publication/RecordID/$id"
  end

  def self.jcsd
    "http://nikkajiweb.jst.go.jp/nikkaji_web/pages/top_e.jsp?CONTENT=syosai&SN=$id"
  end

  def self.pw
    "http://rgd.mcw.edu/rgdweb/ontology/annot.html?acc_id=$id"
  end

  def self.scretf
    "http://stormo.wustl.edu/ScerTF/details/$id/"
  end

  def self.pharmgkb_gene
    "http://www.pharmgkb.org/gene/$id"
  end

  def self.mirnest
    "http://lemur.amu.edu.pl/share/php/mirnest/search.php?search_term=$id"
  end

  def self.napp
    "http://napp.u-psud.fr/Niveau2.php?specie=$id"
  end

  def self.noncode
    "http://www.noncode.org/NONCODERv3/ncrna.php?ncid=$id"
  end

  def self.virsirna
    "http://crdd.osdd.net/servers/virsirnadb/record.php?details=$id"
  end

  def self.elm
    "http://elm.eu.org/elms/elmPages/$id.html"
  end

  def self.mimodb
    "http://immunet.cn/mimodb/browse.php?table=mimoset&ID=$id"
  end

  def self.sitex
    "http://www-bionet.sscc.ru/sitex/index.php?siteid=$id"
  end

  def self.bykdb
    "http://bykdb.ibcp.fr/data/html/$id.html"
  end

  def self.conoserver
    "http://www.conoserver.org/?page=card&table=protein&id=$id"
  end

  def self.topfind
    "http://clipserve.clip.ubc.ca/topfind/proteins/$id"
  end

  def self.mipmod
    "http://bioinfo.iitk.ac.in/MIPModDB/result.php?code=$id"
  end

  def self.cellimage
    "http://cellimagelibrary.org/images/$id"
  end

  def self.combine_specifications
    "http://co.mbine.org/specifications/$id"
  end

  def self.cygd
    "http://mips.helmholtz-muenchen.de/genre/proj/yeast/singleGeneReport.html?entry=$id"
  end

  def self.huge
    "http://www.kazusa.or.jp/huge/cgi/view_direct.cgi?id=$id"
  end

  def self.bindingdb
    "http://www.bindingdb.org/bind/chemsearch/marvin/MolStructure.jsp?monomerid=$id"
  end

  def self.abs
    "http://genome.crg.es/datasets/abs2005/entries/$id.html"
  end

  def self.apd
    "http://aps.unmc.edu/AP/database/query_output.php?ID=$id"
  end

  def self.chemdb
    "http://cdb.ics.uci.edu/cgibin/ChemicalDetailWeb.py?chemical_id=$id"
  end

  def self.dpvweb
    "http://www.dpvweb.net/dpv/showdpv.php?dpvno=$id"
  end

  def self.iuphar_receptor
    "http://www.iuphar-db.org/GPCR/ReceptorDisplayForward?receptorID=$id"
  end

  def self.aceview_worm
    "http://www.ncbi.nlm.nih.gov/IEB/Research/Acembly/av.cgi?db=[?species_database]&c=Gene&l=$id"
  end

  def self.asap
    "https://asap.ahabs.wisc.edu/asap/feature_info.php?FeatureID=$id"
  end

  def self.dictybase_gene
    "http://dictybase.org/db/cgi-bin/gene_page.pl?gene_name=$id"
  end

  def self.worfdb
    "http://worfdb.dfci.harvard.edu/searchallwormorfs.pl?sid=$id"
  end

  def self.nextdb
    "http://nematode.lab.nig.ac.jp/cgi-bin/dbest/SrchByCosmid.sh?csmd=$id"
  end

  def self.pgn
    "http://pgn.cornell.edu/search/unigene_search_result.pl?unigene_id=$id"
  end

  def self.hamap
    "http://us.expasy.org/unirule/$id"
  end

  def self.rouge
    "http://www.kazusa.or.jp/rouge/gfpage/$id/"
  end

  def self.cgsc
    "http://cgsc.biology.yale.edu/Site.php?ID=$id"
  end

  def self.cog
    "http://www.ncbi.nlm.nih.gov/COG/grace/cogenome.cgi?g=$id"
  end

  def self.dragondb_dna
    "http://antirrhinum.net/cgi-bin/ace/generic/seq/DragonDB?name=$id;class=Sequence"
  end

  def self.dragondb_protein
    "http://antirrhinum.net/cgi-bin/ace/generic/tree/DragonDB?name=$id;class=Peptide"
  end

  def self.dragondb_locus
    "http://antirrhinum.net/cgi-bin/ace/generic/tree/DragonDB?name=$id;class=Locus"
  end

  def self.dragondb_allele
    "http://antirrhinum.net/cgi-bin/ace/generic/tree/DragonDB?name=$id;class=Allele"
  end

  def self.nasc
    "http://arabidopsis.info/StockInfo?NASC_id=$id"
  end

  def self.niaest
    "http://lgsun.grc.nia.nih.gov/cgi-bin/pro3?sname1=$id"
  end

  def self.pazar
    "http://www.pazar.info/cgi-bin/tf_search.cgi?searchtab=tfs&ID_list=PAZAR_TF&geneID=$id"
  end

  def self.po
    "http://www.plantontology.org/amigo/go.cgi?view=details&search_constraint=terms&depth=0&query=$id"
  end

  def self.rnamods
    "http://s59.cas.albany.edu/RNAmods/cgi-bin/rnashow.cgi?$id"
  end

  def self.treebase
    "http://www.treebase.org/treebase-web/search/study/summary.html?id=$id"
  end

  def self.cmr
    "http://cmr.jcvi.org/tigr-scripts/CMR/shared/GenePage.cgi?locus=$id"
  end

  def self.tigrfams
    "http://cmr.jcvi.org/cgi-bin/CMR/HmmReport.cgi?hmm_acc=$id"
  end

  def self.iuphar_family
    "http://www.iuphar-db.org/DATABASE/FamilyIntroductionForward?familyId=$id"
  end

  def self.mgiid
    "http://www.fp.ucalgary.ca/group2introns/$id.htm"
  end

  def self.vbase2
    "http://www.vbase2.org/vgene.php?id=$id"
  end

  def self.genecards
    "http://www.genecards.org/cgi-bin/carddisp.pl?gene=$id"
  end

  def self.allergome
    "http://www.allergome.org/script/refArray_view.php?idMol=$id"
  end

  def self.hpa
    "http://www.proteinatlas.org/gene_info.php?ensembl_gene_id=$id"
  end

  def self.tarbase
    "http://diana.cslab.ece.ntua.gr/DianaToolsNew/index.php?r=tarbase/index&mirnas=$id"
  end

  def self.ncbi_protein
    "http://www.ncbi.nlm.nih.gov/protein/$id"
  end

  def self.unigene
    "http://www.ncbi.nlm.nih.gov/UniGene/clust.cgi?UGID=$id"
  end

  def self.unite
    "http://unite.ut.ee/bl_forw.php?nimi=$id"
  end

  def self.nucleardb
    "http://www.receptors.org/NR/seq/DR/$id.html"
  end

  def self.superfamily
    "http://supfam.org/SUPERFAMILY/cgi-bin/scop.cgi?sunid=$id"
  end

  def self.rgap
    "http://rice.plantbiology.msu.edu/cgi-bin/gbrowse/rice/?name=$id"
  end

  def self.panther_pathway
    "http://www.pantherdb.org/pathway/pathCatDetail.do?clsAccession=$id"
  end

  def self.oridb
    "http://www.oridb.org/details1.php?id=$id"
  end

  def self.ena
    "http://www.ebi.ac.uk/ena/data/view/$id"
  end

  def self.ccds
    "http://www.ncbi.nlm.nih.gov/projects/CCDS/CcdsBrowse.cgi?REQUEST=CCDS&DATA=$id"
  end

  def self.gxa
    "http://www.ebi.ac.uk/gxa/gene/$id"
  end

  def self.wikipedia
    "http://en.wikipedia.org/wiki/$id"
  end

  def self.intenz
    "http://www.ebi.ac.uk/intenz/query?cmd=SearchID&id=$id"
  end

  def self.uniprot_taxonomy
    "http://www.uniprot.org/taxonomy/$id"
  end

  def self.citexplore
    "http://www.ebi.ac.uk/citexplore/citationDetails.do?dataSource=MED&externalId=$id"
  end

  def self.pdbe
    "http://www.pdbe.org/$id"
  end

  def self.embl
    "http://srs.ebi.ac.uk/srsbin/cgi-bin/wgetz?-page+EntryPage+-e+[EMBL:$id]+-view+EmblEntry"
  end

  def self.genbank
    "http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=$id"
  end

  def self.hubmed
    "http://www.hubmed.org/display.cgi?uids=$id"
  end

  def self.ddbj
    "http://xml.ddbj.nig.ac.jp/rest/Invoke?service=GetEntry&method=getDDBJEntry&accession=$id"
  end

  def self.pdbj
    "http://service.pdbj.org/mine/Detail?PDBID=$id&PAGEID=Summary"
  end

  def self.pdbsum
    "http://www.ebi.ac.uk/pdbsum/$id"
  end

  def self.a_3did
    "http://3did.irbbarcelona.org/cgi-bin/query_domain_cgi.pl?domain=$id"
  end

  def self.a_4dxpress
    "http://4dx.embl.de/4DXpress/reg/all/cview/gene.do?geneID=$id"
  end

  def self.aaindex
    "http://www.genome.jp/dbget-bin/www_bget?aaindex:$id"
  end

  def self.adda
    "http://ekhidna.biocenter.helsinki.fi/sqgraph/pairsdb/report_sequence?nid=$id"
  end

  def self.adw
    "http://animaldiversity.ummz.umich.edu/site/accounts/information/$id.html"
  end

  def self.agbase
    "http://www.agbase.msstate.edu/cgi-bin/getEntry.pl?db_pick=all&database=UniProtKB&gb_acc=$id"
  end

  def self.agsd
    "http://www.genomesize.com/result_species.php?id=$id"
  end

  def self.alfred
    "http://alfred.med.yale.edu/alfred/recordinfo.asp?condition=loci.locus_uid='$id"
  end

  def self.alterorf
    "http://www.alterorf.cl/SearchResults/SearchResult.aspx?variable1=$id"
  end

  def self.alzgene
    "http://www.alzgene.org/geneoverview.asp?geneid=$id"
  end

  def self.anobase
    "http://www.anobase.org/genetool/v42/gene.php?id=$id"
  end

  def self.antijen
    "http://www.darrenflower.info/scripts/aj_scripts/aj_mhccalc2.pl?epitope=$id&AL=%25&ST=%25&CAT=MHC&detailinfo=no&detailmin=&detailmax="
  end

  def self.aogacioah
    "http://atlasgeneticsoncology.org/Genes/$id.html"
  end

  def self.aphidbase
    "http://helico.genouest.org:8080/grs-1.8/grs?reportID=chado_[transcript/genome/protein]_report&objectID=$id"
  end

  def self.aracxyls
    "http://www.eez.csic.es/arac-xyls/wfichas/$idrec.htm"
  end

  def self.archdb
    "http://sbi.imim.es/cgi-bin/archdb//loops.pl?loop=$id"
  end

  def self.ardb
    "http://ardb.cbcb.umd.edu/cgi/ssquery.cgi?db=T&ab=0&and1=A&ge=0&and2=A&sp=0&and3=A&gn=$id"
  end

  def self.arkdb
    "http://www.thearkdb.org/arkdb/do/getMappableDetails?accession=$id"
  end

  def self.artadedb
    "http://omicspace.riken.jp/gps/index.html?url=/gps/LineMode/ArtadeSearch_Flower&hCheck=v200307&hHead=[?genomic_region]&highlight=$id"
  end

  def self.asalps
    "http://as-alps.nagahama-i-bio.ac.jp/search.php?sp=hs&switch=cluster&id_type=transcript&id=$id"
  end

  def self.asrp
    "http://asrp.cgrb.oregonstate.edu/db/sRNAdisplay.html?ASRP_id=$id"
  end

  def self.astd
    "http://www.ebi.ac.uk/astd/geneview.html?acc=$id"
  end

  def self.atpid
    "http://atpid.biosino.org/simple_detail.php?pro=$id"
  end

  def self.attedii
    "http://atted.jp/data/cis/$id.html"
  end

  def self.autdb
    "http://autism.mindspec.org/autdb/TableDetails.do?tableName=AUT_CANDIDATE_GENES&keyVal=$id"
  end

  def self.bacmap
    "http://wishart.biology.ualberta.ca/BacMap/cgview_linked_maps/$id/index.html"
  end

  def self.bacteriome
    "http://www.compsysbio.org/bacteriome/tsdetail.php?cutoff=50&genestr=$id&genenum=0"
  end

  def self.bactibase
    "http://bactibase.pfba-lab-tun.org/$id"
  end

  def self.balibase
    "http://bips.u-strasbg.fr/fr/Products/Databases/BAliBASE2/ref[$ref]/test/$id_ref[$ref].html"
  end

  def self.bbid
    "http://bbid.grc.nia.nih.gov/geneimages/$id.jpeg"
  end

  def self.benchmark
    "http://net.icgeb.org/benchmark/index.php?experiment=$id"
  end

  def self.bged
    "http://genome.mc.pref.osaka.jp/cgi-bin/BGED/Gene_info.pl?num=$id"
  end

  def self.bgee
    "http://bgee.unil.ch/bgee/bgee?page=gene&action=expression&gene_id=$id"
  end

  def self.bgee_genes
    "http://bgee.unil.ch/bgee/bgee?page=gene&action=expression&gene_id=$id"
  end

  def self.bgee_organ
    "http://bgee.unil.ch/bgee/bgee?page=anatomy&action=organ_details&organ_id=$id"
  end

  def self.bid
    "http://tsailab.org/wikiBID/index.php/$id"
  end

  def self.binding_moad
    "http://www.bindingmoad.org/moad/getMoadlet.do?id=$id"
  end

  def self.biomagresbank
    "http://www.bmrb.wisc.edu/data_library/generate_summary.php?bmrbId=$id"
  end

  def self.bionemo
    "http://bionemo.bioinfo.cnio.es/Run.cgi?rm=mode4&result=$id"
  end

  def self.biopax_l2
    "http://www.biopax.org/release/biopax-level2.owl#$id"
  end

  def self.biopax_l3
    "http://www.biopax.org/release/biopax-level3.owl#$id"
  end

  def self.biopixie
    "http://avis.princeton.edu/pixie/viewgraph.php?graphID=$id"
  end

  def self.biozon
    "http://biozon.org/Biozon/Profile/$id"
  end

  def self.bmph
    "http://www.expasy.org/cgi-bin/show_image?$id"
  end

  def self.bodymap
    "http://bodymap.ims.u-tokyo.ac.jp/[?human/mouse]/gs_card.php?gs=$id"
  end

  def self.bps
    "http://bps.rutgers.edu/atlas/bp_record/$id"
  end

  def self.bsd
    "http://bsd.cme.msu.edu/jsp/InfoController.jsp?object=Strain&id=S_$id"
  end

  def self.bsorf
    "http://bacillus.genome.jp/cgi-bin/BSORF_data_view.pl?ACCESSION=$id"
  end

  def self.buchnerabase
    "http://www.york.ac.uk/res/thomas/Buchnerabase/resources/gene_page_aps.cfm?BBnum=$id"
  end

  def self.cage_ctss
    "http://fantom31p.gsc.riken.jp/cage/mm5/SummaryCtss.php?ctss_id=$id"
  end

  def self.cage_library
    "http://fantom31p.gsc.riken.jp/cage/mm5/SummaryLibrary.php?libid=$id"
  end

  def self.cage_tc
    "http://fantom31p.gsc.riken.jp/cage/mm5/SummaryTss.php?tss_id=$id"
  end

  def self.cage_tu
    "http://fantom31p.gsc.riken.jp/cage/mm5/SummaryTu.php?tu_id=$id"
  end

  def self.cancergenes
    "http://cbio.mskcc.org/Public/products/human_mapped/Mapback_html/$id.html"
  end

  def self.cangem
    "http://www.cangem.org/index.php?gene=$id"
  end

  def self.carpedb_gene
    "http://www.carpedb.ua.edu/summary.cfm?id=$id"
  end

  def self.carpedb_reference
    "http://www.carpedb.ua.edu/public.cfm?id=$id"
  end

  def self.catdb
    "http://urgv.evry.inra.fr/cgi-bin/projects/CATdb/consult_project.pl?project_id=$id"
  end

  def self.cattleqtldb
    "http://www.animalgenome.org/cgi-bin/QTLdb/BT/qdetails?QTL_ID=$id"
  end

  def self.ccm
    "http://cancer.cellmap.org/cellmap/record.do?id=$id"
  end

  def self.cged
    "http://lifesciencedb.jp/cgi-bin/cged/detail.cgi?ci=3&cg=$id"
  end

  def self.cgnc
    "http://www.agnc.msstate.edu/GeneReport.aspx?a=$id"
  end

  def self.chembl
    "https://www.ebi.ac.uk/chembldb/index.php/compound/inspect/$id"
  end

  def self.chickenqtldb
    "http://www.animalgenome.org/cgi-bin/QTLdb/GG/qdetails?QTL_ID=$id"
  end

  def self.chickvd
    "http://chicken.genomics.org.cn/chicken/jsp/gene_report.jsp?gene_id=$id"
  end

  def self.chromdb
    "http://www.chromdb.org/gene_record.html?g=$id"
  end

  def self.cid
    "http://oxytricha.princeton.edu/cgi-bin/get_MDS_IES_Info.cgi?num=$id"
  end

  def self.cisred
    "http://www.cisred.org/[?species]/gene_view?ensembl_id=$id"
  end

  def self.cleanest
    "http://verdi.kobic.re.kr/cleanEST/library_view.jsp?libid=$id"
  end

  def self.cleanex
    "http://www.cleanex.isb-sib.ch/cgi-bin/get_doc?db=cleanex&format=nice&entry=$id"
  end

  def self.clibe
    "http://bidd.nus.edu.sg/group/CLiBE/Detail.asp?ID=$id"
  end

  def self.cmd
    "https://eds.gene.le.ac.uk/home.php?select_db=$id"
  end

  def self.cmgsdb_chain
    "https://bioinformatics.cs.vt.edu/cmgs/CMGSDB/viewChain.php?chainid=$id"
  end

  def self.cmgsdb_exp
    "https://bioinformatics.cs.vt.edu/cmgs/CMGSDB/rnaiexpt.php?expt=$id"
  end

  def self.cmgsdb_gene
    "https://bioinformatics.cs.vt.edu/cmgs/CMGSDB/viewGene.php?wbgene=$id"
  end

  def self.cmgsdb_protein
    "https://bioinformatics.cs.vt.edu/cmgs/CMGSDB/viewProtein.php?wpid=$id"
  end

  def self.cnidbase
    "http://cnidbase.com/index.cgi?cn_accession=$id"
  end

  def self.cno
    "http://purl.org/incf/ontology/Computational_Neurosciences/cno_alpha.owl#$id"
  end

  def self.cogat
    "http://www.cognitiveatlas.org/ontology/cogat.owl#$id"
  end

  def self.cogeme
    "http://cogeme.ex.ac.uk/cgi-bin/uni.pl?uni=$id"
  end

  def self.come
    "http://www.flymine.org/come/entry?gn=$id"
  end

  def self.comparative_genometrics
    "http://www2.unil.ch/comparativegenometrics/$id.htm"
  end

  def self.compluyeast2dpage
    "http://compluyeast2dpage.dacya.ucm.es/cgi-bin/2d/2d.cgi?ac=$id"
  end

  def self.consurfdb
    "http://consurfdb.tau.ac.il/consurf_db/$id/[?chain_id]/"
  end

  def self.cope
    "http://www.copewithcytokines.de/cope.cgi?key=$id"
  end

  def self.corg
    "http://corg.eb.tuebingen.mpg.de/cgi-bin/get_gene_info_v38.pl?id=$id&species=[?species_name]&version=v38"
  end

  def self.corum
    "http://mips.helmholtz-muenchen.de/genre/proj/corum/complexdetails.html?id=$id"
  end

  def self.cosmic
    "http://www.sanger.ac.uk/perl/genetics/CGP/cosmic?action=byhist&s=4&hn=carcinoma&sn=ovary&ln=$id"
  end

  def self.coxpresdb
    "http://coxpresdb.jp/tis_map/$id/"
  end

  def self.cpndb
    "http://cpndb.cbr.nrc.ca/getRecord.php?id=$id"
  end

  def self.cpo
    "http://phenomebrowser.net/cellphenotype.owl#$id"
  end

  def self.cpr
    "http://purl.org/cpr/$id"
  end

  def self.csrd
    "http://sundarlab.ucdavis.edu/cgi-bin/smrna_browse/?name=$id"
  end

  def self.cst
    "http://www.cellsignal.com/products/$id.html"
  end

  def self.ctad
    "http://www.cta.lncc.br/modelo.php?idgene=$id&idmeta=11"
  end

  def self.ctcae
    "http://ncicb.nci.nih.gov/xml/owl/EVS/ctcae.owl#$id"
  end

  def self.ctga
    "http://www.cags.org.ae/FMPro?-db=ctga.fp5&-format=/ctga/ctga_detail.html&-lay=main&Record_Category=Gene%20locus&-max=30&-recid=$id&-find="
  end

  def self.cutdb
    "http://cutdb.burnham.org/relation/show/$id"
  end

  def self.cutg
    "http://www.kazusa.or.jp/codon/cgi-bin/showcodon.cgi?species=$id"
  end

  def self.cyanobase
    "http://genome.kazusa.or.jp/cyanobase/Synechocystis/genes/$id"
  end

  def self.cybase
    "http://research1t.imb.uq.edu.au/cybase/index.php?page=card&table=protein&id=$id"
  end

  def self.cyclebase
    "http://www.cyclebase.org/displaygene.action?geneName=$id&taxId=[$taxid]"
  end

  def self.dali
    "http://ekhidna.biocenter.helsinki.fi/dali_server/results/$id/index.html"
  end

  def self.dart
    "http://xin.cz3.nus.edu.sg/group/DRT/Detail.asp?ID=$id"
  end

  def self.datf
    "http://datf.cbi.pku.edu.cn/entry-display.php?id=$id"
  end

  def self.dbd
    "http://dbd.mrc-lmb.cam.ac.uk/DBD/index.cgi?Search/Domain+domain:$id"
  end

  def self.dbpabp
    "http://ppa.bcf.ku.edu/DB_PABP/protein_details.jsp?prot_id=$id"
  end

  def self.dbpedia
    "http://dbpedia.org/page/$id"
  end

  def self.dbptm
    "http://dbptm.mbc.nctu.edu.tw/search_result.php?search_type=seq&swiss_id=$id"
  end

  def self.dbres
    "http://bioinfo.au.tsinghua.edu.cn/dbRES/show_record.php?resid=$id"
  end

  def self.dbtgr
    "http://dbtgr.hgc.jp/v2/id/$id"
  end

  def self.dc
    "http://purl.org/dc/terms/$id"
  end

  def self.dccp
    "http://sdbi.sdut.edu.cn/DCCP/en/Detail1D.php?id=$id"
  end

  def self.ddoc
    "http://apps.sanbi.ac.za/ddoc/details_general.php?geneID=$id"
  end

  def self.defensins_knowledgebase
    "http://defensins.bii.a-star.edu.sg/pops/pop_proteinDetails.php?id=$id"
  end

  def self.dhaplodb
    "http://orca.gen.kyushu-u.ac.jp/cgi-bin/gbrowse/humanBuild35/?name=$id"
  end

  def self.dictybase_ref
    "http://dictybase.org/db/cgi-bin/dictyBase/reference/reference.pl?refNo=$id"
  end

  def self.dima
    "http://mips.helmholtz-muenchen.de/genre/proj/dima2/query/query.jsp?domain=$id"
  end

  def self.domine
    "http://domine.utdallas.edu/cgi-bin/Domine?page=pfam&pfamid=$id"
  end

  def self.domins
    "http://www.domins.org/cgi/pdbcode.pl?id=$id"
  end

  def self.door
    "http://csbl1.bmb.uga.edu/OperonDB/genedetail.php?id=$id"
  end

  def self.dosaccobs2dpage
    "http://www.dosac.unipa.it/cgi-bin/2d/2d.cgi?ac=$id"
  end

  def self.dpd
    "http://dpdb.uab.es/cgi-bin/DPDB_s2.pl?Accession=$id"
  end

  def self.dpinteract
    "http://arep.med.harvard.edu/ecoli_matrices/sco/$id.sco"
  end

  def self.dpr
    "http://dnasu.asu.edu/DNASU/GetCloneDetail.do?cloneid=$id"
  end

  def self.drospege
    "http://arthropods.eugenes.org/genepage/[?species_name]/$id]"
  end

  def self.drtf
    "http://drtf.cbi.pku.edu.cn/gene_info.php?gn=$id"
  end

  def self.ecocyc_compound
    "http://biocyc.org/ECOLI/NEW-IMAGE?type=COMPOUND&object=$id"
  end

  def self.ecocyc_enzyme
    "http://biocyc.org/ECOLI/NEW-IMAGE?type=ENZYME&object=$id"
  end

  def self.ecocyc_gene
    "http://biocyc.org/ECOLI/NEW-IMAGE?type=GENE&object=$id"
  end

  def self.ecocyc_pathway
    "http://biocyc.org/ECOLI/NEW-IMAGE?type=PATHWAY&object=$id"
  end

  def self.ecocyc_reaction
    "http://biocyc.org/ECOLI/NEW-IMAGE?type=REACTION&object=$id"
  end

  def self.ecocyc_ref
    "http://biocyc.org/ECOLI/reference.html?type=CITATION-FRAME&object=$id"
  end

  def self.ecoliwiki
    "http://ecoliwiki.net/colipedia/index.php/$id"
  end

  def self.edas_human
    "http://edas2.bioinf.fbb.msu.ru/human/summary.cgi?gene_id=$id"
  end

  def self.edas_mouse
    "http://edas2.bioinf.fbb.msu.ru/mouse/data.cgi?chromosome=$id"
  end

  def self.efsite
    "http://ef-site.protein.osaka-u.ac.jp/eF-site/servlet/Summary?entry_id=$id"
  end

  def self.ego
    "http://compbio.dfci.harvard.edu/tgi/cgi-bin/tgi/ego/ego_report.pl?ego=$id"
  end

  def self.emglib
    "http://pbil.univ-lyon1.fr/cgi-bin/acnuc-search-id?query=$id&db=GenBank"
  end

  def self.emim
    "http://discover.nci.nih.gov/mim/view.jsp?selection=map&MIM=$id"
  end

  def self.endonet
    "http://endonet.bioinf.med.uni-goettingen.de/hormonedetail?id=$id"
  end

  def self.enzyme
    "http://ca.expasy.org/enzyme/$id"
  end

  def self.epcondb
    "http://www.cbil.upenn.edu/epcondb42/showRecord.do?name=TranscriptRecordClasses.TranscriptRecordClass&project_id=GenomicsBC&primary_key=$id"
  end

  def self.epd
    "http://www.epd.isb-sib.ch/cgi-bin/get_doc?db=epd&format=nice&entry=$id"
  end

  def self.epgd
    "http://epgd.biosino.org/EPGD/gene/geneinfor.jsp?geneID=$id"
  end

  def self.erd
    "http://bioinformatics.psb.ugent.be/webtools/rRNA/[lsu/[ssu]/data/$id"
  end

  def self.ergo
    "http://www.ergo-light.com/ERGO/CGI/prot.cgi?prot=$id"
  end

  def self.ergr
    "http://bioinfo.vipbg.vcu.edu/ERGR/geneinfo.php?id=$id"
  end

  def self.eropmoscow
    "http://erop.inbi.ras.ru/result2.php?PepName=$id"
  end

  def self.esldb
    "http://gpcr.biocomp.unibo.it/cgi-bin/predictors/esldb/dettagli.cgi?codice=$id"
  end

  def self.esther
    "http://bioweb.ensam.inra.fr/ESTHER/family?name=$id&class=Family"
  end

  def self.eugenes
    "http://eugenes.org:7072/.bin/fbidq.html?$id"
  end

  def self.evoc
    "http://www.evocontology.org/site/Main/BrowseEvoc?x_termid=$id"
  end

  def self.evola
    "http://www.h-invitational.jp/evola_main/annotation.cgi?hit=$id"
  end

  def self.explorenz
    "http://www.enzyme-database.org/query.php?ec=$id"
  end

  def self.eyesite
    "http://eyesite.cryst.bbk.ac.uk/cgi-bin/get_family_page.cgi?FAMILY=$id"
  end

  def self.ezcatdb
    "http://mbs.cbrc.jp/EzCatDB/search/get.do?dbcode=$id"
  end

  def self.fcp
    "http://cgl.imim.es/fcp/fcp.php?struct=1&compactId=EC.$id"
  end

  def self.fgdb
    "http://mips.helmholtz-muenchen.de/genre/proj/FGDB/singleGeneReport.html?entry=$id"
  end

  def self.firedb
    "http://firedb.bioinfo.cnio.es/Php/FireDB.php?pdbcode=$id"
  end

  def self.flight
    "http://flight.licr.org/browse/view_rnai_hits.jsp?project_id=[$project_id]&screen_id=$id"
  end

  def self.flymine
    "http://www.flymine.org/release-25.0/objectDetails.do?id=$id"
  end

  def self.flytf
    "http://www.flytf.org/flytfmine/objectDetails.do?id=$id"
  end

  def self.frnadb
    "http://www.ncrna.org/frnadb/detail.html?i_name=$id"
  end

  def self.fugoid
    "http://fugoid.webhost.utexas.edu/introndata/full_display.cfm?intronID=$id"
  end

  def self.funpep
    "http://swift.cmbi.kun.nl/swift/FUNPEP/gergo/$id/index.html"
  end

  def self.gallus_gbrowse
    "http://birdbase.net/cgi-bin/gbrowse/gallus08/?name=$id"
  end

  def self.gdfr_est
    "http://www.rosaceae.org/bio/content/?title=&url=http://www.rosaceae.org/cgi-bin/gdr/gdr_ESTGB.cgi?clone_name=$id"
  end

  def self.gdfr_marker
    "http://www.rosaceae.org/bio/content/?title=&url=http://www.rosaceae.org/cgi-bin/gdr/gdr_marker.cgi?MName_Result=$id"
  end

  def self.geisha
    "http://geisha.arizona.edu/geisha/search.jsp?gene=$id"
  end

  def self.genage
    "http://genomics.senescence.info/genes/details.php?id=$id"
  end

  def self.gendis
    "http://caps.ncbs.res.in/cgi-bin/mini/databases/gendis/sf.cgi?code=$id"
  end

  def self.gendr
    "http://genomics.senescence.info/diet/details.php?id=$id"
  end

  def self.geneloc
    "http://genecards.weizmann.ac.il/geneloc-bin/marker_cards.pl?id=$id"
  end

  def self.genenet
    "http://wwwmgs.bionet.nsc.ru/mgs/gnw/genenet/viewer/$id.html"
  end

  def self.genenote
    "http://bioinfo2.weizmann.ac.il/cgi-bin/genenote/GN_results.pl?keyword_type=2_gc_id&keyword=$id&data_type=norm2&results=yes"
  end

  def self.genetrap
    "http://pokey.ibme.utoronto.ca/clone_report.php?id=$id"
  end

  def self.genetrees
    "http://genetrees.vbi.vt.edu/GetAlignment?al=$id"
  end

  def self.genolevures
    "http://www.genolevures.org/elt/$id"
  end

  def self.genomereviews
    "http://www.ebi.ac.uk/integr8/OrganismSelection.do?action=makeCurrent&proteomeId=$id"
  end

  def self.genomernai
    "http://rnai.dkfz.de/GenomeRNAi/genedetails/$id"
  end

  def self.gensat
    "http://www.ncbi.nlm.nih.gov/sites/entrez?db=gensat&cmd=retrieve&list_uids=$id"
  end

  def self.germonline_gene
    "http://www.germonline.org/Homo_sapiens/geneview?db=core;gene=$id"
  end

  def self.germonline_marker
    "http://www.germonline.org/Homo_sapiens/markerview?marker=$id"
  end

  def self.ghr
    "http://ghr.nlm.nih.gov/gene/$id"
  end

  def self.gi
    "http://www.ncbi.nlm.nih.gov/entrez/viewer.fcgi?val=$id"
  end

  def self.gib
    "http://gib.genes.nig.ac.jp/single/index.php?spid=$id"
  end

  def self.gissd
    "http://www.rna.whu.edu.cn/perl/gissd/get_seq_exon.cgi?intron_id=$id"
  end

  def self.glycomapsdb
    "http://www.glycosciences.de/modeling/glycomapsdb/showdetails.php?mapid=$id"
  end

  def self.glyconavi
    "http://ws.glyconavi.org/DbDetail/moldetail.aspx?moleculeID=$id"
  end

  def self.gnd
    "http://nava.liacs.nl/cgi-bin/nava.py?id=$id"
  end

  def self.gold
    "http://genomesonline.org/cgi-bin/GOLD/bin/GOLDCards.cgi?goldstamp=$id"
  end

  def self.gopad
    "http://bcl.med.harvard.edu/proteomics/proj/gopart/gopart_all_tbl_view_detail_list.php?masterkey=$id"
  end

  def self.gp
    "http://www.ncbi.nlm.nih.gov/sites/entrez?Db=genomeprj&cmd=ShowDetailView&TermToSearch=$id"
  end

  def self.gpxmacrophage
    "http://gpxmea.gti.ed.ac.uk/GPX/cgi-bin/Scripts/showexperiment.cgi?HID=$id"
  end

  def self.gramene_po
    "http://www.gramene.org/db/ontology/search?id=$id"
  end

  def self.gramene_ref
    "http://www.gramene.org/db/literature/pub_search?ref_id=$id"
  end

  def self.greenphyldb
    "http://greenphyl.cirad.fr/v2/cgi-bin/family.cgi?id=$id"
  end

  def self.grin
    "http://www.ars.usda.gov/research/publications/publications.htm?seq_no_115=$id"
  end

  def self.grsdb
    "http://bioinformatics.ramapo.edu/GRSDB2/geneview.php?geneID=$id"
  end

  def self.gtop
    "http://spock.genes.nig.ac.jp/~genome/cgi-bin/mas.pl.cgi?org=[?species]&gene=$id"
  end

  def self.gtrdb
    "http://gtrnadb.ucsc.edu/$id"
  end

  def self.gxd
    "http://gbrowse.informatics.jax.org/cgi-bin/gbrowse/mouse_current/?name=$id"
  end

  def self.hagr
    "http://genomics.senescence.info/genes/entry.php?hgnc=$id"
  end

  def self.hapmap
    "http://snp.cshl.org/cgi-perl/gbrowse/hapmap27_B36/?name=$id"
  end

  def self.hbvar
    "http://globin.bx.psu.edu/cgi-bin/hbvar/query_vars3?mode=output&display_format=page&i=$id"
  end

  def self.hc
    "http://www.mesquiteproject.org/ontology/Habronattus/$id.html"
  end

  def self.hcnet
    "http://sbrg2.gist.ac.kr/hcnet/ver1.1/php/showDetailGeneInfo.php?unigeneID=$id"
  end

  def self.hcpin
    "http://nesg.org:9090/HCPIN/NShowProteinInfor.jsp?protein_id=$id"
  end

  def self.hcv
    "http://hcv.lanl.gov/components/sequence/HCV/asearch/query_one.comp?se_id=$id"
  end

  def self.hdbas
    "http://jbirc.jbic.or.jp/h-dbas/locusOverview.do?db=all&hix=$id"
  end

  def self.hdbase
    "http://hdbase.org/cgi-bin/jdrf_gene.cgi?ll_id=$id"
  end

  def self.hdr
    "http://research.nhgri.nih.gov/homeodomain/?mode=view&view=proteins&id=$id"
  end

  def self.hedgehog
    "http://hedgehog.sfsu.edu/genes/$id.html"
  end

  def self.hegdb
    "http://genomes.urv.cat/HEG-DB/buscador/mostrar_statical.php?name=$id&aa=true&codon=true&rscu=true"
  end

  def self.hembase
    "http://fmp-8.cit.nih.gov/hembase/detail.php?chrb=$id"
  end

  def self.hgnc
    "http://www.genenames.org/data/hgnc_data.php?hgnc_id=$id"
  end

  def self.hgpd
    "http://riodb.ibase.aist.go.jp/hgpd/cgi-bin/pg_locus_list.cgi?txt_srch_cdna_name=$id"
  end

  def self.hgsdd
    "http://projects.tcag.ca/cgi-bin/seg_dup/dupbrowse/human_b35/?name=$id"
  end

  def self.hgvbase
    "http://www.hgvbaseg2p.org/study/$id"
  end

  def self.hits
    "http://hits.isb-sib.ch/cgi-bin/view_mot_entry?name=$id"
  end

  def self.hmp
    "http://www.hmpdacc-resources.org/cgi-bin/hmp_catalog/main.cgi?section=HmpSummary&page=displayHmpProject&hmp_id=$id"
  end

  def self.hmpd
    "http://bioinfo.nist.gov/hmpd/servlet/Search3?vswiss_id=$id"
  end

  def self.hoinvgen
    "http://pbil.univ-lyon1.fr/cgi-bin/acnuc-search-id?query=$id&db=Hoinvprot&ident=1989108068"
  end

  def self.homd
    "http://www.homd.org/modules.php?op=modload&name=HOMD&file=index&oraltaxonid=$id&view=dynamic"
  end

  def self.homeodomain_resource
    "http://research.nhgri.nih.gov/apps/homeodomain/web/index.cgi?mode=view&view=proteins&id=$id"
  end

  def self.homstrad
    "http://tardis.nibio.go.jp/cgi-bin/homstrad/getdata.cgi?id=$id"
  end

  def self.hoppsigen
    "http://pbil.univ-lyon1.fr/cgi-bin/acnuc-search-id?query=$id&db=Hoppsigen&ident=1989108068"
  end

  def self.horde
    "http://genome.weizmann.ac.il/cgi-bin/horde/showGene.pl?symbol=$id"
  end

  def self.hotsprint
    "http://prism.ccbb.ku.edu.tr/hotsprint/result.php?queryId=$id"
  end

  def self.howdy
    "http://howdy.jst.go.jp/HOWDYCL/HOWDY.pl?Cls=GenBank&Key=UKEY&Val=$id"
  end

  def self.hpmr
    "http://www.receptome.org/HPMR/Families/Frameset_family.asp?FamId=$id"
  end

  def self.htpselex
    "http://www.isrec.isb-sib.ch/cgi-bin/htpselex/doc.cgi?id=$id"
  end

  def self.humancyc_compounds
    "http://biocyc.org/[?species]/NEW-IMAGE?type=COMPOUND&object=$id"
  end

  def self.humancyc_genes
    "http://biocyc.org/[?species]/search-query?type=GENE&gname=$id"
  end

  def self.humancyc_pathways
    "http://biocyc.org/[?species]/NEW-IMAGE?type=PATHWAY&object=$id"
  end

  def self.humancyc_reactions
    "http://biocyc.org/[?species]/new-image?type=REACTION&object=$id"
  end

  def self.hupi
    "http://hupi.ircm.qc.ca/hupi/gene/$id"
  end

  def self.icbs
    "http://contact14.ics.uci.edu/htmlfiles/$id.mmol.html"
  end

  def self.icds
    "http://www-bio3d-igbmc.u-strasbg.fr/ICDS/cgi-bin/gscope_html_server.tcsh?ICDS&PagesWeb&GvioManu&UnICDS&$id"
  end

  def self.idbd
    "http://biomarker.korea.ac.kr/disease/disease_view_en.jsp?group=1&id=$id"
  end

  def self.iev
    "http://www.inoh.org/ontology-viewer/cgi-bin/InohOVAttr.php?type=IEV&id=$id"
  end

  def self.igtcd
    "http://www.genetrap.org/cgi-bin/annotation.py?gene_key=$id"
  end

  def self.ihop
    "http://www.ihop-net.org/UniPub/iHOP/gs/$id.html"
  end

  def self.il2rgbase
    "http://research.nhgri.nih.gov/apps/scid/scid_reference.html#$id"
  end

  def self.imgt_3dstructuredb
    "http://imgt.cines.fr/3Dstructure-DB/cgi/details.cgi?pdbcode=$id"
  end

  def self.imgt_primerdb
    "http://imgt.org/IMGTPrimerDB/Check_PrDB.pl?numacc0=$id&origin=view&source=PrList"
  end

  def self.imotdb
    "http://caps.ncbs.res.in/cgi-bin/mini/databases/imotdb/imotdb.cgi?sfcode=$id"
  end

  def self.imr
    "http://www.inoh.org/ontology-viewer/cgi-bin/InohOVAttr.php?type=IMR&id=$id"
  end

  def self.innatedb
    "http://www.innatedb.ca/getGeneCard.do?id=$id"
  end

  def self.insrd
    "http://anobase.vectorbase.org/ir/assay.php?id=$id"
  end

  def self.integr8
    "http://www.ebi.ac.uk/integr8/OrganismSelection.do?action=makeCurrent&proteomeId=$id"
  end

  def self.interactive_fly
    "http://www.sdbonline.org/fly/$id.htm"
  end

  def self.interfil
    "http://www.interfil.org/details.php?id=$id"
  end

  def self.interpare
    "http://interpare.kobic.re.kr/cgi-bin/search_interface_from_interpare_new.cgi?pdb=$id"
  end

  def self.ipath
    "http://escience.invitrogen.com/ipath/iPath.jsp?cn=unknown&mapid=$id"
  end

  def self.ipdestdab
    "http://www.ebi.ac.uk/cgi-bin/ipd/estdab/print_cell.cgi?$id"
  end

  def self.ipdmhc
    "http://www.ebi.ac.uk/cgi-bin/ipd/mhc/get_allele.cgi?$id"
  end

  def self.ipfam
    "http://pfam.sanger.ac.uk/[family/clan]?acc=$id"
  end

  def self.ipfam_proteome
    "http://pfam.sanger.ac.uk/proteome?taxId=$id"
  end

  def self.iproclass
    "http://pir.georgetown.edu/cgi-bin/ipcEntry?id=$id"
  end

  def self.iresite
    "http://www.iresite.org/IRESite_web.php?page=view&entry_id=$id"
  end

  def self.islander
    "http://kementari.bioinformatics.vt.edu/cgi-bin/island.cgi?island=$id"
  end

  def self.its2
    "http://its2.bioapps.biozentrum.uni-wuerzburg.de/cgi-bin/its2.pl?Taxon_id=$id&method=All"
  end

  def self.ivdb
    "http://influenza.psych.ac.cn/search/detail.jsp?segment.gb_id=$id"
  end

  def self.jail
    "http://bioinf-apache.charite.de/jail/index.php?site=show_interfaces&pdb_id=$id"
  end

  def self.jcvi_genprop
    "http://cmr.jcvi.org/tigr-scripts/CMR/shared/GenomePropDefinition.cgi?prop_acc=$id"
  end

  def self.kdbi
    "http://bidd.nus.edu.sg/group/KDBI/Detail-new.asp?ID=$id"
  end

  def self.kdd
    "http://golgi.ana.ed.ac.uk/$id.html"
  end

  def self.kegg_brite
    "http://www.genome.jp/kegg-bin/get_htext?-p+/kegg/brite/br+br$id"
  end

  def self.kegg_disease
    "http://www.genome.jp/dbget-bin/www_bget?ds:$id"
  end

  def self.kineticdb
    "http://kineticdb.protres.ru/db/ind.pl?ind=$id"
  end

  def self.klotho
    "http://www.biocheminfo.org/klotho/html/$id.html"
  end

  def self.l1base
    "http://line1.bioapps.biozentrum.uni-wuerzburg.de/details.php?DBN=[?family_name]&UID=$id"
  end

  def self.leproma
    "http://mycobrowser.epfl.ch/leprosysearch.php?gene+name=$id&submit=Search"
  end

  def self.ligasite
    "http://www.bigre.ulb.ac.be/Users/benoit/LigASite/index.php?apo=$id"
  end

  def self.lncrna
    "http://lncrnadb.com/Detail.aspx?TKeyID=$id"
  end

  def self.locate
    "http://locate.imb.uq.edu.au/cgi-bin/report.cgi?entry=$id"
  end

  def self.loqate
    "http://www.weizmann.ac.il/molgen/loqate/gene/view/$id"
  end

  def self.lpfc
    "http://helix-web.stanford.edu/cgi-bin/textsearch.cgi?key=$id"
  end

  def self.lsmd
    "http://research.nhgri.nih.gov/lowe/db_retrieval.cgi?site_name=lowe&exon_intron_num=$id"
  end

  def self.magest
    "http://magest.hgc.jp/db/show_contig_by_entry_id/$id"
  end

  def self.malaria
    "http://sites.huji.ac.il/malaria/maps/$id.html"
  end

  def self.malisam
    "http://prodata.swmed.edu/malisam/[$id1][$id2]/[$id1][$id2].html"
  end

  def self.mampol
    "http://mampol.uab.es/cgi-bin/MamPol_s2.pl?Accession=$id"
  end

  def self.mapviewer
    "http://www.ncbi.nlm.nih.gov/projects/mapview/map_search.cgi?taxid=$id"
  end

  def self.mdpd
    "http://datam.i2r.a-star.edu.sg/mdpd/detail.php?symbol=$id"
  end

  def self.megamotifbase
    "http://caps.ncbs.res.in/cgi-bin/mini/databases/MegaMotifbase/megamotif1.cgi?code=$id&opt=h"
  end

  def self.mepd
    "http://ani.embl.de:8080/mepd/MdbShowClone01?cloneID=$id"
  end

  def self.merna
    "http://merna.lbl.gov/search.php?type=simple&metal_ion=$id"
  end

  def self.metacyc
    "http://biocyc.org/META/NEW-IMAGE?type=ENZYME&object=$id"
  end

  def self.metagrowth
    "http://igs-server.cnrs-mrs.fr/axenic-cgi/www_get_evdb?evdb+$id"
  end

  def self.metatiger
    "http://www.bioinformatics.leeds.ac.uk/metatiger/cgi_bin/pathway.cgi?organism=[$id1]&network=[$id2]"
  end

  def self.methycancer_cancer
    "http://methycancer.psych.ac.cn/cancerDetail.do?cancerid=$id"
  end

  def self.methycancer_clone
    "http://methycancer.psych.ac.cn/cloneDetail.do?clonename=$id"
  end

  def self.methycancer_gene
    "http://methycancer.psych.ac.cn/geneDetail.do?geneid=$id"
  end

  def self.methycancer_methylation
    "http://methycancer.psych.ac.cn/methylationDetail.do?id=$id"
  end

  def self.metnetdb
    "http://metnetonline.org/browse_pathway2.php?pthID=$id"
  end

  def self.mfungd
    "http://mips.helmholtz-muenchen.de/genre/proj/mfungd/singleGeneReport.html?entry=$id"
  end

  def self.mgc
    "http://mgc.nci.nih.gov/Tissues/LibInfo?LID=$id"
  end

  def self.mgg
    "http://www.broadinstitute.org/annotation/genome/magnaporthe_grisea/GeneDetails.html?sp=$id"
  end

  def self.mhcbn
    "http://www.imtech.res.in/cgibin/mhcbn/display.pl?field=sno&value=$id"
  end

  def self.micado
    "http://genome.jouy.inra.fr/cgi-bin/micado/access.cgi?accessnumber=$id"
  end

  def self.microkit
    "http://microkit.biocuckoo.org/html/$id.html"
  end

  def self.millipore_pathways
    "http://www.millipore.com/pathways/pathviewer.do?searchTerms=&diseaseAreaIds=&pathwayId=$id"
  end

  def self.mimi
    "http://mimi.ncibi.org/MimiWeb/gene-details-page-front.jsp?geneid=$id"
  end

  def self.mirnamap
    "http://mirnamap.mbc.nctu.edu.tw/php/mirna_entry.php?acc=$id"
  end

  def self.mirortho
    "http://cegg.unige.ch/mirortho/entry_details/$id"
  end

  def self.mist
    "http://genomics.ornl.gov/mist/view_organism.php?organism_id=$id"
  end

  def self.mitodat
    "http://www-lecb.ncifcrf.gov/mitoDat/$id.html"
  end

  def self.mitoproteome
    "http://www.mitoproteome.org/data/proteome/index.cgi?db=mito&pid=L$id"
  end

  def self.mmcd
    "http://mmcd.nmrfam.wisc.edu/test/cqsearch.py?cqid=$id"
  end

  def self.mmsinc
    "http://mms.dsfarm.unipd.it/mmsinc/search/molecule.php?mmscode=$id"
  end

  def self.modomics
    "http://modomics.genesilico.pl/modification?modification_id=$id"
  end

  def self.mokca
    "http://strubiol.icr.ac.uk/extra/mokca/mut_by_prot.php?protein_q=$id"
  end

  def self.molmovdb
    "http://www.molmovdb.org/cgi-bin/morph.cgi?ID=$id"
  end

  def self.mosdb
    "http://mips.helmholtz-muenchen.de/plant/rice/reportsjsp/contigReport.jsp?contig_id=$id"
  end

  def self.mousecyc
    "http://mousecyc.jax.org/MOUSE/NEW-IMAGE?type=NIL&object=$id"
  end

  def self.mp
    "http://www.informatics.jax.org/searches/Phat.cgi?id=$id"
  end

  def self.mpd
    "http://phenome.jax.org/db/q?rtn=markers/details&reqsym=$id"
  end

  def self.mtbd
    "http://tumor.informatics.jax.org/mtbwi/strainDetails.do?key=$id"
  end

  def self.mtbreglist
    "http://pages.usherbrooke.ca/gaudreau/MtbRegList/www/genome_ir_manip.php?id=$id"
  end

  def self.mulpssm
    "http://crick.mbu.iisc.ernet.in/mulpssm/cgi/disp_fam.cgi?dbase=[?pali/pfam]&name=$id"
  end

  def self.mutdb
    "http://mutdb.org/cgi-bin/mutdb.pl?id=[?gene_symbol]&geneid=$id"
  end

  def self.nascarrays
    "http://affymetrix.arabidopsis.info/narrays/experimentpage.pl?experimentid=$id"
  end

  def self.natsdb
    "http://natsdb.cbi.pku.edu.cn/nats_list.php?sa_type=SA_20&represent=1&keyword_term=&species=[?species_name]&id=$id"
  end

  def self.ncir
    "http://prion.bchs.uh.edu/bp_type/individual_record_page$id.html"
  end

  def self.ncl_resource
    "http://www.ucl.ac.uk/ncl/$id.shtml"
  end

  def self.ncrnas_database
    "http://ncrnadb.trna.ibch.poznan.pl/scripts/getdesc.cgi?id=$id"
  end

  def self.ndb
    "http://ndbserver.rutgers.edu/atlas/nmr/structures/id/$id/$id.html"
  end

  def self.neibank
    "http://neibank.nei.nih.gov/cgi-bin/showDataTable.cgi?lib=$id"
  end

  def self.nembase
    "http://www.nematodes.org/nembase4/cluster.php?cluster=$id"
  end

  def self.netbiochem
    "http://library.med.utah.edu/NetBiochem/$id.htm"
  end

  def self.netpath
    "http://www.netpath.org/molecule?molecule_id=$id"
  end

  def self.netpro
    "http://www.interactions.net.in/index_molreport.jsp?id=$id"
  end

  def self.neumore
    "http://neumore.cis.usouthal.edu/ontologies/NeuMORE-v0.1.owl#$id"
  end

  def self.nextbio
    "http://www.nextbio.com/b/search/ov/$id"
  end

  def self.nif
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_agency
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_backend
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_cell
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_dysfunction
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_grossanatomy
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_investigation
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nif_molecule
    "http://www.neurolex.org/wiki/Category:$id"
  end

  def self.nmpdr
    "http://www.nmpdr.org/FIG/wiki/rest.cgi/NmpdrPlugin/SeedViewer?page=Annotation;feature=$id"
  end

  def self.norine
    "http://bioinfo.lifl.fr/norine/result.jsp?ID=$id"
  end

  def self.npd
    "http://npd.hgu.mrc.ac.uk/user/$id"
  end

  def self.nprd
    "http://srs6.bionet.nsc.ru/srs6bin/cgi-bin/wgetz?-page+LibInfo+-id+1JCHQ1bgqkg+-lib+$id"
  end

  def self.ntdb
    "http://ntdb.chem.cuhk.edu.hk/data/$id.htm"
  end

  def self.nursa
    "http://www.nursa.org/molecule.cfm?molType=[?molecule_type]&molId=$id"
  end

  def self.odb
    "http://www.genome.sk.ritsumei.ac.jp/odb/odb2.rb?org=[?species]&genome_id=[?genome_id]&genes=$id"
  end

  def self.ogd
    "http://www.oomycete.org/ogd/sequence.html?sequence_id=$id"
  end

  def self.ogre
    "http://drake.mcmaster.ca/cgi-bin/ogre/featurelist.pl?genome=$id"
  end

  def self.okcam
    "http://okcam.cbi.pku.edu.cn/entry-info.php?id=$id"
  end

  def self.oma
    "http://www.omabrowser.org/cgi-bin/gateway.pl?f=DisplayEntry&p1=$id"
  end

  def self.operondb
    "http://operondb.cbcb.umd.edu/cgi-bin/operondb/pairs.cgi?taxon_id=$id"
  end

  def self.ordb
    "http://senselab.med.yale.edu/ordb/eavdata.asp?o=$id"
  end

  def self.oreganno
    "http://www.oreganno.org/oregano/recordview.action?recid=$id"
  end

  def self.orenza
    "http://www.orenza.u-psud.fr/query_by_ec.php?EC_number=EC%20$id"
  end

  def self.orfdb
    "http://orf.invitrogen.com/cgi-bin/ORFCard?&ORF=$id&set=UltimateORFs&hboxPath=keyword"
  end

  def self.organelle_db
    "http://organelledb.lsi.umich.edu/gene.php?id=$id"
  end

  def self.orthomcl
    "http://orthomcl.org/cgi-bin/OrthoMclWeb.cgi?rm=sequenceList&groupac=$id"
  end

  def self.oryzabase_mutant
    "http://www.shigen.nig.ac.jp/rice/oryzabase/genes/symbolDetailAction.do?mutantGeneId=$id"
  end

  def self.oryzabase_strain
    "http://www.shigen.nig.ac.jp/rice/oryzabase/nbrpStrains/nigDetailAction.do?nigStrainId=$id"
  end

  def self.otl
    "http://urgi.versailles.inra.fr/OryzaTagLine/cgi-bin/general_mutant.pl?line=$id"
  end

  def self.p3db
    "http://digbio.missouri.edu/p3db/data/protein.php?id=$id"
  end

  def self.pairsdb
    "http://pairsdb.csc.fi/?query=seqinfo&accnum=$id"
  end

  def self.pali
    "http://pauling.mbu.iisc.ernet.in/~pali/cgi/members.cgi?famno=$id"
  end

  def self.pandit
    "http://www.ebi.ac.uk/goldman-srv/pandit/pandit.cgi?action=browse&fam=$id"
  end

  def self.panther_gene
    "http://www.pantherdb.org/genes/gene.do?acc=$id"
  end

  def self.panther_ontology
    "http://www.pantherdb.org/panther/category.do?categoryAcc=$id"
  end

  def self.partigenedb
    "http://www.compsysbio.org/partigene/cluster.php?cluster=$id"
  end

  def self.pass2
    "http://caps.ncbs.res.in/cgi-bin/mini/databases/campass/pass/pass.cgi?code=$id"
  end

  def self.pathfinder
    "http://www.sigmaaldrich.com/life-science/your-favorite-gene-search/pathway-overviews/$id.html"
  end

  def self.pathguide
    "http://www.pathguide.org/fullrecord.php?organisms=all&availability=all&standards=all&order=alphabetic&DBID=$id"
  end

  def self.pathoplant
    "http://www.pathoplant.de/detail.php?accNo=$id"
  end

  def self.pathwayontology
    "http://rgd.mcw.edu/tools/ontology/ont_annot.cgi?term_key=$id&ontology=go"
  end

  def self.patric
    "http://patricbrc.vbi.vt.edu/portal/portal/patric/Taxon?cType=taxon&cId=$id"
  end

  def self.pdb_tm
    "http://pdbtm.enzim.hu/?m=show_entry&id=$id"
  end

  def self.pdba
    "http://www.rcsb.org/pdb/explore/explore.do?structureId=$id"
  end

  def self.pdtd
    "http://www.dddc.ac.cn/pdtd/detail.php?pdbId=$id"
  end

  def self.pedant
    "http://pedant.gsf.de/pedant3htmlview/pedant3view?Method=analysis&Db=$id"
  end

  def self.pede
    "http://pede.dna.affrc.go.jp/seq_search/assembly_info.php?release=$id&name=$id"
  end

  def self.pepbank
    "http://pepbank.mgh.harvard.edu/interactions/details/$id"
  end

  def self.pepr
    "http://pepr.cnmcresearch.org/browse.do?action=list_[?exp/?prj_exp]&[?exp/?project]Id=$id"
  end

  def self.pgdb
    "http://www.urogene.org/pgdb/gene/$id.html"
  end

  def self.pharmgkb
    "http://www.pharmgkb.org/do/serve?objId=$id"
  end

  def self.phci2dpage
    "http://www.gram.au.dk/cgi-bin/get-2d-entry/def?$id"
  end

  def self.pibase
    "http://modbase.compbio.ucsf.edu/pibase-cgi/get_details.pl?object_type=complexes&bdp_id=$id"
  end

  def self.pig
    "http://molvis.vbi.vt.edu/pig/view/pig_protein_view.php?protein=$id"
  end

  def self.piggis
    "http://pig.genomics.org.cn/transview.jsp?transcript=$id"
  end

  def self.pigqtldb
    "http://www.animalgenome.org/cgi-bin/QTLdb/SS/qdetails?QTL_ID=$id"
  end

  def self.pips
    "http://www.compbio.dundee.ac.uk/www-pips/Identifier.jsp?ID=$id&Interactions=Prot&LR=1.0&modules=on"
  end

  def self.pisite
    "http://pisite.hgc.jp/cgi-bin/view.cgi?pdbid=$id&chain=[?chain]"
  end

  def self.plantcyc
    "http://pmn.plantcyc.org/PLANT/NEW-IMAGE?type=GENE&object=$id"
  end

  def self.plantsp_plantst
    "http://plantst.genomics.purdue.edu/cgi-bin/detail.cgi?db=plants[?t/?p]&id=$id"
  end

  def self.planttfdb
    "http://planttfdb.cbi.pku.edu.cn/tf.php?sp=[?species_name]&did=$id"
  end

  def self.planttribes
    "http://fgp.huck.psu.edu/tribedb/gene.pl?action=view_gene&gene_id=$id"
  end

  def self.plasmid
    "http://plasmid.med.harvard.edu/PLASMID/GetCollection.do?collectionName=$id"
  end

  def self.plpmdb
    "http://www.studiofmp.com/plpmdb/mutant.asp?Id=$id"
  end

  def self.plprot
    "http://www.plprot.ethz.ch/index.php?page=ProteinDetails&plp_id=$id&organism=[?species_name]"
  end

  def self.pmd
    "http://spock.genes.nig.ac.jp/~pmd/cgi-bin/PMD/PMDentry.pl.cgi?$id"
  end

  def self.pod
    "http://podb.nibb.ac.jp/Organellome/bin/browseImage.php?ID=Image-toshi_biochem.tohoku.ac.jp-$id"
  end

  def self.pogs_plantrbp
    "http://plantrbp.uoregon.edu/pogView.php?id=$id"
  end

  def self.polya_db
    "http://polya.umdnj.edu/polya_db2/gene.php?llid=$id"
  end

  def self.polydoms
    "http://polydoms.cchmc.org/polydoms/GD?DISP_OPTION=[?NonSynonymous/Synonymous]&field1=$id"
  end

  def self.polymorphix
    "http://pbil.univ-lyon1.fr/cgi-bin/acnuc-dispfam?query=$id&db=Polymorphix"
  end

  def self.poxvirus_gene
    "http://www.poxvirus.org/gene_detail.asp?gene_id=$id"
  end

  def self.poxvirus_genome
    "http://www.poxvirus.org/map.asp?genome_id=$id"
  end

  def self.precise
    "http://precise.bu.edu/Output.aspx?UniqueID=$id"
  end

  def self.premod
    "http://genomequebec.mcgill.ca/PReMod/show/module.do?method=showModule&moduleId=$id"
  end

  def self.priam
    "http://prodomweb.univ-lyon1.fr/priam/cgi-bin/ReqPRIAM_png.pl?priam_release=OCT11&priam_ac=$id"
  end

  def self.prime
    "http://prime.ontology.ims.u-tokyo.ac.jp:8081/php/DbDispProtein.php?proteinID=$id"
  end

  def self.prints
    "http://www.bioinf.manchester.ac.uk/cgi-bin/dbbrowser/PRINTS/DoPRINTS.pl?cmd_a=Display&qua_a=/Full&fun_a=Code&qst_a=$id"
  end

  def self.procognate
    "http://www.ebi.ac.uk/thornton-srv/databases/cgi-bin/procognate/PDBquery.pl?PDBcode=$id&Classification=[?CATH/?SCOP/?Pfam]"
  end

  def self.prodoric_bindingsite
    "http://prodoric.tu-bs.de/site.php?site_acc=$id"
  end

  def self.prodoric_expression
    "http://prodoric.tu-bs.de/profile.php?profile_acc=$id"
  end

  def self.prodoric_gene
    "http://prodoric.tu-bs.de/gene.php?gene_acc=$id"
  end

  def self.prodoric_protein
    "http://prodoric.tu-bs.de/protein.php?protein_acc=$id"
  end

  def self.promex
    "http://promex.pph.univie.ac.at/promex/?spec=$id"
  end

  def self.promise
    "http://metallo.scripps.edu/PROMISE/$id.html"
  end

  def self.pronit
    "http://gibk26.bse.kyutech.ac.jp/cgi-bin/jouhou/pronit/new/bind_entry.pl?ENTRY=$id"
  end

  def self.prorule
    "http://www.expasy.org/cgi-bin/prosite/ScanView.cgi?scanfile=$id"
  end

  def self.protcom
    "http://www.ces.clemson.edu/compbio/protcom/print_file.cgi?pdbid=$id"
  end

  def self.protherm
    "http://gibk26.bse.kyutech.ac.jp/cgi-bin/jouhou/protherm/pp_entry.pl?ENTRY=$id"
  end

  def self.psd
    "http://bioinf.scri.sari.ac.uk/cgi-bin/plant_snorna/get-sno-sequence-and-allignments?id=$id"
  end

  def self.pseudobase
    "http://www.ekevanbatenburg.nl/PKBASE/$id.HTML"
  end

  def self.pseudocap
    "http://www.pseudomonas.com/getAnnotation.do?locusID=$id"
  end

  def self.pseudogene
    "http://tables.pseudogene.org/[?species_name]/$id"
  end

  def self.pstiing
    "http://pstiing.licr.org/search/c_proteininfo.jsp?uniprot_id=$id"
  end

  def self.ptmswitchboard
    "http://cagr.pcbi.upenn.edu/PTMswitchboard/jsp/detail.jsp?ID=$id"
  end

  def self.pubmeth
    "http://matrix.ugent.be/temp/static/$id.html"
  end

  def self.qppd
    "http://lpgws.nci.nih.gov/cgi-bin/PrimerViewer?acc=$id"
  end

  def self.rad
    "http://rad.dna.affrc.go.jp/SY-1102-cgi-bin/rad/PCA/ctl_frame.cgi?clone=$id"
  end

  def self.rapdb
    "http://rapdb.dna.affrc.go.jp/viewer/gbrowse_details/build5?name=[$id"
  end

  def self.rapid
    "http://rapid.rcai.riken.jp/RAPID/diseasePhenotype?pid_id=$id"
  end

  def self.rarge
    "http://rarge.psc.riken.jp/dsmutant/detail.pl?keyword=$id"
  end

  def self.ratmap
    "http://ratmap.org/Showgene.php?gene_stable_id=$id"
  end

  def self.rcd
    "http://purl.bioontology.org/ontology/RCD/$id"
  end

  def self.recode
    "http://recode.ucc.ie/recode/$id/"
  end

  def self.redfly
    "http://redfly.ccr.buffalo.edu/?content=/view_detail.php&crm_id=$id"
  end

  def self.redidb
    "http://biologia.unical.it/py_script/cgi-bin/retrieve.py?query=$id"
  end

  def self.regtransbase
    "http://regtransbase.lbl.gov/cgi-bin/regtransbase?page=geneinfo&amp;seqfeature_id=$id"
  end

  def self.regulondb
    "http://regulondb.ccg.unam.mx/GeneController?key_id_org=ECK12&gene_id=$id&type=jsp"
  end

  def self.replicationdomain
    "http://www.replicationdomain.com/view-dataset.php?RecordID=$id"
  end

  def self.repo
    "http://purl.bioontology.org/ontology/REPO.owl#$id"
  end

  def self.reproduction2dpage
    "http://reprod.njmu.edu.cn/cgi-bin/2d/2d.cgi?ac=$id"
  end

  def self.rfam
    "http://rfam.sanger.ac.uk/family/$id"
  end

  def self.rgd_gene
    "http://rgd.mcw.edu/tools/genes/genes_view.cgi?id=$id"
  end

  def self.rgd_qtl
    "http://rgd.mcw.edu/objectSearch/qtlReport.jsp?rgd_id=$id"
  end

  def self.rgd_ref
    "http://rgd.mcw.edu/tools/references/references_view.cgi?id=$id"
  end

  def self.rgd_strain
    "http://rgd.mcw.edu/tools/strains/strains_view.cgi?id=$id"
  end

  def self.rh_mesh
    "http://bioonto.de/mesh.owl#$id"
  end

  def self.rice_pipeline
    "http://cdna01.dna.affrc.go.jp/cDNA/report/$id.html"
  end

  def self.ricecyc
    "http://pathway.gramene.org/RICE/NEW-IMAGE?type=PATHWAY&object=$id"
  end

  def self.rissc
    "http://egg.umh.es/rissc/fich.php?accession=$id"
  end

  def self.rkd
    "http://phylomics.ucdavis.edu/kinase/tree.php?fam=$id"
  end

  def self.rmd
    "http://ribosome.fandm.edu/node/$id"
  end

  def self.rna_sstrand
    "http://www.rnasoft.ca/sstrand/show_results.php?molecule_ID=$id"
  end

  def self.rnajunction
    "http://rnajunction.abcc.ncifcrf.gov/JunctionPage.php?jid=$id"
  end

  def self.rnao
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.rnrdb
    "http://rnrdb.molbio.su.se/proteins_for_organism.html?organism_nr=$id"
  end

  def self.roleo
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.rospath_pc
    "http://rospath.ewha.ac.kr/complex/ProteinComplexDetailFrm.jsp?ENTITY_ID=$id"
  end

  def self.rospath_protein
    "http://rospath.ewha.ac.kr/protein/ProteinDetailFrm.jsp?ENTITY_ID=$id"
  end

  def self.rospath_signalling
    "http://rospath.ewha.ac.kr/signaling/SignalingDetailFrm.jsp?SIGNALING_ID=$id"
  end

  def self.rospath_transition
    "http://rospath.ewha.ac.kr/interaction/ProteinTransitionDetailFrm.jsp?ENTITY_ID=$id"
  end

  def self.rpg
    "http://ribosome.miyazaki-med.ac.jp/rpg.cgi?mode=gene&id=$id"
  end

  def self.rs
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.rtcgd
    "http://rtcgd.abcc.ncifcrf.gov/cgi-bin/mm9/clone_finder.cgi?query=$id"
  end

  def self.rtprimerdb
    "http://medgen.ugent.be/rtprimerdb/assay_report.php?assay_id=$id"
  end

  def self.rvd
    "http://virus.zoo.ox.ac.uk/rnavirusdb/virus.php?id=$id"
  end

  def self.s_mart_db
    "http://smartdb.bioinf.med.uni-goettingen.de/cgi-bin/SMARtDB/getSMAR.cgi?$id"
  end

  def self.salad
    "http://salad.dna.affrc.go.jp/CGViewer/en/v3.0/cgv_clust_view.jsp?pfamid=$id"
  end

  def self.sbase
    "http://hydra.icgeb.trieste.it/sbase/sbase.php?sec=search&sub=group&group_id=$id"
  end

  def self.scadb
    "http://ymbc.ym.edu.tw/cgi-bin/SCAdb_ensembl/aroundSTR.cgi?sca_type=SCA1&type=CAG&repeats_id=$id"
  end

  def self.schistodb
    "http://schistocyc.schistodb.net/ptools/SM/NEW-IMAGE?type=GENE&object=$id"
  end

  def self.scmd
    "http://yeast.gi.k.u-tokyo.ac.jp/datamine/ViewStats.do?orf=$id"
  end

  def self.scpd
    "http://rulai.cshl.edu/cgi-bin/SCPD/getgene2?$id"
  end

  def self.sdap
    "http://fermi.utmb.edu/cgi-bin/SDAP/sdap_02?dB_Type=0&allid=$id"
  end

  def self.sdr
    "http://paradox.harvard.edu/sdr/families/$id/$id_main.html"
  end

  def self.seedgenes
    "http://www.seedgenes.org/SeedGeneProfile?geneSymbol=$id"
  end

  def self.selenodb
    "http://www.selenodb.org/cgi-perl/feature_report.pl?feature=$id_1.0"
  end

  def self.sheepqtldb
    "http://www.animalgenome.org/cgi-bin/QTLdb/OA/qdetails?QTL_ID=$id"
  end

  def self.shibase
    "http://www.mgc.ac.cn/cgi-bin/ShiBASE/ShiBASE_query.cgi?synonym=$id"
  end

  def self.shr
    "http://www.shojaee.com/shr/shr.owl#$id"
  end

  def self.siege
    "http://pulm.bumc.bu.edu/cgi-bin/siegeDB/siege_html/compsearchgraph.cgi?$id"
  end

  def self.siena2dpage
    "http://www.bio-mol.unisi.it/cgi-bin/2d/2d.cgi?ac=$id"
  end

  def self.silkdb
    "http://www.silkdb.org/cgi-bin/gbrowse/silkdb/?name=$id"
  end

  def self.silva
    "http://www.arb-silva.de/browser/ssu/$id/embl/?tx_pmtree_pi1[pid]=$id"
  end

  def self.sisyphus
    "http://sisyphus.mrc-cpe.cam.ac.uk/sisyphus/alignment.jsp?ac=$id"
  end

  def self.smr
    "http://swissmodel.expasy.org/repository/?pid=$id&uid=&token=&zid=async"
  end

  def self.snap
    "http://snap.humgen.au.dk/views/geneview.cgi?gene=$id"
  end

  def self.snornalbmedb
    "http://www-snorna.biotoul.fr/plus.php?id=$id"
  end

  def self.snp2nmd
    "http://variome.kobic.re.kr/SNP2NMD/snp2nmd.jsp?id=$id&rule=50"
  end

  def self.snp500cancer
    "http://snp500cancer.nci.nih.gov/snp.cfm?both_snp_id=$id"
  end

  def self.snpeffect
    "http://snpeffect.vib.be/snp_main.php?id=$id"
  end

  def self.soy
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.spbase
    "http://www.spbase.org/SpBase/search/viewAnnoGeneInfo.php?spu_id=$id"
  end

  def self.spd
    "http://spd.cbi.pku.edu.cn/spd_pro.php?id=$id"
  end

  def self.spdo
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.spliceinfo
    "http://spliceinfo.mbc.nctu.edu.tw/info_show.php?gs_id=$id"
  end

  def self.splicenest
    "http://splicenest.molgen.mpg.de/cgi-bin/splicegraph.cgi?cluster=$id"
  end

  def self.spodobase
    "http://bioweb.ensam.inra.fr/Spodopterav3/sequence?name=$id&class=Sequence"
  end

  def self.spto
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.srd
    "http://rapeseed.plantsignal.cn/viewGene.do?id=$id"
  end

  def self.srpdb
    "http://rnp.uthct.edu/rnp/SRPDB/rna/sequences/fasta/$id.fasta"
  end

  def self.sstoss
    "http://caps.ncbs.res.in/cgi-bin/mini/databases/SSTOSS/sstoss.cgi?code=$id"
  end

  def self.straininfonet
    "http://www.straininfo.net/taxa/$id"
  end

  def self.strepto_db
    "http://oger.tu-bs.de/websites/query_result.php?index=1&dbno=$id"
  end

  def self.suba
    "http://suba.plantenergy.uwa.edu.au/flatfile.php?id=$id"
  end

  def self.sulfolobus
    "http://www.sulfolobus.org/cbin/mutagen.pl?page=misc&gidinfo=$id"
  end

  def self.superdrug
    "http://bioinf.charite.de/superdrug/fullinfo.php?cas=$id"
  end

  def self.superhapten
    "http://bioinformatics.charite.de/superhapten/fullinfo_hapten_chime.php?id=$id"
  end

  def self.supernatural
    "http://bioinformatics.charite.de/supernatural/marvin/fullinfo_roempp_marvin.php?cas=$id"
  end

  def self.superscent
    "http://bioinformatics.charite.de/superscent/src/fullinfo.php?cas=$id"
  end

  def self.supersite
    "http://bioinf-tomcat.charite.de/supersite/resultPDB.faces?pdbid=$id"
  end

  def self.supertoxic
    "http://bioinformatics.charite.de/supertoxic/index.php?site=detail_view&ids=($id)"
  end

  def self.supfam
    "http://pauling.mbu.iisc.ernet.in/supfam/cgi/display_pfam.cgi?name=$id"
  end

  def self.swiss2dpage
    "http://ca.expasy.org/swiss-2dpage/ac=$id"
  end

  def self.syfpeithi
    "http://www.ebi.ac.uk/cgi-bin/emblfetch?$id"
  end

  def self.symptom
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.sysbodyfluid
    "http://www.biosino.org/bodyfluid/protein.jsp?proteinID=$id"
  end

  def self.systers
    "http://systers.molgen.mpg.de/cgi-bin/nph-fetchcluster.pl?CLNR=$id"
  end

  def self.systomonas_compound
    "http://www.systomonas.de/compound.php?cp_acc=$id"
  end

  def self.systomonas_gene
    "http://www.systomonas.de/gene.php?ge_acc=$id"
  end

  def self.systomonas_interaction
    "http://www.systomonas.de/interaction.php?ia_acc=$id"
  end

  def self.systomonas_pathways
    "http://www.systomonas.de/pathway.php?pa_acc=$id"
  end

  def self.systomonas_protein
    "http://www.systomonas.de/protein.php?pr_acc=$id"
  end

  def self.t1dbase
    "http://t1dbase.org/page/Overview/display/gene_id/$id"
  end

  def self.taed
    "http://www.sbc.su.se/~malin_a/TAEDcorr/$id.html"
  end

  def self.tao
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.taxrank
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.tbdb
    "http://genome.tbdb.org/annotation/genome/tbdb/GeneDetails.html?sp=$id"
  end

  def self.tbestdb
    "http://tbestdb.bcm.umontreal.ca/searches/contig.php?conDeID=$id"
  end

  def self.tc7ap
    "http://www.chr7.org/cgi-bin/geneview?id=$id"
  end

  def self.tccd
    "http://www.itb.cnr.it/cellcycle/gene_rep.php?gene_name=$id"
  end

  def self.tcruzidb
    "http://tcruzidb.org/tcruzidb/showRecord.do?name=GeneRecordClasses.GeneRecordClass&project_id=&primary_key=$id"
  end

  def self.tecrdb
    "http://xpdb.nist.gov/enzyme_thermodynamics/enzyme_data1.pl?T1=$id"
  end

  def self.tess
    "http://www.cbil.upenn.edu/cgi-bin/tess/tess?request=FCT-DBRTRV-Accno&key=$id"
  end

  def self.tgd
    "http://phage.bioc.tulane.edu/cgi-bin/gbrowse/$id?name=$id"
  end

  def self.tgdb
    "http://www.tumor-gene.org/cgi-bin/TGDB/tgdb_fetch_gene.cgi?gene=$id"
  end

  def self.tgi
    "http://compbio.dfci.harvard.edu/cgi-bin/tgi/gimain.pl?gudb=$id"
  end

  def self.tied
    "http://www.iedb.org/epId/$id"
  end

  def self.tol
    "http://tolweb.org/$id"
  end

  def self.tomatest_db
    "http://biosrv.cab.unina.it/solestdb/clusterview.php?clid=$id"
  end

  def self.topdb
    "http://topdb.enzim.hu/?m=show&id=$id"
  end

  def self.toxodb
    "http://toxodb.org/toxo/showRecord.do?name=GeneRecordClasses.GeneRecordClass&source_id=$id"
  end

  def self.tpdb
    "http://tpdb.medchem.ku.edu:8080/protein_database/protein_details.jsp?prot_id=$id"
  end

  def self.tpmd
    "http://tpmd2.nhri.org.tw/tpmd/php-bin/filter.php?search=$id"
  end

  def self.tptad
    "http://plantta.jcvi.org/cgi-bin/plantta_report.pl?ta=$id"
  end

  def self.transfactomedb
    "http://bussemaker.bio.columbia.edu:8080/ytdb-cgi/[?RNA/?DNA]/ViewPSAM?ms=[?RNA/?DNA]&M=$id"
  end

  def self.transportdb
    "http://www.membranetransport.org/protein.php?pOID=mmar1&pSynonym=$id"
  end

  def self.transterm
    "http://mrna.otago.ac.nz/cgi-bin/tt_data_browse/RNAMotif?PatID=$id"
  end

  def self.tred
    "http://rulai.cshl.edu/cgi-bin/TRED/tred.cgi?process=geneInfo&gid=$id"
  end

  def self.treefam
    "http://www.treefam.org/cgi-bin/TFinfo.pl?ac=$id"
  end

  def self.trmp
    "http://bidd.nus.edu.sg/group/pathway/$id"
  end

  def self.trnadbce
    "http://trna.nagahama-i-bio.ac.jp/cgi-bin/trnadb/whole_detail.cgi?SID=$id"
  end

  def self.tto
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.tuberculist
    "http://tuberculist.epfl.ch/quicksearch.php?gene+name=$id"
  end

  def self.uagb
    "http://archaea.ucsc.edu/cgi-bin/hgGateway?db=$id"
  end

  def self.ugmicrosatdb
    "http://www.veenuash.info/veenu/chromo.asp?ns=$id"
  end

  def self.uniref
    "http://www.uniprot.org/uniref/$id"
  end

  def self.unprot_keywords
    "http://www.uniprot.org/keywords/$id"
  end

  def self.utrdb_utrsite
    "http://utrdb.ba.itb.cnr.it/getgene/$id"
  end

  def self.utrome
    "http://128.122.61.5/cgi-bin/UTRome/utrome.cgi?action=gene&geneid=$id"
  end

  def self.vega
    "http://vega.sanger.ac.uk/[?species_name]/Gene/Summary?g=$id"
  end

  def self.vfdb
    "http://www.mgc.ac.cn/cgi-bin/VFs/genus.cgi?Genus=$id"
  end

  def self.viperdb
    "http://viperdb.scripps.edu/info_page.php?VDB=$id"
  end

  def self.virmirdb
    "http://alk.ibms.sinica.edu.tw/cgi-bin/miRNA/virus.cgi?tax_id=$id"
  end

  def self.viroligo
    "http://viroligo.okstate.edu/main.php?vid=$id"
  end

  def self.vita
    "http://vita.mbc.nctu.edu.tw/search.php?acc=$id"
  end

  def self.vkcdb
    "http://vkcdb.biology.ualberta.ca/cgi-bin/vkcdb/vkcdb-scp/entry.cgi?vkcid=$id"
  end

  def self.vmd
    "http://vmd.vbi.vt.edu/cgi-bin/browse/browserDetail_new.cgi?ID=$id"
  end

  def self.vz
    "http://viralzone.expasy.org/all_by_protein/$id.html"
  end

  def self.wbbt
    "http://wormbase.org/db/ontology/anatomy?name=$id"
  end

  def self.wbls
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.wbphenotype
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.webelements
    "http://webelements.com/$id"
  end

  def self.wfleabase
    "http://wfleabase.org/genepage/daphnia/$id"
  end

  def self.world2dpage
    "http://world-2dpage.expasy.org/repository/database=$id"
  end

  def self.wormbase_gene
    "http://www.wormbase.org/species/c_elegans/gene/$id"
  end

  def self.wormbase_rnai
    "http://www.wormbase.org/species/c_elegans/rnai/$id"
  end

  def self.wormbook
    "http://www.wormbook.org/chapters/$id"
  end

  def self.xao
    "http://www.xenbase.org/anatomy/static/organs/$id.jsp"
  end

  def self.ycmn_complex
    "http://www.comp-sys-bio.org/yeastnet/v4/showComplexes.php?complex_id=$id"
  end

  def self.ycmn_compound
    "http://www.comp-sys-bio.org/yeastnet/v4/showCompounds.php?cpd_id=$id"
  end

  def self.ycmn_gene
    "http://www.comp-sys-bio.org/yeastnet/v4/showGenes.php?gene_id=$id"
  end

  def self.ycmn_protein
    "http://www.comp-sys-bio.org/yeastnet/v4/showProteins.php?protein_id=$id"
  end

  def self.ycmn_reaction
    "http://www.comp-sys-bio.org/yeastnet/v4/showEvents.php?event_id=$id"
  end

  def self.yeastfunc
    "http://func.med.harvard.edu/yeast/genes/list_functional_scores/$id"
  end

  def self.yeastract
    "http://www.yeastract.com/view.php?existing=locus&orfname=$id"
  end

  def self.ygob
    "http://wolfe.gen.tcd.ie/cgi/browser/ygob.pl?gene=$id"
  end

  def self.yh_database
    "http://yh.genomics.org.cn/mapview.jsp?path=$id"
  end

  def self.yrc
    "http://www.yeastrc.org/pdr/viewProtein.do?id=$id"
  end

  def self.ysd
    "http://people.biochem.umass.edu/sfournier/fournierlab/snornadb/snrs/$id.php"
  end

  def self.zfa
    "http://purl.obolibrary.org/obo/$id"
  end

  def self.zifdb
    "http://bindr.gdcb.iastate.edu:8080/ZiFDB/controller/checkArticle?artId=$id"
  end

end

end
