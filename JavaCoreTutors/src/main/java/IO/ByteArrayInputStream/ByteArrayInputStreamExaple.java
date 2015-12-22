package IO.ByteArrayInputStream;

import java.util.Random;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class ByteArrayInputStreamExaple {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        Random rnd = new Random();

        for (int i = 0; i < buffer.length; i++){
            buffer[i] = (byte)rnd.nextInt();
        }

        java.io.ByteArrayInputStream b = new java.io.ByteArrayInputStream(buffer);
        System.out.println("All the elements in the buffer:");

        int num;
        while ((num = b.read())!= -1){
            System.out.println(num + " ");
        }
    }
}
