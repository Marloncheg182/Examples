package Multithreading.CountDownLatch;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class Main {
    public static void main(String[] args) {
        boolean result = false;
        try {
            result = ApplicationStartupUtil.checkExternalService();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("External services validation completed !! Result was :: " + result);
    }
}
