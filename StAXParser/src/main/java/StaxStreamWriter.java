import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 7/27/2015.
 */
public class StaxStreamWriter {

    public static void main(String[] args) {
        String fileName = "employee.xml";
        String rootElement = "Employee";
        StaxStreamWriter xmlStreamWriter = new StaxStreamWriter();
        Map<String,String> elementsMap = new HashMap<String, String>();
        elementsMap.put("id", "1");
        elementsMap.put("name", "Oleg");
        elementsMap.put("age", "25");
        elementsMap.put("role", "Java Developer");
        elementsMap.put("gender", "Male");
        xmlStreamWriter.writeXML(fileName, rootElement, elementsMap);
    }

    private void writeXML(String fileName, String rootElement, Map<String, String> elementsMap) {
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        try{
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileOutputStream(fileName), "UTF-8");
            //start writing xml file
            xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
            xmlStreamWriter.writeCharacters("\n");
            xmlStreamWriter.writeStartElement(rootElement);

            //write id as attribute
            xmlStreamWriter.writeAttribute("id", elementsMap.get("id"));

            //write other elements
            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeStartElement("name");
            xmlStreamWriter.writeCharacters("\n\t\t"+elementsMap.get("name"));
            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeEndElement();

            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeStartElement("age");
            xmlStreamWriter.writeCharacters("\n\t\t"+elementsMap.get("age"));
            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeEndElement();

            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeStartElement("gender");
            xmlStreamWriter.writeCharacters("\n\t\t"+elementsMap.get("gender"));
            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeEndElement();

            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeStartElement("role");
            xmlStreamWriter.writeCharacters("\n\t\t"+elementsMap.get("role"));
            xmlStreamWriter.writeCharacters("\n\t");
            xmlStreamWriter.writeEndElement();
            //write end tag of Employee element
            xmlStreamWriter.writeCharacters("\n");
            xmlStreamWriter.writeEndElement();

            //write end document
            xmlStreamWriter.writeEndDocument();

            //flush data to file and close writer
            xmlStreamWriter.flush();
            xmlStreamWriter.close();

        }catch(XMLStreamException | FileNotFoundException e){
            e.printStackTrace();
        }
    }

}