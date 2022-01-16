package org.emoflon.ibex.tgg.operational.csp.constraints.factories.oa2ctx;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.oa2ctx.UserDefined_set_string_to_value_if_not_bound;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("set_string_to_value_if_not_bound", () -> new UserDefined_set_string_to_value_if_not_bound());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
