/**
 */
package TransitionActors_Oa2Sa.util;

import TransitionActors_Oa2Sa.*;

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
 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage
 * @generated
 */
public class TransitionActors_Oa2SaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransitionActors_Oa2SaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionActors_Oa2SaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TransitionActors_Oa2SaPackage.eINSTANCE;
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
	protected TransitionActors_Oa2SaSwitch<Adapter> modelSwitch =
		new TransitionActors_Oa2SaSwitch<Adapter>() {
			@Override
			public Adapter caseOa2Sa(Oa2Sa object) {
				return createOa2SaAdapter();
			}
			@Override
			public Adapter caseEntity2SystemComponent(Entity2SystemComponent object) {
				return createEntity2SystemComponentAdapter();
			}
			@Override
			public Adapter caseOa2Sa_generation__Marker(Oa2Sa_generation__Marker object) {
				return createOa2Sa_generation__MarkerAdapter();
			}
			@Override
			public Adapter caseOa2Sa_transition_actors__Marker(Oa2Sa_transition_actors__Marker object) {
				return createOa2Sa_transition_actors__MarkerAdapter();
			}
			@Override
			public Adapter caseOa2Sa_transition_actors_recursively__Marker(Oa2Sa_transition_actors_recursively__Marker object) {
				return createOa2Sa_transition_actors_recursively__MarkerAdapter();
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
	 * Creates a new adapter for an object of class '{@link TransitionActors_Oa2Sa.Oa2Sa <em>Oa2 Sa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TransitionActors_Oa2Sa.Oa2Sa
	 * @generated
	 */
	public Adapter createOa2SaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TransitionActors_Oa2Sa.Entity2SystemComponent <em>Entity2 System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TransitionActors_Oa2Sa.Entity2SystemComponent
	 * @generated
	 */
	public Adapter createEntity2SystemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker <em>Oa2 Sa generation Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_generation__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_generation__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TransitionActors_Oa2Sa.Oa2Sa_transition_actors__Marker <em>Oa2 Sa transition actors Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_transition_actors__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_transition_actors__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TransitionActors_Oa2Sa.Oa2Sa_transition_actors_recursively__Marker <em>Oa2 Sa transition actors recursively Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TransitionActors_Oa2Sa.Oa2Sa_transition_actors_recursively__Marker
	 * @generated
	 */
	public Adapter createOa2Sa_transition_actors_recursively__MarkerAdapter() {
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

} //TransitionActors_Oa2SaAdapterFactory
