package Util.Collections.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class CreateListOfNCopies {
    public static void main(String[] args) {
        List list = Collections.nCopies(5,"element");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
