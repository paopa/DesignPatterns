package per.pao.example.observer.weatherstation;

import per.pao.example.observer.weatherstation.display.CurrentConditionsDisplay;
import per.pao.example.observer.weatherstation.subject.WeatherData;

public class Application {
    public static void main(String[] args) {
        weatherStationDemo();
    }

    private static void weatherStationDemo() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4F);
        weatherData.setMeasurements(82,70,29.2F);
        weatherData.setMeasurements(78,90,29.8F);
    }
}
