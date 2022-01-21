/**
 */
package TransitionActors_Oa2Sa;

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
 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaFactory
 * @model kind="package"
 * @generated
 */
public interface TransitionActors_Oa2SaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TransitionActors_Oa2Sa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/TransitionActors_Oa2Sa/model/TransitionActors_Oa2Sa.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TransitionActors_Oa2Sa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransitionActors_Oa2SaPackage eINSTANCE = TransitionActors_Oa2Sa.impl.TransitionActors_Oa2SaPackageImpl.init();

	/**
	 * The meta object id for the '{@link TransitionActors_Oa2Sa.impl.Oa2SaImpl <em>Oa2 Sa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransitionActors_Oa2Sa.impl.Oa2SaImpl
	 * @see TransitionActors_Oa2Sa.impl.TransitionActors_Oa2SaPackageImpl#getOa2Sa()
	 * @generated
	 */
	int OA2_SA = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Oa2 Sa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Oa2 Sa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl <em>Oa2 Sa generation Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl
	 * @see TransitionActors_Oa2Sa.impl.TransitionActors_Oa2SaPackageImpl#getOa2Sa_generation__Marker()
	 * @generated
	 */
	int OA2_SA_GENERATION_MARKER = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_GENERATION_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg sa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE CORR new oa2sa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Oa2 Sa generation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_GENERATION_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Oa2 Sa generation Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OA2_SA_GENERATION_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link TransitionActors_Oa2Sa.Oa2Sa <em>Oa2 Sa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oa2 Sa</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa
	 * @generated
	 */
	EClass getOa2Sa();

	/**
	 * Returns the meta object for the reference '{@link TransitionActors_Oa2Sa.Oa2Sa#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa#getSource()
	 * @see #getOa2Sa()
	 * @generated
	 */
	EReference getOa2Sa_Source();

	/**
	 * Returns the meta object for the reference '{@link TransitionActors_Oa2Sa.Oa2Sa#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa#getTarget()
	 * @see #getOa2Sa()
	 * @generated
	 */
	EReference getOa2Sa_Target();

	/**
	 * Returns the meta object for class '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker <em>Oa2 Sa generation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oa2 Sa generation Marker</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_generation__Marker
	 * @generated
	 */
	EClass getOa2Sa_generation__Marker();

	/**
	 * Returns the meta object for the reference '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src oa arch</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__SRC__src_oa_arch()
	 * @see #getOa2Sa_generation__Marker()
	 * @generated
	 */
	EReference getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch();

	/**
	 * Returns the meta object for the reference '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg sa arch</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__TRG__trg_sa_arch()
	 * @see #getOa2Sa_generation__Marker()
	 * @generated
	 */
	EReference getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch();

	/**
	 * Returns the meta object for the reference '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR new oa2sa</em>'.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__CORR__new_oa2sa()
	 * @see #getOa2Sa_generation__Marker()
	 * @generated
	 */
	EReference getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransitionActors_Oa2SaFactory getTransitionActors_Oa2SaFactory();

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
		 * The meta object literal for the '{@link TransitionActors_Oa2Sa.impl.Oa2SaImpl <em>Oa2 Sa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransitionActors_Oa2Sa.impl.Oa2SaImpl
		 * @see TransitionActors_Oa2Sa.impl.TransitionActors_Oa2SaPackageImpl#getOa2Sa()
		 * @generated
		 */
		EClass OA2_SA = eINSTANCE.getOa2Sa();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA__SOURCE = eINSTANCE.getOa2Sa_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA__TARGET = eINSTANCE.getOa2Sa_Target();

		/**
		 * The meta object literal for the '{@link TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl <em>Oa2 Sa generation Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl
		 * @see TransitionActors_Oa2Sa.impl.TransitionActors_Oa2SaPackageImpl#getOa2Sa_generation__Marker()
		 * @generated
		 */
		EClass OA2_SA_GENERATION_MARKER = eINSTANCE.getOa2Sa_generation__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src oa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH = eINSTANCE.getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg sa arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH = eINSTANCE.getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR new oa2sa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA = eINSTANCE.getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa();

	}

} //TransitionActors_Oa2SaPackage
