package per.pao.example.command.device;

import per.pao.example.command.device.command.CeilingFanHighCommand;
import per.pao.example.command.device.command.CeilingFanOffCommand;
import per.pao.example.command.device.command.LightOffCommand;
import per.pao.example.command.device.command.LightOnCommand;
import per.pao.example.command.device.item.CeilingFan;
import per.pao.example.command.device.item.Light;
import per.pao.example.command.device.remote.RemoteController;
import per.pao.example.command.device.remote.SimpleRemoteController;

public class Application {
    public static void main(String[] args) {
//        simpleRemoteDemo();
        remoteDemo();
    }

    private static void remoteDemo() {
        RemoteController remote = new RemoteController();
        Light room = new Light("room");
        LightOnCommand openLight = new LightOnCommand(room);
        LightOffCommand closeLight = new LightOffCommand(room);
        CeilingFan kitchen = new CeilingFan("kitchen");
        CeilingFanHighCommand fanHighCommand = new CeilingFanHighCommand(kitchen);
        CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(kitchen);

        // set Command
        remote.setCommand(0, openLight, closeLight);
        remote.setCommand(1, fanHighCommand, fanOffCommand);
        System.out.println(remote.toString());

        // remote
        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
    }

    private static void simpleRemoteDemo() {
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
