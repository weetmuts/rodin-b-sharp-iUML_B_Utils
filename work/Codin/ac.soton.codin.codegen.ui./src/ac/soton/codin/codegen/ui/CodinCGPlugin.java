package ac.soton.codin.codegen.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CodinCGPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "ac.soton.codin.codegen.ui"; //$NON-NLS-1$
	public static final String GENERATED_SRC_FOLDER = "out";
	public static final String TEMPLATES_SRC_FOLDER = "templates";
	public static final String VHDL_EXT = "vhdl";

	// Types
	public static final String INT_TYPE_STRING = "Integer";
	public static final String BOOL_TYPE_STRING = "Boolean";
	public static final String TRUE_LITERAL_STRING = "TRUE";
	public static final String FALSE_LITERAL_STRING = "FALSE";
	
	// Some Predicate Logical Operators
	public static final String AND_STRING = "and";
	public static final String OR_STRING = "or";
	public static final String NOT_STRING = "not";
	public static final String NEQ_STRING = "/=";
	public static final String LEQ_STRING = "<=";
	public static final String GEQ_STRING = ">=";
	public static final String EQ_STRING = "=";
	public static final String SLT_STRING = "<";
	public static final String SGT_STRING = ">";
	
	//Misc Mathematical operators
	public static final String UPTO_STRING = "..";
	public static final String MULT_STRING = "*";
	public static final String DIV_STRING = "/";
	public static final String ADD_STRING = "+";
	public static final String MINUS_STRING = "-";
	public static final String BCMEQ_STRING = ":=";

	// A list of predicate operators that may involve the std_logic types
	// mapped from Event-B Boolean types.
	// Where predicates of the form, 
	// std_logic_val /= true and not(std_logic_val2 = false)
	// map to 
	// std_logic_val1 /= '1' and not(std_logic_val2 = '0')
	// and remember:
	// x = std_logic_val + '1' is ok in VHDL but not Event-B
	// since std_logic_val: BOOL
	public static List<String> stdLogicPredOpsList = new ArrayList<String>();

	// The shared instance
	private static CodinCGPlugin plugin;
	
	
	
	/**
	 * The constructor
	 */
	public CodinCGPlugin() {
		stdLogicPredOpsList.add(NEQ_STRING);
		stdLogicPredOpsList.add(EQ_STRING);
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
	public static CodinCGPlugin getDefault() {
		return plugin;
	}

}
