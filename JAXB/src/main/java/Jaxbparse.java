/**
 * Created by Dell on 7/27/2015.
 */

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Jaxbparse {
    private static final String FILE_NAME = "jaxb.xml";

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setAge(25);
        employee.setName("Oleg");
        employee.setGender("Male");
        employee.setRole("Java Developer");
        employee.setPassword("oleg");

        jaxbObjectToXml(employee);

        Employee employeeFrom = jaxbXmlToObject();
        System.out.println(employeeFrom.toString());
    }

    private static Employee jaxbXmlToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance();
            Unmarshaller unmarshaller = null;
            unmarshaller = context.createUnmarshaller();
            Employee employee = (Employee) unmarshaller.unmarshal(new File(FILE_NAME));
            return employee;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void jaxbObjectToXml(Employee employee) {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(employee, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

