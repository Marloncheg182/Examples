package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public interface Command {
    void execute();
    void undo();
}
