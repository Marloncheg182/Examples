package IO.DeleteFileWithExtension;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class DeleteTextFiles {
    private static String parentDirectory = "C:\\files";
    private static String deleteExtension = ".txt";

    public static void main(String[] args) {
        FileFilter fileFilter = new FileFilter(deleteExtension);
        File parentDir = new File(parentDirectory);

        String[]listOfTextFiles = parentDir.list(fileFilter);
        if (listOfTextFiles.length == 0){
            System.out.println("There are no txt files in directory");
            return;
        }
        File fileToDelete;
        for (String file : listOfTextFiles) {
            String absoluteFilePath = new StringBuffer(parentDirectory).append(File.separator).append(file).toString();
            fileToDelete = new File(absoluteFilePath);
            boolean isdeleted = fileToDelete.delete();
            System.out.println("File : " + absoluteFilePath + "was deleted : " + isdeleted);
        }
    }
}
