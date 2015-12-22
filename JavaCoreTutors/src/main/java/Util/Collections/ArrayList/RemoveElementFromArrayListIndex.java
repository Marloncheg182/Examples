package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class RemoveElementFromArrayListIndex {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");

    /*

To remove an element from the specified index of ArrayList use

Object remove(int index) method.

The method returns a reference to the element that was removed.
    */
        Object obj = arrayList.remove(2);
        System.out.println(obj + " is removed from ArrayList");

        System.out.println("Elements in ArrayList :");
        for(int i=0; i < arrayList.size(); i++)

            System.out.println(arrayList.get(i));
    }
}
