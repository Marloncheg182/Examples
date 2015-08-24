package JSON.JavaToJSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class POJOUser {

    private int age = 25;
    private String name = "oleg";
    private List<String> messages = new ArrayList<>();
    {
        messages.add("msg1");
        messages.add("msg2");
        messages.add("msg3");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "POJOUser{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", messages=" + messages +
                '}';
    }
}
