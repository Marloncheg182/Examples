package Util.JavaMessageFormat;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class BasicMessageFormatExample {

    public static boolean isPrime(int n){
        if (n == 2) return true;

        for (int i =2; i <(int)Math.sqrt(n)+1; i++)
            if (n%i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < nums.length; i++){
            nums[i] = rnd.nextInt(100);
        }
        int primes = 0;

        for (int num : nums) {
            if (isPrime(num))primes++;
        }
        String message = "On the test run at {0,time} on {0,date}, we found {1} prime numbers";
        MessageFormat mf = new MessageFormat(message);
        System.out.println(mf.format(new Object[]{new Date(), primes}));
    }
}
