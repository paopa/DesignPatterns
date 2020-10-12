package per.pao.example.factory.pizza;

import per.pao.example.factory.pizza.channel.ChicagoStylePizzaStore;
import per.pao.example.factory.pizza.channel.NYStylePizzaStore;
import per.pao.example.factory.pizza.channel.PizzaStore;

import static sun.util.locale.LocaleUtils.isEmpty;


public class Application {

    public static void main(String[] args) {
        pizzaDemo("Chicago","pepperoni");
    }

    private static void pizzaDemo(String factory, String kind) {
        if(isEmpty(factory) || isEmpty(kind)){
            return;
        }
        PizzaStore pizzaStore;
        switch (factory){
            case "Chicago":
                pizzaStore = new ChicagoStylePizzaStore();
                break;
            case "NY":
                pizzaStore = new NYStylePizzaStore();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + factory);
        }
        pizzaStore.orderPizza(kind);
    }

}
