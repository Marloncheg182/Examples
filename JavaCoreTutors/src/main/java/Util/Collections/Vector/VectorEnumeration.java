package Util.Collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class VectorEnumeration {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_3");
        vector.add("element_5");
        vector.add("element_2");
        vector.add("element_4");

        Enumeration vectorEnumElements = vector.elements();

        System.out.println("Vector elements : ");
        while (vectorEnumElements.hasMoreElements())
            System.out.println(vectorEnumElements.nextElement());
    }
}
