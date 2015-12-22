package Beans.BeanXMLDeserialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class BeanXMLDeserialization {
    public static void main(String[] args) throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("in.xml")));
        Bean bean = (Bean)decoder.readObject();
        decoder.close();

        System.out.println("Property 1 value : " + bean.getProperty1());
        System.out.println("Property 2 value : " + bean.getProperty2());

    }

    private static class Bean {

        private String property1;
        private int property2;

        public String getProperty1() {
            return property1;
        }

        public void setProperty1(String property1) {
            this.property1 = property1;
        }

        public int getProperty2() {
            return property2;
        }

        public void setProperty2(int property2) {
            this.property2 = property2;
        }
    }

}
