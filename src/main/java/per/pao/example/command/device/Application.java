package per.pao.example.command.device;

import per.pao.example.command.device.command.LightOnCommand;
import per.pao.example.command.device.item.Light;
import per.pao.example.command.device.remote.SimpleRemoteController;

public class Application {
    public static void main(String[] args) {
        deviceDemo();
    }

    private static void deviceDemo() {
        SimpleRemoteController remote = new SimpleRemoteController();
        Light room = new Light("room");
        LightOnCommand command1 = new LightOnCommand(room);
        Light toilet = new Light("toilet");
        LightOnCommand command2 = new LightOnCommand(toilet);

        remote.setCommand(command1);
        remote.buttonWasPressed();
        remote.setCommand(command2);
        remote.buttonWasPressed();
    }
}
