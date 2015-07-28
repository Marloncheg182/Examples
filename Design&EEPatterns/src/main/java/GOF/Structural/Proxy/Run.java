package GOF.Structural.Proxy;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        Function function = new FunctionProxy("Accessible", "open with");
        try {
            function.runFunction("add -new dir");
            function.runFunction("run with -browser");
        }catch (Exception e){
            System.out.println("Exception while running : " + e.getMessage());
        }
    }
}
