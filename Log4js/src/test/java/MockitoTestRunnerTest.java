import org.junit.Test;
import org.junit.runner.RunWith;
import mockito.Bar;
import mockito.Foo;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by Dell on 6/18/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTestRunnerTest {

    @Mock
    private Foo foo;

    @InjectMocks
    private Bar bar = new Bar(null);
    @Test
    public void testTest1() {
        bar.bar("qwe");
        verify(foo).foo("qwe");

    }
}