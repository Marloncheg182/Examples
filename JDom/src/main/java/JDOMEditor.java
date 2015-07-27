import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Dell on 7/27/2015.
 */
public class JDOMEditor {

    public static void main(String[] args) throws JDOMException, IOException {
        final Namespace ns = Namespace.getNamespace("http://www.myexamples.com/employees");


        org.jdom2.Document doc = useSAXParser("employees.xml");


        Element rootElement = doc.getRootElement();
        List<Element> listEmpElement = rootElement.getChildren("Employee", ns);


        for (Element empElement : listEmpElement) {


            String name = empElement.getChildText("name", ns);
            if (name != null)
                empElement.getChild("name", ns).setText(name.toUpperCase());


            String gender = empElement.getChildText("gender", ns);
            if (gender != null && gender.equalsIgnoreCase("female")) {
                String id = empElement.getAttributeValue("id");
                empElement.getAttribute("id").setValue(id + "F");
            } else {
                String id = empElement.getAttributeValue("id");
                empElement.getAttribute("id").setValue(id + "M");
            }


            empElement.removeChild("gender", ns);


            empElement.addContent(new Element("salary", ns).setText("1000"));
        }


        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());


        xmlOutputter.output(doc, new FileOutputStream("employees_new.xml"));
    }



    private static org.jdom2.Document useSAXParser(String fileName) throws JDOMException,
            IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        return saxBuilder.build(new File(fileName));
    }

}