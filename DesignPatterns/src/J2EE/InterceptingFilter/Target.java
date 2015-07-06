package J2EE.InterceptingFilter;

/**
 * Created by Dell on 6/21/2015.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request : " + request);
    }
}
