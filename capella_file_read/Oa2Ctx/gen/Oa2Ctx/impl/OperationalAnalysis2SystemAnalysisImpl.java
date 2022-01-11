/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Analysis2 System Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysisImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysisImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalAnalysis2SystemAnalysisImpl extends MinimalEObjectImpl.Container implements OperationalAnalysis2SystemAnalysis {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalAnalysis2SystemAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2CtxPackage.Literals.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OperationalAnalysis)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OperationalAnalysis newSource) {
		OperationalAnalysis oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SystemAnalysis)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SystemAnalysis newTarget) {
		SystemAnalysis oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET:
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
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE:
				setSource((OperationalAnalysis)newValue);
				return;
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET:
				setTarget((SystemAnalysis)newValue);
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
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE:
				setSource((OperationalAnalysis)null);
				return;
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET:
				setTarget((SystemAnalysis)null);
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
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__SOURCE:
				return source != null;
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalAnalysis2SystemAnalysisImpl
