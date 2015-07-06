package J2EE.InterceptingFilter;

/**
 * Created by Dell on 6/21/2015.
 */
public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
