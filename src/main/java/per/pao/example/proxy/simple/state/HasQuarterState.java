package per.pao.example.proxy.simple.state;



import per.pao.example.proxy.simple.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        machine.setState(machine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && machine.count > 1) {
            machine.setState(machine.winnerState);
        } else {
            machine.setState(machine.soldState);
        }
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
