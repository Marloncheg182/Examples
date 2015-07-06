package Structural.Composite.Example2;

import java.util.Iterator;

public class NullIterator implements Iterator {
    public NullIterator() {
    }

    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
