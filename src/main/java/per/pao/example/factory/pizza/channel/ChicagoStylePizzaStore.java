package per.pao.example.factory.pizza.channel;

import per.pao.example.factory.pizza.simple.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
