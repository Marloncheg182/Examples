package XML.DOM.XMLCreate;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class WriteXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            Document document = builder.newDocument();
            Element persons = document.createElement("persons");
            document.appendChild(persons);

            Element person = document.createElement("person");
            persons.appendChild(person);

            Attr attr = document.createAttribute("id");
            attr.setValue("1");
            person.setAttributeNode(attr);

            Element firstname = document.createElement("firstname");
            firstname.appendChild(document.createTextNode("oleg"));
            person.appendChild(firstname);

            Element lastname = document.createElement("lastname");
            lastname.appendChild(document.createTextNode("romanenchuk"));
            person.appendChild(lastname);

            Element age = document.createElement("age");
            age.appendChild(document.createTextNode("25"));
            person.appendChild(age);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("D:\\file.xml"));

            transformer.transform(source, result);

            System.out.println("File saved!");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
