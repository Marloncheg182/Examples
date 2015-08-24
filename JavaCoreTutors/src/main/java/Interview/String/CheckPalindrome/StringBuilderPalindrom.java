package Interview.String.CheckPalindrome;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class StringBuilderPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");

        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder(str);

        builder.reverse();

        if (str.equals(builder.toString())){
            System.out.println("String is palindrome");
        }else
            System.out.println("String is not a palindrome");
    }
}
