package Strings;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Intern {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";

        System.out.println("s1==s2 " +(s1==s2)); // false
        System.out.println("s2==s3 " +(s2==s3)); // true

        s1=s1.intern();
        System.out.println("s1==s2 " +(s1==s2)); // true
    }
}
