package per.pao.example.command.device.remote;

import per.pao.example.command.device.command.Command;

public class SimpleRemoteController {
    Command slot;

    public SimpleRemoteController() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
