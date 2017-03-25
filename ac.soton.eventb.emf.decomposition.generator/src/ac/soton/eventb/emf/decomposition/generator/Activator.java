package ac.soton.eventb.emf.decomposition.generator;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	public static final String UNIVERSAL_VARIABLE_ATTRIBUTE_ID = "ac.soton.eventb.emf.decomposition.generator.universalVariable"; //$NON-NLS-1$

	// The plug-in ID
	public static final String PLUGIN_ID = "ac.soton.eventb.emf.decomposition.generator"; //$NON-NLS-1$

	//some string constants used in this plug-in
	public static final String generatorIDKey = "org.eventb.emf.persistence.generator_ID";
	public static final String flattenCommandId = "ac.soton.eventb.emf.inclusion.commands.include";
	public static final String compositionMachinePostfix = "";	
	public static final String compositionMachineExtension = "xmc";
	public static final String defaultExtension = "xmi";
	public static final String machineExtension = "bum";
	public static final String contextExtension = "buc";
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
