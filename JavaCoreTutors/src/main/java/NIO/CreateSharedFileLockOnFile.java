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
public class CreateSharedFileLockOnFile {
    public static void main(String[] args) {

        try {

            File file = new File("fileToLock.dat");

            // Creates a random access file stream to read from, and optionally to write to
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();

            // Acquire an exclusive lock on this channel's file ( block until the region can be
            // locked, this channel is closed, or the invoking thread is interrupted)
            FileLock lock = channel.lock(0, Long.MAX_VALUE, true);

            // Attempts to acquire an exclusive lock on this channel's file (does not block, an
            // invocation always returns immediately, either having acquired a lock on the requested
            // region or having failed to do so.
            try {

                lock = channel.tryLock(0, Long.MAX_VALUE, true);
            }
            catch (OverlappingFileLockException e) {
                // thrown when an attempt is made to acquire a lock on a a file that overlaps
                // a region already locked by the same JVM or when another thread is already
                // waiting to lock an overlapping region of the same file
                System.out.println("Overlapping File Lock Error: " + e.getMessage());
            }

            // tells whether this lock is shared
            boolean isShared = lock.isShared();

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
