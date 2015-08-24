package OOP.Polymorph;

/**
 * Created by Oleg Romanenchuk on 8/5/2015.
 */
public class Main {
    public static void main(String[] args) {

        A a = new B("1", "2", "3", "4");
        a.m1();     // вызовется из А
        a.m2();     // вызовется из B
        //a.m3();   // не вызовется, нет в А, следовательно не переопределен
        a.m4();    // если определен интерфейсом, вызовется в А, если переопределен из А в B, вызовется из B

        Polymorphic p = new B("1", "3", "4","2");
        p.m4(); // вызовется из класса А, в котором реализовывается метод m4
    }
}
