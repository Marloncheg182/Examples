package IO.MoveFile;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class MoveFileExample {
    public static void main(String[] args) {
        try {
            File afile = new File("c:\\folderA\\Afile.txt");

            if (afile.renameTo(new File("c:\\folderB\\" + afile.getName()))) {
                System.out.println("File is moved successful!");
            } else {
                System.out.println("File is failed to move");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
