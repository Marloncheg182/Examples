
import java.io.*;

/**
 * Created by Dell on 18.11.2014.
 * @author Oleg "Lg"
 */

/**
 * TODO This class i a list class, which will show you folder structure
 */
public class Directory {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello! This is a simple file manager...");
        System.out.println("Enter your path for directory, which you want to open, and push the 'Enter' button.");
        String directory = reader.readLine();
        File dr = new File(directory);
        if (dr.isDirectory()) {
            System.out.println(directory);
            String s[] = dr.list();
            for (String value : s) {

                File fl = new File(directory + "/" + value);
                if (fl.isDirectory() && fl.isHidden()) {
                    System.out.println("Folder - " + value);
                } else
                    System.out.println("File - " + value);
            }
            System.out.print(dr.length() + " Bytes");
        }
    }
}

