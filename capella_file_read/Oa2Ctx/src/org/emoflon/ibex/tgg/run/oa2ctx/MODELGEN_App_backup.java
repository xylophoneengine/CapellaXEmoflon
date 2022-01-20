package org.emoflon.ibex.tgg.run.oa2ctx;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;

import org.emoflon.ibex.tgg.run.oa2ctx.config.*;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;

public class MODELGEN_App_backup extends MODELGEN {

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public MODELGEN_App_backup() throws IOException {
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
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		MODELGEN_App_backup generator = new MODELGEN_App_backup();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for MODELGEN in: " + (toc - tic) + " ms");
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		stop.setTimeOutInMS(1000);
		
		stop.setMaxRuleCount("OperationalAnalysis2SystemAnalysis", 0); // what i want to do
		
		// rules to find out what i am doing wrong
		stop.setMaxRuleCount("Oa2Sa_create_nodes_only", 0);
		// runs without errors
		
		
		stop.setMaxRuleCount("Oa2Sa_create_nodes_and_try_to_set_reference", 0); //most confusing
		//says that the reference is not changeable. However, that is not the case.
		// The metamodel does define the reference as changeable
//		Exception in thread "main" java.lang.IllegalArgumentException: The feature 'ownedAbstractCapabilityPkg' is not a valid changeable feature
//		at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eOpenSet(BasicEObjectImpl.java:1188)
//		at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eSet(BasicEObjectImpl.java:1114)
//		at org.emoflon.ibex.common.emf.EMFManipulationUtils.createEdge(EMFManipulationUtils.java:65)
//		at org.emoflon.ibex.tgg.operational.defaults.IbexGreenInterpreter.createEdges(IbexGreenInterpreter.java:78)
//		at org.emoflon.ibex.tgg.operational.defaults.IbexGreenInterpreter.apply(IbexGreenInterpreter.java:214)
//		at org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy.processOperationalRuleMatch(OperationalStrategy.java:277)
//		at org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN.processOneOperationalRuleMatch(MODELGEN.java:116)
//		at org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN.run(MODELGEN.java:79)
//		at org.emoflon.ibex.tgg.run.oa2ctx.MODELGEN_App.main(MODELGEN_App.java:83)
		
		// somehow cannot find the name attribute
		stop.setMaxRuleCount("Oa2Sa_nodes_and_set_name", 0);
		//Exception in thread "main" java.lang.IllegalArgumentException: The feature 'name' is not a valid feature
//		at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eOpenGet(BasicEObjectImpl.java:1101)
//		at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eGet(BasicEObjectImpl.java:1054)
//		at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eGet(BasicEObjectImpl.java:1042)
//		at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eGet(BasicEObjectImpl.java:1037)
//		at org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintContainer.applyCSPValues(RuntimeTGGAttributeConstraintContainer.java:147)
//		at org.emoflon.ibex.tgg.operational.defaults.IbexGreenInterpreter.apply(IbexGreenInterpreter.java:203)
//		at org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy.processOperationalRuleMatch(OperationalStrategy.java:277)
//		at org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN.processOneOperationalRuleMatch(MODELGEN.java:116)
//		at org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN.run(MODELGEN.java:79)
//		at org.emoflon.ibex.tgg.run.oa2ctx.MODELGEN_App.main(MODELGEN_App.java:93)

		stop.setMaxRuleCount("Oa2Sa_nodes_and_set_specific_name", 1);
		
		stop.setMaxRuleCount("InitialModelCreation", 0);

		generator.setStopCriterion(stop);
		
		tic = System.currentTimeMillis();
		generator.run();
		toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");
		
		generator.saveModels();
		generator.terminate();
	}
}
