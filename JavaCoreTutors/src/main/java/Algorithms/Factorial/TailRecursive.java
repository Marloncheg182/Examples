package Algorithms.Factorial;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class TailRecursive {
    public static int tailrecurciveFact(int n){
        return factorial(n,1);
    }

    private static int factorial(int n,int accum){
        if(n==0)
            return accum;
        else{
            return factorial(n-1,n*accum);
        }
    }
}
