package OOP.Inheritance;

/**
 * Created by Oleg Romanenchuk on 8/6/2015.
 */
public class Main {
    public static void main(String[] args) {
        A a = new A("Oleg", 25, "Romanenchuk");
        System.out.println(a.concat("Oleg", "Romanenchuk"));
        A b = new B("Oleg", 25, "Romanenchuk", "Vitalik", "Romanecnuk",31);
        System.out.println(b.concat("Oleg","Vitalik"));
        b.sayHello();
        a.sayHello();
    }

}
