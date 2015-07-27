package editXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by Dell on 7/27/2015.
 */
public class EditXMLFile {
    public static void main(String[] args) {
        String filePath = "user.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();


            updateAttributeValue(doc);


            updateElementValue(doc);


            deleteElement(doc);


            addElement(doc);


            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("user_updated.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("XML file updated successfully");

        } catch (SAXException | ParserConfigurationException | IOException | TransformerException e1) {
            e1.printStackTrace();
        }
    }

    private static void addElement(Document doc) {
        NodeList users = doc.getElementsByTagName("User");
        Element usr = null;


        for(int i=0; i<users.getLength();i++){
            usr = (Element) users.item(i);
            Element salaryElement = doc.createElement("salary");
            salaryElement.appendChild(doc.createTextNode("10000"));
            usr.appendChild(salaryElement);
        }
    }

    private static void deleteElement(Document doc) {
        NodeList users = doc.getElementsByTagName("Employee");
        Element usr = null;

        for(int i=0; i<users.getLength();i++){
            usr = (Element) users.item(i);
            Node genderNode = usr.getElementsByTagName("gender").item(0);
            usr.removeChild(genderNode);
        }

    }

    private static void updateElementValue(Document doc) {
        NodeList users = doc.getElementsByTagName("User");
        Element usr = null;

        for(int i=0; i<users.getLength();i++){
            usr = (Element) users.item(i);
            Node name = usr.getElementsByTagName("name").item(0).getFirstChild();
            name.setNodeValue(name.getNodeValue().toUpperCase());
        }
    }

    private static void updateAttributeValue(Document doc) {
        NodeList users = doc.getElementsByTagName("User");
        Element usr = null;

        for(int i=0; i<users.getLength();i++){
            usr = (Element) users.item(i);
            String gender = usr.getElementsByTagName("gender").item(0).getFirstChild().getNodeValue();
            if(gender.equalsIgnoreCase("male")){

                usr.setAttribute("id", "M"+usr.getAttribute("id"));
            }else{

                usr.setAttribute("id", "F"+usr.getAttribute("id"));
            }
        }
    }

}