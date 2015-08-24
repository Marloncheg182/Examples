package XML.JDOM.CreateXML;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class CreaterXML {
    public static void main(String[] args) {
        try {
            Element persons = new Element("persons");
            Document document = new Document(persons);
            document.setRootElement(persons);

            Element person = new Element("person");
            person.setAttribute(new Attribute("id", "1"));
            person.addContent(new Element("firstname").setText("oleg"));
            person.addContent(new Element("lastname").setText("romanenchuk"));
            person.addContent(new Element("age").setText("25"));

            document.getRootElement().addContent(person);

            Element person2 = new Element("person");
            person.setAttribute(new Attribute("id", "2"));
            person.addContent(new Element("firstname").setText("vitalik"));
            person.addContent(new Element("lastname").setText("romanenchuk"));
            person.addContent(new Element("age").setText("31"));

            document.getRootElement().addContent(person2);

            XMLOutputter xmlOutputter = new XMLOutputter();

            xmlOutputter.setFormat(Format.getPrettyFormat());
            xmlOutputter.output(document, new FileWriter("d:\\file.xml"));

            System.out.println("File Saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

