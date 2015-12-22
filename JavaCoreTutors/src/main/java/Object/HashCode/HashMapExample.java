package Object.HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map hashTable = new HashMap();
        Random rnd = new Random();

        String baseName = "Base_Name";

        for (int i = 0; i < 100; i++){
            String tmpName = baseName + i;
            int rndAge = rnd.nextInt(70);

            Person p = new Person(tmpName, rndAge);
            hashTable.put(tmpName.hashCode(), rndAge);
        }

        String name = "Base_Name75";
        Person person = (Person) hashTable.get(name.hashCode());
        System.out.println(person.getName());
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
