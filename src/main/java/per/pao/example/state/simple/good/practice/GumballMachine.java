package per.pao.example.state.simple.good.practice;

public class GumballMachine {

    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;
    State winnerState;

    State state;
    int count;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
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
