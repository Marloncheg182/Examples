package Behavioral.Command.simpleremote;

import Behavioral.Command.*;

/**
 * Created by Dell on 6/19/2015.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
