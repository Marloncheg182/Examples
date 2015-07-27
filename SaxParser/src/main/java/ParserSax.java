import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Dell on 7/27/2015.
 */
public class ParserSax {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            MainHandler handler = new MainHandler();
            parser.parse(new File("employees.xml"), handler);
            List<Employee> employees = handler.getList();
            for (Employee employee : employees)
                System.out.println(employee);
            }catch(ParserConfigurationException | SAXException | IOException e){
                e.printStackTrace();
            }
        }
    }
