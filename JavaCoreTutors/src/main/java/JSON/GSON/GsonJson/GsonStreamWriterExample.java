package JSON.GSON.GsonJson;

import com.google.gson.stream.JsonWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class GsonStreamWriterExample {
    public static void main(String[] args) {
        JsonWriter writer;
        try {
            writer = new JsonWriter(new FileWriter("d:\\user.json"));
            writer.beginObject();
            writer.name("name").value("oleg");
            writer.name("age").value(25);

            writer.name("messages");
            writer.beginArray();
            writer.value("msg 1");
            writer.value("msg 2");
            writer.value("msg 3");
            writer.endArray();

            writer.endObject();
            writer.close();

            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
