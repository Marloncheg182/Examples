package ClassesTypes;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class OuterClass {

    private static String name = "OuterClass";
    private int i;
    private int j;
    int k;
    public int l;

    public OuterClass(int i, int j, int k, int l) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }

    public int getI() {
        return i;
    }

    // static nested class
    static class StaticNestedClass {
        private int a;
        protected int b;
        int c;
        public int d;

        public int getA() {
            return a;
        }

        public String getName() {
            return name;
        }

    }

    // Inner class
    class InnerClass {
        private int w;
        protected int x;
        int y;
        public int z;

        public int getW() {
            return w;
        }

        public void setValies() {
            this.w = i;
            this.x = j;
            this.y = k;
            this.z = l;
        }

        @Override
        public String toString() {
            return "w=" + w +
                    ", x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }

        public String getName() {
            return name;
        }
    }

    // Local Class
    public void print(String initial) {
        class Logger {
            String name;

            public Logger(String name) {
                this.name = name;
            }

            public void log(String str){
                System.out.println(this.name + ":" + str);
            }
        }

        Logger logger = new Logger(initial);
        logger.log(name);
        logger.log("" + this.i);
        logger.log("" + this.j);
        logger.log("" + this.k);
        logger.log("" + this.l);
    }

    public String[] getFilesInDit(String dir, final String ext){
        File file = new File(dir);
        String[] fileList = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(ext);
            }
        });
        return fileList;
    }
}
