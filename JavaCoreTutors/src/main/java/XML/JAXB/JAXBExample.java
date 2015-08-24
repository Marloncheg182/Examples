package XML.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class JAXBExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("oleg");
        customer.setAge(25);
        try {
            File file = new File("d:\\file.xml");
            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customer, file);
            marshaller.marshal(customer, System.out);
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
