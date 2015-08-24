package NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class ChannelTransferExample {
    public static void main(String[] args) throws Exception{
        String[] inputFiles = new String[]{"inputFile1.txt", "inputFile2.txt", "inputFile3.txt"};

        String outputFile = "outputFile.txt";

        FileOutputStream fos = new FileOutputStream(new File(outputFile));
        WritableByteChannel target = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++)
        {
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel input = fis.getChannel();

            input.transferTo(0, input.size(), target);

            input.close();
            fis.close();
        }
        target.close();
        fos.close();
    }
}
