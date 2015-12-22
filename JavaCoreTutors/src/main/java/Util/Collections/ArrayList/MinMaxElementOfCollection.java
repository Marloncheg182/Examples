package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class MinMaxElementOfCollection {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_3");
        arrayList.add("element_4");
        arrayList.add("element_2");
        arrayList.add("element_5");
        Object minimum = Collections.min(arrayList);
        Object maximum = Collections.max(arrayList);
        System.out.println("Minimum element of ArrayList : " + minimum + ", Maximum Element of ArrayList : " + maximum);
    }
}
