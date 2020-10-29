package per.pao.example.facade.hometheater.subsystem;

public class Projector {

    String mode;

    public void on() {
        System.out.println("Projector on ...");
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Projector in " + mode);
    }

    public void off() {
        System.out.println("Projector off ...");
    }
}
