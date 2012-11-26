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

public class SIO {

  /**
   * A is related to B iff there is some relation between A and B.
   * (http://semanticscience.org/resource/SIO_000001)
   */
  public static Resource is_related_to() {
    return _namespace_SIO("SIO_000001");
  }

  /**
   * has attribute is a relation between an entity and some attribute or property.
   * (http://semanticscience.org/resource/SIO_000008)
   */
  public static Resource has_attribute() {
    return _namespace_SIO("SIO_000008");
  }

  /**
   * is attribute of is a relation between an attribute and the entity that it is ascribed to
   * (http://semanticscience.org/resource/SIO_000011)
   */
  public static Resource is_attribute_of() {
    return _namespace_SIO("SIO_000011");
  }

  /**
   * denotes is a relation between an entity and what it is a sign or indication of, or what specifically means.
   * (http://semanticscience.org/resource/SIO_000020)
   */
  public static Resource denotes() {
    return _namespace_SIO("SIO_000020");
  }

  /**
   * has part is a transitive, reflexive and antisymmetric relation between a whole and itself or a whole and its part.
   * (http://semanticscience.org/resource/SIO_000028)
   */
  public static Resource has_part() {
    return _namespace_SIO("SIO_000028");
  }

  public static Resource is_time_boundary_of() {
    return _namespace_SIO("SIO_000029");
  }

  /**
   * has proper part is an antisymmetric, irreflexive (normally transitive) relation between a whole and a distinct part.
   * (http://semanticscience.org/resource/SIO_000053)
   */
  public static Resource has_proper_part() {
    return _namespace_SIO("SIO_000053");
  }

  /**
   * has boundary is a mereological relation between a whole and boundary located at its periphery.
   * (http://semanticscience.org/resource/SIO_000054)
   */
  public static Resource has_boundary() {
    return _namespace_SIO("SIO_000054");
  }

  /**
   * has member is a mereological relation between a collection and an item.
   * (http://semanticscience.org/resource/SIO_000059)
   */
  public static Resource has_member() {
    return _namespace_SIO("SIO_000059");
  }

  public static Resource is_denoted_by() {
    return _namespace_SIO("SIO_000060");
  }

  /**
   * A is located in B iff the spatial region occupied by A is part of the spatial region occupied by B. [T][R]
   * (http://semanticscience.org/resource/SIO_000061)
   */
  public static Resource is_located_in() {
    return _namespace_SIO("SIO_000061");
  }

  /**
   * is participant in is a relation that describes the participation of the subject in the (processual) object.
   * (http://semanticscience.org/resource/SIO_000062)
   */
  public static Resource is_participant_in() {
    return _namespace_SIO("SIO_000062");
  }

  /**
   * is agent in is a relation between an entity and a process, where the entity is present throughout the process, no permanent material change occurs, and is a causal participant in the process.
   * (http://semanticscience.org/resource/SIO_000063)
   */
  public static Resource is_agent_in() {
    return _namespace_SIO("SIO_000063");
  }

  /**
   * is provider of is a relation between a source and the entity it makes available.
   * (http://semanticscience.org/resource/SIO_000064)
   */
  public static Resource is_provider_of() {
    return _namespace_SIO("SIO_000064");
  }

  /**
   * is provided by is a relation between an entity and the entity that provides it.
   * (http://semanticscience.org/resource/SIO_000066)
   */
  public static Resource has_provider() {
    return _namespace_SIO("SIO_000066");
  }

  /**
   * is part of is a transitive, reflexive and anti-symmetric mereological relation between a whole and itself or a part and its whole.
   * (http://semanticscience.org/resource/SIO_000068)
   */
  public static Resource is_part_of() {
    return _namespace_SIO("SIO_000068");
  }

  /**
   * is proper part of is an asymmetric, irreflexive (normally transitive) relation between a part and its distinct whole.
   * (http://semanticscience.org/resource/SIO_000093)
   */
  public static Resource is_proper_part_of() {
    return _namespace_SIO("SIO_000093");
  }

  /**
   * is member of is a mereological relation between a item and a collection.
   * (http://semanticscience.org/resource/SIO_000095)
   */
  public static Resource is_member_of() {
    return _namespace_SIO("SIO_000095");
  }

  /**
   * is boundary of is a mereological relation between a boudnary located at the periphery of a whole.
   * (http://semanticscience.org/resource/SIO_000096)
   */
  public static Resource is_boundary_of() {
    return _namespace_SIO("SIO_000096");
  }

  /**
   * A is contained in B iff the spatial region occupied by A is part of the spatial region occupied by B and A is not part of B. [T]
   * (http://semanticscience.org/resource/SIO_000128)
   */
  public static Resource is_contained_in() {
    return _namespace_SIO("SIO_000128");
  }

  /**
   * has participant is a relation that describes the participation of the object in the (processual) subject.
   * (http://semanticscience.org/resource/SIO_000132)
   */
  public static Resource has_participant() {
    return _namespace_SIO("SIO_000132");
  }

  /**
   * has agent is a relation between a process and an entity, where the entity is present throughout the process and is a causal participant in the process.
   * (http://semanticscience.org/resource/SIO_000139)
   */
  public static Resource has_agent() {
    return _namespace_SIO("SIO_000139");
  }

  /**
   * A is location of B iff the spatial region occupied by A has the spatial region occupied by B as a part. [T][R]
   * (http://semanticscience.org/resource/SIO_000145)
   */
  public static Resource is_location_of() {
    return _namespace_SIO("SIO_000145");
  }

  /**
   * A contains B iff the spatial region occupied by A has the spatial region occupied by B as a part, and B is not part of A. [T]
   * (http://semanticscience.org/resource/SIO_000202)
   */
  public static Resource contains() {
    return _namespace_SIO("SIO_000202");
  }

  /**
   * A is connected to B iff there exists a fiat, material or temporal path between A and B. [S][T]
   * (http://semanticscience.org/resource/SIO_000203)
   */
  public static Resource is_connected_to() {
    return _namespace_SIO("SIO_000203");
  }

  /**
   * A is adjacent to B iff there is a small, but non-zero distance between A and B
   * (http://semanticscience.org/resource/SIO_000204)
   */
  public static Resource is_adjacent_to() {
    return _namespace_SIO("SIO_000204");
  }

  /**
   * is represented by: a relation between an entity and some symbol.
   * (http://semanticscience.org/resource/SIO_000205)
   */
  public static Resource is_represented_by() {
    return _namespace_SIO("SIO_000205");
  }

  /**
   * is supported by is a relation between a proposition and something that supports the truth of the assertion.
   * (http://semanticscience.org/resource/SIO_000206)
   */
  public static Resource is_supported_by() {
    return _namespace_SIO("SIO_000206");
  }

  /**
   * has disputing evidence is a relation between a proposition and something that disputes (does not directly support) the truth of the assertion.
   * (http://semanticscience.org/resource/SIO_000207)
   */
  public static Resource is_disputed_by() {
    return _namespace_SIO("SIO_000207");
  }

  public static Resource is_supporting_evidence_for() {
    return _namespace_SIO("SIO_000208");
  }

  public static Resource is_disputing_evidence_for() {
    return _namespace_SIO("SIO_000209");
  }

  /**
   * a represents b when a serves as a sign, symbol or model of b.
   * (http://semanticscience.org/resource/SIO_000210)
   */
  public static Resource represents() {
    return _namespace_SIO("SIO_000210");
  }

  /**
   * is positionally after is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically greater than the projection of the position of the second entity.
   * (http://semanticscience.org/resource/SIO_000211)
   */
  public static Resource is_positionally_after() {
    return _namespace_SIO("SIO_000211");
  }

  /**
   * A is referred to by B iff B is an informational entity that makes reference to A.
   * (http://semanticscience.org/resource/SIO_000212)
   */
  public static Resource is_referred_to_by() {
    return _namespace_SIO("SIO_000212");
  }

  /**
   * A has concretization B iff A is an informational entity and B is the a quality of some material entity.
   * (http://semanticscience.org/resource/SIO_000213)
   */
  public static Resource has_concretization() {
    return _namespace_SIO("SIO_000213");
  }

  /**
   * A is concretization of B iff A is a quality of a material entity and B is an informational entity.
   * (http://semanticscience.org/resource/SIO_000214)
   */
  public static Resource is_concretization_of() {
    return _namespace_SIO("SIO_000214");
  }

  /**
   * is measurement value of is a relation between a value and the entity that it is a measurement of.
   * (http://semanticscience.org/resource/SIO_000215)
   */
  public static Resource is_measurement_value_of() {
    return _namespace_SIO("SIO_000215");
  }

  /**
   * has measurement value is a relation between a quality/realizable and a measurement value.
   * (http://semanticscience.org/resource/SIO_000216)
   */
  public static Resource has_measurement_value() {
    return _namespace_SIO("SIO_000216");
  }

  /**
   * has quality is a relation between an entity and the quality that it bears.
   * (http://semanticscience.org/resource/SIO_000217)
   */
  public static Resource has_quality() {
    return _namespace_SIO("SIO_000217");
  }

  /**
   * is quality of is a relation between a quality and the entity that it is a property of.
   * (http://semanticscience.org/resource/SIO_000218)
   */
  public static Resource is_quality_of() {
    return _namespace_SIO("SIO_000218");
  }

  /**
   * is source of is a relation between a source of information about some entity.
   * (http://semanticscience.org/resource/SIO_000219)
   */
  public static Resource is_source_of() {
    return _namespace_SIO("SIO_000219");
  }

  /**
   * has unit is a relation between a quantity and the unit it is a multiple of.
   * (http://semanticscience.org/resource/SIO_000221)
   */
  public static Resource has_unit() {
    return _namespace_SIO("SIO_000221");
  }

  /**
   * is unit of is a relation between a unit and a quantity that it is a multiple of.
   * (http://semanticscience.org/resource/SIO_000222)
   */
  public static Resource is_unit_of() {
    return _namespace_SIO("SIO_000222");
  }

  /**
   * has property is a relation between an entity and the quality, capability or role that it and it alone bears.
   * (http://semanticscience.org/resource/SIO_000223)
   */
  public static Resource has_property() {
    return _namespace_SIO("SIO_000223");
  }

  /**
   * is property of is a relation betweena  quality, capability or role and the entity that it and it alone bears.
   * (http://semanticscience.org/resource/SIO_000224)
   */
  public static Resource is_property_of() {
    return _namespace_SIO("SIO_000224");
  }

  /**
   * has function is the relation between an entity and a function that is ascribed to it.
   * (http://semanticscience.org/resource/SIO_000225)
   */
  public static Resource has_function() {
    return _namespace_SIO("SIO_000225");
  }

  /**
   * is function of is a relation between a function and an entity that it is a property of.
   * (http://semanticscience.org/resource/SIO_000226)
   */
  public static Resource is_function_of() {
    return _namespace_SIO("SIO_000226");
  }

  /**
   * is role of is a relation between a role and the entity that it is a property of.
   * (http://semanticscience.org/resource/SIO_000227)
   */
  public static Resource is_role_of() {
    return _namespace_SIO("SIO_000227");
  }

  /**
   * has role is a relation between an entity and a role that it bears.
   * (http://semanticscience.org/resource/SIO_000228)
   */
  public static Resource has_role() {
    return _namespace_SIO("SIO_000228");
  }

  /**
   * has output is a relation between an process and an entity, where the entity is present at the end of the process.
   * (http://semanticscience.org/resource/SIO_000229)
   */
  public static Resource has_output() {
    return _namespace_SIO("SIO_000229");
  }

  /**
   * has input is a relation between a process and an entity, where the entity is present at the beginning of the process.
   * (http://semanticscience.org/resource/SIO_000230)
   */
  public static Resource has_input() {
    return _namespace_SIO("SIO_000230");
  }

  /**
   * is input in is a relation between an entity and a process, where the entity is present at the beginning of the process.
   * (http://semanticscience.org/resource/SIO_000231)
   */
  public static Resource is_input_in() {
    return _namespace_SIO("SIO_000231");
  }

  /**
   * is output of is a relation between an entity and a process, where the entity is present at the end of the process.
   * (http://semanticscience.org/resource/SIO_000232)
   */
  public static Resource is_output_of() {
    return _namespace_SIO("SIO_000232");
  }

  /**
   * is implementation of is a relation between an information entity and a specification that it conforms to.
   * (http://semanticscience.org/resource/SIO_000233)
   */
  public static Resource is_implementation_of() {
    return _namespace_SIO("SIO_000233");
  }

  /**
   * has implementation is a relation between a specification and an implementation that conforms to it.
   * (http://semanticscience.org/resource/SIO_000234)
   */
  public static Resource has_implementation() {
    return _namespace_SIO("SIO_000234");
  }

  /**
   * has disposition is the relation between an entity and a disposition that it bears.
   * (http://semanticscience.org/resource/SIO_000235)
   */
  public static Resource has_disposition() {
    return _namespace_SIO("SIO_000235");
  }

  /**
   * is disposition of is a relation between a disposition and the entity that it is a property of.
   * (http://semanticscience.org/resource/SIO_000236)
   */
  public static Resource is_disposition_of() {
    return _namespace_SIO("SIO_000236");
  }

  /**
   * is positionally before is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically less than the projection of the position of the second entity.
   * (http://semanticscience.org/resource/SIO_000240)
   */
  public static Resource is_positionally_before() {
    return _namespace_SIO("SIO_000240");
  }

  /**
   * is directly after is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically greater than the projection of the position of the second entity, and the entities are adjacent to one another.
   * (http://semanticscience.org/resource/SIO_000241)
   */
  public static Resource is_directly_after() {
    return _namespace_SIO("SIO_000241");
  }

  /**
   * is directly before is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically less than the projection of the position of the second entity, and the entities are adjacent to one another.
   * (http://semanticscience.org/resource/SIO_000242)
   */
  public static Resource is_directly_before() {
    return _namespace_SIO("SIO_000242");
  }

  /**
   * A transitive, symmetric, temporal relation in which one entity is causally related with another non-identical entity.
   * (http://semanticscience.org/resource/SIO_000243)
   */
  public static Resource is_causally_related_with() {
    return _namespace_SIO("SIO_000243");
  }

  /**
   * A transitive temporal relation in which one entity derives from another non-identical entity.
   * (http://semanticscience.org/resource/SIO_000244)
   */
  public static Resource derives_from() {
    return _namespace_SIO("SIO_000244");
  }

  /**
   * A transitive temporal relation in which one entity derives into another non-identical entity.
   * (http://semanticscience.org/resource/SIO_000245)
   */
  public static Resource derives_into() {
    return _namespace_SIO("SIO_000245");
  }

  /**
   * A non-transitive temporal relation in which one entity immediately derives into a non-identical entity such that there are no intermediate entities between them.
   * (http://semanticscience.org/resource/SIO_000246)
   */
  public static Resource immediately_derives_into() {
    return _namespace_SIO("SIO_000246");
  }

  /**
   * A non-transitive temporal relation in which one entity immediately derives from a non-identical entity such that there are no intermediate entities between them.
   * (http://semanticscience.org/resource/SIO_000247)
   */
  public static Resource immediately_derives_from() {
    return _namespace_SIO("SIO_000247");
  }

  /**
   * A transitive, temporal relation in which one process precedes (has occured earlier than) another process.
   * (http://semanticscience.org/resource/SIO_000248)
   */
  public static Resource precedes() {
    return _namespace_SIO("SIO_000248");
  }

  public static Resource is_preceded_by() {
    return _namespace_SIO("SIO_000249");
  }

  /**
   * A non-transitive temporal relation in which one process immediately precedes another process, such that there is no interval of time between the two processes.
   * (http://semanticscience.org/resource/SIO_000250)
   */
  public static Resource immediately_precedes() {
    return _namespace_SIO("SIO_000250");
  }

  /**
   * A non-transitive temporal relation in which one process is immediately preceded by another process, such that there is no interval of time between the two processes.
   * (http://semanticscience.org/resource/SIO_000251)
   */
  public static Resource is_immediately_preceded_by() {
    return _namespace_SIO("SIO_000251");
  }

  /**
   * is reference for is a relation between a document that provides information about an entity.
   * (http://semanticscience.org/resource/SIO_000252)
   */
  public static Resource is_referenced_by() {
    return _namespace_SIO("SIO_000252");
  }

  /**
   * has source is a relation between an entity and some source of information.
   * (http://semanticscience.org/resource/SIO_000253)
   */
  public static Resource has_source() {
    return _namespace_SIO("SIO_000253");
  }

  /**
   * is annotation of is a relation between some textual entity and the entity that it annotates.
   * (http://semanticscience.org/resource/SIO_000254)
   */
  public static Resource is_annotation_of() {
    return _namespace_SIO("SIO_000254");
  }

  /**
   * has annotation is a relation between an entity and some textual anntotation.
   * (http://semanticscience.org/resource/SIO_000255)
   */
  public static Resource has_annotation() {
    return _namespace_SIO("SIO_000255");
  }

  /**
   * is variant of: a relationship indicating that two entities are different (by some measure), but either achieve the same objectives in different ways or are permutations of one another (temporal, logical or otherwise)
   * (http://semanticscience.org/resource/SIO_000272)
   */
  public static Resource is_variant_of() {
    return _namespace_SIO("SIO_000272");
  }

  /**
   * has direct part is a relation to specify a part at a particular level of granularity
   * (http://semanticscience.org/resource/SIO_000273)
   */
  public static Resource has_direct_part() {
    return _namespace_SIO("SIO_000273");
  }

  /**
   * A is prior version of B iff A is a variant of B and B derives from A.
   * (http://semanticscience.org/resource/SIO_000274)
   */
  public static Resource is_prior_version_of() {
    return _namespace_SIO("SIO_000274");
  }

  /**
   * cites is a relation to refer to by way of example, authority or proof.
   * (http://semanticscience.org/resource/SIO_000277)
   */
  public static Resource cites() {
    return _namespace_SIO("SIO_000277");
  }

  /**
   * is cited by is a relation from an object that is referred to by way of example, authority or proof.
   * (http://semanticscience.org/resource/SIO_000278)
   */
  public static Resource is_cited_by() {
    return _namespace_SIO("SIO_000278");
  }

  /**
   * is similar to is a relation between two entities that share one or more features.
   * (http://semanticscience.org/resource/SIO_000283)
   */
  public static Resource is_similar_to() {
    return _namespace_SIO("SIO_000283");
  }

  /**
   * A is subsequent version of B iff A is a variant of B and A derives from B.
   * (http://semanticscience.org/resource/SIO_000286)
   */
  public static Resource is_subsequent_version_of() {
    return _namespace_SIO("SIO_000286");
  }

  public static Resource is_covalently_connected_to_transitive() {
    return _namespace_SIO("SIO_000288");
  }

  /**
   * has target is a relation between a process and an entity, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
   * (http://semanticscience.org/resource/SIO_000291)
   */
  public static Resource has_target() {
    return _namespace_SIO("SIO_000291");
  }

  /**
   * is target in is a relation between an entity and a process, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
   * (http://semanticscience.org/resource/SIO_000292)
   */
  public static Resource is_target_in() {
    return _namespace_SIO("SIO_000292");
  }

  /**
   * is weakly interacting with is a symmetric relation between two molecular entities (or any part thereof) that are interacting through some weak force (van der waals, hydrogen bonds, electrostatic interactions)
   * (http://semanticscience.org/resource/SIO_000293)
   */
  public static Resource is_weakly_interacting_with_transitive() {
    return _namespace_SIO("SIO_000293");
  }

  /**
   * a is causally related to b iff there is a causal chain of events from a to b
   * (http://semanticscience.org/resource/SIO_000294)
   */
  public static Resource is_causally_related_to() {
    return _namespace_SIO("SIO_000294");
  }

  /**
   * is direct part of is a relation between a specific part (at some level of granularity) and its whole.
   * (http://semanticscience.org/resource/SIO_000310)
   */
  public static Resource is_direct_part_of() {
    return _namespace_SIO("SIO_000310");
  }

  /**
   * is product of is a relation between an entity and a process, where the entity is present at the end  of the process as a result of a transformation in the process target.
   * (http://semanticscience.org/resource/SIO_000311)
   */
  public static Resource is_product_of() {
    return _namespace_SIO("SIO_000311");
  }

  /**
   * has product is a relation between an process and an entity, where a new entity exists at the end of the process.
   * (http://semanticscience.org/resource/SIO_000312)
   */
  public static Resource has_product() {
    return _namespace_SIO("SIO_000312");
  }

  /**
   * is component part of is a relation between a component and a whole, where the component is instrinsic to the whole, and loss of the part would change the kind that the whole is.
   * (http://semanticscience.org/resource/SIO_000313)
   */
  public static Resource is_component_part_of() {
    return _namespace_SIO("SIO_000313");
  }

  /**
   * A is spatiotemporally related to B iff A is in the spatial or temporal vicinity of B
   * (http://semanticscience.org/resource/SIO_000322)
   */
  public static Resource is_spatiotemporally_related_to() {
    return _namespace_SIO("SIO_000322");
  }

  /**
   * A "is surrounded by" B iff the A "is contained by" B and A "is adjacent to" B or A "is directly connected to" B.
   * (http://semanticscience.org/resource/SIO_000323)
   */
  public static Resource is_surrounded_by() {
    return _namespace_SIO("SIO_000323");
  }

  /**
   * A "surrounds" B iff the A "contains" B and A "is adjacent to" B or A "is directly connected to" B.
   * (http://semanticscience.org/resource/SIO_000324)
   */
  public static Resource surrounds() {
    return _namespace_SIO("SIO_000324");
  }

  /**
   * A overlaps with B iff there is some C that is part of both A and B. [S][R]
   * (http://semanticscience.org/resource/SIO_000325)
   */
  public static Resource overlaps_with() {
    return _namespace_SIO("SIO_000325");
  }

  /**
   * is about is a relation between an information content entity and the entity that its primary subject.
   * (http://semanticscience.org/resource/SIO_000332)
   */
  public static Resource is_about() {
    return _namespace_SIO("SIO_000332");
  }

  /**
   * is covalently connected to is a relation between an atom and another atom.
   * (http://semanticscience.org/resource/SIO_000334)
   */
  public static Resource is_covalently_connected_to() {
    return _namespace_SIO("SIO_000334");
  }

  public static Resource is_weakly_interacting_with() {
    return _namespace_SIO("SIO_000335");
  }

  /**
   * A relation between an information content entity and a product that it (directly/indirectly) specifies
   * (http://semanticscience.org/resource/SIO_000338)
   */
  public static Resource specifies() {
    return _namespace_SIO("SIO_000338");
  }

  /**
   * a relation between a product and the information content entity that specifies it.
   * (http://semanticscience.org/resource/SIO_000339)
   */
  public static Resource is_specified_by() {
    return _namespace_SIO("SIO_000339");
  }

  /**
   * is manifested as is a relation between an expression and its manifestations.
   * (http://semanticscience.org/resource/SIO_000341)
   */
  public static Resource is_manifested_as() {
    return _namespace_SIO("SIO_000341");
  }

  /**
   * a is causally related from b iff there is a causal chain of events from b to a
   * (http://semanticscience.org/resource/SIO_000352)
   */
  public static Resource is_causally_related_from() {
    return _namespace_SIO("SIO_000352");
  }

  /**
   * realizes is a relation between a process and a realizable entity (role, function, disposition).
   * (http://semanticscience.org/resource/SIO_000355)
   */
  public static Resource realizes() {
    return _namespace_SIO("SIO_000355");
  }

  public static Resource is_realized_in() {
    return _namespace_SIO("SIO_000356");
  }

  /**
   * satisfies is a relation between an entity and the specification or objective that it conforms to.
   * (http://semanticscience.org/resource/SIO_000362)
   */
  public static Resource satisfies() {
    return _namespace_SIO("SIO_000362");
  }

  public static Resource is_satisfied_by() {
    return _namespace_SIO("SIO_000363");
  }

  /**
   * has creator is a relation between an entity and that which created it.
   * (http://semanticscience.org/resource/SIO_000364)
   */
  public static Resource has_creator() {
    return _namespace_SIO("SIO_000364");
  }

  /**
   * is created by is a relation between an entity and its creator.
   * (http://semanticscience.org/resource/SIO_000365)
   */
  public static Resource is_created_by() {
    return _namespace_SIO("SIO_000365");
  }

  /**
   * has component part is a relation between a whole and a component part where the component is instrinsic to the whole, and loss of the part would change the kind that it is.
   * (http://semanticscience.org/resource/SIO_000369)
   */
  public static Resource has_component_part() {
    return _namespace_SIO("SIO_000369");
  }

  public static Resource has_expression() {
    return _namespace_SIO("SIO_000420");
  }

  /**
   * is expression of is a relation between more concrete expression of some conceptualization.
   * (http://semanticscience.org/resource/SIO_000421)
   */
  public static Resource is_expression_of() {
    return _namespace_SIO("SIO_000421");
  }

  /**
   * A is broader than B (t) iff for A is broader than B.
   * (http://semanticscience.org/resource/SIO_000422)
   */
  public static Resource is_broader_than_t() {
    return _namespace_SIO("SIO_000422");
  }

  /**
   * A is narrower than B (t) iff for A is narrower than B.
   * (http://semanticscience.org/resource/SIO_000424)
   */
  public static Resource is_narrower_than_t() {
    return _namespace_SIO("SIO_000424");
  }

  /**
   * A is generically related with B iff A is an abstract entity or an information content entity and B is a information content entity or a physical entity, respectively.
   * (http://semanticscience.org/resource/SIO_000425)
   */
  public static Resource is_generically_related_with() {
    return _namespace_SIO("SIO_000425");
  }

  public static Resource is_manifestation_of() {
    return _namespace_SIO("SIO_000426");
  }

  /**
   * A is narrower than B iff the meaning of term A is narrower in scope than the meaning of term B
   * (http://semanticscience.org/resource/SIO_000427)
   */
  public static Resource is_narrower_than() {
    return _namespace_SIO("SIO_000427");
  }

  public static Resource is_broader_than() {
    return _namespace_SIO("SIO_000477");
  }

  /**
   * A is match to B iff A and B are terms with similar (related, broad, close, exact) meanings
   * (http://semanticscience.org/resource/SIO_000482)
   */
  public static Resource is_match_to() {
    return _namespace_SIO("SIO_000482");
  }

  public static Resource is_exact_match_to() {
    return _namespace_SIO("SIO_000484");
  }

  public static Resource is_close_match_to() {
    return _namespace_SIO("SIO_000490");
  }

  public static Resource is_broad_match_to() {
    return _namespace_SIO("SIO_000491");
  }

  public static Resource is_dissimilar_to() {
    return _namespace_SIO("SIO_000495");
  }

  public static Resource is_opposite_to() {
    return _namespace_SIO("SIO_000496");
  }

  public static Resource is_version_of() {
    return _namespace_SIO("SIO_000497");
  }

  /**
   * has parameter is a relation between a process and an information content entity which modulates the behaviour of some participant.
   * (http://semanticscience.org/resource/SIO_000552)
   */
  public static Resource has_parameter() {
    return _namespace_SIO("SIO_000552");
  }

  /**
   * is parameter in is a relation between a data item and some data transformation process.
   * (http://semanticscience.org/resource/SIO_000553)
   */
  public static Resource is_parameter_in() {
    return _namespace_SIO("SIO_000553");
  }

  public static Resource is_described_by() {
    return _namespace_SIO("SIO_000557");
  }

  /**
   * is orthologous to is a relation between two biological entities that share a common ancestor and occur in different species.
   * (http://semanticscience.org/resource/SIO_000558)
   */
  public static Resource is_orthologous_to() {
    return _namespace_SIO("SIO_000558");
  }

  /**
   * describes is a relation between one entity and another entity that it provides a description (detailed account of).
   * (http://semanticscience.org/resource/SIO_000563)
   */
  public static Resource describes() {
    return _namespace_SIO("SIO_000563");
  }

  /**
   * has capability is a relation between an entity and the capability that it bears.
   * (http://semanticscience.org/resource/SIO_000586)
   */
  public static Resource has_capability() {
    return _namespace_SIO("SIO_000586");
  }

  /**
   * refers to is a relation between one entity and the entity that it makes reference to.
   * (http://semanticscience.org/resource/SIO_000628)
   */
  public static Resource refers_to() {
    return _namespace_SIO("SIO_000628");
  }

  public static Resource is_subject_of() {
    return _namespace_SIO("SIO_000629");
  }

  /**
   * is paralogous to is a relation between two entities which indicates their common ancestry as a result of a gene duplication.
   * (http://semanticscience.org/resource/SIO_000630)
   */
  public static Resource is_paralogous_to() {
    return _namespace_SIO("SIO_000630");
  }

  /**
   * references is a relation between one entity and the entity that it makes reference to by name, but is not described by it.
   * (http://semanticscience.org/resource/SIO_000631)
   */
  public static Resource references() {
    return _namespace_SIO("SIO_000631");
  }

  /**
   * is model of is a relation between a model (an artifact) and the entity it purports to represent.
   * (http://semanticscience.org/resource/SIO_000632)
   */
  public static Resource is_model_of() {
    return _namespace_SIO("SIO_000632");
  }

  public static Resource is_modelled_by() {
    return _namespace_SIO("SIO_000633");
  }

  /**
   * a relation between two entities which indicates their common ancestry but due to horizontal gene transfer.
   * (http://semanticscience.org/resource/SIO_000634)
   */
  public static Resource is_xenologous_to() {
    return _namespace_SIO("SIO_000634");
  }

  /**
   * has trigger is a relation between a realizable and the factor that causes it to be realized.
   * (http://semanticscience.org/resource/SIO_000635)
   */
  public static Resource has_trigger() {
    return _namespace_SIO("SIO_000635");
  }

  public static Resource is_trigger_for() {
    return _namespace_SIO("SIO_000636");
  }

  /**
   * has basis is a relation between a realizable entity and the quality that forms the basis for it.
   * (http://semanticscience.org/resource/SIO_000641)
   */
  public static Resource has_basis() {
    return _namespace_SIO("SIO_000641");
  }

  /**
   * is base for is a relation between a quality and the realizable entity that it is the basis for.
   * (http://semanticscience.org/resource/SIO_000642)
   */
  public static Resource is_base_for() {
    return _namespace_SIO("SIO_000642");
  }

  public static Resource is_realizable_property_of() {
    return _namespace_SIO("SIO_000643");
  }

  public static Resource has_realizable_property() {
    return _namespace_SIO("SIO_000644");
  }

  public static Resource is_capability_of() {
    return _namespace_SIO("SIO_000646");
  }

  /**
   * A is directly connected to B iff there exists a path direclty between A and B.
   * (http://semanticscience.org/resource/SIO_000652)
   */
  public static Resource is_directly_connected_to() {
    return _namespace_SIO("SIO_000652");
  }

  /**
   * A transitive temporal relation in which an entity mainstains identity from one state to another.
   * (http://semanticscience.org/resource/SIO_000655)
   */
  public static Resource transforms_into() {
    return _namespace_SIO("SIO_000655");
  }

  /**
   * A  temporal relation in which an entity mainstains identity from one state to another.
   * (http://semanticscience.org/resource/SIO_000656)
   */
  public static Resource immediately_transforms_into() {
    return _namespace_SIO("SIO_000656");
  }

  /**
   * A transitive temporal relation in which an entity mainstains identity from one state to another.
   * (http://semanticscience.org/resource/SIO_000657)
   */
  public static Resource transforms_from() {
    return _namespace_SIO("SIO_000657");
  }

  /**
   * A  temporal relation in which an entity mainstains identity from one state to another.
   * (http://semanticscience.org/resource/SIO_000658)
   */
  public static Resource immediately_transforms_from() {
    return _namespace_SIO("SIO_000658");
  }

  /**
   * in relation to is a comparative relation to indicate that the instance of the class holding the relation exists in relation to another entity.
   * (http://semanticscience.org/resource/SIO_000668)
   */
  public static Resource in_relation_to() {
    return _namespace_SIO("SIO_000668");
  }

  public static Resource has_identifier() {
    return _namespace_SIO("SIO_000671");
  }

  public static Resource is_identifier_for() {
    return _namespace_SIO("SIO_000672");
  }

  /**
   * has unique identifier is an inverse functional relation between an entity and an identifier that uniquely identifies it.
   * (http://semanticscience.org/resource/SIO_000673)
   */
  public static Resource has_unique_identifier() {
    return _namespace_SIO("SIO_000673");
  }

  /**
   * is unique identifier for is a relation between an identifier and an entity that it uniquely identifies
   * (http://semanticscience.org/resource/SIO_000674)
   */
  public static Resource is_unique_identifier_for() {
    return _namespace_SIO("SIO_000674");
  }

  public static Resource has_time_boundary() {
    return _namespace_SIO("SIO_000679");
  }

  public static Resource has_start_time() {
    return _namespace_SIO("SIO_000680");
  }

  public static Resource has_end_time() {
    return _namespace_SIO("SIO_000681");
  }

  public static Resource is_start_time_of() {
    return _namespace_SIO("SIO_000682");
  }

  public static Resource is_end_time_of() {
    return _namespace_SIO("SIO_000684");
  }

  /**
   * exists at is a relation between an entity and a time measurement.
   * (http://semanticscience.org/resource/SIO_000687)
   */
  public static Resource exists_at() {
    return _namespace_SIO("SIO_000687");
  }

  public static Resource is_mutual_disposition_of() {
    return _namespace_SIO("SIO_000697");
  }

  public static Resource is_greater_than_or_equal_to() {
    return _namespace_SIO("SIO_000699");
  }

  public static Resource is_mutually_related_to() {
    return _namespace_SIO("SIO_000709");
  }

  public static Resource is_mutual_role_of() {
    return _namespace_SIO("SIO_000710");
  }

  public static Resource is_lesser_than_or_equal_to() {
    return _namespace_SIO("SIO_000733");
  }

  public static Resource is_greater_than() {
    return _namespace_SIO("SIO_000734");
  }

  public static Resource is_lesser_than() {
    return _namespace_SIO("SIO_000735");
  }

  /**
   * is comparable to is a relation between two entities that share at least one feature whose value can be compared.
   * (http://semanticscience.org/resource/SIO_000736)
   */
  public static Resource is_comparable_to() {
    return _namespace_SIO("SIO_000736");
  }

  /**
   * is numerically comparable to is a comparison relation between two quantities whose datatype value can be compared.
   * (http://semanticscience.org/resource/SIO_000737)
   */
  public static Resource is_numerically_comparable_to() {
    return _namespace_SIO("SIO_000737");
  }

  public static Resource is_equal_to() {
    return _namespace_SIO("SIO_000738");
  }

  public static Resource is_inequal_to() {
    return _namespace_SIO("SIO_000749");
  }

  /**
   * has evidence is a relation between a proposition and something that demonstrates the truth of the assertion.
   * (http://semanticscience.org/resource/SIO_000772)
   */
  public static Resource has_evidence() {
    return _namespace_SIO("SIO_000772");
  }

  public static Resource is_evidence_for() {
    return _namespace_SIO("SIO_000773");
  }

  /**
   * has evidence is a relation between a proposition and something that refutes (is incompatible with) the truth of the assertion.
   * (http://semanticscience.org/resource/SIO_000774)
   */
  public static Resource is_refuted_by() {
    return _namespace_SIO("SIO_000774");
  }

  public static Resource is_refuting_evidence_for() {
    return _namespace_SIO("SIO_000775");
  }

  /**
   * measured at is a relation between a measurement value and the time measurement.
   * (http://semanticscience.org/resource/SIO_000793)
   */
  public static Resource measured_at() {
    return _namespace_SIO("SIO_000793");
  }

  public static Resource in_relation_from() {
    return _namespace_SIO("SIO_000892");
  }

  /**
   * has frequency is a relation that specifies the occurence of an object or event
   * (http://semanticscience.org/resource/SIO_000900)
   */
  public static Resource has_frequency() {
    return _namespace_SIO("SIO_000900");
  }

  /**
   * is frequency of is a relation between a temporal unit and an object or event
   * (http://semanticscience.org/resource/SIO_000901)
   */
  public static Resource is_frequency_of() {
    return _namespace_SIO("SIO_000901");
  }

  /**
   * has substrate is a relation between a process and an object where the object is destroyed by its participation in the process.
   * (http://semanticscience.org/resource/SIO_000905)
   */
  public static Resource has_substrate() {
    return _namespace_SIO("SIO_000905");
  }

  /**
   * is first part of is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
   * (http://semanticscience.org/resource/SIO_000970)
   */
  public static Resource is_first_part_of() {
    return _namespace_SIO("SIO_000970");
  }

  /**
   * has first part is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
   * (http://semanticscience.org/resource/SIO_000971)
   */
  public static Resource has_first_part() {
    return _namespace_SIO("SIO_000971");
  }

  /**
   * has last part is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
   * (http://semanticscience.org/resource/SIO_000972)
   */
  public static Resource has_last_part() {
    return _namespace_SIO("SIO_000972");
  }

  /**
   * is last part of is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
   * (http://semanticscience.org/resource/SIO_000973)
   */
  public static Resource is_last_part_of() {
    return _namespace_SIO("SIO_000973");
  }

  /**
   * has ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
   * (http://semanticscience.org/resource/SIO_000974)
   */
  public static Resource has_ordered_part() {
    return _namespace_SIO("SIO_000974");
  }

  /**
   * is ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
   * (http://semanticscience.org/resource/SIO_000975)
   */
  public static Resource is_ordered_part_of() {
    return _namespace_SIO("SIO_000975");
  }

  /**
   * A relation between an biological information content entity and a product that it (directly/indirectly) encodes.
   * (http://semanticscience.org/resource/SIO_010078)
   */
  public static Resource encodes() {
    return _namespace_SIO("SIO_010078");
  }

  public static Resource is_encoded_by() {
    return _namespace_SIO("SIO_010079");
  }

  /**
   * a relation between two information content entities in which one is transcribed into (an exact or similar kind) another through some process.
   * (http://semanticscience.org/resource/SIO_010080)
   */
  public static Resource is_transcribed_into() {
    return _namespace_SIO("SIO_010080");
  }

  public static Resource is_transcribed_from() {
    return _namespace_SIO("SIO_010081");
  }

  public static Resource is_translated_into() {
    return _namespace_SIO("SIO_010082");
  }

  public static Resource is_translated_from() {
    return _namespace_SIO("SIO_010083");
  }

  /**
   * a relation between two entities which indicates their common ancestry.
   * (http://semanticscience.org/resource/SIO_010302)
   */
  public static Resource is_homologous_to() {
    return _namespace_SIO("SIO_010302");
  }

  /**
   * A relation between a informational entity and its actual value (numeric, date, text, etc).
   * (http://semanticscience.org/resource/SIO_000300)
   */
  public static Resource has_value() {
    return _namespace_SIO("SIO_000300");
  }

  /**
   * Everything is an entity.
   * (http://semanticscience.org/resource/SIO_000000)
   */
  public static Resource entity() {
    return _namespace_SIO("SIO_000000");
  }

  /**
   * A material entity is a physical entity that is spatially extended, exists as a whole at any point in time and has mass.
   * (http://semanticscience.org/resource/SIO_000004)
   */
  public static Resource material_entity() {
    return _namespace_SIO("SIO_000004");
  }

  /**
   * A quality is an attribute that is intrinsically associated with its bearer (or its parts), but whose presence/absence and observed/measured value may vary.
   * (http://semanticscience.org/resource/SIO_000005)
   */
  public static Resource quality() {
    return _namespace_SIO("SIO_000005");
  }

  /**
   * A process is an entity that is identifiable only through the unfolding of time, has temporal parts, and unless otherwise specified/predicted, cannot be identified from any instant of time in which it exists.
   * (http://semanticscience.org/resource/SIO_000006)
   */
  public static Resource process() {
    return _namespace_SIO("SIO_000006");
  }

  public static Resource social_entity() {
    return _namespace_SIO("SIO_000009");
  }

  /**
   * A social structure is a social entity which consists of relationships between two or more entities.
   * (http://semanticscience.org/resource/SIO_000010)
   */
  public static Resource social_structure() {
    return _namespace_SIO("SIO_000010");
  }

  /**
   * An organization is a collective with a complex articulation of tasks, roles and responsibilities.
   * (http://semanticscience.org/resource/SIO_000012)
   */
  public static Resource organization() {
    return _namespace_SIO("SIO_000012");
  }

  /**
   * a geographic position is the coordinate of an entity against some geographic coordinate system.
   * (http://semanticscience.org/resource/SIO_000013)
   */
  public static Resource geographic_position() {
    return _namespace_SIO("SIO_000013");
  }

  /**
   * A disposition is the tendency of a capability to be exhibited under certain conditions or in response to a certain stimulus (trigger)
   * (http://semanticscience.org/resource/SIO_000014)
   */
  public static Resource disposition() {
    return _namespace_SIO("SIO_000014");
  }

  /**
   * information content entity is an object that requires some background knowledge or procedure to correctly interpret.
   * (http://semanticscience.org/resource/SIO_000015)
   */
  public static Resource information_content_entity() {
    return _namespace_SIO("SIO_000015");
  }

  /**
   * A role is a realizable entity that describes behaviours, rights and obligations of an entity in some particular circumstance.
   * (http://semanticscience.org/resource/SIO_000016)
   */
  public static Resource role() {
    return _namespace_SIO("SIO_000016");
  }

  /**
   * A function is a capability that satisfies some agentive objective, or (evolutionary) optimization.
   * (http://semanticscience.org/resource/SIO_000017)
   */
  public static Resource function() {
    return _namespace_SIO("SIO_000017");
  }

  /**
   * A site is a spatial region bounded (in part or in whole) by material entities and may be occupied by material entities.
   * (http://semanticscience.org/resource/SIO_000019)
   */
  public static Resource site() {
    return _namespace_SIO("SIO_000019");
  }

  /**
   * A material boundary is the boundary of a material entity which exists as a lower dimensional entity at exactly the location where its parts no longer extend into space. Every material entity has a boundary, and a boundary is the boundary of exactly 1 material entity.
   * (http://semanticscience.org/resource/SIO_000022)
   */
  public static Resource material_boundary() {
    return _namespace_SIO("SIO_000022");
  }

  /**
   * An object quality is quality of an object.
   * (http://semanticscience.org/resource/SIO_000026)
   */
  public static Resource object_quality() {
    return _namespace_SIO("SIO_000026");
  }

  /**
   * A process quality is quality that is associated with a process.
   * (http://semanticscience.org/resource/SIO_000027)
   */
  public static Resource process_quality() {
    return _namespace_SIO("SIO_000027");
  }

  /**
   * A sequence is a primary structure descriptor in which each of the letters in the string represents a monomeric unit (residue) in which adjacent letters represent the connectivity between the monomeric units.
   * (http://semanticscience.org/resource/SIO_000030)
   */
  public static Resource biopolymer_sequence() {
    return _namespace_SIO("SIO_000030");
  }

  public static Resource start_date() {
    return _namespace_SIO("SIO_000031");
  }

  public static Resource end_date() {
    return _namespace_SIO("SIO_000032");
  }

  /**
   * process status is a process quality that describes the state of a process.
   * (http://semanticscience.org/resource/SIO_000033)
   */
  public static Resource process_status() {
    return _namespace_SIO("SIO_000033");
  }

  /**
   * completed is that status of a process that successfully unfolds.
   * (http://semanticscience.org/resource/SIO_000034)
   */
  public static Resource completed() {
    return _namespace_SIO("SIO_000034");
  }

  /**
   * ongoing is the status of a process that is not yet complete.
   * (http://semanticscience.org/resource/SIO_000035)
   */
  public static Resource ongoing() {
    return _namespace_SIO("SIO_000035");
  }

  /**
   * predicted is the quality of an entity that has not been shown to exist but there is a claim of potential existence.
   * (http://semanticscience.org/resource/SIO_000036)
   */
  public static Resource predicted() {
    return _namespace_SIO("SIO_000036");
  }

  public static Resource physical_dimensional_quantity() {
    return _namespace_SIO("SIO_000037");
  }

  /**
   * a quantity that extends in single dimension
   * (http://semanticscience.org/resource/SIO_000038)
   */
  public static Resource a_D_extent_quantity() {
    return _namespace_SIO("SIO_000038");
  }

  public static Resource depth() {
    return _namespace_SIO("SIO_000039");
  }

  public static Resource height() {
    return _namespace_SIO("SIO_000040");
  }

  public static Resource length() {
    return _namespace_SIO("SIO_000041");
  }

  public static Resource width() {
    return _namespace_SIO("SIO_000042");
  }

  public static Resource thickness() {
    return _namespace_SIO("SIO_000043");
  }

  public static Resource area() {
    return _namespace_SIO("SIO_000045");
  }

  public static Resource perimeter() {
    return _namespace_SIO("SIO_000046");
  }

  public static Resource circumference() {
    return _namespace_SIO("SIO_000047");
  }

  public static Resource volume() {
    return _namespace_SIO("SIO_000049");
  }

  /**
   * composition is the quality of having anatomical parts.
   * (http://semanticscience.org/resource/SIO_000051)
   */
  public static Resource composition() {
    return _namespace_SIO("SIO_000051");
  }

  /**
   * A quantity is an informational entity that gives the magnitude of a property.
   * (http://semanticscience.org/resource/SIO_000052)
   */
  public static Resource quantity() {
    return _namespace_SIO("SIO_000052");
  }

  /**
   * shape is the quality of a bearer that relates to its spatial extent.
   * (http://semanticscience.org/resource/SIO_000055)
   */
  public static Resource shape() {
    return _namespace_SIO("SIO_000055");
  }

  /**
   * A measurement of a spatial location relative to a frame of reference or other objects.
   * (http://semanticscience.org/resource/SIO_000056)
   */
  public static Resource position() {
    return _namespace_SIO("SIO_000056");
  }

  /**
   * orientation is an angle between the bearer and an axis, or the angle between the bearer and another object.
   * (http://semanticscience.org/resource/SIO_000057)
   */
  public static Resource orientation() {
    return _namespace_SIO("SIO_000057");
  }

  /**
   * A namespace is an informational entity that defines a logical container for a set of symbols or identifiers.
   * (http://semanticscience.org/resource/SIO_000067)
   */
  public static Resource namespace() {
    return _namespace_SIO("SIO_000067");
  }

  /**
   * a data item consists of information that has been collected/generated towards some purpose.
   * (http://semanticscience.org/resource/SIO_000069)
   */
  public static Resource data_item() {
    return _namespace_SIO("SIO_000069");
  }

  /**
   * A measurement value is a quantitative description that reflects the magnitude of some attribute.
   * (http://semanticscience.org/resource/SIO_000070)
   */
  public static Resource measurement_value() {
    return _namespace_SIO("SIO_000070");
  }

  /**
   * A coordinate is a measurement of position in n-dimensional space.
   * (http://semanticscience.org/resource/SIO_000071)
   */
  public static Resource coordinate() {
    return _namespace_SIO("SIO_000071");
  }

  /**
   * A Cartesian coordinate is the signed distance of a point to some referent line.
   * (http://semanticscience.org/resource/SIO_000072)
   */
  public static Resource cartesian_coordinate() {
    return _namespace_SIO("SIO_000072");
  }

  public static Resource polar_coordinate() {
    return _namespace_SIO("SIO_000073");
  }

  /**
   * A unit of measurement is a definite magnitude of a physical quantity, defined and adopted by convention and/or by law, that is used as a standard for measurement of the same physical quantity.
   * (http://semanticscience.org/resource/SIO_000074)
   */
  public static Resource unit_of_measurement() {
    return _namespace_SIO("SIO_000074");
  }

  /**
   * a mathematical entity is an information content entity that are components of a mathematical system or can be defined in mathematical terms.
   * (http://semanticscience.org/resource/SIO_000075)
   */
  public static Resource mathematical_entity() {
    return _namespace_SIO("SIO_000075");
  }

  /**
   * a plan is a set of intended actions, through which one expects to achieve a goal.
   * (http://semanticscience.org/resource/SIO_000076)
   */
  public static Resource plan() {
    return _namespace_SIO("SIO_000076");
  }

  /**
   * A generic name is the preferred name provided by manufacturer
   * (http://semanticscience.org/resource/SIO_000077)
   */
  public static Resource generic_name() {
    return _namespace_SIO("SIO_000077");
  }

  /**
   * A language entity implements some language specification for the visual interpretation and is part of some document.
   * (http://semanticscience.org/resource/SIO_000078)
   */
  public static Resource language_entity() {
    return _namespace_SIO("SIO_000078");
  }

  /**
   * A visual language entity is a language entity that is expressed through physical expression of manual
   * (http://semanticscience.org/resource/SIO_000079)
   */
  public static Resource visual_language_entity() {
    return _namespace_SIO("SIO_000079");
  }

  /**
   * A figure is a graphical entity which consists of a visual (n-dimentional) arrangement of information entities.
   * (http://semanticscience.org/resource/SIO_000080)
   */
  public static Resource figure() {
    return _namespace_SIO("SIO_000080");
  }

  /**
   * An image is an affine projection of a visual entity to a two dimensional surface.
   * (http://semanticscience.org/resource/SIO_000081)
   */
  public static Resource image() {
    return _namespace_SIO("SIO_000081");
  }

  /**
   * A photograph is an image created by light falling on a light-sensitive surface.
   * (http://semanticscience.org/resource/SIO_000082)
   */
  public static Resource photograph() {
    return _namespace_SIO("SIO_000082");
  }

  /**
   * A statistical graph is a figure that displays the relationship among numeric data and/or mathematical functions.
   * (http://semanticscience.org/resource/SIO_000083)
   */
  public static Resource statistical_graph() {
    return _namespace_SIO("SIO_000083");
  }

  /**
   * A question is a linguistic expression used to make a request for information.
   * (http://semanticscience.org/resource/SIO_000085)
   */
  public static Resource question() {
    return _namespace_SIO("SIO_000085");
  }

  /**
   * A publication is a document that has been made available by a publisher.
   * (http://semanticscience.org/resource/SIO_000087)
   */
  public static Resource publication() {
    return _namespace_SIO("SIO_000087");
  }

  /**
   * A record is a document containing a collection of statements about some entity.
   * (http://semanticscience.org/resource/SIO_000088)
   */
  public static Resource record() {
    return _namespace_SIO("SIO_000088");
  }

  /**
   * A dataset is a data item that is a collection of data items.
   * (http://semanticscience.org/resource/SIO_000089)
   */
  public static Resource data_set() {
    return _namespace_SIO("SIO_000089");
  }

  /**
   * A specification is a description of the essential technical attributes/requirements for an object or procedure, and may be used to determine that the object / procedure meets its requirements/attributes.
   * (http://semanticscience.org/resource/SIO_000090)
   */
  public static Resource specification() {
    return _namespace_SIO("SIO_000090");
  }

  /**
   * An effective specification is a specification composed of a sequence of instructions to achieve some objective.
   * (http://semanticscience.org/resource/SIO_000091)
   */
  public static Resource effective_specification() {
    return _namespace_SIO("SIO_000091");
  }

  /**
   * A biopolymer is an organic polymer using biological components.
   * (http://semanticscience.org/resource/SIO_000092)
   */
  public static Resource biopolymer() {
    return _namespace_SIO("SIO_000092");
  }

  /**
   * An algorithm is an effective method expressed as a finite list of well-defined instructions for calculating a function.
   * (http://semanticscience.org/resource/SIO_000094)
   */
  public static Resource algorithm() {
    return _namespace_SIO("SIO_000094");
  }

  /**
   * a software entity is a computational entity that can be interpreted by or directly executed by a processing unit.
   * (http://semanticscience.org/resource/SIO_000097)
   */
  public static Resource software_entity() {
    return _namespace_SIO("SIO_000097");
  }

  /**
   * A software method (also called subroutine, subprogram, procedure, method, function, or routine) is software designed to execute a specific task
   * (http://semanticscience.org/resource/SIO_000098)
   */
  public static Resource software_method() {
    return _namespace_SIO("SIO_000098");
  }

  /**
   * A software module is software composed of a collection of software methods.
   * (http://semanticscience.org/resource/SIO_000099)
   */
  public static Resource software_module() {
    return _namespace_SIO("SIO_000099");
  }

  /**
   * A software library is software composed of a collection of software modules and/or software methods in a form that can be statically or dynamically linked to some software application.
   * (http://semanticscience.org/resource/SIO_000100)
   */
  public static Resource software_library() {
    return _namespace_SIO("SIO_000100");
  }

  /**
   * A software application is software that can be directly executed by some processing unit.
   * (http://semanticscience.org/resource/SIO_000101)
   */
  public static Resource software_application() {
    return _namespace_SIO("SIO_000101");
  }

  /**
   * A software interpreter is a software application that executes some specified input software.
   * (http://semanticscience.org/resource/SIO_000102)
   */
  public static Resource software_interpreter() {
    return _namespace_SIO("SIO_000102");
  }

  /**
   * A software script is software whose instructions can be executed using a software interpreter.
   * (http://semanticscience.org/resource/SIO_000103)
   */
  public static Resource software_script() {
    return _namespace_SIO("SIO_000103");
  }

  /**
   * Language is a language entity which is the result of encoding and decoding information through systematic creation and usage of systems of symbols, each pairing a specific sign with an intended meaning, established through social conventions
   * (http://semanticscience.org/resource/SIO_000104)
   */
  public static Resource language() {
    return _namespace_SIO("SIO_000104");
  }

  /**
   * A symbol is a proposition about what an entity represents.
   * (http://semanticscience.org/resource/SIO_000105)
   */
  public static Resource symbol() {
    return _namespace_SIO("SIO_000105");
  }

  /**
   * A book is a publication composed of a large number of entries.
   * (http://semanticscience.org/resource/SIO_000106)
   */
  public static Resource book() {
    return _namespace_SIO("SIO_000106");
  }

  /**
   * A chapter is a document section of a book or thesis.
   * (http://semanticscience.org/resource/SIO_000107)
   */
  public static Resource chapter() {
    return _namespace_SIO("SIO_000107");
  }

  /**
   * A character is a language symbol used to construct words.
   * (http://semanticscience.org/resource/SIO_000108)
   */
  public static Resource character() {
    return _namespace_SIO("SIO_000108");
  }

  public static Resource novel() {
    return _namespace_SIO("SIO_000109");
  }

  /**
   * A paragraph is a self-contained unit of written discourse consisting of one or more sentences.
   * (http://semanticscience.org/resource/SIO_000110)
   */
  public static Resource paragraph() {
    return _namespace_SIO("SIO_000110");
  }

  public static Resource document_section() {
    return _namespace_SIO("SIO_000111");
  }

  /**
   * A capability is a realizable entity whose basis lies in one or more parts or qualities and reflects possility of an entity to act in a specified way under certain conditions or in response to a certain stimulus (trigger).
   * (http://semanticscience.org/resource/SIO_000112)
   */
  public static Resource capability() {
    return _namespace_SIO("SIO_000112");
  }

  /**
   * A sentence is a grammatical unit consisting of one or more words that bear minimal syntactic relation to the words that precede or follow it
   * (http://semanticscience.org/resource/SIO_000113)
   */
  public static Resource sentence() {
    return _namespace_SIO("SIO_000113");
  }

  /**
   * A word is the smallest free form (an item that may be expressed in isolation with semantic or pragmatic content) in a language.
   * (http://semanticscience.org/resource/SIO_000114)
   */
  public static Resource word() {
    return _namespace_SIO("SIO_000114");
  }

  /**
   * An identifier is a label that specifically refers to (identifies) an entity (instance/type).
   * (http://semanticscience.org/resource/SIO_000115)
   */
  public static Resource identifier() {
    return _namespace_SIO("SIO_000115");
  }

  public static Resource name() {
    return _namespace_SIO("SIO_000116");
  }

  /**
   * a preferred name is the name that is generally used by some organization.
   * (http://semanticscience.org/resource/SIO_000117)
   */
  public static Resource preferred_name() {
    return _namespace_SIO("SIO_000117");
  }

  /**
   * a common name is a name that is commonly used.
   * (http://semanticscience.org/resource/SIO_000118)
   */
  public static Resource common_name() {
    return _namespace_SIO("SIO_000118");
  }

  /**
   * a brand name is a trademarked and marketed name of a product.
   * (http://semanticscience.org/resource/SIO_000119)
   */
  public static Resource brand_name() {
    return _namespace_SIO("SIO_000119");
  }

  /**
   * a scientific name is a name given through scientific nomenclature.
   * (http://semanticscience.org/resource/SIO_000120)
   */
  public static Resource scientific_name() {
    return _namespace_SIO("SIO_000120");
  }

  /**
   * A magazine is a periodical that typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports.
   * (http://semanticscience.org/resource/SIO_000121)
   */
  public static Resource magazine() {
    return _namespace_SIO("SIO_000121");
  }

  /**
   * A synonym is a word with the same or very similar meanings.
   * (http://semanticscience.org/resource/SIO_000122)
   */
  public static Resource synonym() {
    return _namespace_SIO("SIO_000122");
  }

  /**
   * An antonym is a word with opposite or nearly opposite meaning.
   * (http://semanticscience.org/resource/SIO_000123)
   */
  public static Resource antonym() {
    return _namespace_SIO("SIO_000123");
  }

  /**
   * A hypernym is a term with a broader meaning.
   * (http://semanticscience.org/resource/SIO_000124)
   */
  public static Resource hypernym() {
    return _namespace_SIO("SIO_000124");
  }

  /**
   * A hyponym is a term with a narrower meaning.
   * (http://semanticscience.org/resource/SIO_000125)
   */
  public static Resource hyponym() {
    return _namespace_SIO("SIO_000125");
  }

  /**
   * A homonym is a word that sounds the same but has different meaning.
   * (http://semanticscience.org/resource/SIO_000126)
   */
  public static Resource homonym() {
    return _namespace_SIO("SIO_000126");
  }

  /**
   * A workflow is an algorithm that is is a depiction of a sequence of operations to achieve one or more objectives.
   * (http://semanticscience.org/resource/SIO_000127)
   */
  public static Resource workflow() {
    return _namespace_SIO("SIO_000127");
  }

  public static Resource ontology_document() {
    return _namespace_SIO("SIO_000129");
  }

  /**
   * A pattern is a generalized representation of some repeatable concrete or informational item.
   * (http://semanticscience.org/resource/SIO_000130)
   */
  public static Resource pattern() {
    return _namespace_SIO("SIO_000130");
  }

  public static Resource motif() {
    return _namespace_SIO("SIO_000131");
  }

  /**
   * A descriptor (index term, subject term, subject heading) is a term that captures the essence of the topic of a document.
   * (http://semanticscience.org/resource/SIO_000133)
   */
  public static Resource descriptor() {
    return _namespace_SIO("SIO_000133");
  }

  /**
   * A definition is a description that succintly characterizes an entity.
   * (http://semanticscience.org/resource/SIO_000135)
   */
  public static Resource definition() {
    return _namespace_SIO("SIO_000135");
  }

  /**
   * a description is language entity in which elements of a language (formal or natural) are used to characterize an entity.
   * (http://semanticscience.org/resource/SIO_000136)
   */
  public static Resource description() {
    return _namespace_SIO("SIO_000136");
  }

  /**
   * a category is a class of entities having particular shared characteristics.
   * (http://semanticscience.org/resource/SIO_000137)
   */
  public static Resource category() {
    return _namespace_SIO("SIO_000137");
  }

  /**
   * A class is a collection of sets which can be unambiguously defined by a property that all its members share.
   * (http://semanticscience.org/resource/SIO_000138)
   */
  public static Resource _class_() {
    return _namespace_SIO("SIO_000138");
  }

  /**
   * A web service is a software application that can be accessed over a network, such as the Internet, and executed on a remote system hosting the requested services.
   * (http://semanticscience.org/resource/SIO_000140)
   */
  public static Resource web_service() {
    return _namespace_SIO("SIO_000140");
  }

  /**
   * A criterion is a specification to describe properties used for evaluation.
   * (http://semanticscience.org/resource/SIO_000141)
   */
  public static Resource criterion() {
    return _namespace_SIO("SIO_000141");
  }

  /**
   * An inclusion criterion is a criterion that must be present to satisfy some objective.
   * (http://semanticscience.org/resource/SIO_000142)
   */
  public static Resource inclusion_criterion() {
    return _namespace_SIO("SIO_000142");
  }

  /**
   * An exclusion criterion is a criterion that must be absent to satistify the objective.
   * (http://semanticscience.org/resource/SIO_000143)
   */
  public static Resource exclusion_criterion() {
    return _namespace_SIO("SIO_000143");
  }

  /**
   * A parameter is variable whose value changes the characteristics of a system or a function.
   * (http://semanticscience.org/resource/SIO_000144)
   */
  public static Resource parameter() {
    return _namespace_SIO("SIO_000144");
  }

  /**
   * A monomer is a submolecule that is proper part of some polymer, and is a building block for such polymer.
   * (http://semanticscience.org/resource/SIO_000146)
   */
  public static Resource monomer() {
    return _namespace_SIO("SIO_000146");
  }

  /**
   * A keyword is a descriptor in which the association of the word with the entity facilitates information retrieval.
   * (http://semanticscience.org/resource/SIO_000147)
   */
  public static Resource keyword() {
    return _namespace_SIO("SIO_000147");
  }

  /**
   * A document is a bounded physical or digital representation of a body of information designed with the capacity (and usually intent) to communicate.
   * (http://semanticscience.org/resource/SIO_000148)
   */
  public static Resource document() {
    return _namespace_SIO("SIO_000148");
  }

  /**
   * a list is any enumeration of a set of items.
   * (http://semanticscience.org/resource/SIO_000150)
   */
  public static Resource list() {
    return _namespace_SIO("SIO_000150");
  }

  /**
   * A manuscript is a document prior to publication.
   * (http://semanticscience.org/resource/SIO_000151)
   */
  public static Resource manuscript() {
    return _namespace_SIO("SIO_000151");
  }

  /**
   * A note is a brief document.
   * (http://semanticscience.org/resource/SIO_000152)
   */
  public static Resource note() {
    return _namespace_SIO("SIO_000152");
  }

  /**
   * A patent is an information entity granted by a patent issuing authority which confers upon the patenter the sole right to make, use and sell an invention for a set period of time.
   * (http://semanticscience.org/resource/SIO_000153)
   */
  public static Resource patent() {
    return _namespace_SIO("SIO_000153");
  }

  /**
   * An article is a publication that is stand-alone section of a larger work.
   * (http://semanticscience.org/resource/SIO_000154)
   */
  public static Resource article() {
    return _namespace_SIO("SIO_000154");
  }

  /**
   * A blog is a publication accessible at some website and is typically about various experiences.
   * (http://semanticscience.org/resource/SIO_000155)
   */
  public static Resource blog() {
    return _namespace_SIO("SIO_000155");
  }

  /**
   * A book volume is a book that is part of a collection.
   * (http://semanticscience.org/resource/SIO_000156)
   */
  public static Resource book_volume() {
    return _namespace_SIO("SIO_000156");
  }

  /**
   * A conference proceedings is a book composed of papers presented at a conference.
   * (http://semanticscience.org/resource/SIO_000157)
   */
  public static Resource conference_proceedings() {
    return _namespace_SIO("SIO_000157");
  }

  /**
   * A book series is a collection of books that have been sequentially published.
   * (http://semanticscience.org/resource/SIO_000158)
   */
  public static Resource book_series() {
    return _namespace_SIO("SIO_000158");
  }

  /**
   * An edited publication is a publication that has been examined and potentially changed by an editor.
   * (http://semanticscience.org/resource/SIO_000159)
   */
  public static Resource edited_publication() {
    return _namespace_SIO("SIO_000159");
  }

  /**
   * A journal is a a peer-reviewed periodical in which scholarship relating to a particular academic discipline is published.
   * (http://semanticscience.org/resource/SIO_000160)
   */
  public static Resource journal() {
    return _namespace_SIO("SIO_000160");
  }

  /**
   * A manual is a document that instructs on the usage of a device.
   * (http://semanticscience.org/resource/SIO_000161)
   */
  public static Resource manual() {
    return _namespace_SIO("SIO_000161");
  }

  /**
   * A periodical is a publication that appears on a regular schedule.
   * (http://semanticscience.org/resource/SIO_000162)
   */
  public static Resource periodical() {
    return _namespace_SIO("SIO_000162");
  }

  public static Resource newspaper() {
    return _namespace_SIO("SIO_000163");
  }

  /**
   * A technical report is a publication published by a school or other institution, usually numbered within a series.
   * (http://semanticscience.org/resource/SIO_000164)
   */
  public static Resource technical_report() {
    return _namespace_SIO("SIO_000164");
  }

  /**
   * A tehsis document is the written research component of a post-secondary institution  that contains a statement supported by arguments.
   * (http://semanticscience.org/resource/SIO_000165)
   */
  public static Resource thesis_document() {
    return _namespace_SIO("SIO_000165");
  }

  /**
   * An honor"s thesis is a thesis prepared as a requirement for an honor"s undergraduate degree.
   * (http://semanticscience.org/resource/SIO_000166)
   */
  public static Resource honor_s_thesis() {
    return _namespace_SIO("SIO_000166");
  }

  /**
   * A Master"s thesis is a thesis prepared as a requirement for a Master"s degree.
   * (http://semanticscience.org/resource/SIO_000167)
   */
  public static Resource master_s_thesis() {
    return _namespace_SIO("SIO_000167");
  }

  /**
   * A PhD thesis is a thesis prepared as a requirement for a doctoral degree.
   * (http://semanticscience.org/resource/SIO_000168)
   */
  public static Resource phd_thesis() {
    return _namespace_SIO("SIO_000168");
  }

  /**
   * A booklet is a document that lacks a named publisher or sponsoring institution.
   * (http://semanticscience.org/resource/SIO_000169)
   */
  public static Resource booklet() {
    return _namespace_SIO("SIO_000169");
  }

  /**
   * A diary is a document which describes day-to-day experiences.
   * (http://semanticscience.org/resource/SIO_000170)
   */
  public static Resource diary() {
    return _namespace_SIO("SIO_000170");
  }

  /**
   * A bibliographic attribute is an attribute related to publications.
   * (http://semanticscience.org/resource/SIO_000171)
   */
  public static Resource document_component() {
    return _namespace_SIO("SIO_000171");
  }

  /**
   * An address is a position that indicates the physical location of some entity using a social convention.
   * (http://semanticscience.org/resource/SIO_000172)
   */
  public static Resource address() {
    return _namespace_SIO("SIO_000172");
  }

  /**
   * An affiliation is a social structure which indicates the partnership between two or more entities.
   * (http://semanticscience.org/resource/SIO_000173)
   */
  public static Resource affiliation() {
    return _namespace_SIO("SIO_000173");
  }

  /**
   * A citation is a textual entity which denotes a source described in the bibliography or reference section of a document.
   * (http://semanticscience.org/resource/SIO_000174)
   */
  public static Resource citation() {
    return _namespace_SIO("SIO_000174");
  }

  /**
   * A document title is a  textual entity that summarizes the topic of the document in one sentence.
   * (http://semanticscience.org/resource/SIO_000175)
   */
  public static Resource document_title() {
    return _namespace_SIO("SIO_000175");
  }

  /**
   * A reference is a textual entity that describes a single source used in the preparation or development of the work.
   * (http://semanticscience.org/resource/SIO_000176)
   */
  public static Resource reference() {
    return _namespace_SIO("SIO_000176");
  }

  /**
   * A page range denotes the start and end page in some document.
   * (http://semanticscience.org/resource/SIO_000177)
   */
  public static Resource page_range() {
    return _namespace_SIO("SIO_000177");
  }

  /**
   * A page total is a textual entity that is about the number of pages in some informational entity.
   * (http://semanticscience.org/resource/SIO_000178)
   */
  public static Resource page_total() {
    return _namespace_SIO("SIO_000178");
  }

  /**
   * a label is a term that is associated with some entity
   * (http://semanticscience.org/resource/SIO_000179)
   */
  public static Resource label() {
    return _namespace_SIO("SIO_000179");
  }

  /**
   * A language label is a label that denotes the language of a textual entity.
   * (http://semanticscience.org/resource/SIO_000180)
   */
  public static Resource language_label() {
    return _namespace_SIO("SIO_000180");
  }

  /**
   * A first name is a name that denotes a specific individual between members of a group of individuals, whose members usually share the same surname.
   * (http://semanticscience.org/resource/SIO_000181)
   */
  public static Resource first_name() {
    return _namespace_SIO("SIO_000181");
  }

  /**
   * A last name (surname) is a name added to a given name and is part of a personal name and is often the family name.
   * (http://semanticscience.org/resource/SIO_000182)
   */
  public static Resource last_name() {
    return _namespace_SIO("SIO_000182");
  }

  /**
   * A personal name is a name to identify an individual person and usually comprises of a first name and a last name.
   * (http://semanticscience.org/resource/SIO_000183)
   */
  public static Resource personal_name() {
    return _namespace_SIO("SIO_000183");
  }

  /**
   * A legal name is a name given at birth, or which appears on their birth certificate, marriage certificate, or change of name certificate.
   * (http://semanticscience.org/resource/SIO_000184)
   */
  public static Resource legal_name() {
    return _namespace_SIO("SIO_000184");
  }

  /**
   * A title is a textual entity that summarily describes some entity.
   * (http://semanticscience.org/resource/SIO_000185)
   */
  public static Resource title() {
    return _namespace_SIO("SIO_000185");
  }

  /**
   * A document version is a version of a work in some sequence of derivative works.
   * (http://semanticscience.org/resource/SIO_000186)
   */
  public static Resource document_version() {
    return _namespace_SIO("SIO_000186");
  }

  /**
   * An abstract section is a document section that provides brief summary of a document that explains the main argument(s), topic(s) or findings.
   * (http://semanticscience.org/resource/SIO_000188)
   */
  public static Resource abstract_section() {
    return _namespace_SIO("SIO_000188");
  }

  /**
   * An acknowledgements section is a document section that identifies individuals, groups or organizations for their support in the development of the work.
   * (http://semanticscience.org/resource/SIO_000189)
   */
  public static Resource acknowledgements_section() {
    return _namespace_SIO("SIO_000189");
  }

  /**
   * An author contribution section is a document section that describes the contribution of the authors.
   * (http://semanticscience.org/resource/SIO_000190)
   */
  public static Resource author_contribution_section() {
    return _namespace_SIO("SIO_000190");
  }

  /**
   * An author section is a document section that lists the contributing authors.
   * (http://semanticscience.org/resource/SIO_000191)
   */
  public static Resource author_section() {
    return _namespace_SIO("SIO_000191");
  }

  /**
   * A bibliography section is a document section that is composed of a list of references used in the development of the work.
   * (http://semanticscience.org/resource/SIO_000192)
   */
  public static Resource bibliography_section() {
    return _namespace_SIO("SIO_000192");
  }

  /**
   * A copyright section is a document section that contains a notice of copyright.
   * (http://semanticscience.org/resource/SIO_000193)
   */
  public static Resource copyright_section() {
    return _namespace_SIO("SIO_000193");
  }

  /**
   * A correspondence section is a document section that contains the details for contacting the corresponding author.
   * (http://semanticscience.org/resource/SIO_000194)
   */
  public static Resource correspondence_section() {
    return _namespace_SIO("SIO_000194");
  }

  /**
   * The discussion section is a document section containing a summary of the findings, a reflection on the significance of findings, comparison with related work, among others.
   * (http://semanticscience.org/resource/SIO_000195)
   */
  public static Resource discussion_section() {
    return _namespace_SIO("SIO_000195");
  }

  /**
   * An introduction section is a document section that generally provides background, motivation and goals of the work.
   * (http://semanticscience.org/resource/SIO_000196)
   */
  public static Resource introduction_section() {
    return _namespace_SIO("SIO_000196");
  }

  /**
   * The materials and methods section is a document section containing a description of the materials and methods used in the study.
   * (http://semanticscience.org/resource/SIO_000197)
   */
  public static Resource materials_and_methods_section() {
    return _namespace_SIO("SIO_000197");
  }

  /**
   * The materials section is a document section containing a description of the materials used in the study.
   * (http://semanticscience.org/resource/SIO_000198)
   */
  public static Resource materials_section() {
    return _namespace_SIO("SIO_000198");
  }

  /**
   * The methods section is a document section containing a description of the methods used in the study.
   * (http://semanticscience.org/resource/SIO_000199)
   */
  public static Resource methods_section() {
    return _namespace_SIO("SIO_000199");
  }

  /**
   * The results section is a document section describing the main findings of the study.
   * (http://semanticscience.org/resource/SIO_000200)
   */
  public static Resource results_section() {
    return _namespace_SIO("SIO_000200");
  }

  /**
   * The table of contents is a document section that lists all sections (and optionally subsections) in a sequential order along with their page number.
   * (http://semanticscience.org/resource/SIO_000201)
   */
  public static Resource table_of_contents() {
    return _namespace_SIO("SIO_000201");
  }

  /**
   * implication is a logical operator that holds between a set T of propositions and a proposition B, when every model (or interpretation or valuation) of T is also a model of B.
   * (http://semanticscience.org/resource/SIO_000220)
   */
  public static Resource implies() {
    return _namespace_SIO("SIO_000220");
  }

  /**
   * A namespace label is a short name for a namespace.
   * (http://semanticscience.org/resource/SIO_000237)
   */
  public static Resource namespace_label() {
    return _namespace_SIO("SIO_000237");
  }

  public static Resource logical_operator() {
    return _namespace_SIO("SIO_000238");
  }

  /**
   * AND is a logical operator that has the value true if both of its operands are true, otherwise a value of false.
   * (http://semanticscience.org/resource/SIO_000239)
   */
  public static Resource conjunction_and() {
    return _namespace_SIO("SIO_000239");
  }

  /**
   * A proposition is a sentence expressing something true or false.
   * (http://semanticscience.org/resource/SIO_000256)
   */
  public static Resource proposition() {
    return _namespace_SIO("SIO_000256");
  }

  /**
   * A dimensionless quantity is a quantity that has no associated unit.
   * (http://semanticscience.org/resource/SIO_000257)
   */
  public static Resource dimensionless_quantity() {
    return _namespace_SIO("SIO_000257");
  }

  /**
   * A dimensional quantity is a quantity that has an associated unit.
   * (http://semanticscience.org/resource/SIO_000258)
   */
  public static Resource dimensional_quantity() {
    return _namespace_SIO("SIO_000258");
  }

  /**
   * An argument is a set of one or more declarative sentences (or propositions) known as the premises along with another declarative sentence (or proposition) known as the conclusion.
   * (http://semanticscience.org/resource/SIO_000259)
   */
  public static Resource argument() {
    return _namespace_SIO("SIO_000259");
  }

  /**
   * A premise is a proposition of an argument from which the conclusion is drawn.
   * (http://semanticscience.org/resource/SIO_000261)
   */
  public static Resource premise() {
    return _namespace_SIO("SIO_000261");
  }

  /**
   * A conclusion is a proposition which is reached after considering the evidence, arguments or premises.
   * (http://semanticscience.org/resource/SIO_000262)
   */
  public static Resource conclusion() {
    return _namespace_SIO("SIO_000262");
  }

  /**
   * A deductive argument is an argument that asserts that the truth of the conclusion is a logical consequence of the premises.
   * (http://semanticscience.org/resource/SIO_000263)
   */
  public static Resource deductive_argument() {
    return _namespace_SIO("SIO_000263");
  }

  /**
   * An inductive argument is an argument that asserts that the truth of the conclusion is supported by the premises.
   * (http://semanticscience.org/resource/SIO_000264)
   */
  public static Resource inductive_argument() {
    return _namespace_SIO("SIO_000264");
  }

  /**
   * A sound argument is a valid argument with true premises.
   * (http://semanticscience.org/resource/SIO_000265)
   */
  public static Resource sound_argument() {
    return _namespace_SIO("SIO_000265");
  }

  /**
   * A valid argument is an argument where the truth of the conclusion is a logical consequence of the premises and (consequently) its corresponding conditional is a necessary truth.
   * (http://semanticscience.org/resource/SIO_000266)
   */
  public static Resource valid_argument() {
    return _namespace_SIO("SIO_000266");
  }

  /**
   * An invalid argument is an argument where the truth of the conclusion is false because it is not a logical consequence of the premises.
   * (http://semanticscience.org/resource/SIO_000267)
   */
  public static Resource invalid_argument() {
    return _namespace_SIO("SIO_000267");
  }

  /**
   * truth value is a quality of information that is claimed/verified to be true or false.
   * (http://semanticscience.org/resource/SIO_000268)
   */
  public static Resource truth_value() {
    return _namespace_SIO("SIO_000268");
  }

  public static Resource _true_() {
    return _namespace_SIO("SIO_000269");
  }

  public static Resource _false_() {
    return _namespace_SIO("SIO_000270");
  }

  /**
   * A term is a word or phrase used to denote one or more entities.
   * (http://semanticscience.org/resource/SIO_000275)
   */
  public static Resource term() {
    return _namespace_SIO("SIO_000275");
  }

  /**
   * An emotion is a quality that an individual experiences due to an internal state of being or an involuntary physiological response.
   * (http://semanticscience.org/resource/SIO_000276)
   */
  public static Resource emotion() {
    return _namespace_SIO("SIO_000276");
  }

  /**
   * mass is the quality of the amount of substance.
   * (http://semanticscience.org/resource/SIO_000279)
   */
  public static Resource mass() {
    return _namespace_SIO("SIO_000279");
  }

  public static Resource disjunction_or() {
    return _namespace_SIO("SIO_000280");
  }

  /**
   * NOT is a logical operator in that has the value true if its operand is false.
   * (http://semanticscience.org/resource/SIO_000281)
   */
  public static Resource negation_not() {
    return _namespace_SIO("SIO_000281");
  }

  /**
   * XOR, also called exclusive disjunction or (symbolized XOR, EOR, EXOR, or ⊕), is a type of logical disjunction on two operands that results in a value of true if exactly one of the operands has a value of true.
   * (http://semanticscience.org/resource/SIO_000282)
   */
  public static Resource exclusive_disjunction_xor() {
    return _namespace_SIO("SIO_000282");
  }

  /**
   * a hypothesis is a proposed explanation for a phenomenon.
   * (http://semanticscience.org/resource/SIO_000284)
   */
  public static Resource hypothesis() {
    return _namespace_SIO("SIO_000284");
  }

  public static Resource academic_organization() {
    return _namespace_SIO("SIO_000285");
  }

  public static Resource social_relation() {
    return _namespace_SIO("SIO_000287");
  }

  /**
   * a set is a collection of entities, for which there may be zero members.
   * (http://semanticscience.org/resource/SIO_000289)
   */
  public static Resource set() {
    return _namespace_SIO("SIO_000289");
  }

  public static Resource university() {
    return _namespace_SIO("SIO_000290");
  }

  public static Resource collection_of_documents() {
    return _namespace_SIO("SIO_000295");
  }

  /**
   * A website is a collection of documents published on the World Wide Web.
   * (http://semanticscience.org/resource/SIO_000296)
   */
  public static Resource website() {
    return _namespace_SIO("SIO_000296");
  }

  /**
   * A movie is a series of images that are displayed in rapid succession  to give the impression of movement.
   * (http://semanticscience.org/resource/SIO_000297)
   */
  public static Resource movie() {
    return _namespace_SIO("SIO_000297");
  }

  /**
   * An excerpt is a contiguous or discontiguous portion of a document.
   * (http://semanticscience.org/resource/SIO_000298)
   */
  public static Resource excerpt() {
    return _namespace_SIO("SIO_000298");
  }

  /**
   * A quote is a excerpt that is attributed to a particular source.
   * (http://semanticscience.org/resource/SIO_000299)
   */
  public static Resource quote() {
    return _namespace_SIO("SIO_000299");
  }

  /**
   * A geographic image is a photograph of some geographical area.
   * (http://semanticscience.org/resource/SIO_000301)
   */
  public static Resource geographic_image() {
    return _namespace_SIO("SIO_000301");
  }

  /**
   * A web page is a document that is published according to World Wide Web standards.
   * (http://semanticscience.org/resource/SIO_000302)
   */
  public static Resource web_page() {
    return _namespace_SIO("SIO_000302");
  }

  /**
   * Email message is a digital document that is composed of a header and a body and is transmitted using the SMTP protocol.
   * (http://semanticscience.org/resource/SIO_000304)
   */
  public static Resource email() {
    return _namespace_SIO("SIO_000304");
  }

  /**
   * process number is a number associated with a process that denotes its ordinal position in a set of processes.
   * (http://semanticscience.org/resource/SIO_000305)
   */
  public static Resource process_number() {
    return _namespace_SIO("SIO_000305");
  }

  /**
   * A letter is a document that contains a personal communication from one part to another.
   * (http://semanticscience.org/resource/SIO_000306)
   */
  public static Resource letter() {
    return _namespace_SIO("SIO_000306");
  }

  /**
   * normality is the quality in which the value may differ from normal or average
   * (http://semanticscience.org/resource/SIO_000307)
   */
  public static Resource normality() {
    return _namespace_SIO("SIO_000307");
  }

  /**
   * An edition number is count of a literary work edited and published, as by a certain editor or in a certain manner including being printed during some interval of time.
   * (http://semanticscience.org/resource/SIO_000308)
   */
  public static Resource edition_number() {
    return _namespace_SIO("SIO_000308");
  }

  public static Resource volume_number() {
    return _namespace_SIO("SIO_000309");
  }

  public static Resource polymer() {
    return _namespace_SIO("SIO_000314");
  }

  /**
   * A functional specification is a specification that describes the characteristics of an object.
   * (http://semanticscience.org/resource/SIO_000315)
   */
  public static Resource functional_specification() {
    return _namespace_SIO("SIO_000315");
  }

  /**
   * A design specification is a specification that provides precise and explicit information about the requirements for a product design.
   * (http://semanticscience.org/resource/SIO_000316)
   */
  public static Resource design_specification() {
    return _namespace_SIO("SIO_000316");
  }

  /**
   * A specification for spatial location is an effective specification towards representation spatial position or spatial data.
   * (http://semanticscience.org/resource/SIO_000317)
   */
  public static Resource spatial_specification() {
    return _namespace_SIO("SIO_000317");
  }

  /**
   * Longitude is a geographic position that refers to  the angle east or west of a reference meridian between the two geographical poles to another meridian that passes through an arbitrary point.
   * (http://semanticscience.org/resource/SIO_000318)
   */
  public static Resource longitude() {
    return _namespace_SIO("SIO_000318");
  }

  /**
   * Latitude is a geographic coordinate which refers to the angle from a point on the Earth"s surface to the equatorial plane
   * (http://semanticscience.org/resource/SIO_000319)
   */
  public static Resource latitude() {
    return _namespace_SIO("SIO_000319");
  }

  /**
   * A coordinate system is a specification for spatial location that uses a set of numbers, or coordinates, to uniquely determine the position of a point or other geometric element.
   * (http://semanticscience.org/resource/SIO_000320)
   */
  public static Resource coordinate_system() {
    return _namespace_SIO("SIO_000320");
  }

  /**
   * A Cartesian coordinate system specifies each point uniquely in a plane by a pair of numerical coordinates, which are the signed distances from the point to two fixed perpendicular directed lines, measured in the same unit of length.
   * (http://semanticscience.org/resource/SIO_000321)
   */
  public static Resource cartesian_coordinate_system() {
    return _namespace_SIO("SIO_000321");
  }

  /**
   * A concept is term that refers to a generalization of a set of attributes or entities.
   * (http://semanticscience.org/resource/SIO_000326)
   */
  public static Resource concept() {
    return _namespace_SIO("SIO_000326");
  }

  public static Resource polar_coordinate_system() {
    return _namespace_SIO("SIO_000327");
  }

  /**
   * a positional description is a description of location using some system or frame of reference.
   * (http://semanticscience.org/resource/SIO_000328)
   */
  public static Resource positional_description() {
    return _namespace_SIO("SIO_000328");
  }

  public static Resource cylindrical_coordinate_system() {
    return _namespace_SIO("SIO_000329");
  }

  public static Resource spherical_coordinate_system() {
    return _namespace_SIO("SIO_000330");
  }

  public static Resource OWL_ontology() {
    return _namespace_SIO("SIO_000331");
  }

  /**
   * a 3D cartesian coordinate is a coordinate that is composed of an x,y and z coordinate.
   * (http://semanticscience.org/resource/SIO_000333)
   */
  public static Resource a_D_cartesian_coordinate() {
    return _namespace_SIO("SIO_000333");
  }

  /**
   * an objective is a proposition that indicates a planned or anticipated outcome.
   * (http://semanticscience.org/resource/SIO_000337)
   */
  public static Resource objective() {
    return _namespace_SIO("SIO_000337");
  }

  /**
   * A realizable entity is an attribute that is exhibited under some condition and is realized in some process.
   * (http://semanticscience.org/resource/SIO_000340)
   */
  public static Resource realizable_entity() {
    return _namespace_SIO("SIO_000340");
  }

  /**
   * a term variant is a term that is a variant of another term.
   * (http://semanticscience.org/resource/SIO_000342)
   */
  public static Resource term_variant() {
    return _namespace_SIO("SIO_000342");
  }

  public static Resource to_modify() {
    return _namespace_SIO("SIO_000343");
  }

  /**
   * To record is the capability to register or collect information in a specified format on some physical medium.
   * (http://semanticscience.org/resource/SIO_000344)
   */
  public static Resource to_record() {
    return _namespace_SIO("SIO_000344");
  }

  /**
   * To magnify is the capability to increase the appearance of the size of an object.
   * (http://semanticscience.org/resource/SIO_000345)
   */
  public static Resource to_magnify() {
    return _namespace_SIO("SIO_000345");
  }

  /**
   * To heat is a capability to increase the internal kinetic energy of a material.
   * (http://semanticscience.org/resource/SIO_000346)
   */
  public static Resource to_heat() {
    return _namespace_SIO("SIO_000346");
  }

  /**
   * To cool is the capability to decrease the internal kinetic energy of a material.
   * (http://semanticscience.org/resource/SIO_000347)
   */
  public static Resource to_cool() {
    return _namespace_SIO("SIO_000347");
  }

  /**
   * To freeze is the capability to decrease the internal kinetic energy of a material such that it changes state from a gas or liquid to a solid.
   * (http://semanticscience.org/resource/SIO_000348)
   */
  public static Resource to_freeze() {
    return _namespace_SIO("SIO_000348");
  }

  /**
   * To separate is the capability to i) distinguish some entities based on some attribute(s) and ii) subsequently physically displace them.
   * (http://semanticscience.org/resource/SIO_000349)
   */
  public static Resource to_separate() {
    return _namespace_SIO("SIO_000349");
  }

  /**
   * To ionize is the capability to physically convert an atom or molecule into an ion by adding or removing charged particles such as electrons or other ions.
   * (http://semanticscience.org/resource/SIO_000350)
   */
  public static Resource to_ionize() {
    return _namespace_SIO("SIO_000350");
  }

  /**
   * To supply energy is the capability to transfer energy from a source to a sink.
   * (http://semanticscience.org/resource/SIO_000351)
   */
  public static Resource to_supply_energy() {
    return _namespace_SIO("SIO_000351");
  }

  /**
   * to observe is the capability to watch attentively.
   * (http://semanticscience.org/resource/SIO_000353)
   */
  public static Resource to_observe() {
    return _namespace_SIO("SIO_000353");
  }

  /**
   * dysfunction is a capability to act in an abnormal or unintended manner.
   * (http://semanticscience.org/resource/SIO_000354)
   */
  public static Resource dysfunction() {
    return _namespace_SIO("SIO_000354");
  }

  public static Resource fitness() {
    return _namespace_SIO("SIO_000357");
  }

  /**
   * intent is a desire to realize a particular outcome.
   * (http://semanticscience.org/resource/SIO_000358)
   */
  public static Resource intent() {
    return _namespace_SIO("SIO_000358");
  }

  public static Resource purpose() {
    return _namespace_SIO("SIO_000359");
  }

  /**
   * a belief is a proposition that is believed to be true.
   * (http://semanticscience.org/resource/SIO_000360)
   */
  public static Resource belief() {
    return _namespace_SIO("SIO_000360");
  }

  /**
   * A number is a mathematical object used to count, label, and measure.
   * (http://semanticscience.org/resource/SIO_000366)
   */
  public static Resource number() {
    return _namespace_SIO("SIO_000366");
  }

  /**
   * a variable is a value that may change within the scope of a given problem or set of operations.
   * (http://semanticscience.org/resource/SIO_000367)
   */
  public static Resource variable() {
    return _namespace_SIO("SIO_000367");
  }

  /**
   * An equation is a mathematical statement that asserts the equality of two expressions.
   * (http://semanticscience.org/resource/SIO_000368)
   */
  public static Resource equation() {
    return _namespace_SIO("SIO_000368");
  }

  /**
   * a spatial region is an object contained in some region of space.
   * (http://semanticscience.org/resource/SIO_000370)
   */
  public static Resource spatial_region() {
    return _namespace_SIO("SIO_000370");
  }

  /**
   * To measure is the capability to obtain information about some entity by examining its attributes in relation to some reference metric.
   * (http://semanticscience.org/resource/SIO_000371)
   */
  public static Resource to_measure() {
    return _namespace_SIO("SIO_000371");
  }

  /**
   * To inject is the capability to administer a substance into some object through its external barrier.
   * (http://semanticscience.org/resource/SIO_000372)
   */
  public static Resource to_inject() {
    return _namespace_SIO("SIO_000372");
  }

  /**
   * To boil is the capability to increase the internal kinetic energy of a material such that it changes state from a solid or liquid to a gas.
   * (http://semanticscience.org/resource/SIO_000373)
   */
  public static Resource to_boil() {
    return _namespace_SIO("SIO_000373");
  }

  public static Resource to_reduce_energy() {
    return _namespace_SIO("SIO_000374");
  }

  /**
   * To supply electricity is the capability to transfer electricity from a source to a sink.
   * (http://semanticscience.org/resource/SIO_000375)
   */
  public static Resource to_supply_electricity() {
    return _namespace_SIO("SIO_000375");
  }

  public static Resource to_change_materially() {
    return _namespace_SIO("SIO_000376");
  }

  /**
   * To demagnify is the capability to decrease the appearance of the size of an object.
   * (http://semanticscience.org/resource/SIO_000377)
   */
  public static Resource to_demagnify() {
    return _namespace_SIO("SIO_000377");
  }

  public static Resource to_change_appearance() {
    return _namespace_SIO("SIO_000378");
  }

  /**
   * Perception is the organization, identification, and interpretation of sensory information in order to fabricate a mental representation through the process of transduction, which sensors in the body transform signals from the environment into encoded neural signals.
   * (http://semanticscience.org/resource/SIO_000379)
   */
  public static Resource perception() {
    return _namespace_SIO("SIO_000379");
  }

  /**
   * To contain is the capability to bound or constrain a physical entity in some site.
   * (http://semanticscience.org/resource/SIO_000380)
   */
  public static Resource to_contain() {
    return _namespace_SIO("SIO_000380");
  }

  /**
   * To immobilize is the capability to contain an entity in such a way that it may not move in space.
   * (http://semanticscience.org/resource/SIO_000381)
   */
  public static Resource to_immobilize() {
    return _namespace_SIO("SIO_000381");
  }

  /**
   * To filter is the capability to retain certain entities based on selected attribute(s) while allowing other entities to pass through.
   * (http://semanticscience.org/resource/SIO_000382)
   */
  public static Resource to_filter() {
    return _namespace_SIO("SIO_000382");
  }

  /**
   * To excite is the capability to supply energy to a materila by bombarding it with energetic particles (e.g., photons).
   * (http://semanticscience.org/resource/SIO_000383)
   */
  public static Resource to_excite() {
    return _namespace_SIO("SIO_000383");
  }

  /**
   * To emit is the capability to release some physical entity (light, pollution, etc).
   * (http://semanticscience.org/resource/SIO_000384)
   */
  public static Resource to_emit() {
    return _namespace_SIO("SIO_000384");
  }

  public static Resource to_change_energetically() {
    return _namespace_SIO("SIO_000385");
  }

  /**
   * Ambiguous label.
   */
  public static Set<Resource> to_oxidize() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SIO("SIO_000386"), _namespace_SIO("SIO_010358") }));
  }

  /**
   * Ambiguous label.
   */
  public static Set<Resource> to_reduce() {
    return new HashSet<Resource>(Arrays.asList(new Resource[] { _namespace_SIO("SIO_000387"), _namespace_SIO("SIO_010359") }));
  }

  /**
   * to assemble is the capability to combine entities together into a larger object that persists in time.
   * (http://semanticscience.org/resource/SIO_000388)
   */
  public static Resource to_assemble() {
    return _namespace_SIO("SIO_000388");
  }

  /**
   * To extract is the capability to remove certain entities based on selected attribute(s) while allowing other entities to remain.
   * (http://semanticscience.org/resource/SIO_000389)
   */
  public static Resource to_extract() {
    return _namespace_SIO("SIO_000389");
  }

  /**
   * to transport is the capability to displace a material from one location to another.
   * (http://semanticscience.org/resource/SIO_000390)
   */
  public static Resource to_transport() {
    return _namespace_SIO("SIO_000390");
  }

  /**
   * time measurement is a measurement value of the duration of some interval of time or a particular instant of time (against some frame of reference).
   * (http://semanticscience.org/resource/SIO_000391)
   */
  public static Resource time_measurement() {
    return _namespace_SIO("SIO_000391");
  }

  /**
   * to change spatially is the capability to affect the physical movement of some entity.
   * (http://semanticscience.org/resource/SIO_000392)
   */
  public static Resource to_change_spatially() {
    return _namespace_SIO("SIO_000392");
  }

  public static Resource patient() {
    return _namespace_SIO("SIO_000393");
  }

  public static Resource doctor() {
    return _namespace_SIO("SIO_000394");
  }

  public static Resource to_regulate() {
    return _namespace_SIO("SIO_000395");
  }

  public static Resource file() {
    return _namespace_SIO("SIO_000396");
  }

  public static Resource to_provide() {
    return _namespace_SIO("SIO_000397");
  }

  public static Resource nurse() {
    return _namespace_SIO("SIO_000398");
  }

  public static Resource study_subject() {
    return _namespace_SIO("SIO_000399");
  }

  /**
   * an x cartesian coordinate is the coordinate of an object onto the x-axis of a cartesian coordinate system.
   * (http://semanticscience.org/resource/SIO_000400)
   */
  public static Resource x_cartesian_coordinate() {
    return _namespace_SIO("SIO_000400");
  }

  /**
   * an y cartesian coordinate is the coordinate of an object onto the y-axis of a cartesian coordinate system.
   * (http://semanticscience.org/resource/SIO_000401)
   */
  public static Resource y_cartesian_coordinate() {
    return _namespace_SIO("SIO_000401");
  }

  /**
   * a z cartesian coordinate is the coordinate of an object onto the z-axis of a cartesian coordinate system.
   * (http://semanticscience.org/resource/SIO_000402)
   */
  public static Resource z_cartesian_coordinate() {
    return _namespace_SIO("SIO_000402");
  }

  /**
   * a study group is a group of individuals that are subjects in an observational or intervention study.
   * (http://semanticscience.org/resource/SIO_000403)
   */
  public static Resource study_group() {
    return _namespace_SIO("SIO_000403");
  }

  public static Resource professor() {
    return _namespace_SIO("SIO_000404");
  }

  public static Resource student() {
    return _namespace_SIO("SIO_000405");
  }

  public static Resource academic() {
    return _namespace_SIO("SIO_000406");
  }

  public static Resource to_increase_the_rate_of_formation() {
    return _namespace_SIO("SIO_000407");
  }

  public static Resource to_investigate() {
    return _namespace_SIO("SIO_000408");
  }

  /**
   * a mutual disposition is a disposition that simulataneously invokes another disposition when realized.
   * (http://semanticscience.org/resource/SIO_000409)
   */
  public static Resource mutual_disposition() {
    return _namespace_SIO("SIO_000409");
  }

  /**
   * anger is disgust directed toward an equal status individual.
   * (http://semanticscience.org/resource/SIO_000410)
   */
  public static Resource anger() {
    return _namespace_SIO("SIO_000410");
  }

  /**
   * Hate is a deep and emotional extreme dislike, directed against a certain object or class of objects.
   * (http://semanticscience.org/resource/SIO_000411)
   */
  public static Resource hate() {
    return _namespace_SIO("SIO_000411");
  }

  /**
   * Love is an emotion of a strong affection and personal attachment.
   * (http://semanticscience.org/resource/SIO_000412)
   */
  public static Resource love() {
    return _namespace_SIO("SIO_000412");
  }

  /**
   * A geolegal region is a geographic region which has causal powers confered by a legal entity.
   * (http://semanticscience.org/resource/SIO_000413)
   */
  public static Resource geolegal_region() {
    return _namespace_SIO("SIO_000413");
  }

  /**
   * a geographic region is a spatial region whose boundaries are typically defined against some material frame of reference (like the earth).
   * (http://semanticscience.org/resource/SIO_000414)
   */
  public static Resource geographic_region() {
    return _namespace_SIO("SIO_000414");
  }

  public static Resource geopolitical_region() {
    return _namespace_SIO("SIO_000415");
  }

  /**
   * a time internval is a contiguous temporal region having some duration.
   * (http://semanticscience.org/resource/SIO_000417)
   */
  public static Resource time_interval() {
    return _namespace_SIO("SIO_000417");
  }

  /**
   * a time instant is a temporal region which occurs instantaneously e.g. having no duration.
   * (http://semanticscience.org/resource/SIO_000418)
   */
  public static Resource time_instant() {
    return _namespace_SIO("SIO_000418");
  }

  /**
   * A table is a figure that consists of an ordered arrangement of columns and rows.
   * (http://semanticscience.org/resource/SIO_000419)
   */
  public static Resource table() {
    return _namespace_SIO("SIO_000419");
  }

  /**
   * A scatterplot is a statistical graph which uses Cartesian coordinates to display values for two variables for a set of data. The data is displayed as a collection of points, each having the value of one variable determining the position on the horizontal axis and the value of the other variable determining the position on the vertical axis.
   * (http://semanticscience.org/resource/SIO_000423)
   */
  public static Resource scatterplot() {
    return _namespace_SIO("SIO_000423");
  }

  public static Resource year() {
    return _namespace_SIO("SIO_000428");
  }

  public static Resource month() {
    return _namespace_SIO("SIO_000429");
  }

  public static Resource day() {
    return _namespace_SIO("SIO_000430");
  }

  public static Resource century() {
    return _namespace_SIO("SIO_000431");
  }

  public static Resource millenium() {
    return _namespace_SIO("SIO_000432");
  }

  public static Resource hour() {
    return _namespace_SIO("SIO_000433");
  }

  public static Resource minute() {
    return _namespace_SIO("SIO_000434");
  }

  public static Resource second() {
    return _namespace_SIO("SIO_000435");
  }

  /**
   * an informational quality is a quality that pertains to information.
   * (http://semanticscience.org/resource/SIO_000436)
   */
  public static Resource informational_quality() {
    return _namespace_SIO("SIO_000436");
  }

  /**
   * a 2D cartesian point is a point whose position is specified along two  dimensions using Cartesian coordinates.
   * (http://semanticscience.org/resource/SIO_000437)
   */
  public static Resource a_D_cartesian_point() {
    return _namespace_SIO("SIO_000437");
  }

  public static Resource altitude() {
    return _namespace_SIO("SIO_000438");
  }

  /**
   * the center of mass (aka barycenter) is the weighted average location of all the mass in a body or group of bodies.
   * (http://semanticscience.org/resource/SIO_000439)
   */
  public static Resource center_of_mass() {
    return _namespace_SIO("SIO_000439");
  }

  /**
   * A line graph is a statistical graph in which lines contains the evaluation of functions or individual points connected by line segments.
   * (http://semanticscience.org/resource/SIO_000442)
   */
  public static Resource line_graph() {
    return _namespace_SIO("SIO_000442");
  }

  /**
   * A bar graph is a statistical graph with rectangular bars of lengths proportional to that value that they represent.
   * (http://semanticscience.org/resource/SIO_000443)
   */
  public static Resource bar_graph() {
    return _namespace_SIO("SIO_000443");
  }

  /**
   * A horizontal bar graph is a bar graph in which the rectangular bars
   * are horizontally oriented in space.
   * (http://semanticscience.org/resource/SIO_000444)
   */
  public static Resource horizontal_bar_graph() {
    return _namespace_SIO("SIO_000444");
  }

  /**
   * A vertical bar graph is a bar graph in which the rectangular bars are
   * vertically oriented in space.
   * (http://semanticscience.org/resource/SIO_000445)
   */
  public static Resource vertical_bar_graph() {
    return _namespace_SIO("SIO_000445");
  }

  /**
   * A stacked bar graph is a bar graph in which each rectangular bar is
   * partioned by the categorical value of each series of data.
   * (http://semanticscience.org/resource/SIO_000446)
   */
  public static Resource stacked_bar_graph() {
    return _namespace_SIO("SIO_000446");
  }

  /**
   * A line-bar graph statistical graph that contains both lines and bars.
   * (http://semanticscience.org/resource/SIO_000447)
   */
  public static Resource line_bar_graph() {
    return _namespace_SIO("SIO_000447");
  }

  public static Resource figure_part() {
    return _namespace_SIO("SIO_000448");
  }

  /**
   * A plot is a part of a figure that corresponds to the spatial region between the set of axes.
   * (http://semanticscience.org/resource/SIO_000449)
   */
  public static Resource plot() {
    return _namespace_SIO("SIO_000449");
  }

  /**
   * An axis is a line segment that is part of a statistical graph in which the
   * position along the line corresponds to a numeric or categorical value.
   * (http://semanticscience.org/resource/SIO_000450)
   */
  public static Resource axis() {
    return _namespace_SIO("SIO_000450");
  }

  /**
   * A Cartesian coordinate axis is an axis whose behavior follows that of a Cartesian coordinate system.
   * (http://semanticscience.org/resource/SIO_000451)
   */
  public static Resource Cartesian_coordinate_axis() {
    return _namespace_SIO("SIO_000451");
  }

  /**
   * An x-axis is a Cartesian coordinate axis that is aligned with the horizon.
   * (http://semanticscience.org/resource/SIO_000452)
   */
  public static Resource x_axis() {
    return _namespace_SIO("SIO_000452");
  }

  /**
   * A y-axis is a Cartesian coordinate axis that is spatially oriented
   * perpendicular to the x-axis.
   * (http://semanticscience.org/resource/SIO_000453)
   */
  public static Resource y_axis() {
    return _namespace_SIO("SIO_000453");
  }

  /**
   * A z-axis is a Cartesian coordinate axis that is spatially oriented
   * normal to the plane formed by the x- and y-axes.
   * (http://semanticscience.org/resource/SIO_000454)
   */
  public static Resource z_axis() {
    return _namespace_SIO("SIO_000454");
  }

  /**
   * A category axis is an axis in which the position along the line is
   * partioned into categories.
   * (http://semanticscience.org/resource/SIO_000455)
   */
  public static Resource category_axis() {
    return _namespace_SIO("SIO_000455");
  }

  /**
   * A primary category axis is a category axis that either defines the sole value range or holds the larger set of categorical values specified by the secondary category axis.
   * (http://semanticscience.org/resource/SIO_000456)
   */
  public static Resource primary_category_axis() {
    return _namespace_SIO("SIO_000456");
  }

  /**
   * A secondary category axis is a category axis that defines a finer
   * granular part (or subset) of the value range of the primary category axis.
   * (http://semanticscience.org/resource/SIO_000457)
   */
  public static Resource secondary_category_axis() {
    return _namespace_SIO("SIO_000457");
  }

  /**
   * A value axis is an axis in which the position along the line is
   * partioned into numeric values.
   * (http://semanticscience.org/resource/SIO_000458)
   */
  public static Resource value_axis() {
    return _namespace_SIO("SIO_000458");
  }

  /**
   * A left value axis is a value axis that is spatially positioned to the left of the plot area.
   * (http://semanticscience.org/resource/SIO_000459)
   */
  public static Resource left_value_axis() {
    return _namespace_SIO("SIO_000459");
  }

  /**
   * A right value axis is a value axis that is spatially positioned to the right of the plot area.
   * (http://semanticscience.org/resource/SIO_000460)
   */
  public static Resource right_value_axis() {
    return _namespace_SIO("SIO_000460");
  }

  /**
   * A scaled value axis is a value axis in which the value range was subject to a mathematic transformation.
   * (http://semanticscience.org/resource/SIO_000461)
   */
  public static Resource scaled_value_axis() {
    return _namespace_SIO("SIO_000461");
  }

  /**
   * A linear value axis is a value axis that corresponds to a scaling factor of 1 of the value range.
   * (http://semanticscience.org/resource/SIO_000462)
   */
  public static Resource linear_value_axis() {
    return _namespace_SIO("SIO_000462");
  }

  /**
   * A logarithmic value axis is a scaled value axis that corresponds to a scaling factor of the logarithm of the value range.
   * (http://semanticscience.org/resource/SIO_000463)
   */
  public static Resource logarithmic_value_axis() {
    return _namespace_SIO("SIO_000463");
  }

  /**
   * A data series is a data set composed of related values displayed in a statistical graph.
   * (http://semanticscience.org/resource/SIO_000464)
   */
  public static Resource data_series() {
    return _namespace_SIO("SIO_000464");
  }

  /**
   * A data point is a point that which corresponds to the projection of the values of measurement data against the axes of a statistical graph.
   * (http://semanticscience.org/resource/SIO_000465)
   */
  public static Resource data_point() {
    return _namespace_SIO("SIO_000465");
  }

  /**
   * A global maximum stationary point is a data point that corresponds to a measurement value is larger than that of all other plotted datapoints.
   * (http://semanticscience.org/resource/SIO_000466)
   */
  public static Resource global_maximal_stationary_point() {
    return _namespace_SIO("SIO_000466");
  }

  /**
   * A global minimum data point is a data point that corresponds to a measurement value is smaller than that of all other plotted datapoints.
   * (http://semanticscience.org/resource/SIO_000467)
   */
  public static Resource global_minimal_stationary_point() {
    return _namespace_SIO("SIO_000467");
  }

  /**
   * A legend is a part of a figure that associates textual descriptions with symbols pertaining to plotted entities.
   * (http://semanticscience.org/resource/SIO_000468)
   */
  public static Resource legend() {
    return _namespace_SIO("SIO_000468");
  }

  /**
   * A graph title is a title that describes a graph.
   * (http://semanticscience.org/resource/SIO_000469)
   */
  public static Resource graph_title() {
    return _namespace_SIO("SIO_000469");
  }

  /**
   * A primary title is a title that should be first used in describing some entity.
   * (http://semanticscience.org/resource/SIO_000470)
   */
  public static Resource primary_title() {
    return _namespace_SIO("SIO_000470");
  }

  /**
   * A secondary title is a title of lesser importance that should be used after the first title in describing some entity.
   * (http://semanticscience.org/resource/SIO_000471)
   */
  public static Resource secondary_title() {
    return _namespace_SIO("SIO_000471");
  }

  public static Resource scientific_data() {
    return _namespace_SIO("SIO_000472");
  }

  /**
   * A primary graph title is a primary title that describes a statistical
   * graph.
   * (http://semanticscience.org/resource/SIO_000473)
   */
  public static Resource primary_graph_title() {
    return _namespace_SIO("SIO_000473");
  }

  /**
   * A secondary graph title is a secondary title that describes a statistical graph.
   * (http://semanticscience.org/resource/SIO_000474)
   */
  public static Resource secondary_graph_title() {
    return _namespace_SIO("SIO_000474");
  }

  /**
   * a biological quality is a quality held by a biological entity.
   * (http://semanticscience.org/resource/SIO_000475)
   */
  public static Resource biological_quality() {
    return _namespace_SIO("SIO_000475");
  }

  /**
   * cellular quality is the quality of a cell
   * (http://semanticscience.org/resource/SIO_000476)
   */
  public static Resource cellular_quality() {
    return _namespace_SIO("SIO_000476");
  }

  public static Resource sequence_variant_role() {
    return _namespace_SIO("SIO_000478");
  }

  /**
   * a variant role is a comparative role in which the value of an attribute differs when compared to another entity
   * (http://semanticscience.org/resource/SIO_000479)
   */
  public static Resource variant_role() {
    return _namespace_SIO("SIO_000479");
  }

  public static Resource insertion_variant_role() {
    return _namespace_SIO("SIO_000480");
  }

  public static Resource deletion_variant_role() {
    return _namespace_SIO("SIO_000481");
  }

  /**
   * A phrase is a group of words functioning as a single unit in the syntax of a sentence.
   * (http://semanticscience.org/resource/SIO_000483)
   */
  public static Resource phrase() {
    return _namespace_SIO("SIO_000483");
  }

  public static Resource human() {
    return _namespace_SIO("SIO_000485");
  }

  public static Resource mouse() {
    return _namespace_SIO("SIO_000486");
  }

  public static Resource rat() {
    return _namespace_SIO("SIO_000487");
  }

  public static Resource worm() {
    return _namespace_SIO("SIO_000488");
  }

  public static Resource e_coli() {
    return _namespace_SIO("SIO_000489");
  }

  public static Resource to_consume() {
    return _namespace_SIO("SIO_000492");
  }

  /**
   * A clause consists of a subject and a predicate.
   * (http://semanticscience.org/resource/SIO_000493)
   */
  public static Resource clause() {
    return _namespace_SIO("SIO_000493");
  }

  /**
   * to actively interact with is the capability to interact with another entity in a way that requires physical contact.
   * (http://semanticscience.org/resource/SIO_000494)
   */
  public static Resource to_actively_interact_with() {
    return _namespace_SIO("SIO_000494");
  }

  public static Resource person() {
    return _namespace_SIO("SIO_000498");
  }

  public static Resource to_decrease_the_rate_of_formation() {
    return _namespace_SIO("SIO_000499");
  }

  /**
   * A polygon vertex is a terminal point at which two polygon edges meet and are part of a polygon.
   * (http://semanticscience.org/resource/SIO_000500)
   */
  public static Resource polygon_vertex() {
    return _namespace_SIO("SIO_000500");
  }

  /**
   * A polygon edge is a line segment joining two polygon vertices.
   * (http://semanticscience.org/resource/SIO_000501)
   */
  public static Resource polygon_edge() {
    return _namespace_SIO("SIO_000501");
  }

  /**
   * A polyhedral skeleton is a collection of polygon edges.
   * (http://semanticscience.org/resource/SIO_000502)
   */
  public static Resource polyhedral_skeleton() {
    return _namespace_SIO("SIO_000502");
  }

  /**
   * A polygonal face is a polygon bounded by a circuit of polygon edges, and includes the flat (plane) region inside the boundary.
   * (http://semanticscience.org/resource/SIO_000503)
   */
  public static Resource polygonal_face() {
    return _namespace_SIO("SIO_000503");
  }

  /**
   * A polyhedral surface is composed of polygonal faces.
   * (http://semanticscience.org/resource/SIO_000504)
   */
  public static Resource polyhedral_surface() {
    return _namespace_SIO("SIO_000504");
  }

  /**
   * A polygon is a planar entity that is bounded by a closed path or circuit, composed of a finite connected sequence3 of straight line segments.
   * (http://semanticscience.org/resource/SIO_000505)
   */
  public static Resource polygon() {
    return _namespace_SIO("SIO_000505");
  }

  public static Resource geometric_entity() {
    return _namespace_SIO("SIO_000506");
  }

  /**
   * A point is a geometric entity that is located in a zero-dimensional spatial region and whose position is defined by its coordinates in some coordinate system.
   * (http://semanticscience.org/resource/SIO_000507)
   */
  public static Resource point() {
    return _namespace_SIO("SIO_000507");
  }

  /**
   * An endpoint is a terminal point that is the last of an ordered
   * pair of points.
   * (http://semanticscience.org/resource/SIO_000508)
   */
  public static Resource endpoint() {
    return _namespace_SIO("SIO_000508");
  }

  /**
   * A start point is a terminal point which is the first of an ordered
   * pair of points.
   * (http://semanticscience.org/resource/SIO_000509)
   */
  public static Resource start_point() {
    return _namespace_SIO("SIO_000509");
  }

  /**
   * A model is a representation of some thing.
   * (http://semanticscience.org/resource/SIO_000510)
   */
  public static Resource model() {
    return _namespace_SIO("SIO_000510");
  }

  /**
   * A line is curve that extends in a single dimension (e.g. straight line; exhibits no curvature), and is composed of at least two fully connected points.
   * (http://semanticscience.org/resource/SIO_000511)
   */
  public static Resource line() {
    return _namespace_SIO("SIO_000511");
  }

  /**
   * A line segment is a line and a part of a curve that is (inclusively) bounded by two terminal points.
   * (http://semanticscience.org/resource/SIO_000512)
   */
  public static Resource line_segment() {
    return _namespace_SIO("SIO_000512");
  }

  /**
   * A tick mark is a line segment that is spatially positioned perpendicular to the axis of a statistical graph and indicates the position of a specific numeric value (which may be indicated by an adjacent value label) on a value axis, or is one of a pair of tick marks that delineates the boundary of a categorical value (which may be indicated by an adjacent category label) on the categorical axis.
   * (http://semanticscience.org/resource/SIO_000513)
   */
  public static Resource tick_mark() {
    return _namespace_SIO("SIO_000513");
  }

  /**
   * A major tick mark is a tick mark that indicates the position of a
   * specific numeric value and is adjacent to its value label on the value
   * axis, or is one of a pair of tick marks that delineates the boundary of a
   * categorical value indicated by an adjacent category label on the
   * categorical axis.
   * (http://semanticscience.org/resource/SIO_000514)
   */
  public static Resource major_tick_mark() {
    return _namespace_SIO("SIO_000514");
  }

  /**
   * A minor tick mark is a tick mark that indicates the position of a specific numeric value but has no adjacent value label, or is one of a pair of tick marks that delineates the boundary of a categorical value but has no adjacent category label on the categorical axis.
   * (http://semanticscience.org/resource/SIO_000515)
   */
  public static Resource minor_tick_mark() {
    return _namespace_SIO("SIO_000515");
  }

  /**
   * A ray is a line which that is bounded by a startpoint and extends outwards infinitely along one dimension.
   * (http://semanticscience.org/resource/SIO_000516)
   */
  public static Resource ray() {
    return _namespace_SIO("SIO_000516");
  }

  /**
   * A quadrilateral is a polygon with composed of four points and four line segments, in which each point is fully connected to two other points.
   * (http://semanticscience.org/resource/SIO_000517)
   */
  public static Resource quadrilateral() {
    return _namespace_SIO("SIO_000517");
  }

  /**
   * A rectangle is a quadrilateral in which one pair of line segments are  parallel and the other pair are perpendicular to the first pair.
   * (http://semanticscience.org/resource/SIO_000518)
   */
  public static Resource rectangle() {
    return _namespace_SIO("SIO_000518");
  }

  /**
   * A bar is a rectangle that is located in the plot of a statistical graph in which its length is proportional to the values that it represents.
   * (http://semanticscience.org/resource/SIO_000519)
   */
  public static Resource bar() {
    return _namespace_SIO("SIO_000519");
  }

  /**
   * A triangle is a polygon composed of three points and three line segments, in which each point is fully connected to another point along through the line segment.
   * (http://semanticscience.org/resource/SIO_000520)
   */
  public static Resource triangle() {
    return _namespace_SIO("SIO_000520");
  }

  /**
   * A directed line segment is a line segment that is contained by an ordered pair
   * of endpoints (a start point and an endpoint).
   * (http://semanticscience.org/resource/SIO_000521)
   */
  public static Resource directed_line_segment() {
    return _namespace_SIO("SIO_000521");
  }

  /**
   * An arrowed line is a directed line segment in which one or both endpoints is tangentially part of a triangle that bisects the line.
   * (http://semanticscience.org/resource/SIO_000522)
   */
  public static Resource arrowed_line_segment() {
    return _namespace_SIO("SIO_000522");
  }

  /**
   * A single arrowed line is directed line in which the endpoint is tangentially part of a triangle that bisects the line.
   * (http://semanticscience.org/resource/SIO_000523)
   */
  public static Resource single_arrowed_line_segment() {
    return _namespace_SIO("SIO_000523");
  }

  /**
   * A double arrowed line is an arrowed line in which both terminal points are  tangentially part of different triangles that bisect the line.
   * (http://semanticscience.org/resource/SIO_000524)
   */
  public static Resource double_arrowed_line_segment() {
    return _namespace_SIO("SIO_000524");
  }

  /**
   * A vertical line is a line that is positionally oriented with the horizon.
   * (http://semanticscience.org/resource/SIO_000525)
   */
  public static Resource horizontal_line() {
    return _namespace_SIO("SIO_000525");
  }

  /**
   * A vertical line is a line that is positionally oriented perpendicular to the horizon.
   * (http://semanticscience.org/resource/SIO_000526)
   */
  public static Resource vertical_line() {
    return _namespace_SIO("SIO_000526");
  }

  /**
   * A trend line is a line, line segment or ray that is part of a statistical graph which indicates a statistical or visual direction across categorical or value data.
   * (http://semanticscience.org/resource/SIO_000527)
   */
  public static Resource trend_line() {
    return _namespace_SIO("SIO_000527");
  }

  /**
   * An increasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is positive.
   * (http://semanticscience.org/resource/SIO_000528)
   */
  public static Resource increasing_line() {
    return _namespace_SIO("SIO_000528");
  }

  /**
   * An decreasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is negative.
   * (http://semanticscience.org/resource/SIO_000529)
   */
  public static Resource decreasing_line() {
    return _namespace_SIO("SIO_000529");
  }

  /**
   * An plateau line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is zero.
   * (http://semanticscience.org/resource/SIO_000530)
   */
  public static Resource plateau_line() {
    return _namespace_SIO("SIO_000530");
  }

  /**
   * A drop line is a statistical graph line that vertically or horizontally connects a data series line with a value axis in a statistical graph.
   * (http://semanticscience.org/resource/SIO_000531)
   */
  public static Resource drop_line() {
    return _namespace_SIO("SIO_000531");
  }

  /**
   * A terminal point is a point that defines the finite extension of a line.
   * (http://semanticscience.org/resource/SIO_000532)
   */
  public static Resource terminal_point() {
    return _namespace_SIO("SIO_000532");
  }

  /**
   * A surface normal is a vector that is perpendicular to a flat surface.
   * (http://semanticscience.org/resource/SIO_000533)
   */
  public static Resource surface_normal() {
    return _namespace_SIO("SIO_000533");
  }

  public static Resource positionally_oriented_line() {
    return _namespace_SIO("SIO_000534");
  }

  /**
   * A statistical graph line is a line used in a statistical graph to communicate some trend or feature of the embedded data.
   * (http://semanticscience.org/resource/SIO_000535)
   */
  public static Resource statistical_graph_line() {
    return _namespace_SIO("SIO_000535");
  }

  public static Resource to_regulate_the_rate_of_formation() {
    return _namespace_SIO("SIO_000536");
  }

  /**
   * curvature is a quality of a bearer that relates to the presence of curves, bends, or angles.
   * (http://semanticscience.org/resource/SIO_000537)
   */
  public static Resource curvature() {
    return _namespace_SIO("SIO_000537");
  }

  /**
   * shape is a quality of a bearer that is free of curves, bends, or angles.
   * (http://semanticscience.org/resource/SIO_000538)
   */
  public static Resource straight() {
    return _namespace_SIO("SIO_000538");
  }

  /**
   * An infinite line is a line that extends outwards in both directions of a single dimensional and is not bounded by terminal points.
   * (http://semanticscience.org/resource/SIO_000539)
   */
  public static Resource infinite_line() {
    return _namespace_SIO("SIO_000539");
  }

  /**
   * A ray is a line which that is bounded by a startpoint and extends outwards along one dimension.
   * (http://semanticscience.org/resource/SIO_000540)
   */
  public static Resource vector() {
    return _namespace_SIO("SIO_000540");
  }

  /**
   * A vertext normal is the normalized average of the surface normals of the faces that contain that vertex.
   * (http://semanticscience.org/resource/SIO_000541)
   */
  public static Resource vertex_normal() {
    return _namespace_SIO("SIO_000541");
  }

  public static Resource to_serve_as() {
    return _namespace_SIO("SIO_000542");
  }

  public static Resource to_serve_as_a_host() {
    return _namespace_SIO("SIO_000543");
  }

  public static Resource to_infect() {
    return _namespace_SIO("SIO_000544");
  }

  /**
   * A polyline is a connected sequence of line segments.
   * (http://semanticscience.org/resource/SIO_000545)
   */
  public static Resource polyline() {
    return _namespace_SIO("SIO_000545");
  }

  public static Resource collection_of_points() {
    return _namespace_SIO("SIO_000546");
  }

  public static Resource to_cause_disease() {
    return _namespace_SIO("SIO_000547");
  }

  public static Resource to_reduce_the_activation_energy() {
    return _namespace_SIO("SIO_000549");
  }

  public static Resource to_increase_the_activation_energy() {
    return _namespace_SIO("SIO_000550");
  }

  public static Resource to_change_the_activation_energy() {
    return _namespace_SIO("SIO_000551");
  }

  /**
   * A quality that has a value that is normal or average.
   * (http://semanticscience.org/resource/SIO_000554)
   */
  public static Resource normal() {
    return _namespace_SIO("SIO_000554");
  }

  /**
   * A quality that has a value that is outside normal or average.
   * (http://semanticscience.org/resource/SIO_000555)
   */
  public static Resource abnormal() {
    return _namespace_SIO("SIO_000555");
  }

  public static Resource lipid_residue() {
    return _namespace_SIO("SIO_000556");
  }

  /**
   * Chemical synthesis is synthesis of a chemical entity from physical precursors through one or more chemical interactions or reactions.
   * (http://semanticscience.org/resource/SIO_000559)
   */
  public static Resource chemical_synthesis() {
    return _namespace_SIO("SIO_000559");
  }

  /**
   * a molecular orbital (or MO) is a mathematical function describing the wave-like behavior of an electron in a molecule
   * (http://semanticscience.org/resource/SIO_000561)
   */
  public static Resource molecular_orbitral() {
    return _namespace_SIO("SIO_000561");
  }

  /**
   * Passive transport is the movement of a substance across a membrane and does not require chemical energy.
   * (http://semanticscience.org/resource/SIO_000562)
   */
  public static Resource passive_transport() {
    return _namespace_SIO("SIO_000562");
  }

  /**
   * Diffusion is motion of particles at temperatures above absolute zero.
   * (http://semanticscience.org/resource/SIO_000564)
   */
  public static Resource diffusion() {
    return _namespace_SIO("SIO_000564");
  }

  /**
   * A diffusion equation describes density fluctuations in a material undergoing diffusion.
   * (http://semanticscience.org/resource/SIO_000565)
   */
  public static Resource diffusion_equation() {
    return _namespace_SIO("SIO_000565");
  }

  /**
   * a movement equation describes the displacement of an object in space over time.
   * (http://semanticscience.org/resource/SIO_000566)
   */
  public static Resource movement_equation() {
    return _namespace_SIO("SIO_000566");
  }

  /**
   * An ordinary differential equation (ODE) is a differential equation in which the unknown function (also known as the dependent variable) is a function of a single independent variable.
   * (http://semanticscience.org/resource/SIO_000567)
   */
  public static Resource ordinary_differential_equation() {
    return _namespace_SIO("SIO_000567");
  }

  /**
   * A partial differential equation (PDE) is a differential equation in which the unknown function is a function of multiple independent variables and the equation involves its partial derivatives.
   * (http://semanticscience.org/resource/SIO_000568)
   */
  public static Resource partial_differential_equation() {
    return _namespace_SIO("SIO_000568");
  }

  /**
   * A differential equation is a mathematical equation for an unknown function of one or several variables that relates the values of the function itself and its derivatives of various orders.
   * (http://semanticscience.org/resource/SIO_000569)
   */
  public static Resource differential_equation() {
    return _namespace_SIO("SIO_000569");
  }

  /**
   * Movement is the process in which an object is spatially displaced.
   * (http://semanticscience.org/resource/SIO_000570)
   */
  public static Resource movement() {
    return _namespace_SIO("SIO_000570");
  }

  /**
   * Brownian motion is the seemlingly random movement of particles suspended in a fluid.
   * (http://semanticscience.org/resource/SIO_000571)
   */
  public static Resource brownian_motion() {
    return _namespace_SIO("SIO_000571");
  }

  /**
   * Osmosis is the movement of water molecules through a selectively-permeable membrane down a water potential gradient.
   * (http://semanticscience.org/resource/SIO_000572)
   */
  public static Resource osmosis() {
    return _namespace_SIO("SIO_000572");
  }

  public static Resource passive_movement() {
    return _namespace_SIO("SIO_000573");
  }

  /**
   * Active movement is the process in which an object is spatially displaced using some chemical energy.
   * (http://semanticscience.org/resource/SIO_000574)
   */
  public static Resource active_movement() {
    return _namespace_SIO("SIO_000574");
  }

  /**
   * Transport is an interaction that realizes the role a transporter and a cargo and results in the movement of at least the cargo.
   * (http://semanticscience.org/resource/SIO_000575)
   */
  public static Resource transport() {
    return _namespace_SIO("SIO_000575");
  }

  /**
   * membrane transport is the movement of molecules across a membrane.
   * (http://semanticscience.org/resource/SIO_000576)
   */
  public static Resource membrane_transport() {
    return _namespace_SIO("SIO_000576");
  }

  /**
   * Primary active transport, also called direct active transport, directly uses energy to transport molecules across a membrane.
   * (http://semanticscience.org/resource/SIO_000577)
   */
  public static Resource primary_active_transport() {
    return _namespace_SIO("SIO_000577");
  }

  /**
   * secondary active transport or co-transport uses electrochemical potential difference created by pumping ions out of the cell to transport molecules across a membrane.
   * (http://semanticscience.org/resource/SIO_000578)
   */
  public static Resource secondary_active_transport() {
    return _namespace_SIO("SIO_000578");
  }

  public static Resource symport_enabled_secondary_active_transport() {
    return _namespace_SIO("SIO_000579");
  }

  public static Resource antiport_enabled_secondary_active_transport() {
    return _namespace_SIO("SIO_000580");
  }

  /**
   * The self-propelled movement of an object.
   * (http://semanticscience.org/resource/SIO_000581)
   */
  public static Resource locomotion() {
    return _namespace_SIO("SIO_000581");
  }

  /**
   * Birth is the process by which a biological organism is brought into existence.
   * (http://semanticscience.org/resource/SIO_000582)
   */
  public static Resource birth() {
    return _namespace_SIO("SIO_000582");
  }

  /**
   * Death is a process in which a biological entity ceases to exist.
   * (http://semanticscience.org/resource/SIO_000583)
   */
  public static Resource death() {
    return _namespace_SIO("SIO_000583");
  }

  /**
   * An idea is a proposition about some object of conceptual thought.
   * (http://semanticscience.org/resource/SIO_000585)
   */
  public static Resource idea() {
    return _namespace_SIO("SIO_000585");
  }

  /**
   * Biological reproduction is the biological process by which one or more biological organisms are produced from their "parents".
   * (http://semanticscience.org/resource/SIO_000587)
   */
  public static Resource biological_reproduction() {
    return _namespace_SIO("SIO_000587");
  }

  /**
   * creation is a process in which an entity comes into existence.
   * (http://semanticscience.org/resource/SIO_000588)
   */
  public static Resource creation() {
    return _namespace_SIO("SIO_000588");
  }

  /**
   * regulation is the imposition of a requirement or action of one party to another.
   * (http://semanticscience.org/resource/SIO_000589)
   */
  public static Resource regulation() {
    return _namespace_SIO("SIO_000589");
  }

  /**
   * Biosynthesis is the synthesis of an organic compound in a living organism, usually aided by enzymes.
   * (http://semanticscience.org/resource/SIO_000590)
   */
  public static Resource biosynthesis() {
    return _namespace_SIO("SIO_000590");
  }

  /**
   * destruction is a process in which something is broken down and/or ceases to exist.
   * (http://semanticscience.org/resource/SIO_000591)
   */
  public static Resource destruction() {
    return _namespace_SIO("SIO_000591");
  }

  /**
   * Chemical destruction is destruction of a chemical entity to its chemical constituents through one ormore chemical interactions or reactions.
   * (http://semanticscience.org/resource/SIO_000592)
   */
  public static Resource chemical_destruction() {
    return _namespace_SIO("SIO_000592");
  }

  /**
   * an interaction is a process that involves two or more entities and the realization of at least two dispositions to interact.
   * (http://semanticscience.org/resource/SIO_000593)
   */
  public static Resource interaction() {
    return _namespace_SIO("SIO_000593");
  }

  /**
   * data transformation is the process of applying an algorithmic procedure to some input data and producing some output data.
   * (http://semanticscience.org/resource/SIO_000594)
   */
  public static Resource data_transformation() {
    return _namespace_SIO("SIO_000594");
  }

  public static Resource parameterized_data_transformation() {
    return _namespace_SIO("SIO_000595");
  }

  /**
   * a data storage device is a device that is capable of storing information.
   * (http://semanticscience.org/resource/SIO_000596)
   */
  public static Resource data_storage_device() {
    return _namespace_SIO("SIO_000596");
  }

  /**
   * A solid-state drive (SSD) is a data storage device that uses solid-state memory to store persistent data
   * (http://semanticscience.org/resource/SIO_000597)
   */
  public static Resource solid_state_hard_drive() {
    return _namespace_SIO("SIO_000597");
  }

  /**
   * A hard disk drive (HDD) is a non-volatile, random access device for digital data. It features rotating rigid platters on a motor-driven spindle within a protective enclosure. Data is magnetically read and written on the platter by read/write heads that float on a film of air above the platters.
   * (http://semanticscience.org/resource/SIO_000598)
   */
  public static Resource hard_disk_drive() {
    return _namespace_SIO("SIO_000598");
  }

  public static Resource structure() {
    return _namespace_SIO("SIO_000600");
  }

  /**
   * a computational entity is an information content entity operated on using some computational system.
   * (http://semanticscience.org/resource/SIO_000602)
   */
  public static Resource computational_entity() {
    return _namespace_SIO("SIO_000602");
  }

  public static Resource sound_wave() {
    return _namespace_SIO("SIO_000605");
  }

  /**
   * A curve is a geometric entity that may be located in n-dimensional spatial region whose extension may be n-dimensional,  is composed of at least two fully connected points and does not intersect itself.
   * (http://semanticscience.org/resource/SIO_000608)
   */
  public static Resource curve() {
    return _namespace_SIO("SIO_000608");
  }

  public static Resource regulation_of_process() {
    return _namespace_SIO("SIO_000609");
  }

  public static Resource regulation_of_capability() {
    return _namespace_SIO("SIO_000610");
  }

  public static Resource regulation_of_catalytic_capability() {
    return _namespace_SIO("SIO_000611");
  }

  /**
   * A representation is a entity that in some way represents another entity (or attribute thereof).
   * (http://semanticscience.org/resource/SIO_000612)
   */
  public static Resource representation() {
    return _namespace_SIO("SIO_000612");
  }

  /**
   * A ordinal position is a number that designates the position of an entity from the first entity in an ordered sequence of entities.
   * (http://semanticscience.org/resource/SIO_000613)
   */
  public static Resource ordinal_position() {
    return _namespace_SIO("SIO_000613");
  }

  /**
   * an attribute is a characteristic of some entity.
   * (http://semanticscience.org/resource/SIO_000614)
   */
  public static Resource attribute() {
    return _namespace_SIO("SIO_000614");
  }

  /**
   * A collection is a set for which there exists at least one member, although any member need not to exist at any point in the collection"s existence.
   * (http://semanticscience.org/resource/SIO_000616)
   */
  public static Resource collection() {
    return _namespace_SIO("SIO_000616");
  }

  /**
   * An empty set is a set for which there are exactly 0 members.
   * (http://semanticscience.org/resource/SIO_000617)
   */
  public static Resource empty_set() {
    return _namespace_SIO("SIO_000617");
  }

  /**
   * a standard is a socially-agreed upon specification.
   * (http://semanticscience.org/resource/SIO_000618)
   */
  public static Resource standard() {
    return _namespace_SIO("SIO_000618");
  }

  /**
   * A regulatory authority is an organization responsible for  exercising regulatory or supervisory capacity in some area of human activity.
   * (http://semanticscience.org/resource/SIO_000619)
   */
  public static Resource regulatory_authority() {
    return _namespace_SIO("SIO_000619");
  }

  /**
   * A collective is a group of entities that share or are motivated by at least one common issue or interest, or work together on a specific project(s) to achieve a common objective.
   * (http://semanticscience.org/resource/SIO_000620)
   */
  public static Resource collective() {
    return _namespace_SIO("SIO_000620");
  }

  /**
   * A formal specification is a mathematical description of software or hardware that may be used to develop an implementation.
   * (http://semanticscience.org/resource/SIO_000621)
   */
  public static Resource formal_specification() {
    return _namespace_SIO("SIO_000621");
  }

  public static Resource RDFS_ontology() {
    return _namespace_SIO("SIO_000622");
  }

  public static Resource OBO_ontology() {
    return _namespace_SIO("SIO_000623");
  }

  public static Resource chemical_functional_group() {
    return _namespace_SIO("SIO_000624");
  }

  /**
   * Chemical structure is the quality of molecular geometry and electronic structure.
   * (http://semanticscience.org/resource/SIO_000625)
   */
  public static Resource chemical_structure() {
    return _namespace_SIO("SIO_000625");
  }

  public static Resource molecular_structure() {
    return _namespace_SIO("SIO_000626");
  }

  /**
   * Molecular geometry is the spatial arrangement of atoms in a molecule and the chemical bonds that hold the atoms together.
   * (http://semanticscience.org/resource/SIO_000627)
   */
  public static Resource molecular_geometry() {
    return _namespace_SIO("SIO_000627");
  }

  /**
   * a probability measure is quantity of how likely it is that some event will occur.
   * (http://semanticscience.org/resource/SIO_000638)
   */
  public static Resource probability_measure() {
    return _namespace_SIO("SIO_000638");
  }

  /**
   * to passively interact with is the capability to interact with another entity in a way that does not require physical contact.
   * (http://semanticscience.org/resource/SIO_000639)
   */
  public static Resource to_passively_interact_with() {
    return _namespace_SIO("SIO_000639");
  }

  /**
   * A quality that has a value that is increased compared to normal or average.
   * (http://semanticscience.org/resource/SIO_000640)
   */
  public static Resource increased() {
    return _namespace_SIO("SIO_000640");
  }

  public static Resource process_model() {
    return _namespace_SIO("SIO_000647");
  }

  public static Resource physical_model() {
    return _namespace_SIO("SIO_000648");
  }

  public static Resource information_processing_procedure() {
    return _namespace_SIO("SIO_000649");
  }

  /**
   * A wave is a physical entity that travels through space and time, consist of oscillations or vibrations and may be accompanied by the transfer of energy.
   * (http://semanticscience.org/resource/SIO_000650)
   */
  public static Resource wave() {
    return _namespace_SIO("SIO_000650");
  }

  /**
   * A textual entity is language entity that is manifested as one or more distinct characters.
   * (http://semanticscience.org/resource/SIO_000651)
   */
  public static Resource textual_entity() {
    return _namespace_SIO("SIO_000651");
  }

  public static Resource version_label() {
    return _namespace_SIO("SIO_000653");
  }

  public static Resource software_version_label() {
    return _namespace_SIO("SIO_000654");
  }

  /**
   * a hole is a site that is opening into or through something.
   * (http://semanticscience.org/resource/SIO_000660)
   */
  public static Resource hole() {
    return _namespace_SIO("SIO_000660");
  }

  public static Resource province() {
    return _namespace_SIO("SIO_000661");
  }

  public static Resource state() {
    return _namespace_SIO("SIO_000662");
  }

  public static Resource territory() {
    return _namespace_SIO("SIO_000663");
  }

  public static Resource country() {
    return _namespace_SIO("SIO_000664");
  }

  public static Resource city() {
    return _namespace_SIO("SIO_000665");
  }

  public static Resource township() {
    return _namespace_SIO("SIO_000666");
  }

  /**
   * software execution is the process of executing software on a computing device.
   * (http://semanticscience.org/resource/SIO_000667)
   */
  public static Resource sofware_execution() {
    return _namespace_SIO("SIO_000667");
  }

  public static Resource start_time() {
    return _namespace_SIO("SIO_000669");
  }

  public static Resource end_time() {
    return _namespace_SIO("SIO_000670");
  }

  /**
   * a unique identifier is an identifier that uniquely identifies some thing.
   * (http://semanticscience.org/resource/SIO_000675)
   */
  public static Resource unique_identifier() {
    return _namespace_SIO("SIO_000675");
  }

  public static Resource social_role() {
    return _namespace_SIO("SIO_000676");
  }

  /**
   * a processual role is a role that can only be realized in a process.
   * (http://semanticscience.org/resource/SIO_000677)
   */
  public static Resource processual_role() {
    return _namespace_SIO("SIO_000677");
  }

  /**
   * an abstract role is a role whose basis lies in spatial/temporal or comparative relations.
   * (http://semanticscience.org/resource/SIO_000678)
   */
  public static Resource abstract_role() {
    return _namespace_SIO("SIO_000678");
  }

  /**
   * A justification is a proposition that defends, explains or excuses some argument.
   * (http://semanticscience.org/resource/SIO_000683)
   */
  public static Resource justification() {
    return _namespace_SIO("SIO_000683");
  }

  public static Resource department() {
    return _namespace_SIO("SIO_000686");
  }

  public static Resource institute() {
    return _namespace_SIO("SIO_000688");
  }

  /**
   * to be a part of is the capability to be assembled into a larger structure that persists in time.
   * (http://semanticscience.org/resource/SIO_000689)
   */
  public static Resource to_be_part_of() {
    return _namespace_SIO("SIO_000689");
  }

  /**
   * To associate is the capability to physically interact with another object.
   * (http://semanticscience.org/resource/SIO_000690)
   */
  public static Resource to_associate() {
    return _namespace_SIO("SIO_000690");
  }

  public static Resource to_be_part_of_a_group() {
    return _namespace_SIO("SIO_000691");
  }

  public static Resource to_be_actively_interacted_with() {
    return _namespace_SIO("SIO_000692");
  }

  /**
   * A corporation is an organization that is granted a charter recognizing it as a separate legal entity.
   * (http://semanticscience.org/resource/SIO_000693)
   */
  public static Resource corporation() {
    return _namespace_SIO("SIO_000693");
  }

  public static Resource to_be_passively_interacted_with() {
    return _namespace_SIO("SIO_000694");
  }

  public static Resource to_be_recorded() {
    return _namespace_SIO("SIO_000695");
  }

  public static Resource to_be_observed() {
    return _namespace_SIO("SIO_000696");
  }

  /**
   * to disassemble is to physically separate the parts of an object.
   * (http://semanticscience.org/resource/SIO_000698)
   */
  public static Resource to_disassemble() {
    return _namespace_SIO("SIO_000698");
  }

  /**
   * to disassociate is to cease or break association with some thing.
   * (http://semanticscience.org/resource/SIO_000700)
   */
  public static Resource to_disassociate() {
    return _namespace_SIO("SIO_000700");
  }

  /**
   * to interact with is a capabililty that involves another object.
   * (http://semanticscience.org/resource/SIO_000701)
   */
  public static Resource to_interact_with() {
    return _namespace_SIO("SIO_000701");
  }

  /**
   * to be interacted with is the capability of an object to be physically touched or perturbed.
   * (http://semanticscience.org/resource/SIO_000702)
   */
  public static Resource to_be_interacted_with() {
    return _namespace_SIO("SIO_000702");
  }

  /**
   * Evolution is the process that elicits change across successive generations in the inherited characteristics of biological populations.
   * (http://semanticscience.org/resource/SIO_000703)
   */
  public static Resource evolution() {
    return _namespace_SIO("SIO_000703");
  }

  /**
   * a positional role is an abstract role which holds by comparing position to another object of reference.
   * (http://semanticscience.org/resource/SIO_000704)
   */
  public static Resource positional_role() {
    return _namespace_SIO("SIO_000704");
  }

  /**
   * a specification of an object, manifested by an agent, intended to accomplish goals, in a particular environment, using a set of primitive components, satisfying a set of requirements, subject to constraints.
   * (http://semanticscience.org/resource/SIO_000705)
   */
  public static Resource design() {
    return _namespace_SIO("SIO_000705");
  }

  public static Resource occupational_role() {
    return _namespace_SIO("SIO_000706");
  }

  public static Resource student_role() {
    return _namespace_SIO("SIO_000707");
  }

  public static Resource professor_role() {
    return _namespace_SIO("SIO_000708");
  }

  public static Resource academic_role() {
    return _namespace_SIO("SIO_000711");
  }

  public static Resource medical_role() {
    return _namespace_SIO("SIO_000712");
  }

  public static Resource doctor_role() {
    return _namespace_SIO("SIO_000713");
  }

  public static Resource nurse_role() {
    return _namespace_SIO("SIO_000714");
  }

  public static Resource patient_role() {
    return _namespace_SIO("SIO_000715");
  }

  public static Resource medical_practitioner() {
    return _namespace_SIO("SIO_000716");
  }

  public static Resource dentist_role() {
    return _namespace_SIO("SIO_000717");
  }

  /**
   * to translocate is the capability to displace oneself from one location to another.
   * (http://semanticscience.org/resource/SIO_000719)
   */
  public static Resource to_translocate() {
    return _namespace_SIO("SIO_000719");
  }

  /**
   * to be translocated is the capability to be physically displaced from one location to another
   * (http://semanticscience.org/resource/SIO_000720)
   */
  public static Resource to_be_translocated() {
    return _namespace_SIO("SIO_000720");
  }

  /**
   * a comparative role is an abstract role which holds by comparing some attribute of another object of reference.
   * (http://semanticscience.org/resource/SIO_000721)
   */
  public static Resource comparative_role() {
    return _namespace_SIO("SIO_000721");
  }

  public static Resource to_be_compared() {
    return _namespace_SIO("SIO_000722");
  }

  /**
   * to compare is the capability to examine in order to note the similarities or differences among a set of objects.
   * (http://semanticscience.org/resource/SIO_000723)
   */
  public static Resource to_compare() {
    return _namespace_SIO("SIO_000723");
  }

  /**
   * to examine is the capability to make detailed observation.
   * (http://semanticscience.org/resource/SIO_000724)
   */
  public static Resource to_examine() {
    return _namespace_SIO("SIO_000724");
  }

  public static Resource to_be_examined() {
    return _namespace_SIO("SIO_000725");
  }

  public static Resource administrative_role() {
    return _namespace_SIO("SIO_000726");
  }

  public static Resource secretary_role() {
    return _namespace_SIO("SIO_000727");
  }

  public static Resource chemical_identifier() {
    return _namespace_SIO("SIO_000728");
  }

  /**
   * a record identifier is an identifier for a database entry.
   * (http://semanticscience.org/resource/SIO_000729)
   */
  public static Resource record_identifier() {
    return _namespace_SIO("SIO_000729");
  }

  public static Resource physical_entity_identifier() {
    return _namespace_SIO("SIO_000730");
  }

  public static Resource informational_entity_identifier() {
    return _namespace_SIO("SIO_000731");
  }

  public static Resource molecular_identifier() {
    return _namespace_SIO("SIO_000732");
  }

  /**
   * Planning is the agentive process of developing a plan that specifies a set of actions in order to meet a set of goals or objectives.
   * (http://semanticscience.org/resource/SIO_000739)
   */
  public static Resource planning() {
    return _namespace_SIO("SIO_000739");
  }

  /**
   * a curve segment is a part of a curve that consists of at least three points.
   * (http://semanticscience.org/resource/SIO_000740)
   */
  public static Resource curve_segment() {
    return _namespace_SIO("SIO_000740");
  }

  /**
   * a stationary point is a point that is part of a curve in which the derivative at that point is zero, and hence its value is at least a local maximum or minimum.
   * (http://semanticscience.org/resource/SIO_000741)
   */
  public static Resource stationary_point() {
    return _namespace_SIO("SIO_000741");
  }

  public static Resource local_maximum_stationary_point() {
    return _namespace_SIO("SIO_000742");
  }

  public static Resource local_minimum_stationary_point() {
    return _namespace_SIO("SIO_000743");
  }

  /**
   * learning is the agentive process of acquiring knowledge.
   * (http://semanticscience.org/resource/SIO_000744)
   */
  public static Resource learning() {
    return _namespace_SIO("SIO_000744");
  }

  /**
   * comparison is the process of examining a set of objects and determining their equality or inequality based on one or more features.
   * (http://semanticscience.org/resource/SIO_000745)
   */
  public static Resource comparison() {
    return _namespace_SIO("SIO_000745");
  }

  /**
   * reasoning is the agentive process of using knowledge to evaluate the truth value of a proposition.
   * (http://semanticscience.org/resource/SIO_000746)
   */
  public static Resource reasoning() {
    return _namespace_SIO("SIO_000746");
  }

  /**
   * investigation is the process of carrying out a plan or procedure so as to discover facts or information about the object of study.
   * (http://semanticscience.org/resource/SIO_000747)
   */
  public static Resource investigation() {
    return _namespace_SIO("SIO_000747");
  }

  /**
   * prediction is the process of formulating a proposition about a state of affairs which might be realized in the future.
   * (http://semanticscience.org/resource/SIO_000748)
   */
  public static Resource prediction() {
    return _namespace_SIO("SIO_000748");
  }

  public static Resource database() {
    return _namespace_SIO("SIO_000750");
  }

  /**
   * A quality that has a value that is decreased compared to normal or average.
   * (http://semanticscience.org/resource/SIO_000751)
   */
  public static Resource decreased() {
    return _namespace_SIO("SIO_000751");
  }

  /**
   * A row represents a single, implicitly structured data item in a table.
   * (http://semanticscience.org/resource/SIO_000752)
   */
  public static Resource row() {
    return _namespace_SIO("SIO_000752");
  }

  public static Resource column() {
    return _namespace_SIO("SIO_000753");
  }

  /**
   * a database table is a set of named columns with zero or more rows composed of cells that contain column values and is part of a database.
   * (http://semanticscience.org/resource/SIO_000754)
   */
  public static Resource database_table() {
    return _namespace_SIO("SIO_000754");
  }

  public static Resource cell_informational() {
    return _namespace_SIO("SIO_000755");
  }

  /**
   * A database entry is a single, implicitly structured data item in a table.
   * (http://semanticscience.org/resource/SIO_000756)
   */
  public static Resource database_entry() {
    return _namespace_SIO("SIO_000756");
  }

  public static Resource database_column() {
    return _namespace_SIO("SIO_000757");
  }

  /**
   * disorder is a quality in one or more anatomical parts (an anatomical collection) that are considered abnormal
   * (http://semanticscience.org/resource/SIO_000758)
   */
  public static Resource disorder() {
    return _namespace_SIO("SIO_000758");
  }

  public static Resource unique_cell() {
    return _namespace_SIO("SIO_000759");
  }

  public static Resource referencing_cell() {
    return _namespace_SIO("SIO_000760");
  }

  public static Resource referent_cell() {
    return _namespace_SIO("SIO_000761");
  }

  /**
   * A database key is an informational entity whose value is constructed from one or more database columns.
   * (http://semanticscience.org/resource/SIO_000762)
   */
  public static Resource database_key() {
    return _namespace_SIO("SIO_000762");
  }

  /**
   * A primary database key is a database key that identifies every row of a table.
   * (http://semanticscience.org/resource/SIO_000763)
   */
  public static Resource primary_database_key() {
    return _namespace_SIO("SIO_000763");
  }

  /**
   * a foreign database key is a database key that refers to a key in some table
   * (http://semanticscience.org/resource/SIO_000764)
   */
  public static Resource foreign_database_key() {
    return _namespace_SIO("SIO_000764");
  }

  /**
   * a p-value or probability value is the probability of obtaining a test statistic at least as extreme as the one that was actually observed, assuming that the null hypothesis is true
   * (http://semanticscience.org/resource/SIO_000765)
   */
  public static Resource p_value() {
    return _namespace_SIO("SIO_000765");
  }

  public static Resource street_name() {
    return _namespace_SIO("SIO_000766");
  }

  /**
   * a postal code is a geographic coordinate composed of a series of letters and/or digits appended to a postal address for the purpose of sorting mail.
   * (http://semanticscience.org/resource/SIO_000767)
   */
  public static Resource postal_code() {
    return _namespace_SIO("SIO_000767");
  }

  public static Resource apartment_number() {
    return _namespace_SIO("SIO_000768");
  }

  /**
   * the uncertainty value (margin of error) of a measurement is a range of values likely to enclose the true value.
   * (http://semanticscience.org/resource/SIO_000769)
   */
  public static Resource uncertainty_value() {
    return _namespace_SIO("SIO_000769");
  }

  /**
   * a standard deviation (represented by the symbol σ) is the quantity of  variation from the average (mean, or expected value).
   * (http://semanticscience.org/resource/SIO_000770)
   */
  public static Resource standard_deviation() {
    return _namespace_SIO("SIO_000770");
  }

  /**
   * a versioned record is a record for which there exists another variant based that was derived via modification of the facts.
   * (http://semanticscience.org/resource/SIO_000771)
   */
  public static Resource versioned_record() {
    return _namespace_SIO("SIO_000771");
  }

  /**
   * An object is an entity that is wholly identifiable at any instant of time during which it exists.
   * (http://semanticscience.org/resource/SIO_000776)
   */
  public static Resource object() {
    return _namespace_SIO("SIO_000776");
  }

  /**
   * to be a member of is the capability to be considered a part of a collection.
   * (http://semanticscience.org/resource/SIO_000777)
   */
  public static Resource to_be_a_member_of() {
    return _namespace_SIO("SIO_000777");
  }

  /**
   * to distort is the capability to change the appearance of an entity by some transformation.
   * (http://semanticscience.org/resource/SIO_000778)
   */
  public static Resource to_distort() {
    return _namespace_SIO("SIO_000778");
  }

  /**
   * a primer is a nucleic acid that enables the synthesis of a complement strand of DNA by binding to it and acting as a point of transcription initiation.
   * (http://semanticscience.org/resource/SIO_000779)
   */
  public static Resource primer() {
    return _namespace_SIO("SIO_000779");
  }

  /**
   * to bind to is the capability to physically interact with another object through a set of non-covalent interactions.
   * (http://semanticscience.org/resource/SIO_000780)
   */
  public static Resource to_bind_to() {
    return _namespace_SIO("SIO_000780");
  }

  public static Resource spatial_boundary() {
    return _namespace_SIO("SIO_000783");
  }

  /**
   * hermaphrodite is a biological sex of an individual with both male and female sexual organs.
   * (http://semanticscience.org/resource/SIO_000784)
   */
  public static Resource hermaphrodite() {
    return _namespace_SIO("SIO_000784");
  }

  /**
   * an answer is a reply to a question.
   * (http://semanticscience.org/resource/SIO_000785)
   */
  public static Resource answer() {
    return _namespace_SIO("SIO_000785");
  }

  /**
   * a verbal language entity is a language entity that is manifested through sound.
   * (http://semanticscience.org/resource/SIO_000786)
   */
  public static Resource verbal_language_entity() {
    return _namespace_SIO("SIO_000786");
  }

  public static Resource page_number() {
    return _namespace_SIO("SIO_000787");
  }

  /**
   * a linear position is the position of some object against a linear positioning system.
   * (http://semanticscience.org/resource/SIO_000788)
   */
  public static Resource linear_position() {
    return _namespace_SIO("SIO_000788");
  }

  /**
   * a sequence element position is the position of an element of a linear sequence.
   * (http://semanticscience.org/resource/SIO_000789)
   */
  public static Resource sequence_element_position() {
    return _namespace_SIO("SIO_000789");
  }

  /**
   * a vertical position is a quantity along an axis that goes from up to down.
   * (http://semanticscience.org/resource/SIO_000790)
   */
  public static Resource vertical_position() {
    return _namespace_SIO("SIO_000790");
  }

  /**
   * a sequence start position is the start position for a sequence of characters.
   * (http://semanticscience.org/resource/SIO_000791)
   */
  public static Resource sequence_start_position() {
    return _namespace_SIO("SIO_000791");
  }

  /**
   * a sequence end position is the position of the last character in a sequence of characters relative to some linear frame of reference.
   * (http://semanticscience.org/resource/SIO_000792)
   */
  public static Resource sequence_end_position() {
    return _namespace_SIO("SIO_000792");
  }

  /**
   * The number of elements of a finite set of objects.
   * (http://semanticscience.org/resource/SIO_000794)
   */
  public static Resource count() {
    return _namespace_SIO("SIO_000794");
  }

  /**
   * a chemical role is a processual role held by a chemical entity
   * (http://semanticscience.org/resource/SIO_000795)
   */
  public static Resource chemical_entity_role() {
    return _namespace_SIO("SIO_000795");
  }

  /**
   * the role of a chemical participant that serves to increase the rate of reaction by lowering the activiation energy.
   * (http://semanticscience.org/resource/SIO_000796)
   */
  public static Resource catalytic_role() {
    return _namespace_SIO("SIO_000796");
  }

  /**
   * the role of a chemical entity that is modified in a chemical reaction
   * (http://semanticscience.org/resource/SIO_000797)
   */
  public static Resource substrate_role() {
    return _namespace_SIO("SIO_000797");
  }

  /**
   * the role of a chemical entity present at the end of a chemical reaction.
   * (http://semanticscience.org/resource/SIO_000798)
   */
  public static Resource product_role() {
    return _namespace_SIO("SIO_000798");
  }

  /**
   * the role of a chemical entity involved in the mechanism for enzyme-mediated catalysis.
   * (http://semanticscience.org/resource/SIO_000799)
   */
  public static Resource cofactor_role() {
    return _namespace_SIO("SIO_000799");
  }

  /**
   * a co-factor role in which the chemical entity is modified during catalysis and must be regenerated.
   * (http://semanticscience.org/resource/SIO_000800)
   */
  public static Resource co_enzyme_role() {
    return _namespace_SIO("SIO_000800");
  }

  /**
   * a coenzyme role of a chemical entity that is covalently bonded to the  enzyme.
   * (http://semanticscience.org/resource/SIO_000801)
   */
  public static Resource prosthetic_group_role() {
    return _namespace_SIO("SIO_000801");
  }

  /**
   * a co-enzyme role of a chemical entity that is transiently associated, and is regenerated in a separate reaction.
   * (http://semanticscience.org/resource/SIO_000802)
   */
  public static Resource co_substrate_role() {
    return _namespace_SIO("SIO_000802");
  }

  /**
   * the role of a chemical entity that reduces the rate of reaction.
   * (http://semanticscience.org/resource/SIO_000803)
   */
  public static Resource inhibitor_role() {
    return _namespace_SIO("SIO_000803");
  }

  /**
   * the role of a chemical entity that increases the rate of reaction.
   * (http://semanticscience.org/resource/SIO_000804)
   */
  public static Resource activator_role() {
    return _namespace_SIO("SIO_000804");
  }

  /**
   * The quality of having a charge
   * (http://semanticscience.org/resource/SIO_000805)
   */
  public static Resource charged() {
    return _namespace_SIO("SIO_000805");
  }

  /**
   * the quality of not having a charge
   * (http://semanticscience.org/resource/SIO_000806)
   */
  public static Resource uncharged() {
    return _namespace_SIO("SIO_000806");
  }

  public static Resource partial_positive_charge() {
    return _namespace_SIO("SIO_000807");
  }

  public static Resource partial_negative_charge() {
    return _namespace_SIO("SIO_000808");
  }

  public static Resource partial_charge() {
    return _namespace_SIO("SIO_000809");
  }

  public static Resource unitary_charge() {
    return _namespace_SIO("SIO_000810");
  }

  /**
   * a Uniform Resource Locator or Universal Resource Locator (URL) is a specific character string that constitutes a reference to an Internet resource.
   * (http://semanticscience.org/resource/SIO_000811)
   */
  public static Resource URL() {
    return _namespace_SIO("SIO_000811");
  }

  /**
   * affection is an emotion characterized with a feeling or type of love for another living thing.
   * (http://semanticscience.org/resource/SIO_000812)
   */
  public static Resource affection() {
    return _namespace_SIO("SIO_000812");
  }

  /**
   * angst is the intense feeling of apprehension, anxiety or inner turmoil.
   * (http://semanticscience.org/resource/SIO_000813)
   */
  public static Resource angst() {
    return _namespace_SIO("SIO_000813");
  }

  /**
   * Annoyance is an unpleasant emtion that is characterized by a abnormal or excessive sensitivity to some external stimulus.
   * (http://semanticscience.org/resource/SIO_000814)
   */
  public static Resource annoyance() {
    return _namespace_SIO("SIO_000814");
  }

  /**
   * anxiety is an emotion charactersized by intense feeling of fear and concern coupled with a physical response.
   * (http://semanticscience.org/resource/SIO_000815)
   */
  public static Resource anxiety() {
    return _namespace_SIO("SIO_000815");
  }

  /**
   * apathy is an emotion exhibited by lack of interest, enthusiasm, or concern
   * (http://semanticscience.org/resource/SIO_000816)
   */
  public static Resource apathy() {
    return _namespace_SIO("SIO_000816");
  }

  /**
   * Arousal is an emotion characterized by state of reactive to stimuli. It involves the activation of the reticular activating system in the brain stem, the autonomic nervous system and the endocrine system, leading to increased heart rate and blood pressure and a condition of sensory alertness, mobility and readiness to respond.
   * (http://semanticscience.org/resource/SIO_000817)
   */
  public static Resource arousal() {
    return _namespace_SIO("SIO_000817");
  }

  /**
   * Awe is an emotion produced by that which is grand, sublime or powerful and is characterized by a combination of joy, fear and admiration/reverence/respect.
   * (http://semanticscience.org/resource/SIO_000818)
   */
  public static Resource awe() {
    return _namespace_SIO("SIO_000818");
  }

  /**
   * boldness is the trait of being willing to undertake things that involve risk or danger.
   * (http://semanticscience.org/resource/SIO_000819)
   */
  public static Resource boldness() {
    return _namespace_SIO("SIO_000819");
  }

  /**
   * boredom is the emotion experience by those not interested in their surroundings or available activities.
   * (http://semanticscience.org/resource/SIO_000820)
   */
  public static Resource boredom() {
    return _namespace_SIO("SIO_000820");
  }

  /**
   * contempt is disgust  towards a lower status individual.
   * (http://semanticscience.org/resource/SIO_000821)
   */
  public static Resource contempt() {
    return _namespace_SIO("SIO_000821");
  }

  /**
   * contentment is an emotion characterized by acknowledgement and satisfaction of the current state of affairs.
   * (http://semanticscience.org/resource/SIO_000822)
   */
  public static Resource contentment() {
    return _namespace_SIO("SIO_000822");
  }

  /**
   * curiosity is the strong desire to know or learn something.
   * (http://semanticscience.org/resource/SIO_000823)
   */
  public static Resource curiosity() {
    return _namespace_SIO("SIO_000823");
  }

  /**
   * depression is an unpleasant emotion linked to aversion to activity that can affect a person"s thoughts, behavior, feelings and physical well-being. Depressed individuals may feel sad, anxious, empty, hopeless, worried, helpless, worthless, guilty, irritable, or restless.
   * (http://semanticscience.org/resource/SIO_000824)
   */
  public static Resource depression() {
    return _namespace_SIO("SIO_000824");
  }

  /**
   * Desire is a strong emotion of wanting to have something or wishing for something to happen.
   * (http://semanticscience.org/resource/SIO_000825)
   */
  public static Resource desire() {
    return _namespace_SIO("SIO_000825");
  }

  /**
   * despair is depression, hopelessness or lack of hope
   * (http://semanticscience.org/resource/SIO_000826)
   */
  public static Resource despair() {
    return _namespace_SIO("SIO_000826");
  }

  /**
   * Disappointment is the feeling of dissatisfaction that follows the failure of expectations or hopes to manifest
   * (http://semanticscience.org/resource/SIO_000827)
   */
  public static Resource disappointment() {
    return _namespace_SIO("SIO_000827");
  }

  /**
   * Disgust is a feeling of revulsion or profound disapproval aroused by something unpleasant or offensive.
   * (http://semanticscience.org/resource/SIO_000828)
   */
  public static Resource disgust() {
    return _namespace_SIO("SIO_000828");
  }

  /**
   * dread is the instense negative emotion that induces fear and apprehension.
   * (http://semanticscience.org/resource/SIO_000829)
   */
  public static Resource dread() {
    return _namespace_SIO("SIO_000829");
  }

  /**
   * ecstacy is an emotion characterized by a heightened state of consciousness with total involvement of a subject.
   * (http://semanticscience.org/resource/SIO_000830)
   */
  public static Resource ecstasy() {
    return _namespace_SIO("SIO_000830");
  }

  /**
   * a positive emotion is an emotion that feels good.
   * (http://semanticscience.org/resource/SIO_000831)
   */
  public static Resource positive_emotion() {
    return _namespace_SIO("SIO_000831");
  }

  /**
   * negative emotion is an emotion that does not feel good.
   * (http://semanticscience.org/resource/SIO_000832)
   */
  public static Resource negative_emotion() {
    return _namespace_SIO("SIO_000832");
  }

  /**
   * Embarrassment is the emotion of intense discomfort with oneself, experienced upon having a socially unacceptable act or condition witnessed by or revealed to other.
   * (http://semanticscience.org/resource/SIO_000833)
   */
  public static Resource embarassment() {
    return _namespace_SIO("SIO_000833");
  }

  /**
   * envy is an emotion that occurs when a person lacks another"s (perceived) superior quality, achievement or possession and wishes that the other lacked it.
   * (http://semanticscience.org/resource/SIO_000834)
   */
  public static Resource envy() {
    return _namespace_SIO("SIO_000834");
  }

  /**
   * euphoria is an emotion characterized by intense feelings of well-being, elation, happiness, ecstasy, excitement, and joy.
   * (http://semanticscience.org/resource/SIO_000835)
   */
  public static Resource euphoria() {
    return _namespace_SIO("SIO_000835");
  }

  public static Resource excitement() {
    return _namespace_SIO("SIO_000836");
  }

  /**
   * Fear is a negative emotion induced by a perceived threat that induces one to hide or move quickly away from the location of the perceived threat.
   * (http://semanticscience.org/resource/SIO_000837)
   */
  public static Resource fear() {
    return _namespace_SIO("SIO_000837");
  }

  /**
   * Frustration is an emotion that arises from the perceived resistance to the fulfillment of individual will.
   * (http://semanticscience.org/resource/SIO_000838)
   */
  public static Resource frustration() {
    return _namespace_SIO("SIO_000838");
  }

  /**
   * Gratitude, thankfulness, gratefulness, or appreciation is a feeling, emotion or attitude in acknowledgment of a benefit that one has received or will receive.
   * (http://semanticscience.org/resource/SIO_000839)
   */
  public static Resource gratitude() {
    return _namespace_SIO("SIO_000839");
  }

  /**
   * Happiness is an emotion characterized by positive or pleasant emotions ranging from contentment to intense joy.
   * (http://semanticscience.org/resource/SIO_000840)
   */
  public static Resource happiness() {
    return _namespace_SIO("SIO_000840");
  }

  /**
   * Guilt is the emotion borne from feeling responsible for the commission of an offense and arises out of public humiliation.
   * (http://semanticscience.org/resource/SIO_000841)
   */
  public static Resource guilt() {
    return _namespace_SIO("SIO_000841");
  }

  /**
   * Grief is an emotion in response to loss, whether physical or abstract including death, unemployment, ill health or the end of a relationship.
   * (http://semanticscience.org/resource/SIO_000842)
   */
  public static Resource grief() {
    return _namespace_SIO("SIO_000842");
  }

  /**
   * hope is an emotion of belief in a positive outcome related to events and circumstances in one"s life.
   * (http://semanticscience.org/resource/SIO_000843)
   */
  public static Resource hope() {
    return _namespace_SIO("SIO_000843");
  }

  /**
   * Hostility is the intense negative emotion of being in conflict or opposition to someone or something.
   * (http://semanticscience.org/resource/SIO_000844)
   */
  public static Resource hostility() {
    return _namespace_SIO("SIO_000844");
  }

  /**
   * hurt is an unpleasant feeling, emotion or sensation.
   * (http://semanticscience.org/resource/SIO_000845)
   */
  public static Resource hurt() {
    return _namespace_SIO("SIO_000845");
  }

  /**
   * Hysteria is an unmanageable emotion.
   * (http://semanticscience.org/resource/SIO_000846)
   */
  public static Resource hysteria() {
    return _namespace_SIO("SIO_000846");
  }

  /**
   * indifference is an emotion exhibited by lack of interest, concern, or sympathy.
   * (http://semanticscience.org/resource/SIO_000847)
   */
  public static Resource indifference() {
    return _namespace_SIO("SIO_000847");
  }

  /**
   * interest is the emotion of wanting to know or learn about something or someone.
   * (http://semanticscience.org/resource/SIO_000848)
   */
  public static Resource interest() {
    return _namespace_SIO("SIO_000848");
  }

  /**
   * jealousy is an emotion and typically refers to the negative thoughts and feelings of insecurity, fear, and anxiety over an anticipated loss of something that the person values, particularly in reference to a human connection
   * (http://semanticscience.org/resource/SIO_000849)
   */
  public static Resource jealousy() {
    return _namespace_SIO("SIO_000849");
  }

  public static Resource joy() {
    return _namespace_SIO("SIO_000850");
  }

  /**
   * loathing is an intense dislike or disgust.
   * (http://semanticscience.org/resource/SIO_000851)
   */
  public static Resource loathing() {
    return _namespace_SIO("SIO_000851");
  }

  /**
   * Loneliness is an unpleasant emotion in which a person feels a strong sense of emptiness, yearning distress and solitude resulting from inadequate quantity or quality of social relationships.
   * (http://semanticscience.org/resource/SIO_000852)
   */
  public static Resource loneliness() {
    return _namespace_SIO("SIO_000852");
  }

  /**
   * lust is the strong desire for sex.
   * (http://semanticscience.org/resource/SIO_000853)
   */
  public static Resource lust() {
    return _namespace_SIO("SIO_000853");
  }

  /**
   * Misery is a feeling of great unhappiness, suffering and/or pain.
   * (http://semanticscience.org/resource/SIO_000854)
   */
  public static Resource misery() {
    return _namespace_SIO("SIO_000854");
  }

  /**
   * Panic is a sudden emotion of fear which is so strong as to dominate or prevent reason and logical thinking, replacing it with overwhelming feelings of anxiety and frantic agitation consistent with an animalistic fight-or-flight reaction.
   * (http://semanticscience.org/resource/SIO_000855)
   */
  public static Resource panic() {
    return _namespace_SIO("SIO_000855");
  }

  /**
   * passion is the intense emotion compelling feeling, enthusiasm, or desire for something.
   * (http://semanticscience.org/resource/SIO_000856)
   */
  public static Resource passion() {
    return _namespace_SIO("SIO_000856");
  }

  /**
   * Pity is the emotion of sadness or sorrow for another.
   * (http://semanticscience.org/resource/SIO_000857)
   */
  public static Resource pity() {
    return _namespace_SIO("SIO_000857");
  }

  public static Resource pleasure() {
    return _namespace_SIO("SIO_000858");
  }

  /**
   * Pride is an emotion of satisfaction of attachment toward one"s own or another"s choices and actions, or toward a whole group of people, and is a product of praise, independent self-reflection, or a fulfilled feeling of belonging.
   * (http://semanticscience.org/resource/SIO_000859)
   */
  public static Resource pride() {
    return _namespace_SIO("SIO_000859");
  }

  /**
   * Rage is a feeling of intense anger that is  associated with the Fight-or-flight response.
   * (http://semanticscience.org/resource/SIO_000860)
   */
  public static Resource rage() {
    return _namespace_SIO("SIO_000860");
  }

  public static Resource regret() {
    return _namespace_SIO("SIO_000861");
  }

  public static Resource remorse() {
    return _namespace_SIO("SIO_000862");
  }

  /**
   * sadness is emotional pain associated with, or characterized by feelings of disadvantage, loss, despair, helplessness, sorrow, and rage.
   * (http://semanticscience.org/resource/SIO_000863)
   */
  public static Resource sadness() {
    return _namespace_SIO("SIO_000863");
  }

  public static Resource satisfaction() {
    return _namespace_SIO("SIO_000864");
  }

  /**
   * shame is the emotion borne from feeling responsible for the commission of an offense.
   * (http://semanticscience.org/resource/SIO_000865)
   */
  public static Resource shame() {
    return _namespace_SIO("SIO_000865");
  }

  /**
   * shock is an emotion of sudden upset or surprise.
   * (http://semanticscience.org/resource/SIO_000866)
   */
  public static Resource shock() {
    return _namespace_SIO("SIO_000866");
  }

  /**
   * shyness is an emotion of apprehension, lack of comfort, or awkwardness experienced when in proximity to, approaching, or being approached by other individuals, especially in new situations or with unfamiliar individuals.
   * (http://semanticscience.org/resource/SIO_000867)
   */
  public static Resource shyness() {
    return _namespace_SIO("SIO_000867");
  }

  /**
   * Sorrow is the emotion that is characterized by a long term state of intense sadness, distress and a degree of resignation (not accepting).
   * (http://semanticscience.org/resource/SIO_000868)
   */
  public static Resource sorrow() {
    return _namespace_SIO("SIO_000868");
  }

  /**
   * Suffering is the unpleasant emotion and aversion associated with the perception of harm or threat of harm in an individual.
   * (http://semanticscience.org/resource/SIO_000869)
   */
  public static Resource suffering() {
    return _namespace_SIO("SIO_000869");
  }

  /**
   * Surprise is a brief emotion experienced as the result of an unexpected event.
   * (http://semanticscience.org/resource/SIO_000870)
   */
  public static Resource surprise() {
    return _namespace_SIO("SIO_000870");
  }

  /**
   * terror is the extreme feeling of fear.
   * (http://semanticscience.org/resource/SIO_000871)
   */
  public static Resource terror() {
    return _namespace_SIO("SIO_000871");
  }

  /**
   * Wonder is an emotion of perceiving something very rare or unexpected, but not threatening.
   * (http://semanticscience.org/resource/SIO_000872)
   */
  public static Resource wonder() {
    return _namespace_SIO("SIO_000872");
  }

  /**
   * worry is the emotion characterized by concer over a real or imaginary issue.
   * (http://semanticscience.org/resource/SIO_000873)
   */
  public static Resource worry() {
    return _namespace_SIO("SIO_000873");
  }

  public static Resource department_chair_role() {
    return _namespace_SIO("SIO_000875");
  }

  public static Resource student_advisor_role() {
    return _namespace_SIO("SIO_000876");
  }

  public static Resource undergraduate_student_advisor_role() {
    return _namespace_SIO("SIO_000877");
  }

  public static Resource graduate_student_advisor_role() {
    return _namespace_SIO("SIO_000878");
  }

  /**
   * the role of a chemical entity present at the beginning of a chemical reaction.
   * (http://semanticscience.org/resource/SIO_000879)
   */
  public static Resource reactant_role() {
    return _namespace_SIO("SIO_000879");
  }

  /**
   * the role of a chemical entity that modifies the rate of reaction.
   * (http://semanticscience.org/resource/SIO_000880)
   */
  public static Resource regulator_role() {
    return _namespace_SIO("SIO_000880");
  }

  public static Resource investigational_role() {
    return _namespace_SIO("SIO_000881");
  }

  /**
   * the role of an organism in providing resources to maintain the survival and/or reproduction of another organism.
   * (http://semanticscience.org/resource/SIO_000882)
   */
  public static Resource host_role() {
    return _namespace_SIO("SIO_000882");
  }

  public static Resource subject_role() {
    return _namespace_SIO("SIO_000883");
  }

  public static Resource publishing_role() {
    return _namespace_SIO("SIO_000884");
  }

  /**
   * the role of an agent that prepares and issues creative works.
   * (http://semanticscience.org/resource/SIO_000885)
   */
  public static Resource publisher_role() {
    return _namespace_SIO("SIO_000885");
  }

  /**
   * the role of an agent that creates a written work.
   * (http://semanticscience.org/resource/SIO_000886)
   */
  public static Resource author_role() {
    return _namespace_SIO("SIO_000886");
  }

  /**
   * a buffer role is the role of a chemical substance which maintains a pH at a near constant value.
   * (http://semanticscience.org/resource/SIO_000887)
   */
  public static Resource buffer_role() {
    return _namespace_SIO("SIO_000887");
  }

  /**
   * a chemical substance role is a chemical entity role held by a chemical substance
   * (http://semanticscience.org/resource/SIO_000888)
   */
  public static Resource chemical_substance_role() {
    return _namespace_SIO("SIO_000888");
  }

  /**
   * a molecular entity role is a chemical entity role held by a molecule
   * (http://semanticscience.org/resource/SIO_000889)
   */
  public static Resource molecular_entity_role() {
    return _namespace_SIO("SIO_000889");
  }

  /**
   * a toxin role is a toxic role of a chemical substance that is poisonous and  is produced by an organism
   * (http://semanticscience.org/resource/SIO_000890)
   */
  public static Resource toxin_role() {
    return _namespace_SIO("SIO_000890");
  }

  /**
   * a toxic role is the role of a chemical substance that is poisonous
   * (http://semanticscience.org/resource/SIO_000891)
   */
  public static Resource toxic_role() {
    return _namespace_SIO("SIO_000891");
  }

  /**
   * a role of a chemical substance that participates in a chemical reaction as part of some scientific investigation.
   * (http://semanticscience.org/resource/SIO_000893)
   */
  public static Resource reagent_role() {
    return _namespace_SIO("SIO_000893");
  }

  /**
   * to luminesce is to emit light through cold body radiation
   * (http://semanticscience.org/resource/SIO_000894)
   */
  public static Resource to_luminesce() {
    return _namespace_SIO("SIO_000894");
  }

  /**
   * to fluoresce is to emit light as a result of absorbing light or other electromagnetic radiation.
   * (http://semanticscience.org/resource/SIO_000895)
   */
  public static Resource to_fluoresce() {
    return _namespace_SIO("SIO_000895");
  }

  /**
   * a molecular tracer role is a reactant role of a molecular entity that serves as a marker for the presence, abundance, or location of a molecular target that it associates with.
   * (http://semanticscience.org/resource/SIO_000896)
   */
  public static Resource molecular_tracer_role() {
    return _namespace_SIO("SIO_000896");
  }

  /**
   * an assocation is a relationship between two or more entities derived by some informational anlysis.
   * (http://semanticscience.org/resource/SIO_000897)
   */
  public static Resource association() {
    return _namespace_SIO("SIO_000897");
  }

  /**
   * a statistical association is any relationship between two measured quantities that renders them statistically dependent.
   * (http://semanticscience.org/resource/SIO_000898)
   */
  public static Resource statistical_association() {
    return _namespace_SIO("SIO_000898");
  }

  /**
   * a chromosome is a molecular complex of circular or linear DNA and bound proteins.
   * (http://semanticscience.org/resource/SIO_000899)
   */
  public static Resource chromosome() {
    return _namespace_SIO("SIO_000899");
  }

  /**
   * A top value axis is a value axis that is spatially positioned to the top of the plot area.
   * (http://semanticscience.org/resource/SIO_000902)
   */
  public static Resource top_value_axis() {
    return _namespace_SIO("SIO_000902");
  }

  /**
   * A bottom value axis is a value axis that is spatially positioned to the bottom of the plot area.
   * (http://semanticscience.org/resource/SIO_000903)
   */
  public static Resource bottom_value_axis() {
    return _namespace_SIO("SIO_000903");
  }

  /**
   * A chart is a figure that displays the relationship among tabular numeric data, functions or some kinds of qualitative structures.
   * (http://semanticscience.org/resource/SIO_000904)
   */
  public static Resource chart() {
    return _namespace_SIO("SIO_000904");
  }

  /**
   * A map is a a visual representation of an area that depicts the relationship between elements of that space.
   * (http://semanticscience.org/resource/SIO_000906)
   */
  public static Resource map() {
    return _namespace_SIO("SIO_000906");
  }

  /**
   * A heatmap is a graphical representation of data where the individual values contained in a matrix are represented as colors.
   * (http://semanticscience.org/resource/SIO_000907)
   */
  public static Resource heatmap() {
    return _namespace_SIO("SIO_000907");
  }

  /**
   * a steamgraph is a multi-line stacked graph that yields the appearance of continuous y-values across the x-axis.
   * (http://semanticscience.org/resource/SIO_000908)
   */
  public static Resource steamgraph() {
    return _namespace_SIO("SIO_000908");
  }

  /**
   * A boxplot (box-and-whisker diagram) is a convenient way of graphically depicting groups of numerical data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
   * (http://semanticscience.org/resource/SIO_000909)
   */
  public static Resource boxplot() {
    return _namespace_SIO("SIO_000909");
  }

  /**
   * A geographic heatmap is a graphical representation of data over a geographic region where individual values are represented as colors.
   * (http://semanticscience.org/resource/SIO_000910)
   */
  public static Resource geographic_heatmap() {
    return _namespace_SIO("SIO_000910");
  }

  /**
   * a histogram is a graphical representation of data which consists of tabular frequencies, shown as adjacent rectangles, over discrete intervals (bins) , with an area equal to the frequency of the observations in the interval.
   * (http://semanticscience.org/resource/SIO_000911)
   */
  public static Resource histogram() {
    return _namespace_SIO("SIO_000911");
  }

  /**
   * a measurement scale is a functional specification that specifies an allowed range of categories or values.
   * (http://semanticscience.org/resource/SIO_000912)
   */
  public static Resource measurement_scale() {
    return _namespace_SIO("SIO_000912");
  }

  /**
   * A nominal scale of measurement only specifies a limited set of categories.
   * (http://semanticscience.org/resource/SIO_000913)
   */
  public static Resource nomimal_scale() {
    return _namespace_SIO("SIO_000913");
  }

  /**
   * a binary scale is a measurement scale that specifies a choice between two values.
   * (http://semanticscience.org/resource/SIO_000914)
   */
  public static Resource binary_scale() {
    return _namespace_SIO("SIO_000914");
  }

  /**
   * a numeric scale of measurement is one that only specifies numeric values
   * (http://semanticscience.org/resource/SIO_000915)
   */
  public static Resource numeric_scale() {
    return _namespace_SIO("SIO_000915");
  }

  /**
   * a decimal scale of measurement is one that only specifies decimal values
   * (http://semanticscience.org/resource/SIO_000916)
   */
  public static Resource decimal_scale() {
    return _namespace_SIO("SIO_000916");
  }

  /**
   * an integer scale of measurement is one that only specifies integer values.
   * (http://semanticscience.org/resource/SIO_000917)
   */
  public static Resource integer_scale() {
    return _namespace_SIO("SIO_000917");
  }

  /**
   * modification is the process by which an entity gains or loses parts, qualities, roles, dispositions, functions, etc, but maintains their identity through these changes.
   * (http://semanticscience.org/resource/SIO_000918)
   */
  public static Resource modification() {
    return _namespace_SIO("SIO_000918");
  }

  /**
   * Reproduction is the process by which a new entity is created based on another entity.
   * (http://semanticscience.org/resource/SIO_000919)
   */
  public static Resource reproduction() {
    return _namespace_SIO("SIO_000919");
  }

  /**
   * an independent variable is a variable that may take on different values independent of other elements in a system.
   * (http://semanticscience.org/resource/SIO_000920)
   */
  public static Resource independent_variable() {
    return _namespace_SIO("SIO_000920");
  }

  /**
   * A dependent variable is one whose value changes as a consequence of changes in other values in the system
   * (http://semanticscience.org/resource/SIO_000921)
   */
  public static Resource dependent_variable() {
    return _namespace_SIO("SIO_000921");
  }

  /**
   * A Gantt chart is a bar chart that illustrates a project schedule.
   * (http://semanticscience.org/resource/SIO_000922)
   */
  public static Resource Gantt_chart() {
    return _namespace_SIO("SIO_000922");
  }

  /**
   * a correlation is a statistical relationship involving dependence between two random variables or datasets.
   * (http://semanticscience.org/resource/SIO_000923)
   */
  public static Resource correlation() {
    return _namespace_SIO("SIO_000923");
  }

  public static Resource television_program() {
    return _namespace_SIO("SIO_000924");
  }

  /**
   * A radio receiver is a communication device that receives its input from an antenna, uses electronic filters to separate a wanted radio signal from all other signals picked up by this antenna, amplifies it to a level suitable for further processing, and finally converts through demodulation and decoding the signal into a form usable for the consumer, such as sound, pictures, digital data, measurement values, navigational positions.
   * (http://semanticscience.org/resource/SIO_000926)
   */
  public static Resource radio_receiver() {
    return _namespace_SIO("SIO_000926");
  }

  /**
   * The telephone is a communications device that transmits and receives sounds, and are minimally composed of a microphone to speak into, a speaker"which reproduces the voice of the other person and a ringer which makes a sound to alert the owner when a call is coming in.
   * (http://semanticscience.org/resource/SIO_000927)
   */
  public static Resource telephone() {
    return _namespace_SIO("SIO_000927");
  }

  /**
   * a radar is an object-detection system which uses radio waves to determine the range, altitude, direction, or speed of objects.
   * (http://semanticscience.org/resource/SIO_000928)
   */
  public static Resource radar() {
    return _namespace_SIO("SIO_000928");
  }

  /**
   * A pie chart is a circular chart divided into sectors each of whose length  is proportional to the quantity it represents.
   * (http://semanticscience.org/resource/SIO_000929)
   */
  public static Resource pie_chart() {
    return _namespace_SIO("SIO_000929");
  }

  /**
   * A matrix chart summarizes a multidimensional data set in a grid.
   * (http://semanticscience.org/resource/SIO_000930)
   */
  public static Resource matrix_chart() {
    return _namespace_SIO("SIO_000930");
  }

  /**
   * A network diagram consists of a set of vertices connected by edges.
   * (http://semanticscience.org/resource/SIO_000931)
   */
  public static Resource network_diagram() {
    return _namespace_SIO("SIO_000931");
  }

  /**
   * A block histogram contains an x-axis that is divided into bins which correspond to value ranges. Each item in the data set is drawn as a rectangular block, and the blocks are piled into the bins to show how many values in each range.
   * (http://semanticscience.org/resource/SIO_000932)
   */
  public static Resource block_histogram() {
    return _namespace_SIO("SIO_000932");
  }

  /**
   * A bubble chart contains circles whose area corresponds to a value.
   * (http://semanticscience.org/resource/SIO_000933)
   */
  public static Resource bubble_chart() {
    return _namespace_SIO("SIO_000933");
  }

  /**
   * A stack graph is a statistical graph which presents multiple series in which the distance between one series and another indicates the relative contribution to the total for any x-value.
   * (http://semanticscience.org/resource/SIO_000934)
   */
  public static Resource stack_graph() {
    return _namespace_SIO("SIO_000934");
  }

  /**
   * a treemap is a chart that fully partitions the area into a set of rectangles whose area represents its relative value.
   * (http://semanticscience.org/resource/SIO_000935)
   */
  public static Resource treemap() {
    return _namespace_SIO("SIO_000935");
  }

  /**
   * a word tree is a chart that links phrases with contexts through a tree-like branching structure.
   * (http://semanticscience.org/resource/SIO_000936)
   */
  public static Resource word_tree() {
    return _namespace_SIO("SIO_000936");
  }

  public static Resource textual_chart() {
    return _namespace_SIO("SIO_000937");
  }

  /**
   * a tag cloud is a visualization of word frequencies.
   * (http://semanticscience.org/resource/SIO_000938)
   */
  public static Resource tag_cloud() {
    return _namespace_SIO("SIO_000938");
  }

  /**
   * A phrase net diagram illustrates the relationship between different words used in a text.
   * (http://semanticscience.org/resource/SIO_000939)
   */
  public static Resource phrase_net_diagram() {
    return _namespace_SIO("SIO_000939");
  }

  /**
   * a mereological chart is a chart that illustrates the parts in the context of the whole.
   * (http://semanticscience.org/resource/SIO_000940)
   */
  public static Resource mereological_chart() {
    return _namespace_SIO("SIO_000940");
  }

  /**
   * A conversation is a form of interactive, spontaneous communication between two or more objects who are following rules of etiquette.
   * (http://semanticscience.org/resource/SIO_000941)
   */
  public static Resource conversation() {
    return _namespace_SIO("SIO_000941");
  }

  public static Resource numeric_label() {
    return _namespace_SIO("SIO_000942");
  }

  /**
   * a start position is the proximal position of an object relative to an origin in a linear system.
   * (http://semanticscience.org/resource/SIO_000943)
   */
  public static Resource start_position() {
    return _namespace_SIO("SIO_000943");
  }

  /**
   * an interval is a set of real numbers that includes all numbers between any two numbers in the set.
   * (http://semanticscience.org/resource/SIO_000944)
   */
  public static Resource interval() {
    return _namespace_SIO("SIO_000944");
  }

  /**
   * A tree diagram is a hierarchical network diagram in which a root vertex is connected to one or more other vertices through a directed edge, which in turn may be connected to other vertices.
   * (http://semanticscience.org/resource/SIO_000945)
   */
  public static Resource tree_diagram() {
    return _namespace_SIO("SIO_000945");
  }

  /**
   * A flowchart is a diagram that represents an algorithm or process, showing the steps as boxes of various kinds, and their order by connecting these with arrows.
   * (http://semanticscience.org/resource/SIO_000946)
   */
  public static Resource flowchart() {
    return _namespace_SIO("SIO_000946");
  }

  /**
   * A Venn diagram is a chart that illustrates all possible logical relations between a finite collection of sets as overlapping circles.
   * (http://semanticscience.org/resource/SIO_000947)
   */
  public static Resource venn_diagram() {
    return _namespace_SIO("SIO_000947");
  }

  /**
   * A dendrogram is a tree diagram used to illustrate the arrangement of the clusters produced by hierarchical clustering.
   * (http://semanticscience.org/resource/SIO_000948)
   */
  public static Resource dendrogram() {
    return _namespace_SIO("SIO_000948");
  }

  /**
   * apprehension is the negative emotion that something unpleasant will occur.
   * (http://semanticscience.org/resource/SIO_000949)
   */
  public static Resource apprehension() {
    return _namespace_SIO("SIO_000949");
  }

  /**
   * resentment is disgust directed toward a higher status individual.
   * (http://semanticscience.org/resource/SIO_000950)
   */
  public static Resource resentment() {
    return _namespace_SIO("SIO_000950");
  }

  /**
   * Pain is an unpleasant sensory and emotional experience associated with actual or potential tissue damage, or described in terms of such damage
   * (http://semanticscience.org/resource/SIO_000951)
   */
  public static Resource pain() {
    return _namespace_SIO("SIO_000951");
  }

  /**
   * a default parameter is a parameter which has a default value.
   * (http://semanticscience.org/resource/SIO_000952)
   */
  public static Resource default_parameter() {
    return _namespace_SIO("SIO_000952");
  }

  /**
   * an end position is the distal position of an object relative to an origin in a linear system.
   * (http://semanticscience.org/resource/SIO_000953)
   */
  public static Resource end_position() {
    return _namespace_SIO("SIO_000953");
  }

  /**
   * sick is the status of a living organism that is behaving at a sub-optimal level.
   * (http://semanticscience.org/resource/SIO_000954)
   */
  public static Resource sick() {
    return _namespace_SIO("SIO_000954");
  }

  public static Resource environment() {
    return _namespace_SIO("SIO_000955");
  }

  /**
   * a device is usually a constructed tool
   * (http://semanticscience.org/resource/SIO_000956)
   */
  public static Resource device() {
    return _namespace_SIO("SIO_000956");
  }

  /**
   * a communication device is a device that facilitates the transmission of information through encoded in an audio or digital signal between a sender and a receiver.
   * (http://semanticscience.org/resource/SIO_000957)
   */
  public static Resource communication_device() {
    return _namespace_SIO("SIO_000957");
  }

  /**
   * existence quality is the quality of an entity that describe in what environment it is known to exist.
   * (http://semanticscience.org/resource/SIO_000959)
   */
  public static Resource existence_quality() {
    return _namespace_SIO("SIO_000959");
  }

  /**
   * real is the quality of an entity that exists in real space and time.
   * (http://semanticscience.org/resource/SIO_000960)
   */
  public static Resource real() {
    return _namespace_SIO("SIO_000960");
  }

  /**
   * fiction is the quality of an entity that exists only in a creative work of fiction.
   * (http://semanticscience.org/resource/SIO_000961)
   */
  public static Resource fictional() {
    return _namespace_SIO("SIO_000961");
  }

  /**
   * virtual is the quality of an entity that exists only in a virtual setting such as a simulation or game environment.
   * (http://semanticscience.org/resource/SIO_000962)
   */
  public static Resource virtual() {
    return _namespace_SIO("SIO_000962");
  }

  /**
   * not started is the status of a process that is predicted to exist but has not yet begun.
   * (http://semanticscience.org/resource/SIO_000963)
   */
  public static Resource not_started() {
    return _namespace_SIO("SIO_000963");
  }

  public static Resource standard_operating_procedure() {
    return _namespace_SIO("SIO_000964");
  }

  public static Resource agreement_quality() {
    return _namespace_SIO("SIO_000965");
  }

  public static Resource agreement() {
    return _namespace_SIO("SIO_000966");
  }

  public static Resource disagreement() {
    return _namespace_SIO("SIO_000967");
  }

  public static Resource poison_role() {
    return _namespace_SIO("SIO_000968");
  }

  /**
   * Communication is the process of conveying information through the exchange of thoughts, messages, or information, as by speech, visuals, signals, writing, or behaviour.
   * (http://semanticscience.org/resource/SIO_000969)
   */
  public static Resource communication() {
    return _namespace_SIO("SIO_000969");
  }

  /**
   * observational study draws inferences about the possible effect of a treatment on subjects, where the assignment of subjects into a treated group versus a control group is outside the control of the investigator
   * (http://semanticscience.org/resource/SIO_000976)
   */
  public static Resource observational_study() {
    return _namespace_SIO("SIO_000976");
  }

  /**
   * A syllable is a verbal entity of language having one vowel sound, with or without surrounding consonants, forming the whole or a part of a word.
   * (http://semanticscience.org/resource/SIO_000977)
   */
  public static Resource syllable() {
    return _namespace_SIO("SIO_000977");
  }

  /**
   * a consonant is a verbal entity of language that is articulated with complete or partial closure of the vocal tract.
   * (http://semanticscience.org/resource/SIO_000978)
   */
  public static Resource consonant() {
    return _namespace_SIO("SIO_000978");
  }

  /**
   * a vowel is a verbal entity of language that is pronounced with an open vocal tract so that there is no build-up of air pressure at any point above the glottis.
   * (http://semanticscience.org/resource/SIO_000979)
   */
  public static Resource vowel() {
    return _namespace_SIO("SIO_000979");
  }

  /**
   * a sign language (also signed language) is a language that involves manual communication and body language to convey meaning. This can involve simultaneously combining hand shapes, orientation and movement of the hands, arms or body, and facial expressions to fluidly express a speaker"s thoughts.
   * (http://semanticscience.org/resource/SIO_000980)
   */
  public static Resource sign_language() {
    return _namespace_SIO("SIO_000980");
  }

  /**
   * a verbal language is a language that uses sounds to communicate.
   * (http://semanticscience.org/resource/SIO_000981)
   */
  public static Resource verbal_language() {
    return _namespace_SIO("SIO_000981");
  }

  /**
   * written language is a language that is communicated through a writing system.
   * (http://semanticscience.org/resource/SIO_000982)
   */
  public static Resource written_language() {
    return _namespace_SIO("SIO_000982");
  }

  /**
   * a gene-disease association is an association between a gene and a disease
   * (http://semanticscience.org/resource/SIO_000983)
   */
  public static Resource gene_disease_association() {
    return _namespace_SIO("SIO_000983");
  }

  /**
   * a genome is a collection of nucleic acids.
   * (http://semanticscience.org/resource/SIO_000984)
   */
  public static Resource genome() {
    return _namespace_SIO("SIO_000984");
  }

  /**
   * a gene that contains an open reading frame which codes for a protein.
   * (http://semanticscience.org/resource/SIO_000985)
   */
  public static Resource protein_coding_gene() {
    return _namespace_SIO("SIO_000985");
  }

  /**
   * a gene that codes for a functional RNA molecule
   * (http://semanticscience.org/resource/SIO_000986)
   */
  public static Resource functional_rna_coding_gene() {
    return _namespace_SIO("SIO_000986");
  }

  public static Resource predicted_gene() {
    return _namespace_SIO("SIO_000987");
  }

  /**
   * a pseudo gene is a region of a nucleic acid that either cannot be transcribed, or its rna transcript cannot be translated.
   * (http://semanticscience.org/resource/SIO_000988)
   */
  public static Resource pseudogene() {
    return _namespace_SIO("SIO_000988");
  }

  /**
   * a sequence assembly is a sequence that is produced as by the alignment of two or more sequences.
   * (http://semanticscience.org/resource/SIO_000989)
   */
  public static Resource sequence_assembly() {
    return _namespace_SIO("SIO_000989");
  }

  /**
   * an experimentally validated gene is a gene whose existence has been demonstrated through experimental methods.
   * (http://semanticscience.org/resource/SIO_000991)
   */
  public static Resource validated_gene() {
    return _namespace_SIO("SIO_000991");
  }

  /**
   * unsupported is an existence quality in which there is no evidence to support the existence of the entity.
   * (http://semanticscience.org/resource/SIO_000992)
   */
  public static Resource unsupported() {
    return _namespace_SIO("SIO_000992");
  }

  /**
   * a chemical-disease association is an association between a chemical and a disease.
   * (http://semanticscience.org/resource/SIO_000993)
   */
  public static Resource chemical_disease_association() {
    return _namespace_SIO("SIO_000993");
  }

  /**
   * An experiment is an investigation that has the goal of verifying, falsifying, or establishing the validity of a hypothesis.
   * (http://semanticscience.org/resource/SIO_000994)
   */
  public static Resource experiment() {
    return _namespace_SIO("SIO_000994");
  }

  /**
   * suspended is the status of a process that is no longer progressing towards completion.
   * (http://semanticscience.org/resource/SIO_000995)
   */
  public static Resource suspended() {
    return _namespace_SIO("SIO_000995");
  }

  /**
   * cancelled is a process status in which the process, while planned to occur, will not occur.
   * (http://semanticscience.org/resource/SIO_000996)
   */
  public static Resource cancelled() {
    return _namespace_SIO("SIO_000996");
  }

  /**
   * aborted is a process status in which a started process will not complete as intended.
   * (http://semanticscience.org/resource/SIO_000997)
   */
  public static Resource aborted() {
    return _namespace_SIO("SIO_000997");
  }

  /**
   * literature curation is the process of an agent selecting and extracting terms and phrases from a document.
   * (http://semanticscience.org/resource/SIO_000998)
   */
  public static Resource literature_curation() {
    return _namespace_SIO("SIO_000998");
  }

  /**
   * a procedure is a process that attempts to achieve one or more objectives by following an established set of actions.
   * (http://semanticscience.org/resource/SIO_000999)
   */
  public static Resource procedure() {
    return _namespace_SIO("SIO_000999");
  }

  /**
   * a clinical trial is an intervention trial to determine the safety and efficacy of  medical interventions (e.g., drugs, diagnostics, devices, therapy protocols).
   * (http://semanticscience.org/resource/SIO_001000)
   */
  public static Resource clinical_trial() {
    return _namespace_SIO("SIO_001000");
  }

  /**
   * A medical diagnosis (often simply termed diagnosis) refers to the process of attempting to determine or identify a possible disease or disorder.
   * (http://semanticscience.org/resource/SIO_001001)
   */
  public static Resource medical_diagnosis() {
    return _namespace_SIO("SIO_001001");
  }

  /**
   * A differential diagnosis (sometimes abbreviated DDx, ddx, DD, D/Dx, or ΔΔ) is a systematic diagnostic method used to identify the presence of an entity where multiple alternatives are possible (and the process may be termed differential diagnostic procedure), and may also refer to any of the included candidate alternatives (which may also be termed candidate condition).
   * (http://semanticscience.org/resource/SIO_001002)
   */
  public static Resource differential_diagnosis() {
    return _namespace_SIO("SIO_001002");
  }

  /**
   * A diagnostic opinion is an opinion resulting from a medical diagnostic procedure.
   * (http://semanticscience.org/resource/SIO_001003)
   */
  public static Resource diagnostic_opinion() {
    return _namespace_SIO("SIO_001003");
  }

  /**
   * an opinion is a belief that is the result of emotion or interpretation of facts.
   * (http://semanticscience.org/resource/SIO_001004)
   */
  public static Resource opinion() {
    return _namespace_SIO("SIO_001004");
  }

  /**
   * A drug effect is a chemical interaction in which a chemical elicits a marked characteristic of a biological system.
   * (http://semanticscience.org/resource/SIO_001005)
   */
  public static Resource drug_effect() {
    return _namespace_SIO("SIO_001005");
  }

  /**
   * a drug-drug interaction is an interaction in which two drugs interact in such a way to produce a non-additive biological response.
   * (http://semanticscience.org/resource/SIO_001006)
   */
  public static Resource drug_drug_interaction() {
    return _namespace_SIO("SIO_001006");
  }

  /**
   * An assay is an investigative (analytic) procedure in laboratory medicine, pharmacology, environmental biology, and molecular biology for qualitatively assessing or quantitatively measuring the presence or amount or the functional activity of a target entity (the analyte) which can be a drug or biochemical substance or a cell in an organism or organic sample.
   * (http://semanticscience.org/resource/SIO_001007)
   */
  public static Resource assay() {
    return _namespace_SIO("SIO_001007");
  }

  /**
   * toxicity is the quality of a chemical substance to cause injury to an organism in a dose dependent manner.
   * (http://semanticscience.org/resource/SIO_001008)
   */
  public static Resource toxicity() {
    return _namespace_SIO("SIO_001008");
  }

  public static Resource toxic() {
    return _namespace_SIO("SIO_001009");
  }

  public static Resource non_toxic() {
    return _namespace_SIO("SIO_001010");
  }

  /**
   * chemical quality is the quality of a chemical entity.
   * (http://semanticscience.org/resource/SIO_001011)
   */
  public static Resource chemical_quality() {
    return _namespace_SIO("SIO_001011");
  }

  /**
   * healthy is an organismal state of complete physical, mental and social well-being.
   * (http://semanticscience.org/resource/SIO_001012)
   */
  public static Resource healthy() {
    return _namespace_SIO("SIO_001012");
  }

  /**
   * age is the length of time that a person has lived or a thing has existed.
   * (http://semanticscience.org/resource/SIO_001013)
   */
  public static Resource age() {
    return _namespace_SIO("SIO_001013");
  }

  /**
   * ethnicity is the biological quality of membership in a social group based on a common heritage.
   * (http://semanticscience.org/resource/SIO_001014)
   */
  public static Resource ethnicity() {
    return _namespace_SIO("SIO_001014");
  }

  /**
   * race is a characteristic of an individual by heritable phenotypic characteristics, geographic ancestry, physical appearance, ethnicity, and social status.
   * (http://semanticscience.org/resource/SIO_001015)
   */
  public static Resource race() {
    return _namespace_SIO("SIO_001015");
  }

  /**
   * an ethnic group is a group of people whose members identify with each other through a common heritage, consisting of a common culture, including a shared language or dialect.
   * (http://semanticscience.org/resource/SIO_001016)
   */
  public static Resource ethnic_group() {
    return _namespace_SIO("SIO_001016");
  }

  /**
   * A syndrome is composed of a set of several clinically recognizable features, signs (observed by someone other than the patient), symptoms (reported by the patient), phenomena or characteristics that often occur together.
   * (http://semanticscience.org/resource/SIO_001017)
   */
  public static Resource syndrome() {
    return _namespace_SIO("SIO_001017");
  }

  /**
   * a ratio is a relationship between two numbers of the same kind expressed arithmetically as a dimensionless quotient of the two which explicitly indicates how many times the first number contains the second.
   * (http://semanticscience.org/resource/SIO_001018)
   */
  public static Resource ratio() {
    return _namespace_SIO("SIO_001018");
  }

  /**
   * A dose is the quantity of a chemical substance administered to a biological system.
   * (http://semanticscience.org/resource/SIO_001019)
   */
  public static Resource dose() {
    return _namespace_SIO("SIO_001019");
  }

  /**
   * effective dose is the amount of a substance required to produce an effect on a predefined percentage of a population.
   * (http://semanticscience.org/resource/SIO_001020)
   */
  public static Resource effective_dose() {
    return _namespace_SIO("SIO_001020");
  }

  /**
   * an expected value (or e-value) is the weighted average of all possible values that a random variable can take on.
   * (http://semanticscience.org/resource/SIO_001021)
   */
  public static Resource expected_value() {
    return _namespace_SIO("SIO_001021");
  }

  /**
   * A diagnostic test is a procedure performed to confirm, or determine the presence of disease in an individual suspected of having the disease, usually following the report of symptoms, or based on the results of other medical tests.
   * (http://semanticscience.org/resource/SIO_001022)
   */
  public static Resource diagnostic_test() {
    return _namespace_SIO("SIO_001022");
  }

  /**
   * A medical screening is a medical test or series used to detect or predict the presence of disease in individuals at risk for disease within a defined group, such as a population, family, or workforce
   * (http://semanticscience.org/resource/SIO_001023)
   */
  public static Resource medical_screening() {
    return _namespace_SIO("SIO_001023");
  }

  public static Resource medical_procedure() {
    return _namespace_SIO("SIO_001024");
  }

  /**
   * A prognosis is a proposition about the likely course of a disease, the chance of recovery or recurrence.
   * (http://semanticscience.org/resource/SIO_001025)
   */
  public static Resource prognosis() {
    return _namespace_SIO("SIO_001025");
  }

  /**
   * A report is a textual document made that present focused, salient content to a specific audience.
   * (http://semanticscience.org/resource/SIO_001026)
   */
  public static Resource report() {
    return _namespace_SIO("SIO_001026");
  }

  /**
   * A medical health record is a record of a single patient"s medical history.
   * (http://semanticscience.org/resource/SIO_001027)
   */
  public static Resource medical_health_record() {
    return _namespace_SIO("SIO_001027");
  }

  /**
   * a medical report is a report prepared by a health care practioner about test outcomes or health status of an individual.
   * (http://semanticscience.org/resource/SIO_001028)
   */
  public static Resource medical_report() {
    return _namespace_SIO("SIO_001028");
  }

  /**
   * a peer reviewed article is an article that has undergone peer-review and deemed acceptable for publication.
   * (http://semanticscience.org/resource/SIO_001029)
   */
  public static Resource peer_reviewed_article() {
    return _namespace_SIO("SIO_001029");
  }

  /**
   * a major version number is a version of a software that exhibits a significant change in functionalilty from a prior version.
   * (http://semanticscience.org/resource/SIO_001030)
   */
  public static Resource major_version_number() {
    return _namespace_SIO("SIO_001030");
  }

  /**
   * a minor version number is a version of a software that exhibits minor features or significant fix from a prior version.
   * (http://semanticscience.org/resource/SIO_001031)
   */
  public static Resource minor_version_number() {
    return _namespace_SIO("SIO_001031");
  }

  /**
   * a revision number is a version of a software in which bugs have been fixed from a prior version.
   * (http://semanticscience.org/resource/SIO_001032)
   */
  public static Resource revision_number() {
    return _namespace_SIO("SIO_001032");
  }

  public static Resource text_quality() {
    return _namespace_SIO("SIO_001033");
  }

  public static Resource reviewed() {
    return _namespace_SIO("SIO_001034");
  }

  public static Resource peer_reviewed() {
    return _namespace_SIO("SIO_001035");
  }

  public static Resource draft() {
    return _namespace_SIO("SIO_001036");
  }

  public static Resource finalized() {
    return _namespace_SIO("SIO_001037");
  }

  public static Resource editor_reviewed() {
    return _namespace_SIO("SIO_001038");
  }

  public static Resource written() {
    return _namespace_SIO("SIO_001039");
  }

  /**
   * a morpheme is the smallest semantically meaningful unit in a language
   * (http://semanticscience.org/resource/SIO_001040)
   */
  public static Resource morpheme() {
    return _namespace_SIO("SIO_001040");
  }

  /**
   * A study design is a protocol for the proper execution of a study which normally requires a carefullly crafted research question or hypothesis and at least one variable under observation and observed values for that variable.
   * (http://semanticscience.org/resource/SIO_001041)
   */
  public static Resource study_design() {
    return _namespace_SIO("SIO_001041");
  }

  /**
   * A recipe is a set of instructions that describe how to prepare or make something.
   * (http://semanticscience.org/resource/SIO_001042)
   */
  public static Resource recipe() {
    return _namespace_SIO("SIO_001042");
  }

  /**
   * a protocol is a predefined procedural method in the design and implementation of experiments. In addition to providing a detailed set of procedures and lists of required equipment and instruments, protocols often include information on safety precautions, the calculation of results and reporting standards, including statistical analysis and rules for predefining and documenting excluded data to avoid bias.
   * (http://semanticscience.org/resource/SIO_001043)
   */
  public static Resource protocol() {
    return _namespace_SIO("SIO_001043");
  }

  public static Resource viroid() {
    return _namespace_SIO("SIO_001044");
  }

  public static Resource polar_quality() {
    return _namespace_SIO("SIO_001045");
  }

  public static Resource polar() {
    return _namespace_SIO("SIO_001046");
  }

  public static Resource non_polar() {
    return _namespace_SIO("SIO_001047");
  }

  /**
   * an intervention study has the objective of improving the condition of an individual or a group of individuals, and demonstrates the magnitude of that capability by comparing it to a control group.
   * (http://semanticscience.org/resource/SIO_001048)
   */
  public static Resource intervention_study() {
    return _namespace_SIO("SIO_001048");
  }

  /**
   * sampling is the act of obtaining a sample, whether through selection, collection or preparation.
   * (http://semanticscience.org/resource/SIO_001049)
   */
  public static Resource sampling() {
    return _namespace_SIO("SIO_001049");
  }

  /**
   * a sample is a limited quantity of something (e.g. an individual or set of individuals from a population, or a portion of a substance) to be used for testing, analysis, inspection, investigation, demonstration, or trial use.
   * (http://semanticscience.org/resource/SIO_001050)
   */
  public static Resource sample() {
    return _namespace_SIO("SIO_001050");
  }

  /**
   * Analysis of data is a process of inspecting, cleaning, transforming, and modeling data with the goal of highlighting useful information, suggesting conclusions, and supporting decision making.
   * (http://semanticscience.org/resource/SIO_001051)
   */
  public static Resource data_analysis() {
    return _namespace_SIO("SIO_001051");
  }

  /**
   * the act of collecting data for further analysis.
   * (http://semanticscience.org/resource/SIO_001052)
   */
  public static Resource data_collection() {
    return _namespace_SIO("SIO_001052");
  }

  /**
   * A reason is a justification that specifies the motive for an action or a determination
   * (http://semanticscience.org/resource/SIO_001053)
   */
  public static Resource reason() {
    return _namespace_SIO("SIO_001053");
  }

  /**
   * measurement is a procedure to obtain a measurement value.
   * (http://semanticscience.org/resource/SIO_001054)
   */
  public static Resource measurement() {
    return _namespace_SIO("SIO_001054");
  }

  /**
   * an observation is a process of passive interaction in which one entity makes note of attributes of one or more entities.
   * (http://semanticscience.org/resource/SIO_001055)
   */
  public static Resource observation() {
    return _namespace_SIO("SIO_001055");
  }

  /**
   * the ordinal position of a character in a sequence of characters.
   * (http://semanticscience.org/resource/SIO_001056)
   */
  public static Resource character_position() {
    return _namespace_SIO("SIO_001056");
  }

  /**
   * the position of the first character in a word as an offset from the first character of the text in which it is found.
   * (http://semanticscience.org/resource/SIO_001057)
   */
  public static Resource word_start_position() {
    return _namespace_SIO("SIO_001057");
  }

  /**
   * word end position is the position of the last character in a word as an offset from the first character of the text in which it is found.
   * (http://semanticscience.org/resource/SIO_001058)
   */
  public static Resource word_end_position() {
    return _namespace_SIO("SIO_001058");
  }

  /**
   * A physical gesture is a form of non-verbal communication in which visible bodily actions communicate particular messages, either in place of speech or together and in parallel with spoken words. Gestures include movement of the hands, face, or other parts of the body.
   * (http://semanticscience.org/resource/SIO_001059)
   */
  public static Resource physical_gesture() {
    return _namespace_SIO("SIO_001059");
  }

  /**
   * planned is a process status for a process that has not yet started, but is referred to in a plan.
   * (http://semanticscience.org/resource/SIO_001060)
   */
  public static Resource planned() {
    return _namespace_SIO("SIO_001060");
  }

  /**
   * A population is all the organisms that both belong to the same group or species and live in the same geographical area.
   * (http://semanticscience.org/resource/SIO_001061)
   */
  public static Resource population() {
    return _namespace_SIO("SIO_001061");
  }

  /**
   * a human population refers to a collection of human beings.
   * (http://semanticscience.org/resource/SIO_001062)
   */
  public static Resource human_population() {
    return _namespace_SIO("SIO_001062");
  }

  /**
   * a group of people affiliated by consanguinity, affinity, or co-residence.
   * (http://semanticscience.org/resource/SIO_001063)
   */
  public static Resource family() {
    return _namespace_SIO("SIO_001063");
  }

  /**
   * a community is a sizeable social unit that shares common values.
   * (http://semanticscience.org/resource/SIO_001064)
   */
  public static Resource community() {
    return _namespace_SIO("SIO_001064");
  }

  /**
   * speculation is an opinion based on incomplete evidence
   * (http://semanticscience.org/resource/SIO_001065)
   */
  public static Resource speculation() {
    return _namespace_SIO("SIO_001065");
  }

  /**
   * execution of study design is a process that results from precisely following each of the steps of a study design.
   * (http://semanticscience.org/resource/SIO_001066)
   */
  public static Resource execution_of_study_design() {
    return _namespace_SIO("SIO_001066");
  }

  /**
   * In a controlled observational cohort study, two groups of subjects are selected from two populations that are thought to differ in only one characteristic. The groups of subjects are studied for a specific period and contrasted at the end of the study period.
   * (http://semanticscience.org/resource/SIO_001067)
   */
  public static Resource controlled_observational_cohort_study() {
    return _namespace_SIO("SIO_001067");
  }

  /**
   * a control group is a group of individuals that are not subject to an intervention of interest, but rather serve as a baseline to compare the outcomes in the intervention group.
   * (http://semanticscience.org/resource/SIO_001068)
   */
  public static Resource control_group() {
    return _namespace_SIO("SIO_001068");
  }

  /**
   * An intervention group is a group of individuals that are subject to an intervention.
   * (http://semanticscience.org/resource/SIO_001069)
   */
  public static Resource intervention_group() {
    return _namespace_SIO("SIO_001069");
  }

  /**
   * A control variable that is believed to alter the dependent or independent variables, but may not actually be the focus of the experiment. So that variable will be kept constant or monitored to try to minimise its effect on the experiment.
   * (http://semanticscience.org/resource/SIO_001070)
   */
  public static Resource control_variable() {
    return _namespace_SIO("SIO_001070");
  }

  /**
   * text span start position is the position (offset) of the first character of a text span in relation the text it is from.
   * (http://semanticscience.org/resource/SIO_001071)
   */
  public static Resource text_span_start_position() {
    return _namespace_SIO("SIO_001071");
  }

  public static Resource text_span_end_position() {
    return _namespace_SIO("SIO_001072");
  }

  /**
   * a text span is a subset of contiguous sequence of characters of a textual entity.
   * (http://semanticscience.org/resource/SIO_001073)
   */
  public static Resource text_span() {
    return _namespace_SIO("SIO_001073");
  }

  /**
   * a t-statistic is a ratio of the departure of an estimated parameter from its notional value and its standard error.
   * (http://semanticscience.org/resource/SIO_001074)
   */
  public static Resource t_statistic() {
    return _namespace_SIO("SIO_001074");
  }

  /**
   * a microarray probe set identifier is an identifier for a set of probe pairs selected to represent expressed sequences on an array.
   * (http://semanticscience.org/resource/SIO_001075)
   */
  public static Resource microarray_probe_set_identifier() {
    return _namespace_SIO("SIO_001075");
  }

  public static Resource microarray_experiment() {
    return _namespace_SIO("SIO_001076");
  }

  public static Resource gene_expression_value() {
    return _namespace_SIO("SIO_001077");
  }

  /**
   * a differential gene expression ratio is the ratio of gene expression values from a test sample compared to a control sample.
   * (http://semanticscience.org/resource/SIO_001078)
   */
  public static Resource differential_gene_expression_ratio() {
    return _namespace_SIO("SIO_001078");
  }

  /**
   * a genotype is a functional specification of a biological entity in terms of its genetic composition (or lack thereof).
   * (http://semanticscience.org/resource/SIO_001079)
   */
  public static Resource genotype() {
    return _namespace_SIO("SIO_001079");
  }

  /**
   * a vocabulary is a collection of terms.
   * (http://semanticscience.org/resource/SIO_001080)
   */
  public static Resource vocabulary() {
    return _namespace_SIO("SIO_001080");
  }

  /**
   * a t-statistic based increased differential gene expression is a differential gene expression ratio in which the t-statistic is greater than zero.
   * (http://semanticscience.org/resource/SIO_001081)
   */
  public static Resource t_statistic_based_increased_differential_gene_expression() {
    return _namespace_SIO("SIO_001081");
  }

  /**
   * a t-statistic based decreased differential gene expression is a differential gene expression ratio in which the t-statistic is less than zero.
   * (http://semanticscience.org/resource/SIO_001082)
   */
  public static Resource t_statistic_based_decreased_differential_gene_expression() {
    return _namespace_SIO("SIO_001082");
  }

  /**
   * a date of database submission refers to the moment in time in which some information was submitted/received to a database system.
   * (http://semanticscience.org/resource/SIO_001083)
   */
  public static Resource date_of_database_submission() {
    return _namespace_SIO("SIO_001083");
  }

  /**
   * a biological organisn is a biological entity that consists of one or more cells and is capable of genomic replication (independently or not).
   * (http://semanticscience.org/resource/SIO_010000)
   */
  public static Resource organism() {
    return _namespace_SIO("SIO_010000");
  }

  /**
   * a cell is a biological entity that is contained by a plasma membrane.
   * (http://semanticscience.org/resource/SIO_010001)
   */
  public static Resource cell() {
    return _namespace_SIO("SIO_010001");
  }

  /**
   * a tissue is a mereologically maximal collection of cells that together perform some function.
   * (http://semanticscience.org/resource/SIO_010002)
   */
  public static Resource tissue() {
    return _namespace_SIO("SIO_010002");
  }

  /**
   * an organ is a collection of tissues joined in structural unit to serve a common function.
   * (http://semanticscience.org/resource/SIO_010003)
   */
  public static Resource organ() {
    return _namespace_SIO("SIO_010003");
  }

  /**
   * A chemical entity is a material entity that pertains to chemistry.
   * (http://semanticscience.org/resource/SIO_010004)
   */
  public static Resource chemical_entity() {
    return _namespace_SIO("SIO_010004");
  }

  /**
   * a weak submolecular component is a submolecular component that weakly connects submolecular components.
   * (http://semanticscience.org/resource/SIO_010005)
   */
  public static Resource weak_submolecular_component() {
    return _namespace_SIO("SIO_010005");
  }

  public static Resource polypeptide() {
    return _namespace_SIO("SIO_010007");
  }

  public static Resource nucleic_acid() {
    return _namespace_SIO("SIO_010008");
  }

  public static Resource ribonucleic_acid() {
    return _namespace_SIO("SIO_010009");
  }

  public static Resource deoxyribonucleic_acid() {
    return _namespace_SIO("SIO_010010");
  }

  public static Resource lipid() {
    return _namespace_SIO("SIO_010011");
  }

  /**
   * A chemical interaction is a biochemical process in which chemical entities interact through some set of attractive forces.
   * (http://semanticscience.org/resource/SIO_010013)
   */
  public static Resource chemical_interaction() {
    return _namespace_SIO("SIO_010013");
  }

  public static Resource primary_structure_descriptor() {
    return _namespace_SIO("SIO_010014");
  }

  public static Resource protein_sequence() {
    return _namespace_SIO("SIO_010015");
  }

  public static Resource nucleic_acid_sequence() {
    return _namespace_SIO("SIO_010016");
  }

  public static Resource ribonucleic_acid_sequence() {
    return _namespace_SIO("SIO_010017");
  }

  public static Resource deoxyribonucleic_acid_sequence() {
    return _namespace_SIO("SIO_010018");
  }

  /**
   * Biological data is scientific data relevant to biology.
   * (http://semanticscience.org/resource/SIO_010019)
   */
  public static Resource biological_data() {
    return _namespace_SIO("SIO_010019");
  }

  /**
   * A submolecular entity is a part of a molecular entity.
   * (http://semanticscience.org/resource/SIO_010020)
   */
  public static Resource submolecular_entity() {
    return _namespace_SIO("SIO_010020");
  }

  public static Resource secondary_structure_descriptor() {
    return _namespace_SIO("SIO_010022");
  }

  public static Resource tertiary_structure_descriptor() {
    return _namespace_SIO("SIO_010023");
  }

  public static Resource quaternary_structure() {
    return _namespace_SIO("SIO_010024");
  }

  public static Resource carbohydrate_polymer() {
    return _namespace_SIO("SIO_010025");
  }

  /**
   * genetic polymorphism is a biological feature that provides information about a comparative difference in genetic composition.
   * (http://semanticscience.org/resource/SIO_010026)
   */
  public static Resource genetic_polymorphism() {
    return _namespace_SIO("SIO_010026");
  }

  /**
   * single nucleotide polymorphism (SNP) is a variation in a single base in the genetic composition between different individuals of the same species.
   * (http://semanticscience.org/resource/SIO_010027)
   */
  public static Resource snp() {
    return _namespace_SIO("SIO_010027");
  }

  public static Resource genetic_data() {
    return _namespace_SIO("SIO_010028");
  }

  public static Resource biological_sex() {
    return _namespace_SIO("SIO_010029");
  }

  public static Resource monosaccharide() {
    return _namespace_SIO("SIO_010030");
  }

  /**
   * A PDB chain identifier is a alphabetical label to identify a molecule in a structure.
   * (http://semanticscience.org/resource/SIO_010031)
   */
  public static Resource PDB_chain_identifier() {
    return _namespace_SIO("SIO_010031");
  }

  /**
   * A PDB record identifier is an identifier for a PDB generated record.
   * (http://semanticscience.org/resource/SIO_010032)
   */
  public static Resource PDB_record_identifier() {
    return _namespace_SIO("SIO_010032");
  }

  /**
   * a hydrogen bond is a weak submolecular interaction formed between a hydrogen atom and a electronegative atom.
   * (http://semanticscience.org/resource/SIO_010033)
   */
  public static Resource hydrogen_bond() {
    return _namespace_SIO("SIO_010033");
  }

  /**
   * A cation pi interaction is an ionic interaction between the localized negative charge of π orbital electrons, located above and below the plane of an aromatic ring, and a positive charge.
   * (http://semanticscience.org/resource/SIO_010034)
   */
  public static Resource cation_pi_interaction() {
    return _namespace_SIO("SIO_010034");
  }

  /**
   * A gene is part of a nucleic acid that contains all the necessary elements to encode a functional transcript.
   * (http://semanticscience.org/resource/SIO_010035)
   */
  public static Resource gene() {
    return _namespace_SIO("SIO_010035");
  }

  /**
   * A biochemical reaction is a biochemical process that involves the conversion of at least one chemical participant (target) into another (product) by an enzyme (agent).
   * (http://semanticscience.org/resource/SIO_010036)
   */
  public static Resource biochemical_reaction() {
    return _namespace_SIO("SIO_010036");
  }

  /**
   * a chemical element is a homogeneous substance composed of one type of atom.
   * (http://semanticscience.org/resource/SIO_010037)
   */
  public static Resource chemical_element() {
    return _namespace_SIO("SIO_010037");
  }

  /**
   * A drug is a chemical entity that regulates a biological process.
   * (http://semanticscience.org/resource/SIO_010038)
   */
  public static Resource drug() {
    return _namespace_SIO("SIO_010038");
  }

  /**
   * A pharmaceutical preparation is a chemical substance approved for use in the medical diagnosis, cure, treatment, or prevention of disease.
   * (http://semanticscience.org/resource/SIO_010039)
   */
  public static Resource pharmaceutical_preparation() {
    return _namespace_SIO("SIO_010039");
  }

  public static Resource binding_site() {
    return _namespace_SIO("SIO_010040");
  }

  public static Resource active_site() {
    return _namespace_SIO("SIO_010041");
  }

  /**
   * A haplotype is one of a set of genomic sequence variants.
   * (http://semanticscience.org/resource/SIO_010042)
   */
  public static Resource haplotype() {
    return _namespace_SIO("SIO_010042");
  }

  public static Resource protein() {
    return _namespace_SIO("SIO_010043");
  }

  /**
   * An atom is composed of a core of protons and/or neutrons which may be surrounded by a cloud of electrons.
   * (http://semanticscience.org/resource/SIO_010044)
   */
  public static Resource atom() {
    return _namespace_SIO("SIO_010044");
  }

  /**
   * a base pair is a weak molecular interaction composed of hydrogen bonds between nucleobases.
   * (http://semanticscience.org/resource/SIO_010045)
   */
  public static Resource base_pair() {
    return _namespace_SIO("SIO_010045");
  }

  /**
   * a biological entity is a heterogeneous substance that contains genomic material or is the product of a biological process.
   * (http://semanticscience.org/resource/SIO_010046)
   */
  public static Resource biological_entity() {
    return _namespace_SIO("SIO_010046");
  }

  /**
   * a strong submolecular component is a submolecular component that strongly connects submolecular components.
   * (http://semanticscience.org/resource/SIO_010047)
   */
  public static Resource strong_submolecular_component() {
    return _namespace_SIO("SIO_010047");
  }

  /**
   * male is a biological sex of an individual with male sexual organs.
   * (http://semanticscience.org/resource/SIO_010048)
   */
  public static Resource male() {
    return _namespace_SIO("SIO_010048");
  }

  public static Resource molecular_site() {
    return _namespace_SIO("SIO_010049");
  }

  public static Resource allosteric_site() {
    return _namespace_SIO("SIO_010050");
  }

  /**
   * a biological fluid is a fluid of biological origin.
   * (http://semanticscience.org/resource/SIO_010051)
   */
  public static Resource biological_fluid() {
    return _namespace_SIO("SIO_010051");
  }

  /**
   * female is a biological sex of an individual with female sexual organs.
   * (http://semanticscience.org/resource/SIO_010052)
   */
  public static Resource female() {
    return _namespace_SIO("SIO_010052");
  }

  public static Resource lineage() {
    return _namespace_SIO("SIO_010053");
  }

  /**
   * A cell line is a collection of genetically identifical cells.
   * (http://semanticscience.org/resource/SIO_010054)
   */
  public static Resource cell_line() {
    return _namespace_SIO("SIO_010054");
  }

  /**
   * A strain is a genetic variant or kind of microorganism.
   * (http://semanticscience.org/resource/SIO_010055)
   */
  public static Resource strain() {
    return _namespace_SIO("SIO_010055");
  }

  /**
   * a phenotype is an observable characteristic of an individual.
   * (http://semanticscience.org/resource/SIO_010056)
   */
  public static Resource phenotype() {
    return _namespace_SIO("SIO_010056");
  }

  public static Resource organismal_stative_quality() {
    return _namespace_SIO("SIO_010057");
  }

  /**
   * alive is the state of a biological organism that exhibits biological functions.
   * (http://semanticscience.org/resource/SIO_010058)
   */
  public static Resource alive() {
    return _namespace_SIO("SIO_010058");
  }

  /**
   * dead is the quality of an object in which there is a cessation of all biological functions.
   * (http://semanticscience.org/resource/SIO_010059)
   */
  public static Resource dead() {
    return _namespace_SIO("SIO_010059");
  }

  public static Resource family_history() {
    return _namespace_SIO("SIO_010060");
  }

  public static Resource generation_number() {
    return _namespace_SIO("SIO_010061");
  }

  /**
   * The five prime untranslated region (5" UTR) is a section of messenger RNA (mRNA) and the DNA that codes for it that starts at the +1 position (where transcription begins) and ends one nucleotide before the start codon (usually AUG) of the coding region.
   * (http://semanticscience.org/resource/SIO_010064)
   */
  public static Resource a_untranslated_region() {
    return _namespace_SIO("SIO_010064");
  }

  public static Resource bioinformatic_data() {
    return _namespace_SIO("SIO_010065");
  }

  public static Resource sequence_alignment() {
    return _namespace_SIO("SIO_010066");
  }

  public static Resource multiple_sequence_alignment() {
    return _namespace_SIO("SIO_010067");
  }

  public static Resource pairwise_sequence_alignment() {
    return _namespace_SIO("SIO_010068");
  }

  public static Resource organic_submolecule() {
    return _namespace_SIO("SIO_010071");
  }

  /**
   * An organic molecular entity is a chemical entity composed of organic atoms (at least carbon, hydrogen, and optionally oxygen, phosphorus, nitrogen)
   * (http://semanticscience.org/resource/SIO_010072)
   */
  public static Resource organic_molecule() {
    return _namespace_SIO("SIO_010072");
  }

  public static Resource open_reading_frame() {
    return _namespace_SIO("SIO_010073");
  }

  public static Resource amino_acid_residue() {
    return _namespace_SIO("SIO_010074");
  }

  public static Resource nucleotide_residue() {
    return _namespace_SIO("SIO_010075");
  }

  /**
   * A poison is a drug that is harzardous or toxic to an organism when ingested at a certain quantity.
   * (http://semanticscience.org/resource/SIO_010076)
   */
  public static Resource poison() {
    return _namespace_SIO("SIO_010076");
  }

  /**
   * An active ingredient is a molecular entity that exhibits
   * (http://semanticscience.org/resource/SIO_010077)
   */
  public static Resource active_ingredient() {
    return _namespace_SIO("SIO_010077");
  }

  /**
   * An operon is a collection of contiguous genes transcribed as a single (polycistronic) mRNA.
   * (http://semanticscience.org/resource/SIO_010084)
   */
  public static Resource operon() {
    return _namespace_SIO("SIO_010084");
  }

  public static Resource gene_regulatory_component() {
    return _namespace_SIO("SIO_010085");
  }

  public static Resource enhancer() {
    return _namespace_SIO("SIO_010086");
  }

  public static Resource inactive_ingredient() {
    return _namespace_SIO("SIO_010087");
  }

  public static Resource to_serve_as_a_template_for_molecular_synthesis() {
    return _namespace_SIO("SIO_010088");
  }

  public static Resource to_serve_as_a_template_for_protein_synthesis() {
    return _namespace_SIO("SIO_010089");
  }

  public static Resource to_serve_as_a_template_for_RNA_synthesis() {
    return _namespace_SIO("SIO_010090");
  }

  public static Resource to_serve_as_a_template_for_DNA_synthesis() {
    return _namespace_SIO("SIO_010091");
  }

  public static Resource deoxyribonucleic_acid_template() {
    return _namespace_SIO("SIO_010092");
  }

  public static Resource deoxyribonucleic_acid_primer() {
    return _namespace_SIO("SIO_010093");
  }

  public static Resource to_serve_as_a_primer_for_DNA_synthesis() {
    return _namespace_SIO("SIO_010094");
  }

  public static Resource RNA_transcript_component() {
    return _namespace_SIO("SIO_010095");
  }

  public static Resource mature_mRNA() {
    return _namespace_SIO("SIO_010096");
  }

  /**
   * Precursor mRNA (pre-mRNA) is a single strand of messenger ribonucleic acid (mRNA) that is synthesized from a DNA template throught transcription.
   * (http://semanticscience.org/resource/SIO_010097)
   */
  public static Resource pre_mRNA() {
    return _namespace_SIO("SIO_010097");
  }

  public static Resource mRNA_splice_variant() {
    return _namespace_SIO("SIO_010098");
  }

  public static Resource messenger_RNA() {
    return _namespace_SIO("SIO_010099");
  }

  /**
   * a gene that is located on DNA.
   * (http://semanticscience.org/resource/SIO_010100)
   */
  public static Resource dna_gene() {
    return _namespace_SIO("SIO_010100");
  }

  /**
   * a gene that is located on RNA
   * (http://semanticscience.org/resource/SIO_010101)
   */
  public static Resource rna_gene() {
    return _namespace_SIO("SIO_010101");
  }

  /**
   * an allele is one of a set of sequence variants of a gene.
   * (http://semanticscience.org/resource/SIO_010277)
   */
  public static Resource allele() {
    return _namespace_SIO("SIO_010277");
  }

  /**
   * Ploidy is the cellular quality relating to the amount of DNA contained in a cell.
   * (http://semanticscience.org/resource/SIO_010278)
   */
  public static Resource ploidy() {
    return _namespace_SIO("SIO_010278");
  }

  /**
   * Chemical transport is the directed movement of a chemical entity by some agent (e.g. transporter).
   * (http://semanticscience.org/resource/SIO_010283)
   */
  public static Resource chemical_transport() {
    return _namespace_SIO("SIO_010283");
  }

  /**
   * Active transport is the movement of a substance across a membrane against its concentration gradient (from low to high concentration) and requires chemical energy.
   * (http://semanticscience.org/resource/SIO_010284)
   */
  public static Resource active_transport() {
    return _namespace_SIO("SIO_010284");
  }

  public static Resource molecular_complex_formation() {
    return _namespace_SIO("SIO_010285");
  }

  public static Resource molecular_complex_dissociation() {
    return _namespace_SIO("SIO_010286");
  }

  /**
   * Biochemical regulation is a biochemical process that changes the frequency, rate or extent of a downstream biochemical process.
   * (http://semanticscience.org/resource/SIO_010287)
   */
  public static Resource biochemical_regulation() {
    return _namespace_SIO("SIO_010287");
  }

  /**
   * Biochemical activation is a molecular interaction that increases the catalytic rate of the target enzyme.
   * (http://semanticscience.org/resource/SIO_010288)
   */
  public static Resource biochemical_activation() {
    return _namespace_SIO("SIO_010288");
  }

  /**
   * Biochemical inhibition is a molecular interaction that decreases the catalytic rate of the target enzyme.
   * (http://semanticscience.org/resource/SIO_010289)
   */
  public static Resource biochemical_inhibition() {
    return _namespace_SIO("SIO_010289");
  }

  /**
   * Positve regulation is a biochemical regulation that increases the frequency, rate or extent of a downstream biochemical process.
   * (http://semanticscience.org/resource/SIO_010295)
   */
  public static Resource positive_regulation() {
    return _namespace_SIO("SIO_010295");
  }

  /**
   * Negative regulation is a biochemical regulation that decreases the frequency, rate or extent of a downstream biochemical process.
   * (http://semanticscience.org/resource/SIO_010296)
   */
  public static Resource negative_regulation() {
    return _namespace_SIO("SIO_010296");
  }

  public static Resource medical_data() {
    return _namespace_SIO("SIO_010298");
  }

  /**
   * disease is the outward manifestation of one or more disorders.
   * (http://semanticscience.org/resource/SIO_010299)
   */
  public static Resource disease() {
    return _namespace_SIO("SIO_010299");
  }

  /**
   * Transcription is the process of creating a complementary RNA copy of a sequence of DNA.
   * (http://semanticscience.org/resource/SIO_010300)
   */
  public static Resource transcription() {
    return _namespace_SIO("SIO_010300");
  }

  /**
   * Translation is the process of producing a polypeptide from a ribonucleic acid by a ribosome.
   * (http://semanticscience.org/resource/SIO_010301)
   */
  public static Resource translation() {
    return _namespace_SIO("SIO_010301");
  }

  public static Resource molecular_modification() {
    return _namespace_SIO("SIO_010307");
  }

  /**
   * Metabolism is the set of chemical processes that occur within a living organism in order to maintain life.
   * (http://semanticscience.org/resource/SIO_010308)
   */
  public static Resource metabolism() {
    return _namespace_SIO("SIO_010308");
  }

  /**
   * Anabolism is the set of metabolic processes that take apart larger chemical entities units into smaller chemical entities.
   * (http://semanticscience.org/resource/SIO_010309)
   */
  public static Resource catabolism() {
    return _namespace_SIO("SIO_010309");
  }

  /**
   * Anabolism is the set of metabolic processes that construct larger chemical entities units from smaller chemical entities.
   * (http://semanticscience.org/resource/SIO_010310)
   */
  public static Resource anabolism() {
    return _namespace_SIO("SIO_010310");
  }

  public static Resource carbohydrate_residue() {
    return _namespace_SIO("SIO_010334");
  }

  public static Resource nucleic_acid_part() {
    return _namespace_SIO("SIO_010335");
  }

  public static Resource deoxyribonucleotide_residue() {
    return _namespace_SIO("SIO_010336");
  }

  public static Resource ribonucleotide_residue() {
    return _namespace_SIO("SIO_010337");
  }

  public static Resource pharmaceutical_component() {
    return _namespace_SIO("SIO_010338");
  }

  public static Resource to_covalently_modify() {
    return _namespace_SIO("SIO_010340");
  }

  /**
   * A covalently connected molecular entity is the mereological sum of a collection of covalently bonded atoms.
   * (http://semanticscience.org/resource/SIO_010341)
   */
  public static Resource covalently_connected_entity() {
    return _namespace_SIO("SIO_010341");
  }

  /**
   * a chemical complex is a chemical entity composed of a weakly connected ions or molecules.
   * (http://semanticscience.org/resource/SIO_010342)
   */
  public static Resource chemical_complex() {
    return _namespace_SIO("SIO_010342");
  }

  /**
   * an enzyme is a protein or protein complex that realizes its disposition to covalently modify some molecule during a chemical reaction.
   * (http://semanticscience.org/resource/SIO_010343)
   */
  public static Resource enzyme() {
    return _namespace_SIO("SIO_010343");
  }

  /**
   * a catalyst is a molecule that has the capability to reduce the activation energy of a reaction and hence increase the overall rate of reaction.
   * (http://semanticscience.org/resource/SIO_010344)
   */
  public static Resource catalyst() {
    return _namespace_SIO("SIO_010344");
  }

  /**
   * A chemical reaction is a process that leads to the transformation of one set of chemical substances to another.
   * (http://semanticscience.org/resource/SIO_010345)
   */
  public static Resource chemical_reaction() {
    return _namespace_SIO("SIO_010345");
  }

  public static Resource organic_polymer() {
    return _namespace_SIO("SIO_010346");
  }

  public static Resource to_modify_conformation_of() {
    return _namespace_SIO("SIO_010347");
  }

  public static Resource to_cleave() {
    return _namespace_SIO("SIO_010349");
  }

  public static Resource to_combine() {
    return _namespace_SIO("SIO_010351");
  }

  public static Resource to_breathe() {
    return _namespace_SIO("SIO_010353");
  }

  public static Resource to_conformationally_activate() {
    return _namespace_SIO("SIO_010354");
  }

  public static Resource to_conformationally_inhibit() {
    return _namespace_SIO("SIO_010355");
  }

  public static Resource to_modify_oxidation_state_of() {
    return _namespace_SIO("SIO_010360");
  }

  public static Resource substrate() {
    return _namespace_SIO("SIO_010362");
  }

  public static Resource product() {
    return _namespace_SIO("SIO_010363");
  }

  public static Resource to_be_modified() {
    return _namespace_SIO("SIO_010364");
  }

  public static Resource to_be_cleaved() {
    return _namespace_SIO("SIO_010365");
  }

  public static Resource to_be_covalently_modified() {
    return _namespace_SIO("SIO_010366");
  }

  public static Resource to_be_combined() {
    return _namespace_SIO("SIO_010367");
  }

  /**
   * to be transported is the disposition to undergo motion.
   * (http://semanticscience.org/resource/SIO_010368)
   */
  public static Resource to_be_transported() {
    return _namespace_SIO("SIO_010368");
  }

  public static Resource to_be_electronically_modified() {
    return _namespace_SIO("SIO_010369");
  }

  public static Resource to_gain_an_electron() {
    return _namespace_SIO("SIO_010370");
  }

  public static Resource to_lose_an_electron() {
    return _namespace_SIO("SIO_010371");
  }

  public static Resource to_be_activated() {
    return _namespace_SIO("SIO_010372");
  }

  public static Resource to_be_inhibited() {
    return _namespace_SIO("SIO_010373");
  }

  public static Resource to_be_conformationally_changed() {
    return _namespace_SIO("SIO_010374");
  }

  /**
   * a multi-cellular organism is an organism that consists of more than one cell.
   * (http://semanticscience.org/resource/SIO_010375)
   */
  public static Resource multicellular_organism() {
    return _namespace_SIO("SIO_010375");
  }

  /**
   * a unicellular organism is a organism that is composed of a single cell.
   * (http://semanticscience.org/resource/SIO_010376)
   */
  public static Resource unicellular_organism() {
    return _namespace_SIO("SIO_010376");
  }

  public static Resource cellular_organism() {
    return _namespace_SIO("SIO_010377");
  }

  public static Resource non_cellular_organism() {
    return _namespace_SIO("SIO_010378");
  }

  public static Resource virus() {
    return _namespace_SIO("SIO_010379");
  }

  /**
   * A drug regulatory authority is a regulatory authority which acts to control what substances may be used to treat individuals.
   * (http://semanticscience.org/resource/SIO_010383)
   */
  public static Resource drug_regulatory_authority() {
    return _namespace_SIO("SIO_010383");
  }

  public static Resource specialized_chemical_entity() {
    return _namespace_SIO("SIO_010410");
  }

  /**
   * A reagent is a substance that is added to a system in order to bring about a chemical reaction, or added to see if a reaction occurs.
   * (http://semanticscience.org/resource/SIO_010411)
   */
  public static Resource reagent() {
    return _namespace_SIO("SIO_010411");
  }

  /**
   * A specimen is a portion of material for use in testing, examination, or study.
   * (http://semanticscience.org/resource/SIO_010412)
   */
  public static Resource specimen() {
    return _namespace_SIO("SIO_010412");
  }

  /**
   * A pathogen or infectious agent  is a microorganism that causes disease in its host.
   * (http://semanticscience.org/resource/SIO_010414)
   */
  public static Resource pathogen() {
    return _namespace_SIO("SIO_010414");
  }

  /**
   * a host is an organism that harbors a parasite, or a mutual or commensal symbiont, typically providing nourishment and shelter.
   * (http://semanticscience.org/resource/SIO_010415)
   */
  public static Resource host() {
    return _namespace_SIO("SIO_010415");
  }

  /**
   * A buffer is a dissolved chemical substance that resists change in pH upon addition of small amounts of acid or base.
   * (http://semanticscience.org/resource/SIO_010416)
   */
  public static Resource buffer() {
    return _namespace_SIO("SIO_010416");
  }

  /**
   * A solvent is a liquid substance that can dissolve other substances (solutes).
   * (http://semanticscience.org/resource/SIO_010417)
   */
  public static Resource solvent() {
    return _namespace_SIO("SIO_010417");
  }

  /**
   * a solute is a substance that becomes dissolved in a solvent.
   * (http://semanticscience.org/resource/SIO_010418)
   */
  public static Resource solute() {
    return _namespace_SIO("SIO_010418");
  }

  /**
   * An antigen is a chemical entity that can be bound by a major histocompatibility complex (MHC) and presented to a T-cell receptor.
   * (http://semanticscience.org/resource/SIO_010419)
   */
  public static Resource antigen() {
    return _namespace_SIO("SIO_010419");
  }

  public static Resource receptor() {
    return _namespace_SIO("SIO_010420");
  }

  public static Resource target() {
    return _namespace_SIO("SIO_010423");
  }

  /**
   * a centrifugation pellet is a solid substance that forms as a result of compaction by a centrifuge.
   * (http://semanticscience.org/resource/SIO_010424)
   */
  public static Resource centrifugation_pellet() {
    return _namespace_SIO("SIO_010424");
  }

  /**
   * a supernatent is a liquid substance that remains after centrifugation.
   * (http://semanticscience.org/resource/SIO_010425)
   */
  public static Resource supernatant() {
    return _namespace_SIO("SIO_010425");
  }

  /**
   * a centrifugation substance is a substance that is the target or product of centrifugation.
   * (http://semanticscience.org/resource/SIO_010426)
   */
  public static Resource centrifugation_substance() {
    return _namespace_SIO("SIO_010426");
  }

  /**
   * a solution component is a part of a solution.
   * (http://semanticscience.org/resource/SIO_010427)
   */
  public static Resource solution_component() {
    return _namespace_SIO("SIO_010427");
  }

  /**
   * an evaluation role is a processual role held by an entity during some evaluation
   * (http://semanticscience.org/resource/SIO_010428)
   */
  public static Resource evaluation_role() {
    return _namespace_SIO("SIO_010428");
  }

  /**
   * A placebo is a medically ineffectual treatment for a medical condition intended to deceive the recipient.
   * (http://semanticscience.org/resource/SIO_010429)
   */
  public static Resource placebo() {
    return _namespace_SIO("SIO_010429");
  }

  public static Resource test_role() {
    return _namespace_SIO("SIO_010430");
  }

  public static Resource control_role() {
    return _namespace_SIO("SIO_010431");
  }

  /**
   * a ligand is a molecule that is part of a complex by weakly interacting with another molecule
   * (http://semanticscience.org/resource/SIO_010432)
   */
  public static Resource ligand() {
    return _namespace_SIO("SIO_010432");
  }

  /**
   * a low barrier hydrogen bond is a shorter, stronger hydrogen bond that is formed between both heteroatoms.
   * (http://semanticscience.org/resource/SIO_010433)
   */
  public static Resource low_barrier_hydrogen_bond() {
    return _namespace_SIO("SIO_010433");
  }

  /**
   * a molecular activator is a molecular regulator that realizes its disposition to conformationally change a target molecule and increase its functionality.
   * (http://semanticscience.org/resource/SIO_010434)
   */
  public static Resource activator() {
    return _namespace_SIO("SIO_010434");
  }

  /**
   * a molecular inhibitor is a molecular regulator that realizes its disposition to conformationally change a target molecule and decrease its functionality.
   * (http://semanticscience.org/resource/SIO_010435)
   */
  public static Resource inhibitor() {
    return _namespace_SIO("SIO_010435");
  }

  /**
   * a molecular regulator is a molecule that regulates the function of another chemical entity.
   * (http://semanticscience.org/resource/SIO_010436)
   */
  public static Resource molecular_regulator() {
    return _namespace_SIO("SIO_010436");
  }

  public static Resource signal_transducer() {
    return _namespace_SIO("SIO_010437");
  }

  public static Resource signal() {
    return _namespace_SIO("SIO_010438");
  }

  public static Resource messenger() {
    return _namespace_SIO("SIO_010439");
  }

  public static Resource second_messenger() {
    return _namespace_SIO("SIO_010440");
  }

  /**
   * a submolecule is a mereological sum of covalently bonded atoms
   * (http://semanticscience.org/resource/SIO_010441)
   */
  public static Resource submolecule() {
    return _namespace_SIO("SIO_010441");
  }

  public static Resource charge_quality() {
    return _namespace_SIO("SIO_010442");
  }

  public static Resource intron() {
    return _namespace_SIO("SIO_010443");
  }

  /**
   * a gene component is a component of a gene, whether DNA or RNA
   * (http://semanticscience.org/resource/SIO_010444)
   */
  public static Resource gene_component() {
    return _namespace_SIO("SIO_010444");
  }

  public static Resource exon() {
    return _namespace_SIO("SIO_010445");
  }

  public static Resource promoter() {
    return _namespace_SIO("SIO_010446");
  }

  public static Resource start_codon() {
    return _namespace_SIO("SIO_010447");
  }

  public static Resource stop_codon() {
    return _namespace_SIO("SIO_010448");
  }

  public static Resource RNA_transcript() {
    return _namespace_SIO("SIO_010450");
  }

  public static Resource splice_site() {
    return _namespace_SIO("SIO_010451");
  }

  /**
   * a molecular pocket is a site on a molecule that appears as a depression into the structure.
   * (http://semanticscience.org/resource/SIO_010452)
   */
  public static Resource molecular_pocket() {
    return _namespace_SIO("SIO_010452");
  }

  /**
   * An acid is a molecular entity in solution capable of donating a hydron (Bronsted acid) or capable of forming a covalent bond with an electron pair (Lewis acid).
   * (http://semanticscience.org/resource/SIO_010453)
   */
  public static Resource acid() {
    return _namespace_SIO("SIO_010453");
  }

  /**
   * A base is a molecular entity dissolved in a solvent that is capable of accepting a proton (Bronsted base) or forming a covalent bond with a hydron (Lewis base) .
   * (http://semanticscience.org/resource/SIO_010454)
   */
  public static Resource base() {
    return _namespace_SIO("SIO_010454");
  }

  /**
   * An isomer is a molecule that is compositionally identical to another molecule as a result of a different atomic connectivity.
   * (http://semanticscience.org/resource/SIO_010455)
   */
  public static Resource isomer() {
    return _namespace_SIO("SIO_010455");
  }

  /**
   * An ion is an atom or molecule in which the total number of electrons is not equal to the total number of protons, giving it a net positive or negative electrical charge.
   * (http://semanticscience.org/resource/SIO_010456)
   */
  public static Resource ion() {
    return _namespace_SIO("SIO_010456");
  }

  /**
   * An anion is an atom or molecule with a net positive electrical charge.
   * (http://semanticscience.org/resource/SIO_010457)
   */
  public static Resource cation() {
    return _namespace_SIO("SIO_010457");
  }

  /**
   * An anion is an atom or molecule with a net negative electrical charge.
   * (http://semanticscience.org/resource/SIO_010458)
   */
  public static Resource anion() {
    return _namespace_SIO("SIO_010458");
  }

  /**
   * a polar solvent is a solvent that exhibits a polar quality.
   * (http://semanticscience.org/resource/SIO_010459)
   */
  public static Resource polar_solvent() {
    return _namespace_SIO("SIO_010459");
  }

  public static Resource nonpolar_solvent() {
    return _namespace_SIO("SIO_010460");
  }

  /**
   * the quality of having a positive charge
   * (http://semanticscience.org/resource/SIO_010461)
   */
  public static Resource positive_charge() {
    return _namespace_SIO("SIO_010461");
  }

  public static Resource heterogeneous_substance() {
    return _namespace_SIO("SIO_010462");
  }

  public static Resource homogeneous_substance() {
    return _namespace_SIO("SIO_010463");
  }

  /**
   * the quality of having a negative charge
   * (http://semanticscience.org/resource/SIO_010464)
   */
  public static Resource negative_charge() {
    return _namespace_SIO("SIO_010464");
  }

  /**
   * An antibody (also known as immunoglobulins, abbreviated Ig) are gamma globulin proteins that are used by the immune system to identify and neutralize foreign objects. They are typically made of two large heavy chains and two small light chains.
   * (http://semanticscience.org/resource/SIO_010465)
   */
  public static Resource antibody() {
    return _namespace_SIO("SIO_010465");
  }

  public static Resource alpha_helix() {
    return _namespace_SIO("SIO_010468");
  }

  public static Resource beta_strand() {
    return _namespace_SIO("SIO_010469");
  }

  public static Resource protein_part() {
    return _namespace_SIO("SIO_010471");
  }

  /**
   * an ionic interaction is a weak submolecular interaction between a charged submolecules.
   * (http://semanticscience.org/resource/SIO_010496)
   */
  public static Resource ionic_interaction() {
    return _namespace_SIO("SIO_010496");
  }

  /**
   * a protein complex is a molecular complex composed of at least two polypeptide chains.
   * (http://semanticscience.org/resource/SIO_010497)
   */
  public static Resource protein_complex() {
    return _namespace_SIO("SIO_010497");
  }

  public static Resource single_bond() {
    return _namespace_SIO("SIO_010498");
  }

  public static Resource double_bond() {
    return _namespace_SIO("SIO_010499");
  }

  public static Resource triple_bond() {
    return _namespace_SIO("SIO_010500");
  }

  public static Resource aromatic_bond() {
    return _namespace_SIO("SIO_010501");
  }

  public static Resource disulfide_bond() {
    return _namespace_SIO("SIO_010502");
  }

  /**
   * a dipole-dipole interaction is a weak submolecular interaction between strongly electronegative atoms.
   * (http://semanticscience.org/resource/SIO_010503)
   */
  public static Resource dipole_dipole_interaction() {
    return _namespace_SIO("SIO_010503");
  }

  /**
   * van der Waals" interaction is an a weak submolecular interaction between an instantaneous dipole and induced dipole.
   * (http://semanticscience.org/resource/SIO_010504)
   */
  public static Resource van_der_Waals_interaction() {
    return _namespace_SIO("SIO_010504");
  }

  public static Resource base_stack() {
    return _namespace_SIO("SIO_010505");
  }

  /**
   * a molecular complex is a chemical complex composed of weakly interacting molecular entities, and excludes bulk solvent.
   * (http://semanticscience.org/resource/SIO_010506)
   */
  public static Resource molecular_complex() {
    return _namespace_SIO("SIO_010506");
  }

  /**
   * an acid-base reaction is a chemical reaction between an acid and a base.
   * (http://semanticscience.org/resource/SIO_010507)
   */
  public static Resource acid_base_reaction() {
    return _namespace_SIO("SIO_010507");
  }

  /**
   * a catalyzed reaction is a chemical reaction that is facilitated by a catalyst.
   * (http://semanticscience.org/resource/SIO_010508)
   */
  public static Resource catalyzed_reaction() {
    return _namespace_SIO("SIO_010508");
  }

  /**
   * a redox reaction is a chemical reaction in which there is a net movement of electrons from one reactant to another.
   * (http://semanticscience.org/resource/SIO_010509)
   */
  public static Resource redox_reaction() {
    return _namespace_SIO("SIO_010509");
  }

  /**
   * An inorganic reaction is a chemical reaction that involves the transformation of inorganic molecules.
   * (http://semanticscience.org/resource/SIO_010510)
   */
  public static Resource inorganic_reaction() {
    return _namespace_SIO("SIO_010510");
  }

  /**
   * A decomposition reaction is an inorganic reaction in which molecule is fragmented into submolecules or atoms.
   * (http://semanticscience.org/resource/SIO_010511)
   */
  public static Resource decomposition_reaction() {
    return _namespace_SIO("SIO_010511");
  }

  /**
   * A displacement reaction is an inorganic reaction in which a elementary substance displaces and sets free a constituent atom from a molecule.
   * (http://semanticscience.org/resource/SIO_010512)
   */
  public static Resource displacement_reaction() {
    return _namespace_SIO("SIO_010512");
  }

  /**
   * A double displacement reaction is a displacement reaction in which two molecules swap ions, effectively displacing each other to form two new molecules.
   * (http://semanticscience.org/resource/SIO_010513)
   */
  public static Resource double_displacement_reaction() {
    return _namespace_SIO("SIO_010513");
  }

  /**
   * A single displacement reaction where one atom is transferred out of one molecule and into another.
   * (http://semanticscience.org/resource/SIO_010514)
   */
  public static Resource single_displacement_reaction() {
    return _namespace_SIO("SIO_010514");
  }

  /**
   * A synthesis reaction is an inorganic reaction in which two or more molecules are chemically bonded together to produce a single product.
   * (http://semanticscience.org/resource/SIO_010515)
   */
  public static Resource synthesis_reaction() {
    return _namespace_SIO("SIO_010515");
  }

  /**
   * An organic reaction is a chemical reaction involving at least one organic molecule.
   * (http://semanticscience.org/resource/SIO_010516)
   */
  public static Resource organic_reaction() {
    return _namespace_SIO("SIO_010516");
  }

  /**
   * An isomerization reaction is a chemical reaction in which a molecule is converted into its isomer.
   * (http://semanticscience.org/resource/SIO_010517)
   */
  public static Resource isomerization_reaction() {
    return _namespace_SIO("SIO_010517");
  }

  /**
   * An addition reaction is an organic reaction where two or more molecules combine to form a larger one. Addition reactions are limited to chemical compounds that have multiply-bonded atoms:
   *     * Molecules with carbon-carbon double bonds or triple bonds
   *     * Molecules with carbon - hetero double bonds like C=O or C=N
   * (http://semanticscience.org/resource/SIO_010518)
   */
  public static Resource addition_reaction() {
    return _namespace_SIO("SIO_010518");
  }

  public static Resource polar_addition_reaction() {
    return _namespace_SIO("SIO_010519");
  }

  public static Resource non_polar_addition_reaction() {
    return _namespace_SIO("SIO_010520");
  }

  /**
   * A free radical addition is a non-polar addition reaction involving free radicals.
   * (http://semanticscience.org/resource/SIO_010521)
   */
  public static Resource free_radical_addition() {
    return _namespace_SIO("SIO_010521");
  }

  /**
   * A nucleophilic addition reaction is an addition reaction where a pi bond is removed by the creation of two new covalent bonds by the addition from a nucleophile.
   * (http://semanticscience.org/resource/SIO_010522)
   */
  public static Resource nucleophilic_addition_reaction() {
    return _namespace_SIO("SIO_010522");
  }

  /**
   * an electrophilic addition reaction is a polar addition reaction where a pi bond is removed by the creation of two new covalent bonds.
   * (http://semanticscience.org/resource/SIO_010523)
   */
  public static Resource electrophilic_addition_reaction() {
    return _namespace_SIO("SIO_010523");
  }

  /**
   * a biochemical pathway specifies a series of biochemical reactions towards achieving some objective.
   * (http://semanticscience.org/resource/SIO_010525)
   */
  public static Resource biochemical_pathway() {
    return _namespace_SIO("SIO_010525");
  }

  /**
   * a chemical reaction pathway specifies is a series of chemical reactions towards producing some chemical product.
   * (http://semanticscience.org/resource/SIO_010526)
   */
  public static Resource chemical_reaction_pathway() {
    return _namespace_SIO("SIO_010526");
  }

  public static Resource chemical_synthesis_pathway() {
    return _namespace_SIO("SIO_010527");
  }

  public static Resource chemical_degradation_pathway() {
    return _namespace_SIO("SIO_010528");
  }

  public static Resource a_d_structure_model() {
    return _namespace_SIO("SIO_010530");
  }

  public static Resource sequence_profile() {
    return _namespace_SIO("SIO_010531");
  }

  /**
   * a metabolic pathway is a series of biochemical reactions that begins with one or more substrates and ends with one or more products.
   * (http://semanticscience.org/resource/SIO_010532)
   */
  public static Resource metabolic_pathway() {
    return _namespace_SIO("SIO_010532");
  }

  /**
   * a regulatory pathway is a series of biochemical reactions that lead to the increase or decrease of activity of participating molecular components.
   * (http://semanticscience.org/resource/SIO_010533)
   */
  public static Resource regulatory_pathway() {
    return _namespace_SIO("SIO_010533");
  }

  public static Resource medical_history() {
    return _namespace_SIO("SIO_010673");
  }

  /**
   * a binary compound is a mereological maximum sum of two kinds of weakly connected entities.
   * (http://semanticscience.org/resource/SIO_010674)
   */
  public static Resource binary_compound() {
    return _namespace_SIO("SIO_010674");
  }

  /**
   * A stereoisomer is an isomer in which the atomic connectivity is the same, but differs in its spatial arrangement of atoms.
   * (http://semanticscience.org/resource/SIO_010775)
   */
  public static Resource stereoisomer() {
    return _namespace_SIO("SIO_010775");
  }

  /**
   * A diastereomer is a stereoisomer that is not a mirror image of its isomer.
   * (http://semanticscience.org/resource/SIO_010776)
   */
  public static Resource diastereomer() {
    return _namespace_SIO("SIO_010776");
  }

  /**
   * An enantiomer is a stereoisomer that is a mirror image of its isomer.
   * (http://semanticscience.org/resource/SIO_010777)
   */
  public static Resource enantiomer() {
    return _namespace_SIO("SIO_010777");
  }

  /**
   * An optical isomer is a stereoisomer that rotates the plane of polarization of a beam of plane polarized light.
   * (http://semanticscience.org/resource/SIO_010778)
   */
  public static Resource optical_isomer() {
    return _namespace_SIO("SIO_010778");
  }

  /**
   * A structural isomer is an isomer in which the atoms are joined together in different ways.
   * (http://semanticscience.org/resource/SIO_010779)
   */
  public static Resource structural_isomer() {
    return _namespace_SIO("SIO_010779");
  }

  /**
   * a ring is a submolecule with a circular topology.
   * (http://semanticscience.org/resource/SIO_010780)
   */
  public static Resource ring() {
    return _namespace_SIO("SIO_010780");
  }

  /**
   * An aromatic ring is a ring in which the electrons are delocalized across all atoms in the ring.
   * (http://semanticscience.org/resource/SIO_010781)
   */
  public static Resource aromatic_ring() {
    return _namespace_SIO("SIO_010781");
  }

  /**
   * a heterocyclic ring is a ring containing a hetero atom.
   * (http://semanticscience.org/resource/SIO_010782)
   */
  public static Resource heterocyclic_ring() {
    return _namespace_SIO("SIO_010782");
  }

  /**
   * A homocyclic ring is a ring where the atoms are of a single type.
   * (http://semanticscience.org/resource/SIO_010783)
   */
  public static Resource homocyclic_ring() {
    return _namespace_SIO("SIO_010783");
  }

  /**
   * an ionic compound is a mereological maximal sum of weakly connected paired positive and negative ions.
   * (http://semanticscience.org/resource/SIO_010784)
   */
  public static Resource ionic_compound() {
    return _namespace_SIO("SIO_010784");
  }

  /**
   * an allotrope is a structural variant of a chemical element.
   * (http://semanticscience.org/resource/SIO_010785)
   */
  public static Resource allotrope() {
    return _namespace_SIO("SIO_010785");
  }

  public static Resource carbon_allotrope() {
    return _namespace_SIO("SIO_010786");
  }

  /**
   * Diamond is a carbon allotrope in which each carbon atom in diamond is covalently bonded to four other carbons in a tetrahedron. These tetrahedrons together form a 3-dimensional network of puckered six-membered rings of atoms.
   * (http://semanticscience.org/resource/SIO_010787)
   */
  public static Resource diamond() {
    return _namespace_SIO("SIO_010787");
  }

  /**
   * graphite is an allotrope of carbon which is a conductor, and is the most stable form of solid carbon.
   * (http://semanticscience.org/resource/SIO_010788)
   */
  public static Resource graphite() {
    return _namespace_SIO("SIO_010788");
  }

  /**
   * Fullerene is a carbon allotrope which take the form of a hollow sphere, ellipsoid, or tube.
   * (http://semanticscience.org/resource/SIO_010789)
   */
  public static Resource fullerene() {
    return _namespace_SIO("SIO_010789");
  }

  /**
   * aggregate of carbon nanorods is an allotrope of carbon considered to be the least compressible material known, as measured by its isothermal bulk modulus; aggregated diamond nanorods have a modulus of 491 gigapascals (GPa), while a conventional diamond has a modulus of 442 GPa. ADNRs are also 0.3% denser than regular diamond.
   * (http://semanticscience.org/resource/SIO_010790)
   */
  public static Resource aggregated_carbon_nanorods() {
    return _namespace_SIO("SIO_010790");
  }

  /**
   * Amorphous carbon is an allotrope of carbon that does not have any crystalline structure. As with all glassy materials, some short-range order can be observed, but there is no long-range pattern of atomic positions.
   * (http://semanticscience.org/resource/SIO_010791)
   */
  public static Resource amorphous_carbon() {
    return _namespace_SIO("SIO_010791");
  }

  /**
   * carbon nanofoam is an allotrope of carbon that consists of a low-density cluster-assembly of carbon atoms strung together in a loose three-dimensional web. Each cluster is about 6 nanometers wide and consists of about 4000 carbon atoms linked in graphite-like sheets that are given negative curvature by the inclusion of heptagons among the regular hexagonal pattern.
   * (http://semanticscience.org/resource/SIO_010792)
   */
  public static Resource carbon_nanofoam() {
    return _namespace_SIO("SIO_010792");
  }

  /**
   * chaoite is an allotrope of carbon that is slightly harder than graphite with a reflection colour of grey to white.
   * (http://semanticscience.org/resource/SIO_010793)
   */
  public static Resource chaoite() {
    return _namespace_SIO("SIO_010793");
  }

  /**
   * glassy carbon is an allotrope of carbon which is widely used as an electrode material in electrochemistry, as well as for high temperature crucibles and as a component of some prosthetic devices.
   * (http://semanticscience.org/resource/SIO_010794)
   */
  public static Resource glassy_carbon() {
    return _namespace_SIO("SIO_010794");
  }

  /**
   * ionsdaleite is a hexagonal allotrope of the carbon allotrope diamond.
   * (http://semanticscience.org/resource/SIO_010795)
   */
  public static Resource ionsdaleite() {
    return _namespace_SIO("SIO_010795");
  }

  public static Resource boron_atom() {
    return _namespace_SIO("SIO_011000");
  }

  public static Resource carbon_atom() {
    return _namespace_SIO("SIO_011001");
  }

  public static Resource hydrogen_atom() {
    return _namespace_SIO("SIO_011002");
  }

  public static Resource helium_atom() {
    return _namespace_SIO("SIO_011003");
  }

  public static Resource lithium_atom() {
    return _namespace_SIO("SIO_011004");
  }

  public static Resource beryllium_atom() {
    return _namespace_SIO("SIO_011005");
  }

  public static Resource nitrogen_atom() {
    return _namespace_SIO("SIO_011006");
  }

  public static Resource oxygen_atom() {
    return _namespace_SIO("SIO_011007");
  }

  public static Resource fluorine_atom() {
    return _namespace_SIO("SIO_011008");
  }

  public static Resource neon_atom() {
    return _namespace_SIO("SIO_011009");
  }

  public static Resource sodium_atom() {
    return _namespace_SIO("SIO_011010");
  }

  public static Resource magnesium_atom() {
    return _namespace_SIO("SIO_011011");
  }

  public static Resource aluminium_atom() {
    return _namespace_SIO("SIO_011012");
  }

  public static Resource silicon_atom() {
    return _namespace_SIO("SIO_011013");
  }

  public static Resource phosphorus_atom() {
    return _namespace_SIO("SIO_011014");
  }

  public static Resource sulfur_atom() {
    return _namespace_SIO("SIO_011015");
  }

  public static Resource chlorine_atom() {
    return _namespace_SIO("SIO_011016");
  }

  public static Resource argon_atom() {
    return _namespace_SIO("SIO_011017");
  }

  public static Resource potassium_atom() {
    return _namespace_SIO("SIO_011018");
  }

  public static Resource calcium_atom() {
    return _namespace_SIO("SIO_011019");
  }

  public static Resource scandium_atom() {
    return _namespace_SIO("SIO_011020");
  }

  public static Resource titanium_atom() {
    return _namespace_SIO("SIO_011021");
  }

  public static Resource vanadium_atom() {
    return _namespace_SIO("SIO_011022");
  }

  public static Resource chromium_atom() {
    return _namespace_SIO("SIO_011023");
  }

  public static Resource manganese_atom() {
    return _namespace_SIO("SIO_011024");
  }

  public static Resource iron_atom() {
    return _namespace_SIO("SIO_011025");
  }

  public static Resource cobalt_atom() {
    return _namespace_SIO("SIO_011026");
  }

  public static Resource nickel_atom() {
    return _namespace_SIO("SIO_011027");
  }

  public static Resource copper_atom() {
    return _namespace_SIO("SIO_011028");
  }

  public static Resource zinc_atom() {
    return _namespace_SIO("SIO_011029");
  }

  public static Resource gallium_atom() {
    return _namespace_SIO("SIO_011030");
  }

  public static Resource germanium_atom() {
    return _namespace_SIO("SIO_011031");
  }

  public static Resource arsenic_atom() {
    return _namespace_SIO("SIO_011032");
  }

  public static Resource selenium_atom() {
    return _namespace_SIO("SIO_011033");
  }

  public static Resource bromine_atom() {
    return _namespace_SIO("SIO_011034");
  }

  public static Resource krypton_atom() {
    return _namespace_SIO("SIO_011035");
  }

  public static Resource rubidium_atom() {
    return _namespace_SIO("SIO_011036");
  }

  public static Resource strontium_atom() {
    return _namespace_SIO("SIO_011037");
  }

  public static Resource yttrium_atom() {
    return _namespace_SIO("SIO_011038");
  }

  public static Resource zirconium_atom() {
    return _namespace_SIO("SIO_011039");
  }

  public static Resource niobium_atom() {
    return _namespace_SIO("SIO_011040");
  }

  public static Resource molybdemum_atom() {
    return _namespace_SIO("SIO_011041");
  }

  public static Resource technetium_atom() {
    return _namespace_SIO("SIO_011042");
  }

  public static Resource ruthenium_atom() {
    return _namespace_SIO("SIO_011043");
  }

  public static Resource rhodium_atom() {
    return _namespace_SIO("SIO_011044");
  }

  public static Resource palladium_atom() {
    return _namespace_SIO("SIO_011045");
  }

  public static Resource silver_atom() {
    return _namespace_SIO("SIO_011046");
  }

  public static Resource cadmium_atom() {
    return _namespace_SIO("SIO_011047");
  }

  public static Resource indium_atom() {
    return _namespace_SIO("SIO_011048");
  }

  public static Resource tin_atom() {
    return _namespace_SIO("SIO_011049");
  }

  public static Resource antimony_atom() {
    return _namespace_SIO("SIO_011050");
  }

  public static Resource tellurium_atom() {
    return _namespace_SIO("SIO_011051");
  }

  public static Resource iodine_atom() {
    return _namespace_SIO("SIO_011052");
  }

  public static Resource xenon_atom() {
    return _namespace_SIO("SIO_011053");
  }

  public static Resource caesium_atom() {
    return _namespace_SIO("SIO_011054");
  }

  public static Resource barium_atom() {
    return _namespace_SIO("SIO_011055");
  }

  public static Resource lanthanum_atom() {
    return _namespace_SIO("SIO_011056");
  }

  public static Resource hafnium_atom() {
    return _namespace_SIO("SIO_011057");
  }

  public static Resource tantalum_atom() {
    return _namespace_SIO("SIO_011058");
  }

  public static Resource tungsten_atom() {
    return _namespace_SIO("SIO_011059");
  }

  public static Resource rhenium_atom() {
    return _namespace_SIO("SIO_011060");
  }

  public static Resource osmium_atom() {
    return _namespace_SIO("SIO_011061");
  }

  public static Resource iridium_atom() {
    return _namespace_SIO("SIO_011062");
  }

  public static Resource platinum_atom() {
    return _namespace_SIO("SIO_011063");
  }

  public static Resource gold_atom() {
    return _namespace_SIO("SIO_011064");
  }

  public static Resource mercury_atom() {
    return _namespace_SIO("SIO_011065");
  }

  public static Resource thallium_atom() {
    return _namespace_SIO("SIO_011066");
  }

  public static Resource lead_atom() {
    return _namespace_SIO("SIO_011067");
  }

  public static Resource bismuth_atom() {
    return _namespace_SIO("SIO_011068");
  }

  public static Resource polonium_atom() {
    return _namespace_SIO("SIO_011069");
  }

  public static Resource astatine_atom() {
    return _namespace_SIO("SIO_011070");
  }

  public static Resource radon_atom() {
    return _namespace_SIO("SIO_011071");
  }

  public static Resource francium_atom() {
    return _namespace_SIO("SIO_011072");
  }

  public static Resource radium_atom() {
    return _namespace_SIO("SIO_011073");
  }

  public static Resource actinium_atom() {
    return _namespace_SIO("SIO_011074");
  }

  public static Resource rutherfordium_atom() {
    return _namespace_SIO("SIO_011075");
  }

  public static Resource dubnium_atom() {
    return _namespace_SIO("SIO_011076");
  }

  public static Resource seaborgium_atom() {
    return _namespace_SIO("SIO_011077");
  }

  public static Resource bohrium_atom() {
    return _namespace_SIO("SIO_011078");
  }

  public static Resource hassium_atom() {
    return _namespace_SIO("SIO_011079");
  }

  public static Resource meitnerium_atom() {
    return _namespace_SIO("SIO_011080");
  }

  public static Resource darmstadtium_atom() {
    return _namespace_SIO("SIO_011081");
  }

  public static Resource roentgenium_atom() {
    return _namespace_SIO("SIO_011082");
  }

  public static Resource copernicium_atom() {
    return _namespace_SIO("SIO_011083");
  }

  public static Resource unutrium_atom() {
    return _namespace_SIO("SIO_011084");
  }

  public static Resource ununquadium_atom() {
    return _namespace_SIO("SIO_011085");
  }

  public static Resource ununpentium_atom() {
    return _namespace_SIO("SIO_011086");
  }

  public static Resource ununhexium_atom() {
    return _namespace_SIO("SIO_011087");
  }

  public static Resource ununseptium_atom() {
    return _namespace_SIO("SIO_011088");
  }

  public static Resource ununoctium_atom() {
    return _namespace_SIO("SIO_011089");
  }

  public static Resource cerium_atom() {
    return _namespace_SIO("SIO_011090");
  }

  public static Resource praseodymium_atom() {
    return _namespace_SIO("SIO_011091");
  }

  public static Resource neodymium_atom() {
    return _namespace_SIO("SIO_011092");
  }

  public static Resource promethium_atom() {
    return _namespace_SIO("SIO_011093");
  }

  public static Resource samarium_atom() {
    return _namespace_SIO("SIO_011094");
  }

  public static Resource europium_atom() {
    return _namespace_SIO("SIO_011095");
  }

  public static Resource gadolinium_atom() {
    return _namespace_SIO("SIO_011096");
  }

  public static Resource terbium_atom() {
    return _namespace_SIO("SIO_011097");
  }

  public static Resource dysprosium_atom() {
    return _namespace_SIO("SIO_011098");
  }

  public static Resource holmium_atom() {
    return _namespace_SIO("SIO_011099");
  }

  public static Resource erbium_atom() {
    return _namespace_SIO("SIO_011100");
  }

  public static Resource thulium_atom() {
    return _namespace_SIO("SIO_011101");
  }

  public static Resource ytterbium_atom() {
    return _namespace_SIO("SIO_011102");
  }

  public static Resource lutetium_atom() {
    return _namespace_SIO("SIO_011103");
  }

  public static Resource thorium_atom() {
    return _namespace_SIO("SIO_011104");
  }

  public static Resource protactinium_atom() {
    return _namespace_SIO("SIO_011105");
  }

  public static Resource uranium_atom() {
    return _namespace_SIO("SIO_011106");
  }

  public static Resource neptunium_atom() {
    return _namespace_SIO("SIO_011107");
  }

  public static Resource plutonium_atom() {
    return _namespace_SIO("SIO_011108");
  }

  public static Resource americium_atom() {
    return _namespace_SIO("SIO_011109");
  }

  public static Resource curium_atom() {
    return _namespace_SIO("SIO_011110");
  }

  public static Resource berkelium_atom() {
    return _namespace_SIO("SIO_011111");
  }

  public static Resource californium_atom() {
    return _namespace_SIO("SIO_011112");
  }

  public static Resource einsteinium_atom() {
    return _namespace_SIO("SIO_011113");
  }

  public static Resource fermium_atom() {
    return _namespace_SIO("SIO_011114");
  }

  public static Resource mendelevium_atom() {
    return _namespace_SIO("SIO_011115");
  }

  public static Resource nobelium_atom() {
    return _namespace_SIO("SIO_011116");
  }

  public static Resource lawrencium_atom() {
    return _namespace_SIO("SIO_011117");
  }

  /**
   * a covalent chemical bond is a strong submolecular interaction between atoms.
   * (http://semanticscience.org/resource/SIO_011118)
   */
  public static Resource covalent_chemical_bond() {
    return _namespace_SIO("SIO_011118");
  }

  public static Resource biomolecular_structure_descriptor() {
    return _namespace_SIO("SIO_011119");
  }

  public static Resource molecular_structure_file() {
    return _namespace_SIO("SIO_011120");
  }

  public static Resource molecular_structure_descriptor() {
    return _namespace_SIO("SIO_011121");
  }

  public static Resource chemical_data() {
    return _namespace_SIO("SIO_011123");
  }

  /**
   * A molecule is the mereological maximal sum of a collection of covalently bonded atoms.
   * (http://semanticscience.org/resource/SIO_011125)
   */
  public static Resource molecule() {
    return _namespace_SIO("SIO_011125");
  }

  /**
   * A chemical substance is a chemical complex of weakly interacting molecular entities, and may include bulk solvent.
   * (http://semanticscience.org/resource/SIO_011126)
   */
  public static Resource chemical_substance() {
    return _namespace_SIO("SIO_011126");
  }

  public static Resource PDB_file() {
    return _namespace_SIO("SIO_011130");
  }

  public static Resource collection_of_3d_molecular_structure_models() {
    return _namespace_SIO("SIO_011131");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000020"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000028"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000029"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000053"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000054"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000059"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000060"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000061"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000062"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000063"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000064"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000066"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000068"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000093"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000095"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000096"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000128"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000132"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000139"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000145"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000202"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000204"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000205"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000206"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000207"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000208"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000209"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000210"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000211"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000212"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000213"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000214"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000215"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000216"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000217"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000218"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000219"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000221"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000222"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000223"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000224"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000225"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000226"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000227"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000228"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000229"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000230"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000231"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000232"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000233"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000234"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000235"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000236"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000240"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000241"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000242"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000243"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000244"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000245"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000246"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000247"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000248"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000249"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000250"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000251"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000252"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000253"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000254"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000255"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000272"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000273"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000274"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000277"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000278"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000283"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000286"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000288"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000291"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000292"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000293"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000294"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000310"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000311"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000312"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000313"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000323"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000324"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000325"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000332"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000334"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000335"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000338"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000339"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000341"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000352"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000355"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000356"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000362"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000363"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000364"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000365"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000369"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000420"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000421"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000422"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000424"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000426"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000427"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000477"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000482"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000484"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000490"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000491"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000495"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000496"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000497"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000552"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000553"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000557"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000558"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000563"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000586"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000628"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000629"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000630"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000631"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000632"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000633"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000634"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000635"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000636"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000641"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000642"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000643"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000644"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000646"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000652"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000655"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000656"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000657"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000658"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000668"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000671"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000672"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000673"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000674"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000679"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000680"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000681"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000682"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000684"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000687"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000697"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000699"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000709"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000710"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000733"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000734"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000735"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000736"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000738"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000749"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000772"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000773"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000774"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000775"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000793"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000892"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000900"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000901"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000905"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000970"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000971"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000972"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000973"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000974"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000975"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010078"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010079"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010080"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010081"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010082"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010083"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010302"))) {
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
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000300"))) {
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
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000000"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000004"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000005"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000006"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000009"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000010"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000012"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000013"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000014"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000015"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000016"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000017"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000019"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000022"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000027"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000030"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000031"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000032"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000033"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000034"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000035"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000036"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000037"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000038"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000039"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000040"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000041"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000042"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000043"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000044"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000045"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000046"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000047"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000048"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000049"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000051"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000052"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000055"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000056"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000057"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000067"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000069"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000070"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000071"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000072"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000073"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000074"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000076"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000077"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000078"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000079"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000080"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000081"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000082"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000085"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000088"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000089"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000090"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000091"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000092"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000094"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000098"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000099"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000100"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000101"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000102"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000103"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000104"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000105"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000106"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000107"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000108"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000109"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000110"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000112"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000113"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000114"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000115"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000117"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000118"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000119"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000120"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000121"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000122"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000123"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000124"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000125"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000126"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000127"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000129"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000130"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000131"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000133"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000135"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000136"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000137"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000138"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000140"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000141"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000142"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000143"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000144"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000146"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000147"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000150"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000151"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000152"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000153"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000154"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000155"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000156"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000157"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000158"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000159"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000160"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000161"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000162"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000163"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000164"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000165"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000166"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000167"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000168"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000169"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000170"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000171"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000172"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000173"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000174"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000175"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000176"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000177"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000178"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000179"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000180"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000181"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000182"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000183"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000184"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000185"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000186"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000188"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000189"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000190"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000191"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000192"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000193"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000194"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000195"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000196"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000197"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000198"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000199"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000200"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000201"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000220"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000237"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000238"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000239"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000257"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000258"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000259"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000261"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000262"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000263"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000264"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000265"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000266"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000267"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000268"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000269"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000270"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000275"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000276"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000279"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000280"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000281"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000282"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000284"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000285"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000287"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000289"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000290"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000295"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000296"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000297"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000298"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000299"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000301"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000302"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000304"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000305"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000306"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000307"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000308"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000309"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000314"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000316"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000317"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000318"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000319"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000320"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000321"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000326"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000327"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000328"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000329"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000330"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000331"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000333"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000337"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000340"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000342"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000344"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000345"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000346"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000347"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000348"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000349"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000350"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000351"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000353"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000354"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000357"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000358"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000359"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000360"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000366"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000367"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000368"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000370"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000371"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000372"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000373"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000374"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000375"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000376"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000377"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000378"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000379"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000380"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000381"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000382"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000383"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000384"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000386"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000387"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000388"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000389"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000390"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000391"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000392"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000393"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000394"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000395"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000396"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000397"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000398"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000399"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000400"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000401"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000402"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000403"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000404"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000405"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000406"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000407"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000408"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000409"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000410"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000411"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000412"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000413"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000414"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000418"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000419"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000423"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000428"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000429"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000430"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000431"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000432"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000433"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000434"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000435"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000436"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000437"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000438"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000439"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000440"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000441"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000442"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000443"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000444"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000445"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000446"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000447"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000448"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000449"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000450"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000451"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000452"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000453"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000454"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000455"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000456"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000457"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000459"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000460"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000461"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000462"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000463"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000464"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000465"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000466"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000467"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000468"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000469"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000470"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000471"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000472"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000473"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000474"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000476"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000478"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000479"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000480"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000481"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000483"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000485"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000486"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000487"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000488"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000489"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000492"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000493"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000498"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000499"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000500"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000501"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000502"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000503"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000504"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000505"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000506"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000507"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000508"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000509"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000510"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000511"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000512"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000513"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000514"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000515"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000516"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000517"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000518"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000519"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000520"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000521"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000522"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000523"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000524"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000525"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000526"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000527"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000528"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000529"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000530"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000531"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000532"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000533"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000534"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000535"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000536"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000537"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000538"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000539"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000540"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000541"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000542"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000543"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000544"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000545"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000546"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000547"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000549"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000550"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000551"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000554"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000555"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000556"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000559"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000561"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000562"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000564"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000565"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000566"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000567"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000568"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000569"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000570"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000571"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000572"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000573"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000574"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000575"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000576"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000577"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000578"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000579"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000580"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000581"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000582"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000583"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000585"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000587"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000588"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000589"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000590"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000591"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000592"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000593"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000594"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000595"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000596"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000597"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000598"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000600"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000602"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000605"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000608"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000609"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000610"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000611"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000612"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000613"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000614"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000616"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000617"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000618"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000619"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000621"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000622"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000623"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000624"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000625"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000626"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000627"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000638"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000639"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000640"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000647"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000648"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000649"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000650"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000651"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000653"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000654"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000660"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000661"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000662"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000663"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000664"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000665"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000666"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000667"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000669"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000670"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000675"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000676"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000677"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000678"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000683"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000686"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000688"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000689"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000690"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000691"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000692"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000693"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000694"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000695"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000696"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000698"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000700"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000701"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000702"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000703"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000704"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000705"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000706"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000707"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000708"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000711"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000712"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000713"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000714"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000715"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000716"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000717"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000719"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000720"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000721"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000722"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000723"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000724"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000725"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000726"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000727"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000728"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000729"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000730"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000731"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000732"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000739"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000740"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000741"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000742"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000743"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000744"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000745"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000746"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000747"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000748"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000750"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000751"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000752"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000753"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000754"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000755"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000756"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000757"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000758"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000759"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000760"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000761"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000762"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000763"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000764"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000765"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000766"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000767"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000768"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000769"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000770"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000771"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000776"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000777"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000778"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000779"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000780"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000783"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000784"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000785"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000786"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000787"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000788"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000789"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000790"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000791"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000792"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000795"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000796"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000797"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000798"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000799"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000800"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000801"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000802"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000803"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000804"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000805"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000806"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000807"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000808"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000809"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000810"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000811"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000812"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000813"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000814"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000815"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000816"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000817"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000818"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000819"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000820"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000821"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000822"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000823"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000824"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000825"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000826"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000827"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000829"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000830"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000833"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000834"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000835"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000836"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000837"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000838"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000839"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000840"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000841"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000842"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000843"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000844"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000845"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000846"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000847"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000848"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000849"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000850"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000851"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000852"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000853"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000854"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000855"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000856"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000857"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000858"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000859"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000860"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000861"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000862"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000864"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000865"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000866"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000867"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000868"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000869"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000870"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000871"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000872"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000873"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000875"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000876"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000877"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000878"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000879"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000880"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000881"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000882"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000883"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000884"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000885"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000886"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000887"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000888"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000889"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000890"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000891"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000893"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000894"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000895"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000896"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000897"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000898"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000899"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000902"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000903"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000906"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000907"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000908"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000909"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000910"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000911"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000912"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000913"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000914"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000915"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000916"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000917"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000918"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000919"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000920"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000921"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000922"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000923"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000924"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000926"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000927"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000928"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000929"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000930"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000931"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000932"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000933"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000934"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000935"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000936"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000937"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000938"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000939"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000940"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000941"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000942"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000943"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000944"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000945"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000946"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000947"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000948"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000949"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000950"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000951"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000952"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000953"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000954"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000955"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000956"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000957"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000960"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000961"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000962"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000963"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000964"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000965"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000966"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000967"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000968"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000969"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000976"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000977"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000978"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000979"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000980"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000981"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000982"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000983"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000984"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000985"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000986"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000987"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000988"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000989"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000991"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000992"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000993"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000994"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000995"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000996"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000997"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000998"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000999"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001000"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001001"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001002"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001003"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001004"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001005"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001006"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001007"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001008"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001009"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001010"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001011"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001012"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001013"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001014"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001015"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001016"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001017"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001018"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001019"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001020"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001021"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001022"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001023"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001024"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001025"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001026"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001027"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001028"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001029"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001030"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001031"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001032"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001033"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001034"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001035"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001036"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001037"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001038"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001039"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001040"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001041"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001042"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001043"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001044"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001045"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001046"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001047"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001048"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001049"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001050"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001051"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001052"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001053"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001054"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001055"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001056"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001057"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001058"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001059"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001060"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001061"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001062"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001063"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001064"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001065"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001066"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001067"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001068"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001069"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001070"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001071"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001072"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001073"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001074"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001075"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001076"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001077"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001078"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001079"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001080"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001081"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001082"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001083"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010000"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010001"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010002"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010003"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010004"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010007"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010008"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010009"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010010"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010011"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010013"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010014"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010015"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010016"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010017"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010018"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010019"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010020"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010022"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010023"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010024"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010025"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010026"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010027"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010028"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010029"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010030"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010031"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010032"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010033"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010034"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010035"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010036"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010037"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010038"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010039"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010040"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010041"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010042"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010043"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010045"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010047"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010048"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010049"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010050"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010051"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010052"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010053"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010054"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010055"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010056"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010057"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010058"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010059"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010060"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010061"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010064"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010065"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010066"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010067"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010068"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010070"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010071"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010072"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010073"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010074"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010075"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010076"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010077"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010084"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010085"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010086"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010087"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010088"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010089"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010090"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010091"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010092"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010093"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010094"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010095"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010096"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010097"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010098"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010099"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010100"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010101"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010277"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010278"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010283"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010284"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010285"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010286"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010287"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010288"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010289"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010295"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010296"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010298"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010299"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010300"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010301"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010307"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010308"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010309"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010310"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010334"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010335"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010336"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010337"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010338"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010340"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010341"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010342"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010343"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010344"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010345"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010346"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010347"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010349"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010351"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010353"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010354"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010355"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010358"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010359"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010360"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010362"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010363"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010364"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010365"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010366"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010367"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010368"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010369"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010370"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010371"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010372"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010373"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010374"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010375"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010376"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010377"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010378"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010379"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010383"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010410"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010411"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010412"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010414"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010415"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010416"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010417"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010418"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010419"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010420"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010423"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010424"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010425"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010426"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010428"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010429"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010430"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010431"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010432"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010433"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010434"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010435"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010436"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010437"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010438"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010439"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010440"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010441"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010442"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010443"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010445"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010446"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010447"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010448"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010450"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010451"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010452"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010453"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010454"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010455"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010456"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010457"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010458"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010459"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010460"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010461"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010462"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010463"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010464"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010465"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010468"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010469"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010471"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010496"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010497"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010498"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010499"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010500"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010501"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010502"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010503"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010504"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010505"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010506"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010507"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010508"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010509"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010510"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010511"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010512"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010513"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010514"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010515"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010516"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010517"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010518"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010519"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010520"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010521"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010522"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010523"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010525"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010526"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010527"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010528"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010530"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010531"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010532"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010533"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010673"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010674"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010775"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010776"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010777"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010778"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010779"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010780"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010781"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010782"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010783"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010784"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010785"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010787"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010788"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010789"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010790"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010791"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010792"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010793"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010794"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010795"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011000"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011001"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011002"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011003"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011004"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011005"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011006"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011007"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011008"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011009"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011010"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011011"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011012"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011013"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011014"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011015"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011016"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011017"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011018"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011019"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011020"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011021"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011022"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011023"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011024"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011025"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011026"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011027"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011028"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011029"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011030"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011031"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011032"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011033"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011034"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011035"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011036"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011037"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011038"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011039"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011040"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011041"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011042"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011043"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011044"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011045"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011046"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011047"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011048"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011049"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011050"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011051"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011052"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011053"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011054"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011055"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011056"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011057"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011058"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011059"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011060"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011061"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011062"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011063"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011064"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011065"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011066"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011067"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011068"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011069"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011070"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011071"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011072"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011073"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011074"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011075"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011076"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011077"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011078"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011079"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011080"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011081"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011082"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011083"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011084"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011085"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011086"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011087"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011088"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011089"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011090"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011091"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011092"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011093"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011094"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011095"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011096"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011097"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011098"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011099"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011100"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011101"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011102"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011103"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011104"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011105"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011106"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011107"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011108"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011109"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011110"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011111"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011112"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011113"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011114"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011115"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011116"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011117"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011118"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011119"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011120"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011121"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011123"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011125"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011126"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011130"))) {
      return true;
    }
    if (uri.equals(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011131"))) {
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
      if (__parent_properties.get(uri).equals(parent)) {
        return true;
      }
      return hasParent((Resource)__parent_properties.get(uri), parent);
    }
    return false;
  }

  private static Resource _namespace_SIO(String accession) {
    if (isClass(ResourceFactory.createResource("http://semanticscience.org/resource/" + accession))) {
      return ResourceFactory.createResource("http://semanticscience.org/resource/" + accession);
    } else {
      return ResourceFactory.createProperty("http://semanticscience.org/resource/" + accession);
    }
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();

    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011096"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010338"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011125"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001035"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001034"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000644"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000223"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011097"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001036"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000513"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000512"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000777"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000692"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011098"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010471"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010071"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001037"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000514"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000513"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000646"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000643"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000778"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000378"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011099"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010340"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000376"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001038"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001034"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000515"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000513"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001039"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000516"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000511"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000648"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000510"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000780"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000517"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000505"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000649"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000999"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000518"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000517"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010344"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011125"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001040"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000650"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000519"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000518"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000651"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000079"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000783"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000370"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001042"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000091"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000520"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000505"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000652"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000784"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010029"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001043"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000091"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000785"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000136"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010347"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001044"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010378"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000786"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001045"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000100"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010349"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010340"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001046"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001045"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000655"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000294"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000787"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000101"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001047"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001045"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000656"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000655"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000788"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000056"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000102"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000101"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001048"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000994"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000525"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000534"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000657"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000352"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000789"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000788"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000103"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010351"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010340"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000526"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000534"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000658"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000657"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000104"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000527"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000535"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000790"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000038"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010353"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000492"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000528"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000527"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000791"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000943"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010354"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010347"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000529"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000527"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000106"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000660"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000019"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000792"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000953"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010355"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010347"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000107"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000661"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000793"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000687"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000108"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000530"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000527"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000662"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000257"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001053"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000683"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000109"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000531"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000535"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000663"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000400"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000072"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000532"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000507"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000664"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000796"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000880"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010358"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010360"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000401"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000072"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000533"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000540"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000665"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000797"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000879"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010359"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010360"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000402"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000072"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000534"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000511"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000666"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010360"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000376"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001058"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001072"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000113"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000483"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000403"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000535"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000511"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000667"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000649"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000799"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000889"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001059"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000969"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000404"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000406"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000536"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000395"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000668"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000631"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010362"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010423"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000405"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000406"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000537"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000055"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000669"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000418"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000406"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000498"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000538"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000537"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010496"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010364"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000692"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001060"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000963"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000670"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000418"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000407"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000536"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000539"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000511"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010365"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010366"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001061"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000117"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000671"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000408"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010498"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011118"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010366"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010364"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001062"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001061"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000118"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000540"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000516"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000672"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000409"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000014"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010499"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011118"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010367"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010366"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001063"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000119"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000541"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000540"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000673"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000671"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001064"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000410"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000542"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000674"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000672"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010368"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000692"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001065"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000411"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000120"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010369"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010364"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000412"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000544"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000372"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000676"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000016"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000121"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000162"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001067"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000976"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000122"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000342"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010370"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010369"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001068"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000403"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000413"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000414"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000677"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000016"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000123"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000342"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010371"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010369"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001069"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000403"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000414"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000370"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000678"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000016"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000124"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000342"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010372"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010374"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000415"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000413"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000547"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000376"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000679"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000054"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000125"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000342"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010373"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010374"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010374"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010364"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001070"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000367"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000391"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000549"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010355"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000680"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000679"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001071"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000943"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000418"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000391"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000127"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000094"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000681"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000679"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001072"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000953"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000419"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000080"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000128"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000061"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000550"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010354"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000682"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000029"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010377"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010000"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000129"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000551"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010347"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000683"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010378"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010000"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001074"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001018"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000420"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000552"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000230"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000684"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000029"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001075"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000732"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000130"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000421"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000553"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000231"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010379"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010378"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001076"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000994"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000131"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000130"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000422"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000283"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000554"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000307"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000686"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000285"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001077"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000258"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000132"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000423"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000555"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000307"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000687"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001078"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001018"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000133"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000275"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001079"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000424"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000283"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000556"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010071"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000688"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000285"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000135"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000136"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000557"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000212"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000689"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000692"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010383"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000619"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000426"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000558"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010302"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001080"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000616"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000137"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000326"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000690"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000427"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000424"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000691"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000690"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000428"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000138"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000289"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000429"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001083"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000418"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000139"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000132"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000561"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011121"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000693"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000012"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000430"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000562"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000576"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000140"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000101"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000009"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000015"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000431"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000563"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000628"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000141"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000316"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000432"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000564"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000573"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000142"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000141"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000301"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000082"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000433"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000697"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000709"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000143"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000141"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000302"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000434"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000566"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000368"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000698"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000144"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000920"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000012"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000145"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000435"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000567"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000569"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000699"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000013"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000056"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000304"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000568"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000569"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000147"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000133"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000305"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000613"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000569"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000368"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000306"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000438"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000790"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000016"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000340"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000651"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010000"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000570"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000006"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000307"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000439"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000056"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010001"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000571"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000564"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000308"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000017"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000112"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000572"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000564"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000309"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010003"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000573"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000570"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000150"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000019"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000370"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010004"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000574"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000570"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000151"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000310"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000093"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000442"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000020"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000210"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000152"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000311"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000232"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000443"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010020"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000576"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010283"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000153"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000312"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000229"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000444"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000443"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000577"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010284"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000154"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000313"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000310"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000445"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000443"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000155"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000578"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010284"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000156"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000106"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000446"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000443"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000579"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000578"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000157"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000106"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000447"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000158"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000295"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000316"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000159"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000580"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000578"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000317"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000449"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000448"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010011"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010072"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000581"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000574"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000318"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000013"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000028"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000145"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000319"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000013"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000160"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000162"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000029"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000096"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010278"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000476"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010014"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011119"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000161"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000320"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000317"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000452"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000451"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000162"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000295"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000321"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000320"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000453"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000451"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000585"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000031"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000163"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000162"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000454"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000451"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000586"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000644"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000032"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000417"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000164"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000323"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000128"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000455"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000450"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000587"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000588"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000165"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000324"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000202"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000456"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000455"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000034"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000166"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000165"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010019"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000472"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000035"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000167"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000165"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000325"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000457"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000455"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000589"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000593"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000036"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000168"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000165"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000326"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000275"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000450"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010284"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000576"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000169"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000590"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000559"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000327"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000320"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000459"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000038"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000037"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010022"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011119"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000460"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000329"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000320"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010287"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000609"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010023"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011119"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000039"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000038"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000461"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000170"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010024"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011119"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000330"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000320"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000462"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000461"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000171"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000651"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000331"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000129"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000463"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000461"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000040"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000790"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000172"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000328"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010026"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010028"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000200"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000332"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000563"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000464"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000150"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000596"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000956"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000041"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000038"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000173"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000287"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000201"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000597"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000598"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000042"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000038"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000174"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000171"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000202"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000145"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000334"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000652"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000466"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000742"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000598"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000596"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000043"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000039"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000175"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000185"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010028"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010019"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000335"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000652"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000467"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000743"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000044"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000037"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000176"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000171"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010029"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000045"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000177"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000944"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000468"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000448"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000046"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000178"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000204"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010030"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010072"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000047"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000179"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000651"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000205"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000212"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010295"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010287"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010031"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000732"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000338"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000563"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000048"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000037"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000206"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000772"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010296"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010287"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010032"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000729"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000339"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000557"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000049"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000048"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000470"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000185"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000207"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000772"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010033"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000180"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000179"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000471"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000185"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000208"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000773"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010298"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010019"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010034"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010496"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000181"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000472"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000069"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000209"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000773"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010035"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010335"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000182"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000341"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000051"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000183"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000210"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000628"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000184"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000183"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000211"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000053"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000028"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000185"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000179"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000212"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000344"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000639"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010038"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011125"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000054"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000053"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000186"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000653"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000213"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000345"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000378"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000477"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000422"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010039"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010411"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000055"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000214"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000425"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000346"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000351"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000478"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000479"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000188"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010040"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010049"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000900"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000057"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000056"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000189"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000215"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000347"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000374"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000479"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000721"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010041"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010049"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000901"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000216"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000348"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000347"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010042"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010335"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000902"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000059"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000480"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000478"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000217"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000223"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000349"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000190"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000903"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000458"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000481"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000478"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000218"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000224"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000191"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000080"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000350"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000482"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000283"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000219"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010045"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000192"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000905"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000291"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000351"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000060"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000205"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010462"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000193"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000906"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000220"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000238"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000352"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000243"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000484"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000482"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000061"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010047"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010020"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000194"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000907"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000221"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000353"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000639"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000485"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010375"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000062"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010048"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010029"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000908"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000934"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000222"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000354"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000112"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000486"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010375"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000063"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000062"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000195"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000909"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000447"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000223"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000355"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000132"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000487"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010375"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000064"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000219"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000196"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010049"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000019"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000224"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000356"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000062"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000488"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010375"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000197"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000225"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000235"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000357"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010019"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000489"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010376"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000066"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000253"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000198"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010050"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010040"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000910"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000907"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000199"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000111"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010051"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000226"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000236"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000358"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000825"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000911"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000068"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000061"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011100"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010052"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010029"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000227"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000643"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000359"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000337"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000912"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000490"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000482"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011101"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010053"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010028"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000228"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000644"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000913"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000912"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000491"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000482"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011102"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010054"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000229"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000132"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000914"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000912"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000492"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011103"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000493"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000113"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011104"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010056"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000071"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000070"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000230"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000132"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000362"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000701"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010057"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000072"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000071"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000231"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000062"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000363"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000495"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000272"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011105"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010058"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010057"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000073"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000071"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000232"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000062"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000364"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000253"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000496"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000495"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011106"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010059"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010057"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000074"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000052"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000233"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000365"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000219"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000497"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000272"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011107"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000015"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000234"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000366"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000498"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000485"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011108"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000076"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000091"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000235"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000586"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000367"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000499"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000536"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011109"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010060"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010053"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000920"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000367"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000077"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000116"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000236"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000646"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000368"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010061"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010028"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000921"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000367"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011110"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000922"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000079"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000237"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000179"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000369"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000273"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011111"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000923"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000898"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000238"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011112"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010064"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000924"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000612"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000239"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000238"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011113"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010065"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000472"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000080"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000612"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000371"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000408"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011114"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010066"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010065"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000081"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000080"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000926"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000957"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000240"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000372"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011115"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010067"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010066"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000082"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000081"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000927"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000957"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000241"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000652"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000373"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000346"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010068"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010066"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000928"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000956"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000242"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000652"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000374"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011116"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000929"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000940"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000243"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000322"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000375"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000351"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011117"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000085"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000113"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000244"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000352"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000376"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000245"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000294"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000377"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000378"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010070"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000087"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000246"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000245"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000378"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000930"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000247"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000244"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000379"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001055"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000931"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000800"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000799"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000932"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000911"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000248"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000352"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000801"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000800"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000933"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010074"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010471"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000380"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000392"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000249"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000294"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000802"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000800"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000934"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000083"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011123"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000472"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010075"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010335"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000381"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000380"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000803"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000880"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000935"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000940"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010076"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010038"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000250"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000248"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000382"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000349"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000804"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000880"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000936"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000937"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010077"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010338"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000383"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000351"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000805"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010442"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000937"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000251"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000249"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011126"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000384"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000374"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010078"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000338"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000093"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000068"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000806"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010442"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000938"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000937"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000252"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000212"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010079"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000339"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000094"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000807"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000809"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000939"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000937"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000253"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010500"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011118"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000386"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000095"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000808"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000809"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000254"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010501"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011118"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000387"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000385"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000940"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000096"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000093"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000809"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000805"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000255"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010502"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010498"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000388"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010080"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000602"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010503"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000389"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000349"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010081"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010079"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000941"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000969"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000098"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011130"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011120"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010504"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010082"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010078"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000810"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000805"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000942"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000099"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000097"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010505"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010083"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010079"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000943"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000788"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011000"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000812"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000944"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000390"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011001"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010507"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010345"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010085"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000813"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000815"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000945"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000931"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011002"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010086"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010085"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000814"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000946"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000392"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011003"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010087"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010338"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000815"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000949"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000947"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000904"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000261"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000393"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000498"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011004"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010088"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000542"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000816"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000847"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000948"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000945"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000262"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011005"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010510"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010345"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010089"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010088"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000817"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000949"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000263"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000259"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000395"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000818"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000264"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000259"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000396"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000602"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011006"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010511"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010510"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000950"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000819"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000397"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000494"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011007"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010512"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010510"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010090"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010088"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000951"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000845"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011008"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010513"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010512"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010091"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010088"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000399"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000498"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011009"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010514"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010512"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000952"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000144"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000268"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000436"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000820"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010515"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010510"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000953"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000788"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000821"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011010"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010516"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010345"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010094"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000542"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000954"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010058"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000822"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000840"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011011"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010517"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010345"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000955"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000414"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000823"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000825"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011012"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010518"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010516"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000956"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010462"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000824"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011013"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010519"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010518"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000957"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000956"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000825"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000848"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011014"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000272"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000736"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000826"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011015"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010520"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010518"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010099"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010450"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000005"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000273"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000053"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000827"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011016"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010521"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010520"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000274"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000497"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000844"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000960"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000829"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000837"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011017"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010522"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010519"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000276"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000961"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011018"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010523"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010519"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000277"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000631"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000830"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000962"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011019"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000278"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000252"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010525"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010526"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000276"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000963"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011020"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000700"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000343"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000276"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000964"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001043"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011021"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010527"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010526"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000833"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000965"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000436"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011022"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010528"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010526"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000834"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000966"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000965"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000280"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000238"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011023"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000835"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000967"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000965"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000281"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000238"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011024"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000704"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000678"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000836"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000282"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000280"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011025"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010530"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010023"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000705"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000837"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000949"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000969"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000593"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000283"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000272"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011026"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010531"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010065"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000706"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000676"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000838"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000814"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000284"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011027"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010532"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010525"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000970"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000975"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000839"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000285"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000012"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000971"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000974"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000286"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000497"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011028"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010533"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010525"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000840"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000972"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000974"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000709"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000287"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000009"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011029"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000841"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000973"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000975"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000288"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011030"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000710"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000709"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000842"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000974"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000053"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011031"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000711"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000706"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000843"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000975"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000093"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011032"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000712"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000706"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000844"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000290"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000285"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011033"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000713"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000712"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000845"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000977"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000291"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000230"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011034"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010775"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010455"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000714"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000712"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000846"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000978"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000292"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000231"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011035"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010776"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010775"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000715"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000712"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000847"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000276"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000979"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000293"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000203"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011036"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010777"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010775"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000716"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000498"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000848"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000294"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000243"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011037"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010778"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010775"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000980"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000104"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000717"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000712"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000849"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000834"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011038"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010779"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010455"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010411"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010462"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000981"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000104"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000982"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000104"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000297"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000612"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000850"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000840"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011039"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010412"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001050"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000851"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000828"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010781"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010780"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000984"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010046"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000852"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011040"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010782"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010780"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010414"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010000"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011041"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010783"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010780"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010415"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010000"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000985"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010035"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000721"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000678"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000853"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000825"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011042"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010416"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000986"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010035"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000722"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000725"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000854"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011043"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010785"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010037"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010417"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000723"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000724"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000855"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000837"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011044"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010418"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000988"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010335"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000724"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000353"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000856"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000825"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011045"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010419"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011125"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000989"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000030"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000725"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000696"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000857"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011046"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010787"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000726"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000706"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000858"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000840"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011047"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010788"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010420"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010437"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000727"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000726"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000859"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000864"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011048"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010789"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000728"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000730"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011049"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000992"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000959"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000860"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000410"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010790"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000861"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000873"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010791"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000994"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000747"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000730"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000115"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000862"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000873"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011050"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010792"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010424"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010426"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000995"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000731"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000115"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011051"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010793"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010425"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010426"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011052"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010794"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010426"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011126"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000996"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000963"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000600"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000732"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000728"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000864"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000822"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011053"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010795"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010786"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011126"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000997"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000733"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000865"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011054"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010428"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000881"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000602"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000015"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000734"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000866"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011055"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010429"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010462"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000735"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000867"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000832"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011056"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000736"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000868"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000863"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011057"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010430"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010428"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000605"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000650"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000736"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000869"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000845"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011058"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010431"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010428"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000738"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011059"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000870"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000831"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010433"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010033"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000608"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000506"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000871"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000829"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000609"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000589"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000740"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000608"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000872"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000870"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011060"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010434"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010436"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010302"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000272"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000741"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000465"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000873"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000949"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011061"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010435"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010436"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000610"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000589"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000742"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000741"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011062"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011063"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010673"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010298"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010437"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011125"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001002"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001024"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000611"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000610"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000743"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000741"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000875"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000711"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011064"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010438"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010437"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001003"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000876"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000711"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011065"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010439"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010437"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010307"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010345"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000613"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000788"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000877"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000876"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011066"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010308"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010013"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000878"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000876"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011067"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010440"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010439"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010309"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010308"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000879"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000889"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011068"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011069"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010442"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010310"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010308"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000880"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000889"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000749"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000737"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001008"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000881"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000677"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001009"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000750"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000602"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000882"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000888"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000619"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000012"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011070"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000751"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000555"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000883"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000881"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011071"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010445"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001010"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000620"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000010"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000884"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000706"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011072"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010446"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010085"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001011"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000621"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000315"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000885"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000884"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011073"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010447"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001012"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010058"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011074"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010448"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010444"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001013"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000794"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000622"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000129"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000886"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000884"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011075"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001014"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000623"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000129"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011076"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001015"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000475"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000624"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010441"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011077"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001016"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001062"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000625"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000600"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011078"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010451"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010095"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001017"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000136"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000626"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000625"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011079"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010452"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010049"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000890"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000891"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000627"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000626"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010453"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001018"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000257"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000891"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000888"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000628"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000001"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010454"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010427"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001019"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000258"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000760"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000755"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000892"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000252"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000629"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000557"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011080"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011081"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001020"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001019"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000630"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010302"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000894"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000692"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011082"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010456"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010004"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001021"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000638"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000895"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000894"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000631"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000628"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011083"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001022"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001024"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000896"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000879"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000632"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000210"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011084"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001023"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001024"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011085"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001024"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000999"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000633"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000205"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011086"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001025"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000256"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000766"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000328"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000898"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000897"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000634"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000558"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011087"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001026"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000148"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000767"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000013"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000899"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010506"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000635"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000294"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011088"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010461"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000810"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001027"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000088"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000768"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000179"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000636"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000352"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011089"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010462"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011126"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001028"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001026"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000769"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000052"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000505"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000506"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010463"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011126"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000506"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000015"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000638"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000257"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010464"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000810"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000770"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000052"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000507"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000506"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000639"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000701"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011090"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010465"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010497"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000771"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000088"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000508"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000532"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011091"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010334"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010071"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001030"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000654"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000640"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000555"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000772"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000631"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000509"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000532"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011092"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001031"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000654"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000641"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000008"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000773"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000252"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011093"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001032"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000654"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000642"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000011"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000774"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000772"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011094"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010468"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010471"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010336"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000511"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000608"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000643"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000224"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000775"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_000773"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_011095"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010044"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010469"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010471"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010337"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_010075"));
    map.put(ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001034"), ResourceFactory.createResource("http://semanticscience.org/resource/SIO_001033"));

    return map;
  }


}
