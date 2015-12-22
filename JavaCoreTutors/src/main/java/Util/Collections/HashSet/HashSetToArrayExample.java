package Util.Collections.HashSet;

import java.util.HashSet;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class HashSetToArrayExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("element_1");
        hashSet.add("element_2");
        hashSet.add("element_3");

        Object[] objArray = hashSet.toArray();

        System.out.println("Elements in Array :");
        for(int i=0; i < objArray.length ; i++)

            System.out.println(objArray[i]);
    }
}
