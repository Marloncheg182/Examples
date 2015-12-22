package Util.Collections.SafeIteration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 12/14/2015.
 */
public class CollectionSafeIteration {
    public static void main(String[] args) {
        List words  = Collections.synchronizedList(new ArrayList());
        words.add("First string");
        words.add("Second string");
        words.add("Third string");
        synchronized (words){
            Iterator iterator = words.iterator();
            while (iterator.hasNext()){
                String string = (String) iterator.next();
                System.out.println("" + string + ", characters = " + string.length());
            }
        }
    }
}
