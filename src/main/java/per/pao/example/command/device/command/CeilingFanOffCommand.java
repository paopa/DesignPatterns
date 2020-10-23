package per.pao.example.command.device.command;

import per.pao.example.command.device.item.CeilingFan;

import static per.pao.example.command.device.item.CeilingFan.*;
import static per.pao.example.command.device.item.CeilingFan.LOW;

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;
    private int prevSpeed = OFF;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH:
                ceilingFan.high();
            case MEDIUM:
                ceilingFan.medium();
            case LOW:
                ceilingFan.low();
            case OFF:
                ceilingFan.off();
        }
    }
}
