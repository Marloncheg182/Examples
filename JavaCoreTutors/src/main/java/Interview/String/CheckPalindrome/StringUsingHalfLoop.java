package Interview.String.CheckPalindrome;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class StringUsingHalfLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");

        String str = scanner.nextLine();
        boolean isPalin = isPalindrome(str);
        if (isPalin)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
    static boolean isPalindrome(String str){
        for (int i=0,j=str.length()-1; i <str.length()/2; i++,j--){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
