package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SearchElementsVector {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_1");

    /*

boolean contains(Object element) operation returns true

if the Vector contains the specified object, false otherwise.
    */
        boolean found = vector.contains("element_2");
        System.out.println("Found element_2 : " + found);

    /*

int indexOf(Object element) operation returns the index of the

first occurance of the specified element in Vector or -1 if

the specific element is not found. To get the index of the last

occurance of the specified element in Vector use the

int lastIndexOf(Object element) operation instead.
    */
        int index = vector.indexOf("element_3");
        System.out.println("Found element_3 : " + (index == -1?false:true) + ", in position : " + index);

        int lastIndex = vector.lastIndexOf("element_1");
        System.out.println("Found element_1 : " + (lastIndex == -1?false:true) + ", in position : " + lastIndex);

    }
}
