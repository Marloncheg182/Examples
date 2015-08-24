package IO.CreateDirectory;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class CreateDirectoryExample {
    public static void main(String[] args) {
        File file = new File("C:\\Directory");
        if (!file.exists()){
            if (file.mkdir()){
                System.out.println("Directory is created!");
            }else{
                System.out.println("Failed to create directory!");
            }
        }
        File files = new File("C:\\Directory\\Sub\\Sub-Sub");
        if (file.exists()){
            if (file.mkdirs()){
                System.out.println("Multiple directories are created!");
            }else{
                System.out.println("Failed to create multiple directories!");
            }
        }
    }
}
