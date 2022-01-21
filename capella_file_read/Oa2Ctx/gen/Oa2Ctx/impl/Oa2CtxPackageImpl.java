/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker;
import Oa2Ctx.Oa2CtxFactory;
import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker;
import Oa2Ctx.Oa2Sa_create_nodes_only__Marker;
import Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker;
import Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker;
import Oa2Ctx.debugrule_create_oa_and_entitypkg__Marker;

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
	private EClass initialModelCreation_ownedDataPkg__MarkerEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debugrule_create_oa_and_entitypkg__MarkerEClass = null;

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
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		DatavaluePackage.eINSTANCE.eClass();
		DatatypePackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		EmdePackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		CommunicationPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();

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
	public EClass getInitialModelCreation_ownedDataPkg__Marker() {
		return initialModelCreation_ownedDataPkg__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src__operational_capabilities() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_abstract_capability_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_data_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_entity_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_function_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_interface_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_role_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_false() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_true() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_max_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_min_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_max_length() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_min_length() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_left_operand() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_right_operand() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_right_operand() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_min_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_abstract_capability_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_data_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_boolean() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_byte() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_char() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_data_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_double() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_float() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_hex() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_integer() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_long() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_longlong() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_short() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_string() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_integer() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_long() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_longlong() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_short() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_function_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_interface_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_mission_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_oa_realization() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_system_comp_pkg() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_int_min_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_long_min_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_longlong_min_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_short_min_val() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialModelCreation_ownedDataPkg__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)initialModelCreation_ownedDataPkg__MarkerEClass.getEStructuralFeatures().get(48);
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
	public EClass getdebugrule_create_oa_and_entitypkg__Marker() {
		return debugrule_create_oa_and_entitypkg__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_entity_pkg() {
		return (EReference)debugrule_create_oa_and_entitypkg__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_oa_arch() {
		return (EReference)debugrule_create_oa_and_entitypkg__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__TRG__trg_ctx_arch() {
		return (EReference)debugrule_create_oa_and_entitypkg__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdebugrule_create_oa_and_entitypkg__Marker_CREATE__CORR__oa2ctx() {
		return (EReference)debugrule_create_oa_and_entitypkg__MarkerEClass.getEStructuralFeatures().get(3);
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

		initialModelCreation_ownedDataPkg__MarkerEClass = createEClass(INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL);
		createEReference(initialModelCreation_ownedDataPkg__MarkerEClass, INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX);

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

		debugrule_create_oa_and_entitypkg__MarkerEClass = createEClass(DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER);
		createEReference(debugrule_create_oa_and_entitypkg__MarkerEClass, DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG);
		createEReference(debugrule_create_oa_and_entitypkg__MarkerEClass, DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_SRC_SRC_OA_ARCH);
		createEReference(debugrule_create_oa_and_entitypkg__MarkerEClass, DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_TRG_TRG_CTX_ARCH);
		createEReference(debugrule_create_oa_and_entitypkg__MarkerEClass, DEBUGRULE_CREATE_OA_AND_ENTITYPKG_MARKER__CREATE_CORR_OA2CTX);
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
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);
		DatavaluePackage theDatavaluePackage = (DatavaluePackage)EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage)EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		initialModelCreation_ownedDataPkg__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_create_nodes_and_try_to_set_reference__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_create_nodes_only__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_nodes_and_set_name__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		oa2Sa_nodes_and_set_specific_name__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		operationalAnalysis2SystemAnalysis__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		debugrule_create_oa_and_entitypkg__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(operationalAnalysis2SystemAnalysisEClass, OperationalAnalysis2SystemAnalysis.class, "OperationalAnalysis2SystemAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalAnalysis2SystemAnalysis_Source(), theOaPackage.getOperationalAnalysis(), null, "source", null, 0, 1, OperationalAnalysis2SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis2SystemAnalysis_Target(), theCtxPackage.getSystemAnalysis(), null, "target", null, 0, 1, OperationalAnalysis2SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialModelCreation_ownedDataPkg__MarkerEClass, InitialModelCreation_ownedDataPkg__Marker.class, "InitialModelCreation_ownedDataPkg__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src__operational_capabilities(), theOaPackage.getOperationalActivity(), null, "CREATE__SRC__src__operational_capabilities", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_abstract_capability_pkg(), theOaPackage.getOperationalCapabilityPkg(), null, "CREATE__SRC__src_abstract_capability_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_data_pkg(), theInformationPackage.getDataPkg(), null, "CREATE__SRC__src_data_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_entity_pkg(), theOaPackage.getEntityPkg(), null, "CREATE__SRC__src_entity_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_function_pkg(), theOaPackage.getOperationalActivityPkg(), null, "CREATE__SRC__src_function_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_interface_pkg(), theCsPackage.getInterfacePkg(), null, "CREATE__SRC__src_interface_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_role_pkg(), theOaPackage.getRolePkg(), null, "CREATE__SRC__src_role_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_false(), theDatavaluePackage.getLiteralBooleanValue(), null, "CREATE__TRG__bool_literal_false", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_true(), theDatavaluePackage.getLiteralBooleanValue(), null, "CREATE__TRG__bool_literal_true", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_max_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__byte_literal_max_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_min_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__byte_literal_min_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_max_length(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__char_literal_max_length", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_min_length(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__char_literal_min_length", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val(), theDatavaluePackage.getBinaryExpression(), null, "CREATE__TRG__hex_literal_max_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand(), theDatavaluePackage.getBinaryExpression(), null, "CREATE__TRG__hex_literal_max_val_left_operand", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_left_operand(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__hex_literal_max_val_left_operand_left_operand", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_right_operand(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__hex_literal_max_val_left_operand_right_operand", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_right_operand(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__hex_literal_max_val_right_operand", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_min_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__hex_literal_min_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_abstract_capability_pkg(), theCtxPackage.getCapabilityPkg(), null, "CREATE__TRG__trg_abstract_capability_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_data_pkg(), theInformationPackage.getDataPkg(), null, "CREATE__TRG__trg_data_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_boolean(), theDatatypePackage.getBooleanType(), null, "CREATE__TRG__trg_dt_boolean", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_byte(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_byte", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_char(), theDatatypePackage.getStringType(), null, "CREATE__TRG__trg_dt_char", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_data_pkg(), theInformationPackage.getDataPkg(), null, "CREATE__TRG__trg_dt_data_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_double(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_double", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_float(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_float", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_hex(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_hex", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_integer(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_integer", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_long(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_long", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_longlong(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_longlong", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_short(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_short", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_string(), theDatatypePackage.getStringType(), null, "CREATE__TRG__trg_dt_string", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_integer(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_unsigned_integer", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_long(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_unsigned_long", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_longlong(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_unsigned_longlong", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_unsigned_short(), theDatatypePackage.getNumericType(), null, "CREATE__TRG__trg_dt_unsigned_short", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_function_pkg(), theCtxPackage.getSystemFunctionPkg(), null, "CREATE__TRG__trg_function_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_interface_pkg(), theCsPackage.getInterfacePkg(), null, "CREATE__TRG__trg_interface_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_mission_pkg(), theCtxPackage.getMissionPkg(), null, "CREATE__TRG__trg_mission_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_oa_realization(), theCtxPackage.getOperationalAnalysisRealization(), null, "CREATE__TRG__trg_oa_realization", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_system_comp_pkg(), theCtxPackage.getSystemComponentPkg(), null, "CREATE__TRG__trg_system_comp_pkg", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_int_min_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__unsigned_int_min_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_long_min_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__unsigned_long_min_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_longlong_min_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__unsigned_longlong_min_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__unsigned_short_min_val(), theDatavaluePackage.getLiteralNumericValue(), null, "CREATE__TRG__unsigned_short_min_val", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitialModelCreation_ownedDataPkg__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, InitialModelCreation_ownedDataPkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(debugrule_create_oa_and_entitypkg__MarkerEClass, debugrule_create_oa_and_entitypkg__Marker.class, "debugrule_create_oa_and_entitypkg__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_entity_pkg(), theOaPackage.getEntityPkg(), null, "CREATE__SRC__src_entity_pkg", null, 1, 1, debugrule_create_oa_and_entitypkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdebugrule_create_oa_and_entitypkg__Marker_CREATE__SRC__src_oa_arch(), theOaPackage.getOperationalAnalysis(), null, "CREATE__SRC__src_oa_arch", null, 1, 1, debugrule_create_oa_and_entitypkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdebugrule_create_oa_and_entitypkg__Marker_CREATE__TRG__trg_ctx_arch(), theCtxPackage.getSystemAnalysis(), null, "CREATE__TRG__trg_ctx_arch", null, 1, 1, debugrule_create_oa_and_entitypkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdebugrule_create_oa_and_entitypkg__Marker_CREATE__CORR__oa2ctx(), this.getOperationalAnalysis2SystemAnalysis(), null, "CREATE__CORR__oa2ctx", null, 1, 1, debugrule_create_oa_and_entitypkg__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Oa2CtxPackageImpl
