package Structural.Adapter.Enumerations;

/**
 * Created by Dell on 6/19/2015.
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public EnumerationIteratorTestDrive() {
    }

    public static void main(String[] args) {
        Vector v = new Vector((Collection)Arrays.asList(args));
        EnumerationIterator iterator = new EnumerationIterator(v.elements());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}