package XML.SAX.ReadUTF;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.jar.Attributes;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class Reader {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean bfname = false;
                boolean blname = false;
                boolean bage = false;

                public void startElemnt(String uri, String localName, String qName, Attributes attributes)throws SAXException {
                    System.out.println("Start Element : " + qName);

                    if(qName.equalsIgnoreCase("FIRSTNAME")){
                        bfname = true;
                    }

                    if (qName.equalsIgnoreCase("LASTNAME")){
                        blname = true;
                    }
                    if (qName.equalsIgnoreCase("AGE")){
                        bage = true;
                    }
                }

                public void endElement(String uri, String localName, String qName)throws SAXException{
                    System.out.println("End Element :" + qName);
                }

                public void characters(char ch[], int start, int length)throws SAXException{
                    if (bfname){
                        System.out.println("First Name : " + new String(ch, start, length));
                        bfname = false;
                    }
                    if (blname){
                        System.out.println("Last Name : " + new String(ch, start, length));
                        blname = false;
                    }
                    if (bage){
                        System.out.println("Age : " + new String(ch, start, length));
                        bage = false;
                    }
                }
            };

            File file = new File("d:\\IT\\Project\\JavaCoreTutors\\src\\main\\resources\\file.xml");
            InputStream inputStream = new FileInputStream(file);
            java.io.Reader reader = new InputStreamReader(inputStream, "UTF-8");

            InputSource is = new InputSource(reader);
            is.setEncoding("UTF-8");


            saxParser.parse(is, handler);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}