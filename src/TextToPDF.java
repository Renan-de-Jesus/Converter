import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class TextToPDF {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("output.pdf"));
            document.open();
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                document.add(new Paragraph(line));
            }
            br.close();
            document.close();
            System.out.println("PDF criado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}