/**
 * Created by Dell on 7/27/2015.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxReader {
    public static void main(String[] args) {
        String file = "employee.xml";
        List<Employee> list = parseXML(file);
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }

    private static List<Employee> parseXML(String file) {
        List<Employee> list = new ArrayList<Employee>();
        Employee employee = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(file));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("Employee")) {
                        employee = new Employee();
                        Attribute id = startElement.getAttributeByName(new QName("id"));
                        if (id != null) {
                            employee.setId(Integer.parseInt(id.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("age")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        employee.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("name")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        employee.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("gender")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        employee.setGender(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("role")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        employee.setRole(xmlEvent.asCharacters().getData());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("Employee")) {
                        list.add(employee);
                    }
                }
            }
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();

        }
        return list;

    }
}