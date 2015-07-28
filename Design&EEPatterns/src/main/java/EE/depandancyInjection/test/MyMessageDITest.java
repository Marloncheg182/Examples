package EE.depandancyInjection.test;

import EE.depandancyInjection.consumer.Consumer;
import EE.depandancyInjection.injector.EmailServiceInjector;
import EE.depandancyInjection.injector.MessageServiceInjector;

/**
 * Created by Dell on 7/28/2015.
 */
public class MyMessageDITest {
    public static void main(String[] args) {
        String ms = "Hi Oleg";
        String email = "romanenchuk_oleg@gmail.com";
        String phone = "+380..-...-..-..";
        MessageServiceInjector injector = null;
        Consumer consumer = null;

        injector = new EmailServiceInjector();
        consumer = injector.getConsumer();
        consumer.processMessages(ms,phone);
    }
}
