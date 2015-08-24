package JSON.GSON.PrettyPrint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(gson);

        System.out.println(json);
    }
}
