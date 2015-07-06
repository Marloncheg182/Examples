package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for(int i = 0; i < this.commands.length; ++i) {
            this.commands[i].execute();
        }

    }

    public void undo() {
        for(int i = this.commands.length - 1; i >= 0; --i) {
            this.commands[i].undo();
        }

    }
}
