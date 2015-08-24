package Algorithms.Fibonacci;

/**
 * Created by Oleg Romanenchuk on 8/20/2015.
 */
public class FibonnacciRecursionMain {
    static int prev=0, next=1;
    static int sum=0;
    public static void main(String[] args) {

        System.out.println("Printing Fibonacci series:");
        System.out.println(prev + " " +next);
        int numberOfElements=10;
        printFibonacciSeries(numberOfElements-2);

    }

    private static void printFibonacciSeries(int numberOfElements) {
        if (numberOfElements==0)
            return;
        else {
            sum=prev+next;
            System.out.println("" + sum);
            prev=next;
            next=sum;
            printFibonacciSeries(numberOfElements-1);
        }
    }


}
