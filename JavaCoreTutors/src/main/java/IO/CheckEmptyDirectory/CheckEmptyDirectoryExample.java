package IO.CheckEmptyDirectory;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class CheckEmptyDirectoryExample {
    public static void main(String[] args) {
        File file = new File("C:\\folder");
        if (file.isDirectory()){
            if (file.list().length>0){
                System.out.println("Directory is not empty!");
            }else{
                System.out.println("Directory is empty!");
            }
        }else{
            System.out.println("This is not a directory");
        }
    }
}
