package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ClearVectorExample {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

        System.out.println("Vector size before removing elements : " + vector.size());

        // Vector clear() operation removes all elements
        vector.clear();

        System.out.println("Vector size after removing elements : " + vector.size());

    }
}
