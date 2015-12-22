package Util.Collections.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class CopyHashMapToHashtable {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","new_value_1");
        hashMap.put("key_2","value_2");

        Hashtable hashtable = new Hashtable();
        hashtable.put("key_1","value_1");
        hashtable.put("key_3","value_3");
        hashtable.put("key_4","value_4");

        System.out.println("Elements in Hashtable : " + hashMap);
        hashtable.putAll(hashMap);
        System.out.println("HashMap : " + hashMap);
    }
}
