package ClassesTypes.Object;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class IdentifyHashCode {
    public static void main(String[] args) {
        File file1 = new File("C:/Users/1/Desktop/snippets-howto.txt");
        File file2 = new File("C:/Users/1/Desktop/snippets-howto2.txt");
        File file3 = new File("C:/Users/1/Desktop/snippets-howto3.txt");

        int ihc1 = System.identityHashCode(file1);
        System.out.println(ihc1);
        int ihc2 = System.identityHashCode(file2);
        System.out.println(ihc2);
        int ihc3 = System.identityHashCode(file3);
        System.out.println(ihc3);
    }
}
