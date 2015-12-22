package XML.XMLParse;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class SAXParserExample extends DefaultHandler {
    private static List<Employee> employees = new ArrayList<>();
    private static Employee emp = null;
    private static String text = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName){
            case "Employee": {
                emp = new Employee();
                emp.setID(attributes.getValue("ID"));
                break;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "Employee": {
                employees.add(emp);
                break;
            }
            case "Firstname": {
                emp.setFirstname(text);
                break;
            }
            case "Lastname": {
                emp.setLastname(text);
                break;
            }
            case "Age": {
                emp.setAge(Integer.parseInt(text));
                break;
            }
            case "Salary": {
                emp.setSalary(Double.parseDouble(text));
                break;
            }
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text = String.copyValueOf(ch, start,length).trim();
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        if (args.length!= 1)throw new RuntimeException( "The name of the XML file is required!");
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();
        SAXParserExample handler = new SAXParserExample();

        parser.parse(new File(args[0]), handler);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
