package ac.soton.codin.codegen.formatter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

import ac.soton.codin.codegen.basic.VHDL_TranslationData;
import ac.soton.codin.codegen.ui.CodinCGPlugin;

public class Formatter {

	int padSize = 0;

	List<String> increasingKeywords = new ArrayList<String>();
	List<String> decreasingKeywords = new ArrayList<String>();

	public Formatter() {
		increasingKeywords.add("entity");
		increasingKeywords.add("architecture");
		increasingKeywords.add("process");
		increasingKeywords.add("procedure");
		increasingKeywords.add("case");
		increasingKeywords.add("if");
		increasingKeywords.add("begin");
		decreasingKeywords.add("end");
	}

	private String indent() {
		String s = "";
		for (int i = 0; i < padSize; i++) {
			s = s + " ";
		}
		return s;
	}

	private void increaseIndent() {
		padSize = padSize + 1;
	}

	private boolean decreaseIndent() {
		if (padSize > 0) {
			padSize = padSize - 1;
			return true;
		} else
			return false;
	}

	public String format(String sourceString_) {
		String sourceString = sourceString_.toLowerCase().trim();
		List<String> wordList = Arrays.asList(sourceString.split(" "));
		boolean foundIncrease = false;
		boolean foundDecrease = false;
		for (String s : wordList) {
			if (increasingKeywords.contains(s)) {
				foundIncrease = true;
				break;
			} else if (decreasingKeywords.contains(s)) {
				foundDecrease = true;
				break;
			}
		}

		if(foundIncrease){
			sourceString = indent() + sourceString;
			increaseIndent();
		}
		else if(foundDecrease){
			decreaseIndent();
			sourceString = indent() + sourceString;
		}
		else{
			sourceString = indent() + sourceString;
		}

		return sourceString;
	}

	public void formatVHDL(VHDL_TranslationData translationData)
			throws RodinDBException, IOException {
		IRodinProject project = translationData.parentProject;
		String programName = translationData.program.getName();

		List<String> formattedArray = new ArrayList<String>();

		IProject p = project.getCorrespondingResource().getProject();
		IFolder folder = p.getFolder("out");
		IFile f = folder.getFile(programName + "." + CodinCGPlugin.VHDL_EXT);
		IPath loc = f.getRawLocation();

		FileReader fr = new FileReader(loc.toString());
		BufferedReader br = new BufferedReader(fr);

		String originalLine = br.readLine();

		while (originalLine != null) {
			String formattedLine = format(originalLine);
			formattedArray.add(formattedLine);
			originalLine = br.readLine();
		}
		br.close();
		
		FileWriter fw = new FileWriter(loc.toString());
		BufferedWriter bw = new BufferedWriter(fw);

		for(String s: formattedArray){
			bw.write(s+"\n");
		}
		
		bw.flush();
		bw.close();
	}

}
