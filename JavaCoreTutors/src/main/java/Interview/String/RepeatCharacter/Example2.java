package Interview.String.RepeatCharacter;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class Example2 {
    public static void main(String[] args)
    {
        System.out.println("First non repeated character for String analogy is : "+getNonRepeatedCharacter("analogy"));
        System.out.println("First non repeated character for String easiest is : "+getNonRepeatedCharacter("easiest"));
    }
    public static Character getNonRepeatedCharacter(String str)
    {     char charaaray[]=str.toCharArray();
        for (int i=0; i<str.length();i++)
        {
            if (str.lastIndexOf(charaaray[i]) == str.indexOf(charaaray[i]))
                return charaaray[i];
        }
        return null;
    }
}

