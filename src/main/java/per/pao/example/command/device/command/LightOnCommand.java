package per.pao.example.command.device.command;

import per.pao.example.command.device.item.Light;

public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
