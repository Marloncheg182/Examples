package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class AddElementToSpecifiedIndexOfArrayList {
    public static void main(String[] args) {

        // Create an ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");

    /*

To add an element at the specified index of ArrayList use

void add(int index, Object obj) method. This method does

NOT overwrite the element previously at the specified index

in the list rather it shifts the existing elements to right

side increasing the list size by 1.
    */
        arrayList.add(1, "new_element");

        System.out.println("Elements in ArrayList :");

        for (int i = 0; i < arrayList.size(); i++)

            System.out.println(arrayList.get(i));
    }
}