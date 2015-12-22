package IO.FileDescriptorExample;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class JavaFileDescriptorExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(
                "/Users/anirudh/test.txt"));
        FileDescriptor fd = fileInputStream.getFD();
        System.out.println(" File descriptor of the file /Users/anirudh/test.txt : "
                + fd.hashCode());

        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(new File(
                "/Users/anirudh/test2.txt"));
        FileDescriptor fd2 = fileOutputStream.getFD();
        System.out.println(" File descriptor of the file /Users/anirudh/test2.txt : "
                + fd2.hashCode());

        fileOutputStream.close();

    }

}
