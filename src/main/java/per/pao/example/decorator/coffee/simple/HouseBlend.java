package per.pao.example.decorator.coffee.simple;

import per.pao.example.decorator.coffee.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
