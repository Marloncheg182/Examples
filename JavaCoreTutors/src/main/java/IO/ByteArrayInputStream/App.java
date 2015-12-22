package IO.ByteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String message = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        ByteArrayInputStream str = new ByteArrayInputStream(message.getBytes());
        int ch;
        while ((ch = str.read())!= -1){
            sb.append(Character.toUpperCase((char) ch));
        }
        System.out.println("Your capitalized message: " + sb.toString());

    }
}
