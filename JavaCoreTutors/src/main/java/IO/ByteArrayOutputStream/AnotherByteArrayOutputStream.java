package IO.ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class AnotherByteArrayOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        for(int i = 0; i < 10; i++){
            bout.write((byte)(Math.random() * 100));
            
        }
        byte[] byteArray = bout.toByteArray();
        System.out.println("The original array");
        for (byte b : byteArray) {
            System.out.println(b + " ");

            bout.reset();
            bout.write(byteArray, 4, 4);
            System.out.println("\nThe new byte array:");
            for (byte b1 : bout.toByteArray()) {
                System.out.println(b1 + " ");
            }
        }
    }

}
