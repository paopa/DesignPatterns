package per.pao.example.factory.pizza;

import per.pao.example.factory.pizza.channel.ChicagoStylePizzaStore;
import per.pao.example.factory.pizza.channel.NYStylePizzaStore;
import per.pao.example.factory.pizza.channel.PizzaStore;

public class Application {

    public static void main(String[] args) {
        pizzaNYDemo();
        pizzaChicagoDemo();
    }

    private static void pizzaChicagoDemo() {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("pepperoni");
    }

    private static void pizzaNYDemo() {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");
    }

}
