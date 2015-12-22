package Concurrency;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class FutureTest {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter directory (e.g. /usr/local/jdk8.0/src): ");
        String dir = input.nextLine();
        System.out.println("Please enter your keyword ");
        String keyword = input.nextLine();

        MatchCounter matchCounter = new MatchCounter(new File(dir), keyword);
        FutureTask task = new FutureTask(matchCounter);
        Thread thread = new Thread(task);
        thread.start();
        try {
            System.out.println(task.get() + " matching files");
        } catch (ExecutionException ee) {
            ee.printStackTrace();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

    static class MatchCounter implements Callable<Integer> {

        private File dir;
        private String keyword;
        private int counter;

        public MatchCounter(File dir, String keyword) {
            this.dir = dir;
            this.keyword = keyword;
        }

        @Override
        public Integer call() throws Exception {
            counter = 0;
            try {
                File[] files = dir.listFiles();
                ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();
                for (File file : files) {
                    if (file.isDirectory()){
                        MatchCounter counter = new MatchCounter(file, keyword);
                        FutureTask<Integer> task = new FutureTask<Integer>(counter);
                        results.add(task);
                        Thread t = new Thread(task);
                        t.start();
                    }else {
                        if (search(file)){
                            counter++;
                        }
                    }
                }
                for (Future<Integer> result : results) {
                    try {
                        counter += result.get();
                    }catch (ExecutionException e){
                        e.printStackTrace();
                    }
                }
            }catch (InterruptedException e){

            }
            return counter;
        }

        private boolean search(File file) {
            try {
                Scanner in = new Scanner(new FileInputStream(file));
                boolean found = false;
                while (!found && in.hasNext()){
                    String line = in.nextLine();
                    if (line.contains(keyword)){
                        found = true;
                    }
                }
                in.close();
                return false;
            }catch (IOException e){
                return false;
            }
        }
    }
}
