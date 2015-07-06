
/**
 * Created by Dell on 18.11.2014.
 * @author Oleg "Lg"
 */

import java.io.*;

/**
 * TODO This class will be a class for move operations
 */

public class MoveEntry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This operation can move your file/dir.");
        System.out.println("Choose your first path with file/dir name, and second path with name, then push the 'Enter' button.");
        String frDirectory = reader.readLine();
        File idr = new File(frDirectory);
        String toDirectory = reader.readLine();
        File odr = new File(toDirectory);

        if (idr.exists()) {
            try {
                idr.renameTo(odr);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            System.out.println("Data moved");

        }
    }
}


