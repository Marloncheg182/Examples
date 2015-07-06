package J2EE.ServiceLocator;

/**
 * Created by Dell on 6/21/2015.
 */
public class ServiceLocatorLoader {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Servie2");
        service.execute();
    }
}
