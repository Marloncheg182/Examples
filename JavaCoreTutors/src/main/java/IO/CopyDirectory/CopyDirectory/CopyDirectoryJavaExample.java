package IO.CopyDirectory.CopyDirectory;

import java.io.*;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class CopyDirectoryJavaExample {
    public static void main(String[] args) {
        File srcFolderPath = new File("C:\\Users\\OldDirectory");
        File destFilderPath = new File("C:\\Users\\NewDirectory");

        if (!srcFolderPath.exists()){
            System.out.println("Directory does not exist. Process is stopped");
            System.exit(0);
        }else {
            try {
                copyFolder(srcFolderPath,destFilderPath);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Directory is copying from : " + srcFolderPath + " to : " + destFilderPath + " .Process was finished");
    }

    private static void copyFolder(File srcFolderPath, File destFilderPath) throws IOException{
        if (!srcFolderPath.isDirectory()){
            InputStream in = new FileInputStream(srcFolderPath);
            OutputStream out = new FileOutputStream(destFilderPath);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer))>0){
                out.write(buffer, 0, length);
            }

            in.close();
            out.close();
            System.out.println("File copied from : " + srcFolderPath + "to : " + destFilderPath);
        }else {
            if (!destFilderPath.exists()){
                destFilderPath.mkdir();
                System.out.println("Directory copied from " + srcFolderPath + " to " + destFilderPath + " successfully");
            }
            String folder_contents[] = srcFolderPath.list();
            for (String file : folder_contents) {
                File srcFile = new File(srcFolderPath, file);
                File destFile = new File(destFilderPath, file);

                copyFolder(srcFile, destFile);
            }
        }
    }

}
