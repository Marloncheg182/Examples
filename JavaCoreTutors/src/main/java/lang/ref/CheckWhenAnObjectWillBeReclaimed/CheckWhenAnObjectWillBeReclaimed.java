package lang.ref.CheckWhenAnObjectWillBeReclaimed;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class CheckWhenAnObjectWillBeReclaimed {
    private static Object object;

    public static void main(String[] args) {
        object = new Object();

        ReferenceQueue<Object> rq = new ReferenceQueue<Object>();
        PhantomReference<Object> pr = new PhantomReference<Object>(object, rq);

        new Thread(runnable).start();

        try {
            while (true){
                Reference<?> r = rq.remove();
                if (r == pr){
                    System.out.println("Object is about to be reclaimed");
                    r.clear();
                }
                break;
            }
        }
        catch (InterruptedException e){
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
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    };
}
