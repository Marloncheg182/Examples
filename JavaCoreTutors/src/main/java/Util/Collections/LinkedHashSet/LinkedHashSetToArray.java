package Util.Collections.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class LinkedHashSetToArray {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("element_1");
        linkedHashSet.add("element_2");
        linkedHashSet.add("element_3");

        Object[] objArray = linkedHashSet.toArray();

        System.out.println("Elements in Array :");
        for (int i = 0; i < objArray.length; i++)
            System.out.println(objArray[i]);
    }
}
