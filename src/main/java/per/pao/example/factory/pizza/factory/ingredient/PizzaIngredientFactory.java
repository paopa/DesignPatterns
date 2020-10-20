package per.pao.example.factory.pizza.factory.ingredient;

import per.pao.example.factory.pizza.product.ingredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Source createSource();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
