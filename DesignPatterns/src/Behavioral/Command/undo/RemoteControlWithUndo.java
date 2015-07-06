package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class RemoteControlWithUndo {
    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];
    Command undoCommand;

    public RemoteControlWithUndo() {
        NoCommand noCommand = new NoCommand();

        for(int i = 0; i < 7; ++i) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }

        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");

        for(int i = 0; i < this.onCommands.length; ++i) {
            stringBuff.append("[slot " + i + "] " + this.onCommands[i].getClass().getName() + "    " + this.offCommands[i].getClass().getName() + "\n");
        }

        stringBuff.append("[undo] " + this.undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}

