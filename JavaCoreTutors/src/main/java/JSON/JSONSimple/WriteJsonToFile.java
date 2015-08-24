package JSON.JSONSimple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class WriteJsonToFile {
    public static void main(String[] args) {

        JSONObject object = new JSONObject();
        object.put("name", "oleg.com");
        object.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        object.put("messages", list);

        try {
            FileWriter fileWriter = new FileWriter("d:\\test.json");
            fileWriter.write(object.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(object);
    }
}
