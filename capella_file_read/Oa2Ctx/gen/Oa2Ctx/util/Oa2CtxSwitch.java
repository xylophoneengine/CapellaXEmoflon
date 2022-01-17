/**
 */
package Oa2Ctx.util;

import Oa2Ctx.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Oa2Ctx.Oa2CtxPackage
 * @generated
 */
public class Oa2CtxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Oa2CtxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2CtxSwitch() {
		if (modelPackage == null) {
			modelPackage = Oa2CtxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS: {
				OperationalAnalysis2SystemAnalysis operationalAnalysis2SystemAnalysis = (OperationalAnalysis2SystemAnalysis)theEObject;
				T result = caseOperationalAnalysis2SystemAnalysis(operationalAnalysis2SystemAnalysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_MARKER: {
				InitialModelCreation__Marker initialModelCreation__Marker = (InitialModelCreation__Marker)theEObject;
				T result = caseInitialModelCreation__Marker(initialModelCreation__Marker);
				if (result == null) result = caseTGGRuleApplication(initialModelCreation__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2CtxPackage.OA2_SA_CREATE_NODES_AND_TRY_TO_SET_REFERENCE_MARKER: {
				Oa2Sa_create_nodes_and_try_to_set_reference__Marker oa2Sa_create_nodes_and_try_to_set_reference__Marker = (Oa2Sa_create_nodes_and_try_to_set_reference__Marker)theEObject;
				T result = caseOa2Sa_create_nodes_and_try_to_set_reference__Marker(oa2Sa_create_nodes_and_try_to_set_reference__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_create_nodes_and_try_to_set_reference__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2CtxPackage.OA2_SA_CREATE_NODES_ONLY_MARKER: {
				Oa2Sa_create_nodes_only__Marker oa2Sa_create_nodes_only__Marker = (Oa2Sa_create_nodes_only__Marker)theEObject;
				T result = caseOa2Sa_create_nodes_only__Marker(oa2Sa_create_nodes_only__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_create_nodes_only__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_NAME_MARKER: {
				Oa2Sa_nodes_and_set_name__Marker oa2Sa_nodes_and_set_name__Marker = (Oa2Sa_nodes_and_set_name__Marker)theEObject;
				T result = caseOa2Sa_nodes_and_set_name__Marker(oa2Sa_nodes_and_set_name__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_nodes_and_set_name__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER: {
				Oa2Sa_nodes_and_set_specific_name__Marker oa2Sa_nodes_and_set_specific_name__Marker = (Oa2Sa_nodes_and_set_specific_name__Marker)theEObject;
				T result = caseOa2Sa_nodes_and_set_specific_name__Marker(oa2Sa_nodes_and_set_specific_name__Marker);
				if (result == null) result = caseTGGRuleApplication(oa2Sa_nodes_and_set_specific_name__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER: {
				OperationalAnalysis2SystemAnalysis__Marker operationalAnalysis2SystemAnalysis__Marker = (OperationalAnalysis2SystemAnalysis__Marker)theEObject;
				T result = caseOperationalAnalysis2SystemAnalysis__Marker(operationalAnalysis2SystemAnalysis__Marker);
				if (result == null) result = caseTGGRuleApplication(operationalAnalysis2SystemAnalysis__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Analysis2 System Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Analysis2 System Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAnalysis2SystemAnalysis(OperationalAnalysis2SystemAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Model Creation Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Model Creation Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialModelCreation__Marker(InitialModelCreation__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa create nodes and try to set reference Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa create nodes and try to set reference Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_create_nodes_and_try_to_set_reference__Marker(Oa2Sa_create_nodes_and_try_to_set_reference__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa create nodes only Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa create nodes only Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_create_nodes_only__Marker(Oa2Sa_create_nodes_only__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa nodes and set name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa nodes and set name Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_nodes_and_set_name__Marker(Oa2Sa_nodes_and_set_name__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oa2 Sa nodes and set specific name Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oa2 Sa nodes and set specific name Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOa2Sa_nodes_and_set_specific_name__Marker(Oa2Sa_nodes_and_set_specific_name__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Analysis2 System Analysis Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Analysis2 System Analysis Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAnalysis2SystemAnalysis__Marker(OperationalAnalysis2SystemAnalysis__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGRuleApplication(TGGRuleApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Oa2CtxSwitch
