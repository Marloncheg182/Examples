package Util.Collections.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ElementExistsLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("element_1");
        linkedHashSet.add("element_2");
        linkedHashSet.add("element_3");

        boolean exists = linkedHashSet.contains("element_2");
        System.out.println("element_2 exists in LinkedHashSet ? : " + exists);
    }
}
