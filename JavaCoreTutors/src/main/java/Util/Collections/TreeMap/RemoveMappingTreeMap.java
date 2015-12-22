package Util.Collections.TreeMap;

import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveMappingTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_2","element_2");
        treeMap.put("key_3","element_3");

        System.out.println("TreeMap contains : " + treeMap);

    /*

Object remove(Object key) operantion removes a key value pair from TreeMap.

It returns either the value mapped with the key previously or null if no value was mapped.
    */
        Object value = treeMap.remove("key_2");

        System.out.println("After removing value : " + value + " TreeMap contains : " + treeMap);

    }
}
