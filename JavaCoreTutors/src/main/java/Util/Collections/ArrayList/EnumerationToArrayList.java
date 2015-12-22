package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class EnumerationToArrayList {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_2");
        vector.add("element_5");

        System.out.println("Vector elements : " + vector);

        Enumeration elementsEnumeration = vector.elements();

        ArrayList arrayList = Collections.list(elementsEnumeration);

        System.out.println("Arraylist elements : " + arrayList);
    }
}
