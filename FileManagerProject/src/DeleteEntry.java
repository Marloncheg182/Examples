import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dell on 18.11.2014.
 * @author Oleg "Lg"
 */

/**
 * TODO This class will be a class for delete operations
 */
public class DeleteEntry {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This operation can delete your file/dir.");
        System.out.println("Choose your first path with file/dir name, and second path with name, then push the 'Enter' button.");
        String dlDirectory = reader.readLine();
        File deletable = new File(dlDirectory);

        if (deletable.exists()) {
            try {
                deletable.delete();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            System.out.println("Data deleted");

        }
    }
}
