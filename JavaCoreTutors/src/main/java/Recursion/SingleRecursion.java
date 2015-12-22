package Recursion;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class SingleRecursion {
    public static long factorial(int n){
        if (n < 0) throw new IllegalArgumentException("Can't calculate factorial of negative");
        return (n < 2)? 1: n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial of what number do you want to calculate? ");
        int num = scanner.nextInt();
        System.out.printf("%d! = %d", num, factorial(num));
        scanner.close();
    }
}
