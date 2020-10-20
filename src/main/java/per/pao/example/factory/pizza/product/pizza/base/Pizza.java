package per.pao.example.factory.pizza.product.pizza.base;

import per.pao.example.factory.pizza.product.ingredient.base.*;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("bake pizza");
    }

    public void cut() {
        System.out.println("cut pizza");
    }

    public void box() {
        System.out.println("box pizza");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name: " + name + "\n " +
                "dough " + dough + "\n " +
                "sauce " + sauce + "\n " +
                "cheese " + cheese + "\n " +
                "pepperoni " + pepperoni + "\n " +
                "clam " + clam + "\n " +
                "veggies" + veggies;
    }
}
