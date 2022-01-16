package org.emoflon.ibex.tgg.run.oa2ctx.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
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
import org.polarsys.capella.common.data.modellingcore.impl.ModellingcorePackageImpl;
import org.polarsys.capella.common.libraries.impl.LibrariesPackageImpl;
import org.polarsys.capella.common.re.impl.RePackageImpl;
import org.polarsys.capella.core.data.capellacommon.impl.CapellacommonPackageImpl;
import org.polarsys.capella.core.data.capellacore.impl.CapellacorePackageImpl;
import org.polarsys.capella.core.data.capellamodeller.impl.CapellamodellerPackageImpl;
import org.polarsys.capella.core.data.cs.impl.CsPackageImpl;
import org.polarsys.capella.core.data.ctx.impl.CtxPackageImpl;
import org.polarsys.capella.core.data.epbs.impl.EpbsPackageImpl;
import org.polarsys.capella.core.data.fa.impl.FaPackageImpl;
import org.polarsys.capella.core.data.information.impl.InformationPackageImpl;
import org.polarsys.capella.core.data.interaction.impl.InteractionPackageImpl;
import org.polarsys.capella.core.data.la.impl.LaPackageImpl;
import org.polarsys.capella.core.data.oa.impl.OaPackageImpl;
import org.polarsys.capella.core.data.pa.impl.PaPackageImpl;
import org.polarsys.capella.core.data.requirement.impl.RequirementPackageImpl;
import org.polarsys.capella.core.data.sharedmodel.impl.SharedmodelPackageImpl;
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
				//"org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore",
				"org.polarsys.capella.core.data.gen/model/EPBSArchitecture.ecore",
				"org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore",
				"org.polarsys.capella.core.data.gen/model/Information.ecore",
				"org.polarsys.capella.core.data.gen/model/Interaction.ecore",
				"org.polarsys.capella.core.data.gen/model/LogicalArchitecture.ecore",
				//"org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore",
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
				//CtxPackageImpl.init(),
				EpbsPackageImpl.init(),
				FaPackageImpl.init(),
				InformationPackageImpl.init(),
				InteractionPackageImpl.init(),
				LaPackageImpl.init(),
				//OaPackageImpl.init(),
				PaPackageImpl.init(),
				RequirementPackageImpl.init(),
				SharedmodelPackageImpl.init(),
				ActivityPackageImpl.init(),
				BehaviorPackageImpl.init(),
				ModellingcorePackageImpl.init(),
				LibrariesPackageImpl.init(),
				RePackageImpl.init(),
		};
		
		for(int i =0 ; i < paks.length; i++) {
			try {
				String ecore = ecores[i];
				Resource res = executable.getResourceHandler().loadResource("platform:/resource/" + ecore);
				EPackage ePack = (EPackage) res.getContents().get(0);
				rs.getResources().remove(res);
				if(ePack == null) oaPack = paks[i];
				rs.getPackageRegistry().put("platform:/resource/" + ecore, ePack);
			    rs.getPackageRegistry().put("platform:/plugin/" + ecore, ePack);
			}
			catch(Exception e) {
				System.out.println("Registration failed.");
				e.printStackTrace();
			}
		}
	    
//		CapellacommonPackage.eINSTANCE.eClass();
//		CapellacorePackage.eINSTANCE.eClass();
//		CapellamodellerPackage.eINSTANCE.eClass();
//		CsPackage.eINSTANCE.eClass();
//		EpbsPackage.eINSTANCE.eClass();
//		CtxPackage.eINSTANCE.eClass();
//		FaPackage.eINSTANCE.eClass();
//		InformationPackage.eINSTANCE.eClass();
//		CommunicationPackage.eINSTANCE.eClass();
//		DatatypePackage.eINSTANCE.eClass();
//		DatavaluePackage.eINSTANCE.eClass();
//		InteractionPackage.eINSTANCE.eClass();
//		LaPackage.eINSTANCE.eClass();
//		OaPackage.eINSTANCE.eClass();
//		PaPackage.eINSTANCE.eClass();
//		DeploymentPackage.eINSTANCE.eClass();
//		RequirementPackage.eINSTANCE.eClass();
//		SharedmodelPackage.eINSTANCE.eClass();
//		LibrariesPackage.eINSTANCE.eClass();
//		RePackage.eINSTANCE.eClass();
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
