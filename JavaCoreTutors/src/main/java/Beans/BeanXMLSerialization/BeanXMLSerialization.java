package Beans.BeanXMLSerialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class BeanXMLSerialization {
    public static void main(String[] args) throws FileNotFoundException {
        Bean bean = new Bean();
        bean.setProperty1("value1");
        bean.setProperty2(2);

        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("out.xml")));
        encoder.writeObject(bean);
        encoder.close();
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
