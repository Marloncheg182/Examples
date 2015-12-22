package NIO;

import java.nio.ByteBuffer;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class PutByteIntoByteBuffer {
    public static void main(String[] args) {

        // Allocate a new non-direct byte buffer with a 5 byte capacity
        // The underlying storage is a byte array.
        ByteBuffer buf = ByteBuffer.allocate(5);

        // Get the buffer's capacity
        int capacity = buf.capacity();

        // Get the buffer's limit
        int limit = buf.limit();

        // Get the buffer's position
        int position = buf.position();

        System.out.println("Buffer capacity: " + capacity);
        System.out.println("Buffer limit: " + limit);
        System.out.println("Buffer position: " + position);

        buf.put((byte)0x01); // at position 0

        position = buf.position();
        System.out.println("Buffer position: " + position);

        // Set the position
        buf.position(3);

        position = buf.position();
        System.out.println("Buffer position: " + position);

        // Use the relative put()
        buf.put((byte)0x02);

        position = buf.position();
        System.out.println("Buffer position: " + position);

        // Get remaining byte count
        int remainingBytes = buf.remaining();
        System.out.println("Buffer remaining bytes: " + remainingBytes);

        // Rewinds this buffer. The position is set to zero and the mark is discarded
        buf.rewind();

        remainingBytes = buf.remaining();
        System.out.println("Buffer remaining bytes: " + remainingBytes);

    }
}
