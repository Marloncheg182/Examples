package NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class ChannelCopyExample {
    public static void main(String[] args) throws IOException{
        FileInputStream in = new FileInputStream("testIn.txt");
        ReadableByteChannel source = in.getChannel();

        FileOutputStream out = new FileOutputStream("testOut.txt");
        WritableByteChannel dest = out.getChannel();

        copyData(source, dest);

        source.close();
        dest.close();
    }
    private static void copyData(ReadableByteChannel src, WritableByteChannel dst)throws IOException{
        ByteBuffer buffer = ByteBuffer.allocate(16*1024);
        while (src.read(buffer)!=-1)
        {
            buffer.flip();

            while (buffer.hasRemaining()){
                dst.write(buffer);
            }
            buffer.clear();
        }
    }
}
