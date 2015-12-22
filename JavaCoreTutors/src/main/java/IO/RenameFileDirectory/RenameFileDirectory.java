package IO.RenameFileDirectory;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/26/2015.
 */
public class RenameFileDirectory {
    public static void main(String[] args) {
        File file = new File("C://file.txt");
        File newFile = new File("C://new_file.txt");
        boolean renamed = file.renameTo(newFile);

        if (renamed){
            System.out.println("File renamed to " + newFile.getPath());
        }else {
            System.out.println("Error in rename process " + file.getPath());
        }
    }
}
