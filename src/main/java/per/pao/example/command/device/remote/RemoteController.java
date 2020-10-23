package per.pao.example.command.device.remote;

import per.pao.example.command.device.command.Command;
import per.pao.example.command.device.command.NoCommand;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[8];
        offCommands = new Command[8];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 8; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer slotCommand = new StringBuffer();
        slotCommand.append("\n---- Remote Control----\n");
        for (int i = 0; i < 8; i++) {
            slotCommand.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getSimpleName()).append("    ")
                    .append(offCommands[i].getClass().getSimpleName()).append("\n");
        }
        return slotCommand.toString();
    }
}
