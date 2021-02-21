package per.pao.example.bridge.tv;

public interface Remote {

    void on();

    void off();
}

class SonyRemoteImpl implements Remote {

    private TV tv;

    public SonyRemoteImpl(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }
}

class PhilipsRemoteImpl implements Remote {

    private TV tv;

    public PhilipsRemoteImpl(TV tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }
}