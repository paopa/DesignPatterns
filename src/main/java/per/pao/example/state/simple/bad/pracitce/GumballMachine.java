package per.pao.example.state.simple.bad.pracitce;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("you can't insert another quarter");
                break;
            case SOLD_OUT:
                System.out.println("you can't insert quarter, the machine is sold out");
                break;
            case SOLD:
                System.out.println("please wait, we're already giving you a gumball");
                break;
            case NO_QUARTER:
                state = HAS_QUARTER;
                System.out.println("you inserted a quarter");
                break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("quarter returned");
                state = NO_QUARTER;
                break;
            case SOLD_OUT:
                System.out.println("you can't eject quarter, you haven't inserted a quarter yet");
                break;
            case SOLD:
                System.out.println("sorry, you already turned the crank");
                break;
            case NO_QUARTER:
                System.out.println("you haven't insert a quarter");
                break;
        }
    }

    public void turnCrank() {
        switch (state) {
            case HAS_QUARTER:
                System.out.println("you turned ...");
                state = SOLD;
                dispense();
                break;
            case SOLD_OUT:
                System.out.println("you turned, but there's no gumball");
                break;
            case SOLD:
                System.out.println("turning twice doesn't get you another gumball!!!");
                break;
            case NO_QUARTER:
                System.out.println("you turned but there's no quarter");
                break;
        }
    }

    private void dispense() {
        switch (state) {
            case HAS_QUARTER:
            case SOLD_OUT:
                System.out.println("no gumball dispensed");
                break;
            case SOLD:
                System.out.println("a gumball comes rolling out the slot");
                count = count - 1;
                if (count == 0) {
                    System.out.println("oops, out of gumballs!");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
                break;
            case NO_QUARTER:
                System.out.println("you ned to pay first");
                break;
        }
    }

    public String toString() {
        return String.format("GumballMachine state:%s ,count:%s", state, count);
    }
}
