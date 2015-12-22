package lang.management;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class SuggestGarbageCollectionToTheJVM {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long freeMemory = runtime.freeMemory();

        System.out.println("Free memory " + freeMemory);

        runtime.gc();

        freeMemory = runtime.freeMemory();
        System.out.println("Free memory " + freeMemory);
    }
}
