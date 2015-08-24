package Interview.String.Reverse;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class UsingRecursion {
    public static void main(String[] args) {
        UsingRecursion ur = new UsingRecursion();
        String name = "Oleg";
        String reverse = ur.recursiveReverse(name);
        System.out.println("Reverse of Oleg is:" + reverse);
    }

    public String recursiveReverse(String original)
    {
        if (original.length()==1)
            return original;
        else
            return original.charAt(original.length()-1)+recursiveReverse(original.substring(0,original.length()-1));
    }
}
