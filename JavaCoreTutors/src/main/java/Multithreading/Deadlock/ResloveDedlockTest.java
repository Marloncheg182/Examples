package Multithreading.Deadlock;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class ResloveDedlockTest {
    public static void main(String[] args) {
        ResloveDedlockTest test = new ResloveDedlockTest();

        final A a = test.new A();
        final B b = test.new B();

        Runnable block1 = new Runnable() {
            public void run() {
                synchronized (a){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (b){
                        System.out.println("In block 1");
                    }
                }
            }
        };
        Runnable block2 = new Runnable() {
            public void run() {
                synchronized (b){
                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (a){
                        System.out.println("In block 2");
                    }
                }
            }
        };
        new Thread(block1).start();
        new Thread(block2).start();
    }
    private class A{
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    private class B{
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
