package J2EE.ServiceLocator;

/**
 * Created by Dell on 6/21/2015.
 */
public class Service2 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
