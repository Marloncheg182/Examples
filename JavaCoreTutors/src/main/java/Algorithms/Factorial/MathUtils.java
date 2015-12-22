package Algorithms.Factorial;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class MathUtils {
    public static int simpleFactorial(int n){
        int result = 1;
        for (int i = 1; i < n; i++){
            result *=i;
        }
        return result;
    }
}
