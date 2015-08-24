package Interview.String.Reverse;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class UsingForLoops {
    public static void main(String[] args) {
        String name ="Oleg";
        String reverse="";
        for (int i = name.length()-1;i>=0; i--)
        {
            reverse =reverse+name.charAt(i);
        }
        System.out.println("Reverse of Oleg is:" + reverse);
    }
}
