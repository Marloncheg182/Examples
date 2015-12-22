package Algorithms.Fibonacci;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/16/2015.
 */
public class IterativeFibonacci {
    public static void main(String[] args) {
        long first = 0, second = 1;
        long result;

        Scanner scanner = new Scanner(System.in);

        int iter = scanner.nextInt();
        for (int i = 0; i < iter; i++){
            System.out.println(first + " ");
            result = first + second;
            first = second;
            second = result;
        }
        scanner.close();
    }
}
