package per.pao.example.command.device.item;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("item: %s light is on\n", name);
    }

    public void off() {
        System.out.printf("item: %s light is off\n", name);
    }
}
