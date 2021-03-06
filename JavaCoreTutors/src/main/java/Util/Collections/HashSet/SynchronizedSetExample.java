package Util.Collections.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SynchronizedSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("element_1");
        hashSet.add("element_2");
        hashSet.add("element_3");
        Set syncSet = Collections.synchronizedSet(hashSet);
        System.out.println("syncSet contains : " + syncSet);
    }
}
