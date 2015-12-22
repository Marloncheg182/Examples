package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveElementFromVectorIndex {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

    /*

To remove an element from the specified index of Vector use

Object remove(int index) method.

The method returns a reference to the element that was removed.
    */
        Object obj = vector.remove(2);
        System.out.println(obj + " is removed from Vector");

        System.out.println("Elements in Vector :");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));

    }
}
