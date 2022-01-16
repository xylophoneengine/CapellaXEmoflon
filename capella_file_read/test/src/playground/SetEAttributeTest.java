package playground;

import org.eclipse.emf.ecore.EAttribute;
import org.polarsys.capella.common.libraries.LibrariesPackage;
import org.polarsys.capella.common.re.RePackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;
import org.polarsys.capella.core.data.information.datatype.DatatypePackage;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.impl.OperationalCapabilityPkgImpl;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

public class SetEAttributeTest {
	public static void init_Epackages() {
		System.out.println("Now initializing EPackages");
		CapellacommonPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CommunicationPackage.eINSTANCE.eClass();
		DatatypePackage.eINSTANCE.eClass();
		DatavaluePackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		DeploymentPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		LibrariesPackage.eINSTANCE.eClass();
		RePackage.eINSTANCE.eClass();
	}
	
	public static void main(String[] args) {
		init_Epackages();
		OperationalCapabilityPkgImpl oac = (OperationalCapabilityPkgImpl) OaPackage.eINSTANCE.getEFactoryInstance().create(OaPackage.eINSTANCE.getOperationalCapabilityPkg());
//		EAttribute ea = OaPackage.eINSTANCE.getOperationalCapabilityPkg()
		
		EAttribute name_attr = null;
		System.out.println(name_attr);
		String new_name = new String("wabba");
		oac.eSet(name_attr, new_name);
		System.out.println("attribute set: " + oac.getName().equals(new_name));
	}
}
