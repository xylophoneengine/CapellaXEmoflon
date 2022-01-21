/**
 */
package TransitionActors_Oa2Sa.impl;

import TransitionActors_Oa2Sa.Entity2SystemComponent;
import TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.capella.core.data.ctx.SystemComponent;

import org.polarsys.capella.core.data.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity2 System Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Entity2SystemComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Entity2SystemComponentImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Entity2SystemComponentImpl extends MinimalEObjectImpl.Container implements Entity2SystemComponent {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Entity source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SystemComponent target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Entity2SystemComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransitionActors_Oa2SaPackage.Literals.ENTITY2_SYSTEM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Entity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Entity newSource) {
		Entity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SystemComponent)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SystemComponent newTarget) {
		SystemComponent oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__SOURCE:
				setSource((Entity)newValue);
				return;
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__TARGET:
				setTarget((SystemComponent)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__SOURCE:
				setSource((Entity)null);
				return;
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__TARGET:
				setTarget((SystemComponent)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__SOURCE:
				return source != null;
			case TransitionActors_Oa2SaPackage.ENTITY2_SYSTEM_COMPONENT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //Entity2SystemComponentImpl
