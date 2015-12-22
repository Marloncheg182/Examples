package Recursion;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class TailRecursion {
//    public static int tailFactorial(int n, Object... previous){
//        if (n < 0) ? (int) previous[0]: 1;
//        return (n < 2) ? previous: tailFactorial(n - 1, n* previous);
//    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Factorial of what number do you want to calculate");
        int num = scanner.nextInt();
//        System.out.printf("%d! = %d", num, tailFactorial(num));
        scanner.close();
    }
}
