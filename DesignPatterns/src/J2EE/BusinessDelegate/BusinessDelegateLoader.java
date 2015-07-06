package J2EE.BusinessDelegate;

/**
 * Created by Dell on 6/21/2015.
 */
public class BusinessDelegateLoader {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
