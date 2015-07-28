package EE.depandancyInjection.consumer;

import EE.depandancyInjection.Service.MessageService;
import EE.depandancyInjection.injector.MessageServiceInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dell on 7/28/2015.
 */
public class MyDIApplicationTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp() throws Exception {
       injector = new MessageServiceInjector() {
           public Consumer getConsumer() {
               return new MyDIApplication(new MessageService() {
                   public void sendMessage(String ms, String rec) {
                       System.out.println("Mock Message Service implementation");
                   }
               });
           }
       };
    }

    @Test
    public void test() throws Exception {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Oleg","romanenchuk_oleg@gmail.com");
    }

    @After
    public void tear(){
        injector = null;
    }
}