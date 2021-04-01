package per.pao.example.strategy.adventure;

public class UseItem implements FlightStrategy{
    @Override
    public void execute() {
        System.out.println("use item");
    }
}
