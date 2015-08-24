package Interview.String;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class FindAllSubstrings {
    public static void main(String[] args) {
        String str = "abbc";
        System.out.println("All substring of abbc are:");
        for (int i =0; i<str.length(); i++){
            for (int j = i + 1; j <= str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
