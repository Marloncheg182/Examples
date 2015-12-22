package Util.Collections.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedHashSetSize {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("element_1");
        linkedHashSet.add("element_2");
        linkedHashSet.add("element_3");

        // int size() method returns the number of elements in the LinkedHashSet
        System.out.println("Size of LinkedHashSet : " + linkedHashSet.size());

        // Remove one element from the LinkedHashSet using remove method
        linkedHashSet.remove("element_2");
        System.out.println("Size of LinkedHashSet : " + linkedHashSet.size());
    }
}
