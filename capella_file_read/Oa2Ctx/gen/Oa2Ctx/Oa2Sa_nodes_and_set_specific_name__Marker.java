/**
 */
package Oa2Ctx;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa2 Sa nodes and set specific name Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}</li>
 *   <li>{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}</li>
 *   <li>{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx.Oa2CtxPackage#getOa2Sa_nodes_and_set_specific_name__Marker()
 * @model
 * @generated
 */
public interface Oa2Sa_nodes_and_set_specific_name__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src abstract capability pkg</em>' reference.
	 * @see #setCREATE__SRC__src_abstract_capability_pkg(OperationalCapabilityPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_abstract_capability_pkg()
	 * @model required="true"
	 * @generated
	 */
	OperationalCapabilityPkg getCREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src abstract capability pkg</em>' reference.
	 * @see #getCREATE__SRC__src_abstract_capability_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_abstract_capability_pkg(OperationalCapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #setCREATE__SRC__src_oa_arch(OperationalAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__SRC__src_oa_arch()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis getCREATE__SRC__src_oa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #getCREATE__SRC__src_oa_arch()
	 * @generated
	 */
	void setCREATE__SRC__src_oa_arch(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg ctx arch</em>' reference.
	 * @see #setCREATE__TRG__trg_ctx_arch(SystemAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__TRG__trg_ctx_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCREATE__TRG__trg_ctx_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg ctx arch</em>' reference.
	 * @see #getCREATE__TRG__trg_ctx_arch()
	 * @generated
	 */
	void setCREATE__TRG__trg_ctx_arch(SystemAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR oa2ctx</em>' reference.
	 * @see #setCREATE__CORR__oa2ctx(OperationalAnalysis2SystemAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getOa2Sa_nodes_and_set_specific_name__Marker_CREATE__CORR__oa2ctx()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis2SystemAnalysis getCREATE__CORR__oa2ctx();

	/**
	 * Sets the value of the '{@link Oa2Ctx.Oa2Sa_nodes_and_set_specific_name__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR oa2ctx</em>' reference.
	 * @see #getCREATE__CORR__oa2ctx()
	 * @generated
	 */
	void setCREATE__CORR__oa2ctx(OperationalAnalysis2SystemAnalysis value);

} // Oa2Sa_nodes_and_set_specific_name__Marker
