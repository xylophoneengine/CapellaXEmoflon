/**
 */
package TransitionActors_Oa2Sa.impl;

import TransitionActors_Oa2Sa.Oa2Sa;
import TransitionActors_Oa2Sa.Oa2Sa_generation__Marker;
import TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa2 Sa generation Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_generation__MarkerImpl#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oa2Sa_generation__MarkerImpl extends TGGRuleApplicationImpl implements Oa2Sa_generation__Marker {
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
	 * The cached value of the '{@link #getCREATE__TRG__trg_sa_arch() <em>CREATE TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_sa_arch()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis creatE__TRG__trg_sa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__new_oa2sa() <em>CREATE CORR new oa2sa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__new_oa2sa()
	 * @generated
	 * @ordered
	 */
	protected Oa2Sa creatE__CORR__new_oa2sa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2Sa_generation__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransitionActors_Oa2SaPackage.Literals.OA2_SA_GENERATION_MARKER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getCREATE__TRG__trg_sa_arch() {
		if (creatE__TRG__trg_sa_arch != null && creatE__TRG__trg_sa_arch.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_sa_arch = (InternalEObject)creatE__TRG__trg_sa_arch;
			creatE__TRG__trg_sa_arch = (SystemAnalysis)eResolveProxy(oldCREATE__TRG__trg_sa_arch);
			if (creatE__TRG__trg_sa_arch != oldCREATE__TRG__trg_sa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH, oldCREATE__TRG__trg_sa_arch, creatE__TRG__trg_sa_arch));
			}
		}
		return creatE__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetCREATE__TRG__trg_sa_arch() {
		return creatE__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_sa_arch(SystemAnalysis newCREATE__TRG__trg_sa_arch) {
		SystemAnalysis oldCREATE__TRG__trg_sa_arch = creatE__TRG__trg_sa_arch;
		creatE__TRG__trg_sa_arch = newCREATE__TRG__trg_sa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH, oldCREATE__TRG__trg_sa_arch, creatE__TRG__trg_sa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa getCREATE__CORR__new_oa2sa() {
		if (creatE__CORR__new_oa2sa != null && creatE__CORR__new_oa2sa.eIsProxy()) {
			InternalEObject oldCREATE__CORR__new_oa2sa = (InternalEObject)creatE__CORR__new_oa2sa;
			creatE__CORR__new_oa2sa = (Oa2Sa)eResolveProxy(oldCREATE__CORR__new_oa2sa);
			if (creatE__CORR__new_oa2sa != oldCREATE__CORR__new_oa2sa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA, oldCREATE__CORR__new_oa2sa, creatE__CORR__new_oa2sa));
			}
		}
		return creatE__CORR__new_oa2sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oa2Sa basicGetCREATE__CORR__new_oa2sa() {
		return creatE__CORR__new_oa2sa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__new_oa2sa(Oa2Sa newCREATE__CORR__new_oa2sa) {
		Oa2Sa oldCREATE__CORR__new_oa2sa = creatE__CORR__new_oa2sa;
		creatE__CORR__new_oa2sa = newCREATE__CORR__new_oa2sa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA, oldCREATE__CORR__new_oa2sa, creatE__CORR__new_oa2sa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				if (resolve) return getCREATE__SRC__src_oa_arch();
				return basicGetCREATE__SRC__src_oa_arch();
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				if (resolve) return getCREATE__TRG__trg_sa_arch();
				return basicGetCREATE__TRG__trg_sa_arch();
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				if (resolve) return getCREATE__CORR__new_oa2sa();
				return basicGetCREATE__CORR__new_oa2sa();
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
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				setCREATE__TRG__trg_sa_arch((SystemAnalysis)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				setCREATE__CORR__new_oa2sa((Oa2Sa)newValue);
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
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				setCREATE__TRG__trg_sa_arch((SystemAnalysis)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				setCREATE__CORR__new_oa2sa((Oa2Sa)null);
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
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_SRC_SRC_OA_ARCH:
				return creatE__SRC__src_oa_arch != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_TRG_TRG_SA_ARCH:
				return creatE__TRG__trg_sa_arch != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_GENERATION_MARKER__CREATE_CORR_NEW_OA2SA:
				return creatE__CORR__new_oa2sa != null;
		}
		return super.eIsSet(featureID);
	}

} //Oa2Sa_generation__MarkerImpl
