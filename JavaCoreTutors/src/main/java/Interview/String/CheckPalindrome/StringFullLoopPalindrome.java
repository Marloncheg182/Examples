package Interview.String.CheckPalindrome;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class StringFullLoopPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");

        String str = scanner.nextLine();
        String reverseStr = "";

        for (int i = str.length()-1; i>=0; i--)
        {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equals(reverseStr)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
