package ac.soton.eventb.emf.diagrams.importExport.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import ac.soton.eventb.emf.diagrams.importExport.Activator;
import ac.soton.eventb.emf.diagrams.importExport.IPorterAdapter;
import ac.soton.eventb.emf.diagrams.importExport.IRule;
import ac.soton.eventb.emf.diagrams.importExport.impl.ImporterConfig;


public class ImporterFactory {

	// The shared instance
	private static ImporterFactory factory = null;
	
	
	//cached store of generator configurations that have been loaded from extension points
	private Map<EClassifier,ImporterConfig> generatorConfigRegistry = new HashMap<EClassifier, ImporterConfig  >();
	
	
	/*
	 * The constructor for the shared instance of factory,
	 * populates the registry of generator configurations from extensions point
	 */
	private ImporterFactory() {

		// populate generator configuration data from registered extensions
		for (final IExtension extension : Platform.getExtensionRegistry().getExtensionPoint(Identifiers.EXTPT_RULE_ID).getExtensions()) {
			for (final IConfigurationElement generatorExtensionElement : extension.getConfigurationElements()) {
				try {
					EPackage rootSourcePackage = EPackage.Registry.INSTANCE.getEPackage(generatorExtensionElement.getAttribute(Identifiers.EXTPT_RULE_SOURCEPACKAGE));
					EClassifier rootSourceClass = rootSourcePackage.getEClassifier(generatorExtensionElement.getAttribute(Identifiers.EXTPT_RULE_ROOTSOURCECLASS));
					String generatorID = generatorExtensionElement.getAttribute(Identifiers.EXTPT_RULE_GENERATORID);
					final IPorterAdapter adapter = (IPorterAdapter) generatorExtensionElement.createExecutableExtension(Identifiers.EXTPT_RULE_ADAPTERCLASS);
					if (rootSourcePackage!= null) {
						ImporterConfig importerConfig = new ImporterConfig(generatorID, rootSourcePackage, rootSourceClass, adapter);
						for (final IConfigurationElement ruleExtensionElement : generatorExtensionElement.getChildren(Identifiers.EXTPT_RULE_RULE)) {
	
								EClassifier sourceClass = null;
								//see if a EPackage has been explicitly defined
								EPackage sourcePackage = EPackage.Registry.INSTANCE.getEPackage(ruleExtensionElement.getAttribute(Identifiers.EXTPT_RULE_SOURCEPACKAGE));
								if (sourcePackage != null) {
									sourceClass = sourcePackage.getEClassifier(ruleExtensionElement.getAttribute(Identifiers.EXTPT_RULE_SOURCECLASS));
								}else{
									//no explicit EPackage so try the rootSourcePackage of the generator
									sourcePackage = rootSourcePackage;
									sourceClass = sourcePackage.getEClassifier(ruleExtensionElement.getAttribute(Identifiers.EXTPT_RULE_SOURCECLASS));
									//if not in rootSourcePackage, try its subPackages
									if(sourceClass == null){
										for (EPackage subPackage  : sourcePackage.getESubpackages()){
											sourceClass = subPackage.getEClassifier(ruleExtensionElement.getAttribute(Identifiers.EXTPT_RULE_SOURCECLASS));
											if (sourceClass != null) break;
										}
									}
								}
								
								// if we found the class, add the rule
								if (sourceClass != null) {
									final IRule rule = (IRule) ruleExtensionElement.createExecutableExtension(Identifiers.EXTPT_RULE_RULECLASS);									
									importerConfig.addRule(sourceClass, rule);
								}
								
	
						}
						//save config data in case another generator instance is needed for this EClass
						if (importerConfig != null) generatorConfigRegistry.put(rootSourceClass,importerConfig);
					}
				} catch (final CoreException e) {
					Activator.logError(e.getMessage(),e);
					break;
				}
			}
		}
	}
	


	public static ImporterFactory getFactory(){
		if (factory == null){
			factory = new ImporterFactory();
		}
		return factory;
	}



	public boolean canGenerate(EClassifier rootSourceClass){
		return generatorConfigRegistry.containsKey(rootSourceClass);
	}
	
	/**
	 * Construct a generator.
	 * This should be called from a command handler action.
	 * 	
	 * @param rootSourceClass	- the EClass of the root element that this is a generator for
	 */
		
	public Importer createGenerator(EClass rootSourceClass){ 	
		if (generatorConfigRegistry.containsKey(rootSourceClass)){
			return new Importer(generatorConfigRegistry.get(rootSourceClass));
		}else{
			return null;
		}
	}
	
	
}
