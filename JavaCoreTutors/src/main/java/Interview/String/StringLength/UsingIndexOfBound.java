package Interview.String.StringLength;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class UsingIndexOfBound {
    public static void main(String[] args) {
        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLength(helloWorld));
    }

    private static int getLength(String str) {
        int i = 0;
        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }

        } catch (Exception e) {

        }
        return i;
    }
}