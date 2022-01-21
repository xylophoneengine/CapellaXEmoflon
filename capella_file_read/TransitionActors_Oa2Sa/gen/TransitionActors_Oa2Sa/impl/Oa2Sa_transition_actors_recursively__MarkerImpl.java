/**
 */
package TransitionActors_Oa2Sa.impl;

import TransitionActors_Oa2Sa.Entity2SystemComponent;
import TransitionActors_Oa2Sa.Oa2Sa_transition_actors_recursively__Marker;
import TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.Entity;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oa2 Sa transition actors recursively Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCREATE__SRC__src_operational_entity <em>CREATE SRC src operational entity</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCREATE__SRC__src_operational_part <em>CREATE SRC src operational part</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCONTEXT__SRC__src_top_level_entity <em>CONTEXT SRC src top level entity</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCONTEXT__TRG__trg_sa_arch <em>CONTEXT TRG trg sa arch</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCREATE__TRG__trg_system_component <em>CREATE TRG trg system component</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCONTEXT__TRG__trg_system_component_pkg <em>CONTEXT TRG trg system component pkg</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCREATE__TRG__trg_system_part <em>CREATE TRG trg system part</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.impl.Oa2Sa_transition_actors_recursively__MarkerImpl#getCREATE__CORR__OaEntity2SaSysComponent <em>CREATE CORR Oa Entity2 Sa Sys Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Oa2Sa_transition_actors_recursively__MarkerImpl extends TGGRuleApplicationImpl implements Oa2Sa_transition_actors_recursively__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_operational_entity() <em>CREATE SRC src operational entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_operational_entity()
	 * @generated
	 * @ordered
	 */
	protected Entity creatE__SRC__src_operational_entity;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_operational_part() <em>CREATE SRC src operational part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_operational_part()
	 * @generated
	 * @ordered
	 */
	protected Part creatE__SRC__src_operational_part;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__src_top_level_entity() <em>CONTEXT SRC src top level entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__src_top_level_entity()
	 * @generated
	 * @ordered
	 */
	protected Entity contexT__SRC__src_top_level_entity;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trg_sa_arch() <em>CONTEXT TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trg_sa_arch()
	 * @generated
	 * @ordered
	 */
	protected SystemAnalysis contexT__TRG__trg_sa_arch;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_system_component() <em>CREATE TRG trg system component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_system_component()
	 * @generated
	 * @ordered
	 */
	protected SystemComponent creatE__TRG__trg_system_component;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trg_system_component_pkg() <em>CONTEXT TRG trg system component pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trg_system_component_pkg()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentPkg contexT__TRG__trg_system_component_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_system_part() <em>CREATE TRG trg system part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_system_part()
	 * @generated
	 * @ordered
	 */
	protected Part creatE__TRG__trg_system_part;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__OaEntity2SaSysComponent() <em>CREATE CORR Oa Entity2 Sa Sys Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__OaEntity2SaSysComponent()
	 * @generated
	 * @ordered
	 */
	protected Entity2SystemComponent creatE__CORR__OaEntity2SaSysComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Oa2Sa_transition_actors_recursively__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransitionActors_Oa2SaPackage.Literals.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCREATE__SRC__src_operational_entity() {
		if (creatE__SRC__src_operational_entity != null && creatE__SRC__src_operational_entity.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_operational_entity = (InternalEObject)creatE__SRC__src_operational_entity;
			creatE__SRC__src_operational_entity = (Entity)eResolveProxy(oldCREATE__SRC__src_operational_entity);
			if (creatE__SRC__src_operational_entity != oldCREATE__SRC__src_operational_entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY, oldCREATE__SRC__src_operational_entity, creatE__SRC__src_operational_entity));
			}
		}
		return creatE__SRC__src_operational_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetCREATE__SRC__src_operational_entity() {
		return creatE__SRC__src_operational_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_operational_entity(Entity newCREATE__SRC__src_operational_entity) {
		Entity oldCREATE__SRC__src_operational_entity = creatE__SRC__src_operational_entity;
		creatE__SRC__src_operational_entity = newCREATE__SRC__src_operational_entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY, oldCREATE__SRC__src_operational_entity, creatE__SRC__src_operational_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getCREATE__SRC__src_operational_part() {
		if (creatE__SRC__src_operational_part != null && creatE__SRC__src_operational_part.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_operational_part = (InternalEObject)creatE__SRC__src_operational_part;
			creatE__SRC__src_operational_part = (Part)eResolveProxy(oldCREATE__SRC__src_operational_part);
			if (creatE__SRC__src_operational_part != oldCREATE__SRC__src_operational_part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART, oldCREATE__SRC__src_operational_part, creatE__SRC__src_operational_part));
			}
		}
		return creatE__SRC__src_operational_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetCREATE__SRC__src_operational_part() {
		return creatE__SRC__src_operational_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_operational_part(Part newCREATE__SRC__src_operational_part) {
		Part oldCREATE__SRC__src_operational_part = creatE__SRC__src_operational_part;
		creatE__SRC__src_operational_part = newCREATE__SRC__src_operational_part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART, oldCREATE__SRC__src_operational_part, creatE__SRC__src_operational_part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getCONTEXT__SRC__src_top_level_entity() {
		if (contexT__SRC__src_top_level_entity != null && contexT__SRC__src_top_level_entity.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__src_top_level_entity = (InternalEObject)contexT__SRC__src_top_level_entity;
			contexT__SRC__src_top_level_entity = (Entity)eResolveProxy(oldCONTEXT__SRC__src_top_level_entity);
			if (contexT__SRC__src_top_level_entity != oldCONTEXT__SRC__src_top_level_entity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY, oldCONTEXT__SRC__src_top_level_entity, contexT__SRC__src_top_level_entity));
			}
		}
		return contexT__SRC__src_top_level_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetCONTEXT__SRC__src_top_level_entity() {
		return contexT__SRC__src_top_level_entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__src_top_level_entity(Entity newCONTEXT__SRC__src_top_level_entity) {
		Entity oldCONTEXT__SRC__src_top_level_entity = contexT__SRC__src_top_level_entity;
		contexT__SRC__src_top_level_entity = newCONTEXT__SRC__src_top_level_entity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY, oldCONTEXT__SRC__src_top_level_entity, contexT__SRC__src_top_level_entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis getCONTEXT__TRG__trg_sa_arch() {
		if (contexT__TRG__trg_sa_arch != null && contexT__TRG__trg_sa_arch.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trg_sa_arch = (InternalEObject)contexT__TRG__trg_sa_arch;
			contexT__TRG__trg_sa_arch = (SystemAnalysis)eResolveProxy(oldCONTEXT__TRG__trg_sa_arch);
			if (contexT__TRG__trg_sa_arch != oldCONTEXT__TRG__trg_sa_arch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH, oldCONTEXT__TRG__trg_sa_arch, contexT__TRG__trg_sa_arch));
			}
		}
		return contexT__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis basicGetCONTEXT__TRG__trg_sa_arch() {
		return contexT__TRG__trg_sa_arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trg_sa_arch(SystemAnalysis newCONTEXT__TRG__trg_sa_arch) {
		SystemAnalysis oldCONTEXT__TRG__trg_sa_arch = contexT__TRG__trg_sa_arch;
		contexT__TRG__trg_sa_arch = newCONTEXT__TRG__trg_sa_arch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH, oldCONTEXT__TRG__trg_sa_arch, contexT__TRG__trg_sa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent getCREATE__TRG__trg_system_component() {
		if (creatE__TRG__trg_system_component != null && creatE__TRG__trg_system_component.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_system_component = (InternalEObject)creatE__TRG__trg_system_component;
			creatE__TRG__trg_system_component = (SystemComponent)eResolveProxy(oldCREATE__TRG__trg_system_component);
			if (creatE__TRG__trg_system_component != oldCREATE__TRG__trg_system_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT, oldCREATE__TRG__trg_system_component, creatE__TRG__trg_system_component));
			}
		}
		return creatE__TRG__trg_system_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent basicGetCREATE__TRG__trg_system_component() {
		return creatE__TRG__trg_system_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_system_component(SystemComponent newCREATE__TRG__trg_system_component) {
		SystemComponent oldCREATE__TRG__trg_system_component = creatE__TRG__trg_system_component;
		creatE__TRG__trg_system_component = newCREATE__TRG__trg_system_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT, oldCREATE__TRG__trg_system_component, creatE__TRG__trg_system_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg getCONTEXT__TRG__trg_system_component_pkg() {
		if (contexT__TRG__trg_system_component_pkg != null && contexT__TRG__trg_system_component_pkg.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trg_system_component_pkg = (InternalEObject)contexT__TRG__trg_system_component_pkg;
			contexT__TRG__trg_system_component_pkg = (SystemComponentPkg)eResolveProxy(oldCONTEXT__TRG__trg_system_component_pkg);
			if (contexT__TRG__trg_system_component_pkg != oldCONTEXT__TRG__trg_system_component_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG, oldCONTEXT__TRG__trg_system_component_pkg, contexT__TRG__trg_system_component_pkg));
			}
		}
		return contexT__TRG__trg_system_component_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg basicGetCONTEXT__TRG__trg_system_component_pkg() {
		return contexT__TRG__trg_system_component_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trg_system_component_pkg(SystemComponentPkg newCONTEXT__TRG__trg_system_component_pkg) {
		SystemComponentPkg oldCONTEXT__TRG__trg_system_component_pkg = contexT__TRG__trg_system_component_pkg;
		contexT__TRG__trg_system_component_pkg = newCONTEXT__TRG__trg_system_component_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG, oldCONTEXT__TRG__trg_system_component_pkg, contexT__TRG__trg_system_component_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getCREATE__TRG__trg_system_part() {
		if (creatE__TRG__trg_system_part != null && creatE__TRG__trg_system_part.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_system_part = (InternalEObject)creatE__TRG__trg_system_part;
			creatE__TRG__trg_system_part = (Part)eResolveProxy(oldCREATE__TRG__trg_system_part);
			if (creatE__TRG__trg_system_part != oldCREATE__TRG__trg_system_part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART, oldCREATE__TRG__trg_system_part, creatE__TRG__trg_system_part));
			}
		}
		return creatE__TRG__trg_system_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetCREATE__TRG__trg_system_part() {
		return creatE__TRG__trg_system_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_system_part(Part newCREATE__TRG__trg_system_part) {
		Part oldCREATE__TRG__trg_system_part = creatE__TRG__trg_system_part;
		creatE__TRG__trg_system_part = newCREATE__TRG__trg_system_part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART, oldCREATE__TRG__trg_system_part, creatE__TRG__trg_system_part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity2SystemComponent getCREATE__CORR__OaEntity2SaSysComponent() {
		if (creatE__CORR__OaEntity2SaSysComponent != null && creatE__CORR__OaEntity2SaSysComponent.eIsProxy()) {
			InternalEObject oldCREATE__CORR__OaEntity2SaSysComponent = (InternalEObject)creatE__CORR__OaEntity2SaSysComponent;
			creatE__CORR__OaEntity2SaSysComponent = (Entity2SystemComponent)eResolveProxy(oldCREATE__CORR__OaEntity2SaSysComponent);
			if (creatE__CORR__OaEntity2SaSysComponent != oldCREATE__CORR__OaEntity2SaSysComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT, oldCREATE__CORR__OaEntity2SaSysComponent, creatE__CORR__OaEntity2SaSysComponent));
			}
		}
		return creatE__CORR__OaEntity2SaSysComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity2SystemComponent basicGetCREATE__CORR__OaEntity2SaSysComponent() {
		return creatE__CORR__OaEntity2SaSysComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__OaEntity2SaSysComponent(Entity2SystemComponent newCREATE__CORR__OaEntity2SaSysComponent) {
		Entity2SystemComponent oldCREATE__CORR__OaEntity2SaSysComponent = creatE__CORR__OaEntity2SaSysComponent;
		creatE__CORR__OaEntity2SaSysComponent = newCREATE__CORR__OaEntity2SaSysComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT, oldCREATE__CORR__OaEntity2SaSysComponent, creatE__CORR__OaEntity2SaSysComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY:
				if (resolve) return getCREATE__SRC__src_operational_entity();
				return basicGetCREATE__SRC__src_operational_entity();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART:
				if (resolve) return getCREATE__SRC__src_operational_part();
				return basicGetCREATE__SRC__src_operational_part();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY:
				if (resolve) return getCONTEXT__SRC__src_top_level_entity();
				return basicGetCONTEXT__SRC__src_top_level_entity();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				if (resolve) return getCONTEXT__TRG__trg_sa_arch();
				return basicGetCONTEXT__TRG__trg_sa_arch();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT:
				if (resolve) return getCREATE__TRG__trg_system_component();
				return basicGetCREATE__TRG__trg_system_component();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG:
				if (resolve) return getCONTEXT__TRG__trg_system_component_pkg();
				return basicGetCONTEXT__TRG__trg_system_component_pkg();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART:
				if (resolve) return getCREATE__TRG__trg_system_part();
				return basicGetCREATE__TRG__trg_system_part();
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT:
				if (resolve) return getCREATE__CORR__OaEntity2SaSysComponent();
				return basicGetCREATE__CORR__OaEntity2SaSysComponent();
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
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY:
				setCREATE__SRC__src_operational_entity((Entity)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART:
				setCREATE__SRC__src_operational_part((Part)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY:
				setCONTEXT__SRC__src_top_level_entity((Entity)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				setCONTEXT__TRG__trg_sa_arch((SystemAnalysis)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT:
				setCREATE__TRG__trg_system_component((SystemComponent)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG:
				setCONTEXT__TRG__trg_system_component_pkg((SystemComponentPkg)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART:
				setCREATE__TRG__trg_system_part((Part)newValue);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT:
				setCREATE__CORR__OaEntity2SaSysComponent((Entity2SystemComponent)newValue);
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
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY:
				setCREATE__SRC__src_operational_entity((Entity)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART:
				setCREATE__SRC__src_operational_part((Part)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY:
				setCONTEXT__SRC__src_top_level_entity((Entity)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				setCONTEXT__TRG__trg_sa_arch((SystemAnalysis)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT:
				setCREATE__TRG__trg_system_component((SystemComponent)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG:
				setCONTEXT__TRG__trg_system_component_pkg((SystemComponentPkg)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART:
				setCREATE__TRG__trg_system_part((Part)null);
				return;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT:
				setCREATE__CORR__OaEntity2SaSysComponent((Entity2SystemComponent)null);
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
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_ENTITY:
				return creatE__SRC__src_operational_entity != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_SRC_SRC_OPERATIONAL_PART:
				return creatE__SRC__src_operational_part != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_SRC_SRC_TOP_LEVEL_ENTITY:
				return contexT__SRC__src_top_level_entity != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SA_ARCH:
				return contexT__TRG__trg_sa_arch != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_COMPONENT:
				return creatE__TRG__trg_system_component != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CONTEXT_TRG_TRG_SYSTEM_COMPONENT_PKG:
				return contexT__TRG__trg_system_component_pkg != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_TRG_TRG_SYSTEM_PART:
				return creatE__TRG__trg_system_part != null;
			case TransitionActors_Oa2SaPackage.OA2_SA_TRANSITION_ACTORS_RECURSIVELY_MARKER__CREATE_CORR_OA_ENTITY2_SA_SYS_COMPONENT:
				return creatE__CORR__OaEntity2SaSysComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //Oa2Sa_transition_actors_recursively__MarkerImpl
