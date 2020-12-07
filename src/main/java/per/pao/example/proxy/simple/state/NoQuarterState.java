package per.pao.example.proxy.simple.state;


import per.pao.example.proxy.simple.GumballMachine;

public class NoQuarterState implements State {

    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        machine.setState(machine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
}
