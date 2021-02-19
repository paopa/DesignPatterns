package per.pao.example.compound.duck;

import per.pao.example.compound.duck.observer.Observer;
import per.pao.example.compound.duck.observer.QuackObservable;

public class DuckCall implements Quackable, QuackObservable {

    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
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
