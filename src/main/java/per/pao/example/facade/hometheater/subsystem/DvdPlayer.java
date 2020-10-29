package per.pao.example.facade.hometheater.subsystem;

public class DvdPlayer {

    private String movie;

    public void on() {
        System.out.println("DvdPlayer on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("DvdPlayer playing movie " + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer stop");
    }

    public void eject() {
        movie = null;
        System.out.println("DvdPlayer eject");
    }

    public void off() {
        System.out.println("DvdPlayer off");
    }
}
