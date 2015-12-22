package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class ConvertObjectArrayToList {
    public static void main(String[] args) {
        String[] array = new String[] {"element_1","element_2","element_3","element_4","element_5"};

        // static List asList(Object[] objArray) returns a fixed sized list backed by original array
        List list = Arrays.asList(array);

        // Iterate through the list created from Array
        Iterator it = list.iterator();

        System.out.println("Elements in List : ");
        while(it.hasNext())

            System.out.println(it.next());

    }
}
