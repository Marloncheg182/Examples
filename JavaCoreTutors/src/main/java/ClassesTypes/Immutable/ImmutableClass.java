package ClassesTypes.Immutable;

import java.util.Arrays;

/**
 * Created by O1e6 <NsN> on 17.11.2015.
 */
public final class ImmutableClass {
    private final String[] array;

    public ImmutableClass(String[] arr) {
        this.array = arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Characters in array are: ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        ImmutableClass immutableClass = new ImmutableClass(array);
        System.out.println("Before constructing " + immutableClass);
        args[1] = "C"; // change (i.e. mutate) the element
        System.out.println("After constructing " + immutableClass);
    }

}
