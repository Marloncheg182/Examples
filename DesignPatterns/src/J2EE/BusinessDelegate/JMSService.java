package J2EE.BusinessDelegate;

/**
 * Created by Dell on 6/21/2015.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking of JMSService");
    }
}
