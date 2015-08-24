package IO.FileReadOnly;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class FileReadAttribute {
    public static void main(String[] args) {

        File file = new File("c:/file.txt");

        //mark this file as read only, since jdk 1.2
        file.setReadOnly();

        if (file.canWrite()){
            System.out.println("This file is writable");
        }else{
            System.out.println("This file is read only");
        }

        //revert the operation, mark this file as writable, since jdk 1.6
        file.setWritable(true);

        if (file.canWrite()){
            System.out.println("This file is writable");
        }else{
            System.out.println("This file is read only");
        }
    }
}
