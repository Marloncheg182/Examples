package NIO;

import java.nio.ByteBuffer;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class GetByteFromByteBuffer {
    public static void main(String[] args) {

        // Create a byte array
        byte[] bytes = { 0x00, 0x01, 0x02, 0x03, 0x04};

        // Wrap a byte array into a buffer
        ByteBuffer buf = ByteBuffer.wrap(bytes);

        // Get the buffer's capacity
        int capacity = buf.capacity();

        // Get the buffer's limit
        int limit = buf.limit();

        // Get the buffer's position
        int position = buf.position();

        System.out.println("Buffer capacity: " + capacity);
        System.out.println("Buffer limit: " + limit);
        System.out.println("Buffer position: " + position);

        // Absolute get method. Reads byte at given index (does not affect the position)
        byte b = buf.get(2);
        System.out.println("byte: " + b);

        // Set the position
        buf.position(3);

        // Relative get method. Reads byte at buffer's current position and increments position.
        b = buf.get();
        System.out.println("byte: " + b);

        // Get remaining byte count
        int remainingBytes = buf.remaining();
        System.out.println("Buffer remaining bytes: " + remainingBytes);

        // Rewinds this buffer. The position is set to zero and the mark is discarded
        buf.rewind();

        remainingBytes = buf.remaining();
        System.out.println("Buffer remaining bytes: " + remainingBytes);

        b = buf.get();
        System.out.println("byte: " + b);

    }
}
