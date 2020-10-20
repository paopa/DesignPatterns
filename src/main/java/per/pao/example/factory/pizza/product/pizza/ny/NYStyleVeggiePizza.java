package per.pao.example.factory.pizza.product.pizza.ny;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.VeggiePizza;

public class NYStyleVeggiePizza extends VeggiePizza {

    public NYStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
