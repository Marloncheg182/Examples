package Util.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class PropertiesExample {
    public static void main(String[] args) {
        try {
            Properties grades = new Properties();
            grades.setProperty("Geometry", "20");
            grades.setProperty("Algebra", "20");
            grades.setProperty("Physics", "18");
            grades.setProperty("Chemistry", "17");
            grades.setProperty("Biology", "19");

            FileInputStream in = new FileInputStream("schoolGrades.properties");
            grades.load(in);
            in.close();

            for (String key : grades.stringPropertyNames()) {
                String value = grades.getProperty(key);
                System.out.println("The grade in " + key + " is: " + value);
            }
            String str = grades.getProperty("History", "No grade");
            System.out.println("The grade in History is: " + str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
