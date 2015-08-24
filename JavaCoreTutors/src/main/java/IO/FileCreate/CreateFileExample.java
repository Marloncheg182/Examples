package IO.FileCreate;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("d:\\newfile.txt");
            if(file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
