package Util.Collections.ArrayList;

import java.util.ArrayList;

/**
 * Created by O1e6 <NsN> on 12/2/2015.
 */
public class GetSizeOfArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_2");
        arrayList.add("element_3");

        int elementsCount = arrayList.size();

        System.out.println("Elements in Array :");
        for(int i=0; i < elementsCount; i++)

            System.out.println(arrayList.get(i));
    }
}
