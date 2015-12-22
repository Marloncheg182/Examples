package IO.CopyFile;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class CopyFilesExample {
    public static void main(String[] args) throws InterruptedException, IOException{
        File source = new File("C:\\sourcefile1.txt");
        File dest = new File("C:\\dest1.txt");

        // IO InputSteam/OutputStream
        long start = System.nanoTime();
        long end;
        copyFileUsingFileStreams(source, dest);
        System.out.println("Time taken by FileStreams Copy = " + (System.nanoTime() - start));

        //NIO Channels
        source = new File("C:\\sourcefile2.txt");
        dest = new File("C:\\dest2.txt");
        start = System.nanoTime();
        copyFileUsingFileChannels(source, dest);
        end = System.nanoTime();
        System.out.println("Time taken by FileChannels Copy = " + (end - start));

        //Copy Using Java 7 Files class
        source = new File("C:\\sourcefile3.txt");
        dest = new File("C:\\dest3.txt");
        start = System.nanoTime();
        copyFileUsingJavaFiles(source, dest);
        end = System.nanoTime();
        System.out.println("Time taken by Java7 Files Copy = " + (end - start));

        //Copy files using apache commons io
        source = new File("C:\\sourcefile4.txt");
        dest = new File("C:\\dest4.txt");
        start = System.nanoTime();
        copyFileUsingApacheCommonsIO(source, dest);
        end = System.nanoTime();
        System.out.println("Time taken by Apache Commons IO = " + (end - start));

    }

    private static void copyFileUsingFileStreams(File source, File dest) throws IOException{
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) > 0){
                output.write(buffer, 0, bytesRead);
            }
        }finally {
            input.close();
            output.close();
        }
    }

    private static void copyFileUsingFileChannels(File source, File dest) throws IOException{
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        }finally {
            inputChannel.close();
            outputChannel.close();
        }
    }

    private static void copyFileUsingJavaFiles(File source, File dest) throws IOException{
        Files.copy(source.toPath(), dest.toPath());
    }

    private static void copyFileUsingApacheCommonsIO(File source, File dest) throws IOException{
        org.apache.commons.io.FileUtils.copyFile(source, dest);
    }
}
