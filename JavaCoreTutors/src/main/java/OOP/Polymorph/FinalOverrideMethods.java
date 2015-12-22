package OOP.Polymorph;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class FinalOverrideMethods {
    public static void main(String[] args) {
        OverridingPrivateTwo op2 = new OverridingPrivateTwo();

        op2.f();

        op2.g();

        // You can upcast:

        OverridingPrivate op = op2;

        // But you can't call the methods:

        //! op.f();

        //! op.g();

        // Same here:

       // WithFinals wf = op2;

        //! wf.f();

        //! wf.g();

    }
    }




class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivate extends FinalOverrideMethods{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivateTwo extends OverridingPrivate{
    public final void f() {

        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {

        System.out.println("OverridingPrivate2.g()");
    }
}
