package IO.JavaFileFilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Oleg Romanenchuk on 9/16/2015.
 */
public class FileFilterMain {

    private static String PATH = "C://JCGFolder";

    public static void main(String[] args) {
        File myFile = new File(PATH);

        if (!myFile.exists()){
            System.out.println("The file does not exist...");
            System.exit(1);
        }

        FilenameFilter filter = new MyFileFilterClass();

        File[] fileList = myFile.listFiles(filter);

        if (fileList.length > 0){
            System.out.println("Containing files with the use of filter are:");
            for (File file : fileList){
                System.out.println(file.getAbsoluteFile());
            }
        }else {
            System.out.println("There are not such files into the " + myFile);
        }

        System.out.println("------------------------------------------------");

        File[] listNoExt = myFile.listFiles();

        if (fileList.length > 0){
            System.out.println("Containing files without the filter are:");

            for (File file : listNoExt) {
                System.out.println(file.getAbsoluteFile());
            }
        }else {
            System.out.println("There are no files at all");
        }
    }
}
