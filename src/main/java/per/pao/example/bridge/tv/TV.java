package per.pao.example.bridge.tv;

public interface TV {
    void on();

    void off();
}

class SonyTVImpl implements TV {

    @Override
    public void on() {
        System.out.println("Sony TV on");
    }

    @Override
    public void off() {
        System.out.println("Sony TV off");
    }
}

class PhilipsTVImpl implements TV {

    @Override
    public void on() {
        System.out.println("Philips TV on");
    }

    @Override
    public void off() {
        System.out.println("Philips TV off");
    }
}
