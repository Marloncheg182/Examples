package JSON.JavaToJSON;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JacksonExample {
    public static void main(String[] args) {

        POJOUser user = new POJOUser();
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("d:\\user.json"),user);

            System.out.println(mapper.writeValueAsString(user));
        }catch (JsonGenerationException e){
            e.printStackTrace();
        }catch (JsonMappingException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
