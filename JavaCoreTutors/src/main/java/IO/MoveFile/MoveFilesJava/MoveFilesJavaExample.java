package IO.MoveFile.MoveFilesJava;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class MoveFilesJavaExample {
    public static void main(String[] args) {
        try {
            File oldFile = new File("C:\\newFile.txt");
            if (oldFile.renameTo(new File("C:\\Users\\" + oldFile.getName()))){
                System.out.println("The file was moved successfully to the new folder");

            }else {
                System.out.println("The File was not moved.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
