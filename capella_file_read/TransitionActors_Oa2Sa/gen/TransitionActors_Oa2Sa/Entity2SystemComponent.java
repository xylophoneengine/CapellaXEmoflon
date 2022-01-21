/**
 */
package TransitionActors_Oa2Sa;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity2 System Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TransitionActors_Oa2Sa.Entity2SystemComponent#getSource <em>Source</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.Entity2SystemComponent#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getEntity2SystemComponent()
 * @model
 * @generated
 */
public interface Entity2SystemComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getEntity2SystemComponent_Source()
	 * @model
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link TransitionActors_Oa2Sa.Entity2SystemComponent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SystemComponent)
	 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getEntity2SystemComponent_Target()
	 * @model
	 * @generated
	 */
	SystemComponent getTarget();

	/**
	 * Sets the value of the '{@link TransitionActors_Oa2Sa.Entity2SystemComponent#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SystemComponent value);

} // Entity2SystemComponent
