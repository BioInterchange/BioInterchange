import rdflib

from rdflib import Namespace


class SIO:

    @classmethod
    def is_related_to(cls):
        """A is related to B iff there is some relation between A and B.
        (cls, http://semanticscience.org/resource/SIO_000001)
        """
        return cls._namespace_SIO('SIO_000001')

    @classmethod
    def has_attribute(cls):
        """has attribute is a relation that associates a entity with an attribute where an attribute is an intrinsic characteristic such as a quality, capability, disposition, function, or is an externally derived attribute determined from some descriptor (cls, e.g. a quantity, position, label/identifier) either directly or indirectly through generalization of entities of the same type.
        (http://semanticscience.org/resource/SIO_000008)
        """
        return cls._namespace_SIO('SIO_000008')

    @classmethod
    def is_attribute_of(cls):
        """is attribute of is a relation that associates an attribute with an entity where an attribute is an intrinsic characteristic such as a quality, capability, disposition, function, or is an externally derived attribute determined from some descriptor (cls, e.g. a quantity, position, label/identifier) either directly or indirectly through generalization of entities of the same type.
        (http://semanticscience.org/resource/SIO_000011)
        """
        return cls._namespace_SIO('SIO_000011')

    @classmethod
    def denotes(cls):
        """denotes is a relation between an entity and what it is a sign or indication of, or what specifically means.
        (cls, http://semanticscience.org/resource/SIO_000020)
        """
        return cls._namespace_SIO('SIO_000020')

    @classmethod
    def has_part(cls):
        """has part is a transitive, reflexive and antisymmetric relation between a whole and itself or a whole and its part.
        (cls, http://semanticscience.org/resource/SIO_000028)
        """
        return cls._namespace_SIO('SIO_000028')

    @classmethod
    def is_time_boundary_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000029)
        """
        return cls._namespace_SIO('SIO_000029')

    @classmethod
    def has_proper_part(cls):
        """has proper part is an antisymmetric, irreflexive (cls, normally transitive) relation between a whole and a distinct part.
        (http://semanticscience.org/resource/SIO_000053)
        """
        return cls._namespace_SIO('SIO_000053')

    @classmethod
    def has_boundary(cls):
        """has boundary is a mereological relation between a whole and boundary located at its periphery.
        (cls, http://semanticscience.org/resource/SIO_000054)
        """
        return cls._namespace_SIO('SIO_000054')

    @classmethod
    def has_member(cls):
        """has member is a mereological relation between a collection and an item.
        (cls, http://semanticscience.org/resource/SIO_000059)
        """
        return cls._namespace_SIO('SIO_000059')

    @classmethod
    def is_denoted_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000060)
        """
        return cls._namespace_SIO('SIO_000060')

    @classmethod
    def is_located_in(cls):
        """A is located in B iff the spatial region occupied by A is part of the spatial region occupied by B. [T][R]
        (cls, http://semanticscience.org/resource/SIO_000061)
        """
        return cls._namespace_SIO('SIO_000061')

    @classmethod
    def is_participant_in(cls):
        """is participant in is a relation that describes the participation of the subject in the (cls, processual) object.
        (http://semanticscience.org/resource/SIO_000062)
        """
        return cls._namespace_SIO('SIO_000062')

    @classmethod
    def is_agent_in(cls):
        """is agent in is a relation between an entity and a process, where the entity is present throughout the process, no permanent material change occurs, and is a causal participant in the process.
        (cls, http://semanticscience.org/resource/SIO_000063)
        """
        return cls._namespace_SIO('SIO_000063')

    @classmethod
    def is_provider_of(cls):
        """is provider of is a relation between a source and the entity it makes available.
        (cls, http://semanticscience.org/resource/SIO_000064)
        """
        return cls._namespace_SIO('SIO_000064')

    @classmethod
    def has_provider(cls):
        """is provided by is a relation between an entity and the entity that provides it.
        (cls, http://semanticscience.org/resource/SIO_000066)
        """
        return cls._namespace_SIO('SIO_000066')

    @classmethod
    def is_part_of(cls):
        """is part of is a transitive, reflexive and anti-symmetric mereological relation between a whole and itself or a part and its whole.
        (cls, http://semanticscience.org/resource/SIO_000068)
        """
        return cls._namespace_SIO('SIO_000068')

    @classmethod
    def is_proper_part_of(cls):
        """is proper part of is an asymmetric, irreflexive (cls, normally transitive) relation between a part and its distinct whole.
        (http://semanticscience.org/resource/SIO_000093)
        """
        return cls._namespace_SIO('SIO_000093')

    @classmethod
    def is_member_of(cls):
        """is member of is a mereological relation between a item and a collection.
        (cls, http://semanticscience.org/resource/SIO_000095)
        """
        return cls._namespace_SIO('SIO_000095')

    @classmethod
    def is_boundary_of(cls):
        """is boundary of is a mereological relation between a boudnary located at the periphery of a whole.
        (cls, http://semanticscience.org/resource/SIO_000096)
        """
        return cls._namespace_SIO('SIO_000096')

    @classmethod
    def is_contained_in(cls):
        """A is contained in B iff the spatial region occupied by A is part of the spatial region occupied by B and A is not part of B. [T]
        (cls, http://semanticscience.org/resource/SIO_000128)
        """
        return cls._namespace_SIO('SIO_000128')

    @classmethod
    def has_participant(cls):
        """has participant is a relation that describes the participation of the object in the (cls, processual) subject.
        (http://semanticscience.org/resource/SIO_000132)
        """
        return cls._namespace_SIO('SIO_000132')

    @classmethod
    def has_agent(cls):
        """has agent is a relation between a process and an entity, where the entity is present throughout the process and is a causal participant in the process.
        (cls, http://semanticscience.org/resource/SIO_000139)
        """
        return cls._namespace_SIO('SIO_000139')

    @classmethod
    def is_location_of(cls):
        """A is location of B iff the spatial region occupied by A has the spatial region occupied by B as a part. [T][R]
        (cls, http://semanticscience.org/resource/SIO_000145)
        """
        return cls._namespace_SIO('SIO_000145')

    @classmethod
    def contains(cls):
        """A contains B iff the spatial region occupied by A has the spatial region occupied by B as a part, and B is not part of A. [T]
        (cls, http://semanticscience.org/resource/SIO_000202)
        """
        return cls._namespace_SIO('SIO_000202')

    @classmethod
    def is_connected_to(cls):
        """A is connected to B iff there exists a fiat, material or temporal path between A and B. [S][T]
        (cls, http://semanticscience.org/resource/SIO_000203)
        """
        return cls._namespace_SIO('SIO_000203')

    @classmethod
    def is_adjacent_to(cls):
        """A is adjacent to B iff there is a small, but non-zero distance between A and B
        (cls, http://semanticscience.org/resource/SIO_000204)
        """
        return cls._namespace_SIO('SIO_000204')

    @classmethod
    def is_represented_by(cls):
        """is represented by: a relation between an entity and some symbol.
        (cls, http://semanticscience.org/resource/SIO_000205)
        """
        return cls._namespace_SIO('SIO_000205')

    @classmethod
    def is_supported_by(cls):
        """is supported by is a relation between a proposition and something that supports the truth of the assertion.
        (cls, http://semanticscience.org/resource/SIO_000206)
        """
        return cls._namespace_SIO('SIO_000206')

    @classmethod
    def is_disputed_by(cls):
        """has disputing evidence is a relation between a proposition and something that disputes (cls, does not directly support) the truth of the assertion.
        (http://semanticscience.org/resource/SIO_000207)
        """
        return cls._namespace_SIO('SIO_000207')

    @classmethod
    def is_supporting_evidence_for(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000208)
        """
        return cls._namespace_SIO('SIO_000208')

    @classmethod
    def is_disputing_evidence_for(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000209)
        """
        return cls._namespace_SIO('SIO_000209')

    @classmethod
    def represents(cls):
        """a represents b when a serves as a sign, symbol or model of b.
        (cls, http://semanticscience.org/resource/SIO_000210)
        """
        return cls._namespace_SIO('SIO_000210')

    @classmethod
    def is_positionally_after(cls):
        """is positionally after is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically greater than the projection of the position of the second entity.
        (cls, http://semanticscience.org/resource/SIO_000211)
        """
        return cls._namespace_SIO('SIO_000211')

    @classmethod
    def is_referred_to_by(cls):
        """A is referred to by B iff B is an informational entity that makes reference to A.
        (cls, http://semanticscience.org/resource/SIO_000212)
        """
        return cls._namespace_SIO('SIO_000212')

    @classmethod
    def has_concretization(cls):
        """A has concretization B iff A is an informational entity and B is the a quality of some material entity.
        (cls, http://semanticscience.org/resource/SIO_000213)
        """
        return cls._namespace_SIO('SIO_000213')

    @classmethod
    def is_concretization_of(cls):
        """A is concretization of B iff A is a quality of a material entity and B is an informational entity.
        (cls, http://semanticscience.org/resource/SIO_000214)
        """
        return cls._namespace_SIO('SIO_000214')

    @classmethod
    def is_measurement_value_of(cls):
        """is measurement value of is a relation between a value and the entity that it is a measurement of.
        (cls, http://semanticscience.org/resource/SIO_000215)
        """
        return cls._namespace_SIO('SIO_000215')

    @classmethod
    def has_measurement_value(cls):
        """has measurement value is a relation between a quality/realizable and a measurement value.
        (cls, http://semanticscience.org/resource/SIO_000216)
        """
        return cls._namespace_SIO('SIO_000216')

    @classmethod
    def has_quality(cls):
        """has quality is a relation between an entity and the quality that it bears.
        (cls, http://semanticscience.org/resource/SIO_000217)
        """
        return cls._namespace_SIO('SIO_000217')

    @classmethod
    def is_quality_of(cls):
        """is quality of is a relation between a quality and the entity that it is a property of.
        (cls, http://semanticscience.org/resource/SIO_000218)
        """
        return cls._namespace_SIO('SIO_000218')

    @classmethod
    def is_source_of(cls):
        """is source of is a relation between a source of information about some entity.
        (cls, http://semanticscience.org/resource/SIO_000219)
        """
        return cls._namespace_SIO('SIO_000219')

    @classmethod
    def has_unit(cls):
        """has unit is a relation between a quantity and the unit it is a multiple of.
        (cls, http://semanticscience.org/resource/SIO_000221)
        """
        return cls._namespace_SIO('SIO_000221')

    @classmethod
    def is_unit_of(cls):
        """is unit of is a relation between a unit and a quantity that it is a multiple of.
        (cls, http://semanticscience.org/resource/SIO_000222)
        """
        return cls._namespace_SIO('SIO_000222')

    @classmethod
    def has_property(cls):
        """has property is a relation between an entity and the quality, capability or role that it and it alone bears.
        (cls, http://semanticscience.org/resource/SIO_000223)
        """
        return cls._namespace_SIO('SIO_000223')

    @classmethod
    def is_property_of(cls):
        """is property of is a relation betweena  quality, capability or role and the entity that it and it alone bears.
        (cls, http://semanticscience.org/resource/SIO_000224)
        """
        return cls._namespace_SIO('SIO_000224')

    @classmethod
    def has_function(cls):
        """has function is the relation between an entity and a function that is ascribed to it.
        (cls, http://semanticscience.org/resource/SIO_000225)
        """
        return cls._namespace_SIO('SIO_000225')

    @classmethod
    def is_function_of(cls):
        """is function of is a relation between a function and an entity that it is a property of.
        (cls, http://semanticscience.org/resource/SIO_000226)
        """
        return cls._namespace_SIO('SIO_000226')

    @classmethod
    def is_role_of(cls):
        """is role of is a relation between a role and the entity that it is a property of.
        (cls, http://semanticscience.org/resource/SIO_000227)
        """
        return cls._namespace_SIO('SIO_000227')

    @classmethod
    def has_role(cls):
        """has role is a relation between an entity and a role that it bears.
        (cls, http://semanticscience.org/resource/SIO_000228)
        """
        return cls._namespace_SIO('SIO_000228')

    @classmethod
    def has_output(cls):
        """has output is a relation between an process and an entity, where the entity is present at the end of the process.
        (cls, http://semanticscience.org/resource/SIO_000229)
        """
        return cls._namespace_SIO('SIO_000229')

    @classmethod
    def has_input(cls):
        """has input is a relation between a process and an entity, where the entity is present at the beginning of the process.
        (cls, http://semanticscience.org/resource/SIO_000230)
        """
        return cls._namespace_SIO('SIO_000230')

    @classmethod
    def is_input_in(cls):
        """is input in is a relation between an entity and a process, where the entity is present at the beginning of the process.
        (cls, http://semanticscience.org/resource/SIO_000231)
        """
        return cls._namespace_SIO('SIO_000231')

    @classmethod
    def is_output_of(cls):
        """is output of is a relation between an entity and a process, where the entity is present at the end of the process.
        (cls, http://semanticscience.org/resource/SIO_000232)
        """
        return cls._namespace_SIO('SIO_000232')

    @classmethod
    def is_implementation_of(cls):
        """is implementation of is a relation between an information entity and a specification that it conforms to.
        (cls, http://semanticscience.org/resource/SIO_000233)
        """
        return cls._namespace_SIO('SIO_000233')

    @classmethod
    def has_implementation(cls):
        """has implementation is a relation between a specification and an implementation that conforms to it.
        (cls, http://semanticscience.org/resource/SIO_000234)
        """
        return cls._namespace_SIO('SIO_000234')

    @classmethod
    def has_disposition(cls):
        """has disposition is the relation between an entity and a disposition that it bears.
        (cls, http://semanticscience.org/resource/SIO_000235)
        """
        return cls._namespace_SIO('SIO_000235')

    @classmethod
    def is_disposition_of(cls):
        """is disposition of is a relation between a disposition and the entity that it is a property of.
        (cls, http://semanticscience.org/resource/SIO_000236)
        """
        return cls._namespace_SIO('SIO_000236')

    @classmethod
    def is_positionally_before(cls):
        """is positionally before is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically less than the projection of the position of the second entity.
        (cls, http://semanticscience.org/resource/SIO_000240)
        """
        return cls._namespace_SIO('SIO_000240')

    @classmethod
    def is_directly_after(cls):
        """is directly after is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically greater than the projection of the position of the second entity, and the entities are adjacent to one another.
        (cls, http://semanticscience.org/resource/SIO_000241)
        """
        return cls._namespace_SIO('SIO_000241')

    @classmethod
    def is_directly_before(cls):
        """is directly before is a relation between entities placed on a dimensional axis in which the projection of the position of the first entity is numerically less than the projection of the position of the second entity, and the entities are adjacent to one another.
        (cls, http://semanticscience.org/resource/SIO_000242)
        """
        return cls._namespace_SIO('SIO_000242')

    @classmethod
    def is_causally_related_with(cls):
        """A transitive, symmetric, temporal relation in which one entity is causally related with another non-identical entity.
        (cls, http://semanticscience.org/resource/SIO_000243)
        """
        return cls._namespace_SIO('SIO_000243')

    @classmethod
    def derives_from(cls):
        """A transitive temporal relation in which one entity derives from another non-identical entity.
        (cls, http://semanticscience.org/resource/SIO_000244)
        """
        return cls._namespace_SIO('SIO_000244')

    @classmethod
    def derives_into(cls):
        """A transitive temporal relation in which one entity derives into another non-identical entity.
        (cls, http://semanticscience.org/resource/SIO_000245)
        """
        return cls._namespace_SIO('SIO_000245')

    @classmethod
    def immediately_derives_into(cls):
        """A non-transitive temporal relation in which one entity immediately derives into a non-identical entity such that there are no intermediate entities between them.
        (cls, http://semanticscience.org/resource/SIO_000246)
        """
        return cls._namespace_SIO('SIO_000246')

    @classmethod
    def immediately_derives_from(cls):
        """A non-transitive temporal relation in which one entity immediately derives from a non-identical entity such that there are no intermediate entities between them.
        (cls, http://semanticscience.org/resource/SIO_000247)
        """
        return cls._namespace_SIO('SIO_000247')

    @classmethod
    def precedes(cls):
        """A transitive, temporal relation in which one process precedes (cls, has occured earlier than) another process.
        (http://semanticscience.org/resource/SIO_000248)
        """
        return cls._namespace_SIO('SIO_000248')

    @classmethod
    def is_preceded_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000249)
        """
        return cls._namespace_SIO('SIO_000249')

    @classmethod
    def immediately_precedes(cls):
        """A non-transitive temporal relation in which one process immediately precedes another process, such that there is no interval of time between the two processes.
        (cls, http://semanticscience.org/resource/SIO_000250)
        """
        return cls._namespace_SIO('SIO_000250')

    @classmethod
    def is_immediately_preceded_by(cls):
        """A non-transitive temporal relation in which one process is immediately preceded by another process, such that there is no interval of time between the two processes.
        (cls, http://semanticscience.org/resource/SIO_000251)
        """
        return cls._namespace_SIO('SIO_000251')

    @classmethod
    def is_referenced_by(cls):
        """is reference for is a relation between a document that provides information about an entity.
        (cls, http://semanticscience.org/resource/SIO_000252)
        """
        return cls._namespace_SIO('SIO_000252')

    @classmethod
    def has_source(cls):
        """has source is a relation between an entity and some source of information.
        (cls, http://semanticscience.org/resource/SIO_000253)
        """
        return cls._namespace_SIO('SIO_000253')

    @classmethod
    def is_annotation_of(cls):
        """is annotation of is a relation between some textual entity and the entity that it annotates.
        (cls, http://semanticscience.org/resource/SIO_000254)
        """
        return cls._namespace_SIO('SIO_000254')

    @classmethod
    def has_annotation(cls):
        """has annotation is a relation between an entity and some textual anntotation.
        (cls, http://semanticscience.org/resource/SIO_000255)
        """
        return cls._namespace_SIO('SIO_000255')

    @classmethod
    def was_annotated_with(cls):
        """has annotation is a relation between an entity and some textual anntotation.
        (cls, http://semanticscience.org/resource/SIO_000255)
        """
        return cls._namespace_SIO('SIO_000255')

    @classmethod
    def is_variant_of(cls):
        """is variant of: a relationship indicating that two entities are different (cls, by some measure), but either achieve the same objectives in different ways or are permutations of one another (temporal, logical or otherwise)
        (http://semanticscience.org/resource/SIO_000272)
        """
        return cls._namespace_SIO('SIO_000272')

    @classmethod
    def has_direct_part(cls):
        """has direct part is a relation to specify a part at a particular level of granularity
        (cls, http://semanticscience.org/resource/SIO_000273)
        """
        return cls._namespace_SIO('SIO_000273')

    @classmethod
    def is_prior_version_of(cls):
        """A is prior version of B iff A is a variant of B and B derives from A.
        (cls, http://semanticscience.org/resource/SIO_000274)
        """
        return cls._namespace_SIO('SIO_000274')

    @classmethod
    def cites(cls):
        """cites is a relation to refer to by way of example, authority or proof.
        (cls, http://semanticscience.org/resource/SIO_000277)
        """
        return cls._namespace_SIO('SIO_000277')

    @classmethod
    def is_cited_by(cls):
        """is cited by is a relation from an object that is referred to by way of example, authority or proof.
        (cls, http://semanticscience.org/resource/SIO_000278)
        """
        return cls._namespace_SIO('SIO_000278')

    @classmethod
    def is_similar_to(cls):
        """is similar to is a relation between two entities that share one or more features.
        (cls, http://semanticscience.org/resource/SIO_000283)
        """
        return cls._namespace_SIO('SIO_000283')

    @classmethod
    def is_subsequent_version_of(cls):
        """A is subsequent version of B iff A is a variant of B and A derives from B.
        (cls, http://semanticscience.org/resource/SIO_000286)
        """
        return cls._namespace_SIO('SIO_000286')

    @classmethod
    def is_covalently_connected_to_transitive(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000288)
        """
        return cls._namespace_SIO('SIO_000288')

    @classmethod
    def has_target(cls):
        """has target is a relation between a process and an entity, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
        (cls, http://semanticscience.org/resource/SIO_000291)
        """
        return cls._namespace_SIO('SIO_000291')

    @classmethod
    def is_target_in(cls):
        """is target in is a relation between an entity and a process, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
        (cls, http://semanticscience.org/resource/SIO_000292)
        """
        return cls._namespace_SIO('SIO_000292')

    @classmethod
    def is_weakly_interacting_with_transitive(cls):
        """is weakly interacting with is a symmetric relation between two molecular entities (cls, or any part thereof) that are interacting through some weak force (van der waals, hydrogen bonds, electrostatic interactions)
        (http://semanticscience.org/resource/SIO_000293)
        """
        return cls._namespace_SIO('SIO_000293')

    @classmethod
    def is_causally_related_to(cls):
        """a is causally related to b iff there is a causal chain of events from a to b
        (cls, http://semanticscience.org/resource/SIO_000294)
        """
        return cls._namespace_SIO('SIO_000294')

    @classmethod
    def is_direct_part_of(cls):
        """is direct part of is a relation between a specific part (cls, at some level of granularity) and its whole.
        (http://semanticscience.org/resource/SIO_000310)
        """
        return cls._namespace_SIO('SIO_000310')

    @classmethod
    def is_product_of(cls):
        """is product of is a relation between an entity and a process, where the entity is present at the end  of the process as a result of a transformation in the process target.
        (cls, http://semanticscience.org/resource/SIO_000311)
        """
        return cls._namespace_SIO('SIO_000311')

    @classmethod
    def has_product(cls):
        """has product is a relation between an process and an entity, where a new entity exists at the end of the process.
        (cls, http://semanticscience.org/resource/SIO_000312)
        """
        return cls._namespace_SIO('SIO_000312')

    @classmethod
    def is_component_part_of(cls):
        """is component part of is a relation between a component and a whole, where the component is instrinsic to the whole, and loss of the part would change the kind that the whole is.
        (cls, http://semanticscience.org/resource/SIO_000313)
        """
        return cls._namespace_SIO('SIO_000313')

    @classmethod
    def is_spatiotemporally_related_to(cls):
        """A is spatiotemporally related to B iff A is in the spatial or temporal vicinity of B
        (cls, http://semanticscience.org/resource/SIO_000322)
        """
        return cls._namespace_SIO('SIO_000322')

    @classmethod
    def is_surrounded_by(cls):
        """A 'is surrounded by' B iff the A 'is contained by' B and A 'is adjacent to' B or A 'is directly connected to' B.
        (cls, http://semanticscience.org/resource/SIO_000323)
        """
        return cls._namespace_SIO('SIO_000323')

    @classmethod
    def surrounds(cls):
        """A 'surrounds' B iff the A 'contains' B and A 'is adjacent to' B or A 'is directly connected to' B.
        (cls, http://semanticscience.org/resource/SIO_000324)
        """
        return cls._namespace_SIO('SIO_000324')

    @classmethod
    def overlaps_with(cls):
        """A overlaps with B iff there is some C that is part of both A and B. [S][R]
        (cls, http://semanticscience.org/resource/SIO_000325)
        """
        return cls._namespace_SIO('SIO_000325')

    @classmethod
    def is_about(cls):
        """is about is a relation between an information content entity and the entity that its primary subject.
        (cls, http://semanticscience.org/resource/SIO_000332)
        """
        return cls._namespace_SIO('SIO_000332')

    @classmethod
    def is_covalently_connected_to(cls):
        """is covalently connected to is a relation between an atom and another atom.
        (cls, http://semanticscience.org/resource/SIO_000334)
        """
        return cls._namespace_SIO('SIO_000334')

    @classmethod
    def is_weakly_interacting_with(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000335)
        """
        return cls._namespace_SIO('SIO_000335')

    @classmethod
    def specifies(cls):
        """A relation between an information content entity and a product that it (cls, directly/indirectly) specifies
        (http://semanticscience.org/resource/SIO_000338)
        """
        return cls._namespace_SIO('SIO_000338')

    @classmethod
    def is_specified_by(cls):
        """a relation between a product and the information content entity that specifies it.
        (cls, http://semanticscience.org/resource/SIO_000339)
        """
        return cls._namespace_SIO('SIO_000339')

    @classmethod
    def is_manifested_as(cls):
        """is manifested as is a relation between an expression and its manifestations.
        (cls, http://semanticscience.org/resource/SIO_000341)
        """
        return cls._namespace_SIO('SIO_000341')

    @classmethod
    def is_causally_related_from(cls):
        """a is causally related from b iff there is a causal chain of events from b to a
        (cls, http://semanticscience.org/resource/SIO_000352)
        """
        return cls._namespace_SIO('SIO_000352')

    @classmethod
    def realizes(cls):
        """realizes is a relation between a process and a realizable entity (cls, role, function, disposition).
        (http://semanticscience.org/resource/SIO_000355)
        """
        return cls._namespace_SIO('SIO_000355')

    @classmethod
    def is_realized_in(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000356)
        """
        return cls._namespace_SIO('SIO_000356')

    @classmethod
    def satisfies(cls):
        """satisfies is a relation between an entity and the specification or objective that it conforms to.
        (cls, http://semanticscience.org/resource/SIO_000362)
        """
        return cls._namespace_SIO('SIO_000362')

    @classmethod
    def is_satisfied_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000363)
        """
        return cls._namespace_SIO('SIO_000363')

    @classmethod
    def has_creator(cls):
        """has creator is a relation between an entity and that which created it.
        (cls, http://semanticscience.org/resource/SIO_000364)
        """
        return cls._namespace_SIO('SIO_000364')

    @classmethod
    def was_created_by(cls):
        """has creator is a relation between an entity and that which created it.
        (cls, http://semanticscience.org/resource/SIO_000364)
        """
        return cls._namespace_SIO('SIO_000364')

    @classmethod
    def is_created_by(cls):
        """is created by is a relation between an entity and its creator.
        (cls, http://semanticscience.org/resource/SIO_000365)
        """
        return cls._namespace_SIO('SIO_000365')

    @classmethod
    def has_component_part(cls):
        """has component part is a relation between a whole and a component part where the component is instrinsic to the whole, and loss of the part would change the kind that it is.
        (cls, http://semanticscience.org/resource/SIO_000369)
        """
        return cls._namespace_SIO('SIO_000369')

    @classmethod
    def has_expression(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000420)
        """
        return cls._namespace_SIO('SIO_000420')

    @classmethod
    def is_expression_of(cls):
        """is expression of is a relation between more concrete expression of some conceptualization.
        (cls, http://semanticscience.org/resource/SIO_000421)
        """
        return cls._namespace_SIO('SIO_000421')

    @classmethod
    def is_broader_than_t(cls):
        """A is broader than B (cls, t) iff for A is broader than B.
        (http://semanticscience.org/resource/SIO_000422)
        """
        return cls._namespace_SIO('SIO_000422')

    @classmethod
    def is_narrower_than_t(cls):
        """A is narrower than B (cls, t) iff for A is narrower than B.
        (http://semanticscience.org/resource/SIO_000424)
        """
        return cls._namespace_SIO('SIO_000424')

    @classmethod
    def is_generically_related_with(cls):
        """A is generically related with B iff A is an abstract entity or an information content entity and B is a information content entity or a physical entity, respectively.
        (cls, http://semanticscience.org/resource/SIO_000425)
        """
        return cls._namespace_SIO('SIO_000425')

    @classmethod
    def is_manifestation_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000426)
        """
        return cls._namespace_SIO('SIO_000426')

    @classmethod
    def is_narrower_than(cls):
        """A is narrower than B iff the meaning of term A is narrower in scope than the meaning of term B
        (cls, http://semanticscience.org/resource/SIO_000427)
        """
        return cls._namespace_SIO('SIO_000427')

    @classmethod
    def is_broader_than(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000477)
        """
        return cls._namespace_SIO('SIO_000477')

    @classmethod
    def is_match_to(cls):
        """A is match to B iff A and B are terms with similar (cls, related, broad, close, exact) meanings
        (http://semanticscience.org/resource/SIO_000482)
        """
        return cls._namespace_SIO('SIO_000482')

    @classmethod
    def is_exact_match_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000484)
        """
        return cls._namespace_SIO('SIO_000484')

    @classmethod
    def is_close_match_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000490)
        """
        return cls._namespace_SIO('SIO_000490')

    @classmethod
    def is_broad_match_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000491)
        """
        return cls._namespace_SIO('SIO_000491')

    @classmethod
    def is_dissimilar_to(cls):
        """is dissimilar to is a relation between two entities in which one is considered dissimilar to the other based on some criteria.
        (cls, http://semanticscience.org/resource/SIO_000495)
        """
        return cls._namespace_SIO('SIO_000495')

    @classmethod
    def is_opposite_to(cls):
        """is opposite to is a relation between two entities in which one is diametrically opposed to the other.
        (cls, http://semanticscience.org/resource/SIO_000496)
        """
        return cls._namespace_SIO('SIO_000496')

    @classmethod
    def is_version_of(cls):
        """is version of is a relation that holds between any two versions in which one is a subsequent or alternate version of (cls, through a branch).
        (http://semanticscience.org/resource/SIO_000497)
        """
        return cls._namespace_SIO('SIO_000497')

    @classmethod
    def has_parameter(cls):
        """has parameter is a relation between a process and an information content entity which modulates the behaviour of some participant.
        (cls, http://semanticscience.org/resource/SIO_000552)
        """
        return cls._namespace_SIO('SIO_000552')

    @classmethod
    def is_parameter_in(cls):
        """is parameter in is a relation between a data item and some data transformation process.
        (cls, http://semanticscience.org/resource/SIO_000553)
        """
        return cls._namespace_SIO('SIO_000553')

    @classmethod
    def is_described_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000557)
        """
        return cls._namespace_SIO('SIO_000557')

    @classmethod
    def is_orthologous_to(cls):
        """is orthologous to is a relation between two biological entities that share a common ancestor and occur in different species.
        (cls, http://semanticscience.org/resource/SIO_000558)
        """
        return cls._namespace_SIO('SIO_000558')

    @classmethod
    def describes(cls):
        """describes is a relation between one entity and another entity that it provides a description (cls, detailed account of).
        (http://semanticscience.org/resource/SIO_000563)
        """
        return cls._namespace_SIO('SIO_000563')

    @classmethod
    def has_capability(cls):
        """has capability is a relation between an entity and the capability that it bears.
        (cls, http://semanticscience.org/resource/SIO_000586)
        """
        return cls._namespace_SIO('SIO_000586')

    @classmethod
    def refers_to(cls):
        """refers to is a relation between one entity and the entity that it makes reference to.
        (cls, http://semanticscience.org/resource/SIO_000628)
        """
        return cls._namespace_SIO('SIO_000628')

    @classmethod
    def is_subject_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000629)
        """
        return cls._namespace_SIO('SIO_000629')

    @classmethod
    def is_paralogous_to(cls):
        """is paralogous to is a relation between two entities which indicates their common ancestry as a result of a gene duplication.
        (cls, http://semanticscience.org/resource/SIO_000630)
        """
        return cls._namespace_SIO('SIO_000630')

    @classmethod
    def references(cls):
        """references is a relation between one entity and the entity that it makes reference to by name, but is not described by it.
        (cls, http://semanticscience.org/resource/SIO_000631)
        """
        return cls._namespace_SIO('SIO_000631')

    @classmethod
    def mentions(cls):
        """references is a relation between one entity and the entity that it makes reference to by name, but is not described by it.
        (cls, http://semanticscience.org/resource/SIO_000631)
        """
        return cls._namespace_SIO('SIO_000631')

    @classmethod
    def is_model_of(cls):
        """is model of is a relation between a model (cls, an artifact) and the entity it purports to represent.
        (http://semanticscience.org/resource/SIO_000632)
        """
        return cls._namespace_SIO('SIO_000632')

    @classmethod
    def is_modelled_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000633)
        """
        return cls._namespace_SIO('SIO_000633')

    @classmethod
    def is_xenologous_to(cls):
        """a relation between two entities which indicates their common ancestry but due to horizontal gene transfer.
        (cls, http://semanticscience.org/resource/SIO_000634)
        """
        return cls._namespace_SIO('SIO_000634')

    @classmethod
    def has_trigger(cls):
        """has trigger is a relation between a realizable and the factor that causes it to be realized.
        (cls, http://semanticscience.org/resource/SIO_000635)
        """
        return cls._namespace_SIO('SIO_000635')

    @classmethod
    def is_trigger_for(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000636)
        """
        return cls._namespace_SIO('SIO_000636')

    @classmethod
    def has_basis(cls):
        """has basis is a relation between a realizable entity and the quality that forms the basis for it.
        (cls, http://semanticscience.org/resource/SIO_000641)
        """
        return cls._namespace_SIO('SIO_000641')

    @classmethod
    def is_base_for(cls):
        """is base for is a relation between a quality and the realizable entity that it is the basis for.
        (cls, http://semanticscience.org/resource/SIO_000642)
        """
        return cls._namespace_SIO('SIO_000642')

    @classmethod
    def is_realizable_property_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000643)
        """
        return cls._namespace_SIO('SIO_000643')

    @classmethod
    def has_realizable_property(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000644)
        """
        return cls._namespace_SIO('SIO_000644')

    @classmethod
    def is_capability_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000646)
        """
        return cls._namespace_SIO('SIO_000646')

    @classmethod
    def is_directly_connected_to(cls):
        """A is directly connected to B iff there exists a path direclty between A and B.
        (cls, http://semanticscience.org/resource/SIO_000652)
        """
        return cls._namespace_SIO('SIO_000652')

    @classmethod
    def transforms_into(cls):
        """A transitive temporal relation in which an entity mainstains identity from one state to another.
        (cls, http://semanticscience.org/resource/SIO_000655)
        """
        return cls._namespace_SIO('SIO_000655')

    @classmethod
    def immediately_transforms_into(cls):
        """A  temporal relation in which an entity mainstains identity from one state to another.
        (cls, http://semanticscience.org/resource/SIO_000656)
        """
        return cls._namespace_SIO('SIO_000656')

    @classmethod
    def transforms_from(cls):
        """A transitive temporal relation in which an entity mainstains identity from one state to another.
        (cls, http://semanticscience.org/resource/SIO_000657)
        """
        return cls._namespace_SIO('SIO_000657')

    @classmethod
    def immediately_transforms_from(cls):
        """A  temporal relation in which an entity mainstains identity from one state to another.
        (cls, http://semanticscience.org/resource/SIO_000658)
        """
        return cls._namespace_SIO('SIO_000658')

    @classmethod
    def in_relation_to(cls):
        """in relation to is a comparative relation to indicate that the instance of the class holding the relation exists in relation to another entity.
        (cls, http://semanticscience.org/resource/SIO_000668)
        """
        return cls._namespace_SIO('SIO_000668')

    @classmethod
    def has_identifier(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000671)
        """
        return cls._namespace_SIO('SIO_000671')

    @classmethod
    def is_identifier_for(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000672)
        """
        return cls._namespace_SIO('SIO_000672')

    @classmethod
    def has_unique_identifier(cls):
        """has unique identifier is an inverse functional relation between an entity and an identifier that uniquely identifies it.
        (cls, http://semanticscience.org/resource/SIO_000673)
        """
        return cls._namespace_SIO('SIO_000673')

    @classmethod
    def is_unique_identifier_for(cls):
        """is unique identifier for is a relation between an identifier and an entity that it uniquely identifies
        (cls, http://semanticscience.org/resource/SIO_000674)
        """
        return cls._namespace_SIO('SIO_000674')

    @classmethod
    def has_time_boundary(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000679)
        """
        return cls._namespace_SIO('SIO_000679')

    @classmethod
    def has_start_time(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000680)
        """
        return cls._namespace_SIO('SIO_000680')

    @classmethod
    def has_end_time(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000681)
        """
        return cls._namespace_SIO('SIO_000681')

    @classmethod
    def is_start_time_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000682)
        """
        return cls._namespace_SIO('SIO_000682')

    @classmethod
    def is_end_time_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000684)
        """
        return cls._namespace_SIO('SIO_000684')

    @classmethod
    def exists_at(cls):
        """exists at is a relation between an entity and a time measurement.
        (cls, http://semanticscience.org/resource/SIO_000687)
        """
        return cls._namespace_SIO('SIO_000687')

    @classmethod
    def is_mutual_disposition_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000697)
        """
        return cls._namespace_SIO('SIO_000697')

    @classmethod
    def is_greater_than_or_equal_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000699)
        """
        return cls._namespace_SIO('SIO_000699')

    @classmethod
    def is_mutually_related_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000709)
        """
        return cls._namespace_SIO('SIO_000709')

    @classmethod
    def is_mutual_role_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000710)
        """
        return cls._namespace_SIO('SIO_000710')

    @classmethod
    def is_lesser_than_or_equal_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000733)
        """
        return cls._namespace_SIO('SIO_000733')

    @classmethod
    def is_greater_than(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000734)
        """
        return cls._namespace_SIO('SIO_000734')

    @classmethod
    def is_lesser_than(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000735)
        """
        return cls._namespace_SIO('SIO_000735')

    @classmethod
    def is_comparable_to(cls):
        """is comparable to is a relation between two entities that share at least one feature whose value can be compared.
        (cls, http://semanticscience.org/resource/SIO_000736)
        """
        return cls._namespace_SIO('SIO_000736')

    @classmethod
    def is_numerically_comparable_to(cls):
        """is numerically comparable to is a comparison relation between two quantities whose datatype value can be compared.
        (cls, http://semanticscience.org/resource/SIO_000737)
        """
        return cls._namespace_SIO('SIO_000737')

    @classmethod
    def is_equal_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000738)
        """
        return cls._namespace_SIO('SIO_000738')

    @classmethod
    def is_inequal_to(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000749)
        """
        return cls._namespace_SIO('SIO_000749')

    @classmethod
    def has_evidence(cls):
        """has evidence is a relation between a proposition and something that demonstrates the truth of the assertion.
        (cls, http://semanticscience.org/resource/SIO_000772)
        """
        return cls._namespace_SIO('SIO_000772')

    @classmethod
    def is_evidence_for(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000773)
        """
        return cls._namespace_SIO('SIO_000773')

    @classmethod
    def is_refuted_by(cls):
        """has evidence is a relation between a proposition and something that refutes (cls, is incompatible with) the truth of the assertion.
        (http://semanticscience.org/resource/SIO_000774)
        """
        return cls._namespace_SIO('SIO_000774')

    @classmethod
    def is_refuting_evidence_for(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000775)
        """
        return cls._namespace_SIO('SIO_000775')

    @classmethod
    def measured_at(cls):
        """measured at is a relation between a measurement value and the time measurement.
        (cls, http://semanticscience.org/resource/SIO_000793)
        """
        return cls._namespace_SIO('SIO_000793')

    @classmethod
    def in_relation_from(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000892)
        """
        return cls._namespace_SIO('SIO_000892')

    @classmethod
    def has_frequency(cls):
        """has frequency is a relation that specifies the occurence of an object or event
        (cls, http://semanticscience.org/resource/SIO_000900)
        """
        return cls._namespace_SIO('SIO_000900')

    @classmethod
    def is_frequency_of(cls):
        """is frequency of is a relation between a temporal unit and an object or event
        (cls, http://semanticscience.org/resource/SIO_000901)
        """
        return cls._namespace_SIO('SIO_000901')

    @classmethod
    def has_substrate(cls):
        """has substrate is a relation between a process and an object where the object is destroyed by its participation in the process.
        (cls, http://semanticscience.org/resource/SIO_000905)
        """
        return cls._namespace_SIO('SIO_000905')

    @classmethod
    def is_first_part_of(cls):
        """is first part of is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000970)
        """
        return cls._namespace_SIO('SIO_000970')

    @classmethod
    def has_first_part(cls):
        """has first part is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000971)
        """
        return cls._namespace_SIO('SIO_000971')

    @classmethod
    def has_last_part(cls):
        """has last part is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000972)
        """
        return cls._namespace_SIO('SIO_000972')

    @classmethod
    def is_last_part_of(cls):
        """is last part of is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000973)
        """
        return cls._namespace_SIO('SIO_000973')

    @classmethod
    def has_ordered_part(cls):
        """has ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000974)
        """
        return cls._namespace_SIO('SIO_000974')

    @classmethod
    def is_ordered_part_of(cls):
        """is ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000975)
        """
        return cls._namespace_SIO('SIO_000975')

    @classmethod
    def is_specialization_of(cls):
        """is specialization of is a relation between a more specific instance (cls, in terms of spatial/temporal localization & other attributres) than the other.
        (http://semanticscience.org/resource/SIO_001096)
        """
        return cls._namespace_SIO('SIO_001096')

    @classmethod
    def is_generalization_of(cls):
        """is generalization of is a relation between a more general instance (cls, in terms of spatial/temporal localization & other attributres) than the other.
        (http://semanticscience.org/resource/SIO_001097)
        """
        return cls._namespace_SIO('SIO_001097')

    @classmethod
    def is_alternate_of(cls):
        """is alternate of relates two specialized instances.
        (cls, http://semanticscience.org/resource/SIO_001098)
        """
        return cls._namespace_SIO('SIO_001098')

    @classmethod
    def is_mutual_capability_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001101)
        """
        return cls._namespace_SIO('SIO_001101')

    @classmethod
    def regulates(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001154)
        """
        return cls._namespace_SIO('SIO_001154')

    @classmethod
    def is_regulated_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001155)
        """
        return cls._namespace_SIO('SIO_001155')

    @classmethod
    def results_in(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001156)
        """
        return cls._namespace_SIO('SIO_001156')

    @classmethod
    def is_result_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001157)
        """
        return cls._namespace_SIO('SIO_001157')

    @classmethod
    def affects(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001158)
        """
        return cls._namespace_SIO('SIO_001158')

    @classmethod
    def is_affected_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001159)
        """
        return cls._namespace_SIO('SIO_001159')

    @classmethod
    def encodes(cls):
        """A relation between an biological information content entity and a product that it (cls, directly/indirectly) encodes.
        (http://semanticscience.org/resource/SIO_010078)
        """
        return cls._namespace_SIO('SIO_010078')

    @classmethod
    def is_encoded_by(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010079)
        """
        return cls._namespace_SIO('SIO_010079')

    @classmethod
    def is_transcribed_into(cls):
        """a relation between two information content entities in which one is transcribed into (cls, an exact or similar kind) another through some process.
        (http://semanticscience.org/resource/SIO_010080)
        """
        return cls._namespace_SIO('SIO_010080')

    @classmethod
    def is_transcribed_from(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010081)
        """
        return cls._namespace_SIO('SIO_010081')

    @classmethod
    def is_translated_into(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010082)
        """
        return cls._namespace_SIO('SIO_010082')

    @classmethod
    def is_translated_from(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010083)
        """
        return cls._namespace_SIO('SIO_010083')

    @classmethod
    def is_homologous_to(cls):
        """a relation between two entities which indicates their common ancestry.
        (cls, http://semanticscience.org/resource/SIO_010302)
        """
        return cls._namespace_SIO('SIO_010302')

    @classmethod
    def has_value(cls):
        """A relation between a informational entity and its actual value (cls, numeric, date, text, etc).
        (http://semanticscience.org/resource/SIO_000300)
        """
        return cls._namespace_SIO('SIO_000300')

    @classmethod
    def entity(cls):
        """Everything is an entity.
        (cls, http://semanticscience.org/resource/SIO_000000)
        """
        return cls._namespace_SIO('SIO_000000')

    @classmethod
    def material_entity(cls):
        """A material entity is a physical entity that is spatially extended, exists as a whole at any point in time and has mass.
        (cls, http://semanticscience.org/resource/SIO_000004)
        """
        return cls._namespace_SIO('SIO_000004')

    @classmethod
    def quality(cls):
        """A quality is an attribute that is intrinsically associated with its bearer (cls, or its parts), but whose presence/absence and observed/measured value may vary.
        (http://semanticscience.org/resource/SIO_000005)
        """
        return cls._namespace_SIO('SIO_000005')

    @classmethod
    def process(cls):
        """A process is an entity that is identifiable only through the unfolding of time, has temporal parts, and unless otherwise specified/predicted, cannot be identified from any instant of time in which it exists.
        (cls, http://semanticscience.org/resource/SIO_000006)
        """
        return cls._namespace_SIO('SIO_000006')

    @classmethod
    def social_entity(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000009)
        """
        return cls._namespace_SIO('SIO_000009')

    @classmethod
    def social_structure(cls):
        """A social structure is a social entity which consists of relationships between two or more entities.
        (cls, http://semanticscience.org/resource/SIO_000010)
        """
        return cls._namespace_SIO('SIO_000010')

    @classmethod
    def organization(cls):
        """An organization is a collective with a complex articulation of tasks, roles and responsibilities.
        (cls, http://semanticscience.org/resource/SIO_000012)
        """
        return cls._namespace_SIO('SIO_000012')

    @classmethod
    def geographic_position(cls):
        """a geographic position is the coordinate of an entity against some geographic coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000013)
        """
        return cls._namespace_SIO('SIO_000013')

    @classmethod
    def disposition(cls):
        """A disposition is the tendency of a capability to be exhibited under certain conditions or in response to a certain stimulus (cls, trigger)
        (http://semanticscience.org/resource/SIO_000014)
        """
        return cls._namespace_SIO('SIO_000014')

    @classmethod
    def information_content_entity(cls):
        """information content entity is an object that requires some background knowledge or procedure to correctly interpret.
        (cls, http://semanticscience.org/resource/SIO_000015)
        """
        return cls._namespace_SIO('SIO_000015')

    @classmethod
    def role(cls):
        """A role is a realizable entity that describes behaviours, rights and obligations of an entity in some particular circumstance.
        (cls, http://semanticscience.org/resource/SIO_000016)
        """
        return cls._namespace_SIO('SIO_000016')

    @classmethod
    def function(cls):
        """A function is a capability that satisfies some agentive objective, or (cls, evolutionary) optimization.
        (http://semanticscience.org/resource/SIO_000017)
        """
        return cls._namespace_SIO('SIO_000017')

    @classmethod
    def site(cls):
        """A site is a spatial region bounded (cls, in part or in whole) by material entities and may be occupied by material entities.
        (http://semanticscience.org/resource/SIO_000019)
        """
        return cls._namespace_SIO('SIO_000019')

    @classmethod
    def material_boundary(cls):
        """A material boundary is the boundary of a material entity which exists as a lower dimensional entity at exactly the location where its parts no longer extend into space. Every material entity has a boundary, and a boundary is the boundary of exactly 1 material entity.
        (cls, http://semanticscience.org/resource/SIO_000022)
        """
        return cls._namespace_SIO('SIO_000022')

    @classmethod
    def object_quality(cls):
        """An object quality is quality of an object.
        (cls, http://semanticscience.org/resource/SIO_000026)
        """
        return cls._namespace_SIO('SIO_000026')

    @classmethod
    def process_quality(cls):
        """A process quality is quality that is associated with a process.
        (cls, http://semanticscience.org/resource/SIO_000027)
        """
        return cls._namespace_SIO('SIO_000027')

    @classmethod
    def biopolymer_sequence(cls):
        """A sequence is a primary structure descriptor in which each of the letters in the string represents a monomeric unit (cls, residue) in which adjacent letters represent the connectivity between the monomeric units.
        (http://semanticscience.org/resource/SIO_000030)
        """
        return cls._namespace_SIO('SIO_000030')

    @classmethod
    def start_date(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000031)
        """
        return cls._namespace_SIO('SIO_000031')

    @classmethod
    def end_date(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000032)
        """
        return cls._namespace_SIO('SIO_000032')

    @classmethod
    def process_status(cls):
        """process status is a process quality that describes the state of a process.
        (cls, http://semanticscience.org/resource/SIO_000033)
        """
        return cls._namespace_SIO('SIO_000033')

    @classmethod
    def completed(cls):
        """completed is that status of a process that successfully unfolds.
        (cls, http://semanticscience.org/resource/SIO_000034)
        """
        return cls._namespace_SIO('SIO_000034')

    @classmethod
    def ongoing(cls):
        """ongoing is the status of a process that is not yet complete.
        (cls, http://semanticscience.org/resource/SIO_000035)
        """
        return cls._namespace_SIO('SIO_000035')

    @classmethod
    def predicted(cls):
        """predicted is the quality of an entity that has not been shown to exist but there is a claim of potential existence.
        (cls, http://semanticscience.org/resource/SIO_000036)
        """
        return cls._namespace_SIO('SIO_000036')

    @classmethod
    def spatial_quantity(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000037)
        """
        return cls._namespace_SIO('SIO_000037')

    @classmethod
    def physical_dimensional_quantity(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000037)
        """
        return cls._namespace_SIO('SIO_000037')

    @classmethod
    def a_D_extent_quantity(cls):
        """a quantity that extends in single dimension
        (cls, http://semanticscience.org/resource/SIO_000038)
        """
        return cls._namespace_SIO('SIO_000038')

    @classmethod
    def depth(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000039)
        """
        return cls._namespace_SIO('SIO_000039')

    @classmethod
    def height(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000040)
        """
        return cls._namespace_SIO('SIO_000040')

    @classmethod
    def length(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000041)
        """
        return cls._namespace_SIO('SIO_000041')

    @classmethod
    def width(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000042)
        """
        return cls._namespace_SIO('SIO_000042')

    @classmethod
    def thickness(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000043)
        """
        return cls._namespace_SIO('SIO_000043')

    @classmethod
    def area(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000045)
        """
        return cls._namespace_SIO('SIO_000045')

    @classmethod
    def perimeter(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000046)
        """
        return cls._namespace_SIO('SIO_000046')

    @classmethod
    def circumference(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000047)
        """
        return cls._namespace_SIO('SIO_000047')

    @classmethod
    def volume(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000049)
        """
        return cls._namespace_SIO('SIO_000049')

    @classmethod
    def compositional_quality(cls):
        """composition quality is a quality that describes its composition or anatomy.
        (cls, http://semanticscience.org/resource/SIO_000051)
        """
        return cls._namespace_SIO('SIO_000051')

    @classmethod
    def quantity(cls):
        """A quantity is an informational entity that gives the magnitude of a property.
        (cls, http://semanticscience.org/resource/SIO_000052)
        """
        return cls._namespace_SIO('SIO_000052')

    @classmethod
    def shape(cls):
        """shape is the quality of a bearer that relates to its spatial extent.
        (cls, http://semanticscience.org/resource/SIO_000055)
        """
        return cls._namespace_SIO('SIO_000055')

    @classmethod
    def position(cls):
        """A measurement of a spatial location relative to a frame of reference or other objects.
        (cls, http://semanticscience.org/resource/SIO_000056)
        """
        return cls._namespace_SIO('SIO_000056')

    @classmethod
    def orientation(cls):
        """orientation is an angle between the bearer and an axis, or the angle between the bearer and another object.
        (cls, http://semanticscience.org/resource/SIO_000057)
        """
        return cls._namespace_SIO('SIO_000057')

    @classmethod
    def namespace(cls):
        """A namespace is an informational entity that defines a logical container for a set of symbols or identifiers.
        (cls, http://semanticscience.org/resource/SIO_000067)
        """
        return cls._namespace_SIO('SIO_000067')

    @classmethod
    def data_item(cls):
        """a data item consists of information that has been collected/generated towards some purpose.
        (cls, http://semanticscience.org/resource/SIO_000069)
        """
        return cls._namespace_SIO('SIO_000069')

    @classmethod
    def measurement_value(cls):
        """A measurement value is a quantitative description that reflects the magnitude of some attribute.
        (cls, http://semanticscience.org/resource/SIO_000070)
        """
        return cls._namespace_SIO('SIO_000070')

    @classmethod
    def coordinate(cls):
        """A coordinate is a measurement of position in n-dimensional space.
        (cls, http://semanticscience.org/resource/SIO_000071)
        """
        return cls._namespace_SIO('SIO_000071')

    @classmethod
    def cartesian_coordinate(cls):
        """A Cartesian coordinate is the signed distance of a point to some referent line.
        (cls, http://semanticscience.org/resource/SIO_000072)
        """
        return cls._namespace_SIO('SIO_000072')

    @classmethod
    def polar_coordinate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000073)
        """
        return cls._namespace_SIO('SIO_000073')

    @classmethod
    def unit_of_measurement(cls):
        """A unit of measurement is a definite magnitude of a physical quantity, defined and adopted by convention and/or by law, that is used as a standard for measurement of the same physical quantity.
        (cls, http://semanticscience.org/resource/SIO_000074)
        """
        return cls._namespace_SIO('SIO_000074')

    @classmethod
    def mathematical_entity(cls):
        """a mathematical entity is an information content entity that are components of a mathematical system or can be defined in mathematical terms.
        (cls, http://semanticscience.org/resource/SIO_000075)
        """
        return cls._namespace_SIO('SIO_000075')

    @classmethod
    def plan(cls):
        """a plan is a set of intended actions, through which one expects to achieve a goal.
        (cls, http://semanticscience.org/resource/SIO_000076)
        """
        return cls._namespace_SIO('SIO_000076')

    @classmethod
    def generic_name(cls):
        """A generic name is the preferred name provided by manufacturer
        (cls, http://semanticscience.org/resource/SIO_000077)
        """
        return cls._namespace_SIO('SIO_000077')

    @classmethod
    def language_entity(cls):
        """A language entity implements some language specification for the visual interpretation and is part of some document.
        (cls, http://semanticscience.org/resource/SIO_000078)
        """
        return cls._namespace_SIO('SIO_000078')

    @classmethod
    def visual_language_entity(cls):
        """A visual language entity is a language entity that is expressed through physical expression of manual
        (cls, http://semanticscience.org/resource/SIO_000079)
        """
        return cls._namespace_SIO('SIO_000079')

    @classmethod
    def figure(cls):
        """A figure is a graphical entity which consists of a visual (cls, n-dimentional) arrangement of information entities.
        (http://semanticscience.org/resource/SIO_000080)
        """
        return cls._namespace_SIO('SIO_000080')

    @classmethod
    def diagram(cls):
        """A figure is a graphical entity which consists of a visual (cls, n-dimentional) arrangement of information entities.
        (http://semanticscience.org/resource/SIO_000080)
        """
        return cls._namespace_SIO('SIO_000080')

    @classmethod
    def image(cls):
        """An image is an affine projection of a visual entity to a two dimensional surface.
        (cls, http://semanticscience.org/resource/SIO_000081)
        """
        return cls._namespace_SIO('SIO_000081')

    @classmethod
    def depiction(cls):
        """An image is an affine projection of a visual entity to a two dimensional surface.
        (cls, http://semanticscience.org/resource/SIO_000081)
        """
        return cls._namespace_SIO('SIO_000081')

    @classmethod
    def photograph(cls):
        """A photograph is an image created by light falling on a light-sensitive surface.
        (cls, http://semanticscience.org/resource/SIO_000082)
        """
        return cls._namespace_SIO('SIO_000082')

    @classmethod
    def photo(cls):
        """A photograph is an image created by light falling on a light-sensitive surface.
        (cls, http://semanticscience.org/resource/SIO_000082)
        """
        return cls._namespace_SIO('SIO_000082')

    @classmethod
    def statistical_graph(cls):
        """A statistical graph is a figure that displays the relationship among numeric data and/or mathematical functions.
        (cls, http://semanticscience.org/resource/SIO_000083)
        """
        return cls._namespace_SIO('SIO_000083')

    @classmethod
    def chart(cls):
        """Either:
            A statistical graph is a figure that displays the relationship among numeric data and/or mathematical functions.
            (cls, http://semanticscience.org/resource/SIO_000083)
        Or:
            A chart is a figure that displays the relationship among tabular numeric data, functions or some kinds of qualitative structures.
            (http://semanticscience.org/resource/SIO_000904)
        """
        return [ cls._namespace_SIO('SIO_000083'), cls._namespace_SIO('SIO_000904') ]

    @classmethod
    def question(cls):
        """A question is a linguistic expression used to make a request for information.
        (cls, http://semanticscience.org/resource/SIO_000085)
        """
        return cls._namespace_SIO('SIO_000085')

    @classmethod
    def publication(cls):
        """A publication is a document that has been made available by a publisher.
        (cls, http://semanticscience.org/resource/SIO_000087)
        """
        return cls._namespace_SIO('SIO_000087')

    @classmethod
    def record(cls):
        """A record is a document containing a collection of statements about some entity.
        (cls, http://semanticscience.org/resource/SIO_000088)
        """
        return cls._namespace_SIO('SIO_000088')

    @classmethod
    def data_set(cls):
        """A dataset is a data item that is a collection of data items.
        (cls, http://semanticscience.org/resource/SIO_000089)
        """
        return cls._namespace_SIO('SIO_000089')

    @classmethod
    def specification(cls):
        """A specification is a description of the essential technical attributes/requirements for an object or procedure, and may be used to determine that the object / procedure meets its requirements/attributes.
        (cls, http://semanticscience.org/resource/SIO_000090)
        """
        return cls._namespace_SIO('SIO_000090')

    @classmethod
    def action_specification(cls):
        """An action specification is a specification composed of a sequence of instructions to achieve some objective.
        (cls, http://semanticscience.org/resource/SIO_000091)
        """
        return cls._namespace_SIO('SIO_000091')

    @classmethod
    def effective_specification(cls):
        """An action specification is a specification composed of a sequence of instructions to achieve some objective.
        (cls, http://semanticscience.org/resource/SIO_000091)
        """
        return cls._namespace_SIO('SIO_000091')

    @classmethod
    def biopolymer(cls):
        """A biopolymer is an organic polymer using biological components.
        (cls, http://semanticscience.org/resource/SIO_000092)
        """
        return cls._namespace_SIO('SIO_000092')

    @classmethod
    def algorithm(cls):
        """An algorithm is an effective method expressed as a finite list of well-defined instructions for calculating a function.
        (cls, http://semanticscience.org/resource/SIO_000094)
        """
        return cls._namespace_SIO('SIO_000094')

    @classmethod
    def software_entity(cls):
        """a software entity is a computational entity that can be interpreted by or directly executed by a processing unit.
        (cls, http://semanticscience.org/resource/SIO_000097)
        """
        return cls._namespace_SIO('SIO_000097')

    @classmethod
    def software_method(cls):
        """A software method (cls, also called subroutine, subprogram, procedure, method, function, or routine) is software designed to execute a specific task
        (http://semanticscience.org/resource/SIO_000098)
        """
        return cls._namespace_SIO('SIO_000098')

    @classmethod
    def software_module(cls):
        """A software module is software composed of a collection of software methods.
        (cls, http://semanticscience.org/resource/SIO_000099)
        """
        return cls._namespace_SIO('SIO_000099')

    @classmethod
    def software_library(cls):
        """A software library is software composed of a collection of software modules and/or software methods in a form that can be statically or dynamically linked to some software application.
        (cls, http://semanticscience.org/resource/SIO_000100)
        """
        return cls._namespace_SIO('SIO_000100')

    @classmethod
    def software_application(cls):
        """A software application is software that can be directly executed by some processing unit.
        (cls, http://semanticscience.org/resource/SIO_000101)
        """
        return cls._namespace_SIO('SIO_000101')

    @classmethod
    def software_interpreter(cls):
        """A software interpreter is a software application that executes some specified input software.
        (cls, http://semanticscience.org/resource/SIO_000102)
        """
        return cls._namespace_SIO('SIO_000102')

    @classmethod
    def software_script(cls):
        """A software script is software whose instructions can be executed using a software interpreter.
        (cls, http://semanticscience.org/resource/SIO_000103)
        """
        return cls._namespace_SIO('SIO_000103')

    @classmethod
    def language(cls):
        """Language is a language entity which is the result of encoding and decoding information through systematic creation and usage of systems of symbols, each pairing a specific sign with an intended meaning, established through social conventions
        (cls, http://semanticscience.org/resource/SIO_000104)
        """
        return cls._namespace_SIO('SIO_000104')

    @classmethod
    def symbol(cls):
        """A symbol is a proposition about what an entity represents.
        (cls, http://semanticscience.org/resource/SIO_000105)
        """
        return cls._namespace_SIO('SIO_000105')

    @classmethod
    def book(cls):
        """A book is a publication composed of a large number of entries.
        (cls, http://semanticscience.org/resource/SIO_000106)
        """
        return cls._namespace_SIO('SIO_000106')

    @classmethod
    def chapter(cls):
        """A chapter is a document section of a book or thesis.
        (cls, http://semanticscience.org/resource/SIO_000107)
        """
        return cls._namespace_SIO('SIO_000107')

    @classmethod
    def character(cls):
        """A character is a language symbol used to construct words.
        (cls, http://semanticscience.org/resource/SIO_000108)
        """
        return cls._namespace_SIO('SIO_000108')

    @classmethod
    def novel(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000109)
        """
        return cls._namespace_SIO('SIO_000109')

    @classmethod
    def paragraph(cls):
        """A paragraph is a self-contained unit of written discourse consisting of one or more sentences.
        (cls, http://semanticscience.org/resource/SIO_000110)
        """
        return cls._namespace_SIO('SIO_000110')

    @classmethod
    def document_section(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000111)
        """
        return cls._namespace_SIO('SIO_000111')

    @classmethod
    def capability(cls):
        """A capability is a realizable entity whose basis lies in one or more parts or qualities and reflects possility of an entity to act in a specified way under certain conditions or in response to a certain stimulus (cls, trigger).
        (http://semanticscience.org/resource/SIO_000112)
        """
        return cls._namespace_SIO('SIO_000112')

    @classmethod
    def sentence(cls):
        """A sentence is a grammatical unit consisting of one or more words that bear minimal syntactic relation to the words that precede or follow it
        (cls, http://semanticscience.org/resource/SIO_000113)
        """
        return cls._namespace_SIO('SIO_000113')

    @classmethod
    def word(cls):
        """A word is the smallest free form (cls, an item that may be expressed in isolation with semantic or pragmatic content) in a language.
        (http://semanticscience.org/resource/SIO_000114)
        """
        return cls._namespace_SIO('SIO_000114')

    @classmethod
    def identifier(cls):
        """An identifier is a label that specifically refers to (cls, identifies) an entity (instance/type).
        (http://semanticscience.org/resource/SIO_000115)
        """
        return cls._namespace_SIO('SIO_000115')

    @classmethod
    def name(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000116)
        """
        return cls._namespace_SIO('SIO_000116')

    @classmethod
    def preferred_name(cls):
        """a preferred name is the name that is generally used by some organization.
        (cls, http://semanticscience.org/resource/SIO_000117)
        """
        return cls._namespace_SIO('SIO_000117')

    @classmethod
    def common_name(cls):
        """a common name is a name that is commonly used.
        (cls, http://semanticscience.org/resource/SIO_000118)
        """
        return cls._namespace_SIO('SIO_000118')

    @classmethod
    def brand_name(cls):
        """a brand name is a trademarked and marketed name of a product.
        (cls, http://semanticscience.org/resource/SIO_000119)
        """
        return cls._namespace_SIO('SIO_000119')

    @classmethod
    def scientific_name(cls):
        """a scientific name is a name given through scientific nomenclature.
        (cls, http://semanticscience.org/resource/SIO_000120)
        """
        return cls._namespace_SIO('SIO_000120')

    @classmethod
    def magazine(cls):
        """A magazine is a periodical that typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports.
        (cls, http://semanticscience.org/resource/SIO_000121)
        """
        return cls._namespace_SIO('SIO_000121')

    @classmethod
    def synonym(cls):
        """A synonym is a word with the same or very similar meanings.
        (cls, http://semanticscience.org/resource/SIO_000122)
        """
        return cls._namespace_SIO('SIO_000122')

    @classmethod
    def antonym(cls):
        """An antonym is a word with opposite or nearly opposite meaning.
        (cls, http://semanticscience.org/resource/SIO_000123)
        """
        return cls._namespace_SIO('SIO_000123')

    @classmethod
    def hypernym(cls):
        """A hypernym is a term with a broader meaning.
        (cls, http://semanticscience.org/resource/SIO_000124)
        """
        return cls._namespace_SIO('SIO_000124')

    @classmethod
    def hyponym(cls):
        """A hyponym is a term with a narrower meaning.
        (cls, http://semanticscience.org/resource/SIO_000125)
        """
        return cls._namespace_SIO('SIO_000125')

    @classmethod
    def homonym(cls):
        """A homonym is a word that sounds the same but has different meaning.
        (cls, http://semanticscience.org/resource/SIO_000126)
        """
        return cls._namespace_SIO('SIO_000126')

    @classmethod
    def workflow(cls):
        """A workflow is an algorithm that is is a depiction of a sequence of operations to achieve one or more objectives.
        (cls, http://semanticscience.org/resource/SIO_000127)
        """
        return cls._namespace_SIO('SIO_000127')

    @classmethod
    def ontology_document(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000129)
        """
        return cls._namespace_SIO('SIO_000129')

    @classmethod
    def pattern(cls):
        """A pattern is a generalized representation of some repeatable concrete or informational item.
        (cls, http://semanticscience.org/resource/SIO_000130)
        """
        return cls._namespace_SIO('SIO_000130')

    @classmethod
    def motif(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000131)
        """
        return cls._namespace_SIO('SIO_000131')

    @classmethod
    def descriptor(cls):
        """A descriptor (cls, index term, subject term, subject heading) is a term that captures the essence of the topic of a document.
        (http://semanticscience.org/resource/SIO_000133)
        """
        return cls._namespace_SIO('SIO_000133')

    @classmethod
    def definition(cls):
        """A definition is a description that succintly characterizes an entity.
        (cls, http://semanticscience.org/resource/SIO_000135)
        """
        return cls._namespace_SIO('SIO_000135')

    @classmethod
    def description(cls):
        """a description is language entity in which elements of a language (cls, formal or natural) are used to characterize an entity.
        (http://semanticscience.org/resource/SIO_000136)
        """
        return cls._namespace_SIO('SIO_000136')

    @classmethod
    def category(cls):
        """a category is a class of entities having particular shared characteristics.
        (cls, http://semanticscience.org/resource/SIO_000137)
        """
        return cls._namespace_SIO('SIO_000137')

    @classmethod
    def _class_(cls):
        """A class is a collection of sets which can be unambiguously defined by a property that all its members share.
        (cls, http://semanticscience.org/resource/SIO_000138)
        """
        return cls._namespace_SIO('SIO_000138')

    @classmethod
    def web_service(cls):
        """A web service is a software application that can be accessed over a network, such as the Internet, and executed on a remote system hosting the requested services.
        (cls, http://semanticscience.org/resource/SIO_000140)
        """
        return cls._namespace_SIO('SIO_000140')

    @classmethod
    def criterion(cls):
        """A criterion is a specification to describe properties used for evaluation.
        (cls, http://semanticscience.org/resource/SIO_000141)
        """
        return cls._namespace_SIO('SIO_000141')

    @classmethod
    def inclusion_criterion(cls):
        """An inclusion criterion is a criterion that must be present to satisfy some objective.
        (cls, http://semanticscience.org/resource/SIO_000142)
        """
        return cls._namespace_SIO('SIO_000142')

    @classmethod
    def exclusion_criterion(cls):
        """An exclusion criterion is a criterion that must be absent to satistify the objective.
        (cls, http://semanticscience.org/resource/SIO_000143)
        """
        return cls._namespace_SIO('SIO_000143')

    @classmethod
    def parameter(cls):
        """A parameter is variable whose value changes the characteristics of a system or a function.
        (cls, http://semanticscience.org/resource/SIO_000144)
        """
        return cls._namespace_SIO('SIO_000144')

    @classmethod
    def monomer(cls):
        """A monomer is a submolecule that is proper part of some polymer, and is a building block for such polymer.
        (cls, http://semanticscience.org/resource/SIO_000146)
        """
        return cls._namespace_SIO('SIO_000146')

    @classmethod
    def keyword(cls):
        """A keyword is a descriptor in which the association of the word with the entity facilitates information retrieval.
        (cls, http://semanticscience.org/resource/SIO_000147)
        """
        return cls._namespace_SIO('SIO_000147')

    @classmethod
    def document(cls):
        """A document is a bounded physical or digital representation of a body of information designed with the capacity (cls, and usually intent) to communicate.
        (http://semanticscience.org/resource/SIO_000148)
        """
        return cls._namespace_SIO('SIO_000148')

    @classmethod
    def list(cls):
        """a list is any enumeration of a set of items.
        (cls, http://semanticscience.org/resource/SIO_000150)
        """
        return cls._namespace_SIO('SIO_000150')

    @classmethod
    def manuscript(cls):
        """A manuscript is a document prior to publication.
        (cls, http://semanticscience.org/resource/SIO_000151)
        """
        return cls._namespace_SIO('SIO_000151')

    @classmethod
    def note(cls):
        """A note is a brief document.
        (cls, http://semanticscience.org/resource/SIO_000152)
        """
        return cls._namespace_SIO('SIO_000152')

    @classmethod
    def patent(cls):
        """A patent is an information entity granted by a patent issuing authority which confers upon the patenter the sole right to make, use and sell an invention for a set period of time.
        (cls, http://semanticscience.org/resource/SIO_000153)
        """
        return cls._namespace_SIO('SIO_000153')

    @classmethod
    def article(cls):
        """An article is a publication that is stand-alone section of a larger work.
        (cls, http://semanticscience.org/resource/SIO_000154)
        """
        return cls._namespace_SIO('SIO_000154')

    @classmethod
    def blog(cls):
        """A blog is a publication accessible at some website and is typically about various experiences.
        (cls, http://semanticscience.org/resource/SIO_000155)
        """
        return cls._namespace_SIO('SIO_000155')

    @classmethod
    def book_volume(cls):
        """A book volume is a book that is part of a collection.
        (cls, http://semanticscience.org/resource/SIO_000156)
        """
        return cls._namespace_SIO('SIO_000156')

    @classmethod
    def conference_proceedings(cls):
        """A conference proceedings is a book composed of papers presented at a conference.
        (cls, http://semanticscience.org/resource/SIO_000157)
        """
        return cls._namespace_SIO('SIO_000157')

    @classmethod
    def book_series(cls):
        """A book series is a collection of books that have been sequentially published.
        (cls, http://semanticscience.org/resource/SIO_000158)
        """
        return cls._namespace_SIO('SIO_000158')

    @classmethod
    def edited_publication(cls):
        """An edited publication is a publication that has been examined and potentially changed by an editor.
        (cls, http://semanticscience.org/resource/SIO_000159)
        """
        return cls._namespace_SIO('SIO_000159')

    @classmethod
    def journal(cls):
        """A journal is a a peer-reviewed periodical in which scholarship relating to a particular academic discipline is published.
        (cls, http://semanticscience.org/resource/SIO_000160)
        """
        return cls._namespace_SIO('SIO_000160')

    @classmethod
    def manual(cls):
        """A manual is a document that instructs on the usage of a device.
        (cls, http://semanticscience.org/resource/SIO_000161)
        """
        return cls._namespace_SIO('SIO_000161')

    @classmethod
    def periodical(cls):
        """A periodical is a publication that appears on a regular schedule.
        (cls, http://semanticscience.org/resource/SIO_000162)
        """
        return cls._namespace_SIO('SIO_000162')

    @classmethod
    def newspaper(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000163)
        """
        return cls._namespace_SIO('SIO_000163')

    @classmethod
    def technical_report(cls):
        """A technical report is a publication published by a school or other institution, usually numbered within a series.
        (cls, http://semanticscience.org/resource/SIO_000164)
        """
        return cls._namespace_SIO('SIO_000164')

    @classmethod
    def thesis_document(cls):
        """A tehsis document is the written research component of a post-secondary institution  that contains a statement supported by arguments.
        (cls, http://semanticscience.org/resource/SIO_000165)
        """
        return cls._namespace_SIO('SIO_000165')

    @classmethod
    def honor_s_thesis(cls):
        """An honor's thesis is a thesis prepared as a requirement for an honor's undergraduate degree.
        (cls, http://semanticscience.org/resource/SIO_000166)
        """
        return cls._namespace_SIO('SIO_000166')

    @classmethod
    def master_s_thesis(cls):
        """A Master's thesis is a thesis prepared as a requirement for a Master's degree.
        (cls, http://semanticscience.org/resource/SIO_000167)
        """
        return cls._namespace_SIO('SIO_000167')

    @classmethod
    def phd_thesis(cls):
        """A PhD thesis is a thesis prepared as a requirement for a doctoral degree.
        (cls, http://semanticscience.org/resource/SIO_000168)
        """
        return cls._namespace_SIO('SIO_000168')

    @classmethod
    def booklet(cls):
        """A booklet is a document that lacks a named publisher or sponsoring institution.
        (cls, http://semanticscience.org/resource/SIO_000169)
        """
        return cls._namespace_SIO('SIO_000169')

    @classmethod
    def diary(cls):
        """A diary is a document which describes day-to-day experiences.
        (cls, http://semanticscience.org/resource/SIO_000170)
        """
        return cls._namespace_SIO('SIO_000170')

    @classmethod
    def document_component(cls):
        """A bibliographic attribute is an attribute related to publications.
        (cls, http://semanticscience.org/resource/SIO_000171)
        """
        return cls._namespace_SIO('SIO_000171')

    @classmethod
    def address(cls):
        """An address is a position that indicates the physical location of some entity using a social convention.
        (cls, http://semanticscience.org/resource/SIO_000172)
        """
        return cls._namespace_SIO('SIO_000172')

    @classmethod
    def affiliation(cls):
        """An affiliation is a social structure which indicates the partnership between two or more entities.
        (cls, http://semanticscience.org/resource/SIO_000173)
        """
        return cls._namespace_SIO('SIO_000173')

    @classmethod
    def citation(cls):
        """A citation is a textual entity which denotes a source described in the bibliography or reference section of a document.
        (cls, http://semanticscience.org/resource/SIO_000174)
        """
        return cls._namespace_SIO('SIO_000174')

    @classmethod
    def document_title(cls):
        """A document title is a  textual entity that summarizes the topic of the document in one sentence.
        (cls, http://semanticscience.org/resource/SIO_000175)
        """
        return cls._namespace_SIO('SIO_000175')

    @classmethod
    def reference(cls):
        """A reference is a textual entity that describes a single source used in the preparation or development of the work.
        (cls, http://semanticscience.org/resource/SIO_000176)
        """
        return cls._namespace_SIO('SIO_000176')

    @classmethod
    def page_range(cls):
        """A page range denotes the start and end page in some document.
        (cls, http://semanticscience.org/resource/SIO_000177)
        """
        return cls._namespace_SIO('SIO_000177')

    @classmethod
    def page_total(cls):
        """A page total is a textual entity that is about the number of pages in some informational entity.
        (cls, http://semanticscience.org/resource/SIO_000178)
        """
        return cls._namespace_SIO('SIO_000178')

    @classmethod
    def label(cls):
        """a label is a term that is associated with some entity
        (cls, http://semanticscience.org/resource/SIO_000179)
        """
        return cls._namespace_SIO('SIO_000179')

    @classmethod
    def language_label(cls):
        """A language label is a label that denotes the language of a textual entity.
        (cls, http://semanticscience.org/resource/SIO_000180)
        """
        return cls._namespace_SIO('SIO_000180')

    @classmethod
    def first_name(cls):
        """A first name is a name that denotes a specific individual between members of a group of individuals, whose members usually share the same surname.
        (cls, http://semanticscience.org/resource/SIO_000181)
        """
        return cls._namespace_SIO('SIO_000181')

    @classmethod
    def last_name(cls):
        """A last name (cls, surname) is a name added to a given name and is part of a personal name and is often the family name.
        (http://semanticscience.org/resource/SIO_000182)
        """
        return cls._namespace_SIO('SIO_000182')

    @classmethod
    def personal_name(cls):
        """A personal name is a name to identify an individual person and usually comprises of a first name and a last name.
        (cls, http://semanticscience.org/resource/SIO_000183)
        """
        return cls._namespace_SIO('SIO_000183')

    @classmethod
    def legal_name(cls):
        """A legal name is a name given at birth, or which appears on their birth certificate, marriage certificate, or change of name certificate.
        (cls, http://semanticscience.org/resource/SIO_000184)
        """
        return cls._namespace_SIO('SIO_000184')

    @classmethod
    def title(cls):
        """A title is a textual entity that summarily describes some entity.
        (cls, http://semanticscience.org/resource/SIO_000185)
        """
        return cls._namespace_SIO('SIO_000185')

    @classmethod
    def document_version(cls):
        """A document version is a version of a work in some sequence of derivative works.
        (cls, http://semanticscience.org/resource/SIO_000186)
        """
        return cls._namespace_SIO('SIO_000186')

    @classmethod
    def abstract_section(cls):
        """An abstract section is a document section that provides brief summary of a document that explains the main argument(cls, s), topic(s) or findings.
        (http://semanticscience.org/resource/SIO_000188)
        """
        return cls._namespace_SIO('SIO_000188')

    @classmethod
    def acknowledgements_section(cls):
        """An acknowledgements section is a document section that identifies individuals, groups or organizations for their support in the development of the work.
        (cls, http://semanticscience.org/resource/SIO_000189)
        """
        return cls._namespace_SIO('SIO_000189')

    @classmethod
    def author_contribution_section(cls):
        """An author contribution section is a document section that describes the contribution of the authors.
        (cls, http://semanticscience.org/resource/SIO_000190)
        """
        return cls._namespace_SIO('SIO_000190')

    @classmethod
    def author_section(cls):
        """An author section is a document section that lists the contributing authors.
        (cls, http://semanticscience.org/resource/SIO_000191)
        """
        return cls._namespace_SIO('SIO_000191')

    @classmethod
    def bibliography_section(cls):
        """A bibliography section is a document section that is composed of a list of references used in the development of the work.
        (cls, http://semanticscience.org/resource/SIO_000192)
        """
        return cls._namespace_SIO('SIO_000192')

    @classmethod
    def copyright_section(cls):
        """A copyright section is a document section that contains a notice of copyright.
        (cls, http://semanticscience.org/resource/SIO_000193)
        """
        return cls._namespace_SIO('SIO_000193')

    @classmethod
    def correspondence_section(cls):
        """A correspondence section is a document section that contains the details for contacting the corresponding author.
        (cls, http://semanticscience.org/resource/SIO_000194)
        """
        return cls._namespace_SIO('SIO_000194')

    @classmethod
    def discussion_section(cls):
        """The discussion section is a document section containing a summary of the findings, a reflection on the significance of findings, comparison with related work, among others.
        (cls, http://semanticscience.org/resource/SIO_000195)
        """
        return cls._namespace_SIO('SIO_000195')

    @classmethod
    def introduction_section(cls):
        """An introduction section is a document section that generally provides background, motivation and goals of the work.
        (cls, http://semanticscience.org/resource/SIO_000196)
        """
        return cls._namespace_SIO('SIO_000196')

    @classmethod
    def materials_and_methods_section(cls):
        """The materials and methods section is a document section containing a description of the materials and methods used in the study.
        (cls, http://semanticscience.org/resource/SIO_000197)
        """
        return cls._namespace_SIO('SIO_000197')

    @classmethod
    def materials_section(cls):
        """The materials section is a document section containing a description of the materials used in the study.
        (cls, http://semanticscience.org/resource/SIO_000198)
        """
        return cls._namespace_SIO('SIO_000198')

    @classmethod
    def methods_section(cls):
        """The methods section is a document section containing a description of the methods used in the study.
        (cls, http://semanticscience.org/resource/SIO_000199)
        """
        return cls._namespace_SIO('SIO_000199')

    @classmethod
    def results_section(cls):
        """The results section is a document section describing the main findings of the study.
        (cls, http://semanticscience.org/resource/SIO_000200)
        """
        return cls._namespace_SIO('SIO_000200')

    @classmethod
    def table_of_contents(cls):
        """The table of contents is a document section that lists all sections (cls, and optionally subsections) in a sequential order along with their page number.
        (http://semanticscience.org/resource/SIO_000201)
        """
        return cls._namespace_SIO('SIO_000201')

    @classmethod
    def implies(cls):
        """implication is a logical operator that holds between a set T of propositions and a proposition B, when every model (cls, or interpretation or valuation) of T is also a model of B.
        (http://semanticscience.org/resource/SIO_000220)
        """
        return cls._namespace_SIO('SIO_000220')

    @classmethod
    def namespace_label(cls):
        """A namespace label is a short name for a namespace.
        (cls, http://semanticscience.org/resource/SIO_000237)
        """
        return cls._namespace_SIO('SIO_000237')

    @classmethod
    def logical_operator(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000238)
        """
        return cls._namespace_SIO('SIO_000238')

    @classmethod
    def conjunction_and(cls):
        """AND is a logical operator that has the value true if both of its operands are true, otherwise a value of false.
        (cls, http://semanticscience.org/resource/SIO_000239)
        """
        return cls._namespace_SIO('SIO_000239')

    @classmethod
    def proposition(cls):
        """A proposition is a sentence expressing something true or false.
        (cls, http://semanticscience.org/resource/SIO_000256)
        """
        return cls._namespace_SIO('SIO_000256')

    @classmethod
    def dimensionless_quantity(cls):
        """A dimensionless quantity is a quantity that has no associated unit.
        (cls, http://semanticscience.org/resource/SIO_000257)
        """
        return cls._namespace_SIO('SIO_000257')

    @classmethod
    def dimensional_quantity(cls):
        """A dimensional quantity is a quantity that has an associated unit.
        (cls, http://semanticscience.org/resource/SIO_000258)
        """
        return cls._namespace_SIO('SIO_000258')

    @classmethod
    def argument(cls):
        """An argument is a set of one or more declarative sentences (cls, or propositions) known as the premises along with another declarative sentence (or proposition) known as the conclusion.
        (http://semanticscience.org/resource/SIO_000259)
        """
        return cls._namespace_SIO('SIO_000259')

    @classmethod
    def premise(cls):
        """A premise is a proposition of an argument from which the conclusion is drawn.
        (cls, http://semanticscience.org/resource/SIO_000261)
        """
        return cls._namespace_SIO('SIO_000261')

    @classmethod
    def conclusion(cls):
        """A conclusion is a proposition which is reached after considering the evidence, arguments or premises.
        (cls, http://semanticscience.org/resource/SIO_000262)
        """
        return cls._namespace_SIO('SIO_000262')

    @classmethod
    def deductive_argument(cls):
        """A deductive argument is an argument that asserts that the truth of the conclusion is a logical consequence of the premises.
        (cls, http://semanticscience.org/resource/SIO_000263)
        """
        return cls._namespace_SIO('SIO_000263')

    @classmethod
    def inductive_argument(cls):
        """An inductive argument is an argument that asserts that the truth of the conclusion is supported by the premises.
        (cls, http://semanticscience.org/resource/SIO_000264)
        """
        return cls._namespace_SIO('SIO_000264')

    @classmethod
    def sound_argument(cls):
        """A sound argument is a valid argument with true premises.
        (cls, http://semanticscience.org/resource/SIO_000265)
        """
        return cls._namespace_SIO('SIO_000265')

    @classmethod
    def valid_argument(cls):
        """A valid argument is an argument where the truth of the conclusion is a logical consequence of the premises and (cls, consequently) its corresponding conditional is a necessary truth.
        (http://semanticscience.org/resource/SIO_000266)
        """
        return cls._namespace_SIO('SIO_000266')

    @classmethod
    def invalid_argument(cls):
        """An invalid argument is an argument where the truth of the conclusion is false because it is not a logical consequence of the premises.
        (cls, http://semanticscience.org/resource/SIO_000267)
        """
        return cls._namespace_SIO('SIO_000267')

    @classmethod
    def truth_value(cls):
        """truth value is a quality of information that is claimed/verified to be true or false.
        (cls, http://semanticscience.org/resource/SIO_000268)
        """
        return cls._namespace_SIO('SIO_000268')

    @classmethod
    def _true_(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000269)
        """
        return cls._namespace_SIO('SIO_000269')

    @classmethod
    def _false_(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000270)
        """
        return cls._namespace_SIO('SIO_000270')

    @classmethod
    def term(cls):
        """A term is a word or phrase used to denote one or more entities.
        (cls, http://semanticscience.org/resource/SIO_000275)
        """
        return cls._namespace_SIO('SIO_000275')

    @classmethod
    def emotion(cls):
        """An emotion is a process (cls, experience) that arises internally or from an involuntary physiological response to a stimulus.
        (http://semanticscience.org/resource/SIO_000276)
        """
        return cls._namespace_SIO('SIO_000276')

    @classmethod
    def mass(cls):
        """mass is the quality of the amount of substance.
        (cls, http://semanticscience.org/resource/SIO_000279)
        """
        return cls._namespace_SIO('SIO_000279')

    @classmethod
    def disjunction_or(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000280)
        """
        return cls._namespace_SIO('SIO_000280')

    @classmethod
    def negation_not(cls):
        """NOT is a logical operator in that has the value true if its operand is false.
        (cls, http://semanticscience.org/resource/SIO_000281)
        """
        return cls._namespace_SIO('SIO_000281')

    @classmethod
    def exclusive_disjunction_xor(cls):
        """XOR, also called exclusive disjunction or (cls, symbolized XOR, EOR, EXOR, or ), is a type of logical disjunction on two operands that results in a value of true if exactly one of the operands has a value of true.
        (http://semanticscience.org/resource/SIO_000282)
        """
        return cls._namespace_SIO('SIO_000282')

    @classmethod
    def hypothesis(cls):
        """a hypothesis is a proposed explanation for a phenomenon.
        (cls, http://semanticscience.org/resource/SIO_000284)
        """
        return cls._namespace_SIO('SIO_000284')

    @classmethod
    def academic_organization(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000285)
        """
        return cls._namespace_SIO('SIO_000285')

    @classmethod
    def social_relation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000287)
        """
        return cls._namespace_SIO('SIO_000287')

    @classmethod
    def set(cls):
        """a set is a collection of entities, for which there may be zero members.
        (cls, http://semanticscience.org/resource/SIO_000289)
        """
        return cls._namespace_SIO('SIO_000289')

    @classmethod
    def university(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000290)
        """
        return cls._namespace_SIO('SIO_000290')

    @classmethod
    def collection_of_documents(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000295)
        """
        return cls._namespace_SIO('SIO_000295')

    @classmethod
    def website(cls):
        """A website is a collection of documents published on the World Wide Web.
        (cls, http://semanticscience.org/resource/SIO_000296)
        """
        return cls._namespace_SIO('SIO_000296')

    @classmethod
    def movie(cls):
        """A movie is a series of images that are displayed in rapid succession  to give the impression of movement.
        (cls, http://semanticscience.org/resource/SIO_000297)
        """
        return cls._namespace_SIO('SIO_000297')

    @classmethod
    def moving_pictures(cls):
        """A movie is a series of images that are displayed in rapid succession  to give the impression of movement.
        (cls, http://semanticscience.org/resource/SIO_000297)
        """
        return cls._namespace_SIO('SIO_000297')

    @classmethod
    def excerpt(cls):
        """An excerpt is a contiguous or discontiguous portion of a document.
        (cls, http://semanticscience.org/resource/SIO_000298)
        """
        return cls._namespace_SIO('SIO_000298')

    @classmethod
    def quote(cls):
        """A quote is a excerpt that is attributed to a particular source.
        (cls, http://semanticscience.org/resource/SIO_000299)
        """
        return cls._namespace_SIO('SIO_000299')

    @classmethod
    def geographic_image(cls):
        """A geographic image is a photograph of some geographical area.
        (cls, http://semanticscience.org/resource/SIO_000301)
        """
        return cls._namespace_SIO('SIO_000301')

    @classmethod
    def web_page(cls):
        """A web page is a document that is published according to World Wide Web standards.
        (cls, http://semanticscience.org/resource/SIO_000302)
        """
        return cls._namespace_SIO('SIO_000302')

    @classmethod
    def email(cls):
        """Email message is a digital document that is composed of a header and a body and is transmitted using the SMTP protocol.
        (cls, http://semanticscience.org/resource/SIO_000304)
        """
        return cls._namespace_SIO('SIO_000304')

    @classmethod
    def process_number(cls):
        """process number is a number associated with a process that denotes its ordinal position in a set of processes.
        (cls, http://semanticscience.org/resource/SIO_000305)
        """
        return cls._namespace_SIO('SIO_000305')

    @classmethod
    def letter(cls):
        """A letter is a document that contains a personal communication from one part to another.
        (cls, http://semanticscience.org/resource/SIO_000306)
        """
        return cls._namespace_SIO('SIO_000306')

    @classmethod
    def normality(cls):
        """normality is the quality in which the value may differ from normal or average
        (cls, http://semanticscience.org/resource/SIO_000307)
        """
        return cls._namespace_SIO('SIO_000307')

    @classmethod
    def edition_number(cls):
        """An edition number is count of a literary work edited and published, as by a certain editor or in a certain manner including being printed during some interval of time.
        (cls, http://semanticscience.org/resource/SIO_000308)
        """
        return cls._namespace_SIO('SIO_000308')

    @classmethod
    def volume_number(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000309)
        """
        return cls._namespace_SIO('SIO_000309')

    @classmethod
    def polymer(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000314)
        """
        return cls._namespace_SIO('SIO_000314')

    @classmethod
    def functional_specification(cls):
        """A functional specification is a specification that describes the characteristics of an object.
        (cls, http://semanticscience.org/resource/SIO_000315)
        """
        return cls._namespace_SIO('SIO_000315')

    @classmethod
    def design_specification(cls):
        """A design specification is a specification that provides precise and explicit information about the requirements for a product design.
        (cls, http://semanticscience.org/resource/SIO_000316)
        """
        return cls._namespace_SIO('SIO_000316')

    @classmethod
    def spatial_specification(cls):
        """A specification for spatial location is an effective specification towards representation spatial position or spatial data.
        (cls, http://semanticscience.org/resource/SIO_000317)
        """
        return cls._namespace_SIO('SIO_000317')

    @classmethod
    def longitude(cls):
        """Longitude is a geographic position that refers to  the angle east or west of a reference meridian between the two geographical poles to another meridian that passes through an arbitrary point.
        (cls, http://semanticscience.org/resource/SIO_000318)
        """
        return cls._namespace_SIO('SIO_000318')

    @classmethod
    def latitude(cls):
        """Latitude is a geographic coordinate which refers to the angle from a point on the Earth's surface to the equatorial plane
        (cls, http://semanticscience.org/resource/SIO_000319)
        """
        return cls._namespace_SIO('SIO_000319')

    @classmethod
    def coordinate_system(cls):
        """A coordinate system is a specification for spatial location that uses a set of numbers, or coordinates, to uniquely determine the position of a point or other geometric element.
        (cls, http://semanticscience.org/resource/SIO_000320)
        """
        return cls._namespace_SIO('SIO_000320')

    @classmethod
    def cartesian_coordinate_system(cls):
        """A Cartesian coordinate system specifies each point uniquely in a plane by a pair of numerical coordinates, which are the signed distances from the point to two fixed perpendicular directed lines, measured in the same unit of length.
        (cls, http://semanticscience.org/resource/SIO_000321)
        """
        return cls._namespace_SIO('SIO_000321')

    @classmethod
    def concept(cls):
        """A concept is term that refers to a generalization of a set of attributes or entities.
        (cls, http://semanticscience.org/resource/SIO_000326)
        """
        return cls._namespace_SIO('SIO_000326')

    @classmethod
    def polar_coordinate_system(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000327)
        """
        return cls._namespace_SIO('SIO_000327')

    @classmethod
    def positional_description(cls):
        """a positional description is a description of location using some system or frame of reference.
        (cls, http://semanticscience.org/resource/SIO_000328)
        """
        return cls._namespace_SIO('SIO_000328')

    @classmethod
    def cylindrical_coordinate_system(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000329)
        """
        return cls._namespace_SIO('SIO_000329')

    @classmethod
    def spherical_coordinate_system(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000330)
        """
        return cls._namespace_SIO('SIO_000330')

    @classmethod
    def OWL_ontology(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000331)
        """
        return cls._namespace_SIO('SIO_000331')

    @classmethod
    def a_D_cartesian_coordinate(cls):
        """a 3D cartesian coordinate is a coordinate that is composed of an x,y and z coordinate.
        (cls, http://semanticscience.org/resource/SIO_000333)
        """
        return cls._namespace_SIO('SIO_000333')

    @classmethod
    def objective(cls):
        """an objective is a proposition that indicates a planned or anticipated outcome.
        (cls, http://semanticscience.org/resource/SIO_000337)
        """
        return cls._namespace_SIO('SIO_000337')

    @classmethod
    def realizable_entity(cls):
        """A realizable entity is an attribute that is exhibited under some condition and is realized in some process.
        (cls, http://semanticscience.org/resource/SIO_000340)
        """
        return cls._namespace_SIO('SIO_000340')

    @classmethod
    def term_variant(cls):
        """a term variant is a term that is a variant of another term.
        (cls, http://semanticscience.org/resource/SIO_000342)
        """
        return cls._namespace_SIO('SIO_000342')

    @classmethod
    def to_modify(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000343)
        """
        return cls._namespace_SIO('SIO_000343')

    @classmethod
    def to_record(cls):
        """To record is the capability to detect and transcribe information in a specified format on some physical medium.
        (cls, http://semanticscience.org/resource/SIO_000344)
        """
        return cls._namespace_SIO('SIO_000344')

    @classmethod
    def to_magnify(cls):
        """To magnify is the capability to increase the appearance of the size of an object.
        (cls, http://semanticscience.org/resource/SIO_000345)
        """
        return cls._namespace_SIO('SIO_000345')

    @classmethod
    def to_heat(cls):
        """To heat is a capability to increase the internal kinetic energy of a material.
        (cls, http://semanticscience.org/resource/SIO_000346)
        """
        return cls._namespace_SIO('SIO_000346')

    @classmethod
    def to_cool(cls):
        """To cool is the capability to decrease the internal kinetic energy of a material.
        (cls, http://semanticscience.org/resource/SIO_000347)
        """
        return cls._namespace_SIO('SIO_000347')

    @classmethod
    def to_freeze(cls):
        """To freeze is the capability to decrease the internal kinetic energy of a material such that it changes state from a gas or liquid to a solid.
        (cls, http://semanticscience.org/resource/SIO_000348)
        """
        return cls._namespace_SIO('SIO_000348')

    @classmethod
    def to_separate(cls):
        """To separate is the capability to i) distinguish some entities based on some attribute(cls, s) and ii) subsequently physically displace them.
        (http://semanticscience.org/resource/SIO_000349)
        """
        return cls._namespace_SIO('SIO_000349')

    @classmethod
    def to_ionize(cls):
        """To ionize is the capability to physically convert an atom or molecule into an ion by adding or removing charged particles such as electrons or other ions.
        (cls, http://semanticscience.org/resource/SIO_000350)
        """
        return cls._namespace_SIO('SIO_000350')

    @classmethod
    def to_supply_energy(cls):
        """To supply energy is the capability to transfer energy from a source to a sink.
        (cls, http://semanticscience.org/resource/SIO_000351)
        """
        return cls._namespace_SIO('SIO_000351')

    @classmethod
    def to_observe(cls):
        """to observe is the capability to watch attentively.
        (cls, http://semanticscience.org/resource/SIO_000353)
        """
        return cls._namespace_SIO('SIO_000353')

    @classmethod
    def dysfunction(cls):
        """dysfunction is a capability to act in an abnormal or unintended manner.
        (cls, http://semanticscience.org/resource/SIO_000354)
        """
        return cls._namespace_SIO('SIO_000354')

    @classmethod
    def fitness(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000357)
        """
        return cls._namespace_SIO('SIO_000357')

    @classmethod
    def intent(cls):
        """intent is a desire to realize a particular outcome.
        (cls, http://semanticscience.org/resource/SIO_000358)
        """
        return cls._namespace_SIO('SIO_000358')

    @classmethod
    def purpose(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000359)
        """
        return cls._namespace_SIO('SIO_000359')

    @classmethod
    def belief(cls):
        """a belief is a proposition that is believed to be true.
        (cls, http://semanticscience.org/resource/SIO_000360)
        """
        return cls._namespace_SIO('SIO_000360')

    @classmethod
    def number(cls):
        """A number is a mathematical object used to count, label, and measure.
        (cls, http://semanticscience.org/resource/SIO_000366)
        """
        return cls._namespace_SIO('SIO_000366')

    @classmethod
    def variable(cls):
        """a variable is a value that may change within the scope of a given problem or set of operations.
        (cls, http://semanticscience.org/resource/SIO_000367)
        """
        return cls._namespace_SIO('SIO_000367')

    @classmethod
    def equation(cls):
        """An equation is a mathematical statement that asserts the equality of two expressions.
        (cls, http://semanticscience.org/resource/SIO_000368)
        """
        return cls._namespace_SIO('SIO_000368')

    @classmethod
    def spatial_region(cls):
        """a spatial region is an object contained in some region of space.
        (cls, http://semanticscience.org/resource/SIO_000370)
        """
        return cls._namespace_SIO('SIO_000370')

    @classmethod
    def to_measure(cls):
        """To measure is the capability to obtain information about some entity by examining its attributes in relation to some reference metric.
        (cls, http://semanticscience.org/resource/SIO_000371)
        """
        return cls._namespace_SIO('SIO_000371')

    @classmethod
    def to_inject(cls):
        """To inject is the capability to administer a substance into some object through its external barrier.
        (cls, http://semanticscience.org/resource/SIO_000372)
        """
        return cls._namespace_SIO('SIO_000372')

    @classmethod
    def to_boil(cls):
        """To boil is the capability to increase the internal kinetic energy of a material such that it changes state from a solid or liquid to a gas.
        (cls, http://semanticscience.org/resource/SIO_000373)
        """
        return cls._namespace_SIO('SIO_000373')

    @classmethod
    def to_reduce_energy(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000374)
        """
        return cls._namespace_SIO('SIO_000374')

    @classmethod
    def to_supply_electricity(cls):
        """To supply electricity is the capability to transfer electricity from a source to a sink.
        (cls, http://semanticscience.org/resource/SIO_000375)
        """
        return cls._namespace_SIO('SIO_000375')

    @classmethod
    def to_change_materially(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000376)
        """
        return cls._namespace_SIO('SIO_000376')

    @classmethod
    def to_demagnify(cls):
        """To demagnify is the capability to decrease the appearance of the size of an object.
        (cls, http://semanticscience.org/resource/SIO_000377)
        """
        return cls._namespace_SIO('SIO_000377')

    @classmethod
    def to_change_appearance(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000378)
        """
        return cls._namespace_SIO('SIO_000378')

    @classmethod
    def perception(cls):
        """Perception is the organization, identification, and interpretation of sensory information in order to fabricate a mental representation through the process of transduction, which sensors in the body transform signals from the environment into encoded neural signals.
        (cls, http://semanticscience.org/resource/SIO_000379)
        """
        return cls._namespace_SIO('SIO_000379')

    @classmethod
    def to_contain(cls):
        """To contain is the capability to bound or constrain a physical entity in some site.
        (cls, http://semanticscience.org/resource/SIO_000380)
        """
        return cls._namespace_SIO('SIO_000380')

    @classmethod
    def to_immobilize(cls):
        """To immobilize is the capability to contain an entity in such a way that it may not move in space.
        (cls, http://semanticscience.org/resource/SIO_000381)
        """
        return cls._namespace_SIO('SIO_000381')

    @classmethod
    def to_filter(cls):
        """To filter is the capability to retain certain entities based on selected attribute(cls, s) while allowing other entities to pass through.
        (http://semanticscience.org/resource/SIO_000382)
        """
        return cls._namespace_SIO('SIO_000382')

    @classmethod
    def to_excite(cls):
        """To excite is the capability to supply energy to a materila by bombarding it with energetic particles (cls, e.g., photons).
        (http://semanticscience.org/resource/SIO_000383)
        """
        return cls._namespace_SIO('SIO_000383')

    @classmethod
    def to_emit(cls):
        """To emit is the capability to release some physical entity (cls, light, pollution, etc).
        (http://semanticscience.org/resource/SIO_000384)
        """
        return cls._namespace_SIO('SIO_000384')

    @classmethod
    def to_change_energetically(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000385)
        """
        return cls._namespace_SIO('SIO_000385')

    @classmethod
    def to_oxidize(cls):
        """Either:
            -- No comment or description provided. --
            (cls, http://semanticscience.org/resource/SIO_000386)
        Or:
            -- No comment or description provided. --
            (http://semanticscience.org/resource/SIO_010358)
        """
        return [ cls._namespace_SIO('SIO_000386'), cls._namespace_SIO('SIO_010358') ]

    @classmethod
    def to_reduce(cls):
        """Either:
            -- No comment or description provided. --
            (cls, http://semanticscience.org/resource/SIO_000387)
        Or:
            -- No comment or description provided. --
            (http://semanticscience.org/resource/SIO_010359)
        """
        return [ cls._namespace_SIO('SIO_000387'), cls._namespace_SIO('SIO_010359') ]

    @classmethod
    def to_assemble(cls):
        """to assemble is the capability to combine entities together into a larger object that persists in time.
        (cls, http://semanticscience.org/resource/SIO_000388)
        """
        return cls._namespace_SIO('SIO_000388')

    @classmethod
    def to_extract(cls):
        """To extract is the capability to remove certain entities based on selected attribute(cls, s) while allowing other entities to remain.
        (http://semanticscience.org/resource/SIO_000389)
        """
        return cls._namespace_SIO('SIO_000389')

    @classmethod
    def to_transport(cls):
        """to transport is the capability to displace a material from one location to another.
        (cls, http://semanticscience.org/resource/SIO_000390)
        """
        return cls._namespace_SIO('SIO_000390')

    @classmethod
    def time_measurement(cls):
        """time measurement is a measurement value of the duration of some interval of time or a particular instant of time (cls, against some frame of reference).
        (http://semanticscience.org/resource/SIO_000391)
        """
        return cls._namespace_SIO('SIO_000391')

    @classmethod
    def to_change_spatially(cls):
        """to change spatially is the capability to affect the physical movement of some entity.
        (cls, http://semanticscience.org/resource/SIO_000392)
        """
        return cls._namespace_SIO('SIO_000392')

    @classmethod
    def patient(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000393)
        """
        return cls._namespace_SIO('SIO_000393')

    @classmethod
    def doctor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000394)
        """
        return cls._namespace_SIO('SIO_000394')

    @classmethod
    def to_regulate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000395)
        """
        return cls._namespace_SIO('SIO_000395')

    @classmethod
    def to_modulate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000395)
        """
        return cls._namespace_SIO('SIO_000395')

    @classmethod
    def file(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000396)
        """
        return cls._namespace_SIO('SIO_000396')

    @classmethod
    def to_provide(cls):
        """to provide is the capability to make available some object to another that requires it.
        (cls, http://semanticscience.org/resource/SIO_000397)
        """
        return cls._namespace_SIO('SIO_000397')

    @classmethod
    def nurse(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000398)
        """
        return cls._namespace_SIO('SIO_000398')

    @classmethod
    def study_subject(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000399)
        """
        return cls._namespace_SIO('SIO_000399')

    @classmethod
    def x_cartesian_coordinate(cls):
        """an x cartesian coordinate is the coordinate of an object onto the x-axis of a cartesian coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000400)
        """
        return cls._namespace_SIO('SIO_000400')

    @classmethod
    def y_cartesian_coordinate(cls):
        """an y cartesian coordinate is the coordinate of an object onto the y-axis of a cartesian coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000401)
        """
        return cls._namespace_SIO('SIO_000401')

    @classmethod
    def z_cartesian_coordinate(cls):
        """a z cartesian coordinate is the coordinate of an object onto the z-axis of a cartesian coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000402)
        """
        return cls._namespace_SIO('SIO_000402')

    @classmethod
    def study_group(cls):
        """a study group is a group of individuals that are subjects in an observational or intervention study.
        (cls, http://semanticscience.org/resource/SIO_000403)
        """
        return cls._namespace_SIO('SIO_000403')

    @classmethod
    def professor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000404)
        """
        return cls._namespace_SIO('SIO_000404')

    @classmethod
    def student(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000405)
        """
        return cls._namespace_SIO('SIO_000405')

    @classmethod
    def academic(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000406)
        """
        return cls._namespace_SIO('SIO_000406')

    @classmethod
    def to_increase_the_rate_of_formation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000407)
        """
        return cls._namespace_SIO('SIO_000407')

    @classmethod
    def to_investigate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000408)
        """
        return cls._namespace_SIO('SIO_000408')

    @classmethod
    def mutual_disposition(cls):
        """a mutual disposition is a disposition that simulataneously invokes another disposition when realized.
        (cls, http://semanticscience.org/resource/SIO_000409)
        """
        return cls._namespace_SIO('SIO_000409')

    @classmethod
    def anger(cls):
        """anger is disgust directed toward an equal status individual.
        (cls, http://semanticscience.org/resource/SIO_000410)
        """
        return cls._namespace_SIO('SIO_000410')

    @classmethod
    def hate(cls):
        """Hate is a deep and emotional extreme dislike, directed against a certain object or class of objects.
        (cls, http://semanticscience.org/resource/SIO_000411)
        """
        return cls._namespace_SIO('SIO_000411')

    @classmethod
    def love(cls):
        """Love is an emotion of a strong affection and personal attachment.
        (cls, http://semanticscience.org/resource/SIO_000412)
        """
        return cls._namespace_SIO('SIO_000412')

    @classmethod
    def geolegal_region(cls):
        """A geolegal region is a geographic region which has causal powers confered by a legal entity.
        (cls, http://semanticscience.org/resource/SIO_000413)
        """
        return cls._namespace_SIO('SIO_000413')

    @classmethod
    def geographic_region(cls):
        """a geographic region is a spatial region whose boundaries are typically defined against some material frame of reference (cls, like the earth).
        (http://semanticscience.org/resource/SIO_000414)
        """
        return cls._namespace_SIO('SIO_000414')

    @classmethod
    def geopolitical_region(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000415)
        """
        return cls._namespace_SIO('SIO_000415')

    @classmethod
    def time_interval(cls):
        """a time internval is a contiguous temporal region having some duration.
        (cls, http://semanticscience.org/resource/SIO_000417)
        """
        return cls._namespace_SIO('SIO_000417')

    @classmethod
    def time_instant(cls):
        """a time instant is a temporal region which occurs instantaneously e.g. having no duration.
        (cls, http://semanticscience.org/resource/SIO_000418)
        """
        return cls._namespace_SIO('SIO_000418')

    @classmethod
    def table(cls):
        """A table is a figure that consists of an ordered arrangement of columns and rows.
        (cls, http://semanticscience.org/resource/SIO_000419)
        """
        return cls._namespace_SIO('SIO_000419')

    @classmethod
    def scatterplot(cls):
        """A scatterplot is a statistical graph which uses Cartesian coordinates to display values for two variables for a set of data. The data is displayed as a collection of points, each having the value of one variable determining the position on the horizontal axis and the value of the other variable determining the position on the vertical axis.
        (cls, http://semanticscience.org/resource/SIO_000423)
        """
        return cls._namespace_SIO('SIO_000423')

    @classmethod
    def scatter_graph(cls):
        """A scatterplot is a statistical graph which uses Cartesian coordinates to display values for two variables for a set of data. The data is displayed as a collection of points, each having the value of one variable determining the position on the horizontal axis and the value of the other variable determining the position on the vertical axis.
        (cls, http://semanticscience.org/resource/SIO_000423)
        """
        return cls._namespace_SIO('SIO_000423')

    @classmethod
    def year(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000428)
        """
        return cls._namespace_SIO('SIO_000428')

    @classmethod
    def month(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000429)
        """
        return cls._namespace_SIO('SIO_000429')

    @classmethod
    def day(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000430)
        """
        return cls._namespace_SIO('SIO_000430')

    @classmethod
    def century(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000431)
        """
        return cls._namespace_SIO('SIO_000431')

    @classmethod
    def millenium(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000432)
        """
        return cls._namespace_SIO('SIO_000432')

    @classmethod
    def hour(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000433)
        """
        return cls._namespace_SIO('SIO_000433')

    @classmethod
    def minute(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000434)
        """
        return cls._namespace_SIO('SIO_000434')

    @classmethod
    def second(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000435)
        """
        return cls._namespace_SIO('SIO_000435')

    @classmethod
    def informational_quality(cls):
        """an informational quality is a quality that pertains to information.
        (cls, http://semanticscience.org/resource/SIO_000436)
        """
        return cls._namespace_SIO('SIO_000436')

    @classmethod
    def a_D_cartesian_point(cls):
        """a 2D cartesian point is a point whose position is specified along two  dimensions using Cartesian coordinates.
        (cls, http://semanticscience.org/resource/SIO_000437)
        """
        return cls._namespace_SIO('SIO_000437')

    @classmethod
    def altitude(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000438)
        """
        return cls._namespace_SIO('SIO_000438')

    @classmethod
    def center_of_mass(cls):
        """the center of mass (cls, aka barycenter) is the weighted average location of all the mass in a body or group of bodies.
        (http://semanticscience.org/resource/SIO_000439)
        """
        return cls._namespace_SIO('SIO_000439')

    @classmethod
    def line_graph(cls):
        """A line graph is a statistical graph in which lines contains the evaluation of functions or individual points connected by line segments.
        (cls, http://semanticscience.org/resource/SIO_000442)
        """
        return cls._namespace_SIO('SIO_000442')

    @classmethod
    def line_chart(cls):
        """A line graph is a statistical graph in which lines contains the evaluation of functions or individual points connected by line segments.
        (cls, http://semanticscience.org/resource/SIO_000442)
        """
        return cls._namespace_SIO('SIO_000442')

    @classmethod
    def bar_graph(cls):
        """A bar graph is a statistical graph with rectangular bars of lengths proportional to that value that they represent.
        (cls, http://semanticscience.org/resource/SIO_000443)
        """
        return cls._namespace_SIO('SIO_000443')

    @classmethod
    def horizontal_bar_graph(cls):
        """A horizontal bar graph is a bar graph in which the rectangular bars
        are horizontally oriented in space.
        (cls, http://semanticscience.org/resource/SIO_000444)
        """
        return cls._namespace_SIO('SIO_000444')

    @classmethod
    def vertical_bar_graph(cls):
        """A vertical bar graph is a bar graph in which the rectangular bars are
        vertically oriented in space.
        (cls, http://semanticscience.org/resource/SIO_000445)
        """
        return cls._namespace_SIO('SIO_000445')

    @classmethod
    def stacked_bar_graph(cls):
        """A stacked bar graph is a bar graph in which each rectangular bar is
        partioned by the categorical value of each series of data.
        (cls, http://semanticscience.org/resource/SIO_000446)
        """
        return cls._namespace_SIO('SIO_000446')

    @classmethod
    def line_bar_graph(cls):
        """A line-bar graph statistical graph that contains both lines and bars.
        (cls, http://semanticscience.org/resource/SIO_000447)
        """
        return cls._namespace_SIO('SIO_000447')

    @classmethod
    def figure_part(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000448)
        """
        return cls._namespace_SIO('SIO_000448')

    @classmethod
    def plot(cls):
        """A plot is a part of a figure that corresponds to the spatial region between the set of axes.
        (cls, http://semanticscience.org/resource/SIO_000449)
        """
        return cls._namespace_SIO('SIO_000449')

    @classmethod
    def axis(cls):
        """An axis is a line segment that is part of a statistical graph in which the
        position along the line corresponds to a numeric or categorical value.
        (cls, http://semanticscience.org/resource/SIO_000450)
        """
        return cls._namespace_SIO('SIO_000450')

    @classmethod
    def Cartesian_coordinate_axis(cls):
        """A Cartesian coordinate axis is an axis whose behavior follows that of a Cartesian coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000451)
        """
        return cls._namespace_SIO('SIO_000451')

    @classmethod
    def x_axis(cls):
        """An x-axis is a Cartesian coordinate axis that is aligned with the horizon.
        (cls, http://semanticscience.org/resource/SIO_000452)
        """
        return cls._namespace_SIO('SIO_000452')

    @classmethod
    def horizontal_axis(cls):
        """An x-axis is a Cartesian coordinate axis that is aligned with the horizon.
        (cls, http://semanticscience.org/resource/SIO_000452)
        """
        return cls._namespace_SIO('SIO_000452')

    @classmethod
    def y_axis(cls):
        """A y-axis is a Cartesian coordinate axis that is spatially oriented
        perpendicular to the x-axis.
        (cls, http://semanticscience.org/resource/SIO_000453)
        """
        return cls._namespace_SIO('SIO_000453')

    @classmethod
    def vertical_axis(cls):
        """A y-axis is a Cartesian coordinate axis that is spatially oriented
        perpendicular to the x-axis.
        (cls, http://semanticscience.org/resource/SIO_000453)
        """
        return cls._namespace_SIO('SIO_000453')

    @classmethod
    def z_axis(cls):
        """A z-axis is a Cartesian coordinate axis that is spatially oriented
        normal to the plane formed by the x- and y-axes.
        (cls, http://semanticscience.org/resource/SIO_000454)
        """
        return cls._namespace_SIO('SIO_000454')

    @classmethod
    def category_axis(cls):
        """A category axis is an axis in which the position along the line is
        partioned into categories.
        (cls, http://semanticscience.org/resource/SIO_000455)
        """
        return cls._namespace_SIO('SIO_000455')

    @classmethod
    def primary_category_axis(cls):
        """A primary category axis is a category axis that either defines the sole value range or holds the larger set of categorical values specified by the secondary category axis.
        (cls, http://semanticscience.org/resource/SIO_000456)
        """
        return cls._namespace_SIO('SIO_000456')

    @classmethod
    def secondary_category_axis(cls):
        """A secondary category axis is a category axis that defines a finer
        granular part (cls, or subset) of the value range of the primary category axis.
        (http://semanticscience.org/resource/SIO_000457)
        """
        return cls._namespace_SIO('SIO_000457')

    @classmethod
    def value_axis(cls):
        """A value axis is an axis in which the position along the line is
        partioned into numeric values.
        (cls, http://semanticscience.org/resource/SIO_000458)
        """
        return cls._namespace_SIO('SIO_000458')

    @classmethod
    def left_value_axis(cls):
        """A left value axis is a value axis that is spatially positioned to the left of the plot area.
        (cls, http://semanticscience.org/resource/SIO_000459)
        """
        return cls._namespace_SIO('SIO_000459')

    @classmethod
    def right_value_axis(cls):
        """A right value axis is a value axis that is spatially positioned to the right of the plot area.
        (cls, http://semanticscience.org/resource/SIO_000460)
        """
        return cls._namespace_SIO('SIO_000460')

    @classmethod
    def scaled_value_axis(cls):
        """A scaled value axis is a value axis in which the value range was subject to a mathematic transformation.
        (cls, http://semanticscience.org/resource/SIO_000461)
        """
        return cls._namespace_SIO('SIO_000461')

    @classmethod
    def linear_value_axis(cls):
        """A linear value axis is a value axis that corresponds to a scaling factor of 1 of the value range.
        (cls, http://semanticscience.org/resource/SIO_000462)
        """
        return cls._namespace_SIO('SIO_000462')

    @classmethod
    def logarithmic_value_axis(cls):
        """A logarithmic value axis is a scaled value axis that corresponds to a scaling factor of the logarithm of the value range.
        (cls, http://semanticscience.org/resource/SIO_000463)
        """
        return cls._namespace_SIO('SIO_000463')

    @classmethod
    def data_series(cls):
        """A data series is a data set composed of related values displayed in a statistical graph.
        (cls, http://semanticscience.org/resource/SIO_000464)
        """
        return cls._namespace_SIO('SIO_000464')

    @classmethod
    def data_point(cls):
        """A data point is a point that which corresponds to the projection of the values of measurement data against the axes of a statistical graph.
        (cls, http://semanticscience.org/resource/SIO_000465)
        """
        return cls._namespace_SIO('SIO_000465')

    @classmethod
    def global_maximal_stationary_point(cls):
        """A global maximum stationary point is a data point that corresponds to a measurement value is larger than that of all other plotted datapoints.
        (cls, http://semanticscience.org/resource/SIO_000466)
        """
        return cls._namespace_SIO('SIO_000466')

    @classmethod
    def global_minimal_stationary_point(cls):
        """A global minimum data point is a data point that corresponds to a measurement value is smaller than that of all other plotted datapoints.
        (cls, http://semanticscience.org/resource/SIO_000467)
        """
        return cls._namespace_SIO('SIO_000467')

    @classmethod
    def legend(cls):
        """A legend is a part of a figure that associates textual descriptions with symbols pertaining to plotted entities.
        (cls, http://semanticscience.org/resource/SIO_000468)
        """
        return cls._namespace_SIO('SIO_000468')

    @classmethod
    def graph_title(cls):
        """A graph title is a title that describes a graph.
        (cls, http://semanticscience.org/resource/SIO_000469)
        """
        return cls._namespace_SIO('SIO_000469')

    @classmethod
    def primary_title(cls):
        """A primary title is a title that should be first used in describing some entity.
        (cls, http://semanticscience.org/resource/SIO_000470)
        """
        return cls._namespace_SIO('SIO_000470')

    @classmethod
    def secondary_title(cls):
        """A secondary title is a title of lesser importance that should be used after the first title in describing some entity.
        (cls, http://semanticscience.org/resource/SIO_000471)
        """
        return cls._namespace_SIO('SIO_000471')

    @classmethod
    def subtitle_alternative_title(cls):
        """A secondary title is a title of lesser importance that should be used after the first title in describing some entity.
        (cls, http://semanticscience.org/resource/SIO_000471)
        """
        return cls._namespace_SIO('SIO_000471')

    @classmethod
    def scientific_data(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000472)
        """
        return cls._namespace_SIO('SIO_000472')

    @classmethod
    def primary_graph_title(cls):
        """A primary graph title is a primary title that describes a statistical
        graph.
        (cls, http://semanticscience.org/resource/SIO_000473)
        """
        return cls._namespace_SIO('SIO_000473')

    @classmethod
    def secondary_graph_title(cls):
        """A secondary graph title is a secondary title that describes a statistical graph.
        (cls, http://semanticscience.org/resource/SIO_000474)
        """
        return cls._namespace_SIO('SIO_000474')

    @classmethod
    def biological_quality(cls):
        """a biological quality is a quality held by a biological entity.
        (cls, http://semanticscience.org/resource/SIO_000475)
        """
        return cls._namespace_SIO('SIO_000475')

    @classmethod
    def cellular_quality(cls):
        """cellular quality is the quality of a cell
        (cls, http://semanticscience.org/resource/SIO_000476)
        """
        return cls._namespace_SIO('SIO_000476')

    @classmethod
    def sequence_variant_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000478)
        """
        return cls._namespace_SIO('SIO_000478')

    @classmethod
    def variant_role(cls):
        """a variant role is a comparative role in which the value of an attribute differs when compared to another entity
        (cls, http://semanticscience.org/resource/SIO_000479)
        """
        return cls._namespace_SIO('SIO_000479')

    @classmethod
    def insertion_variant_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000480)
        """
        return cls._namespace_SIO('SIO_000480')

    @classmethod
    def deletion_variant_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000481)
        """
        return cls._namespace_SIO('SIO_000481')

    @classmethod
    def phrase(cls):
        """A phrase is a group of words functioning as a single unit in the syntax of a sentence.
        (cls, http://semanticscience.org/resource/SIO_000483)
        """
        return cls._namespace_SIO('SIO_000483')

    @classmethod
    def human(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000485)
        """
        return cls._namespace_SIO('SIO_000485')

    @classmethod
    def mouse(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000486)
        """
        return cls._namespace_SIO('SIO_000486')

    @classmethod
    def rat(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000487)
        """
        return cls._namespace_SIO('SIO_000487')

    @classmethod
    def worm(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000488)
        """
        return cls._namespace_SIO('SIO_000488')

    @classmethod
    def e_coli(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000489)
        """
        return cls._namespace_SIO('SIO_000489')

    @classmethod
    def to_consume(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000492)
        """
        return cls._namespace_SIO('SIO_000492')

    @classmethod
    def clause(cls):
        """A clause consists of a subject and a predicate.
        (cls, http://semanticscience.org/resource/SIO_000493)
        """
        return cls._namespace_SIO('SIO_000493')

    @classmethod
    def to_actively_interact_with(cls):
        """to actively interact with is the capability to interact with another entity in a way that requires physical contact.
        (cls, http://semanticscience.org/resource/SIO_000494)
        """
        return cls._namespace_SIO('SIO_000494')

    @classmethod
    def person(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000498)
        """
        return cls._namespace_SIO('SIO_000498')

    @classmethod
    def to_decrease_the_rate_of_formation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000499)
        """
        return cls._namespace_SIO('SIO_000499')

    @classmethod
    def polygon_vertex(cls):
        """A polygon vertex is a terminal point at which two polygon edges meet and are part of a polygon.
        (cls, http://semanticscience.org/resource/SIO_000500)
        """
        return cls._namespace_SIO('SIO_000500')

    @classmethod
    def polygon_edge(cls):
        """A polygon edge is a line segment joining two polygon vertices.
        (cls, http://semanticscience.org/resource/SIO_000501)
        """
        return cls._namespace_SIO('SIO_000501')

    @classmethod
    def polyhedral_skeleton(cls):
        """A polyhedral skeleton is a collection of polygon edges.
        (cls, http://semanticscience.org/resource/SIO_000502)
        """
        return cls._namespace_SIO('SIO_000502')

    @classmethod
    def polygonal_face(cls):
        """A polygonal face is a polygon bounded by a circuit of polygon edges, and includes the flat (cls, plane) region inside the boundary.
        (http://semanticscience.org/resource/SIO_000503)
        """
        return cls._namespace_SIO('SIO_000503')

    @classmethod
    def polyhedral_surface(cls):
        """A polyhedral surface is composed of polygonal faces.
        (cls, http://semanticscience.org/resource/SIO_000504)
        """
        return cls._namespace_SIO('SIO_000504')

    @classmethod
    def polygon(cls):
        """A polygon is a planar entity that is bounded by a closed path or circuit, composed of a finite connected sequence3 of straight line segments.
        (cls, http://semanticscience.org/resource/SIO_000505)
        """
        return cls._namespace_SIO('SIO_000505')

    @classmethod
    def geometric_entity(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000506)
        """
        return cls._namespace_SIO('SIO_000506')

    @classmethod
    def point(cls):
        """A point is a geometric entity that is located in a zero-dimensional spatial region and whose position is defined by its coordinates in some coordinate system.
        (cls, http://semanticscience.org/resource/SIO_000507)
        """
        return cls._namespace_SIO('SIO_000507')

    @classmethod
    def endpoint(cls):
        """An endpoint is a terminal point that is the last of an ordered
        pair of points.
        (cls, http://semanticscience.org/resource/SIO_000508)
        """
        return cls._namespace_SIO('SIO_000508')

    @classmethod
    def start_point(cls):
        """A start point is a terminal point which is the first of an ordered
        pair of points.
        (cls, http://semanticscience.org/resource/SIO_000509)
        """
        return cls._namespace_SIO('SIO_000509')

    @classmethod
    def model(cls):
        """A model is a representation of some thing.
        (cls, http://semanticscience.org/resource/SIO_000510)
        """
        return cls._namespace_SIO('SIO_000510')

    @classmethod
    def line(cls):
        """A line is curve that extends in a single dimension (cls, e.g. straight line; exhibits no curvature), and is composed of at least two fully connected points.
        (http://semanticscience.org/resource/SIO_000511)
        """
        return cls._namespace_SIO('SIO_000511')

    @classmethod
    def line_segment(cls):
        """A line segment is a line and a part of a curve that is (cls, inclusively) bounded by two terminal points.
        (http://semanticscience.org/resource/SIO_000512)
        """
        return cls._namespace_SIO('SIO_000512')

    @classmethod
    def tick_mark(cls):
        """A tick mark is a line segment that is spatially positioned perpendicular to the axis of a statistical graph and indicates the position of a specific numeric value (cls, which may be indicated by an adjacent value label) on a value axis, or is one of a pair of tick marks that delineates the boundary of a categorical value (which may be indicated by an adjacent category label) on the categorical axis.
        (http://semanticscience.org/resource/SIO_000513)
        """
        return cls._namespace_SIO('SIO_000513')

    @classmethod
    def major_tick_mark(cls):
        """A major tick mark is a tick mark that indicates the position of a
        specific numeric value and is adjacent to its value label on the value
        axis, or is one of a pair of tick marks that delineates the boundary of a
        categorical value indicated by an adjacent category label on the
        categorical axis.
        (cls, http://semanticscience.org/resource/SIO_000514)
        """
        return cls._namespace_SIO('SIO_000514')

    @classmethod
    def minor_tick_mark(cls):
        """A minor tick mark is a tick mark that indicates the position of a specific numeric value but has no adjacent value label, or is one of a pair of tick marks that delineates the boundary of a categorical value but has no adjacent category label on the categorical axis.
        (cls, http://semanticscience.org/resource/SIO_000515)
        """
        return cls._namespace_SIO('SIO_000515')

    @classmethod
    def ray(cls):
        """A ray is a line which that is bounded by a startpoint and extends outwards infinitely along one dimension.
        (cls, http://semanticscience.org/resource/SIO_000516)
        """
        return cls._namespace_SIO('SIO_000516')

    @classmethod
    def quadrilateral(cls):
        """A quadrilateral is a polygon with composed of four points and four line segments, in which each point is fully connected to two other points.
        (cls, http://semanticscience.org/resource/SIO_000517)
        """
        return cls._namespace_SIO('SIO_000517')

    @classmethod
    def rectangle(cls):
        """A rectangle is a quadrilateral in which one pair of line segments are  parallel and the other pair are perpendicular to the first pair.
        (cls, http://semanticscience.org/resource/SIO_000518)
        """
        return cls._namespace_SIO('SIO_000518')

    @classmethod
    def bar(cls):
        """A bar is a rectangle that is located in the plot of a statistical graph in which its length is proportional to the values that it represents.
        (cls, http://semanticscience.org/resource/SIO_000519)
        """
        return cls._namespace_SIO('SIO_000519')

    @classmethod
    def triangle(cls):
        """A triangle is a polygon composed of three points and three line segments, in which each point is fully connected to another point along through the line segment.
        (cls, http://semanticscience.org/resource/SIO_000520)
        """
        return cls._namespace_SIO('SIO_000520')

    @classmethod
    def directed_line_segment(cls):
        """A directed line segment is a line segment that is contained by an ordered pair
        of endpoints (cls, a start point and an endpoint).
        (http://semanticscience.org/resource/SIO_000521)
        """
        return cls._namespace_SIO('SIO_000521')

    @classmethod
    def arrowed_line_segment(cls):
        """An arrowed line is a directed line segment in which one or both endpoints is tangentially part of a triangle that bisects the line.
        (cls, http://semanticscience.org/resource/SIO_000522)
        """
        return cls._namespace_SIO('SIO_000522')

    @classmethod
    def single_arrowed_line_segment(cls):
        """A single arrowed line is directed line in which the endpoint is tangentially part of a triangle that bisects the line.
        (cls, http://semanticscience.org/resource/SIO_000523)
        """
        return cls._namespace_SIO('SIO_000523')

    @classmethod
    def double_arrowed_line_segment(cls):
        """A double arrowed line is an arrowed line in which both terminal points are  tangentially part of different triangles that bisect the line.
        (cls, http://semanticscience.org/resource/SIO_000524)
        """
        return cls._namespace_SIO('SIO_000524')

    @classmethod
    def horizontal_line(cls):
        """A vertical line is a line that is positionally oriented with the horizon.
        (cls, http://semanticscience.org/resource/SIO_000525)
        """
        return cls._namespace_SIO('SIO_000525')

    @classmethod
    def vertical_line(cls):
        """A vertical line is a line that is positionally oriented perpendicular to the horizon.
        (cls, http://semanticscience.org/resource/SIO_000526)
        """
        return cls._namespace_SIO('SIO_000526')

    @classmethod
    def trend_line(cls):
        """A trend line is a line, line segment or ray that is part of a statistical graph which indicates a statistical or visual direction across categorical or value data.
        (cls, http://semanticscience.org/resource/SIO_000527)
        """
        return cls._namespace_SIO('SIO_000527')

    @classmethod
    def increasing_line(cls):
        """An increasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is positive.
        (cls, http://semanticscience.org/resource/SIO_000528)
        """
        return cls._namespace_SIO('SIO_000528')

    @classmethod
    def decreasing_line(cls):
        """An decreasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is negative.
        (cls, http://semanticscience.org/resource/SIO_000529)
        """
        return cls._namespace_SIO('SIO_000529')

    @classmethod
    def plateau_line(cls):
        """An plateau line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is zero.
        (cls, http://semanticscience.org/resource/SIO_000530)
        """
        return cls._namespace_SIO('SIO_000530')

    @classmethod
    def drop_line(cls):
        """A drop line is a statistical graph line that vertically or horizontally connects a data series line with a value axis in a statistical graph.
        (cls, http://semanticscience.org/resource/SIO_000531)
        """
        return cls._namespace_SIO('SIO_000531')

    @classmethod
    def terminal_point(cls):
        """A terminal point is a point that defines the finite extension of a line.
        (cls, http://semanticscience.org/resource/SIO_000532)
        """
        return cls._namespace_SIO('SIO_000532')

    @classmethod
    def surface_normal(cls):
        """A surface normal is a vector that is perpendicular to a flat surface.
        (cls, http://semanticscience.org/resource/SIO_000533)
        """
        return cls._namespace_SIO('SIO_000533')

    @classmethod
    def positionally_oriented_line(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000534)
        """
        return cls._namespace_SIO('SIO_000534')

    @classmethod
    def statistical_graph_line(cls):
        """A statistical graph line is a line used in a statistical graph to communicate some trend or feature of the embedded data.
        (cls, http://semanticscience.org/resource/SIO_000535)
        """
        return cls._namespace_SIO('SIO_000535')

    @classmethod
    def to_regulate_the_rate_of_formation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000536)
        """
        return cls._namespace_SIO('SIO_000536')

    @classmethod
    def curvature(cls):
        """curvature is a quality of a bearer that relates to the presence of curves, bends, or angles.
        (cls, http://semanticscience.org/resource/SIO_000537)
        """
        return cls._namespace_SIO('SIO_000537')

    @classmethod
    def straight(cls):
        """shape is a quality of a bearer that is free of curves, bends, or angles.
        (cls, http://semanticscience.org/resource/SIO_000538)
        """
        return cls._namespace_SIO('SIO_000538')

    @classmethod
    def infinite_line(cls):
        """An infinite line is a line that extends outwards in both directions of a single dimensional and is not bounded by terminal points.
        (cls, http://semanticscience.org/resource/SIO_000539)
        """
        return cls._namespace_SIO('SIO_000539')

    @classmethod
    def vector(cls):
        """A ray is a line which that is bounded by a startpoint and extends outwards along one dimension.
        (cls, http://semanticscience.org/resource/SIO_000540)
        """
        return cls._namespace_SIO('SIO_000540')

    @classmethod
    def vertex_normal(cls):
        """A vertext normal is the normalized average of the surface normals of the faces that contain that vertex.
        (cls, http://semanticscience.org/resource/SIO_000541)
        """
        return cls._namespace_SIO('SIO_000541')

    @classmethod
    def to_serve_as(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000542)
        """
        return cls._namespace_SIO('SIO_000542')

    @classmethod
    def to_serve_as_a_host(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000543)
        """
        return cls._namespace_SIO('SIO_000543')

    @classmethod
    def to_infect(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000544)
        """
        return cls._namespace_SIO('SIO_000544')

    @classmethod
    def polyline(cls):
        """A polyline is a connected sequence of line segments.
        (cls, http://semanticscience.org/resource/SIO_000545)
        """
        return cls._namespace_SIO('SIO_000545')

    @classmethod
    def polygonal_chain_polygonal_curve_polygonal_path_piecewise_linear_curve(cls):
        """A polyline is a connected sequence of line segments.
        (cls, http://semanticscience.org/resource/SIO_000545)
        """
        return cls._namespace_SIO('SIO_000545')

    @classmethod
    def collection_of_points(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000546)
        """
        return cls._namespace_SIO('SIO_000546')

    @classmethod
    def to_cause_disease(cls):
        """to cause disease is the capability to materially change a biological object in that it functions abnormally.
        (cls, http://semanticscience.org/resource/SIO_000547)
        """
        return cls._namespace_SIO('SIO_000547')

    @classmethod
    def to_reduce_the_activation_energy(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000549)
        """
        return cls._namespace_SIO('SIO_000549')

    @classmethod
    def to_activate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000549)
        """
        return cls._namespace_SIO('SIO_000549')

    @classmethod
    def to_increase_the_activation_energy(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000550)
        """
        return cls._namespace_SIO('SIO_000550')

    @classmethod
    def to_inhibit(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000550)
        """
        return cls._namespace_SIO('SIO_000550')

    @classmethod
    def to_change_the_activation_energy(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000551)
        """
        return cls._namespace_SIO('SIO_000551')

    @classmethod
    def normal(cls):
        """A quality that has a value that is normal or average.
        (cls, http://semanticscience.org/resource/SIO_000554)
        """
        return cls._namespace_SIO('SIO_000554')

    @classmethod
    def abnormal(cls):
        """A quality that has a value that is outside normal or average.
        (cls, http://semanticscience.org/resource/SIO_000555)
        """
        return cls._namespace_SIO('SIO_000555')

    @classmethod
    def lipid_residue(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000556)
        """
        return cls._namespace_SIO('SIO_000556')

    @classmethod
    def chemical_synthesis(cls):
        """Chemical synthesis is synthesis of a chemical entity from physical precursors through one or more chemical interactions or reactions.
        (cls, http://semanticscience.org/resource/SIO_000559)
        """
        return cls._namespace_SIO('SIO_000559')

    @classmethod
    def molecular_orbitral(cls):
        """a molecular orbital (cls, or MO) is a mathematical function describing the wave-like behavior of an electron in a molecule
        (http://semanticscience.org/resource/SIO_000561)
        """
        return cls._namespace_SIO('SIO_000561')

    @classmethod
    def passive_transport(cls):
        """Passive transport is the movement of a substance across a membrane and does not require chemical energy.
        (cls, http://semanticscience.org/resource/SIO_000562)
        """
        return cls._namespace_SIO('SIO_000562')

    @classmethod
    def diffusion(cls):
        """Diffusion is motion of particles at temperatures above absolute zero.
        (cls, http://semanticscience.org/resource/SIO_000564)
        """
        return cls._namespace_SIO('SIO_000564')

    @classmethod
    def diffusion_equation(cls):
        """A diffusion equation describes density fluctuations in a material undergoing diffusion.
        (cls, http://semanticscience.org/resource/SIO_000565)
        """
        return cls._namespace_SIO('SIO_000565')

    @classmethod
    def movement_equation(cls):
        """a movement equation describes the displacement of an object in space over time.
        (cls, http://semanticscience.org/resource/SIO_000566)
        """
        return cls._namespace_SIO('SIO_000566')

    @classmethod
    def ordinary_differential_equation(cls):
        """An ordinary differential equation (cls, ODE) is a differential equation in which the unknown function (also known as the dependent variable) is a function of a single independent variable.
        (http://semanticscience.org/resource/SIO_000567)
        """
        return cls._namespace_SIO('SIO_000567')

    @classmethod
    def partial_differential_equation(cls):
        """A partial differential equation (cls, PDE) is a differential equation in which the unknown function is a function of multiple independent variables and the equation involves its partial derivatives.
        (http://semanticscience.org/resource/SIO_000568)
        """
        return cls._namespace_SIO('SIO_000568')

    @classmethod
    def differential_equation(cls):
        """A differential equation is a mathematical equation for an unknown function of one or several variables that relates the values of the function itself and its derivatives of various orders.
        (cls, http://semanticscience.org/resource/SIO_000569)
        """
        return cls._namespace_SIO('SIO_000569')

    @classmethod
    def movement(cls):
        """Movement is the process in which an object is spatially displaced.
        (cls, http://semanticscience.org/resource/SIO_000570)
        """
        return cls._namespace_SIO('SIO_000570')

    @classmethod
    def brownian_motion(cls):
        """Brownian motion is the seemlingly random movement of particles suspended in a fluid.
        (cls, http://semanticscience.org/resource/SIO_000571)
        """
        return cls._namespace_SIO('SIO_000571')

    @classmethod
    def osmosis(cls):
        """Osmosis is the movement of water molecules through a selectively-permeable membrane down a water potential gradient.
        (cls, http://semanticscience.org/resource/SIO_000572)
        """
        return cls._namespace_SIO('SIO_000572')

    @classmethod
    def passive_movement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000573)
        """
        return cls._namespace_SIO('SIO_000573')

    @classmethod
    def active_movement(cls):
        """Active movement is the process in which an object is spatially displaced using some chemical energy.
        (cls, http://semanticscience.org/resource/SIO_000574)
        """
        return cls._namespace_SIO('SIO_000574')

    @classmethod
    def transport(cls):
        """Transport is an interaction that realizes the role a transporter and a cargo and results in the movement of at least the cargo.
        (cls, http://semanticscience.org/resource/SIO_000575)
        """
        return cls._namespace_SIO('SIO_000575')

    @classmethod
    def membrane_transport(cls):
        """membrane transport is the movement of molecules across a membrane.
        (cls, http://semanticscience.org/resource/SIO_000576)
        """
        return cls._namespace_SIO('SIO_000576')

    @classmethod
    def primary_active_transport(cls):
        """Primary active transport, also called direct active transport, directly uses energy to transport molecules across a membrane.
        (cls, http://semanticscience.org/resource/SIO_000577)
        """
        return cls._namespace_SIO('SIO_000577')

    @classmethod
    def secondary_active_transport(cls):
        """secondary active transport or co-transport uses electrochemical potential difference created by pumping ions out of the cell to transport molecules across a membrane.
        (cls, http://semanticscience.org/resource/SIO_000578)
        """
        return cls._namespace_SIO('SIO_000578')

    @classmethod
    def symport_enabled_secondary_active_transport(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000579)
        """
        return cls._namespace_SIO('SIO_000579')

    @classmethod
    def antiport_enabled_secondary_active_transport(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000580)
        """
        return cls._namespace_SIO('SIO_000580')

    @classmethod
    def locomotion(cls):
        """The self-propelled movement of an object.
        (cls, http://semanticscience.org/resource/SIO_000581)
        """
        return cls._namespace_SIO('SIO_000581')

    @classmethod
    def birth(cls):
        """Birth is the process by which a biological organism is brought into existence.
        (cls, http://semanticscience.org/resource/SIO_000582)
        """
        return cls._namespace_SIO('SIO_000582')

    @classmethod
    def death(cls):
        """Death is a process in which a biological entity ceases to exist.
        (cls, http://semanticscience.org/resource/SIO_000583)
        """
        return cls._namespace_SIO('SIO_000583')

    @classmethod
    def idea(cls):
        """An idea is a proposition about some object of conceptual thought.
        (cls, http://semanticscience.org/resource/SIO_000585)
        """
        return cls._namespace_SIO('SIO_000585')

    @classmethod
    def biological_reproduction(cls):
        """Biological reproduction is the biological process by which one or more biological organisms are produced from their "parents".
        (cls, http://semanticscience.org/resource/SIO_000587)
        """
        return cls._namespace_SIO('SIO_000587')

    @classmethod
    def creation(cls):
        """creation is a process in which an entity comes into existence.
        (cls, http://semanticscience.org/resource/SIO_000588)
        """
        return cls._namespace_SIO('SIO_000588')

    @classmethod
    def production(cls):
        """creation is a process in which an entity comes into existence.
        (cls, http://semanticscience.org/resource/SIO_000588)
        """
        return cls._namespace_SIO('SIO_000588')

    @classmethod
    def regulation(cls):
        """regulation is a process that modulates the attributes of an object or process.
        (cls, http://semanticscience.org/resource/SIO_000589)
        """
        return cls._namespace_SIO('SIO_000589')

    @classmethod
    def biosynthesis(cls):
        """Biosynthesis is the synthesis of an organic compound in a living organism, usually aided by enzymes.
        (cls, http://semanticscience.org/resource/SIO_000590)
        """
        return cls._namespace_SIO('SIO_000590')

    @classmethod
    def destruction(cls):
        """destruction is a process in which something is broken down and/or ceases to exist.
        (cls, http://semanticscience.org/resource/SIO_000591)
        """
        return cls._namespace_SIO('SIO_000591')

    @classmethod
    def chemical_destruction(cls):
        """Chemical destruction is destruction of a chemical entity to its chemical constituents through one ormore chemical interactions or reactions.
        (cls, http://semanticscience.org/resource/SIO_000592)
        """
        return cls._namespace_SIO('SIO_000592')

    @classmethod
    def interaction(cls):
        """an interaction is a process that involves two or more entities and the realization of at least two dispositions to interact.
        (cls, http://semanticscience.org/resource/SIO_000593)
        """
        return cls._namespace_SIO('SIO_000593')

    @classmethod
    def data_transformation(cls):
        """data transformation is the process of applying an algorithmic procedure to some input data and producing some output data.
        (cls, http://semanticscience.org/resource/SIO_000594)
        """
        return cls._namespace_SIO('SIO_000594')

    @classmethod
    def parameterized_data_transformation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000595)
        """
        return cls._namespace_SIO('SIO_000595')

    @classmethod
    def data_storage_device(cls):
        """a data storage device is a device that is capable of storing information.
        (cls, http://semanticscience.org/resource/SIO_000596)
        """
        return cls._namespace_SIO('SIO_000596')

    @classmethod
    def solid_state_hard_drive(cls):
        """A solid-state drive (cls, SSD) is a data storage device that uses solid-state memory to store persistent data
        (http://semanticscience.org/resource/SIO_000597)
        """
        return cls._namespace_SIO('SIO_000597')

    @classmethod
    def hard_disk_drive(cls):
        """A hard disk drive (cls, HDD) is a non-volatile, random access device for digital data. It features rotating rigid platters on a motor-driven spindle within a protective enclosure. Data is magnetically read and written on the platter by read/write heads that float on a film of air above the platters.
        (http://semanticscience.org/resource/SIO_000598)
        """
        return cls._namespace_SIO('SIO_000598')

    @classmethod
    def structure(cls):
        """structure is the specification that refers to the composition and arrangement of parts of an object.
        (cls, http://semanticscience.org/resource/SIO_000600)
        """
        return cls._namespace_SIO('SIO_000600')

    @classmethod
    def computational_entity(cls):
        """a computational entity is an information content entity operated on using some computational system.
        (cls, http://semanticscience.org/resource/SIO_000602)
        """
        return cls._namespace_SIO('SIO_000602')

    @classmethod
    def sound_wave(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000605)
        """
        return cls._namespace_SIO('SIO_000605')

    @classmethod
    def curve(cls):
        """A curve is a geometric entity that may be located in n-dimensional spatial region whose extension may be n-dimensional,  is composed of at least two fully connected points and does not intersect itself.
        (cls, http://semanticscience.org/resource/SIO_000608)
        """
        return cls._namespace_SIO('SIO_000608')

    @classmethod
    def regulation_of_process(cls):
        """regulation of a process is a process that modulates the duration, frequency, spatial extent of a target process.
        (cls, http://semanticscience.org/resource/SIO_000609)
        """
        return cls._namespace_SIO('SIO_000609')

    @classmethod
    def regulation_of_capability(cls):
        """regulation of capability is the regulation of the ability of one party by another.
        (cls, http://semanticscience.org/resource/SIO_000610)
        """
        return cls._namespace_SIO('SIO_000610')

    @classmethod
    def regulation_of_catalytic_capability(cls):
        """the regulation of the enzymatic activity.
        (cls, http://semanticscience.org/resource/SIO_000611)
        """
        return cls._namespace_SIO('SIO_000611')

    @classmethod
    def representation(cls):
        """A representation is a entity that in some way represents another entity (cls, or attribute thereof).
        (http://semanticscience.org/resource/SIO_000612)
        """
        return cls._namespace_SIO('SIO_000612')

    @classmethod
    def ordinal_position(cls):
        """A ordinal position is a number that designates the position of an entity from the first entity in an ordered sequence of entities.
        (cls, http://semanticscience.org/resource/SIO_000613)
        """
        return cls._namespace_SIO('SIO_000613')

    @classmethod
    def offset(cls):
        """A ordinal position is a number that designates the position of an entity from the first entity in an ordered sequence of entities.
        (cls, http://semanticscience.org/resource/SIO_000613)
        """
        return cls._namespace_SIO('SIO_000613')

    @classmethod
    def attribute(cls):
        """an attribute is a characteristic of some entity.
        (cls, http://semanticscience.org/resource/SIO_000614)
        """
        return cls._namespace_SIO('SIO_000614')

    @classmethod
    def collection(cls):
        """A collection is a set for which there exists at least one member, although any member need not to exist at any point in the collection's existence.
        (cls, http://semanticscience.org/resource/SIO_000616)
        """
        return cls._namespace_SIO('SIO_000616')

    @classmethod
    def empty_set(cls):
        """An empty set is a set for which there are exactly 0 members.
        (cls, http://semanticscience.org/resource/SIO_000617)
        """
        return cls._namespace_SIO('SIO_000617')

    @classmethod
    def standard(cls):
        """a standard is a socially-agreed upon specification.
        (cls, http://semanticscience.org/resource/SIO_000618)
        """
        return cls._namespace_SIO('SIO_000618')

    @classmethod
    def regulatory_authority(cls):
        """A regulatory authority is an organization responsible for  exercising regulatory or supervisory capacity in some area of human activity.
        (cls, http://semanticscience.org/resource/SIO_000619)
        """
        return cls._namespace_SIO('SIO_000619')

    @classmethod
    def collective(cls):
        """A collective is a group of entities that share or are motivated by at least one common issue or interest, or work together on a specific project(cls, s) to achieve a common objective.
        (http://semanticscience.org/resource/SIO_000620)
        """
        return cls._namespace_SIO('SIO_000620')

    @classmethod
    def group(cls):
        """A collective is a group of entities that share or are motivated by at least one common issue or interest, or work together on a specific project(cls, s) to achieve a common objective.
        (http://semanticscience.org/resource/SIO_000620)
        """
        return cls._namespace_SIO('SIO_000620')

    @classmethod
    def formal_specification(cls):
        """A formal specification is a mathematical description of software or hardware that may be used to develop an implementation.
        (cls, http://semanticscience.org/resource/SIO_000621)
        """
        return cls._namespace_SIO('SIO_000621')

    @classmethod
    def RDFS_ontology(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000622)
        """
        return cls._namespace_SIO('SIO_000622')

    @classmethod
    def OBO_ontology(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000623)
        """
        return cls._namespace_SIO('SIO_000623')

    @classmethod
    def chemical_functional_group(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000624)
        """
        return cls._namespace_SIO('SIO_000624')

    @classmethod
    def chemical_structure(cls):
        """chemical structure is the structure of a chemical entity in terms of its molecular geometry and electronic structure.
        (cls, http://semanticscience.org/resource/SIO_000625)
        """
        return cls._namespace_SIO('SIO_000625')

    @classmethod
    def molecular_structure(cls):
        """Molecular structure is the spatial arrangement of atoms in a molecule and the chemical bonds that hold the atoms together.
        (cls, http://semanticscience.org/resource/SIO_000626)
        """
        return cls._namespace_SIO('SIO_000626')

    @classmethod
    def molecular_geometry(cls):
        """Molecular structure is the spatial arrangement of atoms in a molecule and the chemical bonds that hold the atoms together.
        (cls, http://semanticscience.org/resource/SIO_000626)
        """
        return cls._namespace_SIO('SIO_000626')

    @classmethod
    def probability_measure(cls):
        """a probability measure is quantity of how likely it is that some event will occur.
        (cls, http://semanticscience.org/resource/SIO_000638)
        """
        return cls._namespace_SIO('SIO_000638')

    @classmethod
    def to_passively_interact_with(cls):
        """to passively interact with is the capability to interact with another entity in a way that does not require physical contact.
        (cls, http://semanticscience.org/resource/SIO_000639)
        """
        return cls._namespace_SIO('SIO_000639')

    @classmethod
    def increased(cls):
        """A quality that has a value that is increased compared to normal or average.
        (cls, http://semanticscience.org/resource/SIO_000640)
        """
        return cls._namespace_SIO('SIO_000640')

    @classmethod
    def process_model(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000647)
        """
        return cls._namespace_SIO('SIO_000647')

    @classmethod
    def physical_model(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000648)
        """
        return cls._namespace_SIO('SIO_000648')

    @classmethod
    def information_processing_procedure(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000649)
        """
        return cls._namespace_SIO('SIO_000649')

    @classmethod
    def wave(cls):
        """A wave is a physical entity that travels through space and time, consist of oscillations or vibrations and may be accompanied by the transfer of energy.
        (cls, http://semanticscience.org/resource/SIO_000650)
        """
        return cls._namespace_SIO('SIO_000650')

    @classmethod
    def textual_entity(cls):
        """A textual entity is language entity that is manifested as one or more distinct characters.
        (cls, http://semanticscience.org/resource/SIO_000651)
        """
        return cls._namespace_SIO('SIO_000651')

    @classmethod
    def version_label(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000653)
        """
        return cls._namespace_SIO('SIO_000653')

    @classmethod
    def a_version_label_is_a_label_for_a_particular_form_or_variation_of_an_earlier_or_original_type(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000653)
        """
        return cls._namespace_SIO('SIO_000653')

    @classmethod
    def software_version_label(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000654)
        """
        return cls._namespace_SIO('SIO_000654')

    @classmethod
    def a_software_version_label_is_a_version_label_for_a_piece_of_software(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000654)
        """
        return cls._namespace_SIO('SIO_000654')

    @classmethod
    def hole(cls):
        """a hole is a site that is opening into or through something.
        (cls, http://semanticscience.org/resource/SIO_000660)
        """
        return cls._namespace_SIO('SIO_000660')

    @classmethod
    def province(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000661)
        """
        return cls._namespace_SIO('SIO_000661')

    @classmethod
    def state(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000662)
        """
        return cls._namespace_SIO('SIO_000662')

    @classmethod
    def territory(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000663)
        """
        return cls._namespace_SIO('SIO_000663')

    @classmethod
    def country(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000664)
        """
        return cls._namespace_SIO('SIO_000664')

    @classmethod
    def city(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000665)
        """
        return cls._namespace_SIO('SIO_000665')

    @classmethod
    def township(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000666)
        """
        return cls._namespace_SIO('SIO_000666')

    @classmethod
    def sofware_execution(cls):
        """software execution is the process of executing software on a computing device.
        (cls, http://semanticscience.org/resource/SIO_000667)
        """
        return cls._namespace_SIO('SIO_000667')

    @classmethod
    def start_time(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000669)
        """
        return cls._namespace_SIO('SIO_000669')

    @classmethod
    def end_time(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000670)
        """
        return cls._namespace_SIO('SIO_000670')

    @classmethod
    def unique_identifier(cls):
        """a unique identifier is an identifier that uniquely identifies some thing.
        (cls, http://semanticscience.org/resource/SIO_000675)
        """
        return cls._namespace_SIO('SIO_000675')

    @classmethod
    def social_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000676)
        """
        return cls._namespace_SIO('SIO_000676')

    @classmethod
    def processual_role(cls):
        """a processual role is a role that can only be realized in a process.
        (cls, http://semanticscience.org/resource/SIO_000677)
        """
        return cls._namespace_SIO('SIO_000677')

    @classmethod
    def abstract_role(cls):
        """an abstract role is a role whose basis lies in spatial/temporal or comparative relations.
        (cls, http://semanticscience.org/resource/SIO_000678)
        """
        return cls._namespace_SIO('SIO_000678')

    @classmethod
    def justification(cls):
        """A justification is a proposition that defends, explains or excuses some argument.
        (cls, http://semanticscience.org/resource/SIO_000683)
        """
        return cls._namespace_SIO('SIO_000683')

    @classmethod
    def department(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000686)
        """
        return cls._namespace_SIO('SIO_000686')

    @classmethod
    def institute(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000688)
        """
        return cls._namespace_SIO('SIO_000688')

    @classmethod
    def to_be_a_part_of(cls):
        """to be a part of is the capability to be assembled into a larger structure that persists in time.
        (cls, http://semanticscience.org/resource/SIO_000689)
        """
        return cls._namespace_SIO('SIO_000689')

    @classmethod
    def to_associate(cls):
        """To associate is the capability to physically interact with another object.
        (cls, http://semanticscience.org/resource/SIO_000690)
        """
        return cls._namespace_SIO('SIO_000690')

    @classmethod
    def to_be_actively_interacted_with(cls):
        """to be actively interacted with is the capability to be manipulated by some device or agent.
        (cls, http://semanticscience.org/resource/SIO_000692)
        """
        return cls._namespace_SIO('SIO_000692')

    @classmethod
    def corporation(cls):
        """A corporation is an organization that is granted a charter recognizing it as a separate legal entity.
        (cls, http://semanticscience.org/resource/SIO_000693)
        """
        return cls._namespace_SIO('SIO_000693')

    @classmethod
    def to_be_passively_interacted_with(cls):
        """to be passively interacted with is the capability of an object to be observed.
        (cls, http://semanticscience.org/resource/SIO_000694)
        """
        return cls._namespace_SIO('SIO_000694')

    @classmethod
    def to_be_recorded(cls):
        """to be recorded is the capability of an object to be observed in such a way that information about it can be transcribed in a specified format on some physical medium.
        (cls, http://semanticscience.org/resource/SIO_000695)
        """
        return cls._namespace_SIO('SIO_000695')

    @classmethod
    def to_be_observed(cls):
        """to be observed is the capability of an object to be perceived.
        (cls, http://semanticscience.org/resource/SIO_000696)
        """
        return cls._namespace_SIO('SIO_000696')

    @classmethod
    def to_disassemble(cls):
        """to disassemble is to physically separate the parts of an object.
        (cls, http://semanticscience.org/resource/SIO_000698)
        """
        return cls._namespace_SIO('SIO_000698')

    @classmethod
    def to_disassociate(cls):
        """to disassociate is to cease or break association with some thing.
        (cls, http://semanticscience.org/resource/SIO_000700)
        """
        return cls._namespace_SIO('SIO_000700')

    @classmethod
    def to_interact_with(cls):
        """to interact with is a capabililty that involves another object.
        (cls, http://semanticscience.org/resource/SIO_000701)
        """
        return cls._namespace_SIO('SIO_000701')

    @classmethod
    def to_be_interacted_with(cls):
        """to be interacted with is the capability of an object to be target of a physical interaction.
        (cls, http://semanticscience.org/resource/SIO_000702)
        """
        return cls._namespace_SIO('SIO_000702')

    @classmethod
    def evolution(cls):
        """Evolution is the process that elicits change across successive generations in the inherited characteristics of biological populations.
        (cls, http://semanticscience.org/resource/SIO_000703)
        """
        return cls._namespace_SIO('SIO_000703')

    @classmethod
    def positional_role(cls):
        """a positional role is an abstract role which holds by comparing position to another object of reference.
        (cls, http://semanticscience.org/resource/SIO_000704)
        """
        return cls._namespace_SIO('SIO_000704')

    @classmethod
    def design(cls):
        """a specification of an object, manifested by an agent, intended to accomplish goals, in a particular environment, using a set of primitive components, satisfying a set of requirements, subject to constraints.
        (cls, http://semanticscience.org/resource/SIO_000705)
        """
        return cls._namespace_SIO('SIO_000705')

    @classmethod
    def occupational_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000706)
        """
        return cls._namespace_SIO('SIO_000706')

    @classmethod
    def student_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000707)
        """
        return cls._namespace_SIO('SIO_000707')

    @classmethod
    def professor_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000708)
        """
        return cls._namespace_SIO('SIO_000708')

    @classmethod
    def academic_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000711)
        """
        return cls._namespace_SIO('SIO_000711')

    @classmethod
    def medical_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000712)
        """
        return cls._namespace_SIO('SIO_000712')

    @classmethod
    def doctor_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000713)
        """
        return cls._namespace_SIO('SIO_000713')

    @classmethod
    def nurse_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000714)
        """
        return cls._namespace_SIO('SIO_000714')

    @classmethod
    def patient_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000715)
        """
        return cls._namespace_SIO('SIO_000715')

    @classmethod
    def medical_practitioner(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000716)
        """
        return cls._namespace_SIO('SIO_000716')

    @classmethod
    def dentist_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000717)
        """
        return cls._namespace_SIO('SIO_000717')

    @classmethod
    def to_translocate(cls):
        """to translocate is the capability to displace oneself from one location to another.
        (cls, http://semanticscience.org/resource/SIO_000719)
        """
        return cls._namespace_SIO('SIO_000719')

    @classmethod
    def to_move(cls):
        """to translocate is the capability to displace oneself from one location to another.
        (cls, http://semanticscience.org/resource/SIO_000719)
        """
        return cls._namespace_SIO('SIO_000719')

    @classmethod
    def to_be_translocated(cls):
        """to be translocated is the capability to be physically displaced from one location to another
        (cls, http://semanticscience.org/resource/SIO_000720)
        """
        return cls._namespace_SIO('SIO_000720')

    @classmethod
    def to_be_moved(cls):
        """to be translocated is the capability to be physically displaced from one location to another
        (cls, http://semanticscience.org/resource/SIO_000720)
        """
        return cls._namespace_SIO('SIO_000720')

    @classmethod
    def comparative_role(cls):
        """a comparative role is an abstract role which holds by comparing some attribute of another object of reference.
        (cls, http://semanticscience.org/resource/SIO_000721)
        """
        return cls._namespace_SIO('SIO_000721')

    @classmethod
    def to_be_compared(cls):
        """to be compared is the capability of an object to be examined in order to note the similarities or differences among a set of objects.
        (cls, http://semanticscience.org/resource/SIO_000722)
        """
        return cls._namespace_SIO('SIO_000722')

    @classmethod
    def to_compare(cls):
        """to compare is the capability to examine in order to note the similarities or differences among a set of objects.
        (cls, http://semanticscience.org/resource/SIO_000723)
        """
        return cls._namespace_SIO('SIO_000723')

    @classmethod
    def to_examine(cls):
        """to examine is the capability to make detailed observation.
        (cls, http://semanticscience.org/resource/SIO_000724)
        """
        return cls._namespace_SIO('SIO_000724')

    @classmethod
    def to_be_examined(cls):
        """to be examined is the capability of an object to be observed in a detailed manner.
        (cls, http://semanticscience.org/resource/SIO_000725)
        """
        return cls._namespace_SIO('SIO_000725')

    @classmethod
    def administrative_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000726)
        """
        return cls._namespace_SIO('SIO_000726')

    @classmethod
    def secretary_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000727)
        """
        return cls._namespace_SIO('SIO_000727')

    @classmethod
    def chemical_identifier(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000728)
        """
        return cls._namespace_SIO('SIO_000728')

    @classmethod
    def record_identifier(cls):
        """a record identifier is an identifier for a database entry.
        (cls, http://semanticscience.org/resource/SIO_000729)
        """
        return cls._namespace_SIO('SIO_000729')

    @classmethod
    def physical_entity_identifier(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000730)
        """
        return cls._namespace_SIO('SIO_000730')

    @classmethod
    def informational_entity_identifier(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000731)
        """
        return cls._namespace_SIO('SIO_000731')

    @classmethod
    def molecular_identifier(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000732)
        """
        return cls._namespace_SIO('SIO_000732')

    @classmethod
    def planning(cls):
        """Planning is the agentive process of developing a plan that specifies a set of actions in order to meet a set of goals or objectives.
        (cls, http://semanticscience.org/resource/SIO_000739)
        """
        return cls._namespace_SIO('SIO_000739')

    @classmethod
    def curve_segment(cls):
        """a curve segment is a part of a curve that consists of at least three points.
        (cls, http://semanticscience.org/resource/SIO_000740)
        """
        return cls._namespace_SIO('SIO_000740')

    @classmethod
    def stationary_point(cls):
        """a stationary point is a point that is part of a curve in which the derivative at that point is zero, and hence its value is at least a local maximum or minimum.
        (cls, http://semanticscience.org/resource/SIO_000741)
        """
        return cls._namespace_SIO('SIO_000741')

    @classmethod
    def local_maximum_stationary_point(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000742)
        """
        return cls._namespace_SIO('SIO_000742')

    @classmethod
    def local_minimum_stationary_point(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000743)
        """
        return cls._namespace_SIO('SIO_000743')

    @classmethod
    def learning(cls):
        """learning is the agentive process of acquiring knowledge.
        (cls, http://semanticscience.org/resource/SIO_000744)
        """
        return cls._namespace_SIO('SIO_000744')

    @classmethod
    def comparison(cls):
        """comparison is the process of examining a set of objects and determining their equality or inequality based on one or more features.
        (cls, http://semanticscience.org/resource/SIO_000745)
        """
        return cls._namespace_SIO('SIO_000745')

    @classmethod
    def reasoning(cls):
        """reasoning is the agentive process of using knowledge to evaluate the truth value of a proposition.
        (cls, http://semanticscience.org/resource/SIO_000746)
        """
        return cls._namespace_SIO('SIO_000746')

    @classmethod
    def investigation(cls):
        """investigation is the process of carrying out a plan or procedure so as to discover facts or information about the object of study.
        (cls, http://semanticscience.org/resource/SIO_000747)
        """
        return cls._namespace_SIO('SIO_000747')

    @classmethod
    def study(cls):
        """Either:
            investigation is the process of carrying out a plan or procedure so as to discover facts or information about the object of study.
            (cls, http://semanticscience.org/resource/SIO_000747)
        Or:
            An experiment is an investigation that has the goal of verifying, falsifying, or establishing the validity of a hypothesis.
            (http://semanticscience.org/resource/SIO_000994)
        """
        return [ cls._namespace_SIO('SIO_000747'), cls._namespace_SIO('SIO_000994') ]

    @classmethod
    def prediction(cls):
        """prediction is the process of formulating a proposition about a state of affairs which might be realized in the future.
        (cls, http://semanticscience.org/resource/SIO_000748)
        """
        return cls._namespace_SIO('SIO_000748')

    @classmethod
    def database(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000750)
        """
        return cls._namespace_SIO('SIO_000750')

    @classmethod
    def decreased(cls):
        """A quality that has a value that is decreased compared to normal or average.
        (cls, http://semanticscience.org/resource/SIO_000751)
        """
        return cls._namespace_SIO('SIO_000751')

    @classmethod
    def row(cls):
        """A row represents a single, implicitly structured data item in a table.
        (cls, http://semanticscience.org/resource/SIO_000752)
        """
        return cls._namespace_SIO('SIO_000752')

    @classmethod
    def column(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000753)
        """
        return cls._namespace_SIO('SIO_000753')

    @classmethod
    def database_table(cls):
        """a database table is a set of named columns with zero or more rows composed of cells that contain column values and is part of a database.
        (cls, http://semanticscience.org/resource/SIO_000754)
        """
        return cls._namespace_SIO('SIO_000754')

    @classmethod
    def cell_informational(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000755)
        """
        return cls._namespace_SIO('SIO_000755')

    @classmethod
    def database_entry(cls):
        """A database entry is a single, implicitly structured data item in a table.
        (cls, http://semanticscience.org/resource/SIO_000756)
        """
        return cls._namespace_SIO('SIO_000756')

    @classmethod
    def database_record(cls):
        """A database entry is a single, implicitly structured data item in a table.
        (cls, http://semanticscience.org/resource/SIO_000756)
        """
        return cls._namespace_SIO('SIO_000756')

    @classmethod
    def database_column(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000757)
        """
        return cls._namespace_SIO('SIO_000757')

    @classmethod
    def disordered(cls):
        """disordered is a structural quality in which the parts of an object are non-rigid.
        (cls, http://semanticscience.org/resource/SIO_000758)
        """
        return cls._namespace_SIO('SIO_000758')

    @classmethod
    def unique_cell(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000759)
        """
        return cls._namespace_SIO('SIO_000759')

    @classmethod
    def referencing_cell(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000760)
        """
        return cls._namespace_SIO('SIO_000760')

    @classmethod
    def referent_cell(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000761)
        """
        return cls._namespace_SIO('SIO_000761')

    @classmethod
    def database_key(cls):
        """A database key is an informational entity whose value is constructed from one or more database columns.
        (cls, http://semanticscience.org/resource/SIO_000762)
        """
        return cls._namespace_SIO('SIO_000762')

    @classmethod
    def primary_database_key(cls):
        """A primary database key is a database key that identifies every row of a table.
        (cls, http://semanticscience.org/resource/SIO_000763)
        """
        return cls._namespace_SIO('SIO_000763')

    @classmethod
    def foreign_database_key(cls):
        """a foreign database key is a database key that refers to a key in some table
        (cls, http://semanticscience.org/resource/SIO_000764)
        """
        return cls._namespace_SIO('SIO_000764')

    @classmethod
    def probability_value(cls):
        """a p-value or probability value is the probability of obtaining a test statistic at least as extreme as the one that was actually observed, assuming that the null hypothesis is true
        (cls, http://semanticscience.org/resource/SIO_000765)
        """
        return cls._namespace_SIO('SIO_000765')

    @classmethod
    def p_value(cls):
        """a p-value or probability value is the probability of obtaining a test statistic at least as extreme as the one that was actually observed, assuming that the null hypothesis is true
        (cls, http://semanticscience.org/resource/SIO_000765)
        """
        return cls._namespace_SIO('SIO_000765')

    @classmethod
    def street_name(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000766)
        """
        return cls._namespace_SIO('SIO_000766')

    @classmethod
    def postal_code(cls):
        """a postal code is a geographic coordinate composed of a series of letters and/or digits appended to a postal address for the purpose of sorting mail.
        (cls, http://semanticscience.org/resource/SIO_000767)
        """
        return cls._namespace_SIO('SIO_000767')

    @classmethod
    def apartment_number(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000768)
        """
        return cls._namespace_SIO('SIO_000768')

    @classmethod
    def uncertainty_value(cls):
        """the uncertainty value (cls, margin of error) of a measurement is a range of values likely to enclose the true value.
        (http://semanticscience.org/resource/SIO_000769)
        """
        return cls._namespace_SIO('SIO_000769')

    @classmethod
    def standard_deviation(cls):
        """a standard deviation (cls, represented by the symbol ) is the quantity of  variation from the average (mean, or expected value).
        (http://semanticscience.org/resource/SIO_000770)
        """
        return cls._namespace_SIO('SIO_000770')

    @classmethod
    def versioned_record(cls):
        """a versioned record is a record for which there exists another variant based that was derived via modification of the facts.
        (cls, http://semanticscience.org/resource/SIO_000771)
        """
        return cls._namespace_SIO('SIO_000771')

    @classmethod
    def object(cls):
        """An object is an entity that is wholly identifiable at any instant of time during which it exists.
        (cls, http://semanticscience.org/resource/SIO_000776)
        """
        return cls._namespace_SIO('SIO_000776')

    @classmethod
    def to_be_a_member_of(cls):
        """to be a member of is the capability to be considered a part of a collection.
        (cls, http://semanticscience.org/resource/SIO_000777)
        """
        return cls._namespace_SIO('SIO_000777')

    @classmethod
    def to_distort(cls):
        """to distort is the capability to change the appearance of an entity by some transformation.
        (cls, http://semanticscience.org/resource/SIO_000778)
        """
        return cls._namespace_SIO('SIO_000778')

    @classmethod
    def primer(cls):
        """a primer is a nucleic acid that enables the synthesis of a complement strand of DNA by binding to it and acting as a point of transcription initiation.
        (cls, http://semanticscience.org/resource/SIO_000779)
        """
        return cls._namespace_SIO('SIO_000779')

    @classmethod
    def to_bind_to(cls):
        """to bind to is the capability to physically interact with another object through a set of non-covalent interactions.
        (cls, http://semanticscience.org/resource/SIO_000780)
        """
        return cls._namespace_SIO('SIO_000780')

    @classmethod
    def spatial_boundary(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000783)
        """
        return cls._namespace_SIO('SIO_000783')

    @classmethod
    def hermaphrodite(cls):
        """hermaphrodite is a biological sex of an individual with both male and female sexual organs.
        (cls, http://semanticscience.org/resource/SIO_000784)
        """
        return cls._namespace_SIO('SIO_000784')

    @classmethod
    def answer(cls):
        """an answer is a reply to a question.
        (cls, http://semanticscience.org/resource/SIO_000785)
        """
        return cls._namespace_SIO('SIO_000785')

    @classmethod
    def verbal_language_entity(cls):
        """a verbal language entity is a language entity that is manifested through sound.
        (cls, http://semanticscience.org/resource/SIO_000786)
        """
        return cls._namespace_SIO('SIO_000786')

    @classmethod
    def page_number(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000787)
        """
        return cls._namespace_SIO('SIO_000787')

    @classmethod
    def linear_position(cls):
        """a linear position is the position of some object against a linear positioning system.
        (cls, http://semanticscience.org/resource/SIO_000788)
        """
        return cls._namespace_SIO('SIO_000788')

    @classmethod
    def sequence_element_position(cls):
        """a sequence element position is the position of an element of a linear sequence.
        (cls, http://semanticscience.org/resource/SIO_000789)
        """
        return cls._namespace_SIO('SIO_000789')

    @classmethod
    def vertical_position(cls):
        """a vertical position is a quantity along an axis that goes from up to down.
        (cls, http://semanticscience.org/resource/SIO_000790)
        """
        return cls._namespace_SIO('SIO_000790')

    @classmethod
    def sequence_start_position(cls):
        """a sequence start position is the start position for a sequence of characters.
        (cls, http://semanticscience.org/resource/SIO_000791)
        """
        return cls._namespace_SIO('SIO_000791')

    @classmethod
    def sequence_end_position(cls):
        """a sequence end position is the position of the last character in a sequence of characters relative to some linear frame of reference.
        (cls, http://semanticscience.org/resource/SIO_000792)
        """
        return cls._namespace_SIO('SIO_000792')

    @classmethod
    def count(cls):
        """The number of elements of a finite set of objects.
        (cls, http://semanticscience.org/resource/SIO_000794)
        """
        return cls._namespace_SIO('SIO_000794')

    @classmethod
    def chemical_entity_role(cls):
        """a chemical role is a processual role held by a chemical entity
        (cls, http://semanticscience.org/resource/SIO_000795)
        """
        return cls._namespace_SIO('SIO_000795')

    @classmethod
    def catalytic_role(cls):
        """the role of a chemical participant that serves to increase the rate of reaction by lowering the activiation energy.
        (cls, http://semanticscience.org/resource/SIO_000796)
        """
        return cls._namespace_SIO('SIO_000796')

    @classmethod
    def substrate_role(cls):
        """the role of a chemical entity that is modified in a chemical reaction
        (cls, http://semanticscience.org/resource/SIO_000797)
        """
        return cls._namespace_SIO('SIO_000797')

    @classmethod
    def product_role(cls):
        """the role of a chemical entity present at the end of a chemical reaction.
        (cls, http://semanticscience.org/resource/SIO_000798)
        """
        return cls._namespace_SIO('SIO_000798')

    @classmethod
    def cofactor_role(cls):
        """the role of a chemical entity involved in the mechanism for enzyme-mediated catalysis.
        (cls, http://semanticscience.org/resource/SIO_000799)
        """
        return cls._namespace_SIO('SIO_000799')

    @classmethod
    def co_enzyme_role(cls):
        """a co-factor role in which the chemical entity is modified during catalysis and must be regenerated.
        (cls, http://semanticscience.org/resource/SIO_000800)
        """
        return cls._namespace_SIO('SIO_000800')

    @classmethod
    def prosthetic_group_role(cls):
        """a coenzyme role of a chemical entity that is covalently bonded to the  enzyme.
        (cls, http://semanticscience.org/resource/SIO_000801)
        """
        return cls._namespace_SIO('SIO_000801')

    @classmethod
    def co_substrate_role(cls):
        """a co-enzyme role of a chemical entity that is transiently associated, and is regenerated in a separate reaction.
        (cls, http://semanticscience.org/resource/SIO_000802)
        """
        return cls._namespace_SIO('SIO_000802')

    @classmethod
    def inhibitor_role(cls):
        """the role of a chemical entity that reduces the rate of reaction.
        (cls, http://semanticscience.org/resource/SIO_000803)
        """
        return cls._namespace_SIO('SIO_000803')

    @classmethod
    def activator_role(cls):
        """the role of a chemical entity that increases the rate of reaction.
        (cls, http://semanticscience.org/resource/SIO_000804)
        """
        return cls._namespace_SIO('SIO_000804')

    @classmethod
    def charged(cls):
        """The quality of having a charge
        (cls, http://semanticscience.org/resource/SIO_000805)
        """
        return cls._namespace_SIO('SIO_000805')

    @classmethod
    def uncharged(cls):
        """the quality of not having a charge
        (cls, http://semanticscience.org/resource/SIO_000806)
        """
        return cls._namespace_SIO('SIO_000806')

    @classmethod
    def partial_positive_charge(cls):
        """a partial negative charge is a negative charge where the value of the charge is negative.
        (cls, http://semanticscience.org/resource/SIO_000807)
        """
        return cls._namespace_SIO('SIO_000807')

    @classmethod
    def partial_negative_charge(cls):
        """a partial positive charge is a partial charge where the value of the charge is positive.
        (cls, http://semanticscience.org/resource/SIO_000808)
        """
        return cls._namespace_SIO('SIO_000808')

    @classmethod
    def partial_charge(cls):
        """the quality of having a charge that is not a full multiple of 1 unit charge.
        (cls, http://semanticscience.org/resource/SIO_000809)
        """
        return cls._namespace_SIO('SIO_000809')

    @classmethod
    def complete_charge(cls):
        """a complete charge is a charge where the value of the charge is a multiple of 1.
        (cls, http://semanticscience.org/resource/SIO_000810)
        """
        return cls._namespace_SIO('SIO_000810')

    @classmethod
    def URL(cls):
        """a Uniform Resource Locator or Universal Resource Locator (cls, URL) is a specific character string that constitutes a reference to an Internet resource.
        (http://semanticscience.org/resource/SIO_000811)
        """
        return cls._namespace_SIO('SIO_000811')

    @classmethod
    def affection(cls):
        """affection is an emotion characterized with a feeling or type of love for another living thing.
        (cls, http://semanticscience.org/resource/SIO_000812)
        """
        return cls._namespace_SIO('SIO_000812')

    @classmethod
    def angst(cls):
        """angst is the intense feeling of apprehension, anxiety or inner turmoil.
        (cls, http://semanticscience.org/resource/SIO_000813)
        """
        return cls._namespace_SIO('SIO_000813')

    @classmethod
    def annoyance(cls):
        """Annoyance is an unpleasant emtion that is characterized by a abnormal or excessive sensitivity to some external stimulus.
        (cls, http://semanticscience.org/resource/SIO_000814)
        """
        return cls._namespace_SIO('SIO_000814')

    @classmethod
    def anxiety(cls):
        """anxiety is an emotion charactersized by intense feeling of fear and concern coupled with a physical response.
        (cls, http://semanticscience.org/resource/SIO_000815)
        """
        return cls._namespace_SIO('SIO_000815')

    @classmethod
    def apathy(cls):
        """apathy is an emotion characterized by lack of interest, enthusiasm, or concern
        (cls, http://semanticscience.org/resource/SIO_000816)
        """
        return cls._namespace_SIO('SIO_000816')

    @classmethod
    def arousal(cls):
        """Arousal is an emotion characterized by state of reactive to stimuli. It involves the activation of the reticular activating system in the brain stem, the autonomic nervous system and the endocrine system, leading to increased heart rate and blood pressure and a condition of sensory alertness, mobility and readiness to respond.
        (cls, http://semanticscience.org/resource/SIO_000817)
        """
        return cls._namespace_SIO('SIO_000817')

    @classmethod
    def awe(cls):
        """Awe is an emotion produced by that which is grand, sublime or powerful and is characterized by a combination of joy, fear and admiration/reverence/respect.
        (cls, http://semanticscience.org/resource/SIO_000818)
        """
        return cls._namespace_SIO('SIO_000818')

    @classmethod
    def boldness(cls):
        """boldness is the trait of being willing to undertake things that involve risk or danger.
        (cls, http://semanticscience.org/resource/SIO_000819)
        """
        return cls._namespace_SIO('SIO_000819')

    @classmethod
    def boredom(cls):
        """boredom is the emotion experience by those not interested in their surroundings or available activities.
        (cls, http://semanticscience.org/resource/SIO_000820)
        """
        return cls._namespace_SIO('SIO_000820')

    @classmethod
    def contempt(cls):
        """contempt is disgust towards a lower status individual.
        (cls, http://semanticscience.org/resource/SIO_000821)
        """
        return cls._namespace_SIO('SIO_000821')

    @classmethod
    def contentment(cls):
        """contentment is an emotion characterized by acknowledgement and satisfaction of the current state of affairs.
        (cls, http://semanticscience.org/resource/SIO_000822)
        """
        return cls._namespace_SIO('SIO_000822')

    @classmethod
    def curiosity(cls):
        """curiosity is the strong desire to know or learn something.
        (cls, http://semanticscience.org/resource/SIO_000823)
        """
        return cls._namespace_SIO('SIO_000823')

    @classmethod
    def depression(cls):
        """depression is an unpleasant emotion linked to aversion to activity that can affect a person's thoughts, behavior, feelings and physical well-being. Depressed individuals may feel sad, anxious, empty, hopeless, worried, helpless, worthless, guilty, irritable, or restless.
        (cls, http://semanticscience.org/resource/SIO_000824)
        """
        return cls._namespace_SIO('SIO_000824')

    @classmethod
    def desire(cls):
        """Desire is a strong emotion of wanting to have something or wishing for something to happen.
        (cls, http://semanticscience.org/resource/SIO_000825)
        """
        return cls._namespace_SIO('SIO_000825')

    @classmethod
    def despair(cls):
        """despair is depression, hopelessness or lack of hope
        (cls, http://semanticscience.org/resource/SIO_000826)
        """
        return cls._namespace_SIO('SIO_000826')

    @classmethod
    def disappointment(cls):
        """Disappointment is the feeling of dissatisfaction that follows the failure of expectations or hopes to manifest
        (cls, http://semanticscience.org/resource/SIO_000827)
        """
        return cls._namespace_SIO('SIO_000827')

    @classmethod
    def disgust(cls):
        """Disgust is a feeling of revulsion or profound disapproval aroused by something unpleasant or offensive.
        (cls, http://semanticscience.org/resource/SIO_000828)
        """
        return cls._namespace_SIO('SIO_000828')

    @classmethod
    def dread(cls):
        """dread is the instense negative emotion that induces fear and apprehension.
        (cls, http://semanticscience.org/resource/SIO_000829)
        """
        return cls._namespace_SIO('SIO_000829')

    @classmethod
    def ecstasy(cls):
        """ecstacy is an emotion characterized by a heightened state of consciousness with total involvement of a subject.
        (cls, http://semanticscience.org/resource/SIO_000830)
        """
        return cls._namespace_SIO('SIO_000830')

    @classmethod
    def positive_emotion(cls):
        """a positive emotion is an emotion that feels good.
        (cls, http://semanticscience.org/resource/SIO_000831)
        """
        return cls._namespace_SIO('SIO_000831')

    @classmethod
    def negative_emotion(cls):
        """negative emotion is an emotion that does not feel good.
        (cls, http://semanticscience.org/resource/SIO_000832)
        """
        return cls._namespace_SIO('SIO_000832')

    @classmethod
    def embarassment(cls):
        """Embarrassment is the emotion of intense discomfort with oneself, experienced upon having a socially unacceptable act or condition witnessed by or revealed to other.
        (cls, http://semanticscience.org/resource/SIO_000833)
        """
        return cls._namespace_SIO('SIO_000833')

    @classmethod
    def envy(cls):
        """envy is an emotion that occurs when a person lacks another's (cls, perceived) superior quality, achievement or possession and wishes that the other lacked it.
        (http://semanticscience.org/resource/SIO_000834)
        """
        return cls._namespace_SIO('SIO_000834')

    @classmethod
    def euphoria(cls):
        """euphoria is an emotion characterized by intense feelings of well-being, elation, happiness, ecstasy, excitement, and joy.
        (cls, http://semanticscience.org/resource/SIO_000835)
        """
        return cls._namespace_SIO('SIO_000835')

    @classmethod
    def excitement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000836)
        """
        return cls._namespace_SIO('SIO_000836')

    @classmethod
    def fear(cls):
        """Fear is a negative emotion induced by a perceived threat that induces one to hide or move quickly away from the location of the perceived threat.
        (cls, http://semanticscience.org/resource/SIO_000837)
        """
        return cls._namespace_SIO('SIO_000837')

    @classmethod
    def frustration(cls):
        """Frustration is an emotion that arises from the perceived resistance to the fulfillment of individual will.
        (cls, http://semanticscience.org/resource/SIO_000838)
        """
        return cls._namespace_SIO('SIO_000838')

    @classmethod
    def gratitude(cls):
        """Gratitude, thankfulness, gratefulness, or appreciation is a feeling, emotion or attitude in acknowledgment of a benefit that one has received or will receive.
        (cls, http://semanticscience.org/resource/SIO_000839)
        """
        return cls._namespace_SIO('SIO_000839')

    @classmethod
    def appreciation(cls):
        """Gratitude, thankfulness, gratefulness, or appreciation is a feeling, emotion or attitude in acknowledgment of a benefit that one has received or will receive.
        (cls, http://semanticscience.org/resource/SIO_000839)
        """
        return cls._namespace_SIO('SIO_000839')

    @classmethod
    def happiness(cls):
        """Happiness is an emotion characterized by positive or pleasant emotions ranging from contentment to intense joy.
        (cls, http://semanticscience.org/resource/SIO_000840)
        """
        return cls._namespace_SIO('SIO_000840')

    @classmethod
    def guilt(cls):
        """Guilt is the emotion borne from feeling responsible for the commission of an offense and arises out of public humiliation.
        (cls, http://semanticscience.org/resource/SIO_000841)
        """
        return cls._namespace_SIO('SIO_000841')

    @classmethod
    def grief(cls):
        """Grief is an emotion in response to loss, whether physical or abstract including death, unemployment, ill health or the end of a relationship.
        (cls, http://semanticscience.org/resource/SIO_000842)
        """
        return cls._namespace_SIO('SIO_000842')

    @classmethod
    def hope(cls):
        """hope is an emotion of belief in a positive outcome related to events and circumstances in one's life.
        (cls, http://semanticscience.org/resource/SIO_000843)
        """
        return cls._namespace_SIO('SIO_000843')

    @classmethod
    def hostility(cls):
        """Hostility is the intense negative emotion of being in conflict or opposition to someone or something.
        (cls, http://semanticscience.org/resource/SIO_000844)
        """
        return cls._namespace_SIO('SIO_000844')

    @classmethod
    def hurt(cls):
        """hurt is an unpleasant feeling, emotion or sensation.
        (cls, http://semanticscience.org/resource/SIO_000845)
        """
        return cls._namespace_SIO('SIO_000845')

    @classmethod
    def hysteria(cls):
        """Hysteria is an unmanageable emotion.
        (cls, http://semanticscience.org/resource/SIO_000846)
        """
        return cls._namespace_SIO('SIO_000846')

    @classmethod
    def indifference(cls):
        """indifference is an emotion characterized by lack of interest, concern, or sympathy.
        (cls, http://semanticscience.org/resource/SIO_000847)
        """
        return cls._namespace_SIO('SIO_000847')

    @classmethod
    def interest(cls):
        """interest is the emotion of wanting to know or learn about something or someone.
        (cls, http://semanticscience.org/resource/SIO_000848)
        """
        return cls._namespace_SIO('SIO_000848')

    @classmethod
    def jealousy(cls):
        """jealousy is an emotion and typically refers to the negative thoughts and feelings of insecurity, fear, and anxiety over an anticipated loss of something that the person values, particularly in reference to a human connection
        (cls, http://semanticscience.org/resource/SIO_000849)
        """
        return cls._namespace_SIO('SIO_000849')

    @classmethod
    def joy(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000850)
        """
        return cls._namespace_SIO('SIO_000850')

    @classmethod
    def joy_is_an_emotion_of_intense_happiness(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000850)
        """
        return cls._namespace_SIO('SIO_000850')

    @classmethod
    def loathing(cls):
        """loathing is an intense dislike or disgust.
        (cls, http://semanticscience.org/resource/SIO_000851)
        """
        return cls._namespace_SIO('SIO_000851')

    @classmethod
    def loneliness(cls):
        """Loneliness is an unpleasant emotion in which a person feels a strong sense of emptiness, yearning distress and solitude resulting from inadequate quantity or quality of social relationships.
        (cls, http://semanticscience.org/resource/SIO_000852)
        """
        return cls._namespace_SIO('SIO_000852')

    @classmethod
    def lust(cls):
        """lust is the strong desire for sex.
        (cls, http://semanticscience.org/resource/SIO_000853)
        """
        return cls._namespace_SIO('SIO_000853')

    @classmethod
    def misery(cls):
        """Misery is a feeling of great unhappiness, suffering and/or pain.
        (cls, http://semanticscience.org/resource/SIO_000854)
        """
        return cls._namespace_SIO('SIO_000854')

    @classmethod
    def panic(cls):
        """Panic is a sudden emotion of fear which is so strong as to dominate or prevent reason and logical thinking, replacing it with overwhelming feelings of anxiety and frantic agitation consistent with an animalistic fight-or-flight reaction.
        (cls, http://semanticscience.org/resource/SIO_000855)
        """
        return cls._namespace_SIO('SIO_000855')

    @classmethod
    def passion(cls):
        """passion is the intense emotion compelling feeling, enthusiasm, or desire for something.
        (cls, http://semanticscience.org/resource/SIO_000856)
        """
        return cls._namespace_SIO('SIO_000856')

    @classmethod
    def pity(cls):
        """Pity is the emotion of sadness or sorrow for another.
        (cls, http://semanticscience.org/resource/SIO_000857)
        """
        return cls._namespace_SIO('SIO_000857')

    @classmethod
    def pleasure(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000858)
        """
        return cls._namespace_SIO('SIO_000858')

    @classmethod
    def pride(cls):
        """Pride is an emotion of satisfaction of attachment toward one's own or another's choices and actions, or toward a whole group of people, and is a product of praise, independent self-reflection, or a fulfilled feeling of belonging.
        (cls, http://semanticscience.org/resource/SIO_000859)
        """
        return cls._namespace_SIO('SIO_000859')

    @classmethod
    def rage(cls):
        """Rage is a feeling of intense anger that is associated with the Fight-or-flight response.
        (cls, http://semanticscience.org/resource/SIO_000860)
        """
        return cls._namespace_SIO('SIO_000860')

    @classmethod
    def regret(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000861)
        """
        return cls._namespace_SIO('SIO_000861')

    @classmethod
    def remorse(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000862)
        """
        return cls._namespace_SIO('SIO_000862')

    @classmethod
    def sadness(cls):
        """sadness is emotional pain associated with, or characterized by feelings of disadvantage, loss, despair, helplessness, sorrow, and rage.
        (cls, http://semanticscience.org/resource/SIO_000863)
        """
        return cls._namespace_SIO('SIO_000863')

    @classmethod
    def satisfaction(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000864)
        """
        return cls._namespace_SIO('SIO_000864')

    @classmethod
    def satisfaction_is_an_emotion_of_fulfillment_of_one_s_wishes_expectations_or_needs_or_the_pleasure_derived_from_this(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000864)
        """
        return cls._namespace_SIO('SIO_000864')

    @classmethod
    def shame(cls):
        """shame is the emotion borne from feeling responsible for the commission of an offense.
        (cls, http://semanticscience.org/resource/SIO_000865)
        """
        return cls._namespace_SIO('SIO_000865')

    @classmethod
    def shock(cls):
        """shock is an emotion of sudden upset or surprise.
        (cls, http://semanticscience.org/resource/SIO_000866)
        """
        return cls._namespace_SIO('SIO_000866')

    @classmethod
    def shyness(cls):
        """shyness is an emotion of apprehension, lack of comfort, or awkwardness experienced when in proximity to, approaching, or being approached by other individuals, especially in new situations or with unfamiliar individuals.
        (cls, http://semanticscience.org/resource/SIO_000867)
        """
        return cls._namespace_SIO('SIO_000867')

    @classmethod
    def sorrow(cls):
        """Sorrow is the emotion that is characterized by a long term state of intense sadness, distress and a degree of resignation (cls, not accepting).
        (http://semanticscience.org/resource/SIO_000868)
        """
        return cls._namespace_SIO('SIO_000868')

    @classmethod
    def suffering(cls):
        """Suffering is the unpleasant emotion and aversion associated with the perception of harm or threat of harm in an individual.
        (cls, http://semanticscience.org/resource/SIO_000869)
        """
        return cls._namespace_SIO('SIO_000869')

    @classmethod
    def surprise(cls):
        """Surprise is a brief emotion experienced as the result of an unexpected event.
        (cls, http://semanticscience.org/resource/SIO_000870)
        """
        return cls._namespace_SIO('SIO_000870')

    @classmethod
    def terror(cls):
        """terror is the extreme feeling of fear.
        (cls, http://semanticscience.org/resource/SIO_000871)
        """
        return cls._namespace_SIO('SIO_000871')

    @classmethod
    def wonder(cls):
        """Wonder is an emotion of perceiving something very rare or unexpected, but not threatening.
        (cls, http://semanticscience.org/resource/SIO_000872)
        """
        return cls._namespace_SIO('SIO_000872')

    @classmethod
    def worry(cls):
        """worry is the emotion characterized by concer over a real or imaginary issue.
        (cls, http://semanticscience.org/resource/SIO_000873)
        """
        return cls._namespace_SIO('SIO_000873')

    @classmethod
    def department_chair_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000875)
        """
        return cls._namespace_SIO('SIO_000875')

    @classmethod
    def student_advisor_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000876)
        """
        return cls._namespace_SIO('SIO_000876')

    @classmethod
    def undergraduate_student_advisor_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000877)
        """
        return cls._namespace_SIO('SIO_000877')

    @classmethod
    def graduate_student_advisor_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000878)
        """
        return cls._namespace_SIO('SIO_000878')

    @classmethod
    def reactant_role(cls):
        """the role of a chemical entity present at the beginning of a chemical reaction.
        (cls, http://semanticscience.org/resource/SIO_000879)
        """
        return cls._namespace_SIO('SIO_000879')

    @classmethod
    def regulator_role(cls):
        """the role of a chemical entity that modifies the rate of reaction.
        (cls, http://semanticscience.org/resource/SIO_000880)
        """
        return cls._namespace_SIO('SIO_000880')

    @classmethod
    def investigational_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000881)
        """
        return cls._namespace_SIO('SIO_000881')

    @classmethod
    def host_role(cls):
        """the role of an organism in providing resources to maintain the survival and/or reproduction of another organism.
        (cls, http://semanticscience.org/resource/SIO_000882)
        """
        return cls._namespace_SIO('SIO_000882')

    @classmethod
    def subject_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000883)
        """
        return cls._namespace_SIO('SIO_000883')

    @classmethod
    def publishing_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000884)
        """
        return cls._namespace_SIO('SIO_000884')

    @classmethod
    def publisher_role(cls):
        """the role of an agent that prepares and issues creative works.
        (cls, http://semanticscience.org/resource/SIO_000885)
        """
        return cls._namespace_SIO('SIO_000885')

    @classmethod
    def author_role(cls):
        """the role of an agent that creates a written work.
        (cls, http://semanticscience.org/resource/SIO_000886)
        """
        return cls._namespace_SIO('SIO_000886')

    @classmethod
    def buffer_role(cls):
        """a buffer role is the role of a chemical substance which maintains a pH at a near constant value.
        (cls, http://semanticscience.org/resource/SIO_000887)
        """
        return cls._namespace_SIO('SIO_000887')

    @classmethod
    def chemical_substance_role(cls):
        """a chemical substance role is a chemical entity role held by a chemical substance
        (cls, http://semanticscience.org/resource/SIO_000888)
        """
        return cls._namespace_SIO('SIO_000888')

    @classmethod
    def molecular_entity_role(cls):
        """a molecular entity role is a chemical entity role held by a molecule
        (cls, http://semanticscience.org/resource/SIO_000889)
        """
        return cls._namespace_SIO('SIO_000889')

    @classmethod
    def toxin_role(cls):
        """a toxin role is a toxic role of a chemical substance that is poisonous and  is produced by an organism
        (cls, http://semanticscience.org/resource/SIO_000890)
        """
        return cls._namespace_SIO('SIO_000890')

    @classmethod
    def toxic_role(cls):
        """a toxic role is the role of a chemical substance that is poisonous
        (cls, http://semanticscience.org/resource/SIO_000891)
        """
        return cls._namespace_SIO('SIO_000891')

    @classmethod
    def reagent_role(cls):
        """a role of a chemical substance that participates in a chemical reaction as part of some scientific investigation.
        (cls, http://semanticscience.org/resource/SIO_000893)
        """
        return cls._namespace_SIO('SIO_000893')

    @classmethod
    def to_luminesce(cls):
        """to luminesce is to emit light through cold body radiation
        (cls, http://semanticscience.org/resource/SIO_000894)
        """
        return cls._namespace_SIO('SIO_000894')

    @classmethod
    def to_fluoresce(cls):
        """to fluoresce is to emit light as a result of absorbing light or other electromagnetic radiation.
        (cls, http://semanticscience.org/resource/SIO_000895)
        """
        return cls._namespace_SIO('SIO_000895')

    @classmethod
    def molecular_tracer_role(cls):
        """a molecular tracer role is a reactant role of a molecular entity that serves as a marker for the presence, abundance, or location of a molecular target that it associates with.
        (cls, http://semanticscience.org/resource/SIO_000896)
        """
        return cls._namespace_SIO('SIO_000896')

    @classmethod
    def association(cls):
        """an assocation is a relationship between two or more entities derived by some informational anlysis.
        (cls, http://semanticscience.org/resource/SIO_000897)
        """
        return cls._namespace_SIO('SIO_000897')

    @classmethod
    def statistical_association(cls):
        """a statistical association is any relationship between two measured quantities that renders them statistically dependent.
        (cls, http://semanticscience.org/resource/SIO_000898)
        """
        return cls._namespace_SIO('SIO_000898')

    @classmethod
    def chromosome(cls):
        """a chromosome is a molecular complex of circular or linear DNA and bound proteins.
        (cls, http://semanticscience.org/resource/SIO_000899)
        """
        return cls._namespace_SIO('SIO_000899')

    @classmethod
    def top_value_axis(cls):
        """A top value axis is a value axis that is spatially positioned to the top of the plot area.
        (cls, http://semanticscience.org/resource/SIO_000902)
        """
        return cls._namespace_SIO('SIO_000902')

    @classmethod
    def bottom_value_axis(cls):
        """A bottom value axis is a value axis that is spatially positioned to the bottom of the plot area.
        (cls, http://semanticscience.org/resource/SIO_000903)
        """
        return cls._namespace_SIO('SIO_000903')

    @classmethod
    def map(cls):
        """A map is a a visual representation of an area that depicts the relationship between elements of that space.
        (cls, http://semanticscience.org/resource/SIO_000906)
        """
        return cls._namespace_SIO('SIO_000906')

    @classmethod
    def heatmap(cls):
        """A heatmap is a graphical representation of data where the individual values contained in a matrix are represented as colors.
        (cls, http://semanticscience.org/resource/SIO_000907)
        """
        return cls._namespace_SIO('SIO_000907')

    @classmethod
    def steamgraph(cls):
        """a steamgraph is a multi-line stacked graph that yields the appearance of continuous y-values across the x-axis.
        (cls, http://semanticscience.org/resource/SIO_000908)
        """
        return cls._namespace_SIO('SIO_000908')

    @classmethod
    def boxplot(cls):
        """A boxplot (cls, box-and-whisker diagram) is a convenient way of graphically depicting groups of numerical data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
        (http://semanticscience.org/resource/SIO_000909)
        """
        return cls._namespace_SIO('SIO_000909')

    @classmethod
    def geographic_heatmap(cls):
        """A geographic heatmap is a graphical representation of data over a geographic region where individual values are represented as colors.
        (cls, http://semanticscience.org/resource/SIO_000910)
        """
        return cls._namespace_SIO('SIO_000910')

    @classmethod
    def histogram(cls):
        """a histogram is a graphical representation of data which consists of tabular frequencies, shown as adjacent rectangles, over discrete intervals (cls, bins) , with an area equal to the frequency of the observations in the interval.
        (http://semanticscience.org/resource/SIO_000911)
        """
        return cls._namespace_SIO('SIO_000911')

    @classmethod
    def measurement_scale(cls):
        """a measurement scale is a functional specification that specifies an allowed range of categories or values.
        (cls, http://semanticscience.org/resource/SIO_000912)
        """
        return cls._namespace_SIO('SIO_000912')

    @classmethod
    def nomimal_scale(cls):
        """A nominal scale of measurement only specifies a limited set of categories.
        (cls, http://semanticscience.org/resource/SIO_000913)
        """
        return cls._namespace_SIO('SIO_000913')

    @classmethod
    def binary_scale(cls):
        """a binary scale is a measurement scale that specifies a choice between two values.
        (cls, http://semanticscience.org/resource/SIO_000914)
        """
        return cls._namespace_SIO('SIO_000914')

    @classmethod
    def numeric_scale(cls):
        """a numeric scale of measurement is one that only specifies numeric values
        (cls, http://semanticscience.org/resource/SIO_000915)
        """
        return cls._namespace_SIO('SIO_000915')

    @classmethod
    def decimal_scale(cls):
        """a decimal scale of measurement is one that only specifies decimal values
        (cls, http://semanticscience.org/resource/SIO_000916)
        """
        return cls._namespace_SIO('SIO_000916')

    @classmethod
    def integer_scale(cls):
        """an integer scale of measurement is one that only specifies integer values.
        (cls, http://semanticscience.org/resource/SIO_000917)
        """
        return cls._namespace_SIO('SIO_000917')

    @classmethod
    def modification(cls):
        """modification is the process by which an entity gains or loses parts, qualities, roles, dispositions, functions, etc, but maintains their identity through these changes.
        (cls, http://semanticscience.org/resource/SIO_000918)
        """
        return cls._namespace_SIO('SIO_000918')

    @classmethod
    def reproduction(cls):
        """Reproduction is the process by which a new entity is created based on another entity.
        (cls, http://semanticscience.org/resource/SIO_000919)
        """
        return cls._namespace_SIO('SIO_000919')

    @classmethod
    def independent_variable(cls):
        """an independent variable is a variable that may take on different values independent of other elements in a system.
        (cls, http://semanticscience.org/resource/SIO_000920)
        """
        return cls._namespace_SIO('SIO_000920')

    @classmethod
    def dependent_variable(cls):
        """A dependent variable is one whose value changes as a consequence of changes in other values in the system
        (cls, http://semanticscience.org/resource/SIO_000921)
        """
        return cls._namespace_SIO('SIO_000921')

    @classmethod
    def Gantt_chart(cls):
        """A Gantt chart is a bar chart that illustrates a project schedule.
        (cls, http://semanticscience.org/resource/SIO_000922)
        """
        return cls._namespace_SIO('SIO_000922')

    @classmethod
    def correlation(cls):
        """a correlation is a statistical relationship involving dependence between two random variables or datasets.
        (cls, http://semanticscience.org/resource/SIO_000923)
        """
        return cls._namespace_SIO('SIO_000923')

    @classmethod
    def television_program(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000924)
        """
        return cls._namespace_SIO('SIO_000924')

    @classmethod
    def radio_receiver(cls):
        """A radio receiver is a communication device that receives its input from an antenna, uses electronic filters to separate a wanted radio signal from all other signals picked up by this antenna, amplifies it to a level suitable for further processing, and finally converts through demodulation and decoding the signal into a form usable for the consumer, such as sound, pictures, digital data, measurement values, navigational positions.
        (cls, http://semanticscience.org/resource/SIO_000926)
        """
        return cls._namespace_SIO('SIO_000926')

    @classmethod
    def telephone(cls):
        """The telephone is a communications device that transmits and receives sounds, and are minimally composed of a microphone to speak into, a speaker'which reproduces the voice of the other person and a ringer which makes a sound to alert the owner when a call is coming in.
        (cls, http://semanticscience.org/resource/SIO_000927)
        """
        return cls._namespace_SIO('SIO_000927')

    @classmethod
    def radar(cls):
        """a radar is an object-detection system which uses radio waves to determine the range, altitude, direction, or speed of objects.
        (cls, http://semanticscience.org/resource/SIO_000928)
        """
        return cls._namespace_SIO('SIO_000928')

    @classmethod
    def pie_chart(cls):
        """A pie chart is a circular chart divided into sectors each of whose length  is proportional to the quantity it represents.
        (cls, http://semanticscience.org/resource/SIO_000929)
        """
        return cls._namespace_SIO('SIO_000929')

    @classmethod
    def matrix_chart(cls):
        """A matrix chart summarizes a multidimensional data set in a grid.
        (cls, http://semanticscience.org/resource/SIO_000930)
        """
        return cls._namespace_SIO('SIO_000930')

    @classmethod
    def network_diagram(cls):
        """A network diagram consists of a set of vertices connected by edges.
        (cls, http://semanticscience.org/resource/SIO_000931)
        """
        return cls._namespace_SIO('SIO_000931')

    @classmethod
    def block_histogram(cls):
        """A block histogram contains an x-axis that is divided into bins which correspond to value ranges. Each item in the data set is drawn as a rectangular block, and the blocks are piled into the bins to show how many values in each range.
        (cls, http://semanticscience.org/resource/SIO_000932)
        """
        return cls._namespace_SIO('SIO_000932')

    @classmethod
    def bubble_chart(cls):
        """A bubble chart contains circles whose area corresponds to a value.
        (cls, http://semanticscience.org/resource/SIO_000933)
        """
        return cls._namespace_SIO('SIO_000933')

    @classmethod
    def stack_graph(cls):
        """A stack graph is a statistical graph which presents multiple series in which the distance between one series and another indicates the relative contribution to the total for any x-value.
        (cls, http://semanticscience.org/resource/SIO_000934)
        """
        return cls._namespace_SIO('SIO_000934')

    @classmethod
    def treemap(cls):
        """a treemap is a chart that fully partitions the area into a set of rectangles whose area represents its relative value.
        (cls, http://semanticscience.org/resource/SIO_000935)
        """
        return cls._namespace_SIO('SIO_000935')

    @classmethod
    def word_tree(cls):
        """a word tree is a chart that links phrases with contexts through a tree-like branching structure.
        (cls, http://semanticscience.org/resource/SIO_000936)
        """
        return cls._namespace_SIO('SIO_000936')

    @classmethod
    def textual_chart(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000937)
        """
        return cls._namespace_SIO('SIO_000937')

    @classmethod
    def tag_cloud(cls):
        """a tag cloud is a visualization of word frequencies.
        (cls, http://semanticscience.org/resource/SIO_000938)
        """
        return cls._namespace_SIO('SIO_000938')

    @classmethod
    def word_cloud(cls):
        """a tag cloud is a visualization of word frequencies.
        (cls, http://semanticscience.org/resource/SIO_000938)
        """
        return cls._namespace_SIO('SIO_000938')

    @classmethod
    def phrase_net_diagram(cls):
        """A phrase net diagram illustrates the relationship between different words used in a text.
        (cls, http://semanticscience.org/resource/SIO_000939)
        """
        return cls._namespace_SIO('SIO_000939')

    @classmethod
    def mereological_chart(cls):
        """a mereological chart is a chart that illustrates the parts in the context of the whole.
        (cls, http://semanticscience.org/resource/SIO_000940)
        """
        return cls._namespace_SIO('SIO_000940')

    @classmethod
    def conversation(cls):
        """A conversation is a form of interactive, spontaneous communication between two or more objects who are following rules of etiquette.
        (cls, http://semanticscience.org/resource/SIO_000941)
        """
        return cls._namespace_SIO('SIO_000941')

    @classmethod
    def numeric_label(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000942)
        """
        return cls._namespace_SIO('SIO_000942')

    @classmethod
    def start_position(cls):
        """a start position is the proximal position of an object relative to an origin in a linear system.
        (cls, http://semanticscience.org/resource/SIO_000943)
        """
        return cls._namespace_SIO('SIO_000943')

    @classmethod
    def interval(cls):
        """an interval is a set of real numbers that includes all numbers between any two numbers in the set.
        (cls, http://semanticscience.org/resource/SIO_000944)
        """
        return cls._namespace_SIO('SIO_000944')

    @classmethod
    def tree_diagram(cls):
        """A tree diagram is a hierarchical network diagram in which a root vertex is connected to one or more other vertices through a directed edge, which in turn may be connected to other vertices.
        (cls, http://semanticscience.org/resource/SIO_000945)
        """
        return cls._namespace_SIO('SIO_000945')

    @classmethod
    def flowchart(cls):
        """A flowchart is a diagram that represents an algorithm or process, showing the steps as boxes of various kinds, and their order by connecting these with arrows.
        (cls, http://semanticscience.org/resource/SIO_000946)
        """
        return cls._namespace_SIO('SIO_000946')

    @classmethod
    def venn_diagram(cls):
        """A Venn diagram is a chart that illustrates all possible logical relations between a finite collection of sets as overlapping circles.
        (cls, http://semanticscience.org/resource/SIO_000947)
        """
        return cls._namespace_SIO('SIO_000947')

    @classmethod
    def dendrogram(cls):
        """A dendrogram is a tree diagram used to illustrate the arrangement of the clusters produced by hierarchical clustering.
        (cls, http://semanticscience.org/resource/SIO_000948)
        """
        return cls._namespace_SIO('SIO_000948')

    @classmethod
    def apprehension(cls):
        """apprehension is the negative emotion that something unpleasant will occur.
        (cls, http://semanticscience.org/resource/SIO_000949)
        """
        return cls._namespace_SIO('SIO_000949')

    @classmethod
    def resentment(cls):
        """resentment is disgust directed toward a higher status individual.
        (cls, http://semanticscience.org/resource/SIO_000950)
        """
        return cls._namespace_SIO('SIO_000950')

    @classmethod
    def pain(cls):
        """Pain is an unpleasant sensory and emotional experience associated with actual or potential tissue damage, or described in terms of such damage
        (cls, http://semanticscience.org/resource/SIO_000951)
        """
        return cls._namespace_SIO('SIO_000951')

    @classmethod
    def default_parameter(cls):
        """a default parameter is a parameter which has a default value.
        (cls, http://semanticscience.org/resource/SIO_000952)
        """
        return cls._namespace_SIO('SIO_000952')

    @classmethod
    def end_position(cls):
        """an end position is the distal position of an object relative to an origin in a linear system.
        (cls, http://semanticscience.org/resource/SIO_000953)
        """
        return cls._namespace_SIO('SIO_000953')

    @classmethod
    def stop_position(cls):
        """an end position is the distal position of an object relative to an origin in a linear system.
        (cls, http://semanticscience.org/resource/SIO_000953)
        """
        return cls._namespace_SIO('SIO_000953')

    @classmethod
    def sick(cls):
        """sick is the status of a living organism that is behaving at a sub-optimal level.
        (cls, http://semanticscience.org/resource/SIO_000954)
        """
        return cls._namespace_SIO('SIO_000954')

    @classmethod
    def environment(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000955)
        """
        return cls._namespace_SIO('SIO_000955')

    @classmethod
    def device(cls):
        """a device is usually a constructed tool
        (cls, http://semanticscience.org/resource/SIO_000956)
        """
        return cls._namespace_SIO('SIO_000956')

    @classmethod
    def communication_device(cls):
        """a communication device is a device that facilitates the transmission of information through encoded in an audio or digital signal between a sender and a receiver.
        (cls, http://semanticscience.org/resource/SIO_000957)
        """
        return cls._namespace_SIO('SIO_000957')

    @classmethod
    def existence_quality(cls):
        """existence quality is the quality of an entity that describe in what environment it is known to exist.
        (cls, http://semanticscience.org/resource/SIO_000959)
        """
        return cls._namespace_SIO('SIO_000959')

    @classmethod
    def real(cls):
        """real is the quality of an entity that exists in real space and time.
        (cls, http://semanticscience.org/resource/SIO_000960)
        """
        return cls._namespace_SIO('SIO_000960')

    @classmethod
    def fictional(cls):
        """fiction is the quality of an entity that exists only in a creative work of fiction.
        (cls, http://semanticscience.org/resource/SIO_000961)
        """
        return cls._namespace_SIO('SIO_000961')

    @classmethod
    def virtual(cls):
        """virtual is the quality of an entity that exists only in a virtual setting such as a simulation or game environment.
        (cls, http://semanticscience.org/resource/SIO_000962)
        """
        return cls._namespace_SIO('SIO_000962')

    @classmethod
    def not_started(cls):
        """not started is the status of a process that is predicted to exist but has not yet begun.
        (cls, http://semanticscience.org/resource/SIO_000963)
        """
        return cls._namespace_SIO('SIO_000963')

    @classmethod
    def standard_operating_procedure(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000964)
        """
        return cls._namespace_SIO('SIO_000964')

    @classmethod
    def agreement_quality(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000965)
        """
        return cls._namespace_SIO('SIO_000965')

    @classmethod
    def agreement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000966)
        """
        return cls._namespace_SIO('SIO_000966')

    @classmethod
    def disagreement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000967)
        """
        return cls._namespace_SIO('SIO_000967')

    @classmethod
    def poison_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000968)
        """
        return cls._namespace_SIO('SIO_000968')

    @classmethod
    def communication(cls):
        """Communication is the process of conveying information through the exchange of thoughts, messages, or information, as by speech, visuals, signals, writing, or behaviour.
        (cls, http://semanticscience.org/resource/SIO_000969)
        """
        return cls._namespace_SIO('SIO_000969')

    @classmethod
    def observational_study(cls):
        """observational study draws inferences about the possible effect of a treatment on subjects, where the assignment of subjects into a treated group versus a control group is outside the control of the investigator
        (cls, http://semanticscience.org/resource/SIO_000976)
        """
        return cls._namespace_SIO('SIO_000976')

    @classmethod
    def syllable(cls):
        """A syllable is a verbal entity of language having one vowel sound, with or without surrounding consonants, forming the whole or a part of a word.
        (cls, http://semanticscience.org/resource/SIO_000977)
        """
        return cls._namespace_SIO('SIO_000977')

    @classmethod
    def consonant(cls):
        """a consonant is a verbal entity of language that is articulated with complete or partial closure of the vocal tract.
        (cls, http://semanticscience.org/resource/SIO_000978)
        """
        return cls._namespace_SIO('SIO_000978')

    @classmethod
    def vowel(cls):
        """a vowel is a verbal entity of language that is pronounced with an open vocal tract so that there is no build-up of air pressure at any point above the glottis.
        (cls, http://semanticscience.org/resource/SIO_000979)
        """
        return cls._namespace_SIO('SIO_000979')

    @classmethod
    def sign_language(cls):
        """a sign language (cls, also signed language) is a language that involves manual communication and body language to convey meaning. This can involve simultaneously combining hand shapes, orientation and movement of the hands, arms or body, and facial expressions to fluidly express a speaker's thoughts.
        (http://semanticscience.org/resource/SIO_000980)
        """
        return cls._namespace_SIO('SIO_000980')

    @classmethod
    def verbal_language(cls):
        """a verbal language is a language that uses sounds to communicate.
        (cls, http://semanticscience.org/resource/SIO_000981)
        """
        return cls._namespace_SIO('SIO_000981')

    @classmethod
    def written_language(cls):
        """written language is a language that is communicated through a writing system.
        (cls, http://semanticscience.org/resource/SIO_000982)
        """
        return cls._namespace_SIO('SIO_000982')

    @classmethod
    def gene_disease_association(cls):
        """a gene-disease association is an association between a gene and a disease
        (cls, http://semanticscience.org/resource/SIO_000983)
        """
        return cls._namespace_SIO('SIO_000983')

    @classmethod
    def genome(cls):
        """a genome is a collection of nucleic acids.
        (cls, http://semanticscience.org/resource/SIO_000984)
        """
        return cls._namespace_SIO('SIO_000984')

    @classmethod
    def protein_coding_gene(cls):
        """a gene that contains an open reading frame which codes for a protein.
        (cls, http://semanticscience.org/resource/SIO_000985)
        """
        return cls._namespace_SIO('SIO_000985')

    @classmethod
    def functional_rna_coding_gene(cls):
        """a gene that codes for a functional RNA molecule
        (cls, http://semanticscience.org/resource/SIO_000986)
        """
        return cls._namespace_SIO('SIO_000986')

    @classmethod
    def predicted_gene(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_000987)
        """
        return cls._namespace_SIO('SIO_000987')

    @classmethod
    def pseudogene(cls):
        """a pseudo gene is a region of a nucleic acid that either cannot be transcribed, or its rna transcript cannot be translated.
        (cls, http://semanticscience.org/resource/SIO_000988)
        """
        return cls._namespace_SIO('SIO_000988')

    @classmethod
    def sequence_assembly(cls):
        """a sequence assembly is a sequence that is produced as by the alignment of two or more sequences.
        (cls, http://semanticscience.org/resource/SIO_000989)
        """
        return cls._namespace_SIO('SIO_000989')

    @classmethod
    def validated_gene(cls):
        """an experimentally validated gene is a gene whose existence has been demonstrated through experimental methods.
        (cls, http://semanticscience.org/resource/SIO_000991)
        """
        return cls._namespace_SIO('SIO_000991')

    @classmethod
    def unsupported(cls):
        """unsupported is an existence quality in which there is no evidence to support the existence of the entity.
        (cls, http://semanticscience.org/resource/SIO_000992)
        """
        return cls._namespace_SIO('SIO_000992')

    @classmethod
    def chemical_disease_association(cls):
        """a chemical-disease association is an association between a chemical and a disease.
        (cls, http://semanticscience.org/resource/SIO_000993)
        """
        return cls._namespace_SIO('SIO_000993')

    @classmethod
    def experiment(cls):
        """An experiment is an investigation that has the goal of verifying, falsifying, or establishing the validity of a hypothesis.
        (cls, http://semanticscience.org/resource/SIO_000994)
        """
        return cls._namespace_SIO('SIO_000994')

    @classmethod
    def suspended(cls):
        """suspended is the status of a process that is no longer progressing towards completion.
        (cls, http://semanticscience.org/resource/SIO_000995)
        """
        return cls._namespace_SIO('SIO_000995')

    @classmethod
    def cancelled(cls):
        """cancelled is a process status in which the process, while planned to occur, will not occur.
        (cls, http://semanticscience.org/resource/SIO_000996)
        """
        return cls._namespace_SIO('SIO_000996')

    @classmethod
    def aborted(cls):
        """aborted is a process status in which a started process will not complete as intended.
        (cls, http://semanticscience.org/resource/SIO_000997)
        """
        return cls._namespace_SIO('SIO_000997')

    @classmethod
    def literature_curation(cls):
        """literature curation is the process of an agent selecting and extracting terms and phrases from a document.
        (cls, http://semanticscience.org/resource/SIO_000998)
        """
        return cls._namespace_SIO('SIO_000998')

    @classmethod
    def procedure(cls):
        """a procedure is a process that attempts to achieve one or more objectives by following an established set of actions.
        (cls, http://semanticscience.org/resource/SIO_000999)
        """
        return cls._namespace_SIO('SIO_000999')

    @classmethod
    def clinical_trial(cls):
        """a clinical trial is an intervention trial to determine the safety and efficacy of  medical interventions (cls, e.g., drugs, diagnostics, devices, therapy protocols).
        (http://semanticscience.org/resource/SIO_001000)
        """
        return cls._namespace_SIO('SIO_001000')

    @classmethod
    def medical_diagnosis(cls):
        """A medical diagnosis (cls, often simply termed diagnosis) refers to the process of attempting to determine or identify a possible disease or disorder.
        (http://semanticscience.org/resource/SIO_001001)
        """
        return cls._namespace_SIO('SIO_001001')

    @classmethod
    def differential_diagnosis(cls):
        """A differential diagnosis (cls, sometimes abbreviated DDx, ddx, DD, D/Dx, or ) is a systematic diagnostic method used to identify the presence of an entity where multiple alternatives are possible (and the process may be termed differential diagnostic procedure), and may also refer to any of the included candidate alternatives (which may also be termed candidate condition).
        (http://semanticscience.org/resource/SIO_001002)
        """
        return cls._namespace_SIO('SIO_001002')

    @classmethod
    def diagnostic_opinion(cls):
        """A diagnostic opinion is an opinion resulting from a medical diagnostic procedure.
        (cls, http://semanticscience.org/resource/SIO_001003)
        """
        return cls._namespace_SIO('SIO_001003')

    @classmethod
    def opinion(cls):
        """an opinion is a belief that is the result of emotion or interpretation of facts.
        (cls, http://semanticscience.org/resource/SIO_001004)
        """
        return cls._namespace_SIO('SIO_001004')

    @classmethod
    def drug_effect(cls):
        """A drug effect is a chemical interaction in which a chemical elicits a marked characteristic of a biological system.
        (cls, http://semanticscience.org/resource/SIO_001005)
        """
        return cls._namespace_SIO('SIO_001005')

    @classmethod
    def drug_drug_interaction(cls):
        """a drug-drug interaction is an interaction in which two drugs interact in such a way to produce a non-additive biological response.
        (cls, http://semanticscience.org/resource/SIO_001006)
        """
        return cls._namespace_SIO('SIO_001006')

    @classmethod
    def assay(cls):
        """An assay is an investigative (cls, analytic) procedure in laboratory medicine, pharmacology, environmental biology, and molecular biology for qualitatively assessing or quantitatively measuring the presence or amount or the functional activity of a target entity (the analyte) which can be a drug or biochemical substance or a cell in an organism or organic sample.
        (http://semanticscience.org/resource/SIO_001007)
        """
        return cls._namespace_SIO('SIO_001007')

    @classmethod
    def toxicity(cls):
        """toxicity is the quality of a chemical substance to cause injury to an organism in a dose dependent manner.
        (cls, http://semanticscience.org/resource/SIO_001008)
        """
        return cls._namespace_SIO('SIO_001008')

    @classmethod
    def toxic(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001009)
        """
        return cls._namespace_SIO('SIO_001009')

    @classmethod
    def non_toxic(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001010)
        """
        return cls._namespace_SIO('SIO_001010')

    @classmethod
    def chemical_quality(cls):
        """chemical quality is the quality of a chemical entity.
        (cls, http://semanticscience.org/resource/SIO_001011)
        """
        return cls._namespace_SIO('SIO_001011')

    @classmethod
    def healthy(cls):
        """healthy is an organismal state of complete physical, mental and social well-being.
        (cls, http://semanticscience.org/resource/SIO_001012)
        """
        return cls._namespace_SIO('SIO_001012')

    @classmethod
    def age(cls):
        """age is the length of time that a person has lived or a thing has existed.
        (cls, http://semanticscience.org/resource/SIO_001013)
        """
        return cls._namespace_SIO('SIO_001013')

    @classmethod
    def ethnicity(cls):
        """ethnicity is the biological quality of membership in a social group based on a common heritage.
        (cls, http://semanticscience.org/resource/SIO_001014)
        """
        return cls._namespace_SIO('SIO_001014')

    @classmethod
    def race(cls):
        """race is a characteristic of an individual by heritable phenotypic characteristics, geographic ancestry, physical appearance, ethnicity, and social status.
        (cls, http://semanticscience.org/resource/SIO_001015)
        """
        return cls._namespace_SIO('SIO_001015')

    @classmethod
    def ethnic_group(cls):
        """an ethnic group is a group of people whose members identify with each other through a common heritage, consisting of a common culture, including a shared language or dialect.
        (cls, http://semanticscience.org/resource/SIO_001016)
        """
        return cls._namespace_SIO('SIO_001016')

    @classmethod
    def syndrome(cls):
        """A syndrome is composed of a set of several clinically recognizable features, signs (cls, observed by someone other than the patient), symptoms (reported by the patient), phenomena or characteristics that often occur together.
        (http://semanticscience.org/resource/SIO_001017)
        """
        return cls._namespace_SIO('SIO_001017')

    @classmethod
    def ratio(cls):
        """a ratio is a relationship between two numbers of the same kind expressed arithmetically as a dimensionless quotient of the two which explicitly indicates how many times the first number contains the second.
        (cls, http://semanticscience.org/resource/SIO_001018)
        """
        return cls._namespace_SIO('SIO_001018')

    @classmethod
    def dose(cls):
        """A dose is the quantity of a chemical substance administered to a biological system.
        (cls, http://semanticscience.org/resource/SIO_001019)
        """
        return cls._namespace_SIO('SIO_001019')

    @classmethod
    def effective_dose(cls):
        """effective dose is the amount of a substance required to produce an effect on a predefined percentage of a population.
        (cls, http://semanticscience.org/resource/SIO_001020)
        """
        return cls._namespace_SIO('SIO_001020')

    @classmethod
    def expected_value(cls):
        """an expected value (cls, or e-value) is the weighted average of all possible values that a random variable can take on.
        (http://semanticscience.org/resource/SIO_001021)
        """
        return cls._namespace_SIO('SIO_001021')

    @classmethod
    def diagnostic_test(cls):
        """A diagnostic test is a procedure performed to confirm, or determine the presence of disease in an individual suspected of having the disease, usually following the report of symptoms, or based on the results of other medical tests.
        (cls, http://semanticscience.org/resource/SIO_001022)
        """
        return cls._namespace_SIO('SIO_001022')

    @classmethod
    def medical_screening(cls):
        """A medical screening is a medical test or series used to detect or predict the presence of disease in individuals at risk for disease within a defined group, such as a population, family, or workforce
        (cls, http://semanticscience.org/resource/SIO_001023)
        """
        return cls._namespace_SIO('SIO_001023')

    @classmethod
    def medical_procedure(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001024)
        """
        return cls._namespace_SIO('SIO_001024')

    @classmethod
    def prognosis(cls):
        """A prognosis is a proposition about the likely course of a disease, the chance of recovery or recurrence.
        (cls, http://semanticscience.org/resource/SIO_001025)
        """
        return cls._namespace_SIO('SIO_001025')

    @classmethod
    def report(cls):
        """A report is a textual document made that present focused, salient content to a specific audience.
        (cls, http://semanticscience.org/resource/SIO_001026)
        """
        return cls._namespace_SIO('SIO_001026')

    @classmethod
    def medical_health_record(cls):
        """A medical health record is a record of a single patient's medical history.
        (cls, http://semanticscience.org/resource/SIO_001027)
        """
        return cls._namespace_SIO('SIO_001027')

    @classmethod
    def medical_report(cls):
        """a medical report is a report prepared by a health care practioner about test outcomes or health status of an individual.
        (cls, http://semanticscience.org/resource/SIO_001028)
        """
        return cls._namespace_SIO('SIO_001028')

    @classmethod
    def peer_reviewed_article(cls):
        """a peer reviewed article is an article that has undergone peer-review and deemed acceptable for publication.
        (cls, http://semanticscience.org/resource/SIO_001029)
        """
        return cls._namespace_SIO('SIO_001029')

    @classmethod
    def major_version_number(cls):
        """a major version number is a version of a software that exhibits a significant change in functionalilty from a prior version.
        (cls, http://semanticscience.org/resource/SIO_001030)
        """
        return cls._namespace_SIO('SIO_001030')

    @classmethod
    def minor_version_number(cls):
        """a minor version number is a version of a software that exhibits minor features or significant fix from a prior version.
        (cls, http://semanticscience.org/resource/SIO_001031)
        """
        return cls._namespace_SIO('SIO_001031')

    @classmethod
    def revision_number(cls):
        """a revision number is a version of a software in which bugs have been fixed from a prior version.
        (cls, http://semanticscience.org/resource/SIO_001032)
        """
        return cls._namespace_SIO('SIO_001032')

    @classmethod
    def text_quality(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001033)
        """
        return cls._namespace_SIO('SIO_001033')

    @classmethod
    def reviewed(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001034)
        """
        return cls._namespace_SIO('SIO_001034')

    @classmethod
    def peer_reviewed(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001035)
        """
        return cls._namespace_SIO('SIO_001035')

    @classmethod
    def draft(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001036)
        """
        return cls._namespace_SIO('SIO_001036')

    @classmethod
    def finalized(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001037)
        """
        return cls._namespace_SIO('SIO_001037')

    @classmethod
    def editor_reviewed(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001038)
        """
        return cls._namespace_SIO('SIO_001038')

    @classmethod
    def written(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001039)
        """
        return cls._namespace_SIO('SIO_001039')

    @classmethod
    def morpheme(cls):
        """a morpheme is the smallest semantically meaningful unit in a language
        (cls, http://semanticscience.org/resource/SIO_001040)
        """
        return cls._namespace_SIO('SIO_001040')

    @classmethod
    def study_design(cls):
        """A study design is a protocol for the proper execution of a study which normally requires a carefullly crafted research question or hypothesis and at least one variable under observation and observed values for that variable.
        (cls, http://semanticscience.org/resource/SIO_001041)
        """
        return cls._namespace_SIO('SIO_001041')

    @classmethod
    def study_protocol(cls):
        """A study design is a protocol for the proper execution of a study which normally requires a carefullly crafted research question or hypothesis and at least one variable under observation and observed values for that variable.
        (cls, http://semanticscience.org/resource/SIO_001041)
        """
        return cls._namespace_SIO('SIO_001041')

    @classmethod
    def recipe(cls):
        """A recipe is a set of instructions that describe how to prepare or make something.
        (cls, http://semanticscience.org/resource/SIO_001042)
        """
        return cls._namespace_SIO('SIO_001042')

    @classmethod
    def experimental_protocol(cls):
        """an experimental protocol is an action specification with respect to the design and implementation of experiments. In addition to providing a detailed set of procedures and lists of required equipment and instruments, experimental protocols often include information on safety precautions, the calculation of results and reporting standards, including statistical analysis and rules for predefining and documenting excluded data to avoid bias.
        (cls, http://semanticscience.org/resource/SIO_001043)
        """
        return cls._namespace_SIO('SIO_001043')

    @classmethod
    def viroid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001044)
        """
        return cls._namespace_SIO('SIO_001044')

    @classmethod
    def polar_quality(cls):
        """the quality of being polar or not polar.
        (cls, http://semanticscience.org/resource/SIO_001045)
        """
        return cls._namespace_SIO('SIO_001045')

    @classmethod
    def polar(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001046)
        """
        return cls._namespace_SIO('SIO_001046')

    @classmethod
    def non_polar(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001047)
        """
        return cls._namespace_SIO('SIO_001047')

    @classmethod
    def intervention_study(cls):
        """an intervention study has the objective of improving the condition of an individual or a group of individuals, and demonstrates the magnitude of that capability by comparing it to a control group.
        (cls, http://semanticscience.org/resource/SIO_001048)
        """
        return cls._namespace_SIO('SIO_001048')

    @classmethod
    def sampling(cls):
        """sampling is the act of obtaining a sample, whether through selection, collection or preparation.
        (cls, http://semanticscience.org/resource/SIO_001049)
        """
        return cls._namespace_SIO('SIO_001049')

    @classmethod
    def sample(cls):
        """a sample is a limited quantity of something (cls, e.g. an individual or set of individuals from a population, or a portion of a substance) to be used for testing, analysis, inspection, investigation, demonstration, or trial use.
        (http://semanticscience.org/resource/SIO_001050)
        """
        return cls._namespace_SIO('SIO_001050')

    @classmethod
    def data_analysis(cls):
        """Analysis of data is a process of inspecting, cleaning, transforming, and modeling data with the goal of highlighting useful information, suggesting conclusions, and supporting decision making.
        (cls, http://semanticscience.org/resource/SIO_001051)
        """
        return cls._namespace_SIO('SIO_001051')

    @classmethod
    def data_collection(cls):
        """the act of collecting data for further analysis.
        (cls, http://semanticscience.org/resource/SIO_001052)
        """
        return cls._namespace_SIO('SIO_001052')

    @classmethod
    def reason(cls):
        """A reason is a justification that specifies the motive for an action or a determination
        (cls, http://semanticscience.org/resource/SIO_001053)
        """
        return cls._namespace_SIO('SIO_001053')

    @classmethod
    def measurement(cls):
        """measurement is a procedure to obtain a measurement value.
        (cls, http://semanticscience.org/resource/SIO_001054)
        """
        return cls._namespace_SIO('SIO_001054')

    @classmethod
    def observation(cls):
        """an observation is a process of passive interaction in which one entity makes note of attributes of one or more entities.
        (cls, http://semanticscience.org/resource/SIO_001055)
        """
        return cls._namespace_SIO('SIO_001055')

    @classmethod
    def character_position(cls):
        """the ordinal position of a character in a sequence of characters.
        (cls, http://semanticscience.org/resource/SIO_001056)
        """
        return cls._namespace_SIO('SIO_001056')

    @classmethod
    def character_offset(cls):
        """the ordinal position of a character in a sequence of characters.
        (cls, http://semanticscience.org/resource/SIO_001056)
        """
        return cls._namespace_SIO('SIO_001056')

    @classmethod
    def word_start_position(cls):
        """the position of the first character in a word as an offset from the first character of the text in which it is found.
        (cls, http://semanticscience.org/resource/SIO_001057)
        """
        return cls._namespace_SIO('SIO_001057')

    @classmethod
    def word_end_position(cls):
        """word end position is the position of the last character in a word as an offset from the first character of the text in which it is found.
        (cls, http://semanticscience.org/resource/SIO_001058)
        """
        return cls._namespace_SIO('SIO_001058')

    @classmethod
    def physical_gesture(cls):
        """A physical gesture is a form of non-verbal communication in which visible bodily actions communicate particular messages, either in place of speech or together and in parallel with spoken words. Gestures include movement of the hands, face, or other parts of the body.
        (cls, http://semanticscience.org/resource/SIO_001059)
        """
        return cls._namespace_SIO('SIO_001059')

    @classmethod
    def planned(cls):
        """planned is a process status for a process that has not yet started, but is referred to in a plan.
        (cls, http://semanticscience.org/resource/SIO_001060)
        """
        return cls._namespace_SIO('SIO_001060')

    @classmethod
    def population(cls):
        """A population is all the organisms that both belong to the same group or species and live in the same geographical area.
        (cls, http://semanticscience.org/resource/SIO_001061)
        """
        return cls._namespace_SIO('SIO_001061')

    @classmethod
    def human_population(cls):
        """a human population refers to a collection of human beings.
        (cls, http://semanticscience.org/resource/SIO_001062)
        """
        return cls._namespace_SIO('SIO_001062')

    @classmethod
    def family(cls):
        """a group of people affiliated by consanguinity, affinity, or co-residence.
        (cls, http://semanticscience.org/resource/SIO_001063)
        """
        return cls._namespace_SIO('SIO_001063')

    @classmethod
    def community(cls):
        """a community is a sizeable social unit that shares common values.
        (cls, http://semanticscience.org/resource/SIO_001064)
        """
        return cls._namespace_SIO('SIO_001064')

    @classmethod
    def speculation(cls):
        """speculation is an opinion based on incomplete evidence
        (cls, http://semanticscience.org/resource/SIO_001065)
        """
        return cls._namespace_SIO('SIO_001065')

    @classmethod
    def execution_of_study_design(cls):
        """execution of study design is a process that results from precisely following each of the steps of a study design.
        (cls, http://semanticscience.org/resource/SIO_001066)
        """
        return cls._namespace_SIO('SIO_001066')

    @classmethod
    def controlled_observational_cohort_study(cls):
        """In a controlled observational cohort study, two groups of subjects are selected from two populations that are thought to differ in only one characteristic. The groups of subjects are studied for a specific period and contrasted at the end of the study period.
        (cls, http://semanticscience.org/resource/SIO_001067)
        """
        return cls._namespace_SIO('SIO_001067')

    @classmethod
    def control_group(cls):
        """a control group is a group of individuals that are not subject to an intervention of interest, but rather serve as a baseline to compare the outcomes in the intervention group.
        (cls, http://semanticscience.org/resource/SIO_001068)
        """
        return cls._namespace_SIO('SIO_001068')

    @classmethod
    def intervention_group(cls):
        """An intervention group is a group of individuals that are subject to an intervention.
        (cls, http://semanticscience.org/resource/SIO_001069)
        """
        return cls._namespace_SIO('SIO_001069')

    @classmethod
    def control_variable(cls):
        """A control variable that is believed to alter the dependent or independent variables, but may not actually be the focus of the experiment. So that variable will be kept constant or monitored to try to minimise its effect on the experiment.
        (cls, http://semanticscience.org/resource/SIO_001070)
        """
        return cls._namespace_SIO('SIO_001070')

    @classmethod
    def extraneous_variable(cls):
        """A control variable that is believed to alter the dependent or independent variables, but may not actually be the focus of the experiment. So that variable will be kept constant or monitored to try to minimise its effect on the experiment.
        (cls, http://semanticscience.org/resource/SIO_001070)
        """
        return cls._namespace_SIO('SIO_001070')

    @classmethod
    def text_span_start_position(cls):
        """text span start position is the position (cls, offset) of the first character of a text span in relation the text it is from.
        (http://semanticscience.org/resource/SIO_001071)
        """
        return cls._namespace_SIO('SIO_001071')

    @classmethod
    def text_span_end_position(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001072)
        """
        return cls._namespace_SIO('SIO_001072')

    @classmethod
    def text_span_end_position_is_the_position_offset_of_the_last_character_of_a_text_span_in_relation_the_text_it_is_from(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001072)
        """
        return cls._namespace_SIO('SIO_001072')

    @classmethod
    def text_span(cls):
        """a text span is a subset of contiguous sequence of characters of a textual entity.
        (cls, http://semanticscience.org/resource/SIO_001073)
        """
        return cls._namespace_SIO('SIO_001073')

    @classmethod
    def selector(cls):
        """a text span is a subset of contiguous sequence of characters of a textual entity.
        (cls, http://semanticscience.org/resource/SIO_001073)
        """
        return cls._namespace_SIO('SIO_001073')

    @classmethod
    def t_statistic(cls):
        """a t-statistic is a ratio of the departure of an estimated parameter from its notional value and its standard error.
        (cls, http://semanticscience.org/resource/SIO_001074)
        """
        return cls._namespace_SIO('SIO_001074')

    @classmethod
    def microarray_probe_set_identifier(cls):
        """a microarray probe set identifier is an identifier for a set of probe pairs selected to represent expressed sequences on an array.
        (cls, http://semanticscience.org/resource/SIO_001075)
        """
        return cls._namespace_SIO('SIO_001075')

    @classmethod
    def microarray_experiment(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001076)
        """
        return cls._namespace_SIO('SIO_001076')

    @classmethod
    def gene_expression_value(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001077)
        """
        return cls._namespace_SIO('SIO_001077')

    @classmethod
    def differential_gene_expression_ratio(cls):
        """a differential gene expression ratio is the ratio of gene expression values from a test sample compared to a control sample.
        (cls, http://semanticscience.org/resource/SIO_001078)
        """
        return cls._namespace_SIO('SIO_001078')

    @classmethod
    def genotype(cls):
        """a genotype is a functional specification of a biological entity in terms of its genetic composition (cls, or lack thereof).
        (http://semanticscience.org/resource/SIO_001079)
        """
        return cls._namespace_SIO('SIO_001079')

    @classmethod
    def vocabulary(cls):
        """a vocabulary is a collection of terms.
        (cls, http://semanticscience.org/resource/SIO_001080)
        """
        return cls._namespace_SIO('SIO_001080')

    @classmethod
    def t_statistic_based_increased_differential_gene_expression(cls):
        """a t-statistic based increased differential gene expression is a differential gene expression ratio in which the t-statistic is greater than zero.
        (cls, http://semanticscience.org/resource/SIO_001081)
        """
        return cls._namespace_SIO('SIO_001081')

    @classmethod
    def t_statistic_based_decreased_differential_gene_expression(cls):
        """a t-statistic based decreased differential gene expression is a differential gene expression ratio in which the t-statistic is less than zero.
        (cls, http://semanticscience.org/resource/SIO_001082)
        """
        return cls._namespace_SIO('SIO_001082')

    @classmethod
    def date_of_database_submission(cls):
        """a date of database submission refers to the moment in time in which some information was submitted/received to a database system.
        (cls, http://semanticscience.org/resource/SIO_001083)
        """
        return cls._namespace_SIO('SIO_001083')

    @classmethod
    def liquid_solution(cls):
        """a liquid solution is a heterogeneous substance in a liquid state.
        (cls, http://semanticscience.org/resource/SIO_001084)
        """
        return cls._namespace_SIO('SIO_001084')

    @classmethod
    def to_remove_a_covalent_bond(cls):
        """to remove a covalent bond is the capability to covalently modify a chemical entity by removing a covalent bond.
        (cls, http://semanticscience.org/resource/SIO_001085)
        """
        return cls._namespace_SIO('SIO_001085')

    @classmethod
    def to_add_a_covalent_bond(cls):
        """to add a covalent bond is the capability to covalently modify a chemical entity by adding a covalent bond.
        (cls, http://semanticscience.org/resource/SIO_001086)
        """
        return cls._namespace_SIO('SIO_001086')

    @classmethod
    def to_modify_electronically(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001087)
        """
        return cls._namespace_SIO('SIO_001087')

    @classmethod
    def concentration(cls):
        """concentration is the quantity of a constituent divided by the total volume of a mixture.
        (cls, http://semanticscience.org/resource/SIO_001088)
        """
        return cls._namespace_SIO('SIO_001088')

    @classmethod
    def pH(cls):
        """pH is a measure of the activity of the (cls, solvated) hydrogen ion.
        (http://semanticscience.org/resource/SIO_001089)
        """
        return cls._namespace_SIO('SIO_001089')

    @classmethod
    def homogeneous(cls):
        """homogeneous is a quality that describes the uniform composition of an object.
        (cls, http://semanticscience.org/resource/SIO_001090)
        """
        return cls._namespace_SIO('SIO_001090')

    @classmethod
    def heterogeneous(cls):
        """homogeneous is a quality that describes the varied composition of an object.
        (cls, http://semanticscience.org/resource/SIO_001091)
        """
        return cls._namespace_SIO('SIO_001091')

    @classmethod
    def structural_quality(cls):
        """a structural quality is a quality of an object that describes its structure.
        (cls, http://semanticscience.org/resource/SIO_001092)
        """
        return cls._namespace_SIO('SIO_001092')

    @classmethod
    def rigid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001093)
        """
        return cls._namespace_SIO('SIO_001093')

    @classmethod
    def bent(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001094)
        """
        return cls._namespace_SIO('SIO_001094')

    @classmethod
    def curved(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001095)
        """
        return cls._namespace_SIO('SIO_001095')

    @classmethod
    def electronic_structure(cls):
        """electronic structure is the electron configuration is the distribution of electrons of an atom or molecule (cls, or other physical structure) in atomic or molecular orbitals.
        (http://semanticscience.org/resource/SIO_001099)
        """
        return cls._namespace_SIO('SIO_001099')

    @classmethod
    def electronic_configuration(cls):
        """electronic structure is the electron configuration is the distribution of electrons of an atom or molecule (cls, or other physical structure) in atomic or molecular orbitals.
        (http://semanticscience.org/resource/SIO_001099)
        """
        return cls._namespace_SIO('SIO_001099')

    @classmethod
    def crystal_structure(cls):
        """a crystal structure is the arrangement of atoms or molecules in a crystalline liquid or solid.
        (cls, http://semanticscience.org/resource/SIO_001100)
        """
        return cls._namespace_SIO('SIO_001100')

    @classmethod
    def to_interact_and_to_be_interacted_with(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001102)
        """
        return cls._namespace_SIO('SIO_001102')

    @classmethod
    def to_gain_a_covalent_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001103)
        """
        return cls._namespace_SIO('SIO_001103')

    @classmethod
    def to_lose_a_covalent_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001104)
        """
        return cls._namespace_SIO('SIO_001104')

    @classmethod
    def to_ingest(cls):
        """to ingest is the capability to take into the body by the mouth for digestion or absorption
        (cls, http://semanticscience.org/resource/SIO_001105)
        """
        return cls._namespace_SIO('SIO_001105')

    @classmethod
    def to_produce(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001106)
        """
        return cls._namespace_SIO('SIO_001106')

    @classmethod
    def pathway(cls):
        """a pathway is an effective specification that outlines a set of actions that forms a way to achieve an objective.
        (cls, http://semanticscience.org/resource/SIO_001107)
        """
        return cls._namespace_SIO('SIO_001107')

    @classmethod
    def biological_pathway(cls):
        """a pathway is an effective specification that outlines a set of actions that forms a way to achieve an objective.
        (cls, http://semanticscience.org/resource/SIO_001107)
        """
        return cls._namespace_SIO('SIO_001107')

    @classmethod
    def centrality_measure(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001108)
        """
        return cls._namespace_SIO('SIO_001108')

    @classmethod
    def mean(cls):
        """a mean is the central tendency of a collection of numbers taken as the sum of the numbers divided by the size of the collection.
        (cls, http://semanticscience.org/resource/SIO_001109)
        """
        return cls._namespace_SIO('SIO_001109')

    @classmethod
    def arithmeritic_mean(cls):
        """a mean is the central tendency of a collection of numbers taken as the sum of the numbers divided by the size of the collection.
        (cls, http://semanticscience.org/resource/SIO_001109)
        """
        return cls._namespace_SIO('SIO_001109')

    @classmethod
    def median(cls):
        """a median is the numerical value separating the higher half of a sample, a population, or a probability distribution, from the lower half.
        (cls, http://semanticscience.org/resource/SIO_001110)
        """
        return cls._namespace_SIO('SIO_001110')

    @classmethod
    def mode(cls):
        """a mode is the value that appears most often in a set of data.
        (cls, http://semanticscience.org/resource/SIO_001111)
        """
        return cls._namespace_SIO('SIO_001111')

    @classmethod
    def sum(cls):
        """a sum is the result of adding a set of values together.
        (cls, http://semanticscience.org/resource/SIO_001112)
        """
        return cls._namespace_SIO('SIO_001112')

    @classmethod
    def minimal_value(cls):
        """a minimal value is smallest value of an attribute for the entities in the defined set.
        (cls, http://semanticscience.org/resource/SIO_001113)
        """
        return cls._namespace_SIO('SIO_001113')

    @classmethod
    def min(cls):
        """a minimal value is smallest value of an attribute for the entities in the defined set.
        (cls, http://semanticscience.org/resource/SIO_001113)
        """
        return cls._namespace_SIO('SIO_001113')

    @classmethod
    def maximal_value(cls):
        """a maximal value is largest value of an attribute for the entities in the defined set.
        (cls, http://semanticscience.org/resource/SIO_001114)
        """
        return cls._namespace_SIO('SIO_001114')

    @classmethod
    def max(cls):
        """a maximal value is largest value of an attribute for the entities in the defined set.
        (cls, http://semanticscience.org/resource/SIO_001114)
        """
        return cls._namespace_SIO('SIO_001114')

    @classmethod
    def member_count(cls):
        """a count of the instances of a class or members in a collection.
        (cls, http://semanticscience.org/resource/SIO_001115)
        """
        return cls._namespace_SIO('SIO_001115')

    @classmethod
    def union(cls):
        """a union is a list of all of the values of an attribute for the entities in the defined set.
        (cls, http://semanticscience.org/resource/SIO_001116)
        """
        return cls._namespace_SIO('SIO_001116')

    @classmethod
    def intersection(cls):
        """an intersection is a list of only the values of an attribute for the entities in the defined set where all entities have that value.
        (cls, http://semanticscience.org/resource/SIO_001117)
        """
        return cls._namespace_SIO('SIO_001117')

    @classmethod
    def sequence(cls):
        """a sequence is an ordered list of entities. Like a set, it contains members (cls, also called elements, or terms).
        (http://semanticscience.org/resource/SIO_001118)
        """
        return cls._namespace_SIO('SIO_001118')

    @classmethod
    def gene_disease_association_linked_with_causal_mutation(cls):
        """a gene-variant disease association in which a mutation in the gene/protein results in the development or maintenance of the disease.
        (cls, http://semanticscience.org/resource/SIO_001119)
        """
        return cls._namespace_SIO('SIO_001119')

    @classmethod
    def therapeutic_gene_disease_association(cls):
        """a gene disease association in which the gene is a therapeutic marker for the disease.
        (cls, http://semanticscience.org/resource/SIO_001120)
        """
        return cls._namespace_SIO('SIO_001120')

    @classmethod
    def gene_disease_association_arising_from_a_therapeutic_role_of_the_gene_protein(cls):
        """a gene disease association in which the gene is a therapeutic marker for the disease.
        (cls, http://semanticscience.org/resource/SIO_001120)
        """
        return cls._namespace_SIO('SIO_001120')

    @classmethod
    def gene_disease_biomarker_association(cls):
        """a gene-disease association in which the gene/protein is involved in the etiology or maintenance of the disease.
        (cls, http://semanticscience.org/resource/SIO_001121)
        """
        return cls._namespace_SIO('SIO_001121')

    @classmethod
    def gene_disease_association_linked_with_genetic_variation(cls):
        """a gene-disease association in which a sequence variation (cls, a mutation, a SNP) is associated with the disease.
        (http://semanticscience.org/resource/SIO_001122)
        """
        return cls._namespace_SIO('SIO_001122')

    @classmethod
    def gene_variant_disease_association(cls):
        """a gene-disease association in which a sequence variation (cls, a mutation, a SNP) is associated with the disease.
        (http://semanticscience.org/resource/SIO_001122)
        """
        return cls._namespace_SIO('SIO_001122')

    @classmethod
    def gene_disease_association_linked_with_altered_gene_expression(cls):
        """a gene-disease association in which the disease phenotype is associated with an altered expression of the gene.
        (cls, http://semanticscience.org/resource/SIO_001123)
        """
        return cls._namespace_SIO('SIO_001123')

    @classmethod
    def gene_disease_association_linked_with_post_translational_modification(cls):
        """a gene-disease association in which the disease phenotype is associated with post-translational modifications in the protein product.
        (cls, http://semanticscience.org/resource/SIO_001124)
        """
        return cls._namespace_SIO('SIO_001124')

    @classmethod
    def regulation_of_transcription(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001125)
        """
        return cls._namespace_SIO('SIO_001125')

    @classmethod
    def regulation_of_translation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001126)
        """
        return cls._namespace_SIO('SIO_001126')

    @classmethod
    def regulation_of_molecular_quantity(cls):
        """A process that modulates the frequency, rate or extent of process involved in the creation or destruction of a molecule.
        (cls, http://semanticscience.org/resource/SIO_001127)
        """
        return cls._namespace_SIO('SIO_001127')

    @classmethod
    def regulation_of_molecular_production(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001128)
        """
        return cls._namespace_SIO('SIO_001128')

    @classmethod
    def regulation_of_molecular_degradation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001129)
        """
        return cls._namespace_SIO('SIO_001129')

    @classmethod
    def protein_mediated_regulation_of_translation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001130)
        """
        return cls._namespace_SIO('SIO_001130')

    @classmethod
    def rna_mediated_regulation_of_translation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001131)
        """
        return cls._namespace_SIO('SIO_001131')

    @classmethod
    def process_maintenance(cls):
        """the process of maintaining some the frequency, rate or extent of another process.
        (cls, http://semanticscience.org/resource/SIO_001132)
        """
        return cls._namespace_SIO('SIO_001132')

    @classmethod
    def increased_frequency_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001133)
        """
        return cls._namespace_SIO('SIO_001133')

    @classmethod
    def decreased_frequency_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001134)
        """
        return cls._namespace_SIO('SIO_001134')

    @classmethod
    def regulation_of_process_frequency(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001135)
        """
        return cls._namespace_SIO('SIO_001135')

    @classmethod
    def regulation_of_process_duration(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001136)
        """
        return cls._namespace_SIO('SIO_001136')

    @classmethod
    def increased_duration_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001137)
        """
        return cls._namespace_SIO('SIO_001137')

    @classmethod
    def decreased_duration_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001138)
        """
        return cls._namespace_SIO('SIO_001138')

    @classmethod
    def regulation_of_process_spatial_extent(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001139)
        """
        return cls._namespace_SIO('SIO_001139')

    @classmethod
    def increased_spatial_extent_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001140)
        """
        return cls._namespace_SIO('SIO_001140')

    @classmethod
    def decreased_spatial_extent_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001141)
        """
        return cls._namespace_SIO('SIO_001141')

    @classmethod
    def maintenance_of_spatial_extent_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001142)
        """
        return cls._namespace_SIO('SIO_001142')

    @classmethod
    def maintenance_of_duration_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001143)
        """
        return cls._namespace_SIO('SIO_001143')

    @classmethod
    def maintenance_of_frequency_of_process(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001144)
        """
        return cls._namespace_SIO('SIO_001144')

    @classmethod
    def regulation_of_participant_quantity(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001145)
        """
        return cls._namespace_SIO('SIO_001145')

    @classmethod
    def increased_object_production(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001146)
        """
        return cls._namespace_SIO('SIO_001146')

    @classmethod
    def decreased_object_production(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001147)
        """
        return cls._namespace_SIO('SIO_001147')

    @classmethod
    def increased_object_consumption(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001148)
        """
        return cls._namespace_SIO('SIO_001148')

    @classmethod
    def decreased_object_consumption(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001149)
        """
        return cls._namespace_SIO('SIO_001149')

    @classmethod
    def regulation_of_object_consumption(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001150)
        """
        return cls._namespace_SIO('SIO_001150')

    @classmethod
    def regulation_of_object_production(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001151)
        """
        return cls._namespace_SIO('SIO_001151')

    @classmethod
    def maintenance_of_object_production(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001152)
        """
        return cls._namespace_SIO('SIO_001152')

    @classmethod
    def maintenance_of_object_consumption(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001153)
        """
        return cls._namespace_SIO('SIO_001153')

    @classmethod
    def number_of_objects_produced(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001160)
        """
        return cls._namespace_SIO('SIO_001160')

    @classmethod
    def number_of_objects_consumed(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001161)
        """
        return cls._namespace_SIO('SIO_001161')

    @classmethod
    def change_in_number_of_objects_produced(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001162)
        """
        return cls._namespace_SIO('SIO_001162')

    @classmethod
    def increase_in_number_of_objects_produced(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001163)
        """
        return cls._namespace_SIO('SIO_001163')

    @classmethod
    def decrease_in_number_of_objects_produced(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001164)
        """
        return cls._namespace_SIO('SIO_001164')

    @classmethod
    def user_account(cls):
        """an user account allows a user to authenticate to system services and be granted authorization to access them.
        (cls, http://semanticscience.org/resource/SIO_001165)
        """
        return cls._namespace_SIO('SIO_001165')

    @classmethod
    def annotation(cls):
        """An annotation is a written explanatory or critical description, or other in-context information (cls, e.g., pattern, motif, link), that has been associated with data or other types of information.
        (http://semanticscience.org/resource/SIO_001166)
        """
        return cls._namespace_SIO('SIO_001166')

    @classmethod
    def comment(cls):
        """a comment is a verbal or written remark often related to an added piece of information, or an observation or statement.
        (cls, http://semanticscience.org/resource/SIO_001167)
        """
        return cls._namespace_SIO('SIO_001167')

    @classmethod
    def audio_recording(cls):
        """an audio recording is an electrical or mechanical inscription and re-creation of sound waves, such as spoken voice, singing, instrumental music, or sound effects.
        (cls, http://semanticscience.org/resource/SIO_001168)
        """
        return cls._namespace_SIO('SIO_001168')

    @classmethod
    def issue(cls):
        """an issue is a single instance of a periodically published journal, magazine, or newspaper.
        (cls, http://semanticscience.org/resource/SIO_001169)
        """
        return cls._namespace_SIO('SIO_001169')

    @classmethod
    def slideshow(cls):
        """a slideshow is a visual presentation of information contained within a collection of slides.
        (cls, http://semanticscience.org/resource/SIO_001170)
        """
        return cls._namespace_SIO('SIO_001170')

    @classmethod
    def database_cross_reference(cls):
        """a database cross-reference is an association between one data item and another
        (cls, http://semanticscience.org/resource/SIO_001171)
        """
        return cls._namespace_SIO('SIO_001171')

    @classmethod
    def dbxref(cls):
        """a database cross-reference is an association between one data item and another
        (cls, http://semanticscience.org/resource/SIO_001171)
        """
        return cls._namespace_SIO('SIO_001171')

    @classmethod
    def exact_cross_reference(cls):
        """an exact cross-reference is a database cross-reference in which one entity is equivalent to the other based on all the entitie's attributes (cls, minus the source)
        (http://semanticscience.org/resource/SIO_001172)
        """
        return cls._namespace_SIO('SIO_001172')

    @classmethod
    def double_stranded_DNA(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001173)
        """
        return cls._namespace_SIO('SIO_001173')

    @classmethod
    def nucleic_acid_strand(cls):
        """a nucleic acid strand is a single-stranded nucleic acid that is part of a double stranded nucleic acid complex.
        (cls, http://semanticscience.org/resource/SIO_001174)
        """
        return cls._namespace_SIO('SIO_001174')

    @classmethod
    def positive_nucleic_acid_strand(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001175)
        """
        return cls._namespace_SIO('SIO_001175')

    @classmethod
    def negative_nucleic_acid_strand(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001176)
        """
        return cls._namespace_SIO('SIO_001176')

    @classmethod
    def double_stranded_nucleic_acid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001177)
        """
        return cls._namespace_SIO('SIO_001177')

    @classmethod
    def double_stranded_RNA(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001178)
        """
        return cls._namespace_SIO('SIO_001178')

    @classmethod
    def full_agreement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001179)
        """
        return cls._namespace_SIO('SIO_001179')

    @classmethod
    def partial_agreement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001180)
        """
        return cls._namespace_SIO('SIO_001180')

    @classmethod
    def full_disagreement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001181)
        """
        return cls._namespace_SIO('SIO_001181')

    @classmethod
    def partial_disagreement(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_001182)
        """
        return cls._namespace_SIO('SIO_001182')

    @classmethod
    def statement(cls):
        """a statement is a proposition that is either (cls, a) a meaningful declarative sentence that is either true or false, or (b) that which a true or false declarative sentence asserts
        (http://semanticscience.org/resource/SIO_001183)
        """
        return cls._namespace_SIO('SIO_001183')

    @classmethod
    def slope(cls):
        """a slope or gradient of a line describes its steepness, incline, or grade. A higher slope value indicates a steeper incline. Slope is normally described by the ratio of the "rise" divided by the "run" between two points on a line.
        (cls, http://semanticscience.org/resource/SIO_001184)
        """
        return cls._namespace_SIO('SIO_001184')

    @classmethod
    def software_process_identifier(cls):
        """a software process identifier is an identifier for a software process in some operating system.
        (cls, http://semanticscience.org/resource/SIO_001185)
        """
        return cls._namespace_SIO('SIO_001185')

    @classmethod
    def organism(cls):
        """a biological organisn is a biological entity that consists of one or more cells and is capable of genomic replication (cls, independently or not).
        (http://semanticscience.org/resource/SIO_010000)
        """
        return cls._namespace_SIO('SIO_010000')

    @classmethod
    def cell(cls):
        """a cell is a biological entity that is contained by a plasma membrane.
        (cls, http://semanticscience.org/resource/SIO_010001)
        """
        return cls._namespace_SIO('SIO_010001')

    @classmethod
    def tissue(cls):
        """a tissue is a mereologically maximal collection of cells that together perform some function.
        (cls, http://semanticscience.org/resource/SIO_010002)
        """
        return cls._namespace_SIO('SIO_010002')

    @classmethod
    def organ(cls):
        """an organ is a collection of tissues joined in structural unit to serve a common function.
        (cls, http://semanticscience.org/resource/SIO_010003)
        """
        return cls._namespace_SIO('SIO_010003')

    @classmethod
    def chemical_entity(cls):
        """A chemical entity is a material entity that pertains to chemistry.
        (cls, http://semanticscience.org/resource/SIO_010004)
        """
        return cls._namespace_SIO('SIO_010004')

    @classmethod
    def weak_submolecular_component(cls):
        """a weak submolecular component is a submolecular component that weakly connects submolecular components.
        (cls, http://semanticscience.org/resource/SIO_010005)
        """
        return cls._namespace_SIO('SIO_010005')

    @classmethod
    def polypeptide(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010007)
        """
        return cls._namespace_SIO('SIO_010007')

    @classmethod
    def nucleic_acid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010008)
        """
        return cls._namespace_SIO('SIO_010008')

    @classmethod
    def ribonucleic_acid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010009)
        """
        return cls._namespace_SIO('SIO_010009')

    @classmethod
    def deoxyribonucleic_acid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010010)
        """
        return cls._namespace_SIO('SIO_010010')

    @classmethod
    def lipid(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010011)
        """
        return cls._namespace_SIO('SIO_010011')

    @classmethod
    def chemical_interaction(cls):
        """A chemical interaction is a biochemical process in which chemical entities interact through some set of attractive forces.
        (cls, http://semanticscience.org/resource/SIO_010013)
        """
        return cls._namespace_SIO('SIO_010013')

    @classmethod
    def primary_structure_descriptor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010014)
        """
        return cls._namespace_SIO('SIO_010014')

    @classmethod
    def protein_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010015)
        """
        return cls._namespace_SIO('SIO_010015')

    @classmethod
    def polypeptide_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010015)
        """
        return cls._namespace_SIO('SIO_010015')

    @classmethod
    def nucleic_acid_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010016)
        """
        return cls._namespace_SIO('SIO_010016')

    @classmethod
    def ribonucleic_acid_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010017)
        """
        return cls._namespace_SIO('SIO_010017')

    @classmethod
    def RNA_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010017)
        """
        return cls._namespace_SIO('SIO_010017')

    @classmethod
    def deoxyribonucleic_acid_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010018)
        """
        return cls._namespace_SIO('SIO_010018')

    @classmethod
    def DNA_sequence(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010018)
        """
        return cls._namespace_SIO('SIO_010018')

    @classmethod
    def biological_data(cls):
        """Biological data is scientific data relevant to biology.
        (cls, http://semanticscience.org/resource/SIO_010019)
        """
        return cls._namespace_SIO('SIO_010019')

    @classmethod
    def submolecular_entity(cls):
        """A submolecular entity is a part of a molecular entity.
        (cls, http://semanticscience.org/resource/SIO_010020)
        """
        return cls._namespace_SIO('SIO_010020')

    @classmethod
    def secondary_structure_descriptor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010022)
        """
        return cls._namespace_SIO('SIO_010022')

    @classmethod
    def tertiary_structure_descriptor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010023)
        """
        return cls._namespace_SIO('SIO_010023')

    @classmethod
    def quaternary_structure(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010024)
        """
        return cls._namespace_SIO('SIO_010024')

    @classmethod
    def carbohydrate_polymer(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010025)
        """
        return cls._namespace_SIO('SIO_010025')

    @classmethod
    def genetic_polymorphism(cls):
        """genetic polymorphism is a biological feature that provides information about a comparative difference in genetic composition.
        (cls, http://semanticscience.org/resource/SIO_010026)
        """
        return cls._namespace_SIO('SIO_010026')

    @classmethod
    def snp(cls):
        """single nucleotide polymorphism (cls, SNP) is a variation in a single base in the genetic composition between different individuals of the same species.
        (http://semanticscience.org/resource/SIO_010027)
        """
        return cls._namespace_SIO('SIO_010027')

    @classmethod
    def genetic_data(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010028)
        """
        return cls._namespace_SIO('SIO_010028')

    @classmethod
    def biological_sex(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010029)
        """
        return cls._namespace_SIO('SIO_010029')

    @classmethod
    def monosaccharide(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010030)
        """
        return cls._namespace_SIO('SIO_010030')

    @classmethod
    def PDB_chain_identifier(cls):
        """A PDB chain identifier is a alphabetical label to identify a molecule in a structure.
        (cls, http://semanticscience.org/resource/SIO_010031)
        """
        return cls._namespace_SIO('SIO_010031')

    @classmethod
    def PDB_record_identifier(cls):
        """A PDB record identifier is an identifier for a PDB generated record.
        (cls, http://semanticscience.org/resource/SIO_010032)
        """
        return cls._namespace_SIO('SIO_010032')

    @classmethod
    def hydrogen_bond(cls):
        """a hydrogen bond is a weak submolecular interaction formed between a hydrogen atom and a electronegative atom.
        (cls, http://semanticscience.org/resource/SIO_010033)
        """
        return cls._namespace_SIO('SIO_010033')

    @classmethod
    def cation_pi_interaction(cls):
        """A cation pi interaction is an ionic interaction between the localized negative charge of  orbital electrons, located above and below the plane of an aromatic ring, and a positive charge.
        (cls, http://semanticscience.org/resource/SIO_010034)
        """
        return cls._namespace_SIO('SIO_010034')

    @classmethod
    def gene(cls):
        """A gene is part of a nucleic acid that contains all the necessary elements to encode a functional transcript.
        (cls, http://semanticscience.org/resource/SIO_010035)
        """
        return cls._namespace_SIO('SIO_010035')

    @classmethod
    def biochemical_reaction(cls):
        """A biochemical reaction is a biochemical process that involves the conversion of at least one chemical participant (cls, target) into another (product) by an enzyme (agent).
        (http://semanticscience.org/resource/SIO_010036)
        """
        return cls._namespace_SIO('SIO_010036')

    @classmethod
    def chemical_element(cls):
        """a chemical element is a homogeneous substance composed of one type of atom.
        (cls, http://semanticscience.org/resource/SIO_010037)
        """
        return cls._namespace_SIO('SIO_010037')

    @classmethod
    def drug(cls):
        """A drug is a chemical entity that regulates a biological process.
        (cls, http://semanticscience.org/resource/SIO_010038)
        """
        return cls._namespace_SIO('SIO_010038')

    @classmethod
    def pharmaceutical_preparation(cls):
        """A pharmaceutical preparation is a chemical substance approved for use in the medical diagnosis, cure, treatment, or prevention of disease.
        (cls, http://semanticscience.org/resource/SIO_010039)
        """
        return cls._namespace_SIO('SIO_010039')

    @classmethod
    def binding_site(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010040)
        """
        return cls._namespace_SIO('SIO_010040')

    @classmethod
    def active_site(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010041)
        """
        return cls._namespace_SIO('SIO_010041')

    @classmethod
    def haplotype(cls):
        """A haplotype is one of a set of genomic sequence variants.
        (cls, http://semanticscience.org/resource/SIO_010042)
        """
        return cls._namespace_SIO('SIO_010042')

    @classmethod
    def protein(cls):
        """a protein is an organic polymer that is composed of a linear polymer of amino acids.
        (cls, http://semanticscience.org/resource/SIO_010043)
        """
        return cls._namespace_SIO('SIO_010043')

    @classmethod
    def atom(cls):
        """An atom is composed of a core of protons and/or neutrons which may be surrounded by a cloud of electrons.
        (cls, http://semanticscience.org/resource/SIO_010044)
        """
        return cls._namespace_SIO('SIO_010044')

    @classmethod
    def base_pair(cls):
        """a base pair is a weak molecular interaction composed of hydrogen bonds between nucleobases.
        (cls, http://semanticscience.org/resource/SIO_010045)
        """
        return cls._namespace_SIO('SIO_010045')

    @classmethod
    def biological_entity(cls):
        """a biological entity is a heterogeneous substance that contains genomic material or is the product of a biological process.
        (cls, http://semanticscience.org/resource/SIO_010046)
        """
        return cls._namespace_SIO('SIO_010046')

    @classmethod
    def strong_submolecular_component(cls):
        """a strong submolecular component is a submolecular component that strongly connects submolecular components.
        (cls, http://semanticscience.org/resource/SIO_010047)
        """
        return cls._namespace_SIO('SIO_010047')

    @classmethod
    def male(cls):
        """male is a biological sex of an individual with male sexual organs.
        (cls, http://semanticscience.org/resource/SIO_010048)
        """
        return cls._namespace_SIO('SIO_010048')

    @classmethod
    def molecular_site(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010049)
        """
        return cls._namespace_SIO('SIO_010049')

    @classmethod
    def allosteric_site(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010050)
        """
        return cls._namespace_SIO('SIO_010050')

    @classmethod
    def biological_fluid(cls):
        """a biological fluid is a fluid of biological origin.
        (cls, http://semanticscience.org/resource/SIO_010051)
        """
        return cls._namespace_SIO('SIO_010051')

    @classmethod
    def female(cls):
        """female is a biological sex of an individual with female sexual organs.
        (cls, http://semanticscience.org/resource/SIO_010052)
        """
        return cls._namespace_SIO('SIO_010052')

    @classmethod
    def lineage(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010053)
        """
        return cls._namespace_SIO('SIO_010053')

    @classmethod
    def cell_line(cls):
        """A cell line is a collection of genetically identifical cells.
        (cls, http://semanticscience.org/resource/SIO_010054)
        """
        return cls._namespace_SIO('SIO_010054')

    @classmethod
    def strain(cls):
        """A strain is a genetic variant or kind of microorganism.
        (cls, http://semanticscience.org/resource/SIO_010055)
        """
        return cls._namespace_SIO('SIO_010055')

    @classmethod
    def phenotype(cls):
        """a phenotype is an observable characteristic of an individual.
        (cls, http://semanticscience.org/resource/SIO_010056)
        """
        return cls._namespace_SIO('SIO_010056')

    @classmethod
    def organismal_stative_quality(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010057)
        """
        return cls._namespace_SIO('SIO_010057')

    @classmethod
    def alive(cls):
        """alive is the state of a biological organism that exhibits biological functions.
        (cls, http://semanticscience.org/resource/SIO_010058)
        """
        return cls._namespace_SIO('SIO_010058')

    @classmethod
    def dead(cls):
        """dead is the quality of an object in which there is a cessation of all biological functions.
        (cls, http://semanticscience.org/resource/SIO_010059)
        """
        return cls._namespace_SIO('SIO_010059')

    @classmethod
    def family_history(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010060)
        """
        return cls._namespace_SIO('SIO_010060')

    @classmethod
    def generation_number(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010061)
        """
        return cls._namespace_SIO('SIO_010061')

    @classmethod
    def a_untranslated_region(cls):
        """The five prime untranslated region (cls, 5' UTR) is a section of messenger RNA (mRNA) and the DNA that codes for it that starts at the +1 position (where transcription begins) and ends one nucleotide before the start codon (usually AUG) of the coding region.
        (http://semanticscience.org/resource/SIO_010064)
        """
        return cls._namespace_SIO('SIO_010064')

    @classmethod
    def bioinformatic_data(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010065)
        """
        return cls._namespace_SIO('SIO_010065')

    @classmethod
    def sequence_alignment(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010066)
        """
        return cls._namespace_SIO('SIO_010066')

    @classmethod
    def multiple_sequence_alignment(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010067)
        """
        return cls._namespace_SIO('SIO_010067')

    @classmethod
    def pairwise_sequence_alignment(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010068)
        """
        return cls._namespace_SIO('SIO_010068')

    @classmethod
    def organic_submolecule(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010071)
        """
        return cls._namespace_SIO('SIO_010071')

    @classmethod
    def organic_molecule(cls):
        """An organic molecular entity is a chemical entity composed of organic atoms (cls, at least carbon, hydrogen, and optionally oxygen, phosphorus, nitrogen)
        (http://semanticscience.org/resource/SIO_010072)
        """
        return cls._namespace_SIO('SIO_010072')

    @classmethod
    def open_reading_frame(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010073)
        """
        return cls._namespace_SIO('SIO_010073')

    @classmethod
    def amino_acid_residue(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010074)
        """
        return cls._namespace_SIO('SIO_010074')

    @classmethod
    def nucleotide_residue(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010075)
        """
        return cls._namespace_SIO('SIO_010075')

    @classmethod
    def poison(cls):
        """A poison is a drug that is harzardous or toxic to an organism when ingested at a certain quantity.
        (cls, http://semanticscience.org/resource/SIO_010076)
        """
        return cls._namespace_SIO('SIO_010076')

    @classmethod
    def active_ingredient(cls):
        """An active ingredient is a molecular entity that exhibits
        (cls, http://semanticscience.org/resource/SIO_010077)
        """
        return cls._namespace_SIO('SIO_010077')

    @classmethod
    def operon(cls):
        """An operon is a collection of contiguous genes transcribed as a single (cls, polycistronic) mRNA.
        (http://semanticscience.org/resource/SIO_010084)
        """
        return cls._namespace_SIO('SIO_010084')

    @classmethod
    def gene_regulatory_component(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010085)
        """
        return cls._namespace_SIO('SIO_010085')

    @classmethod
    def enhancer(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010086)
        """
        return cls._namespace_SIO('SIO_010086')

    @classmethod
    def inactive_ingredient(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010087)
        """
        return cls._namespace_SIO('SIO_010087')

    @classmethod
    def to_serve_as_a_template_for_molecular_synthesis(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010088)
        """
        return cls._namespace_SIO('SIO_010088')

    @classmethod
    def to_serve_as_a_template_for_protein_synthesis(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010089)
        """
        return cls._namespace_SIO('SIO_010089')

    @classmethod
    def to_serve_as_a_template_for_RNA_synthesis(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010090)
        """
        return cls._namespace_SIO('SIO_010090')

    @classmethod
    def to_serve_as_a_template_for_DNA_synthesis(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010091)
        """
        return cls._namespace_SIO('SIO_010091')

    @classmethod
    def deoxyribonucleic_acid_template(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010092)
        """
        return cls._namespace_SIO('SIO_010092')

    @classmethod
    def deoxyribonucleic_acid_primer(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010093)
        """
        return cls._namespace_SIO('SIO_010093')

    @classmethod
    def to_serve_as_a_primer_for_DNA_synthesis(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010094)
        """
        return cls._namespace_SIO('SIO_010094')

    @classmethod
    def RNA_transcript_component(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010095)
        """
        return cls._namespace_SIO('SIO_010095')

    @classmethod
    def mature_mRNA(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010096)
        """
        return cls._namespace_SIO('SIO_010096')

    @classmethod
    def pre_mRNA(cls):
        """Precursor mRNA (cls, pre-mRNA) is a single strand of messenger ribonucleic acid (mRNA) that is synthesized from a DNA template throught transcription.
        (http://semanticscience.org/resource/SIO_010097)
        """
        return cls._namespace_SIO('SIO_010097')

    @classmethod
    def mRNA_splice_variant(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010098)
        """
        return cls._namespace_SIO('SIO_010098')

    @classmethod
    def messenger_RNA(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010099)
        """
        return cls._namespace_SIO('SIO_010099')

    @classmethod
    def dna_gene(cls):
        """a gene that is located on DNA.
        (cls, http://semanticscience.org/resource/SIO_010100)
        """
        return cls._namespace_SIO('SIO_010100')

    @classmethod
    def rna_gene(cls):
        """a gene that is located on RNA
        (cls, http://semanticscience.org/resource/SIO_010101)
        """
        return cls._namespace_SIO('SIO_010101')

    @classmethod
    def allele(cls):
        """an allele is one of a set of sequence variants of a gene.
        (cls, http://semanticscience.org/resource/SIO_010277)
        """
        return cls._namespace_SIO('SIO_010277')

    @classmethod
    def ploidy(cls):
        """Ploidy is the cellular quality relating to the amount of DNA contained in a cell.
        (cls, http://semanticscience.org/resource/SIO_010278)
        """
        return cls._namespace_SIO('SIO_010278')

    @classmethod
    def chemical_transport(cls):
        """Chemical transport is the directed movement of a chemical entity by some agent (cls, e.g. transporter).
        (http://semanticscience.org/resource/SIO_010283)
        """
        return cls._namespace_SIO('SIO_010283')

    @classmethod
    def active_transport(cls):
        """Active transport is the movement of a substance across a membrane against its concentration gradient (cls, from low to high concentration) and requires chemical energy.
        (http://semanticscience.org/resource/SIO_010284)
        """
        return cls._namespace_SIO('SIO_010284')

    @classmethod
    def molecular_complex_formation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010285)
        """
        return cls._namespace_SIO('SIO_010285')

    @classmethod
    def molecular_complex_dissociation(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010286)
        """
        return cls._namespace_SIO('SIO_010286')

    @classmethod
    def regulation_of_biochemical_process(cls):
        """A process that changes the frequency, rate or extent of a biochemical process.
        (cls, http://semanticscience.org/resource/SIO_010287)
        """
        return cls._namespace_SIO('SIO_010287')

    @classmethod
    def biochemical_activation(cls):
        """Biochemical activation is a molecular interaction that increases the catalytic rate of the target enzyme.
        (cls, http://semanticscience.org/resource/SIO_010288)
        """
        return cls._namespace_SIO('SIO_010288')

    @classmethod
    def biochemical_inhibition(cls):
        """Biochemical inhibition is a molecular interaction that decreases the catalytic rate of the target enzyme.
        (cls, http://semanticscience.org/resource/SIO_010289)
        """
        return cls._namespace_SIO('SIO_010289')

    @classmethod
    def process_up_regulation(cls):
        """up-regulation is a process that increases the frequency, rate or extent of one or more processes in relation to a reference state.
        (cls, http://semanticscience.org/resource/SIO_010295)
        """
        return cls._namespace_SIO('SIO_010295')

    @classmethod
    def positive_regulation(cls):
        """up-regulation is a process that increases the frequency, rate or extent of one or more processes in relation to a reference state.
        (cls, http://semanticscience.org/resource/SIO_010295)
        """
        return cls._namespace_SIO('SIO_010295')

    @classmethod
    def process_down_regulation(cls):
        """down-regulation is a process that decreases the frequency, rate or extent of one or more processes in relation to a reference state.
        (cls, http://semanticscience.org/resource/SIO_010296)
        """
        return cls._namespace_SIO('SIO_010296')

    @classmethod
    def negative_regulation(cls):
        """down-regulation is a process that decreases the frequency, rate or extent of one or more processes in relation to a reference state.
        (cls, http://semanticscience.org/resource/SIO_010296)
        """
        return cls._namespace_SIO('SIO_010296')

    @classmethod
    def medical_data(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010298)
        """
        return cls._namespace_SIO('SIO_010298')

    @classmethod
    def disease(cls):
        """disease is the outward manifestation of one or more disorders.
        (cls, http://semanticscience.org/resource/SIO_010299)
        """
        return cls._namespace_SIO('SIO_010299')

    @classmethod
    def transcription(cls):
        """Transcription is the process of creating a complementary RNA copy of a sequence of DNA.
        (cls, http://semanticscience.org/resource/SIO_010300)
        """
        return cls._namespace_SIO('SIO_010300')

    @classmethod
    def translation(cls):
        """Translation is the process of producing a polypeptide from a ribonucleic acid by a ribosome.
        (cls, http://semanticscience.org/resource/SIO_010301)
        """
        return cls._namespace_SIO('SIO_010301')

    @classmethod
    def molecular_modification(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010307)
        """
        return cls._namespace_SIO('SIO_010307')

    @classmethod
    def metabolism(cls):
        """Metabolism is the set of chemical processes that occur within a living organism in order to maintain life.
        (cls, http://semanticscience.org/resource/SIO_010308)
        """
        return cls._namespace_SIO('SIO_010308')

    @classmethod
    def catabolism(cls):
        """Anabolism is the set of metabolic processes that take apart larger chemical entities units into smaller chemical entities.
        (cls, http://semanticscience.org/resource/SIO_010309)
        """
        return cls._namespace_SIO('SIO_010309')

    @classmethod
    def anabolism(cls):
        """Anabolism is the set of metabolic processes that construct larger chemical entities units from smaller chemical entities.
        (cls, http://semanticscience.org/resource/SIO_010310)
        """
        return cls._namespace_SIO('SIO_010310')

    @classmethod
    def carbohydrate_residue(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010334)
        """
        return cls._namespace_SIO('SIO_010334')

    @classmethod
    def nucleic_acid_part(cls):
        """a nucleic acid part is a component of a nucleic acid.
        (cls, http://semanticscience.org/resource/SIO_010335)
        """
        return cls._namespace_SIO('SIO_010335')

    @classmethod
    def deoxyribonucleotide_residue(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010336)
        """
        return cls._namespace_SIO('SIO_010336')

    @classmethod
    def ribonucleotide_residue(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010337)
        """
        return cls._namespace_SIO('SIO_010337')

    @classmethod
    def pharmaceutical_component(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010338)
        """
        return cls._namespace_SIO('SIO_010338')

    @classmethod
    def to_covalently_modify(cls):
        """to covalently modify is to materially change a molecule by adding or removing covalent bonds between atoms.
        (cls, http://semanticscience.org/resource/SIO_010340)
        """
        return cls._namespace_SIO('SIO_010340')

    @classmethod
    def covalently_connected_entity(cls):
        """A covalently connected molecular entity is the mereological sum of a collection of covalently bonded atoms.
        (cls, http://semanticscience.org/resource/SIO_010341)
        """
        return cls._namespace_SIO('SIO_010341')

    @classmethod
    def chemical_complex(cls):
        """a chemical complex is a chemical entity composed of a weakly connected ions or molecules.
        (cls, http://semanticscience.org/resource/SIO_010342)
        """
        return cls._namespace_SIO('SIO_010342')

    @classmethod
    def enzyme(cls):
        """an enzyme is a protein or protein complex that realizes its disposition to covalently modify some molecule during a chemical reaction.
        (cls, http://semanticscience.org/resource/SIO_010343)
        """
        return cls._namespace_SIO('SIO_010343')

    @classmethod
    def catalyst(cls):
        """a catalyst is a molecule that has the capability to reduce the activation energy of a reaction and hence increase the overall rate of reaction.
        (cls, http://semanticscience.org/resource/SIO_010344)
        """
        return cls._namespace_SIO('SIO_010344')

    @classmethod
    def chemical_reaction(cls):
        """A chemical reaction is a process that leads to the transformation of one set of chemical substances to another.
        (cls, http://semanticscience.org/resource/SIO_010345)
        """
        return cls._namespace_SIO('SIO_010345')

    @classmethod
    def organic_polymer(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010346)
        """
        return cls._namespace_SIO('SIO_010346')

    @classmethod
    def to_modify_conformation_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010347)
        """
        return cls._namespace_SIO('SIO_010347')

    @classmethod
    def to_cleave(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010349)
        """
        return cls._namespace_SIO('SIO_010349')

    @classmethod
    def to_combine(cls):
        """to combine is the capability to modify a set of objects in a way that the object is merged with another object to form a new object or substance.
        (cls, http://semanticscience.org/resource/SIO_010351)
        """
        return cls._namespace_SIO('SIO_010351')

    @classmethod
    def to_breathe(cls):
        """to breathe is the capability to inhale and exhale air into the body during respiration.
        (cls, http://semanticscience.org/resource/SIO_010353)
        """
        return cls._namespace_SIO('SIO_010353')

    @classmethod
    def to_conformationally_activate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010354)
        """
        return cls._namespace_SIO('SIO_010354')

    @classmethod
    def to_conformationally_inhibit(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010355)
        """
        return cls._namespace_SIO('SIO_010355')

    @classmethod
    def to_modify_oxidation_state_of(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010360)
        """
        return cls._namespace_SIO('SIO_010360')

    @classmethod
    def substrate(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010362)
        """
        return cls._namespace_SIO('SIO_010362')

    @classmethod
    def product(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010363)
        """
        return cls._namespace_SIO('SIO_010363')

    @classmethod
    def to_be_modified(cls):
        """to be modified is the capability to be actively interacted with in such a way that it leads to a physical reconfiguration.
        (cls, http://semanticscience.org/resource/SIO_010364)
        """
        return cls._namespace_SIO('SIO_010364')

    @classmethod
    def to_be_cleaved(cls):
        """to be cleaved is the capability to be modified in a way that splits one part of the object from the other.
        (cls, http://semanticscience.org/resource/SIO_010365)
        """
        return cls._namespace_SIO('SIO_010365')

    @classmethod
    def to_be_covalently_modified(cls):
        """to be covalently modified is the capability of a chemical entity to have bonds added or removed
        (cls, http://semanticscience.org/resource/SIO_010366)
        """
        return cls._namespace_SIO('SIO_010366')

    @classmethod
    def to_be_combined(cls):
        """to be combined is the capability to be modified in a way that the object is merged with another object to form a new object or substance.
        (cls, http://semanticscience.org/resource/SIO_010367)
        """
        return cls._namespace_SIO('SIO_010367')

    @classmethod
    def to_be_transported(cls):
        """to be transported is the disposition to undergo motion.
        (cls, http://semanticscience.org/resource/SIO_010368)
        """
        return cls._namespace_SIO('SIO_010368')

    @classmethod
    def to_be_electronically_modified(cls):
        """to be electronically modified is the capability of a chemical entity to have electrons added or removed
        (cls, http://semanticscience.org/resource/SIO_010369)
        """
        return cls._namespace_SIO('SIO_010369')

    @classmethod
    def to_gain_an_electron(cls):
        """to gain an electron is the capability of a chemical entity to receive an electron.
        (cls, http://semanticscience.org/resource/SIO_010370)
        """
        return cls._namespace_SIO('SIO_010370')

    @classmethod
    def to_lose_an_electron(cls):
        """to lose an electron is the capability of a chemical entity to lose an electron.
        (cls, http://semanticscience.org/resource/SIO_010371)
        """
        return cls._namespace_SIO('SIO_010371')

    @classmethod
    def to_be_activated(cls):
        """to be activated is the capability to be modified in such a way that the conformational change leads to an increase in another capability.
        (cls, http://semanticscience.org/resource/SIO_010372)
        """
        return cls._namespace_SIO('SIO_010372')

    @classmethod
    def to_be_inhibited(cls):
        """to be inhibited is the capability to be modified in such a way that the conformational change leads to an decrease in another capability.
        (cls, http://semanticscience.org/resource/SIO_010373)
        """
        return cls._namespace_SIO('SIO_010373')

    @classmethod
    def to_be_conformationally_changed(cls):
        """to be conformationally changed is the capability to be modified in such a way that the object's conformation is changed.
        (cls, http://semanticscience.org/resource/SIO_010374)
        """
        return cls._namespace_SIO('SIO_010374')

    @classmethod
    def multicellular_organism(cls):
        """a multi-cellular organism is an organism that consists of more than one cell.
        (cls, http://semanticscience.org/resource/SIO_010375)
        """
        return cls._namespace_SIO('SIO_010375')

    @classmethod
    def unicellular_organism(cls):
        """a unicellular organism is a organism that is composed of a single cell.
        (cls, http://semanticscience.org/resource/SIO_010376)
        """
        return cls._namespace_SIO('SIO_010376')

    @classmethod
    def cellular_organism(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010377)
        """
        return cls._namespace_SIO('SIO_010377')

    @classmethod
    def non_cellular_organism(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010378)
        """
        return cls._namespace_SIO('SIO_010378')

    @classmethod
    def virus(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010379)
        """
        return cls._namespace_SIO('SIO_010379')

    @classmethod
    def drug_regulatory_authority(cls):
        """A drug regulatory authority is a regulatory authority which acts to control what substances may be used to treat individuals.
        (cls, http://semanticscience.org/resource/SIO_010383)
        """
        return cls._namespace_SIO('SIO_010383')

    @classmethod
    def specialized_chemical_entity(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010410)
        """
        return cls._namespace_SIO('SIO_010410')

    @classmethod
    def reagent(cls):
        """A reagent is a substance that is added to a system in order to bring about a chemical reaction, or added to see if a reaction occurs.
        (cls, http://semanticscience.org/resource/SIO_010411)
        """
        return cls._namespace_SIO('SIO_010411')

    @classmethod
    def specimen(cls):
        """A specimen is a portion of material for use in testing, examination, or study.
        (cls, http://semanticscience.org/resource/SIO_010412)
        """
        return cls._namespace_SIO('SIO_010412')

    @classmethod
    def pathogen(cls):
        """A pathogen or infectious agent  is a microorganism that causes disease in its host.
        (cls, http://semanticscience.org/resource/SIO_010414)
        """
        return cls._namespace_SIO('SIO_010414')

    @classmethod
    def host(cls):
        """a host is an organism that harbors a parasite, or a mutual or commensal symbiont, typically providing nourishment and shelter.
        (cls, http://semanticscience.org/resource/SIO_010415)
        """
        return cls._namespace_SIO('SIO_010415')

    @classmethod
    def buffer(cls):
        """A buffer is a dissolved chemical substance that resists change in pH upon addition of small amounts of acid or base.
        (cls, http://semanticscience.org/resource/SIO_010416)
        """
        return cls._namespace_SIO('SIO_010416')

    @classmethod
    def solvent(cls):
        """A solvent is a substance that can dissolve other substances (cls, solutes).
        (http://semanticscience.org/resource/SIO_010417)
        """
        return cls._namespace_SIO('SIO_010417')

    @classmethod
    def solute(cls):
        """a solute is a substance that becomes dissolved in a solvent.
        (cls, http://semanticscience.org/resource/SIO_010418)
        """
        return cls._namespace_SIO('SIO_010418')

    @classmethod
    def antigen(cls):
        """An antigen is a chemical entity that can be bound by a major histocompatibility complex (cls, MHC) and presented to a T-cell receptor.
        (http://semanticscience.org/resource/SIO_010419)
        """
        return cls._namespace_SIO('SIO_010419')

    @classmethod
    def receptor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010420)
        """
        return cls._namespace_SIO('SIO_010420')

    @classmethod
    def target(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010423)
        """
        return cls._namespace_SIO('SIO_010423')

    @classmethod
    def centrifugation_pellet(cls):
        """a centrifugation pellet is a solid substance that forms as a result of compaction by a centrifuge.
        (cls, http://semanticscience.org/resource/SIO_010424)
        """
        return cls._namespace_SIO('SIO_010424')

    @classmethod
    def supernatant(cls):
        """a supernatent is a liquid substance that remains after centrifugation.
        (cls, http://semanticscience.org/resource/SIO_010425)
        """
        return cls._namespace_SIO('SIO_010425')

    @classmethod
    def centrifugation_substance(cls):
        """a centrifugation substance is a substance that is the target or product of centrifugation.
        (cls, http://semanticscience.org/resource/SIO_010426)
        """
        return cls._namespace_SIO('SIO_010426')

    @classmethod
    def liquid_solution_component(cls):
        """a liquid solution component is a part of a liquid solution.
        (cls, http://semanticscience.org/resource/SIO_010427)
        """
        return cls._namespace_SIO('SIO_010427')

    @classmethod
    def evaluation_role(cls):
        """an evaluation role is a processual role held by an entity during some evaluation
        (cls, http://semanticscience.org/resource/SIO_010428)
        """
        return cls._namespace_SIO('SIO_010428')

    @classmethod
    def placebo(cls):
        """A placebo is a medically ineffectual treatment for a medical condition intended to deceive the recipient.
        (cls, http://semanticscience.org/resource/SIO_010429)
        """
        return cls._namespace_SIO('SIO_010429')

    @classmethod
    def test_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010430)
        """
        return cls._namespace_SIO('SIO_010430')

    @classmethod
    def control_role(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010431)
        """
        return cls._namespace_SIO('SIO_010431')

    @classmethod
    def ligand(cls):
        """a ligand is a molecule that is part of a complex by weakly interacting with another molecule
        (cls, http://semanticscience.org/resource/SIO_010432)
        """
        return cls._namespace_SIO('SIO_010432')

    @classmethod
    def low_barrier_hydrogen_bond(cls):
        """a low barrier hydrogen bond is a shorter, stronger hydrogen bond that is formed between both heteroatoms.
        (cls, http://semanticscience.org/resource/SIO_010433)
        """
        return cls._namespace_SIO('SIO_010433')

    @classmethod
    def activator(cls):
        """a molecular activator is a molecular regulator that realizes its disposition to conformationally change a target molecule and increase its functionality.
        (cls, http://semanticscience.org/resource/SIO_010434)
        """
        return cls._namespace_SIO('SIO_010434')

    @classmethod
    def inhibitor(cls):
        """a molecular inhibitor is a molecular regulator that realizes its disposition to conformationally change a target molecule and decrease its functionality.
        (cls, http://semanticscience.org/resource/SIO_010435)
        """
        return cls._namespace_SIO('SIO_010435')

    @classmethod
    def molecular_regulator(cls):
        """a molecular regulator is a molecule that regulates the function of another chemical entity.
        (cls, http://semanticscience.org/resource/SIO_010436)
        """
        return cls._namespace_SIO('SIO_010436')

    @classmethod
    def signal_transducer(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010437)
        """
        return cls._namespace_SIO('SIO_010437')

    @classmethod
    def signal(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010438)
        """
        return cls._namespace_SIO('SIO_010438')

    @classmethod
    def messenger(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010439)
        """
        return cls._namespace_SIO('SIO_010439')

    @classmethod
    def second_messenger(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010440)
        """
        return cls._namespace_SIO('SIO_010440')

    @classmethod
    def submolecule(cls):
        """a submolecule is a mereological sum of covalently bonded atoms
        (cls, http://semanticscience.org/resource/SIO_010441)
        """
        return cls._namespace_SIO('SIO_010441')

    @classmethod
    def charge_quality(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010442)
        """
        return cls._namespace_SIO('SIO_010442')

    @classmethod
    def intron(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010443)
        """
        return cls._namespace_SIO('SIO_010443')

    @classmethod
    def gene_component(cls):
        """a gene component is a component of a gene, whether DNA or RNA
        (cls, http://semanticscience.org/resource/SIO_010444)
        """
        return cls._namespace_SIO('SIO_010444')

    @classmethod
    def exon(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010445)
        """
        return cls._namespace_SIO('SIO_010445')

    @classmethod
    def promoter(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010446)
        """
        return cls._namespace_SIO('SIO_010446')

    @classmethod
    def start_codon(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010447)
        """
        return cls._namespace_SIO('SIO_010447')

    @classmethod
    def stop_codon(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010448)
        """
        return cls._namespace_SIO('SIO_010448')

    @classmethod
    def RNA_transcript(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010450)
        """
        return cls._namespace_SIO('SIO_010450')

    @classmethod
    def splice_site(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010451)
        """
        return cls._namespace_SIO('SIO_010451')

    @classmethod
    def molecular_pocket(cls):
        """a molecular pocket is a site on a molecule that appears as a depression into the structure.
        (cls, http://semanticscience.org/resource/SIO_010452)
        """
        return cls._namespace_SIO('SIO_010452')

    @classmethod
    def acid(cls):
        """An acid is a molecular entity in solution capable of donating a hydron (cls, Bronsted acid) or capable of forming a covalent bond with an electron pair (Lewis acid).
        (http://semanticscience.org/resource/SIO_010453)
        """
        return cls._namespace_SIO('SIO_010453')

    @classmethod
    def base(cls):
        """A base is a molecular entity dissolved in a solvent that is capable of accepting a proton (cls, Bronsted base) or forming a covalent bond with a hydron (Lewis base) .
        (http://semanticscience.org/resource/SIO_010454)
        """
        return cls._namespace_SIO('SIO_010454')

    @classmethod
    def isomer(cls):
        """An isomer is a molecule that is compositionally identical to another molecule as a result of a different atomic connectivity.
        (cls, http://semanticscience.org/resource/SIO_010455)
        """
        return cls._namespace_SIO('SIO_010455')

    @classmethod
    def ion(cls):
        """An ion is an atom or molecule in which the total number of electrons is not equal to the total number of protons, giving it a net positive or negative electrical charge.
        (cls, http://semanticscience.org/resource/SIO_010456)
        """
        return cls._namespace_SIO('SIO_010456')

    @classmethod
    def cation(cls):
        """An anion is an atom or molecule with a net positive electrical charge.
        (cls, http://semanticscience.org/resource/SIO_010457)
        """
        return cls._namespace_SIO('SIO_010457')

    @classmethod
    def anion(cls):
        """An anion is an atom or molecule with a net negative electrical charge.
        (cls, http://semanticscience.org/resource/SIO_010458)
        """
        return cls._namespace_SIO('SIO_010458')

    @classmethod
    def polar_solvent(cls):
        """a polar solvent is a solvent that exhibits a polar quality.
        (cls, http://semanticscience.org/resource/SIO_010459)
        """
        return cls._namespace_SIO('SIO_010459')

    @classmethod
    def nonpolar_solvent(cls):
        """a non-polar solvent is a solvent that exhibits a non-polar quality.
        (cls, http://semanticscience.org/resource/SIO_010460)
        """
        return cls._namespace_SIO('SIO_010460')

    @classmethod
    def positive_charge(cls):
        """a positive charge is a charge where the value is positive.
        (cls, http://semanticscience.org/resource/SIO_010461)
        """
        return cls._namespace_SIO('SIO_010461')

    @classmethod
    def heterogeneous_substance(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010462)
        """
        return cls._namespace_SIO('SIO_010462')

    @classmethod
    def homogeneous_substance(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010463)
        """
        return cls._namespace_SIO('SIO_010463')

    @classmethod
    def negative_charge(cls):
        """a negative charge is a charge where the value is negative.
        (cls, http://semanticscience.org/resource/SIO_010464)
        """
        return cls._namespace_SIO('SIO_010464')

    @classmethod
    def antibody(cls):
        """An antibody (cls, also known as immunoglobulins, abbreviated Ig) are gamma globulin proteins that are used by the immune system to identify and neutralize foreign objects. They are typically made of two large heavy chains and two small light chains.
        (http://semanticscience.org/resource/SIO_010465)
        """
        return cls._namespace_SIO('SIO_010465')

    @classmethod
    def alpha_helix(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010468)
        """
        return cls._namespace_SIO('SIO_010468')

    @classmethod
    def beta_strand(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010469)
        """
        return cls._namespace_SIO('SIO_010469')

    @classmethod
    def protein_part(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010471)
        """
        return cls._namespace_SIO('SIO_010471')

    @classmethod
    def ionic_interaction(cls):
        """an ionic interaction is a weak submolecular interaction between a charged submolecules.
        (cls, http://semanticscience.org/resource/SIO_010496)
        """
        return cls._namespace_SIO('SIO_010496')

    @classmethod
    def protein_complex(cls):
        """a protein complex is a molecular complex composed of at least two polypeptide chains.
        (cls, http://semanticscience.org/resource/SIO_010497)
        """
        return cls._namespace_SIO('SIO_010497')

    @classmethod
    def single_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010498)
        """
        return cls._namespace_SIO('SIO_010498')

    @classmethod
    def double_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010499)
        """
        return cls._namespace_SIO('SIO_010499')

    @classmethod
    def triple_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010500)
        """
        return cls._namespace_SIO('SIO_010500')

    @classmethod
    def aromatic_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010501)
        """
        return cls._namespace_SIO('SIO_010501')

    @classmethod
    def disulfide_bond(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010502)
        """
        return cls._namespace_SIO('SIO_010502')

    @classmethod
    def dipole_dipole_interaction(cls):
        """a dipole-dipole interaction is a weak submolecular interaction between strongly electronegative atoms.
        (cls, http://semanticscience.org/resource/SIO_010503)
        """
        return cls._namespace_SIO('SIO_010503')

    @classmethod
    def van_der_Waals_interaction(cls):
        """van der Waals' interaction is an a weak submolecular interaction between an instantaneous dipole and induced dipole.
        (cls, http://semanticscience.org/resource/SIO_010504)
        """
        return cls._namespace_SIO('SIO_010504')

    @classmethod
    def base_stack(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010505)
        """
        return cls._namespace_SIO('SIO_010505')

    @classmethod
    def molecular_complex(cls):
        """a molecular complex is a chemical complex composed of weakly interacting molecular entities, and excludes bulk solvent.
        (cls, http://semanticscience.org/resource/SIO_010506)
        """
        return cls._namespace_SIO('SIO_010506')

    @classmethod
    def acid_base_reaction(cls):
        """an acid-base reaction is a chemical reaction between an acid and a base.
        (cls, http://semanticscience.org/resource/SIO_010507)
        """
        return cls._namespace_SIO('SIO_010507')

    @classmethod
    def catalyzed_reaction(cls):
        """a catalyzed reaction is a chemical reaction that is facilitated by a catalyst.
        (cls, http://semanticscience.org/resource/SIO_010508)
        """
        return cls._namespace_SIO('SIO_010508')

    @classmethod
    def redox_reaction(cls):
        """a redox reaction is a chemical reaction in which there is a net movement of electrons from one reactant to another.
        (cls, http://semanticscience.org/resource/SIO_010509)
        """
        return cls._namespace_SIO('SIO_010509')

    @classmethod
    def inorganic_reaction(cls):
        """An inorganic reaction is a chemical reaction that involves the transformation of inorganic molecules.
        (cls, http://semanticscience.org/resource/SIO_010510)
        """
        return cls._namespace_SIO('SIO_010510')

    @classmethod
    def decomposition_reaction(cls):
        """A decomposition reaction is an inorganic reaction in which molecule is fragmented into submolecules or atoms.
        (cls, http://semanticscience.org/resource/SIO_010511)
        """
        return cls._namespace_SIO('SIO_010511')

    @classmethod
    def displacement_reaction(cls):
        """A displacement reaction is an inorganic reaction in which a elementary substance displaces and sets free a constituent atom from a molecule.
        (cls, http://semanticscience.org/resource/SIO_010512)
        """
        return cls._namespace_SIO('SIO_010512')

    @classmethod
    def double_displacement_reaction(cls):
        """A double displacement reaction is a displacement reaction in which two molecules swap ions, effectively displacing each other to form two new molecules.
        (cls, http://semanticscience.org/resource/SIO_010513)
        """
        return cls._namespace_SIO('SIO_010513')

    @classmethod
    def single_displacement_reaction(cls):
        """A single displacement reaction where one atom is transferred out of one molecule and into another.
        (cls, http://semanticscience.org/resource/SIO_010514)
        """
        return cls._namespace_SIO('SIO_010514')

    @classmethod
    def synthesis_reaction(cls):
        """A synthesis reaction is an inorganic reaction in which two or more molecules are chemically bonded together to produce a single product.
        (cls, http://semanticscience.org/resource/SIO_010515)
        """
        return cls._namespace_SIO('SIO_010515')

    @classmethod
    def organic_reaction(cls):
        """An organic reaction is a chemical reaction involving at least one organic molecule.
        (cls, http://semanticscience.org/resource/SIO_010516)
        """
        return cls._namespace_SIO('SIO_010516')

    @classmethod
    def isomerization_reaction(cls):
        """An isomerization reaction is a chemical reaction in which a molecule is converted into its isomer.
        (cls, http://semanticscience.org/resource/SIO_010517)
        """
        return cls._namespace_SIO('SIO_010517')

    @classmethod
    def addition_reaction(cls):
        """An addition reaction is an organic reaction where two or more molecules combine to form a larger one. Addition reactions are limited to chemical compounds that have multiply-bonded atoms:
                * Molecules with carbon-carbon double bonds or triple bonds
                * Molecules with carbon - hetero double bonds like C=O or C=N
        (cls, http://semanticscience.org/resource/SIO_010518)
        """
        return cls._namespace_SIO('SIO_010518')

    @classmethod
    def polar_addition_reaction(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010519)
        """
        return cls._namespace_SIO('SIO_010519')

    @classmethod
    def non_polar_addition_reaction(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010520)
        """
        return cls._namespace_SIO('SIO_010520')

    @classmethod
    def free_radical_addition(cls):
        """A free radical addition is a non-polar addition reaction involving free radicals.
        (cls, http://semanticscience.org/resource/SIO_010521)
        """
        return cls._namespace_SIO('SIO_010521')

    @classmethod
    def nucleophilic_addition_reaction(cls):
        """A nucleophilic addition reaction is an addition reaction where a pi bond is removed by the creation of two new covalent bonds by the addition from a nucleophile.
        (cls, http://semanticscience.org/resource/SIO_010522)
        """
        return cls._namespace_SIO('SIO_010522')

    @classmethod
    def electrophilic_addition_reaction(cls):
        """an electrophilic addition reaction is a polar addition reaction where a pi bond is removed by the creation of two new covalent bonds.
        (cls, http://semanticscience.org/resource/SIO_010523)
        """
        return cls._namespace_SIO('SIO_010523')

    @classmethod
    def biochemical_pathway(cls):
        """a biochemical pathway specifies a series of biochemical modifications and transformations towards achieving some biological outcome.
        (cls, http://semanticscience.org/resource/SIO_010525)
        """
        return cls._namespace_SIO('SIO_010525')

    @classmethod
    def chemical_reaction_pathway(cls):
        """a chemical reaction pathway specifies a series of chemical reactions towards producing some chemical product.
        (cls, http://semanticscience.org/resource/SIO_010526)
        """
        return cls._namespace_SIO('SIO_010526')

    @classmethod
    def chemical_synthesis_pathway(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010527)
        """
        return cls._namespace_SIO('SIO_010527')

    @classmethod
    def chemical_degradation_pathway(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010528)
        """
        return cls._namespace_SIO('SIO_010528')

    @classmethod
    def a_d_structure_model(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010530)
        """
        return cls._namespace_SIO('SIO_010530')

    @classmethod
    def sequence_profile(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010531)
        """
        return cls._namespace_SIO('SIO_010531')

    @classmethod
    def metabolic_pathway(cls):
        """a metabolic pathway is a series of biochemical reactions that begins with one or more substrates and ends with one or more products.
        (cls, http://semanticscience.org/resource/SIO_010532)
        """
        return cls._namespace_SIO('SIO_010532')

    @classmethod
    def regulatory_pathway(cls):
        """a regulatory pathway is a series of biochemical reactions that lead to the increase or decrease of activity of participating molecular components.
        (cls, http://semanticscience.org/resource/SIO_010533)
        """
        return cls._namespace_SIO('SIO_010533')

    @classmethod
    def medical_history(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010673)
        """
        return cls._namespace_SIO('SIO_010673')

    @classmethod
    def binary_compound(cls):
        """a binary compound is a mereological maximum sum of two kinds of weakly connected entities.
        (cls, http://semanticscience.org/resource/SIO_010674)
        """
        return cls._namespace_SIO('SIO_010674')

    @classmethod
    def stereoisomer(cls):
        """A stereoisomer is an isomer in which the atomic connectivity is the same, but differs in its spatial arrangement of atoms.
        (cls, http://semanticscience.org/resource/SIO_010775)
        """
        return cls._namespace_SIO('SIO_010775')

    @classmethod
    def diastereomer(cls):
        """A diastereomer is a stereoisomer that is not a mirror image of its isomer.
        (cls, http://semanticscience.org/resource/SIO_010776)
        """
        return cls._namespace_SIO('SIO_010776')

    @classmethod
    def enantiomer(cls):
        """An enantiomer is a stereoisomer that is a mirror image of its isomer.
        (cls, http://semanticscience.org/resource/SIO_010777)
        """
        return cls._namespace_SIO('SIO_010777')

    @classmethod
    def optical_isomer(cls):
        """An optical isomer is a stereoisomer that rotates the plane of polarization of a beam of plane polarized light.
        (cls, http://semanticscience.org/resource/SIO_010778)
        """
        return cls._namespace_SIO('SIO_010778')

    @classmethod
    def structural_isomer(cls):
        """A structural isomer is an isomer in which the atoms are joined together in different ways.
        (cls, http://semanticscience.org/resource/SIO_010779)
        """
        return cls._namespace_SIO('SIO_010779')

    @classmethod
    def ring(cls):
        """a ring is a submolecule with a circular topology.
        (cls, http://semanticscience.org/resource/SIO_010780)
        """
        return cls._namespace_SIO('SIO_010780')

    @classmethod
    def aromatic_ring(cls):
        """An aromatic ring is a ring in which the electrons are delocalized across all atoms in the ring.
        (cls, http://semanticscience.org/resource/SIO_010781)
        """
        return cls._namespace_SIO('SIO_010781')

    @classmethod
    def heterocyclic_ring(cls):
        """a heterocyclic ring is a ring containing a hetero atom.
        (cls, http://semanticscience.org/resource/SIO_010782)
        """
        return cls._namespace_SIO('SIO_010782')

    @classmethod
    def homocyclic_ring(cls):
        """A homocyclic ring is a ring where the atoms are of a single type.
        (cls, http://semanticscience.org/resource/SIO_010783)
        """
        return cls._namespace_SIO('SIO_010783')

    @classmethod
    def ionic_compound(cls):
        """an ionic compound is a mereological maximal sum of weakly connected paired positive and negative ions.
        (cls, http://semanticscience.org/resource/SIO_010784)
        """
        return cls._namespace_SIO('SIO_010784')

    @classmethod
    def allotrope(cls):
        """an allotrope is a structural variant of a chemical element.
        (cls, http://semanticscience.org/resource/SIO_010785)
        """
        return cls._namespace_SIO('SIO_010785')

    @classmethod
    def carbon_allotrope(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_010786)
        """
        return cls._namespace_SIO('SIO_010786')

    @classmethod
    def diamond(cls):
        """Diamond is a carbon allotrope in which each carbon atom in diamond is covalently bonded to four other carbons in a tetrahedron. These tetrahedrons together form a 3-dimensional network of puckered six-membered rings of atoms.
        (cls, http://semanticscience.org/resource/SIO_010787)
        """
        return cls._namespace_SIO('SIO_010787')

    @classmethod
    def graphite(cls):
        """graphite is an allotrope of carbon which is a conductor, and is the most stable form of solid carbon.
        (cls, http://semanticscience.org/resource/SIO_010788)
        """
        return cls._namespace_SIO('SIO_010788')

    @classmethod
    def fullerene(cls):
        """Fullerene is a carbon allotrope which take the form of a hollow sphere, ellipsoid, or tube.
        (cls, http://semanticscience.org/resource/SIO_010789)
        """
        return cls._namespace_SIO('SIO_010789')

    @classmethod
    def aggregated_carbon_nanorods(cls):
        """aggregate of carbon nanorods is an allotrope of carbon considered to be the least compressible material known, as measured by its isothermal bulk modulus; aggregated diamond nanorods have a modulus of 491 gigapascals (cls, GPa), while a conventional diamond has a modulus of 442 GPa. ADNRs are also 0.3% denser than regular diamond.
        (http://semanticscience.org/resource/SIO_010790)
        """
        return cls._namespace_SIO('SIO_010790')

    @classmethod
    def amorphous_carbon(cls):
        """Amorphous carbon is an allotrope of carbon that does not have any crystalline structure. As with all glassy materials, some short-range order can be observed, but there is no long-range pattern of atomic positions.
        (cls, http://semanticscience.org/resource/SIO_010791)
        """
        return cls._namespace_SIO('SIO_010791')

    @classmethod
    def carbon_nanofoam(cls):
        """carbon nanofoam is an allotrope of carbon that consists of a low-density cluster-assembly of carbon atoms strung together in a loose three-dimensional web. Each cluster is about 6 nanometers wide and consists of about 4000 carbon atoms linked in graphite-like sheets that are given negative curvature by the inclusion of heptagons among the regular hexagonal pattern.
        (cls, http://semanticscience.org/resource/SIO_010792)
        """
        return cls._namespace_SIO('SIO_010792')

    @classmethod
    def chaoite(cls):
        """chaoite is an allotrope of carbon that is slightly harder than graphite with a reflection colour of grey to white.
        (cls, http://semanticscience.org/resource/SIO_010793)
        """
        return cls._namespace_SIO('SIO_010793')

    @classmethod
    def glassy_carbon(cls):
        """glassy carbon is an allotrope of carbon which is widely used as an electrode material in electrochemistry, as well as for high temperature crucibles and as a component of some prosthetic devices.
        (cls, http://semanticscience.org/resource/SIO_010794)
        """
        return cls._namespace_SIO('SIO_010794')

    @classmethod
    def ionsdaleite(cls):
        """ionsdaleite is a hexagonal allotrope of the carbon allotrope diamond.
        (cls, http://semanticscience.org/resource/SIO_010795)
        """
        return cls._namespace_SIO('SIO_010795')

    @classmethod
    def boron_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011000)
        """
        return cls._namespace_SIO('SIO_011000')

    @classmethod
    def carbon_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011001)
        """
        return cls._namespace_SIO('SIO_011001')

    @classmethod
    def hydrogen_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011002)
        """
        return cls._namespace_SIO('SIO_011002')

    @classmethod
    def helium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011003)
        """
        return cls._namespace_SIO('SIO_011003')

    @classmethod
    def lithium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011004)
        """
        return cls._namespace_SIO('SIO_011004')

    @classmethod
    def beryllium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011005)
        """
        return cls._namespace_SIO('SIO_011005')

    @classmethod
    def nitrogen_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011006)
        """
        return cls._namespace_SIO('SIO_011006')

    @classmethod
    def oxygen_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011007)
        """
        return cls._namespace_SIO('SIO_011007')

    @classmethod
    def fluorine_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011008)
        """
        return cls._namespace_SIO('SIO_011008')

    @classmethod
    def neon_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011009)
        """
        return cls._namespace_SIO('SIO_011009')

    @classmethod
    def sodium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011010)
        """
        return cls._namespace_SIO('SIO_011010')

    @classmethod
    def magnesium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011011)
        """
        return cls._namespace_SIO('SIO_011011')

    @classmethod
    def aluminium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011012)
        """
        return cls._namespace_SIO('SIO_011012')

    @classmethod
    def silicon_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011013)
        """
        return cls._namespace_SIO('SIO_011013')

    @classmethod
    def phosphorus_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011014)
        """
        return cls._namespace_SIO('SIO_011014')

    @classmethod
    def sulfur_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011015)
        """
        return cls._namespace_SIO('SIO_011015')

    @classmethod
    def chlorine_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011016)
        """
        return cls._namespace_SIO('SIO_011016')

    @classmethod
    def argon_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011017)
        """
        return cls._namespace_SIO('SIO_011017')

    @classmethod
    def potassium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011018)
        """
        return cls._namespace_SIO('SIO_011018')

    @classmethod
    def calcium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011019)
        """
        return cls._namespace_SIO('SIO_011019')

    @classmethod
    def scandium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011020)
        """
        return cls._namespace_SIO('SIO_011020')

    @classmethod
    def titanium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011021)
        """
        return cls._namespace_SIO('SIO_011021')

    @classmethod
    def vanadium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011022)
        """
        return cls._namespace_SIO('SIO_011022')

    @classmethod
    def chromium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011023)
        """
        return cls._namespace_SIO('SIO_011023')

    @classmethod
    def manganese_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011024)
        """
        return cls._namespace_SIO('SIO_011024')

    @classmethod
    def iron_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011025)
        """
        return cls._namespace_SIO('SIO_011025')

    @classmethod
    def cobalt_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011026)
        """
        return cls._namespace_SIO('SIO_011026')

    @classmethod
    def nickel_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011027)
        """
        return cls._namespace_SIO('SIO_011027')

    @classmethod
    def copper_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011028)
        """
        return cls._namespace_SIO('SIO_011028')

    @classmethod
    def zinc_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011029)
        """
        return cls._namespace_SIO('SIO_011029')

    @classmethod
    def gallium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011030)
        """
        return cls._namespace_SIO('SIO_011030')

    @classmethod
    def germanium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011031)
        """
        return cls._namespace_SIO('SIO_011031')

    @classmethod
    def arsenic_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011032)
        """
        return cls._namespace_SIO('SIO_011032')

    @classmethod
    def selenium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011033)
        """
        return cls._namespace_SIO('SIO_011033')

    @classmethod
    def bromine_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011034)
        """
        return cls._namespace_SIO('SIO_011034')

    @classmethod
    def krypton_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011035)
        """
        return cls._namespace_SIO('SIO_011035')

    @classmethod
    def rubidium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011036)
        """
        return cls._namespace_SIO('SIO_011036')

    @classmethod
    def strontium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011037)
        """
        return cls._namespace_SIO('SIO_011037')

    @classmethod
    def yttrium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011038)
        """
        return cls._namespace_SIO('SIO_011038')

    @classmethod
    def zirconium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011039)
        """
        return cls._namespace_SIO('SIO_011039')

    @classmethod
    def niobium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011040)
        """
        return cls._namespace_SIO('SIO_011040')

    @classmethod
    def molybdemum_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011041)
        """
        return cls._namespace_SIO('SIO_011041')

    @classmethod
    def technetium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011042)
        """
        return cls._namespace_SIO('SIO_011042')

    @classmethod
    def ruthenium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011043)
        """
        return cls._namespace_SIO('SIO_011043')

    @classmethod
    def rhodium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011044)
        """
        return cls._namespace_SIO('SIO_011044')

    @classmethod
    def palladium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011045)
        """
        return cls._namespace_SIO('SIO_011045')

    @classmethod
    def silver_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011046)
        """
        return cls._namespace_SIO('SIO_011046')

    @classmethod
    def cadmium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011047)
        """
        return cls._namespace_SIO('SIO_011047')

    @classmethod
    def indium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011048)
        """
        return cls._namespace_SIO('SIO_011048')

    @classmethod
    def tin_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011049)
        """
        return cls._namespace_SIO('SIO_011049')

    @classmethod
    def antimony_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011050)
        """
        return cls._namespace_SIO('SIO_011050')

    @classmethod
    def tellurium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011051)
        """
        return cls._namespace_SIO('SIO_011051')

    @classmethod
    def iodine_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011052)
        """
        return cls._namespace_SIO('SIO_011052')

    @classmethod
    def xenon_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011053)
        """
        return cls._namespace_SIO('SIO_011053')

    @classmethod
    def caesium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011054)
        """
        return cls._namespace_SIO('SIO_011054')

    @classmethod
    def barium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011055)
        """
        return cls._namespace_SIO('SIO_011055')

    @classmethod
    def lanthanum_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011056)
        """
        return cls._namespace_SIO('SIO_011056')

    @classmethod
    def hafnium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011057)
        """
        return cls._namespace_SIO('SIO_011057')

    @classmethod
    def tantalum_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011058)
        """
        return cls._namespace_SIO('SIO_011058')

    @classmethod
    def tungsten_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011059)
        """
        return cls._namespace_SIO('SIO_011059')

    @classmethod
    def rhenium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011060)
        """
        return cls._namespace_SIO('SIO_011060')

    @classmethod
    def osmium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011061)
        """
        return cls._namespace_SIO('SIO_011061')

    @classmethod
    def iridium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011062)
        """
        return cls._namespace_SIO('SIO_011062')

    @classmethod
    def platinum_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011063)
        """
        return cls._namespace_SIO('SIO_011063')

    @classmethod
    def gold_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011064)
        """
        return cls._namespace_SIO('SIO_011064')

    @classmethod
    def mercury_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011065)
        """
        return cls._namespace_SIO('SIO_011065')

    @classmethod
    def thallium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011066)
        """
        return cls._namespace_SIO('SIO_011066')

    @classmethod
    def lead_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011067)
        """
        return cls._namespace_SIO('SIO_011067')

    @classmethod
    def bismuth_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011068)
        """
        return cls._namespace_SIO('SIO_011068')

    @classmethod
    def polonium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011069)
        """
        return cls._namespace_SIO('SIO_011069')

    @classmethod
    def astatine_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011070)
        """
        return cls._namespace_SIO('SIO_011070')

    @classmethod
    def radon_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011071)
        """
        return cls._namespace_SIO('SIO_011071')

    @classmethod
    def francium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011072)
        """
        return cls._namespace_SIO('SIO_011072')

    @classmethod
    def radium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011073)
        """
        return cls._namespace_SIO('SIO_011073')

    @classmethod
    def actinium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011074)
        """
        return cls._namespace_SIO('SIO_011074')

    @classmethod
    def rutherfordium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011075)
        """
        return cls._namespace_SIO('SIO_011075')

    @classmethod
    def dubnium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011076)
        """
        return cls._namespace_SIO('SIO_011076')

    @classmethod
    def seaborgium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011077)
        """
        return cls._namespace_SIO('SIO_011077')

    @classmethod
    def bohrium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011078)
        """
        return cls._namespace_SIO('SIO_011078')

    @classmethod
    def hassium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011079)
        """
        return cls._namespace_SIO('SIO_011079')

    @classmethod
    def meitnerium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011080)
        """
        return cls._namespace_SIO('SIO_011080')

    @classmethod
    def darmstadtium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011081)
        """
        return cls._namespace_SIO('SIO_011081')

    @classmethod
    def roentgenium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011082)
        """
        return cls._namespace_SIO('SIO_011082')

    @classmethod
    def copernicium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011083)
        """
        return cls._namespace_SIO('SIO_011083')

    @classmethod
    def unutrium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011084)
        """
        return cls._namespace_SIO('SIO_011084')

    @classmethod
    def ununquadium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011085)
        """
        return cls._namespace_SIO('SIO_011085')

    @classmethod
    def ununpentium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011086)
        """
        return cls._namespace_SIO('SIO_011086')

    @classmethod
    def ununhexium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011087)
        """
        return cls._namespace_SIO('SIO_011087')

    @classmethod
    def ununseptium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011088)
        """
        return cls._namespace_SIO('SIO_011088')

    @classmethod
    def ununoctium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011089)
        """
        return cls._namespace_SIO('SIO_011089')

    @classmethod
    def cerium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011090)
        """
        return cls._namespace_SIO('SIO_011090')

    @classmethod
    def praseodymium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011091)
        """
        return cls._namespace_SIO('SIO_011091')

    @classmethod
    def neodymium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011092)
        """
        return cls._namespace_SIO('SIO_011092')

    @classmethod
    def promethium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011093)
        """
        return cls._namespace_SIO('SIO_011093')

    @classmethod
    def samarium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011094)
        """
        return cls._namespace_SIO('SIO_011094')

    @classmethod
    def europium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011095)
        """
        return cls._namespace_SIO('SIO_011095')

    @classmethod
    def gadolinium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011096)
        """
        return cls._namespace_SIO('SIO_011096')

    @classmethod
    def terbium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011097)
        """
        return cls._namespace_SIO('SIO_011097')

    @classmethod
    def dysprosium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011098)
        """
        return cls._namespace_SIO('SIO_011098')

    @classmethod
    def holmium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011099)
        """
        return cls._namespace_SIO('SIO_011099')

    @classmethod
    def erbium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011100)
        """
        return cls._namespace_SIO('SIO_011100')

    @classmethod
    def thulium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011101)
        """
        return cls._namespace_SIO('SIO_011101')

    @classmethod
    def ytterbium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011102)
        """
        return cls._namespace_SIO('SIO_011102')

    @classmethod
    def lutetium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011103)
        """
        return cls._namespace_SIO('SIO_011103')

    @classmethod
    def thorium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011104)
        """
        return cls._namespace_SIO('SIO_011104')

    @classmethod
    def protactinium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011105)
        """
        return cls._namespace_SIO('SIO_011105')

    @classmethod
    def uranium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011106)
        """
        return cls._namespace_SIO('SIO_011106')

    @classmethod
    def neptunium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011107)
        """
        return cls._namespace_SIO('SIO_011107')

    @classmethod
    def plutonium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011108)
        """
        return cls._namespace_SIO('SIO_011108')

    @classmethod
    def americium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011109)
        """
        return cls._namespace_SIO('SIO_011109')

    @classmethod
    def curium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011110)
        """
        return cls._namespace_SIO('SIO_011110')

    @classmethod
    def berkelium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011111)
        """
        return cls._namespace_SIO('SIO_011111')

    @classmethod
    def californium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011112)
        """
        return cls._namespace_SIO('SIO_011112')

    @classmethod
    def einsteinium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011113)
        """
        return cls._namespace_SIO('SIO_011113')

    @classmethod
    def fermium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011114)
        """
        return cls._namespace_SIO('SIO_011114')

    @classmethod
    def mendelevium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011115)
        """
        return cls._namespace_SIO('SIO_011115')

    @classmethod
    def nobelium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011116)
        """
        return cls._namespace_SIO('SIO_011116')

    @classmethod
    def lawrencium_atom(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011117)
        """
        return cls._namespace_SIO('SIO_011117')

    @classmethod
    def covalent_bond(cls):
        """a covalent bond is a strong submolecular interaction between atoms.
        (cls, http://semanticscience.org/resource/SIO_011118)
        """
        return cls._namespace_SIO('SIO_011118')

    @classmethod
    def biomolecular_structure_descriptor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011119)
        """
        return cls._namespace_SIO('SIO_011119')

    @classmethod
    def molecular_structure_file(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011120)
        """
        return cls._namespace_SIO('SIO_011120')

    @classmethod
    def molecular_structure_descriptor(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011121)
        """
        return cls._namespace_SIO('SIO_011121')

    @classmethod
    def chemical_data(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011123)
        """
        return cls._namespace_SIO('SIO_011123')

    @classmethod
    def molecule(cls):
        """A molecule is the mereological maximal sum of a collection of covalently bonded atoms.
        (cls, http://semanticscience.org/resource/SIO_011125)
        """
        return cls._namespace_SIO('SIO_011125')

    @classmethod
    def chemical_substance(cls):
        """A chemical substance is a chemical complex of weakly interacting molecular entities, and may include bulk solvent.
        (cls, http://semanticscience.org/resource/SIO_011126)
        """
        return cls._namespace_SIO('SIO_011126')

    @classmethod
    def PDB_file(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011130)
        """
        return cls._namespace_SIO('SIO_011130')

    @classmethod
    def collection_of_3d_molecular_structure_models(cls):
        """-- No comment or description provided. --
        (cls, http://semanticscience.org/resource/SIO_011131)
        """
        return cls._namespace_SIO('SIO_011131')

    @classmethod
    def is_object_property(cls, uri):
        """Determines whether the given URI is an object property.
        
        uri -- URI that is tested for being an object property
        """
        if uri == cls._namespace_SIO('SIO_000001'):
            return True
        if uri == cls._namespace_SIO('SIO_000008'):
            return True
        if uri == cls._namespace_SIO('SIO_000011'):
            return True
        if uri == cls._namespace_SIO('SIO_000020'):
            return True
        if uri == cls._namespace_SIO('SIO_000028'):
            return True
        if uri == cls._namespace_SIO('SIO_000029'):
            return True
        if uri == cls._namespace_SIO('SIO_000053'):
            return True
        if uri == cls._namespace_SIO('SIO_000054'):
            return True
        if uri == cls._namespace_SIO('SIO_000059'):
            return True
        if uri == cls._namespace_SIO('SIO_000060'):
            return True
        if uri == cls._namespace_SIO('SIO_000061'):
            return True
        if uri == cls._namespace_SIO('SIO_000062'):
            return True
        if uri == cls._namespace_SIO('SIO_000063'):
            return True
        if uri == cls._namespace_SIO('SIO_000064'):
            return True
        if uri == cls._namespace_SIO('SIO_000066'):
            return True
        if uri == cls._namespace_SIO('SIO_000068'):
            return True
        if uri == cls._namespace_SIO('SIO_000093'):
            return True
        if uri == cls._namespace_SIO('SIO_000095'):
            return True
        if uri == cls._namespace_SIO('SIO_000096'):
            return True
        if uri == cls._namespace_SIO('SIO_000128'):
            return True
        if uri == cls._namespace_SIO('SIO_000132'):
            return True
        if uri == cls._namespace_SIO('SIO_000139'):
            return True
        if uri == cls._namespace_SIO('SIO_000145'):
            return True
        if uri == cls._namespace_SIO('SIO_000202'):
            return True
        if uri == cls._namespace_SIO('SIO_000203'):
            return True
        if uri == cls._namespace_SIO('SIO_000204'):
            return True
        if uri == cls._namespace_SIO('SIO_000205'):
            return True
        if uri == cls._namespace_SIO('SIO_000206'):
            return True
        if uri == cls._namespace_SIO('SIO_000207'):
            return True
        if uri == cls._namespace_SIO('SIO_000208'):
            return True
        if uri == cls._namespace_SIO('SIO_000209'):
            return True
        if uri == cls._namespace_SIO('SIO_000210'):
            return True
        if uri == cls._namespace_SIO('SIO_000211'):
            return True
        if uri == cls._namespace_SIO('SIO_000212'):
            return True
        if uri == cls._namespace_SIO('SIO_000213'):
            return True
        if uri == cls._namespace_SIO('SIO_000214'):
            return True
        if uri == cls._namespace_SIO('SIO_000215'):
            return True
        if uri == cls._namespace_SIO('SIO_000216'):
            return True
        if uri == cls._namespace_SIO('SIO_000217'):
            return True
        if uri == cls._namespace_SIO('SIO_000218'):
            return True
        if uri == cls._namespace_SIO('SIO_000219'):
            return True
        if uri == cls._namespace_SIO('SIO_000221'):
            return True
        if uri == cls._namespace_SIO('SIO_000222'):
            return True
        if uri == cls._namespace_SIO('SIO_000223'):
            return True
        if uri == cls._namespace_SIO('SIO_000224'):
            return True
        if uri == cls._namespace_SIO('SIO_000225'):
            return True
        if uri == cls._namespace_SIO('SIO_000226'):
            return True
        if uri == cls._namespace_SIO('SIO_000227'):
            return True
        if uri == cls._namespace_SIO('SIO_000228'):
            return True
        if uri == cls._namespace_SIO('SIO_000229'):
            return True
        if uri == cls._namespace_SIO('SIO_000230'):
            return True
        if uri == cls._namespace_SIO('SIO_000231'):
            return True
        if uri == cls._namespace_SIO('SIO_000232'):
            return True
        if uri == cls._namespace_SIO('SIO_000233'):
            return True
        if uri == cls._namespace_SIO('SIO_000234'):
            return True
        if uri == cls._namespace_SIO('SIO_000235'):
            return True
        if uri == cls._namespace_SIO('SIO_000236'):
            return True
        if uri == cls._namespace_SIO('SIO_000240'):
            return True
        if uri == cls._namespace_SIO('SIO_000241'):
            return True
        if uri == cls._namespace_SIO('SIO_000242'):
            return True
        if uri == cls._namespace_SIO('SIO_000243'):
            return True
        if uri == cls._namespace_SIO('SIO_000244'):
            return True
        if uri == cls._namespace_SIO('SIO_000245'):
            return True
        if uri == cls._namespace_SIO('SIO_000246'):
            return True
        if uri == cls._namespace_SIO('SIO_000247'):
            return True
        if uri == cls._namespace_SIO('SIO_000248'):
            return True
        if uri == cls._namespace_SIO('SIO_000249'):
            return True
        if uri == cls._namespace_SIO('SIO_000250'):
            return True
        if uri == cls._namespace_SIO('SIO_000251'):
            return True
        if uri == cls._namespace_SIO('SIO_000252'):
            return True
        if uri == cls._namespace_SIO('SIO_000253'):
            return True
        if uri == cls._namespace_SIO('SIO_000254'):
            return True
        if uri == cls._namespace_SIO('SIO_000255'):
            return True
        if uri == cls._namespace_SIO('SIO_000272'):
            return True
        if uri == cls._namespace_SIO('SIO_000273'):
            return True
        if uri == cls._namespace_SIO('SIO_000274'):
            return True
        if uri == cls._namespace_SIO('SIO_000277'):
            return True
        if uri == cls._namespace_SIO('SIO_000278'):
            return True
        if uri == cls._namespace_SIO('SIO_000283'):
            return True
        if uri == cls._namespace_SIO('SIO_000286'):
            return True
        if uri == cls._namespace_SIO('SIO_000288'):
            return True
        if uri == cls._namespace_SIO('SIO_000291'):
            return True
        if uri == cls._namespace_SIO('SIO_000292'):
            return True
        if uri == cls._namespace_SIO('SIO_000293'):
            return True
        if uri == cls._namespace_SIO('SIO_000294'):
            return True
        if uri == cls._namespace_SIO('SIO_000310'):
            return True
        if uri == cls._namespace_SIO('SIO_000311'):
            return True
        if uri == cls._namespace_SIO('SIO_000312'):
            return True
        if uri == cls._namespace_SIO('SIO_000313'):
            return True
        if uri == cls._namespace_SIO('SIO_000322'):
            return True
        if uri == cls._namespace_SIO('SIO_000323'):
            return True
        if uri == cls._namespace_SIO('SIO_000324'):
            return True
        if uri == cls._namespace_SIO('SIO_000325'):
            return True
        if uri == cls._namespace_SIO('SIO_000332'):
            return True
        if uri == cls._namespace_SIO('SIO_000334'):
            return True
        if uri == cls._namespace_SIO('SIO_000335'):
            return True
        if uri == cls._namespace_SIO('SIO_000338'):
            return True
        if uri == cls._namespace_SIO('SIO_000339'):
            return True
        if uri == cls._namespace_SIO('SIO_000341'):
            return True
        if uri == cls._namespace_SIO('SIO_000352'):
            return True
        if uri == cls._namespace_SIO('SIO_000355'):
            return True
        if uri == cls._namespace_SIO('SIO_000356'):
            return True
        if uri == cls._namespace_SIO('SIO_000362'):
            return True
        if uri == cls._namespace_SIO('SIO_000363'):
            return True
        if uri == cls._namespace_SIO('SIO_000364'):
            return True
        if uri == cls._namespace_SIO('SIO_000365'):
            return True
        if uri == cls._namespace_SIO('SIO_000369'):
            return True
        if uri == cls._namespace_SIO('SIO_000420'):
            return True
        if uri == cls._namespace_SIO('SIO_000421'):
            return True
        if uri == cls._namespace_SIO('SIO_000422'):
            return True
        if uri == cls._namespace_SIO('SIO_000424'):
            return True
        if uri == cls._namespace_SIO('SIO_000425'):
            return True
        if uri == cls._namespace_SIO('SIO_000426'):
            return True
        if uri == cls._namespace_SIO('SIO_000427'):
            return True
        if uri == cls._namespace_SIO('SIO_000477'):
            return True
        if uri == cls._namespace_SIO('SIO_000482'):
            return True
        if uri == cls._namespace_SIO('SIO_000484'):
            return True
        if uri == cls._namespace_SIO('SIO_000490'):
            return True
        if uri == cls._namespace_SIO('SIO_000491'):
            return True
        if uri == cls._namespace_SIO('SIO_000495'):
            return True
        if uri == cls._namespace_SIO('SIO_000496'):
            return True
        if uri == cls._namespace_SIO('SIO_000497'):
            return True
        if uri == cls._namespace_SIO('SIO_000552'):
            return True
        if uri == cls._namespace_SIO('SIO_000553'):
            return True
        if uri == cls._namespace_SIO('SIO_000557'):
            return True
        if uri == cls._namespace_SIO('SIO_000558'):
            return True
        if uri == cls._namespace_SIO('SIO_000563'):
            return True
        if uri == cls._namespace_SIO('SIO_000586'):
            return True
        if uri == cls._namespace_SIO('SIO_000628'):
            return True
        if uri == cls._namespace_SIO('SIO_000629'):
            return True
        if uri == cls._namespace_SIO('SIO_000630'):
            return True
        if uri == cls._namespace_SIO('SIO_000631'):
            return True
        if uri == cls._namespace_SIO('SIO_000632'):
            return True
        if uri == cls._namespace_SIO('SIO_000633'):
            return True
        if uri == cls._namespace_SIO('SIO_000634'):
            return True
        if uri == cls._namespace_SIO('SIO_000635'):
            return True
        if uri == cls._namespace_SIO('SIO_000636'):
            return True
        if uri == cls._namespace_SIO('SIO_000641'):
            return True
        if uri == cls._namespace_SIO('SIO_000642'):
            return True
        if uri == cls._namespace_SIO('SIO_000643'):
            return True
        if uri == cls._namespace_SIO('SIO_000644'):
            return True
        if uri == cls._namespace_SIO('SIO_000646'):
            return True
        if uri == cls._namespace_SIO('SIO_000652'):
            return True
        if uri == cls._namespace_SIO('SIO_000655'):
            return True
        if uri == cls._namespace_SIO('SIO_000656'):
            return True
        if uri == cls._namespace_SIO('SIO_000657'):
            return True
        if uri == cls._namespace_SIO('SIO_000658'):
            return True
        if uri == cls._namespace_SIO('SIO_000668'):
            return True
        if uri == cls._namespace_SIO('SIO_000671'):
            return True
        if uri == cls._namespace_SIO('SIO_000672'):
            return True
        if uri == cls._namespace_SIO('SIO_000673'):
            return True
        if uri == cls._namespace_SIO('SIO_000674'):
            return True
        if uri == cls._namespace_SIO('SIO_000679'):
            return True
        if uri == cls._namespace_SIO('SIO_000680'):
            return True
        if uri == cls._namespace_SIO('SIO_000681'):
            return True
        if uri == cls._namespace_SIO('SIO_000682'):
            return True
        if uri == cls._namespace_SIO('SIO_000684'):
            return True
        if uri == cls._namespace_SIO('SIO_000687'):
            return True
        if uri == cls._namespace_SIO('SIO_000697'):
            return True
        if uri == cls._namespace_SIO('SIO_000699'):
            return True
        if uri == cls._namespace_SIO('SIO_000709'):
            return True
        if uri == cls._namespace_SIO('SIO_000710'):
            return True
        if uri == cls._namespace_SIO('SIO_000733'):
            return True
        if uri == cls._namespace_SIO('SIO_000734'):
            return True
        if uri == cls._namespace_SIO('SIO_000735'):
            return True
        if uri == cls._namespace_SIO('SIO_000736'):
            return True
        if uri == cls._namespace_SIO('SIO_000737'):
            return True
        if uri == cls._namespace_SIO('SIO_000738'):
            return True
        if uri == cls._namespace_SIO('SIO_000749'):
            return True
        if uri == cls._namespace_SIO('SIO_000772'):
            return True
        if uri == cls._namespace_SIO('SIO_000773'):
            return True
        if uri == cls._namespace_SIO('SIO_000774'):
            return True
        if uri == cls._namespace_SIO('SIO_000775'):
            return True
        if uri == cls._namespace_SIO('SIO_000793'):
            return True
        if uri == cls._namespace_SIO('SIO_000892'):
            return True
        if uri == cls._namespace_SIO('SIO_000900'):
            return True
        if uri == cls._namespace_SIO('SIO_000901'):
            return True
        if uri == cls._namespace_SIO('SIO_000905'):
            return True
        if uri == cls._namespace_SIO('SIO_000970'):
            return True
        if uri == cls._namespace_SIO('SIO_000971'):
            return True
        if uri == cls._namespace_SIO('SIO_000972'):
            return True
        if uri == cls._namespace_SIO('SIO_000973'):
            return True
        if uri == cls._namespace_SIO('SIO_000974'):
            return True
        if uri == cls._namespace_SIO('SIO_000975'):
            return True
        if uri == cls._namespace_SIO('SIO_001096'):
            return True
        if uri == cls._namespace_SIO('SIO_001097'):
            return True
        if uri == cls._namespace_SIO('SIO_001098'):
            return True
        if uri == cls._namespace_SIO('SIO_001101'):
            return True
        if uri == cls._namespace_SIO('SIO_001154'):
            return True
        if uri == cls._namespace_SIO('SIO_001155'):
            return True
        if uri == cls._namespace_SIO('SIO_001156'):
            return True
        if uri == cls._namespace_SIO('SIO_001157'):
            return True
        if uri == cls._namespace_SIO('SIO_001158'):
            return True
        if uri == cls._namespace_SIO('SIO_001159'):
            return True
        if uri == cls._namespace_SIO('SIO_010078'):
            return True
        if uri == cls._namespace_SIO('SIO_010079'):
            return True
        if uri == cls._namespace_SIO('SIO_010080'):
            return True
        if uri == cls._namespace_SIO('SIO_010081'):
            return True
        if uri == cls._namespace_SIO('SIO_010082'):
            return True
        if uri == cls._namespace_SIO('SIO_010083'):
            return True
        if uri == cls._namespace_SIO('SIO_010302'):
            return True
        return False

    @classmethod
    def is_datatype_property(cls, uri):
        """Determines whether the given URI is a datatype property.
        
        uri -- URI that is tested for being a datatype property
        """
        if uri == cls._namespace_SIO('SIO_000300'):
            return True
        return False

    @classmethod
    def is_class(cls, uri):
        """Determines whether the given URI is a class.
        
        uri -- URI that is tested for being a class
        """
        if uri == cls._namespace_SIO('SIO_000000'):
            return True
        if uri == cls._namespace_SIO('SIO_000004'):
            return True
        if uri == cls._namespace_SIO('SIO_000005'):
            return True
        if uri == cls._namespace_SIO('SIO_000006'):
            return True
        if uri == cls._namespace_SIO('SIO_000009'):
            return True
        if uri == cls._namespace_SIO('SIO_000010'):
            return True
        if uri == cls._namespace_SIO('SIO_000012'):
            return True
        if uri == cls._namespace_SIO('SIO_000013'):
            return True
        if uri == cls._namespace_SIO('SIO_000014'):
            return True
        if uri == cls._namespace_SIO('SIO_000015'):
            return True
        if uri == cls._namespace_SIO('SIO_000016'):
            return True
        if uri == cls._namespace_SIO('SIO_000017'):
            return True
        if uri == cls._namespace_SIO('SIO_000019'):
            return True
        if uri == cls._namespace_SIO('SIO_000022'):
            return True
        if uri == cls._namespace_SIO('SIO_000026'):
            return True
        if uri == cls._namespace_SIO('SIO_000027'):
            return True
        if uri == cls._namespace_SIO('SIO_000030'):
            return True
        if uri == cls._namespace_SIO('SIO_000031'):
            return True
        if uri == cls._namespace_SIO('SIO_000032'):
            return True
        if uri == cls._namespace_SIO('SIO_000033'):
            return True
        if uri == cls._namespace_SIO('SIO_000034'):
            return True
        if uri == cls._namespace_SIO('SIO_000035'):
            return True
        if uri == cls._namespace_SIO('SIO_000036'):
            return True
        if uri == cls._namespace_SIO('SIO_000037'):
            return True
        if uri == cls._namespace_SIO('SIO_000038'):
            return True
        if uri == cls._namespace_SIO('SIO_000039'):
            return True
        if uri == cls._namespace_SIO('SIO_000040'):
            return True
        if uri == cls._namespace_SIO('SIO_000041'):
            return True
        if uri == cls._namespace_SIO('SIO_000042'):
            return True
        if uri == cls._namespace_SIO('SIO_000043'):
            return True
        if uri == cls._namespace_SIO('SIO_000044'):
            return True
        if uri == cls._namespace_SIO('SIO_000045'):
            return True
        if uri == cls._namespace_SIO('SIO_000046'):
            return True
        if uri == cls._namespace_SIO('SIO_000047'):
            return True
        if uri == cls._namespace_SIO('SIO_000048'):
            return True
        if uri == cls._namespace_SIO('SIO_000049'):
            return True
        if uri == cls._namespace_SIO('SIO_000051'):
            return True
        if uri == cls._namespace_SIO('SIO_000052'):
            return True
        if uri == cls._namespace_SIO('SIO_000055'):
            return True
        if uri == cls._namespace_SIO('SIO_000056'):
            return True
        if uri == cls._namespace_SIO('SIO_000057'):
            return True
        if uri == cls._namespace_SIO('SIO_000067'):
            return True
        if uri == cls._namespace_SIO('SIO_000069'):
            return True
        if uri == cls._namespace_SIO('SIO_000070'):
            return True
        if uri == cls._namespace_SIO('SIO_000071'):
            return True
        if uri == cls._namespace_SIO('SIO_000072'):
            return True
        if uri == cls._namespace_SIO('SIO_000073'):
            return True
        if uri == cls._namespace_SIO('SIO_000074'):
            return True
        if uri == cls._namespace_SIO('SIO_000075'):
            return True
        if uri == cls._namespace_SIO('SIO_000076'):
            return True
        if uri == cls._namespace_SIO('SIO_000077'):
            return True
        if uri == cls._namespace_SIO('SIO_000078'):
            return True
        if uri == cls._namespace_SIO('SIO_000079'):
            return True
        if uri == cls._namespace_SIO('SIO_000080'):
            return True
        if uri == cls._namespace_SIO('SIO_000081'):
            return True
        if uri == cls._namespace_SIO('SIO_000082'):
            return True
        if uri == cls._namespace_SIO('SIO_000083'):
            return True
        if uri == cls._namespace_SIO('SIO_000085'):
            return True
        if uri == cls._namespace_SIO('SIO_000087'):
            return True
        if uri == cls._namespace_SIO('SIO_000088'):
            return True
        if uri == cls._namespace_SIO('SIO_000089'):
            return True
        if uri == cls._namespace_SIO('SIO_000090'):
            return True
        if uri == cls._namespace_SIO('SIO_000091'):
            return True
        if uri == cls._namespace_SIO('SIO_000092'):
            return True
        if uri == cls._namespace_SIO('SIO_000094'):
            return True
        if uri == cls._namespace_SIO('SIO_000097'):
            return True
        if uri == cls._namespace_SIO('SIO_000098'):
            return True
        if uri == cls._namespace_SIO('SIO_000099'):
            return True
        if uri == cls._namespace_SIO('SIO_000100'):
            return True
        if uri == cls._namespace_SIO('SIO_000101'):
            return True
        if uri == cls._namespace_SIO('SIO_000102'):
            return True
        if uri == cls._namespace_SIO('SIO_000103'):
            return True
        if uri == cls._namespace_SIO('SIO_000104'):
            return True
        if uri == cls._namespace_SIO('SIO_000105'):
            return True
        if uri == cls._namespace_SIO('SIO_000106'):
            return True
        if uri == cls._namespace_SIO('SIO_000107'):
            return True
        if uri == cls._namespace_SIO('SIO_000108'):
            return True
        if uri == cls._namespace_SIO('SIO_000109'):
            return True
        if uri == cls._namespace_SIO('SIO_000110'):
            return True
        if uri == cls._namespace_SIO('SIO_000111'):
            return True
        if uri == cls._namespace_SIO('SIO_000112'):
            return True
        if uri == cls._namespace_SIO('SIO_000113'):
            return True
        if uri == cls._namespace_SIO('SIO_000114'):
            return True
        if uri == cls._namespace_SIO('SIO_000115'):
            return True
        if uri == cls._namespace_SIO('SIO_000116'):
            return True
        if uri == cls._namespace_SIO('SIO_000117'):
            return True
        if uri == cls._namespace_SIO('SIO_000118'):
            return True
        if uri == cls._namespace_SIO('SIO_000119'):
            return True
        if uri == cls._namespace_SIO('SIO_000120'):
            return True
        if uri == cls._namespace_SIO('SIO_000121'):
            return True
        if uri == cls._namespace_SIO('SIO_000122'):
            return True
        if uri == cls._namespace_SIO('SIO_000123'):
            return True
        if uri == cls._namespace_SIO('SIO_000124'):
            return True
        if uri == cls._namespace_SIO('SIO_000125'):
            return True
        if uri == cls._namespace_SIO('SIO_000126'):
            return True
        if uri == cls._namespace_SIO('SIO_000127'):
            return True
        if uri == cls._namespace_SIO('SIO_000129'):
            return True
        if uri == cls._namespace_SIO('SIO_000130'):
            return True
        if uri == cls._namespace_SIO('SIO_000131'):
            return True
        if uri == cls._namespace_SIO('SIO_000133'):
            return True
        if uri == cls._namespace_SIO('SIO_000135'):
            return True
        if uri == cls._namespace_SIO('SIO_000136'):
            return True
        if uri == cls._namespace_SIO('SIO_000137'):
            return True
        if uri == cls._namespace_SIO('SIO_000138'):
            return True
        if uri == cls._namespace_SIO('SIO_000140'):
            return True
        if uri == cls._namespace_SIO('SIO_000141'):
            return True
        if uri == cls._namespace_SIO('SIO_000142'):
            return True
        if uri == cls._namespace_SIO('SIO_000143'):
            return True
        if uri == cls._namespace_SIO('SIO_000144'):
            return True
        if uri == cls._namespace_SIO('SIO_000146'):
            return True
        if uri == cls._namespace_SIO('SIO_000147'):
            return True
        if uri == cls._namespace_SIO('SIO_000148'):
            return True
        if uri == cls._namespace_SIO('SIO_000150'):
            return True
        if uri == cls._namespace_SIO('SIO_000151'):
            return True
        if uri == cls._namespace_SIO('SIO_000152'):
            return True
        if uri == cls._namespace_SIO('SIO_000153'):
            return True
        if uri == cls._namespace_SIO('SIO_000154'):
            return True
        if uri == cls._namespace_SIO('SIO_000155'):
            return True
        if uri == cls._namespace_SIO('SIO_000156'):
            return True
        if uri == cls._namespace_SIO('SIO_000157'):
            return True
        if uri == cls._namespace_SIO('SIO_000158'):
            return True
        if uri == cls._namespace_SIO('SIO_000159'):
            return True
        if uri == cls._namespace_SIO('SIO_000160'):
            return True
        if uri == cls._namespace_SIO('SIO_000161'):
            return True
        if uri == cls._namespace_SIO('SIO_000162'):
            return True
        if uri == cls._namespace_SIO('SIO_000163'):
            return True
        if uri == cls._namespace_SIO('SIO_000164'):
            return True
        if uri == cls._namespace_SIO('SIO_000165'):
            return True
        if uri == cls._namespace_SIO('SIO_000166'):
            return True
        if uri == cls._namespace_SIO('SIO_000167'):
            return True
        if uri == cls._namespace_SIO('SIO_000168'):
            return True
        if uri == cls._namespace_SIO('SIO_000169'):
            return True
        if uri == cls._namespace_SIO('SIO_000170'):
            return True
        if uri == cls._namespace_SIO('SIO_000171'):
            return True
        if uri == cls._namespace_SIO('SIO_000172'):
            return True
        if uri == cls._namespace_SIO('SIO_000173'):
            return True
        if uri == cls._namespace_SIO('SIO_000174'):
            return True
        if uri == cls._namespace_SIO('SIO_000175'):
            return True
        if uri == cls._namespace_SIO('SIO_000176'):
            return True
        if uri == cls._namespace_SIO('SIO_000177'):
            return True
        if uri == cls._namespace_SIO('SIO_000178'):
            return True
        if uri == cls._namespace_SIO('SIO_000179'):
            return True
        if uri == cls._namespace_SIO('SIO_000180'):
            return True
        if uri == cls._namespace_SIO('SIO_000181'):
            return True
        if uri == cls._namespace_SIO('SIO_000182'):
            return True
        if uri == cls._namespace_SIO('SIO_000183'):
            return True
        if uri == cls._namespace_SIO('SIO_000184'):
            return True
        if uri == cls._namespace_SIO('SIO_000185'):
            return True
        if uri == cls._namespace_SIO('SIO_000186'):
            return True
        if uri == cls._namespace_SIO('SIO_000188'):
            return True
        if uri == cls._namespace_SIO('SIO_000189'):
            return True
        if uri == cls._namespace_SIO('SIO_000190'):
            return True
        if uri == cls._namespace_SIO('SIO_000191'):
            return True
        if uri == cls._namespace_SIO('SIO_000192'):
            return True
        if uri == cls._namespace_SIO('SIO_000193'):
            return True
        if uri == cls._namespace_SIO('SIO_000194'):
            return True
        if uri == cls._namespace_SIO('SIO_000195'):
            return True
        if uri == cls._namespace_SIO('SIO_000196'):
            return True
        if uri == cls._namespace_SIO('SIO_000197'):
            return True
        if uri == cls._namespace_SIO('SIO_000198'):
            return True
        if uri == cls._namespace_SIO('SIO_000199'):
            return True
        if uri == cls._namespace_SIO('SIO_000200'):
            return True
        if uri == cls._namespace_SIO('SIO_000201'):
            return True
        if uri == cls._namespace_SIO('SIO_000220'):
            return True
        if uri == cls._namespace_SIO('SIO_000237'):
            return True
        if uri == cls._namespace_SIO('SIO_000238'):
            return True
        if uri == cls._namespace_SIO('SIO_000239'):
            return True
        if uri == cls._namespace_SIO('SIO_000256'):
            return True
        if uri == cls._namespace_SIO('SIO_000257'):
            return True
        if uri == cls._namespace_SIO('SIO_000258'):
            return True
        if uri == cls._namespace_SIO('SIO_000259'):
            return True
        if uri == cls._namespace_SIO('SIO_000261'):
            return True
        if uri == cls._namespace_SIO('SIO_000262'):
            return True
        if uri == cls._namespace_SIO('SIO_000263'):
            return True
        if uri == cls._namespace_SIO('SIO_000264'):
            return True
        if uri == cls._namespace_SIO('SIO_000265'):
            return True
        if uri == cls._namespace_SIO('SIO_000266'):
            return True
        if uri == cls._namespace_SIO('SIO_000267'):
            return True
        if uri == cls._namespace_SIO('SIO_000268'):
            return True
        if uri == cls._namespace_SIO('SIO_000269'):
            return True
        if uri == cls._namespace_SIO('SIO_000270'):
            return True
        if uri == cls._namespace_SIO('SIO_000275'):
            return True
        if uri == cls._namespace_SIO('SIO_000276'):
            return True
        if uri == cls._namespace_SIO('SIO_000279'):
            return True
        if uri == cls._namespace_SIO('SIO_000280'):
            return True
        if uri == cls._namespace_SIO('SIO_000281'):
            return True
        if uri == cls._namespace_SIO('SIO_000282'):
            return True
        if uri == cls._namespace_SIO('SIO_000284'):
            return True
        if uri == cls._namespace_SIO('SIO_000285'):
            return True
        if uri == cls._namespace_SIO('SIO_000287'):
            return True
        if uri == cls._namespace_SIO('SIO_000289'):
            return True
        if uri == cls._namespace_SIO('SIO_000290'):
            return True
        if uri == cls._namespace_SIO('SIO_000295'):
            return True
        if uri == cls._namespace_SIO('SIO_000296'):
            return True
        if uri == cls._namespace_SIO('SIO_000297'):
            return True
        if uri == cls._namespace_SIO('SIO_000298'):
            return True
        if uri == cls._namespace_SIO('SIO_000299'):
            return True
        if uri == cls._namespace_SIO('SIO_000301'):
            return True
        if uri == cls._namespace_SIO('SIO_000302'):
            return True
        if uri == cls._namespace_SIO('SIO_000304'):
            return True
        if uri == cls._namespace_SIO('SIO_000305'):
            return True
        if uri == cls._namespace_SIO('SIO_000306'):
            return True
        if uri == cls._namespace_SIO('SIO_000307'):
            return True
        if uri == cls._namespace_SIO('SIO_000308'):
            return True
        if uri == cls._namespace_SIO('SIO_000309'):
            return True
        if uri == cls._namespace_SIO('SIO_000314'):
            return True
        if uri == cls._namespace_SIO('SIO_000315'):
            return True
        if uri == cls._namespace_SIO('SIO_000316'):
            return True
        if uri == cls._namespace_SIO('SIO_000317'):
            return True
        if uri == cls._namespace_SIO('SIO_000318'):
            return True
        if uri == cls._namespace_SIO('SIO_000319'):
            return True
        if uri == cls._namespace_SIO('SIO_000320'):
            return True
        if uri == cls._namespace_SIO('SIO_000321'):
            return True
        if uri == cls._namespace_SIO('SIO_000326'):
            return True
        if uri == cls._namespace_SIO('SIO_000327'):
            return True
        if uri == cls._namespace_SIO('SIO_000328'):
            return True
        if uri == cls._namespace_SIO('SIO_000329'):
            return True
        if uri == cls._namespace_SIO('SIO_000330'):
            return True
        if uri == cls._namespace_SIO('SIO_000331'):
            return True
        if uri == cls._namespace_SIO('SIO_000333'):
            return True
        if uri == cls._namespace_SIO('SIO_000337'):
            return True
        if uri == cls._namespace_SIO('SIO_000340'):
            return True
        if uri == cls._namespace_SIO('SIO_000342'):
            return True
        if uri == cls._namespace_SIO('SIO_000343'):
            return True
        if uri == cls._namespace_SIO('SIO_000344'):
            return True
        if uri == cls._namespace_SIO('SIO_000345'):
            return True
        if uri == cls._namespace_SIO('SIO_000346'):
            return True
        if uri == cls._namespace_SIO('SIO_000347'):
            return True
        if uri == cls._namespace_SIO('SIO_000348'):
            return True
        if uri == cls._namespace_SIO('SIO_000349'):
            return True
        if uri == cls._namespace_SIO('SIO_000350'):
            return True
        if uri == cls._namespace_SIO('SIO_000351'):
            return True
        if uri == cls._namespace_SIO('SIO_000353'):
            return True
        if uri == cls._namespace_SIO('SIO_000354'):
            return True
        if uri == cls._namespace_SIO('SIO_000357'):
            return True
        if uri == cls._namespace_SIO('SIO_000358'):
            return True
        if uri == cls._namespace_SIO('SIO_000359'):
            return True
        if uri == cls._namespace_SIO('SIO_000360'):
            return True
        if uri == cls._namespace_SIO('SIO_000366'):
            return True
        if uri == cls._namespace_SIO('SIO_000367'):
            return True
        if uri == cls._namespace_SIO('SIO_000368'):
            return True
        if uri == cls._namespace_SIO('SIO_000370'):
            return True
        if uri == cls._namespace_SIO('SIO_000371'):
            return True
        if uri == cls._namespace_SIO('SIO_000372'):
            return True
        if uri == cls._namespace_SIO('SIO_000373'):
            return True
        if uri == cls._namespace_SIO('SIO_000374'):
            return True
        if uri == cls._namespace_SIO('SIO_000375'):
            return True
        if uri == cls._namespace_SIO('SIO_000376'):
            return True
        if uri == cls._namespace_SIO('SIO_000377'):
            return True
        if uri == cls._namespace_SIO('SIO_000378'):
            return True
        if uri == cls._namespace_SIO('SIO_000379'):
            return True
        if uri == cls._namespace_SIO('SIO_000380'):
            return True
        if uri == cls._namespace_SIO('SIO_000381'):
            return True
        if uri == cls._namespace_SIO('SIO_000382'):
            return True
        if uri == cls._namespace_SIO('SIO_000383'):
            return True
        if uri == cls._namespace_SIO('SIO_000384'):
            return True
        if uri == cls._namespace_SIO('SIO_000385'):
            return True
        if uri == cls._namespace_SIO('SIO_000386'):
            return True
        if uri == cls._namespace_SIO('SIO_000387'):
            return True
        if uri == cls._namespace_SIO('SIO_000388'):
            return True
        if uri == cls._namespace_SIO('SIO_000389'):
            return True
        if uri == cls._namespace_SIO('SIO_000390'):
            return True
        if uri == cls._namespace_SIO('SIO_000391'):
            return True
        if uri == cls._namespace_SIO('SIO_000392'):
            return True
        if uri == cls._namespace_SIO('SIO_000393'):
            return True
        if uri == cls._namespace_SIO('SIO_000394'):
            return True
        if uri == cls._namespace_SIO('SIO_000395'):
            return True
        if uri == cls._namespace_SIO('SIO_000396'):
            return True
        if uri == cls._namespace_SIO('SIO_000397'):
            return True
        if uri == cls._namespace_SIO('SIO_000398'):
            return True
        if uri == cls._namespace_SIO('SIO_000399'):
            return True
        if uri == cls._namespace_SIO('SIO_000400'):
            return True
        if uri == cls._namespace_SIO('SIO_000401'):
            return True
        if uri == cls._namespace_SIO('SIO_000402'):
            return True
        if uri == cls._namespace_SIO('SIO_000403'):
            return True
        if uri == cls._namespace_SIO('SIO_000404'):
            return True
        if uri == cls._namespace_SIO('SIO_000405'):
            return True
        if uri == cls._namespace_SIO('SIO_000406'):
            return True
        if uri == cls._namespace_SIO('SIO_000407'):
            return True
        if uri == cls._namespace_SIO('SIO_000408'):
            return True
        if uri == cls._namespace_SIO('SIO_000409'):
            return True
        if uri == cls._namespace_SIO('SIO_000410'):
            return True
        if uri == cls._namespace_SIO('SIO_000411'):
            return True
        if uri == cls._namespace_SIO('SIO_000412'):
            return True
        if uri == cls._namespace_SIO('SIO_000413'):
            return True
        if uri == cls._namespace_SIO('SIO_000414'):
            return True
        if uri == cls._namespace_SIO('SIO_000415'):
            return True
        if uri == cls._namespace_SIO('SIO_000417'):
            return True
        if uri == cls._namespace_SIO('SIO_000418'):
            return True
        if uri == cls._namespace_SIO('SIO_000419'):
            return True
        if uri == cls._namespace_SIO('SIO_000423'):
            return True
        if uri == cls._namespace_SIO('SIO_000428'):
            return True
        if uri == cls._namespace_SIO('SIO_000429'):
            return True
        if uri == cls._namespace_SIO('SIO_000430'):
            return True
        if uri == cls._namespace_SIO('SIO_000431'):
            return True
        if uri == cls._namespace_SIO('SIO_000432'):
            return True
        if uri == cls._namespace_SIO('SIO_000433'):
            return True
        if uri == cls._namespace_SIO('SIO_000434'):
            return True
        if uri == cls._namespace_SIO('SIO_000435'):
            return True
        if uri == cls._namespace_SIO('SIO_000436'):
            return True
        if uri == cls._namespace_SIO('SIO_000437'):
            return True
        if uri == cls._namespace_SIO('SIO_000438'):
            return True
        if uri == cls._namespace_SIO('SIO_000439'):
            return True
        if uri == cls._namespace_SIO('SIO_000440'):
            return True
        if uri == cls._namespace_SIO('SIO_000441'):
            return True
        if uri == cls._namespace_SIO('SIO_000442'):
            return True
        if uri == cls._namespace_SIO('SIO_000443'):
            return True
        if uri == cls._namespace_SIO('SIO_000444'):
            return True
        if uri == cls._namespace_SIO('SIO_000445'):
            return True
        if uri == cls._namespace_SIO('SIO_000446'):
            return True
        if uri == cls._namespace_SIO('SIO_000447'):
            return True
        if uri == cls._namespace_SIO('SIO_000448'):
            return True
        if uri == cls._namespace_SIO('SIO_000449'):
            return True
        if uri == cls._namespace_SIO('SIO_000450'):
            return True
        if uri == cls._namespace_SIO('SIO_000451'):
            return True
        if uri == cls._namespace_SIO('SIO_000452'):
            return True
        if uri == cls._namespace_SIO('SIO_000453'):
            return True
        if uri == cls._namespace_SIO('SIO_000454'):
            return True
        if uri == cls._namespace_SIO('SIO_000455'):
            return True
        if uri == cls._namespace_SIO('SIO_000456'):
            return True
        if uri == cls._namespace_SIO('SIO_000457'):
            return True
        if uri == cls._namespace_SIO('SIO_000458'):
            return True
        if uri == cls._namespace_SIO('SIO_000459'):
            return True
        if uri == cls._namespace_SIO('SIO_000460'):
            return True
        if uri == cls._namespace_SIO('SIO_000461'):
            return True
        if uri == cls._namespace_SIO('SIO_000462'):
            return True
        if uri == cls._namespace_SIO('SIO_000463'):
            return True
        if uri == cls._namespace_SIO('SIO_000464'):
            return True
        if uri == cls._namespace_SIO('SIO_000465'):
            return True
        if uri == cls._namespace_SIO('SIO_000466'):
            return True
        if uri == cls._namespace_SIO('SIO_000467'):
            return True
        if uri == cls._namespace_SIO('SIO_000468'):
            return True
        if uri == cls._namespace_SIO('SIO_000469'):
            return True
        if uri == cls._namespace_SIO('SIO_000470'):
            return True
        if uri == cls._namespace_SIO('SIO_000471'):
            return True
        if uri == cls._namespace_SIO('SIO_000472'):
            return True
        if uri == cls._namespace_SIO('SIO_000473'):
            return True
        if uri == cls._namespace_SIO('SIO_000474'):
            return True
        if uri == cls._namespace_SIO('SIO_000475'):
            return True
        if uri == cls._namespace_SIO('SIO_000476'):
            return True
        if uri == cls._namespace_SIO('SIO_000478'):
            return True
        if uri == cls._namespace_SIO('SIO_000479'):
            return True
        if uri == cls._namespace_SIO('SIO_000480'):
            return True
        if uri == cls._namespace_SIO('SIO_000481'):
            return True
        if uri == cls._namespace_SIO('SIO_000483'):
            return True
        if uri == cls._namespace_SIO('SIO_000485'):
            return True
        if uri == cls._namespace_SIO('SIO_000486'):
            return True
        if uri == cls._namespace_SIO('SIO_000487'):
            return True
        if uri == cls._namespace_SIO('SIO_000488'):
            return True
        if uri == cls._namespace_SIO('SIO_000489'):
            return True
        if uri == cls._namespace_SIO('SIO_000492'):
            return True
        if uri == cls._namespace_SIO('SIO_000493'):
            return True
        if uri == cls._namespace_SIO('SIO_000494'):
            return True
        if uri == cls._namespace_SIO('SIO_000498'):
            return True
        if uri == cls._namespace_SIO('SIO_000499'):
            return True
        if uri == cls._namespace_SIO('SIO_000500'):
            return True
        if uri == cls._namespace_SIO('SIO_000501'):
            return True
        if uri == cls._namespace_SIO('SIO_000502'):
            return True
        if uri == cls._namespace_SIO('SIO_000503'):
            return True
        if uri == cls._namespace_SIO('SIO_000504'):
            return True
        if uri == cls._namespace_SIO('SIO_000505'):
            return True
        if uri == cls._namespace_SIO('SIO_000506'):
            return True
        if uri == cls._namespace_SIO('SIO_000507'):
            return True
        if uri == cls._namespace_SIO('SIO_000508'):
            return True
        if uri == cls._namespace_SIO('SIO_000509'):
            return True
        if uri == cls._namespace_SIO('SIO_000510'):
            return True
        if uri == cls._namespace_SIO('SIO_000511'):
            return True
        if uri == cls._namespace_SIO('SIO_000512'):
            return True
        if uri == cls._namespace_SIO('SIO_000513'):
            return True
        if uri == cls._namespace_SIO('SIO_000514'):
            return True
        if uri == cls._namespace_SIO('SIO_000515'):
            return True
        if uri == cls._namespace_SIO('SIO_000516'):
            return True
        if uri == cls._namespace_SIO('SIO_000517'):
            return True
        if uri == cls._namespace_SIO('SIO_000518'):
            return True
        if uri == cls._namespace_SIO('SIO_000519'):
            return True
        if uri == cls._namespace_SIO('SIO_000520'):
            return True
        if uri == cls._namespace_SIO('SIO_000521'):
            return True
        if uri == cls._namespace_SIO('SIO_000522'):
            return True
        if uri == cls._namespace_SIO('SIO_000523'):
            return True
        if uri == cls._namespace_SIO('SIO_000524'):
            return True
        if uri == cls._namespace_SIO('SIO_000525'):
            return True
        if uri == cls._namespace_SIO('SIO_000526'):
            return True
        if uri == cls._namespace_SIO('SIO_000527'):
            return True
        if uri == cls._namespace_SIO('SIO_000528'):
            return True
        if uri == cls._namespace_SIO('SIO_000529'):
            return True
        if uri == cls._namespace_SIO('SIO_000530'):
            return True
        if uri == cls._namespace_SIO('SIO_000531'):
            return True
        if uri == cls._namespace_SIO('SIO_000532'):
            return True
        if uri == cls._namespace_SIO('SIO_000533'):
            return True
        if uri == cls._namespace_SIO('SIO_000534'):
            return True
        if uri == cls._namespace_SIO('SIO_000535'):
            return True
        if uri == cls._namespace_SIO('SIO_000536'):
            return True
        if uri == cls._namespace_SIO('SIO_000537'):
            return True
        if uri == cls._namespace_SIO('SIO_000538'):
            return True
        if uri == cls._namespace_SIO('SIO_000539'):
            return True
        if uri == cls._namespace_SIO('SIO_000540'):
            return True
        if uri == cls._namespace_SIO('SIO_000541'):
            return True
        if uri == cls._namespace_SIO('SIO_000542'):
            return True
        if uri == cls._namespace_SIO('SIO_000543'):
            return True
        if uri == cls._namespace_SIO('SIO_000544'):
            return True
        if uri == cls._namespace_SIO('SIO_000545'):
            return True
        if uri == cls._namespace_SIO('SIO_000546'):
            return True
        if uri == cls._namespace_SIO('SIO_000547'):
            return True
        if uri == cls._namespace_SIO('SIO_000549'):
            return True
        if uri == cls._namespace_SIO('SIO_000550'):
            return True
        if uri == cls._namespace_SIO('SIO_000551'):
            return True
        if uri == cls._namespace_SIO('SIO_000554'):
            return True
        if uri == cls._namespace_SIO('SIO_000555'):
            return True
        if uri == cls._namespace_SIO('SIO_000556'):
            return True
        if uri == cls._namespace_SIO('SIO_000559'):
            return True
        if uri == cls._namespace_SIO('SIO_000561'):
            return True
        if uri == cls._namespace_SIO('SIO_000562'):
            return True
        if uri == cls._namespace_SIO('SIO_000564'):
            return True
        if uri == cls._namespace_SIO('SIO_000565'):
            return True
        if uri == cls._namespace_SIO('SIO_000566'):
            return True
        if uri == cls._namespace_SIO('SIO_000567'):
            return True
        if uri == cls._namespace_SIO('SIO_000568'):
            return True
        if uri == cls._namespace_SIO('SIO_000569'):
            return True
        if uri == cls._namespace_SIO('SIO_000570'):
            return True
        if uri == cls._namespace_SIO('SIO_000571'):
            return True
        if uri == cls._namespace_SIO('SIO_000572'):
            return True
        if uri == cls._namespace_SIO('SIO_000573'):
            return True
        if uri == cls._namespace_SIO('SIO_000574'):
            return True
        if uri == cls._namespace_SIO('SIO_000575'):
            return True
        if uri == cls._namespace_SIO('SIO_000576'):
            return True
        if uri == cls._namespace_SIO('SIO_000577'):
            return True
        if uri == cls._namespace_SIO('SIO_000578'):
            return True
        if uri == cls._namespace_SIO('SIO_000579'):
            return True
        if uri == cls._namespace_SIO('SIO_000580'):
            return True
        if uri == cls._namespace_SIO('SIO_000581'):
            return True
        if uri == cls._namespace_SIO('SIO_000582'):
            return True
        if uri == cls._namespace_SIO('SIO_000583'):
            return True
        if uri == cls._namespace_SIO('SIO_000585'):
            return True
        if uri == cls._namespace_SIO('SIO_000587'):
            return True
        if uri == cls._namespace_SIO('SIO_000588'):
            return True
        if uri == cls._namespace_SIO('SIO_000589'):
            return True
        if uri == cls._namespace_SIO('SIO_000590'):
            return True
        if uri == cls._namespace_SIO('SIO_000591'):
            return True
        if uri == cls._namespace_SIO('SIO_000592'):
            return True
        if uri == cls._namespace_SIO('SIO_000593'):
            return True
        if uri == cls._namespace_SIO('SIO_000594'):
            return True
        if uri == cls._namespace_SIO('SIO_000595'):
            return True
        if uri == cls._namespace_SIO('SIO_000596'):
            return True
        if uri == cls._namespace_SIO('SIO_000597'):
            return True
        if uri == cls._namespace_SIO('SIO_000598'):
            return True
        if uri == cls._namespace_SIO('SIO_000600'):
            return True
        if uri == cls._namespace_SIO('SIO_000602'):
            return True
        if uri == cls._namespace_SIO('SIO_000605'):
            return True
        if uri == cls._namespace_SIO('SIO_000608'):
            return True
        if uri == cls._namespace_SIO('SIO_000609'):
            return True
        if uri == cls._namespace_SIO('SIO_000610'):
            return True
        if uri == cls._namespace_SIO('SIO_000611'):
            return True
        if uri == cls._namespace_SIO('SIO_000612'):
            return True
        if uri == cls._namespace_SIO('SIO_000613'):
            return True
        if uri == cls._namespace_SIO('SIO_000614'):
            return True
        if uri == cls._namespace_SIO('SIO_000616'):
            return True
        if uri == cls._namespace_SIO('SIO_000617'):
            return True
        if uri == cls._namespace_SIO('SIO_000618'):
            return True
        if uri == cls._namespace_SIO('SIO_000619'):
            return True
        if uri == cls._namespace_SIO('SIO_000620'):
            return True
        if uri == cls._namespace_SIO('SIO_000621'):
            return True
        if uri == cls._namespace_SIO('SIO_000622'):
            return True
        if uri == cls._namespace_SIO('SIO_000623'):
            return True
        if uri == cls._namespace_SIO('SIO_000624'):
            return True
        if uri == cls._namespace_SIO('SIO_000625'):
            return True
        if uri == cls._namespace_SIO('SIO_000626'):
            return True
        if uri == cls._namespace_SIO('SIO_000638'):
            return True
        if uri == cls._namespace_SIO('SIO_000639'):
            return True
        if uri == cls._namespace_SIO('SIO_000640'):
            return True
        if uri == cls._namespace_SIO('SIO_000647'):
            return True
        if uri == cls._namespace_SIO('SIO_000648'):
            return True
        if uri == cls._namespace_SIO('SIO_000649'):
            return True
        if uri == cls._namespace_SIO('SIO_000650'):
            return True
        if uri == cls._namespace_SIO('SIO_000651'):
            return True
        if uri == cls._namespace_SIO('SIO_000653'):
            return True
        if uri == cls._namespace_SIO('SIO_000654'):
            return True
        if uri == cls._namespace_SIO('SIO_000660'):
            return True
        if uri == cls._namespace_SIO('SIO_000661'):
            return True
        if uri == cls._namespace_SIO('SIO_000662'):
            return True
        if uri == cls._namespace_SIO('SIO_000663'):
            return True
        if uri == cls._namespace_SIO('SIO_000664'):
            return True
        if uri == cls._namespace_SIO('SIO_000665'):
            return True
        if uri == cls._namespace_SIO('SIO_000666'):
            return True
        if uri == cls._namespace_SIO('SIO_000667'):
            return True
        if uri == cls._namespace_SIO('SIO_000669'):
            return True
        if uri == cls._namespace_SIO('SIO_000670'):
            return True
        if uri == cls._namespace_SIO('SIO_000675'):
            return True
        if uri == cls._namespace_SIO('SIO_000676'):
            return True
        if uri == cls._namespace_SIO('SIO_000677'):
            return True
        if uri == cls._namespace_SIO('SIO_000678'):
            return True
        if uri == cls._namespace_SIO('SIO_000683'):
            return True
        if uri == cls._namespace_SIO('SIO_000686'):
            return True
        if uri == cls._namespace_SIO('SIO_000688'):
            return True
        if uri == cls._namespace_SIO('SIO_000689'):
            return True
        if uri == cls._namespace_SIO('SIO_000690'):
            return True
        if uri == cls._namespace_SIO('SIO_000692'):
            return True
        if uri == cls._namespace_SIO('SIO_000693'):
            return True
        if uri == cls._namespace_SIO('SIO_000694'):
            return True
        if uri == cls._namespace_SIO('SIO_000695'):
            return True
        if uri == cls._namespace_SIO('SIO_000696'):
            return True
        if uri == cls._namespace_SIO('SIO_000698'):
            return True
        if uri == cls._namespace_SIO('SIO_000700'):
            return True
        if uri == cls._namespace_SIO('SIO_000701'):
            return True
        if uri == cls._namespace_SIO('SIO_000702'):
            return True
        if uri == cls._namespace_SIO('SIO_000703'):
            return True
        if uri == cls._namespace_SIO('SIO_000704'):
            return True
        if uri == cls._namespace_SIO('SIO_000705'):
            return True
        if uri == cls._namespace_SIO('SIO_000706'):
            return True
        if uri == cls._namespace_SIO('SIO_000707'):
            return True
        if uri == cls._namespace_SIO('SIO_000708'):
            return True
        if uri == cls._namespace_SIO('SIO_000711'):
            return True
        if uri == cls._namespace_SIO('SIO_000712'):
            return True
        if uri == cls._namespace_SIO('SIO_000713'):
            return True
        if uri == cls._namespace_SIO('SIO_000714'):
            return True
        if uri == cls._namespace_SIO('SIO_000715'):
            return True
        if uri == cls._namespace_SIO('SIO_000716'):
            return True
        if uri == cls._namespace_SIO('SIO_000717'):
            return True
        if uri == cls._namespace_SIO('SIO_000719'):
            return True
        if uri == cls._namespace_SIO('SIO_000720'):
            return True
        if uri == cls._namespace_SIO('SIO_000721'):
            return True
        if uri == cls._namespace_SIO('SIO_000722'):
            return True
        if uri == cls._namespace_SIO('SIO_000723'):
            return True
        if uri == cls._namespace_SIO('SIO_000724'):
            return True
        if uri == cls._namespace_SIO('SIO_000725'):
            return True
        if uri == cls._namespace_SIO('SIO_000726'):
            return True
        if uri == cls._namespace_SIO('SIO_000727'):
            return True
        if uri == cls._namespace_SIO('SIO_000728'):
            return True
        if uri == cls._namespace_SIO('SIO_000729'):
            return True
        if uri == cls._namespace_SIO('SIO_000730'):
            return True
        if uri == cls._namespace_SIO('SIO_000731'):
            return True
        if uri == cls._namespace_SIO('SIO_000732'):
            return True
        if uri == cls._namespace_SIO('SIO_000739'):
            return True
        if uri == cls._namespace_SIO('SIO_000740'):
            return True
        if uri == cls._namespace_SIO('SIO_000741'):
            return True
        if uri == cls._namespace_SIO('SIO_000742'):
            return True
        if uri == cls._namespace_SIO('SIO_000743'):
            return True
        if uri == cls._namespace_SIO('SIO_000744'):
            return True
        if uri == cls._namespace_SIO('SIO_000745'):
            return True
        if uri == cls._namespace_SIO('SIO_000746'):
            return True
        if uri == cls._namespace_SIO('SIO_000747'):
            return True
        if uri == cls._namespace_SIO('SIO_000748'):
            return True
        if uri == cls._namespace_SIO('SIO_000750'):
            return True
        if uri == cls._namespace_SIO('SIO_000751'):
            return True
        if uri == cls._namespace_SIO('SIO_000752'):
            return True
        if uri == cls._namespace_SIO('SIO_000753'):
            return True
        if uri == cls._namespace_SIO('SIO_000754'):
            return True
        if uri == cls._namespace_SIO('SIO_000755'):
            return True
        if uri == cls._namespace_SIO('SIO_000756'):
            return True
        if uri == cls._namespace_SIO('SIO_000757'):
            return True
        if uri == cls._namespace_SIO('SIO_000758'):
            return True
        if uri == cls._namespace_SIO('SIO_000759'):
            return True
        if uri == cls._namespace_SIO('SIO_000760'):
            return True
        if uri == cls._namespace_SIO('SIO_000761'):
            return True
        if uri == cls._namespace_SIO('SIO_000762'):
            return True
        if uri == cls._namespace_SIO('SIO_000763'):
            return True
        if uri == cls._namespace_SIO('SIO_000764'):
            return True
        if uri == cls._namespace_SIO('SIO_000765'):
            return True
        if uri == cls._namespace_SIO('SIO_000766'):
            return True
        if uri == cls._namespace_SIO('SIO_000767'):
            return True
        if uri == cls._namespace_SIO('SIO_000768'):
            return True
        if uri == cls._namespace_SIO('SIO_000769'):
            return True
        if uri == cls._namespace_SIO('SIO_000770'):
            return True
        if uri == cls._namespace_SIO('SIO_000771'):
            return True
        if uri == cls._namespace_SIO('SIO_000776'):
            return True
        if uri == cls._namespace_SIO('SIO_000777'):
            return True
        if uri == cls._namespace_SIO('SIO_000778'):
            return True
        if uri == cls._namespace_SIO('SIO_000779'):
            return True
        if uri == cls._namespace_SIO('SIO_000780'):
            return True
        if uri == cls._namespace_SIO('SIO_000783'):
            return True
        if uri == cls._namespace_SIO('SIO_000784'):
            return True
        if uri == cls._namespace_SIO('SIO_000785'):
            return True
        if uri == cls._namespace_SIO('SIO_000786'):
            return True
        if uri == cls._namespace_SIO('SIO_000787'):
            return True
        if uri == cls._namespace_SIO('SIO_000788'):
            return True
        if uri == cls._namespace_SIO('SIO_000789'):
            return True
        if uri == cls._namespace_SIO('SIO_000790'):
            return True
        if uri == cls._namespace_SIO('SIO_000791'):
            return True
        if uri == cls._namespace_SIO('SIO_000792'):
            return True
        if uri == cls._namespace_SIO('SIO_000794'):
            return True
        if uri == cls._namespace_SIO('SIO_000795'):
            return True
        if uri == cls._namespace_SIO('SIO_000796'):
            return True
        if uri == cls._namespace_SIO('SIO_000797'):
            return True
        if uri == cls._namespace_SIO('SIO_000798'):
            return True
        if uri == cls._namespace_SIO('SIO_000799'):
            return True
        if uri == cls._namespace_SIO('SIO_000800'):
            return True
        if uri == cls._namespace_SIO('SIO_000801'):
            return True
        if uri == cls._namespace_SIO('SIO_000802'):
            return True
        if uri == cls._namespace_SIO('SIO_000803'):
            return True
        if uri == cls._namespace_SIO('SIO_000804'):
            return True
        if uri == cls._namespace_SIO('SIO_000805'):
            return True
        if uri == cls._namespace_SIO('SIO_000806'):
            return True
        if uri == cls._namespace_SIO('SIO_000807'):
            return True
        if uri == cls._namespace_SIO('SIO_000808'):
            return True
        if uri == cls._namespace_SIO('SIO_000809'):
            return True
        if uri == cls._namespace_SIO('SIO_000810'):
            return True
        if uri == cls._namespace_SIO('SIO_000811'):
            return True
        if uri == cls._namespace_SIO('SIO_000812'):
            return True
        if uri == cls._namespace_SIO('SIO_000813'):
            return True
        if uri == cls._namespace_SIO('SIO_000814'):
            return True
        if uri == cls._namespace_SIO('SIO_000815'):
            return True
        if uri == cls._namespace_SIO('SIO_000816'):
            return True
        if uri == cls._namespace_SIO('SIO_000817'):
            return True
        if uri == cls._namespace_SIO('SIO_000818'):
            return True
        if uri == cls._namespace_SIO('SIO_000819'):
            return True
        if uri == cls._namespace_SIO('SIO_000820'):
            return True
        if uri == cls._namespace_SIO('SIO_000821'):
            return True
        if uri == cls._namespace_SIO('SIO_000822'):
            return True
        if uri == cls._namespace_SIO('SIO_000823'):
            return True
        if uri == cls._namespace_SIO('SIO_000824'):
            return True
        if uri == cls._namespace_SIO('SIO_000825'):
            return True
        if uri == cls._namespace_SIO('SIO_000826'):
            return True
        if uri == cls._namespace_SIO('SIO_000827'):
            return True
        if uri == cls._namespace_SIO('SIO_000828'):
            return True
        if uri == cls._namespace_SIO('SIO_000829'):
            return True
        if uri == cls._namespace_SIO('SIO_000830'):
            return True
        if uri == cls._namespace_SIO('SIO_000831'):
            return True
        if uri == cls._namespace_SIO('SIO_000832'):
            return True
        if uri == cls._namespace_SIO('SIO_000833'):
            return True
        if uri == cls._namespace_SIO('SIO_000834'):
            return True
        if uri == cls._namespace_SIO('SIO_000835'):
            return True
        if uri == cls._namespace_SIO('SIO_000836'):
            return True
        if uri == cls._namespace_SIO('SIO_000837'):
            return True
        if uri == cls._namespace_SIO('SIO_000838'):
            return True
        if uri == cls._namespace_SIO('SIO_000839'):
            return True
        if uri == cls._namespace_SIO('SIO_000840'):
            return True
        if uri == cls._namespace_SIO('SIO_000841'):
            return True
        if uri == cls._namespace_SIO('SIO_000842'):
            return True
        if uri == cls._namespace_SIO('SIO_000843'):
            return True
        if uri == cls._namespace_SIO('SIO_000844'):
            return True
        if uri == cls._namespace_SIO('SIO_000845'):
            return True
        if uri == cls._namespace_SIO('SIO_000846'):
            return True
        if uri == cls._namespace_SIO('SIO_000847'):
            return True
        if uri == cls._namespace_SIO('SIO_000848'):
            return True
        if uri == cls._namespace_SIO('SIO_000849'):
            return True
        if uri == cls._namespace_SIO('SIO_000850'):
            return True
        if uri == cls._namespace_SIO('SIO_000851'):
            return True
        if uri == cls._namespace_SIO('SIO_000852'):
            return True
        if uri == cls._namespace_SIO('SIO_000853'):
            return True
        if uri == cls._namespace_SIO('SIO_000854'):
            return True
        if uri == cls._namespace_SIO('SIO_000855'):
            return True
        if uri == cls._namespace_SIO('SIO_000856'):
            return True
        if uri == cls._namespace_SIO('SIO_000857'):
            return True
        if uri == cls._namespace_SIO('SIO_000858'):
            return True
        if uri == cls._namespace_SIO('SIO_000859'):
            return True
        if uri == cls._namespace_SIO('SIO_000860'):
            return True
        if uri == cls._namespace_SIO('SIO_000861'):
            return True
        if uri == cls._namespace_SIO('SIO_000862'):
            return True
        if uri == cls._namespace_SIO('SIO_000863'):
            return True
        if uri == cls._namespace_SIO('SIO_000864'):
            return True
        if uri == cls._namespace_SIO('SIO_000865'):
            return True
        if uri == cls._namespace_SIO('SIO_000866'):
            return True
        if uri == cls._namespace_SIO('SIO_000867'):
            return True
        if uri == cls._namespace_SIO('SIO_000868'):
            return True
        if uri == cls._namespace_SIO('SIO_000869'):
            return True
        if uri == cls._namespace_SIO('SIO_000870'):
            return True
        if uri == cls._namespace_SIO('SIO_000871'):
            return True
        if uri == cls._namespace_SIO('SIO_000872'):
            return True
        if uri == cls._namespace_SIO('SIO_000873'):
            return True
        if uri == cls._namespace_SIO('SIO_000875'):
            return True
        if uri == cls._namespace_SIO('SIO_000876'):
            return True
        if uri == cls._namespace_SIO('SIO_000877'):
            return True
        if uri == cls._namespace_SIO('SIO_000878'):
            return True
        if uri == cls._namespace_SIO('SIO_000879'):
            return True
        if uri == cls._namespace_SIO('SIO_000880'):
            return True
        if uri == cls._namespace_SIO('SIO_000881'):
            return True
        if uri == cls._namespace_SIO('SIO_000882'):
            return True
        if uri == cls._namespace_SIO('SIO_000883'):
            return True
        if uri == cls._namespace_SIO('SIO_000884'):
            return True
        if uri == cls._namespace_SIO('SIO_000885'):
            return True
        if uri == cls._namespace_SIO('SIO_000886'):
            return True
        if uri == cls._namespace_SIO('SIO_000887'):
            return True
        if uri == cls._namespace_SIO('SIO_000888'):
            return True
        if uri == cls._namespace_SIO('SIO_000889'):
            return True
        if uri == cls._namespace_SIO('SIO_000890'):
            return True
        if uri == cls._namespace_SIO('SIO_000891'):
            return True
        if uri == cls._namespace_SIO('SIO_000893'):
            return True
        if uri == cls._namespace_SIO('SIO_000894'):
            return True
        if uri == cls._namespace_SIO('SIO_000895'):
            return True
        if uri == cls._namespace_SIO('SIO_000896'):
            return True
        if uri == cls._namespace_SIO('SIO_000897'):
            return True
        if uri == cls._namespace_SIO('SIO_000898'):
            return True
        if uri == cls._namespace_SIO('SIO_000899'):
            return True
        if uri == cls._namespace_SIO('SIO_000902'):
            return True
        if uri == cls._namespace_SIO('SIO_000903'):
            return True
        if uri == cls._namespace_SIO('SIO_000904'):
            return True
        if uri == cls._namespace_SIO('SIO_000906'):
            return True
        if uri == cls._namespace_SIO('SIO_000907'):
            return True
        if uri == cls._namespace_SIO('SIO_000908'):
            return True
        if uri == cls._namespace_SIO('SIO_000909'):
            return True
        if uri == cls._namespace_SIO('SIO_000910'):
            return True
        if uri == cls._namespace_SIO('SIO_000911'):
            return True
        if uri == cls._namespace_SIO('SIO_000912'):
            return True
        if uri == cls._namespace_SIO('SIO_000913'):
            return True
        if uri == cls._namespace_SIO('SIO_000914'):
            return True
        if uri == cls._namespace_SIO('SIO_000915'):
            return True
        if uri == cls._namespace_SIO('SIO_000916'):
            return True
        if uri == cls._namespace_SIO('SIO_000917'):
            return True
        if uri == cls._namespace_SIO('SIO_000918'):
            return True
        if uri == cls._namespace_SIO('SIO_000919'):
            return True
        if uri == cls._namespace_SIO('SIO_000920'):
            return True
        if uri == cls._namespace_SIO('SIO_000921'):
            return True
        if uri == cls._namespace_SIO('SIO_000922'):
            return True
        if uri == cls._namespace_SIO('SIO_000923'):
            return True
        if uri == cls._namespace_SIO('SIO_000924'):
            return True
        if uri == cls._namespace_SIO('SIO_000926'):
            return True
        if uri == cls._namespace_SIO('SIO_000927'):
            return True
        if uri == cls._namespace_SIO('SIO_000928'):
            return True
        if uri == cls._namespace_SIO('SIO_000929'):
            return True
        if uri == cls._namespace_SIO('SIO_000930'):
            return True
        if uri == cls._namespace_SIO('SIO_000931'):
            return True
        if uri == cls._namespace_SIO('SIO_000932'):
            return True
        if uri == cls._namespace_SIO('SIO_000933'):
            return True
        if uri == cls._namespace_SIO('SIO_000934'):
            return True
        if uri == cls._namespace_SIO('SIO_000935'):
            return True
        if uri == cls._namespace_SIO('SIO_000936'):
            return True
        if uri == cls._namespace_SIO('SIO_000937'):
            return True
        if uri == cls._namespace_SIO('SIO_000938'):
            return True
        if uri == cls._namespace_SIO('SIO_000939'):
            return True
        if uri == cls._namespace_SIO('SIO_000940'):
            return True
        if uri == cls._namespace_SIO('SIO_000941'):
            return True
        if uri == cls._namespace_SIO('SIO_000942'):
            return True
        if uri == cls._namespace_SIO('SIO_000943'):
            return True
        if uri == cls._namespace_SIO('SIO_000944'):
            return True
        if uri == cls._namespace_SIO('SIO_000945'):
            return True
        if uri == cls._namespace_SIO('SIO_000946'):
            return True
        if uri == cls._namespace_SIO('SIO_000947'):
            return True
        if uri == cls._namespace_SIO('SIO_000948'):
            return True
        if uri == cls._namespace_SIO('SIO_000949'):
            return True
        if uri == cls._namespace_SIO('SIO_000950'):
            return True
        if uri == cls._namespace_SIO('SIO_000951'):
            return True
        if uri == cls._namespace_SIO('SIO_000952'):
            return True
        if uri == cls._namespace_SIO('SIO_000953'):
            return True
        if uri == cls._namespace_SIO('SIO_000954'):
            return True
        if uri == cls._namespace_SIO('SIO_000955'):
            return True
        if uri == cls._namespace_SIO('SIO_000956'):
            return True
        if uri == cls._namespace_SIO('SIO_000957'):
            return True
        if uri == cls._namespace_SIO('SIO_000959'):
            return True
        if uri == cls._namespace_SIO('SIO_000960'):
            return True
        if uri == cls._namespace_SIO('SIO_000961'):
            return True
        if uri == cls._namespace_SIO('SIO_000962'):
            return True
        if uri == cls._namespace_SIO('SIO_000963'):
            return True
        if uri == cls._namespace_SIO('SIO_000964'):
            return True
        if uri == cls._namespace_SIO('SIO_000965'):
            return True
        if uri == cls._namespace_SIO('SIO_000966'):
            return True
        if uri == cls._namespace_SIO('SIO_000967'):
            return True
        if uri == cls._namespace_SIO('SIO_000968'):
            return True
        if uri == cls._namespace_SIO('SIO_000969'):
            return True
        if uri == cls._namespace_SIO('SIO_000976'):
            return True
        if uri == cls._namespace_SIO('SIO_000977'):
            return True
        if uri == cls._namespace_SIO('SIO_000978'):
            return True
        if uri == cls._namespace_SIO('SIO_000979'):
            return True
        if uri == cls._namespace_SIO('SIO_000980'):
            return True
        if uri == cls._namespace_SIO('SIO_000981'):
            return True
        if uri == cls._namespace_SIO('SIO_000982'):
            return True
        if uri == cls._namespace_SIO('SIO_000983'):
            return True
        if uri == cls._namespace_SIO('SIO_000984'):
            return True
        if uri == cls._namespace_SIO('SIO_000985'):
            return True
        if uri == cls._namespace_SIO('SIO_000986'):
            return True
        if uri == cls._namespace_SIO('SIO_000987'):
            return True
        if uri == cls._namespace_SIO('SIO_000988'):
            return True
        if uri == cls._namespace_SIO('SIO_000989'):
            return True
        if uri == cls._namespace_SIO('SIO_000991'):
            return True
        if uri == cls._namespace_SIO('SIO_000992'):
            return True
        if uri == cls._namespace_SIO('SIO_000993'):
            return True
        if uri == cls._namespace_SIO('SIO_000994'):
            return True
        if uri == cls._namespace_SIO('SIO_000995'):
            return True
        if uri == cls._namespace_SIO('SIO_000996'):
            return True
        if uri == cls._namespace_SIO('SIO_000997'):
            return True
        if uri == cls._namespace_SIO('SIO_000998'):
            return True
        if uri == cls._namespace_SIO('SIO_000999'):
            return True
        if uri == cls._namespace_SIO('SIO_001000'):
            return True
        if uri == cls._namespace_SIO('SIO_001001'):
            return True
        if uri == cls._namespace_SIO('SIO_001002'):
            return True
        if uri == cls._namespace_SIO('SIO_001003'):
            return True
        if uri == cls._namespace_SIO('SIO_001004'):
            return True
        if uri == cls._namespace_SIO('SIO_001005'):
            return True
        if uri == cls._namespace_SIO('SIO_001006'):
            return True
        if uri == cls._namespace_SIO('SIO_001007'):
            return True
        if uri == cls._namespace_SIO('SIO_001008'):
            return True
        if uri == cls._namespace_SIO('SIO_001009'):
            return True
        if uri == cls._namespace_SIO('SIO_001010'):
            return True
        if uri == cls._namespace_SIO('SIO_001011'):
            return True
        if uri == cls._namespace_SIO('SIO_001012'):
            return True
        if uri == cls._namespace_SIO('SIO_001013'):
            return True
        if uri == cls._namespace_SIO('SIO_001014'):
            return True
        if uri == cls._namespace_SIO('SIO_001015'):
            return True
        if uri == cls._namespace_SIO('SIO_001016'):
            return True
        if uri == cls._namespace_SIO('SIO_001017'):
            return True
        if uri == cls._namespace_SIO('SIO_001018'):
            return True
        if uri == cls._namespace_SIO('SIO_001019'):
            return True
        if uri == cls._namespace_SIO('SIO_001020'):
            return True
        if uri == cls._namespace_SIO('SIO_001021'):
            return True
        if uri == cls._namespace_SIO('SIO_001022'):
            return True
        if uri == cls._namespace_SIO('SIO_001023'):
            return True
        if uri == cls._namespace_SIO('SIO_001024'):
            return True
        if uri == cls._namespace_SIO('SIO_001025'):
            return True
        if uri == cls._namespace_SIO('SIO_001026'):
            return True
        if uri == cls._namespace_SIO('SIO_001027'):
            return True
        if uri == cls._namespace_SIO('SIO_001028'):
            return True
        if uri == cls._namespace_SIO('SIO_001029'):
            return True
        if uri == cls._namespace_SIO('SIO_001030'):
            return True
        if uri == cls._namespace_SIO('SIO_001031'):
            return True
        if uri == cls._namespace_SIO('SIO_001032'):
            return True
        if uri == cls._namespace_SIO('SIO_001033'):
            return True
        if uri == cls._namespace_SIO('SIO_001034'):
            return True
        if uri == cls._namespace_SIO('SIO_001035'):
            return True
        if uri == cls._namespace_SIO('SIO_001036'):
            return True
        if uri == cls._namespace_SIO('SIO_001037'):
            return True
        if uri == cls._namespace_SIO('SIO_001038'):
            return True
        if uri == cls._namespace_SIO('SIO_001039'):
            return True
        if uri == cls._namespace_SIO('SIO_001040'):
            return True
        if uri == cls._namespace_SIO('SIO_001041'):
            return True
        if uri == cls._namespace_SIO('SIO_001042'):
            return True
        if uri == cls._namespace_SIO('SIO_001043'):
            return True
        if uri == cls._namespace_SIO('SIO_001044'):
            return True
        if uri == cls._namespace_SIO('SIO_001045'):
            return True
        if uri == cls._namespace_SIO('SIO_001046'):
            return True
        if uri == cls._namespace_SIO('SIO_001047'):
            return True
        if uri == cls._namespace_SIO('SIO_001048'):
            return True
        if uri == cls._namespace_SIO('SIO_001049'):
            return True
        if uri == cls._namespace_SIO('SIO_001050'):
            return True
        if uri == cls._namespace_SIO('SIO_001051'):
            return True
        if uri == cls._namespace_SIO('SIO_001052'):
            return True
        if uri == cls._namespace_SIO('SIO_001053'):
            return True
        if uri == cls._namespace_SIO('SIO_001054'):
            return True
        if uri == cls._namespace_SIO('SIO_001055'):
            return True
        if uri == cls._namespace_SIO('SIO_001056'):
            return True
        if uri == cls._namespace_SIO('SIO_001057'):
            return True
        if uri == cls._namespace_SIO('SIO_001058'):
            return True
        if uri == cls._namespace_SIO('SIO_001059'):
            return True
        if uri == cls._namespace_SIO('SIO_001060'):
            return True
        if uri == cls._namespace_SIO('SIO_001061'):
            return True
        if uri == cls._namespace_SIO('SIO_001062'):
            return True
        if uri == cls._namespace_SIO('SIO_001063'):
            return True
        if uri == cls._namespace_SIO('SIO_001064'):
            return True
        if uri == cls._namespace_SIO('SIO_001065'):
            return True
        if uri == cls._namespace_SIO('SIO_001066'):
            return True
        if uri == cls._namespace_SIO('SIO_001067'):
            return True
        if uri == cls._namespace_SIO('SIO_001068'):
            return True
        if uri == cls._namespace_SIO('SIO_001069'):
            return True
        if uri == cls._namespace_SIO('SIO_001070'):
            return True
        if uri == cls._namespace_SIO('SIO_001071'):
            return True
        if uri == cls._namespace_SIO('SIO_001072'):
            return True
        if uri == cls._namespace_SIO('SIO_001073'):
            return True
        if uri == cls._namespace_SIO('SIO_001074'):
            return True
        if uri == cls._namespace_SIO('SIO_001075'):
            return True
        if uri == cls._namespace_SIO('SIO_001076'):
            return True
        if uri == cls._namespace_SIO('SIO_001077'):
            return True
        if uri == cls._namespace_SIO('SIO_001078'):
            return True
        if uri == cls._namespace_SIO('SIO_001079'):
            return True
        if uri == cls._namespace_SIO('SIO_001080'):
            return True
        if uri == cls._namespace_SIO('SIO_001081'):
            return True
        if uri == cls._namespace_SIO('SIO_001082'):
            return True
        if uri == cls._namespace_SIO('SIO_001083'):
            return True
        if uri == cls._namespace_SIO('SIO_001084'):
            return True
        if uri == cls._namespace_SIO('SIO_001085'):
            return True
        if uri == cls._namespace_SIO('SIO_001086'):
            return True
        if uri == cls._namespace_SIO('SIO_001087'):
            return True
        if uri == cls._namespace_SIO('SIO_001088'):
            return True
        if uri == cls._namespace_SIO('SIO_001089'):
            return True
        if uri == cls._namespace_SIO('SIO_001090'):
            return True
        if uri == cls._namespace_SIO('SIO_001091'):
            return True
        if uri == cls._namespace_SIO('SIO_001092'):
            return True
        if uri == cls._namespace_SIO('SIO_001093'):
            return True
        if uri == cls._namespace_SIO('SIO_001094'):
            return True
        if uri == cls._namespace_SIO('SIO_001095'):
            return True
        if uri == cls._namespace_SIO('SIO_001099'):
            return True
        if uri == cls._namespace_SIO('SIO_001100'):
            return True
        if uri == cls._namespace_SIO('SIO_001102'):
            return True
        if uri == cls._namespace_SIO('SIO_001103'):
            return True
        if uri == cls._namespace_SIO('SIO_001104'):
            return True
        if uri == cls._namespace_SIO('SIO_001105'):
            return True
        if uri == cls._namespace_SIO('SIO_001106'):
            return True
        if uri == cls._namespace_SIO('SIO_001107'):
            return True
        if uri == cls._namespace_SIO('SIO_001108'):
            return True
        if uri == cls._namespace_SIO('SIO_001109'):
            return True
        if uri == cls._namespace_SIO('SIO_001110'):
            return True
        if uri == cls._namespace_SIO('SIO_001111'):
            return True
        if uri == cls._namespace_SIO('SIO_001112'):
            return True
        if uri == cls._namespace_SIO('SIO_001113'):
            return True
        if uri == cls._namespace_SIO('SIO_001114'):
            return True
        if uri == cls._namespace_SIO('SIO_001115'):
            return True
        if uri == cls._namespace_SIO('SIO_001116'):
            return True
        if uri == cls._namespace_SIO('SIO_001117'):
            return True
        if uri == cls._namespace_SIO('SIO_001118'):
            return True
        if uri == cls._namespace_SIO('SIO_001119'):
            return True
        if uri == cls._namespace_SIO('SIO_001120'):
            return True
        if uri == cls._namespace_SIO('SIO_001121'):
            return True
        if uri == cls._namespace_SIO('SIO_001122'):
            return True
        if uri == cls._namespace_SIO('SIO_001123'):
            return True
        if uri == cls._namespace_SIO('SIO_001124'):
            return True
        if uri == cls._namespace_SIO('SIO_001125'):
            return True
        if uri == cls._namespace_SIO('SIO_001126'):
            return True
        if uri == cls._namespace_SIO('SIO_001127'):
            return True
        if uri == cls._namespace_SIO('SIO_001128'):
            return True
        if uri == cls._namespace_SIO('SIO_001129'):
            return True
        if uri == cls._namespace_SIO('SIO_001130'):
            return True
        if uri == cls._namespace_SIO('SIO_001131'):
            return True
        if uri == cls._namespace_SIO('SIO_001132'):
            return True
        if uri == cls._namespace_SIO('SIO_001133'):
            return True
        if uri == cls._namespace_SIO('SIO_001134'):
            return True
        if uri == cls._namespace_SIO('SIO_001135'):
            return True
        if uri == cls._namespace_SIO('SIO_001136'):
            return True
        if uri == cls._namespace_SIO('SIO_001137'):
            return True
        if uri == cls._namespace_SIO('SIO_001138'):
            return True
        if uri == cls._namespace_SIO('SIO_001139'):
            return True
        if uri == cls._namespace_SIO('SIO_001140'):
            return True
        if uri == cls._namespace_SIO('SIO_001141'):
            return True
        if uri == cls._namespace_SIO('SIO_001142'):
            return True
        if uri == cls._namespace_SIO('SIO_001143'):
            return True
        if uri == cls._namespace_SIO('SIO_001144'):
            return True
        if uri == cls._namespace_SIO('SIO_001145'):
            return True
        if uri == cls._namespace_SIO('SIO_001146'):
            return True
        if uri == cls._namespace_SIO('SIO_001147'):
            return True
        if uri == cls._namespace_SIO('SIO_001148'):
            return True
        if uri == cls._namespace_SIO('SIO_001149'):
            return True
        if uri == cls._namespace_SIO('SIO_001150'):
            return True
        if uri == cls._namespace_SIO('SIO_001151'):
            return True
        if uri == cls._namespace_SIO('SIO_001152'):
            return True
        if uri == cls._namespace_SIO('SIO_001153'):
            return True
        if uri == cls._namespace_SIO('SIO_001160'):
            return True
        if uri == cls._namespace_SIO('SIO_001161'):
            return True
        if uri == cls._namespace_SIO('SIO_001162'):
            return True
        if uri == cls._namespace_SIO('SIO_001163'):
            return True
        if uri == cls._namespace_SIO('SIO_001164'):
            return True
        if uri == cls._namespace_SIO('SIO_001165'):
            return True
        if uri == cls._namespace_SIO('SIO_001166'):
            return True
        if uri == cls._namespace_SIO('SIO_001167'):
            return True
        if uri == cls._namespace_SIO('SIO_001168'):
            return True
        if uri == cls._namespace_SIO('SIO_001169'):
            return True
        if uri == cls._namespace_SIO('SIO_001170'):
            return True
        if uri == cls._namespace_SIO('SIO_001171'):
            return True
        if uri == cls._namespace_SIO('SIO_001172'):
            return True
        if uri == cls._namespace_SIO('SIO_001173'):
            return True
        if uri == cls._namespace_SIO('SIO_001174'):
            return True
        if uri == cls._namespace_SIO('SIO_001175'):
            return True
        if uri == cls._namespace_SIO('SIO_001176'):
            return True
        if uri == cls._namespace_SIO('SIO_001177'):
            return True
        if uri == cls._namespace_SIO('SIO_001178'):
            return True
        if uri == cls._namespace_SIO('SIO_001179'):
            return True
        if uri == cls._namespace_SIO('SIO_001180'):
            return True
        if uri == cls._namespace_SIO('SIO_001181'):
            return True
        if uri == cls._namespace_SIO('SIO_001182'):
            return True
        if uri == cls._namespace_SIO('SIO_001183'):
            return True
        if uri == cls._namespace_SIO('SIO_001184'):
            return True
        if uri == cls._namespace_SIO('SIO_001185'):
            return True
        if uri == cls._namespace_SIO('SIO_010000'):
            return True
        if uri == cls._namespace_SIO('SIO_010001'):
            return True
        if uri == cls._namespace_SIO('SIO_010002'):
            return True
        if uri == cls._namespace_SIO('SIO_010003'):
            return True
        if uri == cls._namespace_SIO('SIO_010004'):
            return True
        if uri == cls._namespace_SIO('SIO_010005'):
            return True
        if uri == cls._namespace_SIO('SIO_010007'):
            return True
        if uri == cls._namespace_SIO('SIO_010008'):
            return True
        if uri == cls._namespace_SIO('SIO_010009'):
            return True
        if uri == cls._namespace_SIO('SIO_010010'):
            return True
        if uri == cls._namespace_SIO('SIO_010011'):
            return True
        if uri == cls._namespace_SIO('SIO_010013'):
            return True
        if uri == cls._namespace_SIO('SIO_010014'):
            return True
        if uri == cls._namespace_SIO('SIO_010015'):
            return True
        if uri == cls._namespace_SIO('SIO_010016'):
            return True
        if uri == cls._namespace_SIO('SIO_010017'):
            return True
        if uri == cls._namespace_SIO('SIO_010018'):
            return True
        if uri == cls._namespace_SIO('SIO_010019'):
            return True
        if uri == cls._namespace_SIO('SIO_010020'):
            return True
        if uri == cls._namespace_SIO('SIO_010022'):
            return True
        if uri == cls._namespace_SIO('SIO_010023'):
            return True
        if uri == cls._namespace_SIO('SIO_010024'):
            return True
        if uri == cls._namespace_SIO('SIO_010025'):
            return True
        if uri == cls._namespace_SIO('SIO_010026'):
            return True
        if uri == cls._namespace_SIO('SIO_010027'):
            return True
        if uri == cls._namespace_SIO('SIO_010028'):
            return True
        if uri == cls._namespace_SIO('SIO_010029'):
            return True
        if uri == cls._namespace_SIO('SIO_010030'):
            return True
        if uri == cls._namespace_SIO('SIO_010031'):
            return True
        if uri == cls._namespace_SIO('SIO_010032'):
            return True
        if uri == cls._namespace_SIO('SIO_010033'):
            return True
        if uri == cls._namespace_SIO('SIO_010034'):
            return True
        if uri == cls._namespace_SIO('SIO_010035'):
            return True
        if uri == cls._namespace_SIO('SIO_010036'):
            return True
        if uri == cls._namespace_SIO('SIO_010037'):
            return True
        if uri == cls._namespace_SIO('SIO_010038'):
            return True
        if uri == cls._namespace_SIO('SIO_010039'):
            return True
        if uri == cls._namespace_SIO('SIO_010040'):
            return True
        if uri == cls._namespace_SIO('SIO_010041'):
            return True
        if uri == cls._namespace_SIO('SIO_010042'):
            return True
        if uri == cls._namespace_SIO('SIO_010043'):
            return True
        if uri == cls._namespace_SIO('SIO_010044'):
            return True
        if uri == cls._namespace_SIO('SIO_010045'):
            return True
        if uri == cls._namespace_SIO('SIO_010046'):
            return True
        if uri == cls._namespace_SIO('SIO_010047'):
            return True
        if uri == cls._namespace_SIO('SIO_010048'):
            return True
        if uri == cls._namespace_SIO('SIO_010049'):
            return True
        if uri == cls._namespace_SIO('SIO_010050'):
            return True
        if uri == cls._namespace_SIO('SIO_010051'):
            return True
        if uri == cls._namespace_SIO('SIO_010052'):
            return True
        if uri == cls._namespace_SIO('SIO_010053'):
            return True
        if uri == cls._namespace_SIO('SIO_010054'):
            return True
        if uri == cls._namespace_SIO('SIO_010055'):
            return True
        if uri == cls._namespace_SIO('SIO_010056'):
            return True
        if uri == cls._namespace_SIO('SIO_010057'):
            return True
        if uri == cls._namespace_SIO('SIO_010058'):
            return True
        if uri == cls._namespace_SIO('SIO_010059'):
            return True
        if uri == cls._namespace_SIO('SIO_010060'):
            return True
        if uri == cls._namespace_SIO('SIO_010061'):
            return True
        if uri == cls._namespace_SIO('SIO_010064'):
            return True
        if uri == cls._namespace_SIO('SIO_010065'):
            return True
        if uri == cls._namespace_SIO('SIO_010066'):
            return True
        if uri == cls._namespace_SIO('SIO_010067'):
            return True
        if uri == cls._namespace_SIO('SIO_010068'):
            return True
        if uri == cls._namespace_SIO('SIO_010070'):
            return True
        if uri == cls._namespace_SIO('SIO_010071'):
            return True
        if uri == cls._namespace_SIO('SIO_010072'):
            return True
        if uri == cls._namespace_SIO('SIO_010073'):
            return True
        if uri == cls._namespace_SIO('SIO_010074'):
            return True
        if uri == cls._namespace_SIO('SIO_010075'):
            return True
        if uri == cls._namespace_SIO('SIO_010076'):
            return True
        if uri == cls._namespace_SIO('SIO_010077'):
            return True
        if uri == cls._namespace_SIO('SIO_010084'):
            return True
        if uri == cls._namespace_SIO('SIO_010085'):
            return True
        if uri == cls._namespace_SIO('SIO_010086'):
            return True
        if uri == cls._namespace_SIO('SIO_010087'):
            return True
        if uri == cls._namespace_SIO('SIO_010088'):
            return True
        if uri == cls._namespace_SIO('SIO_010089'):
            return True
        if uri == cls._namespace_SIO('SIO_010090'):
            return True
        if uri == cls._namespace_SIO('SIO_010091'):
            return True
        if uri == cls._namespace_SIO('SIO_010092'):
            return True
        if uri == cls._namespace_SIO('SIO_010093'):
            return True
        if uri == cls._namespace_SIO('SIO_010094'):
            return True
        if uri == cls._namespace_SIO('SIO_010095'):
            return True
        if uri == cls._namespace_SIO('SIO_010096'):
            return True
        if uri == cls._namespace_SIO('SIO_010097'):
            return True
        if uri == cls._namespace_SIO('SIO_010098'):
            return True
        if uri == cls._namespace_SIO('SIO_010099'):
            return True
        if uri == cls._namespace_SIO('SIO_010100'):
            return True
        if uri == cls._namespace_SIO('SIO_010101'):
            return True
        if uri == cls._namespace_SIO('SIO_010277'):
            return True
        if uri == cls._namespace_SIO('SIO_010278'):
            return True
        if uri == cls._namespace_SIO('SIO_010283'):
            return True
        if uri == cls._namespace_SIO('SIO_010284'):
            return True
        if uri == cls._namespace_SIO('SIO_010285'):
            return True
        if uri == cls._namespace_SIO('SIO_010286'):
            return True
        if uri == cls._namespace_SIO('SIO_010287'):
            return True
        if uri == cls._namespace_SIO('SIO_010288'):
            return True
        if uri == cls._namespace_SIO('SIO_010289'):
            return True
        if uri == cls._namespace_SIO('SIO_010295'):
            return True
        if uri == cls._namespace_SIO('SIO_010296'):
            return True
        if uri == cls._namespace_SIO('SIO_010298'):
            return True
        if uri == cls._namespace_SIO('SIO_010299'):
            return True
        if uri == cls._namespace_SIO('SIO_010300'):
            return True
        if uri == cls._namespace_SIO('SIO_010301'):
            return True
        if uri == cls._namespace_SIO('SIO_010307'):
            return True
        if uri == cls._namespace_SIO('SIO_010308'):
            return True
        if uri == cls._namespace_SIO('SIO_010309'):
            return True
        if uri == cls._namespace_SIO('SIO_010310'):
            return True
        if uri == cls._namespace_SIO('SIO_010334'):
            return True
        if uri == cls._namespace_SIO('SIO_010335'):
            return True
        if uri == cls._namespace_SIO('SIO_010336'):
            return True
        if uri == cls._namespace_SIO('SIO_010337'):
            return True
        if uri == cls._namespace_SIO('SIO_010338'):
            return True
        if uri == cls._namespace_SIO('SIO_010340'):
            return True
        if uri == cls._namespace_SIO('SIO_010341'):
            return True
        if uri == cls._namespace_SIO('SIO_010342'):
            return True
        if uri == cls._namespace_SIO('SIO_010343'):
            return True
        if uri == cls._namespace_SIO('SIO_010344'):
            return True
        if uri == cls._namespace_SIO('SIO_010345'):
            return True
        if uri == cls._namespace_SIO('SIO_010346'):
            return True
        if uri == cls._namespace_SIO('SIO_010347'):
            return True
        if uri == cls._namespace_SIO('SIO_010349'):
            return True
        if uri == cls._namespace_SIO('SIO_010351'):
            return True
        if uri == cls._namespace_SIO('SIO_010353'):
            return True
        if uri == cls._namespace_SIO('SIO_010354'):
            return True
        if uri == cls._namespace_SIO('SIO_010355'):
            return True
        if uri == cls._namespace_SIO('SIO_010358'):
            return True
        if uri == cls._namespace_SIO('SIO_010359'):
            return True
        if uri == cls._namespace_SIO('SIO_010360'):
            return True
        if uri == cls._namespace_SIO('SIO_010362'):
            return True
        if uri == cls._namespace_SIO('SIO_010363'):
            return True
        if uri == cls._namespace_SIO('SIO_010364'):
            return True
        if uri == cls._namespace_SIO('SIO_010365'):
            return True
        if uri == cls._namespace_SIO('SIO_010366'):
            return True
        if uri == cls._namespace_SIO('SIO_010367'):
            return True
        if uri == cls._namespace_SIO('SIO_010368'):
            return True
        if uri == cls._namespace_SIO('SIO_010369'):
            return True
        if uri == cls._namespace_SIO('SIO_010370'):
            return True
        if uri == cls._namespace_SIO('SIO_010371'):
            return True
        if uri == cls._namespace_SIO('SIO_010372'):
            return True
        if uri == cls._namespace_SIO('SIO_010373'):
            return True
        if uri == cls._namespace_SIO('SIO_010374'):
            return True
        if uri == cls._namespace_SIO('SIO_010375'):
            return True
        if uri == cls._namespace_SIO('SIO_010376'):
            return True
        if uri == cls._namespace_SIO('SIO_010377'):
            return True
        if uri == cls._namespace_SIO('SIO_010378'):
            return True
        if uri == cls._namespace_SIO('SIO_010379'):
            return True
        if uri == cls._namespace_SIO('SIO_010383'):
            return True
        if uri == cls._namespace_SIO('SIO_010410'):
            return True
        if uri == cls._namespace_SIO('SIO_010411'):
            return True
        if uri == cls._namespace_SIO('SIO_010412'):
            return True
        if uri == cls._namespace_SIO('SIO_010414'):
            return True
        if uri == cls._namespace_SIO('SIO_010415'):
            return True
        if uri == cls._namespace_SIO('SIO_010416'):
            return True
        if uri == cls._namespace_SIO('SIO_010417'):
            return True
        if uri == cls._namespace_SIO('SIO_010418'):
            return True
        if uri == cls._namespace_SIO('SIO_010419'):
            return True
        if uri == cls._namespace_SIO('SIO_010420'):
            return True
        if uri == cls._namespace_SIO('SIO_010423'):
            return True
        if uri == cls._namespace_SIO('SIO_010424'):
            return True
        if uri == cls._namespace_SIO('SIO_010425'):
            return True
        if uri == cls._namespace_SIO('SIO_010426'):
            return True
        if uri == cls._namespace_SIO('SIO_010427'):
            return True
        if uri == cls._namespace_SIO('SIO_010428'):
            return True
        if uri == cls._namespace_SIO('SIO_010429'):
            return True
        if uri == cls._namespace_SIO('SIO_010430'):
            return True
        if uri == cls._namespace_SIO('SIO_010431'):
            return True
        if uri == cls._namespace_SIO('SIO_010432'):
            return True
        if uri == cls._namespace_SIO('SIO_010433'):
            return True
        if uri == cls._namespace_SIO('SIO_010434'):
            return True
        if uri == cls._namespace_SIO('SIO_010435'):
            return True
        if uri == cls._namespace_SIO('SIO_010436'):
            return True
        if uri == cls._namespace_SIO('SIO_010437'):
            return True
        if uri == cls._namespace_SIO('SIO_010438'):
            return True
        if uri == cls._namespace_SIO('SIO_010439'):
            return True
        if uri == cls._namespace_SIO('SIO_010440'):
            return True
        if uri == cls._namespace_SIO('SIO_010441'):
            return True
        if uri == cls._namespace_SIO('SIO_010442'):
            return True
        if uri == cls._namespace_SIO('SIO_010443'):
            return True
        if uri == cls._namespace_SIO('SIO_010444'):
            return True
        if uri == cls._namespace_SIO('SIO_010445'):
            return True
        if uri == cls._namespace_SIO('SIO_010446'):
            return True
        if uri == cls._namespace_SIO('SIO_010447'):
            return True
        if uri == cls._namespace_SIO('SIO_010448'):
            return True
        if uri == cls._namespace_SIO('SIO_010450'):
            return True
        if uri == cls._namespace_SIO('SIO_010451'):
            return True
        if uri == cls._namespace_SIO('SIO_010452'):
            return True
        if uri == cls._namespace_SIO('SIO_010453'):
            return True
        if uri == cls._namespace_SIO('SIO_010454'):
            return True
        if uri == cls._namespace_SIO('SIO_010455'):
            return True
        if uri == cls._namespace_SIO('SIO_010456'):
            return True
        if uri == cls._namespace_SIO('SIO_010457'):
            return True
        if uri == cls._namespace_SIO('SIO_010458'):
            return True
        if uri == cls._namespace_SIO('SIO_010459'):
            return True
        if uri == cls._namespace_SIO('SIO_010460'):
            return True
        if uri == cls._namespace_SIO('SIO_010461'):
            return True
        if uri == cls._namespace_SIO('SIO_010462'):
            return True
        if uri == cls._namespace_SIO('SIO_010463'):
            return True
        if uri == cls._namespace_SIO('SIO_010464'):
            return True
        if uri == cls._namespace_SIO('SIO_010465'):
            return True
        if uri == cls._namespace_SIO('SIO_010468'):
            return True
        if uri == cls._namespace_SIO('SIO_010469'):
            return True
        if uri == cls._namespace_SIO('SIO_010471'):
            return True
        if uri == cls._namespace_SIO('SIO_010496'):
            return True
        if uri == cls._namespace_SIO('SIO_010497'):
            return True
        if uri == cls._namespace_SIO('SIO_010498'):
            return True
        if uri == cls._namespace_SIO('SIO_010499'):
            return True
        if uri == cls._namespace_SIO('SIO_010500'):
            return True
        if uri == cls._namespace_SIO('SIO_010501'):
            return True
        if uri == cls._namespace_SIO('SIO_010502'):
            return True
        if uri == cls._namespace_SIO('SIO_010503'):
            return True
        if uri == cls._namespace_SIO('SIO_010504'):
            return True
        if uri == cls._namespace_SIO('SIO_010505'):
            return True
        if uri == cls._namespace_SIO('SIO_010506'):
            return True
        if uri == cls._namespace_SIO('SIO_010507'):
            return True
        if uri == cls._namespace_SIO('SIO_010508'):
            return True
        if uri == cls._namespace_SIO('SIO_010509'):
            return True
        if uri == cls._namespace_SIO('SIO_010510'):
            return True
        if uri == cls._namespace_SIO('SIO_010511'):
            return True
        if uri == cls._namespace_SIO('SIO_010512'):
            return True
        if uri == cls._namespace_SIO('SIO_010513'):
            return True
        if uri == cls._namespace_SIO('SIO_010514'):
            return True
        if uri == cls._namespace_SIO('SIO_010515'):
            return True
        if uri == cls._namespace_SIO('SIO_010516'):
            return True
        if uri == cls._namespace_SIO('SIO_010517'):
            return True
        if uri == cls._namespace_SIO('SIO_010518'):
            return True
        if uri == cls._namespace_SIO('SIO_010519'):
            return True
        if uri == cls._namespace_SIO('SIO_010520'):
            return True
        if uri == cls._namespace_SIO('SIO_010521'):
            return True
        if uri == cls._namespace_SIO('SIO_010522'):
            return True
        if uri == cls._namespace_SIO('SIO_010523'):
            return True
        if uri == cls._namespace_SIO('SIO_010525'):
            return True
        if uri == cls._namespace_SIO('SIO_010526'):
            return True
        if uri == cls._namespace_SIO('SIO_010527'):
            return True
        if uri == cls._namespace_SIO('SIO_010528'):
            return True
        if uri == cls._namespace_SIO('SIO_010530'):
            return True
        if uri == cls._namespace_SIO('SIO_010531'):
            return True
        if uri == cls._namespace_SIO('SIO_010532'):
            return True
        if uri == cls._namespace_SIO('SIO_010533'):
            return True
        if uri == cls._namespace_SIO('SIO_010673'):
            return True
        if uri == cls._namespace_SIO('SIO_010674'):
            return True
        if uri == cls._namespace_SIO('SIO_010775'):
            return True
        if uri == cls._namespace_SIO('SIO_010776'):
            return True
        if uri == cls._namespace_SIO('SIO_010777'):
            return True
        if uri == cls._namespace_SIO('SIO_010778'):
            return True
        if uri == cls._namespace_SIO('SIO_010779'):
            return True
        if uri == cls._namespace_SIO('SIO_010780'):
            return True
        if uri == cls._namespace_SIO('SIO_010781'):
            return True
        if uri == cls._namespace_SIO('SIO_010782'):
            return True
        if uri == cls._namespace_SIO('SIO_010783'):
            return True
        if uri == cls._namespace_SIO('SIO_010784'):
            return True
        if uri == cls._namespace_SIO('SIO_010785'):
            return True
        if uri == cls._namespace_SIO('SIO_010786'):
            return True
        if uri == cls._namespace_SIO('SIO_010787'):
            return True
        if uri == cls._namespace_SIO('SIO_010788'):
            return True
        if uri == cls._namespace_SIO('SIO_010789'):
            return True
        if uri == cls._namespace_SIO('SIO_010790'):
            return True
        if uri == cls._namespace_SIO('SIO_010791'):
            return True
        if uri == cls._namespace_SIO('SIO_010792'):
            return True
        if uri == cls._namespace_SIO('SIO_010793'):
            return True
        if uri == cls._namespace_SIO('SIO_010794'):
            return True
        if uri == cls._namespace_SIO('SIO_010795'):
            return True
        if uri == cls._namespace_SIO('SIO_011000'):
            return True
        if uri == cls._namespace_SIO('SIO_011001'):
            return True
        if uri == cls._namespace_SIO('SIO_011002'):
            return True
        if uri == cls._namespace_SIO('SIO_011003'):
            return True
        if uri == cls._namespace_SIO('SIO_011004'):
            return True
        if uri == cls._namespace_SIO('SIO_011005'):
            return True
        if uri == cls._namespace_SIO('SIO_011006'):
            return True
        if uri == cls._namespace_SIO('SIO_011007'):
            return True
        if uri == cls._namespace_SIO('SIO_011008'):
            return True
        if uri == cls._namespace_SIO('SIO_011009'):
            return True
        if uri == cls._namespace_SIO('SIO_011010'):
            return True
        if uri == cls._namespace_SIO('SIO_011011'):
            return True
        if uri == cls._namespace_SIO('SIO_011012'):
            return True
        if uri == cls._namespace_SIO('SIO_011013'):
            return True
        if uri == cls._namespace_SIO('SIO_011014'):
            return True
        if uri == cls._namespace_SIO('SIO_011015'):
            return True
        if uri == cls._namespace_SIO('SIO_011016'):
            return True
        if uri == cls._namespace_SIO('SIO_011017'):
            return True
        if uri == cls._namespace_SIO('SIO_011018'):
            return True
        if uri == cls._namespace_SIO('SIO_011019'):
            return True
        if uri == cls._namespace_SIO('SIO_011020'):
            return True
        if uri == cls._namespace_SIO('SIO_011021'):
            return True
        if uri == cls._namespace_SIO('SIO_011022'):
            return True
        if uri == cls._namespace_SIO('SIO_011023'):
            return True
        if uri == cls._namespace_SIO('SIO_011024'):
            return True
        if uri == cls._namespace_SIO('SIO_011025'):
            return True
        if uri == cls._namespace_SIO('SIO_011026'):
            return True
        if uri == cls._namespace_SIO('SIO_011027'):
            return True
        if uri == cls._namespace_SIO('SIO_011028'):
            return True
        if uri == cls._namespace_SIO('SIO_011029'):
            return True
        if uri == cls._namespace_SIO('SIO_011030'):
            return True
        if uri == cls._namespace_SIO('SIO_011031'):
            return True
        if uri == cls._namespace_SIO('SIO_011032'):
            return True
        if uri == cls._namespace_SIO('SIO_011033'):
            return True
        if uri == cls._namespace_SIO('SIO_011034'):
            return True
        if uri == cls._namespace_SIO('SIO_011035'):
            return True
        if uri == cls._namespace_SIO('SIO_011036'):
            return True
        if uri == cls._namespace_SIO('SIO_011037'):
            return True
        if uri == cls._namespace_SIO('SIO_011038'):
            return True
        if uri == cls._namespace_SIO('SIO_011039'):
            return True
        if uri == cls._namespace_SIO('SIO_011040'):
            return True
        if uri == cls._namespace_SIO('SIO_011041'):
            return True
        if uri == cls._namespace_SIO('SIO_011042'):
            return True
        if uri == cls._namespace_SIO('SIO_011043'):
            return True
        if uri == cls._namespace_SIO('SIO_011044'):
            return True
        if uri == cls._namespace_SIO('SIO_011045'):
            return True
        if uri == cls._namespace_SIO('SIO_011046'):
            return True
        if uri == cls._namespace_SIO('SIO_011047'):
            return True
        if uri == cls._namespace_SIO('SIO_011048'):
            return True
        if uri == cls._namespace_SIO('SIO_011049'):
            return True
        if uri == cls._namespace_SIO('SIO_011050'):
            return True
        if uri == cls._namespace_SIO('SIO_011051'):
            return True
        if uri == cls._namespace_SIO('SIO_011052'):
            return True
        if uri == cls._namespace_SIO('SIO_011053'):
            return True
        if uri == cls._namespace_SIO('SIO_011054'):
            return True
        if uri == cls._namespace_SIO('SIO_011055'):
            return True
        if uri == cls._namespace_SIO('SIO_011056'):
            return True
        if uri == cls._namespace_SIO('SIO_011057'):
            return True
        if uri == cls._namespace_SIO('SIO_011058'):
            return True
        if uri == cls._namespace_SIO('SIO_011059'):
            return True
        if uri == cls._namespace_SIO('SIO_011060'):
            return True
        if uri == cls._namespace_SIO('SIO_011061'):
            return True
        if uri == cls._namespace_SIO('SIO_011062'):
            return True
        if uri == cls._namespace_SIO('SIO_011063'):
            return True
        if uri == cls._namespace_SIO('SIO_011064'):
            return True
        if uri == cls._namespace_SIO('SIO_011065'):
            return True
        if uri == cls._namespace_SIO('SIO_011066'):
            return True
        if uri == cls._namespace_SIO('SIO_011067'):
            return True
        if uri == cls._namespace_SIO('SIO_011068'):
            return True
        if uri == cls._namespace_SIO('SIO_011069'):
            return True
        if uri == cls._namespace_SIO('SIO_011070'):
            return True
        if uri == cls._namespace_SIO('SIO_011071'):
            return True
        if uri == cls._namespace_SIO('SIO_011072'):
            return True
        if uri == cls._namespace_SIO('SIO_011073'):
            return True
        if uri == cls._namespace_SIO('SIO_011074'):
            return True
        if uri == cls._namespace_SIO('SIO_011075'):
            return True
        if uri == cls._namespace_SIO('SIO_011076'):
            return True
        if uri == cls._namespace_SIO('SIO_011077'):
            return True
        if uri == cls._namespace_SIO('SIO_011078'):
            return True
        if uri == cls._namespace_SIO('SIO_011079'):
            return True
        if uri == cls._namespace_SIO('SIO_011080'):
            return True
        if uri == cls._namespace_SIO('SIO_011081'):
            return True
        if uri == cls._namespace_SIO('SIO_011082'):
            return True
        if uri == cls._namespace_SIO('SIO_011083'):
            return True
        if uri == cls._namespace_SIO('SIO_011084'):
            return True
        if uri == cls._namespace_SIO('SIO_011085'):
            return True
        if uri == cls._namespace_SIO('SIO_011086'):
            return True
        if uri == cls._namespace_SIO('SIO_011087'):
            return True
        if uri == cls._namespace_SIO('SIO_011088'):
            return True
        if uri == cls._namespace_SIO('SIO_011089'):
            return True
        if uri == cls._namespace_SIO('SIO_011090'):
            return True
        if uri == cls._namespace_SIO('SIO_011091'):
            return True
        if uri == cls._namespace_SIO('SIO_011092'):
            return True
        if uri == cls._namespace_SIO('SIO_011093'):
            return True
        if uri == cls._namespace_SIO('SIO_011094'):
            return True
        if uri == cls._namespace_SIO('SIO_011095'):
            return True
        if uri == cls._namespace_SIO('SIO_011096'):
            return True
        if uri == cls._namespace_SIO('SIO_011097'):
            return True
        if uri == cls._namespace_SIO('SIO_011098'):
            return True
        if uri == cls._namespace_SIO('SIO_011099'):
            return True
        if uri == cls._namespace_SIO('SIO_011100'):
            return True
        if uri == cls._namespace_SIO('SIO_011101'):
            return True
        if uri == cls._namespace_SIO('SIO_011102'):
            return True
        if uri == cls._namespace_SIO('SIO_011103'):
            return True
        if uri == cls._namespace_SIO('SIO_011104'):
            return True
        if uri == cls._namespace_SIO('SIO_011105'):
            return True
        if uri == cls._namespace_SIO('SIO_011106'):
            return True
        if uri == cls._namespace_SIO('SIO_011107'):
            return True
        if uri == cls._namespace_SIO('SIO_011108'):
            return True
        if uri == cls._namespace_SIO('SIO_011109'):
            return True
        if uri == cls._namespace_SIO('SIO_011110'):
            return True
        if uri == cls._namespace_SIO('SIO_011111'):
            return True
        if uri == cls._namespace_SIO('SIO_011112'):
            return True
        if uri == cls._namespace_SIO('SIO_011113'):
            return True
        if uri == cls._namespace_SIO('SIO_011114'):
            return True
        if uri == cls._namespace_SIO('SIO_011115'):
            return True
        if uri == cls._namespace_SIO('SIO_011116'):
            return True
        if uri == cls._namespace_SIO('SIO_011117'):
            return True
        if uri == cls._namespace_SIO('SIO_011118'):
            return True
        if uri == cls._namespace_SIO('SIO_011119'):
            return True
        if uri == cls._namespace_SIO('SIO_011120'):
            return True
        if uri == cls._namespace_SIO('SIO_011121'):
            return True
        if uri == cls._namespace_SIO('SIO_011123'):
            return True
        if uri == cls._namespace_SIO('SIO_011125'):
            return True
        if uri == cls._namespace_SIO('SIO_011126'):
            return True
        if uri == cls._namespace_SIO('SIO_011130'):
            return True
        if uri == cls._namespace_SIO('SIO_011131'):
            return True
        return False

    @classmethod
    def is_named_individual(cls, uri):
        """Determines whether the given URI is a named individual.
        
        uri -- URI that is tested for being a named individual
        """
        return False

    @classmethod
    def with_parent(cls, uris, parent):
        """Returns only those URIs that fall under a designated parent URI.
        
        uris -- Set of URIs that are tested whether they have the given parent URI.
        parent -- Parent URI.
        """
        return filter(lambda uri: cls.has_parent(uri, parent), uris)

    @classmethod
    def has_parent(cls, uri, parent):
        """Recursively tries to determine the parent for a given URI.
        
        uri -- URI that is tested for whether it has the given parent URI.
        parent -- Parent URI.
        """
        if cls.__parent_properties.has_key(uri):
            if cls.__parent_properties[uri] == parent:
                return True
            return cls.has_parent(cls.__parent_properties[uri], parent)
        return False

    @classmethod
    def _namespace_SIO(cls, accession):
        return Namespace('http://semanticscience.org/resource/')[accession]

    __parent_properties = { Namespace('http://semanticscience.org/resource/SIO_000008') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000011') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000020') : Namespace('http://semanticscience.org/resource/SIO_000210') , Namespace('http://semanticscience.org/resource/SIO_000028') : Namespace('http://semanticscience.org/resource/SIO_000145') , Namespace('http://semanticscience.org/resource/SIO_000029') : Namespace('http://semanticscience.org/resource/SIO_000096') , Namespace('http://semanticscience.org/resource/SIO_000053') : Namespace('http://semanticscience.org/resource/SIO_000028') , Namespace('http://semanticscience.org/resource/SIO_000054') : Namespace('http://semanticscience.org/resource/SIO_000053') , Namespace('http://semanticscience.org/resource/SIO_000059') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000060') : Namespace('http://semanticscience.org/resource/SIO_000205') , Namespace('http://semanticscience.org/resource/SIO_000061') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000062') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000063') : Namespace('http://semanticscience.org/resource/SIO_000062') , Namespace('http://semanticscience.org/resource/SIO_000064') : Namespace('http://semanticscience.org/resource/SIO_000219') , Namespace('http://semanticscience.org/resource/SIO_000066') : Namespace('http://semanticscience.org/resource/SIO_000253') , Namespace('http://semanticscience.org/resource/SIO_000068') : Namespace('http://semanticscience.org/resource/SIO_000061') , Namespace('http://semanticscience.org/resource/SIO_000093') : Namespace('http://semanticscience.org/resource/SIO_000068') , Namespace('http://semanticscience.org/resource/SIO_000095') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000096') : Namespace('http://semanticscience.org/resource/SIO_000093') , Namespace('http://semanticscience.org/resource/SIO_000128') : Namespace('http://semanticscience.org/resource/SIO_000061') , Namespace('http://semanticscience.org/resource/SIO_000132') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000139') : Namespace('http://semanticscience.org/resource/SIO_000132') , Namespace('http://semanticscience.org/resource/SIO_000145') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000202') : Namespace('http://semanticscience.org/resource/SIO_000145') , Namespace('http://semanticscience.org/resource/SIO_000203') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000204') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000205') : Namespace('http://semanticscience.org/resource/SIO_000212') , Namespace('http://semanticscience.org/resource/SIO_000206') : Namespace('http://semanticscience.org/resource/SIO_000772') , Namespace('http://semanticscience.org/resource/SIO_000207') : Namespace('http://semanticscience.org/resource/SIO_000772') , Namespace('http://semanticscience.org/resource/SIO_000208') : Namespace('http://semanticscience.org/resource/SIO_000773') , Namespace('http://semanticscience.org/resource/SIO_000209') : Namespace('http://semanticscience.org/resource/SIO_000773') , Namespace('http://semanticscience.org/resource/SIO_000210') : Namespace('http://semanticscience.org/resource/SIO_000628') , Namespace('http://semanticscience.org/resource/SIO_000211') : Namespace('http://semanticscience.org/resource/SIO_000203') , Namespace('http://semanticscience.org/resource/SIO_000212') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000213') : Namespace('http://semanticscience.org/resource/SIO_000425') , Namespace('http://semanticscience.org/resource/SIO_000214') : Namespace('http://semanticscience.org/resource/SIO_000425') , Namespace('http://semanticscience.org/resource/SIO_000215') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000216') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000217') : Namespace('http://semanticscience.org/resource/SIO_000223') , Namespace('http://semanticscience.org/resource/SIO_000218') : Namespace('http://semanticscience.org/resource/SIO_000224') , Namespace('http://semanticscience.org/resource/SIO_000219') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000221') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000222') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000223') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000224') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000225') : Namespace('http://semanticscience.org/resource/SIO_000235') , Namespace('http://semanticscience.org/resource/SIO_000226') : Namespace('http://semanticscience.org/resource/SIO_000236') , Namespace('http://semanticscience.org/resource/SIO_000227') : Namespace('http://semanticscience.org/resource/SIO_000643') , Namespace('http://semanticscience.org/resource/SIO_000228') : Namespace('http://semanticscience.org/resource/SIO_000644') , Namespace('http://semanticscience.org/resource/SIO_000229') : Namespace('http://semanticscience.org/resource/SIO_000132') , Namespace('http://semanticscience.org/resource/SIO_000230') : Namespace('http://semanticscience.org/resource/SIO_000132') , Namespace('http://semanticscience.org/resource/SIO_000231') : Namespace('http://semanticscience.org/resource/SIO_000062') , Namespace('http://semanticscience.org/resource/SIO_000232') : Namespace('http://semanticscience.org/resource/SIO_000062') , Namespace('http://semanticscience.org/resource/SIO_000233') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000234') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000235') : Namespace('http://semanticscience.org/resource/SIO_000586') , Namespace('http://semanticscience.org/resource/SIO_000236') : Namespace('http://semanticscience.org/resource/SIO_000646') , Namespace('http://semanticscience.org/resource/SIO_000240') : Namespace('http://semanticscience.org/resource/SIO_000203') , Namespace('http://semanticscience.org/resource/SIO_000241') : Namespace('http://semanticscience.org/resource/SIO_000652') , Namespace('http://semanticscience.org/resource/SIO_000242') : Namespace('http://semanticscience.org/resource/SIO_000652') , Namespace('http://semanticscience.org/resource/SIO_000243') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000244') : Namespace('http://semanticscience.org/resource/SIO_000352') , Namespace('http://semanticscience.org/resource/SIO_000245') : Namespace('http://semanticscience.org/resource/SIO_000294') , Namespace('http://semanticscience.org/resource/SIO_000246') : Namespace('http://semanticscience.org/resource/SIO_000245') , Namespace('http://semanticscience.org/resource/SIO_000247') : Namespace('http://semanticscience.org/resource/SIO_000244') , Namespace('http://semanticscience.org/resource/SIO_000248') : Namespace('http://semanticscience.org/resource/SIO_000352') , Namespace('http://semanticscience.org/resource/SIO_000249') : Namespace('http://semanticscience.org/resource/SIO_000294') , Namespace('http://semanticscience.org/resource/SIO_000250') : Namespace('http://semanticscience.org/resource/SIO_000248') , Namespace('http://semanticscience.org/resource/SIO_000251') : Namespace('http://semanticscience.org/resource/SIO_000249') , Namespace('http://semanticscience.org/resource/SIO_000252') : Namespace('http://semanticscience.org/resource/SIO_000212') , Namespace('http://semanticscience.org/resource/SIO_000253') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000254') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000255') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000272') : Namespace('http://semanticscience.org/resource/SIO_000736') , Namespace('http://semanticscience.org/resource/SIO_000273') : Namespace('http://semanticscience.org/resource/SIO_000053') , Namespace('http://semanticscience.org/resource/SIO_000274') : Namespace('http://semanticscience.org/resource/SIO_000497') , Namespace('http://semanticscience.org/resource/SIO_000277') : Namespace('http://semanticscience.org/resource/SIO_000631') , Namespace('http://semanticscience.org/resource/SIO_000278') : Namespace('http://semanticscience.org/resource/SIO_000252') , Namespace('http://semanticscience.org/resource/SIO_000283') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_000286') : Namespace('http://semanticscience.org/resource/SIO_000497') , Namespace('http://semanticscience.org/resource/SIO_000288') : Namespace('http://semanticscience.org/resource/SIO_000203') , Namespace('http://semanticscience.org/resource/SIO_000291') : Namespace('http://semanticscience.org/resource/SIO_000230') , Namespace('http://semanticscience.org/resource/SIO_000292') : Namespace('http://semanticscience.org/resource/SIO_000231') , Namespace('http://semanticscience.org/resource/SIO_000293') : Namespace('http://semanticscience.org/resource/SIO_000203') , Namespace('http://semanticscience.org/resource/SIO_000294') : Namespace('http://semanticscience.org/resource/SIO_000243') , Namespace('http://semanticscience.org/resource/SIO_000310') : Namespace('http://semanticscience.org/resource/SIO_000093') , Namespace('http://semanticscience.org/resource/SIO_000311') : Namespace('http://semanticscience.org/resource/SIO_000232') , Namespace('http://semanticscience.org/resource/SIO_000312') : Namespace('http://semanticscience.org/resource/SIO_000229') , Namespace('http://semanticscience.org/resource/SIO_000313') : Namespace('http://semanticscience.org/resource/SIO_000310') , Namespace('http://semanticscience.org/resource/SIO_000322') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000323') : Namespace('http://semanticscience.org/resource/SIO_000128') , Namespace('http://semanticscience.org/resource/SIO_000324') : Namespace('http://semanticscience.org/resource/SIO_000202') , Namespace('http://semanticscience.org/resource/SIO_000325') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000332') : Namespace('http://semanticscience.org/resource/SIO_000563') , Namespace('http://semanticscience.org/resource/SIO_000334') : Namespace('http://semanticscience.org/resource/SIO_000652') , Namespace('http://semanticscience.org/resource/SIO_000335') : Namespace('http://semanticscience.org/resource/SIO_000652') , Namespace('http://semanticscience.org/resource/SIO_000338') : Namespace('http://semanticscience.org/resource/SIO_000563') , Namespace('http://semanticscience.org/resource/SIO_000339') : Namespace('http://semanticscience.org/resource/SIO_000557') , Namespace('http://semanticscience.org/resource/SIO_000341') : Namespace('http://semanticscience.org/resource/SIO_000425') , Namespace('http://semanticscience.org/resource/SIO_000352') : Namespace('http://semanticscience.org/resource/SIO_000243') , Namespace('http://semanticscience.org/resource/SIO_000355') : Namespace('http://semanticscience.org/resource/SIO_000132') , Namespace('http://semanticscience.org/resource/SIO_000356') : Namespace('http://semanticscience.org/resource/SIO_000062') , Namespace('http://semanticscience.org/resource/SIO_000362') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000363') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000364') : Namespace('http://semanticscience.org/resource/SIO_000253') , Namespace('http://semanticscience.org/resource/SIO_000365') : Namespace('http://semanticscience.org/resource/SIO_000219') , Namespace('http://semanticscience.org/resource/SIO_000369') : Namespace('http://semanticscience.org/resource/SIO_000273') , Namespace('http://semanticscience.org/resource/SIO_000420') : Namespace('http://semanticscience.org/resource/SIO_000425') , Namespace('http://semanticscience.org/resource/SIO_000421') : Namespace('http://semanticscience.org/resource/SIO_000425') , Namespace('http://semanticscience.org/resource/SIO_000422') : Namespace('http://semanticscience.org/resource/SIO_000283') , Namespace('http://semanticscience.org/resource/SIO_000424') : Namespace('http://semanticscience.org/resource/SIO_000283') , Namespace('http://semanticscience.org/resource/SIO_000425') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000426') : Namespace('http://semanticscience.org/resource/SIO_000425') , Namespace('http://semanticscience.org/resource/SIO_000427') : Namespace('http://semanticscience.org/resource/SIO_000424') , Namespace('http://semanticscience.org/resource/SIO_000477') : Namespace('http://semanticscience.org/resource/SIO_000422') , Namespace('http://semanticscience.org/resource/SIO_000482') : Namespace('http://semanticscience.org/resource/SIO_000283') , Namespace('http://semanticscience.org/resource/SIO_000484') : Namespace('http://semanticscience.org/resource/SIO_000482') , Namespace('http://semanticscience.org/resource/SIO_000490') : Namespace('http://semanticscience.org/resource/SIO_000482') , Namespace('http://semanticscience.org/resource/SIO_000491') : Namespace('http://semanticscience.org/resource/SIO_000482') , Namespace('http://semanticscience.org/resource/SIO_000495') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_000496') : Namespace('http://semanticscience.org/resource/SIO_000495') , Namespace('http://semanticscience.org/resource/SIO_000497') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_000552') : Namespace('http://semanticscience.org/resource/SIO_000230') , Namespace('http://semanticscience.org/resource/SIO_000553') : Namespace('http://semanticscience.org/resource/SIO_000231') , Namespace('http://semanticscience.org/resource/SIO_000557') : Namespace('http://semanticscience.org/resource/SIO_000212') , Namespace('http://semanticscience.org/resource/SIO_000558') : Namespace('http://semanticscience.org/resource/SIO_010302') , Namespace('http://semanticscience.org/resource/SIO_000563') : Namespace('http://semanticscience.org/resource/SIO_000628') , Namespace('http://semanticscience.org/resource/SIO_000586') : Namespace('http://semanticscience.org/resource/SIO_000644') , Namespace('http://semanticscience.org/resource/SIO_000628') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000629') : Namespace('http://semanticscience.org/resource/SIO_000557') , Namespace('http://semanticscience.org/resource/SIO_000630') : Namespace('http://semanticscience.org/resource/SIO_010302') , Namespace('http://semanticscience.org/resource/SIO_000631') : Namespace('http://semanticscience.org/resource/SIO_000628') , Namespace('http://semanticscience.org/resource/SIO_000632') : Namespace('http://semanticscience.org/resource/SIO_000210') , Namespace('http://semanticscience.org/resource/SIO_000633') : Namespace('http://semanticscience.org/resource/SIO_000205') , Namespace('http://semanticscience.org/resource/SIO_000634') : Namespace('http://semanticscience.org/resource/SIO_000558') , Namespace('http://semanticscience.org/resource/SIO_000635') : Namespace('http://semanticscience.org/resource/SIO_000294') , Namespace('http://semanticscience.org/resource/SIO_000636') : Namespace('http://semanticscience.org/resource/SIO_000352') , Namespace('http://semanticscience.org/resource/SIO_000641') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000642') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000643') : Namespace('http://semanticscience.org/resource/SIO_000224') , Namespace('http://semanticscience.org/resource/SIO_000644') : Namespace('http://semanticscience.org/resource/SIO_000223') , Namespace('http://semanticscience.org/resource/SIO_000646') : Namespace('http://semanticscience.org/resource/SIO_000643') , Namespace('http://semanticscience.org/resource/SIO_000652') : Namespace('http://semanticscience.org/resource/SIO_000203') , Namespace('http://semanticscience.org/resource/SIO_000655') : Namespace('http://semanticscience.org/resource/SIO_000294') , Namespace('http://semanticscience.org/resource/SIO_000656') : Namespace('http://semanticscience.org/resource/SIO_000655') , Namespace('http://semanticscience.org/resource/SIO_000657') : Namespace('http://semanticscience.org/resource/SIO_000352') , Namespace('http://semanticscience.org/resource/SIO_000658') : Namespace('http://semanticscience.org/resource/SIO_000657') , Namespace('http://semanticscience.org/resource/SIO_000668') : Namespace('http://semanticscience.org/resource/SIO_000628') , Namespace('http://semanticscience.org/resource/SIO_000671') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000672') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000673') : Namespace('http://semanticscience.org/resource/SIO_000671') , Namespace('http://semanticscience.org/resource/SIO_000674') : Namespace('http://semanticscience.org/resource/SIO_000672') , Namespace('http://semanticscience.org/resource/SIO_000679') : Namespace('http://semanticscience.org/resource/SIO_000054') , Namespace('http://semanticscience.org/resource/SIO_000680') : Namespace('http://semanticscience.org/resource/SIO_000679') , Namespace('http://semanticscience.org/resource/SIO_000681') : Namespace('http://semanticscience.org/resource/SIO_000679') , Namespace('http://semanticscience.org/resource/SIO_000682') : Namespace('http://semanticscience.org/resource/SIO_000029') , Namespace('http://semanticscience.org/resource/SIO_000684') : Namespace('http://semanticscience.org/resource/SIO_000029') , Namespace('http://semanticscience.org/resource/SIO_000687') : Namespace('http://semanticscience.org/resource/SIO_000322') , Namespace('http://semanticscience.org/resource/SIO_000697') : Namespace('http://semanticscience.org/resource/SIO_000709') , Namespace('http://semanticscience.org/resource/SIO_000699') : Namespace('http://semanticscience.org/resource/SIO_000737') , Namespace('http://semanticscience.org/resource/SIO_000709') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000710') : Namespace('http://semanticscience.org/resource/SIO_000709') , Namespace('http://semanticscience.org/resource/SIO_000733') : Namespace('http://semanticscience.org/resource/SIO_000737') , Namespace('http://semanticscience.org/resource/SIO_000734') : Namespace('http://semanticscience.org/resource/SIO_000737') , Namespace('http://semanticscience.org/resource/SIO_000735') : Namespace('http://semanticscience.org/resource/SIO_000737') , Namespace('http://semanticscience.org/resource/SIO_000736') : Namespace('http://semanticscience.org/resource/SIO_000001') , Namespace('http://semanticscience.org/resource/SIO_000737') : Namespace('http://semanticscience.org/resource/SIO_000736') , Namespace('http://semanticscience.org/resource/SIO_000738') : Namespace('http://semanticscience.org/resource/SIO_000737') , Namespace('http://semanticscience.org/resource/SIO_000749') : Namespace('http://semanticscience.org/resource/SIO_000737') , Namespace('http://semanticscience.org/resource/SIO_000772') : Namespace('http://semanticscience.org/resource/SIO_000631') , Namespace('http://semanticscience.org/resource/SIO_000773') : Namespace('http://semanticscience.org/resource/SIO_000252') , Namespace('http://semanticscience.org/resource/SIO_000774') : Namespace('http://semanticscience.org/resource/SIO_000772') , Namespace('http://semanticscience.org/resource/SIO_000775') : Namespace('http://semanticscience.org/resource/SIO_000773') , Namespace('http://semanticscience.org/resource/SIO_000793') : Namespace('http://semanticscience.org/resource/SIO_000687') , Namespace('http://semanticscience.org/resource/SIO_000892') : Namespace('http://semanticscience.org/resource/SIO_000212') , Namespace('http://semanticscience.org/resource/SIO_000900') : Namespace('http://semanticscience.org/resource/SIO_000008') , Namespace('http://semanticscience.org/resource/SIO_000901') : Namespace('http://semanticscience.org/resource/SIO_000011') , Namespace('http://semanticscience.org/resource/SIO_000905') : Namespace('http://semanticscience.org/resource/SIO_000291') , Namespace('http://semanticscience.org/resource/SIO_000970') : Namespace('http://semanticscience.org/resource/SIO_000975') , Namespace('http://semanticscience.org/resource/SIO_000971') : Namespace('http://semanticscience.org/resource/SIO_000974') , Namespace('http://semanticscience.org/resource/SIO_000972') : Namespace('http://semanticscience.org/resource/SIO_000974') , Namespace('http://semanticscience.org/resource/SIO_000973') : Namespace('http://semanticscience.org/resource/SIO_000975') , Namespace('http://semanticscience.org/resource/SIO_000974') : Namespace('http://semanticscience.org/resource/SIO_000053') , Namespace('http://semanticscience.org/resource/SIO_000975') : Namespace('http://semanticscience.org/resource/SIO_000093') , Namespace('http://semanticscience.org/resource/SIO_001096') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_001097') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_001098') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_001101') : Namespace('http://semanticscience.org/resource/SIO_000709') , Namespace('http://semanticscience.org/resource/SIO_001154') : Namespace('http://semanticscience.org/resource/SIO_000294') , Namespace('http://semanticscience.org/resource/SIO_001155') : Namespace('http://semanticscience.org/resource/SIO_000352') , Namespace('http://semanticscience.org/resource/SIO_001156') : Namespace('http://semanticscience.org/resource/SIO_000294') , Namespace('http://semanticscience.org/resource/SIO_001157') : Namespace('http://semanticscience.org/resource/SIO_000352') , Namespace('http://semanticscience.org/resource/SIO_001158') : Namespace('http://semanticscience.org/resource/SIO_000132') , Namespace('http://semanticscience.org/resource/SIO_001159') : Namespace('http://semanticscience.org/resource/SIO_000062') , Namespace('http://semanticscience.org/resource/SIO_010078') : Namespace('http://semanticscience.org/resource/SIO_000338') , Namespace('http://semanticscience.org/resource/SIO_010079') : Namespace('http://semanticscience.org/resource/SIO_000339') , Namespace('http://semanticscience.org/resource/SIO_010080') : Namespace('http://semanticscience.org/resource/SIO_010078') , Namespace('http://semanticscience.org/resource/SIO_010081') : Namespace('http://semanticscience.org/resource/SIO_010079') , Namespace('http://semanticscience.org/resource/SIO_010082') : Namespace('http://semanticscience.org/resource/SIO_010078') , Namespace('http://semanticscience.org/resource/SIO_010083') : Namespace('http://semanticscience.org/resource/SIO_010079') , Namespace('http://semanticscience.org/resource/SIO_010302') : Namespace('http://semanticscience.org/resource/SIO_000272') , Namespace('http://semanticscience.org/resource/SIO_000009') : Namespace('http://semanticscience.org/resource/SIO_000015') , Namespace('http://semanticscience.org/resource/SIO_000012') : Namespace('http://semanticscience.org/resource/SIO_000620') , Namespace('http://semanticscience.org/resource/SIO_000013') : Namespace('http://semanticscience.org/resource/SIO_000056') , Namespace('http://semanticscience.org/resource/SIO_000016') : Namespace('http://semanticscience.org/resource/SIO_000340') , Namespace('http://semanticscience.org/resource/SIO_000017') : Namespace('http://semanticscience.org/resource/SIO_000112') , Namespace('http://semanticscience.org/resource/SIO_000019') : Namespace('http://semanticscience.org/resource/SIO_000370') , Namespace('http://semanticscience.org/resource/SIO_000031') : Namespace('http://semanticscience.org/resource/SIO_000418') , Namespace('http://semanticscience.org/resource/SIO_000032') : Namespace('http://semanticscience.org/resource/SIO_000418') , Namespace('http://semanticscience.org/resource/SIO_000034') : Namespace('http://semanticscience.org/resource/SIO_000033') , Namespace('http://semanticscience.org/resource/SIO_000035') : Namespace('http://semanticscience.org/resource/SIO_000033') , Namespace('http://semanticscience.org/resource/SIO_000036') : Namespace('http://semanticscience.org/resource/SIO_000959') , Namespace('http://semanticscience.org/resource/SIO_000038') : Namespace('http://semanticscience.org/resource/SIO_000037') , Namespace('http://semanticscience.org/resource/SIO_000039') : Namespace('http://semanticscience.org/resource/SIO_000038') , Namespace('http://semanticscience.org/resource/SIO_000040') : Namespace('http://semanticscience.org/resource/SIO_000790') , Namespace('http://semanticscience.org/resource/SIO_000041') : Namespace('http://semanticscience.org/resource/SIO_000038') , Namespace('http://semanticscience.org/resource/SIO_000042') : Namespace('http://semanticscience.org/resource/SIO_000038') , Namespace('http://semanticscience.org/resource/SIO_000043') : Namespace('http://semanticscience.org/resource/SIO_000039') , Namespace('http://semanticscience.org/resource/SIO_000044') : Namespace('http://semanticscience.org/resource/SIO_000037') , Namespace('http://semanticscience.org/resource/SIO_000045') : Namespace('http://semanticscience.org/resource/SIO_000044') , Namespace('http://semanticscience.org/resource/SIO_000046') : Namespace('http://semanticscience.org/resource/SIO_000044') , Namespace('http://semanticscience.org/resource/SIO_000047') : Namespace('http://semanticscience.org/resource/SIO_000046') , Namespace('http://semanticscience.org/resource/SIO_000048') : Namespace('http://semanticscience.org/resource/SIO_000037') , Namespace('http://semanticscience.org/resource/SIO_000049') : Namespace('http://semanticscience.org/resource/SIO_000048') , Namespace('http://semanticscience.org/resource/SIO_000051') : Namespace('http://semanticscience.org/resource/SIO_000026') , Namespace('http://semanticscience.org/resource/SIO_000055') : Namespace('http://semanticscience.org/resource/SIO_000026') , Namespace('http://semanticscience.org/resource/SIO_000057') : Namespace('http://semanticscience.org/resource/SIO_000056') , Namespace('http://semanticscience.org/resource/SIO_000071') : Namespace('http://semanticscience.org/resource/SIO_000070') , Namespace('http://semanticscience.org/resource/SIO_000072') : Namespace('http://semanticscience.org/resource/SIO_000071') , Namespace('http://semanticscience.org/resource/SIO_000073') : Namespace('http://semanticscience.org/resource/SIO_000071') , Namespace('http://semanticscience.org/resource/SIO_000074') : Namespace('http://semanticscience.org/resource/SIO_000052') , Namespace('http://semanticscience.org/resource/SIO_000075') : Namespace('http://semanticscience.org/resource/SIO_000015') , Namespace('http://semanticscience.org/resource/SIO_000076') : Namespace('http://semanticscience.org/resource/SIO_000091') , Namespace('http://semanticscience.org/resource/SIO_000077') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000079') : Namespace('http://semanticscience.org/resource/SIO_000078') , Namespace('http://semanticscience.org/resource/SIO_000080') : Namespace('http://semanticscience.org/resource/SIO_000612') , Namespace('http://semanticscience.org/resource/SIO_000081') : Namespace('http://semanticscience.org/resource/SIO_000080') , Namespace('http://semanticscience.org/resource/SIO_000082') : Namespace('http://semanticscience.org/resource/SIO_000081') , Namespace('http://semanticscience.org/resource/SIO_000083') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000085') : Namespace('http://semanticscience.org/resource/SIO_000113') , Namespace('http://semanticscience.org/resource/SIO_000087') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000094') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000097') : Namespace('http://semanticscience.org/resource/SIO_000602') , Namespace('http://semanticscience.org/resource/SIO_000098') : Namespace('http://semanticscience.org/resource/SIO_000097') , Namespace('http://semanticscience.org/resource/SIO_000099') : Namespace('http://semanticscience.org/resource/SIO_000097') , Namespace('http://semanticscience.org/resource/SIO_000100') : Namespace('http://semanticscience.org/resource/SIO_000097') , Namespace('http://semanticscience.org/resource/SIO_000101') : Namespace('http://semanticscience.org/resource/SIO_000097') , Namespace('http://semanticscience.org/resource/SIO_000102') : Namespace('http://semanticscience.org/resource/SIO_000101') , Namespace('http://semanticscience.org/resource/SIO_000103') : Namespace('http://semanticscience.org/resource/SIO_000097') , Namespace('http://semanticscience.org/resource/SIO_000104') : Namespace('http://semanticscience.org/resource/SIO_000078') , Namespace('http://semanticscience.org/resource/SIO_000106') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000107') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000108') : Namespace('http://semanticscience.org/resource/SIO_000078') , Namespace('http://semanticscience.org/resource/SIO_000109') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000113') : Namespace('http://semanticscience.org/resource/SIO_000483') , Namespace('http://semanticscience.org/resource/SIO_000117') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000118') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000119') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000120') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000121') : Namespace('http://semanticscience.org/resource/SIO_000162') , Namespace('http://semanticscience.org/resource/SIO_000122') : Namespace('http://semanticscience.org/resource/SIO_000342') , Namespace('http://semanticscience.org/resource/SIO_000123') : Namespace('http://semanticscience.org/resource/SIO_000342') , Namespace('http://semanticscience.org/resource/SIO_000124') : Namespace('http://semanticscience.org/resource/SIO_000342') , Namespace('http://semanticscience.org/resource/SIO_000125') : Namespace('http://semanticscience.org/resource/SIO_000342') , Namespace('http://semanticscience.org/resource/SIO_000127') : Namespace('http://semanticscience.org/resource/SIO_000094') , Namespace('http://semanticscience.org/resource/SIO_000129') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000130') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000131') : Namespace('http://semanticscience.org/resource/SIO_000130') , Namespace('http://semanticscience.org/resource/SIO_000133') : Namespace('http://semanticscience.org/resource/SIO_000275') , Namespace('http://semanticscience.org/resource/SIO_000135') : Namespace('http://semanticscience.org/resource/SIO_000136') , Namespace('http://semanticscience.org/resource/SIO_000137') : Namespace('http://semanticscience.org/resource/SIO_000326') , Namespace('http://semanticscience.org/resource/SIO_000138') : Namespace('http://semanticscience.org/resource/SIO_000289') , Namespace('http://semanticscience.org/resource/SIO_000140') : Namespace('http://semanticscience.org/resource/SIO_000101') , Namespace('http://semanticscience.org/resource/SIO_000141') : Namespace('http://semanticscience.org/resource/SIO_000316') , Namespace('http://semanticscience.org/resource/SIO_000142') : Namespace('http://semanticscience.org/resource/SIO_000141') , Namespace('http://semanticscience.org/resource/SIO_000143') : Namespace('http://semanticscience.org/resource/SIO_000141') , Namespace('http://semanticscience.org/resource/SIO_000144') : Namespace('http://semanticscience.org/resource/SIO_000920') , Namespace('http://semanticscience.org/resource/SIO_000147') : Namespace('http://semanticscience.org/resource/SIO_000133') , Namespace('http://semanticscience.org/resource/SIO_000148') : Namespace('http://semanticscience.org/resource/SIO_000651') , Namespace('http://semanticscience.org/resource/SIO_000151') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000152') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000153') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000154') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000155') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000156') : Namespace('http://semanticscience.org/resource/SIO_000106') , Namespace('http://semanticscience.org/resource/SIO_000157') : Namespace('http://semanticscience.org/resource/SIO_000106') , Namespace('http://semanticscience.org/resource/SIO_000158') : Namespace('http://semanticscience.org/resource/SIO_000295') , Namespace('http://semanticscience.org/resource/SIO_000159') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000160') : Namespace('http://semanticscience.org/resource/SIO_000162') , Namespace('http://semanticscience.org/resource/SIO_000161') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000162') : Namespace('http://semanticscience.org/resource/SIO_000295') , Namespace('http://semanticscience.org/resource/SIO_000163') : Namespace('http://semanticscience.org/resource/SIO_000162') , Namespace('http://semanticscience.org/resource/SIO_000164') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000165') : Namespace('http://semanticscience.org/resource/SIO_000087') , Namespace('http://semanticscience.org/resource/SIO_000166') : Namespace('http://semanticscience.org/resource/SIO_000165') , Namespace('http://semanticscience.org/resource/SIO_000167') : Namespace('http://semanticscience.org/resource/SIO_000165') , Namespace('http://semanticscience.org/resource/SIO_000168') : Namespace('http://semanticscience.org/resource/SIO_000165') , Namespace('http://semanticscience.org/resource/SIO_000169') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000170') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000171') : Namespace('http://semanticscience.org/resource/SIO_000651') , Namespace('http://semanticscience.org/resource/SIO_000172') : Namespace('http://semanticscience.org/resource/SIO_000328') , Namespace('http://semanticscience.org/resource/SIO_000173') : Namespace('http://semanticscience.org/resource/SIO_000287') , Namespace('http://semanticscience.org/resource/SIO_000174') : Namespace('http://semanticscience.org/resource/SIO_000171') , Namespace('http://semanticscience.org/resource/SIO_000175') : Namespace('http://semanticscience.org/resource/SIO_000185') , Namespace('http://semanticscience.org/resource/SIO_000176') : Namespace('http://semanticscience.org/resource/SIO_000171') , Namespace('http://semanticscience.org/resource/SIO_000177') : Namespace('http://semanticscience.org/resource/SIO_000944') , Namespace('http://semanticscience.org/resource/SIO_000178') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_000179') : Namespace('http://semanticscience.org/resource/SIO_000651') , Namespace('http://semanticscience.org/resource/SIO_000180') : Namespace('http://semanticscience.org/resource/SIO_000179') , Namespace('http://semanticscience.org/resource/SIO_000181') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000182') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000183') : Namespace('http://semanticscience.org/resource/SIO_000116') , Namespace('http://semanticscience.org/resource/SIO_000184') : Namespace('http://semanticscience.org/resource/SIO_000183') , Namespace('http://semanticscience.org/resource/SIO_000185') : Namespace('http://semanticscience.org/resource/SIO_000179') , Namespace('http://semanticscience.org/resource/SIO_000186') : Namespace('http://semanticscience.org/resource/SIO_000653') , Namespace('http://semanticscience.org/resource/SIO_000188') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000189') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000190') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000191') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000192') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000193') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000194') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000195') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000196') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000197') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000198') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000199') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000200') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000201') : Namespace('http://semanticscience.org/resource/SIO_000111') , Namespace('http://semanticscience.org/resource/SIO_000220') : Namespace('http://semanticscience.org/resource/SIO_000238') , Namespace('http://semanticscience.org/resource/SIO_000237') : Namespace('http://semanticscience.org/resource/SIO_000179') , Namespace('http://semanticscience.org/resource/SIO_000238') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000239') : Namespace('http://semanticscience.org/resource/SIO_000238') , Namespace('http://semanticscience.org/resource/SIO_000261') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_000262') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_000263') : Namespace('http://semanticscience.org/resource/SIO_000259') , Namespace('http://semanticscience.org/resource/SIO_000264') : Namespace('http://semanticscience.org/resource/SIO_000259') , Namespace('http://semanticscience.org/resource/SIO_000268') : Namespace('http://semanticscience.org/resource/SIO_000436') , Namespace('http://semanticscience.org/resource/SIO_000276') : Namespace('http://semanticscience.org/resource/SIO_000006') , Namespace('http://semanticscience.org/resource/SIO_000280') : Namespace('http://semanticscience.org/resource/SIO_000238') , Namespace('http://semanticscience.org/resource/SIO_000281') : Namespace('http://semanticscience.org/resource/SIO_000238') , Namespace('http://semanticscience.org/resource/SIO_000282') : Namespace('http://semanticscience.org/resource/SIO_000280') , Namespace('http://semanticscience.org/resource/SIO_000284') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_000285') : Namespace('http://semanticscience.org/resource/SIO_000012') , Namespace('http://semanticscience.org/resource/SIO_000287') : Namespace('http://semanticscience.org/resource/SIO_000009') , Namespace('http://semanticscience.org/resource/SIO_000290') : Namespace('http://semanticscience.org/resource/SIO_000285') , Namespace('http://semanticscience.org/resource/SIO_000297') : Namespace('http://semanticscience.org/resource/SIO_000612') , Namespace('http://semanticscience.org/resource/SIO_000301') : Namespace('http://semanticscience.org/resource/SIO_000082') , Namespace('http://semanticscience.org/resource/SIO_000302') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000304') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000305') : Namespace('http://semanticscience.org/resource/SIO_000613') , Namespace('http://semanticscience.org/resource/SIO_000306') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_000307') : Namespace('http://semanticscience.org/resource/SIO_000005') , Namespace('http://semanticscience.org/resource/SIO_000308') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_000309') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_000316') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_000317') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_000318') : Namespace('http://semanticscience.org/resource/SIO_000013') , Namespace('http://semanticscience.org/resource/SIO_000319') : Namespace('http://semanticscience.org/resource/SIO_000013') , Namespace('http://semanticscience.org/resource/SIO_000320') : Namespace('http://semanticscience.org/resource/SIO_000317') , Namespace('http://semanticscience.org/resource/SIO_000321') : Namespace('http://semanticscience.org/resource/SIO_000320') , Namespace('http://semanticscience.org/resource/SIO_000326') : Namespace('http://semanticscience.org/resource/SIO_000275') , Namespace('http://semanticscience.org/resource/SIO_000327') : Namespace('http://semanticscience.org/resource/SIO_000320') , Namespace('http://semanticscience.org/resource/SIO_000329') : Namespace('http://semanticscience.org/resource/SIO_000320') , Namespace('http://semanticscience.org/resource/SIO_000330') : Namespace('http://semanticscience.org/resource/SIO_000320') , Namespace('http://semanticscience.org/resource/SIO_000331') : Namespace('http://semanticscience.org/resource/SIO_000129') , Namespace('http://semanticscience.org/resource/SIO_000343') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000344') : Namespace('http://semanticscience.org/resource/SIO_000639') , Namespace('http://semanticscience.org/resource/SIO_000345') : Namespace('http://semanticscience.org/resource/SIO_000378') , Namespace('http://semanticscience.org/resource/SIO_000346') : Namespace('http://semanticscience.org/resource/SIO_000351') , Namespace('http://semanticscience.org/resource/SIO_000347') : Namespace('http://semanticscience.org/resource/SIO_000374') , Namespace('http://semanticscience.org/resource/SIO_000348') : Namespace('http://semanticscience.org/resource/SIO_000347') , Namespace('http://semanticscience.org/resource/SIO_000349') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000350') : Namespace('http://semanticscience.org/resource/SIO_001087') , Namespace('http://semanticscience.org/resource/SIO_000351') : Namespace('http://semanticscience.org/resource/SIO_000385') , Namespace('http://semanticscience.org/resource/SIO_000353') : Namespace('http://semanticscience.org/resource/SIO_000639') , Namespace('http://semanticscience.org/resource/SIO_000354') : Namespace('http://semanticscience.org/resource/SIO_000112') , Namespace('http://semanticscience.org/resource/SIO_000357') : Namespace('http://semanticscience.org/resource/SIO_010019') , Namespace('http://semanticscience.org/resource/SIO_000358') : Namespace('http://semanticscience.org/resource/SIO_000825') , Namespace('http://semanticscience.org/resource/SIO_000359') : Namespace('http://semanticscience.org/resource/SIO_000337') , Namespace('http://semanticscience.org/resource/SIO_000366') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000367') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000368') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000371') : Namespace('http://semanticscience.org/resource/SIO_000408') , Namespace('http://semanticscience.org/resource/SIO_000372') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000373') : Namespace('http://semanticscience.org/resource/SIO_000346') , Namespace('http://semanticscience.org/resource/SIO_000374') : Namespace('http://semanticscience.org/resource/SIO_000385') , Namespace('http://semanticscience.org/resource/SIO_000375') : Namespace('http://semanticscience.org/resource/SIO_000351') , Namespace('http://semanticscience.org/resource/SIO_000376') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000377') : Namespace('http://semanticscience.org/resource/SIO_000378') , Namespace('http://semanticscience.org/resource/SIO_000378') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000379') : Namespace('http://semanticscience.org/resource/SIO_001055') , Namespace('http://semanticscience.org/resource/SIO_000380') : Namespace('http://semanticscience.org/resource/SIO_000392') , Namespace('http://semanticscience.org/resource/SIO_000381') : Namespace('http://semanticscience.org/resource/SIO_000380') , Namespace('http://semanticscience.org/resource/SIO_000382') : Namespace('http://semanticscience.org/resource/SIO_000349') , Namespace('http://semanticscience.org/resource/SIO_000383') : Namespace('http://semanticscience.org/resource/SIO_000351') , Namespace('http://semanticscience.org/resource/SIO_000384') : Namespace('http://semanticscience.org/resource/SIO_000374') , Namespace('http://semanticscience.org/resource/SIO_000385') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000386') : Namespace('http://semanticscience.org/resource/SIO_000350') , Namespace('http://semanticscience.org/resource/SIO_000387') : Namespace('http://semanticscience.org/resource/SIO_000350') , Namespace('http://semanticscience.org/resource/SIO_000388') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000389') : Namespace('http://semanticscience.org/resource/SIO_000349') , Namespace('http://semanticscience.org/resource/SIO_000390') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000392') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000393') : Namespace('http://semanticscience.org/resource/SIO_000498') , Namespace('http://semanticscience.org/resource/SIO_000395') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000396') : Namespace('http://semanticscience.org/resource/SIO_000602') , Namespace('http://semanticscience.org/resource/SIO_000397') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000399') : Namespace('http://semanticscience.org/resource/SIO_000498') , Namespace('http://semanticscience.org/resource/SIO_000400') : Namespace('http://semanticscience.org/resource/SIO_000072') , Namespace('http://semanticscience.org/resource/SIO_000401') : Namespace('http://semanticscience.org/resource/SIO_000072') , Namespace('http://semanticscience.org/resource/SIO_000402') : Namespace('http://semanticscience.org/resource/SIO_000072') , Namespace('http://semanticscience.org/resource/SIO_000403') : Namespace('http://semanticscience.org/resource/SIO_000620') , Namespace('http://semanticscience.org/resource/SIO_000404') : Namespace('http://semanticscience.org/resource/SIO_000406') , Namespace('http://semanticscience.org/resource/SIO_000405') : Namespace('http://semanticscience.org/resource/SIO_000406') , Namespace('http://semanticscience.org/resource/SIO_000406') : Namespace('http://semanticscience.org/resource/SIO_000498') , Namespace('http://semanticscience.org/resource/SIO_000407') : Namespace('http://semanticscience.org/resource/SIO_000536') , Namespace('http://semanticscience.org/resource/SIO_000408') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000409') : Namespace('http://semanticscience.org/resource/SIO_000014') , Namespace('http://semanticscience.org/resource/SIO_000410') : Namespace('http://semanticscience.org/resource/SIO_000828') , Namespace('http://semanticscience.org/resource/SIO_000411') : Namespace('http://semanticscience.org/resource/SIO_000828') , Namespace('http://semanticscience.org/resource/SIO_000412') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000413') : Namespace('http://semanticscience.org/resource/SIO_000414') , Namespace('http://semanticscience.org/resource/SIO_000414') : Namespace('http://semanticscience.org/resource/SIO_000370') , Namespace('http://semanticscience.org/resource/SIO_000415') : Namespace('http://semanticscience.org/resource/SIO_000413') , Namespace('http://semanticscience.org/resource/SIO_000417') : Namespace('http://semanticscience.org/resource/SIO_000391') , Namespace('http://semanticscience.org/resource/SIO_000418') : Namespace('http://semanticscience.org/resource/SIO_000391') , Namespace('http://semanticscience.org/resource/SIO_000419') : Namespace('http://semanticscience.org/resource/SIO_000080') , Namespace('http://semanticscience.org/resource/SIO_000423') : Namespace('http://semanticscience.org/resource/SIO_000083') , Namespace('http://semanticscience.org/resource/SIO_000428') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000429') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000430') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000431') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000432') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000433') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000434') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000435') : Namespace('http://semanticscience.org/resource/SIO_000417') , Namespace('http://semanticscience.org/resource/SIO_000438') : Namespace('http://semanticscience.org/resource/SIO_000790') , Namespace('http://semanticscience.org/resource/SIO_000439') : Namespace('http://semanticscience.org/resource/SIO_000056') , Namespace('http://semanticscience.org/resource/SIO_000442') : Namespace('http://semanticscience.org/resource/SIO_000083') , Namespace('http://semanticscience.org/resource/SIO_000443') : Namespace('http://semanticscience.org/resource/SIO_000083') , Namespace('http://semanticscience.org/resource/SIO_000444') : Namespace('http://semanticscience.org/resource/SIO_000443') , Namespace('http://semanticscience.org/resource/SIO_000445') : Namespace('http://semanticscience.org/resource/SIO_000443') , Namespace('http://semanticscience.org/resource/SIO_000446') : Namespace('http://semanticscience.org/resource/SIO_000443') , Namespace('http://semanticscience.org/resource/SIO_000447') : Namespace('http://semanticscience.org/resource/SIO_000083') , Namespace('http://semanticscience.org/resource/SIO_000449') : Namespace('http://semanticscience.org/resource/SIO_000448') , Namespace('http://semanticscience.org/resource/SIO_000452') : Namespace('http://semanticscience.org/resource/SIO_000451') , Namespace('http://semanticscience.org/resource/SIO_000453') : Namespace('http://semanticscience.org/resource/SIO_000451') , Namespace('http://semanticscience.org/resource/SIO_000454') : Namespace('http://semanticscience.org/resource/SIO_000451') , Namespace('http://semanticscience.org/resource/SIO_000455') : Namespace('http://semanticscience.org/resource/SIO_000450') , Namespace('http://semanticscience.org/resource/SIO_000456') : Namespace('http://semanticscience.org/resource/SIO_000455') , Namespace('http://semanticscience.org/resource/SIO_000457') : Namespace('http://semanticscience.org/resource/SIO_000455') , Namespace('http://semanticscience.org/resource/SIO_000458') : Namespace('http://semanticscience.org/resource/SIO_000450') , Namespace('http://semanticscience.org/resource/SIO_000459') : Namespace('http://semanticscience.org/resource/SIO_000458') , Namespace('http://semanticscience.org/resource/SIO_000460') : Namespace('http://semanticscience.org/resource/SIO_000458') , Namespace('http://semanticscience.org/resource/SIO_000461') : Namespace('http://semanticscience.org/resource/SIO_000458') , Namespace('http://semanticscience.org/resource/SIO_000462') : Namespace('http://semanticscience.org/resource/SIO_000461') , Namespace('http://semanticscience.org/resource/SIO_000463') : Namespace('http://semanticscience.org/resource/SIO_000461') , Namespace('http://semanticscience.org/resource/SIO_000464') : Namespace('http://semanticscience.org/resource/SIO_000150') , Namespace('http://semanticscience.org/resource/SIO_000466') : Namespace('http://semanticscience.org/resource/SIO_000742') , Namespace('http://semanticscience.org/resource/SIO_000467') : Namespace('http://semanticscience.org/resource/SIO_000743') , Namespace('http://semanticscience.org/resource/SIO_000468') : Namespace('http://semanticscience.org/resource/SIO_000448') , Namespace('http://semanticscience.org/resource/SIO_000470') : Namespace('http://semanticscience.org/resource/SIO_000185') , Namespace('http://semanticscience.org/resource/SIO_000471') : Namespace('http://semanticscience.org/resource/SIO_000185') , Namespace('http://semanticscience.org/resource/SIO_000472') : Namespace('http://semanticscience.org/resource/SIO_000069') , Namespace('http://semanticscience.org/resource/SIO_000475') : Namespace('http://semanticscience.org/resource/SIO_000026') , Namespace('http://semanticscience.org/resource/SIO_000478') : Namespace('http://semanticscience.org/resource/SIO_000479') , Namespace('http://semanticscience.org/resource/SIO_000479') : Namespace('http://semanticscience.org/resource/SIO_000721') , Namespace('http://semanticscience.org/resource/SIO_000480') : Namespace('http://semanticscience.org/resource/SIO_000478') , Namespace('http://semanticscience.org/resource/SIO_000481') : Namespace('http://semanticscience.org/resource/SIO_000478') , Namespace('http://semanticscience.org/resource/SIO_000485') : Namespace('http://semanticscience.org/resource/SIO_010375') , Namespace('http://semanticscience.org/resource/SIO_000486') : Namespace('http://semanticscience.org/resource/SIO_010375') , Namespace('http://semanticscience.org/resource/SIO_000487') : Namespace('http://semanticscience.org/resource/SIO_010375') , Namespace('http://semanticscience.org/resource/SIO_000488') : Namespace('http://semanticscience.org/resource/SIO_010375') , Namespace('http://semanticscience.org/resource/SIO_000489') : Namespace('http://semanticscience.org/resource/SIO_010376') , Namespace('http://semanticscience.org/resource/SIO_000492') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000493') : Namespace('http://semanticscience.org/resource/SIO_000113') , Namespace('http://semanticscience.org/resource/SIO_000494') : Namespace('http://semanticscience.org/resource/SIO_000701') , Namespace('http://semanticscience.org/resource/SIO_000498') : Namespace('http://semanticscience.org/resource/SIO_000485') , Namespace('http://semanticscience.org/resource/SIO_000499') : Namespace('http://semanticscience.org/resource/SIO_000536') , Namespace('http://semanticscience.org/resource/SIO_000505') : Namespace('http://semanticscience.org/resource/SIO_000506') , Namespace('http://semanticscience.org/resource/SIO_000506') : Namespace('http://semanticscience.org/resource/SIO_000015') , Namespace('http://semanticscience.org/resource/SIO_000507') : Namespace('http://semanticscience.org/resource/SIO_000506') , Namespace('http://semanticscience.org/resource/SIO_000508') : Namespace('http://semanticscience.org/resource/SIO_000532') , Namespace('http://semanticscience.org/resource/SIO_000509') : Namespace('http://semanticscience.org/resource/SIO_000532') , Namespace('http://semanticscience.org/resource/SIO_000511') : Namespace('http://semanticscience.org/resource/SIO_000608') , Namespace('http://semanticscience.org/resource/SIO_000513') : Namespace('http://semanticscience.org/resource/SIO_000512') , Namespace('http://semanticscience.org/resource/SIO_000514') : Namespace('http://semanticscience.org/resource/SIO_000513') , Namespace('http://semanticscience.org/resource/SIO_000515') : Namespace('http://semanticscience.org/resource/SIO_000513') , Namespace('http://semanticscience.org/resource/SIO_000516') : Namespace('http://semanticscience.org/resource/SIO_000511') , Namespace('http://semanticscience.org/resource/SIO_000517') : Namespace('http://semanticscience.org/resource/SIO_000505') , Namespace('http://semanticscience.org/resource/SIO_000518') : Namespace('http://semanticscience.org/resource/SIO_000517') , Namespace('http://semanticscience.org/resource/SIO_000519') : Namespace('http://semanticscience.org/resource/SIO_000518') , Namespace('http://semanticscience.org/resource/SIO_000520') : Namespace('http://semanticscience.org/resource/SIO_000505') , Namespace('http://semanticscience.org/resource/SIO_000525') : Namespace('http://semanticscience.org/resource/SIO_000534') , Namespace('http://semanticscience.org/resource/SIO_000526') : Namespace('http://semanticscience.org/resource/SIO_000534') , Namespace('http://semanticscience.org/resource/SIO_000527') : Namespace('http://semanticscience.org/resource/SIO_000535') , Namespace('http://semanticscience.org/resource/SIO_000528') : Namespace('http://semanticscience.org/resource/SIO_000527') , Namespace('http://semanticscience.org/resource/SIO_000529') : Namespace('http://semanticscience.org/resource/SIO_000527') , Namespace('http://semanticscience.org/resource/SIO_000530') : Namespace('http://semanticscience.org/resource/SIO_000527') , Namespace('http://semanticscience.org/resource/SIO_000531') : Namespace('http://semanticscience.org/resource/SIO_000535') , Namespace('http://semanticscience.org/resource/SIO_000532') : Namespace('http://semanticscience.org/resource/SIO_000507') , Namespace('http://semanticscience.org/resource/SIO_000533') : Namespace('http://semanticscience.org/resource/SIO_000540') , Namespace('http://semanticscience.org/resource/SIO_000534') : Namespace('http://semanticscience.org/resource/SIO_000511') , Namespace('http://semanticscience.org/resource/SIO_000535') : Namespace('http://semanticscience.org/resource/SIO_000511') , Namespace('http://semanticscience.org/resource/SIO_000536') : Namespace('http://semanticscience.org/resource/SIO_000395') , Namespace('http://semanticscience.org/resource/SIO_000537') : Namespace('http://semanticscience.org/resource/SIO_000055') , Namespace('http://semanticscience.org/resource/SIO_000538') : Namespace('http://semanticscience.org/resource/SIO_000537') , Namespace('http://semanticscience.org/resource/SIO_000539') : Namespace('http://semanticscience.org/resource/SIO_000511') , Namespace('http://semanticscience.org/resource/SIO_000540') : Namespace('http://semanticscience.org/resource/SIO_000516') , Namespace('http://semanticscience.org/resource/SIO_000541') : Namespace('http://semanticscience.org/resource/SIO_000540') , Namespace('http://semanticscience.org/resource/SIO_000542') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000544') : Namespace('http://semanticscience.org/resource/SIO_000372') , Namespace('http://semanticscience.org/resource/SIO_000547') : Namespace('http://semanticscience.org/resource/SIO_000376') , Namespace('http://semanticscience.org/resource/SIO_000549') : Namespace('http://semanticscience.org/resource/SIO_010355') , Namespace('http://semanticscience.org/resource/SIO_000550') : Namespace('http://semanticscience.org/resource/SIO_010354') , Namespace('http://semanticscience.org/resource/SIO_000551') : Namespace('http://semanticscience.org/resource/SIO_010347') , Namespace('http://semanticscience.org/resource/SIO_000554') : Namespace('http://semanticscience.org/resource/SIO_000307') , Namespace('http://semanticscience.org/resource/SIO_000555') : Namespace('http://semanticscience.org/resource/SIO_000307') , Namespace('http://semanticscience.org/resource/SIO_000556') : Namespace('http://semanticscience.org/resource/SIO_010071') , Namespace('http://semanticscience.org/resource/SIO_000561') : Namespace('http://semanticscience.org/resource/SIO_011121') , Namespace('http://semanticscience.org/resource/SIO_000562') : Namespace('http://semanticscience.org/resource/SIO_000576') , Namespace('http://semanticscience.org/resource/SIO_000564') : Namespace('http://semanticscience.org/resource/SIO_000573') , Namespace('http://semanticscience.org/resource/SIO_000566') : Namespace('http://semanticscience.org/resource/SIO_000368') , Namespace('http://semanticscience.org/resource/SIO_000567') : Namespace('http://semanticscience.org/resource/SIO_000569') , Namespace('http://semanticscience.org/resource/SIO_000568') : Namespace('http://semanticscience.org/resource/SIO_000569') , Namespace('http://semanticscience.org/resource/SIO_000569') : Namespace('http://semanticscience.org/resource/SIO_000368') , Namespace('http://semanticscience.org/resource/SIO_000570') : Namespace('http://semanticscience.org/resource/SIO_000006') , Namespace('http://semanticscience.org/resource/SIO_000571') : Namespace('http://semanticscience.org/resource/SIO_000564') , Namespace('http://semanticscience.org/resource/SIO_000572') : Namespace('http://semanticscience.org/resource/SIO_000564') , Namespace('http://semanticscience.org/resource/SIO_000573') : Namespace('http://semanticscience.org/resource/SIO_000570') , Namespace('http://semanticscience.org/resource/SIO_000574') : Namespace('http://semanticscience.org/resource/SIO_000570') , Namespace('http://semanticscience.org/resource/SIO_000576') : Namespace('http://semanticscience.org/resource/SIO_010283') , Namespace('http://semanticscience.org/resource/SIO_000577') : Namespace('http://semanticscience.org/resource/SIO_010284') , Namespace('http://semanticscience.org/resource/SIO_000578') : Namespace('http://semanticscience.org/resource/SIO_010284') , Namespace('http://semanticscience.org/resource/SIO_000579') : Namespace('http://semanticscience.org/resource/SIO_000578') , Namespace('http://semanticscience.org/resource/SIO_000580') : Namespace('http://semanticscience.org/resource/SIO_000578') , Namespace('http://semanticscience.org/resource/SIO_000581') : Namespace('http://semanticscience.org/resource/SIO_000574') , Namespace('http://semanticscience.org/resource/SIO_000585') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_000587') : Namespace('http://semanticscience.org/resource/SIO_000588') , Namespace('http://semanticscience.org/resource/SIO_000589') : Namespace('http://semanticscience.org/resource/SIO_000593') , Namespace('http://semanticscience.org/resource/SIO_000590') : Namespace('http://semanticscience.org/resource/SIO_000559') , Namespace('http://semanticscience.org/resource/SIO_000596') : Namespace('http://semanticscience.org/resource/SIO_000956') , Namespace('http://semanticscience.org/resource/SIO_000597') : Namespace('http://semanticscience.org/resource/SIO_000598') , Namespace('http://semanticscience.org/resource/SIO_000598') : Namespace('http://semanticscience.org/resource/SIO_000596') , Namespace('http://semanticscience.org/resource/SIO_000600') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_000602') : Namespace('http://semanticscience.org/resource/SIO_000015') , Namespace('http://semanticscience.org/resource/SIO_000605') : Namespace('http://semanticscience.org/resource/SIO_000650') , Namespace('http://semanticscience.org/resource/SIO_000608') : Namespace('http://semanticscience.org/resource/SIO_000506') , Namespace('http://semanticscience.org/resource/SIO_000613') : Namespace('http://semanticscience.org/resource/SIO_000788') , Namespace('http://semanticscience.org/resource/SIO_000619') : Namespace('http://semanticscience.org/resource/SIO_000012') , Namespace('http://semanticscience.org/resource/SIO_000620') : Namespace('http://semanticscience.org/resource/SIO_000010') , Namespace('http://semanticscience.org/resource/SIO_000621') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_000622') : Namespace('http://semanticscience.org/resource/SIO_000129') , Namespace('http://semanticscience.org/resource/SIO_000623') : Namespace('http://semanticscience.org/resource/SIO_000129') , Namespace('http://semanticscience.org/resource/SIO_000624') : Namespace('http://semanticscience.org/resource/SIO_010441') , Namespace('http://semanticscience.org/resource/SIO_000625') : Namespace('http://semanticscience.org/resource/SIO_000600') , Namespace('http://semanticscience.org/resource/SIO_000626') : Namespace('http://semanticscience.org/resource/SIO_000625') , Namespace('http://semanticscience.org/resource/SIO_000638') : Namespace('http://semanticscience.org/resource/SIO_000257') , Namespace('http://semanticscience.org/resource/SIO_000639') : Namespace('http://semanticscience.org/resource/SIO_000701') , Namespace('http://semanticscience.org/resource/SIO_000640') : Namespace('http://semanticscience.org/resource/SIO_000555') , Namespace('http://semanticscience.org/resource/SIO_000648') : Namespace('http://semanticscience.org/resource/SIO_000510') , Namespace('http://semanticscience.org/resource/SIO_000649') : Namespace('http://semanticscience.org/resource/SIO_000999') , Namespace('http://semanticscience.org/resource/SIO_000650') : Namespace('http://semanticscience.org/resource/SIO_000004') , Namespace('http://semanticscience.org/resource/SIO_000651') : Namespace('http://semanticscience.org/resource/SIO_000079') , Namespace('http://semanticscience.org/resource/SIO_000660') : Namespace('http://semanticscience.org/resource/SIO_000019') , Namespace('http://semanticscience.org/resource/SIO_000661') : Namespace('http://semanticscience.org/resource/SIO_000415') , Namespace('http://semanticscience.org/resource/SIO_000662') : Namespace('http://semanticscience.org/resource/SIO_000415') , Namespace('http://semanticscience.org/resource/SIO_000663') : Namespace('http://semanticscience.org/resource/SIO_000415') , Namespace('http://semanticscience.org/resource/SIO_000664') : Namespace('http://semanticscience.org/resource/SIO_000415') , Namespace('http://semanticscience.org/resource/SIO_000665') : Namespace('http://semanticscience.org/resource/SIO_000415') , Namespace('http://semanticscience.org/resource/SIO_000666') : Namespace('http://semanticscience.org/resource/SIO_000415') , Namespace('http://semanticscience.org/resource/SIO_000667') : Namespace('http://semanticscience.org/resource/SIO_000649') , Namespace('http://semanticscience.org/resource/SIO_000669') : Namespace('http://semanticscience.org/resource/SIO_000418') , Namespace('http://semanticscience.org/resource/SIO_000670') : Namespace('http://semanticscience.org/resource/SIO_000418') , Namespace('http://semanticscience.org/resource/SIO_000676') : Namespace('http://semanticscience.org/resource/SIO_000016') , Namespace('http://semanticscience.org/resource/SIO_000677') : Namespace('http://semanticscience.org/resource/SIO_000016') , Namespace('http://semanticscience.org/resource/SIO_000678') : Namespace('http://semanticscience.org/resource/SIO_000016') , Namespace('http://semanticscience.org/resource/SIO_000683') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_000686') : Namespace('http://semanticscience.org/resource/SIO_000285') , Namespace('http://semanticscience.org/resource/SIO_000688') : Namespace('http://semanticscience.org/resource/SIO_000285') , Namespace('http://semanticscience.org/resource/SIO_000689') : Namespace('http://semanticscience.org/resource/SIO_010367') , Namespace('http://semanticscience.org/resource/SIO_000690') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_000693') : Namespace('http://semanticscience.org/resource/SIO_000012') , Namespace('http://semanticscience.org/resource/SIO_000698') : Namespace('http://semanticscience.org/resource/SIO_000376') , Namespace('http://semanticscience.org/resource/SIO_000700') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_000704') : Namespace('http://semanticscience.org/resource/SIO_000678') , Namespace('http://semanticscience.org/resource/SIO_000705') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_000706') : Namespace('http://semanticscience.org/resource/SIO_000676') , Namespace('http://semanticscience.org/resource/SIO_000711') : Namespace('http://semanticscience.org/resource/SIO_000706') , Namespace('http://semanticscience.org/resource/SIO_000712') : Namespace('http://semanticscience.org/resource/SIO_000706') , Namespace('http://semanticscience.org/resource/SIO_000713') : Namespace('http://semanticscience.org/resource/SIO_000712') , Namespace('http://semanticscience.org/resource/SIO_000714') : Namespace('http://semanticscience.org/resource/SIO_000712') , Namespace('http://semanticscience.org/resource/SIO_000715') : Namespace('http://semanticscience.org/resource/SIO_000712') , Namespace('http://semanticscience.org/resource/SIO_000716') : Namespace('http://semanticscience.org/resource/SIO_000498') , Namespace('http://semanticscience.org/resource/SIO_000717') : Namespace('http://semanticscience.org/resource/SIO_000712') , Namespace('http://semanticscience.org/resource/SIO_000721') : Namespace('http://semanticscience.org/resource/SIO_000678') , Namespace('http://semanticscience.org/resource/SIO_000722') : Namespace('http://semanticscience.org/resource/SIO_000725') , Namespace('http://semanticscience.org/resource/SIO_000723') : Namespace('http://semanticscience.org/resource/SIO_000724') , Namespace('http://semanticscience.org/resource/SIO_000724') : Namespace('http://semanticscience.org/resource/SIO_000353') , Namespace('http://semanticscience.org/resource/SIO_000725') : Namespace('http://semanticscience.org/resource/SIO_000696') , Namespace('http://semanticscience.org/resource/SIO_000726') : Namespace('http://semanticscience.org/resource/SIO_000706') , Namespace('http://semanticscience.org/resource/SIO_000727') : Namespace('http://semanticscience.org/resource/SIO_000726') , Namespace('http://semanticscience.org/resource/SIO_000728') : Namespace('http://semanticscience.org/resource/SIO_000730') , Namespace('http://semanticscience.org/resource/SIO_000730') : Namespace('http://semanticscience.org/resource/SIO_000115') , Namespace('http://semanticscience.org/resource/SIO_000731') : Namespace('http://semanticscience.org/resource/SIO_000115') , Namespace('http://semanticscience.org/resource/SIO_000732') : Namespace('http://semanticscience.org/resource/SIO_000728') , Namespace('http://semanticscience.org/resource/SIO_000740') : Namespace('http://semanticscience.org/resource/SIO_000608') , Namespace('http://semanticscience.org/resource/SIO_000741') : Namespace('http://semanticscience.org/resource/SIO_000465') , Namespace('http://semanticscience.org/resource/SIO_000742') : Namespace('http://semanticscience.org/resource/SIO_000741') , Namespace('http://semanticscience.org/resource/SIO_000743') : Namespace('http://semanticscience.org/resource/SIO_000741') , Namespace('http://semanticscience.org/resource/SIO_000750') : Namespace('http://semanticscience.org/resource/SIO_000602') , Namespace('http://semanticscience.org/resource/SIO_000751') : Namespace('http://semanticscience.org/resource/SIO_000555') , Namespace('http://semanticscience.org/resource/SIO_000760') : Namespace('http://semanticscience.org/resource/SIO_000755') , Namespace('http://semanticscience.org/resource/SIO_000766') : Namespace('http://semanticscience.org/resource/SIO_000328') , Namespace('http://semanticscience.org/resource/SIO_000767') : Namespace('http://semanticscience.org/resource/SIO_000013') , Namespace('http://semanticscience.org/resource/SIO_000768') : Namespace('http://semanticscience.org/resource/SIO_000179') , Namespace('http://semanticscience.org/resource/SIO_000769') : Namespace('http://semanticscience.org/resource/SIO_000052') , Namespace('http://semanticscience.org/resource/SIO_000770') : Namespace('http://semanticscience.org/resource/SIO_000052') , Namespace('http://semanticscience.org/resource/SIO_000771') : Namespace('http://semanticscience.org/resource/SIO_000088') , Namespace('http://semanticscience.org/resource/SIO_000777') : Namespace('http://semanticscience.org/resource/SIO_000639') , Namespace('http://semanticscience.org/resource/SIO_000778') : Namespace('http://semanticscience.org/resource/SIO_000378') , Namespace('http://semanticscience.org/resource/SIO_000780') : Namespace('http://semanticscience.org/resource/SIO_000690') , Namespace('http://semanticscience.org/resource/SIO_000783') : Namespace('http://semanticscience.org/resource/SIO_000370') , Namespace('http://semanticscience.org/resource/SIO_000784') : Namespace('http://semanticscience.org/resource/SIO_010029') , Namespace('http://semanticscience.org/resource/SIO_000785') : Namespace('http://semanticscience.org/resource/SIO_000136') , Namespace('http://semanticscience.org/resource/SIO_000786') : Namespace('http://semanticscience.org/resource/SIO_000078') , Namespace('http://semanticscience.org/resource/SIO_000787') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_000788') : Namespace('http://semanticscience.org/resource/SIO_000056') , Namespace('http://semanticscience.org/resource/SIO_000789') : Namespace('http://semanticscience.org/resource/SIO_000788') , Namespace('http://semanticscience.org/resource/SIO_000790') : Namespace('http://semanticscience.org/resource/SIO_000038') , Namespace('http://semanticscience.org/resource/SIO_000791') : Namespace('http://semanticscience.org/resource/SIO_000943') , Namespace('http://semanticscience.org/resource/SIO_000792') : Namespace('http://semanticscience.org/resource/SIO_000953') , Namespace('http://semanticscience.org/resource/SIO_000794') : Namespace('http://semanticscience.org/resource/SIO_000257') , Namespace('http://semanticscience.org/resource/SIO_000796') : Namespace('http://semanticscience.org/resource/SIO_000880') , Namespace('http://semanticscience.org/resource/SIO_000797') : Namespace('http://semanticscience.org/resource/SIO_000879') , Namespace('http://semanticscience.org/resource/SIO_000799') : Namespace('http://semanticscience.org/resource/SIO_000889') , Namespace('http://semanticscience.org/resource/SIO_000800') : Namespace('http://semanticscience.org/resource/SIO_000799') , Namespace('http://semanticscience.org/resource/SIO_000801') : Namespace('http://semanticscience.org/resource/SIO_000800') , Namespace('http://semanticscience.org/resource/SIO_000802') : Namespace('http://semanticscience.org/resource/SIO_000800') , Namespace('http://semanticscience.org/resource/SIO_000803') : Namespace('http://semanticscience.org/resource/SIO_000880') , Namespace('http://semanticscience.org/resource/SIO_000804') : Namespace('http://semanticscience.org/resource/SIO_000880') , Namespace('http://semanticscience.org/resource/SIO_000805') : Namespace('http://semanticscience.org/resource/SIO_010442') , Namespace('http://semanticscience.org/resource/SIO_000806') : Namespace('http://semanticscience.org/resource/SIO_010442') , Namespace('http://semanticscience.org/resource/SIO_000807') : Namespace('http://semanticscience.org/resource/SIO_000809') , Namespace('http://semanticscience.org/resource/SIO_000808') : Namespace('http://semanticscience.org/resource/SIO_000809') , Namespace('http://semanticscience.org/resource/SIO_000809') : Namespace('http://semanticscience.org/resource/SIO_000805') , Namespace('http://semanticscience.org/resource/SIO_000810') : Namespace('http://semanticscience.org/resource/SIO_000805') , Namespace('http://semanticscience.org/resource/SIO_000812') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000813') : Namespace('http://semanticscience.org/resource/SIO_000815') , Namespace('http://semanticscience.org/resource/SIO_000814') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000815') : Namespace('http://semanticscience.org/resource/SIO_000949') , Namespace('http://semanticscience.org/resource/SIO_000816') : Namespace('http://semanticscience.org/resource/SIO_000847') , Namespace('http://semanticscience.org/resource/SIO_000817') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000818') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000819') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000820') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000821') : Namespace('http://semanticscience.org/resource/SIO_000828') , Namespace('http://semanticscience.org/resource/SIO_000822') : Namespace('http://semanticscience.org/resource/SIO_000840') , Namespace('http://semanticscience.org/resource/SIO_000823') : Namespace('http://semanticscience.org/resource/SIO_000825') , Namespace('http://semanticscience.org/resource/SIO_000824') : Namespace('http://semanticscience.org/resource/SIO_000863') , Namespace('http://semanticscience.org/resource/SIO_000825') : Namespace('http://semanticscience.org/resource/SIO_000848') , Namespace('http://semanticscience.org/resource/SIO_000826') : Namespace('http://semanticscience.org/resource/SIO_000863') , Namespace('http://semanticscience.org/resource/SIO_000827') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000828') : Namespace('http://semanticscience.org/resource/SIO_000844') , Namespace('http://semanticscience.org/resource/SIO_000829') : Namespace('http://semanticscience.org/resource/SIO_000837') , Namespace('http://semanticscience.org/resource/SIO_000830') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000831') : Namespace('http://semanticscience.org/resource/SIO_000276') , Namespace('http://semanticscience.org/resource/SIO_000832') : Namespace('http://semanticscience.org/resource/SIO_000276') , Namespace('http://semanticscience.org/resource/SIO_000833') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000834') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000835') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000836') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000837') : Namespace('http://semanticscience.org/resource/SIO_000949') , Namespace('http://semanticscience.org/resource/SIO_000838') : Namespace('http://semanticscience.org/resource/SIO_000814') , Namespace('http://semanticscience.org/resource/SIO_000839') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000840') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000841') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000842') : Namespace('http://semanticscience.org/resource/SIO_000863') , Namespace('http://semanticscience.org/resource/SIO_000843') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000844') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000845') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000846') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000847') : Namespace('http://semanticscience.org/resource/SIO_000276') , Namespace('http://semanticscience.org/resource/SIO_000848') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000849') : Namespace('http://semanticscience.org/resource/SIO_000834') , Namespace('http://semanticscience.org/resource/SIO_000850') : Namespace('http://semanticscience.org/resource/SIO_000840') , Namespace('http://semanticscience.org/resource/SIO_000851') : Namespace('http://semanticscience.org/resource/SIO_000828') , Namespace('http://semanticscience.org/resource/SIO_000852') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000853') : Namespace('http://semanticscience.org/resource/SIO_000825') , Namespace('http://semanticscience.org/resource/SIO_000854') : Namespace('http://semanticscience.org/resource/SIO_000863') , Namespace('http://semanticscience.org/resource/SIO_000855') : Namespace('http://semanticscience.org/resource/SIO_000837') , Namespace('http://semanticscience.org/resource/SIO_000856') : Namespace('http://semanticscience.org/resource/SIO_000825') , Namespace('http://semanticscience.org/resource/SIO_000857') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000858') : Namespace('http://semanticscience.org/resource/SIO_000840') , Namespace('http://semanticscience.org/resource/SIO_000859') : Namespace('http://semanticscience.org/resource/SIO_000864') , Namespace('http://semanticscience.org/resource/SIO_000860') : Namespace('http://semanticscience.org/resource/SIO_000410') , Namespace('http://semanticscience.org/resource/SIO_000861') : Namespace('http://semanticscience.org/resource/SIO_000873') , Namespace('http://semanticscience.org/resource/SIO_000862') : Namespace('http://semanticscience.org/resource/SIO_000873') , Namespace('http://semanticscience.org/resource/SIO_000863') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000864') : Namespace('http://semanticscience.org/resource/SIO_000822') , Namespace('http://semanticscience.org/resource/SIO_000865') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000866') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000867') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000868') : Namespace('http://semanticscience.org/resource/SIO_000863') , Namespace('http://semanticscience.org/resource/SIO_000869') : Namespace('http://semanticscience.org/resource/SIO_000845') , Namespace('http://semanticscience.org/resource/SIO_000870') : Namespace('http://semanticscience.org/resource/SIO_000831') , Namespace('http://semanticscience.org/resource/SIO_000871') : Namespace('http://semanticscience.org/resource/SIO_000829') , Namespace('http://semanticscience.org/resource/SIO_000872') : Namespace('http://semanticscience.org/resource/SIO_000870') , Namespace('http://semanticscience.org/resource/SIO_000873') : Namespace('http://semanticscience.org/resource/SIO_000949') , Namespace('http://semanticscience.org/resource/SIO_000875') : Namespace('http://semanticscience.org/resource/SIO_000711') , Namespace('http://semanticscience.org/resource/SIO_000876') : Namespace('http://semanticscience.org/resource/SIO_000711') , Namespace('http://semanticscience.org/resource/SIO_000877') : Namespace('http://semanticscience.org/resource/SIO_000876') , Namespace('http://semanticscience.org/resource/SIO_000878') : Namespace('http://semanticscience.org/resource/SIO_000876') , Namespace('http://semanticscience.org/resource/SIO_000879') : Namespace('http://semanticscience.org/resource/SIO_000889') , Namespace('http://semanticscience.org/resource/SIO_000880') : Namespace('http://semanticscience.org/resource/SIO_000889') , Namespace('http://semanticscience.org/resource/SIO_000881') : Namespace('http://semanticscience.org/resource/SIO_000677') , Namespace('http://semanticscience.org/resource/SIO_000882') : Namespace('http://semanticscience.org/resource/SIO_000888') , Namespace('http://semanticscience.org/resource/SIO_000883') : Namespace('http://semanticscience.org/resource/SIO_000881') , Namespace('http://semanticscience.org/resource/SIO_000884') : Namespace('http://semanticscience.org/resource/SIO_000706') , Namespace('http://semanticscience.org/resource/SIO_000885') : Namespace('http://semanticscience.org/resource/SIO_000884') , Namespace('http://semanticscience.org/resource/SIO_000886') : Namespace('http://semanticscience.org/resource/SIO_000884') , Namespace('http://semanticscience.org/resource/SIO_000890') : Namespace('http://semanticscience.org/resource/SIO_000891') , Namespace('http://semanticscience.org/resource/SIO_000891') : Namespace('http://semanticscience.org/resource/SIO_000888') , Namespace('http://semanticscience.org/resource/SIO_000894') : Namespace('http://semanticscience.org/resource/SIO_000692') , Namespace('http://semanticscience.org/resource/SIO_000895') : Namespace('http://semanticscience.org/resource/SIO_000894') , Namespace('http://semanticscience.org/resource/SIO_000896') : Namespace('http://semanticscience.org/resource/SIO_000879') , Namespace('http://semanticscience.org/resource/SIO_000898') : Namespace('http://semanticscience.org/resource/SIO_000897') , Namespace('http://semanticscience.org/resource/SIO_000899') : Namespace('http://semanticscience.org/resource/SIO_010506') , Namespace('http://semanticscience.org/resource/SIO_000902') : Namespace('http://semanticscience.org/resource/SIO_000458') , Namespace('http://semanticscience.org/resource/SIO_000903') : Namespace('http://semanticscience.org/resource/SIO_000458') , Namespace('http://semanticscience.org/resource/SIO_000904') : Namespace('http://semanticscience.org/resource/SIO_000080') , Namespace('http://semanticscience.org/resource/SIO_000906') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000907') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000908') : Namespace('http://semanticscience.org/resource/SIO_000934') , Namespace('http://semanticscience.org/resource/SIO_000909') : Namespace('http://semanticscience.org/resource/SIO_000447') , Namespace('http://semanticscience.org/resource/SIO_000910') : Namespace('http://semanticscience.org/resource/SIO_000907') , Namespace('http://semanticscience.org/resource/SIO_000911') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000912') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_000913') : Namespace('http://semanticscience.org/resource/SIO_000912') , Namespace('http://semanticscience.org/resource/SIO_000914') : Namespace('http://semanticscience.org/resource/SIO_000912') , Namespace('http://semanticscience.org/resource/SIO_000920') : Namespace('http://semanticscience.org/resource/SIO_000367') , Namespace('http://semanticscience.org/resource/SIO_000921') : Namespace('http://semanticscience.org/resource/SIO_000367') , Namespace('http://semanticscience.org/resource/SIO_000922') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000923') : Namespace('http://semanticscience.org/resource/SIO_000898') , Namespace('http://semanticscience.org/resource/SIO_000924') : Namespace('http://semanticscience.org/resource/SIO_000612') , Namespace('http://semanticscience.org/resource/SIO_000926') : Namespace('http://semanticscience.org/resource/SIO_000957') , Namespace('http://semanticscience.org/resource/SIO_000927') : Namespace('http://semanticscience.org/resource/SIO_000957') , Namespace('http://semanticscience.org/resource/SIO_000928') : Namespace('http://semanticscience.org/resource/SIO_000956') , Namespace('http://semanticscience.org/resource/SIO_000929') : Namespace('http://semanticscience.org/resource/SIO_000940') , Namespace('http://semanticscience.org/resource/SIO_000930') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000931') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000932') : Namespace('http://semanticscience.org/resource/SIO_000911') , Namespace('http://semanticscience.org/resource/SIO_000933') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000934') : Namespace('http://semanticscience.org/resource/SIO_000083') , Namespace('http://semanticscience.org/resource/SIO_000935') : Namespace('http://semanticscience.org/resource/SIO_000940') , Namespace('http://semanticscience.org/resource/SIO_000936') : Namespace('http://semanticscience.org/resource/SIO_000937') , Namespace('http://semanticscience.org/resource/SIO_000937') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000938') : Namespace('http://semanticscience.org/resource/SIO_000937') , Namespace('http://semanticscience.org/resource/SIO_000939') : Namespace('http://semanticscience.org/resource/SIO_000937') , Namespace('http://semanticscience.org/resource/SIO_000940') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000941') : Namespace('http://semanticscience.org/resource/SIO_000969') , Namespace('http://semanticscience.org/resource/SIO_000942') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_000943') : Namespace('http://semanticscience.org/resource/SIO_000788') , Namespace('http://semanticscience.org/resource/SIO_000944') : Namespace('http://semanticscience.org/resource/SIO_000075') , Namespace('http://semanticscience.org/resource/SIO_000945') : Namespace('http://semanticscience.org/resource/SIO_000931') , Namespace('http://semanticscience.org/resource/SIO_000946') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000947') : Namespace('http://semanticscience.org/resource/SIO_000904') , Namespace('http://semanticscience.org/resource/SIO_000948') : Namespace('http://semanticscience.org/resource/SIO_000945') , Namespace('http://semanticscience.org/resource/SIO_000949') : Namespace('http://semanticscience.org/resource/SIO_000832') , Namespace('http://semanticscience.org/resource/SIO_000950') : Namespace('http://semanticscience.org/resource/SIO_000828') , Namespace('http://semanticscience.org/resource/SIO_000951') : Namespace('http://semanticscience.org/resource/SIO_000845') , Namespace('http://semanticscience.org/resource/SIO_000952') : Namespace('http://semanticscience.org/resource/SIO_000144') , Namespace('http://semanticscience.org/resource/SIO_000953') : Namespace('http://semanticscience.org/resource/SIO_000788') , Namespace('http://semanticscience.org/resource/SIO_000954') : Namespace('http://semanticscience.org/resource/SIO_010058') , Namespace('http://semanticscience.org/resource/SIO_000955') : Namespace('http://semanticscience.org/resource/SIO_000414') , Namespace('http://semanticscience.org/resource/SIO_000956') : Namespace('http://semanticscience.org/resource/SIO_010462') , Namespace('http://semanticscience.org/resource/SIO_000957') : Namespace('http://semanticscience.org/resource/SIO_000956') , Namespace('http://semanticscience.org/resource/SIO_000959') : Namespace('http://semanticscience.org/resource/SIO_000005') , Namespace('http://semanticscience.org/resource/SIO_000960') : Namespace('http://semanticscience.org/resource/SIO_000959') , Namespace('http://semanticscience.org/resource/SIO_000961') : Namespace('http://semanticscience.org/resource/SIO_000959') , Namespace('http://semanticscience.org/resource/SIO_000962') : Namespace('http://semanticscience.org/resource/SIO_000959') , Namespace('http://semanticscience.org/resource/SIO_000963') : Namespace('http://semanticscience.org/resource/SIO_000033') , Namespace('http://semanticscience.org/resource/SIO_000964') : Namespace('http://semanticscience.org/resource/SIO_001043') , Namespace('http://semanticscience.org/resource/SIO_000965') : Namespace('http://semanticscience.org/resource/SIO_000436') , Namespace('http://semanticscience.org/resource/SIO_000966') : Namespace('http://semanticscience.org/resource/SIO_000965') , Namespace('http://semanticscience.org/resource/SIO_000967') : Namespace('http://semanticscience.org/resource/SIO_000965') , Namespace('http://semanticscience.org/resource/SIO_000969') : Namespace('http://semanticscience.org/resource/SIO_000593') , Namespace('http://semanticscience.org/resource/SIO_000977') : Namespace('http://semanticscience.org/resource/SIO_000786') , Namespace('http://semanticscience.org/resource/SIO_000978') : Namespace('http://semanticscience.org/resource/SIO_000786') , Namespace('http://semanticscience.org/resource/SIO_000979') : Namespace('http://semanticscience.org/resource/SIO_000786') , Namespace('http://semanticscience.org/resource/SIO_000980') : Namespace('http://semanticscience.org/resource/SIO_000104') , Namespace('http://semanticscience.org/resource/SIO_000981') : Namespace('http://semanticscience.org/resource/SIO_000104') , Namespace('http://semanticscience.org/resource/SIO_000982') : Namespace('http://semanticscience.org/resource/SIO_000104') , Namespace('http://semanticscience.org/resource/SIO_000984') : Namespace('http://semanticscience.org/resource/SIO_010046') , Namespace('http://semanticscience.org/resource/SIO_000985') : Namespace('http://semanticscience.org/resource/SIO_010035') , Namespace('http://semanticscience.org/resource/SIO_000986') : Namespace('http://semanticscience.org/resource/SIO_010035') , Namespace('http://semanticscience.org/resource/SIO_000988') : Namespace('http://semanticscience.org/resource/SIO_010335') , Namespace('http://semanticscience.org/resource/SIO_000989') : Namespace('http://semanticscience.org/resource/SIO_000030') , Namespace('http://semanticscience.org/resource/SIO_000992') : Namespace('http://semanticscience.org/resource/SIO_000959') , Namespace('http://semanticscience.org/resource/SIO_000994') : Namespace('http://semanticscience.org/resource/SIO_000747') , Namespace('http://semanticscience.org/resource/SIO_000995') : Namespace('http://semanticscience.org/resource/SIO_000033') , Namespace('http://semanticscience.org/resource/SIO_000996') : Namespace('http://semanticscience.org/resource/SIO_000963') , Namespace('http://semanticscience.org/resource/SIO_000997') : Namespace('http://semanticscience.org/resource/SIO_000033') , Namespace('http://semanticscience.org/resource/SIO_001002') : Namespace('http://semanticscience.org/resource/SIO_001024') , Namespace('http://semanticscience.org/resource/SIO_001003') : Namespace('http://semanticscience.org/resource/SIO_001004') , Namespace('http://semanticscience.org/resource/SIO_001008') : Namespace('http://semanticscience.org/resource/SIO_001011') , Namespace('http://semanticscience.org/resource/SIO_001009') : Namespace('http://semanticscience.org/resource/SIO_001008') , Namespace('http://semanticscience.org/resource/SIO_001010') : Namespace('http://semanticscience.org/resource/SIO_001008') , Namespace('http://semanticscience.org/resource/SIO_001011') : Namespace('http://semanticscience.org/resource/SIO_000026') , Namespace('http://semanticscience.org/resource/SIO_001012') : Namespace('http://semanticscience.org/resource/SIO_010058') , Namespace('http://semanticscience.org/resource/SIO_001013') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_001014') : Namespace('http://semanticscience.org/resource/SIO_000475') , Namespace('http://semanticscience.org/resource/SIO_001015') : Namespace('http://semanticscience.org/resource/SIO_000475') , Namespace('http://semanticscience.org/resource/SIO_001016') : Namespace('http://semanticscience.org/resource/SIO_001062') , Namespace('http://semanticscience.org/resource/SIO_001017') : Namespace('http://semanticscience.org/resource/SIO_000136') , Namespace('http://semanticscience.org/resource/SIO_001018') : Namespace('http://semanticscience.org/resource/SIO_000257') , Namespace('http://semanticscience.org/resource/SIO_001019') : Namespace('http://semanticscience.org/resource/SIO_000258') , Namespace('http://semanticscience.org/resource/SIO_001020') : Namespace('http://semanticscience.org/resource/SIO_001019') , Namespace('http://semanticscience.org/resource/SIO_001021') : Namespace('http://semanticscience.org/resource/SIO_000638') , Namespace('http://semanticscience.org/resource/SIO_001022') : Namespace('http://semanticscience.org/resource/SIO_001024') , Namespace('http://semanticscience.org/resource/SIO_001023') : Namespace('http://semanticscience.org/resource/SIO_001024') , Namespace('http://semanticscience.org/resource/SIO_001024') : Namespace('http://semanticscience.org/resource/SIO_000999') , Namespace('http://semanticscience.org/resource/SIO_001025') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_001026') : Namespace('http://semanticscience.org/resource/SIO_000148') , Namespace('http://semanticscience.org/resource/SIO_001027') : Namespace('http://semanticscience.org/resource/SIO_000088') , Namespace('http://semanticscience.org/resource/SIO_001028') : Namespace('http://semanticscience.org/resource/SIO_001026') , Namespace('http://semanticscience.org/resource/SIO_001030') : Namespace('http://semanticscience.org/resource/SIO_000654') , Namespace('http://semanticscience.org/resource/SIO_001031') : Namespace('http://semanticscience.org/resource/SIO_000654') , Namespace('http://semanticscience.org/resource/SIO_001032') : Namespace('http://semanticscience.org/resource/SIO_000654') , Namespace('http://semanticscience.org/resource/SIO_001034') : Namespace('http://semanticscience.org/resource/SIO_001033') , Namespace('http://semanticscience.org/resource/SIO_001035') : Namespace('http://semanticscience.org/resource/SIO_001034') , Namespace('http://semanticscience.org/resource/SIO_001036') : Namespace('http://semanticscience.org/resource/SIO_001033') , Namespace('http://semanticscience.org/resource/SIO_001037') : Namespace('http://semanticscience.org/resource/SIO_001033') , Namespace('http://semanticscience.org/resource/SIO_001038') : Namespace('http://semanticscience.org/resource/SIO_001034') , Namespace('http://semanticscience.org/resource/SIO_001039') : Namespace('http://semanticscience.org/resource/SIO_001033') , Namespace('http://semanticscience.org/resource/SIO_001040') : Namespace('http://semanticscience.org/resource/SIO_000078') , Namespace('http://semanticscience.org/resource/SIO_001042') : Namespace('http://semanticscience.org/resource/SIO_000091') , Namespace('http://semanticscience.org/resource/SIO_001043') : Namespace('http://semanticscience.org/resource/SIO_000091') , Namespace('http://semanticscience.org/resource/SIO_001044') : Namespace('http://semanticscience.org/resource/SIO_010378') , Namespace('http://semanticscience.org/resource/SIO_001045') : Namespace('http://semanticscience.org/resource/SIO_001011') , Namespace('http://semanticscience.org/resource/SIO_001046') : Namespace('http://semanticscience.org/resource/SIO_001045') , Namespace('http://semanticscience.org/resource/SIO_001047') : Namespace('http://semanticscience.org/resource/SIO_001045') , Namespace('http://semanticscience.org/resource/SIO_001048') : Namespace('http://semanticscience.org/resource/SIO_000994') , Namespace('http://semanticscience.org/resource/SIO_001053') : Namespace('http://semanticscience.org/resource/SIO_000683') , Namespace('http://semanticscience.org/resource/SIO_001058') : Namespace('http://semanticscience.org/resource/SIO_001072') , Namespace('http://semanticscience.org/resource/SIO_001059') : Namespace('http://semanticscience.org/resource/SIO_000969') , Namespace('http://semanticscience.org/resource/SIO_001060') : Namespace('http://semanticscience.org/resource/SIO_000963') , Namespace('http://semanticscience.org/resource/SIO_001061') : Namespace('http://semanticscience.org/resource/SIO_000620') , Namespace('http://semanticscience.org/resource/SIO_001062') : Namespace('http://semanticscience.org/resource/SIO_001061') , Namespace('http://semanticscience.org/resource/SIO_001063') : Namespace('http://semanticscience.org/resource/SIO_000620') , Namespace('http://semanticscience.org/resource/SIO_001064') : Namespace('http://semanticscience.org/resource/SIO_000620') , Namespace('http://semanticscience.org/resource/SIO_001065') : Namespace('http://semanticscience.org/resource/SIO_001004') , Namespace('http://semanticscience.org/resource/SIO_001067') : Namespace('http://semanticscience.org/resource/SIO_000976') , Namespace('http://semanticscience.org/resource/SIO_001068') : Namespace('http://semanticscience.org/resource/SIO_000403') , Namespace('http://semanticscience.org/resource/SIO_001069') : Namespace('http://semanticscience.org/resource/SIO_000403') , Namespace('http://semanticscience.org/resource/SIO_001070') : Namespace('http://semanticscience.org/resource/SIO_000367') , Namespace('http://semanticscience.org/resource/SIO_001071') : Namespace('http://semanticscience.org/resource/SIO_000943') , Namespace('http://semanticscience.org/resource/SIO_001072') : Namespace('http://semanticscience.org/resource/SIO_000953') , Namespace('http://semanticscience.org/resource/SIO_001074') : Namespace('http://semanticscience.org/resource/SIO_001018') , Namespace('http://semanticscience.org/resource/SIO_001075') : Namespace('http://semanticscience.org/resource/SIO_000732') , Namespace('http://semanticscience.org/resource/SIO_001076') : Namespace('http://semanticscience.org/resource/SIO_000994') , Namespace('http://semanticscience.org/resource/SIO_001077') : Namespace('http://semanticscience.org/resource/SIO_000258') , Namespace('http://semanticscience.org/resource/SIO_001078') : Namespace('http://semanticscience.org/resource/SIO_001018') , Namespace('http://semanticscience.org/resource/SIO_001079') : Namespace('http://semanticscience.org/resource/SIO_000315') , Namespace('http://semanticscience.org/resource/SIO_001080') : Namespace('http://semanticscience.org/resource/SIO_000616') , Namespace('http://semanticscience.org/resource/SIO_001083') : Namespace('http://semanticscience.org/resource/SIO_000418') , Namespace('http://semanticscience.org/resource/SIO_001084') : Namespace('http://semanticscience.org/resource/SIO_010462') , Namespace('http://semanticscience.org/resource/SIO_001085') : Namespace('http://semanticscience.org/resource/SIO_010340') , Namespace('http://semanticscience.org/resource/SIO_001086') : Namespace('http://semanticscience.org/resource/SIO_010340') , Namespace('http://semanticscience.org/resource/SIO_001087') : Namespace('http://semanticscience.org/resource/SIO_000385') , Namespace('http://semanticscience.org/resource/SIO_001089') : Namespace('http://semanticscience.org/resource/SIO_000257') , Namespace('http://semanticscience.org/resource/SIO_001090') : Namespace('http://semanticscience.org/resource/SIO_000051') , Namespace('http://semanticscience.org/resource/SIO_001091') : Namespace('http://semanticscience.org/resource/SIO_000051') , Namespace('http://semanticscience.org/resource/SIO_001092') : Namespace('http://semanticscience.org/resource/SIO_000026') , Namespace('http://semanticscience.org/resource/SIO_001093') : Namespace('http://semanticscience.org/resource/SIO_001092') , Namespace('http://semanticscience.org/resource/SIO_001094') : Namespace('http://semanticscience.org/resource/SIO_000537') , Namespace('http://semanticscience.org/resource/SIO_001095') : Namespace('http://semanticscience.org/resource/SIO_000537') , Namespace('http://semanticscience.org/resource/SIO_001099') : Namespace('http://semanticscience.org/resource/SIO_000625') , Namespace('http://semanticscience.org/resource/SIO_001100') : Namespace('http://semanticscience.org/resource/SIO_000626') , Namespace('http://semanticscience.org/resource/SIO_001103') : Namespace('http://semanticscience.org/resource/SIO_010366') , Namespace('http://semanticscience.org/resource/SIO_001104') : Namespace('http://semanticscience.org/resource/SIO_010366') , Namespace('http://semanticscience.org/resource/SIO_001105') : Namespace('http://semanticscience.org/resource/SIO_000492') , Namespace('http://semanticscience.org/resource/SIO_001106') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_001107') : Namespace('http://semanticscience.org/resource/SIO_000091') , Namespace('http://semanticscience.org/resource/SIO_001108') : Namespace('http://semanticscience.org/resource/SIO_000052') , Namespace('http://semanticscience.org/resource/SIO_001109') : Namespace('http://semanticscience.org/resource/SIO_001108') , Namespace('http://semanticscience.org/resource/SIO_001110') : Namespace('http://semanticscience.org/resource/SIO_001108') , Namespace('http://semanticscience.org/resource/SIO_001111') : Namespace('http://semanticscience.org/resource/SIO_001108') , Namespace('http://semanticscience.org/resource/SIO_001112') : Namespace('http://semanticscience.org/resource/SIO_000052') , Namespace('http://semanticscience.org/resource/SIO_001115') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_001116') : Namespace('http://semanticscience.org/resource/SIO_000150') , Namespace('http://semanticscience.org/resource/SIO_001117') : Namespace('http://semanticscience.org/resource/SIO_000150') , Namespace('http://semanticscience.org/resource/SIO_001119') : Namespace('http://semanticscience.org/resource/SIO_001122') , Namespace('http://semanticscience.org/resource/SIO_001120') : Namespace('http://semanticscience.org/resource/SIO_000983') , Namespace('http://semanticscience.org/resource/SIO_001121') : Namespace('http://semanticscience.org/resource/SIO_000983') , Namespace('http://semanticscience.org/resource/SIO_001122') : Namespace('http://semanticscience.org/resource/SIO_001121') , Namespace('http://semanticscience.org/resource/SIO_001123') : Namespace('http://semanticscience.org/resource/SIO_001121') , Namespace('http://semanticscience.org/resource/SIO_001124') : Namespace('http://semanticscience.org/resource/SIO_001121') , Namespace('http://semanticscience.org/resource/SIO_001125') : Namespace('http://semanticscience.org/resource/SIO_010287') , Namespace('http://semanticscience.org/resource/SIO_001126') : Namespace('http://semanticscience.org/resource/SIO_010287') , Namespace('http://semanticscience.org/resource/SIO_001127') : Namespace('http://semanticscience.org/resource/SIO_010287') , Namespace('http://semanticscience.org/resource/SIO_001128') : Namespace('http://semanticscience.org/resource/SIO_001127') , Namespace('http://semanticscience.org/resource/SIO_001129') : Namespace('http://semanticscience.org/resource/SIO_001127') , Namespace('http://semanticscience.org/resource/SIO_001130') : Namespace('http://semanticscience.org/resource/SIO_001126') , Namespace('http://semanticscience.org/resource/SIO_001131') : Namespace('http://semanticscience.org/resource/SIO_001126') , Namespace('http://semanticscience.org/resource/SIO_001132') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_001133') : Namespace('http://semanticscience.org/resource/SIO_001135') , Namespace('http://semanticscience.org/resource/SIO_001134') : Namespace('http://semanticscience.org/resource/SIO_001135') , Namespace('http://semanticscience.org/resource/SIO_001135') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_001136') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_001137') : Namespace('http://semanticscience.org/resource/SIO_001136') , Namespace('http://semanticscience.org/resource/SIO_001138') : Namespace('http://semanticscience.org/resource/SIO_001136') , Namespace('http://semanticscience.org/resource/SIO_001139') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_001140') : Namespace('http://semanticscience.org/resource/SIO_001139') , Namespace('http://semanticscience.org/resource/SIO_001141') : Namespace('http://semanticscience.org/resource/SIO_001139') , Namespace('http://semanticscience.org/resource/SIO_001142') : Namespace('http://semanticscience.org/resource/SIO_001139') , Namespace('http://semanticscience.org/resource/SIO_001143') : Namespace('http://semanticscience.org/resource/SIO_001136') , Namespace('http://semanticscience.org/resource/SIO_001144') : Namespace('http://semanticscience.org/resource/SIO_001135') , Namespace('http://semanticscience.org/resource/SIO_001146') : Namespace('http://semanticscience.org/resource/SIO_001151') , Namespace('http://semanticscience.org/resource/SIO_001147') : Namespace('http://semanticscience.org/resource/SIO_001151') , Namespace('http://semanticscience.org/resource/SIO_001148') : Namespace('http://semanticscience.org/resource/SIO_001150') , Namespace('http://semanticscience.org/resource/SIO_001149') : Namespace('http://semanticscience.org/resource/SIO_001150') , Namespace('http://semanticscience.org/resource/SIO_001150') : Namespace('http://semanticscience.org/resource/SIO_001145') , Namespace('http://semanticscience.org/resource/SIO_001151') : Namespace('http://semanticscience.org/resource/SIO_001145') , Namespace('http://semanticscience.org/resource/SIO_001152') : Namespace('http://semanticscience.org/resource/SIO_001151') , Namespace('http://semanticscience.org/resource/SIO_001153') : Namespace('http://semanticscience.org/resource/SIO_001150') , Namespace('http://semanticscience.org/resource/SIO_001160') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_001161') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_001162') : Namespace('http://semanticscience.org/resource/SIO_000794') , Namespace('http://semanticscience.org/resource/SIO_001163') : Namespace('http://semanticscience.org/resource/SIO_001162') , Namespace('http://semanticscience.org/resource/SIO_001164') : Namespace('http://semanticscience.org/resource/SIO_001162') , Namespace('http://semanticscience.org/resource/SIO_001165') : Namespace('http://semanticscience.org/resource/SIO_000602') , Namespace('http://semanticscience.org/resource/SIO_001167') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_001168') : Namespace('http://semanticscience.org/resource/SIO_000612') , Namespace('http://semanticscience.org/resource/SIO_001170') : Namespace('http://semanticscience.org/resource/SIO_000612') , Namespace('http://semanticscience.org/resource/SIO_001171') : Namespace('http://semanticscience.org/resource/SIO_000897') , Namespace('http://semanticscience.org/resource/SIO_001172') : Namespace('http://semanticscience.org/resource/SIO_001171') , Namespace('http://semanticscience.org/resource/SIO_001173') : Namespace('http://semanticscience.org/resource/SIO_001177') , Namespace('http://semanticscience.org/resource/SIO_001174') : Namespace('http://semanticscience.org/resource/SIO_010008') , Namespace('http://semanticscience.org/resource/SIO_001175') : Namespace('http://semanticscience.org/resource/SIO_001174') , Namespace('http://semanticscience.org/resource/SIO_001176') : Namespace('http://semanticscience.org/resource/SIO_001174') , Namespace('http://semanticscience.org/resource/SIO_001177') : Namespace('http://semanticscience.org/resource/SIO_010071') , Namespace('http://semanticscience.org/resource/SIO_001178') : Namespace('http://semanticscience.org/resource/SIO_001177') , Namespace('http://semanticscience.org/resource/SIO_001179') : Namespace('http://semanticscience.org/resource/SIO_000966') , Namespace('http://semanticscience.org/resource/SIO_001180') : Namespace('http://semanticscience.org/resource/SIO_000966') , Namespace('http://semanticscience.org/resource/SIO_001181') : Namespace('http://semanticscience.org/resource/SIO_000967') , Namespace('http://semanticscience.org/resource/SIO_001182') : Namespace('http://semanticscience.org/resource/SIO_000967') , Namespace('http://semanticscience.org/resource/SIO_001183') : Namespace('http://semanticscience.org/resource/SIO_000256') , Namespace('http://semanticscience.org/resource/SIO_001184') : Namespace('http://semanticscience.org/resource/SIO_001018') , Namespace('http://semanticscience.org/resource/SIO_001185') : Namespace('http://semanticscience.org/resource/SIO_000731') , Namespace('http://semanticscience.org/resource/SIO_010000') : Namespace('http://semanticscience.org/resource/SIO_010046') , Namespace('http://semanticscience.org/resource/SIO_010001') : Namespace('http://semanticscience.org/resource/SIO_010046') , Namespace('http://semanticscience.org/resource/SIO_010003') : Namespace('http://semanticscience.org/resource/SIO_010046') , Namespace('http://semanticscience.org/resource/SIO_010004') : Namespace('http://semanticscience.org/resource/SIO_000004') , Namespace('http://semanticscience.org/resource/SIO_010005') : Namespace('http://semanticscience.org/resource/SIO_010020') , Namespace('http://semanticscience.org/resource/SIO_010011') : Namespace('http://semanticscience.org/resource/SIO_010072') , Namespace('http://semanticscience.org/resource/SIO_010014') : Namespace('http://semanticscience.org/resource/SIO_011119') , Namespace('http://semanticscience.org/resource/SIO_010019') : Namespace('http://semanticscience.org/resource/SIO_000472') , Namespace('http://semanticscience.org/resource/SIO_010022') : Namespace('http://semanticscience.org/resource/SIO_011119') , Namespace('http://semanticscience.org/resource/SIO_010023') : Namespace('http://semanticscience.org/resource/SIO_011119') , Namespace('http://semanticscience.org/resource/SIO_010024') : Namespace('http://semanticscience.org/resource/SIO_011119') , Namespace('http://semanticscience.org/resource/SIO_010026') : Namespace('http://semanticscience.org/resource/SIO_010028') , Namespace('http://semanticscience.org/resource/SIO_010028') : Namespace('http://semanticscience.org/resource/SIO_010019') , Namespace('http://semanticscience.org/resource/SIO_010029') : Namespace('http://semanticscience.org/resource/SIO_000475') , Namespace('http://semanticscience.org/resource/SIO_010030') : Namespace('http://semanticscience.org/resource/SIO_010072') , Namespace('http://semanticscience.org/resource/SIO_010031') : Namespace('http://semanticscience.org/resource/SIO_000732') , Namespace('http://semanticscience.org/resource/SIO_010032') : Namespace('http://semanticscience.org/resource/SIO_000729') , Namespace('http://semanticscience.org/resource/SIO_010033') : Namespace('http://semanticscience.org/resource/SIO_010005') , Namespace('http://semanticscience.org/resource/SIO_010034') : Namespace('http://semanticscience.org/resource/SIO_010496') , Namespace('http://semanticscience.org/resource/SIO_010035') : Namespace('http://semanticscience.org/resource/SIO_010335') , Namespace('http://semanticscience.org/resource/SIO_010038') : Namespace('http://semanticscience.org/resource/SIO_011125') , Namespace('http://semanticscience.org/resource/SIO_010039') : Namespace('http://semanticscience.org/resource/SIO_010411') , Namespace('http://semanticscience.org/resource/SIO_010040') : Namespace('http://semanticscience.org/resource/SIO_010049') , Namespace('http://semanticscience.org/resource/SIO_010041') : Namespace('http://semanticscience.org/resource/SIO_010049') , Namespace('http://semanticscience.org/resource/SIO_010042') : Namespace('http://semanticscience.org/resource/SIO_010335') , Namespace('http://semanticscience.org/resource/SIO_010044') : Namespace('http://semanticscience.org/resource/SIO_010004') , Namespace('http://semanticscience.org/resource/SIO_010045') : Namespace('http://semanticscience.org/resource/SIO_010005') , Namespace('http://semanticscience.org/resource/SIO_010046') : Namespace('http://semanticscience.org/resource/SIO_010462') , Namespace('http://semanticscience.org/resource/SIO_010047') : Namespace('http://semanticscience.org/resource/SIO_010020') , Namespace('http://semanticscience.org/resource/SIO_010048') : Namespace('http://semanticscience.org/resource/SIO_010029') , Namespace('http://semanticscience.org/resource/SIO_010049') : Namespace('http://semanticscience.org/resource/SIO_000019') , Namespace('http://semanticscience.org/resource/SIO_010050') : Namespace('http://semanticscience.org/resource/SIO_010040') , Namespace('http://semanticscience.org/resource/SIO_010051') : Namespace('http://semanticscience.org/resource/SIO_010046') , Namespace('http://semanticscience.org/resource/SIO_010052') : Namespace('http://semanticscience.org/resource/SIO_010029') , Namespace('http://semanticscience.org/resource/SIO_010053') : Namespace('http://semanticscience.org/resource/SIO_010028') , Namespace('http://semanticscience.org/resource/SIO_010054') : Namespace('http://semanticscience.org/resource/SIO_010046') , Namespace('http://semanticscience.org/resource/SIO_010056') : Namespace('http://semanticscience.org/resource/SIO_000475') , Namespace('http://semanticscience.org/resource/SIO_010057') : Namespace('http://semanticscience.org/resource/SIO_000475') , Namespace('http://semanticscience.org/resource/SIO_010058') : Namespace('http://semanticscience.org/resource/SIO_010057') , Namespace('http://semanticscience.org/resource/SIO_010059') : Namespace('http://semanticscience.org/resource/SIO_010057') , Namespace('http://semanticscience.org/resource/SIO_010060') : Namespace('http://semanticscience.org/resource/SIO_010053') , Namespace('http://semanticscience.org/resource/SIO_010061') : Namespace('http://semanticscience.org/resource/SIO_010028') , Namespace('http://semanticscience.org/resource/SIO_010064') : Namespace('http://semanticscience.org/resource/SIO_010444') , Namespace('http://semanticscience.org/resource/SIO_010065') : Namespace('http://semanticscience.org/resource/SIO_000472') , Namespace('http://semanticscience.org/resource/SIO_010066') : Namespace('http://semanticscience.org/resource/SIO_010065') , Namespace('http://semanticscience.org/resource/SIO_010067') : Namespace('http://semanticscience.org/resource/SIO_010066') , Namespace('http://semanticscience.org/resource/SIO_010068') : Namespace('http://semanticscience.org/resource/SIO_010066') , Namespace('http://semanticscience.org/resource/SIO_010070') : Namespace('http://semanticscience.org/resource/SIO_010444') , Namespace('http://semanticscience.org/resource/SIO_010074') : Namespace('http://semanticscience.org/resource/SIO_010471') , Namespace('http://semanticscience.org/resource/SIO_010075') : Namespace('http://semanticscience.org/resource/SIO_010335') , Namespace('http://semanticscience.org/resource/SIO_010076') : Namespace('http://semanticscience.org/resource/SIO_010038') , Namespace('http://semanticscience.org/resource/SIO_010077') : Namespace('http://semanticscience.org/resource/SIO_010338') , Namespace('http://semanticscience.org/resource/SIO_010085') : Namespace('http://semanticscience.org/resource/SIO_010444') , Namespace('http://semanticscience.org/resource/SIO_010086') : Namespace('http://semanticscience.org/resource/SIO_010085') , Namespace('http://semanticscience.org/resource/SIO_010087') : Namespace('http://semanticscience.org/resource/SIO_010338') , Namespace('http://semanticscience.org/resource/SIO_010088') : Namespace('http://semanticscience.org/resource/SIO_000542') , Namespace('http://semanticscience.org/resource/SIO_010089') : Namespace('http://semanticscience.org/resource/SIO_010088') , Namespace('http://semanticscience.org/resource/SIO_010090') : Namespace('http://semanticscience.org/resource/SIO_010088') , Namespace('http://semanticscience.org/resource/SIO_010091') : Namespace('http://semanticscience.org/resource/SIO_010088') , Namespace('http://semanticscience.org/resource/SIO_010094') : Namespace('http://semanticscience.org/resource/SIO_000542') , Namespace('http://semanticscience.org/resource/SIO_010099') : Namespace('http://semanticscience.org/resource/SIO_010450') , Namespace('http://semanticscience.org/resource/SIO_010278') : Namespace('http://semanticscience.org/resource/SIO_000476') , Namespace('http://semanticscience.org/resource/SIO_010284') : Namespace('http://semanticscience.org/resource/SIO_000576') , Namespace('http://semanticscience.org/resource/SIO_010287') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_010295') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_010296') : Namespace('http://semanticscience.org/resource/SIO_000609') , Namespace('http://semanticscience.org/resource/SIO_010298') : Namespace('http://semanticscience.org/resource/SIO_010019') , Namespace('http://semanticscience.org/resource/SIO_010307') : Namespace('http://semanticscience.org/resource/SIO_010345') , Namespace('http://semanticscience.org/resource/SIO_010308') : Namespace('http://semanticscience.org/resource/SIO_010013') , Namespace('http://semanticscience.org/resource/SIO_010309') : Namespace('http://semanticscience.org/resource/SIO_010308') , Namespace('http://semanticscience.org/resource/SIO_010310') : Namespace('http://semanticscience.org/resource/SIO_010308') , Namespace('http://semanticscience.org/resource/SIO_010334') : Namespace('http://semanticscience.org/resource/SIO_010071') , Namespace('http://semanticscience.org/resource/SIO_010336') : Namespace('http://semanticscience.org/resource/SIO_010075') , Namespace('http://semanticscience.org/resource/SIO_010337') : Namespace('http://semanticscience.org/resource/SIO_010075') , Namespace('http://semanticscience.org/resource/SIO_010338') : Namespace('http://semanticscience.org/resource/SIO_011125') , Namespace('http://semanticscience.org/resource/SIO_010340') : Namespace('http://semanticscience.org/resource/SIO_000376') , Namespace('http://semanticscience.org/resource/SIO_010344') : Namespace('http://semanticscience.org/resource/SIO_011125') , Namespace('http://semanticscience.org/resource/SIO_010347') : Namespace('http://semanticscience.org/resource/SIO_000343') , Namespace('http://semanticscience.org/resource/SIO_010349') : Namespace('http://semanticscience.org/resource/SIO_000698') , Namespace('http://semanticscience.org/resource/SIO_010351') : Namespace('http://semanticscience.org/resource/SIO_000376') , Namespace('http://semanticscience.org/resource/SIO_010353') : Namespace('http://semanticscience.org/resource/SIO_000494') , Namespace('http://semanticscience.org/resource/SIO_010354') : Namespace('http://semanticscience.org/resource/SIO_010347') , Namespace('http://semanticscience.org/resource/SIO_010355') : Namespace('http://semanticscience.org/resource/SIO_010347') , Namespace('http://semanticscience.org/resource/SIO_010358') : Namespace('http://semanticscience.org/resource/SIO_010360') , Namespace('http://semanticscience.org/resource/SIO_010359') : Namespace('http://semanticscience.org/resource/SIO_010360') , Namespace('http://semanticscience.org/resource/SIO_010360') : Namespace('http://semanticscience.org/resource/SIO_000376') , Namespace('http://semanticscience.org/resource/SIO_010362') : Namespace('http://semanticscience.org/resource/SIO_010423') , Namespace('http://semanticscience.org/resource/SIO_010364') : Namespace('http://semanticscience.org/resource/SIO_000692') , Namespace('http://semanticscience.org/resource/SIO_010365') : Namespace('http://semanticscience.org/resource/SIO_010364') , Namespace('http://semanticscience.org/resource/SIO_010366') : Namespace('http://semanticscience.org/resource/SIO_010364') , Namespace('http://semanticscience.org/resource/SIO_010367') : Namespace('http://semanticscience.org/resource/SIO_010364') , Namespace('http://semanticscience.org/resource/SIO_010368') : Namespace('http://semanticscience.org/resource/SIO_000692') , Namespace('http://semanticscience.org/resource/SIO_010369') : Namespace('http://semanticscience.org/resource/SIO_010364') , Namespace('http://semanticscience.org/resource/SIO_010370') : Namespace('http://semanticscience.org/resource/SIO_010369') , Namespace('http://semanticscience.org/resource/SIO_010371') : Namespace('http://semanticscience.org/resource/SIO_010369') , Namespace('http://semanticscience.org/resource/SIO_010372') : Namespace('http://semanticscience.org/resource/SIO_010374') , Namespace('http://semanticscience.org/resource/SIO_010373') : Namespace('http://semanticscience.org/resource/SIO_010374') , Namespace('http://semanticscience.org/resource/SIO_010374') : Namespace('http://semanticscience.org/resource/SIO_010364') , Namespace('http://semanticscience.org/resource/SIO_010377') : Namespace('http://semanticscience.org/resource/SIO_010000') , Namespace('http://semanticscience.org/resource/SIO_010378') : Namespace('http://semanticscience.org/resource/SIO_010000') , Namespace('http://semanticscience.org/resource/SIO_010379') : Namespace('http://semanticscience.org/resource/SIO_010378') , Namespace('http://semanticscience.org/resource/SIO_010383') : Namespace('http://semanticscience.org/resource/SIO_000619') , Namespace('http://semanticscience.org/resource/SIO_010411') : Namespace('http://semanticscience.org/resource/SIO_010462') , Namespace('http://semanticscience.org/resource/SIO_010412') : Namespace('http://semanticscience.org/resource/SIO_001050') , Namespace('http://semanticscience.org/resource/SIO_010414') : Namespace('http://semanticscience.org/resource/SIO_010000') , Namespace('http://semanticscience.org/resource/SIO_010415') : Namespace('http://semanticscience.org/resource/SIO_010000') , Namespace('http://semanticscience.org/resource/SIO_010416') : Namespace('http://semanticscience.org/resource/SIO_010427') , Namespace('http://semanticscience.org/resource/SIO_010417') : Namespace('http://semanticscience.org/resource/SIO_010427') , Namespace('http://semanticscience.org/resource/SIO_010418') : Namespace('http://semanticscience.org/resource/SIO_010427') , Namespace('http://semanticscience.org/resource/SIO_010419') : Namespace('http://semanticscience.org/resource/SIO_011125') , Namespace('http://semanticscience.org/resource/SIO_010420') : Namespace('http://semanticscience.org/resource/SIO_010437') , Namespace('http://semanticscience.org/resource/SIO_010424') : Namespace('http://semanticscience.org/resource/SIO_010426') , Namespace('http://semanticscience.org/resource/SIO_010425') : Namespace('http://semanticscience.org/resource/SIO_010426') , Namespace('http://semanticscience.org/resource/SIO_010426') : Namespace('http://semanticscience.org/resource/SIO_011126') , Namespace('http://semanticscience.org/resource/SIO_010427') : Namespace('http://semanticscience.org/resource/SIO_010462') , Namespace('http://semanticscience.org/resource/SIO_010428') : Namespace('http://semanticscience.org/resource/SIO_000881') , Namespace('http://semanticscience.org/resource/SIO_010429') : Namespace('http://semanticscience.org/resource/SIO_010462') , Namespace('http://semanticscience.org/resource/SIO_010430') : Namespace('http://semanticscience.org/resource/SIO_010428') , Namespace('http://semanticscience.org/resource/SIO_010431') : Namespace('http://semanticscience.org/resource/SIO_010428') , Namespace('http://semanticscience.org/resource/SIO_010433') : Namespace('http://semanticscience.org/resource/SIO_010033') , Namespace('http://semanticscience.org/resource/SIO_010434') : Namespace('http://semanticscience.org/resource/SIO_010436') , Namespace('http://semanticscience.org/resource/SIO_010435') : Namespace('http://semanticscience.org/resource/SIO_010436') , Namespace('http://semanticscience.org/resource/SIO_010437') : Namespace('http://semanticscience.org/resource/SIO_011125') , Namespace('http://semanticscience.org/resource/SIO_010438') : Namespace('http://semanticscience.org/resource/SIO_010437') , Namespace('http://semanticscience.org/resource/SIO_010439') : Namespace('http://semanticscience.org/resource/SIO_010437') , Namespace('http://semanticscience.org/resource/SIO_010440') : Namespace('http://semanticscience.org/resource/SIO_010439') , Namespace('http://semanticscience.org/resource/SIO_010442') : Namespace('http://semanticscience.org/resource/SIO_001011') , Namespace('http://semanticscience.org/resource/SIO_010445') : Namespace('http://semanticscience.org/resource/SIO_010444') , Namespace('http://semanticscience.org/resource/SIO_010446') : Namespace('http://semanticscience.org/resource/SIO_010085') , Namespace('http://semanticscience.org/resource/SIO_010447') : Namespace('http://semanticscience.org/resource/SIO_010444') , Namespace('http://semanticscience.org/resource/SIO_010448') : Namespace('http://semanticscience.org/resource/SIO_010444') , Namespace('http://semanticscience.org/resource/SIO_010451') : Namespace('http://semanticscience.org/resource/SIO_010095') , Namespace('http://semanticscience.org/resource/SIO_010452') : Namespace('http://semanticscience.org/resource/SIO_010049') , Namespace('http://semanticscience.org/resource/SIO_010453') : Namespace('http://semanticscience.org/resource/SIO_010427') , Namespace('http://semanticscience.org/resource/SIO_010454') : Namespace('http://semanticscience.org/resource/SIO_010427') , Namespace('http://semanticscience.org/resource/SIO_010456') : Namespace('http://semanticscience.org/resource/SIO_010410') , Namespace('http://semanticscience.org/resource/SIO_010461') : Namespace('http://semanticscience.org/resource/SIO_000810') , Namespace('http://semanticscience.org/resource/SIO_010462') : Namespace('http://semanticscience.org/resource/SIO_011126') , Namespace('http://semanticscience.org/resource/SIO_010463') : Namespace('http://semanticscience.org/resource/SIO_011126') , Namespace('http://semanticscience.org/resource/SIO_010464') : Namespace('http://semanticscience.org/resource/SIO_000810') , Namespace('http://semanticscience.org/resource/SIO_010465') : Namespace('http://semanticscience.org/resource/SIO_010497') , Namespace('http://semanticscience.org/resource/SIO_010468') : Namespace('http://semanticscience.org/resource/SIO_010471') , Namespace('http://semanticscience.org/resource/SIO_010469') : Namespace('http://semanticscience.org/resource/SIO_010471') , Namespace('http://semanticscience.org/resource/SIO_010471') : Namespace('http://semanticscience.org/resource/SIO_010071') , Namespace('http://semanticscience.org/resource/SIO_010496') : Namespace('http://semanticscience.org/resource/SIO_010005') , Namespace('http://semanticscience.org/resource/SIO_010498') : Namespace('http://semanticscience.org/resource/SIO_011118') , Namespace('http://semanticscience.org/resource/SIO_010499') : Namespace('http://semanticscience.org/resource/SIO_011118') , Namespace('http://semanticscience.org/resource/SIO_010500') : Namespace('http://semanticscience.org/resource/SIO_011118') , Namespace('http://semanticscience.org/resource/SIO_010501') : Namespace('http://semanticscience.org/resource/SIO_011118') , Namespace('http://semanticscience.org/resource/SIO_010502') : Namespace('http://semanticscience.org/resource/SIO_010498') , Namespace('http://semanticscience.org/resource/SIO_010503') : Namespace('http://semanticscience.org/resource/SIO_010005') , Namespace('http://semanticscience.org/resource/SIO_010504') : Namespace('http://semanticscience.org/resource/SIO_010005') , Namespace('http://semanticscience.org/resource/SIO_010505') : Namespace('http://semanticscience.org/resource/SIO_010005') , Namespace('http://semanticscience.org/resource/SIO_010507') : Namespace('http://semanticscience.org/resource/SIO_010345') , Namespace('http://semanticscience.org/resource/SIO_010510') : Namespace('http://semanticscience.org/resource/SIO_010345') , Namespace('http://semanticscience.org/resource/SIO_010511') : Namespace('http://semanticscience.org/resource/SIO_010510') , Namespace('http://semanticscience.org/resource/SIO_010512') : Namespace('http://semanticscience.org/resource/SIO_010510') , Namespace('http://semanticscience.org/resource/SIO_010513') : Namespace('http://semanticscience.org/resource/SIO_010512') , Namespace('http://semanticscience.org/resource/SIO_010514') : Namespace('http://semanticscience.org/resource/SIO_010512') , Namespace('http://semanticscience.org/resource/SIO_010515') : Namespace('http://semanticscience.org/resource/SIO_010510') , Namespace('http://semanticscience.org/resource/SIO_010516') : Namespace('http://semanticscience.org/resource/SIO_010345') , Namespace('http://semanticscience.org/resource/SIO_010517') : Namespace('http://semanticscience.org/resource/SIO_010345') , Namespace('http://semanticscience.org/resource/SIO_010518') : Namespace('http://semanticscience.org/resource/SIO_010516') , Namespace('http://semanticscience.org/resource/SIO_010519') : Namespace('http://semanticscience.org/resource/SIO_010518') , Namespace('http://semanticscience.org/resource/SIO_010520') : Namespace('http://semanticscience.org/resource/SIO_010518') , Namespace('http://semanticscience.org/resource/SIO_010521') : Namespace('http://semanticscience.org/resource/SIO_010520') , Namespace('http://semanticscience.org/resource/SIO_010522') : Namespace('http://semanticscience.org/resource/SIO_010519') , Namespace('http://semanticscience.org/resource/SIO_010523') : Namespace('http://semanticscience.org/resource/SIO_010519') , Namespace('http://semanticscience.org/resource/SIO_010525') : Namespace('http://semanticscience.org/resource/SIO_010526') , Namespace('http://semanticscience.org/resource/SIO_010527') : Namespace('http://semanticscience.org/resource/SIO_010526') , Namespace('http://semanticscience.org/resource/SIO_010528') : Namespace('http://semanticscience.org/resource/SIO_010526') , Namespace('http://semanticscience.org/resource/SIO_010530') : Namespace('http://semanticscience.org/resource/SIO_010023') , Namespace('http://semanticscience.org/resource/SIO_010531') : Namespace('http://semanticscience.org/resource/SIO_010065') , Namespace('http://semanticscience.org/resource/SIO_010532') : Namespace('http://semanticscience.org/resource/SIO_010525') , Namespace('http://semanticscience.org/resource/SIO_010533') : Namespace('http://semanticscience.org/resource/SIO_010525') , Namespace('http://semanticscience.org/resource/SIO_010673') : Namespace('http://semanticscience.org/resource/SIO_010298') , Namespace('http://semanticscience.org/resource/SIO_010775') : Namespace('http://semanticscience.org/resource/SIO_010455') , Namespace('http://semanticscience.org/resource/SIO_010776') : Namespace('http://semanticscience.org/resource/SIO_010775') , Namespace('http://semanticscience.org/resource/SIO_010777') : Namespace('http://semanticscience.org/resource/SIO_010775') , Namespace('http://semanticscience.org/resource/SIO_010778') : Namespace('http://semanticscience.org/resource/SIO_010775') , Namespace('http://semanticscience.org/resource/SIO_010779') : Namespace('http://semanticscience.org/resource/SIO_010455') , Namespace('http://semanticscience.org/resource/SIO_010781') : Namespace('http://semanticscience.org/resource/SIO_010780') , Namespace('http://semanticscience.org/resource/SIO_010782') : Namespace('http://semanticscience.org/resource/SIO_010780') , Namespace('http://semanticscience.org/resource/SIO_010783') : Namespace('http://semanticscience.org/resource/SIO_010780') , Namespace('http://semanticscience.org/resource/SIO_010785') : Namespace('http://semanticscience.org/resource/SIO_010037') , Namespace('http://semanticscience.org/resource/SIO_010787') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010788') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010789') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010790') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010791') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010792') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010793') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010794') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_010795') : Namespace('http://semanticscience.org/resource/SIO_010786') , Namespace('http://semanticscience.org/resource/SIO_011000') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011001') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011002') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011003') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011004') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011005') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011006') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011007') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011008') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011009') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011010') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011011') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011012') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011013') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011014') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011015') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011016') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011017') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011018') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011019') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011020') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011021') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011022') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011023') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011024') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011025') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011026') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011027') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011028') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011029') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011030') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011031') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011032') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011033') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011034') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011035') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011036') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011037') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011038') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011039') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011040') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011041') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011042') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011043') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011044') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011045') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011046') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011047') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011048') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011049') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011050') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011051') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011052') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011053') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011054') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011055') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011056') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011057') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011058') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011059') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011060') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011061') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011062') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011063') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011064') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011065') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011066') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011067') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011068') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011069') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011070') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011071') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011072') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011073') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011074') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011075') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011076') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011077') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011078') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011079') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011080') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011081') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011082') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011083') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011084') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011085') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011086') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011087') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011088') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011089') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011090') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011091') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011092') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011093') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011094') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011095') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011096') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011097') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011098') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011099') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011100') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011101') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011102') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011103') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011104') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011105') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011106') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011107') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011108') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011109') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011110') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011111') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011112') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011113') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011114') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011115') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011116') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011117') : Namespace('http://semanticscience.org/resource/SIO_010044') , Namespace('http://semanticscience.org/resource/SIO_011123') : Namespace('http://semanticscience.org/resource/SIO_000472') , Namespace('http://semanticscience.org/resource/SIO_011126') : Namespace('http://semanticscience.org/resource/SIO_010004') , Namespace('http://semanticscience.org/resource/SIO_011130') : Namespace('http://semanticscience.org/resource/SIO_011120') }


