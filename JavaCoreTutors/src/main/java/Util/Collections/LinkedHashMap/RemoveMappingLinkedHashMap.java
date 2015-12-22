package Util.Collections.LinkedHashMap;

import java.util.LinkedHashMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveMappingLinkedHashMap {
    public static void main(String[] args) {


// Create a LinkedHashMap and populate it with elements

        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("key_1","value_1");

        linkedHashMap.put("key_2","value_2");

        linkedHashMap.put("key_3","value_3");


        System.out.println("LinkedhashMap contains : " + linkedHashMap);


/*

  Object remove(Object key) operantion removes a key value pair from LinkedHashMap.

  It returns either the value mapped with the key previously or null if no value was mapped.

*/

        Object value = linkedHashMap.remove("key_2");


        System.out.println("After removing value : " + value + " LinkedhashMap contains : " + linkedHashMap);

    }
}
