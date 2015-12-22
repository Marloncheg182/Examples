package IO.ListDirectoryContents;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/27/2015.
 */
public class ListDirectoryContents {
    public static void main(String[] args) {
        File dir = new File("C://dir");
        String[] files = dir.list();
        System.out.println("Listing contents of directory: " + dir.getPath());
        for (int i = 0; i < files.length; i++) {
            System.out.println("File/dir was found " + files[i]);
        }
    }
}