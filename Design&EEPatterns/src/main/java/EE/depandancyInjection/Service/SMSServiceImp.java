package EE.depandancyInjection.Service;

/**
 * Created by Dell on 7/28/2015.
 */
public class SMSServiceImp implements MessageService {
    public void sendMessage(String ms, String rec) {
        System.out.println("SMS sent to " + rec + "with message" + ms);
    }
}
