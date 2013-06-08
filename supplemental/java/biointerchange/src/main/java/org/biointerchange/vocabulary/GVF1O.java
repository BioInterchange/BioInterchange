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


public class GVF1O {

  /**
   * Either:
   *   Establishes the landmark (e.g. a chromosome) on which a feature is located.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0004)
   * Or:
   *   Link to the landmark that establishes the coordinate system for the breakpoint.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0072)
   */
  public static Set<Resource> seqid() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0004"), _namespace_GVF1O("GVF1_0072") }));
  }

  /**
   * Either:
   *   Strand of the feature.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0010)
   * Or:
   *   Strand of the breakpoint.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0083)
   * Or:
   *   Strand of a target -- if applicable.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0091)
   */
  public static Set<Resource> strand() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0010"), _namespace_GVF1O("GVF1_0083"), _namespace_GVF1O("GVF1_0091") }));
  }

  /**
   * Either:
   *   Tag name/value pair attributes of a feature.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0012)
   * Or:
   *   Tag name/value pair attributes that are not captured by the GVF specification.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0152)
   */
  public static Set<Resource> attributes() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0012"), _namespace_GVF1O("GVF1_0152") }));
  }

  /**
   * Link out to the parent feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0014)
   */
  public static Resource parent() {
    return _namespace_GVF1O("GVF1_0014");
  }

  /**
   * Relationship that describes which features belong to a feature set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0015)
   */
  public static Resource contains() {
    return _namespace_GVF1O("GVF1_0015");
  }

  /**
   * Either:
   *   FALDO "Region" instance replacement for a feature"s start, stop, strand properties.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0021)
   * Or:
   *   FALDO "Region" instance replacement for a breakpoint"s start, stop, strand properties.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0079)
   * Or:
   *   FALDO "Region" instance replacement for a target"s start, stop, strand  properties.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0090)
   */
  public static Set<Resource> region() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0021"), _namespace_GVF1O("GVF1_0079"), _namespace_GVF1O("GVF1_0090") }));
  }

  /**
   * NCBI Taxonomy Ontology "NCBITaxon_1" (or sub-classes) instance that denotes the species for a feature set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0023)
   */
  public static Resource species() {
    return _namespace_GVF1O("GVF1_0023");
  }

  /**
   * Specific information about the variant(s) of a feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0034)
   */
  public static Resource variant() {
    return _namespace_GVF1O("GVF1_0034");
  }

  /**
   * Links to information about an individual.
   * (http://www.biointerchange.org/gvf1o#GVF1_0036)
   */
  public static Resource individual() {
    return _namespace_GVF1O("GVF1_0036");
  }

  /**
   * Zygosity of a variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0038)
   */
  public static Resource zygosity() {
    return _namespace_GVF1O("GVF1_0038");
  }

  /**
   * An effect of a particular feature variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0041)
   */
  public static Resource effect() {
    return _namespace_GVF1O("GVF1_0041");
  }

  /**
   * Effect of a sequence alteration on a sequence feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0042)
   */
  public static Resource sequence_variant() {
    return _namespace_GVF1O("GVF1_0042");
  }

  /**
   * A term that is describing the sequence feature that is being affected.
   * (http://www.biointerchange.org/gvf1o#GVF1_0043)
   */
  public static Resource feature_type() {
    return _namespace_GVF1O("GVF1_0043");
  }

  /**
   * A coordinate range for ambiguous start coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0046)
   */
  public static Resource start_range() {
    return _namespace_GVF1O("GVF1_0046");
  }

  /**
   * A coordinate range for ambiguous start coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0047)
   */
  public static Resource end_range() {
    return _namespace_GVF1O("GVF1_0047");
  }

  /**
   * Denotes abstract chromosome representations for capturing variants that appear on the same chromosome of a polyploid organism.
   * (http://www.biointerchange.org/gvf1o#GVF1_0051)
   */
  public static Resource chromosome() {
    return _namespace_GVF1O("GVF1_0051");
  }

  /**
   * Determines the genotype as observed in an individual.
   * (http://www.biointerchange.org/gvf1o#GVF1_0053)
   */
  public static Resource genotype() {
    return _namespace_GVF1O("GVF1_0053");
  }

  /**
   * Either:
   *   Properties that are directly associated with Feature class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0066)
   * Or:
   *   Properties that are directly associated with Feature class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0059)
   */
  public static Set<Resource> feature_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0066"), _namespace_GVF1O("GVF1_0059") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with SequencedIndividual class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0067)
   * Or:
   *   Properties that are directly associated with SequencedIndividual class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0065)
   */
  public static Set<Resource> sequencedindividual_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0067"), _namespace_GVF1O("GVF1_0065") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with Set class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0068)
   * Or:
   *   Properties that are directly associated with Set class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0063)
   */
  public static Set<Resource> set_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0068"), _namespace_GVF1O("GVF1_0063") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with Variant class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0069)
   * Or:
   *   Properties that are directly associated with Variant class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0060)
   */
  public static Set<Resource> variant_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0069"), _namespace_GVF1O("GVF1_0060") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with Effect class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0070)
   * Or:
   *   Properties that are directly associated with Effect class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0158)
   */
  public static Set<Resource> effect_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0070"), _namespace_GVF1O("GVF1_0158") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with Breakpoint class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0075)
   * Or:
   *   Properties that are directly associated with Breakpoint class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0071)
   */
  public static Set<Resource> breakpoint_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0075"), _namespace_GVF1O("GVF1_0071") }));
  }

  /**
   * Either:
   *   A database cross-reference to associate a sequence alteration to its representation in another database.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0078)
   * Or:
   *   A database cross-reference to associate a structured pragma to a representation in another database.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0104)
   */
  public static Set<Resource> dbxref() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0078"), _namespace_GVF1O("GVF1_0104") }));
  }

  /**
   * Potential source or destination of zero-length sequence alterations.
   * (http://www.biointerchange.org/gvf1o#GVF1_0080)
   */
  public static Resource breakpoint() {
    return _namespace_GVF1O("GVF1_0080");
  }

  /**
   * Either:
   *   Properties that are directly associated with Target class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0089)
   * Or:
   *   Properties that are directly associated with Target class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0092)
   */
  public static Set<Resource> target_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0089"), _namespace_GVF1O("GVF1_0092") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with TechnologyPlatform class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0102)
   * Or:
   *   Properties that are directly associated with TechnologyPlatform class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0107)
   */
  public static Set<Resource> technologyplatform_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0102"), _namespace_GVF1O("GVF1_0107") }));
  }

  /**
   * Properties that are directly associated with DataSource class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0103)
   */
  public static Resource datasource_properties() {
    return _namespace_GVF1O("GVF1_0103");
  }

  /**
   * Either:
   *   Properties describing structured pragma properties.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0112)
   * Or:
   *   Properties describing structured pragma properties.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0113)
   */
  public static Set<Resource> structuredpragma_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0112"), _namespace_GVF1O("GVF1_0113") }));
  }

  /**
   * Types of reads produced by the platform.
   * (http://www.biointerchange.org/gvf1o#GVF1_0119)
   */
  public static Resource read_type() {
    return _namespace_GVF1O("GVF1_0119");
  }

  /**
   * Datatype of this data source.
   * (http://www.biointerchange.org/gvf1o#GVF1_0120)
   */
  public static Resource data_type() {
    return _namespace_GVF1O("GVF1_0120");
  }

  /**
   * Technology platform that was used to derive the feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0121)
   */
  public static Resource technology_platform() {
    return _namespace_GVF1O("GVF1_0121");
  }

  /**
   * Data source origin of the feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0122)
   */
  public static Resource data_source() {
    return _namespace_GVF1O("GVF1_0122");
  }

  /**
   * Used scoring method.
   * (http://www.biointerchange.org/gvf1o#GVF1_0123)
   */
  public static Resource score_method() {
    return _namespace_GVF1O("GVF1_0123");
  }

  /**
   * Further information about the algorithm/methodologies used.
   * (http://www.biointerchange.org/gvf1o#GVF1_0124)
   */
  public static Resource source_method() {
    return _namespace_GVF1O("GVF1_0124");
  }

  /**
   * Further information about an individual"s phenotype. Applies only to single individual sets.
   * (http://www.biointerchange.org/gvf1o#GVF1_0125)
   */
  public static Resource phenotype_description() {
    return _namespace_GVF1O("GVF1_0125");
  }

  /**
   * Either:
   *   Further information about the associated attribute(s).
   *   (http://www.biointerchange.org/gvf1o#GVF1_0126)
   * Or:
   *   Further information about the associated attribute(s).
   *   (http://www.biointerchange.org/gvf1o#GVF1_0127)
   * Or:
   *   Further information about the associated attribute(s).
   *   (http://www.biointerchange.org/gvf1o#GVF1_0129)
   * Or:
   *   Further information about the associated attribute(s).
   *   (http://www.biointerchange.org/gvf1o#GVF1_0130)
   * Or:
   *   Further information about the associated attribute(s).
   *   (http://www.biointerchange.org/gvf1o#GVF1_0131)
   */
  public static Set<Resource> attribute_method() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0126"), _namespace_GVF1O("GVF1_0127"), _namespace_GVF1O("GVF1_0129"), _namespace_GVF1O("GVF1_0130"), _namespace_GVF1O("GVF1_0131") }));
  }

  /**
   * Either:
   *   Properties about Attribute instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0128)
   * Or:
   *   Properties that are directly associated with Attribute class instances.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0064)
   */
  public static Set<Resource> attribute_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0128"), _namespace_GVF1O("GVF1_0064") }));
  }

  /**
   * Denotes the sex of the sequenced individual for single-individual sets.
   * (http://www.biointerchange.org/gvf1o#GVF1_0147)
   */
  public static Resource sex() {
    return _namespace_GVF1O("GVF1_0147");
  }

  /**
   * Denotes the source of genomic data (on a cell-type level).
   * (http://www.biointerchange.org/gvf1o#GVF1_0148)
   */
  public static Resource genomic_source() {
    return _namespace_GVF1O("GVF1_0148");
  }

  /**
   * Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
   * (http://www.biointerchange.org/gvf1o#GVF1_0150)
   */
  public static Resource feature_ontology() {
    return _namespace_GVF1O("GVF1_0150");
  }

  /**
   * Identifies the target that the features aligns to.
   * (http://www.biointerchange.org/gvf1o#GVF1_0155)
   */
  public static Resource target() {
    return _namespace_GVF1O("GVF1_0155");
  }

  /**
   * A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
   * (http://www.biointerchange.org/gvf1o#GVF1_0005)
   */
  public static Resource source() {
    return _namespace_GVF1O("GVF1_0005");
  }

  /**
   * Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
   * (http://www.biointerchange.org/gvf1o#GVF1_0006)
   */
  public static Resource type() {
    return _namespace_GVF1O("GVF1_0006");
  }

  /**
   * Either:
   *   Start coordinate of the feature on the seqid landmark.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0007)
   * Or:
   *   A coordinate that defines the start of an ambiguous coordinate range.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0048)
   * Or:
   *   Start coordinate of the feature on the seqid landmark.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0073)
   * Or:
   *   Start coordinate of the target.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0094)
   * Or:
   *   Genomic start coordinate of the landmark.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0138)
   */
  public static Set<Resource> start() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0007"), _namespace_GVF1O("GVF1_0048"), _namespace_GVF1O("GVF1_0073"), _namespace_GVF1O("GVF1_0094"), _namespace_GVF1O("GVF1_0138") }));
  }

  /**
   * Either:
   *   End coordinate of the feature on the seqid landmark.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0008)
   * Or:
   *   A coordinate that defines the end of an ambiguous coordinate range.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0049)
   * Or:
   *   End coordinate of the feature on the seqid landmark.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0074)
   * Or:
   *   End coordinate of the target.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0095)
   * Or:
   *   Genomic end coordinate of the landmark.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0139)
   */
  public static Set<Resource> end() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0008"), _namespace_GVF1O("GVF1_0049"), _namespace_GVF1O("GVF1_0074"), _namespace_GVF1O("GVF1_0095"), _namespace_GVF1O("GVF1_0139") }));
  }

  /**
   * Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
   * (http://www.biointerchange.org/gvf1o#GVF1_0009)
   */
  public static Resource score() {
    return _namespace_GVF1O("GVF1_0009");
  }

  /**
   * Either:
   *   Tag name of a feature attribute.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0013)
   * Or:
   *   Tag name of an user defined structured attribute.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0154)
   */
  public static Set<Resource> tag() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0013"), _namespace_GVF1O("GVF1_0154") }));
  }

  /**
   * Version of the GVF specification that defines the feature set contents.
   * (http://www.biointerchange.org/gvf1o#GVF1_0022)
   */
  public static Resource gvf_version() {
    return _namespace_GVF1O("GVF1_0022");
  }

  /**
   * Name of a genome assembly build that denotes the provenance of features in a feature set. For example, "NCBI 36" or "FlyBase r4.1".
   * (http://www.biointerchange.org/gvf1o#GVF1_0024)
   */
  public static Resource build() {
    return _namespace_GVF1O("GVF1_0024");
  }

  /**
   * All sequence variations at a locus -- including the reference sequence when appropriate (for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0025)
   */
  public static Resource variant_seq() {
    return _namespace_GVF1O("GVF1_0025");
  }

  /**
   * Either:
   *   A unique identifier for the feature within the feature set.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0026)
   * Or:
   *   ID that uniquely establishes the Landmark"s identity within a Set.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0137)
   */
  public static Set<Resource> id() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0026"), _namespace_GVF1O("GVF1_0137") }));
  }

  /**
   * Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (e.g. dbSNP, OMIM) which should use the dbxref property.
   * (http://www.biointerchange.org/gvf1o#GVF1_0027)
   */
  public static Resource alias() {
    return _namespace_GVF1O("GVF1_0027");
  }

  /**
   * Sequence from the reference genome.
   * (http://www.biointerchange.org/gvf1o#GVF1_0031)
   */
  public static Resource reference_seq() {
    return _namespace_GVF1O("GVF1_0031");
  }

  /**
   * Number of reads that are supporting this variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0032)
   */
  public static Resource variant_reads() {
    return _namespace_GVF1O("GVF1_0032");
  }

  /**
   * Total number of reads.
   * (http://www.biointerchange.org/gvf1o#GVF1_0037)
   */
  public static Resource total_reads() {
    return _namespace_GVF1O("GVF1_0037");
  }

  /**
   * Frequency of a variant in a population.
   * (http://www.biointerchange.org/gvf1o#GVF1_0039)
   */
  public static Resource variant_freq() {
    return _namespace_GVF1O("GVF1_0039");
  }

  /**
   * Features that are affected by this sequence alteration effect. This can be an external feature identifier, such as an Ensembl gene/transcript identifier.
   * (http://www.biointerchange.org/gvf1o#GVF1_0044)
   */
  public static Resource feature() {
    return _namespace_GVF1O("GVF1_0044");
  }

  /**
   * Either:
   *   Unclear from GVF specification.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0050)
   * Or:
   *   Indicates whether this particular is phased. Used to encode ##phased-genotypes statements.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0101)
   */
  public static Set<Resource> phased() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0050"), _namespace_GVF1O("GVF1_0101") }));
  }

  /**
   * Describes the codon that overlaps this variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0054)
   */
  public static Resource variant_codon() {
    return _namespace_GVF1O("GVF1_0054");
  }

  /**
   * Describes the codon from the reference sequence whose coordinates overlap with this variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0055)
   */
  public static Resource reference_codon() {
    return _namespace_GVF1O("GVF1_0055");
  }

  /**
   * Amino acid that overlaps with the variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0056)
   */
  public static Resource variant_aa() {
    return _namespace_GVF1O("GVF1_0056");
  }

  /**
   * Amino acid in the reference genome that overlaps with a variant"s genome coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0057)
   */
  public static Resource reference_aa() {
    return _namespace_GVF1O("GVF1_0057");
  }

  /**
   * Properties that are directly associated with Range class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0061)
   */
  public static Resource range_properties() {
    return _namespace_GVF1O("GVF1_0061");
  }

  /**
   * Sequence context (positive strand) of a feature on the 5" end.
   * (http://www.biointerchange.org/gvf1o#GVF1_0076)
   */
  public static Resource a_context() {
    return _namespace_GVF1O("GVF1_0076");
  }

  /**
   * Version of the GFF specification that defines the feature set contents apart from GVF related definitions.
   * (http://www.biointerchange.org/gvf1o#GVF1_0081)
   */
  public static Resource gff_version() {
    return _namespace_GVF1O("GVF1_0081");
  }

  /**
   * Creation date of the GVF file that this set stems from.
   * (http://www.biointerchange.org/gvf1o#GVF1_0082)
   */
  public static Resource file_date() {
    return _namespace_GVF1O("GVF1_0082");
  }

  /**
   * ID or accession of the target alignment.
   * (http://www.biointerchange.org/gvf1o#GVF1_0093)
   */
  public static Resource target_id() {
    return _namespace_GVF1O("GVF1_0093");
  }

  /**
   * A cross-reference to an ontology term that is associated with a feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0096)
   */
  public static Resource ontology_term() {
    return _namespace_GVF1O("GVF1_0096");
  }

  /**
   * An arbitrary comment. Free text.
   * (http://www.biointerchange.org/gvf1o#GVF1_0105)
   */
  public static Resource comment() {
    return _namespace_GVF1O("GVF1_0105");
  }

  /**
   * Type of technology used to gather the variant data. Unrestricted range due to open specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0106)
   */
  public static Resource platform_class() {
    return _namespace_GVF1O("GVF1_0106");
  }

  /**
   * Sequencer or other machine used to collect the variant data. Unrestricted range due to open specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0108)
   */
  public static Resource platform_name() {
    return _namespace_GVF1O("GVF1_0108");
  }

  /**
   * Undocumented in GVF specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0132)
   */
  public static Resource read_length() {
    return _namespace_GVF1O("GVF1_0132");
  }

  /**
   * Undocumented in GVF specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0133)
   */
  public static Resource read_pair_span() {
    return _namespace_GVF1O("GVF1_0133");
  }

  /**
   * Undocumented in GVF specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0134)
   */
  public static Resource average_coverage() {
    return _namespace_GVF1O("GVF1_0134");
  }

  /**
   * Properties that are directly associated with Landmark class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0136)
   */
  public static Resource landmark_properties() {
    return _namespace_GVF1O("GVF1_0136");
  }

  /**
   * Version of the GVF file that this set stems from.
   * (http://www.biointerchange.org/gvf1o#GVF1_0149)
   */
  public static Resource file_version() {
    return _namespace_GVF1O("GVF1_0149");
  }

  /**
   * Properties that are directly associated with StructuredAttribute class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0153)
   */
  public static Resource structuredattribute_properties() {
    return _namespace_GVF1O("GVF1_0153");
  }

  /**
   * Either:
   *   Sequence associated with this feature, if it has been specified using a FASTA string.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0156)
   * Or:
   *   Sequence associated with this feature, if it has been specified using a FASTA string.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0157)
   */
  public static Set<Resource> sequence() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("GVF1_0156"), _namespace_GVF1O("GVF1_0157") }));
  }

  /**
   * Set of genomic sequence features, whose identifiers are unique within the set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0001)
   */
  public static Resource Set() {
    return _namespace_GVF1O("GVF1_0001");
  }

  /**
   * A genomic sequence feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0002)
   */
  public static Resource Feature() {
    return _namespace_GVF1O("GVF1_0002");
  }

  /**
   * Representation of attribute tag/value pairs that are not covered by specific classes such as Effect or Variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0003)
   */
  public static Resource Attribute() {
    return _namespace_GVF1O("GVF1_0003");
  }

  /**
   * Class describing a genomic strand. Instances of the class (individuals) are used to denote forward-/reverse-strands, etc.
   * (http://www.biointerchange.org/gvf1o#GVF1_0016)
   */
  public static Resource Strand() {
    return _namespace_GVF1O("GVF1_0016");
  }

  /**
   * Describing specific alterations of a feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0033)
   */
  public static Resource Variant() {
    return _namespace_GVF1O("GVF1_0033");
  }

  /**
   * Aggregated sequencing information for a particular individual.
   * (http://www.biointerchange.org/gvf1o#GVF1_0035)
   */
  public static Resource SequencedIndividual() {
    return _namespace_GVF1O("GVF1_0035");
  }

  /**
   * Describing the effect of a feature variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0040)
   */
  public static Resource Effect() {
    return _namespace_GVF1O("GVF1_0040");
  }

  /**
   * Describe ambiguity in either start or end coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0045)
   */
  public static Resource Range() {
    return _namespace_GVF1O("GVF1_0045");
  }

  /**
   * An abstract representation of a chromosome to represent ploidy.
   * (http://www.biointerchange.org/gvf1o#GVF1_0052)
   */
  public static Resource Chromosome() {
    return _namespace_GVF1O("GVF1_0052");
  }

  /**
   * Describes the source or destination of a zero-length sequence alteration.
   * (http://www.biointerchange.org/gvf1o#GVF1_0058)
   */
  public static Resource Breakpoint() {
    return _namespace_GVF1O("GVF1_0058");
  }

  /**
   * Denotes the zygosity of alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0084)
   */
  public static Resource Zygosity() {
    return _namespace_GVF1O("GVF1_0084");
  }

  /**
   * Indicates a feature"s "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
   * (http://www.biointerchange.org/gvf1o#GVF1_0088)
   */
  public static Resource Target() {
    return _namespace_GVF1O("GVF1_0088");
  }

  /**
   * Details about the sequencing/microarray technology used to gather the data in a set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0097)
   */
  public static Resource TechnologyPlatform() {
    return _namespace_GVF1O("GVF1_0097");
  }

  /**
   * Provides information about the source of the data. For example, it can link out to actual sequences associated with the Feature individuals in a Set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0098)
   */
  public static Resource DataSource() {
    return _namespace_GVF1O("GVF1_0098");
  }

  /**
   * Information about the used scoring algorithm or method.
   * (http://www.biointerchange.org/gvf1o#GVF1_0099)
   */
  public static Resource Method() {
    return _namespace_GVF1O("GVF1_0099");
  }

  /**
   * Additional information about an individual"s phenotype.
   * (http://www.biointerchange.org/gvf1o#GVF1_0100)
   */
  public static Resource PhenotypeDescription() {
    return _namespace_GVF1O("GVF1_0100");
  }

  /**
   * Type of reads obtained for a given technology platform.
   * (http://www.biointerchange.org/gvf1o#GVF1_0109)
   */
  public static Resource ReadType() {
    return _namespace_GVF1O("GVF1_0109");
  }

  /**
   * Determines the datatype of a variant sequence.
   * (http://www.biointerchange.org/gvf1o#GVF1_0114)
   */
  public static Resource DataType() {
    return _namespace_GVF1O("GVF1_0114");
  }

  /**
   * A landmark that establishes the coordinate system for features.
   * (http://www.biointerchange.org/gvf1o#GVF1_0135)
   */
  public static Resource Landmark() {
    return _namespace_GVF1O("GVF1_0135");
  }

  /**
   * For single individual sets, the Sex class" OWL-individuals can be used to specify the sex of the sequenced (real-life) individuals.
   * (http://www.biointerchange.org/gvf1o#GVF1_0140)
   */
  public static Resource Sex() {
    return _namespace_GVF1O("GVF1_0140");
  }

  /**
   * An enumerated class for determining the genomic source (cell type) of sequenced data.
   * (http://www.biointerchange.org/gvf1o#GVF1_0141)
   */
  public static Resource GenomicSource() {
    return _namespace_GVF1O("GVF1_0141");
  }

  /**
   * Representation of attribute tag/value pairs that are specific to particular structured attributes, but which are not covered by the GVF specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0151)
   */
  public static Resource StructuredAttribute() {
    return _namespace_GVF1O("GVF1_0151");
  }

  /**
   * Location on the positive (forward) strand.
   * (http://www.biointerchange.org/gvf1o#GVF1_0017)
   */
  public static Resource Positive() {
    return _namespace_GVF1O("GVF1_0017");
  }

  /**
   * Location on the negative (reverse) strand.
   * (http://www.biointerchange.org/gvf1o#GVF1_0018)
   */
  public static Resource Negative() {
    return _namespace_GVF1O("GVF1_0018");
  }

  /**
   * Strand was not determined, which leaves it open whether the location is on the positive (forward) or negative (reverse) strand.
   * (http://www.biointerchange.org/gvf1o#GVF1_0019)
   */
  public static Resource UnknownStrand() {
    return _namespace_GVF1O("GVF1_0019");
  }

  /**
   * Strand is not applicable.
   * (http://www.biointerchange.org/gvf1o#GVF1_0020)
   */
  public static Resource NotStranded() {
    return _namespace_GVF1O("GVF1_0020");
  }

  /**
   * Denotes heterozygous alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0085)
   */
  public static Resource Heterozygous() {
    return _namespace_GVF1O("GVF1_0085");
  }

  /**
   * Denotes homozygous alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0086)
   */
  public static Resource Homozygous() {
    return _namespace_GVF1O("GVF1_0086");
  }

  /**
   * Denotes hemizygous alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0087)
   */
  public static Resource Hemizygous() {
    return _namespace_GVF1O("GVF1_0087");
  }

  /**
   * Denotes reads that are fragments.
   * (http://www.biointerchange.org/gvf1o#GVF1_0110)
   */
  public static Resource Fragment() {
    return _namespace_GVF1O("GVF1_0110");
  }

  /**
   * Denotes reads that are pairs.
   * (http://www.biointerchange.org/gvf1o#GVF1_0111)
   */
  public static Resource Pair() {
    return _namespace_GVF1O("GVF1_0111");
  }

  /**
   * Denotes a DNA sequence.
   * (http://www.biointerchange.org/gvf1o#GVF1_0115)
   */
  public static Resource DNASequence() {
    return _namespace_GVF1O("GVF1_0115");
  }

  /**
   * Denotes an RNA sequence.
   * (http://www.biointerchange.org/gvf1o#GVF1_0116)
   */
  public static Resource RNASequence() {
    return _namespace_GVF1O("GVF1_0116");
  }

  /**
   * Denotes a DNA microarray probe.
   * (http://www.biointerchange.org/gvf1o#GVF1_0117)
   */
  public static Resource DNAMicroarray() {
    return _namespace_GVF1O("GVF1_0117");
  }

  /**
   * Denotes an array-comparative genomic hybridization.
   * (http://www.biointerchange.org/gvf1o#GVF1_0118)
   */
  public static Resource ArrayComparativeGenomicHybridization() {
    return _namespace_GVF1O("GVF1_0118");
  }

  /**
   * Denotes that a Set contains features of a female.
   * (http://www.biointerchange.org/gvf1o#GVF1_0142)
   */
  public static Resource Female() {
    return _namespace_GVF1O("GVF1_0142");
  }

  /**
   * Denotes that a Set contains features of a male.
   * (http://www.biointerchange.org/gvf1o#GVF1_0143)
   */
  public static Resource Male() {
    return _namespace_GVF1O("GVF1_0143");
  }

  /**
   * Denotes that a set contains features of prenatal cells.
   * (http://www.biointerchange.org/gvf1o#GVF1_0144)
   */
  public static Resource Prenatal() {
    return _namespace_GVF1O("GVF1_0144");
  }

  /**
   * Denotes that a set contains features of germline cells.
   * (http://www.biointerchange.org/gvf1o#GVF1_0145)
   */
  public static Resource Germline() {
    return _namespace_GVF1O("GVF1_0145");
  }

  /**
   * Denotes that a set contains features of somatic cells.
   * (http://www.biointerchange.org/gvf1o#GVF1_0146)
   */
  public static Resource Somatic() {
    return _namespace_GVF1O("GVF1_0146");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri.equals(_namespace_GVF1O("GVF1_0004"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0010"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0012"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0014"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0015"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0021"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0023"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0034"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0036"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0038"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0041"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0042"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0043"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0046"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0047"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0051"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0053"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0066"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0067"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0068"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0069"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0070"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0072"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0075"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0078"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0079"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0080"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0083"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0089"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0090"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0091"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0102"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0103"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0104"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0112"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0119"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0120"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0121"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0122"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0123"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0124"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0125"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0126"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0127"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0128"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0129"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0130"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0131"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0147"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0148"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0150"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0152"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0155"))) {
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
    if (uri.equals(_namespace_GVF1O("GVF1_0005"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0006"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0007"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0008"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0009"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0013"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0022"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0024"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0025"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0026"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0027"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0031"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0032"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0037"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0039"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0044"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0048"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0049"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0050"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0054"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0055"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0056"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0057"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0059"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0060"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0061"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0063"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0064"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0065"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0071"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0073"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0074"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0076"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0077"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0081"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0082"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0092"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0093"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0094"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0095"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0096"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0101"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0105"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0106"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0107"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0108"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0113"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0132"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0133"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0134"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0136"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0137"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0138"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0139"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0149"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0153"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0154"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0156"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0157"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0158"))) {
      return true;
    }
    return false;
  }

  /**
   * Determines whether the given URI is a class.
   * 
   * @param uri URI that is tested for being a class
   */
  public static boolean isClass(Resource uri) {
    if (uri.equals(_namespace_GVF1O("GVF1_0001"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0002"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0003"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0016"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0033"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0035"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0040"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0045"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0052"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0058"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0084"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0088"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0097"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0098"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0099"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0100"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0109"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0114"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0135"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0140"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0141"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0151"))) {
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
    if (uri.equals(_namespace_GVF1O("GVF1_0017"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0018"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0019"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0020"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0085"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0086"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0087"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0110"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0111"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0115"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0116"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0117"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0118"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0142"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0143"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0144"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0145"))) {
      return true;
    }
    if (uri.equals(_namespace_GVF1O("GVF1_0146"))) {
      return true;
    }
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
      if (__parent_properties.get(uri).equals(parent)) {
        return true;
      }
      return hasParent((Resource)__parent_properties.get(uri), parent);
    }
    return false;
  }

  private static Resource _namespace_GVF1O(String accession) {
    return ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#" + accession);
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();

    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0004"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0010"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0012"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0014"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0015"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0068"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0021"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0023"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0068"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0034"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0036"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0038"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0069"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0041"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0069"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0042"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0070"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0043"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0070"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0046"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0070"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0047"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0070"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0051"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0067"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0053"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0069"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0072"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0075"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0078"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0079"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0075"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0080"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0083"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0075"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0090"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0089"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0091"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0089"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0102"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0112"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0103"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0112"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0104"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0112"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0119"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0102"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0120"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0103"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0121"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0122"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0123"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0124"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0125"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0068"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0126"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0070"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0127"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0075"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0129"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0128"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0130"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0089"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0131"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0069"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0147"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0068"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0148"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0068"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0150"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0068"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0152"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0112"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0155"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0066"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0005"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0006"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0007"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0008"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0009"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0013"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0064"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0022"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0063"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0024"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0063"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0025"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0060"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0026"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0027"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0031"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0032"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0060"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0037"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0065"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0039"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0060"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0044"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0158"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0048"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0061"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0049"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0061"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0050"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0060"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0054"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0060"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0055"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0056"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0060"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0057"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0073"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0071"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0074"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0071"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0076"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0077"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0081"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0063"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0082"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0063"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0093"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0092"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0094"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0092"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0095"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0092"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0096"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0101"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0105"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0113"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0106"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0107"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0107"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0113"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0108"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0107"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0132"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0107"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0133"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0107"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0134"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0107"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0137"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0136"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0138"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0136"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0139"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0136"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0149"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0063"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0154"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0153"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0156"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0059"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0157"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0136"));
    map.put(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0088"), ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#GVF1_0151"));

    return map;
  }


}

