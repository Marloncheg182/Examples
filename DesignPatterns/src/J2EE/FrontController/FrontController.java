package J2EE.FrontController;

/**
 * Created by Dell on 6/21/2015.
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested : " + request);
    }

    public void dispatchRequest(String request) {
        // log each request
        trackRequest(request);

        // authenticate the user
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
