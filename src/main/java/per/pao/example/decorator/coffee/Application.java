package per.pao.example.decorator.coffee;

import per.pao.example.decorator.coffee.base.Beverage;
import per.pao.example.decorator.coffee.simple.*;

public class Application {

    public static void main(String[] args) {
        espressoDemo();
        mochaDemo();
        houseBlendDemo();
    }

    private static void houseBlendDemo() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        coffeePrint(beverage.getDescription(), beverage.cost());
    }

    private static void mochaDemo() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        coffeePrint(beverage.getDescription(), beverage.cost());
    }

    private static void espressoDemo() {
        Espresso espresso = new Espresso();
        coffeePrint(espresso.getDescription(), espresso.cost());
    }

    public static void coffeePrint(String description, double cost) {
        System.out.printf("description: %s | cost: $%s \n", description, cost);
    }

}
