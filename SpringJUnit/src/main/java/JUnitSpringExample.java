import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class JUnitSpringExample {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testSampleService() {
        assertEquals("class SampleServiceImpl",
                this.sampleService.getClass().toString());
    }

    @Test
    public void testSampleServiceGetAccountDescription() {
        assertTrue(sampleService.getOrderDescription().contains("Description :"));
    }

    @Test
    public void testSampleServiceGetAccountCode() {
        assertTrue(sampleService.getOrderStringCode().contains("Code:"));

    }
    @Test
    public void testSampleServiceCreateNewOrder(){
        Order newOrder = new Order();
        newOrder.setSecurityCode("XYZ");
        newOrder.setDescription("Description");
        if (newOrder !=null){
            assertThat(sampleService.createOrder(newOrder),
                    instanceOf(Order.class));
            assertNotNull("Security isn't null", newOrder.getSecurityCode());
            assertNotNull("Description isn't not null",
                    newOrder.getDescription());
        }
        assertNotNull("New Order is not null", newOrder);
    }
    @Test
    public void testSampleServiceGetOrder(){
        Order existingOrder = sampleService.getOrder(0);
        if (existingOrder !=null){
            assertThat(sampleService.getOrder(0),instanceOf(Order.class));
            assertNotNull("Security isn't null", existingOrder.getSecurityCode());
            assertNotNull("Description isn't not null", existingOrder.getDescription());
        }
        assertNotNull("Object is not null", existingOrder);
    }
}