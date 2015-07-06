package J2EE.ServiceLocator;

/**
 * Created by Dell on 6/21/2015.
 */
public class Service1 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
