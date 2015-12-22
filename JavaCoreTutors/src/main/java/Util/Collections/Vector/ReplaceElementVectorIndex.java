package Util.Collections.Vector;

import java.util.Vector;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ReplaceElementVectorIndex {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("element_1");
        vector.add("element_2");
        vector.add("element_3");

        vector.set(1,"element_4");

        System.out.println("Elements in Vector :");
        for(int i=0; i < vector.size(); i++)

            System.out.println(vector.get(i));
    }
}
