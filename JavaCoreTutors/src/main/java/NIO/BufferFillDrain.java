package NIO;

import java.nio.CharBuffer;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class BufferFillDrain {
    public static void main(String[] args) throws Exception{
        CharBuffer buffer = CharBuffer.allocate(100);
        while (fileBuffer (buffer)){
            buffer.flip(   );
            drainBuffer (buffer);
            buffer.clear();
        }
    }
    private static void drainBuffer(CharBuffer buffer){
        while (buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
        System.out.println("");
    }
    private static boolean fileBuffer(CharBuffer buffer){
        if (index >= strings.length)
        {
            return (false);
        }
        String string = strings [index++];
        for (int i = 0; i <string.length(); i++){
            buffer.put(string.charAt(i));
        }
        return (true);
    }
    private static int index = 0;

    private  static String[]strings ={
            "Some random string content 1",
            "Some random string content 2",
            "Some random string content 3",
            "Some random string content 4",
            "Some random string content 5",
            "Some random string content 6",
    };
}
