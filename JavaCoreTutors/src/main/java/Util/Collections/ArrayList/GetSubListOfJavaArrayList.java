package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class GetSubListOfJavaArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        arrayList.add("element_4");
        arrayList.add("element_5");

    /*

 Use the List subList(int startIndex, int endIndex) operation

 to get a sub list of the original ArrayList. This method

 returns an List object containing elements from startIndex

 to endIndex - 1 of the original ArrayList.
    */
        List subList = arrayList.subList(1,3);

        System.out.println("Elements in sub list :");
        for(int i=0; i < subList.size() ; i++)

            System.out.println(subList.get(i));

    /*

Sub List returned is backed by original Arraylist. So any

changes made to sub list will also be reflected to the

original ArrayList. We will test that by removing an element

from the sub list and check that it is removed from the original

ArrayList also
    */
        Object obj = subList.remove(0);
        System.out.println(obj + " is removed from sub list");

        System.out.println("Elements in ArrayList :");
        for(int i=0; i < arrayList.size() ; i++)

            System.out.println(arrayList.get(i));
    }
}
