package Strings;

/**
 * Created by 1 on 10.11.2015.
 */
public class ReplaceStrings {
    public static void main(String[] args) {
        String oldstr = "java old strings";
        System.out.println("Original strings");

        String newstr = oldstr.replace('O', 's');
        System.out.println("new string " + newstr);

        String newstr2 = oldstr.replace("av","trin");
        System.out.println("New string " + newstr2);

        String regex = "[a,i]";

        String newstr3 = oldstr.replaceAll(regex, "*");
        System.out.println("New string " + newstr3);

        String newstr4 = oldstr.replaceFirst(regex, "*");
        System.out.println("New string " + newstr4);


    }
}
