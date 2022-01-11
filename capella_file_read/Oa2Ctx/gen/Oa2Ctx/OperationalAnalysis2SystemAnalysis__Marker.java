/**
 */
package Oa2Ctx;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Analysis2 System Analysis Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__oa_arch <em>CREATE SRC oa arch</em>}</li>
 *   <li>{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__TRG__ctx_arch <em>CREATE TRG ctx arch</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx.Oa2CtxPackage#getOperationalAnalysis2SystemAnalysis__Marker()
 * @model
 * @generated
 */
public interface OperationalAnalysis2SystemAnalysis__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC oa arch</em>' reference.
	 * @see #setCREATE__SRC__oa_arch(OperationalAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getOperationalAnalysis2SystemAnalysis__Marker_CREATE__SRC__oa_arch()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis getCREATE__SRC__oa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__SRC__oa_arch <em>CREATE SRC oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC oa arch</em>' reference.
	 * @see #getCREATE__SRC__oa_arch()
	 * @generated
	 */
	void setCREATE__SRC__oa_arch(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG ctx arch</em>' reference.
	 * @see #setCREATE__TRG__ctx_arch(SystemAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getOperationalAnalysis2SystemAnalysis__Marker_CREATE__TRG__ctx_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCREATE__TRG__ctx_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker#getCREATE__TRG__ctx_arch <em>CREATE TRG ctx arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG ctx arch</em>' reference.
	 * @see #getCREATE__TRG__ctx_arch()
	 * @generated
	 */
	void setCREATE__TRG__ctx_arch(SystemAnalysis value);

} // OperationalAnalysis2SystemAnalysis__Marker
