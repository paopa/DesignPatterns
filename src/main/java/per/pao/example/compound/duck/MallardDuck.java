package per.pao.example.compound.duck;


import per.pao.example.compound.duck.observer.Observer;
import per.pao.example.compound.duck.observer.QuackObservable;

public class MallardDuck implements Quackable, QuackObservable {

    private final Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
