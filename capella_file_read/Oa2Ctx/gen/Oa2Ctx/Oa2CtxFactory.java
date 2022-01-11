/**
 */
package Oa2Ctx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Oa2Ctx.Oa2CtxPackage
 * @generated
 */
public interface Oa2CtxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Oa2CtxFactory eINSTANCE = Oa2Ctx.impl.Oa2CtxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operational Analysis2 System Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Analysis2 System Analysis</em>'.
	 * @generated
	 */
	OperationalAnalysis2SystemAnalysis createOperationalAnalysis2SystemAnalysis();

	/**
	 * Returns a new object of class '<em>Operational Analysis2 System Analysis Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Analysis2 System Analysis Marker</em>'.
	 * @generated
	 */
	OperationalAnalysis2SystemAnalysis__Marker createOperationalAnalysis2SystemAnalysis__Marker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Oa2CtxPackage getOa2CtxPackage();

} //Oa2CtxFactory
