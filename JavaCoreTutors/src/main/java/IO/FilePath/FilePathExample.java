package IO.FilePath;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class FilePathExample {
    public static void main(String[] args) {
        try {
            String filename = "newFilt.txt";
            String workingDirectory = System.getProperty("user.dir");


            String absoluteFilePath = "";

            absoluteFilePath = workingDirectory + File.separator + filename;

            System.out.println("Final filepath : " + absoluteFilePath);

            File file = new File(absoluteFilePath);
            if (file.createNewFile()){
                System.out.println("File is created!");
            }else {
                System.out.println("File is already existed");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
