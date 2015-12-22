package lang.management;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class GetNumberOfProcessorsWithRuntime {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int process = runtime.availableProcessors();
        System.out.println("Available processors " + process);
    }
}
