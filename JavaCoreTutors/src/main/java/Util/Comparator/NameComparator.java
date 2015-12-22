package Util.Comparator;

import java.util.Comparator;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class NameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
     String name1 = (String) o1;
     String name2 = (String) o2;

        return name1.compareTo(name2);
    }
}
