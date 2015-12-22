package ClassesTypes.Constructors;

/**
 * Created by 1 on 10.11.2015.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String Name) {
        this.name = Name;
        this.age = 0;
    }

    public Person(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Jim");
        Person person3 = new Person("John", 28);

        System.out.println(person1.getName() + person1.getAge());
        System.out.println(person2.getName() + person2.getAge());
        System.out.println(person3.getName() + person3.getAge());
    }

}
