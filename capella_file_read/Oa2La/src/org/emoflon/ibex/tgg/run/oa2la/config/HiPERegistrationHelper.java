package org.emoflon.ibex.tgg.run.oa2la.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.oa2la.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Oa2La.Oa2LaPackage;
import Oa2La.impl.Oa2LaPackageImpl;
import <<SRC_Package>>.impl.<<SRC_Package>>PackageImpl;
import <<TRG_Package>>.impl.<<TRG_Package>>PackageImpl;

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
		EPackage <<src_project>>Pack = null;
		EPackage <<trg_project>>Pack = null;
		EPackage oa2laPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/<<TRG_Project>>/model/<<TRG_Project>>.ecore");
			<<trg_project>>Pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Oa2La/model/Oa2La.ecore");
			oa2laPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/<<SRC_Project>>/model/<<SRC_Project>>.ecore");
			<<src_project>>Pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Oa2La/model/Oa2La.ecore");
			oa2laPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(<<src_project>>Pack == null)
			<<src_project>>Pack = <<SRC_Package>>PackageImpl.init();
				
		if(<<trg_project>>Pack == null)
			<<trg_project>>Pack = <<TRG_Package>>PackageImpl.init();
		
		if(oa2laPack == null) {
			oa2laPack = Oa2LaPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Oa2La/model/Oa2La.ecore", Oa2LaPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Oa2La/model/Oa2La.ecore", Oa2LaPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/<<SRC_Project>>/model/<<SRC_Project>>.ecore", <<src_project>>Pack);
	    rs.getPackageRegistry().put("platform:/plugin/<<SRC_Project>>/model/<<SRC_Project>>.ecore", <<src_project>>Pack);	
			
		rs.getPackageRegistry().put("platform:/resource/<<TRG_Project>>/model/<<TRG_Project>>.ecore", <<trg_project>>Pack);
		rs.getPackageRegistry().put("platform:/plugin/<<TRG_Project>>/model/<<TRG_Project>>.ecore", <<trg_project>>Pack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Oa2La");
		options.project.path("Oa2La");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
