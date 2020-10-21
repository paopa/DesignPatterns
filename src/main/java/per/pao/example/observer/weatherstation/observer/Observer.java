package per.pao.example.observer.weatherstation.observer;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
