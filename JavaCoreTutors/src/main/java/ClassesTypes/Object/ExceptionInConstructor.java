package ClassesTypes.Object;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 12/19/2015.
 */
public class ExceptionInConstructor {
    public static void main(String[] args) {
        try {
            InputFile inputFile = new InputFile("Cleanup.java");
            String string;
            int i = 1;
            while ((string = inputFile.getLine())!=null);
            inputFile.dispose();
        }catch (Exception e){
            System.err.println("Caught Exception in main");
            e.printStackTrace();
        }
    }
}
class InputFile{
    private BufferedReader input;

    public InputFile(String fileName)throws Exception{
        try {
            input = new BufferedReader(new FileReader(fileName));
        }catch (FileNotFoundException e){
            System.err.println("Could not open " + fileName);
            throw e;
        }catch (Exception e){
            try {
                input.close();
            }catch (IOException e2){
                System.err.println("in.close() unsuccessful");
            }
            throw e;
        }finally {

        }
    }
    public String getLine(){
        String s;
        try {
            s = input.readLine();
        }catch (IOException e){
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose(){
        try {
            input.close();
            System.err.println("dispose() successful");
        }catch (IOException e2){
            throw new RuntimeException("in.close() failed");
        }
    }
}