package JSON.JacksonTreeNode;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JacksonTreeNodeExample {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {


        BufferedReader reader = new BufferedReader(new FileReader("d:\\user.json"));
        JsonNode root = mapper.readTree(reader);
        JsonNode name = root.path("name");
        System.out.println(name.getTextValue());
        JsonNode age = root.path("age");
        System.out.println(age.getIntValue());
        JsonNode msg = root.path("messages");
        Iterator<JsonNode> iter = msg.iterator();
        while (iter.hasNext()) {
            JsonNode temp = iter.next();
            System.out.println(temp.getTextValue());
            ((ObjectNode) root).put("nickname", "new nickname");
            ((ObjectNode) root).put("name", "updated name");
            ((ObjectNode) root).remove("age");

            mapper.writeValue(new File("d:\\user.json"), root);
        }
        }catch (JsonGenerationException e){
            e.printStackTrace();
        }catch (JsonMappingException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
