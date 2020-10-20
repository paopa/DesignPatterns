package per.pao.example.factory.pizza.product.pizza.chicago;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.ClamPizza;

public class ChicagoStyleClamPizza extends ClamPizza {

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
