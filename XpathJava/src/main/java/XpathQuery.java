/**
 * Created by Dell on 7/27/2015.
 */
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XpathQuery {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse("employees.xml");

            XPathFactory pathFactory = XPathFactory.newInstance();
            XPath xPath = pathFactory.newXPath();

            String name = getEmployeeById(document, xPath, 2);
            System.out.println("Employee name by id 2 :" + name);

            List<String> names = getNameWithAge(document, xPath, 25);
            System.out.println("Employee with age> 25 = " + Arrays.toString(names.toArray()));

            List<String> female = getFemale(document, xPath);
            System.out.println("Female name " + Arrays.toString(female.toArray()));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
        private static List<String> getFemale(Document doc, XPath xpath) {
            List<String> list = new ArrayList<String>();
            try {

                XPathExpression expr =
                        xpath.compile("/Employees/Employee[gender ='Female']/name/text()");

                NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
                for (int i = 0; i < nodes.getLength(); i++)
                    list.add(nodes.item(i).getNodeValue());
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            }
            return list;
        }


        private static List<String> getNameWithAge(Document doc, XPath xpath, int age) {
            List<String> list = new ArrayList<String>();
            try {
                XPathExpression expr =
                        xpath.compile("/Employees/Employee[age>" + age + "]/name/text()");
                NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
                for (int i = 0; i < nodes.getLength(); i++)
                    list.add(nodes.item(i).getNodeValue());
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            }
            return list;
        }


    private static String getEmployeeById(Document doc, XPath xpath, int id) {
        String name = null;
        try {
            XPathExpression expr =
                    xpath.compile("/Employees/Employee[@id='" + id + "']/name/text()");
            name = (String) expr.evaluate(doc, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return name;
    }

}