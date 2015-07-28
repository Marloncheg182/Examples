package EE.depandancyInjection;

/**
 * Created by Dell on 7/28/2015.
 */
public class MyApplication {
    private EmailService emailService = null;

    public MyApplication(EmailService service) {
        this.emailService = service;
    }

    public void processMessages(String msg, String rec){
        // message validation
        this.emailService.sendEmail(msg,rec);
    }
}
