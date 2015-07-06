package J2EE.InterceptingFilter;

/**
 * Created by Dell on 6/21/2015.
 */
public class InterceptingFilterLoader {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
