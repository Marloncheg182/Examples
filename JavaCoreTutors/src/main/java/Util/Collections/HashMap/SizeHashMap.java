package Util.Collections.HashMap;

import java.util.HashMap;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SizeHashMap {
    public static void main(String[] args) {

        // Create a HashMap and populate it with elements
        HashMap hashMap = new HashMap();
        hashMap.put("key_1","value_1");
        hashMap.put("key_2","value_2");
        hashMap.put("key_3","value_3");

        // int size() operation returns the number of key value pairs stored in HashMap
        System.out.println("Size of HashMap : " + hashMap.size());
    }
}
