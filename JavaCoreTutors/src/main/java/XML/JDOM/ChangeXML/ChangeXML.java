package XML.JDOM.ChangeXML;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class ChangeXML {
    public static void main(String[] args) {

        try {

            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File("d:\\file.xml");

            Document doc = (Document) builder.build(xmlFile);
            Element rootNode = doc.getRootElement();

            // update staff id attribute
            Element staff = rootNode.getChild("person");
            staff.getAttribute("id").setValue("2");

            // add new age element
            Element country = new Element("country").setText("German");
            staff.addContent(country);

            // update salary value
            staff.getChild("age").setText("29");

            // remove firstname element
            staff.removeChild("firstname");

            XMLOutputter xmlOutput = new XMLOutputter();

            // display nice nice
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("D:\\file.xml"));

            // xmlOutput.output(doc, System.out);

            System.out.println("File updated!");
        } catch (IOException io) {
            io.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }
    }
}