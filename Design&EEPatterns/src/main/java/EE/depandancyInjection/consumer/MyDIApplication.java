package EE.depandancyInjection.consumer;

import EE.depandancyInjection.Service.MessageService;

/**
 * Created by Dell on 7/28/2015.
 */
public class MyDIApplication implements Consumer {

    private MessageService service;

    public MyDIApplication(MessageService service) {
        this.service = service;
    }

    // Dependency injection, using setter
    public void setService(MessageService sc) {
        this.service = sc;
    }

    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg,rec);
    }
}
