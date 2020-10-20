package per.pao.example.factory.pizza.product.pizza.ny;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.CheesePizza;

public class NYStyleCheesePizza extends CheesePizza {

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
