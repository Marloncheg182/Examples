package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class ConvertArrayListToObjectArray {
    public static void main(String[] args) {

        // Create an ArrayList and populate it with elements
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");
        arrayList.add("element_4");

        // toArray() returns an array containing all of the elements in this list in the correct order
        Object[] objArray = arrayList.toArray();

        System.out.println("Elements in Array :");
        for(int i=0; i < objArray.length ; i++)

            System.out.println(objArray[i]);
    }
}
