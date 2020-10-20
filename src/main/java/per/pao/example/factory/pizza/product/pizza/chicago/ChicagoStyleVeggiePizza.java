package per.pao.example.factory.pizza.product.pizza.chicago;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.VeggiePizza;

public class ChicagoStyleVeggiePizza extends VeggiePizza {

    public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
