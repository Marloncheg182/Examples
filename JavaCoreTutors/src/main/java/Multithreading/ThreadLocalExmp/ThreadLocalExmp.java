package Multithreading.ThreadLocalExmp;

/**
 * Created by O1e6 <NsN> on 12/4/2015.
 */
public class ThreadLocalExmp {
    public static void main(String[] args) {
        ThreadLocal local = new ThreadLocal();
        Object o = local.get();
        local.set(o);
    }
}
