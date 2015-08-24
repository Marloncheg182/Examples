package IO.TraverseDirectory;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class DisplayDirectoryAndFile {
    public static void main(String[] args) {
        displayIt(new File("C:\\Downloads"));
    }

    private static void displayIt(File node) {
        System.out.println(node.getAbsoluteFile());
        if (node.isDirectory()){
            String[]subNote = node.list();
            for (String filename : subNote) {
                displayIt(new File(node, filename));
            }
        }
    }
}
