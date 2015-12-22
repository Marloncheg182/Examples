package IO.ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        for (int i =0; i < 10; i++){
            bout.write((byte)(Math.random() * 100));

        }
    byte[] byteArray = bout.toByteArray();
        for (byte b : byteArray) {
            System.out.println(b + " ");
        }
    }
}
