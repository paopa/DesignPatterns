package per.pao.example.strategy.adventure;

import static java.util.Objects.isNull;

public class Adventurer {
    private final String name;
    private FlightStrategy strategy;

    public Adventurer(String name) {
        this.name = name;
    }

    public void attack() {
        if (isNull(strategy)) {
            strategy = new NormalAttack();
        }
        System.out.print(name + " :");
        strategy.execute();
    }


    public void choiceStrategy(FlightStrategy strategy) {
        this.strategy = strategy;
    }
}
