package org.emoflon.ibex.tgg.operational.csp.constraints.custom.oa2ctx;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_set_boolean_to_value_if_not_bound extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint set_boolean_to_value_if_not_bound(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -SET_BOOLEAN_TO_VALUE_IF_NOT_BOUND- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

	  	switch(bindingStates) {
		  	case "BB": setSatisfied(true);break;
	  		case "FB": v0.bindToValue(v1.getValue()); setSatisfied(true);break;
	  		case "BF": setSatisfied(true);break;
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
  		 	}
	  	}
}

