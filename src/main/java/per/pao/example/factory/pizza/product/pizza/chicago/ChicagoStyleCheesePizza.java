package per.pao.example.factory.pizza.product.pizza.chicago;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza {

    public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
