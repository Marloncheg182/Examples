package NIO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class CreateFileLockOnFile {
    public static void main(String[] args) {

        try {

            File file = new File("fileToLock.dat");

            // Creates a random access file stream to read from, and optionally to write to
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();

            // Acquire an exclusive lock on this channel's file (blocks until lock can be retrieved)
            FileLock lock = channel.lock();

            // Attempts to acquire an exclusive lock on this channel's file (returns null or throws
            // an exception if the file is already locked.
            try {

                lock = channel.tryLock();
            }
            catch (OverlappingFileLockException e) {
                // thrown when an attempt is made to acquire a lock on a a file that overlaps
                // a region already locked by the same JVM or when another thread is already
                // waiting to lock an overlapping region of the same file
                System.out.println("Overlapping File Lock Error: " + e.getMessage());
            }

            // release the lock
            lock.release();

            // close the channel
            channel.close();

        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }
}
