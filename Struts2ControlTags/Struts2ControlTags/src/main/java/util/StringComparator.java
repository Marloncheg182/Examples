package util;

import java.util.Comparator;

/**
 * @author Oleg Romanenchuk
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String param1, String param2) {
        return param1.compareToIgnoreCase(param2);
    }
}
