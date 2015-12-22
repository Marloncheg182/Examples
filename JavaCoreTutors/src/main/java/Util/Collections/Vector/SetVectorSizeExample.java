package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class SetVectorSizeExample {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");
        vector.add("element_2");

        vector.setSize(3);
        System.out.println(vector.size());
        vector.setSize(5);
        System.out.println(vector.size());

    }
}
