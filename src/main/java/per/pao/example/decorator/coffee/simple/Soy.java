package per.pao.example.decorator.coffee.simple;

import per.pao.example.decorator.coffee.base.Beverage;
import per.pao.example.decorator.coffee.base.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
