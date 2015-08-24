package JSON.JSONSimple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class ReadJSONFromFile {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object o = parser.parse(new FileReader("d:\\test.json"));

            JSONObject jsonObject = (JSONObject)o;

            String name = (String)jsonObject.get("name");
            System.out.println(name);

            long age = (Long)jsonObject.get("age");

            JSONArray msg = (JSONArray)jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
