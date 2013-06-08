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


public class CDAO {

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000142)
   */
  public static Resource has_Character() {
    return _namespace_CDAO("CDAO_0000142");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000143)
   */
  public static Resource belongs_to_Edge_as_Child() {
    return _namespace_CDAO("CDAO_0000143");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000144)
   */
  public static Resource has_Ancestor() {
    return _namespace_CDAO("CDAO_0000144");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000145)
   */
  public static Resource has_Nucleotide_State() {
    return _namespace_CDAO("CDAO_0000145");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000146)
   */
  public static Resource belongs_to_Edge() {
    return _namespace_CDAO("CDAO_0000146");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000147)
   */
  public static Resource belongs_to_Character_State_Data_Matrix() {
    return _namespace_CDAO("CDAO_0000147");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000148)
   */
  public static Resource has_Root() {
    return _namespace_CDAO("CDAO_0000148");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000149)
   */
  public static Resource has_Child() {
    return _namespace_CDAO("CDAO_0000149");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000150)
   */
  public static Resource has_First_Coordinate_Item() {
    return _namespace_CDAO("CDAO_0000150");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000151)
   */
  public static Resource has_Coordinate() {
    return _namespace_CDAO("CDAO_0000151");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000152)
   */
  public static Resource belongs_to_Continuous_Character() {
    return _namespace_CDAO("CDAO_0000152");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000153)
   */
  public static Resource has_Datum() {
    return _namespace_CDAO("CDAO_0000153");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000154)
   */
  public static Resource has_Standard_Datum() {
    return _namespace_CDAO("CDAO_0000154");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000155)
   */
  public static Resource subtree_of() {
    return _namespace_CDAO("CDAO_0000155");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000156)
   */
  public static Resource has_Amino_Acid_State() {
    return _namespace_CDAO("CDAO_0000156");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000157)
   */
  public static Resource is_annotation_of() {
    return _namespace_CDAO("CDAO_0000157");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000158)
   */
  public static Resource has_RNA_Datum() {
    return _namespace_CDAO("CDAO_0000158");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000159)
   */
  public static Resource has_Left_State() {
    return _namespace_CDAO("CDAO_0000159");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000160)
   */
  public static Resource precedes() {
    return _namespace_CDAO("CDAO_0000160");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000161)
   */
  public static Resource exclude() {
    return _namespace_CDAO("CDAO_0000161");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000162)
   */
  public static Resource has_Node() {
    return _namespace_CDAO("CDAO_0000162");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000163)
   */
  public static Resource nca_node_of() {
    return _namespace_CDAO("CDAO_0000163");
  }

  /**
   * Associates a TU to some external taxonomy reference.
   * (http://purl.obolibrary.org/obo/CDAO_0000164)
   */
  public static Resource has_External_Reference() {
    return _namespace_CDAO("CDAO_0000164");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000165)
   */
  public static Resource has_Coordinate_System() {
    return _namespace_CDAO("CDAO_0000165");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000166)
   */
  public static Resource belongs_to_Nucleotide_Character() {
    return _namespace_CDAO("CDAO_0000166");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000167)
   */
  public static Resource connects_to() {
    return _namespace_CDAO("CDAO_0000167");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000168)
   */
  public static Resource has_Amino_Acid_Datum() {
    return _namespace_CDAO("CDAO_0000168");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000169)
   */
  public static Resource hereditary_change_of() {
    return _namespace_CDAO("CDAO_0000169");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000170)
   */
  public static Resource has_Compound_Datum() {
    return _namespace_CDAO("CDAO_0000170");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000171)
   */
  public static Resource has_Descendants() {
    return _namespace_CDAO("CDAO_0000171");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000172)
   */
  public static Resource reconciliation_of() {
    return _namespace_CDAO("CDAO_0000172");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000173)
   */
  public static Resource belongs_to_Amino_Acid_Character() {
    return _namespace_CDAO("CDAO_0000173");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000174)
   */
  public static Resource has_Descendant() {
    return _namespace_CDAO("CDAO_0000174");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000175)
   */
  public static Resource has_Continuous_State() {
    return _namespace_CDAO("CDAO_0000175");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000176)
   */
  public static Resource has_Type() {
    return _namespace_CDAO("CDAO_0000176");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000177)
   */
  public static Resource belongs_to_Edge_as_Parent() {
    return _namespace_CDAO("CDAO_0000177");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000178)
   */
  public static Resource has() {
    return _namespace_CDAO("CDAO_0000178");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000179)
   */
  public static Resource has_Parent() {
    return _namespace_CDAO("CDAO_0000179");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000180)
   */
  public static Resource belongs_to_Compound_Character() {
    return _namespace_CDAO("CDAO_0000180");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000181)
   */
  public static Resource homologous_to() {
    return _namespace_CDAO("CDAO_0000181");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000182)
   */
  public static Resource has_Change_Component() {
    return _namespace_CDAO("CDAO_0000182");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000183)
   */
  public static Resource has_Categorical_Datum() {
    return _namespace_CDAO("CDAO_0000183");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000184)
   */
  public static Resource has_State() {
    return _namespace_CDAO("CDAO_0000184");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000185)
   */
  public static Resource has_Left_Node() {
    return _namespace_CDAO("CDAO_0000185");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000186)
   */
  public static Resource has_Right_State() {
    return _namespace_CDAO("CDAO_0000186");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000187)
   */
  public static Resource represents_TU() {
    return _namespace_CDAO("CDAO_0000187");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000188)
   */
  public static Resource exclude_Node() {
    return _namespace_CDAO("CDAO_0000188");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000189)
   */
  public static Resource has_Compound_State() {
    return _namespace_CDAO("CDAO_0000189");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000190)
   */
  public static Resource belongs_to() {
    return _namespace_CDAO("CDAO_0000190");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000191)
   */
  public static Resource belongs_to_TU() {
    return _namespace_CDAO("CDAO_0000191");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000192)
   */
  public static Resource belongs_to_Network() {
    return _namespace_CDAO("CDAO_0000192");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000193)
   */
  public static Resource has_Annotation() {
    return _namespace_CDAO("CDAO_0000193");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000194)
   */
  public static Resource part_of() {
    return _namespace_CDAO("CDAO_0000194");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000195)
   */
  public static Resource has_Nucleotide_Datum() {
    return _namespace_CDAO("CDAO_0000195");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000196)
   */
  public static Resource represented_by_Node() {
    return _namespace_CDAO("CDAO_0000196");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000197)
   */
  public static Resource has_Remaining_Coordinate_List() {
    return _namespace_CDAO("CDAO_0000197");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000198)
   */
  public static Resource has_Element() {
    return _namespace_CDAO("CDAO_0000198");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000199)
   */
  public static Resource exclude_Subtree() {
    return _namespace_CDAO("CDAO_0000199");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000200)
   */
  public static Resource belongs_to_Tree() {
    return _namespace_CDAO("CDAO_0000200");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000201)
   */
  public static Resource has_Parent_Node() {
    return _namespace_CDAO("CDAO_0000201");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000202)
   */
  public static Resource has_Lineage_node() {
    return _namespace_CDAO("CDAO_0000202");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000203)
   */
  public static Resource belongs_to_Tree_as_Root() {
    return _namespace_CDAO("CDAO_0000203");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000204)
   */
  public static Resource has_Hereditary_Change() {
    return _namespace_CDAO("CDAO_0000204");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000205)
   */
  public static Resource belongs_to_Character() {
    return _namespace_CDAO("CDAO_0000205");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000206)
   */
  public static Resource has_Molecular_Datum() {
    return _namespace_CDAO("CDAO_0000206");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000207)
   */
  public static Resource has_Continuous_Datum() {
    return _namespace_CDAO("CDAO_0000207");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000208)
   */
  public static Resource has_TU() {
    return _namespace_CDAO("CDAO_0000208");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000209)
   */
  public static Resource has_Child_Node() {
    return _namespace_CDAO("CDAO_0000209");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000210)
   */
  public static Resource has_Right_Node() {
    return _namespace_CDAO("CDAO_0000210");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000211)
   */
  public static Resource has_Precision() {
    return _namespace_CDAO("CDAO_0000211");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000212)
   */
  public static Resource has_Point_Coordinate_Value() {
    return _namespace_CDAO("CDAO_0000212");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000213)
   */
  public static Resource has_Int_Value() {
    return _namespace_CDAO("CDAO_0000213");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000214)
   */
  public static Resource has_Support_Value() {
    return _namespace_CDAO("CDAO_0000214");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000215)
   */
  public static Resource has_Value() {
    return _namespace_CDAO("CDAO_0000215");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000216)
   */
  public static Resource has_Uncertainty_Factor() {
    return _namespace_CDAO("CDAO_0000216");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000217)
   */
  public static Resource has_Range_End_Value() {
    return _namespace_CDAO("CDAO_0000217");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000218)
   */
  public static Resource has_Float_Value() {
    return _namespace_CDAO("CDAO_0000218");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000219)
   */
  public static Resource has_Range_Start_Value() {
    return _namespace_CDAO("CDAO_0000219");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000002)
   */
  public static Resource DesoxiRibonucleotideResidueStateDatum() {
    return _namespace_CDAO("CDAO_0000002");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000003)
   */
  public static Resource CoordinatePoint() {
    return _namespace_CDAO("CDAO_0000003");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000004)
   */
  public static Resource Lineage() {
    return _namespace_CDAO("CDAO_0000004");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000005)
   */
  public static Resource Phylo4Tree() {
    return _namespace_CDAO("CDAO_0000005");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000006)
   */
  public static Resource Network() {
    return _namespace_CDAO("CDAO_0000006");
  }

  /**
   * This is a non-computible description of a model, not the fully specified mathematical model, which typically relates the probability of a transformation to various parameters.
   * (http://purl.obolibrary.org/obo/CDAO_0000007)
   */
  public static Resource ModelDescription() {
    return _namespace_CDAO("CDAO_0000007");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000008)
   */
  public static Resource StandardStateDatum() {
    return _namespace_CDAO("CDAO_0000008");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000009)
   */
  public static Resource ContinuousCharacterLengthType() {
    return _namespace_CDAO("CDAO_0000009");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000010)
   */
  public static Resource ContinuousCharBayesianLengthType() {
    return _namespace_CDAO("CDAO_0000010");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000011)
   */
  public static Resource NEXUSTreeBlock() {
    return _namespace_CDAO("CDAO_0000011");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000012)
   */
  public static Resource RootedTree() {
    return _namespace_CDAO("CDAO_0000012");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000013)
   */
  public static Resource Kimura2Parameters() {
    return _namespace_CDAO("CDAO_0000013");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000014)
   */
  public static Resource TreeProcedure() {
    return _namespace_CDAO("CDAO_0000014");
  }

  /**
   * This class should be renamed.  These are not generic states but non-concrete states including gap, unknown and missing.
   * (http://purl.obolibrary.org/obo/CDAO_0000015)
   */
  public static Resource Generic_State() {
    return _namespace_CDAO("CDAO_0000015");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000016)
   */
  public static Resource UnrootedSubtree() {
    return _namespace_CDAO("CDAO_0000016");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000017)
   */
  public static Resource UnresolvedTree() {
    return _namespace_CDAO("CDAO_0000017");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000018)
   */
  public static Resource BifurcatingTree() {
    return _namespace_CDAO("CDAO_0000018");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000019)
   */
  public static Resource ContinuousStateDatum() {
    return _namespace_CDAO("CDAO_0000019");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000020)
   */
  public static Resource SubstitutionModel() {
    return _namespace_CDAO("CDAO_0000020");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000021)
   */
  public static Resource JukesKantor() {
    return _namespace_CDAO("CDAO_0000021");
  }

  /**
   * drawing from seqloc categories from NCBI at http://www.ncbi.nlm.nih.gov/IEB/ToolBox/SDKDOCS/SEQLOC.HTML#_Seq-loc:_Locations_on
   * (http://purl.obolibrary.org/obo/CDAO_0000022)
   */
  public static Resource DatumCoordinate() {
    return _namespace_CDAO("CDAO_0000022");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000023)
   */
  public static Resource UnresolvedRootedTree() {
    return _namespace_CDAO("CDAO_0000023");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000024)
   */
  public static Resource Branch() {
    return _namespace_CDAO("CDAO_0000024");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000025)
   */
  public static Resource CharacterStateDataMatrixAnnotation() {
    return _namespace_CDAO("CDAO_0000025");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000026)
   */
  public static Resource AncestralNode() {
    return _namespace_CDAO("CDAO_0000026");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000027)
   */
  public static Resource UnresolvedUnrootedTree() {
    return _namespace_CDAO("CDAO_0000027");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000029)
   */
  public static Resource UncertainStateDomain() {
    return _namespace_CDAO("CDAO_0000029");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000030)
   */
  public static Resource ReconcileTree() {
    return _namespace_CDAO("CDAO_0000030");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000031)
   */
  public static Resource Continuous() {
    return _namespace_CDAO("CDAO_0000031");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000032)
   */
  public static Resource AlignmentProcedure() {
    return _namespace_CDAO("CDAO_0000032");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000033)
   */
  public static Resource Dichotomy() {
    return _namespace_CDAO("CDAO_0000033");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000034)
   */
  public static Resource Molecular() {
    return _namespace_CDAO("CDAO_0000034");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000035)
   */
  public static Resource ContinuousCharParsimonyLengthType() {
    return _namespace_CDAO("CDAO_0000035");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000039)
   */
  public static Resource Categorical() {
    return _namespace_CDAO("CDAO_0000039");
  }

  /**
   * Its possible that this base class should be discarded and that annotations should inherit from an imported base class if one exists.
   * (http://purl.obolibrary.org/obo/CDAO_0000040)
   */
  public static Resource CDAOAnnotation() {
    return _namespace_CDAO("CDAO_0000040");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000041)
   */
  public static Resource originationEvent() {
    return _namespace_CDAO("CDAO_0000041");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000042)
   */
  public static Resource Polytomy() {
    return _namespace_CDAO("CDAO_0000042");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000043)
   */
  public static Resource PolymorphicStateDomain() {
    return _namespace_CDAO("CDAO_0000043");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000044)
   */
  public static Resource TreeAnnotation() {
    return _namespace_CDAO("CDAO_0000044");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000045)
   */
  public static Resource Standard() {
    return _namespace_CDAO("CDAO_0000045");
  }

  /**
   * Its possible that this should not be classed as an "annotation" since it contains data rather than meta-data.
   * (http://purl.obolibrary.org/obo/CDAO_0000046)
   */
  public static Resource EdgeLength() {
    return _namespace_CDAO("CDAO_0000046");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000047)
   */
  public static Resource RibonucleotideResidue() {
    return _namespace_CDAO("CDAO_0000047");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000048)
   */
  public static Resource Clade() {
    return _namespace_CDAO("CDAO_0000048");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000049)
   */
  public static Resource DiscreteCharParsimonyLengthType() {
    return _namespace_CDAO("CDAO_0000049");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000050)
   */
  public static Resource MolecularStateDatum() {
    return _namespace_CDAO("CDAO_0000050");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000051)
   */
  public static Resource PolyphyleticGroup() {
    return _namespace_CDAO("CDAO_0000051");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000052)
   */
  public static Resource NexusDataBlock() {
    return _namespace_CDAO("CDAO_0000052");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000053)
   */
  public static Resource BranchingNode() {
    return _namespace_CDAO("CDAO_0000053");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000055)
   */
  public static Resource Compound() {
    return _namespace_CDAO("CDAO_0000055");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000056)
   */
  public static Resource CharacterStateDataMatrix() {
    return _namespace_CDAO("CDAO_0000056");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000057)
   */
  public static Resource RibonucleotideResidueStateDatum() {
    return _namespace_CDAO("CDAO_0000057");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000058)
   */
  public static Resource TimeCalibratedLengthType() {
    return _namespace_CDAO("CDAO_0000058");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000059)
   */
  public static Resource SetOfNodes() {
    return _namespace_CDAO("CDAO_0000059");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000060)
   */
  public static Resource MRCANode() {
    return _namespace_CDAO("CDAO_0000060");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000061)
   */
  public static Resource FASTADataMatrix() {
    return _namespace_CDAO("CDAO_0000061");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000062)
   */
  public static Resource evolutionaryTransition() {
    return _namespace_CDAO("CDAO_0000062");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000063)
   */
  public static Resource EdgeLengthType() {
    return _namespace_CDAO("CDAO_0000063");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000064)
   */
  public static Resource cladogeneticChange() {
    return _namespace_CDAO("CDAO_0000064");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000065)
   */
  public static Resource anageneticChange() {
    return _namespace_CDAO("CDAO_0000065");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000066)
   */
  public static Resource TUAnnotation() {
    return _namespace_CDAO("CDAO_0000066");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000067)
   */
  public static Resource PhyloTree() {
    return _namespace_CDAO("CDAO_0000067");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000068)
   */
  public static Resource ContinuousCharacter() {
    return _namespace_CDAO("CDAO_0000068");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000069)
   */
  public static Resource PHYLIPTree() {
    return _namespace_CDAO("CDAO_0000069");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000070)
   */
  public static Resource Subtree() {
    return _namespace_CDAO("CDAO_0000070");
  }

  /**
   * Traits shown to be relevant for phylogenetic classification
   * (http://purl.obolibrary.org/obo/CDAO_0000071)
   */
  public static Resource Character() {
    return _namespace_CDAO("CDAO_0000071");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000072)
   */
  public static Resource GalledTree() {
    return _namespace_CDAO("CDAO_0000072");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000073)
   */
  public static Resource SpeciesTree() {
    return _namespace_CDAO("CDAO_0000073");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000074)
   */
  public static Resource TreeFormat() {
    return _namespace_CDAO("CDAO_0000074");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000075)
   */
  public static Resource StandardCharacter() {
    return _namespace_CDAO("CDAO_0000075");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000076)
   */
  public static Resource AminoAcidResidue() {
    return _namespace_CDAO("CDAO_0000076");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000077)
   */
  public static Resource geneDuplication() {
    return _namespace_CDAO("CDAO_0000077");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000078)
   */
  public static Resource CompoundCharacter() {
    return _namespace_CDAO("CDAO_0000078");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000079)
   */
  public static Resource SIMMAPTree() {
    return _namespace_CDAO("CDAO_0000079");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000080)
   */
  public static Resource CommonAncestralNode() {
    return _namespace_CDAO("CDAO_0000080");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000081)
   */
  public static Resource NewickTree() {
    return _namespace_CDAO("CDAO_0000081");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000082)
   */
  public static Resource TimeProportionalLengthType() {
    return _namespace_CDAO("CDAO_0000082");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000083)
   */
  public static Resource DiscreteCharDistanceLengthType() {
    return _namespace_CDAO("CDAO_0000083");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000084)
   */
  public static Resource StarTree() {
    return _namespace_CDAO("CDAO_0000084");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000085)
   */
  public static Resource FullyResolvedUnrootedTree() {
    return _namespace_CDAO("CDAO_0000085");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000086)
   */
  public static Resource ParaphyleticGroup() {
    return _namespace_CDAO("CDAO_0000086");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000087)
   */
  public static Resource geneticEvent() {
    return _namespace_CDAO("CDAO_0000087");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000088)
   */
  public static Resource UnrootedTree() {
    return _namespace_CDAO("CDAO_0000088");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000089)
   */
  public static Resource CategoricalStateDatum() {
    return _namespace_CDAO("CDAO_0000089");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000090)
   */
  public static Resource DiscreteCharLikelihoodLengthType() {
    return _namespace_CDAO("CDAO_0000090");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000091)
   */
  public static Resource CharacterStateDomain() {
    return _namespace_CDAO("CDAO_0000091");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000092)
   */
  public static Resource CoordinateList() {
    return _namespace_CDAO("CDAO_0000092");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000093)
   */
  public static Resource GammaDistribution() {
    return _namespace_CDAO("CDAO_0000093");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000094)
   */
  public static Resource DesoxiRibonucleotideResidueCharacter() {
    return _namespace_CDAO("CDAO_0000094");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000095)
   */
  public static Resource CoordinateRange() {
    return _namespace_CDAO("CDAO_0000095");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000096)
   */
  public static Resource ReticulateEvolution() {
    return _namespace_CDAO("CDAO_0000096");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000097)
   */
  public static Resource hereditaryChange() {
    return _namespace_CDAO("CDAO_0000097");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000098)
   */
  public static Resource CharacterStateDatum() {
    return _namespace_CDAO("CDAO_0000098");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000099)
   */
  public static Resource Edge() {
    return _namespace_CDAO("CDAO_0000099");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000100)
   */
  public static Resource DiscreteCharacterLengthType() {
    return _namespace_CDAO("CDAO_0000100");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000101)
   */
  public static Resource EdgeAnnotation() {
    return _namespace_CDAO("CDAO_0000101");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000102)
   */
  public static Resource FullyResolvedRootedTree() {
    return _namespace_CDAO("CDAO_0000102");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000103)
   */
  public static Resource GrafenLengthType() {
    return _namespace_CDAO("CDAO_0000103");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000104)
   */
  public static Resource CoordinateSystem() {
    return _namespace_CDAO("CDAO_0000104");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000105)
   */
  public static Resource GenBankDataMatrix() {
    return _namespace_CDAO("CDAO_0000105");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000107)
   */
  public static Resource DataMatrixFormat() {
    return _namespace_CDAO("CDAO_0000107");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000108)
   */
  public static Resource TerminalNode() {
    return _namespace_CDAO("CDAO_0000108");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000109)
   */
  public static Resource RibonucleotideResidueCharacter() {
    return _namespace_CDAO("CDAO_0000109");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000110)
   */
  public static Resource Tree() {
    return _namespace_CDAO("CDAO_0000110");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000111)
   */
  public static Resource CategoricalCharacter() {
    return _namespace_CDAO("CDAO_0000111");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000112)
   */
  public static Resource AminoAcidResidueStateDatum() {
    return _namespace_CDAO("CDAO_0000112");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000113)
   */
  public static Resource PHYLIPDataMatrix() {
    return _namespace_CDAO("CDAO_0000113");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000114)
   */
  public static Resource ContinuousCharLikelihoodLengthType() {
    return _namespace_CDAO("CDAO_0000114");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000115)
   */
  public static Resource MolecularCharacter() {
    return _namespace_CDAO("CDAO_0000115");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000116)
   */
  public static Resource hereditaryPersistance() {
    return _namespace_CDAO("CDAO_0000116");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000117)
   */
  public static Resource SetOfCharacters() {
    return _namespace_CDAO("CDAO_0000117");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000118)
   */
  public static Resource SetOfThings() {
    return _namespace_CDAO("CDAO_0000118");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000120)
   */
  public static Resource Sequence() {
    return _namespace_CDAO("CDAO_0000120");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000121)
   */
  public static Resource speciation() {
    return _namespace_CDAO("CDAO_0000121");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000122)
   */
  public static Resource cladogenesis() {
    return _namespace_CDAO("CDAO_0000122");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000124)
   */
  public static Resource Bifurcation() {
    return _namespace_CDAO("CDAO_0000124");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000125)
   */
  public static Resource DiscreteCharBayesianLengthType() {
    return _namespace_CDAO("CDAO_0000125");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000126)
   */
  public static Resource TaxonomicLink() {
    return _namespace_CDAO("CDAO_0000126");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000127)
   */
  public static Resource MonophyleticGroup() {
    return _namespace_CDAO("CDAO_0000127");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000128)
   */
  public static Resource molecularRecombination() {
    return _namespace_CDAO("CDAO_0000128");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000129)
   */
  public static Resource HolophyleticGroup() {
    return _namespace_CDAO("CDAO_0000129");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000130)
   */
  public static Resource FullyResolvedTree() {
    return _namespace_CDAO("CDAO_0000130");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000131)
   */
  public static Resource AminoAcidResidueCharacter() {
    return _namespace_CDAO("CDAO_0000131");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000132)
   */
  public static Resource recombination() {
    return _namespace_CDAO("CDAO_0000132");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000133)
   */
  public static Resource DesoxiRibonucleotideResidue() {
    return _namespace_CDAO("CDAO_0000133");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000134)
   */
  public static Resource RootedSubtree() {
    return _namespace_CDAO("CDAO_0000134");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000136)
   */
  public static Resource CompoundStateDatum() {
    return _namespace_CDAO("CDAO_0000136");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000137)
   */
  public static Resource GapCost() {
    return _namespace_CDAO("CDAO_0000137");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000138)
   */
  public static Resource TU() {
    return _namespace_CDAO("CDAO_0000138");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000139)
   */
  public static Resource DirectedEdge() {
    return _namespace_CDAO("CDAO_0000139");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000140)
   */
  public static Resource Node() {
    return _namespace_CDAO("CDAO_0000140");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000141)
   */
  public static Resource ContinuousCharDistanceLengthType() {
    return _namespace_CDAO("CDAO_0000141");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000220)
   */
  public static Resource dA() {
    return _namespace_CDAO("CDAO_0000220");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000221)
   */
  public static Resource absent() {
    return _namespace_CDAO("CDAO_0000221");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000222)
   */
  public static Resource unknown() {
    return _namespace_CDAO("CDAO_0000222");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000223)
   */
  public static Resource gap() {
    return _namespace_CDAO("CDAO_0000223");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000224)
   */
  public static Resource dG() {
    return _namespace_CDAO("CDAO_0000224");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000225)
   */
  public static Resource rU() {
    return _namespace_CDAO("CDAO_0000225");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000226)
   */
  public static Resource dC() {
    return _namespace_CDAO("CDAO_0000226");
  }

  /**
   * -- No comment or description provided. --
   * (http://purl.obolibrary.org/obo/CDAO_0000227)
   */
  public static Resource dT() {
    return _namespace_CDAO("CDAO_0000227");
  }

  /**
   * Determines whether the given URI is an object property.
   * 
   * @param uri URI that is tested for being an object property
   */
  public static boolean isObjectProperty(Resource uri) {
    if (uri.equals(_namespace_CDAO("CDAO_0000142"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000143"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000144"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000145"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000146"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000147"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000148"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000149"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000150"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000151"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000152"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000153"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000154"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000155"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000156"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000157"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000158"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000159"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000160"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000161"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000162"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000163"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000164"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000165"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000166"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000167"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000168"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000169"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000170"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000171"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000172"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000173"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000174"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000175"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000176"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000177"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000178"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000179"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000180"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000181"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000182"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000183"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000184"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000185"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000186"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000187"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000188"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000189"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000190"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000191"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000192"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000193"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000194"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000195"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000196"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000197"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000198"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000199"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000200"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000201"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000202"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000203"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000204"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000205"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000206"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000207"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000208"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000209"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000210"))) {
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
    if (uri.equals(_namespace_CDAO("CDAO_0000211"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000212"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000213"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000214"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000215"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000216"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000217"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000218"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000219"))) {
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
    if (uri.equals(_namespace_CDAO("CDAO_0000002"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000003"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000004"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000005"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000006"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000007"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000008"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000009"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000010"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000011"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000012"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000013"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000014"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000015"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000016"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000017"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000018"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000019"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000020"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000021"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000022"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000023"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000024"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000025"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000026"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000027"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000029"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000030"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000031"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000032"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000033"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000034"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000035"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000039"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000040"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000041"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000042"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000043"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000044"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000045"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000046"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000047"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000048"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000049"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000050"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000051"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000052"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000053"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000055"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000056"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000057"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000058"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000059"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000060"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000061"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000062"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000063"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000064"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000065"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000066"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000067"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000068"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000069"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000070"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000071"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000072"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000073"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000074"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000075"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000076"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000077"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000078"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000079"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000080"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000081"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000082"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000083"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000084"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000085"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000086"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000087"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000088"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000089"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000090"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000091"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000092"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000093"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000094"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000095"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000096"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000097"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000098"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000099"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000100"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000101"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000102"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000103"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000104"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000105"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000107"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000108"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000109"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000110"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000111"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000112"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000113"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000114"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000115"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000116"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000117"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000118"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000120"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000121"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000122"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000124"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000125"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000126"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000127"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000128"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000129"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000130"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000131"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000132"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000133"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000134"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000136"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000137"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000138"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000139"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000140"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000141"))) {
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
    if (uri.equals(_namespace_CDAO("CDAO_0000220"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000221"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000222"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000223"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000224"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000225"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000226"))) {
      return true;
    }
    if (uri.equals(_namespace_CDAO("CDAO_0000227"))) {
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

  private static Resource _namespace_CDAO(String accession) {
    return ResourceFactory.createResource("http://purl.obolibrary.org/obo/" + accession);
  }


  private static Map<Resource, Resource> __parent_properties = _init___parent_properties();

  private static Map<Resource, Resource> _init___parent_properties() {
    Map<Resource, Resource> map = new HashMap<Resource, Resource>();

    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000142"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000143"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000146"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000144"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000145"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000184"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000146"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000147"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000148"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000149"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000174"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000150"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000151"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000152"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000205"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000153"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000154"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000183"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000156"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000184"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000158"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000206"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000159"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000182"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000162"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000166"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000205"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000168"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000206"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000170"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000183"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000171"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000173"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000205"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000174"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000175"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000184"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000176"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000177"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000146"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000179"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000144"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000180"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000205"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000182"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000183"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000153"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000184"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000185"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000182"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000186"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000182"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000188"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000161"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000189"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000184"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000191"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000192"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000193"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000195"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000206"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000197"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000198"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000199"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000161"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000200"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000201"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000162"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000202"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000203"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000204"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000205"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000190"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000206"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000183"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000207"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000153"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000208"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000178"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000209"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000162"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000210"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000182"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000213"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000215"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000218"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000215"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000002"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000050"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000003"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000022"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000005"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000007"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000138"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000008"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000089"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000009"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000115"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000010"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000009"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000011"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000013"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000020"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000014"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000044"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000015"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000039"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000016"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000070"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000017"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000110"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000018"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000110"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000019"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000098"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000020"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000007"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000021"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000020"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000023"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000017"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000027"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000088"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000032"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000025"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000033"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000026"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000034"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000134"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000035"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000009"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000039"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000057"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000040"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000042"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000026"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000055"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000110"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000132"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000100"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000126"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000089"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000137"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000107"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000114"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000050"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000113"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000063"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000061"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000064"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000125"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000065"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000097"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000067"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000069"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000072"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000006"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000073"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000110"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000044"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000075"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000111"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000076"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000034"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000077"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000064"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000079"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000081"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000074"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000082"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000063"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000083"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000100"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000085"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000088"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000087"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000133"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000088"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000110"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000090"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000100"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000092"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000022"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000093"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000020"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000095"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000022"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000096"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000006"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000103"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000063"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000104"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000105"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000025"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000108"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000140"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000110"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000006"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000128"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000071"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000112"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000111"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000121"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000066"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000127"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000132"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000129"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000127"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000130"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000070"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000136"));
    map.put(ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000141"), ResourceFactory.createResource("http://purl.obolibrary.org/obo/CDAO_0000009"));

    return map;
  }


}

