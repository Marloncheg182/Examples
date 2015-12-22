package Util.Collections.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SubMapTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_3","element_3");
        treeMap.put("key_2","element_2");
        treeMap.put("key_4","element_4");
        treeMap.put("key_5","element_5");

    /*

 Use the SortedMap subMap(Object fromKey, Object toKey) operation

 to get a sub Map of the original TreeMap. This method

 returns an SortedMap object containing elements from fromKey

 to toKey - 1 of the original TreeMap
    */
        SortedMap sortedMap = treeMap.subMap("key_2","key_5");

        System.out.println("SortedMap Contains : " + sortedMap);

    /*

Sub Map returned is backed by original TreeMap. So any

changes made to sub map will also be reflected to the

original TreeMap. We will test that by removing an element

from the sub map and check that it is removed from the original

TreeMap also
    */
        Object obj = sortedMap.remove("key_3");
        System.out.println(obj + " is removed from sub map");

        System.out.println("Elements in TreeMap : " + treeMap);
    }
}
