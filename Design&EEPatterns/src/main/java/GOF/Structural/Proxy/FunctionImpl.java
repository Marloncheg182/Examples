package GOF.Structural.Proxy;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class FunctionImpl implements Function {
    @Override
    public void runFunction(String funct) throws Exception {
        Runtime.getRuntime().exec(funct);
        System.out.println("'" + funct + "'" + "function success");

    }
}
