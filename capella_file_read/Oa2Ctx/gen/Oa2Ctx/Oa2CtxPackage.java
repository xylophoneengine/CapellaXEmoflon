/**
 */
package Oa2Ctx;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Oa2Ctx.Oa2CtxFactory
 * @model kind="package"
 * @generated
 */
public interface Oa2CtxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Oa2Ctx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Oa2Ctx/model/Oa2Ctx.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Oa2Ctx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Oa2CtxPackage eINSTANCE = Oa2Ctx.impl.Oa2CtxPackageImpl.init();

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysisImpl <em>Operational Analysis2 System Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.OperationalAnalysis2SystemAnalysisImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOperationalAnalysis2SystemAnalysis()
	 * @generated
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Operational Analysis2 System Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operational Analysis2 System Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl <em>Initial Model Creation owned Data Pkg Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src operational capabilities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE SRC src data pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE SRC src entity pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE SRC src function pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE SRC src interface pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CREATE SRC src role pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CREATE TRG bool literal false</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>CREATE TRG bool literal true</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>CREATE TRG byte literal max val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>CREATE TRG byte literal min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>CREATE TRG char literal max length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>CREATE TRG char literal min length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>CREATE TRG hex literal max val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>CREATE TRG hex literal max val left operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>CREATE TRG hex literal max val left operand left operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>CREATE TRG hex literal max val left operand right operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>CREATE TRG hex literal max val right operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>CREATE TRG hex literal min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg data pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt boolean</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt byte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt char</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt data pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt double</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt float</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt hex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt integer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt long</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt longlong</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt short</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt string</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt unsigned integer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt unsigned long</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt unsigned longlong</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg dt unsigned short</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg function pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg interface pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg mission pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg oa realization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg system comp pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>CREATE TRG unsigned int min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>CREATE TRG unsigned long min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>CREATE TRG unsigned longlong min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>CREATE TRG unsigned short min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 48;

	/**
	 * The number of structural features of the '<em>Initial Model Creation owned Data Pkg Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 49;

	/**
	 * The number of operations of the '<em>Initial Model Creation owned Data Pkg Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.Oa2Sa_create_nodes_and_try_to_set_reference__MarkerImpl <em>Oa2 Sa create nodes and try to set reference Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.Oa2Sa_create_nodes_and_try_to_set_reference__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_create_nodes_and_try_to_set_reference__Marker()
	 * @generated
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Oa2 Sa create nodes and try to set reference Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Oa2 Sa create nodes and try to set reference Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.Oa2Sa_create_nodes_only__MarkerImpl <em>Oa2 Sa create nodes only Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.Oa2Sa_create_nodes_only__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_create_nodes_only__Marker()
	 * @generated
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER = 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Oa2 Sa create nodes only Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Oa2 Sa create nodes only Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_CREATE_NODES_ONLY_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_name__MarkerImpl <em>Oa2 Sa nodes and set name Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.Oa2Sa_nodes_and_set_name__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_nodes_and_set_name__Marker()
	 * @generated
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Oa2 Sa nodes and set name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Oa2 Sa nodes and set name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_NAME_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl <em>Oa2 Sa nodes and set specific name Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_nodes_and_set_specific_name__Marker()
	 * @generated
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER = 5;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Oa2 Sa nodes and set specific name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Oa2 Sa nodes and set specific name Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl <em>Operational Analysis2 System Analysis Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operational Analysis2 System Analysis Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operational Analysis2 System Analysis Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Oa2Ctx.impl.debugrule_create_oa_and_entitypkg__MarkerImpl <em>debugrule create oa and entitypkg Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.debugrule_create_oa_and_entitypkg__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getdebugrule_create_oa_and_entitypkg__Marker()
	 * @generated
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER = 7;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src entity pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>debugrule create oa and entitypkg Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>debugrule create oa and entitypkg Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis <em>Operational Analysis2 System Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Analysis2 System Analysis</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis
	 * @generated
	 */
	EClass getOperationalAnalysis2SystemAnalysis();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis#getSource()
	 * @see #getOperationalAnalysis2SystemAnalysis()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis_Source();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis#getTarget()
	 * @see #getOperationalAnalysis2SystemAnalysis()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis_Target();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker <em>Initial Model Creation owned Data Pkg Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Model Creation owned Data Pkg Marker</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker
	 * @generated
	 */
	EClass getInitialModelCreation_ownedDataPkg__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src__operational_capabilities <em>CREATE SRC src operational capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src operational capabilities</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src__operational_capabilities()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src__operational_capabilities();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_data_pkg <em>CREATE SRC src data pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src data pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_data_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_data_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src entity pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_entity_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_entity_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_function_pkg <em>CREATE SRC src function pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src function pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_function_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_function_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_interface_pkg <em>CREATE SRC src interface pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src interface pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_interface_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_interface_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_role_pkg <em>CREATE SRC src role pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src role pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_role_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_role_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_false <em>CREATE TRG bool literal false</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG bool literal false</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_false()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_false();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_true <em>CREATE TRG bool literal true</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG bool literal true</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_true()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_true();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_max_val <em>CREATE TRG byte literal max val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG byte literal max val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_max_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_max_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_min_val <em>CREATE TRG byte literal min val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG byte literal min val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_min_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_min_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_max_length <em>CREATE TRG char literal max length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG char literal max length</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_max_length()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_max_length();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_min_length <em>CREATE TRG char literal min length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG char literal min length</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_min_length()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_min_length();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val <em>CREATE TRG hex literal max val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG hex literal max val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand <em>CREATE TRG hex literal max val left operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG hex literal max val left operand</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_left_operand <em>CREATE TRG hex literal max val left operand left operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG hex literal max val left operand left operand</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_left_operand()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_left_operand();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_right_operand <em>CREATE TRG hex literal max val left operand right operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG hex literal max val left operand right operand</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_right_operand()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_right_operand();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_right_operand <em>CREATE TRG hex literal max val right operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG hex literal max val right operand</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_right_operand()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_right_operand();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_min_val <em>CREATE TRG hex literal min val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG hex literal min val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_min_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_min_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_abstract_capability_pkg <em>CREATE TRG trg abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg abstract capability pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_abstract_capability_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_data_pkg <em>CREATE TRG trg data pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg data pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_data_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_data_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_boolean <em>CREATE TRG trg dt boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt boolean</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_boolean()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_boolean();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_byte <em>CREATE TRG trg dt byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt byte</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_byte()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_byte();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_char <em>CREATE TRG trg dt char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt char</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_char()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_char();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_data_pkg <em>CREATE TRG trg dt data pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt data pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_data_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_data_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_double <em>CREATE TRG trg dt double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt double</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_double()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_double();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_float <em>CREATE TRG trg dt float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt float</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_float()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_float();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_hex <em>CREATE TRG trg dt hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt hex</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_hex()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_hex();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_integer <em>CREATE TRG trg dt integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt integer</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_integer()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_integer();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_long <em>CREATE TRG trg dt long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt long</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_long()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_long();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_longlong <em>CREATE TRG trg dt longlong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt longlong</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_longlong()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_longlong();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_short <em>CREATE TRG trg dt short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt short</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_short()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_short();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_string <em>CREATE TRG trg dt string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt string</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_string()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_string();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_integer <em>CREATE TRG trg dt unsigned integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt unsigned integer</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_integer()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_integer();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_long <em>CREATE TRG trg dt unsigned long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt unsigned long</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_long()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_long();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_longlong <em>CREATE TRG trg dt unsigned longlong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt unsigned longlong</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_longlong()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_longlong();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_short <em>CREATE TRG trg dt unsigned short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg dt unsigned short</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_unsigned_short()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_short();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_function_pkg <em>CREATE TRG trg function pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg function pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_function_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_function_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_interface_pkg <em>CREATE TRG trg interface pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg interface pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_interface_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_interface_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_mission_pkg <em>CREATE TRG trg mission pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg mission pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_mission_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_mission_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_oa_realization <em>CREATE TRG trg oa realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg oa realization</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_oa_realization()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_oa_realization();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_system_comp_pkg <em>CREATE TRG trg system comp pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg system comp pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_system_comp_pkg()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_system_comp_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_int_min_val <em>CREATE TRG unsigned int min val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG unsigned int min val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_int_min_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_int_min_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_long_min_val <em>CREATE TRG unsigned long min val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG unsigned long min val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_long_min_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_long_min_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_longlong_min_val <em>CREATE TRG unsigned longlong min val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG unsigned longlong min val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_longlong_min_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_longlong_min_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_short_min_val <em>CREATE TRG unsigned short min val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG unsigned short min val</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__unsigned_short_min_val()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_short_min_val();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getInitialModelCreation_ownedDataPkg__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker <em>Oa2 Sa create nodes and try to set reference Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oa2 Sa create nodes and try to set reference Marker</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker
	 * @generated
	 */
	EClass getOa2Sa_create_nodes_and_try_to_set_reference__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getOa2Sa_create_nodes_and_try_to_set_reference__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getOa2Sa_create_nodes_and_try_to_set_reference__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getOa2Sa_create_nodes_and_try_to_set_reference__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getOa2Sa_create_nodes_and_try_to_set_reference__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.Oa2Sa_create_nodes_only__Marker <em>Oa2 Sa create nodes only Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oa2 Sa create nodes only Marker</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_only__Marker
	 * @generated
	 */
	EClass getOa2Sa_create_nodes_only__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getOa2Sa_create_nodes_only__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getOa2Sa_create_nodes_only__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getOa2Sa_create_nodes_only__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_only__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_only__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getOa2Sa_create_nodes_only__Marker()
	 * @generated
	 */
	EReference getOa2Sa_create_nodes_only__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker <em>Oa2 Sa nodes and set name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oa2 Sa nodes and set name Marker</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker
	 * @generated
	 */
	EClass getOa2Sa_nodes_and_set_name__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getOa2Sa_nodes_and_set_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getOa2Sa_nodes_and_set_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getOa2Sa_nodes_and_set_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getOa2Sa_nodes_and_set_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker <em>Oa2 Sa nodes and set specific name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oa2 Sa nodes and set specific name Marker</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker
	 * @generated
	 */
	EClass getOa2Sa_nodes_and_set_specific_name__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getOa2Sa_nodes_and_set_specific_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getOa2Sa_nodes_and_set_specific_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getOa2Sa_nodes_and_set_specific_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getOa2Sa_nodes_and_set_specific_name__Marker()
	 * @generated
	 */
	EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker <em>Operational Analysis2 System Analysis Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Analysis2 System Analysis Marker</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker
	 * @generated
	 */
	EClass getOperationalAnalysis2SystemAnalysis__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the meta object for class '{@link Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker <em>debugrule create oa and entitypkg Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>debugrule create oa and entitypkg Marker</em>'.
	 * @see Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker
	 * @generated
	 */
	EClass getdebugrule_create_oa_and_entitypkg__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src entity pkg</em>'.
	 * @see Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__SRC__src_entity_pkg()
	 * @see #getdebugrule_create_oa_and_entitypkg__Marker()
	 * @generated
	 */
	EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_entity_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getdebugrule_create_oa_and_entitypkg__Marker()
	 * @generated
	 */
	EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getdebugrule_create_oa_and_entitypkg__Marker()
	 * @generated
	 */
	EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getdebugrule_create_oa_and_entitypkg__Marker()
	 * @generated
	 */
	EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__CORR__oa2ctx();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Oa2CtxFactory getOa2CtxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysisImpl <em>Operational Analysis2 System Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.OperationalAnalysis2SystemAnalysisImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOperationalAnalysis2SystemAnalysis()
		 * @generated
		 */
		EClass OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS = eINSTANCE.getOperationalAnalysis2SystemAnalysis();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE = eINSTANCE.getOperationalAnalysis2SystemAnalysis_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET = eINSTANCE.getOperationalAnalysis2SystemAnalysis_Target();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl <em>Initial Model Creation owned Data Pkg Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getInitialModelCreation_ownedDataPkg__Marker()
		 * @generated
		 */
		EClass INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src operational capabilities</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src__operational_capabilities();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src data pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_data_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src entity pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_entity_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src function pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_function_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src interface pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_interface_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src role pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_role_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG bool literal false</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_false();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG bool literal true</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_true();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG byte literal max val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_max_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG byte literal min val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_min_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG char literal max length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_max_length();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG char literal min length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_min_length();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG hex literal max val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG hex literal max val left operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG hex literal max val left operand left operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_left_operand();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG hex literal max val left operand right operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_right_operand();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG hex literal max val right operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_right_operand();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG hex literal min val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_min_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg data pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_data_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt boolean</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_boolean();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt byte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_byte();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt char</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_char();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt data pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_data_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt double</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_double();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt float</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_float();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt hex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_hex();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt integer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_integer();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt long</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_long();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt longlong</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_longlong();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt short</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_short();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt string</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_string();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt unsigned integer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_integer();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt unsigned long</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_long();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt unsigned longlong</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_longlong();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg dt unsigned short</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_short();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg function pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_function_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg interface pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_interface_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg mission pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_mission_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg oa realization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_oa_realization();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg system comp pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_system_comp_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG unsigned int min val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_int_min_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG unsigned long min val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_long_min_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG unsigned longlong min val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_longlong_min_val();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG unsigned short min val</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_short_min_val();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getInitialModelCreation_ownedDataPkg__Marker_CREATE__CORR__oa2ctx();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.Oa2Sa_create_nodes_and_try_to_set_reference__MarkerImpl <em>Oa2 Sa create nodes and try to set reference Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.Oa2Sa_create_nodes_and_try_to_set_reference__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_create_nodes_and_try_to_set_reference__Marker()
		 * @generated
		 */
		EClass OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER = eINSTANCE.getOa2Sa_create_nodes_and_try_to_set_reference__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__CORR__oa2ctx();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.Oa2Sa_create_nodes_only__MarkerImpl <em>Oa2 Sa create nodes only Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.Oa2Sa_create_nodes_only__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_create_nodes_only__Marker()
		 * @generated
		 */
		EClass OA2_SA_CREATE_NODES_ONLY_MARKER = eINSTANCE.getOa2Sa_create_nodes_only__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getOa2Sa_create_nodes_only__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getOa2Sa_create_nodes_only__Marker_CREATE__CORR__oa2ctx();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_name__MarkerImpl <em>Oa2 Sa nodes and set name Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.Oa2Sa_nodes_and_set_name__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_nodes_and_set_name__Marker()
		 * @generated
		 */
		EClass OA2_SA_NODES_AND_SET_NAME_MARKER = eINSTANCE.getOa2Sa_nodes_and_set_name__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getOa2Sa_nodes_and_set_name__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getOa2Sa_nodes_and_set_name__Marker_CREATE__CORR__oa2ctx();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl <em>Oa2 Sa nodes and set specific name Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOa2Sa_nodes_and_set_specific_name__Marker()
		 * @generated
		 */
		EClass OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER = eINSTANCE.getOa2Sa_nodes_and_set_specific_name__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__CORR__oa2ctx();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl <em>Operational Analysis2 System Analysis Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOperationalAnalysis2SystemAnalysis__Marker()
		 * @generated
		 */
		EClass OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker_CREATE__CORR__oa2ctx();

		/**
		 * The meta object literal for the '{@link Oa2Ctx.impl.debugrule_create_oa_and_entitypkg__MarkerImpl <em>debugrule create oa and entitypkg Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.debugrule_create_oa_and_entitypkg__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getdebugrule_create_oa_and_entitypkg__Marker()
		 * @generated
		 */
		EClass DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER = eINSTANCE.getdebugrule_create_oa_and_entitypkg__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src entity pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG = eINSTANCE.getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_entity_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getdebugrule_create_oa_and_entitypkg__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getdebugrule_create_oa_and_entitypkg__Marker_CREATE__CORR__oa2ctx();

	}

} //Oa2CtxPackage
