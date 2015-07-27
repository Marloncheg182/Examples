package java.reader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 7/27/2015.
 */
public class ReaderDOM {
    public static void main(String[] args) throws IOException {
        String filePath = "user.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("User");
            //now XML is loaded as Document in memory, lets convert it to Object List
            List<User> userList = new ArrayList<User>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                userList.add(getUser(nodeList.item(i)));
            }
            //lets print Employee list information
            for (User users : userList) {
                System.out.println(users.toString());
            }
        } catch (SAXException | ParserConfigurationException e1) {
            e1.printStackTrace();
        }

    }


    private static User getUser(Node node) {
        //XMLReaderDOM domReader = new XMLReaderDOM();
        User user = new User();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            user.setName(getTagValue("name", element));
            user.setAge(Integer.parseInt(getTagValue("age", element)));
            user.setGender(getTagValue("gender", element));
            user.setStatus(getTagValue("status", element));
        }

        return user;
    }


    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node)nodeList.item(0);
        return node.getNodeValue();
    }

}
