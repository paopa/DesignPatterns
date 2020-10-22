package per.pao.example.observer.weatherstation;

import per.pao.example.observer.weatherstation.display.CurrentConditionsDisplay;
import per.pao.example.observer.weatherstation.subject.WeatherData;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        weatherStationDemo();
    }

    private static void weatherStationDemo() throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        int i = 0;
        CurrentConditionsDisplay A = new CurrentConditionsDisplay(weatherData, "A");
        while (i < 10) {
            if (i == 3) {
                new CurrentConditionsDisplay(weatherData, "B");
            }
            if (i == 6) {
                weatherData.removeObserver(A);
            }
            weatherData.setMeasurements(generateRandom(32), generateRandom(0), generateRandom(0));
            i++;
            Thread.sleep(2000);
        }

    }

    private static float generateRandom(int adjust) {
        return ((float) Math.random() * 100 + adjust);
    }
}
