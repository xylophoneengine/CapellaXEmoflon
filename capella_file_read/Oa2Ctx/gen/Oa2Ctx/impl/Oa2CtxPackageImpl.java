/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.InitialModelCreation__Marker;
import Oa2Ctx.Oa2CtxFactory;
import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker;
import Oa2Ctx.Oa2Sa_create_nodes_only__Marker;
import Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker;
import Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker;

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
public class Oa2CtxPackageImpl extends EPackageImpl implements Oa2CtxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalAnalysis2SystemAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialModelCreation__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_create_nodes_only__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_nodes_and_set_name__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oa2Sa_nodes_and_set_specific_name__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalAnalysis2SystemAnalysis__MarkerEClass = null;

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
	 * @see Oa2Ctx.Oa2CtxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Oa2CtxPackageImpl() {
		super(eNS_URI, Oa2CtxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Oa2CtxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Oa2CtxPackage init() {
		if (isInited) return (Oa2CtxPackage)EPackage.Registry.INSTANCE.getEPackage(Oa2CtxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOa2CtxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Oa2CtxPackageImpl theOa2CtxPackage = registeredOa2CtxPackage instanceof Oa2CtxPackageImpl ? (Oa2CtxPackageImpl)registeredOa2CtxPackage : new Oa2CtxPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CapellamodellerPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
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
		theOa2CtxPackage.createPackageContents();

		// Initialize created meta-data
		theOa2CtxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOa2CtxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Oa2CtxPackage.eNS_URI, theOa2CtxPackage);
		return theOa2CtxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalAnalysis2SystemAnalysis() {
		return operationalAnalysis2SystemAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis2SystemAnalysis_Source() {
		return (EReference)operationalAnalysis2SystemAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis2SystemAnalysis_Target() {
		return (EReference)operationalAnalysis2SystemAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialModelCreation__Marker() {
		return initialModelCreation__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)initialModelCreation__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)initialModelCreation__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)initialModelCreation__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)initialModelCreation__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_create_nodes_and_try_to_set_reference__Marker() {
		return oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_create_nodes_only__Marker() {
		return oa2Sa_create_nodes_only__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)oa2Sa_create_nodes_only__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)oa2Sa_create_nodes_only__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_only__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)oa2Sa_create_nodes_only__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_create_nodes_only__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)oa2Sa_create_nodes_only__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_nodes_and_set_name__Marker() {
		return oa2Sa_nodes_and_set_name__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)oa2Sa_nodes_and_set_name__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)oa2Sa_nodes_and_set_name__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)oa2Sa_nodes_and_set_name__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_name__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)oa2Sa_nodes_and_set_name__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOa2Sa_nodes_and_set_specific_name__Marker() {
		return oa2Sa_nodes_and_set_specific_name__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)oa2Sa_nodes_and_set_specific_name__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)oa2Sa_nodes_and_set_specific_name__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)oa2Sa_nodes_and_set_specific_name__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)oa2Sa_nodes_and_set_specific_name__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalAnalysis2SystemAnalysis__Marker() {
		return operationalAnalysis2SystemAnalysis__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)operationalAnalysis2SystemAnalysis__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)operationalAnalysis2SystemAnalysis__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)operationalAnalysis2SystemAnalysis__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis2SystemAnalysis__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)operationalAnalysis2SystemAnalysis__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2CtxFactory getOa2CtxFactory() {
		return (Oa2CtxFactory)getEFactoryInstance();
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
		operationalAnalysis2SystemAnalysisEClass = createEClass(OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS);
		createEReference(operationalAnalysis2SystemAnalysisEClass, OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE);
		createEReference(operationalAnalysis2SystemAnalysisEClass, OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET);

		initialModelCreation__MarkerEClass = createEClass(INITIAL_MODEL_CREATION_MARKER);
		createEReference(initialModelCreation__MarkerEClass, INITIAL_MODEL_CREATION_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(initialModelCreation__MarkerEClass, INITIAL_MODEL_CREATION_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(initialModelCreation__MarkerEClass, INITIAL_MODEL_CREATION_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(initialModelCreation__MarkerEClass, INITIAL_MODEL_CREATION_MARKER__CREATE_CORR_OA2CTX);

		oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass = createEClass(OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER);
		createEReference(oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass, OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass, OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass, OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass, OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER__CREATE_CORR_OA2CTX);

		oa2Sa_create_nodes_only__MarkerEClass = createEClass(OA2_SA_CREATE_NODES_ONLY_MARKER);
		createEReference(oa2Sa_create_nodes_only__MarkerEClass, OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(oa2Sa_create_nodes_only__MarkerEClass, OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_create_nodes_only__MarkerEClass, OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(oa2Sa_create_nodes_only__MarkerEClass, OA2_SA_CREATE_NODES_ONLY_MARKER__CREATE_CORR_OA2CTX);

		oa2Sa_nodes_and_set_name__MarkerEClass = createEClass(OA2_SA_NODES_AND_SET_NAME_MARKER);
		createEReference(oa2Sa_nodes_and_set_name__MarkerEClass, OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(oa2Sa_nodes_and_set_name__MarkerEClass, OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_nodes_and_set_name__MarkerEClass, OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(oa2Sa_nodes_and_set_name__MarkerEClass, OA2_SA_NODES_AND_SET_NAME_MARKER__CREATE_CORR_OA2CTX);

		oa2Sa_nodes_and_set_specific_name__MarkerEClass = createEClass(OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER);
		createEReference(oa2Sa_nodes_and_set_specific_name__MarkerEClass, OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(oa2Sa_nodes_and_set_specific_name__MarkerEClass, OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(oa2Sa_nodes_and_set_specific_name__MarkerEClass, OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(oa2Sa_nodes_and_set_specific_name__MarkerEClass, OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX);

		operationalAnalysis2SystemAnalysis__MarkerEClass = createEClass(OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER);
		createEReference(operationalAnalysis2SystemAnalysis__MarkerEClass, OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(operationalAnalysis2SystemAnalysis__MarkerEClass, OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(operationalAnalysis2SystemAnalysis__MarkerEClass, OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(operationalAnalysis2SystemAnalysis__MarkerEClass, OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_CORR_OA2CTX);
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
		initialModelCreation__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_create_nodes_only__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_nodes_and_set_name__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_nodes_and_set_specific_name__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		operationalAnalysis2SystemAnalysis__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(operationalAnalysis2SystemAnalysisEClass, OperationalAnalysis2SystemAnalysis.class, "OperationalAnalysis2SystemAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalAnalysis2SystemAnalysis_Source(), theOaPackage.getOperationalAnalysis(), null, "source", null, 0, 1, OperationalAnalysis2SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis2SystemAnalysis_Target(), theCtxPackage.getSystemAnalysis(), null, "target", null, 0, 1, OperationalAnalysis2SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialModelCreation__MarkerEClass, InitialModelCreation__Marker.class, "InitialModelCreation__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialModelCreation__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, InitialModelCreation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, InitialModelCreation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, InitialModelCreation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, InitialModelCreation__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass, Oa2Sa_create_nodes_and_try_to_set_reference__Marker.class, "Oa2Sa_create_nodes_and_try_to_set_reference__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, Oa2Sa_create_nodes_and_try_to_set_reference__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, Oa2Sa_create_nodes_and_try_to_set_reference__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, Oa2Sa_create_nodes_and_try_to_set_reference__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_create_nodes_and_try_to_set_reference__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, Oa2Sa_create_nodes_and_try_to_set_reference__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_create_nodes_only__MarkerEClass, Oa2Sa_create_nodes_only__Marker.class, "Oa2Sa_create_nodes_only__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, Oa2Sa_create_nodes_only__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_create_nodes_only__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, Oa2Sa_create_nodes_only__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_create_nodes_only__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, Oa2Sa_create_nodes_only__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_create_nodes_only__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, Oa2Sa_create_nodes_only__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_nodes_and_set_name__MarkerEClass, Oa2Sa_nodes_and_set_name__Marker.class, "Oa2Sa_nodes_and_set_name__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, Oa2Sa_nodes_and_set_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_nodes_and_set_name__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, Oa2Sa_nodes_and_set_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_nodes_and_set_name__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, Oa2Sa_nodes_and_set_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_nodes_and_set_name__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, Oa2Sa_nodes_and_set_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oa2Sa_nodes_and_set_specific_name__MarkerEClass, Oa2Sa_nodes_and_set_specific_name__Marker.class, "Oa2Sa_nodes_and_set_specific_name__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, Oa2Sa_nodes_and_set_specific_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, Oa2Sa_nodes_and_set_specific_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, Oa2Sa_nodes_and_set_specific_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, Oa2Sa_nodes_and_set_specific_name__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalAnalysis2SystemAnalysis__MarkerEClass, OperationalAnalysis2SystemAnalysis__Marker.class, "OperationalAnalysis2SystemAnalysis__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, OperationalAnalysis2SystemAnalysis__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, OperationalAnalysis2SystemAnalysis__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, OperationalAnalysis2SystemAnalysis__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis2SystemAnalysis__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, OperationalAnalysis2SystemAnalysis__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Oa2CtxPackageImpl
