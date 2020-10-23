package per.pao.example.command.device.item;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.printf("item: %s fan is on %d\n", location, speed);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.printf("item: %s fan is on %d\n", location, speed);
    }

    public void low() {
        speed = LOW;
        System.out.printf("item: %s fan is on %d\n", location, speed);
    }

    public void off() {
        speed = OFF;
        System.out.printf("item: %s fan is off\n", location);
    }

    public int getSpeed() {
        return speed;
    }
}
