package J2EE.InterceptingFilter;

/**
 * Created by Dell on 6/21/2015.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
