package writerDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Dell on 7/27/2015.
 */
public class WriterDOM {
        public static void main(String[] args) {
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder;
    try {
        dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();

        Element rootElement =
                doc.createElementNS("http://www.myexample.com/user", "Users");

        doc.appendChild(rootElement);


        rootElement.appendChild(getUser(doc, "1", "Oleg", "25", "Java Developer", "Male"));


        rootElement.appendChild(getUser(doc, "2", "Vitali", "31", "Android Developer", "Male"));


        rootElement.appendChild(getUser(doc, "3", "Maria", "30", "Web Designer", "Female"));

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        //for pretty print
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);

        //write to console or file
        StreamResult console = new StreamResult(System.out);
        StreamResult file = new StreamResult(new File("/Users/oleg/user.xml"));

        //write data
        transformer.transform(source, console);
        transformer.transform(source, file);
        System.out.println("DONE");

    } catch (Exception e) {
        e.printStackTrace();
    }
}


        private static Node getUser(Document doc, String id, String name, String age, String role,
                                        String gender) {
            Element user = doc.createElement("User");


            user.setAttribute("id", id);


            user.appendChild(getEmployeeElements(doc, user, "name", name));


            user.appendChild(getEmployeeElements(doc, user, "age", age));


            user.appendChild(getEmployeeElements(doc, user, "role", role));


            user.appendChild(getEmployeeElements(doc, user, "gender", gender));

            return user;
        }


        private static Node getEmployeeElements(Document doc, Element element, String name, String value) {
            Element node = doc.createElement(name);
            node.appendChild(doc.createTextNode(value));
            return node;
        }

}
