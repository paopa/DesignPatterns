package per.pao.example.state.simple.good.practice;

public class SoldState implements State {

    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball!!!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.count == 0) {
            System.out.println("oops, out of gumballs!");
            machine.setState(machine.soldOutState);
        } else {
            machine.setState(machine.noQuarterState);
        }
    }
}
