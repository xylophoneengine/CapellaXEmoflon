/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Oa2CtxFactoryImpl extends EFactoryImpl implements Oa2CtxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Oa2CtxFactory init() {
		try {
			Oa2CtxFactory theOa2CtxFactory = (Oa2CtxFactory)EPackage.Registry.INSTANCE.getEFactory(Oa2CtxPackage.eNS_URI);
			if (theOa2CtxFactory != null) {
				return theOa2CtxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Oa2CtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2CtxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS: return createOperationalAnalysis2SystemAnalysis();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_MARKER: return createInitialModelCreation__Marker();
			case Oa2CtxPackage.OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER: return createOa2Sa_create_nodes_and_try_to_set_reference__Marker();
			case Oa2CtxPackage.OA2_SA_CREATE_NODES_ONLY_MARKER: return createOa2Sa_create_nodes_only__Marker();
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_NAME_MARKER: return createOa2Sa_nodes_and_set_name__Marker();
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER: return createOa2Sa_nodes_and_set_specific_name__Marker();
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER: return createOperationalAnalysis2SystemAnalysis__Marker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis2SystemAnalysis createOperationalAnalysis2SystemAnalysis() {
		OperationalAnalysis2SystemAnalysisImpl operationalAnalysis2SystemAnalysis = new OperationalAnalysis2SystemAnalysisImpl();
		return operationalAnalysis2SystemAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialModelCreation__Marker createInitialModelCreation__Marker() {
		InitialModelCreation__MarkerImpl initialModelCreation__Marker = new InitialModelCreation__MarkerImpl();
		return initialModelCreation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_create_nodes_and_try_to_set_reference__Marker createOa2Sa_create_nodes_and_try_to_set_reference__Marker() {
		Oa2Sa_create_nodes_and_try_to_set_reference__MarkerImpl oa2Sa_create_nodes_and_try_to_set_reference__Marker = new Oa2Sa_create_nodes_and_try_to_set_reference__MarkerImpl();
		return oa2Sa_create_nodes_and_try_to_set_reference__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_create_nodes_only__Marker createOa2Sa_create_nodes_only__Marker() {
		Oa2Sa_create_nodes_only__MarkerImpl oa2Sa_create_nodes_only__Marker = new Oa2Sa_create_nodes_only__MarkerImpl();
		return oa2Sa_create_nodes_only__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_nodes_and_set_name__Marker createOa2Sa_nodes_and_set_name__Marker() {
		Oa2Sa_nodes_and_set_name__MarkerImpl oa2Sa_nodes_and_set_name__Marker = new Oa2Sa_nodes_and_set_name__MarkerImpl();
		return oa2Sa_nodes_and_set_name__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_nodes_and_set_specific_name__Marker createOa2Sa_nodes_and_set_specific_name__Marker() {
		Oa2Sa_nodes_and_set_specific_name__MarkerImpl oa2Sa_nodes_and_set_specific_name__Marker = new Oa2Sa_nodes_and_set_specific_name__MarkerImpl();
		return oa2Sa_nodes_and_set_specific_name__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis2SystemAnalysis__Marker createOperationalAnalysis2SystemAnalysis__Marker() {
		OperationalAnalysis2SystemAnalysis__MarkerImpl operationalAnalysis2SystemAnalysis__Marker = new OperationalAnalysis2SystemAnalysis__MarkerImpl();
		return operationalAnalysis2SystemAnalysis__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2CtxPackage getOa2CtxPackage() {
		return (Oa2CtxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Oa2CtxPackage getPackage() {
		return Oa2CtxPackage.eINSTANCE;
	}

} //Oa2CtxFactoryImpl
