package Util.Collections.Vector;

import java.util.List;
import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SubListVector {
    public static void main(String[] args) {

        // Create a Vector and populate it with elements
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_4");
        vector.add("element_5");

    /*

 Use the List subList(int startIndex, int endIndex) operation

 to get a sub list of the original Vector. This method

 returns an List object containing elements from startIndex

 to endIndex - 1 of the original Vector
    */
        List subList = vector.subList(1,3);

        System.out.println("Elements in sub list :");
        for(int i=0; i < subList.size() ; i++)

            System.out.println(subList.get(i));

    /*

Sub List returned is backed by original Vector. So any

changes made to sub list will also be reflected to the

original Vector. We will test that by removing an element

from the sub list and check that it is removed from the original

Vector also
    */
        Object obj = vector.remove(0);
        System.out.println(obj + " is removed from sub list");

        System.out.println("Elements in Vector :");
        for(int i=0; i < vector.size() ; i++)

            System.out.println(vector.get(i));

    }
}
