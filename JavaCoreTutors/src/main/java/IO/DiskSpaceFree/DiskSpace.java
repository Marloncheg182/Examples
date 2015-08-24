package IO.DiskSpaceFree;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class DiskSpace {
    public static void main(String[] args) {
        File file = new File("g:");
        long totalSpace = file.getTotalSpace();
        long usableSpace = file.getUsableSpace();
        long freeSpace = file.getFreeSpace();

        System.out.println("=== Calculating ===");

        System.out.println(" === in bytes ===");
        System.out.println("Total size : " + totalSpace + " bytes");
        System.out.println("Usable size : " + usableSpace + " bytes");
        System.out.println("Free size : " + freeSpace + " bytes");

        System.out.println(" === in kilobytes ===");
        System.out.println("Total size : " + totalSpace /1024 + " bytes");
        System.out.println("Usable size : " + usableSpace /1024 + " bytes");
        System.out.println("Free size : " + freeSpace /1024 + " bytes");

        System.out.println(" === in megabytes ===");
        System.out.println("Total size : " + totalSpace /1024 /1024 + " bytes");
        System.out.println("Usable size : " + usableSpace /1024 /1024 + " bytes");
        System.out.println("Free size : " + freeSpace /1024 /1024 + " bytes");

        System.out.println(" === in gigabytes ===");
        System.out.println("Total size : " + totalSpace /1024 /1024 /1024 + " gbytes");
        System.out.println("Usable size : " + usableSpace /1024 /1024 /1024 + " gbytes");
        System.out.println("Free size : " + freeSpace /1024 /1024 /1024 + " gbytes");
    }
}
