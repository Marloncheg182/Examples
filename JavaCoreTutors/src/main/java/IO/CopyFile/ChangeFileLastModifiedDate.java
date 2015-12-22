package IO.CopyFile;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class ChangeFileLastModifiedDate {
    public static final String filePath = "/users/testFile.txt";

    public static void main(String[] args) {
        try {
            File file = new File(filePath);

            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            System.out.println("Original Last Modified Date : "
                    + dateFormat.format(file.lastModified()));

            String newLastModifiedString = "asdaweasd";
            Date newLastModifiedDate = dateFormat.parse(newLastModifiedString);
            file.setLastModified(newLastModifiedDate.getTime());

            System.out.println("Lastest Last Modified Date : "
                    + dateFormat.format(file.lastModified()));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
