module BioInterchange

class SIO

    # has attribute is a relation between an entity and some attribute or property.
    def self.has_attribute
      RDF::URI.new('http://semanticscience.org/resource/SIO_000008')
    end

    # is attribute of is a relation between an attribute and the entity that it is ascribed to
    def self.is_attribute_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000011')
    end

    # denotes is a relation between an entity and what it is a sign or indication of, or what specifically means.
    def self.denotes
      RDF::URI.new('http://semanticscience.org/resource/SIO_000020')
    end

    def self.is_time_boundary_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000029')
    end

    # has boundary is a mereological relation between a whole and boundary located at its periphery.
    def self.has_boundary
      RDF::URI.new('http://semanticscience.org/resource/SIO_000054')
    end

    def self.is_denoted_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000060')
    end

    # is participant in is a relation that describes the participation of the subject in the (processual) object.
    def self.is_participant_in
      RDF::URI.new('http://semanticscience.org/resource/SIO_000062')
    end

    # is agent in is a relation between an entity and a process, where the entity is present throughout the process, no permanent material change occurs, and is a causal participant in the process.
    def self.is_agent_in
      RDF::URI.new('http://semanticscience.org/resource/SIO_000063')
    end

    # is provider of is a relation between a source and the entity it makes available.
    def self.is_provider_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000064')
    end

    # is provided by is a relation between an entity and the entity that provides it.
    def self.has_provider
      RDF::URI.new('http://semanticscience.org/resource/SIO_000066')
    end

    # is member of is a mereological relation between a item and a collection.
    def self.is_member_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000095')
    end

    # is boundary of is a mereological relation between a boudnary located at the periphery of a whole.
    def self.is_boundary_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000096')
    end

    # has participant is a relation that describes the participation of the object in the (processual) subject.
    def self.has_participant
      RDF::URI.new('http://semanticscience.org/resource/SIO_000132')
    end

    # has agent is a relation between a process and an entity, where the entity is present throughout the process and is a causal participant in the process.
    def self.has_agent
      RDF::URI.new('http://semanticscience.org/resource/SIO_000139')
    end

    # is represented by: a relation between an entity and some symbol.
    def self.is_represented_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000205')
    end

    # has supporting evidence is a relation between an assertion (i.e. subject-predicate-object; axiom) and something that supports the truth of the assertion.
    def self.has_supporting_evidence
      RDF::URI.new('http://semanticscience.org/resource/SIO_000206')
    end

    # has disputing evidence is a relation between an assertion (i.e. subject-predicate-object; axiom) and something that disputes (does not directly support) the truth of the assertion.
    def self.has_disputing_evidence
      RDF::URI.new('http://semanticscience.org/resource/SIO_000207')
    end

    def self.is_supported_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000208')
    end

    def self.is_disputed_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000209')
    end

    # a represents b when a serves as a sign, symbol or model of b.
    def self.represents
      RDF::URI.new('http://semanticscience.org/resource/SIO_000210')
    end

    # A is referred to by B iff B is an informational entity that makes reference to A.
    def self.is_referred_to_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000212')
    end

    # A has concretization B iff A is an informational entity and B is the a quality of some material entity.
    def self.has_concretization
      RDF::URI.new('http://semanticscience.org/resource/SIO_000213')
    end

    # A is concretization of B iff A is a quality of a material entity and B is an informational entity.
    def self.is_concretization_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000214')
    end

    # is measurement value of is a relation between a value and the entity that it is a measurement of.
    def self.is_measurement_value_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000215')
    end

    # has measurement value is a relation between a quality/realizable and a measurement value.
    def self.has_measurement_value
      RDF::URI.new('http://semanticscience.org/resource/SIO_000216')
    end

    # is quality of is a relation between a quality and the entity that it is a property of.
    def self.is_quality_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000218')
    end

    # is source of is a relation between a source of information about some entity.
    def self.is_source_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000219')
    end

    # is unit of is a relation between a unit and a quantity that it is a multiple of.
    def self.is_unit_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000222')
    end

    # has output is a relation between an process and an entity, where the entity is present at the end of the process.
    def self.has_output
      RDF::URI.new('http://semanticscience.org/resource/SIO_000229')
    end

    # has input is a relation between a process and an entity, where the entity is present at the beginning of the process.
    def self.has_input
      RDF::URI.new('http://semanticscience.org/resource/SIO_000230')
    end

    # is input in is a relation between an entity and a process, where the entity is present at the beginning of the process.
    def self.is_input_in
      RDF::URI.new('http://semanticscience.org/resource/SIO_000231')
    end

    # is output of is a relation between an entity and a process, where the entity is present at the end of the process.
    def self.is_output_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000232')
    end

    # is implementation of is a relation between an information entity and a specification that it conforms to.
    def self.is_implementation_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000233')
    end

    # has implementation is a relation between a specification and an implementation that conforms to it.
    def self.has_implementation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000234')
    end

    # A non-transitive temporal relation in which one entity immediately derives into a non-identical entity such that there are no intermediate entities between them.
    def self.immediately_derives_into
      RDF::URI.new('http://semanticscience.org/resource/SIO_000246')
    end

    # A non-transitive temporal relation in which one entity immediately derives from a non-identical entity such that there are no intermediate entities between them.
    def self.immediately_derives_from
      RDF::URI.new('http://semanticscience.org/resource/SIO_000247')
    end

    # A non-transitive temporal relation in which one process immediately precedes another process, such that there is no interval of time between the two processes.
    def self.immediately_precedes
      RDF::URI.new('http://semanticscience.org/resource/SIO_000250')
    end

    # A non-transitive temporal relation in which one process is immediately preceded by another process, such that there is no interval of time between the two processes.
    def self.is_immediately_preceded_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000251')
    end

    # is reference for is a relation between a document that provides information about an entity.
    def self.is_referenced_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000252')
    end

    # has source is a relation between an entity and some source of information.
    def self.has_source
      RDF::URI.new('http://semanticscience.org/resource/SIO_000253')
    end

    # is annotation of is a relation between some textual entity and the entity that it annotates.
    def self.is_annotation_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000254')
    end

    # has annotation is a relation between an entity and some textual anntotation.
    def self.has_annotation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000255')
    end

    # has direct part is a relation to specify a part at a particular level of granularity
    def self.has_direct_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_000273')
    end

    # A is prior version of B iff A is a variant of B and B derives from A.
    def self.is_prior_version_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000274')
    end

    # cites is a relation to refer to by way of example, authority or proof.
    def self.cites
      RDF::URI.new('http://semanticscience.org/resource/SIO_000277')
    end

    # is cited by is a relation from an object that is referred to by way of example, authority or proof.
    def self.is_cited_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000278')
    end

    # A is subsequent version of B iff A is a variant of B and A derives from B.
    def self.is_subsequent_version_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000286')
    end

    # has target is a relation between a process and an entity, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
    def self.has_target
      RDF::URI.new('http://semanticscience.org/resource/SIO_000291')
    end

    # is target in is a relation between an entity and a process, where the entity is present at the beginning  of the process and undergoes a change or transformation in the process.
    def self.is_target_in
      RDF::URI.new('http://semanticscience.org/resource/SIO_000292')
    end

    # a is causally related to b iff there is a causal chain of events from a to b
    def self.is_causally_related_to
      RDF::URI.new('http://semanticscience.org/resource/SIO_000294')
    end

    # is direct part of is a relation between a specific part (at some level of granularity) and its whole.
    def self.is_direct_part_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000310')
    end

    # is product of is a relation between an entity and a process, where the entity is present at the end  of the process as a result of a transformation in the process target.
    def self.is_product_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000311')
    end

    # has product is a relation between an process and an entity, where a new entity exists at the end of the process.
    def self.has_product
      RDF::URI.new('http://semanticscience.org/resource/SIO_000312')
    end

    # is component part of is a relation between a component and a whole, where the component is instrinsic to the whole, and loss of the part would change the kind that the whole is.
    def self.is_component_part_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000313')
    end

    # A 'is surrounded by' B iff the A 'is contained by' B and A 'is adjacent to' B or A 'is directly connected to' B.
    def self.is_surrounded_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000323')
    end

    # A 'surrounds' B iff the A 'contains' B and A 'is adjacent to' B or A 'is directly connected to' B.
    def self.surrounds
      RDF::URI.new('http://semanticscience.org/resource/SIO_000324')
    end

    # is about is a relation between an information content entity and the entity that its primary subject.
    def self.is_about
      RDF::URI.new('http://semanticscience.org/resource/SIO_000332')
    end

    # A relation between an information content entity and a product that it (directly/indirectly) specifies
    def self.specifies
      RDF::URI.new('http://semanticscience.org/resource/SIO_000338')
    end

    # a relation between a product and the information content entity that specifies it.
    def self.is_specified_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000339')
    end

    # is manifested as is a relation between an expression and its manifestations.
    def self.is_manifested_as
      RDF::URI.new('http://semanticscience.org/resource/SIO_000341')
    end

    # a is causally related from b iff there is a causal chain of events from b to a
    def self.is_causally_related_from
      RDF::URI.new('http://semanticscience.org/resource/SIO_000352')
    end

    # realizes is a relation between a process and a realizable entity (role, function, disposition).
    def self.realizes
      RDF::URI.new('http://semanticscience.org/resource/SIO_000355')
    end

    def self.is_realized_in
      RDF::URI.new('http://semanticscience.org/resource/SIO_000356')
    end

    # satisfies is a relation between an entity and the specification or objective that it conforms to.
    def self.satisfies
      RDF::URI.new('http://semanticscience.org/resource/SIO_000362')
    end

    def self.is_satisfied_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000363')
    end

    # has creator is a relation between an entity and that which created it.
    def self.has_creator
      RDF::URI.new('http://semanticscience.org/resource/SIO_000364')
    end

    # is created by is a relation between an entity and its creator.
    def self.is_created_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000365')
    end

    # has component part is a relation between a whole and a component part where the component is instrinsic to the whole, and loss of the part would change the kind that it is.
    def self.has_component_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_000369')
    end

    def self.has_expression
      RDF::URI.new('http://semanticscience.org/resource/SIO_000420')
    end

    # is expression of is a relation between more concrete expression of some conceptualization.
    def self.is_expression_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000421')
    end

    # A is generically related with B iff A is an abstract entity or an information content entity and B is a information content entity or a physical entity, respectively.
    def self.is_generically_related_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000425')
    end

    def self.is_manifestation_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000426')
    end

    # A is narrower than B iff the meaning of term A is narrower in scope than the meaning of term B
    def self.is_narrower_than
      RDF::URI.new('http://semanticscience.org/resource/SIO_000427')
    end

    def self.is_broader_than
      RDF::URI.new('http://semanticscience.org/resource/SIO_000477')
    end

    # has parameter is a relation between a process and an information content entity which modulates the behaviour of some participant.
    def self.has_parameter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000552')
    end

    # is parameter in is a relation between a data item and some data transformation process.
    def self.is_parameter_in
      RDF::URI.new('http://semanticscience.org/resource/SIO_000553')
    end

    def self.is_described_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000557')
    end

    # describes is a relation between one entity and another entity that it provides a description (detailed account of).
    def self.describes
      RDF::URI.new('http://semanticscience.org/resource/SIO_000563')
    end

    # refers to is a relation between one entity and the entity that it makes reference to.
    def self.refers_to
      RDF::URI.new('http://semanticscience.org/resource/SIO_000628')
    end

    def self.is_subject_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000629')
    end

    # references is a relation between one entity and the entity that it makes reference to by name, but is not described by it.
    def self.references
      RDF::URI.new('http://semanticscience.org/resource/SIO_000631')
    end

    # is model of is a relation between a model (an artifact) and the entity it purports to represent.
    def self.is_model_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000632')
    end

    def self.is_modelled_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000633')
    end

    # has trigger is a relation between a realizable and the factor that causes it to be realized.
    def self.has_trigger
      RDF::URI.new('http://semanticscience.org/resource/SIO_000635')
    end

    def self.is_trigger_for
      RDF::URI.new('http://semanticscience.org/resource/SIO_000636')
    end

    # has basis is a relation between a realizable entity and the quality that forms the basis for it.
    def self.has_basis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000641')
    end

    # is base for is a relation between a quality and the realizable entity that it is the basis for.
    def self.is_base_for
      RDF::URI.new('http://semanticscience.org/resource/SIO_000642')
    end

    # A  temporal relation in which an entity mainstains identity from one state to another.
    def self.immediately_transforms_into
      RDF::URI.new('http://semanticscience.org/resource/SIO_000656')
    end

    # A  temporal relation in which an entity mainstains identity from one state to another.
    def self.immediately_transforms_from
      RDF::URI.new('http://semanticscience.org/resource/SIO_000658')
    end

    # in relation to is a comparative relation to indicate that the instance of the class holding the relation exists in relation to another entity.
    def self.in_relation_to
      RDF::URI.new('http://semanticscience.org/resource/SIO_000668')
    end

    def self.has_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000671')
    end

    def self.is_identifier_for
      RDF::URI.new('http://semanticscience.org/resource/SIO_000672')
    end

    def self.is_start_time_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000682')
    end

    def self.is_end_time_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000684')
    end

    # exists at is a relation between an entity and a time measurement.
    def self.exists_at
      RDF::URI.new('http://semanticscience.org/resource/SIO_000687')
    end

    def self.is_greater_than_or_equal_to
      RDF::URI.new('http://semanticscience.org/resource/SIO_000699')
    end

    def self.is_lesser_than_or_equal_to
      RDF::URI.new('http://semanticscience.org/resource/SIO_000733')
    end

    def self.is_greater_than
      RDF::URI.new('http://semanticscience.org/resource/SIO_000734')
    end

    def self.is_lesser_than
      RDF::URI.new('http://semanticscience.org/resource/SIO_000735')
    end

    # has evidence is a relation between an assertion (i.e. subject-predicate-object; axiom) and something that demonstrates the truth of the assertion.
    def self.has_evidence
      RDF::URI.new('http://semanticscience.org/resource/SIO_000772')
    end

    def self.is_evidenced_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000773')
    end

    # has evidence is a relation between an assertion (i.e. subject-predicate-object; axiom) and something that refutes (is incompatible with) the truth of the assertion.
    def self.has_refuting_evidence
      RDF::URI.new('http://semanticscience.org/resource/SIO_000774')
    end

    def self.is_refuted_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_000775')
    end

    # measured at is a relation between a measurement value and the time measurement.
    def self.measured_at
      RDF::URI.new('http://semanticscience.org/resource/SIO_000793')
    end

    def self.in_relation_from
      RDF::URI.new('http://semanticscience.org/resource/SIO_000892')
    end

    # has frequency is a relation that specifies the occurence of an object or event
    def self.has_frequency
      RDF::URI.new('http://semanticscience.org/resource/SIO_000900')
    end

    # is frequency of is a relation between a temporal unit and an object or event
    def self.is_frequency_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000901')
    end

    # has substrate is a relation between a process and an object where the object is destroyed by its participation in the process.
    def self.has_substrate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000905')
    end

    # is first part of is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
    def self.is_first_part_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000970')
    end

    # has first part is a proper part relation in which the part is the first of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
    def self.has_first_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_000971')
    end

    # has last part is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
    def self.has_last_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_000972')
    end

    # is last part of is a proper part relation in which the part is the last of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
    def self.is_last_part_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000973')
    end

    # has ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
    def self.has_ordered_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_000974')
    end

    # is ordered part of is a proper part relation in which the part is one of a set of linearly ordered parts resulting from the projection of the whole on a linear coordinate system.
    def self.is_ordered_part_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000975')
    end

    # A relation between an biological information content entity and a product that it (directly/indirectly) encodes.
    def self.encodes
      RDF::URI.new('http://semanticscience.org/resource/SIO_010078')
    end

    def self.is_encoded_by
      RDF::URI.new('http://semanticscience.org/resource/SIO_010079')
    end

    # a relation between two information content entities in which one is transcribed into (an exact or similar kind) another through some process.
    def self.is_transcribed_into
      RDF::URI.new('http://semanticscience.org/resource/SIO_010080')
    end

    def self.is_transcribed_from
      RDF::URI.new('http://semanticscience.org/resource/SIO_010081')
    end

    def self.is_translated_into
      RDF::URI.new('http://semanticscience.org/resource/SIO_010082')
    end

    def self.is_translated_from
      RDF::URI.new('http://semanticscience.org/resource/SIO_010083')
    end

    # Everything is an entity.
    def self.entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000000')
    end

    # A material entity is a physical entity that is spatially extended, exists as a whole at any point in time and has mass.
    def self.material_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000004')
    end

    # A quality is an attribute that is intrinsically associated with its bearer (or its parts), but whose presence/absence and observed/measured value may vary.
    def self.quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000005')
    end

    # A process is an entity that is identifiable only through the unfolding of time, and unless otherwise specified/predicted, cannot be identified from any instant of time in which it exists.
    def self.process
      RDF::URI.new('http://semanticscience.org/resource/SIO_000006')
    end

    def self.social_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000009')
    end

    # A social structure is a social entity which consists of relationships between two or more entities.
    def self.social_structure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000010')
    end

    # An organization is a social structure with a complex articulation of tasks, roles and responsibilities.
    def self.organization
      RDF::URI.new('http://semanticscience.org/resource/SIO_000012')
    end

    def self.geographic_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000013')
    end

    # A disposition is the tendency of a capability to be exhibited under certain conditions or in response to a certain stimulus (trigger)
    def self.disposition
      RDF::URI.new('http://semanticscience.org/resource/SIO_000014')
    end

    # information content entity is an abstract entity which has a physical manifestation and whose symbols were encoded using some procedure.
    def self.information_content_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000015')
    end

    # A role is a realizable entity that describes behaviours, rights and obligations of an entity in some particular circumstance.
    def self.role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000016')
    end

    # A function is a capability that satisfies some agentive objective, or (evolutionary) optimization.
    def self.function
      RDF::URI.new('http://semanticscience.org/resource/SIO_000017')
    end

    # A site is a spatial region bounded (in part or in whole) by material entities and may be occupied by material entities.
    def self.site
      RDF::URI.new('http://semanticscience.org/resource/SIO_000019')
    end

    # A material boundary is the boundary of a material entity which exists as a lower dimensional entity at exactly the location where its parts no longer extend into space. Every material entity has a boundary, and a boundary is the boundary of exactly 1 material entity.
    def self.material_boundary
      RDF::URI.new('http://semanticscience.org/resource/SIO_000022')
    end

    # An object quality is quality of an object.
    def self.object_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000026')
    end

    # A process quality is quality that is associated with a process.
    def self.process_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000027')
    end

    # A sequence is a primary structure descriptor in which each of the letters in the string represents a monomeric unit (residue) in which adjacent letters represent the connectivity between the monomeric units.
    def self.biopolymer_sequence
      RDF::URI.new('http://semanticscience.org/resource/SIO_000030')
    end

    def self.start_date
      RDF::URI.new('http://semanticscience.org/resource/SIO_000031')
    end

    def self.end_date
      RDF::URI.new('http://semanticscience.org/resource/SIO_000032')
    end

    # process stative quality is a process quality that describes the status of a process.
    def self.process_stative_property
      RDF::URI.new('http://semanticscience.org/resource/SIO_000033')
    end

    # completed is that status of a process that successfully unfolds.
    def self.completed
      RDF::URI.new('http://semanticscience.org/resource/SIO_000034')
    end

    # ongoing is the status of a process that is not yet complete.
    def self.ongoing
      RDF::URI.new('http://semanticscience.org/resource/SIO_000035')
    end

    # predicted is the quality of an entity that has not been shown to exist but there is a claim of potential existence.
    def self.predicted
      RDF::URI.new('http://semanticscience.org/resource/SIO_000036')
    end

    def self.physical_dimensional_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000037')
    end

    def self.a_D_extent_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000038')
    end

    def self.depth
      RDF::URI.new('http://semanticscience.org/resource/SIO_000039')
    end

    def self.height
      RDF::URI.new('http://semanticscience.org/resource/SIO_000040')
    end

    def self.length
      RDF::URI.new('http://semanticscience.org/resource/SIO_000041')
    end

    def self.width
      RDF::URI.new('http://semanticscience.org/resource/SIO_000042')
    end

    def self.thickness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000043')
    end

    def self.a_D_extent_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000044')
    end

    def self.area
      RDF::URI.new('http://semanticscience.org/resource/SIO_000045')
    end

    def self.perimeter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000046')
    end

    def self.circumference
      RDF::URI.new('http://semanticscience.org/resource/SIO_000047')
    end

    def self.a_D_extent_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000048')
    end

    def self.volume
      RDF::URI.new('http://semanticscience.org/resource/SIO_000049')
    end

    # composition is the quality of having anatomical parts.
    def self.composition
      RDF::URI.new('http://semanticscience.org/resource/SIO_000051')
    end

    # A quantity is an informational entity that gives the magnitude of a property.
    def self.quantity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000052')
    end

    # shape is the quality of a bearer that relates to its spatial extent.
    def self.shape
      RDF::URI.new('http://semanticscience.org/resource/SIO_000055')
    end

    def self.position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000056')
    end

    def self.orientation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000057')
    end

    # A namespace is an informational entity that defines a logical container for a set of symbols or identifiers.
    def self.namespace
      RDF::URI.new('http://semanticscience.org/resource/SIO_000067')
    end

    # a data item consists of information that has been collected/generated towards some purpose.
    def self.data_item
      RDF::URI.new('http://semanticscience.org/resource/SIO_000069')
    end

    # A measurement value is a quantitative description that reflects the magnitude of some attribute.
    def self.measurement_value
      RDF::URI.new('http://semanticscience.org/resource/SIO_000070')
    end

    # A coordinate is a measurement of position in n-dimensional space.
    def self.coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000071')
    end

    # A Cartesian coordinate is the signed distance of a point to some referent line.
    def self.cartesian_coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000072')
    end

    def self.polar_coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000073')
    end

    # A unit of measurement is a definite magnitude of a physical quantity, defined and adopted by convention and/or by law, that is used as a standard for measurement of the same physical quantity.
    def self.unit_of_measurement
      RDF::URI.new('http://semanticscience.org/resource/SIO_000074')
    end

    def self.mathematical_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000075')
    end

    # a plan is a set of intended actions, through which one expects to achieve a goal.
    def self.plan
      RDF::URI.new('http://semanticscience.org/resource/SIO_000076')
    end

    # A generic name is the preferred name provided by manufacturer
    def self.generic_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000077')
    end

    # A language entity implements some language specification for the visual interpretation and is part of some document.
    def self.language_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000078')
    end

    # A visual medium is an informational entity with an n-dimensional  manifestation.
    def self.visual_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000079')
    end

    # A figure is a graphical entity which consists of a visual (n-dimentional) arrangement of information entities.
    def self.figure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000080')
    end

    # An image is an affine projection of a visual entity to a two dimensional surface.
    def self.image
      RDF::URI.new('http://semanticscience.org/resource/SIO_000081')
    end

    # A photograph is an image created by light falling on a light-sensitive surface.
    def self.photograph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000082')
    end

    # A statistical graph is a figure that displays the relationship among numeric data and/or mathematical functions.
    def self.statistical_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000083')
    end

    # A question is a linguistic expression used to make a request for information.
    def self.question
      RDF::URI.new('http://semanticscience.org/resource/SIO_000085')
    end

    # A publication is a document that has been placed in the public domain.
    def self.publication
      RDF::URI.new('http://semanticscience.org/resource/SIO_000087')
    end

    # A record is a collection of statements about some entity for which changes may occur.
    def self.record
      RDF::URI.new('http://semanticscience.org/resource/SIO_000088')
    end

    # A dataset is a data item that is a collection of data items.
    def self.data_set
      RDF::URI.new('http://semanticscience.org/resource/SIO_000089')
    end

    # A specification is a description of the essential technical attributes/requirements for a product or procedure, and may be used to determine that the product / procedure meets its requirements/attributes.
    def self.specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000090')
    end

    # An effective specification is a specification composed of a sequence of instructions to achieve some objective.
    def self.effective_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000091')
    end

    # A biopolymer is an organic polymer using biological components.
    def self.biopolymer
      RDF::URI.new('http://semanticscience.org/resource/SIO_000092')
    end

    # An algorithm is an effective method expressed as a finite list of well-defined instructions for calculating a function.
    def self.algorithm
      RDF::URI.new('http://semanticscience.org/resource/SIO_000094')
    end

    # a software entity is a computational entity that can be interpreted by or directly executed by a processing unit.
    def self.software_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000097')
    end

    # A software method (also called subroutine, subprogram, procedure, method, function, or routine) is software designed to execute a specific task
    def self.software_method
      RDF::URI.new('http://semanticscience.org/resource/SIO_000098')
    end

    # A software module is software composed of a collection of software methods.
    def self.software_module
      RDF::URI.new('http://semanticscience.org/resource/SIO_000099')
    end

    # A software library is software composed of a collection of software modules and/or software methods in a form that can be statically or dynamically linked to some software application.
    def self.software_library
      RDF::URI.new('http://semanticscience.org/resource/SIO_000100')
    end

    # A software application is software that can be directly executed by some processing unit.
    def self.software_application
      RDF::URI.new('http://semanticscience.org/resource/SIO_000101')
    end

    # A software interpreter is a software application that executes some specified input software.
    def self.software_interpreter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000102')
    end

    # A software script is software whose instructions can be executed using a software interpreter.
    def self.software_script
      RDF::URI.new('http://semanticscience.org/resource/SIO_000103')
    end

    # Language is an agentive entity for encoding and decoding information through systematic creation and usage of systems of symbols, each pairing a specific sign with an intended meaning, established through social conventions
    def self.language
      RDF::URI.new('http://semanticscience.org/resource/SIO_000104')
    end

    # A symbol is a proposition about what an entity represents.
    def self.symbol
      RDF::URI.new('http://semanticscience.org/resource/SIO_000105')
    end

    # A book is a publication composed of a large number of entries.
    def self.book
      RDF::URI.new('http://semanticscience.org/resource/SIO_000106')
    end

    # A chapter is a document section of a book or thesis.
    def self.chapter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000107')
    end

    # A character is a language symbol used to construct words.
    def self.character
      RDF::URI.new('http://semanticscience.org/resource/SIO_000108')
    end

    def self.novel
      RDF::URI.new('http://semanticscience.org/resource/SIO_000109')
    end

    # A paragraph is a self-contained unit of written discourse consisting of one or more sentences.
    def self.paragraph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000110')
    end

    def self.document_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000111')
    end

    # A capability is a realizable entity whose basis lies in one or more parts or qualities and reflects possility of an entity to act in a specified way under certain conditions or in response to a certain stimulus (trigger).
    def self.capability
      RDF::URI.new('http://semanticscience.org/resource/SIO_000112')
    end

    # A sentence is a grammatical unit consisting of one or more words that bear minimal syntactic relation to the words that precede or follow it
    def self.sentence
      RDF::URI.new('http://semanticscience.org/resource/SIO_000113')
    end

    # A word is the smallest free form (an item that may be uttered in isolation with semantic or pragmatic content) in a language.
    def self.word
      RDF::URI.new('http://semanticscience.org/resource/SIO_000114')
    end

    # An identifier is a label that specifically refers to (identifies) an entity (instance/type).
    def self.identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000115')
    end

    def self.name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000116')
    end

    # a preferred name is the name that is generally used by some organization. 
    def self.preferred_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000117')
    end

    # a common name is a name that is commonly used.
    def self.common_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000118')
    end

    # a brand name is a trademarked and marketed name of a product.
    def self.brand_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000119')
    end

    # a scientific name is a name given through scientific nomenclature.
    def self.scientific_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000120')
    end

    # A magazine is a periodical that typically contains essays, stories, poems, etc., by many writers, and often photographs and drawings, frequently specializing in a particular subject or area, as hobbies, news, or sports.
    def self.magazine
      RDF::URI.new('http://semanticscience.org/resource/SIO_000121')
    end

    # A synonym is a word with the same or very similar meanings.
    def self.synonym
      RDF::URI.new('http://semanticscience.org/resource/SIO_000122')
    end

    # An antonym is a word with opposite or nearly opposite meaning.
    def self.antonym
      RDF::URI.new('http://semanticscience.org/resource/SIO_000123')
    end

    # A hypernym is a term with a broader meaning.
    def self.hypernym
      RDF::URI.new('http://semanticscience.org/resource/SIO_000124')
    end

    # A hyponym is a term with a narrower meaning.
    def self.hyponym
      RDF::URI.new('http://semanticscience.org/resource/SIO_000125')
    end

    # A homonym is a word that sounds the same but has different meaning.
    def self.homonym
      RDF::URI.new('http://semanticscience.org/resource/SIO_000126')
    end

    # A workflow is an algorithm that is is a depiction of a sequence of operations to achieve one or more objectives.
    def self.workflow
      RDF::URI.new('http://semanticscience.org/resource/SIO_000127')
    end

    def self.ontology_document
      RDF::URI.new('http://semanticscience.org/resource/SIO_000129')
    end

    # A pattern is a generalized representation of some repeatable concrete or informational item.
    def self.pattern
      RDF::URI.new('http://semanticscience.org/resource/SIO_000130')
    end

    def self.motif
      RDF::URI.new('http://semanticscience.org/resource/SIO_000131')
    end

    # A descriptor (index term, subject term, subject heading) is a term that captures the essence of the topic of a document.
    def self.descriptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_000133')
    end

    # A definition is a description that specifies the meaning of a term.
    def self.definition
      RDF::URI.new('http://semanticscience.org/resource/SIO_000135')
    end

    # a description is an information content entity in which elements of a language (formal or natural) are used to describe an entity or a type of entity.
    def self.description
      RDF::URI.new('http://semanticscience.org/resource/SIO_000136')
    end

    # a category is a class of entities having particular shared characteristics.
    def self.category
      RDF::URI.new('http://semanticscience.org/resource/SIO_000137')
    end

    # A class is a collection of sets which can be unambiguously defined by a property that all its members share.
    def self.class
      RDF::URI.new('http://semanticscience.org/resource/SIO_000138')
    end

    # A web service is a software application that can be accessed over a network, such as the Internet, and executed on a remote system hosting the requested services.
    def self.web_service
      RDF::URI.new('http://semanticscience.org/resource/SIO_000140')
    end

    # A criterion is a specification to describe properties used for evaluation.
    def self.criterion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000141')
    end

    # An inclusion criterion is a criterion that must be present to satisfy some objective.
    def self.inclusion_criterion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000142')
    end

    # An exclusion criterion is a criterion that must be absent to satistify the objective.
    def self.exclusion_criterion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000143')
    end

    # A parameter is variable whose value changes the characteristics of a system or a function.
    def self.parameter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000144')
    end

    # A monomer is a submolecule that is proper part of some polymer, and is a building block for such polymer.
    def self.monomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_000146')
    end

    # A keyword is a descriptor in which the association of the word with the entity facilitates information retrieval.
    def self.keyword
      RDF::URI.new('http://semanticscience.org/resource/SIO_000147')
    end

    # A document is a bounded physical or digital representation of a body of information designed with the capacity (and usually intent) to communicate.
    def self.document
      RDF::URI.new('http://semanticscience.org/resource/SIO_000148')
    end

    # a list is any enumeration of a set of items.
    def self.list
      RDF::URI.new('http://semanticscience.org/resource/SIO_000150')
    end

    # A manuscript is a document prior to publication.
    def self.manuscript
      RDF::URI.new('http://semanticscience.org/resource/SIO_000151')
    end

    # A note is a brief document.
    def self.note
      RDF::URI.new('http://semanticscience.org/resource/SIO_000152')
    end

    # A patent is a document that has been accepted by a patent issuing authority.
    def self.patent
      RDF::URI.new('http://semanticscience.org/resource/SIO_000153')
    end

    # An article is a publication that is stand-alone section of a larger work.
    def self.article
      RDF::URI.new('http://semanticscience.org/resource/SIO_000154')
    end

    # A blog is a publication accessible at some website and is typically about various experiences.
    def self.blog
      RDF::URI.new('http://semanticscience.org/resource/SIO_000155')
    end

    # A book volume is a book that is part of a collection.
    def self.book_volume
      RDF::URI.new('http://semanticscience.org/resource/SIO_000156')
    end

    # A conference proceedings is a book composed of papers presented at a conference.
    def self.conference_proceedings
      RDF::URI.new('http://semanticscience.org/resource/SIO_000157')
    end

    # A book series is a collection of books that have been sequentially published.
    def self.book_series
      RDF::URI.new('http://semanticscience.org/resource/SIO_000158')
    end

    # An edited publication is a publication that has been examined and potentially changed by an editor.
    def self.edited_publication
      RDF::URI.new('http://semanticscience.org/resource/SIO_000159')
    end

    # A journal is a a peer-reviewed periodical in which scholarship relating to a particular academic discipline is published.
    def self.journal
      RDF::URI.new('http://semanticscience.org/resource/SIO_000160')
    end

    # A manual is a document that instructs on the usage of a device.
    def self.manual
      RDF::URI.new('http://semanticscience.org/resource/SIO_000161')
    end

    # A periodical is a publication that appears on a regular schedule.
    def self.periodical
      RDF::URI.new('http://semanticscience.org/resource/SIO_000162')
    end

    def self.newspaper
      RDF::URI.new('http://semanticscience.org/resource/SIO_000163')
    end

    # A technical report is a publication published by a school or other institution, usually numbered within a series.
    def self.technical_report
      RDF::URI.new('http://semanticscience.org/resource/SIO_000164')
    end

    # A tehsis document is the written research component of a post-secondary institution  that contains a statement supported by arguments.
    def self.thesis_document
      RDF::URI.new('http://semanticscience.org/resource/SIO_000165')
    end

    # An honor's thesis is a thesis prepared as a requirement for an honor's undergraduate degree.
    def self.honor_s_thesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000166')
    end

    # A Master's thesis is a thesis prepared as a requirement for a Master's degree.
    def self.master_s_thesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000167')
    end

    # A PhD thesis is a thesis prepared as a requirement for a doctoral degree.
    def self.phd_thesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000168')
    end

    # A booklet is a document that lacks a named publisher or sponsoring institution.
    def self.booklet
      RDF::URI.new('http://semanticscience.org/resource/SIO_000169')
    end

    # A diary is a document which describes day-to-day experiences.
    def self.diary
      RDF::URI.new('http://semanticscience.org/resource/SIO_000170')
    end

    # A bibliographic attribute is an attribute related to publications.
    def self.document_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_000171')
    end

    # An address is a position that indicates the physical location of some entity using a social convention.
    def self.address
      RDF::URI.new('http://semanticscience.org/resource/SIO_000172')
    end

    # An affiliation is a social structure which indicates the partnership between two or more entities.
    def self.affiliation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000173')
    end

    # A citation is a textual entity which denotes a source described in the bibliography or reference section of a document.
    def self.citation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000174')
    end

    # A document title is a  textual entity that summarizes the topic of the document in one sentence.
    def self.document_title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000175')
    end

    # A reference is a textual entity that describes a single source used in the preparation or development of the work.
    def self.reference
      RDF::URI.new('http://semanticscience.org/resource/SIO_000176')
    end

    # A page range denotes the start and end page in some document.
    def self.page_range
      RDF::URI.new('http://semanticscience.org/resource/SIO_000177')
    end

    # A page total is a textual entity that is about the number of pages in some informational entity.
    def self.page_total
      RDF::URI.new('http://semanticscience.org/resource/SIO_000178')
    end

    # a label is a term that is associated with some entity
    def self.label
      RDF::URI.new('http://semanticscience.org/resource/SIO_000179')
    end

    # A language label is a label that denotes the language of a textual entity.
    def self.language_label
      RDF::URI.new('http://semanticscience.org/resource/SIO_000180')
    end

    # A first name is a name that denotes a specific individual between members of a group of individuals, whose members usually share the same surname.
    def self.first_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000181')
    end

    # A last name (surname) is a name added to a given name and is part of a personal name and is often the family name.
    def self.last_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000182')
    end

    # A personal name is a name to identify an individual person and usually comprises of a first name and a last name.
    def self.personal_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000183')
    end

    # A legal name is a name given at birth, or which appears on their birth certificate, marriage certificate, or change of name certificate.
    def self.legal_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000184')
    end

    # A title is a textual entity that summarily describes some entity.
    def self.title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000185')
    end

    # A document version denotes the ordinal position of a work in some sequence of derivative works.
    def self.document_version
      RDF::URI.new('http://semanticscience.org/resource/SIO_000186')
    end

    # An edition is a version of a literary work edited and published, as by a certain editor or in a certain manner including being printed during some interval of time.
    def self.edition
      RDF::URI.new('http://semanticscience.org/resource/SIO_000187')
    end

    # An abstract section is a document section that provides brief summary of a document that explains the main argument(s), topic(s) or findings.
    def self.abstract_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000188')
    end

    # An acknowledgements section is a document section that identifies individuals, groups or organizations for their support in the development of the work.
    def self.acknowledgements_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000189')
    end

    # An author contribution section is a document section that describes the contribution of the authors.
    def self.author_contribution_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000190')
    end

    # An author section is a document section that lists the contributing authors.
    def self.author_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000191')
    end

    # A bibliography section is a document section that is composed of a list of references used in the development of the work.
    def self.bibliography_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000192')
    end

    # A copyright section is a document section that contains a notice of copyright.
    def self.copyright_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000193')
    end

    # A correspondence section is a document section that contains the details for contacting the corresponding author.
    def self.correspondence_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000194')
    end

    # The discussion section is a document section containing a summary of the findings, a reflection on the significance of findings, comparison with related work, among others.
    def self.discussion_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000195')
    end

    # An introduction section is a document section that generally provides background, motivation and goals of the work.
    def self.introduction_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000196')
    end

    # The materials and methods section is a document section containing a description of the materials and methods used in the study.
    def self.materials_and_methods_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000197')
    end

    # The materials section is a document section containing a description of the materials used in the study.
    def self.materials_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000198')
    end

    # The methods section is a document section containing a description of the methods used in the study.
    def self.methods_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000199')
    end

    # The results section is a document section describing the main findings of the study.
    def self.results_section
      RDF::URI.new('http://semanticscience.org/resource/SIO_000200')
    end

    # The table of contents is a document section that lists all sections (and optionally subsections) in a sequential order along with their page number.
    def self.table_of_contents
      RDF::URI.new('http://semanticscience.org/resource/SIO_000201')
    end

    # implication is a logical operator that holds between a set T of propositions and a proposition B, when every model (or interpretation or valuation) of T is also a model of B.
    def self.implies
      RDF::URI.new('http://semanticscience.org/resource/SIO_000220')
    end

    # A namespace label is a short name for a namespace.
    def self.namespace_label
      RDF::URI.new('http://semanticscience.org/resource/SIO_000237')
    end

    def self.logical_operator
      RDF::URI.new('http://semanticscience.org/resource/SIO_000238')
    end

    # AND is a logical operator that has the value true if both of its operands are true, otherwise a value of false.
    def self.conjunction_and
      RDF::URI.new('http://semanticscience.org/resource/SIO_000239')
    end

    # A proposition is a sentence expressing something true or false.
    def self.proposition
      RDF::URI.new('http://semanticscience.org/resource/SIO_000256')
    end

    # A dimensionless quantity is a quantity that has no associated unit.
    def self.dimensionless_quantity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000257')
    end

    # A dimensional quantity is a quantity that has an associated unit.
    def self.dimensional_quantity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000258')
    end

    # An argument is a set of one or more declarative sentences (or propositions) known as the premises along with another declarative sentence (or proposition) known as the conclusion.
    def self.argument
      RDF::URI.new('http://semanticscience.org/resource/SIO_000259')
    end

    # A premise is a proposition of an argument from which the conclusion is drawn.
    def self.premise
      RDF::URI.new('http://semanticscience.org/resource/SIO_000261')
    end

    # A conclusion is a proposition which is reached after considering the evidence, arguments or premises.
    def self.conclusion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000262')
    end

    # A deductive argument is an argument that asserts that the truth of the conclusion is a logical consequence of the premises.
    def self.deductive_argument
      RDF::URI.new('http://semanticscience.org/resource/SIO_000263')
    end

    # An inductive argument is an argument that asserts that the truth of the conclusion is supported by the premises.
    def self.inductive_argument
      RDF::URI.new('http://semanticscience.org/resource/SIO_000264')
    end

    # A sound argument is a valid argument with true premises.
    def self.sound_argument
      RDF::URI.new('http://semanticscience.org/resource/SIO_000265')
    end

    # A valid argument is an argument where the truth of the conclusion is a logical consequence of the premises and (consequently) its corresponding conditional is a necessary truth.
    def self.valid_argument
      RDF::URI.new('http://semanticscience.org/resource/SIO_000266')
    end

    # An invalid argument is an argument where the truth of the conclusion is false because it is not a logical consequence of the premises.
    def self.invalid_argument
      RDF::URI.new('http://semanticscience.org/resource/SIO_000267')
    end

    # truth value is a quality of information that is claimed/verified to be true or false.
    def self.truth_value
      RDF::URI.new('http://semanticscience.org/resource/SIO_000268')
    end

    def self.true
      RDF::URI.new('http://semanticscience.org/resource/SIO_000269')
    end

    def self.false
      RDF::URI.new('http://semanticscience.org/resource/SIO_000270')
    end

    # A term is a word or phrase used to denote one or more entities.
    def self.term
      RDF::URI.new('http://semanticscience.org/resource/SIO_000275')
    end

    # An emotion is an agentive entity that an individual experiences due to an internal state of being or an involuntary physiological response.
    def self.emotion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000276')
    end

    # mass is the quality of the amount of substance.
    def self.mass
      RDF::URI.new('http://semanticscience.org/resource/SIO_000279')
    end

    def self.disjunction_or
      RDF::URI.new('http://semanticscience.org/resource/SIO_000280')
    end

    # NOT is a logical operator in that has the value true if its operand is false.
    def self.negation_not
      RDF::URI.new('http://semanticscience.org/resource/SIO_000281')
    end

    # XOR, also called exclusive disjunction or (symbolized XOR, EOR, EXOR, or ⊕), is a type of logical disjunction on two operands that results in a value of true if exactly one of the operands has a value of true.
    def self.exclusive_disjunction_xor
      RDF::URI.new('http://semanticscience.org/resource/SIO_000282')
    end

    # a hypothesis is a proposed explanation for a phenomenon.
    def self.hypothesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000284')
    end

    def self.academic_organization
      RDF::URI.new('http://semanticscience.org/resource/SIO_000285')
    end

    def self.social_relation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000287')
    end

    # a set is a collection of entities, for which there may be zero members.
    def self.set
      RDF::URI.new('http://semanticscience.org/resource/SIO_000289')
    end

    def self.university
      RDF::URI.new('http://semanticscience.org/resource/SIO_000290')
    end

    def self.collection_of_documents
      RDF::URI.new('http://semanticscience.org/resource/SIO_000295')
    end

    # A website is a collection of documents published on the World Wide Web.
    def self.website
      RDF::URI.new('http://semanticscience.org/resource/SIO_000296')
    end

    # A movie is a series of images that are displayed in rapid succession  to give the impression of movement.
    def self.movie
      RDF::URI.new('http://semanticscience.org/resource/SIO_000297')
    end

    # An excerpt is a contiguous or discontiguous portion of a document.
    def self.excerpt
      RDF::URI.new('http://semanticscience.org/resource/SIO_000298')
    end

    # A quote is a excerpt that is attributed to a particular source.
    def self.quote
      RDF::URI.new('http://semanticscience.org/resource/SIO_000299')
    end

    # A map is an image that depicts relationships between elements represented in that space.
    def self.map
      RDF::URI.new('http://semanticscience.org/resource/SIO_000301')
    end

    # A web page is a document that is published according to World Wide Web standards.
    def self.web_page
      RDF::URI.new('http://semanticscience.org/resource/SIO_000302')
    end

    # Email message is a digital document that is composed of a header and a body and is transmitted using the SMTP protocol.
    def self.email
      RDF::URI.new('http://semanticscience.org/resource/SIO_000304')
    end

    # process number is a number associated with a process that denotes its ordinal position in a set of processes.
    def self.process_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000305')
    end

    # A letter is a document that contains a personal communication from one part to another.
    def self.letter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000306')
    end

    # normality is the quality in which the value may differ from normal or average
    def self.normality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000307')
    end

    def self.edition_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000308')
    end

    def self.volume_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000309')
    end

    def self.polymer
      RDF::URI.new('http://semanticscience.org/resource/SIO_000314')
    end

    # A functional specification is a specification that describes the characteristics of the product with regard to its intended features.
    def self.functional_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000315')
    end

    # A design specification is a specification that provides precise and explicit information about the requirements for a product design.
    def self.design_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000316')
    end

    # A specification for spatial location is an effective specification towards representation spatial position or spatial data.
    def self.spatial_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000317')
    end

    # Longitude is the angle east or west of a reference meridian between the two geographical poles to another meridian that passes through an arbitrary point.
    def self.longitude
      RDF::URI.new('http://semanticscience.org/resource/SIO_000318')
    end

    # Latitude is the angle from a point on the Earth's surface to the equatorial plane
    def self.latitude
      RDF::URI.new('http://semanticscience.org/resource/SIO_000319')
    end

    # A coordinate system is a specification for spatial location that uses a set of numbers, or coordinates, to uniquely determine the position of a point or other geometric element.
    def self.coordinate_system
      RDF::URI.new('http://semanticscience.org/resource/SIO_000320')
    end

    # A Cartesian coordinate system specifies each point uniquely in a plane by a pair of numerical coordinates, which are the signed distances from the point to two fixed perpendicular directed lines, measured in the same unit of length.
    def self.cartesian_coordinate_system
      RDF::URI.new('http://semanticscience.org/resource/SIO_000321')
    end

    # A concept is term that refers to a generalization of a set of attributes or entities.
    def self.concept
      RDF::URI.new('http://semanticscience.org/resource/SIO_000326')
    end

    def self.polar_coordinate_system
      RDF::URI.new('http://semanticscience.org/resource/SIO_000327')
    end

    # a positional description is a description of location using some system or frame of reference.
    def self.positional_description
      RDF::URI.new('http://semanticscience.org/resource/SIO_000328')
    end

    def self.cylindrical_coordinate_system
      RDF::URI.new('http://semanticscience.org/resource/SIO_000329')
    end

    def self.spherical_coordinate_system
      RDF::URI.new('http://semanticscience.org/resource/SIO_000330')
    end

    def self.OWL_ontology
      RDF::URI.new('http://semanticscience.org/resource/SIO_000331')
    end

    def self.a_D_Cartesian_coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000333')
    end

    # a plan specification is an effective specification detailing a set of actions to achieve some objective or goal.
    def self.plan_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000336')
    end

    # an objective is an agentive entity that is a planned or anticipated outcome.
    def self.objective
      RDF::URI.new('http://semanticscience.org/resource/SIO_000337')
    end

    # A realizable entity is an attribute that is exhibited under some condition and is realized in some process.
    def self.realizable_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000340')
    end

    # a term variant is a term that is a variant of another term.
    def self.term_variant
      RDF::URI.new('http://semanticscience.org/resource/SIO_000342')
    end

    def self.to_modify
      RDF::URI.new('http://semanticscience.org/resource/SIO_000343')
    end

    # To record is the capability to register or collect information in a specified format on some physical medium.
    def self.to_record
      RDF::URI.new('http://semanticscience.org/resource/SIO_000344')
    end

    # To magnify is the capability to increase the appearance of the size of an object.
    def self.to_magnify
      RDF::URI.new('http://semanticscience.org/resource/SIO_000345')
    end

    # To heat is a capability to increase the internal kinetic energy of a material.
    def self.to_heat
      RDF::URI.new('http://semanticscience.org/resource/SIO_000346')
    end

    # To cool is the capability to decrease the internal kinetic energy of a material.
    def self.to_cool
      RDF::URI.new('http://semanticscience.org/resource/SIO_000347')
    end

    # To freeze is the capability to decrease the internal kinetic energy of a material such that it changes state from a gas or liquid to a solid.
    def self.to_freeze
      RDF::URI.new('http://semanticscience.org/resource/SIO_000348')
    end

    # To separate is the capability to i) distinguish some entities based on some attribute(s) and ii) subsequently physically displace them.
    def self.to_separate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000349')
    end

    # To ionize is the capability to physically convert an atom or molecule into an ion by adding or removing charged particles such as electrons or other ions.
    def self.to_ionize
      RDF::URI.new('http://semanticscience.org/resource/SIO_000350')
    end

    # To supply energy is the capability to transfer energy from a source to a sink.
    def self.to_supply_energy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000351')
    end

    # to observe is the capability to watch attentively.
    def self.to_observe
      RDF::URI.new('http://semanticscience.org/resource/SIO_000353')
    end

    # dysfunction is a capability to act in an abnormal or unintended manner.
    def self.dysfunction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000354')
    end

    def self.fitness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000357')
    end

    def self.intention
      RDF::URI.new('http://semanticscience.org/resource/SIO_000358')
    end

    def self.purpose
      RDF::URI.new('http://semanticscience.org/resource/SIO_000359')
    end

    # belief is an agentive entity which holds a proposition or premise to be true.
    def self.belief
      RDF::URI.new('http://semanticscience.org/resource/SIO_000360')
    end

    # An agentive entity is a realizable entity that is formulated by one or more agents and may be communicated among agents through some outward manifestation.
    def self.agent_based_realizeable_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000361')
    end

    # A number is a mathematical object used to count, label, and measure.
    def self.number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000366')
    end

    # a variable is a value that may change within the scope of a given problem or set of operations.
    def self.variable
      RDF::URI.new('http://semanticscience.org/resource/SIO_000367')
    end

    # An equation is a mathematical statement that asserts the equality of two expressions.
    def self.equation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000368')
    end

    # a spatial region is an object contained in some region of space.
    def self.spatial_region
      RDF::URI.new('http://semanticscience.org/resource/SIO_000370')
    end

    # To measure is the capability to obtain information about some entity by examining its attributes in relation to some reference metric.
    def self.to_measure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000371')
    end

    # To inject is the capability to administer a substance into some object through its external barrier.
    def self.to_inject
      RDF::URI.new('http://semanticscience.org/resource/SIO_000372')
    end

    # To boil is the capability to increase the internal kinetic energy of a material such that it changes state from a solid or liquid to a gas.
    def self.to_boil
      RDF::URI.new('http://semanticscience.org/resource/SIO_000373')
    end

    def self.to_reduce_energy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000374')
    end

    # To supply electricity is the capability to transfer electricity from a source to a sink.
    def self.to_supply_electricity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000375')
    end

    def self.to_change_materially
      RDF::URI.new('http://semanticscience.org/resource/SIO_000376')
    end

    # To demagnify is the capability to decrease the appearance of the size of an object.
    def self.to_demagnify
      RDF::URI.new('http://semanticscience.org/resource/SIO_000377')
    end

    def self.to_change_appearance
      RDF::URI.new('http://semanticscience.org/resource/SIO_000378')
    end

    def self.perception
      RDF::URI.new('http://semanticscience.org/resource/SIO_000379')
    end

    # To contain is the capability to bound or constrain a physical entity in some site.
    def self.to_contain
      RDF::URI.new('http://semanticscience.org/resource/SIO_000380')
    end

    # To immobilize is the capability to contain an entity in such a way that it may not move in space.
    def self.to_immobilize
      RDF::URI.new('http://semanticscience.org/resource/SIO_000381')
    end

    # To filter is the capability to retain certain entities based on selected attribute(s) while allowing other entities to pass through.
    def self.to_filter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000382')
    end

    # To excite is the capability to supply energy to a materila by bombarding it with energetic particles (e.g., photons).
    def self.to_excite
      RDF::URI.new('http://semanticscience.org/resource/SIO_000383')
    end

    # To emit is the capability to release some physical entity (light, pollution, etc).
    def self.to_emit
      RDF::URI.new('http://semanticscience.org/resource/SIO_000384')
    end

    def self.to_change_energetically
      RDF::URI.new('http://semanticscience.org/resource/SIO_000385')
    end

    def self.to_oxidize
      RDF::URI.new('http://semanticscience.org/resource/SIO_000386')
    end

    def self.to_reduce
      RDF::URI.new('http://semanticscience.org/resource/SIO_000387')
    end

    # to assemble is the capability to combine entities together into a larger object that persists in time.
    def self.to_assemble
      RDF::URI.new('http://semanticscience.org/resource/SIO_000388')
    end

    # To extract is the capability to remove certain entities based on selected attribute(s) while allowing other entities to remain.
    def self.to_extract
      RDF::URI.new('http://semanticscience.org/resource/SIO_000389')
    end

    # to transport is the capability to displace a material from one location to another.
    def self.to_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000390')
    end

    # time measurement is a measurement value of the duration of some interval of time or a particular instant of time (against some frame of reference).
    def self.time_measurement
      RDF::URI.new('http://semanticscience.org/resource/SIO_000391')
    end

    # to change spatially is the capability to affect the physical movement of some entity.
    def self.to_change_spatially
      RDF::URI.new('http://semanticscience.org/resource/SIO_000392')
    end

    def self.patient
      RDF::URI.new('http://semanticscience.org/resource/SIO_000393')
    end

    def self.doctor
      RDF::URI.new('http://semanticscience.org/resource/SIO_000394')
    end

    def self.to_regulate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000395')
    end

    def self.file
      RDF::URI.new('http://semanticscience.org/resource/SIO_000396')
    end

    def self.to_provide
      RDF::URI.new('http://semanticscience.org/resource/SIO_000397')
    end

    def self.nurse
      RDF::URI.new('http://semanticscience.org/resource/SIO_000398')
    end

    def self.study_subject
      RDF::URI.new('http://semanticscience.org/resource/SIO_000399')
    end

    def self.x_cartesian_coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000400')
    end

    def self.y_cartesian_coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000401')
    end

    def self.z_cartesian_coordinate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000402')
    end

    def self.study_group
      RDF::URI.new('http://semanticscience.org/resource/SIO_000403')
    end

    def self.professor
      RDF::URI.new('http://semanticscience.org/resource/SIO_000404')
    end

    def self.student
      RDF::URI.new('http://semanticscience.org/resource/SIO_000405')
    end

    def self.academic
      RDF::URI.new('http://semanticscience.org/resource/SIO_000406')
    end

    def self.to_increase_the_rate_of_formation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000407')
    end

    def self.to_investigate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000408')
    end

    # a mutual disposition is a disposition that simulataneously invokes another disposition when realized.
    def self.mutual_disposition
      RDF::URI.new('http://semanticscience.org/resource/SIO_000409')
    end

    # anger is disgust directed toward an equal status individual.
    def self.anger
      RDF::URI.new('http://semanticscience.org/resource/SIO_000410')
    end

    # Hate is a deep and emotional extreme dislike, directed against a certain object or class of objects. 
    def self.hate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000411')
    end

    # Love is an emotion of a strong affection and personal attachment.
    def self.love
      RDF::URI.new('http://semanticscience.org/resource/SIO_000412')
    end

    # A legal region is a geographic region which has causal powers confered by a legal entity.
    def self.legal_region
      RDF::URI.new('http://semanticscience.org/resource/SIO_000413')
    end

    # a geographic region is a spatial region whose boundaries are typically defined against some material frame of reference (like the earth).
    def self.geographic_region
      RDF::URI.new('http://semanticscience.org/resource/SIO_000414')
    end

    def self.geopolitical_region
      RDF::URI.new('http://semanticscience.org/resource/SIO_000415')
    end

    # a time internval is a contiguous temporal region having some duration.
    def self.time_interval
      RDF::URI.new('http://semanticscience.org/resource/SIO_000417')
    end

    # a time instant is a temporal region which occurs instantaneously e.g. having no duration.
    def self.time_instant
      RDF::URI.new('http://semanticscience.org/resource/SIO_000418')
    end

    # A table is a figure that consists of an ordered arrangement of columns and rows.
    def self.table
      RDF::URI.new('http://semanticscience.org/resource/SIO_000419')
    end

    # A scatterplot is a statistical graph which uses Cartesian coordinates to display values for two variables for a set of data. The data is displayed as a collection of points, each having the value of one variable determining the position on the horizontal axis and the value of the other variable determining the position on the vertical axis.
    def self.scatterplot
      RDF::URI.new('http://semanticscience.org/resource/SIO_000423')
    end

    def self.year
      RDF::URI.new('http://semanticscience.org/resource/SIO_000428')
    end

    def self.month
      RDF::URI.new('http://semanticscience.org/resource/SIO_000429')
    end

    def self.day
      RDF::URI.new('http://semanticscience.org/resource/SIO_000430')
    end

    def self.century
      RDF::URI.new('http://semanticscience.org/resource/SIO_000431')
    end

    def self.millenium
      RDF::URI.new('http://semanticscience.org/resource/SIO_000432')
    end

    def self.hour
      RDF::URI.new('http://semanticscience.org/resource/SIO_000433')
    end

    def self.minute
      RDF::URI.new('http://semanticscience.org/resource/SIO_000434')
    end

    def self.second
      RDF::URI.new('http://semanticscience.org/resource/SIO_000435')
    end

    # an informational quality is a quality that pertains to information.
    def self.informational_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000436')
    end

    # a 2D cartesian point is a point whose position is specified along two  dimensions using Cartesian coordinates.
    def self.a_D_cartesian_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000437')
    end

    def self.altitude
      RDF::URI.new('http://semanticscience.org/resource/SIO_000438')
    end

    def self.center_of_mass
      RDF::URI.new('http://semanticscience.org/resource/SIO_000439')
    end

    # a 3D cartesian point is a point whose position is specified along three  dimensions using Cartesian coordinates.
    def self.a_D_cartesian_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000440')
    end

    # a 1D cartesian point is a point whose position is specified along a single dimension using Cartesian coordinates.
    def self.a_D_cartesian_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000441')
    end

    # A line graph is a statistical graph in which lines contains the evaluation of functions or individual points connected by line segments.
    def self.line_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000442')
    end

    # A bar graph is a statistical graph with rectangular bars of lengths proportional to that value that they represent.
    def self.bar_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000443')
    end

    # A horizontal bar graph is a bar graph in which the rectangular bars 
    # are horizontally oriented in space.
    def self.horizontal_bar_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000444')
    end

    # A vertical bar graph is a bar graph in which the rectangular bars are 
    # vertically oriented in space.
    def self.vertical_bar_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000445')
    end

    # A stacked bar graph is a bar graph in which each rectangular bar is 
    # partioned by the categorical value of each series of data.
    def self.stacked_bar_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000446')
    end

    # A line-bar graph statistical graph that contains both lines and bars.
    def self.line_bar_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000447')
    end

    def self.figure_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_000448')
    end

    # A plot is a part of a figure that corresponds to the spatial region between the set of axes.
    def self.plot
      RDF::URI.new('http://semanticscience.org/resource/SIO_000449')
    end

    # An axis is a line segment that is part of a statistical graph in which the 
    # position along the line corresponds to a numeric or categorical value.
    def self.axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000450')
    end

    # A Cartesian coordinate axis is an axis whose behavior follows that of a Cartesian coordinate system.
    def self.Cartesian_coordinate_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000451')
    end

    # An x-axis is a Cartesian coordinate axis that is aligned with the horizon.
    def self.x_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000452')
    end

    # A y-axis is a Cartesian coordinate axis that is spatially oriented 
    # perpendicular to the x-axis.
    def self.y_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000453')
    end

    # A z-axis is a Cartesian coordinate axis that is spatially oriented 
    # normal to the plane formed by the x- and y-axes.
    def self.z_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000454')
    end

    # A category axis is an axis in which the position along the line is 
    # partioned into categories.
    def self.category_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000455')
    end

    # A primary category axis is a category axis that either defines the sole value range or holds the larger set of categorical values specified by the secondary category axis.
    def self.primary_category_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000456')
    end

    # A secondary category axis is a category axis that defines a finer 
    # granular part (or subset) of the value range of the primary category axis.
    def self.secondary_category_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000457')
    end

    # A value axis is an axis in which the position along the line is 
    # partioned into numeric values.
    def self.value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000458')
    end

    # A left value axis is a value axis that is spatially positioned to the left of the plot area.
    def self.left_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000459')
    end

    # A right value axis is a value axis that is spatially positioned to the right of the plot area.
    def self.right_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000460')
    end

    # A scaled value axis is a value axis in which the value range was subject to a mathematic transformation.
    def self.scaled_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000461')
    end

    # A linear value axis is a value axis that corresponds to a scaling factor of 1 of the value range.
    def self.linear_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000462')
    end

    # A logarithmic value axis is a scaled value axis that corresponds to a scaling factor of the logarithm of the value range.
    def self.logarithmic_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000463')
    end

    # A data series is a data set composed of related values displayed in a statistical graph.
    def self.data_series
      RDF::URI.new('http://semanticscience.org/resource/SIO_000464')
    end

    # A data point is a point that which corresponds to the projection of the values of measurement data against the axes of a statistical graph.
    def self.data_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000465')
    end

    # A global maximum stationary point is a data point that corresponds to a measurement value is larger than that of all other plotted datapoints.
    def self.global_maximal_stationary_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000466')
    end

    # A global minimum data point is a data point that corresponds to a measurement value is smaller than that of all other plotted datapoints.
    def self.global_minimal_stationary_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000467')
    end

    # A legend is a part of a figure that associates textual descriptions with symbols pertaining to plotted entities.
    def self.legend
      RDF::URI.new('http://semanticscience.org/resource/SIO_000468')
    end

    # A graph title is a title that describes a graph.
    def self.graph_title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000469')
    end

    # A primary title is a title that should be first used in describing some entity.
    def self.primary_title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000470')
    end

    # A secondary title is a title of lesser importance that should be used after the first title in describing some entity.
    def self.secondary_title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000471')
    end

    def self.scientific_data
      RDF::URI.new('http://semanticscience.org/resource/SIO_000472')
    end

    # A primary graph title is a primary title that describes a statistical 
    # graph.
    def self.primary_graph_title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000473')
    end

    # A secondary graph title is a secondary title that describes a statistical graph.
    def self.secondary_graph_title
      RDF::URI.new('http://semanticscience.org/resource/SIO_000474')
    end

    # a biological quality is a quality held by a biological entity.
    def self.biological_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000475')
    end

    # cellular quality is the quality of a cell
    def self.cellular_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000476')
    end

    def self.sequence_variant_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000478')
    end

    # a variant role is a comparative role in which the value of an attribute differs when compared to another entity
    def self.variant_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000479')
    end

    def self.insertion_variant_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000480')
    end

    def self.deletion_variant_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000481')
    end

    # A phrase is a group of words functioning as a single unit in the syntax of a sentence.
    def self.phrase
      RDF::URI.new('http://semanticscience.org/resource/SIO_000483')
    end

    def self.human
      RDF::URI.new('http://semanticscience.org/resource/SIO_000485')
    end

    def self.mouse
      RDF::URI.new('http://semanticscience.org/resource/SIO_000486')
    end

    def self.rat
      RDF::URI.new('http://semanticscience.org/resource/SIO_000487')
    end

    def self.worm
      RDF::URI.new('http://semanticscience.org/resource/SIO_000488')
    end

    def self.e_coli
      RDF::URI.new('http://semanticscience.org/resource/SIO_000489')
    end

    def self.to_consume
      RDF::URI.new('http://semanticscience.org/resource/SIO_000492')
    end

    # A clause consists of a subject and a predicate.
    def self.clause
      RDF::URI.new('http://semanticscience.org/resource/SIO_000493')
    end

    # to actively interact with is the capability to interact with another entity in a way that requires physical contact.
    def self.to_actively_interact_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000494')
    end

    def self.person
      RDF::URI.new('http://semanticscience.org/resource/SIO_000498')
    end

    def self.to_decrease_the_rate_of_formation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000499')
    end

    # A polygon vertex is a terminal point at which two polygon edges meet and are part of a polygon.
    def self.polygon_vertex
      RDF::URI.new('http://semanticscience.org/resource/SIO_000500')
    end

    # A polygon edge is a line segment joining two polygon vertices.
    def self.polygon_edge
      RDF::URI.new('http://semanticscience.org/resource/SIO_000501')
    end

    # A polyhedral skeleton is a collection of polygon edges.
    def self.polyhedral_skeleton
      RDF::URI.new('http://semanticscience.org/resource/SIO_000502')
    end

    # A polygonal face is a polygon bounded by a circuit of polygon edges, and includes the flat (plane) region inside the boundary.
    def self.polygonal_face
      RDF::URI.new('http://semanticscience.org/resource/SIO_000503')
    end

    # A polyhedral surface is composed of polygonal faces.
    def self.polyhedral_surface
      RDF::URI.new('http://semanticscience.org/resource/SIO_000504')
    end

    # A polygon is a planar entity that is bounded by a closed path or circuit, composed of a finite connected sequence3 of straight line segments.
    def self.polygon
      RDF::URI.new('http://semanticscience.org/resource/SIO_000505')
    end

    def self.geometric_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000506')
    end

    # A point is a geometric entity that is located in a zero-dimensional spatial region and whose position is defined by its coordinates in some coordinate system.
    def self.point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000507')
    end

    # An endpoint is a terminal point that is the last of an ordered 
    # pair of points.
    def self.endpoint
      RDF::URI.new('http://semanticscience.org/resource/SIO_000508')
    end

    # A start point is a terminal point which is the first of an ordered 
    # pair of points.
    def self.startpoint
      RDF::URI.new('http://semanticscience.org/resource/SIO_000509')
    end

    # A model is a representation of some thing.
    def self.model
      RDF::URI.new('http://semanticscience.org/resource/SIO_000510')
    end

    # A line is curve that extends in a single dimension (e.g. straight line; exhibits no curvature), and is composed of at least two fully connected points.
    def self.line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000511')
    end

    # A line segment is a line and a part of a curve that is (inclusively) bounded by two terminal points.
    def self.line_segment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000512')
    end

    # A tick mark is a line segment that is spatially positioned perpendicular to the axis of a statistical graph and indicates the position of a specific numeric value (which may be indicated by an adjacent value label) on a value axis, or is one of a pair of tick marks that delineates the boundary of a categorical value (which may be indicated by an adjacent category label) on the categorical axis.
    def self.tick_mark
      RDF::URI.new('http://semanticscience.org/resource/SIO_000513')
    end

    # A major tick mark is a tick mark that indicates the position of a 
    # specific numeric value and is adjacent to its value label on the value 
    # axis, or is one of a pair of tick marks that delineates the boundary of a 
    # categorical value indicated by an adjacent category label on the 
    # categorical axis.
    def self.major_tick_mark
      RDF::URI.new('http://semanticscience.org/resource/SIO_000514')
    end

    # A minor tick mark is a tick mark that indicates the position of a specific numeric value but has no adjacent value label, or is one of a pair of tick marks that delineates the boundary of a categorical value but has no adjacent category label on the categorical axis.
    def self.minor_tick_mark
      RDF::URI.new('http://semanticscience.org/resource/SIO_000515')
    end

    # A ray is a line which that is bounded by a startpoint and extends outwards infinitely along one dimension.
    def self.ray
      RDF::URI.new('http://semanticscience.org/resource/SIO_000516')
    end

    # A quadrilateral is a polygon with composed of four points and four line segments, in which each point is fully connected to two other points.
    def self.quadrilateral
      RDF::URI.new('http://semanticscience.org/resource/SIO_000517')
    end

    # A rectangle is a quadrilateral in which one pair of line segments are  parallel and the other pair are perpendicular to the first pair.
    def self.rectangle
      RDF::URI.new('http://semanticscience.org/resource/SIO_000518')
    end

    # A bar is a rectangle that is located in the plot of a statistical graph in which its length is proportional to the values that it represents.
    def self.bar
      RDF::URI.new('http://semanticscience.org/resource/SIO_000519')
    end

    # A triangle is a polygon composed of three points and three line segments, in which each point is fully connected to another point along through the line segment.
    def self.triangle
      RDF::URI.new('http://semanticscience.org/resource/SIO_000520')
    end

    # A directed line segment is a line segment that is contained by an ordered pair 
    # of endpoints (a start point and an endpoint).
    def self.directed_line_segment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000521')
    end

    # An arrowed line is a directed line segment in which one or both endpoints is tangentially part of a triangle that bisects the line.
    def self.arrowed_line_segment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000522')
    end

    # A single arrowed line is directed line in which the endpoint is tangentially part of a triangle that bisects the line.
    def self.single_arrowed_line_segment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000523')
    end

    # A double arrowed line is an arrowed line in which both terminal points are  tangentially part of different triangles that bisect the line.
    def self.double_arrowed_line_segment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000524')
    end

    # A vertical line is a line that is positionally oriented with the horizon.
    def self.horizontal_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000525')
    end

    # A vertical line is a line that is positionally oriented perpendicular to the horizon.
    def self.vertical_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000526')
    end

    # A trend line is a line, line segment or ray that is part of a statistical graph which indicates a statistical or visual direction across categorical or value data.
    def self.trend_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000527')
    end

    # An increasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is positive.
    def self.increasing_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000528')
    end

    # An decreasing line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is negative.
    def self.decreasing_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000529')
    end

    # An plateau line is a line segment in which the startpoint and endpoint are ordered along one dimension and the difference of values in a second dimension is zero.
    def self.plateau_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000530')
    end

    # A drop line is a statistical graph line that vertically or horizontally connects a data series line with a value axis in a statistical graph.
    def self.drop_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000531')
    end

    # A terminal point is a point that defines the finite extension of a line.
    def self.terminal_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000532')
    end

    # A surface normal is a vector that is perpendicular to a flat surface.
    def self.surface_normal
      RDF::URI.new('http://semanticscience.org/resource/SIO_000533')
    end

    def self.positionally_oriented_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000534')
    end

    # A statistical graph line is a line used in a statistical graph to communicate some trend or feature of the embedded data.
    def self.statistical_graph_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000535')
    end

    def self.to_regulate_the_rate_of_formation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000536')
    end

    # curvature is a quality of a bearer that relates to the presence of curves, bends, or angles.
    def self.curvature
      RDF::URI.new('http://semanticscience.org/resource/SIO_000537')
    end

    # shape is a quality of a bearer that is free of curves, bends, or angles.
    def self.straight
      RDF::URI.new('http://semanticscience.org/resource/SIO_000538')
    end

    # An infinite line is a line that extends outwards in both directions of a single dimensional and is not bounded by terminal points.
    def self.infinite_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_000539')
    end

    # A ray is a line which that is bounded by a startpoint and extends outwards along one dimension.
    def self.vector
      RDF::URI.new('http://semanticscience.org/resource/SIO_000540')
    end

    # A vertext normal is the normalized average of the surface normals of the faces that contain that vertex.
    def self.vertex_normal
      RDF::URI.new('http://semanticscience.org/resource/SIO_000541')
    end

    def self.to_serve_as
      RDF::URI.new('http://semanticscience.org/resource/SIO_000542')
    end

    def self.to_serve_as_a_host
      RDF::URI.new('http://semanticscience.org/resource/SIO_000543')
    end

    def self.to_infect
      RDF::URI.new('http://semanticscience.org/resource/SIO_000544')
    end

    # A polyline is a connected sequence of line segments.
    def self.polyline
      RDF::URI.new('http://semanticscience.org/resource/SIO_000545')
    end

    def self.collection_of_points
      RDF::URI.new('http://semanticscience.org/resource/SIO_000546')
    end

    def self.to_cause_disease
      RDF::URI.new('http://semanticscience.org/resource/SIO_000547')
    end

    def self.specialized_biological_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000548')
    end

    def self.to_reduce_the_activation_energy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000549')
    end

    def self.to_increase_the_activation_energy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000550')
    end

    def self.to_change_the_activation_energy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000551')
    end

    # A quality that has a value that is normal or average.
    def self.normal
      RDF::URI.new('http://semanticscience.org/resource/SIO_000554')
    end

    # A quality that has a value that is outside normal or average.
    def self.abnormal
      RDF::URI.new('http://semanticscience.org/resource/SIO_000555')
    end

    def self.lipid_residue
      RDF::URI.new('http://semanticscience.org/resource/SIO_000556')
    end

    # Chemical synthesis is synthesis of a chemical entity from physical precursors through one or more chemical interactions or reactions.
    def self.chemical_synthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000559')
    end

    # a molecular orbital (or MO) is a mathematical function describing the wave-like behavior of an electron in a molecule
    def self.molecular_orbitral
      RDF::URI.new('http://semanticscience.org/resource/SIO_000561')
    end

    # Passive transport is the movement of a substance across a membrane and does not require chemical energy.
    def self.passive_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000562')
    end

    # Diffusion is motion of particles at temperatures above absolute zero.
    def self.diffusion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000564')
    end

    # A diffusion equation describes density fluctuations in a material undergoing diffusion.
    def self.diffusion_equation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000565')
    end

    # a movement equation describes the displacement of an object in space over time.
    def self.movement_equation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000566')
    end

    # An ordinary differential equation (ODE) is a differential equation in which the unknown function (also known as the dependent variable) is a function of a single independent variable.
    def self.ordinary_differential_equation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000567')
    end

    # A partial differential equation (PDE) is a differential equation in which the unknown function is a function of multiple independent variables and the equation involves its partial derivatives.
    def self.partial_differential_equation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000568')
    end

    # A differential equation is a mathematical equation for an unknown function of one or several variables that relates the values of the function itself and its derivatives of various orders.
    def self.differential_equation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000569')
    end

    # Movement is the process in which an object is spatially displaced.
    def self.movement
      RDF::URI.new('http://semanticscience.org/resource/SIO_000570')
    end

    # Brownian motion is the seemlingly random movement of particles suspended in a fluid.
    def self.brownian_motion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000571')
    end

    # Osmosis is the movement of water molecules through a selectively-permeable membrane down a water potential gradient.
    def self.osmosis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000572')
    end

    def self.passive_movement
      RDF::URI.new('http://semanticscience.org/resource/SIO_000573')
    end

    # Active movement is the process in which an object is spatially displaced using some chemical energy.
    def self.active_movement
      RDF::URI.new('http://semanticscience.org/resource/SIO_000574')
    end

    # Transport is an interaction that realizes the role a transporter and a cargo and results in the movement of at least the cargo.
    def self.transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000575')
    end

    # membrane transport is the movement of molecules across a membrane.
    def self.membrane_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000576')
    end

    # Primary active transport, also called direct active transport, directly uses energy to transport molecules across a membrane.
    def self.primary_active_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000577')
    end

    # secondary active transport or co-transport uses electrochemical potential difference created by pumping ions out of the cell to transport molecules across a membrane.
    def self.secondary_active_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000578')
    end

    def self.symport_enabled_secondary_active_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000579')
    end

    def self.antiport_enabled_secondary_active_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_000580')
    end

    # The self-propelled movement of an object.
    def self.locomotion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000581')
    end

    # Birth is the process by which a biological organism is brought into existence.
    def self.birth
      RDF::URI.new('http://semanticscience.org/resource/SIO_000582')
    end

    # The process in which an entity ceases to exist.
    def self.death
      RDF::URI.new('http://semanticscience.org/resource/SIO_000583')
    end

    # Living is a process for a biological entity that unfolds from the moment it comes into existence to the moment it cease to exist
    def self.living
      RDF::URI.new('http://semanticscience.org/resource/SIO_000584')
    end

    # An idea is a proposition about some object of conceptual thought.
    def self.idea
      RDF::URI.new('http://semanticscience.org/resource/SIO_000585')
    end

    # Biological reproduction is the biological process by which one or more biological organisms are produced from their "parents". 
    def self.biological_reproduction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000587')
    end

    # creation is a process in which an entity comes into existence.
    def self.creation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000588')
    end

    def self.regulation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000589')
    end

    # Biosynthesis is the synthesis of an organic compound in a living organism, usually aided by enzymes.
    def self.biosynthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000590')
    end

    # destruction is a process in which something is broken down and/or ceases to exist.
    def self.destruction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000591')
    end

    # Chemical destruction is destruction of a chemical entity to its chemical constituents through one ormore chemical interactions or reactions.
    def self.chemical_destruction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000592')
    end

    # an interaction is a process that involves two or more entities and the realization of at least two dispositions to interact.
    def self.interaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000593')
    end

    def self.data_transformation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000594')
    end

    def self.parameterized_data_transformation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000595')
    end

    def self.data_storage_device
      RDF::URI.new('http://semanticscience.org/resource/SIO_000596')
    end

    # A solid-state drive (SSD) is a data storage device that uses solid-state memory to store persistent data
    def self.solid_state_hard_drive
      RDF::URI.new('http://semanticscience.org/resource/SIO_000597')
    end

    # A hard disk drive (HDD) is a non-volatile, random access device for digital data. It features rotating rigid platters on a motor-driven spindle within a protective enclosure. Data is magnetically read and written on the platter by read/write heads that float on a film of air above the platters.
    def self.hard_disk_drive
      RDF::URI.new('http://semanticscience.org/resource/SIO_000598')
    end

    def self.structure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000600')
    end

    def self.computational_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000602')
    end

    def self.sound_wave
      RDF::URI.new('http://semanticscience.org/resource/SIO_000605')
    end

    # A curve is a geometric entity that may be located in n-dimensional spatial region whose extension may be n-dimensional,  is composed of at least two fully connected points and does not intersect itself.
    def self.curve
      RDF::URI.new('http://semanticscience.org/resource/SIO_000608')
    end

    def self.regulation_of_process
      RDF::URI.new('http://semanticscience.org/resource/SIO_000609')
    end

    def self.regulation_of_capability
      RDF::URI.new('http://semanticscience.org/resource/SIO_000610')
    end

    def self.regulation_of_catalytic_capability
      RDF::URI.new('http://semanticscience.org/resource/SIO_000611')
    end

    # A representation is a entity that in some way represents another entity (or attribute thereof).
    def self.representation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000612')
    end

    # A ordinal number is a coordinate that designates the position of an entity in an ordered sequence of entities.
    def self.ordinal_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000613')
    end

    # an attribute is a characteristic of some entity.
    def self.attribute
      RDF::URI.new('http://semanticscience.org/resource/SIO_000614')
    end

    def self.process_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000615')
    end

    # A collection is a set for which there exists at least one member, although any member need not to exist at any point in the collection's existence.
    def self.collection
      RDF::URI.new('http://semanticscience.org/resource/SIO_000616')
    end

    # An empty set is a set for which there are exactly 0 members.
    def self.empty_set
      RDF::URI.new('http://semanticscience.org/resource/SIO_000617')
    end

    # a standard is a socially-agreed upon specification.
    def self.standard
      RDF::URI.new('http://semanticscience.org/resource/SIO_000618')
    end

    # A regulatory authority is an organization responsible for  exercising regulatory or supervisory capacity in some area of human activity.
    def self.regulatory_authority
      RDF::URI.new('http://semanticscience.org/resource/SIO_000619')
    end

    # A collective is a group of entities that share or are motivated by at least one common issue or interest, or work together on a specific project(s) to achieve a common objective.
    def self.collective
      RDF::URI.new('http://semanticscience.org/resource/SIO_000620')
    end

    # A formal specification is a mathematical description of software or hardware that may be used to develop an implementation.
    def self.formal_specification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000621')
    end

    def self.RDFS_ontology
      RDF::URI.new('http://semanticscience.org/resource/SIO_000622')
    end

    def self.OBO_ontology
      RDF::URI.new('http://semanticscience.org/resource/SIO_000623')
    end

    def self.chemical_functional_group
      RDF::URI.new('http://semanticscience.org/resource/SIO_000624')
    end

    # Chemical structure is the quality of molecular geometry and electronic structure.
    def self.chemical_structure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000625')
    end

    def self.molecular_structure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000626')
    end

    # Molecular geometry is the spatial arrangement of atoms in a molecule and the chemical bonds that hold the atoms together.
    def self.molecular_geometry
      RDF::URI.new('http://semanticscience.org/resource/SIO_000627')
    end

    # a probability measure is quantity of how likely it is that some event will occur.
    def self.probability_measure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000638')
    end

    # to passively interact with is the capability to interact with another entity in a way that does not require physical contact.
    def self.to_passively_interact_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000639')
    end

    # A quality that has a value that is increased compared to normal or average.
    def self.increased
      RDF::URI.new('http://semanticscience.org/resource/SIO_000640')
    end

    def self.process_model
      RDF::URI.new('http://semanticscience.org/resource/SIO_000647')
    end

    def self.physical_model
      RDF::URI.new('http://semanticscience.org/resource/SIO_000648')
    end

    def self.information_processing
      RDF::URI.new('http://semanticscience.org/resource/SIO_000649')
    end

    # A wave is a physical entity that travels through space and time, consist of oscillations or vibrations and may be accompanied by the transfer of energy.
    def self.wave
      RDF::URI.new('http://semanticscience.org/resource/SIO_000650')
    end

    # A textual entity is a materialization (physical embodiment) of a language entity.
    def self.textual_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000651')
    end

    def self.version_label
      RDF::URI.new('http://semanticscience.org/resource/SIO_000653')
    end

    def self.software_version
      RDF::URI.new('http://semanticscience.org/resource/SIO_000654')
    end

    # a hole is a site that is opening into or through something.
    def self.hole
      RDF::URI.new('http://semanticscience.org/resource/SIO_000660')
    end

    def self.province
      RDF::URI.new('http://semanticscience.org/resource/SIO_000661')
    end

    def self.state
      RDF::URI.new('http://semanticscience.org/resource/SIO_000662')
    end

    def self.territory
      RDF::URI.new('http://semanticscience.org/resource/SIO_000663')
    end

    def self.country
      RDF::URI.new('http://semanticscience.org/resource/SIO_000664')
    end

    def self.city
      RDF::URI.new('http://semanticscience.org/resource/SIO_000665')
    end

    def self.township
      RDF::URI.new('http://semanticscience.org/resource/SIO_000666')
    end

    def self.sofware_execution
      RDF::URI.new('http://semanticscience.org/resource/SIO_000667')
    end

    def self.start_time
      RDF::URI.new('http://semanticscience.org/resource/SIO_000669')
    end

    def self.end_time
      RDF::URI.new('http://semanticscience.org/resource/SIO_000670')
    end

    # a unique identifier is an identifier that uniquely identifies some thing.
    def self.unique_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000675')
    end

    def self.social_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000676')
    end

    # a processual role is a role that can only be realized in a process.
    def self.processual_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000677')
    end

    # an abstract role is a role whose basis lies in spatial/temporal or comparative relations. 
    def self.abstract_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000678')
    end

    # A justification is a proposition that defends, explains or excuses some  argument.
    def self.justification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000683')
    end

    def self.department
      RDF::URI.new('http://semanticscience.org/resource/SIO_000686')
    end

    def self.institute
      RDF::URI.new('http://semanticscience.org/resource/SIO_000688')
    end

    # to be a part of is the capability to be assembled into a larger structure that persists in time.
    def self.to_be_part_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000689')
    end

    # To associate is the capability to physically interact with another object.
    def self.to_associate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000690')
    end

    def self.to_be_part_of_a_group
      RDF::URI.new('http://semanticscience.org/resource/SIO_000691')
    end

    def self.to_be_actively_interacted_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000692')
    end

    # A corporation is an organization that is granted a charter recognizing it as a separate legal entity.
    def self.corporation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000693')
    end

    def self.to_be_passively_interacted_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000694')
    end

    def self.to_be_recorded
      RDF::URI.new('http://semanticscience.org/resource/SIO_000695')
    end

    def self.to_be_observed
      RDF::URI.new('http://semanticscience.org/resource/SIO_000696')
    end

    # to disassemble is to physically separate the parts of an object.
    def self.to_disassemble
      RDF::URI.new('http://semanticscience.org/resource/SIO_000698')
    end

    # to disassociate is to cease or break association with some thing.
    def self.to_disassociate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000700')
    end

    # to interact with is a capabililty that involves another object.
    def self.to_interact_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000701')
    end

    # to be interacted with is the capability of an object to be physically touched or perturbed.
    def self.to_be_interacted_with
      RDF::URI.new('http://semanticscience.org/resource/SIO_000702')
    end

    # Evolution is the process that elicits change across successive generations in the inherited characteristics of biological populations.
    def self.evolution
      RDF::URI.new('http://semanticscience.org/resource/SIO_000703')
    end

    # a positional role is an abstract role which holds by comparing position to another object of reference.
    def self.positional_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000704')
    end

    # a specification of an object, manifested by an agent, intended to accomplish goals, in a particular environment, using a set of primitive components, satisfying a set of requirements, subject to constraints.
    def self.design
      RDF::URI.new('http://semanticscience.org/resource/SIO_000705')
    end

    def self.occupational_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000706')
    end

    def self.student_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000707')
    end

    def self.professor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000708')
    end

    def self.academic_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000711')
    end

    def self.medical_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000712')
    end

    def self.doctor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000713')
    end

    def self.nurse_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000714')
    end

    def self.patient_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000715')
    end

    def self.medical_practitioner
      RDF::URI.new('http://semanticscience.org/resource/SIO_000716')
    end

    def self.dentist_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000717')
    end

    # An agentive process is a process that directly involves an agent.
    def self.agentive_process
      RDF::URI.new('http://semanticscience.org/resource/SIO_000718')
    end

    # to translocate is the capability to displace oneself from one location to another.
    def self.to_translocate
      RDF::URI.new('http://semanticscience.org/resource/SIO_000719')
    end

    # to be translocated is the capability to be physically displaced from one location to another
    def self.to_be_translocated
      RDF::URI.new('http://semanticscience.org/resource/SIO_000720')
    end

    # a comparative role is an abstract role which holds by comparing some attribute of another object of reference.
    def self.comparative_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000721')
    end

    def self.to_be_compared
      RDF::URI.new('http://semanticscience.org/resource/SIO_000722')
    end

    # to compare is the capability to examine in order to note the similarities or differences among a set of objects.
    def self.to_compare
      RDF::URI.new('http://semanticscience.org/resource/SIO_000723')
    end

    # to examine is the capability to make detailed observation. 
    def self.to_examine
      RDF::URI.new('http://semanticscience.org/resource/SIO_000724')
    end

    def self.to_be_examined
      RDF::URI.new('http://semanticscience.org/resource/SIO_000725')
    end

    def self.administrative_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000726')
    end

    def self.secretary_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000727')
    end

    def self.chemical_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000728')
    end

    def self.record_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000729')
    end

    def self.physical_entity_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000730')
    end

    def self.informational_entity_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000731')
    end

    def self.molecular_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_000732')
    end

    # Planning is the agentive process of developing a plan that specifies a set of actions in order to meet a set of goals or objectives.
    def self.planning
      RDF::URI.new('http://semanticscience.org/resource/SIO_000739')
    end

    # a curve segment is a part of a curve that consists of at least three points.
    def self.curve_segment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000740')
    end

    # a stationary point is a point that is part of a curve in which the derivative at that point is zero, and hence its value is at least a local maximum or minimum.
    def self.stationary_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000741')
    end

    def self.local_maximum_stationary_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000742')
    end

    def self.local_minimum_stationary_point
      RDF::URI.new('http://semanticscience.org/resource/SIO_000743')
    end

    # learning is the agentive process of acquiring knowledge.
    def self.learning
      RDF::URI.new('http://semanticscience.org/resource/SIO_000744')
    end

    # comparison  is the agentive process of examining and determining equality or inequality on some selected features.
    def self.comparison
      RDF::URI.new('http://semanticscience.org/resource/SIO_000745')
    end

    # reasoning is the agentive process of using knowledge to evaluate the truth value of a proposition.
    def self.reasoning
      RDF::URI.new('http://semanticscience.org/resource/SIO_000746')
    end

    # investigation is the process of carrying out a study so as to discover facts or information about the object of study.
    def self.investigation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000747')
    end

    # prediction is the process of formulating a proposition about a state of affairs which might be realized in the future.
    def self.prediction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000748')
    end

    def self.database
      RDF::URI.new('http://semanticscience.org/resource/SIO_000750')
    end

    # A quality that has a value that is decreased compared to normal or average.
    def self.decreased
      RDF::URI.new('http://semanticscience.org/resource/SIO_000751')
    end

    # A row represents a single, implicitly structured data item in a table. 
    def self.row
      RDF::URI.new('http://semanticscience.org/resource/SIO_000752')
    end

    def self.column
      RDF::URI.new('http://semanticscience.org/resource/SIO_000753')
    end

    # a database table is a set of named columns with zero or more rows composed of cells that contain column values and is part of a database.
    def self.database_table
      RDF::URI.new('http://semanticscience.org/resource/SIO_000754')
    end

    def self.cell_informational
      RDF::URI.new('http://semanticscience.org/resource/SIO_000755')
    end

    # A database record is a single, implicitly structured data item in a table.
    def self.database_record
      RDF::URI.new('http://semanticscience.org/resource/SIO_000756')
    end

    def self.database_column
      RDF::URI.new('http://semanticscience.org/resource/SIO_000757')
    end

    # disorder is the quality that inheres in one or more anatomical parts (an anatomical collection) which is considered abnormal
    def self.disorder
      RDF::URI.new('http://semanticscience.org/resource/SIO_000758')
    end

    def self.unique_cell
      RDF::URI.new('http://semanticscience.org/resource/SIO_000759')
    end

    def self.referencing_cell
      RDF::URI.new('http://semanticscience.org/resource/SIO_000760')
    end

    def self.referent_cell
      RDF::URI.new('http://semanticscience.org/resource/SIO_000761')
    end

    # A database key is an informational entity whose value is constructed from one or more database columns.
    def self.database_key
      RDF::URI.new('http://semanticscience.org/resource/SIO_000762')
    end

    # A primary database key is a database key that identifies every row of a table.
    def self.primary_database_key
      RDF::URI.new('http://semanticscience.org/resource/SIO_000763')
    end

    # a foreign database key is a database key that refers to a key in some table
    def self.foreign_database_key
      RDF::URI.new('http://semanticscience.org/resource/SIO_000764')
    end

    # probabilty value is the relative frequency of occurrence of an outcome.
    def self.probability_value
      RDF::URI.new('http://semanticscience.org/resource/SIO_000765')
    end

    def self.street_name
      RDF::URI.new('http://semanticscience.org/resource/SIO_000766')
    end

    def self.postal_code
      RDF::URI.new('http://semanticscience.org/resource/SIO_000767')
    end

    def self.apartment_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000768')
    end

    # the uncertainty value (margin of error) of a measurement is a range of values likely to enclose the true value. 
    def self.uncertainty_value
      RDF::URI.new('http://semanticscience.org/resource/SIO_000769')
    end

    # a standard deviation (represented by the symbol σ) is the quantity of  variation from the average (mean, or expected value).
    def self.standard_deviation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000770')
    end

    # a versioned record is a record for which there exists another variant based that was derived via modification of the facts.
    def self.versioned_record
      RDF::URI.new('http://semanticscience.org/resource/SIO_000771')
    end

    # An object is an entity that is wholly identifiable at any instant of time during which it exists.
    def self.object
      RDF::URI.new('http://semanticscience.org/resource/SIO_000776')
    end

    # to be a member of is the capability to be considered a part of a collection.
    def self.to_be_a_member_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_000777')
    end

    # to distort is the capability to change the appearance of an entity by some transformation.
    def self.to_distort
      RDF::URI.new('http://semanticscience.org/resource/SIO_000778')
    end

    # a primer is a nucleic acid that enables the synthesis of a complement strand of DNA by binding to it and acting as a point of transcription initiation.
    def self.primer
      RDF::URI.new('http://semanticscience.org/resource/SIO_000779')
    end

    # to bind to is the capability to physically interact with another object through a set of non-covalent interactions.
    def self.to_bind_to
      RDF::URI.new('http://semanticscience.org/resource/SIO_000780')
    end

    def self.spatial_boundary
      RDF::URI.new('http://semanticscience.org/resource/SIO_000783')
    end

    # hermaphrodite is a biological sex of an individual with both male and female sexual organs.
    def self.hermaphrodite
      RDF::URI.new('http://semanticscience.org/resource/SIO_000784')
    end

    # an answer is a reply to a question.
    def self.answer
      RDF::URI.new('http://semanticscience.org/resource/SIO_000785')
    end

    def self.speech_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000786')
    end

    def self.page_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_000787')
    end

    # a linear position is the position of some object against a linear positioning system.
    def self.linear_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000788')
    end

    # a sequence element position is the position of an element of a linear sequence.
    def self.sequence_element_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000789')
    end

    def self.vertical_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000790')
    end

    # a sequence start position is the start position for a sequence of characters.
    def self.sequence_start_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000791')
    end

    # a sequence stop position is the stop position for a sequence of characters.
    def self.sequence_stop_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000792')
    end

    # The number of elements of a finite set of objects.
    def self.count
      RDF::URI.new('http://semanticscience.org/resource/SIO_000794')
    end

    # a chemical role is a processual role held by a chemical entity
    def self.chemical_entity_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000795')
    end

    # the role of a chemical participant that serves to increase the rate of reaction by lowering the activiation energy.
    def self.catalytic_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000796')
    end

    # the role of a chemical entity that is modified in a chemical reaction
    def self.substrate_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000797')
    end

    # the role of a chemical entity present at the end of a chemical reaction.
    def self.product_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000798')
    end

    # the role of a chemical entity involved in the mechanism for enzyme-mediated catalysis.
    def self.cofactor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000799')
    end

    # a co-factor role in which the chemical entity is modified during catalysis and must be regenerated.
    def self.co_enzyme_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000800')
    end

    # a coenzyme role of a chemical entity that is covalently bonded to the  enzyme.
    def self.prosthetic_group_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000801')
    end

    # a co-enzyme role of a chemical entity that is transiently associated, and is regenerated in a separate reaction.
    def self.co_substrate_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000802')
    end

    # the role of a chemical entity that reduces the rate of reaction.
    def self.inhibitor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000803')
    end

    # the role of a chemical entity that increases the rate of reaction.
    def self.activator_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000804')
    end

    # The quality of having a charge
    def self.charged
      RDF::URI.new('http://semanticscience.org/resource/SIO_000805')
    end

    # the quality of not having a charge
    def self.uncharged
      RDF::URI.new('http://semanticscience.org/resource/SIO_000806')
    end

    def self.partial_positive_charge
      RDF::URI.new('http://semanticscience.org/resource/SIO_000807')
    end

    def self.partial_negative_charge
      RDF::URI.new('http://semanticscience.org/resource/SIO_000808')
    end

    def self.partial_charge
      RDF::URI.new('http://semanticscience.org/resource/SIO_000809')
    end

    def self.unitary_charge
      RDF::URI.new('http://semanticscience.org/resource/SIO_000810')
    end

    # a Uniform Resource Locator or Universal Resource Locator (URL) is a specific character string that constitutes a reference to an Internet resource.
    def self.URL
      RDF::URI.new('http://semanticscience.org/resource/SIO_000811')
    end

    # affection is an emotion characterized with a feeling or type of love for another living thing.
    def self.affection
      RDF::URI.new('http://semanticscience.org/resource/SIO_000812')
    end

    # angst is the intense feeling of apprehension, anxiety or inner turmoil.
    def self.angst
      RDF::URI.new('http://semanticscience.org/resource/SIO_000813')
    end

    # Annoyance is an unpleasant emtion that is characterized by a abnormal or excessive sensitivity to some external stimulus.
    def self.annoyance
      RDF::URI.new('http://semanticscience.org/resource/SIO_000814')
    end

    # anxiety is an emotion charactersized by intense feeling of fear and concern coupled with a physical response.
    def self.anxiety
      RDF::URI.new('http://semanticscience.org/resource/SIO_000815')
    end

    # apathy is an emotion exhibited by lack of interest, enthusiasm, or concern
    def self.apathy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000816')
    end

    # Arousal is an emotion characterized by state of reactive to stimuli. It involves the activation of the reticular activating system in the brain stem, the autonomic nervous system and the endocrine system, leading to increased heart rate and blood pressure and a condition of sensory alertness, mobility and readiness to respond.
    def self.arousal
      RDF::URI.new('http://semanticscience.org/resource/SIO_000817')
    end

    # Awe is an emotion produced by that which is grand, sublime or powerful and is characterized by a combination of joy, fear and admiration/reverence/respect. 
    def self.awe
      RDF::URI.new('http://semanticscience.org/resource/SIO_000818')
    end

    # boldness is the trait of being willing to undertake things that involve risk or danger.
    def self.boldness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000819')
    end

    # boredom is the emotion experience by those not interested in their surroundings or available activities.
    def self.boredom
      RDF::URI.new('http://semanticscience.org/resource/SIO_000820')
    end

    # contempt is disgust  towards a lower status individual.
    def self.contempt
      RDF::URI.new('http://semanticscience.org/resource/SIO_000821')
    end

    # contentment is an emotion characterized by acknowledgement and satisfaction of the current state of affairs.
    def self.contentment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000822')
    end

    # curiosity is the strong desire to know or learn something.
    def self.curiosity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000823')
    end

    # depression is an unpleasant emotion linked to aversion to activity that can affect a person's thoughts, behavior, feelings and physical well-being. Depressed individuals may feel sad, anxious, empty, hopeless, worried, helpless, worthless, guilty, irritable, or restless.
    def self.depression
      RDF::URI.new('http://semanticscience.org/resource/SIO_000824')
    end

    # Desire is a strong emotion of wanting to have something or wishing for something to happen.
    def self.desire
      RDF::URI.new('http://semanticscience.org/resource/SIO_000825')
    end

    # despair is depression, hopelessness or lack of hope
    def self.despair
      RDF::URI.new('http://semanticscience.org/resource/SIO_000826')
    end

    # Disappointment is the feeling of dissatisfaction that follows the failure of expectations or hopes to manifest
    def self.disappointment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000827')
    end

    # Disgust is a feeling of revulsion or profound disapproval aroused by something unpleasant or offensive.
    def self.disgust
      RDF::URI.new('http://semanticscience.org/resource/SIO_000828')
    end

    # dread is the instense negative emotion that induces fear and apprehension.
    def self.dread
      RDF::URI.new('http://semanticscience.org/resource/SIO_000829')
    end

    # ecstacy is an emotion characterized by a heightened state of consciousness with total involvement of a subject.
    def self.ecstasy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000830')
    end

    # a positive emotion is an emotion that feels good.
    def self.positive_emotion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000831')
    end

    # negative emotion is an emotion that does not feel good.
    def self.negative_emotion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000832')
    end

    # Embarrassment is the emotion of intense discomfort with oneself, experienced upon having a socially unacceptable act or condition witnessed by or revealed to other.
    def self.embarassment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000833')
    end

    # envy is an emotion that occurs when a person lacks another's (perceived) superior quality, achievement or possession and wishes that the other lacked it.
    def self.envy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000834')
    end

    # euphoria is an emotion characterized by intense feelings of well-being, elation, happiness, ecstasy, excitement, and joy.
    def self.euphoria
      RDF::URI.new('http://semanticscience.org/resource/SIO_000835')
    end

    def self.excitement
      RDF::URI.new('http://semanticscience.org/resource/SIO_000836')
    end

    # Fear is a negative emotion induced by a perceived threat that induces one to hide or move quickly away from the location of the perceived threat.
    def self.fear
      RDF::URI.new('http://semanticscience.org/resource/SIO_000837')
    end

    # Frustration is an emotion that arises from the perceived resistance to the fulfillment of individual will. 
    def self.frustration
      RDF::URI.new('http://semanticscience.org/resource/SIO_000838')
    end

    # Gratitude, thankfulness, gratefulness, or appreciation is a feeling, emotion or attitude in acknowledgment of a benefit that one has received or will receive.
    def self.gratitude
      RDF::URI.new('http://semanticscience.org/resource/SIO_000839')
    end

    # Happiness is an emotion characterized by positive or pleasant emotions ranging from contentment to intense joy.
    def self.happiness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000840')
    end

    # Guilt is the emotion borne from feeling responsible for the commission of an offense and arises out of public humiliation.
    def self.guilt
      RDF::URI.new('http://semanticscience.org/resource/SIO_000841')
    end

    # Grief is an emotion in response to loss, whether physical or abstract including death, unemployment, ill health or the end of a relationship.
    def self.grief
      RDF::URI.new('http://semanticscience.org/resource/SIO_000842')
    end

    # hope is an emotion of belief in a positive outcome related to events and circumstances in one's life.
    def self.hope
      RDF::URI.new('http://semanticscience.org/resource/SIO_000843')
    end

    # Hostility is the intense negative emotion of being in conflict or opposition to someone or something.
    def self.hostility
      RDF::URI.new('http://semanticscience.org/resource/SIO_000844')
    end

    # hurt is an unpleasant feeling, emotion or sensation.
    def self.hurt
      RDF::URI.new('http://semanticscience.org/resource/SIO_000845')
    end

    # Hysteria is an unmanageable emotion.
    def self.hysteria
      RDF::URI.new('http://semanticscience.org/resource/SIO_000846')
    end

    # indifference is an emotion exhibited by lack of interest, concern, or sympathy.
    def self.indifference
      RDF::URI.new('http://semanticscience.org/resource/SIO_000847')
    end

    # interest is the emotion of wanting to know or learn about something or someone.
    def self.interest
      RDF::URI.new('http://semanticscience.org/resource/SIO_000848')
    end

    # jealousy is an emotion and typically refers to the negative thoughts and feelings of insecurity, fear, and anxiety over an anticipated loss of something that the person values, particularly in reference to a human connection
    def self.jealousy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000849')
    end

    def self.joy
      RDF::URI.new('http://semanticscience.org/resource/SIO_000850')
    end

    # loathing is an intense dislike or disgust.
    def self.loathing
      RDF::URI.new('http://semanticscience.org/resource/SIO_000851')
    end

    # Loneliness is an unpleasant emotion in which a person feels a strong sense of emptiness, yearning distress and solitude resulting from inadequate quantity or quality of social relationships.
    def self.loneliness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000852')
    end

    # lust is the strong desire for sex.
    def self.lust
      RDF::URI.new('http://semanticscience.org/resource/SIO_000853')
    end

    # Misery is a feeling of great unhappiness, suffering and/or pain.
    def self.misery
      RDF::URI.new('http://semanticscience.org/resource/SIO_000854')
    end

    # Panic is a sudden emotion of fear which is so strong as to dominate or prevent reason and logical thinking, replacing it with overwhelming feelings of anxiety and frantic agitation consistent with an animalistic fight-or-flight reaction.
    def self.panic
      RDF::URI.new('http://semanticscience.org/resource/SIO_000855')
    end

    # passion is the intense emotion compelling feeling, enthusiasm, or desire for something.
    def self.passion
      RDF::URI.new('http://semanticscience.org/resource/SIO_000856')
    end

    # Pity is the emotion of sadness or sorrow for another.
    def self.pity
      RDF::URI.new('http://semanticscience.org/resource/SIO_000857')
    end

    def self.pleasure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000858')
    end

    # Pride is an emotion of satisfaction of attachment toward one's own or another's choices and actions, or toward a whole group of people, and is a product of praise, independent self-reflection, or a fulfilled feeling of belonging.
    def self.pride
      RDF::URI.new('http://semanticscience.org/resource/SIO_000859')
    end

    # Rage is a feeling of intense anger that is  associated with the Fight-or-flight response.
    def self.rage
      RDF::URI.new('http://semanticscience.org/resource/SIO_000860')
    end

    def self.regret
      RDF::URI.new('http://semanticscience.org/resource/SIO_000861')
    end

    def self.remorse
      RDF::URI.new('http://semanticscience.org/resource/SIO_000862')
    end

    # sadness is emotional pain associated with, or characterized by feelings of disadvantage, loss, despair, helplessness, sorrow, and rage.
    def self.sadness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000863')
    end

    def self.satisfaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000864')
    end

    # shame is the emotion borne from feeling responsible for the commission of an offense.
    def self.shame
      RDF::URI.new('http://semanticscience.org/resource/SIO_000865')
    end

    # shock is an emotion of sudden upset or surprise.
    def self.shock
      RDF::URI.new('http://semanticscience.org/resource/SIO_000866')
    end

    # shyness is an emotion of apprehension, lack of comfort, or awkwardness experienced when in proximity to, approaching, or being approached by other individuals, especially in new situations or with unfamiliar individuals.
    def self.shyness
      RDF::URI.new('http://semanticscience.org/resource/SIO_000867')
    end

    # Sorrow is the emotion that is characterized by a long term state of intense sadness, distress and a degree of resignation (not accepting).
    def self.sorrow
      RDF::URI.new('http://semanticscience.org/resource/SIO_000868')
    end

    # Suffering is the unpleasant emotion and aversion associated with the perception of harm or threat of harm in an individual.
    def self.suffering
      RDF::URI.new('http://semanticscience.org/resource/SIO_000869')
    end

    # Surprise is a brief emotion experienced as the result of an unexpected event. 
    def self.surprise
      RDF::URI.new('http://semanticscience.org/resource/SIO_000870')
    end

    # terror is the extreme feeling of fear.
    def self.terror
      RDF::URI.new('http://semanticscience.org/resource/SIO_000871')
    end

    # Wonder is an emotion of perceiving something very rare or unexpected, but not threatening.
    def self.wonder
      RDF::URI.new('http://semanticscience.org/resource/SIO_000872')
    end

    # worry is the emotion characterized by concer over a real or imaginary issue.
    def self.worry
      RDF::URI.new('http://semanticscience.org/resource/SIO_000873')
    end

    def self.department_chair_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000875')
    end

    def self.student_advisor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000876')
    end

    def self.undergraduate_student_advisor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000877')
    end

    def self.graduate_student_advisor_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000878')
    end

    def self.reactant_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000879')
    end

    # the role of a chemical entity that modifies the rate of reaction.
    def self.regulator_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000880')
    end

    def self.investigational_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000881')
    end

    # the role of an organism in providing resources to maintain the survival and/or reproduction of another organism.
    def self.host_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000882')
    end

    def self.subject_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000883')
    end

    def self.publishing_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000884')
    end

    # the role of an agent that prepares and issues creative works.
    def self.publisher_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000885')
    end

    # the role of an agent that creates a written work.
    def self.author_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000886')
    end

    # a buffer role is the role of a chemical substance which maintains a pH at a near constant value.
    def self.buffer_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000887')
    end

    # a chemical substance role is a chemical entity role held by a chemical substance
    def self.chemical_substance_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000888')
    end

    # a molecular entity role is a chemical entity role held by a molecule
    def self.molecular_entity_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000889')
    end

    # a toxin role is a toxic role of a chemical substance that is poisonous and  is produced by an organism
    def self.toxin_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000890')
    end

    # a toxic role is the role of a chemical substance that is poisonous
    def self.toxic_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000891')
    end

    # a role of a chemical substance that participates in a chemical reaction as part of some scientific investigation.
    def self.reagent_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000893')
    end

    # to luminesce is to emit light through cold body radiation
    def self.to_luminesce
      RDF::URI.new('http://semanticscience.org/resource/SIO_000894')
    end

    # to fluoresce is to emit light as a result of absorbing light or other electromagnetic radiation.
    def self.to_fluoresce
      RDF::URI.new('http://semanticscience.org/resource/SIO_000895')
    end

    # a molecular tracer role is a reactant role of a molecular entity that serves as a marker for the presence, abundance, or location of a molecular target that it associates with.
    def self.molecular_tracer_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000896')
    end

    # an assocation is a relationship between two or more entities derived by some informational anlysis.
    def self.association
      RDF::URI.new('http://semanticscience.org/resource/SIO_000897')
    end

    # a statistical association is any relationship between two measured quantities that renders them statistically dependent.
    def self.statistical_association
      RDF::URI.new('http://semanticscience.org/resource/SIO_000898')
    end

    # a chromosome is a molecular complex of circular or linear DNA and bound proteins.
    def self.chromosome
      RDF::URI.new('http://semanticscience.org/resource/SIO_000899')
    end

    # A top value axis is a value axis that is spatially positioned to the top of the plot area.
    def self.top_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000902')
    end

    # A bottom value axis is a value axis that is spatially positioned to the bottom of the plot area.
    def self.bottom_value_axis
      RDF::URI.new('http://semanticscience.org/resource/SIO_000903')
    end

    # A chart is a figure that displays the relationship among tabular numeric data, functions or some kinds of qualitative structures.
    def self.chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000904')
    end

    # A map is a a visual representation of an area that depicts the relationship between elements of that space.
    def self.map
      RDF::URI.new('http://semanticscience.org/resource/SIO_000906')
    end

    # A heatmap is a graphical representation of data where the individual values contained in a matrix are represented as colors.
    def self.heatmap
      RDF::URI.new('http://semanticscience.org/resource/SIO_000907')
    end

    # a steamgraph is a multi-line stacked graph that yields the appearance of continuous y-values across the x-axis.
    def self.steamgraph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000908')
    end

    # A boxplot (box-and-whisker diagram) is a convenient way of graphically depicting groups of numerical data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum).
    def self.boxplot
      RDF::URI.new('http://semanticscience.org/resource/SIO_000909')
    end

    # A geographic heatmap is a graphical representation of data over a geographic region where individual values are represented as colors.
    def self.geographic_heatmap
      RDF::URI.new('http://semanticscience.org/resource/SIO_000910')
    end

    # a histogram is a graphical representation of data which consists of tabular frequencies, shown as adjacent rectangles, over discrete intervals (bins) , with an area equal to the frequency of the observations in the interval.
    def self.histogram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000911')
    end

    # a measurement scale is a functional specification that specifies an allowed range of categories or values.
    def self.measurement_scale
      RDF::URI.new('http://semanticscience.org/resource/SIO_000912')
    end

    # A nominal scale of measurement only specifies a limited set of categories.
    def self.nomimal_scale
      RDF::URI.new('http://semanticscience.org/resource/SIO_000913')
    end

    # a binary scale is a measurement scale that specifies a choice between two values.
    def self.binary_scale
      RDF::URI.new('http://semanticscience.org/resource/SIO_000914')
    end

    # a numeric scale of measurement is one that only specifies numeric values
    def self.numeric_scale
      RDF::URI.new('http://semanticscience.org/resource/SIO_000915')
    end

    # a decimal scale of measurement is one that only specifies decimal values
    def self.decimal_scale
      RDF::URI.new('http://semanticscience.org/resource/SIO_000916')
    end

    # an integer scale of measurement is one that only specifies integer values.
    def self.integer_scale
      RDF::URI.new('http://semanticscience.org/resource/SIO_000917')
    end

    # modification is the process by which an entity gains or loses parts, qualities, roles, dispositions, functions, etc, but maintains their identity through these changes.
    def self.modification
      RDF::URI.new('http://semanticscience.org/resource/SIO_000918')
    end

    # Reproduction is the process by which a new entity is created based on another entity.
    def self.reproduction
      RDF::URI.new('http://semanticscience.org/resource/SIO_000919')
    end

    # an independent variable is a variable that may take on different values independent of other elements in a system.
    def self.independent_variable
      RDF::URI.new('http://semanticscience.org/resource/SIO_000920')
    end

    # A dependent variable is one whose value changes as a consequence of changes in other values in the system
    def self.dependent_variable
      RDF::URI.new('http://semanticscience.org/resource/SIO_000921')
    end

    # A Gantt chart is a bar chart that illustrates a project schedule.
    def self.Gantt_chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000922')
    end

    # a correlation is a statistical relationship involving dependence between two random variables or datasets.
    def self.correlation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000923')
    end

    def self.television_program
      RDF::URI.new('http://semanticscience.org/resource/SIO_000924')
    end

    def self.radio
      RDF::URI.new('http://semanticscience.org/resource/SIO_000926')
    end

    def self.telephone
      RDF::URI.new('http://semanticscience.org/resource/SIO_000927')
    end

    def self.radar
      RDF::URI.new('http://semanticscience.org/resource/SIO_000928')
    end

    # A pie chart is a circular chart divided into sectors each of whose length  is proportional to the quantity it represents.
    def self.pie_chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000929')
    end

    # A matrix chart summarizes a multidimensional data set in a grid.
    def self.matrix_chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000930')
    end

    # A network diagram consists of a set of vertices connected by edges.
    def self.network_diagram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000931')
    end

    # A block histogram contains an x-axis that is divided into bins which correspond to value ranges. Each item in the data set is drawn as a rectangular block, and the blocks are piled into the bins to show how many values in each range.
    def self.block_histogram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000932')
    end

    # A bubble chart contains circles whose area corresponds to a value. 
    def self.bubble_chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000933')
    end

    # A stack graph is a statistical graph which presents multiple series in which the distance between one series and another indicates the relative contribution to the total for any x-value.
    def self.stack_graph
      RDF::URI.new('http://semanticscience.org/resource/SIO_000934')
    end

    # a treemap is a chart that fully partitions the area into a set of rectangles whose area represents its relative value.
    def self.treemap
      RDF::URI.new('http://semanticscience.org/resource/SIO_000935')
    end

    # a word tree is a chart that links phrases with contexts through a tree-like branching structure.
    def self.word_tree
      RDF::URI.new('http://semanticscience.org/resource/SIO_000936')
    end

    def self.textual_chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000937')
    end

    # a tag cloud is a visualization of word frequencies.
    def self.tag_cloud
      RDF::URI.new('http://semanticscience.org/resource/SIO_000938')
    end

    # A phrase net diagram illustrates the relationship between different words used in a text.
    def self.phrase_net_diagram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000939')
    end

    # a mereological chart is a chart that illustrates the parts in the context of the whole.
    def self.mereological_chart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000940')
    end

    # A conversation is a form of interactive, spontaneous communication between two or more people who are following rules of etiquette.
    def self.conversation
      RDF::URI.new('http://semanticscience.org/resource/SIO_000941')
    end

    def self.numeric_label
      RDF::URI.new('http://semanticscience.org/resource/SIO_000942')
    end

    # a start position is the proximal position of an object relative to an origin in a linear system.
    def self.start_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000943')
    end

    # an interval is a set of real numbers that includes all numbers between any two numbers in the set.
    def self.interval
      RDF::URI.new('http://semanticscience.org/resource/SIO_000944')
    end

    # A tree diagram is a hierarchical network diagram in which a root vertex is connected to one or more other vertices through a directed edge, which in turn may be connected to other vertices.
    def self.tree_diagram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000945')
    end

    # A flowchart is a diagram that represents an algorithm or process, showing the steps as boxes of various kinds, and their order by connecting these with arrows.
    def self.flowchart
      RDF::URI.new('http://semanticscience.org/resource/SIO_000946')
    end

    # A Venn diagram is a chart that illustrates all possible logical relations between a finite collection of sets as overlapping circles.
    def self.venn_diagram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000947')
    end

    # A dendrogram is a tree diagram used to illustrate the arrangement of the clusters produced by hierarchical clustering.
    def self.dendrogram
      RDF::URI.new('http://semanticscience.org/resource/SIO_000948')
    end

    # apprehension is the negative emotion that something unpleasant will occur.
    def self.apprehension
      RDF::URI.new('http://semanticscience.org/resource/SIO_000949')
    end

    # resentment is disgust directed toward a higher status individual.
    def self.resentment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000950')
    end

    # Pain is an unpleasant sensory and emotional experience associated with actual or potential tissue damage, or described in terms of such damage
    def self.pain
      RDF::URI.new('http://semanticscience.org/resource/SIO_000951')
    end

    # a default parameter is a parameter which has a default value.
    def self.default_parameter
      RDF::URI.new('http://semanticscience.org/resource/SIO_000952')
    end

    # a stop position is the distal position of an object relative to an origin in a linear system.
    def self.stop_position
      RDF::URI.new('http://semanticscience.org/resource/SIO_000953')
    end

    def self.sick
      RDF::URI.new('http://semanticscience.org/resource/SIO_000954')
    end

    def self.environment
      RDF::URI.new('http://semanticscience.org/resource/SIO_000955')
    end

    def self.device
      RDF::URI.new('http://semanticscience.org/resource/SIO_000956')
    end

    def self.audio_communication_device
      RDF::URI.new('http://semanticscience.org/resource/SIO_000957')
    end

    # failed process role is the role of a process that does not complete the requirements of the expected process type.
    def self.failed_process
      RDF::URI.new('http://semanticscience.org/resource/SIO_000958')
    end

    # existence quality is the quality of an entity that describe in what environment it is known to exist.
    def self.existence_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000959')
    end

    # realistic is the quality of an entity that exists in real space and time.
    def self.realistic
      RDF::URI.new('http://semanticscience.org/resource/SIO_000960')
    end

    # fiction is the quality of an entity that exists only in a creative work.
    def self.fictional
      RDF::URI.new('http://semanticscience.org/resource/SIO_000961')
    end

    # virtual is the quality of an entity that exists only in a virtual setting such as a simulation or game environment.
    def self.virtual
      RDF::URI.new('http://semanticscience.org/resource/SIO_000962')
    end

    # not started is the status of a process that is predicted to exist but has not yet begun.
    def self.not_started
      RDF::URI.new('http://semanticscience.org/resource/SIO_000963')
    end

    def self.standard_operating_procedure
      RDF::URI.new('http://semanticscience.org/resource/SIO_000964')
    end

    def self.agreement_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_000965')
    end

    def self.agreed
      RDF::URI.new('http://semanticscience.org/resource/SIO_000966')
    end

    def self.disagreed
      RDF::URI.new('http://semanticscience.org/resource/SIO_000967')
    end

    def self.poison_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_000968')
    end

    def self.communication
      RDF::URI.new('http://semanticscience.org/resource/SIO_000969')
    end

    # a study is an investigation that tests the truth value of a proposition by testing the null hypothesis.
    def self.study
      RDF::URI.new('http://semanticscience.org/resource/SIO_000976')
    end

    def self.organism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010000')
    end

    def self.cell
      RDF::URI.new('http://semanticscience.org/resource/SIO_010001')
    end

    # a tissue is a mereologically maximal collection of cells that together perform some function.
    def self.tissue
      RDF::URI.new('http://semanticscience.org/resource/SIO_010002')
    end

    def self.organ
      RDF::URI.new('http://semanticscience.org/resource/SIO_010003')
    end

    # A chemical entity is a material entity that pertains to chemistry.
    def self.chemical_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_010004')
    end

    # a weak submolecular component is a submolecular component that weakly connects submolecular components.
    def self.weak_submolecular_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010005')
    end

    def self.polypeptide
      RDF::URI.new('http://semanticscience.org/resource/SIO_010007')
    end

    def self.nucleic_acid
      RDF::URI.new('http://semanticscience.org/resource/SIO_010008')
    end

    def self.ribonucleic_acid
      RDF::URI.new('http://semanticscience.org/resource/SIO_010009')
    end

    def self.deoxyribonucleic_acid
      RDF::URI.new('http://semanticscience.org/resource/SIO_010010')
    end

    def self.lipid
      RDF::URI.new('http://semanticscience.org/resource/SIO_010011')
    end

    # A chemical interaction is a biochemical process in which chemical entities interact through some set of attractive forces.
    def self.chemical_interaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010013')
    end

    def self.primary_structure_descriptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_010014')
    end

    def self.protein_sequence
      RDF::URI.new('http://semanticscience.org/resource/SIO_010015')
    end

    def self.nucleic_acid_sequence
      RDF::URI.new('http://semanticscience.org/resource/SIO_010016')
    end

    def self.ribonucleic_acid_sequence
      RDF::URI.new('http://semanticscience.org/resource/SIO_010017')
    end

    def self.deoxyribonucleic_acid_sequence
      RDF::URI.new('http://semanticscience.org/resource/SIO_010018')
    end

    # Biological data is scientific data relevant to biology.
    def self.biological_data
      RDF::URI.new('http://semanticscience.org/resource/SIO_010019')
    end

    # A submolecular entity is a part of a molecular entity.
    def self.submolecular_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_010020')
    end

    def self.secondary_structure_descriptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_010022')
    end

    def self.tertiary_structure_descriptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_010023')
    end

    def self.quaternary_structure
      RDF::URI.new('http://semanticscience.org/resource/SIO_010024')
    end

    def self.carbohydrate_polymer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010025')
    end

    # genetic polymorphism is a biological feature that provides information about a comparative difference in genetic composition.
    def self.genetic_polymorphism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010026')
    end

    # single nucleotide polymorphism (SNP) is a variation in a single base in the genetic composition between different individuals of the same species.
    def self.snp
      RDF::URI.new('http://semanticscience.org/resource/SIO_010027')
    end

    def self.genetic_data
      RDF::URI.new('http://semanticscience.org/resource/SIO_010028')
    end

    def self.biological_sex
      RDF::URI.new('http://semanticscience.org/resource/SIO_010029')
    end

    def self.monosaccharide
      RDF::URI.new('http://semanticscience.org/resource/SIO_010030')
    end

    # A PDB chain identifier is a alphabetical label to identify a molecule in a structure.
    def self.PDB_chain_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_010031')
    end

    # A PDB record identifier is an identifier for a PDB generated record.
    def self.PDB_record_identifier
      RDF::URI.new('http://semanticscience.org/resource/SIO_010032')
    end

    # a hydrogen bond is a weak submolecular interaction formed between a hydrogen atom and a electronegative atom.
    def self.hydrogen_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010033')
    end

    # A cation pi interaction is an ionic interaction between the localized negative charge of π orbital electrons, located above and below the plane of an aromatic ring, and a positive charge.
    def self.cation_pi_interaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010034')
    end

    # A gene is part of a nucleic acid that contains all the necessary elements to encode a functional transcript.
    def self.gene
      RDF::URI.new('http://semanticscience.org/resource/SIO_010035')
    end

    # A biochemical reaction is a biochemical process that involves the conversion of at least one chemical participant (target) into another (product) by an enzyme (agent).
    def self.biochemical_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010036')
    end

    # a chemical element is a homogeneous substance composed of one type of atom.
    def self.chemical_element
      RDF::URI.new('http://semanticscience.org/resource/SIO_010037')
    end

    # A drug is a chemical entity that regulates a biological process.
    def self.drug
      RDF::URI.new('http://semanticscience.org/resource/SIO_010038')
    end

    # A pharmaceutical preparation is a chemical substance approved for use in the medical diagnosis, cure, treatment, or prevention of disease.
    def self.pharmaceutical_preparation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010039')
    end

    def self.binding_site
      RDF::URI.new('http://semanticscience.org/resource/SIO_010040')
    end

    def self.active_site
      RDF::URI.new('http://semanticscience.org/resource/SIO_010041')
    end

    def self.protein
      RDF::URI.new('http://semanticscience.org/resource/SIO_010043')
    end

    # An atom is composed of a core of protons and/or neutrons which may be surrounded by a cloud of electrons.
    def self.atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_010044')
    end

    # a base pair is a weak molecular interaction composed of hydrogen bonds between nucleobases.
    def self.base_pair
      RDF::URI.new('http://semanticscience.org/resource/SIO_010045')
    end

    def self.biological_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_010046')
    end

    # a strong submolecular component is a submolecular component that strongly connects submolecular components.
    def self.strong_submolecular_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010047')
    end

    # male is a biological sex of an individual with male sexual organs.
    def self.male
      RDF::URI.new('http://semanticscience.org/resource/SIO_010048')
    end

    def self.molecular_site
      RDF::URI.new('http://semanticscience.org/resource/SIO_010049')
    end

    def self.allosteric_site
      RDF::URI.new('http://semanticscience.org/resource/SIO_010050')
    end

    def self.biological_fluid
      RDF::URI.new('http://semanticscience.org/resource/SIO_010051')
    end

    # female is a biological sex of an individual with female sexual organs.
    def self.female
      RDF::URI.new('http://semanticscience.org/resource/SIO_010052')
    end

    def self.lineage
      RDF::URI.new('http://semanticscience.org/resource/SIO_010053')
    end

    # A cell line is a collection of genetically identifical cells.
    def self.cell_line
      RDF::URI.new('http://semanticscience.org/resource/SIO_010054')
    end

    # A strain is a genetic variant or kind of microorganism.
    def self.strain
      RDF::URI.new('http://semanticscience.org/resource/SIO_010055')
    end

    # a phenotype is an observable characteristic of an individual.
    def self.phenotype
      RDF::URI.new('http://semanticscience.org/resource/SIO_010056')
    end

    def self.organismal_stative_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_010057')
    end

    def self.alive
      RDF::URI.new('http://semanticscience.org/resource/SIO_010058')
    end

    def self.dead
      RDF::URI.new('http://semanticscience.org/resource/SIO_010059')
    end

    def self.family_history
      RDF::URI.new('http://semanticscience.org/resource/SIO_010060')
    end

    def self.generation_number
      RDF::URI.new('http://semanticscience.org/resource/SIO_010061')
    end

    # The five prime untranslated region (5' UTR) is a section of messenger RNA (mRNA) and the DNA that codes for it that starts at the +1 position (where transcription begins) and ends one nucleotide before the start codon (usually AUG) of the coding region.
    def self.a_untranslated_region
      RDF::URI.new('http://semanticscience.org/resource/SIO_010064')
    end

    def self.bioinformatic_data
      RDF::URI.new('http://semanticscience.org/resource/SIO_010065')
    end

    def self.sequence_alignment
      RDF::URI.new('http://semanticscience.org/resource/SIO_010066')
    end

    def self.multiple_sequence_alignment
      RDF::URI.new('http://semanticscience.org/resource/SIO_010067')
    end

    def self.pairwise_sequence_alignment
      RDF::URI.new('http://semanticscience.org/resource/SIO_010068')
    end

    def self.a_untranslated_region
      RDF::URI.new('http://semanticscience.org/resource/SIO_010070')
    end

    def self.organic_submolecule
      RDF::URI.new('http://semanticscience.org/resource/SIO_010071')
    end

    # An organic molecular entity is a chemical entity composed of organic atoms (at least carbon, hydrogen, and optionally oxygen, phosphorus, nitrogen)
    def self.organic_molecule
      RDF::URI.new('http://semanticscience.org/resource/SIO_010072')
    end

    def self.open_reading_frame
      RDF::URI.new('http://semanticscience.org/resource/SIO_010073')
    end

    def self.amino_acid_residue
      RDF::URI.new('http://semanticscience.org/resource/SIO_010074')
    end

    def self.nucleotide_residue
      RDF::URI.new('http://semanticscience.org/resource/SIO_010075')
    end

    # A poison is a drug that is harzardous or toxic to an organism when ingested at a certain quantity.
    def self.poison
      RDF::URI.new('http://semanticscience.org/resource/SIO_010076')
    end

    # An active ingredient is a molecular entity that exhibits
    def self.active_ingredient
      RDF::URI.new('http://semanticscience.org/resource/SIO_010077')
    end

    # An operon is a collection of contiguous genes transcribed as a single (polycistronic) mRNA.
    def self.operon
      RDF::URI.new('http://semanticscience.org/resource/SIO_010084')
    end

    def self.gene_regulatory_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010085')
    end

    def self.enhancer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010086')
    end

    def self.inactive_ingredient
      RDF::URI.new('http://semanticscience.org/resource/SIO_010087')
    end

    def self.to_serve_as_a_template_for_molecular_synthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_010088')
    end

    def self.to_serve_as_a_template_for_protein_synthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_010089')
    end

    def self.to_serve_as_a_template_for_RNA_synthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_010090')
    end

    def self.to_serve_as_a_template_for_DNA_synthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_010091')
    end

    def self.deoxyribonucleic_acid_template
      RDF::URI.new('http://semanticscience.org/resource/SIO_010092')
    end

    def self.deoxyribonucleic_acid_primer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010093')
    end

    def self.to_serve_as_a_primer_for_DNA_synthesis
      RDF::URI.new('http://semanticscience.org/resource/SIO_010094')
    end

    def self.RNA_transcript_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010095')
    end

    def self.mature_mRNA
      RDF::URI.new('http://semanticscience.org/resource/SIO_010096')
    end

    # Precursor mRNA (pre-mRNA) is a single strand of messenger ribonucleic acid (mRNA) that is synthesized from a DNA template throught transcription.
    def self.pre_mRNA
      RDF::URI.new('http://semanticscience.org/resource/SIO_010097')
    end

    def self.mRNA_splice_variant
      RDF::URI.new('http://semanticscience.org/resource/SIO_010098')
    end

    def self.messenger_RNA
      RDF::URI.new('http://semanticscience.org/resource/SIO_010099')
    end

    def self.dna_gene
      RDF::URI.new('http://semanticscience.org/resource/SIO_010100')
    end

    def self.rna_gene
      RDF::URI.new('http://semanticscience.org/resource/SIO_010101')
    end

    # an allele is one of two or more alternative forms of a gene.
    def self.allele
      RDF::URI.new('http://semanticscience.org/resource/SIO_010277')
    end

    # Ploidy is the cellular quality relating to the amount of DNA contained in a cell.
    def self.ploidy
      RDF::URI.new('http://semanticscience.org/resource/SIO_010278')
    end

    # Chemical transport is the directed movement of a chemical entity by some agent (e.g. transporter).
    def self.chemical_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_010283')
    end

    # Active transport is the movement of a substance across a membrane against its concentration gradient (from low to high concentration) and requires chemical energy.
    def self.active_transport
      RDF::URI.new('http://semanticscience.org/resource/SIO_010284')
    end

    def self.molecular_complex_formation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010285')
    end

    def self.molecular_complex_dissociation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010286')
    end

    # Biochemical regulation is a biochemical process that changes the frequency, rate or extent of a downstream biochemical process.
    def self.biochemical_regulation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010287')
    end

    # Biochemical activation is a molecular interaction that increases the catalytic rate of the target enzyme.
    def self.biochemical_activation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010288')
    end

    # Biochemical inhibition is a molecular interaction that decreases the catalytic rate of the target enzyme.
    def self.biochemical_inhibition
      RDF::URI.new('http://semanticscience.org/resource/SIO_010289')
    end

    # Positve regulation is a biochemical regulation that increases the frequency, rate or extent of a downstream biochemical process.
    def self.positive_regulation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010295')
    end

    # Negative regulation is a biochemical regulation that decreases the frequency, rate or extent of a downstream biochemical process.
    def self.negative_regulation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010296')
    end

    def self.medical_data
      RDF::URI.new('http://semanticscience.org/resource/SIO_010298')
    end

    # disease is the outward manifestation of one or more disorders.
    def self.disease
      RDF::URI.new('http://semanticscience.org/resource/SIO_010299')
    end

    def self.transcription
      RDF::URI.new('http://semanticscience.org/resource/SIO_010300')
    end

    def self.translation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010301')
    end

    def self.molecular_modification
      RDF::URI.new('http://semanticscience.org/resource/SIO_010307')
    end

    def self.metabolism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010308')
    end

    def self.catabolism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010309')
    end

    def self.anabolism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010310')
    end

    def self.carbohydrate_residue
      RDF::URI.new('http://semanticscience.org/resource/SIO_010334')
    end

    def self.nucleic_acid_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_010335')
    end

    def self.deoxyribonucleotide_residue
      RDF::URI.new('http://semanticscience.org/resource/SIO_010336')
    end

    def self.ribonucleotide_residue
      RDF::URI.new('http://semanticscience.org/resource/SIO_010337')
    end

    def self.pharmaceutical_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010338')
    end

    def self.to_covalently_modify
      RDF::URI.new('http://semanticscience.org/resource/SIO_010340')
    end

    # A covalently connected molecular entity is the mereological sum of a collection of covalently bonded atoms.
    def self.covalently_connected_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_010341')
    end

    # a chemical complex is a chemical entity composed of a weakly connected ions or molecules.
    def self.chemical_complex
      RDF::URI.new('http://semanticscience.org/resource/SIO_010342')
    end

    # an enzyme is a protein or protein complex which realizes the disposition to covalently modify some molecule during a chemical reaction.
    def self.enzyme
      RDF::URI.new('http://semanticscience.org/resource/SIO_010343')
    end

    def self.catalyst
      RDF::URI.new('http://semanticscience.org/resource/SIO_010344')
    end

    # A chemical reaction is a process that leads to the transformation of one set of chemical substances to another.
    def self.chemical_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010345')
    end

    def self.organic_polymer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010346')
    end

    def self.to_modify_conformation_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_010347')
    end

    def self.to_cleave
      RDF::URI.new('http://semanticscience.org/resource/SIO_010349')
    end

    def self.to_combine
      RDF::URI.new('http://semanticscience.org/resource/SIO_010351')
    end

    def self.to_breathe
      RDF::URI.new('http://semanticscience.org/resource/SIO_010353')
    end

    def self.to_activate
      RDF::URI.new('http://semanticscience.org/resource/SIO_010354')
    end

    def self.to_inhibit
      RDF::URI.new('http://semanticscience.org/resource/SIO_010355')
    end

    def self.to_oxidize
      RDF::URI.new('http://semanticscience.org/resource/SIO_010358')
    end

    def self.to_reduce
      RDF::URI.new('http://semanticscience.org/resource/SIO_010359')
    end

    def self.to_modify_oxidation_state_of
      RDF::URI.new('http://semanticscience.org/resource/SIO_010360')
    end

    def self.substrate
      RDF::URI.new('http://semanticscience.org/resource/SIO_010362')
    end

    def self.product
      RDF::URI.new('http://semanticscience.org/resource/SIO_010363')
    end

    def self.to_be_modified
      RDF::URI.new('http://semanticscience.org/resource/SIO_010364')
    end

    def self.to_be_cleaved
      RDF::URI.new('http://semanticscience.org/resource/SIO_010365')
    end

    def self.to_be_covalently_modified
      RDF::URI.new('http://semanticscience.org/resource/SIO_010366')
    end

    def self.to_be_combined
      RDF::URI.new('http://semanticscience.org/resource/SIO_010367')
    end

    # to be transported is the disposition to undergo motion.
    def self.to_be_transported
      RDF::URI.new('http://semanticscience.org/resource/SIO_010368')
    end

    def self.to_be_electronically_modified
      RDF::URI.new('http://semanticscience.org/resource/SIO_010369')
    end

    def self.to_gain_an_electron
      RDF::URI.new('http://semanticscience.org/resource/SIO_010370')
    end

    def self.to_lose_an_electron
      RDF::URI.new('http://semanticscience.org/resource/SIO_010371')
    end

    def self.to_be_activated
      RDF::URI.new('http://semanticscience.org/resource/SIO_010372')
    end

    def self.to_be_inhibited
      RDF::URI.new('http://semanticscience.org/resource/SIO_010373')
    end

    def self.to_be_conformationally_changed
      RDF::URI.new('http://semanticscience.org/resource/SIO_010374')
    end

    def self.multicellular_organism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010375')
    end

    def self.unicellular_organism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010376')
    end

    def self.cellular_organism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010377')
    end

    def self.non_cellular_organism
      RDF::URI.new('http://semanticscience.org/resource/SIO_010378')
    end

    def self.virus
      RDF::URI.new('http://semanticscience.org/resource/SIO_010379')
    end

    # A drug regulatory authority is a regulatory authority which acts to control what substances may be used to treat individuals.
    def self.drug_regulatory_authority
      RDF::URI.new('http://semanticscience.org/resource/SIO_010383')
    end

    def self.specialized_chemical_entity
      RDF::URI.new('http://semanticscience.org/resource/SIO_010410')
    end

    def self.reagent
      RDF::URI.new('http://semanticscience.org/resource/SIO_010411')
    end

    def self.specimen
      RDF::URI.new('http://semanticscience.org/resource/SIO_010412')
    end

    def self.pathogen
      RDF::URI.new('http://semanticscience.org/resource/SIO_010414')
    end

    def self.host
      RDF::URI.new('http://semanticscience.org/resource/SIO_010415')
    end

    # A buffer is a dissolved chemical substance that resists change in pH upon addition of small amounts of acid or base.
    def self.buffer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010416')
    end

    # A solvent is a liquid substance that can dissolve other substances (solutes).
    def self.solvent
      RDF::URI.new('http://semanticscience.org/resource/SIO_010417')
    end

    def self.solute
      RDF::URI.new('http://semanticscience.org/resource/SIO_010418')
    end

    # An antigen is a chemical entity that can be bound by a major histocompatibility complex (MHC) and presented to a T-cell receptor.
    def self.antigen
      RDF::URI.new('http://semanticscience.org/resource/SIO_010419')
    end

    def self.receptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_010420')
    end

    def self.target
      RDF::URI.new('http://semanticscience.org/resource/SIO_010423')
    end

    def self.pellet
      RDF::URI.new('http://semanticscience.org/resource/SIO_010424')
    end

    def self.supernatant
      RDF::URI.new('http://semanticscience.org/resource/SIO_010425')
    end

    def self.centrifugation_substance
      RDF::URI.new('http://semanticscience.org/resource/SIO_010426')
    end

    def self.solution_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010427')
    end

    # an evaluation role is a processual role held by a physical entity during some evaluation
    def self.evaluation_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_010428')
    end

    def self.placebo
      RDF::URI.new('http://semanticscience.org/resource/SIO_010429')
    end

    def self.test_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_010430')
    end

    def self.control_role
      RDF::URI.new('http://semanticscience.org/resource/SIO_010431')
    end

    def self.ligand
      RDF::URI.new('http://semanticscience.org/resource/SIO_010432')
    end

    # a low barrier hydrogen bond is a shorter, stronger hydrogen bond that is formed between both heteroatoms.
    def self.low_barrier_hydrogen_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010433')
    end

    def self.activator
      RDF::URI.new('http://semanticscience.org/resource/SIO_010434')
    end

    def self.inhibitor
      RDF::URI.new('http://semanticscience.org/resource/SIO_010435')
    end

    def self.molecular_regulator
      RDF::URI.new('http://semanticscience.org/resource/SIO_010436')
    end

    def self.signal_transducer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010437')
    end

    def self.signal
      RDF::URI.new('http://semanticscience.org/resource/SIO_010438')
    end

    def self.messenger
      RDF::URI.new('http://semanticscience.org/resource/SIO_010439')
    end

    def self.second_messenger
      RDF::URI.new('http://semanticscience.org/resource/SIO_010440')
    end

    # a submolecule is a mereological sum of a collection of covalently bonded atoms
    def self.submolecule
      RDF::URI.new('http://semanticscience.org/resource/SIO_010441')
    end

    def self.charge_quality
      RDF::URI.new('http://semanticscience.org/resource/SIO_010442')
    end

    def self.intron
      RDF::URI.new('http://semanticscience.org/resource/SIO_010443')
    end

    def self.gene_component
      RDF::URI.new('http://semanticscience.org/resource/SIO_010444')
    end

    def self.exon
      RDF::URI.new('http://semanticscience.org/resource/SIO_010445')
    end

    def self.promoter
      RDF::URI.new('http://semanticscience.org/resource/SIO_010446')
    end

    def self.start_codon
      RDF::URI.new('http://semanticscience.org/resource/SIO_010447')
    end

    def self.stop_codon
      RDF::URI.new('http://semanticscience.org/resource/SIO_010448')
    end

    def self.RNA_transcript
      RDF::URI.new('http://semanticscience.org/resource/SIO_010450')
    end

    def self.splice_site
      RDF::URI.new('http://semanticscience.org/resource/SIO_010451')
    end

    def self.pocket
      RDF::URI.new('http://semanticscience.org/resource/SIO_010452')
    end

    # An acid is a molecular entity in solution capable of donating a hydron (Bronsted acid) or capable of forming a covalent bond with an electron pair (Lewis acid).
    def self.acid
      RDF::URI.new('http://semanticscience.org/resource/SIO_010453')
    end

    # A base is a molecular entity dissolved in a solvent that is capable of accepting a proton (Bronsted base) or forming a covalent bond with a hydron (Lewis base) .
    def self.base
      RDF::URI.new('http://semanticscience.org/resource/SIO_010454')
    end

    # An isomer is a molecule that is compositionally identical to another molecule as a result of a different atomic connectivity.
    def self.isomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010455')
    end

    # An ion is an atom or molecule in which the total number of electrons is not equal to the total number of protons, giving it a net positive or negative electrical charge.
    def self.ion
      RDF::URI.new('http://semanticscience.org/resource/SIO_010456')
    end

    def self.cation
      RDF::URI.new('http://semanticscience.org/resource/SIO_010457')
    end

    def self.anion
      RDF::URI.new('http://semanticscience.org/resource/SIO_010458')
    end

    def self.polar_solvent
      RDF::URI.new('http://semanticscience.org/resource/SIO_010459')
    end

    def self.nonpolar_solvent
      RDF::URI.new('http://semanticscience.org/resource/SIO_010460')
    end

    # the quality of having a positive charge
    def self.positive_charge
      RDF::URI.new('http://semanticscience.org/resource/SIO_010461')
    end

    def self.heterogeneous_substance
      RDF::URI.new('http://semanticscience.org/resource/SIO_010462')
    end

    def self.homogeneous_substance
      RDF::URI.new('http://semanticscience.org/resource/SIO_010463')
    end

    # the quality of having a negative charge
    def self.negative_charge
      RDF::URI.new('http://semanticscience.org/resource/SIO_010464')
    end

    # An antibody (also known as immunoglobulins, abbreviated Ig) are gamma globulin proteins that are used by the immune system to identify and neutralize foreign objects. They are typically made of two large heavy chains and two small light chains.
    def self.antibody
      RDF::URI.new('http://semanticscience.org/resource/SIO_010465')
    end

    def self.alpha_helix
      RDF::URI.new('http://semanticscience.org/resource/SIO_010468')
    end

    def self.beta_strand
      RDF::URI.new('http://semanticscience.org/resource/SIO_010469')
    end

    def self.protein_part
      RDF::URI.new('http://semanticscience.org/resource/SIO_010471')
    end

    # an ionic interaction is a weak submolecular interaction between a charged submolecules.
    def self.ionic_interaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010496')
    end

    # a protein complex is a molecular complex composed of at least two polypeptide chains.
    def self.protein_complex
      RDF::URI.new('http://semanticscience.org/resource/SIO_010497')
    end

    def self.single_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010498')
    end

    def self.double_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010499')
    end

    def self.triple_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010500')
    end

    def self.aromatic_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010501')
    end

    def self.disulfide_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010502')
    end

    # a dipole-dipole interaction is a weak submolecular interaction between strongly electronegative atoms.
    def self.dipole_dipole_interaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010503')
    end

    # van der Waals' interaction is an a weak submolecular interaction between an instantaneous dipole and induced dipole.
    def self.van_der_Waals_interaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010504')
    end

    def self.base_stack
      RDF::URI.new('http://semanticscience.org/resource/SIO_010505')
    end

    # a molecular complex is a chemical complex composed of weakly interacting molecular entities, and excludes bulk solvent.
    def self.molecular_complex
      RDF::URI.new('http://semanticscience.org/resource/SIO_010506')
    end

    # an acid-base reaction is a chemical reaction between an acid and a base.
    def self.acid_base_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010507')
    end

    # a catalyzed reaction is a chemical reaction that is facilitated by a catalyst.
    def self.catalyzed_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010508')
    end

    # a redox reaction is a chemical reaction in which there is a net movement of electrons from one reactant to another.
    def self.redox_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010509')
    end

    # An inorganic reaction is a chemical reaction that involves the transformation of inorganic molecules.
    def self.inorganic_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010510')
    end

    # A decomposition reaction is an inorganic reaction in which molecule is fragmented into submolecules or atoms.
    def self.decomposition_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010511')
    end

    # A displacement reaction is an inorganic reaction in which a elementary substance displaces and sets free a constituent atom from a molecule.
    def self.displacement_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010512')
    end

    # A double displacement reaction is a displacement reaction in which two molecules swap ions, effectively displacing each other to form two new molecules.
    def self.double_displacement_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010513')
    end

    # A single displacement reaction where one atom is transferred out of one molecule and into another.
    def self.single_displacement_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010514')
    end

    # A synthesis reaction is an inorganic reaction in which two or more molecules are chemically bonded together to produce a single product.
    def self.synthesis_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010515')
    end

    # An organic reaction is a chemical reaction involving at least one organic molecule.
    def self.organic_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010516')
    end

    # An isomerization reaction is a chemical reaction in which a molecule is converted into its isomer.
    def self.isomerization_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010517')
    end

    # An addition reaction is an organic reaction where two or more molecules combine to form a larger one. Addition reactions are limited to chemical compounds that have multiply-bonded atoms:
    #     * Molecules with carbon-carbon double bonds or triple bonds
    #     * Molecules with carbon - hetero double bonds like C=O or C=N
    def self.addition_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010518')
    end

    def self.polar_addition_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010519')
    end

    def self.non_polar_addition_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010520')
    end

    # A free radical addition is a non-polar addition reaction involving free radicals.
    def self.free_radical_addition
      RDF::URI.new('http://semanticscience.org/resource/SIO_010521')
    end

    # A nucleophilic addition reaction is an addition reaction where a pi bond is removed by the creation of two new covalent bonds by the addition from a nucleophile.
    def self.nucleophilic_addition_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010522')
    end

    # an electrophilic addition reaction is a polar addition reaction where a pi bond is removed by the creation of two new covalent bonds.
    def self.electrophilic_addition_reaction
      RDF::URI.new('http://semanticscience.org/resource/SIO_010523')
    end

    # a biochemical pathway specifies a series of biochemical reactions towards achieving some objective.
    def self.biochemical_pathway
      RDF::URI.new('http://semanticscience.org/resource/SIO_010525')
    end

    # a chemical reaction pathway specifies is a series of chemical reactions towards producing some chemical product.
    def self.chemical_reaction_pathway
      RDF::URI.new('http://semanticscience.org/resource/SIO_010526')
    end

    def self.chemical_synthesis_pathway
      RDF::URI.new('http://semanticscience.org/resource/SIO_010527')
    end

    def self.chemical_degradation_pathway
      RDF::URI.new('http://semanticscience.org/resource/SIO_010528')
    end

    def self.a_d_structure_model
      RDF::URI.new('http://semanticscience.org/resource/SIO_010530')
    end

    def self.sequence_profile
      RDF::URI.new('http://semanticscience.org/resource/SIO_010531')
    end

    # a metabolic pathway is a series of biochemical reactions that begins with one or more substrates and ends with one or more products.
    def self.metabolic_pathway
      RDF::URI.new('http://semanticscience.org/resource/SIO_010532')
    end

    # a regulatory pathway is a series of biochemical reactions that lead to the increase or decrease of activity of participating molecular components.
    def self.regulatory_pathway
      RDF::URI.new('http://semanticscience.org/resource/SIO_010533')
    end

    def self.medical_history
      RDF::URI.new('http://semanticscience.org/resource/SIO_010673')
    end

    # a binary compound is a mereological maximum sum of two kinds of weakly connected entities.
    def self.binary_compound
      RDF::URI.new('http://semanticscience.org/resource/SIO_010674')
    end

    # A stereoisomer is an isomer in which the atomic connectivity is the same, but differs in its spatial arrangement of atoms.
    def self.stereoisomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010775')
    end

    # A diastereomer is a stereoisomer that is not a mirror image of its isomer.
    def self.diastereomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010776')
    end

    # An enantiomer is a stereoisomer that is a mirror image of its isomer.
    def self.enantiomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010777')
    end

    # An optical isomer is a stereoisomer that rotates the plane of polarization of a beam of plane polarized light.
    def self.optical_isomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010778')
    end

    # A structural isomer is an isomer in which the atoms are joined together in different ways.
    def self.structural_isomer
      RDF::URI.new('http://semanticscience.org/resource/SIO_010779')
    end

    # a ring is a submolecule with a circular topology.
    def self.ring
      RDF::URI.new('http://semanticscience.org/resource/SIO_010780')
    end

    # An aromatic ring is a ring in which the electrons are delocalized across all atoms in the ring.
    def self.aromatic_ring
      RDF::URI.new('http://semanticscience.org/resource/SIO_010781')
    end

    # a heterocyclic ring is a ring containing a hetero atom.
    def self.heterocyclic_ring
      RDF::URI.new('http://semanticscience.org/resource/SIO_010782')
    end

    # A homocyclic ring is a ring where the atoms are of a single type.
    def self.homocyclic_ring
      RDF::URI.new('http://semanticscience.org/resource/SIO_010783')
    end

    # an ionic compound is a mereological maximal sum of weakly connected paired positive and negative ions.
    def self.ionic_compound
      RDF::URI.new('http://semanticscience.org/resource/SIO_010784')
    end

    # an allotrope is a structural variant of a chemical element.
    def self.allotrope
      RDF::URI.new('http://semanticscience.org/resource/SIO_010785')
    end

    def self.carbon_allotrope
      RDF::URI.new('http://semanticscience.org/resource/SIO_010786')
    end

    # Diamond is a carbon allotrope in which each carbon atom in diamond is covalently bonded to four other carbons in a tetrahedron. These tetrahedrons together form a 3-dimensional network of puckered six-membered rings of atoms.
    def self.diamond
      RDF::URI.new('http://semanticscience.org/resource/SIO_010787')
    end

    # graphite is an allotrope of carbon which is a conductor, and is the most stable form of solid carbon.
    def self.graphite
      RDF::URI.new('http://semanticscience.org/resource/SIO_010788')
    end

    # Fullerene is a carbon allotrope which take the form of a hollow sphere, ellipsoid, or tube.
    def self.fullerene
      RDF::URI.new('http://semanticscience.org/resource/SIO_010789')
    end

    # aggregate of carbon nanorods is an allotrope of carbon considered to be the least compressible material known, as measured by its isothermal bulk modulus; aggregated diamond nanorods have a modulus of 491 gigapascals (GPa), while a conventional diamond has a modulus of 442 GPa. ADNRs are also 0.3% denser than regular diamond.
    def self.aggregated_carbon_nanorods
      RDF::URI.new('http://semanticscience.org/resource/SIO_010790')
    end

    # Amorphous carbon is an allotrope of carbon that does not have any crystalline structure. As with all glassy materials, some short-range order can be observed, but there is no long-range pattern of atomic positions.
    def self.amorphous_carbon
      RDF::URI.new('http://semanticscience.org/resource/SIO_010791')
    end

    # carbon nanofoam is an allotrope of carbon that consists of a low-density cluster-assembly of carbon atoms strung together in a loose three-dimensional web. Each cluster is about 6 nanometers wide and consists of about 4000 carbon atoms linked in graphite-like sheets that are given negative curvature by the inclusion of heptagons among the regular hexagonal pattern.
    def self.carbon_nanofoam
      RDF::URI.new('http://semanticscience.org/resource/SIO_010792')
    end

    # chaoite is an allotrope of carbon that is slightly harder than graphite with a reflection colour of grey to white.
    def self.chaoite
      RDF::URI.new('http://semanticscience.org/resource/SIO_010793')
    end

    # glassy carbon is an allotrope of carbon which is widely used as an electrode material in electrochemistry, as well as for high temperature crucibles and as a component of some prosthetic devices.
    def self.glassy_carbon
      RDF::URI.new('http://semanticscience.org/resource/SIO_010794')
    end

    # ionsdaleite is a hexagonal allotrope of the carbon allotrope diamond.
    def self.ionsdaleite
      RDF::URI.new('http://semanticscience.org/resource/SIO_010795')
    end

    def self.boron_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011000')
    end

    def self.carbon_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011001')
    end

    def self.hydrogen_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011002')
    end

    def self.helium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011003')
    end

    def self.lithium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011004')
    end

    def self.beryllium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011005')
    end

    def self.nitrogen_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011006')
    end

    def self.oxygen_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011007')
    end

    def self.fluorine_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011008')
    end

    def self.neon_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011009')
    end

    def self.sodium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011010')
    end

    def self.magnesium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011011')
    end

    def self.aluminium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011012')
    end

    def self.silicon_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011013')
    end

    def self.phosphorus_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011014')
    end

    def self.sulfur_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011015')
    end

    def self.chlorine_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011016')
    end

    def self.argon_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011017')
    end

    def self.potassium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011018')
    end

    def self.calcium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011019')
    end

    def self.scandium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011020')
    end

    def self.titanium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011021')
    end

    def self.vanadium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011022')
    end

    def self.chromium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011023')
    end

    def self.manganese_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011024')
    end

    def self.iron_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011025')
    end

    def self.cobalt_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011026')
    end

    def self.nickel_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011027')
    end

    def self.copper_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011028')
    end

    def self.zinc_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011029')
    end

    def self.gallium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011030')
    end

    def self.germanium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011031')
    end

    def self.arsenic_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011032')
    end

    def self.selenium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011033')
    end

    def self.bromine_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011034')
    end

    def self.krypton_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011035')
    end

    def self.rubidium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011036')
    end

    def self.strontium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011037')
    end

    def self.yttrium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011038')
    end

    def self.zirconium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011039')
    end

    def self.niobium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011040')
    end

    def self.molybdemum_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011041')
    end

    def self.technetium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011042')
    end

    def self.ruthenium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011043')
    end

    def self.rhodium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011044')
    end

    def self.palladium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011045')
    end

    def self.silver_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011046')
    end

    def self.cadmium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011047')
    end

    def self.indium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011048')
    end

    def self.tin_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011049')
    end

    def self.antimony_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011050')
    end

    def self.tellurium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011051')
    end

    def self.iodine_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011052')
    end

    def self.xenon_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011053')
    end

    def self.caesium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011054')
    end

    def self.barium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011055')
    end

    def self.lanthanum_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011056')
    end

    def self.hafnium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011057')
    end

    def self.tantalum_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011058')
    end

    def self.tungsten_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011059')
    end

    def self.rhenium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011060')
    end

    def self.osmium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011061')
    end

    def self.iridium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011062')
    end

    def self.platinum_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011063')
    end

    def self.gold_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011064')
    end

    def self.mercury_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011065')
    end

    def self.thallium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011066')
    end

    def self.lead_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011067')
    end

    def self.bismuth_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011068')
    end

    def self.polonium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011069')
    end

    def self.astatine_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011070')
    end

    def self.radon_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011071')
    end

    def self.francium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011072')
    end

    def self.radium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011073')
    end

    def self.actinium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011074')
    end

    def self.rutherfordium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011075')
    end

    def self.dubnium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011076')
    end

    def self.seaborgium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011077')
    end

    def self.bohrium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011078')
    end

    def self.hassium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011079')
    end

    def self.meitnerium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011080')
    end

    def self.darmstadtium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011081')
    end

    def self.roentgenium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011082')
    end

    def self.copernicium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011083')
    end

    def self.unutrium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011084')
    end

    def self.ununquadium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011085')
    end

    def self.ununpentium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011086')
    end

    def self.ununhexium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011087')
    end

    def self.ununseptium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011088')
    end

    def self.ununoctium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011089')
    end

    def self.cerium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011090')
    end

    def self.praseodymium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011091')
    end

    def self.neodymium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011092')
    end

    def self.promethium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011093')
    end

    def self.samarium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011094')
    end

    def self.europium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011095')
    end

    def self.gadolinium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011096')
    end

    def self.terbium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011097')
    end

    def self.dysprosium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011098')
    end

    def self.holmium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011099')
    end

    def self.erbium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011100')
    end

    def self.thulium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011101')
    end

    def self.ytterbium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011102')
    end

    def self.lutetium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011103')
    end

    def self.thorium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011104')
    end

    def self.protactinium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011105')
    end

    def self.uranium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011106')
    end

    def self.neptunium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011107')
    end

    def self.plutonium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011108')
    end

    def self.americium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011109')
    end

    def self.curium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011110')
    end

    def self.berkelium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011111')
    end

    def self.californium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011112')
    end

    def self.einsteinium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011113')
    end

    def self.fermium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011114')
    end

    def self.mendelevium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011115')
    end

    def self.nobelium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011116')
    end

    def self.lawrencium_atom
      RDF::URI.new('http://semanticscience.org/resource/SIO_011117')
    end

    # a covalent chemical bond is a strong submolecular interaction between atoms.
    def self.covalent_chemical_bond
      RDF::URI.new('http://semanticscience.org/resource/SIO_011118')
    end

    def self.biomolecular_structure_descriptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_011119')
    end

    def self.molecular_structure_file
      RDF::URI.new('http://semanticscience.org/resource/SIO_011120')
    end

    def self.molecular_structure_descriptor
      RDF::URI.new('http://semanticscience.org/resource/SIO_011121')
    end

    def self.chemical_data
      RDF::URI.new('http://semanticscience.org/resource/SIO_011123')
    end

    # A molecule is the mereological maximal sum of a collection of covalently bonded atoms.
    def self.molecule
      RDF::URI.new('http://semanticscience.org/resource/SIO_011125')
    end

    def self.chemical_substance
      RDF::URI.new('http://semanticscience.org/resource/SIO_011126')
    end

    def self.PDB_file
      RDF::URI.new('http://semanticscience.org/resource/SIO_011130')
    end

    def self.collection_of_3d_molecular_structure_models
      RDF::URI.new('http://semanticscience.org/resource/SIO_011131')
    end

    # Determines whether the given URI is an object property.
    #
    # +uri+:: URI that is tested for being an object property
    def self.is_object_property?(uri)
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000008')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000011')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000020')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000029')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000054')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000060')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000062')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000063')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000064')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000066')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000095')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000096')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000132')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000139')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000205')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000206')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000207')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000208')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000209')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000210')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000212')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000213')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000214')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000215')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000216')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000218')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000219')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000222')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000229')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000230')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000231')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000232')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000233')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000234')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000246')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000247')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000250')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000251')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000252')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000253')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000254')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000255')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000273')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000274')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000277')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000278')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000286')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000291')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000292')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000294')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000310')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000311')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000312')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000313')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000323')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000324')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000332')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000338')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000339')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000341')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000352')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000355')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000356')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000362')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000363')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000364')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000365')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000369')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000420')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000421')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000425')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000426')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000427')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000477')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000552')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000553')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000557')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000563')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000628')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000629')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000631')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000632')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000633')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000635')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000636')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000641')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000642')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000656')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000658')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000668')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000671')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000672')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000682')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000684')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000687')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000699')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000733')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000734')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000735')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000772')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000773')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000774')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000775')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000793')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000892')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000900')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000901')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000905')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000970')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000971')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000972')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000973')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000974')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000975')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010078')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010079')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010080')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010081')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010082')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010083')
      false
    end

    # Determines whether the given URI is a datatype property.
    #
    # +uri+:: URI that is tested for being a datatype property
    def self.is_datatype_property?(uri)
      false
    end

    # Determines whether the given URI is a class.
    #
    # +uri+:: URI that is tested for being a class
    def self.is_class?(uri)
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000000')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000004')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000005')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000006')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000009')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000010')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000012')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000013')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000014')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000015')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000016')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000017')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000019')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000022')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000026')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000027')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000030')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000031')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000032')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000033')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000034')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000035')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000036')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000037')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000038')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000039')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000040')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000041')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000042')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000043')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000044')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000045')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000046')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000047')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000048')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000049')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000051')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000052')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000055')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000056')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000057')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000067')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000069')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000070')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000071')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000072')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000073')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000074')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000075')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000076')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000077')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000078')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000079')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000080')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000081')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000082')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000083')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000085')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000087')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000088')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000089')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000090')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000091')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000092')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000094')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000097')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000098')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000099')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000100')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000101')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000102')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000103')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000104')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000105')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000106')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000107')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000108')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000109')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000110')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000111')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000112')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000113')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000114')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000115')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000116')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000117')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000118')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000119')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000120')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000121')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000122')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000123')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000124')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000125')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000126')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000127')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000129')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000130')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000131')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000133')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000135')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000136')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000137')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000138')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000140')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000141')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000142')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000143')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000144')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000146')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000147')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000148')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000150')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000151')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000152')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000153')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000154')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000155')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000156')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000157')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000158')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000159')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000160')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000161')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000162')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000163')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000164')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000165')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000166')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000167')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000168')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000169')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000170')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000171')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000172')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000173')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000174')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000175')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000176')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000177')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000178')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000179')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000180')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000181')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000182')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000183')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000184')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000185')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000186')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000187')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000188')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000189')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000190')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000191')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000192')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000193')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000194')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000195')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000196')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000197')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000198')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000199')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000200')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000201')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000220')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000237')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000238')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000239')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000256')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000257')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000258')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000259')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000261')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000262')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000263')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000264')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000265')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000266')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000267')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000268')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000269')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000270')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000275')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000276')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000279')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000280')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000281')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000282')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000284')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000285')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000287')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000289')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000290')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000295')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000296')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000297')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000298')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000299')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000301')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000302')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000304')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000305')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000306')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000307')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000308')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000309')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000314')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000315')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000316')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000317')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000318')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000319')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000320')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000321')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000326')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000327')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000328')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000329')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000330')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000331')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000333')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000336')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000337')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000340')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000342')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000343')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000344')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000345')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000346')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000347')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000348')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000349')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000350')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000351')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000353')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000354')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000357')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000358')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000359')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000360')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000361')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000366')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000367')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000368')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000370')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000371')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000372')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000373')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000374')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000375')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000376')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000377')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000378')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000379')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000380')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000381')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000382')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000383')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000384')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000385')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000386')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000387')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000388')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000389')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000390')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000391')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000392')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000393')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000394')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000395')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000396')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000397')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000398')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000399')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000400')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000401')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000402')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000403')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000404')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000405')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000406')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000407')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000408')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000409')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000410')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000411')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000412')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000413')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000414')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000415')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000417')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000418')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000419')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000423')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000428')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000429')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000430')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000431')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000432')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000433')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000434')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000435')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000436')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000437')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000438')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000439')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000440')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000441')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000442')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000443')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000444')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000445')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000446')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000447')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000448')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000449')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000450')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000451')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000452')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000453')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000454')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000455')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000456')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000457')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000458')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000459')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000460')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000461')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000462')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000463')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000464')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000465')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000466')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000467')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000468')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000469')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000470')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000471')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000472')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000473')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000474')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000475')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000476')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000478')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000479')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000480')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000481')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000483')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000485')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000486')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000487')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000488')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000489')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000492')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000493')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000494')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000498')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000499')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000500')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000501')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000502')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000503')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000504')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000505')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000506')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000507')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000508')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000509')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000510')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000511')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000512')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000513')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000514')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000515')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000516')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000517')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000518')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000519')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000520')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000521')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000522')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000523')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000524')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000525')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000526')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000527')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000528')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000529')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000530')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000531')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000532')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000533')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000534')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000535')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000536')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000537')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000538')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000539')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000540')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000541')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000542')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000543')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000544')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000545')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000546')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000547')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000548')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000549')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000550')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000551')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000554')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000555')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000556')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000559')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000561')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000562')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000564')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000565')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000566')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000567')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000568')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000569')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000570')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000571')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000572')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000573')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000574')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000575')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000576')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000577')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000578')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000579')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000580')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000581')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000582')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000583')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000584')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000585')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000587')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000588')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000589')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000590')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000591')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000592')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000593')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000594')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000595')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000596')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000597')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000598')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000600')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000602')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000605')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000608')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000609')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000610')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000611')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000612')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000613')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000614')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000615')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000616')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000617')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000618')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000619')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000620')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000621')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000622')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000623')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000624')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000625')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000626')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000627')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000638')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000639')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000640')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000647')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000648')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000649')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000650')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000651')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000653')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000654')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000660')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000661')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000662')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000663')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000664')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000665')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000666')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000667')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000669')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000670')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000675')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000676')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000677')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000678')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000683')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000686')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000688')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000689')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000690')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000691')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000692')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000693')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000694')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000695')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000696')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000698')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000700')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000701')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000702')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000703')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000704')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000705')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000706')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000707')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000708')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000711')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000712')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000713')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000714')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000715')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000716')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000717')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000718')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000719')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000720')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000721')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000722')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000723')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000724')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000725')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000726')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000727')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000728')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000729')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000730')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000731')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000732')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000739')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000740')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000741')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000742')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000743')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000744')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000745')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000746')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000747')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000748')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000750')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000751')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000752')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000753')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000754')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000755')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000756')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000757')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000758')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000759')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000760')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000761')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000762')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000763')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000764')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000765')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000766')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000767')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000768')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000769')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000770')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000771')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000776')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000777')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000778')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000779')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000780')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000783')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000784')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000785')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000786')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000787')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000788')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000789')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000790')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000791')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000792')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000794')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000795')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000796')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000797')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000798')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000799')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000800')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000801')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000802')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000803')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000804')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000805')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000806')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000807')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000808')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000809')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000810')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000811')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000812')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000813')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000814')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000815')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000816')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000817')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000818')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000819')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000820')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000821')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000822')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000823')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000824')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000825')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000826')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000827')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000828')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000829')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000830')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000831')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000832')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000833')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000834')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000835')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000836')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000837')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000838')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000839')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000840')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000841')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000842')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000843')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000844')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000845')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000846')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000847')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000848')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000849')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000850')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000851')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000852')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000853')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000854')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000855')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000856')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000857')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000858')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000859')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000860')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000861')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000862')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000863')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000864')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000865')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000866')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000867')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000868')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000869')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000870')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000871')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000872')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000873')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000875')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000876')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000877')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000878')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000879')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000880')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000881')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000882')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000883')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000884')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000885')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000886')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000887')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000888')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000889')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000890')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000891')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000893')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000894')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000895')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000896')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000897')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000898')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000899')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000902')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000903')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000904')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000906')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000907')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000908')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000909')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000910')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000911')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000912')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000913')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000914')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000915')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000916')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000917')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000918')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000919')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000920')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000921')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000922')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000923')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000924')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000926')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000927')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000928')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000929')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000930')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000931')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000932')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000933')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000934')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000935')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000936')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000937')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000938')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000939')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000940')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000941')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000942')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000943')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000944')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000945')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000946')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000947')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000948')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000949')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000950')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000951')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000952')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000953')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000954')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000955')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000956')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000957')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000958')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000959')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000960')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000961')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000962')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000963')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000964')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000965')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000966')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000967')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000968')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000969')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_000976')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010000')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010001')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010002')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010003')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010004')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010005')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010007')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010008')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010009')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010010')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010011')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010013')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010014')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010015')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010016')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010017')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010018')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010019')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010020')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010022')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010023')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010024')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010025')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010026')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010027')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010028')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010029')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010030')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010031')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010032')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010033')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010034')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010035')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010036')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010037')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010038')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010039')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010040')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010041')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010043')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010044')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010045')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010046')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010047')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010048')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010049')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010050')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010051')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010052')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010053')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010054')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010055')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010056')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010057')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010058')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010059')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010060')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010061')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010064')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010065')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010066')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010067')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010068')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010070')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010071')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010072')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010073')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010074')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010075')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010076')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010077')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010084')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010085')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010086')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010087')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010088')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010089')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010090')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010091')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010092')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010093')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010094')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010095')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010096')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010097')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010098')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010099')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010100')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010101')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010277')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010278')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010283')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010284')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010285')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010286')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010287')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010288')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010289')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010295')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010296')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010298')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010299')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010300')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010301')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010307')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010308')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010309')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010310')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010334')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010335')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010336')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010337')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010338')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010340')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010341')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010342')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010343')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010344')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010345')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010346')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010347')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010349')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010351')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010353')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010354')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010355')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010358')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010359')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010360')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010362')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010363')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010364')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010365')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010366')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010367')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010368')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010369')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010370')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010371')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010372')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010373')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010374')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010375')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010376')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010377')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010378')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010379')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010383')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010410')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010411')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010412')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010414')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010415')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010416')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010417')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010418')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010419')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010420')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010423')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010424')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010425')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010426')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010427')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010428')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010429')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010430')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010431')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010432')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010433')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010434')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010435')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010436')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010437')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010438')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010439')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010440')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010441')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010442')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010443')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010444')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010445')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010446')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010447')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010448')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010450')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010451')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010452')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010453')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010454')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010455')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010456')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010457')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010458')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010459')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010460')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010461')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010462')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010463')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010464')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010465')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010468')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010469')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010471')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010496')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010497')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010498')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010499')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010500')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010501')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010502')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010503')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010504')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010505')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010506')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010507')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010508')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010509')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010510')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010511')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010512')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010513')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010514')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010515')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010516')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010517')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010518')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010519')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010520')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010521')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010522')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010523')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010525')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010526')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010527')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010528')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010530')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010531')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010532')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010533')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010673')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010674')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010775')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010776')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010777')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010778')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010779')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010780')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010781')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010782')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010783')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010784')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010785')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010786')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010787')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010788')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010789')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010790')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010791')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010792')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010793')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010794')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_010795')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011000')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011001')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011002')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011003')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011004')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011005')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011006')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011007')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011008')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011009')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011010')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011011')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011012')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011013')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011014')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011015')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011016')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011017')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011018')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011019')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011020')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011021')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011022')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011023')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011024')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011025')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011026')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011027')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011028')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011029')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011030')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011031')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011032')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011033')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011034')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011035')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011036')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011037')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011038')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011039')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011040')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011041')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011042')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011043')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011044')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011045')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011046')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011047')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011048')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011049')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011050')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011051')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011052')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011053')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011054')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011055')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011056')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011057')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011058')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011059')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011060')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011061')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011062')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011063')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011064')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011065')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011066')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011067')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011068')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011069')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011070')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011071')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011072')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011073')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011074')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011075')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011076')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011077')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011078')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011079')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011080')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011081')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011082')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011083')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011084')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011085')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011086')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011087')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011088')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011089')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011090')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011091')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011092')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011093')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011094')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011095')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011096')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011097')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011098')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011099')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011100')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011101')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011102')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011103')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011104')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011105')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011106')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011107')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011108')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011109')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011110')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011111')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011112')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011113')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011114')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011115')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011116')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011117')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011118')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011119')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011120')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011121')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011123')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011125')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011126')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011130')
      return true if uri == RDF::URI.new('http://semanticscience.org/resource/SIO_011131')
      false
    end

end


end
