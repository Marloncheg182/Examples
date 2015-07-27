import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
/**
 * Created by Dell on 7/27/2015.
 */
public class JDDOMWriter {

    public static void main(String[] args) throws IOException {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1, "Oleg","Male",25,"Java Developer"));
        empList.add(new Employee(2, "Vitali","Male",31,"Android Developer"));
        empList.add(new Employee(3, "Maria","Female",30,"Web Designer"));

        String fileName = "employees.xml";
        writeFileUsingJDOM(empList, fileName);
    }

    private static void writeFileUsingJDOM(List<Employee> empList, String fileName) throws IOException {
        Document doc = new Document();
        doc.setRootElement(new Element("Employees",  Namespace.getNamespace("http://www.myexamples.com/employees")));
        for(Employee emp : empList){
            Element employee = new Element("Employee");
            employee.setAttribute("id",""+emp.getId());
            employee.addContent(new Element("age").setText(""+emp.getAge()));
            employee.addContent(new Element("name").setText(emp.getName()));
            employee.addContent(new Element("gender").setText(emp.getGender()));
            employee.addContent(new Element("role").setText(emp.getRole()));
            doc.getRootElement().addContent(employee);
        }
        //JDOM document is ready now, lets write it to file now
        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        //output xml to console for debugging
        //xmlOutputter.output(doc, System.out);
        xmlOutputter.output(doc, new FileOutputStream(fileName));
    }

}