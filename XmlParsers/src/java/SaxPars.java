package java;

import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Dell on 6/17/2015.
 */
public class SaxPars extends DefaultHandler {

    Doctors doc = new Doctors();
    String thisElement ="";

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("id")) {
            doc.setId(new Integer(new String(ch, start, length)));
        }
        if (thisElement.equals("fam")) {
            doc.setFam(new String(ch, start, length));
        }
        if (thisElement.equals("name")) {
            doc.setName(new String(ch, start, length));
        }
        if (thisElement.equals("otc")) {
            doc.setOtc(new String(ch, start, length));
        }
        if (thisElement.equals("dateb")) {
            doc.setDateb(new String(ch, start, length));
        }
        if (thisElement.equals("datep")) {
            doc.setDatep(new String(ch, start, length));
        }
        if (thisElement.equals("datev")) {
            doc.setDatev(new String(ch, start, length));
        }
        if (thisElement.equals("datebegin")) {
            doc.setDatebegin(new String(ch, start, length));
        }
        if (thisElement.equals("dateend")) {
            doc.setDateend(new String(ch, start, length));
        }
        if (thisElement.equals("vdolid")) {
            doc.setVdolid(new Integer(new String(ch, start, length)));
        }
        if (thisElement.equals("specid")) {
            doc.setSpecid(new Integer(new String(ch, start, length)));
        }
        if (thisElement.equals("klavid")) {
            doc.setKlavid(new Integer(new String(ch, start, length)));
        }
        if (thisElement.equals("stav")) {
            doc.setStav(new Float(new String(ch, start, length)));
        }
        if (thisElement.equals("progid")) {
            doc.setProgid(new Integer(new String(ch, start, length)));
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Stop parse XML...");
    }

    SAXParserFactory factory = new SAXParserFactory().newInstance();
SaxPars saxpars = factory.newSAXParser();
SaxPars sax = new SaxPars();
saxpars.parse(new File(""))

