/**
 * Created by Oleg Romanenchuk on 8/6/2015.
 */
public class TestMain {
    private void method1() {
        MyClass obj = new MyClass();
        obj.x = 1;
        method2(obj);
        System.out.println("obj.x=" + obj.x);
    }
    private void method2(MyClass param) {
        param.x = 2;

    }
    class MyClass {
        int x;
    }
    public static void main(String[] args) {
        new TestMain().method1();
    }
}