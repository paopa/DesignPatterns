package per.pao.example.state.simple.bad.pracitce;

public class Application {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        GumballMachine machine = new GumballMachine(5);

        System.out.println(machine);
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println(machine);
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        System.out.println(machine);
        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
    }
}
