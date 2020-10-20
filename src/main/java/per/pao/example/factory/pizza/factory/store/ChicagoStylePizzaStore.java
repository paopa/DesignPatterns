package per.pao.example.factory.pizza.factory.store;

import per.pao.example.factory.pizza.product.pizza.base.Pizza;
import per.pao.example.factory.pizza.product.pizza.chicago.ChicagoStyleCheesePizza;
import per.pao.example.factory.pizza.product.pizza.chicago.ChicagoStyleClamPizza;
import per.pao.example.factory.pizza.product.pizza.chicago.ChicagoStylePepperoniPizza;
import per.pao.example.factory.pizza.product.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return null;
        }
    }
}
