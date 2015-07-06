package Structural.Adapter.Enumerations;

/**
 * Created by Dell on 6/19/2015.
 */
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    public Object nextElement() {
        return this.iterator.next();
    }
}
