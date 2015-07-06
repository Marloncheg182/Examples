package mockito;

/**
 * Created by Dell on 6/18/2015.
 */
public class BarVoid {
    private FooVoid foo;

    public BarVoid(FooVoid foo) {
        this.foo = foo;
    }
    public void bar(String parameter){
        foo.foo(parameter);
    }
}
