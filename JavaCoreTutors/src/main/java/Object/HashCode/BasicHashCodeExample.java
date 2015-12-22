package Object.HashCode;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class BasicHashCodeExample {
    public static void main(String[] args) {

        String name1 = "Johns";
        String name2 = "Jane";
        String name3 = "Johns";

        System.out.println("name1.equals(name2) : " + name1.equals(name2));
        System.out.println("name1.hashCode() = " + name1.hashCode());
        System.out.println("name2.hashCode() = " + name2.hashCode());

        System.out.println("name1.equals(name3) : " + name1.equals(name3));
        System.out.println("name1.hashCode() = " + name1.hashCode());
        System.out.println("name3.hashCode() = " + name3.hashCode());
    }
}
