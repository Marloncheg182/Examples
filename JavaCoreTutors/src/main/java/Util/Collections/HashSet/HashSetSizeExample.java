package Util.Collections.HashSet;

import java.util.HashSet;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class HashSetSizeExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("element_1");
        hashSet.add("element_2");
        hashSet.add("element_3");

        System.out.println("Size of HashSet : " + hashSet.size());

        hashSet.remove("element_2");
        System.out.println("Size of HashSet : " + hashSet.size());
    }
}
