package per.pao.example.decorator.coffee.simple;

import per.pao.example.decorator.coffee.base.Beverage;
import per.pao.example.decorator.coffee.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
