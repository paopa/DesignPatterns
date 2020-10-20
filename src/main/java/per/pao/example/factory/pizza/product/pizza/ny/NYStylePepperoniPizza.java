package per.pao.example.factory.pizza.product.pizza.ny;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.PepperoniPizza;

public class NYStylePepperoniPizza extends PepperoniPizza {

    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
