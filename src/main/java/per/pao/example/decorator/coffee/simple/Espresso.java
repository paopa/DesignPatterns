package per.pao.example.decorator.coffee.simple;

import per.pao.example.decorator.coffee.base.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
