package Util.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/1/2015.
 */
public class UnmodifiableCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("elemnt_1");
        list.add("elemnt_2");
        list.add("elemnt_3");

        Collection unmodifiableCollection = Collections.unmodifiableCollection(list);
        System.out.println("unmodifiableCollection contains : " + unmodifiableCollection);
    }
}
