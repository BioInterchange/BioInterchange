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


public class FALDO {

  /**
   * This denotes that a feature is in between two other positions that are both known exactly and next to eaxh other. An example is an restriction enzyme cutting site. The cut is after one nucleotide and before the next i.e. in between
   * (http://biohackathon.org/resource/faldo#InBetweenPosition)
   */
  public static Resource In_between_positions() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#InBetweenPosition");
  }

  /**
   * Superclass to group the general concept of a position on a sequence. The sequence is designated via the reference predicate.
   * (http://biohackathon.org/resource/faldo#Position)
   */
  public static Resource Position() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#Position");
  }

  /**
   * Use when you exactly know the position.
   * (http://biohackathon.org/resource/faldo#ExactPosition)
   */
  public static Resource Exact_position() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#ExactPosition");
  }

  /**
   * The position must be one of the more detailed Positions listed by the location predicate.
   * (http://biohackathon.org/resource/faldo#OneOfPosition)
   */
  public static Resource One_of_positions() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#OneOfPosition");
  }

  /**
   * Use when you have an idea of the range in which you can find the position but can not be sure.
   * (http://biohackathon.org/resource/faldo#InRangePosition)
   */
  public static Resource Indeterminate_position_within_a_range() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#InRangePosition");
  }

  /**
   * Part of the coordinate system is on which strand the feature can be found. If you do not yet know which stand the feature is on you should tag the position with just this class. If you know more you should use one of the subclasses. This means a region descibred with a "." in GFF3. An GFF3 Unstranded position does not have this type in FALDO those are just a Position.
   * (http://biohackathon.org/resource/faldo#StrandedPosition)
   */
  public static Resource Stranded_position() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#StrandedPosition");
  }

  /**
   * Use this class to indicate that you lack exact position data.
   * (http://biohackathon.org/resource/faldo#FuzzyPosition)
   */
  public static Resource Fuzzy_position() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#FuzzyPosition");
  }

  /**
   * The position is on the forward (positive) strand. Shown as a "+" in GFF3 and GTF
   * (http://biohackathon.org/resource/faldo#ForwardStrandPosition)
   */
  public static Resource Positive_strand() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#ForwardStrandPosition");
  }

  /**
   * The both strands position mean that the region spans both strands instead of one. In GGF3 displayed as 0. This does not mean that the position is one or the other strand but is best described as being on both.
   * (http://biohackathon.org/resource/faldo#BothStrandsPosition)
   */
  public static Resource Both_strands() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#BothStrandsPosition");
  }

  /**
   * The position is on the reverse (complement) strand of the sequence. Shown as "-" in GTF and GFF3
   * (http://biohackathon.org/resource/faldo#ReverseStrandPosition)
   */
  public static Resource Negative_strand() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#ReverseStrandPosition");
  }

  /**
   * A region describes an length of sequence with a start and end position that represents a feature on a Sequence. i.e. a gene
   * (http://biohackathon.org/resource/faldo#Region)
   */
  public static Resource Region() {
    return _namespace_FALDO("http://biohackathon.org/resource/faldo#Region");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    return false;
  }

  /**
   * Determines whether the given URI is a datatype property.
   * 
   * @param uri URI that is tested for being a datatype property
   */
  public static boolean isDatatypeProperty(Resource uri) {
    return false;
  }

  /**
   * Determines whether the given URI is a class.
   * 
   * @param uri URI that is tested for being a class
   */
  public static boolean isClass(Resource uri) {
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#InBetweenPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#Position")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#ExactPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#OneOfPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#InRangePosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#StrandedPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#FuzzyPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#ForwardStrandPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#BothStrandsPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#ReverseStrandPosition")) {
      return true;
    }
    if (uri == _namespace_FALDO("http://biohackathon.org/resource/faldo#Region")) {
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

  private static Resource _namespace_FALDO(String accession) {
    if (isClass(ResourceFactory.createResource("http://biohackathon.org/resource/faldo#" + accession))) {
      return ResourceFactory.createResource("http://biohackathon.org/resource/faldo#" + accession);
    } else {
      return ResourceFactory.createProperty("http://biohackathon.org/resource/faldo#" + accession);
    }
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();


    return map;
  }


}

