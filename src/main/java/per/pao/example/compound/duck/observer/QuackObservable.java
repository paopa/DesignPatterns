package per.pao.example.compound.duck.observer;

import java.util.ArrayList;
import java.util.List;

public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();

    class Observable implements QuackObservable {

        private final List<Observer> observers = new ArrayList<>();
        QuackObservable duck;

        public Observable(QuackObservable duck) {
            this.duck = duck;
        }

        @Override
        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void notifyObservers() {
            observers.forEach(observer -> observer.update(duck));
        }
    }
}
