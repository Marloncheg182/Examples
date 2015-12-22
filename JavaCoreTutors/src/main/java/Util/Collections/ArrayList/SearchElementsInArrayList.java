package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class SearchElementsInArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        arrayList.add("element_1");

    /*

boolean contains(Object element) operation returns true

if the ArrayList contains the specified object, false otherwise.
    */
        boolean found = arrayList.contains("element_2");
        System.out.println("Found element_2 : " + found);

    /*

int indexOf(Object element) operation returns the index of the

first occurance of the specified element in ArrayList or -1 if

the specific element is not found. To get the index of the last

occurance of the specified element in ArrayList use the

int lastIndexOf(Object element) operation instead.
    */
        int index = arrayList.indexOf("element_3");
        System.out.println("Found element_3 : " + (index == -1?false:true) + ", in position : " + index);

        int lastIndex = arrayList.lastIndexOf("element_1");
        System.out.println("Found element_1 : " + (lastIndex == -1?false:true) + ", in position : " + lastIndex);

    }
}

