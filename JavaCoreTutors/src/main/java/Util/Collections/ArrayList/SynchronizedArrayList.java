package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SynchronizedArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        List syncList = Collections.synchronizedList(arrayList);
        System.out.println("syncList contains : " + syncList);
    }
}
