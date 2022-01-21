/**
 *
 * $Id$
 */
package TransitionActors_Oa2Sa.validation;

import TransitionActors_Oa2Sa.Entity2SystemComponent;
import TransitionActors_Oa2Sa.Oa2Sa;

import org.polarsys.capella.core.data.cs.Part;

import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemComponent;
import org.polarsys.capella.core.data.ctx.SystemComponentPkg;

import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;

/**
 * A sample validator interface for {@link TransitionActors_Oa2Sa.Oa2Sa_transition_actors__Marker}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Oa2Sa_transition_actors__MarkerValidator {
	boolean validate();

	boolean validateCONTEXT__SRC__src_entity_pkg(EntityPkg value);
	boolean validateCONTEXT__SRC__src_oa_arch(OperationalAnalysis value);
	boolean validateCREATE__SRC__src_oa_entity(Entity value);
	boolean validateCREATE__SRC__src_oa_part(Part value);
	boolean validateCONTEXT__TRG__trg_componenet_pkg(SystemComponentPkg value);
	boolean validateCONTEXT__TRG__trg_sa_arch(SystemAnalysis value);
	boolean validateCREATE__TRG__trg_sys_component(SystemComponent value);
	boolean validateCREATE__TRG__trg_sys_part(Part value);
	boolean validateCREATE__CORR__entity2component(Entity2SystemComponent value);
	boolean validateCONTEXT__CORR__oa2sa(Oa2Sa value);
}
