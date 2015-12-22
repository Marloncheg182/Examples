package IO.CheckIfDirectoryExists;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/27/2015.
 */
public class CheckIfDirectoryExists {
    public static void main(String[] args) {

        File dir = new File("C://directory");

        // Tests whether the directory denoted by this abstract pathname exists.
        boolean exists = dir.exists();

        System.out.println("Directory " + dir.getPath() + " exists: " + exists);
    }
}
