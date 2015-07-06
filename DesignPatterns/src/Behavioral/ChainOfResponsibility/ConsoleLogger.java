package Behavioral.ChainOfResponsibility;

/**
 * Created by Dell on 6/20/2015.
 */
public class ConsoleLogger extends  AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.printf("Standard Console::Logger: " + message);
    }
}
