package IO.FindFileByCertainExtansion;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class FindCertainExtension {

    private static final String FILE_DIR = "c:\\folder";
    private static final String FILE_TEXT_EXT = ".jpg";

    public static void main(String[] args) {
        new FindCertainExtension().listFile(FILE_DIR, FILE_TEXT_EXT);
    }

    private void listFile(String dir, String ext) {
        GenericExtFilter filter = new GenericExtFilter(ext);

        File folder = new File(dir);

        if (folder.isDirectory()==false){
            System.out.println("Directory doesn't exist : " + FILE_DIR);
            return;
        }
        //list out all the file name and filter by the extension
        String[]list = folder.list(filter);
        if (list.length==0){
            System.out.println("no files end with : " + ext);
            return;
        }
        for (String file : list) {
            String temp = new StringBuffer(FILE_DIR).append(File.separator)
                    .append(file).toString();
            System.out.println("file : " + temp);
        }
    }
   //inner class, generic extension filter
    public class GenericExtFilter implements FilenameFilter{
       private String ext;

       public GenericExtFilter(String ext){
           this.ext = ext;
       }
       public boolean accept(File dir, String name){
           return (name.endsWith(ext));
       }
   }

}
