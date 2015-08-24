package IO.FileCheckerEasy;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class FileChecker {
    public static void main(String[] args) {
        File file = new File("c:\\oleg.txt");
        if (file.exists()){
            System.out.println("File existed");
        }else{
            System.out.println("File not found!");
        }
    }
}
