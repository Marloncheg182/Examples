package XML.Propertis.ConvertXMLToProps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class PropertiesXMLExample {
    public static void main(String[] args) throws IOException{
        Properties properties = new Properties();

        InputStream is = new FileInputStream("d:/email-config.xml");

        properties.loadFromXML(is);

        String email = properties.getProperty("email.support");

        System.out.println(email);

    }
}
