module BioInterchange

class SIO

  # A is related to B iff there is some relation between A and B.
  # (http://semanticscience.org/resource/SIO_000001)
  def self.is_related_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000001')
  end

  # has attribute is a relation between an entity and some attribute or property.
  # (http://semanticscience.org/resource/SIO_000008)
  def self.has_attribute
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000008')
  end

  # is attribute of is a relation between an attribute and the entity that it is ascribed to
  # (http://semanticscience.org/resource/SIO_000011)
  def self.is_attribute_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000011')
  end

  # denotes is a relation between an entity and what it is a sign or indication of, or what specifically means.
  # (http://semanticscience.org/resource/SIO_000020)
  def self.denotes
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000020')
  end

  # has part is a transitive, reflexive and antisymmetric relation between a whole and itself or a whole and its part.
  # (http://semanticscience.org/resource/SIO_000028)
  def self.has_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000028')
  end

  def self.is_time_boundary_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000029')
  end

  # has proper part is an antisymmetric, irreflexive (normally transitive) relation between a whole and a distinct part.
  # (http://semanticscience.org/resource/SIO_000053)
  def self.has_proper_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000053')
  end

  # has boundary is a mereological relation between a whole and boundary located at its periphery.
  # (http://semanticscience.org/resource/SIO_000054)
  def self.has_boundary
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000054')
  end

  # has member is a mereological relation between a collection and an item.
  # (http://semanticscience.org/resource/SIO_000059)
  def self.has_member
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000059')
  end

  def self.is_denoted_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000060')
  end

  # A is located in B iff the spatial region occupied by A is part of the spatial region occupied by B. [T][R]
  # (http://semanticscience.org/resource/SIO_000061)
  def self.is_located_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000061')
  end

  # is participant in is a relation that describes the participation of the subject in the (processual) object.
  # (http://semanticscience.org/resource/SIO_000062)
  def self.is_participant_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000062')
  end

  # is agent in is a relation between an entity and a process, where the entity is present throughout the process, no permanent material change occurs, and is a causal participant in the process.
  # (http://semanticscience.org/resource/SIO_000063)
  def self.is_agent_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000063')
  end

  # is provider of is a relation between a source and the entity it makes available.
  # (http://semanticscience.org/resource/SIO_000064)
  def self.is_provider_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000064')
  end

  # is provided by is a relation between an entity and the entity that provides it.
  # (http://semanticscience.org/resource/SIO_000066)
  def self.has_provider
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000066')
  end

  # is part of is a transitive, reflexive and anti-symmetric mereological relation between a whole and itself or a part and its whole.
  # (http://semanticscience.org/resource/SIO_000068)
  def self.is_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000068')
  end

  # is proper part of is an asymmetric, irreflexive (normally transitive) relation between a part and its distinct whole.
  # (http://semanticscience.org/resource/SIO_000093)
  def self.is_proper_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000093')
  end

  # is member of is a mereological relation between a item and a collection.
  # (http://semanticscience.org/resource/SIO_000095)
  def self.is_member_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000095')
  end

  # is boundary of is a mereological relation between a boudnary located at the periphery of a whole.
  # (http://semanticscience.org/resource/SIO_000096)
  def self.is_boundary_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000096')
  end

  # A is contained in B iff the spatial region occupied by A is part of the spatial region occupied by B and A is not part of B. [T]
  # (http://semanticscience.org/resource/SIO_000128)
  def self.is_contained_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000128')
  end

  # has participant is a relation that describes the participation of the object in the (processual) subject.
  # (http://semanticscience.org/resource/SIO_000132)
  def self.has_participant
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000132')
  end

  # has agent is a relation between a process and an entity, where the entity is present throughout the process and is a causal participant in the process.
  # (http://semanticscience.org/resource/SIO_000139)
  def self.has_agent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000139')
  end

  # A is location of B iff the spatial region occupied by A has the spatial region occupied by B as a part. [T][R]
  # (http://semanticscience.org/resource/SIO_000145)
  def self.is_location_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000145')
  end

  # A contains B iff the spatial region occupied by A has the spatial region occupied by B as a part, and B is not part of A. [T]
  # (http://semanticscience.org/resource/SIO_000202)
  def self.contains
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000202')
  end

  # A is connected to B iff there exists a fiat, material or temporal path between A and B. [S][T]
  # (http://semanticscience.org/resource/SIO_000203)
  def self.is_connected_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000203')
  end

  # A is adjacent to B iff there is a small, but non-zero distance between A and B
  # (http://semanticscience.org/resource/SIO_000204)
  def self.is_adjacent_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000204')
  end

  # is represented by: a relation between an entity and some symbol.
  # (http://semanticscience.org/resource/SIO_000205)
  def self.is_represented_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000205')
  end

  # is supported by is a relation between a proposition and something that supports the truth of the assertion.
  # (http://semanticscience.org/resource/SIO_000206)
  def self.is_supported_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000206')
  end

  # has disputing evidence is a relation between a proposition and something that disputes (does not directly support) the truth of the assertion.
  # (http://semanticscience.org/resource/SIO_000207)
  def self.is_disputed_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000207')
  end

  def self.is_supporting_evidence_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000208')
  end

  def self.is_disputing_evidence_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000209')
  end

  # a represents b when a serves as a sign, symbol or model of b.
  # (http://semanticscience.org/resource/SIO_000210)
  def self.represents
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000210')
  end

  # is positionally after is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically greater than the projection of the position of the second entity.
  # (http://semanticscience.org/resource/SIO_000211)
  def self.is_positionally_after
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000211')
  end

  # A is referred to by B iff B is an informational entity that makes reference to A.
  # (http://semanticscience.org/resource/SIO_000212)
  def self.is_referred_to_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000212')
  end

  # A has concretization B iff A is an informational entity and B is the a quality of some material entity.
  # (http://semanticscience.org/resource/SIO_000213)
  def self.has_concretization
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000213')
  end

  # A is concretization of B iff A is a quality of a material entity and B is an informational entity.
  # (http://semanticscience.org/resource/SIO_000214)
  def self.is_concretization_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000214')
  end

  # is measurement value of is a relation between a value and the entity that it is a measurement of.
  # (http://semanticscience.org/resource/SIO_000215)
  def self.is_measurement_value_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000215')
  end

  # has measurement value is a relation between a quality/realizable and a measurement value.
  # (http://semanticscience.org/resource/SIO_000216)
  def self.has_measurement_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000216')
  end

  # has quality is a relation between an entity and the quality that it bears.
  # (http://semanticscience.org/resource/SIO_000217)
  def self.has_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000217')
  end

  # is quality of is a relation between a quality and the entity that it is a property of.
  # (http://semanticscience.org/resource/SIO_000218)
  def self.is_quality_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000218')
  end

  # is source of is a relation between a source of information about some entity.
  # (http://semanticscience.org/resource/SIO_000219)
  def self.is_source_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000219')
  end

  # has unit is a relation between a quantity and the unit it is a multiple of.
  # (http://semanticscience.org/resource/SIO_000221)
  def self.has_unit
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000221')
  end

  # is unit of is a relation between a unit and a quantity that it is a multiple of.
  # (http://semanticscience.org/resource/SIO_000222)
  def self.is_unit_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000222')
  end

  # has property is a relation between an entity and the quality, capability or role that it and it alone bears.
  # (http://semanticscience.org/resource/SIO_000223)
  def self.has_property
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000223')
  end

  # is property of is a relation betweena  quality, capability or role and the entity that it and it alone bears.
  # (http://semanticscience.org/resource/SIO_000224)
  def self.is_property_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000224')
  end

  # has function is the relation between an entity and a function that is ascribed to it.
  # (http://semanticscience.org/resource/SIO_000225)
  def self.has_function
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000225')
  end

  # is function of is a relation between a function and an entity that it is a property of.
  # (http://semanticscience.org/resource/SIO_000226)
  def self.is_function_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000226')
  end

  # is role of is a relation between a role and the entity that it is a property of.
  # (http://semanticscience.org/resource/SIO_000227)
  def self.is_role_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000227')
  end

  # has role is a relation between an entity and a role that it bears.
  # (http://semanticscience.org/resource/SIO_000228)
  def self.has_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000228')
  end

  # has output is a relation between an process and an entity, where the entity is present at the end of the process.
  # (http://semanticscience.org/resource/SIO_000229)
  def self.has_output
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000229')
  end

  # has input is a relation between a process and an entity, where the entity is present at the beginning of the process.
  # (http://semanticscience.org/resource/SIO_000230)
  def self.has_input
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000230')
  end

  # is input in is a relation between an entity and a process, where the entity is present at the beginning of the process.
  # (http://semanticscience.org/resource/SIO_000231)
  def self.is_input_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000231')
  end

  # is output of is a relation between an entity and a process, where the entity is present at the end of the process.
  # (http://semanticscience.org/resource/SIO_000232)
  def self.is_output_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000232')
  end

  # is implementation of is a relation between an information entity and a specification that it conforms to.
  # (http://semanticscience.org/resource/SIO_000233)
  def self.is_implementation_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000233')
  end

  # has implementation is a relation between a specification and an implementation that conforms to it.
  # (http://semanticscience.org/resource/SIO_000234)
  def self.has_implementation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000234')
  end

  # has disposition is the relation between an entity and a disposition that it bears.
  # (http://semanticscience.org/resource/SIO_000235)
  def self.has_disposition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000235')
  end

  # is disposition of is a relation between a disposition and the entity that it is a property of.
  # (http://semanticscience.org/resource/SIO_000236)
  def self.is_disposition_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000236')
  end

  # is positionally before is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically less than the projection of the position of the second entity.
  # (http://semanticscience.org/resource/SIO_000240)
  def self.is_positionally_before
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000240')
  end

  # is directly after is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically greater than the projection of the position of the second entity, and the entities are adjacent to one another.
  # (http://semanticscience.org/resource/SIO_000241)
  def self.is_directly_after
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000241')
  end

  # is directly before is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically less than the projection of the position of the second entity, and the entities are adjacent to one another.
  # (http://semanticscience.org/resource/SIO_000242)
  def self.is_directly_before
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000242')
  end

  # A transitive, symmetric, temporal relation in which one entity is causally related with another non-identical entity.
  # (http://semanticscience.org/resource/SIO_000243)
  def self.is_causally_related_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000243')
  end

  # A transitive temporal relation in which one entity derives from another non-identical entity.
  # (http://semanticscience.org/resource/SIO_000244)
  def self.derives_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000244')
  end

  # A transitive temporal relation in which one entity derives into another non-identical entity.
  # (http://semanticscience.org/resource/SIO_000245)
  def self.derives_into
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000245')
  end

  # A non-transitive temporal relation in which one entity immediately derives into a non-identical entity such that there are no intermediate entities between them.
  # (http://semanticscience.org/resource/SIO_000246)
  def self.immediately_derives_into
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000246')
  end

  # A non-transitive temporal relation in which one entity immediately derives from a non-identical entity such that there are no intermediate entities between them.
  # (http://semanticscience.org/resource/SIO_000247)
  def self.immediately_derives_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000247')
  end

  # A transitive, temporal relation in which one process precedes (has occured earlier than) another process.
  # (http://semanticscience.org/resource/SIO_000248)
  def self.precedes
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000248')
  end

  def self.is_preceded_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000249')
  end

  # A non-transitive temporal relation in which one process immediately precedes another process, such that there is no interval of time between the two processes.
  # (http://semanticscience.org/resource/SIO_000250)
  def self.immediately_precedes
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000250')
  end

  # A non-transitive temporal relation in which one process is immediately preceded by another process, such that there is no interval of time between the two processes.
  # (http://semanticscience.org/resource/SIO_000251)
  def self.is_immediately_preceded_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000251')
  end

  # is reference for is a relation between a document that provides information about an entity.
  # (http://semanticscience.org/resource/SIO_000252)
  def self.is_referenced_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000252')
  end

  # has source is a relation between an entity and some source of information.
  # (http://semanticscience.org/resource/SIO_000253)
  def self.has_source
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000253')
  end

  # is annotation of is a relation between some textual entity and the entity that it annotates.
  # (http://semanticscience.org/resource/SIO_000254)
  def self.is_annotation_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000254')
  end

  # has annotation is a relation between an entity and some textual anntotation.
  # (http://semanticscience.org/resource/SIO_000255)
  def self.has_annotation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000255')
  end

  # has annotation is a relation between an entity and some textual anntotation.
  # (http://semanticscience.org/resource/SIO_000255)
  def self.was_annotated_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000255')
  end

  # is variant of: a relationship indicating that two entities are different (by some measure), but either achieve the same objectives in different ways or are permutations of one another (temporal, logical or otherwise)
  # (http://semanticscience.org/resource/SIO_000272)
  def self.is_variant_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000272')
  end

  # has direct part is a relation to specify a part at a particular level of granularity
  # (http://semanticscience.org/resource/SIO_000273)
  def self.has_direct_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000273')
  end

  # A is prior version of B iff A is a variant of B and B derives from A.
  # (http://semanticscience.org/resource/SIO_000274)
  def self.is_prior_version_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000274')
  end

  # cites is a relation to refer to by way of example, authority or proof.
  # (http://semanticscience.org/resource/SIO_000277)
  def self.cites
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000277')
  end

  # is cited by is a relation from an object that is referred to by way of example, authority or proof.
  # (http://semanticscience.org/resource/SIO_000278)
  def self.is_cited_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000278')
  end

  # is similar to is a relation between two entities that share one or more features.
  # (http://semanticscience.org/resource/SIO_000283)
  def self.is_similar_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000283')
  end

  # A is subsequent version of B iff A is a variant of B and A derives from B.
  # (http://semanticscience.org/resource/SIO_000286)
  def self.is_subsequent_version_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000286')
  end

  def self.is_covalently_connected_to_transitive
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000288')
  end

  # has target is a relation between a process and an entity, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
  # (http://semanticscience.org/resource/SIO_000291)
  def self.has_target
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000291')
  end

  # is target in is a relation between an entity and a process, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
  # (http://semanticscience.org/resource/SIO_000292)
  def self.is_target_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000292')
  end

  # is weakly interacting with is a symmetric relation between two molecular entities (or any part thereof) that are interacting through some weak force (van der waals, hydrogen bonds, electrostatic interactions)
  # (http://semanticscience.org/resource/SIO_000293)
  def self.is_weakly_interacting_with_transitive
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000293')
  end

  # a is causally related to b iff there is a causal chain of events from a to b
  # (http://semanticscience.org/resource/SIO_000294)
  def self.is_causally_related_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000294')
  end

  # is direct part of is a relation between a specific part (at some level of granularity) and its whole.
  # (http://semanticscience.org/resource/SIO_000310)
  def self.is_direct_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000310')
  end

  # is product of is a relation between an entity and a process, where the entity is present at the end  of the process as a result of a transformation in the process target.
  # (http://semanticscience.org/resource/SIO_000311)
  def self.is_product_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000311')
  end

  # has product is a relation between an process and an entity, where a new entity exists at the end of the process.
  # (http://semanticscience.org/resource/SIO_000312)
  def self.has_product
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000312')
  end

  # is component part of is a relation between a component and a whole, where the component is instrinsic to the whole, and loss of the part would change the kind that the whole is.
  # (http://semanticscience.org/resource/SIO_000313)
  def self.is_component_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000313')
  end

  # A is spatiotemporally related to B iff A is in the spatial or temporal vicinity of B
  # (http://semanticscience.org/resource/SIO_000322)
  def self.is_spatiotemporally_related_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000322')
  end

  # A 'is surrounded by' B iff the A 'is contained by' B and A 'is adjacent to' B or A 'is directly connected to' B.
  # (http://semanticscience.org/resource/SIO_000323)
  def self.is_surrounded_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000323')
  end

  # A 'surrounds' B iff the A 'contains' B and A 'is adjacent to' B or A 'is directly connected to' B.
  # (http://semanticscience.org/resource/SIO_000324)
  def self.surrounds
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000324')
  end

  # A overlaps with B iff there is some C that is part of both A and B. [S][R]
  # (http://semanticscience.org/resource/SIO_000325)
  def self.overlaps_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000325')
  end

  # is about is a relation between an information content entity and the entity that its primary subject.
  # (http://semanticscience.org/resource/SIO_000332)
  def self.is_about
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000332')
  end

  # is covalently connected to is a relation between an atom and another atom.
  # (http://semanticscience.org/resource/SIO_000334)
  def self.is_covalently_connected_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000334')
  end

  def self.is_weakly_interacting_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000335')
  end

  # A relation between an information content entity and a product that it (directly/indirectly) specifies
  # (http://semanticscience.org/resource/SIO_000338)
  def self.specifies
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000338')
  end

  # a relation between a product and the information content entity that specifies it.
  # (http://semanticscience.org/resource/SIO_000339)
  def self.is_specified_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000339')
  end

  # is manifested as is a relation between an expression and its manifestations.
  # (http://semanticscience.org/resource/SIO_000341)
  def self.is_manifested_as
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000341')
  end

  # a is causally related from b iff there is a causal chain of events from b to a
  # (http://semanticscience.org/resource/SIO_000352)
  def self.is_causally_related_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000352')
  end

  # realizes is a relation between a process and a realizable entity (role, function, disposition).
  # (http://semanticscience.org/resource/SIO_000355)
  def self.realizes
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000355')
  end

  def self.is_realized_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000356')
  end

  # satisfies is a relation between an entity and the specification or objective that it conforms to.
  # (http://semanticscience.org/resource/SIO_000362)
  def self.satisfies
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000362')
  end

  def self.is_satisfied_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000363')
  end

  # has creator is a relation between an entity and that which created it.
  # (http://semanticscience.org/resource/SIO_000364)
  def self.has_creator
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000364')
  end

  # has creator is a relation between an entity and that which created it.
  # (http://semanticscience.org/resource/SIO_000364)
  def self.was_created_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000364')
  end

  # is created by is a relation between an entity and its creator.
  # (http://semanticscience.org/resource/SIO_000365)
  def self.is_created_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000365')
  end

  # has component part is a relation between a whole and a component part where the component is instrinsic to the whole, and loss of the part would change the kind that it is.
  # (http://semanticscience.org/resource/SIO_000369)
  def self.has_component_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000369')
  end

  def self.has_expression
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000420')
  end

  # is expression of is a relation between more concrete expression of some conceptualization.
  # (http://semanticscience.org/resource/SIO_000421)
  def self.is_expression_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000421')
  end

  # A is broader than B (t) iff for A is broader than B.
  # (http://semanticscience.org/resource/SIO_000422)
  def self.is_broader_than_t
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000422')
  end

  # A is narrower than B (t) iff for A is narrower than B.
  # (http://semanticscience.org/resource/SIO_000424)
  def self.is_narrower_than_t
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000424')
  end

  # A is generically related with B iff A is an abstract entity or an information content entity and B is a information content entity or a physical entity, respectively.
  # (http://semanticscience.org/resource/SIO_000425)
  def self.is_generically_related_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000425')
  end

  def self.is_manifestation_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000426')
  end

  # A is narrower than B iff the meaning of term A is narrower in scope than the meaning of term B
  # (http://semanticscience.org/resource/SIO_000427)
  def self.is_narrower_than
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000427')
  end

  def self.is_broader_than
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000477')
  end

  # A is match to B iff A and B are terms with similar (related, broad, close, exact) meanings
  # (http://semanticscience.org/resource/SIO_000482)
  def self.is_match_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000482')
  end

  def self.is_exact_match_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000484')
  end

  def self.is_close_match_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000490')
  end

  def self.is_broad_match_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000491')
  end

  def self.is_dissimilar_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000495')
  end

  def self.is_opposite_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000496')
  end

  def self.is_version_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000497')
  end

  # has parameter is a relation between a process and an information content entity which modulates the behaviour of some participant.
  # (http://semanticscience.org/resource/SIO_000552)
  def self.has_parameter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000552')
  end

  # is parameter in is a relation between a data item and some data transformation process.
  # (http://semanticscience.org/resource/SIO_000553)
  def self.is_parameter_in
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000553')
  end

  def self.is_described_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000557')
  end

  # is orthologous to is a relation between two biological entities that share a common ancestor and occur in different species.
  # (http://semanticscience.org/resource/SIO_000558)
  def self.is_orthologous_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000558')
  end

  # describes is a relation between one entity and another entity that it provides a description (detailed account of).
  # (http://semanticscience.org/resource/SIO_000563)
  def self.describes
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000563')
  end

  # has capability is a relation between an entity and the capability that it bears.
  # (http://semanticscience.org/resource/SIO_000586)
  def self.has_capability
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000586')
  end

  # refers to is a relation between one entity and the entity that it makes reference to.
  # (http://semanticscience.org/resource/SIO_000628)
  def self.refers_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000628')
  end

  def self.is_subject_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000629')
  end

  # is paralogous to is a relation between two entities which indicates their common ancestry as a result of a gene duplication.
  # (http://semanticscience.org/resource/SIO_000630)
  def self.is_paralogous_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000630')
  end

  # references is a relation between one entity and the entity that it makes reference to by name, but is not described by it.
  # (http://semanticscience.org/resource/SIO_000631)
  def self.references
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000631')
  end

  # references is a relation between one entity and the entity that it makes reference to by name, but is not described by it.
  # (http://semanticscience.org/resource/SIO_000631)
  def self.mentions
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000631')
  end

  # is model of is a relation between a model (an artifact) and the entity it purports to represent.
  # (http://semanticscience.org/resource/SIO_000632)
  def self.is_model_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000632')
  end

  def self.is_modelled_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000633')
  end

  # a relation between two entities which indicates their common ancestry but due to horizontal gene transfer.
  # (http://semanticscience.org/resource/SIO_000634)
  def self.is_xenologous_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000634')
  end

  # has trigger is a relation between a realizable and the factor that causes it to be realized.
  # (http://semanticscience.org/resource/SIO_000635)
  def self.has_trigger
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000635')
  end

  def self.is_trigger_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000636')
  end

  # has basis is a relation between a realizable entity and the quality that forms the basis for it.
  # (http://semanticscience.org/resource/SIO_000641)
  def self.has_basis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000641')
  end

  # is base for is a relation between a quality and the realizable entity that it is the basis for.
  # (http://semanticscience.org/resource/SIO_000642)
  def self.is_base_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000642')
  end

  def self.is_realizable_property_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000643')
  end

  def self.has_realizable_property
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000644')
  end

  def self.is_capability_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000646')
  end

  # A is directly connected to B iff there exists a path direclty between A and B.
  # (http://semanticscience.org/resource/SIO_000652)
  def self.is_directly_connected_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000652')
  end

  # A transitive temporal relation in which an entity mainstains identity from one state to another.
  # (http://semanticscience.org/resource/SIO_000655)
  def self.transforms_into
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000655')
  end

  # A  temporal relation in which an entity mainstains identity from one state to another.
  # (http://semanticscience.org/resource/SIO_000656)
  def self.immediately_transforms_into
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000656')
  end

  # A transitive temporal relation in which an entity mainstains identity from one state to another.
  # (http://semanticscience.org/resource/SIO_000657)
  def self.transforms_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000657')
  end

  # A  temporal relation in which an entity mainstains identity from one state to another.
  # (http://semanticscience.org/resource/SIO_000658)
  def self.immediately_transforms_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000658')
  end

  # in relation to is a comparative relation to indicate that the instance of the class holding the relation exists in relation to another entity.
  # (http://semanticscience.org/resource/SIO_000668)
  def self.in_relation_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000668')
  end

  def self.has_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000671')
  end

  def self.is_identifier_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000672')
  end

  # has unique identifier is an inverse functional relation between an entity and an identifier that uniquely identifies it.
  # (http://semanticscience.org/resource/SIO_000673)
  def self.has_unique_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000673')
  end

  # is unique identifier for is a relation between an identifier and an entity that it uniquely identifies
  # (http://semanticscience.org/resource/SIO_000674)
  def self.is_unique_identifier_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000674')
  end

  def self.has_time_boundary
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000679')
  end

  def self.has_start_time
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000680')
  end

  def self.has_end_time
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000681')
  end

  def self.is_start_time_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000682')
  end

  def self.is_end_time_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000684')
  end

  # exists at is a relation between an entity and a time measurement.
  # (http://semanticscience.org/resource/SIO_000687)
  def self.exists_at
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000687')
  end

  def self.is_mutual_disposition_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000697')
  end

  def self.is_greater_than_or_equal_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000699')
  end

  def self.is_mutually_related_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000709')
  end

  def self.is_mutual_role_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000710')
  end

  def self.is_lesser_than_or_equal_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000733')
  end

  def self.is_greater_than
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000734')
  end

  def self.is_lesser_than
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000735')
  end

  # is comparable to is a relation between two entities that share at least one feature whose value can be compared.
  # (http://semanticscience.org/resource/SIO_000736)
  def self.is_comparable_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000736')
  end

  # is numerically comparable to is a comparison relation between two quantities whose datatype value can be compared.
  # (http://semanticscience.org/resource/SIO_000737)
  def self.is_numerically_comparable_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000737')
  end

  def self.is_equal_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000738')
  end

  def self.is_inequal_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000749')
  end

  # has evidence is a relation between a proposition and something that demonstrates the truth of the assertion.
  # (http://semanticscience.org/resource/SIO_000772)
  def self.has_evidence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000772')
  end

  def self.is_evidence_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000773')
  end

  # has evidence is a relation between a proposition and something that refutes (is incompatible with) the truth of the assertion.
  # (http://semanticscience.org/resource/SIO_000774)
  def self.is_refuted_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000774')
  end

  def self.is_refuting_evidence_for
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000775')
  end

  # measured at is a relation between a measurement value and the time measurement.
  # (http://semanticscience.org/resource/SIO_000793)
  def self.measured_at
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000793')
  end

  def self.in_relation_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000892')
  end

  # has frequency is a relation that specifies the occurence of an object or event
  # (http://semanticscience.org/resource/SIO_000900)
  def self.has_frequency
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000900')
  end

  # is frequency of is a relation between a temporal unit and an object or event
  # (http://semanticscience.org/resource/SIO_000901)
  def self.is_frequency_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000901')
  end

  # has substrate is a relation between a process and an object where the object is destroyed by its participation in the process.
  # (http://semanticscience.org/resource/SIO_000905)
  def self.has_substrate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000905')
  end

  # is first part of is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
  # (http://semanticscience.org/resource/SIO_000970)
  def self.is_first_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000970')
  end

  # has first part is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
  # (http://semanticscience.org/resource/SIO_000971)
  def self.has_first_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000971')
  end

  # has last part is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
  # (http://semanticscience.org/resource/SIO_000972)
  def self.has_last_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000972')
  end

  # is last part of is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
  # (http://semanticscience.org/resource/SIO_000973)
  def self.is_last_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000973')
  end

  # has ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
  # (http://semanticscience.org/resource/SIO_000974)
  def self.has_ordered_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000974')
  end

  # is ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
  # (http://semanticscience.org/resource/SIO_000975)
  def self.is_ordered_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000975')
  end

  # A relation between an biological information content entity and a product that it (directly/indirectly) encodes.
  # (http://semanticscience.org/resource/SIO_010078)
  def self.encodes
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010078')
  end

  def self.is_encoded_by
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010079')
  end

  # a relation between two information content entities in which one is transcribed into (an exact or similar kind) another through some process.
  # (http://semanticscience.org/resource/SIO_010080)
  def self.is_transcribed_into
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010080')
  end

  def self.is_transcribed_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010081')
  end

  def self.is_translated_into
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010082')
  end

  def self.is_translated_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010083')
  end

  # a relation between two entities which indicates their common ancestry.
  # (http://semanticscience.org/resource/SIO_010302)
  def self.is_homologous_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010302')
  end

  # A relation between a informational entity and its actual value (numeric, date, text, etc).
  # (http://semanticscience.org/resource/SIO_000300)
  def self.has_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000300')
  end

  # Everything is an entity.
  # (http://semanticscience.org/resource/SIO_000000)
  def self.entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000000')
  end

  # A material entity is a physical entity that is spatially extended, exists as a whole at any point in time and has mass.
  # (http://semanticscience.org/resource/SIO_000004)
  def self.material_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000004')
  end

  # A quality is an attribute that is intrinsically associated with its bearer (or its parts), but whose presence/absence and observed/measured value may vary.
  # (http://semanticscience.org/resource/SIO_000005)
  def self.quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000005')
  end

  # A process is an entity that is identifiable only through the unfolding of time, has temporal parts, and unless otherwise specified/predicted, cannot be identified from any instant of time in which it exists.
  # (http://semanticscience.org/resource/SIO_000006)
  def self.process
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000006')
  end

  def self.social_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000009')
  end

  # A social structure is a social entity which consists of relationships between two or more entities.
  # (http://semanticscience.org/resource/SIO_000010)
  def self.social_structure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000010')
  end

  # An organization is a collective with a complex articulation of tasks, roles and responsibilities.
  # (http://semanticscience.org/resource/SIO_000012)
  def self.organization
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000012')
  end

  # a geographic position is the coordinate of an entity against some geographic coordinate system.
  # (http://semanticscience.org/resource/SIO_000013)
  def self.geographic_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000013')
  end

  # A disposition is the tendency of a capability to be exhibited under certain conditions or in response to a certain stimulus (trigger)
  # (http://semanticscience.org/resource/SIO_000014)
  def self.disposition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000014')
  end

  # information content entity is an object that requires some background knowledge or procedure to correctly interpret.
  # (http://semanticscience.org/resource/SIO_000015)
  def self.information_content_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000015')
  end

  # A role is a realizable entity that describes behaviours, rights and obligations of an entity in some particular circumstance.
  # (http://semanticscience.org/resource/SIO_000016)
  def self.role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000016')
  end

  # A function is a capability that satisfies some agentive objective, or (evolutionary) optimization.
  # (http://semanticscience.org/resource/SIO_000017)
  def self.function
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000017')
  end

  # A site is a spatial region bounded (in part or in whole) by material entities and may be occupied by material entities.
  # (http://semanticscience.org/resource/SIO_000019)
  def self.site
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000019')
  end

  # A material boundary is the boundary of a material entity which exists as a lower dimensional entity at exactly the location where its parts no longer extend into space. Every material entity has a boundary, and a boundary is the boundary of exactly 1 material entity.
  # (http://semanticscience.org/resource/SIO_000022)
  def self.material_boundary
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000022')
  end

  # An object quality is quality of an object.
  # (http://semanticscience.org/resource/SIO_000026)
  def self.object_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000026')
  end

  # A process quality is quality that is associated with a process.
  # (http://semanticscience.org/resource/SIO_000027)
  def self.process_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000027')
  end

  # A sequence is a primary structure descriptor in which each of the letters in the string represents a monomeric unit (residue) in which adjacent letters represent the connectivity between the monomeric units.
  # (http://semanticscience.org/resource/SIO_000030)
  def self.biopolymer_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000030')
  end

  def self.start_date
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000031')
  end

  def self.end_date
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000032')
  end

  # process status is a process quality that describes the state of a process.
  # (http://semanticscience.org/resource/SIO_000033)
  def self.process_status
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000033')
  end

  # completed is that status of a process that successfully unfolds.
  # (http://semanticscience.org/resource/SIO_000034)
  def self.completed
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000034')
  end

  # ongoing is the status of a process that is not yet complete.
  # (http://semanticscience.org/resource/SIO_000035)
  def self.ongoing
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000035')
  end

  # predicted is the quality of an entity that has not been shown to exist but there is a claim of potential existence.
  # (http://semanticscience.org/resource/SIO_000036)
  def self.predicted
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000036')
  end

  def self.physical_dimensional_quantity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000037')
  end

  # a quantity that extends in single dimension
  # (http://semanticscience.org/resource/SIO_000038)
  def self.a_D_extent_quantity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000038')
  end

  def self.depth
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000039')
  end

  def self.height
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000040')
  end

  def self.length
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000041')
  end

  def self.width
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000042')
  end

  def self.thickness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000043')
  end

  def self.area
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000045')
  end

  def self.perimeter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000046')
  end

  def self.circumference
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000047')
  end

  def self.volume
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000049')
  end

  # composition is the quality of having anatomical parts.
  # (http://semanticscience.org/resource/SIO_000051)
  def self.composition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000051')
  end

  # A quantity is an informational entity that gives the magnitude of a property.
  # (http://semanticscience.org/resource/SIO_000052)
  def self.quantity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000052')
  end

  # shape is the quality of a bearer that relates to its spatial extent.
  # (http://semanticscience.org/resource/SIO_000055)
  def self.shape
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000055')
  end

  # A measurement of a spatial location relative to a frame of reference or other objects.
  # (http://semanticscience.org/resource/SIO_000056)
  def self.position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000056')
  end

  # orientation is an angle between the bearer and an axis, or the angle between the bearer and another object.
  # (http://semanticscience.org/resource/SIO_000057)
  def self.orientation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000057')
  end

  # A namespace is an informational entity that defines a logical container for a set of symbols or identifiers.
  # (http://semanticscience.org/resource/SIO_000067)
  def self.namespace
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000067')
  end

  # a data item consists of information that has been collected/generated towards some purpose.
  # (http://semanticscience.org/resource/SIO_000069)
  def self.data_item
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000069')
  end

  # A measurement value is a quantitative description that reflects the magnitude of some attribute.
  # (http://semanticscience.org/resource/SIO_000070)
  def self.measurement_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000070')
  end

  # A coordinate is a measurement of position in n-dimensional space.
  # (http://semanticscience.org/resource/SIO_000071)
  def self.coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000071')
  end

  # A Cartesian coordinate is the signed distance of a point to some referent line.
  # (http://semanticscience.org/resource/SIO_000072)
  def self.cartesian_coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000072')
  end

  def self.polar_coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000073')
  end

  # A unit of measurement is a definite magnitude of a physical quantity, defined and adopted by convention and/or by law, that is used as a standard for measurement of the same physical quantity.
  # (http://semanticscience.org/resource/SIO_000074)
  def self.unit_of_measurement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000074')
  end

  # a mathematical entity is an information content entity that are components of a mathematical system or can be defined in mathematical terms.
  # (http://semanticscience.org/resource/SIO_000075)
  def self.mathematical_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000075')
  end

  # a plan is a set of intended actions, through which one expects to achieve a goal.
  # (http://semanticscience.org/resource/SIO_000076)
  def self.plan
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000076')
  end

  # A generic name is the preferred name provided by manufacturer
  # (http://semanticscience.org/resource/SIO_000077)
  def self.generic_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000077')
  end

  # A language entity implements some language specification for the visual interpretation and is part of some document.
  # (http://semanticscience.org/resource/SIO_000078)
  def self.language_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000078')
  end

  # A visual language entity is a language entity that is expressed through physical expression of manual  
  # (http://semanticscience.org/resource/SIO_000079)
  def self.visual_language_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000079')
  end

  # A figure is a graphical entity which consists of a visual (n-dimentional) arrangement of information entities.
  # (http://semanticscience.org/resource/SIO_000080)
  def self.figure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000080')
  end

  # A figure is a graphical entity which consists of a visual (n-dimentional) arrangement of information entities.
  # (http://semanticscience.org/resource/SIO_000080)
  def self.diagram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000080')
  end

  # An image is an affine projection of a visual entity to a two dimensional surface.
  # (http://semanticscience.org/resource/SIO_000081)
  def self.image
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000081')
  end

  # An image is an affine projection of a visual entity to a two dimensional surface.
  # (http://semanticscience.org/resource/SIO_000081)
  def self.depiction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000081')
  end

  # A photograph is an image created by light falling on a light-sensitive surface.
  # (http://semanticscience.org/resource/SIO_000082)
  def self.photograph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000082')
  end

  # A photograph is an image created by light falling on a light-sensitive surface.
  # (http://semanticscience.org/resource/SIO_000082)
  def self.photo
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000082')
  end

  # A statistical graph is a figure that displays the relationship among numeric data and/or mathematical functions.
  # (http://semanticscience.org/resource/SIO_000083)
  def self.statistical_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000083')
  end

  # Either:
  #   A statistical graph is a figure that displays the relationship among numeric data and/or mathematical functions.
  #   (http://semanticscience.org/resource/SIO_000083)
  # Or:
  #   A chart is a figure that displays the relationship among tabular numeric data, functions or some kinds of qualitative structures.
  #   (http://semanticscience.org/resource/SIO_000904)
  def self.chart
    return [ RDF::URI.new('http://semanticscience.org/resource/SIO_000083'), RDF::URI.new('http://semanticscience.org/resource/SIO_000904') ]
  end

  # A question is a linguistic expression used to make a request for information.
  # (http://semanticscience.org/resource/SIO_000085)
  def self.question
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000085')
  end

  # A publication is a document that has been made available by a publisher.
  # (http://semanticscience.org/resource/SIO_000087)
  def self.publication
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000087')
  end

  # A record is a document containing a collection of statements about some entity.
  # (http://semanticscience.org/resource/SIO_000088)
  def self.record
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000088')
  end

  # A dataset is a data item that is a collection of data items.
  # (http://semanticscience.org/resource/SIO_000089)
  def self.data_set
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000089')
  end

  # A specification is a description of the essential technical attributes/requirements for an object or procedure, and may be used to determine that the object / procedure meets its requirements/attributes.
  # (http://semanticscience.org/resource/SIO_000090)
  def self.specification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000090')
  end

  # An effective specification is a specification composed of a sequence of instructions to achieve some objective.
  # (http://semanticscience.org/resource/SIO_000091)
  def self.effective_specification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000091')
  end

  # A biopolymer is an organic polymer using biological components.
  # (http://semanticscience.org/resource/SIO_000092)
  def self.biopolymer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000092')
  end

  # An algorithm is an effective method expressed as a finite list of well-defined instructions for calculating a function.
  # (http://semanticscience.org/resource/SIO_000094)
  def self.algorithm
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000094')
  end

  # a software entity is a computational entity that can be interpreted by or directly executed by a processing unit.
  # (http://semanticscience.org/resource/SIO_000097)
  def self.software_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000097')
  end

  # A software method (also called subroutine, subprogram, procedure, method, function, or routine) is software designed to execute a specific task
  # (http://semanticscience.org/resource/SIO_000098)
  def self.software_method
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000098')
  end

  # A software module is software composed of a collection of software methods.
  # (http://semanticscience.org/resource/SIO_000099)
  def self.software_module
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000099')
  end

  # A software library is software composed of a collection of software modules and/or software methods in a form that can be statically or dynamically linked to some software application.
  # (http://semanticscience.org/resource/SIO_000100)
  def self.software_library
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000100')
  end

  # A software application is software that can be directly executed by some processing unit.
  # (http://semanticscience.org/resource/SIO_000101)
  def self.software_application
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000101')
  end

  # A software interpreter is a software application that executes some specified input software.
  # (http://semanticscience.org/resource/SIO_000102)
  def self.software_interpreter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000102')
  end

  # A software script is software whose instructions can be executed using a software interpreter.
  # (http://semanticscience.org/resource/SIO_000103)
  def self.software_script
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000103')
  end

  # Language is a language entity which is the result of encoding and decoding information through systematic creation and usage of systems of symbols, each pairing a specific sign with an intended meaning, established through social conventions
  # (http://semanticscience.org/resource/SIO_000104)
  def self.language
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000104')
  end

  # A symbol is a proposition about what an entity represents.
  # (http://semanticscience.org/resource/SIO_000105)
  def self.symbol
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000105')
  end

  # A book is a publication composed of a large number of entries.
  # (http://semanticscience.org/resource/SIO_000106)
  def self.book
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000106')
  end

  # A chapter is a document section of a book or thesis.
  # (http://semanticscience.org/resource/SIO_000107)
  def self.chapter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000107')
  end

  # A character is a language symbol used to construct words.
  # (http://semanticscience.org/resource/SIO_000108)
  def self.character
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000108')
  end

  def self.novel
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000109')
  end

  # A paragraph is a self-contained unit of written discourse consisting of one or more sentences.
  # (http://semanticscience.org/resource/SIO_000110)
  def self.paragraph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000110')
  end

  def self.document_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000111')
  end

  # A capability is a realizable entity whose basis lies in one or more parts or qualities and reflects possility of an entity to act in a specified way under certain conditions or in response to a certain stimulus (trigger).
  # (http://semanticscience.org/resource/SIO_000112)
  def self.capability
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000112')
  end

  # A sentence is a grammatical unit consisting of one or more words that bear minimal syntactic relation to the words that precede or follow it
  # (http://semanticscience.org/resource/SIO_000113)
  def self.sentence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000113')
  end

  # A word is the smallest free form (an item that may be expressed in isolation with semantic or pragmatic content) in a language.
  # (http://semanticscience.org/resource/SIO_000114)
  def self.word
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000114')
  end

  # An identifier is a label that specifically refers to (identifies) an entity (instance/type).
  # (http://semanticscience.org/resource/SIO_000115)
  def self.identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000115')
  end

  def self.name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000116')
  end

  # a preferred name is the name that is generally used by some organization. 
  # (http://semanticscience.org/resource/SIO_000117)
  def self.preferred_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000117')
  end

  # a common name is a name that is commonly used.
  # (http://semanticscience.org/resource/SIO_000118)
  def self.common_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000118')
  end

  # a brand name is a trademarked and marketed name of a product.
  # (http://semanticscience.org/resource/SIO_000119)
  def self.brand_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000119')
  end

  # a scientific name is a name given through scientific nomenclature.
  # (http://semanticscience.org/resource/SIO_000120)
  def self.scientific_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000120')
  end

  # A magazine is a periodical that typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports.
  # (http://semanticscience.org/resource/SIO_000121)
  def self.magazine
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000121')
  end

  # A synonym is a word with the same or very similar meanings.
  # (http://semanticscience.org/resource/SIO_000122)
  def self.synonym
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000122')
  end

  # An antonym is a word with opposite or nearly opposite meaning.
  # (http://semanticscience.org/resource/SIO_000123)
  def self.antonym
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000123')
  end

  # A hypernym is a term with a broader meaning.
  # (http://semanticscience.org/resource/SIO_000124)
  def self.hypernym
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000124')
  end

  # A hyponym is a term with a narrower meaning.
  # (http://semanticscience.org/resource/SIO_000125)
  def self.hyponym
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000125')
  end

  # A homonym is a word that sounds the same but has different meaning.
  # (http://semanticscience.org/resource/SIO_000126)
  def self.homonym
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000126')
  end

  # A workflow is an algorithm that is is a depiction of a sequence of operations to achieve one or more objectives.
  # (http://semanticscience.org/resource/SIO_000127)
  def self.workflow
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000127')
  end

  def self.ontology_document
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000129')
  end

  # A pattern is a generalized representation of some repeatable concrete or informational item.
  # (http://semanticscience.org/resource/SIO_000130)
  def self.pattern
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000130')
  end

  def self.motif
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000131')
  end

  # A descriptor (index term, subject term, subject heading) is a term that captures the essence of the topic of a document.
  # (http://semanticscience.org/resource/SIO_000133)
  def self.descriptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000133')
  end

  # A definition is a description that succintly characterizes an entity.
  # (http://semanticscience.org/resource/SIO_000135)
  def self.definition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000135')
  end

  # a description is language entity in which elements of a language (formal or natural) are used to characterize an entity.
  # (http://semanticscience.org/resource/SIO_000136)
  def self.description
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000136')
  end

  # a category is a class of entities having particular shared characteristics.
  # (http://semanticscience.org/resource/SIO_000137)
  def self.category
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000137')
  end

  # A class is a collection of sets which can be unambiguously defined by a property that all its members share.
  # (http://semanticscience.org/resource/SIO_000138)
  def self.class
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000138')
  end

  # A web service is a software application that can be accessed over a network, such as the Internet, and executed on a remote system hosting the requested services.
  # (http://semanticscience.org/resource/SIO_000140)
  def self.web_service
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000140')
  end

  # A criterion is a specification to describe properties used for evaluation.
  # (http://semanticscience.org/resource/SIO_000141)
  def self.criterion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000141')
  end

  # An inclusion criterion is a criterion that must be present to satisfy some objective.
  # (http://semanticscience.org/resource/SIO_000142)
  def self.inclusion_criterion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000142')
  end

  # An exclusion criterion is a criterion that must be absent to satistify the objective.
  # (http://semanticscience.org/resource/SIO_000143)
  def self.exclusion_criterion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000143')
  end

  # A parameter is variable whose value changes the characteristics of a system or a function.
  # (http://semanticscience.org/resource/SIO_000144)
  def self.parameter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000144')
  end

  # A monomer is a submolecule that is proper part of some polymer, and is a building block for such polymer.
  # (http://semanticscience.org/resource/SIO_000146)
  def self.monomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000146')
  end

  # A keyword is a descriptor in which the association of the word with the entity facilitates information retrieval.
  # (http://semanticscience.org/resource/SIO_000147)
  def self.keyword
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000147')
  end

  # A document is a bounded physical or digital representation of a body of information designed with the capacity (and usually intent) to communicate.
  # (http://semanticscience.org/resource/SIO_000148)
  def self.document
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000148')
  end

  # a list is any enumeration of a set of items.
  # (http://semanticscience.org/resource/SIO_000150)
  def self.list
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000150')
  end

  # A manuscript is a document prior to publication.
  # (http://semanticscience.org/resource/SIO_000151)
  def self.manuscript
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000151')
  end

  # A note is a brief document.
  # (http://semanticscience.org/resource/SIO_000152)
  def self.note
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000152')
  end

  # A patent is an information entity granted by a patent issuing authority which confers upon the patenter the sole right to make, use and sell an invention for a set period of time.
  # (http://semanticscience.org/resource/SIO_000153)
  def self.patent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000153')
  end

  # An article is a publication that is stand-alone section of a larger work.
  # (http://semanticscience.org/resource/SIO_000154)
  def self.article
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000154')
  end

  # A blog is a publication accessible at some website and is typically about various experiences.
  # (http://semanticscience.org/resource/SIO_000155)
  def self.blog
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000155')
  end

  # A book volume is a book that is part of a collection.
  # (http://semanticscience.org/resource/SIO_000156)
  def self.book_volume
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000156')
  end

  # A conference proceedings is a book composed of papers presented at a conference.
  # (http://semanticscience.org/resource/SIO_000157)
  def self.conference_proceedings
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000157')
  end

  # A book series is a collection of books that have been sequentially published.
  # (http://semanticscience.org/resource/SIO_000158)
  def self.book_series
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000158')
  end

  # An edited publication is a publication that has been examined and potentially changed by an editor.
  # (http://semanticscience.org/resource/SIO_000159)
  def self.edited_publication
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000159')
  end

  # A journal is a a peer-reviewed periodical in which scholarship relating to a particular academic discipline is published.
  # (http://semanticscience.org/resource/SIO_000160)
  def self.journal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000160')
  end

  # A manual is a document that instructs on the usage of a device.
  # (http://semanticscience.org/resource/SIO_000161)
  def self.manual
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000161')
  end

  # A periodical is a publication that appears on a regular schedule.
  # (http://semanticscience.org/resource/SIO_000162)
  def self.periodical
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000162')
  end

  def self.newspaper
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000163')
  end

  # A technical report is a publication published by a school or other institution, usually numbered within a series.
  # (http://semanticscience.org/resource/SIO_000164)
  def self.technical_report
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000164')
  end

  # A tehsis document is the written research component of a post-secondary institution  that contains a statement supported by arguments.
  # (http://semanticscience.org/resource/SIO_000165)
  def self.thesis_document
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000165')
  end

  # An honor's thesis is a thesis prepared as a requirement for an honor's undergraduate degree.
  # (http://semanticscience.org/resource/SIO_000166)
  def self.honor_s_thesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000166')
  end

  # A Master's thesis is a thesis prepared as a requirement for a Master's degree.
  # (http://semanticscience.org/resource/SIO_000167)
  def self.master_s_thesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000167')
  end

  # A PhD thesis is a thesis prepared as a requirement for a doctoral degree.
  # (http://semanticscience.org/resource/SIO_000168)
  def self.phd_thesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000168')
  end

  # A booklet is a document that lacks a named publisher or sponsoring institution.
  # (http://semanticscience.org/resource/SIO_000169)
  def self.booklet
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000169')
  end

  # A diary is a document which describes day-to-day experiences.
  # (http://semanticscience.org/resource/SIO_000170)
  def self.diary
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000170')
  end

  # A bibliographic attribute is an attribute related to publications.
  # (http://semanticscience.org/resource/SIO_000171)
  def self.document_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000171')
  end

  # An address is a position that indicates the physical location of some entity using a social convention.
  # (http://semanticscience.org/resource/SIO_000172)
  def self.address
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000172')
  end

  # An affiliation is a social structure which indicates the partnership between two or more entities.
  # (http://semanticscience.org/resource/SIO_000173)
  def self.affiliation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000173')
  end

  # A citation is a textual entity which denotes a source described in the bibliography or reference section of a document.
  # (http://semanticscience.org/resource/SIO_000174)
  def self.citation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000174')
  end

  # A document title is a  textual entity that summarizes the topic of the document in one sentence.
  # (http://semanticscience.org/resource/SIO_000175)
  def self.document_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000175')
  end

  # A reference is a textual entity that describes a single source used in the preparation or development of the work.
  # (http://semanticscience.org/resource/SIO_000176)
  def self.reference
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000176')
  end

  # A page range denotes the start and end page in some document.
  # (http://semanticscience.org/resource/SIO_000177)
  def self.page_range
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000177')
  end

  # A page total is a textual entity that is about the number of pages in some informational entity.
  # (http://semanticscience.org/resource/SIO_000178)
  def self.page_total
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000178')
  end

  # a label is a term that is associated with some entity
  # (http://semanticscience.org/resource/SIO_000179)
  def self.label
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000179')
  end

  # A language label is a label that denotes the language of a textual entity.
  # (http://semanticscience.org/resource/SIO_000180)
  def self.language_label
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000180')
  end

  # A first name is a name that denotes a specific individual between members of a group of individuals, whose members usually share the same surname.
  # (http://semanticscience.org/resource/SIO_000181)
  def self.first_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000181')
  end

  # A last name (surname) is a name added to a given name and is part of a personal name and is often the family name.
  # (http://semanticscience.org/resource/SIO_000182)
  def self.last_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000182')
  end

  # A personal name is a name to identify an individual person and usually comprises of a first name and a last name.
  # (http://semanticscience.org/resource/SIO_000183)
  def self.personal_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000183')
  end

  # A legal name is a name given at birth, or which appears on their birth certificate, marriage certificate, or change of name certificate.
  # (http://semanticscience.org/resource/SIO_000184)
  def self.legal_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000184')
  end

  # A title is a textual entity that summarily describes some entity.
  # (http://semanticscience.org/resource/SIO_000185)
  def self.title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000185')
  end

  # A document version is a version of a work in some sequence of derivative works.
  # (http://semanticscience.org/resource/SIO_000186)
  def self.document_version
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000186')
  end

  # An abstract section is a document section that provides brief summary of a document that explains the main argument(s), topic(s) or findings.
  # (http://semanticscience.org/resource/SIO_000188)
  def self.abstract_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000188')
  end

  # An acknowledgements section is a document section that identifies individuals, groups or organizations for their support in the development of the work.
  # (http://semanticscience.org/resource/SIO_000189)
  def self.acknowledgements_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000189')
  end

  # An author contribution section is a document section that describes the contribution of the authors.
  # (http://semanticscience.org/resource/SIO_000190)
  def self.author_contribution_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000190')
  end

  # An author section is a document section that lists the contributing authors.
  # (http://semanticscience.org/resource/SIO_000191)
  def self.author_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000191')
  end

  # A bibliography section is a document section that is composed of a list of references used in the development of the work.
  # (http://semanticscience.org/resource/SIO_000192)
  def self.bibliography_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000192')
  end

  # A copyright section is a document section that contains a notice of copyright.
  # (http://semanticscience.org/resource/SIO_000193)
  def self.copyright_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000193')
  end

  # A correspondence section is a document section that contains the details for contacting the corresponding author.
  # (http://semanticscience.org/resource/SIO_000194)
  def self.correspondence_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000194')
  end

  # The discussion section is a document section containing a summary of the findings, a reflection on the significance of findings, comparison with related work, among others.
  # (http://semanticscience.org/resource/SIO_000195)
  def self.discussion_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000195')
  end

  # An introduction section is a document section that generally provides background, motivation and goals of the work.
  # (http://semanticscience.org/resource/SIO_000196)
  def self.introduction_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000196')
  end

  # The materials and methods section is a document section containing a description of the materials and methods used in the study.
  # (http://semanticscience.org/resource/SIO_000197)
  def self.materials_and_methods_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000197')
  end

  # The materials section is a document section containing a description of the materials used in the study.
  # (http://semanticscience.org/resource/SIO_000198)
  def self.materials_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000198')
  end

  # The methods section is a document section containing a description of the methods used in the study.
  # (http://semanticscience.org/resource/SIO_000199)
  def self.methods_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000199')
  end

  # The results section is a document section describing the main findings of the study.
  # (http://semanticscience.org/resource/SIO_000200)
  def self.results_section
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000200')
  end

  # The table of contents is a document section that lists all sections (and optionally subsections) in a sequential order along with their page number.
  # (http://semanticscience.org/resource/SIO_000201)
  def self.table_of_contents
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000201')
  end

  # implication is a logical operator that holds between a set T of propositions and a proposition B, when every model (or interpretation or valuation) of T is also a model of B.
  # (http://semanticscience.org/resource/SIO_000220)
  def self.implies
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000220')
  end

  # A namespace label is a short name for a namespace.
  # (http://semanticscience.org/resource/SIO_000237)
  def self.namespace_label
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000237')
  end

  def self.logical_operator
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000238')
  end

  # AND is a logical operator that has the value true if both of its operands are true, otherwise a value of false.
  # (http://semanticscience.org/resource/SIO_000239)
  def self.conjunction_and
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000239')
  end

  # A proposition is a sentence expressing something true or false.
  # (http://semanticscience.org/resource/SIO_000256)
  def self.proposition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000256')
  end

  # A dimensionless quantity is a quantity that has no associated unit.
  # (http://semanticscience.org/resource/SIO_000257)
  def self.dimensionless_quantity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000257')
  end

  # A dimensional quantity is a quantity that has an associated unit.
  # (http://semanticscience.org/resource/SIO_000258)
  def self.dimensional_quantity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000258')
  end

  # An argument is a set of one or more declarative sentences (or propositions) known as the premises along with another declarative sentence (or proposition) known as the conclusion.
  # (http://semanticscience.org/resource/SIO_000259)
  def self.argument
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000259')
  end

  # A premise is a proposition of an argument from which the conclusion is drawn.
  # (http://semanticscience.org/resource/SIO_000261)
  def self.premise
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000261')
  end

  # A conclusion is a proposition which is reached after considering the evidence, arguments or premises.
  # (http://semanticscience.org/resource/SIO_000262)
  def self.conclusion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000262')
  end

  # A deductive argument is an argument that asserts that the truth of the conclusion is a logical consequence of the premises.
  # (http://semanticscience.org/resource/SIO_000263)
  def self.deductive_argument
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000263')
  end

  # An inductive argument is an argument that asserts that the truth of the conclusion is supported by the premises.
  # (http://semanticscience.org/resource/SIO_000264)
  def self.inductive_argument
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000264')
  end

  # A sound argument is a valid argument with true premises.
  # (http://semanticscience.org/resource/SIO_000265)
  def self.sound_argument
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000265')
  end

  # A valid argument is an argument where the truth of the conclusion is a logical consequence of the premises and (consequently) its corresponding conditional is a necessary truth.
  # (http://semanticscience.org/resource/SIO_000266)
  def self.valid_argument
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000266')
  end

  # An invalid argument is an argument where the truth of the conclusion is false because it is not a logical consequence of the premises.
  # (http://semanticscience.org/resource/SIO_000267)
  def self.invalid_argument
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000267')
  end

  # truth value is a quality of information that is claimed/verified to be true or false.
  # (http://semanticscience.org/resource/SIO_000268)
  def self.truth_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000268')
  end

  def self.true
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000269')
  end

  def self.false
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000270')
  end

  # A term is a word or phrase used to denote one or more entities.
  # (http://semanticscience.org/resource/SIO_000275)
  def self.term
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000275')
  end

  # An emotion is a quality that an individual experiences due to an internal state of being or an involuntary physiological response.
  # (http://semanticscience.org/resource/SIO_000276)
  def self.emotion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000276')
  end

  # mass is the quality of the amount of substance.
  # (http://semanticscience.org/resource/SIO_000279)
  def self.mass
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000279')
  end

  def self.disjunction_or
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000280')
  end

  # NOT is a logical operator in that has the value true if its operand is false.
  # (http://semanticscience.org/resource/SIO_000281)
  def self.negation_not
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000281')
  end

  # XOR, also called exclusive disjunction or (symbolized XOR, EOR, EXOR, or ⊕), is a type of logical disjunction on two operands that results in a value of true if exactly one of the operands has a value of true.
  # (http://semanticscience.org/resource/SIO_000282)
  def self.exclusive_disjunction_xor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000282')
  end

  # a hypothesis is a proposed explanation for a phenomenon.
  # (http://semanticscience.org/resource/SIO_000284)
  def self.hypothesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000284')
  end

  def self.academic_organization
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000285')
  end

  def self.social_relation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000287')
  end

  # a set is a collection of entities, for which there may be zero members.
  # (http://semanticscience.org/resource/SIO_000289)
  def self.set
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000289')
  end

  def self.university
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000290')
  end

  def self.collection_of_documents
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000295')
  end

  # A website is a collection of documents published on the World Wide Web.
  # (http://semanticscience.org/resource/SIO_000296)
  def self.website
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000296')
  end

  # A movie is a series of images that are displayed in rapid succession  to give the impression of movement.
  # (http://semanticscience.org/resource/SIO_000297)
  def self.movie
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000297')
  end

  # A movie is a series of images that are displayed in rapid succession  to give the impression of movement.
  # (http://semanticscience.org/resource/SIO_000297)
  def self.moving_pictures
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000297')
  end

  # An excerpt is a contiguous or discontiguous portion of a document.
  # (http://semanticscience.org/resource/SIO_000298)
  def self.excerpt
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000298')
  end

  # A quote is a excerpt that is attributed to a particular source.
  # (http://semanticscience.org/resource/SIO_000299)
  def self.quote
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000299')
  end

  # A geographic image is a photograph of some geographical area.
  # (http://semanticscience.org/resource/SIO_000301)
  def self.geographic_image
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000301')
  end

  # A web page is a document that is published according to World Wide Web standards.
  # (http://semanticscience.org/resource/SIO_000302)
  def self.web_page
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000302')
  end

  # Email message is a digital document that is composed of a header and a body and is transmitted using the SMTP protocol.
  # (http://semanticscience.org/resource/SIO_000304)
  def self.email
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000304')
  end

  # process number is a number associated with a process that denotes its ordinal position in a set of processes.
  # (http://semanticscience.org/resource/SIO_000305)
  def self.process_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000305')
  end

  # A letter is a document that contains a personal communication from one part to another.
  # (http://semanticscience.org/resource/SIO_000306)
  def self.letter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000306')
  end

  # normality is the quality in which the value may differ from normal or average
  # (http://semanticscience.org/resource/SIO_000307)
  def self.normality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000307')
  end

  # An edition number is count of a literary work edited and published, as by a certain editor or in a certain manner including being printed during some interval of time.
  # (http://semanticscience.org/resource/SIO_000308)
  def self.edition_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000308')
  end

  def self.volume_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000309')
  end

  def self.polymer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000314')
  end

  # A functional specification is a specification that describes the characteristics of an object.
  # (http://semanticscience.org/resource/SIO_000315)
  def self.functional_specification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000315')
  end

  # A design specification is a specification that provides precise and explicit information about the requirements for a product design.
  # (http://semanticscience.org/resource/SIO_000316)
  def self.design_specification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000316')
  end

  # A specification for spatial location is an effective specification towards representation spatial position or spatial data.
  # (http://semanticscience.org/resource/SIO_000317)
  def self.spatial_specification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000317')
  end

  # Longitude is a geographic position that refers to  the angle east or west of a reference meridian between the two geographical poles to another meridian that passes through an arbitrary point.
  # (http://semanticscience.org/resource/SIO_000318)
  def self.longitude
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000318')
  end

  # Latitude is a geographic coordinate which refers to the angle from a point on the Earth's surface to the equatorial plane
  # (http://semanticscience.org/resource/SIO_000319)
  def self.latitude
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000319')
  end

  # A coordinate system is a specification for spatial location that uses a set of numbers, or coordinates, to uniquely determine the position of a point or other geometric element.
  # (http://semanticscience.org/resource/SIO_000320)
  def self.coordinate_system
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000320')
  end

  # A Cartesian coordinate system specifies each point uniquely in a plane by a pair of numerical coordinates, which are the signed distances from the point to two fixed perpendicular directed lines, measured in the same unit of length.
  # (http://semanticscience.org/resource/SIO_000321)
  def self.cartesian_coordinate_system
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000321')
  end

  # A concept is term that refers to a generalization of a set of attributes or entities.
  # (http://semanticscience.org/resource/SIO_000326)
  def self.concept
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000326')
  end

  def self.polar_coordinate_system
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000327')
  end

  # a positional description is a description of location using some system or frame of reference.
  # (http://semanticscience.org/resource/SIO_000328)
  def self.positional_description
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000328')
  end

  def self.cylindrical_coordinate_system
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000329')
  end

  def self.spherical_coordinate_system
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000330')
  end

  def self.OWL_ontology
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000331')
  end

  # a 3D cartesian coordinate is a coordinate that is composed of an x,y and z coordinate.
  # (http://semanticscience.org/resource/SIO_000333)
  def self.a_D_cartesian_coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000333')
  end

  # an objective is a proposition that indicates a planned or anticipated outcome.
  # (http://semanticscience.org/resource/SIO_000337)
  def self.objective
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000337')
  end

  # A realizable entity is an attribute that is exhibited under some condition and is realized in some process.
  # (http://semanticscience.org/resource/SIO_000340)
  def self.realizable_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000340')
  end

  # a term variant is a term that is a variant of another term.
  # (http://semanticscience.org/resource/SIO_000342)
  def self.term_variant
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000342')
  end

  def self.to_modify
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000343')
  end

  # To record is the capability to register or collect information in a specified format on some physical medium.
  # (http://semanticscience.org/resource/SIO_000344)
  def self.to_record
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000344')
  end

  # To magnify is the capability to increase the appearance of the size of an object.
  # (http://semanticscience.org/resource/SIO_000345)
  def self.to_magnify
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000345')
  end

  # To heat is a capability to increase the internal kinetic energy of a material.
  # (http://semanticscience.org/resource/SIO_000346)
  def self.to_heat
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000346')
  end

  # To cool is the capability to decrease the internal kinetic energy of a material.
  # (http://semanticscience.org/resource/SIO_000347)
  def self.to_cool
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000347')
  end

  # To freeze is the capability to decrease the internal kinetic energy of a material such that it changes state from a gas or liquid to a solid.
  # (http://semanticscience.org/resource/SIO_000348)
  def self.to_freeze
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000348')
  end

  # To separate is the capability to i) distinguish some entities based on some attribute(s) and ii) subsequently physically displace them.
  # (http://semanticscience.org/resource/SIO_000349)
  def self.to_separate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000349')
  end

  # To ionize is the capability to physically convert an atom or molecule into an ion by adding or removing charged particles such as electrons or other ions.
  # (http://semanticscience.org/resource/SIO_000350)
  def self.to_ionize
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000350')
  end

  # To supply energy is the capability to transfer energy from a source to a sink.
  # (http://semanticscience.org/resource/SIO_000351)
  def self.to_supply_energy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000351')
  end

  # to observe is the capability to watch attentively.
  # (http://semanticscience.org/resource/SIO_000353)
  def self.to_observe
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000353')
  end

  # dysfunction is a capability to act in an abnormal or unintended manner.
  # (http://semanticscience.org/resource/SIO_000354)
  def self.dysfunction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000354')
  end

  def self.fitness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000357')
  end

  # intent is a desire to realize a particular outcome.
  # (http://semanticscience.org/resource/SIO_000358)
  def self.intent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000358')
  end

  def self.purpose
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000359')
  end

  # a belief is a proposition that is believed to be true.
  # (http://semanticscience.org/resource/SIO_000360)
  def self.belief
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000360')
  end

  # A number is a mathematical object used to count, label, and measure.
  # (http://semanticscience.org/resource/SIO_000366)
  def self.number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000366')
  end

  # a variable is a value that may change within the scope of a given problem or set of operations.
  # (http://semanticscience.org/resource/SIO_000367)
  def self.variable
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000367')
  end

  # An equation is a mathematical statement that asserts the equality of two expressions.
  # (http://semanticscience.org/resource/SIO_000368)
  def self.equation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000368')
  end

  # a spatial region is an object contained in some region of space.
  # (http://semanticscience.org/resource/SIO_000370)
  def self.spatial_region
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000370')
  end

  # To measure is the capability to obtain information about some entity by examining its attributes in relation to some reference metric.
  # (http://semanticscience.org/resource/SIO_000371)
  def self.to_measure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000371')
  end

  # To inject is the capability to administer a substance into some object through its external barrier.
  # (http://semanticscience.org/resource/SIO_000372)
  def self.to_inject
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000372')
  end

  # To boil is the capability to increase the internal kinetic energy of a material such that it changes state from a solid or liquid to a gas.
  # (http://semanticscience.org/resource/SIO_000373)
  def self.to_boil
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000373')
  end

  def self.to_reduce_energy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000374')
  end

  # To supply electricity is the capability to transfer electricity from a source to a sink.
  # (http://semanticscience.org/resource/SIO_000375)
  def self.to_supply_electricity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000375')
  end

  def self.to_change_materially
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000376')
  end

  # To demagnify is the capability to decrease the appearance of the size of an object.
  # (http://semanticscience.org/resource/SIO_000377)
  def self.to_demagnify
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000377')
  end

  def self.to_change_appearance
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000378')
  end

  # Perception is the organization, identification, and interpretation of sensory information in order to fabricate a mental representation through the process of transduction, which sensors in the body transform signals from the environment into encoded neural signals.
  # (http://semanticscience.org/resource/SIO_000379)
  def self.perception
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000379')
  end

  # To contain is the capability to bound or constrain a physical entity in some site.
  # (http://semanticscience.org/resource/SIO_000380)
  def self.to_contain
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000380')
  end

  # To immobilize is the capability to contain an entity in such a way that it may not move in space.
  # (http://semanticscience.org/resource/SIO_000381)
  def self.to_immobilize
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000381')
  end

  # To filter is the capability to retain certain entities based on selected attribute(s) while allowing other entities to pass through.
  # (http://semanticscience.org/resource/SIO_000382)
  def self.to_filter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000382')
  end

  # To excite is the capability to supply energy to a materila by bombarding it with energetic particles (e.g., photons).
  # (http://semanticscience.org/resource/SIO_000383)
  def self.to_excite
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000383')
  end

  # To emit is the capability to release some physical entity (light, pollution, etc).
  # (http://semanticscience.org/resource/SIO_000384)
  def self.to_emit
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000384')
  end

  def self.to_change_energetically
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000385')
  end

  # Ambiguous label.
  def self.to_oxidize
    return [ RDF::URI.new('http://semanticscience.org/resource/SIO_000386'), RDF::URI.new('http://semanticscience.org/resource/SIO_010358') ]
  end

  # Ambiguous label.
  def self.to_reduce
    return [ RDF::URI.new('http://semanticscience.org/resource/SIO_000387'), RDF::URI.new('http://semanticscience.org/resource/SIO_010359') ]
  end

  # to assemble is the capability to combine entities together into a larger object that persists in time.
  # (http://semanticscience.org/resource/SIO_000388)
  def self.to_assemble
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000388')
  end

  # To extract is the capability to remove certain entities based on selected attribute(s) while allowing other entities to remain.
  # (http://semanticscience.org/resource/SIO_000389)
  def self.to_extract
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000389')
  end

  # to transport is the capability to displace a material from one location to another.
  # (http://semanticscience.org/resource/SIO_000390)
  def self.to_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000390')
  end

  # time measurement is a measurement value of the duration of some interval of time or a particular instant of time (against some frame of reference).
  # (http://semanticscience.org/resource/SIO_000391)
  def self.time_measurement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000391')
  end

  # to change spatially is the capability to affect the physical movement of some entity.
  # (http://semanticscience.org/resource/SIO_000392)
  def self.to_change_spatially
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000392')
  end

  def self.patient
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000393')
  end

  def self.doctor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000394')
  end

  def self.to_regulate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000395')
  end

  def self.to_modulate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000395')
  end

  def self.file
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000396')
  end

  def self.to_provide
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000397')
  end

  def self.nurse
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000398')
  end

  def self.study_subject
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000399')
  end

  # an x cartesian coordinate is the coordinate of an object onto the x-axis of a cartesian coordinate system.
  # (http://semanticscience.org/resource/SIO_000400)
  def self.x_cartesian_coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000400')
  end

  # an y cartesian coordinate is the coordinate of an object onto the y-axis of a cartesian coordinate system.
  # (http://semanticscience.org/resource/SIO_000401)
  def self.y_cartesian_coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000401')
  end

  # a z cartesian coordinate is the coordinate of an object onto the z-axis of a cartesian coordinate system.
  # (http://semanticscience.org/resource/SIO_000402)
  def self.z_cartesian_coordinate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000402')
  end

  # a study group is a group of individuals that are subjects in an observational or intervention study.
  # (http://semanticscience.org/resource/SIO_000403)
  def self.study_group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000403')
  end

  def self.professor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000404')
  end

  def self.student
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000405')
  end

  def self.academic
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000406')
  end

  def self.to_increase_the_rate_of_formation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000407')
  end

  def self.to_investigate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000408')
  end

  # a mutual disposition is a disposition that simulataneously invokes another disposition when realized.
  # (http://semanticscience.org/resource/SIO_000409)
  def self.mutual_disposition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000409')
  end

  # anger is disgust directed toward an equal status individual.
  # (http://semanticscience.org/resource/SIO_000410)
  def self.anger
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000410')
  end

  # Hate is a deep and emotional extreme dislike, directed against a certain object or class of objects. 
  # (http://semanticscience.org/resource/SIO_000411)
  def self.hate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000411')
  end

  # Love is an emotion of a strong affection and personal attachment.
  # (http://semanticscience.org/resource/SIO_000412)
  def self.love
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000412')
  end

  # A geolegal region is a geographic region which has causal powers confered by a legal entity.
  # (http://semanticscience.org/resource/SIO_000413)
  def self.geolegal_region
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000413')
  end

  # a geographic region is a spatial region whose boundaries are typically defined against some material frame of reference (like the earth).
  # (http://semanticscience.org/resource/SIO_000414)
  def self.geographic_region
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000414')
  end

  def self.geopolitical_region
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000415')
  end

  # a time internval is a contiguous temporal region having some duration.
  # (http://semanticscience.org/resource/SIO_000417)
  def self.time_interval
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000417')
  end

  # a time instant is a temporal region which occurs instantaneously e.g. having no duration.
  # (http://semanticscience.org/resource/SIO_000418)
  def self.time_instant
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000418')
  end

  # A table is a figure that consists of an ordered arrangement of columns and rows.
  # (http://semanticscience.org/resource/SIO_000419)
  def self.table
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000419')
  end

  # A scatterplot is a statistical graph which uses Cartesian coordinates to display values for two variables for a set of data. The data is displayed as a collection of points, each having the value of one variable determining the position on the horizontal axis and the value of the other variable determining the position on the vertical axis.
  # (http://semanticscience.org/resource/SIO_000423)
  def self.scatterplot
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000423')
  end

  # A scatterplot is a statistical graph which uses Cartesian coordinates to display values for two variables for a set of data. The data is displayed as a collection of points, each having the value of one variable determining the position on the horizontal axis and the value of the other variable determining the position on the vertical axis.
  # (http://semanticscience.org/resource/SIO_000423)
  def self.scatter_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000423')
  end

  def self.year
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000428')
  end

  def self.month
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000429')
  end

  def self.day
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000430')
  end

  def self.century
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000431')
  end

  def self.millenium
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000432')
  end

  def self.hour
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000433')
  end

  def self.minute
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000434')
  end

  def self.second
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000435')
  end

  # an informational quality is a quality that pertains to information.
  # (http://semanticscience.org/resource/SIO_000436)
  def self.informational_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000436')
  end

  # a 2D cartesian point is a point whose position is specified along two  dimensions using Cartesian coordinates.
  # (http://semanticscience.org/resource/SIO_000437)
  def self.a_D_cartesian_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000437')
  end

  def self.altitude
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000438')
  end

  # the center of mass (aka barycenter) is the weighted average location of all the mass in a body or group of bodies.
  # (http://semanticscience.org/resource/SIO_000439)
  def self.center_of_mass
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000439')
  end

  # A line graph is a statistical graph in which lines contains the evaluation of functions or individual points connected by line segments.
  # (http://semanticscience.org/resource/SIO_000442)
  def self.line_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000442')
  end

  # A line graph is a statistical graph in which lines contains the evaluation of functions or individual points connected by line segments.
  # (http://semanticscience.org/resource/SIO_000442)
  def self.line_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000442')
  end

  # A bar graph is a statistical graph with rectangular bars of lengths proportional to that value that they represent.
  # (http://semanticscience.org/resource/SIO_000443)
  def self.bar_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000443')
  end

  # A horizontal bar graph is a bar graph in which the rectangular bars 
  # are horizontally oriented in space.
  # (http://semanticscience.org/resource/SIO_000444)
  def self.horizontal_bar_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000444')
  end

  # A vertical bar graph is a bar graph in which the rectangular bars are 
  # vertically oriented in space.
  # (http://semanticscience.org/resource/SIO_000445)
  def self.vertical_bar_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000445')
  end

  # A stacked bar graph is a bar graph in which each rectangular bar is 
  # partioned by the categorical value of each series of data.
  # (http://semanticscience.org/resource/SIO_000446)
  def self.stacked_bar_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000446')
  end

  # A line-bar graph statistical graph that contains both lines and bars.
  # (http://semanticscience.org/resource/SIO_000447)
  def self.line_bar_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000447')
  end

  def self.figure_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000448')
  end

  # A plot is a part of a figure that corresponds to the spatial region between the set of axes.
  # (http://semanticscience.org/resource/SIO_000449)
  def self.plot
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000449')
  end

  # An axis is a line segment that is part of a statistical graph in which the 
  # position along the line corresponds to a numeric or categorical value.
  # (http://semanticscience.org/resource/SIO_000450)
  def self.axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000450')
  end

  # A Cartesian coordinate axis is an axis whose behavior follows that of a Cartesian coordinate system.
  # (http://semanticscience.org/resource/SIO_000451)
  def self.Cartesian_coordinate_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000451')
  end

  # An x-axis is a Cartesian coordinate axis that is aligned with the horizon.
  # (http://semanticscience.org/resource/SIO_000452)
  def self.x_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000452')
  end

  # An x-axis is a Cartesian coordinate axis that is aligned with the horizon.
  # (http://semanticscience.org/resource/SIO_000452)
  def self.horizontal_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000452')
  end

  # A y-axis is a Cartesian coordinate axis that is spatially oriented 
  # perpendicular to the x-axis.
  # (http://semanticscience.org/resource/SIO_000453)
  def self.y_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000453')
  end

  # A y-axis is a Cartesian coordinate axis that is spatially oriented 
  # perpendicular to the x-axis.
  # (http://semanticscience.org/resource/SIO_000453)
  def self.vertical_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000453')
  end

  # A z-axis is a Cartesian coordinate axis that is spatially oriented 
  # normal to the plane formed by the x- and y-axes.
  # (http://semanticscience.org/resource/SIO_000454)
  def self.z_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000454')
  end

  # A category axis is an axis in which the position along the line is 
  # partioned into categories.
  # (http://semanticscience.org/resource/SIO_000455)
  def self.category_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000455')
  end

  # A primary category axis is a category axis that either defines the sole value range or holds the larger set of categorical values specified by the secondary category axis.
  # (http://semanticscience.org/resource/SIO_000456)
  def self.primary_category_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000456')
  end

  # A secondary category axis is a category axis that defines a finer 
  # granular part (or subset) of the value range of the primary category axis.
  # (http://semanticscience.org/resource/SIO_000457)
  def self.secondary_category_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000457')
  end

  # A value axis is an axis in which the position along the line is 
  # partioned into numeric values.
  # (http://semanticscience.org/resource/SIO_000458)
  def self.value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000458')
  end

  # A left value axis is a value axis that is spatially positioned to the left of the plot area.
  # (http://semanticscience.org/resource/SIO_000459)
  def self.left_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000459')
  end

  # A right value axis is a value axis that is spatially positioned to the right of the plot area.
  # (http://semanticscience.org/resource/SIO_000460)
  def self.right_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000460')
  end

  # A scaled value axis is a value axis in which the value range was subject to a mathematic transformation.
  # (http://semanticscience.org/resource/SIO_000461)
  def self.scaled_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000461')
  end

  # A linear value axis is a value axis that corresponds to a scaling factor of 1 of the value range.
  # (http://semanticscience.org/resource/SIO_000462)
  def self.linear_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000462')
  end

  # A logarithmic value axis is a scaled value axis that corresponds to a scaling factor of the logarithm of the value range.
  # (http://semanticscience.org/resource/SIO_000463)
  def self.logarithmic_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000463')
  end

  # A data series is a data set composed of related values displayed in a statistical graph.
  # (http://semanticscience.org/resource/SIO_000464)
  def self.data_series
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000464')
  end

  # A data point is a point that which corresponds to the projection of the values of measurement data against the axes of a statistical graph.
  # (http://semanticscience.org/resource/SIO_000465)
  def self.data_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000465')
  end

  # A global maximum stationary point is a data point that corresponds to a measurement value is larger than that of all other plotted datapoints.
  # (http://semanticscience.org/resource/SIO_000466)
  def self.global_maximal_stationary_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000466')
  end

  # A global minimum data point is a data point that corresponds to a measurement value is smaller than that of all other plotted datapoints.
  # (http://semanticscience.org/resource/SIO_000467)
  def self.global_minimal_stationary_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000467')
  end

  # A legend is a part of a figure that associates textual descriptions with symbols pertaining to plotted entities.
  # (http://semanticscience.org/resource/SIO_000468)
  def self.legend
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000468')
  end

  # A graph title is a title that describes a graph.
  # (http://semanticscience.org/resource/SIO_000469)
  def self.graph_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000469')
  end

  # A primary title is a title that should be first used in describing some entity.
  # (http://semanticscience.org/resource/SIO_000470)
  def self.primary_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000470')
  end

  # A secondary title is a title of lesser importance that should be used after the first title in describing some entity.
  # (http://semanticscience.org/resource/SIO_000471)
  def self.secondary_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000471')
  end

  # A secondary title is a title of lesser importance that should be used after the first title in describing some entity.
  # (http://semanticscience.org/resource/SIO_000471)
  def self.subtitle_alternative_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000471')
  end

  def self.scientific_data
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000472')
  end

  # A primary graph title is a primary title that describes a statistical 
  # graph.
  # (http://semanticscience.org/resource/SIO_000473)
  def self.primary_graph_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000473')
  end

  # A secondary graph title is a secondary title that describes a statistical graph.
  # (http://semanticscience.org/resource/SIO_000474)
  def self.secondary_graph_title
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000474')
  end

  # a biological quality is a quality held by a biological entity.
  # (http://semanticscience.org/resource/SIO_000475)
  def self.biological_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000475')
  end

  # cellular quality is the quality of a cell
  # (http://semanticscience.org/resource/SIO_000476)
  def self.cellular_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000476')
  end

  def self.sequence_variant_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000478')
  end

  # a variant role is a comparative role in which the value of an attribute differs when compared to another entity
  # (http://semanticscience.org/resource/SIO_000479)
  def self.variant_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000479')
  end

  def self.insertion_variant_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000480')
  end

  def self.deletion_variant_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000481')
  end

  # A phrase is a group of words functioning as a single unit in the syntax of a sentence.
  # (http://semanticscience.org/resource/SIO_000483)
  def self.phrase
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000483')
  end

  def self.human
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000485')
  end

  def self.mouse
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000486')
  end

  def self.rat
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000487')
  end

  def self.worm
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000488')
  end

  def self.e_coli
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000489')
  end

  def self.to_consume
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000492')
  end

  # A clause consists of a subject and a predicate.
  # (http://semanticscience.org/resource/SIO_000493)
  def self.clause
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000493')
  end

  # to actively interact with is the capability to interact with another entity in a way that requires physical contact.
  # (http://semanticscience.org/resource/SIO_000494)
  def self.to_actively_interact_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000494')
  end

  def self.person
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000498')
  end

  def self.to_decrease_the_rate_of_formation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000499')
  end

  # A polygon vertex is a terminal point at which two polygon edges meet and are part of a polygon.
  # (http://semanticscience.org/resource/SIO_000500)
  def self.polygon_vertex
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000500')
  end

  # A polygon edge is a line segment joining two polygon vertices.
  # (http://semanticscience.org/resource/SIO_000501)
  def self.polygon_edge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000501')
  end

  # A polyhedral skeleton is a collection of polygon edges.
  # (http://semanticscience.org/resource/SIO_000502)
  def self.polyhedral_skeleton
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000502')
  end

  # A polygonal face is a polygon bounded by a circuit of polygon edges, and includes the flat (plane) region inside the boundary.
  # (http://semanticscience.org/resource/SIO_000503)
  def self.polygonal_face
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000503')
  end

  # A polyhedral surface is composed of polygonal faces.
  # (http://semanticscience.org/resource/SIO_000504)
  def self.polyhedral_surface
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000504')
  end

  # A polygon is a planar entity that is bounded by a closed path or circuit, composed of a finite connected sequence3 of straight line segments.
  # (http://semanticscience.org/resource/SIO_000505)
  def self.polygon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000505')
  end

  def self.geometric_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000506')
  end

  # A point is a geometric entity that is located in a zero-dimensional spatial region and whose position is defined by its coordinates in some coordinate system.
  # (http://semanticscience.org/resource/SIO_000507)
  def self.point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000507')
  end

  # An endpoint is a terminal point that is the last of an ordered 
  # pair of points.
  # (http://semanticscience.org/resource/SIO_000508)
  def self.endpoint
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000508')
  end

  # A start point is a terminal point which is the first of an ordered 
  # pair of points.
  # (http://semanticscience.org/resource/SIO_000509)
  def self.start_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000509')
  end

  # A model is a representation of some thing.
  # (http://semanticscience.org/resource/SIO_000510)
  def self.model
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000510')
  end

  # A line is curve that extends in a single dimension (e.g. straight line; exhibits no curvature), and is composed of at least two fully connected points.
  # (http://semanticscience.org/resource/SIO_000511)
  def self.line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000511')
  end

  # A line segment is a line and a part of a curve that is (inclusively) bounded by two terminal points.
  # (http://semanticscience.org/resource/SIO_000512)
  def self.line_segment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000512')
  end

  # A tick mark is a line segment that is spatially positioned perpendicular to the axis of a statistical graph and indicates the position of a specific numeric value (which may be indicated by an adjacent value label) on a value axis, or is one of a pair of tick marks that delineates the boundary of a categorical value (which may be indicated by an adjacent category label) on the categorical axis.
  # (http://semanticscience.org/resource/SIO_000513)
  def self.tick_mark
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000513')
  end

  # A major tick mark is a tick mark that indicates the position of a 
  # specific numeric value and is adjacent to its value label on the value 
  # axis, or is one of a pair of tick marks that delineates the boundary of a 
  # categorical value indicated by an adjacent category label on the 
  # categorical axis.
  # (http://semanticscience.org/resource/SIO_000514)
  def self.major_tick_mark
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000514')
  end

  # A minor tick mark is a tick mark that indicates the position of a specific numeric value but has no adjacent value label, or is one of a pair of tick marks that delineates the boundary of a categorical value but has no adjacent category label on the categorical axis.
  # (http://semanticscience.org/resource/SIO_000515)
  def self.minor_tick_mark
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000515')
  end

  # A ray is a line which that is bounded by a startpoint and extends outwards infinitely along one dimension.
  # (http://semanticscience.org/resource/SIO_000516)
  def self.ray
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000516')
  end

  # A quadrilateral is a polygon with composed of four points and four line segments, in which each point is fully connected to two other points.
  # (http://semanticscience.org/resource/SIO_000517)
  def self.quadrilateral
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000517')
  end

  # A rectangle is a quadrilateral in which one pair of line segments are  parallel and the other pair are perpendicular to the first pair.
  # (http://semanticscience.org/resource/SIO_000518)
  def self.rectangle
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000518')
  end

  # A bar is a rectangle that is located in the plot of a statistical graph in which its length is proportional to the values that it represents.
  # (http://semanticscience.org/resource/SIO_000519)
  def self.bar
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000519')
  end

  # A triangle is a polygon composed of three points and three line segments, in which each point is fully connected to another point along through the line segment.
  # (http://semanticscience.org/resource/SIO_000520)
  def self.triangle
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000520')
  end

  # A directed line segment is a line segment that is contained by an ordered pair 
  # of endpoints (a start point and an endpoint).
  # (http://semanticscience.org/resource/SIO_000521)
  def self.directed_line_segment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000521')
  end

  # An arrowed line is a directed line segment in which one or both endpoints is tangentially part of a triangle that bisects the line.
  # (http://semanticscience.org/resource/SIO_000522)
  def self.arrowed_line_segment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000522')
  end

  # A single arrowed line is directed line in which the endpoint is tangentially part of a triangle that bisects the line.
  # (http://semanticscience.org/resource/SIO_000523)
  def self.single_arrowed_line_segment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000523')
  end

  # A double arrowed line is an arrowed line in which both terminal points are  tangentially part of different triangles that bisect the line.
  # (http://semanticscience.org/resource/SIO_000524)
  def self.double_arrowed_line_segment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000524')
  end

  # A vertical line is a line that is positionally oriented with the horizon.
  # (http://semanticscience.org/resource/SIO_000525)
  def self.horizontal_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000525')
  end

  # A vertical line is a line that is positionally oriented perpendicular to the horizon.
  # (http://semanticscience.org/resource/SIO_000526)
  def self.vertical_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000526')
  end

  # A trend line is a line, line segment or ray that is part of a statistical graph which indicates a statistical or visual direction across categorical or value data.
  # (http://semanticscience.org/resource/SIO_000527)
  def self.trend_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000527')
  end

  # An increasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is positive.
  # (http://semanticscience.org/resource/SIO_000528)
  def self.increasing_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000528')
  end

  # An decreasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is negative.
  # (http://semanticscience.org/resource/SIO_000529)
  def self.decreasing_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000529')
  end

  # An plateau line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is zero.
  # (http://semanticscience.org/resource/SIO_000530)
  def self.plateau_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000530')
  end

  # A drop line is a statistical graph line that vertically or horizontally connects a data series line with a value axis in a statistical graph.
  # (http://semanticscience.org/resource/SIO_000531)
  def self.drop_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000531')
  end

  # A terminal point is a point that defines the finite extension of a line.
  # (http://semanticscience.org/resource/SIO_000532)
  def self.terminal_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000532')
  end

  # A surface normal is a vector that is perpendicular to a flat surface.
  # (http://semanticscience.org/resource/SIO_000533)
  def self.surface_normal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000533')
  end

  def self.positionally_oriented_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000534')
  end

  # A statistical graph line is a line used in a statistical graph to communicate some trend or feature of the embedded data.
  # (http://semanticscience.org/resource/SIO_000535)
  def self.statistical_graph_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000535')
  end

  def self.to_regulate_the_rate_of_formation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000536')
  end

  # curvature is a quality of a bearer that relates to the presence of curves, bends, or angles.
  # (http://semanticscience.org/resource/SIO_000537)
  def self.curvature
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000537')
  end

  # shape is a quality of a bearer that is free of curves, bends, or angles.
  # (http://semanticscience.org/resource/SIO_000538)
  def self.straight
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000538')
  end

  # An infinite line is a line that extends outwards in both directions of a single dimensional and is not bounded by terminal points.
  # (http://semanticscience.org/resource/SIO_000539)
  def self.infinite_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000539')
  end

  # A ray is a line which that is bounded by a startpoint and extends outwards along one dimension.
  # (http://semanticscience.org/resource/SIO_000540)
  def self.vector
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000540')
  end

  # A vertext normal is the normalized average of the surface normals of the faces that contain that vertex.
  # (http://semanticscience.org/resource/SIO_000541)
  def self.vertex_normal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000541')
  end

  def self.to_serve_as
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000542')
  end

  def self.to_serve_as_a_host
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000543')
  end

  def self.to_infect
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000544')
  end

  # A polyline is a connected sequence of line segments.
  # (http://semanticscience.org/resource/SIO_000545)
  def self.polyline
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000545')
  end

  # A polyline is a connected sequence of line segments.
  # (http://semanticscience.org/resource/SIO_000545)
  def self.polygonal_chain_polygonal_curve_polygonal_path_piecewise_linear_curve
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000545')
  end

  def self.collection_of_points
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000546')
  end

  def self.to_cause_disease
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000547')
  end

  def self.to_reduce_the_activation_energy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000549')
  end

  def self.to_activate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000549')
  end

  def self.to_increase_the_activation_energy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000550')
  end

  def self.to_inhibit
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000550')
  end

  def self.to_change_the_activation_energy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000551')
  end

  # A quality that has a value that is normal or average.
  # (http://semanticscience.org/resource/SIO_000554)
  def self.normal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000554')
  end

  # A quality that has a value that is outside normal or average.
  # (http://semanticscience.org/resource/SIO_000555)
  def self.abnormal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000555')
  end

  def self.lipid_residue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000556')
  end

  # Chemical synthesis is synthesis of a chemical entity from physical precursors through one or more chemical interactions or reactions.
  # (http://semanticscience.org/resource/SIO_000559)
  def self.chemical_synthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000559')
  end

  # a molecular orbital (or MO) is a mathematical function describing the wave-like behavior of an electron in a molecule
  # (http://semanticscience.org/resource/SIO_000561)
  def self.molecular_orbitral
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000561')
  end

  # Passive transport is the movement of a substance across a membrane and does not require chemical energy.
  # (http://semanticscience.org/resource/SIO_000562)
  def self.passive_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000562')
  end

  # Diffusion is motion of particles at temperatures above absolute zero.
  # (http://semanticscience.org/resource/SIO_000564)
  def self.diffusion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000564')
  end

  # A diffusion equation describes density fluctuations in a material undergoing diffusion.
  # (http://semanticscience.org/resource/SIO_000565)
  def self.diffusion_equation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000565')
  end

  # a movement equation describes the displacement of an object in space over time.
  # (http://semanticscience.org/resource/SIO_000566)
  def self.movement_equation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000566')
  end

  # An ordinary differential equation (ODE) is a differential equation in which the unknown function (also known as the dependent variable) is a function of a single independent variable.
  # (http://semanticscience.org/resource/SIO_000567)
  def self.ordinary_differential_equation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000567')
  end

  # A partial differential equation (PDE) is a differential equation in which the unknown function is a function of multiple independent variables and the equation involves its partial derivatives.
  # (http://semanticscience.org/resource/SIO_000568)
  def self.partial_differential_equation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000568')
  end

  # A differential equation is a mathematical equation for an unknown function of one or several variables that relates the values of the function itself and its derivatives of various orders.
  # (http://semanticscience.org/resource/SIO_000569)
  def self.differential_equation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000569')
  end

  # Movement is the process in which an object is spatially displaced.
  # (http://semanticscience.org/resource/SIO_000570)
  def self.movement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000570')
  end

  # Brownian motion is the seemlingly random movement of particles suspended in a fluid.
  # (http://semanticscience.org/resource/SIO_000571)
  def self.brownian_motion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000571')
  end

  # Osmosis is the movement of water molecules through a selectively-permeable membrane down a water potential gradient.
  # (http://semanticscience.org/resource/SIO_000572)
  def self.osmosis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000572')
  end

  def self.passive_movement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000573')
  end

  # Active movement is the process in which an object is spatially displaced using some chemical energy.
  # (http://semanticscience.org/resource/SIO_000574)
  def self.active_movement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000574')
  end

  # Transport is an interaction that realizes the role a transporter and a cargo and results in the movement of at least the cargo.
  # (http://semanticscience.org/resource/SIO_000575)
  def self.transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000575')
  end

  # membrane transport is the movement of molecules across a membrane.
  # (http://semanticscience.org/resource/SIO_000576)
  def self.membrane_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000576')
  end

  # Primary active transport, also called direct active transport, directly uses energy to transport molecules across a membrane.
  # (http://semanticscience.org/resource/SIO_000577)
  def self.primary_active_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000577')
  end

  # secondary active transport or co-transport uses electrochemical potential difference created by pumping ions out of the cell to transport molecules across a membrane.
  # (http://semanticscience.org/resource/SIO_000578)
  def self.secondary_active_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000578')
  end

  def self.symport_enabled_secondary_active_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000579')
  end

  def self.antiport_enabled_secondary_active_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000580')
  end

  # The self-propelled movement of an object.
  # (http://semanticscience.org/resource/SIO_000581)
  def self.locomotion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000581')
  end

  # Birth is the process by which a biological organism is brought into existence.
  # (http://semanticscience.org/resource/SIO_000582)
  def self.birth
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000582')
  end

  # Death is a process in which a biological entity ceases to exist.
  # (http://semanticscience.org/resource/SIO_000583)
  def self.death
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000583')
  end

  # An idea is a proposition about some object of conceptual thought.
  # (http://semanticscience.org/resource/SIO_000585)
  def self.idea
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000585')
  end

  # Biological reproduction is the biological process by which one or more biological organisms are produced from their "parents". 
  # (http://semanticscience.org/resource/SIO_000587)
  def self.biological_reproduction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000587')
  end

  # creation is a process in which an entity comes into existence.
  # (http://semanticscience.org/resource/SIO_000588)
  def self.creation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000588')
  end

  # creation is a process in which an entity comes into existence.
  # (http://semanticscience.org/resource/SIO_000588)
  def self.production
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000588')
  end

  # regulation is the imposition of a requirement or action of one party to another.
  # (http://semanticscience.org/resource/SIO_000589)
  def self.regulation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000589')
  end

  # Biosynthesis is the synthesis of an organic compound in a living organism, usually aided by enzymes.
  # (http://semanticscience.org/resource/SIO_000590)
  def self.biosynthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000590')
  end

  # destruction is a process in which something is broken down and/or ceases to exist.
  # (http://semanticscience.org/resource/SIO_000591)
  def self.destruction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000591')
  end

  # Chemical destruction is destruction of a chemical entity to its chemical constituents through one ormore chemical interactions or reactions.
  # (http://semanticscience.org/resource/SIO_000592)
  def self.chemical_destruction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000592')
  end

  # an interaction is a process that involves two or more entities and the realization of at least two dispositions to interact.
  # (http://semanticscience.org/resource/SIO_000593)
  def self.interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000593')
  end

  # data transformation is the process of applying an algorithmic procedure to some input data and producing some output data.
  # (http://semanticscience.org/resource/SIO_000594)
  def self.data_transformation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000594')
  end

  def self.parameterized_data_transformation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000595')
  end

  # a data storage device is a device that is capable of storing information.
  # (http://semanticscience.org/resource/SIO_000596)
  def self.data_storage_device
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000596')
  end

  # A solid-state drive (SSD) is a data storage device that uses solid-state memory to store persistent data
  # (http://semanticscience.org/resource/SIO_000597)
  def self.solid_state_hard_drive
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000597')
  end

  # A hard disk drive (HDD) is a non-volatile, random access device for digital data. It features rotating rigid platters on a motor-driven spindle within a protective enclosure. Data is magnetically read and written on the platter by read/write heads that float on a film of air above the platters.
  # (http://semanticscience.org/resource/SIO_000598)
  def self.hard_disk_drive
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000598')
  end

  def self.structure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000600')
  end

  # a computational entity is an information content entity operated on using some computational system.
  # (http://semanticscience.org/resource/SIO_000602)
  def self.computational_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000602')
  end

  def self.sound_wave
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000605')
  end

  # A curve is a geometric entity that may be located in n-dimensional spatial region whose extension may be n-dimensional,  is composed of at least two fully connected points and does not intersect itself.
  # (http://semanticscience.org/resource/SIO_000608)
  def self.curve
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000608')
  end

  def self.regulation_of_process
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000609')
  end

  def self.regulation_of_capability
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000610')
  end

  def self.regulation_of_catalytic_capability
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000611')
  end

  # A representation is a entity that in some way represents another entity (or attribute thereof).
  # (http://semanticscience.org/resource/SIO_000612)
  def self.representation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000612')
  end

  # A ordinal position is a number that designates the position of an entity from the first entity in an ordered sequence of entities.
  # (http://semanticscience.org/resource/SIO_000613)
  def self.ordinal_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000613')
  end

  # A ordinal position is a number that designates the position of an entity from the first entity in an ordered sequence of entities.
  # (http://semanticscience.org/resource/SIO_000613)
  def self.offset
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000613')
  end

  # an attribute is a characteristic of some entity.
  # (http://semanticscience.org/resource/SIO_000614)
  def self.attribute
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000614')
  end

  # A collection is a set for which there exists at least one member, although any member need not to exist at any point in the collection's existence.
  # (http://semanticscience.org/resource/SIO_000616)
  def self.collection
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000616')
  end

  # An empty set is a set for which there are exactly 0 members.
  # (http://semanticscience.org/resource/SIO_000617)
  def self.empty_set
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000617')
  end

  # a standard is a socially-agreed upon specification.
  # (http://semanticscience.org/resource/SIO_000618)
  def self.standard
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000618')
  end

  # A regulatory authority is an organization responsible for  exercising regulatory or supervisory capacity in some area of human activity.
  # (http://semanticscience.org/resource/SIO_000619)
  def self.regulatory_authority
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000619')
  end

  # A collective is a group of entities that share or are motivated by at least one common issue or interest, or work together on a specific project(s) to achieve a common objective.
  # (http://semanticscience.org/resource/SIO_000620)
  def self.collective
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000620')
  end

  # A collective is a group of entities that share or are motivated by at least one common issue or interest, or work together on a specific project(s) to achieve a common objective.
  # (http://semanticscience.org/resource/SIO_000620)
  def self.group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000620')
  end

  # A formal specification is a mathematical description of software or hardware that may be used to develop an implementation.
  # (http://semanticscience.org/resource/SIO_000621)
  def self.formal_specification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000621')
  end

  def self.RDFS_ontology
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000622')
  end

  def self.OBO_ontology
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000623')
  end

  def self.chemical_functional_group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000624')
  end

  # Chemical structure is the quality of molecular geometry and electronic structure.
  # (http://semanticscience.org/resource/SIO_000625)
  def self.chemical_structure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000625')
  end

  def self.molecular_structure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000626')
  end

  # Molecular geometry is the spatial arrangement of atoms in a molecule and the chemical bonds that hold the atoms together.
  # (http://semanticscience.org/resource/SIO_000627)
  def self.molecular_geometry
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000627')
  end

  # a probability measure is quantity of how likely it is that some event will occur.
  # (http://semanticscience.org/resource/SIO_000638)
  def self.probability_measure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000638')
  end

  # to passively interact with is the capability to interact with another entity in a way that does not require physical contact.
  # (http://semanticscience.org/resource/SIO_000639)
  def self.to_passively_interact_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000639')
  end

  # A quality that has a value that is increased compared to normal or average.
  # (http://semanticscience.org/resource/SIO_000640)
  def self.increased
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000640')
  end

  def self.process_model
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000647')
  end

  def self.physical_model
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000648')
  end

  def self.information_processing_procedure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000649')
  end

  # A wave is a physical entity that travels through space and time, consist of oscillations or vibrations and may be accompanied by the transfer of energy.
  # (http://semanticscience.org/resource/SIO_000650)
  def self.wave
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000650')
  end

  # A textual entity is language entity that is manifested as one or more distinct characters.
  # (http://semanticscience.org/resource/SIO_000651)
  def self.textual_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000651')
  end

  def self.version_label
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000653')
  end

  def self.a_version_label_is_a_label_for_a_particular_form_or_variation_of_an_earlier_or_original_type
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000653')
  end

  def self.software_version_label
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000654')
  end

  def self.a_software_version_label_is_a_version_label_for_a_piece_of_software
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000654')
  end

  # a hole is a site that is opening into or through something.
  # (http://semanticscience.org/resource/SIO_000660)
  def self.hole
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000660')
  end

  def self.province
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000661')
  end

  def self.state
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000662')
  end

  def self.territory
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000663')
  end

  def self.country
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000664')
  end

  def self.city
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000665')
  end

  def self.township
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000666')
  end

  # software execution is the process of executing software on a computing device.
  # (http://semanticscience.org/resource/SIO_000667)
  def self.sofware_execution
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000667')
  end

  def self.start_time
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000669')
  end

  def self.end_time
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000670')
  end

  # a unique identifier is an identifier that uniquely identifies some thing.
  # (http://semanticscience.org/resource/SIO_000675)
  def self.unique_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000675')
  end

  def self.social_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000676')
  end

  # a processual role is a role that can only be realized in a process.
  # (http://semanticscience.org/resource/SIO_000677)
  def self.processual_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000677')
  end

  # an abstract role is a role whose basis lies in spatial/temporal or comparative relations. 
  # (http://semanticscience.org/resource/SIO_000678)
  def self.abstract_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000678')
  end

  # A justification is a proposition that defends, explains or excuses some argument.
  # (http://semanticscience.org/resource/SIO_000683)
  def self.justification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000683')
  end

  def self.department
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000686')
  end

  def self.institute
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000688')
  end

  # to be a part of is the capability to be assembled into a larger structure that persists in time.
  # (http://semanticscience.org/resource/SIO_000689)
  def self.to_be_part_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000689')
  end

  # To associate is the capability to physically interact with another object.
  # (http://semanticscience.org/resource/SIO_000690)
  def self.to_associate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000690')
  end

  def self.to_be_part_of_a_group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000691')
  end

  def self.to_be_actively_interacted_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000692')
  end

  # A corporation is an organization that is granted a charter recognizing it as a separate legal entity.
  # (http://semanticscience.org/resource/SIO_000693)
  def self.corporation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000693')
  end

  def self.to_be_passively_interacted_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000694')
  end

  def self.to_be_recorded
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000695')
  end

  def self.to_be_observed
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000696')
  end

  # to disassemble is to physically separate the parts of an object.
  # (http://semanticscience.org/resource/SIO_000698)
  def self.to_disassemble
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000698')
  end

  # to disassociate is to cease or break association with some thing.
  # (http://semanticscience.org/resource/SIO_000700)
  def self.to_disassociate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000700')
  end

  # to interact with is a capabililty that involves another object.
  # (http://semanticscience.org/resource/SIO_000701)
  def self.to_interact_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000701')
  end

  # to be interacted with is the capability of an object to be physically touched or perturbed.
  # (http://semanticscience.org/resource/SIO_000702)
  def self.to_be_interacted_with
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000702')
  end

  # Evolution is the process that elicits change across successive generations in the inherited characteristics of biological populations.
  # (http://semanticscience.org/resource/SIO_000703)
  def self.evolution
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000703')
  end

  # a positional role is an abstract role which holds by comparing position to another object of reference.
  # (http://semanticscience.org/resource/SIO_000704)
  def self.positional_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000704')
  end

  # a specification of an object, manifested by an agent, intended to accomplish goals, in a particular environment, using a set of primitive components, satisfying a set of requirements, subject to constraints.
  # (http://semanticscience.org/resource/SIO_000705)
  def self.design
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000705')
  end

  def self.occupational_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000706')
  end

  def self.student_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000707')
  end

  def self.professor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000708')
  end

  def self.academic_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000711')
  end

  def self.medical_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000712')
  end

  def self.doctor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000713')
  end

  def self.nurse_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000714')
  end

  def self.patient_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000715')
  end

  def self.medical_practitioner
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000716')
  end

  def self.dentist_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000717')
  end

  # to translocate is the capability to displace oneself from one location to another.
  # (http://semanticscience.org/resource/SIO_000719)
  def self.to_translocate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000719')
  end

  # to translocate is the capability to displace oneself from one location to another.
  # (http://semanticscience.org/resource/SIO_000719)
  def self.to_move
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000719')
  end

  # to be translocated is the capability to be physically displaced from one location to another
  # (http://semanticscience.org/resource/SIO_000720)
  def self.to_be_translocated
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000720')
  end

  # to be translocated is the capability to be physically displaced from one location to another
  # (http://semanticscience.org/resource/SIO_000720)
  def self.to_be_moved
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000720')
  end

  # a comparative role is an abstract role which holds by comparing some attribute of another object of reference.
  # (http://semanticscience.org/resource/SIO_000721)
  def self.comparative_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000721')
  end

  def self.to_be_compared
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000722')
  end

  # to compare is the capability to examine in order to note the similarities or differences among a set of objects.
  # (http://semanticscience.org/resource/SIO_000723)
  def self.to_compare
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000723')
  end

  # to examine is the capability to make detailed observation. 
  # (http://semanticscience.org/resource/SIO_000724)
  def self.to_examine
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000724')
  end

  def self.to_be_examined
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000725')
  end

  def self.administrative_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000726')
  end

  def self.secretary_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000727')
  end

  def self.chemical_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000728')
  end

  # a record identifier is an identifier for a database entry.
  # (http://semanticscience.org/resource/SIO_000729)
  def self.record_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000729')
  end

  def self.physical_entity_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000730')
  end

  def self.informational_entity_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000731')
  end

  def self.molecular_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000732')
  end

  # Planning is the agentive process of developing a plan that specifies a set of actions in order to meet a set of goals or objectives.
  # (http://semanticscience.org/resource/SIO_000739)
  def self.planning
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000739')
  end

  # a curve segment is a part of a curve that consists of at least three points.
  # (http://semanticscience.org/resource/SIO_000740)
  def self.curve_segment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000740')
  end

  # a stationary point is a point that is part of a curve in which the derivative at that point is zero, and hence its value is at least a local maximum or minimum.
  # (http://semanticscience.org/resource/SIO_000741)
  def self.stationary_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000741')
  end

  def self.local_maximum_stationary_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000742')
  end

  def self.local_minimum_stationary_point
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000743')
  end

  # learning is the agentive process of acquiring knowledge.
  # (http://semanticscience.org/resource/SIO_000744)
  def self.learning
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000744')
  end

  # comparison is the process of examining a set of objects and determining their equality or inequality based on one or more features.
  # (http://semanticscience.org/resource/SIO_000745)
  def self.comparison
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000745')
  end

  # reasoning is the agentive process of using knowledge to evaluate the truth value of a proposition.
  # (http://semanticscience.org/resource/SIO_000746)
  def self.reasoning
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000746')
  end

  # investigation is the process of carrying out a plan or procedure so as to discover facts or information about the object of study.
  # (http://semanticscience.org/resource/SIO_000747)
  def self.investigation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000747')
  end

  # Either:
  #   investigation is the process of carrying out a plan or procedure so as to discover facts or information about the object of study.
  #   (http://semanticscience.org/resource/SIO_000747)
  # Or:
  #   An experiment is an investigation that has the goal of verifying, falsifying, or establishing the validity of a hypothesis. 
  #   (http://semanticscience.org/resource/SIO_000994)
  def self.study
    return [ RDF::URI.new('http://semanticscience.org/resource/SIO_000747'), RDF::URI.new('http://semanticscience.org/resource/SIO_000994') ]
  end

  # prediction is the process of formulating a proposition about a state of affairs which might be realized in the future.
  # (http://semanticscience.org/resource/SIO_000748)
  def self.prediction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000748')
  end

  def self.database
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000750')
  end

  # A quality that has a value that is decreased compared to normal or average.
  # (http://semanticscience.org/resource/SIO_000751)
  def self.decreased
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000751')
  end

  # A row represents a single, implicitly structured data item in a table. 
  # (http://semanticscience.org/resource/SIO_000752)
  def self.row
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000752')
  end

  def self.column
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000753')
  end

  # a database table is a set of named columns with zero or more rows composed of cells that contain column values and is part of a database.
  # (http://semanticscience.org/resource/SIO_000754)
  def self.database_table
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000754')
  end

  def self.cell_informational
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000755')
  end

  # A database entry is a single, implicitly structured data item in a table.
  # (http://semanticscience.org/resource/SIO_000756)
  def self.database_entry
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000756')
  end

  # A database entry is a single, implicitly structured data item in a table.
  # (http://semanticscience.org/resource/SIO_000756)
  def self.database_record
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000756')
  end

  def self.database_column
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000757')
  end

  # disorder is a quality in one or more anatomical parts (an anatomical collection) that are considered abnormal
  # (http://semanticscience.org/resource/SIO_000758)
  def self.disorder
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000758')
  end

  def self.unique_cell
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000759')
  end

  def self.referencing_cell
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000760')
  end

  def self.referent_cell
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000761')
  end

  # A database key is an informational entity whose value is constructed from one or more database columns.
  # (http://semanticscience.org/resource/SIO_000762)
  def self.database_key
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000762')
  end

  # A primary database key is a database key that identifies every row of a table.
  # (http://semanticscience.org/resource/SIO_000763)
  def self.primary_database_key
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000763')
  end

  # a foreign database key is a database key that refers to a key in some table
  # (http://semanticscience.org/resource/SIO_000764)
  def self.foreign_database_key
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000764')
  end

  # a p-value or probability value is the probability of obtaining a test statistic at least as extreme as the one that was actually observed, assuming that the null hypothesis is true
  # (http://semanticscience.org/resource/SIO_000765)
  def self.p_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000765')
  end

  # a p-value or probability value is the probability of obtaining a test statistic at least as extreme as the one that was actually observed, assuming that the null hypothesis is true
  # (http://semanticscience.org/resource/SIO_000765)
  def self.probability_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000765')
  end

  def self.street_name
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000766')
  end

  # a postal code is a geographic coordinate composed of a series of letters and/or digits appended to a postal address for the purpose of sorting mail.
  # (http://semanticscience.org/resource/SIO_000767)
  def self.postal_code
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000767')
  end

  def self.apartment_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000768')
  end

  # the uncertainty value (margin of error) of a measurement is a range of values likely to enclose the true value. 
  # (http://semanticscience.org/resource/SIO_000769)
  def self.uncertainty_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000769')
  end

  # a standard deviation (represented by the symbol σ) is the quantity of  variation from the average (mean, or expected value).
  # (http://semanticscience.org/resource/SIO_000770)
  def self.standard_deviation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000770')
  end

  # a versioned record is a record for which there exists another variant based that was derived via modification of the facts.
  # (http://semanticscience.org/resource/SIO_000771)
  def self.versioned_record
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000771')
  end

  # An object is an entity that is wholly identifiable at any instant of time during which it exists.
  # (http://semanticscience.org/resource/SIO_000776)
  def self.object
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000776')
  end

  # to be a member of is the capability to be considered a part of a collection.
  # (http://semanticscience.org/resource/SIO_000777)
  def self.to_be_a_member_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000777')
  end

  # to distort is the capability to change the appearance of an entity by some transformation.
  # (http://semanticscience.org/resource/SIO_000778)
  def self.to_distort
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000778')
  end

  # a primer is a nucleic acid that enables the synthesis of a complement strand of DNA by binding to it and acting as a point of transcription initiation.
  # (http://semanticscience.org/resource/SIO_000779)
  def self.primer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000779')
  end

  # to bind to is the capability to physically interact with another object through a set of non-covalent interactions.
  # (http://semanticscience.org/resource/SIO_000780)
  def self.to_bind_to
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000780')
  end

  def self.spatial_boundary
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000783')
  end

  # hermaphrodite is a biological sex of an individual with both male and female sexual organs.
  # (http://semanticscience.org/resource/SIO_000784)
  def self.hermaphrodite
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000784')
  end

  # an answer is a reply to a question.
  # (http://semanticscience.org/resource/SIO_000785)
  def self.answer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000785')
  end

  # a verbal language entity is a language entity that is manifested through sound.
  # (http://semanticscience.org/resource/SIO_000786)
  def self.verbal_language_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000786')
  end

  def self.page_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000787')
  end

  # a linear position is the position of some object against a linear positioning system.
  # (http://semanticscience.org/resource/SIO_000788)
  def self.linear_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000788')
  end

  # a sequence element position is the position of an element of a linear sequence.
  # (http://semanticscience.org/resource/SIO_000789)
  def self.sequence_element_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000789')
  end

  # a vertical position is a quantity along an axis that goes from up to down.
  # (http://semanticscience.org/resource/SIO_000790)
  def self.vertical_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000790')
  end

  # a sequence start position is the start position for a sequence of characters.
  # (http://semanticscience.org/resource/SIO_000791)
  def self.sequence_start_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000791')
  end

  # a sequence end position is the position of the last character in a sequence of characters relative to some linear frame of reference.
  # (http://semanticscience.org/resource/SIO_000792)
  def self.sequence_end_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000792')
  end

  # The number of elements of a finite set of objects.
  # (http://semanticscience.org/resource/SIO_000794)
  def self.count
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000794')
  end

  # a chemical role is a processual role held by a chemical entity
  # (http://semanticscience.org/resource/SIO_000795)
  def self.chemical_entity_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000795')
  end

  # the role of a chemical participant that serves to increase the rate of reaction by lowering the activiation energy.
  # (http://semanticscience.org/resource/SIO_000796)
  def self.catalytic_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000796')
  end

  # the role of a chemical entity that is modified in a chemical reaction
  # (http://semanticscience.org/resource/SIO_000797)
  def self.substrate_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000797')
  end

  # the role of a chemical entity present at the end of a chemical reaction.
  # (http://semanticscience.org/resource/SIO_000798)
  def self.product_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000798')
  end

  # the role of a chemical entity involved in the mechanism for enzyme-mediated catalysis.
  # (http://semanticscience.org/resource/SIO_000799)
  def self.cofactor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000799')
  end

  # a co-factor role in which the chemical entity is modified during catalysis and must be regenerated.
  # (http://semanticscience.org/resource/SIO_000800)
  def self.co_enzyme_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000800')
  end

  # a coenzyme role of a chemical entity that is covalently bonded to the  enzyme.
  # (http://semanticscience.org/resource/SIO_000801)
  def self.prosthetic_group_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000801')
  end

  # a co-enzyme role of a chemical entity that is transiently associated, and is regenerated in a separate reaction.
  # (http://semanticscience.org/resource/SIO_000802)
  def self.co_substrate_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000802')
  end

  # the role of a chemical entity that reduces the rate of reaction.
  # (http://semanticscience.org/resource/SIO_000803)
  def self.inhibitor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000803')
  end

  # the role of a chemical entity that increases the rate of reaction.
  # (http://semanticscience.org/resource/SIO_000804)
  def self.activator_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000804')
  end

  # The quality of having a charge
  # (http://semanticscience.org/resource/SIO_000805)
  def self.charged
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000805')
  end

  # the quality of not having a charge
  # (http://semanticscience.org/resource/SIO_000806)
  def self.uncharged
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000806')
  end

  def self.partial_positive_charge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000807')
  end

  def self.partial_negative_charge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000808')
  end

  def self.partial_charge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000809')
  end

  def self.unitary_charge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000810')
  end

  # a Uniform Resource Locator or Universal Resource Locator (URL) is a specific character string that constitutes a reference to an Internet resource.
  # (http://semanticscience.org/resource/SIO_000811)
  def self.URL
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000811')
  end

  # affection is an emotion characterized with a feeling or type of love for another living thing.
  # (http://semanticscience.org/resource/SIO_000812)
  def self.affection
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000812')
  end

  # angst is the intense feeling of apprehension, anxiety or inner turmoil.
  # (http://semanticscience.org/resource/SIO_000813)
  def self.angst
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000813')
  end

  # Annoyance is an unpleasant emtion that is characterized by a abnormal or excessive sensitivity to some external stimulus.
  # (http://semanticscience.org/resource/SIO_000814)
  def self.annoyance
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000814')
  end

  # anxiety is an emotion charactersized by intense feeling of fear and concern coupled with a physical response.
  # (http://semanticscience.org/resource/SIO_000815)
  def self.anxiety
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000815')
  end

  # apathy is an emotion exhibited by lack of interest, enthusiasm, or concern
  # (http://semanticscience.org/resource/SIO_000816)
  def self.apathy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000816')
  end

  # Arousal is an emotion characterized by state of reactive to stimuli. It involves the activation of the reticular activating system in the brain stem, the autonomic nervous system and the endocrine system, leading to increased heart rate and blood pressure and a condition of sensory alertness, mobility and readiness to respond.
  # (http://semanticscience.org/resource/SIO_000817)
  def self.arousal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000817')
  end

  # Awe is an emotion produced by that which is grand, sublime or powerful and is characterized by a combination of joy, fear and admiration/reverence/respect. 
  # (http://semanticscience.org/resource/SIO_000818)
  def self.awe
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000818')
  end

  # boldness is the trait of being willing to undertake things that involve risk or danger.
  # (http://semanticscience.org/resource/SIO_000819)
  def self.boldness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000819')
  end

  # boredom is the emotion experience by those not interested in their surroundings or available activities.
  # (http://semanticscience.org/resource/SIO_000820)
  def self.boredom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000820')
  end

  # contempt is disgust  towards a lower status individual.
  # (http://semanticscience.org/resource/SIO_000821)
  def self.contempt
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000821')
  end

  # contentment is an emotion characterized by acknowledgement and satisfaction of the current state of affairs.
  # (http://semanticscience.org/resource/SIO_000822)
  def self.contentment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000822')
  end

  # curiosity is the strong desire to know or learn something.
  # (http://semanticscience.org/resource/SIO_000823)
  def self.curiosity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000823')
  end

  # depression is an unpleasant emotion linked to aversion to activity that can affect a person's thoughts, behavior, feelings and physical well-being. Depressed individuals may feel sad, anxious, empty, hopeless, worried, helpless, worthless, guilty, irritable, or restless.
  # (http://semanticscience.org/resource/SIO_000824)
  def self.depression
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000824')
  end

  # Desire is a strong emotion of wanting to have something or wishing for something to happen.
  # (http://semanticscience.org/resource/SIO_000825)
  def self.desire
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000825')
  end

  # despair is depression, hopelessness or lack of hope
  # (http://semanticscience.org/resource/SIO_000826)
  def self.despair
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000826')
  end

  # Disappointment is the feeling of dissatisfaction that follows the failure of expectations or hopes to manifest
  # (http://semanticscience.org/resource/SIO_000827)
  def self.disappointment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000827')
  end

  # Disgust is a feeling of revulsion or profound disapproval aroused by something unpleasant or offensive.
  # (http://semanticscience.org/resource/SIO_000828)
  def self.disgust
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000828')
  end

  # dread is the instense negative emotion that induces fear and apprehension.
  # (http://semanticscience.org/resource/SIO_000829)
  def self.dread
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000829')
  end

  # ecstacy is an emotion characterized by a heightened state of consciousness with total involvement of a subject.
  # (http://semanticscience.org/resource/SIO_000830)
  def self.ecstasy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000830')
  end

  # a positive emotion is an emotion that feels good.
  # (http://semanticscience.org/resource/SIO_000831)
  def self.positive_emotion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000831')
  end

  # negative emotion is an emotion that does not feel good.
  # (http://semanticscience.org/resource/SIO_000832)
  def self.negative_emotion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000832')
  end

  # Embarrassment is the emotion of intense discomfort with oneself, experienced upon having a socially unacceptable act or condition witnessed by or revealed to other.
  # (http://semanticscience.org/resource/SIO_000833)
  def self.embarassment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000833')
  end

  # envy is an emotion that occurs when a person lacks another's (perceived) superior quality, achievement or possession and wishes that the other lacked it.
  # (http://semanticscience.org/resource/SIO_000834)
  def self.envy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000834')
  end

  # euphoria is an emotion characterized by intense feelings of well-being, elation, happiness, ecstasy, excitement, and joy.
  # (http://semanticscience.org/resource/SIO_000835)
  def self.euphoria
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000835')
  end

  def self.excitement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000836')
  end

  # Fear is a negative emotion induced by a perceived threat that induces one to hide or move quickly away from the location of the perceived threat.
  # (http://semanticscience.org/resource/SIO_000837)
  def self.fear
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000837')
  end

  # Frustration is an emotion that arises from the perceived resistance to the fulfillment of individual will. 
  # (http://semanticscience.org/resource/SIO_000838)
  def self.frustration
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000838')
  end

  # Gratitude, thankfulness, gratefulness, or appreciation is a feeling, emotion or attitude in acknowledgment of a benefit that one has received or will receive.
  # (http://semanticscience.org/resource/SIO_000839)
  def self.gratitude
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000839')
  end

  # Gratitude, thankfulness, gratefulness, or appreciation is a feeling, emotion or attitude in acknowledgment of a benefit that one has received or will receive.
  # (http://semanticscience.org/resource/SIO_000839)
  def self.appreciation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000839')
  end

  # Happiness is an emotion characterized by positive or pleasant emotions ranging from contentment to intense joy.
  # (http://semanticscience.org/resource/SIO_000840)
  def self.happiness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000840')
  end

  # Guilt is the emotion borne from feeling responsible for the commission of an offense and arises out of public humiliation.
  # (http://semanticscience.org/resource/SIO_000841)
  def self.guilt
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000841')
  end

  # Grief is an emotion in response to loss, whether physical or abstract including death, unemployment, ill health or the end of a relationship.
  # (http://semanticscience.org/resource/SIO_000842)
  def self.grief
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000842')
  end

  # hope is an emotion of belief in a positive outcome related to events and circumstances in one's life.
  # (http://semanticscience.org/resource/SIO_000843)
  def self.hope
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000843')
  end

  # Hostility is the intense negative emotion of being in conflict or opposition to someone or something.
  # (http://semanticscience.org/resource/SIO_000844)
  def self.hostility
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000844')
  end

  # hurt is an unpleasant feeling, emotion or sensation.
  # (http://semanticscience.org/resource/SIO_000845)
  def self.hurt
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000845')
  end

  # Hysteria is an unmanageable emotion.
  # (http://semanticscience.org/resource/SIO_000846)
  def self.hysteria
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000846')
  end

  # indifference is an emotion exhibited by lack of interest, concern, or sympathy.
  # (http://semanticscience.org/resource/SIO_000847)
  def self.indifference
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000847')
  end

  # interest is the emotion of wanting to know or learn about something or someone.
  # (http://semanticscience.org/resource/SIO_000848)
  def self.interest
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000848')
  end

  # jealousy is an emotion and typically refers to the negative thoughts and feelings of insecurity, fear, and anxiety over an anticipated loss of something that the person values, particularly in reference to a human connection
  # (http://semanticscience.org/resource/SIO_000849)
  def self.jealousy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000849')
  end

  def self.joy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000850')
  end

  def self.joy_is_an_emotion_of_intense_happiness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000850')
  end

  # loathing is an intense dislike or disgust.
  # (http://semanticscience.org/resource/SIO_000851)
  def self.loathing
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000851')
  end

  # Loneliness is an unpleasant emotion in which a person feels a strong sense of emptiness, yearning distress and solitude resulting from inadequate quantity or quality of social relationships.
  # (http://semanticscience.org/resource/SIO_000852)
  def self.loneliness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000852')
  end

  # lust is the strong desire for sex.
  # (http://semanticscience.org/resource/SIO_000853)
  def self.lust
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000853')
  end

  # Misery is a feeling of great unhappiness, suffering and/or pain.
  # (http://semanticscience.org/resource/SIO_000854)
  def self.misery
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000854')
  end

  # Panic is a sudden emotion of fear which is so strong as to dominate or prevent reason and logical thinking, replacing it with overwhelming feelings of anxiety and frantic agitation consistent with an animalistic fight-or-flight reaction.
  # (http://semanticscience.org/resource/SIO_000855)
  def self.panic
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000855')
  end

  # passion is the intense emotion compelling feeling, enthusiasm, or desire for something.
  # (http://semanticscience.org/resource/SIO_000856)
  def self.passion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000856')
  end

  # Pity is the emotion of sadness or sorrow for another.
  # (http://semanticscience.org/resource/SIO_000857)
  def self.pity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000857')
  end

  def self.pleasure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000858')
  end

  # Pride is an emotion of satisfaction of attachment toward one's own or another's choices and actions, or toward a whole group of people, and is a product of praise, independent self-reflection, or a fulfilled feeling of belonging.
  # (http://semanticscience.org/resource/SIO_000859)
  def self.pride
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000859')
  end

  # Rage is a feeling of intense anger that is  associated with the Fight-or-flight response.
  # (http://semanticscience.org/resource/SIO_000860)
  def self.rage
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000860')
  end

  def self.regret
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000861')
  end

  def self.remorse
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000862')
  end

  # sadness is emotional pain associated with, or characterized by feelings of disadvantage, loss, despair, helplessness, sorrow, and rage.
  # (http://semanticscience.org/resource/SIO_000863)
  def self.sadness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000863')
  end

  def self.satisfaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000864')
  end

  def self.satisfaction_is_an_emotion_of_fulfillment_of_one_s_wishes_expectations_or_needs_or_the_pleasure_derived_from_this
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000864')
  end

  # shame is the emotion borne from feeling responsible for the commission of an offense.
  # (http://semanticscience.org/resource/SIO_000865)
  def self.shame
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000865')
  end

  # shock is an emotion of sudden upset or surprise.
  # (http://semanticscience.org/resource/SIO_000866)
  def self.shock
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000866')
  end

  # shyness is an emotion of apprehension, lack of comfort, or awkwardness experienced when in proximity to, approaching, or being approached by other individuals, especially in new situations or with unfamiliar individuals.
  # (http://semanticscience.org/resource/SIO_000867)
  def self.shyness
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000867')
  end

  # Sorrow is the emotion that is characterized by a long term state of intense sadness, distress and a degree of resignation (not accepting).
  # (http://semanticscience.org/resource/SIO_000868)
  def self.sorrow
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000868')
  end

  # Suffering is the unpleasant emotion and aversion associated with the perception of harm or threat of harm in an individual.
  # (http://semanticscience.org/resource/SIO_000869)
  def self.suffering
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000869')
  end

  # Surprise is a brief emotion experienced as the result of an unexpected event. 
  # (http://semanticscience.org/resource/SIO_000870)
  def self.surprise
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000870')
  end

  # terror is the extreme feeling of fear.
  # (http://semanticscience.org/resource/SIO_000871)
  def self.terror
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000871')
  end

  # Wonder is an emotion of perceiving something very rare or unexpected, but not threatening.
  # (http://semanticscience.org/resource/SIO_000872)
  def self.wonder
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000872')
  end

  # worry is the emotion characterized by concer over a real or imaginary issue.
  # (http://semanticscience.org/resource/SIO_000873)
  def self.worry
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000873')
  end

  def self.department_chair_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000875')
  end

  def self.student_advisor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000876')
  end

  def self.undergraduate_student_advisor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000877')
  end

  def self.graduate_student_advisor_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000878')
  end

  # the role of a chemical entity present at the beginning of a chemical reaction.
  # (http://semanticscience.org/resource/SIO_000879)
  def self.reactant_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000879')
  end

  # the role of a chemical entity that modifies the rate of reaction.
  # (http://semanticscience.org/resource/SIO_000880)
  def self.regulator_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000880')
  end

  def self.investigational_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000881')
  end

  # the role of an organism in providing resources to maintain the survival and/or reproduction of another organism.
  # (http://semanticscience.org/resource/SIO_000882)
  def self.host_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000882')
  end

  def self.subject_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000883')
  end

  def self.publishing_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000884')
  end

  # the role of an agent that prepares and issues creative works.
  # (http://semanticscience.org/resource/SIO_000885)
  def self.publisher_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000885')
  end

  # the role of an agent that creates a written work.
  # (http://semanticscience.org/resource/SIO_000886)
  def self.author_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000886')
  end

  # a buffer role is the role of a chemical substance which maintains a pH at a near constant value.
  # (http://semanticscience.org/resource/SIO_000887)
  def self.buffer_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000887')
  end

  # a chemical substance role is a chemical entity role held by a chemical substance
  # (http://semanticscience.org/resource/SIO_000888)
  def self.chemical_substance_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000888')
  end

  # a molecular entity role is a chemical entity role held by a molecule
  # (http://semanticscience.org/resource/SIO_000889)
  def self.molecular_entity_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000889')
  end

  # a toxin role is a toxic role of a chemical substance that is poisonous and  is produced by an organism
  # (http://semanticscience.org/resource/SIO_000890)
  def self.toxin_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000890')
  end

  # a toxic role is the role of a chemical substance that is poisonous
  # (http://semanticscience.org/resource/SIO_000891)
  def self.toxic_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000891')
  end

  # a role of a chemical substance that participates in a chemical reaction as part of some scientific investigation.
  # (http://semanticscience.org/resource/SIO_000893)
  def self.reagent_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000893')
  end

  # to luminesce is to emit light through cold body radiation
  # (http://semanticscience.org/resource/SIO_000894)
  def self.to_luminesce
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000894')
  end

  # to fluoresce is to emit light as a result of absorbing light or other electromagnetic radiation.
  # (http://semanticscience.org/resource/SIO_000895)
  def self.to_fluoresce
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000895')
  end

  # a molecular tracer role is a reactant role of a molecular entity that serves as a marker for the presence, abundance, or location of a molecular target that it associates with.
  # (http://semanticscience.org/resource/SIO_000896)
  def self.molecular_tracer_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000896')
  end

  # an assocation is a relationship between two or more entities derived by some informational anlysis.
  # (http://semanticscience.org/resource/SIO_000897)
  def self.association
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000897')
  end

  # a statistical association is any relationship between two measured quantities that renders them statistically dependent.
  # (http://semanticscience.org/resource/SIO_000898)
  def self.statistical_association
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000898')
  end

  # a chromosome is a molecular complex of circular or linear DNA and bound proteins.
  # (http://semanticscience.org/resource/SIO_000899)
  def self.chromosome
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000899')
  end

  # A top value axis is a value axis that is spatially positioned to the top of the plot area.
  # (http://semanticscience.org/resource/SIO_000902)
  def self.top_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000902')
  end

  # A bottom value axis is a value axis that is spatially positioned to the bottom of the plot area.
  # (http://semanticscience.org/resource/SIO_000903)
  def self.bottom_value_axis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000903')
  end

  # A map is a a visual representation of an area that depicts the relationship between elements of that space.
  # (http://semanticscience.org/resource/SIO_000906)
  def self.map
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000906')
  end

  # A heatmap is a graphical representation of data where the individual values contained in a matrix are represented as colors.
  # (http://semanticscience.org/resource/SIO_000907)
  def self.heatmap
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000907')
  end

  # a steamgraph is a multi-line stacked graph that yields the appearance of continuous y-values across the x-axis.
  # (http://semanticscience.org/resource/SIO_000908)
  def self.steamgraph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000908')
  end

  # A boxplot (box-and-whisker diagram) is a convenient way of graphically depicting groups of numerical data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
  # (http://semanticscience.org/resource/SIO_000909)
  def self.boxplot
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000909')
  end

  # A geographic heatmap is a graphical representation of data over a geographic region where individual values are represented as colors.
  # (http://semanticscience.org/resource/SIO_000910)
  def self.geographic_heatmap
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000910')
  end

  # a histogram is a graphical representation of data which consists of tabular frequencies, shown as adjacent rectangles, over discrete intervals (bins) , with an area equal to the frequency of the observations in the interval.
  # (http://semanticscience.org/resource/SIO_000911)
  def self.histogram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000911')
  end

  # a measurement scale is a functional specification that specifies an allowed range of categories or values.
  # (http://semanticscience.org/resource/SIO_000912)
  def self.measurement_scale
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000912')
  end

  # A nominal scale of measurement only specifies a limited set of categories.
  # (http://semanticscience.org/resource/SIO_000913)
  def self.nomimal_scale
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000913')
  end

  # a binary scale is a measurement scale that specifies a choice between two values.
  # (http://semanticscience.org/resource/SIO_000914)
  def self.binary_scale
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000914')
  end

  # a numeric scale of measurement is one that only specifies numeric values
  # (http://semanticscience.org/resource/SIO_000915)
  def self.numeric_scale
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000915')
  end

  # a decimal scale of measurement is one that only specifies decimal values
  # (http://semanticscience.org/resource/SIO_000916)
  def self.decimal_scale
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000916')
  end

  # an integer scale of measurement is one that only specifies integer values.
  # (http://semanticscience.org/resource/SIO_000917)
  def self.integer_scale
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000917')
  end

  # modification is the process by which an entity gains or loses parts, qualities, roles, dispositions, functions, etc, but maintains their identity through these changes.
  # (http://semanticscience.org/resource/SIO_000918)
  def self.modification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000918')
  end

  # Reproduction is the process by which a new entity is created based on another entity.
  # (http://semanticscience.org/resource/SIO_000919)
  def self.reproduction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000919')
  end

  # an independent variable is a variable that may take on different values independent of other elements in a system.
  # (http://semanticscience.org/resource/SIO_000920)
  def self.independent_variable
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000920')
  end

  # A dependent variable is one whose value changes as a consequence of changes in other values in the system
  # (http://semanticscience.org/resource/SIO_000921)
  def self.dependent_variable
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000921')
  end

  # A Gantt chart is a bar chart that illustrates a project schedule.
  # (http://semanticscience.org/resource/SIO_000922)
  def self.Gantt_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000922')
  end

  # a correlation is a statistical relationship involving dependence between two random variables or datasets.
  # (http://semanticscience.org/resource/SIO_000923)
  def self.correlation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000923')
  end

  def self.television_program
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000924')
  end

  # A radio receiver is a communication device that receives its input from an antenna, uses electronic filters to separate a wanted radio signal from all other signals picked up by this antenna, amplifies it to a level suitable for further processing, and finally converts through demodulation and decoding the signal into a form usable for the consumer, such as sound, pictures, digital data, measurement values, navigational positions.
  # (http://semanticscience.org/resource/SIO_000926)
  def self.radio_receiver
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000926')
  end

  # The telephone is a communications device that transmits and receives sounds, and are minimally composed of a microphone to speak into, a speaker'which reproduces the voice of the other person and a ringer which makes a sound to alert the owner when a call is coming in.
  # (http://semanticscience.org/resource/SIO_000927)
  def self.telephone
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000927')
  end

  # a radar is an object-detection system which uses radio waves to determine the range, altitude, direction, or speed of objects.
  # (http://semanticscience.org/resource/SIO_000928)
  def self.radar
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000928')
  end

  # A pie chart is a circular chart divided into sectors each of whose length  is proportional to the quantity it represents.
  # (http://semanticscience.org/resource/SIO_000929)
  def self.pie_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000929')
  end

  # A matrix chart summarizes a multidimensional data set in a grid.
  # (http://semanticscience.org/resource/SIO_000930)
  def self.matrix_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000930')
  end

  # A network diagram consists of a set of vertices connected by edges.
  # (http://semanticscience.org/resource/SIO_000931)
  def self.network_diagram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000931')
  end

  # A block histogram contains an x-axis that is divided into bins which correspond to value ranges. Each item in the data set is drawn as a rectangular block, and the blocks are piled into the bins to show how many values in each range.
  # (http://semanticscience.org/resource/SIO_000932)
  def self.block_histogram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000932')
  end

  # A bubble chart contains circles whose area corresponds to a value. 
  # (http://semanticscience.org/resource/SIO_000933)
  def self.bubble_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000933')
  end

  # A stack graph is a statistical graph which presents multiple series in which the distance between one series and another indicates the relative contribution to the total for any x-value.
  # (http://semanticscience.org/resource/SIO_000934)
  def self.stack_graph
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000934')
  end

  # a treemap is a chart that fully partitions the area into a set of rectangles whose area represents its relative value.
  # (http://semanticscience.org/resource/SIO_000935)
  def self.treemap
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000935')
  end

  # a word tree is a chart that links phrases with contexts through a tree-like branching structure.
  # (http://semanticscience.org/resource/SIO_000936)
  def self.word_tree
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000936')
  end

  def self.textual_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000937')
  end

  # a tag cloud is a visualization of word frequencies.
  # (http://semanticscience.org/resource/SIO_000938)
  def self.tag_cloud
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000938')
  end

  # a tag cloud is a visualization of word frequencies.
  # (http://semanticscience.org/resource/SIO_000938)
  def self.word_cloud
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000938')
  end

  # A phrase net diagram illustrates the relationship between different words used in a text.
  # (http://semanticscience.org/resource/SIO_000939)
  def self.phrase_net_diagram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000939')
  end

  # a mereological chart is a chart that illustrates the parts in the context of the whole.
  # (http://semanticscience.org/resource/SIO_000940)
  def self.mereological_chart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000940')
  end

  # A conversation is a form of interactive, spontaneous communication between two or more objects who are following rules of etiquette.
  # (http://semanticscience.org/resource/SIO_000941)
  def self.conversation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000941')
  end

  def self.numeric_label
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000942')
  end

  # a start position is the proximal position of an object relative to an origin in a linear system.
  # (http://semanticscience.org/resource/SIO_000943)
  def self.start_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000943')
  end

  # an interval is a set of real numbers that includes all numbers between any two numbers in the set.
  # (http://semanticscience.org/resource/SIO_000944)
  def self.interval
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000944')
  end

  # A tree diagram is a hierarchical network diagram in which a root vertex is connected to one or more other vertices through a directed edge, which in turn may be connected to other vertices.
  # (http://semanticscience.org/resource/SIO_000945)
  def self.tree_diagram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000945')
  end

  # A flowchart is a diagram that represents an algorithm or process, showing the steps as boxes of various kinds, and their order by connecting these with arrows.
  # (http://semanticscience.org/resource/SIO_000946)
  def self.flowchart
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000946')
  end

  # A Venn diagram is a chart that illustrates all possible logical relations between a finite collection of sets as overlapping circles.
  # (http://semanticscience.org/resource/SIO_000947)
  def self.venn_diagram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000947')
  end

  # A dendrogram is a tree diagram used to illustrate the arrangement of the clusters produced by hierarchical clustering.
  # (http://semanticscience.org/resource/SIO_000948)
  def self.dendrogram
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000948')
  end

  # apprehension is the negative emotion that something unpleasant will occur.
  # (http://semanticscience.org/resource/SIO_000949)
  def self.apprehension
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000949')
  end

  # resentment is disgust directed toward a higher status individual.
  # (http://semanticscience.org/resource/SIO_000950)
  def self.resentment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000950')
  end

  # Pain is an unpleasant sensory and emotional experience associated with actual or potential tissue damage, or described in terms of such damage
  # (http://semanticscience.org/resource/SIO_000951)
  def self.pain
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000951')
  end

  # a default parameter is a parameter which has a default value.
  # (http://semanticscience.org/resource/SIO_000952)
  def self.default_parameter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000952')
  end

  # an end position is the distal position of an object relative to an origin in a linear system.
  # (http://semanticscience.org/resource/SIO_000953)
  def self.end_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000953')
  end

  # an end position is the distal position of an object relative to an origin in a linear system.
  # (http://semanticscience.org/resource/SIO_000953)
  def self.stop_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000953')
  end

  # sick is the status of a living organism that is behaving at a sub-optimal level.
  # (http://semanticscience.org/resource/SIO_000954)
  def self.sick
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000954')
  end

  def self.environment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000955')
  end

  # a device is usually a constructed tool
  # (http://semanticscience.org/resource/SIO_000956)
  def self.device
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000956')
  end

  # a communication device is a device that facilitates the transmission of information through encoded in an audio or digital signal between a sender and a receiver.
  # (http://semanticscience.org/resource/SIO_000957)
  def self.communication_device
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000957')
  end

  # existence quality is the quality of an entity that describe in what environment it is known to exist.
  # (http://semanticscience.org/resource/SIO_000959)
  def self.existence_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000959')
  end

  # real is the quality of an entity that exists in real space and time.
  # (http://semanticscience.org/resource/SIO_000960)
  def self.real
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000960')
  end

  # fiction is the quality of an entity that exists only in a creative work of fiction.
  # (http://semanticscience.org/resource/SIO_000961)
  def self.fictional
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000961')
  end

  # virtual is the quality of an entity that exists only in a virtual setting such as a simulation or game environment.
  # (http://semanticscience.org/resource/SIO_000962)
  def self.virtual
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000962')
  end

  # not started is the status of a process that is predicted to exist but has not yet begun.
  # (http://semanticscience.org/resource/SIO_000963)
  def self.not_started
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000963')
  end

  def self.standard_operating_procedure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000964')
  end

  def self.agreement_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000965')
  end

  def self.agreement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000966')
  end

  def self.disagreement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000967')
  end

  def self.poison_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000968')
  end

  # Communication is the process of conveying information through the exchange of thoughts, messages, or information, as by speech, visuals, signals, writing, or behaviour.
  # (http://semanticscience.org/resource/SIO_000969)
  def self.communication
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000969')
  end

  # observational study draws inferences about the possible effect of a treatment on subjects, where the assignment of subjects into a treated group versus a control group is outside the control of the investigator
  # (http://semanticscience.org/resource/SIO_000976)
  def self.observational_study
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000976')
  end

  # A syllable is a verbal entity of language having one vowel sound, with or without surrounding consonants, forming the whole or a part of a word.
  # (http://semanticscience.org/resource/SIO_000977)
  def self.syllable
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000977')
  end

  # a consonant is a verbal entity of language that is articulated with complete or partial closure of the vocal tract.
  # (http://semanticscience.org/resource/SIO_000978)
  def self.consonant
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000978')
  end

  # a vowel is a verbal entity of language that is pronounced with an open vocal tract so that there is no build-up of air pressure at any point above the glottis.
  # (http://semanticscience.org/resource/SIO_000979)
  def self.vowel
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000979')
  end

  # a sign language (also signed language) is a language that involves manual communication and body language to convey meaning. This can involve simultaneously combining hand shapes, orientation and movement of the hands, arms or body, and facial expressions to fluidly express a speaker's thoughts.
  # (http://semanticscience.org/resource/SIO_000980)
  def self.sign_language
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000980')
  end

  # a verbal language is a language that uses sounds to communicate.
  # (http://semanticscience.org/resource/SIO_000981)
  def self.verbal_language
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000981')
  end

  # written language is a language that is communicated through a writing system.
  # (http://semanticscience.org/resource/SIO_000982)
  def self.written_language
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000982')
  end

  # a gene-disease association is an association between a gene and a disease
  # (http://semanticscience.org/resource/SIO_000983)
  def self.gene_disease_association
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000983')
  end

  # a genome is a collection of nucleic acids.
  # (http://semanticscience.org/resource/SIO_000984)
  def self.genome
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000984')
  end

  # a gene that contains an open reading frame which codes for a protein.
  # (http://semanticscience.org/resource/SIO_000985)
  def self.protein_coding_gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000985')
  end

  # a gene that codes for a functional RNA molecule
  # (http://semanticscience.org/resource/SIO_000986)
  def self.functional_rna_coding_gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000986')
  end

  def self.predicted_gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000987')
  end

  # a pseudo gene is a region of a nucleic acid that either cannot be transcribed, or its rna transcript cannot be translated.
  # (http://semanticscience.org/resource/SIO_000988)
  def self.pseudogene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000988')
  end

  # a sequence assembly is a sequence that is produced as by the alignment of two or more sequences.
  # (http://semanticscience.org/resource/SIO_000989)
  def self.sequence_assembly
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000989')
  end

  # an experimentally validated gene is a gene whose existence has been demonstrated through experimental methods.
  # (http://semanticscience.org/resource/SIO_000991)
  def self.validated_gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000991')
  end

  # unsupported is an existence quality in which there is no evidence to support the existence of the entity.
  # (http://semanticscience.org/resource/SIO_000992)
  def self.unsupported
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000992')
  end

  # a chemical-disease association is an association between a chemical and a disease.
  # (http://semanticscience.org/resource/SIO_000993)
  def self.chemical_disease_association
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000993')
  end

  # An experiment is an investigation that has the goal of verifying, falsifying, or establishing the validity of a hypothesis. 
  # (http://semanticscience.org/resource/SIO_000994)
  def self.experiment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000994')
  end

  # suspended is the status of a process that is no longer progressing towards completion.
  # (http://semanticscience.org/resource/SIO_000995)
  def self.suspended
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000995')
  end

  # cancelled is a process status in which the process, while planned to occur, will not occur.
  # (http://semanticscience.org/resource/SIO_000996)
  def self.cancelled
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000996')
  end

  # aborted is a process status in which a started process will not complete as intended.
  # (http://semanticscience.org/resource/SIO_000997)
  def self.aborted
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000997')
  end

  # literature curation is the process of an agent selecting and extracting terms and phrases from a document.
  # (http://semanticscience.org/resource/SIO_000998)
  def self.literature_curation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000998')
  end

  # a procedure is a process that attempts to achieve one or more objectives by following an established set of actions.
  # (http://semanticscience.org/resource/SIO_000999)
  def self.procedure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_000999')
  end

  # a clinical trial is an intervention trial to determine the safety and efficacy of  medical interventions (e.g., drugs, diagnostics, devices, therapy protocols). 
  # (http://semanticscience.org/resource/SIO_001000)
  def self.clinical_trial
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001000')
  end

  # A medical diagnosis (often simply termed diagnosis) refers to the process of attempting to determine or identify a possible disease or disorder.
  # (http://semanticscience.org/resource/SIO_001001)
  def self.medical_diagnosis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001001')
  end

  # A differential diagnosis (sometimes abbreviated DDx, ddx, DD, D/Dx, or ΔΔ) is a systematic diagnostic method used to identify the presence of an entity where multiple alternatives are possible (and the process may be termed differential diagnostic procedure), and may also refer to any of the included candidate alternatives (which may also be termed candidate condition).
  # (http://semanticscience.org/resource/SIO_001002)
  def self.differential_diagnosis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001002')
  end

  # A diagnostic opinion is an opinion resulting from a medical diagnostic procedure.
  # (http://semanticscience.org/resource/SIO_001003)
  def self.diagnostic_opinion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001003')
  end

  # an opinion is a belief that is the result of emotion or interpretation of facts. 
  # (http://semanticscience.org/resource/SIO_001004)
  def self.opinion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001004')
  end

  # A drug effect is a chemical interaction in which a chemical elicits a marked characteristic of a biological system.
  # (http://semanticscience.org/resource/SIO_001005)
  def self.drug_effect
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001005')
  end

  # a drug-drug interaction is an interaction in which two drugs interact in such a way to produce a non-additive biological response.
  # (http://semanticscience.org/resource/SIO_001006)
  def self.drug_drug_interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001006')
  end

  # An assay is an investigative (analytic) procedure in laboratory medicine, pharmacology, environmental biology, and molecular biology for qualitatively assessing or quantitatively measuring the presence or amount or the functional activity of a target entity (the analyte) which can be a drug or biochemical substance or a cell in an organism or organic sample.
  # (http://semanticscience.org/resource/SIO_001007)
  def self.assay
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001007')
  end

  # toxicity is the quality of a chemical substance to cause injury to an organism in a dose dependent manner.
  # (http://semanticscience.org/resource/SIO_001008)
  def self.toxicity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001008')
  end

  def self.toxic
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001009')
  end

  def self.non_toxic
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001010')
  end

  # chemical quality is the quality of a chemical entity.
  # (http://semanticscience.org/resource/SIO_001011)
  def self.chemical_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001011')
  end

  # healthy is an organismal state of complete physical, mental and social well-being.
  # (http://semanticscience.org/resource/SIO_001012)
  def self.healthy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001012')
  end

  # age is the length of time that a person has lived or a thing has existed.
  # (http://semanticscience.org/resource/SIO_001013)
  def self.age
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001013')
  end

  # ethnicity is the biological quality of membership in a social group based on a common heritage.
  # (http://semanticscience.org/resource/SIO_001014)
  def self.ethnicity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001014')
  end

  # race is a characteristic of an individual by heritable phenotypic characteristics, geographic ancestry, physical appearance, ethnicity, and social status.
  # (http://semanticscience.org/resource/SIO_001015)
  def self.race
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001015')
  end

  # an ethnic group is a group of people whose members identify with each other through a common heritage, consisting of a common culture, including a shared language or dialect. 
  # (http://semanticscience.org/resource/SIO_001016)
  def self.ethnic_group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001016')
  end

  # A syndrome is composed of a set of several clinically recognizable features, signs (observed by someone other than the patient), symptoms (reported by the patient), phenomena or characteristics that often occur together.
  # (http://semanticscience.org/resource/SIO_001017)
  def self.syndrome
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001017')
  end

  # a ratio is a relationship between two numbers of the same kind expressed arithmetically as a dimensionless quotient of the two which explicitly indicates how many times the first number contains the second.
  # (http://semanticscience.org/resource/SIO_001018)
  def self.ratio
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001018')
  end

  # A dose is the quantity of a chemical substance administered to a biological system.
  # (http://semanticscience.org/resource/SIO_001019)
  def self.dose
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001019')
  end

  # effective dose is the amount of a substance required to produce an effect on a predefined percentage of a population.
  # (http://semanticscience.org/resource/SIO_001020)
  def self.effective_dose
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001020')
  end

  # an expected value (or e-value) is the weighted average of all possible values that a random variable can take on.
  # (http://semanticscience.org/resource/SIO_001021)
  def self.expected_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001021')
  end

  # A diagnostic test is a procedure performed to confirm, or determine the presence of disease in an individual suspected of having the disease, usually following the report of symptoms, or based on the results of other medical tests.
  # (http://semanticscience.org/resource/SIO_001022)
  def self.diagnostic_test
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001022')
  end

  # A medical screening is a medical test or series used to detect or predict the presence of disease in individuals at risk for disease within a defined group, such as a population, family, or workforce
  # (http://semanticscience.org/resource/SIO_001023)
  def self.medical_screening
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001023')
  end

  def self.medical_procedure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001024')
  end

  # A prognosis is a proposition about the likely course of a disease, the chance of recovery or recurrence.
  # (http://semanticscience.org/resource/SIO_001025)
  def self.prognosis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001025')
  end

  # A report is a textual document made that present focused, salient content to a specific audience.
  # (http://semanticscience.org/resource/SIO_001026)
  def self.report
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001026')
  end

  # A medical health record is a record of a single patient's medical history.
  # (http://semanticscience.org/resource/SIO_001027)
  def self.medical_health_record
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001027')
  end

  # a medical report is a report prepared by a health care practioner about test outcomes or health status of an individual.
  # (http://semanticscience.org/resource/SIO_001028)
  def self.medical_report
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001028')
  end

  # a peer reviewed article is an article that has undergone peer-review and deemed acceptable for publication.
  # (http://semanticscience.org/resource/SIO_001029)
  def self.peer_reviewed_article
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001029')
  end

  # a major version number is a version of a software that exhibits a significant change in functionalilty from a prior version.
  # (http://semanticscience.org/resource/SIO_001030)
  def self.major_version_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001030')
  end

  # a minor version number is a version of a software that exhibits minor features or significant fix from a prior version.
  # (http://semanticscience.org/resource/SIO_001031)
  def self.minor_version_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001031')
  end

  # a revision number is a version of a software in which bugs have been fixed from a prior version.
  # (http://semanticscience.org/resource/SIO_001032)
  def self.revision_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001032')
  end

  def self.text_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001033')
  end

  def self.reviewed
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001034')
  end

  def self.peer_reviewed
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001035')
  end

  def self.draft
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001036')
  end

  def self.finalized
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001037')
  end

  def self.editor_reviewed
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001038')
  end

  def self.written
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001039')
  end

  # a morpheme is the smallest semantically meaningful unit in a language
  # (http://semanticscience.org/resource/SIO_001040)
  def self.morpheme
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001040')
  end

  # A study design is a protocol for the proper execution of a study which normally requires a carefullly crafted research question or hypothesis and at least one variable under observation and observed values for that variable.
  # (http://semanticscience.org/resource/SIO_001041)
  def self.study_design
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001041')
  end

  # A study design is a protocol for the proper execution of a study which normally requires a carefullly crafted research question or hypothesis and at least one variable under observation and observed values for that variable.
  # (http://semanticscience.org/resource/SIO_001041)
  def self.study_protocol
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001041')
  end

  # A recipe is a set of instructions that describe how to prepare or make something.
  # (http://semanticscience.org/resource/SIO_001042)
  def self.recipe
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001042')
  end

  # a protocol is a predefined procedural method in the design and implementation of experiments. In addition to providing a detailed set of procedures and lists of required equipment and instruments, protocols often include information on safety precautions, the calculation of results and reporting standards, including statistical analysis and rules for predefining and documenting excluded data to avoid bias.
  # (http://semanticscience.org/resource/SIO_001043)
  def self.protocol
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001043')
  end

  def self.viroid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001044')
  end

  def self.polar_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001045')
  end

  def self.polar
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001046')
  end

  def self.non_polar
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001047')
  end

  # an intervention study has the objective of improving the condition of an individual or a group of individuals, and demonstrates the magnitude of that capability by comparing it to a control group.
  # (http://semanticscience.org/resource/SIO_001048)
  def self.intervention_study
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001048')
  end

  # sampling is the act of obtaining a sample, whether through selection, collection or preparation.
  # (http://semanticscience.org/resource/SIO_001049)
  def self.sampling
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001049')
  end

  # a sample is a limited quantity of something (e.g. an individual or set of individuals from a population, or a portion of a substance) to be used for testing, analysis, inspection, investigation, demonstration, or trial use.
  # (http://semanticscience.org/resource/SIO_001050)
  def self.sample
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001050')
  end

  # Analysis of data is a process of inspecting, cleaning, transforming, and modeling data with the goal of highlighting useful information, suggesting conclusions, and supporting decision making.
  # (http://semanticscience.org/resource/SIO_001051)
  def self.data_analysis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001051')
  end

  # the act of collecting data for further analysis.
  # (http://semanticscience.org/resource/SIO_001052)
  def self.data_collection
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001052')
  end

  # A reason is a justification that specifies the motive for an action or a determination
  # (http://semanticscience.org/resource/SIO_001053)
  def self.reason
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001053')
  end

  # measurement is a procedure to obtain a measurement value.
  # (http://semanticscience.org/resource/SIO_001054)
  def self.measurement
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001054')
  end

  # an observation is a process of passive interaction in which one entity makes note of attributes of one or more entities.
  # (http://semanticscience.org/resource/SIO_001055)
  def self.observation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001055')
  end

  # the ordinal position of a character in a sequence of characters.
  # (http://semanticscience.org/resource/SIO_001056)
  def self.character_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001056')
  end

  # the ordinal position of a character in a sequence of characters.
  # (http://semanticscience.org/resource/SIO_001056)
  def self.character_offset
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001056')
  end

  # the position of the first character in a word as an offset from the first character of the text in which it is found.
  # (http://semanticscience.org/resource/SIO_001057)
  def self.word_start_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001057')
  end

  # word end position is the position of the last character in a word as an offset from the first character of the text in which it is found.
  # (http://semanticscience.org/resource/SIO_001058)
  def self.word_end_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001058')
  end

  # A physical gesture is a form of non-verbal communication in which visible bodily actions communicate particular messages, either in place of speech or together and in parallel with spoken words. Gestures include movement of the hands, face, or other parts of the body.
  # (http://semanticscience.org/resource/SIO_001059)
  def self.physical_gesture
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001059')
  end

  # planned is a process status for a process that has not yet started, but is referred to in a plan.
  # (http://semanticscience.org/resource/SIO_001060)
  def self.planned
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001060')
  end

  # A population is all the organisms that both belong to the same group or species and live in the same geographical area.
  # (http://semanticscience.org/resource/SIO_001061)
  def self.population
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001061')
  end

  # a human population refers to a collection of human beings.
  # (http://semanticscience.org/resource/SIO_001062)
  def self.human_population
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001062')
  end

  # a group of people affiliated by consanguinity, affinity, or co-residence.
  # (http://semanticscience.org/resource/SIO_001063)
  def self.family
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001063')
  end

  # a community is a sizeable social unit that shares common values.
  # (http://semanticscience.org/resource/SIO_001064)
  def self.community
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001064')
  end

  # speculation is an opinion based on incomplete evidence
  # (http://semanticscience.org/resource/SIO_001065)
  def self.speculation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001065')
  end

  # execution of study design is a process that results from precisely following each of the steps of a study design.
  # (http://semanticscience.org/resource/SIO_001066)
  def self.execution_of_study_design
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001066')
  end

  # In a controlled observational cohort study, two groups of subjects are selected from two populations that are thought to differ in only one characteristic. The groups of subjects are studied for a specific period and contrasted at the end of the study period.
  # (http://semanticscience.org/resource/SIO_001067)
  def self.controlled_observational_cohort_study
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001067')
  end

  # a control group is a group of individuals that are not subject to an intervention of interest, but rather serve as a baseline to compare the outcomes in the intervention group.
  # (http://semanticscience.org/resource/SIO_001068)
  def self.control_group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001068')
  end

  # An intervention group is a group of individuals that are subject to an intervention.
  # (http://semanticscience.org/resource/SIO_001069)
  def self.intervention_group
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001069')
  end

  # A control variable that is believed to alter the dependent or independent variables, but may not actually be the focus of the experiment. So that variable will be kept constant or monitored to try to minimise its effect on the experiment.
  # (http://semanticscience.org/resource/SIO_001070)
  def self.control_variable
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001070')
  end

  # A control variable that is believed to alter the dependent or independent variables, but may not actually be the focus of the experiment. So that variable will be kept constant or monitored to try to minimise its effect on the experiment.
  # (http://semanticscience.org/resource/SIO_001070)
  def self.extraneous_variable
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001070')
  end

  # text span start position is the position (offset) of the first character of a text span in relation the text it is from.
  # (http://semanticscience.org/resource/SIO_001071)
  def self.text_span_start_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001071')
  end

  def self.text_span_end_position
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001072')
  end

  def self.text_span_end_position_is_the_position_offset_of_the_last_character_of_a_text_span_in_relation_the_text_it_is_from
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001072')
  end

  # a text span is a subset of contiguous sequence of characters of a textual entity.
  # (http://semanticscience.org/resource/SIO_001073)
  def self.text_span
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001073')
  end

  # a t-statistic is a ratio of the departure of an estimated parameter from its notional value and its standard error. 
  # (http://semanticscience.org/resource/SIO_001074)
  def self.t_statistic
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001074')
  end

  # a microarray probe set identifier is an identifier for a set of probe pairs selected to represent expressed sequences on an array. 
  # (http://semanticscience.org/resource/SIO_001075)
  def self.microarray_probe_set_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001075')
  end

  def self.microarray_experiment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001076')
  end

  def self.gene_expression_value
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001077')
  end

  # a differential gene expression ratio is the ratio of gene expression values from a test sample compared to a control sample.
  # (http://semanticscience.org/resource/SIO_001078)
  def self.differential_gene_expression_ratio
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001078')
  end

  # a genotype is a functional specification of a biological entity in terms of its genetic composition (or lack thereof).
  # (http://semanticscience.org/resource/SIO_001079)
  def self.genotype
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001079')
  end

  # a vocabulary is a collection of terms.
  # (http://semanticscience.org/resource/SIO_001080)
  def self.vocabulary
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001080')
  end

  # a t-statistic based increased differential gene expression is a differential gene expression ratio in which the t-statistic is greater than zero.
  # (http://semanticscience.org/resource/SIO_001081)
  def self.t_statistic_based_increased_differential_gene_expression
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001081')
  end

  # a t-statistic based decreased differential gene expression is a differential gene expression ratio in which the t-statistic is less than zero.
  # (http://semanticscience.org/resource/SIO_001082)
  def self.t_statistic_based_decreased_differential_gene_expression
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001082')
  end

  # a date of database submission refers to the moment in time in which some information was submitted/received to a database system.
  # (http://semanticscience.org/resource/SIO_001083)
  def self.date_of_database_submission
    return RDF::URI.new('http://semanticscience.org/resource/SIO_001083')
  end

  # a biological organisn is a biological entity that consists of one or more cells and is capable of genomic replication (independently or not).
  # (http://semanticscience.org/resource/SIO_010000)
  def self.organism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010000')
  end

  # a cell is a biological entity that is contained by a plasma membrane.
  # (http://semanticscience.org/resource/SIO_010001)
  def self.cell
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010001')
  end

  # a tissue is a mereologically maximal collection of cells that together perform some function.
  # (http://semanticscience.org/resource/SIO_010002)
  def self.tissue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010002')
  end

  # an organ is a collection of tissues joined in structural unit to serve a common function.
  # (http://semanticscience.org/resource/SIO_010003)
  def self.organ
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010003')
  end

  # A chemical entity is a material entity that pertains to chemistry.
  # (http://semanticscience.org/resource/SIO_010004)
  def self.chemical_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010004')
  end

  # a weak submolecular component is a submolecular component that weakly connects submolecular components.
  # (http://semanticscience.org/resource/SIO_010005)
  def self.weak_submolecular_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010005')
  end

  def self.polypeptide
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010007')
  end

  def self.nucleic_acid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010008')
  end

  def self.ribonucleic_acid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010009')
  end

  def self.deoxyribonucleic_acid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010010')
  end

  def self.lipid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010011')
  end

  # A chemical interaction is a biochemical process in which chemical entities interact through some set of attractive forces.
  # (http://semanticscience.org/resource/SIO_010013)
  def self.chemical_interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010013')
  end

  def self.primary_structure_descriptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010014')
  end

  def self.protein_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010015')
  end

  def self.polypeptide_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010015')
  end

  def self.nucleic_acid_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010016')
  end

  def self.ribonucleic_acid_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010017')
  end

  def self.RNA_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010017')
  end

  def self.deoxyribonucleic_acid_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010018')
  end

  def self.DNA_sequence
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010018')
  end

  # Biological data is scientific data relevant to biology.
  # (http://semanticscience.org/resource/SIO_010019)
  def self.biological_data
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010019')
  end

  # A submolecular entity is a part of a molecular entity.
  # (http://semanticscience.org/resource/SIO_010020)
  def self.submolecular_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010020')
  end

  def self.secondary_structure_descriptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010022')
  end

  def self.tertiary_structure_descriptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010023')
  end

  def self.quaternary_structure
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010024')
  end

  def self.carbohydrate_polymer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010025')
  end

  # genetic polymorphism is a biological feature that provides information about a comparative difference in genetic composition.
  # (http://semanticscience.org/resource/SIO_010026)
  def self.genetic_polymorphism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010026')
  end

  # single nucleotide polymorphism (SNP) is a variation in a single base in the genetic composition between different individuals of the same species.
  # (http://semanticscience.org/resource/SIO_010027)
  def self.snp
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010027')
  end

  def self.genetic_data
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010028')
  end

  def self.biological_sex
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010029')
  end

  def self.monosaccharide
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010030')
  end

  # A PDB chain identifier is a alphabetical label to identify a molecule in a structure.
  # (http://semanticscience.org/resource/SIO_010031)
  def self.PDB_chain_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010031')
  end

  # A PDB record identifier is an identifier for a PDB generated record.
  # (http://semanticscience.org/resource/SIO_010032)
  def self.PDB_record_identifier
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010032')
  end

  # a hydrogen bond is a weak submolecular interaction formed between a hydrogen atom and a electronegative atom.
  # (http://semanticscience.org/resource/SIO_010033)
  def self.hydrogen_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010033')
  end

  # A cation pi interaction is an ionic interaction between the localized negative charge of π orbital electrons, located above and below the plane of an aromatic ring, and a positive charge.
  # (http://semanticscience.org/resource/SIO_010034)
  def self.cation_pi_interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010034')
  end

  # A gene is part of a nucleic acid that contains all the necessary elements to encode a functional transcript.
  # (http://semanticscience.org/resource/SIO_010035)
  def self.gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010035')
  end

  # A biochemical reaction is a biochemical process that involves the conversion of at least one chemical participant (target) into another (product) by an enzyme (agent).
  # (http://semanticscience.org/resource/SIO_010036)
  def self.biochemical_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010036')
  end

  # a chemical element is a homogeneous substance composed of one type of atom.
  # (http://semanticscience.org/resource/SIO_010037)
  def self.chemical_element
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010037')
  end

  # A drug is a chemical entity that regulates a biological process.
  # (http://semanticscience.org/resource/SIO_010038)
  def self.drug
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010038')
  end

  # A pharmaceutical preparation is a chemical substance approved for use in the medical diagnosis, cure, treatment, or prevention of disease.
  # (http://semanticscience.org/resource/SIO_010039)
  def self.pharmaceutical_preparation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010039')
  end

  def self.binding_site
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010040')
  end

  def self.active_site
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010041')
  end

  # A haplotype is one of a set of genomic sequence variants.
  # (http://semanticscience.org/resource/SIO_010042)
  def self.haplotype
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010042')
  end

  def self.protein
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010043')
  end

  # An atom is composed of a core of protons and/or neutrons which may be surrounded by a cloud of electrons.
  # (http://semanticscience.org/resource/SIO_010044)
  def self.atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010044')
  end

  # a base pair is a weak molecular interaction composed of hydrogen bonds between nucleobases.
  # (http://semanticscience.org/resource/SIO_010045)
  def self.base_pair
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010045')
  end

  # a biological entity is a heterogeneous substance that contains genomic material or is the product of a biological process.
  # (http://semanticscience.org/resource/SIO_010046)
  def self.biological_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010046')
  end

  # a strong submolecular component is a submolecular component that strongly connects submolecular components.
  # (http://semanticscience.org/resource/SIO_010047)
  def self.strong_submolecular_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010047')
  end

  # male is a biological sex of an individual with male sexual organs.
  # (http://semanticscience.org/resource/SIO_010048)
  def self.male
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010048')
  end

  def self.molecular_site
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010049')
  end

  def self.allosteric_site
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010050')
  end

  # a biological fluid is a fluid of biological origin.
  # (http://semanticscience.org/resource/SIO_010051)
  def self.biological_fluid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010051')
  end

  # female is a biological sex of an individual with female sexual organs.
  # (http://semanticscience.org/resource/SIO_010052)
  def self.female
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010052')
  end

  def self.lineage
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010053')
  end

  # A cell line is a collection of genetically identifical cells.
  # (http://semanticscience.org/resource/SIO_010054)
  def self.cell_line
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010054')
  end

  # A strain is a genetic variant or kind of microorganism.
  # (http://semanticscience.org/resource/SIO_010055)
  def self.strain
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010055')
  end

  # a phenotype is an observable characteristic of an individual.
  # (http://semanticscience.org/resource/SIO_010056)
  def self.phenotype
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010056')
  end

  def self.organismal_stative_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010057')
  end

  # alive is the state of a biological organism that exhibits biological functions.
  # (http://semanticscience.org/resource/SIO_010058)
  def self.alive
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010058')
  end

  # dead is the quality of an object in which there is a cessation of all biological functions.
  # (http://semanticscience.org/resource/SIO_010059)
  def self.dead
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010059')
  end

  def self.family_history
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010060')
  end

  def self.generation_number
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010061')
  end

  # The five prime untranslated region (5' UTR) is a section of messenger RNA (mRNA) and the DNA that codes for it that starts at the +1 position (where transcription begins) and ends one nucleotide before the start codon (usually AUG) of the coding region.
  # (http://semanticscience.org/resource/SIO_010064)
  def self.a_untranslated_region
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010064')
  end

  def self.bioinformatic_data
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010065')
  end

  def self.sequence_alignment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010066')
  end

  def self.multiple_sequence_alignment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010067')
  end

  def self.pairwise_sequence_alignment
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010068')
  end

  def self.organic_submolecule
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010071')
  end

  # An organic molecular entity is a chemical entity composed of organic atoms (at least carbon, hydrogen, and optionally oxygen, phosphorus, nitrogen)
  # (http://semanticscience.org/resource/SIO_010072)
  def self.organic_molecule
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010072')
  end

  def self.open_reading_frame
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010073')
  end

  def self.amino_acid_residue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010074')
  end

  def self.nucleotide_residue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010075')
  end

  # A poison is a drug that is harzardous or toxic to an organism when ingested at a certain quantity.
  # (http://semanticscience.org/resource/SIO_010076)
  def self.poison
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010076')
  end

  # An active ingredient is a molecular entity that exhibits
  # (http://semanticscience.org/resource/SIO_010077)
  def self.active_ingredient
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010077')
  end

  # An operon is a collection of contiguous genes transcribed as a single (polycistronic) mRNA.
  # (http://semanticscience.org/resource/SIO_010084)
  def self.operon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010084')
  end

  def self.gene_regulatory_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010085')
  end

  def self.enhancer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010086')
  end

  def self.inactive_ingredient
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010087')
  end

  def self.to_serve_as_a_template_for_molecular_synthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010088')
  end

  def self.to_serve_as_a_template_for_protein_synthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010089')
  end

  def self.to_serve_as_a_template_for_RNA_synthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010090')
  end

  def self.to_serve_as_a_template_for_DNA_synthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010091')
  end

  def self.deoxyribonucleic_acid_template
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010092')
  end

  def self.deoxyribonucleic_acid_primer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010093')
  end

  def self.to_serve_as_a_primer_for_DNA_synthesis
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010094')
  end

  def self.RNA_transcript_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010095')
  end

  def self.mature_mRNA
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010096')
  end

  # Precursor mRNA (pre-mRNA) is a single strand of messenger ribonucleic acid (mRNA) that is synthesized from a DNA template throught transcription.
  # (http://semanticscience.org/resource/SIO_010097)
  def self.pre_mRNA
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010097')
  end

  def self.mRNA_splice_variant
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010098')
  end

  def self.messenger_RNA
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010099')
  end

  # a gene that is located on DNA.
  # (http://semanticscience.org/resource/SIO_010100)
  def self.dna_gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010100')
  end

  # a gene that is located on RNA
  # (http://semanticscience.org/resource/SIO_010101)
  def self.rna_gene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010101')
  end

  # an allele is one of a set of sequence variants of a gene.
  # (http://semanticscience.org/resource/SIO_010277)
  def self.allele
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010277')
  end

  # Ploidy is the cellular quality relating to the amount of DNA contained in a cell.
  # (http://semanticscience.org/resource/SIO_010278)
  def self.ploidy
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010278')
  end

  # Chemical transport is the directed movement of a chemical entity by some agent (e.g. transporter).
  # (http://semanticscience.org/resource/SIO_010283)
  def self.chemical_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010283')
  end

  # Active transport is the movement of a substance across a membrane against its concentration gradient (from low to high concentration) and requires chemical energy.
  # (http://semanticscience.org/resource/SIO_010284)
  def self.active_transport
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010284')
  end

  def self.molecular_complex_formation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010285')
  end

  def self.molecular_complex_dissociation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010286')
  end

  # Biochemical regulation is a biochemical process that changes the frequency, rate or extent of a downstream biochemical process.
  # (http://semanticscience.org/resource/SIO_010287)
  def self.biochemical_regulation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010287')
  end

  # Biochemical activation is a molecular interaction that increases the catalytic rate of the target enzyme.
  # (http://semanticscience.org/resource/SIO_010288)
  def self.biochemical_activation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010288')
  end

  # Biochemical inhibition is a molecular interaction that decreases the catalytic rate of the target enzyme.
  # (http://semanticscience.org/resource/SIO_010289)
  def self.biochemical_inhibition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010289')
  end

  # Positve regulation is a biochemical regulation that increases the frequency, rate or extent of a downstream biochemical process.
  # (http://semanticscience.org/resource/SIO_010295)
  def self.positive_regulation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010295')
  end

  # Positve regulation is a biochemical regulation that increases the frequency, rate or extent of a downstream biochemical process.
  # (http://semanticscience.org/resource/SIO_010295)
  def self.Positive_biochemical_regulation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010295')
  end

  # Negative regulation is a biochemical regulation that decreases the frequency, rate or extent of a downstream biochemical process.
  # (http://semanticscience.org/resource/SIO_010296)
  def self.negative_regulation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010296')
  end

  # Negative regulation is a biochemical regulation that decreases the frequency, rate or extent of a downstream biochemical process.
  # (http://semanticscience.org/resource/SIO_010296)
  def self.Negative_biochemical_regulation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010296')
  end

  def self.medical_data
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010298')
  end

  # disease is the outward manifestation of one or more disorders.
  # (http://semanticscience.org/resource/SIO_010299)
  def self.disease
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010299')
  end

  # Transcription is the process of creating a complementary RNA copy of a sequence of DNA.
  # (http://semanticscience.org/resource/SIO_010300)
  def self.transcription
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010300')
  end

  # Translation is the process of producing a polypeptide from a ribonucleic acid by a ribosome.
  # (http://semanticscience.org/resource/SIO_010301)
  def self.translation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010301')
  end

  def self.molecular_modification
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010307')
  end

  # Metabolism is the set of chemical processes that occur within a living organism in order to maintain life.
  # (http://semanticscience.org/resource/SIO_010308)
  def self.metabolism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010308')
  end

  # Anabolism is the set of metabolic processes that take apart larger chemical entities units into smaller chemical entities.
  # (http://semanticscience.org/resource/SIO_010309)
  def self.catabolism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010309')
  end

  # Anabolism is the set of metabolic processes that construct larger chemical entities units from smaller chemical entities.
  # (http://semanticscience.org/resource/SIO_010310)
  def self.anabolism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010310')
  end

  def self.carbohydrate_residue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010334')
  end

  def self.nucleic_acid_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010335')
  end

  def self.deoxyribonucleotide_residue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010336')
  end

  def self.ribonucleotide_residue
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010337')
  end

  def self.pharmaceutical_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010338')
  end

  def self.to_covalently_modify
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010340')
  end

  # A covalently connected molecular entity is the mereological sum of a collection of covalently bonded atoms.
  # (http://semanticscience.org/resource/SIO_010341)
  def self.covalently_connected_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010341')
  end

  # a chemical complex is a chemical entity composed of a weakly connected ions or molecules.
  # (http://semanticscience.org/resource/SIO_010342)
  def self.chemical_complex
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010342')
  end

  # an enzyme is a protein or protein complex that realizes its disposition to covalently modify some molecule during a chemical reaction.
  # (http://semanticscience.org/resource/SIO_010343)
  def self.enzyme
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010343')
  end

  # a catalyst is a molecule that has the capability to reduce the activation energy of a reaction and hence increase the overall rate of reaction.
  # (http://semanticscience.org/resource/SIO_010344)
  def self.catalyst
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010344')
  end

  # A chemical reaction is a process that leads to the transformation of one set of chemical substances to another.
  # (http://semanticscience.org/resource/SIO_010345)
  def self.chemical_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010345')
  end

  def self.organic_polymer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010346')
  end

  def self.to_modify_conformation_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010347')
  end

  def self.to_cleave
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010349')
  end

  def self.to_combine
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010351')
  end

  def self.to_breathe
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010353')
  end

  def self.to_conformationally_activate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010354')
  end

  def self.to_conformationally_inhibit
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010355')
  end

  def self.to_modify_oxidation_state_of
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010360')
  end

  def self.substrate
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010362')
  end

  def self.product
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010363')
  end

  def self.to_be_modified
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010364')
  end

  def self.to_be_cleaved
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010365')
  end

  def self.to_be_covalently_modified
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010366')
  end

  def self.to_be_combined
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010367')
  end

  # to be transported is the disposition to undergo motion.
  # (http://semanticscience.org/resource/SIO_010368)
  def self.to_be_transported
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010368')
  end

  def self.to_be_electronically_modified
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010369')
  end

  def self.to_gain_an_electron
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010370')
  end

  def self.to_lose_an_electron
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010371')
  end

  def self.to_be_activated
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010372')
  end

  def self.to_be_inhibited
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010373')
  end

  def self.to_be_conformationally_changed
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010374')
  end

  # a multi-cellular organism is an organism that consists of more than one cell.
  # (http://semanticscience.org/resource/SIO_010375)
  def self.multicellular_organism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010375')
  end

  # a unicellular organism is a organism that is composed of a single cell.
  # (http://semanticscience.org/resource/SIO_010376)
  def self.unicellular_organism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010376')
  end

  def self.cellular_organism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010377')
  end

  def self.non_cellular_organism
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010378')
  end

  def self.virus
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010379')
  end

  # A drug regulatory authority is a regulatory authority which acts to control what substances may be used to treat individuals.
  # (http://semanticscience.org/resource/SIO_010383)
  def self.drug_regulatory_authority
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010383')
  end

  def self.specialized_chemical_entity
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010410')
  end

  # A reagent is a substance that is added to a system in order to bring about a chemical reaction, or added to see if a reaction occurs.
  # (http://semanticscience.org/resource/SIO_010411)
  def self.reagent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010411')
  end

  # A specimen is a portion of material for use in testing, examination, or study.
  # (http://semanticscience.org/resource/SIO_010412)
  def self.specimen
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010412')
  end

  # A pathogen or infectious agent  is a microorganism that causes disease in its host.
  # (http://semanticscience.org/resource/SIO_010414)
  def self.pathogen
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010414')
  end

  # a host is an organism that harbors a parasite, or a mutual or commensal symbiont, typically providing nourishment and shelter.
  # (http://semanticscience.org/resource/SIO_010415)
  def self.host
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010415')
  end

  # A buffer is a dissolved chemical substance that resists change in pH upon addition of small amounts of acid or base.
  # (http://semanticscience.org/resource/SIO_010416)
  def self.buffer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010416')
  end

  # A solvent is a liquid substance that can dissolve other substances (solutes).
  # (http://semanticscience.org/resource/SIO_010417)
  def self.solvent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010417')
  end

  # a solute is a substance that becomes dissolved in a solvent.
  # (http://semanticscience.org/resource/SIO_010418)
  def self.solute
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010418')
  end

  # An antigen is a chemical entity that can be bound by a major histocompatibility complex (MHC) and presented to a T-cell receptor.
  # (http://semanticscience.org/resource/SIO_010419)
  def self.antigen
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010419')
  end

  def self.receptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010420')
  end

  def self.target
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010423')
  end

  # a centrifugation pellet is a solid substance that forms as a result of compaction by a centrifuge.
  # (http://semanticscience.org/resource/SIO_010424)
  def self.centrifugation_pellet
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010424')
  end

  # a supernatent is a liquid substance that remains after centrifugation.
  # (http://semanticscience.org/resource/SIO_010425)
  def self.supernatant
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010425')
  end

  # a centrifugation substance is a substance that is the target or product of centrifugation.
  # (http://semanticscience.org/resource/SIO_010426)
  def self.centrifugation_substance
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010426')
  end

  # a solution component is a part of a solution.
  # (http://semanticscience.org/resource/SIO_010427)
  def self.solution_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010427')
  end

  # an evaluation role is a processual role held by an entity during some evaluation
  # (http://semanticscience.org/resource/SIO_010428)
  def self.evaluation_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010428')
  end

  # A placebo is a medically ineffectual treatment for a medical condition intended to deceive the recipient.
  # (http://semanticscience.org/resource/SIO_010429)
  def self.placebo
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010429')
  end

  def self.test_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010430')
  end

  def self.control_role
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010431')
  end

  # a ligand is a molecule that is part of a complex by weakly interacting with another molecule 
  # (http://semanticscience.org/resource/SIO_010432)
  def self.ligand
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010432')
  end

  # a low barrier hydrogen bond is a shorter, stronger hydrogen bond that is formed between both heteroatoms.
  # (http://semanticscience.org/resource/SIO_010433)
  def self.low_barrier_hydrogen_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010433')
  end

  # a molecular activator is a molecular regulator that realizes its disposition to conformationally change a target molecule and increase its functionality.
  # (http://semanticscience.org/resource/SIO_010434)
  def self.activator
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010434')
  end

  # a molecular inhibitor is a molecular regulator that realizes its disposition to conformationally change a target molecule and decrease its functionality.
  # (http://semanticscience.org/resource/SIO_010435)
  def self.inhibitor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010435')
  end

  # a molecular regulator is a molecule that regulates the function of another chemical entity.
  # (http://semanticscience.org/resource/SIO_010436)
  def self.molecular_regulator
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010436')
  end

  def self.signal_transducer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010437')
  end

  def self.signal
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010438')
  end

  def self.messenger
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010439')
  end

  def self.second_messenger
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010440')
  end

  # a submolecule is a mereological sum of covalently bonded atoms
  # (http://semanticscience.org/resource/SIO_010441)
  def self.submolecule
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010441')
  end

  def self.charge_quality
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010442')
  end

  def self.intron
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010443')
  end

  # a gene component is a component of a gene, whether DNA or RNA
  # (http://semanticscience.org/resource/SIO_010444)
  def self.gene_component
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010444')
  end

  def self.exon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010445')
  end

  def self.promoter
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010446')
  end

  def self.start_codon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010447')
  end

  def self.stop_codon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010448')
  end

  def self.RNA_transcript
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010450')
  end

  def self.splice_site
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010451')
  end

  # a molecular pocket is a site on a molecule that appears as a depression into the structure.
  # (http://semanticscience.org/resource/SIO_010452)
  def self.molecular_pocket
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010452')
  end

  # An acid is a molecular entity in solution capable of donating a hydron (Bronsted acid) or capable of forming a covalent bond with an electron pair (Lewis acid).
  # (http://semanticscience.org/resource/SIO_010453)
  def self.acid
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010453')
  end

  # A base is a molecular entity dissolved in a solvent that is capable of accepting a proton (Bronsted base) or forming a covalent bond with a hydron (Lewis base) .
  # (http://semanticscience.org/resource/SIO_010454)
  def self.base
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010454')
  end

  # An isomer is a molecule that is compositionally identical to another molecule as a result of a different atomic connectivity.
  # (http://semanticscience.org/resource/SIO_010455)
  def self.isomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010455')
  end

  # An ion is an atom or molecule in which the total number of electrons is not equal to the total number of protons, giving it a net positive or negative electrical charge.
  # (http://semanticscience.org/resource/SIO_010456)
  def self.ion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010456')
  end

  # An anion is an atom or molecule with a net positive electrical charge.
  # (http://semanticscience.org/resource/SIO_010457)
  def self.cation
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010457')
  end

  # An anion is an atom or molecule with a net negative electrical charge.
  # (http://semanticscience.org/resource/SIO_010458)
  def self.anion
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010458')
  end

  # a polar solvent is a solvent that exhibits a polar quality.
  # (http://semanticscience.org/resource/SIO_010459)
  def self.polar_solvent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010459')
  end

  def self.nonpolar_solvent
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010460')
  end

  # the quality of having a positive charge
  # (http://semanticscience.org/resource/SIO_010461)
  def self.positive_charge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010461')
  end

  def self.heterogeneous_substance
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010462')
  end

  def self.homogeneous_substance
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010463')
  end

  # the quality of having a negative charge
  # (http://semanticscience.org/resource/SIO_010464)
  def self.negative_charge
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010464')
  end

  # An antibody (also known as immunoglobulins, abbreviated Ig) are gamma globulin proteins that are used by the immune system to identify and neutralize foreign objects. They are typically made of two large heavy chains and two small light chains.
  # (http://semanticscience.org/resource/SIO_010465)
  def self.antibody
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010465')
  end

  def self.alpha_helix
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010468')
  end

  def self.beta_strand
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010469')
  end

  def self.protein_part
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010471')
  end

  # an ionic interaction is a weak submolecular interaction between a charged submolecules.
  # (http://semanticscience.org/resource/SIO_010496)
  def self.ionic_interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010496')
  end

  # a protein complex is a molecular complex composed of at least two polypeptide chains.
  # (http://semanticscience.org/resource/SIO_010497)
  def self.protein_complex
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010497')
  end

  def self.single_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010498')
  end

  def self.double_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010499')
  end

  def self.triple_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010500')
  end

  def self.aromatic_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010501')
  end

  def self.disulfide_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010502')
  end

  # a dipole-dipole interaction is a weak submolecular interaction between strongly electronegative atoms.
  # (http://semanticscience.org/resource/SIO_010503)
  def self.dipole_dipole_interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010503')
  end

  # van der Waals' interaction is an a weak submolecular interaction between an instantaneous dipole and induced dipole.
  # (http://semanticscience.org/resource/SIO_010504)
  def self.van_der_Waals_interaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010504')
  end

  def self.base_stack
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010505')
  end

  # a molecular complex is a chemical complex composed of weakly interacting molecular entities, and excludes bulk solvent.
  # (http://semanticscience.org/resource/SIO_010506)
  def self.molecular_complex
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010506')
  end

  # an acid-base reaction is a chemical reaction between an acid and a base.
  # (http://semanticscience.org/resource/SIO_010507)
  def self.acid_base_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010507')
  end

  # a catalyzed reaction is a chemical reaction that is facilitated by a catalyst.
  # (http://semanticscience.org/resource/SIO_010508)
  def self.catalyzed_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010508')
  end

  # a redox reaction is a chemical reaction in which there is a net movement of electrons from one reactant to another.
  # (http://semanticscience.org/resource/SIO_010509)
  def self.redox_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010509')
  end

  # An inorganic reaction is a chemical reaction that involves the transformation of inorganic molecules.
  # (http://semanticscience.org/resource/SIO_010510)
  def self.inorganic_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010510')
  end

  # A decomposition reaction is an inorganic reaction in which molecule is fragmented into submolecules or atoms.
  # (http://semanticscience.org/resource/SIO_010511)
  def self.decomposition_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010511')
  end

  # A displacement reaction is an inorganic reaction in which a elementary substance displaces and sets free a constituent atom from a molecule.
  # (http://semanticscience.org/resource/SIO_010512)
  def self.displacement_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010512')
  end

  # A double displacement reaction is a displacement reaction in which two molecules swap ions, effectively displacing each other to form two new molecules.
  # (http://semanticscience.org/resource/SIO_010513)
  def self.double_displacement_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010513')
  end

  # A single displacement reaction where one atom is transferred out of one molecule and into another.
  # (http://semanticscience.org/resource/SIO_010514)
  def self.single_displacement_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010514')
  end

  # A synthesis reaction is an inorganic reaction in which two or more molecules are chemically bonded together to produce a single product.
  # (http://semanticscience.org/resource/SIO_010515)
  def self.synthesis_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010515')
  end

  # An organic reaction is a chemical reaction involving at least one organic molecule.
  # (http://semanticscience.org/resource/SIO_010516)
  def self.organic_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010516')
  end

  # An isomerization reaction is a chemical reaction in which a molecule is converted into its isomer.
  # (http://semanticscience.org/resource/SIO_010517)
  def self.isomerization_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010517')
  end

  # An addition reaction is an organic reaction where two or more molecules combine to form a larger one. Addition reactions are limited to chemical compounds that have multiply-bonded atoms:
  #     * Molecules with carbon-carbon double bonds or triple bonds
  #     * Molecules with carbon - hetero double bonds like C=O or C=N
  # (http://semanticscience.org/resource/SIO_010518)
  def self.addition_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010518')
  end

  def self.polar_addition_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010519')
  end

  def self.non_polar_addition_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010520')
  end

  # A free radical addition is a non-polar addition reaction involving free radicals.
  # (http://semanticscience.org/resource/SIO_010521)
  def self.free_radical_addition
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010521')
  end

  # A nucleophilic addition reaction is an addition reaction where a pi bond is removed by the creation of two new covalent bonds by the addition from a nucleophile.
  # (http://semanticscience.org/resource/SIO_010522)
  def self.nucleophilic_addition_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010522')
  end

  # an electrophilic addition reaction is a polar addition reaction where a pi bond is removed by the creation of two new covalent bonds.
  # (http://semanticscience.org/resource/SIO_010523)
  def self.electrophilic_addition_reaction
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010523')
  end

  # a biochemical pathway specifies a series of biochemical reactions towards achieving some objective.
  # (http://semanticscience.org/resource/SIO_010525)
  def self.biochemical_pathway
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010525')
  end

  # a chemical reaction pathway specifies is a series of chemical reactions towards producing some chemical product.
  # (http://semanticscience.org/resource/SIO_010526)
  def self.chemical_reaction_pathway
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010526')
  end

  def self.chemical_synthesis_pathway
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010527')
  end

  def self.chemical_degradation_pathway
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010528')
  end

  def self.a_d_structure_model
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010530')
  end

  def self.sequence_profile
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010531')
  end

  # a metabolic pathway is a series of biochemical reactions that begins with one or more substrates and ends with one or more products.
  # (http://semanticscience.org/resource/SIO_010532)
  def self.metabolic_pathway
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010532')
  end

  # a regulatory pathway is a series of biochemical reactions that lead to the increase or decrease of activity of participating molecular components.
  # (http://semanticscience.org/resource/SIO_010533)
  def self.regulatory_pathway
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010533')
  end

  def self.medical_history
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010673')
  end

  # a binary compound is a mereological maximum sum of two kinds of weakly connected entities.
  # (http://semanticscience.org/resource/SIO_010674)
  def self.binary_compound
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010674')
  end

  # A stereoisomer is an isomer in which the atomic connectivity is the same, but differs in its spatial arrangement of atoms.
  # (http://semanticscience.org/resource/SIO_010775)
  def self.stereoisomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010775')
  end

  # A diastereomer is a stereoisomer that is not a mirror image of its isomer.
  # (http://semanticscience.org/resource/SIO_010776)
  def self.diastereomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010776')
  end

  # An enantiomer is a stereoisomer that is a mirror image of its isomer.
  # (http://semanticscience.org/resource/SIO_010777)
  def self.enantiomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010777')
  end

  # An optical isomer is a stereoisomer that rotates the plane of polarization of a beam of plane polarized light.
  # (http://semanticscience.org/resource/SIO_010778)
  def self.optical_isomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010778')
  end

  # A structural isomer is an isomer in which the atoms are joined together in different ways.
  # (http://semanticscience.org/resource/SIO_010779)
  def self.structural_isomer
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010779')
  end

  # a ring is a submolecule with a circular topology.
  # (http://semanticscience.org/resource/SIO_010780)
  def self.ring
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010780')
  end

  # An aromatic ring is a ring in which the electrons are delocalized across all atoms in the ring.
  # (http://semanticscience.org/resource/SIO_010781)
  def self.aromatic_ring
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010781')
  end

  # a heterocyclic ring is a ring containing a hetero atom.
  # (http://semanticscience.org/resource/SIO_010782)
  def self.heterocyclic_ring
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010782')
  end

  # A homocyclic ring is a ring where the atoms are of a single type.
  # (http://semanticscience.org/resource/SIO_010783)
  def self.homocyclic_ring
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010783')
  end

  # an ionic compound is a mereological maximal sum of weakly connected paired positive and negative ions.
  # (http://semanticscience.org/resource/SIO_010784)
  def self.ionic_compound
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010784')
  end

  # an allotrope is a structural variant of a chemical element.
  # (http://semanticscience.org/resource/SIO_010785)
  def self.allotrope
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010785')
  end

  def self.carbon_allotrope
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010786')
  end

  # Diamond is a carbon allotrope in which each carbon atom in diamond is covalently bonded to four other carbons in a tetrahedron. These tetrahedrons together form a 3-dimensional network of puckered six-membered rings of atoms.
  # (http://semanticscience.org/resource/SIO_010787)
  def self.diamond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010787')
  end

  # graphite is an allotrope of carbon which is a conductor, and is the most stable form of solid carbon.
  # (http://semanticscience.org/resource/SIO_010788)
  def self.graphite
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010788')
  end

  # Fullerene is a carbon allotrope which take the form of a hollow sphere, ellipsoid, or tube.
  # (http://semanticscience.org/resource/SIO_010789)
  def self.fullerene
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010789')
  end

  # aggregate of carbon nanorods is an allotrope of carbon considered to be the least compressible material known, as measured by its isothermal bulk modulus; aggregated diamond nanorods have a modulus of 491 gigapascals (GPa), while a conventional diamond has a modulus of 442 GPa. ADNRs are also 0.3% denser than regular diamond.
  # (http://semanticscience.org/resource/SIO_010790)
  def self.aggregated_carbon_nanorods
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010790')
  end

  # Amorphous carbon is an allotrope of carbon that does not have any crystalline structure. As with all glassy materials, some short-range order can be observed, but there is no long-range pattern of atomic positions.
  # (http://semanticscience.org/resource/SIO_010791)
  def self.amorphous_carbon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010791')
  end

  # carbon nanofoam is an allotrope of carbon that consists of a low-density cluster-assembly of carbon atoms strung together in a loose three-dimensional web. Each cluster is about 6 nanometers wide and consists of about 4000 carbon atoms linked in graphite-like sheets that are given negative curvature by the inclusion of heptagons among the regular hexagonal pattern.
  # (http://semanticscience.org/resource/SIO_010792)
  def self.carbon_nanofoam
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010792')
  end

  # chaoite is an allotrope of carbon that is slightly harder than graphite with a reflection colour of grey to white.
  # (http://semanticscience.org/resource/SIO_010793)
  def self.chaoite
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010793')
  end

  # glassy carbon is an allotrope of carbon which is widely used as an electrode material in electrochemistry, as well as for high temperature crucibles and as a component of some prosthetic devices.
  # (http://semanticscience.org/resource/SIO_010794)
  def self.glassy_carbon
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010794')
  end

  # ionsdaleite is a hexagonal allotrope of the carbon allotrope diamond.
  # (http://semanticscience.org/resource/SIO_010795)
  def self.ionsdaleite
    return RDF::URI.new('http://semanticscience.org/resource/SIO_010795')
  end

  def self.boron_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011000')
  end

  def self.carbon_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011001')
  end

  def self.hydrogen_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011002')
  end

  def self.helium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011003')
  end

  def self.lithium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011004')
  end

  def self.beryllium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011005')
  end

  def self.nitrogen_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011006')
  end

  def self.oxygen_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011007')
  end

  def self.fluorine_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011008')
  end

  def self.neon_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011009')
  end

  def self.sodium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011010')
  end

  def self.magnesium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011011')
  end

  def self.aluminium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011012')
  end

  def self.silicon_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011013')
  end

  def self.phosphorus_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011014')
  end

  def self.sulfur_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011015')
  end

  def self.chlorine_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011016')
  end

  def self.argon_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011017')
  end

  def self.potassium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011018')
  end

  def self.calcium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011019')
  end

  def self.scandium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011020')
  end

  def self.titanium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011021')
  end

  def self.vanadium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011022')
  end

  def self.chromium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011023')
  end

  def self.manganese_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011024')
  end

  def self.iron_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011025')
  end

  def self.cobalt_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011026')
  end

  def self.nickel_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011027')
  end

  def self.copper_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011028')
  end

  def self.zinc_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011029')
  end

  def self.gallium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011030')
  end

  def self.germanium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011031')
  end

  def self.arsenic_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011032')
  end

  def self.selenium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011033')
  end

  def self.bromine_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011034')
  end

  def self.krypton_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011035')
  end

  def self.rubidium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011036')
  end

  def self.strontium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011037')
  end

  def self.yttrium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011038')
  end

  def self.zirconium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011039')
  end

  def self.niobium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011040')
  end

  def self.molybdemum_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011041')
  end

  def self.technetium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011042')
  end

  def self.ruthenium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011043')
  end

  def self.rhodium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011044')
  end

  def self.palladium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011045')
  end

  def self.silver_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011046')
  end

  def self.cadmium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011047')
  end

  def self.indium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011048')
  end

  def self.tin_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011049')
  end

  def self.antimony_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011050')
  end

  def self.tellurium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011051')
  end

  def self.iodine_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011052')
  end

  def self.xenon_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011053')
  end

  def self.caesium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011054')
  end

  def self.barium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011055')
  end

  def self.lanthanum_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011056')
  end

  def self.hafnium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011057')
  end

  def self.tantalum_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011058')
  end

  def self.tungsten_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011059')
  end

  def self.rhenium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011060')
  end

  def self.osmium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011061')
  end

  def self.iridium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011062')
  end

  def self.platinum_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011063')
  end

  def self.gold_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011064')
  end

  def self.mercury_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011065')
  end

  def self.thallium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011066')
  end

  def self.lead_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011067')
  end

  def self.bismuth_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011068')
  end

  def self.polonium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011069')
  end

  def self.astatine_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011070')
  end

  def self.radon_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011071')
  end

  def self.francium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011072')
  end

  def self.radium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011073')
  end

  def self.actinium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011074')
  end

  def self.rutherfordium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011075')
  end

  def self.dubnium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011076')
  end

  def self.seaborgium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011077')
  end

  def self.bohrium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011078')
  end

  def self.hassium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011079')
  end

  def self.meitnerium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011080')
  end

  def self.darmstadtium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011081')
  end

  def self.roentgenium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011082')
  end

  def self.copernicium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011083')
  end

  def self.unutrium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011084')
  end

  def self.ununquadium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011085')
  end

  def self.ununpentium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011086')
  end

  def self.ununhexium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011087')
  end

  def self.ununseptium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011088')
  end

  def self.ununoctium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011089')
  end

  def self.cerium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011090')
  end

  def self.praseodymium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011091')
  end

  def self.neodymium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011092')
  end

  def self.promethium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011093')
  end

  def self.samarium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011094')
  end

  def self.europium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011095')
  end

  def self.gadolinium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011096')
  end

  def self.terbium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011097')
  end

  def self.dysprosium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011098')
  end

  def self.holmium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011099')
  end

  def self.erbium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011100')
  end

  def self.thulium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011101')
  end

  def self.ytterbium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011102')
  end

  def self.lutetium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011103')
  end

  def self.thorium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011104')
  end

  def self.protactinium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011105')
  end

  def self.uranium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011106')
  end

  def self.neptunium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011107')
  end

  def self.plutonium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011108')
  end

  def self.americium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011109')
  end

  def self.curium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011110')
  end

  def self.berkelium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011111')
  end

  def self.californium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011112')
  end

  def self.einsteinium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011113')
  end

  def self.fermium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011114')
  end

  def self.mendelevium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011115')
  end

  def self.nobelium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011116')
  end

  def self.lawrencium_atom
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011117')
  end

  # a covalent chemical bond is a strong submolecular interaction between atoms.
  # (http://semanticscience.org/resource/SIO_011118)
  def self.covalent_chemical_bond
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011118')
  end

  def self.biomolecular_structure_descriptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011119')
  end

  def self.molecular_structure_file
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011120')
  end

  def self.molecular_structure_descriptor
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011121')
  end

  def self.chemical_data
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011123')
  end

  # A molecule is the mereological maximal sum of a collection of covalently bonded atoms.
  # (http://semanticscience.org/resource/SIO_011125)
  def self.molecule
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011125')
  end

  # A chemical substance is a chemical complex of weakly interacting molecular entities, and may include bulk solvent.
  # (http://semanticscience.org/resource/SIO_011126)
  def self.chemical_substance
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011126')
  end

  def self.PDB_file
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011130')
  end

  def self.collection_of_3d_molecular_structure_models
    return RDF::URI.new('http://semanticscience.org/resource/SIO_011131')
  end

  # Determines whether the given URI is an object property.
  #
  # +uri+:: URI that is tested for being an object property
  def self.is_object_property?(uri)
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000001') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000008') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000011') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000020') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000028') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000029') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000053') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000054') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000059') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000060') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000061') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000062') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000063') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000064') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000066') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000068') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000093') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000095') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000096') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000128') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000132') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000139') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000145') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000202') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000203') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000204') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000205') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000206') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000207') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000208') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000209') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000210') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000211') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000212') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000213') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000214') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000215') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000216') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000217') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000218') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000219') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000221') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000222') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000223') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000224') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000225') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000226') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000227') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000228') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000229') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000230') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000231') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000232') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000233') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000234') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000235') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000236') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000240') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000241') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000242') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000243') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000244') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000245') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000246') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000247') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000248') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000249') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000250') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000251') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000252') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000253') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000254') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000255') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000272') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000273') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000274') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000277') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000278') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000283') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000286') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000288') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000291') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000292') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000293') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000294') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000310') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000311') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000312') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000313') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000322') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000323') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000324') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000325') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000332') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000334') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000335') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000338') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000339') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000341') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000352') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000355') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000356') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000362') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000363') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000364') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000365') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000369') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000420') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000421') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000422') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000424') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000425') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000426') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000427') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000477') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000482') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000484') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000490') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000491') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000495') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000496') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000497') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000552') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000553') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000557') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000558') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000563') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000586') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000628') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000629') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000630') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000631') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000632') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000633') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000634') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000635') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000636') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000641') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000642') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000643') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000644') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000646') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000652') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000655') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000656') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000657') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000658') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000668') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000671') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000672') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000673') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000674') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000679') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000680') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000681') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000682') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000684') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000687') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000697') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000699') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000709') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000710') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000733') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000734') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000735') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000736') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000737') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000738') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000749') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000772') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000773') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000774') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000775') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000793') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000892') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000900') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000901') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000905') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000970') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000971') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000972') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000973') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000974') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000975') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010078') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010079') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010080') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010081') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010082') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010083') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010302') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a datatype property.
  #
  # +uri+:: URI that is tested for being a datatype property
  def self.is_datatype_property?(uri)
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000300') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a class.
  #
  # +uri+:: URI that is tested for being a class
  def self.is_class?(uri)
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000000') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000004') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000005') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000006') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000009') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000010') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000012') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000013') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000014') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000015') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000016') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000017') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000019') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000022') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000026') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000027') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000030') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000031') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000032') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000033') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000034') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000035') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000036') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000037') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000038') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000039') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000040') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000041') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000042') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000043') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000044') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000045') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000046') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000047') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000048') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000049') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000051') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000052') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000055') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000056') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000057') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000067') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000069') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000070') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000071') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000072') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000073') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000074') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000075') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000076') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000077') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000078') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000079') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000080') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000081') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000082') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000083') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000085') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000087') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000088') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000089') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000090') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000091') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000092') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000094') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000097') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000098') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000099') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000100') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000101') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000102') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000103') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000104') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000105') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000106') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000107') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000108') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000109') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000110') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000111') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000112') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000113') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000114') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000115') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000116') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000117') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000118') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000119') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000120') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000121') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000122') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000123') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000124') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000125') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000126') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000127') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000129') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000130') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000131') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000133') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000135') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000136') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000137') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000138') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000140') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000141') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000142') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000143') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000144') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000146') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000147') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000148') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000150') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000151') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000152') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000153') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000154') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000155') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000156') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000157') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000158') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000159') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000160') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000161') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000162') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000163') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000164') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000165') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000166') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000167') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000168') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000169') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000170') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000171') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000172') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000173') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000174') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000175') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000176') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000177') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000178') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000179') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000180') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000181') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000182') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000183') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000184') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000185') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000186') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000188') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000189') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000190') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000191') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000192') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000193') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000194') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000195') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000196') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000197') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000198') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000199') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000200') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000201') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000220') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000237') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000238') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000239') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000256') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000257') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000258') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000259') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000261') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000262') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000263') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000264') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000265') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000266') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000267') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000268') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000269') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000270') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000275') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000276') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000279') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000280') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000281') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000282') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000284') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000285') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000287') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000289') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000290') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000295') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000296') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000297') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000298') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000299') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000301') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000302') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000304') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000305') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000306') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000307') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000308') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000309') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000314') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000315') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000316') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000317') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000318') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000319') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000320') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000321') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000326') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000327') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000328') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000329') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000330') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000331') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000333') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000337') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000340') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000342') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000343') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000344') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000345') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000346') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000347') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000348') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000349') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000350') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000351') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000353') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000354') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000357') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000358') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000359') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000360') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000366') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000367') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000368') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000370') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000371') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000372') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000373') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000374') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000375') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000376') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000377') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000378') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000379') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000380') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000381') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000382') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000383') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000384') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000385') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000386') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000387') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000388') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000389') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000390') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000391') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000392') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000393') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000394') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000395') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000396') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000397') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000398') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000399') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000400') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000401') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000402') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000403') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000404') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000405') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000406') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000407') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000408') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000409') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000410') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000411') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000412') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000413') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000414') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000415') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000417') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000418') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000419') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000423') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000428') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000429') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000430') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000431') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000432') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000433') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000434') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000435') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000436') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000437') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000438') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000439') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000440') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000441') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000442') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000443') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000444') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000445') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000446') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000447') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000448') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000449') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000450') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000451') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000452') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000453') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000454') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000455') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000456') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000457') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000458') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000459') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000460') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000461') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000462') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000463') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000464') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000465') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000466') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000467') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000468') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000469') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000470') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000471') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000472') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000473') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000474') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000475') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000476') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000478') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000479') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000480') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000481') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000483') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000485') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000486') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000487') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000488') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000489') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000492') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000493') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000494') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000498') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000499') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000500') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000501') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000502') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000503') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000504') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000505') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000506') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000507') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000508') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000509') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000510') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000511') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000512') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000513') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000514') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000515') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000516') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000517') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000518') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000519') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000520') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000521') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000522') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000523') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000524') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000525') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000526') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000527') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000528') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000529') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000530') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000531') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000532') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000533') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000534') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000535') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000536') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000537') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000538') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000539') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000540') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000541') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000542') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000543') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000544') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000545') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000546') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000547') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000549') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000550') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000551') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000554') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000555') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000556') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000559') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000561') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000562') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000564') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000565') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000566') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000567') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000568') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000569') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000570') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000571') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000572') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000573') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000574') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000575') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000576') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000577') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000578') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000579') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000580') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000581') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000582') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000583') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000585') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000587') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000588') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000589') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000590') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000591') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000592') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000593') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000594') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000595') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000596') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000597') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000598') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000600') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000602') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000605') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000608') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000609') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000610') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000611') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000612') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000613') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000614') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000616') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000617') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000618') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000619') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000620') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000621') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000622') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000623') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000624') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000625') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000626') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000627') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000638') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000639') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000640') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000647') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000648') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000649') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000650') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000651') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000653') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000654') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000660') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000661') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000662') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000663') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000664') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000665') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000666') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000667') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000669') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000670') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000675') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000676') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000677') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000678') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000683') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000686') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000688') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000689') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000690') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000691') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000692') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000693') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000694') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000695') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000696') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000698') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000700') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000701') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000702') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000703') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000704') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000705') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000706') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000707') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000708') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000711') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000712') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000713') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000714') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000715') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000716') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000717') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000719') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000720') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000721') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000722') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000723') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000724') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000725') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000726') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000727') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000728') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000729') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000730') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000731') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000732') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000739') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000740') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000741') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000742') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000743') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000744') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000745') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000746') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000747') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000748') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000750') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000751') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000752') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000753') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000754') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000755') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000756') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000757') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000758') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000759') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000760') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000761') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000762') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000763') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000764') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000765') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000766') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000767') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000768') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000769') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000770') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000771') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000776') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000777') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000778') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000779') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000780') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000783') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000784') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000785') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000786') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000787') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000788') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000789') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000790') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000791') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000792') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000794') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000795') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000796') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000797') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000798') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000799') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000800') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000801') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000802') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000803') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000804') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000805') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000806') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000807') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000808') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000809') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000810') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000811') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000812') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000813') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000814') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000815') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000816') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000817') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000818') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000819') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000820') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000821') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000822') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000823') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000824') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000825') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000826') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000827') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000828') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000829') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000830') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000831') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000832') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000833') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000834') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000835') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000836') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000837') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000838') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000839') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000840') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000841') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000842') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000843') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000844') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000845') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000846') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000847') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000848') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000849') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000850') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000851') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000852') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000853') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000854') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000855') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000856') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000857') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000858') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000859') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000860') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000861') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000862') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000863') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000864') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000865') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000866') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000867') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000868') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000869') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000870') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000871') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000872') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000873') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000875') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000876') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000877') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000878') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000879') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000880') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000881') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000882') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000883') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000884') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000885') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000886') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000887') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000888') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000889') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000890') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000891') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000893') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000894') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000895') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000896') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000897') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000898') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000899') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000902') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000903') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000904') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000906') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000907') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000908') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000909') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000910') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000911') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000912') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000913') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000914') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000915') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000916') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000917') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000918') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000919') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000920') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000921') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000922') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000923') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000924') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000926') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000927') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000928') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000929') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000930') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000931') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000932') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000933') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000934') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000935') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000936') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000937') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000938') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000939') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000940') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000941') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000942') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000943') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000944') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000945') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000946') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000947') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000948') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000949') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000950') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000951') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000952') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000953') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000954') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000955') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000956') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000957') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000959') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000960') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000961') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000962') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000963') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000964') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000965') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000966') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000967') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000968') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000969') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000976') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000977') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000978') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000979') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000980') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000981') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000982') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000983') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000984') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000985') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000986') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000987') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000988') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000989') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000991') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000992') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000993') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000994') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000995') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000996') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000997') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000998') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000999') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001000') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001001') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001002') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001003') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001004') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001005') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001006') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001007') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001008') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001009') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001010') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001011') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001012') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001013') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001014') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001015') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001016') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001017') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001018') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001019') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001020') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001021') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001022') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001023') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001024') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001025') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001026') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001027') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001028') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001029') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001030') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001031') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001032') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001033') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001034') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001035') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001036') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001037') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001038') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001039') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001040') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001041') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001042') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001043') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001044') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001045') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001046') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001047') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001048') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001049') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001050') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001051') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001052') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001053') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001054') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001055') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001056') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001057') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001058') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001059') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001060') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001061') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001062') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001063') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001064') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001065') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001066') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001067') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001068') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001069') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001070') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001071') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001072') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001073') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001074') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001075') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001076') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001077') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001078') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001079') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001080') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001081') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001082') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_001083') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010000') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010001') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010002') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010003') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010004') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010005') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010007') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010008') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010009') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010010') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010011') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010013') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010014') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010015') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010016') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010017') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010018') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010019') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010020') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010022') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010023') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010024') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010025') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010026') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010027') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010028') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010029') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010030') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010031') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010032') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010033') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010034') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010035') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010036') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010037') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010038') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010039') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010040') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010041') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010042') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010043') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010044') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010045') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010046') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010047') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010048') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010049') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010050') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010051') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010052') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010053') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010054') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010055') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010056') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010057') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010058') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010059') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010060') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010061') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010064') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010065') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010066') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010067') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010068') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010070') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010071') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010072') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010073') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010074') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010075') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010076') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010077') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010084') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010085') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010086') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010087') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010088') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010089') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010090') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010091') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010092') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010093') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010094') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010095') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010096') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010097') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010098') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010099') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010100') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010101') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010277') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010278') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010283') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010284') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010285') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010286') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010287') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010288') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010289') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010295') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010296') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010298') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010299') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010300') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010301') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010307') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010308') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010309') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010310') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010334') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010335') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010336') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010337') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010338') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010340') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010341') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010342') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010343') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010344') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010345') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010346') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010347') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010349') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010351') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010353') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010354') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010355') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010358') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010359') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010360') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010362') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010363') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010364') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010365') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010366') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010367') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010368') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010369') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010370') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010371') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010372') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010373') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010374') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010375') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010376') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010377') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010378') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010379') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010383') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010410') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010411') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010412') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010414') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010415') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010416') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010417') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010418') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010419') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010420') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010423') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010424') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010425') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010426') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010427') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010428') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010429') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010430') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010431') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010432') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010433') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010434') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010435') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010436') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010437') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010438') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010439') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010440') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010441') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010442') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010443') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010444') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010445') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010446') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010447') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010448') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010450') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010451') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010452') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010453') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010454') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010455') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010456') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010457') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010458') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010459') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010460') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010461') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010462') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010463') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010464') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010465') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010468') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010469') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010471') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010496') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010497') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010498') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010499') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010500') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010501') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010502') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010503') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010504') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010505') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010506') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010507') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010508') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010509') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010510') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010511') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010512') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010513') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010514') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010515') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010516') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010517') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010518') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010519') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010520') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010521') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010522') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010523') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010525') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010526') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010527') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010528') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010530') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010531') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010532') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010533') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010673') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010674') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010775') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010776') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010777') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010778') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010779') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010780') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010781') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010782') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010783') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010784') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010785') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010786') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010787') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010788') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010789') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010790') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010791') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010792') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010793') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010794') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010795') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011000') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011001') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011002') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011003') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011004') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011005') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011006') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011007') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011008') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011009') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011010') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011011') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011012') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011013') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011014') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011015') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011016') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011017') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011018') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011019') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011020') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011021') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011022') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011023') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011024') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011025') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011026') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011027') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011028') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011029') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011030') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011031') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011032') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011033') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011034') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011035') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011036') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011037') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011038') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011039') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011040') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011041') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011042') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011043') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011044') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011045') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011046') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011047') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011048') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011049') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011050') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011051') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011052') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011053') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011054') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011055') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011056') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011057') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011058') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011059') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011060') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011061') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011062') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011063') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011064') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011065') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011066') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011067') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011068') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011069') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011070') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011071') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011072') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011073') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011074') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011075') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011076') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011077') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011078') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011079') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011080') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011081') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011082') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011083') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011084') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011085') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011086') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011087') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011088') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011089') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011090') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011091') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011092') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011093') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011094') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011095') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011096') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011097') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011098') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011099') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011100') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011101') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011102') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011103') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011104') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011105') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011106') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011107') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011108') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011109') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011110') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011111') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011112') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011113') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011114') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011115') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011116') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011117') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011118') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011119') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011120') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011121') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011123') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011125') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011126') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011130') then
      return true
    end
    if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011131') then
      return true
    end
    return false
  end

  # Determines whether the given URI is a named individual.
  #
  # +uri+:: URI that is tested for being a named individual
  def self.is_named_individual?(uri)
    return false
  end

  # Returns only those URIs that fall under a designated parent URI.
  #
  # +uris+:: Set of URIs that are tested whether they have the given parent URI.
  # +parent+:: Parent URI.
  def self.with_parent(uris, parent)
    return uris.select { |uri| has_parent?(uri, parent) }
  end

  # Recursively tries to determine the parent for a given URI.
  #
  # +uri+:: URI that is tested for whether it has the given parent URI.
  # +parent+:: Parent URI.
  def self.has_parent?(uri, parent)
    if @@parent_properties.has_key?(uri) then
      if @@parent_properties[uri] == parent then
        return true
      end
      return has_parent?(@@parent_properties[uri], parent)
    end
    return false
  end

private
  @@parent_properties = { RDF::URI.new('http://semanticscience.org/resource/SIO_000008') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000011') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000020') => RDF::URI.new('http://semanticscience.org/resource/SIO_000210') , RDF::URI.new('http://semanticscience.org/resource/SIO_000028') => RDF::URI.new('http://semanticscience.org/resource/SIO_000145') , RDF::URI.new('http://semanticscience.org/resource/SIO_000029') => RDF::URI.new('http://semanticscience.org/resource/SIO_000096') , RDF::URI.new('http://semanticscience.org/resource/SIO_000053') => RDF::URI.new('http://semanticscience.org/resource/SIO_000028') , RDF::URI.new('http://semanticscience.org/resource/SIO_000054') => RDF::URI.new('http://semanticscience.org/resource/SIO_000053') , RDF::URI.new('http://semanticscience.org/resource/SIO_000059') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000060') => RDF::URI.new('http://semanticscience.org/resource/SIO_000205') , RDF::URI.new('http://semanticscience.org/resource/SIO_000061') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000062') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000063') => RDF::URI.new('http://semanticscience.org/resource/SIO_000062') , RDF::URI.new('http://semanticscience.org/resource/SIO_000064') => RDF::URI.new('http://semanticscience.org/resource/SIO_000219') , RDF::URI.new('http://semanticscience.org/resource/SIO_000066') => RDF::URI.new('http://semanticscience.org/resource/SIO_000253') , RDF::URI.new('http://semanticscience.org/resource/SIO_000068') => RDF::URI.new('http://semanticscience.org/resource/SIO_000061') , RDF::URI.new('http://semanticscience.org/resource/SIO_000093') => RDF::URI.new('http://semanticscience.org/resource/SIO_000068') , RDF::URI.new('http://semanticscience.org/resource/SIO_000095') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000096') => RDF::URI.new('http://semanticscience.org/resource/SIO_000093') , RDF::URI.new('http://semanticscience.org/resource/SIO_000128') => RDF::URI.new('http://semanticscience.org/resource/SIO_000061') , RDF::URI.new('http://semanticscience.org/resource/SIO_000132') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000139') => RDF::URI.new('http://semanticscience.org/resource/SIO_000132') , RDF::URI.new('http://semanticscience.org/resource/SIO_000145') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000202') => RDF::URI.new('http://semanticscience.org/resource/SIO_000145') , RDF::URI.new('http://semanticscience.org/resource/SIO_000203') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000204') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000205') => RDF::URI.new('http://semanticscience.org/resource/SIO_000212') , RDF::URI.new('http://semanticscience.org/resource/SIO_000206') => RDF::URI.new('http://semanticscience.org/resource/SIO_000772') , RDF::URI.new('http://semanticscience.org/resource/SIO_000207') => RDF::URI.new('http://semanticscience.org/resource/SIO_000772') , RDF::URI.new('http://semanticscience.org/resource/SIO_000208') => RDF::URI.new('http://semanticscience.org/resource/SIO_000773') , RDF::URI.new('http://semanticscience.org/resource/SIO_000209') => RDF::URI.new('http://semanticscience.org/resource/SIO_000773') , RDF::URI.new('http://semanticscience.org/resource/SIO_000210') => RDF::URI.new('http://semanticscience.org/resource/SIO_000628') , RDF::URI.new('http://semanticscience.org/resource/SIO_000211') => RDF::URI.new('http://semanticscience.org/resource/SIO_000203') , RDF::URI.new('http://semanticscience.org/resource/SIO_000212') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000213') => RDF::URI.new('http://semanticscience.org/resource/SIO_000425') , RDF::URI.new('http://semanticscience.org/resource/SIO_000214') => RDF::URI.new('http://semanticscience.org/resource/SIO_000425') , RDF::URI.new('http://semanticscience.org/resource/SIO_000215') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000216') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000217') => RDF::URI.new('http://semanticscience.org/resource/SIO_000223') , RDF::URI.new('http://semanticscience.org/resource/SIO_000218') => RDF::URI.new('http://semanticscience.org/resource/SIO_000224') , RDF::URI.new('http://semanticscience.org/resource/SIO_000219') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000221') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000222') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000223') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000224') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000225') => RDF::URI.new('http://semanticscience.org/resource/SIO_000235') , RDF::URI.new('http://semanticscience.org/resource/SIO_000226') => RDF::URI.new('http://semanticscience.org/resource/SIO_000236') , RDF::URI.new('http://semanticscience.org/resource/SIO_000227') => RDF::URI.new('http://semanticscience.org/resource/SIO_000643') , RDF::URI.new('http://semanticscience.org/resource/SIO_000228') => RDF::URI.new('http://semanticscience.org/resource/SIO_000644') , RDF::URI.new('http://semanticscience.org/resource/SIO_000229') => RDF::URI.new('http://semanticscience.org/resource/SIO_000132') , RDF::URI.new('http://semanticscience.org/resource/SIO_000230') => RDF::URI.new('http://semanticscience.org/resource/SIO_000132') , RDF::URI.new('http://semanticscience.org/resource/SIO_000231') => RDF::URI.new('http://semanticscience.org/resource/SIO_000062') , RDF::URI.new('http://semanticscience.org/resource/SIO_000232') => RDF::URI.new('http://semanticscience.org/resource/SIO_000062') , RDF::URI.new('http://semanticscience.org/resource/SIO_000233') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000234') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000235') => RDF::URI.new('http://semanticscience.org/resource/SIO_000586') , RDF::URI.new('http://semanticscience.org/resource/SIO_000236') => RDF::URI.new('http://semanticscience.org/resource/SIO_000646') , RDF::URI.new('http://semanticscience.org/resource/SIO_000240') => RDF::URI.new('http://semanticscience.org/resource/SIO_000203') , RDF::URI.new('http://semanticscience.org/resource/SIO_000241') => RDF::URI.new('http://semanticscience.org/resource/SIO_000652') , RDF::URI.new('http://semanticscience.org/resource/SIO_000242') => RDF::URI.new('http://semanticscience.org/resource/SIO_000652') , RDF::URI.new('http://semanticscience.org/resource/SIO_000243') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000244') => RDF::URI.new('http://semanticscience.org/resource/SIO_000352') , RDF::URI.new('http://semanticscience.org/resource/SIO_000245') => RDF::URI.new('http://semanticscience.org/resource/SIO_000294') , RDF::URI.new('http://semanticscience.org/resource/SIO_000246') => RDF::URI.new('http://semanticscience.org/resource/SIO_000245') , RDF::URI.new('http://semanticscience.org/resource/SIO_000247') => RDF::URI.new('http://semanticscience.org/resource/SIO_000244') , RDF::URI.new('http://semanticscience.org/resource/SIO_000248') => RDF::URI.new('http://semanticscience.org/resource/SIO_000352') , RDF::URI.new('http://semanticscience.org/resource/SIO_000249') => RDF::URI.new('http://semanticscience.org/resource/SIO_000294') , RDF::URI.new('http://semanticscience.org/resource/SIO_000250') => RDF::URI.new('http://semanticscience.org/resource/SIO_000248') , RDF::URI.new('http://semanticscience.org/resource/SIO_000251') => RDF::URI.new('http://semanticscience.org/resource/SIO_000249') , RDF::URI.new('http://semanticscience.org/resource/SIO_000252') => RDF::URI.new('http://semanticscience.org/resource/SIO_000212') , RDF::URI.new('http://semanticscience.org/resource/SIO_000253') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000254') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000255') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000272') => RDF::URI.new('http://semanticscience.org/resource/SIO_000736') , RDF::URI.new('http://semanticscience.org/resource/SIO_000273') => RDF::URI.new('http://semanticscience.org/resource/SIO_000053') , RDF::URI.new('http://semanticscience.org/resource/SIO_000274') => RDF::URI.new('http://semanticscience.org/resource/SIO_000497') , RDF::URI.new('http://semanticscience.org/resource/SIO_000277') => RDF::URI.new('http://semanticscience.org/resource/SIO_000631') , RDF::URI.new('http://semanticscience.org/resource/SIO_000278') => RDF::URI.new('http://semanticscience.org/resource/SIO_000252') , RDF::URI.new('http://semanticscience.org/resource/SIO_000283') => RDF::URI.new('http://semanticscience.org/resource/SIO_000272') , RDF::URI.new('http://semanticscience.org/resource/SIO_000286') => RDF::URI.new('http://semanticscience.org/resource/SIO_000497') , RDF::URI.new('http://semanticscience.org/resource/SIO_000288') => RDF::URI.new('http://semanticscience.org/resource/SIO_000203') , RDF::URI.new('http://semanticscience.org/resource/SIO_000291') => RDF::URI.new('http://semanticscience.org/resource/SIO_000230') , RDF::URI.new('http://semanticscience.org/resource/SIO_000292') => RDF::URI.new('http://semanticscience.org/resource/SIO_000231') , RDF::URI.new('http://semanticscience.org/resource/SIO_000293') => RDF::URI.new('http://semanticscience.org/resource/SIO_000203') , RDF::URI.new('http://semanticscience.org/resource/SIO_000294') => RDF::URI.new('http://semanticscience.org/resource/SIO_000243') , RDF::URI.new('http://semanticscience.org/resource/SIO_000310') => RDF::URI.new('http://semanticscience.org/resource/SIO_000093') , RDF::URI.new('http://semanticscience.org/resource/SIO_000311') => RDF::URI.new('http://semanticscience.org/resource/SIO_000232') , RDF::URI.new('http://semanticscience.org/resource/SIO_000312') => RDF::URI.new('http://semanticscience.org/resource/SIO_000229') , RDF::URI.new('http://semanticscience.org/resource/SIO_000313') => RDF::URI.new('http://semanticscience.org/resource/SIO_000310') , RDF::URI.new('http://semanticscience.org/resource/SIO_000322') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000323') => RDF::URI.new('http://semanticscience.org/resource/SIO_000128') , RDF::URI.new('http://semanticscience.org/resource/SIO_000324') => RDF::URI.new('http://semanticscience.org/resource/SIO_000202') , RDF::URI.new('http://semanticscience.org/resource/SIO_000325') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000332') => RDF::URI.new('http://semanticscience.org/resource/SIO_000563') , RDF::URI.new('http://semanticscience.org/resource/SIO_000334') => RDF::URI.new('http://semanticscience.org/resource/SIO_000652') , RDF::URI.new('http://semanticscience.org/resource/SIO_000335') => RDF::URI.new('http://semanticscience.org/resource/SIO_000652') , RDF::URI.new('http://semanticscience.org/resource/SIO_000338') => RDF::URI.new('http://semanticscience.org/resource/SIO_000563') , RDF::URI.new('http://semanticscience.org/resource/SIO_000339') => RDF::URI.new('http://semanticscience.org/resource/SIO_000557') , RDF::URI.new('http://semanticscience.org/resource/SIO_000341') => RDF::URI.new('http://semanticscience.org/resource/SIO_000425') , RDF::URI.new('http://semanticscience.org/resource/SIO_000352') => RDF::URI.new('http://semanticscience.org/resource/SIO_000243') , RDF::URI.new('http://semanticscience.org/resource/SIO_000355') => RDF::URI.new('http://semanticscience.org/resource/SIO_000132') , RDF::URI.new('http://semanticscience.org/resource/SIO_000356') => RDF::URI.new('http://semanticscience.org/resource/SIO_000062') , RDF::URI.new('http://semanticscience.org/resource/SIO_000362') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000363') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000364') => RDF::URI.new('http://semanticscience.org/resource/SIO_000253') , RDF::URI.new('http://semanticscience.org/resource/SIO_000365') => RDF::URI.new('http://semanticscience.org/resource/SIO_000219') , RDF::URI.new('http://semanticscience.org/resource/SIO_000369') => RDF::URI.new('http://semanticscience.org/resource/SIO_000273') , RDF::URI.new('http://semanticscience.org/resource/SIO_000420') => RDF::URI.new('http://semanticscience.org/resource/SIO_000425') , RDF::URI.new('http://semanticscience.org/resource/SIO_000421') => RDF::URI.new('http://semanticscience.org/resource/SIO_000425') , RDF::URI.new('http://semanticscience.org/resource/SIO_000422') => RDF::URI.new('http://semanticscience.org/resource/SIO_000283') , RDF::URI.new('http://semanticscience.org/resource/SIO_000424') => RDF::URI.new('http://semanticscience.org/resource/SIO_000283') , RDF::URI.new('http://semanticscience.org/resource/SIO_000425') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000426') => RDF::URI.new('http://semanticscience.org/resource/SIO_000425') , RDF::URI.new('http://semanticscience.org/resource/SIO_000427') => RDF::URI.new('http://semanticscience.org/resource/SIO_000424') , RDF::URI.new('http://semanticscience.org/resource/SIO_000477') => RDF::URI.new('http://semanticscience.org/resource/SIO_000422') , RDF::URI.new('http://semanticscience.org/resource/SIO_000482') => RDF::URI.new('http://semanticscience.org/resource/SIO_000283') , RDF::URI.new('http://semanticscience.org/resource/SIO_000484') => RDF::URI.new('http://semanticscience.org/resource/SIO_000482') , RDF::URI.new('http://semanticscience.org/resource/SIO_000490') => RDF::URI.new('http://semanticscience.org/resource/SIO_000482') , RDF::URI.new('http://semanticscience.org/resource/SIO_000491') => RDF::URI.new('http://semanticscience.org/resource/SIO_000482') , RDF::URI.new('http://semanticscience.org/resource/SIO_000495') => RDF::URI.new('http://semanticscience.org/resource/SIO_000272') , RDF::URI.new('http://semanticscience.org/resource/SIO_000496') => RDF::URI.new('http://semanticscience.org/resource/SIO_000495') , RDF::URI.new('http://semanticscience.org/resource/SIO_000497') => RDF::URI.new('http://semanticscience.org/resource/SIO_000272') , RDF::URI.new('http://semanticscience.org/resource/SIO_000552') => RDF::URI.new('http://semanticscience.org/resource/SIO_000230') , RDF::URI.new('http://semanticscience.org/resource/SIO_000553') => RDF::URI.new('http://semanticscience.org/resource/SIO_000231') , RDF::URI.new('http://semanticscience.org/resource/SIO_000557') => RDF::URI.new('http://semanticscience.org/resource/SIO_000212') , RDF::URI.new('http://semanticscience.org/resource/SIO_000558') => RDF::URI.new('http://semanticscience.org/resource/SIO_010302') , RDF::URI.new('http://semanticscience.org/resource/SIO_000563') => RDF::URI.new('http://semanticscience.org/resource/SIO_000628') , RDF::URI.new('http://semanticscience.org/resource/SIO_000586') => RDF::URI.new('http://semanticscience.org/resource/SIO_000644') , RDF::URI.new('http://semanticscience.org/resource/SIO_000628') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000629') => RDF::URI.new('http://semanticscience.org/resource/SIO_000557') , RDF::URI.new('http://semanticscience.org/resource/SIO_000630') => RDF::URI.new('http://semanticscience.org/resource/SIO_010302') , RDF::URI.new('http://semanticscience.org/resource/SIO_000631') => RDF::URI.new('http://semanticscience.org/resource/SIO_000628') , RDF::URI.new('http://semanticscience.org/resource/SIO_000632') => RDF::URI.new('http://semanticscience.org/resource/SIO_000210') , RDF::URI.new('http://semanticscience.org/resource/SIO_000633') => RDF::URI.new('http://semanticscience.org/resource/SIO_000205') , RDF::URI.new('http://semanticscience.org/resource/SIO_000634') => RDF::URI.new('http://semanticscience.org/resource/SIO_000558') , RDF::URI.new('http://semanticscience.org/resource/SIO_000635') => RDF::URI.new('http://semanticscience.org/resource/SIO_000294') , RDF::URI.new('http://semanticscience.org/resource/SIO_000636') => RDF::URI.new('http://semanticscience.org/resource/SIO_000352') , RDF::URI.new('http://semanticscience.org/resource/SIO_000641') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000642') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000643') => RDF::URI.new('http://semanticscience.org/resource/SIO_000224') , RDF::URI.new('http://semanticscience.org/resource/SIO_000644') => RDF::URI.new('http://semanticscience.org/resource/SIO_000223') , RDF::URI.new('http://semanticscience.org/resource/SIO_000646') => RDF::URI.new('http://semanticscience.org/resource/SIO_000643') , RDF::URI.new('http://semanticscience.org/resource/SIO_000652') => RDF::URI.new('http://semanticscience.org/resource/SIO_000203') , RDF::URI.new('http://semanticscience.org/resource/SIO_000655') => RDF::URI.new('http://semanticscience.org/resource/SIO_000294') , RDF::URI.new('http://semanticscience.org/resource/SIO_000656') => RDF::URI.new('http://semanticscience.org/resource/SIO_000655') , RDF::URI.new('http://semanticscience.org/resource/SIO_000657') => RDF::URI.new('http://semanticscience.org/resource/SIO_000352') , RDF::URI.new('http://semanticscience.org/resource/SIO_000658') => RDF::URI.new('http://semanticscience.org/resource/SIO_000657') , RDF::URI.new('http://semanticscience.org/resource/SIO_000668') => RDF::URI.new('http://semanticscience.org/resource/SIO_000631') , RDF::URI.new('http://semanticscience.org/resource/SIO_000671') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000672') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000673') => RDF::URI.new('http://semanticscience.org/resource/SIO_000671') , RDF::URI.new('http://semanticscience.org/resource/SIO_000674') => RDF::URI.new('http://semanticscience.org/resource/SIO_000672') , RDF::URI.new('http://semanticscience.org/resource/SIO_000679') => RDF::URI.new('http://semanticscience.org/resource/SIO_000054') , RDF::URI.new('http://semanticscience.org/resource/SIO_000680') => RDF::URI.new('http://semanticscience.org/resource/SIO_000679') , RDF::URI.new('http://semanticscience.org/resource/SIO_000681') => RDF::URI.new('http://semanticscience.org/resource/SIO_000679') , RDF::URI.new('http://semanticscience.org/resource/SIO_000682') => RDF::URI.new('http://semanticscience.org/resource/SIO_000029') , RDF::URI.new('http://semanticscience.org/resource/SIO_000684') => RDF::URI.new('http://semanticscience.org/resource/SIO_000029') , RDF::URI.new('http://semanticscience.org/resource/SIO_000687') => RDF::URI.new('http://semanticscience.org/resource/SIO_000322') , RDF::URI.new('http://semanticscience.org/resource/SIO_000697') => RDF::URI.new('http://semanticscience.org/resource/SIO_000709') , RDF::URI.new('http://semanticscience.org/resource/SIO_000699') => RDF::URI.new('http://semanticscience.org/resource/SIO_000737') , RDF::URI.new('http://semanticscience.org/resource/SIO_000709') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000710') => RDF::URI.new('http://semanticscience.org/resource/SIO_000709') , RDF::URI.new('http://semanticscience.org/resource/SIO_000733') => RDF::URI.new('http://semanticscience.org/resource/SIO_000737') , RDF::URI.new('http://semanticscience.org/resource/SIO_000734') => RDF::URI.new('http://semanticscience.org/resource/SIO_000737') , RDF::URI.new('http://semanticscience.org/resource/SIO_000735') => RDF::URI.new('http://semanticscience.org/resource/SIO_000737') , RDF::URI.new('http://semanticscience.org/resource/SIO_000736') => RDF::URI.new('http://semanticscience.org/resource/SIO_000001') , RDF::URI.new('http://semanticscience.org/resource/SIO_000737') => RDF::URI.new('http://semanticscience.org/resource/SIO_000736') , RDF::URI.new('http://semanticscience.org/resource/SIO_000738') => RDF::URI.new('http://semanticscience.org/resource/SIO_000737') , RDF::URI.new('http://semanticscience.org/resource/SIO_000749') => RDF::URI.new('http://semanticscience.org/resource/SIO_000737') , RDF::URI.new('http://semanticscience.org/resource/SIO_000772') => RDF::URI.new('http://semanticscience.org/resource/SIO_000631') , RDF::URI.new('http://semanticscience.org/resource/SIO_000773') => RDF::URI.new('http://semanticscience.org/resource/SIO_000252') , RDF::URI.new('http://semanticscience.org/resource/SIO_000774') => RDF::URI.new('http://semanticscience.org/resource/SIO_000772') , RDF::URI.new('http://semanticscience.org/resource/SIO_000775') => RDF::URI.new('http://semanticscience.org/resource/SIO_000773') , RDF::URI.new('http://semanticscience.org/resource/SIO_000793') => RDF::URI.new('http://semanticscience.org/resource/SIO_000687') , RDF::URI.new('http://semanticscience.org/resource/SIO_000892') => RDF::URI.new('http://semanticscience.org/resource/SIO_000252') , RDF::URI.new('http://semanticscience.org/resource/SIO_000900') => RDF::URI.new('http://semanticscience.org/resource/SIO_000008') , RDF::URI.new('http://semanticscience.org/resource/SIO_000901') => RDF::URI.new('http://semanticscience.org/resource/SIO_000011') , RDF::URI.new('http://semanticscience.org/resource/SIO_000905') => RDF::URI.new('http://semanticscience.org/resource/SIO_000291') , RDF::URI.new('http://semanticscience.org/resource/SIO_000970') => RDF::URI.new('http://semanticscience.org/resource/SIO_000975') , RDF::URI.new('http://semanticscience.org/resource/SIO_000971') => RDF::URI.new('http://semanticscience.org/resource/SIO_000974') , RDF::URI.new('http://semanticscience.org/resource/SIO_000972') => RDF::URI.new('http://semanticscience.org/resource/SIO_000974') , RDF::URI.new('http://semanticscience.org/resource/SIO_000973') => RDF::URI.new('http://semanticscience.org/resource/SIO_000975') , RDF::URI.new('http://semanticscience.org/resource/SIO_000974') => RDF::URI.new('http://semanticscience.org/resource/SIO_000053') , RDF::URI.new('http://semanticscience.org/resource/SIO_000975') => RDF::URI.new('http://semanticscience.org/resource/SIO_000093') , RDF::URI.new('http://semanticscience.org/resource/SIO_010078') => RDF::URI.new('http://semanticscience.org/resource/SIO_000338') , RDF::URI.new('http://semanticscience.org/resource/SIO_010079') => RDF::URI.new('http://semanticscience.org/resource/SIO_000339') , RDF::URI.new('http://semanticscience.org/resource/SIO_010080') => RDF::URI.new('http://semanticscience.org/resource/SIO_010078') , RDF::URI.new('http://semanticscience.org/resource/SIO_010081') => RDF::URI.new('http://semanticscience.org/resource/SIO_010079') , RDF::URI.new('http://semanticscience.org/resource/SIO_010082') => RDF::URI.new('http://semanticscience.org/resource/SIO_010078') , RDF::URI.new('http://semanticscience.org/resource/SIO_010083') => RDF::URI.new('http://semanticscience.org/resource/SIO_010079') , RDF::URI.new('http://semanticscience.org/resource/SIO_010302') => RDF::URI.new('http://semanticscience.org/resource/SIO_000272') , RDF::URI.new('http://semanticscience.org/resource/SIO_000009') => RDF::URI.new('http://semanticscience.org/resource/SIO_000015') , RDF::URI.new('http://semanticscience.org/resource/SIO_000012') => RDF::URI.new('http://semanticscience.org/resource/SIO_000620') , RDF::URI.new('http://semanticscience.org/resource/SIO_000013') => RDF::URI.new('http://semanticscience.org/resource/SIO_000056') , RDF::URI.new('http://semanticscience.org/resource/SIO_000016') => RDF::URI.new('http://semanticscience.org/resource/SIO_000340') , RDF::URI.new('http://semanticscience.org/resource/SIO_000017') => RDF::URI.new('http://semanticscience.org/resource/SIO_000112') , RDF::URI.new('http://semanticscience.org/resource/SIO_000019') => RDF::URI.new('http://semanticscience.org/resource/SIO_000370') , RDF::URI.new('http://semanticscience.org/resource/SIO_000031') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000032') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000034') => RDF::URI.new('http://semanticscience.org/resource/SIO_000033') , RDF::URI.new('http://semanticscience.org/resource/SIO_000035') => RDF::URI.new('http://semanticscience.org/resource/SIO_000033') , RDF::URI.new('http://semanticscience.org/resource/SIO_000036') => RDF::URI.new('http://semanticscience.org/resource/SIO_000959') , RDF::URI.new('http://semanticscience.org/resource/SIO_000038') => RDF::URI.new('http://semanticscience.org/resource/SIO_000037') , RDF::URI.new('http://semanticscience.org/resource/SIO_000039') => RDF::URI.new('http://semanticscience.org/resource/SIO_000038') , RDF::URI.new('http://semanticscience.org/resource/SIO_000040') => RDF::URI.new('http://semanticscience.org/resource/SIO_000790') , RDF::URI.new('http://semanticscience.org/resource/SIO_000041') => RDF::URI.new('http://semanticscience.org/resource/SIO_000038') , RDF::URI.new('http://semanticscience.org/resource/SIO_000042') => RDF::URI.new('http://semanticscience.org/resource/SIO_000038') , RDF::URI.new('http://semanticscience.org/resource/SIO_000043') => RDF::URI.new('http://semanticscience.org/resource/SIO_000039') , RDF::URI.new('http://semanticscience.org/resource/SIO_000044') => RDF::URI.new('http://semanticscience.org/resource/SIO_000037') , RDF::URI.new('http://semanticscience.org/resource/SIO_000045') => RDF::URI.new('http://semanticscience.org/resource/SIO_000044') , RDF::URI.new('http://semanticscience.org/resource/SIO_000046') => RDF::URI.new('http://semanticscience.org/resource/SIO_000044') , RDF::URI.new('http://semanticscience.org/resource/SIO_000047') => RDF::URI.new('http://semanticscience.org/resource/SIO_000046') , RDF::URI.new('http://semanticscience.org/resource/SIO_000048') => RDF::URI.new('http://semanticscience.org/resource/SIO_000037') , RDF::URI.new('http://semanticscience.org/resource/SIO_000049') => RDF::URI.new('http://semanticscience.org/resource/SIO_000048') , RDF::URI.new('http://semanticscience.org/resource/SIO_000051') => RDF::URI.new('http://semanticscience.org/resource/SIO_000026') , RDF::URI.new('http://semanticscience.org/resource/SIO_000055') => RDF::URI.new('http://semanticscience.org/resource/SIO_000026') , RDF::URI.new('http://semanticscience.org/resource/SIO_000057') => RDF::URI.new('http://semanticscience.org/resource/SIO_000056') , RDF::URI.new('http://semanticscience.org/resource/SIO_000071') => RDF::URI.new('http://semanticscience.org/resource/SIO_000070') , RDF::URI.new('http://semanticscience.org/resource/SIO_000072') => RDF::URI.new('http://semanticscience.org/resource/SIO_000071') , RDF::URI.new('http://semanticscience.org/resource/SIO_000073') => RDF::URI.new('http://semanticscience.org/resource/SIO_000071') , RDF::URI.new('http://semanticscience.org/resource/SIO_000074') => RDF::URI.new('http://semanticscience.org/resource/SIO_000052') , RDF::URI.new('http://semanticscience.org/resource/SIO_000075') => RDF::URI.new('http://semanticscience.org/resource/SIO_000015') , RDF::URI.new('http://semanticscience.org/resource/SIO_000076') => RDF::URI.new('http://semanticscience.org/resource/SIO_000091') , RDF::URI.new('http://semanticscience.org/resource/SIO_000077') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000079') => RDF::URI.new('http://semanticscience.org/resource/SIO_000078') , RDF::URI.new('http://semanticscience.org/resource/SIO_000080') => RDF::URI.new('http://semanticscience.org/resource/SIO_000612') , RDF::URI.new('http://semanticscience.org/resource/SIO_000081') => RDF::URI.new('http://semanticscience.org/resource/SIO_000080') , RDF::URI.new('http://semanticscience.org/resource/SIO_000082') => RDF::URI.new('http://semanticscience.org/resource/SIO_000081') , RDF::URI.new('http://semanticscience.org/resource/SIO_000083') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000085') => RDF::URI.new('http://semanticscience.org/resource/SIO_000113') , RDF::URI.new('http://semanticscience.org/resource/SIO_000087') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000094') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000097') => RDF::URI.new('http://semanticscience.org/resource/SIO_000602') , RDF::URI.new('http://semanticscience.org/resource/SIO_000098') => RDF::URI.new('http://semanticscience.org/resource/SIO_000097') , RDF::URI.new('http://semanticscience.org/resource/SIO_000099') => RDF::URI.new('http://semanticscience.org/resource/SIO_000097') , RDF::URI.new('http://semanticscience.org/resource/SIO_000100') => RDF::URI.new('http://semanticscience.org/resource/SIO_000097') , RDF::URI.new('http://semanticscience.org/resource/SIO_000101') => RDF::URI.new('http://semanticscience.org/resource/SIO_000097') , RDF::URI.new('http://semanticscience.org/resource/SIO_000102') => RDF::URI.new('http://semanticscience.org/resource/SIO_000101') , RDF::URI.new('http://semanticscience.org/resource/SIO_000103') => RDF::URI.new('http://semanticscience.org/resource/SIO_000097') , RDF::URI.new('http://semanticscience.org/resource/SIO_000104') => RDF::URI.new('http://semanticscience.org/resource/SIO_000078') , RDF::URI.new('http://semanticscience.org/resource/SIO_000106') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000107') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000108') => RDF::URI.new('http://semanticscience.org/resource/SIO_000078') , RDF::URI.new('http://semanticscience.org/resource/SIO_000109') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000113') => RDF::URI.new('http://semanticscience.org/resource/SIO_000483') , RDF::URI.new('http://semanticscience.org/resource/SIO_000117') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000118') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000119') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000120') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000121') => RDF::URI.new('http://semanticscience.org/resource/SIO_000162') , RDF::URI.new('http://semanticscience.org/resource/SIO_000122') => RDF::URI.new('http://semanticscience.org/resource/SIO_000342') , RDF::URI.new('http://semanticscience.org/resource/SIO_000123') => RDF::URI.new('http://semanticscience.org/resource/SIO_000342') , RDF::URI.new('http://semanticscience.org/resource/SIO_000124') => RDF::URI.new('http://semanticscience.org/resource/SIO_000342') , RDF::URI.new('http://semanticscience.org/resource/SIO_000125') => RDF::URI.new('http://semanticscience.org/resource/SIO_000342') , RDF::URI.new('http://semanticscience.org/resource/SIO_000127') => RDF::URI.new('http://semanticscience.org/resource/SIO_000094') , RDF::URI.new('http://semanticscience.org/resource/SIO_000129') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000130') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000131') => RDF::URI.new('http://semanticscience.org/resource/SIO_000130') , RDF::URI.new('http://semanticscience.org/resource/SIO_000133') => RDF::URI.new('http://semanticscience.org/resource/SIO_000275') , RDF::URI.new('http://semanticscience.org/resource/SIO_000135') => RDF::URI.new('http://semanticscience.org/resource/SIO_000136') , RDF::URI.new('http://semanticscience.org/resource/SIO_000137') => RDF::URI.new('http://semanticscience.org/resource/SIO_000326') , RDF::URI.new('http://semanticscience.org/resource/SIO_000138') => RDF::URI.new('http://semanticscience.org/resource/SIO_000289') , RDF::URI.new('http://semanticscience.org/resource/SIO_000140') => RDF::URI.new('http://semanticscience.org/resource/SIO_000101') , RDF::URI.new('http://semanticscience.org/resource/SIO_000141') => RDF::URI.new('http://semanticscience.org/resource/SIO_000316') , RDF::URI.new('http://semanticscience.org/resource/SIO_000142') => RDF::URI.new('http://semanticscience.org/resource/SIO_000141') , RDF::URI.new('http://semanticscience.org/resource/SIO_000143') => RDF::URI.new('http://semanticscience.org/resource/SIO_000141') , RDF::URI.new('http://semanticscience.org/resource/SIO_000144') => RDF::URI.new('http://semanticscience.org/resource/SIO_000920') , RDF::URI.new('http://semanticscience.org/resource/SIO_000147') => RDF::URI.new('http://semanticscience.org/resource/SIO_000133') , RDF::URI.new('http://semanticscience.org/resource/SIO_000148') => RDF::URI.new('http://semanticscience.org/resource/SIO_000651') , RDF::URI.new('http://semanticscience.org/resource/SIO_000150') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000151') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000152') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000153') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000154') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000155') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000156') => RDF::URI.new('http://semanticscience.org/resource/SIO_000106') , RDF::URI.new('http://semanticscience.org/resource/SIO_000157') => RDF::URI.new('http://semanticscience.org/resource/SIO_000106') , RDF::URI.new('http://semanticscience.org/resource/SIO_000158') => RDF::URI.new('http://semanticscience.org/resource/SIO_000295') , RDF::URI.new('http://semanticscience.org/resource/SIO_000159') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000160') => RDF::URI.new('http://semanticscience.org/resource/SIO_000162') , RDF::URI.new('http://semanticscience.org/resource/SIO_000161') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000162') => RDF::URI.new('http://semanticscience.org/resource/SIO_000295') , RDF::URI.new('http://semanticscience.org/resource/SIO_000163') => RDF::URI.new('http://semanticscience.org/resource/SIO_000162') , RDF::URI.new('http://semanticscience.org/resource/SIO_000164') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000165') => RDF::URI.new('http://semanticscience.org/resource/SIO_000087') , RDF::URI.new('http://semanticscience.org/resource/SIO_000166') => RDF::URI.new('http://semanticscience.org/resource/SIO_000165') , RDF::URI.new('http://semanticscience.org/resource/SIO_000167') => RDF::URI.new('http://semanticscience.org/resource/SIO_000165') , RDF::URI.new('http://semanticscience.org/resource/SIO_000168') => RDF::URI.new('http://semanticscience.org/resource/SIO_000165') , RDF::URI.new('http://semanticscience.org/resource/SIO_000169') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000170') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000171') => RDF::URI.new('http://semanticscience.org/resource/SIO_000651') , RDF::URI.new('http://semanticscience.org/resource/SIO_000172') => RDF::URI.new('http://semanticscience.org/resource/SIO_000328') , RDF::URI.new('http://semanticscience.org/resource/SIO_000173') => RDF::URI.new('http://semanticscience.org/resource/SIO_000287') , RDF::URI.new('http://semanticscience.org/resource/SIO_000174') => RDF::URI.new('http://semanticscience.org/resource/SIO_000171') , RDF::URI.new('http://semanticscience.org/resource/SIO_000175') => RDF::URI.new('http://semanticscience.org/resource/SIO_000185') , RDF::URI.new('http://semanticscience.org/resource/SIO_000176') => RDF::URI.new('http://semanticscience.org/resource/SIO_000171') , RDF::URI.new('http://semanticscience.org/resource/SIO_000177') => RDF::URI.new('http://semanticscience.org/resource/SIO_000944') , RDF::URI.new('http://semanticscience.org/resource/SIO_000178') => RDF::URI.new('http://semanticscience.org/resource/SIO_000794') , RDF::URI.new('http://semanticscience.org/resource/SIO_000179') => RDF::URI.new('http://semanticscience.org/resource/SIO_000651') , RDF::URI.new('http://semanticscience.org/resource/SIO_000180') => RDF::URI.new('http://semanticscience.org/resource/SIO_000179') , RDF::URI.new('http://semanticscience.org/resource/SIO_000181') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000182') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000183') => RDF::URI.new('http://semanticscience.org/resource/SIO_000116') , RDF::URI.new('http://semanticscience.org/resource/SIO_000184') => RDF::URI.new('http://semanticscience.org/resource/SIO_000183') , RDF::URI.new('http://semanticscience.org/resource/SIO_000185') => RDF::URI.new('http://semanticscience.org/resource/SIO_000179') , RDF::URI.new('http://semanticscience.org/resource/SIO_000186') => RDF::URI.new('http://semanticscience.org/resource/SIO_000653') , RDF::URI.new('http://semanticscience.org/resource/SIO_000188') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000189') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000190') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000191') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000192') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000193') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000194') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000195') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000196') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000197') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000198') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000199') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000200') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000201') => RDF::URI.new('http://semanticscience.org/resource/SIO_000111') , RDF::URI.new('http://semanticscience.org/resource/SIO_000220') => RDF::URI.new('http://semanticscience.org/resource/SIO_000238') , RDF::URI.new('http://semanticscience.org/resource/SIO_000237') => RDF::URI.new('http://semanticscience.org/resource/SIO_000179') , RDF::URI.new('http://semanticscience.org/resource/SIO_000238') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000239') => RDF::URI.new('http://semanticscience.org/resource/SIO_000238') , RDF::URI.new('http://semanticscience.org/resource/SIO_000261') => RDF::URI.new('http://semanticscience.org/resource/SIO_000256') , RDF::URI.new('http://semanticscience.org/resource/SIO_000262') => RDF::URI.new('http://semanticscience.org/resource/SIO_000256') , RDF::URI.new('http://semanticscience.org/resource/SIO_000263') => RDF::URI.new('http://semanticscience.org/resource/SIO_000259') , RDF::URI.new('http://semanticscience.org/resource/SIO_000264') => RDF::URI.new('http://semanticscience.org/resource/SIO_000259') , RDF::URI.new('http://semanticscience.org/resource/SIO_000268') => RDF::URI.new('http://semanticscience.org/resource/SIO_000436') , RDF::URI.new('http://semanticscience.org/resource/SIO_000276') => RDF::URI.new('http://semanticscience.org/resource/SIO_000026') , RDF::URI.new('http://semanticscience.org/resource/SIO_000280') => RDF::URI.new('http://semanticscience.org/resource/SIO_000238') , RDF::URI.new('http://semanticscience.org/resource/SIO_000281') => RDF::URI.new('http://semanticscience.org/resource/SIO_000238') , RDF::URI.new('http://semanticscience.org/resource/SIO_000282') => RDF::URI.new('http://semanticscience.org/resource/SIO_000280') , RDF::URI.new('http://semanticscience.org/resource/SIO_000284') => RDF::URI.new('http://semanticscience.org/resource/SIO_000256') , RDF::URI.new('http://semanticscience.org/resource/SIO_000285') => RDF::URI.new('http://semanticscience.org/resource/SIO_000012') , RDF::URI.new('http://semanticscience.org/resource/SIO_000287') => RDF::URI.new('http://semanticscience.org/resource/SIO_000009') , RDF::URI.new('http://semanticscience.org/resource/SIO_000290') => RDF::URI.new('http://semanticscience.org/resource/SIO_000285') , RDF::URI.new('http://semanticscience.org/resource/SIO_000297') => RDF::URI.new('http://semanticscience.org/resource/SIO_000612') , RDF::URI.new('http://semanticscience.org/resource/SIO_000301') => RDF::URI.new('http://semanticscience.org/resource/SIO_000082') , RDF::URI.new('http://semanticscience.org/resource/SIO_000302') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000304') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000305') => RDF::URI.new('http://semanticscience.org/resource/SIO_000613') , RDF::URI.new('http://semanticscience.org/resource/SIO_000306') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_000307') => RDF::URI.new('http://semanticscience.org/resource/SIO_000005') , RDF::URI.new('http://semanticscience.org/resource/SIO_000308') => RDF::URI.new('http://semanticscience.org/resource/SIO_000794') , RDF::URI.new('http://semanticscience.org/resource/SIO_000309') => RDF::URI.new('http://semanticscience.org/resource/SIO_000794') , RDF::URI.new('http://semanticscience.org/resource/SIO_000316') => RDF::URI.new('http://semanticscience.org/resource/SIO_000315') , RDF::URI.new('http://semanticscience.org/resource/SIO_000317') => RDF::URI.new('http://semanticscience.org/resource/SIO_000315') , RDF::URI.new('http://semanticscience.org/resource/SIO_000318') => RDF::URI.new('http://semanticscience.org/resource/SIO_000013') , RDF::URI.new('http://semanticscience.org/resource/SIO_000319') => RDF::URI.new('http://semanticscience.org/resource/SIO_000013') , RDF::URI.new('http://semanticscience.org/resource/SIO_000320') => RDF::URI.new('http://semanticscience.org/resource/SIO_000317') , RDF::URI.new('http://semanticscience.org/resource/SIO_000321') => RDF::URI.new('http://semanticscience.org/resource/SIO_000320') , RDF::URI.new('http://semanticscience.org/resource/SIO_000326') => RDF::URI.new('http://semanticscience.org/resource/SIO_000275') , RDF::URI.new('http://semanticscience.org/resource/SIO_000327') => RDF::URI.new('http://semanticscience.org/resource/SIO_000320') , RDF::URI.new('http://semanticscience.org/resource/SIO_000329') => RDF::URI.new('http://semanticscience.org/resource/SIO_000320') , RDF::URI.new('http://semanticscience.org/resource/SIO_000330') => RDF::URI.new('http://semanticscience.org/resource/SIO_000320') , RDF::URI.new('http://semanticscience.org/resource/SIO_000331') => RDF::URI.new('http://semanticscience.org/resource/SIO_000129') , RDF::URI.new('http://semanticscience.org/resource/SIO_000343') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000344') => RDF::URI.new('http://semanticscience.org/resource/SIO_000639') , RDF::URI.new('http://semanticscience.org/resource/SIO_000345') => RDF::URI.new('http://semanticscience.org/resource/SIO_000378') , RDF::URI.new('http://semanticscience.org/resource/SIO_000346') => RDF::URI.new('http://semanticscience.org/resource/SIO_000351') , RDF::URI.new('http://semanticscience.org/resource/SIO_000347') => RDF::URI.new('http://semanticscience.org/resource/SIO_000374') , RDF::URI.new('http://semanticscience.org/resource/SIO_000348') => RDF::URI.new('http://semanticscience.org/resource/SIO_000347') , RDF::URI.new('http://semanticscience.org/resource/SIO_000349') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000350') => RDF::URI.new('http://semanticscience.org/resource/SIO_000385') , RDF::URI.new('http://semanticscience.org/resource/SIO_000351') => RDF::URI.new('http://semanticscience.org/resource/SIO_000385') , RDF::URI.new('http://semanticscience.org/resource/SIO_000353') => RDF::URI.new('http://semanticscience.org/resource/SIO_000639') , RDF::URI.new('http://semanticscience.org/resource/SIO_000354') => RDF::URI.new('http://semanticscience.org/resource/SIO_000112') , RDF::URI.new('http://semanticscience.org/resource/SIO_000357') => RDF::URI.new('http://semanticscience.org/resource/SIO_010019') , RDF::URI.new('http://semanticscience.org/resource/SIO_000358') => RDF::URI.new('http://semanticscience.org/resource/SIO_000825') , RDF::URI.new('http://semanticscience.org/resource/SIO_000359') => RDF::URI.new('http://semanticscience.org/resource/SIO_000337') , RDF::URI.new('http://semanticscience.org/resource/SIO_000366') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000367') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000368') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000371') => RDF::URI.new('http://semanticscience.org/resource/SIO_000408') , RDF::URI.new('http://semanticscience.org/resource/SIO_000372') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000373') => RDF::URI.new('http://semanticscience.org/resource/SIO_000346') , RDF::URI.new('http://semanticscience.org/resource/SIO_000374') => RDF::URI.new('http://semanticscience.org/resource/SIO_000385') , RDF::URI.new('http://semanticscience.org/resource/SIO_000375') => RDF::URI.new('http://semanticscience.org/resource/SIO_000351') , RDF::URI.new('http://semanticscience.org/resource/SIO_000376') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000377') => RDF::URI.new('http://semanticscience.org/resource/SIO_000378') , RDF::URI.new('http://semanticscience.org/resource/SIO_000378') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000379') => RDF::URI.new('http://semanticscience.org/resource/SIO_001055') , RDF::URI.new('http://semanticscience.org/resource/SIO_000380') => RDF::URI.new('http://semanticscience.org/resource/SIO_000392') , RDF::URI.new('http://semanticscience.org/resource/SIO_000381') => RDF::URI.new('http://semanticscience.org/resource/SIO_000380') , RDF::URI.new('http://semanticscience.org/resource/SIO_000382') => RDF::URI.new('http://semanticscience.org/resource/SIO_000349') , RDF::URI.new('http://semanticscience.org/resource/SIO_000383') => RDF::URI.new('http://semanticscience.org/resource/SIO_000351') , RDF::URI.new('http://semanticscience.org/resource/SIO_000384') => RDF::URI.new('http://semanticscience.org/resource/SIO_000374') , RDF::URI.new('http://semanticscience.org/resource/SIO_000385') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000386') => RDF::URI.new('http://semanticscience.org/resource/SIO_000385') , RDF::URI.new('http://semanticscience.org/resource/SIO_000387') => RDF::URI.new('http://semanticscience.org/resource/SIO_000385') , RDF::URI.new('http://semanticscience.org/resource/SIO_000388') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000389') => RDF::URI.new('http://semanticscience.org/resource/SIO_000349') , RDF::URI.new('http://semanticscience.org/resource/SIO_000390') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000392') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000393') => RDF::URI.new('http://semanticscience.org/resource/SIO_000498') , RDF::URI.new('http://semanticscience.org/resource/SIO_000395') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000396') => RDF::URI.new('http://semanticscience.org/resource/SIO_000602') , RDF::URI.new('http://semanticscience.org/resource/SIO_000397') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000399') => RDF::URI.new('http://semanticscience.org/resource/SIO_000498') , RDF::URI.new('http://semanticscience.org/resource/SIO_000400') => RDF::URI.new('http://semanticscience.org/resource/SIO_000072') , RDF::URI.new('http://semanticscience.org/resource/SIO_000401') => RDF::URI.new('http://semanticscience.org/resource/SIO_000072') , RDF::URI.new('http://semanticscience.org/resource/SIO_000402') => RDF::URI.new('http://semanticscience.org/resource/SIO_000072') , RDF::URI.new('http://semanticscience.org/resource/SIO_000403') => RDF::URI.new('http://semanticscience.org/resource/SIO_000620') , RDF::URI.new('http://semanticscience.org/resource/SIO_000404') => RDF::URI.new('http://semanticscience.org/resource/SIO_000406') , RDF::URI.new('http://semanticscience.org/resource/SIO_000405') => RDF::URI.new('http://semanticscience.org/resource/SIO_000406') , RDF::URI.new('http://semanticscience.org/resource/SIO_000406') => RDF::URI.new('http://semanticscience.org/resource/SIO_000498') , RDF::URI.new('http://semanticscience.org/resource/SIO_000407') => RDF::URI.new('http://semanticscience.org/resource/SIO_000536') , RDF::URI.new('http://semanticscience.org/resource/SIO_000408') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000409') => RDF::URI.new('http://semanticscience.org/resource/SIO_000014') , RDF::URI.new('http://semanticscience.org/resource/SIO_000410') => RDF::URI.new('http://semanticscience.org/resource/SIO_000828') , RDF::URI.new('http://semanticscience.org/resource/SIO_000411') => RDF::URI.new('http://semanticscience.org/resource/SIO_000828') , RDF::URI.new('http://semanticscience.org/resource/SIO_000412') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000413') => RDF::URI.new('http://semanticscience.org/resource/SIO_000414') , RDF::URI.new('http://semanticscience.org/resource/SIO_000414') => RDF::URI.new('http://semanticscience.org/resource/SIO_000370') , RDF::URI.new('http://semanticscience.org/resource/SIO_000415') => RDF::URI.new('http://semanticscience.org/resource/SIO_000413') , RDF::URI.new('http://semanticscience.org/resource/SIO_000417') => RDF::URI.new('http://semanticscience.org/resource/SIO_000391') , RDF::URI.new('http://semanticscience.org/resource/SIO_000418') => RDF::URI.new('http://semanticscience.org/resource/SIO_000391') , RDF::URI.new('http://semanticscience.org/resource/SIO_000419') => RDF::URI.new('http://semanticscience.org/resource/SIO_000080') , RDF::URI.new('http://semanticscience.org/resource/SIO_000423') => RDF::URI.new('http://semanticscience.org/resource/SIO_000083') , RDF::URI.new('http://semanticscience.org/resource/SIO_000428') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000429') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000430') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000431') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000432') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000433') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000434') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000435') => RDF::URI.new('http://semanticscience.org/resource/SIO_000417') , RDF::URI.new('http://semanticscience.org/resource/SIO_000438') => RDF::URI.new('http://semanticscience.org/resource/SIO_000790') , RDF::URI.new('http://semanticscience.org/resource/SIO_000439') => RDF::URI.new('http://semanticscience.org/resource/SIO_000056') , RDF::URI.new('http://semanticscience.org/resource/SIO_000442') => RDF::URI.new('http://semanticscience.org/resource/SIO_000083') , RDF::URI.new('http://semanticscience.org/resource/SIO_000443') => RDF::URI.new('http://semanticscience.org/resource/SIO_000083') , RDF::URI.new('http://semanticscience.org/resource/SIO_000444') => RDF::URI.new('http://semanticscience.org/resource/SIO_000443') , RDF::URI.new('http://semanticscience.org/resource/SIO_000445') => RDF::URI.new('http://semanticscience.org/resource/SIO_000443') , RDF::URI.new('http://semanticscience.org/resource/SIO_000446') => RDF::URI.new('http://semanticscience.org/resource/SIO_000443') , RDF::URI.new('http://semanticscience.org/resource/SIO_000447') => RDF::URI.new('http://semanticscience.org/resource/SIO_000083') , RDF::URI.new('http://semanticscience.org/resource/SIO_000449') => RDF::URI.new('http://semanticscience.org/resource/SIO_000448') , RDF::URI.new('http://semanticscience.org/resource/SIO_000452') => RDF::URI.new('http://semanticscience.org/resource/SIO_000451') , RDF::URI.new('http://semanticscience.org/resource/SIO_000453') => RDF::URI.new('http://semanticscience.org/resource/SIO_000451') , RDF::URI.new('http://semanticscience.org/resource/SIO_000454') => RDF::URI.new('http://semanticscience.org/resource/SIO_000451') , RDF::URI.new('http://semanticscience.org/resource/SIO_000455') => RDF::URI.new('http://semanticscience.org/resource/SIO_000450') , RDF::URI.new('http://semanticscience.org/resource/SIO_000456') => RDF::URI.new('http://semanticscience.org/resource/SIO_000455') , RDF::URI.new('http://semanticscience.org/resource/SIO_000457') => RDF::URI.new('http://semanticscience.org/resource/SIO_000455') , RDF::URI.new('http://semanticscience.org/resource/SIO_000458') => RDF::URI.new('http://semanticscience.org/resource/SIO_000450') , RDF::URI.new('http://semanticscience.org/resource/SIO_000459') => RDF::URI.new('http://semanticscience.org/resource/SIO_000458') , RDF::URI.new('http://semanticscience.org/resource/SIO_000460') => RDF::URI.new('http://semanticscience.org/resource/SIO_000458') , RDF::URI.new('http://semanticscience.org/resource/SIO_000461') => RDF::URI.new('http://semanticscience.org/resource/SIO_000458') , RDF::URI.new('http://semanticscience.org/resource/SIO_000462') => RDF::URI.new('http://semanticscience.org/resource/SIO_000461') , RDF::URI.new('http://semanticscience.org/resource/SIO_000463') => RDF::URI.new('http://semanticscience.org/resource/SIO_000461') , RDF::URI.new('http://semanticscience.org/resource/SIO_000464') => RDF::URI.new('http://semanticscience.org/resource/SIO_000150') , RDF::URI.new('http://semanticscience.org/resource/SIO_000466') => RDF::URI.new('http://semanticscience.org/resource/SIO_000742') , RDF::URI.new('http://semanticscience.org/resource/SIO_000467') => RDF::URI.new('http://semanticscience.org/resource/SIO_000743') , RDF::URI.new('http://semanticscience.org/resource/SIO_000468') => RDF::URI.new('http://semanticscience.org/resource/SIO_000448') , RDF::URI.new('http://semanticscience.org/resource/SIO_000470') => RDF::URI.new('http://semanticscience.org/resource/SIO_000185') , RDF::URI.new('http://semanticscience.org/resource/SIO_000471') => RDF::URI.new('http://semanticscience.org/resource/SIO_000185') , RDF::URI.new('http://semanticscience.org/resource/SIO_000472') => RDF::URI.new('http://semanticscience.org/resource/SIO_000069') , RDF::URI.new('http://semanticscience.org/resource/SIO_000475') => RDF::URI.new('http://semanticscience.org/resource/SIO_000026') , RDF::URI.new('http://semanticscience.org/resource/SIO_000478') => RDF::URI.new('http://semanticscience.org/resource/SIO_000479') , RDF::URI.new('http://semanticscience.org/resource/SIO_000479') => RDF::URI.new('http://semanticscience.org/resource/SIO_000721') , RDF::URI.new('http://semanticscience.org/resource/SIO_000480') => RDF::URI.new('http://semanticscience.org/resource/SIO_000478') , RDF::URI.new('http://semanticscience.org/resource/SIO_000481') => RDF::URI.new('http://semanticscience.org/resource/SIO_000478') , RDF::URI.new('http://semanticscience.org/resource/SIO_000485') => RDF::URI.new('http://semanticscience.org/resource/SIO_010375') , RDF::URI.new('http://semanticscience.org/resource/SIO_000486') => RDF::URI.new('http://semanticscience.org/resource/SIO_010375') , RDF::URI.new('http://semanticscience.org/resource/SIO_000487') => RDF::URI.new('http://semanticscience.org/resource/SIO_010375') , RDF::URI.new('http://semanticscience.org/resource/SIO_000488') => RDF::URI.new('http://semanticscience.org/resource/SIO_010375') , RDF::URI.new('http://semanticscience.org/resource/SIO_000489') => RDF::URI.new('http://semanticscience.org/resource/SIO_010376') , RDF::URI.new('http://semanticscience.org/resource/SIO_000492') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000493') => RDF::URI.new('http://semanticscience.org/resource/SIO_000113') , RDF::URI.new('http://semanticscience.org/resource/SIO_000494') => RDF::URI.new('http://semanticscience.org/resource/SIO_000701') , RDF::URI.new('http://semanticscience.org/resource/SIO_000498') => RDF::URI.new('http://semanticscience.org/resource/SIO_000485') , RDF::URI.new('http://semanticscience.org/resource/SIO_000499') => RDF::URI.new('http://semanticscience.org/resource/SIO_000536') , RDF::URI.new('http://semanticscience.org/resource/SIO_000505') => RDF::URI.new('http://semanticscience.org/resource/SIO_000506') , RDF::URI.new('http://semanticscience.org/resource/SIO_000506') => RDF::URI.new('http://semanticscience.org/resource/SIO_000015') , RDF::URI.new('http://semanticscience.org/resource/SIO_000507') => RDF::URI.new('http://semanticscience.org/resource/SIO_000506') , RDF::URI.new('http://semanticscience.org/resource/SIO_000508') => RDF::URI.new('http://semanticscience.org/resource/SIO_000532') , RDF::URI.new('http://semanticscience.org/resource/SIO_000509') => RDF::URI.new('http://semanticscience.org/resource/SIO_000532') , RDF::URI.new('http://semanticscience.org/resource/SIO_000511') => RDF::URI.new('http://semanticscience.org/resource/SIO_000608') , RDF::URI.new('http://semanticscience.org/resource/SIO_000513') => RDF::URI.new('http://semanticscience.org/resource/SIO_000512') , RDF::URI.new('http://semanticscience.org/resource/SIO_000514') => RDF::URI.new('http://semanticscience.org/resource/SIO_000513') , RDF::URI.new('http://semanticscience.org/resource/SIO_000515') => RDF::URI.new('http://semanticscience.org/resource/SIO_000513') , RDF::URI.new('http://semanticscience.org/resource/SIO_000516') => RDF::URI.new('http://semanticscience.org/resource/SIO_000511') , RDF::URI.new('http://semanticscience.org/resource/SIO_000517') => RDF::URI.new('http://semanticscience.org/resource/SIO_000505') , RDF::URI.new('http://semanticscience.org/resource/SIO_000518') => RDF::URI.new('http://semanticscience.org/resource/SIO_000517') , RDF::URI.new('http://semanticscience.org/resource/SIO_000519') => RDF::URI.new('http://semanticscience.org/resource/SIO_000518') , RDF::URI.new('http://semanticscience.org/resource/SIO_000520') => RDF::URI.new('http://semanticscience.org/resource/SIO_000505') , RDF::URI.new('http://semanticscience.org/resource/SIO_000525') => RDF::URI.new('http://semanticscience.org/resource/SIO_000534') , RDF::URI.new('http://semanticscience.org/resource/SIO_000526') => RDF::URI.new('http://semanticscience.org/resource/SIO_000534') , RDF::URI.new('http://semanticscience.org/resource/SIO_000527') => RDF::URI.new('http://semanticscience.org/resource/SIO_000535') , RDF::URI.new('http://semanticscience.org/resource/SIO_000528') => RDF::URI.new('http://semanticscience.org/resource/SIO_000527') , RDF::URI.new('http://semanticscience.org/resource/SIO_000529') => RDF::URI.new('http://semanticscience.org/resource/SIO_000527') , RDF::URI.new('http://semanticscience.org/resource/SIO_000530') => RDF::URI.new('http://semanticscience.org/resource/SIO_000527') , RDF::URI.new('http://semanticscience.org/resource/SIO_000531') => RDF::URI.new('http://semanticscience.org/resource/SIO_000535') , RDF::URI.new('http://semanticscience.org/resource/SIO_000532') => RDF::URI.new('http://semanticscience.org/resource/SIO_000507') , RDF::URI.new('http://semanticscience.org/resource/SIO_000533') => RDF::URI.new('http://semanticscience.org/resource/SIO_000540') , RDF::URI.new('http://semanticscience.org/resource/SIO_000534') => RDF::URI.new('http://semanticscience.org/resource/SIO_000511') , RDF::URI.new('http://semanticscience.org/resource/SIO_000535') => RDF::URI.new('http://semanticscience.org/resource/SIO_000511') , RDF::URI.new('http://semanticscience.org/resource/SIO_000536') => RDF::URI.new('http://semanticscience.org/resource/SIO_000395') , RDF::URI.new('http://semanticscience.org/resource/SIO_000537') => RDF::URI.new('http://semanticscience.org/resource/SIO_000055') , RDF::URI.new('http://semanticscience.org/resource/SIO_000538') => RDF::URI.new('http://semanticscience.org/resource/SIO_000537') , RDF::URI.new('http://semanticscience.org/resource/SIO_000539') => RDF::URI.new('http://semanticscience.org/resource/SIO_000511') , RDF::URI.new('http://semanticscience.org/resource/SIO_000540') => RDF::URI.new('http://semanticscience.org/resource/SIO_000516') , RDF::URI.new('http://semanticscience.org/resource/SIO_000541') => RDF::URI.new('http://semanticscience.org/resource/SIO_000540') , RDF::URI.new('http://semanticscience.org/resource/SIO_000542') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000544') => RDF::URI.new('http://semanticscience.org/resource/SIO_000372') , RDF::URI.new('http://semanticscience.org/resource/SIO_000547') => RDF::URI.new('http://semanticscience.org/resource/SIO_000376') , RDF::URI.new('http://semanticscience.org/resource/SIO_000549') => RDF::URI.new('http://semanticscience.org/resource/SIO_010355') , RDF::URI.new('http://semanticscience.org/resource/SIO_000550') => RDF::URI.new('http://semanticscience.org/resource/SIO_010354') , RDF::URI.new('http://semanticscience.org/resource/SIO_000551') => RDF::URI.new('http://semanticscience.org/resource/SIO_010347') , RDF::URI.new('http://semanticscience.org/resource/SIO_000554') => RDF::URI.new('http://semanticscience.org/resource/SIO_000307') , RDF::URI.new('http://semanticscience.org/resource/SIO_000555') => RDF::URI.new('http://semanticscience.org/resource/SIO_000307') , RDF::URI.new('http://semanticscience.org/resource/SIO_000556') => RDF::URI.new('http://semanticscience.org/resource/SIO_010071') , RDF::URI.new('http://semanticscience.org/resource/SIO_000561') => RDF::URI.new('http://semanticscience.org/resource/SIO_011121') , RDF::URI.new('http://semanticscience.org/resource/SIO_000562') => RDF::URI.new('http://semanticscience.org/resource/SIO_000576') , RDF::URI.new('http://semanticscience.org/resource/SIO_000564') => RDF::URI.new('http://semanticscience.org/resource/SIO_000573') , RDF::URI.new('http://semanticscience.org/resource/SIO_000566') => RDF::URI.new('http://semanticscience.org/resource/SIO_000368') , RDF::URI.new('http://semanticscience.org/resource/SIO_000567') => RDF::URI.new('http://semanticscience.org/resource/SIO_000569') , RDF::URI.new('http://semanticscience.org/resource/SIO_000568') => RDF::URI.new('http://semanticscience.org/resource/SIO_000569') , RDF::URI.new('http://semanticscience.org/resource/SIO_000569') => RDF::URI.new('http://semanticscience.org/resource/SIO_000368') , RDF::URI.new('http://semanticscience.org/resource/SIO_000570') => RDF::URI.new('http://semanticscience.org/resource/SIO_000006') , RDF::URI.new('http://semanticscience.org/resource/SIO_000571') => RDF::URI.new('http://semanticscience.org/resource/SIO_000564') , RDF::URI.new('http://semanticscience.org/resource/SIO_000572') => RDF::URI.new('http://semanticscience.org/resource/SIO_000564') , RDF::URI.new('http://semanticscience.org/resource/SIO_000573') => RDF::URI.new('http://semanticscience.org/resource/SIO_000570') , RDF::URI.new('http://semanticscience.org/resource/SIO_000574') => RDF::URI.new('http://semanticscience.org/resource/SIO_000570') , RDF::URI.new('http://semanticscience.org/resource/SIO_000576') => RDF::URI.new('http://semanticscience.org/resource/SIO_010283') , RDF::URI.new('http://semanticscience.org/resource/SIO_000577') => RDF::URI.new('http://semanticscience.org/resource/SIO_010284') , RDF::URI.new('http://semanticscience.org/resource/SIO_000578') => RDF::URI.new('http://semanticscience.org/resource/SIO_010284') , RDF::URI.new('http://semanticscience.org/resource/SIO_000579') => RDF::URI.new('http://semanticscience.org/resource/SIO_000578') , RDF::URI.new('http://semanticscience.org/resource/SIO_000580') => RDF::URI.new('http://semanticscience.org/resource/SIO_000578') , RDF::URI.new('http://semanticscience.org/resource/SIO_000581') => RDF::URI.new('http://semanticscience.org/resource/SIO_000574') , RDF::URI.new('http://semanticscience.org/resource/SIO_000585') => RDF::URI.new('http://semanticscience.org/resource/SIO_000256') , RDF::URI.new('http://semanticscience.org/resource/SIO_000587') => RDF::URI.new('http://semanticscience.org/resource/SIO_000588') , RDF::URI.new('http://semanticscience.org/resource/SIO_000589') => RDF::URI.new('http://semanticscience.org/resource/SIO_000593') , RDF::URI.new('http://semanticscience.org/resource/SIO_000590') => RDF::URI.new('http://semanticscience.org/resource/SIO_000559') , RDF::URI.new('http://semanticscience.org/resource/SIO_000596') => RDF::URI.new('http://semanticscience.org/resource/SIO_000956') , RDF::URI.new('http://semanticscience.org/resource/SIO_000597') => RDF::URI.new('http://semanticscience.org/resource/SIO_000598') , RDF::URI.new('http://semanticscience.org/resource/SIO_000598') => RDF::URI.new('http://semanticscience.org/resource/SIO_000596') , RDF::URI.new('http://semanticscience.org/resource/SIO_000600') => RDF::URI.new('http://semanticscience.org/resource/SIO_000026') , RDF::URI.new('http://semanticscience.org/resource/SIO_000602') => RDF::URI.new('http://semanticscience.org/resource/SIO_000015') , RDF::URI.new('http://semanticscience.org/resource/SIO_000605') => RDF::URI.new('http://semanticscience.org/resource/SIO_000650') , RDF::URI.new('http://semanticscience.org/resource/SIO_000608') => RDF::URI.new('http://semanticscience.org/resource/SIO_000506') , RDF::URI.new('http://semanticscience.org/resource/SIO_000609') => RDF::URI.new('http://semanticscience.org/resource/SIO_000589') , RDF::URI.new('http://semanticscience.org/resource/SIO_000610') => RDF::URI.new('http://semanticscience.org/resource/SIO_000589') , RDF::URI.new('http://semanticscience.org/resource/SIO_000611') => RDF::URI.new('http://semanticscience.org/resource/SIO_000610') , RDF::URI.new('http://semanticscience.org/resource/SIO_000613') => RDF::URI.new('http://semanticscience.org/resource/SIO_000788') , RDF::URI.new('http://semanticscience.org/resource/SIO_000619') => RDF::URI.new('http://semanticscience.org/resource/SIO_000012') , RDF::URI.new('http://semanticscience.org/resource/SIO_000620') => RDF::URI.new('http://semanticscience.org/resource/SIO_000010') , RDF::URI.new('http://semanticscience.org/resource/SIO_000621') => RDF::URI.new('http://semanticscience.org/resource/SIO_000315') , RDF::URI.new('http://semanticscience.org/resource/SIO_000622') => RDF::URI.new('http://semanticscience.org/resource/SIO_000129') , RDF::URI.new('http://semanticscience.org/resource/SIO_000623') => RDF::URI.new('http://semanticscience.org/resource/SIO_000129') , RDF::URI.new('http://semanticscience.org/resource/SIO_000624') => RDF::URI.new('http://semanticscience.org/resource/SIO_010441') , RDF::URI.new('http://semanticscience.org/resource/SIO_000625') => RDF::URI.new('http://semanticscience.org/resource/SIO_000600') , RDF::URI.new('http://semanticscience.org/resource/SIO_000626') => RDF::URI.new('http://semanticscience.org/resource/SIO_000625') , RDF::URI.new('http://semanticscience.org/resource/SIO_000627') => RDF::URI.new('http://semanticscience.org/resource/SIO_000626') , RDF::URI.new('http://semanticscience.org/resource/SIO_000638') => RDF::URI.new('http://semanticscience.org/resource/SIO_000257') , RDF::URI.new('http://semanticscience.org/resource/SIO_000639') => RDF::URI.new('http://semanticscience.org/resource/SIO_000701') , RDF::URI.new('http://semanticscience.org/resource/SIO_000640') => RDF::URI.new('http://semanticscience.org/resource/SIO_000555') , RDF::URI.new('http://semanticscience.org/resource/SIO_000648') => RDF::URI.new('http://semanticscience.org/resource/SIO_000510') , RDF::URI.new('http://semanticscience.org/resource/SIO_000649') => RDF::URI.new('http://semanticscience.org/resource/SIO_000999') , RDF::URI.new('http://semanticscience.org/resource/SIO_000650') => RDF::URI.new('http://semanticscience.org/resource/SIO_000004') , RDF::URI.new('http://semanticscience.org/resource/SIO_000651') => RDF::URI.new('http://semanticscience.org/resource/SIO_000079') , RDF::URI.new('http://semanticscience.org/resource/SIO_000660') => RDF::URI.new('http://semanticscience.org/resource/SIO_000019') , RDF::URI.new('http://semanticscience.org/resource/SIO_000661') => RDF::URI.new('http://semanticscience.org/resource/SIO_000415') , RDF::URI.new('http://semanticscience.org/resource/SIO_000662') => RDF::URI.new('http://semanticscience.org/resource/SIO_000415') , RDF::URI.new('http://semanticscience.org/resource/SIO_000663') => RDF::URI.new('http://semanticscience.org/resource/SIO_000415') , RDF::URI.new('http://semanticscience.org/resource/SIO_000664') => RDF::URI.new('http://semanticscience.org/resource/SIO_000415') , RDF::URI.new('http://semanticscience.org/resource/SIO_000665') => RDF::URI.new('http://semanticscience.org/resource/SIO_000415') , RDF::URI.new('http://semanticscience.org/resource/SIO_000666') => RDF::URI.new('http://semanticscience.org/resource/SIO_000415') , RDF::URI.new('http://semanticscience.org/resource/SIO_000667') => RDF::URI.new('http://semanticscience.org/resource/SIO_000649') , RDF::URI.new('http://semanticscience.org/resource/SIO_000669') => RDF::URI.new('http://semanticscience.org/resource/SIO_000418') , RDF::URI.new('http://semanticscience.org/resource/SIO_000670') => RDF::URI.new('http://semanticscience.org/resource/SIO_000418') , RDF::URI.new('http://semanticscience.org/resource/SIO_000676') => RDF::URI.new('http://semanticscience.org/resource/SIO_000016') , RDF::URI.new('http://semanticscience.org/resource/SIO_000677') => RDF::URI.new('http://semanticscience.org/resource/SIO_000016') , RDF::URI.new('http://semanticscience.org/resource/SIO_000678') => RDF::URI.new('http://semanticscience.org/resource/SIO_000016') , RDF::URI.new('http://semanticscience.org/resource/SIO_000683') => RDF::URI.new('http://semanticscience.org/resource/SIO_000256') , RDF::URI.new('http://semanticscience.org/resource/SIO_000686') => RDF::URI.new('http://semanticscience.org/resource/SIO_000285') , RDF::URI.new('http://semanticscience.org/resource/SIO_000688') => RDF::URI.new('http://semanticscience.org/resource/SIO_000285') , RDF::URI.new('http://semanticscience.org/resource/SIO_000689') => RDF::URI.new('http://semanticscience.org/resource/SIO_000692') , RDF::URI.new('http://semanticscience.org/resource/SIO_000690') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000691') => RDF::URI.new('http://semanticscience.org/resource/SIO_000690') , RDF::URI.new('http://semanticscience.org/resource/SIO_000693') => RDF::URI.new('http://semanticscience.org/resource/SIO_000012') , RDF::URI.new('http://semanticscience.org/resource/SIO_000698') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000700') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_000704') => RDF::URI.new('http://semanticscience.org/resource/SIO_000678') , RDF::URI.new('http://semanticscience.org/resource/SIO_000705') => RDF::URI.new('http://semanticscience.org/resource/SIO_000315') , RDF::URI.new('http://semanticscience.org/resource/SIO_000706') => RDF::URI.new('http://semanticscience.org/resource/SIO_000676') , RDF::URI.new('http://semanticscience.org/resource/SIO_000711') => RDF::URI.new('http://semanticscience.org/resource/SIO_000706') , RDF::URI.new('http://semanticscience.org/resource/SIO_000712') => RDF::URI.new('http://semanticscience.org/resource/SIO_000706') , RDF::URI.new('http://semanticscience.org/resource/SIO_000713') => RDF::URI.new('http://semanticscience.org/resource/SIO_000712') , RDF::URI.new('http://semanticscience.org/resource/SIO_000714') => RDF::URI.new('http://semanticscience.org/resource/SIO_000712') , RDF::URI.new('http://semanticscience.org/resource/SIO_000715') => RDF::URI.new('http://semanticscience.org/resource/SIO_000712') , RDF::URI.new('http://semanticscience.org/resource/SIO_000716') => RDF::URI.new('http://semanticscience.org/resource/SIO_000498') , RDF::URI.new('http://semanticscience.org/resource/SIO_000717') => RDF::URI.new('http://semanticscience.org/resource/SIO_000712') , RDF::URI.new('http://semanticscience.org/resource/SIO_000721') => RDF::URI.new('http://semanticscience.org/resource/SIO_000678') , RDF::URI.new('http://semanticscience.org/resource/SIO_000722') => RDF::URI.new('http://semanticscience.org/resource/SIO_000725') , RDF::URI.new('http://semanticscience.org/resource/SIO_000723') => RDF::URI.new('http://semanticscience.org/resource/SIO_000724') , RDF::URI.new('http://semanticscience.org/resource/SIO_000724') => RDF::URI.new('http://semanticscience.org/resource/SIO_000353') , RDF::URI.new('http://semanticscience.org/resource/SIO_000725') => RDF::URI.new('http://semanticscience.org/resource/SIO_000696') , RDF::URI.new('http://semanticscience.org/resource/SIO_000726') => RDF::URI.new('http://semanticscience.org/resource/SIO_000706') , RDF::URI.new('http://semanticscience.org/resource/SIO_000727') => RDF::URI.new('http://semanticscience.org/resource/SIO_000726') , RDF::URI.new('http://semanticscience.org/resource/SIO_000728') => RDF::URI.new('http://semanticscience.org/resource/SIO_000730') , RDF::URI.new('http://semanticscience.org/resource/SIO_000730') => RDF::URI.new('http://semanticscience.org/resource/SIO_000115') , RDF::URI.new('http://semanticscience.org/resource/SIO_000731') => RDF::URI.new('http://semanticscience.org/resource/SIO_000115') , RDF::URI.new('http://semanticscience.org/resource/SIO_000732') => RDF::URI.new('http://semanticscience.org/resource/SIO_000728') , RDF::URI.new('http://semanticscience.org/resource/SIO_000740') => RDF::URI.new('http://semanticscience.org/resource/SIO_000608') , RDF::URI.new('http://semanticscience.org/resource/SIO_000741') => RDF::URI.new('http://semanticscience.org/resource/SIO_000465') , RDF::URI.new('http://semanticscience.org/resource/SIO_000742') => RDF::URI.new('http://semanticscience.org/resource/SIO_000741') , RDF::URI.new('http://semanticscience.org/resource/SIO_000743') => RDF::URI.new('http://semanticscience.org/resource/SIO_000741') , RDF::URI.new('http://semanticscience.org/resource/SIO_000750') => RDF::URI.new('http://semanticscience.org/resource/SIO_000602') , RDF::URI.new('http://semanticscience.org/resource/SIO_000751') => RDF::URI.new('http://semanticscience.org/resource/SIO_000555') , RDF::URI.new('http://semanticscience.org/resource/SIO_000760') => RDF::URI.new('http://semanticscience.org/resource/SIO_000755') , RDF::URI.new('http://semanticscience.org/resource/SIO_000766') => RDF::URI.new('http://semanticscience.org/resource/SIO_000328') , RDF::URI.new('http://semanticscience.org/resource/SIO_000767') => RDF::URI.new('http://semanticscience.org/resource/SIO_000013') , RDF::URI.new('http://semanticscience.org/resource/SIO_000768') => RDF::URI.new('http://semanticscience.org/resource/SIO_000179') , RDF::URI.new('http://semanticscience.org/resource/SIO_000769') => RDF::URI.new('http://semanticscience.org/resource/SIO_000052') , RDF::URI.new('http://semanticscience.org/resource/SIO_000770') => RDF::URI.new('http://semanticscience.org/resource/SIO_000052') , RDF::URI.new('http://semanticscience.org/resource/SIO_000771') => RDF::URI.new('http://semanticscience.org/resource/SIO_000088') , RDF::URI.new('http://semanticscience.org/resource/SIO_000777') => RDF::URI.new('http://semanticscience.org/resource/SIO_000692') , RDF::URI.new('http://semanticscience.org/resource/SIO_000778') => RDF::URI.new('http://semanticscience.org/resource/SIO_000378') , RDF::URI.new('http://semanticscience.org/resource/SIO_000780') => RDF::URI.new('http://semanticscience.org/resource/SIO_000494') , RDF::URI.new('http://semanticscience.org/resource/SIO_000783') => RDF::URI.new('http://semanticscience.org/resource/SIO_000370') , RDF::URI.new('http://semanticscience.org/resource/SIO_000784') => RDF::URI.new('http://semanticscience.org/resource/SIO_010029') , RDF::URI.new('http://semanticscience.org/resource/SIO_000785') => RDF::URI.new('http://semanticscience.org/resource/SIO_000136') , RDF::URI.new('http://semanticscience.org/resource/SIO_000786') => RDF::URI.new('http://semanticscience.org/resource/SIO_000078') , RDF::URI.new('http://semanticscience.org/resource/SIO_000787') => RDF::URI.new('http://semanticscience.org/resource/SIO_000794') , RDF::URI.new('http://semanticscience.org/resource/SIO_000788') => RDF::URI.new('http://semanticscience.org/resource/SIO_000056') , RDF::URI.new('http://semanticscience.org/resource/SIO_000789') => RDF::URI.new('http://semanticscience.org/resource/SIO_000788') , RDF::URI.new('http://semanticscience.org/resource/SIO_000790') => RDF::URI.new('http://semanticscience.org/resource/SIO_000038') , RDF::URI.new('http://semanticscience.org/resource/SIO_000791') => RDF::URI.new('http://semanticscience.org/resource/SIO_000943') , RDF::URI.new('http://semanticscience.org/resource/SIO_000792') => RDF::URI.new('http://semanticscience.org/resource/SIO_000953') , RDF::URI.new('http://semanticscience.org/resource/SIO_000794') => RDF::URI.new('http://semanticscience.org/resource/SIO_000257') , RDF::URI.new('http://semanticscience.org/resource/SIO_000796') => RDF::URI.new('http://semanticscience.org/resource/SIO_000880') , RDF::URI.new('http://semanticscience.org/resource/SIO_000797') => RDF::URI.new('http://semanticscience.org/resource/SIO_000879') , RDF::URI.new('http://semanticscience.org/resource/SIO_000799') => RDF::URI.new('http://semanticscience.org/resource/SIO_000889') , RDF::URI.new('http://semanticscience.org/resource/SIO_000800') => RDF::URI.new('http://semanticscience.org/resource/SIO_000799') , RDF::URI.new('http://semanticscience.org/resource/SIO_000801') => RDF::URI.new('http://semanticscience.org/resource/SIO_000800') , RDF::URI.new('http://semanticscience.org/resource/SIO_000802') => RDF::URI.new('http://semanticscience.org/resource/SIO_000800') , RDF::URI.new('http://semanticscience.org/resource/SIO_000803') => RDF::URI.new('http://semanticscience.org/resource/SIO_000880') , RDF::URI.new('http://semanticscience.org/resource/SIO_000804') => RDF::URI.new('http://semanticscience.org/resource/SIO_000880') , RDF::URI.new('http://semanticscience.org/resource/SIO_000805') => RDF::URI.new('http://semanticscience.org/resource/SIO_010442') , RDF::URI.new('http://semanticscience.org/resource/SIO_000806') => RDF::URI.new('http://semanticscience.org/resource/SIO_010442') , RDF::URI.new('http://semanticscience.org/resource/SIO_000807') => RDF::URI.new('http://semanticscience.org/resource/SIO_000809') , RDF::URI.new('http://semanticscience.org/resource/SIO_000808') => RDF::URI.new('http://semanticscience.org/resource/SIO_000809') , RDF::URI.new('http://semanticscience.org/resource/SIO_000809') => RDF::URI.new('http://semanticscience.org/resource/SIO_000805') , RDF::URI.new('http://semanticscience.org/resource/SIO_000810') => RDF::URI.new('http://semanticscience.org/resource/SIO_000805') , RDF::URI.new('http://semanticscience.org/resource/SIO_000812') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000813') => RDF::URI.new('http://semanticscience.org/resource/SIO_000815') , RDF::URI.new('http://semanticscience.org/resource/SIO_000814') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000815') => RDF::URI.new('http://semanticscience.org/resource/SIO_000949') , RDF::URI.new('http://semanticscience.org/resource/SIO_000816') => RDF::URI.new('http://semanticscience.org/resource/SIO_000847') , RDF::URI.new('http://semanticscience.org/resource/SIO_000817') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000818') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000819') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000820') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000821') => RDF::URI.new('http://semanticscience.org/resource/SIO_000828') , RDF::URI.new('http://semanticscience.org/resource/SIO_000822') => RDF::URI.new('http://semanticscience.org/resource/SIO_000840') , RDF::URI.new('http://semanticscience.org/resource/SIO_000823') => RDF::URI.new('http://semanticscience.org/resource/SIO_000825') , RDF::URI.new('http://semanticscience.org/resource/SIO_000824') => RDF::URI.new('http://semanticscience.org/resource/SIO_000863') , RDF::URI.new('http://semanticscience.org/resource/SIO_000825') => RDF::URI.new('http://semanticscience.org/resource/SIO_000848') , RDF::URI.new('http://semanticscience.org/resource/SIO_000826') => RDF::URI.new('http://semanticscience.org/resource/SIO_000863') , RDF::URI.new('http://semanticscience.org/resource/SIO_000827') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000828') => RDF::URI.new('http://semanticscience.org/resource/SIO_000844') , RDF::URI.new('http://semanticscience.org/resource/SIO_000829') => RDF::URI.new('http://semanticscience.org/resource/SIO_000837') , RDF::URI.new('http://semanticscience.org/resource/SIO_000830') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000831') => RDF::URI.new('http://semanticscience.org/resource/SIO_000276') , RDF::URI.new('http://semanticscience.org/resource/SIO_000832') => RDF::URI.new('http://semanticscience.org/resource/SIO_000276') , RDF::URI.new('http://semanticscience.org/resource/SIO_000833') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000834') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000835') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000836') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000837') => RDF::URI.new('http://semanticscience.org/resource/SIO_000949') , RDF::URI.new('http://semanticscience.org/resource/SIO_000838') => RDF::URI.new('http://semanticscience.org/resource/SIO_000814') , RDF::URI.new('http://semanticscience.org/resource/SIO_000839') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000840') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000841') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000842') => RDF::URI.new('http://semanticscience.org/resource/SIO_000863') , RDF::URI.new('http://semanticscience.org/resource/SIO_000843') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000844') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000845') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000846') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000847') => RDF::URI.new('http://semanticscience.org/resource/SIO_000276') , RDF::URI.new('http://semanticscience.org/resource/SIO_000848') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000849') => RDF::URI.new('http://semanticscience.org/resource/SIO_000834') , RDF::URI.new('http://semanticscience.org/resource/SIO_000850') => RDF::URI.new('http://semanticscience.org/resource/SIO_000840') , RDF::URI.new('http://semanticscience.org/resource/SIO_000851') => RDF::URI.new('http://semanticscience.org/resource/SIO_000828') , RDF::URI.new('http://semanticscience.org/resource/SIO_000852') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000853') => RDF::URI.new('http://semanticscience.org/resource/SIO_000825') , RDF::URI.new('http://semanticscience.org/resource/SIO_000854') => RDF::URI.new('http://semanticscience.org/resource/SIO_000863') , RDF::URI.new('http://semanticscience.org/resource/SIO_000855') => RDF::URI.new('http://semanticscience.org/resource/SIO_000837') , RDF::URI.new('http://semanticscience.org/resource/SIO_000856') => RDF::URI.new('http://semanticscience.org/resource/SIO_000825') , RDF::URI.new('http://semanticscience.org/resource/SIO_000857') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000858') => RDF::URI.new('http://semanticscience.org/resource/SIO_000840') , RDF::URI.new('http://semanticscience.org/resource/SIO_000859') => RDF::URI.new('http://semanticscience.org/resource/SIO_000864') , RDF::URI.new('http://semanticscience.org/resource/SIO_000860') => RDF::URI.new('http://semanticscience.org/resource/SIO_000410') , RDF::URI.new('http://semanticscience.org/resource/SIO_000861') => RDF::URI.new('http://semanticscience.org/resource/SIO_000873') , RDF::URI.new('http://semanticscience.org/resource/SIO_000862') => RDF::URI.new('http://semanticscience.org/resource/SIO_000873') , RDF::URI.new('http://semanticscience.org/resource/SIO_000863') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000864') => RDF::URI.new('http://semanticscience.org/resource/SIO_000822') , RDF::URI.new('http://semanticscience.org/resource/SIO_000865') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000866') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000867') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000868') => RDF::URI.new('http://semanticscience.org/resource/SIO_000863') , RDF::URI.new('http://semanticscience.org/resource/SIO_000869') => RDF::URI.new('http://semanticscience.org/resource/SIO_000845') , RDF::URI.new('http://semanticscience.org/resource/SIO_000870') => RDF::URI.new('http://semanticscience.org/resource/SIO_000831') , RDF::URI.new('http://semanticscience.org/resource/SIO_000871') => RDF::URI.new('http://semanticscience.org/resource/SIO_000829') , RDF::URI.new('http://semanticscience.org/resource/SIO_000872') => RDF::URI.new('http://semanticscience.org/resource/SIO_000870') , RDF::URI.new('http://semanticscience.org/resource/SIO_000873') => RDF::URI.new('http://semanticscience.org/resource/SIO_000949') , RDF::URI.new('http://semanticscience.org/resource/SIO_000875') => RDF::URI.new('http://semanticscience.org/resource/SIO_000711') , RDF::URI.new('http://semanticscience.org/resource/SIO_000876') => RDF::URI.new('http://semanticscience.org/resource/SIO_000711') , RDF::URI.new('http://semanticscience.org/resource/SIO_000877') => RDF::URI.new('http://semanticscience.org/resource/SIO_000876') , RDF::URI.new('http://semanticscience.org/resource/SIO_000878') => RDF::URI.new('http://semanticscience.org/resource/SIO_000876') , RDF::URI.new('http://semanticscience.org/resource/SIO_000879') => RDF::URI.new('http://semanticscience.org/resource/SIO_000889') , RDF::URI.new('http://semanticscience.org/resource/SIO_000880') => RDF::URI.new('http://semanticscience.org/resource/SIO_000889') , RDF::URI.new('http://semanticscience.org/resource/SIO_000881') => RDF::URI.new('http://semanticscience.org/resource/SIO_000677') , RDF::URI.new('http://semanticscience.org/resource/SIO_000882') => RDF::URI.new('http://semanticscience.org/resource/SIO_000888') , RDF::URI.new('http://semanticscience.org/resource/SIO_000883') => RDF::URI.new('http://semanticscience.org/resource/SIO_000881') , RDF::URI.new('http://semanticscience.org/resource/SIO_000884') => RDF::URI.new('http://semanticscience.org/resource/SIO_000706') , RDF::URI.new('http://semanticscience.org/resource/SIO_000885') => RDF::URI.new('http://semanticscience.org/resource/SIO_000884') , RDF::URI.new('http://semanticscience.org/resource/SIO_000886') => RDF::URI.new('http://semanticscience.org/resource/SIO_000884') , RDF::URI.new('http://semanticscience.org/resource/SIO_000890') => RDF::URI.new('http://semanticscience.org/resource/SIO_000891') , RDF::URI.new('http://semanticscience.org/resource/SIO_000891') => RDF::URI.new('http://semanticscience.org/resource/SIO_000888') , RDF::URI.new('http://semanticscience.org/resource/SIO_000894') => RDF::URI.new('http://semanticscience.org/resource/SIO_000692') , RDF::URI.new('http://semanticscience.org/resource/SIO_000895') => RDF::URI.new('http://semanticscience.org/resource/SIO_000894') , RDF::URI.new('http://semanticscience.org/resource/SIO_000896') => RDF::URI.new('http://semanticscience.org/resource/SIO_000879') , RDF::URI.new('http://semanticscience.org/resource/SIO_000898') => RDF::URI.new('http://semanticscience.org/resource/SIO_000897') , RDF::URI.new('http://semanticscience.org/resource/SIO_000899') => RDF::URI.new('http://semanticscience.org/resource/SIO_010506') , RDF::URI.new('http://semanticscience.org/resource/SIO_000902') => RDF::URI.new('http://semanticscience.org/resource/SIO_000458') , RDF::URI.new('http://semanticscience.org/resource/SIO_000903') => RDF::URI.new('http://semanticscience.org/resource/SIO_000458') , RDF::URI.new('http://semanticscience.org/resource/SIO_000904') => RDF::URI.new('http://semanticscience.org/resource/SIO_000080') , RDF::URI.new('http://semanticscience.org/resource/SIO_000906') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000907') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000908') => RDF::URI.new('http://semanticscience.org/resource/SIO_000934') , RDF::URI.new('http://semanticscience.org/resource/SIO_000909') => RDF::URI.new('http://semanticscience.org/resource/SIO_000447') , RDF::URI.new('http://semanticscience.org/resource/SIO_000910') => RDF::URI.new('http://semanticscience.org/resource/SIO_000907') , RDF::URI.new('http://semanticscience.org/resource/SIO_000911') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000912') => RDF::URI.new('http://semanticscience.org/resource/SIO_000315') , RDF::URI.new('http://semanticscience.org/resource/SIO_000913') => RDF::URI.new('http://semanticscience.org/resource/SIO_000912') , RDF::URI.new('http://semanticscience.org/resource/SIO_000914') => RDF::URI.new('http://semanticscience.org/resource/SIO_000912') , RDF::URI.new('http://semanticscience.org/resource/SIO_000920') => RDF::URI.new('http://semanticscience.org/resource/SIO_000367') , RDF::URI.new('http://semanticscience.org/resource/SIO_000921') => RDF::URI.new('http://semanticscience.org/resource/SIO_000367') , RDF::URI.new('http://semanticscience.org/resource/SIO_000922') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000923') => RDF::URI.new('http://semanticscience.org/resource/SIO_000898') , RDF::URI.new('http://semanticscience.org/resource/SIO_000924') => RDF::URI.new('http://semanticscience.org/resource/SIO_000612') , RDF::URI.new('http://semanticscience.org/resource/SIO_000926') => RDF::URI.new('http://semanticscience.org/resource/SIO_000957') , RDF::URI.new('http://semanticscience.org/resource/SIO_000927') => RDF::URI.new('http://semanticscience.org/resource/SIO_000957') , RDF::URI.new('http://semanticscience.org/resource/SIO_000928') => RDF::URI.new('http://semanticscience.org/resource/SIO_000956') , RDF::URI.new('http://semanticscience.org/resource/SIO_000929') => RDF::URI.new('http://semanticscience.org/resource/SIO_000940') , RDF::URI.new('http://semanticscience.org/resource/SIO_000930') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000931') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000932') => RDF::URI.new('http://semanticscience.org/resource/SIO_000911') , RDF::URI.new('http://semanticscience.org/resource/SIO_000933') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000934') => RDF::URI.new('http://semanticscience.org/resource/SIO_000083') , RDF::URI.new('http://semanticscience.org/resource/SIO_000935') => RDF::URI.new('http://semanticscience.org/resource/SIO_000940') , RDF::URI.new('http://semanticscience.org/resource/SIO_000936') => RDF::URI.new('http://semanticscience.org/resource/SIO_000937') , RDF::URI.new('http://semanticscience.org/resource/SIO_000937') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000938') => RDF::URI.new('http://semanticscience.org/resource/SIO_000937') , RDF::URI.new('http://semanticscience.org/resource/SIO_000939') => RDF::URI.new('http://semanticscience.org/resource/SIO_000937') , RDF::URI.new('http://semanticscience.org/resource/SIO_000940') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000941') => RDF::URI.new('http://semanticscience.org/resource/SIO_000969') , RDF::URI.new('http://semanticscience.org/resource/SIO_000942') => RDF::URI.new('http://semanticscience.org/resource/SIO_000794') , RDF::URI.new('http://semanticscience.org/resource/SIO_000943') => RDF::URI.new('http://semanticscience.org/resource/SIO_000788') , RDF::URI.new('http://semanticscience.org/resource/SIO_000944') => RDF::URI.new('http://semanticscience.org/resource/SIO_000075') , RDF::URI.new('http://semanticscience.org/resource/SIO_000945') => RDF::URI.new('http://semanticscience.org/resource/SIO_000931') , RDF::URI.new('http://semanticscience.org/resource/SIO_000946') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000947') => RDF::URI.new('http://semanticscience.org/resource/SIO_000904') , RDF::URI.new('http://semanticscience.org/resource/SIO_000948') => RDF::URI.new('http://semanticscience.org/resource/SIO_000945') , RDF::URI.new('http://semanticscience.org/resource/SIO_000949') => RDF::URI.new('http://semanticscience.org/resource/SIO_000832') , RDF::URI.new('http://semanticscience.org/resource/SIO_000950') => RDF::URI.new('http://semanticscience.org/resource/SIO_000828') , RDF::URI.new('http://semanticscience.org/resource/SIO_000951') => RDF::URI.new('http://semanticscience.org/resource/SIO_000845') , RDF::URI.new('http://semanticscience.org/resource/SIO_000952') => RDF::URI.new('http://semanticscience.org/resource/SIO_000144') , RDF::URI.new('http://semanticscience.org/resource/SIO_000953') => RDF::URI.new('http://semanticscience.org/resource/SIO_000788') , RDF::URI.new('http://semanticscience.org/resource/SIO_000954') => RDF::URI.new('http://semanticscience.org/resource/SIO_010058') , RDF::URI.new('http://semanticscience.org/resource/SIO_000955') => RDF::URI.new('http://semanticscience.org/resource/SIO_000414') , RDF::URI.new('http://semanticscience.org/resource/SIO_000956') => RDF::URI.new('http://semanticscience.org/resource/SIO_010462') , RDF::URI.new('http://semanticscience.org/resource/SIO_000957') => RDF::URI.new('http://semanticscience.org/resource/SIO_000956') , RDF::URI.new('http://semanticscience.org/resource/SIO_000959') => RDF::URI.new('http://semanticscience.org/resource/SIO_000005') , RDF::URI.new('http://semanticscience.org/resource/SIO_000960') => RDF::URI.new('http://semanticscience.org/resource/SIO_000959') , RDF::URI.new('http://semanticscience.org/resource/SIO_000961') => RDF::URI.new('http://semanticscience.org/resource/SIO_000959') , RDF::URI.new('http://semanticscience.org/resource/SIO_000962') => RDF::URI.new('http://semanticscience.org/resource/SIO_000959') , RDF::URI.new('http://semanticscience.org/resource/SIO_000963') => RDF::URI.new('http://semanticscience.org/resource/SIO_000033') , RDF::URI.new('http://semanticscience.org/resource/SIO_000964') => RDF::URI.new('http://semanticscience.org/resource/SIO_001043') , RDF::URI.new('http://semanticscience.org/resource/SIO_000965') => RDF::URI.new('http://semanticscience.org/resource/SIO_000436') , RDF::URI.new('http://semanticscience.org/resource/SIO_000966') => RDF::URI.new('http://semanticscience.org/resource/SIO_000965') , RDF::URI.new('http://semanticscience.org/resource/SIO_000967') => RDF::URI.new('http://semanticscience.org/resource/SIO_000965') , RDF::URI.new('http://semanticscience.org/resource/SIO_000969') => RDF::URI.new('http://semanticscience.org/resource/SIO_000593') , RDF::URI.new('http://semanticscience.org/resource/SIO_000977') => RDF::URI.new('http://semanticscience.org/resource/SIO_000786') , RDF::URI.new('http://semanticscience.org/resource/SIO_000978') => RDF::URI.new('http://semanticscience.org/resource/SIO_000786') , RDF::URI.new('http://semanticscience.org/resource/SIO_000979') => RDF::URI.new('http://semanticscience.org/resource/SIO_000786') , RDF::URI.new('http://semanticscience.org/resource/SIO_000980') => RDF::URI.new('http://semanticscience.org/resource/SIO_000104') , RDF::URI.new('http://semanticscience.org/resource/SIO_000981') => RDF::URI.new('http://semanticscience.org/resource/SIO_000104') , RDF::URI.new('http://semanticscience.org/resource/SIO_000982') => RDF::URI.new('http://semanticscience.org/resource/SIO_000104') , RDF::URI.new('http://semanticscience.org/resource/SIO_000984') => RDF::URI.new('http://semanticscience.org/resource/SIO_010046') , RDF::URI.new('http://semanticscience.org/resource/SIO_000985') => RDF::URI.new('http://semanticscience.org/resource/SIO_010035') , RDF::URI.new('http://semanticscience.org/resource/SIO_000986') => RDF::URI.new('http://semanticscience.org/resource/SIO_010035') , RDF::URI.new('http://semanticscience.org/resource/SIO_000988') => RDF::URI.new('http://semanticscience.org/resource/SIO_010335') , RDF::URI.new('http://semanticscience.org/resource/SIO_000989') => RDF::URI.new('http://semanticscience.org/resource/SIO_000030') , RDF::URI.new('http://semanticscience.org/resource/SIO_000992') => RDF::URI.new('http://semanticscience.org/resource/SIO_000959') , RDF::URI.new('http://semanticscience.org/resource/SIO_000994') => RDF::URI.new('http://semanticscience.org/resource/SIO_000747') , RDF::URI.new('http://semanticscience.org/resource/SIO_000995') => RDF::URI.new('http://semanticscience.org/resource/SIO_000033') , RDF::URI.new('http://semanticscience.org/resource/SIO_000996') => RDF::URI.new('http://semanticscience.org/resource/SIO_000963') , RDF::URI.new('http://semanticscience.org/resource/SIO_000997') => RDF::URI.new('http://semanticscience.org/resource/SIO_000033') , RDF::URI.new('http://semanticscience.org/resource/SIO_001002') => RDF::URI.new('http://semanticscience.org/resource/SIO_001024') , RDF::URI.new('http://semanticscience.org/resource/SIO_001003') => RDF::URI.new('http://semanticscience.org/resource/SIO_001004') , RDF::URI.new('http://semanticscience.org/resource/SIO_001008') => RDF::URI.new('http://semanticscience.org/resource/SIO_001011') , RDF::URI.new('http://semanticscience.org/resource/SIO_001009') => RDF::URI.new('http://semanticscience.org/resource/SIO_001008') , RDF::URI.new('http://semanticscience.org/resource/SIO_001010') => RDF::URI.new('http://semanticscience.org/resource/SIO_001008') , RDF::URI.new('http://semanticscience.org/resource/SIO_001011') => RDF::URI.new('http://semanticscience.org/resource/SIO_000026') , RDF::URI.new('http://semanticscience.org/resource/SIO_001012') => RDF::URI.new('http://semanticscience.org/resource/SIO_010058') , RDF::URI.new('http://semanticscience.org/resource/SIO_001013') => RDF::URI.new('http://semanticscience.org/resource/SIO_000794') , RDF::URI.new('http://semanticscience.org/resource/SIO_001014') => RDF::URI.new('http://semanticscience.org/resource/SIO_000475') , RDF::URI.new('http://semanticscience.org/resource/SIO_001015') => RDF::URI.new('http://semanticscience.org/resource/SIO_000475') , RDF::URI.new('http://semanticscience.org/resource/SIO_001016') => RDF::URI.new('http://semanticscience.org/resource/SIO_001062') , RDF::URI.new('http://semanticscience.org/resource/SIO_001017') => RDF::URI.new('http://semanticscience.org/resource/SIO_000136') , RDF::URI.new('http://semanticscience.org/resource/SIO_001018') => RDF::URI.new('http://semanticscience.org/resource/SIO_000257') , RDF::URI.new('http://semanticscience.org/resource/SIO_001019') => RDF::URI.new('http://semanticscience.org/resource/SIO_000258') , RDF::URI.new('http://semanticscience.org/resource/SIO_001020') => RDF::URI.new('http://semanticscience.org/resource/SIO_001019') , RDF::URI.new('http://semanticscience.org/resource/SIO_001021') => RDF::URI.new('http://semanticscience.org/resource/SIO_000638') , RDF::URI.new('http://semanticscience.org/resource/SIO_001022') => RDF::URI.new('http://semanticscience.org/resource/SIO_001024') , RDF::URI.new('http://semanticscience.org/resource/SIO_001023') => RDF::URI.new('http://semanticscience.org/resource/SIO_001024') , RDF::URI.new('http://semanticscience.org/resource/SIO_001024') => RDF::URI.new('http://semanticscience.org/resource/SIO_000999') , RDF::URI.new('http://semanticscience.org/resource/SIO_001025') => RDF::URI.new('http://semanticscience.org/resource/SIO_000256') , RDF::URI.new('http://semanticscience.org/resource/SIO_001026') => RDF::URI.new('http://semanticscience.org/resource/SIO_000148') , RDF::URI.new('http://semanticscience.org/resource/SIO_001027') => RDF::URI.new('http://semanticscience.org/resource/SIO_000088') , RDF::URI.new('http://semanticscience.org/resource/SIO_001028') => RDF::URI.new('http://semanticscience.org/resource/SIO_001026') , RDF::URI.new('http://semanticscience.org/resource/SIO_001030') => RDF::URI.new('http://semanticscience.org/resource/SIO_000654') , RDF::URI.new('http://semanticscience.org/resource/SIO_001031') => RDF::URI.new('http://semanticscience.org/resource/SIO_000654') , RDF::URI.new('http://semanticscience.org/resource/SIO_001032') => RDF::URI.new('http://semanticscience.org/resource/SIO_000654') , RDF::URI.new('http://semanticscience.org/resource/SIO_001034') => RDF::URI.new('http://semanticscience.org/resource/SIO_001033') , RDF::URI.new('http://semanticscience.org/resource/SIO_001035') => RDF::URI.new('http://semanticscience.org/resource/SIO_001034') , RDF::URI.new('http://semanticscience.org/resource/SIO_001036') => RDF::URI.new('http://semanticscience.org/resource/SIO_001033') , RDF::URI.new('http://semanticscience.org/resource/SIO_001037') => RDF::URI.new('http://semanticscience.org/resource/SIO_001033') , RDF::URI.new('http://semanticscience.org/resource/SIO_001038') => RDF::URI.new('http://semanticscience.org/resource/SIO_001034') , RDF::URI.new('http://semanticscience.org/resource/SIO_001039') => RDF::URI.new('http://semanticscience.org/resource/SIO_001033') , RDF::URI.new('http://semanticscience.org/resource/SIO_001040') => RDF::URI.new('http://semanticscience.org/resource/SIO_000078') , RDF::URI.new('http://semanticscience.org/resource/SIO_001042') => RDF::URI.new('http://semanticscience.org/resource/SIO_000091') , RDF::URI.new('http://semanticscience.org/resource/SIO_001043') => RDF::URI.new('http://semanticscience.org/resource/SIO_000091') , RDF::URI.new('http://semanticscience.org/resource/SIO_001044') => RDF::URI.new('http://semanticscience.org/resource/SIO_010378') , RDF::URI.new('http://semanticscience.org/resource/SIO_001045') => RDF::URI.new('http://semanticscience.org/resource/SIO_001011') , RDF::URI.new('http://semanticscience.org/resource/SIO_001046') => RDF::URI.new('http://semanticscience.org/resource/SIO_001045') , RDF::URI.new('http://semanticscience.org/resource/SIO_001047') => RDF::URI.new('http://semanticscience.org/resource/SIO_001045') , RDF::URI.new('http://semanticscience.org/resource/SIO_001048') => RDF::URI.new('http://semanticscience.org/resource/SIO_000994') , RDF::URI.new('http://semanticscience.org/resource/SIO_001053') => RDF::URI.new('http://semanticscience.org/resource/SIO_000683') , RDF::URI.new('http://semanticscience.org/resource/SIO_001058') => RDF::URI.new('http://semanticscience.org/resource/SIO_001072') , RDF::URI.new('http://semanticscience.org/resource/SIO_001059') => RDF::URI.new('http://semanticscience.org/resource/SIO_000969') , RDF::URI.new('http://semanticscience.org/resource/SIO_001060') => RDF::URI.new('http://semanticscience.org/resource/SIO_000963') , RDF::URI.new('http://semanticscience.org/resource/SIO_001061') => RDF::URI.new('http://semanticscience.org/resource/SIO_000620') , RDF::URI.new('http://semanticscience.org/resource/SIO_001062') => RDF::URI.new('http://semanticscience.org/resource/SIO_001061') , RDF::URI.new('http://semanticscience.org/resource/SIO_001063') => RDF::URI.new('http://semanticscience.org/resource/SIO_000620') , RDF::URI.new('http://semanticscience.org/resource/SIO_001064') => RDF::URI.new('http://semanticscience.org/resource/SIO_000620') , RDF::URI.new('http://semanticscience.org/resource/SIO_001065') => RDF::URI.new('http://semanticscience.org/resource/SIO_001004') , RDF::URI.new('http://semanticscience.org/resource/SIO_001067') => RDF::URI.new('http://semanticscience.org/resource/SIO_000976') , RDF::URI.new('http://semanticscience.org/resource/SIO_001068') => RDF::URI.new('http://semanticscience.org/resource/SIO_000403') , RDF::URI.new('http://semanticscience.org/resource/SIO_001069') => RDF::URI.new('http://semanticscience.org/resource/SIO_000403') , RDF::URI.new('http://semanticscience.org/resource/SIO_001070') => RDF::URI.new('http://semanticscience.org/resource/SIO_000367') , RDF::URI.new('http://semanticscience.org/resource/SIO_001071') => RDF::URI.new('http://semanticscience.org/resource/SIO_000943') , RDF::URI.new('http://semanticscience.org/resource/SIO_001072') => RDF::URI.new('http://semanticscience.org/resource/SIO_000953') , RDF::URI.new('http://semanticscience.org/resource/SIO_001074') => RDF::URI.new('http://semanticscience.org/resource/SIO_001018') , RDF::URI.new('http://semanticscience.org/resource/SIO_001075') => RDF::URI.new('http://semanticscience.org/resource/SIO_000732') , RDF::URI.new('http://semanticscience.org/resource/SIO_001076') => RDF::URI.new('http://semanticscience.org/resource/SIO_000994') , RDF::URI.new('http://semanticscience.org/resource/SIO_001077') => RDF::URI.new('http://semanticscience.org/resource/SIO_000258') , RDF::URI.new('http://semanticscience.org/resource/SIO_001078') => RDF::URI.new('http://semanticscience.org/resource/SIO_001018') , RDF::URI.new('http://semanticscience.org/resource/SIO_001079') => RDF::URI.new('http://semanticscience.org/resource/SIO_000315') , RDF::URI.new('http://semanticscience.org/resource/SIO_001080') => RDF::URI.new('http://semanticscience.org/resource/SIO_000616') , RDF::URI.new('http://semanticscience.org/resource/SIO_001083') => RDF::URI.new('http://semanticscience.org/resource/SIO_000418') , RDF::URI.new('http://semanticscience.org/resource/SIO_010000') => RDF::URI.new('http://semanticscience.org/resource/SIO_010046') , RDF::URI.new('http://semanticscience.org/resource/SIO_010001') => RDF::URI.new('http://semanticscience.org/resource/SIO_010046') , RDF::URI.new('http://semanticscience.org/resource/SIO_010003') => RDF::URI.new('http://semanticscience.org/resource/SIO_010046') , RDF::URI.new('http://semanticscience.org/resource/SIO_010004') => RDF::URI.new('http://semanticscience.org/resource/SIO_000004') , RDF::URI.new('http://semanticscience.org/resource/SIO_010005') => RDF::URI.new('http://semanticscience.org/resource/SIO_010020') , RDF::URI.new('http://semanticscience.org/resource/SIO_010011') => RDF::URI.new('http://semanticscience.org/resource/SIO_010072') , RDF::URI.new('http://semanticscience.org/resource/SIO_010014') => RDF::URI.new('http://semanticscience.org/resource/SIO_011119') , RDF::URI.new('http://semanticscience.org/resource/SIO_010019') => RDF::URI.new('http://semanticscience.org/resource/SIO_000472') , RDF::URI.new('http://semanticscience.org/resource/SIO_010022') => RDF::URI.new('http://semanticscience.org/resource/SIO_011119') , RDF::URI.new('http://semanticscience.org/resource/SIO_010023') => RDF::URI.new('http://semanticscience.org/resource/SIO_011119') , RDF::URI.new('http://semanticscience.org/resource/SIO_010024') => RDF::URI.new('http://semanticscience.org/resource/SIO_011119') , RDF::URI.new('http://semanticscience.org/resource/SIO_010026') => RDF::URI.new('http://semanticscience.org/resource/SIO_010028') , RDF::URI.new('http://semanticscience.org/resource/SIO_010028') => RDF::URI.new('http://semanticscience.org/resource/SIO_010019') , RDF::URI.new('http://semanticscience.org/resource/SIO_010029') => RDF::URI.new('http://semanticscience.org/resource/SIO_000475') , RDF::URI.new('http://semanticscience.org/resource/SIO_010030') => RDF::URI.new('http://semanticscience.org/resource/SIO_010072') , RDF::URI.new('http://semanticscience.org/resource/SIO_010031') => RDF::URI.new('http://semanticscience.org/resource/SIO_000732') , RDF::URI.new('http://semanticscience.org/resource/SIO_010032') => RDF::URI.new('http://semanticscience.org/resource/SIO_000729') , RDF::URI.new('http://semanticscience.org/resource/SIO_010033') => RDF::URI.new('http://semanticscience.org/resource/SIO_010005') , RDF::URI.new('http://semanticscience.org/resource/SIO_010034') => RDF::URI.new('http://semanticscience.org/resource/SIO_010496') , RDF::URI.new('http://semanticscience.org/resource/SIO_010035') => RDF::URI.new('http://semanticscience.org/resource/SIO_010335') , RDF::URI.new('http://semanticscience.org/resource/SIO_010038') => RDF::URI.new('http://semanticscience.org/resource/SIO_011125') , RDF::URI.new('http://semanticscience.org/resource/SIO_010039') => RDF::URI.new('http://semanticscience.org/resource/SIO_010411') , RDF::URI.new('http://semanticscience.org/resource/SIO_010040') => RDF::URI.new('http://semanticscience.org/resource/SIO_010049') , RDF::URI.new('http://semanticscience.org/resource/SIO_010041') => RDF::URI.new('http://semanticscience.org/resource/SIO_010049') , RDF::URI.new('http://semanticscience.org/resource/SIO_010042') => RDF::URI.new('http://semanticscience.org/resource/SIO_010335') , RDF::URI.new('http://semanticscience.org/resource/SIO_010044') => RDF::URI.new('http://semanticscience.org/resource/SIO_010004') , RDF::URI.new('http://semanticscience.org/resource/SIO_010045') => RDF::URI.new('http://semanticscience.org/resource/SIO_010005') , RDF::URI.new('http://semanticscience.org/resource/SIO_010046') => RDF::URI.new('http://semanticscience.org/resource/SIO_010462') , RDF::URI.new('http://semanticscience.org/resource/SIO_010047') => RDF::URI.new('http://semanticscience.org/resource/SIO_010020') , RDF::URI.new('http://semanticscience.org/resource/SIO_010048') => RDF::URI.new('http://semanticscience.org/resource/SIO_010029') , RDF::URI.new('http://semanticscience.org/resource/SIO_010049') => RDF::URI.new('http://semanticscience.org/resource/SIO_000019') , RDF::URI.new('http://semanticscience.org/resource/SIO_010050') => RDF::URI.new('http://semanticscience.org/resource/SIO_010040') , RDF::URI.new('http://semanticscience.org/resource/SIO_010051') => RDF::URI.new('http://semanticscience.org/resource/SIO_010046') , RDF::URI.new('http://semanticscience.org/resource/SIO_010052') => RDF::URI.new('http://semanticscience.org/resource/SIO_010029') , RDF::URI.new('http://semanticscience.org/resource/SIO_010053') => RDF::URI.new('http://semanticscience.org/resource/SIO_010028') , RDF::URI.new('http://semanticscience.org/resource/SIO_010054') => RDF::URI.new('http://semanticscience.org/resource/SIO_010046') , RDF::URI.new('http://semanticscience.org/resource/SIO_010056') => RDF::URI.new('http://semanticscience.org/resource/SIO_000475') , RDF::URI.new('http://semanticscience.org/resource/SIO_010057') => RDF::URI.new('http://semanticscience.org/resource/SIO_000475') , RDF::URI.new('http://semanticscience.org/resource/SIO_010058') => RDF::URI.new('http://semanticscience.org/resource/SIO_010057') , RDF::URI.new('http://semanticscience.org/resource/SIO_010059') => RDF::URI.new('http://semanticscience.org/resource/SIO_010057') , RDF::URI.new('http://semanticscience.org/resource/SIO_010060') => RDF::URI.new('http://semanticscience.org/resource/SIO_010053') , RDF::URI.new('http://semanticscience.org/resource/SIO_010061') => RDF::URI.new('http://semanticscience.org/resource/SIO_010028') , RDF::URI.new('http://semanticscience.org/resource/SIO_010064') => RDF::URI.new('http://semanticscience.org/resource/SIO_010444') , RDF::URI.new('http://semanticscience.org/resource/SIO_010065') => RDF::URI.new('http://semanticscience.org/resource/SIO_000472') , RDF::URI.new('http://semanticscience.org/resource/SIO_010066') => RDF::URI.new('http://semanticscience.org/resource/SIO_010065') , RDF::URI.new('http://semanticscience.org/resource/SIO_010067') => RDF::URI.new('http://semanticscience.org/resource/SIO_010066') , RDF::URI.new('http://semanticscience.org/resource/SIO_010068') => RDF::URI.new('http://semanticscience.org/resource/SIO_010066') , RDF::URI.new('http://semanticscience.org/resource/SIO_010070') => RDF::URI.new('http://semanticscience.org/resource/SIO_010444') , RDF::URI.new('http://semanticscience.org/resource/SIO_010074') => RDF::URI.new('http://semanticscience.org/resource/SIO_010471') , RDF::URI.new('http://semanticscience.org/resource/SIO_010075') => RDF::URI.new('http://semanticscience.org/resource/SIO_010335') , RDF::URI.new('http://semanticscience.org/resource/SIO_010076') => RDF::URI.new('http://semanticscience.org/resource/SIO_010038') , RDF::URI.new('http://semanticscience.org/resource/SIO_010077') => RDF::URI.new('http://semanticscience.org/resource/SIO_010338') , RDF::URI.new('http://semanticscience.org/resource/SIO_010085') => RDF::URI.new('http://semanticscience.org/resource/SIO_010444') , RDF::URI.new('http://semanticscience.org/resource/SIO_010086') => RDF::URI.new('http://semanticscience.org/resource/SIO_010085') , RDF::URI.new('http://semanticscience.org/resource/SIO_010087') => RDF::URI.new('http://semanticscience.org/resource/SIO_010338') , RDF::URI.new('http://semanticscience.org/resource/SIO_010088') => RDF::URI.new('http://semanticscience.org/resource/SIO_000542') , RDF::URI.new('http://semanticscience.org/resource/SIO_010089') => RDF::URI.new('http://semanticscience.org/resource/SIO_010088') , RDF::URI.new('http://semanticscience.org/resource/SIO_010090') => RDF::URI.new('http://semanticscience.org/resource/SIO_010088') , RDF::URI.new('http://semanticscience.org/resource/SIO_010091') => RDF::URI.new('http://semanticscience.org/resource/SIO_010088') , RDF::URI.new('http://semanticscience.org/resource/SIO_010094') => RDF::URI.new('http://semanticscience.org/resource/SIO_000542') , RDF::URI.new('http://semanticscience.org/resource/SIO_010099') => RDF::URI.new('http://semanticscience.org/resource/SIO_010450') , RDF::URI.new('http://semanticscience.org/resource/SIO_010278') => RDF::URI.new('http://semanticscience.org/resource/SIO_000476') , RDF::URI.new('http://semanticscience.org/resource/SIO_010284') => RDF::URI.new('http://semanticscience.org/resource/SIO_000576') , RDF::URI.new('http://semanticscience.org/resource/SIO_010287') => RDF::URI.new('http://semanticscience.org/resource/SIO_000609') , RDF::URI.new('http://semanticscience.org/resource/SIO_010295') => RDF::URI.new('http://semanticscience.org/resource/SIO_010287') , RDF::URI.new('http://semanticscience.org/resource/SIO_010296') => RDF::URI.new('http://semanticscience.org/resource/SIO_010287') , RDF::URI.new('http://semanticscience.org/resource/SIO_010298') => RDF::URI.new('http://semanticscience.org/resource/SIO_010019') , RDF::URI.new('http://semanticscience.org/resource/SIO_010307') => RDF::URI.new('http://semanticscience.org/resource/SIO_010345') , RDF::URI.new('http://semanticscience.org/resource/SIO_010308') => RDF::URI.new('http://semanticscience.org/resource/SIO_010013') , RDF::URI.new('http://semanticscience.org/resource/SIO_010309') => RDF::URI.new('http://semanticscience.org/resource/SIO_010308') , RDF::URI.new('http://semanticscience.org/resource/SIO_010310') => RDF::URI.new('http://semanticscience.org/resource/SIO_010308') , RDF::URI.new('http://semanticscience.org/resource/SIO_010334') => RDF::URI.new('http://semanticscience.org/resource/SIO_010071') , RDF::URI.new('http://semanticscience.org/resource/SIO_010336') => RDF::URI.new('http://semanticscience.org/resource/SIO_010075') , RDF::URI.new('http://semanticscience.org/resource/SIO_010337') => RDF::URI.new('http://semanticscience.org/resource/SIO_010075') , RDF::URI.new('http://semanticscience.org/resource/SIO_010338') => RDF::URI.new('http://semanticscience.org/resource/SIO_011125') , RDF::URI.new('http://semanticscience.org/resource/SIO_010340') => RDF::URI.new('http://semanticscience.org/resource/SIO_000376') , RDF::URI.new('http://semanticscience.org/resource/SIO_010344') => RDF::URI.new('http://semanticscience.org/resource/SIO_011125') , RDF::URI.new('http://semanticscience.org/resource/SIO_010347') => RDF::URI.new('http://semanticscience.org/resource/SIO_000343') , RDF::URI.new('http://semanticscience.org/resource/SIO_010349') => RDF::URI.new('http://semanticscience.org/resource/SIO_010340') , RDF::URI.new('http://semanticscience.org/resource/SIO_010351') => RDF::URI.new('http://semanticscience.org/resource/SIO_010340') , RDF::URI.new('http://semanticscience.org/resource/SIO_010353') => RDF::URI.new('http://semanticscience.org/resource/SIO_000492') , RDF::URI.new('http://semanticscience.org/resource/SIO_010354') => RDF::URI.new('http://semanticscience.org/resource/SIO_010347') , RDF::URI.new('http://semanticscience.org/resource/SIO_010355') => RDF::URI.new('http://semanticscience.org/resource/SIO_010347') , RDF::URI.new('http://semanticscience.org/resource/SIO_010358') => RDF::URI.new('http://semanticscience.org/resource/SIO_010360') , RDF::URI.new('http://semanticscience.org/resource/SIO_010359') => RDF::URI.new('http://semanticscience.org/resource/SIO_010360') , RDF::URI.new('http://semanticscience.org/resource/SIO_010360') => RDF::URI.new('http://semanticscience.org/resource/SIO_000376') , RDF::URI.new('http://semanticscience.org/resource/SIO_010362') => RDF::URI.new('http://semanticscience.org/resource/SIO_010423') , RDF::URI.new('http://semanticscience.org/resource/SIO_010364') => RDF::URI.new('http://semanticscience.org/resource/SIO_000692') , RDF::URI.new('http://semanticscience.org/resource/SIO_010365') => RDF::URI.new('http://semanticscience.org/resource/SIO_010366') , RDF::URI.new('http://semanticscience.org/resource/SIO_010366') => RDF::URI.new('http://semanticscience.org/resource/SIO_010364') , RDF::URI.new('http://semanticscience.org/resource/SIO_010367') => RDF::URI.new('http://semanticscience.org/resource/SIO_010366') , RDF::URI.new('http://semanticscience.org/resource/SIO_010368') => RDF::URI.new('http://semanticscience.org/resource/SIO_000692') , RDF::URI.new('http://semanticscience.org/resource/SIO_010369') => RDF::URI.new('http://semanticscience.org/resource/SIO_010364') , RDF::URI.new('http://semanticscience.org/resource/SIO_010370') => RDF::URI.new('http://semanticscience.org/resource/SIO_010369') , RDF::URI.new('http://semanticscience.org/resource/SIO_010371') => RDF::URI.new('http://semanticscience.org/resource/SIO_010369') , RDF::URI.new('http://semanticscience.org/resource/SIO_010372') => RDF::URI.new('http://semanticscience.org/resource/SIO_010374') , RDF::URI.new('http://semanticscience.org/resource/SIO_010373') => RDF::URI.new('http://semanticscience.org/resource/SIO_010374') , RDF::URI.new('http://semanticscience.org/resource/SIO_010374') => RDF::URI.new('http://semanticscience.org/resource/SIO_010364') , RDF::URI.new('http://semanticscience.org/resource/SIO_010377') => RDF::URI.new('http://semanticscience.org/resource/SIO_010000') , RDF::URI.new('http://semanticscience.org/resource/SIO_010378') => RDF::URI.new('http://semanticscience.org/resource/SIO_010000') , RDF::URI.new('http://semanticscience.org/resource/SIO_010379') => RDF::URI.new('http://semanticscience.org/resource/SIO_010378') , RDF::URI.new('http://semanticscience.org/resource/SIO_010383') => RDF::URI.new('http://semanticscience.org/resource/SIO_000619') , RDF::URI.new('http://semanticscience.org/resource/SIO_010411') => RDF::URI.new('http://semanticscience.org/resource/SIO_010462') , RDF::URI.new('http://semanticscience.org/resource/SIO_010412') => RDF::URI.new('http://semanticscience.org/resource/SIO_001050') , RDF::URI.new('http://semanticscience.org/resource/SIO_010414') => RDF::URI.new('http://semanticscience.org/resource/SIO_010000') , RDF::URI.new('http://semanticscience.org/resource/SIO_010415') => RDF::URI.new('http://semanticscience.org/resource/SIO_010000') , RDF::URI.new('http://semanticscience.org/resource/SIO_010416') => RDF::URI.new('http://semanticscience.org/resource/SIO_010427') , RDF::URI.new('http://semanticscience.org/resource/SIO_010417') => RDF::URI.new('http://semanticscience.org/resource/SIO_010427') , RDF::URI.new('http://semanticscience.org/resource/SIO_010418') => RDF::URI.new('http://semanticscience.org/resource/SIO_010427') , RDF::URI.new('http://semanticscience.org/resource/SIO_010419') => RDF::URI.new('http://semanticscience.org/resource/SIO_011125') , RDF::URI.new('http://semanticscience.org/resource/SIO_010420') => RDF::URI.new('http://semanticscience.org/resource/SIO_010437') , RDF::URI.new('http://semanticscience.org/resource/SIO_010424') => RDF::URI.new('http://semanticscience.org/resource/SIO_010426') , RDF::URI.new('http://semanticscience.org/resource/SIO_010425') => RDF::URI.new('http://semanticscience.org/resource/SIO_010426') , RDF::URI.new('http://semanticscience.org/resource/SIO_010426') => RDF::URI.new('http://semanticscience.org/resource/SIO_011126') , RDF::URI.new('http://semanticscience.org/resource/SIO_010427') => RDF::URI.new('http://semanticscience.org/resource/SIO_011126') , RDF::URI.new('http://semanticscience.org/resource/SIO_010428') => RDF::URI.new('http://semanticscience.org/resource/SIO_000881') , RDF::URI.new('http://semanticscience.org/resource/SIO_010429') => RDF::URI.new('http://semanticscience.org/resource/SIO_010462') , RDF::URI.new('http://semanticscience.org/resource/SIO_010430') => RDF::URI.new('http://semanticscience.org/resource/SIO_010428') , RDF::URI.new('http://semanticscience.org/resource/SIO_010431') => RDF::URI.new('http://semanticscience.org/resource/SIO_010428') , RDF::URI.new('http://semanticscience.org/resource/SIO_010433') => RDF::URI.new('http://semanticscience.org/resource/SIO_010033') , RDF::URI.new('http://semanticscience.org/resource/SIO_010434') => RDF::URI.new('http://semanticscience.org/resource/SIO_010436') , RDF::URI.new('http://semanticscience.org/resource/SIO_010435') => RDF::URI.new('http://semanticscience.org/resource/SIO_010436') , RDF::URI.new('http://semanticscience.org/resource/SIO_010437') => RDF::URI.new('http://semanticscience.org/resource/SIO_011125') , RDF::URI.new('http://semanticscience.org/resource/SIO_010438') => RDF::URI.new('http://semanticscience.org/resource/SIO_010437') , RDF::URI.new('http://semanticscience.org/resource/SIO_010439') => RDF::URI.new('http://semanticscience.org/resource/SIO_010437') , RDF::URI.new('http://semanticscience.org/resource/SIO_010440') => RDF::URI.new('http://semanticscience.org/resource/SIO_010439') , RDF::URI.new('http://semanticscience.org/resource/SIO_010442') => RDF::URI.new('http://semanticscience.org/resource/SIO_001011') , RDF::URI.new('http://semanticscience.org/resource/SIO_010445') => RDF::URI.new('http://semanticscience.org/resource/SIO_010444') , RDF::URI.new('http://semanticscience.org/resource/SIO_010446') => RDF::URI.new('http://semanticscience.org/resource/SIO_010085') , RDF::URI.new('http://semanticscience.org/resource/SIO_010447') => RDF::URI.new('http://semanticscience.org/resource/SIO_010444') , RDF::URI.new('http://semanticscience.org/resource/SIO_010448') => RDF::URI.new('http://semanticscience.org/resource/SIO_010444') , RDF::URI.new('http://semanticscience.org/resource/SIO_010451') => RDF::URI.new('http://semanticscience.org/resource/SIO_010095') , RDF::URI.new('http://semanticscience.org/resource/SIO_010452') => RDF::URI.new('http://semanticscience.org/resource/SIO_010049') , RDF::URI.new('http://semanticscience.org/resource/SIO_010453') => RDF::URI.new('http://semanticscience.org/resource/SIO_010427') , RDF::URI.new('http://semanticscience.org/resource/SIO_010454') => RDF::URI.new('http://semanticscience.org/resource/SIO_010427') , RDF::URI.new('http://semanticscience.org/resource/SIO_010456') => RDF::URI.new('http://semanticscience.org/resource/SIO_010004') , RDF::URI.new('http://semanticscience.org/resource/SIO_010461') => RDF::URI.new('http://semanticscience.org/resource/SIO_000810') , RDF::URI.new('http://semanticscience.org/resource/SIO_010462') => RDF::URI.new('http://semanticscience.org/resource/SIO_011126') , RDF::URI.new('http://semanticscience.org/resource/SIO_010463') => RDF::URI.new('http://semanticscience.org/resource/SIO_011126') , RDF::URI.new('http://semanticscience.org/resource/SIO_010464') => RDF::URI.new('http://semanticscience.org/resource/SIO_000810') , RDF::URI.new('http://semanticscience.org/resource/SIO_010465') => RDF::URI.new('http://semanticscience.org/resource/SIO_010497') , RDF::URI.new('http://semanticscience.org/resource/SIO_010468') => RDF::URI.new('http://semanticscience.org/resource/SIO_010471') , RDF::URI.new('http://semanticscience.org/resource/SIO_010469') => RDF::URI.new('http://semanticscience.org/resource/SIO_010471') , RDF::URI.new('http://semanticscience.org/resource/SIO_010471') => RDF::URI.new('http://semanticscience.org/resource/SIO_010071') , RDF::URI.new('http://semanticscience.org/resource/SIO_010496') => RDF::URI.new('http://semanticscience.org/resource/SIO_010005') , RDF::URI.new('http://semanticscience.org/resource/SIO_010498') => RDF::URI.new('http://semanticscience.org/resource/SIO_011118') , RDF::URI.new('http://semanticscience.org/resource/SIO_010499') => RDF::URI.new('http://semanticscience.org/resource/SIO_011118') , RDF::URI.new('http://semanticscience.org/resource/SIO_010500') => RDF::URI.new('http://semanticscience.org/resource/SIO_011118') , RDF::URI.new('http://semanticscience.org/resource/SIO_010501') => RDF::URI.new('http://semanticscience.org/resource/SIO_011118') , RDF::URI.new('http://semanticscience.org/resource/SIO_010502') => RDF::URI.new('http://semanticscience.org/resource/SIO_010498') , RDF::URI.new('http://semanticscience.org/resource/SIO_010503') => RDF::URI.new('http://semanticscience.org/resource/SIO_010005') , RDF::URI.new('http://semanticscience.org/resource/SIO_010504') => RDF::URI.new('http://semanticscience.org/resource/SIO_010005') , RDF::URI.new('http://semanticscience.org/resource/SIO_010505') => RDF::URI.new('http://semanticscience.org/resource/SIO_010005') , RDF::URI.new('http://semanticscience.org/resource/SIO_010507') => RDF::URI.new('http://semanticscience.org/resource/SIO_010345') , RDF::URI.new('http://semanticscience.org/resource/SIO_010510') => RDF::URI.new('http://semanticscience.org/resource/SIO_010345') , RDF::URI.new('http://semanticscience.org/resource/SIO_010511') => RDF::URI.new('http://semanticscience.org/resource/SIO_010510') , RDF::URI.new('http://semanticscience.org/resource/SIO_010512') => RDF::URI.new('http://semanticscience.org/resource/SIO_010510') , RDF::URI.new('http://semanticscience.org/resource/SIO_010513') => RDF::URI.new('http://semanticscience.org/resource/SIO_010512') , RDF::URI.new('http://semanticscience.org/resource/SIO_010514') => RDF::URI.new('http://semanticscience.org/resource/SIO_010512') , RDF::URI.new('http://semanticscience.org/resource/SIO_010515') => RDF::URI.new('http://semanticscience.org/resource/SIO_010510') , RDF::URI.new('http://semanticscience.org/resource/SIO_010516') => RDF::URI.new('http://semanticscience.org/resource/SIO_010345') , RDF::URI.new('http://semanticscience.org/resource/SIO_010517') => RDF::URI.new('http://semanticscience.org/resource/SIO_010345') , RDF::URI.new('http://semanticscience.org/resource/SIO_010518') => RDF::URI.new('http://semanticscience.org/resource/SIO_010516') , RDF::URI.new('http://semanticscience.org/resource/SIO_010519') => RDF::URI.new('http://semanticscience.org/resource/SIO_010518') , RDF::URI.new('http://semanticscience.org/resource/SIO_010520') => RDF::URI.new('http://semanticscience.org/resource/SIO_010518') , RDF::URI.new('http://semanticscience.org/resource/SIO_010521') => RDF::URI.new('http://semanticscience.org/resource/SIO_010520') , RDF::URI.new('http://semanticscience.org/resource/SIO_010522') => RDF::URI.new('http://semanticscience.org/resource/SIO_010519') , RDF::URI.new('http://semanticscience.org/resource/SIO_010523') => RDF::URI.new('http://semanticscience.org/resource/SIO_010519') , RDF::URI.new('http://semanticscience.org/resource/SIO_010525') => RDF::URI.new('http://semanticscience.org/resource/SIO_010526') , RDF::URI.new('http://semanticscience.org/resource/SIO_010527') => RDF::URI.new('http://semanticscience.org/resource/SIO_010526') , RDF::URI.new('http://semanticscience.org/resource/SIO_010528') => RDF::URI.new('http://semanticscience.org/resource/SIO_010526') , RDF::URI.new('http://semanticscience.org/resource/SIO_010530') => RDF::URI.new('http://semanticscience.org/resource/SIO_010023') , RDF::URI.new('http://semanticscience.org/resource/SIO_010531') => RDF::URI.new('http://semanticscience.org/resource/SIO_010065') , RDF::URI.new('http://semanticscience.org/resource/SIO_010532') => RDF::URI.new('http://semanticscience.org/resource/SIO_010525') , RDF::URI.new('http://semanticscience.org/resource/SIO_010533') => RDF::URI.new('http://semanticscience.org/resource/SIO_010525') , RDF::URI.new('http://semanticscience.org/resource/SIO_010673') => RDF::URI.new('http://semanticscience.org/resource/SIO_010298') , RDF::URI.new('http://semanticscience.org/resource/SIO_010775') => RDF::URI.new('http://semanticscience.org/resource/SIO_010455') , RDF::URI.new('http://semanticscience.org/resource/SIO_010776') => RDF::URI.new('http://semanticscience.org/resource/SIO_010775') , RDF::URI.new('http://semanticscience.org/resource/SIO_010777') => RDF::URI.new('http://semanticscience.org/resource/SIO_010775') , RDF::URI.new('http://semanticscience.org/resource/SIO_010778') => RDF::URI.new('http://semanticscience.org/resource/SIO_010775') , RDF::URI.new('http://semanticscience.org/resource/SIO_010779') => RDF::URI.new('http://semanticscience.org/resource/SIO_010455') , RDF::URI.new('http://semanticscience.org/resource/SIO_010781') => RDF::URI.new('http://semanticscience.org/resource/SIO_010780') , RDF::URI.new('http://semanticscience.org/resource/SIO_010782') => RDF::URI.new('http://semanticscience.org/resource/SIO_010780') , RDF::URI.new('http://semanticscience.org/resource/SIO_010783') => RDF::URI.new('http://semanticscience.org/resource/SIO_010780') , RDF::URI.new('http://semanticscience.org/resource/SIO_010785') => RDF::URI.new('http://semanticscience.org/resource/SIO_010037') , RDF::URI.new('http://semanticscience.org/resource/SIO_010787') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010788') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010789') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010790') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010791') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010792') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010793') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010794') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_010795') => RDF::URI.new('http://semanticscience.org/resource/SIO_010786') , RDF::URI.new('http://semanticscience.org/resource/SIO_011000') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011001') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011002') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011003') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011004') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011005') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011006') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011007') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011008') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011009') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011010') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011011') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011012') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011013') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011014') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011015') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011016') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011017') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011018') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011019') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011020') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011021') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011022') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011023') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011024') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011025') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011026') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011027') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011028') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011029') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011030') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011031') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011032') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011033') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011034') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011035') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011036') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011037') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011038') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011039') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011040') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011041') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011042') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011043') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011044') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011045') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011046') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011047') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011048') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011049') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011050') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011051') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011052') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011053') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011054') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011055') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011056') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011057') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011058') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011059') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011060') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011061') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011062') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011063') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011064') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011065') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011066') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011067') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011068') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011069') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011070') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011071') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011072') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011073') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011074') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011075') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011076') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011077') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011078') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011079') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011080') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011081') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011082') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011083') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011084') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011085') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011086') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011087') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011088') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011089') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011090') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011091') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011092') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011093') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011094') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011095') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011096') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011097') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011098') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011099') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011100') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011101') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011102') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011103') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011104') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011105') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011106') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011107') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011108') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011109') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011110') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011111') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011112') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011113') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011114') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011115') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011116') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011117') => RDF::URI.new('http://semanticscience.org/resource/SIO_010044') , RDF::URI.new('http://semanticscience.org/resource/SIO_011123') => RDF::URI.new('http://semanticscience.org/resource/SIO_000472') , RDF::URI.new('http://semanticscience.org/resource/SIO_011126') => RDF::URI.new('http://semanticscience.org/resource/SIO_010004') , RDF::URI.new('http://semanticscience.org/resource/SIO_011130') => RDF::URI.new('http://semanticscience.org/resource/SIO_011120') }

end

end
