package NIO;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class CreateStreamFromFileChannel {
    public static void main(String[] args) {

        try {

            File inFile = new File("in.dat");

            // Create a readable file channel
            ReadableByteChannel rChannel = new RandomAccessFile(inFile, "r").getChannel();

            // Construct a stream that reads bytes from the given channel.
            InputStream is = Channels.newInputStream(rChannel);

            File outFile = new File("out.dat");

            // Create a writable file channel
            WritableByteChannel wChannel = new RandomAccessFile(outFile, "w").getChannel();

            // Construct a stream that writes bytes to the given channel.
            OutputStream os = Channels.newOutputStream(wChannel);

            // close the channels
            is.close();
            os.close();

        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }
}
