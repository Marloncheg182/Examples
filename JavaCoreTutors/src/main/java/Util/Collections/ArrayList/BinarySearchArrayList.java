package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class BinarySearchArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_4");
        arrayList.add("element_5");
        arrayList.add("element_3");
        System.out.println("ArrayList elements : " + arrayList);

        Collections.sort(arrayList);
        int searchIndex1 = Collections.binarySearch(arrayList,"element_2");
        System.out.println("element_2 found at index : " + searchIndex1);

        int searchIndex2 = Collections.binarySearch(arrayList, "elemt_6");
        System.out.println("element_6 should be inserted at index : " + (-(searchIndex2)-1));

    }
}
