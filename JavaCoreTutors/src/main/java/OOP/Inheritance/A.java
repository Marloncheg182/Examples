package OOP.Inheritance;

/**
 * Created by Oleg Romanenchuk on 8/6/2015.
 */
public class A {
    public String a = "first_name";
    public String b = "second_name";
    public int age = 25;

    public A(String a, int age, String b) {
        this.a = a;
        this.age = age;
        this.b = b;
    }

    public String concat(String a, String b){
        return a + b;
    }

    public void sayHello(){
        System.out.println("Hello people!");
    }
}
