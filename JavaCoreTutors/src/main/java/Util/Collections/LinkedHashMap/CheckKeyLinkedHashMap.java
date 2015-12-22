package Util.Collections.LinkedHashMap;

import java.util.LinkedHashMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class CheckKeyLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key_1","value_1");
        linkedHashMap.put("key_2","value_2");
        linkedHashMap.put("key_3","value_3");

        boolean exists = linkedHashMap.containsKey("key_2");
        System.out.println("key_2 exists in LinkedHashMap ? : " + exists);
    }
}
