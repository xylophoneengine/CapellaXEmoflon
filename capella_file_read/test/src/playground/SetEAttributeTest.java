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
import org.polarsys.capella.core.data.oa.impl.OaFactoryImpl;
import org.polarsys.capella.core.data.oa.impl.OaPackageImpl;
import org.polarsys.capella.core.data.oa.impl.OperationalAnalysisImpl;
import org.polarsys.capella.core.data.oa.impl.OperationalCapabilityPkgImpl;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

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
		EmdePackage.eINSTANCE.eClass();
	}
	
	public static void main(String[] args) {
		init_Epackages();

		OaPackageImpl oa_pack = (OaPackageImpl) OaPackage.eINSTANCE;
		OaFactoryImpl factory = (OaFactoryImpl) oa_pack.getEFactoryInstance();

		System.out.println("Creating an OperationalCapabilityPkg");
		OperationalCapabilityPkgImpl oac = (OperationalCapabilityPkgImpl) factory.create(oa_pack.getOperationalCapabilityPkg());
		
		// get EClass of "name" EAttribute
		EAttribute name_attr = null;
		for(EAttribute e: oac.eClass().getEAllAttributes()) {
			if(e.getName().equals(new String("name"))) name_attr = e;
		}

		// set the attribute
		String new_name = new String("wabba");
		System.out.println("Setting its name to: " + new_name);
		oac.eSet(name_attr, new_name);
		System.out.println("attribute set: " + oac.getName().equals(new_name));

		Object attr_of_interest = oac.eGet(name_attr);
		System.out.println("DEBUGGING: " + attr_of_interest);
		
		

		// create an OperationalAnalysis object
		OperationalAnalysisImpl oa = (OperationalAnalysisImpl) factory.create(oa_pack.getOperationalAnalysis());
		
		OperationalCapabilityPkgImpl ocpi = (OperationalCapabilityPkgImpl)
				factory.create(oa_pack.getOperationalCapabilityPkg());
		
		oa.setOwnedAbstractCapabilityPkg(ocpi);

		System.out.println(oa.getOwnedAbstractCapabilityPkg());
	}
}
