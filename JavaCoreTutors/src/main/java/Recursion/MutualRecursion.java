package Recursion;

import java.util.Scanner;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class MutualRecursion {
    public static boolean isOdd(int n){
        if (n < 0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n == 0)? false: isEven(n-1);
    }

    public static boolean isEven(int n){
        if (n < 0) throw new IllegalArgumentException("Can't accept negative arguments");
        return (n == 0)? true : isOdd(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (isEven(num)) System.out.println(num + " is even");
        else System.out.println(num + " is odd");
        scanner.close();
    }
}
