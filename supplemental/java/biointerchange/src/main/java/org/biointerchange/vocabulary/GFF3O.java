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

public class GFF3O {

  /**
   * Establishes the landmark (e.g. a chromosome) on which a feature is located.
   * (http://www.biointerchange.org/gff3o#GFF3_0004)
   */
  public static Resource seqid() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0004");
  }

  /**
   * Either:
   *   Strand of the feature.
   *   (http://www.biointerchange.org/gff3o#GFF3_0010)
   * Or:
   *   Strand of a target -- if applicable.
   *   (http://www.biointerchange.org/gff3o#GFF3_0045)
   */
  public static Set<Resource> strand() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0010"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0045") }));
  }

  /**
   * Tag name/value pair attributes of a feature that are not covered by object-/data-properties of the ontology. Tags that are represented as object-/data-properties are: ID, Name, Alias, Parent, Target, Gap, Derives_from, Dbxref, Ontology_term, Ontology_term, or Is_circular
   * (http://www.biointerchange.org/gff3o#GFF3_0012)
   */
  public static Resource attributes() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0012");
  }

  /**
   * Link out to the parent feature.
   * (http://www.biointerchange.org/gff3o#GFF3_0014)
   */
  public static Resource parent() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0014");
  }

  /**
   * Relationship that describes which features belong to a feature set.
   * (http://www.biointerchange.org/gff3o#GFF3_0015)
   */
  public static Resource contains() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0015");
  }

  /**
   * Either:
   *   FALDO "Region" instance replacement for a feature"s start, stop, strand properties.
   *   (http://www.biointerchange.org/gff3o#GFF3_0021)
   * Or:
   *   FALDO "Region" instance replacement for a target"s start, stop, strand  properties.
   *   (http://www.biointerchange.org/gff3o#GFF3_0050)
   */
  public static Set<Resource> region() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0021"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0050") }));
  }

  /**
   * NCBI Taxonomy Ontology "NCBITaxon_1" (or sub-classes) instance that denotes the species for a feature set.
   * (http://www.biointerchange.org/gff3o#GFF3_0023)
   */
  public static Resource species() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0023");
  }

  /**
   * Either:
   *   Properties that are directly associated with Set class instances.
   *   (http://www.biointerchange.org/gff3o#GFF3_0025)
   * Or:
   *   Properties that are directly associated with Set class instances.
   *   (http://www.biointerchange.org/gff3o#GFF3_0027)
   */
  public static Set<Resource> set_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0025"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0027") }));
  }

  /**
   * Either:
   *   Properties that are directly associated with Feature class instances.
   *   (http://www.biointerchange.org/gff3o#GFF3_0026)
   * Or:
   *   Properties that are directly associated with Feature class instances.
   *   (http://www.biointerchange.org/gff3o#GFF3_0028)
   */
  public static Set<Resource> feature_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0026"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0028") }));
  }

  /**
   * Identifies the target that the features aligns to.
   * (http://www.biointerchange.org/gff3o#GFF3_0039)
   */
  public static Resource target() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0039");
  }

  /**
   * Either:
   *   Properties that are directly associated with Target class instances.
   *   (http://www.biointerchange.org/gff3o#GFF3_0044)
   * Or:
   *   Properties that are directly associated with Target class instances.
   *   (http://www.biointerchange.org/gff3o#GFF3_0040)
   */
  public static Set<Resource> target_properties() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0044"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0040") }));
  }

  /**
   * Describes a temporal relationship between two features, where the object denotes the subjects origin.
   * (http://www.biointerchange.org/gff3o#GFF3_0047)
   */
  public static Resource derives_from() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0047");
  }

  /**
   * Explicit link-out to one or more ontologies that have been used for describing features. This is a meta comment about the URIs that link out to SO/SOFA or other ontologies.
   * (http://www.biointerchange.org/gff3o#GFF3_0056)
   */
  public static Resource feature_ontology() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0056");
  }

  /**
   * A free text qualifier that describes the algorithm or operating procedure that generated this feature.  For example, the name of the software that generated this feature or a database name.
   * (http://www.biointerchange.org/gff3o#GFF3_0005)
   */
  public static Resource source() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0005");
  }

  /**
   * Type of the feature, which is either an entry the "lite" version of the Sequence Ontology (SOFA) or a child entry of sequence_feature (SO:0000110) of the full Sequence Ontology (SO).
   * (http://www.biointerchange.org/gff3o#GFF3_0006)
   */
  public static Resource type() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0006");
  }

  /**
   * Either:
   *   Start coordinate of the feature on the seqid landmark.
   *   (http://www.biointerchange.org/gff3o#GFF3_0007)
   * Or:
   *   Start coordinate of the target.
   *   (http://www.biointerchange.org/gff3o#GFF3_0042)
   * Or:
   *   Genomic start coordinate of the landmark.
   *   (http://www.biointerchange.org/gff3o#GFF3_0054)
   */
  public static Set<Resource> start() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0007"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0042"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0054") }));
  }

  /**
   * Either:
   *   End coordinate of the feature on the seqid landmark.
   *   (http://www.biointerchange.org/gff3o#GFF3_0008)
   * Or:
   *   End coordinate of the target.
   *   (http://www.biointerchange.org/gff3o#GFF3_0043)
   * Or:
   *   Genomic end coordinate of the landmark.
   *   (http://www.biointerchange.org/gff3o#GFF3_0055)
   */
  public static Set<Resource> end() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0008"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0043"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0055") }));
  }

  /**
   * Score of the feature. For example, an E-value for sequence similarity features or a P-value for ab initio gene prediction features.
   * (http://www.biointerchange.org/gff3o#GFF3_0009)
   */
  public static Resource score() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0009");
  }

  /**
   * Phase for "CDS" features. It indicates where the feature begins with reference to the reading frame. For forward strand features, phase is counted from the start field, whilst for reverse strand features, phase is counted from the end field.
   * (http://www.biointerchange.org/gff3o#GFF3_0011)
   */
  public static Resource phase() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0011");
  }

  /**
   * Tag name of a feature attribute.
   * (http://www.biointerchange.org/gff3o#GFF3_0013)
   */
  public static Resource tag() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0013");
  }

  /**
   * Version of the GFF3 specification that defines the feature set contents.
   * (http://www.biointerchange.org/gff3o#GFF3_0022)
   */
  public static Resource version() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0022");
  }

  /**
   * Name of a genome assembly build that denotes the provenance of features in a feature set. For example, "NCBI 36" or "FlyBase r4.1".
   * (http://www.biointerchange.org/gff3o#GFF3_0024)
   */
  public static Resource build() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0024");
  }

  /**
   * Properties that are directly associated with Attribute class instances.
   * (http://www.biointerchange.org/gff3o#GFF3_0029)
   */
  public static Resource attribute_properties() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0029");
  }

  /**
   * A database cross-reference to associate a sequence alteration to its representation in another database.
   * (http://www.biointerchange.org/gff3o#GFF3_0034)
   */
  public static Resource dbxref() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0034");
  }

  /**
   * A cross-reference to an ontology term that is associated with a feature.
   * (http://www.biointerchange.org/gff3o#GFF3_0035)
   */
  public static Resource ontology_term() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0035");
  }

  /**
   * Name of a feature, which can be used for display purposes. The name is not a unique property among features.
   * (http://www.biointerchange.org/gff3o#GFF3_0036)
   */
  public static Resource name() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0036");
  }

  /**
   * An alternative name for a feature. This can be another descriptive name of a feature, such as a locus name or accession number.
   * (http://www.biointerchange.org/gff3o#GFF3_0037)
   */
  public static Resource alias() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0037");
  }

  /**
   * ID or accession of the target alignment.
   * (http://www.biointerchange.org/gff3o#GFF3_0041)
   */
  public static Resource target_id() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0041");
  }

  /**
   * Gap describing the feature/target alignment if the sequences are not collinear. The formal description of this property has been lost due to a dead link in the GFF3 specification.
   * (http://www.biointerchange.org/gff3o#GFF3_0046)
   */
  public static Resource gap() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0046");
  }

  /**
   * A free text note.
   * (http://www.biointerchange.org/gff3o#GFF3_0048)
   */
  public static Resource note() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0048");
  }

  /**
   * Describes whether a feature is circular or not.
   * (http://www.biointerchange.org/gff3o#GFF3_0049)
   */
  public static Resource is_circular() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0049");
  }

  /**
   * Properties that are directly associated with Landmark class instances.
   * (http://www.biointerchange.org/gff3o#GFF3_0052)
   */
  public static Resource landmark_properties() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0052");
  }

  /**
   * ID that uniquely establishes the Landmark"s identity within a Set.
   * (http://www.biointerchange.org/gff3o#GFF3_0053)
   */
  public static Resource id() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0053");
  }

  /**
   * Either:
   *   Sequence associated with this feature, if it has been specified using a FASTA string.
   *   (http://www.biointerchange.org/gff3o#GFF3_0057)
   * Or:
   *   Sequence associated with this feature, if it has been specified using a FASTA string.
   *   (http://www.biointerchange.org/gff3o#GFF3_0058)
   */
  public static Set<Resource> sequence() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0057"), _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0058") }));
  }

  /**
   * Set of genomic sequence features, whose identifiers are unique within the set.
   * (http://www.biointerchange.org/gff3o#GFF3_0001)
   */
  public static Resource Set() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0001");
  }

  /**
   * A genomic sequence feature.
   * (http://www.biointerchange.org/gff3o#GFF3_0002)
   */
  public static Resource Feature() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0002");
  }

  /**
   * Describes additional feature attributes besides ID, Name, Alias, Parent, Target, Gap, Derives_from, Dbxref, Ontology_term, Ontology_term, or Is_circular.
   * (http://www.biointerchange.org/gff3o#GFF3_0003)
   */
  public static Resource Attribute() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0003");
  }

  /**
   * Class describing a genomic strand. Instances of the class (individuals) are used to denote forward-/reverse-strands, etc.
   * (http://www.biointerchange.org/gff3o#GFF3_0016)
   */
  public static Resource Strand() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0016");
  }

  /**
   * Indicates a feature"s "target" of a nucleotide-to-nucleotide or protein-to-nucleotide alignment.
   * (http://www.biointerchange.org/gff3o#GFF3_0038)
   */
  public static Resource Target() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0038");
  }

  /**
   * A landmark that establishes the coordinate system for features.
   * (http://www.biointerchange.org/gff3o#GFF3_0051)
   */
  public static Resource Landmark() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0051");
  }

  /**
   * Location on the positive (forward) strand.
   * (http://www.biointerchange.org/gff3o#GFF3_0017)
   */
  public static Resource Positive() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0017");
  }

  /**
   * Location on the negative (reverse) strand.
   * (http://www.biointerchange.org/gff3o#GFF3_0018)
   */
  public static Resource Negative() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0018");
  }

  /**
   * Strand was not determined, which leaves it open whether the location is on the positive (forward) or negative (reverse) strand.
   * (http://www.biointerchange.org/gff3o#GFF3_0019)
   */
  public static Resource UnknownStrand() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0019");
  }

  /**
   * Strand is not applicable.
   * (http://www.biointerchange.org/gff3o#GFF3_0020)
   */
  public static Resource NotStranded() {
    return _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0020");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0004")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0010")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0012")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0014")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0015")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0021")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0023")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0025")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0026")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0039")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0044")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0045")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0047")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0050")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0056")) {
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
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0005")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0006")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0007")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0008")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0009")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0011")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0013")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0022")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0024")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0027")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0028")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0029")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0034")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0035")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0036")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0037")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0040")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0041")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0042")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0043")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0046")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0048")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0049")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0052")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0053")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0054")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0055")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0057")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0058")) {
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
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0001")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0002")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0003")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0016")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0038")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0051")) {
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
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0017")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0018")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0019")) {
      return true;
    }
    if (uri == _namespace_GFF3O("http://www.biointerchange.org/gff3o#GFF3_0020")) {
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

  private static Resource _namespace_GFF3O(String accession) {
    if (isClass(ResourceFactory.createResource("http://www.biointerchange.org/gff3o#" + accession))) {
      return ResourceFactory.createResource("http://www.biointerchange.org/gff3o#" + accession);
    } else {
      return ResourceFactory.createProperty("http://www.biointerchange.org/gff3o#" + accession);
    }
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();


    return map;
  }


}
