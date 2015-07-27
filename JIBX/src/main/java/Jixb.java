import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.JiBXException;

import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by Dell on 7/27/2015.
 */
public class Jixb {
    public String marshalEmployee(Employee employee){
        try {
            IBindingFactory bfact = BindingDirectory.getFactory(Employee.class);
            IMarshallingContext marshallingContext = bfact.createMarshallingContext();
            marshallingContext.setIndent(2);
            StringWriter stringWriter = new StringWriter();
            marshallingContext.setOutput(stringWriter);
            marshallingContext.marshalDocument(employee, "UTF-8", null);
            String output = stringWriter.toString();
            return output;
        } catch (JiBXException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void unMarshalEmployee(String inputXml){
        try {
            IBindingFactory bindingFactory = BindingDirectory.getFactory(Employee.class);
            IUnmarshallingContext unmarshallingContext = bindingFactory.createUnmarshallingContext();
            StringReader stringReader = new StringReader(inputXml);
            Employee employee  = (Employee) unmarshallingContext.unmarshalDocument(stringReader, null);
            System.out.println("Employee ID:"+employee.getId());
        } catch (JiBXException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        String inputXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Employee id=\"1\"><name>Oleg</name><hiredate>July 20, 2015</hiredate></Employee>";
        Jixb jibx = new Jixb();
        jibx.unMarshalEmployee(inputXml);

        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("Oleg");
        employee.setHireDate("July 20, 2015");

        System.out.println("Employee as XML String:"+jibx.marshalEmployee(employee));
    }
}