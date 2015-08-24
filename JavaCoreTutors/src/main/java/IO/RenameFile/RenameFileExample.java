package IO.RenameFile;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class RenameFileExample {
    public static void main(String[] args) {
        File oldfile = new File("oldfile.txt");
        File newfile = new File("newfile.txt");

        if (oldfile.renameTo(newfile)){
            System.out.println("Rename successful");
        }else{
            System.out.println("Rename failed");
        }
    }
}
