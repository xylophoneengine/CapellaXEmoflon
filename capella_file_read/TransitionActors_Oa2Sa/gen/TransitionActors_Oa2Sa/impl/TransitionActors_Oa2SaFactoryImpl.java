/**
 */
package TransitionActors_Oa2Sa.impl;

import TransitionActors_Oa2Sa.*;

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
public class TransitionActors_Oa2SaFactoryImpl extends EFactoryImpl implements TransitionActors_Oa2SaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionActors_Oa2SaFactory init() {
		try {
			TransitionActors_Oa2SaFactory theTransitionActors_Oa2SaFactory = (TransitionActors_Oa2SaFactory)EPackage.Registry.INSTANCE.getEFactory(TransitionActors_Oa2SaPackage.eNS_URI);
			if (theTransitionActors_Oa2SaFactory != null) {
				return theTransitionActors_Oa2SaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransitionActors_Oa2SaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionActors_Oa2SaFactoryImpl() {
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
			case TransitionActors_Oa2SaPackage.OA2_SA: return createOa2Sa();
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER: return createOa2Sa_generation__Marker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa createOa2Sa() {
		Oa2SaImpl oa2Sa = new Oa2SaImpl();
		return oa2Sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa_generation__Marker createOa2Sa_generation__Marker() {
		Oa2Sa_generation__MarkerImpl oa2Sa_generation__Marker = new Oa2Sa_generation__MarkerImpl();
		return oa2Sa_generation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionActors_Oa2SaPackage getTransitionActors_Oa2SaPackage() {
		return (TransitionActors_Oa2SaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransitionActors_Oa2SaPackage getPackage() {
		return TransitionActors_Oa2SaPackage.eINSTANCE;
	}

} //TransitionActors_Oa2SaFactoryImpl
