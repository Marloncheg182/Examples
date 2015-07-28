package EE.depandancyInjection.Service;

/**
 * Created by Dell on 7/28/2015.
 */
public class EmailServiceImpl implements MessageService{
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + "with message " + msg);
    }
}
