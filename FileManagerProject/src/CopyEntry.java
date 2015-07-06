import java.io.*;
import java.nio.channels.*;
/**
 * Created by Dell on 18.11.2014.
 * @author Oleg "Lg"
 */

/**
 * TODO This class will be a class for copy operations
 */
public class CopyEntry {
    public static void copyFile(File in, File out) throws IOException {
        FileChannel inChannel = new FileInputStream(in).getChannel();
        FileChannel outChannel = new FileOutputStream(out).getChannel();


        try {
//            inChannel.transferTo(0, inChannel.size(), outChannel);
            outChannel.transferFrom(inChannel, 0, inChannel.size());
        } catch (IOException e) {
            throw e;
        } finally {
            if (inChannel != null) {
                inChannel.close();
                outChannel.close();
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first path: ");
        String pathFirst = reader.readLine();
        System.out.println("Input second path: ");
        String pathSecond = reader.readLine();
        try {
            CopyEntry.copyFile(new File(pathFirst), new File(pathSecond));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}