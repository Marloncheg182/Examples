package ClassesTypes.Object;

import java.lang.ref.*;

/**
 * Created by O1e6 <NsN> on 12/23/2015.
 */
class VeryBig {
    private static final int SIZE = 10000;
    private double[] darray = new double[SIZE];
    private String ident;

    public VeryBig(String id) {
        ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + ident);
    }
}

public class ReferenceObjects {
    private static ReferenceQueue rq = new ReferenceQueue();

    public static void checkQueue() {
        Object obj = rq.poll();
        if (obj != null) {
            System.out.println("In queue: " + (VeryBig) ((Reference) obj).get());
        }
    }

    public static void main(String[] args) {
        int size = 10;

        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        }
        SoftReference[] sa = new SoftReference[size];
        for (int i = 0; i < sa.length; i++) {
            sa[i] = new SoftReference(new VeryBig("Soft " + i), rq);
            System.out.println("Just created: " + (VeryBig) sa[i].get());

            checkQueue();
        }

        WeakReference[] wa = new WeakReference[size];
        for (int i = 0; i < wa.length; i++) {
            wa[i] = new WeakReference(new VeryBig("Weak " + i), rq);
            System.out.println("Just created: " + (VeryBig) wa[i].get());

            checkQueue();
        }

        SoftReference s = new SoftReference(new VeryBig("Soft"));
        WeakReference w = new WeakReference(new VeryBig("Weak"));
        System.gc();

        PhantomReference[]pa = new PhantomReference[size];
        for (int i = 0; i < pa.length; i++){
            pa[i] = new PhantomReference(new VeryBig("Phantom " + i),rq);
            System.out.println("Just created: " + (VeryBig)pa[i].get());
            checkQueue();
        }
    }
}
