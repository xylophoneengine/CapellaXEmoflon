/**
 */
package TransitionActors_Oa2Sa;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oa2 Sa generation Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}</li>
 *   <li>{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}</li>
 * </ul>
 *
 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getOa2Sa_generation__Marker()
 * @model
 * @generated
 */
public interface Oa2Sa_generation__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #setCREATE__SRC__src_oa_arch(OperationalAnalysis)
	 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getOa2Sa_generation__Marker_CREATE__SRC__src_oa_arch()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis getCREATE__SRC__src_oa_arch();

	/**
	 * Sets the value of the '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #getCREATE__SRC__src_oa_arch()
	 * @generated
	 */
	void setCREATE__SRC__src_oa_arch(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg sa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg sa arch</em>' reference.
	 * @see #setCREATE__TRG__trg_sa_arch(SystemAnalysis)
	 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getOa2Sa_generation__Marker_CREATE__TRG__trg_sa_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCREATE__TRG__trg_sa_arch();

	/**
	 * Sets the value of the '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__TRG__trg_sa_arch <em>CREATE TRG trg sa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg sa arch</em>' reference.
	 * @see #getCREATE__TRG__trg_sa_arch()
	 * @generated
	 */
	void setCREATE__TRG__trg_sa_arch(SystemAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR new oa2sa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR new oa2sa</em>' reference.
	 * @see #setCREATE__CORR__new_oa2sa(Oa2Sa)
	 * @see TransitionActors_Oa2Sa.TransitionActors_Oa2SaPackage#getOa2Sa_generation__Marker_CREATE__CORR__new_oa2sa()
	 * @model required="true"
	 * @generated
	 */
	Oa2Sa getCREATE__CORR__new_oa2sa();

	/**
	 * Sets the value of the '{@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker#getCREATE__CORR__new_oa2sa <em>CREATE CORR new oa2sa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR new oa2sa</em>' reference.
	 * @see #getCREATE__CORR__new_oa2sa()
	 * @generated
	 */
	void setCREATE__CORR__new_oa2sa(Oa2Sa value);

} // Oa2Sa_generation__Marker
