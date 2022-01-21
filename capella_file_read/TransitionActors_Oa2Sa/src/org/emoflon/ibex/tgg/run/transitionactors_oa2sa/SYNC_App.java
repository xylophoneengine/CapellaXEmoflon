package org.emoflon.ibex.tgg.run.transitionactors_oa2sa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.operational.strategies.opt.CO;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.INITIAL_BWD;
import org.emoflon.ibex.tgg.operational.strategies.sync.INITIAL_FWD;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.transitionactors_oa2sa.config._DefaultRegistrationHelper;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.behavior.BehaviorPackage;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
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
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import language.TGG;
import language.TGGRule;
import language.TGGRuleEdge;
import language.TGGRuleNode;

public class SYNC_App extends SYNC {

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App() throws IOException {
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			
			
			
			@Override
			public void saveModels() throws IOException {
				// Use the commented code below to implement saveModels individually.
				// source.save(null);
				// target.save(null);
				// corr.save(null);
				// protocol.save(null);
				
				super.saveModels();
			}
			
//			@Override
//			public void loadModels() throws IOException {
//				// Use the commented code below to implement loadModels individually.
//				// loadResource loads from a file while createResource creates a new resource without content
//				// source = loadResource(options.project.path() + "/instances/src.xmi");
//				// target = createResource(options.project.path() + "/instances/trg.xmi");
//				// corr = createResource(options.project.path() + "/instances/corr.xmi");
//				// protocol = createResource(options.project.path() + "/instances/protocol.xmi");
//				super.loadModels();
//			}
			
			private static boolean epaks_are_initied = false;
			
			private void init_epaks_for_resource_loading() {
				if (epaks_are_initied) return;
				try {
					this.registrationHelper.registerMetamodels(this.rs, this.executable);
					epaks_are_initied = true;
				} catch (Exception exc) {
					exc.printStackTrace();
				}
			}
			
			@Override
			public Resource loadResource(String workspaceRelativePath) throws IOException {
				Resource res = createResource(workspaceRelativePath);
				try {
					res.load(null);
				} catch (FileNotFoundException e) {
					throw new TGGFileNotFoundException(e, res.getURI());
				}
			//	init_epaks_for_resource_loading();
				if(res.getContents().get(0) instanceof TGG tgg) {
					Collection<EPackage> e_pak = tgg.getSrc().stream()
							.map(e -> resolveEPackage(e))	
							.collect(Collectors.toList());
					tgg.getSrc().clear();
					tgg.getSrc().addAll(e_pak);
					
					e_pak = tgg.getTrg().stream()
							.map(e -> resolveEPackage(e))	
							.collect(Collectors.toList());
					tgg.getTrg().clear();
					tgg.getTrg().addAll(e_pak);
					
					for(TGGRule rule : tgg.getRules()) {
						for(TGGRuleNode node : rule.getNodes())
							node.setType(resolveType(node.getType()));

						for(TGGRuleEdge edge : rule.getEdges())
							edge.setType(resolveReference(edge.getType()));
					}
					return res;
				} else {
					//System.out.println("Shit");
					//return super.loadResource(workspaceRelativePath);
					return res;
				}
			}

			@Override
			public void loadModels() throws IOException {
				if (executable == null || executable instanceof MODELGEN) {
					source = createResource(options.project.path() + "/instances/src.xmi");
					target = createResource(options.project.path() + "/instances/trg.xmi");
					corr = createResource(options.project.path() + "/instances/corr.xmi");
					protocol = createResource(options.project.path() + "/instances/protocol.xmi");
					return;
				}

				if (executable instanceof FWD_OPT) {
					source = loadResource(options.project.path() + "/instances/src.xmi");
					target = createResource(options.project.path() + "/instances/trg.xmi");
					corr = createResource(options.project.path() + "/instances/corr.xmi");
					protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				}

				if (executable instanceof BWD_OPT) {
					source = createResource(options.project.path() + "/instances/src.xmi");
					target = loadResource(options.project.path() + "/instances/trg.xmi");
					corr = createResource(options.project.path() + "/instances/corr.xmi");
					protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				}

				if (executable instanceof SYNC) {
					if (executable instanceof INITIAL_FWD) {
						source = loadResource(options.project.path() + "/instances/src.xmi");
						target = createResource(options.project.path() + "/instances/trg.xmi");
						corr = createResource(options.project.path() + "/instances/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/protocol.xmi");
					} else if (executable instanceof INITIAL_BWD) {
						source = createResource(options.project.path() + "/instances/src.xmi");
						target = loadResource(options.project.path() + "/instances/trg.xmi");
						corr = createResource(options.project.path() + "/instances/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/protocol.xmi");
					} else {
						source = loadResource(options.project.path() + "/instances/src.xmi");
						target = loadResource(options.project.path() + "/instances/trg.xmi");
						corr = loadResource(options.project.path() + "/instances/corr.xmi");
						protocol = loadResource(options.project.path() + "/instances/protocol.xmi");
					}
				}

				if (executable instanceof CC) {
					source = loadResource(options.project.path() + "/instances/src.xmi");
					target = loadResource(options.project.path() + "/instances/trg.xmi");
					corr = createResource(options.project.path() + "/instances/corr.xmi");
					protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				}

				if (executable instanceof CO) {
					source = loadResource(options.project.path() + "/instances/src.xmi");
					target = loadResource(options.project.path() + "/instances/trg.xmi");
					corr = loadResource(options.project.path() + "/instances/corr.xmi");
					protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				}

				if (executable instanceof INTEGRATE) {
					source = loadResource(options.project.path() + "/instances/src.xmi");
					target = loadResource(options.project.path() + "/instances/trg.xmi");
					corr = loadResource(options.project.path() + "/instances/corr.xmi");
					protocol = loadResource(options.project.path() + "/instances/protocol.xmi");
				}

				EcoreUtil.resolveAll(rs);
			}

			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			@Override
			protected Resource loadTGGResource(String workspaceRelativePath) throws IOException {
				Resource tggResource = super.loadTGGResource(workspaceRelativePath);
				if(tggResource.getContents().isEmpty())
					return tggResource;
				
				if(tggResource.getContents().get(0) instanceof TGG tgg) {
					Collection<EPackage> srcPackages = tgg.getSrc().stream().map(this::resolveEPackage).collect(Collectors.toList());
					Collection<EPackage> trgPackages = tgg.getTrg().stream().map(this::resolveEPackage).collect(Collectors.toList());
					tgg.getSrc().clear();
					tgg.getTrg().clear();
					tgg.getSrc().addAll(srcPackages);
					tgg.getTrg().addAll(trgPackages);
					
					for(TGGRule rule : tgg.getRules()) {
						System.out.println("Resolving for rule: " + rule.getName());
						for(TGGRuleNode node : rule.getNodes()) {
							node.setType(resolveType(node.getType()));
						}
						for(TGGRuleEdge edge : rule.getEdges()) {
							edge.setType(resolveReference(edge.getType()));
						}
					}
				}
				return tggResource;
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			private EPackage resolveEPackage(EPackage pkg) {
				if(rs.getPackageRegistry().get(pkg.getNsURI()) instanceof EPackage regPkg) {
					return regPkg;
				}
				return pkg;
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche
			 * @param pkg
			 * @return
			 */
			private EClass resolveType(EClass ec) {
				EPackage pkg = resolveEPackage(ec.getEPackage());
				Optional<EClassifier> resolvedEC = pkg.getEClassifiers().stream().filter(cl -> cl.getName().equals(ec.getName())).findFirst();
				if(!resolvedEC.isPresent()) {
					throw new RuntimeException("Could not resolve eClass " + ec.getName());
				}
				return (EClass) resolvedEC.get();
			}
			
			/**
			 * method to fix capella metmodel loading
			 * @author Lars Fritsche, AZ
			 * @param pkg
			 * @return
			 */
			private EReference resolveReference(EReference ref) {
				EClass containingClass = ref.getEContainingClass();
				EClass the_classifier = resolveType(containingClass);
				Optional<EReference> resolvedRef = the_classifier.getEAllReferences().stream().filter(r -> r.getName().equals(ref.getName())).findFirst();
				if(!resolvedRef.isPresent()) {
					throw new RuntimeException("Could not resolve EReference " + ref.getName());
				}
				return (EReference) resolvedRef.get();
			}
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		SYNC_App sync = new SYNC_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for SYNC in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		sync.forward();
		toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");
		
		sync.saveModels();
		sync.terminate();
	}
}
