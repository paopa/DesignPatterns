package per.pao.example.factory.pizza.factory.store;

import per.pao.example.factory.pizza.factory.ingredient.NYPizzaIngredientFactory;
import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.Pizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStyleCheesePizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStyleClamPizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStylePepperoniPizza;
import per.pao.example.factory.pizza.product.pizza.ny.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new NYStyleClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
