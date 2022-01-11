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
	 * The meta object id for the '{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl <em>Operational Analysis2 System Analysis Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl
	 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE TRG ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operational Analysis2 System Analysis Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

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
	 * Returns the meta object for class '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker <em>Operational Analysis2 System Analysis Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operational Analysis2 System Analysis Marker</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker
	 * @generated
	 */
	EClass getOperationalAnalysis2SystemAnalysis__Marker();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__oa_arch <em>CREATE SRC oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC oa arch</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__oa_arch()
	 * @see #getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__oa_arch();

	/**
	 * Returns the meta object for the reference '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__TRG__ctx_arch <em>CREATE TRG ctx arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG ctx arch</em>'.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__TRG__ctx_arch()
	 * @see #getOperationalAnalysis2SystemAnalysis__Marker()
	 * @generated
	 */
	EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__ctx_arch();

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
		 * The meta object literal for the '{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl <em>Operational Analysis2 System Analysis Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl
		 * @see Oa2Ctx.impl.Oa2CtxPackageImpl#getOperationalAnalysis2SystemAnalysis__Marker()
		 * @generated
		 */
		EClass OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG ctx arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH = eINSTANCE.getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__ctx_arch();

	}

} //Oa2CtxPackage
