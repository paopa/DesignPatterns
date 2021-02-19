package per.pao.example.compound.duck.decorator;

import per.pao.example.compound.duck.Quackable;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int count;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    public static int getQuacks() {
        return count;
    }
}
