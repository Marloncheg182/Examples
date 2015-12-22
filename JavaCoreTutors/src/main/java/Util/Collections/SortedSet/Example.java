package Util.Collections.SortedSet;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class Example implements Comparable<Example>{
    private String name;

    private int age;

    public Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Example o) {
        return this.age - o.getAge();

    }
}
