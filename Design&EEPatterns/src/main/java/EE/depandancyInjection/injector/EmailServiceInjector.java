package EE.depandancyInjection.injector;


import EE.depandancyInjection.Service.EmailServiceImpl;
import EE.depandancyInjection.Service.MessageService;
import EE.depandancyInjection.consumer.Consumer;
import EE.depandancyInjection.consumer.MyDIApplication;

/**
 * Created by Dell on 7/28/2015.
 */
public class EmailServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        MyDIApplication application = new MyDIApplication(new MessageService() {
            public void sendMessage(String ms, String rec) {

            }
        });
        application.setService(new EmailServiceImpl());
        return application;
    }
}
