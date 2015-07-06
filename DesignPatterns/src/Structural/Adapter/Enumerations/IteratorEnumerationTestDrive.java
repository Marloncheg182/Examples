package Structural.Adapter.Enumerations;

/**
 * Created by Dell on 6/19/2015.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class IteratorEnumerationTestDrive {
    public IteratorEnumerationTestDrive() {
    }

    public static void main(String[] args) {
        ArrayList l = new ArrayList((Collection)Arrays.asList(args));
        IteratorEnumeration enumeration = new IteratorEnumeration(l.iterator());

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
