package IO.JavaFileFilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Oleg Romanenchuk on 9/16/2015.
 */
public class MyFileFilterClass implements FilenameFilter {

    private String[] extensionArray = {"txt", "pdf"};

    @Override
    public boolean accept(File dir, String name) {
        if (dir.exists()){
            for (String ext: extensionArray){
                if (name.endsWith(ext))
                    return true;
            }
        }
        return false;
    }
}
