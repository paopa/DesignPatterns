package per.pao.example.command.device.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.print("No Command\n");
    }

    @Override
    public void undo() {
        System.out.print("No Command\n");
    }
}
