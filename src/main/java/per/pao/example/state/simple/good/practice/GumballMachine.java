package per.pao.example.state.simple.good.practice;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    final static int WINNER = 4;

    int state = SOLD_OUT;
    int count = 0;

    public String toString() {
        return String.format("GumballMachine state:%s ,count:%s", state, count);
    }
}
