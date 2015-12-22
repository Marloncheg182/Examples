package Util.Collections.HashMap;

import java.util.HashMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class CheckValueHashMap {
    public static void main(String[] args) {

        // Create a HashMap and populate it with elements
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","value_1");
        hashMap.put("key_2","value_2");
        hashMap.put("key_3","value_3");

        // boolean containsValue(Object key) returns true if the HashMap contains the value, otherwise false.
        boolean exists = hashMap.containsValue("value_2");
        System.out.println("value_2 exists in HashMap ? : " + exists);
    }
}
