package IO.PipedReader;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by O1e6 <NsN> on 11/26/2015.
 */
class MyThread extends Thread{
    private PipedReader pr;
    private PipedWriter pw;

    MyThread(String name, PipedReader pr, PipedWriter pw){
        super(name);

        this.pr = pr;
        this.pw = pw;
    }

    @Override
    public void run() {
        try {
            if (getName().equals("Thread 1")){
                for (int cnt = 0; cnt < 15; cnt++){
                    pw.write("Thread 1" + cnt + "n");
                    pw.close();
                }
            }else {
                int item;
                while ((item = pr.read())!=-1){
                    System.out.println((char)item);
                }
                pr.close();
            }
        } catch (IOException e) {
            System.out.println("Exception while execution run method " + e.getMessage());

        }

    }
}

public class PipedThreads{
    public static void main(String[] args)throws Exception{
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);

        MyThread mt1 = new MyThread("MyThread1", pr, pw);
        MyThread mt2 = new MyThread("MyThread2", pr, pw);

        mt1.start();
        Thread.sleep(2000);
        mt2.start();
    }

}
