package NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class WriteToChannelWithByteBuffer {
    public static void main(String[] args) {

        try {

            // destination file channel
            // return the unique FileChannel object associated with this file output stream.
            WritableByteChannel channel = new FileOutputStream("out.xml").getChannel();

            // Allocate a new direct (memory-mapped) byte buffer with a 10 byte capacity
            ByteBuffer buf = ByteBuffer.allocateDirect(10);

            InputStream is = new FileInputStream("in.xml");

            byte[] byteArray = new byte[1024];

            int count = 0;
            int index = 0;

            while (count >= 0) {


                if (index == count) {


                    count = is.read(byteArray);


                    index = 0;

                }



                while (index < count && buf.hasRemaining()) {

                    // Writes the given byte into this buffer at the current position

                    // and then increments the position.


                    buf.put(byteArray[index++]);

                }


                // Flips this buffer.  The limit is set to the current position and then

                // the position is set to zero.  If the mark is defined then it is discarded.

                buf.flip();


                // Writes a sequence of bytes to this channel from the given buffer.

                channel.write(buf);


                // Check if there are any elements between the current position and the limit.

                if (buf.hasRemaining()) {


// compacts the buffer, i.e. the bytes between the buffer's current

                    // position and its limit, if any, are copied to the beginning of the buffer.


                    buf.compact();

                }

                else {


// Clears this buffer. The position is set to zero, the limit


// is set to the capacity, and the mark is discarded.


                    buf.clear();

                }


            }

            // close the channel
            channel.close();

        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }
}
