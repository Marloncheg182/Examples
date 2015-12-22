package Strings.Palindrome;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class PalindromeExample {
    private static final String STR1 = "abbcbba";
    private static final String STR2 = "isdovsjd";

    public static void main(String[] args) {
        System.out.println("String :" + STR1 + "is a palindrome :" + PalindromeExample.isPalindrome(STR1));
        System.out.println("String :" + STR2 + "is a palindrome :" + PalindromeExample.isPalindrome2(STR2));
    }

    private static boolean isPalindrome2(String str) {
        int start = 0;
        int end = str.length()-1;
        int half = end/2;

        for (int i = 0; i < half; i++, start++, end--){
            if (str.charAt(start)!=str.charAt(end))
                return false;
        }
        return true;
    }

    private static boolean isPalindrome(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        if (reverse.equals(str))
            return true;
        return false;
    }
}
