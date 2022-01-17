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
	 * The meta object id for the '{@link Oa2Ctx.impl.InitialModelCreation__MarkerImpl <em>Initial Model Creation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.InitialModelCreation__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getInitialModelCreation__Marker()
	 * @generated
	 */
	int INITIAL_MODEL_CREATION_MARKER = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER__CREATE_TRG_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER__CREATE_CORR_OA2CTX = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Initial Model Creation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Initial Model Creation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_MODEL_CREATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link Oa2Ctx.InitialModelCreation__Marker <em>Initial Model Creation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Model Creation Marker</em>'.
	 * @see Oa2Ctx.InitialModelCreation__Marker
	 * @generated
	 */
	EClass getInitialModelCreation__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src abstract capability pkg</em>'.
	 * @see Oa2Ctx.InitialModelCreation__Marker#getCREATE__SRC__src_abstract_capability_pkg()
	 * @see #getInitialModelCreation__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation__Marker_CREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see Oa2Ctx.InitialModelCreation__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getInitialModelCreation__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg ctx arch</em>'.
	 * @see Oa2Ctx.InitialModelCreation__Marker#getCREATE__TRG__trg_ctx_arch()
	 * @see #getInitialModelCreation__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation__Marker_CREATE__TRG__trg_ctx_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.InitialModelCreation__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR oa2ctx</em>'.
	 * @see Oa2Ctx.InitialModelCreation__Marker#getCREATE__CORR__oa2ctx()
	 * @see #getInitialModelCreation__Marker()
	 * @generated
	 */
	EReference getInitialModelCreation__Marker_CREATE__CORR__oa2ctx();

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
		 * The meta object literal for the '{@link Oa2Ctx.impl.InitialModelCreation__MarkerImpl <em>Initial Model Creation Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.InitialModelCreation__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getInitialModelCreation__Marker()
		 * @generated
		 */
		EClass INITIAL_MODEL_CREATION_MARKER = eINSTANCE.getInitialModelCreation__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG = eINSTANCE.getInitialModelCreation__Marker_CREATE__SRC__src_abstract_capability_pkg();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getInitialModelCreation__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_MARKER__CREATE_TRG_TRG_CTX_ARCH = eINSTANCE.getInitialModelCreation__Marker_CREATE__TRG__trg_ctx_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR oa2ctx</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_MODEL_CREATION_MARKER__CREATE_CORR_OA2CTX = eINSTANCE.getInitialModelCreation__Marker_CREATE__CORR__oa2ctx();

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

	}

} //Oa2CtxPackage
