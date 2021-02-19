package per.pao.example.factory.pizza;

import per.pao.example.factory.pizza.factory.store.ChicagoStylePizzaStore;
import per.pao.example.factory.pizza.factory.store.NYStylePizzaStore;
import per.pao.example.factory.pizza.factory.store.PizzaStore;
import per.pao.example.factory.pizza.product.pizza.base.Pizza;

import static sun.util.locale.LocaleUtils.isEmpty;


public class Application {

    public static void main(String[] args) {
        orderPizza("NY", "pepperoni");
    }

    private static void orderPizza(String factory, String kind) {
        if (isEmpty(factory) || isEmpty(kind)) {
            return;
        }
        PizzaStore pizzaStore;
        switch (factory) {
            case "Chicago":
                pizzaStore = new ChicagoStylePizzaStore();
                break;
            case "NY":
                pizzaStore = new NYStylePizzaStore();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + factory);
        }
        Pizza pizza = pizzaStore.orderPizza(kind);
        System.out.println(pizza);
    }

}
