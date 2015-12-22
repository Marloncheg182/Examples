package XML.JAXB.Jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class JXBMarshallingExample {
    private static final String xmlFilePath = "C:\\Student.xml";

    public static void main(String[] args) {
        Student student = new Student("Oleg", "Olegovich", 25,100);
        try {
            File xmlfile = new File(xmlFilePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(student, xmlfile);

            System.out.println("File was created successfully");
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
