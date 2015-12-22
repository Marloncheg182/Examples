package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class ReplaceElementArrayListIndex {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");

    /*

Use Object set(int index, Object obj) operation to replace an element at

the specified index of ArrayList. It returns the element previously at

the specified position.
    */
        arrayList.set(1,"element_4");

        System.out.println("Elements in ArrayList :");
        for(int i=0; i < arrayList.size(); i++)

            System.out.println(arrayList.get(i));
    }
}
