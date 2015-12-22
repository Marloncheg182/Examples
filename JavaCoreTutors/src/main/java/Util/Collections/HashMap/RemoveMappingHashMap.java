package Util.Collections.HashMap;

import java.util.HashMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class RemoveMappingHashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","value_1");
        hashMap.put("key_2","value_2");
        hashMap.put("key_3","value_3");

        System.out.println("HashMap contains : " + hashMap);

        Object value = hashMap.remove("key_2");

        System.out.println("After removing value : " + value + " HashMap contains : " + hashMap);
    }
}
