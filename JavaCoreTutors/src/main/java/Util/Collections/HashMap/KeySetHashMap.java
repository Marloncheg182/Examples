package Util.Collections.HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class KeySetHashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","value_1");
        hashMap.put("key_2","value_2");
        hashMap.put("key_3","value_3");

        Set keySet = hashMap.keySet();
        System.out.println("keySet contains " + keySet);
        keySet.remove("key_2");
        System.out.println("after removing key_2 from keySet, keySet contains : " + keySet + " hashMap contains : " + hashMap);
    }
}
