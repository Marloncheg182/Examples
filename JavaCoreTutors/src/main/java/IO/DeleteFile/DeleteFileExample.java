package IO.DeleteFile;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class DeleteFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("c:\\logfile20100131.log");

            if (file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else {
                System.out.println("Delete operation is failed.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
