package Util.Collections.TreeMap;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class KeySetTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_3","element_3");
        treeMap.put("key_2","element_2");

    /*

Set keySet() returns Set of keys contained in TreeMap.

The key Set is backed by the TreeMap thus elements removed

from the Set will also be removed from the originating TreeMap.

Nevertheless it is not permitted to add an element to the

resultant key set and java.lang.UnsupportedOperationException

exception will be thrown in case we try to.
    */
        Set keySet = treeMap.keySet();

        System.out.println("TreeMap Keys : " + keySet);

        // Remove key_3 from Set
        keySet.remove("key_3");

        System.out.println("after removing key_3 from keySet, keySet contains : " + keySet + " treeMap contains : " + treeMap);
    }
}
