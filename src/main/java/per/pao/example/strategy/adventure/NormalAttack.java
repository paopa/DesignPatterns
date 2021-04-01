package per.pao.example.strategy.adventure;

public class NormalAttack implements FlightStrategy {
    @Override
    public void execute() {
        System.out.println("normal attack");
    }
}
