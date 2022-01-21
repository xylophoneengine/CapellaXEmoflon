/**
 */
package TransitionActors_Oa2Sa.impl;

import TransitionActors_Oa2Sa.Oa2Sa;
import TransitionActors_Oa2Sa.Oa2Sa_generation__Marker;
import TransitionActors_Oa2Sa.TransitionActors_Oa2SaFactory;
import TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.information.communication.CommunicationPackage;

import org.polarsys.capella.core.data.information.datatype.DatatypePackage;

import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;

import org.polarsys.capella.core.data.requirement.RequirementPackage;

import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionActors_Oa2SaPackageImpl extends EPackageImpl implements TransitionActors_Oa2SaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2SaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_generation__MarkerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransitionActors_Oa2SaPackageImpl() {
		super(eNS_URI, TransitionActors_Oa2SaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TransitionActors_Oa2SaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransitionActors_Oa2SaPackage init() {
		if (isInited) return (TransitionActors_Oa2SaPackage)EPackage.Registry.INSTANCE.getEPackage(TransitionActors_Oa2SaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTransitionActors_Oa2SaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TransitionActors_Oa2SaPackageImpl theTransitionActors_Oa2SaPackage = registeredTransitionActors_Oa2SaPackage instanceof TransitionActors_Oa2SaPackageImpl ? (TransitionActors_Oa2SaPackageImpl)registeredTransitionActors_Oa2SaPackage : new TransitionActors_Oa2SaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		CommunicationPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();
		DatavaluePackage.eINSTANCE.eClass();
		DatatypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTransitionActors_Oa2SaPackage.createPackageContents();

		// Initialize created meta-data
		theTransitionActors_Oa2SaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransitionActors_Oa2SaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransitionActors_Oa2SaPackage.eNS_URI, theTransitionActors_Oa2SaPackage);
		return theTransitionActors_Oa2SaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa() {
		return oa2SaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_Source() {
		return (EReference)oa2SaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_Target() {
		return (EReference)oa2SaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_generation__Marker() {
		return oa2Sa_generation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa() {
		return (EReference)oa2Sa_generation__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionActors_Oa2SaFactory getTransitionActors_Oa2SaFactory() {
		return (TransitionActors_Oa2SaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		oa2SaEClass = createEClass(OA2_SA);
		createEReference(oa2SaEClass, OA2_SA__SOURCE);
		createEReference(oa2SaEClass, OA2_SA__TARGET);

		oa2Sa_generation__MarkerEClass = createEClass(OA2_SA_GENERATION_MARKER);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH);
		createEReference(oa2Sa_generation__MarkerEClass, OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OaPackage theOaPackage = (OaPackage)EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI);
		CtxPackage theCtxPackage = (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oa2Sa_generation__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(oa2SaEClass, Oa2Sa.class, "Oa2Sa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_Source(), theOaPackage.getOperationalAnalysis(), null, "source", null, 0, 1, Oa2Sa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_Target(), theCtxPackage.getSystemAnalysis(), null, "target", null, 0, 1, Oa2Sa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_generation__MarkerEClass, Oa2Sa_generation__Marker.class, "Oa2Sa_generation__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_sa_arch", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa(), this.getOa2Sa(), null, "CREATE__CORR__new_oa2sa", null, 1, 1, Oa2Sa_generation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TransitionActors_Oa2SaPackageImpl
