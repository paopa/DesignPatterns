package per.pao.example.factory.pizza.factory.store;

import per.pao.example.factory.pizza.product.pizza.base.Pizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStyleCheesePizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStyleClamPizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStylePepperoniPizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "clam":
                return new NYStyleClamPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                return null;
        }
    }
}
