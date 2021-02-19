package per.pao.example.compound.dock.factory;

import per.pao.example.compound.dock.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
