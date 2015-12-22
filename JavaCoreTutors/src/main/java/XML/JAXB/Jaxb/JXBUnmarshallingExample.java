package XML.JAXB.Jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class JXBUnmarshallingExample {
    private static final String xmlFilePath = "C:\\Student.xml";

    public static void main(String[] args) {
        try {
            File xmlFile = new File(xmlFilePath);
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Student student = (Student)unmarshaller.unmarshal(xmlFile);
            System.out.println(student);
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
