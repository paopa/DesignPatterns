package per.pao.example.compound.dock;

import per.pao.example.compound.dock.adapter.Goose;
import per.pao.example.compound.dock.adapter.GooseAdapter;
import per.pao.example.compound.dock.composite.Flock;
import per.pao.example.compound.dock.decorator.QuackCounter;
import per.pao.example.compound.dock.factory.AbstractDuckFactory;
import per.pao.example.compound.dock.factory.CountingDuckFactory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Composite - Flocks");
        Flock flockA = new Flock();
        flockA.add(mallardDuck);
        flockA.add(redheadDuck);
        flockA.add(duckCall);
        flockA.add(rubberDuck);
        flockA.add(gooseDuck);

        Quackable mallardOne = factory.createMallardDuck();
        Quackable mallardTwo = factory.createMallardDuck();
        Quackable mallardThree = factory.createMallardDuck();
        Quackable mallardFour = factory.createMallardDuck();

        Flock flockB = new Flock();
        flockB.add(mallardOne);
        flockB.add(mallardTwo);
        flockB.add(mallardThree);
        flockB.add(mallardFour);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockA);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockB);

        System.out.printf("\nThe ducks quacked %d times\n", QuackCounter.getQuacks());
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.printf("\nThe ducks quacked %d times\n", QuackCounter.getQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
