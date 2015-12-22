package XML.XMLParse;

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
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class DomParserExample {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        if (args.length !=1)throw new RuntimeException("The name of the XML file is required!");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File(args[0]));

        List<Employee> employees = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element)node;

                String ID = node.getAttributes().getNamedItem("ID").getNodeValue();

                String firstname = element.getElementsByTagName("Firstname")
                        .item(0).getChildNodes().item(0).getNodeValue();
                String lastname = element.getElementsByTagName("Lastname")
                        .item(0).getChildNodes().item(0).getNodeValue();
                Integer age = Integer.parseInt(element.getElementsByTagName("Age")
                        .item(0).getChildNodes().item(0).getNodeValue());
                Double salary = Double.parseDouble(element.getElementsByTagName("Salary")
                        .item(0).getChildNodes().item(0).getNodeValue());
                employees.add(new Employee(ID, firstname, lastname, age, salary));


            }
        }
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
