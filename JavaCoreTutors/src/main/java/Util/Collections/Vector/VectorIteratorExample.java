package Util.Collections.Vector;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class VectorIteratorExample {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_5");

        // The Iterator object is obtained using iterator() method
        Iterator it = vector.iterator();

        // To iterate through the elements of the collection we can use hasNext() and next() methods of Iterator
        System.out.println("Vector elements :");
        while(it.hasNext())

            System.out.println(it.next());

    }
}
