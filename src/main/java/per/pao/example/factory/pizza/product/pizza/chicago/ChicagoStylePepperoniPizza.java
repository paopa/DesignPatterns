package per.pao.example.factory.pizza.product.pizza.chicago;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.PepperoniPizza;

public class ChicagoStylePepperoniPizza extends PepperoniPizza {

    public ChicagoStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
