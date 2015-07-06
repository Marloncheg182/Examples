import mockito.Bar;
import mockito.Foo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

/**
 * Created by Dell on 6/18/2015.
 */
public class MockitoTestSetup {
    private Foo foo;
    private Bar bar;

    @Before
    public void init(){
        foo = Mockito.mock(Foo.class);
        bar = new Bar(foo);
    }

    @Test
    public void test()
    {
        bar.bar("qwe");
        verify(foo).foo("qwe");
    }


}
