package per.pao.example.proxy.simple;

public class Application {
    public static void main(String[] args) {
        demo(args);
    }

    private static void demo(String[] args) {
        int count = 0;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            return;
        }
        count = Integer.parseInt(args[1]);
        GumballMachine machine = new GumballMachine(args[0], count);

        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();
    }
}
