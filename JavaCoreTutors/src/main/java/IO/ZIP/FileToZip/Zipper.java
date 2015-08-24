package IO.ZIP.FileToZip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Zipper {
    List<String> fileList;
    private static final String OUTPUT_ZIP_FILE = "C:\\MyFile.zip";
    private static final String SOURCE_FOLDER = "C:\\testzip";

    Zipper() {
        fileList = new ArrayList<String>();
    }

    public static void main(String[] args) {
        Zipper zipper = new Zipper();
        zipper.generateFileList(new File(SOURCE_FOLDER));
        zipper.zipIt(OUTPUT_ZIP_FILE);
    }

    /**
     * Zip it
     * @param zipFile output ZIP file location
     */
    private void zipIt(String zipFile) {
        byte[] buffer = new byte[1024];

        try {
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            System.out.println(" Output to Zip : " + zipFile);
            for (String file : fileList) {
                System.out.println("File Added : " + file);
                ZipEntry ze = new ZipEntry(file);
                zos.putNextEntry(ze);

                FileInputStream in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
                int len;
                while ((len = in.read(buffer)) > 0) {
                    zos.write(buffer, 0, len);
                }
                in.close();
            }
            zos.closeEntry();
            zos.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Traverse a directory and get all files,
     * and add the file into fileList
     * @param node file to directory
     */

    private void generateFileList(File node) {

        if (node.isFile()){
            fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));

        }
        if (node.isDirectory()){
         String[]subNote = node.list();
            for (String filename : subNote) {
                generateFileList(new File(node, filename));
            }
        }
    }
    /**
     * Format the file path for zip
     * @param file file path
     * @return Formatted file path
     */
     private String generateZipEntry(String file){
         return file.substring(SOURCE_FOLDER.length()+1, file.length());
     }

}
