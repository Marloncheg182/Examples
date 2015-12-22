package Recursion;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class MultipleRecursion {
    public static long fibonacci(long n){
        if (n < 0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        for (int i = 0; i < iter; i++){
            System.out.println(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
