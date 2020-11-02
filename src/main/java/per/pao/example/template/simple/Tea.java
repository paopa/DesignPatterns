package per.pao.example.template.simple;

public class Tea extends CaffeineBeverage {

    private void addLemon() {
        System.out.println("adding lemon");
    }

    private void steepTeaBag() {
        System.out.println("steeping the tea");
    }

    @Override
    void addOtherCondiments() {
        System.out.println("adding other condiments like bubble");
    }

    @Override
    protected void addCondiments() {
        addLemon();
    }

    @Override
    protected void brew() {
        steepTeaBag();
    }
}
