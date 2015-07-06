package J2EE.ServiceLocator;

/**
 * Created by Dell on 6/21/2015.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndName){
        Service service = cache.getService(jndName);
            if (service != null){
                return service;
            }
        InitialContext context = new InitialContext();
            Service service1 = (Service)context.lookUP(jndName);
            cache.addService(service1);
            return service1;
        }
    }

