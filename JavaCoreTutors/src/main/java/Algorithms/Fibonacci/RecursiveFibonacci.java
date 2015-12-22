package Algorithms.Fibonacci;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class RecursiveFibonacci {
    public static long fibonacci(long n){
        if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n < 2)? n : fibonacci(n-1)+ fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers");
        int iter = sc.nextInt();
        for (int i = 0; i< iter; i++){
            System.out.println(fibonacci(i) + " ");
        }
        sc.close();
    }
}
