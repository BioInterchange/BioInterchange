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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0010"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0083"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0091") }));
  }

  /**
   * Tag name/value pair attributes of a feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0012)
   */
  public static Resource attributes() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0012");
  }

  /**
   * Link out to the parent feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0014)
   */
  public static Resource parent() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0014");
  }

  /**
   * Relationship that describes which features belong to a feature set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0015)
   */
  public static Resource contains() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0015");
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0021"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0079"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0090") }));
  }

  /**
   * NCBI Taxonomy Ontology "NCBITaxon_1" (or sub-classes) instance that denotes the species for a feature set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0023)
   */
  public static Resource species() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0023");
  }

  /**
   * Specific information about the variant(s) of a feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0034)
   */
  public static Resource variant() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0034");
  }

  /**
   * Links to information about an individual.
   * (http://www.biointerchange.org/gvf1o#GVF1_0036)
   */
  public static Resource individual() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0036");
  }

  /**
   * Zygosity of a variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0038)
   */
  public static Resource zygosity() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0038");
  }

  /**
   * An effect of a particular feature variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0041)
   */
  public static Resource effect() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0041");
  }

  /**
   * Effect of a sequence alteration on a sequence feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0042)
   */
  public static Resource sequence_variant() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0042");
  }

  /**
   * A term that is describing the sequence feature that is being affected.
   * (http://www.biointerchange.org/gvf1o#GVF1_0043)
   */
  public static Resource feature_type() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0043");
  }

  /**
   * Features that are affected by this sequence alteration effect.
   * (http://www.biointerchange.org/gvf1o#GVF1_0044)
   */
  public static Resource feature_id() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0044");
  }

  /**
   * A coordinate range for ambiguous start coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0046)
   */
  public static Resource start_range() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0046");
  }

  /**
   * A coordinate range for ambiguous start coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0047)
   */
  public static Resource end_range() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0047");
  }

  /**
   * Denotes abstract chromosome representations for capturing variants that appear on the same chromosome of a polyploid organism.
   * (http://www.biointerchange.org/gvf1o#GVF1_0051)
   */
  public static Resource chromosome() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0051");
  }

  /**
   * Determines the genotype as observed in an individual.
   * (http://www.biointerchange.org/gvf1o#GVF1_0053)
   */
  public static Resource genotype() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0053");
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0066"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0059") }));
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0067"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0065") }));
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0068"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0063") }));
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0069"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0060") }));
  }

  /**
   * Properties that are directly associated with Effect class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0070)
   */
  public static Resource effect_properties() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0070");
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0075"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0071") }));
  }

  /**
   * A database cross-reference to associate a sequence alteration to its  representation in another database.
   * (http://www.biointerchange.org/gvf1o#GVF1_0078)
   */
  public static Resource dbxref() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0078");
  }

  /**
   * Potential source or destination of zero-length sequence alterations.
   * (http://www.biointerchange.org/gvf1o#GVF1_0080)
   */
  public static Resource breakpoint() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0080");
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
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0089"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0092") }));
  }

  /**
   * Either:
   *   ID of the landmark that establishes the coordinate system for a feature.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0004)
   * Or:
   *   ID of the landmark that establishes the coordinate system for a breakpoint.
   *   (http://www.biointerchange.org/gvf1o#GVF1_0072)
   */
  public static Set<Resource> seqid() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0004"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0072") }));
  }

  /**
   * A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
   * (http://www.biointerchange.org/gvf1o#GVF1_0005)
   */
  public static Resource source() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0005");
  }

  /**
   * Type of the feature, which is either a term from the "lite" version of the Sequence Ontology (SOFA), a term from the full Sequence Ontology (SO) that is a child of sequence_feature (SO:0000110), or a SOFA or SO accession number.
   * (http://www.biointerchange.org/gvf1o#GVF1_0006)
   */
  public static Resource type() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0006");
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
   */
  public static Set<Resource> start() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0007"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0048"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0073"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0094") }));
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
   */
  public static Set<Resource> end() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0008"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0049"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0074"), _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0095") }));
  }

  /**
   * Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
   * (http://www.biointerchange.org/gvf1o#GVF1_0009)
   */
  public static Resource score() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0009");
  }

  /**
   * Tag name of a feature attribute.
   * (http://www.biointerchange.org/gvf1o#GVF1_0013)
   */
  public static Resource tag() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0013");
  }

  /**
   * Version of the GVF specification that defines the feature set contents.
   * (http://www.biointerchange.org/gvf1o#GVF1_0022)
   */
  public static Resource gvf_version() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0022");
  }

  /**
   * Name of a genome assembly build that denotes the provenance of features in a feature set. For example, "NCBI 36" or "FlyBase r4.1".
   * (http://www.biointerchange.org/gvf1o#GVF1_0024)
   */
  public static Resource build() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0024");
  }

  /**
   * All sequence variations at a locus -- including the reference sequence when appropriate (for example, when the locus is heterozygous). If the feature is on the minus strand, then the sequence is the reverse-compliment of the reference genome for these coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0025)
   */
  public static Resource variant_seq() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0025");
  }

  /**
   * A unique identifier for the feature within the feature set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0026)
   */
  public static Resource id() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0026");
  }

  /**
   * Secondary name of a feature, which can be HGVS/ISCN nomenclature names, but not cross-references to databases (e.g. dbSNP, OMIM) which should use the dbxref property.
   * (http://www.biointerchange.org/gvf1o#GVF1_0027)
   */
  public static Resource alias() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0027");
  }

  /**
   * Name of an external database. For example, "dbSNP" or "OMIM".
   * (http://www.biointerchange.org/gvf1o#GVF1_0029)
   */
  public static Resource name() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0029");
  }

  /**
   * External database identifier. For example, for dbSNP, this identifier could be "rs3131969".
   * (http://www.biointerchange.org/gvf1o#GVF1_0030)
   */
  public static Resource xref() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0030");
  }

  /**
   * Sequence from the reference genome.
   * (http://www.biointerchange.org/gvf1o#GVF1_0031)
   */
  public static Resource reference_seq() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0031");
  }

  /**
   * Number of reads that are supporting this variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0032)
   */
  public static Resource variant_reads() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0032");
  }

  /**
   * Total number of reads.
   * (http://www.biointerchange.org/gvf1o#GVF1_0037)
   */
  public static Resource total_reads() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0037");
  }

  /**
   * Frequency of a variant in a population.
   * (http://www.biointerchange.org/gvf1o#GVF1_0039)
   */
  public static Resource variant_freq() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0039");
  }

  /**
   * Unclear from GVF specification.
   * (http://www.biointerchange.org/gvf1o#GVF1_0050)
   */
  public static Resource phased() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0050");
  }

  /**
   * Describes the codon that overlaps this variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0054)
   */
  public static Resource variant_codon() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0054");
  }

  /**
   * Describes the codon from the reference sequence whose coordinates overlap with this variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0055)
   */
  public static Resource reference_codon() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0055");
  }

  /**
   * Amino acid that overlaps with the variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0056)
   */
  public static Resource variant_aa() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0056");
  }

  /**
   * Amino acid in the reference genome that overlaps with a variant"s genome coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0057)
   */
  public static Resource reference_aa() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0057");
  }

  /**
   * Properties that are directly associated with Range class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0061)
   */
  public static Resource range_properties() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0061");
  }

  /**
   * Properties that are directly associated with DBXRef class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0062)
   */
  public static Resource dbxref_properties() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0062");
  }

  /**
   * Properties that are directly associated with Attribute class instances.
   * (http://www.biointerchange.org/gvf1o#GVF1_0064)
   */
  public static Resource attribute_properties() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0064");
  }

  /**
   * Sequence context (positive strand) of a feature on the 5" end.
   * (http://www.biointerchange.org/gvf1o#GVF1_0076)
   */
  public static Resource a_context() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0076");
  }

  /**
   * Version of the GFF specification that defines the feature set contents apart from GVF related definitions.
   * (http://www.biointerchange.org/gvf1o#GVF1_0081)
   */
  public static Resource gff_version() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0081");
  }

  /**
   * Creation date of the GVF file that this set stems from.
   * (http://www.biointerchange.org/gvf1o#GVF1_0082)
   */
  public static Resource file_date() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0082");
  }

  /**
   * ID or accession of the target alignment.
   * (http://www.biointerchange.org/gvf1o#GVF1_0093)
   */
  public static Resource target_id() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0093");
  }

  /**
   * Set of genomic sequence features, whose identifiers are unique within the set.
   * (http://www.biointerchange.org/gvf1o#GVF1_0001)
   */
  public static Resource Set() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0001");
  }

  /**
   * A genomic sequence feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0002)
   */
  public static Resource Feature() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0002");
  }

  public static Resource Attribute() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0003");
  }

  /**
   * Class describing a genomic strand. Instances of the class (individuals) are used to denote forward-/reverse-strands, etc.
   * (http://www.biointerchange.org/gvf1o#GVF1_0016)
   */
  public static Resource Strand() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0016");
  }

  /**
   * A class describing relationships between features and external databases.
   * (http://www.biointerchange.org/gvf1o#GVF1_0028)
   */
  public static Resource DBXRef() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0028");
  }

  /**
   * Describing specific alterations of a feature.
   * (http://www.biointerchange.org/gvf1o#GVF1_0033)
   */
  public static Resource Variant() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0033");
  }

  /**
   * Aggregated sequencing information for a particular individual.
   * (http://www.biointerchange.org/gvf1o#GVF1_0035)
   */
  public static Resource SequencedIndividual() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0035");
  }

  /**
   * Describing the effect of a feature variant.
   * (http://www.biointerchange.org/gvf1o#GVF1_0040)
   */
  public static Resource Effect() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0040");
  }

  /**
   * Describe ambiguity in either start or end coordinates.
   * (http://www.biointerchange.org/gvf1o#GVF1_0045)
   */
  public static Resource Range() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0045");
  }

  /**
   * An abstract representation of a chromosome to represent ploidy.
   * (http://www.biointerchange.org/gvf1o#GVF1_0052)
   */
  public static Resource Chromosome() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0052");
  }

  /**
   * Describes the source or destination of a zero-length sequence alteration.
   * (http://www.biointerchange.org/gvf1o#GVF1_0058)
   */
  public static Resource Breakpoint() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0058");
  }

  /**
   * Denotes the zygosity of alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0084)
   */
  public static Resource Zygosity() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0084");
  }

  /**
   * Indicates a feature"s "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
   * (http://www.biointerchange.org/gvf1o#GVF1_0088)
   */
  public static Resource Target() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0088");
  }

  /**
   * Location on the positive (forward) strand.
   * (http://www.biointerchange.org/gvf1o#GVF1_0017)
   */
  public static Resource Positive() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0017");
  }

  /**
   * Location on the negative (reverse) strand.
   * (http://www.biointerchange.org/gvf1o#GVF1_0018)
   */
  public static Resource Negative() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0018");
  }

  /**
   * Strand was not determined, which leaves it open whether the location is on the positive (forward) or negative (reverse) strand.
   * (http://www.biointerchange.org/gvf1o#GVF1_0019)
   */
  public static Resource UnknownStrand() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0019");
  }

  /**
   * Strand is not applicable.
   * (http://www.biointerchange.org/gvf1o#GVF1_0020)
   */
  public static Resource NotStranded() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0020");
  }

  /**
   * Denotes heterozygous alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0085)
   */
  public static Resource Heterozygous() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0085");
  }

  /**
   * Denotes homozygous alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0086)
   */
  public static Resource Homozygous() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0086");
  }

  /**
   * Denotes hemizygous alleles.
   * (http://www.biointerchange.org/gvf1o#GVF1_0087)
   */
  public static Resource Hemizygous() {
    return _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0087");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0010")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0012")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0014")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0015")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0021")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0023")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0034")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0036")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0038")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0041")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0042")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0043")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0044")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0046")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0047")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0051")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0053")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0066")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0067")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0068")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0069")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0070")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0075")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0078")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0079")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0080")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0083")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0089")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0090")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0091")) {
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
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0004")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0005")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0006")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0007")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0008")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0009")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0013")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0022")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0024")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0025")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0026")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0027")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0029")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0030")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0031")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0032")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0037")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0039")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0048")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0049")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0050")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0054")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0055")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0056")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0057")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0059")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0060")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0061")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0062")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0063")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0064")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0065")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0071")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0072")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0073")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0074")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0076")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0077")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0081")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0082")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0092")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0093")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0094")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0095")) {
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
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0001")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0002")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0003")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0016")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0028")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0033")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0035")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0040")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0045")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0052")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0058")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0084")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0088")) {
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
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0017")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0018")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0019")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0020")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0085")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0086")) {
      return true;
    }
    if (uri == _namespace_GVF1O("http://www.biointerchange.org/gvf1o#GVF1_0087")) {
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
      if (__parent_properties.get(uri) == parent) {
        return true;
      }
      return hasParent((Resource)__parent_properties.get(uri), parent);
    }
    return false;
  }

  private static Resource _namespace_GVF1O(String accession) {
    if (isClass(ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#" + accession))) {
      return ResourceFactory.createResource("http://www.biointerchange.org/gvf1o#" + accession);
    } else {
      return ResourceFactory.createProperty("http://www.biointerchange.org/gvf1o#" + accession);
    }
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();


    return map;
  }


}
