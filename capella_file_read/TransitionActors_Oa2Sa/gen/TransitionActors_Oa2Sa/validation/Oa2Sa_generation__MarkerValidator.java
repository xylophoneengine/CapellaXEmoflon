/**
 *
 * $Id$
 */
package TransitionActors_Oa2Sa.validation;

import TransitionActors_Oa2Sa.Oa2Sa;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;

import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 * A sample validator interface for {@link TransitionActors_Oa2Sa.Oa2Sa_generation__Marker}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Oa2Sa_generation__MarkerValidator {
	boolean validate();

	boolean validateCREATE__SRC__src_oa_arch(OperationalAnalysis value);
	boolean validateCREATE__TRG__trg_sa_arch(SystemAnalysis value);
	boolean validateCREATE__CORR__new_oa2sa(Oa2Sa value);
}
