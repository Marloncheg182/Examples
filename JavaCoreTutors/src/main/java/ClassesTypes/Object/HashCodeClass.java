package ClassesTypes.Object;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class HashCodeClass {
    public static void main(String[] args) {
        File file1 = new File("f1");
        File file2 = new File("f2");
        File file3 = new File("f3");

        int hc1 = file1.hashCode();
        System.out.println(hc1);
        int hc2 = file2.hashCode();
        System.out.println(hc2);
        int hc3 = file3.hashCode();
        System.out.println(hc3);
    }
}
