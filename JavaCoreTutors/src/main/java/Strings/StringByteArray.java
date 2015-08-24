package Strings;

import java.util.Arrays;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class StringByteArray {
    public static void main(String[] args) {

        String str = "www.olegprojects.com.ua";
        byte[] bytes = str.getBytes();
        System.out.println("Byte to array" + Arrays.toString(bytes));
        String str1 = new String(bytes);
        System.out.println("byte array to String" + str1);
        System.out.println("str == str1? " + (str == str1));
        System.out.println("str.equals(str1)? " + (str.equals(str1)));
    }
}
