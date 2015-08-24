package IO.StandartInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class printStdIn {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;

            while ((input = reader.readLine())!=null){
                System.out.println(input);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
