package servlet.generatore_pdf;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/generatorepdf") //http://localhost:8080/Corso_JAVA_EE/generatorepdf
public class GeneratorePdfServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PdfWriter pdf = new PdfWriter(resp.getOutputStream());

        PdfDocument doc = new PdfDocument(pdf);

        Document document = new Document(doc);
        document.add(new Paragraph("Sono un file PDF!"));
        document.add(new Paragraph("Sono un file PDF!"));
        document.add(new Paragraph("Sono un file PDF!"));
        document.add(new Paragraph("Sono un file PDF!"));
        document.add(new Paragraph("Sono un file PDF!"));

        document.close();

        resp.setContentType("application/pdf");
        resp.setHeader("Content-disposition", "attachment; filename=corsojava.pdf");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
