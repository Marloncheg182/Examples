package EE.depandancyInjection;

/**
 * Created by Dell on 7/28/2015.
 */
public class TestingClass {
    public static void main(String[] args) {
        MyApplication application = new MyApplication(new EmailService());
        application.processMessages("Hi Oleg", "romanenchuk_oleg@gmail.com");
    }
}
