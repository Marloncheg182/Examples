package Structural.Adapter.Enumerations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Dell on 6/19/2015.
 */
public class EI {
    public EI() {
    }

    public static void main(String[] args) {
        Vector v = new Vector((Collection) Arrays.asList(args));
        Enumeration enumeration = v.elements();

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Iterator iterator = v.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}