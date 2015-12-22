package Algorithms.Factorial;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class RecursiveFactorial {
    public static int recursiveFact(int n){
        if (n ==0){
            return 1;
        }else {
            return n*recursiveFact(n-1);
        }
    }
}
