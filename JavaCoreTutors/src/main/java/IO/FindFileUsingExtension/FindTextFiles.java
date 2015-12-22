package IO.FindFileUsingExtension;

import IO.DeleteFileWithExtension.FileFilter;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class FindTextFiles {
    private static final String parentDirectory = "C:\\files";
    private static final String fileExtension = ".txt";

    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter(fileExtension);
        File parentDir = new File(parentDirectory);
        String[]listOfTextFiles = parentDir.list(fileFilter);
        if (listOfTextFiles.length == 0){
            System.out.println("There are no text files in directory");
            return;
        }
        for (String file : listOfTextFiles) {
            String absoluteFilePath = new StringBuffer(parentDirectory).append(File.separator).append(file).toString();
            System.out.println(absoluteFilePath);
        }
    }
}
