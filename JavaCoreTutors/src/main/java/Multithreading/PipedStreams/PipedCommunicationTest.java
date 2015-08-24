package Multithreading.PipedStreams;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class PipedCommunicationTest {
    public static void main(String[] args) {
        new PipedCommunicationTest();
    }

    public PipedCommunicationTest() {
        try {
            PipedReader reader = new PipedReader();
            PipedWriter writer = new PipedWriter();

            writer.connect(reader);

            Thread thread1 = new Thread(new PipedReaderThread("Reder", reader));
            Thread thread2 = new Thread(new PipedWriterThread("Writer", writer));
        } catch (Exception e) {
            System.out.println("PipedThread Exception: " + e);
        }
    }

    class PipedReaderThread implements Runnable {
        PipedReader pr;
        String name = null;

        public PipedReaderThread(String name, PipedReader pr) {
            this.name = name;
            this.pr = pr;
        }

        public void run() {
            try {

                while (true) {
                    char c = (char) pr.read();
                    if (c != -1) {
                        System.out.println(c);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    class PipedWriterThread implements Runnable {
        PipedWriter pw;
        String name = null;

        public PipedWriterThread(String name, PipedWriter pw) {
            this.name = name;
            this.pw = pw;
        }

        public void run() {
            try {
                while (true) {
                    // Write some data after every two seconds
                    pw.write("Testing data written...n");
                    pw.flush();
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
                System.out.println(" PipeThread Exception: " + e);
            }
        }
    }
}