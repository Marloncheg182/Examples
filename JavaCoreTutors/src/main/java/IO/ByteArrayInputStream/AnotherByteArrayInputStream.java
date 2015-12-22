package IO.ByteArrayInputStream;

import java.io.*;
import java.io.ByteArrayInputStream;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class AnotherByteArrayInputStream {
    public static void main(String[] args) {
        byte[] buf = {1,2,3,4,5,6,7,8,9};
        java.io.ByteArrayInputStream b = new ByteArrayInputStream(buf);

        byte[] newBuffer = new byte[6];
        int num = b.read(newBuffer,2,4);
        System.out.println("Bytes read: " + num);

        for (int i = 0; i < newBuffer.length; i++){
            int nr = (int)newBuffer[i];
            if (newBuffer[i] == 0)
                System.out.println(" -null-");
            else
                System.out.println(nr + " ");
        }
    }
}
