package per.pao.example.facade.hometheater.subsystem;

public class Amplifier {

    private int volume;
    private boolean surroundSound;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void setSurroundSound() {
        surroundSound = true;
        System.out.println("Amplifier surround sound on");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier set volume to " + volume);
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
