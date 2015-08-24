package Strings;

import java.util.Arrays;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class StringToCharToString {
    public static void main(String[] args) {
        String str = "123";
        char[] chars = str.toCharArray();
        System.out.println("String to array " + Arrays.toString(chars));
        char c = str.charAt(1);
        System.out.println("String to char " + c);
        String s = Character.toString(c);
        System.out.println("char to String" + s);
        System.out.println("remove all chars from String " + removeChars("1ABCD12DW", '1'));
    }

    private static String removeChars(String str, char c) {
        return str.replaceAll(Character.toString(c), "");
    }
}
