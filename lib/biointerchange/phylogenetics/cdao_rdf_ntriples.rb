require 'rdf'
require 'rdf/ntriples'

module BioInterchange::Phylogenetics

class CDAORDFWriter < BioInterchange::Writer

  # Register writers:
  BioInterchange::Registry.register_writer(
    'rdf.phylotastic.newick',
    CDAORDFWriter,
    [ 'phylotastic.newick' ],
    false,
    'Comparative Data Analysis Ontology (CDAO) based RDFization'
  )

  def initialize(ostream)
    @ostream = ostream
  end

  def serialize(model)
    model.contents.each { |tree|
      serialize_model(model, tree)
    }
  end

protected

  def serialize_model(model, tree)
    graph = RDF::Graph.new
    graph.fast_ostream(@ostream) if BioInterchange::skip_rdf_graph
    tree_uri = RDF::URI.new(model.uri)
    serialize_tree(graph, tree, tree_uri, tree.root, true)
    RDF::NTriples::Writer.dump(graph, @ostream)
  end

  def serialize_tree(graph, tree, tree_uri, node, is_root)
    node_uri = RDF::URI.new("#{tree_uri.to_s}/node/#{node.object_id}")

    if is_root then
      graph.insert(RDF::Statement.new(tree_uri, RDF.type, BioInterchange::CDAO.NewickTree))
      # Commented out some lines since it appears not to be determinable for Newick trees.
      if tree.root then
        # graph.insert(RDF::Statement.new(tree_uri, RDF.type, BioInterchange::CDAO.rootedtree))
      else
        # graph.insert(RDF::Statement.new(tree_uri, RDF.type, BioInterchange::CDAO.unrootedtree))
        # Pick the first node available to permit serialization of the tree:
        tree.root = node = tree.nodes.first
      end
    end

    if node.name then
      taxonomic_unit_uri = RDF::URI.new("#{tree_uri.to_s}/taxonomic_unit/#{node.object_id}")
      graph.insert(RDF::Statement.new(taxonomic_unit_uri, RDF.type, BioInterchange::CDAO.TU))
      graph.insert(RDF::Statement.new(node_uri, BioInterchange::CDAO::represents_TU, taxonomic_unit_uri))
      graph.insert(RDF::Statement.new(taxonomic_unit_uri, RDF::RDFS.label, RDF::Literal.new(node.name.gsub('_', ' '))))
    end

    if tree.descendents(node).empty? then
      graph.insert(RDF::Statement.new(node_uri, RDF.type, BioInterchange::CDAO.TerminalNode))
    else
      graph.insert(RDF::Statement.new(node_uri, RDF.type, BioInterchange::CDAO.AncestralNode))
    end

    if not tree.root == node and tree.parent(node) then
      parent_uri = RDF::URI.new("#{tree_uri.to_s}/node/#{tree.parent(node).object_id}")
      edge_uri = RDF::URI.new("#{tree_uri.to_s}/edge/#{tree.get_edge(tree.parent(node), node).object_id}")
      annotation_uri = RDF::URI.new("#{tree_uri.to_s}/edge/#{tree.get_edge(tree.parent(node), node).object_id}/annotation")
      graph.insert(RDF::Statement.new(edge_uri, RDF.type, BioInterchange::CDAO.DirectedEdge))
      graph.insert(RDF::Statement.new(edge_uri, BioInterchange::CDAO.belongs_to_Tree, tree_uri))
      graph.insert(RDF::Statement.new(edge_uri, BioInterchange::CDAO.has_Parent_Node, parent_uri))
      graph.insert(RDF::Statement.new(edge_uri, BioInterchange::CDAO.has_Child_Node, node_uri))
      graph.insert(RDF::Statement.new(node_uri, BioInterchange::CDAO.belongs_to_Edge_as_Child, edge_uri))
      graph.insert(RDF::Statement.new(node_uri, BioInterchange::CDAO.has_Parent, parent_uri))
      graph.insert(RDF::Statement.new(parent_uri, BioInterchange::CDAO.belongs_to_Edge_as_Parent, edge_uri))

      # if node.distance then
      #  graph.insert(RDF::Statement.new(node_uri, BioInterchange::CDAO.has_Support_Value, RDF::Literal.new(node.distance, :datatype => RDF::URI.new('http://www.w3.org/2001/XMLSchema#decimal'))))
      # end

      graph.insert(RDF::Statement.new(edge_uri, BioInterchange::CDAO.has_Annotation, annotation_uri))
      graph.insert(RDF::Statement.new(annotation_uri, RDF.type, BioInterchange::CDAO.EdgeLength))
      graph.insert(RDF::Statement.new(annotation_uri, BioInterchange::CDAO.has_Value, RDF::Literal.new(tree.get_edge(tree.parent(node), node).distance, :datatype => RDF::URI.new('http://www.w3.org/2001/XMLSchema#decimal'))))
    end

    graph.insert(RDF::Statement.new(tree_uri, BioInterchange::CDAO.has_Root, node_uri))
    graph.insert(RDF::Statement.new(node_uri, BioInterchange::CDAO.belongs_to_Tree, tree_uri))
    
    # Now, continue traversing the tree by visiting the current node's descendents:
    tree.descendents(node).each { |descendent_node|
      serialize_tree(graph, tree, tree_uri, descendent_node, false)
    }
  end

end

end

