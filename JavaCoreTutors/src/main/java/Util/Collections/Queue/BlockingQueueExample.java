package Util.Collections.Queue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by O1e6 <NsN> on 12/17/2015.
 */
public class BlockingQueueExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base directory (e.g. C:/Users/1/Desktop):");
        String dir = input.nextLine();
        System.out.println("Enter keyword (e.g. output): ");
        String keyword = input.nextLine();
        final int FILE_QUEUE_SIZE = 10;
        final int THREADS = 100;
        BlockingQueue<File> blockingQueue = new ArrayBlockingQueue<File>(FILE_QUEUE_SIZE);
        FileEnumerationTask enumerator = new FileEnumerationTask(blockingQueue, new File(dir));
        new Thread(enumerator).start();
        for (int i = 1; i <= THREADS; i++) {
            new Thread(new SearchTask(blockingQueue, keyword)).start();
        }
    }

    static class FileEnumerationTask implements Runnable {
        public static File dumFile = new File("");
        private BlockingQueue<File> blockingQueue;
        private File rootDir;

        public FileEnumerationTask(BlockingQueue<File> blockingQueue, File rootDir) {
            this.blockingQueue = blockingQueue;
            this.rootDir = rootDir;
        }

        @Override
        public void run() {
            try {
                enumerate(rootDir);

                blockingQueue.put(dumFile);
            } catch (InterruptedException ex) {
            }
        }

        public void enumerate(File dir) throws InterruptedException {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    enumerate(file);
                } else {
                    blockingQueue.put(file);
                }
            }
        }
    }

    static class SearchTask implements Runnable {
        public File dumFile = new File("");
        private BlockingQueue<File> queue;
        private String keyword;

        public SearchTask(BlockingQueue<File> queue, String keyword) {
            this.queue = queue;
            this.keyword = keyword;
        }

        @Override
        public void run() {
            try {
                boolean done = false;
                while (!done) {
                    File file = queue.take();
                    if (file == FileEnumerationTask.dumFile){
                        queue.put(file);
                        done = true;
                    }else {
                        search(file);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        public void search(File file) throws IOException{
            Scanner in = new Scanner(new FileInputStream(file));
            int lineNumber = 0;
            while (in.hasNextLine()){
                lineNumber++;
                String line = in.nextLine();
                if (line.contains(keyword)){
                    System.out.printf("%s:%d:%s%n", file.getPath(), lineNumber,line);
                }
            }
            in.close();
        }
    }
}
