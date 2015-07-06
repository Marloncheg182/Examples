package J2EE.BusinessDelegate;

/**
 * Created by Dell on 6/21/2015.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
