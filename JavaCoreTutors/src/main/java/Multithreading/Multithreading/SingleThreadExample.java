package Multithreading.Multithreading;

/**
 * Created by 1 on 10.11.2015.
 */
public class SingleThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Runnable thread");
            }
        });
        t1.start();

        SecondThreadExample second = new SecondThreadExample();
        second.start();
        Thread third = new Thread(new ThirdThreadExample());
        third.start();

    }

}

class SecondThreadExample extends Thread {
    public void run() {
        System.out.println("Simple task ");
    }
}

class ThirdThreadExample implements Runnable{
    public void run() {
        System.out.println("Third thread task");
    }
}

