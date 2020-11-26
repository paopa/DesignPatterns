package per.pao.example.state.simple.good.practice;

public class SoldOutState implements State {

    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject quarter, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there's no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
