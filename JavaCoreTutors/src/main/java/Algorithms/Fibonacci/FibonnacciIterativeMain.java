package Algorithms.Fibonacci;

/**
 * Created by Oleg Romanenchuk on 8/20/2015.
 */
public class FibonnacciIterativeMain {
    public static void main(String[] args) {
        System.out.println("Printing Fibonnacci series:");
        int prev=0, next=1;
        System.out.println(prev + " " + next);
        int numberOfElements=10;
        int sum=0;
        for (int i = 2; i <numberOfElements; i++)
        {
            sum=prev+next;
            System.out.println(" "+sum);
            prev = next;
        }
    }
}
