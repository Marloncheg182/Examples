package NIO;

import java.nio.*;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class UseByteBufferForNonByteJavaTypesBuffering {
    public static void main(String[] args) {

        // Allocate a new non-direct byte buffer with a 50 byte capacity
        // set this to a big value to avoid BufferOverflowException
        ByteBuffer buf = ByteBuffer.allocate(50);

        // Creates a view of this byte buffer as a char buffer.
        CharBuffer cbuf = buf.asCharBuffer();

        // Creates a view of this byte buffer as a short buffer.
        ShortBuffer sbuf = buf.asShortBuffer();

        // Creates a view of this byte buffer as a short buffer.
        IntBuffer ibuf = buf.asIntBuffer();

        // Creates a view of this byte buffer as a short buffer.
        LongBuffer lbuf = buf.asLongBuffer();

        // Creates a view of this byte buffer as a float buffer.
        FloatBuffer fbuf = buf.asFloatBuffer();

        // Creates a view of this byte buffer as a double buffer.
        DoubleBuffer dbuf = buf.asDoubleBuffer();

    }
}
