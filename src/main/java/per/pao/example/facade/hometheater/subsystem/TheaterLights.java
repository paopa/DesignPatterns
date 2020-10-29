package per.pao.example.facade.hometheater.subsystem;

public class TheaterLights {

    int luminance = 0;

    public void dim(int luminance) {
        this.luminance = luminance;
        System.out.println("TheaterLights dim to " + luminance);
    }

    public void on() {
        System.out.println("TheaterLights on ");
    }
}
