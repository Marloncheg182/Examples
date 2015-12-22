package ClassesTypes;

import java.lang.reflect.Field;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class GenericCopy {
    public static void main(String[] args) {
    A a1 = new A(1, 2, new B("string 1", 10));
    A a2 = new A(3, 4, new B("string 2", 20));

        System.out.println("a1 is :" + a1);
        System.out.println("a2 is :" + a2);

        copyFields(a1, a2);

        System.out.println("After copying...");
        System.out.println("a1 is :" + a1);
        System.out.println("a1 is :" + a2);
    }

    private static <T> void copyFields(T from, T to) {
        for (Field f: from.getClass().getFields()){
            try {
              if(isPrimitivish(f.getType())){
                  f.set(to, f.get(from));
              }else {
                  copyFields(f.get(from), f.get(to));
              }
            }catch (IllegalArgumentException | IllegalAccessException e){
                e.printStackTrace();
            }
        }
    }

    private static boolean isPrimitivish(Class<?> c) {
        return c.isPrimitive() || c == String.class || c == Boolean.class
                || c == Byte.class || c == Short.class || c == Character.class


                || c == Integer.class || c == Float.class || c == Double.class


                || c == Long.class;
    }

}
class A {
    public int x;
    public int y;
    public B bObj;

    public A(int x, int y, B b) {
        this.x = x;
        this.y = y;
        this.bObj = b;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", bObj=" + bObj +
                '}';
    }
}
class B{
    public String str;
    public int z;

    public B(String str, int z) {
        this.str = str;
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
                "str='" + str + '\'' +
                ", z=" + z +
                '}';
    }
}