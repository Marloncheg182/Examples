package Util.Collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class KeySetLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key_1","value_1");
        linkedHashMap.put("key_2","value_2");
        linkedHashMap.put("key_3","value_3");

        Set keySet = linkedHashMap.keySet();
        System.out.println("keySet contains : " + keySet);
        keySet.remove("key_2");
        System.out.println("after removing key_2 from keySet, keySet contains : " + keySet + " linkedHashMap contains : " + linkedHashMap);
    }
}
