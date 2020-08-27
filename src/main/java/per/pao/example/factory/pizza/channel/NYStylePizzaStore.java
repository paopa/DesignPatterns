package per.pao.example.factory.pizza.channel;

import per.pao.example.factory.pizza.simple.base.Pizza;
import per.pao.example.factory.pizza.simple.ny.NYStyleCheesePizza;
import per.pao.example.factory.pizza.simple.ny.NYStyleClamPizza;
import per.pao.example.factory.pizza.simple.ny.NYStylePepperoniPizza;
import per.pao.example.factory.pizza.simple.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new NYStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
