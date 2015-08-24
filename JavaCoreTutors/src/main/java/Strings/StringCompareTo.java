package Strings;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class StringCompareTo {
    public static void main(String[] args) {
 String str = "ABC";
        System.out.println(str.compareTo("DEF"));
        System.out.println(str.compareToIgnoreCase("abc"));

        char a = 'A';
        char d = 'D';
        System.out.println(a-d);
    }
}