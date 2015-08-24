package JSON.JavaToJSON;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JSonToJava {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            POJOUser user = mapper.readValue(new File("d:\\user.json"), POJOUser.class);

            System.out.println(user);
        }catch (JsonGenerationException e){
            e.printStackTrace();
        }catch (JsonMappingException e){
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
