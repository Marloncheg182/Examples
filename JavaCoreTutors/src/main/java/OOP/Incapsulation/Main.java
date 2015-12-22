package OOP.Incapsulation;

/**
 * Created by Oleg Romanenchuk on 8/6/2015.
 */
public class Main {
    public static void main(String[] args) {
        Incapsulate m = new Incapsulate("1",20,30L, (byte) 4,'C');
        m.getField1();
        m.getField2();
        m.getField3();
        m.getField4();
        m.getField5();
        System.out.println(m);

    }
}
