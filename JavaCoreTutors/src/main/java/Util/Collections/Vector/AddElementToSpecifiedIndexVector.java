package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class AddElementToSpecifiedIndexVector {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

    /*

To add an element at the specified index of Vector use

void add(int index, Object obj) method. This method does

NOT overwrite the element previously at the specified index

in the vector rather it shifts the existing elements to right

side increasing the vector size by 1.
    */
        vector.add(1,"new_element");

        System.out.println("Elements in Vector : ");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));

    }
}
