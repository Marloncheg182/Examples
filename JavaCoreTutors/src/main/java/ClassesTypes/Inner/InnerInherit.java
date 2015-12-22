package ClassesTypes.Inner;

/**
 * Created by O1e6 <NsN> on 12/18/2015.
 */
class A{
    protected class Inner {
        public Inner(){
            System.out.println("A.Inner()");
        }
        public void f(){
            System.out.println("A.Inner.f()");
        }
    }
    private Inner y = new Inner();
    public A(){
        System.out.println("New A()");
    }
    public void insertInner(Inner yyy){
        y = yyy;
    }
    public void g(){
        y.f();
    }
}

public class InnerInherit extends A{
    public class B extends A.Inner{
        public B(){
            System.out.println("InnerInherit.B()");
        }

        @Override
        public void f() {
            System.out.println("InnerInherit.B.f()");
        }
    }
    public InnerInherit(){
        insertInner(new B());
    }

    public static void main(String[] args) {
        A e2 = new InnerInherit();
        e2.g();
    }
}
