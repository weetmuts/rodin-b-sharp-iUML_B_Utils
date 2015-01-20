package ac.soton.eventb.textout.core;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.rodinp.keyboard.RodinKeyboardPlugin;


	
public class AddRodinKeyboardListener {
	public static void setup(XtextEditor editor) {
		StyledText textWidget = editor.getInternalSourceViewer().getTextWidget();
		
		ModifyListener eventBListener = RodinKeyboardPlugin
				.getDefault().createRodinModifyListener();
		textWidget.addModifyListener(eventBListener);
	}
	
}
