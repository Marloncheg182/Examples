package Util.Collections.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SynchronizedMapExample {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("key_1", "value_1");
        hashMap.put("key_2", "value_2");
        hashMap.put("key_3", "value_3");

        Map syncMap = Collections.synchronizedMap(hashMap);
        System.out.println("syncMap contains : " + syncMap);
    }
}
