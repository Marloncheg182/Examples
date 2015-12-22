package NIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class ReadFromChannelWithByteBuffer {
    public static void main(String[] args) {

        try {

            // source file channel
            // return the unique FileChannel object associated with this file input stream.
            ReadableByteChannel channel = new FileInputStream("in.xml").getChannel();

            // Allocate a new direct (memory-mapped) byte buffer with a 10 byte capacity
            ByteBuffer buf = ByteBuffer.allocateDirect(10);

            int bytesRead = 0;

            while (bytesRead >= 0) {


                // Rewind this buffer. The position is set to zero and the mark is discarded.

                buf.rewind();


                // Read a sequence of bytes from this channel into the given buffer.

                bytesRead = channel.read(buf);


                // in order to read the new bytes, the buffer has to be rewinded

                buf.rewind();


                // read all the bytes in the buffer

                for (int i=0; i<bytesRead; i++) {

                    // Read the byte at this buffer's current position, and then increments the position.


                    byte b = buf.get();


                    System.out.println("Byte read: " + b);

                }


            }

        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }

}
