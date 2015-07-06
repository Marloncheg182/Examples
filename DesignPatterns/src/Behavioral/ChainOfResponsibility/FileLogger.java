package Behavioral.ChainOfResponsibility;

/**
 * Created by Dell on 6/20/2015.
 */
public class FileLogger extends  AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
