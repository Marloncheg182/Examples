package GOF.Structural.Proxy;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class FunctionProxy implements Function{

    private boolean isAvailable;
    private Function function;

    public FunctionProxy(String permission, String confirmation) {
        if ("Accessible".equals(permission)&& "Agree".equals(confirmation))isAvailable=true;
        function = new FunctionImpl();
    }

    @Override
    public void runFunction(String funct) throws Exception {
    if (isAvailable){
        function.runFunction(funct);
    } else {
        if (funct.trim().startsWith("run")){
            throw new Exception("run command is not available");
        }else{
            function.runFunction(funct);
        }
    }
    }
}
