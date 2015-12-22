package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class VectorSizeExample {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_5");

        int elementsCount = vector.size();

        System.out.println("Elements in Vector :");
        for(int i=0; i < elementsCount; i++)

            System.out.println(vector.get(i));

    }
}
