package ClassesTypes.Object;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
class Mutable {
    private int integer;

    public Mutable(int intValue) {
        integer = intValue;
    }

    public Mutable add(int a) {
        integer += a;
        return this;
    }

    public Mutable multiply(int a) {
        integer *= a;
        return this;
    }

    public ImutableObjectsExmp makeImmutable2() {
        return new ImutableObjectsExmp(integer);
    }
}

public class ImutableObjectsExmp {
    private int integer;

    public static void main(String[] args) {
        ImutableObjectsExmp i2 = new ImutableObjectsExmp(47);
        ImutableObjectsExmp r1 = modify1(i2);
        ImutableObjectsExmp r2 = modify2(i2);

        System.out.println("i2 = " + i2.read());
        System.out.println("r1 = " + r1.read());
        System.out.println("r2 = " + r2.read());
    }

    public ImutableObjectsExmp(int initVal) {
        integer = initVal;
    }

    public int read() {
        return integer;
    }

    public boolean nonzero() {
        return integer != 0;
    }

    public ImutableObjectsExmp add(int x) {
        return new ImutableObjectsExmp(integer + x);
    }

    public ImutableObjectsExmp multiply(int x){
        return new ImutableObjectsExmp(integer * x);
    }

    public Mutable makeMutable(){
        return new Mutable(integer);
    }

    public static ImutableObjectsExmp modify1(ImutableObjectsExmp y) {
        ImutableObjectsExmp val = y.add(12);
        val = val.multiply(3);
        val = val.add(11);
        val = val.multiply(2);

        return val;
    }
    private static ImutableObjectsExmp modify2(ImutableObjectsExmp y) {
        Mutable m = y.makeMutable();
        m.add(12).multiply(3).add(11).multiply(2);
        return m.makeImmutable2();
    }

}
