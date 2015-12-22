package Multithreading.RetVal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by O1e6 <NsN> on 12/4/2015.
 */
public class RetVal {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Double> redouble = service.submit(new RetDouble());
        Future<Integer> retInt = service.submit(new RetInt());

        System.out.println(redouble.get());
        System.out.println(retInt.get());

        service.shutdown();
    }

    static class RetDouble implements Callable<Double> {
        @Override
        public Double call() throws Exception {
            return 2.0;
        }
    }
    static class RetInt implements Callable<Integer>{
        RetInt(){

        }

        @Override
        public Integer call() throws Exception {
            return 1;
        }
    }
}
