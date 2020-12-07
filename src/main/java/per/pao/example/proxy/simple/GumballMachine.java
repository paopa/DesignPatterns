package per.pao.example.proxy.simple;

import per.pao.example.proxy.simple.state.*;

public class GumballMachine {

    public State soldOutState;
    public State soldState;
    public State hasQuarterState;
    public State noQuarterState;
    public State winnerState;

    public String location;

    State state;

    public int count;

    public GumballMachine(String location, int numberGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        this.location = location;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }

    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return this.location;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return String.format("GumballMachine state:%s ,count:%s", state, count);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
}
