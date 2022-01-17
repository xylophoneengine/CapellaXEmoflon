/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa2 Sa nodes and set specific name Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}</li>
 *   <li>{@link Oa2Ctx.impl.Oa2Sa_nodes_and_set_specific_name__MarkerImpl#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oa2Sa_nodes_and_set_specific_name__MarkerImpl extends TGGRuleApplicationImpl implements Oa2Sa_nodes_and_set_specific_name__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_abstract_capability_pkg() <em>CREATE SRC src abstract capability pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_abstract_capability_pkg()
	 * @generated
	 * @ordered
	 */
	protected OperationalCapabilityPkg creatE__SRC__src_abstract_capability_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_oa_arch() <em>CREATE SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_oa_arch()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis creatE__SRC__src_oa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_ctx_arch() <em>CREATE TRG trg ctx arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_ctx_arch()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis creatE__TRG__trg_ctx_arch;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__oa2ctx() <em>CREATE CORR oa2ctx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__oa2ctx()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysis2SystemAnalysis creatE__CORR__oa2ctx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2Sa_nodes_and_set_specific_name__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2CtxPackage.Literals.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg getCREATE__SRC__src_abstract_capability_pkg() {
		if (creatE__SRC__src_abstract_capability_pkg != null && creatE__SRC__src_abstract_capability_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_abstract_capability_pkg = (InternalEObject)creatE__SRC__src_abstract_capability_pkg;
			creatE__SRC__src_abstract_capability_pkg = (OperationalCapabilityPkg)eResolveProxy(oldCREATE__SRC__src_abstract_capability_pkg);
			if (creatE__SRC__src_abstract_capability_pkg != oldCREATE__SRC__src_abstract_capability_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG, oldCREATE__SRC__src_abstract_capability_pkg, creatE__SRC__src_abstract_capability_pkg));
			}
		}
		return creatE__SRC__src_abstract_capability_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg basicGetCREATE__SRC__src_abstract_capability_pkg() {
		return creatE__SRC__src_abstract_capability_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_abstract_capability_pkg(OperationalCapabilityPkg newCREATE__SRC__src_abstract_capability_pkg) {
		OperationalCapabilityPkg oldCREATE__SRC__src_abstract_capability_pkg = creatE__SRC__src_abstract_capability_pkg;
		creatE__SRC__src_abstract_capability_pkg = newCREATE__SRC__src_abstract_capability_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG, oldCREATE__SRC__src_abstract_capability_pkg, creatE__SRC__src_abstract_capability_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis getCREATE__SRC__src_oa_arch() {
		if (creatE__SRC__src_oa_arch != null && creatE__SRC__src_oa_arch.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_oa_arch = (InternalEObject)creatE__SRC__src_oa_arch;
			creatE__SRC__src_oa_arch = (OperationalAnalysis)eResolveProxy(oldCREATE__SRC__src_oa_arch);
			if (creatE__SRC__src_oa_arch != oldCREATE__SRC__src_oa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
			}
		}
		return creatE__SRC__src_oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis basicGetCREATE__SRC__src_oa_arch() {
		return creatE__SRC__src_oa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_oa_arch(OperationalAnalysis newCREATE__SRC__src_oa_arch) {
		OperationalAnalysis oldCREATE__SRC__src_oa_arch = creatE__SRC__src_oa_arch;
		creatE__SRC__src_oa_arch = newCREATE__SRC__src_oa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getCREATE__TRG__trg_ctx_arch() {
		if (creatE__TRG__trg_ctx_arch != null && creatE__TRG__trg_ctx_arch.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_ctx_arch = (InternalEObject)creatE__TRG__trg_ctx_arch;
			creatE__TRG__trg_ctx_arch = (SystemAnalysis)eResolveProxy(oldCREATE__TRG__trg_ctx_arch);
			if (creatE__TRG__trg_ctx_arch != oldCREATE__TRG__trg_ctx_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH, oldCREATE__TRG__trg_ctx_arch, creatE__TRG__trg_ctx_arch));
			}
		}
		return creatE__TRG__trg_ctx_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetCREATE__TRG__trg_ctx_arch() {
		return creatE__TRG__trg_ctx_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_ctx_arch(SystemAnalysis newCREATE__TRG__trg_ctx_arch) {
		SystemAnalysis oldCREATE__TRG__trg_ctx_arch = creatE__TRG__trg_ctx_arch;
		creatE__TRG__trg_ctx_arch = newCREATE__TRG__trg_ctx_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH, oldCREATE__TRG__trg_ctx_arch, creatE__TRG__trg_ctx_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis2SystemAnalysis getCREATE__CORR__oa2ctx() {
		if (creatE__CORR__oa2ctx != null && creatE__CORR__oa2ctx.eIsProxy()) {
			InternalEObject oldCREATE__CORR__oa2ctx = (InternalEObject)creatE__CORR__oa2ctx;
			creatE__CORR__oa2ctx = (OperationalAnalysis2SystemAnalysis)eResolveProxy(oldCREATE__CORR__oa2ctx);
			if (creatE__CORR__oa2ctx != oldCREATE__CORR__oa2ctx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX, oldCREATE__CORR__oa2ctx, creatE__CORR__oa2ctx));
			}
		}
		return creatE__CORR__oa2ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis2SystemAnalysis basicGetCREATE__CORR__oa2ctx() {
		return creatE__CORR__oa2ctx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__oa2ctx(OperationalAnalysis2SystemAnalysis newCREATE__CORR__oa2ctx) {
		OperationalAnalysis2SystemAnalysis oldCREATE__CORR__oa2ctx = creatE__CORR__oa2ctx;
		creatE__CORR__oa2ctx = newCREATE__CORR__oa2ctx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX, oldCREATE__CORR__oa2ctx, creatE__CORR__oa2ctx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				if (resolve) return getCREATE__SRC__src_abstract_capability_pkg();
				return basicGetCREATE__SRC__src_abstract_capability_pkg();
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH:
				if (resolve) return getCREATE__SRC__src_oa_arch();
				return basicGetCREATE__SRC__src_oa_arch();
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				if (resolve) return getCREATE__TRG__trg_ctx_arch();
				return basicGetCREATE__TRG__trg_ctx_arch();
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX:
				if (resolve) return getCREATE__CORR__oa2ctx();
				return basicGetCREATE__CORR__oa2ctx();
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
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				setCREATE__SRC__src_abstract_capability_pkg((OperationalCapabilityPkg)newValue);
				return;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)newValue);
				return;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				setCREATE__TRG__trg_ctx_arch((SystemAnalysis)newValue);
				return;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX:
				setCREATE__CORR__oa2ctx((OperationalAnalysis2SystemAnalysis)newValue);
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
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				setCREATE__SRC__src_abstract_capability_pkg((OperationalCapabilityPkg)null);
				return;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)null);
				return;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				setCREATE__TRG__trg_ctx_arch((SystemAnalysis)null);
				return;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX:
				setCREATE__CORR__oa2ctx((OperationalAnalysis2SystemAnalysis)null);
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
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				return creatE__SRC__src_abstract_capability_pkg != null;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_SRC_SRC_OA_ARCH:
				return creatE__SRC__src_oa_arch != null;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				return creatE__TRG__trg_ctx_arch != null;
			case Oa2CtxPackage.OA2_SA_NODES_AND_SET_SPECIFIC_NAME_MARKER__CREATE_CORR_OA2CTX:
				return creatE__CORR__oa2ctx != null;
		}
		return super.eIsSet(featureID);
	}

} //Oa2Sa_nodes_and_set_specific_name__MarkerImpl
