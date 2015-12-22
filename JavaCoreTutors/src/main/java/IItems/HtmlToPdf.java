package IItems;

import java.io.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;


/**
 * Created by 1 on 17.11.2015.
 */
public class HtmlToPdf {
    public static void main(String[] args) {
        try {
            OutputStream file = new FileOutputStream(new File("HtmlToPdf.pdf"));
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, file);
            StringBuilder htmlString = new StringBuilder();
            htmlString.append(new String("<html><body> This is HMTL to PDF conversion Example<table border='2' align='center'> "));
            htmlString.append(new String("<tr><td>Google.com</td><td><a href='google.com'>Google</a> </td></tr>"));
            htmlString.append(new String("<tr> <td> Yandex </td> <td><a href='yandex.ru'>Yandex</a> </td> </tr></table></body></html>"));
            document.open();
            InputStream is = new ByteArrayInputStream(htmlString.toString().getBytes());
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
            document.close();
            file.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
