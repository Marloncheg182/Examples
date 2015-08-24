package XML.DOM.ReadXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Reader {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("d:\\IT\\Project\\JavaCoreTutors\\src\\main\\resources\\file.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("person");
            System.out.println("--------------------------------");

            for (int temp = 0; temp < nodeList.getLength(); temp++){
                Node node = nodeList.item(temp);

                System.out.println("\nCurrent Element : " + node.getNodeName());
                if (node.getNodeType()==Node.ELEMENT_NODE){
                    Element element = (Element)node;

                    System.out.println("Person id : " + element.getAttribute("id"));
                    System.out.println("First name : " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last name : " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("age : " + element.getElementsByTagName("age").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
