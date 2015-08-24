package XML.Propertis.PropertiesXML;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class PropertiesXMLExample {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("email.support", "marloncheg182@gmail.com");

        OutputStream os =  new FileOutputStream("d:/email-config.xml");
        props.storeToXML(os, "Support Email", "UTF-8");

        System.out.println("Done");
    }
}
