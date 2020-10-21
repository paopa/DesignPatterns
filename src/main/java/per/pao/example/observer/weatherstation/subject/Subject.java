package per.pao.example.observer.weatherstation.subject;

import per.pao.example.observer.weatherstation.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
