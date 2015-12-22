package ClassesTypes.Object;

import java.util.Arrays;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class EqualsToNull extends ObjectUtils{
    public static void main(String[] args) {
        A a1 = new A(10, "Oleg");
        A a2 = new A(10, "Vitaly");
        System.out.println(nullSafeEquals(a1, a2));
    }
}

    abstract class ObjectUtils {

        private static final int INITIAL_HASH = 7;
        private static final int MULTIPLIER = 31;
        private static final String EMPTY_STRING = "";
        private static final String NULL_STRING = "null";
        private static final String ARRAY_START = "{";
        private static final String ARRAY_END = "}";
        private static final String EMPTY_ARRAY = ARRAY_START + ARRAY_END;
        private static final String ARRAY_ELEMENT_SEPARATOR = ", ";

        public static boolean nullSafeEquals(Object o1, Object o2){
            if (o1 == o2){
                return true;
        }
            if (o1 == null || o2 == null){
                return false;
            }
            if (o1.equals(o2)){
                return true;
            }
            if (o1 instanceof Object[] && o2 instanceof Object[]) {


                return Arrays.equals((Object[]) o1, (Object[]) o2);

            }

            if (o1 instanceof boolean[] && o2 instanceof boolean[]) {


                return Arrays.equals((boolean[]) o1, (boolean[]) o2);

            }

            if (o1 instanceof byte[] && o2 instanceof byte[]) {


                return Arrays.equals((byte[]) o1, (byte[]) o2);

            }

            if (o1 instanceof char[] && o2 instanceof char[]) {


                return Arrays.equals((char[]) o1, (char[]) o2);

            }

            if (o1 instanceof double[] && o2 instanceof double[]) {


                return Arrays.equals((double[]) o1, (double[]) o2);

            }

            if (o1 instanceof float[] && o2 instanceof float[]) {


                return Arrays.equals((float[]) o1, (float[]) o2);

            }

            if (o1 instanceof int[] && o2 instanceof int[]) {


                return Arrays.equals((int[]) o1, (int[]) o2);

            }

            if (o1 instanceof long[] && o2 instanceof long[]) {


                return Arrays.equals((long[]) o1, (long[]) o2);

            }

            if (o1 instanceof short[] && o2 instanceof short[]) {


                return Arrays.equals((short[]) o1, (short[]) o2);

            }


            return false;
        }
    }
class A {
    public int x;
    public String string;

    public A(int x, String string) {
        this.x = x;
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }else if (o instanceof A){
            A obj = (A) o;

            if (this.x == obj.x && this.equals(obj.string)){
                return true;
            }
        }
        return false;
    }
}