package per.pao.example.decorator.coffee.simple;

import per.pao.example.decorator.coffee.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
