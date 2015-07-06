package Behavioral.Command.remote;

import Behavioral.Command.*;
import Behavioral.Command.remote.NoCommand;

/**
 * Created by Dell on 6/19/2015.
 */
public class RemoteControl {
    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];

    public RemoteControl() {
        NoCommand noCommand = new NoCommand();

        for(int i = 0; i < 7; ++i) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");

        for(int i = 0; i < this.onCommands.length; ++i) {
            stringBuff.append("[slot " + i + "] " + this.onCommands[i].getClass().getName() + "    " + this.offCommands[i].getClass().getName() + "\n");
        }

        return stringBuff.toString();
    }
}
