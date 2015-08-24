package XML.JDOM.ReadXML;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class ReadXMLFile {
    public static void main(String[] args) {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("d:\\file.xml");
        try {
            Document document = (Document)builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List list = rootNode.getChildren("person");

            for (int i = 0; i <list.size(); i++){
                Element node = (Element)list.get(i);

                System.out.println("First Name : " + node.getChildText("firstname"));
                System.out.println("Last Name : " + node.getChildText("lastname"));
                System.out.println("Age : " + node.getChildText("age"));

            }
        } catch (JDOMException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
