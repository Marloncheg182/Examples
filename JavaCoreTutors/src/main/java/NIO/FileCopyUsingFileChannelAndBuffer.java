package NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class FileCopyUsingFileChannelAndBuffer {
    public static void main(String[] args) {
        String inFileStr = "Структуры данных в картинках.pdf";
        String outFileStr = "Data structures.pdf";
        long startTime, elapsedTime;
        int bufferSizeKB = 4;
        int bufferSize = bufferSizeKB*1024;

        // Check file length
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");
        System.out.println("Buffer size is " + bufferSizeKB + " KB");
        System.out.println("Using FileChannel with indirect ByteBuffer of " + bufferSizeKB + " KB");
        try {

            FileChannel in = new FileInputStream(inFileStr).getChannel();
            FileChannel out = new FileOutputStream(outFileStr).getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(bufferSize);
            startTime = System.nanoTime();

            int bytesCount = 0;
            while ((bytesCount = in.read(byteBuffer))>0){
                byteBuffer.flip();
                out.write(byteBuffer);
                byteBuffer.clear();
            }
            elapsedTime = System.nanoTime() -startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
