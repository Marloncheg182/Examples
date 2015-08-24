package XML.DOM.ReadXML;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class ReaderLoop {
    public static void main(String[] args) {
        try {
            File file = new File("d:\\IT\\Project\\JavaCoreTutors\\src\\main\\resources\\file.xml");
            DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            Document document = db.parse(file);

            System.out.println("Root element : " + document.getDocumentElement().getNodeName());
            if (document.hasChildNodes()){
                print(document.getChildNodes());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void print(NodeList list) {
        for (int count = 0; count < list.getLength(); count++){
            Node temp = list.item(count);

            if (temp.getNodeType()==Node.ELEMENT_NODE){

                System.out.println("\nNode Name =" + temp.getNodeName() + " [OPEN]");
                System.out.println("Node Value =" + temp.getTextContent());

                if (temp.hasAttributes()){
                    NamedNodeMap map = temp.getAttributes();

                    for (int i = 0; i < map.getLength(); i++){
                        Node node = map.item(i);
                        System.out.println("attr name : " + node.getNodeName());
                        System.out.println("atte value : " + node.getNodeValue());
                    }
                }

                if (temp.hasChildNodes()){
                    print(temp.getChildNodes());
                }
                System.out.println("Node Name =" + temp.getNodeName() + " [CLOSE]");
            }

        }
    }
}
