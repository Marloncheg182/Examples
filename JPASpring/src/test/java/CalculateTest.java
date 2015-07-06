import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dell on 6/13/2015.
 */
public class CalculateTest {

    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 2);

        assertEquals(4, n);
    }
}