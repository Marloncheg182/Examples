package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class ArrayListIteratorExample {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        arrayList.add("element_4");
        arrayList.add("element_5");

        // The Iterator object is obtained using iterator() method
        Iterator it = arrayList.iterator();

        // To iterate through the elements of the collection we can use hasNext() and next() methods of Iterator
        System.out.println("ArrayList elements :");
        while(it.hasNext())

            System.out.println(it.next());
    }

}
