package Util.Collections.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class HeadmapTreeMap {
    public static void main(String[] args) {

        // Create a TreeMap and populate it with elements
        TreeMap treeMap = new TreeMap();
        treeMap.put("key_1","element_1");
        treeMap.put("key_3","element_3");
        treeMap.put("key_2","element_2");
        treeMap.put("key_4","element_4");
        treeMap.put("key_5","element_5");

    /*

SortedMap headMap(Object toKey) returns the portion of TreeMap whose keys are less than toKey.

The SortedMap returned is backed by the original TreeMap. So any changes made to SortedMap will

be reflected back to original TreeMap.
    */
        SortedMap headMap = treeMap.headMap("key_3");
        System.out.println("headMap contains : " + headMap);
    }
}
