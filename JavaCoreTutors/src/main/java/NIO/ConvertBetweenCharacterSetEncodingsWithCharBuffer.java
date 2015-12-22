package NIO;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class ConvertBetweenCharacterSetEncodingsWithCharBuffer {
    public static void main(String[] args) {

        try {

            // Returns a charset object for the named charset.
            Charset charset = Charset.forName("ISO-8859-1");

            // Constructs a new decoder for this charset.
            CharsetDecoder decoder = charset.newDecoder();

            // Constructs a new encoder for this charset.
            CharsetEncoder encoder = charset.newEncoder();

            // Wrap the character sequence into a buffer.
            CharBuffer uCharBuffer = CharBuffer.wrap("Java Code Geeks");

            // Encode the remaining content of a single input character buffer to a new byte buffer.
            // Converts to ISO-8859-1 bytes and stores them to the byte buffer
            ByteBuffer bbuf = encoder.encode(uCharBuffer);

            // Decode the remaining content of a single input byte buffer to a new character buffer.
            // Converts from ISO-8859-1 bytes and stores them to the character buffer
            CharBuffer cbuf = decoder.decode(bbuf);

            String s = cbuf.toString();
            System.out.println("Original String is: " + s);

        }
        catch (CharacterCodingException e) {
            System.out.println("Character Coding Error: " + e.getMessage());
        }

    }
}
