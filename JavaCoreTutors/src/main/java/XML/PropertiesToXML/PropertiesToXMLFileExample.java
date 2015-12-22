package XML.PropertiesToXML;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class PropertiesToXMLFileExample {
    private static final String xmlFilePath = "C:\\emailProps.xml";

    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();
        properties.setProperty("email", "example@gmail.com");
        OutputStream outputStream = new FileOutputStream(xmlFilePath);
        properties.storeToXML(outputStream, "email", "UTF-8");
        System.out.println("XML File was created!");
    }
}
