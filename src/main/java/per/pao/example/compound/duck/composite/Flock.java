package per.pao.example.compound.duck.composite;

import per.pao.example.compound.duck.Quackable;
import per.pao.example.compound.duck.observer.Observer;
import per.pao.example.compound.duck.observer.QuackObservable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable, QuackObservable {

    private final List<Quackable> list = new ArrayList<>();
    private final Observable observable;

    public void add(Quackable duck) {
        list.add(duck);
    }

    public Flock() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        list.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
