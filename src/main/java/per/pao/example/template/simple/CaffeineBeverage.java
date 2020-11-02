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
        // hook can implement not thing
    }

    boolean canAddOtherCondiments() {
        // hook can implement not thing
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
