package JSON.JSONToMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JsonMapExample {
    public static void main(String[] args) {
        String json ="{\"name\":\"oleg\", \"age\":\"25\"}";

        Map<String, String> map = new HashMap<String,String>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(json, new TypeReference<HashMap<String,String>>(){});

            System.out.println(map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
