package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SearchVectorElementFromIndex {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_2");

        int index = vector.indexOf("element_2", 3);
        System.out.println("Found element_2 after position 3 : " + (index == -1?false:true) + ", in position : " + index);

        int lastIndex = vector.lastIndexOf("element_2", 6);
        System.out.println("Found element_2 before position 5 : " + (lastIndex == -1?false:true) + ", in position : " + lastIndex);
    }
}
