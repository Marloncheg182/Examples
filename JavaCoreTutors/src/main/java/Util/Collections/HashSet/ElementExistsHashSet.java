package Util.Collections.HashSet;

import java.util.HashSet;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class ElementExistsHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("element_1");
        hashSet.add("element_2");
        hashSet.add("element_3");

        // boolean contains(Object value) method returns true if the HashSet contains the value, otherwise false.
        boolean exists = hashSet.contains("element_2");
        System.out.println("element_2 exists in HashSet ? : " + exists);
    }
}
