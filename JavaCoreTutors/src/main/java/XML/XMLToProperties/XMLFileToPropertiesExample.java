package XML.XMLToProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class XMLFileToPropertiesExample {
    private static final String xmlFilePath = "C:\\emailProps.xml";

    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream(xmlFilePath);
        properties.loadFromXML(inputStream);
        String email = properties.getProperty("email");
        System.out.println(email);
    }
}
