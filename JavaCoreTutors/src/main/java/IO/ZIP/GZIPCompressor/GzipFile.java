package IO.ZIP.GZIPCompressor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class GzipFile {
    private static final String OUTPUT_GZIP_FILE = "/home/oleg/file.gz";
    private static final String SOURCE_FILE = "home/oleg/file.txt";

    public static void main(String[] args) {
        GzipFile gZip = new GzipFile();
        gZip.gziptIt();
    }

    /**
     * Gzip it
     * param zipFile out GZip file location
     */
    private void gziptIt() {
        byte[] buffer = new byte[1024];
        try {
            GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(OUTPUT_GZIP_FILE));

            FileInputStream in = new FileInputStream(SOURCE_FILE);

            int len;
            while ((len = in.read(buffer))>0){
                gzos.write(buffer, 0 , len);
            }
            in.close();

            gzos.finish();
            gzos.close();

            System.out.println("Done");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
