package Util.Collections.HashSet;

import java.util.HashSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveElementHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("element_1");
        hashSet.add("element_2");
        hashSet.add("element_3");

        System.out.println("HashSet contents : " + hashSet);

        // boolean remove(Object o) method removes the specific object from the HashSet if present and returns true, false otherwise
        boolean removed = hashSet.remove("element_2");

        System.out.println("HashSet contents after removal of element_2 : " + hashSet);
    }
}
