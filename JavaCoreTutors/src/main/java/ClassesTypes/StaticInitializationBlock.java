package ClassesTypes;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
public class StaticInitializationBlock {
    static int[] val = new int[10];

    static {
        System.out.println("Running initialization block.");
        for (int i = 0; i < val.length; i++) {
            val[i] = (int) (100.0 * Math.random());
        }
    }

    void values() {
        for (int i = 0; i < val.length; i++) {
            System.out.println(" " + val[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StaticInitializationBlock staticBlock = new StaticInitializationBlock();
        staticBlock.values();

        staticBlock = new StaticInitializationBlock();
        staticBlock.values();
    }
}
