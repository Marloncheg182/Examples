package IO.UnzipFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class UnzipFileClass {
    public static void main(String[] args) {
        String zipFile = null;
        String destinationFolder = null;

        if (args.length == 2){
            try {
                zipFile = args[0];
                destinationFolder = args[1];
                unzipFunction(destinationFolder,zipFile);
            }catch (Exception e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    private static void unzipFunction(String destinationFolder, String zipFile){
        File directory = new File(destinationFolder);

        if (!directory.exists())
            directory.mkdirs();

        byte[]buffer = new byte[2048];
        try {
            FileInputStream fInput = new FileInputStream(zipFile);
            ZipInputStream zipInputStream = new ZipInputStream(fInput);

            ZipEntry entry = zipInputStream.getNextEntry();
            while (entry != null){
                String entryName = entry.getName();
                File file = new File(destinationFolder + File.separator + entryName);

                System.out.println("Unzip file " + entryName + " to " + file.getAbsolutePath());
                if (entry.isDirectory()){
                    File newDir = new File(file.getAbsolutePath());
                    if (!newDir.exists()){
                        boolean success = newDir.mkdirs();
                        if (success == false){
                            System.out.println("Problem creating Folder");
                        }
                    }
                }
                else {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    int count = 0;
                    while ((count = zipInputStream.read(buffer))> 0){
                        fileOutputStream.write(buffer, 0, count);
                    }
                    fileOutputStream.close();
                }
                zipInputStream.closeEntry();
                entry = zipInputStream.getNextEntry();
            }

            zipInputStream.closeEntry();
            zipInputStream.close();
            fInput.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
