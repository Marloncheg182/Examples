package Interview.String.StringLength;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class UsingToCharArray {
    public static void main(String[] args) {
        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLength(helloWorld));
    }

    private static int getLength(String str) {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;
    }

}
