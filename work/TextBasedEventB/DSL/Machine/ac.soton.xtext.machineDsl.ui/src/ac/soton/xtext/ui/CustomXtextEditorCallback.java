package ac.soton.xtext.ui;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.xtext.builder.nature.NatureAddingEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.rodinp.keyboard.RodinKeyboardPlugin;

public class CustomXtextEditorCallback extends
		NatureAddingEditorCallback {

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		setup(editor);
	}

	private void setup(XtextEditor editor) {
		StyledText textWidget = editor.getInternalSourceViewer().getTextWidget();

		ModifyListener eventBListener = RodinKeyboardPlugin.getDefault()
				.createRodinModifyListener();
		textWidget.addModifyListener(eventBListener);
	}

}
