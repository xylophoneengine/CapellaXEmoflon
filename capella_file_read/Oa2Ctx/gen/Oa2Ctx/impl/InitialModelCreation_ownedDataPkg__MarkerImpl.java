/**
 */
package Oa2Ctx.impl;

import Oa2Ctx.InitialModelCreation_ownedDataPkg__Marker;
import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.OperationalAnalysis2SystemAnalysis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalActivityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;
import org.polarsys.capella.core.data.oa.RolePkg;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Model Creation owned Data Pkg Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src__operational_capabilities <em>CREATE SRC src operational capabilities</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_abstract_capability_pkg <em>CREATE SRC src abstract capability pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_data_pkg <em>CREATE SRC src data pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_entity_pkg <em>CREATE SRC src entity pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_function_pkg <em>CREATE SRC src function pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_interface_pkg <em>CREATE SRC src interface pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_oa_arch <em>CREATE SRC src oa arch</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__SRC__src_role_pkg <em>CREATE SRC src role pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__bool_literal_false <em>CREATE TRG bool literal false</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__bool_literal_true <em>CREATE TRG bool literal true</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__byte_literal_max_val <em>CREATE TRG byte literal max val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__byte_literal_min_val <em>CREATE TRG byte literal min val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__char_literal_max_length <em>CREATE TRG char literal max length</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__char_literal_min_length <em>CREATE TRG char literal min length</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__hex_literal_max_val <em>CREATE TRG hex literal max val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__hex_literal_max_val_left_operand <em>CREATE TRG hex literal max val left operand</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__hex_literal_max_val_left_operand_left_operand <em>CREATE TRG hex literal max val left operand left operand</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__hex_literal_max_val_left_operand_right_operand <em>CREATE TRG hex literal max val left operand right operand</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__hex_literal_max_val_right_operand <em>CREATE TRG hex literal max val right operand</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__hex_literal_min_val <em>CREATE TRG hex literal min val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_abstract_capability_pkg <em>CREATE TRG trg abstract capability pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_ctx_arch <em>CREATE TRG trg ctx arch</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_data_pkg <em>CREATE TRG trg data pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_boolean <em>CREATE TRG trg dt boolean</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_byte <em>CREATE TRG trg dt byte</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_char <em>CREATE TRG trg dt char</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_data_pkg <em>CREATE TRG trg dt data pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_double <em>CREATE TRG trg dt double</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_float <em>CREATE TRG trg dt float</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_hex <em>CREATE TRG trg dt hex</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_integer <em>CREATE TRG trg dt integer</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_long <em>CREATE TRG trg dt long</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_longlong <em>CREATE TRG trg dt longlong</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_short <em>CREATE TRG trg dt short</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_string <em>CREATE TRG trg dt string</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_unsigned_integer <em>CREATE TRG trg dt unsigned integer</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_unsigned_long <em>CREATE TRG trg dt unsigned long</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_unsigned_longlong <em>CREATE TRG trg dt unsigned longlong</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_dt_unsigned_short <em>CREATE TRG trg dt unsigned short</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_function_pkg <em>CREATE TRG trg function pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_interface_pkg <em>CREATE TRG trg interface pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_mission_pkg <em>CREATE TRG trg mission pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_oa_realization <em>CREATE TRG trg oa realization</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__trg_system_comp_pkg <em>CREATE TRG trg system comp pkg</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__unsigned_int_min_val <em>CREATE TRG unsigned int min val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__unsigned_long_min_val <em>CREATE TRG unsigned long min val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__unsigned_longlong_min_val <em>CREATE TRG unsigned longlong min val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__TRG__unsigned_short_min_val <em>CREATE TRG unsigned short min val</em>}</li>
 *   <li>{@link Oa2Ctx.impl.InitialModelCreation_ownedDataPkg__MarkerImpl#getCREATE__CORR__oa2ctx <em>CREATE CORR oa2ctx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialModelCreation_ownedDataPkg__MarkerImpl extends TGGRuleApplicationImpl implements InitialModelCreation_ownedDataPkg__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__src__operational_capabilities() <em>CREATE SRC src operational capabilities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src__operational_capabilities()
	 * @generated
	 * @ordered
	 */
	protected OperationalActivity creatE__SRC__src__operational_capabilities;

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
	 * The cached value of the '{@link #getCREATE__SRC__src_data_pkg() <em>CREATE SRC src data pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_data_pkg()
	 * @generated
	 * @ordered
	 */
	protected DataPkg creatE__SRC__src_data_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_entity_pkg() <em>CREATE SRC src entity pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_entity_pkg()
	 * @generated
	 * @ordered
	 */
	protected EntityPkg creatE__SRC__src_entity_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_function_pkg() <em>CREATE SRC src function pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_function_pkg()
	 * @generated
	 * @ordered
	 */
	protected OperationalActivityPkg creatE__SRC__src_function_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__src_interface_pkg() <em>CREATE SRC src interface pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_interface_pkg()
	 * @generated
	 * @ordered
	 */
	protected InterfacePkg creatE__SRC__src_interface_pkg;

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
	 * The cached value of the '{@link #getCREATE__SRC__src_role_pkg() <em>CREATE SRC src role pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__src_role_pkg()
	 * @generated
	 * @ordered
	 */
	protected RolePkg creatE__SRC__src_role_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__bool_literal_false() <em>CREATE TRG bool literal false</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__bool_literal_false()
	 * @generated
	 * @ordered
	 */
	protected LiteralBooleanValue creatE__TRG__bool_literal_false;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__bool_literal_true() <em>CREATE TRG bool literal true</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__bool_literal_true()
	 * @generated
	 * @ordered
	 */
	protected LiteralBooleanValue creatE__TRG__bool_literal_true;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__byte_literal_max_val() <em>CREATE TRG byte literal max val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__byte_literal_max_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__byte_literal_max_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__byte_literal_min_val() <em>CREATE TRG byte literal min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__byte_literal_min_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__byte_literal_min_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__char_literal_max_length() <em>CREATE TRG char literal max length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__char_literal_max_length()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__char_literal_max_length;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__char_literal_min_length() <em>CREATE TRG char literal min length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__char_literal_min_length()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__char_literal_min_length;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__hex_literal_max_val() <em>CREATE TRG hex literal max val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__hex_literal_max_val()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpression creatE__TRG__hex_literal_max_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__hex_literal_max_val_left_operand() <em>CREATE TRG hex literal max val left operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__hex_literal_max_val_left_operand()
	 * @generated
	 * @ordered
	 */
	protected BinaryExpression creatE__TRG__hex_literal_max_val_left_operand;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__hex_literal_max_val_left_operand_left_operand() <em>CREATE TRG hex literal max val left operand left operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__hex_literal_max_val_left_operand_left_operand()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__hex_literal_max_val_left_operand_left_operand;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__hex_literal_max_val_left_operand_right_operand() <em>CREATE TRG hex literal max val left operand right operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__hex_literal_max_val_left_operand_right_operand()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__hex_literal_max_val_left_operand_right_operand;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__hex_literal_max_val_right_operand() <em>CREATE TRG hex literal max val right operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__hex_literal_max_val_right_operand()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__hex_literal_max_val_right_operand;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__hex_literal_min_val() <em>CREATE TRG hex literal min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__hex_literal_min_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__hex_literal_min_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_abstract_capability_pkg() <em>CREATE TRG trg abstract capability pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_abstract_capability_pkg()
	 * @generated
	 * @ordered
	 */
	protected CapabilityPkg creatE__TRG__trg_abstract_capability_pkg;

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
	 * The cached value of the '{@link #getCREATE__TRG__trg_data_pkg() <em>CREATE TRG trg data pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_data_pkg()
	 * @generated
	 * @ordered
	 */
	protected DataPkg creatE__TRG__trg_data_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_boolean() <em>CREATE TRG trg dt boolean</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_boolean()
	 * @generated
	 * @ordered
	 */
	protected BooleanType creatE__TRG__trg_dt_boolean;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_byte() <em>CREATE TRG trg dt byte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_byte()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_byte;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_char() <em>CREATE TRG trg dt char</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_char()
	 * @generated
	 * @ordered
	 */
	protected StringType creatE__TRG__trg_dt_char;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_data_pkg() <em>CREATE TRG trg dt data pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_data_pkg()
	 * @generated
	 * @ordered
	 */
	protected DataPkg creatE__TRG__trg_dt_data_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_double() <em>CREATE TRG trg dt double</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_double()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_double;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_float() <em>CREATE TRG trg dt float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_float()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_float;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_hex() <em>CREATE TRG trg dt hex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_hex()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_hex;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_integer() <em>CREATE TRG trg dt integer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_integer()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_integer;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_long() <em>CREATE TRG trg dt long</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_long()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_long;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_longlong() <em>CREATE TRG trg dt longlong</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_longlong()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_longlong;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_short() <em>CREATE TRG trg dt short</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_short()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_short;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_string() <em>CREATE TRG trg dt string</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_string()
	 * @generated
	 * @ordered
	 */
	protected StringType creatE__TRG__trg_dt_string;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_unsigned_integer() <em>CREATE TRG trg dt unsigned integer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_unsigned_integer()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_unsigned_integer;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_unsigned_long() <em>CREATE TRG trg dt unsigned long</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_unsigned_long()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_unsigned_long;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_unsigned_longlong() <em>CREATE TRG trg dt unsigned longlong</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_unsigned_longlong()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_unsigned_longlong;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_dt_unsigned_short() <em>CREATE TRG trg dt unsigned short</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_dt_unsigned_short()
	 * @generated
	 * @ordered
	 */
	protected NumericType creatE__TRG__trg_dt_unsigned_short;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_function_pkg() <em>CREATE TRG trg function pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_function_pkg()
	 * @generated
	 * @ordered
	 */
	protected SystemFunctionPkg creatE__TRG__trg_function_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_interface_pkg() <em>CREATE TRG trg interface pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_interface_pkg()
	 * @generated
	 * @ordered
	 */
	protected InterfacePkg creatE__TRG__trg_interface_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_mission_pkg() <em>CREATE TRG trg mission pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_mission_pkg()
	 * @generated
	 * @ordered
	 */
	protected MissionPkg creatE__TRG__trg_mission_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_oa_realization() <em>CREATE TRG trg oa realization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_oa_realization()
	 * @generated
	 * @ordered
	 */
	protected OperationalAnalysisRealization creatE__TRG__trg_oa_realization;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trg_system_comp_pkg() <em>CREATE TRG trg system comp pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trg_system_comp_pkg()
	 * @generated
	 * @ordered
	 */
	protected SystemComponentPkg creatE__TRG__trg_system_comp_pkg;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__unsigned_int_min_val() <em>CREATE TRG unsigned int min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__unsigned_int_min_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__unsigned_int_min_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__unsigned_long_min_val() <em>CREATE TRG unsigned long min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__unsigned_long_min_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__unsigned_long_min_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__unsigned_longlong_min_val() <em>CREATE TRG unsigned longlong min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__unsigned_longlong_min_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__unsigned_longlong_min_val;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__unsigned_short_min_val() <em>CREATE TRG unsigned short min val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__unsigned_short_min_val()
	 * @generated
	 * @ordered
	 */
	protected LiteralNumericValue creatE__TRG__unsigned_short_min_val;

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
	protected InitialModelCreation_ownedDataPkg__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Oa2CtxPackage.Literals.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity getCREATE__SRC__src__operational_capabilities() {
		if (creatE__SRC__src__operational_capabilities != null && creatE__SRC__src__operational_capabilities.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src__operational_capabilities = (InternalEObject)creatE__SRC__src__operational_capabilities;
			creatE__SRC__src__operational_capabilities = (OperationalActivity)eResolveProxy(oldCREATE__SRC__src__operational_capabilities);
			if (creatE__SRC__src__operational_capabilities != oldCREATE__SRC__src__operational_capabilities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES, oldCREATE__SRC__src__operational_capabilities, creatE__SRC__src__operational_capabilities));
			}
		}
		return creatE__SRC__src__operational_capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity basicGetCREATE__SRC__src__operational_capabilities() {
		return creatE__SRC__src__operational_capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src__operational_capabilities(OperationalActivity newCREATE__SRC__src__operational_capabilities) {
		OperationalActivity oldCREATE__SRC__src__operational_capabilities = creatE__SRC__src__operational_capabilities;
		creatE__SRC__src__operational_capabilities = newCREATE__SRC__src__operational_capabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES, oldCREATE__SRC__src__operational_capabilities, creatE__SRC__src__operational_capabilities));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG, oldCREATE__SRC__src_abstract_capability_pkg, creatE__SRC__src_abstract_capability_pkg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG, oldCREATE__SRC__src_abstract_capability_pkg, creatE__SRC__src_abstract_capability_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg getCREATE__SRC__src_data_pkg() {
		if (creatE__SRC__src_data_pkg != null && creatE__SRC__src_data_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_data_pkg = (InternalEObject)creatE__SRC__src_data_pkg;
			creatE__SRC__src_data_pkg = (DataPkg)eResolveProxy(oldCREATE__SRC__src_data_pkg);
			if (creatE__SRC__src_data_pkg != oldCREATE__SRC__src_data_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG, oldCREATE__SRC__src_data_pkg, creatE__SRC__src_data_pkg));
			}
		}
		return creatE__SRC__src_data_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg basicGetCREATE__SRC__src_data_pkg() {
		return creatE__SRC__src_data_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_data_pkg(DataPkg newCREATE__SRC__src_data_pkg) {
		DataPkg oldCREATE__SRC__src_data_pkg = creatE__SRC__src_data_pkg;
		creatE__SRC__src_data_pkg = newCREATE__SRC__src_data_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG, oldCREATE__SRC__src_data_pkg, creatE__SRC__src_data_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg getCREATE__SRC__src_entity_pkg() {
		if (creatE__SRC__src_entity_pkg != null && creatE__SRC__src_entity_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_entity_pkg = (InternalEObject)creatE__SRC__src_entity_pkg;
			creatE__SRC__src_entity_pkg = (EntityPkg)eResolveProxy(oldCREATE__SRC__src_entity_pkg);
			if (creatE__SRC__src_entity_pkg != oldCREATE__SRC__src_entity_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG, oldCREATE__SRC__src_entity_pkg, creatE__SRC__src_entity_pkg));
			}
		}
		return creatE__SRC__src_entity_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg basicGetCREATE__SRC__src_entity_pkg() {
		return creatE__SRC__src_entity_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_entity_pkg(EntityPkg newCREATE__SRC__src_entity_pkg) {
		EntityPkg oldCREATE__SRC__src_entity_pkg = creatE__SRC__src_entity_pkg;
		creatE__SRC__src_entity_pkg = newCREATE__SRC__src_entity_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG, oldCREATE__SRC__src_entity_pkg, creatE__SRC__src_entity_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg getCREATE__SRC__src_function_pkg() {
		if (creatE__SRC__src_function_pkg != null && creatE__SRC__src_function_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_function_pkg = (InternalEObject)creatE__SRC__src_function_pkg;
			creatE__SRC__src_function_pkg = (OperationalActivityPkg)eResolveProxy(oldCREATE__SRC__src_function_pkg);
			if (creatE__SRC__src_function_pkg != oldCREATE__SRC__src_function_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG, oldCREATE__SRC__src_function_pkg, creatE__SRC__src_function_pkg));
			}
		}
		return creatE__SRC__src_function_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg basicGetCREATE__SRC__src_function_pkg() {
		return creatE__SRC__src_function_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_function_pkg(OperationalActivityPkg newCREATE__SRC__src_function_pkg) {
		OperationalActivityPkg oldCREATE__SRC__src_function_pkg = creatE__SRC__src_function_pkg;
		creatE__SRC__src_function_pkg = newCREATE__SRC__src_function_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG, oldCREATE__SRC__src_function_pkg, creatE__SRC__src_function_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg getCREATE__SRC__src_interface_pkg() {
		if (creatE__SRC__src_interface_pkg != null && creatE__SRC__src_interface_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_interface_pkg = (InternalEObject)creatE__SRC__src_interface_pkg;
			creatE__SRC__src_interface_pkg = (InterfacePkg)eResolveProxy(oldCREATE__SRC__src_interface_pkg);
			if (creatE__SRC__src_interface_pkg != oldCREATE__SRC__src_interface_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG, oldCREATE__SRC__src_interface_pkg, creatE__SRC__src_interface_pkg));
			}
		}
		return creatE__SRC__src_interface_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg basicGetCREATE__SRC__src_interface_pkg() {
		return creatE__SRC__src_interface_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_interface_pkg(InterfacePkg newCREATE__SRC__src_interface_pkg) {
		InterfacePkg oldCREATE__SRC__src_interface_pkg = creatE__SRC__src_interface_pkg;
		creatE__SRC__src_interface_pkg = newCREATE__SRC__src_interface_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG, oldCREATE__SRC__src_interface_pkg, creatE__SRC__src_interface_pkg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH, oldCREATE__SRC__src_oa_arch, creatE__SRC__src_oa_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg getCREATE__SRC__src_role_pkg() {
		if (creatE__SRC__src_role_pkg != null && creatE__SRC__src_role_pkg.eIsProxy()) {
			InternalEObject oldCREATE__SRC__src_role_pkg = (InternalEObject)creatE__SRC__src_role_pkg;
			creatE__SRC__src_role_pkg = (RolePkg)eResolveProxy(oldCREATE__SRC__src_role_pkg);
			if (creatE__SRC__src_role_pkg != oldCREATE__SRC__src_role_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG, oldCREATE__SRC__src_role_pkg, creatE__SRC__src_role_pkg));
			}
		}
		return creatE__SRC__src_role_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg basicGetCREATE__SRC__src_role_pkg() {
		return creatE__SRC__src_role_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__src_role_pkg(RolePkg newCREATE__SRC__src_role_pkg) {
		RolePkg oldCREATE__SRC__src_role_pkg = creatE__SRC__src_role_pkg;
		creatE__SRC__src_role_pkg = newCREATE__SRC__src_role_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG, oldCREATE__SRC__src_role_pkg, creatE__SRC__src_role_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanValue getCREATE__TRG__bool_literal_false() {
		if (creatE__TRG__bool_literal_false != null && creatE__TRG__bool_literal_false.eIsProxy()) {
			InternalEObject oldCREATE__TRG__bool_literal_false = (InternalEObject)creatE__TRG__bool_literal_false;
			creatE__TRG__bool_literal_false = (LiteralBooleanValue)eResolveProxy(oldCREATE__TRG__bool_literal_false);
			if (creatE__TRG__bool_literal_false != oldCREATE__TRG__bool_literal_false) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE, oldCREATE__TRG__bool_literal_false, creatE__TRG__bool_literal_false));
			}
		}
		return creatE__TRG__bool_literal_false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanValue basicGetCREATE__TRG__bool_literal_false() {
		return creatE__TRG__bool_literal_false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__bool_literal_false(LiteralBooleanValue newCREATE__TRG__bool_literal_false) {
		LiteralBooleanValue oldCREATE__TRG__bool_literal_false = creatE__TRG__bool_literal_false;
		creatE__TRG__bool_literal_false = newCREATE__TRG__bool_literal_false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE, oldCREATE__TRG__bool_literal_false, creatE__TRG__bool_literal_false));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanValue getCREATE__TRG__bool_literal_true() {
		if (creatE__TRG__bool_literal_true != null && creatE__TRG__bool_literal_true.eIsProxy()) {
			InternalEObject oldCREATE__TRG__bool_literal_true = (InternalEObject)creatE__TRG__bool_literal_true;
			creatE__TRG__bool_literal_true = (LiteralBooleanValue)eResolveProxy(oldCREATE__TRG__bool_literal_true);
			if (creatE__TRG__bool_literal_true != oldCREATE__TRG__bool_literal_true) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE, oldCREATE__TRG__bool_literal_true, creatE__TRG__bool_literal_true));
			}
		}
		return creatE__TRG__bool_literal_true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanValue basicGetCREATE__TRG__bool_literal_true() {
		return creatE__TRG__bool_literal_true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__bool_literal_true(LiteralBooleanValue newCREATE__TRG__bool_literal_true) {
		LiteralBooleanValue oldCREATE__TRG__bool_literal_true = creatE__TRG__bool_literal_true;
		creatE__TRG__bool_literal_true = newCREATE__TRG__bool_literal_true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE, oldCREATE__TRG__bool_literal_true, creatE__TRG__bool_literal_true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__byte_literal_max_val() {
		if (creatE__TRG__byte_literal_max_val != null && creatE__TRG__byte_literal_max_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__byte_literal_max_val = (InternalEObject)creatE__TRG__byte_literal_max_val;
			creatE__TRG__byte_literal_max_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__byte_literal_max_val);
			if (creatE__TRG__byte_literal_max_val != oldCREATE__TRG__byte_literal_max_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL, oldCREATE__TRG__byte_literal_max_val, creatE__TRG__byte_literal_max_val));
			}
		}
		return creatE__TRG__byte_literal_max_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__byte_literal_max_val() {
		return creatE__TRG__byte_literal_max_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__byte_literal_max_val(LiteralNumericValue newCREATE__TRG__byte_literal_max_val) {
		LiteralNumericValue oldCREATE__TRG__byte_literal_max_val = creatE__TRG__byte_literal_max_val;
		creatE__TRG__byte_literal_max_val = newCREATE__TRG__byte_literal_max_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL, oldCREATE__TRG__byte_literal_max_val, creatE__TRG__byte_literal_max_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__byte_literal_min_val() {
		if (creatE__TRG__byte_literal_min_val != null && creatE__TRG__byte_literal_min_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__byte_literal_min_val = (InternalEObject)creatE__TRG__byte_literal_min_val;
			creatE__TRG__byte_literal_min_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__byte_literal_min_val);
			if (creatE__TRG__byte_literal_min_val != oldCREATE__TRG__byte_literal_min_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL, oldCREATE__TRG__byte_literal_min_val, creatE__TRG__byte_literal_min_val));
			}
		}
		return creatE__TRG__byte_literal_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__byte_literal_min_val() {
		return creatE__TRG__byte_literal_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__byte_literal_min_val(LiteralNumericValue newCREATE__TRG__byte_literal_min_val) {
		LiteralNumericValue oldCREATE__TRG__byte_literal_min_val = creatE__TRG__byte_literal_min_val;
		creatE__TRG__byte_literal_min_val = newCREATE__TRG__byte_literal_min_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL, oldCREATE__TRG__byte_literal_min_val, creatE__TRG__byte_literal_min_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__char_literal_max_length() {
		if (creatE__TRG__char_literal_max_length != null && creatE__TRG__char_literal_max_length.eIsProxy()) {
			InternalEObject oldCREATE__TRG__char_literal_max_length = (InternalEObject)creatE__TRG__char_literal_max_length;
			creatE__TRG__char_literal_max_length = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__char_literal_max_length);
			if (creatE__TRG__char_literal_max_length != oldCREATE__TRG__char_literal_max_length) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH, oldCREATE__TRG__char_literal_max_length, creatE__TRG__char_literal_max_length));
			}
		}
		return creatE__TRG__char_literal_max_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__char_literal_max_length() {
		return creatE__TRG__char_literal_max_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__char_literal_max_length(LiteralNumericValue newCREATE__TRG__char_literal_max_length) {
		LiteralNumericValue oldCREATE__TRG__char_literal_max_length = creatE__TRG__char_literal_max_length;
		creatE__TRG__char_literal_max_length = newCREATE__TRG__char_literal_max_length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH, oldCREATE__TRG__char_literal_max_length, creatE__TRG__char_literal_max_length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__char_literal_min_length() {
		if (creatE__TRG__char_literal_min_length != null && creatE__TRG__char_literal_min_length.eIsProxy()) {
			InternalEObject oldCREATE__TRG__char_literal_min_length = (InternalEObject)creatE__TRG__char_literal_min_length;
			creatE__TRG__char_literal_min_length = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__char_literal_min_length);
			if (creatE__TRG__char_literal_min_length != oldCREATE__TRG__char_literal_min_length) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH, oldCREATE__TRG__char_literal_min_length, creatE__TRG__char_literal_min_length));
			}
		}
		return creatE__TRG__char_literal_min_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__char_literal_min_length() {
		return creatE__TRG__char_literal_min_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__char_literal_min_length(LiteralNumericValue newCREATE__TRG__char_literal_min_length) {
		LiteralNumericValue oldCREATE__TRG__char_literal_min_length = creatE__TRG__char_literal_min_length;
		creatE__TRG__char_literal_min_length = newCREATE__TRG__char_literal_min_length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH, oldCREATE__TRG__char_literal_min_length, creatE__TRG__char_literal_min_length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression getCREATE__TRG__hex_literal_max_val() {
		if (creatE__TRG__hex_literal_max_val != null && creatE__TRG__hex_literal_max_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__hex_literal_max_val = (InternalEObject)creatE__TRG__hex_literal_max_val;
			creatE__TRG__hex_literal_max_val = (BinaryExpression)eResolveProxy(oldCREATE__TRG__hex_literal_max_val);
			if (creatE__TRG__hex_literal_max_val != oldCREATE__TRG__hex_literal_max_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL, oldCREATE__TRG__hex_literal_max_val, creatE__TRG__hex_literal_max_val));
			}
		}
		return creatE__TRG__hex_literal_max_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression basicGetCREATE__TRG__hex_literal_max_val() {
		return creatE__TRG__hex_literal_max_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__hex_literal_max_val(BinaryExpression newCREATE__TRG__hex_literal_max_val) {
		BinaryExpression oldCREATE__TRG__hex_literal_max_val = creatE__TRG__hex_literal_max_val;
		creatE__TRG__hex_literal_max_val = newCREATE__TRG__hex_literal_max_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL, oldCREATE__TRG__hex_literal_max_val, creatE__TRG__hex_literal_max_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression getCREATE__TRG__hex_literal_max_val_left_operand() {
		if (creatE__TRG__hex_literal_max_val_left_operand != null && creatE__TRG__hex_literal_max_val_left_operand.eIsProxy()) {
			InternalEObject oldCREATE__TRG__hex_literal_max_val_left_operand = (InternalEObject)creatE__TRG__hex_literal_max_val_left_operand;
			creatE__TRG__hex_literal_max_val_left_operand = (BinaryExpression)eResolveProxy(oldCREATE__TRG__hex_literal_max_val_left_operand);
			if (creatE__TRG__hex_literal_max_val_left_operand != oldCREATE__TRG__hex_literal_max_val_left_operand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND, oldCREATE__TRG__hex_literal_max_val_left_operand, creatE__TRG__hex_literal_max_val_left_operand));
			}
		}
		return creatE__TRG__hex_literal_max_val_left_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression basicGetCREATE__TRG__hex_literal_max_val_left_operand() {
		return creatE__TRG__hex_literal_max_val_left_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__hex_literal_max_val_left_operand(BinaryExpression newCREATE__TRG__hex_literal_max_val_left_operand) {
		BinaryExpression oldCREATE__TRG__hex_literal_max_val_left_operand = creatE__TRG__hex_literal_max_val_left_operand;
		creatE__TRG__hex_literal_max_val_left_operand = newCREATE__TRG__hex_literal_max_val_left_operand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND, oldCREATE__TRG__hex_literal_max_val_left_operand, creatE__TRG__hex_literal_max_val_left_operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__hex_literal_max_val_left_operand_left_operand() {
		if (creatE__TRG__hex_literal_max_val_left_operand_left_operand != null && creatE__TRG__hex_literal_max_val_left_operand_left_operand.eIsProxy()) {
			InternalEObject oldCREATE__TRG__hex_literal_max_val_left_operand_left_operand = (InternalEObject)creatE__TRG__hex_literal_max_val_left_operand_left_operand;
			creatE__TRG__hex_literal_max_val_left_operand_left_operand = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__hex_literal_max_val_left_operand_left_operand);
			if (creatE__TRG__hex_literal_max_val_left_operand_left_operand != oldCREATE__TRG__hex_literal_max_val_left_operand_left_operand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND, oldCREATE__TRG__hex_literal_max_val_left_operand_left_operand, creatE__TRG__hex_literal_max_val_left_operand_left_operand));
			}
		}
		return creatE__TRG__hex_literal_max_val_left_operand_left_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__hex_literal_max_val_left_operand_left_operand() {
		return creatE__TRG__hex_literal_max_val_left_operand_left_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__hex_literal_max_val_left_operand_left_operand(LiteralNumericValue newCREATE__TRG__hex_literal_max_val_left_operand_left_operand) {
		LiteralNumericValue oldCREATE__TRG__hex_literal_max_val_left_operand_left_operand = creatE__TRG__hex_literal_max_val_left_operand_left_operand;
		creatE__TRG__hex_literal_max_val_left_operand_left_operand = newCREATE__TRG__hex_literal_max_val_left_operand_left_operand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND, oldCREATE__TRG__hex_literal_max_val_left_operand_left_operand, creatE__TRG__hex_literal_max_val_left_operand_left_operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__hex_literal_max_val_left_operand_right_operand() {
		if (creatE__TRG__hex_literal_max_val_left_operand_right_operand != null && creatE__TRG__hex_literal_max_val_left_operand_right_operand.eIsProxy()) {
			InternalEObject oldCREATE__TRG__hex_literal_max_val_left_operand_right_operand = (InternalEObject)creatE__TRG__hex_literal_max_val_left_operand_right_operand;
			creatE__TRG__hex_literal_max_val_left_operand_right_operand = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__hex_literal_max_val_left_operand_right_operand);
			if (creatE__TRG__hex_literal_max_val_left_operand_right_operand != oldCREATE__TRG__hex_literal_max_val_left_operand_right_operand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND, oldCREATE__TRG__hex_literal_max_val_left_operand_right_operand, creatE__TRG__hex_literal_max_val_left_operand_right_operand));
			}
		}
		return creatE__TRG__hex_literal_max_val_left_operand_right_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__hex_literal_max_val_left_operand_right_operand() {
		return creatE__TRG__hex_literal_max_val_left_operand_right_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__hex_literal_max_val_left_operand_right_operand(LiteralNumericValue newCREATE__TRG__hex_literal_max_val_left_operand_right_operand) {
		LiteralNumericValue oldCREATE__TRG__hex_literal_max_val_left_operand_right_operand = creatE__TRG__hex_literal_max_val_left_operand_right_operand;
		creatE__TRG__hex_literal_max_val_left_operand_right_operand = newCREATE__TRG__hex_literal_max_val_left_operand_right_operand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND, oldCREATE__TRG__hex_literal_max_val_left_operand_right_operand, creatE__TRG__hex_literal_max_val_left_operand_right_operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__hex_literal_max_val_right_operand() {
		if (creatE__TRG__hex_literal_max_val_right_operand != null && creatE__TRG__hex_literal_max_val_right_operand.eIsProxy()) {
			InternalEObject oldCREATE__TRG__hex_literal_max_val_right_operand = (InternalEObject)creatE__TRG__hex_literal_max_val_right_operand;
			creatE__TRG__hex_literal_max_val_right_operand = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__hex_literal_max_val_right_operand);
			if (creatE__TRG__hex_literal_max_val_right_operand != oldCREATE__TRG__hex_literal_max_val_right_operand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND, oldCREATE__TRG__hex_literal_max_val_right_operand, creatE__TRG__hex_literal_max_val_right_operand));
			}
		}
		return creatE__TRG__hex_literal_max_val_right_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__hex_literal_max_val_right_operand() {
		return creatE__TRG__hex_literal_max_val_right_operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__hex_literal_max_val_right_operand(LiteralNumericValue newCREATE__TRG__hex_literal_max_val_right_operand) {
		LiteralNumericValue oldCREATE__TRG__hex_literal_max_val_right_operand = creatE__TRG__hex_literal_max_val_right_operand;
		creatE__TRG__hex_literal_max_val_right_operand = newCREATE__TRG__hex_literal_max_val_right_operand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND, oldCREATE__TRG__hex_literal_max_val_right_operand, creatE__TRG__hex_literal_max_val_right_operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__hex_literal_min_val() {
		if (creatE__TRG__hex_literal_min_val != null && creatE__TRG__hex_literal_min_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__hex_literal_min_val = (InternalEObject)creatE__TRG__hex_literal_min_val;
			creatE__TRG__hex_literal_min_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__hex_literal_min_val);
			if (creatE__TRG__hex_literal_min_val != oldCREATE__TRG__hex_literal_min_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL, oldCREATE__TRG__hex_literal_min_val, creatE__TRG__hex_literal_min_val));
			}
		}
		return creatE__TRG__hex_literal_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__hex_literal_min_val() {
		return creatE__TRG__hex_literal_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__hex_literal_min_val(LiteralNumericValue newCREATE__TRG__hex_literal_min_val) {
		LiteralNumericValue oldCREATE__TRG__hex_literal_min_val = creatE__TRG__hex_literal_min_val;
		creatE__TRG__hex_literal_min_val = newCREATE__TRG__hex_literal_min_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL, oldCREATE__TRG__hex_literal_min_val, creatE__TRG__hex_literal_min_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg getCREATE__TRG__trg_abstract_capability_pkg() {
		if (creatE__TRG__trg_abstract_capability_pkg != null && creatE__TRG__trg_abstract_capability_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_abstract_capability_pkg = (InternalEObject)creatE__TRG__trg_abstract_capability_pkg;
			creatE__TRG__trg_abstract_capability_pkg = (CapabilityPkg)eResolveProxy(oldCREATE__TRG__trg_abstract_capability_pkg);
			if (creatE__TRG__trg_abstract_capability_pkg != oldCREATE__TRG__trg_abstract_capability_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG, oldCREATE__TRG__trg_abstract_capability_pkg, creatE__TRG__trg_abstract_capability_pkg));
			}
		}
		return creatE__TRG__trg_abstract_capability_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg basicGetCREATE__TRG__trg_abstract_capability_pkg() {
		return creatE__TRG__trg_abstract_capability_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_abstract_capability_pkg(CapabilityPkg newCREATE__TRG__trg_abstract_capability_pkg) {
		CapabilityPkg oldCREATE__TRG__trg_abstract_capability_pkg = creatE__TRG__trg_abstract_capability_pkg;
		creatE__TRG__trg_abstract_capability_pkg = newCREATE__TRG__trg_abstract_capability_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG, oldCREATE__TRG__trg_abstract_capability_pkg, creatE__TRG__trg_abstract_capability_pkg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH, oldCREATE__TRG__trg_ctx_arch, creatE__TRG__trg_ctx_arch));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH, oldCREATE__TRG__trg_ctx_arch, creatE__TRG__trg_ctx_arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg getCREATE__TRG__trg_data_pkg() {
		if (creatE__TRG__trg_data_pkg != null && creatE__TRG__trg_data_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_data_pkg = (InternalEObject)creatE__TRG__trg_data_pkg;
			creatE__TRG__trg_data_pkg = (DataPkg)eResolveProxy(oldCREATE__TRG__trg_data_pkg);
			if (creatE__TRG__trg_data_pkg != oldCREATE__TRG__trg_data_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG, oldCREATE__TRG__trg_data_pkg, creatE__TRG__trg_data_pkg));
			}
		}
		return creatE__TRG__trg_data_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg basicGetCREATE__TRG__trg_data_pkg() {
		return creatE__TRG__trg_data_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_data_pkg(DataPkg newCREATE__TRG__trg_data_pkg) {
		DataPkg oldCREATE__TRG__trg_data_pkg = creatE__TRG__trg_data_pkg;
		creatE__TRG__trg_data_pkg = newCREATE__TRG__trg_data_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG, oldCREATE__TRG__trg_data_pkg, creatE__TRG__trg_data_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getCREATE__TRG__trg_dt_boolean() {
		if (creatE__TRG__trg_dt_boolean != null && creatE__TRG__trg_dt_boolean.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_boolean = (InternalEObject)creatE__TRG__trg_dt_boolean;
			creatE__TRG__trg_dt_boolean = (BooleanType)eResolveProxy(oldCREATE__TRG__trg_dt_boolean);
			if (creatE__TRG__trg_dt_boolean != oldCREATE__TRG__trg_dt_boolean) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN, oldCREATE__TRG__trg_dt_boolean, creatE__TRG__trg_dt_boolean));
			}
		}
		return creatE__TRG__trg_dt_boolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType basicGetCREATE__TRG__trg_dt_boolean() {
		return creatE__TRG__trg_dt_boolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_boolean(BooleanType newCREATE__TRG__trg_dt_boolean) {
		BooleanType oldCREATE__TRG__trg_dt_boolean = creatE__TRG__trg_dt_boolean;
		creatE__TRG__trg_dt_boolean = newCREATE__TRG__trg_dt_boolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN, oldCREATE__TRG__trg_dt_boolean, creatE__TRG__trg_dt_boolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_byte() {
		if (creatE__TRG__trg_dt_byte != null && creatE__TRG__trg_dt_byte.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_byte = (InternalEObject)creatE__TRG__trg_dt_byte;
			creatE__TRG__trg_dt_byte = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_byte);
			if (creatE__TRG__trg_dt_byte != oldCREATE__TRG__trg_dt_byte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE, oldCREATE__TRG__trg_dt_byte, creatE__TRG__trg_dt_byte));
			}
		}
		return creatE__TRG__trg_dt_byte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_byte() {
		return creatE__TRG__trg_dt_byte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_byte(NumericType newCREATE__TRG__trg_dt_byte) {
		NumericType oldCREATE__TRG__trg_dt_byte = creatE__TRG__trg_dt_byte;
		creatE__TRG__trg_dt_byte = newCREATE__TRG__trg_dt_byte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE, oldCREATE__TRG__trg_dt_byte, creatE__TRG__trg_dt_byte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getCREATE__TRG__trg_dt_char() {
		if (creatE__TRG__trg_dt_char != null && creatE__TRG__trg_dt_char.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_char = (InternalEObject)creatE__TRG__trg_dt_char;
			creatE__TRG__trg_dt_char = (StringType)eResolveProxy(oldCREATE__TRG__trg_dt_char);
			if (creatE__TRG__trg_dt_char != oldCREATE__TRG__trg_dt_char) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR, oldCREATE__TRG__trg_dt_char, creatE__TRG__trg_dt_char));
			}
		}
		return creatE__TRG__trg_dt_char;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType basicGetCREATE__TRG__trg_dt_char() {
		return creatE__TRG__trg_dt_char;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_char(StringType newCREATE__TRG__trg_dt_char) {
		StringType oldCREATE__TRG__trg_dt_char = creatE__TRG__trg_dt_char;
		creatE__TRG__trg_dt_char = newCREATE__TRG__trg_dt_char;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR, oldCREATE__TRG__trg_dt_char, creatE__TRG__trg_dt_char));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg getCREATE__TRG__trg_dt_data_pkg() {
		if (creatE__TRG__trg_dt_data_pkg != null && creatE__TRG__trg_dt_data_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_data_pkg = (InternalEObject)creatE__TRG__trg_dt_data_pkg;
			creatE__TRG__trg_dt_data_pkg = (DataPkg)eResolveProxy(oldCREATE__TRG__trg_dt_data_pkg);
			if (creatE__TRG__trg_dt_data_pkg != oldCREATE__TRG__trg_dt_data_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG, oldCREATE__TRG__trg_dt_data_pkg, creatE__TRG__trg_dt_data_pkg));
			}
		}
		return creatE__TRG__trg_dt_data_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg basicGetCREATE__TRG__trg_dt_data_pkg() {
		return creatE__TRG__trg_dt_data_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_data_pkg(DataPkg newCREATE__TRG__trg_dt_data_pkg) {
		DataPkg oldCREATE__TRG__trg_dt_data_pkg = creatE__TRG__trg_dt_data_pkg;
		creatE__TRG__trg_dt_data_pkg = newCREATE__TRG__trg_dt_data_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG, oldCREATE__TRG__trg_dt_data_pkg, creatE__TRG__trg_dt_data_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_double() {
		if (creatE__TRG__trg_dt_double != null && creatE__TRG__trg_dt_double.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_double = (InternalEObject)creatE__TRG__trg_dt_double;
			creatE__TRG__trg_dt_double = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_double);
			if (creatE__TRG__trg_dt_double != oldCREATE__TRG__trg_dt_double) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE, oldCREATE__TRG__trg_dt_double, creatE__TRG__trg_dt_double));
			}
		}
		return creatE__TRG__trg_dt_double;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_double() {
		return creatE__TRG__trg_dt_double;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_double(NumericType newCREATE__TRG__trg_dt_double) {
		NumericType oldCREATE__TRG__trg_dt_double = creatE__TRG__trg_dt_double;
		creatE__TRG__trg_dt_double = newCREATE__TRG__trg_dt_double;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE, oldCREATE__TRG__trg_dt_double, creatE__TRG__trg_dt_double));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_float() {
		if (creatE__TRG__trg_dt_float != null && creatE__TRG__trg_dt_float.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_float = (InternalEObject)creatE__TRG__trg_dt_float;
			creatE__TRG__trg_dt_float = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_float);
			if (creatE__TRG__trg_dt_float != oldCREATE__TRG__trg_dt_float) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT, oldCREATE__TRG__trg_dt_float, creatE__TRG__trg_dt_float));
			}
		}
		return creatE__TRG__trg_dt_float;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_float() {
		return creatE__TRG__trg_dt_float;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_float(NumericType newCREATE__TRG__trg_dt_float) {
		NumericType oldCREATE__TRG__trg_dt_float = creatE__TRG__trg_dt_float;
		creatE__TRG__trg_dt_float = newCREATE__TRG__trg_dt_float;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT, oldCREATE__TRG__trg_dt_float, creatE__TRG__trg_dt_float));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_hex() {
		if (creatE__TRG__trg_dt_hex != null && creatE__TRG__trg_dt_hex.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_hex = (InternalEObject)creatE__TRG__trg_dt_hex;
			creatE__TRG__trg_dt_hex = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_hex);
			if (creatE__TRG__trg_dt_hex != oldCREATE__TRG__trg_dt_hex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX, oldCREATE__TRG__trg_dt_hex, creatE__TRG__trg_dt_hex));
			}
		}
		return creatE__TRG__trg_dt_hex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_hex() {
		return creatE__TRG__trg_dt_hex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_hex(NumericType newCREATE__TRG__trg_dt_hex) {
		NumericType oldCREATE__TRG__trg_dt_hex = creatE__TRG__trg_dt_hex;
		creatE__TRG__trg_dt_hex = newCREATE__TRG__trg_dt_hex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX, oldCREATE__TRG__trg_dt_hex, creatE__TRG__trg_dt_hex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_integer() {
		if (creatE__TRG__trg_dt_integer != null && creatE__TRG__trg_dt_integer.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_integer = (InternalEObject)creatE__TRG__trg_dt_integer;
			creatE__TRG__trg_dt_integer = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_integer);
			if (creatE__TRG__trg_dt_integer != oldCREATE__TRG__trg_dt_integer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER, oldCREATE__TRG__trg_dt_integer, creatE__TRG__trg_dt_integer));
			}
		}
		return creatE__TRG__trg_dt_integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_integer() {
		return creatE__TRG__trg_dt_integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_integer(NumericType newCREATE__TRG__trg_dt_integer) {
		NumericType oldCREATE__TRG__trg_dt_integer = creatE__TRG__trg_dt_integer;
		creatE__TRG__trg_dt_integer = newCREATE__TRG__trg_dt_integer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER, oldCREATE__TRG__trg_dt_integer, creatE__TRG__trg_dt_integer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_long() {
		if (creatE__TRG__trg_dt_long != null && creatE__TRG__trg_dt_long.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_long = (InternalEObject)creatE__TRG__trg_dt_long;
			creatE__TRG__trg_dt_long = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_long);
			if (creatE__TRG__trg_dt_long != oldCREATE__TRG__trg_dt_long) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG, oldCREATE__TRG__trg_dt_long, creatE__TRG__trg_dt_long));
			}
		}
		return creatE__TRG__trg_dt_long;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_long() {
		return creatE__TRG__trg_dt_long;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_long(NumericType newCREATE__TRG__trg_dt_long) {
		NumericType oldCREATE__TRG__trg_dt_long = creatE__TRG__trg_dt_long;
		creatE__TRG__trg_dt_long = newCREATE__TRG__trg_dt_long;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG, oldCREATE__TRG__trg_dt_long, creatE__TRG__trg_dt_long));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_longlong() {
		if (creatE__TRG__trg_dt_longlong != null && creatE__TRG__trg_dt_longlong.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_longlong = (InternalEObject)creatE__TRG__trg_dt_longlong;
			creatE__TRG__trg_dt_longlong = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_longlong);
			if (creatE__TRG__trg_dt_longlong != oldCREATE__TRG__trg_dt_longlong) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG, oldCREATE__TRG__trg_dt_longlong, creatE__TRG__trg_dt_longlong));
			}
		}
		return creatE__TRG__trg_dt_longlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_longlong() {
		return creatE__TRG__trg_dt_longlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_longlong(NumericType newCREATE__TRG__trg_dt_longlong) {
		NumericType oldCREATE__TRG__trg_dt_longlong = creatE__TRG__trg_dt_longlong;
		creatE__TRG__trg_dt_longlong = newCREATE__TRG__trg_dt_longlong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG, oldCREATE__TRG__trg_dt_longlong, creatE__TRG__trg_dt_longlong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_short() {
		if (creatE__TRG__trg_dt_short != null && creatE__TRG__trg_dt_short.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_short = (InternalEObject)creatE__TRG__trg_dt_short;
			creatE__TRG__trg_dt_short = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_short);
			if (creatE__TRG__trg_dt_short != oldCREATE__TRG__trg_dt_short) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT, oldCREATE__TRG__trg_dt_short, creatE__TRG__trg_dt_short));
			}
		}
		return creatE__TRG__trg_dt_short;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_short() {
		return creatE__TRG__trg_dt_short;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_short(NumericType newCREATE__TRG__trg_dt_short) {
		NumericType oldCREATE__TRG__trg_dt_short = creatE__TRG__trg_dt_short;
		creatE__TRG__trg_dt_short = newCREATE__TRG__trg_dt_short;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT, oldCREATE__TRG__trg_dt_short, creatE__TRG__trg_dt_short));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getCREATE__TRG__trg_dt_string() {
		if (creatE__TRG__trg_dt_string != null && creatE__TRG__trg_dt_string.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_string = (InternalEObject)creatE__TRG__trg_dt_string;
			creatE__TRG__trg_dt_string = (StringType)eResolveProxy(oldCREATE__TRG__trg_dt_string);
			if (creatE__TRG__trg_dt_string != oldCREATE__TRG__trg_dt_string) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING, oldCREATE__TRG__trg_dt_string, creatE__TRG__trg_dt_string));
			}
		}
		return creatE__TRG__trg_dt_string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType basicGetCREATE__TRG__trg_dt_string() {
		return creatE__TRG__trg_dt_string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_string(StringType newCREATE__TRG__trg_dt_string) {
		StringType oldCREATE__TRG__trg_dt_string = creatE__TRG__trg_dt_string;
		creatE__TRG__trg_dt_string = newCREATE__TRG__trg_dt_string;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING, oldCREATE__TRG__trg_dt_string, creatE__TRG__trg_dt_string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_unsigned_integer() {
		if (creatE__TRG__trg_dt_unsigned_integer != null && creatE__TRG__trg_dt_unsigned_integer.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_unsigned_integer = (InternalEObject)creatE__TRG__trg_dt_unsigned_integer;
			creatE__TRG__trg_dt_unsigned_integer = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_unsigned_integer);
			if (creatE__TRG__trg_dt_unsigned_integer != oldCREATE__TRG__trg_dt_unsigned_integer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER, oldCREATE__TRG__trg_dt_unsigned_integer, creatE__TRG__trg_dt_unsigned_integer));
			}
		}
		return creatE__TRG__trg_dt_unsigned_integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_unsigned_integer() {
		return creatE__TRG__trg_dt_unsigned_integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_unsigned_integer(NumericType newCREATE__TRG__trg_dt_unsigned_integer) {
		NumericType oldCREATE__TRG__trg_dt_unsigned_integer = creatE__TRG__trg_dt_unsigned_integer;
		creatE__TRG__trg_dt_unsigned_integer = newCREATE__TRG__trg_dt_unsigned_integer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER, oldCREATE__TRG__trg_dt_unsigned_integer, creatE__TRG__trg_dt_unsigned_integer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_unsigned_long() {
		if (creatE__TRG__trg_dt_unsigned_long != null && creatE__TRG__trg_dt_unsigned_long.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_unsigned_long = (InternalEObject)creatE__TRG__trg_dt_unsigned_long;
			creatE__TRG__trg_dt_unsigned_long = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_unsigned_long);
			if (creatE__TRG__trg_dt_unsigned_long != oldCREATE__TRG__trg_dt_unsigned_long) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG, oldCREATE__TRG__trg_dt_unsigned_long, creatE__TRG__trg_dt_unsigned_long));
			}
		}
		return creatE__TRG__trg_dt_unsigned_long;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_unsigned_long() {
		return creatE__TRG__trg_dt_unsigned_long;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_unsigned_long(NumericType newCREATE__TRG__trg_dt_unsigned_long) {
		NumericType oldCREATE__TRG__trg_dt_unsigned_long = creatE__TRG__trg_dt_unsigned_long;
		creatE__TRG__trg_dt_unsigned_long = newCREATE__TRG__trg_dt_unsigned_long;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG, oldCREATE__TRG__trg_dt_unsigned_long, creatE__TRG__trg_dt_unsigned_long));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_unsigned_longlong() {
		if (creatE__TRG__trg_dt_unsigned_longlong != null && creatE__TRG__trg_dt_unsigned_longlong.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_unsigned_longlong = (InternalEObject)creatE__TRG__trg_dt_unsigned_longlong;
			creatE__TRG__trg_dt_unsigned_longlong = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_unsigned_longlong);
			if (creatE__TRG__trg_dt_unsigned_longlong != oldCREATE__TRG__trg_dt_unsigned_longlong) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG, oldCREATE__TRG__trg_dt_unsigned_longlong, creatE__TRG__trg_dt_unsigned_longlong));
			}
		}
		return creatE__TRG__trg_dt_unsigned_longlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_unsigned_longlong() {
		return creatE__TRG__trg_dt_unsigned_longlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_unsigned_longlong(NumericType newCREATE__TRG__trg_dt_unsigned_longlong) {
		NumericType oldCREATE__TRG__trg_dt_unsigned_longlong = creatE__TRG__trg_dt_unsigned_longlong;
		creatE__TRG__trg_dt_unsigned_longlong = newCREATE__TRG__trg_dt_unsigned_longlong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG, oldCREATE__TRG__trg_dt_unsigned_longlong, creatE__TRG__trg_dt_unsigned_longlong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getCREATE__TRG__trg_dt_unsigned_short() {
		if (creatE__TRG__trg_dt_unsigned_short != null && creatE__TRG__trg_dt_unsigned_short.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_dt_unsigned_short = (InternalEObject)creatE__TRG__trg_dt_unsigned_short;
			creatE__TRG__trg_dt_unsigned_short = (NumericType)eResolveProxy(oldCREATE__TRG__trg_dt_unsigned_short);
			if (creatE__TRG__trg_dt_unsigned_short != oldCREATE__TRG__trg_dt_unsigned_short) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT, oldCREATE__TRG__trg_dt_unsigned_short, creatE__TRG__trg_dt_unsigned_short));
			}
		}
		return creatE__TRG__trg_dt_unsigned_short;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetCREATE__TRG__trg_dt_unsigned_short() {
		return creatE__TRG__trg_dt_unsigned_short;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_dt_unsigned_short(NumericType newCREATE__TRG__trg_dt_unsigned_short) {
		NumericType oldCREATE__TRG__trg_dt_unsigned_short = creatE__TRG__trg_dt_unsigned_short;
		creatE__TRG__trg_dt_unsigned_short = newCREATE__TRG__trg_dt_unsigned_short;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT, oldCREATE__TRG__trg_dt_unsigned_short, creatE__TRG__trg_dt_unsigned_short));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg getCREATE__TRG__trg_function_pkg() {
		if (creatE__TRG__trg_function_pkg != null && creatE__TRG__trg_function_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_function_pkg = (InternalEObject)creatE__TRG__trg_function_pkg;
			creatE__TRG__trg_function_pkg = (SystemFunctionPkg)eResolveProxy(oldCREATE__TRG__trg_function_pkg);
			if (creatE__TRG__trg_function_pkg != oldCREATE__TRG__trg_function_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG, oldCREATE__TRG__trg_function_pkg, creatE__TRG__trg_function_pkg));
			}
		}
		return creatE__TRG__trg_function_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg basicGetCREATE__TRG__trg_function_pkg() {
		return creatE__TRG__trg_function_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_function_pkg(SystemFunctionPkg newCREATE__TRG__trg_function_pkg) {
		SystemFunctionPkg oldCREATE__TRG__trg_function_pkg = creatE__TRG__trg_function_pkg;
		creatE__TRG__trg_function_pkg = newCREATE__TRG__trg_function_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG, oldCREATE__TRG__trg_function_pkg, creatE__TRG__trg_function_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg getCREATE__TRG__trg_interface_pkg() {
		if (creatE__TRG__trg_interface_pkg != null && creatE__TRG__trg_interface_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_interface_pkg = (InternalEObject)creatE__TRG__trg_interface_pkg;
			creatE__TRG__trg_interface_pkg = (InterfacePkg)eResolveProxy(oldCREATE__TRG__trg_interface_pkg);
			if (creatE__TRG__trg_interface_pkg != oldCREATE__TRG__trg_interface_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG, oldCREATE__TRG__trg_interface_pkg, creatE__TRG__trg_interface_pkg));
			}
		}
		return creatE__TRG__trg_interface_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg basicGetCREATE__TRG__trg_interface_pkg() {
		return creatE__TRG__trg_interface_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_interface_pkg(InterfacePkg newCREATE__TRG__trg_interface_pkg) {
		InterfacePkg oldCREATE__TRG__trg_interface_pkg = creatE__TRG__trg_interface_pkg;
		creatE__TRG__trg_interface_pkg = newCREATE__TRG__trg_interface_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG, oldCREATE__TRG__trg_interface_pkg, creatE__TRG__trg_interface_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg getCREATE__TRG__trg_mission_pkg() {
		if (creatE__TRG__trg_mission_pkg != null && creatE__TRG__trg_mission_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_mission_pkg = (InternalEObject)creatE__TRG__trg_mission_pkg;
			creatE__TRG__trg_mission_pkg = (MissionPkg)eResolveProxy(oldCREATE__TRG__trg_mission_pkg);
			if (creatE__TRG__trg_mission_pkg != oldCREATE__TRG__trg_mission_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG, oldCREATE__TRG__trg_mission_pkg, creatE__TRG__trg_mission_pkg));
			}
		}
		return creatE__TRG__trg_mission_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg basicGetCREATE__TRG__trg_mission_pkg() {
		return creatE__TRG__trg_mission_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_mission_pkg(MissionPkg newCREATE__TRG__trg_mission_pkg) {
		MissionPkg oldCREATE__TRG__trg_mission_pkg = creatE__TRG__trg_mission_pkg;
		creatE__TRG__trg_mission_pkg = newCREATE__TRG__trg_mission_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG, oldCREATE__TRG__trg_mission_pkg, creatE__TRG__trg_mission_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysisRealization getCREATE__TRG__trg_oa_realization() {
		if (creatE__TRG__trg_oa_realization != null && creatE__TRG__trg_oa_realization.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_oa_realization = (InternalEObject)creatE__TRG__trg_oa_realization;
			creatE__TRG__trg_oa_realization = (OperationalAnalysisRealization)eResolveProxy(oldCREATE__TRG__trg_oa_realization);
			if (creatE__TRG__trg_oa_realization != oldCREATE__TRG__trg_oa_realization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION, oldCREATE__TRG__trg_oa_realization, creatE__TRG__trg_oa_realization));
			}
		}
		return creatE__TRG__trg_oa_realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysisRealization basicGetCREATE__TRG__trg_oa_realization() {
		return creatE__TRG__trg_oa_realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_oa_realization(OperationalAnalysisRealization newCREATE__TRG__trg_oa_realization) {
		OperationalAnalysisRealization oldCREATE__TRG__trg_oa_realization = creatE__TRG__trg_oa_realization;
		creatE__TRG__trg_oa_realization = newCREATE__TRG__trg_oa_realization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION, oldCREATE__TRG__trg_oa_realization, creatE__TRG__trg_oa_realization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg getCREATE__TRG__trg_system_comp_pkg() {
		if (creatE__TRG__trg_system_comp_pkg != null && creatE__TRG__trg_system_comp_pkg.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trg_system_comp_pkg = (InternalEObject)creatE__TRG__trg_system_comp_pkg;
			creatE__TRG__trg_system_comp_pkg = (SystemComponentPkg)eResolveProxy(oldCREATE__TRG__trg_system_comp_pkg);
			if (creatE__TRG__trg_system_comp_pkg != oldCREATE__TRG__trg_system_comp_pkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG, oldCREATE__TRG__trg_system_comp_pkg, creatE__TRG__trg_system_comp_pkg));
			}
		}
		return creatE__TRG__trg_system_comp_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentPkg basicGetCREATE__TRG__trg_system_comp_pkg() {
		return creatE__TRG__trg_system_comp_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trg_system_comp_pkg(SystemComponentPkg newCREATE__TRG__trg_system_comp_pkg) {
		SystemComponentPkg oldCREATE__TRG__trg_system_comp_pkg = creatE__TRG__trg_system_comp_pkg;
		creatE__TRG__trg_system_comp_pkg = newCREATE__TRG__trg_system_comp_pkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG, oldCREATE__TRG__trg_system_comp_pkg, creatE__TRG__trg_system_comp_pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__unsigned_int_min_val() {
		if (creatE__TRG__unsigned_int_min_val != null && creatE__TRG__unsigned_int_min_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__unsigned_int_min_val = (InternalEObject)creatE__TRG__unsigned_int_min_val;
			creatE__TRG__unsigned_int_min_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__unsigned_int_min_val);
			if (creatE__TRG__unsigned_int_min_val != oldCREATE__TRG__unsigned_int_min_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL, oldCREATE__TRG__unsigned_int_min_val, creatE__TRG__unsigned_int_min_val));
			}
		}
		return creatE__TRG__unsigned_int_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__unsigned_int_min_val() {
		return creatE__TRG__unsigned_int_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__unsigned_int_min_val(LiteralNumericValue newCREATE__TRG__unsigned_int_min_val) {
		LiteralNumericValue oldCREATE__TRG__unsigned_int_min_val = creatE__TRG__unsigned_int_min_val;
		creatE__TRG__unsigned_int_min_val = newCREATE__TRG__unsigned_int_min_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL, oldCREATE__TRG__unsigned_int_min_val, creatE__TRG__unsigned_int_min_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__unsigned_long_min_val() {
		if (creatE__TRG__unsigned_long_min_val != null && creatE__TRG__unsigned_long_min_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__unsigned_long_min_val = (InternalEObject)creatE__TRG__unsigned_long_min_val;
			creatE__TRG__unsigned_long_min_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__unsigned_long_min_val);
			if (creatE__TRG__unsigned_long_min_val != oldCREATE__TRG__unsigned_long_min_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL, oldCREATE__TRG__unsigned_long_min_val, creatE__TRG__unsigned_long_min_val));
			}
		}
		return creatE__TRG__unsigned_long_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__unsigned_long_min_val() {
		return creatE__TRG__unsigned_long_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__unsigned_long_min_val(LiteralNumericValue newCREATE__TRG__unsigned_long_min_val) {
		LiteralNumericValue oldCREATE__TRG__unsigned_long_min_val = creatE__TRG__unsigned_long_min_val;
		creatE__TRG__unsigned_long_min_val = newCREATE__TRG__unsigned_long_min_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL, oldCREATE__TRG__unsigned_long_min_val, creatE__TRG__unsigned_long_min_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__unsigned_longlong_min_val() {
		if (creatE__TRG__unsigned_longlong_min_val != null && creatE__TRG__unsigned_longlong_min_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__unsigned_longlong_min_val = (InternalEObject)creatE__TRG__unsigned_longlong_min_val;
			creatE__TRG__unsigned_longlong_min_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__unsigned_longlong_min_val);
			if (creatE__TRG__unsigned_longlong_min_val != oldCREATE__TRG__unsigned_longlong_min_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL, oldCREATE__TRG__unsigned_longlong_min_val, creatE__TRG__unsigned_longlong_min_val));
			}
		}
		return creatE__TRG__unsigned_longlong_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__unsigned_longlong_min_val() {
		return creatE__TRG__unsigned_longlong_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__unsigned_longlong_min_val(LiteralNumericValue newCREATE__TRG__unsigned_longlong_min_val) {
		LiteralNumericValue oldCREATE__TRG__unsigned_longlong_min_val = creatE__TRG__unsigned_longlong_min_val;
		creatE__TRG__unsigned_longlong_min_val = newCREATE__TRG__unsigned_longlong_min_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL, oldCREATE__TRG__unsigned_longlong_min_val, creatE__TRG__unsigned_longlong_min_val));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue getCREATE__TRG__unsigned_short_min_val() {
		if (creatE__TRG__unsigned_short_min_val != null && creatE__TRG__unsigned_short_min_val.eIsProxy()) {
			InternalEObject oldCREATE__TRG__unsigned_short_min_val = (InternalEObject)creatE__TRG__unsigned_short_min_val;
			creatE__TRG__unsigned_short_min_val = (LiteralNumericValue)eResolveProxy(oldCREATE__TRG__unsigned_short_min_val);
			if (creatE__TRG__unsigned_short_min_val != oldCREATE__TRG__unsigned_short_min_val) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL, oldCREATE__TRG__unsigned_short_min_val, creatE__TRG__unsigned_short_min_val));
			}
		}
		return creatE__TRG__unsigned_short_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNumericValue basicGetCREATE__TRG__unsigned_short_min_val() {
		return creatE__TRG__unsigned_short_min_val;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__unsigned_short_min_val(LiteralNumericValue newCREATE__TRG__unsigned_short_min_val) {
		LiteralNumericValue oldCREATE__TRG__unsigned_short_min_val = creatE__TRG__unsigned_short_min_val;
		creatE__TRG__unsigned_short_min_val = newCREATE__TRG__unsigned_short_min_val;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL, oldCREATE__TRG__unsigned_short_min_val, creatE__TRG__unsigned_short_min_val));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX, oldCREATE__CORR__oa2ctx, creatE__CORR__oa2ctx));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX, oldCREATE__CORR__oa2ctx, creatE__CORR__oa2ctx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES:
				if (resolve) return getCREATE__SRC__src__operational_capabilities();
				return basicGetCREATE__SRC__src__operational_capabilities();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				if (resolve) return getCREATE__SRC__src_abstract_capability_pkg();
				return basicGetCREATE__SRC__src_abstract_capability_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG:
				if (resolve) return getCREATE__SRC__src_data_pkg();
				return basicGetCREATE__SRC__src_data_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				if (resolve) return getCREATE__SRC__src_entity_pkg();
				return basicGetCREATE__SRC__src_entity_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG:
				if (resolve) return getCREATE__SRC__src_function_pkg();
				return basicGetCREATE__SRC__src_function_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG:
				if (resolve) return getCREATE__SRC__src_interface_pkg();
				return basicGetCREATE__SRC__src_interface_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH:
				if (resolve) return getCREATE__SRC__src_oa_arch();
				return basicGetCREATE__SRC__src_oa_arch();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG:
				if (resolve) return getCREATE__SRC__src_role_pkg();
				return basicGetCREATE__SRC__src_role_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE:
				if (resolve) return getCREATE__TRG__bool_literal_false();
				return basicGetCREATE__TRG__bool_literal_false();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE:
				if (resolve) return getCREATE__TRG__bool_literal_true();
				return basicGetCREATE__TRG__bool_literal_true();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL:
				if (resolve) return getCREATE__TRG__byte_literal_max_val();
				return basicGetCREATE__TRG__byte_literal_max_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL:
				if (resolve) return getCREATE__TRG__byte_literal_min_val();
				return basicGetCREATE__TRG__byte_literal_min_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH:
				if (resolve) return getCREATE__TRG__char_literal_max_length();
				return basicGetCREATE__TRG__char_literal_max_length();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH:
				if (resolve) return getCREATE__TRG__char_literal_min_length();
				return basicGetCREATE__TRG__char_literal_min_length();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL:
				if (resolve) return getCREATE__TRG__hex_literal_max_val();
				return basicGetCREATE__TRG__hex_literal_max_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND:
				if (resolve) return getCREATE__TRG__hex_literal_max_val_left_operand();
				return basicGetCREATE__TRG__hex_literal_max_val_left_operand();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND:
				if (resolve) return getCREATE__TRG__hex_literal_max_val_left_operand_left_operand();
				return basicGetCREATE__TRG__hex_literal_max_val_left_operand_left_operand();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND:
				if (resolve) return getCREATE__TRG__hex_literal_max_val_left_operand_right_operand();
				return basicGetCREATE__TRG__hex_literal_max_val_left_operand_right_operand();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND:
				if (resolve) return getCREATE__TRG__hex_literal_max_val_right_operand();
				return basicGetCREATE__TRG__hex_literal_max_val_right_operand();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL:
				if (resolve) return getCREATE__TRG__hex_literal_min_val();
				return basicGetCREATE__TRG__hex_literal_min_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG:
				if (resolve) return getCREATE__TRG__trg_abstract_capability_pkg();
				return basicGetCREATE__TRG__trg_abstract_capability_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				if (resolve) return getCREATE__TRG__trg_ctx_arch();
				return basicGetCREATE__TRG__trg_ctx_arch();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG:
				if (resolve) return getCREATE__TRG__trg_data_pkg();
				return basicGetCREATE__TRG__trg_data_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN:
				if (resolve) return getCREATE__TRG__trg_dt_boolean();
				return basicGetCREATE__TRG__trg_dt_boolean();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE:
				if (resolve) return getCREATE__TRG__trg_dt_byte();
				return basicGetCREATE__TRG__trg_dt_byte();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR:
				if (resolve) return getCREATE__TRG__trg_dt_char();
				return basicGetCREATE__TRG__trg_dt_char();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG:
				if (resolve) return getCREATE__TRG__trg_dt_data_pkg();
				return basicGetCREATE__TRG__trg_dt_data_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE:
				if (resolve) return getCREATE__TRG__trg_dt_double();
				return basicGetCREATE__TRG__trg_dt_double();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT:
				if (resolve) return getCREATE__TRG__trg_dt_float();
				return basicGetCREATE__TRG__trg_dt_float();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX:
				if (resolve) return getCREATE__TRG__trg_dt_hex();
				return basicGetCREATE__TRG__trg_dt_hex();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER:
				if (resolve) return getCREATE__TRG__trg_dt_integer();
				return basicGetCREATE__TRG__trg_dt_integer();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG:
				if (resolve) return getCREATE__TRG__trg_dt_long();
				return basicGetCREATE__TRG__trg_dt_long();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG:
				if (resolve) return getCREATE__TRG__trg_dt_longlong();
				return basicGetCREATE__TRG__trg_dt_longlong();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT:
				if (resolve) return getCREATE__TRG__trg_dt_short();
				return basicGetCREATE__TRG__trg_dt_short();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING:
				if (resolve) return getCREATE__TRG__trg_dt_string();
				return basicGetCREATE__TRG__trg_dt_string();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER:
				if (resolve) return getCREATE__TRG__trg_dt_unsigned_integer();
				return basicGetCREATE__TRG__trg_dt_unsigned_integer();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG:
				if (resolve) return getCREATE__TRG__trg_dt_unsigned_long();
				return basicGetCREATE__TRG__trg_dt_unsigned_long();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG:
				if (resolve) return getCREATE__TRG__trg_dt_unsigned_longlong();
				return basicGetCREATE__TRG__trg_dt_unsigned_longlong();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT:
				if (resolve) return getCREATE__TRG__trg_dt_unsigned_short();
				return basicGetCREATE__TRG__trg_dt_unsigned_short();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG:
				if (resolve) return getCREATE__TRG__trg_function_pkg();
				return basicGetCREATE__TRG__trg_function_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG:
				if (resolve) return getCREATE__TRG__trg_interface_pkg();
				return basicGetCREATE__TRG__trg_interface_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG:
				if (resolve) return getCREATE__TRG__trg_mission_pkg();
				return basicGetCREATE__TRG__trg_mission_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION:
				if (resolve) return getCREATE__TRG__trg_oa_realization();
				return basicGetCREATE__TRG__trg_oa_realization();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG:
				if (resolve) return getCREATE__TRG__trg_system_comp_pkg();
				return basicGetCREATE__TRG__trg_system_comp_pkg();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL:
				if (resolve) return getCREATE__TRG__unsigned_int_min_val();
				return basicGetCREATE__TRG__unsigned_int_min_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL:
				if (resolve) return getCREATE__TRG__unsigned_long_min_val();
				return basicGetCREATE__TRG__unsigned_long_min_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL:
				if (resolve) return getCREATE__TRG__unsigned_longlong_min_val();
				return basicGetCREATE__TRG__unsigned_longlong_min_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL:
				if (resolve) return getCREATE__TRG__unsigned_short_min_val();
				return basicGetCREATE__TRG__unsigned_short_min_val();
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX:
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
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES:
				setCREATE__SRC__src__operational_capabilities((OperationalActivity)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				setCREATE__SRC__src_abstract_capability_pkg((OperationalCapabilityPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG:
				setCREATE__SRC__src_data_pkg((DataPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				setCREATE__SRC__src_entity_pkg((EntityPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG:
				setCREATE__SRC__src_function_pkg((OperationalActivityPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG:
				setCREATE__SRC__src_interface_pkg((InterfacePkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG:
				setCREATE__SRC__src_role_pkg((RolePkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE:
				setCREATE__TRG__bool_literal_false((LiteralBooleanValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE:
				setCREATE__TRG__bool_literal_true((LiteralBooleanValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL:
				setCREATE__TRG__byte_literal_max_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL:
				setCREATE__TRG__byte_literal_min_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH:
				setCREATE__TRG__char_literal_max_length((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH:
				setCREATE__TRG__char_literal_min_length((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL:
				setCREATE__TRG__hex_literal_max_val((BinaryExpression)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_left_operand((BinaryExpression)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_left_operand_left_operand((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_left_operand_right_operand((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_right_operand((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL:
				setCREATE__TRG__hex_literal_min_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG:
				setCREATE__TRG__trg_abstract_capability_pkg((CapabilityPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				setCREATE__TRG__trg_ctx_arch((SystemAnalysis)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG:
				setCREATE__TRG__trg_data_pkg((DataPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN:
				setCREATE__TRG__trg_dt_boolean((BooleanType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE:
				setCREATE__TRG__trg_dt_byte((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR:
				setCREATE__TRG__trg_dt_char((StringType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG:
				setCREATE__TRG__trg_dt_data_pkg((DataPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE:
				setCREATE__TRG__trg_dt_double((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT:
				setCREATE__TRG__trg_dt_float((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX:
				setCREATE__TRG__trg_dt_hex((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER:
				setCREATE__TRG__trg_dt_integer((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG:
				setCREATE__TRG__trg_dt_long((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG:
				setCREATE__TRG__trg_dt_longlong((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT:
				setCREATE__TRG__trg_dt_short((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING:
				setCREATE__TRG__trg_dt_string((StringType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER:
				setCREATE__TRG__trg_dt_unsigned_integer((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG:
				setCREATE__TRG__trg_dt_unsigned_long((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG:
				setCREATE__TRG__trg_dt_unsigned_longlong((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT:
				setCREATE__TRG__trg_dt_unsigned_short((NumericType)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG:
				setCREATE__TRG__trg_function_pkg((SystemFunctionPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG:
				setCREATE__TRG__trg_interface_pkg((InterfacePkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG:
				setCREATE__TRG__trg_mission_pkg((MissionPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION:
				setCREATE__TRG__trg_oa_realization((OperationalAnalysisRealization)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG:
				setCREATE__TRG__trg_system_comp_pkg((SystemComponentPkg)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL:
				setCREATE__TRG__unsigned_int_min_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL:
				setCREATE__TRG__unsigned_long_min_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL:
				setCREATE__TRG__unsigned_longlong_min_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL:
				setCREATE__TRG__unsigned_short_min_val((LiteralNumericValue)newValue);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX:
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
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES:
				setCREATE__SRC__src__operational_capabilities((OperationalActivity)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				setCREATE__SRC__src_abstract_capability_pkg((OperationalCapabilityPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG:
				setCREATE__SRC__src_data_pkg((DataPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				setCREATE__SRC__src_entity_pkg((EntityPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG:
				setCREATE__SRC__src_function_pkg((OperationalActivityPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG:
				setCREATE__SRC__src_interface_pkg((InterfacePkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH:
				setCREATE__SRC__src_oa_arch((OperationalAnalysis)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG:
				setCREATE__SRC__src_role_pkg((RolePkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE:
				setCREATE__TRG__bool_literal_false((LiteralBooleanValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE:
				setCREATE__TRG__bool_literal_true((LiteralBooleanValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL:
				setCREATE__TRG__byte_literal_max_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL:
				setCREATE__TRG__byte_literal_min_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH:
				setCREATE__TRG__char_literal_max_length((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH:
				setCREATE__TRG__char_literal_min_length((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL:
				setCREATE__TRG__hex_literal_max_val((BinaryExpression)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_left_operand((BinaryExpression)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_left_operand_left_operand((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_left_operand_right_operand((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND:
				setCREATE__TRG__hex_literal_max_val_right_operand((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL:
				setCREATE__TRG__hex_literal_min_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG:
				setCREATE__TRG__trg_abstract_capability_pkg((CapabilityPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				setCREATE__TRG__trg_ctx_arch((SystemAnalysis)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG:
				setCREATE__TRG__trg_data_pkg((DataPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN:
				setCREATE__TRG__trg_dt_boolean((BooleanType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE:
				setCREATE__TRG__trg_dt_byte((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR:
				setCREATE__TRG__trg_dt_char((StringType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG:
				setCREATE__TRG__trg_dt_data_pkg((DataPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE:
				setCREATE__TRG__trg_dt_double((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT:
				setCREATE__TRG__trg_dt_float((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX:
				setCREATE__TRG__trg_dt_hex((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER:
				setCREATE__TRG__trg_dt_integer((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG:
				setCREATE__TRG__trg_dt_long((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG:
				setCREATE__TRG__trg_dt_longlong((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT:
				setCREATE__TRG__trg_dt_short((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING:
				setCREATE__TRG__trg_dt_string((StringType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER:
				setCREATE__TRG__trg_dt_unsigned_integer((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG:
				setCREATE__TRG__trg_dt_unsigned_long((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG:
				setCREATE__TRG__trg_dt_unsigned_longlong((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT:
				setCREATE__TRG__trg_dt_unsigned_short((NumericType)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG:
				setCREATE__TRG__trg_function_pkg((SystemFunctionPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG:
				setCREATE__TRG__trg_interface_pkg((InterfacePkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG:
				setCREATE__TRG__trg_mission_pkg((MissionPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION:
				setCREATE__TRG__trg_oa_realization((OperationalAnalysisRealization)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG:
				setCREATE__TRG__trg_system_comp_pkg((SystemComponentPkg)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL:
				setCREATE__TRG__unsigned_int_min_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL:
				setCREATE__TRG__unsigned_long_min_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL:
				setCREATE__TRG__unsigned_longlong_min_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL:
				setCREATE__TRG__unsigned_short_min_val((LiteralNumericValue)null);
				return;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX:
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
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OPERATIONAL_CAPABILITIES:
				return creatE__SRC__src__operational_capabilities != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ABSTRACT_CAPABILITY_PKG:
				return creatE__SRC__src_abstract_capability_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_DATA_PKG:
				return creatE__SRC__src_data_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ENTITY_PKG:
				return creatE__SRC__src_entity_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_FUNCTION_PKG:
				return creatE__SRC__src_function_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_INTERFACE_PKG:
				return creatE__SRC__src_interface_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_OA_ARCH:
				return creatE__SRC__src_oa_arch != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_SRC_SRC_ROLE_PKG:
				return creatE__SRC__src_role_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_FALSE:
				return creatE__TRG__bool_literal_false != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BOOL_LITERAL_TRUE:
				return creatE__TRG__bool_literal_true != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MAX_VAL:
				return creatE__TRG__byte_literal_max_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_BYTE_LITERAL_MIN_VAL:
				return creatE__TRG__byte_literal_min_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MAX_LENGTH:
				return creatE__TRG__char_literal_max_length != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_CHAR_LITERAL_MIN_LENGTH:
				return creatE__TRG__char_literal_min_length != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL:
				return creatE__TRG__hex_literal_max_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND:
				return creatE__TRG__hex_literal_max_val_left_operand != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_LEFT_OPERAND:
				return creatE__TRG__hex_literal_max_val_left_operand_left_operand != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_LEFT_OPERAND_RIGHT_OPERAND:
				return creatE__TRG__hex_literal_max_val_left_operand_right_operand != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MAX_VAL_RIGHT_OPERAND:
				return creatE__TRG__hex_literal_max_val_right_operand != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_HEX_LITERAL_MIN_VAL:
				return creatE__TRG__hex_literal_min_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_ABSTRACT_CAPABILITY_PKG:
				return creatE__TRG__trg_abstract_capability_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_CTX_ARCH:
				return creatE__TRG__trg_ctx_arch != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DATA_PKG:
				return creatE__TRG__trg_data_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BOOLEAN:
				return creatE__TRG__trg_dt_boolean != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_BYTE:
				return creatE__TRG__trg_dt_byte != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_CHAR:
				return creatE__TRG__trg_dt_char != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DATA_PKG:
				return creatE__TRG__trg_dt_data_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_DOUBLE:
				return creatE__TRG__trg_dt_double != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_FLOAT:
				return creatE__TRG__trg_dt_float != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_HEX:
				return creatE__TRG__trg_dt_hex != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_INTEGER:
				return creatE__TRG__trg_dt_integer != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONG:
				return creatE__TRG__trg_dt_long != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_LONGLONG:
				return creatE__TRG__trg_dt_longlong != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_SHORT:
				return creatE__TRG__trg_dt_short != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_STRING:
				return creatE__TRG__trg_dt_string != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_INTEGER:
				return creatE__TRG__trg_dt_unsigned_integer != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONG:
				return creatE__TRG__trg_dt_unsigned_long != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_LONGLONG:
				return creatE__TRG__trg_dt_unsigned_longlong != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_DT_UNSIGNED_SHORT:
				return creatE__TRG__trg_dt_unsigned_short != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_FUNCTION_PKG:
				return creatE__TRG__trg_function_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_INTERFACE_PKG:
				return creatE__TRG__trg_interface_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_MISSION_PKG:
				return creatE__TRG__trg_mission_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_OA_REALIZATION:
				return creatE__TRG__trg_oa_realization != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_TRG_SYSTEM_COMP_PKG:
				return creatE__TRG__trg_system_comp_pkg != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_INT_MIN_VAL:
				return creatE__TRG__unsigned_int_min_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONG_MIN_VAL:
				return creatE__TRG__unsigned_long_min_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_LONGLONG_MIN_VAL:
				return creatE__TRG__unsigned_longlong_min_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_TRG_UNSIGNED_SHORT_MIN_VAL:
				return creatE__TRG__unsigned_short_min_val != null;
			case Oa2CtxPackage.INITIAL_MODEL_CREATION_OWNED_DATA_PKG_MARKER__CREATE_CORR_OA2CTX:
				return creatE__CORR__oa2ctx != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialModelCreation_ownedDataPkg__MarkerImpl
