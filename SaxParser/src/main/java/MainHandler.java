import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 7/27/2015.
 */
public class MainHandler extends DefaultHandler {
    private List<Employee> list = null;
    private Employee employee = null;

    public List<Employee> getList() {
        return list;
    }

    boolean bAge = false;
    boolean bName = false;
    boolean bGender = false;
    boolean bRole = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Employee")) {
            String id = attributes.getValue("id");
            employee = new Employee();
            employee.setId(Integer.parseInt(id));
            if (list == null)
                list = new ArrayList<Employee>();
        } else if (qName.equalsIgnoreCase("name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            bAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            bGender = true;
        } else if (qName.equalsIgnoreCase("role")) {
            bRole = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Employee")) {
            list.add(employee);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bAge) {
            employee.setAge(Integer.parseInt(new String(ch, start, length)));
            bAge = false;
        } else if (bName) {
            employee.setName(new String(ch, start, length));
            bName = false;
        } else if (bRole) {
            employee.setRole(new String(ch, start, length));
        } else if (bGender){
            employee.setGender(new String(ch, start, length));
            bGender = false;
        }
    }
}
