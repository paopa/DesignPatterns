package per.pao.example.template.simple;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (canAddOtherCondiments()) {
            addOtherCondiments();
        }
    }

    void addOtherCondiments() {
        // this is a hook method
    }

    boolean canAddOtherCondiments() {
        // this is a hook method
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    void pourInCup() {
        System.out.println("pouring into cup");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }
}
