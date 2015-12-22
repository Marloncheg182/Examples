package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ConvertVectorToObjectArray {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_5");

        // toArray() returns an array containing all of the elements in this vector in the correct order
        Object[] objArray = vector.toArray();

        System.out.println("Elements in Array :");
        for(int i=0; i < objArray.length ; i++)

            System.out.println(objArray[i]);

    }
}
