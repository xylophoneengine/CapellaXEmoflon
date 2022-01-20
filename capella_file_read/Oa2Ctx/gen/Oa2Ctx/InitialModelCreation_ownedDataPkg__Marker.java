/**
 */
package Oa2Ctx;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.core.data.cs.InterfacePkg;

import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.MissionPkg;
import org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;

import org.polarsys.capella.core.data.information.DataPkg;

import org.polarsys.capella.core.data.information.datatype.BooleanType;
import org.polarsys.capella.core.data.information.datatype.NumericType;
import org.polarsys.capella.core.data.information.datatype.StringType;

import org.polarsys.capella.core.data.information.datavalue.BinaryExpression;
import org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue;

import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalActivityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;
import org.polarsys.capella.core.data.oa.RolePkg;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Model Creation owned Data Pkg Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_data_pkg <em>CREATE SRC src data pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_function_pkg <em>CREATE SRC src function pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_interface_pkg <em>CREATE SRC src interface pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_role_pkg <em>CREATE SRC src role pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_false <em>CREATE TRG bool literal false</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_true <em>CREATE TRG bool literal true</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_max_val <em>CREATE TRG byte literal max val</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_min_val <em>CREATE TRG byte literal min val</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_max_length <em>CREATE TRG char literal max length</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_min_length <em>CREATE TRG char literal min length</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val <em>CREATE TRG hex literal max val</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand <em>CREATE TRG hex literal max val left operand</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_left_operand <em>CREATE TRG hex literal max val left operand left operand</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_right_operand <em>CREATE TRG hex literal max val left operand right operand</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_right_operand <em>CREATE TRG hex literal max val right operand</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_min_val <em>CREATE TRG hex literal min val</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_abstract_capability_pkg <em>CREATE TRG trg abstract capability pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_data_pkg <em>CREATE TRG trg data pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_boolean <em>CREATE TRG trg dt boolean</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_byte <em>CREATE TRG trg dt byte</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_char <em>CREATE TRG trg dt char</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_data_pkg <em>CREATE TRG trg dt data pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_double <em>CREATE TRG trg dt double</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_float <em>CREATE TRG trg dt float</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_hex <em>CREATE TRG trg dt hex</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_function_pkg <em>CREATE TRG trg function pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_interface_pkg <em>CREATE TRG trg interface pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_mission_pkg <em>CREATE TRG trg mission pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_oa_realization <em>CREATE TRG trg oa realization</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_system_comp_pkg <em>CREATE TRG trg system comp pkg</em>}</li>
 *   <li>{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}</li>
 * </ul>
 *
 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker()
 * @model
 * @generated
 */
public interface InitialModelCreation_ownedDataPkg__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src abstract capability pkg</em>' reference.
	 * @see #setCREATE__SRC__src_abstract_capability_pkg(OperationalCapabilityPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_abstract_capability_pkg()
	 * @model required="true"
	 * @generated
	 */
	OperationalCapabilityPkg getCREATE__SRC__src_abstract_capability_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src abstract capability pkg</em>' reference.
	 * @see #getCREATE__SRC__src_abstract_capability_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_abstract_capability_pkg(OperationalCapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src data pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src data pkg</em>' reference.
	 * @see #setCREATE__SRC__src_data_pkg(DataPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_data_pkg()
	 * @model required="true"
	 * @generated
	 */
	DataPkg getCREATE__SRC__src_data_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_data_pkg <em>CREATE SRC src data pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src data pkg</em>' reference.
	 * @see #getCREATE__SRC__src_data_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_data_pkg(DataPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src entity pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src entity pkg</em>' reference.
	 * @see #setCREATE__SRC__src_entity_pkg(EntityPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_entity_pkg()
	 * @model required="true"
	 * @generated
	 */
	EntityPkg getCREATE__SRC__src_entity_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src entity pkg</em>' reference.
	 * @see #getCREATE__SRC__src_entity_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_entity_pkg(EntityPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src function pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src function pkg</em>' reference.
	 * @see #setCREATE__SRC__src_function_pkg(OperationalActivityPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_function_pkg()
	 * @model required="true"
	 * @generated
	 */
	OperationalActivityPkg getCREATE__SRC__src_function_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_function_pkg <em>CREATE SRC src function pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src function pkg</em>' reference.
	 * @see #getCREATE__SRC__src_function_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_function_pkg(OperationalActivityPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src interface pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src interface pkg</em>' reference.
	 * @see #setCREATE__SRC__src_interface_pkg(InterfacePkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_interface_pkg()
	 * @model required="true"
	 * @generated
	 */
	InterfacePkg getCREATE__SRC__src_interface_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_interface_pkg <em>CREATE SRC src interface pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src interface pkg</em>' reference.
	 * @see #getCREATE__SRC__src_interface_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_interface_pkg(InterfacePkg value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src oa arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #setCREATE__SRC__src_oa_arch(OperationalAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_oa_arch()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis getCREATE__SRC__src_oa_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src oa arch</em>' reference.
	 * @see #getCREATE__SRC__src_oa_arch()
	 * @generated
	 */
	void setCREATE__SRC__src_oa_arch(OperationalAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src role pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src role pkg</em>' reference.
	 * @see #setCREATE__SRC__src_role_pkg(RolePkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__SRC__src_role_pkg()
	 * @model required="true"
	 * @generated
	 */
	RolePkg getCREATE__SRC__src_role_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__SRC__src_role_pkg <em>CREATE SRC src role pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src role pkg</em>' reference.
	 * @see #getCREATE__SRC__src_role_pkg()
	 * @generated
	 */
	void setCREATE__SRC__src_role_pkg(RolePkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG bool literal false</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG bool literal false</em>' reference.
	 * @see #setCREATE__TRG__bool_literal_false(LiteralBooleanValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_false()
	 * @model required="true"
	 * @generated
	 */
	LiteralBooleanValue getCREATE__TRG__bool_literal_false();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_false <em>CREATE TRG bool literal false</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG bool literal false</em>' reference.
	 * @see #getCREATE__TRG__bool_literal_false()
	 * @generated
	 */
	void setCREATE__TRG__bool_literal_false(LiteralBooleanValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG bool literal true</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG bool literal true</em>' reference.
	 * @see #setCREATE__TRG__bool_literal_true(LiteralBooleanValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__bool_literal_true()
	 * @model required="true"
	 * @generated
	 */
	LiteralBooleanValue getCREATE__TRG__bool_literal_true();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__bool_literal_true <em>CREATE TRG bool literal true</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG bool literal true</em>' reference.
	 * @see #getCREATE__TRG__bool_literal_true()
	 * @generated
	 */
	void setCREATE__TRG__bool_literal_true(LiteralBooleanValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG byte literal max val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG byte literal max val</em>' reference.
	 * @see #setCREATE__TRG__byte_literal_max_val(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_max_val()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__byte_literal_max_val();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_max_val <em>CREATE TRG byte literal max val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG byte literal max val</em>' reference.
	 * @see #getCREATE__TRG__byte_literal_max_val()
	 * @generated
	 */
	void setCREATE__TRG__byte_literal_max_val(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG byte literal min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG byte literal min val</em>' reference.
	 * @see #setCREATE__TRG__byte_literal_min_val(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__byte_literal_min_val()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__byte_literal_min_val();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__byte_literal_min_val <em>CREATE TRG byte literal min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG byte literal min val</em>' reference.
	 * @see #getCREATE__TRG__byte_literal_min_val()
	 * @generated
	 */
	void setCREATE__TRG__byte_literal_min_val(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG char literal max length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG char literal max length</em>' reference.
	 * @see #setCREATE__TRG__char_literal_max_length(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_max_length()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__char_literal_max_length();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_max_length <em>CREATE TRG char literal max length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG char literal max length</em>' reference.
	 * @see #getCREATE__TRG__char_literal_max_length()
	 * @generated
	 */
	void setCREATE__TRG__char_literal_max_length(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG char literal min length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG char literal min length</em>' reference.
	 * @see #setCREATE__TRG__char_literal_min_length(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__char_literal_min_length()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__char_literal_min_length();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__char_literal_min_length <em>CREATE TRG char literal min length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG char literal min length</em>' reference.
	 * @see #getCREATE__TRG__char_literal_min_length()
	 * @generated
	 */
	void setCREATE__TRG__char_literal_min_length(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG hex literal max val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG hex literal max val</em>' reference.
	 * @see #setCREATE__TRG__hex_literal_max_val(BinaryExpression)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val()
	 * @model required="true"
	 * @generated
	 */
	BinaryExpression getCREATE__TRG__hex_literal_max_val();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val <em>CREATE TRG hex literal max val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG hex literal max val</em>' reference.
	 * @see #getCREATE__TRG__hex_literal_max_val()
	 * @generated
	 */
	void setCREATE__TRG__hex_literal_max_val(BinaryExpression value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG hex literal max val left operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG hex literal max val left operand</em>' reference.
	 * @see #setCREATE__TRG__hex_literal_max_val_left_operand(BinaryExpression)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand()
	 * @model required="true"
	 * @generated
	 */
	BinaryExpression getCREATE__TRG__hex_literal_max_val_left_operand();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand <em>CREATE TRG hex literal max val left operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG hex literal max val left operand</em>' reference.
	 * @see #getCREATE__TRG__hex_literal_max_val_left_operand()
	 * @generated
	 */
	void setCREATE__TRG__hex_literal_max_val_left_operand(BinaryExpression value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG hex literal max val left operand left operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG hex literal max val left operand left operand</em>' reference.
	 * @see #setCREATE__TRG__hex_literal_max_val_left_operand_left_operand(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_left_operand()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__hex_literal_max_val_left_operand_left_operand();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_left_operand <em>CREATE TRG hex literal max val left operand left operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG hex literal max val left operand left operand</em>' reference.
	 * @see #getCREATE__TRG__hex_literal_max_val_left_operand_left_operand()
	 * @generated
	 */
	void setCREATE__TRG__hex_literal_max_val_left_operand_left_operand(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG hex literal max val left operand right operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG hex literal max val left operand right operand</em>' reference.
	 * @see #setCREATE__TRG__hex_literal_max_val_left_operand_right_operand(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_left_operand_right_operand()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__hex_literal_max_val_left_operand_right_operand();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_left_operand_right_operand <em>CREATE TRG hex literal max val left operand right operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG hex literal max val left operand right operand</em>' reference.
	 * @see #getCREATE__TRG__hex_literal_max_val_left_operand_right_operand()
	 * @generated
	 */
	void setCREATE__TRG__hex_literal_max_val_left_operand_right_operand(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG hex literal max val right operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG hex literal max val right operand</em>' reference.
	 * @see #setCREATE__TRG__hex_literal_max_val_right_operand(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_max_val_right_operand()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__hex_literal_max_val_right_operand();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_max_val_right_operand <em>CREATE TRG hex literal max val right operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG hex literal max val right operand</em>' reference.
	 * @see #getCREATE__TRG__hex_literal_max_val_right_operand()
	 * @generated
	 */
	void setCREATE__TRG__hex_literal_max_val_right_operand(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG hex literal min val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG hex literal min val</em>' reference.
	 * @see #setCREATE__TRG__hex_literal_min_val(LiteralNumericValue)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__hex_literal_min_val()
	 * @model required="true"
	 * @generated
	 */
	LiteralNumericValue getCREATE__TRG__hex_literal_min_val();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__hex_literal_min_val <em>CREATE TRG hex literal min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG hex literal min val</em>' reference.
	 * @see #getCREATE__TRG__hex_literal_min_val()
	 * @generated
	 */
	void setCREATE__TRG__hex_literal_min_val(LiteralNumericValue value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg abstract capability pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg abstract capability pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_abstract_capability_pkg(CapabilityPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_abstract_capability_pkg()
	 * @model required="true"
	 * @generated
	 */
	CapabilityPkg getCREATE__TRG__trg_abstract_capability_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_abstract_capability_pkg <em>CREATE TRG trg abstract capability pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg abstract capability pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_abstract_capability_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_abstract_capability_pkg(CapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg ctx arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg ctx arch</em>' reference.
	 * @see #setCREATE__TRG__trg_ctx_arch(SystemAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_ctx_arch()
	 * @model required="true"
	 * @generated
	 */
	SystemAnalysis getCREATE__TRG__trg_ctx_arch();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg ctx arch</em>' reference.
	 * @see #getCREATE__TRG__trg_ctx_arch()
	 * @generated
	 */
	void setCREATE__TRG__trg_ctx_arch(SystemAnalysis value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg data pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg data pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_data_pkg(DataPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_data_pkg()
	 * @model required="true"
	 * @generated
	 */
	DataPkg getCREATE__TRG__trg_data_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_data_pkg <em>CREATE TRG trg data pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg data pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_data_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_data_pkg(DataPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt boolean</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt boolean</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_boolean(BooleanType)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_boolean()
	 * @model required="true"
	 * @generated
	 */
	BooleanType getCREATE__TRG__trg_dt_boolean();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_boolean <em>CREATE TRG trg dt boolean</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt boolean</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_boolean()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_boolean(BooleanType value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt byte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt byte</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_byte(NumericType)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_byte()
	 * @model required="true"
	 * @generated
	 */
	NumericType getCREATE__TRG__trg_dt_byte();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_byte <em>CREATE TRG trg dt byte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt byte</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_byte()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_byte(NumericType value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt char</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt char</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_char(StringType)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_char()
	 * @model required="true"
	 * @generated
	 */
	StringType getCREATE__TRG__trg_dt_char();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_char <em>CREATE TRG trg dt char</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt char</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_char()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_char(StringType value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt data pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt data pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_data_pkg(DataPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_data_pkg()
	 * @model required="true"
	 * @generated
	 */
	DataPkg getCREATE__TRG__trg_dt_data_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_data_pkg <em>CREATE TRG trg dt data pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt data pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_data_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_data_pkg(DataPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt double</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt double</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_double(NumericType)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_double()
	 * @model required="true"
	 * @generated
	 */
	NumericType getCREATE__TRG__trg_dt_double();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_double <em>CREATE TRG trg dt double</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt double</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_double()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_double(NumericType value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt float</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt float</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_float(NumericType)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_float()
	 * @model required="true"
	 * @generated
	 */
	NumericType getCREATE__TRG__trg_dt_float();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_float <em>CREATE TRG trg dt float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt float</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_float()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_float(NumericType value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg dt hex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg dt hex</em>' reference.
	 * @see #setCREATE__TRG__trg_dt_hex(NumericType)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_dt_hex()
	 * @model required="true"
	 * @generated
	 */
	NumericType getCREATE__TRG__trg_dt_hex();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_dt_hex <em>CREATE TRG trg dt hex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg dt hex</em>' reference.
	 * @see #getCREATE__TRG__trg_dt_hex()
	 * @generated
	 */
	void setCREATE__TRG__trg_dt_hex(NumericType value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg function pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg function pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_function_pkg(SystemFunctionPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_function_pkg()
	 * @model required="true"
	 * @generated
	 */
	SystemFunctionPkg getCREATE__TRG__trg_function_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_function_pkg <em>CREATE TRG trg function pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg function pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_function_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_function_pkg(SystemFunctionPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg interface pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg interface pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_interface_pkg(InterfacePkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_interface_pkg()
	 * @model required="true"
	 * @generated
	 */
	InterfacePkg getCREATE__TRG__trg_interface_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_interface_pkg <em>CREATE TRG trg interface pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg interface pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_interface_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_interface_pkg(InterfacePkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg mission pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg mission pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_mission_pkg(MissionPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_mission_pkg()
	 * @model required="true"
	 * @generated
	 */
	MissionPkg getCREATE__TRG__trg_mission_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_mission_pkg <em>CREATE TRG trg mission pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg mission pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_mission_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_mission_pkg(MissionPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg oa realization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg oa realization</em>' reference.
	 * @see #setCREATE__TRG__trg_oa_realization(OperationalAnalysisRealization)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_oa_realization()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysisRealization getCREATE__TRG__trg_oa_realization();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_oa_realization <em>CREATE TRG trg oa realization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg oa realization</em>' reference.
	 * @see #getCREATE__TRG__trg_oa_realization()
	 * @generated
	 */
	void setCREATE__TRG__trg_oa_realization(OperationalAnalysisRealization value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg system comp pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg system comp pkg</em>' reference.
	 * @see #setCREATE__TRG__trg_system_comp_pkg(SystemComponentPkg)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__TRG__trg_system_comp_pkg()
	 * @model required="true"
	 * @generated
	 */
	SystemComponentPkg getCREATE__TRG__trg_system_comp_pkg();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__TRG__trg_system_comp_pkg <em>CREATE TRG trg system comp pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg system comp pkg</em>' reference.
	 * @see #getCREATE__TRG__trg_system_comp_pkg()
	 * @generated
	 */
	void setCREATE__TRG__trg_system_comp_pkg(SystemComponentPkg value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR oa2ctx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR oa2ctx</em>' reference.
	 * @see #setCREATE__CORR__oa2ctx(OperationalAnalysis2SystemAnalysis)
	 * @see Oa2Ctx.Oa2CtxPackage#getInitialModelCreation_ownedDataPkg__Marker_CREATE__CORR__oa2ctx()
	 * @model required="true"
	 * @generated
	 */
	OperationalAnalysis2SystemAnalysis getCREATE__CORR__oa2ctx();

	/**
	 * Sets the value of the '{@link Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR oa2ctx</em>' reference.
	 * @see #getCREATE__CORR__oa2ctx()
	 * @generated
	 */
	void setCREATE__CORR__oa2ctx(OperationalAnalysis2SystemAnalysis value);

} // InitialModelCreation_ownedDataPkg__Marker
