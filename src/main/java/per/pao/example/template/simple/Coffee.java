package per.pao.example.template.simple;

public class Coffee extends CaffeineBeverage {

    private void addSugarAndMilk() {
        System.out.println("adding sugar and milk");
    }

    private void brewCoffeeGrinds() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    boolean canAddOtherCondiments() {
        return false;
    }

    @Override
    protected void addCondiments() {
        addSugarAndMilk();
    }

    @Override
    protected void brew() {
        brewCoffeeGrinds();
    }
}
