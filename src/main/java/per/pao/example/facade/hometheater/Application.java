package per.pao.example.facade.hometheater;

import per.pao.example.facade.hometheater.facade.HomeTheaterFacade;
import per.pao.example.facade.hometheater.subsystem.*;

public class Application {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        HomeTheaterFacade homeTheater = prepare();
        homeTheater.watchMovie("Lion King");
        homeTheater.endMovie();
    }

    private static HomeTheaterFacade prepare() {
        return new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper());
    }
}
