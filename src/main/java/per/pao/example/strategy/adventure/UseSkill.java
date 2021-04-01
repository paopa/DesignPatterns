package per.pao.example.strategy.adventure;

public class UseSkill implements FlightStrategy {
    @Override
    public void execute() {
        System.out.println("use skill");
    }
}
