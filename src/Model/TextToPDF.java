package Model;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import View.ConversorScreen;

public class TextToPDF extends ConversorScreen {
	private static final long serialVersionUID = 1L;
	JFileChooser cs = new JFileChooser();

	public void converter(File archive) {
		if (archive == null) {
			JOptionPane.showMessageDialog(rootPane, "Por favor, selecione um arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}

		try {
			String desktop = System.getProperty("user.home") + "/Desktop/";
			String pdfName = desktop + archive.getName().replace(".txt","") + ".pdf";
			
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(pdfName));
			document.open();
			
			BufferedReader br = new BufferedReader(new FileReader(archive));
			String line;
			
			while ((line = br.readLine()) != null) {
				document.add(new Paragraph(line));
			}
			
			br.close();
			document.close();
			
			JOptionPane.showMessageDialog(rootPane, "PDF criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}