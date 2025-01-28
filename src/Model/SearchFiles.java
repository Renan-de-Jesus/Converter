package Model;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SearchFiles {
	FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de Texto (*.txt)", "txt");
	private File selectedFile;

	public void selectFile() {
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(filter);
		int returnValue = fc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			selectedFile = fc.getSelectedFile();
			System.out.println("Arquivo selecionado " + selectedFile.getAbsolutePath());
			System.out.println(getSelectedFile());
		}
	}

	public void setSelectedFile(File selectedFile) {
		this.selectedFile = selectedFile;
	}

	public File getSelectedFile() {
		return selectedFile;
	}
}
