package EE.depandancyInjection.injector;

import EE.depandancyInjection.Service.SMSServiceImp;
import EE.depandancyInjection.consumer.Consumer;
import EE.depandancyInjection.consumer.MyDIApplication;

/**
 * Created by Dell on 7/28/2015.
 */
public class SMSServiceInjector implements MessageServiceInjector {
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImp());
    }
}
