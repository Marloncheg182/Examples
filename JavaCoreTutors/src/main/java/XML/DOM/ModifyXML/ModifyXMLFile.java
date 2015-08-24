package XML.DOM.ModifyXML;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class ModifyXMLFile {
    public static void main(String[] args) {
        try {
            String filepath = "d:\\IT\\Project\\JavaCoreTutors\\src\\main\\resources\\file.xml";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(filepath);

            Node persons = document.getFirstChild();

            Node person = document.getElementsByTagName("person").item(0);

            NamedNodeMap attr = person.getAttributes();
            Node nodeAttr = attr.getNamedItem("id");
            nodeAttr.setTextContent("2");

            Element zodiac = document.createElement("zodiac");
            zodiac.appendChild(document.createTextNode("twins"));
            persons.appendChild(zodiac);

            NodeList list = person.getChildNodes();

            for (int i = 0; i < list.getLength(); i++){
                Node node = list.item(i);

                if ("age".equals(node.getNodeName())){
                    node.setTextContent("29");
                }

                if ("firstname".equals(node.getNodeName())){
                    person.removeChild(node);
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);

            System.out.println("Done");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
