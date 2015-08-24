package XML.DOM.CountXML;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class CountXml {
    public static void main(String[] args) {
        try {
            String filepath = "d:\\IT\\Project\\JavaCoreTutors\\src\\main\\resources\\file.xml";
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(filepath);

            NodeList list = document.getElementsByTagName("person");

            System.out.println("Total of elements : " + list.getLength());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
