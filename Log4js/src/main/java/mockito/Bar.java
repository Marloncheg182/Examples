package mockito;

/**
 * Created by Dell on 6/18/2015.
 */
public class Bar {
    private Foo foo;

    public Bar(Foo foo){
        this.foo=foo;
    }
    public String bar(String parameter)
    {
        return foo.foo(parameter);
    }
}
