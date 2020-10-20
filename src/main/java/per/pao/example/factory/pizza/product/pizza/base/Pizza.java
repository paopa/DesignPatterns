package per.pao.example.factory.pizza.product.pizza.base;

public abstract class Pizza {

    public void prepare() {
        System.out.println("prepare pizza");
    }

    public void bake() {
        System.out.println("bake pizza");
    }

    public void cut() {
        System.out.println("cut pizza");
    }

    public void box() {
        System.out.println("box pizza");
    }
}
