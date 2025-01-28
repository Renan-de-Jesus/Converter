package Model;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import View.ConversorScreen;

public class TextToPDF extends ConversorScreen {
	private static final long serialVersionUID = 1L;
	JFileChooser cs = new JFileChooser();

	public void converter() {
		SearchFiles sf = new SearchFiles();
		if (sf.getSelectedFile() == null) {
			JOptionPane.showMessageDialog(rootPane, "Por favor, selecione um arquivo", "Erro", 0);
			return;
		}

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(cs.getSelectedFile().getName() + ".pdf"));
			document.open();
			BufferedReader br = new BufferedReader(new FileReader(cs.getSelectedFile().getName()));
			String line;
			while ((line = br.readLine()) != null) {
				document.add(new Paragraph(line));
			}
			br.close();
			document.close();
			JOptionPane.showConfirmDialog(null, "Isso ai");
			System.out.println("PDF criado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}