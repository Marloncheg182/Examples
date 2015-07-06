package Behavioral.ChainOfResponsibility;

/**
 * Created by Dell on 6/20/2015.
 */
public class ErrorLogger extends  AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
