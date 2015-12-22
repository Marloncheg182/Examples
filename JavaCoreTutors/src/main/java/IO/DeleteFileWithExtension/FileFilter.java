package IO.DeleteFileWithExtension;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class FileFilter implements FilenameFilter {
    private String fileExtension;

    public FileFilter(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Override
    public boolean accept(File dir, String name) {
        return (name.endsWith(this.fileExtension));
    }
}
