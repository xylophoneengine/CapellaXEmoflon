package capella.registration.helper;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.polarsys.capella.common.libraries.LibrariesPackage;
import org.polarsys.capella.common.re.RePackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecture;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.impl.ProjectImpl;
import org.polarsys.capella.core.data.capellamodeller.impl.SystemEngineeringImpl;
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
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

public class RegisterHelper {
	
	public static String instances_path = "instances/";
	
	private void init_Epackages() {
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
	
	public RegisterHelper() {
		init_Epackages();
	}
	
	public static void main(String[] args) {
		RegisterHelper reg = new RegisterHelper();
		String p_name = "ToyCatapult.capella";
		//String p_name = "In-Flight Entertainment System.capella";
		ProjectImpl p = reg.loadCapellaFile(instances_path + p_name, "capella");
		SystemEngineeringImpl se = (SystemEngineeringImpl) p.getOwnedModelRoots().get(0);

		// save xmi for architectures
		for(ModellingArchitecture struct : se.getOwnedArchitectures()) {
			reg.saveModellingArchitecture(struct);
		}
		
		// save capella project
		//reg.saveCapellaFile(se, "project_renamed");

		System.out.println("EOF");
	}

	public void saveCapellaFile(SystemEngineeringImpl se, String name) {
		String extension = "capella";
		String filename = instances_path + name + "." + extension;

		Resource.Factory.Registry re = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = re.getExtensionToFactoryMap();
        m.put(extension, new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();

        Resource resource = resSet.createResource(URI.createURI(filename));
        resource.getContents().add(se);

        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println(filename + " saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(filename + " saving failed!");
        }
	}
	
	public void saveModellingArchitecture(ModellingArchitecture struct) {
		String[] name_split = struct.getClass().getName().split("\\.");
		String name = name_split[name_split.length - 1].replace("Impl", "");

		String extension = "xmi";
		String filename = instances_path + name + "." + extension;

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(extension, new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();

        Resource resource = resSet.createResource(URI.createURI(filename));
        resource.getContents().add(struct);

        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println(filename + " saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(filename + " saving failed!");
        }
	}
	
	public ProjectImpl loadCapellaFile(String rel_path, String file_extension) {
		System.out.println("Parsing model instance " + rel_path);
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(file_extension, new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createURI(rel_path), true);
        return (ProjectImpl) resource.getContents().get(0);
	}
}
