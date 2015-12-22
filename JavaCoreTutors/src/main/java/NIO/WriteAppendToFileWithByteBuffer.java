package NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class WriteAppendToFileWithByteBuffer {
    public static void main(String[] args) {

        try {

            File inFile = new File("in.xml");

            // Allocate a direct (memory-mapped) byte buffer with a byte capacity equal to file's length
            // DO NOT use this approach for copying large files
            ByteBuffer buf = ByteBuffer.allocateDirect((int)inFile.length());

            InputStream is = new FileInputStream(inFile);

            int b;

            while ((b=is.read())!=-1) {
                buf.put((byte)b);
            }

            File file = new File("out.xml");

            // append or overwrite the file
            boolean append = false;

            FileChannel channel = new FileOutputStream(file, append).getChannel();

            // Flips this buffer.  The limit is set to the current position and then
            // the position is set to zero.  If the mark is defined then it is discarded.
            buf.flip();

            // Writes a sequence of bytes to this channel from the given buffer.
            channel.write(buf);

            // close the channel
            channel.close();

        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }
}
