package per.pao.example.observer.weatherstation.display;

import per.pao.example.observer.weatherstation.observer.Observer;
import per.pao.example.observer.weatherstation.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private String name;
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject, String name) {
        this.weatherData = subject;
        this.name = name;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("%s Current conditions: %.2f F degrees and %.2f %% humidity\n", name, temperature, humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
