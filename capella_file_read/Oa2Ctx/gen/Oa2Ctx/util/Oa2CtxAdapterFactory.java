/**
 */
package Oa2Ctx.util;

import Oa2Ctx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Oa2Ctx.Oa2CtxPackage
 * @generated
 */
public class Oa2CtxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Oa2CtxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2CtxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Oa2CtxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2CtxSwitch<Adapter> modelSwitch =
		new Oa2CtxSwitch<Adapter>() {
			@Override
			public Adapter caseOperationalAnalysis2SystemAnalysis(OperationalAnalysis2SystemAnalysis object) {
				return createOperationalAnalysis2SystemAnalysisAdapter();
			}
			@Override
			public Adapter caseInitialModelCreation__Marker(InitialModelCreation__Marker object) {
				return createInitialModelCreation__MarkerAdapter();
			}
			@Override
			public Adapter caseOa2Sa_create_nodes_and_try_to_set_reference__Marker(Oa2Sa_create_nodes_and_try_to_set_reference__Marker object) {
				return createOa2Sa_create_nodes_and_try_to_set_reference__MarkerAdapter();
			}
			@Override
			public Adapter caseOa2Sa_create_nodes_only__Marker(Oa2Sa_create_nodes_only__Marker object) {
				return createOa2Sa_create_nodes_only__MarkerAdapter();
			}
			@Override
			public Adapter caseOa2Sa_nodes_and_set_name__Marker(Oa2Sa_nodes_and_set_name__Marker object) {
				return createOa2Sa_nodes_and_set_name__MarkerAdapter();
			}
			@Override
			public Adapter caseOa2Sa_nodes_and_set_specific_name__Marker(Oa2Sa_nodes_and_set_specific_name__Marker object) {
				return createOa2Sa_nodes_and_set_specific_name__MarkerAdapter();
			}
			@Override
			public Adapter caseOperationalAnalysis2SystemAnalysis__Marker(OperationalAnalysis2SystemAnalysis__Marker object) {
				return createOperationalAnalysis2SystemAnalysis__MarkerAdapter();
			}
			@Override
			public Adapter caseTGGRuleApplication(TGGRuleApplication object) {
				return createTGGRuleApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis <em>Operational Analysis2 System Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis
	 * @generated
	 */
	public Adapter createOperationalAnalysis2SystemAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.InitialModelCreation__Marker <em>Initial Model Creation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.InitialModelCreation__Marker
	 * @generated
	 */
	public Adapter createInitialModelCreation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker <em>Oa2 Sa create nodes and try to set reference Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_and_try_to_set_reference__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_create_nodes_and_try_to_set_reference__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.Oa2Sa_create_nodes_only__Marker <em>Oa2 Sa create nodes only Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.Oa2Sa_create_nodes_only__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_create_nodes_only__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker <em>Oa2 Sa nodes and set name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_name__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_nodes_and_set_name__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker <em>Oa2 Sa nodes and set specific name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_nodes_and_set_specific_name__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker <em>Operational Analysis2 System Analysis Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker
	 * @generated
	 */
	public Adapter createOperationalAnalysis2SystemAnalysis__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link runtime.TGGRuleApplication <em>TGG Rule Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see runtime.TGGRuleApplication
	 * @generated
	 */
	public Adapter createTGGRuleApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Oa2CtxAdapterFactory
