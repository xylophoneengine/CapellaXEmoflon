package org.emoflon.ibex.tgg.run.oa2ctx.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.oa2ctx.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Oa2Ctx.Oa2CtxPackage;
import Oa2Ctx.impl.Oa2CtxPackageImpl;
import org.polarsys.capella.core.data.oa.impl.OaPackageImpl;
import org.polarsys.capella.core.data.ctx.impl.CtxPackageImpl;

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
	    rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/OperationalAnalysis.ecore", oaPack);	
			
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/ContextArchitecture.ecore", ctxPack);
		rs.getPackageRegistry().put("platform:/resource/org.polarsys.capella.core.data.gen/model/Contextarchitecture.ecore", ctxPack);
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
