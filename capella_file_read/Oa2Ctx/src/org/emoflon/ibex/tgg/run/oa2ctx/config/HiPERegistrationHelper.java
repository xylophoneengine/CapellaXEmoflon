package org.emoflon.ibex.tgg.run.oa2ctx.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.oa2ctx.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.polarsys.capella.common.data.activity.impl.ActivityPackageImpl;
import org.polarsys.capella.common.data.behavior.impl.BehaviorPackageImpl;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.data.modellingcore.impl.ModellingcorePackageImpl;
import org.polarsys.capella.common.libraries.LibrariesPackage;
import org.polarsys.capella.common.libraries.impl.LibrariesPackageImpl;
import org.polarsys.capella.common.re.RePackage;
import org.polarsys.capella.common.re.impl.RePackageImpl;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacommon.impl.CapellacommonPackageImpl;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.impl.CapellacorePackageImpl;
import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.capellamodeller.impl.CapellamodellerPackageImpl;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.cs.impl.CsPackageImpl;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.ctx.impl.CtxPackageImpl;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.epbs.impl.EpbsPackageImpl;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.impl.FaPackageImpl;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;
import org.polarsys.capella.core.data.information.datatype.DatatypePackage;
import org.polarsys.capella.core.data.information.datavalue.DatavaluePackage;
import org.polarsys.capella.core.data.information.impl.InformationPackageImpl;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.interaction.impl.InteractionPackageImpl;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.la.impl.LaPackageImpl;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.impl.OaFactoryImpl;
import org.polarsys.capella.core.data.oa.impl.OaPackageImpl;
import org.polarsys.capella.core.data.oa.impl.OperationalCapabilityPkgImpl;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.pa.deployment.DeploymentPackage;
import org.polarsys.capella.core.data.pa.impl.PaPackageImpl;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.requirement.impl.RequirementPackageImpl;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;
import org.polarsys.capella.core.data.sharedmodel.impl.SharedmodelPackageImpl;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.emde.model.impl.EmdePackageImpl;

import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.impl.Oa2CtxPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {

		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		init_Epackages(rs, executable);
		
		Registry reg = rs.getPackageRegistry();
		
		// Load and register source and target metamodels
		EPackage oaPack = null;
		EPackage ctxPack = null;
		EPackage oa2ctxPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore");
			ctxPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Oa2Ctx/model/Oa2Ctx.ecore");
			oa2ctxPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore");
			oaPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Oa2Ctx/model/Oa2Ctx.ecore");
			oa2ctxPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(oaPack == null)
			oaPack = OaPackageImpl.init();
				
		if(ctxPack == null)
			ctxPack = CtxPackageImpl.init();
		
		if(oa2ctxPack == null) {
			oa2ctxPack = Oa2CtxPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Oa2Ctx/model/Oa2Ctx.ecore", Oa2CtxPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Oa2Ctx/model/Oa2Ctx.ecore", Oa2CtxPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore", oaPack);
	    rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore", oaPack);	
			
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore", ctxPack);
		rs.getPackageRegistry().put("platform:/plugin/org.polarsys.capella.core.data.gen/model/Contextarchitecture.ecore", ctxPack);
		
		test_capability_pkg_creation();
	}

	public static void check_register_for_given_packages(Registry reg, String[] uris, EPackage[] packages) {
		boolean uri_missing_flag = false;
		boolean epackage_missing_flag = false;
		
		for(String uri : uris) {
			String plugin_uri = "platform:/plugin/" + uri;
			String res_uri = "platform:/resource/" + uri;
			if(!reg.containsKey(plugin_uri) || !reg.containsKey(res_uri)) {
				System.out.println(uri + " was not registered properly");
				uri_missing_flag = true;
			}
		}
		if(!uri_missing_flag) for(int i = 0; i < packages.length; i++) {
			EPackage pack = packages[i];
			if(!reg.containsValue(pack)) {
				System.out.println(pack.getName() + " was not registered.");
				epackage_missing_flag = true;
			}
		}

		System.out.println("All uris were registered:" + !uri_missing_flag);
		System.out.println("All EPackages were registered:" + !epackage_missing_flag);

		if(!epackage_missing_flag && !uri_missing_flag) System.out.println("\nRegistration was successful.\n");
		else System.out.println("\nPackage registration failed.\n");
	}

	/**
	 * Method for debugging purposes
	 */
	public static void test_capability_pkg_creation() {
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
		System.out.println("set and generically accessible: " + oac.eGet(name_attr).equals(new_name));
		System.out.println();
	}

	public static void init_Epackages(ResourceSet rs, IbexExecutable executable) {
		System.out.println("Now initializing EPackages\n\n");

		EmdePackage.eINSTANCE.eClass();
		
		System.out.println("registering all capella meta models");
		EPackage emde = EmdePackageImpl.init();
		String emde_ecore = new String("org.polarsys.kitalpha.emde/model/eMDE.ecore");
		rs.getPackageRegistry().put("platform:/resource/" + emde_ecore, emde);
	    rs.getPackageRegistry().put("platform:/plugin/" + emde_ecore, emde);
	    
		String[] ecores = {
				"org.polarsys.capella.core.data.gen/model/CapellaCommon.ecore",
				"org.polarsys.capella.core.data.gen/model/CapellaCore.ecore",
				"org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore",
				"org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore",
//				"org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore", // loaded by emoflon
				"org.polarsys.capella.core.data.gen/model/EPBSArchitecture.ecore",
				"org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore",
				"org.polarsys.capella.core.data.gen/model/Information.ecore",
				"org.polarsys.capella.core.data.gen/model/Interaction.ecore",
				"org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore",
//				"org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore", // loaded by emoflon
				"org.polarsys.capella.core.data.gen/model/PhysicalArchitecture.ecore",
				"org.polarsys.capella.core.data.gen/model/Requirement.ecore",
				"org.polarsys.capella.core.data.gen/model/SharedModel.ecore",
				"org.polarsys.capella.common.data.activity.gen/model/Activity.ecore",
				"org.polarsys.capella.common.data.behavior.gen/model/Behavior.ecore",
				"org.polarsys.capella.common.data.core.gen/model/ModellingCore.ecore",
				"org.polarsys.capella.common.libraries.gen/model/libraries.ecore",
				"org.polarsys.capella.common.re.gen/model/re.ecore",
		};
		
		EPackage[] paks = {
				CapellacommonPackageImpl.init(),
				CapellacorePackageImpl.init(),
				CapellamodellerPackageImpl.init(),
				CsPackageImpl.init(),
//				CtxPackageImpl.init(), // loaded by emoflon
				EpbsPackageImpl.init(),
				FaPackageImpl.init(),
				InformationPackageImpl.init(),
				InteractionPackageImpl.init(),
				LaPackageImpl.init(),
//				OaPackageImpl.init(), // loaded by emoflon
				PaPackageImpl.init(),
				RequirementPackageImpl.init(),
				SharedmodelPackageImpl.init(),
				ActivityPackageImpl.init(),
				BehaviorPackageImpl.init(),
				ModellingcorePackageImpl.init(),
				LibrariesPackageImpl.init(),
				RePackageImpl.init(),
		};
		EPackage oaPack;
		for(int i =0 ; i < ecores.length; i++) {
			try {
				String ecore = ecores[i];
				Resource res = executable.getResourceHandler().loadResource("platform:/resource/" + ecore);
				EPackage ePack = (EPackage) res.getContents().get(0);
				rs.getResources().remove(res);
				if(ePack == null) oaPack = paks[i];
				rs.getPackageRegistry().put("platform:/resource/" + ecore, paks[i]);
			    rs.getPackageRegistry().put("platform:/plugin/" + ecore, paks[i]);
			}
			catch(Exception e) {
				System.out.println("Registration failed.");
				e.printStackTrace();
			}
		}
		check_register_for_given_packages(rs.getPackageRegistry(), ecores, paks);
		
	}
	

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Oa2Ctx");
		options.project.path("Oa2Ctx");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
