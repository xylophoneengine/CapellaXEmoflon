package org.emoflon.ibex.tgg.run.oa2ctx;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;

import org.emoflon.ibex.tgg.run.oa2ctx.config.*;

import language.TGG;
import language.TGGRule;
import language.TGGRuleEdge;
import language.TGGRuleNode;

import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

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
			
			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource without content
				// source = loadResource(options.project.path() + "/instances/src.xmi");
				// target = createResource(options.project.path() + "/instances/trg.xmi");
				// corr = createResource(options.project.path() + "/instances/corr.xmi");
				// protocol = createResource(options.project.path() + "/instances/protocol.xmi");
				
				super.loadModels();
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
