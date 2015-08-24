package IO.FileHidden;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class FileHidden {
    public static void main(String[] args)throws IOException{
        File file = new File("c:/hidden-file.txt");

        if (file.isHidden()){
            System.out.println("This file is hidden");
        }else{
            System.out.println("This file is not hidden");
        }
    }
}
