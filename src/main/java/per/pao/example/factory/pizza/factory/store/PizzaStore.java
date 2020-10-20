package per.pao.example.factory.pizza.factory.store;

import per.pao.example.factory.pizza.product.pizza.base.Pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
