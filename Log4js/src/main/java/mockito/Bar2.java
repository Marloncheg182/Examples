package mockito;

/**
 * Created by Dell on 6/18/2015.
 */
public class Bar2 {
    private Foo foo1;
    private Foo foo2;

    public Bar2(Foo foo1, Foo foo2) {
        this.foo1 = foo1;
        this.foo2 = foo2;
    }
    public void bar(String parameter)
    {
        foo1.foo(parameter);
        foo2.foo(parameter);
    }
}
