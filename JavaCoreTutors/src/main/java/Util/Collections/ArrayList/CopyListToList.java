package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class CopyListToList {
    public static void main(String[] args) {

    /*

Please note that the same API applies to any type of

List implementation classes e.g. LinkedList etc
     */

        // Create an ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("arl_element_1");
        arrayList.add("arl_element_4");
        arrayList.add("arl_element_2");
        arrayList.add("arl_element_5");
        arrayList.add("arl_element_3");

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("vec_element_1");
        vector.add("vec_element_6");
        vector.add("vec_element_7");
        vector.add("vec_element_4");
        vector.add("vec_element_2");
        vector.add("vec_element_5");
        vector.add("vec_element_3");

        System.out.println("Vector Contains : " + vector);

    /*

static void copy(List dstList, List sourceList) method copies all elements

of source list to destination list overriding any element of the destination

list that resides at the same index position as the one from the source list.

The destination list must be long enough to hold all copied elements of the

source list otherwise IndexOutOfBoundsException is thrown
     */
        Collections.copy(vector, arrayList);

        System.out.println("Vector elements after copy : " + vector);
    }
}
