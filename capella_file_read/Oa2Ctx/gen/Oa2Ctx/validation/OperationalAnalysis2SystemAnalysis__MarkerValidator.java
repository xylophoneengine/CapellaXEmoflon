/**
 *
 * $Id$
 */
package Oa2Ctx.validation;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 * A sample validator interface for {@link Oa2Ctx.OperationalAnalysis2SystemAnalysis__Marker}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationalAnalysis2SystemAnalysis__MarkerValidator {
	boolean validate();

	boolean validateCREATE__SRC__oa_arch(OperationalAnalysis value);
	boolean validateCREATE__TRG__ctx_arch(SystemAnalysis value);
}
