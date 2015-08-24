package IO.ZIP.FileToZip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class ZipCompress {
    public static void main(String[] args) {
        byte[]buffer = new byte[1024];

        try {
            FileOutputStream fos = new FileOutputStream("C:\\MyFile.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);
            ZipEntry ze = new ZipEntry("spy.log");
            zos.putNextEntry(ze);
            FileInputStream in = new FileInputStream("C:\\spy.log");

            int len;
            while ((len = in.read(buffer))>0){
                zos.write(buffer, 0, len);
            }

            in.close();
            zos.closeEntry();

            zos.close();

            System.out.println("Done");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
