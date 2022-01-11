/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Analysis2 System Analysis Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl#getCREATE__SRC__oa_arch <em>CREATE SRC oa arch</em>}</li>
 *   <li>{@link Oa2Ctx.impl.OperationalAnalysis2SystemAnalysis__MarkerImpl#getCREATE__TRG__ctx_arch <em>CREATE TRG ctx arch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalAnalysis2SystemAnalysis__MarkerImpl extends TGGRuleApplicationImpl implements OperationalAnalysis2SystemAnalysis__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__oa_arch() <em>CREATE SRC oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__oa_arch()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis creatE__SRC__oa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__ctx_arch() <em>CREATE TRG ctx arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__ctx_arch()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis creatE__TRG__ctx_arch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalAnalysis2SystemAnalysis__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2CtxPackage.Literals.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis getCREATE__SRC__oa_arch() {
		if (creatE__SRC__oa_arch != null && creatE__SRC__oa_arch.eIsProxy()) {
			InternalEObject oldCREATE__SRC__oa_arch = (InternalEObject)creatE__SRC__oa_arch;
			creatE__SRC__oa_arch = (OperationalAnalysis)eResolveProxy(oldCREATE__SRC__oa_arch);
			if (creatE__SRC__oa_arch != oldCREATE__SRC__oa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH, oldCREATE__SRC__oa_arch, creatE__SRC__oa_arch));
			}
		}
		return creatE__SRC__oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis basicGetCREATE__SRC__oa_arch() {
		return creatE__SRC__oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__oa_arch(OperationalAnalysis newCREATE__SRC__oa_arch) {
		OperationalAnalysis oldCREATE__SRC__oa_arch = creatE__SRC__oa_arch;
		creatE__SRC__oa_arch = newCREATE__SRC__oa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH, oldCREATE__SRC__oa_arch, creatE__SRC__oa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getCREATE__TRG__ctx_arch() {
		if (creatE__TRG__ctx_arch != null && creatE__TRG__ctx_arch.eIsProxy()) {
			InternalEObject oldCREATE__TRG__ctx_arch = (InternalEObject)creatE__TRG__ctx_arch;
			creatE__TRG__ctx_arch = (SystemAnalysis)eResolveProxy(oldCREATE__TRG__ctx_arch);
			if (creatE__TRG__ctx_arch != oldCREATE__TRG__ctx_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH, oldCREATE__TRG__ctx_arch, creatE__TRG__ctx_arch));
			}
		}
		return creatE__TRG__ctx_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetCREATE__TRG__ctx_arch() {
		return creatE__TRG__ctx_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__ctx_arch(SystemAnalysis newCREATE__TRG__ctx_arch) {
		SystemAnalysis oldCREATE__TRG__ctx_arch = creatE__TRG__ctx_arch;
		creatE__TRG__ctx_arch = newCREATE__TRG__ctx_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH, oldCREATE__TRG__ctx_arch, creatE__TRG__ctx_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH:
				if (resolve) return getCREATE__SRC__oa_arch();
				return basicGetCREATE__SRC__oa_arch();
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH:
				if (resolve) return getCREATE__TRG__ctx_arch();
				return basicGetCREATE__TRG__ctx_arch();
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
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH:
				setCREATE__SRC__oa_arch((OperationalAnalysis)newValue);
				return;
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH:
				setCREATE__TRG__ctx_arch((SystemAnalysis)newValue);
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
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH:
				setCREATE__SRC__oa_arch((OperationalAnalysis)null);
				return;
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH:
				setCREATE__TRG__ctx_arch((SystemAnalysis)null);
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
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_SRC_OA_ARCH:
				return creatE__SRC__oa_arch != null;
			case Oa2CtxPackage.OPERATIONAL_ANALYSIS2_SYSTEM_ANALYSIS_MARKER__CREATE_TRG_CTX_ARCH:
				return creatE__TRG__ctx_arch != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationalAnalysis2SystemAnalysis__MarkerImpl
