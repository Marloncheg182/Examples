package Util.Collections.HashMap;

import java.util.HashMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ClearHashMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","value_1");
        hashMap.put("key_2","value_2");
        hashMap.put("key_3","value_3");

        System.out.println("HashMap contains : " + hashMap);
        hashMap.clear();
        System.out.println("HashMap contains : " + hashMap);
    }
}
