package IO.DeleteFileOnJVMExit;

import java.io.File;

/**
 * Created by O1e6 <NsN> on 11/27/2015.
 */
public class DeleteFileOnJVMExit {
    public static void main(String[] args) {

        File file = new File("C://delete_file.txt");

        // Requests that the file or directory denoted by this abstract
        // pathname be deleted when the virtual machine terminates.
        file.deleteOnExit();

    }
}
