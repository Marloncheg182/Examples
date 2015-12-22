package Multithreading.DinningPhilosophersDeadlock;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by O1e6 <NsN> on 12/3/2015.
 */
class Spoon{
    private static int cnt = 0;
    private int num = cnt++;

    @Override
    public String toString() {
        return "Spoon " + num;
    }
}
class Philosopher extends Thread{
    private static Random rnd = new Random();
    private static int cnt = 0;
    private int num = cnt++;
    private Spoon leftSpoon;
    private Spoon rightSpoon;
    static int waiting = 0;

    public Philosopher(Spoon left , Spoon right){
        leftSpoon = left;
        rightSpoon = right;
        start();
    }
    public void think(){
        System.out.println(this + " is thinking");
        if (waiting > 0){
            try {
                sleep(rnd.nextInt(waiting));
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
    public void eat(){
        synchronized (leftSpoon){
            System.out.println(this + " has " + this.leftSpoon + " Waiting for " + this.rightSpoon);
            synchronized (rightSpoon){
                System.out.println(this + " eating");
            }
        }
    }

    @Override
    public String toString() {
        return "Philosopher{" + num;
    }

    @Override
    public void run() {
        while (true){
            think();
            eat();
        }
    }
}
public class DiningPhilosophers {
    private static boolean gotoDeadLock = true;

    public static void main(String[] args) {
        Philosopher[] phil = new Philosopher[10];
        Philosopher.waiting = 8;
        Spoon left = new Spoon(), right = new Spoon(), first = left;
        int i = 0;
        while (i < phil.length - 1){
            phil[i++] = new Philosopher(left, right);
            left = right;
            right = new Spoon();
        }
        if (gotoDeadLock){
            phil[i] = new Philosopher(left, first);

        }else {
         phil[i] = new Philosopher(first, left);
        }
        if (args.length >=4){
            int delay = 3;
            if (delay !=0){
                Timeout timeout = new Timeout(delay * 1000 , "Timed  out");
            }
        }
    }

    static class Timeout extends Timer{
        public Timeout(int delay, final String msg){
            super(true);
            schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(msg);
                    System.exit(0);
                }
            }, delay);
        }
    }
}
