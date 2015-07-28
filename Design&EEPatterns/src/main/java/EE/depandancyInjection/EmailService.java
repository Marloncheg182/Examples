package EE.depandancyInjection;

/**
 * Created by Dell on 7/28/2015.
 */
public class EmailService {
    public void sendEmail(String message, String receiver){
        // Send mail logic
        System.out.println("Email sent to " + receiver + "with message " + message);
    }
}
