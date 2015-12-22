package XML.XMLParse;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class StaxParserExample {
    public static void main(String[] args) throws ParserConfigurationException,
            SAXException, IOException, XMLStreamException {
        if (args.length !=1)throw new RuntimeException("The name of the XML file is required!");
        List<Employee> employees = null;
        Employee employee = null;
        String text = null;

        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(new File(args[0])));
        while (reader.hasNext()){
            int Event = reader.next();
            switch (Event){
                case XMLStreamConstants.START_ELEMENT: {
                    if ("Employee".equals(reader.getLocalName())){
                        employee = new Employee();
                        employee.setID(reader.getAttributeValue(0));
                    }
                    if ("Employees".equals(reader.getLocalName()))
                        employees = new ArrayList<>();
                    break;
                }
                case XMLStreamConstants.CHARACTERS: {
                    text = reader.getText().trim();
                    break;
                }
                case XMLStreamConstants.END_ELEMENT:{
                    switch (reader.getLocalName()){
                        case "Employee":{
                            employees.add(employee);
                            break;
                        }
                        case "Firstname":{
                            employee.setFirstname(text);
                            break;
                        }
                        case "Lastname": {
                            employee.setLastname(text);
                            break;
                        }
                        case "Age": {
                            employee.setAge(Integer.parseInt(text));
                            break;
                        }
                        case "Salary": {
                            employee.setSalary(Double.parseDouble(text));
                            break;
                        }
                    }
                    break;
                }
            }
        }

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

    }
}
