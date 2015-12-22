package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveElementFromVector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

        System.out.println("Vector contents : " + vector);

        // boolean remove(Object o) method removes the specific object from the Vector if present and returns true, false otherwise
        boolean removed = vector.remove("element_2");

        System.out.println("Vector contents after removal of element_2 : " + vector);

    }
}
