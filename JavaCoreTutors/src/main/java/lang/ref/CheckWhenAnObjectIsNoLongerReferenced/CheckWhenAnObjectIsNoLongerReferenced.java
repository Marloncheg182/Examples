package lang.ref.CheckWhenAnObjectIsNoLongerReferenced;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class CheckWhenAnObjectIsNoLongerReferenced {
    private static Object object;

    public static void main(String[] args) {
        object = new Object();

        // Reference queue
        ReferenceQueue<Object> rq = new ReferenceQueue<Object>();

        // Create a new weak reference
        WeakReference<Object> wr = new WeakReference<Object>(object, rq);

        new Thread(runnable).start();
        try {
            while (true){
                Reference<?> r = rq.remove();
                if (r == wr){
                    System.out.println("Object is no longer referenced.");
                }
                break;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Setting an object to null");
                object = null;
                System.out.println("Running garbage collector...");
                Runtime.getRuntime().gc(); // run garbage collector to object
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    };

}
