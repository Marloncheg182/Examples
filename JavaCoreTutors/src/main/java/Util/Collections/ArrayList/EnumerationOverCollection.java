package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class EnumerationOverCollection {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        arrayList.add("element_4");
        arrayList.add("element_5");
        Enumeration enumeration = Collections.enumeration(arrayList);
        System.out.println("Enumerating through ArrayList");
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}
